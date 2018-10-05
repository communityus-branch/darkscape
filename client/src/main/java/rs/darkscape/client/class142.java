package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class142 extends class283 {

  @ObfuscatedName("z")
  final boolean field1890;

  public class142(boolean bool_1) {
    this.field1890 = bool_1;
  }

  @ObfuscatedName("jf")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZB)Ljava/lang/String;",
      garbageValue = "20"
  )
  static String method3161(String string_0, boolean bool_1) {
    String str_2 = bool_1 ? "https://" : "http://";
    if (client.field777 == 1) {
      string_0 = string_0 + "-wtrc";
    } else if (client.field777 == 2) {
      string_0 = string_0 + "-wtqa";
    } else if (client.field777 == 3) {
      string_0 = string_0 + "-wtwip";
    } else if (client.field777 == 5) {
      string_0 = string_0 + "-wti";
    } else if (client.field777 == 4) {
      string_0 = "local";
    }

    String str_3 = "";
    if (Temp.field2013 != null) {
      str_3 = "/p=" + Temp.field2013;
    }

    String str_4 = "runescape.com";
    return str_2 + string_0 + "." + str_4 + "/l=" + client.field827 + "/a=" + class124.field1709
        + str_3 + "/";
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-879071974"
  )
  int method3164(class287 class287_1, class287 class287_2) {
    if (class287_1.field3628 != 0) {
      if (class287_2.field3628 == 0) {
        return this.field1890 ? -1 : 1;
      }
    } else if (class287_2.field3628 != 0) {
      return this.field1890 ? 1 : -1;
    }

    return this.method5308(class287_1, class287_2);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method3164((class287) object_1, (class287) object_2);
  }

}
