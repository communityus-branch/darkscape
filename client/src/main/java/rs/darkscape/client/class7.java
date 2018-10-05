package rs.darkscape.client;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
final class class7 implements Comparator {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field42;
  @ObfuscatedName("l")
  static int[] field45;
  @ObfuscatedName("gs")
  @ObfuscatedGetter(
      intValue = -567041405
  )
  static int field41;

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(IS)Z",
      garbageValue = "24612"
  )
  public static boolean method83(int i_0) {
    return (i_0 >> 28 & 0x1) != 0;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ls;Ls;I)I",
      garbageValue = "-657628450"
  )
  int method76(class2 class2_1, class2 class2_2) {
    return class2_1.field20 < class2_2.field20 ? -1
        : (class2_2.field20 == class2_1.field20 ? 0 : 1);
  }

  public boolean equals(Object object_1) {
    return super.equals(object_1);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method76((class2) object_1, (class2) object_2);
  }

}
