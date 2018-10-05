package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public abstract class class127 extends SubNode {

  @ObfuscatedName("cg")
  @ObfuscatedGetter(
      intValue = 762597167
  )
  public int field1781 = 1000;

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
  )
  protected class119 vmethod3067() {
    return null;
  }

  @ObfuscatedName("cx")
  void vmethod3063(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8,
                   long long_9) {
    class119 class119_11 = this.vmethod3067();
    if (class119_11 != null) {
      this.field1781 = class119_11.field1781;
      class119_11.vmethod3063(i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, long_9);
    }

  }

}
