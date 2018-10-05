package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class111 implements class131 {

  @ObfuscatedName("fo")
  @ObfuscatedSignature(
      signature = "[Lll;"
  )
  static class318[] field1446;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  Deque field1444 = new Deque();
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -1966961957
  )
  int field1439 = 0;
  @ObfuscatedName("u")
  double field1442 = 1.0D;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -1617478817
  )
  int field1443 = 128;
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  AbstractPack field1438;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 114884877
  )
  int field1440;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "[Ldu;"
  )
  class116[] field1441;

  @ObfuscatedSignature(
      signature = "(Lir;Lir;IDI)V"
  )
  public class111(AbstractPack class247_1, AbstractPack class247_2, int i_3, double d_4, int i_6) {
    this.field1438 = class247_2;
    this.field1440 = i_3;
    this.field1439 = this.field1440;
    this.field1442 = d_4;
    this.field1443 = i_6;
    int[] ints_7 = class247_1.method4668(0);
    int i_8 = ints_7.length;
    this.field1441 = new class116[class247_1.method4636(0)];

    for (int i_9 = 0; i_9 < i_8; i_9++) {
      Buffer class182_10 = new Buffer(class247_1.method4625(0, ints_7[i_9]));
      this.field1441[ints_7[i_9]] = new class116(class182_10);
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IB)Ljt;",
      garbageValue = "56"
  )
  public static class269 method2563(int i_0) {
    class269 class269_1 = (class269) class269.field3461.method3989((long) i_0);
    if (class269_1 != null) {
      return class269_1;
    } else {
      byte[] bytes_2 = class269.field3424.method4625(10, i_0);
      class269_1 = new class269();
      class269_1.field3431 = i_0;
      if (bytes_2 != null) {
        class269_1.method5090(new Buffer(bytes_2));
      }

      class269_1.method5087();
      if (class269_1.field3465 != -1) {
        class269_1.method5126(method2563(class269_1.field3465), method2563(class269_1.field3464));
      }

      if (class269_1.field3475 != -1) {
        class269_1.method5110(method2563(class269_1.field3475), method2563(class269_1.field3473));
      }

      if (class269_1.field3477 != -1) {
        class269_1.method5091(method2563(class269_1.field3477), method2563(class269_1.field3476));
      }

      if (!class269.field3426 && class269_1.field3446) {
        class269_1.field3433 = "Members object";
        class269_1.field3436 = false;
        class269_1.field3447 = null;
        class269_1.field3425 = null;
        class269_1.field3449 = -1;
        class269_1.field3462 = 0;
        if (class269_1.field3472 != null) {
          boolean bool_3 = false;

          for (Node class204_4 = class269_1.field3472.method3955(); class204_4 != null;
              class204_4 = class269_1.field3472.method3947()) {
            class264 class264_5 = class241.method4603((int) class204_4.hashKey);
            if (class264_5.field3332) {
              class204_4.unlinkNode();
            } else {
              bool_3 = true;
            }
          }

          if (!bool_3) {
            class269_1.field3472 = null;
          }
        }
      }

      class269.field3461.method3983(class269_1, (long) i_0);
      return class269_1;
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-33"
  )
  static void method2562() {
    class81.field1167 = 0;

    for (int i_0 = 0; i_0 < 2048; i_0++) {
      class81.field1157[i_0] = null;
      class81.field1153[i_0] = 1;
    }

  }

  @ObfuscatedName("af")
  @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "41"
  )
  static int method2531(int i_0, class84 class84_1, boolean bool_2) {
    if (i_0 == 5630) {
      client.field627 = 250;
      return 1;
    } else {
      return 2;
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1808085828"
  )
  public int method2530() {
    int i_1 = 0;
    int i_2 = 0;
    class116[] arr_3 = this.field1441;

    for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
      class116 class116_5 = arr_3[i_4];
      if (class116_5 != null && class116_5.field1533 != null) {
        i_1 += class116_5.field1533.length;
        int[] ints_6 = class116_5.field1533;

        for (int i_7 = 0; i_7 < ints_6.length; i_7++) {
          int i_8 = ints_6[i_7];
          if (this.field1438.method4627(i_8)) {
            ++i_2;
          }
        }
      }
    }

    if (i_1 == 0) {
      return 0;
    } else {
      return i_2 * 100 / i_1;
    }
  }

  @ObfuscatedName("w")
  public void method2544(double d_1) {
    this.field1442 = d_1;
    this.method2561();
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "-1935357081"
  )
  public int[] vmethod3079(int i_1) {
    class116 class116_2 = this.field1441[i_1];
    if (class116_2 != null) {
      if (class116_2.field1539 != null) {
        this.field1444.addFirst(class116_2);
        class116_2.field1540 = true;
        return class116_2.field1539;
      }

      boolean bool_3 = class116_2.method2661(this.field1442, this.field1443, this.field1438);
      if (bool_3) {
        if (this.field1439 == 0) {
          class116 class116_4 = (class116) this.field1444.pollLast();
          class116_4.method2656();
        } else {
          --this.field1439;
        }

        this.field1444.addFirst(class116_2);
        class116_2.field1540 = true;
        return class116_2.field1539;
      }
    }

    return null;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "2017103535"
  )
  public int vmethod3092(int i_1) {
    return this.field1441[i_1] != null ? this.field1441[i_1].field1527 : 0;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "70"
  )
  public boolean vmethod3081(int i_1) {
    return this.field1441[i_1].field1530;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "443897939"
  )
  public boolean vmethod3082(int i_1) {
    return this.field1443 == 64;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "566742688"
  )
  public void method2561() {
    for (int i_1 = 0; i_1 < this.field1441.length; i_1++) {
      if (this.field1441[i_1] != null) {
        this.field1441[i_1].method2656();
      }
    }

    this.field1444 = new Deque();
    this.field1439 = this.field1440;
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "0"
  )
  public void method2537(int i_1) {
    for (int i_2 = 0; i_2 < this.field1441.length; i_2++) {
      class116 class116_3 = this.field1441[i_2];
      if (class116_3 != null && class116_3.field1537 != 0 && class116_3.field1540) {
        class116_3.method2657(i_1);
        class116_3.field1540 = false;
      }
    }

  }

}
