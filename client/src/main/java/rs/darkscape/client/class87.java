package rs.darkscape.client;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.net.AbstractSocket;

@ObfuscatedName("cf")
public class class87 {

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lgs;"
  )
  public IssacRandom field1218;
  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "Lfj;"
  )
  class168 field1215;
  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "Lfj;"
  )
  class168 field1226;
  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "Lfj;"
  )
  class168 field1227;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgy;"
  )
  class203 field1223 = new class203();
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 1758377903
  )
  int field1216 = 0;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgk;"
  )
  Buffer field1217 = new Buffer(5000);
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lgi;"
  )
  PacketBuffer field1219 = new PacketBuffer(40000);
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Lfj;"
  )
  class168 field1220 = null;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 321778423
  )
  int field1225 = 0;
  @ObfuscatedName("x")
  boolean field1222 = true;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 590402107
  )
  int field1228 = 0;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = -856359331
  )
  int field1224 = 0;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lfd;"
  )
  AbstractSocket field1214;

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lir;Lir;ZII)V",
      garbageValue = "1336777365"
  )
  static void method1994(AbstractPack class247_0, AbstractPack class247_1, boolean bool_2, int i_3) {
    if (class78.field1101) {
      if (i_3 == 4) {
        class78.field1081 = 4;
      }

    } else {
      class78.field1081 = i_3;
      class314.method5724();
      byte[] bytes_4 = class247_0.method4684("title.jpg", "");
      class78.field1092 = class284.method5324(bytes_4);
      class78.field1087 = class78.field1092.method5840();
      if ((client.field632 & 0x20000000) != 0) {
        class78.field1117 = class221.method4374(class247_1, "logo_deadman_mode", "");
      } else {
        class78.field1117 = class221.method4374(class247_1, "logo", "");
      }

      class78.field1083 = class221.method4374(class247_1, "titlebox", "");
      class78.field1084 = class221.method4374(class247_1, "titlebutton", "");
      class78.field1111 = class13.method113(class247_1, "runes", "");
      class124.field1708 = class13.method113(class247_1, "title_mute", "");
      class235.field2783 = class221.method4374(class247_1, "options_radio_buttons,0", "");
      class102.field1352 = class221.method4374(class247_1, "options_radio_buttons,4", "");
      class78.field1089 = class221.method4374(class247_1, "options_radio_buttons,2", "");
      class53.field472 = class221.method4374(class247_1, "options_radio_buttons,6", "");
      class67.field978 = class235.field2783.field3780;
      class66.field966 = class235.field2783.field3781;
      class64.field936 = new int[256];

      int i_5;
      for (i_5 = 0; i_5 < 64; i_5++) {
        class64.field936[i_5] = i_5 * 262144;
      }

      for (i_5 = 0; i_5 < 64; i_5++) {
        class64.field936[i_5 + 64] = i_5 * 1024 + 16711680;
      }

      for (i_5 = 0; i_5 < 64; i_5++) {
        class64.field936[i_5 + 128] = i_5 * 4 + 16776960;
      }

      for (i_5 = 0; i_5 < 64; i_5++) {
        class64.field936[i_5 + 192] = 16777215;
      }

      class185.field2364 = new int[256];

      for (i_5 = 0; i_5 < 64; i_5++) {
        class185.field2364[i_5] = i_5 * 1024;
      }

      for (i_5 = 0; i_5 < 64; i_5++) {
        class185.field2364[i_5 + 64] = i_5 * 4 + 65280;
      }

      for (i_5 = 0; i_5 < 64; i_5++) {
        class185.field2364[i_5 + 128] = i_5 * 262144 + 65535;
      }

      for (i_5 = 0; i_5 < 64; i_5++) {
        class185.field2364[i_5 + 192] = 16777215;
      }

      class11.field69 = new int[256];

      for (i_5 = 0; i_5 < 64; i_5++) {
        class11.field69[i_5] = i_5 * 4;
      }

      for (i_5 = 0; i_5 < 64; i_5++) {
        class11.field69[i_5 + 64] = i_5 * 262144 + 255;
      }

      for (i_5 = 0; i_5 < 64; i_5++) {
        class11.field69[i_5 + 128] = i_5 * 1024 + 16711935;
      }

      for (i_5 = 0; i_5 < 64; i_5++) {
        class11.field69[i_5 + 192] = 16777215;
      }

      class77.field1077 = new int[256];
      class186.field2367 = new int[32768];
      class81.field1169 = new int[32768];
      class67.method1682((class317) null);
      class40.field357 = new int[32768];
      class76.field1073 = new int[32768];
      if (bool_2) {
        class78.field1106 = "";
        class78.field1086 = "";
      }

      class14.field104 = 0;
      class28.field238 = "";
      class78.field1104 = true;
      class78.field1107 = false;
      if (!class10.field61.field958) {
        class23.method422(2, class80.field1147, "scape main", "", 255, false);
      } else {
        class26.method427(2);
      }

      class222.method4410(false);
      class78.field1101 = true;
      class78.field1082 = (class82.field1179 - 765) / 2;
      class78.field1090 = class78.field1082 + 202;
      class78.field1091 = class78.field1090 + 180;
      class78.field1092.method5849(class78.field1082, 0);
      class78.field1087.method5849(class78.field1082 + 382, 0);
      class78.field1117.method5829(class78.field1082 + 382 - class78.field1117.field3780 / 2, 18);
    }
  }

  @ObfuscatedName("fh")
  @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-72700836"
  )
  static final void method2005(boolean bool_0) {
    if (bool_0) {
      client.field619 = class78.field1104 ? class146.field1910 : class146.field1905;
    } else {
      client.field619 =
          class10.field61.field963.containsKey(Integer.valueOf(class3.method35(class78.field1106)))
              ? class146.field1908 : class146.field1907;
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "54"
  )
  final void method1978() {
    this.field1223.method4030();
    this.field1216 = 0;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "86"
  )
  final void method1979() throws IOException {
    if (this.field1214 != null && this.field1216 > 0) {
      this.field1217.offset = 0;

      while (true) {
        OutboundPacket class172_1 = (OutboundPacket) this.field1223.method4048();
        if (class172_1 == null
            || class172_1.field2255 > this.field1217.bytes.length - this.field1217.offset) {
          this.field1214.write(this.field1217.bytes, 0, this.field1217.offset);
          this.field1224 = 0;
          break;
        }

        this.field1217.method3542(class172_1.buffer.bytes, 0, class172_1.field2255);
        this.field1216 -= class172_1.field2255;
        class172_1.unlinkNode();
        class172_1.buffer.destroy();
        class172_1.method3460();
      }
    }

  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lfn;B)V",
      garbageValue = "1"
  )
  public final void method1980(OutboundPacket class172_1) {
    this.field1223.method4031(class172_1);
    class172_1.field2255 = class172_1.buffer.offset;
    class172_1.buffer.offset = 0;
    this.field1216 += class172_1.field2255;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lfd;I)V",
      garbageValue = "1571266841"
  )
  void method1997(AbstractSocket class157_1) {
    this.field1214 = class157_1;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "822"
  )
  void method1982() {
    if (this.field1214 != null) {
      this.field1214.close();
      this.field1214 = null;
    }

  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
  )
  void method1984() {
    this.field1214 = null;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)Lfd;",
      garbageValue = "-1005622173"
  )
  AbstractSocket method1983() {
    return this.field1214;
  }

}
