package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class273 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3538;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3536;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3537;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3552 = new class200(64);
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3539 = new class200(100);
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 375095033
  )
  public int field3544 = -1;
  @ObfuscatedName("b")
  public boolean field3546 = false;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = -2125188827
  )
  public int field3547 = 5;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = 1256278085
  )
  public int field3548 = -1;
  @ObfuscatedName("g")
  @ObfuscatedGetter(
      intValue = -185139073
  )
  public int field3549 = -1;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = -2058553279
  )
  public int field3550 = 99;
  @ObfuscatedName("r")
  @ObfuscatedGetter(
      intValue = 1744953403
  )
  public int field3551 = -1;
  @ObfuscatedName("t")
  @ObfuscatedGetter(
      intValue = 1087712135
  )
  public int field3535 = -1;
  @ObfuscatedName("o")
  @ObfuscatedGetter(
      intValue = -1665152249
  )
  public int field3553 = 2;
  @ObfuscatedName("i")
  public int[] field3541;
  @ObfuscatedName("q")
  public int[] field3540;
  @ObfuscatedName("x")
  public int[] field3543;
  @ObfuscatedName("p")
  int[] field3545;
  @ObfuscatedName("k")
  int[] field3542;

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(Lkj;Lkj;Lkj;ZI)V",
      garbageValue = "1837948515"
  )
  static void method5227(class298 class298_0, class298 class298_1, class298 class298_2,
                         boolean bool_3) {
    if (bool_3) {
      class78.field1082 = (class82.field1179 - 765) / 2;
      class78.field1090 = class78.field1082 + 202;
      class78.field1091 = class78.field1090 + 180;
    }

    byte b_4;
    int i_5;
    int i_7;
    int i_8;
    int i_11;
    int i_12;
    int i_29;
    int i_31;
    int i_35;
    int i_37;
    int i_39;
    if (class78.field1107) {
      if (class166.field2047 == null) {
        class166.field2047 = class21.method279(class175.field2270, "sl_back", "");
      }

      if (class13.field85 == null) {
        class13.field85 = class13.method113(class175.field2270, "sl_flags", "");
      }

      if (class126.field1779 == null) {
        class126.field1779 = class13.method113(class175.field2270, "sl_arrows", "");
      }

      if (class28.field237 == null) {
        class28.field237 = class13.method113(class175.field2270, "sl_stars", "");
      }

      class314.method5763(class78.field1082, 23, 765, 480, 0);
      class314.method5748(class78.field1082, 0, 125, 23, 12425273, 9135624);
      class314.method5748(class78.field1082 + 125, 0, 640, 23, 5197647, 2697513);
      class298_0.method5525("Select a world", class78.field1082 + 62, 15, 0, -1);
      if (class28.field237 != null) {
        class28.field237[1].method5829(class78.field1082 + 140, 1);
        class298_1.method5522("Members only world", class78.field1082 + 152, 10, 16777215, -1);
        class28.field237[0].method5829(class78.field1082 + 140, 12);
        class298_1.method5522("Free world", class78.field1082 + 152, 21, 16777215, -1);
      }

      if (class126.field1779 != null) {
        i_29 = class78.field1082 + 280;
        if (class65.field946[0] == 0 && class65.field939[0] == 0) {
          class126.field1779[2].method5829(i_29, 4);
        } else {
          class126.field1779[0].method5829(i_29, 4);
        }

        if (class65.field946[0] == 0 && class65.field939[0] == 1) {
          class126.field1779[3].method5829(i_29 + 15, 4);
        } else {
          class126.field1779[1].method5829(i_29 + 15, 4);
        }

        class298_0.method5522("World", i_29 + 32, 17, 16777215, -1);
        i_5 = class78.field1082 + 390;
        if (class65.field946[0] == 1 && class65.field939[0] == 0) {
          class126.field1779[2].method5829(i_5, 4);
        } else {
          class126.field1779[0].method5829(i_5, 4);
        }

        if (class65.field946[0] == 1 && class65.field939[0] == 1) {
          class126.field1779[3].method5829(i_5 + 15, 4);
        } else {
          class126.field1779[1].method5829(i_5 + 15, 4);
        }

        class298_0.method5522("Players", i_5 + 32, 17, 16777215, -1);
        i_31 = class78.field1082 + 500;
        if (class65.field946[0] == 2 && class65.field939[0] == 0) {
          class126.field1779[2].method5829(i_31, 4);
        } else {
          class126.field1779[0].method5829(i_31, 4);
        }

        if (class65.field946[0] == 2 && class65.field939[0] == 1) {
          class126.field1779[3].method5829(i_31 + 15, 4);
        } else {
          class126.field1779[1].method5829(i_31 + 15, 4);
        }

        class298_0.method5522("Location", i_31 + 32, 17, 16777215, -1);
        i_7 = class78.field1082 + 610;
        if (class65.field946[0] == 3 && class65.field939[0] == 0) {
          class126.field1779[2].method5829(i_7, 4);
        } else {
          class126.field1779[0].method5829(i_7, 4);
        }

        if (class65.field946[0] == 3 && class65.field939[0] == 1) {
          class126.field1779[3].method5829(i_7 + 15, 4);
        } else {
          class126.field1779[1].method5829(i_7 + 15, 4);
        }

        class298_0.method5522("Type", i_7 + 32, 17, 16777215, -1);
      }

      class314.method5763(class78.field1082 + 708, 4, 50, 16, 0);
      class298_1.method5525("Cancel", class78.field1082 + 708 + 25, 16, 16777215, -1);
      class78.field1116 = -1;
      if (class166.field2047 != null) {
        b_4 = 88;
        byte b_38 = 19;
        i_31 = 765 / (b_4 + 1);
        i_7 = 480 / (b_38 + 1);

        do {
          i_8 = i_7;
          i_35 = i_31;
          if (i_7 * (i_31 - 1) >= class65.field945) {
            --i_31;
          }

          if (i_31 * (i_7 - 1) >= class65.field945) {
            --i_7;
          }

          if (i_31 * (i_7 - 1) >= class65.field945) {
            --i_7;
          }
        } while (i_8 != i_7 || i_31 != i_35);

        i_8 = (765 - b_4 * i_31) / (i_31 + 1);
        if (i_8 > 5) {
          i_8 = 5;
        }

        i_35 = (480 - b_38 * i_7) / (i_7 + 1);
        if (i_35 > 5) {
          i_35 = 5;
        }

        i_37 = (765 - b_4 * i_31 - i_8 * (i_31 - 1)) / 2;
        i_11 = (480 - i_7 * b_38 - i_35 * (i_7 - 1)) / 2;
        i_12 = i_11 + 23;
        i_39 = i_37 + class78.field1082;
        int i_40 = 0;
        boolean bool_41 = false;

        int i_42;
        for (i_42 = 0; i_42 < class65.field945; i_42++) {
          class65 class65_17 = class65.field949[i_42];
          boolean bool_18 = true;
          String string_19 = Integer.toString(class65_17.field955);
          if (class65_17.field955 == -1) {
            string_19 = "OFF";
            bool_18 = false;
          } else if (class65_17.field955 > 1980) {
            string_19 = "FULL";
            bool_18 = false;
          }

          int i_21 = 0;
          byte b_20;
          if (class65_17.method1577()) {
            if (class65_17.method1589()) {
              b_20 = 7;
            } else {
              b_20 = 6;
            }
          } else if (class65_17.method1570()) {
            i_21 = 16711680;
            if (class65_17.method1589()) {
              b_20 = 5;
            } else {
              b_20 = 4;
            }
          } else if (class65_17.method1568()) {
            if (class65_17.method1589()) {
              b_20 = 3;
            } else {
              b_20 = 2;
            }
          } else if (class65_17.method1589()) {
            b_20 = 1;
          } else {
            b_20 = 0;
          }

          if (Mouse.field425 >= i_39 && Mouse.field426 * 673804999 >= i_12
              && Mouse.field425 < i_39 + b_4 && Mouse.field426 * 673804999 < b_38 + i_12
              && bool_18) {
            class78.field1116 = i_42;
            class166.field2047[b_20].method5855(i_39, i_12, 128, 16777215);
            bool_41 = true;
          } else {
            class166.field2047[b_20].method5849(i_39, i_12);
          }

          if (class13.field85 != null) {
            class13.field85[(class65_17.method1589() ? 8 : 0) + class65_17.field952]
                .method5829(i_39 + 29, i_12);
          }

          class298_0
              .method5525(Integer.toString(class65_17.field947), i_39 + 15, b_38 / 2 + i_12 + 5,
                          i_21, -1);
          class298_1.method5525(string_19, i_39 + 60, b_38 / 2 + i_12 + 5, 268435455, -1);
          i_12 = i_12 + b_38 + i_35;
          ++i_40;
          if (i_40 >= i_7) {
            i_12 = i_11 + 23;
            i_39 = i_39 + b_4 + i_8;
            i_40 = 0;
          }
        }

        if (bool_41) {
          i_42 = class298_1.method5517(class65.field949[class78.field1116].field951) + 6;
          int i_26 = class298_1.field3695 + 8;
          class314
              .method5763(Mouse.field425 - i_42 / 2, Mouse.field426 * 673804999 + 20 + 5, i_42,
                          i_26, 16777120);
          class314
              .method5734(Mouse.field425 - i_42 / 2, Mouse.field426 * 673804999 + 20 + 5, i_42,
                          i_26, 0);
          class298_1.method5525(class65.field949[class78.field1116].field951, Mouse.field425,
                                Mouse.field426 * 673804999 + class298_1.field3695 + 20 + 5 + 4, 0,
                                -1);
        }
      }

      Temp.field2014.vmethod5809(0, 0);
    } else {
      if (bool_3) {
        class78.field1092.method5849(class78.field1082, 0);
        class78.field1087.method5849(class78.field1082 + 382, 0);
        class78.field1117.method5829(class78.field1082 + 382 - class78.field1117.field3780 / 2, 18);
      }

      if (client.state == 0 || client.state == 5) {
        b_4 = 20;
        class298_0
            .method5525("RuneScape is loading - please wait...", class78.field1090 + 180, 245 - b_4,
                        16777215, -1);
        i_5 = 253 - b_4;
        class314.method5734(class78.field1090 + 180 - 152, i_5, 304, 34, 9179409);
        class314.method5734(class78.field1090 + 180 - 151, i_5 + 1, 302, 32, 0);
        class314
            .method5763(class78.field1090 + 180 - 150, i_5 + 2, class78.field1099 * 3, 30, 9179409);
        class314.method5763(class78.field1099 * 3 + (class78.field1090 + 180 - 150), i_5 + 2,
                            300 - class78.field1099 * 3, 30, 0);
        class298_0.method5525(class78.field1100, class78.field1090 + 180, 276 - b_4, 16777215, -1);
      }

      String string_22;
      short s_28;
      short s_30;
      if (client.state == 20) {
        class78.field1083.method5829(class78.field1090 + 180 - class78.field1083.field3780 / 2,
                                     271 - class78.field1083.field3781 / 2);
        s_28 = 201;
        class298_0.method5525(class78.field1103, class78.field1090 + 180, s_28, 16776960, 0);
        i_29 = s_28 + 15;
        class298_0.method5525(class78.field1112, class78.field1090 + 180, i_29, 16776960, 0);
        i_29 += 15;
        class298_0.method5525(class78.field1105, class78.field1090 + 180, i_29, 16776960, 0);
        i_29 += 15;
        i_29 += 7;
        if (class78.field1081 != 4) {
          class298_0.method5522("Login: ", class78.field1090 + 180 - 110, i_29, 16777215, 0);
          s_30 = 200;

          for (string_22 = class59.method1076(); class298_0.method5517(string_22) > s_30;
              string_22 = string_22.substring(0, string_22.length() - 1)) {
          }

          class298_0.method5522(class299.method5521(string_22), class78.field1090 + 180 - 70, i_29,
                                16777215, 0);
          i_29 += 15;
          class298_0.method5522("Password: " + class265.method4976(class78.field1086),
                                class78.field1090 + 180 - 108, i_29, 16777215, 0);
          i_29 += 15;
        }
      }

      if (client.state == 10 || client.state == 11) {
        class78.field1083.method5829(class78.field1090, 171);
        short s_6;
        if (class78.field1081 == 0) {
          s_28 = 251;
          class298_0.method5525("Welcome to RuneScape", class78.field1090 + 180, s_28, 16776960, 0);
          i_29 = s_28 + 30;
          i_5 = class78.field1090 + 180 - 80;
          s_6 = 291;
          class78.field1084.method5829(i_5 - 73, s_6 - 20);
          class298_0.method5526("New User", i_5 - 73, s_6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
          i_5 = class78.field1090 + 180 + 80;
          class78.field1084.method5829(i_5 - 73, s_6 - 20);
          class298_0.method5526("Existing User", i_5 - 73, s_6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
        } else if (class78.field1081 == 1) {
          class298_0.method5525(class78.field1098, class78.field1090 + 180, 201, 16776960, 0);
          s_28 = 236;
          class298_0.method5525(class78.field1103, class78.field1090 + 180, s_28, 16777215, 0);
          i_29 = s_28 + 15;
          class298_0.method5525(class78.field1112, class78.field1090 + 180, i_29, 16777215, 0);
          i_29 += 15;
          class298_0.method5525(class78.field1105, class78.field1090 + 180, i_29, 16777215, 0);
          i_29 += 15;
          i_5 = class78.field1090 + 180 - 80;
          s_6 = 321;
          class78.field1084.method5829(i_5 - 73, s_6 - 20);
          class298_0.method5525("Continue", i_5, s_6 + 5, 16777215, 0);
          i_5 = class78.field1090 + 180 + 80;
          class78.field1084.method5829(i_5 - 73, s_6 - 20);
          class298_0.method5525("Cancel", i_5, s_6 + 5, 16777215, 0);
        } else if (class78.field1081 == 2) {
          s_28 = 201;
          class298_0.method5525(class78.field1103, class78.field1091, s_28, 16776960, 0);
          i_29 = s_28 + 15;
          class298_0.method5525(class78.field1112, class78.field1091, i_29, 16776960, 0);
          i_29 += 15;
          class298_0.method5525(class78.field1105, class78.field1091, i_29, 16776960, 0);
          i_29 += 15;
          i_29 += 7;
          class298_0.method5522("Login: ", class78.field1091 - 110, i_29, 16777215, 0);
          s_30 = 200;

          for (string_22 = class59.method1076(); class298_0.method5517(string_22) > s_30;
              string_22 = string_22.substring(1)) {
          }

          class298_0.method5522(
              class299.method5521(string_22) + (class78.field1102 == 0 & client.field591 % 40 < 20 ?
                  class6.method71(16776960) + "|" : ""), class78.field1091 - 70, i_29, 16777215, 0);
          i_29 += 15;
          class298_0.method5522("Password: " + class265.method4976(class78.field1086) + (
              class78.field1102 == 1 & client.field591 % 40 < 20 ? class6.method71(16776960) + "|"
                  : ""), class78.field1091 - 108, i_29, 16777215, 0);
          i_29 += 15;
          s_28 = 277;
          i_7 = class78.field1091 + -117;
          boolean bool_9 = class78.field1108;
          boolean bool_10 = class78.field1110;
          class317 class317_23 = bool_9 ? (bool_10 ? class53.field472 : class78.field1089)
              : (bool_10 ? class102.field1352 : class235.field2783);
          class317_23.method5829(i_7, s_28);
          i_7 = i_7 + class317_23.field3780 + 5;
          class298_1.method5522("Remember username", i_7, s_28 + 13, 16776960, 0);
          i_7 = class78.field1091 + 24;
          boolean bool_13 = class10.field61.field962;
          boolean bool_14 = class78.field1115;
          class317 class317_25 = bool_13 ? (bool_14 ? class53.field472 : class78.field1089)
              : (bool_14 ? class102.field1352 : class235.field2783);
          class317_25.method5829(i_7, s_28);
          i_7 = i_7 + class317_25.field3780 + 5;
          class298_1.method5522("Hide username", i_7, s_28 + 13, 16776960, 0);
          i_29 = s_28 + 15;
          int i_15 = class78.field1091 - 80;
          short s_16 = 321;
          class78.field1084.method5829(i_15 - 73, s_16 - 20);
          class298_0.method5525("Login", i_15, s_16 + 5, 16777215, 0);
          i_15 = class78.field1091 + 80;
          class78.field1084.method5829(i_15 - 73, s_16 - 20);
          class298_0.method5525("Cancel", i_15, s_16 + 5, 16777215, 0);
          s_28 = 357;
          class298_1
              .method5525("Forgotten your password? <col=ffffff>Click here.", class78.field1091,
                          s_28, 16776960, 0);
        } else if (class78.field1081 == 3) {
          s_28 = 201;
          class298_0
              .method5525("Invalid username or password.", class78.field1090 + 180, s_28, 16776960,
                          0);
          i_29 = s_28 + 20;
          class298_1.method5525("For accounts created after 24th November 2010, please use your",
                                class78.field1090 + 180, i_29, 16776960, 0);
          i_29 += 15;
          class298_1
              .method5525("email address to login. Otherwise please login with your username.",
                          class78.field1090 + 180, i_29, 16776960, 0);
          i_29 += 15;
          i_5 = class78.field1090 + 180;
          s_6 = 276;
          class78.field1084.method5829(i_5 - 73, s_6 - 20);
          class298_2.method5525("Try again", i_5, s_6 + 5, 16777215, 0);
          i_5 = class78.field1090 + 180;
          s_6 = 326;
          class78.field1084.method5829(i_5 - 73, s_6 - 20);
          class298_2.method5525("Forgotten password?", i_5, s_6 + 5, 16777215, 0);
        } else if (class78.field1081 == 4) {
          class298_0.method5525("Authenticator", class78.field1090 + 180, 201, 16776960, 0);
          s_28 = 236;
          class298_0.method5525(class78.field1103, class78.field1090 + 180, s_28, 16777215, 0);
          i_29 = s_28 + 15;
          class298_0.method5525(class78.field1112, class78.field1090 + 180, i_29, 16777215, 0);
          i_29 += 15;
          class298_0.method5525(class78.field1105, class78.field1090 + 180, i_29, 16777215, 0);
          i_29 += 15;
          class298_0.method5522(
              "PIN: " + class265.method4976(class28.field238) + (client.field591 % 40 < 20 ?
                  class6.method71(16776960) + "|" : ""), class78.field1090 + 180 - 108, i_29,
              16777215, 0);
          i_29 -= 8;
          class298_0
              .method5522("Trust this computer", class78.field1090 + 180 - 9, i_29, 16776960, 0);
          i_29 += 15;
          class298_0.method5522("for 30 days: ", class78.field1090 + 180 - 9, i_29, 16776960, 0);
          i_5 = class78.field1090 + 180 - 9 + class298_0.method5517("for 30 days: ") + 15;
          i_31 = i_29 - class298_0.field3695;
          class317 class317_27;
          if (class78.field1104) {
            class317_27 = class78.field1089;
          } else {
            class317_27 = class235.field2783;
          }

          class317_27.method5829(i_5, i_31);
          i_29 += 15;
          i_8 = class78.field1090 + 180 - 80;
          short s_34 = 321;
          class78.field1084.method5829(i_8 - 73, s_34 - 20);
          class298_0.method5525("Continue", i_8, s_34 + 5, 16777215, 0);
          i_8 = class78.field1090 + 180 + 80;
          class78.field1084.method5829(i_8 - 73, s_34 - 20);
          class298_0.method5525("Cancel", i_8, s_34 + 5, 16777215, 0);
          class298_1
              .method5525("<u=ff>Can\'t Log In?</u>", class78.field1090 + 180, s_34 + 36, 255, 0);
        } else if (class78.field1081 == 5) {
          class298_0
              .method5525("Forgotten your password?", class78.field1090 + 180, 201, 16776960, 0);
          s_28 = 221;
          class298_2.method5525(class78.field1103, class78.field1090 + 180, s_28, 16776960, 0);
          i_29 = s_28 + 15;
          class298_2.method5525(class78.field1112, class78.field1090 + 180, i_29, 16776960, 0);
          i_29 += 15;
          class298_2.method5525(class78.field1105, class78.field1090 + 180, i_29, 16776960, 0);
          i_29 += 15;
          i_29 += 14;
          class298_0
              .method5522("Username/email: ", class78.field1090 + 180 - 145, i_29, 16777215, 0);
          s_30 = 174;

          for (string_22 = class59.method1076(); class298_0.method5517(string_22) > s_30;
              string_22 = string_22.substring(1)) {
          }

          class298_0.method5522(class299.method5521(string_22) + (client.field591 % 40 < 20 ?
                                    class6.method71(16776960) + "|" : ""), class78.field1090 + 180 - 34, i_29, 16777215,
                                0);
          i_29 += 15;
          i_7 = class78.field1090 + 180 - 80;
          short s_32 = 321;
          class78.field1084.method5829(i_7 - 73, s_32 - 20);
          class298_0.method5525("Recover", i_7, s_32 + 5, 16777215, 0);
          i_7 = class78.field1090 + 180 + 80;
          class78.field1084.method5829(i_7 - 73, s_32 - 20);
          class298_0.method5525("Back", i_7, s_32 + 5, 16777215, 0);
        } else if (class78.field1081 == 6) {
          s_28 = 201;
          class298_0.method5525(class78.field1103, class78.field1090 + 180, s_28, 16776960, 0);
          i_29 = s_28 + 15;
          class298_0.method5525(class78.field1112, class78.field1090 + 180, i_29, 16776960, 0);
          i_29 += 15;
          class298_0.method5525(class78.field1105, class78.field1090 + 180, i_29, 16776960, 0);
          i_29 += 15;
          i_5 = class78.field1090 + 180;
          s_6 = 321;
          class78.field1084.method5829(i_5 - 73, s_6 - 20);
          class298_0.method5525("Back", i_5, s_6 + 5, 16777215, 0);
        } else if (class78.field1081 == 7) {
          s_28 = 216;
          class298_0
              .method5525("Your date of birth isn\'t set.", class78.field1090 + 180, s_28, 16776960,
                          0);
          i_29 = s_28 + 15;
          class298_2
              .method5525("Please verify your account status by", class78.field1090 + 180, i_29,
                          16776960, 0);
          i_29 += 15;
          class298_2
              .method5525("setting your date of birth.", class78.field1090 + 180, i_29, 16776960,
                          0);
          i_29 += 15;
          i_5 = class78.field1090 + 180 - 80;
          s_6 = 321;
          class78.field1084.method5829(i_5 - 73, s_6 - 20);
          class298_0.method5525("Set Date of Birth", i_5, s_6 + 5, 16777215, 0);
          i_5 = class78.field1090 + 180 + 80;
          class78.field1084.method5829(i_5 - 73, s_6 - 20);
          class298_0.method5525("Back", i_5, s_6 + 5, 16777215, 0);
        } else if (class78.field1081 == 8) {
          s_28 = 216;
          class298_0.method5525("Sorry, but your account is not eligible to play.",
                                class78.field1090 + 180, s_28, 16776960, 0);
          i_29 = s_28 + 15;
          class298_2
              .method5525("For more information, please take a look at", class78.field1090 + 180,
                          i_29, 16776960, 0);
          i_29 += 15;
          class298_2.method5525("our privacy policy.", class78.field1090 + 180, i_29, 16776960, 0);
          i_29 += 15;
          i_5 = class78.field1090 + 180 - 80;
          s_6 = 321;
          class78.field1084.method5829(i_5 - 73, s_6 - 20);
          class298_0.method5525("Privacy Policy", i_5, s_6 + 5, 16777215, 0);
          i_5 = class78.field1090 + 180 + 80;
          class78.field1084.method5829(i_5 - 73, s_6 - 20);
          class298_0.method5525("Back", i_5, s_6 + 5, 16777215, 0);
        }
      }

      if (class78.field1097 > 0) {
        i_29 = class78.field1097;
        s_30 = 256;
        class78.field1095 += i_29 * 128;
        if (class78.field1095 > class186.field2367.length) {
          class78.field1095 -= class186.field2367.length;
          i_31 = (int) (Math.random() * 12.0D);
          class67.method1682(class78.field1111[i_31]);
        }

        i_31 = 0;
        i_7 = i_29 * 128;
        i_8 = (s_30 - i_29) * 128;

        for (i_35 = 0; i_35 < i_8; i_35++) {
          i_37 = class40.field357[i_7 + i_31]
              - class186.field2367[i_31 + class78.field1095 & class186.field2367.length - 1] * i_29
              / 6;
          if (i_37 < 0) {
            i_37 = 0;
          }

          class40.field357[i_31++] = i_37;
        }

        for (i_35 = s_30 - i_29; i_35 < s_30; i_35++) {
          i_37 = i_35 * 128;

          for (i_11 = 0; i_11 < 128; i_11++) {
            i_12 = (int) (Math.random() * 100.0D);
            if (i_12 < 50 && i_11 > 10 && i_11 < 118) {
              class40.field357[i_11 + i_37] = 255;
            } else {
              class40.field357[i_37 + i_11] = 0;
            }
          }
        }

        if (class78.field1088 > 0) {
          class78.field1088 -= i_29 * 4;
        }

        if (class78.field1094 > 0) {
          class78.field1094 -= i_29 * 4;
        }

        if (class78.field1088 == 0 && class78.field1094 == 0) {
          i_35 = (int) (Math.random() * (double) (2000 / i_29));
          if (i_35 == 0) {
            class78.field1088 = 1024;
          }

          if (i_35 == 1) {
            class78.field1094 = 1024;
          }
        }

        for (i_35 = 0; i_35 < s_30 - i_29; i_35++) {
          class78.field1093[i_35] = class78.field1093[i_29 + i_35];
        }

        for (i_35 = s_30 - i_29; i_35 < s_30; i_35++) {
          class78.field1093[i_35] = (int) (Math.sin((double) class78.field1114 / 14.0D) * 16.0D
              + Math.sin((double) class78.field1114 / 15.0D) * 14.0D
              + Math.sin((double) class78.field1114 / 16.0D) * 12.0D);
          ++class78.field1114;
        }

        class78.field1096 += i_29;
        i_35 = (i_29 + (client.field591 & 0x1)) / 2;
        if (i_35 > 0) {
          for (i_37 = 0; i_37 < class78.field1096 * 100; i_37++) {
            i_11 = (int) (Math.random() * 124.0D) + 2;
            i_12 = (int) (Math.random() * 128.0D) + 128;
            class40.field357[i_11 + (i_12 << 7)] = 192;
          }

          class78.field1096 = 0;
          i_37 = 0;

          label575:
          while (true) {
            if (i_37 >= s_30) {
              i_37 = 0;

              while (true) {
                if (i_37 >= 128) {
                  break label575;
                }

                i_11 = 0;

                for (i_12 = -i_35; i_12 < s_30; i_12++) {
                  i_39 = i_12 * 128;
                  if (i_12 + i_35 < s_30) {
                    i_11 += class76.field1073[i_35 * 128 + i_39 + i_37];
                  }

                  if (i_12 - (i_35 + 1) >= 0) {
                    i_11 -= class76.field1073[i_39 + i_37 - (i_35 + 1) * 128];
                  }

                  if (i_12 >= 0) {
                    class40.field357[i_39 + i_37] = i_11 / (i_35 * 2 + 1);
                  }
                }

                ++i_37;
              }
            }

            i_11 = 0;
            i_12 = i_37 * 128;

            for (i_39 = -i_35; i_39 < 128; i_39++) {
              if (i_35 + i_39 < 128) {
                i_11 += class40.field357[i_39 + i_12 + i_35];
              }

              if (i_39 - (i_35 + 1) >= 0) {
                i_11 -= class40.field357[i_12 + i_39 - (i_35 + 1)];
              }

              if (i_39 >= 0) {
                class76.field1073[i_39 + i_12] = i_11 / (i_35 * 2 + 1);
              }
            }

            ++i_37;
          }
        }

        class78.field1097 = 0;
      }

      class133.method3098();
      class124.field1708[class10.field61.field958 ? 1 : 0]
          .method5829(class78.field1082 + 765 - 40, 463);
      if (client.state > 5 && client.field827 == 0) {
        if (class232.field2752 != null) {
          i_29 = class78.field1082 + 5;
          s_30 = 463;
          byte b_36 = 100;
          byte b_33 = 35;
          class232.field2752.method5829(i_29, s_30);
          class298_0
              .method5525("World" + " " + client.field581, b_36 / 2 + i_29, b_33 / 2 + s_30 - 2,
                          16777215, 0);
          if (class49.field439 != null) {
            class298_1.method5525("Loading...", b_36 / 2 + i_29, b_33 / 2 + s_30 + 12, 16777215, 0);
          } else {
            class298_1
                .method5525("Click to switch", b_36 / 2 + i_29, b_33 / 2 + s_30 + 12, 16777215, 0);
          }
        } else {
          class232.field2752 = class221.method4374(class175.field2270, "sl_button", "");
        }
      }

    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "243481336"
  )
  void method5212(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method5213(class182_1, i_2);
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "39"
  )
  void method5213(Buffer class182_1, int i_2) {
    int i_3;
    int i_4;
    if (i_2 == 1) {
      i_3 = class182_1.getUInt16();
      this.field3541 = new int[i_3];

      for (i_4 = 0; i_4 < i_3; i_4++) {
        this.field3541[i_4] = class182_1.getUInt16();
      }

      this.field3540 = new int[i_3];

      for (i_4 = 0; i_4 < i_3; i_4++) {
        this.field3540[i_4] = class182_1.getUInt16();
      }

      for (i_4 = 0; i_4 < i_3; i_4++) {
        this.field3540[i_4] += class182_1.getUInt16() << 16;
      }
    } else if (i_2 == 2) {
      this.field3544 = class182_1.getUInt16();
    } else if (i_2 == 3) {
      i_3 = class182_1.getUInt8();
      this.field3545 = new int[i_3 + 1];

      for (i_4 = 0; i_4 < i_3; i_4++) {
        this.field3545[i_4] = class182_1.getUInt8();
      }

      this.field3545[i_3] = 9999999;
    } else if (i_2 == 4) {
      this.field3546 = true;
    } else if (i_2 == 5) {
      this.field3547 = class182_1.getUInt8();
    } else if (i_2 == 6) {
      this.field3548 = class182_1.getUInt16();
    } else if (i_2 == 7) {
      this.field3549 = class182_1.getUInt16();
    } else if (i_2 == 8) {
      this.field3550 = class182_1.getUInt8();
    } else if (i_2 == 9) {
      this.field3551 = class182_1.getUInt8();
    } else if (i_2 == 10) {
      this.field3535 = class182_1.getUInt8();
    } else if (i_2 == 11) {
      this.field3553 = class182_1.getUInt8();
    } else if (i_2 == 12) {
      i_3 = class182_1.getUInt8();
      this.field3542 = new int[i_3];

      for (i_4 = 0; i_4 < i_3; i_4++) {
        this.field3542[i_4] = class182_1.getUInt16();
      }

      for (i_4 = 0; i_4 < i_3; i_4++) {
        this.field3542[i_4] += class182_1.getUInt16() << 16;
      }
    } else if (i_2 == 13) {
      i_3 = class182_1.getUInt8();
      this.field3543 = new int[i_3];

      for (i_4 = 0; i_4 < i_3; i_4++) {
        this.field3543[i_4] = class182_1.getUInt24();
      }
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1055944735"
  )
  void method5220() {
    if (this.field3551 == -1) {
      if (this.field3545 != null) {
        this.field3551 = 2;
      } else {
        this.field3551 = 0;
      }
    }

    if (this.field3535 == -1) {
      if (this.field3545 != null) {
        this.field3535 = 2;
      } else {
        this.field3535 = 0;
      }
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Ldc;II)Ldc;",
      garbageValue = "-1433585529"
  )
  public class119 method5215(class119 class119_1, int i_2) {
    i_2 = this.field3540[i_2];
    class130 class130_3 = class19.method198(i_2 >> 16);
    i_2 &= 0xffff;
    if (class130_3 == null) {
      return class119_1.method2666(true);
    } else {
      class119 class119_4 = class119_1.method2666(!class130_3.method3075(i_2));
      class119_4.method2724(class130_3, i_2);
      return class119_4;
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Ldc;III)Ldc;",
      garbageValue = "416381559"
  )
  class119 method5216(class119 class119_1, int i_2, int i_3) {
    i_2 = this.field3540[i_2];
    class130 class130_4 = class19.method198(i_2 >> 16);
    i_2 &= 0xffff;
    if (class130_4 == null) {
      return class119_1.method2666(true);
    } else {
      class119 class119_5 = class119_1.method2666(!class130_4.method3075(i_2));
      i_3 &= 0x3;
      if (i_3 == 1) {
        class119_5.method2679();
      } else if (i_3 == 2) {
        class119_5.method2678();
      } else if (i_3 == 3) {
        class119_5.method2677();
      }

      class119_5.method2724(class130_4, i_2);
      if (i_3 == 1) {
        class119_5.method2677();
      } else if (i_3 == 2) {
        class119_5.method2678();
      } else if (i_3 == 3) {
        class119_5.method2679();
      }

      return class119_5;
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(Ldc;IB)Ldc;",
      garbageValue = "43"
  )
  class119 method5217(class119 class119_1, int i_2) {
    i_2 = this.field3540[i_2];
    class130 class130_3 = class19.method198(i_2 >> 16);
    i_2 &= 0xffff;
    if (class130_3 == null) {
      return class119_1.method2667(true);
    } else {
      class119 class119_4 = class119_1.method2667(!class130_3.method3075(i_2));
      class119_4.method2724(class130_3, i_2);
      return class119_4;
    }
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(Ldc;ILjn;II)Ldc;",
      garbageValue = "1488793247"
  )
  public class119 method5221(class119 class119_1, int i_2, class273 class273_3, int i_4) {
    i_2 = this.field3540[i_2];
    class130 class130_5 = class19.method198(i_2 >> 16);
    i_2 &= 0xffff;
    if (class130_5 == null) {
      return class273_3.method5215(class119_1, i_4);
    } else {
      i_4 = class273_3.field3540[i_4];
      class130 class130_6 = class19.method198(i_4 >> 16);
      i_4 &= 0xffff;
      class119 class119_7;
      if (class130_6 == null) {
        class119_7 = class119_1.method2666(!class130_5.method3075(i_2));
        class119_7.method2724(class130_5, i_2);
        return class119_7;
      } else {
        class119_7 = class119_1
            .method2666(!class130_5.method3075(i_2) & !class130_6.method3075(i_4));
        class119_7.method2745(class130_5, i_2, class130_6, i_4, this.field3545);
        return class119_7;
      }
    }
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(Ldc;II)Ldc;",
      garbageValue = "1136380155"
  )
  public class119 method5219(class119 class119_1, int i_2) {
    int i_3 = this.field3540[i_2];
    class130 class130_4 = class19.method198(i_3 >> 16);
    i_3 &= 0xffff;
    if (class130_4 == null) {
      return class119_1.method2666(true);
    } else {
      class130 class130_5 = null;
      int i_6 = 0;
      if (this.field3542 != null && i_2 < this.field3542.length) {
        i_6 = this.field3542[i_2];
        class130_5 = class19.method198(i_6 >> 16);
        i_6 &= 0xffff;
      }

      class119 class119_7;
      if (class130_5 != null && i_6 != 65535) {
        class119_7 = class119_1
            .method2666(!class130_4.method3075(i_3) & !class130_5.method3075(i_6));
        class119_7.method2724(class130_4, i_3);
        class119_7.method2724(class130_5, i_6);
        return class119_7;
      } else {
        class119_7 = class119_1.method2666(!class130_4.method3075(i_3));
        class119_7.method2724(class130_4, i_3);
        return class119_7;
      }
    }
  }

}
