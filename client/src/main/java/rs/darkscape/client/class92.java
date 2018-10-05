package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public class class92 extends Node {

  @ObfuscatedName("t")
  static boolean field1260 = false;
  @ObfuscatedName("d")
  static float[] field1265;
  @ObfuscatedName("k")
  static byte[] field1266;
  @ObfuscatedName("i")
  static int field1250;
  @ObfuscatedName("x")
  static int field1262;
  @ObfuscatedName("e")
  static int field1252;
  @ObfuscatedName("p")
  static int field1259;
  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "[Lcv;"
  )
  static class90[] field1254;
  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "[Lcc;"
  )
  static class94[] field1255;
  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "[Lck;"
  )
  static class101[] field1273;
  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "[Ldz;"
  )
  static class106[] field1257;
  @ObfuscatedName("m")
  static boolean[] field1258;
  @ObfuscatedName("r")
  static int[] field1243;
  @ObfuscatedName("h")
  static float[] field1251;
  @ObfuscatedName("c")
  static float[] field1269;
  @ObfuscatedName("v")
  static float[] field1268;
  @ObfuscatedName("aw")
  static int[] field1272;
  @ObfuscatedName("af")
  static float[] field1247;
  @ObfuscatedName("ah")
  static float[] field1270;
  @ObfuscatedName("ab")
  static float[] field1271;
  @ObfuscatedName("ak")
  static int[] field1267;
  @ObfuscatedName("w")
  int field1244;
  @ObfuscatedName("s")
  int field1245;
  @ObfuscatedName("l")
  int field1246;
  @ObfuscatedName("u")
  int field1253;
  @ObfuscatedName("q")
  boolean field1248;
  @ObfuscatedName("z")
  byte[][] field1263;
  @ObfuscatedName("o")
  float[] field1261;
  @ObfuscatedName("y")
  int field1264;
  @ObfuscatedName("a")
  int field1249;
  @ObfuscatedName("j")
  boolean field1256;
  @ObfuscatedName("as")
  byte[] field1274;
  @ObfuscatedName("an")
  int field1275;
  @ObfuscatedName("ao")
  int field1276;

  class92(byte[] bytes_1) {
    this.method2094(bytes_1);
  }

  @ObfuscatedName("z")
  static float method2106(int i_0) {
    int i_1 = i_0 & 0x1fffff;
    int i_2 = i_0 & ~0x7fffffff;
    int i_3 = (i_0 & 0x7fe00000) >> 21;
    if (i_2 != 0) {
      i_1 = -i_1;
    }

    return (float) ((double) i_1 * Math.pow(2.0D, (double) (i_3 - 788)));
  }

  @ObfuscatedName("w")
  static void method2081(byte[] bytes_0, int i_1) {
    field1266 = bytes_0;
    field1250 = i_1;
    field1262 = 0;
  }

  @ObfuscatedName("s")
  static int method2093() {
    int i_0 = field1266[field1250] >> field1262 & 0x1;
    ++field1262;
    field1250 += field1262 >> 3;
    field1262 &= 0x7;
    return i_0;
  }

  @ObfuscatedName("l")
  static int method2108(int i_0) {
    int i_1 = 0;

    int i_2;
    int i_3;
    for (i_2 = 0; i_0 >= 8 - field1262; i_0 -= i_3) {
      i_3 = 8 - field1262;
      int i_4 = (1 << i_3) - 1;
      i_1 += (field1266[field1250] >> field1262 & i_4) << i_2;
      field1262 = 0;
      ++field1250;
      i_2 += i_3;
    }

    if (i_0 > 0) {
      i_3 = (1 << i_0) - 1;
      i_1 += (field1266[field1250] >> field1262 & i_3) << i_2;
      field1262 += i_0;
    }

    return i_1;
  }

  @ObfuscatedName("q")
  static void method2082(byte[] bytes_0) {
    method2081(bytes_0, 0);
    field1252 = 1 << method2108(4);
    field1259 = 1 << method2108(4);
    field1265 = new float[field1259];

    int i_1;
    int i_2;
    int i_3;
    int i_4;
    int i_5;
    for (i_1 = 0; i_1 < 2; i_1++) {
      i_2 = i_1 != 0 ? field1259 : field1252;
      i_3 = i_2 >> 1;
      i_4 = i_2 >> 2;
      i_5 = i_2 >> 3;
      float[] floats_6 = new float[i_3];

      for (int i_7 = 0; i_7 < i_4; i_7++) {
        floats_6[i_7 * 2] = (float) Math
            .cos((double) (i_7 * 4) * 3.141592653589793D / (double) i_2);
        floats_6[i_7 * 2 + 1] = -((float) Math
            .sin((double) (i_7 * 4) * 3.141592653589793D / (double) i_2));
      }

      float[] floats_18 = new float[i_3];

      for (int i_8 = 0; i_8 < i_4; i_8++) {
        floats_18[i_8 * 2] = (float) Math
            .cos((double) (i_8 * 2 + 1) * 3.141592653589793D / (double) (i_2 * 2));
        floats_18[i_8 * 2 + 1] = (float) Math
            .sin((double) (i_8 * 2 + 1) * 3.141592653589793D / (double) (i_2 * 2));
      }

      float[] floats_19 = new float[i_4];

      for (int i_9 = 0; i_9 < i_5; i_9++) {
        floats_19[i_9 * 2] = (float) Math
            .cos((double) (i_9 * 4 + 2) * 3.141592653589793D / (double) i_2);
        floats_19[i_9 * 2 + 1] = -((float) Math
            .sin((double) (i_9 * 4 + 2) * 3.141592653589793D / (double) i_2));
      }

      int[] ints_20 = new int[i_5];
      int i_10 = class143.method3173(i_5 - 1);

      for (int i_11 = 0; i_11 < i_5; i_11++) {
        int i_15 = i_11;
        int i_16 = i_10;

        int i_17;
        for (i_17 = 0; i_16 > 0; --i_16) {
          i_17 = i_17 << 1 | i_15 & 0x1;
          i_15 >>>= 1;
        }

        ints_20[i_11] = i_17;
      }

      if (i_1 != 0) {
        field1247 = floats_6;
        field1270 = floats_18;
        field1271 = floats_19;
        field1267 = ints_20;
      } else {
        field1251 = floats_6;
        field1269 = floats_18;
        field1268 = floats_19;
        field1272 = ints_20;
      }
    }

    i_1 = method2108(8) + 1;
    field1254 = new class90[i_1];

    for (i_2 = 0; i_2 < i_1; i_2++) {
      field1254[i_2] = new class90();
    }

    i_2 = method2108(6) + 1;

    for (i_3 = 0; i_3 < i_2; i_3++) {
      method2108(16);
    }

    i_2 = method2108(6) + 1;
    field1255 = new class94[i_2];

    for (i_3 = 0; i_3 < i_2; i_3++) {
      field1255[i_3] = new class94();
    }

    i_3 = method2108(6) + 1;
    field1273 = new class101[i_3];

    for (i_4 = 0; i_4 < i_3; i_4++) {
      field1273[i_4] = new class101();
    }

    i_4 = method2108(6) + 1;
    field1257 = new class106[i_4];

    for (i_5 = 0; i_5 < i_4; i_5++) {
      field1257[i_5] = new class106();
    }

    i_5 = method2108(6) + 1;
    field1258 = new boolean[i_5];
    field1243 = new int[i_5];

    for (int i_21 = 0; i_21 < i_5; i_21++) {
      field1258[i_21] = method2093() != 0;
      method2108(16);
      method2108(16);
      field1243[i_21] = method2108(8);
    }

  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(Lir;)Z"
  )
  static boolean method2087(AbstractPack class247_0) {
    if (!field1260) {
      byte[] bytes_1 = class247_0.method4625(0, 0);
      if (bytes_1 == null) {
        return false;
      }

      method2082(bytes_1);
      field1260 = true;
    }

    return true;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(Lir;II)Lcs;"
  )
  static class92 method2088(AbstractPack class247_0, int i_1, int i_2) {
    if (!method2087(class247_0)) {
      class247_0.method4696(i_1, i_2);
      return null;
    } else {
      byte[] bytes_3 = class247_0.method4625(i_1, i_2);
      return bytes_3 == null ? null : new class92(bytes_3);
    }
  }

  @ObfuscatedName("u")
  void method2094(byte[] bytes_1) {
    Buffer class182_2 = new Buffer(bytes_1);
    this.field1244 = class182_2.getInt32();
    this.field1245 = class182_2.getInt32();
    this.field1246 = class182_2.getInt32();
    this.field1253 = class182_2.getInt32();
    if (this.field1253 < 0) {
      this.field1253 = ~this.field1253;
      this.field1248 = true;
    }

    int i_3 = class182_2.getInt32();
    this.field1263 = new byte[i_3][];

    for (int i_4 = 0; i_4 < i_3; i_4++) {
      int i_5 = 0;

      int i_6;
      do {
        i_6 = class182_2.getUInt8();
        i_5 += i_6;
      } while (i_6 >= 255);

      byte[] bytes_7 = new byte[i_5];
      class182_2.method3539(bytes_7, 0, i_5);
      this.field1263[i_4] = bytes_7;
    }

  }

  @ObfuscatedName("i")
  float[] method2086(int i_1) {
    method2081(this.field1263[i_1], 0);
    method2093();
    int i_2 = method2108(class143.method3173(field1243.length - 1));
    boolean bool_3 = field1258[i_2];
    int i_4 = bool_3 ? field1259 : field1252;
    boolean bool_5 = false;
    boolean bool_6 = false;
    if (bool_3) {
      bool_5 = method2093() != 0;
      bool_6 = method2093() != 0;
    }

    int i_7 = i_4 >> 1;
    int i_8;
    int i_9;
    int i_10;
    if (bool_3 && !bool_5) {
      i_8 = (i_4 >> 2) - (field1252 >> 2);
      i_9 = (field1252 >> 2) + (i_4 >> 2);
      i_10 = field1252 >> 1;
    } else {
      i_8 = 0;
      i_9 = i_7;
      i_10 = i_4 >> 1;
    }

    int i_11;
    int i_12;
    int i_13;
    if (bool_3 && !bool_6) {
      i_11 = i_4 - (i_4 >> 2) - (field1252 >> 2);
      i_12 = (field1252 >> 2) + (i_4 - (i_4 >> 2));
      i_13 = field1252 >> 1;
    } else {
      i_11 = i_7;
      i_12 = i_4;
      i_13 = i_4 >> 1;
    }

    class106 class106_14 = field1257[field1243[i_2]];
    int i_16 = class106_14.field1387;
    int i_17 = class106_14.field1389[i_16];
    boolean bool_15 = !field1255[i_17].method2121();
    boolean bool_45 = bool_15;

    for (i_17 = 0; i_17 < class106_14.field1388; i_17++) {
      class101 class101_18 = field1273[class106_14.field1386[i_17]];
      float[] floats_19 = field1265;
      class101_18.method2234(floats_19, i_4 >> 1, bool_45);
    }

    int i_40;
    if (!bool_15) {
      i_17 = class106_14.field1387;
      i_40 = class106_14.field1389[i_17];
      field1255[i_40].method2141(field1265, i_4 >> 1);
    }

    int i_42;
    if (bool_15) {
      for (i_17 = i_4 >> 1; i_17 < i_4; i_17++) {
        field1265[i_17] = 0.0F;
      }
    } else {
      i_17 = i_4 >> 1;
      i_40 = i_4 >> 2;
      i_42 = i_4 >> 3;
      float[] floats_43 = field1265;

      int i_21;
      for (i_21 = 0; i_21 < i_17; i_21++) {
        floats_43[i_21] *= 0.5F;
      }

      for (i_21 = i_17; i_21 < i_4; i_21++) {
        floats_43[i_21] = -floats_43[i_4 - i_21 - 1];
      }

      float[] floats_44 = bool_3 ? field1247 : field1251;
      float[] floats_22 = bool_3 ? field1270 : field1269;
      float[] floats_23 = bool_3 ? field1271 : field1268;
      int[] ints_24 = bool_3 ? field1267 : field1272;

      int i_25;
      float f_26;
      float f_27;
      float f_28;
      float f_29;
      for (i_25 = 0; i_25 < i_40; i_25++) {
        f_26 = floats_43[i_25 * 4] - floats_43[i_4 - i_25 * 4 - 1];
        f_27 = floats_43[i_25 * 4 + 2] - floats_43[i_4 - i_25 * 4 - 3];
        f_28 = floats_44[i_25 * 2];
        f_29 = floats_44[i_25 * 2 + 1];
        floats_43[i_4 - i_25 * 4 - 1] = f_26 * f_28 - f_27 * f_29;
        floats_43[i_4 - i_25 * 4 - 3] = f_26 * f_29 + f_27 * f_28;
      }

      float f_30;
      float f_31;
      for (i_25 = 0; i_25 < i_42; i_25++) {
        f_26 = floats_43[i_17 + i_25 * 4 + 3];
        f_27 = floats_43[i_17 + i_25 * 4 + 1];
        f_28 = floats_43[i_25 * 4 + 3];
        f_29 = floats_43[i_25 * 4 + 1];
        floats_43[i_17 + i_25 * 4 + 3] = f_26 + f_28;
        floats_43[i_17 + i_25 * 4 + 1] = f_27 + f_29;
        f_30 = floats_44[i_17 - 4 - i_25 * 4];
        f_31 = floats_44[i_17 - 3 - i_25 * 4];
        floats_43[i_25 * 4 + 3] = (f_26 - f_28) * f_30 - (f_27 - f_29) * f_31;
        floats_43[i_25 * 4 + 1] = (f_27 - f_29) * f_30 + (f_26 - f_28) * f_31;
      }

      i_25 = class143.method3173(i_4 - 1);

      int i_47;
      int i_48;
      int i_49;
      int i_50;
      for (i_47 = 0; i_47 < i_25 - 3; i_47++) {
        i_48 = i_4 >> i_47 + 2;
        i_49 = 8 << i_47;

        for (i_50 = 0; i_50 < 2 << i_47; i_50++) {
          int i_51 = i_4 - i_48 * i_50 * 2;
          int i_52 = i_4 - i_48 * (i_50 * 2 + 1);

          for (int i_32 = 0; i_32 < i_4 >> i_47 + 4; i_32++) {
            int i_33 = i_32 * 4;
            float f_34 = floats_43[i_51 - 1 - i_33];
            float f_35 = floats_43[i_51 - 3 - i_33];
            float f_36 = floats_43[i_52 - 1 - i_33];
            float f_37 = floats_43[i_52 - 3 - i_33];
            floats_43[i_51 - 1 - i_33] = f_34 + f_36;
            floats_43[i_51 - 3 - i_33] = f_35 + f_37;
            float f_38 = floats_44[i_32 * i_49];
            float f_39 = floats_44[i_32 * i_49 + 1];
            floats_43[i_52 - 1 - i_33] = (f_34 - f_36) * f_38 - (f_35 - f_37) * f_39;
            floats_43[i_52 - 3 - i_33] = (f_35 - f_37) * f_38 + (f_34 - f_36) * f_39;
          }
        }
      }

      for (i_47 = 1; i_47 < i_42 - 1; i_47++) {
        i_48 = ints_24[i_47];
        if (i_47 < i_48) {
          i_49 = i_47 * 8;
          i_50 = i_48 * 8;
          f_30 = floats_43[i_49 + 1];
          floats_43[i_49 + 1] = floats_43[i_50 + 1];
          floats_43[i_50 + 1] = f_30;
          f_30 = floats_43[i_49 + 3];
          floats_43[i_49 + 3] = floats_43[i_50 + 3];
          floats_43[i_50 + 3] = f_30;
          f_30 = floats_43[i_49 + 5];
          floats_43[i_49 + 5] = floats_43[i_50 + 5];
          floats_43[i_50 + 5] = f_30;
          f_30 = floats_43[i_49 + 7];
          floats_43[i_49 + 7] = floats_43[i_50 + 7];
          floats_43[i_50 + 7] = f_30;
        }
      }

      for (i_47 = 0; i_47 < i_17; i_47++) {
        floats_43[i_47] = floats_43[i_47 * 2 + 1];
      }

      for (i_47 = 0; i_47 < i_42; i_47++) {
        floats_43[i_4 - 1 - i_47 * 2] = floats_43[i_47 * 4];
        floats_43[i_4 - 2 - i_47 * 2] = floats_43[i_47 * 4 + 1];
        floats_43[i_4 - i_40 - 1 - i_47 * 2] = floats_43[i_47 * 4 + 2];
        floats_43[i_4 - i_40 - 2 - i_47 * 2] = floats_43[i_47 * 4 + 3];
      }

      for (i_47 = 0; i_47 < i_42; i_47++) {
        f_27 = floats_23[i_47 * 2];
        f_28 = floats_23[i_47 * 2 + 1];
        f_29 = floats_43[i_17 + i_47 * 2];
        f_30 = floats_43[i_17 + i_47 * 2 + 1];
        f_31 = floats_43[i_4 - 2 - i_47 * 2];
        float f_53 = floats_43[i_4 - 1 - i_47 * 2];
        float f_54 = f_28 * (f_29 - f_31) + f_27 * (f_30 + f_53);
        floats_43[i_17 + i_47 * 2] = (f_29 + f_31 + f_54) * 0.5F;
        floats_43[i_4 - 2 - i_47 * 2] = (f_29 + f_31 - f_54) * 0.5F;
        f_54 = f_28 * (f_30 + f_53) - f_27 * (f_29 - f_31);
        floats_43[i_17 + i_47 * 2 + 1] = (f_30 - f_53 + f_54) * 0.5F;
        floats_43[i_4 - 1 - i_47 * 2] = (-f_30 + f_53 + f_54) * 0.5F;
      }

      for (i_47 = 0; i_47 < i_40; i_47++) {
        floats_43[i_47] = floats_43[i_17 + i_47 * 2] * floats_22[i_47 * 2]
            + floats_43[i_17 + i_47 * 2 + 1] * floats_22[i_47 * 2 + 1];
        floats_43[i_17 - 1 - i_47] = floats_43[i_17 + i_47 * 2] * floats_22[i_47 * 2 + 1]
            - floats_43[i_17 + i_47 * 2 + 1] * floats_22[i_47 * 2];
      }

      for (i_47 = 0; i_47 < i_40; i_47++) {
        floats_43[i_47 + (i_4 - i_40)] = -floats_43[i_47];
      }

      for (i_47 = 0; i_47 < i_40; i_47++) {
        floats_43[i_47] = floats_43[i_40 + i_47];
      }

      for (i_47 = 0; i_47 < i_40; i_47++) {
        floats_43[i_40 + i_47] = -floats_43[i_40 - i_47 - 1];
      }

      for (i_47 = 0; i_47 < i_40; i_47++) {
        floats_43[i_17 + i_47] = floats_43[i_4 - i_47 - 1];
      }

      for (i_47 = i_8; i_47 < i_9; i_47++) {
        f_27 = (float) Math
            .sin(((double) (i_47 - i_8) + 0.5D) / (double) i_10 * 0.5D * 3.141592653589793D);
        field1265[i_47] *= (float) Math.sin(1.5707963267948966D * (double) f_27 * (double) f_27);
      }

      for (i_47 = i_11; i_47 < i_12; i_47++) {
        f_27 = (float) Math.sin(
            ((double) (i_47 - i_11) + 0.5D) / (double) i_13 * 0.5D * 3.141592653589793D
                + 1.5707963267948966D);
        field1265[i_47] *= (float) Math.sin(1.5707963267948966D * (double) f_27 * (double) f_27);
      }
    }

    float[] floats_41 = null;
    if (this.field1264 > 0) {
      i_40 = i_4 + this.field1264 >> 2;
      floats_41 = new float[i_40];
      int i_20;
      if (!this.field1256) {
        for (i_42 = 0; i_42 < this.field1249; i_42++) {
          i_20 = i_42 + (this.field1264 >> 1);
          floats_41[i_42] += this.field1261[i_20];
        }
      }

      if (!bool_15) {
        for (i_42 = i_8; i_42 < i_4 >> 1; i_42++) {
          i_20 = floats_41.length - (i_4 >> 1) + i_42;
          floats_41[i_20] += field1265[i_42];
        }
      }
    }

    float[] floats_46 = this.field1261;
    this.field1261 = field1265;
    field1265 = floats_46;
    this.field1264 = i_4;
    this.field1249 = i_12 - (i_4 >> 1);
    this.field1256 = bool_15;
    return floats_41;
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "([I)Lct;"
  )
  class93 method2083(int[] ints_1) {
    if (ints_1 != null && ints_1[0] <= 0) {
      return null;
    } else {
      if (this.field1274 == null) {
        this.field1264 = 0;
        this.field1261 = new float[field1259];
        this.field1274 = new byte[this.field1245];
        this.field1275 = 0;
        this.field1276 = 0;
      }

      for (; this.field1276 < this.field1263.length; this.field1276++) {
        if (ints_1 != null && ints_1[0] <= 0) {
          return null;
        }

        float[] floats_2 = this.method2086(this.field1276);
        if (floats_2 != null) {
          int i_3 = this.field1275;
          int i_4 = floats_2.length;
          if (i_4 > this.field1245 - i_3) {
            i_4 = this.field1245 - i_3;
          }

          for (int i_5 = 0; i_5 < i_4; i_5++) {
            int i_6 = (int) (128.0F + floats_2[i_5] * 128.0F);
            if ((i_6 & ~0xff) != 0) {
              i_6 = ~i_6 >> 31;
            }

            this.field1274[i_3++] = (byte) (i_6 - 128);
          }

          if (ints_1 != null) {
            ints_1[0] -= i_3 - this.field1275;
          }

          this.field1275 = i_3;
        }
      }

      this.field1261 = null;
      byte[] bytes_7 = this.field1274;
      this.field1274 = null;
      return new class93(this.field1244, bytes_7, this.field1246, this.field1253, this.field1248);
    }
  }

}
