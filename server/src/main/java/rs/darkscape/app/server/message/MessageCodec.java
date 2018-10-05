package rs.darkscape.app.server.message;

import static java.lang.String.format;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message;
import io.netty.buffer.ByteBufAllocator;
import java.util.HashMap;
import java.util.Map;
import rs.darkscape.app.server.packet.Packet;
import rs.darkscape.app.server.packet.PacketDescriptor;
import rs.darkscape.proto.Messages.MessageWrapper;

public final class MessageCodec {

  private final Map<PacketDescriptor, MessageMapping>
      packetDescriptorToMapping = new HashMap<>();
  
  private final Map<Descriptors.Descriptor, MessageMapping>
      messageDescriptorToMapping = new HashMap<>();

  public MessageCodec() {
  }

  public MessageWrapper decode(Packet packet) {
    MessageMapping mapping = packetDescriptorToMapping.get(packet.getDescriptor());
    if (mapping == null) {
      return null;
    }
    return wrap(mapping.decode(packet));
  }

  public Packet encode(ByteBufAllocator allocator, MessageWrapper message) {
    MessageMapping mapping = messageDescriptorToMapping.get(message.getDescriptorForType());
    if (mapping == null) {
      return null;
    }
    return mapping.encode(allocator, message);
  }

  private static MessageWrapper wrap(Message message) {
    MessageWrapper.Builder builder = MessageWrapper.newBuilder();
    Descriptor descriptor = MessageWrapper.getDescriptor();
    for (FieldDescriptor field : descriptor.getFields()) {
      switch (field.getType()) {
        case MESSAGE:
          if (!field.getMessageType().equals(message.getDescriptorForType())) {
            continue;
          }
          builder.setField(field, message);
          return builder.build();
      }
    }
    throw new IllegalArgumentException();
  }

}
