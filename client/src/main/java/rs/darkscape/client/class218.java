package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class218 extends class105 {

  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 457776721
  )
  int field2466 = 256;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -1323407617
  )
  int field2474 = 1000000;
  @ObfuscatedName("u")
  int[] field2468 = new int[16];
  @ObfuscatedName("q")
  int[] field2469 = new int[16];
  @ObfuscatedName("k")
  int[] field2473 = new int[16];
  @ObfuscatedName("i")
  int[] field2484 = new int[16];
  @ObfuscatedName("x")
  int[] field2472 = new int[16];
  @ObfuscatedName("e")
  int[] field2467 = new int[16];
  @ObfuscatedName("p")
  int[] field2465 = new int[16];
  @ObfuscatedName("b")
  int[] field2475 = new int[16];
  @ObfuscatedName("n")
  int[] field2476 = new int[16];
  @ObfuscatedName("y")
  int[] field2478 = new int[16];
  @ObfuscatedName("a")
  int[] field2479 = new int[16];
  @ObfuscatedName("j")
  int[] field2480 = new int[16];
  @ObfuscatedName("d")
  int[] field2471 = new int[16];
  @ObfuscatedName("h")
  int[] field2482 = new int[16];
  @ObfuscatedName("c")
  int[] field2483 = new int[16];
  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "[[Lhn;"
  )
  class219[][] field2470 = new class219[16][128];
  @ObfuscatedName("af")
  @ObfuscatedSignature(
      signature = "[[Lhn;"
  )
  class219[][] field2485 = new class219[16][128];
  @ObfuscatedName("ah")
  @ObfuscatedSignature(
      signature = "Lhe;"
  )
  class220 field2486 = new class220();
  @ObfuscatedName("ao")
  @ObfuscatedSignature(
      signature = "Lhz;"
  )
  class222 field2492 = new class222(this);
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  HashMap field2481 = new HashMap(128);
  @ObfuscatedName("as")
  @ObfuscatedGetter(
      longValue = 6073614026251895677L
  )
  long field2490;
  @ObfuscatedName("ab")
  boolean field2487;
  @ObfuscatedName("aw")
  @ObfuscatedGetter(
      intValue = 803571383
  )
  int field2488;
  @ObfuscatedName("ak")
  @ObfuscatedGetter(
      intValue = -1528762725
  )
  int field2489;
  @ObfuscatedName("an")
  @ObfuscatedGetter(
      longValue = 3476685645422985587L
  )
  long field2491;

  public class218() {
    this.method4216();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1769486649"
  )
  public synchronized void method4236(int i_1) {
    this.field2466 = i_1;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "392205958"
  )
  public int method4288() {
    return this.field2466;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lhq;Lir;Lcn;II)Z",
      garbageValue = "1013201658"
  )
  synchronized boolean method4198(class223 class223_1, AbstractPack class247_2, class98 class98_3,
                                  int i_4) {
    class223_1.method4412();
    boolean bool_5 = true;
    int[] ints_6 = null;
    if (i_4 > 0) {
      ints_6 = new int[]{i_4};
    }

    for (class213 class213_7 = (class213) class223_1.field2547.method4018(); class213_7 != null;
        class213_7 = (class213) class223_1.field2547.method4019()) {
      int i_8 = (int) class213_7.hashKey;
      class221 class221_9 = (class221) this.field2481.get((long) i_8);
      if (class221_9 == null) {
        byte[] bytes_11 = class247_2.get(i_8);
        class221 class221_10;
        if (bytes_11 == null) {
          class221_10 = null;
        } else {
          class221_10 = new class221(bytes_11);
        }

        class221_9 = class221_10;
        if (class221_10 == null) {
          bool_5 = false;
          continue;
        }

        this.field2481.put(class221_10, (long) i_8);
      }

      if (!class221_9.method4372(class98_3, class213_7.field2440, ints_6)) {
        bool_5 = false;
      }
    }

    if (bool_5) {
      class223_1.method4413();
    }

    return bool_5;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2111468279"
  )
  synchronized void method4199() {
    for (class221 class221_1 = (class221) this.field2481.method4018(); class221_1 != null;
        class221_1 = (class221) this.field2481.method4019()) {
      class221_1.method4373();
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1788128150"
  )
  public synchronized void method4200() {
    for (class221 class221_1 = (class221) this.field2481.method4018(); class221_1 != null;
        class221_1 = (class221) this.field2481.method4019()) {
      class221_1.unlinkNode();
    }

  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "()Ldo;"
  )
  protected synchronized class105 vmethod4382() {
    return this.field2492;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "()Ldo;"
  )
  protected synchronized class105 vmethod4389() {
    return null;
  }

  @ObfuscatedName("x")
  protected synchronized int vmethod4395() {
    return 0;
  }

  @ObfuscatedName("e")
  protected synchronized void vmethod4385(int[] ints_1, int i_2, int i_3) {
    if (this.field2486.method4345()) {
      int i_4 = this.field2486.field2519 * this.field2474 / class95.field1300;

      do {
        long long_5 = this.field2490 + (long) i_3 * (long) i_4;
        if (this.field2491 - long_5 >= 0L) {
          this.field2490 = long_5;
          break;
        }

        int i_7 = (int) ((this.field2491 - this.field2490 + (long) i_4 - 1L) / (long) i_4);
        this.field2490 += (long) i_4 * (long) i_7;
        this.field2492.vmethod4385(ints_1, i_2, i_7);
        i_2 += i_7;
        i_3 -= i_7;
        this.method4277();
      } while (this.field2486.method4345());
    }

    this.field2492.vmethod4385(ints_1, i_2, i_3);
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(Lhq;ZI)V",
      garbageValue = "1233433858"
  )
  synchronized void method4267(class223 class223_1, boolean bool_2) {
    this.method4202();
    this.field2486.method4328(class223_1.field2546);
    this.field2487 = bool_2;
    this.field2490 = 0L;
    int i_3 = this.field2486.method4331();

    for (int i_4 = 0; i_4 < i_3; i_4++) {
      this.field2486.method4350(i_4);
      this.field2486.method4335(i_4);
      this.field2486.method4333(i_4);
    }

    this.field2488 = this.field2486.method4339();
    this.field2489 = this.field2486.field2525[this.field2488];
    this.field2491 = this.field2486.method4338(this.field2489);
  }

  @ObfuscatedName("b")
  protected synchronized void vmethod4386(int i_1) {
    if (this.field2486.method4345()) {
      int i_2 = this.field2486.field2519 * this.field2474 / class95.field1300;

      do {
        long long_3 = (long) i_1 * (long) i_2 + this.field2490;
        if (this.field2491 - long_3 >= 0L) {
          this.field2490 = long_3;
          break;
        }

        int i_5 = (int) ((this.field2491 - this.field2490 + (long) i_2 - 1L) / (long) i_2);
        this.field2490 += (long) i_5 * (long) i_2;
        this.field2492.vmethod4386(i_5);
        i_1 -= i_5;
        this.method4277();
      } while (this.field2486.method4345());
    }

    this.field2492.vmethod4386(i_1);
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "27"
  )
  public synchronized void method4202() {
    this.field2486.method4329();
    this.method4216();
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1343580600"
  )
  public synchronized boolean method4203() {
    return this.field2486.method4345();
  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "2070435347"
  )
  public synchronized void method4257(int i_1, int i_2) {
    this.method4205(i_1, i_2);
  }

  @ObfuscatedName("m")
  @ObfuscatedSignature(
      signature = "(IIS)V",
      garbageValue = "-9665"
  )
  void method4205(int i_1, int i_2) {
    this.field2484[i_1] = i_2;
    this.field2467[i_1] = i_2 & ~0x7f;
    this.method4206(i_1, i_2);
  }

  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "75"
  )
  void method4206(int i_1, int i_2) {
    if (i_2 != this.field2472[i_1]) {
      this.field2472[i_1] = i_2;

      for (int i_3 = 0; i_3 < 128; i_3++) {
        this.field2485[i_1][i_3] = null;
      }
    }

  }

  @ObfuscatedName("t")
  @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "254280843"
  )
  void method4305(int i_1, int i_2, int i_3) {
    this.method4209(i_1, i_2, 64);
    if ((this.field2478[i_1] & 0x2) != 0) {
      for (class219 class219_4 = (class219) this.field2492.field2543.getLast();
          class219_4 != null; class219_4 = (class219) this.field2492.field2543.getPrevious()) {
        if (class219_4.field2500 == i_1 && class219_4.field2508 < 0) {
          this.field2470[i_1][class219_4.field2502] = null;
          this.field2470[i_1][i_2] = class219_4;
          int i_5 = (class219_4.field2504 * class219_4.field2503 >> 12) + class219_4.field2516;
          class219_4.field2516 += i_2 - class219_4.field2502 << 8;
          class219_4.field2503 = i_5 - class219_4.field2516;
          class219_4.field2504 = 4096;
          class219_4.field2502 = i_2;
          return;
        }
      }
    }

    class221 class221_9 = (class221) this.field2481.get((long) this.field2472[i_1]);
    if (class221_9 != null) {
      class93 class93_8 = class221_9.field2533[i_2];
      if (class93_8 != null) {
        class219 class219_6 = new class219();
        class219_6.field2500 = i_1;
        class219_6.field2517 = class221_9;
        class219_6.field2496 = class93_8;
        class219_6.field2511 = class221_9.field2537[i_2];
        class219_6.field2498 = class221_9.field2538[i_2];
        class219_6.field2502 = i_2;
        class219_6.field2507 =
            i_3 * i_3 * class221_9.field2532[i_2] * class221_9.field2540 + 1024 >> 11;
        class219_6.field2501 = class221_9.field2536[i_2] & 0xff;
        class219_6.field2516 = (i_2 << 8) - (class221_9.field2534[i_2] & 0x7fff);
        class219_6.field2505 = 0;
        class219_6.field2506 = 0;
        class219_6.field2497 = 0;
        class219_6.field2508 = -1;
        class219_6.field2495 = 0;
        if (this.field2471[i_1] == 0) {
          class219_6.field2512 = class103
              .method2256(class93_8, this.method4249(class219_6), this.method4222(class219_6),
                          this.method4286(class219_6));
        } else {
          class219_6.field2512 = class103
              .method2256(class93_8, this.method4249(class219_6), 0, this.method4286(class219_6));
          this.method4208(class219_6, class221_9.field2534[i_2] < 0);
        }

        if (class221_9.field2534[i_2] < 0) {
          class219_6.field2512.method2258(-1);
        }

        if (class219_6.field2498 >= 0) {
          class219 class219_7 = this.field2485[i_1][class219_6.field2498];
          if (class219_7 != null && class219_7.field2508 < 0) {
            this.field2470[i_1][class219_7.field2502] = null;
            class219_7.field2508 = 0;
          }

          this.field2485[i_1][class219_6.field2498] = class219_6;
        }

        this.field2492.field2543.addLast(class219_6);
        this.field2470[i_1][i_2] = class219_6;
      }
    }
  }

  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "(Lhn;ZI)V",
      garbageValue = "1940134269"
  )
  void method4208(class219 class219_1, boolean bool_2) {
    int i_3 = class219_1.field2496.field1278.length;
    int i_4;
    if (bool_2 && class219_1.field2496.field1281) {
      int i_5 = i_3 + i_3 - class219_1.field2496.field1277;
      i_4 = (int) ((long) i_5 * (long) this.field2471[class219_1.field2500] >> 6);
      i_3 <<= 8;
      if (i_4 >= i_3) {
        i_4 = i_3 + i_3 - 1 - i_4;
        class219_1.field2512.method2307();
      }
    } else {
      i_4 = (int) ((long) i_3 * (long) this.field2471[class219_1.field2500] >> 6);
    }

    class219_1.field2512.method2264(i_4);
  }

  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-1229887011"
  )
  void method4209(int i_1, int i_2, int i_3) {
    class219 class219_4 = this.field2470[i_1][i_2];
    if (class219_4 != null) {
      this.field2470[i_1][i_2] = null;
      if ((this.field2478[i_1] & 0x2) != 0) {
        for (class219 class219_5 = (class219) this.field2492.field2543.getFirst();
            class219_5 != null; class219_5 = (class219) this.field2492.field2543.getNext()) {
          if (class219_5.field2500 == class219_4.field2500 && class219_5.field2508 < 0
              && class219_4 != class219_5) {
            class219_4.field2508 = 0;
            break;
          }
        }
      } else {
        class219_4.field2508 = 0;
      }

    }
  }

  @ObfuscatedName("a")
  @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-962421621"
  )
  void method4210(int i_1, int i_2, int i_3) {
  }

  @ObfuscatedName("c")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1379201347"
  )
  void method4211(int i_1, int i_2) {
  }

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "(IIS)V",
      garbageValue = "-29508"
  )
  void method4212(int i_1, int i_2) {
    this.field2465[i_1] = i_2;
  }

  @ObfuscatedName("ai")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "70"
  )
  void method4213(int i_1) {
    for (class219 class219_2 = (class219) this.field2492.field2543.getFirst(); class219_2 != null;
        class219_2 = (class219) this.field2492.field2543.getNext()) {
      if (i_1 < 0 || class219_2.field2500 == i_1) {
        if (class219_2.field2512 != null) {
          class219_2.field2512.method2269(class95.field1300 / 100);
          if (class219_2.field2512.method2273()) {
            this.field2492.field2544.method2032(class219_2.field2512);
          }

          class219_2.method4322();
        }

        if (class219_2.field2508 < 0) {
          this.field2470[class219_2.field2500][class219_2.field2502] = null;
        }

        class219_2.unlinkNode();
      }
    }

  }

  @ObfuscatedName("ac")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1809929257"
  )
  void method4241(int i_1) {
    if (i_1 >= 0) {
      this.field2468[i_1] = 12800;
      this.field2469[i_1] = 8192;
      this.field2473[i_1] = 16383;
      this.field2465[i_1] = 8192;
      this.field2475[i_1] = 0;
      this.field2476[i_1] = 8192;
      this.method4278(i_1);
      this.method4218(i_1);
      this.field2478[i_1] = 0;
      this.field2479[i_1] = 32767;
      this.field2480[i_1] = 256;
      this.field2471[i_1] = 0;
      this.method4309(i_1, 8192);
    } else {
      for (i_1 = 0; i_1 < 16; i_1++) {
        this.method4241(i_1);
      }

    }
  }

  @ObfuscatedName("ap")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2037469354"
  )
  void method4215(int i_1) {
    for (class219 class219_2 = (class219) this.field2492.field2543.getFirst(); class219_2 != null;
        class219_2 = (class219) this.field2492.field2543.getNext()) {
      if ((i_1 < 0 || class219_2.field2500 == i_1) && class219_2.field2508 < 0) {
        this.field2470[class219_2.field2500][class219_2.field2502] = null;
        class219_2.field2508 = 0;
      }
    }

  }

  @ObfuscatedName("aa")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2143238650"
  )
  void method4216() {
    this.method4213(-1);
    this.method4241(-1);

    int i_1;
    for (i_1 = 0; i_1 < 16; i_1++) {
      this.field2472[i_1] = this.field2484[i_1];
    }

    for (i_1 = 0; i_1 < 16; i_1++) {
      this.field2467[i_1] = this.field2484[i_1] & ~0x7f;
    }

  }

  @ObfuscatedName("al")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-84179680"
  )
  void method4278(int i_1) {
    if ((this.field2478[i_1] & 0x2) != 0) {
      for (class219 class219_2 = (class219) this.field2492.field2543.getFirst();
          class219_2 != null; class219_2 = (class219) this.field2492.field2543.getNext()) {
        if (class219_2.field2500 == i_1 && this.field2470[i_1][class219_2.field2502] == null
            && class219_2.field2508 < 0) {
          class219_2.field2508 = 0;
        }
      }
    }

  }

  @ObfuscatedName("ae")
  @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "-16188"
  )
  void method4218(int i_1) {
    if ((this.field2478[i_1] & 0x4) != 0) {
      for (class219 class219_2 = (class219) this.field2492.field2543.getFirst();
          class219_2 != null; class219_2 = (class219) this.field2492.field2543.getNext()) {
        if (class219_2.field2500 == i_1) {
          class219_2.field2514 = 0;
        }
      }
    }

  }

  @ObfuscatedName("am")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1648204035"
  )
  void method4219(int i_1) {
    int i_2 = i_1 & 0xf0;
    int i_3;
    int i_4;
    int i_5;
    if (i_2 == 128) {
      i_3 = i_1 & 0xf;
      i_4 = i_1 >> 8 & 0x7f;
      i_5 = i_1 >> 16 & 0x7f;
      this.method4209(i_3, i_4, i_5);
    } else if (i_2 == 144) {
      i_3 = i_1 & 0xf;
      i_4 = i_1 >> 8 & 0x7f;
      i_5 = i_1 >> 16 & 0x7f;
      if (i_5 > 0) {
        this.method4305(i_3, i_4, i_5);
      } else {
        this.method4209(i_3, i_4, 64);
      }

    } else if (i_2 == 160) {
      i_3 = i_1 & 0xf;
      i_4 = i_1 >> 8 & 0x7f;
      i_5 = i_1 >> 16 & 0x7f;
      this.method4210(i_3, i_4, i_5);
    } else if (i_2 == 176) {
      i_3 = i_1 & 0xf;
      i_4 = i_1 >> 8 & 0x7f;
      i_5 = i_1 >> 16 & 0x7f;
      if (i_4 == 0) {
        this.field2467[i_3] = (i_5 << 14) + (this.field2467[i_3] & ~0x1fc000);
      }

      if (i_4 == 32) {
        this.field2467[i_3] = (i_5 << 7) + (this.field2467[i_3] & ~0x3f80);
      }

      if (i_4 == 1) {
        this.field2475[i_3] = (i_5 << 7) + (this.field2475[i_3] & ~0x3f80);
      }

      if (i_4 == 33) {
        this.field2475[i_3] = i_5 + (this.field2475[i_3] & ~0x7f);
      }

      if (i_4 == 5) {
        this.field2476[i_3] = (i_5 << 7) + (this.field2476[i_3] & ~0x3f80);
      }

      if (i_4 == 37) {
        this.field2476[i_3] = i_5 + (this.field2476[i_3] & ~0x7f);
      }

      if (i_4 == 7) {
        this.field2468[i_3] = (i_5 << 7) + (this.field2468[i_3] & ~0x3f80);
      }

      if (i_4 == 39) {
        this.field2468[i_3] = i_5 + (this.field2468[i_3] & ~0x7f);
      }

      if (i_4 == 10) {
        this.field2469[i_3] = (i_5 << 7) + (this.field2469[i_3] & ~0x3f80);
      }

      if (i_4 == 42) {
        this.field2469[i_3] = i_5 + (this.field2469[i_3] & ~0x7f);
      }

      if (i_4 == 11) {
        this.field2473[i_3] = (i_5 << 7) + (this.field2473[i_3] & ~0x3f80);
      }

      if (i_4 == 43) {
        this.field2473[i_3] = i_5 + (this.field2473[i_3] & ~0x7f);
      }

      if (i_4 == 64) {
        if (i_5 >= 64) {
          this.field2478[i_3] |= 0x1;
        } else {
          this.field2478[i_3] &= ~0x1;
        }
      }

      if (i_4 == 65) {
        if (i_5 >= 64) {
          this.field2478[i_3] |= 0x2;
        } else {
          this.method4278(i_3);
          this.field2478[i_3] &= ~0x2;
        }
      }

      if (i_4 == 99) {
        this.field2479[i_3] = (i_5 << 7) + (this.field2479[i_3] & 0x7f);
      }

      if (i_4 == 98) {
        this.field2479[i_3] = (this.field2479[i_3] & 0x3f80) + i_5;
      }

      if (i_4 == 101) {
        this.field2479[i_3] = (i_5 << 7) + (this.field2479[i_3] & 0x7f) + 16384;
      }

      if (i_4 == 100) {
        this.field2479[i_3] = (this.field2479[i_3] & 0x3f80) + i_5 + 16384;
      }

      if (i_4 == 120) {
        this.method4213(i_3);
      }

      if (i_4 == 121) {
        this.method4241(i_3);
      }

      if (i_4 == 123) {
        this.method4215(i_3);
      }

      int i_6;
      if (i_4 == 6) {
        i_6 = this.field2479[i_3];
        if (i_6 == 16384) {
          this.field2480[i_3] = (i_5 << 7) + (this.field2480[i_3] & ~0x3f80);
        }
      }

      if (i_4 == 38) {
        i_6 = this.field2479[i_3];
        if (i_6 == 16384) {
          this.field2480[i_3] = i_5 + (this.field2480[i_3] & ~0x7f);
        }
      }

      if (i_4 == 16) {
        this.field2471[i_3] = (i_5 << 7) + (this.field2471[i_3] & ~0x3f80);
      }

      if (i_4 == 48) {
        this.field2471[i_3] = i_5 + (this.field2471[i_3] & ~0x7f);
      }

      if (i_4 == 81) {
        if (i_5 >= 64) {
          this.field2478[i_3] |= 0x4;
        } else {
          this.method4218(i_3);
          this.field2478[i_3] &= ~0x4;
        }
      }

      if (i_4 == 17) {
        this.method4309(i_3, (i_5 << 7) + (this.field2482[i_3] & ~0x3f80));
      }

      if (i_4 == 49) {
        this.method4309(i_3, i_5 + (this.field2482[i_3] & ~0x7f));
      }

    } else if (i_2 == 192) {
      i_3 = i_1 & 0xf;
      i_4 = i_1 >> 8 & 0x7f;
      this.method4206(i_3, i_4 + this.field2467[i_3]);
    } else if (i_2 == 208) {
      i_3 = i_1 & 0xf;
      i_4 = i_1 >> 8 & 0x7f;
      this.method4211(i_3, i_4);
    } else if (i_2 == 224) {
      i_3 = i_1 & 0xf;
      i_4 = (i_1 >> 8 & 0x7f) + (i_1 >> 9 & 0x3f80);
      this.method4212(i_3, i_4);
    } else {
      i_2 = i_1 & 0xff;
      if (i_2 == 255) {
        this.method4216();
      }
    }
  }

  @ObfuscatedName("ay")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2103498086"
  )
  void method4309(int i_1, int i_2) {
    this.field2482[i_1] = i_2;
    this.field2483[i_1] = (int) (2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double) i_2)
        + 0.5D);
  }

  @ObfuscatedName("ag")
  @ObfuscatedSignature(
      signature = "(Lhn;I)I",
      garbageValue = "497644695"
  )
  int method4249(class219 class219_1) {
    int i_2 = (class219_1.field2503 * class219_1.field2504 >> 12) + class219_1.field2516;
    i_2 +=
        (this.field2465[class219_1.field2500] - 8192) * this.field2480[class219_1.field2500] >> 12;
    class216 class216_3 = class219_1.field2511;
    int i_4;
    if (class216_3.field2452 > 0 && (class216_3.field2453 > 0
        || this.field2475[class219_1.field2500] > 0)) {
      i_4 = class216_3.field2453 << 2;
      int i_5 = class216_3.field2454 << 1;
      if (class219_1.field2499 < i_5) {
        i_4 = i_4 * class219_1.field2499 / i_5;
      }

      i_4 += this.field2475[class219_1.field2500] >> 7;
      double d_6 = Math.sin(0.01227184630308513D * (double) (class219_1.field2509 & 0x1ff));
      i_2 += (int) (d_6 * (double) i_4);
    }

    i_4 = (int) ((double) (class219_1.field2496.field1279 * 256) * Math
        .pow(2.0D, (double) i_2 * 3.255208333333333E-4D) / (double) class95.field1300 + 0.5D);
    return i_4 < 1 ? 1 : i_4;
  }

  @ObfuscatedName("bk")
  @ObfuscatedSignature(
      signature = "(Lhn;I)I",
      garbageValue = "2064514172"
  )
  int method4222(class219 class219_1) {
    class216 class216_2 = class219_1.field2511;
    int i_3 =
        this.field2473[class219_1.field2500] * this.field2468[class219_1.field2500] + 4096 >> 13;
    i_3 = i_3 * i_3 + 16384 >> 15;
    i_3 = i_3 * class219_1.field2507 + 16384 >> 15;
    i_3 = i_3 * this.field2466 + 128 >> 8;
    if (class216_2.field2448 > 0) {
      i_3 = (int) ((double) i_3 * Math
          .pow(0.5D, 1.953125E-5D * (double) class219_1.field2505 * (double) class216_2.field2448)
          + 0.5D);
    }

    int i_4;
    int i_5;
    int i_6;
    int i_7;
    if (class216_2.field2447 != null) {
      i_4 = class219_1.field2506;
      i_5 = class216_2.field2447[class219_1.field2497 + 1];
      if (class219_1.field2497 < class216_2.field2447.length - 2) {
        i_6 = (class216_2.field2447[class219_1.field2497] & 0xff) << 8;
        i_7 = (class216_2.field2447[class219_1.field2497 + 2] & 0xff) << 8;
        i_5 += (i_4 - i_6) * (class216_2.field2447[class219_1.field2497 + 3] - i_5) / (i_7 - i_6);
      }

      i_3 = i_3 * i_5 + 32 >> 6;
    }

    if (class219_1.field2508 > 0 && class216_2.field2449 != null) {
      i_4 = class219_1.field2508;
      i_5 = class216_2.field2449[class219_1.field2495 + 1];
      if (class219_1.field2495 < class216_2.field2449.length - 2) {
        i_6 = (class216_2.field2449[class219_1.field2495] & 0xff) << 8;
        i_7 = (class216_2.field2449[class219_1.field2495 + 2] & 0xff) << 8;
        i_5 += (i_4 - i_6) * (class216_2.field2449[class219_1.field2495 + 3] - i_5) / (i_7 - i_6);
      }

      i_3 = i_5 * i_3 + 32 >> 6;
    }

    return i_3;
  }

  @ObfuscatedName("bp")
  @ObfuscatedSignature(
      signature = "(Lhn;I)I",
      garbageValue = "1858181418"
  )
  int method4286(class219 class219_1) {
    int i_2 = this.field2469[class219_1.field2500];
    return i_2 < 8192 ? i_2 * class219_1.field2501 + 32 >> 6
        : 16384 - ((128 - class219_1.field2501) * (16384 - i_2) + 32 >> 6);
  }

  @ObfuscatedName("bi")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1502621602"
  )
  void method4277() {
    int i_1 = this.field2488;
    int i_2 = this.field2489;

    long long_3;
    for (long_3 = this.field2491; i_2 == this.field2489; long_3 = this.field2486.method4338(i_2)) {
      while (i_2 == this.field2486.field2525[i_1]) {
        this.field2486.method4350(i_1);
        int i_5 = this.field2486.method4336(i_1);
        if (i_5 == 1) {
          this.field2486.method4334();
          this.field2486.method4333(i_1);
          if (this.field2486.method4340()) {
            if (!this.field2487 || i_2 == 0) {
              this.method4216();
              this.field2486.method4329();
              return;
            }

            this.field2486.method4341(long_3);
          }
          break;
        }

        if ((i_5 & 0x80) != 0) {
          this.method4219(i_5);
        }

        this.field2486.method4335(i_1);
        this.field2486.method4333(i_1);
      }

      i_1 = this.field2486.method4339();
      i_2 = this.field2486.field2525[i_1];
    }

    this.field2488 = i_1;
    this.field2489 = i_2;
    this.field2491 = long_3;
  }

  @ObfuscatedName("bj")
  @ObfuscatedSignature(
      signature = "(Lhn;I)Z",
      garbageValue = "724893779"
  )
  boolean method4230(class219 class219_1) {
    if (class219_1.field2512 == null) {
      if (class219_1.field2508 >= 0) {
        class219_1.unlinkNode();
        if (class219_1.field2498 > 0
            && class219_1 == this.field2485[class219_1.field2500][class219_1.field2498]) {
          this.field2485[class219_1.field2500][class219_1.field2498] = null;
        }
      }

      return true;
    } else {
      return false;
    }
  }

  @ObfuscatedName("bo")
  @ObfuscatedSignature(
      signature = "(Lhn;[IIII)Z",
      garbageValue = "-549826874"
  )
  boolean method4231(class219 class219_1, int[] ints_2, int i_3, int i_4) {
    class219_1.field2513 = class95.field1300 / 100;
    if (class219_1.field2508 < 0 || class219_1.field2512 != null && !class219_1.field2512
        .method2272()) {
      int i_5 = class219_1.field2504;
      if (i_5 > 0) {
        i_5 -= (int) (16.0D * Math
            .pow(2.0D, 4.921259842519685E-4D * (double) this.field2476[class219_1.field2500])
            + 0.5D);
        if (i_5 < 0) {
          i_5 = 0;
        }

        class219_1.field2504 = i_5;
      }

      class219_1.field2512.method2270(this.method4249(class219_1));
      class216 class216_6 = class219_1.field2511;
      boolean bool_7 = false;
      ++class219_1.field2499;
      class219_1.field2509 += class216_6.field2452;
      double d_8 =
          (double) ((class219_1.field2502 - 60 << 8) + (class219_1.field2503 * class219_1.field2504
              >> 12)) * 5.086263020833333E-6D;
      if (class216_6.field2448 > 0) {
        if (class216_6.field2451 > 0) {
          class219_1.field2505 += (int) (
              128.0D * Math.pow(2.0D, d_8 * (double) class216_6.field2451) + 0.5D);
        } else {
          class219_1.field2505 += 128;
        }
      }

      if (class216_6.field2447 != null) {
        if (class216_6.field2450 > 0) {
          class219_1.field2506 += (int) (
              128.0D * Math.pow(2.0D, (double) class216_6.field2450 * d_8) + 0.5D);
        } else {
          class219_1.field2506 += 128;
        }

        while (class219_1.field2497 < class216_6.field2447.length - 2 && class219_1.field2506
            > (class216_6.field2447[class219_1.field2497 + 2] & 0xff) << 8) {
          class219_1.field2497 += 2;
        }

        if (class216_6.field2447.length - 2 == class219_1.field2497
            && class216_6.field2447[class219_1.field2497 + 1] == 0) {
          bool_7 = true;
        }
      }

      if (class219_1.field2508 >= 0 && class216_6.field2449 != null
          && (this.field2478[class219_1.field2500] & 0x1) == 0 && (class219_1.field2498 < 0
          || class219_1 != this.field2485[class219_1.field2500][class219_1.field2498])) {
        if (class216_6.field2446 > 0) {
          class219_1.field2508 += (int) (
              128.0D * Math.pow(2.0D, (double) class216_6.field2446 * d_8) + 0.5D);
        } else {
          class219_1.field2508 += 128;
        }

        while (class219_1.field2495 < class216_6.field2449.length - 2 && class219_1.field2508
            > (class216_6.field2449[class219_1.field2495 + 2] & 0xff) << 8) {
          class219_1.field2495 += 2;
        }

        if (class216_6.field2449.length - 2 == class219_1.field2495) {
          bool_7 = true;
        }
      }

      if (bool_7) {
        class219_1.field2512.method2269(class219_1.field2513);
        if (ints_2 != null) {
          class219_1.field2512.vmethod4385(ints_2, i_3, i_4);
        } else {
          class219_1.field2512.vmethod4386(i_4);
        }

        if (class219_1.field2512.method2273()) {
          this.field2492.field2544.method2032(class219_1.field2512);
        }

        class219_1.method4322();
        if (class219_1.field2508 >= 0) {
          class219_1.unlinkNode();
          if (class219_1.field2498 > 0
              && class219_1 == this.field2485[class219_1.field2500][class219_1.field2498]) {
            this.field2485[class219_1.field2500][class219_1.field2498] = null;
          }
        }

        return true;
      } else {
        class219_1.field2512.method2268(class219_1.field2513, this.method4222(class219_1),
                                        this.method4286(class219_1));
        return false;
      }
    } else {
      class219_1.method4322();
      class219_1.unlinkNode();
      if (class219_1.field2498 > 0
          && class219_1 == this.field2485[class219_1.field2500][class219_1.field2498]) {
        this.field2485[class219_1.field2500][class219_1.field2498] = null;
      }

      return true;
    }
  }

}
