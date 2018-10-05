package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class class287 extends class282 {

  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 1388711563
  )
  public int field3629;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1986288725
  )
  public int field3628 = -1;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -745943211
  )
  public int field3627;

  @ObfuscatedName("ax")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-414916451"
  )
  void method5412(int i_1, int i_2) {
    this.field3628 = i_1;
    this.field3627 = i_2;
  }

  @ObfuscatedName("am")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1524390251"
  )
  public int method5414() {
    return this.field3628;
  }

  @ObfuscatedName("ay")
  @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-34"
  )
  public boolean method5415() {
    return this.field3628 > 0;
  }

}
