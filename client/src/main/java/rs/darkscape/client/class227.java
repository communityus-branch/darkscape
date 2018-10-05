package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class227 {

  @ObfuscatedName("p")
  static final int[] field2579 = new int[]{8, 11, 4, 6, 9, 7, 10};
  @ObfuscatedName("k")
  public static short[] field2575;
  @ObfuscatedName("i")
  public static short[][] field2572;
  @ObfuscatedName("x")
  public static short[] field2577;
  @ObfuscatedName("e")
  public static short[][] field2578;
  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  static class200 field2580 = new class200(260);
  @ObfuscatedName("s")
  public boolean field2571;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 1734814155
  )
  public int field2569;
  @ObfuscatedName("z")
  int[] field2570;
  @ObfuscatedName("w")
  int[] field2576;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      longValue = -1819394091005678963L
  )
  long field2573;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      longValue = 7379530444611537843L
  )
  long field2574;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([I[IZII)V",
      garbageValue = "1119812304"
  )
  public void method4462(int[] ints_1, int[] ints_2, boolean bool_3, int i_4) {
    if (ints_1 == null) {
      ints_1 = new int[12];

      for (int i_5 = 0; i_5 < 7; i_5++) {
        for (int i_6 = 0; i_6 < class260.field3294; i_6++) {
          class260 class260_7 = class2.method23(i_6);
          if (class260_7 != null && !class260_7.field3295
              && (bool_3 ? 7 : 0) + i_5 == class260_7.field3293) {
            ints_1[field2579[i_5]] = i_6 + 256;
            break;
          }
        }
      }
    }

    this.field2570 = ints_1;
    this.field2576 = ints_2;
    this.field2571 = bool_3;
    this.field2569 = i_4;
    this.method4467();
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "-1617344099"
  )
  public void method4478(int i_1, boolean bool_2) {
    if (i_1 != 1 || !this.field2571) {
      int i_3 = this.field2570[field2579[i_1]];
      if (i_3 != 0) {
        i_3 -= 256;

        class260 class260_4;
        do {
          if (!bool_2) {
            --i_3;
            if (i_3 < 0) {
              i_3 = class260.field3294 - 1;
            }
          } else {
            ++i_3;
            if (i_3 >= class260.field3294) {
              i_3 = 0;
            }
          }

          class260_4 = class2.method23(i_3);
        } while (class260_4 == null || class260_4.field3295
            || i_1 + (this.field2571 ? 7 : 0) != class260_4.field3293);

        this.field2570[field2579[i_1]] = i_3 + 256;
        this.method4467();
      }
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IZB)V",
      garbageValue = "43"
  )
  public void method4493(int i_1, boolean bool_2) {
    int i_3 = this.field2576[i_1];
    boolean bool_4;
    if (!bool_2) {
      do {
        --i_3;
        if (i_3 < 0) {
          i_3 = field2572[i_1].length - 1;
        }

        if (i_1 == 4 && i_3 >= 8) {
          bool_4 = false;
        } else {
          bool_4 = true;
        }
      } while (!bool_4);
    } else {
      do {
        ++i_3;
        if (i_3 >= field2572[i_1].length) {
          i_3 = 0;
        }

        if (i_1 == 4 && i_3 >= 8) {
          bool_4 = false;
        } else {
          bool_4 = true;
        }
      } while (!bool_4);
    }

    this.field2576[i_1] = i_3;
    this.method4467();
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-75355904"
  )
  public void method4465(boolean bool_1) {
    if (this.field2571 != bool_1) {
      this.method4462((int[]) null, this.field2576, bool_1, -1);
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-121"
  )
  public void method4466(Buffer class182_1) {
    class182_1.putInt8(this.field2571 ? 1 : 0);

    int i_2;
    for (i_2 = 0; i_2 < 7; i_2++) {
      int i_3 = this.field2570[field2579[i_2]];
      if (i_3 == 0) {
        class182_1.putInt8(-1);
      } else {
        class182_1.putInt8(i_3 - 256);
      }
    }

    for (i_2 = 0; i_2 < 5; i_2++) {
      class182_1.putInt8(this.field2576[i_2]);
    }

  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1868947460"
  )
  void method4467() {
    long long_1 = this.field2573;
    int i_3 = this.field2570[5];
    int i_4 = this.field2570[9];
    this.field2570[5] = i_4;
    this.field2570[9] = i_3;
    this.field2573 = 0L;

    int i_5;
    for (i_5 = 0; i_5 < 12; i_5++) {
      this.field2573 <<= 4;
      if (this.field2570[i_5] >= 256) {
        this.field2573 += (long) (this.field2570[i_5] - 256);
      }
    }

    if (this.field2570[0] >= 256) {
      this.field2573 += (long) (this.field2570[0] - 256 >> 4);
    }

    if (this.field2570[1] >= 256) {
      this.field2573 += (long) (this.field2570[1] - 256 >> 8);
    }

    for (i_5 = 0; i_5 < 5; i_5++) {
      this.field2573 <<= 3;
      this.field2573 += (long) this.field2576[i_5];
    }

    this.field2573 <<= 1;
    this.field2573 += (long) (this.field2571 ? 1 : 0);
    this.field2570[5] = i_3;
    this.field2570[9] = i_4;
    if (long_1 != 0L && this.field2573 != long_1) {
      field2580.method3982(long_1);
    }

  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(Ljn;ILjn;II)Ldc;",
      garbageValue = "960437328"
  )
  public class119 method4468(class273 class273_1, int i_2, class273 class273_3, int i_4) {
    if (this.field2569 != -1) {
      return class270.method5157(this.field2569).method5162(class273_1, i_2, class273_3, i_4);
    } else {
      long long_5 = this.field2573;
      int[] ints_7 = this.field2570;
      if (class273_1 != null && (class273_1.field3548 >= 0 || class273_1.field3549 >= 0)) {
        ints_7 = new int[12];

        for (int i_15 = 0; i_15 < 12; i_15++) {
          ints_7[i_15] = this.field2570[i_15];
        }

        if (class273_1.field3548 >= 0) {
          long_5 += (long) (class273_1.field3548 - this.field2570[5] << 40);
          ints_7[5] = class273_1.field3548;
        }

        if (class273_1.field3549 >= 0) {
          long_5 += (long) (class273_1.field3549 - this.field2570[3] << 48);
          ints_7[3] = class273_1.field3549;
        }
      }

      class119 class119_8 = (class119) field2580.method3989(long_5);
      if (class119_8 == null) {
        boolean bool_9 = false;

        int i_11;
        for (int i_10 = 0; i_10 < 12; i_10++) {
          i_11 = ints_7[i_10];
          if (i_11 >= 256 && i_11 < 512 && !class2.method23(i_11 - 256).method4896()) {
            bool_9 = true;
          }

          if (i_11 >= 512 && !class111.method2563(i_11 - 512).method5095(this.field2571)) {
            bool_9 = true;
          }
        }

        if (bool_9) {
          if (this.field2574 != -1L) {
            class119_8 = (class119) field2580.method3989(this.field2574);
          }

          if (class119_8 == null) {
            return null;
          }
        }

        if (class119_8 == null) {
          class113[] arr_16 = new class113[12];
          i_11 = 0;

          int i_13;
          for (int i_12 = 0; i_12 < 12; i_12++) {
            i_13 = ints_7[i_12];
            class113 class113_14;
            if (i_13 >= 256 && i_13 < 512) {
              class113_14 = class2.method23(i_13 - 256).method4897();
              if (class113_14 != null) {
                arr_16[i_11++] = class113_14;
              }
            }

            if (i_13 >= 512) {
              class113_14 = class111.method2563(i_13 - 512).method5128(this.field2571);
              if (class113_14 != null) {
                arr_16[i_11++] = class113_14;
              }
            }
          }

          class113 class113_18 = new class113(arr_16, i_11);

          for (i_13 = 0; i_13 < 5; i_13++) {
            if (this.field2576[i_13] < field2572[i_13].length) {
              class113_18.method2581(field2575[i_13], field2572[i_13][this.field2576[i_13]]);
            }

            if (this.field2576[i_13] < field2578[i_13].length) {
              class113_18.method2581(field2577[i_13], field2578[i_13][this.field2576[i_13]]);
            }
          }

          class119_8 = class113_18.method2589(64, 850, -30, -50, -30);
          field2580.method3983(class119_8, long_5);
          this.field2574 = long_5;
        }
      }

      if (class273_1 == null && class273_3 == null) {
        return class119_8;
      } else {
        class119 class119_17;
        if (class273_1 != null && class273_3 != null) {
          class119_17 = class273_1.method5221(class119_8, i_2, class273_3, i_4);
        } else if (class273_1 != null) {
          class119_17 = class273_1.method5215(class119_8, i_2);
        } else {
          class119_17 = class273_3.method5215(class119_8, i_4);
        }

        return class119_17;
      }
    }
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(I)Ldb;",
      garbageValue = "-299870207"
  )
  class113 method4469() {
    if (this.field2569 != -1) {
      return class270.method5157(this.field2569).method5158();
    } else {
      boolean bool_1 = false;

      int i_3;
      for (int i_2 = 0; i_2 < 12; i_2++) {
        i_3 = this.field2570[i_2];
        if (i_3 >= 256 && i_3 < 512 && !class2.method23(i_3 - 256).method4905()) {
          bool_1 = true;
        }

        if (i_3 >= 512 && !class111.method2563(i_3 - 512).method5097(this.field2571)) {
          bool_1 = true;
        }
      }

      if (bool_1) {
        return null;
      } else {
        class113[] arr_7 = new class113[12];
        i_3 = 0;

        int i_5;
        for (int i_4 = 0; i_4 < 12; i_4++) {
          i_5 = this.field2570[i_4];
          class113 class113_6;
          if (i_5 >= 256 && i_5 < 512) {
            class113_6 = class2.method23(i_5 - 256).method4899();
            if (class113_6 != null) {
              arr_7[i_3++] = class113_6;
            }
          }

          if (i_5 >= 512) {
            class113_6 = class111.method2563(i_5 - 512).method5098(this.field2571);
            if (class113_6 != null) {
              arr_7[i_3++] = class113_6;
            }
          }
        }

        class113 class113_8 = new class113(arr_7, i_3);

        for (i_5 = 0; i_5 < 5; i_5++) {
          if (this.field2576[i_5] < field2572[i_5].length) {
            class113_8.method2581(field2575[i_5], field2572[i_5][this.field2576[i_5]]);
          }

          if (this.field2576[i_5] < field2578[i_5].length) {
            class113_8.method2581(field2577[i_5], field2578[i_5][this.field2576[i_5]]);
          }
        }

        return class113_8;
      }
    }
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-709591289"
  )
  public int method4483() {
    return this.field2569 == -1 ? (this.field2570[0] << 15) + this.field2570[1] + (
        this.field2570[11] << 5) + (this.field2570[8] << 10) + (this.field2576[0] << 25) + (
        this.field2576[4] << 20) : 305419896 + class270.method5157(this.field2569).field3510;
  }

}
