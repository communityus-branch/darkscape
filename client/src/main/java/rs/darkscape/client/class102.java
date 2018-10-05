package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public class class102 {

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "Lly;"
  )
  static class317 field1352;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 135122197
  )
  int field1346;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 343750491
  )
  int field1350;
  @ObfuscatedName("q")
  int[][] field1351;

  public class102(int i_1, int i_2) {
    if (i_2 != i_1) {
      int i_4 = i_1;
      int i_5 = i_2;
      if (i_2 > i_1) {
        i_4 = i_2;
        i_5 = i_1;
      }

      while (i_5 != 0) {
        int i_6 = i_4 % i_5;
        i_4 = i_5;
        i_5 = i_6;
      }

      i_1 /= i_4;
      i_2 /= i_4;
      this.field1346 = i_1;
      this.field1350 = i_2;
      this.field1351 = new int[i_1][14];

      for (int i_7 = 0; i_7 < i_1; i_7++) {
        int[] ints_8 = this.field1351[i_7];
        double d_9 = (double) i_7 / (double) i_1 + 6.0D;
        int i_11 = (int) Math.floor(d_9 - 7.0D + 1.0D);
        if (i_11 < 0) {
          i_11 = 0;
        }

        int i_12 = (int) Math.ceil(7.0D + d_9);
        if (i_12 > 14) {
          i_12 = 14;
        }

        for (double d_13 = (double) i_2 / (double) i_1; i_11 < i_12; i_11++) {
          double d_15 = ((double) i_11 - d_9) * 3.141592653589793D;
          double d_17 = d_13;
          if (d_15 < -1.0E-4D || d_15 > 1.0E-4D) {
            d_17 = d_13 * (Math.sin(d_15) / d_15);
          }

          d_17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double) i_11 - d_9));
          ints_8[i_11] = (int) Math.floor(d_17 * 65536.0D + 0.5D);
        }
      }

    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;B)Z",
      garbageValue = "1"
  )
  public static boolean method2249(CharSequence charsequence_0) {
    boolean bool_2 = false;
    boolean bool_3 = false;
    int i_4 = 0;
    int i_5 = charsequence_0.length();
    int i_6 = 0;

    boolean bool_1;
    while (true) {
      if (i_6 >= i_5) {
        bool_1 = bool_3;
        break;
      }

      label86:
      {
        char var_7 = charsequence_0.charAt(i_6);
        if (i_6 == 0) {
          if (var_7 == 45) {
            bool_2 = true;
            break label86;
          }

          if (var_7 == 43) {
            break label86;
          }
        }

        int i_9;
        if (var_7 >= 48 && var_7 <= 57) {
          i_9 = var_7 - 48;
        } else if (var_7 >= 65 && var_7 <= 90) {
          i_9 = var_7 - 55;
        } else {
          if (var_7 < 97 || var_7 > 122) {
            bool_1 = false;
            break;
          }

          i_9 = var_7 - 87;
        }

        if (i_9 >= 10) {
          bool_1 = false;
          break;
        }

        if (bool_2) {
          i_9 = -i_9;
        }

        int i_8 = i_4 * 10 + i_9;
        if (i_4 != i_8 / 10) {
          bool_1 = false;
          break;
        }

        i_4 = i_8;
        bool_3 = true;
      }

      ++i_6;
    }

    return bool_1;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-879743478"
  )
  static int method2238(int i_0, class84 class84_1, boolean bool_2) {
    int i_4 = -1;
    class230 class230_3;
    if (i_0 >= 2000) {
      i_0 -= 1000;
      i_4 = class69.field999[--class69.field1003];
      class230_3 = class26.method434(i_4);
    } else {
      class230_3 = bool_2 ? class276.field3561 : class260.field3301;
    }

    if (i_0 == 1100) {
      class69.field1003 -= 2;
      class230_3.field2626 = class69.field999[class69.field1003];
      if (class230_3.field2626 > class230_3.field2628 - class230_3.field2675) {
        class230_3.field2626 = class230_3.field2628 - class230_3.field2675;
      }

      if (class230_3.field2626 < 0) {
        class230_3.field2626 = 0;
      }

      class230_3.field2663 = class69.field999[class69.field1003 + 1];
      if (class230_3.field2663 > class230_3.field2629 - class230_3.field2621) {
        class230_3.field2663 = class230_3.field2629 - class230_3.field2621;
      }

      if (class230_3.field2663 < 0) {
        class230_3.field2663 = 0;
      }

      class60.method1114(class230_3);
      return 1;
    } else if (i_0 == 1101) {
      class230_3.field2630 = class69.field999[--class69.field1003];
      class60.method1114(class230_3);
      return 1;
    } else if (i_0 == 1102) {
      class230_3.field2710 = class69.field999[--class69.field1003] == 1;
      class60.method1114(class230_3);
      return 1;
    } else if (i_0 == 1103) {
      class230_3.field2636 = class69.field999[--class69.field1003];
      class60.method1114(class230_3);
      return 1;
    } else if (i_0 == 1104) {
      class230_3.field2638 = class69.field999[--class69.field1003];
      class60.method1114(class230_3);
      return 1;
    } else if (i_0 == 1105) {
      class230_3.field2640 = class69.field999[--class69.field1003];
      class60.method1114(class230_3);
      return 1;
    } else if (i_0 == 1106) {
      class230_3.field2596 = class69.field999[--class69.field1003];
      class60.method1114(class230_3);
      return 1;
    } else if (i_0 == 1107) {
      class230_3.field2643 = class69.field999[--class69.field1003] == 1;
      class60.method1114(class230_3);
      return 1;
    } else if (i_0 == 1108) {
      class230_3.field2665 = 1;
      class230_3.field2593 = class69.field999[--class69.field1003];
      class60.method1114(class230_3);
      return 1;
    } else if (i_0 == 1109) {
      class69.field1003 -= 6;
      class230_3.field2592 = class69.field999[class69.field1003];
      class230_3.field2655 = class69.field999[class69.field1003 + 1];
      class230_3.field2656 = class69.field999[class69.field1003 + 2];
      class230_3.field2657 = class69.field999[class69.field1003 + 3];
      class230_3.field2658 = class69.field999[class69.field1003 + 4];
      class230_3.field2704 = class69.field999[class69.field1003 + 5];
      class60.method1114(class230_3);
      return 1;
    } else {
      int i_8;
      if (i_0 == 1110) {
        i_8 = class69.field999[--class69.field1003];
        if (i_8 != class230_3.field2595) {
          class230_3.field2595 = i_8;
          class230_3.field2728 = 0;
          class230_3.field2613 = 0;
          class60.method1114(class230_3);
        }

        return 1;
      } else if (i_0 == 1111) {
        class230_3.field2662 = class69.field999[--class69.field1003] == 1;
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1112) {
        String string_7 = class69.field1001[--class55.field497];
        if (!string_7.equals(class230_3.field2667)) {
          class230_3.field2667 = string_7;
          class60.method1114(class230_3);
        }

        return 1;
      } else if (i_0 == 1113) {
        class230_3.field2739 = class69.field999[--class69.field1003];
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1114) {
        class69.field1003 -= 3;
        class230_3.field2669 = class69.field999[class69.field1003];
        class230_3.field2681 = class69.field999[class69.field1003 + 1];
        class230_3.field2668 = class69.field999[class69.field1003 + 2];
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1115) {
        class230_3.field2671 = class69.field999[--class69.field1003] == 1;
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1116) {
        class230_3.field2644 = class69.field999[--class69.field1003];
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1117) {
        class230_3.field2645 = class69.field999[--class69.field1003];
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1118) {
        class230_3.field2646 = class69.field999[--class69.field1003] == 1;
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1119) {
        class230_3.field2647 = class69.field999[--class69.field1003] == 1;
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1120) {
        class69.field1003 -= 2;
        class230_3.field2628 = class69.field999[class69.field1003];
        class230_3.field2629 = class69.field999[class69.field1003 + 1];
        class60.method1114(class230_3);
        if (i_4 != -1 && class230_3.field2721 == 0) {
          Temp.method3388(class42.field366[i_4 >> 16], class230_3, false);
        }

        return 1;
      } else if (i_0 == 1121) {
        class82.method1921(class230_3.field2691, class230_3.field2606);
        client.field744 = class230_3;
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1122) {
        class230_3.field2641 = class69.field999[--class69.field1003];
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1123) {
        class230_3.field2631 = class69.field999[--class69.field1003];
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1124) {
        class230_3.field2608 = class69.field999[--class69.field1003];
        class60.method1114(class230_3);
        return 1;
      } else if (i_0 == 1125) {
        i_8 = class69.field999[--class69.field1003];
        class316 class316_6 = (class316) class76.method1803(class23.method423(), i_8);
        if (class316_6 != null) {
          class230_3.field2701 = class316_6;
          class60.method1114(class230_3);
        }

        return 1;
      } else {
        boolean bool_5;
        if (i_0 == 1126) {
          bool_5 = class69.field999[--class69.field1003] == 1;
          class230_3.field2639 = bool_5;
          return 1;
        } else if (i_0 == 1127) {
          bool_5 = class69.field999[--class69.field1003] == 1;
          class230_3.field2726 = bool_5;
          return 1;
        } else {
          return 2;
        }
      }
    }
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "158001383"
  )
  static final int method2248(int i_0, int i_1) {
    if (i_0 == -1) {
      return 12345678;
    } else {
      i_1 = (i_0 & 0x7f) * i_1 / 128;
      if (i_1 < 2) {
        i_1 = 2;
      } else if (i_1 > 126) {
        i_1 = 126;
      }

      return (i_0 & 0xff80) + i_1;
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([BI)[B",
      garbageValue = "160754994"
  )
  byte[] method2239(byte[] bytes_1) {
    if (this.field1351 != null) {
      int i_2 = (int) ((long) this.field1350 * (long) bytes_1.length / (long) this.field1346) + 14;
      int[] ints_3 = new int[i_2];
      int i_4 = 0;
      int i_5 = 0;

      int i_6;
      for (i_6 = 0; i_6 < bytes_1.length; i_6++) {
        byte b_7 = bytes_1[i_6];
        int[] ints_8 = this.field1351[i_5];

        int i_9;
        for (i_9 = 0; i_9 < 14; i_9++) {
          ints_3[i_4 + i_9] += b_7 * ints_8[i_9];
        }

        i_5 += this.field1350;
        i_9 = i_5 / this.field1346;
        i_4 += i_9;
        i_5 -= i_9 * this.field1346;
      }

      bytes_1 = new byte[i_2];

      for (i_6 = 0; i_6 < i_2; i_6++) {
        int i_10 = ints_3[i_6] + 32768 >> 16;
        if (i_10 < -128) {
          bytes_1[i_6] = -128;
        } else if (i_10 > 127) {
          bytes_1[i_6] = 127;
        } else {
          bytes_1[i_6] = (byte) i_10;
        }
      }
    }

    return bytes_1;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "715273606"
  )
  int method2240(int i_1) {
    if (this.field1351 != null) {
      i_1 = (int) ((long) i_1 * (long) this.field1350 / (long) this.field1346);
    }

    return i_1;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "149890453"
  )
  int method2241(int i_1) {
    if (this.field1351 != null) {
      i_1 = (int) ((long) this.field1350 * (long) i_1 / (long) this.field1346) + 6;
    }

    return i_1;
  }

}
