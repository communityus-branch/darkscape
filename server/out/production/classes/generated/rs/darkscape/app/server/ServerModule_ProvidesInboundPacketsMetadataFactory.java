package rs.darkscape.app.server;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import rs.darkscape.app.server.packet.PacketDescriptorTable;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServerModule_ProvidesInboundPacketsMetadataFactory
    implements Factory<PacketDescriptorTable> {
  private final ServerModule module;

  private final Provider<ServerConfiguration> configurationProvider;

  public ServerModule_ProvidesInboundPacketsMetadataFactory(
      ServerModule module, Provider<ServerConfiguration> configurationProvider) {
    this.module = module;
    this.configurationProvider = configurationProvider;
  }

  @Override
  public PacketDescriptorTable get() {
    return provideInstance(module, configurationProvider);
  }

  public static PacketDescriptorTable provideInstance(
      ServerModule module, Provider<ServerConfiguration> configurationProvider) {
    return proxyProvidesInboundPacketsMetadata(module, configurationProvider.get());
  }

  public static ServerModule_ProvidesInboundPacketsMetadataFactory create(
      ServerModule module, Provider<ServerConfiguration> configurationProvider) {
    return new ServerModule_ProvidesInboundPacketsMetadataFactory(module, configurationProvider);
  }

  public static PacketDescriptorTable proxyProvidesInboundPacketsMetadata(
      ServerModule instance, ServerConfiguration configuration) {
    return Preconditions.checkNotNull(
        instance.providesInboundPacketsMetadata(configuration),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
