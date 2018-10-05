package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.util.Time;

@ObfuscatedName("gv")
public abstract class class186 {

  @ObfuscatedName("ah")
  static int[] field2367;
  @ObfuscatedName("w")
  static boolean field2365 = false;

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(Laj;I)V",
      garbageValue = "-1775785270"
  )
  static void method3806(class47 class47_0) {
    int i_3;
    int i_14;
    if (class78.field1107) {
      if (Mouse.field431 == 1 || !class253.field3229 && Mouse.field431 == 4) {
        int i_1 = class78.field1082 + 280;
        if (Mouse.field432 >= i_1 && Mouse.field432 <= i_1 + 14 && Mouse.field428 >= 4
            && Mouse.field428 <= 18) {
          class148.method3195(0, 0);
        } else if (Mouse.field432 >= i_1 + 15 && Mouse.field432 <= i_1 + 80
            && Mouse.field428 >= 4 && Mouse.field428 <= 18) {
          class148.method3195(0, 1);
        } else {
          int i_2 = class78.field1082 + 390;
          if (Mouse.field432 >= i_2 && Mouse.field432 <= i_2 + 14 && Mouse.field428 >= 4
              && Mouse.field428 <= 18) {
            class148.method3195(1, 0);
          } else if (Mouse.field432 >= i_2 + 15 && Mouse.field432 <= i_2 + 80
              && Mouse.field428 >= 4 && Mouse.field428 <= 18) {
            class148.method3195(1, 1);
          } else {
            i_3 = class78.field1082 + 500;
            if (Mouse.field432 >= i_3 && Mouse.field432 <= i_3 + 14 && Mouse.field428 >= 4
                && Mouse.field428 <= 18) {
              class148.method3195(2, 0);
            } else if (Mouse.field432 >= i_3 + 15 && Mouse.field432 <= i_3 + 80
                && Mouse.field428 >= 4 && Mouse.field428 <= 18) {
              class148.method3195(2, 1);
            } else {
              i_14 = class78.field1082 + 610;
              if (Mouse.field432 >= i_14 && Mouse.field432 <= i_14 + 14 && Mouse.field428 >= 4
                  && Mouse.field428 <= 18) {
                class148.method3195(3, 0);
              } else if (Mouse.field432 >= i_14 + 15 && Mouse.field432 <= i_14 + 80
                  && Mouse.field428 >= 4 && Mouse.field428 <= 18) {
                class148.method3195(3, 1);
              } else if (Mouse.field432 >= class78.field1082 + 708 && Mouse.field428 >= 4
                  && Mouse.field432 <= class78.field1082 + 708 + 50 && Mouse.field428 <= 20) {
                class78.field1107 = false;
                class78.field1092.method5849(class78.field1082, 0);
                class78.field1087.method5849(class78.field1082 + 382, 0);
                class78.field1117
                    .method5829(class78.field1082 + 382 - class78.field1117.field3780 / 2, 18);
              } else if (class78.field1116 != -1) {
                class65 class65_5 = class65.field949[class78.field1116];
                class61.method1129(class65_5);
                class78.field1107 = false;
                class78.field1092.method5849(class78.field1082, 0);
                class78.field1087.method5849(class78.field1082 + 382, 0);
                class78.field1117
                    .method5829(class78.field1082 + 382 - class78.field1117.field3780 / 2, 18);
              }
            }
          }
        }
      }

    } else {
      if ((Mouse.field431 == 1 || !class253.field3229 && Mouse.field431 == 4)
          && Mouse.field432 >= class78.field1082 + 765 - 50 && Mouse.field428 >= 453) {
        class10.field61.field958 = !class10.field61.field958;
        class54.method1018();
        if (!class10.field61.field958) {
          class219.method4325(class80.field1147, "scape main", "", 255, false);
        } else {
          class9.method88();
        }
      }

      if (client.state != 5) {
        if (class78.field1109 == -1L) {
          class78.field1109 = Time.currentTimeMillis() + 1000L;
        }

        long long_11 = Time.currentTimeMillis();
        if (class10.method92() && class78.field1118 == -1L) {
          class78.field1118 = long_11;
          if (class78.field1118 > class78.field1109) {
            class78.field1109 = class78.field1118;
          }
        }

        ++class78.field1097;
        if (client.state == 10 || client.state == 11) {
          if (client.field827 == 0) {
            if (Mouse.field431 == 1 || !class253.field3229 && Mouse.field431 == 4) {
              i_3 = class78.field1082 + 5;
              short s_4 = 463;
              byte b_13 = 100;
              byte b_6 = 35;
              if (Mouse.field432 >= i_3 && Mouse.field432 <= i_3 + b_13
                  && Mouse.field428 >= s_4 && Mouse.field428 <= s_4 + b_6) {
                class59.method1078();
                return;
              }
            }

            if (class49.field439 != null) {
              class59.method1078();
            }
          }

          i_3 = Mouse.field431;
          i_14 = Mouse.field432;
          int i_21 = Mouse.field428;
          if (i_3 == 0) {
            i_14 = Mouse.field425;
            i_21 = Mouse.field426 * 673804999;
          }

          if (!class253.field3229 && i_3 == 4) {
            i_3 = 1;
          }

          int i_7;
          short s_8;
          if (class78.field1081 == 0) {
            boolean bool_15 = false;

            while (class1.method8()) {
              if (Temp.field2016 == 84) {
                bool_15 = true;
              }
            }

            i_7 = class78.field1091 - 80;
            s_8 = 291;
            if (i_3 == 1 && i_14 >= i_7 - 75 && i_14 <= i_7 + 75 && i_21 >= s_8 - 20
                && i_21 <= s_8 + 20) {
              class270.method5156(class142.method3161("secure", true)
                                      + "m=account-creation/g=oldscape/create_account_funnel.ws",
                                  true, false);
            }

            i_7 = class78.field1091 + 80;
            if (i_3 == 1 && i_14 >= i_7 - 75 && i_14 <= i_7 + 75 && i_21 >= s_8 - 20
                && i_21 <= s_8 + 20 || bool_15) {
              if ((client.field632 & 0x2000000) != 0) {
                class78.field1098 = "";
                class78.field1103 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                class78.field1112 = "Your normal account will not be affected.";
                class78.field1105 = "";
                class78.field1081 = 1;
                class34.method586();
              } else if ((client.field632 & 0x4) != 0) {
                if ((client.field632 & 0x400) != 0) {
                  class78.field1103 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                  class78.field1112 = "Players can attack each other almost everywhere";
                  class78.field1105 = "and the Protect Item prayer won\'t work.";
                } else {
                  class78.field1103 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                  class78.field1112 = "Players can attack each other";
                  class78.field1105 = "almost everywhere.";
                }

                class78.field1098 = "Warning!";
                class78.field1081 = 1;
                class34.method586();
              } else if ((client.field632 & 0x400) != 0) {
                class78.field1103 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                class78.field1112 = "The Protect Item prayer will";
                class78.field1105 = "not work on this world.";
                class78.field1098 = "Warning!";
                class78.field1081 = 1;
                class34.method586();
              } else {
                class56.method1030(false);
              }
            }
          } else {
            int i_16;
            short s_18;
            if (class78.field1081 != 1) {
              short s_17;
              if (class78.field1081 == 2) {
                s_17 = 201;
                i_16 = s_17 + 52;
                if (i_3 == 1 && i_21 >= i_16 - 12 && i_21 < i_16 + 2) {
                  class78.field1102 = 0;
                }

                i_16 += 15;
                if (i_3 == 1 && i_21 >= i_16 - 12 && i_21 < i_16 + 2) {
                  class78.field1102 = 1;
                }

                i_16 += 15;
                s_17 = 361;
                if (i_3 == 1 && i_21 >= s_17 - 15 && i_21 < s_17) {
                  class2.method22("Please enter your username.",
                                  "If you created your account after November",
                                  "2010, this will be the creation email address.");
                  class78.field1081 = 5;
                  return;
                }

                i_7 = class78.field1091 - 80;
                s_8 = 321;
                if (i_3 == 1 && i_14 >= i_7 - 75 && i_14 <= i_7 + 75 && i_21 >= s_8 - 20
                    && i_21 <= s_8 + 20) {
                  class78.field1106 = class78.field1106.trim();
                  if (class78.field1106.length() == 0) {
                    class2.method22("", "Please enter your username/email address.", "");
                    return;
                  }

                  if (class78.field1086.length() == 0) {
                    class2.method22("", "Please enter your password.", "");
                    return;
                  }

                  class2.method22("", "Connecting to server...", "");
                  class87.method2005(false);
                  Mouse.method947(20);
                  return;
                }

                i_7 = class78.field1090 + 180 + 80;
                if (i_3 == 1 && i_14 >= i_7 - 75 && i_14 <= i_7 + 75 && i_21 >= s_8 - 20
                    && i_21 <= s_8 + 20) {
                  class78.field1081 = 0;
                  class78.field1106 = "";
                  class78.field1086 = "";
                  class14.field104 = 0;
                  class28.field238 = "";
                  class78.field1104 = true;
                }

                i_7 = class78.field1091 + -117;
                s_8 = 277;
                class78.field1110 = i_14 >= i_7 && i_14 < i_7 + class67.field978 && i_21 >= s_8
                    && i_21 < s_8 + class66.field966;
                if (i_3 == 1 && class78.field1110) {
                  class78.field1108 = !class78.field1108;
                  if (!class78.field1108 && class10.field61.field959 != null) {
                    class10.field61.field959 = null;
                    class54.method1018();
                  }
                }

                i_7 = class78.field1091 + 24;
                s_8 = 277;
                class78.field1115 = i_14 >= i_7 && i_14 < i_7 + class67.field978 && i_21 >= s_8
                    && i_21 < s_8 + class66.field966;
                if (i_3 == 1 && class78.field1115) {
                  class10.field61.field962 = !class10.field61.field962;
                  if (!class10.field61.field962) {
                    class78.field1106 = "";
                    class10.field61.field959 = null;
                    class34.method586();
                  }

                  class54.method1018();
                }

                while (true) {
                  while (class1.method8()) {
                    boolean bool_9 = false;

                    for (int i_10 = 0; i_10
                        < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
                        .length(); i_10++) {
                      if (Keyboard.field342
                          == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
                          .charAt(i_10)) {
                        bool_9 = true;
                        break;
                      }
                    }

                    if (Temp.field2016 == 13) {
                      class78.field1081 = 0;
                      class78.field1106 = "";
                      class78.field1086 = "";
                      class14.field104 = 0;
                      class28.field238 = "";
                      class78.field1104 = true;
                    } else if (class78.field1102 == 0) {
                      if (Temp.field2016 == 85 && class78.field1106.length() > 0) {
                        class78.field1106 = class78.field1106
                            .substring(0, class78.field1106.length() - 1);
                      }

                      if (Temp.field2016 == 84 || Temp.field2016 == 80) {
                        class78.field1102 = 1;
                      }

                      if (bool_9 && class78.field1106.length() < 320) {
                        class78.field1106 = class78.field1106 + Keyboard.field342;
                      }
                    } else if (class78.field1102 == 1) {
                      if (Temp.field2016 == 85 && class78.field1086.length() > 0) {
                        class78.field1086 = class78.field1086
                            .substring(0, class78.field1086.length() - 1);
                      }

                      if (Temp.field2016 == 84 || Temp.field2016 == 80) {
                        class78.field1102 = 0;
                      }

                      if (Temp.field2016 == 84) {
                        class78.field1106 = class78.field1106.trim();
                        if (class78.field1106.length() == 0) {
                          class2.method22("", "Please enter your username/email address.", "");
                          return;
                        }

                        if (class78.field1086.length() == 0) {
                          class2.method22("", "Please enter your password.", "");
                          return;
                        }

                        class2.method22("", "Connecting to server...", "");
                        class87.method2005(false);
                        Mouse.method947(20);
                        return;
                      }

                      if (bool_9 && class78.field1086.length() < 20) {
                        class78.field1086 = class78.field1086 + Keyboard.field342;
                      }
                    }
                  }

                  return;
                }
              } else if (class78.field1081 == 3) {
                i_16 = class78.field1090 + 180;
                s_18 = 276;
                if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                    && i_21 <= s_18 + 20) {
                  class56.method1030(false);
                }

                i_16 = class78.field1090 + 180;
                s_18 = 326;
                if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                    && i_21 <= s_18 + 20) {
                  class2.method22("Please enter your username.",
                                  "If you created your account after November",
                                  "2010, this will be the creation email address.");
                  class78.field1081 = 5;
                  return;
                }
              } else {
                boolean bool_19;
                int i_20;
                if (class78.field1081 == 4) {
                  i_16 = class78.field1090 + 180 - 80;
                  s_18 = 321;
                  if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                      && i_21 <= s_18 + 20) {
                    class28.field238.trim();
                    if (class28.field238.length() != 6) {
                      class2.method22("", "Please enter a 6-digit PIN.", "");
                      return;
                    }

                    class14.field104 = Integer.parseInt(class28.field238);
                    class28.field238 = "";
                    class87.method2005(true);
                    class2.method22("", "Connecting to server...", "");
                    Mouse.method947(20);
                    return;
                  }

                  if (i_3 == 1 && i_14 >= class78.field1090 + 180 - 9
                      && i_14 <= class78.field1090 + 180 + 130 && i_21 >= 263 && i_21 <= 296) {
                    class78.field1104 = !class78.field1104;
                  }

                  if (i_3 == 1 && i_14 >= class78.field1090 + 180 - 34
                      && i_14 <= class78.field1090 + 34 + 180 && i_21 >= 351 && i_21 <= 363) {
                    class270.method5156(class142.method3161("secure", true)
                                            + "m=totp-authenticator/disableTOTPRequest", true,
                                        false);
                  }

                  i_16 = class78.field1090 + 180 + 80;
                  if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                      && i_21 <= s_18 + 20) {
                    class78.field1081 = 0;
                    class78.field1106 = "";
                    class78.field1086 = "";
                    class14.field104 = 0;
                    class28.field238 = "";
                  }

                  while (class1.method8()) {
                    bool_19 = false;

                    for (i_20 = 0; i_20 < "1234567890".length(); i_20++) {
                      if (Keyboard.field342 == "1234567890".charAt(i_20)) {
                        bool_19 = true;
                        break;
                      }
                    }

                    if (Temp.field2016 == 13) {
                      class78.field1081 = 0;
                      class78.field1106 = "";
                      class78.field1086 = "";
                      class14.field104 = 0;
                      class28.field238 = "";
                    } else {
                      if (Temp.field2016 == 85 && class28.field238.length() > 0) {
                        class28.field238 = class28.field238
                            .substring(0, class28.field238.length() - 1);
                      }

                      if (Temp.field2016 == 84) {
                        class28.field238.trim();
                        if (class28.field238.length() != 6) {
                          class2.method22("", "Please enter a 6-digit PIN.", "");
                          return;
                        }

                        class14.field104 = Integer.parseInt(class28.field238);
                        class28.field238 = "";
                        class87.method2005(true);
                        class2.method22("", "Connecting to server...", "");
                        Mouse.method947(20);
                        return;
                      }

                      if (bool_19 && class28.field238.length() < 6) {
                        class28.field238 = class28.field238 + Keyboard.field342;
                      }
                    }
                  }
                } else if (class78.field1081 == 5) {
                  i_16 = class78.field1090 + 180 - 80;
                  s_18 = 321;
                  if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                      && i_21 <= s_18 + 20) {
                    class234.method4590();
                    return;
                  }

                  i_16 = class78.field1090 + 180 + 80;
                  if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                      && i_21 <= s_18 + 20) {
                    class56.method1030(true);
                  }

                  while (class1.method8()) {
                    bool_19 = false;

                    for (i_20 = 0; i_20
                        < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
                        .length(); i_20++) {
                      if (Keyboard.field342
                          == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| "
                          .charAt(i_20)) {
                        bool_19 = true;
                        break;
                      }
                    }

                    if (Temp.field2016 == 13) {
                      class56.method1030(true);
                    } else {
                      if (Temp.field2016 == 85 && class78.field1106.length() > 0) {
                        class78.field1106 = class78.field1106
                            .substring(0, class78.field1106.length() - 1);
                      }

                      if (Temp.field2016 == 84) {
                        class234.method4590();
                        return;
                      }

                      if (bool_19 && class78.field1106.length() < 320) {
                        class78.field1106 = class78.field1106 + Keyboard.field342;
                      }
                    }
                  }
                } else if (class78.field1081 == 6) {
                  while (true) {
                    do {
                      if (!class1.method8()) {
                        s_17 = 321;
                        if (i_3 == 1 && i_21 >= s_17 - 20 && i_21 <= s_17 + 20) {
                          class56.method1030(true);
                        }

                        return;
                      }
                    } while (Temp.field2016 != 84 && Temp.field2016 != 13);

                    class56.method1030(true);
                  }
                } else if (class78.field1081 == 7) {
                  i_16 = class78.field1090 + 180 - 80;
                  s_18 = 321;
                  if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                      && i_21 <= s_18 + 20) {
                    class270
                        .method5156(class142.method3161("secure", true) + "m=dob/set_dob.ws", true,
                                    false);
                    class2.method22("", "Page has opened in a new window.",
                                    "(Please check your popup blocker.)");
                    class78.field1081 = 6;
                    return;
                  }

                  i_16 = class78.field1090 + 180 + 80;
                  if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                      && i_21 <= s_18 + 20) {
                    class56.method1030(true);
                  }
                } else if (class78.field1081 == 8) {
                  i_16 = class78.field1090 + 180 - 80;
                  s_18 = 321;
                  if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                      && i_21 <= s_18 + 20) {
                    class270.method5156("https://www.jagex.com/terms/privacy/#eight", true, false);
                    class2.method22("", "Page has opened in a new window.",
                                    "(Please check your popup blocker.)");
                    class78.field1081 = 6;
                    return;
                  }

                  i_16 = class78.field1090 + 180 + 80;
                  if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                      && i_21 <= s_18 + 20) {
                    class56.method1030(true);
                  }
                }
              }
            } else {
              while (class1.method8()) {
                if (Temp.field2016 == 84) {
                  class56.method1030(false);
                } else if (Temp.field2016 == 13) {
                  class78.field1081 = 0;
                }
              }

              i_16 = class78.field1091 - 80;
              s_18 = 321;
              if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                  && i_21 <= s_18 + 20) {
                class56.method1030(false);
              }

              i_16 = class78.field1091 + 80;
              if (i_3 == 1 && i_14 >= i_16 - 75 && i_14 <= i_16 + 75 && i_21 >= s_18 - 20
                  && i_21 <= s_18 + 20) {
                class78.field1081 = 0;
              }
            }
          }

        }
      }
    }
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1067447403"
  )
  static final int method3805(int i_0, int i_1) {
    int i_2 = SeekableFile.method2511(i_0 - 1, i_1 - 1) + SeekableFile.method2511(1 + i_0, i_1 - 1)
        + SeekableFile
        .method2511(i_0 - 1, i_1 + 1) + SeekableFile.method2511(1 + i_0, 1 + i_1);
    int i_3 =
        SeekableFile.method2511(i_0 - 1, i_1) + SeekableFile.method2511(1 + i_0, i_1) + SeekableFile
            .method2511(i_0, i_1 - 1) + SeekableFile.method2511(i_0, 1 + i_1);
    int i_4 = SeekableFile.method2511(i_0, i_1);
    return i_2 / 16 + i_3 / 8 + i_4 / 4;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)[B",
      garbageValue = "-44"
  )
  abstract byte[] vmethod3789();

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "339302128"
  )
  abstract void vmethod3792(byte[] var1);

}
