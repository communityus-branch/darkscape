package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class171 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lfl;"
  )
  public static final class171 field2249 = new class171(5);
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lfl;"
  )
  public static final class171 field2242 = new class171(3);
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lfl;"
  )
  public static final class171 field2244 = new class171(7);
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lfl;"
  )
  public static final class171 field2243 = new class171(4);
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lfl;"
  )
  public static final class171 field2245 = new class171(14);
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lfl;"
  )
  public static final class171 field2246 = new class171(15);
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Lfl;"
  )
  public static final class171 field2241 = new class171(6);
  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "Lfl;"
  )
  public static final class171 field2248 = new class171(4);
  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "Lfl;"
  )
  public static final class171 field2247 = new class171(2);
  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "Lfl;"
  )
  public static final class171 field2250 = new class171(5);
  @ObfuscatedName("fr")
  static byte[][] field2252;

  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "5"
  )
  class171(int i_1) {
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(IIIIIILdm;Lfk;I)V",
      garbageValue = "1712806345"
  )
  static final void method3450(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5,
                               class125 class125_6, class164 class164_7) {
    if (!client.field585 || (class50.field443[0][i_1][i_2] & 0x2) != 0
        || (class50.field443[i_0][i_1][i_2] & 0x10) == 0) {
      if (i_0 < class50.field442) {
        class50.field442 = i_0;
      }

      class268 class268_8 = SeekableFile.method2527(i_3);
      int i_9;
      int i_10;
      if (i_4 != 1 && i_4 != 3) {
        i_9 = class268_8.field3384;
        i_10 = class268_8.field3385;
      } else {
        i_9 = class268_8.field3385;
        i_10 = class268_8.field3384;
      }

      int i_11;
      int i_12;
      if (i_9 + i_1 <= 104) {
        i_11 = (i_9 >> 1) + i_1;
        i_12 = (i_9 + 1 >> 1) + i_1;
      } else {
        i_11 = i_1;
        i_12 = i_1 + 1;
      }

      int i_13;
      int i_14;
      if (i_10 + i_2 <= 104) {
        i_13 = (i_10 >> 1) + i_2;
        i_14 = i_2 + (i_10 + 1 >> 1);
      } else {
        i_13 = i_2;
        i_14 = i_2 + 1;
      }

      int[][] ints_15 = class50.field459[i_0];
      int i_16 =
          ints_15[i_11][i_13] + ints_15[i_12][i_13] + ints_15[i_11][i_14] + ints_15[i_12][i_14]
              >> 2;
      int i_17 = (i_1 << 7) + (i_9 << 6);
      int i_18 = (i_2 << 7) + (i_10 << 6);
      long long_19 = class76.method1804(i_1, i_2, 2, class268_8.field3388 == 0, i_3);
      int i_21 = i_5 + (i_4 << 6);
      if (class268_8.field3409 == 1) {
        i_21 += 256;
      }

      if (class268_8.method5024()) {
        class181.method3528(i_0, i_1, i_2, class268_8, i_4);
      }

      Object obj_22;
      if (i_5 == 22) {
        if (!client.field585 || class268_8.field3388 != 0 || class268_8.field3386 == 1
            || class268_8.field3407) {
          if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
            obj_22 = class268_8.method5079(22, i_4, ints_15, i_17, i_16, i_18);
          } else {
            obj_22 = new class85(i_3, 22, i_4, i_0, i_1, i_2, class268_8.field3372, true,
                                 (class127) null);
          }

          class125_6.method3009(i_0, i_1, i_2, i_16, (class127) obj_22, long_19, i_21);
          if (class268_8.field3386 == 1 && class164_7 != null) {
            class164_7.method3410(i_1, i_2);
          }

        }
      } else {
        int i_23;
        if (i_5 != 10 && i_5 != 11) {
          if (i_5 >= 12) {
            if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
              obj_22 = class268_8.method5079(i_5, i_4, ints_15, i_17, i_16, i_18);
            } else {
              obj_22 = new class85(i_3, i_5, i_4, i_0, i_1, i_2, class268_8.field3372, true,
                                   (class127) null);
            }

            class125_6.method2882(i_0, i_1, i_2, i_16, 1, 1, (class127) obj_22, 0, long_19, i_21);
            if (i_5 >= 12 && i_5 <= 17 && i_5 != 13 && i_0 > 0) {
              class37.field325[i_0][i_1][i_2] |= 0x924;
            }

            if (class268_8.field3386 != 0 && class164_7 != null) {
              class164_7.method3394(i_1, i_2, i_9, i_10, class268_8.field3404);
            }

          } else if (i_5 == 0) {
            if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
              obj_22 = class268_8.method5079(0, i_4, ints_15, i_17, i_16, i_18);
            } else {
              obj_22 = new class85(i_3, 0, i_4, i_0, i_1, i_2, class268_8.field3372, true,
                                   (class127) null);
            }

            class125_6.method2927(i_0, i_1, i_2, i_16, (class127) obj_22, (class127) null,
                                  class50.field450[i_4], 0, long_19, i_21);
            if (i_4 == 0) {
              if (class268_8.field3400) {
                class50.field447[i_0][i_1][i_2] = 50;
                class50.field447[i_0][i_1][i_2 + 1] = 50;
              }

              if (class268_8.field3383) {
                class37.field325[i_0][i_1][i_2] |= 0x249;
              }
            } else if (i_4 == 1) {
              if (class268_8.field3400) {
                class50.field447[i_0][i_1][i_2 + 1] = 50;
                class50.field447[i_0][i_1 + 1][i_2 + 1] = 50;
              }

              if (class268_8.field3383) {
                class37.field325[i_0][i_1][i_2 + 1] |= 0x492;
              }
            } else if (i_4 == 2) {
              if (class268_8.field3400) {
                class50.field447[i_0][i_1 + 1][i_2] = 50;
                class50.field447[i_0][i_1 + 1][i_2 + 1] = 50;
              }

              if (class268_8.field3383) {
                class37.field325[i_0][i_1 + 1][i_2] |= 0x249;
              }
            } else if (i_4 == 3) {
              if (class268_8.field3400) {
                class50.field447[i_0][i_1][i_2] = 50;
                class50.field447[i_0][i_1 + 1][i_2] = 50;
              }

              if (class268_8.field3383) {
                class37.field325[i_0][i_1][i_2] |= 0x492;
              }
            }

            if (class268_8.field3386 != 0 && class164_7 != null) {
              class164_7.method3393(i_1, i_2, i_5, i_4, class268_8.field3404);
            }

            if (class268_8.field3379 != 16) {
              class125_6.method3053(i_0, i_1, i_2, class268_8.field3379);
            }

          } else if (i_5 == 1) {
            if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
              obj_22 = class268_8.method5079(1, i_4, ints_15, i_17, i_16, i_18);
            } else {
              obj_22 = new class85(i_3, 1, i_4, i_0, i_1, i_2, class268_8.field3372, true,
                                   (class127) null);
            }

            class125_6.method2927(i_0, i_1, i_2, i_16, (class127) obj_22, (class127) null,
                                  class50.field451[i_4], 0, long_19, i_21);
            if (class268_8.field3400) {
              if (i_4 == 0) {
                class50.field447[i_0][i_1][i_2 + 1] = 50;
              } else if (i_4 == 1) {
                class50.field447[i_0][i_1 + 1][i_2 + 1] = 50;
              } else if (i_4 == 2) {
                class50.field447[i_0][i_1 + 1][i_2] = 50;
              } else if (i_4 == 3) {
                class50.field447[i_0][i_1][i_2] = 50;
              }
            }

            if (class268_8.field3386 != 0 && class164_7 != null) {
              class164_7.method3393(i_1, i_2, i_5, i_4, class268_8.field3404);
            }

          } else {
            int i_28;
            if (i_5 == 2) {
              i_28 = i_4 + 1 & 0x3;
              Object obj_29;
              Object obj_30;
              if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
                obj_29 = class268_8.method5079(2, i_4 + 4, ints_15, i_17, i_16, i_18);
                obj_30 = class268_8.method5079(2, i_28, ints_15, i_17, i_16, i_18);
              } else {
                obj_29 = new class85(i_3, 2, i_4 + 4, i_0, i_1, i_2, class268_8.field3372, true,
                                     (class127) null);
                obj_30 = new class85(i_3, 2, i_28, i_0, i_1, i_2, class268_8.field3372, true,
                                     (class127) null);
              }

              class125_6.method2927(i_0, i_1, i_2, i_16, (class127) obj_29, (class127) obj_30,
                                    class50.field450[i_4], class50.field450[i_28], long_19, i_21);
              if (class268_8.field3383) {
                if (i_4 == 0) {
                  class37.field325[i_0][i_1][i_2] |= 0x249;
                  class37.field325[i_0][i_1][1 + i_2] |= 0x492;
                } else if (i_4 == 1) {
                  class37.field325[i_0][i_1][1 + i_2] |= 0x492;
                  class37.field325[i_0][i_1 + 1][i_2] |= 0x249;
                } else if (i_4 == 2) {
                  class37.field325[i_0][i_1 + 1][i_2] |= 0x249;
                  class37.field325[i_0][i_1][i_2] |= 0x492;
                } else if (i_4 == 3) {
                  class37.field325[i_0][i_1][i_2] |= 0x492;
                  class37.field325[i_0][i_1][i_2] |= 0x249;
                }
              }

              if (class268_8.field3386 != 0 && class164_7 != null) {
                class164_7.method3393(i_1, i_2, i_5, i_4, class268_8.field3404);
              }

              if (class268_8.field3379 != 16) {
                class125_6.method3053(i_0, i_1, i_2, class268_8.field3379);
              }

            } else if (i_5 == 3) {
              if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
                obj_22 = class268_8.method5079(3, i_4, ints_15, i_17, i_16, i_18);
              } else {
                obj_22 = new class85(i_3, 3, i_4, i_0, i_1, i_2, class268_8.field3372, true,
                                     (class127) null);
              }

              class125_6.method2927(i_0, i_1, i_2, i_16, (class127) obj_22, (class127) null,
                                    class50.field451[i_4], 0, long_19, i_21);
              if (class268_8.field3400) {
                if (i_4 == 0) {
                  class50.field447[i_0][i_1][i_2 + 1] = 50;
                } else if (i_4 == 1) {
                  class50.field447[i_0][i_1 + 1][i_2 + 1] = 50;
                } else if (i_4 == 2) {
                  class50.field447[i_0][i_1 + 1][i_2] = 50;
                } else if (i_4 == 3) {
                  class50.field447[i_0][i_1][i_2] = 50;
                }
              }

              if (class268_8.field3386 != 0 && class164_7 != null) {
                class164_7.method3393(i_1, i_2, i_5, i_4, class268_8.field3404);
              }

            } else if (i_5 == 9) {
              if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
                obj_22 = class268_8.method5079(i_5, i_4, ints_15, i_17, i_16, i_18);
              } else {
                obj_22 = new class85(i_3, i_5, i_4, i_0, i_1, i_2, class268_8.field3372, true,
                                     (class127) null);
              }

              class125_6.method2882(i_0, i_1, i_2, i_16, 1, 1, (class127) obj_22, 0, long_19, i_21);
              if (class268_8.field3386 != 0 && class164_7 != null) {
                class164_7.method3394(i_1, i_2, i_9, i_10, class268_8.field3404);
              }

              if (class268_8.field3379 != 16) {
                class125_6.method3053(i_0, i_1, i_2, class268_8.field3379);
              }

            } else if (i_5 == 4) {
              if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
                obj_22 = class268_8.method5079(4, i_4, ints_15, i_17, i_16, i_18);
              } else {
                obj_22 = new class85(i_3, 4, i_4, i_0, i_1, i_2, class268_8.field3372, true,
                                     (class127) null);
              }

              class125_6.method2881(i_0, i_1, i_2, i_16, (class127) obj_22, (class127) null,
                                    class50.field450[i_4], 0, 0, 0, long_19, i_21);
            } else {
              long long_31;
              Object obj_33;
              if (i_5 == 5) {
                i_28 = 16;
                long_31 = class125_6.method2898(i_0, i_1, i_2);
                if (long_31 != 0L) {
                  i_28 = SeekableFile.method2527(Keyboard.method673(long_31)).field3379;
                }

                if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
                  obj_33 = class268_8.method5079(4, i_4, ints_15, i_17, i_16, i_18);
                } else {
                  obj_33 = new class85(i_3, 4, i_4, i_0, i_1, i_2, class268_8.field3372, true,
                                       (class127) null);
                }

                class125_6.method2881(i_0, i_1, i_2, i_16, (class127) obj_33, (class127) null,
                                      class50.field450[i_4], 0, i_28 * class50.field452[i_4],
                                      i_28 * class50.field453[i_4], long_19, i_21);
              } else if (i_5 == 6) {
                i_28 = 8;
                long_31 = class125_6.method2898(i_0, i_1, i_2);
                if (long_31 != 0L) {
                  i_28 = SeekableFile.method2527(Keyboard.method673(long_31)).field3379 / 2;
                }

                if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
                  obj_33 = class268_8.method5079(4, i_4 + 4, ints_15, i_17, i_16, i_18);
                } else {
                  obj_33 = new class85(i_3, 4, i_4 + 4, i_0, i_1, i_2, class268_8.field3372, true,
                                       (class127) null);
                }

                class125_6
                    .method2881(i_0, i_1, i_2, i_16, (class127) obj_33, (class127) null, 256, i_4,
                                i_28 * class50.field458[i_4], i_28 * class50.field449[i_4], long_19,
                                i_21);
              } else if (i_5 == 7) {
                i_23 = i_4 + 2 & 0x3;
                if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
                  obj_22 = class268_8.method5079(4, i_23 + 4, ints_15, i_17, i_16, i_18);
                } else {
                  obj_22 = new class85(i_3, 4, i_23 + 4, i_0, i_1, i_2, class268_8.field3372, true,
                                       (class127) null);
                }

                class125_6
                    .method2881(i_0, i_1, i_2, i_16, (class127) obj_22, (class127) null, 256, i_23,
                                0, 0, long_19, i_21);
              } else if (i_5 == 8) {
                i_28 = 8;
                long_31 = class125_6.method2898(i_0, i_1, i_2);
                if (long_31 != 0L) {
                  i_28 = SeekableFile.method2527(Keyboard.method673(long_31)).field3379 / 2;
                }

                int i_27 = i_4 + 2 & 0x3;
                Object obj_26;
                if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
                  obj_33 = class268_8.method5079(4, i_4 + 4, ints_15, i_17, i_16, i_18);
                  obj_26 = class268_8.method5079(4, i_27 + 4, ints_15, i_17, i_16, i_18);
                } else {
                  obj_33 = new class85(i_3, 4, i_4 + 4, i_0, i_1, i_2, class268_8.field3372, true,
                                       (class127) null);
                  obj_26 = new class85(i_3, 4, i_27 + 4, i_0, i_1, i_2, class268_8.field3372, true,
                                       (class127) null);
                }

                class125_6
                    .method2881(i_0, i_1, i_2, i_16, (class127) obj_33, (class127) obj_26, 256, i_4,
                                i_28 * class50.field458[i_4], i_28 * class50.field449[i_4], long_19,
                                i_21);
              }
            }
          }
        } else {
          if (class268_8.field3372 == -1 && class268_8.field3410 == null) {
            obj_22 = class268_8.method5079(10, i_4, ints_15, i_17, i_16, i_18);
          } else {
            obj_22 = new class85(i_3, 10, i_4, i_0, i_1, i_2, class268_8.field3372, true,
                                 (class127) null);
          }

          if (obj_22 != null && class125_6
              .method2882(i_0, i_1, i_2, i_16, i_9, i_10, (class127) obj_22, i_5 == 11 ? 256 : 0,
                          long_19, i_21) && class268_8.field3400) {
            i_23 = 15;
            if (obj_22 instanceof class119) {
              i_23 = ((class119) obj_22).method2672() / 4;
              if (i_23 > 30) {
                i_23 = 30;
              }
            }

            for (int i_24 = 0; i_24 <= i_9; i_24++) {
              for (int i_25 = 0; i_25 <= i_10; i_25++) {
                if (i_23 > class50.field447[i_0][i_24 + i_1][i_25 + i_2]) {
                  class50.field447[i_0][i_24 + i_1][i_25 + i_2] = (byte) i_23;
                }
              }
            }
          }

          if (class268_8.field3386 != 0 && class164_7 != null) {
            class164_7.method3394(i_1, i_2, i_9, i_10, class268_8.field3404);
          }

        }
      }
    }
  }

  @ObfuscatedName("hr")
  @ObfuscatedSignature(
      signature = "(Lbf;III)V",
      garbageValue = "-1489132269"
  )
  static final void method3451(class75 class75_0, int i_1, int i_2) {
    Keyboard.method692(class75_0.field1066, class75_0.field1060, class75_0.field1061,
                       class75_0.field1062, class75_0.field1063, class75_0.field1063, i_1, i_2);
  }

}
