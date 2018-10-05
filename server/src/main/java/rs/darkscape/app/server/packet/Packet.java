package rs.darkscape.app.server.packet;

import io.netty.buffer.ByteBuf;

public final class Packet {

  private final PacketDescriptor descriptor;
  private final ByteBuf buffer;

  public Packet(PacketDescriptor descriptor, ByteBuf buffer) {
    this.descriptor = descriptor;
    this.buffer = buffer;
  }

  public PacketDescriptor getDescriptor() {
    return descriptor;
  }

  public ByteBuf getBuffer() {
    return buffer;
  }
}
