package rs.darkscape.client;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
final class class3 implements Comparator {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)Ljn;",
      garbageValue = "1221940475"
  )
  public static class273 method25(int i_0) {
    class273 class273_1 = (class273) class273.field3552.method3989((long) i_0);
    if (class273_1 != null) {
      return class273_1;
    } else {
      byte[] bytes_2 = class273.field3538.method4625(12, i_0);
      class273_1 = new class273();
      if (bytes_2 != null) {
        class273_1.method5212(new Buffer(bytes_2));
      }

      class273_1.method5220();
      class273.field3552.method3983(class273_1, (long) i_0);
      return class273_1;
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-32"
  )
  public static int method32(int i_0) {
    return class37.method662(class120.field1647[i_0]);
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "1737027052"
  )
  public static int method35(CharSequence charsequence_0) {
    int i_1 = charsequence_0.length();
    int i_2 = 0;

    for (int i_3 = 0; i_3 < i_1; i_3++) {
      i_2 = (i_2 << 5) - i_2 + charsequence_0.charAt(i_3);
    }

    return i_2;
  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1924220675"
  )
  public static void method34() {
    class268.field3371.method3984();
    class268.field3391.method3984();
    class268.field3370.method3984();
    class268.field3374.method3984();
  }

  @ObfuscatedName("fz")
  @ObfuscatedSignature(
      signature = "(Lba;I)V",
      garbageValue = "-1623829882"
  )
  static final void method26(class63 class63_0) {
    if (class63_0.field924 != 0) {
      if (class63_0.field897 != -1) {
        Object obj_1 = null;
        if (class63_0.field897 < 32768) {
          obj_1 = client.field843[class63_0.field897];
        } else if (class63_0.field897 >= 32768) {
          obj_1 = client.field610[class63_0.field897 - 32768];
        }

        if (obj_1 != null) {
          int i_2 = class63_0.field931 - ((class63) obj_1).field931;
          int i_3 = class63_0.field881 - ((class63) obj_1).field881;
          if (i_2 != 0 || i_3 != 0) {
            class63_0.field926 = (int) (Math.atan2((double) i_2, (double) i_3) * 325.949D) & 0x7ff;
          }
        } else if (class63_0.field898) {
          class63_0.field897 = -1;
          class63_0.field898 = false;
        }
      }

      if (class63_0.field920 != -1 && (class63_0.field909 == 0 || class63_0.field923 > 0)) {
        class63_0.field926 = class63_0.field920;
        class63_0.field920 = -1;
      }

      int i_4 = class63_0.field926 - class63_0.field905 & 0x7ff;
      if (i_4 == 0 && class63_0.field898) {
        class63_0.field897 = -1;
        class63_0.field898 = false;
      }

      if (i_4 != 0) {
        ++class63_0.field875;
        boolean bool_6;
        if (i_4 > 1024) {
          class63_0.field905 -= class63_0.field924;
          bool_6 = true;
          if (i_4 < class63_0.field924 || i_4 > 2048 - class63_0.field924) {
            class63_0.field905 = class63_0.field926;
            bool_6 = false;
          }

          if (class63_0.field893 == class63_0.field900 && (class63_0.field875 > 25 || bool_6)) {
            if (class63_0.field877 != -1) {
              class63_0.field900 = class63_0.field877;
            } else {
              class63_0.field900 = class63_0.field899;
            }
          }
        } else {
          class63_0.field905 += class63_0.field924;
          bool_6 = true;
          if (i_4 < class63_0.field924 || i_4 > 2048 - class63_0.field924) {
            class63_0.field905 = class63_0.field926;
            bool_6 = false;
          }

          if (class63_0.field893 == class63_0.field900 && (class63_0.field875 > 25 || bool_6)) {
            if (class63_0.field878 != -1) {
              class63_0.field900 = class63_0.field878;
            } else {
              class63_0.field900 = class63_0.field899;
            }
          }
        }

        class63_0.field905 &= 0x7ff;
      } else {
        class63_0.field875 = 0;
      }

    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ls;Ls;I)I",
      garbageValue = "2100734637"
  )
  int method24(class2 class2_1, class2 class2_2) {
    return class2_1.field17.field33 < class2_2.field17.field33 ? -1
        : (class2_2.field17.field33 == class2_1.field17.field33 ? 0 : 1);
  }

  public boolean equals(Object object_1) {
    return super.equals(object_1);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method24((class2) object_1, (class2) object_2);
  }

}
