package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public abstract class class166 {

  @ObfuscatedName("ba")
  @ObfuscatedSignature(
      signature = "[Lll;"
  )
  static class318[] field2047;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 272064631
  )
  public int field2043;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 356397509
  )
  public int field2048;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -1693431647
  )
  public int field2042;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 1351347947
  )
  public int field2045;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(CI)B",
      garbageValue = "177794495"
  )
  public static byte method3441(char var_0) {
    byte b_1;
    if (var_0 > 0 && var_0 < 128 || var_0 >= 160 && var_0 <= 255) {
      b_1 = (byte) var_0;
    } else if (var_0 == 8364) {
      b_1 = -128;
    } else if (var_0 == 8218) {
      b_1 = -126;
    } else if (var_0 == 402) {
      b_1 = -125;
    } else if (var_0 == 8222) {
      b_1 = -124;
    } else if (var_0 == 8230) {
      b_1 = -123;
    } else if (var_0 == 8224) {
      b_1 = -122;
    } else if (var_0 == 8225) {
      b_1 = -121;
    } else if (var_0 == 710) {
      b_1 = -120;
    } else if (var_0 == 8240) {
      b_1 = -119;
    } else if (var_0 == 352) {
      b_1 = -118;
    } else if (var_0 == 8249) {
      b_1 = -117;
    } else if (var_0 == 338) {
      b_1 = -116;
    } else if (var_0 == 381) {
      b_1 = -114;
    } else if (var_0 == 8216) {
      b_1 = -111;
    } else if (var_0 == 8217) {
      b_1 = -110;
    } else if (var_0 == 8220) {
      b_1 = -109;
    } else if (var_0 == 8221) {
      b_1 = -108;
    } else if (var_0 == 8226) {
      b_1 = -107;
    } else if (var_0 == 8211) {
      b_1 = -106;
    } else if (var_0 == 8212) {
      b_1 = -105;
    } else if (var_0 == 732) {
      b_1 = -104;
    } else if (var_0 == 8482) {
      b_1 = -103;
    } else if (var_0 == 353) {
      b_1 = -102;
    } else if (var_0 == 8250) {
      b_1 = -101;
    } else if (var_0 == 339) {
      b_1 = -100;
    } else if (var_0 == 382) {
      b_1 = -98;
    } else if (var_0 == 376) {
      b_1 = -97;
    } else {
      b_1 = 63;
    }

    return b_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIILfk;B)Z",
      garbageValue = "27"
  )
  protected abstract boolean vmethod3440(int var1, int var2, int var3, class164 var4);

}
