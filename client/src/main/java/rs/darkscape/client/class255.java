package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class255 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3237;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "[Lie;"
  )
  public static class255[] field3246;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 238787811
  )
  public static int field3236;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  static class200 field3251 = new class200(256);
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -38826489
  )
  public final int field3238;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -1319997115
  )
  public int field3239 = -1;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -1009560253
  )
  public int field3243 = 0;
  @ObfuscatedName("b")
  public String[] field3244 = new String[5];
  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "Ljd;"
  )
  public class270 field3252;
  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "Lis;"
  )
  public class252 field3253;
  @ObfuscatedName("d")
  @ObfuscatedGetter(
      intValue = 1537771069
  )
  public int field3240;
  @ObfuscatedName("i")
  public String field3241;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 984232407
  )
  public int field3242;
  @ObfuscatedName("n")
  public String field3255;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 437595613
  )
  int field3234 = -1;
  @ObfuscatedName("g")
  @ObfuscatedGetter(
      intValue = 257365583
  )
  int field3247 = Integer.MAX_VALUE;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = -164184983
  )
  int field3235 = Integer.MAX_VALUE;
  @ObfuscatedName("r")
  @ObfuscatedGetter(
      intValue = -571209577
  )
  int field3249 = Integer.MIN_VALUE;
  @ObfuscatedName("t")
  @ObfuscatedGetter(
      intValue = 1516283323
  )
  int field3248 = Integer.MIN_VALUE;
  @ObfuscatedName("f")
  int[] field3245;
  @ObfuscatedName("a")
  int[] field3250;
  @ObfuscatedName("j")
  byte[] field3254;

  public class255(int i_1) {
    this.field3252 = class270.field3479;
    this.field3253 = class252.field3222;
    this.field3240 = -1;
    this.field3238 = i_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "248610403"
  )
  public void method4816(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4817(class182_1, i_2);
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;IS)V",
      garbageValue = "4032"
  )
  void method4817(Buffer class182_1, int i_2) {
    if (i_2 == 1) {
      this.field3239 = class182_1.method3546();
    } else if (i_2 == 2) {
      this.field3234 = class182_1.method3546();
    } else if (i_2 == 3) {
      this.field3241 = class182_1.method3738();
    } else if (i_2 == 4) {
      this.field3242 = class182_1.getUInt24();
    } else if (i_2 == 5) {
      class182_1.getUInt24();
    } else if (i_2 == 6) {
      this.field3243 = class182_1.getUInt8();
    } else {
      int i_3;
      if (i_2 == 7) {
        i_3 = class182_1.getUInt8();
        if ((i_3 & 0x1) == 0) {
        }

        if ((i_3 & 0x2) == 2) {
        }
      } else if (i_2 == 8) {
        class182_1.getUInt8();
      } else if (i_2 >= 10 && i_2 <= 14) {
        this.field3244[i_2 - 10] = class182_1.method3738();
      } else if (i_2 == 15) {
        i_3 = class182_1.getUInt8();
        this.field3245 = new int[i_3 * 2];

        int i_4;
        for (i_4 = 0; i_4 < i_3 * 2; i_4++) {
          this.field3245[i_4] = class182_1.method3551();
        }

        class182_1.getInt32();
        i_4 = class182_1.getUInt8();
        this.field3250 = new int[i_4];

        int i_5;
        for (i_5 = 0; i_5 < this.field3250.length; i_5++) {
          this.field3250[i_5] = class182_1.getInt32();
        }

        this.field3254 = new byte[i_3];

        for (i_5 = 0; i_5 < i_3; i_5++) {
          this.field3254[i_5] = class182_1.getInt8();
        }
      } else if (i_2 != 16) {
        if (i_2 == 17) {
          this.field3255 = class182_1.method3738();
        } else if (i_2 == 18) {
          class182_1.method3546();
        } else if (i_2 == 19) {
          this.field3240 = class182_1.getUInt16();
        } else if (i_2 == 21) {
          class182_1.getInt32();
        } else if (i_2 == 22) {
          class182_1.getInt32();
        } else if (i_2 == 23) {
          class182_1.getUInt8();
          class182_1.getUInt8();
          class182_1.getUInt8();
        } else if (i_2 == 24) {
          class182_1.method3551();
          class182_1.method3551();
        } else if (i_2 == 25) {
          class182_1.method3546();
        } else if (i_2 == 28) {
          class182_1.getUInt8();
        } else if (i_2 == 29) {
          class270[] arr_6 = new class270[]{class270.field3479, class270.field3484,
              class270.field3481};
          this.field3252 = (class270) class76.method1803(arr_6, class182_1.getUInt8());
        } else if (i_2 == 30) {
          class252[] arr_7 = new class252[]{class252.field3221, class252.field3222,
              class252.field3224};
          this.field3253 = (class252) class76.method1803(arr_7, class182_1.getUInt8());
        }
      }
    }

  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1083458707"
  )
  public void method4828() {
    if (this.field3245 != null) {
      for (int i_1 = 0; i_1 < this.field3245.length; i_1 += 2) {
        if (this.field3245[i_1] < this.field3247) {
          this.field3247 = this.field3245[i_1];
        } else if (this.field3245[i_1] > this.field3249) {
          this.field3249 = this.field3245[i_1];
        }

        if (this.field3245[i_1 + 1] < this.field3235) {
          this.field3235 = this.field3245[i_1 + 1];
        } else if (this.field3245[i_1 + 1] > this.field3248) {
          this.field3248 = this.field3245[i_1 + 1];
        }
      }
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(ZB)Lll;",
      garbageValue = "-62"
  )
  public class318 method4815(boolean bool_1) {
    int i_2 = this.field3239;
    return this.method4820(i_2);
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(II)Lll;",
      garbageValue = "-1422561199"
  )
  class318 method4820(int i_1) {
    if (i_1 < 0) {
      return null;
    } else {
      class318 class318_2 = (class318) field3251.method3989((long) i_1);
      if (class318_2 != null) {
        return class318_2;
      } else {
        class318_2 = class229.method4499(field3237, i_1, 0);
        if (class318_2 != null) {
          field3251.method3983(class318_2, (long) i_1);
        }

        return class318_2;
      }
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-51"
  )
  public int method4821() {
    return this.field3238;
  }

}
