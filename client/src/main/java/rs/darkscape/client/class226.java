package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class226 {

  @ObfuscatedName("fj")
  @ObfuscatedGetter(
      intValue = 1986316761
  )
  static int field2568;
  @ObfuscatedName("gi")
  @ObfuscatedGetter(
      intValue = -1575232807
  )
  static int field2563;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 208134387
  )
  public int field2567;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 44298731
  )
  public int field2564;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -187382705
  )
  public int field2565;

  @ObfuscatedSignature(
      signature = "(Lha;)V"
  )
  public class226(class226 class226_1) {
    this.field2567 = class226_1.field2567;
    this.field2564 = class226_1.field2564;
    this.field2565 = class226_1.field2565;
  }

  public class226(int i_1, int i_2, int i_3) {
    this.field2567 = i_1;
    this.field2564 = i_2;
    this.field2565 = i_3;
  }

  public class226() {
    this.field2567 = -1;
  }

  public class226(int i_1) {
    if (i_1 == -1) {
      this.field2567 = -1;
    } else {
      this.field2567 = i_1 >> 28 & 0x3;
      this.field2564 = i_1 >> 14 & 0x3fff;
      this.field2565 = i_1 & 0x3fff;
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-2113986105"
  )
  public void method4436(int i_1, int i_2, int i_3) {
    this.field2567 = i_1;
    this.field2564 = i_2;
    this.field2565 = i_3;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1904396734"
  )
  public int method4437() {
    return this.field2567 << 28 | this.field2564 << 14 | this.field2565;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lha;I)Z",
      garbageValue = "-1097701365"
  )
  boolean method4439(class226 class226_1) {
    return this.field2567 != class226_1.field2567 ? false
        : (this.field2564 != class226_1.field2564 ? false : this.field2565 == class226_1.field2565);
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1171766630"
  )
  String method4441(String string_1) {
    return this.field2567 + string_1 + (this.field2564 >> 6) + string_1 + (this.field2565 >> 6)
        + string_1 + (this.field2564 & 0x3f) + string_1 + (this.field2565 & 0x3f);
  }

  public int hashCode() {
    return this.method4437();
  }

  public String toString() {
    return this.method4441(",");
  }

  public boolean equals(Object object_1) {
    return this == object_1 ? true
        : (!(object_1 instanceof class226) ? false : this.method4439((class226) object_1));
  }

}
