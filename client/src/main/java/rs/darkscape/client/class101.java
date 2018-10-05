package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ck")
public class class101 {

  @ObfuscatedName("z")
  int field1339 = class92.method2108(16);
  @ObfuscatedName("w")
  int field1340 = class92.method2108(24);
  @ObfuscatedName("s")
  int field1344 = class92.method2108(24);
  @ObfuscatedName("l")
  int field1341 = class92.method2108(24) + 1;
  @ObfuscatedName("u")
  int field1343 = class92.method2108(6) + 1;
  @ObfuscatedName("q")
  int field1342 = class92.method2108(8);
  @ObfuscatedName("k")
  int[] field1345;

  class101() {
    int[] ints_1 = new int[this.field1343];

    int i_2;
    for (i_2 = 0; i_2 < this.field1343; i_2++) {
      int i_3 = 0;
      int i_4 = class92.method2108(3);
      boolean bool_5 = class92.method2093() != 0;
      if (bool_5) {
        i_3 = class92.method2108(5);
      }

      ints_1[i_2] = i_3 << 3 | i_4;
    }

    this.field1345 = new int[this.field1343 * 8];

    for (i_2 = 0; i_2 < this.field1343 * 8; i_2++) {
      this.field1345[i_2] = (ints_1[i_2 >> 3] & 1 << (i_2 & 0x7)) != 0 ? class92.method2108(8) : -1;
    }

  }

  @ObfuscatedName("z")
  void method2234(float[] floats_1, int i_2, boolean bool_3) {
    int i_4;
    for (i_4 = 0; i_4 < i_2; i_4++) {
      floats_1[i_4] = 0.0F;
    }

    if (!bool_3) {
      i_4 = class92.field1254[this.field1342].field1235;
      int i_5 = this.field1344 - this.field1340;
      int i_6 = i_5 / this.field1341;
      int[] ints_7 = new int[i_6];

      for (int i_8 = 0; i_8 < 8; i_8++) {
        int i_9 = 0;

        while (i_9 < i_6) {
          int i_10;
          int i_11;
          if (i_8 == 0) {
            i_10 = class92.field1254[this.field1342].method2055();

            for (i_11 = i_4 - 1; i_11 >= 0; --i_11) {
              if (i_9 + i_11 < i_6) {
                ints_7[i_9 + i_11] = i_10 % this.field1343;
              }

              i_10 /= this.field1343;
            }
          }

          for (i_10 = 0; i_10 < i_4; i_10++) {
            i_11 = ints_7[i_9];
            int i_12 = this.field1345[i_8 + i_11 * 8];
            if (i_12 >= 0) {
              int i_13 = i_9 * this.field1341 + this.field1340;
              class90 class90_14 = class92.field1254[i_12];
              int i_15;
              if (this.field1339 == 0) {
                i_15 = this.field1341 / class90_14.field1235;

                for (int i_16 = 0; i_16 < i_15; i_16++) {
                  float[] floats_17 = class90_14.method2062();

                  for (int i_18 = 0; i_18 < class90_14.field1235; i_18++) {
                    floats_1[i_13 + i_16 + i_18 * i_15] += floats_17[i_18];
                  }
                }
              } else {
                i_15 = 0;

                while (i_15 < this.field1341) {
                  float[] floats_19 = class90_14.method2062();

                  for (int i_20 = 0; i_20 < class90_14.field1235; i_20++) {
                    floats_1[i_13 + i_15] += floats_19[i_20];
                    ++i_15;
                  }
                }
              }
            }

            ++i_9;
            if (i_9 >= i_6) {
              break;
            }
          }
        }
      }

    }
  }

}
