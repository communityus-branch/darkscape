package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class40 implements class89 {

  @ObfuscatedName("aw")
  static int[] field357;
  @ObfuscatedName("ki")
  @ObfuscatedGetter(
      intValue = 172478671
  )
  static int field361;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
  )
  static void method695() {
    class50.field442 = 99;
    class50.field445 = new byte[4][104][104];
    class165.field2033 = new byte[4][104][104];
    class50.field446 = new byte[4][104][104];
    class19.field159 = new byte[4][104][104];
    class37.field325 = new int[4][105][105];
    class50.field447 = new byte[4][105][105];
    class50.field448 = new int[105][105];
    class50.field454 = new int[104];
    class305.field3725 = new int[104];
    class72.field1035 = new int[104];
    class263.field3325 = new int[104];
    class243.field3137 = new int[104];
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IILfw;Lfk;I)Z",
      garbageValue = "-1332801903"
  )
  static final boolean method693(int i_0, int i_1, class166 class166_2, class164 class164_3) {
    int i_4 = i_0;
    int i_5 = i_1;
    byte b_6 = 64;
    byte b_7 = 64;
    int i_8 = i_0 - b_6;
    int i_9 = i_1 - b_7;
    class165.field2035[b_6][b_7] = 99;
    class165.field2041[b_6][b_7] = 0;
    byte b_10 = 0;
    int i_11 = 0;
    class165.field2039[b_10] = i_0;
    byte b_10001 = b_10;
    int i_18 = b_10 + 1;
    class165.field2038[b_10001] = i_1;
    int[][] ints_12 = class164_3.field2029;

    while (i_11 != i_18) {
      i_4 = class165.field2039[i_11];
      i_5 = class165.field2038[i_11];
      i_11 = i_11 + 1 & 0xfff;
      int i_16 = i_4 - i_8;
      int i_17 = i_5 - i_9;
      int i_13 = i_4 - class164_3.field2025;
      int i_14 = i_5 - class164_3.field2026;
      if (class166_2.vmethod3440(2, i_4, i_5, class164_3)) {
        class19.field152 = i_4;
        class165.field2037 = i_5;
        return true;
      }

      int i_15 = class165.field2041[i_16][i_17] + 1;
      if (i_16 > 0 && class165.field2035[i_16 - 1][i_17] == 0
          && (ints_12[i_13 - 1][i_14] & 0x124010e) == 0
          && (ints_12[i_13 - 1][i_14 + 1] & 0x1240138) == 0) {
        class165.field2039[i_18] = i_4 - 1;
        class165.field2038[i_18] = i_5;
        i_18 = i_18 + 1 & 0xfff;
        class165.field2035[i_16 - 1][i_17] = 2;
        class165.field2041[i_16 - 1][i_17] = i_15;
      }

      if (i_16 < 126 && class165.field2035[i_16 + 1][i_17] == 0
          && (ints_12[i_13 + 2][i_14] & 0x1240183) == 0
          && (ints_12[i_13 + 2][i_14 + 1] & 0x12401e0) == 0) {
        class165.field2039[i_18] = i_4 + 1;
        class165.field2038[i_18] = i_5;
        i_18 = i_18 + 1 & 0xfff;
        class165.field2035[i_16 + 1][i_17] = 8;
        class165.field2041[i_16 + 1][i_17] = i_15;
      }

      if (i_17 > 0 && class165.field2035[i_16][i_17 - 1] == 0
          && (ints_12[i_13][i_14 - 1] & 0x124010e) == 0
          && (ints_12[i_13 + 1][i_14 - 1] & 0x1240183) == 0) {
        class165.field2039[i_18] = i_4;
        class165.field2038[i_18] = i_5 - 1;
        i_18 = i_18 + 1 & 0xfff;
        class165.field2035[i_16][i_17 - 1] = 1;
        class165.field2041[i_16][i_17 - 1] = i_15;
      }

      if (i_17 < 126 && class165.field2035[i_16][i_17 + 1] == 0
          && (ints_12[i_13][i_14 + 2] & 0x1240138) == 0
          && (ints_12[i_13 + 1][i_14 + 2] & 0x12401e0) == 0) {
        class165.field2039[i_18] = i_4;
        class165.field2038[i_18] = i_5 + 1;
        i_18 = i_18 + 1 & 0xfff;
        class165.field2035[i_16][i_17 + 1] = 4;
        class165.field2041[i_16][i_17 + 1] = i_15;
      }

      if (i_16 > 0 && i_17 > 0 && class165.field2035[i_16 - 1][i_17 - 1] == 0
          && (ints_12[i_13 - 1][i_14] & 0x124013e) == 0
          && (ints_12[i_13 - 1][i_14 - 1] & 0x124010e) == 0
          && (ints_12[i_13][i_14 - 1] & 0x124018f) == 0) {
        class165.field2039[i_18] = i_4 - 1;
        class165.field2038[i_18] = i_5 - 1;
        i_18 = i_18 + 1 & 0xfff;
        class165.field2035[i_16 - 1][i_17 - 1] = 3;
        class165.field2041[i_16 - 1][i_17 - 1] = i_15;
      }

      if (i_16 < 126 && i_17 > 0 && class165.field2035[i_16 + 1][i_17 - 1] == 0
          && (ints_12[i_13 + 1][i_14 - 1] & 0x124018f) == 0
          && (ints_12[i_13 + 2][i_14 - 1] & 0x1240183) == 0
          && (ints_12[i_13 + 2][i_14] & 0x12401e3) == 0) {
        class165.field2039[i_18] = i_4 + 1;
        class165.field2038[i_18] = i_5 - 1;
        i_18 = i_18 + 1 & 0xfff;
        class165.field2035[i_16 + 1][i_17 - 1] = 9;
        class165.field2041[i_16 + 1][i_17 - 1] = i_15;
      }

      if (i_16 > 0 && i_17 < 126 && class165.field2035[i_16 - 1][i_17 + 1] == 0
          && (ints_12[i_13 - 1][i_14 + 1] & 0x124013e) == 0
          && (ints_12[i_13 - 1][i_14 + 2] & 0x1240138) == 0
          && (ints_12[i_13][i_14 + 2] & 0x12401f8) == 0) {
        class165.field2039[i_18] = i_4 - 1;
        class165.field2038[i_18] = i_5 + 1;
        i_18 = i_18 + 1 & 0xfff;
        class165.field2035[i_16 - 1][i_17 + 1] = 6;
        class165.field2041[i_16 - 1][i_17 + 1] = i_15;
      }

      if (i_16 < 126 && i_17 < 126 && class165.field2035[i_16 + 1][i_17 + 1] == 0
          && (ints_12[i_13 + 1][i_14 + 2] & 0x12401f8) == 0
          && (ints_12[i_13 + 2][i_14 + 2] & 0x12401e0) == 0
          && (ints_12[i_13 + 2][i_14 + 1] & 0x12401e3) == 0) {
        class165.field2039[i_18] = i_4 + 1;
        class165.field2038[i_18] = i_5 + 1;
        i_18 = i_18 + 1 & 0xfff;
        class165.field2035[i_16 + 1][i_17 + 1] = 12;
        class165.field2041[i_16 + 1][i_17 + 1] = i_15;
      }
    }

    class19.field152 = i_4;
    class165.field2037 = i_5;
    return false;
  }

  @ObfuscatedName("kz")
  @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "63"
  )
  static boolean method696() {
    return client.field747 >= 2;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)Lcx;",
      garbageValue = "39"
  )
  public class95 vmethod2052() {
    return new class44();
  }

}
