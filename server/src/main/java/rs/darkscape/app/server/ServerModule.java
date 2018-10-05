package rs.darkscape.app.server;

import dagger.Module;
import dagger.Provides;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import rs.darkscape.app.server.initializer.ServerChannelInitializerComponent;
import rs.darkscape.app.server.message.MessageCodec;
import rs.darkscape.app.server.packet.PacketDescriptorTable;
import rs.darkscape.app.server.session.SessionManager;

@Module(subcomponents = {
    ServerChannelInitializerComponent.class,
})
public final class ServerModule {

  @Provides
  @Singleton
  @Named("parent")
  EventLoopGroup providesParentGroup() {
    return new NioEventLoopGroup();
  }

  @Provides
  @Singleton
  @Named("child")
  EventLoopGroup providesChildGroup() {
    return new NioEventLoopGroup();
  }

  @Provides
  @Singleton
  SessionManager providesSessionManager() {
    return new SessionManager();
  }

  @Provides
  @Singleton
  @Named("inbound")
  PacketDescriptorTable providesInboundPacketsMetadata(ServerConfiguration configuration) {
    return new PacketDescriptorTable();
  }

  @Provides
  @Singleton
  MessageCodec providesMessageCodec() {
    return new MessageCodec();
  }

  @Provides
  @Singleton
  ServerBootstrap providesBootstrap(
      @Named("parent") EventLoopGroup parentGroup,
      @Named("child") EventLoopGroup childGroup,
      Provider<ServerChannelInitializerComponent.Builder> initializer) {
    return new ServerBootstrap()
        .channel(NioServerSocketChannel.class)
        .group(parentGroup, childGroup)
        .childHandler(initializer.get()
                          .build()
                          .initializer());
  }
}