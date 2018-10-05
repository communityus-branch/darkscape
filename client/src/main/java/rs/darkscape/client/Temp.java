package rs.darkscape.client;

import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.sign.SignLink;

public class Temp {

  @ObfuscatedName("au")
  @ObfuscatedSignature(
      signature = "Llc;"
  )
  public static class315 field2014;
  @ObfuscatedName("ca")
  @ObfuscatedGetter(
      intValue = 1930449729
  )
  public static int field2016;
  @ObfuscatedName("eu")
  @ObfuscatedSignature(
      signature = "Lkj;"
  )
  static class298 field1936;
  @ObfuscatedName("je")
  @ObfuscatedGetter(
      intValue = -1606452513
  )
  static int field1933;
  @ObfuscatedName("bl")
  static String field2013;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/io/File;",
      garbageValue = "512337969"
  )
  static File method3238(String string_0) {
    if (!class158.field1979) {
      throw new RuntimeException("");
    } else {
      File file_1 = (File) class158.field1975.get(string_0);
      if (file_1 != null) {
        return file_1;
      } else {
        File file_2 = new File(class158.field1974, string_0);
        RandomAccessFile randomaccessfile_3 = null;

        try {
          File file_4 = new File(file_2.getParent());
          if (!file_4.exists()) {
            throw new RuntimeException("");
          } else {
            randomaccessfile_3 = new RandomAccessFile(file_2, "rw");
            int i_5 = randomaccessfile_3.read();
            randomaccessfile_3.seek(0L);
            randomaccessfile_3.write(i_5);
            randomaccessfile_3.seek(0L);
            randomaccessfile_3.close();
            class158.field1975.put(string_0, file_2);
            return file_2;
          }
        } catch (Exception exception_8) {
          try {
            if (randomaccessfile_3 != null) {
              randomaccessfile_3.close();
              randomaccessfile_3 = null;
            }
          } catch (Exception ignored) {
          }

          throw new RuntimeException();
        }
      }
    }
  }

  @ObfuscatedName("ah")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-1833118422"
  )
  static int method3240(int i_0, class84 class84_1, boolean bool_2) {
    if (i_0 == 6200) {
      class69.field1003 -= 2;
      client.field802 = (short) class69.field999[class69.field1003];
      if (client.field802 <= 0) {
        client.field802 = 256;
      }

      client.field829 = (short) class69.field999[class69.field1003 + 1];
      if (client.field829 <= 0) {
        client.field829 = 205;
      }

      return 1;
    } else if (i_0 == 6201) {
      class69.field1003 -= 2;
      client.field848 = (short) class69.field999[class69.field1003];
      if (client.field848 <= 0) {
        client.field848 = 256;
      }

      client.field831 = (short) class69.field999[class69.field1003 + 1];
      if (client.field831 <= 0) {
        client.field831 = 320;
      }

      return 1;
    } else if (i_0 == 6202) {
      class69.field1003 -= 4;
      client.field832 = (short) class69.field999[class69.field1003];
      if (client.field832 <= 0) {
        client.field832 = 1;
      }

      client.field833 = (short) class69.field999[class69.field1003 + 1];
      if (client.field833 <= 0) {
        client.field833 = 32767;
      } else if (client.field833 < client.field832) {
        client.field833 = client.field832;
      }

      client.field834 = (short) class69.field999[class69.field1003 + 2];
      if (client.field834 <= 0) {
        client.field834 = 1;
      }

      client.field835 = (short) class69.field999[class69.field1003 + 3];
      if (client.field835 <= 0) {
        client.field835 = 32767;
      } else if (client.field835 < client.field834) {
        client.field835 = client.field834;
      }

      return 1;
    } else if (i_0 == 6203) {
      if (client.field784 != null) {
        class43.method714(0, 0, client.field784.field2675, client.field784.field2621, false);
        class69.field999[++class69.field1003 - 1] = client.field838;
        class69.field999[++class69.field1003 - 1] = client.field662;
      } else {
        class69.field999[++class69.field1003 - 1] = -1;
        class69.field999[++class69.field1003 - 1] = -1;
      }

      return 1;
    } else if (i_0 == 6204) {
      class69.field999[++class69.field1003 - 1] = client.field848;
      class69.field999[++class69.field1003 - 1] = client.field831;
      return 1;
    } else if (i_0 == 6205) {
      class69.field999[++class69.field1003 - 1] = client.field802;
      class69.field999[++class69.field1003 - 1] = client.field829;
      return 1;
    } else {
      return 2;
    }
  }

  @ObfuscatedName("jx")
  @ObfuscatedSignature(
      signature = "(Lhi;I)Ljava/lang/String;",
      garbageValue = "-2016324060"
  )
  static String method3239(class230 class230_0) {
    return SignLink.method3252(class24.method425(class230_0)) == 0 ? null
        : (class230_0.field2661 != null && class230_0.field2661.trim().length() != 0
            ? class230_0.field2661 : null);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-397804509"
  )
  public static int method3389(int i_0) {
    class263 class263_2 = (class263) class263.field3321.method3989((long) i_0);
    class263 class263_1;
    if (class263_2 != null) {
      class263_1 = class263_2;
    } else {
      byte[] bytes_7 = class263.field3322.method4625(14, i_0);
      class263_2 = new class263();
      if (bytes_7 != null) {
        class263_2.method4941(new Buffer(bytes_7));
      }

      class263.field3321.method3983(class263_2, (long) i_0);
      class263_1 = class263_2;
    }

    int i_3 = class263_1.field3320;
    int i_4 = class263_1.field3323;
    int i_5 = class263_1.field3326;
    int i_6 = class225.field2557[i_5 - i_4];
    return class225.field2558[i_3] >> i_4 & i_6;
  }

  @ObfuscatedName("ic")
  @ObfuscatedSignature(
      signature = "([Lhi;Lhi;ZI)V",
      garbageValue = "96383462"
  )
  static void method3388(class230[] arr_0, class230 class230_1, boolean bool_2) {
    int i_3 = class230_1.field2628 != 0 ? class230_1.field2628 : class230_1.field2675;
    int i_4 = class230_1.field2629 != 0 ? class230_1.field2629 : class230_1.field2621;
    class304.method5635(arr_0, class230_1.field2691, i_3, i_4, bool_2);
    if (class230_1.field2736 != null) {
      class304.method5635(class230_1.field2736, class230_1.field2691, i_3, i_4, bool_2);
    }

    class55 class55_5 = (class55) client.field741.get((long) class230_1.field2691);
    if (class55_5 != null) {
      class84.method1946(class55_5.field501, i_3, i_4, bool_2);
    }

    if (class230_1.field2609 == 1337) {
    }

  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "([BZI)Ljava/lang/Object;",
      garbageValue = "-826976613"
  )
  public static Object method3324(byte[] bytes_0, boolean bool_1) {
    if (bytes_0 == null) {
      return null;
    } else {
      if (bytes_0.length > 136 && !class186.field2365) {
        try {
          class180 class180_2 = new class180();
          class180_2.vmethod3792(bytes_0);
          return class180_2;
        } catch (Throwable throwable_3) {
          class186.field2365 = true;
        }
      }

      return bytes_0;
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "1286925984"
  )
  public static boolean method3362(char var_0) {
    return var_0 >= 48 && var_0 <= 57 || var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
  }
}
