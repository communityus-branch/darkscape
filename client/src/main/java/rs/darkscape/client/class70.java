package rs.darkscape.client;

import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
public final class class70 extends class127 {

  @ObfuscatedName("qa")
  @ObfuscatedGetter(
      longValue = 6136871153165894453L
  )
  static long field1013;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = -1404768991
  )
  int field1019 = 0;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 1843616515
  )
  int field1020 = 0;
  @ObfuscatedName("e")
  boolean field1021 = false;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -975901259
  )
  int field1023;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 1389377337
  )
  int field1014;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 1930171125
  )
  int field1015;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 1202134777
  )
  int field1016;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -904369215
  )
  int field1017;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -975475893
  )
  int field1012;
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Ljn;"
  )
  class273 field1018;

  class70(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
    this.field1023 = i_1;
    this.field1014 = i_2;
    this.field1015 = i_3;
    this.field1016 = i_4;
    this.field1017 = i_5;
    this.field1012 = i_7 + i_6;
    int i_8 = class57.method1035(this.field1023).field3271;
    if (i_8 != -1) {
      this.field1021 = false;
      this.field1018 = class3.method25(i_8);
    } else {
      this.field1021 = true;
    }

  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Ljava/io/File;ZI)Z",
      garbageValue = "307061840"
  )
  static boolean method1766(File file_0, boolean bool_1) {
    try {
      RandomAccessFile randomaccessfile_2 = new RandomAccessFile(file_0, "rw");
      int i_3 = randomaccessfile_2.read();
      randomaccessfile_2.seek(0L);
      randomaccessfile_2.write(i_3);
      randomaccessfile_2.seek(0L);
      randomaccessfile_2.close();
      if (bool_1) {
        file_0.delete();
      }

      return true;
    } catch (Exception exception_4) {
      return false;
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "5"
  )
  static int method1768(int i_0, class84 class84_1, boolean bool_2) {
    class230 class230_3;
    if (i_0 >= 2000) {
      i_0 -= 1000;
      class230_3 = class26.method434(class69.field999[--class69.field1003]);
    } else {
      class230_3 = bool_2 ? class276.field3561 : class260.field3301;
    }

    class60.method1114(class230_3);
    if (i_0 != 1200 && i_0 != 1205 && i_0 != 1212) {
      if (i_0 == 1201) {
        class230_3.field2665 = 2;
        class230_3.field2593 = class69.field999[--class69.field1003];
        return 1;
      } else if (i_0 == 1202) {
        class230_3.field2665 = 3;
        class230_3.field2593 = class138.field1876.field546.method4483();
        return 1;
      } else {
        return 2;
      }
    } else {
      class69.field1003 -= 2;
      int i_4 = class69.field999[class69.field1003];
      int i_5 = class69.field999[class69.field1003 + 1];
      class230_3.field2649 = i_4;
      class230_3.field2727 = i_5;
      class269 class269_6 = class111.method2563(i_4);
      class230_3.field2656 = class269_6.field3439;
      class230_3.field2657 = class269_6.field3440;
      class230_3.field2658 = class269_6.field3474;
      class230_3.field2592 = class269_6.field3442;
      class230_3.field2655 = class269_6.field3443;
      class230_3.field2704 = class269_6.field3438;
      if (i_0 == 1205) {
        class230_3.field2664 = 0;
      } else if (i_0 == 1212 | class269_6.field3444 == 1) {
        class230_3.field2664 = 1;
      } else {
        class230_3.field2664 = 2;
      }

      if (class230_3.field2660 > 0) {
        class230_3.field2704 = class230_3.field2704 * 32 / class230_3.field2660;
      } else if (class230_3.field2616 > 0) {
        class230_3.field2704 = class230_3.field2704 * 32 / class230_3.field2616;
      }

      return 1;
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-58"
  )
  final void method1771(int i_1) {
    if (!this.field1021) {
      this.field1020 += i_1;

      while (this.field1020 > this.field1018.field3541[this.field1019]) {
        this.field1020 -= this.field1018.field3541[this.field1019];
        ++this.field1019;
        if (this.field1019 >= this.field1018.field3540.length) {
          this.field1021 = true;
          break;
        }
      }

    }
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
  )
  protected final class119 vmethod3067() {
    class258 class258_1 = class57.method1035(this.field1023);
    class119 class119_2;
    if (!this.field1021) {
      class119_2 = class258_1.method4866(this.field1019);
    } else {
      class119_2 = class258_1.method4866(-1);
    }

    return class119_2 == null ? null : class119_2;
  }

}
