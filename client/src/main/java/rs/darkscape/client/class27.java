package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class27 implements class31 {

  @ObfuscatedName("ql")
  @ObfuscatedSignature(
      signature = "Llg;"
  )
  static ComputerInformation field228;
  @ObfuscatedName("rq")
  static short[] field231;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = -1816385673
  )
  static int field230;
  @ObfuscatedName("ed")
  @ObfuscatedGetter(
      intValue = 1306481991
  )
  static int field224;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 538244709
  )
  int field226;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -169692371
  )
  int field225;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 1674803295
  )
  int field234;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -560747201
  )
  int field227;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -499712717
  )
  int field233;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 1093650467
  )
  int field229;

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "60"
  )
  public static int method435(int i_0) {
    return BufferedFile.method2484(class120.field1647[i_0]);
  }

  @ObfuscatedName("gl")
  @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "585185755"
  )
  static final int method460(int i_0, int i_1, int i_2) {
    int i_3 = i_0 >> 7;
    int i_4 = i_1 >> 7;
    if (i_3 >= 0 && i_4 >= 0 && i_3 <= 103 && i_4 <= 103) {
      int i_5 = i_2;
      if (i_2 < 3 && (class50.field443[1][i_3][i_4] & 0x2) == 2) {
        i_5 = i_2 + 1;
      }

      int i_6 = i_0 & 0x7f;
      int i_7 = i_1 & 0x7f;
      int i_8 =
          (128 - i_6) * class50.field459[i_5][i_3][i_4] + i_6 * class50.field459[i_5][i_3 + 1][i_4]
              >> 7;
      int i_9 =
          i_6 * class50.field459[i_5][i_3 + 1][i_4 + 1] + class50.field459[i_5][i_3][i_4 + 1] * (128
              - i_6) >> 7;
      return i_9 * i_7 + i_8 * (128 - i_7) >> 7;
    } else {
      return 0;
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(La;B)V",
      garbageValue = "-105"
  )
  public void vmethod635(class20 class20_1) {
    if (class20_1.field166 > this.field233) {
      class20_1.field166 = this.field233;
    }

    if (class20_1.field167 < this.field233) {
      class20_1.field167 = this.field233;
    }

    if (class20_1.field168 > this.field229) {
      class20_1.field168 = this.field229;
    }

    if (class20_1.field162 < this.field229) {
      class20_1.field162 = this.field229;
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "2090621319"
  )
  public boolean vmethod636(int i_1, int i_2, int i_3) {
    return i_1 >= this.field226 && i_1 < this.field226 + this.field225 ? i_2 >> 6 == this.field234
        && i_3 >> 6 == this.field227 : false;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-658565537"
  )
  public boolean vmethod637(int i_1, int i_2) {
    return i_1 >> 6 == this.field233 && i_2 >> 6 == this.field229;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "56"
  )
  public int[] vmethod638(int i_1, int i_2, int i_3) {
    if (!this.vmethod636(i_1, i_2, i_3)) {
      return null;
    } else {
      int[] ints_4 = new int[]{this.field233 * 64 - this.field234 * 64 + i_2,
          i_3 + (this.field229 * 64 - this.field227 * 64)};
      return ints_4;
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(III)Lha;",
      garbageValue = "2128900046"
  )
  public class226 vmethod659(int i_1, int i_2) {
    if (!this.vmethod637(i_1, i_2)) {
      return null;
    } else {
      int i_3 = this.field234 * 64 - this.field233 * 64 + i_1;
      int i_4 = this.field227 * 64 - this.field229 * 64 + i_2;
      return new class226(this.field226, i_3, i_4);
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-40"
  )
  public void vmethod639(Buffer class182_1) {
    this.field226 = class182_1.getUInt8();
    this.field225 = class182_1.getUInt8();
    this.field234 = class182_1.getUInt16();
    this.field227 = class182_1.getUInt16();
    this.field233 = class182_1.getUInt16();
    this.field229 = class182_1.getUInt16();
    this.method442();
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "23"
  )
  void method442() {
  }

}
