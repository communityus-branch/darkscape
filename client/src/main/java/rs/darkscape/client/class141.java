package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class141 extends class283 {

  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = 325680983
  )
  static int field1885;
  @ObfuscatedName("ku")
  @ObfuscatedSignature(
      signature = "Lhi;"
  )
  static class230 field1888;
  @ObfuscatedName("z")
  final boolean field1886;

  public class141(boolean bool_1) {
    this.field1886 = bool_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-2110971659"
  )
  int method3153(class287 class287_1, class287 class287_2) {
    return class287_1.field3628 != 0 && class287_2.field3628 != 0 ? (this.field1886 ?
        class287_1.field3627 - class287_2.field3627 : class287_2.field3627 - class287_1.field3627)
        : this.method5308(class287_1, class287_2);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method3153((class287) object_1, (class287) object_2);
  }

}
