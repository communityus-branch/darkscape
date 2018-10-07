package rs.darkscape.app.server.pipeline;

import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message.Builder;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import rs.darkscape.app.server.FieldOrderings;
import rs.darkscape.app.server.packet.Packet;
import rs.darkscape.proto.Mappings;
import rs.darkscape.proto.Mappings.PacketFieldOptions;

public final class PacketToMessageDecoder extends MessageToMessageDecoder<Packet> {

  private final Map<Descriptor, Set<Integer>> orderings;

  @Inject
  PacketToMessageDecoder(@FieldOrderings Map<Descriptor, Set<Integer>> orderings) {
    this.orderings = orderings;
  }

  @Override
  protected void decode(ChannelHandlerContext ctx, Packet packet, List<Object> out) {
    Set<Integer> ordering = orderings.get(packet.getMessageDescriptor());
    if (ordering == null) {
      throw new NullPointerException("Expecting ordering for message to be non-null.");
    }

    Builder builder = packet.getMessage().newBuilderForType();

    Descriptor descriptor = packet.getMessageDescriptor();
    for (int number : ordering) {
      FieldDescriptor field = descriptor.findFieldByNumber(number);
      if (field == null) {
        throw new NullPointerException("Ordering referred to field that does not exist.");
      }

      if (!field.getOptions().hasExtension(Mappings.field)) {
        throw new NullPointerException("Field is missing mappings.");
      }

      PacketFieldOptions options = field.getOptions().getExtension(Mappings.field);

      ByteBuf buffer = packet.getBuffer();
      switch (options.getType()) {
        case INT8:
          builder.setField(field, buffer.readByte());
          break;

        case INT16:
          builder.setField(field, buffer.readShort());
          break;

        case INT32:
          builder.setField(field, buffer.readInt());
          break;

        case INT64:
          builder.setField(field, buffer.readLong());
          break;

        default:
          throw new UnsupportedOperationException("Unsupported mapping type.");
      }
    }

    out.add(builder.build());
  }
}
