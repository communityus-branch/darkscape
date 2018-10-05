package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
public class class64 extends Node {

  @ObfuscatedName("d")
  static int[] field936;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -854731803
  )
  int field934;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -1588453017
  )
  int field935;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 1549500065
  )
  int field938;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 2023364683
  )
  int field937;

  class64(int i_1, int i_2, int i_3, int i_4) {
    this.field934 = i_1;
    this.field935 = i_2;
    this.field938 = i_3;
    this.field937 = i_4;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "66"
  )
  static void method1560() {
    class224.field2554 = new int[2000];
    int i_0 = 0;
    int i_1 = 240;

    int i_3;
    for (byte b_2 = 12; i_0 < 16; i_1 -= b_2) {
      i_3 = class143.method3167((double) ((float) i_1 / 360.0F), 0.9998999834060669D,
                                (double) (0.075F + (float) i_0 * 0.425F / 16.0F));
      class224.field2554[i_0] = i_3;
      ++i_0;
    }

    i_1 = 48;

    for (int i_5 = i_1 / 6; i_0 < class224.field2554.length; i_1 -= i_5) {
      i_3 = i_0 * 2;

      for (
          int i_4 = class143.method3167((double) ((float) i_1 / 360.0F), 0.9998999834060669D, 0.5D);
          i_0 < i_3 && i_0 < class224.field2554.length; i_0++) {
        class224.field2554[i_0] = i_4;
      }
    }

  }

  @ObfuscatedName("aw")
  @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "-95"
  )
  static int method1558(int i_0, class84 class84_1, boolean bool_2) {
    int i_3;
    if (i_0 == 6600) {
      i_3 = class13.field82;
      int i_13 = (class138.field1876.field931 >> 7) + class62.field868;
      int i_5 = (class138.field1876.field881 >> 7) + client.field754;
      class18.method196().method6011(i_3, i_13, i_5, true);
      return 1;
    } else {
      class20 class20_15;
      if (i_0 == 6601) {
        i_3 = class69.field999[--class69.field1003];
        String str_20 = "";
        class20_15 = class18.method196().method6029(i_3);
        if (class20_15 != null) {
          str_20 = class20_15.method210();
        }

        class69.field1001[++class55.field497 - 1] = str_20;
        return 1;
      } else if (i_0 == 6602) {
        i_3 = class69.field999[--class69.field1003];
        class18.method196().method6012(i_3);
        return 1;
      } else if (i_0 == 6603) {
        class69.field999[++class69.field1003 - 1] = class18.method196().method6026();
        return 1;
      } else if (i_0 == 6604) {
        i_3 = class69.field999[--class69.field1003];
        class18.method196().method6023(i_3);
        return 1;
      } else if (i_0 == 6605) {
        class69.field999[++class69.field1003 - 1] = class18.method196().method6096() ? 1 : 0;
        return 1;
      } else {
        class226 class226_19;
        if (i_0 == 6606) {
          class226_19 = new class226(class69.field999[--class69.field1003]);
          class18.method196().method6054(class226_19.field2564, class226_19.field2565);
          return 1;
        } else if (i_0 == 6607) {
          class226_19 = new class226(class69.field999[--class69.field1003]);
          class18.method196().method6031(class226_19.field2564, class226_19.field2565);
          return 1;
        } else if (i_0 == 6608) {
          class226_19 = new class226(class69.field999[--class69.field1003]);
          class18.method196()
              .method6046(class226_19.field2567, class226_19.field2564, class226_19.field2565);
          return 1;
        } else if (i_0 == 6609) {
          class226_19 = new class226(class69.field999[--class69.field1003]);
          class18.method196()
              .method6033(class226_19.field2567, class226_19.field2564, class226_19.field2565);
          return 1;
        } else if (i_0 == 6610) {
          class69.field999[++class69.field1003 - 1] = class18.method196().method6002();
          class69.field999[++class69.field1003 - 1] = class18.method196().method6035();
          return 1;
        } else {
          class20 class20_17;
          if (i_0 == 6611) {
            i_3 = class69.field999[--class69.field1003];
            class20_17 = class18.method196().method6029(i_3);
            if (class20_17 == null) {
              class69.field999[++class69.field1003 - 1] = 0;
            } else {
              class69.field999[++class69.field1003 - 1] = class20_17.method256().method4437();
            }

            return 1;
          } else if (i_0 == 6612) {
            i_3 = class69.field999[--class69.field1003];
            class20_17 = class18.method196().method6029(i_3);
            if (class20_17 == null) {
              class69.field999[++class69.field1003 - 1] = 0;
              class69.field999[++class69.field1003 - 1] = 0;
            } else {
              class69.field999[++class69.field1003 - 1] =
                  (class20_17.method214() - class20_17.method258() + 1) * 64;
              class69.field999[++class69.field1003 - 1] =
                  (class20_17.method249() - class20_17.method247() + 1) * 64;
            }

            return 1;
          } else if (i_0 == 6613) {
            i_3 = class69.field999[--class69.field1003];
            class20_17 = class18.method196().method6029(i_3);
            if (class20_17 == null) {
              class69.field999[++class69.field1003 - 1] = 0;
              class69.field999[++class69.field1003 - 1] = 0;
              class69.field999[++class69.field1003 - 1] = 0;
              class69.field999[++class69.field1003 - 1] = 0;
            } else {
              class69.field999[++class69.field1003 - 1] = class20_17.method258() * 64;
              class69.field999[++class69.field1003 - 1] = class20_17.method247() * 64;
              class69.field999[++class69.field1003 - 1] = class20_17.method214() * 64 + 64 - 1;
              class69.field999[++class69.field1003 - 1] = class20_17.method249() * 64 + 64 - 1;
            }

            return 1;
          } else if (i_0 == 6614) {
            i_3 = class69.field999[--class69.field1003];
            class20_17 = class18.method196().method6029(i_3);
            if (class20_17 == null) {
              class69.field999[++class69.field1003 - 1] = -1;
            } else {
              class69.field999[++class69.field1003 - 1] = class20_17.method212();
            }

            return 1;
          } else if (i_0 == 6615) {
            class226_19 = class18.method196().method6001();
            if (class226_19 == null) {
              class69.field999[++class69.field1003 - 1] = -1;
              class69.field999[++class69.field1003 - 1] = -1;
            } else {
              class69.field999[++class69.field1003 - 1] = class226_19.field2564;
              class69.field999[++class69.field1003 - 1] = class226_19.field2565;
            }

            return 1;
          } else if (i_0 == 6616) {
            class69.field999[++class69.field1003 - 1] = class18.method196().method6153();
            return 1;
          } else if (i_0 == 6617) {
            class226_19 = new class226(class69.field999[--class69.field1003]);
            class20_17 = class18.method196().method6014();
            if (class20_17 == null) {
              class69.field999[++class69.field1003 - 1] = -1;
              class69.field999[++class69.field1003 - 1] = -1;
              return 1;
            } else {
              int[] ints_18 = class20_17
                  .method213(class226_19.field2567, class226_19.field2564, class226_19.field2565);
              if (ints_18 == null) {
                class69.field999[++class69.field1003 - 1] = -1;
                class69.field999[++class69.field1003 - 1] = -1;
              } else {
                class69.field999[++class69.field1003 - 1] = ints_18[0];
                class69.field999[++class69.field1003 - 1] = ints_18[1];
              }

              return 1;
            }
          } else {
            class226 class226_11;
            if (i_0 == 6618) {
              class226_19 = new class226(class69.field999[--class69.field1003]);
              class20_17 = class18.method196().method6014();
              if (class20_17 == null) {
                class69.field999[++class69.field1003 - 1] = -1;
                class69.field999[++class69.field1003 - 1] = -1;
                return 1;
              } else {
                class226_11 = class20_17.method205(class226_19.field2564, class226_19.field2565);
                if (class226_11 == null) {
                  class69.field999[++class69.field1003 - 1] = -1;
                } else {
                  class69.field999[++class69.field1003 - 1] = class226_11.method4437();
                }

                return 1;
              }
            } else {
              int i_6;
              int i_7;
              int i_8;
              class226 class226_9;
              class226 class226_16;
              if (i_0 == 6619) {
                class69.field1003 -= 2;
                i_3 = class69.field999[class69.field1003];
                class226_16 = new class226(class69.field999[class69.field1003 + 1]);
                class20_15 = class18.method196().method6029(i_3);
                i_6 = class138.field1876.field567;
                i_7 = (class138.field1876.field931 >> 7) + class62.field868;
                i_8 = (class138.field1876.field881 >> 7) + client.field754;
                class226_9 = new class226(i_6, i_7, i_8);
                class18.method196().method6073(class20_15, class226_9, class226_16, false);
                return 1;
              } else if (i_0 == 6620) {
                class69.field1003 -= 2;
                i_3 = class69.field999[class69.field1003];
                class226_16 = new class226(class69.field999[class69.field1003 + 1]);
                class20_15 = class18.method196().method6029(i_3);
                i_6 = class138.field1876.field567;
                i_7 = (class138.field1876.field931 >> 7) + class62.field868;
                i_8 = (class138.field1876.field881 >> 7) + client.field754;
                class226_9 = new class226(i_6, i_7, i_8);
                class18.method196().method6073(class20_15, class226_9, class226_16, true);
                return 1;
              } else if (i_0 == 6621) {
                class69.field1003 -= 2;
                i_3 = class69.field999[class69.field1003];
                class226_16 = new class226(class69.field999[class69.field1003 + 1]);
                class20_15 = class18.method196().method6029(i_3);
                if (class20_15 == null) {
                  class69.field999[++class69.field1003 - 1] = 0;
                  return 1;
                } else {
                  class69.field999[++class69.field1003 - 1] = class20_15
                      .method202(class226_16.field2567, class226_16.field2564,
                                 class226_16.field2565) ? 1 : 0;
                  return 1;
                }
              } else if (i_0 == 6622) {
                class69.field999[++class69.field1003 - 1] = class18.method196().method6142();
                class69.field999[++class69.field1003 - 1] = class18.method196().method6038();
                return 1;
              } else if (i_0 == 6623) {
                class226_19 = new class226(class69.field999[--class69.field1003]);
                class20_17 = class18.method196()
                    .method6116(class226_19.field2567, class226_19.field2564,
                                class226_19.field2565);
                if (class20_17 == null) {
                  class69.field999[++class69.field1003 - 1] = -1;
                } else {
                  class69.field999[++class69.field1003 - 1] = class20_17.method207();
                }

                return 1;
              } else if (i_0 == 6624) {
                class18.method196().method6089(class69.field999[--class69.field1003]);
                return 1;
              } else if (i_0 == 6625) {
                class18.method196().method6040();
                return 1;
              } else if (i_0 == 6626) {
                class18.method196().method6041(class69.field999[--class69.field1003]);
                return 1;
              } else if (i_0 == 6627) {
                class18.method196().method6042();
                return 1;
              } else {
                boolean bool_14;
                if (i_0 == 6628) {
                  bool_14 = class69.field999[--class69.field1003] == 1;
                  class18.method196().method6034(bool_14);
                  return 1;
                } else if (i_0 == 6629) {
                  i_3 = class69.field999[--class69.field1003];
                  class18.method196().method6106(i_3);
                  return 1;
                } else if (i_0 == 6630) {
                  i_3 = class69.field999[--class69.field1003];
                  class18.method196().method6152(i_3);
                  return 1;
                } else if (i_0 == 6631) {
                  class18.method196().method6114();
                  return 1;
                } else if (i_0 == 6632) {
                  bool_14 = class69.field999[--class69.field1003] == 1;
                  class18.method196().method6047(bool_14);
                  return 1;
                } else {
                  boolean bool_4;
                  if (i_0 == 6633) {
                    class69.field1003 -= 2;
                    i_3 = class69.field999[class69.field1003];
                    bool_4 = class69.field999[class69.field1003 + 1] == 1;
                    class18.method196().method6048(i_3, bool_4);
                    return 1;
                  } else if (i_0 == 6634) {
                    class69.field1003 -= 2;
                    i_3 = class69.field999[class69.field1003];
                    bool_4 = class69.field999[class69.field1003 + 1] == 1;
                    class18.method196().method6049(i_3, bool_4);
                    return 1;
                  } else if (i_0 == 6635) {
                    class69.field999[++class69.field1003 - 1] =
                        class18.method196().method6050() ? 1 : 0;
                    return 1;
                  } else if (i_0 == 6636) {
                    i_3 = class69.field999[--class69.field1003];
                    class69.field999[++class69.field1003 - 1] =
                        class18.method196().method6051(i_3) ? 1 : 0;
                    return 1;
                  } else if (i_0 == 6637) {
                    i_3 = class69.field999[--class69.field1003];
                    class69.field999[++class69.field1003 - 1] =
                        class18.method196().method6052(i_3) ? 1 : 0;
                    return 1;
                  } else if (i_0 == 6638) {
                    class69.field1003 -= 2;
                    i_3 = class69.field999[class69.field1003];
                    class226_16 = new class226(class69.field999[class69.field1003 + 1]);
                    class226_11 = class18.method196().method6100(i_3, class226_16);
                    if (class226_11 == null) {
                      class69.field999[++class69.field1003 - 1] = -1;
                    } else {
                      class69.field999[++class69.field1003 - 1] = class226_11.method4437();
                    }

                    return 1;
                  } else {
                    class28 class28_12;
                    if (i_0 == 6639) {
                      class28_12 = class18.method196().method6146();
                      if (class28_12 == null) {
                        class69.field999[++class69.field1003 - 1] = -1;
                        class69.field999[++class69.field1003 - 1] = -1;
                      } else {
                        class69.field999[++class69.field1003 - 1] = class28_12.field240;
                        class69.field999[++class69.field1003 - 1] = class28_12.field236
                            .method4437();
                      }

                      return 1;
                    } else if (i_0 == 6640) {
                      class28_12 = class18.method196().method6186();
                      if (class28_12 == null) {
                        class69.field999[++class69.field1003 - 1] = -1;
                        class69.field999[++class69.field1003 - 1] = -1;
                      } else {
                        class69.field999[++class69.field1003 - 1] = class28_12.field240;
                        class69.field999[++class69.field1003 - 1] = class28_12.field236
                            .method4437();
                      }

                      return 1;
                    } else {
                      class255 class255_10;
                      if (i_0 == 6693) {
                        i_3 = class69.field999[--class69.field1003];
                        class255_10 = class255.field3246[i_3];
                        if (class255_10.field3241 == null) {
                          class69.field1001[++class55.field497 - 1] = "";
                        } else {
                          class69.field1001[++class55.field497 - 1] = class255_10.field3241;
                        }

                        return 1;
                      } else if (i_0 == 6694) {
                        i_3 = class69.field999[--class69.field1003];
                        class255_10 = class255.field3246[i_3];
                        class69.field999[++class69.field1003 - 1] = class255_10.field3243;
                        return 1;
                      } else if (i_0 == 6695) {
                        i_3 = class69.field999[--class69.field1003];
                        class255_10 = class255.field3246[i_3];
                        if (class255_10 == null) {
                          class69.field999[++class69.field1003 - 1] = -1;
                        } else {
                          class69.field999[++class69.field1003 - 1] = class255_10.field3240;
                        }

                        return 1;
                      } else if (i_0 == 6696) {
                        i_3 = class69.field999[--class69.field1003];
                        class255_10 = class255.field3246[i_3];
                        if (class255_10 == null) {
                          class69.field999[++class69.field1003 - 1] = -1;
                        } else {
                          class69.field999[++class69.field1003 - 1] = class255_10.field3239;
                        }

                        return 1;
                      } else if (i_0 == 6697) {
                        class69.field999[++class69.field1003 - 1] = class312.field3750.field307;
                        return 1;
                      } else if (i_0 == 6698) {
                        class69.field999[++class69.field1003 - 1] = class312.field3750.field311
                            .method4437();
                        return 1;
                      } else if (i_0 == 6699) {
                        class69.field999[++class69.field1003 - 1] = class312.field3750.field308
                            .method4437();
                        return 1;
                      } else {
                        return 2;
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

  @ObfuscatedName("is")
  @ObfuscatedSignature(
      signature = "(Lhi;IIZI)V",
      garbageValue = "-1969536993"
  )
  static void method1563(class230 class230_0, int i_1, int i_2, boolean bool_3) {
    int i_4 = class230_0.field2675;
    int i_5 = class230_0.field2621;
    if (class230_0.field2612 == 0) {
      class230_0.field2675 = class230_0.field2616;
    } else if (class230_0.field2612 == 1) {
      class230_0.field2675 = i_1 - class230_0.field2616;
    } else if (class230_0.field2612 == 2) {
      class230_0.field2675 = class230_0.field2616 * i_1 >> 14;
    }

    if (class230_0.field2624 == 0) {
      class230_0.field2621 = class230_0.field2617;
    } else if (class230_0.field2624 == 1) {
      class230_0.field2621 = i_2 - class230_0.field2617;
    } else if (class230_0.field2624 == 2) {
      class230_0.field2621 = i_2 * class230_0.field2617 >> 14;
    }

    if (class230_0.field2612 == 4) {
      class230_0.field2675 = class230_0.field2621 * class230_0.field2622 / class230_0.field2623;
    }

    if (class230_0.field2624 == 4) {
      class230_0.field2621 = class230_0.field2623 * class230_0.field2675 / class230_0.field2622;
    }

    if (class230_0.field2609 == 1337) {
      client.field784 = class230_0;
    }

    if (bool_3 && class230_0.field2715 != null && (i_4 != class230_0.field2675
        || i_5 != class230_0.field2621)) {
      class56 class56_6 = new class56();
      class56_6.field506 = class230_0;
      class56_6.field512 = class230_0.field2715;
      client.field638.addLast(class56_6);
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-2116871828"
  )
  void method1559(int i_1, int i_2, int i_3, int i_4) {
    this.field934 = i_1;
    this.field935 = i_2;
    this.field938 = i_3;
    this.field937 = i_4;
  }

}
