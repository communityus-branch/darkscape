package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.net.AbstractSocket;

@ObfuscatedName("bl")
public final class class62 extends Node {

  @ObfuscatedName("er")
  @ObfuscatedSignature(
      signature = "Lfd;"
  )
  static AbstractSocket field869;
  @ObfuscatedName("el")
  @ObfuscatedGetter(
      intValue = 701830261
  )
  static int field868;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 1275517341
  )
  int field859;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -1431899603
  )
  int field861;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -1725586571
  )
  int field856;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -3180471
  )
  int field865;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -66772787
  )
  int field866;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 920179015
  )
  int field862;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 208398471
  )
  int field863;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 2065155657
  )
  int field864;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = -37170881
  )
  int field855 = 0;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = 1332159199
  )
  int field860 = -1;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 963481089
  )
  int field857;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -773006769
  )
  int field858;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)Lfn;",
      garbageValue = "2059542848"
  )
  public static OutboundPacket method1536() {
    OutboundPacket class172_0;
    if (OutboundPacket.stackPointer == 0) {
      class172_0 = new OutboundPacket();
    } else {
      class172_0 = OutboundPacket.stack[--OutboundPacket.stackPointer];
    }

    class172_0.descriptor = null;
    class172_0.len = 0;
    class172_0.buffer = new PacketBuffer(5000);
    return class172_0;
  }

  @ObfuscatedName("ga")
  @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "-149430841"
  )
  static final void method1537(int i_0, int i_1, boolean bool_2) {
    if (!bool_2 || i_0 != class27.field224 || class34.field301 != i_1) {
      class27.field224 = i_0;
      class34.field301 = i_1;
      Mouse.method947(25);
      class83.method1933("Loading - please wait.", true);
      int i_3 = field868;
      int i_4 = client.field754;
      field868 = (i_0 - 6) * 8;
      client.field754 = (i_1 - 6) * 8;
      int i_5 = field868 - i_3;
      int i_6 = client.field754 - i_4;
      i_3 = field868;
      i_4 = client.field754;

      int i_7;
      int i_9;
      for (i_7 = 0; i_7 < 32768; i_7++) {
        class72 class72_8 = client.field843[i_7];
        if (class72_8 != null) {
          for (i_9 = 0; i_9 < 10; i_9++) {
            class72_8.field922[i_9] -= i_5;
            class72_8.field872[i_9] -= i_6;
          }

          class72_8.field931 -= i_5 * 128;
          class72_8.field881 -= i_6 * 128;
        }
      }

      for (i_7 = 0; i_7 < 2048; i_7++) {
        class60 class60_21 = client.field610[i_7];
        if (class60_21 != null) {
          for (i_9 = 0; i_9 < 10; i_9++) {
            class60_21.field922[i_9] -= i_5;
            class60_21.field872[i_9] -= i_6;
          }

          class60_21.field931 -= i_5 * 128;
          class60_21.field881 -= i_6 * 128;
        }
      }

      byte b_20 = 0;
      byte b_18 = 104;
      byte b_22 = 1;
      if (i_5 < 0) {
        b_20 = 103;
        b_18 = -1;
        b_22 = -1;
      }

      byte b_10 = 0;
      byte b_11 = 104;
      byte b_12 = 1;
      if (i_6 < 0) {
        b_10 = 103;
        b_11 = -1;
        b_12 = -1;
      }

      int i_14;
      for (int i_13 = b_20; b_18 != i_13; i_13 += b_22) {
        for (i_14 = b_10; i_14 != b_11; i_14 += b_12) {
          int i_15 = i_5 + i_13;
          int i_16 = i_14 + i_6;

          for (int i_17 = 0; i_17 < 4; i_17++) {
            if (i_15 >= 0 && i_16 >= 0 && i_15 < 104 && i_16 < 104) {
              client.field708[i_17][i_13][i_14] = client.field708[i_17][i_15][i_16];
            } else {
              client.field708[i_17][i_13][i_14] = null;
            }
          }
        }
      }

      for (class62 class62_19 = (class62) client.field714.getFirst(); class62_19 != null;
          class62_19 = (class62) client.field714.getNext()) {
        class62_19.field857 -= i_5;
        class62_19.field858 -= i_6;
        if (class62_19.field857 < 0 || class62_19.field858 < 0 || class62_19.field857 >= 104
            || class62_19.field858 >= 104) {
          class62_19.unlinkNode();
        }
      }

      if (client.field808 != 0) {
        client.field808 -= i_5;
        client.field809 -= i_6;
      }

      client.field656 = 0;
      client.field822 = false;
      BufferedFile.field1431 -= i_5 << 7;
      class226.field2563 -= i_6 << 7;
      BufferedFile.field1428 -= i_5 << 7;
      class2.field23 -= i_6 << 7;
      client.field651 = -1;
      client.field711.clear();
      client.field710.clear();

      for (i_14 = 0; i_14 < 4; i_14++) {
        client.field642[i_14].method3392();
      }

    }
  }

  @ObfuscatedName("hm")
  @ObfuscatedSignature(
      signature = "(Lbu;IIBB)V",
      garbageValue = "-55"
  )
  static final void method1538(class60 class60_0, int i_1, int i_2, byte b_3) {
    int i_4 = class60_0.field922[0];
    int i_5 = class60_0.field872[0];
    int i_6 = class60_0.method1088();
    if (i_4 >= i_6 && i_4 < 104 - i_6 && i_5 >= i_6 && i_5 < 104 - i_6) {
      if (i_1 >= i_6 && i_1 < 104 - i_6 && i_2 >= i_6 && i_2 < 104 - i_6) {
        int i_9 = class60_0.method1088();
        client.field849.field2043 = i_1;
        client.field849.field2048 = i_2;
        client.field849.field2042 = 1;
        client.field849.field2045 = 1;
        class59 class59_10 = client.field849;
        int i_11 = class112
            .method2566(i_4, i_5, i_9, class59_10, client.field642[class60_0.field567], true,
                        client.field850, client.field596);
        if (i_11 >= 1) {
          for (int i_12 = 0; i_12 < i_11 - 1; i_12++) {
            class60_0.method1105(client.field850[i_12], client.field596[i_12], b_3);
          }

        }
      }
    }
  }

}
