package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class86 {

  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 1175004073
  )
  public static int field1212;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "[Lbh;"
  )
  class58[] field1209 = new class58[100];
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 177761561
  )
  int field1210;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIIIIIB)I",
      garbageValue = "-1"
  )
  public static int method1970(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
    if ((i_5 & 0x1) == 1) {
      int i_6 = i_3;
      i_3 = i_4;
      i_4 = i_6;
    }

    i_2 &= 0x3;
    return i_2 == 0 ? i_1
        : (i_2 == 1 ? 7 - i_0 - (i_3 - 1) : (i_2 == 2 ? 7 - i_1 - (i_4 - 1) : i_0));
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbh;",
      garbageValue = "55"
  )
  class58 method1964(int i_1, String string_2, String string_3, String string_4) {
    class58 class58_5 = this.field1209[99];

    for (int i_6 = this.field1210; i_6 > 0; --i_6) {
      if (i_6 != 100) {
        this.field1209[i_6] = this.field1209[i_6 - 1];
      }
    }

    if (class58_5 == null) {
      class58_5 = new class58(i_1, string_2, string_4, string_3);
    } else {
      class58_5.unlinkNode();
      class58_5.unlinkSubNode();
      class58_5.method1070(i_1, string_2, string_4, string_3);
    }

    this.field1209[0] = class58_5;
    if (this.field1210 < 100) {
      ++this.field1210;
    }

    return class58_5;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)Lbh;",
      garbageValue = "78"
  )
  class58 method1965(int i_1) {
    return i_1 >= 0 && i_1 < this.field1210 ? this.field1209[i_1] : null;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "8454016"
  )
  int method1976() {
    return this.field1210;
  }

}
