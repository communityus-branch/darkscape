package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
public class class220 {

  @ObfuscatedName("e")
  static final byte[] field2527 = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
      (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
      (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
      (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
      (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
      (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
      (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
      (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
      (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
      (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
      (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
      (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
      (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0,
      (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
      (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgk;"
  )
  Buffer field2530 = new Buffer((byte[]) null);
  @ObfuscatedName("w")
  int field2519;
  @ObfuscatedName("k")
  int field2524;
  @ObfuscatedName("s")
  int[] field2520;
  @ObfuscatedName("x")
  long field2526;
  @ObfuscatedName("l")
  int[] field2521;
  @ObfuscatedName("u")
  int[] field2525;
  @ObfuscatedName("q")
  int[] field2523;

  class220(byte[] bytes_1) {
    this.method4328(bytes_1);
  }

  class220() {
  }

  @ObfuscatedName("z")
  void method4328(byte[] bytes_1) {
    this.field2530.bytes = bytes_1;
    this.field2530.offset = 10;
    int i_2 = this.field2530.getUInt16();
    this.field2519 = this.field2530.getUInt16();
    this.field2524 = 500000;
    this.field2520 = new int[i_2];

    int i_3;
    int i_5;
    for (i_3 = 0; i_3 < i_2; this.field2530.offset += i_5) {
      int i_4 = this.field2530.getInt32();
      i_5 = this.field2530.getInt32();
      if (i_4 == 1297379947) {
        this.field2520[i_3] = this.field2530.offset;
        ++i_3;
      }
    }

    this.field2526 = 0L;
    this.field2521 = new int[i_2];

    for (i_3 = 0; i_3 < i_2; i_3++) {
      this.field2521[i_3] = this.field2520[i_3];
    }

    this.field2525 = new int[i_2];
    this.field2523 = new int[i_2];
  }

  @ObfuscatedName("w")
  void method4329() {
    this.field2530.bytes = null;
    this.field2520 = null;
    this.field2521 = null;
    this.field2525 = null;
    this.field2523 = null;
  }

  @ObfuscatedName("s")
  boolean method4345() {
    return this.field2530.bytes != null;
  }

  @ObfuscatedName("l")
  int method4331() {
    return this.field2521.length;
  }

  @ObfuscatedName("u")
  void method4350(int i_1) {
    this.field2530.offset = this.field2521[i_1];
  }

  @ObfuscatedName("q")
  void method4333(int i_1) {
    this.field2521[i_1] = this.field2530.offset;
  }

  @ObfuscatedName("i")
  void method4334() {
    this.field2530.offset = -1;
  }

  @ObfuscatedName("x")
  void method4335(int i_1) {
    int i_2 = this.field2530.method3566();
    this.field2525[i_1] += i_2;
  }

  @ObfuscatedName("e")
  int method4336(int i_1) {
    int i_2 = this.method4327(i_1);
    return i_2;
  }

  @ObfuscatedName("p")
  int method4327(int i_1) {
    byte b_2 = this.field2530.bytes[this.field2530.offset];
    int i_5;
    if (b_2 < 0) {
      i_5 = b_2 & 0xff;
      this.field2523[i_1] = i_5;
      ++this.field2530.offset;
    } else {
      i_5 = this.field2523[i_1];
    }

    if (i_5 != 240 && i_5 != 247) {
      return this.method4337(i_1, i_5);
    } else {
      int i_3 = this.field2530.method3566();
      if (i_5 == 247 && i_3 > 0) {
        int i_4 = this.field2530.bytes[this.field2530.offset] & 0xff;
        if (i_4 >= 241 && i_4 <= 243 || i_4 == 246 || i_4 == 248 || i_4 >= 250 && i_4 <= 252
            || i_4 == 254) {
          ++this.field2530.offset;
          this.field2523[i_1] = i_4;
          return this.method4337(i_1, i_4);
        }
      }

      this.field2530.offset += i_3;
      return 0;
    }
  }

  @ObfuscatedName("b")
  int method4337(int i_1, int i_2) {
    int i_4;
    if (i_2 == 255) {
      int i_7 = this.field2530.getUInt8();
      i_4 = this.field2530.method3566();
      if (i_7 == 47) {
        this.field2530.offset += i_4;
        return 1;
      } else if (i_7 == 81) {
        int i_5 = this.field2530.getUInt24();
        i_4 -= 3;
        int i_6 = this.field2525[i_1];
        this.field2526 += (long) i_6 * (long) (this.field2524 - i_5);
        this.field2524 = i_5;
        this.field2530.offset += i_4;
        return 2;
      } else {
        this.field2530.offset += i_4;
        return 3;
      }
    } else {
      byte b_3 = field2527[i_2 - 128];
      i_4 = i_2;
      if (b_3 >= 1) {
        i_4 = i_2 | this.field2530.getUInt8() << 8;
      }

      if (b_3 >= 2) {
        i_4 |= this.field2530.getUInt8() << 16;
      }

      return i_4;
    }
  }

  @ObfuscatedName("n")
  long method4338(int i_1) {
    return this.field2526 + (long) i_1 * (long) this.field2524;
  }

  @ObfuscatedName("f")
  int method4339() {
    int i_1 = this.field2521.length;
    int i_2 = -1;
    int i_3 = Integer.MAX_VALUE;

    for (int i_4 = 0; i_4 < i_1; i_4++) {
      if (this.field2521[i_4] >= 0 && this.field2525[i_4] < i_3) {
        i_2 = i_4;
        i_3 = this.field2525[i_4];
      }
    }

    return i_2;
  }

  @ObfuscatedName("g")
  boolean method4340() {
    int i_1 = this.field2521.length;

    for (int i_2 = 0; i_2 < i_1; i_2++) {
      if (this.field2521[i_2] >= 0) {
        return false;
      }
    }

    return true;
  }

  @ObfuscatedName("m")
  void method4341(long long_1) {
    this.field2526 = long_1;
    int i_3 = this.field2521.length;

    for (int i_4 = 0; i_4 < i_3; i_4++) {
      this.field2525[i_4] = 0;
      this.field2523[i_4] = 0;
      this.field2530.offset = this.field2520[i_4];
      this.method4335(i_4);
      this.field2521[i_4] = this.field2530.offset;
    }

  }

}
