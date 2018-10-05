package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public enum class244 implements class188 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Liw;"
  )
  field3146("runescape", "RuneScape", 0),
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Liw;"
  )
  field3141("stellardawn", "Stellar Dawn", 1),
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Liw;"
  )
  field3142("game3", "Game 3", 2),
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Liw;"
  )
  field3143("game4", "Game 4", 3),
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Liw;"
  )
  field3140("game5", "Game 5", 4),
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Liw;"
  )
  field3145("oldscape", "RuneScape 2007", 5);

  @ObfuscatedName("k")
  public final String field3144;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = -974844683
  )
  final int field3147;

  class244(String string_3, String string_4, int i_5) {
    this.field3144 = string_3;
    this.field3147 = i_5;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)[B",
      garbageValue = "-1251005186"
  )
  public static byte[] method4618(CharSequence charsequence_0) {
    int i_1 = charsequence_0.length();
    byte[] bytes_2 = new byte[i_1];

    for (int i_3 = 0; i_3 < i_1; i_3++) {
      char var_4 = charsequence_0.charAt(i_3);
      if (var_4 > 0 && var_4 < 128 || var_4 >= 160 && var_4 <= 255) {
        bytes_2[i_3] = (byte) var_4;
      } else if (var_4 == 8364) {
        bytes_2[i_3] = -128;
      } else if (var_4 == 8218) {
        bytes_2[i_3] = -126;
      } else if (var_4 == 402) {
        bytes_2[i_3] = -125;
      } else if (var_4 == 8222) {
        bytes_2[i_3] = -124;
      } else if (var_4 == 8230) {
        bytes_2[i_3] = -123;
      } else if (var_4 == 8224) {
        bytes_2[i_3] = -122;
      } else if (var_4 == 8225) {
        bytes_2[i_3] = -121;
      } else if (var_4 == 710) {
        bytes_2[i_3] = -120;
      } else if (var_4 == 8240) {
        bytes_2[i_3] = -119;
      } else if (var_4 == 352) {
        bytes_2[i_3] = -118;
      } else if (var_4 == 8249) {
        bytes_2[i_3] = -117;
      } else if (var_4 == 338) {
        bytes_2[i_3] = -116;
      } else if (var_4 == 381) {
        bytes_2[i_3] = -114;
      } else if (var_4 == 8216) {
        bytes_2[i_3] = -111;
      } else if (var_4 == 8217) {
        bytes_2[i_3] = -110;
      } else if (var_4 == 8220) {
        bytes_2[i_3] = -109;
      } else if (var_4 == 8221) {
        bytes_2[i_3] = -108;
      } else if (var_4 == 8226) {
        bytes_2[i_3] = -107;
      } else if (var_4 == 8211) {
        bytes_2[i_3] = -106;
      } else if (var_4 == 8212) {
        bytes_2[i_3] = -105;
      } else if (var_4 == 732) {
        bytes_2[i_3] = -104;
      } else if (var_4 == 8482) {
        bytes_2[i_3] = -103;
      } else if (var_4 == 353) {
        bytes_2[i_3] = -102;
      } else if (var_4 == 8250) {
        bytes_2[i_3] = -101;
      } else if (var_4 == 339) {
        bytes_2[i_3] = -100;
      } else if (var_4 == 382) {
        bytes_2[i_3] = -98;
      } else if (var_4 == 376) {
        bytes_2[i_3] = -97;
      } else {
        bytes_2[i_3] = 63;
      }
    }

    return bytes_2;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
  )
  public int vmethod5815() {
    return this.field3147;
  }

}
