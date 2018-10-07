package rs.darkscape.app.server.initializer;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Provider;
import rs.darkscape.app.server.pipeline.PipelineComponent;
import rs.darkscape.app.server.session.DaggerSessionComponent;
import rs.darkscape.app.server.session.Session;
import rs.darkscape.app.server.session.SessionManager;

public final class ServerChannelInitializer extends ChannelInitializer<SocketChannel> {

  private final SessionManager sessions;
  private final Provider<PipelineComponent.Builder> pipelineProvider;

  @Inject
  ServerChannelInitializer(SessionManager sessions,
                           Provider<PipelineComponent.Builder> pipelineProvider) {
    this.sessions = sessions;
    this.pipelineProvider = pipelineProvider;
  }

  @Override
  protected void initChannel(SocketChannel ch) {
    Session session = DaggerSessionComponent.builder()
                                            .uuid(UUID.randomUUID())
                                            .socketChannel(ch)
                                            .builder()
                                            .session();

    PipelineComponent pipeline = pipelineProvider.get()
                                                 .session(session)
                                                 .build();

    ch.pipeline()
      .addLast(pipeline.downstreamExceptionHandler())
      .addLast(pipeline.bytesToPacketDecoder())
      .addLast(pipeline.packetToBytesEncoder())
      .addLast(pipeline.packetToMessageDecoder())
      .addLast(pipeline.messageToPacketEncoder())
      .addLast(pipeline.messageHandler())
      .addLast(pipeline.upstreamExceptionHandler());

    ch.closeFuture().addListener(pipeline.deregisterListener());

    sessions.register(session);
  }
}
