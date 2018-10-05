package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class55 extends Node {

  @ObfuscatedName("rz")
  @ObfuscatedGetter(
      intValue = -150808717
  )
  static int field495;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 1708585715
  )
  static int field497;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -432145823
  )
  int field501;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -1556790455
  )
  int field494;
  @ObfuscatedName("s")
  boolean field496 = false;

  @ObfuscatedName("jn")
  @ObfuscatedSignature(
      signature = "(IIIILll;Lhv;B)V",
      garbageValue = "103"
  )
  static final void method1022(int i_0, int i_1, int i_2, int i_3, class318 class318_4,
                               class224 class224_5) {
    if (class318_4 != null) {
      int i_6 = client.field717 & 0x7ff;
      int i_7 = i_3 * i_3 + i_2 * i_2;
      if (i_7 <= 6400) {
        int i_8 = class122.field1681[i_6];
        int i_9 = class122.field1693[i_6];
        int i_10 = i_3 * i_8 + i_9 * i_2 >> 16;
        int i_11 = i_3 * i_9 - i_8 * i_2 >> 16;
        if (i_7 > 2500) {
          class318_4.method5867(i_10 + class224_5.field2553 / 2 - class318_4.field3796 / 2,
                                class224_5.field2549 / 2 - i_11 - class318_4.field3792 / 2, i_0,
                                i_1, class224_5.field2553, class224_5.field2549,
                                class224_5.field2551, class224_5.field2550);
        } else {
          class318_4.method5851(i_0 + i_10 + class224_5.field2553 / 2 - class318_4.field3796 / 2,
                                class224_5.field2549 / 2 + i_1 - i_11 - class318_4.field3792 / 2);
        }

      }
    }
  }

}
