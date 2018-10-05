package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public class class96 {

  @ObfuscatedName("z")
  int field1316 = 2;
  @ObfuscatedName("w")
  int[] field1323 = new int[2];
  @ObfuscatedName("s")
  int[] field1319 = new int[2];
  @ObfuscatedName("q")
  int field1317;
  @ObfuscatedName("l")
  int field1314;
  @ObfuscatedName("u")
  int field1318;
  @ObfuscatedName("k")
  int field1320;
  @ObfuscatedName("i")
  int field1321;
  @ObfuscatedName("e")
  int field1322;
  @ObfuscatedName("p")
  int field1315;
  @ObfuscatedName("b")
  int field1324;

  class96() {
    this.field1323[0] = 0;
    this.field1323[1] = 65535;
    this.field1319[0] = 0;
    this.field1319[1] = 65535;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lgk;)V"
  )
  final void method2199(Buffer class182_1) {
    this.field1317 = class182_1.getUInt8();
    this.field1314 = class182_1.getInt32();
    this.field1318 = class182_1.getInt32();
    this.method2197(class182_1);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;)V"
  )
  final void method2197(Buffer class182_1) {
    this.field1316 = class182_1.getUInt8();
    this.field1323 = new int[this.field1316];
    this.field1319 = new int[this.field1316];

    for (int i_2 = 0; i_2 < this.field1316; i_2++) {
      this.field1323[i_2] = class182_1.getUInt16();
      this.field1319[i_2] = class182_1.getUInt16();
    }

  }

  @ObfuscatedName("s")
  final void method2198() {
    this.field1320 = 0;
    this.field1321 = 0;
    this.field1322 = 0;
    this.field1315 = 0;
    this.field1324 = 0;
  }

  @ObfuscatedName("l")
  final int method2206(int i_1) {
    if (this.field1324 >= this.field1320) {
      this.field1315 = this.field1319[this.field1321++] << 15;
      if (this.field1321 >= this.field1316) {
        this.field1321 = this.field1316 - 1;
      }

      this.field1320 = (int) ((double) this.field1323[this.field1321] / 65536.0D * (double) i_1);
      if (this.field1320 > this.field1324) {
        this.field1322 = ((this.field1319[this.field1321] << 15) - this.field1315) / (this.field1320
            - this.field1324);
      }
    }

    this.field1315 += this.field1322;
    ++this.field1324;
    return this.field1315 - this.field1322 >> 15;
  }

}
