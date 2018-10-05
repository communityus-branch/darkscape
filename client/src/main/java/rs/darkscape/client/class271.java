package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class271 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3490;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3487;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3488 = new class200(64);
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3489 = new class200(50);
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 791272887
  )
  public int field3510;
  @ObfuscatedName("q")
  public String field3491 = "null";
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -254804359
  )
  public int field3497 = 1;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 1114292373
  )
  public int field3519 = -1;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = 1340441257
  )
  public int field3496 = -1;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -1278546655
  )
  public int field3486 = -1;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = -549599927
  )
  public int field3498 = -1;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = 1839913521
  )
  public int field3495 = -1;
  @ObfuscatedName("g")
  @ObfuscatedGetter(
      intValue = -420302217
  )
  public int field3502 = -1;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = 116081011
  )
  public int field3501 = -1;
  @ObfuscatedName("a")
  public String[] field3506 = new String[5];
  @ObfuscatedName("j")
  public boolean field3507 = true;
  @ObfuscatedName("d")
  @ObfuscatedGetter(
      intValue = -152867383
  )
  public int field3508 = -1;
  @ObfuscatedName("v")
  public boolean field3511 = false;
  @ObfuscatedName("ab")
  @ObfuscatedGetter(
      intValue = -543090749
  )
  public int field3494 = -1;
  @ObfuscatedName("aw")
  @ObfuscatedGetter(
      intValue = -1117793583
  )
  public int field3500 = 32;
  @ObfuscatedName("ao")
  public boolean field3504 = true;
  @ObfuscatedName("at")
  public boolean field3520 = true;
  @ObfuscatedName("ai")
  public boolean field3517 = false;
  @ObfuscatedName("ak")
  public int[] field3516;
  @ObfuscatedName("h")
  @ObfuscatedGetter(
      intValue = 1933108527
  )
  int field3509 = 128;
  @ObfuscatedName("c")
  @ObfuscatedGetter(
      intValue = 680879601
  )
  int field3521 = 128;
  @ObfuscatedName("af")
  @ObfuscatedGetter(
      intValue = -1940547865
  )
  int field3512 = 0;
  @ObfuscatedName("ah")
  @ObfuscatedGetter(
      intValue = 1896315157
  )
  int field3513 = 0;
  @ObfuscatedName("as")
  @ObfuscatedGetter(
      intValue = 1305673173
  )
  int field3499 = -1;
  @ObfuscatedName("an")
  @ObfuscatedGetter(
      intValue = -332297953
  )
  int field3518 = -1;
  @ObfuscatedName("i")
  int[] field3493;
  @ObfuscatedName("r")
  short[] field3492;
  @ObfuscatedName("t")
  short[] field3503;
  @ObfuscatedName("o")
  short[] field3514;
  @ObfuscatedName("y")
  short[] field3505;
  @ObfuscatedName("x")
  int[] field3515;
  @ObfuscatedName("ac")
  @ObfuscatedSignature(
      signature = "Lgu;"
  )
  class197 field3522;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "392"
  )
  void method5159() {
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-1539738926"
  )
  void method5186(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method5160(class182_1, i_2);
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-1656965495"
  )
  void method5160(Buffer class182_1, int i_2) {
    int i_3;
    int i_4;
    if (i_2 == 1) {
      i_3 = class182_1.getUInt8();
      this.field3493 = new int[i_3];

      for (i_4 = 0; i_4 < i_3; i_4++) {
        this.field3493[i_4] = class182_1.getUInt16();
      }
    } else if (i_2 == 2) {
      this.field3491 = class182_1.method3738();
    } else if (i_2 == 12) {
      this.field3497 = class182_1.getUInt8();
    } else if (i_2 == 13) {
      this.field3519 = class182_1.getUInt16();
    } else if (i_2 == 14) {
      this.field3498 = class182_1.getUInt16();
    } else if (i_2 == 15) {
      this.field3496 = class182_1.getUInt16();
    } else if (i_2 == 16) {
      this.field3486 = class182_1.getUInt16();
    } else if (i_2 == 17) {
      this.field3498 = class182_1.getUInt16();
      this.field3495 = class182_1.getUInt16();
      this.field3502 = class182_1.getUInt16();
      this.field3501 = class182_1.getUInt16();
    } else if (i_2 >= 30 && i_2 < 35) {
      this.field3506[i_2 - 30] = class182_1.method3738();
      if (this.field3506[i_2 - 30].equalsIgnoreCase("Hidden")) {
        this.field3506[i_2 - 30] = null;
      }
    } else if (i_2 == 40) {
      i_3 = class182_1.getUInt8();
      this.field3492 = new short[i_3];
      this.field3503 = new short[i_3];

      for (i_4 = 0; i_4 < i_3; i_4++) {
        this.field3492[i_4] = (short) class182_1.getUInt16();
        this.field3503[i_4] = (short) class182_1.getUInt16();
      }
    } else if (i_2 == 41) {
      i_3 = class182_1.getUInt8();
      this.field3514 = new short[i_3];
      this.field3505 = new short[i_3];

      for (i_4 = 0; i_4 < i_3; i_4++) {
        this.field3514[i_4] = (short) class182_1.getUInt16();
        this.field3505[i_4] = (short) class182_1.getUInt16();
      }
    } else if (i_2 == 60) {
      i_3 = class182_1.getUInt8();
      this.field3515 = new int[i_3];

      for (i_4 = 0; i_4 < i_3; i_4++) {
        this.field3515[i_4] = class182_1.getUInt16();
      }
    } else if (i_2 == 93) {
      this.field3507 = false;
    } else if (i_2 == 95) {
      this.field3508 = class182_1.getUInt16();
    } else if (i_2 == 97) {
      this.field3509 = class182_1.getUInt16();
    } else if (i_2 == 98) {
      this.field3521 = class182_1.getUInt16();
    } else if (i_2 == 99) {
      this.field3511 = true;
    } else if (i_2 == 100) {
      this.field3512 = class182_1.getInt8();
    } else if (i_2 == 101) {
      this.field3513 = class182_1.getInt8() * 5;
    } else if (i_2 == 102) {
      this.field3494 = class182_1.getUInt16();
    } else if (i_2 == 103) {
      this.field3500 = class182_1.getUInt16();
    } else if (i_2 != 106 && i_2 != 118) {
      if (i_2 == 107) {
        this.field3504 = false;
      } else if (i_2 == 109) {
        this.field3520 = false;
      } else if (i_2 == 111) {
        this.field3517 = true;
      } else if (i_2 == 249) {
        this.field3522 = Keyboard.method691(class182_1, this.field3522);
      }
    } else {
      this.field3499 = class182_1.getUInt16();
      if (this.field3499 == 65535) {
        this.field3499 = -1;
      }

      this.field3518 = class182_1.getUInt16();
      if (this.field3518 == 65535) {
        this.field3518 = -1;
      }

      i_3 = -1;
      if (i_2 == 118) {
        i_3 = class182_1.getUInt16();
        if (i_3 == 65535) {
          i_3 = -1;
        }
      }

      i_4 = class182_1.getUInt8();
      this.field3516 = new int[i_4 + 2];

      for (int i_5 = 0; i_5 <= i_4; i_5++) {
        this.field3516[i_5] = class182_1.getUInt16();
        if (this.field3516[i_5] == 65535) {
          this.field3516[i_5] = -1;
        }
      }

      this.field3516[i_4 + 1] = i_3;
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Ljn;ILjn;II)Ldc;",
      garbageValue = "-639258306"
  )
  public final class119 method5162(class273 class273_1, int i_2, class273 class273_3, int i_4) {
    if (this.field3516 != null) {
      class271 class271_12 = this.method5189();
      return class271_12 == null ? null : class271_12.method5162(class273_1, i_2, class273_3, i_4);
    } else {
      class119 class119_5 = (class119) field3489.method3989((long) this.field3510);
      if (class119_5 == null) {
        boolean bool_6 = false;

        for (int i_7 = 0; i_7 < this.field3493.length; i_7++) {
          if (!field3487.method4696(this.field3493[i_7], 0)) {
            bool_6 = true;
          }
        }

        if (bool_6) {
          return null;
        }

        class113[] arr_8 = new class113[this.field3493.length];

        int i_9;
        for (i_9 = 0; i_9 < this.field3493.length; i_9++) {
          arr_8[i_9] = class113.method2568(field3487, this.field3493[i_9], 0);
        }

        class113 class113_11;
        if (arr_8.length == 1) {
          class113_11 = arr_8[0];
        } else {
          class113_11 = new class113(arr_8, arr_8.length);
        }

        if (this.field3492 != null) {
          for (i_9 = 0; i_9 < this.field3492.length; i_9++) {
            class113_11.method2581(this.field3492[i_9], this.field3503[i_9]);
          }
        }

        if (this.field3514 != null) {
          for (i_9 = 0; i_9 < this.field3514.length; i_9++) {
            class113_11.method2582(this.field3514[i_9], this.field3505[i_9]);
          }
        }

        class119_5 = class113_11
            .method2589(this.field3512 + 64, this.field3513 + 850, -30, -50, -30);
        field3489.method3983(class119_5, (long) this.field3510);
      }

      class119 class119_10;
      if (class273_1 != null && class273_3 != null) {
        class119_10 = class273_1.method5221(class119_5, i_2, class273_3, i_4);
      } else if (class273_1 != null) {
        class119_10 = class273_1.method5215(class119_5, i_2);
      } else if (class273_3 != null) {
        class119_10 = class273_3.method5215(class119_5, i_4);
      } else {
        class119_10 = class119_5.method2666(true);
      }

      if (this.field3509 != 128 || this.field3521 != 128) {
        class119_10.method2681(this.field3509, this.field3521, this.field3509);
      }

      return class119_10;
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(B)Ldb;",
      garbageValue = "-30"
  )
  public final class113 method5158() {
    if (this.field3516 != null) {
      class271 class271_1 = this.method5189();
      return class271_1 == null ? null : class271_1.method5158();
    } else if (this.field3515 == null) {
      return null;
    } else {
      boolean bool_5 = false;

      for (int i_2 = 0; i_2 < this.field3515.length; i_2++) {
        if (!field3487.method4696(this.field3515[i_2], 0)) {
          bool_5 = true;
        }
      }

      if (bool_5) {
        return null;
      } else {
        class113[] arr_6 = new class113[this.field3515.length];

        for (int i_3 = 0; i_3 < this.field3515.length; i_3++) {
          arr_6[i_3] = class113.method2568(field3487, this.field3515[i_3], 0);
        }

        class113 class113_7;
        if (arr_6.length == 1) {
          class113_7 = arr_6[0];
        } else {
          class113_7 = new class113(arr_6, arr_6.length);
        }

        int i_4;
        if (this.field3492 != null) {
          for (i_4 = 0; i_4 < this.field3492.length; i_4++) {
            class113_7.method2581(this.field3492[i_4], this.field3503[i_4]);
          }
        }

        if (this.field3514 != null) {
          for (i_4 = 0; i_4 < this.field3514.length; i_4++) {
            class113_7.method2582(this.field3514[i_4], this.field3505[i_4]);
          }
        }

        return class113_7;
      }
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)Ljq;",
      garbageValue = "-1834963481"
  )
  public final class271 method5189() {
    int i_1 = -1;
    if (this.field3499 != -1) {
      i_1 = Temp.method3389(this.field3499);
    } else if (this.field3518 != -1) {
      i_1 = class225.field2558[this.field3518];
    }

    int i_2;
    if (i_1 >= 0 && i_1 < this.field3516.length - 1) {
      i_2 = this.field3516[i_1];
    } else {
      i_2 = this.field3516[this.field3516.length - 1];
    }

    return i_2 != -1 ? class270.method5157(i_2) : null;
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "981349968"
  )
  public boolean method5165() {
    if (this.field3516 == null) {
      return true;
    } else {
      int i_1 = -1;
      if (this.field3499 != -1) {
        i_1 = Temp.method3389(this.field3499);
      } else if (this.field3518 != -1) {
        i_1 = class225.field2558[this.field3518];
      }

      return i_1 >= 0 && i_1 < this.field3516.length ? this.field3516[i_1] != -1
          : this.field3516[this.field3516.length - 1] != -1;
    }
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "33823014"
  )
  public int method5166(int i_1, int i_2) {
    return class67.method1668(this.field3522, i_1, i_2);
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "37"
  )
  public String method5167(int i_1, String string_2) {
    return class17.method171(this.field3522, i_1, string_2);
  }

}
