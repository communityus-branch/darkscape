package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class258 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3272;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field3279;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3267 = new class200(64);
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3265 = new class200(30);
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -1738740977
  )
  public int field3271 = -1;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -222748263
  )
  int field3280;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -1496956879
  )
  int field3276 = 128;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = -3859707
  )
  int field3277 = 128;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = 1793069157
  )
  int field3278 = 0;
  @ObfuscatedName("g")
  @ObfuscatedGetter(
      intValue = 1287651757
  )
  int field3273 = 0;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = 1462355847
  )
  int field3269 = 0;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 1890309405
  )
  int field3268;
  @ObfuscatedName("i")
  short[] field3266;
  @ObfuscatedName("x")
  short[] field3270;
  @ObfuscatedName("e")
  short[] field3274;
  @ObfuscatedName("p")
  short[] field3275;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "713149858"
  )
  void method4864(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4865(class182_1, i_2);
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "269273917"
  )
  void method4865(Buffer class182_1, int i_2) {
    if (i_2 == 1) {
      this.field3268 = class182_1.getUInt16();
    } else if (i_2 == 2) {
      this.field3271 = class182_1.getUInt16();
    } else if (i_2 == 4) {
      this.field3276 = class182_1.getUInt16();
    } else if (i_2 == 5) {
      this.field3277 = class182_1.getUInt16();
    } else if (i_2 == 6) {
      this.field3278 = class182_1.getUInt16();
    } else if (i_2 == 7) {
      this.field3273 = class182_1.getUInt8();
    } else if (i_2 == 8) {
      this.field3269 = class182_1.getUInt8();
    } else {
      int i_3;
      int i_4;
      if (i_2 == 40) {
        i_3 = class182_1.getUInt8();
        this.field3266 = new short[i_3];
        this.field3270 = new short[i_3];

        for (i_4 = 0; i_4 < i_3; i_4++) {
          this.field3266[i_4] = (short) class182_1.getUInt16();
          this.field3270[i_4] = (short) class182_1.getUInt16();
        }
      } else if (i_2 == 41) {
        i_3 = class182_1.getUInt8();
        this.field3274 = new short[i_3];
        this.field3275 = new short[i_3];

        for (i_4 = 0; i_4 < i_3; i_4++) {
          this.field3274[i_4] = (short) class182_1.getUInt16();
          this.field3275[i_4] = (short) class182_1.getUInt16();
        }
      }
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(II)Ldc;",
      garbageValue = "-226282486"
  )
  public final class119 method4866(int i_1) {
    class119 class119_2 = (class119) field3265.method3989((long) this.field3280);
    if (class119_2 == null) {
      class113 class113_3 = class113.method2568(field3279, this.field3268, 0);
      if (class113_3 == null) {
        return null;
      }

      int i_4;
      if (this.field3266 != null) {
        for (i_4 = 0; i_4 < this.field3266.length; i_4++) {
          class113_3.method2581(this.field3266[i_4], this.field3270[i_4]);
        }
      }

      if (this.field3274 != null) {
        for (i_4 = 0; i_4 < this.field3274.length; i_4++) {
          class113_3.method2582(this.field3274[i_4], this.field3275[i_4]);
        }
      }

      class119_2 = class113_3.method2589(this.field3273 + 64, this.field3269 + 850, -30, -50, -30);
      field3265.method3983(class119_2, (long) this.field3280);
    }

    class119 class119_5;
    if (this.field3271 != -1 && i_1 != -1) {
      class119_5 = class3.method25(this.field3271).method5217(class119_2, i_1);
    } else {
      class119_5 = class119_2.method2667(true);
    }

    if (this.field3276 != 128 || this.field3277 != 128) {
      class119_5.method2681(this.field3276, this.field3277, this.field3276);
    }

    if (this.field3278 != 0) {
      if (this.field3278 == 90) {
        class119_5.method2677();
      }

      if (this.field3278 == 180) {
        class119_5.method2677();
        class119_5.method2677();
      }

      if (this.field3278 == 270) {
        class119_5.method2677();
        class119_5.method2677();
        class119_5.method2677();
      }
    }

    return class119_5;
  }

}
