package rs.darkscape.app.server.pipeline;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.inject.Inject;
import rs.darkscape.app.server.packet.Packet;

public class PacketToMessageDecoder extends MessageToByteEncoder<Packet> {

  @Inject
  public PacketToMessageDecoder() {}

  @Override
  protected void encode(ChannelHandlerContext ctx, Packet msg, ByteBuf out) throws Exception {

  }
}
