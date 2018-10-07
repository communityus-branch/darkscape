package rs.darkscape.app.server;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import rs.darkscape.app.server.message.MessageCodec;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServerModule_ProvidesMessageCodecFactory implements Factory<MessageCodec> {
  private final ServerModule module;

  public ServerModule_ProvidesMessageCodecFactory(ServerModule module) {
    this.module = module;
  }

  @Override
  public MessageCodec get() {
    return provideInstance(module);
  }

  public static MessageCodec provideInstance(ServerModule module) {
    return proxyProvidesMessageCodec(module);
  }

  public static ServerModule_ProvidesMessageCodecFactory create(ServerModule module) {
    return new ServerModule_ProvidesMessageCodecFactory(module);
  }

  public static MessageCodec proxyProvidesMessageCodec(ServerModule instance) {
    return Preconditions.checkNotNull(
        instance.providesMessageCodec(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
