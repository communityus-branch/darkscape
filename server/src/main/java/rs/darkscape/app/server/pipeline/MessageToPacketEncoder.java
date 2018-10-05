package rs.darkscape.app.server.pipeline;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;
import javax.inject.Inject;
import rs.darkscape.app.server.message.MessageCodec;
import rs.darkscape.app.server.message.UnsupportedMessageException;
import rs.darkscape.app.server.packet.Packet;
import rs.darkscape.proto.Messages.MessageWrapper;

public final class MessageToPacketEncoder extends MessageToMessageEncoder<MessageWrapper> {

  private final MessageCodec codec;

  @Inject
  public MessageToPacketEncoder(MessageCodec codec) {
    this.codec = codec;
  }

  @Override
  protected void encode(ChannelHandlerContext ctx, MessageWrapper message, List<Object> out) {
    Packet packet = codec.encode(ctx.alloc(), message);
    if (packet == null) {
      throw new UnsupportedMessageException();
    }
    out.add(packet);
  }
}
