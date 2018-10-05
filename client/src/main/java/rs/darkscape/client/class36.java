package rs.darkscape.client;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.net.AbstractSocket;
import rs.darkscape.client.util.Time;

@ObfuscatedName("ac")
public class class36 {

  @ObfuscatedName("pj")
  @ObfuscatedSignature(
      signature = "Lca;"
  )
  static class88 field310;
  @ObfuscatedName("bq")
  @ObfuscatedSignature(
      signature = "Llm;"
  )
  static class322 field306;
  @ObfuscatedName("dv")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field312;
  @ObfuscatedName("fz")
  @ObfuscatedSignature(
      signature = "[Lll;"
  )
  static class318[] field314;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 975450249
  )
  public int field307;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lha;"
  )
  public class226 field311;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lha;"
  )
  public class226 field308;

  @ObfuscatedSignature(
      signature = "(ILha;Lha;)V"
  )
  public class36(int i_1, class226 class226_2, class226 class226_3) {
    this.field307 = i_1;
    this.field311 = class226_2;
    this.field308 = class226_3;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lfd;ZI)V",
      garbageValue = "-2121353984"
  )
  public static void initializeAssetServiceConnection(AbstractSocket class157_0, boolean bool_1) {
    if (AssetService.socket != null) {
      try {
        AssetService.socket.close();
      } catch (Exception ignored) {
      }

      AssetService.socket = null;
    }

    AssetService.socket = class157_0;
    class222.method4410(bool_1);
    AssetService.field3209.offset = 0;
    AssetService.currentRequest = null;
    class301.buffer = null;
    AssetService.field3210 = 0;

    while (true) {
      RemoteArchiveRequest class246_2 = (RemoteArchiveRequest) AssetService.field3199.method4018();
      if (class246_2 == null) {
        while (true) {
          class246_2 = (RemoteArchiveRequest) AssetService.field3206.method4018();
          if (class246_2 == null) {
            if (AssetService.encryptionKey != 0) {
              try {
                Buffer class182_7 = new Buffer(4);
                class182_7.putInt8(4);
                class182_7.putInt8(AssetService.encryptionKey);
                class182_7.method3755(0);
                AssetService.socket.write(class182_7.bytes, 0, 4);
              } catch (IOException ioexception_5) {
                try {
                  AssetService.socket.close();
                } catch (Exception ignored) {
                }

                ++AssetService.field3215;
                AssetService.socket = null;
              }
            }

            AssetService.accumulatedTime = 0;
            AssetService.previousTime = Time.currentTimeMillis();
            return;
          }

          AssetService.field3202.method3908(class246_2);
          AssetService.field3204.put(class246_2, class246_2.hashKey);
          ++AssetService.field3205;
          --AssetService.field3207;
        }
      }

      AssetService.field3212.put(class246_2, class246_2.hashKey);
      ++AssetService.field3211;
      --AssetService.field3198;
    }
  }

  @ObfuscatedName("fn")
  @ObfuscatedSignature(
      signature = "(Lhi;III)V",
      garbageValue = "-201841471"
  )
  static final void method632(class230 class230_0, int i_1, int i_2) {
    if (client.field810 == 0 || client.field810 == 3) {
      if (Mouse.field431 == 1 || !class253.field3229 && Mouse.field431 == 4) {
        class224 class224_3 = class230_0.method4517(true);
        if (class224_3 == null) {
          return;
        }

        int i_4 = Mouse.field432 - i_1;
        int i_5 = Mouse.field428 - i_2;
        if (class224_3.method4423(i_4, i_5)) {
          i_4 -= class224_3.field2553 / 2;
          i_5 -= class224_3.field2549 / 2;
          int i_6 = client.field717 & 0x7ff;
          int i_7 = class122.field1681[i_6];
          int i_8 = class122.field1693[i_6];
          int i_9 = i_5 * i_7 + i_4 * i_8 >> 11;
          int i_10 = i_8 * i_5 - i_4 * i_7 >> 11;
          int i_11 = i_9 + class138.field1876.field931 >> 7;
          int i_12 = class138.field1876.field881 - i_10 >> 7;
          OutboundPacket class172_13 = OutboundPacket
              .createOutboundPacket(OutboundPacketDescriptor.field2135, client.field626.field1218);
          class172_13.buffer.putInt8(18);
          class172_13.buffer.method3755(i_11 + class62.field868);
          class172_13.buffer
              .method3575(Keyboard.keyActive[82] ? (Keyboard.keyActive[81] ? 2 : 1) : 0);
          class172_13.buffer.method3582(i_12 + client.field754);
          class172_13.buffer.putInt8(i_4);
          class172_13.buffer.putInt8(i_5);
          class172_13.buffer.method3755(client.field717);
          class172_13.buffer.putInt8(57);
          class172_13.buffer.putInt8(0);
          class172_13.buffer.putInt8(0);
          class172_13.buffer.putInt8(89);
          class172_13.buffer.method3755(class138.field1876.field931);
          class172_13.buffer.method3755(class138.field1876.field881);
          class172_13.buffer.putInt8(63);
          client.field626.method1980(class172_13);
          client.field808 = i_11;
          client.field809 = i_12;
        }
      }

    }
  }

}
