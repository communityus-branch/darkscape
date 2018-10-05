package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public final class class241 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IS)Ljo;",
      garbageValue = "-21845"
  )
  public static class264 method4603(int i_0) {
    class264 class264_1 = (class264) class264.field3328.method3989((long) i_0);
    if (class264_1 != null) {
      return class264_1;
    } else {
      byte[] bytes_2 = class264.field3327.method4625(11, i_0);
      class264_1 = new class264();
      if (bytes_2 != null) {
        class264_1.method4948(new Buffer(bytes_2));
      }

      class264_1.method4954();
      class264.field3328.method3983(class264_1, (long) i_0);
      return class264_1;
    }
  }

  @ObfuscatedName("hf")
  @ObfuscatedSignature(
      signature = "(IIIIIIIIIB)V",
      garbageValue = "-35"
  )
  static final void method4602(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6,
                               int i_7, int i_8) {
    class62 class62_9 = null;

    for (class62 class62_10 = (class62) client.field714.getFirst(); class62_10 != null;
        class62_10 = (class62) client.field714.getNext()) {
      if (i_0 == class62_10.field861 && class62_10.field857 == i_1 && i_2 == class62_10.field858
          && i_3 == class62_10.field856) {
        class62_9 = class62_10;
        break;
      }
    }

    if (class62_9 == null) {
      class62_9 = new class62();
      class62_9.field861 = i_0;
      class62_9.field856 = i_3;
      class62_9.field857 = i_1;
      class62_9.field858 = i_2;
      class74.method1800(class62_9);
      client.field714.addLast(class62_9);
    }

    class62_9.field862 = i_4;
    class62_9.field864 = i_5;
    class62_9.field863 = i_6;
    class62_9.field855 = i_7;
    class62_9.field860 = i_8;
  }

}
