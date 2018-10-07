package rs.darkscape.app.server;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.netty.channel.EventLoopGroup;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServerModule_ProvidesParentGroupFactory implements Factory<EventLoopGroup> {
  private final ServerModule module;

  public ServerModule_ProvidesParentGroupFactory(ServerModule module) {
    this.module = module;
  }

  @Override
  public EventLoopGroup get() {
    return provideInstance(module);
  }

  public static EventLoopGroup provideInstance(ServerModule module) {
    return proxyProvidesParentGroup(module);
  }

  public static ServerModule_ProvidesParentGroupFactory create(ServerModule module) {
    return new ServerModule_ProvidesParentGroupFactory(module);
  }

  public static EventLoopGroup proxyProvidesParentGroup(ServerModule instance) {
    return Preconditions.checkNotNull(
        instance.providesParentGroup(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
