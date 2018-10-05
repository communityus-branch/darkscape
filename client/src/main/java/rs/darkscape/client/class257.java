package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class257 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3264;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = 1654146755
  )
  static int field3259;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  static class200 field3260 = new class200(64);
  @ObfuscatedName("s")
  public boolean field3261 = false;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;Lir;I)V",
      garbageValue = "-1839091252"
  )
  public static void method4851(AbstractPack class247_0, AbstractPack class247_1) {
    class260.field3292 = class247_0;
    class260.field3290 = class247_1;
    class260.field3294 = class260.field3292.method4636(3);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "75"
  )
  void method4852(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4854(class182_1, i_2);
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;IS)V",
      garbageValue = "1000"
  )
  void method4854(Buffer class182_1, int i_2) {
    if (i_2 == 2) {
      this.field3261 = true;
    }

  }

}
