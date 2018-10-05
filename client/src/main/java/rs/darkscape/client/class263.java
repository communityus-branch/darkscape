package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class263 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3322;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3321 = new class200(64);
  @ObfuscatedName("n")
  static int[] field3325;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -738108461
  )
  public int field3320;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 676822163
  )
  public int field3323;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1532826907
  )
  public int field3326;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-1902884964"
  )
  public void method4941(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4942(class182_1, i_2);
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "1481115001"
  )
  void method4942(Buffer class182_1, int i_2) {
    if (i_2 == 1) {
      this.field3320 = class182_1.getUInt16();
      this.field3323 = class182_1.getUInt8();
      this.field3326 = class182_1.getUInt8();
    }

  }

}
