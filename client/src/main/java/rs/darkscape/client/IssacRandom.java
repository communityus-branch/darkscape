package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public final class IssacRandom {

  @ObfuscatedName("q")
  int[] field2386 = new int[256];
  @ObfuscatedName("u")
  int[] field2384 = new int[256];
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 1238242625
  )
  int field2381;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = -248497899
  )
  int field2382;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 165032263
  )
  int field2385;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -32911809
  )
  int field2387;

  public IssacRandom(int[] seed) {
    for (int i_2 = 0; i_2 < seed.length; i_2++) {
      this.field2384[i_2] = seed[i_2];
    }

    this.method3861();
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IS)I",
      garbageValue = "-25401"
  )
  public static int method3865(int i_0) {
    return i_0 >> 17 & 0x7;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1244339201"
  )
  final int next() {
    if (--this.field2381 + 1 == 0) {
      this.method3852();
      this.field2381 = 255;
    }

    return this.field2384[this.field2381];
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1777636866"
  )
  final int method3853() {
    if (this.field2381 == 0) {
      this.method3852();
      this.field2381 = 256;
    }

    return this.field2384[this.field2381 - 1];
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-544469787"
  )
  final void method3852() {
    this.field2385 += ++this.field2382;

    for (int i_1 = 0; i_1 < 256; i_1++) {
      int i_2 = this.field2386[i_1];
      if ((i_1 & 0x2) == 0) {
        if ((i_1 & 0x1) == 0) {
          this.field2387 ^= this.field2387 << 13;
        } else {
          this.field2387 ^= this.field2387 >>> 6;
        }
      } else if ((i_1 & 0x1) == 0) {
        this.field2387 ^= this.field2387 << 2;
      } else {
        this.field2387 ^= this.field2387 >>> 16;
      }

      this.field2387 += this.field2386[128 + i_1 & 0xff];
      int i_3;
      this.field2386[i_1] = i_3 =
          this.field2386[(i_2 & 0x3fc) >> 2] + this.field2385 + this.field2387;
      this.field2384[i_1] = this.field2385 = this.field2386[(i_3 >> 8 & 0x3fc) >> 2] + i_2;
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-322691741"
  )
  final void method3861() {
    int i_9 = -1640531527;
    int i_8 = -1640531527;
    int i_7 = -1640531527;
    int i_6 = -1640531527;
    int i_5 = -1640531527;
    int i_4 = -1640531527;
    int i_3 = -1640531527;
    int i_2 = -1640531527;

    int i_1;
    for (i_1 = 0; i_1 < 4; i_1++) {
      i_2 ^= i_3 << 11;
      i_5 += i_2;
      i_3 += i_4;
      i_3 ^= i_4 >>> 2;
      i_6 += i_3;
      i_4 += i_5;
      i_4 ^= i_5 << 8;
      i_7 += i_4;
      i_5 += i_6;
      i_5 ^= i_6 >>> 16;
      i_8 += i_5;
      i_6 += i_7;
      i_6 ^= i_7 << 10;
      i_9 += i_6;
      i_7 += i_8;
      i_7 ^= i_8 >>> 4;
      i_2 += i_7;
      i_8 += i_9;
      i_8 ^= i_9 << 8;
      i_3 += i_8;
      i_9 += i_2;
      i_9 ^= i_2 >>> 9;
      i_4 += i_9;
      i_2 += i_3;
    }

    for (i_1 = 0; i_1 < 256; i_1 += 8) {
      i_2 += this.field2384[i_1];
      i_3 += this.field2384[i_1 + 1];
      i_4 += this.field2384[i_1 + 2];
      i_5 += this.field2384[i_1 + 3];
      i_6 += this.field2384[i_1 + 4];
      i_7 += this.field2384[i_1 + 5];
      i_8 += this.field2384[i_1 + 6];
      i_9 += this.field2384[i_1 + 7];
      i_2 ^= i_3 << 11;
      i_5 += i_2;
      i_3 += i_4;
      i_3 ^= i_4 >>> 2;
      i_6 += i_3;
      i_4 += i_5;
      i_4 ^= i_5 << 8;
      i_7 += i_4;
      i_5 += i_6;
      i_5 ^= i_6 >>> 16;
      i_8 += i_5;
      i_6 += i_7;
      i_6 ^= i_7 << 10;
      i_9 += i_6;
      i_7 += i_8;
      i_7 ^= i_8 >>> 4;
      i_2 += i_7;
      i_8 += i_9;
      i_8 ^= i_9 << 8;
      i_3 += i_8;
      i_9 += i_2;
      i_9 ^= i_2 >>> 9;
      i_4 += i_9;
      i_2 += i_3;
      this.field2386[i_1] = i_2;
      this.field2386[i_1 + 1] = i_3;
      this.field2386[i_1 + 2] = i_4;
      this.field2386[i_1 + 3] = i_5;
      this.field2386[i_1 + 4] = i_6;
      this.field2386[i_1 + 5] = i_7;
      this.field2386[i_1 + 6] = i_8;
      this.field2386[i_1 + 7] = i_9;
    }

    for (i_1 = 0; i_1 < 256; i_1 += 8) {
      i_2 += this.field2386[i_1];
      i_3 += this.field2386[i_1 + 1];
      i_4 += this.field2386[i_1 + 2];
      i_5 += this.field2386[i_1 + 3];
      i_6 += this.field2386[i_1 + 4];
      i_7 += this.field2386[i_1 + 5];
      i_8 += this.field2386[i_1 + 6];
      i_9 += this.field2386[i_1 + 7];
      i_2 ^= i_3 << 11;
      i_5 += i_2;
      i_3 += i_4;
      i_3 ^= i_4 >>> 2;
      i_6 += i_3;
      i_4 += i_5;
      i_4 ^= i_5 << 8;
      i_7 += i_4;
      i_5 += i_6;
      i_5 ^= i_6 >>> 16;
      i_8 += i_5;
      i_6 += i_7;
      i_6 ^= i_7 << 10;
      i_9 += i_6;
      i_7 += i_8;
      i_7 ^= i_8 >>> 4;
      i_2 += i_7;
      i_8 += i_9;
      i_8 ^= i_9 << 8;
      i_3 += i_8;
      i_9 += i_2;
      i_9 ^= i_2 >>> 9;
      i_4 += i_9;
      i_2 += i_3;
      this.field2386[i_1] = i_2;
      this.field2386[i_1 + 1] = i_3;
      this.field2386[i_1 + 2] = i_4;
      this.field2386[i_1 + 3] = i_5;
      this.field2386[i_1 + 4] = i_6;
      this.field2386[i_1 + 5] = i_7;
      this.field2386[i_1 + 6] = i_8;
      this.field2386[i_1 + 7] = i_9;
    }

    this.method3852();
    this.field2381 = 256;
  }

}
