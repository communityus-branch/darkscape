package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class84 extends SubNode {

  @ObfuscatedName("ps")
  @ObfuscatedGetter(
      intValue = 1528740431
  )
  static int field1197;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  static class200 field1190 = new class200(128);
  @ObfuscatedName("w")
  int[] field1189;
  @ObfuscatedName("s")
  int[] field1196;
  @ObfuscatedName("l")
  String[] field1191;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1475914653
  )
  int field1192;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 1631134769
  )
  int field1193;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 508133827
  )
  int field1188;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 546616217
  )
  int field1195;
  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "[Lgu;"
  )
  class197[] field1194;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "952694011"
  )
  public static void method1955() {
    while (true) {
      class245 class245_0;
      synchronized (class248.field3182) {
        class245_0 = (class245) class248.field3180.pollFirst();
      }

      if (class245_0 == null) {
        return;
      }

      class245_0.field3152
          .method4746(class245_0.field3151, (int) class245_0.hashKey, class245_0.field3149,
                      false);
    }
  }

  @ObfuscatedName("at")
  @ObfuscatedSignature(
      signature = "(Ldo;I)V",
      garbageValue = "2023211616"
  )
  static final void method1956(class105 class105_0) {
    class105_0.field1385 = false;
    if (class105_0.field1383 != null) {
      class105_0.field1383.field1416 = 0;
    }

    for (class105 class105_1 = class105_0.vmethod4382(); class105_1 != null;
        class105_1 = class105_0.vmethod4389()) {
      method1956(class105_1);
    }

  }

  @ObfuscatedName("ia")
  @ObfuscatedSignature(
      signature = "(IIIZB)V",
      garbageValue = "26"
  )
  static final void method1946(int i_0, int i_1, int i_2, boolean bool_3) {
    if (class261.method4931(i_0)) {
      class304.method5635(class42.field366[i_0], -1, i_1, i_2, bool_3);
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(II)[Lgu;",
      garbageValue = "-1761127859"
  )
  class197[] method1944(int i_1) {
    return new class197[i_1];
  }

}
