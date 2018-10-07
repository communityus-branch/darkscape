package rs.darkscape.app.server.pipeline;

import com.google.protobuf.Message;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;
import javax.inject.Inject;

public final class MessageToPacketEncoder extends MessageToMessageEncoder<Message> {

  @Inject
  public MessageToPacketEncoder() {
  }

  @Override
  protected void encode(ChannelHandlerContext ctx, Message msg, List<Object> out) throws Exception {

  }
}
