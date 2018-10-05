package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class34 extends class16 {

  @ObfuscatedName("rx")
  @ObfuscatedSignature(
      signature = "Lff;"
  )
  static StorageVolume manifests;
  @ObfuscatedName("ej")
  @ObfuscatedGetter(
      intValue = -1954811163
  )
  static int field301;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = 708492455
  )
  int field299;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = 890340593
  )
  int field297;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = 1440084157
  )
  int field298;
  @ObfuscatedName("g")
  @ObfuscatedGetter(
      intValue = -747624987
  )
  int field296;

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1158823389"
  )
  static void method586() {
    if (class78.field1108 && class78.field1106 != null && class78.field1106.length() > 0) {
      class78.field1102 = 1;
    } else {
      class78.field1102 = 0;
    }

  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "-10"
  )
  static final int method560(int i_0, int i_1, int i_2) {
    if (i_2 > 179) {
      i_1 /= 2;
    }

    if (i_2 > 192) {
      i_1 /= 2;
    }

    if (i_2 > 217) {
      i_1 /= 2;
    }

    if (i_2 > 243) {
      i_1 /= 2;
    }

    int i_3 = (i_1 / 32 << 7) + (i_0 / 4 << 10) + i_2 / 2;
    return i_3;
  }

  @ObfuscatedName("hb")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "995963221"
  )
  static void method585() {
    if (client.field785) {
      class230 class230_0 = class146.method3191(class40.field361, client.field736);
      if (class230_0 != null && class230_0.field2698 != null) {
        class56 class56_1 = new class56();
        class56_1.field506 = class230_0;
        class56_1.field512 = class230_0.field2698;
        class68.method1696(class56_1);
      }

      client.field785 = false;
      class60.method1114(class230_0);
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lgk;Lgk;I)V",
      garbageValue = "-1293834661"
  )
  void method561(Buffer class182_1, Buffer class182_2) {
    int i_3 = class182_2.getUInt8();
    if (i_3 != class25.field209.field211) {
      throw new IllegalStateException("");
    } else {
      super.field120 = class182_2.getUInt8();
      super.field121 = class182_2.getUInt8();
      super.field127 = class182_2.getUInt16();
      super.field117 = class182_2.getUInt16();
      this.field299 = class182_2.getUInt8();
      this.field297 = class182_2.getUInt8();
      super.field118 = class182_2.getUInt16();
      super.field119 = class182_2.getUInt16();
      this.field298 = class182_2.getUInt8();
      this.field296 = class182_2.getUInt8();
      super.field121 = Math.min(super.field121, 4);
      super.field125 = new short[1][64][64];
      super.field123 = new short[super.field121][64][64];
      super.field124 = new byte[super.field121][64][64];
      super.field116 = new byte[super.field121][64][64];
      super.field126 = new class19[super.field121][64][64][];
      i_3 = class182_1.getUInt8();
      if (i_3 != class24.field204.field205) {
        throw new IllegalStateException("");
      } else {
        int i_4 = class182_1.getUInt8();
        int i_5 = class182_1.getUInt8();
        int i_6 = class182_1.getUInt8();
        int i_7 = class182_1.getUInt8();
        if (i_4 == super.field118 && i_5 == super.field119 && i_6 == this.field298
            && i_7 == this.field296) {
          for (int i_8 = 0; i_8 < 8; i_8++) {
            for (int i_9 = 0; i_9 < 8; i_9++) {
              this.method150(i_8 + this.field298 * 8, i_9 + this.field296 * 8, class182_1);
            }
          }

        } else {
          throw new IllegalStateException("");
        }
      }
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1697676286"
  )
  boolean method562(int i_1, int i_2) {
    return i_1 < this.field298 * 8 ? false : (i_2 < this.field296 * 8 ? false
        : (i_1 >= this.field298 * 8 + 8 ? false : i_2 < this.field296 * 8 + 8));
  }

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
  )
  int method584() {
    return this.field299;
  }

  @ObfuscatedName("af")
  @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "-552"
  )
  int method564() {
    return this.field297;
  }

  @ObfuscatedName("ah")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "421563863"
  )
  int method565() {
    return this.field298;
  }

  @ObfuscatedName("ab")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2136604695"
  )
  int method563() {
    return this.field296;
  }

  public boolean equals(Object object_1) {
    if (!(object_1 instanceof class34)) {
      return false;
    } else {
      class34 class34_2 = (class34) object_1;
      return class34_2.field118 == super.field118 && super.field119 == class34_2.field119 ?
          class34_2.field298 == this.field298 && class34_2.field296 == this.field296 : false;
    }
  }

  public int hashCode() {
    return super.field118 | super.field119 << 8 | this.field298 << 16 | this.field296 << 24;
  }

}
