package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gz")
public class class193 {

  @ObfuscatedName("z")
  public static void method3873(byte[] bytes_0, int i_1, byte[] bytes_2, int i_3, int i_4) {
    if (bytes_2 == bytes_0) {
      if (i_3 == i_1) {
        return;
      }

      if (i_3 > i_1 && i_3 < i_4 + i_1) {
        --i_4;
        i_1 += i_4;
        i_3 += i_4;
        i_4 = i_1 - i_4;

        for (i_4 += 7; i_1 >= i_4; bytes_2[i_3--] = bytes_0[i_1--]) {
          bytes_2[i_3--] = bytes_0[i_1--];
          bytes_2[i_3--] = bytes_0[i_1--];
          bytes_2[i_3--] = bytes_0[i_1--];
          bytes_2[i_3--] = bytes_0[i_1--];
          bytes_2[i_3--] = bytes_0[i_1--];
          bytes_2[i_3--] = bytes_0[i_1--];
          bytes_2[i_3--] = bytes_0[i_1--];
        }

        for (i_4 -= 7; i_1 >= i_4; bytes_2[i_3--] = bytes_0[i_1--]) {
        }

        return;
      }
    }

    i_4 += i_1;

    for (i_4 -= 7; i_1 < i_4; bytes_2[i_3++] = bytes_0[i_1++]) {
      bytes_2[i_3++] = bytes_0[i_1++];
      bytes_2[i_3++] = bytes_0[i_1++];
      bytes_2[i_3++] = bytes_0[i_1++];
      bytes_2[i_3++] = bytes_0[i_1++];
      bytes_2[i_3++] = bytes_0[i_1++];
      bytes_2[i_3++] = bytes_0[i_1++];
      bytes_2[i_3++] = bytes_0[i_1++];
    }

    for (i_4 += 7; i_1 < i_4; bytes_2[i_3++] = bytes_0[i_1++]) {
    }

  }

  @ObfuscatedName("p")
  public static void method3895(int[] ints_0, int i_1, int i_2) {
    for (i_2 = i_2 + i_1 - 7; i_1 < i_2; ints_0[i_1++] = 0) {
      ints_0[i_1++] = 0;
      ints_0[i_1++] = 0;
      ints_0[i_1++] = 0;
      ints_0[i_1++] = 0;
      ints_0[i_1++] = 0;
      ints_0[i_1++] = 0;
      ints_0[i_1++] = 0;
    }

    for (i_2 += 7; i_1 < i_2; ints_0[i_1++] = 0) {
    }

  }

}
