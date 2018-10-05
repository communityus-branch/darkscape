package rs.darkscape.app.server.message;

import io.netty.buffer.ByteBuf;

public interface FieldTypeDecoder<V> {
  V decode(ByteBuf buffer);
}
