package rs.darkscape.client;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class33 extends class20 {

  @ObfuscatedName("mn")
  @ObfuscatedSignature(
      signature = "Lfp;"
  )
  static MouseWheel mouseWheel;
  @ObfuscatedName("n")
  HashSet field292;
  @ObfuscatedName("f")
  HashSet field291;
  @ObfuscatedName("g")
  List field290;

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "([BIII)Z",
      garbageValue = "1833687101"
  )
  static final boolean method557(byte[] bytes_0, int i_1, int i_2) {
    boolean bool_3 = true;
    Buffer class182_4 = new Buffer(bytes_0);
    int i_5 = -1;

    label71:
    while (true) {
      int i_6 = class182_4.method3563();
      if (i_6 == 0) {
        return bool_3;
      }

      i_5 += i_6;
      int i_7 = 0;
      boolean bool_8 = false;

      while (true) {
        int i_9;
        while (!bool_8) {
          i_9 = class182_4.method3562();
          if (i_9 == 0) {
            continue label71;
          }

          i_7 += i_9 - 1;
          int i_10 = i_7 & 0x3f;
          int i_11 = i_7 >> 6 & 0x3f;
          int i_12 = class182_4.getUInt8() >> 2;
          int i_13 = i_11 + i_1;
          int i_14 = i_10 + i_2;
          if (i_13 > 0 && i_14 > 0 && i_13 < 103 && i_14 < 103) {
            class268 class268_15 = SeekableFile.method2527(i_5);
            if (i_12 != 22 || !client.field585 || class268_15.field3388 != 0
                || class268_15.field3386 == 1 || class268_15.field3407) {
              if (!class268_15.method5051()) {
                ++client.field635;
                bool_3 = false;
              }

              bool_8 = true;
            }
          }
        }

        i_9 = class182_4.method3562();
        if (i_9 == 0) {
          break;
        }

        class182_4.getUInt8();
      }
    }
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-2008842241"
  )
  static final int method558(int i_0, int i_1, int i_2) {
    int i_3 = 256 - i_2;
    return ((i_1 & 0xff00) * i_2 + (i_0 & 0xff00) * i_3 & 0xff0000) + (
        (i_1 & 0xff00ff) * i_2 + i_3 * (i_0 & 0xff00ff) & ~0xff00ff) >> 8;
  }

  @ObfuscatedName("fr")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "2035290647"
  )
  static void method559(int i_0) {
    if (i_0 == -3) {
      class2.method22("Connection timed out.", "Please try using a different world.", "");
    } else if (i_0 == -2) {
      class2.method22("", "Error connecting to server.", "");
    } else if (i_0 == -1) {
      class2.method22("No response from server.", "Please try using a different world.", "");
    } else if (i_0 == 3) {
      class78.field1081 = 3;
    } else if (i_0 == 4) {
      class2.method22("Your account has been disabled.",
                      "Please check your message-centre for details.", "");
    } else if (i_0 == 5) {
      class2.method22("Your account has not logged out from its last",
                      "session or the server is too busy right now.",
                      "Please try again in a few minutes.");
    } else if (i_0 == 6) {
      class2.method22("RuneScape has been updated!", "Please reload this page.", "");
    } else if (i_0 == 7) {
      class2.method22("This world is full.", "Please use a different world.", "");
    } else if (i_0 == 8) {
      class2.method22("Unable to connect.", "Login server offline.", "");
    } else if (i_0 == 9) {
      class2.method22("Login limit exceeded.", "Too many connections from your address.", "");
    } else if (i_0 == 10) {
      class2.method22("Unable to connect.", "Bad session id.", "");
    } else if (i_0 == 11) {
      class2.method22("We suspect someone knows your password.",
                      "Press \'change your password\' on front page.", "");
    } else if (i_0 == 12) {
      class2.method22("You need a members account to login to this world.",
                      "Please subscribe, or use a different world.", "");
    } else if (i_0 == 13) {
      class2.method22("Could not complete login.", "Please try using a different world.", "");
    } else if (i_0 == 14) {
      class2.method22("The server is being updated.", "Please wait 1 minute and try again.", "");
    } else if (i_0 == 16) {
      class2.method22("Too many login attempts.", "Please wait a few minutes before trying again.",
                      "");
    } else if (i_0 == 17) {
      class2.method22("You are standing in a members-only area.",
                      "To play on this world move to a free area first", "");
    } else if (i_0 == 18) {
      class2.method22("Account locked as we suspect it has been stolen.",
                      "Press \'recover a locked account\' on front page.", "");
    } else if (i_0 == 19) {
      class2.method22("This world is running a closed Beta.", "Sorry invited players only.",
                      "Please use a different world.");
    } else if (i_0 == 20) {
      class2.method22("Invalid loginserver requested.", "Please try using a different world.", "");
    } else if (i_0 == 22) {
      class2.method22("Malformed login packet.", "Please try again.", "");
    } else if (i_0 == 23) {
      class2.method22("No reply from loginserver.", "Please wait 1 minute and try again.", "");
    } else if (i_0 == 24) {
      class2.method22("Error loading your profile.", "Please contact customer support.", "");
    } else if (i_0 == 25) {
      class2
          .method22("Unexpected loginserver response.", "Please try using a different world.", "");
    } else if (i_0 == 26) {
      class2
          .method22("This computers address has been blocked", "as it was used to break our rules.",
                    "");
    } else if (i_0 == 27) {
      class2.method22("", "Service unavailable.", "");
    } else if (i_0 == 31) {
      class2.method22("Your account must have a displayname set",
                      "in order to play the game.  Please set it",
                      "via the website, or the main game.");
    } else if (i_0 == 32) {
      class2.method22("Your attempt to log into your account was",
                      "unsuccessful.  Don\'t worry, you can sort",
                      "this out by visiting the billing system.");
    } else if (i_0 == 37) {
      class2
          .method22("Your account is currently inaccessible.", "Please try again in a few minutes.",
                    "");
    } else if (i_0 == 38) {
      class2.method22("You need to vote to play!", "Visit runescape.com and vote,",
                      "and then come back here!");
    } else if (i_0 == 55) {
      class78.field1081 = 8;
    } else {
      if (i_0 == 56) {
        class2.method22("Enter the 6-digit code generated by your", "authenticator app.", "");
        Mouse.method947(11);
        return;
      }

      if (i_0 == 57) {
        class2.method22("The code you entered was incorrect.", "Please try again.", "");
        Mouse.method947(11);
        return;
      }

      if (i_0 == 61) {
        class78.field1081 = 7;
      } else {
        class2.method22("Unexpected server response", "Please try using a different world.", "");
      }
    }

    Mouse.method947(10);
  }

  @ObfuscatedName("bb")
  @ObfuscatedSignature(
      signature = "(Lgk;Lgk;Lgk;IZB)V",
      garbageValue = "-46"
  )
  void method550(Buffer class182_1, Buffer class182_2, Buffer class182_3, int i_4, boolean bool_5) {
    this.method200(class182_1, i_4);
    int i_6 = class182_3.getUInt16();
    this.field292 = new HashSet(i_6);

    int i_7;
    for (i_7 = 0; i_7 < i_6; i_7++) {
      class10 class10_8 = new class10();

      try {
        class10_8.method95(class182_2, class182_3);
      } catch (IllegalStateException illegalstateexception_13) {
        continue;
      }

      this.field292.add(class10_8);
    }

    i_7 = class182_3.getUInt16();
    this.field291 = new HashSet(i_7);

    for (int i_11 = 0; i_11 < i_7; i_11++) {
      class34 class34_9 = new class34();

      try {
        class34_9.method561(class182_2, class182_3);
      } catch (IllegalStateException illegalstateexception_12) {
        continue;
      }

      this.field291.add(class34_9);
    }

    this.method551(class182_2, bool_5);
  }

  @ObfuscatedName("bx")
  @ObfuscatedSignature(
      signature = "(Lgk;ZI)V",
      garbageValue = "-182782257"
  )
  void method551(Buffer class182_1, boolean bool_2) {
    this.field290 = new LinkedList();
    int i_3 = class182_1.getUInt16();

    for (int i_4 = 0; i_4 < i_3; i_4++) {
      int i_5 = class182_1.method3546();
      class226 class226_6 = new class226(class182_1.getInt32());
      boolean bool_7 = class182_1.getUInt8() == 1;
      if (bool_2 || !bool_7) {
        this.field290.add(new class13(i_5, class226_6));
      }
    }

  }

}
