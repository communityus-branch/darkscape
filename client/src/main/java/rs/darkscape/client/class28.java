package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public class class28 {

  @ObfuscatedName("ph")
  @ObfuscatedSignature(
      signature = "Lcx;"
  )
  static class95 field244;
  @ObfuscatedName("bo")
  static String field238;
  @ObfuscatedName("bx")
  @ObfuscatedSignature(
      signature = "[Lly;"
  )
  static class317[] field237;
  @ObfuscatedName("ex")
  @ObfuscatedSignature(
      signature = "Ler;"
  )
  static class135 field249;
  @ObfuscatedName("fc")
  @ObfuscatedSignature(
      signature = "Ldm;"
  )
  static class125 field248;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -634505767
  )
  public final int field240;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lha;"
  )
  public final class226 field243;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lha;"
  )
  public final class226 field236;
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Ld;"
  )
  final class22 field246;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -39739323
  )
  final int field242;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 1039553607
  )
  final int field239;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -1300917331
  )
  int field235;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 484533419
  )
  int field245;

  @ObfuscatedSignature(
      signature = "(ILha;Lha;Ld;)V"
  )
  class28(int i_1, class226 class226_2, class226 class226_3, class22 class22_4) {
    this.field240 = i_1;
    this.field243 = class226_2;
    this.field236 = class226_3;
    this.field246 = class22_4;
    class255 class255_5 = class255.field3246[this.field240];
    class318 class318_6 = class255_5.method4815(false);
    if (class318_6 != null) {
      this.field242 = class318_6.field3787;
      this.field239 = class318_6.field3788;
    } else {
      this.field242 = 0;
      this.field239 = 0;
    }

  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1804250172"
  )
  static final void method475() {
    Object obj_10000 = null;
    String str_0 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
    class143.method3172(30, "", str_0);
  }

  @ObfuscatedName("if")
  @ObfuscatedSignature(
      signature = "(Ljq;IIII)V",
      garbageValue = "-801364707"
  )
  static final void method474(class271 class271_0, int i_1, int i_2, int i_3) {
    if (client.field771 < 400) {
      if (class271_0.field3516 != null) {
        class271_0 = class271_0.method5189();
      }

      if (class271_0 != null) {
        if (class271_0.field3504) {
          if (!class271_0.field3517 || client.field748 == i_1) {
            String string_4 = class271_0.field3491;
            if (class271_0.field3508 != 0) {
              string_4 =
                  string_4 + class135.method3113(class271_0.field3508, class138.field1876.field551)
                      + " " + " (" + "level-" + class271_0.field3508 + ")";
            }

            if (class271_0.field3517 && client.field725) {
              class50
                  .method993("Examine", class6.method71(16776960) + string_4, 1003, i_1, i_2, i_3);
            }

            if (client.field733 == 1) {
              class50.method993("Use",
                                client.field734 + " " + "->" + " " + class6.method71(16776960)
                                    + string_4, 7, i_1, i_2, i_3);
            } else if (client.field785) {
              if ((class63.field932 & 0x2) == 2) {
                class50.method993(client.field612,
                                  client.field739 + " " + "->" + " " + class6.method71(16776960)
                                      + string_4, 8, i_1, i_2, i_3);
              }
            } else {
              int i_5 = class271_0.field3517 && client.field725 ? 2000 : 0;
              String[] arr_6 = class271_0.field3506;
              int i_7;
              int i_8;
              if (arr_6 != null) {
                for (i_7 = 4; i_7 >= 0; --i_7) {
                  if (arr_6[i_7] != null && !arr_6[i_7].equalsIgnoreCase("Attack")) {
                    i_8 = 0;
                    if (i_7 == 0) {
                      i_8 = i_5 + 9;
                    }

                    if (i_7 == 1) {
                      i_8 = i_5 + 10;
                    }

                    if (i_7 == 2) {
                      i_8 = i_5 + 11;
                    }

                    if (i_7 == 3) {
                      i_8 = i_5 + 12;
                    }

                    if (i_7 == 4) {
                      i_8 = i_5 + 13;
                    }

                    class50
                        .method993(arr_6[i_7], class6.method71(16776960) + string_4, i_8, i_1, i_2,
                                   i_3);
                  }
                }
              }

              if (arr_6 != null) {
                for (i_7 = 4; i_7 >= 0; --i_7) {
                  if (arr_6[i_7] != null && arr_6[i_7].equalsIgnoreCase("Attack")) {
                    short s_9 = 0;
                    if (client.field780 != class77.field1074) {
                      if (client.field780 == class77.field1075
                          || class77.field1080 == client.field780
                          && class271_0.field3508 > class138.field1876.field551) {
                        s_9 = 2000;
                      }

                      i_8 = 0;
                      if (i_7 == 0) {
                        i_8 = s_9 + 9;
                      }

                      if (i_7 == 1) {
                        i_8 = s_9 + 10;
                      }

                      if (i_7 == 2) {
                        i_8 = s_9 + 11;
                      }

                      if (i_7 == 3) {
                        i_8 = s_9 + 12;
                      }

                      if (i_7 == 4) {
                        i_8 = s_9 + 13;
                      }

                      class50.method993(arr_6[i_7], class6.method71(16776960) + string_4, i_8, i_1,
                                        i_2, i_3);
                    }
                  }
                }
              }

              if (!class271_0.field3517 || !client.field725) {
                class50.method993("Examine", class6.method71(16776960) + string_4, 1003, i_1, i_2,
                                  i_3);
              }
            }

          }
        }
      }
    }
  }

  @ObfuscatedName("iw")
  @ObfuscatedSignature(
      signature = "([Lhi;IIIIIIIII)V",
      garbageValue = "1699160696"
  )
  static final void method467(class230[] arr_0, int i_1, int i_2, int i_3, int i_4, int i_5,
                              int i_6, int i_7, int i_8) {
    class314.method5720(i_2, i_3, i_4, i_5);
    class122.method2862();

    for (int i_9 = 0; i_9 < arr_0.length; i_9++) {
      class230 class230_10 = arr_0[i_9];
      if (class230_10 != null && (class230_10.field2605 == i_1
          || i_1 == -1412584499 && class230_10 == client.field583)) {
        int i_11;
        if (i_8 == -1) {
          client.field786[client.field603] = class230_10.field2618 + i_6;
          client.field787[client.field603] = i_7 + class230_10.field2619;
          client.field641[client.field603] = class230_10.field2675;
          client.field789[client.field603] = class230_10.field2621;
          i_11 = ++client.field603 - 1;
        } else {
          i_11 = i_8;
        }

        class230_10.field2737 = i_11;
        class230_10.field2627 = client.field591;
        if (!class230_10.field2604 || !class81.method1885(class230_10)) {
          int i_12;
          if (class230_10.field2609 > 0) {
            i_12 = class230_10.field2609;
            if (i_12 == 324) {
              if (client.field842 == -1) {
                client.field842 = class230_10.field2640;
                client.field586 = class230_10.field2641;
              }

              if (client.field841.field2571) {
                class230_10.field2640 = client.field842;
              } else {
                class230_10.field2640 = client.field586;
              }
            } else if (i_12 == 325) {
              if (client.field842 == -1) {
                client.field842 = class230_10.field2640;
                client.field586 = class230_10.field2641;
              }

              if (client.field841.field2571) {
                class230_10.field2640 = client.field586;
              } else {
                class230_10.field2640 = client.field842;
              }
            } else if (i_12 == 327) {
              class230_10.field2656 = 150;
              class230_10.field2657 =
                  (int) (Math.sin((double) client.field591 / 40.0D) * 256.0D) & 0x7ff;
              class230_10.field2665 = 5;
              class230_10.field2593 = 0;
            } else if (i_12 == 328) {
              class230_10.field2656 = 150;
              class230_10.field2657 =
                  (int) (Math.sin((double) client.field591 / 40.0D) * 256.0D) & 0x7ff;
              class230_10.field2665 = 5;
              class230_10.field2593 = 1;
            }
          }

          i_12 = class230_10.field2618 + i_6;
          int i_13 = i_7 + class230_10.field2619;
          int i_14 = class230_10.field2636;
          int i_15;
          int i_16;
          if (class230_10 == client.field583) {
            if (i_1 != -1412584499 && !class230_10.field2634) {
              class132.field1814 = arr_0;
              class297.field3687 = i_6;
              class1.field15 = i_7;
              continue;
            }

            if (client.field763 && client.field601) {
              i_15 = Mouse.field425;
              i_16 = Mouse.field426 * 673804999;
              i_15 -= client.field753;
              i_16 -= client.field749;
              if (i_15 < client.field757) {
                i_15 = client.field757;
              }

              if (i_15 + class230_10.field2675 > client.field757 + client.field752.field2675) {
                i_15 = client.field757 + client.field752.field2675 - class230_10.field2675;
              }

              if (i_16 < client.field758) {
                i_16 = client.field758;
              }

              if (i_16 + class230_10.field2621 > client.field758 + client.field752.field2621) {
                i_16 = client.field758 + client.field752.field2621 - class230_10.field2621;
              }

              i_12 = i_15;
              i_13 = i_16;
            }

            if (!class230_10.field2634) {
              i_14 = 128;
            }
          }

          int i_17;
          int i_18;
          int i_19;
          int i_20;
          int i_21;
          int i_22;
          if (class230_10.field2721 == 2) {
            i_15 = i_2;
            i_16 = i_3;
            i_17 = i_4;
            i_18 = i_5;
          } else if (class230_10.field2721 == 9) {
            i_19 = i_12;
            i_20 = i_13;
            i_21 = i_12 + class230_10.field2675;
            i_22 = i_13 + class230_10.field2621;
            if (i_21 < i_12) {
              i_19 = i_21;
              i_21 = i_12;
            }

            if (i_22 < i_13) {
              i_20 = i_22;
              i_22 = i_13;
            }

            ++i_21;
            ++i_22;
            i_15 = i_19 > i_2 ? i_19 : i_2;
            i_16 = i_20 > i_3 ? i_20 : i_3;
            i_17 = i_21 < i_4 ? i_21 : i_4;
            i_18 = i_22 < i_5 ? i_22 : i_5;
          } else {
            i_19 = i_12 + class230_10.field2675;
            i_20 = i_13 + class230_10.field2621;
            i_15 = i_12 > i_2 ? i_12 : i_2;
            i_16 = i_13 > i_3 ? i_13 : i_3;
            i_17 = i_19 < i_4 ? i_19 : i_4;
            i_18 = i_20 < i_5 ? i_20 : i_5;
          }

          if (!class230_10.field2604 || i_15 < i_17 && i_16 < i_18) {
            int i_23;
            int i_25;
            int i_26;
            int i_27;
            int i_28;
            int i_29;
            int i_30;
            int i_31;
            int i_33;
            int i_34;
            int i_35;
            int i_37;
            int i_39;
            int i_40;
            int i_41;
            int i_43;
            int i_44;
            int i_45;
            int i_49;
            int i_52;
            if (class230_10.field2609 != 0) {
              if (class230_10.field2609 == 1336) {
                if (client.field597) {
                  i_13 += 15;
                  class63.field933
                      .method5524("Fps:" + class47.field393, i_12 + class230_10.field2675, i_13,
                                  16776960, -1);
                  i_13 += 15;
                  Runtime runtime_68 = Runtime.getRuntime();
                  i_20 = (int) ((runtime_68.totalMemory() - runtime_68.freeMemory()) / 1024L);
                  i_21 = 16776960;
                  if (i_20 > 327680 && !client.field585) {
                    i_21 = 16711680;
                  }

                  class63.field933
                      .method5524("Mem:" + i_20 + "k", i_12 + class230_10.field2675, i_13, i_21,
                                  -1);
                  i_13 += 15;
                }
                continue;
              }

              if (class230_10.field2609 == 1337) {
                client.field729 = i_12;
                client.field730 = i_13;
                i_21 = class230_10.field2675;
                i_22 = class230_10.field2621;
                ++client.field687;
                class148.method3198();
                StorageVolume.method3380();
                class54.method1019();
                class24.method424(true);
                class67.method1655();
                class24.method424(false);

                for (class79 class79_70 = (class79) client.field710.getFirst();
                    class79_70 != null; class79_70 = (class79) client.field710.getNext()) {
                  if (class79_70.field1121 == class13.field82
                      && client.field591 <= class79_70.field1127) {
                    if (client.field591 >= class79_70.field1126) {
                      if (class79_70.field1135 > 0) {
                        class72 class72_59 = client.field843[class79_70.field1135 - 1];
                        if (class72_59 != null && class72_59.field931 >= 0
                            && class72_59.field931 < 13312 && class72_59.field881 >= 0
                            && class72_59.field881 < 13312) {
                          class79_70.method1849(class72_59.field931, class72_59.field881, class27
                                                    .method460(class72_59.field931, class72_59.field881,
                                                               class79_70.field1121) - class79_70.field1123,
                                                client.field591);
                        }
                      }

                      if (class79_70.field1135 < 0) {
                        i_25 = -class79_70.field1135 - 1;
                        class60 class60_60;
                        if (i_25 == client.field628) {
                          class60_60 = class138.field1876;
                        } else {
                          class60_60 = client.field610[i_25];
                        }

                        if (class60_60 != null && class60_60.field931 >= 0
                            && class60_60.field931 < 13312 && class60_60.field881 >= 0
                            && class60_60.field881 < 13312) {
                          class79_70.method1849(class60_60.field931, class60_60.field881, class27
                                                    .method460(class60_60.field931, class60_60.field881,
                                                               class79_70.field1121) - class79_70.field1123,
                                                client.field591);
                        }
                      }

                      class79_70.method1850(client.field700);
                      field248.method2883(class13.field82, (int) class79_70.field1144,
                                          (int) class79_70.field1125, (int) class79_70.field1137,
                                          60, class79_70, class79_70.field1140, -1L, false);
                    }
                  } else {
                    class79_70.unlinkNode();
                  }
                }

                for (class70 class70_71 = (class70) client.field711.getFirst();
                    class70_71 != null; class70_71 = (class70) client.field711.getNext()) {
                  if (class70_71.field1014 == class13.field82 && !class70_71.field1021) {
                    if (client.field591 >= class70_71.field1012) {
                      class70_71.method1771(client.field700);
                      if (class70_71.field1021) {
                        class70_71.unlinkNode();
                      } else {
                        field248.method2883(class70_71.field1014, class70_71.field1015,
                                            class70_71.field1016, class70_71.field1017, 60,
                                            class70_71, 0, -1L, false);
                      }
                    }
                  } else {
                    class70_71.unlinkNode();
                  }
                }

                class43.method714(i_12, i_13, i_21, i_22, true);
                i_19 = client.field762;
                i_20 = client.field837;
                i_21 = client.field838;
                i_22 = client.field662;
                class314.method5720(i_19, i_20, i_21 + i_19, i_22 + i_20);
                class122.method2862();
                if (!client.field822) {
                  i_23 = client.field649;
                  if (client.field738 / 256 > i_23) {
                    i_23 = client.field738 / 256;
                  }

                  if (client.field823[4] && client.field825[4] + 128 > i_23) {
                    i_23 = client.field825[4] + 128;
                  }

                  i_49 = client.field717 & 0x7ff;
                  class49
                      .method951(BufferedFile.field1428, class269.field3478, class2.field23, i_23,
                                 i_49, i_23 * 3 + 600);
                }

                if (!client.field822) {
                  i_23 = class12.method108();
                } else {
                  if (class10.field61.field960) {
                    i_49 = class13.field82;
                  } else {
                    i_25 = class27
                        .method460(BufferedFile.field1431, class226.field2563, class13.field82);
                    if (i_25 - class123.field1702 < 800 && (class50.field443[class13.field82][
                        BufferedFile.field1431 >> 7][class226.field2563 >> 7] & 0x4) != 0) {
                      i_49 = class13.field82;
                    } else {
                      i_49 = 3;
                    }
                  }

                  i_23 = i_49;
                }

                i_49 = BufferedFile.field1431;
                i_25 = class123.field1702;
                i_26 = class226.field2563;
                i_27 = class7.field41;
                i_28 = class85.field1201;

                for (i_29 = 0; i_29 < 5; i_29++) {
                  if (client.field823[i_29]) {
                    i_30 = (int) (Math.random() * (double) (client.field824[i_29] * 2 + 1)
                        - (double) client.field824[i_29] + Math.sin(
                        (double) client.field705[i_29] * ((double) client.field826[i_29] / 100.0D))
                        * (double) client.field825[i_29]);
                    if (i_29 == 0) {
                      BufferedFile.field1431 += i_30;
                    }

                    if (i_29 == 1) {
                      class123.field1702 += i_30;
                    }

                    if (i_29 == 2) {
                      class226.field2563 += i_30;
                    }

                    if (i_29 == 3) {
                      class85.field1201 = i_30 + class85.field1201 & 0x7ff;
                    }

                    if (i_29 == 4) {
                      class7.field41 += i_30;
                      if (class7.field41 < 128) {
                        class7.field41 = 128;
                      }

                      if (class7.field41 > 383) {
                        class7.field41 = 383;
                      }
                    }
                  }
                }

                i_29 = Mouse.field425;
                i_30 = Mouse.field426 * 673804999;
                if (Mouse.field431 != 0) {
                  i_29 = Mouse.field432;
                  i_30 = Mouse.field428;
                }

                if (i_29 >= i_19 && i_29 < i_19 + i_21 && i_30 >= i_20 && i_30 < i_20 + i_22) {
                  class47.method913(i_29 - i_19, i_30 - i_20);
                } else {
                  class120.field1650 = false;
                  class120.field1656 = 0;
                }

                class54.method1017();
                class314.method5763(i_19, i_20, i_21, i_22, 0);
                class54.method1017();
                i_31 = class122.field1678;
                class122.field1678 = client.field840;
                field248.method2912(BufferedFile.field1431, class123.field1702, class226.field2563,
                                    class7.field41, class85.field1201, i_23);
                class122.field1678 = i_31;
                class54.method1017();
                field248.method3017();
                client.field667 = 0;
                boolean bool_62 = false;
                i_33 = -1;
                i_34 = -1;
                i_35 = class81.field1167;
                int[] ints_36 = class81.field1159;

                for (i_37 = 0; i_37 < i_35 + client.field622; i_37++) {
                  Object obj_38;
                  if (i_37 < i_35) {
                    obj_38 = client.field610[ints_36[i_37]];
                    if (ints_36[i_37] == client.field707) {
                      bool_62 = true;
                      i_33 = i_37;
                      continue;
                    }

                    if (obj_38 == class138.field1876) {
                      i_34 = i_37;
                      continue;
                    }
                  } else {
                    obj_38 = client.field843[client.field639[i_37 - i_35]];
                  }

                  class35.method628((class63) obj_38, i_37, i_19, i_20, i_21, i_22);
                }

                if (client.field699 && i_34 != -1) {
                  class35.method628(class138.field1876, i_34, i_19, i_20, i_21, i_22);
                }

                if (bool_62) {
                  class35.method628(client.field610[client.field707], i_33, i_19, i_20, i_21, i_22);
                }

                for (i_37 = 0; i_37 < client.field667; i_37++) {
                  i_52 = client.field669[i_37];
                  i_39 = client.field670[i_37];
                  i_40 = client.field672[i_37];
                  i_41 = client.field671[i_37];
                  boolean bool_63 = true;

                  while (bool_63) {
                    bool_63 = false;

                    for (i_43 = 0; i_43 < i_37; i_43++) {
                      if (i_39 + 2 > client.field670[i_43] - client.field671[i_43]
                          && i_39 - i_41 < client.field670[i_43] + 2
                          && i_52 - i_40 < client.field672[i_43] + client.field669[i_43]
                          && i_40 + i_52 > client.field669[i_43] - client.field672[i_43]
                          && client.field670[i_43] - client.field671[i_43] < i_39) {
                        i_39 = client.field670[i_43] - client.field671[i_43];
                        bool_63 = true;
                      }
                    }
                  }

                  client.field679 = client.field669[i_37];
                  client.field680 = client.field670[i_37] = i_39;
                  String string_53 = client.field721[i_37];
                  if (client.field742 == 0) {
                    i_44 = 16776960;
                    if (client.field673[i_37] < 6) {
                      i_44 = client.field731[client.field673[i_37]];
                    }

                    if (client.field673[i_37] == 6) {
                      i_44 = client.field687 % 20 < 10 ? 16711680 : 16776960;
                    }

                    if (client.field673[i_37] == 7) {
                      i_44 = client.field687 % 20 < 10 ? 255 : 65535;
                    }

                    if (client.field673[i_37] == 8) {
                      i_44 = client.field687 % 20 < 10 ? 45056 : 8454016;
                    }

                    if (client.field673[i_37] == 9) {
                      i_45 = 150 - client.field675[i_37];
                      if (i_45 < 50) {
                        i_44 = i_45 * 1280 + 16711680;
                      } else if (i_45 < 100) {
                        i_44 = 16776960 - (i_45 - 50) * 327680;
                      } else if (i_45 < 150) {
                        i_44 = (i_45 - 100) * 5 + 65280;
                      }
                    }

                    if (client.field673[i_37] == 10) {
                      i_45 = 150 - client.field675[i_37];
                      if (i_45 < 50) {
                        i_44 = i_45 * 5 + 16711680;
                      } else if (i_45 < 100) {
                        i_44 = 16711935 - (i_45 - 50) * 327680;
                      } else if (i_45 < 150) {
                        i_44 = (i_45 - 100) * 327680 + 255 - (i_45 - 100) * 5;
                      }
                    }

                    if (client.field673[i_37] == 11) {
                      i_45 = 150 - client.field675[i_37];
                      if (i_45 < 50) {
                        i_44 = 16777215 - i_45 * 327685;
                      } else if (i_45 < 100) {
                        i_44 = (i_45 - 50) * 327685 + 65280;
                      } else if (i_45 < 150) {
                        i_44 = 16777215 - (i_45 - 100) * 327680;
                      }
                    }

                    if (client.field674[i_37] == 0) {
                      class293.field3660
                          .method5525(string_53, i_19 + client.field679, i_20 + client.field680,
                                      i_44, 0);
                    }

                    if (client.field674[i_37] == 1) {
                      class293.field3660
                          .method5609(string_53, i_19 + client.field679, i_20 + client.field680,
                                      i_44, 0, client.field687);
                    }

                    if (client.field674[i_37] == 2) {
                      class293.field3660
                          .method5575(string_53, i_19 + client.field679, i_20 + client.field680,
                                      i_44, 0, client.field687);
                    }

                    if (client.field674[i_37] == 3) {
                      class293.field3660
                          .method5539(string_53, i_19 + client.field679, i_20 + client.field680,
                                      i_44, 0, client.field687, 150 - client.field675[i_37]);
                    }

                    if (client.field674[i_37] == 4) {
                      i_45 =
                          (150 - client.field675[i_37]) * (class293.field3660.method5517(string_53)
                              + 100) / 150;
                      class314.method5790(i_19 + client.field679 - 50, i_20,
                                          i_19 + client.field679 + 50, i_20 + i_22);
                      class293.field3660.method5522(string_53, i_19 + client.field679 + 50 - i_45,
                                                    i_20 + client.field680, i_44, 0);
                      class314.method5720(i_19, i_20, i_19 + i_21, i_22 + i_20);
                    }

                    if (client.field674[i_37] == 5) {
                      i_45 = 150 - client.field675[i_37];
                      int i_46 = 0;
                      if (i_45 < 25) {
                        i_46 = i_45 - 25;
                      } else if (i_45 > 125) {
                        i_46 = i_45 - 125;
                      }

                      class314.method5790(i_19,
                                          i_20 + client.field680 - class293.field3660.field3695 - 1,
                                          i_21 + i_19, i_20 + client.field680 + 5);
                      class293.field3660.method5525(string_53, i_19 + client.field679,
                                                    i_46 + i_20 + client.field680, i_44, 0);
                      class314.method5720(i_19, i_20, i_19 + i_21, i_20 + i_22);
                    }
                  } else {
                    class293.field3660
                        .method5525(string_53, i_19 + client.field679, i_20 + client.field680,
                                    16776960, 0);
                  }
                }

                if (client.field599 == 2) {
                  class238.method4594((client.field602 - class62.field868 << 7) + client.field605,
                                      (client.field818 - client.field754 << 7) + client.field637,
                                      client.field604 * 2);
                  if (client.field679 > -1 && client.field591 % 20 < 10) {
                    class150.field1926[0]
                        .method5851(i_19 + client.field679 - 12, i_20 + client.field680 - 28);
                  }
                }

                ((class111) class122.field1667).method2537(client.field700);
                class16.method158(i_19, i_20, i_21, i_22);
                BufferedFile.field1431 = i_49;
                class123.field1702 = i_25;
                class226.field2563 = i_26;
                class7.field41 = i_27;
                class85.field1201 = i_28;
                if (client.field625 && class185.method3786(true, false) == 0) {
                  client.field625 = false;
                }

                if (client.field625) {
                  class314.method5763(i_19, i_20, i_21, i_22, 0);
                  class83.method1933("Loading - please wait.", false);
                }

                client.field697[class230_10.field2737] = true;
                class314.method5720(i_2, i_3, i_4, i_5);
                continue;
              }

              if (class230_10.field2609 == 1338) {
                class173.method3473(class230_10, i_12, i_13, i_11);
                class314.method5720(i_2, i_3, i_4, i_5);
                continue;
              }

              if (class230_10.field2609 == 1339) {
                class224 class224_67 = class230_10.method4517(false);
                if (class224_67 != null) {
                  if (client.field810 < 3) {
                    class128.field1791
                        .method5845(i_12, i_13, class224_67.field2553, class224_67.field2549, 25,
                                    25, client.field717, 256, class224_67.field2551,
                                    class224_67.field2550);
                  } else {
                    class314
                        .method5742(i_12, i_13, 0, class224_67.field2551, class224_67.field2550);
                  }
                }

                class314.method5720(i_2, i_3, i_4, i_5);
                continue;
              }

              if (class230_10.field2609 == 1400) {
                class53.field476
                    .method6018(i_12, i_13, class230_10.field2675, class230_10.field2621,
                                client.field591);
              }

              if (class230_10.field2609 == 1401) {
                class53.field476
                    .method6022(i_12, i_13, class230_10.field2675, class230_10.field2621);
              }
            }

            boolean bool_57;
            if (class230_10.field2721 == 0) {
              if (!class230_10.field2604) {
                bool_57 = class230_10.field2625;
                if (bool_57 && class230_10 != class143.field1897) {
                  continue;
                }
              }

              if (!class230_10.field2604) {
                if (class230_10.field2663 > class230_10.field2629 - class230_10.field2621) {
                  class230_10.field2663 = class230_10.field2629 - class230_10.field2621;
                }

                if (class230_10.field2663 < 0) {
                  class230_10.field2663 = 0;
                }
              }

              method467(arr_0, class230_10.field2691, i_15, i_16, i_17, i_18,
                        i_12 - class230_10.field2626, i_13 - class230_10.field2663, i_11);
              if (class230_10.field2736 != null) {
                method467(class230_10.field2736, class230_10.field2691, i_15, i_16, i_17, i_18,
                          i_12 - class230_10.field2626, i_13 - class230_10.field2663, i_11);
              }

              class55 class55_47 = (class55) client.field741
                  .get((long) class230_10.field2691);
              if (class55_47 != null) {
                class35.method630(class55_47.field501, i_15, i_16, i_17, i_18, i_12, i_13, i_11);
              }

              class314.method5720(i_2, i_3, i_4, i_5);
              class122.method2862();
            }

            if (client.field792 || client.field723[i_11] || client.field790 > 1) {
              if (class230_10.field2721 == 0 && !class230_10.field2604
                  && class230_10.field2629 > class230_10.field2621) {
                i_19 = i_12 + class230_10.field2675;
                i_20 = class230_10.field2663;
                i_21 = class230_10.field2621;
                i_22 = class230_10.field2629;
                class243.field3139[0].method5829(i_19, i_13);
                class243.field3139[1].method5829(i_19, i_21 + i_13 - 16);
                class314.method5763(i_19, i_13 + 16, 16, i_21 - 32, client.field643);
                i_23 = i_21 * (i_21 - 32) / i_22;
                if (i_23 < 8) {
                  i_23 = 8;
                }

                i_49 = i_20 * (i_21 - 32 - i_23) / (i_22 - i_21);
                class314.method5763(i_19, i_13 + i_49 + 16, 16, i_23, client.field584);
                class314.method5738(i_19, i_49 + i_13 + 16, i_23, client.field646);
                class314.method5738(i_19 + 1, i_13 + i_49 + 16, i_23, client.field646);
                class314.method5736(i_19, i_13 + i_49 + 16, 16, client.field646);
                class314.method5736(i_19, i_49 + i_13 + 17, 16, client.field646);
                class314.method5738(i_19 + 15, i_13 + i_49 + 16, i_23, client.field836);
                class314.method5738(i_19 + 14, i_49 + i_13 + 17, i_23 - 1, client.field836);
                class314.method5736(i_19, i_13 + i_49 + i_23 + 15, 16, client.field836);
                class314.method5736(i_19 + 1, i_49 + i_13 + i_23 + 14, 15, client.field836);
              }

              if (class230_10.field2721 != 1) {
                if (class230_10.field2721 == 2) {
                  i_19 = 0;

                  for (i_20 = 0; i_20 < class230_10.field2617; i_20++) {
                    for (i_21 = 0; i_21 < class230_10.field2616; i_21++) {
                      i_22 = i_12 + i_21 * (class230_10.field2672 + 32);
                      i_23 = i_20 * (class230_10.field2673 + 32) + i_13;
                      if (i_19 < 20) {
                        i_22 += class230_10.field2685[i_19];
                        i_23 += class230_10.field2738[i_19];
                      }

                      if (class230_10.field2724[i_19] <= 0) {
                        if (class230_10.field2676 != null && i_19 < 20) {
                          class318 class318_58 = class230_10.method4509(i_19);
                          if (class318_58 != null) {
                            class318_58.method5851(i_22, i_23);
                          } else if (class230.field2603) {
                            class60.method1114(class230_10);
                          }
                        }
                      } else {
                        boolean bool_72 = false;
                        boolean bool_61 = false;
                        i_26 = class230_10.field2724[i_19] - 1;
                        if (i_22 + 32 > i_2 && i_22 < i_4 && i_23 + 32 > i_3 && i_23 < i_5
                            || class230_10 == class276.field3559 && i_19 == client.field688) {
                          class318 class318_50;
                          if (client.field733 == 1 && i_19 == class13.field84
                              && class230_10.field2691 == class187.field2372) {
                            class318_50 = class21
                                .method276(i_26, class230_10.field2725[i_19], 2, 0, 2, false);
                          } else {
                            class318_50 = class21
                                .method276(i_26, class230_10.field2725[i_19], 1, 3153952, 2, false);
                          }

                          if (class318_50 != null) {
                            if (class230_10 == class276.field3559 && i_19 == client.field688) {
                              i_49 = Mouse.field425 - client.field678;
                              i_25 = Mouse.field426 * 673804999 - client.field821;
                              if (i_49 < 5 && i_49 > -5) {
                                i_49 = 0;
                              }

                              if (i_25 < 5 && i_25 > -5) {
                                i_25 = 0;
                              }

                              if (client.field693 < 5) {
                                i_49 = 0;
                                i_25 = 0;
                              }

                              class318_50.method5857(i_49 + i_22, i_23 + i_25, 128);
                              if (i_1 != -1) {
                                class230 class230_51 = arr_0[i_1 & 0xffff];
                                if (i_25 + i_23 < class314.field3763 && class230_51.field2663 > 0) {
                                  i_29 = (class314.field3763 - i_23 - i_25) * client.field700 / 3;
                                  if (i_29 > client.field700 * 10) {
                                    i_29 = client.field700 * 10;
                                  }

                                  if (i_29 > class230_51.field2663) {
                                    i_29 = class230_51.field2663;
                                  }

                                  class230_51.field2663 -= i_29;
                                  client.field821 += i_29;
                                  class60.method1114(class230_51);
                                }

                                if (i_25 + i_23 + 32 > class314.field3764 && class230_51.field2663
                                    < class230_51.field2629 - class230_51.field2621) {
                                  i_29 =
                                      (i_25 + i_23 + 32 - class314.field3764) * client.field700 / 3;
                                  if (i_29 > client.field700 * 10) {
                                    i_29 = client.field700 * 10;
                                  }

                                  if (i_29 > class230_51.field2629 - class230_51.field2621
                                      - class230_51.field2663) {
                                    i_29 = class230_51.field2629 - class230_51.field2621
                                        - class230_51.field2663;
                                  }

                                  class230_51.field2663 += i_29;
                                  client.field821 -= i_29;
                                  class60.method1114(class230_51);
                                }
                              }
                            } else if (class230_10 == class240.field3096
                                && i_19 == client.field582) {
                              class318_50.method5857(i_22, i_23, 128);
                            } else {
                              class318_50.method5851(i_22, i_23);
                            }
                          } else {
                            class60.method1114(class230_10);
                          }
                        }
                      }

                      ++i_19;
                    }
                  }
                } else if (class230_10.field2721 == 3) {
                  if (class132.method3097(class230_10)) {
                    i_19 = class230_10.field2631;
                    if (class230_10 == class143.field1897 && class230_10.field2633 != 0) {
                      i_19 = class230_10.field2633;
                    }
                  } else {
                    i_19 = class230_10.field2630;
                    if (class230_10 == class143.field1897 && class230_10.field2632 != 0) {
                      i_19 = class230_10.field2632;
                    }
                  }

                  if (class230_10.field2710) {
                    switch (class230_10.field2701.field3776) {
                      case 1:
                        class314
                            .method5728(i_12, i_13, class230_10.field2675, class230_10.field2621,
                                        class230_10.field2630, class230_10.field2631,
                                        256 - (class230_10.field2636 & 0xff),
                                        256 - (class230_10.field2608 & 0xff));
                        break;
                      case 2:
                        class314
                            .method5729(i_12, i_13, class230_10.field2675, class230_10.field2621,
                                        class230_10.field2630, class230_10.field2631,
                                        256 - (class230_10.field2636 & 0xff),
                                        256 - (class230_10.field2608 & 0xff));
                        break;
                      case 3:
                        class314
                            .method5739(i_12, i_13, class230_10.field2675, class230_10.field2621,
                                        class230_10.field2630, class230_10.field2631,
                                        256 - (class230_10.field2636 & 0xff),
                                        256 - (class230_10.field2608 & 0xff));
                        break;
                      case 4:
                        class314
                            .method5726(i_12, i_13, class230_10.field2675, class230_10.field2621,
                                        class230_10.field2630, class230_10.field2631,
                                        256 - (class230_10.field2636 & 0xff),
                                        256 - (class230_10.field2608 & 0xff));
                        break;
                      default:
                        if (i_14 == 0) {
                          class314
                              .method5763(i_12, i_13, class230_10.field2675, class230_10.field2621,
                                          i_19);
                        } else {
                          class314
                              .method5727(i_12, i_13, class230_10.field2675, class230_10.field2621,
                                          i_19, 256 - (i_14 & 0xff));
                        }
                    }
                  } else if (i_14 == 0) {
                    class314
                        .method5734(i_12, i_13, class230_10.field2675, class230_10.field2621, i_19);
                  } else {
                    class314
                        .method5741(i_12, i_13, class230_10.field2675, class230_10.field2621, i_19,
                                    256 - (i_14 & 0xff));
                  }
                } else {
                  class298 class298_64;
                  if (class230_10.field2721 == 4) {
                    class298_64 = class230_10.method4545();
                    if (class298_64 == null) {
                      if (class230.field2603) {
                        class60.method1114(class230_10);
                      }
                    } else {
                      String string_74 = class230_10.field2667;
                      if (class132.method3097(class230_10)) {
                        i_20 = class230_10.field2631;
                        if (class230_10 == class143.field1897 && class230_10.field2633 != 0) {
                          i_20 = class230_10.field2633;
                        }

                        if (class230_10.field2717.length() > 0) {
                          string_74 = class230_10.field2717;
                        }
                      } else {
                        i_20 = class230_10.field2630;
                        if (class230_10 == class143.field1897 && class230_10.field2632 != 0) {
                          i_20 = class230_10.field2632;
                        }
                      }

                      if (class230_10.field2604 && class230_10.field2649 != -1) {
                        class269 class269_75 = class111.method2563(class230_10.field2649);
                        string_74 = class269_75.field3433;
                        if (string_74 == null) {
                          string_74 = "null";
                        }

                        if ((class269_75.field3444 == 1 || class230_10.field2727 != 1)
                            && class230_10.field2727 != -1) {
                          string_74 =
                              class6.method71(16748608) + string_74 + "</col>" + " " + 'x' + class35
                                  .method623(class230_10.field2727);
                        }
                      }

                      if (class230_10 == client.field744) {
                        string_74 = "Please wait...";
                        i_20 = class230_10.field2630;
                      }

                      if (!class230_10.field2604) {
                        string_74 = class1.method11(string_74, class230_10);
                      }

                      class298_64.method5526(string_74, i_12, i_13, class230_10.field2675,
                                             class230_10.field2621, i_20,
                                             class230_10.field2671 ? 0 : -1, class230_10.field2669,
                                             class230_10.field2681, class230_10.field2668);
                    }
                  } else if (class230_10.field2721 == 5) {
                    class318 class318_65;
                    if (!class230_10.field2604) {
                      class318_65 = class230_10.method4508(class132.method3097(class230_10));
                      if (class318_65 != null) {
                        class318_65.method5851(i_12, i_13);
                      } else if (class230.field2603) {
                        class60.method1114(class230_10);
                      }
                    } else {
                      if (class230_10.field2649 != -1) {
                        class318_65 = class21
                            .method276(class230_10.field2649, class230_10.field2727,
                                       class230_10.field2644, class230_10.field2645,
                                       class230_10.field2664, false);
                      } else {
                        class318_65 = class230_10.method4508(false);
                      }

                      if (class318_65 == null) {
                        if (class230.field2603) {
                          class60.method1114(class230_10);
                        }
                      } else {
                        i_20 = class318_65.field3796;
                        i_21 = class318_65.field3792;
                        if (!class230_10.field2643) {
                          i_22 = class230_10.field2675 * 4096 / i_20;
                          if (class230_10.field2596 != 0) {
                            class318_65.method5870(class230_10.field2675 / 2 + i_12,
                                                   class230_10.field2621 / 2 + i_13,
                                                   class230_10.field2596, i_22);
                          } else if (i_14 != 0) {
                            class318_65.method5856(i_12, i_13, class230_10.field2675,
                                                   class230_10.field2621, 256 - (i_14 & 0xff));
                          } else if (i_20 == class230_10.field2675
                              && i_21 == class230_10.field2621) {
                            class318_65.method5851(i_12, i_13);
                          } else {
                            class318_65.method5853(i_12, i_13, class230_10.field2675,
                                                   class230_10.field2621);
                          }
                        } else {
                          class314.method5790(i_12, i_13, i_12 + class230_10.field2675,
                                              i_13 + class230_10.field2621);
                          i_22 = (i_20 - 1 + class230_10.field2675) / i_20;
                          i_23 = (i_21 - 1 + class230_10.field2621) / i_21;

                          for (i_49 = 0; i_49 < i_22; i_49++) {
                            for (i_25 = 0; i_25 < i_23; i_25++) {
                              if (class230_10.field2596 != 0) {
                                class318_65.method5870(i_20 / 2 + i_12 + i_49 * i_20,
                                                       i_21 / 2 + i_13 + i_21 * i_25,
                                                       class230_10.field2596, 4096);
                              } else if (i_14 != 0) {
                                class318_65.method5857(i_12 + i_49 * i_20, i_13 + i_21 * i_25,
                                                       256 - (i_14 & 0xff));
                              } else {
                                class318_65.method5851(i_12 + i_20 * i_49, i_13 + i_21 * i_25);
                              }
                            }
                          }

                          class314.method5720(i_2, i_3, i_4, i_5);
                        }
                      }
                    }
                  } else {
                    class269 class269_48;
                    if (class230_10.field2721 == 6) {
                      bool_57 = class132.method3097(class230_10);
                      if (bool_57) {
                        i_20 = class230_10.field2653;
                      } else {
                        i_20 = class230_10.field2595;
                      }

                      class119 class119_73 = null;
                      i_22 = 0;
                      if (class230_10.field2649 != -1) {
                        class269_48 = class111.method2563(class230_10.field2649);
                        if (class269_48 != null) {
                          class269_48 = class269_48.method5094(class230_10.field2727);
                          class119_73 = class269_48.method5093(1);
                          if (class119_73 != null) {
                            class119_73.method2670();
                            i_22 = class119_73.field1781 / 2;
                          } else {
                            class60.method1114(class230_10);
                          }
                        }
                      } else if (class230_10.field2665 == 5) {
                        if (class230_10.field2593 == 0) {
                          class119_73 = client.field841
                              .method4468((class273) null, -1, (class273) null, -1);
                        } else {
                          class119_73 = class138.field1876.vmethod3067();
                        }
                      } else if (i_20 == -1) {
                        class119_73 = class230_10
                            .method4510((class273) null, -1, bool_57, class138.field1876.field546);
                        if (class119_73 == null && class230.field2603) {
                          class60.method1114(class230_10);
                        }
                      } else {
                        class273 class273_69 = class3.method25(i_20);
                        class119_73 = class230_10
                            .method4510(class273_69, class230_10.field2728, bool_57,
                                        class138.field1876.field546);
                        if (class119_73 == null && class230.field2603) {
                          class60.method1114(class230_10);
                        }
                      }

                      class122.method2827(class230_10.field2675 / 2 + i_12,
                                          class230_10.field2621 / 2 + i_13);
                      i_23 =
                          class122.field1681[class230_10.field2656] * class230_10.field2704 >> 16;
                      i_49 =
                          class122.field1693[class230_10.field2656] * class230_10.field2704 >> 16;
                      if (class119_73 != null) {
                        if (!class230_10.field2604) {
                          class119_73
                              .method2682(0, class230_10.field2657, 0, class230_10.field2656, 0,
                                          i_23, i_49);
                        } else {
                          class119_73.method2670();
                          if (class230_10.field2662) {
                            class119_73.method2710(0, class230_10.field2657, class230_10.field2658,
                                                   class230_10.field2656, class230_10.field2592,
                                                   i_23 + i_22 + class230_10.field2655,
                                                   i_49 + class230_10.field2655,
                                                   class230_10.field2704);
                          } else {
                            class119_73.method2682(0, class230_10.field2657, class230_10.field2658,
                                                   class230_10.field2656, class230_10.field2592,
                                                   i_22 + i_23 + class230_10.field2655,
                                                   i_49 + class230_10.field2655);
                          }
                        }
                      }

                      class122.method2832();
                    } else {
                      if (class230_10.field2721 == 7) {
                        class298_64 = class230_10.method4545();
                        if (class298_64 == null) {
                          if (class230.field2603) {
                            class60.method1114(class230_10);
                          }
                          continue;
                        }

                        i_20 = 0;

                        for (i_21 = 0; i_21 < class230_10.field2617; i_21++) {
                          for (i_22 = 0; i_22 < class230_10.field2616; i_22++) {
                            if (class230_10.field2724[i_20] > 0) {
                              class269_48 = class111.method2563(class230_10.field2724[i_20] - 1);
                              String string_24;
                              if (class269_48.field3444 != 1 && class230_10.field2725[i_20] == 1) {
                                string_24 =
                                    class6.method71(16748608) + class269_48.field3433 + "</col>";
                              } else {
                                string_24 =
                                    class6.method71(16748608) + class269_48.field3433 + "</col>"
                                        + " " + 'x' + class35
                                        .method623(class230_10.field2725[i_20]);
                              }

                              i_25 = i_22 * (class230_10.field2672 + 115) + i_12;
                              i_26 = i_13 + (class230_10.field2673 + 12) * i_21;
                              if (class230_10.field2669 == 0) {
                                class298_64.method5522(string_24, i_25, i_26, class230_10.field2630,
                                                       class230_10.field2671 ? 0 : -1);
                              } else if (class230_10.field2669 == 1) {
                                class298_64
                                    .method5525(string_24, class230_10.field2675 / 2 + i_25, i_26,
                                                class230_10.field2630,
                                                class230_10.field2671 ? 0 : -1);
                              } else {
                                class298_64
                                    .method5524(string_24, i_25 + class230_10.field2675 - 1, i_26,
                                                class230_10.field2630,
                                                class230_10.field2671 ? 0 : -1);
                              }
                            }

                            ++i_20;
                          }
                        }
                      }

                      if (class230_10.field2721 == 8 && class230_10 == class141.field1888
                          && client.field623 == client.field732) {
                        i_19 = 0;
                        i_20 = 0;
                        class298 class298_54 = class63.field933;
                        String string_55 = class230_10.field2667;

                        String string_66;
                        for (string_55 = class1.method11(string_55, class230_10);
                            string_55.length() > 0; i_20 = i_20 + class298_54.field3695 + 1) {
                          i_49 = string_55.indexOf("<br>");
                          if (i_49 != -1) {
                            string_66 = string_55.substring(0, i_49);
                            string_55 = string_55.substring(i_49 + 4);
                          } else {
                            string_66 = string_55;
                            string_55 = "";
                          }

                          i_25 = class298_54.method5517(string_66);
                          if (i_25 > i_19) {
                            i_19 = i_25;
                          }
                        }

                        i_19 += 6;
                        i_20 += 7;
                        i_49 = i_12 + class230_10.field2675 - 5 - i_19;
                        i_25 = i_13 + class230_10.field2621 + 5;
                        if (i_49 < i_12 + 5) {
                          i_49 = i_12 + 5;
                        }

                        if (i_19 + i_49 > i_4) {
                          i_49 = i_4 - i_19;
                        }

                        if (i_20 + i_25 > i_5) {
                          i_25 = i_5 - i_20;
                        }

                        class314.method5763(i_49, i_25, i_19, i_20, 16777120);
                        class314.method5734(i_49, i_25, i_19, i_20, 0);
                        string_55 = class230_10.field2667;
                        i_26 = i_25 + class298_54.field3695 + 2;

                        for (string_55 = class1.method11(string_55, class230_10);
                            string_55.length() > 0; i_26 = i_26 + class298_54.field3695 + 1) {
                          i_27 = string_55.indexOf("<br>");
                          if (i_27 != -1) {
                            string_66 = string_55.substring(0, i_27);
                            string_55 = string_55.substring(i_27 + 4);
                          } else {
                            string_66 = string_55;
                            string_55 = "";
                          }

                          class298_54.method5522(string_66, i_49 + 3, i_26, 0, -1);
                        }
                      }

                      if (class230_10.field2721 == 9) {
                        if (class230_10.field2639) {
                          i_19 = i_12;
                          i_20 = i_13 + class230_10.field2621;
                          i_21 = i_12 + class230_10.field2675;
                          i_22 = i_13;
                        } else {
                          i_19 = i_12;
                          i_20 = i_13;
                          i_21 = i_12 + class230_10.field2675;
                          i_22 = i_13 + class230_10.field2621;
                        }

                        if (class230_10.field2638 == 1) {
                          class314.method5765(i_19, i_20, i_21, i_22, class230_10.field2630);
                        } else {
                          i_25 = class230_10.field2630;
                          i_26 = class230_10.field2638;
                          i_27 = i_21 - i_19;
                          i_28 = i_22 - i_20;
                          i_29 = i_27 >= 0 ? i_27 : -i_27;
                          i_30 = i_28 >= 0 ? i_28 : -i_28;
                          i_31 = i_29;
                          if (i_29 < i_30) {
                            i_31 = i_30;
                          }

                          if (i_31 != 0) {
                            int i_32 = (i_27 << 16) / i_31;
                            i_33 = (i_28 << 16) / i_31;
                            if (i_33 <= i_32) {
                              i_32 = -i_32;
                            } else {
                              i_33 = -i_33;
                            }

                            i_34 = i_26 * i_33 >> 17;
                            i_35 = i_33 * i_26 + 1 >> 17;
                            int i_56 = i_26 * i_32 >> 17;
                            i_37 = i_32 * i_26 + 1 >> 17;
                            i_23 = i_19 - class314.field3765;
                            i_49 = i_20 - class314.field3763;
                            i_52 = i_23 + i_34;
                            i_39 = i_23 - i_35;
                            i_40 = i_23 + i_27 - i_35;
                            i_41 = i_34 + i_27 + i_23;
                            int i_42 = i_49 + i_56;
                            i_43 = i_49 - i_37;
                            i_44 = i_49 + i_28 - i_37;
                            i_45 = i_49 + i_28 + i_56;
                            class122.method2793(i_52, i_39, i_40);
                            class122.method2796(i_42, i_43, i_44, i_52, i_39, i_40, i_25);
                            class122.method2793(i_52, i_40, i_41);
                            class122.method2796(i_42, i_44, i_45, i_52, i_40, i_41, i_25);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-2020334736"
  )
  boolean method464(int i_1, int i_2) {
    return this.method465(i_1, i_2) ? true : this.method466(i_1, i_2);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1022312970"
  )
  boolean method465(int i_1, int i_2) {
    class255 class255_3 = class255.field3246[this.field240];
    switch (class255_3.field3252.field3482) {
      case 0:
        if (i_1 >= this.field235 - this.field242 / 2 && i_1 <= this.field242 / 2 + this.field235) {
          break;
        }

        return false;
      case 1:
        if (i_1 > this.field235 - this.field242 && i_1 <= this.field235) {
          break;
        }

        return false;
      case 2:
        if (i_1 < this.field235 || i_1 >= this.field235 + this.field242) {
          return false;
        }
    }

    switch (class255_3.field3253.field3223) {
      case 0:
        if (i_2 >= this.field245 && i_2 < this.field245 + this.field239) {
          break;
        }

        return false;
      case 1:
        if (i_2 < this.field245 - this.field239 / 2 || i_2 > this.field239 / 2 + this.field245) {
          return false;
        }
        break;
      case 2:
        if (i_2 <= this.field245 - this.field239 || i_2 > this.field245) {
          return false;
        }
    }

    return true;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "-43"
  )
  boolean method466(int i_1, int i_2) {
    return this.field246 == null ? false : (i_1 >= this.field235 - this.field246.field184 / 2
        && i_1 <= this.field246.field184 / 2 + this.field235 ? i_2 >= this.field245
        && i_2 <= this.field246.field182 + this.field245 : false);
  }

}
