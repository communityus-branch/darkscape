package rs.darkscape.client;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.sign.SignLink;

@ObfuscatedName("ar")
public final class Keyboard implements KeyListener, FocusListener {

  @ObfuscatedName("cf")
  public static char field342;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lar;"
  )
  public static Keyboard keyboard = new Keyboard();
  @ObfuscatedName("cw")
  public static boolean[] keyActive = new boolean[112];
  @ObfuscatedName("cr")
  public static int[] pressedKeyCodes = new int[128];
  @ObfuscatedName("cv")
  @ObfuscatedGetter(
      intValue = -149878467
  )
  public static int pressedKeyReadPointer = 0;
  @ObfuscatedName("cg")
  @ObfuscatedGetter(
      intValue = 90351649
  )
  public static int pressedKeyWritePointer = 0;
  @ObfuscatedName("cc")
  public static int[] field338 = new int[128];
  @ObfuscatedName("cx")
  @ObfuscatedGetter(
      intValue = 1261945265
  )
  public static int field349 = 0;
  @ObfuscatedName("cj")
  @ObfuscatedGetter(
      intValue = 2144083495
  )
  public static int field350 = 0;
  @ObfuscatedName("ci")
  @ObfuscatedGetter(
      intValue = -1066478221
  )
  public static int typedKeyPointer = 0;
  @ObfuscatedName("cn")
  @ObfuscatedGetter(
      intValue = 227916931
  )
  public static int field352 = 0;
  @ObfuscatedName("cp")
  @ObfuscatedGetter(
      intValue = 1163969327
  )
  public static volatile int field353 = 0;
  @ObfuscatedName("cs")
  static char[] typedKeyChar = new char[128];
  @ObfuscatedName("ct")
  static int[] typedKeyCode = new int[128];
  @ObfuscatedName("cz")
  static int[] keyCodeMap = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1,
      81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96,
      98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1,
      -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49,
      36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226,
      232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lgk;Lgu;I)Lgu;",
      garbageValue = "123380361"
  )
  static final class197 method691(Buffer class182_0, class197 class197_1) {
    int i_2 = class182_0.getUInt8();
    int i_3;
    if (class197_1 == null) {
      i_3 = class146.method3193(i_2);
      class197_1 = new class197(i_3);
    }

    for (i_3 = 0; i_3 < i_2; i_3++) {
      boolean bool_4 = class182_0.getUInt8() == 1;
      int i_5 = class182_0.getUInt24();
      Object obj_6;
      if (bool_4) {
        obj_6 = new class195(class182_0.method3738());
      } else {
        obj_6 = new class211(class182_0.getInt32());
      }

      class197_1.method3944((Node) obj_6, (long) i_5);
    }

    return class197_1;
  }

  @ObfuscatedName("x")
  public static int method673(long long_0) {
    return (int) (long_0 >>> 17 & 0xffffffffL);
  }

  @ObfuscatedName("hs")
  @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
      garbageValue = "44"
  )
  static final void method692(int i_0, int i_1, int i_2, int i_3, String string_4, String string_5,
                              int i_6, int i_7) {
    if (i_2 >= 2000) {
      i_2 -= 2000;
    }

    OutboundPacket class172_8;
    if (i_2 == 1) {
      client.field681 = i_6;
      client.field682 = i_7;
      client.field684 = 2;
      client.field803 = 0;
      client.field808 = i_0;
      client.field809 = i_1;
      class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2199, client.field626.field1218);
      class172_8.buffer.method3771(class297.field3683);
      class172_8.buffer.putInt8(keyActive[82] ? 1 : 0);
      class172_8.buffer.method3673(class187.field2372);
      class172_8.buffer.method3582(i_0 + class62.field868);
      class172_8.buffer.method3755(client.field754 + i_1);
      class172_8.buffer.method3583(i_3);
      class172_8.buffer.method3755(class13.field84);
      client.field626.method1980(class172_8);
    } else if (i_2 == 2) {
      client.field681 = i_6;
      client.field682 = i_7;
      client.field684 = 2;
      client.field803 = 0;
      client.field808 = i_0;
      client.field809 = i_1;
      class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2172, client.field626.field1218);
      class172_8.buffer.putInt8(keyActive[82] ? 1 : 0);
      class172_8.buffer.method3594(class40.field361);
      class172_8.buffer.method3771(client.field754 + i_1);
      class172_8.buffer.method3771(client.field736);
      class172_8.buffer.method3583(i_0 + class62.field868);
      class172_8.buffer.method3771(i_3);
      client.field626.method1980(class172_8);
    } else if (i_2 == 3) {
      client.field681 = i_6;
      client.field682 = i_7;
      client.field684 = 2;
      client.field803 = 0;
      client.field808 = i_0;
      client.field809 = i_1;
      class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2186, client.field626.field1218);
      class172_8.buffer.method3755(client.field754 + i_1);
      class172_8.buffer.method3583(i_0 + class62.field868);
      class172_8.buffer.method3755(i_3);
      class172_8.buffer.putInt8(keyActive[82] ? 1 : 0);
      client.field626.method1980(class172_8);
    } else if (i_2 == 4) {
      client.field681 = i_6;
      client.field682 = i_7;
      client.field684 = 2;
      client.field803 = 0;
      client.field808 = i_0;
      client.field809 = i_1;
      class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2169, client.field626.field1218);
      class172_8.buffer.method3582(i_0 + class62.field868);
      class172_8.buffer.method3755(client.field754 + i_1);
      class172_8.buffer.method3574(keyActive[82] ? 1 : 0);
      class172_8.buffer.method3771(i_3);
      client.field626.method1980(class172_8);
    } else if (i_2 == 5) {
      client.field681 = i_6;
      client.field682 = i_7;
      client.field684 = 2;
      client.field803 = 0;
      client.field808 = i_0;
      client.field809 = i_1;
      class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2216, client.field626.field1218);
      class172_8.buffer.method3771(client.field754 + i_1);
      class172_8.buffer.method3771(i_0 + class62.field868);
      class172_8.buffer.method3771(i_3);
      class172_8.buffer.method3575(keyActive[82] ? 1 : 0);
      client.field626.method1980(class172_8);
    } else if (i_2 == 6) {
      client.field681 = i_6;
      client.field682 = i_7;
      client.field684 = 2;
      client.field803 = 0;
      client.field808 = i_0;
      client.field809 = i_1;
      class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2232, client.field626.field1218);
      class172_8.buffer.method3583(i_3);
      class172_8.buffer.method3575(keyActive[82] ? 1 : 0);
      class172_8.buffer.method3771(i_0 + class62.field868);
      class172_8.buffer.method3582(client.field754 + i_1);
      client.field626.method1980(class172_8);
    } else {
      OutboundPacket class172_9;
      class72 class72_13;
      if (i_2 == 7) {
        class72_13 = client.field843[i_3];
        if (class72_13 != null) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_9 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2184, client.field626.field1218);
          class172_9.buffer.method3755(class13.field84);
          class172_9.buffer.method3576(keyActive[82] ? 1 : 0);
          class172_9.buffer.method3582(i_3);
          class172_9.buffer.method3583(class297.field3683);
          class172_9.buffer.method3594(class187.field2372);
          client.field626.method1980(class172_9);
        }
      } else if (i_2 == 8) {
        class72_13 = client.field843[i_3];
        if (class72_13 != null) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_9 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.OB_PACKET_0, client.field626.field1218);
          class172_9.buffer.putInt32(class40.field361);
          class172_9.buffer.method3583(client.field736);
          class172_9.buffer.method3582(i_3);
          class172_9.buffer.putInt8(keyActive[82] ? 1 : 0);
          client.field626.method1980(class172_9);
        }
      } else if (i_2 == 9) {
        class72_13 = client.field843[i_3];
        if (class72_13 != null) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_9 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2207, client.field626.field1218);
          class172_9.buffer.method3583(i_3);
          class172_9.buffer.method3575(keyActive[82] ? 1 : 0);
          client.field626.method1980(class172_9);
        }
      } else if (i_2 == 10) {
        class72_13 = client.field843[i_3];
        if (class72_13 != null) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_9 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2223, client.field626.field1218);
          class172_9.buffer.method3771(i_3);
          class172_9.buffer.method3576(keyActive[82] ? 1 : 0);
          client.field626.method1980(class172_9);
        }
      } else if (i_2 == 11) {
        class72_13 = client.field843[i_3];
        if (class72_13 != null) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_9 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2198, client.field626.field1218);
          class172_9.buffer.method3574(keyActive[82] ? 1 : 0);
          class172_9.buffer.method3771(i_3);
          client.field626.method1980(class172_9);
        }
      } else if (i_2 == 12) {
        class72_13 = client.field843[i_3];
        if (class72_13 != null) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_9 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2229, client.field626.field1218);
          class172_9.buffer.method3574(keyActive[82] ? 1 : 0);
          class172_9.buffer.method3582(i_3);
          client.field626.method1980(class172_9);
        }
      } else if (i_2 == 13) {
        class72_13 = client.field843[i_3];
        if (class72_13 != null) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_9 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2208, client.field626.field1218);
          class172_9.buffer.method3583(i_3);
          class172_9.buffer.method3575(keyActive[82] ? 1 : 0);
          client.field626.method1980(class172_9);
        }
      } else {
        class60 class60_15;
        if (i_2 == 14) {
          class60_15 = client.field610[i_3];
          if (class60_15 != null) {
            client.field681 = i_6;
            client.field682 = i_7;
            client.field684 = 2;
            client.field803 = 0;
            client.field808 = i_0;
            client.field809 = i_1;
            class172_9 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2189, client.field626.field1218);
            class172_9.buffer.method3771(class13.field84);
            class172_9.buffer.method3582(class297.field3683);
            class172_9.buffer.method3673(class187.field2372);
            class172_9.buffer.method3576(keyActive[82] ? 1 : 0);
            class172_9.buffer.method3755(i_3);
            client.field626.method1980(class172_9);
          }
        } else if (i_2 == 15) {
          class60_15 = client.field610[i_3];
          if (class60_15 != null) {
            client.field681 = i_6;
            client.field682 = i_7;
            client.field684 = 2;
            client.field803 = 0;
            client.field808 = i_0;
            client.field809 = i_1;
            class172_9 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2212, client.field626.field1218);
            class172_9.buffer.method3687(class40.field361);
            class172_9.buffer.method3582(i_3);
            class172_9.buffer.method3583(client.field736);
            class172_9.buffer.method3574(keyActive[82] ? 1 : 0);
            client.field626.method1980(class172_9);
          }
        } else if (i_2 == 16) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2234, client.field626.field1218);
          class172_8.buffer.method3771(i_3);
          class172_8.buffer.putInt8(keyActive[82] ? 1 : 0);
          class172_8.buffer.method3583(class297.field3683);
          class172_8.buffer.method3583(i_0 + class62.field868);
          class172_8.buffer.method3755(client.field754 + i_1);
          class172_8.buffer.putInt32(class187.field2372);
          class172_8.buffer.method3755(class13.field84);
          client.field626.method1980(class172_8);
        } else if (i_2 == 17) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2143, client.field626.field1218);
          class172_8.buffer.method3583(i_3);
          class172_8.buffer.method3582(i_0 + class62.field868);
          class172_8.buffer.method3583(client.field736);
          class172_8.buffer.method3771(client.field754 + i_1);
          class172_8.buffer.method3673(class40.field361);
          class172_8.buffer.putInt8(keyActive[82] ? 1 : 0);
          client.field626.method1980(class172_8);
        } else if (i_2 == 18) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2210, client.field626.field1218);
          class172_8.buffer.method3771(client.field754 + i_1);
          class172_8.buffer.method3575(keyActive[82] ? 1 : 0);
          class172_8.buffer.method3583(i_0 + class62.field868);
          class172_8.buffer.method3755(i_3);
          client.field626.method1980(class172_8);
        } else if (i_2 == 19) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2214, client.field626.field1218);
          class172_8.buffer.method3582(i_3);
          class172_8.buffer.method3583(i_0 + class62.field868);
          class172_8.buffer.method3582(client.field754 + i_1);
          class172_8.buffer.method3576(keyActive[82] ? 1 : 0);
          client.field626.method1980(class172_8);
        } else if (i_2 == 20) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2161, client.field626.field1218);
          class172_8.buffer.method3755(i_0 + class62.field868);
          class172_8.buffer.method3583(i_3);
          class172_8.buffer.method3582(client.field754 + i_1);
          class172_8.buffer.method3575(keyActive[82] ? 1 : 0);
          client.field626.method1980(class172_8);
        } else if (i_2 == 21) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2205, client.field626.field1218);
          class172_8.buffer.method3583(client.field754 + i_1);
          class172_8.buffer.method3583(i_3);
          class172_8.buffer.method3582(i_0 + class62.field868);
          class172_8.buffer.method3574(keyActive[82] ? 1 : 0);
          client.field626.method1980(class172_8);
        } else if (i_2 == 22) {
          client.field681 = i_6;
          client.field682 = i_7;
          client.field684 = 2;
          client.field803 = 0;
          client.field808 = i_0;
          client.field809 = i_1;
          class172_8 = OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2147, client.field626.field1218);
          class172_8.buffer.method3582(i_3);
          class172_8.buffer.method3582(i_0 + class62.field868);
          class172_8.buffer.method3755(client.field754 + i_1);
          class172_8.buffer.method3576(keyActive[82] ? 1 : 0);
          client.field626.method1980(class172_8);
        } else if (i_2 == 23) {
          if (client.field716) {
            class28.field248.method2974();
          } else {
            class28.field248.method2909(class13.field82, i_0, i_1, true);
          }
        } else {
          OutboundPacket class172_10;
          class230 class230_17;
          if (i_2 == 24) {
            class230_17 = class26.method434(i_1);
            boolean bool_11 = true;
            if (class230_17.field2609 > 0) {
              bool_11 = class25.method426(class230_17);
            }

            if (bool_11) {
              class172_10 = OutboundPacket
                  .createOutboundPacket(OutboundPacketDescriptor.field2230, client.field626.field1218);
              class172_10.buffer.putInt32(i_1);
              client.field626.method1980(class172_10);
            }
          } else {
            if (i_2 == 25) {
              class230_17 = class146.method3191(i_1, i_0);
              if (class230_17 != null) {
                class34.method585();
                class155.method3275(i_1, i_0, SignLink.method3252(class24.method425(class230_17)),
                                    class230_17.field2649);
                client.field733 = 0;
                client.field612 = Temp.method3239(class230_17);
                if (client.field612 == null) {
                  client.field612 = "Null";
                }

                if (class230_17.field2604) {
                  client.field739 = class230_17.field2679 + class6.method71(16777215);
                } else {
                  client.field739 =
                      class6.method71(65280) + class230_17.field2722 + class6.method71(16777215);
                }
              }

              return;
            }

            if (i_2 == 26) {
              class172_8 = OutboundPacket
                  .createOutboundPacket(OutboundPacketDescriptor.field2195, client.field626.field1218);
              client.field626.method1980(class172_8);

              for (class55 class55_14 = (class55) client.field741.method4018(); class55_14 != null;
                  class55_14 = (class55) client.field741.method4019()) {
                if (class55_14.field494 == 0 || class55_14.field494 == 3) {
                  class20.method261(class55_14, true);
                }
              }

              if (client.field744 != null) {
                class60.method1114(client.field744);
                client.field744 = null;
              }
            } else {
              int i_12;
              class230 class230_16;
              if (i_2 == 28) {
                class172_8 = OutboundPacket
                    .createOutboundPacket(OutboundPacketDescriptor.field2230, client.field626.field1218);
                class172_8.buffer.putInt32(i_1);
                client.field626.method1980(class172_8);
                class230_16 = class26.method434(i_1);
                if (class230_16.field2659 != null && class230_16.field2659[0][0] == 5) {
                  i_12 = class230_16.field2659[0][1];
                  class225.field2558[i_12] = 1 - class225.field2558[i_12];
                  class45.method749(i_12);
                }
              } else if (i_2 == 29) {
                class172_8 = OutboundPacket
                    .createOutboundPacket(OutboundPacketDescriptor.field2230, client.field626.field1218);
                class172_8.buffer.putInt32(i_1);
                client.field626.method1980(class172_8);
                class230_16 = class26.method434(i_1);
                if (class230_16.field2659 != null && class230_16.field2659[0][0] == 5) {
                  i_12 = class230_16.field2659[0][1];
                  if (class225.field2558[i_12] != class230_16.field2720[0]) {
                    class225.field2558[i_12] = class230_16.field2720[0];
                    class45.method749(i_12);
                  }
                }
              } else if (i_2 == 30) {
                if (client.field744 == null) {
                  class82.method1921(i_1, i_0);
                  client.field744 = class146.method3191(i_1, i_0);
                  class60.method1114(client.field744);
                }
              } else if (i_2 == 31) {
                class172_8 = OutboundPacket
                    .createOutboundPacket(OutboundPacketDescriptor.field2196, client.field626.field1218);
                class172_8.buffer.method3687(class187.field2372);
                class172_8.buffer.method3582(i_0);
                class172_8.buffer.method3582(class297.field3683);
                class172_8.buffer.method3594(i_1);
                class172_8.buffer.method3755(class13.field84);
                class172_8.buffer.method3582(i_3);
                client.field626.method1980(class172_8);
                client.field686 = 0;
                class240.field3096 = class26.method434(i_1);
                client.field582 = i_0;
              } else if (i_2 == 32) {
                class172_8 = OutboundPacket
                    .createOutboundPacket(OutboundPacketDescriptor.field2165, client.field626.field1218);
                class172_8.buffer.method3673(class40.field361);
                class172_8.buffer.method3755(client.field736);
                class172_8.buffer.method3594(i_1);
                class172_8.buffer.method3771(i_0);
                class172_8.buffer.method3583(i_3);
                client.field626.method1980(class172_8);
                client.field686 = 0;
                class240.field3096 = class26.method434(i_1);
                client.field582 = i_0;
              } else if (i_2 == 33) {
                class172_8 = OutboundPacket
                    .createOutboundPacket(OutboundPacketDescriptor.field2175, client.field626.field1218);
                class172_8.buffer.method3771(i_0);
                class172_8.buffer.method3583(i_3);
                class172_8.buffer.putInt32(i_1);
                client.field626.method1980(class172_8);
                client.field686 = 0;
                class240.field3096 = class26.method434(i_1);
                client.field582 = i_0;
              } else if (i_2 == 34) {
                class172_8 = OutboundPacket
                    .createOutboundPacket(OutboundPacketDescriptor.field2193, client.field626.field1218);
                class172_8.buffer.method3755(i_0);
                class172_8.buffer.method3582(i_3);
                class172_8.buffer.method3687(i_1);
                client.field626.method1980(class172_8);
                client.field686 = 0;
                class240.field3096 = class26.method434(i_1);
                client.field582 = i_0;
              } else if (i_2 == 35) {
                class172_8 = OutboundPacket
                    .createOutboundPacket(OutboundPacketDescriptor.field2166, client.field626.field1218);
                class172_8.buffer.method3582(i_0);
                class172_8.buffer.method3673(i_1);
                class172_8.buffer.method3582(i_3);
                client.field626.method1980(class172_8);
                client.field686 = 0;
                class240.field3096 = class26.method434(i_1);
                client.field582 = i_0;
              } else if (i_2 == 36) {
                class172_8 = OutboundPacket
                    .createOutboundPacket(OutboundPacketDescriptor.field2191, client.field626.field1218);
                class172_8.buffer.method3771(i_3);
                class172_8.buffer.method3583(i_0);
                class172_8.buffer.method3673(i_1);
                client.field626.method1980(class172_8);
                client.field686 = 0;
                class240.field3096 = class26.method434(i_1);
                client.field582 = i_0;
              } else if (i_2 == 37) {
                class172_8 = OutboundPacket
                    .createOutboundPacket(OutboundPacketDescriptor.field2197, client.field626.field1218);
                class172_8.buffer.method3673(i_1);
                class172_8.buffer.method3582(i_0);
                class172_8.buffer.method3583(i_3);
                client.field626.method1980(class172_8);
                client.field686 = 0;
                class240.field3096 = class26.method434(i_1);
                client.field582 = i_0;
              } else {
                if (i_2 == 38) {
                  class34.method585();
                  class230_17 = class26.method434(i_1);
                  client.field733 = 1;
                  class13.field84 = i_0;
                  class187.field2372 = i_1;
                  class297.field3683 = i_3;
                  class60.method1114(class230_17);
                  client.field734 =
                      class6.method71(16748608) + class111.method2563(i_3).field3433 + class6
                          .method71(16777215);
                  if (client.field734 == null) {
                    client.field734 = "null";
                  }

                  return;
                }

                if (i_2 == 39) {
                  class172_8 = OutboundPacket
                      .createOutboundPacket(OutboundPacketDescriptor.field2171, client.field626.field1218);
                  class172_8.buffer.method3594(i_1);
                  class172_8.buffer.method3583(i_3);
                  class172_8.buffer.method3771(i_0);
                  client.field626.method1980(class172_8);
                  client.field686 = 0;
                  class240.field3096 = class26.method434(i_1);
                  client.field582 = i_0;
                } else if (i_2 == 40) {
                  class172_8 = OutboundPacket
                      .createOutboundPacket(OutboundPacketDescriptor.field2151, client.field626.field1218);
                  class172_8.buffer.putInt32(i_1);
                  class172_8.buffer.method3582(i_3);
                  class172_8.buffer.method3582(i_0);
                  client.field626.method1980(class172_8);
                  client.field686 = 0;
                  class240.field3096 = class26.method434(i_1);
                  client.field582 = i_0;
                } else if (i_2 == 41) {
                  class172_8 = OutboundPacket
                      .createOutboundPacket(OutboundPacketDescriptor.field2202, client.field626.field1218);
                  class172_8.buffer.method3582(i_3);
                  class172_8.buffer.method3582(i_0);
                  class172_8.buffer.method3687(i_1);
                  client.field626.method1980(class172_8);
                  client.field686 = 0;
                  class240.field3096 = class26.method434(i_1);
                  client.field582 = i_0;
                } else if (i_2 == 42) {
                  class172_8 = OutboundPacket
                      .createOutboundPacket(OutboundPacketDescriptor.field2200, client.field626.field1218);
                  class172_8.buffer.method3771(i_3);
                  class172_8.buffer.method3594(i_1);
                  class172_8.buffer.method3755(i_0);
                  client.field626.method1980(class172_8);
                  client.field686 = 0;
                  class240.field3096 = class26.method434(i_1);
                  client.field582 = i_0;
                } else if (i_2 == 43) {
                  class172_8 = OutboundPacket
                      .createOutboundPacket(OutboundPacketDescriptor.field2140, client.field626.field1218);
                  class172_8.buffer.method3583(i_3);
                  class172_8.buffer.putInt32(i_1);
                  class172_8.buffer.method3582(i_0);
                  client.field626.method1980(class172_8);
                  client.field686 = 0;
                  class240.field3096 = class26.method434(i_1);
                  client.field582 = i_0;
                } else if (i_2 == 44) {
                  class60_15 = client.field610[i_3];
                  if (class60_15 != null) {
                    client.field681 = i_6;
                    client.field682 = i_7;
                    client.field684 = 2;
                    client.field803 = 0;
                    client.field808 = i_0;
                    client.field809 = i_1;
                    class172_9 = OutboundPacket
                        .createOutboundPacket(OutboundPacketDescriptor.field2206, client.field626.field1218);
                    class172_9.buffer.putInt8(keyActive[82] ? 1 : 0);
                    class172_9.buffer.method3755(i_3);
                    client.field626.method1980(class172_9);
                  }
                } else if (i_2 == 45) {
                  class60_15 = client.field610[i_3];
                  if (class60_15 != null) {
                    client.field681 = i_6;
                    client.field682 = i_7;
                    client.field684 = 2;
                    client.field803 = 0;
                    client.field808 = i_0;
                    client.field809 = i_1;
                    class172_9 = OutboundPacket
                        .createOutboundPacket(OutboundPacketDescriptor.field2181, client.field626.field1218);
                    class172_9.buffer.method3576(keyActive[82] ? 1 : 0);
                    class172_9.buffer.method3755(i_3);
                    client.field626.method1980(class172_9);
                  }
                } else if (i_2 == 46) {
                  class60_15 = client.field610[i_3];
                  if (class60_15 != null) {
                    client.field681 = i_6;
                    client.field682 = i_7;
                    client.field684 = 2;
                    client.field803 = 0;
                    client.field808 = i_0;
                    client.field809 = i_1;
                    class172_9 = OutboundPacket
                        .createOutboundPacket(OutboundPacketDescriptor.field2137, client.field626.field1218);
                    class172_9.buffer.method3574(keyActive[82] ? 1 : 0);
                    class172_9.buffer.method3583(i_3);
                    client.field626.method1980(class172_9);
                  }
                } else if (i_2 == 47) {
                  class60_15 = client.field610[i_3];
                  if (class60_15 != null) {
                    client.field681 = i_6;
                    client.field682 = i_7;
                    client.field684 = 2;
                    client.field803 = 0;
                    client.field808 = i_0;
                    client.field809 = i_1;
                    class172_9 = OutboundPacket
                        .createOutboundPacket(OutboundPacketDescriptor.field2220, client.field626.field1218);
                    class172_9.buffer.method3771(i_3);
                    class172_9.buffer.putInt8(keyActive[82] ? 1 : 0);
                    client.field626.method1980(class172_9);
                  }
                } else if (i_2 == 48) {
                  class60_15 = client.field610[i_3];
                  if (class60_15 != null) {
                    client.field681 = i_6;
                    client.field682 = i_7;
                    client.field684 = 2;
                    client.field803 = 0;
                    client.field808 = i_0;
                    client.field809 = i_1;
                    class172_9 = OutboundPacket
                        .createOutboundPacket(OutboundPacketDescriptor.field2217, client.field626.field1218);
                    class172_9.buffer.method3576(keyActive[82] ? 1 : 0);
                    class172_9.buffer.method3771(i_3);
                    client.field626.method1980(class172_9);
                  }
                } else if (i_2 == 49) {
                  class60_15 = client.field610[i_3];
                  if (class60_15 != null) {
                    client.field681 = i_6;
                    client.field682 = i_7;
                    client.field684 = 2;
                    client.field803 = 0;
                    client.field808 = i_0;
                    client.field809 = i_1;
                    class172_9 = OutboundPacket
                        .createOutboundPacket(OutboundPacketDescriptor.field2163, client.field626.field1218);
                    class172_9.buffer.method3575(keyActive[82] ? 1 : 0);
                    class172_9.buffer.method3771(i_3);
                    client.field626.method1980(class172_9);
                  }
                } else if (i_2 == 50) {
                  class60_15 = client.field610[i_3];
                  if (class60_15 != null) {
                    client.field681 = i_6;
                    client.field682 = i_7;
                    client.field684 = 2;
                    client.field803 = 0;
                    client.field808 = i_0;
                    client.field809 = i_1;
                    class172_9 = OutboundPacket
                        .createOutboundPacket(OutboundPacketDescriptor.field2222, client.field626.field1218);
                    class172_9.buffer.method3582(i_3);
                    class172_9.buffer.method3574(keyActive[82] ? 1 : 0);
                    client.field626.method1980(class172_9);
                  }
                } else if (i_2 == 51) {
                  class60_15 = client.field610[i_3];
                  if (class60_15 != null) {
                    client.field681 = i_6;
                    client.field682 = i_7;
                    client.field684 = 2;
                    client.field803 = 0;
                    client.field808 = i_0;
                    client.field809 = i_1;
                    class172_9 = OutboundPacket
                        .createOutboundPacket(OutboundPacketDescriptor.field2178, client.field626.field1218);
                    class172_9.buffer.method3771(i_3);
                    class172_9.buffer.method3575(keyActive[82] ? 1 : 0);
                    client.field626.method1980(class172_9);
                  }
                } else {
                  label961:
                  {
                    if (i_2 != 57) {
                      if (i_2 == 58) {
                        class230_17 = class146.method3191(i_1, i_0);
                        if (class230_17 != null) {
                          class172_9 = OutboundPacket
                              .createOutboundPacket(OutboundPacketDescriptor.field2159, client.field626.field1218);
                          class172_9.buffer.method3673(class40.field361);
                          class172_9.buffer.method3771(client.field737);
                          class172_9.buffer.method3673(i_1);
                          class172_9.buffer.method3582(class230_17.field2649);
                          class172_9.buffer.method3755(i_0);
                          class172_9.buffer.method3755(client.field736);
                          client.field626.method1980(class172_9);
                        }
                        break label961;
                      }

                      if (i_2 == 1001) {
                        client.field681 = i_6;
                        client.field682 = i_7;
                        client.field684 = 2;
                        client.field803 = 0;
                        client.field808 = i_0;
                        client.field809 = i_1;
                        class172_8 = OutboundPacket
                            .createOutboundPacket(OutboundPacketDescriptor.field2139, client.field626.field1218);
                        class172_8.buffer.method3582(client.field754 + i_1);
                        class172_8.buffer.method3771(i_3);
                        class172_8.buffer.method3583(i_0 + class62.field868);
                        class172_8.buffer.putInt8(keyActive[82] ? 1 : 0);
                        client.field626.method1980(class172_8);
                        break label961;
                      }

                      if (i_2 == 1002) {
                        client.field681 = i_6;
                        client.field682 = i_7;
                        client.field684 = 2;
                        client.field803 = 0;
                        class172_8 = OutboundPacket
                            .createOutboundPacket(OutboundPacketDescriptor.field2162, client.field626.field1218);
                        class172_8.buffer.method3755(i_3);
                        client.field626.method1980(class172_8);
                        break label961;
                      }

                      if (i_2 == 1003) {
                        client.field681 = i_6;
                        client.field682 = i_7;
                        client.field684 = 2;
                        client.field803 = 0;
                        class72_13 = client.field843[i_3];
                        if (class72_13 != null) {
                          class271 class271_18 = class72_13.field1037;
                          if (class271_18.field3516 != null) {
                            class271_18 = class271_18.method5189();
                          }

                          if (class271_18 != null) {
                            class172_10 = OutboundPacket
                                .createOutboundPacket(OutboundPacketDescriptor.field2146, client.field626.field1218);
                            class172_10.buffer.method3582(class271_18.field3510);
                            client.field626.method1980(class172_10);
                          }
                        }
                        break label961;
                      }

                      if (i_2 == 1004) {
                        client.field681 = i_6;
                        client.field682 = i_7;
                        client.field684 = 2;
                        client.field803 = 0;
                        class172_8 = OutboundPacket
                            .createOutboundPacket(OutboundPacketDescriptor.field2182, client.field626.field1218);
                        class172_8.buffer.method3583(i_3);
                        client.field626.method1980(class172_8);
                        break label961;
                      }

                      if (i_2 == 1005) {
                        class230_17 = class26.method434(i_1);
                        if (class230_17 != null && class230_17.field2725[i_0] >= 100000) {
                          class143.method3172(27, "", class230_17.field2725[i_0] + " x " + class111
                              .method2563(i_3).field3433);
                        } else {
                          class172_9 = OutboundPacket
                              .createOutboundPacket(OutboundPacketDescriptor.field2182, client.field626.field1218);
                          class172_9.buffer.method3583(i_3);
                          client.field626.method1980(class172_9);
                        }

                        client.field686 = 0;
                        class240.field3096 = class26.method434(i_1);
                        client.field582 = i_0;
                        break label961;
                      }

                      if (i_2 != 1007) {
                        if (i_2 == 1011 || i_2 == 1009 || i_2 == 1008 || i_2 == 1010
                            || i_2 == 1012) {
                          class53.field476
                              .method6008(i_2, i_3, new class226(i_0), new class226(i_1));
                        }
                        break label961;
                      }
                    }

                    class230_17 = class146.method3191(i_1, i_0);
                    if (class230_17 != null) {
                      class45.method747(i_3, i_1, i_0, class230_17.field2649, string_5);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

    if (client.field733 != 0) {
      client.field733 = 0;
      class60.method1114(class26.method434(class187.field2372));
    }

    if (client.field785) {
      class34.method585();
    }

    if (class240.field3096 != null && client.field686 == 0) {
      class60.method1114(class240.field3096);
    }

  }

  public final synchronized void keyPressed(KeyEvent event) {
    if (keyboard == null) {
      return;
    }

    int code = event.getKeyCode();
    if (code >= 0 && code < keyCodeMap.length) {
      code = keyCodeMap[code];
      if ((code & 0x80) != 0) {
        code = -1;
      }
    } else {
      code = -1;
    }

    if (pressedKeyWritePointer >= 0 && code >= 0) {
      pressedKeyCodes[pressedKeyWritePointer] = code;
      pressedKeyWritePointer = pressedKeyWritePointer + 1 & 0x7f;
      if (pressedKeyReadPointer == pressedKeyWritePointer) {
        pressedKeyWritePointer = -1;
      }
    }

    if (code >= 0) {
      int pointer = typedKeyPointer + 1 & 0x7f;
      if (pointer != field350) {
        typedKeyCode[typedKeyPointer] = code;
        typedKeyChar[typedKeyPointer] = 0;
        typedKeyPointer = pointer;
      }
    }

    int modifiers = event.getModifiers();
    if ((modifiers & 0xa) != 0 || code == 85 || code == 10) {
      event.consume();
    }

  }

  public final synchronized void keyReleased(KeyEvent keyevent_1) {
    if (keyboard != null) {
      int code = keyevent_1.getKeyCode();
      if (code >= 0 && code < keyCodeMap.length) {
        code = keyCodeMap[code] & ~0x80;
      } else {
        code = -1;
      }

      if (pressedKeyWritePointer >= 0 && code >= 0) {
        pressedKeyCodes[pressedKeyWritePointer] = ~code;
        pressedKeyWritePointer = pressedKeyWritePointer + 1 & 0x7f;
        if (pressedKeyWritePointer == pressedKeyReadPointer) {
          pressedKeyWritePointer = -1;
        }
      }
    }

    keyevent_1.consume();
  }

  public final synchronized void focusLost(FocusEvent focusevent_1) {
    if (keyboard != null) {
      pressedKeyWritePointer = -1;
    }

  }

  public final void focusGained(FocusEvent focusevent_1) {
  }

  public final void keyTyped(KeyEvent event) {
    if (keyboard != null) {
      char ch = event.getKeyChar();
      if (ch != 0 && ch != 65535 && class293.method5496(ch)) {
        int i_3 = typedKeyPointer + 1 & 0x7f;
        if (i_3 != field350) {
          typedKeyCode[typedKeyPointer] = -1;
          typedKeyChar[typedKeyPointer] = ch;
          typedKeyPointer = i_3;
        }
      }
    }

    event.consume();
  }

}
