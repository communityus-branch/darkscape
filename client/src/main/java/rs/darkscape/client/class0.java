package rs.darkscape.client;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
final class class0 implements Comparator {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field2;
  @ObfuscatedName("jx")
  @ObfuscatedGetter(
      intValue = 469420815
  )
  static int field1;

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1721619760"
  )
  public static void method7() {
    class23.field188.method3999(5);
    class23.field189.method3999(5);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ls;Ls;I)I",
      garbageValue = "-1267869339"
  )
  int method1(class2 class2_1, class2 class2_2) {
    return class2_1.field19 < class2_2.field19 ? -1
        : (class2_2.field19 == class2_1.field19 ? 0 : 1);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method1((class2) object_1, (class2) object_2);
  }

  public boolean equals(Object object_1) {
    return super.equals(object_1);
  }

}
