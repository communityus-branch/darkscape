package rs.darkscape.app.server.pipeline;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import rs.darkscape.app.server.session.Session;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MessageHandler_Factory implements Factory<MessageHandler> {
  private final Provider<Session> sessionProvider;

  public MessageHandler_Factory(Provider<Session> sessionProvider) {
    this.sessionProvider = sessionProvider;
  }

  @Override
  public MessageHandler get() {
    return provideInstance(sessionProvider);
  }

  public static MessageHandler provideInstance(Provider<Session> sessionProvider) {
    return new MessageHandler(sessionProvider.get());
  }

  public static MessageHandler_Factory create(Provider<Session> sessionProvider) {
    return new MessageHandler_Factory(sessionProvider);
  }

  public static MessageHandler newMessageHandler(Session session) {
    return new MessageHandler(session);
  }
}
