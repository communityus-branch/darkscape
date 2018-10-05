package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
public class class262 {

  @ObfuscatedName("m")
  @ObfuscatedSignature(
      signature = "(IIIIIIILdm;Lfk;S)V",
      garbageValue = "5648"
  )
  static final void method4939(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                               class125 class125_7, class164 class164_8) {
    class268 class268_9 = SeekableFile.method2527(i_4);
    int i_10;
    int i_11;
    if (i_5 != 1 && i_5 != 3) {
      i_10 = class268_9.field3384;
      i_11 = class268_9.field3385;
    } else {
      i_10 = class268_9.field3385;
      i_11 = class268_9.field3384;
    }

    int i_12;
    int i_13;
    if (i_10 + i_2 <= 104) {
      i_12 = (i_10 >> 1) + i_2;
      i_13 = i_2 + (i_10 + 1 >> 1);
    } else {
      i_12 = i_2;
      i_13 = i_2 + 1;
    }

    int i_14;
    int i_15;
    if (i_3 + i_11 <= 104) {
      i_14 = i_3 + (i_11 >> 1);
      i_15 = i_3 + (i_11 + 1 >> 1);
    } else {
      i_14 = i_3;
      i_15 = i_3 + 1;
    }

    int[][] ints_16 = class50.field459[i_1];
    int i_17 =
        ints_16[i_12][i_15] + ints_16[i_12][i_14] + ints_16[i_13][i_14] + ints_16[i_13][i_15] >> 2;
    int i_18 = (i_2 << 7) + (i_10 << 6);
    int i_19 = (i_3 << 7) + (i_11 << 6);
    long long_20 = class76.method1804(i_2, i_3, 2, class268_9.field3388 == 0, i_4);
    int i_22 = (i_5 << 6) + i_6;
    if (class268_9.field3409 == 1) {
      i_22 += 256;
    }

    Object obj_23;
    if (i_6 == 22) {
      if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
        obj_23 = class268_9.method5031(22, i_5, ints_16, i_18, i_17, i_19);
      } else {
        obj_23 = new class85(i_4, 22, i_5, i_1, i_2, i_3, class268_9.field3372, true,
                             (class127) null);
      }

      class125_7.method3009(i_0, i_2, i_3, i_17, (class127) obj_23, long_20, i_22);
      if (class268_9.field3386 == 1) {
        class164_8.method3410(i_2, i_3);
      }

    } else if (i_6 != 10 && i_6 != 11) {
      if (i_6 >= 12) {
        if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
          obj_23 = class268_9.method5031(i_6, i_5, ints_16, i_18, i_17, i_19);
        } else {
          obj_23 = new class85(i_4, i_6, i_5, i_1, i_2, i_3, class268_9.field3372, true,
                               (class127) null);
        }

        class125_7.method2882(i_0, i_2, i_3, i_17, 1, 1, (class127) obj_23, 0, long_20, i_22);
        if (class268_9.field3386 != 0) {
          class164_8.method3394(i_2, i_3, i_10, i_11, class268_9.field3404);
        }

      } else if (i_6 == 0) {
        if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
          obj_23 = class268_9.method5031(0, i_5, ints_16, i_18, i_17, i_19);
        } else {
          obj_23 = new class85(i_4, 0, i_5, i_1, i_2, i_3, class268_9.field3372, true,
                               (class127) null);
        }

        class125_7.method2927(i_0, i_2, i_3, i_17, (class127) obj_23, (class127) null,
                              class50.field450[i_5], 0, long_20, i_22);
        if (class268_9.field3386 != 0) {
          class164_8.method3393(i_2, i_3, i_6, i_5, class268_9.field3404);
        }

      } else if (i_6 == 1) {
        if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
          obj_23 = class268_9.method5031(1, i_5, ints_16, i_18, i_17, i_19);
        } else {
          obj_23 = new class85(i_4, 1, i_5, i_1, i_2, i_3, class268_9.field3372, true,
                               (class127) null);
        }

        class125_7.method2927(i_0, i_2, i_3, i_17, (class127) obj_23, (class127) null,
                              class50.field451[i_5], 0, long_20, i_22);
        if (class268_9.field3386 != 0) {
          class164_8.method3393(i_2, i_3, i_6, i_5, class268_9.field3404);
        }

      } else {
        int i_29;
        if (i_6 == 2) {
          i_29 = i_5 + 1 & 0x3;
          Object obj_24;
          Object obj_25;
          if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
            obj_24 = class268_9.method5031(2, i_5 + 4, ints_16, i_18, i_17, i_19);
            obj_25 = class268_9.method5031(2, i_29, ints_16, i_18, i_17, i_19);
          } else {
            obj_24 = new class85(i_4, 2, i_5 + 4, i_1, i_2, i_3, class268_9.field3372, true,
                                 (class127) null);
            obj_25 = new class85(i_4, 2, i_29, i_1, i_2, i_3, class268_9.field3372, true,
                                 (class127) null);
          }

          class125_7.method2927(i_0, i_2, i_3, i_17, (class127) obj_24, (class127) obj_25,
                                class50.field450[i_5], class50.field450[i_29], long_20, i_22);
          if (class268_9.field3386 != 0) {
            class164_8.method3393(i_2, i_3, i_6, i_5, class268_9.field3404);
          }

        } else if (i_6 == 3) {
          if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
            obj_23 = class268_9.method5031(3, i_5, ints_16, i_18, i_17, i_19);
          } else {
            obj_23 = new class85(i_4, 3, i_5, i_1, i_2, i_3, class268_9.field3372, true,
                                 (class127) null);
          }

          class125_7.method2927(i_0, i_2, i_3, i_17, (class127) obj_23, (class127) null,
                                class50.field451[i_5], 0, long_20, i_22);
          if (class268_9.field3386 != 0) {
            class164_8.method3393(i_2, i_3, i_6, i_5, class268_9.field3404);
          }

        } else if (i_6 == 9) {
          if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
            obj_23 = class268_9.method5031(i_6, i_5, ints_16, i_18, i_17, i_19);
          } else {
            obj_23 = new class85(i_4, i_6, i_5, i_1, i_2, i_3, class268_9.field3372, true,
                                 (class127) null);
          }

          class125_7.method2882(i_0, i_2, i_3, i_17, 1, 1, (class127) obj_23, 0, long_20, i_22);
          if (class268_9.field3386 != 0) {
            class164_8.method3394(i_2, i_3, i_10, i_11, class268_9.field3404);
          }

        } else if (i_6 == 4) {
          if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
            obj_23 = class268_9.method5031(4, i_5, ints_16, i_18, i_17, i_19);
          } else {
            obj_23 = new class85(i_4, 4, i_5, i_1, i_2, i_3, class268_9.field3372, true,
                                 (class127) null);
          }

          class125_7.method2881(i_0, i_2, i_3, i_17, (class127) obj_23, (class127) null,
                                class50.field450[i_5], 0, 0, 0, long_20, i_22);
        } else {
          Object obj_26;
          long long_30;
          if (i_6 == 5) {
            i_29 = 16;
            long_30 = class125_7.method2898(i_0, i_2, i_3);
            if (long_30 != 0L) {
              i_29 = SeekableFile.method2527(Keyboard.method673(long_30)).field3379;
            }

            if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
              obj_26 = class268_9.method5031(4, i_5, ints_16, i_18, i_17, i_19);
            } else {
              obj_26 = new class85(i_4, 4, i_5, i_1, i_2, i_3, class268_9.field3372, true,
                                   (class127) null);
            }

            class125_7.method2881(i_0, i_2, i_3, i_17, (class127) obj_26, (class127) null,
                                  class50.field450[i_5], 0, i_29 * class50.field452[i_5],
                                  i_29 * class50.field453[i_5], long_20, i_22);
          } else if (i_6 == 6) {
            i_29 = 8;
            long_30 = class125_7.method2898(i_0, i_2, i_3);
            if (long_30 != 0L) {
              i_29 = SeekableFile.method2527(Keyboard.method673(long_30)).field3379 / 2;
            }

            if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
              obj_26 = class268_9.method5031(4, i_5 + 4, ints_16, i_18, i_17, i_19);
            } else {
              obj_26 = new class85(i_4, 4, i_5 + 4, i_1, i_2, i_3, class268_9.field3372, true,
                                   (class127) null);
            }

            class125_7.method2881(i_0, i_2, i_3, i_17, (class127) obj_26, (class127) null, 256, i_5,
                                  i_29 * class50.field458[i_5], i_29 * class50.field449[i_5],
                                  long_20, i_22);
          } else if (i_6 == 7) {
            int i_32 = i_5 + 2 & 0x3;
            if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
              obj_23 = class268_9.method5031(4, i_32 + 4, ints_16, i_18, i_17, i_19);
            } else {
              obj_23 = new class85(i_4, 4, i_32 + 4, i_1, i_2, i_3, class268_9.field3372, true,
                                   (class127) null);
            }

            class125_7
                .method2881(i_0, i_2, i_3, i_17, (class127) obj_23, (class127) null, 256, i_32, 0,
                            0, long_20, i_22);
          } else if (i_6 == 8) {
            i_29 = 8;
            long_30 = class125_7.method2898(i_0, i_2, i_3);
            if (long_30 != 0L) {
              i_29 = SeekableFile.method2527(Keyboard.method673(long_30)).field3379 / 2;
            }

            int i_28 = i_5 + 2 & 0x3;
            Object obj_27;
            if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
              obj_26 = class268_9.method5031(4, i_5 + 4, ints_16, i_18, i_17, i_19);
              obj_27 = class268_9.method5031(4, i_28 + 4, ints_16, i_18, i_17, i_19);
            } else {
              obj_26 = new class85(i_4, 4, i_5 + 4, i_1, i_2, i_3, class268_9.field3372, true,
                                   (class127) null);
              obj_27 = new class85(i_4, 4, i_28 + 4, i_1, i_2, i_3, class268_9.field3372, true,
                                   (class127) null);
            }

            class125_7
                .method2881(i_0, i_2, i_3, i_17, (class127) obj_26, (class127) obj_27, 256, i_5,
                            i_29 * class50.field458[i_5], i_29 * class50.field449[i_5], long_20,
                            i_22);
          }
        }
      }
    } else {
      if (class268_9.field3372 == -1 && class268_9.field3410 == null) {
        obj_23 = class268_9.method5031(10, i_5, ints_16, i_18, i_17, i_19);
      } else {
        obj_23 = new class85(i_4, 10, i_5, i_1, i_2, i_3, class268_9.field3372, true,
                             (class127) null);
      }

      if (obj_23 != null) {
        class125_7
            .method2882(i_0, i_2, i_3, i_17, i_10, i_11, (class127) obj_23, i_6 == 11 ? 256 : 0,
                        long_20, i_22);
      }

      if (class268_9.field3386 != 0) {
        class164_8.method3394(i_2, i_3, i_10, i_11, class268_9.field3404);
      }

    }
  }

}
