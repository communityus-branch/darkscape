package rs.darkscape.app.server;

import com.google.protobuf.Message;
import dagger.BindsInstance;
import dagger.Component;
import io.netty.bootstrap.ServerBootstrap;
import java.util.List;
import java.util.Map;
import javax.inject.Singleton;
import rs.darkscape.app.server.packet.Packet.Descriptor;
import rs.darkscape.app.server.session.SessionManager;

@Component(modules = ServerModule.class)
@Singleton
public interface ServerComponent {

  SessionManager sessions();
  ServerBootstrap bootstrap();

  @ClientPackets Map<Integer, Descriptor> clientPackets();
  @ServerPackets Map<Integer, Descriptor> serverPackets();

  @Component.Builder
  interface Builder {
    @BindsInstance Builder messages(@Messages List<Message> messages);
    ServerComponent build();
  }
}