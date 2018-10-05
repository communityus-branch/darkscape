package rs.darkscape.client;

import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class155 {

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "Ldy;"
  )
  public static BufferedFile field1968 = null;
  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "Ldy;"
  )
  public static BufferedFile blocksFile = null;
  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "Ldy;"
  )
  public static BufferedFile manifestIndex = null;
  @ObfuscatedName("l")
  static File field1964;
  @ObfuscatedName("u")
  static File field1966;
  @ObfuscatedName("r")
  static String[] cacheLocation;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I",
      garbageValue = "75346420"
  )
  public static int method3269(CharSequence charsequence_0, CharSequence charsequence_1, int i_2) {
    int i_3 = charsequence_0.length();
    int i_4 = charsequence_1.length();
    int i_5 = 0;
    int i_6 = 0;
    byte b_7 = 0;
    byte b_8 = 0;

    while (i_5 - b_7 < i_3 || i_6 - b_8 < i_4) {
      if (i_5 - b_7 >= i_3) {
        return -1;
      }

      if (i_6 - b_8 >= i_4) {
        return 1;
      }

      char var_9;
      if (b_7 != 0) {
        var_9 = (char) b_7;
        boolean bool_14 = false;
      } else {
        var_9 = charsequence_0.charAt(i_5++);
      }

      char var_10;
      if (b_8 != 0) {
        var_10 = (char) b_8;
        boolean bool_15 = false;
      } else {
        var_10 = charsequence_1.charAt(i_6++);
      }

      byte b_11;
      if (var_9 == 198) {
        b_11 = 69;
      } else if (var_9 == 230) {
        b_11 = 101;
      } else if (var_9 == 223) {
        b_11 = 115;
      } else if (var_9 == 338) {
        b_11 = 69;
      } else if (var_9 == 339) {
        b_11 = 101;
      } else {
        b_11 = 0;
      }

      b_7 = b_11;
      byte b_12;
      if (var_10 == 198) {
        b_12 = 69;
      } else if (var_10 == 230) {
        b_12 = 101;
      } else if (var_10 == 223) {
        b_12 = 115;
      } else if (var_10 == 338) {
        b_12 = 69;
      } else if (var_10 == 339) {
        b_12 = 101;
      } else {
        b_12 = 0;
      }

      b_8 = b_12;
      var_9 = class17.method169(var_9, i_2);
      var_10 = class17.method169(var_10, i_2);
      if (var_9 != var_10 && Character.toUpperCase(var_9) != Character.toUpperCase(var_10)) {
        var_9 = Character.toLowerCase(var_9);
        var_10 = Character.toLowerCase(var_10);
        if (var_10 != var_9) {
          return class139.method3145(var_9, i_2) - class139.method3145(var_10, i_2);
        }
      }
    }

    int i_16 = Math.min(i_3, i_4);

    int i_17;
    char var_20;
    for (i_17 = 0; i_17 < i_16; i_17++) {
      char var_18 = charsequence_0.charAt(i_17);
      var_20 = charsequence_1.charAt(i_17);
      if (var_20 != var_18 && Character.toUpperCase(var_18) != Character.toUpperCase(var_20)) {
        var_18 = Character.toLowerCase(var_18);
        var_20 = Character.toLowerCase(var_20);
        if (var_20 != var_18) {
          return class139.method3145(var_18, i_2) - class139.method3145(var_20, i_2);
        }
      }
    }

    i_17 = i_3 - i_4;
    if (i_17 != 0) {
      return i_17;
    } else {
      for (int i_19 = 0; i_19 < i_16; i_19++) {
        var_20 = charsequence_0.charAt(i_19);
        char var_13 = charsequence_1.charAt(i_19);
        if (var_20 != var_13) {
          return class139.method3145(var_20, i_2) - class139.method3145(var_13, i_2);
        }
      }

      return 0;
    }
  }

  @ObfuscatedName("hi")
  @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-927006489"
  )
  static void method3275(int i_0, int i_1, int i_2, int i_3) {
    class230 class230_4 = class146.method3191(i_0, i_1);
    if (class230_4 != null && class230_4.field2734 != null) {
      class56 class56_5 = new class56();
      class56_5.field506 = class230_4;
      class56_5.field512 = class230_4.field2734;
      class68.method1696(class56_5);
    }

    client.field737 = i_3;
    client.field785 = true;
    class40.field361 = i_0;
    client.field736 = i_1;
    class63.field932 = i_2;
    class60.method1114(class230_4);
  }

}
