package rs.darkscape.app.server.message;

import com.google.protobuf.Message;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import java.util.List;
import java.util.function.Supplier;
import rs.darkscape.app.server.packet.Packet;
import rs.darkscape.app.server.packet.PacketDescriptor;

public final class MessageMapping {

  private final PacketDescriptor packetDescriptor;
  private final Supplier<Message.Builder> builders;
  private final List<MessageField> fields;

  public MessageMapping(PacketDescriptor packetDescriptor,
                        Supplier<Message.Builder> builders,
                        List<MessageField> fields) {
    this.packetDescriptor = packetDescriptor;
    this.builders = builders;
    this.fields = fields;
  }

  public Message decode(ByteBuf buffer) {
    Message.Builder builder = builders.get();
    for (MessageField field : fields) {
      builder.setField(field.getDescriptor(), field.decode(buffer));
    }
    return builder.build();
  }

  @SuppressWarnings("unchecked")
  public Packet encode(ByteBufAllocator allocator, Message message) {
    ByteBuf buffer = allocator.buffer();
    for (MessageField field : fields) {
      field.encode(buffer, message.getField(field.getDescriptor()));
    }
    return new Packet(packetDescriptor, buffer);
  }
}