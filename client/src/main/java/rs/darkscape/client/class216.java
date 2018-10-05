package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class216 {

  @ObfuscatedName("z")
  byte[] field2447;
  @ObfuscatedName("w")
  byte[] field2449;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 2049158647
  )
  int field2448;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -1438007951
  )
  int field2450;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -2031677397
  )
  int field2446;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -1415705735
  )
  int field2451;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -1604102077
  )
  int field2453;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = -560836309
  )
  int field2452;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 341977341
  )
  int field2454;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgi;IB)V",
      garbageValue = "1"
  )
  static final void method4179(PacketBuffer class189_0, int i_1) {
    int i_2 = class189_0.offset;
    class81.field1165 = 0;
    class177.method3512(class189_0);

    for (int i_3 = 0; i_3 < class81.field1165; i_3++) {
      int i_4 = class81.field1166[i_3];
      class60 class60_5 = client.field610[i_4];
      int i_6 = class189_0.getUInt8();
      if ((i_6 & 0x80) != 0) {
        i_6 += class189_0.getUInt8() << 8;
      }

      byte b_7 = -1;
      if ((i_6 & 0x200) != 0) {
        b_7 = class189_0.method3610();
      }

      if ((i_6 & 0x8) != 0) {
        class60_5.field884 = class189_0.method3738();
        if (class60_5.field884.charAt(0) == 126) {
          class60_5.field884 = class60_5.field884.substring(1);
          class143.method3172(2, class60_5.field552.method5447(), class60_5.field884);
        } else if (class60_5 == class138.field1876) {
          class143.method3172(2, class60_5.field552.method5447(), class60_5.field884);
        }

        class60_5.field885 = false;
        class60_5.field888 = 0;
        class60_5.field927 = 0;
        class60_5.field887 = 150;
      }

      int i_8;
      if ((i_6 & 0x800) != 0) {
        class60_5.field891 = class189_0.method3646();
        i_8 = class189_0.method3595();
        class60_5.field871 = i_8 >> 16;
        class60_5.field911 = (i_8 & 0xffff) + client.field591;
        class60_5.field876 = 0;
        class60_5.field910 = 0;
        if (class60_5.field911 > client.field591) {
          class60_5.field876 = -1;
        }

        if (class60_5.field891 == 65535) {
          class60_5.field891 = -1;
        }
      }

      if ((i_6 & 0x400) != 0) {
        for (i_8 = 0; i_8 < 3; i_8++) {
          class60_5.field550[i_8] = class189_0.method3738();
        }
      }

      int i_9;
      if ((i_6 & 0x20) != 0) {
        i_8 = class189_0.method3646();
        if (i_8 == 65535) {
          i_8 = -1;
        }

        i_9 = class189_0.method3577();
        class134.method3102(class60_5, i_8, i_9);
      }

      int i_11;
      int i_12;
      if ((i_6 & 0x40) != 0) {
        i_8 = class189_0.method3585();
        class242 class242_21 = (class242) class76
            .method1803(class20.method216(), class189_0.method3577());
        boolean bool_10 = class189_0.method3607() == 1;
        i_11 = class189_0.getUInt8();
        i_12 = class189_0.offset;
        if (class60_5.field552 != null && class60_5.field546 != null) {
          boolean bool_13 = false;
          if (class242_21.field3127 && class181.field2332.method1630(class60_5.field552)) {
            bool_13 = true;
          }

          if (!bool_13 && client.field694 == 0 && !class60_5.field566) {
            class81.field1154.offset = 0;
            class189_0.method3539(class81.field1154.bytes, 0, i_11);
            class81.field1154.offset = 0;
            Buffer class182_15 = class81.field1154;

            String str_16;
            int i_17;
            String string_19;
            try {
              i_17 = class182_15.method3562();
              if (i_17 > 32767) {
                i_17 = 32767;
              }

              byte[] bytes_18 = new byte[i_17];
              class182_15.offset += class300.field3712
                  .method3480(class182_15.bytes, class182_15.offset, bytes_18, 0, i_17);
              string_19 = class78.method1831(bytes_18, 0, i_17);
              str_16 = string_19;
            } catch (Exception exception_27) {
              str_16 = "Cabbage";
            }

            str_16 = class299.method5521(class51.method998(str_16));
            class60_5.field884 = str_16.trim();
            class60_5.field888 = i_8 >> 8;
            class60_5.field927 = i_8 & 0xff;
            class60_5.field887 = 150;
            class60_5.field885 = bool_10;
            class60_5.field886 =
                class60_5 != class138.field1876 && class242_21.field3127 && "" != client.field796
                    && str_16.toLowerCase().indexOf(client.field796) == -1;
            if (class242_21.field3126) {
              i_17 = bool_10 ? 91 : 1;
            } else {
              i_17 = bool_10 ? 90 : 2;
            }

            if (class242_21.field3128 != -1) {
              int i_20 = class242_21.field3128;
              string_19 = "<img=" + i_20 + ">";
              class143.method3172(i_17, string_19 + class60_5.field552.method5447(), str_16);
            } else {
              class143.method3172(i_17, class60_5.field552.method5447(), str_16);
            }
          }
        }

        class189_0.offset = i_11 + i_12;
      }

      if ((i_6 & 0x1000) != 0) {
        class81.field1153[i_4] = class189_0.method3610();
      }

      if ((i_6 & 0x1) != 0) {
        i_8 = class189_0.method3577();
        int i_24;
        int i_28;
        int i_30;
        if (i_8 > 0) {
          for (i_9 = 0; i_9 < i_8; i_9++) {
            i_11 = -1;
            i_12 = -1;
            i_30 = -1;
            i_28 = class189_0.method3562();
            if (i_28 == 32767) {
              i_28 = class189_0.method3562();
              i_12 = class189_0.method3562();
              i_11 = class189_0.method3562();
              i_30 = class189_0.method3562();
            } else if (i_28 != 32766) {
              i_12 = class189_0.method3562();
            } else {
              i_28 = -1;
            }

            i_24 = class189_0.method3562();
            class60_5.method1542(i_28, i_12, i_11, i_30, client.field591, i_24);
          }
        }

        i_9 = class189_0.getUInt8();
        if (i_9 > 0) {
          for (i_28 = 0; i_28 < i_9; i_28++) {
            i_11 = class189_0.method3562();
            i_12 = class189_0.method3562();
            if (i_12 != 32767) {
              i_30 = class189_0.method3562();
              i_24 = class189_0.method3577();
              int i_25 = i_12 > 0 ? class189_0.method3607() : i_24;
              class60_5.method1543(i_11, client.field591, i_12, i_30, i_24, i_25);
            } else {
              class60_5.method1557(i_11);
            }
          }
        }
      }

      if ((i_6 & 0x100) != 0) {
        class60_5.field913 = class189_0.method3660();
        class60_5.field915 = class189_0.method3610();
        class60_5.field916 = class189_0.method3660();
        class60_5.field929 = class189_0.method3610();
        class60_5.field917 = class189_0.getUInt16() + client.field591;
        class60_5.field918 = class189_0.method3646() + client.field591;
        class60_5.field919 = class189_0.method3646();
        if (class60_5.field571) {
          class60_5.field913 += class60_5.field572;
          class60_5.field915 += class60_5.field573;
          class60_5.field916 += class60_5.field572;
          class60_5.field929 += class60_5.field573;
          class60_5.field909 = 0;
        } else {
          class60_5.field913 += class60_5.field922[0];
          class60_5.field915 += class60_5.field872[0];
          class60_5.field916 += class60_5.field922[0];
          class60_5.field929 += class60_5.field872[0];
          class60_5.field909 = 1;
        }

        class60_5.field930 = 0;
      }

      if ((i_6 & 0x10) != 0) {
        class60_5.field897 = class189_0.method3585();
        if (class60_5.field897 == 65535) {
          class60_5.field897 = -1;
        }
      }

      if ((i_6 & 0x4) != 0) {
        i_8 = class189_0.method3577();
        byte[] bytes_31 = new byte[i_8];
        Buffer class182_26 = new Buffer(bytes_31);
        class189_0.method3539(bytes_31, 0, i_8);
        class81.field1157[i_4] = class182_26;
        class60_5.method1082(class182_26);
      }

      if ((i_6 & 0x2) != 0) {
        class60_5.field920 = class189_0.getUInt16();
        if (class60_5.field909 == 0) {
          class60_5.field926 = class60_5.field920;
          class60_5.field920 = -1;
        }
      }

      if (class60_5.field571) {
        if (b_7 == 127) {
          class60_5.method1103(class60_5.field572, class60_5.field573);
        } else {
          byte b_29;
          if (b_7 != -1) {
            b_29 = b_7;
          } else {
            b_29 = class81.field1153[i_4];
          }

          class60_5.method1106(class60_5.field572, class60_5.field573, b_29);
        }
      }
    }

    if (class189_0.offset - i_2 != i_1) {
      throw new RuntimeException(class189_0.offset - i_2 + " " + i_1);
    }
  }

  @ObfuscatedName("ji")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1403972661"
  )
  static final void method4178(int i_0) {
    if (class261.method4931(i_0)) {
      class230[] arr_1 = class42.field366[i_0];

      for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
        class230 class230_3 = arr_1[i_2];
        if (class230_3 != null) {
          class230_3.field2728 = 0;
          class230_3.field2613 = 0;
        }
      }

    }
  }

}
