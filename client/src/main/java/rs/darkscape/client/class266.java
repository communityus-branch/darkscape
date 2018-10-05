package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class class266 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3338;
  @ObfuscatedName("bi")
  @ObfuscatedSignature(
      signature = "Lid;"
  )
  static class243 field3346;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  static class200 field3342 = new class200(64);
  @ObfuscatedName("u")
  public String field3340 = "null";
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 689327517
  )
  public int field3345 = 0;
  @ObfuscatedName("s")
  public char field3336;
  @ObfuscatedName("l")
  public char field3337;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -1596194807
  )
  public int field3341;
  @ObfuscatedName("i")
  public int[] field3343;
  @ObfuscatedName("e")
  public String[] field3339;
  @ObfuscatedName("x")
  public int[] field3344;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(DDIB)[D",
      garbageValue = "2"
  )
  public static double[] method4986(double d_0, double d_2, int i_4) {
    int i_5 = i_4 * 2 + 1;
    double[] doubles_6 = new double[i_5];
    int i_7 = -i_4;

    for (int i_8 = 0; i_7 <= i_4; i_8++) {
      double d_15 = ((double) i_7 - d_0) / d_2;
      double d_13 = Math.exp(-d_15 * d_15 / 2.0D) / Math.sqrt(6.283185307179586D);
      double d_11 = d_13 / d_2;
      doubles_6[i_8] = d_11;
      ++i_7;
    }

    return doubles_6;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "2"
  )
  void method4978(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4979(class182_1, i_2);
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "1"
  )
  void method4979(Buffer class182_1, int i_2) {
    if (i_2 == 1) {
      this.field3336 = (char) class182_1.getUInt8();
    } else if (i_2 == 2) {
      this.field3337 = (char) class182_1.getUInt8();
    } else if (i_2 == 3) {
      this.field3340 = class182_1.method3738();
    } else if (i_2 == 4) {
      this.field3341 = class182_1.getInt32();
    } else {
      int i_3;
      if (i_2 == 5) {
        this.field3345 = class182_1.getUInt16();
        this.field3343 = new int[this.field3345];
        this.field3339 = new String[this.field3345];

        for (i_3 = 0; i_3 < this.field3345; i_3++) {
          this.field3343[i_3] = class182_1.getInt32();
          this.field3339[i_3] = class182_1.method3738();
        }
      } else if (i_2 == 6) {
        this.field3345 = class182_1.getUInt16();
        this.field3343 = new int[this.field3345];
        this.field3344 = new int[this.field3345];

        for (i_3 = 0; i_3 < this.field3345; i_3++) {
          this.field3343[i_3] = class182_1.getInt32();
          this.field3344[i_3] = class182_1.getInt32();
        }
      }
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-530255352"
  )
  public int method4980() {
    return this.field3345;
  }

}
