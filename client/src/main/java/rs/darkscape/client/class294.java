package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.util.Time;

@ObfuscatedName("ky")
public class class294 extends class209 {

  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 796810475
  )
  public int field3665 = (int) (Time.currentTimeMillis() / 1000L);
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lkm;"
  )
  public class291 field3662;
  @ObfuscatedName("u")
  public short field3664;

  @ObfuscatedSignature(
      signature = "(Lkm;I)V"
  )
  class294(class291 class291_1, int i_2) {
    this.field3662 = class291_1;
    this.field3664 = (short) i_2;
  }

}
