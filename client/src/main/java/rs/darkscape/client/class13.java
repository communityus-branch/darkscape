package rs.darkscape.client;

import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class13 {

  @ObfuscatedName("bn")
  @ObfuscatedSignature(
      signature = "[Lly;"
  )
  static class317[] field85;
  @ObfuscatedName("iu")
  @ObfuscatedGetter(
      intValue = -1440413395
  )
  static int field82;
  @ObfuscatedName("kb")
  @ObfuscatedGetter(
      intValue = 1699850059
  )
  static int field84;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 1337486339
  )
  int field83;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lha;"
  )
  class226 field88;

  @ObfuscatedSignature(
      signature = "(ILha;)V"
  )
  class13(int i_1, class226 class226_2) {
    this.field83 = i_1;
    this.field88 = class226_2;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Lly;",
      garbageValue = "2135043627"
  )
  public static class317[] method113(AbstractPack class247_0, String string_1, String string_2) {
    int i_3 = class247_0.method4642(string_1);
    int i_4 = class247_0.method4643(i_3, string_2);
    return class21.method278(class247_0, i_3, i_4);
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ILjava/lang/String;S)Z",
      garbageValue = "-4835"
  )
  static boolean method112(String string_0, int i_1, String string_2) {
    if (i_1 == 0) {
      try {
        if (!class45.field379.startsWith("win")) {
          throw new Exception();
        } else if (!string_0.startsWith("http://") && !string_0.startsWith("https://")) {
          throw new Exception();
        } else {
          String str_10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

          for (int i_4 = 0; i_4 < string_0.length(); i_4++) {
            if (str_10.indexOf(string_0.charAt(i_4)) == -1) {
              throw new Exception();
            }
          }

          Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string_0 + "\"");
          return true;
        }
      } catch (Throwable throwable_5) {
        return false;
      }
    } else if (i_1 == 1) {
      try {
        Object object_3 = class41.method700(class45.field378, string_2, new Object[]{
            (new URL(class45.field378.getCodeBase(), string_0)).toString()});
        return object_3 != null;
      } catch (Throwable throwable_6) {
        return false;
      }
    } else if (i_1 == 2) {
      try {
        class45.field378.getAppletContext()
            .showDocument(new URL(class45.field378.getCodeBase(), string_0), "_blank");
        return true;
      } catch (Exception exception_7) {
        return false;
      }
    } else if (i_1 == 3) {
      try {
        class41.method702(class45.field378, "loggedout");
      } catch (Throwable ignored) {
      }

      try {
        class45.field378.getAppletContext()
            .showDocument(new URL(class45.field378.getCodeBase(), string_0), "_top");
        return true;
      } catch (Exception exception_8) {
        return false;
      }
    } else {
      throw new IllegalArgumentException();
    }
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(ILce;ZS)I",
      garbageValue = "12509"
  )
  static int method111(int i_0, class84 class84_1, boolean bool_2) {
    class230 class230_3 = class26.method434(class69.field999[--class69.field1003]);
    if (i_0 == 2600) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2626;
      return 1;
    } else if (i_0 == 2601) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2663;
      return 1;
    } else if (i_0 == 2602) {
      class69.field1001[++class55.field497 - 1] = class230_3.field2667;
      return 1;
    } else if (i_0 == 2603) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2628;
      return 1;
    } else if (i_0 == 2604) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2629;
      return 1;
    } else if (i_0 == 2605) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2704;
      return 1;
    } else if (i_0 == 2606) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2656;
      return 1;
    } else if (i_0 == 2607) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2658;
      return 1;
    } else if (i_0 == 2608) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2657;
      return 1;
    } else if (i_0 == 2609) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2636;
      return 1;
    } else if (i_0 == 2610) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2608;
      return 1;
    } else if (i_0 == 2611) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2630;
      return 1;
    } else if (i_0 == 2612) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2631;
      return 1;
    } else if (i_0 == 2613) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2701.vmethod5815();
      return 1;
    } else if (i_0 == 2614) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2726 ? 1 : 0;
      return 1;
    } else {
      return 2;
    }
  }

}
