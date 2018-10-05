package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class124 extends Node {

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "[Lly;"
  )
  static class317[] field1708;
  @ObfuscatedName("ba")
  @ObfuscatedGetter(
      intValue = -1804049311
  )
  static int field1709;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 28942011
  )
  int field1704;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -1349970051
  )
  int field1705;
  @ObfuscatedName("s")
  int[] field1706;
  @ObfuscatedName("l")
  int[][] field1707;

  class124(int i_1, byte[] bytes_2) {
    this.field1704 = i_1;
    Buffer class182_3 = new Buffer(bytes_2);
    this.field1705 = class182_3.getUInt8();
    this.field1706 = new int[this.field1705];
    this.field1707 = new int[this.field1705][];

    int i_4;
    for (i_4 = 0; i_4 < this.field1705; i_4++) {
      this.field1706[i_4] = class182_3.getUInt8();
    }

    for (i_4 = 0; i_4 < this.field1705; i_4++) {
      this.field1707[i_4] = new int[class182_3.getUInt8()];
    }

    for (i_4 = 0; i_4 < this.field1705; i_4++) {
      for (int i_5 = 0; i_5 < this.field1707[i_4].length; i_5++) {
        this.field1707[i_4][i_5] = class182_3.getUInt8();
      }
    }

  }

}
