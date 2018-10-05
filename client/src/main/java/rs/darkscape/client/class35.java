package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
public class class35 {

  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 543504023
  )
  int field303;
  @ObfuscatedName("w")
  byte[][][] field304;

  class35(int i_1) {
    this.field303 = i_1;
  }

  @ObfuscatedName("fm")
  @ObfuscatedSignature(
      signature = "(Lba;B)V",
      garbageValue = "-96"
  )
  static final void method609(class63 class63_0) {
    class63_0.field900 = class63_0.field893;
    if (class63_0.field909 == 0) {
      class63_0.field923 = 0;
    } else {
      if (class63_0.field903 != -1 && class63_0.field906 == 0) {
        class273 class273_1 = class3.method25(class63_0.field903);
        if (class63_0.field930 > 0 && class273_1.field3551 == 0) {
          ++class63_0.field923;
          return;
        }

        if (class63_0.field930 <= 0 && class273_1.field3535 == 0) {
          ++class63_0.field923;
          return;
        }
      }

      int i_10 = class63_0.field931;
      int i_2 = class63_0.field881;
      int i_3 = class63_0.field922[class63_0.field909 - 1] * 128 + class63_0.field874 * 64;
      int i_4 = class63_0.field872[class63_0.field909 - 1] * 128 + class63_0.field874 * 64;
      if (i_10 < i_3) {
        if (i_2 < i_4) {
          class63_0.field926 = 1280;
        } else if (i_2 > i_4) {
          class63_0.field926 = 1792;
        } else {
          class63_0.field926 = 1536;
        }
      } else if (i_10 > i_3) {
        if (i_2 < i_4) {
          class63_0.field926 = 768;
        } else if (i_2 > i_4) {
          class63_0.field926 = 256;
        } else {
          class63_0.field926 = 512;
        }
      } else if (i_2 < i_4) {
        class63_0.field926 = 1024;
      } else if (i_2 > i_4) {
        class63_0.field926 = 0;
      }

      byte b_5 = class63_0.field928[class63_0.field909 - 1];
      if (i_3 - i_10 <= 256 && i_3 - i_10 >= -256 && i_4 - i_2 <= 256 && i_4 - i_2 >= -256) {
        int i_6 = class63_0.field926 - class63_0.field905 & 0x7ff;
        if (i_6 > 1024) {
          i_6 -= 2048;
        }

        int i_7 = class63_0.field880;
        if (i_6 >= -256 && i_6 <= 256) {
          i_7 = class63_0.field899;
        } else if (i_6 >= 256 && i_6 < 768) {
          i_7 = class63_0.field882;
        } else if (i_6 >= -768 && i_6 <= -256) {
          i_7 = class63_0.field870;
        }

        if (i_7 == -1) {
          i_7 = class63_0.field899;
        }

        class63_0.field900 = i_7;
        int i_8 = 4;
        boolean bool_9 = true;
        if (class63_0 instanceof class72) {
          bool_9 = ((class72) class63_0).field1037.field3520;
        }

        if (bool_9) {
          if (class63_0.field926 != class63_0.field905 && class63_0.field897 == -1
              && class63_0.field924 != 0) {
            i_8 = 2;
          }

          if (class63_0.field909 > 2) {
            i_8 = 6;
          }

          if (class63_0.field909 > 3) {
            i_8 = 8;
          }

          if (class63_0.field923 > 0 && class63_0.field909 > 1) {
            i_8 = 8;
            --class63_0.field923;
          }
        } else {
          if (class63_0.field909 > 1) {
            i_8 = 6;
          }

          if (class63_0.field909 > 2) {
            i_8 = 8;
          }

          if (class63_0.field923 > 0 && class63_0.field909 > 1) {
            i_8 = 8;
            --class63_0.field923;
          }
        }

        if (b_5 == 2) {
          i_8 <<= 1;
        }

        if (i_8 >= 8 && class63_0.field899 == class63_0.field900 && class63_0.field883 != -1) {
          class63_0.field900 = class63_0.field883;
        }

        if (i_10 != i_3 || i_2 != i_4) {
          if (i_10 < i_3) {
            class63_0.field931 += i_8;
            if (class63_0.field931 > i_3) {
              class63_0.field931 = i_3;
            }
          } else if (i_10 > i_3) {
            class63_0.field931 -= i_8;
            if (class63_0.field931 < i_3) {
              class63_0.field931 = i_3;
            }
          }

          if (i_2 < i_4) {
            class63_0.field881 += i_8;
            if (class63_0.field881 > i_4) {
              class63_0.field881 = i_4;
            }
          } else if (i_2 > i_4) {
            class63_0.field881 -= i_8;
            if (class63_0.field881 < i_4) {
              class63_0.field881 = i_4;
            }
          }
        }

        if (i_3 == class63_0.field931 && i_4 == class63_0.field881) {
          --class63_0.field909;
          if (class63_0.field930 > 0) {
            --class63_0.field930;
          }
        }

      } else {
        class63_0.field931 = i_3;
        class63_0.field881 = i_4;
        --class63_0.field909;
        if (class63_0.field930 > 0) {
          --class63_0.field930;
        }

      }
    }
  }

  @ObfuscatedName("gu")
  @ObfuscatedSignature(
      signature = "(Lba;IIIIIB)V",
      garbageValue = "13"
  )
  static final void method628(class63 class63_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
    if (class63_0 != null && class63_0.vmethod1786()) {
      if (class63_0 instanceof class72) {
        class271 class271_6 = ((class72) class63_0).field1037;
        if (class271_6.field3516 != null) {
          class271_6 = class271_6.method5189();
        }

        if (class271_6 == null) {
          return;
        }
      }

      int i_75 = class81.field1167;
      int[] ints_7 = class81.field1159;
      byte b_8 = 0;
      class60 class60_10;
      if (i_1 < i_75 && class63_0.field889 == client.field591) {
        class60_10 = (class60) class63_0;
        boolean bool_9;
        if (client.field658 == 0) {
          bool_9 = false;
        } else {
          boolean bool_77;
          if (class60_10 == class138.field1876) {
            bool_77 = (client.field658 & 0x8) != 0;
            bool_9 = bool_77;
          } else {
            bool_77 = class20.method260();
            if (!bool_77) {
              boolean bool_78 = (client.field658 & 0x1) != 0;
              bool_77 = bool_78 && class60_10.method1083();
            }

            bool_9 = bool_77 || Mouse.method943() && class60_10.method1104();
          }
        }

        if (bool_9) {
          class60 class60_11 = (class60) class63_0;
          if (i_1 < i_75) {
            class58.method1068(class63_0, class63_0.field925 + 15);
            class299 class299_12 = (class299) client.field631.get(class295.field3672);
            byte b_13 = 9;
            class299_12.method5525(class60_11.field552.method5447(), i_2 + client.field679,
                                   i_3 + client.field680 - b_13, 16777215, 0);
            b_8 = 18;
          }
        }
      }

      int i_87 = -2;
      int i_15;
      int i_22;
      int i_23;
      if (!class63_0.field896.method4043()) {
        class58.method1068(class63_0, class63_0.field925 + 15);

        for (class71 class71_88 = (class71) class63_0.field896.method4048(); class71_88 != null;
            class71_88 = (class71) class63_0.field896.method4033()) {
          class64 class64_89 = class71_88.method1773(client.field591);
          if (class64_89 == null) {
            if (class71_88.method1774()) {
              class71_88.unlinkNode();
            }
          } else {
            class261 class261_91 = class71_88.field1025;
            class318 class318_76 = class261_91.method4918();
            class318 class318_14 = class261_91.method4917();
            int i_16 = 0;
            if (class318_76 != null && class318_14 != null) {
              if (class261_91.field3318 * 2 < class318_14.field3787) {
                i_16 = class261_91.field3318;
              }

              i_15 = class318_14.field3787 - i_16 * 2;
            } else {
              i_15 = class261_91.field3311;
            }

            int i_17 = 255;
            boolean bool_18 = true;
            int i_19 = client.field591 - class64_89.field934;
            int i_20 = i_15 * class64_89.field938 / class261_91.field3311;
            int i_21;
            int i_92;
            if (class64_89.field937 > i_19) {
              i_21 = class261_91.field3308 == 0 ? 0
                  : class261_91.field3308 * (i_19 / class261_91.field3308);
              i_22 = i_15 * class64_89.field935 / class261_91.field3311;
              i_92 = i_21 * (i_20 - i_22) / class64_89.field937 + i_22;
            } else {
              i_92 = i_20;
              i_21 = class261_91.field3313 + class64_89.field937 - i_19;
              if (class261_91.field3312 >= 0) {
                i_17 = (i_21 << 8) / (class261_91.field3313 - class261_91.field3312);
              }
            }

            if (class64_89.field938 > 0 && i_92 < 1) {
              i_92 = 1;
            }

            if (class318_76 != null && class318_14 != null) {
              if (i_15 == i_92) {
                i_92 += i_16 * 2;
              } else {
                i_92 += i_16;
              }

              i_21 = class318_76.field3788;
              i_87 += i_21;
              i_22 = i_2 + client.field679 - (i_15 >> 1);
              i_23 = i_3 + client.field680 - i_87;
              i_22 -= i_16;
              if (i_17 >= 0 && i_17 < 255) {
                class318_76.method5857(i_22, i_23, i_17);
                class314.method5790(i_22, i_23, i_22 + i_92, i_23 + i_21);
                class318_14.method5857(i_22, i_23, i_17);
              } else {
                class318_76.method5851(i_22, i_23);
                class314.method5790(i_22, i_23, i_92 + i_22, i_21 + i_23);
                class318_14.method5851(i_22, i_23);
              }

              class314.method5720(i_2, i_3, i_2 + i_4, i_3 + i_5);
              i_87 += 2;
            } else {
              i_87 += 5;
              if (client.field679 > -1) {
                i_21 = i_2 + client.field679 - (i_15 >> 1);
                i_22 = i_3 + client.field680 - i_87;
                class314.method5763(i_21, i_22, i_92, 5, 65280);
                class314.method5763(i_21 + i_92, i_22, i_15 - i_92, 5, 16711680);
              }

              i_87 += 2;
            }
          }
        }
      }

      if (i_87 == -2) {
        i_87 += 7;
      }

      i_87 += b_8;
      if (i_1 < i_75) {
        class60_10 = (class60) class63_0;
        if (class60_10.field566) {
          return;
        }

        if (class60_10.field570 != -1 || class60_10.field548 != -1) {
          class58.method1068(class63_0, class63_0.field925 + 15);
          if (client.field679 > -1) {
            if (class60_10.field570 != -1) {
              i_87 += 25;
              class150.field1919[class60_10.field570]
                  .method5851(i_2 + client.field679 - 12, i_3 + client.field680 - i_87);
            }

            if (class60_10.field548 != -1) {
              i_87 += 25;
              class43.field369[class60_10.field548]
                  .method5851(i_2 + client.field679 - 12, i_3 + client.field680 - i_87);
            }
          }
        }

        if (i_1 >= 0 && client.field599 == 10 && ints_7[i_1] == client.field579) {
          class58.method1068(class63_0, class63_0.field925 + 15);
          if (client.field679 > -1) {
            i_87 += class150.field1926[1].field3788;
            class150.field1926[1]
                .method5851(i_2 + client.field679 - 12, i_3 + client.field680 - i_87);
          }
        }
      } else {
        class271 class271_90 = ((class72) class63_0).field1037;
        if (class271_90.field3516 != null) {
          class271_90 = class271_90.method5189();
        }

        if (class271_90.field3494 >= 0 && class271_90.field3494 < class43.field369.length) {
          class58.method1068(class63_0, class63_0.field925 + 15);
          if (client.field679 > -1) {
            class43.field369[class271_90.field3494]
                .method5851(i_2 + client.field679 - 12, i_3 + client.field680 - 30);
          }
        }

        if (client.field599 == 1 && client.field639[i_1 - i_75] == client.field600
            && client.field591 % 20 < 10) {
          class58.method1068(class63_0, class63_0.field925 + 15);
          if (client.field679 > -1) {
            class150.field1926[0]
                .method5851(i_2 + client.field679 - 12, i_3 + client.field680 - 28);
          }
        }
      }

      if (class63_0.field884 != null && (i_1 >= i_75 || !class63_0.field886 && (client.field630 == 4
          || !class63_0.field885 && (client.field630 == 0 || client.field630 == 3
          || client.field630 == 1 && ((class60) class63_0).method1083())))) {
        class58.method1068(class63_0, class63_0.field925);
        if (client.field679 > -1 && client.field667 < client.field648) {
          client.field672[client.field667] = class293.field3660.method5517(class63_0.field884) / 2;
          client.field671[client.field667] = class293.field3660.field3695;
          client.field669[client.field667] = client.field679;
          client.field670[client.field667] = client.field680;
          client.field673[client.field667] = class63_0.field888;
          client.field674[client.field667] = class63_0.field927;
          client.field675[client.field667] = class63_0.field887;
          client.field721[client.field667] = class63_0.field884;
          ++client.field667;
        }
      }

      for (int i_79 = 0; i_79 < 4; i_79++) {
        int i_95 = class63_0.field895[i_79];
        int i_96 = class63_0.field912[i_79];
        class267 class267_94 = null;
        int i_80 = 0;
        if (i_96 >= 0) {
          if (i_95 <= client.field591) {
            continue;
          }

          class267_94 = class14.method123(class63_0.field912[i_79]);
          i_80 = class267_94.field3355;
          if (class267_94 != null && class267_94.field3366 != null) {
            class267_94 = class267_94.method4995();
            if (class267_94 == null) {
              class63_0.field895[i_79] = -1;
              continue;
            }
          }
        } else if (i_95 < 0) {
          continue;
        }

        i_15 = class63_0.field894[i_79];
        class267 class267_81 = null;
        if (i_15 >= 0) {
          class267_81 = class14.method123(i_15);
          if (class267_81 != null && class267_81.field3366 != null) {
            class267_81 = class267_81.method4995();
          }
        }

        if (i_95 - i_80 <= client.field591) {
          if (class267_94 == null) {
            class63_0.field895[i_79] = -1;
          } else {
            class58.method1068(class63_0, class63_0.field925 / 2);
            if (client.field679 > -1) {
              if (i_79 == 1) {
                client.field680 -= 20;
              }

              if (i_79 == 2) {
                client.field679 -= 15;
                client.field680 -= 10;
              }

              if (i_79 == 3) {
                client.field679 += 15;
                client.field680 -= 10;
              }

              class318 class318_82 = null;
              class318 class318_83 = null;
              class318 class318_84 = null;
              class318 class318_85 = null;
              i_22 = 0;
              i_23 = 0;
              int i_24 = 0;
              int i_25 = 0;
              int i_26 = 0;
              int i_27 = 0;
              int i_28 = 0;
              int i_29 = 0;
              class318 class318_30 = null;
              class318 class318_31 = null;
              class318 class318_32 = null;
              class318 class318_33 = null;
              int i_34 = 0;
              int i_35 = 0;
              int i_36 = 0;
              int i_37 = 0;
              int i_38 = 0;
              int i_39 = 0;
              int i_40 = 0;
              int i_41 = 0;
              int i_42 = 0;
              class318_82 = class267_94.method4994();
              int i_43;
              if (class318_82 != null) {
                i_22 = class318_82.field3787;
                i_43 = class318_82.field3788;
                if (i_43 > i_42) {
                  i_42 = i_43;
                }

                i_26 = class318_82.field3793;
              }

              class318_83 = class267_94.method5000();
              if (class318_83 != null) {
                i_23 = class318_83.field3787;
                i_43 = class318_83.field3788;
                if (i_43 > i_42) {
                  i_42 = i_43;
                }

                i_27 = class318_83.field3793;
              }

              class318_84 = class267_94.method4996();
              if (class318_84 != null) {
                i_24 = class318_84.field3787;
                i_43 = class318_84.field3788;
                if (i_43 > i_42) {
                  i_42 = i_43;
                }

                i_28 = class318_84.field3793;
              }

              class318_85 = class267_94.method4997();
              if (class318_85 != null) {
                i_25 = class318_85.field3787;
                i_43 = class318_85.field3788;
                if (i_43 > i_42) {
                  i_42 = i_43;
                }

                i_29 = class318_85.field3793;
              }

              if (class267_81 != null) {
                class318_30 = class267_81.method4994();
                if (class318_30 != null) {
                  i_34 = class318_30.field3787;
                  i_43 = class318_30.field3788;
                  if (i_43 > i_42) {
                    i_42 = i_43;
                  }

                  i_38 = class318_30.field3793;
                }

                class318_31 = class267_81.method5000();
                if (class318_31 != null) {
                  i_35 = class318_31.field3787;
                  i_43 = class318_31.field3788;
                  if (i_43 > i_42) {
                    i_42 = i_43;
                  }

                  i_39 = class318_31.field3793;
                }

                class318_32 = class267_81.method4996();
                if (class318_32 != null) {
                  i_36 = class318_32.field3787;
                  i_43 = class318_32.field3788;
                  if (i_43 > i_42) {
                    i_42 = i_43;
                  }

                  i_40 = class318_32.field3793;
                }

                class318_33 = class267_81.method4997();
                if (class318_33 != null) {
                  i_37 = class318_33.field3787;
                  i_43 = class318_33.field3788;
                  if (i_43 > i_42) {
                    i_42 = i_43;
                  }

                  i_41 = class318_33.field3793;
                }
              }

              class298 class298_86 = class267_94.method4998();
              if (class298_86 == null) {
                class298_86 = Temp.field1936;
              }

              class298 class298_44;
              if (class267_81 != null) {
                class298_44 = class267_81.method4998();
                if (class298_44 == null) {
                  class298_44 = Temp.field1936;
                }
              } else {
                class298_44 = Temp.field1936;
              }

              String string_45 = null;
              String string_46 = null;
              boolean bool_47 = false;
              int i_48 = 0;
              string_45 = class267_94.method5014(class63_0.field892[i_79]);
              int i_93 = class298_86.method5517(string_45);
              if (class267_81 != null) {
                string_46 = class267_81.method5014(class63_0.field921[i_79]);
                i_48 = class298_44.method5517(string_46);
              }

              int i_49 = 0;
              int i_50 = 0;
              if (i_23 > 0) {
                if (class318_84 == null && class318_85 == null) {
                  i_49 = 1;
                } else {
                  i_49 = i_93 / i_23 + 1;
                }
              }

              if (class267_81 != null && i_35 > 0) {
                if (class318_32 == null && class318_33 == null) {
                  i_50 = 1;
                } else {
                  i_50 = i_48 / i_35 + 1;
                }
              }

              int i_51 = 0;
              int i_52 = i_51;
              if (i_22 > 0) {
                i_51 += i_22;
              }

              i_51 += 2;
              int i_53 = i_51;
              if (i_24 > 0) {
                i_51 += i_24;
              }

              int i_54 = i_51;
              int i_55 = i_51;
              int i_56;
              if (i_23 > 0) {
                i_56 = i_49 * i_23;
                i_51 += i_56;
                i_55 += (i_56 - i_93) / 2;
              } else {
                i_51 += i_93;
              }

              i_56 = i_51;
              if (i_25 > 0) {
                i_51 += i_25;
              }

              int i_57 = 0;
              int i_58 = 0;
              int i_59 = 0;
              int i_60 = 0;
              int i_61 = 0;
              int i_62;
              if (class267_81 != null) {
                i_51 += 2;
                i_57 = i_51;
                if (i_34 > 0) {
                  i_51 += i_34;
                }

                i_51 += 2;
                i_58 = i_51;
                if (i_36 > 0) {
                  i_51 += i_36;
                }

                i_59 = i_51;
                i_61 = i_51;
                if (i_35 > 0) {
                  i_62 = i_50 * i_35;
                  i_51 += i_62;
                  i_61 += (i_62 - i_48) / 2;
                } else {
                  i_51 += i_48;
                }

                i_60 = i_51;
                if (i_37 > 0) {
                  i_51 += i_37;
                }
              }

              i_62 = class63_0.field895[i_79] - client.field591;
              int i_63 =
                  class267_94.field3365 - i_62 * class267_94.field3365 / class267_94.field3355;
              int i_64 =
                  i_62 * class267_94.field3361 / class267_94.field3355 + -class267_94.field3361;
              int i_65 = i_63 + (i_2 + client.field679 - (i_51 >> 1));
              int i_66 = i_64 + (i_3 + client.field680 - 12);
              int i_67 = i_66;
              int i_68 = i_66 + i_42;
              int i_69 = i_66 + class267_94.field3347 + 15;
              int i_70 = i_69 - class298_86.field3696;
              int i_71 = i_69 + class298_86.field3697;
              if (i_70 < i_66) {
                i_67 = i_70;
              }

              if (i_71 > i_68) {
                i_68 = i_71;
              }

              int i_72 = 0;
              int i_73;
              int i_74;
              if (class267_81 != null) {
                i_72 = i_66 + class267_81.field3347 + 15;
                i_73 = i_72 - class298_44.field3696;
                i_74 = i_72 + class298_44.field3697;
                if (i_73 < i_67) {
                }

                if (i_74 > i_68) {
                }
              }

              i_73 = 255;
              if (class267_94.field3354 >= 0) {
                i_73 = (i_62 << 8) / (class267_94.field3355 - class267_94.field3354);
              }

              if (i_73 >= 0 && i_73 < 255) {
                if (class318_82 != null) {
                  class318_82.method5857(i_65 + i_52 - i_26, i_66, i_73);
                }

                if (class318_84 != null) {
                  class318_84.method5857(i_65 + i_53 - i_28, i_66, i_73);
                }

                if (class318_83 != null) {
                  for (i_74 = 0; i_74 < i_49; i_74++) {
                    class318_83.method5857(i_23 * i_74 + (i_54 + i_65 - i_27), i_66, i_73);
                  }
                }

                if (class318_85 != null) {
                  class318_85.method5857(i_56 + i_65 - i_29, i_66, i_73);
                }

                class298_86
                    .method5523(string_45, i_65 + i_55, i_69, class267_94.field3364, 0, i_73);
                if (class267_81 != null) {
                  if (class318_30 != null) {
                    class318_30.method5857(i_65 + i_57 - i_38, i_66, i_73);
                  }

                  if (class318_32 != null) {
                    class318_32.method5857(i_58 + i_65 - i_40, i_66, i_73);
                  }

                  if (class318_31 != null) {
                    for (i_74 = 0; i_74 < i_50; i_74++) {
                      class318_31.method5857(i_74 * i_35 + (i_59 + i_65 - i_39), i_66, i_73);
                    }
                  }

                  if (class318_33 != null) {
                    class318_33.method5857(i_65 + i_60 - i_41, i_66, i_73);
                  }

                  class298_44
                      .method5523(string_46, i_61 + i_65, i_72, class267_81.field3364, 0, i_73);
                }
              } else {
                if (class318_82 != null) {
                  class318_82.method5851(i_65 + i_52 - i_26, i_66);
                }

                if (class318_84 != null) {
                  class318_84.method5851(i_65 + i_53 - i_28, i_66);
                }

                if (class318_83 != null) {
                  for (i_74 = 0; i_74 < i_49; i_74++) {
                    class318_83.method5851(i_23 * i_74 + (i_65 + i_54 - i_27), i_66);
                  }
                }

                if (class318_85 != null) {
                  class318_85.method5851(i_65 + i_56 - i_29, i_66);
                }

                class298_86
                    .method5522(string_45, i_65 + i_55, i_69, class267_94.field3364 | ~0xffffff, 0);
                if (class267_81 != null) {
                  if (class318_30 != null) {
                    class318_30.method5851(i_57 + i_65 - i_38, i_66);
                  }

                  if (class318_32 != null) {
                    class318_32.method5851(i_58 + i_65 - i_40, i_66);
                  }

                  if (class318_31 != null) {
                    for (i_74 = 0; i_74 < i_50; i_74++) {
                      class318_31.method5851(i_74 * i_35 + (i_59 + i_65 - i_39), i_66);
                    }
                  }

                  if (class318_33 != null) {
                    class318_33.method5851(i_60 + i_65 - i_41, i_66);
                  }

                  class298_44
                      .method5522(string_46, i_65 + i_61, i_72, class267_81.field3364 | ~0xffffff,
                                  0);
                }
              }
            }
          }
        }
      }

    }
  }

  @ObfuscatedName("id")
  @ObfuscatedSignature(
      signature = "(IIIIIIIIB)V",
      garbageValue = "46"
  )
  static final void method630(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                              int i_7) {
    if (class261.method4931(i_0)) {
      class132.field1814 = null;
      class28.method467(class42.field366[i_0], -1, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
      if (class132.field1814 != null) {
        class28.method467(class132.field1814, -1412584499, i_1, i_2, i_3, i_4, class297.field3687,
                          class1.field15, i_7);
        class132.field1814 = null;
      }

    } else {
      if (i_7 != -1) {
        client.field697[i_7] = true;
      } else {
        for (int i_8 = 0; i_8 < 100; i_8++) {
          client.field697[i_8] = true;
        }
      }

    }
  }

  @ObfuscatedName("ig")
  @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "1"
  )
  static final String method623(int i_0) {
    String string_1 = Integer.toString(i_0);

    for (int i_2 = string_1.length() - 3; i_2 > 0; i_2 -= 3) {
      string_1 = string_1.substring(0, i_2) + "," + string_1.substring(i_2);
    }

    return string_1.length() > 9 ? " " + class6.method71(65408) + string_1
        .substring(0, string_1.length() - 8) + "M" + " " + " (" + string_1 + ")" + "</col>"
        : (string_1.length() > 6 ? " " + class6.method71(16777215) + string_1
            .substring(0, string_1.length() - 4) + "K" + " " + " (" + string_1 + ")" + "</col>"
            : " " + class6.method71(16776960) + string_1 + "</col>");
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "600681554"
  )
  void method606(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
    if (i_7 != 0 && this.field303 != 0 && this.field304 != null) {
      i_8 = this.method590(i_8, i_7);
      i_7 = this.method591(i_7);
      class314.method5733(i_1, i_2, i_5, i_6, i_3, i_4, this.field304[i_7 - 1][i_8], this.field303);
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "103"
  )
  int method590(int i_1, int i_2) {
    if (i_2 == 9) {
      i_1 = i_1 + 1 & 0x3;
    }

    if (i_2 == 10) {
      i_1 = i_1 + 3 & 0x3;
    }

    if (i_2 == 11) {
      i_1 = i_1 + 3 & 0x3;
    }

    return i_1;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1021725892"
  )
  int method591(int i_1) {
    return i_1 != 9 && i_1 != 10 ? (i_1 == 11 ? 8 : i_1) : 1;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1956759512"
  )
  void method592() {
    if (this.field304 == null) {
      this.field304 = new byte[8][4][];
      this.method593();
      this.method625();
      this.method607();
      this.method596();
      this.method612();
      this.method598();
      this.method629();
      this.method595();
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-515491785"
  )
  void method593() {
    byte[] bytes_1 = new byte[this.field303 * this.field303];
    int i_2 = 0;

    int i_3;
    int i_4;
    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 <= i_3) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[0][0] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 <= i_3) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[0][1] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 >= i_3) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[0][2] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 >= i_3) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[0][3] = bytes_1;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2050739130"
  )
  void method625() {
    byte[] bytes_1 = new byte[this.field303 * this.field303];
    int i_2 = 0;

    int i_3;
    int i_4;
    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 <= i_3 >> 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[1][0] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_2 >= 0 && i_2 < bytes_1.length) {
          if (i_4 >= i_3 << 1) {
            bytes_1[i_2] = -1;
          }

          ++i_2;
        } else {
          ++i_2;
        }
      }
    }

    this.field304[1][1] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 <= i_3 >> 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[1][2] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 >= i_3 << 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[1][3] = bytes_1;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
  )
  void method607() {
    byte[] bytes_1 = new byte[this.field303 * this.field303];
    int i_2 = 0;

    int i_3;
    int i_4;
    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 <= i_3 >> 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[2][0] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 >= i_3 << 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[2][1] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 <= i_3 >> 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[2][2] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 >= i_3 << 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[2][3] = bytes_1;
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1650929653"
  )
  void method596() {
    byte[] bytes_1 = new byte[this.field303 * this.field303];
    int i_2 = 0;

    int i_3;
    int i_4;
    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 >= i_3 >> 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[3][0] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 <= i_3 << 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[3][1] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 >= i_3 >> 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[3][2] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 <= i_3 << 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[3][3] = bytes_1;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
  )
  void method612() {
    byte[] bytes_1 = new byte[this.field303 * this.field303];
    int i_2 = 0;

    int i_3;
    int i_4;
    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 >= i_3 >> 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[4][0] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 <= i_3 << 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[4][1] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 >= i_3 >> 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[4][2] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_2 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 <= i_3 << 1) {
          bytes_1[i_2] = -1;
        }

        ++i_2;
      }
    }

    this.field304[4][3] = bytes_1;
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1963710771"
  )
  void method598() {
    byte[] bytes_1 = new byte[this.field303 * this.field303];
    boolean bool_2 = false;
    bytes_1 = new byte[this.field303 * this.field303];
    int i_5 = 0;

    int i_3;
    int i_4;
    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 <= this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[5][0] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_5 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_3 <= this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[5][1] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_5 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 >= this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[5][2] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_5 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_3 >= this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[5][3] = bytes_1;
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2053571695"
  )
  void method629() {
    byte[] bytes_1 = new byte[this.field303 * this.field303];
    boolean bool_2 = false;
    bytes_1 = new byte[this.field303 * this.field303];
    int i_5 = 0;

    int i_3;
    int i_4;
    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 <= i_3 - this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[6][0] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_5 = 0;

    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 <= i_3 - this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[6][1] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_5 = 0;

    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 <= i_3 - this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[6][2] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_5 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 <= i_3 - this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[6][3] = bytes_1;
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "335208223"
  )
  void method595() {
    byte[] bytes_1 = new byte[this.field303 * this.field303];
    boolean bool_2 = false;
    bytes_1 = new byte[this.field303 * this.field303];
    int i_5 = 0;

    int i_3;
    int i_4;
    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 >= i_3 - this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[7][0] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_5 = 0;

    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = 0; i_4 < this.field303; i_4++) {
        if (i_4 >= i_3 - this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[7][1] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_5 = 0;

    for (i_3 = this.field303 - 1; i_3 >= 0; --i_3) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 >= i_3 - this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[7][2] = bytes_1;
    bytes_1 = new byte[this.field303 * this.field303];
    i_5 = 0;

    for (i_3 = 0; i_3 < this.field303; i_3++) {
      for (i_4 = this.field303 - 1; i_4 >= 0; --i_4) {
        if (i_4 >= i_3 - this.field303 / 2) {
          bytes_1[i_5] = -1;
        }

        ++i_5;
      }
    }

    this.field304[7][3] = bytes_1;
  }

}
