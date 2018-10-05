package rs.darkscape.client;

import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class43 {

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "Lfu;"
  )
  protected static class160 field368;
  @ObfuscatedName("fy")
  @ObfuscatedSignature(
      signature = "[Lll;"
  )
  static class318[] field369;

  static {
    ImageIO.setUseCache(false);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIII)J",
      garbageValue = "-1030997020"
  )
  static long method716(int i_0, int i_1, int i_2) {
    return (long) (i_2 << 16 | i_0 << 8 | i_1);
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1093362390"
  )
  public static void method715() {
    class272.field3524.method3984();
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)Lfu;",
      garbageValue = "1681202713"
  )
  public static class160 method712() {
    try {
      return new class149();
    } catch (Throwable throwable_1) {
      return new class150();
    }
  }

  @ObfuscatedName("gb")
  @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "2123332164"
  )
  static final void method714(int i_0, int i_1, int i_2, int i_3, boolean bool_4) {
    if (i_2 < 1) {
      i_2 = 1;
    }

    if (i_3 < 1) {
      i_3 = 1;
    }

    int i_5 = i_3 - 334;
    if (i_5 < 0) {
      i_5 = 0;
    } else if (i_5 > 100) {
      i_5 = 100;
    }

    int i_6 = (client.field829 - client.field802) * i_5 / 100 + client.field802;
    int i_7 = i_3 * i_6 * 512 / (i_2 * 334);
    int i_8;
    int i_9;
    short s_15;
    if (i_7 < client.field834) {
      s_15 = client.field834;
      i_6 = s_15 * i_2 * 334 / (i_3 * 512);
      if (i_6 > client.field833) {
        i_6 = client.field833;
        i_8 = i_3 * i_6 * 512 / (s_15 * 334);
        i_9 = (i_2 - i_8) / 2;
        if (bool_4) {
          class314.method5719();
          class314.method5763(i_0, i_1, i_9, i_3, -16777216);
          class314.method5763(i_0 + i_2 - i_9, i_1, i_9, i_3, -16777216);
        }

        i_0 += i_9;
        i_2 -= i_9 * 2;
      }
    } else if (i_7 > client.field835) {
      s_15 = client.field835;
      i_6 = s_15 * i_2 * 334 / (i_3 * 512);
      if (i_6 < client.field832) {
        i_6 = client.field832;
        i_8 = s_15 * i_2 * 334 / (i_6 * 512);
        i_9 = (i_3 - i_8) / 2;
        if (bool_4) {
          class314.method5719();
          class314.method5763(i_0, i_1, i_2, i_9, -16777216);
          class314.method5763(i_0, i_3 + i_1 - i_9, i_2, i_9, -16777216);
        }

        i_1 += i_9;
        i_3 -= i_9 * 2;
      }
    }

    i_8 = (client.field831 - client.field848) * i_5 / 100 + client.field848;
    client.field840 = i_3 * i_6 * i_8 / 85504 << 1;
    if (i_2 != client.field838 || i_3 != client.field662) {
      int[] ints_14 = new int[9];

      for (int i_10 = 0; i_10 < 9; i_10++) {
        int i_11 = i_10 * 32 + 15 + 128;
        int i_12 = i_11 * 3 + 600;
        int i_13 = class122.field1681[i_11];
        ints_14[i_10] = i_12 * i_13 >> 16;
      }

      class125.method2893(ints_14, 500, 800, i_2, i_3);
    }

    client.field762 = i_0;
    client.field837 = i_1;
    client.field838 = i_2;
    client.field662 = i_3;
  }

  @ObfuscatedName("ha")
  @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "0"
  )
  static final boolean method713(int i_0) {
    if (i_0 < 0) {
      return false;
    } else {
      int i_1 = client.field720[i_0];
      if (i_1 >= 2000) {
        i_1 -= 2000;
      }

      return i_1 == 1007;
    }
  }

}
