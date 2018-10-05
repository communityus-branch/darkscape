package rs.darkscape.client;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class308 implements Comparator {

  @ObfuscatedName("z")
  final boolean field3738;

  public class308(boolean bool_1) {
    this.field3738 = bool_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljx;Ljx;B)I",
      garbageValue = "-98"
  )
  int method5664(class282 class282_1, class282 class282_2) {
    return this.field3738 ? class282_1.vmethod5453(class282_2) : class282_2.vmethod5453(class282_1);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method5664((class282) object_1, (class282) object_2);
  }

  public boolean equals(Object object_1) {
    return super.equals(object_1);
  }

}
