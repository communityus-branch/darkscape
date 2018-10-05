package rs.darkscape.client;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class58 extends SubNode {

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lkd;"
  )
  class289 field539;
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Lkd;"
  )
  class289 field536;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -216410853
  )
  int field540;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 279680387
  )
  int field535;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 1058139231
  )
  int field532;
  @ObfuscatedName("l")
  String field531;
  @ObfuscatedName("i")
  String field537;
  @ObfuscatedName("x")
  String field533;
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lkm;"
  )
  class291 field534;

  class58(int i_1, String string_2, String string_3, String string_4) {
    this.field539 = class289.field3633;
    this.field536 = class289.field3633;
    int i_5 = ++class83.field1186 - 1;
    this.field540 = i_5;
    this.field535 = client.field591;
    this.field532 = i_1;
    this.field531 = string_2;
    this.method1044();
    this.field537 = string_3;
    this.field533 = string_4;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;I)V",
      garbageValue = "-1743479306"
  )
  public static void method1069(AbstractPack class247_0) {
    class259.field3283 = class247_0;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lir;Lir;III)Lkj;",
      garbageValue = "-2132588897"
  )
  public static class298 method1058(AbstractPack class247_0, AbstractPack class247_1, int i_2, int i_3) {
    if (!class306.method5660(class247_0, i_2, i_3)) {
      return null;
    } else {
      byte[] bytes_5 = class247_1.method4625(i_2, i_3);
      class298 class298_4;
      if (bytes_5 == null) {
        class298_4 = null;
      } else {
        class298 class298_6 = new class298(bytes_5, class7.field45, class225.field2562,
                                           SpriteDecoder.field3800, SpriteDecoder.field3799,
                                           SpriteDecoder.colorPalette, SpriteDecoder.colorMaps);
        class7.field45 = null;
        class225.field2562 = null;
        SpriteDecoder.field3800 = null;
        SpriteDecoder.field3799 = null;
        SpriteDecoder.colorPalette = null;
        SpriteDecoder.colorMaps = null;
        class298_4 = class298_6;
      }

      return class298_4;
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
      garbageValue = "15"
  )
  static void method1053(String string_0, boolean bool_1, String string_2, boolean bool_3) {
    if (bool_1) {
      if (!bool_3 && Desktop.isDesktopSupported() && Desktop.getDesktop()
          .isSupported(Action.BROWSE)) {
        try {
          Desktop.getDesktop().browse(new URI(string_0));
          return;
        } catch (Exception ignored) {
        }
      }

      if (class45.field379.startsWith("win") && !bool_3) {
        class128.method3071(string_0, 0);
        return;
      }

      if (class45.field379.startsWith("mac")) {
        class13.method112(string_0, 1, string_2);
        return;
      }

      class128.method3071(string_0, 2);
    } else {
      class128.method3071(string_0, 3);
    }

  }

  @ObfuscatedName("gm")
  @ObfuscatedSignature(
      signature = "(Lba;IB)V",
      garbageValue = "-9"
  )
  static final void method1068(class63 class63_0, int i_1) {
    class238.method4594(class63_0.field931, class63_0.field881, i_1);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "27"
  )
  void method1070(int i_1, String string_2, String string_3, String string_4) {
    int i_5 = ++class83.field1186 - 1;
    this.field540 = i_5;
    this.field535 = client.field591;
    this.field532 = i_1;
    this.field531 = string_2;
    this.method1044();
    this.field537 = string_3;
    this.field533 = string_4;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1016035319"
  )
  void method1048() {
    this.field539 = class289.field3633;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1033770680"
  )
  final boolean method1040() {
    if (this.field539 == class289.field3633) {
      this.method1041();
    }

    return this.field539 == class289.field3631;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1665152249"
  )
  void method1041() {
    this.field539 = class181.field2332.field970.method5329(this.field534) ? class289.field3631
        : class289.field3634;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "725816073"
  )
  void method1042() {
    this.field536 = class289.field3633;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1678594295"
  )
  final boolean method1043() {
    if (this.field536 == class289.field3633) {
      this.method1061();
    }

    return this.field536 == class289.field3631;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2118903561"
  )
  void method1061() {
    this.field536 = class181.field2332.field975.method5329(this.field534) ? class289.field3631
        : class289.field3634;
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2077717645"
  )
  final void method1044() {
    if (this.field531 != null) {
      this.field534 = new class291(class139.method3138(this.field531), class36.field306);
    } else {
      this.field534 = null;
    }

  }

}
