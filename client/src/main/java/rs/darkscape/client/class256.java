package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class256 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  static AbstractPack field3258;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  static class200 field3257 = new class200(64);
  @ObfuscatedName("s")
  public boolean field3256 = false;

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "2142685495"
  )
  void method4848(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4839(class182_1, i_2);
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-1677882054"
  )
  void method4839(Buffer class182_1, int i_2) {
    if (i_2 == 2) {
      this.field3256 = true;
    }

  }

}
