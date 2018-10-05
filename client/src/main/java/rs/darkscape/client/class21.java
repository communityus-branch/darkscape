package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public final class class21 {

  @ObfuscatedName("rb")
  @ObfuscatedSignature(
      signature = "Lin;"
  )
  public static class251 field175;
  @ObfuscatedName("cu")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field179;
  @ObfuscatedName("w")
  final int[] field178 = new int[4096];

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;III)[Lly;",
      garbageValue = "-711086556"
  )
  static class317[] method278(AbstractPack class247_0, int i_1, int i_2) {
    return !class306.method5660(class247_0, i_1, i_2) ? null : class49.method950();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;I)V",
      garbageValue = "1802927852"
  )
  public static void method277(AbstractPack class247_0) {
    class272.field3529 = class247_0;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)Lio;",
      garbageValue = "-116299600"
  )
  public static class256 method275(int i_0) {
    class256 class256_1 = (class256) class256.field3257.method3989((long) i_0);
    if (class256_1 != null) {
      return class256_1;
    } else {
      byte[] bytes_2 = class256.field3258.method4625(19, i_0);
      class256_1 = new class256();
      if (bytes_2 != null) {
        class256_1.method4848(new Buffer(bytes_2));
      }

      class256.field3257.method3983(class256_1, (long) i_0);
      return class256_1;
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IIILfw;Lfk;B)Z",
      garbageValue = "96"
  )
  static final boolean method273(int i_0, int i_1, int i_2, class166 class166_3,
                                 class164 class164_4) {
    int i_5 = i_0;
    int i_6 = i_1;
    byte b_7 = 64;
    byte b_8 = 64;
    int i_9 = i_0 - b_7;
    int i_10 = i_1 - b_8;
    class165.field2035[b_7][b_8] = 99;
    class165.field2041[b_7][b_8] = 0;
    byte b_11 = 0;
    int i_12 = 0;
    class165.field2039[b_11] = i_0;
    int i_20 = b_11 + 1;
    class165.field2038[b_11] = i_1;
    int[][] ints_13 = class164_4.field2029;

    while (true) {
      label313:
      while (true) {
        int i_14;
        int i_15;
        int i_16;
        int i_17;
        int i_18;
        int i_19;
        do {
          do {
            do {
              label290:
              do {
                if (i_12 == i_20) {
                  class19.field152 = i_5;
                  class165.field2037 = i_6;
                  return false;
                }

                i_5 = class165.field2039[i_12];
                i_6 = class165.field2038[i_12];
                i_12 = i_12 + 1 & 0xfff;
                i_18 = i_5 - i_9;
                i_19 = i_6 - i_10;
                i_14 = i_5 - class164_4.field2025;
                i_15 = i_6 - class164_4.field2026;
                if (class166_3.vmethod3440(i_2, i_5, i_6, class164_4)) {
                  class19.field152 = i_5;
                  class165.field2037 = i_6;
                  return true;
                }

                i_16 = class165.field2041[i_18][i_19] + 1;
                if (i_18 > 0 && class165.field2035[i_18 - 1][i_19] == 0
                    && (ints_13[i_14 - 1][i_15] & 0x124010e) == 0
                    && (ints_13[i_14 - 1][i_15 + i_2 - 1] & 0x1240138) == 0) {
                  i_17 = 1;

                  while (true) {
                    if (i_17 >= i_2 - 1) {
                      class165.field2039[i_20] = i_5 - 1;
                      class165.field2038[i_20] = i_6;
                      i_20 = i_20 + 1 & 0xfff;
                      class165.field2035[i_18 - 1][i_19] = 2;
                      class165.field2041[i_18 - 1][i_19] = i_16;
                      break;
                    }

                    if ((ints_13[i_14 - 1][i_17 + i_15] & 0x124013e) != 0) {
                      break;
                    }

                    ++i_17;
                  }
                }

                if (i_18 < 128 - i_2 && class165.field2035[i_18 + 1][i_19] == 0
                    && (ints_13[i_14 + i_2][i_15] & 0x1240183) == 0
                    && (ints_13[i_14 + i_2][i_15 + i_2 - 1] & 0x12401e0) == 0) {
                  i_17 = 1;

                  while (true) {
                    if (i_17 >= i_2 - 1) {
                      class165.field2039[i_20] = i_5 + 1;
                      class165.field2038[i_20] = i_6;
                      i_20 = i_20 + 1 & 0xfff;
                      class165.field2035[i_18 + 1][i_19] = 8;
                      class165.field2041[i_18 + 1][i_19] = i_16;
                      break;
                    }

                    if ((ints_13[i_14 + i_2][i_15 + i_17] & 0x12401e3) != 0) {
                      break;
                    }

                    ++i_17;
                  }
                }

                if (i_19 > 0 && class165.field2035[i_18][i_19 - 1] == 0
                    && (ints_13[i_14][i_15 - 1] & 0x124010e) == 0
                    && (ints_13[i_14 + i_2 - 1][i_15 - 1] & 0x1240183) == 0) {
                  i_17 = 1;

                  while (true) {
                    if (i_17 >= i_2 - 1) {
                      class165.field2039[i_20] = i_5;
                      class165.field2038[i_20] = i_6 - 1;
                      i_20 = i_20 + 1 & 0xfff;
                      class165.field2035[i_18][i_19 - 1] = 1;
                      class165.field2041[i_18][i_19 - 1] = i_16;
                      break;
                    }

                    if ((ints_13[i_14 + i_17][i_15 - 1] & 0x124018f) != 0) {
                      break;
                    }

                    ++i_17;
                  }
                }

                if (i_19 < 128 - i_2 && class165.field2035[i_18][i_19 + 1] == 0
                    && (ints_13[i_14][i_15 + i_2] & 0x1240138) == 0
                    && (ints_13[i_14 + i_2 - 1][i_15 + i_2] & 0x12401e0) == 0) {
                  i_17 = 1;

                  while (true) {
                    if (i_17 >= i_2 - 1) {
                      class165.field2039[i_20] = i_5;
                      class165.field2038[i_20] = i_6 + 1;
                      i_20 = i_20 + 1 & 0xfff;
                      class165.field2035[i_18][i_19 + 1] = 4;
                      class165.field2041[i_18][i_19 + 1] = i_16;
                      break;
                    }

                    if ((ints_13[i_17 + i_14][i_15 + i_2] & 0x12401f8) != 0) {
                      break;
                    }

                    ++i_17;
                  }
                }

                if (i_18 > 0 && i_19 > 0 && class165.field2035[i_18 - 1][i_19 - 1] == 0
                    && (ints_13[i_14 - 1][i_15 - 1] & 0x124010e) == 0) {
                  i_17 = 1;

                  while (true) {
                    if (i_17 >= i_2) {
                      class165.field2039[i_20] = i_5 - 1;
                      class165.field2038[i_20] = i_6 - 1;
                      i_20 = i_20 + 1 & 0xfff;
                      class165.field2035[i_18 - 1][i_19 - 1] = 3;
                      class165.field2041[i_18 - 1][i_19 - 1] = i_16;
                      break;
                    }

                    if ((ints_13[i_14 - 1][i_17 + (i_15 - 1)] & 0x124013e) != 0
                        || (ints_13[i_17 + (i_14 - 1)][i_15 - 1] & 0x124018f) != 0) {
                      break;
                    }

                    ++i_17;
                  }
                }

                if (i_18 < 128 - i_2 && i_19 > 0 && class165.field2035[i_18 + 1][i_19 - 1] == 0
                    && (ints_13[i_14 + i_2][i_15 - 1] & 0x1240183) == 0) {
                  i_17 = 1;

                  while (true) {
                    if (i_17 >= i_2) {
                      class165.field2039[i_20] = i_5 + 1;
                      class165.field2038[i_20] = i_6 - 1;
                      i_20 = i_20 + 1 & 0xfff;
                      class165.field2035[i_18 + 1][i_19 - 1] = 9;
                      class165.field2041[i_18 + 1][i_19 - 1] = i_16;
                      break;
                    }

                    if ((ints_13[i_14 + i_2][i_17 + (i_15 - 1)] & 0x12401e3) != 0
                        || (ints_13[i_14 + i_17][i_15 - 1] & 0x124018f) != 0) {
                      break;
                    }

                    ++i_17;
                  }
                }

                if (i_18 > 0 && i_19 < 128 - i_2 && class165.field2035[i_18 - 1][i_19 + 1] == 0
                    && (ints_13[i_14 - 1][i_15 + i_2] & 0x1240138) == 0) {
                  for (i_17 = 1; i_17 < i_2; i_17++) {
                    if ((ints_13[i_14 - 1][i_17 + i_15] & 0x124013e) != 0
                        || (ints_13[i_17 + (i_14 - 1)][i_15 + i_2] & 0x12401f8) != 0) {
                      continue label290;
                    }
                  }

                  class165.field2039[i_20] = i_5 - 1;
                  class165.field2038[i_20] = i_6 + 1;
                  i_20 = i_20 + 1 & 0xfff;
                  class165.field2035[i_18 - 1][i_19 + 1] = 6;
                  class165.field2041[i_18 - 1][i_19 + 1] = i_16;
                }
              } while (i_18 >= 128 - i_2);
            } while (i_19 >= 128 - i_2);
          } while (class165.field2035[i_18 + 1][i_19 + 1] != 0);
        } while ((ints_13[i_14 + i_2][i_15 + i_2] & 0x12401e0) != 0);

        for (i_17 = 1; i_17 < i_2; i_17++) {
          if ((ints_13[i_17 + i_14][i_15 + i_2] & 0x12401f8) != 0
              || (ints_13[i_14 + i_2][i_15 + i_17] & 0x12401e3) != 0) {
            continue label313;
          }
        }

        class165.field2039[i_20] = i_5 + 1;
        class165.field2038[i_20] = i_6 + 1;
        i_20 = i_20 + 1 & 0xfff;
        class165.field2035[i_18 + 1][i_19 + 1] = 12;
        class165.field2041[i_18 + 1][i_19 + 1] = i_16;
      }
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Lll;",
      garbageValue = "1309811201"
  )
  public static class318[] method279(AbstractPack class247_0, String string_1, String string_2) {
    int i_3 = class247_0.method4642(string_1);
    int i_4 = class247_0.method4643(i_3, string_2);
    class318[] arr_5;
    if (!class306.method5660(class247_0, i_3, i_4)) {
      arr_5 = null;
    } else {
      class318[] arr_7 = new class318[SpriteDecoder.frameCount];

      for (int i_8 = 0; i_8 < SpriteDecoder.frameCount; i_8++) {
        class318 class318_9 = arr_7[i_8] = new class318();
        class318_9.field3796 = class305.field3729;
        class318_9.field3792 = SpriteDecoder.field3798;
        class318_9.field3793 = class7.field45[i_8];
        class318_9.field3790 = class225.field2562[i_8];
        class318_9.field3787 = SpriteDecoder.field3800[i_8];
        class318_9.field3788 = SpriteDecoder.field3799[i_8];
        int i_10 = class318_9.field3788 * class318_9.field3787;
        byte[] bytes_11 = SpriteDecoder.colorMaps[i_8];
        class318_9.field3791 = new int[i_10];

        for (int i_12 = 0; i_12 < i_10; i_12++) {
          class318_9.field3791[i_12] = SpriteDecoder.colorPalette[bytes_11[i_12] & 0xff];
        }
      }

      class7.field45 = null;
      class225.field2562 = null;
      SpriteDecoder.field3800 = null;
      SpriteDecoder.field3799 = null;
      SpriteDecoder.colorPalette = null;
      SpriteDecoder.colorMaps = null;
      arr_5 = arr_7;
    }

    return arr_5;
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-1457560196"
  )
  static int method274(int i_0, class84 class84_1, boolean bool_2) {
    class230 class230_3;
    if (i_0 >= 2000) {
      i_0 -= 1000;
      class230_3 = class26.method434(class69.field999[--class69.field1003]);
    } else {
      class230_3 = bool_2 ? class276.field3561 : class260.field3301;
    }

    int i_4;
    if (i_0 == 1300) {
      i_4 = class69.field999[--class69.field1003] - 1;
      if (i_4 >= 0 && i_4 <= 9) {
        class230_3.method4512(i_4, class69.field1001[--class55.field497]);
        return 1;
      } else {
        --class55.field497;
        return 1;
      }
    } else if (i_0 == 1301) {
      class69.field1003 -= 2;
      i_4 = class69.field999[class69.field1003];
      int i_5 = class69.field999[class69.field1003 + 1];
      class230_3.field2666 = class146.method3191(i_4, i_5);
      return 1;
    } else if (i_0 == 1302) {
      class230_3.field2634 = class69.field999[--class69.field1003] == 1;
      return 1;
    } else if (i_0 == 1303) {
      class230_3.field2682 = class69.field999[--class69.field1003];
      return 1;
    } else if (i_0 == 1304) {
      class230_3.field2684 = class69.field999[--class69.field1003];
      return 1;
    } else if (i_0 == 1305) {
      class230_3.field2679 = class69.field1001[--class55.field497];
      return 1;
    } else if (i_0 == 1306) {
      class230_3.field2661 = class69.field1001[--class55.field497];
      return 1;
    } else if (i_0 == 1307) {
      class230_3.field2680 = null;
      return 1;
    } else {
      return 2;
    }
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(IIIIIZI)Lll;",
      garbageValue = "-1686094834"
  )
  public static final class318 method276(int i_0, int i_1, int i_2, int i_3, int i_4,
                                         boolean bool_5) {
    if (i_1 == -1) {
      i_4 = 0;
    } else if (i_4 == 2 && i_1 != 1) {
      i_4 = 1;
    }

    long long_6 = ((long) i_3 << 42) + ((long) i_4 << 40) + ((long) i_2 << 38) + ((long) i_1 << 16)
        + (long) i_0;
    class318 class318_8;
    if (!bool_5) {
      class318_8 = (class318) class269.field3429.method3989(long_6);
      if (class318_8 != null) {
        return class318_8;
      }
    }

    class269 class269_9 = class111.method2563(i_0);
    if (i_1 > 1 && class269_9.field3420 != null) {
      int i_10 = -1;

      for (int i_11 = 0; i_11 < 10; i_11++) {
        if (i_1 >= class269_9.field3459[i_11] && class269_9.field3459[i_11] != 0) {
          i_10 = class269_9.field3420[i_11];
        }
      }

      if (i_10 != -1) {
        class269_9 = class111.method2563(i_10);
      }
    }

    class119 class119_21 = class269_9.method5093(1);
    if (class119_21 == null) {
      return null;
    } else {
      class318 class318_22 = null;
      if (class269_9.field3465 != -1) {
        class318_22 = method276(class269_9.field3464, 10, 1, 0, 0, true);
        if (class318_22 == null) {
          return null;
        }
      } else if (class269_9.field3475 != -1) {
        class318_22 = method276(class269_9.field3473, i_1, i_2, i_3, 0, false);
        if (class318_22 == null) {
          return null;
        }
      } else if (class269_9.field3477 != -1) {
        class318_22 = method276(class269_9.field3476, i_1, 0, 0, 0, false);
        if (class318_22 == null) {
          return null;
        }
      }

      int[] ints_12 = class314.field3766;
      int i_13 = class314.field3761;
      int i_14 = class314.field3762;
      int[] ints_15 = new int[4];
      class314.method5722(ints_15);
      class318_8 = new class318(36, 32);
      class314.method5718(class318_8.field3791, 36, 32);
      class314.method5724();
      class122.method2862();
      class122.method2827(16, 16);
      class122.field1670 = false;
      if (class269_9.field3477 != -1) {
        class318_22.method5851(0, 0);
      }

      int i_16 = class269_9.field3438;
      if (bool_5) {
        i_16 = (int) (1.5D * (double) i_16);
      } else if (i_2 == 2) {
        i_16 = (int) ((double) i_16 * 1.04D);
      }

      int i_17 = i_16 * class122.field1681[class269_9.field3439] >> 16;
      int i_18 = i_16 * class122.field1693[class269_9.field3439] >> 16;
      class119_21.method2670();
      class119_21.method2682(0, class269_9.field3440, class269_9.field3474, class269_9.field3439,
                             class269_9.field3442,
                             class119_21.field1781 / 2 + i_17 + class269_9.field3443,
                             i_18 + class269_9.field3443);
      if (class269_9.field3475 != -1) {
        class318_22.method5851(0, 0);
      }

      if (i_2 >= 1) {
        class318_8.method5847(1);
      }

      if (i_2 >= 2) {
        class318_8.method5847(16777215);
      }

      if (i_3 != 0) {
        class318_8.method5848(i_3);
      }

      class314.method5718(class318_8.field3791, 36, 32);
      if (class269_9.field3465 != -1) {
        class318_22.method5851(0, 0);
      }

      if (i_4 == 1 || i_4 == 2 && class269_9.field3444 == 1) {
        class298 class298_19 = class269.field3466;
        String string_20;
        if (i_1 < 100000) {
          string_20 = "<col=ffff00>" + i_1 + "</col>";
        } else if (i_1 < 10000000) {
          string_20 = "<col=ffffff>" + i_1 / 1000 + "K" + "</col>";
        } else {
          string_20 = "<col=00ff80>" + i_1 / 1000000 + "M" + "</col>";
        }

        class298_19.method5522(string_20, 0, 9, 16776960, 1);
      }

      if (!bool_5) {
        class269.field3429.method3983(class318_8, long_6);
      }

      class314.method5718(ints_12, i_13, i_14);
      class314.method5723(ints_15);
      class122.method2862();
      class122.field1670 = true;
      return class318_8;
    }
  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1994445247"
  )
  static final void method271(String string_0) {
    StringBuilder stringbuilder_10000 = (new StringBuilder()).append(string_0);
    Object obj_10001 = null;
    String string_1 = stringbuilder_10000.append(" is already on your ignore list").toString();
    class143.method3172(30, "", string_1);
  }

  @ObfuscatedName("jo")
  @ObfuscatedSignature(
      signature = "(Lhi;I)Lhi;",
      garbageValue = "-1594952261"
  )
  static class230 method264(class230 class230_0) {
    class230 class230_2 = class230_0;
    int i_3 = IssacRandom.method3865(class24.method425(class230_0));
    class230 class230_1;
    if (i_3 == 0) {
      class230_1 = null;
    } else {
      int i_4 = 0;

      while (true) {
        if (i_4 >= i_3) {
          class230_1 = class230_2;
          break;
        }

        class230_2 = class26.method434(class230_2.field2605);
        if (class230_2 == null) {
          class230_1 = null;
          break;
        }

        ++i_4;
      }
    }

    class230 class230_5 = class230_1;
    if (class230_1 == null) {
      class230_5 = class230_0.field2666;
    }

    return class230_5;
  }

  @ObfuscatedName("jy")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1316208853"
  )
  static final void method270(int i_0) {
    if (class261.method4931(i_0)) {
      class245.method4620(class42.field366[i_0], -1);
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lan;B)V",
      garbageValue = "-31"
  )
  final void method265(class32 class32_1) {
    for (int i_2 = 0; i_2 < 64; i_2++) {
      for (int i_3 = 0; i_3 < 64; i_3++) {
        this.field178[i_2 * 64 + i_3] = class32_1.method547(i_2, i_3) | ~0xffffff;
      }
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "9"
  )
  final int method272(int i_1, int i_2) {
    return this.field178[i_1 * 64 + i_2];
  }

}
