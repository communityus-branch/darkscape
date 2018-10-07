package rs.darkscape.app.server.initializer;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import rs.darkscape.app.server.pipeline.PipelineComponent;
import rs.darkscape.app.server.session.SessionManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServerChannelInitializer_Factory implements Factory<ServerChannelInitializer> {
  private final Provider<SessionManager> sessionsProvider;

  private final Provider<PipelineComponent.Builder> pipelineProvider;

  public ServerChannelInitializer_Factory(
      Provider<SessionManager> sessionsProvider,
      Provider<PipelineComponent.Builder> pipelineProvider) {
    this.sessionsProvider = sessionsProvider;
    this.pipelineProvider = pipelineProvider;
  }

  @Override
  public ServerChannelInitializer get() {
    return provideInstance(sessionsProvider, pipelineProvider);
  }

  public static ServerChannelInitializer provideInstance(
      Provider<SessionManager> sessionsProvider,
      Provider<PipelineComponent.Builder> pipelineProvider) {
    return new ServerChannelInitializer(sessionsProvider.get(), pipelineProvider);
  }

  public static ServerChannelInitializer_Factory create(
      Provider<SessionManager> sessionsProvider,
      Provider<PipelineComponent.Builder> pipelineProvider) {
    return new ServerChannelInitializer_Factory(sessionsProvider, pipelineProvider);
  }

  public static ServerChannelInitializer newServerChannelInitializer(
      SessionManager sessions, Provider<PipelineComponent.Builder> pipelineProvider) {
    return new ServerChannelInitializer(sessions, pipelineProvider);
  }
}
