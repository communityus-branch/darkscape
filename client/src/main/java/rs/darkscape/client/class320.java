package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
public class class320 {

  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 1352233263
  )
  int field3803 = 0;
  @ObfuscatedName("x")
  boolean field3810 = false;
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  AbstractPack field3805;
  @ObfuscatedName("q")
  String field3807;

  @ObfuscatedSignature(
      signature = "(Lir;)V"
  )
  class320(AbstractPack class247_1) {
    this.field3805 = class247_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1415895752"
  )
  void method5995(String string_1) {
    if (string_1 != null && !string_1.isEmpty()) {
      if (string_1 != this.field3807) {
        this.field3807 = string_1;
        this.field3803 = 0;
        this.field3810 = false;
        this.method5985();
      }
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "30"
  )
  int method5985() {
    if (this.field3803 < 25) {
      if (!this.field3805.method4646(class29.field251.field255, this.field3807)) {
        return this.field3803;
      }

      this.field3803 = 25;
    }

    if (this.field3803 == 25) {
      if (!this.field3805.method4646(this.field3807, class29.field262.field255)) {
        return 25 + this.field3805.method4687(this.field3807) * 25 / 100;
      }

      this.field3803 = 50;
    }

    if (this.field3803 == 50) {
      if (this.field3805.method4644(class29.field257.field255, this.field3807) && !this.field3805
          .method4646(class29.field257.field255, this.field3807)) {
        return 50;
      }

      this.field3803 = 75;
    }

    if (this.field3803 == 75) {
      if (!this.field3805.method4646(this.field3807, class29.field254.field255)) {
        return 75;
      }

      this.field3803 = 100;
      this.field3810 = true;
    }

    return this.field3803;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2033116061"
  )
  boolean method5987() {
    return this.field3810;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2104443590"
  )
  int method5988() {
    return this.field3803;
  }

}
