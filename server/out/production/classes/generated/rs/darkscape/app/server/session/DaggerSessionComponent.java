package rs.darkscape.app.server.session;

import dagger.internal.Preconditions;
import io.netty.channel.socket.SocketChannel;
import java.util.UUID;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerSessionComponent implements SessionComponent {
  private UUID uuid;

  private SocketChannel socketChannel;

  private DaggerSessionComponent(Builder builder) {
    initialize(builder);
  }

  public static SessionComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.uuid = builder.uuid;
    this.socketChannel = builder.socketChannel;
  }

  @Override
  public Session session() {
    return new Session(uuid, socketChannel);
  }

  private static final class Builder implements SessionComponent.Builder {
    private UUID uuid;

    private SocketChannel socketChannel;

    @Override
    public SessionComponent builder() {
      if (uuid == null) {
        throw new IllegalStateException(UUID.class.getCanonicalName() + " must be set");
      }
      if (socketChannel == null) {
        throw new IllegalStateException(SocketChannel.class.getCanonicalName() + " must be set");
      }
      return new DaggerSessionComponent(this);
    }

    @Override
    public Builder uuid(UUID uuid) {
      this.uuid = Preconditions.checkNotNull(uuid);
      return this;
    }

    @Override
    public Builder socketChannel(SocketChannel channel) {
      this.socketChannel = Preconditions.checkNotNull(channel);
      return this;
    }
  }
}
