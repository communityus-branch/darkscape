package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gh")
public class LinearHashMap {

  @ObfuscatedName("z")
  int[] field2401;

  public LinearHashMap(int[] ints_1) {
    int i_2;
    for (i_2 = 1; i_2 <= (ints_1.length >> 1) + ints_1.length; i_2 <<= 1) {
    }

    this.field2401 = new int[i_2 + i_2];

    int i_3;
    for (i_3 = 0; i_3 < i_2 + i_2; i_3++) {
      this.field2401[i_3] = -1;
    }

    int i_4;
    for (i_3 = 0; i_3 < ints_1.length; this.field2401[i_4 + i_4 + 1] = i_3++) {
      for (i_4 = ints_1[i_3] & i_2 - 1; this.field2401[i_4 + i_4 + 1] != -1;
          i_4 = i_4 + 1 & i_2 - 1) {
      }

      this.field2401[i_4 + i_4] = ints_1[i_3];
    }

  }

  @ObfuscatedName("z")
  public int method3967(int i_1) {
    int i_2 = (this.field2401.length >> 1) - 1;
    int i_3 = i_1 & i_2;

    while (true) {
      int i_4 = this.field2401[i_3 + i_3 + 1];
      if (i_4 == -1) {
        return -1;
      }

      if (this.field2401[i_3 + i_3] == i_1) {
        return i_4;
      }

      i_3 = i_3 + 1 & i_2;
    }
  }

}
