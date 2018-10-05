package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
public class class314 extends SubNode {

  @ObfuscatedName("ak")
  public static int field3763 = 0;
  @ObfuscatedName("as")
  public static int field3764 = 0;
  @ObfuscatedName("an")
  public static int field3765 = 0;
  @ObfuscatedName("ah")
  public static int[] field3766;
  @ObfuscatedName("ab")
  public static int field3761;
  @ObfuscatedName("aw")
  public static int field3762;
  @ObfuscatedName("ao")
  protected static int field3760 = 0;

  @ObfuscatedName("dz")
  public static void method5718(int[] ints_0, int i_1, int i_2) {
    field3766 = ints_0;
    field3761 = i_1;
    field3762 = i_2;
    method5720(0, 0, i_1, i_2);
  }

  @ObfuscatedName("dn")
  public static void method5719() {
    field3765 = 0;
    field3763 = 0;
    field3760 = field3761;
    field3764 = field3762;
  }

  @ObfuscatedName("dg")
  public static void method5720(int i_0, int i_1, int i_2, int i_3) {
    if (i_0 < 0) {
      i_0 = 0;
    }

    if (i_1 < 0) {
      i_1 = 0;
    }

    if (i_2 > field3761) {
      i_2 = field3761;
    }

    if (i_3 > field3762) {
      i_3 = field3762;
    }

    field3765 = i_0;
    field3763 = i_1;
    field3760 = i_2;
    field3764 = i_3;
  }

  @ObfuscatedName("dy")
  public static void method5790(int i_0, int i_1, int i_2, int i_3) {
    if (field3765 < i_0) {
      field3765 = i_0;
    }

    if (field3763 < i_1) {
      field3763 = i_1;
    }

    if (field3760 > i_2) {
      field3760 = i_2;
    }

    if (field3764 > i_3) {
      field3764 = i_3;
    }

  }

  @ObfuscatedName("dv")
  public static void method5722(int[] ints_0) {
    ints_0[0] = field3765;
    ints_0[1] = field3763;
    ints_0[2] = field3760;
    ints_0[3] = field3764;
  }

  @ObfuscatedName("de")
  public static void method5723(int[] ints_0) {
    field3765 = ints_0[0];
    field3763 = ints_0[1];
    field3760 = ints_0[2];
    field3764 = ints_0[3];
  }

  @ObfuscatedName("dp")
  public static void method5724() {
    int i_0 = 0;

    int i_1;
    for (i_1 = field3761 * field3762 - 7; i_0 < i_1; field3766[i_0++] = 0) {
      field3766[i_0++] = 0;
      field3766[i_0++] = 0;
      field3766[i_0++] = 0;
      field3766[i_0++] = 0;
      field3766[i_0++] = 0;
      field3766[i_0++] = 0;
      field3766[i_0++] = 0;
    }

    for (i_1 += 7; i_0 < i_1; field3766[i_0++] = 0) {
    }

  }

  @ObfuscatedName("db")
  static void method5744(int i_0, int i_1, int i_2, int i_3) {
    if (i_2 == 0) {
      method5730(i_0, i_1, i_3);
    } else {
      if (i_2 < 0) {
        i_2 = -i_2;
      }

      int i_4 = i_1 - i_2;
      if (i_4 < field3763) {
        i_4 = field3763;
      }

      int i_5 = i_2 + i_1 + 1;
      if (i_5 > field3764) {
        i_5 = field3764;
      }

      int i_6 = i_4;
      int i_7 = i_2 * i_2;
      int i_8 = 0;
      int i_9 = i_1 - i_4;
      int i_10 = i_9 * i_9;
      int i_11 = i_10 - i_9;
      if (i_1 > i_5) {
        i_1 = i_5;
      }

      int i_12;
      int i_13;
      int i_14;
      int i_15;
      while (i_6 < i_1) {
        while (i_11 <= i_7 || i_10 <= i_7) {
          i_10 = i_10 + i_8 + i_8;
          i_11 += i_8++ + i_8;
        }

        i_12 = i_0 - i_8 + 1;
        if (i_12 < field3765) {
          i_12 = field3765;
        }

        i_13 = i_0 + i_8;
        if (i_13 > field3760) {
          i_13 = field3760;
        }

        i_14 = i_12 + i_6 * field3761;

        for (i_15 = i_12; i_15 < i_13; i_15++) {
          field3766[i_14++] = i_3;
        }

        ++i_6;
        i_10 -= i_9-- + i_9;
        i_11 -= i_9 + i_9;
      }

      i_8 = i_2;
      i_9 = i_6 - i_1;
      i_11 = i_7 + i_9 * i_9;
      i_10 = i_11 - i_2;

      for (i_11 -= i_9; i_6 < i_5; i_10 += i_9++ + i_9) {
        while (i_11 > i_7 && i_10 > i_7) {
          i_11 -= i_8-- + i_8;
          i_10 -= i_8 + i_8;
        }

        i_12 = i_0 - i_8;
        if (i_12 < field3765) {
          i_12 = field3765;
        }

        i_13 = i_0 + i_8;
        if (i_13 > field3760 - 1) {
          i_13 = field3760 - 1;
        }

        i_14 = i_12 + i_6 * field3761;

        for (i_15 = i_12; i_15 <= i_13; i_15++) {
          field3766[i_14++] = i_3;
        }

        ++i_6;
        i_11 = i_11 + i_9 + i_9;
      }

    }
  }

  @ObfuscatedName("dq")
  public static void method5784(int i_0, int i_1, int i_2, int i_3, int i_4) {
    if (i_4 != 0) {
      if (i_4 == 256) {
        method5744(i_0, i_1, i_2, i_3);
      } else {
        if (i_2 < 0) {
          i_2 = -i_2;
        }

        int i_5 = 256 - i_4;
        int i_6 = (i_3 >> 16 & 0xff) * i_4;
        int i_7 = (i_3 >> 8 & 0xff) * i_4;
        int i_8 = i_4 * (i_3 & 0xff);
        int i_12 = i_1 - i_2;
        if (i_12 < field3763) {
          i_12 = field3763;
        }

        int i_13 = i_2 + i_1 + 1;
        if (i_13 > field3764) {
          i_13 = field3764;
        }

        int i_14 = i_12;
        int i_15 = i_2 * i_2;
        int i_16 = 0;
        int i_17 = i_1 - i_12;
        int i_18 = i_17 * i_17;
        int i_19 = i_18 - i_17;
        if (i_1 > i_13) {
          i_1 = i_13;
        }

        int i_9;
        int i_10;
        int i_11;
        int i_20;
        int i_21;
        int i_22;
        int i_23;
        int i_24;
        while (i_14 < i_1) {
          while (i_19 <= i_15 || i_18 <= i_15) {
            i_18 = i_18 + i_16 + i_16;
            i_19 += i_16++ + i_16;
          }

          i_20 = i_0 - i_16 + 1;
          if (i_20 < field3765) {
            i_20 = field3765;
          }

          i_21 = i_0 + i_16;
          if (i_21 > field3760) {
            i_21 = field3760;
          }

          i_22 = i_20 + i_14 * field3761;

          for (i_23 = i_20; i_23 < i_21; i_23++) {
            i_9 = i_5 * (field3766[i_22] >> 16 & 0xff);
            i_10 = (field3766[i_22] >> 8 & 0xff) * i_5;
            i_11 = i_5 * (field3766[i_22] & 0xff);
            i_24 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
            field3766[i_22++] = i_24;
          }

          ++i_14;
          i_18 -= i_17-- + i_17;
          i_19 -= i_17 + i_17;
        }

        i_16 = i_2;
        i_17 = -i_17;
        i_19 = i_15 + i_17 * i_17;
        i_18 = i_19 - i_2;

        for (i_19 -= i_17; i_14 < i_13; i_18 += i_17++ + i_17) {
          while (i_19 > i_15 && i_18 > i_15) {
            i_19 -= i_16-- + i_16;
            i_18 -= i_16 + i_16;
          }

          i_20 = i_0 - i_16;
          if (i_20 < field3765) {
            i_20 = field3765;
          }

          i_21 = i_0 + i_16;
          if (i_21 > field3760 - 1) {
            i_21 = field3760 - 1;
          }

          i_22 = i_20 + i_14 * field3761;

          for (i_23 = i_20; i_23 <= i_21; i_23++) {
            i_9 = i_5 * (field3766[i_22] >> 16 & 0xff);
            i_10 = (field3766[i_22] >> 8 & 0xff) * i_5;
            i_11 = i_5 * (field3766[i_22] & 0xff);
            i_24 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
            field3766[i_22++] = i_24;
          }

          ++i_14;
          i_19 = i_19 + i_17 + i_17;
        }

      }
    }
  }

  @ObfuscatedName("dx")
  public static void method5727(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
    if (i_0 < field3765) {
      i_2 -= field3765 - i_0;
      i_0 = field3765;
    }

    if (i_1 < field3763) {
      i_3 -= field3763 - i_1;
      i_1 = field3763;
    }

    if (i_0 + i_2 > field3760) {
      i_2 = field3760 - i_0;
    }

    if (i_3 + i_1 > field3764) {
      i_3 = field3764 - i_1;
    }

    i_4 = (i_5 * (i_4 & 0xff00ff) >> 8 & 0xff00ff) + (i_5 * (i_4 & 0xff00) >> 8 & 0xff00);
    int i_6 = 256 - i_5;
    int i_7 = field3761 - i_2;
    int i_8 = i_0 + field3761 * i_1;

    for (int i_9 = 0; i_9 < i_3; i_9++) {
      for (int i_10 = -i_2; i_10 < 0; i_10++) {
        int i_11 = field3766[i_8];
        i_11 = ((i_11 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + (i_6 * (i_11 & 0xff00) >> 8 & 0xff00);
        field3766[i_8++] = i_11 + i_4;
      }

      i_8 += i_7;
    }

  }

  @ObfuscatedName("du")
  public static void method5763(int i_0, int i_1, int i_2, int i_3, int i_4) {
    if (i_0 < field3765) {
      i_2 -= field3765 - i_0;
      i_0 = field3765;
    }

    if (i_1 < field3763) {
      i_3 -= field3763 - i_1;
      i_1 = field3763;
    }

    if (i_0 + i_2 > field3760) {
      i_2 = field3760 - i_0;
    }

    if (i_3 + i_1 > field3764) {
      i_3 = field3764 - i_1;
    }

    int i_5 = field3761 - i_2;
    int i_6 = i_0 + field3761 * i_1;

    for (int i_7 = -i_3; i_7 < 0; i_7++) {
      for (int i_8 = -i_2; i_8 < 0; i_8++) {
        field3766[i_6++] = i_4;
      }

      i_6 += i_5;
    }

  }

  @ObfuscatedName("da")
  public static void method5728(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                                int i_7) {
    if (i_2 > 0 && i_3 > 0) {
      int i_8 = 0;
      int i_9 = i_5 == i_4 && i_7 == i_6 ? -1 : 65536 / i_3;
      int i_10 = i_6;
      int i_11 = 256 - i_6;
      int i_12 = i_4;
      if (i_0 < field3765) {
        i_2 -= field3765 - i_0;
        i_0 = field3765;
      }

      if (i_1 < field3763) {
        i_8 += (field3763 - i_1) * i_9;
        i_3 -= field3763 - i_1;
        i_1 = field3763;
      }

      if (i_0 + i_2 > field3760) {
        i_2 = field3760 - i_0;
      }

      if (i_3 + i_1 > field3764) {
        i_3 = field3764 - i_1;
      }

      int i_13 = field3761 - i_2;
      int i_14 = i_0 + field3761 * i_1;

      for (int i_15 = -i_3; i_15 < 0; i_15++) {
        int i_16;
        int i_17;
        for (i_16 = -i_2; i_16 < 0; i_16++) {
          i_17 = field3766[i_14];
          int i_18 = i_12 + i_17;
          int i_19 = (i_12 & 0xff00ff) + (i_17 & 0xff00ff);
          int i_20 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
          if (i_11 == 0) {
            field3766[i_14++] = i_18 - i_20 | i_20 - (i_20 >>> 8);
          } else {
            int i_21 = i_18 - i_20 | i_20 - (i_20 >>> 8);
            field3766[i_14++] =
                ((i_21 & 0xff00ff) * i_10 >> 8 & 0xff00ff) + ((i_17 & 0xff00ff) * i_11 >> 8
                    & 0xff00ff) + (i_10 * (i_21 & 0xff00) >> 8 & 0xff00) + (
                    i_11 * (i_17 & 0xff00) >> 8 & 0xff00);
          }
        }

        if (i_9 > 0) {
          i_8 += i_9;
          i_16 = 65536 - i_8 >> 8;
          i_17 = i_8 >> 8;
          if (i_7 != i_6) {
            i_10 = (65536 - i_8) * i_6 + i_8 * i_7 >> 16;
            i_11 = 256 - i_10;
          }

          if (i_5 != i_4) {
            i_12 = (i_17 * (i_5 & 0xff00ff) + i_16 * (i_4 & 0xff00ff) & ~0xff00ff) + (
                i_17 * (i_5 & 0xff00) + i_16 * (i_4 & 0xff00) & 0xff0000) >>> 8;
          }
        }

        i_14 += i_13;
      }

    }
  }

  @ObfuscatedName("dd")
  public static void method5729(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                                int i_7) {
    if (i_2 > 0 && i_3 > 0) {
      int i_8 = 0;
      int i_9 = i_5 == i_4 && i_7 == i_6 ? -1 : 65536 / i_3;
      int i_10 = i_6;
      int i_11 = 256 - i_6;
      if (i_0 < field3765) {
        i_2 -= field3765 - i_0;
        i_0 = field3765;
      }

      if (i_1 < field3763) {
        i_8 += (field3763 - i_1) * i_9;
        i_3 -= field3763 - i_1;
        i_1 = field3763;
      }

      if (i_0 + i_2 > field3760) {
        i_2 = field3760 - i_0;
      }

      if (i_3 + i_1 > field3764) {
        i_3 = field3764 - i_1;
      }

      int i_12 = i_4 >> 16;
      int i_13 = (i_4 & 0xff00) >> 8;
      int i_14 = i_4 & 0xff;
      int i_18 = field3761 - i_2;
      int i_19 = i_0 + field3761 * i_1;

      for (int i_20 = 0; i_20 < i_3; i_20++) {
        int i_21;
        int i_22;
        int i_23;
        for (i_21 = -i_2; i_21 < 0; i_21++) {
          i_22 = field3766[i_19];
          i_23 = i_22 >> 16;
          int i_24 = (i_22 & 0xff00) >> 8;
          int i_25 = i_22 & 0xff;
          int i_15;
          int i_16;
          int i_17;
          if (i_11 == 0) {
            i_15 = i_23 < 127 ? i_12 * i_23 >> 7 : 255 - ((255 - i_12) * (255 - i_23) >> 7);
            i_16 = i_24 < 127 ? i_13 * i_24 >> 7 : 255 - ((255 - i_13) * (255 - i_24) >> 7);
            i_17 = i_25 < 127 ? i_14 * i_25 >> 7 : 255 - ((255 - i_14) * (255 - i_25) >> 7);
          } else {
            i_15 = i_23 < 127 ? i_23 * i_11 + (i_12 * i_23 * i_10 >> 7) >> 8
                : i_10 * (255 - ((255 - i_12) * (255 - i_23) >> 7)) + i_23 * i_11 >> 8;
            i_16 = i_24 < 127 ? i_24 * i_11 + (i_13 * i_24 * i_10 >> 7) >> 8
                : i_10 * (255 - ((255 - i_13) * (255 - i_24) >> 7)) + i_24 * i_11 >> 8;
            i_17 = i_25 < 127 ? i_25 * i_11 + (i_14 * i_25 * i_10 >> 7) >> 8
                : i_10 * (255 - ((255 - i_14) * (255 - i_25) >> 7)) + i_25 * i_11 >> 8;
          }

          field3766[i_19++] = i_17 + (i_16 << 8) + (i_15 << 16);
        }

        if (i_9 > 0) {
          i_8 += i_9;
          i_21 = 65536 - i_8 >> 8;
          i_22 = i_8 >> 8;
          if (i_7 != i_6) {
            i_10 = (65536 - i_8) * i_6 + i_8 * i_7 >> 16;
            i_11 = 256 - i_10;
          }

          if (i_5 != i_4) {
            i_23 = (i_22 * (i_5 & 0xff00ff) + i_21 * (i_4 & 0xff00ff) & ~0xff00ff) + (
                i_22 * (i_5 & 0xff00) + i_21 * (i_4 & 0xff00) & 0xff0000) >>> 8;
            i_12 = i_23 >> 16;
            i_13 = (i_23 & 0xff00) >> 8;
            i_14 = i_23 & 0xff;
          }
        }

        i_19 += i_18;
      }

    }
  }

  @ObfuscatedName("dc")
  public static void method5739(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                                int i_7) {
    if (i_2 > 0 && i_3 > 0) {
      int i_8 = 0;
      int i_9 = 65536 / i_3;
      int i_10 = i_6;
      int i_11 = 256 - i_6;
      if (i_0 < field3765) {
        i_2 -= field3765 - i_0;
        i_0 = field3765;
      }

      if (i_1 < field3763) {
        i_8 += (field3763 - i_1) * i_9;
        i_3 -= field3763 - i_1;
        i_1 = field3763;
      }

      if (i_0 + i_2 > field3760) {
        i_2 = field3760 - i_0;
      }

      if (i_3 + i_1 > field3764) {
        i_3 = field3764 - i_1;
      }

      int i_12 = i_4 & 0xff0000;
      int i_13 = i_4 & 0xff00;
      int i_14 = i_4 & 0xff;
      int i_15 = i_12 * i_6 >> 8;
      int i_16 = i_13 * i_6 >> 8;
      int i_17 = i_14 * i_6 >> 8;
      int i_18 = field3761 - i_2;
      int i_19 = i_0 + field3761 * i_1;

      for (int i_20 = 0; i_20 < i_3; i_20++) {
        int i_21;
        int i_22;
        int i_23;
        for (i_21 = -i_2; i_21 < 0; i_21++) {
          i_22 = field3766[i_19];
          i_23 = i_22 & 0xff0000;
          int i_24 =
              i_23 <= i_12 ? i_23 : (i_11 == 0 ? i_12 : i_15 + (i_23 * i_11 >> 8) & 0xff0000);
          int i_25 = i_22 & 0xff00;
          int i_26 = i_25 <= i_13 ? i_25 : (i_11 == 0 ? i_13 : i_16 + (i_25 * i_11 >> 8) & 0xff00);
          int i_27 = i_22 & 0xff;
          int i_28 = i_27 <= i_14 ? i_27 : (i_11 == 0 ? i_14 : i_17 + (i_27 * i_11 >> 8));
          field3766[i_19++] = i_24 + i_26 + i_28;
        }

        if (i_9 > 0) {
          i_8 += i_9;
          i_21 = 65536 - i_8 >> 8;
          i_22 = i_8 >> 8;
          if (i_7 != i_6) {
            i_10 = (65536 - i_8) * i_6 + i_8 * i_7 >> 16;
            i_11 = 256 - i_10;
          }

          if (i_5 != i_4) {
            i_23 = (i_22 * (i_5 & 0xff00ff) + i_21 * (i_4 & 0xff00ff) & ~0xff00ff) + (
                i_22 * (i_5 & 0xff00) + i_21 * (i_4 & 0xff00) & 0xff0000) >>> 8;
            i_12 = i_23 & 0xff0000;
            i_13 = i_23 & 0xff00;
            i_14 = i_23 & 0xff;
            i_15 = i_12 * i_10 >> 8;
            i_16 = i_13 * i_10 >> 8;
            i_17 = i_14 * i_10 >> 8;
          }
        }

        i_19 += i_18;
      }

    }
  }

  @ObfuscatedName("ds")
  public static void method5726(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                                int i_7) {
    if (i_3 > 0 && i_2 > 0) {
      int i_8 = 0;
      int i_9 = 65536 / i_3;
      int i_10 = i_6;
      int i_11 = 256 - i_6;
      if (i_0 < field3765) {
        i_2 -= field3765 - i_0;
        i_0 = field3765;
      }

      if (i_1 < field3763) {
        i_8 += (field3763 - i_1) * i_9;
        i_3 -= field3763 - i_1;
        i_1 = field3763;
      }

      if (i_0 + i_2 > field3760) {
        i_2 = field3760 - i_0;
      }

      if (i_3 + i_1 > field3764) {
        i_3 = field3764 - i_1;
      }

      int i_12 = i_4 & 0xff0000;
      int i_13 = i_4 & 0xff00;
      int i_14 = i_4 & 0xff;
      int i_15 = i_12 * i_6 >> 8;
      int i_16 = i_13 * i_6 >> 8;
      int i_17 = i_14 * i_6 >> 8;
      int i_18 = field3761 - i_2;
      int i_19 = i_0 + field3761 * i_1;

      for (int i_20 = 0; i_20 < i_3; i_20++) {
        int i_21;
        int i_22;
        int i_23;
        for (i_21 = -i_2; i_21 < 0; i_21++) {
          i_22 = field3766[i_19];
          i_23 = i_22 & 0xff0000;
          int i_24 =
              i_23 >= i_12 ? i_23 : (i_11 == 0 ? i_12 : i_15 + (i_23 * i_11 >> 8) & 0xff0000);
          int i_25 = i_22 & 0xff00;
          int i_26 = i_25 >= i_13 ? i_25 : (i_11 == 0 ? i_13 : i_16 + (i_25 * i_11 >> 8) & 0xff00);
          int i_27 = i_22 & 0xff;
          int i_28 = i_27 >= i_14 ? i_27 : (i_11 == 0 ? i_14 : i_17 + (i_27 * i_11 >> 8));
          field3766[i_19++] = i_24 + i_26 + i_28;
        }

        if (i_9 > 0) {
          i_8 += i_9;
          i_21 = 65536 - i_8 >> 8;
          i_22 = i_8 >> 8;
          if (i_7 != i_6) {
            i_10 = (65536 - i_8) * i_6 + i_8 * i_7 >> 16;
            i_11 = 256 - i_10;
          }

          if (i_5 != i_4) {
            i_23 = (i_22 * (i_5 & 0xff00ff) + i_21 * (i_4 & 0xff00ff) & ~0xff00ff) + (
                i_22 * (i_5 & 0xff00) + i_21 * (i_4 & 0xff00) & 0xff0000) >>> 8;
            i_12 = i_23 & 0xff0000;
            i_13 = i_23 & 0xff00;
            i_14 = i_23 & 0xff;
            i_15 = i_12 * i_10 >> 8;
            i_16 = i_13 * i_10 >> 8;
            i_17 = i_14 * i_10 >> 8;
          }
        }

        i_19 += i_18;
      }

    }
  }

  @ObfuscatedName("dw")
  public static void method5748(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
    if (i_2 > 0 && i_3 > 0) {
      int i_6 = 0;
      int i_7 = 65536 / i_3;
      if (i_0 < field3765) {
        i_2 -= field3765 - i_0;
        i_0 = field3765;
      }

      if (i_1 < field3763) {
        i_6 += (field3763 - i_1) * i_7;
        i_3 -= field3763 - i_1;
        i_1 = field3763;
      }

      if (i_0 + i_2 > field3760) {
        i_2 = field3760 - i_0;
      }

      if (i_3 + i_1 > field3764) {
        i_3 = field3764 - i_1;
      }

      int i_8 = field3761 - i_2;
      int i_9 = i_0 + field3761 * i_1;

      for (int i_10 = -i_3; i_10 < 0; i_10++) {
        int i_11 = 65536 - i_6 >> 8;
        int i_12 = i_6 >> 8;
        int i_13 = (i_12 * (i_5 & 0xff00ff) + i_11 * (i_4 & 0xff00ff) & ~0xff00ff) + (
            i_12 * (i_5 & 0xff00) + i_11 * (i_4 & 0xff00) & 0xff0000) >>> 8;

        for (int i_14 = -i_2; i_14 < 0; i_14++) {
          field3766[i_9++] = i_13;
        }

        i_9 += i_8;
        i_6 += i_7;
      }

    }
  }

  @ObfuscatedName("dl")
  @ObfuscatedSignature(
      signature = "(IIIIII[BIZ)V",
      garbageValue = "1"
  )
  public static void method5733(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5,
                                byte[] bytes_6, int i_7) {
    if (i_0 + i_2 >= 0 && i_3 + i_1 >= 0) {
      if (i_0 < field3761 && i_1 < field3762) {
        int i_8 = 0;
        int i_9 = 0;
        if (i_0 < 0) {
          i_8 -= i_0;
          i_2 += i_0;
        }

        if (i_1 < 0) {
          i_9 -= i_1;
          i_3 += i_1;
        }

        if (i_0 + i_2 > field3761) {
          i_2 = field3761 - i_0;
        }

        if (i_3 + i_1 > field3762) {
          i_3 = field3762 - i_1;
        }

        int i_10 = bytes_6.length / i_7;
        int i_11 = field3761 - i_2;
        int i_12 = i_4 >>> 24;
        int i_13 = i_5 >>> 24;
        int i_14;
        int i_15;
        int i_16;
        int i_17;
        int i_18;
        if (i_12 == 255 && i_13 == 255) {
          i_14 = i_0 + i_8 + (i_9 + i_1) * field3761;

          for (i_15 = i_9 + i_1; i_15 < i_3 + i_9 + i_1; i_15++) {
            for (i_16 = i_0 + i_8; i_16 < i_0 + i_8 + i_2; i_16++) {
              i_17 = (i_15 - i_1) % i_10;
              i_18 = (i_16 - i_0) % i_7;
              if (bytes_6[i_18 + i_17 * i_7] != 0) {
                field3766[i_14++] = i_5;
              } else {
                field3766[i_14++] = i_4;
              }
            }

            i_14 += i_11;
          }
        } else {
          i_14 = i_0 + i_8 + (i_9 + i_1) * field3761;

          for (i_15 = i_9 + i_1; i_15 < i_3 + i_9 + i_1; i_15++) {
            for (i_16 = i_0 + i_8; i_16 < i_0 + i_8 + i_2; i_16++) {
              i_17 = (i_15 - i_1) % i_10;
              i_18 = (i_16 - i_0) % i_7;
              int i_19 = i_4;
              if (bytes_6[i_18 + i_17 * i_7] != 0) {
                i_19 = i_5;
              }

              int i_20 = i_19 >>> 24;
              int i_21 = 255 - i_20;
              int i_22 = field3766[i_14];
              int i_23 = ((i_19 & 0xff00ff) * i_20 + (i_22 & 0xff00ff) * i_21 & ~0xff00ff) + (
                  i_20 * (i_19 & 0xff00) + i_21 * (i_22 & 0xff00) & 0xff0000) >> 8;
              field3766[i_14++] = i_23;
            }

            i_14 += i_11;
          }
        }

      }
    }
  }

  @ObfuscatedName("di")
  public static void method5734(int i_0, int i_1, int i_2, int i_3, int i_4) {
    method5736(i_0, i_1, i_2, i_4);
    method5736(i_0, i_3 + i_1 - 1, i_2, i_4);
    method5738(i_0, i_1, i_3, i_4);
    method5738(i_0 + i_2 - 1, i_1, i_3, i_4);
  }

  @ObfuscatedName("dt")
  public static void method5741(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
    method5785(i_0, i_1, i_2, i_4, i_5);
    method5785(i_0, i_3 + i_1 - 1, i_2, i_4, i_5);
    if (i_3 >= 3) {
      method5752(i_0, i_1 + 1, i_3 - 2, i_4, i_5);
      method5752(i_0 + i_2 - 1, i_1 + 1, i_3 - 2, i_4, i_5);
    }

  }

  @ObfuscatedName("dm")
  public static void method5736(int i_0, int i_1, int i_2, int i_3) {
    if (i_1 >= field3763 && i_1 < field3764) {
      if (i_0 < field3765) {
        i_2 -= field3765 - i_0;
        i_0 = field3765;
      }

      if (i_0 + i_2 > field3760) {
        i_2 = field3760 - i_0;
      }

      int i_4 = i_0 + field3761 * i_1;

      for (int i_5 = 0; i_5 < i_2; i_5++) {
        field3766[i_4 + i_5] = i_3;
      }

    }
  }

  @ObfuscatedName("dk")
  static void method5785(int i_0, int i_1, int i_2, int i_3, int i_4) {
    if (i_1 >= field3763 && i_1 < field3764) {
      if (i_0 < field3765) {
        i_2 -= field3765 - i_0;
        i_0 = field3765;
      }

      if (i_0 + i_2 > field3760) {
        i_2 = field3760 - i_0;
      }

      int i_5 = 256 - i_4;
      int i_6 = (i_3 >> 16 & 0xff) * i_4;
      int i_7 = (i_3 >> 8 & 0xff) * i_4;
      int i_8 = i_4 * (i_3 & 0xff);
      int i_12 = i_0 + field3761 * i_1;

      for (int i_13 = 0; i_13 < i_2; i_13++) {
        int i_9 = i_5 * (field3766[i_12] >> 16 & 0xff);
        int i_10 = (field3766[i_12] >> 8 & 0xff) * i_5;
        int i_11 = i_5 * (field3766[i_12] & 0xff);
        int i_14 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
        field3766[i_12++] = i_14;
      }

    }
  }

  @ObfuscatedName("df")
  public static void method5738(int i_0, int i_1, int i_2, int i_3) {
    if (i_0 >= field3765 && i_0 < field3760) {
      if (i_1 < field3763) {
        i_2 -= field3763 - i_1;
        i_1 = field3763;
      }

      if (i_2 + i_1 > field3764) {
        i_2 = field3764 - i_1;
      }

      int i_4 = i_0 + field3761 * i_1;

      for (int i_5 = 0; i_5 < i_2; i_5++) {
        field3766[i_4 + i_5 * field3761] = i_3;
      }

    }
  }

  @ObfuscatedName("dr")
  static void method5752(int i_0, int i_1, int i_2, int i_3, int i_4) {
    if (i_0 >= field3765 && i_0 < field3760) {
      if (i_1 < field3763) {
        i_2 -= field3763 - i_1;
        i_1 = field3763;
      }

      if (i_2 + i_1 > field3764) {
        i_2 = field3764 - i_1;
      }

      int i_5 = 256 - i_4;
      int i_6 = (i_3 >> 16 & 0xff) * i_4;
      int i_7 = (i_3 >> 8 & 0xff) * i_4;
      int i_8 = i_4 * (i_3 & 0xff);
      int i_12 = i_0 + field3761 * i_1;

      for (int i_13 = 0; i_13 < i_2; i_13++) {
        int i_9 = i_5 * (field3766[i_12] >> 16 & 0xff);
        int i_10 = (field3766[i_12] >> 8 & 0xff) * i_5;
        int i_11 = i_5 * (field3766[i_12] & 0xff);
        int i_14 = (i_8 + i_11 >> 8) + (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8);
        field3766[i_12] = i_14;
        i_12 += field3761;
      }

    }
  }

  @ObfuscatedName("dj")
  public static void method5765(int i_0, int i_1, int i_2, int i_3, int i_4) {
    i_2 -= i_0;
    i_3 -= i_1;
    if (i_3 == 0) {
      if (i_2 >= 0) {
        method5736(i_0, i_1, i_2 + 1, i_4);
      } else {
        method5736(i_0 + i_2, i_1, -i_2 + 1, i_4);
      }

    } else if (i_2 == 0) {
      if (i_3 >= 0) {
        method5738(i_0, i_1, i_3 + 1, i_4);
      } else {
        method5738(i_0, i_3 + i_1, -i_3 + 1, i_4);
      }

    } else {
      if (i_3 + i_2 < 0) {
        i_0 += i_2;
        i_2 = -i_2;
        i_1 += i_3;
        i_3 = -i_3;
      }

      int i_5;
      int i_6;
      if (i_2 > i_3) {
        i_1 <<= 16;
        i_1 += 32768;
        i_3 <<= 16;
        i_5 = (int) Math.floor((double) i_3 / (double) i_2 + 0.5D);
        i_2 += i_0;
        if (i_0 < field3765) {
          i_1 += i_5 * (field3765 - i_0);
          i_0 = field3765;
        }

        if (i_2 >= field3760) {
          i_2 = field3760 - 1;
        }

        while (i_0 <= i_2) {
          i_6 = i_1 >> 16;
          if (i_6 >= field3763 && i_6 < field3764) {
            field3766[i_0 + i_6 * field3761] = i_4;
          }

          i_1 += i_5;
          ++i_0;
        }
      } else {
        i_0 <<= 16;
        i_0 += 32768;
        i_2 <<= 16;
        i_5 = (int) Math.floor((double) i_2 / (double) i_3 + 0.5D);
        i_3 += i_1;
        if (i_1 < field3763) {
          i_0 += (field3763 - i_1) * i_5;
          i_1 = field3763;
        }

        if (i_3 >= field3764) {
          i_3 = field3764 - 1;
        }

        while (i_1 <= i_3) {
          i_6 = i_0 >> 16;
          if (i_6 >= field3765 && i_6 < field3760) {
            field3766[i_6 + field3761 * i_1] = i_4;
          }

          i_0 += i_5;
          ++i_1;
        }
      }

    }
  }

  @ObfuscatedName("ew")
  static void method5730(int i_0, int i_1, int i_2) {
    if (i_0 >= field3765 && i_1 >= field3763 && i_0 < field3760 && i_1 < field3764) {
      field3766[i_0 + field3761 * i_1] = i_2;
    }
  }

  @ObfuscatedName("es")
  public static void method5742(int i_0, int i_1, int i_2, int[] ints_3, int[] ints_4) {
    int i_5 = i_0 + field3761 * i_1;

    for (i_1 = 0; i_1 < ints_3.length; i_1++) {
      int i_6 = i_5 + ints_3[i_1];

      for (i_0 = -ints_4[i_1]; i_0 < 0; i_0++) {
        field3766[i_6++] = i_2;
      }

      i_5 += field3761;
    }

  }

}
