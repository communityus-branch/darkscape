package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class139 extends class283 {

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  static AbstractPack field1877;
  @ObfuscatedName("z")
  final boolean field1881;

  public class139(boolean bool_1) {
    this.field1881 = bool_1;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1945605014"
  )
  static int method3143(int i_0, int i_1) {
    class53 class53_2 = (class53) class53.field474.get((long) i_0);
    if (class53_2 == null) {
      return 0;
    } else if (i_1 == -1) {
      return 0;
    } else {
      int i_3 = 0;

      for (int i_4 = 0; i_4 < class53_2.field473.length; i_4++) {
        if (class53_2.field477[i_4] == i_1) {
          i_3 += class53_2.field473[i_4];
        }
      }

      return i_3;
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(CIB)I",
      garbageValue = "125"
  )
  static int method3145(char var_0, int i_1) {
    int i_2 = var_0 << 4;
    if (Character.isUpperCase(var_0) || Character.isTitleCase(var_0)) {
      var_0 = Character.toLowerCase(var_0);
      i_2 = (var_0 << 4) + 1;
    }

    return i_2;
  }

  @ObfuscatedName("kf")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "497607232"
  )
  static String method3138(String string_0) {
    class242[] arr_1 = class20.method216();

    for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
      class242 class242_3 = arr_1[i_2];
      if (class242_3.field3128 != -1) {
        int i_6 = class242_3.field3128;
        String string_5 = "<img=" + i_6 + ">";
        if (string_0.startsWith(string_5)) {
          string_0 = string_0.substring(6 + Integer.toString(class242_3.field3128).length());
          break;
        }
      }
    }

    return string_0;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lkz;Lkz;B)I",
      garbageValue = "58"
  )
  int method3139(class287 class287_1, class287 class287_2) {
    if (client.field581 == class287_1.field3628) {
      if (class287_2.field3628 != client.field581) {
        return this.field1881 ? -1 : 1;
      }
    } else if (class287_2.field3628 == client.field581) {
      return this.field1881 ? 1 : -1;
    }

    return this.method5308(class287_1, class287_2);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method3139((class287) object_1, (class287) object_2);
  }

}
