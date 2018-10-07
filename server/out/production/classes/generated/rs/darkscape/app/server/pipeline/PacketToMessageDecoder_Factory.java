package rs.darkscape.app.server.pipeline;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import rs.darkscape.app.server.message.MessageCodec;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PacketToMessageDecoder_Factory implements Factory<PacketToMessageDecoder> {
  private final Provider<MessageCodec> codecProvider;

  public PacketToMessageDecoder_Factory(Provider<MessageCodec> codecProvider) {
    this.codecProvider = codecProvider;
  }

  @Override
  public PacketToMessageDecoder get() {
    return provideInstance(codecProvider);
  }

  public static PacketToMessageDecoder provideInstance(Provider<MessageCodec> codecProvider) {
    return new PacketToMessageDecoder(codecProvider.get());
  }

  public static PacketToMessageDecoder_Factory create(Provider<MessageCodec> codecProvider) {
    return new PacketToMessageDecoder_Factory(codecProvider);
  }

  public static PacketToMessageDecoder newPacketToMessageDecoder(MessageCodec codec) {
    return new PacketToMessageDecoder(codec);
  }
}
