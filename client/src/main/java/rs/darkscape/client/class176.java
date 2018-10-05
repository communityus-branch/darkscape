package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public final class class176 {

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "Lfb;"
  )
  static class181 field2280 = new class181();

  @ObfuscatedName("z")
  public static int method3489(byte[] bytes_0, int i_1, byte[] bytes_2, int i_3, int i_4) {
    class181 class181_5 = field2280;
    synchronized (field2280) {
      field2280.field2294 = bytes_2;
      field2280.field2326 = i_4;
      field2280.field2305 = bytes_0;
      field2280.field2313 = 0;
      field2280.field2310 = i_1;
      field2280.field2316 = 0;
      field2280.field2309 = 0;
      field2280.field2302 = 0;
      field2280.field2295 = 0;
      method3491(field2280);
      i_1 -= field2280.field2310;
      field2280.field2294 = null;
      field2280.field2305 = null;
      return i_1;
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lfb;)V"
  )
  static void method3500(class181 class181_0) {
    byte b_2 = class181_0.field2307;
    int i_3 = class181_0.field2308;
    int i_4 = class181_0.field2325;
    int i_5 = class181_0.field2314;
    int[] ints_6 = class25.field215;
    int i_7 = class181_0.field2304;
    byte[] bytes_8 = class181_0.field2305;
    int i_9 = class181_0.field2313;
    int i_10 = class181_0.field2310;
    int i_12 = class181_0.field2331 + 1;

    label65:
    while (true) {
      if (i_3 > 0) {
        while (true) {
          if (i_10 == 0) {
            break label65;
          }

          if (i_3 == 1) {
            if (i_10 == 0) {
              i_3 = 1;
              break label65;
            }

            bytes_8[i_9] = b_2;
            ++i_9;
            --i_10;
            break;
          }

          bytes_8[i_9] = b_2;
          --i_3;
          ++i_9;
          --i_10;
        }
      }

      boolean bool_14 = true;

      byte b_1;
      while (bool_14) {
        bool_14 = false;
        if (i_4 == i_12) {
          i_3 = 0;
          break label65;
        }

        b_2 = (byte) i_5;
        i_7 = ints_6[i_7];
        b_1 = (byte) (i_7 & 0xff);
        i_7 >>= 8;
        ++i_4;
        if (b_1 != i_5) {
          i_5 = b_1;
          if (i_10 == 0) {
            i_3 = 1;
            break label65;
          }

          bytes_8[i_9] = b_2;
          ++i_9;
          --i_10;
          bool_14 = true;
        } else if (i_4 == i_12) {
          if (i_10 == 0) {
            i_3 = 1;
            break label65;
          }

          bytes_8[i_9] = b_2;
          ++i_9;
          --i_10;
          bool_14 = true;
        }
      }

      i_3 = 2;
      i_7 = ints_6[i_7];
      b_1 = (byte) (i_7 & 0xff);
      i_7 >>= 8;
      ++i_4;
      if (i_4 != i_12) {
        if (b_1 != i_5) {
          i_5 = b_1;
        } else {
          i_3 = 3;
          i_7 = ints_6[i_7];
          b_1 = (byte) (i_7 & 0xff);
          i_7 >>= 8;
          ++i_4;
          if (i_4 != i_12) {
            if (b_1 != i_5) {
              i_5 = b_1;
            } else {
              i_7 = ints_6[i_7];
              b_1 = (byte) (i_7 & 0xff);
              i_7 >>= 8;
              ++i_4;
              i_3 = (b_1 & 0xff) + 4;
              i_7 = ints_6[i_7];
              i_5 = (byte) (i_7 & 0xff);
              i_7 >>= 8;
              ++i_4;
            }
          }
        }
      }
    }

    int i_13 = class181_0.field2295;
    class181_0.field2295 += i_10 - i_10;
    if (class181_0.field2295 < i_13) {
    }

    class181_0.field2307 = b_2;
    class181_0.field2308 = i_3;
    class181_0.field2325 = i_4;
    class181_0.field2314 = i_5;
    class25.field215 = ints_6;
    class181_0.field2304 = i_7;
    class181_0.field2305 = bytes_8;
    class181_0.field2313 = i_9;
    class181_0.field2310 = i_10;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lfb;)V"
  )
  static void method3491(class181 class181_0) {
    boolean bool_4 = false;
    boolean bool_5 = false;
    boolean bool_6 = false;
    boolean bool_7 = false;
    boolean bool_8 = false;
    boolean bool_9 = false;
    boolean bool_10 = false;
    boolean bool_11 = false;
    boolean bool_12 = false;
    boolean bool_13 = false;
    boolean bool_14 = false;
    boolean bool_15 = false;
    boolean bool_16 = false;
    boolean bool_17 = false;
    boolean bool_18 = false;
    boolean bool_19 = false;
    boolean bool_20 = false;
    boolean bool_21 = false;
    int i_22 = 0;
    int[] ints_23 = null;
    int[] ints_24 = null;
    int[] ints_25 = null;
    class181_0.field2311 = 1;
    if (class25.field215 == null) {
      class25.field215 = new int[class181_0.field2311 * 100000];
    }

    boolean bool_26 = true;

    while (true) {
      while (bool_26) {
        byte b_1 = method3492(class181_0);
        if (b_1 == 23) {
          return;
        }

        b_1 = method3492(class181_0);
        b_1 = method3492(class181_0);
        b_1 = method3492(class181_0);
        b_1 = method3492(class181_0);
        b_1 = method3492(class181_0);
        b_1 = method3492(class181_0);
        b_1 = method3492(class181_0);
        b_1 = method3492(class181_0);
        b_1 = method3492(class181_0);
        b_1 = method3493(class181_0);
        if (b_1 != 0) {
        }

        class181_0.field2312 = 0;
        b_1 = method3492(class181_0);
        class181_0.field2312 = class181_0.field2312 << 8 | b_1 & 0xff;
        b_1 = method3492(class181_0);
        class181_0.field2312 = class181_0.field2312 << 8 | b_1 & 0xff;
        b_1 = method3492(class181_0);
        class181_0.field2312 = class181_0.field2312 << 8 | b_1 & 0xff;

        int i_36;
        for (i_36 = 0; i_36 < 16; i_36++) {
          b_1 = method3493(class181_0);
          if (b_1 == 1) {
            class181_0.field2296[i_36] = true;
          } else {
            class181_0.field2296[i_36] = false;
          }
        }

        for (i_36 = 0; i_36 < 256; i_36++) {
          class181_0.field2319[i_36] = false;
        }

        int i_37;
        for (i_36 = 0; i_36 < 16; i_36++) {
          if (class181_0.field2296[i_36]) {
            for (i_37 = 0; i_37 < 16; i_37++) {
              b_1 = method3493(class181_0);
              if (b_1 == 1) {
                class181_0.field2319[i_37 + i_36 * 16] = true;
              }
            }
          }
        }

        method3494(class181_0);
        int i_39 = class181_0.field2318 + 2;
        int i_40 = method3490(3, class181_0);
        int i_41 = method3490(15, class181_0);

        for (i_36 = 0; i_36 < i_41; i_36++) {
          i_37 = 0;

          while (true) {
            b_1 = method3493(class181_0);
            if (b_1 == 0) {
              class181_0.field2328[i_36] = (byte) i_37;
              break;
            }

            ++i_37;
          }
        }

        byte[] bytes_27 = new byte[6];

        byte b_29;
        for (b_29 = 0; b_29 < i_40; bytes_27[b_29] = b_29++) {
        }

        for (i_36 = 0; i_36 < i_41; i_36++) {
          b_29 = class181_0.field2328[i_36];

          byte b_28;
          for (b_28 = bytes_27[b_29]; b_29 > 0; --b_29) {
            bytes_27[b_29] = bytes_27[b_29 - 1];
          }

          bytes_27[0] = b_28;
          class181_0.field2324[i_36] = b_28;
        }

        int i_38;
        for (i_38 = 0; i_38 < i_40; i_38++) {
          int i_50 = method3490(5, class181_0);

          for (i_36 = 0; i_36 < i_39; i_36++) {
            while (true) {
              b_1 = method3493(class181_0);
              if (b_1 == 0) {
                class181_0.field2303[i_38][i_36] = (byte) i_50;
                break;
              }

              b_1 = method3493(class181_0);
              if (b_1 == 0) {
                ++i_50;
              } else {
                --i_50;
              }
            }
          }
        }

        for (i_38 = 0; i_38 < i_40; i_38++) {
          byte b_2 = 32;
          byte b_3 = 0;

          for (i_36 = 0; i_36 < i_39; i_36++) {
            if (class181_0.field2303[i_38][i_36] > b_3) {
              b_3 = class181_0.field2303[i_38][i_36];
            }

            if (class181_0.field2303[i_38][i_36] < b_2) {
              b_2 = class181_0.field2303[i_38][i_36];
            }
          }

          method3495(class181_0.field2301[i_38], class181_0.field2297[i_38],
                     class181_0.field2329[i_38], class181_0.field2303[i_38], b_2, b_3, i_39);
          class181_0.field2330[i_38] = b_2;
        }

        int i_42 = class181_0.field2318 + 1;
        int i_43 = -1;
        byte b_44 = 0;

        for (i_36 = 0; i_36 <= 255; i_36++) {
          class181_0.field2315[i_36] = 0;
        }

        int i_56 = 4095;

        int i_35;
        int i_55;
        for (i_35 = 15; i_35 >= 0; --i_35) {
          for (i_55 = 15; i_55 >= 0; --i_55) {
            class181_0.field2322[i_56] = (byte) (i_55 + i_35 * 16);
            --i_56;
          }

          class181_0.field2323[i_35] = i_56 + 1;
        }

        int i_47 = 0;
        byte b_54;
        if (b_44 == 0) {
          ++i_43;
          b_44 = 50;
          b_54 = class181_0.field2324[i_43];
          i_22 = class181_0.field2330[b_54];
          ints_23 = class181_0.field2301[b_54];
          ints_25 = class181_0.field2329[b_54];
          ints_24 = class181_0.field2297[b_54];
        }

        int i_45 = b_44 - 1;
        int i_51 = i_22;

        int i_52;
        byte b_53;
        for (i_52 = method3490(i_22, class181_0); i_52 > ints_23[i_51]; i_52 = i_52 << 1 | b_53) {
          ++i_51;
          b_53 = method3493(class181_0);
        }

        int i_46 = ints_25[i_52 - ints_24[i_51]];

        while (true) {
          while (i_46 != i_42) {
            if (i_46 != 0 && i_46 != 1) {
              int i_33 = i_46 - 1;
              int i_30;
              if (i_33 < 16) {
                i_30 = class181_0.field2323[0];

                for (b_1 = class181_0.field2322[i_30 + i_33]; i_33 > 3; i_33 -= 4) {
                  int i_34 = i_30 + i_33;
                  class181_0.field2322[i_34] = class181_0.field2322[i_34 - 1];
                  class181_0.field2322[i_34 - 1] = class181_0.field2322[i_34 - 2];
                  class181_0.field2322[i_34 - 2] = class181_0.field2322[i_34 - 3];
                  class181_0.field2322[i_34 - 3] = class181_0.field2322[i_34 - 4];
                }

                while (i_33 > 0) {
                  class181_0.field2322[i_30 + i_33] = class181_0.field2322[i_30 + i_33 - 1];
                  --i_33;
                }

                class181_0.field2322[i_30] = b_1;
              } else {
                int i_31 = i_33 / 16;
                int i_32 = i_33 % 16;
                i_30 = class181_0.field2323[i_31] + i_32;

                for (b_1 = class181_0.field2322[i_30]; i_30 > class181_0.field2323[i_31]; --i_30) {
                  class181_0.field2322[i_30] = class181_0.field2322[i_30 - 1];
                }

                ++class181_0.field2323[i_31];

                while (i_31 > 0) {
                  --class181_0.field2323[i_31];
                  class181_0.field2322[class181_0.field2323[i_31]] = class181_0.field2322[
                      class181_0.field2323[i_31 - 1] + 16 - 1];
                  --i_31;
                }

                --class181_0.field2323[0];
                class181_0.field2322[class181_0.field2323[0]] = b_1;
                if (class181_0.field2323[0] == 0) {
                  i_56 = 4095;

                  for (i_35 = 15; i_35 >= 0; --i_35) {
                    for (i_55 = 15; i_55 >= 0; --i_55) {
                      class181_0.field2322[i_56] = class181_0.field2322[class181_0.field2323[i_35]
                          + i_55];
                      --i_56;
                    }

                    class181_0.field2323[i_35] = i_56 + 1;
                  }
                }
              }

              ++class181_0.field2315[class181_0.field2321[b_1 & 0xff] & 0xff];
              class25.field215[i_47] = class181_0.field2321[b_1 & 0xff] & 0xff;
              ++i_47;
              if (i_45 == 0) {
                ++i_43;
                i_45 = 50;
                b_54 = class181_0.field2324[i_43];
                i_22 = class181_0.field2330[b_54];
                ints_23 = class181_0.field2301[b_54];
                ints_25 = class181_0.field2329[b_54];
                ints_24 = class181_0.field2297[b_54];
              }

              --i_45;
              i_51 = i_22;

              for (i_52 = method3490(i_22, class181_0); i_52 > ints_23[i_51];
                  i_52 = i_52 << 1 | b_53) {
                ++i_51;
                b_53 = method3493(class181_0);
              }

              i_46 = ints_25[i_52 - ints_24[i_51]];
            } else {
              int i_48 = -1;
              int i_49 = 1;

              do {
                if (i_46 == 0) {
                  i_48 += i_49;
                } else if (i_46 == 1) {
                  i_48 += i_49 * 2;
                }

                i_49 *= 2;
                if (i_45 == 0) {
                  ++i_43;
                  i_45 = 50;
                  b_54 = class181_0.field2324[i_43];
                  i_22 = class181_0.field2330[b_54];
                  ints_23 = class181_0.field2301[b_54];
                  ints_25 = class181_0.field2329[b_54];
                  ints_24 = class181_0.field2297[b_54];
                }

                --i_45;
                i_51 = i_22;

                for (i_52 = method3490(i_22, class181_0); i_52 > ints_23[i_51];
                    i_52 = i_52 << 1 | b_53) {
                  ++i_51;
                  b_53 = method3493(class181_0);
                }

                i_46 = ints_25[i_52 - ints_24[i_51]];
              } while (i_46 == 0 || i_46 == 1);

              ++i_48;
              b_1 = class181_0.field2321[class181_0.field2322[class181_0.field2323[0]] & 0xff];

              for (class181_0.field2315[b_1 & 0xff] += i_48; i_48 > 0; --i_48) {
                class25.field215[i_47] = b_1 & 0xff;
                ++i_47;
              }
            }
          }

          class181_0.field2308 = 0;
          class181_0.field2307 = 0;
          class181_0.field2317[0] = 0;

          for (i_36 = 1; i_36 <= 256; i_36++) {
            class181_0.field2317[i_36] = class181_0.field2315[i_36 - 1];
          }

          for (i_36 = 1; i_36 <= 256; i_36++) {
            class181_0.field2317[i_36] += class181_0.field2317[i_36 - 1];
          }

          for (i_36 = 0; i_36 < i_47; i_36++) {
            b_1 = (byte) (class25.field215[i_36] & 0xff);
            class25.field215[class181_0.field2317[b_1 & 0xff]] |= i_36 << 8;
            ++class181_0.field2317[b_1 & 0xff];
          }

          class181_0.field2304 = class25.field215[class181_0.field2312] >> 8;
          class181_0.field2325 = 0;
          class181_0.field2304 = class25.field215[class181_0.field2304];
          class181_0.field2314 = (byte) (class181_0.field2304 & 0xff);
          class181_0.field2304 >>= 8;
          ++class181_0.field2325;
          class181_0.field2331 = i_47;
          method3500(class181_0);
          if (class181_0.field2331 + 1 == class181_0.field2325 && class181_0.field2308 == 0) {
            bool_26 = true;
            break;
          }

          bool_26 = false;
          break;
        }
      }

      return;
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lfb;)B"
  )
  static byte method3492(class181 class181_0) {
    return (byte) method3490(8, class181_0);
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lfb;)B"
  )
  static byte method3493(class181 class181_0) {
    return (byte) method3490(1, class181_0);
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(ILfb;)I"
  )
  static int method3490(int i_0, class181 class181_1) {
    while (class181_1.field2316 < i_0) {
      class181_1.field2309 =
          class181_1.field2309 << 8 | class181_1.field2294[class181_1.field2326] & 0xff;
      class181_1.field2316 += 8;
      ++class181_1.field2326;
      ++class181_1.field2302;
      if (class181_1.field2302 == 0) {
      }
    }

    int i_3 = class181_1.field2309 >> class181_1.field2316 - i_0 & (1 << i_0) - 1;
    class181_1.field2316 -= i_0;
    return i_3;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(Lfb;)V"
  )
  static void method3494(class181 class181_0) {
    class181_0.field2318 = 0;

    for (int i_1 = 0; i_1 < 256; i_1++) {
      if (class181_0.field2319[i_1]) {
        class181_0.field2321[class181_0.field2318] = (byte) i_1;
        ++class181_0.field2318;
      }
    }

  }

  @ObfuscatedName("x")
  static void method3495(int[] ints_0, int[] ints_1, int[] ints_2, byte[] bytes_3, int i_4, int i_5,
                         int i_6) {
    int i_7 = 0;

    int i_8;
    for (i_8 = i_4; i_8 <= i_5; i_8++) {
      for (int i_9 = 0; i_9 < i_6; i_9++) {
        if (i_8 == bytes_3[i_9]) {
          ints_2[i_7] = i_9;
          ++i_7;
        }
      }
    }

    for (i_8 = 0; i_8 < 23; i_8++) {
      ints_1[i_8] = 0;
    }

    for (i_8 = 0; i_8 < i_6; i_8++) {
      ++ints_1[bytes_3[i_8] + 1];
    }

    for (i_8 = 1; i_8 < 23; i_8++) {
      ints_1[i_8] += ints_1[i_8 - 1];
    }

    for (i_8 = 0; i_8 < 23; i_8++) {
      ints_0[i_8] = 0;
    }

    int i_10 = 0;

    for (i_8 = i_4; i_8 <= i_5; i_8++) {
      i_10 += ints_1[i_8 + 1] - ints_1[i_8];
      ints_0[i_8] = i_10 - 1;
      i_10 <<= 1;
    }

    for (i_8 = i_4 + 1; i_8 <= i_5; i_8++) {
      ints_1[i_8] = (ints_0[i_8 - 1] + 1 << 1) - ints_1[i_8];
    }

  }

}
