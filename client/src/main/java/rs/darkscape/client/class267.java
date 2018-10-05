package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public class class267 extends SubNode {

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3349 = new class200(64);
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3356 = new class200(64);
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3351 = new class200(20);
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  static AbstractPack field3367;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  static AbstractPack field3348;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = 876302883
  )
  public int field3364 = 16777215;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = -936204619
  )
  public int field3355 = 70;
  @ObfuscatedName("o")
  @ObfuscatedGetter(
      intValue = -2143237969
  )
  public int field3365 = 0;
  @ObfuscatedName("y")
  @ObfuscatedGetter(
      intValue = 161849281
  )
  public int field3361 = 0;
  @ObfuscatedName("a")
  @ObfuscatedGetter(
      intValue = -86534117
  )
  public int field3354 = -1;
  @ObfuscatedName("d")
  @ObfuscatedGetter(
      intValue = 988347075
  )
  public int field3360 = -1;
  @ObfuscatedName("h")
  @ObfuscatedGetter(
      intValue = -203018777
  )
  public int field3347 = 0;
  @ObfuscatedName("c")
  public int[] field3366;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = 1731359987
  )
  int field3353 = -1;
  @ObfuscatedName("g")
  @ObfuscatedGetter(
      intValue = 953756281
  )
  int field3358 = -1;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = -1421911827
  )
  int field3357 = -1;
  @ObfuscatedName("r")
  @ObfuscatedGetter(
      intValue = -1039819635
  )
  int field3350 = -1;
  @ObfuscatedName("t")
  @ObfuscatedGetter(
      intValue = 1076964871
  )
  int field3359 = -1;
  @ObfuscatedName("j")
  String field3363 = "";
  @ObfuscatedName("v")
  @ObfuscatedGetter(
      intValue = 738164645
  )
  int field3362 = -1;
  @ObfuscatedName("af")
  @ObfuscatedGetter(
      intValue = 606288513
  )
  int field3368 = -1;

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-40"
  )
  void method4990(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4991(class182_1, i_2);
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "67"
  )
  void method4991(Buffer class182_1, int i_2) {
    if (i_2 == 1) {
      this.field3353 = class182_1.method3546();
    } else if (i_2 == 2) {
      this.field3364 = class182_1.getUInt24();
    } else if (i_2 == 3) {
      this.field3358 = class182_1.method3546();
    } else if (i_2 == 4) {
      this.field3350 = class182_1.method3546();
    } else if (i_2 == 5) {
      this.field3357 = class182_1.method3546();
    } else if (i_2 == 6) {
      this.field3359 = class182_1.method3546();
    } else if (i_2 == 7) {
      this.field3365 = class182_1.method3551();
    } else if (i_2 == 8) {
      this.field3363 = class182_1.method3558();
    } else if (i_2 == 9) {
      this.field3355 = class182_1.getUInt16();
    } else if (i_2 == 10) {
      this.field3361 = class182_1.method3551();
    } else if (i_2 == 11) {
      this.field3354 = 0;
    } else if (i_2 == 12) {
      this.field3360 = class182_1.getUInt8();
    } else if (i_2 == 13) {
      this.field3347 = class182_1.method3551();
    } else if (i_2 == 14) {
      this.field3354 = class182_1.getUInt16();
    } else if (i_2 == 17 || i_2 == 18) {
      this.field3362 = class182_1.getUInt16();
      if (this.field3362 == 65535) {
        this.field3362 = -1;
      }

      this.field3368 = class182_1.getUInt16();
      if (this.field3368 == 65535) {
        this.field3368 = -1;
      }

      int i_3 = -1;
      if (i_2 == 18) {
        i_3 = class182_1.getUInt16();
        if (i_3 == 65535) {
          i_3 = -1;
        }
      }

      int i_4 = class182_1.getUInt8();
      this.field3366 = new int[i_4 + 2];

      for (int i_5 = 0; i_5 <= i_4; i_5++) {
        this.field3366[i_5] = class182_1.getUInt16();
        if (this.field3366[i_5] == 65535) {
          this.field3366[i_5] = -1;
        }
      }

      this.field3366[i_4 + 1] = i_3;
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)Ljp;",
      garbageValue = "-1562489008"
  )
  public final class267 method4995() {
    int i_1 = -1;
    if (this.field3362 != -1) {
      i_1 = Temp.method3389(this.field3362);
    } else if (this.field3368 != -1) {
      i_1 = class225.field2558[this.field3368];
    }

    int i_2;
    if (i_1 >= 0 && i_1 < this.field3366.length - 1) {
      i_2 = this.field3366[i_1];
    } else {
      i_2 = this.field3366[this.field3366.length - 1];
    }

    return i_2 != -1 ? class14.method123(i_2) : null;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-99"
  )
  public String method5014(int i_1) {
    String string_2 = this.field3363;

    while (true) {
      int i_3 = string_2.indexOf("%1");
      if (i_3 < 0) {
        return string_2;
      }

      String string_4 = string_2.substring(0, i_3);
      String string_5 = Integer.toString(i_1);
      string_2 = string_4 + string_5 + string_2.substring(i_3 + 2);
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "2147112407"
  )
  public class318 method4994() {
    if (this.field3358 < 0) {
      return null;
    } else {
      class318 class318_1 = (class318) field3356.method3989((long) this.field3358);
      if (class318_1 != null) {
        return class318_1;
      } else {
        class318_1 = class229.method4499(field3348, this.field3358, 0);
        if (class318_1 != null) {
          field3356.method3983(class318_1, (long) this.field3358);
        }

        return class318_1;
      }
    }
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "1102937480"
  )
  public class318 method5000() {
    if (this.field3357 < 0) {
      return null;
    } else {
      class318 class318_1 = (class318) field3356.method3989((long) this.field3357);
      if (class318_1 != null) {
        return class318_1;
      } else {
        class318_1 = class229.method4499(field3348, this.field3357, 0);
        if (class318_1 != null) {
          field3356.method3983(class318_1, (long) this.field3357);
        }

        return class318_1;
      }
    }
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(B)Lll;",
      garbageValue = "96"
  )
  public class318 method4996() {
    if (this.field3350 < 0) {
      return null;
    } else {
      class318 class318_1 = (class318) field3356.method3989((long) this.field3350);
      if (class318_1 != null) {
        return class318_1;
      } else {
        class318_1 = class229.method4499(field3348, this.field3350, 0);
        if (class318_1 != null) {
          field3356.method3983(class318_1, (long) this.field3350);
        }

        return class318_1;
      }
    }
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(I)Lll;",
      garbageValue = "720850716"
  )
  public class318 method4997() {
    if (this.field3359 < 0) {
      return null;
    } else {
      class318 class318_1 = (class318) field3356.method3989((long) this.field3359);
      if (class318_1 != null) {
        return class318_1;
      } else {
        class318_1 = class229.method4499(field3348, this.field3359, 0);
        if (class318_1 != null) {
          field3356.method3983(class318_1, (long) this.field3359);
        }

        return class318_1;
      }
    }
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(B)Lkj;",
      garbageValue = "1"
  )
  public class298 method4998() {
    if (this.field3353 == -1) {
      return null;
    } else {
      class298 class298_1 = (class298) field3351.method3989((long) this.field3353);
      if (class298_1 != null) {
        return class298_1;
      } else {
        class298_1 = class58.method1058(field3348, class139.field1877, this.field3353, 0);
        if (class298_1 != null) {
          field3351.method3983(class298_1, (long) this.field3353);
        }

        return class298_1;
      }
    }
  }

}
