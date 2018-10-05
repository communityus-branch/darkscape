package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class class277 {

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;B)I",
      garbageValue = "1"
  )
  public static int method5240(CharSequence charsequence_0) {
    int i_1 = charsequence_0.length();
    int i_2 = 0;

    for (int i_3 = 0; i_3 < i_1; i_3++) {
      i_2 = (i_2 << 5) - i_2 + class166.method3441(charsequence_0.charAt(i_3));
    }

    return i_2;
  }

}
