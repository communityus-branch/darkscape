package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
public final class class72 extends class63 {

  @ObfuscatedName("op")
  @ObfuscatedSignature(
      signature = "Lll;"
  )
  static class318 field1038;
  @ObfuscatedName("pz")
  @ObfuscatedGetter(
      intValue = -856093161
  )
  static int field1033;
  @ObfuscatedName("b")
  static int[] field1035;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Ljq;"
  )
  class271 field1037;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IBB)V",
      garbageValue = "70"
  )
  final void method1794(int i_1, byte b_2) {
    int i_3 = super.field922[0];
    int i_4 = super.field872[0];
    if (i_1 == 0) {
      --i_3;
      ++i_4;
    }

    if (i_1 == 1) {
      ++i_4;
    }

    if (i_1 == 2) {
      ++i_3;
      ++i_4;
    }

    if (i_1 == 3) {
      --i_3;
    }

    if (i_1 == 4) {
      ++i_3;
    }

    if (i_1 == 5) {
      --i_3;
      --i_4;
    }

    if (i_1 == 6) {
      --i_4;
    }

    if (i_1 == 7) {
      ++i_3;
      --i_4;
    }

    if (super.field903 != -1 && class3.method25(super.field903).field3535 == 1) {
      super.field903 = -1;
    }

    if (super.field909 < 9) {
      ++super.field909;
    }

    for (int i_5 = super.field909; i_5 > 0; --i_5) {
      super.field922[i_5] = super.field922[i_5 - 1];
      super.field872[i_5] = super.field872[i_5 - 1];
      super.field928[i_5] = super.field928[i_5 - 1];
    }

    super.field922[0] = i_3;
    super.field872[0] = i_4;
    super.field928[0] = b_2;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "1896882090"
  )
  final void method1788(int i_1, int i_2, boolean bool_3) {
    if (super.field903 != -1 && class3.method25(super.field903).field3535 == 1) {
      super.field903 = -1;
    }

    if (!bool_3) {
      int i_4 = i_1 - super.field922[0];
      int i_5 = i_2 - super.field872[0];
      if (i_4 >= -8 && i_4 <= 8 && i_5 >= -8 && i_5 <= 8) {
        if (super.field909 < 9) {
          ++super.field909;
        }

        for (int i_6 = super.field909; i_6 > 0; --i_6) {
          super.field922[i_6] = super.field922[i_6 - 1];
          super.field872[i_6] = super.field872[i_6 - 1];
          super.field928[i_6] = super.field928[i_6 - 1];
        }

        super.field922[0] = i_1;
        super.field872[0] = i_2;
        super.field928[0] = 1;
        return;
      }
    }

    super.field909 = 0;
    super.field930 = 0;
    super.field923 = 0;
    super.field922[0] = i_1;
    super.field872[0] = i_2;
    super.field931 = super.field874 * 64 + super.field922[0] * 128;
    super.field881 = super.field874 * 64 + super.field872[0] * 128;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
  )
  protected final class119 vmethod3067() {
    if (this.field1037 == null) {
      return null;
    } else {
      class273 class273_1 =
          super.field903 != -1 && super.field906 == 0 ? class3.method25(super.field903) : null;
      class273 class273_2 =
          super.field900 != -1 && (super.field900 != super.field893 || class273_1 == null) ? class3
              .method25(super.field900) : null;
      class119 class119_3 = this.field1037
          .method5162(class273_1, super.field904, class273_2, super.field908);
      if (class119_3 == null) {
        return null;
      } else {
        class119_3.method2670();
        super.field925 = class119_3.field1781;
        if (super.field891 != -1 && super.field876 != -1) {
          class119 class119_4 = class57.method1035(super.field891).method4866(super.field876);
          if (class119_4 != null) {
            class119_4.method2718(0, -super.field871, 0);
            class119[] arr_5 = new class119[]{class119_3, class119_4};
            class119_3 = new class119(arr_5, 2);
          }
        }

        if (this.field1037.field3497 == 1) {
          class119_3.field1603 = true;
        }

        return class119_3;
      }
    }
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "5"
  )
  final boolean vmethod1786() {
    return this.field1037 != null;
  }

}
