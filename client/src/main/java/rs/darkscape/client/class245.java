package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class245 extends Node {

  @ObfuscatedName("pq")
  @ObfuscatedGetter(
      intValue = 117401965
  )
  static int field3154;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 2021384191
  )
  int field3150;
  @ObfuscatedName("w")
  byte[] field3149;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lff;"
  )
  StorageVolume field3151;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  class249 field3152;

  @ObfuscatedName("hj")
  @ObfuscatedSignature(
      signature = "(ZLgi;B)V",
      garbageValue = "30"
  )
  static final void method4619(boolean bool_0, PacketBuffer class189_1) {
    client.field701 = 0;
    client.field624 = 0;
    PacketBuffer class189_2 = client.field626.field1219;
    class189_2.method3823();
    int i_3 = class189_2.method3817(8);
    int i_4;
    if (i_3 < client.field622) {
      for (i_4 = i_3; i_4 < client.field622; i_4++) {
        client.field702[++client.field701 - 1] = client.field639[i_4];
      }
    }

    if (i_3 > client.field622) {
      throw new RuntimeException("");
    } else {
      client.field622 = 0;

      int i_5;
      int i_7;
      int i_8;
      int i_9;
      int i_10;
      int i_11;
      for (i_4 = 0; i_4 < i_3; i_4++) {
        i_5 = client.field639[i_4];
        class72 class72_6 = client.field843[i_5];
        i_7 = class189_2.method3817(1);
        if (i_7 == 0) {
          client.field639[++client.field622 - 1] = i_5;
          class72_6.field914 = client.field591;
        } else {
          i_8 = class189_2.method3817(2);
          if (i_8 == 0) {
            client.field639[++client.field622 - 1] = i_5;
            class72_6.field914 = client.field591;
            client.field666[++client.field624 - 1] = i_5;
          } else if (i_8 == 1) {
            client.field639[++client.field622 - 1] = i_5;
            class72_6.field914 = client.field591;
            i_9 = class189_2.method3817(3);
            class72_6.method1794(i_9, (byte) 1);
            i_10 = class189_2.method3817(1);
            if (i_10 == 1) {
              client.field666[++client.field624 - 1] = i_5;
            }
          } else if (i_8 == 2) {
            client.field639[++client.field622 - 1] = i_5;
            class72_6.field914 = client.field591;
            i_9 = class189_2.method3817(3);
            class72_6.method1794(i_9, (byte) 2);
            i_10 = class189_2.method3817(3);
            class72_6.method1794(i_10, (byte) 2);
            i_11 = class189_2.method3817(1);
            if (i_11 == 1) {
              client.field666[++client.field624 - 1] = i_5;
            }
          } else if (i_8 == 3) {
            client.field702[++client.field701 - 1] = i_5;
          }
        }
      }

      class30.method500(bool_0, class189_1);

      int i_14;
      for (i_14 = 0; i_14 < client.field624; i_14++) {
        i_3 = client.field666[i_14];
        class72 class72_15 = client.field843[i_3];
        i_5 = class189_1.getUInt8();
        int i_16;
        if ((i_5 & 0x4) != 0) {
          class72_15.field891 = class189_1.method3646();
          i_16 = class189_1.method3770();
          class72_15.field871 = i_16 >> 16;
          class72_15.field911 = (i_16 & 0xffff) + client.field591;
          class72_15.field876 = 0;
          class72_15.field910 = 0;
          if (class72_15.field911 > client.field591) {
            class72_15.field876 = -1;
          }

          if (class72_15.field891 == 65535) {
            class72_15.field891 = -1;
          }
        }

        if ((i_5 & 0x1) != 0) {
          i_16 = class189_1.method3585();
          i_7 = class189_1.method3585();
          i_8 = class72_15.field931 - (i_16 - class62.field868 - class62.field868) * 64;
          i_9 = class72_15.field881 - (i_7 - client.field754 - client.field754) * 64;
          if (i_8 != 0 || i_9 != 0) {
            class72_15.field920 = (int) (Math.atan2((double) i_8, (double) i_9) * 325.949D) & 0x7ff;
          }
        }

        if ((i_5 & 0x40) != 0) {
          i_16 = class189_1.method3577();
          int i_12;
          if (i_16 > 0) {
            for (i_7 = 0; i_7 < i_16; i_7++) {
              i_9 = -1;
              i_10 = -1;
              i_11 = -1;
              i_8 = class189_1.method3562();
              if (i_8 == 32767) {
                i_8 = class189_1.method3562();
                i_10 = class189_1.method3562();
                i_9 = class189_1.method3562();
                i_11 = class189_1.method3562();
              } else if (i_8 != 32766) {
                i_10 = class189_1.method3562();
              } else {
                i_8 = -1;
              }

              i_12 = class189_1.method3562();
              class72_15.method1542(i_8, i_10, i_9, i_11, client.field591, i_12);
            }
          }

          i_7 = class189_1.method3577();
          if (i_7 > 0) {
            for (i_8 = 0; i_8 < i_7; i_8++) {
              i_9 = class189_1.method3562();
              i_10 = class189_1.method3562();
              if (i_10 != 32767) {
                i_11 = class189_1.method3562();
                i_12 = class189_1.method3765();
                int i_13 = i_10 > 0 ? class189_1.method3765() : i_12;
                class72_15.method1543(i_9, client.field591, i_10, i_11, i_12, i_13);
              } else {
                class72_15.method1557(i_9);
              }
            }
          }
        }

        if ((i_5 & 0x8) != 0) {
          class72_15.field1037 = class270.method5157(class189_1.method3613());
          class72_15.field874 = class72_15.field1037.field3497;
          class72_15.field924 = class72_15.field1037.field3500;
          class72_15.field899 = class72_15.field1037.field3498;
          class72_15.field880 = class72_15.field1037.field3495;
          class72_15.field870 = class72_15.field1037.field3502;
          class72_15.field882 = class72_15.field1037.field3501;
          class72_15.field893 = class72_15.field1037.field3519;
          class72_15.field877 = class72_15.field1037.field3496;
          class72_15.field878 = class72_15.field1037.field3486;
        }

        if ((i_5 & 0x10) != 0) {
          class72_15.field897 = class189_1.method3585();
          if (class72_15.field897 == 65535) {
            class72_15.field897 = -1;
          }
        }

        if ((i_5 & 0x20) != 0) {
          i_16 = class189_1.method3613();
          if (i_16 == 65535) {
            i_16 = -1;
          }

          i_7 = class189_1.getUInt8();
          if (i_16 == class72_15.field903 && i_16 != -1) {
            i_8 = class3.method25(i_16).field3553;
            if (i_8 == 1) {
              class72_15.field904 = 0;
              class72_15.field901 = 0;
              class72_15.field906 = i_7;
              class72_15.field907 = 0;
            }

            if (i_8 == 2) {
              class72_15.field907 = 0;
            }
          } else if (i_16 == -1 || class72_15.field903 == -1
              || class3.method25(i_16).field3547 >= class3
              .method25(class72_15.field903).field3547) {
            class72_15.field903 = i_16;
            class72_15.field904 = 0;
            class72_15.field901 = 0;
            class72_15.field906 = i_7;
            class72_15.field907 = 0;
            class72_15.field930 = class72_15.field909;
          }
        }

        if ((i_5 & 0x2) != 0) {
          class72_15.field884 = class189_1.method3738();
          class72_15.field887 = 100;
        }
      }

      for (i_14 = 0; i_14 < client.field701; i_14++) {
        i_3 = client.field702[i_14];
        if (client.field843[i_3].field914 != client.field591) {
          client.field843[i_3].field1037 = null;
          client.field843[i_3] = null;
        }
      }

      if (class189_1.offset != client.field626.field1225) {
        throw new RuntimeException(class189_1.offset + "," + client.field626.field1225);
      } else {
        for (i_14 = 0; i_14 < client.field622; i_14++) {
          if (client.field843[client.field639[i_14]] == null) {
            throw new RuntimeException(i_14 + "," + client.field622);
          }
        }

      }
    }
  }

  @ObfuscatedName("jp")
  @ObfuscatedSignature(
      signature = "([Lhi;II)V",
      garbageValue = "-2000374394"
  )
  static final void method4620(class230[] arr_0, int i_1) {
    for (int i_2 = 0; i_2 < arr_0.length; i_2++) {
      class230 class230_3 = arr_0[i_2];
      if (class230_3 != null && class230_3.field2605 == i_1 && (!class230_3.field2604 || !class81
          .method1885(class230_3))) {
        if (class230_3.field2721 == 0) {
          if (!class230_3.field2604 && class81.method1885(class230_3)
              && class230_3 != class143.field1897) {
            continue;
          }

          method4620(arr_0, class230_3.field2691);
          if (class230_3.field2736 != null) {
            method4620(class230_3.field2736, class230_3.field2691);
          }

          class55 class55_4 = (class55) client.field741.get((long) class230_3.field2691);
          if (class55_4 != null) {
            class21.method270(class55_4.field501);
          }
        }

        if (class230_3.field2721 == 6) {
          int i_5;
          if (class230_3.field2595 != -1 || class230_3.field2653 != -1) {
            boolean bool_7 = class132.method3097(class230_3);
            if (bool_7) {
              i_5 = class230_3.field2653;
            } else {
              i_5 = class230_3.field2595;
            }

            if (i_5 != -1) {
              class273 class273_6 = class3.method25(i_5);

              for (class230_3.field2613 += client.field700;
                  class230_3.field2613 > class273_6.field3541[class230_3.field2728];
                  class60.method1114(class230_3)) {
                class230_3.field2613 -= class273_6.field3541[class230_3.field2728];
                ++class230_3.field2728;
                if (class230_3.field2728 >= class273_6.field3540.length) {
                  class230_3.field2728 -= class273_6.field3544;
                  if (class230_3.field2728 < 0
                      || class230_3.field2728 >= class273_6.field3540.length) {
                    class230_3.field2728 = 0;
                  }
                }
              }
            }
          }

          if (class230_3.field2732 != 0 && !class230_3.field2604) {
            int i_8 = class230_3.field2732 >> 16;
            i_5 = class230_3.field2732 << 16 >> 16;
            i_8 *= client.field700;
            i_5 *= client.field700;
            class230_3.field2656 = i_8 + class230_3.field2656 & 0x7ff;
            class230_3.field2657 = i_5 + class230_3.field2657 & 0x7ff;
            class60.method1114(class230_3);
          }
        }
      }
    }

  }

}
