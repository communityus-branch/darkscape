package rs.darkscape.app.server.pipeline;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class DownstreamExceptionHandler extends ChannelHandlerAdapter {

  private static final Logger logger = LoggerFactory.getLogger(DownstreamExceptionHandler.class);

  @Inject
  DownstreamExceptionHandler() {}

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    logger.error("Exception caught downstream", cause);
  }
}
