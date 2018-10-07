package rs.darkscape.app.server.pipeline;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PacketToBytesEncoder_Factory implements Factory<PacketToBytesEncoder> {
  private static final PacketToBytesEncoder_Factory INSTANCE = new PacketToBytesEncoder_Factory();

  @Override
  public PacketToBytesEncoder get() {
    return provideInstance();
  }

  public static PacketToBytesEncoder provideInstance() {
    return new PacketToBytesEncoder();
  }

  public static PacketToBytesEncoder_Factory create() {
    return INSTANCE;
  }

  public static PacketToBytesEncoder newPacketToBytesEncoder() {
    return new PacketToBytesEncoder();
  }
}
