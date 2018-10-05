package rs.darkscape.client;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.sign.SignLink;

@ObfuscatedName("bb")
public class class65 {

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "[Lbb;"
  )
  static class65[] field949;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -484083453
  )
  static int field945 = 0;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -2045294689
  )
  static int field944 = 0;
  @ObfuscatedName("i")
  static int[] field939 = new int[]{1, 1, 1, 1};
  @ObfuscatedName("x")
  static int[] field946 = new int[]{0, 1, 2, 3};
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = -1592935297
  )
  int field947;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -1045794303
  )
  int field948;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = 405776969
  )
  int field955;
  @ObfuscatedName("f")
  String field950;
  @ObfuscatedName("g")
  String field951;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = -2021362795
  )
  int field952;
  @ObfuscatedName("r")
  @ObfuscatedGetter(
      intValue = 777704071
  )
  int field943;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IS)Ljava/io/File;",
      garbageValue = "-8731"
  )
  static File method1583(String string_0, String string_1, int i_2) {
    String str_3 = i_2 == 0 ? "" : "" + i_2;
    class155.field1964 = new File(class18.field143,
                                  "jagex_cl_" + string_0 + "_" + string_1 + str_3 + ".dat");
    String string_4 = null;
    String string_5 = null;
    boolean bool_6 = false;
    Buffer class182_8;
    File file_23;
    if (class155.field1964.exists()) {
      try {
        SeekableFile class110_7 = new SeekableFile(class155.field1964, "rw", 10000L);

        int i_9;
        for (class182_8 = new Buffer((int) class110_7.length());
            class182_8.offset < class182_8.bytes.length; class182_8.offset += i_9) {
          i_9 = class110_7.read(class182_8.bytes, class182_8.offset,
                                class182_8.bytes.length - class182_8.offset);
          if (i_9 == -1) {
            throw new IOException();
          }
        }

        class182_8.offset = 0;
        i_9 = class182_8.getUInt8();
        if (i_9 < 1 || i_9 > 3) {
          throw new IOException("" + i_9);
        }

        int i_10 = 0;
        if (i_9 > 1) {
          i_10 = class182_8.getUInt8();
        }

        if (i_9 <= 2) {
          string_4 = class182_8.method3558();
          if (i_10 == 1) {
            string_5 = class182_8.method3558();
          }
        } else {
          string_4 = class182_8.method3559();
          if (i_10 == 1) {
            string_5 = class182_8.method3559();
          }
        }

        class110_7.close();
      } catch (IOException ioexception_21) {
        ioexception_21.printStackTrace();
      }

      if (string_4 != null) {
        file_23 = new File(string_4);
        if (!file_23.exists()) {
          string_4 = null;
        }
      }

      if (string_4 != null) {
        file_23 = new File(string_4, "test.dat");
        if (!class70.method1766(file_23, true)) {
          string_4 = null;
        }
      }
    }

    if (string_4 == null && i_2 == 0) {
      label137:
      for (int i_15 = 0; i_15 < class8.filestoreLocation.length; i_15++) {
        for (int i_16 = 0; i_16 < class155.cacheLocation.length; i_16++) {
          File file_17 = new File(
              class155.cacheLocation[i_16] + class8.filestoreLocation[i_15] + File.separatorChar
                  + string_0 + File.separatorChar);
          if (file_17.exists() && class70.method1766(new File(file_17, "test.dat"), true)) {
            string_4 = file_17.toString();
            bool_6 = true;
            break label137;
          }
        }
      }
    }

    if (string_4 == null) {
      string_4 = class18.field143 + File.separatorChar + "jagexcache" + str_3 + File.separatorChar
          + string_0 + File.separatorChar + string_1 + File.separatorChar;
      bool_6 = true;
    }

    File file_22;
    if (string_5 != null) {
      file_22 = new File(string_5);
      file_23 = new File(string_4);

      try {
        File[] arr_24 = file_22.listFiles();
        File[] arr_18 = arr_24;

        for (int i_11 = 0; i_11 < arr_18.length; i_11++) {
          File file_12 = arr_18[i_11];
          File file_13 = new File(file_23, file_12.getName());
          boolean bool_14 = file_12.renameTo(file_13);
          if (!bool_14) {
            throw new IOException();
          }
        }
      } catch (Exception exception_20) {
        exception_20.printStackTrace();
      }

      bool_6 = true;
    }

    if (bool_6) {
      file_22 = new File(string_4);
      class182_8 = null;

      try {
        SeekableFile class110_25 = new SeekableFile(class155.field1964, "rw", 10000L);
        Buffer class182_26 = new Buffer(500);
        class182_26.putInt8(3);
        class182_26.putInt8(class182_8 != null ? 1 : 0);
        class182_26.method3541(file_22.getPath());
        if (class182_8 != null) {
          class182_26.method3541("");
        }

        class110_25.write(class182_26.bytes, 0, class182_26.offset);
        class110_25.close();
      } catch (IOException ioexception_19) {
        ioexception_19.printStackTrace();
      }
    }

    return new File(string_4);
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lgk;IIIIIIS)V",
      garbageValue = "-9209"
  )
  static final void method1603(Buffer class182_0, int i_1, int i_2, int i_3, int i_4, int i_5,
                               int i_6) {
    int i_7;
    if (i_2 >= 0 && i_2 < 104 && i_3 >= 0 && i_3 < 104) {
      class50.field443[i_1][i_2][i_3] = 0;

      while (true) {
        i_7 = class182_0.getUInt8();
        if (i_7 == 0) {
          if (i_1 == 0) {
            int[] ints_8 = class50.field459[0][i_2];
            int i_11 = i_2 + i_4 + 932731;
            int i_12 = i_3 + i_5 + 556238;
            int i_13 = class32.method549(45365 + i_11, i_12 + 91923, 4) - 128 + (
                class32.method549(10294 + i_11, 37821 + i_12, 2) - 128 >> 1) + (
                class32.method549(i_11, i_12, 1) - 128 >> 2);
            i_13 = (int) ((double) i_13 * 0.3D) + 35;
            if (i_13 < 10) {
              i_13 = 10;
            } else if (i_13 > 60) {
              i_13 = 60;
            }

            ints_8[i_3] = -i_13 * 8;
          } else {
            class50.field459[i_1][i_2][i_3] = class50.field459[i_1 - 1][i_2][i_3] - 240;
          }
          break;
        }

        if (i_7 == 1) {
          int i_14 = class182_0.getUInt8();
          if (i_14 == 1) {
            i_14 = 0;
          }

          if (i_1 == 0) {
            class50.field459[0][i_2][i_3] = -i_14 * 8;
          } else {
            class50.field459[i_1][i_2][i_3] = class50.field459[i_1 - 1][i_2][i_3] - i_14 * 8;
          }
          break;
        }

        if (i_7 <= 49) {
          class165.field2033[i_1][i_2][i_3] = class182_0.getInt8();
          class50.field446[i_1][i_2][i_3] = (byte) ((i_7 - 2) / 4);
          class19.field159[i_1][i_2][i_3] = (byte) (i_7 - 2 + i_6 & 0x3);
        } else if (i_7 <= 81) {
          class50.field443[i_1][i_2][i_3] = (byte) (i_7 - 49);
        } else {
          class50.field445[i_1][i_2][i_3] = (byte) (i_7 - 81);
        }
      }
    } else {
      while (true) {
        i_7 = class182_0.getUInt8();
        if (i_7 == 0) {
          break;
        }

        if (i_7 == 1) {
          class182_0.getUInt8();
          break;
        }

        if (i_7 <= 49) {
          class182_0.getUInt8();
        }
      }
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(ILir;IIIZB)V",
      garbageValue = "38"
  )
  public static void method1602(int i_0, AbstractPack class247_1, int i_2, int i_3, int i_4,
                                boolean bool_5) {
    class217.field2460 = 1;
    class138.field1871 = class247_1;
    class217.field2461 = i_2;
    class217.field2462 = i_3;
    class309.field3740 = i_4;
    class217.field2463 = bool_5;
    class6.field37 = i_0;
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "168369"
  )
  static int method1605(int i_0, class84 class84_1, boolean bool_2) {
    class230 class230_3 = bool_2 ? class276.field3561 : class260.field3301;
    if (i_0 == 1500) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2618;
      return 1;
    } else if (i_0 == 1501) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2619;
      return 1;
    } else if (i_0 == 1502) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2675;
      return 1;
    } else if (i_0 == 1503) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2621;
      return 1;
    } else if (i_0 == 1504) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2625 ? 1 : 0;
      return 1;
    } else if (i_0 == 1505) {
      class69.field999[++class69.field1003 - 1] = class230_3.field2605;
      return 1;
    } else {
      return 2;
    }
  }

  @ObfuscatedName("af")
  @ObfuscatedSignature(
      signature = "(Lev;III)Lcx;",
      garbageValue = "30833833"
  )
  public static final class95 method1582(SignLink class154_0, int i_1, int i_2) {
    if (class95.field1300 == 0) {
      throw new IllegalStateException();
    } else if (i_1 >= 0 && i_1 < 2) {
      if (i_2 < 256) {
        i_2 = 256;
      }

      try {
        class95 class95_3 = class95.field1297.vmethod2052();
        class95_3.field1299 = new int[(class95.field1295 ? 2 : 1) * 256];
        class95_3.field1303 = i_2;
        class95_3.vmethod2176();
        class95_3.field1302 = (i_2 & ~0x3ff) + 1024;
        if (class95_3.field1302 > 16384) {
          class95_3.field1302 = 16384;
        }

        class95_3.vmethod2163(class95_3.field1302);
        if (class27.field230 > 0 && class69.field1010 == null) {
          class69.field1010 = new class97();
          class135.field1855 = Executors.newScheduledThreadPool(1);
          class135.field1855.scheduleAtFixedRate(class69.field1010, 0L, 10L, TimeUnit.MILLISECONDS);
        }

        if (class69.field1010 != null) {
          if (class69.field1010.field1327[i_1] != null) {
            throw new IllegalArgumentException();
          }

          class69.field1010.field1327[i_1] = class95_3;
        }

        return class95_3;
      } catch (Throwable throwable_4) {
        return new class95();
      }
    } else {
      throw new IllegalArgumentException();
    }
  }

  @ObfuscatedName("gg")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1540740873"
  )
  static void method1604() {
    OutboundPacket class172_0 = OutboundPacket
        .createOutboundPacket(OutboundPacketDescriptor.field2215, client.field626.field1218);
    PacketBuffer class189_1 = class172_0.buffer;
    int i_2 = client.field792 ? 2 : 1;
    class189_1.putInt8(i_2);
    class172_0.buffer.method3755(class82.field1179);
    class172_0.buffer.method3755(class243.field3138);
    client.field626.method1980(class172_0);
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "66"
  )
  boolean method1589() {
    return (0x1 & this.field948) != 0;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2036146048"
  )
  boolean method1567() {
    return (0x2 & this.field948) != 0;
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "83"
  )
  boolean method1568() {
    return (0x4 & this.field948) != 0;
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-648432612"
  )
  boolean method1569() {
    return (0x8 & this.field948) != 0;
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "185165272"
  )
  boolean method1570() {
    return (0x20000000 & this.field948) != 0;
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "753404361"
  )
  boolean method1577() {
    return (0x2000000 & this.field948) != 0;
  }

}
