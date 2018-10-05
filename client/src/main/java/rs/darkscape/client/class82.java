package rs.darkscape.client;

import java.io.EOFException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.util.Time;

@ObfuscatedName("cq")
public class class82 {

  @ObfuscatedName("h")
  @ObfuscatedGetter(
      intValue = -1811094485
  )
  public static int field1179;
  @ObfuscatedName("k")
  boolean field1176 = false;
  @ObfuscatedName("u")
  int[] field1174;
  @ObfuscatedName("q")
  String[] field1170;
  @ObfuscatedName("s")
  boolean[] field1175;
  @ObfuscatedName("l")
  boolean[] field1173;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      longValue = 7130902202106963315L
  )
  long field1177;

  class82() {
    this.field1174 = new int[class97.field1329.method4636(19)];
    this.field1170 = new String[class97.field1329.method4636(15)];
    this.field1175 = new boolean[this.field1174.length];

    int i_1;
    for (i_1 = 0; i_1 < this.field1174.length; i_1++) {
      class256 class256_2 = class21.method275(i_1);
      this.field1175[i_1] = class256_2.field3256;
    }

    this.field1173 = new boolean[this.field1170.length];

    for (i_1 = 0; i_1 < this.field1170.length; i_1++) {
      class257 class257_3 = class175.method3485(i_1);
      this.field1173[i_1] = class257_3.field3261;
    }

    for (i_1 = 0; i_1 < this.field1174.length; i_1++) {
      this.field1174[i_1] = -1;
    }

    this.method1887();
  }

  @ObfuscatedName("fl")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "670209353"
  )
  static final void method1894() {
    if (class13.field82 != client.field651) {
      client.field651 = class13.field82;
      int i_0 = class13.field82;
      int[] ints_1 = class72.field1038.field3791;
      int i_2 = ints_1.length;

      int i_3;
      for (i_3 = 0; i_3 < i_2; i_3++) {
        ints_1[i_3] = 0;
      }

      int i_4;
      int i_5;
      for (i_3 = 1; i_3 < 103; i_3++) {
        i_4 = (103 - i_3) * 2048 + 24628;

        for (i_5 = 1; i_5 < 103; i_5++) {
          if ((class50.field443[i_0][i_5][i_3] & 0x18) == 0) {
            class28.field248.method2906(ints_1, i_4, 512, i_0, i_5, i_3);
          }

          if (i_0 < 3 && (class50.field443[i_0 + 1][i_5][i_3] & 0x8) != 0) {
            class28.field248.method2906(ints_1, i_4, 512, i_0 + 1, i_5, i_3);
          }

          i_4 += 4;
        }
      }

      i_3 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (
          238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D)
          - 10);
      i_4 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
      class72.field1038.method5850();

      int i_6;
      for (i_5 = 1; i_5 < 103; i_5++) {
        for (i_6 = 1; i_6 < 103; i_6++) {
          if ((class50.field443[i_0][i_6][i_5] & 0x18) == 0) {
            class224.method4422(i_0, i_6, i_5, i_3, i_4);
          }

          if (i_0 < 3 && (class50.field443[i_0 + 1][i_6][i_5] & 0x8) != 0) {
            class224.method4422(i_0 + 1, i_6, i_5, i_3, i_4);
          }
        }
      }

      client.field724 = 0;

      for (i_5 = 0; i_5 < 104; i_5++) {
        for (i_6 = 0; i_6 < 104; i_6++) {
          long long_7 = class28.field248.method2901(class13.field82, i_5, i_6);
          if (long_7 != 0L) {
            int i_9 = Keyboard.method673(long_7);
            int i_10 = SeekableFile.method2527(i_9).field3397;
            if (i_10 >= 0) {
              client.field816[client.field724] = class255.field3246[i_10].method4815(false);
              client.field805[client.field724] = i_5;
              client.field806[client.field724] = i_6;
              ++client.field724;
            }
          }
        }
      }

      Temp.field2014.method5808();
    }

  }

  @ObfuscatedName("ht")
  @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-3"
  )
  static void method1921(int i_0, int i_1) {
    OutboundPacket class172_2 = OutboundPacket
        .createOutboundPacket(OutboundPacketDescriptor.field2158, client.field626.field1218);
    class172_2.buffer.method3687(i_0);
    class172_2.buffer.method3583(i_1);
    client.field626.method1980(class172_2);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1213879855"
  )
  void method1903(int i_1, int i_2) {
    this.field1174[i_1] = i_2;
    if (this.field1175[i_1]) {
      this.field1176 = true;
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "82"
  )
  int method1897(int i_1) {
    return this.field1174[i_1];
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "541625191"
  )
  void method1889(int i_1, String string_2) {
    this.field1170[i_1] = string_2;
    if (this.field1173[i_1]) {
      this.field1176 = true;
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-2060094389"
  )
  String method1890(int i_1) {
    return this.field1170[i_1];
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "60637204"
  )
  void method1891() {
    int i_1;
    for (i_1 = 0; i_1 < this.field1174.length; i_1++) {
      if (!this.field1175[i_1]) {
        this.field1174[i_1] = -1;
      }
    }

    for (i_1 = 0; i_1 < this.field1170.length; i_1++) {
      if (!this.field1173[i_1]) {
        this.field1170[i_1] = null;
      }
    }

  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(ZI)Ldv;",
      garbageValue = "-1191303198"
  )
  SeekableFile method1892(boolean bool_1) {
    return class22.method283("2", class112.field1455.field3144, bool_1);
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "5"
  )
  void method1893() {
    SeekableFile class110_1 = this.method1892(true);

    try {
      int i_2 = 3;
      int i_3 = 0;

      int i_4;
      for (i_4 = 0; i_4 < this.field1174.length; i_4++) {
        if (this.field1175[i_4] && this.field1174[i_4] != -1) {
          i_2 += 6;
          ++i_3;
        }
      }

      i_2 += 2;
      i_4 = 0;

      for (int i_5 = 0; i_5 < this.field1170.length; i_5++) {
        if (this.field1173[i_5] && this.field1170[i_5] != null) {
          i_2 += 2 + class316.method5820(this.field1170[i_5]);
          ++i_4;
        }
      }

      Buffer class182_9 = new Buffer(i_2);
      class182_9.putInt8(1);
      class182_9.method3755(i_3);

      int i_6;
      for (i_6 = 0; i_6 < this.field1174.length; i_6++) {
        if (this.field1175[i_6] && this.field1174[i_6] != -1) {
          class182_9.method3755(i_6);
          class182_9.putInt32(this.field1174[i_6]);
        }
      }

      class182_9.method3755(i_4);

      for (i_6 = 0; i_6 < this.field1170.length; i_6++) {
        if (this.field1173[i_6] && this.field1170[i_6] != null) {
          class182_9.method3755(i_6);
          class182_9.method3699(this.field1170[i_6]);
        }
      }

      class110_1.write(class182_9.bytes, 0, class182_9.offset);
    } catch (Exception ignored) {
    } finally {
      try {
        class110_1.close();
      } catch (Exception ignored) {
      }

    }

    this.field1176 = false;
    this.field1177 = Time.currentTimeMillis();
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-505500629"
  )
  void method1887() {
    SeekableFile class110_1 = this.method1892(false);

    label204:
    {
      try {
        byte[] bytes_2 = new byte[(int) class110_1.length()];

        int i_4;
        for (int i_3 = 0; i_3 < bytes_2.length; i_3 += i_4) {
          i_4 = class110_1.read(bytes_2, i_3, bytes_2.length - i_3);
          if (i_4 == -1) {
            throw new EOFException();
          }
        }

        Buffer class182_13 = new Buffer(bytes_2);
        if (class182_13.bytes.length - class182_13.offset >= 1) {
          int i_14 = class182_13.getUInt8();
          if (i_14 >= 0 && i_14 <= 1) {
            int i_15 = class182_13.getUInt16();

            int i_7;
            int i_8;
            int i_9;
            for (i_7 = 0; i_7 < i_15; i_7++) {
              i_8 = class182_13.getUInt16();
              i_9 = class182_13.getInt32();
              if (this.field1175[i_8]) {
                this.field1174[i_8] = i_9;
              }
            }

            i_7 = class182_13.getUInt16();
            i_8 = 0;

            while (true) {
              if (i_8 >= i_7) {
                break label204;
              }

              i_9 = class182_13.getUInt16();
              String string_10 = class182_13.method3738();
              if (this.field1173[i_9]) {
                this.field1170[i_9] = string_10;
              }

              ++i_8;
            }
          }

          return;
        }
      } catch (Exception exception_24) {
        break label204;
      } finally {
        try {
          class110_1.close();
        } catch (Exception ignored) {
        }

      }

      return;
    }

    this.field1176 = false;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-196804596"
  )
  void method1902() {
    if (this.field1176 && this.field1177 < Time.currentTimeMillis() - 60000L) {
      this.method1893();
    }

  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "9220"
  )
  boolean method1896() {
    return this.field1176;
  }

}
