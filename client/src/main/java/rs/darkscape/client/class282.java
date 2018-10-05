package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
public class class282 implements Comparable {

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lkm;"
  )
  class291 field3610;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lkm;"
  )
  class291 field3611;

  @ObfuscatedName("ab")
  @ObfuscatedSignature(
      signature = "(I)Lkm;",
      garbageValue = "-1680166277"
  )
  public class291 method5287() {
    return this.field3610;
  }

  @ObfuscatedName("aw")
  @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "109"
  )
  public String method5288() {
    return this.field3610 == null ? "" : this.field3610.method5447();
  }

  @ObfuscatedName("ak")
  @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-92"
  )
  public String method5289() {
    return this.field3611 == null ? "" : this.field3611.method5447();
  }

  @ObfuscatedName("as")
  @ObfuscatedSignature(
      signature = "(Lkm;Lkm;I)V",
      garbageValue = "224434676"
  )
  void method5290(class291 class291_1, class291 class291_2) {
    if (class291_1 == null) {
      throw new NullPointerException();
    } else {
      this.field3610 = class291_1;
      this.field3611 = class291_2;
    }
  }

  @ObfuscatedName("an")
  @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "97"
  )
  public int vmethod5453(class282 class282_1) {
    return this.field3610.method5435(class282_1.field3610);
  }

  public int compareTo(Object object_1) {
    return this.vmethod5453((class282) object_1);
  }

}
