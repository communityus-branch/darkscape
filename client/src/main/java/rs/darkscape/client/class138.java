package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class138 extends class283 {

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field1871;
  @ObfuscatedName("ii")
  @ObfuscatedSignature(
      signature = "Lbu;"
  )
  static class60 field1876;
  @ObfuscatedName("z")
  final boolean field1872;

  public class138(boolean bool_1) {
    this.field1872 = bool_1;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;IB)I",
      garbageValue = "-22"
  )
  public static int method3137(CharSequence charsequence_0, int i_1) {
    return class68.method1693(charsequence_0, i_1, true);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-1072609889"
  )
  int method3128(class287 class287_1, class287 class287_2) {
    return client.field581 == class287_1.field3628 && class287_2.field3628 == client.field581 ? (
        this.field1872 ? class287_1.method5287().method5435(class287_2.method5287())
            : class287_2.method5287().method5435(class287_1.method5287()))
        : this.method5308(class287_1, class287_2);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method3128((class287) object_1, (class287) object_2);
  }

}
