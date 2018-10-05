package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class145 extends class283 {

  @ObfuscatedName("z")
  final boolean field1903;

  public class145(boolean bool_1) {
    this.field1903 = bool_1;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "763302428"
  )
  public static boolean method3188(int i_0) {
    return (i_0 >> 30 & 0x1) != 0;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lkz;Lkz;I)I",
      garbageValue = "2025986991"
  )
  int method3182(class287 class287_1, class287 class287_2) {
    return class287_1.field3628 != 0 && class287_2.field3628 != 0 ? (this.field1903 ? class287_1
        .method5287().method5435(class287_2.method5287())
        : class287_2.method5287().method5435(class287_1.method5287()))
        : this.method5308(class287_1, class287_2);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method3182((class287) object_1, (class287) object_2);
  }

}
