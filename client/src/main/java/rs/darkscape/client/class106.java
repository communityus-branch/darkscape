package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dz")
public class class106 {

  @ObfuscatedName("z")
  int field1388;
  @ObfuscatedName("w")
  int field1387;
  @ObfuscatedName("s")
  int[] field1389;
  @ObfuscatedName("l")
  int[] field1386;

  class106() {
    class92.method2108(16);
    this.field1388 = class92.method2093() != 0 ? class92.method2108(4) + 1 : 1;
    if (class92.method2093() != 0) {
      class92.method2108(8);
    }

    class92.method2108(2);
    if (this.field1388 > 1) {
      this.field1387 = class92.method2108(4);
    }

    this.field1389 = new int[this.field1388];
    this.field1386 = new int[this.field1388];

    for (int i_1 = 0; i_1 < this.field1388; i_1++) {
      class92.method2108(8);
      this.field1389[i_1] = class92.method2108(8);
      this.field1386[i_1] = class92.method2108(8);
    }

  }

}
