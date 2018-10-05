package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class264 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3327;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3328 = new class200(64);
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 916691841
  )
  public int field3330;
  @ObfuscatedName("u")
  public String field3333;
  @ObfuscatedName("q")
  boolean field3332 = true;
  @ObfuscatedName("s")
  char field3331;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "99"
  )
  void method4954() {
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-16"
  )
  void method4948(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4950(class182_1, i_2);
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "-29"
  )
  void method4950(Buffer class182_1, int i_2) {
    if (i_2 == 1) {
      byte b_4 = class182_1.getInt8();
      int i_5 = b_4 & 0xff;
      if (i_5 == 0) {
        throw new IllegalArgumentException("");
      }

      if (i_5 >= 128 && i_5 < 160) {
        char var_6 = class301.field3714[i_5 - 128];
        if (var_6 == 0) {
          var_6 = 63;
        }

        i_5 = var_6;
      }

      char var_3 = (char) i_5;
      this.field3331 = var_3;
    } else if (i_2 == 2) {
      this.field3330 = class182_1.getInt32();
    } else if (i_2 == 4) {
      this.field3332 = false;
    } else if (i_2 == 5) {
      this.field3333 = class182_1.method3738();
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1271827872"
  )
  public boolean method4951() {
    return this.field3331 == 115;
  }

}
