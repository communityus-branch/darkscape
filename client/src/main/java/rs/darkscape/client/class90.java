package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cv")
public class class90 {

  @ObfuscatedName("z")
  int field1235;
  @ObfuscatedName("w")
  int field1233;
  @ObfuscatedName("s")
  int[] field1236;
  @ObfuscatedName("l")
  int[] field1234;
  @ObfuscatedName("u")
  float[][] field1237;
  @ObfuscatedName("q")
  int[] field1238;

  class90() {
    class92.method2108(24);
    this.field1235 = class92.method2108(16);
    this.field1233 = class92.method2108(24);
    this.field1236 = new int[this.field1233];
    boolean bool_1 = class92.method2093() != 0;
    int i_2;
    int i_3;
    int i_5;
    if (bool_1) {
      i_2 = 0;

      for (i_3 = class92.method2108(5) + 1; i_2 < this.field1233; i_3++) {
        int i_4 = class92.method2108(class143.method3173(this.field1233 - i_2));

        for (i_5 = 0; i_5 < i_4; i_5++) {
          this.field1236[i_2++] = i_3;
        }
      }
    } else {
      boolean bool_14 = class92.method2093() != 0;

      for (i_3 = 0; i_3 < this.field1233; i_3++) {
        if (bool_14 && class92.method2093() == 0) {
          this.field1236[i_3] = 0;
        } else {
          this.field1236[i_3] = class92.method2108(5) + 1;
        }
      }
    }

    this.method2053();
    i_2 = class92.method2108(4);
    if (i_2 > 0) {
      float f_15 = class92.method2106(class92.method2108(32));
      float f_16 = class92.method2106(class92.method2108(32));
      i_5 = class92.method2108(4) + 1;
      boolean bool_6 = class92.method2093() != 0;
      int i_7;
      if (i_2 == 1) {
        i_7 = method2056(this.field1233, this.field1235);
      } else {
        i_7 = this.field1233 * this.field1235;
      }

      this.field1234 = new int[i_7];

      int i_8;
      for (i_8 = 0; i_8 < i_7; i_8++) {
        this.field1234[i_8] = class92.method2108(i_5);
      }

      this.field1237 = new float[this.field1233][this.field1235];
      float f_9;
      int i_10;
      int i_11;
      if (i_2 == 1) {
        for (i_8 = 0; i_8 < this.field1233; i_8++) {
          f_9 = 0.0F;
          i_10 = 1;

          for (i_11 = 0; i_11 < this.field1235; i_11++) {
            int i_12 = i_8 / i_10 % i_7;
            float f_13 = (float) this.field1234[i_12] * f_16 + f_15 + f_9;
            this.field1237[i_8][i_11] = f_13;
            if (bool_6) {
              f_9 = f_13;
            }

            i_10 *= i_7;
          }
        }
      } else {
        for (i_8 = 0; i_8 < this.field1233; i_8++) {
          f_9 = 0.0F;
          i_10 = i_8 * this.field1235;

          for (i_11 = 0; i_11 < this.field1235; i_11++) {
            float f_17 = (float) this.field1234[i_10] * f_16 + f_15 + f_9;
            this.field1237[i_8][i_11] = f_17;
            if (bool_6) {
              f_9 = f_17;
            }

            ++i_10;
          }
        }
      }
    }

  }

  @ObfuscatedName("z")
  static int method2056(int i_0, int i_1) {
    int i_2 = (int) Math.pow((double) i_0, 1.0D / (double) i_1) + 1;

    while (true) {
      int i_4 = i_2;
      int i_5 = i_1;

      int i_6;
      for (i_6 = 1; i_5 > 1; i_5 >>= 1) {
        if ((i_5 & 0x1) != 0) {
          i_6 *= i_4;
        }

        i_4 *= i_4;
      }

      int i_3;
      if (i_5 == 1) {
        i_3 = i_6 * i_4;
      } else {
        i_3 = i_6;
      }

      if (i_3 <= i_0) {
        return i_2;
      }

      --i_2;
    }
  }

  @ObfuscatedName("w")
  void method2053() {
    int[] ints_1 = new int[this.field1233];
    int[] ints_2 = new int[33];

    int i_3;
    int i_4;
    int i_5;
    int i_6;
    int i_7;
    int i_8;
    int i_10;
    for (i_3 = 0; i_3 < this.field1233; i_3++) {
      i_4 = this.field1236[i_3];
      if (i_4 != 0) {
        i_5 = 1 << 32 - i_4;
        i_6 = ints_2[i_4];
        ints_1[i_3] = i_6;
        int i_9;
        if ((i_6 & i_5) != 0) {
          i_7 = ints_2[i_4 - 1];
        } else {
          i_7 = i_6 | i_5;

          for (i_8 = i_4 - 1; i_8 >= 1; --i_8) {
            i_9 = ints_2[i_8];
            if (i_9 != i_6) {
              break;
            }

            i_10 = 1 << 32 - i_8;
            if ((i_9 & i_10) != 0) {
              ints_2[i_8] = ints_2[i_8 - 1];
              break;
            }

            ints_2[i_8] = i_9 | i_10;
          }
        }

        ints_2[i_4] = i_7;

        for (i_8 = i_4 + 1; i_8 <= 32; i_8++) {
          i_9 = ints_2[i_8];
          if (i_9 == i_6) {
            ints_2[i_8] = i_7;
          }
        }
      }
    }

    this.field1238 = new int[8];
    int i_11 = 0;

    for (i_3 = 0; i_3 < this.field1233; i_3++) {
      i_4 = this.field1236[i_3];
      if (i_4 != 0) {
        i_5 = ints_1[i_3];
        i_6 = 0;

        for (i_7 = 0; i_7 < i_4; i_7++) {
          i_8 = Integer.MIN_VALUE >>> i_7;
          if ((i_5 & i_8) != 0) {
            if (this.field1238[i_6] == 0) {
              this.field1238[i_6] = i_11;
            }

            i_6 = this.field1238[i_6];
          } else {
            ++i_6;
          }

          if (i_6 >= this.field1238.length) {
            int[] ints_12 = new int[this.field1238.length * 2];

            for (i_10 = 0; i_10 < this.field1238.length; i_10++) {
              ints_12[i_10] = this.field1238[i_10];
            }

            this.field1238 = ints_12;
          }

          i_8 >>>= 1;
        }

        this.field1238[i_6] = ~i_3;
        if (i_6 >= i_11) {
          i_11 = i_6 + 1;
        }
      }
    }

  }

  @ObfuscatedName("s")
  int method2055() {
    int i_1;
    for (i_1 = 0; this.field1238[i_1] >= 0;
        i_1 = class92.method2093() != 0 ? this.field1238[i_1] : i_1 + 1) {
    }

    return ~this.field1238[i_1];
  }

  @ObfuscatedName("l")
  float[] method2062() {
    return this.field1237[this.method2055()];
  }

}
