package rs.darkscape.app.server.message;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Message;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
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

  private static <M extends Message> Descriptors.Descriptor getDescriptor(
      Class<M> messageClass) throws Throwable {

    MethodHandles.Lookup lookup = MethodHandles.lookup();
    MethodHandle handler = lookup.findStatic(messageClass,
                                             "getDescriptor",
                                             MethodType.methodType(Descriptor.class));
    return (Descriptor) handler.invoke();
  }

  @SuppressWarnings("unchecked")
  private static <M extends Message, B extends Message.Builder> Supplier<B> getBuilderSupplier(
      Class<M> messageClass,
      Class<B> builderClass) throws Throwable {

    MethodHandles.Lookup lookup = MethodHandles.lookup();

    MethodType methodType = MethodType.methodType(Object.class);
    MethodType actualMethodType = MethodType.methodType(builderClass);
    MethodType invokedType = MethodType.methodType(Supplier.class);

    CallSite site = LambdaMetafactory.metafactory(lookup,
                                                  "get",
                                                  invokedType,
                                                  methodType,
                                                  lookup.findStatic(messageClass,
                                                                    "newBuilder",
                                                                    actualMethodType),
                                                  methodType);
    MethodHandle handle = site.getTarget();
    return (Supplier<B>) handle.invoke();
  }

  public Message decode(Packet buffer) {
    Message.Builder builder = builders.get();
    for (MessageField field : fields) {
      builder.setField(field.getDescriptor(), field.decode(buffer.getBuffer()));
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