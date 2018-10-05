package rs.darkscape.client;

import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public class class121 {

  @ObfuscatedName("ad")
  static GarbageCollectorMXBean field1660;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -917159191
  )
  int field1665;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 1983063125
  )
  int field1661;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -397804509
  )
  int field1662;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -2066832217
  )
  int field1666;

  class121() {
  }

  @ObfuscatedSignature(
      signature = "(Ldw;)V"
  )
  class121(class121 class121_1) {
    this.field1665 = class121_1.field1665;
    this.field1661 = class121_1.field1661;
    this.field1662 = class121_1.field1662;
    this.field1666 = class121_1.field1666;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "32"
  )
  static void method2782(int i_0) {
    class53 class53_1 = (class53) class53.field474.get((long) i_0);
    if (class53_1 != null) {
      for (int i_2 = 0; i_2 < class53_1.field477.length; i_2++) {
        class53_1.field477[i_2] = -1;
        class53_1.field473[i_2] = 0;
      }

    }
  }

  @ObfuscatedName("jv")
  @ObfuscatedSignature(
      signature = "(IIIILll;Lhv;I)V",
      garbageValue = "606939264"
  )
  static final void method2783(int i_0, int i_1, int i_2, int i_3, class318 class318_4,
                               class224 class224_5) {
    int i_6 = i_3 * i_3 + i_2 * i_2;
    if (i_6 > 4225 && i_6 < 90000) {
      int i_7 = client.field717 & 0x7ff;
      int i_8 = class122.field1681[i_7];
      int i_9 = class122.field1693[i_7];
      int i_10 = i_9 * i_2 + i_3 * i_8 >> 16;
      int i_11 = i_3 * i_9 - i_8 * i_2 >> 16;
      double d_12 = Math.atan2((double) i_10, (double) i_11);
      int i_14 = class224_5.field2553 / 2 - 25;
      int i_15 = (int) (Math.sin(d_12) * (double) i_14);
      int i_16 = (int) (Math.cos(d_12) * (double) i_14);
      byte b_17 = 20;
      class136.field1862.method5865(i_15 + (i_0 + class224_5.field2553 / 2 - b_17 / 2),
                                    class224_5.field2549 / 2 + i_1 - b_17 / 2 - i_16 - 10, b_17,
                                    b_17, 15, 15, d_12, 256);
    } else {
      class55.method1022(i_0, i_1, i_2, i_3, class318_4, class224_5);
    }

  }

}
