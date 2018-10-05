package rs.darkscape.app.server.message;

import io.netty.buffer.ByteBuf;

public interface FieldTypeEncoder<V> {
  void encode(ByteBuf buffer, V value);
}
