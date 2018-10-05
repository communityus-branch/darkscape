package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public class class260 extends SubNode {

  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 726327701
  )
  public static int field3294;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  public static class200 field3291 = new class200(64);
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  static AbstractPack field3292;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  static AbstractPack field3290;
  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "Lhi;"
  )
  static class230 field3301;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1006781997
  )
  public int field3293 = -1;
  @ObfuscatedName("b")
  public boolean field3295 = false;
  @ObfuscatedName("p")
  int[] field3289 = new int[]{-1, -1, -1, -1, -1};
  @ObfuscatedName("q")
  int[] field3299;
  @ObfuscatedName("k")
  short[] field3302;
  @ObfuscatedName("i")
  short[] field3296;
  @ObfuscatedName("x")
  short[] field3297;
  @ObfuscatedName("e")
  short[] field3298;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-30984690"
  )
  static int method4908(int i_0, int i_1, int i_2) {
    if (i_2 > 179) {
      i_1 /= 2;
    }

    if (i_2 > 192) {
      i_1 /= 2;
    }

    if (i_2 > 217) {
      i_1 /= 2;
    }

    if (i_2 > 243) {
      i_1 /= 2;
    }

    int i_3 = (i_1 / 32 << 7) + (i_0 / 4 << 10) + i_2 / 2;
    return i_3;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-148271753"
  )
  void method4894(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4909(class182_1, i_2);
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-1740935180"
  )
  void method4909(Buffer class182_1, int i_2) {
    if (i_2 == 1) {
      this.field3293 = class182_1.getUInt8();
    } else {
      int i_3;
      int i_4;
      if (i_2 == 2) {
        i_3 = class182_1.getUInt8();
        this.field3299 = new int[i_3];

        for (i_4 = 0; i_4 < i_3; i_4++) {
          this.field3299[i_4] = class182_1.getUInt16();
        }
      } else if (i_2 == 3) {
        this.field3295 = true;
      } else if (i_2 == 40) {
        i_3 = class182_1.getUInt8();
        this.field3302 = new short[i_3];
        this.field3296 = new short[i_3];

        for (i_4 = 0; i_4 < i_3; i_4++) {
          this.field3302[i_4] = (short) class182_1.getUInt16();
          this.field3296[i_4] = (short) class182_1.getUInt16();
        }
      } else if (i_2 == 41) {
        i_3 = class182_1.getUInt8();
        this.field3297 = new short[i_3];
        this.field3298 = new short[i_3];

        for (i_4 = 0; i_4 < i_3; i_4++) {
          this.field3297[i_4] = (short) class182_1.getUInt16();
          this.field3298[i_4] = (short) class182_1.getUInt16();
        }
      } else if (i_2 >= 60 && i_2 < 70) {
        this.field3289[i_2 - 60] = class182_1.getUInt16();
      }
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "2"
  )
  public boolean method4896() {
    if (this.field3299 == null) {
      return true;
    } else {
      boolean bool_1 = true;

      for (int i_2 = 0; i_2 < this.field3299.length; i_2++) {
        if (!field3290.method4696(this.field3299[i_2], 0)) {
          bool_1 = false;
        }
      }

      return bool_1;
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)Ldb;",
      garbageValue = "1023847556"
  )
  public class113 method4897() {
    if (this.field3299 == null) {
      return null;
    } else {
      class113[] arr_1 = new class113[this.field3299.length];

      for (int i_2 = 0; i_2 < this.field3299.length; i_2++) {
        arr_1[i_2] = class113.method2568(field3290, this.field3299[i_2], 0);
      }

      class113 class113_4;
      if (arr_1.length == 1) {
        class113_4 = arr_1[0];
      } else {
        class113_4 = new class113(arr_1, arr_1.length);
      }

      int i_3;
      if (this.field3302 != null) {
        for (i_3 = 0; i_3 < this.field3302.length; i_3++) {
          class113_4.method2581(this.field3302[i_3], this.field3296[i_3]);
        }
      }

      if (this.field3297 != null) {
        for (i_3 = 0; i_3 < this.field3297.length; i_3++) {
          class113_4.method2582(this.field3297[i_3], this.field3298[i_3]);
        }
      }

      return class113_4;
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2062826807"
  )
  public boolean method4905() {
    boolean bool_1 = true;

    for (int i_2 = 0; i_2 < 5; i_2++) {
      if (this.field3289[i_2] != -1 && !field3290.method4696(this.field3289[i_2], 0)) {
        bool_1 = false;
      }
    }

    return bool_1;
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(I)Ldb;",
      garbageValue = "1278198342"
  )
  public class113 method4899() {
    class113[] arr_1 = new class113[5];
    int i_2 = 0;

    for (int i_3 = 0; i_3 < 5; i_3++) {
      if (this.field3289[i_3] != -1) {
        arr_1[i_2++] = class113.method2568(field3290, this.field3289[i_3], 0);
      }
    }

    class113 class113_5 = new class113(arr_1, i_2);
    int i_4;
    if (this.field3302 != null) {
      for (i_4 = 0; i_4 < this.field3302.length; i_4++) {
        class113_5.method2581(this.field3302[i_4], this.field3296[i_4]);
      }
    }

    if (this.field3297 != null) {
      for (i_4 = 0; i_4 < this.field3297.length; i_4++) {
        class113_5.method2582(this.field3297[i_4], this.field3298[i_4]);
      }
    }

    return class113_5;
  }

}
