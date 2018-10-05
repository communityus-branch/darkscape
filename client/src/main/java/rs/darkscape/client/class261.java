package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public class class261 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3304;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3305 = new class200(64);
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3306 = new class200(64);
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  static AbstractPack field3314;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1290574683
  )
  public int field3317;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 293385999
  )
  public int field3310 = 255;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 497866573
  )
  public int field3307 = 255;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -1257044637
  )
  public int field3312 = -1;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = 1902915669
  )
  public int field3308 = 1;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -1500429693
  )
  public int field3313 = 70;
  @ObfuscatedName("g")
  @ObfuscatedGetter(
      intValue = 555187831
  )
  public int field3311 = 30;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = -835956497
  )
  public int field3318 = 0;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = 1619382661
  )
  int field3315 = -1;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = -1784458549
  )
  int field3316 = -1;

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "97"
  )
  public static boolean method4931(int i_0) {
    if (class175.field2271[i_0]) {
      return true;
    } else if (!class230.field2729.method4707(i_0)) {
      return false;
    } else {
      int i_1 = class230.field2729.method4636(i_0);
      if (i_1 == 0) {
        class175.field2271[i_0] = true;
        return true;
      } else {
        if (class42.field366[i_0] == null) {
          class42.field366[i_0] = new class230[i_1];
        }

        for (int i_2 = 0; i_2 < i_1; i_2++) {
          if (class42.field366[i_0][i_2] == null) {
            byte[] bytes_3 = class230.field2729.method4625(i_0, i_2);
            if (bytes_3 != null) {
              class42.field366[i_0][i_2] = new class230();
              class42.field366[i_0][i_2].field2691 = i_2 + (i_0 << 16);
              if (bytes_3[0] == -1) {
                class42.field366[i_0][i_2].method4532(new Buffer(bytes_3));
              } else {
                class42.field366[i_0][i_2].method4549(new Buffer(bytes_3));
              }
            }
          }
        }

        class175.field2271[i_0] = true;
        return true;
      }
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "2067333055"
  )
  public void method4915(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4916(class182_1, i_2);
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-2130142641"
  )
  void method4916(Buffer class182_1, int i_2) {
    if (i_2 == 1) {
      class182_1.getUInt16();
    } else if (i_2 == 2) {
      this.field3310 = class182_1.getUInt8();
    } else if (i_2 == 3) {
      this.field3307 = class182_1.getUInt8();
    } else if (i_2 == 4) {
      this.field3312 = 0;
    } else if (i_2 == 5) {
      this.field3313 = class182_1.getUInt16();
    } else if (i_2 == 6) {
      class182_1.getUInt8();
    } else if (i_2 == 7) {
      this.field3315 = class182_1.method3546();
    } else if (i_2 == 8) {
      this.field3316 = class182_1.method3546();
    } else if (i_2 == 11) {
      this.field3312 = class182_1.getUInt16();
    } else if (i_2 == 14) {
      this.field3311 = class182_1.getUInt8();
    } else if (i_2 == 15) {
      this.field3318 = class182_1.getUInt8();
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "-1987129787"
  )
  public class318 method4917() {
    if (this.field3315 < 0) {
      return null;
    } else {
      class318 class318_1 = (class318) field3306.method3989((long) this.field3315);
      if (class318_1 != null) {
        return class318_1;
      } else {
        class318_1 = class229.method4499(field3314, this.field3315, 0);
        if (class318_1 != null) {
          field3306.method3983(class318_1, (long) this.field3315);
        }

        return class318_1;
      }
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "879523324"
  )
  public class318 method4918() {
    if (this.field3316 < 0) {
      return null;
    } else {
      class318 class318_1 = (class318) field3306.method3989((long) this.field3316);
      if (class318_1 != null) {
        return class318_1;
      } else {
        class318_1 = class229.method4499(field3314, this.field3316, 0);
        if (class318_1 != null) {
          field3306.method3983(class318_1, (long) this.field3316);
        }

        return class318_1;
      }
    }
  }

}
