package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class259 extends SubNode {

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3282 = new class200(64);
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  static AbstractPack field3283;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 1887824785
  )
  public int field3287;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -1637596643
  )
  public int field3286;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 1884630157
  )
  public int field3281;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 1454643395
  )
  public int field3284;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -299191193
  )
  int field3288 = 0;

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1291543523"
  )
  void method4875() {
    this.method4885(this.field3288);
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "1570676740"
  )
  void method4880(Buffer class182_1, int i_2) {
    while (true) {
      int i_3 = class182_1.getUInt8();
      if (i_3 == 0) {
        return;
      }

      this.method4881(class182_1, i_3, i_2);
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lgk;IIB)V",
      garbageValue = "-45"
  )
  void method4881(Buffer class182_1, int i_2, int i_3) {
    if (i_2 == 1) {
      this.field3288 = class182_1.getUInt24();
    }

  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-82283989"
  )
  void method4885(int i_1) {
    double d_2 = (double) (i_1 >> 16 & 0xff) / 256.0D;
    double d_4 = (double) (i_1 >> 8 & 0xff) / 256.0D;
    double d_6 = (double) (i_1 & 0xff) / 256.0D;
    double d_8 = d_2;
    if (d_4 < d_2) {
      d_8 = d_4;
    }

    if (d_6 < d_8) {
      d_8 = d_6;
    }

    double d_10 = d_2;
    if (d_4 > d_2) {
      d_10 = d_4;
    }

    if (d_6 > d_10) {
      d_10 = d_6;
    }

    double d_12 = 0.0D;
    double d_14 = 0.0D;
    double d_16 = (d_10 + d_8) / 2.0D;
    if (d_8 != d_10) {
      if (d_16 < 0.5D) {
        d_14 = (d_10 - d_8) / (d_10 + d_8);
      }

      if (d_16 >= 0.5D) {
        d_14 = (d_10 - d_8) / (2.0D - d_10 - d_8);
      }

      if (d_10 == d_2) {
        d_12 = (d_4 - d_6) / (d_10 - d_8);
      } else if (d_10 == d_4) {
        d_12 = 2.0D + (d_6 - d_2) / (d_10 - d_8);
      } else if (d_10 == d_6) {
        d_12 = (d_2 - d_4) / (d_10 - d_8) + 4.0D;
      }
    }

    d_12 /= 6.0D;
    this.field3287 = (int) (d_14 * 256.0D);
    this.field3286 = (int) (256.0D * d_16);
    if (this.field3287 < 0) {
      this.field3287 = 0;
    } else if (this.field3287 > 255) {
      this.field3287 = 255;
    }

    if (this.field3286 < 0) {
      this.field3286 = 0;
    } else if (this.field3286 > 255) {
      this.field3286 = 255;
    }

    if (d_16 > 0.5D) {
      this.field3281 = (int) (d_14 * (1.0D - d_16) * 512.0D);
    } else {
      this.field3281 = (int) (512.0D * d_14 * d_16);
    }

    if (this.field3281 < 1) {
      this.field3281 = 1;
    }

    this.field3284 = (int) (d_12 * (double) this.field3281);
  }

}
