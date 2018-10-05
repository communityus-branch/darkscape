package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kj")
public final class class298 extends class299 {

  public class298(byte[] bytes_1, int[] ints_2, int[] ints_3, int[] ints_4, int[] ints_5,
                  int[] ints_6, byte[][] bytes_7) {
    super(bytes_1, ints_2, ints_3, ints_4, ints_5, ints_6, bytes_7);
  }

  public class298(byte[] bytes_1) {
    super(bytes_1);
  }

  @ObfuscatedName("z")
  final void vmethod5536(byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
    int i_7 = i_3 * class314.field3761 + i_2;
    int i_8 = class314.field3761 - i_4;
    int i_9 = 0;
    int i_10 = 0;
    int i_11;
    if (i_3 < class314.field3763) {
      i_11 = class314.field3763 - i_3;
      i_5 -= i_11;
      i_3 = class314.field3763;
      i_10 += i_11 * i_4;
      i_7 += i_11 * class314.field3761;
    }

    if (i_3 + i_5 > class314.field3764) {
      i_5 -= i_3 + i_5 - class314.field3764;
    }

    if (i_2 < class314.field3765) {
      i_11 = class314.field3765 - i_2;
      i_4 -= i_11;
      i_2 = class314.field3765;
      i_10 += i_11;
      i_7 += i_11;
      i_9 += i_11;
      i_8 += i_11;
    }

    if (i_2 + i_4 > class314.field3760) {
      i_11 = i_2 + i_4 - class314.field3760;
      i_4 -= i_11;
      i_9 += i_11;
      i_8 += i_11;
    }

    if (i_4 > 0 && i_5 > 0) {
      class299.method5556(class314.field3766, bytes_1, i_6, i_10, i_7, i_4, i_5, i_8, i_9);
    }
  }

  @ObfuscatedName("w")
  final void vmethod5542(byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
    int i_8 = i_3 * class314.field3761 + i_2;
    int i_9 = class314.field3761 - i_4;
    int i_10 = 0;
    int i_11 = 0;
    int i_12;
    if (i_3 < class314.field3763) {
      i_12 = class314.field3763 - i_3;
      i_5 -= i_12;
      i_3 = class314.field3763;
      i_11 += i_12 * i_4;
      i_8 += i_12 * class314.field3761;
    }

    if (i_3 + i_5 > class314.field3764) {
      i_5 -= i_3 + i_5 - class314.field3764;
    }

    if (i_2 < class314.field3765) {
      i_12 = class314.field3765 - i_2;
      i_4 -= i_12;
      i_2 = class314.field3765;
      i_11 += i_12;
      i_8 += i_12;
      i_10 += i_12;
      i_9 += i_12;
    }

    if (i_2 + i_4 > class314.field3760) {
      i_12 = i_2 + i_4 - class314.field3760;
      i_4 -= i_12;
      i_10 += i_12;
      i_9 += i_12;
    }

    if (i_4 > 0 && i_5 > 0) {
      class299.method5585(class314.field3766, bytes_1, i_6, i_11, i_8, i_4, i_5, i_9, i_10, i_7);
    }
  }

}
