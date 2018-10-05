package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class52 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  final class249 field469;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 2021923253
  )
  final int field468;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 2092559043
  )
  int field467 = 0;

  @ObfuscatedSignature(
      signature = "(Lic;Ljava/lang/String;)V"
  )
  class52(class249 class249_1, String string_2) {
    this.field469 = class249_1;
    this.field468 = class249_1.method4637();
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "1142628793"
  )
  public static boolean method1002(char var_0) {
    return var_0 >= 32 && var_0 <= 126 ? true : (var_0 >= 160 && var_0 <= 255 ? true
        : var_0 == 8364 || var_0 == 338 || var_0 == 8212 || var_0 == 339 || var_0 == 376);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1326289978"
  )
  boolean method1000() {
    this.field467 = 0;

    for (int i_1 = 0; i_1 < this.field468; i_1++) {
      if (!this.field469.method4734(i_1) || this.field469.method4725(i_1)) {
        ++this.field467;
      }
    }

    return this.field467 >= this.field468;
  }

}
