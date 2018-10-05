package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public final class class50 {

  @ObfuscatedName("o")
  static final int[] field450 = new int[]{1, 2, 4, 8};
  @ObfuscatedName("y")
  static final int[] field451 = new int[]{16, 32, 64, 128};
  @ObfuscatedName("a")
  static final int[] field452 = new int[]{1, 0, -1, 0};
  @ObfuscatedName("j")
  static final int[] field453 = new int[]{0, -1, 0, 1};
  @ObfuscatedName("d")
  static final int[] field458 = new int[]{1, -1, -1, 1};
  @ObfuscatedName("h")
  static final int[] field449 = new int[]{-1, -1, 1, 1};
  @ObfuscatedName("pt")
  @ObfuscatedGetter(
      intValue = 1434136439
  )
  static int field456;
  @ObfuscatedName("l")
  static byte[][][] field445;
  @ObfuscatedName("q")
  static byte[][][] field446;
  @ObfuscatedName("i")
  static byte[][][] field447;
  @ObfuscatedName("x")
  static int[][] field448;
  @ObfuscatedName("e")
  static int[] field454;
  @ObfuscatedName("dg")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field461;
  @ObfuscatedName("z")
  static int[][][] field459 = new int[4][105][105];
  @ObfuscatedName("w")
  static byte[][][] field443 = new byte[4][104][104];
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -791731349
  )
  static int field442 = 99;
  @ObfuscatedName("c")
  @ObfuscatedGetter(
      intValue = 129053467
  )
  static int field457 = (int) (Math.random() * 17.0D) - 8;
  @ObfuscatedName("v")
  @ObfuscatedGetter(
      intValue = -1275566919
  )
  static int field455 = (int) (Math.random() * 33.0D) - 16;

  @ObfuscatedName("fq")
  @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-29"
  )
  static void method965(int i_0, int i_1) {
    if (client.field811 != 0 && i_0 != -1) {
      class63.method1554(class61.field576, i_0, 0, client.field811, false);
      client.field813 = true;
    }

  }

  @ObfuscatedName("gk")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-16"
  )
  static void method991(int i_0) {
    client.field791 = 0L;
    if (i_0 >= 2) {
      client.field792 = true;
    } else {
      client.field792 = false;
    }

    int i_1 = client.field792 ? 2 : 1;
    if (i_1 == 1) {
      Buffer.field2334.method906(765, 503);
    } else {
      Buffer.field2334.method906(7680, 2160);
    }

    if (client.state >= 25) {
      OutboundPacket class172_2 = OutboundPacket
          .createOutboundPacket(OutboundPacketDescriptor.field2215, client.field626.field1218);
      PacketBuffer class189_3 = class172_2.buffer;
      int i_4 = client.field792 ? 2 : 1;
      class189_3.putInt8(i_4);
      class172_2.buffer.method3755(class82.field1179);
      class172_2.buffer.method3755(class243.field3138);
      client.field626.method1980(class172_2);
    }

  }

  @ObfuscatedName("ip")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
      garbageValue = "-1119730379"
  )
  public static final void method993(String string_0, String string_1, int i_2, int i_3, int i_4,
                                     int i_5) {
    class243.method4612(string_0, string_1, i_2, i_3, i_4, i_5, false);
  }

}
