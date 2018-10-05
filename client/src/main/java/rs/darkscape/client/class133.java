package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public final class class133 {

  @ObfuscatedName("pv")
  @ObfuscatedGetter(
      intValue = -470021269
  )
  static int field1834;
  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "Ldf;"
  )
  public class127 field1823;
  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "Ldf;"
  )
  public class127 field1831;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      longValue = -9170110495421091263L
  )
  public long field1824 = 0L;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 855735479
  )
  int field1826;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -2145900331
  )
  int field1832;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -568631363
  )
  int field1828;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -970601677
  )
  int field1825;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 409489705
  )
  int field1827;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -995153033
  )
  int field1830;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 1452216279
  )
  int field1829;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = 1910323591
  )
  int field1833 = 0;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)Lce;",
      garbageValue = "-1297454162"
  )
  static class84 method3099(int i_0) {
    class84 class84_1 = (class84) class84.field1190.method3989((long) i_0);
    if (class84_1 != null) {
      return class84_1;
    } else {
      byte[] bytes_2 = client.field854.method4625(i_0, 0);
      if (bytes_2 == null) {
        return null;
      } else {
        class84_1 = class10.method97(bytes_2);
        class84.field1190.method3983(class84_1, (long) i_0);
        return class84_1;
      }
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SB)V",
      garbageValue = "4"
  )
  public static void method3100(String[] arr_0, short[] shorts_1) {
    method3101(arr_0, shorts_1, 0, arr_0.length - 1);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SIII)V",
      garbageValue = "-659552878"
  )
  static void method3101(String[] arr_0, short[] shorts_1, int i_2, int i_3) {
    if (i_2 < i_3) {
      int i_4 = (i_3 + i_2) / 2;
      int i_5 = i_2;
      String string_6 = arr_0[i_4];
      arr_0[i_4] = arr_0[i_3];
      arr_0[i_3] = string_6;
      short s_7 = shorts_1[i_4];
      shorts_1[i_4] = shorts_1[i_3];
      shorts_1[i_3] = s_7;

      for (int i_8 = i_2; i_8 < i_3; i_8++) {
        if (string_6 == null || arr_0[i_8] != null && arr_0[i_8].compareTo(string_6) < (i_8
            & 0x1)) {
          String string_9 = arr_0[i_8];
          arr_0[i_8] = arr_0[i_5];
          arr_0[i_5] = string_9;
          short s_10 = shorts_1[i_8];
          shorts_1[i_8] = shorts_1[i_5];
          shorts_1[i_5++] = s_10;
        }
      }

      arr_0[i_3] = arr_0[i_5];
      arr_0[i_5] = string_6;
      shorts_1[i_3] = shorts_1[i_5];
      shorts_1[i_5] = s_7;
      method3101(arr_0, shorts_1, i_2, i_5 - 1);
      method3101(arr_0, shorts_1, i_5 + 1, i_3);
    }

  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "30"
  )
  static final void method3098() {
    short s_0 = 256;
    int i_1;
    if (class78.field1088 > 0) {
      for (i_1 = 0; i_1 < 256; i_1++) {
        if (class78.field1088 > 768) {
          class77.field1077[i_1] = class33
              .method558(class64.field936[i_1], class185.field2364[i_1], 1024 - class78.field1088);
        } else if (class78.field1088 > 256) {
          class77.field1077[i_1] = class185.field2364[i_1];
        } else {
          class77.field1077[i_1] = class33
              .method558(class185.field2364[i_1], class64.field936[i_1], 256 - class78.field1088);
        }
      }
    } else if (class78.field1094 > 0) {
      for (i_1 = 0; i_1 < 256; i_1++) {
        if (class78.field1094 > 768) {
          class77.field1077[i_1] = class33
              .method558(class64.field936[i_1], class11.field69[i_1], 1024 - class78.field1094);
        } else if (class78.field1094 > 256) {
          class77.field1077[i_1] = class11.field69[i_1];
        } else {
          class77.field1077[i_1] = class33
              .method558(class11.field69[i_1], class64.field936[i_1], 256 - class78.field1094);
        }
      }
    } else {
      for (i_1 = 0; i_1 < 256; i_1++) {
        class77.field1077[i_1] = class64.field936[i_1];
      }
    }

    class314.method5720(class78.field1082, 9, class78.field1082 + 128, s_0 + 7);
    class78.field1092.method5849(class78.field1082, 0);
    class314.method5719();
    i_1 = 0;
    int i_2 = Temp.field2014.field3767 * 9 + class78.field1082;

    int i_3;
    int i_4;
    int i_5;
    int i_6;
    int i_7;
    int i_8;
    int i_9;
    int i_10;
    for (i_3 = 1; i_3 < s_0 - 1; i_3++) {
      i_4 = class78.field1093[i_3] * (s_0 - i_3) / s_0;
      i_5 = i_4 + 22;
      if (i_5 < 0) {
        i_5 = 0;
      }

      i_1 += i_5;

      for (i_6 = i_5; i_6 < 128; i_6++) {
        i_7 = class40.field357[i_1++];
        if (i_7 != 0) {
          i_8 = i_7;
          i_9 = 256 - i_7;
          i_7 = class77.field1077[i_7];
          i_10 = Temp.field2014.field3768[i_2];
          Temp.field2014.field3768[i_2++] =
              ((i_7 & 0xff00ff) * i_8 + (i_10 & 0xff00ff) * i_9 & ~0xff00ff) + (
                  i_8 * (i_7 & 0xff00) + i_9 * (i_10 & 0xff00) & 0xff0000) >> 8;
        } else {
          ++i_2;
        }
      }

      i_2 += i_5 + Temp.field2014.field3767 - 128;
    }

    class314.method5720(class78.field1082 + 765 - 128, 9, class78.field1082 + 765, s_0 + 7);
    class78.field1087.method5849(class78.field1082 + 382, 0);
    class314.method5719();
    i_1 = 0;
    i_2 = Temp.field2014.field3767 * 9 + class78.field1082 + 637 + 24;

    for (i_3 = 1; i_3 < s_0 - 1; i_3++) {
      i_4 = class78.field1093[i_3] * (s_0 - i_3) / s_0;
      i_5 = 103 - i_4;
      i_2 += i_4;

      for (i_6 = 0; i_6 < i_5; i_6++) {
        i_7 = class40.field357[i_1++];
        if (i_7 != 0) {
          i_8 = i_7;
          i_9 = 256 - i_7;
          i_7 = class77.field1077[i_7];
          i_10 = Temp.field2014.field3768[i_2];
          Temp.field2014.field3768[i_2++] =
              ((i_7 & 0xff00ff) * i_8 + (i_10 & 0xff00ff) * i_9 & ~0xff00ff) + (
                  i_9 * (i_10 & 0xff00) + i_8 * (i_7 & 0xff00) & 0xff0000) >> 8;
        } else {
          ++i_2;
        }
      }

      i_1 += 128 - i_5;
      i_2 += Temp.field2014.field3767 - i_5 - i_4;
    }

  }

}
