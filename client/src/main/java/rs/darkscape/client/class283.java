package rs.darkscape.client;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
public abstract class class283 implements Comparator {

  @ObfuscatedName("w")
  Comparator field3613;

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;I)V",
      garbageValue = "726846986"
  )
  final void method5307(Comparator comparator_1) {
    if (this.field3613 == null) {
      this.field3613 = comparator_1;
    } else if (this.field3613 instanceof class283) {
      ((class283) this.field3613).method5307(comparator_1);
    }

  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(Ljx;Ljx;I)I",
      garbageValue = "-366074461"
  )
  protected final int method5308(class282 class282_1, class282 class282_2) {
    return this.field3613 == null ? 0 : this.field3613.compare(class282_1, class282_2);
  }

  public boolean equals(Object object_1) {
    return super.equals(object_1);
  }

}
