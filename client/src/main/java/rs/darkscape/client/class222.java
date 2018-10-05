package rs.darkscape.client;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class222 extends class105 {

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  Deque field2543 = new Deque();
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lca;"
  )
  class88 field2544 = new class88();
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lhg;"
  )
  class218 field2545;

  @ObfuscatedSignature(
      signature = "(Lhg;)V"
  )
  class222(class218 class218_1) {
    this.field2545 = class218_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1679554365"
  )
  public static void method4410(boolean bool_0) {
    if (AssetService.socket != null) {
      try {
        Buffer class182_1 = new Buffer(4);
        class182_1.putInt8(bool_0 ? 2 : 3);
        class182_1.method3534(0);
        AssetService.socket.write(class182_1.bytes, 0, 4);
      } catch (IOException ioexception_4) {
        try {
          AssetService.socket.close();
        } catch (Exception ignored) {
        }

        ++AssetService.field3215;
        AssetService.socket = null;
      }

    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lhn;[IIIIB)V",
      garbageValue = "-60"
  )
  void method4387(class219 class219_1, int[] ints_2, int i_3, int i_4, int i_5) {
    if ((this.field2545.field2478[class219_1.field2500] & 0x4) != 0 && class219_1.field2508 < 0) {
      int i_6 = this.field2545.field2483[class219_1.field2500] / class95.field1300;

      while (true) {
        int i_7 = (i_6 + 1048575 - class219_1.field2514) / i_6;
        if (i_7 > i_4) {
          class219_1.field2514 += i_4 * i_6;
          break;
        }

        class219_1.field2512.vmethod4385(ints_2, i_3, i_7);
        i_3 += i_7;
        i_4 -= i_7;
        class219_1.field2514 += i_6 * i_7 - 1048576;
        int i_8 = class95.field1300 / 100;
        int i_9 = 262144 / i_6;
        if (i_9 < i_8) {
          i_8 = i_9;
        }

        class103 class103_10 = class219_1.field2512;
        if (this.field2545.field2471[class219_1.field2500] == 0) {
          class219_1.field2512 = class103
              .method2256(class219_1.field2496, class103_10.method2351(), class103_10.method2262(),
                          class103_10.method2263());
        } else {
          class219_1.field2512 = class103
              .method2256(class219_1.field2496, class103_10.method2351(), 0,
                          class103_10.method2263());
          this.field2545
              .method4208(class219_1, class219_1.field2517.field2534[class219_1.field2502] < 0);
          class219_1.field2512.method2408(i_8, class103_10.method2262());
        }

        if (class219_1.field2517.field2534[class219_1.field2502] < 0) {
          class219_1.field2512.method2258(-1);
        }

        class103_10.method2269(i_8);
        class103_10.vmethod4385(ints_2, i_3, i_5 - i_3);
        if (class103_10.method2273()) {
          this.field2544.method2032(class103_10);
        }
      }
    }

    class219_1.field2512.vmethod4385(ints_2, i_3, i_4);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lhn;II)V",
      garbageValue = "-1604012040"
  )
  void method4388(class219 class219_1, int i_2) {
    if ((this.field2545.field2478[class219_1.field2500] & 0x4) != 0 && class219_1.field2508 < 0) {
      int i_3 = this.field2545.field2483[class219_1.field2500] / class95.field1300;
      int i_4 = (i_3 + 1048575 - class219_1.field2514) / i_3;
      class219_1.field2514 = i_3 * i_2 + class219_1.field2514 & 0xfffff;
      if (i_4 <= i_2) {
        if (this.field2545.field2471[class219_1.field2500] == 0) {
          class219_1.field2512 = class103
              .method2256(class219_1.field2496, class219_1.field2512.method2351(),
                          class219_1.field2512.method2262(), class219_1.field2512.method2263());
        } else {
          class219_1.field2512 = class103
              .method2256(class219_1.field2496, class219_1.field2512.method2351(), 0,
                          class219_1.field2512.method2263());
          this.field2545
              .method4208(class219_1, class219_1.field2517.field2534[class219_1.field2502] < 0);
        }

        if (class219_1.field2517.field2534[class219_1.field2502] < 0) {
          class219_1.field2512.method2258(-1);
        }

        i_2 = class219_1.field2514 / i_3;
      }
    }

    class219_1.field2512.vmethod4386(i_2);
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "()Ldo;"
  )
  protected class105 vmethod4382() {
    class219 class219_1 = (class219) this.field2543.getFirst();
    return (class105) (class219_1 == null ? null
        : (class219_1.field2512 != null ? class219_1.field2512 : this.vmethod4389()));
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "()Ldo;"
  )
  protected class105 vmethod4389() {
    class219 class219_1;
    do {
      class219_1 = (class219) this.field2543.getNext();
      if (class219_1 == null) {
        return null;
      }
    } while (class219_1.field2512 == null);

    return class219_1.field2512;
  }

  @ObfuscatedName("x")
  protected int vmethod4395() {
    return 0;
  }

  @ObfuscatedName("e")
  protected void vmethod4385(int[] ints_1, int i_2, int i_3) {
    this.field2544.vmethod4385(ints_1, i_2, i_3);

    for (class219 class219_6 = (class219) this.field2543.getFirst(); class219_6 != null;
        class219_6 = (class219) this.field2543.getNext()) {
      if (!this.field2545.method4230(class219_6)) {
        int i_4 = i_2;
        int i_5 = i_3;

        do {
          if (i_5 <= class219_6.field2513) {
            this.method4387(class219_6, ints_1, i_4, i_5, i_4 + i_5);
            class219_6.field2513 -= i_5;
            break;
          }

          this.method4387(class219_6, ints_1, i_4, class219_6.field2513, i_4 + i_5);
          i_4 += class219_6.field2513;
          i_5 -= class219_6.field2513;
        } while (!this.field2545.method4231(class219_6, ints_1, i_4, i_5));
      }
    }

  }

  @ObfuscatedName("b")
  protected void vmethod4386(int i_1) {
    this.field2544.vmethod4386(i_1);

    for (class219 class219_3 = (class219) this.field2543.getFirst(); class219_3 != null;
        class219_3 = (class219) this.field2543.getNext()) {
      if (!this.field2545.method4230(class219_3)) {
        int i_2 = i_1;

        do {
          if (i_2 <= class219_3.field2513) {
            this.method4388(class219_3, i_2);
            class219_3.field2513 -= i_2;
            break;
          }

          this.method4388(class219_3, class219_3.field2513);
          i_2 -= class219_3.field2513;
        } while (!this.field2545.method4231(class219_3, (int[]) null, 0, i_2));
      }
    }

  }

}
