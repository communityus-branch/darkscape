package rs.darkscape.app.server.session;

import dagger.internal.Factory;
import io.netty.channel.socket.SocketChannel;
import java.util.UUID;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Session_Factory implements Factory<Session> {
  private final Provider<UUID> uuidProvider;

  private final Provider<SocketChannel> channelProvider;

  public Session_Factory(Provider<UUID> uuidProvider, Provider<SocketChannel> channelProvider) {
    this.uuidProvider = uuidProvider;
    this.channelProvider = channelProvider;
  }

  @Override
  public Session get() {
    return provideInstance(uuidProvider, channelProvider);
  }

  public static Session provideInstance(
      Provider<UUID> uuidProvider, Provider<SocketChannel> channelProvider) {
    return new Session(uuidProvider.get(), channelProvider.get());
  }

  public static Session_Factory create(
      Provider<UUID> uuidProvider, Provider<SocketChannel> channelProvider) {
    return new Session_Factory(uuidProvider, channelProvider);
  }

  public static Session newSession(UUID uuid, SocketChannel channel) {
    return new Session(uuid, channel);
  }
}
