package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public class class91 {

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "[Ldn;"
  )
  class107[] field1241 = new class107[10];
  @ObfuscatedName("s")
  int field1239;
  @ObfuscatedName("l")
  int field1240;

  @ObfuscatedSignature(
      signature = "(Lgk;)V"
  )
  class91(Buffer class182_1) {
    for (int i_2 = 0; i_2 < 10; i_2++) {
      int i_3 = class182_1.getUInt8();
      if (i_3 != 0) {
        --class182_1.offset;
        this.field1241[i_2] = new class107();
        this.field1241[i_2].method2466(class182_1);
      }
    }

    this.field1239 = class182_1.getUInt16();
    this.field1240 = class182_1.getUInt16();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;II)Lcg;"
  )
  public static class91 method2071(AbstractPack class247_0, int i_1, int i_2) {
    byte[] bytes_3 = class247_0.method4625(i_1, i_2);
    return bytes_3 == null ? null : new class91(new Buffer(bytes_3));
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "()Lct;"
  )
  public class93 method2069() {
    byte[] bytes_1 = this.method2068();
    return new class93(22050, bytes_1, this.field1239 * 22050 / 1000,
                       this.field1240 * 22050 / 1000);
  }

  @ObfuscatedName("s")
  public final int method2070() {
    int i_1 = 9999999;

    int i_2;
    for (i_2 = 0; i_2 < 10; i_2++) {
      if (this.field1241[i_2] != null && this.field1241[i_2].field1405 / 20 < i_1) {
        i_1 = this.field1241[i_2].field1405 / 20;
      }
    }

    if (this.field1239 < this.field1240 && this.field1239 / 20 < i_1) {
      i_1 = this.field1239 / 20;
    }

    if (i_1 != 9999999 && i_1 != 0) {
      for (i_2 = 0; i_2 < 10; i_2++) {
        if (this.field1241[i_2] != null) {
          this.field1241[i_2].field1405 -= i_1 * 20;
        }
      }

      if (this.field1239 < this.field1240) {
        this.field1239 -= i_1 * 20;
        this.field1240 -= i_1 * 20;
      }

      return i_1;
    } else {
      return 0;
    }
  }

  @ObfuscatedName("l")
  final byte[] method2068() {
    int i_1 = 0;

    int i_2;
    for (i_2 = 0; i_2 < 10; i_2++) {
      if (this.field1241[i_2] != null
          && this.field1241[i_2].field1404 + this.field1241[i_2].field1405 > i_1) {
        i_1 = this.field1241[i_2].field1404 + this.field1241[i_2].field1405;
      }
    }

    if (i_1 == 0) {
      return new byte[0];
    } else {
      i_2 = i_1 * 22050 / 1000;
      byte[] bytes_3 = new byte[i_2];

      for (int i_4 = 0; i_4 < 10; i_4++) {
        if (this.field1241[i_4] != null) {
          int i_5 = this.field1241[i_4].field1404 * 22050 / 1000;
          int i_6 = this.field1241[i_4].field1405 * 22050 / 1000;
          int[] ints_7 = this.field1241[i_4].method2464(i_5, this.field1241[i_4].field1404);

          for (int i_8 = 0; i_8 < i_5; i_8++) {
            int i_9 = (ints_7[i_8] >> 8) + bytes_3[i_8 + i_6];
            if ((i_9 + 128 & ~0xff) != 0) {
              i_9 = i_9 >> 31 ^ 0x7f;
            }

            bytes_3[i_8 + i_6] = (byte) i_9;
          }
        }
      }

      return bytes_3;
    }
  }

}
