package rs.darkscape.app.server;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.netty.channel.EventLoopGroup;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServerModule_ProvidesChildGroupFactory implements Factory<EventLoopGroup> {
  private final ServerModule module;

  public ServerModule_ProvidesChildGroupFactory(ServerModule module) {
    this.module = module;
  }

  @Override
  public EventLoopGroup get() {
    return provideInstance(module);
  }

  public static EventLoopGroup provideInstance(ServerModule module) {
    return proxyProvidesChildGroup(module);
  }

  public static ServerModule_ProvidesChildGroupFactory create(ServerModule module) {
    return new ServerModule_ProvidesChildGroupFactory(module);
  }

  public static EventLoopGroup proxyProvidesChildGroup(ServerModule instance) {
    return Preconditions.checkNotNull(
        instance.providesChildGroup(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
