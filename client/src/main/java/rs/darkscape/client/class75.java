package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class class75 {

  @ObfuscatedName("a")
  public static String osName;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -952252275
  )
  int field1061;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -229344617
  )
  int field1066;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -1272979127
  )
  int field1060;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 1365690249
  )
  int field1062;
  @ObfuscatedName("u")
  String field1063;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "51"
  )
  public static int method1802(int i_0, int i_1, int i_2) {
    i_2 &= 0x3;
    return i_2 == 0 ? i_1 : (i_2 == 1 ? 7 - i_0 : (i_2 == 2 ? 7 - i_1 : i_0));
  }

}
