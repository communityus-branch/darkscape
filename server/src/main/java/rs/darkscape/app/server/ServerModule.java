package rs.darkscape.app.server;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message;
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
import rs.darkscape.app.server.packet.Packet;
import rs.darkscape.app.server.packet.Packet.Descriptor;
import rs.darkscape.app.server.session.SessionManager;

@Module(subcomponents = ServerChannelInitializerComponent.class)
public final class ServerModule {

  @Singleton
  @Provides
  @Named("parent")
  EventLoopGroup providesParentGroup() {
    return new NioEventLoopGroup();
  }

  @Singleton
  @Provides
  @Named("child")
  EventLoopGroup providesChildGroup() {
    return new NioEventLoopGroup();
  }

  @Singleton
  @Provides
  SessionManager providesSessionManager() {
    return new SessionManager();
  }

  @Singleton
  @Provides
  @Named("packets")
  ImmutableList<Descriptor> providesPacketDescriptors(
      @Named("messages") ImmutableList<Message> messages) {
    Builder<Descriptor> descriptors = ImmutableList.builder();
    for (Message message : messages) {
      descriptors.add(new Descriptor(message));
    }
    return descriptors.build();
  }

  @Singleton
  @Provides
  @Named("inbound")
  ImmutableMap<Integer, Packet.Descriptor> providesInboundPacketDescriptors(
      @Named("packets") ImmutableList<Packet.Descriptor> packets) {
    ImmutableMap.Builder<Integer, Packet.Descriptor> descriptors = ImmutableMap.builder();
    for (Packet.Descriptor descriptor : packets) {
      switch (descriptor.getType()) {
        case INBOUND:
          descriptors.put(descriptor.getId(), descriptor);
          break;
        default:
          break;
      }
    }
    return descriptors.build();
  }

  @Singleton
  @Provides
  @Named("orderings")
  ImmutableMap<Descriptors.Descriptor, ImmutableSet<Integer>> providesFieldOrderings(
      @Named("messages") ImmutableList<Message> messages) {
    ImmutableMap.Builder<Descriptors.Descriptor, ImmutableSet<Integer>> orderings
        = ImmutableMap.builder();

    for (Message message : messages) {
      Descriptors.Descriptor descriptor = message.getDescriptorForType();

      ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
      for (FieldDescriptor field : descriptor.getFields()) {
        builder.add(field.getNumber());
      }

      orderings.put(descriptor, builder.build());
    }

    return orderings.build();
  }

  @Singleton
  @Provides
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