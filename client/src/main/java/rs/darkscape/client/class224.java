package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class224 extends SubNode {

  @ObfuscatedName("pr")
  @ObfuscatedGetter(
      intValue = -1966696999
  )
  static int field2555;
  @ObfuscatedName("x")
  static int[] field2554;
  @ObfuscatedName("cn")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field2548;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -260867157
  )
  public final int field2553;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 1228930619
  )
  public final int field2549;
  @ObfuscatedName("s")
  public final int[] field2550;
  @ObfuscatedName("l")
  public final int[] field2551;

  class224(int i_1, int i_2, int[] ints_3, int[] ints_4, int i_5) {
    this.field2553 = i_1;
    this.field2549 = i_2;
    this.field2550 = ints_3;
    this.field2551 = ints_4;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;Lir;I)I",
      garbageValue = "-1700861018"
  )
  static int method4426(AbstractPack class247_0, AbstractPack class247_1) {
    int i_2 = 0;
    if (class247_0.method4646("title.jpg", "")) {
      ++i_2;
    }

    if (class247_1.method4646("logo", "")) {
      ++i_2;
    }

    if (class247_1.method4646("logo_deadman_mode", "")) {
      ++i_2;
    }

    if (class247_1.method4646("titlebox", "")) {
      ++i_2;
    }

    if (class247_1.method4646("titlebutton", "")) {
      ++i_2;
    }

    if (class247_1.method4646("runes", "")) {
      ++i_2;
    }

    if (class247_1.method4646("title_mute", "")) {
      ++i_2;
    }

    if (class247_1.method4646("options_radio_buttons,0", "")) {
      ++i_2;
    }

    if (class247_1.method4646("options_radio_buttons,2", "")) {
      ++i_2;
    }

    if (class247_1.method4646("options_radio_buttons,4", "")) {
      ++i_2;
    }

    if (class247_1.method4646("options_radio_buttons,6", "")) {
      ++i_2;
    }

    class247_1.method4646("sl_back", "");
    class247_1.method4646("sl_flags", "");
    class247_1.method4646("sl_arrows", "");
    class247_1.method4646("sl_stars", "");
    class247_1.method4646("sl_button", "");
    return i_2;
  }

  @ObfuscatedName("gf")
  @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "-1148957073"
  )
  static final void method4422(int i_0, int i_1, int i_2, int i_3, int i_4) {
    long long_5 = class28.field248.method2898(i_0, i_1, i_2);
    int i_7;
    int i_8;
    int i_9;
    int i_10;
    int i_14;
    int i_25;
    if (long_5 != 0L) {
      i_7 = class28.field248.method2902(i_0, i_1, i_2, long_5);
      i_8 = i_7 >> 6 & 0x3;
      i_9 = i_7 & 0x1f;
      i_10 = i_3;
      boolean bool_12 = long_5 != 0L;
      if (bool_12) {
        boolean bool_13 = (int) (long_5 >>> 16 & 0x1L) == 1;
        bool_12 = !bool_13;
      }

      if (bool_12) {
        i_10 = i_4;
      }

      int[] ints_19 = class72.field1038.field3791;
      i_25 = i_1 * 4 + (103 - i_2) * 2048 + 24624;
      i_14 = Keyboard.method673(long_5);
      class268 class268_15 = SeekableFile.method2527(i_14);
      if (class268_15.field3415 != -1) {
        class317 class317_16 = class25.field214[class268_15.field3415];
        if (class317_16 != null) {
          int i_17 = (class268_15.field3384 * 4 - class317_16.field3780) / 2;
          int i_18 = (class268_15.field3385 * 4 - class317_16.field3781) / 2;
          class317_16
              .method5829(i_17 + i_1 * 4 + 48, i_18 + (104 - i_2 - class268_15.field3385) * 4 + 48);
        }
      } else {
        if (i_9 == 0 || i_9 == 2) {
          if (i_8 == 0) {
            ints_19[i_25] = i_10;
            ints_19[i_25 + 512] = i_10;
            ints_19[i_25 + 1024] = i_10;
            ints_19[i_25 + 1536] = i_10;
          } else if (i_8 == 1) {
            ints_19[i_25] = i_10;
            ints_19[i_25 + 1] = i_10;
            ints_19[i_25 + 2] = i_10;
            ints_19[i_25 + 3] = i_10;
          } else if (i_8 == 2) {
            ints_19[i_25 + 3] = i_10;
            ints_19[i_25 + 512 + 3] = i_10;
            ints_19[i_25 + 1024 + 3] = i_10;
            ints_19[i_25 + 1536 + 3] = i_10;
          } else if (i_8 == 3) {
            ints_19[i_25 + 1536] = i_10;
            ints_19[i_25 + 1536 + 1] = i_10;
            ints_19[i_25 + 1536 + 2] = i_10;
            ints_19[i_25 + 1536 + 3] = i_10;
          }
        }

        if (i_9 == 3) {
          if (i_8 == 0) {
            ints_19[i_25] = i_10;
          } else if (i_8 == 1) {
            ints_19[i_25 + 3] = i_10;
          } else if (i_8 == 2) {
            ints_19[i_25 + 1536 + 3] = i_10;
          } else if (i_8 == 3) {
            ints_19[i_25 + 1536] = i_10;
          }
        }

        if (i_9 == 2) {
          if (i_8 == 3) {
            ints_19[i_25] = i_10;
            ints_19[i_25 + 512] = i_10;
            ints_19[i_25 + 1024] = i_10;
            ints_19[i_25 + 1536] = i_10;
          } else if (i_8 == 0) {
            ints_19[i_25] = i_10;
            ints_19[i_25 + 1] = i_10;
            ints_19[i_25 + 2] = i_10;
            ints_19[i_25 + 3] = i_10;
          } else if (i_8 == 1) {
            ints_19[i_25 + 3] = i_10;
            ints_19[i_25 + 512 + 3] = i_10;
            ints_19[i_25 + 1024 + 3] = i_10;
            ints_19[i_25 + 1536 + 3] = i_10;
          } else if (i_8 == 2) {
            ints_19[i_25 + 1536] = i_10;
            ints_19[i_25 + 1536 + 1] = i_10;
            ints_19[i_25 + 1536 + 2] = i_10;
            ints_19[i_25 + 1536 + 3] = i_10;
          }
        }
      }
    }

    long_5 = class28.field248.method2900(i_0, i_1, i_2);
    if (long_5 != 0L) {
      i_7 = class28.field248.method2902(i_0, i_1, i_2, long_5);
      i_8 = i_7 >> 6 & 0x3;
      i_9 = i_7 & 0x1f;
      i_10 = Keyboard.method673(long_5);
      class268 class268_20 = SeekableFile.method2527(i_10);
      if (class268_20.field3415 != -1) {
        class317 class317_26 = class25.field214[class268_20.field3415];
        if (class317_26 != null) {
          i_25 = (class268_20.field3384 * 4 - class317_26.field3780) / 2;
          i_14 = (class268_20.field3385 * 4 - class317_26.field3781) / 2;
          class317_26
              .method5829(i_1 * 4 + i_25 + 48, (104 - i_2 - class268_20.field3385) * 4 + i_14 + 48);
        }
      } else if (i_9 == 9) {
        int i_24 = 15658734;
        if (class67.method1683(long_5)) {
          i_24 = 15597568;
        }

        int[] ints_23 = class72.field1038.field3791;
        i_14 = i_1 * 4 + (103 - i_2) * 2048 + 24624;
        if (i_8 != 0 && i_8 != 2) {
          ints_23[i_14] = i_24;
          ints_23[i_14 + 1 + 512] = i_24;
          ints_23[i_14 + 1024 + 2] = i_24;
          ints_23[i_14 + 1536 + 3] = i_24;
        } else {
          ints_23[i_14 + 1536] = i_24;
          ints_23[i_14 + 1 + 1024] = i_24;
          ints_23[i_14 + 512 + 2] = i_24;
          ints_23[i_14 + 3] = i_24;
        }
      }
    }

    long_5 = class28.field248.method2901(i_0, i_1, i_2);
    if (long_5 != 0L) {
      i_7 = Keyboard.method673(long_5);
      class268 class268_21 = SeekableFile.method2527(i_7);
      if (class268_21.field3415 != -1) {
        class317 class317_22 = class25.field214[class268_21.field3415];
        if (class317_22 != null) {
          i_10 = (class268_21.field3384 * 4 - class317_22.field3780) / 2;
          int i_11 = (class268_21.field3385 * 4 - class317_22.field3781) / 2;
          class317_22
              .method5829(i_1 * 4 + i_10 + 48, i_11 + (104 - i_2 - class268_21.field3385) * 4 + 48);
        }
      }
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "1"
  )
  public boolean method4423(int i_1, int i_2) {
    if (i_2 >= 0 && i_2 < this.field2551.length) {
      int i_3 = this.field2551[i_2];
      if (i_1 >= i_3 && i_1 <= i_3 + this.field2550[i_2]) {
        return true;
      }
    }

    return false;
  }

}
