package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class170 implements class167 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lfq;"
  )
  public static final class170 field2237 = new class170(14, 0);
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lfq;"
  )
  public static final class170 field2235 = new class170(16, -2);
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lfq;"
  )
  public static final class170 field2238 = new class170(18, -2);
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lfq;"
  )
  static final class170 field2236 = new class170(15, 4);
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "[Lfq;"
  )
  static final class170[] field2240 = new class170[32];

  static {
    class170[] arr_0 = new class170[]{field2235, field2236, field2237, field2238};
    class170[] arr_1 = arr_0;

    for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
      field2240[arr_1[i_2].field2239] = arr_1[i_2];
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 1358043829
  )
  public final int field2239;

  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
  )
  class170(int i_1, int i_2) {
    this.field2239 = i_1;
  }

  @ObfuscatedName("hw")
  @ObfuscatedSignature(
      signature = "(IIIIIIIB)V",
      garbageValue = "15"
  )
  static final void method3449(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
    if (i_2 >= 1 && i_3 >= 1 && i_2 <= 102 && i_3 <= 102) {
      if (client.field585 && i_0 != class13.field82) {
        return;
      }

      long long_7 = 0L;
      boolean bool_9 = true;
      boolean bool_10 = false;
      boolean bool_11 = false;
      if (i_1 == 0) {
        long_7 = class28.field248.method2898(i_0, i_2, i_3);
      }

      if (i_1 == 1) {
        long_7 = class28.field248.method2899(i_0, i_2, i_3);
      }

      if (i_1 == 2) {
        long_7 = class28.field248.method2900(i_0, i_2, i_3);
      }

      if (i_1 == 3) {
        long_7 = class28.field248.method2901(i_0, i_2, i_3);
      }

      int i_12;
      if (long_7 != 0L) {
        i_12 = class28.field248.method2902(i_0, i_2, i_3, long_7);
        int i_14 = Keyboard.method673(long_7);
        int i_15 = i_12 & 0x1f;
        int i_16 = i_12 >> 6 & 0x3;
        class268 class268_13;
        if (i_1 == 0) {
          class28.field248.method2889(i_0, i_2, i_3);
          class268_13 = SeekableFile.method2527(i_14);
          if (class268_13.field3386 != 0) {
            client.field642[i_0].method3391(i_2, i_3, i_15, i_16, class268_13.field3404);
          }
        }

        if (i_1 == 1) {
          class28.field248.method2890(i_0, i_2, i_3);
        }

        if (i_1 == 2) {
          class28.field248.method2891(i_0, i_2, i_3);
          class268_13 = SeekableFile.method2527(i_14);
          if (i_2 + class268_13.field3384 > 103 || i_3 + class268_13.field3384 > 103
              || i_2 + class268_13.field3385 > 103 || i_3 + class268_13.field3385 > 103) {
            return;
          }

          if (class268_13.field3386 != 0) {
            client.field642[i_0]
                .method3399(i_2, i_3, class268_13.field3384, class268_13.field3385, i_16,
                            class268_13.field3404);
          }
        }

        if (i_1 == 3) {
          class28.field248.method2971(i_0, i_2, i_3);
          class268_13 = SeekableFile.method2527(i_14);
          if (class268_13.field3386 == 1) {
            client.field642[i_0].method3401(i_2, i_3);
          }
        }
      }

      if (i_4 >= 0) {
        i_12 = i_0;
        if (i_0 < 3 && (class50.field443[1][i_2][i_3] & 0x2) == 2) {
          i_12 = i_0 + 1;
        }

        class262
            .method4939(i_0, i_12, i_2, i_3, i_4, i_5, i_6, class28.field248, client.field642[i_0]);
      }
    }

  }

  @ObfuscatedName("im")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2129925873"
  )
  static void method3448() {
    for (int i_0 = 0; i_0 < client.field771; i_0++) {
      if (class173.method3470(client.field720[i_0])) {
        if (i_0 < client.field771 - 1) {
          for (int i_1 = i_0; i_1 < client.field771 - 1; i_1++) {
            client.field735[i_1] = client.field735[i_1 + 1];
            client.field740[i_1] = client.field740[i_1 + 1];
            client.field720[i_1] = client.field720[i_1 + 1];
            client.field794[i_1] = client.field794[i_1 + 1];
            client.field718[i_1] = client.field718[i_1 + 1];
            client.field851[i_1] = client.field851[i_1 + 1];
            client.field590[i_1] = client.field590[i_1 + 1];
          }
        }

        --i_0;
        --client.field771;
      }
    }

    client.method3785(class135.field1856 / 2 + Mouse.field435, class0.field1);
  }

}
