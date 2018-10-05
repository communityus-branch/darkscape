package rs.darkscape.client;

import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class22 {

  @ObfuscatedName("mu")
  @ObfuscatedSignature(
      signature = "Lcq;"
  )
  static class82 field185;
  @ObfuscatedName("do")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field183;
  @ObfuscatedName("z")
  String field186;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -595301837
  )
  int field184;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 252294915
  )
  int field182;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Ln;"
  )
  class12 field181;

  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IILn;)V"
  )
  class22(String string_1, int i_2, int i_3, class12 class12_4) {
    this.field186 = string_1;
    this.field184 = i_2;
    this.field182 = i_3;
    this.field181 = class12_4;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lic;IIIBZI)V",
      garbageValue = "-1235545078"
  )
  static void request(class249 class249_0, int i_1, int i_2, int i_3, byte b_4, boolean bool_5) {
    long long_6 = (long) ((i_1 << 16) + i_2);
    RemoteArchiveRequest request = (RemoteArchiveRequest) AssetService.field3212.get(long_6);
    if (request != null) {
      return;
    }
    request = (RemoteArchiveRequest) AssetService.field3199.get(long_6);
    if (request != null) {
      return;
    }
    request = (RemoteArchiveRequest) AssetService.field3204.get(long_6);
    if (request == null) {
      if (!bool_5) {
        request = (RemoteArchiveRequest) AssetService.field3206.get(long_6);
        if (request != null) {
          return;
        }
      }

      request = new RemoteArchiveRequest();
      request.field3155 = class249_0;
      request.checksum = i_3;
      request.trailerLength = b_4;
      if (bool_5) {
        AssetService.field3212.put(request, long_6);
        ++AssetService.field3211;
      } else {
        AssetService.field3202.method3910(request);
        AssetService.field3204.put(request, long_6);
        ++AssetService.field3205;
      }

    } else {
      if (bool_5) {
        request.unlinkSubNode();
        AssetService.field3212.put(request, long_6);
        --AssetService.field3205;
        ++AssetService.field3211;
      }

    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "([Lbb;II[I[II)V",
      garbageValue = "1515419045"
  )
  static void method282(class65[] arr_0, int i_1, int i_2, int[] ints_3, int[] ints_4) {
    if (i_1 < i_2) {
      int i_5 = i_1 - 1;
      int i_6 = i_2 + 1;
      int i_7 = (i_2 + i_1) / 2;
      class65 class65_8 = arr_0[i_7];
      arr_0[i_7] = arr_0[i_1];
      arr_0[i_1] = class65_8;

      while (i_5 < i_6) {
        boolean bool_9 = true;

        int i_10;
        int i_11;
        int i_12;
        do {
          --i_6;

          for (i_10 = 0; i_10 < 4; i_10++) {
            if (ints_3[i_10] == 2) {
              i_11 = arr_0[i_6].field943;
              i_12 = class65_8.field943;
            } else if (ints_3[i_10] == 1) {
              i_11 = arr_0[i_6].field955;
              i_12 = class65_8.field955;
              if (i_11 == -1 && ints_4[i_10] == 1) {
                i_11 = 2001;
              }

              if (i_12 == -1 && ints_4[i_10] == 1) {
                i_12 = 2001;
              }
            } else if (ints_3[i_10] == 3) {
              i_11 = arr_0[i_6].method1589() ? 1 : 0;
              i_12 = class65_8.method1589() ? 1 : 0;
            } else {
              i_11 = arr_0[i_6].field947;
              i_12 = class65_8.field947;
            }

            if (i_11 != i_12) {
              if ((ints_4[i_10] != 1 || i_11 <= i_12) && (ints_4[i_10] != 0 || i_11 >= i_12)) {
                bool_9 = false;
              }
              break;
            }

            if (i_10 == 3) {
              bool_9 = false;
            }
          }
        } while (bool_9);

        bool_9 = true;

        do {
          ++i_5;

          for (i_10 = 0; i_10 < 4; i_10++) {
            if (ints_3[i_10] == 2) {
              i_11 = arr_0[i_5].field943;
              i_12 = class65_8.field943;
            } else if (ints_3[i_10] == 1) {
              i_11 = arr_0[i_5].field955;
              i_12 = class65_8.field955;
              if (i_11 == -1 && ints_4[i_10] == 1) {
                i_11 = 2001;
              }

              if (i_12 == -1 && ints_4[i_10] == 1) {
                i_12 = 2001;
              }
            } else if (ints_3[i_10] == 3) {
              i_11 = arr_0[i_5].method1589() ? 1 : 0;
              i_12 = class65_8.method1589() ? 1 : 0;
            } else {
              i_11 = arr_0[i_5].field947;
              i_12 = class65_8.field947;
            }

            if (i_12 != i_11) {
              if ((ints_4[i_10] != 1 || i_11 >= i_12) && (ints_4[i_10] != 0 || i_11 <= i_12)) {
                bool_9 = false;
              }
              break;
            }

            if (i_10 == 3) {
              bool_9 = false;
            }
          }
        } while (bool_9);

        if (i_5 < i_6) {
          class65 class65_13 = arr_0[i_5];
          arr_0[i_5] = arr_0[i_6];
          arr_0[i_6] = class65_13;
        }
      }

      method282(arr_0, i_1, i_6, ints_3, ints_4);
      method282(arr_0, i_6 + 1, i_2, ints_3, ints_4);
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;ZI)Ldv;",
      garbageValue = "1914569734"
  )
  public static SeekableFile method283(String string_0, String string_1, boolean bool_2) {
    File file_3 = new File(class155.field1966, "preferences" + string_0 + ".dat");
    if (file_3.exists()) {
      try {
        SeekableFile class110_10 = new SeekableFile(file_3, "rw", 10000L);
        return class110_10;
      } catch (IOException ignored) {
      }
    }

    String str_4 = "";
    if (class141.field1885 == 33) {
      str_4 = "_rc";
    } else if (class141.field1885 == 34) {
      str_4 = "_wip";
    }

    File file_5 = new File(class18.field143,
                           "jagex_" + string_1 + "_preferences" + string_0 + str_4 + ".dat");
    SeekableFile class110_6;
    if (!bool_2 && file_5.exists()) {
      try {
        class110_6 = new SeekableFile(file_5, "rw", 10000L);
        return class110_6;
      } catch (IOException ignored) {
      }
    }

    try {
      class110_6 = new SeekableFile(file_3, "rw", 10000L);
      return class110_6;
    } catch (IOException ioexception_7) {
      throw new RuntimeException();
    }
  }

  @ObfuscatedName("iu")
  @ObfuscatedSignature(
      signature = "(Lhi;III)V",
      garbageValue = "-1127848526"
  )
  static void method281(class230 class230_0, int i_1, int i_2) {
    if (class230_0.field2610 == 0) {
      class230_0.field2618 = class230_0.field2607;
    } else if (class230_0.field2610 == 1) {
      class230_0.field2618 = class230_0.field2607 + (i_1 - class230_0.field2675) / 2;
    } else if (class230_0.field2610 == 2) {
      class230_0.field2618 = i_1 - class230_0.field2675 - class230_0.field2607;
    } else if (class230_0.field2610 == 3) {
      class230_0.field2618 = class230_0.field2607 * i_1 >> 14;
    } else if (class230_0.field2610 == 4) {
      class230_0.field2618 = (i_1 - class230_0.field2675) / 2 + (class230_0.field2607 * i_1 >> 14);
    } else {
      class230_0.field2618 = i_1 - class230_0.field2675 - (class230_0.field2607 * i_1 >> 14);
    }

    if (class230_0.field2611 == 0) {
      class230_0.field2619 = class230_0.field2615;
    } else if (class230_0.field2611 == 1) {
      class230_0.field2619 = (i_2 - class230_0.field2621) / 2 + class230_0.field2615;
    } else if (class230_0.field2611 == 2) {
      class230_0.field2619 = i_2 - class230_0.field2621 - class230_0.field2615;
    } else if (class230_0.field2611 == 3) {
      class230_0.field2619 = i_2 * class230_0.field2615 >> 14;
    } else if (class230_0.field2611 == 4) {
      class230_0.field2619 = (i_2 - class230_0.field2621) / 2 + (i_2 * class230_0.field2615 >> 14);
    } else {
      class230_0.field2619 = i_2 - class230_0.field2621 - (i_2 * class230_0.field2615 >> 14);
    }

  }

}
