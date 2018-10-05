package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class304 {

  @ObfuscatedName("z")
  public static char[] field3722 = new char[64];
  @ObfuscatedName("w")
  static char[] field3723;
  @ObfuscatedName("s")
  static int[] field3724;

  static {
    int i_0;
    for (i_0 = 0; i_0 < 26; i_0++) {
      field3722[i_0] = (char) (i_0 + 65);
    }

    for (i_0 = 26; i_0 < 52; i_0++) {
      field3722[i_0] = (char) (i_0 + 97 - 26);
    }

    for (i_0 = 52; i_0 < 62; i_0++) {
      field3722[i_0] = (char) (i_0 + 48 - 52);
    }

    field3722[62] = 43;
    field3722[63] = 47;
    field3723 = new char[64];

    for (i_0 = 0; i_0 < 26; i_0++) {
      field3723[i_0] = (char) (i_0 + 65);
    }

    for (i_0 = 26; i_0 < 52; i_0++) {
      field3723[i_0] = (char) (i_0 + 97 - 26);
    }

    for (i_0 = 52; i_0 < 62; i_0++) {
      field3723[i_0] = (char) (i_0 + 48 - 52);
    }

    field3723[62] = 42;
    field3723[63] = 45;
    field3724 = new int[128];

    for (i_0 = 0; i_0 < field3724.length; i_0++) {
      field3724[i_0] = -1;
    }

    for (i_0 = 65; i_0 <= 90; i_0++) {
      field3724[i_0] = i_0 - 65;
    }

    for (i_0 = 97; i_0 <= 122; i_0++) {
      field3724[i_0] = i_0 - 97 + 26;
    }

    for (i_0 = 48; i_0 <= 57; i_0++) {
      field3724[i_0] = i_0 - 48 + 52;
    }

    int[] ints_2 = field3724;
    field3724[43] = 62;
    ints_2[42] = 62;
    int[] ints_1 = field3724;
    field3724[47] = 63;
    ints_1[45] = 63;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;S)Ljava/lang/String;",
      garbageValue = "-7958"
  )
  public static String method5634(CharSequence charsequence_0) {
    int i_1 = charsequence_0.length();
    StringBuilder stringbuilder_2 = new StringBuilder(i_1);

    for (int i_3 = 0; i_3 < i_1; i_3++) {
      char var_4 = charsequence_0.charAt(i_3);
      if ((var_4 < 97 || var_4 > 122) && (var_4 < 65 || var_4 > 90) && (var_4 < 48 || var_4 > 57)
          && var_4 != 46 && var_4 != 45 && var_4 != 42 && var_4 != 95) {
        if (var_4 == 32) {
          stringbuilder_2.append('+');
        } else {
          byte b_5 = class166.method3441(var_4);
          stringbuilder_2.append('%');
          int i_6 = b_5 >> 4 & 0xf;
          if (i_6 >= 10) {
            stringbuilder_2.append((char) (i_6 + 55));
          } else {
            stringbuilder_2.append((char) (i_6 + 48));
          }

          i_6 = b_5 & 0xf;
          if (i_6 >= 10) {
            stringbuilder_2.append((char) (i_6 + 55));
          } else {
            stringbuilder_2.append((char) (i_6 + 48));
          }
        }
      } else {
        stringbuilder_2.append(var_4);
      }
    }

    return stringbuilder_2.toString();
  }

  @ObfuscatedName("in")
  @ObfuscatedSignature(
      signature = "([Lhi;IIIZB)V",
      garbageValue = "-81"
  )
  static void method5635(class230[] arr_0, int i_1, int i_2, int i_3, boolean bool_4) {
    for (int i_5 = 0; i_5 < arr_0.length; i_5++) {
      class230 class230_6 = arr_0[i_5];
      if (class230_6 != null && class230_6.field2605 == i_1) {
        class64.method1563(class230_6, i_2, i_3, bool_4);
        class22.method281(class230_6, i_2, i_3);
        if (class230_6.field2626 > class230_6.field2628 - class230_6.field2675) {
          class230_6.field2626 = class230_6.field2628 - class230_6.field2675;
        }

        if (class230_6.field2626 < 0) {
          class230_6.field2626 = 0;
        }

        if (class230_6.field2663 > class230_6.field2629 - class230_6.field2621) {
          class230_6.field2663 = class230_6.field2629 - class230_6.field2621;
        }

        if (class230_6.field2663 < 0) {
          class230_6.field2663 = 0;
        }

        if (class230_6.field2721 == 0) {
          Temp.method3388(arr_0, class230_6, bool_4);
        }
      }
    }

  }

}
