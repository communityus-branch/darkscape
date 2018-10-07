package rs.darkscape.app.server;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.ImmutableMap;
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
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import rs.darkscape.app.server.initializer.ServerChannelInitializerComponent;
import rs.darkscape.app.server.packet.Packet;
import rs.darkscape.app.server.packet.Packet.Descriptor;
import rs.darkscape.app.server.session.SessionManager;

@Module(subcomponents = ServerChannelInitializerComponent.class)
public final class ServerModule {

  @Provides
  @Singleton
  @Named("parent")
  EventLoopGroup providesParentLoopGroup() {
    return new NioEventLoopGroup();
  }

  @Provides
  @Singleton
  @Named("child")
  EventLoopGroup providesChildLoopGroup() {
    return new NioEventLoopGroup();
  }

  @Provides
  @Singleton
  SessionManager providesSessionManager() {
    return new SessionManager();
  }

  @Provides
  @Singleton
  @Packets
  List<Descriptor> providesPacketDescriptors(@Messages List<Message> messages) {
    Builder<Packet.Descriptor> descriptors = ImmutableList.builder();
    for (Message message : messages) {
      descriptors.add(Packet.descriptorFor(message));
    }
    return descriptors.build();
  }

  @Provides
  @Singleton
  @ClientPackets
  Map<Integer, Descriptor> providesClientPackets(@Packets List<Packet.Descriptor> packets) {
    ImmutableMap.Builder<Integer, Packet.Descriptor> descriptors = ImmutableMap.builder();
    for (Packet.Descriptor descriptor : packets) {
      switch (descriptor.getSource()) {
        case CLIENT:
          descriptors.put(descriptor.getId(), descriptor);
          break;
        default:
          break;
      }
    }
    return descriptors.build();
  }

  @Provides
  @Singleton
  @ServerPackets
  Map<Integer, Descriptor> providesServerPackets(@Packets List<Packet.Descriptor> packets) {
    ImmutableMap.Builder<Integer, Packet.Descriptor> descriptors = ImmutableMap.builder();
    for (Packet.Descriptor descriptor : packets) {
      switch (descriptor.getSource()) {
        case SERVER:
          descriptors.put(descriptor.getId(), descriptor);
          break;
        default:
          break;
      }
    }
    return descriptors.build();
  }


  @Provides
  @Singleton
  @FieldOrderings
  Map<Descriptors.Descriptor, Set<Integer>> providesFieldOrderings(
      @Messages List<Message> messages) {
    ImmutableMap.Builder<Descriptors.Descriptor, Set<Integer>> orderings = ImmutableMap.builder();
    for (Message message : messages) {
      ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
      for (FieldDescriptor field : message.getDescriptorForType().getFields()) {
        builder.add(field.getNumber());
      }
      orderings.put(message.getDescriptorForType(), builder.build());
    }

    return orderings.build();
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