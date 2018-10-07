package rs.darkscape.app.server;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import rs.darkscape.app.server.session.SessionManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServerModule_ProvidesSessionManagerFactory implements Factory<SessionManager> {
  private final ServerModule module;

  public ServerModule_ProvidesSessionManagerFactory(ServerModule module) {
    this.module = module;
  }

  @Override
  public SessionManager get() {
    return provideInstance(module);
  }

  public static SessionManager provideInstance(ServerModule module) {
    return proxyProvidesSessionManager(module);
  }

  public static ServerModule_ProvidesSessionManagerFactory create(ServerModule module) {
    return new ServerModule_ProvidesSessionManagerFactory(module);
  }

  public static SessionManager proxyProvidesSessionManager(ServerModule instance) {
    return Preconditions.checkNotNull(
        instance.providesSessionManager(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
