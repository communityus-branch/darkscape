package rs.darkscape.app.server.pipeline;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;
import javax.inject.Inject;
import rs.darkscape.app.server.message.MessageCodec;
import rs.darkscape.app.server.packet.Packet;
import rs.darkscape.app.server.packet.UnsupportedPacketException;
import rs.darkscape.proto.Messages.MessageWrapper;

public final class PacketToMessageDecoder extends MessageToMessageEncoder<Packet> {

  private final MessageCodec codec;

  @Inject
  public PacketToMessageDecoder(MessageCodec codec) {
    this.codec = codec;
  }

  @Override
  protected void encode(ChannelHandlerContext ctx, Packet packet, List<Object> out) throws Exception {
    MessageWrapper message = codec.decode(packet);
    if (message == null) {
      throw new UnsupportedPacketException();
    }
    out.add(message);
  }
}
