package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class12 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Ln;"
  )
  public static final class12 field70 = new class12("SMALL", 0, 0, 4);
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Ln;"
  )
  public static final class12 field71 = new class12("MEDIUM", 2, 1, 2);
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Ln;"
  )
  public static final class12 field72 = new class12("LARGE", 1, 2, 0);
  @ObfuscatedName("l")
  final String field73;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -2147190539
  )
  final int field79;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 94613509
  )
  final int field75;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -321383721
  )
  final int field76;

  class12(String string_1, int i_2, int i_3, int i_4) {
    this.field73 = string_1;
    this.field79 = i_2;
    this.field75 = i_3;
    this.field76 = i_4;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)Ln;",
      garbageValue = "-15"
  )
  static class12 method101(int i_0) {
    class12[] arr_1 = new class12[]{field72, field70, field71};
    class12[] arr_2 = arr_1;

    for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
      class12 class12_4 = arr_2[i_3];
      if (i_0 == class12_4.field75) {
        return class12_4;
      }
    }

    return null;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lj;III)V",
      garbageValue = "-442042913"
  )
  static void method104(class21 class21_0, int i_1, int i_2) {
    class23.field189.method4007(class21_0, class43.method716(i_1, i_2, 0));
  }

  @ObfuscatedName("go")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "65280"
  )
  static final int method108() {
    if (class10.field61.field960) {
      return class13.field82;
    } else {
      int i_0 = 3;
      if (class7.field41 < 310) {
        int i_1;
        int i_2;
        if (client.field655 == 1) {
          i_1 = BufferedFile.field1428 >> 7;
          i_2 = class2.field23 >> 7;
        } else {
          i_1 = class138.field1876.field931 >> 7;
          i_2 = class138.field1876.field881 >> 7;
        }

        int i_3 = BufferedFile.field1431 >> 7;
        int i_4 = class226.field2563 >> 7;
        if (i_3 < 0 || i_4 < 0 || i_3 >= 104 || i_4 >= 104) {
          return class13.field82;
        }

        if (i_1 < 0 || i_2 < 0 || i_1 >= 104 || i_2 >= 104) {
          return class13.field82;
        }

        if ((class50.field443[class13.field82][i_3][i_4] & 0x4) != 0) {
          i_0 = class13.field82;
        }

        int i_5;
        if (i_1 > i_3) {
          i_5 = i_1 - i_3;
        } else {
          i_5 = i_3 - i_1;
        }

        int i_6;
        if (i_2 > i_4) {
          i_6 = i_2 - i_4;
        } else {
          i_6 = i_4 - i_2;
        }

        int i_7;
        int i_8;
        if (i_5 > i_6) {
          i_7 = i_6 * 65536 / i_5;
          i_8 = 32768;

          while (i_3 != i_1) {
            if (i_3 < i_1) {
              ++i_3;
            } else if (i_3 > i_1) {
              --i_3;
            }

            if ((class50.field443[class13.field82][i_3][i_4] & 0x4) != 0) {
              i_0 = class13.field82;
            }

            i_8 += i_7;
            if (i_8 >= 65536) {
              i_8 -= 65536;
              if (i_4 < i_2) {
                ++i_4;
              } else if (i_4 > i_2) {
                --i_4;
              }

              if ((class50.field443[class13.field82][i_3][i_4] & 0x4) != 0) {
                i_0 = class13.field82;
              }
            }
          }
        } else if (i_6 > 0) {
          i_7 = i_5 * 65536 / i_6;
          i_8 = 32768;

          while (i_2 != i_4) {
            if (i_4 < i_2) {
              ++i_4;
            } else if (i_4 > i_2) {
              --i_4;
            }

            if ((class50.field443[class13.field82][i_3][i_4] & 0x4) != 0) {
              i_0 = class13.field82;
            }

            i_8 += i_7;
            if (i_8 >= 65536) {
              i_8 -= 65536;
              if (i_3 < i_1) {
                ++i_3;
              } else if (i_3 > i_1) {
                --i_3;
              }

              if ((class50.field443[class13.field82][i_3][i_4] & 0x4) != 0) {
                i_0 = class13.field82;
              }
            }
          }
        }
      }

      if (class138.field1876.field931 >= 0 && class138.field1876.field881 >= 0
          && class138.field1876.field931 < 13312 && class138.field1876.field881 < 13312) {
        if ((class50.field443[class13.field82][class138.field1876.field931 >> 7][
            class138.field1876.field881 >> 7] & 0x4) != 0) {
          i_0 = class13.field82;
        }

        return i_0;
      } else {
        return class13.field82;
      }
    }
  }

  @ObfuscatedName("ii")
  @ObfuscatedSignature(
      signature = "([Lhi;IIIIIIII)V",
      garbageValue = "-1825826206"
  )
  static final void method102(class230[] arr_0, int i_1, int i_2, int i_3, int i_4, int i_5,
                              int i_6, int i_7) {
    for (int i_8 = 0; i_8 < arr_0.length; i_8++) {
      class230 class230_9 = arr_0[i_8];
      if (class230_9 != null && (!class230_9.field2604 || class230_9.field2721 == 0
          || class230_9.field2686 || class24.method425(class230_9) != 0
          || class230_9 == client.field752 || class230_9.field2609 == 1338)
          && class230_9.field2605 == i_1 && (!class230_9.field2604 || !class81
          .method1885(class230_9))) {
        int i_10 = class230_9.field2618 + i_6;
        int i_11 = i_7 + class230_9.field2619;
        int i_12;
        int i_13;
        int i_14;
        int i_15;
        int i_16;
        int i_17;
        int i_42;
        if (class230_9.field2721 == 2) {
          i_12 = i_2;
          i_13 = i_3;
          i_14 = i_4;
          i_15 = i_5;
        } else if (class230_9.field2721 == 9) {
          i_16 = i_10;
          i_17 = i_11;
          int i_18 = i_10 + class230_9.field2675;
          i_42 = i_11 + class230_9.field2621;
          if (i_18 < i_10) {
            i_16 = i_18;
            i_18 = i_10;
          }

          if (i_42 < i_11) {
            i_17 = i_42;
            i_42 = i_11;
          }

          ++i_18;
          ++i_42;
          i_12 = i_16 > i_2 ? i_16 : i_2;
          i_13 = i_17 > i_3 ? i_17 : i_3;
          i_14 = i_18 < i_4 ? i_18 : i_4;
          i_15 = i_42 < i_5 ? i_42 : i_5;
        } else {
          i_16 = i_10 + class230_9.field2675;
          i_17 = i_11 + class230_9.field2621;
          i_12 = i_10 > i_2 ? i_10 : i_2;
          i_13 = i_11 > i_3 ? i_11 : i_3;
          i_14 = i_16 < i_4 ? i_16 : i_4;
          i_15 = i_17 < i_5 ? i_17 : i_5;
        }

        if (class230_9 == client.field583) {
          client.field772 = true;
          client.field696 = i_10;
          client.field760 = i_11;
        }

        if (!class230_9.field2604 || i_12 < i_14 && i_13 < i_15) {
          i_16 = Mouse.field425;
          i_17 = Mouse.field426 * 673804999;
          if (Mouse.field431 != 0) {
            i_16 = Mouse.field432;
            i_17 = Mouse.field428;
          }

          boolean bool_56 = i_16 >= i_12 && i_17 >= i_13 && i_16 < i_14 && i_17 < i_15;
          int i_23;
          int i_24;
          int i_25;
          int i_28;
          int i_59;
          if (class230_9.field2609 == 1337) {
            if (!client.field625 && !client.field716 && bool_56) {
              if (client.field733 == 0 && !client.field785) {
                class50.method993("Walk here", "", 23, 0, i_16 - i_12, i_17 - i_13);
              }

              long long_19 = -1L;
              long long_21 = -1L;
              i_23 = 0;

              while (true) {
                i_25 = class120.field1656;
                if (i_23 >= i_25) {
                  if (long_19 != -1L) {
                    i_23 = class37.method662(long_19);
                    i_24 = BufferedFile.method2484(long_19);
                    class60 class60_39 = client.field610[client.field707];
                    class221.method4371(class60_39, client.field707, i_23, i_24);
                  }
                  break;
                }

                long long_49 = class20.method262(i_23);
                if (long_49 != long_21) {
                  label1671:
                  {
                    long_21 = long_49;
                    i_28 = class3.method32(i_23);
                    i_59 = class27.method435(i_23);
                    long long_32 = class120.field1647[i_23];
                    int i_31 = (int) (long_32 >>> 14 & 0x3L);
                    int i_51 = class80.method1864(i_23);
                    if (i_31 == 2
                        && class28.field248.method2902(class13.field82, i_28, i_59, long_49) >= 0) {
                      class268 class268_33 = SeekableFile.method2527(i_51);
                      if (class268_33.field3410 != null) {
                        class268_33 = class268_33.method5056();
                      }

                      if (class268_33 == null) {
                        break label1671;
                      }

                      if (client.field733 == 1) {
                        class50.method993("Use", client.field734 + " " + "->" + " " + class6
                            .method71(65535) + class268_33.field3373, 1, i_51, i_28, i_59);
                      } else if (client.field785) {
                        if ((class63.field932 & 0x4) == 4) {
                          class50.method993(client.field612,
                                            client.field739 + " " + "->" + " " + class6
                                                .method71(65535) + class268_33.field3373, 2, i_51,
                                            i_28, i_59);
                        }
                      } else {
                        String[] arr_34 = class268_33.field3387;
                        if (arr_34 != null) {
                          for (int i_35 = 4; i_35 >= 0; --i_35) {
                            if (arr_34[i_35] != null) {
                              short s_36 = 0;
                              if (i_35 == 0) {
                                s_36 = 3;
                              }

                              if (i_35 == 1) {
                                s_36 = 4;
                              }

                              if (i_35 == 2) {
                                s_36 = 5;
                              }

                              if (i_35 == 3) {
                                s_36 = 6;
                              }

                              if (i_35 == 4) {
                                s_36 = 1001;
                              }

                              class50.method993(arr_34[i_35],
                                                class6.method71(65535) + class268_33.field3373,
                                                s_36, i_51, i_28, i_59);
                            }
                          }
                        }

                        class50.method993("Examine", class6.method71(65535) + class268_33.field3373,
                                          1002, class268_33.field3376, i_28, i_59);
                      }
                    }

                    class60 class60_37;
                    int i_52;
                    class72 class72_53;
                    int i_64;
                    int[] ints_70;
                    if (i_31 == 1) {
                      class72 class72_60 = client.field843[i_51];
                      if (class72_60 == null) {
                        break label1671;
                      }

                      if (class72_60.field1037.field3497 == 1 && (class72_60.field931 & 0x7f) == 64
                          && (class72_60.field881 & 0x7f) == 64) {
                        for (i_52 = 0; i_52 < client.field622; i_52++) {
                          class72_53 = client.field843[client.field639[i_52]];
                          if (class72_53 != null && class72_60 != class72_53
                              && class72_53.field1037.field3497 == 1
                              && class72_53.field931 == class72_60.field931
                              && class72_60.field881 == class72_53.field881) {
                            class28
                                .method474(class72_53.field1037, client.field639[i_52], i_28, i_59);
                          }
                        }

                        i_52 = class81.field1167;
                        ints_70 = class81.field1159;

                        for (i_64 = 0; i_64 < i_52; i_64++) {
                          class60_37 = client.field610[ints_70[i_64]];
                          if (class60_37 != null && class60_37.field931 == class72_60.field931
                              && class60_37.field881 == class72_60.field881) {
                            class221.method4371(class60_37, ints_70[i_64], i_28, i_59);
                          }
                        }
                      }

                      class28.method474(class72_60.field1037, i_51, i_28, i_59);
                    }

                    if (i_31 == 0) {
                      class60 class60_61 = client.field610[i_51];
                      if (class60_61 == null) {
                        break label1671;
                      }

                      if ((class60_61.field931 & 0x7f) == 64
                          && (class60_61.field881 & 0x7f) == 64) {
                        for (i_52 = 0; i_52 < client.field622; i_52++) {
                          class72_53 = client.field843[client.field639[i_52]];
                          if (class72_53 != null && class72_53.field1037.field3497 == 1
                              && class60_61.field931 == class72_53.field931
                              && class72_53.field881 == class60_61.field881) {
                            class28
                                .method474(class72_53.field1037, client.field639[i_52], i_28, i_59);
                          }
                        }

                        i_52 = class81.field1167;
                        ints_70 = class81.field1159;

                        for (i_64 = 0; i_64 < i_52; i_64++) {
                          class60_37 = client.field610[ints_70[i_64]];
                          if (class60_37 != null && class60_37 != class60_61
                              && class60_61.field931 == class60_37.field931
                              && class60_37.field881 == class60_61.field881) {
                            class221.method4371(class60_37, ints_70[i_64], i_28, i_59);
                          }
                        }
                      }

                      if (i_51 != client.field707) {
                        class221.method4371(class60_61, i_51, i_28, i_59);
                      } else {
                        long_19 = long_49;
                      }
                    }

                    if (i_31 == 3) {
                      Deque class205_63 = client.field708[class13.field82][i_28][i_59];
                      if (class205_63 != null) {
                        for (class80 class80_62 = (class80) class205_63.getLast();
                            class80_62 != null; class80_62 = (class80) class205_63.getPrevious()) {
                          class269 class269_71 = class111.method2563(class80_62.field1151);
                          if (client.field733 == 1) {
                            class50.method993("Use", client.field734 + " " + "->" + " " + class6
                                                  .method71(16748608) + class269_71.field3433, 16,
                                              class80_62.field1151, i_28, i_59);
                          } else if (client.field785) {
                            if ((class63.field932 & 0x1) == 1) {
                              class50.method993(client.field612,
                                                client.field739 + " " + "->" + " " + class6
                                                    .method71(16748608) + class269_71.field3433, 17,
                                                class80_62.field1151, i_28, i_59);
                            }
                          } else {
                            String[] arr_54 = class269_71.field3447;

                            for (int i_55 = 4; i_55 >= 0; --i_55) {
                              if (arr_54 != null && arr_54[i_55] != null) {
                                byte b_38 = 0;
                                if (i_55 == 0) {
                                  b_38 = 18;
                                }

                                if (i_55 == 1) {
                                  b_38 = 19;
                                }

                                if (i_55 == 2) {
                                  b_38 = 20;
                                }

                                if (i_55 == 3) {
                                  b_38 = 21;
                                }

                                if (i_55 == 4) {
                                  b_38 = 22;
                                }

                                class50.method993(arr_54[i_55],
                                                  class6.method71(16748608) + class269_71.field3433,
                                                  b_38, class80_62.field1151, i_28, i_59);
                              } else if (i_55 == 2) {
                                class50.method993("Take",
                                                  class6.method71(16748608) + class269_71.field3433,
                                                  20, class80_62.field1151, i_28, i_59);
                              }
                            }

                            class50.method993("Examine",
                                              class6.method71(16748608) + class269_71.field3433,
                                              1004, class80_62.field1151, i_28, i_59);
                          }
                        }
                      }
                    }
                  }
                }

                ++i_23;
              }
            }
          } else if (class230_9.field2609 == 1338) {
            class36.method632(class230_9, i_10, i_11);
          } else {
            if (class230_9.field2609 == 1400) {
              class53.field476
                  .method6003(Mouse.field425, Mouse.field426 * 673804999, bool_56, i_10, i_11,
                              class230_9.field2675, class230_9.field2621);
            }

            int i_20;
            int i_22;
            int i_43;
            boolean bool_67;
            if (!client.field716 && bool_56) {
              if (class230_9.field2609 == 1400) {
                class53.field476
                    .method6158(i_10, i_11, class230_9.field2675, class230_9.field2621, i_16, i_17);
              } else {
                i_42 = i_16 - i_10;
                i_20 = i_17 - i_11;
                if (class230_9.field2709 == 1) {
                  class50.method993(class230_9.field2723, "", 24, 0, 0, class230_9.field2691);
                }

                String string_44;
                if (class230_9.field2709 == 2 && !client.field785) {
                  string_44 = Temp.method3239(class230_9);
                  if (string_44 != null) {
                    class50
                        .method993(string_44, class6.method71(65280) + class230_9.field2722, 25, 0,
                                   -1, class230_9.field2691);
                  }
                }

                if (class230_9.field2709 == 3) {
                  class50.method993("Close", "", 26, 0, 0, class230_9.field2691);
                }

                if (class230_9.field2709 == 4) {
                  class50.method993(class230_9.field2723, "", 28, 0, 0, class230_9.field2691);
                }

                if (class230_9.field2709 == 5) {
                  class50.method993(class230_9.field2723, "", 29, 0, 0, class230_9.field2691);
                }

                if (class230_9.field2709 == 6 && client.field744 == null) {
                  class50.method993(class230_9.field2723, "", 30, 0, -1, class230_9.field2691);
                }

                if (class230_9.field2721 == 2) {
                  i_43 = 0;

                  for (i_22 = 0; i_22 < class230_9.field2621; i_22++) {
                    for (i_23 = 0; i_23 < class230_9.field2675; i_23++) {
                      i_24 = i_23 * (class230_9.field2672 + 32);
                      i_25 = i_22 * (class230_9.field2673 + 32);
                      if (i_43 < 20) {
                        i_24 += class230_9.field2685[i_43];
                        i_25 += class230_9.field2738[i_43];
                      }

                      if (i_42 >= i_24 && i_20 >= i_25 && i_42 < i_24 + 32 && i_20 < i_25 + 32) {
                        client.field691 = i_43;
                        class132.field1819 = class230_9;
                        if (class230_9.field2724[i_43] > 0) {
                          class269 class269_26 = class111
                              .method2563(class230_9.field2724[i_43] - 1);
                          if (client.field733 == 1 && class145
                              .method3188(class24.method425(class230_9))) {
                            if (class230_9.field2691 != class187.field2372
                                || i_43 != class13.field84) {
                              class50.method993("Use", client.field734 + " " + "->" + " " + class6
                                                    .method71(16748608) + class269_26.field3433, 31,
                                                class269_26.field3431, i_43, class230_9.field2691);
                            }
                          } else if (client.field785 && class145
                              .method3188(class24.method425(class230_9))) {
                            if ((class63.field932 & 0x10) == 16) {
                              class50.method993(client.field612,
                                                client.field739 + " " + "->" + " " + class6
                                                    .method71(16748608) + class269_26.field3433, 32,
                                                class269_26.field3431, i_43, class230_9.field2691);
                            }
                          } else {
                            String[] arr_27 = class269_26.field3425;
                            i_28 = -1;
                            if (client.field726) {
                              boolean bool_29 = client.field727 || Keyboard.keyActive[81];
                              if (bool_29) {
                                i_28 = class269_26.method5101();
                              }
                            }

                            if (class145.method3188(class24.method425(class230_9))) {
                              for (i_59 = 4; i_59 >= 3; --i_59) {
                                if (i_28 != i_59) {
                                  class56.method1027(class230_9, class269_26, i_43, i_59, false);
                                }
                              }
                            }

                            if (class148.method3197(class24.method425(class230_9))) {
                              class50.method993("Use",
                                                class6.method71(16748608) + class269_26.field3433,
                                                38, class269_26.field3431, i_43,
                                                class230_9.field2691);
                            }

                            if (class145.method3188(class24.method425(class230_9))) {
                              for (i_59 = 2; i_59 >= 0; --i_59) {
                                if (i_59 != i_28) {
                                  class56.method1027(class230_9, class269_26, i_43, i_59, false);
                                }
                              }

                              if (i_28 >= 0) {
                                class56.method1027(class230_9, class269_26, i_43, i_28, true);
                              }
                            }

                            arr_27 = class230_9.field2677;
                            if (arr_27 != null) {
                              for (i_59 = 4; i_59 >= 0; --i_59) {
                                if (arr_27[i_59] != null) {
                                  byte b_30 = 0;
                                  if (i_59 == 0) {
                                    b_30 = 39;
                                  }

                                  if (i_59 == 1) {
                                    b_30 = 40;
                                  }

                                  if (i_59 == 2) {
                                    b_30 = 41;
                                  }

                                  if (i_59 == 3) {
                                    b_30 = 42;
                                  }

                                  if (i_59 == 4) {
                                    b_30 = 43;
                                  }

                                  class50.method993(arr_27[i_59], class6.method71(16748608)
                                                        + class269_26.field3433, b_30, class269_26.field3431, i_43,
                                                    class230_9.field2691);
                                }
                              }
                            }

                            class50.method993("Examine",
                                              class6.method71(16748608) + class269_26.field3433,
                                              1005, class269_26.field3431, i_43,
                                              class230_9.field2691);
                          }
                        }
                      }

                      ++i_43;
                    }
                  }
                }

                if (class230_9.field2604) {
                  if (client.field785) {
                    i_22 = class24.method425(class230_9);
                    bool_67 = (i_22 >> 21 & 0x1) != 0;
                    if (bool_67 && (class63.field932 & 0x20) == 32) {
                      class50.method993(client.field612,
                                        client.field739 + " " + "->" + " " + class230_9.field2679,
                                        58, 0, class230_9.field2606, class230_9.field2691);
                    }
                  } else {
                    for (i_43 = 9; i_43 >= 5; --i_43) {
                      String string_46 = class112.method2565(class230_9, i_43);
                      if (string_46 != null) {
                        class50.method993(string_46, class230_9.field2679, 1007, i_43 + 1,
                                          class230_9.field2606, class230_9.field2691);
                      }
                    }

                    string_44 = Temp.method3239(class230_9);
                    if (string_44 != null) {
                      class50
                          .method993(string_44, class230_9.field2679, 25, 0, class230_9.field2606,
                                     class230_9.field2691);
                    }

                    for (i_22 = 4; i_22 >= 0; --i_22) {
                      String string_47 = class112.method2565(class230_9, i_22);
                      if (string_47 != null) {
                        class50.method993(string_47, class230_9.field2679, 57, i_22 + 1,
                                          class230_9.field2606, class230_9.field2691);
                      }
                    }

                    i_23 = class24.method425(class230_9);
                    boolean bool_58 = (i_23 & 0x1) != 0;
                    if (bool_58) {
                      class50.method993("Continue", "", 30, 0, class230_9.field2606,
                                        class230_9.field2691);
                    }
                  }
                }
              }
            }

            if (class230_9.field2721 == 0) {
              if (!class230_9.field2604 && class81.method1885(class230_9)
                  && class230_9 != class143.field1897) {
                continue;
              }

              method102(arr_0, class230_9.field2691, i_12, i_13, i_14, i_15,
                        i_10 - class230_9.field2626, i_11 - class230_9.field2663);
              if (class230_9.field2736 != null) {
                method102(class230_9.field2736, class230_9.field2691, i_12, i_13, i_14, i_15,
                          i_10 - class230_9.field2626, i_11 - class230_9.field2663);
              }

              class55 class55_40 = (class55) client.field741
                  .get((long) class230_9.field2691);
              if (class55_40 != null) {
                if (class55_40.field494 == 0 && Mouse.field425 >= i_12
                    && Mouse.field426 * 673804999 >= i_13 && Mouse.field425 < i_14
                    && Mouse.field426 * 673804999 < i_15 && !client.field716) {
                  for (class56 class56_41 = (class56) client.field638.getFirst();
                      class56_41 != null; class56_41 = (class56) client.field638.getNext()) {
                    if (class56_41.field505) {
                      class56_41.unlinkNode();
                      class56_41.field506.field2731 = false;
                    }
                  }

                  if (class6.field39 == 0) {
                    client.field583 = null;
                    client.field752 = null;
                  }

                  if (!client.field716) {
                    class59.method1077();
                  }
                }

                i_20 = class55_40.field501;
                if (class261.method4931(i_20)) {
                  method102(class42.field366[i_20], -1, i_12, i_13, i_14, i_15, i_10, i_11);
                }
              }
            }

            if (class230_9.field2604) {
              class56 class56_65;
              if (!class230_9.field2648) {
                if (class230_9.field2740 && Mouse.field425 >= i_12
                    && Mouse.field426 * 673804999 >= i_13 && Mouse.field425 < i_14
                    && Mouse.field426 * 673804999 < i_15) {
                  for (class56_65 = (class56) client.field638.getFirst(); class56_65 != null;
                      class56_65 = (class56) client.field638.getNext()) {
                    if (class56_65.field505
                        && class56_65.field506.field2707 == class56_65.field512) {
                      class56_65.unlinkNode();
                    }
                  }
                }
              } else if (Mouse.field425 >= i_12 && Mouse.field426 * 673804999 >= i_13
                  && Mouse.field425 < i_14 && Mouse.field426 * 673804999 < i_15) {
                for (class56_65 = (class56) client.field638.getFirst(); class56_65 != null;
                    class56_65 = (class56) client.field638.getNext()) {
                  if (class56_65.field505) {
                    class56_65.unlinkNode();
                    class56_65.field506.field2731 = false;
                  }
                }

                if (class6.field39 == 0) {
                  client.field583 = null;
                  client.field752 = null;
                }

                if (!client.field716) {
                  class59.method1077();
                }
              }

              if (Mouse.field425 >= i_12 && Mouse.field426 * 673804999 >= i_13
                  && Mouse.field425 < i_14 && Mouse.field426 * 673804999 < i_15) {
                bool_56 = true;
              } else {
                bool_56 = false;
              }

              boolean bool_66 = false;
              if ((Mouse.field419 == 1 || !class253.field3229 && Mouse.field419 == 4)
                  && bool_56) {
                bool_66 = true;
              }

              boolean bool_57 = false;
              if ((Mouse.field431 == 1 || !class253.field3229 && Mouse.field431 == 4)
                  && Mouse.field432 >= i_12 && Mouse.field428 >= i_13 && Mouse.field432 < i_14
                  && Mouse.field428 < i_15) {
                bool_57 = true;
              }

              if (bool_57) {
                OutboundPacketDescriptor
                    .method3447(class230_9, Mouse.field432 - i_10, Mouse.field428 - i_11);
              }

              if (class230_9.field2609 == 1400) {
                class53.field476.method6174(i_16, i_17, bool_56 & bool_66, bool_56 & bool_57);
              }

              if (client.field583 != null && class230_9 != client.field583 && bool_56) {
                i_22 = class24.method425(class230_9);
                bool_67 = (i_22 >> 20 & 0x1) != 0;
                if (bool_67) {
                  client.field755 = class230_9;
                }
              }

              if (class230_9 == client.field752) {
                client.field601 = true;
                client.field757 = i_10;
                client.field758 = i_11;
              }

              if (class230_9.field2686) {
                class56 class56_68;
                if (bool_56 && client.field695 != 0 && class230_9.field2707 != null) {
                  class56_68 = new class56();
                  class56_68.field505 = true;
                  class56_68.field506 = class230_9;
                  class56_68.field508 = client.field695;
                  class56_68.field512 = class230_9.field2707;
                  client.field638.addLast(class56_68);
                }

                if (client.field583 != null || class276.field3559 != null || client.field716) {
                  bool_57 = false;
                  bool_66 = false;
                  bool_56 = false;
                }

                if (!class230_9.field2674 && bool_57) {
                  class230_9.field2674 = true;
                  if (class230_9.field2688 != null) {
                    class56_68 = new class56();
                    class56_68.field505 = true;
                    class56_68.field506 = class230_9;
                    class56_68.field511 = Mouse.field432 - i_10;
                    class56_68.field508 = Mouse.field428 - i_11;
                    class56_68.field512 = class230_9.field2688;
                    client.field638.addLast(class56_68);
                  }
                }

                if (class230_9.field2674 && bool_66 && class230_9.field2689 != null) {
                  class56_68 = new class56();
                  class56_68.field505 = true;
                  class56_68.field506 = class230_9;
                  class56_68.field511 = Mouse.field425 - i_10;
                  class56_68.field508 = Mouse.field426 * 673804999 - i_11;
                  class56_68.field512 = class230_9.field2689;
                  client.field638.addLast(class56_68);
                }

                if (class230_9.field2674 && !bool_66) {
                  class230_9.field2674 = false;
                  if (class230_9.field2690 != null) {
                    class56_68 = new class56();
                    class56_68.field505 = true;
                    class56_68.field506 = class230_9;
                    class56_68.field511 = Mouse.field425 - i_10;
                    class56_68.field508 = Mouse.field426 * 673804999 - i_11;
                    class56_68.field512 = class230_9.field2690;
                    client.field779.addLast(class56_68);
                  }
                }

                if (bool_66 && class230_9.field2614 != null) {
                  class56_68 = new class56();
                  class56_68.field505 = true;
                  class56_68.field506 = class230_9;
                  class56_68.field511 = Mouse.field425 - i_10;
                  class56_68.field508 = Mouse.field426 * 673804999 - i_11;
                  class56_68.field512 = class230_9.field2614;
                  client.field638.addLast(class56_68);
                }

                if (!class230_9.field2731 && bool_56) {
                  class230_9.field2731 = true;
                  if (class230_9.field2692 != null) {
                    class56_68 = new class56();
                    class56_68.field505 = true;
                    class56_68.field506 = class230_9;
                    class56_68.field511 = Mouse.field425 - i_10;
                    class56_68.field508 = Mouse.field426 * 673804999 - i_11;
                    class56_68.field512 = class230_9.field2692;
                    client.field638.addLast(class56_68);
                  }
                }

                if (class230_9.field2731 && bool_56 && class230_9.field2594 != null) {
                  class56_68 = new class56();
                  class56_68.field505 = true;
                  class56_68.field506 = class230_9;
                  class56_68.field511 = Mouse.field425 - i_10;
                  class56_68.field508 = Mouse.field426 * 673804999 - i_11;
                  class56_68.field512 = class230_9.field2594;
                  client.field638.addLast(class56_68);
                }

                if (class230_9.field2731 && !bool_56) {
                  class230_9.field2731 = false;
                  if (class230_9.field2694 != null) {
                    class56_68 = new class56();
                    class56_68.field505 = true;
                    class56_68.field506 = class230_9;
                    class56_68.field511 = Mouse.field425 - i_10;
                    class56_68.field508 = Mouse.field426 * 673804999 - i_11;
                    class56_68.field512 = class230_9.field2694;
                    client.field779.addLast(class56_68);
                  }
                }

                if (class230_9.field2705 != null) {
                  class56_68 = new class56();
                  class56_68.field506 = class230_9;
                  class56_68.field512 = class230_9.field2705;
                  client.field778.addLast(class56_68);
                }

                class56 class56_45;
                if (class230_9.field2699 != null && client.field765 > class230_9.field2683) {
                  if (class230_9.field2700 != null
                      && client.field765 - class230_9.field2683 <= 32) {
                    label1369:
                    for (i_43 = class230_9.field2683; i_43 < client.field765; i_43++) {
                      i_22 = client.field764[i_43 & 0x1f];

                      for (i_23 = 0; i_23 < class230_9.field2700.length; i_23++) {
                        if (i_22 == class230_9.field2700[i_23]) {
                          class56_45 = new class56();
                          class56_45.field506 = class230_9;
                          class56_45.field512 = class230_9.field2699;
                          client.field638.addLast(class56_45);
                          break label1369;
                        }
                      }
                    }
                  } else {
                    class56_68 = new class56();
                    class56_68.field506 = class230_9;
                    class56_68.field512 = class230_9.field2699;
                    client.field638.addLast(class56_68);
                  }

                  class230_9.field2683 = client.field765;
                }

                if (class230_9.field2670 != null && client.field767 > class230_9.field2735) {
                  if (class230_9.field2733 != null
                      && client.field767 - class230_9.field2735 <= 32) {
                    label1345:
                    for (i_43 = class230_9.field2735; i_43 < client.field767; i_43++) {
                      i_22 = client.field766[i_43 & 0x1f];

                      for (i_23 = 0; i_23 < class230_9.field2733.length; i_23++) {
                        if (i_22 == class230_9.field2733[i_23]) {
                          class56_45 = new class56();
                          class56_45.field506 = class230_9;
                          class56_45.field512 = class230_9.field2670;
                          client.field638.addLast(class56_45);
                          break label1345;
                        }
                      }
                    }
                  } else {
                    class56_68 = new class56();
                    class56_68.field506 = class230_9;
                    class56_68.field512 = class230_9.field2670;
                    client.field638.addLast(class56_68);
                  }

                  class230_9.field2735 = client.field767;
                }

                if (class230_9.field2703 != null && client.field769 > class230_9.field2702) {
                  if (class230_9.field2635 != null
                      && client.field769 - class230_9.field2702 <= 32) {
                    label1321:
                    for (i_43 = class230_9.field2702; i_43 < client.field769; i_43++) {
                      i_22 = client.field690[i_43 & 0x1f];

                      for (i_23 = 0; i_23 < class230_9.field2635.length; i_23++) {
                        if (i_22 == class230_9.field2635[i_23]) {
                          class56_45 = new class56();
                          class56_45.field506 = class230_9;
                          class56_45.field512 = class230_9.field2703;
                          client.field638.addLast(class56_45);
                          break label1321;
                        }
                      }
                    }
                  } else {
                    class56_68 = new class56();
                    class56_68.field506 = class230_9;
                    class56_68.field512 = class230_9.field2703;
                    client.field638.addLast(class56_68);
                  }

                  class230_9.field2702 = client.field769;
                }

                if (client.field770 > class230_9.field2697 && class230_9.field2708 != null) {
                  class56_68 = new class56();
                  class56_68.field506 = class230_9;
                  class56_68.field512 = class230_9.field2708;
                  client.field638.addLast(class56_68);
                }

                if (client.field647 > class230_9.field2697 && class230_9.field2718 != null) {
                  class56_68 = new class56();
                  class56_68.field506 = class230_9;
                  class56_68.field512 = class230_9.field2718;
                  client.field638.addLast(class56_68);
                }

                if (client.field828 > class230_9.field2697 && class230_9.field2711 != null) {
                  class56_68 = new class56();
                  class56_68.field506 = class230_9;
                  class56_68.field512 = class230_9.field2711;
                  client.field638.addLast(class56_68);
                }

                if (client.field793 > class230_9.field2697 && class230_9.field2716 != null) {
                  class56_68 = new class56();
                  class56_68.field506 = class230_9;
                  class56_68.field512 = class230_9.field2716;
                  client.field638.addLast(class56_68);
                }

                if (client.field774 > class230_9.field2697 && class230_9.field2693 != null) {
                  class56_68 = new class56();
                  class56_68.field506 = class230_9;
                  class56_68.field512 = class230_9.field2693;
                  client.field638.addLast(class56_68);
                }

                if (client.field775 > class230_9.field2697 && class230_9.field2712 != null) {
                  class56_68 = new class56();
                  class56_68.field506 = class230_9;
                  class56_68.field512 = class230_9.field2712;
                  client.field638.addLast(class56_68);
                }

                class230_9.field2697 = client.field801;
                if (class230_9.field2637 != null) {
                  for (i_43 = 0; i_43 < client.field799; i_43++) {
                    class56 class56_69 = new class56();
                    class56_69.field506 = class230_9;
                    class56_69.field509 = client.field773[i_43];
                    class56_69.field513 = client.field800[i_43];
                    class56_69.field512 = class230_9.field2637;
                    client.field638.addLast(class56_69);
                  }
                }
              }
            }

            if (!class230_9.field2604 && client.field583 == null && class276.field3559 == null
                && !client.field716) {
              if ((class230_9.field2713 >= 0 || class230_9.field2632 != 0)
                  && Mouse.field425 >= i_12 && Mouse.field426 * 673804999 >= i_13
                  && Mouse.field425 < i_14 && Mouse.field426 * 673804999 < i_15) {
                if (class230_9.field2713 >= 0) {
                  class143.field1897 = arr_0[class230_9.field2713];
                } else {
                  class143.field1897 = class230_9;
                }
              }

              if (class230_9.field2721 == 8 && Mouse.field425 >= i_12
                  && Mouse.field426 * 673804999 >= i_13 && Mouse.field425 < i_14
                  && Mouse.field426 * 673804999 < i_15) {
                class141.field1888 = class230_9;
              }

              if (class230_9.field2629 > class230_9.field2621) {
                i_42 = i_10 + class230_9.field2675;
                i_20 = class230_9.field2621;
                i_43 = class230_9.field2629;
                i_22 = Mouse.field425;
                i_23 = Mouse.field426 * 673804999;
                if (client.field746) {
                  client.field660 = 32;
                } else {
                  client.field660 = 0;
                }

                client.field746 = false;
                if (Mouse.field419 == 1 || !class253.field3229 && Mouse.field419 == 4) {
                  if (i_22 >= i_42 && i_22 < i_42 + 16 && i_23 >= i_11 && i_23 < i_11 + 16) {
                    class230_9.field2663 -= 4;
                    class60.method1114(class230_9);
                  } else if (i_22 >= i_42 && i_22 < i_42 + 16 && i_23 >= i_11 + i_20 - 16
                      && i_23 < i_11 + i_20) {
                    class230_9.field2663 += 4;
                    class60.method1114(class230_9);
                  } else if (i_22 >= i_42 - client.field660 && i_22 < i_42 + client.field660 + 16
                      && i_23 >= i_11 + 16 && i_23 < i_11 + i_20 - 16) {
                    i_24 = i_20 * (i_20 - 32) / i_43;
                    if (i_24 < 8) {
                      i_24 = 8;
                    }

                    i_25 = i_23 - i_11 - 16 - i_24 / 2;
                    int i_48 = i_20 - 32 - i_24;
                    class230_9.field2663 = i_25 * (i_43 - i_20) / i_48;
                    class60.method1114(class230_9);
                    client.field746 = true;
                  }
                }

                if (client.field695 != 0) {
                  i_24 = class230_9.field2675;
                  if (i_22 >= i_42 - i_24 && i_23 >= i_11 && i_22 < i_42 + 16
                      && i_23 <= i_20 + i_11) {
                    class230_9.field2663 += client.field695 * 45;
                    class60.method1114(class230_9);
                  }
                }
              }
            }
          }
        }
      }
    }

  }

  @ObfuscatedName("jw")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1351336355"
  )
  static final void method110(String string_0) {
    if (!string_0.equals("")) {
      OutboundPacket class172_1 = OutboundPacket
          .createOutboundPacket(OutboundPacketDescriptor.field2153, client.field626.field1218);
      class172_1.buffer.putInt8(class316.method5820(string_0));
      class172_1.buffer.method3699(string_0);
      client.field626.method1980(class172_1);
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(FB)Z",
      garbageValue = "-53"
  )
  boolean method103(float f_1) {
    return f_1 >= (float) this.field76;
  }

}
