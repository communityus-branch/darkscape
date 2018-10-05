package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class26 {

  @ObfuscatedName("bg")
  static String field219;
  @ObfuscatedName("by")
  @ObfuscatedSignature(
      signature = "Lbq;"
  )
  static class57 field220;
  @ObfuscatedName("dc")
  @ObfuscatedGetter(
      intValue = 1566983967
  )
  static int field223;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)Lhi;",
      garbageValue = "-49"
  )
  public static class230 method434(int i_0) {
    int i_1 = i_0 >> 16;
    int i_2 = i_0 & 0xffff;
    if (class42.field366[i_1] == null || class42.field366[i_1][i_2] == null) {
      boolean bool_3 = class261.method4931(i_1);
      if (!bool_3) {
        return null;
      }
    }

    return class42.field366[i_1][i_2];
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1481626830"
  )
  public static void method427(int i_0) {
    class217.field2460 = 1;
    class138.field1871 = null;
    class217.field2461 = -1;
    class217.field2462 = -1;
    class309.field3740 = 0;
    class217.field2463 = false;
    class6.field37 = i_0;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Lbb;Lbb;IZB)I",
      garbageValue = "30"
  )
  static int method428(class65 class65_0, class65 class65_1, int i_2, boolean bool_3) {
    if (i_2 == 1) {
      int i_4 = class65_0.field955;
      int i_5 = class65_1.field955;
      if (!bool_3) {
        if (i_4 == -1) {
          i_4 = 2001;
        }

        if (i_5 == -1) {
          i_5 = 2001;
        }
      }

      return i_4 - i_5;
    } else {
      return i_2 == 2 ? class65_0.field952 - class65_1.field952
          : (i_2 == 3 ? (class65_0.field951.equals("-") ? (class65_1.field951.equals("-") ? 0
              : (bool_3 ? -1 : 1)) : (class65_1.field951.equals("-") ? (bool_3 ? 1 : -1)
              : class65_0.field951.compareTo(class65_1.field951)))
              : (i_2 == 4 ? (class65_0.method1569() ? (class65_1.method1569() ? 0 : 1)
                  : (class65_1.method1569() ? -1 : 0))
                  : (i_2 == 5 ? (class65_0.method1567() ? (class65_1.method1567() ? 0 : 1)
                      : (class65_1.method1567() ? -1 : 0))
                      : (i_2 == 6 ? (class65_0.method1568() ? (class65_1.method1568() ? 0 : 1)
                          : (class65_1.method1568() ? -1 : 0))
                          : (i_2 == 7 ? (class65_0.method1589() ? (class65_1.method1589() ? 0 : 1)
                              : (class65_1.method1589() ? -1 : 0))
                              : class65_0.field947 - class65_1.field947)))));
    }
  }

}
