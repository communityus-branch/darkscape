package rs.darkscape.app.server;

import dagger.BindsInstance;
import dagger.Component;
import io.netty.bootstrap.ServerBootstrap;
import javax.inject.Singleton;
import rs.darkscape.app.server.session.SessionManager;

@Component(modules = ServerModule.class)
@Singleton
public interface ServerComponent {
  SessionManager sessions();
  ServerBootstrap bootstrap();

  @Component.Builder
  interface Builder {
    @BindsInstance Builder configuration(ServerConfiguration configuration);
    ServerComponent build();
  }
}