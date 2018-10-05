package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public final class class112 {

  @ObfuscatedName("bo")
  @ObfuscatedSignature(
      signature = "Liw;"
  )
  static class244 field1455;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Ldf;"
  )
  class127 field1447;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -1713209305
  )
  int field1450;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -487172753
  )
  int field1448;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -629897321
  )
  int field1449;
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Ldf;"
  )
  class127 field1451;
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Ldf;"
  )
  class127 field1452;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      longValue = -7021382517737045299L
  )
  long field1456;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = -766143801
  )
  int field1454;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIILfw;Lfk;Z[I[II)I",
      garbageValue = "190310969"
  )
  public static int method2566(int i_0, int i_1, int i_2, class166 class166_3, class164 class164_4,
                               boolean bool_5, int[] ints_6, int[] ints_7) {
    int i_9;
    for (int i_8 = 0; i_8 < 128; i_8++) {
      for (i_9 = 0; i_9 < 128; i_9++) {
        class165.field2035[i_8][i_9] = 0;
        class165.field2041[i_8][i_9] = 99999999;
      }
    }

    int i_10;
    int i_11;
    byte b_13;
    int i_14;
    int i_15;
    int i_17;
    int i_19;
    int i_20;
    int i_21;
    boolean bool_28;
    int i_30;
    int i_31;
    int i_33;
    if (i_2 == 1) {
      i_10 = i_0;
      i_11 = i_1;
      byte b_12 = 64;
      b_13 = 64;
      i_14 = i_0 - b_12;
      i_15 = i_1 - b_13;
      class165.field2035[b_12][b_13] = 99;
      class165.field2041[b_12][b_13] = 0;
      byte b_16 = 0;
      i_17 = 0;
      class165.field2039[b_16] = i_0;
      i_33 = b_16 + 1;
      class165.field2038[b_16] = i_1;
      int[][] ints_18 = class164_4.field2029;

      boolean bool_29;
      while (true) {
        if (i_33 == i_17) {
          class19.field152 = i_10;
          class165.field2037 = i_11;
          bool_29 = false;
          break;
        }

        i_10 = class165.field2039[i_17];
        i_11 = class165.field2038[i_17];
        i_17 = i_17 + 1 & 0xfff;
        i_30 = i_10 - i_14;
        i_31 = i_11 - i_15;
        i_19 = i_10 - class164_4.field2025;
        i_20 = i_11 - class164_4.field2026;
        if (class166_3.vmethod3440(1, i_10, i_11, class164_4)) {
          class19.field152 = i_10;
          class165.field2037 = i_11;
          bool_29 = true;
          break;
        }

        i_21 = class165.field2041[i_30][i_31] + 1;
        if (i_30 > 0 && class165.field2035[i_30 - 1][i_31] == 0
            && (ints_18[i_19 - 1][i_20] & 0x1240108) == 0) {
          class165.field2039[i_33] = i_10 - 1;
          class165.field2038[i_33] = i_11;
          i_33 = i_33 + 1 & 0xfff;
          class165.field2035[i_30 - 1][i_31] = 2;
          class165.field2041[i_30 - 1][i_31] = i_21;
        }

        if (i_30 < 127 && class165.field2035[i_30 + 1][i_31] == 0
            && (ints_18[i_19 + 1][i_20] & 0x1240180) == 0) {
          class165.field2039[i_33] = i_10 + 1;
          class165.field2038[i_33] = i_11;
          i_33 = i_33 + 1 & 0xfff;
          class165.field2035[i_30 + 1][i_31] = 8;
          class165.field2041[i_30 + 1][i_31] = i_21;
        }

        if (i_31 > 0 && class165.field2035[i_30][i_31 - 1] == 0
            && (ints_18[i_19][i_20 - 1] & 0x1240102) == 0) {
          class165.field2039[i_33] = i_10;
          class165.field2038[i_33] = i_11 - 1;
          i_33 = i_33 + 1 & 0xfff;
          class165.field2035[i_30][i_31 - 1] = 1;
          class165.field2041[i_30][i_31 - 1] = i_21;
        }

        if (i_31 < 127 && class165.field2035[i_30][i_31 + 1] == 0
            && (ints_18[i_19][i_20 + 1] & 0x1240120) == 0) {
          class165.field2039[i_33] = i_10;
          class165.field2038[i_33] = i_11 + 1;
          i_33 = i_33 + 1 & 0xfff;
          class165.field2035[i_30][i_31 + 1] = 4;
          class165.field2041[i_30][i_31 + 1] = i_21;
        }

        if (i_30 > 0 && i_31 > 0 && class165.field2035[i_30 - 1][i_31 - 1] == 0
            && (ints_18[i_19 - 1][i_20 - 1] & 0x124010e) == 0
            && (ints_18[i_19 - 1][i_20] & 0x1240108) == 0
            && (ints_18[i_19][i_20 - 1] & 0x1240102) == 0) {
          class165.field2039[i_33] = i_10 - 1;
          class165.field2038[i_33] = i_11 - 1;
          i_33 = i_33 + 1 & 0xfff;
          class165.field2035[i_30 - 1][i_31 - 1] = 3;
          class165.field2041[i_30 - 1][i_31 - 1] = i_21;
        }

        if (i_30 < 127 && i_31 > 0 && class165.field2035[i_30 + 1][i_31 - 1] == 0
            && (ints_18[i_19 + 1][i_20 - 1] & 0x1240183) == 0
            && (ints_18[i_19 + 1][i_20] & 0x1240180) == 0
            && (ints_18[i_19][i_20 - 1] & 0x1240102) == 0) {
          class165.field2039[i_33] = i_10 + 1;
          class165.field2038[i_33] = i_11 - 1;
          i_33 = i_33 + 1 & 0xfff;
          class165.field2035[i_30 + 1][i_31 - 1] = 9;
          class165.field2041[i_30 + 1][i_31 - 1] = i_21;
        }

        if (i_30 > 0 && i_31 < 127 && class165.field2035[i_30 - 1][i_31 + 1] == 0
            && (ints_18[i_19 - 1][i_20 + 1] & 0x1240138) == 0
            && (ints_18[i_19 - 1][i_20] & 0x1240108) == 0
            && (ints_18[i_19][i_20 + 1] & 0x1240120) == 0) {
          class165.field2039[i_33] = i_10 - 1;
          class165.field2038[i_33] = i_11 + 1;
          i_33 = i_33 + 1 & 0xfff;
          class165.field2035[i_30 - 1][i_31 + 1] = 6;
          class165.field2041[i_30 - 1][i_31 + 1] = i_21;
        }

        if (i_30 < 127 && i_31 < 127 && class165.field2035[i_30 + 1][i_31 + 1] == 0
            && (ints_18[i_19 + 1][i_20 + 1] & 0x12401e0) == 0
            && (ints_18[i_19 + 1][i_20] & 0x1240180) == 0
            && (ints_18[i_19][i_20 + 1] & 0x1240120) == 0) {
          class165.field2039[i_33] = i_10 + 1;
          class165.field2038[i_33] = i_11 + 1;
          i_33 = i_33 + 1 & 0xfff;
          class165.field2035[i_30 + 1][i_31 + 1] = 12;
          class165.field2041[i_30 + 1][i_31 + 1] = i_21;
        }
      }

      bool_28 = bool_29;
    } else if (i_2 == 2) {
      bool_28 = class40.method693(i_0, i_1, class166_3, class164_4);
    } else {
      bool_28 = class21.method273(i_0, i_1, i_2, class166_3, class164_4);
    }

    i_9 = i_0 - 64;
    i_10 = i_1 - 64;
    i_11 = class19.field152;
    i_30 = class165.field2037;
    if (!bool_28) {
      i_31 = Integer.MAX_VALUE;
      i_14 = Integer.MAX_VALUE;
      byte b_32 = 10;
      i_33 = class166_3.field2043;
      i_17 = class166_3.field2048;
      int i_27 = class166_3.field2042;
      i_19 = class166_3.field2045;

      for (i_20 = i_33 - b_32; i_20 <= b_32 + i_33; i_20++) {
        for (i_21 = i_17 - b_32; i_21 <= b_32 + i_17; i_21++) {
          int i_22 = i_20 - i_9;
          int i_23 = i_21 - i_10;
          if (i_22 >= 0 && i_23 >= 0 && i_22 < 128 && i_23 < 128
              && class165.field2041[i_22][i_23] < 100) {
            int i_24 = 0;
            if (i_20 < i_33) {
              i_24 = i_33 - i_20;
            } else if (i_20 > i_27 + i_33 - 1) {
              i_24 = i_20 - (i_27 + i_33 - 1);
            }

            int i_25 = 0;
            if (i_21 < i_17) {
              i_25 = i_17 - i_21;
            } else if (i_21 > i_17 + i_19 - 1) {
              i_25 = i_21 - (i_17 + i_19 - 1);
            }

            int i_26 = i_24 * i_24 + i_25 * i_25;
            if (i_26 < i_31 || i_31 == i_26 && class165.field2041[i_22][i_23] < i_14) {
              i_31 = i_26;
              i_14 = class165.field2041[i_22][i_23];
              i_11 = i_20;
              i_30 = i_21;
            }
          }
        }
      }

      if (i_31 == Integer.MAX_VALUE) {
        return -1;
      }
    }

    if (i_0 == i_11 && i_30 == i_1) {
      return 0;
    } else {
      b_13 = 0;
      class165.field2039[b_13] = i_11;
      i_31 = b_13 + 1;
      class165.field2038[b_13] = i_30;

      for (i_14 = i_15 = class165.field2035[i_11 - i_9][i_30 - i_10]; i_0 != i_11 || i_30 != i_1;
          i_14 = class165.field2035[i_11 - i_9][i_30 - i_10]) {
        if (i_15 != i_14) {
          i_15 = i_14;
          class165.field2039[i_31] = i_11;
          class165.field2038[i_31++] = i_30;
        }

        if ((i_14 & 0x2) != 0) {
          ++i_11;
        } else if ((i_14 & 0x8) != 0) {
          --i_11;
        }

        if ((i_14 & 0x1) != 0) {
          ++i_30;
        } else if ((i_14 & 0x4) != 0) {
          --i_30;
        }
      }

      i_33 = 0;

      while (i_31-- > 0) {
        ints_6[i_33] = class165.field2039[i_31];
        ints_7[i_33++] = class165.field2038[i_31];
        if (i_33 >= ints_6.length) {
          break;
        }
      }

      return i_33;
    }
  }

  @ObfuscatedName("hd")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "464504900"
  )
  static final void method2564(int i_0) {
    if (i_0 >= 0) {
      int i_1 = client.field718[i_0];
      int i_2 = client.field851[i_0];
      int i_3 = client.field720[i_0];
      int i_4 = client.field794[i_0];
      String string_5 = client.field735[i_0];
      String string_6 = client.field740[i_0];
      Keyboard.method692(i_1, i_2, i_3, i_4, string_5, string_6, Mouse.field432, Mouse.field428);
    }
  }

  @ObfuscatedName("jz")
  @ObfuscatedSignature(
      signature = "(Lhi;II)Ljava/lang/String;",
      garbageValue = "878774611"
  )
  static String method2565(class230 class230_0, int i_1) {
    return !class97.method2214(class24.method425(class230_0), i_1) && class230_0.field2706 == null
        ? null : (class230_0.field2680 != null && class230_0.field2680.length > i_1
        && class230_0.field2680[i_1] != null && class230_0.field2680[i_1].trim().length() != 0
        ? class230_0.field2680[i_1] : null);
  }

}
