package rs.darkscape.app.server.pipeline;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;
import javax.inject.Inject;
import rs.darkscape.app.server.packet.Packet;

public class PacketToBytesEncoder extends MessageToMessageEncoder<Packet> {

  @Inject
  public PacketToBytesEncoder() {}

  @Override
  protected void encode(ChannelHandlerContext ctx, Packet msg, List<Object> out) throws Exception {

  }
}
