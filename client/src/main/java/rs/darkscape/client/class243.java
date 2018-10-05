package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class243 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lid;"
  )
  static final class243 field3131 = new class243("LIVE", 0);
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lid;"
  )
  static final class243 field3132 = new class243("BUILDLIVE", 3);
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lid;"
  )
  static final class243 field3136 = new class243("RC", 1);
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lid;"
  )
  static final class243 field3134 = new class243("WIP", 2);
  @ObfuscatedName("c")
  @ObfuscatedGetter(
      intValue = -848859815
  )
  public static int field3138;
  @ObfuscatedName("f")
  static int[] field3137;
  @ObfuscatedName("fs")
  @ObfuscatedSignature(
      signature = "[Lly;"
  )
  static class317[] field3139;
  @ObfuscatedName("u")
  public final String field3135;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -2135504665
  )
  final int field3133;

  class243(String string_1, int i_2) {
    this.field3135 = string_1;
    this.field3133 = i_2;
  }

  @ObfuscatedName("ik")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
      garbageValue = "-15"
  )
  static final void method4612(String string_0, String string_1, int i_2, int i_3, int i_4, int i_5,
                               boolean bool_6) {
    if (!client.field716) {
      if (client.field771 < 500) {
        client.field735[client.field771] = string_0;
        client.field740[client.field771] = string_1;
        client.field720[client.field771] = i_2;
        client.field794[client.field771] = i_3;
        client.field718[client.field771] = i_4;
        client.field851[client.field771] = i_5;
        client.field590[client.field771] = bool_6;
        ++client.field771;
      }

    }
  }

}
