package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public final class class305 {

  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -259078735
  )
  static int field3729;
  @ObfuscatedName("p")
  static int[] field3725;

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(I)Lly;",
      garbageValue = "1052310546"
  )
  static class317 method5658() {
    class317 class317_0 = new class317();
    class317_0.field3784 = field3729;
    class317_0.field3783 = SpriteDecoder.field3798;
    class317_0.field3782 = class7.field45[0];
    class317_0.field3778 = class225.field2562[0];
    class317_0.field3780 = SpriteDecoder.field3800[0];
    class317_0.field3781 = SpriteDecoder.field3799[0];
    class317_0.colorPalette = SpriteDecoder.colorPalette;
    class317_0.colorMap = SpriteDecoder.colorMaps[0];
    class7.field45 = null;
    class225.field2562 = null;
    SpriteDecoder.field3800 = null;
    SpriteDecoder.field3799 = null;
    SpriteDecoder.colorPalette = null;
    SpriteDecoder.colorMaps = null;
    return class317_0;
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "1903036691"
  )
  static int method5659(int i_0, class84 class84_1, boolean bool_2) {
    class230 class230_3;
    if (i_0 >= 2000) {
      i_0 -= 1000;
      class230_3 = class26.method434(class69.field999[--class69.field1003]);
    } else {
      class230_3 = bool_2 ? class276.field3561 : class260.field3301;
    }

    if (i_0 == 1927) {
      if (class69.field1009 >= 10) {
        throw new RuntimeException();
      } else if (class230_3.field2715 == null) {
        return 0;
      } else {
        class56 class56_4 = new class56();
        class56_4.field506 = class230_3;
        class56_4.field512 = class230_3.field2715;
        class56_4.field514 = class69.field1009 + 1;
        client.field638.addLast(class56_4);
        return 1;
      }
    } else {
      return 2;
    }
  }

}
