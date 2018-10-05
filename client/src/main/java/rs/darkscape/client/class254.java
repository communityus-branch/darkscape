package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class254 extends SubNode {

  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 215378471
  )
  public static int field3232;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3231 = new class200(64);
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -740255657
  )
  public int field3230 = 0;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "531410703"
  )
  void method4809(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4810(class182_1, i_2);
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "-13"
  )
  void method4810(Buffer class182_1, int i_2) {
    if (i_2 == 5) {
      this.field3230 = class182_1.getUInt16();
    }

  }

}
