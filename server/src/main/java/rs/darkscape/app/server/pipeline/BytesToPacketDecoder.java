package rs.darkscape.app.server.pipeline;

import static rs.darkscape.app.server.packet.Packet.VARIABLE_LENGTH_BYTE;
import static rs.darkscape.app.server.packet.Packet.VARIABLE_LENGTH_SHORT;
import static rs.darkscape.app.server.pipeline.BytesToPacketDecoder.State.DECODE_IDENTIFIER;
import static rs.darkscape.app.server.pipeline.BytesToPacketDecoder.State.DECODE_LENGTH;
import static rs.darkscape.app.server.pipeline.BytesToPacketDecoder.State.DECODE_PAYLOAD;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import rs.darkscape.app.server.ClientPackets;
import rs.darkscape.app.server.packet.Packet;
import rs.darkscape.app.server.packet.Packet.Descriptor;
import rs.darkscape.app.server.packet.UnsupportedPacketException;
import rs.darkscape.app.server.pipeline.BytesToPacketDecoder.State;

public class BytesToPacketDecoder extends ReplayingDecoder<State> {

  private final Map<Integer, Descriptor> packets;
  private Packet.Descriptor descriptor;
  private int length;

  @Inject
  public BytesToPacketDecoder(@ClientPackets Map<Integer, Descriptor> packets) {
    super(DECODE_IDENTIFIER);
    this.packets = packets;
  }

  @Override
  protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
    switch (state()) {
      case DECODE_IDENTIFIER:
        int id = in.readUnsignedByte();
        descriptor = packets.get(id);
        if (descriptor == null) {
          throw new UnsupportedPacketException("Encountered unsupported packet: " + id + ".");
        }
        checkpoint(DECODE_LENGTH);

      case DECODE_LENGTH:
        switch (length = descriptor.getLength()) {
          case VARIABLE_LENGTH_BYTE:
            length = in.readUnsignedByte();
            break;
          case VARIABLE_LENGTH_SHORT:
            length = in.readUnsignedShort();
            break;
        }
        checkpoint(DECODE_PAYLOAD);

      case DECODE_PAYLOAD:
        out.add(new Packet(descriptor, in.readBytes(length)));
        checkpoint(DECODE_IDENTIFIER);
        break;

      default:
        throw new IllegalStateException();
    }
  }

  enum State {
    DECODE_IDENTIFIER,
    DECODE_LENGTH,
    DECODE_PAYLOAD
  }
}
