package rs.darkscape.client;

import java.awt.Image;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class71 extends Node {

  @ObfuscatedName("at")
  static Image field1028;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgy;"
  )
  class203 field1026 = new class203();
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lja;"
  )
  class261 field1025;

  @ObfuscatedSignature(
      signature = "(Lja;)V"
  )
  class71(class261 class261_1) {
    this.field1025 = class261_1;
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "792090098"
  )
  static class318 method1781() {
    class318 class318_0 = new class318();
    class318_0.field3796 = class305.field3729;
    class318_0.field3792 = SpriteDecoder.field3798;
    class318_0.field3793 = class7.field45[0];
    class318_0.field3790 = class225.field2562[0];
    class318_0.field3787 = SpriteDecoder.field3800[0];
    class318_0.field3788 = SpriteDecoder.field3799[0];
    int i_1 = class318_0.field3788 * class318_0.field3787;
    byte[] bytes_2 = SpriteDecoder.colorMaps[0];
    class318_0.field3791 = new int[i_1];

    for (int i_3 = 0; i_3 < i_1; i_3++) {
      class318_0.field3791[i_3] = SpriteDecoder.colorPalette[bytes_2[i_3] & 0xff];
    }

    class7.field45 = null;
    class225.field2562 = null;
    SpriteDecoder.field3800 = null;
    SpriteDecoder.field3799 = null;
    SpriteDecoder.colorPalette = null;
    SpriteDecoder.colorMaps = null;
    return class318_0;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "2106192110"
  )
  void method1772(int i_1, int i_2, int i_3, int i_4) {
    class64 class64_5 = null;
    int i_6 = 0;

    for (class64 class64_7 = (class64) this.field1026.method4048(); class64_7 != null;
        class64_7 = (class64) this.field1026.method4033()) {
      ++i_6;
      if (class64_7.field934 == i_1) {
        class64_7.method1559(i_1, i_2, i_3, i_4);
        return;
      }

      if (class64_7.field934 <= i_1) {
        class64_5 = class64_7;
      }
    }

    if (class64_5 == null) {
      if (i_6 < 4) {
        this.field1026.method4038(new class64(i_1, i_2, i_3, i_4));
      }

    } else {
      class203.method4036(new class64(i_1, i_2, i_3, i_4), class64_5);
      if (i_6 >= 4) {
        this.field1026.method4048().unlinkNode();
      }

    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)Lbn;",
      garbageValue = "1625981633"
  )
  class64 method1773(int i_1) {
    class64 class64_2 = (class64) this.field1026.method4048();
    if (class64_2 != null && class64_2.field934 <= i_1) {
      for (class64 class64_3 = (class64) this.field1026.method4033();
          class64_3 != null && class64_3.field934 <= i_1;
          class64_3 = (class64) this.field1026.method4033()) {
        class64_2.unlinkNode();
        class64_2 = class64_3;
      }

      if (this.field1025.field3313 + class64_2.field934 + class64_2.field937 > i_1) {
        return class64_2;
      } else {
        class64_2.unlinkNode();
        return null;
      }
    } else {
      return null;
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "44"
  )
  boolean method1774() {
    return this.field1026.method4043();
  }

}
