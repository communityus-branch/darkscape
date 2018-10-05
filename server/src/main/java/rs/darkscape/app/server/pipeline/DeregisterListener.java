package rs.darkscape.app.server.pipeline;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import javax.inject.Inject;
import rs.darkscape.app.server.session.Session;
import rs.darkscape.app.server.session.SessionManager;

public final class DeregisterListener implements ChannelFutureListener {

  private final SessionManager manager;
  private final Session session;

  @Inject
  public DeregisterListener(SessionManager manager, Session session) {
    this.manager = manager;
    this.session = session;
  }

  @Override
  public void operationComplete(ChannelFuture future) {
    manager.unregister(session.getUUID());
  }
}
