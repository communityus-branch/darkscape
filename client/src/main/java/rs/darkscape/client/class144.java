package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class144 extends class283 {

  @ObfuscatedName("z")
  final boolean field1902;

  public class144(boolean bool_1) {
    this.field1902 = bool_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;Lir;B)V",
      garbageValue = "15"
  )
  public static void method3181(AbstractPack class247_0, AbstractPack class247_1) {
    class261.field3304 = class247_0;
    class261.field3314 = class247_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lkz;Lkz;B)I",
      garbageValue = "66"
  )
  int method3175(class287 class287_1, class287 class287_2) {
    return class287_2.field3629 != class287_1.field3629 ? (this.field1902 ? class287_1.field3629
        - class287_2.field3629 : class287_2.field3629 - class287_1.field3629)
        : this.method5308(class287_1, class287_2);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method3175((class287) object_1, (class287) object_2);
  }

}
