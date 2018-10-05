package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class117 {

  @ObfuscatedName("z")
  static int[] field1551 = new int[500];
  @ObfuscatedName("w")
  static int[] field1543 = new int[500];
  @ObfuscatedName("s")
  static int[] field1544 = new int[500];
  @ObfuscatedName("l")
  static int[] field1545 = new int[500];
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Ldt;"
  )
  class124 field1546 = null;
  @ObfuscatedName("q")
  int field1547 = -1;
  @ObfuscatedName("p")
  boolean field1552 = false;
  @ObfuscatedName("k")
  int[] field1548;
  @ObfuscatedName("i")
  int[] field1549;
  @ObfuscatedName("x")
  int[] field1542;
  @ObfuscatedName("e")
  int[] field1550;

  @ObfuscatedSignature(
      signature = "([BLdt;)V"
  )
  class117(byte[] bytes_1, class124 class124_2) {
    this.field1546 = class124_2;
    Buffer class182_3 = new Buffer(bytes_1);
    Buffer class182_4 = new Buffer(bytes_1);
    class182_3.offset = 2;
    int i_5 = class182_3.getUInt8();
    int i_6 = -1;
    int i_7 = 0;
    class182_4.offset = i_5 + class182_3.offset;

    int i_8;
    for (i_8 = 0; i_8 < i_5; i_8++) {
      int i_9 = class182_3.getUInt8();
      if (i_9 > 0) {
        if (this.field1546.field1706[i_8] != 0) {
          for (int i_10 = i_8 - 1; i_10 > i_6; --i_10) {
            if (this.field1546.field1706[i_10] == 0) {
              field1551[i_7] = i_10;
              field1543[i_7] = 0;
              field1544[i_7] = 0;
              field1545[i_7] = 0;
              ++i_7;
              break;
            }
          }
        }

        field1551[i_7] = i_8;
        short s_11 = 0;
        if (this.field1546.field1706[i_8] == 3) {
          s_11 = 128;
        }

        if ((i_9 & 0x1) != 0) {
          field1543[i_7] = class182_4.method3561();
        } else {
          field1543[i_7] = s_11;
        }

        if ((i_9 & 0x2) != 0) {
          field1544[i_7] = class182_4.method3561();
        } else {
          field1544[i_7] = s_11;
        }

        if ((i_9 & 0x4) != 0) {
          field1545[i_7] = class182_4.method3561();
        } else {
          field1545[i_7] = s_11;
        }

        i_6 = i_8;
        ++i_7;
        if (this.field1546.field1706[i_8] == 5) {
          this.field1552 = true;
        }
      }
    }

    if (bytes_1.length != class182_4.offset) {
      throw new RuntimeException();
    } else {
      this.field1547 = i_7;
      this.field1548 = new int[i_7];
      this.field1549 = new int[i_7];
      this.field1542 = new int[i_7];
      this.field1550 = new int[i_7];

      for (i_8 = 0; i_8 < i_7; i_8++) {
        this.field1548[i_8] = field1551[i_8];
        this.field1549[i_8] = field1543[i_8];
        this.field1542[i_8] = field1544[i_8];
        this.field1550[i_8] = field1545[i_8];
      }

    }
  }

}
