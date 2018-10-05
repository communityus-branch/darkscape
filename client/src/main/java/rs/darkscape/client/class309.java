package rs.darkscape.client;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class309 implements Comparator {

  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = -298322265
  )
  public static int field3740;
  @ObfuscatedName("z")
  final boolean field3741;

  public class309(boolean bool_1) {
    this.field3741 = bool_1;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lbo;II)V",
      garbageValue = "1199859581"
  )
  static void method5674(class56 class56_0, int i_1) {
    Object[] arr_2 = class56_0.field512;
    int i_5 = class56_0.field515;
    boolean bool_4 =
        i_5 == 10 || i_5 == 11 || i_5 == 12 || i_5 == 13 || i_5 == 14 || i_5 == 15 || i_5 == 16
            || i_5 == 17;
    class84 class84_3;
    int i_9;
    int i_10;
    int i_11;
    int i_13;
    int i_18;
    if (bool_4) {
      class312.field3750 = (class36) arr_2[0];
      class255 class255_6 = class255.field3246[class312.field3750.field307];
      int i_8 = class56_0.field515;
      i_9 = class255_6.field3238;
      i_10 = class255_6.field3240;
      i_11 = class17.method170(i_9, i_8);
      class84 class84_12 = class134.method3104(i_11, i_8);
      class84 class84_7;
      if (class84_12 != null) {
        class84_7 = class84_12;
      } else {
        i_13 = i_8 + (i_10 + 40000 << 8);
        class84_12 = class134.method3104(i_13, i_8);
        if (class84_12 != null) {
          class84_7 = class84_12;
        } else {
          class84_7 = null;
        }
      }

      class84_3 = class84_7;
    } else {
      i_18 = ((Integer) arr_2[0]).intValue();
      class84_3 = class133.method3099(i_18);
    }

    if (class84_3 != null) {
      class69.field1003 = 0;
      class55.field497 = 0;
      i_18 = -1;
      int[] ints_29 = class84_3.field1189;
      int[] ints_19 = class84_3.field1196;
      byte b_30 = -1;
      class69.field1008 = 0;

      int i_20;
      try {
        class69.field1005 = new int[class84_3.field1192];
        i_10 = 0;
        class130.field1800 = new String[class84_3.field1193];
        i_11 = 0;

        String string_21;
        for (i_20 = 1; i_20 < arr_2.length; i_20++) {
          if (arr_2[i_20] instanceof Integer) {
            i_13 = ((Integer) arr_2[i_20]).intValue();
            if (i_13 == -2147483647) {
              i_13 = class56_0.field511;
            }

            if (i_13 == -2147483646) {
              i_13 = class56_0.field508;
            }

            if (i_13 == -2147483645) {
              i_13 = class56_0.field506 != null ? class56_0.field506.field2691 : -1;
            }

            if (i_13 == -2147483644) {
              i_13 = class56_0.field517;
            }

            if (i_13 == -2147483643) {
              i_13 = class56_0.field506 != null ? class56_0.field506.field2606 : -1;
            }

            if (i_13 == -2147483642) {
              i_13 = class56_0.field507 != null ? class56_0.field507.field2691 : -1;
            }

            if (i_13 == -2147483641) {
              i_13 = class56_0.field507 != null ? class56_0.field507.field2606 : -1;
            }

            if (i_13 == -2147483640) {
              i_13 = class56_0.field509;
            }

            if (i_13 == -2147483639) {
              i_13 = class56_0.field513;
            }

            class69.field1005[i_10++] = i_13;
          } else if (arr_2[i_20] instanceof String) {
            string_21 = (String) arr_2[i_20];
            if (string_21.equals("event_opbase")) {
              string_21 = class56_0.field504;
            }

            class130.field1800[i_11++] = string_21;
          }
        }

        i_20 = 0;
        class69.field1009 = class56_0.field514;

        while (true) {
          while (true) {
            while (true) {
              while (true) {
                while (true) {
                  while (true) {
                    while (true) {
                      while (true) {
                        while (true) {
                          while (true) {
                            while (true) {
                              while (true) {
                                while (true) {
                                  while (true) {
                                    while (true) {
                                      while (true) {
                                        while (true) {
                                          while (true) {
                                            while (true) {
                                              while (true) {
                                                while (true) {
                                                  while (true) {
                                                    while (true) {
                                                      while (true) {
                                                        while (true) {
                                                          label310:
                                                          while (true) {
                                                            ++i_20;
                                                            if (i_20 > i_1) {
                                                              throw new RuntimeException();
                                                            }

                                                            ++i_18;
                                                            i_9 = ints_29[i_18];
                                                            int i_23;
                                                            if (i_9 < 100) {
                                                              if (i_9 != 0) {
                                                                if (i_9 != 1) {
                                                                  if (i_9 != 2) {
                                                                    if (i_9 != 3) {
                                                                      if (i_9 != 6) {
                                                                        if (i_9 != 7) {
                                                                          if (i_9 != 8) {
                                                                            if (i_9 != 9) {
                                                                              if (i_9 != 10) {
                                                                                if (i_9 != 21) {
                                                                                  if (i_9 != 25) {
                                                                                    if (i_9 != 27) {
                                                                                      if (i_9
                                                                                          != 31) {
                                                                                        if (i_9
                                                                                            != 32) {
                                                                                          if (i_9
                                                                                              != 33) {
                                                                                            if (i_9
                                                                                                != 34) {
                                                                                              if (i_9
                                                                                                  != 35) {
                                                                                                if (i_9
                                                                                                    != 36) {
                                                                                                  if (i_9
                                                                                                      != 37) {
                                                                                                    if (i_9
                                                                                                        != 38) {
                                                                                                      if (i_9
                                                                                                          != 39) {
                                                                                                        int i_17;
                                                                                                        if (i_9
                                                                                                            != 40) {
                                                                                                          if (i_9
                                                                                                              != 42) {
                                                                                                            if (i_9
                                                                                                                != 43) {
                                                                                                              if (i_9
                                                                                                                  == 44) {
                                                                                                                i_13 =
                                                                                                                    ints_19[i_18]
                                                                                                                        >> 16;
                                                                                                                i_23 =
                                                                                                                    ints_19[i_18]
                                                                                                                        & 0xffff;
                                                                                                                int i_24 = class69.field999[--class69.field1003];
                                                                                                                if (i_24
                                                                                                                    >= 0
                                                                                                                    &&
                                                                                                                    i_24
                                                                                                                        <= 5000) {
                                                                                                                  class69.field1000[i_13] = i_24;
                                                                                                                  byte b_25 = -1;
                                                                                                                  if (i_23
                                                                                                                      == 105) {
                                                                                                                    b_25 = 0;
                                                                                                                  }

                                                                                                                  i_17 = 0;

                                                                                                                  while (true) {
                                                                                                                    if (i_17
                                                                                                                        >= i_24) {
                                                                                                                      continue label310;
                                                                                                                    }

                                                                                                                    class69.field1002[i_13][i_17] = b_25;
                                                                                                                    ++i_17;
                                                                                                                  }
                                                                                                                }

                                                                                                                throw new RuntimeException();
                                                                                                              } else if (
                                                                                                                  i_9
                                                                                                                      == 45) {
                                                                                                                i_13 = ints_19[i_18];
                                                                                                                i_23 = class69.field999[--class69.field1003];
                                                                                                                if (i_23
                                                                                                                    < 0
                                                                                                                    ||
                                                                                                                    i_23
                                                                                                                        >= class69.field1000[i_13]) {
                                                                                                                  throw new RuntimeException();
                                                                                                                }

                                                                                                                class69.field999[
                                                                                                                    ++class69.field1003
                                                                                                                        - 1] = class69.field1002[i_13][i_23];
                                                                                                              } else if (
                                                                                                                  i_9
                                                                                                                      == 46) {
                                                                                                                i_13 = ints_19[i_18];
                                                                                                                class69.field1003 -= 2;
                                                                                                                i_23 = class69.field999[class69.field1003];
                                                                                                                if (i_23
                                                                                                                    < 0
                                                                                                                    ||
                                                                                                                    i_23
                                                                                                                        >= class69.field1000[i_13]) {
                                                                                                                  throw new RuntimeException();
                                                                                                                }

                                                                                                                class69.field1002[i_13][i_23] = class69.field999[
                                                                                                                    class69.field1003
                                                                                                                        + 1];
                                                                                                              } else if (
                                                                                                                  i_9
                                                                                                                      == 47) {
                                                                                                                string_21 = class22.field185
                                                                                                                    .method1890(
                                                                                                                        ints_19[i_18]);
                                                                                                                if (string_21
                                                                                                                    == null) {
                                                                                                                  string_21 = "null";
                                                                                                                }

                                                                                                                class69.field1001[
                                                                                                                    ++class55.field497
                                                                                                                        - 1] = string_21;
                                                                                                              } else if (
                                                                                                                  i_9
                                                                                                                      == 48) {
                                                                                                                class22.field185
                                                                                                                    .method1889(
                                                                                                                        ints_19[i_18],
                                                                                                                        class69.field1001[--class55.field497]);
                                                                                                              } else {
                                                                                                                if (i_9
                                                                                                                    != 60) {
                                                                                                                  throw new IllegalStateException();
                                                                                                                }

                                                                                                                class197 class197_35 = class84_3.field1194[ints_19[i_18]];
                                                                                                                class211 class211_32 = (class211) class197_35
                                                                                                                    .method3945(
                                                                                                                        (long) class69.field999[--class69.field1003]);
                                                                                                                if (class211_32
                                                                                                                    != null) {
                                                                                                                  i_18 += class211_32.field2438;
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              class22.field185
                                                                                                                  .method1903(
                                                                                                                      ints_19[i_18],
                                                                                                                      class69.field999[--class69.field1003]);
                                                                                                            }
                                                                                                          } else {
                                                                                                            class69.field999[
                                                                                                                ++class69.field1003
                                                                                                                    - 1] = class22.field185
                                                                                                                .method1897(
                                                                                                                    ints_19[i_18]);
                                                                                                          }
                                                                                                        } else {
                                                                                                          i_13 = ints_19[i_18];
                                                                                                          class84 class84_31 = class133
                                                                                                              .method3099(
                                                                                                                  i_13);
                                                                                                          int[] ints_15 = new int[class84_31.field1192];
                                                                                                          String[] arr_16 = new String[class84_31.field1193];

                                                                                                          for (
                                                                                                              i_17 = 0;
                                                                                                              i_17
                                                                                                                  < class84_31.field1188;
                                                                                                              i_17++) {
                                                                                                            ints_15[i_17] = class69.field999[
                                                                                                                i_17
                                                                                                                    + (
                                                                                                                    class69.field1003
                                                                                                                        - class84_31.field1188)];
                                                                                                          }

                                                                                                          for (
                                                                                                              i_17 = 0;
                                                                                                              i_17
                                                                                                                  < class84_31.field1195;
                                                                                                              i_17++) {
                                                                                                            arr_16[i_17] = class69.field1001[
                                                                                                                i_17
                                                                                                                    + (
                                                                                                                    class55.field497
                                                                                                                        - class84_31.field1195)];
                                                                                                          }

                                                                                                          class69.field1003 -= class84_31.field1188;
                                                                                                          class55.field497 -= class84_31.field1195;
                                                                                                          class51 class51_22 = new class51();
                                                                                                          class51_22.field466 = class84_3;
                                                                                                          class51_22.field463 = i_18;
                                                                                                          class51_22.field462 = class69.field1005;
                                                                                                          class51_22.field465 = class130.field1800;
                                                                                                          class69.field1006[
                                                                                                              ++class69.field1008
                                                                                                                  - 1] = class51_22;
                                                                                                          class84_3 = class84_31;
                                                                                                          ints_29 = class84_31.field1189;
                                                                                                          ints_19 = class84_31.field1196;
                                                                                                          i_18 = -1;
                                                                                                          class69.field1005 = ints_15;
                                                                                                          class130.field1800 = arr_16;
                                                                                                        }
                                                                                                      } else {
                                                                                                        --class55.field497;
                                                                                                      }
                                                                                                    } else {
                                                                                                      --class69.field1003;
                                                                                                    }
                                                                                                  } else {
                                                                                                    i_13 = ints_19[i_18];
                                                                                                    class55.field497 -= i_13;
                                                                                                    String string_14 = class251
                                                                                                        .method4794(
                                                                                                            class69.field1001,
                                                                                                            class55.field497,
                                                                                                            i_13);
                                                                                                    class69.field1001[
                                                                                                        ++class55.field497
                                                                                                            - 1] = string_14;
                                                                                                  }
                                                                                                } else {
                                                                                                  class130.field1800[ints_19[i_18]] = class69.field1001[--class55.field497];
                                                                                                }
                                                                                              } else {
                                                                                                class69.field1001[
                                                                                                    ++class55.field497
                                                                                                        - 1] = class130.field1800[ints_19[i_18]];
                                                                                              }
                                                                                            } else {
                                                                                              class69.field1005[ints_19[i_18]] = class69.field999[--class69.field1003];
                                                                                            }
                                                                                          } else {
                                                                                            class69.field999[
                                                                                                ++class69.field1003
                                                                                                    - 1] = class69.field1005[ints_19[i_18]];
                                                                                          }
                                                                                        } else {
                                                                                          class69.field1003 -= 2;
                                                                                          if (class69.field999[class69.field1003]
                                                                                              >= class69.field999[
                                                                                              class69.field1003
                                                                                                  + 1]) {
                                                                                            i_18 += ints_19[i_18];
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        class69.field1003 -= 2;
                                                                                        if (class69.field999[class69.field1003]
                                                                                            <= class69.field999[
                                                                                            class69.field1003
                                                                                                + 1]) {
                                                                                          i_18 += ints_19[i_18];
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      i_13 = ints_19[i_18];
                                                                                      class67
                                                                                          .method1685(
                                                                                              i_13,
                                                                                              class69.field999[--class69.field1003]);
                                                                                    }
                                                                                  } else {
                                                                                    i_13 = ints_19[i_18];
                                                                                    class69.field999[
                                                                                        ++class69.field1003
                                                                                            - 1] = Temp
                                                                                        .method3389(
                                                                                            i_13);
                                                                                  }
                                                                                } else {
                                                                                  if (class69.field1008
                                                                                      == 0) {
                                                                                    return;
                                                                                  }

                                                                                  class51 class51_34 = class69.field1006[--class69.field1008];
                                                                                  class84_3 = class51_34.field466;
                                                                                  ints_29 = class84_3.field1189;
                                                                                  ints_19 = class84_3.field1196;
                                                                                  i_18 = class51_34.field463;
                                                                                  class69.field1005 = class51_34.field462;
                                                                                  class130.field1800 = class51_34.field465;
                                                                                }
                                                                              } else {
                                                                                class69.field1003 -= 2;
                                                                                if (class69.field999[class69.field1003]
                                                                                    > class69.field999[
                                                                                    class69.field1003
                                                                                        + 1]) {
                                                                                  i_18 += ints_19[i_18];
                                                                                }
                                                                              }
                                                                            } else {
                                                                              class69.field1003 -= 2;
                                                                              if (class69.field999[class69.field1003]
                                                                                  < class69.field999[
                                                                                  class69.field1003
                                                                                      + 1]) {
                                                                                i_18 += ints_19[i_18];
                                                                              }
                                                                            }
                                                                          } else {
                                                                            class69.field1003 -= 2;
                                                                            if (class69.field999[class69.field1003]
                                                                                == class69.field999[
                                                                                class69.field1003
                                                                                    + 1]) {
                                                                              i_18 += ints_19[i_18];
                                                                            }
                                                                          }
                                                                        } else {
                                                                          class69.field1003 -= 2;
                                                                          if (class69.field999[class69.field1003]
                                                                              != class69.field999[
                                                                              class69.field1003
                                                                                  + 1]) {
                                                                            i_18 += ints_19[i_18];
                                                                          }
                                                                        }
                                                                      } else {
                                                                        i_18 += ints_19[i_18];
                                                                      }
                                                                    } else {
                                                                      class69.field1001[
                                                                          ++class55.field497
                                                                              - 1] = class84_3.field1191[i_18];
                                                                    }
                                                                  } else {
                                                                    i_13 = ints_19[i_18];
                                                                    class225.field2558[i_13] = class69.field999[--class69.field1003];
                                                                    class45.method749(i_13);
                                                                  }
                                                                } else {
                                                                  i_13 = ints_19[i_18];
                                                                  class69.field999[
                                                                      ++class69.field1003
                                                                          - 1] = class225.field2558[i_13];
                                                                }
                                                              } else {
                                                                class69.field999[++class69.field1003
                                                                    - 1] = ints_19[i_18];
                                                              }
                                                            } else {
                                                              boolean bool_33;
                                                              if (class84_3.field1196[i_18] == 1) {
                                                                bool_33 = true;
                                                              } else {
                                                                bool_33 = false;
                                                              }

                                                              i_23 = class191
                                                                  .method3866(i_9, class84_3,
                                                                              bool_33);
                                                              switch (i_23) {
                                                                case 0:
                                                                  return;
                                                                case 1:
                                                                default:
                                                                  break;
                                                                case 2:
                                                                  throw new IllegalStateException();
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
          }
        }
      } catch (Exception exception_28) {
        StringBuilder stringbuilder_27 = new StringBuilder(30);
        stringbuilder_27.append("").append(class84_3.hashKey).append(" ");

        for (i_20 = class69.field1008 - 1; i_20 >= 0; --i_20) {
          stringbuilder_27.append("").append(class69.field1006[i_20].field466.hashKey)
              .append(" ");
        }

        stringbuilder_27.append("").append(b_30);
        class5.method65(stringbuilder_27.toString(), exception_28);
      }
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljx;Ljx;I)I",
      garbageValue = "870668832"
  )
  int method5670(class282 class282_1, class282 class282_2) {
    return this.field3741 ? class282_1.method5287().method5435(class282_2.method5287())
        : class282_2.method5287().method5435(class282_1.method5287());
  }

  public int compare(Object object_1, Object object_2) {
    return this.method5670((class282) object_1, (class282) object_2);
  }

  public boolean equals(Object object_1) {
    return super.equals(object_1);
  }

}
