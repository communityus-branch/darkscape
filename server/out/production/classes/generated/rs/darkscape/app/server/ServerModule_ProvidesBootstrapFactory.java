package rs.darkscape.app.server;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import javax.annotation.Generated;
import javax.inject.Provider;
import rs.darkscape.app.server.initializer.ServerChannelInitializerComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServerModule_ProvidesBootstrapFactory implements Factory<ServerBootstrap> {
  private final ServerModule module;

  private final Provider<EventLoopGroup> parentGroupProvider;

  private final Provider<EventLoopGroup> childGroupProvider;

  private final Provider<ServerChannelInitializerComponent.Builder> initializerProvider;

  public ServerModule_ProvidesBootstrapFactory(
      ServerModule module,
      Provider<EventLoopGroup> parentGroupProvider,
      Provider<EventLoopGroup> childGroupProvider,
      Provider<ServerChannelInitializerComponent.Builder> initializerProvider) {
    this.module = module;
    this.parentGroupProvider = parentGroupProvider;
    this.childGroupProvider = childGroupProvider;
    this.initializerProvider = initializerProvider;
  }

  @Override
  public ServerBootstrap get() {
    return provideInstance(module, parentGroupProvider, childGroupProvider, initializerProvider);
  }

  public static ServerBootstrap provideInstance(
      ServerModule module,
      Provider<EventLoopGroup> parentGroupProvider,
      Provider<EventLoopGroup> childGroupProvider,
      Provider<ServerChannelInitializerComponent.Builder> initializerProvider) {
    return proxyProvidesBootstrap(
        module, parentGroupProvider.get(), childGroupProvider.get(), initializerProvider);
  }

  public static ServerModule_ProvidesBootstrapFactory create(
      ServerModule module,
      Provider<EventLoopGroup> parentGroupProvider,
      Provider<EventLoopGroup> childGroupProvider,
      Provider<ServerChannelInitializerComponent.Builder> initializerProvider) {
    return new ServerModule_ProvidesBootstrapFactory(
        module, parentGroupProvider, childGroupProvider, initializerProvider);
  }

  public static ServerBootstrap proxyProvidesBootstrap(
      ServerModule instance,
      EventLoopGroup parentGroup,
      EventLoopGroup childGroup,
      Provider<ServerChannelInitializerComponent.Builder> initializer) {
    return Preconditions.checkNotNull(
        instance.providesBootstrap(parentGroup, childGroup, initializer),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
