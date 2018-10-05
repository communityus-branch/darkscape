package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class OutboundPacket extends Node {

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "[Lfn;"
  )
  static OutboundPacket[] stack = new OutboundPacket[300];
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 2054951839
  )
  static int stackPointer = 0;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lgi;"
  )
  public PacketBuffer buffer;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -590159423
  )
  public int field2255;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lfi;"
  )
  OutboundPacketDescriptor descriptor;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 9187127
  )
  int len;

  @ObfuscatedName("z")
  public static String method3457(long long_0) {
    if (long_0 > 0L && long_0 < 6582952005840035281L) {
      if (long_0 % 37L == 0L) {
        return null;
      } else {
        int i_2 = 0;

        for (long long_3 = long_0; long_3 != 0L; long_3 /= 37L) {
          ++i_2;
        }

        StringBuilder stringbuilder_5;
        char var_8;
        for (stringbuilder_5 = new StringBuilder(i_2); long_0 != 0L;
            stringbuilder_5.append(var_8)) {
          long long_6 = long_0;
          long_0 /= 37L;
          var_8 = class303.field3720[(int) (long_6 - long_0 * 37L)];
          if (var_8 == 95) {
            int i_9 = stringbuilder_5.length() - 1;
            stringbuilder_5.setCharAt(i_9, Character.toUpperCase(stringbuilder_5.charAt(i_9)));
            var_8 = 160;
          }
        }

        stringbuilder_5.reverse();
        stringbuilder_5.setCharAt(0, Character.toUpperCase(stringbuilder_5.charAt(0)));
        return stringbuilder_5.toString();
      }
    } else {
      return null;
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lll;IIII)V",
      garbageValue = "-1222974971"
  )
  static void method3458(class318 class318_0, int i_1, int i_2, int i_3) {
    class23.field188
        .method3998(class318_0, class43.method716(i_1, i_2, i_3), class318_0.field3791.length * 4);
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-101"
  )
  static void method3456() {
    class83.field1180.clear();
    class83.field1181.method3951();
    class83.field1184.method4168();
    class83.field1186 = 0;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lfi;Lgs;I)Lfn;",
      garbageValue = "-1221349687"
  )
  public static OutboundPacket createOutboundPacket(OutboundPacketDescriptor descriptor, IssacRandom random) {
    OutboundPacket packet;
    if (stackPointer == 0) {
      packet = new OutboundPacket();
    } else {
      packet = stack[--stackPointer];
    }

    packet.descriptor = descriptor;
    packet.len = descriptor.len;
    if (packet.len == -1) {
      packet.buffer = new PacketBuffer(260);
    } else if (packet.len == -2) {
      packet.buffer = new PacketBuffer(10000);
    } else if (packet.len <= 18) {
      packet.buffer = new PacketBuffer(20);
    } else if (packet.len <= 98) {
      packet.buffer = new PacketBuffer(100);
    } else {
      packet.buffer = new PacketBuffer(260);
    }

    packet.buffer.setRandom(random);
    packet.buffer.writeEncryptedInt8(packet.descriptor.id);
    packet.field2255 = 0;
    return packet;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1433475815"
  )
  public void method3460() {
    if (stackPointer < stack.length) {
      stack[++stackPointer - 1] = this;
    }
  }

}
