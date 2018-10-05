package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
public final class class60 extends class63 {

  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 2078576503
  )
  int field562;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -479135119
  )
  int field556;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = -316850739
  )
  int field557;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = 265765217
  )
  int field558;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = 668730737
  )
  int field559;
  @ObfuscatedName("r")
  @ObfuscatedGetter(
      intValue = 293985015
  )
  int field547;
  @ObfuscatedName("t")
  @ObfuscatedGetter(
      intValue = -1873032529
  )
  int field565;
  @ObfuscatedName("o")
  @ObfuscatedGetter(
      intValue = -1295532419
  )
  int field553;
  @ObfuscatedName("d")
  @ObfuscatedGetter(
      intValue = 723692473
  )
  int field567;
  @ObfuscatedName("h")
  @ObfuscatedGetter(
      intValue = -2042887495
  )
  int field574;
  @ObfuscatedName("ah")
  @ObfuscatedGetter(
      intValue = -672131463
  )
  int field572;
  @ObfuscatedName("ab")
  @ObfuscatedGetter(
      intValue = 329940333
  )
  int field573;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -1998294681
  )
  int field570 = -1;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -1980153081
  )
  int field548 = -1;
  @ObfuscatedName("q")
  String[] field550 = new String[3];
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -2003980775
  )
  int field551;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 1248875317
  )
  int field564;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -1490301437
  )
  int field545;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = 1922127141
  )
  int field555;
  @ObfuscatedName("y")
  boolean field560;
  @ObfuscatedName("a")
  @ObfuscatedGetter(
      intValue = -1403765271
  )
  int field568;
  @ObfuscatedName("j")
  boolean field566;
  @ObfuscatedName("c")
  @ObfuscatedSignature(
      signature = "Lkd;"
  )
  class289 field569;
  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "Lkd;"
  )
  class289 field554;
  @ObfuscatedName("af")
  boolean field571;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lkm;"
  )
  class291 field552;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lhd;"
  )
  class227 field546;
  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "Ldc;"
  )
  class119 field563;

  class60() {
    for (int i_1 = 0; i_1 < 3; i_1++) {
      this.field550[i_1] = "";
    }

    this.field551 = 0;
    this.field564 = 0;
    this.field545 = 0;
    this.field555 = 0;
    this.field560 = false;
    this.field568 = 0;
    this.field566 = false;
    this.field569 = class289.field3633;
    this.field554 = class289.field3633;
    this.field571 = false;
  }

  @ObfuscatedName("ja")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1852538691"
  )
  static void method1120(int i_0, int i_1) {
    class171.method3451(class229.field2588, i_0, i_1);
    class229.field2588 = null;
  }

  @ObfuscatedName("ju")
  @ObfuscatedSignature(
      signature = "(Lhi;I)V",
      garbageValue = "941710605"
  )
  static void method1114(class230 class230_0) {
    if (class230_0.field2627 == client.field830) {
      client.field697[class230_0.field2737] = true;
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "833204307"
  )
  final void method1082(Buffer class182_1) {
    class182_1.offset = 0;
    int i_2 = class182_1.getUInt8();
    this.field570 = class182_1.getInt8();
    this.field548 = class182_1.getInt8();
    int i_3 = -1;
    this.field568 = 0;
    int[] ints_4 = new int[12];

    int i_6;
    int i_7;
    for (int i_5 = 0; i_5 < 12; i_5++) {
      i_6 = class182_1.getUInt8();
      if (i_6 == 0) {
        ints_4[i_5] = 0;
      } else {
        i_7 = class182_1.getUInt8();
        ints_4[i_5] = i_7 + (i_6 << 8);
        if (i_5 == 0 && ints_4[0] == 65535) {
          i_3 = class182_1.getUInt16();
          break;
        }

        if (ints_4[i_5] >= 512) {
          int i_8 = class111.method2563(ints_4[i_5] - 512).field3462;
          if (i_8 != 0) {
            this.field568 = i_8;
          }
        }
      }
    }

    int[] ints_9 = new int[5];

    for (i_6 = 0; i_6 < 5; i_6++) {
      i_7 = class182_1.getUInt8();
      if (i_7 < 0 || i_7 >= class227.field2572[i_6].length) {
        i_7 = 0;
      }

      ints_9[i_6] = i_7;
    }

    super.field893 = class182_1.getUInt16();
    if (super.field893 == 65535) {
      super.field893 = -1;
    }

    super.field877 = class182_1.getUInt16();
    if (super.field877 == 65535) {
      super.field877 = -1;
    }

    super.field878 = super.field877;
    super.field899 = class182_1.getUInt16();
    if (super.field899 == 65535) {
      super.field899 = -1;
    }

    super.field880 = class182_1.getUInt16();
    if (super.field880 == 65535) {
      super.field880 = -1;
    }

    super.field870 = class182_1.getUInt16();
    if (super.field870 == 65535) {
      super.field870 = -1;
    }

    super.field882 = class182_1.getUInt16();
    if (super.field882 == 65535) {
      super.field882 = -1;
    }

    super.field883 = class182_1.getUInt16();
    if (super.field883 == 65535) {
      super.field883 = -1;
    }

    this.field552 = new class291(class182_1.method3738(), class36.field306);
    this.method1084();
    this.method1086();
    if (this == class138.field1876) {
      class152.field1939 = this.field552.method5447();
    }

    this.field551 = class182_1.getUInt8();
    this.field564 = class182_1.getUInt16();
    this.field566 = class182_1.getUInt8() == 1;
    if (client.field777 == 0 && client.field747 >= 2) {
      this.field566 = false;
    }

    if (this.field546 == null) {
      this.field546 = new class227();
    }

    this.field546.method4462(ints_4, ints_9, i_2 == 1, i_3);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-514053088"
  )
  boolean method1083() {
    if (this.field569 == class289.field3633) {
      this.method1085();
    }

    return this.field569 == class289.field3631;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-540228134"
  )
  void method1084() {
    this.field569 = class289.field3633;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-35"
  )
  void method1085() {
    this.field569 =
        class181.field2332.method1637(this.field552) ? class289.field3631 : class289.field3634;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1597718431"
  )
  boolean method1104() {
    if (this.field554 == class289.field3633) {
      this.method1087();
    }

    return this.field554 == class289.field3631;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "480560408"
  )
  void method1086() {
    this.field554 = class289.field3633;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1372893329"
  )
  void method1087() {
    this.field554 =
        class14.field94 != null && class14.field94.method5329(this.field552) ? class289.field3631
            : class289.field3634;
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-77"
  )
  int method1088() {
    return this.field546 != null && this.field546.field2569 != -1 ? class270
        .method5157(this.field546.field2569).field3497 : 1;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
  )
  protected final class119 vmethod3067() {
    if (this.field546 == null) {
      return null;
    } else {
      class273 class273_1 =
          super.field903 != -1 && super.field906 == 0 ? class3.method25(super.field903) : null;
      class273 class273_2 = super.field900 == -1 || this.field560
          || super.field900 == super.field893 && class273_1 != null ? null
          : class3.method25(super.field900);
      class119 class119_3 = this.field546
          .method4468(class273_1, super.field904, class273_2, super.field908);
      if (class119_3 == null) {
        return null;
      } else {
        class119_3.method2670();
        super.field925 = class119_3.field1781;
        class119 class119_4;
        class119[] arr_5;
        if (!this.field560 && super.field891 != -1 && super.field876 != -1) {
          class119_4 = class57.method1035(super.field891).method4866(super.field876);
          if (class119_4 != null) {
            class119_4.method2718(0, -super.field871, 0);
            arr_5 = new class119[]{class119_3, class119_4};
            class119_3 = new class119(arr_5, 2);
          }
        }

        if (!this.field560 && this.field563 != null) {
          if (client.field591 >= this.field555) {
            this.field563 = null;
          }

          if (client.field591 >= this.field545 && client.field591 < this.field555) {
            class119_4 = this.field563;
            class119_4.method2718(this.field556 - super.field931, this.field557 - this.field562,
                                  this.field558 - super.field881);
            if (super.field926 == 512) {
              class119_4.method2677();
              class119_4.method2677();
              class119_4.method2677();
            } else if (super.field926 == 1024) {
              class119_4.method2677();
              class119_4.method2677();
            } else if (super.field926 == 1536) {
              class119_4.method2677();
            }

            arr_5 = new class119[]{class119_3, class119_4};
            class119_3 = new class119(arr_5, 2);
            if (super.field926 == 512) {
              class119_4.method2677();
            } else if (super.field926 == 1024) {
              class119_4.method2677();
              class119_4.method2677();
            } else if (super.field926 == 1536) {
              class119_4.method2677();
              class119_4.method2677();
              class119_4.method2677();
            }

            class119_4.method2718(super.field931 - this.field556, this.field562 - this.field557,
                                  super.field881 - this.field558);
          }
        }

        class119_3.field1603 = true;
        return class119_3;
      }
    }
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(IIBI)V",
      garbageValue = "-1440413395"
  )
  final void method1106(int i_1, int i_2, byte b_3) {
    if (super.field903 != -1 && class3.method25(super.field903).field3535 == 1) {
      super.field903 = -1;
    }

    super.field920 = -1;
    if (i_1 >= 0 && i_1 < 104 && i_2 >= 0 && i_2 < 104) {
      if (super.field922[0] >= 0 && super.field922[0] < 104 && super.field872[0] >= 0
          && super.field872[0] < 104) {
        if (b_3 == 2) {
          class62.method1538(this, i_1, i_2, (byte) 2);
        }

        this.method1105(i_1, i_2, b_3);
      } else {
        this.method1103(i_1, i_2);
      }
    } else {
      this.method1103(i_1, i_2);
    }

  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2124327900"
  )
  void method1103(int i_1, int i_2) {
    super.field909 = 0;
    super.field930 = 0;
    super.field923 = 0;
    super.field922[0] = i_1;
    super.field872[0] = i_2;
    int i_3 = this.method1088();
    super.field931 = i_3 * 64 + super.field922[0] * 128;
    super.field881 = i_3 * 64 + super.field872[0] * 128;
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(IIBB)V",
      garbageValue = "12"
  )
  final void method1105(int i_1, int i_2, byte b_3) {
    if (super.field909 < 9) {
      ++super.field909;
    }

    for (int i_4 = super.field909; i_4 > 0; --i_4) {
      super.field922[i_4] = super.field922[i_4 - 1];
      super.field872[i_4] = super.field872[i_4 - 1];
      super.field928[i_4] = super.field928[i_4 - 1];
    }

    super.field922[0] = i_1;
    super.field872[0] = i_2;
    super.field928[0] = b_3;
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "5"
  )
  final boolean vmethod1786() {
    return this.field546 != null;
  }

}
