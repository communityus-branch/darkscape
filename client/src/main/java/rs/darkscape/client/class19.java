package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public class class19 {

  @ObfuscatedName("qi")
  @ObfuscatedSignature(
      signature = "Lw;"
  )
  static class1 field154;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -746355455
  )
  static int field152;
  @ObfuscatedName("k")
  static byte[][][] field159;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -628993611
  )
  final int field158;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 982920549
  )
  final int field155;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 454780769
  )
  final int field157;

  class19(int i_1, int i_2, int i_3) {
    this.field158 = i_1;
    this.field155 = i_2;
    this.field157 = i_3;
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(II)Lew;",
      garbageValue = "-838426399"
  )
  static class130 method198(int i_0) {
    class130 class130_1 = (class130) class273.field3539.method3989((long) i_0);
    if (class130_1 != null) {
      return class130_1;
    } else {
      AbstractPack class247_3 = class273.field3536;
      AbstractPack class247_4 = class273.field3537;
      boolean bool_5 = true;
      int[] ints_6 = class247_3.method4668(i_0);

      for (int i_7 = 0; i_7 < ints_6.length; i_7++) {
        byte[] bytes_8 = class247_3.method4676(i_0, ints_6[i_7]);
        if (bytes_8 == null) {
          bool_5 = false;
        } else {
          int i_9 = (bytes_8[0] & 0xff) << 8 | bytes_8[1] & 0xff;
          byte[] bytes_10 = class247_4.method4676(i_9, 0);
          if (bytes_10 == null) {
            bool_5 = false;
          }
        }
      }

      class130 class130_2;
      if (!bool_5) {
        class130_2 = null;
      } else {
        try {
          class130_2 = new class130(class247_3, class247_4, i_0, false);
        } catch (Exception exception_12) {
          class130_2 = null;
        }
      }

      if (class130_2 != null) {
        class273.field3539.method3983(class130_2, (long) i_0);
      }

      return class130_2;
    }
  }

  @ObfuscatedName("kx")
  @ObfuscatedSignature(
      signature = "(IIIZI)V",
      garbageValue = "-185686221"
  )
  public static void method197(int i_0, int i_1, int i_2, boolean bool_3) {
    OutboundPacket class172_4 = OutboundPacket
        .createOutboundPacket(OutboundPacketDescriptor.field2156, client.field626.field1218);
    class172_4.buffer.method3575(i_2);
    class172_4.buffer.method3594(bool_3 ? client.field853 : 0);
    class172_4.buffer.method3583(i_1);
    class172_4.buffer.method3771(i_0);
    client.field626.method1980(class172_4);
  }

}
