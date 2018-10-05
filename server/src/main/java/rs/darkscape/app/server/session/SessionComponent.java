package rs.darkscape.app.server.session;

import dagger.BindsInstance;
import dagger.Component;
import io.netty.channel.socket.SocketChannel;
import java.util.UUID;

@Component
public interface SessionComponent {
  Session session();

  @Component.Builder
  interface Builder {
    @BindsInstance Builder uuid(UUID uuid);
    @BindsInstance Builder socketChannel(SocketChannel channel);
    SessionComponent builder();
  }
}
