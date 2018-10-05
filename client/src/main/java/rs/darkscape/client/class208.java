package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public class class208 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lhk;"
  )
  class209 field2431 = new class209();
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lhk;"
  )
  class209 field2430;

  public class208() {
    this.field2431.field2432 = this.field2431;
    this.field2431.field2433 = this.field2431;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lhk;)V"
  )
  public void method4112(class209 class209_1) {
    if (class209_1.field2433 != null) {
      class209_1.method4121();
    }

    class209_1.field2433 = this.field2431.field2433;
    class209_1.field2432 = this.field2431;
    class209_1.field2433.field2432 = class209_1;
    class209_1.field2432.field2433 = class209_1;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "()Lhk;"
  )
  public class209 method4111() {
    class209 class209_1 = this.field2431.field2432;
    if (class209_1 == this.field2431) {
      this.field2430 = null;
      return null;
    } else {
      this.field2430 = class209_1.field2432;
      return class209_1;
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "()Lhk;"
  )
  public class209 method4114() {
    class209 class209_1 = this.field2430;
    if (class209_1 == this.field2431) {
      this.field2430 = null;
      return null;
    } else {
      this.field2430 = class209_1.field2432;
      return class209_1;
    }
  }

}
