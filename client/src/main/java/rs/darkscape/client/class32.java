package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public class class32 {

  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 2003642713
  )
  int field282;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -1427733301
  )
  int field287;
  @ObfuscatedName("s")
  int[][] field283;
  @ObfuscatedName("l")
  int[][] field281;
  @ObfuscatedName("u")
  int[][] field285;
  @ObfuscatedName("q")
  int[][] field286;

  class32(int i_1, int i_2) {
    this.field282 = i_1;
    this.field287 = i_2;
    this.field283 = new int[i_1][i_2];
    this.field281 = new int[i_1][i_2];
    this.field285 = new int[i_1][i_2];
    this.field286 = new int[i_1][i_2];
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "15233496"
  )
  static int method540(int i_0, class84 class84_1, boolean bool_2) {
    int i_3;
    int i_4;
    if (i_0 == 100) {
      class69.field1003 -= 3;
      i_3 = class69.field999[class69.field1003];
      i_4 = class69.field999[class69.field1003 + 1];
      int i_5 = class69.field999[class69.field1003 + 2];
      if (i_4 == 0) {
        throw new RuntimeException();
      } else {
        class230 class230_6 = class26.method434(i_3);
        if (class230_6.field2736 == null) {
          class230_6.field2736 = new class230[i_5 + 1];
        }

        if (class230_6.field2736.length <= i_5) {
          class230[] arr_7 = new class230[i_5 + 1];

          for (int i_8 = 0; i_8 < class230_6.field2736.length; i_8++) {
            arr_7[i_8] = class230_6.field2736[i_8];
          }

          class230_6.field2736 = arr_7;
        }

        if (i_5 > 0 && class230_6.field2736[i_5 - 1] == null) {
          throw new RuntimeException("" + (i_5 - 1));
        } else {
          class230 class230_12 = new class230();
          class230_12.field2721 = i_4;
          class230_12.field2605 = class230_12.field2691 = class230_6.field2691;
          class230_12.field2606 = i_5;
          class230_12.field2604 = true;
          class230_6.field2736[i_5] = class230_12;
          if (bool_2) {
            class276.field3561 = class230_12;
          } else {
            class260.field3301 = class230_12;
          }

          class60.method1114(class230_6);
          return 1;
        }
      }
    } else {
      class230 class230_9;
      if (i_0 == 101) {
        class230_9 = bool_2 ? class276.field3561 : class260.field3301;
        class230 class230_10 = class26.method434(class230_9.field2691);
        class230_10.field2736[class230_9.field2606] = null;
        class60.method1114(class230_10);
        return 1;
      } else if (i_0 == 102) {
        class230_9 = class26.method434(class69.field999[--class69.field1003]);
        class230_9.field2736 = null;
        class60.method1114(class230_9);
        return 1;
      } else if (i_0 != 200) {
        if (i_0 == 201) {
          class230_9 = class26.method434(class69.field999[--class69.field1003]);
          if (class230_9 != null) {
            class69.field999[++class69.field1003 - 1] = 1;
            if (bool_2) {
              class276.field3561 = class230_9;
            } else {
              class260.field3301 = class230_9;
            }
          } else {
            class69.field999[++class69.field1003 - 1] = 0;
          }

          return 1;
        } else {
          return 2;
        }
      } else {
        class69.field1003 -= 2;
        i_3 = class69.field999[class69.field1003];
        i_4 = class69.field999[class69.field1003 + 1];
        class230 class230_11 = class146.method3191(i_3, i_4);
        if (class230_11 != null && i_4 != -1) {
          class69.field999[++class69.field1003 - 1] = 1;
          if (bool_2) {
            class276.field3561 = class230_11;
          } else {
            class260.field3301 = class230_11;
          }
        } else {
          class69.field999[++class69.field1003 - 1] = 0;
        }

        return 1;
      }
    }
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-2015845683"
  )
  static final int method549(int i_0, int i_1, int i_2) {
    int i_3 = i_0 / i_2;
    int i_4 = i_0 & i_2 - 1;
    int i_5 = i_1 / i_2;
    int i_6 = i_1 & i_2 - 1;
    int i_7 = class186.method3805(i_3, i_5);
    int i_8 = class186.method3805(i_3 + 1, i_5);
    int i_9 = class186.method3805(i_3, i_5 + 1);
    int i_10 = class186.method3805(i_3 + 1, i_5 + 1);
    int i_11 = class123.method2870(i_7, i_8, i_4, i_2);
    int i_12 = class123.method2870(i_9, i_10, i_4, i_2);
    return class123.method2870(i_11, i_12, i_6, i_2);
  }

  @ObfuscatedName("ef")
  @ObfuscatedSignature(
      signature = "(Lic;Ljava/lang/String;I)V",
      garbageValue = "2071314705"
  )
  static void method548(class249 class249_0, String string_1) {
    class52 class52_2 = new class52(class249_0, string_1);
    client.field781.add(class52_2);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIILiq;S)V",
      garbageValue = "11065"
  )
  void method541(int i_1, int i_2, int i_3, class259 class259_4) {
    if (class259_4 != null) {
      if (i_3 + i_1 >= 0 && i_3 + i_2 >= 0) {
        if (i_1 - i_3 <= this.field282 && i_2 - i_3 <= this.field287) {
          int i_5 = Math.max(0, i_1 - i_3);
          int i_6 = Math.min(this.field282, i_3 + i_1);
          int i_7 = Math.max(0, i_2 - i_3);
          int i_8 = Math.min(this.field287, i_3 + i_2);

          for (int i_9 = i_5; i_9 < i_6; i_9++) {
            for (int i_10 = i_7; i_10 < i_8; i_10++) {
              this.field283[i_9][i_10] += class259_4.field3284 * 256 / class259_4.field3281;
              this.field281[i_9][i_10] += class259_4.field3287;
              this.field285[i_9][i_10] += class259_4.field3286;
              ++this.field286[i_9][i_10];
            }
          }

        }
      }
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "1"
  )
  int method547(int i_1, int i_2) {
    if (i_1 >= 0 && i_2 >= 0 && i_1 < this.field282 && i_2 < this.field287) {
      if (this.field285[i_1][i_2] == 0) {
        return 0;
      } else {
        int i_3 = this.field283[i_1][i_2] / this.field286[i_1][i_2];
        int i_4 = this.field281[i_1][i_2] / this.field286[i_1][i_2];
        int i_5 = this.field285[i_1][i_2] / this.field286[i_1][i_2];
        return class143
            .method3167((double) i_3 / 256.0D, (double) i_4 / 256.0D, (double) i_5 / 256.0D);
      }
    } else {
      return 0;
    }
  }

}
