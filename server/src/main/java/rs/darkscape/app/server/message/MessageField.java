package rs.darkscape.app.server.message;

import com.google.protobuf.Descriptors.FieldDescriptor;
import io.netty.buffer.ByteBuf;

public final class MessageField<V> {

  private final FieldType<V> type;
  private final FieldDescriptor descriptor;

  MessageField(FieldType<V> type, FieldDescriptor descriptor) {
    this.type = type;
    this.descriptor = descriptor;
  }

  public FieldDescriptor getDescriptor() {
    return descriptor;
  }

  public V decode(ByteBuf buffer) {
    return type.decode(buffer);
  }

  public void encode(ByteBuf buffer, V value) {
    type.encode(buffer, value);
  }
}
