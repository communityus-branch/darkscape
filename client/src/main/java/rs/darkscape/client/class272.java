package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class272 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  static AbstractPack field3529;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  static class200 field3524 = new class200(64);
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -1227278643
  )
  public int field3533 = 0;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 322304585
  )
  public int field3526 = -1;
  @ObfuscatedName("u")
  public boolean field3523 = true;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 1819527723
  )
  public int field3528 = -1;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -700053543
  )
  public int field3527;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = 2014252323
  )
  public int field3532;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -496210747
  )
  public int field3534;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 119640423
  )
  public int field3525;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = -1975802877
  )
  public int field3530;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 1348598639
  )
  public int field3531;

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2121765043"
  )
  void method5195() {
    if (this.field3528 != -1) {
      this.method5192(this.field3528);
      this.field3527 = this.field3525;
      this.field3532 = this.field3530;
      this.field3534 = this.field3531;
    }

    this.method5192(this.field3533);
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-2042165277"
  )
  void method5194(Buffer class182_1, int i_2) {
    while (true) {
      int i_3 = class182_1.getUInt8();
      if (i_3 == 0) {
        return;
      }

      this.method5191(class182_1, i_3, i_2);
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lgk;III)V",
      garbageValue = "-1678244242"
  )
  void method5191(Buffer class182_1, int i_2, int i_3) {
    if (i_2 == 1) {
      this.field3533 = class182_1.getUInt24();
    } else if (i_2 == 2) {
      this.field3526 = class182_1.getUInt8();
    } else if (i_2 == 5) {
      this.field3523 = false;
    } else if (i_2 == 7) {
      this.field3528 = class182_1.getUInt24();
    } else if (i_2 == 8) {
    }

  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1230983884"
  )
  void method5192(int i_1) {
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

      if (d_2 == d_10) {
        d_12 = (d_4 - d_6) / (d_10 - d_8);
      } else if (d_10 == d_4) {
        d_12 = (d_6 - d_2) / (d_10 - d_8) + 2.0D;
      } else if (d_6 == d_10) {
        d_12 = (d_2 - d_4) / (d_10 - d_8) + 4.0D;
      }
    }

    d_12 /= 6.0D;
    this.field3525 = (int) (256.0D * d_12);
    this.field3530 = (int) (256.0D * d_14);
    this.field3531 = (int) (d_16 * 256.0D);
    if (this.field3530 < 0) {
      this.field3530 = 0;
    } else if (this.field3530 > 255) {
      this.field3530 = 255;
    }

    if (this.field3531 < 0) {
      this.field3531 = 0;
    } else if (this.field3531 > 255) {
      this.field3531 = 255;
    }

  }

}
