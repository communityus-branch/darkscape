package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class51 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lce;"
  )
  class84 field466;
  @ObfuscatedName("s")
  int[] field462;
  @ObfuscatedName("l")
  String[] field465;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -1485415085
  )
  int field463 = -1;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(S)[Ljr;",
      garbageValue = "128"
  )
  public static class279[] method996() {
    return new class279[]{class279.field3596, class279.field3580, class279.field3582,
        class279.field3585, class279.field3593, class279.field3587, class279.field3583,
        class279.field3595, class279.field3592, class279.field3588, class279.field3586,
        class279.field3590, class279.field3594, class279.field3589, class279.field3581,
        class279.field3584};
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "1"
  )
  public static String method998(String string_0) {
    int i_1 = string_0.length();
    char[] arr_2 = new char[i_1];
    byte b_3 = 2;

    for (int i_4 = 0; i_4 < i_1; i_4++) {
      char var_5 = string_0.charAt(i_4);
      if (b_3 == 0) {
        var_5 = Character.toLowerCase(var_5);
      } else if (b_3 == 2 || Character.isUpperCase(var_5)) {
        var_5 = class291.method5450(var_5);
      }

      if (Character.isLetter(var_5)) {
        b_3 = 0;
      } else if (var_5 != 46 && var_5 != 63 && var_5 != 33) {
        if (Character.isSpaceChar(var_5)) {
          if (b_3 != 2) {
            b_3 = 1;
          }
        } else {
          b_3 = 1;
        }
      } else {
        b_3 = 2;
      }

      arr_2[i_4] = var_5;
    }

    return new String(arr_2);
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-827181248"
  )
  static final void method995(String string_0) {
    StringBuilder stringbuilder_10000 = new StringBuilder();
    Object obj_10001 = null;
    stringbuilder_10000 = stringbuilder_10000.append("Please remove ").append(string_0);
    obj_10001 = null;
    String string_1 = stringbuilder_10000.append(" from your ignore list first").toString();
    class143.method3172(30, "", string_1);
  }

  @ObfuscatedName("gy")
  @ObfuscatedSignature(
      signature = "(ZLgi;I)V",
      garbageValue = "1560742456"
  )
  static final void method994(boolean bool_0, PacketBuffer class189_1) {
    client.field759 = bool_0;
    int i_2;
    int i_3;
    int i_5;
    int i_6;
    int i_7;
    int i_8;
    if (!client.field759) {
      i_2 = class189_1.method3613();
      i_3 = class189_1.method3646();
      int i_4 = class189_1.getUInt16();
      class67.field973 = new int[i_4][4];

      for (i_5 = 0; i_5 < i_4; i_5++) {
        for (i_6 = 0; i_6 < 4; i_6++) {
          class67.field973[i_5][i_6] = class189_1.getInt32();
        }
      }

      class143.field1900 = new int[i_4];
      class295.field3676 = new int[i_4];
      class9.field56 = new int[i_4];
      class171.field2252 = new byte[i_4][];
      class29.field253 = new byte[i_4][];
      boolean bool_16 = false;
      if ((i_2 / 8 == 48 || i_2 / 8 == 49) && i_3 / 8 == 48) {
        bool_16 = true;
      }

      if (i_2 / 8 == 48 && i_3 / 8 == 148) {
        bool_16 = true;
      }

      i_4 = 0;

      for (i_6 = (i_2 - 6) / 8; i_6 <= (i_2 + 6) / 8; i_6++) {
        for (i_7 = (i_3 - 6) / 8; i_7 <= (i_3 + 6) / 8; i_7++) {
          i_8 = i_7 + (i_6 << 8);
          if (!bool_16 || i_7 != 49 && i_7 != 149 && i_7 != 147 && i_6 != 50 && (i_6 != 49
              || i_7 != 47)) {
            class143.field1900[i_4] = i_8;
            class295.field3676[i_4] = RemoteArchiveRequest.field3159.method4642("m" + i_6 + "_" + i_7);
            class9.field56[i_4] = RemoteArchiveRequest.field3159.method4642("l" + i_6 + "_" + i_7);
            ++i_4;
          }
        }
      }

      class62.method1537(i_2, i_3, true);
    } else {
      i_2 = class189_1.method3585();
      i_3 = class189_1.method3585();
      boolean bool_15 = class189_1.getUInt8() == 1;
      i_5 = class189_1.getUInt16();
      class189_1.method3823();

      int i_9;
      for (i_6 = 0; i_6 < 4; i_6++) {
        for (i_7 = 0; i_7 < 13; i_7++) {
          for (i_8 = 0; i_8 < 13; i_8++) {
            i_9 = class189_1.method3817(1);
            if (i_9 == 1) {
              client.field645[i_6][i_7][i_8] = class189_1.method3817(26);
            } else {
              client.field645[i_6][i_7][i_8] = -1;
            }
          }
        }
      }

      class189_1.method3816();
      class67.field973 = new int[i_5][4];

      for (i_6 = 0; i_6 < i_5; i_6++) {
        for (i_7 = 0; i_7 < 4; i_7++) {
          class67.field973[i_6][i_7] = class189_1.getInt32();
        }
      }

      class143.field1900 = new int[i_5];
      class295.field3676 = new int[i_5];
      class9.field56 = new int[i_5];
      class171.field2252 = new byte[i_5][];
      class29.field253 = new byte[i_5][];
      i_5 = 0;

      for (i_6 = 0; i_6 < 4; i_6++) {
        for (i_7 = 0; i_7 < 13; i_7++) {
          for (i_8 = 0; i_8 < 13; i_8++) {
            i_9 = client.field645[i_6][i_7][i_8];
            if (i_9 != -1) {
              int i_10 = i_9 >> 14 & 0x3ff;
              int i_11 = i_9 >> 3 & 0x7ff;
              int i_12 = (i_10 / 8 << 8) + i_11 / 8;

              int i_13;
              for (i_13 = 0; i_13 < i_5; i_13++) {
                if (class143.field1900[i_13] == i_12) {
                  i_12 = -1;
                  break;
                }
              }

              if (i_12 != -1) {
                class143.field1900[i_5] = i_12;
                i_13 = i_12 >> 8 & 0xff;
                int i_14 = i_12 & 0xff;
                class295.field3676[i_5] = RemoteArchiveRequest.field3159.method4642("m" + i_13 + "_" + i_14);
                class9.field56[i_5] = RemoteArchiveRequest.field3159.method4642("l" + i_13 + "_" + i_14);
                ++i_5;
              }
            }
          }
        }
      }

      class62.method1537(i_2, i_3, !bool_15);
    }

  }

  @ObfuscatedName("hn")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1470602086"
  )
  static final void method997(int i_0, int i_1) {
    if (client.field771 >= 2 || client.field733 != 0 || client.field785) {
      if (client.field728) {
        int i_2 = client.field771 - 1;
        String string_4;
        if (client.field733 == 1 && client.field771 < 2) {
          string_4 = "Use" + " " + client.field734 + " " + "->";
        } else if (client.field785 && client.field771 < 2) {
          string_4 = client.field612 + " " + client.field739 + " " + "->";
        } else {
          string_4 = class18.method176(i_2);
        }

        if (client.field771 > 2) {
          string_4 = string_4 + class6.method71(16777215) + " " + '/' + " " + (client.field771 - 2)
              + " more options";
        }

        class293.field3660
            .method5530(string_4, i_0 + 4, i_1 + 15, 16777215, 0, client.field591 / 1000);
      }
    }
  }

}
