package rs.darkscape.app.server;

import com.google.common.collect.ImmutableList;
import com.google.protobuf.Message;
import dagger.BindsInstance;
import dagger.Component;
import io.netty.bootstrap.ServerBootstrap;
import javax.inject.Named;
import javax.inject.Singleton;
import rs.darkscape.app.server.session.SessionManager;

@Component(modules = ServerModule.class)
@Singleton
public interface ServerComponent {

  SessionManager sessions();
  ServerBootstrap bootstrap();

  @Component.Builder
  interface Builder {
    @BindsInstance Builder messages(@Named("messages") ImmutableList<Message> messages);
    ServerComponent build();
  }
}