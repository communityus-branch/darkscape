package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class292 extends class287 {

  @ObfuscatedName("z")
  boolean field3648;
  @ObfuscatedName("w")
  boolean field3650;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lkt;I)I",
      garbageValue = "1391171788"
  )
  int method5452(class292 class292_1) {
    return super.field3628 == client.field581 && client.field581 != class292_1.field3628 ? -1
        : (client.field581 == class292_1.field3628 && super.field3628 != client.field581 ? 1
            : (super.field3628 != 0 && class292_1.field3628 == 0 ? -1
                : (class292_1.field3628 != 0 && super.field3628 == 0 ? 1
                    : (this.field3648 && !class292_1.field3648 ? -1
                        : (!this.field3648 && class292_1.field3648 ? 1
                            : (this.field3650 && !class292_1.field3650 ? -1
                                : (!this.field3650 && class292_1.field3650 ? 1
                                    : (super.field3628 != 0 ? super.field3627 - class292_1.field3627
                                        : class292_1.field3627 - super.field3627))))))));
  }

  @ObfuscatedName("an")
  @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "97"
  )
  public int vmethod5453(class282 class282_1) {
    return this.method5452((class292) class282_1);
  }

  public int compareTo(Object object_1) {
    return this.method5452((class292) object_1);
  }

}
