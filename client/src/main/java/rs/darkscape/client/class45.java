package rs.darkscape.client;

import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class class45 {

  @ObfuscatedName("z")
  static Applet field378 = null;
  @ObfuscatedName("w")
  static String field379 = "";

  @ObfuscatedName("hl")
  @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;B)V",
      garbageValue = "66"
  )
  static void method747(int i_0, int i_1, int i_2, int i_3, String string_4) {
    class230 class230_5 = class146.method3191(i_1, i_2);
    if (class230_5 != null) {
      if (class230_5.field2706 != null) {
        class56 class56_6 = new class56();
        class56_6.field506 = class230_5;
        class56_6.field517 = i_0;
        class56_6.field504 = string_4;
        class56_6.field512 = class230_5.field2706;
        class68.method1696(class56_6);
      }

      boolean bool_11 = true;
      if (class230_5.field2609 > 0) {
        bool_11 = class25.method426(class230_5);
      }

      if (bool_11) {
        int i_8 = class24.method425(class230_5);
        int i_9 = i_0 - 1;
        boolean bool_7 = (i_8 >> i_9 + 1 & 0x1) != 0;
        if (bool_7) {
          OutboundPacket class172_10;
          if (i_0 == 1) {
            class172_10 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2149, client.field626.field1218);
            class172_10.buffer.putInt32(i_1);
            class172_10.buffer.method3755(i_2);
            class172_10.buffer.method3755(i_3);
            client.field626.method1980(class172_10);
          }

          if (i_0 == 2) {
            class172_10 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2141, client.field626.field1218);
            class172_10.buffer.putInt32(i_1);
            class172_10.buffer.method3755(i_2);
            class172_10.buffer.method3755(i_3);
            client.field626.method1980(class172_10);
          }

          if (i_0 == 3) {
            class172_10 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2155, client.field626.field1218);
            class172_10.buffer.putInt32(i_1);
            class172_10.buffer.method3755(i_2);
            class172_10.buffer.method3755(i_3);
            client.field626.method1980(class172_10);
          }

          if (i_0 == 4) {
            class172_10 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2144, client.field626.field1218);
            class172_10.buffer.putInt32(i_1);
            class172_10.buffer.method3755(i_2);
            class172_10.buffer.method3755(i_3);
            client.field626.method1980(class172_10);
          }

          if (i_0 == 5) {
            class172_10 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2213, client.field626.field1218);
            class172_10.buffer.putInt32(i_1);
            class172_10.buffer.method3755(i_2);
            class172_10.buffer.method3755(i_3);
            client.field626.method1980(class172_10);
          }

          if (i_0 == 6) {
            class172_10 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2231, client.field626.field1218);
            class172_10.buffer.putInt32(i_1);
            class172_10.buffer.method3755(i_2);
            class172_10.buffer.method3755(i_3);
            client.field626.method1980(class172_10);
          }

          if (i_0 == 7) {
            class172_10 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2160, client.field626.field1218);
            class172_10.buffer.putInt32(i_1);
            class172_10.buffer.method3755(i_2);
            class172_10.buffer.method3755(i_3);
            client.field626.method1980(class172_10);
          }

          if (i_0 == 8) {
            class172_10 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2226, client.field626.field1218);
            class172_10.buffer.putInt32(i_1);
            class172_10.buffer.method3755(i_2);
            class172_10.buffer.method3755(i_3);
            client.field626.method1980(class172_10);
          }

          if (i_0 == 9) {
            class172_10 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2138, client.field626.field1218);
            class172_10.buffer.putInt32(i_1);
            class172_10.buffer.method3755(i_2);
            class172_10.buffer.method3755(i_3);
            client.field626.method1980(class172_10);
          }

          if (i_0 == 10) {
            class172_10 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2180, client.field626.field1218);
            class172_10.buffer.putInt32(i_1);
            class172_10.buffer.method3755(i_2);
            class172_10.buffer.method3755(i_3);
            client.field626.method1980(class172_10);
          }

        }
      }
    }
  }

  @ObfuscatedName("jj")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-65961600"
  )
  static final void method749(int i_0) {
    class295.method5501();
    class6.method75();
    int i_1 = class63.method1549(i_0).field3230;
    if (i_1 != 0) {
      int i_2 = class225.field2558[i_0];
      if (i_1 == 1) {
        if (i_2 == 1) {
          class122.method2830(0.9D);
          ((class111) class122.field1667).method2544(0.9D);
        }

        if (i_2 == 2) {
          class122.method2830(0.8D);
          ((class111) class122.field1667).method2544(0.8D);
        }

        if (i_2 == 3) {
          class122.method2830(0.7D);
          ((class111) class122.field1667).method2544(0.7D);
        }

        if (i_2 == 4) {
          class122.method2830(0.6D);
          ((class111) class122.field1667).method2544(0.6D);
        }

        class269.field3429.method3984();
      }

      if (i_1 == 3) {
        short s_3 = 0;
        if (i_2 == 0) {
          s_3 = 255;
        }

        if (i_2 == 1) {
          s_3 = 192;
        }

        if (i_2 == 2) {
          s_3 = 128;
        }

        if (i_2 == 3) {
          s_3 = 64;
        }

        if (i_2 == 4) {
          s_3 = 0;
        }

        if (s_3 != client.field811) {
          if (client.field811 == 0 && client.field812 != -1) {
            class63.method1554(class80.field1147, client.field812, 0, s_3, false);
            client.field813 = false;
          } else if (s_3 == 0) {
            class9.method88();
            client.field813 = false;
          } else if (class217.field2460 != 0) {
            class309.field3740 = s_3;
          } else {
            class217.field2459.method4236(s_3);
          }

          client.field811 = s_3;
        }
      }

      if (i_1 == 4) {
        if (i_2 == 0) {
          client.field814 = 127;
        }

        if (i_2 == 1) {
          client.field814 = 96;
        }

        if (i_2 == 2) {
          client.field814 = 64;
        }

        if (i_2 == 3) {
          client.field814 = 32;
        }

        if (i_2 == 4) {
          client.field814 = 0;
        }
      }

      if (i_1 == 5) {
        client.field715 = i_2;
      }

      if (i_1 == 6) {
        client.field742 = i_2;
      }

      if (i_1 == 9) {
        client.field743 = i_2;
      }

      if (i_1 == 10) {
        if (i_2 == 0) {
          client.field815 = 127;
        }

        if (i_2 == 1) {
          client.field815 = 96;
        }

        if (i_2 == 2) {
          client.field815 = 64;
        }

        if (i_2 == 3) {
          client.field815 = 32;
        }

        if (i_2 == 4) {
          client.field815 = 0;
        }
      }

      if (i_1 == 17) {
        client.field748 = i_2 & 0xffff;
      }

      class77[] arr_4;
      if (i_1 == 18) {
        arr_4 = new class77[]{class77.field1080, class77.field1074, class77.field1075,
            class77.field1076};
        client.field607 = (class77) class76.method1803(arr_4, i_2);
        if (client.field607 == null) {
          client.field607 = class77.field1080;
        }
      }

      if (i_1 == 19) {
        if (i_2 == -1) {
          client.field707 = -1;
        } else {
          client.field707 = i_2 & 0x7ff;
        }
      }

      if (i_1 == 22) {
        arr_4 = new class77[]{class77.field1080, class77.field1074, class77.field1075,
            class77.field1076};
        client.field780 = (class77) class76.method1803(arr_4, i_2);
        if (client.field780 == null) {
          client.field780 = class77.field1080;
        }
      }

    }
  }

}
