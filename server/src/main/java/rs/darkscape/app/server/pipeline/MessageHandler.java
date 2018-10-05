package rs.darkscape.app.server.pipeline;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javax.inject.Inject;
import rs.darkscape.app.server.session.Session;

public class MessageHandler extends SimpleChannelInboundHandler {

  @Inject
  public MessageHandler(Session session) { }

  @Override
  protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {

  }
}
