package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public enum class15 implements class188 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lm;"
  )
  field108(2, (byte) 0),
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lm;"
  )
  field107(3, (byte) 1),
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lm;"
  )
  field112(0, (byte) 2),
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lm;"
  )
  field106(1, (byte) 3);

  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -640646291
  )
  final int field110;
  @ObfuscatedName("q")
  final byte field111;

  class15(int i_3, byte b_4) {
    this.field110 = i_3;
    this.field111 = b_4;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)[Lm;",
      garbageValue = "-1961233435"
  )
  static class15[] method145() {
    return new class15[]{field106, field107, field108, field112};
  }

  @ObfuscatedName("gw")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2126633421"
  )
  static final void method148() {
    class14.method137(false);
    client.field633 = 0;
    boolean bool_0 = true;

    int i_1;
    for (i_1 = 0; i_1 < class171.field2252.length; i_1++) {
      if (class295.field3676[i_1] != -1 && class171.field2252[i_1] == null) {
        class171.field2252[i_1] = RemoteArchiveRequest.field3159.method4625(class295.field3676[i_1], 0);
        if (class171.field2252[i_1] == null) {
          bool_0 = false;
          ++client.field633;
        }
      }

      if (class9.field56[i_1] != -1 && class29.field253[i_1] == null) {
        class29.field253[i_1] = RemoteArchiveRequest.field3159
            .method4628(class9.field56[i_1], 0, class67.field973[i_1]);
        if (class29.field253[i_1] == null) {
          bool_0 = false;
          ++client.field633;
        }
      }
    }

    if (!bool_0) {
      client.field751 = 1;
    } else {
      client.field635 = 0;
      bool_0 = true;

      int i_3;
      int i_4;
      for (i_1 = 0; i_1 < class171.field2252.length; i_1++) {
        byte[] bytes_2 = class29.field253[i_1];
        if (bytes_2 != null) {
          i_3 = (class143.field1900[i_1] >> 8) * 64 - class62.field868;
          i_4 = (class143.field1900[i_1] & 0xff) * 64 - client.field754;
          if (client.field759) {
            i_3 = 10;
            i_4 = 10;
          }

          bool_0 &= class33.method557(bytes_2, i_3, i_4);
        }
      }

      if (!bool_0) {
        client.field751 = 2;
      } else {
        if (client.field751 != 0) {
          class83.method1933("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
        }

        class54.method1017();
        class28.field248.method2903();

        for (i_1 = 0; i_1 < 4; i_1++) {
          client.field642[i_1].method3392();
        }

        int i_44;
        for (i_1 = 0; i_1 < 4; i_1++) {
          for (i_44 = 0; i_44 < 104; i_44++) {
            for (i_3 = 0; i_3 < 104; i_3++) {
              class50.field443[i_1][i_44][i_3] = 0;
            }
          }
        }

        class54.method1017();
        class40.method695();
        i_1 = class171.field2252.length;

        for (class68 class68_62 = (class68) class68.field985.getFirst(); class68_62 != null;
            class68_62 = (class68) class68.field985.getNext()) {
          if (class68_62.field993 != null) {
            class36.field310.method2009(class68_62.field993);
            class68_62.field993 = null;
          }

          if (class68_62.field980 != null) {
            class36.field310.method2009(class68_62.field980);
            class68_62.field980 = null;
          }
        }

        class68.field985.clear();
        class14.method137(true);
        int i_6;
        int i_7;
        int i_9;
        int i_10;
        int i_11;
        int i_12;
        int i_14;
        int i_15;
        int i_16;
        int i_17;
        int i_19;
        int i_20;
        int i_21;
        int i_46;
        int i_49;
        int i_52;
        if (!client.field759) {
          byte[] bytes_5;
          for (i_44 = 0; i_44 < i_1; i_44++) {
            i_3 = (class143.field1900[i_44] >> 8) * 64 - class62.field868;
            i_4 = (class143.field1900[i_44] & 0xff) * 64 - client.field754;
            bytes_5 = class171.field2252[i_44];
            if (bytes_5 != null) {
              class54.method1017();
              i_6 = class27.field224 * 8 - 48;
              i_7 = class34.field301 * 8 - 48;
              class164[] arr_8 = client.field642;

              for (i_9 = 0; i_9 < 4; i_9++) {
                for (i_10 = 0; i_10 < 64; i_10++) {
                  for (i_11 = 0; i_11 < 64; i_11++) {
                    if (i_10 + i_3 > 0 && i_3 + i_10 < 103 && i_11 + i_4 > 0 && i_11 + i_4 < 103) {
                      arr_8[i_9].field2029[i_10 + i_3][i_4 + i_11] &= ~0x1000000;
                    }
                  }
                }
              }

              Buffer class182_45 = new Buffer(bytes_5);

              for (i_10 = 0; i_10 < 4; i_10++) {
                for (i_11 = 0; i_11 < 64; i_11++) {
                  for (i_12 = 0; i_12 < 64; i_12++) {
                    class65.method1603(class182_45, i_10, i_11 + i_3, i_12 + i_4, i_6, i_7, 0);
                  }
                }
              }
            }
          }

          for (i_44 = 0; i_44 < i_1; i_44++) {
            i_3 = (class143.field1900[i_44] >> 8) * 64 - class62.field868;
            i_4 = (class143.field1900[i_44] & 0xff) * 64 - client.field754;
            bytes_5 = class171.field2252[i_44];
            if (bytes_5 == null && class34.field301 < 800) {
              class54.method1017();
              class177.method3510(i_3, i_4, 64, 64);
            }
          }

          class14.method137(true);

          for (i_44 = 0; i_44 < i_1; i_44++) {
            byte[] bytes_48 = class29.field253[i_44];
            if (bytes_48 != null) {
              i_4 = (class143.field1900[i_44] >> 8) * 64 - class62.field868;
              i_46 = (class143.field1900[i_44] & 0xff) * 64 - client.field754;
              class54.method1017();
              class125 class125_50 = class28.field248;
              class164[] arr_51 = client.field642;
              Buffer class182_66 = new Buffer(bytes_48);
              i_9 = -1;

              while (true) {
                i_10 = class182_66.method3563();
                if (i_10 == 0) {
                  break;
                }

                i_9 += i_10;
                i_11 = 0;

                while (true) {
                  i_12 = class182_66.method3562();
                  if (i_12 == 0) {
                    break;
                  }

                  i_11 += i_12 - 1;
                  i_49 = i_11 & 0x3f;
                  i_14 = i_11 >> 6 & 0x3f;
                  i_15 = i_11 >> 12;
                  i_16 = class182_66.getUInt8();
                  i_17 = i_16 >> 2;
                  i_52 = i_16 & 0x3;
                  i_19 = i_4 + i_14;
                  i_20 = i_49 + i_46;
                  if (i_19 > 0 && i_20 > 0 && i_19 < 103 && i_20 < 103) {
                    i_21 = i_15;
                    if ((class50.field443[1][i_19][i_20] & 0x2) == 2) {
                      i_21 = i_15 - 1;
                    }

                    class164 class164_55 = null;
                    if (i_21 >= 0) {
                      class164_55 = arr_51[i_21];
                    }

                    class171
                        .method3450(i_15, i_19, i_20, i_9, i_52, i_17, class125_50, class164_55);
                  }
                }
              }
            }
          }
        }

        int i_22;
        int i_23;
        int i_24;
        int i_25;
        int i_26;
        int i_27;
        int i_28;
        int i_29;
        int i_32;
        int i_33;
        int i_34;
        int i_35;
        int i_36;
        int i_38;
        int i_39;
        int i_40;
        int i_47;
        if (client.field759) {
          class164[] arr_18;
          Buffer class182_56;
          for (i_44 = 0; i_44 < 4; i_44++) {
            class54.method1017();

            for (i_3 = 0; i_3 < 13; i_3++) {
              for (i_4 = 0; i_4 < 13; i_4++) {
                boolean bool_71 = false;
                i_6 = client.field645[i_44][i_3][i_4];
                if (i_6 != -1) {
                  i_7 = i_6 >> 24 & 0x3;
                  i_47 = i_6 >> 1 & 0x3;
                  i_9 = i_6 >> 14 & 0x3ff;
                  i_10 = i_6 >> 3 & 0x7ff;
                  i_11 = (i_9 / 8 << 8) + i_10 / 8;

                  for (i_12 = 0; i_12 < class143.field1900.length; i_12++) {
                    if (class143.field1900[i_12] == i_11 && class171.field2252[i_12] != null) {
                      byte[] bytes_13 = class171.field2252[i_12];
                      i_14 = i_3 * 8;
                      i_15 = i_4 * 8;
                      i_16 = (i_9 & 0x7) * 8;
                      i_17 = (i_10 & 0x7) * 8;
                      arr_18 = client.field642;

                      for (i_19 = 0; i_19 < 8; i_19++) {
                        for (i_20 = 0; i_20 < 8; i_20++) {
                          if (i_14 + i_19 > 0 && i_14 + i_19 < 103 && i_20 + i_15 > 0
                              && i_20 + i_15 < 103) {
                            arr_18[i_44].field2029[i_14 + i_19][i_20 + i_15] &= ~0x1000000;
                          }
                        }
                      }

                      class182_56 = new Buffer(bytes_13);

                      for (i_20 = 0; i_20 < 4; i_20++) {
                        for (i_21 = 0; i_21 < 64; i_21++) {
                          for (i_22 = 0; i_22 < 64; i_22++) {
                            if (i_20 == i_7 && i_21 >= i_16 && i_21 < i_16 + 8 && i_22 >= i_17
                                && i_22 < i_17 + 8) {
                              i_27 = i_21 & 0x7;
                              i_28 = i_22 & 0x7;
                              i_29 = i_47 & 0x3;
                              if (i_29 == 0) {
                                i_26 = i_27;
                              } else if (i_29 == 1) {
                                i_26 = i_28;
                              } else if (i_29 == 2) {
                                i_26 = 7 - i_27;
                              } else {
                                i_26 = 7 - i_28;
                              }

                              class65.method1603(class182_56, i_44, i_26 + i_14, i_15 + class75
                                  .method1802(i_21 & 0x7, i_22 & 0x7, i_47), 0, 0, i_47);
                            } else {
                              class65.method1603(class182_56, 0, -1, -1, 0, 0, 0);
                            }
                          }
                        }
                      }

                      bool_71 = true;
                      break;
                    }
                  }
                }

                if (!bool_71) {
                  class160.method3338(i_44, i_3 * 8, i_4 * 8);
                }
              }
            }
          }

          for (i_44 = 0; i_44 < 13; i_44++) {
            for (i_3 = 0; i_3 < 13; i_3++) {
              i_4 = client.field645[0][i_44][i_3];
              if (i_4 == -1) {
                class177.method3510(i_44 * 8, i_3 * 8, 8, 8);
              }
            }
          }

          class14.method137(true);

          for (i_44 = 0; i_44 < 4; i_44++) {
            class54.method1017();

            for (i_3 = 0; i_3 < 13; i_3++) {
              label1302:
              for (i_4 = 0; i_4 < 13; i_4++) {
                i_46 = client.field645[i_44][i_3][i_4];
                if (i_46 != -1) {
                  i_6 = i_46 >> 24 & 0x3;
                  i_7 = i_46 >> 1 & 0x3;
                  i_47 = i_46 >> 14 & 0x3ff;
                  i_9 = i_46 >> 3 & 0x7ff;
                  i_10 = (i_47 / 8 << 8) + i_9 / 8;

                  for (i_11 = 0; i_11 < class143.field1900.length; i_11++) {
                    if (class143.field1900[i_11] == i_10 && class29.field253[i_11] != null) {
                      byte[] bytes_58 = class29.field253[i_11];
                      i_49 = i_3 * 8;
                      i_14 = i_4 * 8;
                      i_15 = (i_47 & 0x7) * 8;
                      i_16 = (i_9 & 0x7) * 8;
                      class125 class125_53 = class28.field248;
                      arr_18 = client.field642;
                      class182_56 = new Buffer(bytes_58);
                      i_20 = -1;

                      while (true) {
                        i_21 = class182_56.method3563();
                        if (i_21 == 0) {
                          continue label1302;
                        }

                        i_20 += i_21;
                        i_22 = 0;

                        while (true) {
                          i_23 = class182_56.method3562();
                          if (i_23 == 0) {
                            break;
                          }

                          i_22 += i_23 - 1;
                          i_24 = i_22 & 0x3f;
                          i_25 = i_22 >> 6 & 0x3f;
                          i_26 = i_22 >> 12;
                          i_27 = class182_56.getUInt8();
                          i_28 = i_27 >> 2;
                          i_29 = i_27 & 0x3;
                          if (i_6 == i_26 && i_25 >= i_15 && i_25 < i_15 + 8 && i_24 >= i_16
                              && i_24 < i_16 + 8) {
                            class268 class268_59 = SeekableFile.method2527(i_20);
                            i_33 = i_25 & 0x7;
                            i_34 = i_24 & 0x7;
                            i_36 = class268_59.field3384;
                            int i_60 = class268_59.field3385;
                            if ((i_29 & 0x1) == 1) {
                              i_38 = i_36;
                              i_36 = i_60;
                              i_60 = i_38;
                            }

                            i_35 = i_7 & 0x3;
                            if (i_35 == 0) {
                              i_32 = i_33;
                            } else if (i_35 == 1) {
                              i_32 = i_34;
                            } else if (i_35 == 2) {
                              i_32 = 7 - i_33 - (i_36 - 1);
                            } else {
                              i_32 = 7 - i_34 - (i_60 - 1);
                            }

                            i_38 = i_49 + i_32;
                            i_39 = i_14 + class86
                                .method1970(i_25 & 0x7, i_24 & 0x7, i_7, class268_59.field3384,
                                            class268_59.field3385, i_29);
                            if (i_38 > 0 && i_39 > 0 && i_38 < 103 && i_39 < 103) {
                              i_40 = i_44;
                              if ((class50.field443[1][i_38][i_39] & 0x2) == 2) {
                                i_40 = i_44 - 1;
                              }

                              class164 class164_61 = null;
                              if (i_40 >= 0) {
                                class164_61 = arr_18[i_40];
                              }

                              class171.method3450(i_44, i_38, i_39, i_20, i_7 + i_29 & 0x3, i_28,
                                                  class125_53, class164_61);
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

        class14.method137(true);
        class54.method1017();
        class125 class125_63 = class28.field248;
        class164[] arr_72 = client.field642;

        for (i_4 = 0; i_4 < 4; i_4++) {
          for (i_46 = 0; i_46 < 104; i_46++) {
            for (i_6 = 0; i_6 < 104; i_6++) {
              if ((class50.field443[i_4][i_46][i_6] & 0x1) == 1) {
                i_7 = i_4;
                if ((class50.field443[1][i_46][i_6] & 0x2) == 2) {
                  i_7 = i_4 - 1;
                }

                if (i_7 >= 0) {
                  arr_72[i_7].method3395(i_46, i_6);
                }
              }
            }
          }
        }

        class50.field457 += (int) (Math.random() * 5.0D) - 2;
        if (class50.field457 < -8) {
          class50.field457 = -8;
        }

        if (class50.field457 > 8) {
          class50.field457 = 8;
        }

        class50.field455 += (int) (Math.random() * 5.0D) - 2;
        if (class50.field455 < -16) {
          class50.field455 = -16;
        }

        if (class50.field455 > 16) {
          class50.field455 = 16;
        }

        for (i_4 = 0; i_4 < 4; i_4++) {
          byte[][] bytes_64 = class50.field447[i_4];
          i_11 = (int) Math.sqrt(5100.0D);
          i_12 = i_11 * 768 >> 8;

          for (i_49 = 1; i_49 < 103; i_49++) {
            for (i_14 = 1; i_14 < 103; i_14++) {
              i_15 = class50.field459[i_4][i_14 + 1][i_49] - class50.field459[i_4][i_14 - 1][i_49];
              i_16 = class50.field459[i_4][i_14][i_49 + 1] - class50.field459[i_4][i_14][i_49 - 1];
              i_17 = (int) Math.sqrt((double) (i_16 * i_16 + i_15 * i_15 + 65536));
              i_52 = (i_15 << 8) / i_17;
              i_19 = 65536 / i_17;
              i_20 = (i_16 << 8) / i_17;
              i_21 = (i_52 * -50 + i_20 * -50 + i_19 * -10) / i_12 + 96;
              i_22 = (bytes_64[i_14 - 1][i_49] >> 2) + (bytes_64[i_14][i_49 - 1] >> 2) + (
                  bytes_64[i_14 + 1][i_49] >> 3) + (bytes_64[i_14][i_49 + 1] >> 3) + (
                  bytes_64[i_14][i_49] >> 1);
              class50.field448[i_14][i_49] = i_21 - i_22;
            }
          }

          for (i_49 = 0; i_49 < 104; i_49++) {
            class50.field454[i_49] = 0;
            class305.field3725[i_49] = 0;
            class72.field1035[i_49] = 0;
            class263.field3325[i_49] = 0;
            class243.field3137[i_49] = 0;
          }

          for (i_49 = -5; i_49 < 109; i_49++) {
            for (i_14 = 0; i_14 < 104; i_14++) {
              i_15 = i_49 + 5;
              if (i_15 >= 0 && i_15 < 104) {
                i_16 = class50.field445[i_4][i_15][i_14] & 0xff;
                if (i_16 > 0) {
                  class259 class259_73 = class49.method953(i_16 - 1);
                  class50.field454[i_14] += class259_73.field3284;
                  class305.field3725[i_14] += class259_73.field3287;
                  class72.field1035[i_14] += class259_73.field3286;
                  class263.field3325[i_14] += class259_73.field3281;
                  ++class243.field3137[i_14];
                }
              }

              i_16 = i_49 - 5;
              if (i_16 >= 0 && i_16 < 104) {
                i_17 = class50.field445[i_4][i_16][i_14] & 0xff;
                if (i_17 > 0) {
                  class259 class259_67 = class49.method953(i_17 - 1);
                  class50.field454[i_14] -= class259_67.field3284;
                  class305.field3725[i_14] -= class259_67.field3287;
                  class72.field1035[i_14] -= class259_67.field3286;
                  class263.field3325[i_14] -= class259_67.field3281;
                  --class243.field3137[i_14];
                }
              }
            }

            if (i_49 >= 1 && i_49 < 103) {
              i_14 = 0;
              i_15 = 0;
              i_16 = 0;
              i_17 = 0;
              i_52 = 0;

              for (i_19 = -5; i_19 < 109; i_19++) {
                i_20 = i_19 + 5;
                if (i_20 >= 0 && i_20 < 104) {
                  i_14 += class50.field454[i_20];
                  i_15 += class305.field3725[i_20];
                  i_16 += class72.field1035[i_20];
                  i_17 += class263.field3325[i_20];
                  i_52 += class243.field3137[i_20];
                }

                i_21 = i_19 - 5;
                if (i_21 >= 0 && i_21 < 104) {
                  i_14 -= class50.field454[i_21];
                  i_15 -= class305.field3725[i_21];
                  i_16 -= class72.field1035[i_21];
                  i_17 -= class263.field3325[i_21];
                  i_52 -= class243.field3137[i_21];
                }

                if (i_19 >= 1 && i_19 < 103 && (!client.field585
                    || (class50.field443[0][i_49][i_19] & 0x2) != 0
                    || (class50.field443[i_4][i_49][i_19] & 0x10) == 0)) {
                  if (i_4 < class50.field442) {
                    class50.field442 = i_4;
                  }

                  i_22 = class50.field445[i_4][i_49][i_19] & 0xff;
                  i_23 = class165.field2033[i_4][i_49][i_19] & 0xff;
                  if (i_22 > 0 || i_23 > 0) {
                    i_24 = class50.field459[i_4][i_49][i_19];
                    i_25 = class50.field459[i_4][i_49 + 1][i_19];
                    i_26 = class50.field459[i_4][i_49 + 1][i_19 + 1];
                    i_27 = class50.field459[i_4][i_49][i_19 + 1];
                    i_28 = class50.field448[i_49][i_19];
                    i_29 = class50.field448[i_49 + 1][i_19];
                    int i_30 = class50.field448[i_49 + 1][i_19 + 1];
                    int i_31 = class50.field448[i_49][i_19 + 1];
                    i_32 = -1;
                    i_33 = -1;
                    if (i_22 > 0) {
                      i_34 = i_14 * 256 / i_17;
                      i_35 = i_15 / i_52;
                      i_36 = i_16 / i_52;
                      i_32 = class34.method560(i_34, i_35, i_36);
                      i_34 = i_34 + class50.field457 & 0xff;
                      i_36 += class50.field455;
                      if (i_36 < 0) {
                        i_36 = 0;
                      } else if (i_36 > 255) {
                        i_36 = 255;
                      }

                      i_33 = class34.method560(i_34, i_35, i_36);
                    }

                    if (i_4 > 0) {
                      boolean bool_69 = true;
                      if (i_22 == 0 && class50.field446[i_4][i_49][i_19] != 0) {
                        bool_69 = false;
                      }

                      if (i_23 > 0 && !class1.method15(i_23 - 1).field3523) {
                        bool_69 = false;
                      }

                      if (bool_69 && i_24 == i_25 && i_24 == i_26 && i_24 == i_27) {
                        class37.field325[i_4][i_49][i_19] |= 0x924;
                      }
                    }

                    i_34 = 0;
                    if (i_33 != -1) {
                      i_34 = class122.field1675[class102.method2248(i_33, 96)];
                    }

                    if (i_23 == 0) {
                      class125_63.method3000(i_4, i_49, i_19, 0, 0, -1, i_24, i_25, i_26, i_27,
                                             class102.method2248(i_32, i_28),
                                             class102.method2248(i_32, i_29),
                                             class102.method2248(i_32, i_30),
                                             class102.method2248(i_32, i_31), 0, 0, 0, 0, i_34, 0);
                    } else {
                      i_35 = class50.field446[i_4][i_49][i_19] + 1;
                      byte b_70 = class19.field159[i_4][i_49][i_19];
                      class272 class272_37 = class1.method15(i_23 - 1);
                      i_38 = class272_37.field3526;
                      int i_41;
                      int i_42;
                      if (i_38 >= 0) {
                        i_40 = class122.field1667.vmethod3092(i_38);
                        i_39 = -1;
                      } else if (class272_37.field3533 == 16711935) {
                        i_39 = -2;
                        i_38 = -1;
                        i_40 = -2;
                      } else {
                        i_39 = class34.method560(class272_37.field3525, class272_37.field3530,
                                                 class272_37.field3531);
                        i_41 = class272_37.field3525 + class50.field457 & 0xff;
                        i_42 = class272_37.field3531 + class50.field455;
                        if (i_42 < 0) {
                          i_42 = 0;
                        } else if (i_42 > 255) {
                          i_42 = 255;
                        }

                        i_40 = class34.method560(i_41, class272_37.field3530, i_42);
                      }

                      i_41 = 0;
                      if (i_40 != -2) {
                        i_41 = class122.field1675[class30.method519(i_40, 96)];
                      }

                      if (class272_37.field3528 != -1) {
                        i_42 = class272_37.field3527 + class50.field457 & 0xff;
                        int i_43 = class272_37.field3534 + class50.field455;
                        if (i_43 < 0) {
                          i_43 = 0;
                        } else if (i_43 > 255) {
                          i_43 = 255;
                        }

                        i_40 = class34.method560(i_42, class272_37.field3532, i_43);
                        i_41 = class122.field1675[class30.method519(i_40, 96)];
                      }

                      class125_63
                          .method3000(i_4, i_49, i_19, i_35, b_70, i_38, i_24, i_25, i_26, i_27,
                                      class102.method2248(i_32, i_28),
                                      class102.method2248(i_32, i_29),
                                      class102.method2248(i_32, i_30),
                                      class102.method2248(i_32, i_31),
                                      class30.method519(i_39, i_28), class30.method519(i_39, i_29),
                                      class30.method519(i_39, i_30), class30.method519(i_39, i_31),
                                      i_34, i_41);
                    }
                  }
                }
              }
            }
          }

          for (i_49 = 1; i_49 < 103; i_49++) {
            for (i_14 = 1; i_14 < 103; i_14++) {
              if ((class50.field443[i_4][i_14][i_49] & 0x8) != 0) {
                i_19 = 0;
              } else if (i_4 > 0 && (class50.field443[1][i_14][i_49] & 0x2) != 0) {
                i_19 = i_4 - 1;
              } else {
                i_19 = i_4;
              }

              class125_63.method2876(i_4, i_14, i_49, i_19);
            }
          }

          class50.field445[i_4] = null;
          class165.field2033[i_4] = null;
          class50.field446[i_4] = null;
          class19.field159[i_4] = null;
          class50.field447[i_4] = null;
        }

        class125_63.method3038(-50, -10, -50);

        for (i_4 = 0; i_4 < 104; i_4++) {
          for (i_46 = 0; i_46 < 104; i_46++) {
            if ((class50.field443[1][i_4][i_46] & 0x2) == 2) {
              class125_63.method3041(i_4, i_46);
            }
          }
        }

        i_4 = 1;
        i_46 = 2;
        i_6 = 4;

        for (i_7 = 0; i_7 < 4; i_7++) {
          if (i_7 > 0) {
            i_4 <<= 3;
            i_46 <<= 3;
            i_6 <<= 3;
          }

          for (i_47 = 0; i_47 <= i_7; i_47++) {
            for (i_9 = 0; i_9 <= 104; i_9++) {
              for (i_10 = 0; i_10 <= 104; i_10++) {
                short s_68;
                if ((class37.field325[i_47][i_10][i_9] & i_4) != 0) {
                  i_11 = i_9;
                  i_12 = i_9;
                  i_49 = i_47;

                  for (i_14 = i_47; i_11 > 0 && (class37.field325[i_47][i_10][i_11 - 1] & i_4) != 0;
                      --i_11) {
                  }

                  while (i_12 < 104 && (class37.field325[i_47][i_10][i_12 + 1] & i_4) != 0) {
                    ++i_12;
                  }

                  label1030:
                  while (i_49 > 0) {
                    for (i_15 = i_11; i_15 <= i_12; i_15++) {
                      if ((class37.field325[i_49 - 1][i_10][i_15] & i_4) == 0) {
                        break label1030;
                      }
                    }

                    --i_49;
                  }

                  label1019:
                  while (i_14 < i_7) {
                    for (i_15 = i_11; i_15 <= i_12; i_15++) {
                      if ((class37.field325[i_14 + 1][i_10][i_15] & i_4) == 0) {
                        break label1019;
                      }
                    }

                    ++i_14;
                  }

                  i_15 = (i_12 - i_11 + 1) * (i_14 + 1 - i_49);
                  if (i_15 >= 8) {
                    s_68 = 240;
                    i_17 = class50.field459[i_14][i_10][i_11] - s_68;
                    i_52 = class50.field459[i_49][i_10][i_11];
                    class125
                        .method2997(i_7, 1, i_10 * 128, i_10 * 128, i_11 * 128, i_12 * 128 + 128,
                                    i_17, i_52);

                    for (i_19 = i_49; i_19 <= i_14; i_19++) {
                      for (i_20 = i_11; i_20 <= i_12; i_20++) {
                        class37.field325[i_19][i_10][i_20] &= ~i_4;
                      }
                    }
                  }
                }

                if ((class37.field325[i_47][i_10][i_9] & i_46) != 0) {
                  i_11 = i_10;
                  i_12 = i_10;
                  i_49 = i_47;

                  for (i_14 = i_47; i_11 > 0 && (class37.field325[i_47][i_11 - 1][i_9] & i_46) != 0;
                      --i_11) {
                  }

                  while (i_12 < 104 && (class37.field325[i_47][i_12 + 1][i_9] & i_46) != 0) {
                    ++i_12;
                  }

                  label1083:
                  while (i_49 > 0) {
                    for (i_15 = i_11; i_15 <= i_12; i_15++) {
                      if ((class37.field325[i_49 - 1][i_15][i_9] & i_46) == 0) {
                        break label1083;
                      }
                    }

                    --i_49;
                  }

                  label1072:
                  while (i_14 < i_7) {
                    for (i_15 = i_11; i_15 <= i_12; i_15++) {
                      if ((class37.field325[i_14 + 1][i_15][i_9] & i_46) == 0) {
                        break label1072;
                      }
                    }

                    ++i_14;
                  }

                  i_15 = (i_12 - i_11 + 1) * (i_14 + 1 - i_49);
                  if (i_15 >= 8) {
                    s_68 = 240;
                    i_17 = class50.field459[i_14][i_11][i_9] - s_68;
                    i_52 = class50.field459[i_49][i_11][i_9];
                    class125.method2997(i_7, 2, i_11 * 128, i_12 * 128 + 128, i_9 * 128, i_9 * 128,
                                        i_17, i_52);

                    for (i_19 = i_49; i_19 <= i_14; i_19++) {
                      for (i_20 = i_11; i_20 <= i_12; i_20++) {
                        class37.field325[i_19][i_20][i_9] &= ~i_46;
                      }
                    }
                  }
                }

                if ((class37.field325[i_47][i_10][i_9] & i_6) != 0) {
                  i_11 = i_10;
                  i_12 = i_10;
                  i_49 = i_9;

                  for (i_14 = i_9; i_49 > 0 && (class37.field325[i_47][i_10][i_49 - 1] & i_6) != 0;
                      --i_49) {
                  }

                  while (i_14 < 104 && (class37.field325[i_47][i_10][i_14 + 1] & i_6) != 0) {
                    ++i_14;
                  }

                  label1136:
                  while (i_11 > 0) {
                    for (i_15 = i_49; i_15 <= i_14; i_15++) {
                      if ((class37.field325[i_47][i_11 - 1][i_15] & i_6) == 0) {
                        break label1136;
                      }
                    }

                    --i_11;
                  }

                  label1125:
                  while (i_12 < 104) {
                    for (i_15 = i_49; i_15 <= i_14; i_15++) {
                      if ((class37.field325[i_47][i_12 + 1][i_15] & i_6) == 0) {
                        break label1125;
                      }
                    }

                    ++i_12;
                  }

                  if ((i_14 - i_49 + 1) * (i_12 - i_11 + 1) >= 4) {
                    i_15 = class50.field459[i_47][i_11][i_49];
                    class125.method2997(i_7, 4, i_11 * 128, i_12 * 128 + 128, i_49 * 128,
                                        i_14 * 128 + 128, i_15, i_15);

                    for (i_16 = i_11; i_16 <= i_12; i_16++) {
                      for (i_17 = i_49; i_17 <= i_14; i_17++) {
                        class37.field325[i_47][i_16][i_17] &= ~i_6;
                      }
                    }
                  }
                }
              }
            }
          }
        }

        class14.method137(true);
        i_4 = class50.field442;
        if (i_4 > class13.field82) {
          i_4 = class13.field82;
        }

        if (i_4 < class13.field82 - 1) {
          i_4 = class13.field82 - 1;
        }

        if (client.field585) {
          class28.field248.method2904(class50.field442);
        } else {
          class28.field248.method2904(0);
        }

        for (i_46 = 0; i_46 < 104; i_46++) {
          for (i_6 = 0; i_6 < 104; i_6++) {
            class253.method4808(i_46, i_6);
          }
        }

        class54.method1017();
        class160.method3342();
        class268.field3391.method3984();
        OutboundPacket class172_65;
        if (Buffer.field2334.method801()) {
          class172_65 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2148, client.field626.field1218);
          class172_65.buffer.putInt32(1057001181);
          client.field626.method1980(class172_65);
        }

        if (!client.field759) {
          i_46 = (class27.field224 - 6) / 8;
          i_6 = (class27.field224 + 6) / 8;
          i_7 = (class34.field301 - 6) / 8;
          i_47 = (class34.field301 + 6) / 8;

          for (i_9 = i_46 - 1; i_9 <= i_6 + 1; i_9++) {
            for (i_10 = i_7 - 1; i_10 <= i_47 + 1; i_10++) {
              if (i_9 < i_46 || i_9 > i_6 || i_10 < i_7 || i_10 > i_47) {
                RemoteArchiveRequest.field3159.method4648("m" + i_9 + "_" + i_10);
                RemoteArchiveRequest.field3159.method4648("l" + i_9 + "_" + i_10);
              }
            }
          }
        }

        Mouse.method947(30);
        class54.method1017();
        class49.method952();
        class172_65 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2224, client.field626.field1218);
        client.field626.method1980(class172_65);
        class43.field368.vmethod3330();

        for (i_6 = 0; i_6 < 32; i_6++) {
          class47.field394[i_6] = 0L;
        }

        for (i_6 = 0; i_6 < 32; i_6++) {
          class47.field404[i_6] = 0L;
        }

        class8.field48 = 0;
      }
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
  )
  public int vmethod5815() {
    return this.field111;
  }

}
