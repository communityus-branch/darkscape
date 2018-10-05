package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class143 extends class283 {

  @ObfuscatedName("no")
  @ObfuscatedSignature(
      signature = "Lkb;"
  )
  static class307 field1899;
  @ObfuscatedName("fd")
  static int[] field1900;
  @ObfuscatedName("kl")
  @ObfuscatedSignature(
      signature = "Lhi;"
  )
  static class230 field1897;
  @ObfuscatedName("z")
  final boolean field1893;

  public class143(boolean bool_1) {
    this.field1893 = bool_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "16"
  )
  static void method3172(int i_0, String string_1, String string_2) {
    class173.method3472(i_0, string_1, string_2, (String) null);
  }

  @ObfuscatedName("z")
  public static final int method3167(double d_0, double d_2, double d_4) {
    double d_6 = d_4;
    double d_8 = d_4;
    double d_10 = d_4;
    if (d_2 != 0.0D) {
      double d_12;
      if (d_4 < 0.5D) {
        d_12 = d_4 * (d_2 + 1.0D);
      } else {
        d_12 = d_4 + d_2 - d_2 * d_4;
      }

      double d_14 = 2.0D * d_4 - d_12;
      double d_16 = d_0 + 0.3333333333333333D;
      if (d_16 > 1.0D) {
        --d_16;
      }

      double d_20 = d_0 - 0.3333333333333333D;
      if (d_20 < 0.0D) {
        ++d_20;
      }

      if (6.0D * d_16 < 1.0D) {
        d_6 = d_14 + d_16 * 6.0D * (d_12 - d_14);
      } else if (d_16 * 2.0D < 1.0D) {
        d_6 = d_12;
      } else if (d_16 * 3.0D < 2.0D) {
        d_6 = d_14 + 6.0D * (0.6666666666666666D - d_16) * (d_12 - d_14);
      } else {
        d_6 = d_14;
      }

      if (d_0 * 6.0D < 1.0D) {
        d_8 = d_14 + d_0 * 6.0D * (d_12 - d_14);
      } else if (2.0D * d_0 < 1.0D) {
        d_8 = d_12;
      } else if (3.0D * d_0 < 2.0D) {
        d_8 = 6.0D * (0.6666666666666666D - d_0) * (d_12 - d_14) + d_14;
      } else {
        d_8 = d_14;
      }

      if (d_20 * 6.0D < 1.0D) {
        d_10 = (d_12 - d_14) * 6.0D * d_20 + d_14;
      } else if (2.0D * d_20 < 1.0D) {
        d_10 = d_12;
      } else if (3.0D * d_20 < 2.0D) {
        d_10 = (d_12 - d_14) * (0.6666666666666666D - d_20) * 6.0D + d_14;
      } else {
        d_10 = d_14;
      }
    }

    int i_22 = (int) (d_6 * 256.0D);
    int i_13 = (int) (d_8 * 256.0D);
    int i_23 = (int) (256.0D * d_10);
    int i_15 = i_23 + (i_13 << 8) + (i_22 << 16);
    return i_15;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-329911544"
  )
  public static int method3173(int i_0) {
    int i_1 = 0;
    if (i_0 < 0 || i_0 >= 65536) {
      i_0 >>>= 16;
      i_1 += 16;
    }

    if (i_0 >= 256) {
      i_0 >>>= 8;
      i_1 += 8;
    }

    if (i_0 >= 16) {
      i_0 >>>= 4;
      i_1 += 4;
    }

    if (i_0 >= 4) {
      i_0 >>>= 2;
      i_1 += 2;
    }

    if (i_0 >= 1) {
      i_0 >>>= 1;
      ++i_1;
    }

    return i_0 + i_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lkz;Lkz;B)I",
      garbageValue = "3"
  )
  int method3165(class287 class287_1, class287 class287_2) {
    return class287_2.field3628 != class287_1.field3628 ? (this.field1893 ? class287_1.field3628
        - class287_2.field3628 : class287_2.field3628 - class287_1.field3628)
        : this.method5308(class287_1, class287_2);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method3165((class287) object_1, (class287) object_2);
  }

}
