package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public enum class270 implements class188 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Ljd;"
  )
  field3484(1, 0),
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Ljd;"
  )
  field3479(0, 1),
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Ljd;"
  )
  field3481(2, 2);

  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 1528745209
  )
  public final int field3482;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 1338680937
  )
  final int field3483;

  class270(int i_3, int i_4) {
    this.field3482 = i_3;
    this.field3483 = i_4;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)Ljq;",
      garbageValue = "1922127141"
  )
  public static class271 method5157(int i_0) {
    class271 class271_1 = (class271) class271.field3488.method3989((long) i_0);
    if (class271_1 != null) {
      return class271_1;
    } else {
      byte[] bytes_2 = class271.field3490.method4625(9, i_0);
      class271_1 = new class271();
      class271_1.field3510 = i_0;
      if (bytes_2 != null) {
        class271_1.method5186(new Buffer(bytes_2));
      }

      class271_1.method5159();
      class271.field3488.method3983(class271_1, (long) i_0);
      return class271_1;
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZZI)V",
      garbageValue = "-1107846037"
  )
  public static void method5156(String string_0, boolean bool_1, boolean bool_2) {
    class58.method1053(string_0, bool_1, "openjs", bool_2);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
  )
  public int vmethod5815() {
    return this.field3483;
  }

}
