package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class174 {

  @ObfuscatedName("z")
  int[] field2265;
  @ObfuscatedName("w")
  byte[] field2264;
  @ObfuscatedName("s")
  int[] field2267;

  public class174(byte[] bytes_1) {
    int i_2 = bytes_1.length;
    this.field2265 = new int[i_2];
    this.field2264 = bytes_1;
    int[] ints_3 = new int[33];
    this.field2267 = new int[8];
    int i_4 = 0;

    for (int i_5 = 0; i_5 < i_2; i_5++) {
      byte b_6 = bytes_1[i_5];
      if (b_6 != 0) {
        int i_7 = 1 << 32 - b_6;
        int i_8 = ints_3[b_6];
        this.field2265[i_5] = i_8;
        int i_9;
        int i_10;
        int i_11;
        int i_12;
        if ((i_8 & i_7) != 0) {
          i_9 = ints_3[b_6 - 1];
        } else {
          i_9 = i_8 | i_7;

          for (i_10 = b_6 - 1; i_10 >= 1; --i_10) {
            i_11 = ints_3[i_10];
            if (i_8 != i_11) {
              break;
            }

            i_12 = 1 << 32 - i_10;
            if ((i_11 & i_12) != 0) {
              ints_3[i_10] = ints_3[i_10 - 1];
              break;
            }

            ints_3[i_10] = i_11 | i_12;
          }
        }

        ints_3[b_6] = i_9;

        for (i_10 = b_6 + 1; i_10 <= 32; i_10++) {
          if (i_8 == ints_3[i_10]) {
            ints_3[i_10] = i_9;
          }
        }

        i_10 = 0;

        for (i_11 = 0; i_11 < b_6; i_11++) {
          i_12 = Integer.MIN_VALUE >>> i_11;
          if ((i_8 & i_12) != 0) {
            if (this.field2267[i_10] == 0) {
              this.field2267[i_10] = i_4;
            }

            i_10 = this.field2267[i_10];
          } else {
            ++i_10;
          }

          if (i_10 >= this.field2267.length) {
            int[] ints_13 = new int[this.field2267.length * 2];

            for (int i_14 = 0; i_14 < this.field2267.length; i_14++) {
              ints_13[i_14] = this.field2267[i_14];
            }

            this.field2267 = ints_13;
          }

          i_12 >>>= 1;
        }

        this.field2267[i_10] = ~i_5;
        if (i_10 >= i_4) {
          i_4 = i_10 + 1;
        }
      }
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([BII[BII)I",
      garbageValue = "-1994775044"
  )
  public int method3475(byte[] bytes_1, int i_2, int i_3, byte[] bytes_4, int i_5) {
    int i_6 = 0;
    int i_7 = i_5 << 3;

    for (i_3 += i_2; i_2 < i_3; i_2++) {
      int i_8 = bytes_1[i_2] & 0xff;
      int i_9 = this.field2265[i_8];
      byte b_10 = this.field2264[i_8];
      if (b_10 == 0) {
        throw new RuntimeException("");
      }

      int i_11 = i_7 >> 3;
      int i_12 = i_7 & 0x7;
      i_6 &= -i_12 >> 31;
      int i_13 = (b_10 + i_12 - 1 >> 3) + i_11;
      i_12 += 24;
      bytes_4[i_11] = (byte) (i_6 |= i_9 >>> i_12);
      if (i_11 < i_13) {
        ++i_11;
        i_12 -= 8;
        bytes_4[i_11] = (byte) (i_6 = i_9 >>> i_12);
        if (i_11 < i_13) {
          ++i_11;
          i_12 -= 8;
          bytes_4[i_11] = (byte) (i_6 = i_9 >>> i_12);
          if (i_11 < i_13) {
            ++i_11;
            i_12 -= 8;
            bytes_4[i_11] = (byte) (i_6 = i_9 >>> i_12);
            if (i_11 < i_13) {
              ++i_11;
              i_12 -= 8;
              bytes_4[i_11] = (byte) (i_6 = i_9 << -i_12);
            }
          }
        }
      }

      i_7 += b_10;
    }

    return (i_7 + 7 >> 3) - i_5;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "([BI[BIII)I",
      garbageValue = "1741371195"
  )
  public int method3480(byte[] bytes_1, int i_2, byte[] bytes_3, int i_4, int i_5) {
    if (i_5 == 0) {
      return 0;
    } else {
      int i_6 = 0;
      i_5 += i_4;
      int i_7 = i_2;

      while (true) {
        byte b_8 = bytes_1[i_7];
        if (b_8 < 0) {
          i_6 = this.field2267[i_6];
        } else {
          ++i_6;
        }

        int i_9;
        if ((i_9 = this.field2267[i_6]) < 0) {
          bytes_3[i_4++] = (byte) (~i_9);
          if (i_4 >= i_5) {
            break;
          }

          i_6 = 0;
        }

        if ((b_8 & 0x40) != 0) {
          i_6 = this.field2267[i_6];
        } else {
          ++i_6;
        }

        if ((i_9 = this.field2267[i_6]) < 0) {
          bytes_3[i_4++] = (byte) (~i_9);
          if (i_4 >= i_5) {
            break;
          }

          i_6 = 0;
        }

        if ((b_8 & 0x20) != 0) {
          i_6 = this.field2267[i_6];
        } else {
          ++i_6;
        }

        if ((i_9 = this.field2267[i_6]) < 0) {
          bytes_3[i_4++] = (byte) (~i_9);
          if (i_4 >= i_5) {
            break;
          }

          i_6 = 0;
        }

        if ((b_8 & 0x10) != 0) {
          i_6 = this.field2267[i_6];
        } else {
          ++i_6;
        }

        if ((i_9 = this.field2267[i_6]) < 0) {
          bytes_3[i_4++] = (byte) (~i_9);
          if (i_4 >= i_5) {
            break;
          }

          i_6 = 0;
        }

        if ((b_8 & 0x8) != 0) {
          i_6 = this.field2267[i_6];
        } else {
          ++i_6;
        }

        if ((i_9 = this.field2267[i_6]) < 0) {
          bytes_3[i_4++] = (byte) (~i_9);
          if (i_4 >= i_5) {
            break;
          }

          i_6 = 0;
        }

        if ((b_8 & 0x4) != 0) {
          i_6 = this.field2267[i_6];
        } else {
          ++i_6;
        }

        if ((i_9 = this.field2267[i_6]) < 0) {
          bytes_3[i_4++] = (byte) (~i_9);
          if (i_4 >= i_5) {
            break;
          }

          i_6 = 0;
        }

        if ((b_8 & 0x2) != 0) {
          i_6 = this.field2267[i_6];
        } else {
          ++i_6;
        }

        if ((i_9 = this.field2267[i_6]) < 0) {
          bytes_3[i_4++] = (byte) (~i_9);
          if (i_4 >= i_5) {
            break;
          }

          i_6 = 0;
        }

        if ((b_8 & 0x1) != 0) {
          i_6 = this.field2267[i_6];
        } else {
          ++i_6;
        }

        if ((i_9 = this.field2267[i_6]) < 0) {
          bytes_3[i_4++] = (byte) (~i_9);
          if (i_4 >= i_5) {
            break;
          }

          i_6 = 0;
        }

        ++i_7;
      }

      return i_7 + 1 - i_2;
    }
  }

}
