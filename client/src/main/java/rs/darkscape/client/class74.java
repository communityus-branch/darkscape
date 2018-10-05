package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class74 {

  @ObfuscatedName("hh")
  @ObfuscatedSignature(
      signature = "(Lbl;B)V",
      garbageValue = "7"
  )
  static final void method1800(class62 class62_0) {
    long long_1 = 0L;
    int i_3 = -1;
    int i_4 = 0;
    int i_5 = 0;
    if (class62_0.field856 == 0) {
      long_1 = class28.field248
          .method2898(class62_0.field861, class62_0.field857, class62_0.field858);
    }

    if (class62_0.field856 == 1) {
      long_1 = class28.field248
          .method2899(class62_0.field861, class62_0.field857, class62_0.field858);
    }

    if (class62_0.field856 == 2) {
      long_1 = class28.field248
          .method2900(class62_0.field861, class62_0.field857, class62_0.field858);
    }

    if (class62_0.field856 == 3) {
      long_1 = class28.field248
          .method2901(class62_0.field861, class62_0.field857, class62_0.field858);
    }

    if (long_1 != 0L) {
      int i_6 = class28.field248
          .method2902(class62_0.field861, class62_0.field857, class62_0.field858, long_1);
      i_3 = Keyboard.method673(long_1);
      i_4 = i_6 & 0x1f;
      i_5 = i_6 >> 6 & 0x3;
    }

    class62_0.field859 = i_3;
    class62_0.field866 = i_4;
    class62_0.field865 = i_5;
  }

}
