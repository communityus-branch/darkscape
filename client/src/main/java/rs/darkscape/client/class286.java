package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class286 extends class282 {

  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 399210531
  )
  int field3624;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lkx;I)I",
      garbageValue = "2142390446"
  )
  int method5406(class286 class286_1) {
    return this.field3624 - class286_1.field3624;
  }

  @ObfuscatedName("an")
  @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "97"
  )
  public int vmethod5453(class282 class282_1) {
    return this.method5406((class286) class282_1);
  }

  public int compareTo(Object object_1) {
    return this.method5406((class286) object_1);
  }

}
