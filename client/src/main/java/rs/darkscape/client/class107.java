package rs.darkscape.client;

import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class107 {

  @ObfuscatedName("o")
  static int[] field1408 = new int[32768];
  @ObfuscatedName("y")
  static int[] field1409;
  @ObfuscatedName("t")
  static int[] field1407;
  @ObfuscatedName("j")
  static int[] field1390;
  @ObfuscatedName("d")
  static int[] field1399;
  @ObfuscatedName("h")
  static int[] field1413;
  @ObfuscatedName("c")
  static int[] field1414;
  @ObfuscatedName("v")
  static int[] field1411;

  static {
    Random random_0 = new Random(0L);

    int i_1;
    for (i_1 = 0; i_1 < 32768; i_1++) {
      field1408[i_1] = (random_0.nextInt() & 0x2) - 1;
    }

    field1409 = new int[32768];

    for (i_1 = 0; i_1 < 32768; i_1++) {
      field1409[i_1] = (int) (Math.sin((double) i_1 / 5215.1903D) * 16384.0D);
    }

    field1407 = new int[220500];
    field1390 = new int[5];
    field1399 = new int[5];
    field1413 = new int[5];
    field1414 = new int[5];
    field1411 = new int[5];
  }

  @ObfuscatedName("x")
  int[] field1406 = new int[]{0, 0, 0, 0, 0};
  @ObfuscatedName("e")
  int[] field1415 = new int[]{0, 0, 0, 0, 0};
  @ObfuscatedName("p")
  int[] field1412 = new int[]{0, 0, 0, 0, 0};
  @ObfuscatedName("b")
  int field1398 = 0;
  @ObfuscatedName("n")
  int field1402 = 100;
  @ObfuscatedName("m")
  int field1404 = 500;
  @ObfuscatedName("r")
  int field1405 = 0;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lcj;"
  )
  class96 field1400;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lcj;"
  )
  class96 field1401;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lcj;"
  )
  class96 field1392;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lcj;"
  )
  class96 field1393;
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lcj;"
  )
  class96 field1394;
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lcj;"
  )
  class96 field1395;
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Lcj;"
  )
  class96 field1396;
  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "Lcj;"
  )
  class96 field1397;
  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "Ldh;"
  )
  class104 field1403;
  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "Lcj;"
  )
  class96 field1410;

  @ObfuscatedName("z")
  final int[] method2464(int i_1, int i_2) {
    class193.method3895(field1407, 0, i_1);
    if (i_2 < 10) {
      return field1407;
    } else {
      double d_3 = (double) i_1 / ((double) i_2 + 0.0D);
      this.field1400.method2198();
      this.field1401.method2198();
      int i_5 = 0;
      int i_6 = 0;
      int i_7 = 0;
      if (this.field1392 != null) {
        this.field1392.method2198();
        this.field1393.method2198();
        i_5 = (int) ((double) (this.field1392.field1318 - this.field1392.field1314) * 32.768D
            / d_3);
        i_6 = (int) ((double) this.field1392.field1314 * 32.768D / d_3);
      }

      int i_8 = 0;
      int i_9 = 0;
      int i_10 = 0;
      if (this.field1394 != null) {
        this.field1394.method2198();
        this.field1395.method2198();
        i_8 = (int) ((double) (this.field1394.field1318 - this.field1394.field1314) * 32.768D
            / d_3);
        i_9 = (int) ((double) this.field1394.field1314 * 32.768D / d_3);
      }

      int i_11;
      for (i_11 = 0; i_11 < 5; i_11++) {
        if (this.field1406[i_11] != 0) {
          field1390[i_11] = 0;
          field1399[i_11] = (int) ((double) this.field1412[i_11] * d_3);
          field1413[i_11] = (this.field1406[i_11] << 14) / 100;
          field1414[i_11] = (int) (
              (double) (this.field1400.field1318 - this.field1400.field1314) * 32.768D * Math
                  .pow(1.0057929410678534D, (double) this.field1415[i_11]) / d_3);
          field1411[i_11] = (int) ((double) this.field1400.field1314 * 32.768D / d_3);
        }
      }

      int i_12;
      int i_13;
      int i_14;
      int i_15;
      for (i_11 = 0; i_11 < i_1; i_11++) {
        i_12 = this.field1400.method2206(i_1);
        i_13 = this.field1401.method2206(i_1);
        if (this.field1392 != null) {
          i_14 = this.field1392.method2206(i_1);
          i_15 = this.field1393.method2206(i_1);
          i_12 += this.method2467(i_7, i_15, this.field1392.field1317) >> 1;
          i_7 = i_7 + i_6 + (i_14 * i_5 >> 16);
        }

        if (this.field1394 != null) {
          i_14 = this.field1394.method2206(i_1);
          i_15 = this.field1395.method2206(i_1);
          i_13 =
              i_13 * ((this.method2467(i_10, i_15, this.field1394.field1317) >> 1) + 32768) >> 15;
          i_10 = i_10 + i_9 + (i_14 * i_8 >> 16);
        }

        for (i_14 = 0; i_14 < 5; i_14++) {
          if (this.field1406[i_14] != 0) {
            i_15 = field1399[i_14] + i_11;
            if (i_15 < i_1) {
              field1407[i_15] += this.method2467(field1390[i_14], i_13 * field1413[i_14] >> 15,
                                                 this.field1400.field1317);
              field1390[i_14] += (i_12 * field1414[i_14] >> 16) + field1411[i_14];
            }
          }
        }
      }

      int i_16;
      if (this.field1396 != null) {
        this.field1396.method2198();
        this.field1397.method2198();
        i_11 = 0;
        boolean bool_19 = false;
        boolean bool_20 = true;

        for (i_14 = 0; i_14 < i_1; i_14++) {
          i_15 = this.field1396.method2206(i_1);
          i_16 = this.field1397.method2206(i_1);
          if (bool_20) {
            i_12 = (i_15 * (this.field1396.field1318 - this.field1396.field1314) >> 8)
                + this.field1396.field1314;
          } else {
            i_12 = (i_16 * (this.field1396.field1318 - this.field1396.field1314) >> 8)
                + this.field1396.field1314;
          }

          i_11 += 256;
          if (i_11 >= i_12) {
            i_11 = 0;
            bool_20 = !bool_20;
          }

          if (bool_20) {
            field1407[i_14] = 0;
          }
        }
      }

      if (this.field1398 > 0 && this.field1402 > 0) {
        i_11 = (int) ((double) this.field1398 * d_3);

        for (i_12 = i_11; i_12 < i_1; i_12++) {
          field1407[i_12] += field1407[i_12 - i_11] * this.field1402 / 100;
        }
      }

      if (this.field1403.field1373[0] > 0 || this.field1403.field1373[1] > 0) {
        this.field1410.method2198();
        i_11 = this.field1410.method2206(i_1 + 1);
        i_12 = this.field1403.method2428(0, (float) i_11 / 65536.0F);
        i_13 = this.field1403.method2428(1, (float) i_11 / 65536.0F);
        if (i_1 >= i_12 + i_13) {
          i_14 = 0;
          i_15 = i_13;
          if (i_13 > i_1 - i_12) {
            i_15 = i_1 - i_12;
          }

          int i_17;
          while (i_14 < i_15) {
            i_16 = (int) ((long) field1407[i_14 + i_12] * (long) class104.field1378 >> 16);

            for (i_17 = 0; i_17 < i_12; i_17++) {
              i_16 += (int) (
                  (long) field1407[i_14 + i_12 - 1 - i_17] * (long) class104.field1376[0][i_17]
                      >> 16);
            }

            for (i_17 = 0; i_17 < i_14; i_17++) {
              i_16 -= (int) ((long) field1407[i_14 - 1 - i_17] * (long) class104.field1376[1][i_17]
                  >> 16);
            }

            field1407[i_14] = i_16;
            i_11 = this.field1410.method2206(i_1 + 1);
            ++i_14;
          }

          i_15 = 128;

          while (true) {
            if (i_15 > i_1 - i_12) {
              i_15 = i_1 - i_12;
            }

            int i_18;
            while (i_14 < i_15) {
              i_17 = (int) ((long) field1407[i_14 + i_12] * (long) class104.field1378 >> 16);

              for (i_18 = 0; i_18 < i_12; i_18++) {
                i_17 += (int) (
                    (long) field1407[i_14 + i_12 - 1 - i_18] * (long) class104.field1376[0][i_18]
                        >> 16);
              }

              for (i_18 = 0; i_18 < i_13; i_18++) {
                i_17 -= (int) (
                    (long) field1407[i_14 - 1 - i_18] * (long) class104.field1376[1][i_18] >> 16);
              }

              field1407[i_14] = i_17;
              i_11 = this.field1410.method2206(i_1 + 1);
              ++i_14;
            }

            if (i_14 >= i_1 - i_12) {
              while (i_14 < i_1) {
                i_17 = 0;

                for (i_18 = i_14 + i_12 - i_1; i_18 < i_12; i_18++) {
                  i_17 += (int) (
                      (long) field1407[i_14 + i_12 - 1 - i_18] * (long) class104.field1376[0][i_18]
                          >> 16);
                }

                for (i_18 = 0; i_18 < i_13; i_18++) {
                  i_17 -= (int) (
                      (long) field1407[i_14 - 1 - i_18] * (long) class104.field1376[1][i_18] >> 16);
                }

                field1407[i_14] = i_17;
                this.field1410.method2206(i_1 + 1);
                ++i_14;
              }
              break;
            }

            i_12 = this.field1403.method2428(0, (float) i_11 / 65536.0F);
            i_13 = this.field1403.method2428(1, (float) i_11 / 65536.0F);
            i_15 += 128;
          }
        }
      }

      for (i_11 = 0; i_11 < i_1; i_11++) {
        if (field1407[i_11] < -32768) {
          field1407[i_11] = -32768;
        }

        if (field1407[i_11] > 32767) {
          field1407[i_11] = 32767;
        }
      }

      return field1407;
    }
  }

  @ObfuscatedName("w")
  final int method2467(int i_1, int i_2, int i_3) {
    return i_3 == 1 ? ((i_1 & 0x7fff) < 16384 ? i_2 : -i_2)
        : (i_3 == 2 ? field1409[i_1 & 0x7fff] * i_2 >> 14
            : (i_3 == 3 ? (i_2 * (i_1 & 0x7fff) >> 14) - i_2
                : (i_3 == 4 ? i_2 * field1408[i_1 / 2607 & 0x7fff] : 0)));
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;)V"
  )
  final void method2466(Buffer class182_1) {
    this.field1400 = new class96();
    this.field1400.method2199(class182_1);
    this.field1401 = new class96();
    this.field1401.method2199(class182_1);
    int i_2 = class182_1.getUInt8();
    if (i_2 != 0) {
      --class182_1.offset;
      this.field1392 = new class96();
      this.field1392.method2199(class182_1);
      this.field1393 = new class96();
      this.field1393.method2199(class182_1);
    }

    i_2 = class182_1.getUInt8();
    if (i_2 != 0) {
      --class182_1.offset;
      this.field1394 = new class96();
      this.field1394.method2199(class182_1);
      this.field1395 = new class96();
      this.field1395.method2199(class182_1);
    }

    i_2 = class182_1.getUInt8();
    if (i_2 != 0) {
      --class182_1.offset;
      this.field1396 = new class96();
      this.field1396.method2199(class182_1);
      this.field1397 = new class96();
      this.field1397.method2199(class182_1);
    }

    for (int i_3 = 0; i_3 < 10; i_3++) {
      int i_4 = class182_1.method3562();
      if (i_4 == 0) {
        break;
      }

      this.field1406[i_3] = i_4;
      this.field1415[i_3] = class182_1.method3561();
      this.field1412[i_3] = class182_1.method3562();
    }

    this.field1398 = class182_1.method3562();
    this.field1402 = class182_1.method3562();
    this.field1404 = class182_1.getUInt16();
    this.field1405 = class182_1.getUInt16();
    this.field1403 = new class104();
    this.field1410 = new class96();
    this.field1403.method2425(class182_1, this.field1410);
  }

}
