package rs.darkscape.app.server.pipeline;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;
import javax.inject.Inject;

public final class MessageToPacketEncoder extends MessageToMessageEncoder {
  @Inject
  public MessageToPacketEncoder() {}

  @Override
  protected void encode(ChannelHandlerContext ctx, Object msg, List out) throws Exception {

  }
}
