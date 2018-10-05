package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
public class class103 extends class105 {

  @ObfuscatedName("e")
  int field1363;
  @ObfuscatedName("p")
  int field1367;
  @ObfuscatedName("b")
  boolean field1365;
  @ObfuscatedName("s")
  int field1364;
  @ObfuscatedName("l")
  int field1356;
  @ObfuscatedName("u")
  int field1366;
  @ObfuscatedName("z")
  int field1357;
  @ObfuscatedName("q")
  int field1359;
  @ObfuscatedName("k")
  int field1360;
  @ObfuscatedName("i")
  int field1361;
  @ObfuscatedName("x")
  int field1362;
  @ObfuscatedName("n")
  int field1355;
  @ObfuscatedName("f")
  int field1358;
  @ObfuscatedName("g")
  int field1368;
  @ObfuscatedName("m")
  int field1369;

  @ObfuscatedSignature(
      signature = "(Lct;III)V"
  )
  class103(class93 class93_1, int i_2, int i_3, int i_4) {
    super.field1383 = class93_1;
    this.field1363 = class93_1.field1277;
    this.field1367 = class93_1.field1280;
    this.field1365 = class93_1.field1281;
    this.field1364 = i_2;
    this.field1356 = i_3;
    this.field1366 = i_4;
    this.field1357 = 0;
    this.method2324();
  }

  @ObfuscatedSignature(
      signature = "(Lct;II)V"
  )
  class103(class93 class93_1, int i_2, int i_3) {
    super.field1383 = class93_1;
    this.field1363 = class93_1.field1277;
    this.field1367 = class93_1.field1280;
    this.field1365 = class93_1.field1281;
    this.field1364 = i_2;
    this.field1356 = i_3;
    this.field1366 = 8192;
    this.field1357 = 0;
    this.method2324();
  }

  @ObfuscatedName("z")
  static int method2341(int i_0, int i_1) {
    return i_1 < 0 ? i_0
        : (int) ((double) i_0 * Math.sqrt((double) (16384 - i_1) * 1.220703125E-4D) + 0.5D);
  }

  @ObfuscatedName("w")
  static int method2251(int i_0, int i_1) {
    return i_1 < 0 ? -i_0 : (int) ((double) i_0 * Math.sqrt((double) i_1 * 1.220703125E-4D) + 0.5D);
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lct;II)Lcm;"
  )
  public static class103 method2287(class93 class93_0, int i_1, int i_2) {
    return class93_0.field1278 != null && class93_0.field1278.length != 0 ? new class103(class93_0,
                                                                                         (int) (
                                                                                             (long) class93_0.field1279
                                                                                                 * 256L
                                                                                                 * (long) i_1
                                                                                                 / (long) (
                                                                                                 class95.field1300
                                                                                                     * 100)),
                                                                                         i_2 << 6)
        : null;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lct;III)Lcm;"
  )
  public static class103 method2256(class93 class93_0, int i_1, int i_2, int i_3) {
    return class93_0.field1278 != null && class93_0.field1278.length != 0 ? new class103(class93_0,
                                                                                         i_1, i_2,
                                                                                         i_3)
        : null;
  }

  @ObfuscatedName("ay")
  @ObfuscatedSignature(
      signature = "([B[IIIIIIILcm;)I"
  )
  static int method2275(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                        int i_7, class103 class103_8) {
    i_2 >>= 8;
    i_7 >>= 8;
    i_4 <<= 2;
    if ((i_5 = i_3 + i_7 - i_2) > i_6) {
      i_5 = i_6;
    }

    int i_10001;
    for (i_5 -= 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2++] * i_4) {
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2++] * i_4;
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2++] * i_4;
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2++] * i_4;
      i_10001 = i_3++;
    }

    for (i_5 += 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2++] * i_4) {
      i_10001 = i_3++;
    }

    class103_8.field1357 = i_2 << 8;
    return i_3;
  }

  @ObfuscatedName("ag")
  @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIILcm;)I"
  )
  static int method2283(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, class103 class103_10) {
    i_3 >>= 8;
    i_9 >>= 8;
    i_5 <<= 2;
    i_6 <<= 2;
    if ((i_7 = i_4 + i_9 - i_3) > i_8) {
      i_7 = i_8;
    }

    i_4 <<= 1;
    i_7 <<= 1;

    int i_10001;
    byte b_11;
    for (i_7 -= 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
      b_11 = bytes_1[i_3++];
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_5;
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_6;
      b_11 = bytes_1[i_3++];
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_5;
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_6;
      b_11 = bytes_1[i_3++];
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_5;
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_6;
      b_11 = bytes_1[i_3++];
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_5;
      i_10001 = i_4++;
    }

    for (i_7 += 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
      b_11 = bytes_1[i_3++];
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_5;
      i_10001 = i_4++;
    }

    class103_10.field1357 = i_3 << 8;
    return i_4 >> 1;
  }

  @ObfuscatedName("bk")
  @ObfuscatedSignature(
      signature = "([B[IIIIIIILcm;)I"
  )
  static int method2374(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                        int i_7, class103 class103_8) {
    i_2 >>= 8;
    i_7 >>= 8;
    i_4 <<= 2;
    if ((i_5 = i_3 + i_2 - (i_7 - 1)) > i_6) {
      i_5 = i_6;
    }

    int i_10001;
    for (i_5 -= 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2--] * i_4) {
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2--] * i_4;
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2--] * i_4;
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2--] * i_4;
      i_10001 = i_3++;
    }

    for (i_5 += 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2--] * i_4) {
      i_10001 = i_3++;
    }

    class103_8.field1357 = i_2 << 8;
    return i_3;
  }

  @ObfuscatedName("bp")
  @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIILcm;)I"
  )
  static int method2274(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, class103 class103_10) {
    i_3 >>= 8;
    i_9 >>= 8;
    i_5 <<= 2;
    i_6 <<= 2;
    if ((i_7 = i_3 + i_4 - (i_9 - 1)) > i_8) {
      i_7 = i_8;
    }

    i_4 <<= 1;
    i_7 <<= 1;

    int i_10001;
    byte b_11;
    for (i_7 -= 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
      b_11 = bytes_1[i_3--];
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_5;
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_6;
      b_11 = bytes_1[i_3--];
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_5;
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_6;
      b_11 = bytes_1[i_3--];
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_5;
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_6;
      b_11 = bytes_1[i_3--];
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_5;
      i_10001 = i_4++;
    }

    for (i_7 += 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
      b_11 = bytes_1[i_3--];
      i_10001 = i_4++;
      ints_2[i_10001] += b_11 * i_5;
      i_10001 = i_4++;
    }

    class103_10.field1357 = i_3 << 8;
    return i_4 >> 1;
  }

  @ObfuscatedName("bi")
  @ObfuscatedSignature(
      signature = "(II[B[IIIIIIILcm;II)I"
  )
  static int method2286(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, class103 class103_10, int i_11, int i_12) {
    if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 - i_4) - 257) / i_11) > i_8) {
      i_7 = i_8;
    }

    byte b_13;
    int i_10001;
    while (i_5 < i_7) {
      i_1 = i_4 >> 8;
      b_13 = bytes_2[i_1];
      i_10001 = i_5++;
      ints_3[i_10001] += ((b_13 << 8) + (bytes_2[i_1 + 1] - b_13) * (i_4 & 0xff)) * i_6 >> 6;
      i_4 += i_11;
    }

    if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 - i_4) - 1) / i_11) > i_8) {
      i_7 = i_8;
    }

    for (i_1 = i_12; i_5 < i_7; i_4 += i_11) {
      b_13 = bytes_2[i_4 >> 8];
      i_10001 = i_5++;
      ints_3[i_10001] += ((b_13 << 8) + (i_1 - b_13) * (i_4 & 0xff)) * i_6 >> 6;
    }

    class103_10.field1357 = i_4;
    return i_5;
  }

  @ObfuscatedName("bj")
  @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILcm;II)I"
  )
  static int method2302(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, int i_10, class103 class103_11, int i_12,
                        int i_13) {
    if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9) {
      i_8 = i_9;
    }

    i_5 <<= 1;

    byte b_14;
    int i_10001;
    for (i_8 <<= 1; i_5 < i_8; i_4 += i_12) {
      i_1 = i_4 >> 8;
      b_14 = bytes_2[i_1];
      i_0 = (b_14 << 8) + (i_4 & 0xff) * (bytes_2[i_1 + 1] - b_14);
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_6 >> 6;
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_7 >> 6;
    }

    if (i_12 == 0 || (i_8 = (i_5 >> 1) + (i_10 - i_4 + i_12 - 1) / i_12) > i_9) {
      i_8 = i_9;
    }

    i_8 <<= 1;

    for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
      b_14 = bytes_2[i_4 >> 8];
      i_0 = (b_14 << 8) + (i_1 - b_14) * (i_4 & 0xff);
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_6 >> 6;
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_7 >> 6;
    }

    class103_11.field1357 = i_4;
    return i_5 >> 1;
  }

  @ObfuscatedName("bo")
  @ObfuscatedSignature(
      signature = "(II[B[IIIIIIILcm;II)I"
  )
  static int method2362(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, class103 class103_10, int i_11, int i_12) {
    if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 + 256 - i_4)) / i_11) > i_8) {
      i_7 = i_8;
    }

    int i_10001;
    while (i_5 < i_7) {
      i_1 = i_4 >> 8;
      byte b_13 = bytes_2[i_1 - 1];
      i_10001 = i_5++;
      ints_3[i_10001] += ((b_13 << 8) + (bytes_2[i_1] - b_13) * (i_4 & 0xff)) * i_6 >> 6;
      i_4 += i_11;
    }

    if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 - i_4)) / i_11) > i_8) {
      i_7 = i_8;
    }

    i_0 = i_12;

    for (i_1 = i_11; i_5 < i_7; i_4 += i_1) {
      i_10001 = i_5++;
      ints_3[i_10001] += ((i_0 << 8) + (bytes_2[i_4 >> 8] - i_0) * (i_4 & 0xff)) * i_6 >> 6;
    }

    class103_10.field1357 = i_4;
    return i_5;
  }

  @ObfuscatedName("bq")
  @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILcm;II)I"
  )
  static int method2289(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, int i_10, class103 class103_11, int i_12,
                        int i_13) {
    if (i_12 == 0 || (i_8 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9) {
      i_8 = i_9;
    }

    i_5 <<= 1;

    int i_10001;
    for (i_8 <<= 1; i_5 < i_8; i_4 += i_12) {
      i_1 = i_4 >> 8;
      byte b_14 = bytes_2[i_1 - 1];
      i_0 = (bytes_2[i_1] - b_14) * (i_4 & 0xff) + (b_14 << 8);
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_6 >> 6;
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_7 >> 6;
    }

    if (i_12 == 0 || (i_8 = (i_5 >> 1) + (i_10 - i_4 + i_12) / i_12) > i_9) {
      i_8 = i_9;
    }

    i_8 <<= 1;

    for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
      i_0 = (i_1 << 8) + (i_4 & 0xff) * (bytes_2[i_4 >> 8] - i_1);
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_6 >> 6;
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_7 >> 6;
    }

    class103_11.field1357 = i_4;
    return i_5 >> 1;
  }

  @ObfuscatedName("bh")
  @ObfuscatedSignature(
      signature = "([B[IIIIIIIILcm;)I"
  )
  static int method2417(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, class103 class103_9) {
    i_2 >>= 8;
    i_8 >>= 8;
    i_4 <<= 2;
    i_5 <<= 2;
    if ((i_6 = i_3 + i_8 - i_2) > i_7) {
      i_6 = i_7;
    }

    class103_9.field1360 += class103_9.field1368 * (i_6 - i_3);
    class103_9.field1361 += class103_9.field1369 * (i_6 - i_3);

    int i_10001;
    for (i_6 -= 3; i_3 < i_6; i_4 += i_5) {
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2++] * i_4;
      i_4 += i_5;
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2++] * i_4;
      i_4 += i_5;
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2++] * i_4;
      i_4 += i_5;
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2++] * i_4;
    }

    for (i_6 += 3; i_3 < i_6; i_4 += i_5) {
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2++] * i_4;
    }

    class103_9.field1359 = i_4 >> 2;
    class103_9.field1357 = i_2 << 8;
    return i_3;
  }

  @ObfuscatedName("bz")
  @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIIIILcm;)I"
  )
  static int method2288(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, int i_10, int i_11, class103 class103_12) {
    i_3 >>= 8;
    i_11 >>= 8;
    i_5 <<= 2;
    i_6 <<= 2;
    i_7 <<= 2;
    i_8 <<= 2;
    if ((i_9 = i_11 + i_4 - i_3) > i_10) {
      i_9 = i_10;
    }

    class103_12.field1359 += class103_12.field1358 * (i_9 - i_4);
    i_4 <<= 1;
    i_9 <<= 1;

    byte b_13;
    int i_10001;
    for (i_9 -= 6; i_4 < i_9; i_6 += i_8) {
      b_13 = bytes_1[i_3++];
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_5;
      i_5 += i_7;
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_6;
      i_6 += i_8;
      b_13 = bytes_1[i_3++];
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_5;
      i_5 += i_7;
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_6;
      i_6 += i_8;
      b_13 = bytes_1[i_3++];
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_5;
      i_5 += i_7;
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_6;
      i_6 += i_8;
      b_13 = bytes_1[i_3++];
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_5;
      i_5 += i_7;
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_6;
    }

    for (i_9 += 6; i_4 < i_9; i_6 += i_8) {
      b_13 = bytes_1[i_3++];
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_5;
      i_5 += i_7;
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_6;
    }

    class103_12.field1360 = i_5 >> 2;
    class103_12.field1361 = i_6 >> 2;
    class103_12.field1357 = i_3 << 8;
    return i_4 >> 1;
  }

  @ObfuscatedName("bu")
  @ObfuscatedSignature(
      signature = "([B[IIIIIIIILcm;)I"
  )
  static int method2328(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, class103 class103_9) {
    i_2 >>= 8;
    i_8 >>= 8;
    i_4 <<= 2;
    i_5 <<= 2;
    if ((i_6 = i_3 + i_2 - (i_8 - 1)) > i_7) {
      i_6 = i_7;
    }

    class103_9.field1360 += class103_9.field1368 * (i_6 - i_3);
    class103_9.field1361 += class103_9.field1369 * (i_6 - i_3);

    int i_10001;
    for (i_6 -= 3; i_3 < i_6; i_4 += i_5) {
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2--] * i_4;
      i_4 += i_5;
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2--] * i_4;
      i_4 += i_5;
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2--] * i_4;
      i_4 += i_5;
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2--] * i_4;
    }

    for (i_6 += 3; i_3 < i_6; i_4 += i_5) {
      i_10001 = i_3++;
      ints_1[i_10001] += bytes_0[i_2--] * i_4;
    }

    class103_9.field1359 = i_4 >> 2;
    class103_9.field1357 = i_2 << 8;
    return i_3;
  }

  @ObfuscatedName("bg")
  @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIIIILcm;)I"
  )
  static int method2293(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, int i_10, int i_11, class103 class103_12) {
    i_3 >>= 8;
    i_11 >>= 8;
    i_5 <<= 2;
    i_6 <<= 2;
    i_7 <<= 2;
    i_8 <<= 2;
    if ((i_9 = i_3 + i_4 - (i_11 - 1)) > i_10) {
      i_9 = i_10;
    }

    class103_12.field1359 += class103_12.field1358 * (i_9 - i_4);
    i_4 <<= 1;
    i_9 <<= 1;

    byte b_13;
    int i_10001;
    for (i_9 -= 6; i_4 < i_9; i_6 += i_8) {
      b_13 = bytes_1[i_3--];
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_5;
      i_5 += i_7;
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_6;
      i_6 += i_8;
      b_13 = bytes_1[i_3--];
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_5;
      i_5 += i_7;
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_6;
      i_6 += i_8;
      b_13 = bytes_1[i_3--];
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_5;
      i_5 += i_7;
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_6;
      i_6 += i_8;
      b_13 = bytes_1[i_3--];
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_5;
      i_5 += i_7;
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_6;
    }

    for (i_9 += 6; i_4 < i_9; i_6 += i_8) {
      b_13 = bytes_1[i_3--];
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_5;
      i_5 += i_7;
      i_10001 = i_4++;
      ints_2[i_10001] += b_13 * i_6;
    }

    class103_12.field1360 = i_5 >> 2;
    class103_12.field1361 = i_6 >> 2;
    class103_12.field1357 = i_3 << 8;
    return i_4 >> 1;
  }

  @ObfuscatedName("bl")
  @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILcm;II)I"
  )
  static int method2294(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, int i_10, class103 class103_11, int i_12,
                        int i_13) {
    class103_11.field1360 -= class103_11.field1368 * i_5;
    class103_11.field1361 -= class103_11.field1369 * i_5;
    if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9) {
      i_8 = i_9;
    }

    byte b_14;
    int i_10001;
    while (i_5 < i_8) {
      i_1 = i_4 >> 8;
      b_14 = bytes_2[i_1];
      i_10001 = i_5++;
      ints_3[i_10001] += ((b_14 << 8) + (bytes_2[i_1 + 1] - b_14) * (i_4 & 0xff)) * i_6 >> 6;
      i_6 += i_7;
      i_4 += i_12;
    }

    if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 1) / i_12) > i_9) {
      i_8 = i_9;
    }

    for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
      b_14 = bytes_2[i_4 >> 8];
      i_10001 = i_5++;
      ints_3[i_10001] += ((b_14 << 8) + (i_1 - b_14) * (i_4 & 0xff)) * i_6 >> 6;
      i_6 += i_7;
    }

    class103_11.field1360 += class103_11.field1368 * i_5;
    class103_11.field1361 += class103_11.field1369 * i_5;
    class103_11.field1359 = i_6;
    class103_11.field1357 = i_4;
    return i_5;
  }

  @ObfuscatedName("ba")
  @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIIIILcm;II)I"
  )
  static int method2295(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, int i_10, int i_11, int i_12,
                        class103 class103_13, int i_14, int i_15) {
    class103_13.field1359 -= i_5 * class103_13.field1358;
    if (i_14 == 0 || (i_10 = i_5 + (i_12 - i_4 + i_14 - 257) / i_14) > i_11) {
      i_10 = i_11;
    }

    i_5 <<= 1;

    byte b_16;
    int i_10001;
    for (i_10 <<= 1; i_5 < i_10; i_4 += i_14) {
      i_1 = i_4 >> 8;
      b_16 = bytes_2[i_1];
      i_0 = (b_16 << 8) + (i_4 & 0xff) * (bytes_2[i_1 + 1] - b_16);
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_6 >> 6;
      i_6 += i_8;
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_7 >> 6;
      i_7 += i_9;
    }

    if (i_14 == 0 || (i_10 = (i_5 >> 1) + (i_12 - i_4 + i_14 - 1) / i_14) > i_11) {
      i_10 = i_11;
    }

    i_10 <<= 1;

    for (i_1 = i_15; i_5 < i_10; i_4 += i_14) {
      b_16 = bytes_2[i_4 >> 8];
      i_0 = (b_16 << 8) + (i_1 - b_16) * (i_4 & 0xff);
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_6 >> 6;
      i_6 += i_8;
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_7 >> 6;
      i_7 += i_9;
    }

    i_5 >>= 1;
    class103_13.field1359 += class103_13.field1358 * i_5;
    class103_13.field1360 = i_6;
    class103_13.field1361 = i_7;
    class103_13.field1357 = i_4;
    return i_5;
  }

  @ObfuscatedName("bn")
  @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILcm;II)I"
  )
  static int method2271(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, int i_10, class103 class103_11, int i_12,
                        int i_13) {
    class103_11.field1360 -= class103_11.field1368 * i_5;
    class103_11.field1361 -= class103_11.field1369 * i_5;
    if (i_12 == 0 || (i_8 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9) {
      i_8 = i_9;
    }

    int i_10001;
    while (i_5 < i_8) {
      i_1 = i_4 >> 8;
      byte b_14 = bytes_2[i_1 - 1];
      i_10001 = i_5++;
      ints_3[i_10001] += ((b_14 << 8) + (bytes_2[i_1] - b_14) * (i_4 & 0xff)) * i_6 >> 6;
      i_6 += i_7;
      i_4 += i_12;
    }

    if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12) / i_12) > i_9) {
      i_8 = i_9;
    }

    i_0 = i_13;

    for (i_1 = i_12; i_5 < i_8; i_4 += i_1) {
      i_10001 = i_5++;
      ints_3[i_10001] += ((i_0 << 8) + (bytes_2[i_4 >> 8] - i_0) * (i_4 & 0xff)) * i_6 >> 6;
      i_6 += i_7;
    }

    class103_11.field1360 += class103_11.field1368 * i_5;
    class103_11.field1361 += class103_11.field1369 * i_5;
    class103_11.field1359 = i_6;
    class103_11.field1357 = i_4;
    return i_5;
  }

  @ObfuscatedName("bb")
  @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIIIILcm;II)I"
  )
  static int method2360(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6,
                        int i_7, int i_8, int i_9, int i_10, int i_11, int i_12,
                        class103 class103_13, int i_14, int i_15) {
    class103_13.field1359 -= i_5 * class103_13.field1358;
    if (i_14 == 0 || (i_10 = i_5 + (i_12 + 256 - i_4 + i_14) / i_14) > i_11) {
      i_10 = i_11;
    }

    i_5 <<= 1;

    int i_10001;
    for (i_10 <<= 1; i_5 < i_10; i_4 += i_14) {
      i_1 = i_4 >> 8;
      byte b_16 = bytes_2[i_1 - 1];
      i_0 = (bytes_2[i_1] - b_16) * (i_4 & 0xff) + (b_16 << 8);
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_6 >> 6;
      i_6 += i_8;
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_7 >> 6;
      i_7 += i_9;
    }

    if (i_14 == 0 || (i_10 = (i_5 >> 1) + (i_12 - i_4 + i_14) / i_14) > i_11) {
      i_10 = i_11;
    }

    i_10 <<= 1;

    for (i_1 = i_15; i_5 < i_10; i_4 += i_14) {
      i_0 = (i_1 << 8) + (i_4 & 0xff) * (bytes_2[i_4 >> 8] - i_1);
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_6 >> 6;
      i_6 += i_8;
      i_10001 = i_5++;
      ints_3[i_10001] += i_0 * i_7 >> 6;
      i_7 += i_9;
    }

    i_5 >>= 1;
    class103_13.field1359 += class103_13.field1358 * i_5;
    class103_13.field1360 = i_6;
    class103_13.field1361 = i_7;
    class103_13.field1357 = i_4;
    return i_5;
  }

  @ObfuscatedName("u")
  void method2324() {
    this.field1359 = this.field1356;
    this.field1360 = method2341(this.field1356, this.field1366);
    this.field1361 = method2251(this.field1356, this.field1366);
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "()Ldo;"
  )
  protected class105 vmethod4382() {
    return null;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "()Ldo;"
  )
  protected class105 vmethod4389() {
    return null;
  }

  @ObfuscatedName("x")
  protected int vmethod4395() {
    return this.field1356 == 0 && this.field1355 == 0 ? 0 : 1;
  }

  @ObfuscatedName("e")
  public synchronized void vmethod4385(int[] ints_1, int i_2, int i_3) {
    if (this.field1356 == 0 && this.field1355 == 0) {
      this.vmethod4386(i_3);
    } else {
      class93 class93_4 = (class93) super.field1383;
      int i_5 = this.field1363 << 8;
      int i_6 = this.field1367 << 8;
      int i_7 = class93_4.field1278.length << 8;
      int i_8 = i_6 - i_5;
      if (i_8 <= 0) {
        this.field1362 = 0;
      }

      int i_9 = i_2;
      i_3 += i_2;
      if (this.field1357 < 0) {
        if (this.field1364 <= 0) {
          this.method2266();
          this.unlinkNode();
          return;
        }

        this.field1357 = 0;
      }

      if (this.field1357 >= i_7) {
        if (this.field1364 >= 0) {
          this.method2266();
          this.unlinkNode();
          return;
        }

        this.field1357 = i_7 - 1;
      }

      if (this.field1362 < 0) {
        if (this.field1365) {
          if (this.field1364 < 0) {
            i_9 = this.method2280(ints_1, i_2, i_5, i_3, class93_4.field1278[this.field1363]);
            if (this.field1357 >= i_5) {
              return;
            }

            this.field1357 = i_5 + i_5 - 1 - this.field1357;
            this.field1364 = -this.field1364;
          }

          while (true) {
            i_9 = this.method2402(ints_1, i_9, i_6, i_3, class93_4.field1278[this.field1367 - 1]);
            if (this.field1357 < i_6) {
              return;
            }

            this.field1357 = i_6 + i_6 - 1 - this.field1357;
            this.field1364 = -this.field1364;
            i_9 = this.method2280(ints_1, i_9, i_5, i_3, class93_4.field1278[this.field1363]);
            if (this.field1357 >= i_5) {
              return;
            }

            this.field1357 = i_5 + i_5 - 1 - this.field1357;
            this.field1364 = -this.field1364;
          }
        } else if (this.field1364 < 0) {
          while (true) {
            i_9 = this.method2280(ints_1, i_9, i_5, i_3, class93_4.field1278[this.field1367 - 1]);
            if (this.field1357 >= i_5) {
              return;
            }

            this.field1357 = i_6 - 1 - (i_6 - 1 - this.field1357) % i_8;
          }
        } else {
          while (true) {
            i_9 = this.method2402(ints_1, i_9, i_6, i_3, class93_4.field1278[this.field1363]);
            if (this.field1357 < i_6) {
              return;
            }

            this.field1357 = i_5 + (this.field1357 - i_5) % i_8;
          }
        }
      } else {
        if (this.field1362 > 0) {
          if (this.field1365) {
            label139:
            {
              if (this.field1364 < 0) {
                i_9 = this.method2280(ints_1, i_2, i_5, i_3, class93_4.field1278[this.field1363]);
                if (this.field1357 >= i_5) {
                  return;
                }

                this.field1357 = i_5 + i_5 - 1 - this.field1357;
                this.field1364 = -this.field1364;
                if (--this.field1362 == 0) {
                  break label139;
                }
              }

              do {
                i_9 = this
                    .method2402(ints_1, i_9, i_6, i_3, class93_4.field1278[this.field1367 - 1]);
                if (this.field1357 < i_6) {
                  return;
                }

                this.field1357 = i_6 + i_6 - 1 - this.field1357;
                this.field1364 = -this.field1364;
                if (--this.field1362 == 0) {
                  break;
                }

                i_9 = this.method2280(ints_1, i_9, i_5, i_3, class93_4.field1278[this.field1363]);
                if (this.field1357 >= i_5) {
                  return;
                }

                this.field1357 = i_5 + i_5 - 1 - this.field1357;
                this.field1364 = -this.field1364;
              } while (--this.field1362 != 0);
            }
          } else {
            int i_10;
            if (this.field1364 < 0) {
              while (true) {
                i_9 = this
                    .method2280(ints_1, i_9, i_5, i_3, class93_4.field1278[this.field1367 - 1]);
                if (this.field1357 >= i_5) {
                  return;
                }

                i_10 = (i_6 - 1 - this.field1357) / i_8;
                if (i_10 >= this.field1362) {
                  this.field1357 += i_8 * this.field1362;
                  this.field1362 = 0;
                  break;
                }

                this.field1357 += i_8 * i_10;
                this.field1362 -= i_10;
              }
            } else {
              while (true) {
                i_9 = this.method2402(ints_1, i_9, i_6, i_3, class93_4.field1278[this.field1363]);
                if (this.field1357 < i_6) {
                  return;
                }

                i_10 = (this.field1357 - i_5) / i_8;
                if (i_10 >= this.field1362) {
                  this.field1357 -= i_8 * this.field1362;
                  this.field1362 = 0;
                  break;
                }

                this.field1357 -= i_8 * i_10;
                this.field1362 -= i_10;
              }
            }
          }
        }

        if (this.field1364 < 0) {
          this.method2280(ints_1, i_9, 0, i_3, 0);
          if (this.field1357 < 0) {
            this.field1357 = -1;
            this.method2266();
            this.unlinkNode();
          }
        } else {
          this.method2402(ints_1, i_9, i_7, i_3, 0);
          if (this.field1357 >= i_7) {
            this.field1357 = i_7;
            this.method2266();
            this.unlinkNode();
          }
        }

      }
    }
  }

  @ObfuscatedName("p")
  public synchronized void method2258(int i_1) {
    this.field1362 = i_1;
  }

  @ObfuscatedName("b")
  public synchronized void vmethod4386(int i_1) {
    if (this.field1355 > 0) {
      if (i_1 >= this.field1355) {
        if (this.field1356 == Integer.MIN_VALUE) {
          this.field1356 = 0;
          this.field1361 = 0;
          this.field1360 = 0;
          this.field1359 = 0;
          this.unlinkNode();
          i_1 = this.field1355;
        }

        this.field1355 = 0;
        this.method2324();
      } else {
        this.field1359 += this.field1358 * i_1;
        this.field1360 += this.field1368 * i_1;
        this.field1361 += this.field1369 * i_1;
        this.field1355 -= i_1;
      }
    }

    class93 class93_2 = (class93) super.field1383;
    int i_3 = this.field1363 << 8;
    int i_4 = this.field1367 << 8;
    int i_5 = class93_2.field1278.length << 8;
    int i_6 = i_4 - i_3;
    if (i_6 <= 0) {
      this.field1362 = 0;
    }

    if (this.field1357 < 0) {
      if (this.field1364 <= 0) {
        this.method2266();
        this.unlinkNode();
        return;
      }

      this.field1357 = 0;
    }

    if (this.field1357 >= i_5) {
      if (this.field1364 >= 0) {
        this.method2266();
        this.unlinkNode();
        return;
      }

      this.field1357 = i_5 - 1;
    }

    this.field1357 += this.field1364 * i_1;
    if (this.field1362 < 0) {
      if (!this.field1365) {
        if (this.field1364 < 0) {
          if (this.field1357 >= i_3) {
            return;
          }

          this.field1357 = i_4 - 1 - (i_4 - 1 - this.field1357) % i_6;
        } else {
          if (this.field1357 < i_4) {
            return;
          }

          this.field1357 = i_3 + (this.field1357 - i_3) % i_6;
        }

      } else {
        if (this.field1364 < 0) {
          if (this.field1357 >= i_3) {
            return;
          }

          this.field1357 = i_3 + i_3 - 1 - this.field1357;
          this.field1364 = -this.field1364;
        }

        while (this.field1357 >= i_4) {
          this.field1357 = i_4 + i_4 - 1 - this.field1357;
          this.field1364 = -this.field1364;
          if (this.field1357 >= i_3) {
            return;
          }

          this.field1357 = i_3 + i_3 - 1 - this.field1357;
          this.field1364 = -this.field1364;
        }

      }
    } else {
      if (this.field1362 > 0) {
        if (this.field1365) {
          label123:
          {
            if (this.field1364 < 0) {
              if (this.field1357 >= i_3) {
                return;
              }

              this.field1357 = i_3 + i_3 - 1 - this.field1357;
              this.field1364 = -this.field1364;
              if (--this.field1362 == 0) {
                break label123;
              }
            }

            do {
              if (this.field1357 < i_4) {
                return;
              }

              this.field1357 = i_4 + i_4 - 1 - this.field1357;
              this.field1364 = -this.field1364;
              if (--this.field1362 == 0) {
                break;
              }

              if (this.field1357 >= i_3) {
                return;
              }

              this.field1357 = i_3 + i_3 - 1 - this.field1357;
              this.field1364 = -this.field1364;
            } while (--this.field1362 != 0);
          }
        } else {
          label155:
          {
            int i_7;
            if (this.field1364 < 0) {
              if (this.field1357 >= i_3) {
                return;
              }

              i_7 = (i_4 - 1 - this.field1357) / i_6;
              if (i_7 >= this.field1362) {
                this.field1357 += i_6 * this.field1362;
                this.field1362 = 0;
                break label155;
              }

              this.field1357 += i_6 * i_7;
              this.field1362 -= i_7;
            } else {
              if (this.field1357 < i_4) {
                return;
              }

              i_7 = (this.field1357 - i_3) / i_6;
              if (i_7 >= this.field1362) {
                this.field1357 -= i_6 * this.field1362;
                this.field1362 = 0;
                break label155;
              }

              this.field1357 -= i_6 * i_7;
              this.field1362 -= i_7;
            }

            return;
          }
        }
      }

      if (this.field1364 < 0) {
        if (this.field1357 < 0) {
          this.field1357 = -1;
          this.method2266();
          this.unlinkNode();
        }
      } else if (this.field1357 >= i_5) {
        this.field1357 = i_5;
        this.method2266();
        this.unlinkNode();
      }

    }
  }

  @ObfuscatedName("n")
  public synchronized void method2267(int i_1) {
    this.method2261(i_1 << 6, this.method2263());
  }

  @ObfuscatedName("f")
  synchronized void method2260(int i_1) {
    this.method2261(i_1, this.method2263());
  }

  @ObfuscatedName("g")
  synchronized void method2261(int i_1, int i_2) {
    this.field1356 = i_1;
    this.field1366 = i_2;
    this.field1355 = 0;
    this.method2324();
  }

  @ObfuscatedName("m")
  public synchronized int method2262() {
    return this.field1356 == Integer.MIN_VALUE ? 0 : this.field1356;
  }

  @ObfuscatedName("r")
  public synchronized int method2263() {
    return this.field1366 < 0 ? -1 : this.field1366;
  }

  @ObfuscatedName("t")
  public synchronized void method2264(int i_1) {
    int i_2 = ((class93) super.field1383).field1278.length << 8;
    if (i_1 < -1) {
      i_1 = -1;
    }

    if (i_1 > i_2) {
      i_1 = i_2;
    }

    this.field1357 = i_1;
  }

  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "(Z)V",
      garbageValue = "1"
  )
  public synchronized void method2307() {
    this.field1364 = (this.field1364 ^ this.field1364 >> 31) + (this.field1364 >>> 31);
    this.field1364 = -this.field1364;
  }

  @ObfuscatedName("y")
  void method2266() {
    if (this.field1355 != 0) {
      if (this.field1356 == Integer.MIN_VALUE) {
        this.field1356 = 0;
      }

      this.field1355 = 0;
      this.method2324();
    }

  }

  @ObfuscatedName("a")
  public synchronized void method2408(int i_1, int i_2) {
    this.method2268(i_1, i_2, this.method2263());
  }

  @ObfuscatedName("c")
  public synchronized void method2268(int i_1, int i_2, int i_3) {
    if (i_1 == 0) {
      this.method2261(i_2, i_3);
    } else {
      int i_4 = method2341(i_2, i_3);
      int i_5 = method2251(i_2, i_3);
      if (i_4 == this.field1360 && i_5 == this.field1361) {
        this.field1355 = 0;
      } else {
        int i_6 = i_2 - this.field1359;
        if (this.field1359 - i_2 > i_6) {
          i_6 = this.field1359 - i_2;
        }

        if (i_4 - this.field1360 > i_6) {
          i_6 = i_4 - this.field1360;
        }

        if (this.field1360 - i_4 > i_6) {
          i_6 = this.field1360 - i_4;
        }

        if (i_5 - this.field1361 > i_6) {
          i_6 = i_5 - this.field1361;
        }

        if (this.field1361 - i_5 > i_6) {
          i_6 = this.field1361 - i_5;
        }

        if (i_1 > i_6) {
          i_1 = i_6;
        }

        this.field1355 = i_1;
        this.field1356 = i_2;
        this.field1366 = i_3;
        this.field1358 = (i_2 - this.field1359) / i_1;
        this.field1368 = (i_4 - this.field1360) / i_1;
        this.field1369 = (i_5 - this.field1361) / i_1;
      }
    }
  }

  @ObfuscatedName("v")
  public synchronized void method2269(int i_1) {
    if (i_1 == 0) {
      this.method2260(0);
      this.unlinkNode();
    } else if (this.field1360 == 0 && this.field1361 == 0) {
      this.field1355 = 0;
      this.field1356 = 0;
      this.field1359 = 0;
      this.unlinkNode();
    } else {
      int i_2 = -this.field1359;
      if (this.field1359 > i_2) {
        i_2 = this.field1359;
      }

      if (-this.field1360 > i_2) {
        i_2 = -this.field1360;
      }

      if (this.field1360 > i_2) {
        i_2 = this.field1360;
      }

      if (-this.field1361 > i_2) {
        i_2 = -this.field1361;
      }

      if (this.field1361 > i_2) {
        i_2 = this.field1361;
      }

      if (i_1 > i_2) {
        i_1 = i_2;
      }

      this.field1355 = i_1;
      this.field1356 = Integer.MIN_VALUE;
      this.field1358 = -this.field1359 / i_1;
      this.field1368 = -this.field1360 / i_1;
      this.field1369 = -this.field1361 / i_1;
    }
  }

  @ObfuscatedName("ai")
  public synchronized void method2270(int i_1) {
    if (this.field1364 < 0) {
      this.field1364 = -i_1;
    } else {
      this.field1364 = i_1;
    }

  }

  @ObfuscatedName("ac")
  public synchronized int method2351() {
    return this.field1364 < 0 ? -this.field1364 : this.field1364;
  }

  @ObfuscatedName("ap")
  public boolean method2272() {
    return this.field1357 < 0
        || this.field1357 >= ((class93) super.field1383).field1278.length << 8;
  }

  @ObfuscatedName("aa")
  public boolean method2273() {
    return this.field1355 != 0;
  }

  @ObfuscatedName("al")
  int method2402(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
    while (true) {
      if (this.field1355 > 0) {
        int i_6 = i_2 + this.field1355;
        if (i_6 > i_4) {
          i_6 = i_4;
        }

        this.field1355 += i_2;
        if (this.field1364 == 256 && (this.field1357 & 0xff) == 0) {
          if (class95.field1295) {
            i_2 = method2288(0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                             this.field1360, this.field1361, this.field1368, this.field1369, 0, i_6,
                             i_3, this);
          } else {
            i_2 = method2417(((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                             this.field1359, this.field1358, 0, i_6, i_3, this);
          }
        } else if (class95.field1295) {
          i_2 = method2295(0, 0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                           this.field1360, this.field1361, this.field1368, this.field1369, 0, i_6,
                           i_3, this, this.field1364, i_5);
        } else {
          i_2 = method2294(0, 0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                           this.field1359, this.field1358, 0, i_6, i_3, this, this.field1364, i_5);
        }

        this.field1355 -= i_2;
        if (this.field1355 != 0) {
          return i_2;
        }

        if (!this.method2281()) {
          continue;
        }

        return i_4;
      }

      if (this.field1364 == 256 && (this.field1357 & 0xff) == 0) {
        if (class95.field1295) {
          return method2283(0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                            this.field1360, this.field1361, 0, i_4, i_3, this);
        }

        return method2275(((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                          this.field1359, 0, i_4, i_3, this);
      }

      if (class95.field1295) {
        return method2302(0, 0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                          this.field1360, this.field1361, 0, i_4, i_3, this, this.field1364, i_5);
      }

      return method2286(0, 0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                        this.field1359, 0, i_4, i_3, this, this.field1364, i_5);
    }
  }

  @ObfuscatedName("ae")
  int method2280(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
    while (true) {
      if (this.field1355 > 0) {
        int i_6 = i_2 + this.field1355;
        if (i_6 > i_4) {
          i_6 = i_4;
        }

        this.field1355 += i_2;
        if (this.field1364 == -256 && (this.field1357 & 0xff) == 0) {
          if (class95.field1295) {
            i_2 = method2293(0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                             this.field1360, this.field1361, this.field1368, this.field1369, 0, i_6,
                             i_3, this);
          } else {
            i_2 = method2328(((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                             this.field1359, this.field1358, 0, i_6, i_3, this);
          }
        } else if (class95.field1295) {
          i_2 = method2360(0, 0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                           this.field1360, this.field1361, this.field1368, this.field1369, 0, i_6,
                           i_3, this, this.field1364, i_5);
        } else {
          i_2 = method2271(0, 0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                           this.field1359, this.field1358, 0, i_6, i_3, this, this.field1364, i_5);
        }

        this.field1355 -= i_2;
        if (this.field1355 != 0) {
          return i_2;
        }

        if (!this.method2281()) {
          continue;
        }

        return i_4;
      }

      if (this.field1364 == -256 && (this.field1357 & 0xff) == 0) {
        if (class95.field1295) {
          return method2274(0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                            this.field1360, this.field1361, 0, i_4, i_3, this);
        }

        return method2374(((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                          this.field1359, 0, i_4, i_3, this);
      }

      if (class95.field1295) {
        return method2289(0, 0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                          this.field1360, this.field1361, 0, i_4, i_3, this, this.field1364, i_5);
      }

      return method2362(0, 0, ((class93) super.field1383).field1278, ints_1, this.field1357, i_2,
                        this.field1359, 0, i_4, i_3, this, this.field1364, i_5);
    }
  }

  @ObfuscatedName("ax")
  int vmethod2435() {
    int i_1 = this.field1359 * 3 >> 6;
    i_1 = (i_1 ^ i_1 >> 31) + (i_1 >>> 31);
    if (this.field1362 == 0) {
      i_1 -= i_1 * this.field1357 / (((class93) super.field1383).field1278.length << 8);
    } else if (this.field1362 >= 0) {
      i_1 -= i_1 * this.field1363 / ((class93) super.field1383).field1278.length;
    }

    return i_1 > 255 ? 255 : i_1;
  }

  @ObfuscatedName("am")
  boolean method2281() {
    int i_1 = this.field1356;
    int i_2;
    int i_3;
    if (i_1 == Integer.MIN_VALUE) {
      i_3 = 0;
      i_2 = 0;
      i_1 = 0;
    } else {
      i_2 = method2341(i_1, this.field1366);
      i_3 = method2251(i_1, this.field1366);
    }

    if (i_1 == this.field1359 && i_2 == this.field1360 && i_3 == this.field1361) {
      if (this.field1356 == Integer.MIN_VALUE) {
        this.field1356 = 0;
        this.field1361 = 0;
        this.field1360 = 0;
        this.field1359 = 0;
        this.unlinkNode();
        return true;
      } else {
        this.method2324();
        return false;
      }
    } else {
      if (this.field1359 < i_1) {
        this.field1358 = 1;
        this.field1355 = i_1 - this.field1359;
      } else if (this.field1359 > i_1) {
        this.field1358 = -1;
        this.field1355 = this.field1359 - i_1;
      } else {
        this.field1358 = 0;
      }

      if (this.field1360 < i_2) {
        this.field1368 = 1;
        if (this.field1355 == 0 || this.field1355 > i_2 - this.field1360) {
          this.field1355 = i_2 - this.field1360;
        }
      } else if (this.field1360 > i_2) {
        this.field1368 = -1;
        if (this.field1355 == 0 || this.field1355 > this.field1360 - i_2) {
          this.field1355 = this.field1360 - i_2;
        }
      } else {
        this.field1368 = 0;
      }

      if (this.field1361 < i_3) {
        this.field1369 = 1;
        if (this.field1355 == 0 || this.field1355 > i_3 - this.field1361) {
          this.field1355 = i_3 - this.field1361;
        }
      } else if (this.field1361 > i_3) {
        this.field1369 = -1;
        if (this.field1355 == 0 || this.field1355 > this.field1361 - i_3) {
          this.field1355 = this.field1361 - i_3;
        }
      } else {
        this.field1369 = 0;
      }

      return false;
    }
  }

}
