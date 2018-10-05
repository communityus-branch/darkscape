package rs.darkscape.app.server.message;

import io.netty.buffer.ByteBuf;

public interface FieldType<V> {
  V decode(ByteBuf buffer);
  void encode(ByteBuf buffer, V value);
}
