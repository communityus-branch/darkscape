package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class122 extends class314 {

  @ObfuscatedName("l")
  public static boolean field1670 = true;
  @ObfuscatedName("b")
  public static int field1678 = 512;
  @ObfuscatedName("j")
  public static int[] field1675 = new int[65536];
  @ObfuscatedName("v")
  public static int[] field1681 = new int[2048];
  @ObfuscatedName("af")
  public static int[] field1693 = new int[2048];
  @ObfuscatedName("d")
  @ObfuscatedSignature(
      signature = "Les;"
  )
  public static class131 field1667;
  @ObfuscatedName("z")
  static boolean field1677 = false;
  @ObfuscatedName("w")
  static boolean field1668 = false;
  @ObfuscatedName("s")
  static boolean field1669 = false;
  @ObfuscatedName("u")
  static int field1671 = 0;
  @ObfuscatedName("a")
  static int[] field1682 = new int[1024];
  @ObfuscatedName("h")
  static int[] field1690 = new int[512];
  @ObfuscatedName("c")
  static int[] field1691 = new int[2048];
  @ObfuscatedName("g")
  static int field1688;
  @ObfuscatedName("m")
  static int field1672;
  @ObfuscatedName("n")
  static int field1687;
  @ObfuscatedName("f")
  static int field1689;
  @ObfuscatedName("r")
  static int field1683;
  @ObfuscatedName("t")
  static int field1684;
  @ObfuscatedName("o")
  static int field1685;
  @ObfuscatedName("y")
  static int field1686;

  static {
    int i_0;
    for (i_0 = 1; i_0 < 512; i_0++) {
      field1690[i_0] = 32768 / i_0;
    }

    for (i_0 = 1; i_0 < 2048; i_0++) {
      field1691[i_0] = 65536 / i_0;
    }

    for (i_0 = 0; i_0 < 2048; i_0++) {
      field1681[i_0] = (int) (65536.0D * Math.sin((double) i_0 * 0.0030679615D));
      field1693[i_0] = (int) (65536.0D * Math.cos((double) i_0 * 0.0030679615D));
    }

  }

  @ObfuscatedName("z")
  public static final void method2862() {
    method2786(class314.field3765, class314.field3763, class314.field3760, class314.field3764);
  }

  @ObfuscatedName("w")
  static final void method2786(int i_0, int i_1, int i_2, int i_3) {
    field1688 = i_2 - i_0;
    field1672 = i_3 - i_1;
    method2832();
    if (field1682.length < field1672) {
      field1682 = new int[class146.method3193(field1672)];
    }

    int i_4 = i_0 + class314.field3761 * i_1;

    for (int i_5 = 0; i_5 < field1672; i_5++) {
      field1682[i_5] = i_4;
      i_4 += class314.field3761;
    }

  }

  @ObfuscatedName("s")
  public static final void method2832() {
    field1687 = field1688 / 2;
    field1689 = field1672 / 2;
    field1683 = -field1687;
    field1684 = field1688 - field1687;
    field1685 = -field1689;
    field1686 = field1672 - field1689;
  }

  @ObfuscatedName("l")
  public static final void method2827(int i_0, int i_1) {
    int i_2 = field1682[0];
    int i_3 = i_2 / class314.field3761;
    int i_4 = i_2 - i_3 * class314.field3761;
    field1687 = i_0 - i_4;
    field1689 = i_1 - i_3;
    field1683 = -field1687;
    field1684 = field1688 - field1687;
    field1685 = -field1689;
    field1686 = field1672 - field1689;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Les;)V"
  )
  public static final void method2789(class131 class131_0) {
    field1667 = class131_0;
  }

  @ObfuscatedName("q")
  public static final void method2830(double d_0) {
    method2791(d_0, 0, 512);
  }

  @ObfuscatedName("i")
  static final void method2791(double d_0, int i_2, int i_3) {
    int i_4 = i_2 * 128;

    for (int i_5 = i_2; i_5 < i_3; i_5++) {
      double d_6 = (double) (i_5 >> 3) / 64.0D + 0.0078125D;
      double d_8 = (double) (i_5 & 0x7) / 8.0D + 0.0625D;

      for (int i_10 = 0; i_10 < 128; i_10++) {
        double d_11 = (double) i_10 / 128.0D;
        double d_13 = d_11;
        double d_15 = d_11;
        double d_17 = d_11;
        if (d_8 != 0.0D) {
          double d_19;
          if (d_11 < 0.5D) {
            d_19 = d_11 * (1.0D + d_8);
          } else {
            d_19 = d_11 + d_8 - d_11 * d_8;
          }

          double d_21 = 2.0D * d_11 - d_19;
          double d_23 = d_6 + 0.3333333333333333D;
          if (d_23 > 1.0D) {
            --d_23;
          }

          double d_27 = d_6 - 0.3333333333333333D;
          if (d_27 < 0.0D) {
            ++d_27;
          }

          if (6.0D * d_23 < 1.0D) {
            d_13 = d_21 + (d_19 - d_21) * 6.0D * d_23;
          } else if (2.0D * d_23 < 1.0D) {
            d_13 = d_19;
          } else if (3.0D * d_23 < 2.0D) {
            d_13 = d_21 + (d_19 - d_21) * (0.6666666666666666D - d_23) * 6.0D;
          } else {
            d_13 = d_21;
          }

          if (6.0D * d_6 < 1.0D) {
            d_15 = d_21 + (d_19 - d_21) * 6.0D * d_6;
          } else if (2.0D * d_6 < 1.0D) {
            d_15 = d_19;
          } else if (3.0D * d_6 < 2.0D) {
            d_15 = d_21 + (d_19 - d_21) * (0.6666666666666666D - d_6) * 6.0D;
          } else {
            d_15 = d_21;
          }

          if (6.0D * d_27 < 1.0D) {
            d_17 = d_21 + (d_19 - d_21) * 6.0D * d_27;
          } else if (2.0D * d_27 < 1.0D) {
            d_17 = d_19;
          } else if (3.0D * d_27 < 2.0D) {
            d_17 = d_21 + (d_19 - d_21) * (0.6666666666666666D - d_27) * 6.0D;
          } else {
            d_17 = d_21;
          }
        }

        int i_29 = (int) (d_13 * 256.0D);
        int i_20 = (int) (d_15 * 256.0D);
        int i_30 = (int) (d_17 * 256.0D);
        int i_22 = i_30 + (i_20 << 8) + (i_29 << 16);
        i_22 = method2792(i_22, d_0);
        if (i_22 == 0) {
          i_22 = 1;
        }

        field1675[i_4++] = i_22;
      }
    }

  }

  @ObfuscatedName("x")
  static int method2792(int i_0, double d_1) {
    double d_3 = (double) (i_0 >> 16) / 256.0D;
    double d_5 = (double) (i_0 >> 8 & 0xff) / 256.0D;
    double d_7 = (double) (i_0 & 0xff) / 256.0D;
    d_3 = Math.pow(d_3, d_1);
    d_5 = Math.pow(d_5, d_1);
    d_7 = Math.pow(d_7, d_1);
    int i_9 = (int) (d_3 * 256.0D);
    int i_10 = (int) (d_5 * 256.0D);
    int i_11 = (int) (d_7 * 256.0D);
    return i_11 + (i_10 << 8) + (i_9 << 16);
  }

  @ObfuscatedName("e")
  public static void method2793(int i_0, int i_1, int i_2) {
    field1677 =
        i_0 < 0 || i_0 > field1688 || i_1 < 0 || i_1 > field1688 || i_2 < 0 || i_2 > field1688;
  }

  @ObfuscatedName("p")
  static final void method2794(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                               int i_7, int i_8) {
    int i_9 = i_4 - i_3;
    int i_10 = i_1 - i_0;
    int i_11 = i_5 - i_3;
    int i_12 = i_2 - i_0;
    int i_13 = i_7 - i_6;
    int i_14 = i_8 - i_6;
    int i_15;
    if (i_2 != i_1) {
      i_15 = (i_5 - i_4 << 14) / (i_2 - i_1);
    } else {
      i_15 = 0;
    }

    int i_16;
    if (i_0 != i_1) {
      i_16 = (i_9 << 14) / i_10;
    } else {
      i_16 = 0;
    }

    int i_17;
    if (i_0 != i_2) {
      i_17 = (i_11 << 14) / i_12;
    } else {
      i_17 = 0;
    }

    int i_18 = i_9 * i_12 - i_11 * i_10;
    if (i_18 != 0) {
      int i_19 = (i_13 * i_12 - i_14 * i_10 << 8) / i_18;
      int i_20 = (i_14 * i_9 - i_13 * i_11 << 8) / i_18;
      if (i_0 <= i_1 && i_0 <= i_2) {
        if (i_0 < field1672) {
          if (i_1 > field1672) {
            i_1 = field1672;
          }

          if (i_2 > field1672) {
            i_2 = field1672;
          }

          i_6 = i_19 + ((i_6 << 8) - i_3 * i_19);
          if (i_1 < i_2) {
            i_5 = i_3 <<= 14;
            if (i_0 < 0) {
              i_5 -= i_0 * i_17;
              i_3 -= i_0 * i_16;
              i_6 -= i_0 * i_20;
              i_0 = 0;
            }

            i_4 <<= 14;
            if (i_1 < 0) {
              i_4 -= i_15 * i_1;
              i_1 = 0;
            }

            if (i_0 != i_1 && i_17 < i_16 || i_0 == i_1 && i_17 > i_15) {
              i_2 -= i_1;
              i_1 -= i_0;
              i_0 = field1682[i_0];

              while (true) {
                --i_1;
                if (i_1 < 0) {
                  while (true) {
                    --i_2;
                    if (i_2 < 0) {
                      return;
                    }

                    method2795(class314.field3766, i_0, 0, 0, i_5 >> 14, i_4 >> 14, i_6, i_19);
                    i_5 += i_17;
                    i_4 += i_15;
                    i_6 += i_20;
                    i_0 += class314.field3761;
                  }
                }

                method2795(class314.field3766, i_0, 0, 0, i_5 >> 14, i_3 >> 14, i_6, i_19);
                i_5 += i_17;
                i_3 += i_16;
                i_6 += i_20;
                i_0 += class314.field3761;
              }
            } else {
              i_2 -= i_1;
              i_1 -= i_0;
              i_0 = field1682[i_0];

              while (true) {
                --i_1;
                if (i_1 < 0) {
                  while (true) {
                    --i_2;
                    if (i_2 < 0) {
                      return;
                    }

                    method2795(class314.field3766, i_0, 0, 0, i_4 >> 14, i_5 >> 14, i_6, i_19);
                    i_5 += i_17;
                    i_4 += i_15;
                    i_6 += i_20;
                    i_0 += class314.field3761;
                  }
                }

                method2795(class314.field3766, i_0, 0, 0, i_3 >> 14, i_5 >> 14, i_6, i_19);
                i_5 += i_17;
                i_3 += i_16;
                i_6 += i_20;
                i_0 += class314.field3761;
              }
            }
          } else {
            i_4 = i_3 <<= 14;
            if (i_0 < 0) {
              i_4 -= i_0 * i_17;
              i_3 -= i_0 * i_16;
              i_6 -= i_0 * i_20;
              i_0 = 0;
            }

            i_5 <<= 14;
            if (i_2 < 0) {
              i_5 -= i_15 * i_2;
              i_2 = 0;
            }

            if ((i_0 == i_2 || i_17 >= i_16) && (i_0 != i_2 || i_15 <= i_16)) {
              i_1 -= i_2;
              i_2 -= i_0;
              i_0 = field1682[i_0];

              while (true) {
                --i_2;
                if (i_2 < 0) {
                  while (true) {
                    --i_1;
                    if (i_1 < 0) {
                      return;
                    }

                    method2795(class314.field3766, i_0, 0, 0, i_3 >> 14, i_5 >> 14, i_6, i_19);
                    i_5 += i_15;
                    i_3 += i_16;
                    i_6 += i_20;
                    i_0 += class314.field3761;
                  }
                }

                method2795(class314.field3766, i_0, 0, 0, i_3 >> 14, i_4 >> 14, i_6, i_19);
                i_4 += i_17;
                i_3 += i_16;
                i_6 += i_20;
                i_0 += class314.field3761;
              }
            } else {
              i_1 -= i_2;
              i_2 -= i_0;
              i_0 = field1682[i_0];

              while (true) {
                --i_2;
                if (i_2 < 0) {
                  while (true) {
                    --i_1;
                    if (i_1 < 0) {
                      return;
                    }

                    method2795(class314.field3766, i_0, 0, 0, i_5 >> 14, i_3 >> 14, i_6, i_19);
                    i_5 += i_15;
                    i_3 += i_16;
                    i_6 += i_20;
                    i_0 += class314.field3761;
                  }
                }

                method2795(class314.field3766, i_0, 0, 0, i_4 >> 14, i_3 >> 14, i_6, i_19);
                i_4 += i_17;
                i_3 += i_16;
                i_6 += i_20;
                i_0 += class314.field3761;
              }
            }
          }
        }
      } else if (i_1 <= i_2) {
        if (i_1 < field1672) {
          if (i_2 > field1672) {
            i_2 = field1672;
          }

          if (i_0 > field1672) {
            i_0 = field1672;
          }

          i_7 = i_19 + ((i_7 << 8) - i_19 * i_4);
          if (i_2 < i_0) {
            i_3 = i_4 <<= 14;
            if (i_1 < 0) {
              i_3 -= i_16 * i_1;
              i_4 -= i_15 * i_1;
              i_7 -= i_20 * i_1;
              i_1 = 0;
            }

            i_5 <<= 14;
            if (i_2 < 0) {
              i_5 -= i_17 * i_2;
              i_2 = 0;
            }

            if (i_2 != i_1 && i_16 < i_15 || i_2 == i_1 && i_16 > i_17) {
              i_0 -= i_2;
              i_2 -= i_1;
              i_1 = field1682[i_1];

              while (true) {
                --i_2;
                if (i_2 < 0) {
                  while (true) {
                    --i_0;
                    if (i_0 < 0) {
                      return;
                    }

                    method2795(class314.field3766, i_1, 0, 0, i_3 >> 14, i_5 >> 14, i_7, i_19);
                    i_3 += i_16;
                    i_5 += i_17;
                    i_7 += i_20;
                    i_1 += class314.field3761;
                  }
                }

                method2795(class314.field3766, i_1, 0, 0, i_3 >> 14, i_4 >> 14, i_7, i_19);
                i_3 += i_16;
                i_4 += i_15;
                i_7 += i_20;
                i_1 += class314.field3761;
              }
            } else {
              i_0 -= i_2;
              i_2 -= i_1;
              i_1 = field1682[i_1];

              while (true) {
                --i_2;
                if (i_2 < 0) {
                  while (true) {
                    --i_0;
                    if (i_0 < 0) {
                      return;
                    }

                    method2795(class314.field3766, i_1, 0, 0, i_5 >> 14, i_3 >> 14, i_7, i_19);
                    i_3 += i_16;
                    i_5 += i_17;
                    i_7 += i_20;
                    i_1 += class314.field3761;
                  }
                }

                method2795(class314.field3766, i_1, 0, 0, i_4 >> 14, i_3 >> 14, i_7, i_19);
                i_3 += i_16;
                i_4 += i_15;
                i_7 += i_20;
                i_1 += class314.field3761;
              }
            }
          } else {
            i_5 = i_4 <<= 14;
            if (i_1 < 0) {
              i_5 -= i_16 * i_1;
              i_4 -= i_15 * i_1;
              i_7 -= i_20 * i_1;
              i_1 = 0;
            }

            i_3 <<= 14;
            if (i_0 < 0) {
              i_3 -= i_0 * i_17;
              i_0 = 0;
            }

            if (i_16 < i_15) {
              i_2 -= i_0;
              i_0 -= i_1;
              i_1 = field1682[i_1];

              while (true) {
                --i_0;
                if (i_0 < 0) {
                  while (true) {
                    --i_2;
                    if (i_2 < 0) {
                      return;
                    }

                    method2795(class314.field3766, i_1, 0, 0, i_3 >> 14, i_4 >> 14, i_7, i_19);
                    i_3 += i_17;
                    i_4 += i_15;
                    i_7 += i_20;
                    i_1 += class314.field3761;
                  }
                }

                method2795(class314.field3766, i_1, 0, 0, i_5 >> 14, i_4 >> 14, i_7, i_19);
                i_5 += i_16;
                i_4 += i_15;
                i_7 += i_20;
                i_1 += class314.field3761;
              }
            } else {
              i_2 -= i_0;
              i_0 -= i_1;
              i_1 = field1682[i_1];

              while (true) {
                --i_0;
                if (i_0 < 0) {
                  while (true) {
                    --i_2;
                    if (i_2 < 0) {
                      return;
                    }

                    method2795(class314.field3766, i_1, 0, 0, i_4 >> 14, i_3 >> 14, i_7, i_19);
                    i_3 += i_17;
                    i_4 += i_15;
                    i_7 += i_20;
                    i_1 += class314.field3761;
                  }
                }

                method2795(class314.field3766, i_1, 0, 0, i_4 >> 14, i_5 >> 14, i_7, i_19);
                i_5 += i_16;
                i_4 += i_15;
                i_7 += i_20;
                i_1 += class314.field3761;
              }
            }
          }
        }
      } else if (i_2 < field1672) {
        if (i_0 > field1672) {
          i_0 = field1672;
        }

        if (i_1 > field1672) {
          i_1 = field1672;
        }

        i_8 = i_19 + ((i_8 << 8) - i_5 * i_19);
        if (i_0 < i_1) {
          i_4 = i_5 <<= 14;
          if (i_2 < 0) {
            i_4 -= i_15 * i_2;
            i_5 -= i_17 * i_2;
            i_8 -= i_20 * i_2;
            i_2 = 0;
          }

          i_3 <<= 14;
          if (i_0 < 0) {
            i_3 -= i_0 * i_16;
            i_0 = 0;
          }

          if (i_15 < i_17) {
            i_1 -= i_0;
            i_0 -= i_2;
            i_2 = field1682[i_2];

            while (true) {
              --i_0;
              if (i_0 < 0) {
                while (true) {
                  --i_1;
                  if (i_1 < 0) {
                    return;
                  }

                  method2795(class314.field3766, i_2, 0, 0, i_4 >> 14, i_3 >> 14, i_8, i_19);
                  i_4 += i_15;
                  i_3 += i_16;
                  i_8 += i_20;
                  i_2 += class314.field3761;
                }
              }

              method2795(class314.field3766, i_2, 0, 0, i_4 >> 14, i_5 >> 14, i_8, i_19);
              i_4 += i_15;
              i_5 += i_17;
              i_8 += i_20;
              i_2 += class314.field3761;
            }
          } else {
            i_1 -= i_0;
            i_0 -= i_2;
            i_2 = field1682[i_2];

            while (true) {
              --i_0;
              if (i_0 < 0) {
                while (true) {
                  --i_1;
                  if (i_1 < 0) {
                    return;
                  }

                  method2795(class314.field3766, i_2, 0, 0, i_3 >> 14, i_4 >> 14, i_8, i_19);
                  i_4 += i_15;
                  i_3 += i_16;
                  i_8 += i_20;
                  i_2 += class314.field3761;
                }
              }

              method2795(class314.field3766, i_2, 0, 0, i_5 >> 14, i_4 >> 14, i_8, i_19);
              i_4 += i_15;
              i_5 += i_17;
              i_8 += i_20;
              i_2 += class314.field3761;
            }
          }
        } else {
          i_3 = i_5 <<= 14;
          if (i_2 < 0) {
            i_3 -= i_15 * i_2;
            i_5 -= i_17 * i_2;
            i_8 -= i_20 * i_2;
            i_2 = 0;
          }

          i_4 <<= 14;
          if (i_1 < 0) {
            i_4 -= i_16 * i_1;
            i_1 = 0;
          }

          if (i_15 < i_17) {
            i_0 -= i_1;
            i_1 -= i_2;
            i_2 = field1682[i_2];

            while (true) {
              --i_1;
              if (i_1 < 0) {
                while (true) {
                  --i_0;
                  if (i_0 < 0) {
                    return;
                  }

                  method2795(class314.field3766, i_2, 0, 0, i_4 >> 14, i_5 >> 14, i_8, i_19);
                  i_4 += i_16;
                  i_5 += i_17;
                  i_8 += i_20;
                  i_2 += class314.field3761;
                }
              }

              method2795(class314.field3766, i_2, 0, 0, i_3 >> 14, i_5 >> 14, i_8, i_19);
              i_3 += i_15;
              i_5 += i_17;
              i_8 += i_20;
              i_2 += class314.field3761;
            }
          } else {
            i_0 -= i_1;
            i_1 -= i_2;
            i_2 = field1682[i_2];

            while (true) {
              --i_1;
              if (i_1 < 0) {
                while (true) {
                  --i_0;
                  if (i_0 < 0) {
                    return;
                  }

                  method2795(class314.field3766, i_2, 0, 0, i_5 >> 14, i_4 >> 14, i_8, i_19);
                  i_4 += i_16;
                  i_5 += i_17;
                  i_8 += i_20;
                  i_2 += class314.field3761;
                }
              }

              method2795(class314.field3766, i_2, 0, 0, i_5 >> 14, i_3 >> 14, i_8, i_19);
              i_3 += i_15;
              i_5 += i_17;
              i_8 += i_20;
              i_2 += class314.field3761;
            }
          }
        }
      }
    }
  }

  @ObfuscatedName("b")
  static final void method2795(int[] ints_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                               int i_7) {
    if (field1677) {
      if (i_5 > field1688) {
        i_5 = field1688;
      }

      if (i_4 < 0) {
        i_4 = 0;
      }
    }

    if (i_4 < i_5) {
      i_1 += i_4;
      i_6 += i_4 * i_7;
      int i_8;
      int i_9;
      int i_10;
      if (field1670) {
        i_3 = i_5 - i_4 >> 2;
        i_7 <<= 2;
        if (field1671 == 0) {
          if (i_3 > 0) {
            do {
              i_2 = field1675[i_6 >> 8];
              i_6 += i_7;
              ints_0[i_1++] = i_2;
              ints_0[i_1++] = i_2;
              ints_0[i_1++] = i_2;
              ints_0[i_1++] = i_2;
              --i_3;
            } while (i_3 > 0);
          }

          i_3 = i_5 - i_4 & 0x3;
          if (i_3 > 0) {
            i_2 = field1675[i_6 >> 8];

            do {
              ints_0[i_1++] = i_2;
              --i_3;
            } while (i_3 > 0);
          }
        } else {
          i_8 = field1671;
          i_9 = 256 - field1671;
          if (i_3 > 0) {
            do {
              i_2 = field1675[i_6 >> 8];
              i_6 += i_7;
              i_2 = (i_9 * (i_2 & 0xff00) >> 8 & 0xff00) + (i_9 * (i_2 & 0xff00ff) >> 8 & 0xff00ff);
              i_10 = ints_0[i_1];
              ints_0[i_1++] =
                  ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8
                      & 0xff00);
              i_10 = ints_0[i_1];
              ints_0[i_1++] =
                  ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8
                      & 0xff00);
              i_10 = ints_0[i_1];
              ints_0[i_1++] =
                  ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8
                      & 0xff00);
              i_10 = ints_0[i_1];
              ints_0[i_1++] =
                  ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8
                      & 0xff00);
              --i_3;
            } while (i_3 > 0);
          }

          i_3 = i_5 - i_4 & 0x3;
          if (i_3 > 0) {
            i_2 = field1675[i_6 >> 8];
            i_2 = (i_9 * (i_2 & 0xff00) >> 8 & 0xff00) + (i_9 * (i_2 & 0xff00ff) >> 8 & 0xff00ff);

            do {
              i_10 = ints_0[i_1];
              ints_0[i_1++] =
                  ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8
                      & 0xff00);
              --i_3;
            } while (i_3 > 0);
          }
        }

      } else {
        i_3 = i_5 - i_4;
        if (field1671 == 0) {
          do {
            ints_0[i_1++] = field1675[i_6 >> 8];
            i_6 += i_7;
            --i_3;
          } while (i_3 > 0);
        } else {
          i_8 = field1671;
          i_9 = 256 - field1671;

          do {
            i_2 = field1675[i_6 >> 8];
            i_6 += i_7;
            i_2 = (i_9 * (i_2 & 0xff00) >> 8 & 0xff00) + (i_9 * (i_2 & 0xff00ff) >> 8 & 0xff00ff);
            i_10 = ints_0[i_1];
            ints_0[i_1++] =
                ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + i_2 + (i_8 * (i_10 & 0xff00) >> 8
                    & 0xff00);
            --i_3;
          } while (i_3 > 0);
        }

      }
    }
  }

  @ObfuscatedName("n")
  public static final void method2796(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5,
                                      int i_6) {
    int i_7 = 0;
    if (i_0 != i_1) {
      i_7 = (i_4 - i_3 << 14) / (i_1 - i_0);
    }

    int i_8 = 0;
    if (i_2 != i_1) {
      i_8 = (i_5 - i_4 << 14) / (i_2 - i_1);
    }

    int i_9 = 0;
    if (i_0 != i_2) {
      i_9 = (i_3 - i_5 << 14) / (i_0 - i_2);
    }

    if (i_0 <= i_1 && i_0 <= i_2) {
      if (i_0 < field1672) {
        if (i_1 > field1672) {
          i_1 = field1672;
        }

        if (i_2 > field1672) {
          i_2 = field1672;
        }

        if (i_1 < i_2) {
          i_5 = i_3 <<= 14;
          if (i_0 < 0) {
            i_5 -= i_0 * i_9;
            i_3 -= i_0 * i_7;
            i_0 = 0;
          }

          i_4 <<= 14;
          if (i_1 < 0) {
            i_4 -= i_8 * i_1;
            i_1 = 0;
          }

          if (i_0 != i_1 && i_9 < i_7 || i_0 == i_1 && i_9 > i_8) {
            i_2 -= i_1;
            i_1 -= i_0;
            i_0 = field1682[i_0];

            while (true) {
              --i_1;
              if (i_1 < 0) {
                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    return;
                  }

                  method2825(class314.field3766, i_0, i_6, 0, i_5 >> 14, i_4 >> 14);
                  i_5 += i_9;
                  i_4 += i_8;
                  i_0 += class314.field3761;
                }
              }

              method2825(class314.field3766, i_0, i_6, 0, i_5 >> 14, i_3 >> 14);
              i_5 += i_9;
              i_3 += i_7;
              i_0 += class314.field3761;
            }
          } else {
            i_2 -= i_1;
            i_1 -= i_0;
            i_0 = field1682[i_0];

            while (true) {
              --i_1;
              if (i_1 < 0) {
                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    return;
                  }

                  method2825(class314.field3766, i_0, i_6, 0, i_4 >> 14, i_5 >> 14);
                  i_5 += i_9;
                  i_4 += i_8;
                  i_0 += class314.field3761;
                }
              }

              method2825(class314.field3766, i_0, i_6, 0, i_3 >> 14, i_5 >> 14);
              i_5 += i_9;
              i_3 += i_7;
              i_0 += class314.field3761;
            }
          }
        } else {
          i_4 = i_3 <<= 14;
          if (i_0 < 0) {
            i_4 -= i_0 * i_9;
            i_3 -= i_0 * i_7;
            i_0 = 0;
          }

          i_5 <<= 14;
          if (i_2 < 0) {
            i_5 -= i_8 * i_2;
            i_2 = 0;
          }

          if (i_0 != i_2 && i_9 < i_7 || i_0 == i_2 && i_8 > i_7) {
            i_1 -= i_2;
            i_2 -= i_0;
            i_0 = field1682[i_0];

            while (true) {
              --i_2;
              if (i_2 < 0) {
                while (true) {
                  --i_1;
                  if (i_1 < 0) {
                    return;
                  }

                  method2825(class314.field3766, i_0, i_6, 0, i_5 >> 14, i_3 >> 14);
                  i_5 += i_8;
                  i_3 += i_7;
                  i_0 += class314.field3761;
                }
              }

              method2825(class314.field3766, i_0, i_6, 0, i_4 >> 14, i_3 >> 14);
              i_4 += i_9;
              i_3 += i_7;
              i_0 += class314.field3761;
            }
          } else {
            i_1 -= i_2;
            i_2 -= i_0;
            i_0 = field1682[i_0];

            while (true) {
              --i_2;
              if (i_2 < 0) {
                while (true) {
                  --i_1;
                  if (i_1 < 0) {
                    return;
                  }

                  method2825(class314.field3766, i_0, i_6, 0, i_3 >> 14, i_5 >> 14);
                  i_5 += i_8;
                  i_3 += i_7;
                  i_0 += class314.field3761;
                }
              }

              method2825(class314.field3766, i_0, i_6, 0, i_3 >> 14, i_4 >> 14);
              i_4 += i_9;
              i_3 += i_7;
              i_0 += class314.field3761;
            }
          }
        }
      }
    } else if (i_1 <= i_2) {
      if (i_1 < field1672) {
        if (i_2 > field1672) {
          i_2 = field1672;
        }

        if (i_0 > field1672) {
          i_0 = field1672;
        }

        if (i_2 < i_0) {
          i_3 = i_4 <<= 14;
          if (i_1 < 0) {
            i_3 -= i_7 * i_1;
            i_4 -= i_8 * i_1;
            i_1 = 0;
          }

          i_5 <<= 14;
          if (i_2 < 0) {
            i_5 -= i_9 * i_2;
            i_2 = 0;
          }

          if ((i_2 == i_1 || i_7 >= i_8) && (i_2 != i_1 || i_7 <= i_9)) {
            i_0 -= i_2;
            i_2 -= i_1;
            i_1 = field1682[i_1];

            while (true) {
              --i_2;
              if (i_2 < 0) {
                while (true) {
                  --i_0;
                  if (i_0 < 0) {
                    return;
                  }

                  method2825(class314.field3766, i_1, i_6, 0, i_5 >> 14, i_3 >> 14);
                  i_3 += i_7;
                  i_5 += i_9;
                  i_1 += class314.field3761;
                }
              }

              method2825(class314.field3766, i_1, i_6, 0, i_4 >> 14, i_3 >> 14);
              i_3 += i_7;
              i_4 += i_8;
              i_1 += class314.field3761;
            }
          } else {
            i_0 -= i_2;
            i_2 -= i_1;
            i_1 = field1682[i_1];

            while (true) {
              --i_2;
              if (i_2 < 0) {
                while (true) {
                  --i_0;
                  if (i_0 < 0) {
                    return;
                  }

                  method2825(class314.field3766, i_1, i_6, 0, i_3 >> 14, i_5 >> 14);
                  i_3 += i_7;
                  i_5 += i_9;
                  i_1 += class314.field3761;
                }
              }

              method2825(class314.field3766, i_1, i_6, 0, i_3 >> 14, i_4 >> 14);
              i_3 += i_7;
              i_4 += i_8;
              i_1 += class314.field3761;
            }
          }
        } else {
          i_5 = i_4 <<= 14;
          if (i_1 < 0) {
            i_5 -= i_7 * i_1;
            i_4 -= i_8 * i_1;
            i_1 = 0;
          }

          i_3 <<= 14;
          if (i_0 < 0) {
            i_3 -= i_0 * i_9;
            i_0 = 0;
          }

          if (i_7 < i_8) {
            i_2 -= i_0;
            i_0 -= i_1;
            i_1 = field1682[i_1];

            while (true) {
              --i_0;
              if (i_0 < 0) {
                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    return;
                  }

                  method2825(class314.field3766, i_1, i_6, 0, i_3 >> 14, i_4 >> 14);
                  i_3 += i_9;
                  i_4 += i_8;
                  i_1 += class314.field3761;
                }
              }

              method2825(class314.field3766, i_1, i_6, 0, i_5 >> 14, i_4 >> 14);
              i_5 += i_7;
              i_4 += i_8;
              i_1 += class314.field3761;
            }
          } else {
            i_2 -= i_0;
            i_0 -= i_1;
            i_1 = field1682[i_1];

            while (true) {
              --i_0;
              if (i_0 < 0) {
                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    return;
                  }

                  method2825(class314.field3766, i_1, i_6, 0, i_4 >> 14, i_3 >> 14);
                  i_3 += i_9;
                  i_4 += i_8;
                  i_1 += class314.field3761;
                }
              }

              method2825(class314.field3766, i_1, i_6, 0, i_4 >> 14, i_5 >> 14);
              i_5 += i_7;
              i_4 += i_8;
              i_1 += class314.field3761;
            }
          }
        }
      }
    } else if (i_2 < field1672) {
      if (i_0 > field1672) {
        i_0 = field1672;
      }

      if (i_1 > field1672) {
        i_1 = field1672;
      }

      if (i_0 < i_1) {
        i_4 = i_5 <<= 14;
        if (i_2 < 0) {
          i_4 -= i_8 * i_2;
          i_5 -= i_9 * i_2;
          i_2 = 0;
        }

        i_3 <<= 14;
        if (i_0 < 0) {
          i_3 -= i_0 * i_7;
          i_0 = 0;
        }

        if (i_8 < i_9) {
          i_1 -= i_0;
          i_0 -= i_2;
          i_2 = field1682[i_2];

          while (true) {
            --i_0;
            if (i_0 < 0) {
              while (true) {
                --i_1;
                if (i_1 < 0) {
                  return;
                }

                method2825(class314.field3766, i_2, i_6, 0, i_4 >> 14, i_3 >> 14);
                i_4 += i_8;
                i_3 += i_7;
                i_2 += class314.field3761;
              }
            }

            method2825(class314.field3766, i_2, i_6, 0, i_4 >> 14, i_5 >> 14);
            i_4 += i_8;
            i_5 += i_9;
            i_2 += class314.field3761;
          }
        } else {
          i_1 -= i_0;
          i_0 -= i_2;
          i_2 = field1682[i_2];

          while (true) {
            --i_0;
            if (i_0 < 0) {
              while (true) {
                --i_1;
                if (i_1 < 0) {
                  return;
                }

                method2825(class314.field3766, i_2, i_6, 0, i_3 >> 14, i_4 >> 14);
                i_4 += i_8;
                i_3 += i_7;
                i_2 += class314.field3761;
              }
            }

            method2825(class314.field3766, i_2, i_6, 0, i_5 >> 14, i_4 >> 14);
            i_4 += i_8;
            i_5 += i_9;
            i_2 += class314.field3761;
          }
        }
      } else {
        i_3 = i_5 <<= 14;
        if (i_2 < 0) {
          i_3 -= i_8 * i_2;
          i_5 -= i_9 * i_2;
          i_2 = 0;
        }

        i_4 <<= 14;
        if (i_1 < 0) {
          i_4 -= i_7 * i_1;
          i_1 = 0;
        }

        if (i_8 < i_9) {
          i_0 -= i_1;
          i_1 -= i_2;
          i_2 = field1682[i_2];

          while (true) {
            --i_1;
            if (i_1 < 0) {
              while (true) {
                --i_0;
                if (i_0 < 0) {
                  return;
                }

                method2825(class314.field3766, i_2, i_6, 0, i_4 >> 14, i_5 >> 14);
                i_4 += i_7;
                i_5 += i_9;
                i_2 += class314.field3761;
              }
            }

            method2825(class314.field3766, i_2, i_6, 0, i_3 >> 14, i_5 >> 14);
            i_3 += i_8;
            i_5 += i_9;
            i_2 += class314.field3761;
          }
        } else {
          i_0 -= i_1;
          i_1 -= i_2;
          i_2 = field1682[i_2];

          while (true) {
            --i_1;
            if (i_1 < 0) {
              while (true) {
                --i_0;
                if (i_0 < 0) {
                  return;
                }

                method2825(class314.field3766, i_2, i_6, 0, i_5 >> 14, i_4 >> 14);
                i_4 += i_7;
                i_5 += i_9;
                i_2 += class314.field3761;
              }
            }

            method2825(class314.field3766, i_2, i_6, 0, i_5 >> 14, i_3 >> 14);
            i_3 += i_8;
            i_5 += i_9;
            i_2 += class314.field3761;
          }
        }
      }
    }
  }

  @ObfuscatedName("f")
  static final void method2825(int[] ints_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
    if (field1677) {
      if (i_5 > field1688) {
        i_5 = field1688;
      }

      if (i_4 < 0) {
        i_4 = 0;
      }
    }

    if (i_4 < i_5) {
      i_1 += i_4;
      i_3 = i_5 - i_4 >> 2;
      if (field1671 != 0) {
        if (field1671 == 254) {
          while (true) {
            --i_3;
            if (i_3 < 0) {
              i_3 = i_5 - i_4 & 0x3;

              while (true) {
                --i_3;
                if (i_3 < 0) {
                  return;
                }

                ints_0[i_1++] = ints_0[i_1];
              }
            }

            ints_0[i_1++] = ints_0[i_1];
            ints_0[i_1++] = ints_0[i_1];
            ints_0[i_1++] = ints_0[i_1];
            ints_0[i_1++] = ints_0[i_1];
          }
        } else {
          int i_6 = field1671;
          int i_7 = 256 - field1671;
          i_2 = (i_7 * (i_2 & 0xff00) >> 8 & 0xff00) + (i_7 * (i_2 & 0xff00ff) >> 8 & 0xff00ff);

          while (true) {
            --i_3;
            int i_8;
            if (i_3 < 0) {
              i_3 = i_5 - i_4 & 0x3;

              while (true) {
                --i_3;
                if (i_3 < 0) {
                  return;
                }

                i_8 = ints_0[i_1];
                ints_0[i_1++] =
                    ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + i_2 + (i_6 * (i_8 & 0xff00) >> 8
                        & 0xff00);
              }
            }

            i_8 = ints_0[i_1];
            ints_0[i_1++] =
                ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + i_2 + (i_6 * (i_8 & 0xff00) >> 8
                    & 0xff00);
            i_8 = ints_0[i_1];
            ints_0[i_1++] =
                ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + i_2 + (i_6 * (i_8 & 0xff00) >> 8
                    & 0xff00);
            i_8 = ints_0[i_1];
            ints_0[i_1++] =
                ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + i_2 + (i_6 * (i_8 & 0xff00) >> 8
                    & 0xff00);
            i_8 = ints_0[i_1];
            ints_0[i_1++] =
                ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + i_2 + (i_6 * (i_8 & 0xff00) >> 8
                    & 0xff00);
          }
        }
      } else {
        while (true) {
          --i_3;
          if (i_3 < 0) {
            i_3 = i_5 - i_4 & 0x3;

            while (true) {
              --i_3;
              if (i_3 < 0) {
                return;
              }

              ints_0[i_1++] = i_2;
            }
          }

          ints_0[i_1++] = i_2;
          ints_0[i_1++] = i_2;
          ints_0[i_1++] = i_2;
          ints_0[i_1++] = i_2;
        }
      }
    }
  }

  @ObfuscatedName("g")
  static final void method2804(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                               int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13,
                               int i_14, int i_15, int i_16, int i_17, int i_18) {
    int[] ints_19 = field1667.vmethod3079(i_18);
    int i_20;
    if (ints_19 == null) {
      i_20 = field1667.vmethod3092(i_18);
      method2794(i_0, i_1, i_2, i_3, i_4, i_5, method2802(i_20, i_6), method2802(i_20, i_7),
                 method2802(i_20, i_8));
    } else {
      field1669 = field1667.vmethod3082(i_18);
      field1668 = field1667.vmethod3081(i_18);
      i_20 = i_4 - i_3;
      int i_21 = i_1 - i_0;
      int i_22 = i_5 - i_3;
      int i_23 = i_2 - i_0;
      int i_24 = i_7 - i_6;
      int i_25 = i_8 - i_6;
      int i_26 = 0;
      if (i_0 != i_1) {
        i_26 = (i_4 - i_3 << 14) / (i_1 - i_0);
      }

      int i_27 = 0;
      if (i_2 != i_1) {
        i_27 = (i_5 - i_4 << 14) / (i_2 - i_1);
      }

      int i_28 = 0;
      if (i_0 != i_2) {
        i_28 = (i_3 - i_5 << 14) / (i_0 - i_2);
      }

      int i_29 = i_20 * i_23 - i_22 * i_21;
      if (i_29 != 0) {
        int i_30 = (i_24 * i_23 - i_25 * i_21 << 9) / i_29;
        int i_31 = (i_25 * i_20 - i_24 * i_22 << 9) / i_29;
        i_10 = i_9 - i_10;
        i_13 = i_12 - i_13;
        i_16 = i_15 - i_16;
        i_11 -= i_9;
        i_14 -= i_12;
        i_17 -= i_15;
        int i_32 = i_11 * i_12 - i_9 * i_14 << 14;
        int i_33 = (int) (((long) (i_15 * i_14 - i_17 * i_12) << 3 << 14) / (long) field1678);
        int i_34 = (int) (((long) (i_17 * i_9 - i_11 * i_15) << 14) / (long) field1678);
        int i_35 = i_10 * i_12 - i_13 * i_9 << 14;
        int i_36 = (int) (((long) (i_13 * i_15 - i_16 * i_12) << 3 << 14) / (long) field1678);
        int i_37 = (int) (((long) (i_16 * i_9 - i_10 * i_15) << 14) / (long) field1678);
        int i_38 = i_13 * i_11 - i_10 * i_14 << 14;
        int i_39 = (int) (((long) (i_16 * i_14 - i_13 * i_17) << 3 << 14) / (long) field1678);
        int i_40 = (int) (((long) (i_17 * i_10 - i_11 * i_16) << 14) / (long) field1678);
        int i_41;
        if (i_0 <= i_1 && i_0 <= i_2) {
          if (i_0 < field1672) {
            if (i_1 > field1672) {
              i_1 = field1672;
            }

            if (i_2 > field1672) {
              i_2 = field1672;
            }

            i_6 = i_30 + ((i_6 << 9) - i_3 * i_30);
            if (i_1 < i_2) {
              i_5 = i_3 <<= 14;
              if (i_0 < 0) {
                i_5 -= i_0 * i_28;
                i_3 -= i_0 * i_26;
                i_6 -= i_0 * i_31;
                i_0 = 0;
              }

              i_4 <<= 14;
              if (i_1 < 0) {
                i_4 -= i_27 * i_1;
                i_1 = 0;
              }

              i_41 = i_0 - field1689;
              i_32 += i_34 * i_41;
              i_35 += i_37 * i_41;
              i_38 += i_40 * i_41;
              if (i_0 != i_1 && i_28 < i_26 || i_0 == i_1 && i_28 > i_27) {
                i_2 -= i_1;
                i_1 -= i_0;
                i_0 = field1682[i_0];

                while (true) {
                  --i_1;
                  if (i_1 < 0) {
                    while (true) {
                      --i_2;
                      if (i_2 < 0) {
                        return;
                      }

                      method2813(class314.field3766, ints_19, 0, 0, i_0, i_5 >> 14, i_4 >> 14, i_6,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_5 += i_28;
                      i_4 += i_27;
                      i_6 += i_31;
                      i_0 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2813(class314.field3766, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_5 += i_28;
                  i_3 += i_26;
                  i_6 += i_31;
                  i_0 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              } else {
                i_2 -= i_1;
                i_1 -= i_0;
                i_0 = field1682[i_0];

                while (true) {
                  --i_1;
                  if (i_1 < 0) {
                    while (true) {
                      --i_2;
                      if (i_2 < 0) {
                        return;
                      }

                      method2813(class314.field3766, ints_19, 0, 0, i_0, i_4 >> 14, i_5 >> 14, i_6,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_5 += i_28;
                      i_4 += i_27;
                      i_6 += i_31;
                      i_0 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2813(class314.field3766, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_5 += i_28;
                  i_3 += i_26;
                  i_6 += i_31;
                  i_0 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              }
            } else {
              i_4 = i_3 <<= 14;
              if (i_0 < 0) {
                i_4 -= i_0 * i_28;
                i_3 -= i_0 * i_26;
                i_6 -= i_0 * i_31;
                i_0 = 0;
              }

              i_5 <<= 14;
              if (i_2 < 0) {
                i_5 -= i_27 * i_2;
                i_2 = 0;
              }

              i_41 = i_0 - field1689;
              i_32 += i_34 * i_41;
              i_35 += i_37 * i_41;
              i_38 += i_40 * i_41;
              if ((i_0 == i_2 || i_28 >= i_26) && (i_0 != i_2 || i_27 <= i_26)) {
                i_1 -= i_2;
                i_2 -= i_0;
                i_0 = field1682[i_0];

                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    while (true) {
                      --i_1;
                      if (i_1 < 0) {
                        return;
                      }

                      method2813(class314.field3766, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_5 += i_27;
                      i_3 += i_26;
                      i_6 += i_31;
                      i_0 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2813(class314.field3766, ints_19, 0, 0, i_0, i_3 >> 14, i_4 >> 14, i_6,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_4 += i_28;
                  i_3 += i_26;
                  i_6 += i_31;
                  i_0 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              } else {
                i_1 -= i_2;
                i_2 -= i_0;
                i_0 = field1682[i_0];

                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    while (true) {
                      --i_1;
                      if (i_1 < 0) {
                        return;
                      }

                      method2813(class314.field3766, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_5 += i_27;
                      i_3 += i_26;
                      i_6 += i_31;
                      i_0 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2813(class314.field3766, ints_19, 0, 0, i_0, i_4 >> 14, i_3 >> 14, i_6,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_4 += i_28;
                  i_3 += i_26;
                  i_6 += i_31;
                  i_0 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              }
            }
          }
        } else if (i_1 <= i_2) {
          if (i_1 < field1672) {
            if (i_2 > field1672) {
              i_2 = field1672;
            }

            if (i_0 > field1672) {
              i_0 = field1672;
            }

            i_7 = i_30 + ((i_7 << 9) - i_30 * i_4);
            if (i_2 < i_0) {
              i_3 = i_4 <<= 14;
              if (i_1 < 0) {
                i_3 -= i_26 * i_1;
                i_4 -= i_27 * i_1;
                i_7 -= i_31 * i_1;
                i_1 = 0;
              }

              i_5 <<= 14;
              if (i_2 < 0) {
                i_5 -= i_28 * i_2;
                i_2 = 0;
              }

              i_41 = i_1 - field1689;
              i_32 += i_34 * i_41;
              i_35 += i_37 * i_41;
              i_38 += i_40 * i_41;
              if (i_2 != i_1 && i_26 < i_27 || i_2 == i_1 && i_26 > i_28) {
                i_0 -= i_2;
                i_2 -= i_1;
                i_1 = field1682[i_1];

                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    while (true) {
                      --i_0;
                      if (i_0 < 0) {
                        return;
                      }

                      method2813(class314.field3766, ints_19, 0, 0, i_1, i_3 >> 14, i_5 >> 14, i_7,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_3 += i_26;
                      i_5 += i_28;
                      i_7 += i_31;
                      i_1 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2813(class314.field3766, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_3 += i_26;
                  i_4 += i_27;
                  i_7 += i_31;
                  i_1 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              } else {
                i_0 -= i_2;
                i_2 -= i_1;
                i_1 = field1682[i_1];

                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    while (true) {
                      --i_0;
                      if (i_0 < 0) {
                        return;
                      }

                      method2813(class314.field3766, ints_19, 0, 0, i_1, i_5 >> 14, i_3 >> 14, i_7,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_3 += i_26;
                      i_5 += i_28;
                      i_7 += i_31;
                      i_1 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2813(class314.field3766, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_3 += i_26;
                  i_4 += i_27;
                  i_7 += i_31;
                  i_1 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              }
            } else {
              i_5 = i_4 <<= 14;
              if (i_1 < 0) {
                i_5 -= i_26 * i_1;
                i_4 -= i_27 * i_1;
                i_7 -= i_31 * i_1;
                i_1 = 0;
              }

              i_3 <<= 14;
              if (i_0 < 0) {
                i_3 -= i_0 * i_28;
                i_0 = 0;
              }

              i_41 = i_1 - field1689;
              i_32 += i_34 * i_41;
              i_35 += i_37 * i_41;
              i_38 += i_40 * i_41;
              if (i_26 < i_27) {
                i_2 -= i_0;
                i_0 -= i_1;
                i_1 = field1682[i_1];

                while (true) {
                  --i_0;
                  if (i_0 < 0) {
                    while (true) {
                      --i_2;
                      if (i_2 < 0) {
                        return;
                      }

                      method2813(class314.field3766, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_3 += i_28;
                      i_4 += i_27;
                      i_7 += i_31;
                      i_1 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2813(class314.field3766, ints_19, 0, 0, i_1, i_5 >> 14, i_4 >> 14, i_7,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_5 += i_26;
                  i_4 += i_27;
                  i_7 += i_31;
                  i_1 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              } else {
                i_2 -= i_0;
                i_0 -= i_1;
                i_1 = field1682[i_1];

                while (true) {
                  --i_0;
                  if (i_0 < 0) {
                    while (true) {
                      --i_2;
                      if (i_2 < 0) {
                        return;
                      }

                      method2813(class314.field3766, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_3 += i_28;
                      i_4 += i_27;
                      i_7 += i_31;
                      i_1 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2813(class314.field3766, ints_19, 0, 0, i_1, i_4 >> 14, i_5 >> 14, i_7,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_5 += i_26;
                  i_4 += i_27;
                  i_7 += i_31;
                  i_1 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              }
            }
          }
        } else if (i_2 < field1672) {
          if (i_0 > field1672) {
            i_0 = field1672;
          }

          if (i_1 > field1672) {
            i_1 = field1672;
          }

          i_8 = (i_8 << 9) - i_5 * i_30 + i_30;
          if (i_0 < i_1) {
            i_4 = i_5 <<= 14;
            if (i_2 < 0) {
              i_4 -= i_27 * i_2;
              i_5 -= i_28 * i_2;
              i_8 -= i_31 * i_2;
              i_2 = 0;
            }

            i_3 <<= 14;
            if (i_0 < 0) {
              i_3 -= i_0 * i_26;
              i_0 = 0;
            }

            i_41 = i_2 - field1689;
            i_32 += i_34 * i_41;
            i_35 += i_37 * i_41;
            i_38 += i_40 * i_41;
            if (i_27 < i_28) {
              i_1 -= i_0;
              i_0 -= i_2;
              i_2 = field1682[i_2];

              while (true) {
                --i_0;
                if (i_0 < 0) {
                  while (true) {
                    --i_1;
                    if (i_1 < 0) {
                      return;
                    }

                    method2813(class314.field3766, ints_19, 0, 0, i_2, i_4 >> 14, i_3 >> 14, i_8,
                               i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                    i_4 += i_27;
                    i_3 += i_26;
                    i_8 += i_31;
                    i_2 += class314.field3761;
                    i_32 += i_34;
                    i_35 += i_37;
                    i_38 += i_40;
                  }
                }

                method2813(class314.field3766, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8, i_30,
                           i_32, i_35, i_38, i_33, i_36, i_39);
                i_4 += i_27;
                i_5 += i_28;
                i_8 += i_31;
                i_2 += class314.field3761;
                i_32 += i_34;
                i_35 += i_37;
                i_38 += i_40;
              }
            } else {
              i_1 -= i_0;
              i_0 -= i_2;
              i_2 = field1682[i_2];

              while (true) {
                --i_0;
                if (i_0 < 0) {
                  while (true) {
                    --i_1;
                    if (i_1 < 0) {
                      return;
                    }

                    method2813(class314.field3766, ints_19, 0, 0, i_2, i_3 >> 14, i_4 >> 14, i_8,
                               i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                    i_4 += i_27;
                    i_3 += i_26;
                    i_8 += i_31;
                    i_2 += class314.field3761;
                    i_32 += i_34;
                    i_35 += i_37;
                    i_38 += i_40;
                  }
                }

                method2813(class314.field3766, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8, i_30,
                           i_32, i_35, i_38, i_33, i_36, i_39);
                i_4 += i_27;
                i_5 += i_28;
                i_8 += i_31;
                i_2 += class314.field3761;
                i_32 += i_34;
                i_35 += i_37;
                i_38 += i_40;
              }
            }
          } else {
            i_3 = i_5 <<= 14;
            if (i_2 < 0) {
              i_3 -= i_27 * i_2;
              i_5 -= i_28 * i_2;
              i_8 -= i_31 * i_2;
              i_2 = 0;
            }

            i_4 <<= 14;
            if (i_1 < 0) {
              i_4 -= i_26 * i_1;
              i_1 = 0;
            }

            i_41 = i_2 - field1689;
            i_32 += i_34 * i_41;
            i_35 += i_37 * i_41;
            i_38 += i_40 * i_41;
            if (i_27 < i_28) {
              i_0 -= i_1;
              i_1 -= i_2;
              i_2 = field1682[i_2];

              while (true) {
                --i_1;
                if (i_1 < 0) {
                  while (true) {
                    --i_0;
                    if (i_0 < 0) {
                      return;
                    }

                    method2813(class314.field3766, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8,
                               i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                    i_4 += i_26;
                    i_5 += i_28;
                    i_8 += i_31;
                    i_2 += class314.field3761;
                    i_32 += i_34;
                    i_35 += i_37;
                    i_38 += i_40;
                  }
                }

                method2813(class314.field3766, ints_19, 0, 0, i_2, i_3 >> 14, i_5 >> 14, i_8, i_30,
                           i_32, i_35, i_38, i_33, i_36, i_39);
                i_3 += i_27;
                i_5 += i_28;
                i_8 += i_31;
                i_2 += class314.field3761;
                i_32 += i_34;
                i_35 += i_37;
                i_38 += i_40;
              }
            } else {
              i_0 -= i_1;
              i_1 -= i_2;
              i_2 = field1682[i_2];

              while (true) {
                --i_1;
                if (i_1 < 0) {
                  while (true) {
                    --i_0;
                    if (i_0 < 0) {
                      return;
                    }

                    method2813(class314.field3766, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8,
                               i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                    i_4 += i_26;
                    i_5 += i_28;
                    i_8 += i_31;
                    i_2 += class314.field3761;
                    i_32 += i_34;
                    i_35 += i_37;
                    i_38 += i_40;
                  }
                }

                method2813(class314.field3766, ints_19, 0, 0, i_2, i_5 >> 14, i_3 >> 14, i_8, i_30,
                           i_32, i_35, i_38, i_33, i_36, i_39);
                i_3 += i_27;
                i_5 += i_28;
                i_8 += i_31;
                i_2 += class314.field3761;
                i_32 += i_34;
                i_35 += i_37;
                i_38 += i_40;
              }
            }
          }
        }
      }
    }
  }

  @ObfuscatedName("m")
  static final void method2813(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5,
                               int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12,
                               int i_13, int i_14) {
    if (field1677) {
      if (i_6 > field1688) {
        i_6 = field1688;
      }

      if (i_5 < 0) {
        i_5 = 0;
      }
    }

    if (i_5 < i_6) {
      i_4 += i_5;
      i_7 += i_5 * i_8;
      int i_17 = i_6 - i_5;
      int i_15;
      int i_16;
      int i_10000;
      int i_18;
      int i_19;
      int i_20;
      int i_21;
      int i_22;
      int i_23;
      if (field1669) {
        i_23 = i_5 - field1687;
        i_9 += i_23 * (i_12 >> 3);
        i_10 += (i_13 >> 3) * i_23;
        i_11 += i_23 * (i_14 >> 3);
        i_22 = i_11 >> 12;
        if (i_22 != 0) {
          i_18 = i_9 / i_22;
          i_19 = i_10 / i_22;
          if (i_18 < 0) {
            i_18 = 0;
          } else if (i_18 > 4032) {
            i_18 = 4032;
          }
        } else {
          i_18 = 0;
          i_19 = 0;
        }

        i_9 += i_12;
        i_10 += i_13;
        i_11 += i_14;
        i_22 = i_11 >> 12;
        if (i_22 != 0) {
          i_20 = i_9 / i_22;
          i_21 = i_10 / i_22;
          if (i_20 < 0) {
            i_20 = 0;
          } else if (i_20 > 4032) {
            i_20 = 4032;
          }
        } else {
          i_20 = 0;
          i_21 = 0;
        }

        i_2 = (i_18 << 20) + i_19;
        i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 20);
        i_17 >>= 3;
        i_8 <<= 3;
        i_15 = i_7 >> 8;
        if (field1668) {
          if (i_17 > 0) {
            do {
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_10000 = i_16 + i_2;
              i_18 = i_20;
              i_19 = i_21;
              i_9 += i_12;
              i_10 += i_13;
              i_11 += i_14;
              i_22 = i_11 >> 12;
              if (i_22 != 0) {
                i_20 = i_9 / i_22;
                i_21 = i_10 / i_22;
                if (i_20 < 0) {
                  i_20 = 0;
                } else if (i_20 > 4032) {
                  i_20 = 4032;
                }
              } else {
                i_20 = 0;
                i_21 = 0;
              }

              i_2 = (i_18 << 20) + i_19;
              i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 20);
              i_7 += i_8;
              i_15 = i_7 >> 8;
              --i_17;
            } while (i_17 > 0);
          }

          i_17 = i_6 - i_5 & 0x7;
          if (i_17 > 0) {
            do {
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              --i_17;
            } while (i_17 > 0);
          }
        } else {
          if (i_17 > 0) {
            do {
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_10000 = i_16 + i_2;
              i_18 = i_20;
              i_19 = i_21;
              i_9 += i_12;
              i_10 += i_13;
              i_11 += i_14;
              i_22 = i_11 >> 12;
              if (i_22 != 0) {
                i_20 = i_9 / i_22;
                i_21 = i_10 / i_22;
                if (i_20 < 0) {
                  i_20 = 0;
                } else if (i_20 > 4032) {
                  i_20 = 4032;
                }
              } else {
                i_20 = 0;
                i_21 = 0;
              }

              i_2 = (i_18 << 20) + i_19;
              i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 20);
              i_7 += i_8;
              i_15 = i_7 >> 8;
              --i_17;
            } while (i_17 > 0);
          }

          i_17 = i_6 - i_5 & 0x7;
          if (i_17 > 0) {
            do {
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              --i_17;
            } while (i_17 > 0);
          }
        }
      } else {
        i_23 = i_5 - field1687;
        i_9 += i_23 * (i_12 >> 3);
        i_10 += (i_13 >> 3) * i_23;
        i_11 += i_23 * (i_14 >> 3);
        i_22 = i_11 >> 14;
        if (i_22 != 0) {
          i_18 = i_9 / i_22;
          i_19 = i_10 / i_22;
          if (i_18 < 0) {
            i_18 = 0;
          } else if (i_18 > 16256) {
            i_18 = 16256;
          }
        } else {
          i_18 = 0;
          i_19 = 0;
        }

        i_9 += i_12;
        i_10 += i_13;
        i_11 += i_14;
        i_22 = i_11 >> 14;
        if (i_22 != 0) {
          i_20 = i_9 / i_22;
          i_21 = i_10 / i_22;
          if (i_20 < 0) {
            i_20 = 0;
          } else if (i_20 > 16256) {
            i_20 = 16256;
          }
        } else {
          i_20 = 0;
          i_21 = 0;
        }

        i_2 = (i_18 << 18) + i_19;
        i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 18);
        i_17 >>= 3;
        i_8 <<= 3;
        i_15 = i_7 >> 8;
        if (field1668) {
          if (i_17 > 0) {
            do {
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_10000 = i_16 + i_2;
              i_18 = i_20;
              i_19 = i_21;
              i_9 += i_12;
              i_10 += i_13;
              i_11 += i_14;
              i_22 = i_11 >> 14;
              if (i_22 != 0) {
                i_20 = i_9 / i_22;
                i_21 = i_10 / i_22;
                if (i_20 < 0) {
                  i_20 = 0;
                } else if (i_20 > 16256) {
                  i_20 = 16256;
                }
              } else {
                i_20 = 0;
                i_21 = 0;
              }

              i_2 = (i_18 << 18) + i_19;
              i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 18);
              i_7 += i_8;
              i_15 = i_7 >> 8;
              --i_17;
            } while (i_17 > 0);
          }

          i_17 = i_6 - i_5 & 0x7;
          if (i_17 > 0) {
            do {
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              --i_17;
            } while (i_17 > 0);
          }
        } else {
          if (i_17 > 0) {
            do {
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_10000 = i_16 + i_2;
              i_18 = i_20;
              i_19 = i_21;
              i_9 += i_12;
              i_10 += i_13;
              i_11 += i_14;
              i_22 = i_11 >> 14;
              if (i_22 != 0) {
                i_20 = i_9 / i_22;
                i_21 = i_10 / i_22;
                if (i_20 < 0) {
                  i_20 = 0;
                } else if (i_20 > 16256) {
                  i_20 = 16256;
                }
              } else {
                i_20 = 0;
                i_21 = 0;
              }

              i_2 = (i_18 << 18) + i_19;
              i_16 = (i_21 - i_19 >> 3) + (i_20 - i_18 >> 3 << 18);
              i_7 += i_8;
              i_15 = i_7 >> 8;
              --i_17;
            } while (i_17 > 0);
          }

          i_17 = i_6 - i_5 & 0x7;
          if (i_17 > 0) {
            do {
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              --i_17;
            } while (i_17 > 0);
          }
        }
      }

    }
  }

  @ObfuscatedName("r")
  static final void method2800(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                               int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13,
                               int i_14, int i_15, int i_16, int i_17, int i_18) {
    int[] ints_19 = field1667.vmethod3079(i_18);
    int i_20;
    if (ints_19 == null) {
      i_20 = field1667.vmethod3092(i_18);
      method2794(i_0, i_1, i_2, i_3, i_4, i_5, method2802(i_20, i_6), method2802(i_20, i_7),
                 method2802(i_20, i_8));
    } else {
      field1669 = field1667.vmethod3082(i_18);
      field1668 = field1667.vmethod3081(i_18);
      i_20 = i_4 - i_3;
      int i_21 = i_1 - i_0;
      int i_22 = i_5 - i_3;
      int i_23 = i_2 - i_0;
      int i_24 = i_7 - i_6;
      int i_25 = i_8 - i_6;
      int i_26 = 0;
      if (i_0 != i_1) {
        i_26 = (i_4 - i_3 << 14) / (i_1 - i_0);
      }

      int i_27 = 0;
      if (i_2 != i_1) {
        i_27 = (i_5 - i_4 << 14) / (i_2 - i_1);
      }

      int i_28 = 0;
      if (i_0 != i_2) {
        i_28 = (i_3 - i_5 << 14) / (i_0 - i_2);
      }

      int i_29 = i_20 * i_23 - i_22 * i_21;
      if (i_29 != 0) {
        int i_30 = (i_24 * i_23 - i_25 * i_21 << 9) / i_29;
        int i_31 = (i_25 * i_20 - i_24 * i_22 << 9) / i_29;
        i_10 = i_9 - i_10;
        i_13 = i_12 - i_13;
        i_16 = i_15 - i_16;
        i_11 -= i_9;
        i_14 -= i_12;
        i_17 -= i_15;
        int i_32 = i_11 * i_12 - i_9 * i_14 << 14;
        int i_33 = (int) (((long) (i_15 * i_14 - i_17 * i_12) << 14) / (long) field1678);
        int i_34 = (int) (((long) (i_17 * i_9 - i_11 * i_15) << 14) / (long) field1678);
        int i_35 = i_10 * i_12 - i_13 * i_9 << 14;
        int i_36 = (int) (((long) (i_13 * i_15 - i_16 * i_12) << 14) / (long) field1678);
        int i_37 = (int) (((long) (i_16 * i_9 - i_10 * i_15) << 14) / (long) field1678);
        int i_38 = i_13 * i_11 - i_10 * i_14 << 14;
        int i_39 = (int) (((long) (i_16 * i_14 - i_13 * i_17) << 14) / (long) field1678);
        int i_40 = (int) (((long) (i_17 * i_10 - i_11 * i_16) << 14) / (long) field1678);
        int i_41;
        if (i_0 <= i_1 && i_0 <= i_2) {
          if (i_0 < field1672) {
            if (i_1 > field1672) {
              i_1 = field1672;
            }

            if (i_2 > field1672) {
              i_2 = field1672;
            }

            i_6 = i_30 + ((i_6 << 9) - i_3 * i_30);
            if (i_1 < i_2) {
              i_5 = i_3 <<= 14;
              if (i_0 < 0) {
                i_5 -= i_0 * i_28;
                i_3 -= i_0 * i_26;
                i_6 -= i_0 * i_31;
                i_0 = 0;
              }

              i_4 <<= 14;
              if (i_1 < 0) {
                i_4 -= i_27 * i_1;
                i_1 = 0;
              }

              i_41 = i_0 - field1689;
              i_32 += i_34 * i_41;
              i_35 += i_37 * i_41;
              i_38 += i_40 * i_41;
              if (i_0 != i_1 && i_28 < i_26 || i_0 == i_1 && i_28 > i_27) {
                i_2 -= i_1;
                i_1 -= i_0;
                i_0 = field1682[i_0];

                while (true) {
                  --i_1;
                  if (i_1 < 0) {
                    while (true) {
                      --i_2;
                      if (i_2 < 0) {
                        return;
                      }

                      method2847(class314.field3766, ints_19, 0, 0, i_0, i_5 >> 14, i_4 >> 14, i_6,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_5 += i_28;
                      i_4 += i_27;
                      i_6 += i_31;
                      i_0 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2847(class314.field3766, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_5 += i_28;
                  i_3 += i_26;
                  i_6 += i_31;
                  i_0 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              } else {
                i_2 -= i_1;
                i_1 -= i_0;
                i_0 = field1682[i_0];

                while (true) {
                  --i_1;
                  if (i_1 < 0) {
                    while (true) {
                      --i_2;
                      if (i_2 < 0) {
                        return;
                      }

                      method2847(class314.field3766, ints_19, 0, 0, i_0, i_4 >> 14, i_5 >> 14, i_6,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_5 += i_28;
                      i_4 += i_27;
                      i_6 += i_31;
                      i_0 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2847(class314.field3766, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_5 += i_28;
                  i_3 += i_26;
                  i_6 += i_31;
                  i_0 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              }
            } else {
              i_4 = i_3 <<= 14;
              if (i_0 < 0) {
                i_4 -= i_0 * i_28;
                i_3 -= i_0 * i_26;
                i_6 -= i_0 * i_31;
                i_0 = 0;
              }

              i_5 <<= 14;
              if (i_2 < 0) {
                i_5 -= i_27 * i_2;
                i_2 = 0;
              }

              i_41 = i_0 - field1689;
              i_32 += i_34 * i_41;
              i_35 += i_37 * i_41;
              i_38 += i_40 * i_41;
              if (i_0 != i_2 && i_28 < i_26 || i_0 == i_2 && i_27 > i_26) {
                i_1 -= i_2;
                i_2 -= i_0;
                i_0 = field1682[i_0];

                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    while (true) {
                      --i_1;
                      if (i_1 < 0) {
                        return;
                      }

                      method2847(class314.field3766, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_5 += i_27;
                      i_3 += i_26;
                      i_6 += i_31;
                      i_0 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2847(class314.field3766, ints_19, 0, 0, i_0, i_4 >> 14, i_3 >> 14, i_6,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_4 += i_28;
                  i_3 += i_26;
                  i_6 += i_31;
                  i_0 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              } else {
                i_1 -= i_2;
                i_2 -= i_0;
                i_0 = field1682[i_0];

                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    while (true) {
                      --i_1;
                      if (i_1 < 0) {
                        return;
                      }

                      method2847(class314.field3766, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_5 += i_27;
                      i_3 += i_26;
                      i_6 += i_31;
                      i_0 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2847(class314.field3766, ints_19, 0, 0, i_0, i_3 >> 14, i_4 >> 14, i_6,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_4 += i_28;
                  i_3 += i_26;
                  i_6 += i_31;
                  i_0 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              }
            }
          }
        } else if (i_1 <= i_2) {
          if (i_1 < field1672) {
            if (i_2 > field1672) {
              i_2 = field1672;
            }

            if (i_0 > field1672) {
              i_0 = field1672;
            }

            i_7 = i_30 + ((i_7 << 9) - i_30 * i_4);
            if (i_2 < i_0) {
              i_3 = i_4 <<= 14;
              if (i_1 < 0) {
                i_3 -= i_26 * i_1;
                i_4 -= i_27 * i_1;
                i_7 -= i_31 * i_1;
                i_1 = 0;
              }

              i_5 <<= 14;
              if (i_2 < 0) {
                i_5 -= i_28 * i_2;
                i_2 = 0;
              }

              i_41 = i_1 - field1689;
              i_32 += i_34 * i_41;
              i_35 += i_37 * i_41;
              i_38 += i_40 * i_41;
              if (i_2 != i_1 && i_26 < i_27 || i_2 == i_1 && i_26 > i_28) {
                i_0 -= i_2;
                i_2 -= i_1;
                i_1 = field1682[i_1];

                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    while (true) {
                      --i_0;
                      if (i_0 < 0) {
                        return;
                      }

                      method2847(class314.field3766, ints_19, 0, 0, i_1, i_3 >> 14, i_5 >> 14, i_7,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_3 += i_26;
                      i_5 += i_28;
                      i_7 += i_31;
                      i_1 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2847(class314.field3766, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_3 += i_26;
                  i_4 += i_27;
                  i_7 += i_31;
                  i_1 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              } else {
                i_0 -= i_2;
                i_2 -= i_1;
                i_1 = field1682[i_1];

                while (true) {
                  --i_2;
                  if (i_2 < 0) {
                    while (true) {
                      --i_0;
                      if (i_0 < 0) {
                        return;
                      }

                      method2847(class314.field3766, ints_19, 0, 0, i_1, i_5 >> 14, i_3 >> 14, i_7,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_3 += i_26;
                      i_5 += i_28;
                      i_7 += i_31;
                      i_1 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2847(class314.field3766, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_3 += i_26;
                  i_4 += i_27;
                  i_7 += i_31;
                  i_1 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              }
            } else {
              i_5 = i_4 <<= 14;
              if (i_1 < 0) {
                i_5 -= i_26 * i_1;
                i_4 -= i_27 * i_1;
                i_7 -= i_31 * i_1;
                i_1 = 0;
              }

              i_3 <<= 14;
              if (i_0 < 0) {
                i_3 -= i_0 * i_28;
                i_0 = 0;
              }

              i_41 = i_1 - field1689;
              i_32 += i_34 * i_41;
              i_35 += i_37 * i_41;
              i_38 += i_40 * i_41;
              if (i_26 < i_27) {
                i_2 -= i_0;
                i_0 -= i_1;
                i_1 = field1682[i_1];

                while (true) {
                  --i_0;
                  if (i_0 < 0) {
                    while (true) {
                      --i_2;
                      if (i_2 < 0) {
                        return;
                      }

                      method2847(class314.field3766, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_3 += i_28;
                      i_4 += i_27;
                      i_7 += i_31;
                      i_1 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2847(class314.field3766, ints_19, 0, 0, i_1, i_5 >> 14, i_4 >> 14, i_7,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_5 += i_26;
                  i_4 += i_27;
                  i_7 += i_31;
                  i_1 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              } else {
                i_2 -= i_0;
                i_0 -= i_1;
                i_1 = field1682[i_1];

                while (true) {
                  --i_0;
                  if (i_0 < 0) {
                    while (true) {
                      --i_2;
                      if (i_2 < 0) {
                        return;
                      }

                      method2847(class314.field3766, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7,
                                 i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                      i_3 += i_28;
                      i_4 += i_27;
                      i_7 += i_31;
                      i_1 += class314.field3761;
                      i_32 += i_34;
                      i_35 += i_37;
                      i_38 += i_40;
                    }
                  }

                  method2847(class314.field3766, ints_19, 0, 0, i_1, i_4 >> 14, i_5 >> 14, i_7,
                             i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                  i_5 += i_26;
                  i_4 += i_27;
                  i_7 += i_31;
                  i_1 += class314.field3761;
                  i_32 += i_34;
                  i_35 += i_37;
                  i_38 += i_40;
                }
              }
            }
          }
        } else if (i_2 < field1672) {
          if (i_0 > field1672) {
            i_0 = field1672;
          }

          if (i_1 > field1672) {
            i_1 = field1672;
          }

          i_8 = (i_8 << 9) - i_5 * i_30 + i_30;
          if (i_0 < i_1) {
            i_4 = i_5 <<= 14;
            if (i_2 < 0) {
              i_4 -= i_27 * i_2;
              i_5 -= i_28 * i_2;
              i_8 -= i_31 * i_2;
              i_2 = 0;
            }

            i_3 <<= 14;
            if (i_0 < 0) {
              i_3 -= i_0 * i_26;
              i_0 = 0;
            }

            i_41 = i_2 - field1689;
            i_32 += i_34 * i_41;
            i_35 += i_37 * i_41;
            i_38 += i_40 * i_41;
            if (i_27 < i_28) {
              i_1 -= i_0;
              i_0 -= i_2;
              i_2 = field1682[i_2];

              while (true) {
                --i_0;
                if (i_0 < 0) {
                  while (true) {
                    --i_1;
                    if (i_1 < 0) {
                      return;
                    }

                    method2847(class314.field3766, ints_19, 0, 0, i_2, i_4 >> 14, i_3 >> 14, i_8,
                               i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                    i_4 += i_27;
                    i_3 += i_26;
                    i_8 += i_31;
                    i_2 += class314.field3761;
                    i_32 += i_34;
                    i_35 += i_37;
                    i_38 += i_40;
                  }
                }

                method2847(class314.field3766, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8, i_30,
                           i_32, i_35, i_38, i_33, i_36, i_39);
                i_4 += i_27;
                i_5 += i_28;
                i_8 += i_31;
                i_2 += class314.field3761;
                i_32 += i_34;
                i_35 += i_37;
                i_38 += i_40;
              }
            } else {
              i_1 -= i_0;
              i_0 -= i_2;
              i_2 = field1682[i_2];

              while (true) {
                --i_0;
                if (i_0 < 0) {
                  while (true) {
                    --i_1;
                    if (i_1 < 0) {
                      return;
                    }

                    method2847(class314.field3766, ints_19, 0, 0, i_2, i_3 >> 14, i_4 >> 14, i_8,
                               i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                    i_4 += i_27;
                    i_3 += i_26;
                    i_8 += i_31;
                    i_2 += class314.field3761;
                    i_32 += i_34;
                    i_35 += i_37;
                    i_38 += i_40;
                  }
                }

                method2847(class314.field3766, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8, i_30,
                           i_32, i_35, i_38, i_33, i_36, i_39);
                i_4 += i_27;
                i_5 += i_28;
                i_8 += i_31;
                i_2 += class314.field3761;
                i_32 += i_34;
                i_35 += i_37;
                i_38 += i_40;
              }
            }
          } else {
            i_3 = i_5 <<= 14;
            if (i_2 < 0) {
              i_3 -= i_27 * i_2;
              i_5 -= i_28 * i_2;
              i_8 -= i_31 * i_2;
              i_2 = 0;
            }

            i_4 <<= 14;
            if (i_1 < 0) {
              i_4 -= i_26 * i_1;
              i_1 = 0;
            }

            i_41 = i_2 - field1689;
            i_32 += i_34 * i_41;
            i_35 += i_37 * i_41;
            i_38 += i_40 * i_41;
            if (i_27 < i_28) {
              i_0 -= i_1;
              i_1 -= i_2;
              i_2 = field1682[i_2];

              while (true) {
                --i_1;
                if (i_1 < 0) {
                  while (true) {
                    --i_0;
                    if (i_0 < 0) {
                      return;
                    }

                    method2847(class314.field3766, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8,
                               i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                    i_4 += i_26;
                    i_5 += i_28;
                    i_8 += i_31;
                    i_2 += class314.field3761;
                    i_32 += i_34;
                    i_35 += i_37;
                    i_38 += i_40;
                  }
                }

                method2847(class314.field3766, ints_19, 0, 0, i_2, i_3 >> 14, i_5 >> 14, i_8, i_30,
                           i_32, i_35, i_38, i_33, i_36, i_39);
                i_3 += i_27;
                i_5 += i_28;
                i_8 += i_31;
                i_2 += class314.field3761;
                i_32 += i_34;
                i_35 += i_37;
                i_38 += i_40;
              }
            } else {
              i_0 -= i_1;
              i_1 -= i_2;
              i_2 = field1682[i_2];

              while (true) {
                --i_1;
                if (i_1 < 0) {
                  while (true) {
                    --i_0;
                    if (i_0 < 0) {
                      return;
                    }

                    method2847(class314.field3766, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8,
                               i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                    i_4 += i_26;
                    i_5 += i_28;
                    i_8 += i_31;
                    i_2 += class314.field3761;
                    i_32 += i_34;
                    i_35 += i_37;
                    i_38 += i_40;
                  }
                }

                method2847(class314.field3766, ints_19, 0, 0, i_2, i_5 >> 14, i_3 >> 14, i_8, i_30,
                           i_32, i_35, i_38, i_33, i_36, i_39);
                i_3 += i_27;
                i_5 += i_28;
                i_8 += i_31;
                i_2 += class314.field3761;
                i_32 += i_34;
                i_35 += i_37;
                i_38 += i_40;
              }
            }
          }
        }
      }
    }
  }

  @ObfuscatedName("t")
  static final void method2847(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5,
                               int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12,
                               int i_13, int i_14) {
    if (field1677) {
      if (i_6 > field1688) {
        i_6 = field1688;
      }

      if (i_5 < 0) {
        i_5 = 0;
      }
    }

    if (i_5 < i_6) {
      i_4 += i_5;
      i_7 += i_5 * i_8;
      int i_17 = i_6 - i_5;
      int i_15;
      int i_16;
      int i_18;
      int i_19;
      int i_20;
      int i_21;
      int i_22;
      int i_23;
      if (field1669) {
        i_23 = i_5 - field1687;
        i_9 += i_23 * i_12;
        i_10 += i_13 * i_23;
        i_11 += i_23 * i_14;
        i_22 = i_11 >> 12;
        if (i_22 != 0) {
          i_18 = i_9 / i_22;
          i_19 = i_10 / i_22;
        } else {
          i_18 = 0;
          i_19 = 0;
        }

        i_9 += i_17 * i_12;
        i_10 += i_13 * i_17;
        i_11 += i_17 * i_14;
        i_22 = i_11 >> 12;
        if (i_22 != 0) {
          i_20 = i_9 / i_22;
          i_21 = i_10 / i_22;
        } else {
          i_20 = 0;
          i_21 = 0;
        }

        i_2 = (i_18 << 20) + i_19;
        i_16 = (i_21 - i_19) / i_17 + ((i_20 - i_18) / i_17 << 20);
        i_17 >>= 3;
        i_8 <<= 3;
        i_15 = i_7 >> 8;
        if (field1668) {
          if (i_17 > 0) {
            do {
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_7 += i_8;
              i_15 = i_7 >> 8;
              --i_17;
            } while (i_17 > 0);
          }

          i_17 = i_6 - i_5 & 0x7;
          if (i_17 > 0) {
            do {
              i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              --i_17;
            } while (i_17 > 0);
          }
        } else {
          if (i_17 > 0) {
            do {
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              i_7 += i_8;
              i_15 = i_7 >> 8;
              --i_17;
            } while (i_17 > 0);
          }

          i_17 = i_6 - i_5 & 0x7;
          if (i_17 > 0) {
            do {
              if ((i_3 = ints_1[(i_2 >>> 26) + (i_2 & 0xfc0)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              --i_17;
            } while (i_17 > 0);
          }
        }
      } else {
        i_23 = i_5 - field1687;
        i_9 += i_23 * i_12;
        i_10 += i_13 * i_23;
        i_11 += i_23 * i_14;
        i_22 = i_11 >> 14;
        if (i_22 != 0) {
          i_18 = i_9 / i_22;
          i_19 = i_10 / i_22;
        } else {
          i_18 = 0;
          i_19 = 0;
        }

        i_9 += i_17 * i_12;
        i_10 += i_13 * i_17;
        i_11 += i_17 * i_14;
        i_22 = i_11 >> 14;
        if (i_22 != 0) {
          i_20 = i_9 / i_22;
          i_21 = i_10 / i_22;
        } else {
          i_20 = 0;
          i_21 = 0;
        }

        i_2 = (i_18 << 18) + i_19;
        i_16 = (i_21 - i_19) / i_17 + ((i_20 - i_18) / i_17 << 18);
        i_17 >>= 3;
        i_8 <<= 3;
        i_15 = i_7 >> 8;
        if (field1668) {
          if (i_17 > 0) {
            do {
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              i_7 += i_8;
              i_15 = i_7 >> 8;
              --i_17;
            } while (i_17 > 0);
          }

          i_17 = i_6 - i_5 & 0x7;
          if (i_17 > 0) {
            do {
              i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
              ints_0[i_4++] =
                  (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              i_2 += i_16;
              --i_17;
            } while (i_17 > 0);
          }
        } else {
          if (i_17 > 0) {
            do {
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              i_7 += i_8;
              i_15 = i_7 >> 8;
              --i_17;
            } while (i_17 > 0);
          }

          i_17 = i_6 - i_5 & 0x7;
          if (i_17 > 0) {
            do {
              if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0) {
                ints_0[i_4] =
                    (i_15 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) >> 8;
              }

              ++i_4;
              i_2 += i_16;
              --i_17;
            } while (i_17 > 0);
          }
        }
      }

    }
  }

  @ObfuscatedName("o")
  static final int method2802(int i_0, int i_1) {
    i_1 = (i_0 & 0x7f) * i_1 >> 7;
    if (i_1 < 2) {
      i_1 = 2;
    } else if (i_1 > 126) {
      i_1 = 126;
    }

    return (i_0 & 0xff80) + i_1;
  }

  @ObfuscatedName("y")
  static final int method2803(int i_0, int i_1, int i_2, int i_3) {
    return i_0 * i_2 + i_3 * i_1 >> 16;
  }

  @ObfuscatedName("a")
  static final int method2828(int i_0, int i_1, int i_2, int i_3) {
    return i_2 * i_1 - i_3 * i_0 >> 16;
  }

  @ObfuscatedName("c")
  static final int method2805(int i_0, int i_1, int i_2, int i_3) {
    return i_0 * i_2 - i_3 * i_1 >> 16;
  }

  @ObfuscatedName("v")
  static final int method2806(int i_0, int i_1, int i_2, int i_3) {
    return i_3 * i_0 + i_2 * i_1 >> 16;
  }

  @ObfuscatedName("af")
  static final int method2807(int i_0, int i_1, int i_2, int i_3) {
    return i_0 * i_2 + i_3 * i_1 >> 16;
  }

  @ObfuscatedName("ah")
  static final int method2790(int i_0, int i_1, int i_2, int i_3) {
    return i_2 * i_1 - i_3 * i_0 >> 16;
  }

}
