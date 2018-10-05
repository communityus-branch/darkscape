package rs.darkscape.client;

import java.applet.Applet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class152 extends RuntimeException {

  @ObfuscatedName("z")
  public static Applet field1938;
  @ObfuscatedName("w")
  public static String field1939;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -1026373275
  )
  public static int field1940;
  @ObfuscatedName("u")
  String field1941;
  @ObfuscatedName("q")
  Throwable field1943;

  class152(Throwable throwable_1, String string_2) {
    this.field1941 = string_2;
    this.field1943 = throwable_1;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-105"
  )
  public static boolean method3247(int i_0) {
    return i_0 >= class233.field2759.field2777 && i_0 <= class233.field2764.field2777;
  }

}
