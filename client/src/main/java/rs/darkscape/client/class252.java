package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public enum class252 implements class188 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lis;"
  )
  field3224(2, 0),
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lis;"
  )
  field3222(1, 1),
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lis;"
  )
  field3221(0, 2);

  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -71275381
  )
  public final int field3223;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -199100421
  )
  final int field3225;

  class252(int i_3, int i_4) {
    this.field3223 = i_3;
    this.field3225 = i_4;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
  )
  public int vmethod5815() {
    return this.field3225;
  }

}
