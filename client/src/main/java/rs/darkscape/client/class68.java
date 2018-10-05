package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
public final class class68 extends Node {

  @ObfuscatedName("ds")
  @ObfuscatedGetter(
      intValue = -884199663
  )
  static int field996;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  static Deque field985 = new Deque();
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 510585237
  )
  int field984;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -1060604171
  )
  int field981;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -2012590697
  )
  int field988;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -2028898983
  )
  int field983;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 2130308981
  )
  int field992;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = 366883801
  )
  int field990;
  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "Lcm;"
  )
  class103 field980;
  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "Ljj;"
  )
  class268 field994;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 481090733
  )
  int field987;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 143905457
  )
  int field991;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -1464678261
  )
  int field989;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = 1298002913
  )
  int field982;
  @ObfuscatedName("b")
  int[] field986;
  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "Lcm;"
  )
  class103 field993;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lbo;I)V",
      garbageValue = "-1000206687"
  )
  public static void method1696(class56 class56_0) {
    class309.method5674(class56_0, 500000);
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;IZB)I",
      garbageValue = "53"
  )
  public static int method1693(CharSequence charsequence_0, int i_1, boolean bool_2) {
    if (i_1 >= 2 && i_1 <= 36) {
      boolean bool_3 = false;
      boolean bool_4 = false;
      int i_5 = 0;
      int i_6 = charsequence_0.length();

      for (int i_7 = 0; i_7 < i_6; i_7++) {
        char var_8 = charsequence_0.charAt(i_7);
        if (i_7 == 0) {
          if (var_8 == 45) {
            bool_3 = true;
            continue;
          }

          if (var_8 == 43) {
            continue;
          }
        }

        int i_10;
        if (var_8 >= 48 && var_8 <= 57) {
          i_10 = var_8 - 48;
        } else if (var_8 >= 65 && var_8 <= 90) {
          i_10 = var_8 - 55;
        } else {
          if (var_8 < 97 || var_8 > 122) {
            throw new NumberFormatException();
          }

          i_10 = var_8 - 87;
        }

        if (i_10 >= i_1) {
          throw new NumberFormatException();
        }

        if (bool_3) {
          i_10 = -i_10;
        }

        int i_9 = i_10 + i_5 * i_1;
        if (i_9 / i_1 != i_5) {
          throw new NumberFormatException();
        }

        i_5 = i_9;
        bool_4 = true;
      }

      if (!bool_4) {
        throw new NumberFormatException();
      } else {
        return i_5;
      }
    } else {
      throw new IllegalArgumentException("");
    }
  }

  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1978013754"
  )
  public static void method1698() {
    class230.field2599.method3984();
    class230.field2600.method3984();
    class230.field2601.method3984();
    class230.field2602.method3984();
  }

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "(IZII)V",
      garbageValue = "-1337565581"
  )
  public static final void method1697(int i_0, boolean bool_1, int i_2) {
    if (i_0 >= 8000 && i_0 <= 48000) {
      class95.field1300 = i_0;
      class95.field1295 = bool_1;
      class27.field230 = i_2;
    } else {
      throw new IllegalArgumentException();
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-73"
  )
  void method1688() {
    int i_1 = this.field987;
    class268 class268_2 = this.field994.method5056();
    if (class268_2 != null) {
      this.field987 = class268_2.field3413;
      this.field991 = class268_2.field3414 * 128;
      this.field989 = class268_2.field3380;
      this.field982 = class268_2.field3408;
      this.field986 = class268_2.field3417;
    } else {
      this.field987 = -1;
      this.field991 = 0;
      this.field989 = 0;
      this.field982 = 0;
      this.field986 = null;
    }

    if (i_1 != this.field987 && this.field993 != null) {
      class36.field310.method2009(this.field993);
      this.field993 = null;
    }

  }

}
