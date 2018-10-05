package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public final class class49 {

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "Leh;"
  )
  static class136 field439;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)Liq;",
      garbageValue = "860567064"
  )
  public static class259 method953(int i_0) {
    class259 class259_1 = (class259) class259.field3282.method3989((long) i_0);
    if (class259_1 != null) {
      return class259_1;
    } else {
      byte[] bytes_2 = class259.field3283.method4625(1, i_0);
      class259_1 = new class259();
      if (bytes_2 != null) {
        class259_1.method4880(new Buffer(bytes_2), i_0);
      }

      class259_1.method4875();
      class259.field3282.method3983(class259_1, (long) i_0);
      return class259_1;
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-66"
  )
  static void method952() {
    class50.field445 = null;
    class165.field2033 = null;
    class50.field446 = null;
    class19.field159 = null;
    class37.field325 = null;
    class50.field447 = null;
    class50.field448 = null;
    class50.field454 = null;
    class305.field3725 = null;
    class72.field1035 = null;
    class263.field3325 = null;
    class243.field3137 = null;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)[Lly;",
      garbageValue = "2064294997"
  )
  static class317[] method950() {
    class317[] arr_0 = new class317[SpriteDecoder.frameCount];

    for (int i_1 = 0; i_1 < SpriteDecoder.frameCount; i_1++) {
      class317 class317_2 = arr_0[i_1] = new class317();
      class317_2.field3784 = class305.field3729;
      class317_2.field3783 = SpriteDecoder.field3798;
      class317_2.field3782 = class7.field45[i_1];
      class317_2.field3778 = class225.field2562[i_1];
      class317_2.field3780 = SpriteDecoder.field3800[i_1];
      class317_2.field3781 = SpriteDecoder.field3799[i_1];
      class317_2.colorPalette = SpriteDecoder.colorPalette;
      class317_2.colorMap = SpriteDecoder.colorMaps[i_1];
    }

    class7.field45 = null;
    class225.field2562 = null;
    SpriteDecoder.field3800 = null;
    SpriteDecoder.field3799 = null;
    SpriteDecoder.colorPalette = null;
    SpriteDecoder.colorMaps = null;
    return arr_0;
  }

  @ObfuscatedName("gx")
  @ObfuscatedSignature(
      signature = "(IIIIIIB)V",
      garbageValue = "35"
  )
  static final void method951(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
    int i_6 = 2048 - i_3 & 0x7ff;
    int i_7 = 2048 - i_4 & 0x7ff;
    int i_8 = 0;
    int i_9 = 0;
    int i_10 = i_5;
    int i_11;
    int i_12;
    int i_13;
    if (i_6 != 0) {
      i_11 = class122.field1681[i_6];
      i_12 = class122.field1693[i_6];
      i_13 = i_12 * i_9 - i_5 * i_11 >> 16;
      i_10 = i_12 * i_5 + i_9 * i_11 >> 16;
      i_9 = i_13;
    }

    if (i_7 != 0) {
      i_11 = class122.field1681[i_7];
      i_12 = class122.field1693[i_7];
      i_13 = i_8 * i_12 + i_11 * i_10 >> 16;
      i_10 = i_10 * i_12 - i_8 * i_11 >> 16;
      i_8 = i_13;
    }

    BufferedFile.field1431 = i_0 - i_8;
    class123.field1702 = i_1 - i_9;
    class226.field2563 = i_2 - i_10;
    class7.field41 = i_3;
    class85.field1201 = i_4;
    if (client.field655 == 1 && client.field747 >= 2 && client.field591 % 50 == 0 && (
        BufferedFile.field1428 >> 7 != class138.field1876.field931 >> 7
            || class2.field23 >> 7 != class138.field1876.field881 >> 7)) {
      i_11 = class138.field1876.field567;
      i_12 = (BufferedFile.field1428 >> 7) + class62.field868;
      i_13 = (class2.field23 >> 7) + client.field754;
      class19.method197(i_12, i_13, i_11, true);
    }

  }

}
