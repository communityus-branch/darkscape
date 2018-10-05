package rs.darkscape.client;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class177 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field2284;
  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "Lhq;"
  )
  public static class223 field2285;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 1679580901
  )
  static int field2283;

  static {
    new HashMap();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
      garbageValue = "29"
  )
  public static void method3509(String string_0, String string_1, int i_2, int i_3)
      throws IOException {
    class148.field1913 = i_3;
    class141.field1885 = i_2;

    try {
      class229.field2587 = System.getProperty("os.name");
    } catch (Exception exception_13) {
      class229.field2587 = "Unknown";
    }

    class75.osName = class229.field2587.toLowerCase();

    try {
      class18.field143 = System.getProperty("user.home");
      if (class18.field143 != null) {
        class18.field143 = class18.field143 + "/";
      }
    } catch (Exception ignored) {
    }

    try {
      if (class75.osName.startsWith("win")) {
        if (class18.field143 == null) {
          class18.field143 = System.getenv("USERPROFILE");
        }
      } else if (class18.field143 == null) {
        class18.field143 = System.getenv("HOME");
      }

      if (class18.field143 != null) {
        class18.field143 = class18.field143 + "/";
      }
    } catch (Exception ignored) {
    }

    if (class18.field143 == null) {
      class18.field143 = "~/";
    }

    class155.cacheLocation = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/",
        "c:/", class18.field143, "/tmp/", ""};
    class8.filestoreLocation = new String[]{".jagex_cache_" + class141.field1885,
        ".file_store_" + class141.field1885};
    int i_9 = 0;

    label92:
    while (i_9 < 4) {
      class155.field1966 = class65.method1583(string_0, string_1, i_9);
      if (!class155.field1966.exists()) {
        class155.field1966.mkdirs();
      }

      File[] arr_5 = class155.field1966.listFiles();
      if (arr_5 == null) {
        break;
      }

      File[] arr_6 = arr_5;
      int i_7 = 0;

      while (true) {
        if (i_7 >= arr_6.length) {
          break label92;
        }

        File file_8 = arr_6[i_7];
        if (!class70.method1766(file_8, false)) {
          ++i_9;
          break;
        }

        ++i_7;
      }
    }

    File file_4 = class155.field1966;
    class158.field1974 = file_4;
    if (!class158.field1974.exists()) {
      throw new RuntimeException("");
    } else {
      class158.field1979 = true;
      class29.method476();
      class155.blocksFile = new BufferedFile(
          new SeekableFile(Temp.method3238("main_file_cache.dat2"), "rw", 1048576000L), 5200,
          0);
      class155.manifestIndex = new BufferedFile(
          new SeekableFile(Temp.method3238("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
      class76.field1068 = new BufferedFile[class148.field1913];

      for (int i_10 = 0; i_10 < class148.field1913; i_10++) {
        class76.field1068[i_10] = new BufferedFile(
            new SeekableFile(Temp.method3238("main_file_cache.idx" + i_10), "rw", 1048576L),
            6000, 0);
      }

    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgi;I)V",
      garbageValue = "-2137286029"
  )
  static final void method3512(PacketBuffer class189_0) {
    int i_1 = 0;
    class189_0.method3823();

    int i_2;
    int i_3;
    int i_4;
    for (i_2 = 0; i_2 < class81.field1167; i_2++) {
      i_3 = class81.field1159[i_2];
      if ((class81.field1156[i_3] & 0x1) == 0) {
        if (i_1 > 0) {
          --i_1;
          class81.field1156[i_3] = (byte) (class81.field1156[i_3] | 0x2);
        } else {
          i_4 = class189_0.method3817(1);
          if (i_4 == 0) {
            i_1 = class168.method3445(class189_0);
            class81.field1156[i_3] = (byte) (class81.field1156[i_3] | 0x2);
          } else {
            class6.method73(class189_0, i_3);
          }
        }
      }
    }

    class189_0.method3816();
    if (i_1 != 0) {
      throw new RuntimeException();
    } else {
      class189_0.method3823();

      for (i_2 = 0; i_2 < class81.field1167; i_2++) {
        i_3 = class81.field1159[i_2];
        if ((class81.field1156[i_3] & 0x1) != 0) {
          if (i_1 > 0) {
            --i_1;
            class81.field1156[i_3] = (byte) (class81.field1156[i_3] | 0x2);
          } else {
            i_4 = class189_0.method3817(1);
            if (i_4 == 0) {
              i_1 = class168.method3445(class189_0);
              class81.field1156[i_3] = (byte) (class81.field1156[i_3] | 0x2);
            } else {
              class6.method73(class189_0, i_3);
            }
          }
        }
      }

      class189_0.method3816();
      if (i_1 != 0) {
        throw new RuntimeException();
      } else {
        class189_0.method3823();

        for (i_2 = 0; i_2 < class81.field1160; i_2++) {
          i_3 = class81.field1161[i_2];
          if ((class81.field1156[i_3] & 0x1) != 0) {
            if (i_1 > 0) {
              --i_1;
              class81.field1156[i_3] = (byte) (class81.field1156[i_3] | 0x2);
            } else {
              i_4 = class189_0.method3817(1);
              if (i_4 == 0) {
                i_1 = class168.method3445(class189_0);
                class81.field1156[i_3] = (byte) (class81.field1156[i_3] | 0x2);
              } else if (class240.method4601(class189_0, i_3)) {
                class81.field1156[i_3] = (byte) (class81.field1156[i_3] | 0x2);
              }
            }
          }
        }

        class189_0.method3816();
        if (i_1 != 0) {
          throw new RuntimeException();
        } else {
          class189_0.method3823();

          for (i_2 = 0; i_2 < class81.field1160; i_2++) {
            i_3 = class81.field1161[i_2];
            if ((class81.field1156[i_3] & 0x1) == 0) {
              if (i_1 > 0) {
                --i_1;
                class81.field1156[i_3] = (byte) (class81.field1156[i_3] | 0x2);
              } else {
                i_4 = class189_0.method3817(1);
                if (i_4 == 0) {
                  i_1 = class168.method3445(class189_0);
                  class81.field1156[i_3] = (byte) (class81.field1156[i_3] | 0x2);
                } else if (class240.method4601(class189_0, i_3)) {
                  class81.field1156[i_3] = (byte) (class81.field1156[i_3] | 0x2);
                }
              }
            }
          }

          class189_0.method3816();
          if (i_1 != 0) {
            throw new RuntimeException();
          } else {
            class81.field1167 = 0;
            class81.field1160 = 0;

            for (i_2 = 1; i_2 < 2048; i_2++) {
              class81.field1156[i_2] = (byte) (class81.field1156[i_2] >> 1);
              class60 class60_5 = client.field610[i_2];
              if (class60_5 != null) {
                class81.field1159[++class81.field1167 - 1] = i_2;
              } else {
                class81.field1161[++class81.field1160 - 1] = i_2;
              }
            }

          }
        }
      }
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "885632790"
  )
  static final void method3510(int i_0, int i_1, int i_2, int i_3) {
    for (int i_4 = i_1; i_4 <= i_3 + i_1; i_4++) {
      for (int i_5 = i_0; i_5 <= i_0 + i_2; i_5++) {
        if (i_5 >= 0 && i_5 < 104 && i_4 >= 0 && i_4 < 104) {
          class50.field447[0][i_5][i_4] = 127;
          if (i_0 == i_5 && i_5 > 0) {
            class50.field459[0][i_5][i_4] = class50.field459[0][i_5 - 1][i_4];
          }

          if (i_5 == i_0 + i_2 && i_5 < 103) {
            class50.field459[0][i_5][i_4] = class50.field459[0][i_5 + 1][i_4];
          }

          if (i_4 == i_1 && i_4 > 0) {
            class50.field459[0][i_5][i_4] = class50.field459[0][i_5][i_4 - 1];
          }

          if (i_3 + i_1 == i_4 && i_4 < 103) {
            class50.field459[0][i_5][i_4] = class50.field459[0][i_5][i_4 + 1];
          }
        }
      }
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1945852899"
  )
  static void method3507(int i_0) {
    class53 class53_1 = (class53) class53.field474.get((long) i_0);
    if (class53_1 != null) {
      class53_1.unlinkNode();
    }
  }

  @ObfuscatedName("ed")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2097572835"
  )
  static final void method3513() {
    class125.field1760 = false;
    client.field585 = false;
  }

  @ObfuscatedName("jm")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-280665232"
  )
  static final void method3508(String string_0) {
    if (class14.field94 != null) {
      OutboundPacket class172_1 = OutboundPacket
          .createOutboundPacket(OutboundPacketDescriptor.field2174, client.field626.field1218);
      class172_1.buffer.putInt8(class316.method5820(string_0));
      class172_1.buffer.method3699(string_0);
      client.field626.method1980(class172_1);
    }
  }

}
