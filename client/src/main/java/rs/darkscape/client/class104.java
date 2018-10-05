package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public class class104 {

  @ObfuscatedName("q")
  static float[][] field1370 = new float[2][8];
  @ObfuscatedName("k")
  static int[][] field1376 = new int[2][8];
  @ObfuscatedName("i")
  static float field1381;
  @ObfuscatedName("x")
  static int field1378;
  @ObfuscatedName("z")
  int[] field1373 = new int[2];
  @ObfuscatedName("s")
  int[][][] field1379 = new int[2][2][4];
  @ObfuscatedName("l")
  int[][][] field1377 = new int[2][2][4];
  @ObfuscatedName("u")
  int[] field1374 = new int[2];

  @ObfuscatedName("w")
  static float method2421(float f_0) {
    float f_1 = 32.703197F * (float) Math.pow(2.0D, (double) f_0);
    return f_1 * 3.1415927F / 11025.0F;
  }

  @ObfuscatedName("z")
  float method2420(int i_1, int i_2, float f_3) {
    float f_4 = (float) this.field1377[i_1][0][i_2] + f_3 * (float) (this.field1377[i_1][1][i_2]
        - this.field1377[i_1][0][i_2]);
    f_4 *= 0.0015258789F;
    return 1.0F - (float) Math.pow(10.0D, (double) (-f_4 / 20.0F));
  }

  @ObfuscatedName("s")
  float method2422(int i_1, int i_2, float f_3) {
    float f_4 = (float) this.field1379[i_1][0][i_2] + f_3 * (float) (this.field1379[i_1][1][i_2]
        - this.field1379[i_1][0][i_2]);
    f_4 *= 1.2207031E-4F;
    return method2421(f_4);
  }

  @ObfuscatedName("l")
  int method2428(int i_1, float f_2) {
    float f_3;
    if (i_1 == 0) {
      f_3 = (float) this.field1374[0] + (float) (this.field1374[1] - this.field1374[0]) * f_2;
      f_3 *= 0.0030517578F;
      field1381 = (float) Math.pow(0.1D, (double) (f_3 / 20.0F));
      field1378 = (int) (field1381 * 65536.0F);
    }

    if (this.field1373[i_1] == 0) {
      return 0;
    } else {
      f_3 = this.method2420(i_1, 0, f_2);
      field1370[i_1][0] = -2.0F * f_3 * (float) Math.cos((double) this.method2422(i_1, 0, f_2));
      field1370[i_1][1] = f_3 * f_3;

      int i_4;
      for (i_4 = 1; i_4 < this.field1373[i_1]; i_4++) {
        f_3 = this.method2420(i_1, i_4, f_2);
        float f_5 = -2.0F * f_3 * (float) Math.cos((double) this.method2422(i_1, i_4, f_2));
        float f_6 = f_3 * f_3;
        field1370[i_1][i_4 * 2 + 1] = field1370[i_1][i_4 * 2 - 1] * f_6;
        field1370[i_1][i_4 * 2] =
            field1370[i_1][i_4 * 2 - 1] * f_5 + field1370[i_1][i_4 * 2 - 2] * f_6;

        for (int i_7 = i_4 * 2 - 1; i_7 >= 2; --i_7) {
          field1370[i_1][i_7] += field1370[i_1][i_7 - 1] * f_5 + field1370[i_1][i_7 - 2] * f_6;
        }

        field1370[i_1][1] += field1370[i_1][0] * f_5 + f_6;
        field1370[i_1][0] += f_5;
      }

      if (i_1 == 0) {
        for (i_4 = 0; i_4 < this.field1373[0] * 2; i_4++) {
          field1370[0][i_4] *= field1381;
        }
      }

      for (i_4 = 0; i_4 < this.field1373[i_1] * 2; i_4++) {
        field1376[i_1][i_4] = (int) (field1370[i_1][i_4] * 65536.0F);
      }

      return this.field1373[i_1] * 2;
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lgk;Lcj;)V"
  )
  final void method2425(Buffer class182_1, class96 class96_2) {
    int i_3 = class182_1.getUInt8();
    this.field1373[0] = i_3 >> 4;
    this.field1373[1] = i_3 & 0xf;
    if (i_3 != 0) {
      this.field1374[0] = class182_1.getUInt16();
      this.field1374[1] = class182_1.getUInt16();
      int i_4 = class182_1.getUInt8();

      int i_5;
      int i_6;
      for (i_5 = 0; i_5 < 2; i_5++) {
        for (i_6 = 0; i_6 < this.field1373[i_5]; i_6++) {
          this.field1379[i_5][0][i_6] = class182_1.getUInt16();
          this.field1377[i_5][0][i_6] = class182_1.getUInt16();
        }
      }

      for (i_5 = 0; i_5 < 2; i_5++) {
        for (i_6 = 0; i_6 < this.field1373[i_5]; i_6++) {
          if ((i_4 & 1 << i_5 * 4 << i_6) != 0) {
            this.field1379[i_5][1][i_6] = class182_1.getUInt16();
            this.field1377[i_5][1][i_6] = class182_1.getUInt16();
          } else {
            this.field1379[i_5][1][i_6] = this.field1379[i_5][0][i_6];
            this.field1377[i_5][1][i_6] = this.field1377[i_5][0][i_6];
          }
        }
      }

      if (i_4 != 0 || this.field1374[1] != this.field1374[0]) {
        class96_2.method2197(class182_1);
      }
    } else {
      int[] ints_7 = this.field1374;
      this.field1374[1] = 0;
      ints_7[0] = 0;
    }

  }

}
