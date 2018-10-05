package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class179 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)Lid;",
      garbageValue = "909001219"
  )
  public static class243 method3517(int i_0) {
    class243[] arr_1 = new class243[]{class243.field3132, class243.field3136, class243.field3131,
        class243.field3134};
    class243[] arr_2 = arr_1;

    for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
      class243 class243_4 = arr_2[i_3];
      if (i_0 == class243_4.field3133) {
        return class243_4;
      }
    }

    return null;
  }

}
