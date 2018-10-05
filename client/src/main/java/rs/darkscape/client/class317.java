package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ly")
public final class class317 extends class314 {

  @ObfuscatedName("w")
  public int[] colorPalette;
  @ObfuscatedName("k")
  public int field3784;
  @ObfuscatedName("i")
  public int field3783;
  @ObfuscatedName("z")
  public byte[] colorMap;
  @ObfuscatedName("s")
  public int field3780;
  @ObfuscatedName("l")
  public int field3781;
  @ObfuscatedName("u")
  public int field3782;
  @ObfuscatedName("q")
  public int field3778;

  @ObfuscatedName("l")
  static void method5823(int[] ints_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5,
                         int i_6, int i_7, int i_8) {
    int i_9 = -(i_5 >> 2);
    i_5 = -(i_5 & 0x3);

    for (int i_10 = -i_6; i_10 < 0; i_10++) {
      int i_11;
      byte b_12;
      for (i_11 = i_9; i_11 < 0; i_11++) {
        b_12 = bytes_1[i_3++];
        if (b_12 != 0) {
          ints_0[i_4++] = ints_2[b_12 & 0xff];
        } else {
          ++i_4;
        }

        b_12 = bytes_1[i_3++];
        if (b_12 != 0) {
          ints_0[i_4++] = ints_2[b_12 & 0xff];
        } else {
          ++i_4;
        }

        b_12 = bytes_1[i_3++];
        if (b_12 != 0) {
          ints_0[i_4++] = ints_2[b_12 & 0xff];
        } else {
          ++i_4;
        }

        b_12 = bytes_1[i_3++];
        if (b_12 != 0) {
          ints_0[i_4++] = ints_2[b_12 & 0xff];
        } else {
          ++i_4;
        }
      }

      for (i_11 = i_5; i_11 < 0; i_11++) {
        b_12 = bytes_1[i_3++];
        if (b_12 != 0) {
          ints_0[i_4++] = ints_2[b_12 & 0xff];
        } else {
          ++i_4;
        }
      }

      i_4 += i_7;
      i_3 += i_8;
    }

  }

  @ObfuscatedName("q")
  static void method5826(int[] ints_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5,
                         int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
    int i_12 = i_3;

    for (int i_13 = -i_8; i_13 < 0; i_13++) {
      int i_14 = i_11 * (i_4 >> 16);

      for (int i_15 = -i_7; i_15 < 0; i_15++) {
        byte b_16 = bytes_1[(i_3 >> 16) + i_14];
        if (b_16 != 0) {
          ints_0[i_5++] = ints_2[b_16 & 0xff];
        } else {
          ++i_5;
        }

        i_3 += i_9;
      }

      i_4 += i_10;
      i_3 = i_12;
      i_5 += i_6;
    }

  }

  @ObfuscatedName("z")
  public void method5824() {
    if (this.field3780 != this.field3784 || this.field3781 != this.field3783) {
      byte[] bytes_1 = new byte[this.field3784 * this.field3783];
      int i_2 = 0;

      for (int i_3 = 0; i_3 < this.field3781; i_3++) {
        for (int i_4 = 0; i_4 < this.field3780; i_4++) {
          bytes_1[i_4 + (i_3 + this.field3778) * this.field3784
              + this.field3782] = this.colorMap[i_2++];
        }
      }

      this.colorMap = bytes_1;
      this.field3780 = this.field3784;
      this.field3781 = this.field3783;
      this.field3782 = 0;
      this.field3778 = 0;
    }
  }

  @ObfuscatedName("w")
  public void method5822(int i_1, int i_2, int i_3) {
    for (int i_4 = 0; i_4 < this.colorPalette.length; i_4++) {
      int i_5 = this.colorPalette[i_4] >> 16 & 0xff;
      i_5 += i_1;
      if (i_5 < 0) {
        i_5 = 0;
      } else if (i_5 > 255) {
        i_5 = 255;
      }

      int i_6 = this.colorPalette[i_4] >> 8 & 0xff;
      i_6 += i_2;
      if (i_6 < 0) {
        i_6 = 0;
      } else if (i_6 > 255) {
        i_6 = 255;
      }

      int i_7 = this.colorPalette[i_4] & 0xff;
      i_7 += i_3;
      if (i_7 < 0) {
        i_7 = 0;
      } else if (i_7 > 255) {
        i_7 = 255;
      }

      this.colorPalette[i_4] = i_7 + (i_6 << 8) + (i_5 << 16);
    }

  }

  @ObfuscatedName("s")
  public void method5829(int i_1, int i_2) {
    i_1 += this.field3782;
    i_2 += this.field3778;
    int i_3 = i_1 + i_2 * class314.field3761;
    int i_4 = 0;
    int i_5 = this.field3781;
    int i_6 = this.field3780;
    int i_7 = class314.field3761 - i_6;
    int i_8 = 0;
    int i_9;
    if (i_2 < class314.field3763) {
      i_9 = class314.field3763 - i_2;
      i_5 -= i_9;
      i_2 = class314.field3763;
      i_4 += i_9 * i_6;
      i_3 += i_9 * class314.field3761;
    }

    if (i_5 + i_2 > class314.field3764) {
      i_5 -= i_5 + i_2 - class314.field3764;
    }

    if (i_1 < class314.field3765) {
      i_9 = class314.field3765 - i_1;
      i_6 -= i_9;
      i_1 = class314.field3765;
      i_4 += i_9;
      i_3 += i_9;
      i_8 += i_9;
      i_7 += i_9;
    }

    if (i_6 + i_1 > class314.field3760) {
      i_9 = i_6 + i_1 - class314.field3760;
      i_6 -= i_9;
      i_8 += i_9;
      i_7 += i_9;
    }

    if (i_6 > 0 && i_5 > 0) {
      method5823(class314.field3766, this.colorMap, this.colorPalette, i_4, i_3, i_6, i_5, i_7, i_8);
    }
  }

  @ObfuscatedName("u")
  public void method5825(int i_1, int i_2, int i_3, int i_4) {
    int i_5 = this.field3780;
    int i_6 = this.field3781;
    int i_7 = 0;
    int i_8 = 0;
    int i_9 = this.field3784;
    int i_10 = this.field3783;
    int i_11 = (i_9 << 16) / i_3;
    int i_12 = (i_10 << 16) / i_4;
    int i_13;
    if (this.field3782 > 0) {
      i_13 = (i_11 + (this.field3782 << 16) - 1) / i_11;
      i_1 += i_13;
      i_7 += i_13 * i_11 - (this.field3782 << 16);
    }

    if (this.field3778 > 0) {
      i_13 = (i_12 + (this.field3778 << 16) - 1) / i_12;
      i_2 += i_13;
      i_8 += i_13 * i_12 - (this.field3778 << 16);
    }

    if (i_5 < i_9) {
      i_3 = (i_11 + ((i_5 << 16) - i_7) - 1) / i_11;
    }

    if (i_6 < i_10) {
      i_4 = (i_12 + ((i_6 << 16) - i_8) - 1) / i_12;
    }

    i_13 = i_1 + i_2 * class314.field3761;
    int i_14 = class314.field3761 - i_3;
    if (i_2 + i_4 > class314.field3764) {
      i_4 -= i_2 + i_4 - class314.field3764;
    }

    int i_15;
    if (i_2 < class314.field3763) {
      i_15 = class314.field3763 - i_2;
      i_4 -= i_15;
      i_13 += i_15 * class314.field3761;
      i_8 += i_12 * i_15;
    }

    if (i_3 + i_1 > class314.field3760) {
      i_15 = i_3 + i_1 - class314.field3760;
      i_3 -= i_15;
      i_14 += i_15;
    }

    if (i_1 < class314.field3765) {
      i_15 = class314.field3765 - i_1;
      i_3 -= i_15;
      i_13 += i_15;
      i_7 += i_11 * i_15;
      i_14 += i_15;
    }

    method5826(class314.field3766, this.colorMap, this.colorPalette, i_7, i_8, i_13, i_14, i_3, i_4,
               i_11, i_12, i_5);
  }

}
