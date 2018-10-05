package rs.darkscape.client;

import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public abstract class class16 {

  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 415051583
  )
  int field127;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -1630756967
  )
  int field117;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -168585187
  )
  int field118;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 764226753
  )
  int field119;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1927433157
  )
  int field120;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -1180650773
  )
  int field121;
  @ObfuscatedName("k")
  short[][][] field125;
  @ObfuscatedName("i")
  short[][][] field123;
  @ObfuscatedName("x")
  byte[][][] field124;
  @ObfuscatedName("e")
  byte[][][] field116;
  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "[[[[Ly;"
  )
  class19[][][][] field126;

  class16() {
    new LinkedList();
  }

  @ObfuscatedName("gh")
  @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-327616642"
  )
  static final void method158(int i_0, int i_1, int i_2, int i_3) {
    if (client.field621) {
      if (client.field684 == 1) {
        ReadBlockingSocket.field1997[client.field803 / 100]
            .method5851(client.field681 - 8, client.field682 - 8);
      }

      if (client.field684 == 2) {
        ReadBlockingSocket.field1997[client.field803 / 100 + 4]
            .method5851(client.field681 - 8, client.field682 - 8);
      }
    }

    client.field694 = 0;
    int i_4 = (class138.field1876.field931 >> 7) + class62.field868;
    int i_5 = (class138.field1876.field881 >> 7) + client.field754;
    if (i_4 >= 3053 && i_4 <= 3156 && i_5 >= 3056 && i_5 <= 3136) {
      client.field694 = 1;
    }

    if (i_4 >= 3072 && i_4 <= 3118 && i_5 >= 9492 && i_5 <= 9535) {
      client.field694 = 1;
    }

    if (client.field694 == 1 && i_4 >= 3139 && i_4 <= 3199 && i_5 >= 3008 && i_5 <= 3062) {
      client.field694 = 0;
    }

  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IILgk;I)V",
      garbageValue = "-1870240303"
  )
  void method150(int i_1, int i_2, Buffer class182_3) {
    int i_4 = class182_3.getUInt8();
    if (i_4 != 0) {
      if ((i_4 & 0x1) != 0) {
        this.method167(i_1, i_2, class182_3, i_4);
      } else {
        this.method152(i_1, i_2, class182_3, i_4);
      }

    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(IILgk;IB)V",
      garbageValue = "33"
  )
  void method167(int i_1, int i_2, Buffer class182_3, int i_4) {
    boolean bool_5 = (i_4 & 0x2) != 0;
    if (bool_5) {
      this.field123[0][i_1][i_2] = (short) class182_3.getUInt8();
    }

    this.field125[0][i_1][i_2] = (short) class182_3.getUInt8();
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(IILgk;II)V",
      garbageValue = "1447711600"
  )
  void method152(int i_1, int i_2, Buffer class182_3, int i_4) {
    int i_5 = ((i_4 & 0x18) >> 3) + 1;
    boolean bool_6 = (i_4 & 0x2) != 0;
    boolean bool_7 = (i_4 & 0x4) != 0;
    this.field125[0][i_1][i_2] = (short) class182_3.getUInt8();
    int i_8;
    int i_9;
    int i_11;
    if (bool_6) {
      i_8 = class182_3.getUInt8();

      for (i_9 = 0; i_9 < i_8; i_9++) {
        int i_10 = class182_3.getUInt8();
        if (i_10 != 0) {
          this.field123[i_9][i_1][i_2] = (short) i_10;
          i_11 = class182_3.getUInt8();
          this.field124[i_9][i_1][i_2] = (byte) (i_11 >> 2);
          this.field116[i_9][i_1][i_2] = (byte) (i_11 & 0x3);
        }
      }
    }

    if (bool_7) {
      for (i_8 = 0; i_8 < i_5; i_8++) {
        i_9 = class182_3.getUInt8();
        if (i_9 != 0) {
          class19[] arr_14 = this.field126[i_8][i_1][i_2] = new class19[i_9];

          for (i_11 = 0; i_11 < i_9; i_11++) {
            int i_12 = class182_3.method3546();
            int i_13 = class182_3.getUInt8();
            arr_14[i_11] = new class19(i_12, i_13 >> 2, i_13 & 0x3);
          }
        }
      }
    }

  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "1"
  )
  int method153(int i_1, int i_2) {
    return i_1 >= 0 && i_2 >= 0 ? (i_1 < 64 && i_2 < 64 ? this.field125[0][i_1][i_2] - 1 : -1) : -1;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-231958659"
  )
  int method149() {
    return this.field118;
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-29"
  )
  int method168() {
    return this.field119;
  }

}
