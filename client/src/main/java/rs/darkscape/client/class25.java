package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class25 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lv;"
  )
  static final class25 field212 = new class25(0);
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lv;"
  )
  static final class25 field209 = new class25(1);
  @ObfuscatedName("c")
  static int[] field215;
  @ObfuscatedName("fn")
  @ObfuscatedSignature(
      signature = "[Lly;"
  )
  static class317[] field214;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -1536539371
  )
  final int field211;

  class25(int i_1) {
    this.field211 = i_1;
  }

  @ObfuscatedName("jd")
  @ObfuscatedSignature(
      signature = "(Lhi;I)Z",
      garbageValue = "2065048163"
  )
  static final boolean method426(class230 class230_0) {
    int i_1 = class230_0.field2609;
    if (i_1 == 205) {
      client.field627 = 250;
      return true;
    } else {
      int i_2;
      int i_3;
      if (i_1 >= 300 && i_1 <= 313) {
        i_2 = (i_1 - 300) / 2;
        i_3 = i_1 & 0x1;
        client.field841.method4478(i_2, i_3 == 1);
      }

      if (i_1 >= 314 && i_1 <= 323) {
        i_2 = (i_1 - 314) / 2;
        i_3 = i_1 & 0x1;
        client.field841.method4493(i_2, i_3 == 1);
      }

      if (i_1 == 324) {
        client.field841.method4465(false);
      }

      if (i_1 == 325) {
        client.field841.method4465(true);
      }

      if (i_1 == 326) {
        OutboundPacket class172_4 = OutboundPacket
            .createOutboundPacket(OutboundPacketDescriptor.field2173, client.field626.field1218);
        client.field841.method4466(class172_4.buffer);
        client.field626.method1980(class172_4);
        return true;
      } else {
        return false;
      }
    }
  }

}
