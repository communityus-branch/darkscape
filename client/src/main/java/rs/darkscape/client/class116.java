package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class116 extends Node {

  @ObfuscatedName("g")
  static int[] field1541;
  @ObfuscatedName("f")
  boolean field1540 = false;
  @ObfuscatedName("u")
  int field1527;
  @ObfuscatedName("q")
  boolean field1530;
  @ObfuscatedName("k")
  int[] field1533;
  @ObfuscatedName("i")
  int[] field1535;
  @ObfuscatedName("x")
  int[] field1532;
  @ObfuscatedName("e")
  int[] field1536;
  @ObfuscatedName("p")
  int field1537;
  @ObfuscatedName("b")
  int field1538;
  @ObfuscatedName("n")
  int[] field1539;

  @ObfuscatedSignature(
      signature = "(Lgk;)V"
  )
  class116(Buffer class182_1) {
    this.field1527 = class182_1.getUInt16();
    this.field1530 = class182_1.getUInt8() == 1;
    int i_2 = class182_1.getUInt8();
    if (i_2 >= 1 && i_2 <= 4) {
      this.field1533 = new int[i_2];

      int i_3;
      for (i_3 = 0; i_3 < i_2; i_3++) {
        this.field1533[i_3] = class182_1.getUInt16();
      }

      if (i_2 > 1) {
        this.field1535 = new int[i_2 - 1];

        for (i_3 = 0; i_3 < i_2 - 1; i_3++) {
          this.field1535[i_3] = class182_1.getUInt8();
        }
      }

      if (i_2 > 1) {
        this.field1532 = new int[i_2 - 1];

        for (i_3 = 0; i_3 < i_2 - 1; i_3++) {
          this.field1532[i_3] = class182_1.getUInt8();
        }
      }

      this.field1536 = new int[i_2];

      for (i_3 = 0; i_3 < i_2; i_3++) {
        this.field1536[i_3] = class182_1.getInt32();
      }

      this.field1537 = class182_1.getUInt8();
      this.field1538 = class182_1.getUInt8();
      this.field1539 = null;
    } else {
      throw new RuntimeException();
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(DILir;)Z"
  )
  boolean method2661(double d_1, int i_3, AbstractPack class247_4) {
    int i_5;
    for (i_5 = 0; i_5 < this.field1533.length; i_5++) {
      if (class247_4.method4626(this.field1533[i_5]) == null) {
        return false;
      }
    }

    i_5 = i_3 * i_3;
    this.field1539 = new int[i_5];

    for (int i_6 = 0; i_6 < this.field1533.length; i_6++) {
      class317 class317_7 = class233.method4589(class247_4, this.field1533[i_6]);
      class317_7.method5824();
      byte[] bytes_8 = class317_7.colorMap;
      int[] ints_9 = class317_7.colorPalette;
      int i_10 = this.field1536[i_6];
      if ((i_10 & ~0xffffff) == 16777216) {
      }

      if ((i_10 & ~0xffffff) == 33554432) {
      }

      int i_11;
      int i_12;
      int i_13;
      int i_14;
      if ((i_10 & ~0xffffff) == 50331648) {
        i_11 = i_10 & 0xff00ff;
        i_12 = i_10 >> 8 & 0xff;

        for (i_13 = 0; i_13 < ints_9.length; i_13++) {
          i_14 = ints_9[i_13];
          if (i_14 >> 8 == (i_14 & 0xffff)) {
            i_14 &= 0xff;
            ints_9[i_13] = i_11 * i_14 >> 8 & 0xff00ff | i_12 * i_14 & 0xff00;
          }
        }
      }

      for (i_11 = 0; i_11 < ints_9.length; i_11++) {
        ints_9[i_11] = class122.method2792(ints_9[i_11], d_1);
      }

      if (i_6 == 0) {
        i_11 = 0;
      } else {
        i_11 = this.field1535[i_6 - 1];
      }

      if (i_11 == 0) {
        if (i_3 == class317_7.field3780) {
          for (i_12 = 0; i_12 < i_5; i_12++) {
            this.field1539[i_12] = ints_9[bytes_8[i_12] & 0xff];
          }
        } else if (class317_7.field3780 == 64 && i_3 == 128) {
          i_12 = 0;

          for (i_13 = 0; i_13 < i_3; i_13++) {
            for (i_14 = 0; i_14 < i_3; i_14++) {
              this.field1539[i_12++] = ints_9[bytes_8[(i_13 >> 1 << 6) + (i_14 >> 1)] & 0xff];
            }
          }
        } else {
          if (class317_7.field3780 != 128 || i_3 != 64) {
            throw new RuntimeException();
          }

          i_12 = 0;

          for (i_13 = 0; i_13 < i_3; i_13++) {
            for (i_14 = 0; i_14 < i_3; i_14++) {
              this.field1539[i_12++] = ints_9[bytes_8[(i_14 << 1) + (i_13 << 1 << 7)] & 0xff];
            }
          }
        }
      }

      if (i_11 == 1) {
      }

      if (i_11 == 2) {
      }

      if (i_11 == 3) {
      }
    }

    return true;
  }

  @ObfuscatedName("w")
  void method2656() {
    this.field1539 = null;
  }

  @ObfuscatedName("s")
  void method2657(int i_1) {
    if (this.field1539 != null) {
      short s_2;
      int i_3;
      int i_4;
      int i_5;
      int i_6;
      int i_7;
      int[] ints_10;
      if (this.field1537 == 1 || this.field1537 == 3) {
        if (field1541 == null || field1541.length < this.field1539.length) {
          field1541 = new int[this.field1539.length];
        }

        if (this.field1539.length == 4096) {
          s_2 = 64;
        } else {
          s_2 = 128;
        }

        i_3 = this.field1539.length;
        i_4 = s_2 * this.field1538 * i_1;
        i_5 = i_3 - 1;
        if (this.field1537 == 1) {
          i_4 = -i_4;
        }

        for (i_6 = 0; i_6 < i_3; i_6++) {
          i_7 = i_6 + i_4 & i_5;
          field1541[i_6] = this.field1539[i_7];
        }

        ints_10 = this.field1539;
        this.field1539 = field1541;
        field1541 = ints_10;
      }

      if (this.field1537 == 2 || this.field1537 == 4) {
        if (field1541 == null || field1541.length < this.field1539.length) {
          field1541 = new int[this.field1539.length];
        }

        if (this.field1539.length == 4096) {
          s_2 = 64;
        } else {
          s_2 = 128;
        }

        i_3 = this.field1539.length;
        i_4 = this.field1538 * i_1;
        i_5 = s_2 - 1;
        if (this.field1537 == 2) {
          i_4 = -i_4;
        }

        for (i_6 = 0; i_6 < i_3; i_6 += s_2) {
          for (i_7 = 0; i_7 < s_2; i_7++) {
            int i_8 = i_6 + i_7;
            int i_9 = i_6 + (i_7 + i_4 & i_5);
            field1541[i_8] = this.field1539[i_9];
          }
        }

        ints_10 = this.field1539;
        this.field1539 = field1541;
        field1541 = ints_10;
      }

    }
  }

}
