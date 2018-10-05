package rs.darkscape.client;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class137 implements Comparator {

  @ObfuscatedName("z")
  final boolean field1870;

  public class137(boolean bool_1) {
    this.field1870 = bool_1;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)Lll;",
      garbageValue = "-1573456149"
  )
  public static class318 method3127(AbstractPack class247_0, String string_1, String string_2) {
    int i_3 = class247_0.method4642(string_1);
    int i_4 = class247_0.method4643(i_3, string_2);
    return class229.method4499(class247_0, i_3, i_4);
  }

  @ObfuscatedName("ie")
  @ObfuscatedSignature(
      signature = "(Lhi;II)I",
      garbageValue = "1207234398"
  )
  static final int method3119(class230 class230_0, int i_1) {
    if (class230_0.field2659 != null && i_1 < class230_0.field2659.length) {
      try {
        int[] ints_2 = class230_0.field2659[i_1];
        int i_3 = 0;
        int i_4 = 0;
        byte b_5 = 0;

        while (true) {
          int i_6 = ints_2[i_4++];
          int i_7 = 0;
          byte b_8 = 0;
          if (i_6 == 0) {
            return i_3;
          }

          if (i_6 == 1) {
            i_7 = client.field712[ints_2[i_4++]];
          }

          if (i_6 == 2) {
            i_7 = client.field713[ints_2[i_4++]];
          }

          if (i_6 == 3) {
            i_7 = client.field640[ints_2[i_4++]];
          }

          int i_9;
          class230 class230_10;
          int i_11;
          int i_12;
          if (i_6 == 4) {
            i_9 = ints_2[i_4++] << 16;
            i_9 += ints_2[i_4++];
            class230_10 = class26.method434(i_9);
            i_11 = ints_2[i_4++];
            if (i_11 != -1 && (!class111.method2563(i_11).field3446 || client.field668)) {
              for (i_12 = 0; i_12 < class230_10.field2724.length; i_12++) {
                if (i_11 + 1 == class230_10.field2724[i_12]) {
                  i_7 += class230_10.field2725[i_12];
                }
              }
            }
          }

          if (i_6 == 5) {
            i_7 = class225.field2558[ints_2[i_4++]];
          }

          if (i_6 == 6) {
            i_7 = class234.field2779[client.field713[ints_2[i_4++]] - 1];
          }

          if (i_6 == 7) {
            i_7 = class225.field2558[ints_2[i_4++]] * 100 / 46875;
          }

          if (i_6 == 8) {
            i_7 = class138.field1876.field551;
          }

          if (i_6 == 9) {
            for (i_9 = 0; i_9 < 25; i_9++) {
              if (class234.field2780[i_9]) {
                i_7 += client.field713[i_9];
              }
            }
          }

          if (i_6 == 10) {
            i_9 = ints_2[i_4++] << 16;
            i_9 += ints_2[i_4++];
            class230_10 = class26.method434(i_9);
            i_11 = ints_2[i_4++];
            if (i_11 != -1 && (!class111.method2563(i_11).field3446 || client.field668)) {
              for (i_12 = 0; i_12 < class230_10.field2724.length; i_12++) {
                if (i_11 + 1 == class230_10.field2724[i_12]) {
                  i_7 = 999999999;
                  break;
                }
              }
            }
          }

          if (i_6 == 11) {
            i_7 = client.field745;
          }

          if (i_6 == 12) {
            i_7 = client.field782;
          }

          if (i_6 == 13) {
            i_9 = class225.field2558[ints_2[i_4++]];
            int i_13 = ints_2[i_4++];
            i_7 = (i_9 & 1 << i_13) != 0 ? 1 : 0;
          }

          if (i_6 == 14) {
            i_9 = ints_2[i_4++];
            i_7 = Temp.method3389(i_9);
          }

          if (i_6 == 15) {
            b_8 = 1;
          }

          if (i_6 == 16) {
            b_8 = 2;
          }

          if (i_6 == 17) {
            b_8 = 3;
          }

          if (i_6 == 18) {
            i_7 = (class138.field1876.field931 >> 7) + class62.field868;
          }

          if (i_6 == 19) {
            i_7 = (class138.field1876.field881 >> 7) + client.field754;
          }

          if (i_6 == 20) {
            i_7 = ints_2[i_4++];
          }

          if (b_8 == 0) {
            if (b_5 == 0) {
              i_3 += i_7;
            }

            if (b_5 == 1) {
              i_3 -= i_7;
            }

            if (b_5 == 2 && i_7 != 0) {
              i_3 /= i_7;
            }

            if (b_5 == 3) {
              i_3 *= i_7;
            }

            b_5 = 0;
          } else {
            b_5 = b_8;
          }
        }
      } catch (Exception exception_14) {
        return -1;
      }
    } else {
      return -2;
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "2097631968"
  )
  int method3120(class287 class287_1, class287 class287_2) {
    return this.field1870 ? class287_1.field3627 - class287_2.field3627
        : class287_2.field3627 - class287_1.field3627;
  }

  public boolean equals(Object object_1) {
    return super.equals(object_1);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method3120((class287) object_1, (class287) object_2);
  }

}
