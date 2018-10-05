package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
public class class53 extends Node {

  @ObfuscatedName("ri")
  @ObfuscatedSignature(
      signature = "Llw;"
  )
  static class321 field476;
  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "Lly;"
  )
  static class317 field472;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  static HashMap field474 = new HashMap(32);
  @ObfuscatedName("w")
  int[] field477 = new int[]{-1};
  @ObfuscatedName("s")
  int[] field473 = new int[]{0};

  @ObfuscatedName("fa")
  @ObfuscatedSignature(
      signature = "(IZZZB)Lic;",
      garbageValue = "95"
  )
  static class249 method1009(int i_0, boolean bool_1, boolean bool_2, boolean bool_3) {
    StorageVolume class162_4 = null;
    if (class155.blocksFile != null) {
      class162_4 = new StorageVolume(i_0, class155.blocksFile, class76.field1068[i_0], 1000000);
    }

    return new class249(class162_4, class34.manifests, i_0, bool_1, bool_2, bool_3);
  }

  @ObfuscatedName("jc")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1595845951"
  )
  static final void method1012() {
    for (int i_0 = 0; i_0 < class81.field1167; i_0++) {
      class60 class60_1 = client.field610[class81.field1159[i_0]];
      class60_1.method1084();
    }

    class37.method640();
    if (class14.field94 != null) {
      class14.field94.method5467();
    }

  }

}
