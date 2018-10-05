package rs.darkscape.app.server.pipeline;

import io.netty.channel.ChannelHandlerAdapter;
import javax.inject.Inject;

public final class OutboundExceptionHandler extends ChannelHandlerAdapter {

  @Inject
  OutboundExceptionHandler() {}
}
