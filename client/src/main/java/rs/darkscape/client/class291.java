package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class291 implements Comparable {

  @ObfuscatedName("z")
  String field3644;
  @ObfuscatedName("w")
  String field3642;

  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Llm;)V"
  )
  public class291(String string_1, class322 class322_2) {
    this.field3644 = string_1;
    String string_4;
    if (string_1 == null) {
      string_4 = null;
    } else {
      int i_5 = 0;

      int i_6;
      boolean bool_7;
      char var_8;
      for (i_6 = string_1.length(); i_5 < i_6; i_5++) {
        var_8 = string_1.charAt(i_5);
        bool_7 = var_8 == 160 || var_8 == 32 || var_8 == 95 || var_8 == 45;
        if (!bool_7) {
          break;
        }
      }

      while (i_6 > i_5) {
        var_8 = string_1.charAt(i_6 - 1);
        bool_7 = var_8 == 160 || var_8 == 32 || var_8 == 95 || var_8 == 45;
        if (!bool_7) {
          break;
        }

        --i_6;
      }

      int i_17 = i_6 - i_5;
      if (i_17 >= 1 && i_17 <= class8.method84(class322_2)) {
        StringBuilder stringbuilder_15 = new StringBuilder(i_17);

        for (int i_9 = i_5; i_9 < i_6; i_9++) {
          char var_10 = string_1.charAt(i_9);
          boolean bool_11;
          if (Character.isISOControl(var_10)) {
            bool_11 = false;
          } else if (Temp.method3362(var_10)) {
            bool_11 = true;
          } else {
            char[] arr_16 = class302.field3719;
            int i_13 = 0;

            label79:
            while (true) {
              char var_14;
              if (i_13 >= arr_16.length) {
                arr_16 = class302.field3717;

                for (i_13 = 0; i_13 < arr_16.length; i_13++) {
                  var_14 = arr_16[i_13];
                  if (var_14 == var_10) {
                    bool_11 = true;
                    break label79;
                  }
                }

                bool_11 = false;
                break;
              }

              var_14 = arr_16[i_13];
              if (var_14 == var_10) {
                bool_11 = true;
                break;
              }

              ++i_13;
            }
          }

          if (bool_11) {
            char var_12 = AssetService.method4770(var_10);
            if (var_12 != 0) {
              stringbuilder_15.append(var_12);
            }
          }
        }

        if (stringbuilder_15.length() == 0) {
          string_4 = null;
        } else {
          string_4 = stringbuilder_15.toString();
        }
      } else {
        string_4 = null;
      }
    }

    this.field3642 = string_4;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(CB)C",
      garbageValue = "-41"
  )
  static char method5450(char var_0) {
    return var_0 != 181 && var_0 != 131 ? Character.toTitleCase(var_0) : var_0;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-39"
  )
  public String method5447() {
    return this.field3644;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "777472606"
  )
  public boolean method5441() {
    return this.field3642 != null;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lkm;I)I",
      garbageValue = "915724174"
  )
  public int method5435(class291 class291_1) {
    return this.field3642 == null ? (class291_1.field3642 == null ? 0 : 1)
        : (class291_1.field3642 == null ? -1 : this.field3642.compareTo(class291_1.field3642));
  }

  public boolean equals(Object object_1) {
    if (object_1 instanceof class291) {
      class291 class291_2 = (class291) object_1;
      return this.field3642 == null ? class291_2.field3642 == null
          : (class291_2.field3642 == null ? false
              : (this.hashCode() != class291_2.hashCode() ? false
                  : this.field3642.equals(class291_2.field3642)));
    } else {
      return false;
    }
  }

  public int hashCode() {
    return this.field3642 == null ? 0 : this.field3642.hashCode();
  }

  public String toString() {
    return this.method5447();
  }

  public int compareTo(Object object_1) {
    return this.method5435((class291) object_1);
  }

}
