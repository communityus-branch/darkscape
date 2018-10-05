package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class173 {

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1423471307"
  )
  static void method3472(int i_0, String string_1, String string_2, String string_3) {
    class86 class86_4 = (class86) class83.field1180.get(Integer.valueOf(i_0));
    if (class86_4 == null) {
      class86_4 = new class86();
      class83.field1180.put(Integer.valueOf(i_0), class86_4);
    }

    class58 class58_5 = class86_4.method1964(i_0, string_1, string_2, string_3);
    class83.field1181.method3944(class58_5, (long) class58_5.field540);
    class83.field1184.method4155(class58_5);
    client.field770 = client.field801;
  }

  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "1923178651"
  )
  static int method3469(int i_0, class84 class84_1, boolean bool_2) {
    if (i_0 == 3300) {
      class69.field999[++class69.field1003 - 1] = client.field591;
      return 1;
    } else {
      int i_3;
      int i_4;
      if (i_0 == 3301) {
        class69.field1003 -= 2;
        i_3 = class69.field999[class69.field1003];
        i_4 = class69.field999[class69.field1003 + 1];
        class69.field999[++class69.field1003 - 1] = class230.method4559(i_3, i_4);
        return 1;
      } else {
        int[] ints_5;
        int i_6;
        int i_7;
        class53 class53_8;
        if (i_0 == 3302) {
          class69.field1003 -= 2;
          i_3 = class69.field999[class69.field1003];
          i_4 = class69.field999[class69.field1003 + 1];
          ints_5 = class69.field999;
          i_6 = ++class69.field1003 - 1;
          class53_8 = (class53) class53.field474.get((long) i_3);
          if (class53_8 == null) {
            i_7 = 0;
          } else if (i_4 >= 0 && i_4 < class53_8.field473.length) {
            i_7 = class53_8.field473[i_4];
          } else {
            i_7 = 0;
          }

          ints_5[i_6] = i_7;
          return 1;
        } else if (i_0 == 3303) {
          class69.field1003 -= 2;
          i_3 = class69.field999[class69.field1003];
          i_4 = class69.field999[class69.field1003 + 1];
          class69.field999[++class69.field1003 - 1] = class139.method3143(i_3, i_4);
          return 1;
        } else if (i_0 == 3304) {
          i_3 = class69.field999[--class69.field1003];
          class69.field999[++class69.field1003 - 1] = class130.method3074(i_3).field3227;
          return 1;
        } else if (i_0 == 3305) {
          i_3 = class69.field999[--class69.field1003];
          class69.field999[++class69.field1003 - 1] = client.field712[i_3];
          return 1;
        } else if (i_0 == 3306) {
          i_3 = class69.field999[--class69.field1003];
          class69.field999[++class69.field1003 - 1] = client.field713[i_3];
          return 1;
        } else if (i_0 == 3307) {
          i_3 = class69.field999[--class69.field1003];
          class69.field999[++class69.field1003 - 1] = client.field640[i_3];
          return 1;
        } else {
          int i_9;
          if (i_0 == 3308) {
            i_3 = class13.field82;
            i_4 = (class138.field1876.field931 >> 7) + class62.field868;
            i_9 = (class138.field1876.field881 >> 7) + client.field754;
            class69.field999[++class69.field1003 - 1] = (i_4 << 14) + i_9 + (i_3 << 28);
            return 1;
          } else if (i_0 == 3309) {
            i_3 = class69.field999[--class69.field1003];
            class69.field999[++class69.field1003 - 1] = i_3 >> 14 & 0x3fff;
            return 1;
          } else if (i_0 == 3310) {
            i_3 = class69.field999[--class69.field1003];
            class69.field999[++class69.field1003 - 1] = i_3 >> 28;
            return 1;
          } else if (i_0 == 3311) {
            i_3 = class69.field999[--class69.field1003];
            class69.field999[++class69.field1003 - 1] = i_3 & 0x3fff;
            return 1;
          } else if (i_0 == 3312) {
            class69.field999[++class69.field1003 - 1] = client.field668 ? 1 : 0;
            return 1;
          } else if (i_0 == 3313) {
            class69.field1003 -= 2;
            i_3 = class69.field999[class69.field1003] + 32768;
            i_4 = class69.field999[class69.field1003 + 1];
            class69.field999[++class69.field1003 - 1] = class230.method4559(i_3, i_4);
            return 1;
          } else if (i_0 != 3314) {
            if (i_0 == 3315) {
              class69.field1003 -= 2;
              i_3 = class69.field999[class69.field1003] + 32768;
              i_4 = class69.field999[class69.field1003 + 1];
              class69.field999[++class69.field1003 - 1] = class139.method3143(i_3, i_4);
              return 1;
            } else if (i_0 == 3316) {
              if (client.field747 >= 2) {
                class69.field999[++class69.field1003 - 1] = client.field747;
              } else {
                class69.field999[++class69.field1003 - 1] = 0;
              }

              return 1;
            } else if (i_0 == 3317) {
              class69.field999[++class69.field1003 - 1] = client.field598;
              return 1;
            } else if (i_0 == 3318) {
              class69.field999[++class69.field1003 - 1] = client.field581;
              return 1;
            } else if (i_0 == 3321) {
              class69.field999[++class69.field1003 - 1] = client.field745;
              return 1;
            } else if (i_0 == 3322) {
              class69.field999[++class69.field1003 - 1] = client.field782;
              return 1;
            } else if (i_0 == 3323) {
              if (client.field776) {
                class69.field999[++class69.field1003 - 1] = 1;
              } else {
                class69.field999[++class69.field1003 - 1] = 0;
              }

              return 1;
            } else if (i_0 == 3324) {
              class69.field999[++class69.field1003 - 1] = client.field632;
              return 1;
            } else if (i_0 == 3325) {
              class69.field1003 -= 4;
              i_3 = class69.field999[class69.field1003];
              i_4 = class69.field999[class69.field1003 + 1];
              i_9 = class69.field999[class69.field1003 + 2];
              i_6 = class69.field999[class69.field1003 + 3];
              i_3 += i_4 << 14;
              i_3 += i_9 << 28;
              i_3 += i_6;
              class69.field999[++class69.field1003 - 1] = i_3;
              return 1;
            } else {
              return 2;
            }
          } else {
            class69.field1003 -= 2;
            i_3 = class69.field999[class69.field1003] + 32768;
            i_4 = class69.field999[class69.field1003 + 1];
            ints_5 = class69.field999;
            i_6 = ++class69.field1003 - 1;
            class53_8 = (class53) class53.field474.get((long) i_3);
            if (class53_8 == null) {
              i_7 = 0;
            } else if (i_4 >= 0 && i_4 < class53_8.field473.length) {
              i_7 = class53_8.field473[i_4];
            } else {
              i_7 = 0;
            }

            ints_5[i_6] = i_7;
            return 1;
          }
        }
      }
    }
  }

  @ObfuscatedName("fi")
  @ObfuscatedSignature(
      signature = "(Ljn;IIII)V",
      garbageValue = "1672351117"
  )
  static void method3471(class273 class273_0, int i_1, int i_2, int i_3) {
    if (client.field656 < 50 && client.field815 != 0) {
      if (class273_0.field3543 != null && i_1 < class273_0.field3543.length) {
        int i_4 = class273_0.field3543[i_1];
        if (i_4 != 0) {
          int i_5 = i_4 >> 8;
          int i_6 = i_4 >> 4 & 0x7;
          int i_7 = i_4 & 0xf;
          client.field817[client.field656] = i_5;
          client.field676[client.field656] = i_6;
          client.field819[client.field656] = 0;
          client.field719[client.field656] = null;
          int i_8 = (i_2 - 64) / 128;
          int i_9 = (i_3 - 64) / 128;
          client.field820[client.field656] = i_7 + (i_9 << 8) + (i_8 << 16);
          ++client.field656;
        }
      }
    }
  }

  @ObfuscatedName("iy")
  @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "1"
  )
  static boolean method3470(int i_0) {
    return i_0 == 57 || i_0 == 58 || i_0 == 1007 || i_0 == 25 || i_0 == 30;
  }

  @ObfuscatedName("jq")
  @ObfuscatedSignature(
      signature = "(Lhi;IIIS)V",
      garbageValue = "-9115"
  )
  static final void method3473(class230 class230_0, int i_1, int i_2, int i_3) {
    class54.method1017();
    class224 class224_4 = class230_0.method4517(false);
    if (class224_4 != null) {
      class314.method5720(i_1, i_2, class224_4.field2553 + i_1, i_2 + class224_4.field2549);
      if (client.field810 != 2 && client.field810 != 5) {
        int i_5 = client.field717 & 0x7ff;
        int i_6 = class138.field1876.field931 / 32 + 48;
        int i_7 = 464 - class138.field1876.field881 / 32;
        class72.field1038
            .method5845(i_1, i_2, class224_4.field2553, class224_4.field2549, i_6, i_7, i_5, 256,
                        class224_4.field2551, class224_4.field2550);

        int i_8;
        int i_9;
        int i_10;
        for (i_8 = 0; i_8 < client.field724; i_8++) {
          i_9 = client.field805[i_8] * 4 + 2 - class138.field1876.field931 / 32;
          i_10 = client.field806[i_8] * 4 + 2 - class138.field1876.field881 / 32;
          class55.method1022(i_1, i_2, i_9, i_10, client.field816[i_8], class224_4);
        }

        int i_11;
        int i_12;
        for (i_8 = 0; i_8 < 104; i_8++) {
          for (i_9 = 0; i_9 < 104; i_9++) {
            Deque class205_15 = client.field708[class13.field82][i_8][i_9];
            if (class205_15 != null) {
              i_11 = i_8 * 4 + 2 - class138.field1876.field931 / 32;
              i_12 = i_9 * 4 + 2 - class138.field1876.field881 / 32;
              class55.method1022(i_1, i_2, i_11, i_12, class36.field314[0], class224_4);
            }
          }
        }

        for (i_8 = 0; i_8 < client.field622; i_8++) {
          class72 class72_16 = client.field843[client.field639[i_8]];
          if (class72_16 != null && class72_16.vmethod1786()) {
            class271 class271_18 = class72_16.field1037;
            if (class271_18 != null && class271_18.field3516 != null) {
              class271_18 = class271_18.method5189();
            }

            if (class271_18 != null && class271_18.field3507 && class271_18.field3504) {
              i_11 = class72_16.field931 / 32 - class138.field1876.field931 / 32;
              i_12 = class72_16.field881 / 32 - class138.field1876.field881 / 32;
              class55.method1022(i_1, i_2, i_11, i_12, class36.field314[1], class224_4);
            }
          }
        }

        i_8 = class81.field1167;
        int[] ints_19 = class81.field1159;

        for (i_10 = 0; i_10 < i_8; i_10++) {
          class60 class60_17 = client.field610[ints_19[i_10]];
          if (class60_17 != null && class60_17.vmethod1786() && !class60_17.field566
              && class60_17 != class138.field1876) {
            i_12 = class60_17.field931 / 32 - class138.field1876.field931 / 32;
            int i_13 = class60_17.field881 / 32 - class138.field1876.field881 / 32;
            boolean bool_14 = false;
            if (class138.field1876.field568 != 0 && class60_17.field568 != 0
                && class60_17.field568 == class138.field1876.field568) {
              bool_14 = true;
            }

            if (class60_17.method1083()) {
              class55.method1022(i_1, i_2, i_12, i_13, class36.field314[3], class224_4);
            } else if (bool_14) {
              class55.method1022(i_1, i_2, i_12, i_13, class36.field314[4], class224_4);
            } else if (class60_17.method1104()) {
              class55.method1022(i_1, i_2, i_12, i_13, class36.field314[5], class224_4);
            } else {
              class55.method1022(i_1, i_2, i_12, i_13, class36.field314[2], class224_4);
            }
          }
        }

        if (client.field599 != 0 && client.field591 % 20 < 10) {
          if (client.field599 == 1 && client.field600 >= 0
              && client.field600 < client.field843.length) {
            class72 class72_20 = client.field843[client.field600];
            if (class72_20 != null) {
              i_11 = class72_20.field931 / 32 - class138.field1876.field931 / 32;
              i_12 = class72_20.field881 / 32 - class138.field1876.field881 / 32;
              class121.method2783(i_1, i_2, i_11, i_12, class111.field1446[1], class224_4);
            }
          }

          if (client.field599 == 2) {
            i_10 =
                client.field602 * 4 - class62.field868 * 4 + 2 - class138.field1876.field931 / 32;
            i_11 = client.field818 * 4 - client.field754 * 4 + 2 - class138.field1876.field881 / 32;
            class121.method2783(i_1, i_2, i_10, i_11, class111.field1446[1], class224_4);
          }

          if (client.field599 == 10 && client.field579 >= 0
              && client.field579 < client.field610.length) {
            class60 class60_21 = client.field610[client.field579];
            if (class60_21 != null) {
              i_11 = class60_21.field931 / 32 - class138.field1876.field931 / 32;
              i_12 = class60_21.field881 / 32 - class138.field1876.field881 / 32;
              class121.method2783(i_1, i_2, i_11, i_12, class111.field1446[1], class224_4);
            }
          }
        }

        if (client.field808 != 0) {
          i_10 = client.field808 * 4 + 2 - class138.field1876.field931 / 32;
          i_11 = client.field809 * 4 + 2 - class138.field1876.field881 / 32;
          class55.method1022(i_1, i_2, i_10, i_11, class111.field1446[0], class224_4);
        }

        if (!class138.field1876.field566) {
          class314
              .method5763(class224_4.field2553 / 2 + i_1 - 1, class224_4.field2549 / 2 + i_2 - 1, 3,
                          3, 16777215);
        }
      } else {
        class314.method5742(i_1, i_2, 0, class224_4.field2551, class224_4.field2550);
      }

      client.field788[i_3] = true;
    }
  }

}
