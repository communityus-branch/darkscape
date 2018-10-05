package rs.darkscape.client;

import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
public abstract class class299 extends class314 {

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "[Lly;"
  )
  public static class317[] field3698;
  @ObfuscatedName("b")
  static int field3700 = -1;
  @ObfuscatedName("n")
  static int field3691 = -1;
  @ObfuscatedName("f")
  static int field3702 = -1;
  @ObfuscatedName("g")
  static int field3708 = -1;
  @ObfuscatedName("m")
  static int field3704 = 0;
  @ObfuscatedName("r")
  static int field3692 = 0;
  @ObfuscatedName("t")
  static int field3706 = 256;
  @ObfuscatedName("o")
  static int field3701 = 0;
  @ObfuscatedName("y")
  static int field3705 = 0;
  @ObfuscatedName("a")
  static Random field3709 = new Random();
  @ObfuscatedName("j")
  static String[] field3710 = new String[100];
  @ObfuscatedName("k")
  public int field3695 = 0;
  @ObfuscatedName("i")
  public int field3696;
  @ObfuscatedName("x")
  public int field3697;
  @ObfuscatedName("z")
  byte[][] field3707 = new byte[256][];
  @ObfuscatedName("u")
  int[] field3693;
  @ObfuscatedName("q")
  int[] field3694;
  @ObfuscatedName("s")
  int[] field3689;
  @ObfuscatedName("l")
  int[] field3690;
  @ObfuscatedName("w")
  int[] field3703;
  @ObfuscatedName("p")
  byte[] field3699;

  class299(byte[] bytes_1, int[] ints_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6,
           byte[][] bytes_7) {
    this.field3693 = ints_2;
    this.field3694 = ints_3;
    this.field3689 = ints_4;
    this.field3690 = ints_5;
    this.method5540(bytes_1);
    this.field3707 = bytes_7;
    int i_8 = Integer.MAX_VALUE;
    int i_9 = Integer.MIN_VALUE;

    for (int i_10 = 0; i_10 < 256; i_10++) {
      if (this.field3694[i_10] < i_8 && this.field3690[i_10] != 0) {
        i_8 = this.field3694[i_10];
      }

      if (this.field3694[i_10] + this.field3690[i_10] > i_9) {
        i_9 = this.field3694[i_10] + this.field3690[i_10];
      }
    }

    this.field3696 = this.field3695 - i_8;
    this.field3697 = i_9 - this.field3695;
  }

  class299(byte[] bytes_1) {
    this.method5540(bytes_1);
  }

  @ObfuscatedName("e")
  static int method5599(byte[][] bytes_0, byte[][] bytes_1, int[] ints_2, int[] ints_3,
                        int[] ints_4, int i_5, int i_6) {
    int i_7 = ints_2[i_5];
    int i_8 = i_7 + ints_4[i_5];
    int i_9 = ints_2[i_6];
    int i_10 = i_9 + ints_4[i_6];
    int i_11 = i_7;
    if (i_9 > i_7) {
      i_11 = i_9;
    }

    int i_12 = i_8;
    if (i_10 < i_8) {
      i_12 = i_10;
    }

    int i_13 = ints_3[i_5];
    if (ints_3[i_6] < i_13) {
      i_13 = ints_3[i_6];
    }

    byte[] bytes_14 = bytes_1[i_5];
    byte[] bytes_15 = bytes_0[i_6];
    int i_16 = i_11 - i_7;
    int i_17 = i_11 - i_9;

    for (int i_18 = i_11; i_18 < i_12; i_18++) {
      int i_19 = bytes_14[i_16++] + bytes_15[i_17++];
      if (i_19 < i_13) {
        i_13 = i_19;
      }
    }

    return -i_13;
  }

  @ObfuscatedName("m")
  public static String method5521(String string_0) {
    int i_1 = string_0.length();
    int i_2 = 0;

    for (int i_3 = 0; i_3 < i_1; i_3++) {
      char var_4 = string_0.charAt(i_3);
      if (var_4 == 60 || var_4 == 62) {
        i_2 += 3;
      }
    }

    StringBuilder stringbuilder_6 = new StringBuilder(i_1 + i_2);

    for (int i_7 = 0; i_7 < i_1; i_7++) {
      char var_5 = string_0.charAt(i_7);
      if (var_5 == 60) {
        stringbuilder_6.append("<lt>");
      } else if (var_5 == 62) {
        stringbuilder_6.append("<gt>");
      } else {
        stringbuilder_6.append(var_5);
      }
    }

    return stringbuilder_6.toString();
  }

  @ObfuscatedName("ao")
  static void method5538(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
    int i_6 = i_1 + i_2 * class314.field3761;
    int i_7 = class314.field3761 - i_3;
    int i_8 = 0;
    int i_9 = 0;
    int i_10;
    if (i_2 < class314.field3763) {
      i_10 = class314.field3763 - i_2;
      i_4 -= i_10;
      i_2 = class314.field3763;
      i_9 += i_3 * i_10;
      i_6 += i_10 * class314.field3761;
    }

    if (i_2 + i_4 > class314.field3764) {
      i_4 -= i_2 + i_4 - class314.field3764;
    }

    if (i_1 < class314.field3765) {
      i_10 = class314.field3765 - i_1;
      i_3 -= i_10;
      i_1 = class314.field3765;
      i_9 += i_10;
      i_6 += i_10;
      i_8 += i_10;
      i_7 += i_10;
    }

    if (i_3 + i_1 > class314.field3760) {
      i_10 = i_3 + i_1 - class314.field3760;
      i_3 -= i_10;
      i_8 += i_10;
      i_7 += i_10;
    }

    if (i_3 > 0 && i_4 > 0) {
      method5556(class314.field3766, bytes_0, i_5, i_9, i_6, i_3, i_4, i_7, i_8);
    }
  }

  @ObfuscatedName("at")
  static void method5556(int[] ints_0, byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                         int i_7, int i_8) {
    int i_9 = -(i_5 >> 2);
    i_5 = -(i_5 & 0x3);

    for (int i_10 = -i_6; i_10 < 0; i_10++) {
      int i_11;
      for (i_11 = i_9; i_11 < 0; i_11++) {
        if (bytes_1[i_3++] != 0) {
          ints_0[i_4++] = i_2;
        } else {
          ++i_4;
        }

        if (bytes_1[i_3++] != 0) {
          ints_0[i_4++] = i_2;
        } else {
          ++i_4;
        }

        if (bytes_1[i_3++] != 0) {
          ints_0[i_4++] = i_2;
        } else {
          ++i_4;
        }

        if (bytes_1[i_3++] != 0) {
          ints_0[i_4++] = i_2;
        } else {
          ++i_4;
        }
      }

      for (i_11 = i_5; i_11 < 0; i_11++) {
        if (bytes_1[i_3++] != 0) {
          ints_0[i_4++] = i_2;
        } else {
          ++i_4;
        }
      }

      i_4 += i_7;
      i_3 += i_8;
    }

  }

  @ObfuscatedName("ai")
  static void method5583(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
    int i_7 = i_1 + i_2 * class314.field3761;
    int i_8 = class314.field3761 - i_3;
    int i_9 = 0;
    int i_10 = 0;
    int i_11;
    if (i_2 < class314.field3763) {
      i_11 = class314.field3763 - i_2;
      i_4 -= i_11;
      i_2 = class314.field3763;
      i_10 += i_3 * i_11;
      i_7 += i_11 * class314.field3761;
    }

    if (i_2 + i_4 > class314.field3764) {
      i_4 -= i_2 + i_4 - class314.field3764;
    }

    if (i_1 < class314.field3765) {
      i_11 = class314.field3765 - i_1;
      i_3 -= i_11;
      i_1 = class314.field3765;
      i_10 += i_11;
      i_7 += i_11;
      i_9 += i_11;
      i_8 += i_11;
    }

    if (i_3 + i_1 > class314.field3760) {
      i_11 = i_3 + i_1 - class314.field3760;
      i_3 -= i_11;
      i_9 += i_11;
      i_8 += i_11;
    }

    if (i_3 > 0 && i_4 > 0) {
      method5585(class314.field3766, bytes_0, i_5, i_10, i_7, i_3, i_4, i_8, i_9, i_6);
    }
  }

  @ObfuscatedName("ac")
  static void method5585(int[] ints_0, byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                         int i_7, int i_8, int i_9) {
    i_2 = ((i_2 & 0xff00) * i_9 & 0xff0000) + (i_9 * (i_2 & 0xff00ff) & ~0xff00ff) >> 8;
    i_9 = 256 - i_9;

    for (int i_10 = -i_6; i_10 < 0; i_10++) {
      for (int i_11 = -i_5; i_11 < 0; i_11++) {
        if (bytes_1[i_3++] != 0) {
          int i_12 = ints_0[i_4];
          ints_0[i_4++] =
              (((i_12 & 0xff00) * i_9 & 0xff0000) + ((i_12 & 0xff00ff) * i_9 & ~0xff00ff) >> 8)
                  + i_2;
        } else {
          ++i_4;
        }
      }

      i_4 += i_7;
      i_3 += i_8;
    }

  }

  @ObfuscatedName("z")
  abstract void vmethod5536(byte[] var1, int var2, int var3, int var4, int var5, int var6);

  @ObfuscatedName("w")
  abstract void vmethod5542(byte[] var1, int var2, int var3, int var4, int var5, int var6,
                            int var7);

  @ObfuscatedName("x")
  void method5540(byte[] bytes_1) {
    this.field3703 = new int[256];
    int i_2;
    if (bytes_1.length == 257) {
      for (i_2 = 0; i_2 < this.field3703.length; i_2++) {
        this.field3703[i_2] = bytes_1[i_2] & 0xff;
      }

      this.field3695 = bytes_1[256] & 0xff;
    } else {
      i_2 = 0;

      for (int i_3 = 0; i_3 < 256; i_3++) {
        this.field3703[i_3] = bytes_1[i_2++] & 0xff;
      }

      int[] ints_10 = new int[256];
      int[] ints_4 = new int[256];

      int i_5;
      for (i_5 = 0; i_5 < 256; i_5++) {
        ints_10[i_5] = bytes_1[i_2++] & 0xff;
      }

      for (i_5 = 0; i_5 < 256; i_5++) {
        ints_4[i_5] = bytes_1[i_2++] & 0xff;
      }

      byte[][] bytes_11 = new byte[256][];

      int i_8;
      for (int i_6 = 0; i_6 < 256; i_6++) {
        bytes_11[i_6] = new byte[ints_10[i_6]];
        byte b_7 = 0;

        for (i_8 = 0; i_8 < bytes_11[i_6].length; i_8++) {
          b_7 += bytes_1[i_2++];
          bytes_11[i_6][i_8] = b_7;
        }
      }

      byte[][] bytes_12 = new byte[256][];

      int i_13;
      for (i_13 = 0; i_13 < 256; i_13++) {
        bytes_12[i_13] = new byte[ints_10[i_13]];
        byte b_14 = 0;

        for (int i_9 = 0; i_9 < bytes_12[i_13].length; i_9++) {
          b_14 += bytes_1[i_2++];
          bytes_12[i_13][i_9] = b_14;
        }
      }

      this.field3699 = new byte[65536];

      for (i_13 = 0; i_13 < 256; i_13++) {
        if (i_13 != 32 && i_13 != 160) {
          for (i_8 = 0; i_8 < 256; i_8++) {
            if (i_8 != 32 && i_8 != 160) {
              this.field3699[i_8 + (i_13 << 8)] = (byte) method5599(bytes_11, bytes_12, ints_4,
                                                                    this.field3703, ints_10, i_13,
                                                                    i_8);
            }
          }
        }
      }

      this.field3695 = ints_4[32] + ints_10[32];
    }

  }

  @ObfuscatedName("p")
  int method5516(char var_1) {
    if (var_1 == 160) {
      var_1 = 32;
    }

    return this.field3703[class166.method3441(var_1) & 0xff];
  }

  @ObfuscatedName("b")
  public int method5517(String string_1) {
    if (string_1 == null) {
      return 0;
    } else {
      int i_2 = -1;
      int i_3 = -1;
      int i_4 = 0;

      for (int i_5 = 0; i_5 < string_1.length(); i_5++) {
        char var_6 = string_1.charAt(i_5);
        if (var_6 == 60) {
          i_2 = i_5;
        } else {
          if (var_6 == 62 && i_2 != -1) {
            String string_7 = string_1.substring(i_2 + 1, i_5);
            i_2 = -1;
            if (string_7.equals("lt")) {
              var_6 = 60;
            } else {
              if (!string_7.equals("gt")) {
                if (string_7.startsWith("img=")) {
                  try {
                    String string_9 = string_7.substring(4);
                    int i_8 = class68.method1693(string_9, 10, true);
                    i_4 += field3698[i_8].field3784;
                    i_3 = -1;
                  } catch (Exception ignored) {
                  }
                }
                continue;
              }

              var_6 = 62;
            }
          }

          if (var_6 == 160) {
            var_6 = 32;
          }

          if (i_2 == -1) {
            i_4 += this.field3703[(char) (class166.method3441(var_6) & 0xff)];
            if (this.field3699 != null && i_3 != -1) {
              i_4 += this.field3699[var_6 + (i_3 << 8)];
            }

            i_3 = var_6;
          }
        }
      }

      return i_4;
    }
  }

  @ObfuscatedName("n")
  public int method5518(String string_1, int[] ints_2, String[] arr_3) {
    if (string_1 == null) {
      return 0;
    } else {
      int i_4 = 0;
      int i_5 = 0;
      StringBuilder stringbuilder_6 = new StringBuilder(100);
      int i_7 = -1;
      int i_8 = 0;
      byte b_9 = 0;
      int i_10 = -1;
      char var_11 = 0;
      int i_12 = 0;
      int i_13 = string_1.length();

      for (int i_14 = 0; i_14 < i_13; i_14++) {
        char var_15 = string_1.charAt(i_14);
        if (var_15 == 60) {
          i_10 = i_14;
        } else {
          if (var_15 == 62 && i_10 != -1) {
            String string_16 = string_1.substring(i_10 + 1, i_14);
            i_10 = -1;
            stringbuilder_6.append('<');
            stringbuilder_6.append(string_16);
            stringbuilder_6.append('>');
            if (string_16.equals("br")) {
              arr_3[i_12] = stringbuilder_6.toString().substring(i_5, stringbuilder_6.length());
              ++i_12;
              i_5 = stringbuilder_6.length();
              i_4 = 0;
              i_7 = -1;
              var_11 = 0;
            } else if (string_16.equals("lt")) {
              i_4 += this.method5516('<');
              if (this.field3699 != null && var_11 != -1) {
                i_4 += this.field3699[(var_11 << 8) + 60];
              }

              var_11 = 60;
            } else if (string_16.equals("gt")) {
              i_4 += this.method5516('>');
              if (this.field3699 != null && var_11 != -1) {
                i_4 += this.field3699[(var_11 << 8) + 62];
              }

              var_11 = 62;
            } else if (string_16.startsWith("img=")) {
              try {
                String string_18 = string_16.substring(4);
                int i_17 = class68.method1693(string_18, 10, true);
                i_4 += field3698[i_17].field3784;
                var_11 = 0;
              } catch (Exception ignored) {
              }
            }

            var_15 = 0;
          }

          if (i_10 == -1) {
            if (var_15 != 0) {
              stringbuilder_6.append(var_15);
              i_4 += this.method5516(var_15);
              if (this.field3699 != null && var_11 != -1) {
                i_4 += this.field3699[var_15 + (var_11 << 8)];
              }

              var_11 = var_15;
            }

            if (var_15 == 32) {
              i_7 = stringbuilder_6.length();
              i_8 = i_4;
              b_9 = 1;
            }

            if (ints_2 != null && i_4 > ints_2[i_12 < ints_2.length ? i_12 : ints_2.length - 1]
                && i_7 >= 0) {
              arr_3[i_12] = stringbuilder_6.toString().substring(i_5, i_7 - b_9);
              ++i_12;
              i_5 = i_7;
              i_7 = -1;
              i_4 -= i_8;
              var_11 = 0;
            }

            if (var_15 == 45) {
              i_7 = stringbuilder_6.length();
              i_8 = i_4;
              b_9 = 0;
            }
          }
        }
      }

      String string_21 = stringbuilder_6.toString();
      if (string_21.length() > i_5) {
        arr_3[i_12++] = string_21.substring(i_5, string_21.length());
      }

      return i_12;
    }
  }

  @ObfuscatedName("f")
  public int method5519(String string_1, int i_2) {
    int i_3 = this.method5518(string_1, new int[]{i_2}, field3710);
    int i_4 = 0;

    for (int i_5 = 0; i_5 < i_3; i_5++) {
      int i_6 = this.method5517(field3710[i_5]);
      if (i_6 > i_4) {
        i_4 = i_6;
      }
    }

    return i_4;
  }

  @ObfuscatedName("g")
  public int method5520(String string_1, int i_2) {
    return this.method5518(string_1, new int[]{i_2}, field3710);
  }

  @ObfuscatedName("r")
  public void method5522(String string_1, int i_2, int i_3, int i_4, int i_5) {
    if (string_1 != null) {
      this.method5531(i_4, i_5);
      this.method5514(string_1, i_2, i_3);
    }
  }

  @ObfuscatedName("t")
  public void method5523(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
    if (string_1 != null) {
      this.method5531(i_4, i_5);
      field3706 = i_6;
      this.method5514(string_1, i_2, i_3);
    }
  }

  @ObfuscatedName("o")
  public void method5524(String string_1, int i_2, int i_3, int i_4, int i_5) {
    if (string_1 != null) {
      this.method5531(i_4, i_5);
      this.method5514(string_1, i_2 - this.method5517(string_1), i_3);
    }
  }

  @ObfuscatedName("y")
  public void method5525(String string_1, int i_2, int i_3, int i_4, int i_5) {
    if (string_1 != null) {
      this.method5531(i_4, i_5);
      this.method5514(string_1, i_2 - this.method5517(string_1) / 2, i_3);
    }
  }

  @ObfuscatedName("a")
  public int method5526(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7,
                        int i_8, int i_9, int i_10) {
    if (string_1 == null) {
      return 0;
    } else {
      this.method5531(i_6, i_7);
      if (i_10 == 0) {
        i_10 = this.field3695;
      }

      int[] ints_11 = new int[]{i_4};
      if (i_5 < i_10 + this.field3696 + this.field3697 && i_5 < i_10 + i_10) {
        ints_11 = null;
      }

      int i_12 = this.method5518(string_1, ints_11, field3710);
      if (i_9 == 3 && i_12 == 1) {
        i_9 = 1;
      }

      int i_13;
      int i_14;
      if (i_9 == 0) {
        i_13 = i_3 + this.field3696;
      } else if (i_9 == 1) {
        i_13 =
            i_3 + (i_5 - this.field3696 - this.field3697 - i_10 * (i_12 - 1)) / 2 + this.field3696;
      } else if (i_9 == 2) {
        i_13 = i_3 + i_5 - this.field3697 - i_10 * (i_12 - 1);
      } else {
        i_14 = (i_5 - this.field3696 - this.field3697 - i_10 * (i_12 - 1)) / (i_12 + 1);
        if (i_14 < 0) {
          i_14 = 0;
        }

        i_13 = i_3 + i_14 + this.field3696;
        i_10 += i_14;
      }

      for (i_14 = 0; i_14 < i_12; i_14++) {
        if (i_8 == 0) {
          this.method5514(field3710[i_14], i_2, i_13);
        } else if (i_8 == 1) {
          this.method5514(field3710[i_14], i_2 + (i_4 - this.method5517(field3710[i_14])) / 2,
                          i_13);
        } else if (i_8 == 2) {
          this.method5514(field3710[i_14], i_2 + i_4 - this.method5517(field3710[i_14]), i_13);
        } else if (i_14 == i_12 - 1) {
          this.method5514(field3710[i_14], i_2, i_13);
        } else {
          this.method5533(field3710[i_14], i_4);
          this.method5514(field3710[i_14], i_2, i_13);
          field3701 = 0;
        }

        i_13 += i_10;
      }

      return i_12;
    }
  }

  @ObfuscatedName("c")
  public void method5609(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
    if (string_1 != null) {
      this.method5531(i_4, i_5);
      int[] ints_7 = new int[string_1.length()];

      for (int i_8 = 0; i_8 < string_1.length(); i_8++) {
        ints_7[i_8] = (int) (Math.sin((double) i_8 / 2.0D + (double) i_6 / 5.0D) * 5.0D);
      }

      this.method5549(string_1, i_2 - this.method5517(string_1) / 2, i_3, (int[]) null, ints_7);
    }
  }

  @ObfuscatedName("v")
  public void method5575(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
    if (string_1 != null) {
      this.method5531(i_4, i_5);
      int[] ints_7 = new int[string_1.length()];
      int[] ints_8 = new int[string_1.length()];

      for (int i_9 = 0; i_9 < string_1.length(); i_9++) {
        ints_7[i_9] = (int) (Math.sin((double) i_9 / 5.0D + (double) i_6 / 5.0D) * 5.0D);
        ints_8[i_9] = (int) (Math.sin((double) i_9 / 3.0D + (double) i_6 / 5.0D) * 5.0D);
      }

      this.method5549(string_1, i_2 - this.method5517(string_1) / 2, i_3, ints_7, ints_8);
    }
  }

  @ObfuscatedName("af")
  public void method5539(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
    if (string_1 != null) {
      this.method5531(i_4, i_5);
      double d_8 = 7.0D - (double) i_7 / 8.0D;
      if (d_8 < 0.0D) {
        d_8 = 0.0D;
      }

      int[] ints_10 = new int[string_1.length()];

      for (int i_11 = 0; i_11 < string_1.length(); i_11++) {
        ints_10[i_11] = (int) (Math.sin((double) i_11 / 1.5D + (double) i_6 / 1.0D) * d_8);
      }

      this.method5549(string_1, i_2 - this.method5517(string_1) / 2, i_3, (int[]) null, ints_10);
    }
  }

  @ObfuscatedName("ah")
  public void method5530(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
    if (string_1 != null) {
      this.method5531(i_4, i_5);
      field3709.setSeed((long) i_6);
      field3706 = 192 + (field3709.nextInt() & 0x1f);
      int[] ints_7 = new int[string_1.length()];
      int i_8 = 0;

      for (int i_9 = 0; i_9 < string_1.length(); i_9++) {
        ints_7[i_9] = i_8;
        if ((field3709.nextInt() & 0x3) == 0) {
          ++i_8;
        }
      }

      this.method5549(string_1, i_2, i_3, ints_7, (int[]) null);
    }
  }

  @ObfuscatedName("ab")
  void method5531(int i_1, int i_2) {
    field3700 = -1;
    field3691 = -1;
    field3702 = i_2;
    field3708 = i_2;
    field3704 = i_1;
    field3692 = i_1;
    field3706 = 256;
    field3701 = 0;
    field3705 = 0;
  }

  @ObfuscatedName("aw")
  void method5532(String string_1) {
    try {
      if (string_1.startsWith("col=")) {
        field3692 = class138.method3137(string_1.substring(4), 16);
      } else if (string_1.equals("/col")) {
        field3692 = field3704;
      } else if (string_1.startsWith("str=")) {
        field3700 = class138.method3137(string_1.substring(4), 16);
      } else if (string_1.equals("str")) {
        field3700 = 8388608;
      } else if (string_1.equals("/str")) {
        field3700 = -1;
      } else if (string_1.startsWith("u=")) {
        field3691 = class138.method3137(string_1.substring(2), 16);
      } else if (string_1.equals("u")) {
        field3691 = 0;
      } else if (string_1.equals("/u")) {
        field3691 = -1;
      } else if (string_1.startsWith("shad=")) {
        field3708 = class138.method3137(string_1.substring(5), 16);
      } else if (string_1.equals("shad")) {
        field3708 = 0;
      } else if (string_1.equals("/shad")) {
        field3708 = field3702;
      } else if (string_1.equals("br")) {
        this.method5531(field3704, field3702);
      }
    } catch (Exception ignored) {
    }

  }

  @ObfuscatedName("ak")
  void method5533(String string_1, int i_2) {
    int i_3 = 0;
    boolean bool_4 = false;

    for (int i_5 = 0; i_5 < string_1.length(); i_5++) {
      char var_6 = string_1.charAt(i_5);
      if (var_6 == 60) {
        bool_4 = true;
      } else if (var_6 == 62) {
        bool_4 = false;
      } else if (!bool_4 && var_6 == 32) {
        ++i_3;
      }
    }

    if (i_3 > 0) {
      field3701 = (i_2 - this.method5517(string_1) << 8) / i_3;
    }

  }

  @ObfuscatedName("as")
  void method5514(String string_1, int i_2, int i_3) {
    i_3 -= this.field3695;
    int i_4 = -1;
    int i_5 = -1;

    for (int i_6 = 0; i_6 < string_1.length(); i_6++) {
      if (string_1.charAt(i_6) != 0) {
        char var_7 = (char) (class166.method3441(string_1.charAt(i_6)) & 0xff);
        if (var_7 == 60) {
          i_4 = i_6;
        } else {
          int i_9;
          if (var_7 == 62 && i_4 != -1) {
            String string_8 = string_1.substring(i_4 + 1, i_6);
            i_4 = -1;
            if (string_8.equals("lt")) {
              var_7 = 60;
            } else {
              if (!string_8.equals("gt")) {
                if (string_8.startsWith("img=")) {
                  try {
                    String string_10 = string_8.substring(4);
                    i_9 = class68.method1693(string_10, 10, true);
                    class317 class317_12 = field3698[i_9];
                    class317_12.method5829(i_2, i_3 + this.field3695 - class317_12.field3783);
                    i_2 += class317_12.field3784;
                    i_5 = -1;
                  } catch (Exception ignored) {
                  }
                } else {
                  this.method5532(string_8);
                }
                continue;
              }

              var_7 = 62;
            }
          }

          if (var_7 == 160) {
            var_7 = 32;
          }

          if (i_4 == -1) {
            if (this.field3699 != null && i_5 != -1) {
              i_2 += this.field3699[var_7 + (i_5 << 8)];
            }

            int i_14 = this.field3689[var_7];
            i_9 = this.field3690[var_7];
            if (var_7 != 32) {
              if (field3706 == 256) {
                if (field3708 != -1) {
                  method5538(this.field3707[var_7], i_2 + this.field3693[var_7] + 1,
                             i_3 + this.field3694[var_7] + 1, i_14, i_9, field3708);
                }

                this.vmethod5536(this.field3707[var_7], i_2 + this.field3693[var_7],
                                 i_3 + this.field3694[var_7], i_14, i_9, field3692);
              } else {
                if (field3708 != -1) {
                  method5583(this.field3707[var_7], i_2 + this.field3693[var_7] + 1,
                             i_3 + this.field3694[var_7] + 1, i_14, i_9, field3708, field3706);
                }

                this.vmethod5542(this.field3707[var_7], i_2 + this.field3693[var_7],
                                 i_3 + this.field3694[var_7], i_14, i_9, field3692, field3706);
              }
            } else if (field3701 > 0) {
              field3705 += field3701;
              i_2 += field3705 >> 8;
              field3705 &= 0xff;
            }

            int i_15 = this.field3703[var_7];
            if (field3700 != -1) {
              class314
                  .method5736(i_2, i_3 + (int) ((double) this.field3695 * 0.7D), i_15, field3700);
            }

            if (field3691 != -1) {
              class314.method5736(i_2, i_3 + this.field3695 + 1, i_15, field3691);
            }

            i_2 += i_15;
            i_5 = var_7;
          }
        }
      }
    }

  }

  @ObfuscatedName("an")
  void method5549(String string_1, int i_2, int i_3, int[] ints_4, int[] ints_5) {
    i_3 -= this.field3695;
    int i_6 = -1;
    int i_7 = -1;
    int i_8 = 0;

    for (int i_9 = 0; i_9 < string_1.length(); i_9++) {
      if (string_1.charAt(i_9) != 0) {
        char var_10 = (char) (class166.method3441(string_1.charAt(i_9)) & 0xff);
        if (var_10 == 60) {
          i_6 = i_9;
        } else {
          int i_12;
          int i_13;
          int i_14;
          if (var_10 == 62 && i_6 != -1) {
            String string_11 = string_1.substring(i_6 + 1, i_9);
            i_6 = -1;
            if (string_11.equals("lt")) {
              var_10 = 60;
            } else {
              if (!string_11.equals("gt")) {
                if (string_11.startsWith("img=")) {
                  try {
                    if (ints_4 != null) {
                      i_12 = ints_4[i_8];
                    } else {
                      i_12 = 0;
                    }

                    if (ints_5 != null) {
                      i_13 = ints_5[i_8];
                    } else {
                      i_13 = 0;
                    }

                    ++i_8;
                    String string_15 = string_11.substring(4);
                    i_14 = class68.method1693(string_15, 10, true);
                    class317 class317_17 = field3698[i_14];
                    class317_17.method5829(i_12 + i_2,
                                           i_13 + (i_3 + this.field3695 - class317_17.field3783));
                    i_2 += class317_17.field3784;
                    i_7 = -1;
                  } catch (Exception ignored) {
                  }
                } else {
                  this.method5532(string_11);
                }
                continue;
              }

              var_10 = 62;
            }
          }

          if (var_10 == 160) {
            var_10 = 32;
          }

          if (i_6 == -1) {
            if (this.field3699 != null && i_7 != -1) {
              i_2 += this.field3699[var_10 + (i_7 << 8)];
            }

            int i_19 = this.field3689[var_10];
            i_12 = this.field3690[var_10];
            if (ints_4 != null) {
              i_13 = ints_4[i_8];
            } else {
              i_13 = 0;
            }

            if (ints_5 != null) {
              i_14 = ints_5[i_8];
            } else {
              i_14 = 0;
            }

            ++i_8;
            if (var_10 != 32) {
              if (field3706 == 256) {
                if (field3708 != -1) {
                  method5538(this.field3707[var_10], i_13 + i_2 + this.field3693[var_10] + 1,
                             i_3 + i_14 + this.field3694[var_10] + 1, i_19, i_12, field3708);
                }

                this.vmethod5536(this.field3707[var_10], i_13 + i_2 + this.field3693[var_10],
                                 i_3 + i_14 + this.field3694[var_10], i_19, i_12, field3692);
              } else {
                if (field3708 != -1) {
                  method5583(this.field3707[var_10], i_13 + i_2 + this.field3693[var_10] + 1,
                             i_3 + i_14 + this.field3694[var_10] + 1, i_19, i_12, field3708,
                             field3706);
                }

                this.vmethod5542(this.field3707[var_10], i_13 + i_2 + this.field3693[var_10],
                                 i_3 + i_14 + this.field3694[var_10], i_19, i_12, field3692,
                                 field3706);
              }
            } else if (field3701 > 0) {
              field3705 += field3701;
              i_2 += field3705 >> 8;
              field3705 &= 0xff;
            }

            int i_20 = this.field3703[var_10];
            if (field3700 != -1) {
              class314
                  .method5736(i_2, i_3 + (int) ((double) this.field3695 * 0.7D), i_20, field3700);
            }

            if (field3691 != -1) {
              class314.method5736(i_2, i_3 + this.field3695, i_20, field3691);
            }

            i_2 += i_20;
            i_7 = var_10;
          }
        }
      }
    }

  }

}
