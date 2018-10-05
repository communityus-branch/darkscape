package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public final class class79 extends class127 {

  @ObfuscatedName("b")
  boolean field1133 = false;
  @ObfuscatedName("h")
  @ObfuscatedGetter(
      intValue = 1358664531
  )
  int field1143 = 0;
  @ObfuscatedName("c")
  @ObfuscatedGetter(
      intValue = -931624513
  )
  int field1134 = 0;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -1556168027
  )
  int field1120;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -137784953
  )
  int field1121;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 1001488191
  )
  int field1122;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -1246023211
  )
  int field1130;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 615566251
  )
  int field1124;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -904504589
  )
  int field1126;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = -620277071
  )
  int field1127;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = -1070958121
  )
  int field1128;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 490522177
  )
  int field1132;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = -1202003677
  )
  int field1135;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 392987725
  )
  int field1123;
  @ObfuscatedName("d")
  @ObfuscatedSignature(
      signature = "Ljn;"
  )
  class273 field1142;
  @ObfuscatedName("n")
  double field1144;
  @ObfuscatedName("f")
  double field1125;
  @ObfuscatedName("g")
  double field1137;
  @ObfuscatedName("m")
  double field1131;
  @ObfuscatedName("r")
  double field1136;
  @ObfuscatedName("t")
  double field1129;
  @ObfuscatedName("o")
  double field1138;
  @ObfuscatedName("y")
  double field1139;
  @ObfuscatedName("a")
  @ObfuscatedGetter(
      intValue = 82611727
  )
  int field1140;
  @ObfuscatedName("j")
  @ObfuscatedGetter(
      intValue = 760033287
  )
  int field1141;

  class79(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10,
          int i_11) {
    this.field1120 = i_1;
    this.field1121 = i_2;
    this.field1122 = i_3;
    this.field1130 = i_4;
    this.field1124 = i_5;
    this.field1126 = i_6;
    this.field1127 = i_7;
    this.field1128 = i_8;
    this.field1132 = i_9;
    this.field1135 = i_10;
    this.field1123 = i_11;
    this.field1133 = false;
    int i_12 = class57.method1035(this.field1120).field3271;
    if (i_12 != -1) {
      this.field1142 = class3.method25(i_12);
    } else {
      this.field1142 = null;
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-432568951"
  )
  final void method1849(int i_1, int i_2, int i_3, int i_4) {
    double d_5;
    if (!this.field1133) {
      d_5 = (double) (i_1 - this.field1122);
      double d_7 = (double) (i_2 - this.field1130);
      double d_9 = Math.sqrt(d_7 * d_7 + d_5 * d_5);
      this.field1144 = (double) this.field1122 + (double) this.field1132 * d_5 / d_9;
      this.field1125 = (double) this.field1132 * d_7 / d_9 + (double) this.field1130;
      this.field1137 = (double) this.field1124;
    }

    d_5 = (double) (this.field1127 + 1 - i_4);
    this.field1131 = ((double) i_1 - this.field1144) / d_5;
    this.field1136 = ((double) i_2 - this.field1125) / d_5;
    this.field1129 = Math.sqrt(this.field1131 * this.field1131 + this.field1136 * this.field1136);
    if (!this.field1133) {
      this.field1138 = -this.field1129 * Math.tan(0.02454369D * (double) this.field1128);
    }

    this.field1139 = ((double) i_3 - this.field1137 - d_5 * this.field1138) * 2.0D / (d_5 * d_5);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1768751642"
  )
  final void method1850(int i_1) {
    this.field1133 = true;
    this.field1144 += this.field1131 * (double) i_1;
    this.field1125 += this.field1136 * (double) i_1;
    this.field1137 +=
        (double) i_1 * 0.5D * this.field1139 * (double) i_1 + (double) i_1 * this.field1138;
    this.field1138 += this.field1139 * (double) i_1;
    this.field1140 = (int) (Math.atan2(this.field1131, this.field1136) * 325.949D) + 1024 & 0x7ff;
    this.field1141 = (int) (Math.atan2(this.field1138, this.field1129) * 325.949D) & 0x7ff;
    if (this.field1142 != null) {
      this.field1134 += i_1;

      while (true) {
        do {
          do {
            if (this.field1134 <= this.field1142.field3541[this.field1143]) {
              return;
            }

            this.field1134 -= this.field1142.field3541[this.field1143];
            ++this.field1143;
          } while (this.field1143 < this.field1142.field3540.length);

          this.field1143 -= this.field1142.field3544;
        } while (this.field1143 >= 0 && this.field1143 < this.field1142.field3540.length);

        this.field1143 = 0;
      }
    }
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
  )
  protected final class119 vmethod3067() {
    class258 class258_1 = class57.method1035(this.field1120);
    class119 class119_2 = class258_1.method4866(this.field1143);
    if (class119_2 == null) {
      return null;
    } else {
      class119_2.method2680(this.field1141);
      return class119_2;
    }
  }

}
