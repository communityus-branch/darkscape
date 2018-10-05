package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class265 extends SubNode {

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3334 = new class200(64);
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lgu;"
  )
  class197 field3335;

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;S)Ljava/lang/String;",
      garbageValue = "-15504"
  )
  public static String method4976(CharSequence charsequence_0) {
    int i_2 = charsequence_0.length();
    char[] arr_3 = new char[i_2];

    for (int i_4 = 0; i_4 < i_2; i_4++) {
      arr_3[i_4] = 42;
    }

    String string_1 = new String(arr_3);
    return string_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-12113"
  )
  public void method4961() {
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-1049647297"
  )
  public void method4960(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4967(class182_1, i_2);
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "49"
  )
  void method4967(Buffer class182_1, int i_2) {
    if (i_2 == 249) {
      this.field3335 = Keyboard.method691(class182_1, this.field3335);
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1625397785"
  )
  public int method4962(int i_1, int i_2) {
    return class67.method1668(this.field3335, i_1, i_2);
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1321856430"
  )
  public String method4963(int i_1, String string_2) {
    return class17.method171(this.field3335, i_1, string_2);
  }

}
