package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class140 extends class283 {

  @ObfuscatedName("z")
  final boolean field1883;

  public class140(boolean bool_1) {
    this.field1883 = bool_1;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-1"
  )
  public static boolean method3150(int i_0) {
    return (i_0 >> 29 & 0x1) != 0;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "-359404132"
  )
  int method3147(class287 class287_1, class287 class287_2) {
    return client.field581 == class287_1.field3628 && class287_2.field3628 == client.field581 ? (
        this.field1883 ? class287_1.field3627 - class287_2.field3627
            : class287_2.field3627 - class287_1.field3627)
        : this.method5308(class287_1, class287_2);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method3147((class287) object_1, (class287) object_2);
  }

}
