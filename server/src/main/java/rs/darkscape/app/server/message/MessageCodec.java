package rs.darkscape.app.server.message;

import io.netty.buffer.ByteBufAllocator;
import rs.darkscape.app.server.packet.Packet;
import rs.darkscape.proto.Messages.MessageWrapper;

public final class MessageCodec {

  public MessageCodec() {}

  public MessageWrapper decode(Packet packet) {
    return null;
  }

  public Packet encode(ByteBufAllocator allocator, MessageWrapper message) {
    return null;
  }
}
