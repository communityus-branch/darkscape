package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class10 extends class16 {

  @ObfuscatedName("qn")
  @ObfuscatedSignature(
      signature = "Lbx;"
  )
  static class66 field61;

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1588398214"
  )
  static void method96(int i_0, int i_1, int i_2, int i_3) {
    class53 class53_4 = (class53) class53.field474.get((long) i_0);
    if (class53_4 == null) {
      class53_4 = new class53();
      class53.field474.put(class53_4, (long) i_0);
    }

    if (class53_4.field477.length <= i_1) {
      int[] ints_5 = new int[i_1 + 1];
      int[] ints_6 = new int[i_1 + 1];

      int i_7;
      for (i_7 = 0; i_7 < class53_4.field477.length; i_7++) {
        ints_5[i_7] = class53_4.field477[i_7];
        ints_6[i_7] = class53_4.field473[i_7];
      }

      for (i_7 = class53_4.field477.length; i_7 < i_1; i_7++) {
        ints_5[i_7] = -1;
        ints_6[i_7] = 0;
      }

      class53_4.field477 = ints_5;
      class53_4.field473 = ints_6;
    }

    class53_4.field477[i_1] = i_2;
    class53_4.field473[i_1] = i_3;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "([BI)Lce;",
      garbageValue = "-2110987509"
  )
  static class84 method97(byte[] bytes_0) {
    class84 class84_1 = new class84();
    Buffer class182_2 = new Buffer(bytes_0);
    class182_2.offset = class182_2.bytes.length - 2;
    int i_3 = class182_2.getUInt16();
    int i_4 = class182_2.bytes.length - 2 - i_3 - 12;
    class182_2.offset = i_4;
    int i_5 = class182_2.getInt32();
    class84_1.field1192 = class182_2.getUInt16();
    class84_1.field1193 = class182_2.getUInt16();
    class84_1.field1188 = class182_2.getUInt16();
    class84_1.field1195 = class182_2.getUInt16();
    int i_6 = class182_2.getUInt8();
    int i_7;
    int i_8;
    if (i_6 > 0) {
      class84_1.field1194 = class84_1.method1944(i_6);

      for (i_7 = 0; i_7 < i_6; i_7++) {
        i_8 = class182_2.getUInt16();
        class197 class197_9 = new class197(i_8 > 0 ? class146.method3193(i_8) : 1);
        class84_1.field1194[i_7] = class197_9;

        while (i_8-- > 0) {
          int i_10 = class182_2.getInt32();
          int i_11 = class182_2.getInt32();
          class197_9.method3944(new class211(i_11), (long) i_10);
        }
      }
    }

    class182_2.offset = 0;
    class182_2.method3752();
    class84_1.field1189 = new int[i_5];
    class84_1.field1196 = new int[i_5];
    class84_1.field1191 = new String[i_5];

    for (i_7 = 0; class182_2.offset < i_4; class84_1.field1189[i_7++] = i_8) {
      i_8 = class182_2.getUInt16();
      if (i_8 == 3) {
        class84_1.field1191[i_7] = class182_2.method3738();
      } else if (i_8 < 100 && i_8 != 21 && i_8 != 38 && i_8 != 39) {
        class84_1.field1196[i_7] = class182_2.getInt32();
      } else {
        class84_1.field1196[i_7] = class182_2.getUInt8();
      }
    }

    return class84_1;
  }

  @ObfuscatedName("fp")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1245329475"
  )
  static boolean method92() {
    if (client.field781 != null && client.field606 < client.field781.size()) {
      while (client.field606 < client.field781.size()) {
        class52 class52_0 = (class52) client.field781.get(client.field606);
        if (!class52_0.method1000()) {
          return false;
        }

        ++client.field606;
      }

      return true;
    } else {
      return true;
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lgk;Lgk;I)V",
      garbageValue = "-1858538420"
  )
  void method95(Buffer class182_1, Buffer class182_2) {
    int i_3 = class182_2.getUInt8();
    if (i_3 != class25.field212.field211) {
      throw new IllegalStateException("");
    } else {
      super.field120 = class182_2.getUInt8();
      super.field121 = class182_2.getUInt8();
      super.field127 = class182_2.getUInt16();
      super.field117 = class182_2.getUInt16();
      super.field118 = class182_2.getUInt16();
      super.field119 = class182_2.getUInt16();
      super.field121 = Math.min(super.field121, 4);
      super.field125 = new short[1][64][64];
      super.field123 = new short[super.field121][64][64];
      super.field124 = new byte[super.field121][64][64];
      super.field116 = new byte[super.field121][64][64];
      super.field126 = new class19[super.field121][64][64][];
      i_3 = class182_1.getUInt8();
      if (i_3 != class24.field208.field205) {
        throw new IllegalStateException("");
      } else {
        int i_4 = class182_1.getUInt8();
        int i_5 = class182_1.getUInt8();
        if (i_4 == super.field118 && i_5 == super.field119) {
          for (int i_6 = 0; i_6 < 64; i_6++) {
            for (int i_7 = 0; i_7 < 64; i_7++) {
              this.method150(i_6, i_7, class182_1);
            }
          }

        } else {
          throw new IllegalStateException("");
        }
      }
    }
  }

  public boolean equals(Object object_1) {
    if (!(object_1 instanceof class10)) {
      return false;
    } else {
      class10 class10_2 = (class10) object_1;
      return super.field118 == class10_2.field118 && class10_2.field119 == super.field119;
    }
  }

  public int hashCode() {
    return super.field118 | super.field119 << 8;
  }

}
