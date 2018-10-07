package rs.darkscape.app.server.pipeline;

import com.google.protobuf.Message;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.darkscape.app.server.session.Session;

public final class MessageHandler extends SimpleChannelInboundHandler<Message> {

  private static final Logger logger = LoggerFactory.getLogger(MessageHandler.class);

  @Inject
  public MessageHandler(Session session) { }

  @Override
  protected void channelRead0(ChannelHandlerContext ctx, Message message) {
    logger.info("Received: {}",  message);
  }
}
