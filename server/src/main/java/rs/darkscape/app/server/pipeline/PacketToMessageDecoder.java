package rs.darkscape.app.server.pipeline;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message.Builder;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import rs.darkscape.app.server.packet.Packet;
import rs.darkscape.proto.PacketOptions;
import rs.darkscape.proto.PacketOptions.FieldOptions;

public final class PacketToMessageDecoder extends MessageToMessageDecoder<Packet> {

  private final ImmutableMap<Descriptor, ImmutableSet<Integer>> orderings;

  @Inject
  public PacketToMessageDecoder(
      @Named("orderings") ImmutableMap<Descriptor, ImmutableSet<Integer>> orderings) {
    this.orderings = orderings;
  }

  @Override
  protected void decode(ChannelHandlerContext ctx, Packet packet, List<Object> out) {
    ImmutableSet<Integer> ordering = orderings.get(packet.getMessageDescriptor());
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

      FieldOptions options = field.getOptions().getExtension(PacketOptions.field);
      if (options == null) {
        throw new NullPointerException("Field is missing type mapping.");
      }

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
