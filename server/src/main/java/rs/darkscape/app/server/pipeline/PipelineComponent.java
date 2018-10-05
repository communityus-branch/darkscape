package rs.darkscape.app.server.pipeline;

import dagger.BindsInstance;
import dagger.Subcomponent;
import rs.darkscape.app.server.session.Session;

@Subcomponent
public interface PipelineComponent {
  OutboundExceptionHandler outboundExceptionHandler();
  BytesToPacketDecoder bytesToPacketDecoder();
  PacketToBytesEncoder packetToBytesEncoder();
  PacketToMessageDecoder packetToMessageDecoder();
  MessageToPacketEncoder messageToPacketEncoder();
  MessageHandler messageHandler();
  DeregisterListener deregisterListener();

  @Subcomponent.Builder
  interface Builder {
    @BindsInstance Builder session(Session session);
    PipelineComponent build();
  }
}
