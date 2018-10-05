package rs.darkscape.app.server.session;

import io.netty.channel.socket.SocketChannel;
import java.util.UUID;
import javax.inject.Inject;

public final class Session {

  private final UUID uuid;
  private final SocketChannel channel;

  @Inject
  Session(UUID uuid, SocketChannel channel) {
    this.uuid = uuid;
    this.channel = channel;
  }

  public UUID getUUID() {
    return uuid;
  }
}
