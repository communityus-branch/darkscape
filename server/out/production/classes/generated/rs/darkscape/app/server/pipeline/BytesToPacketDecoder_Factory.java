package rs.darkscape.app.server.pipeline;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import rs.darkscape.app.server.packet.PacketDescriptorTable;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BytesToPacketDecoder_Factory implements Factory<BytesToPacketDecoder> {
  private final Provider<PacketDescriptorTable> packetsProvider;

  public BytesToPacketDecoder_Factory(Provider<PacketDescriptorTable> packetsProvider) {
    this.packetsProvider = packetsProvider;
  }

  @Override
  public BytesToPacketDecoder get() {
    return provideInstance(packetsProvider);
  }

  public static BytesToPacketDecoder provideInstance(
      Provider<PacketDescriptorTable> packetsProvider) {
    return new BytesToPacketDecoder(packetsProvider.get());
  }

  public static BytesToPacketDecoder_Factory create(
      Provider<PacketDescriptorTable> packetsProvider) {
    return new BytesToPacketDecoder_Factory(packetsProvider);
  }

  public static BytesToPacketDecoder newBytesToPacketDecoder(PacketDescriptorTable packets) {
    return new BytesToPacketDecoder(packets);
  }
}
