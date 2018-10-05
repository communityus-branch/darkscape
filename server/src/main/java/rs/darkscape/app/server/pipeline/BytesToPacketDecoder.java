package rs.darkscape.app.server.pipeline;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import rs.darkscape.app.server.packet.PacketDescriptorTable;

public class BytesToPacketDecoder extends ByteToMessageDecoder {

  private final PacketDescriptorTable packets;

  @Inject
  public BytesToPacketDecoder(@Named("inbound") PacketDescriptorTable packets) {
    this.packets = packets;
  }

  @Override
  protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {

  }
}
