package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class18 implements class31 {

  @ObfuscatedName("aq")
  protected static boolean field146;
  @ObfuscatedName("d")
  static String field143;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 1991100519
  )
  int field137;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -1519554033
  )
  int field148;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -1074920077
  )
  int field138;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -1335404787
  )
  int field139;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 150706285
  )
  int field140;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 620984285
  )
  int field141;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 1655913713
  )
  int field142;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 568773153
  )
  int field136;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 1297358037
  )
  int field144;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -910953089
  )
  int field145;

  @ObfuscatedName("el")
  @ObfuscatedSignature(
      signature = "(I)Llw;",
      garbageValue = "-948375195"
  )
  static class321 method196() {
    return class53.field476;
  }

  @ObfuscatedName("ij")
  @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "1298964684"
  )
  static String method176(int i_0) {
    return i_0 < 0 ? ""
        : (client.field740[i_0].length() > 0 ? client.field735[i_0] + " " + client.field740[i_0]
            : client.field735[i_0]);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(La;B)V",
      garbageValue = "-105"
  )
  public void vmethod635(class20 class20_1) {
    if (class20_1.field166 > this.field142) {
      class20_1.field166 = this.field142;
    }

    if (class20_1.field167 < this.field144) {
      class20_1.field167 = this.field144;
    }

    if (class20_1.field168 > this.field136) {
      class20_1.field168 = this.field136;
    }

    if (class20_1.field162 < this.field145) {
      class20_1.field162 = this.field145;
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "2090621319"
  )
  public boolean vmethod636(int i_1, int i_2, int i_3) {
    return i_1 >= this.field137 && i_1 < this.field137 + this.field148 ? i_2 >> 6 >= this.field138
        && i_2 >> 6 <= this.field140 && i_3 >> 6 >= this.field139 && i_3 >> 6 <= this.field141
        : false;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-658565537"
  )
  public boolean vmethod637(int i_1, int i_2) {
    return i_1 >> 6 >= this.field142 && i_1 >> 6 <= this.field144 && i_2 >> 6 >= this.field136
        && i_2 >> 6 <= this.field145;
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
      int[] ints_4 = new int[]{this.field142 * 64 - this.field138 * 64 + i_2,
          i_3 + (this.field136 * 64 - this.field139 * 64)};
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
      int i_3 = this.field138 * 64 - this.field142 * 64 + i_1;
      int i_4 = this.field139 * 64 - this.field136 * 64 + i_2;
      return new class226(this.field137, i_3, i_4);
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-40"
  )
  public void vmethod639(Buffer class182_1) {
    this.field137 = class182_1.getUInt8();
    this.field148 = class182_1.getUInt8();
    this.field138 = class182_1.getUInt16();
    this.field139 = class182_1.getUInt16();
    this.field140 = class182_1.getUInt16();
    this.field141 = class182_1.getUInt16();
    this.field142 = class182_1.getUInt16();
    this.field136 = class182_1.getUInt16();
    this.field144 = class182_1.getUInt16();
    this.field145 = class182_1.getUInt16();
    this.method179();
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-76"
  )
  void method179() {
  }

}
