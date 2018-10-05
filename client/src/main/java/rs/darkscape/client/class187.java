package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class187 {

  @ObfuscatedName("ix")
  @ObfuscatedGetter(
      intValue = -83256289
  )
  static int field2372;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "988087011"
  )
  public static int computeChecksum(byte[] bytes_0, int i_1, int i_2) {
    int i_3 = -1;

    for (int i_4 = i_1; i_4 < i_2; i_4++) {
      i_3 = i_3 >>> 8 ^ Buffer.crc32Table[(i_3 ^ bytes_0[i_4]) & 0xff];
    }

    i_3 = ~i_3;
    return i_3;
  }

}
