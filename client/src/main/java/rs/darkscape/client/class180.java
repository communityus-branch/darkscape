package rs.darkscape.client;

import java.nio.ByteBuffer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class180 extends class186 {

  @ObfuscatedName("z")
  ByteBuffer field2293;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)[B",
      garbageValue = "-44"
  )
  byte[] vmethod3789() {
    byte[] bytes_1 = new byte[this.field2293.capacity()];
    this.field2293.position(0);
    this.field2293.get(bytes_1);
    return bytes_1;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "339302128"
  )
  void vmethod3792(byte[] bytes_1) {
    this.field2293 = ByteBuffer.allocateDirect(bytes_1.length);
    this.field2293.position(0);
    this.field2293.put(bytes_1);
  }

}
