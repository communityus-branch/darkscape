package rs.darkscape.app.server.pipeline;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import rs.darkscape.app.server.session.Session;
import rs.darkscape.app.server.session.SessionManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeregisterListener_Factory implements Factory<DeregisterListener> {
  private final Provider<SessionManager> managerProvider;

  private final Provider<Session> sessionProvider;

  public DeregisterListener_Factory(
      Provider<SessionManager> managerProvider, Provider<Session> sessionProvider) {
    this.managerProvider = managerProvider;
    this.sessionProvider = sessionProvider;
  }

  @Override
  public DeregisterListener get() {
    return provideInstance(managerProvider, sessionProvider);
  }

  public static DeregisterListener provideInstance(
      Provider<SessionManager> managerProvider, Provider<Session> sessionProvider) {
    return new DeregisterListener(managerProvider.get(), sessionProvider.get());
  }

  public static DeregisterListener_Factory create(
      Provider<SessionManager> managerProvider, Provider<Session> sessionProvider) {
    return new DeregisterListener_Factory(managerProvider, sessionProvider);
  }

  public static DeregisterListener newDeregisterListener(SessionManager manager, Session session) {
    return new DeregisterListener(manager, session);
  }
}
