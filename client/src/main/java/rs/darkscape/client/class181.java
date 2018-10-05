package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public final class class181 {

  @ObfuscatedName("qf")
  @ObfuscatedSignature(
      signature = "Lbc;"
  )
  public static class67 field2332;
  @ObfuscatedName("z")
  final int field2333 = 4096;
  @ObfuscatedName("w")
  final int field2320 = 16;
  @ObfuscatedName("s")
  final int field2327 = 258;
  @ObfuscatedName("l")
  final int field2300 = 6;
  @ObfuscatedName("u")
  final int field2298 = 50;
  @ObfuscatedName("q")
  final int field2299 = 18002;
  @ObfuscatedName("k")
  byte[] field2294;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 1713666481
  )
  int field2302;
  @ObfuscatedName("e")
  byte[] field2305;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -1013289063
  )
  int field2310;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = 2020780463
  )
  int field2295;
  @ObfuscatedName("f")
  byte field2307;
  @ObfuscatedName("g")
  @ObfuscatedGetter(
      intValue = 1896627185
  )
  int field2308;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = -1154279369
  )
  int field2309;
  @ObfuscatedName("r")
  @ObfuscatedGetter(
      intValue = -195550973
  )
  int field2316;
  @ObfuscatedName("t")
  @ObfuscatedGetter(
      intValue = 823456491
  )
  int field2311;
  @ObfuscatedName("o")
  @ObfuscatedGetter(
      intValue = -1804401527
  )
  int field2312;
  @ObfuscatedName("y")
  @ObfuscatedGetter(
      intValue = -1057581785
  )
  int field2304;
  @ObfuscatedName("a")
  @ObfuscatedGetter(
      intValue = 1763458429
  )
  int field2314;
  @ObfuscatedName("d")
  @ObfuscatedGetter(
      intValue = -1198980805
  )
  int field2325;
  @ObfuscatedName("v")
  @ObfuscatedGetter(
      intValue = -1095083449
  )
  int field2318;
  @ObfuscatedName("aa")
  @ObfuscatedGetter(
      intValue = -784898283
  )
  int field2331;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = -189685229
  )
  int field2326 = 0;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = 218244667
  )
  int field2313 = 0;
  @ObfuscatedName("j")
  int[] field2315 = new int[256];
  @ObfuscatedName("h")
  int[] field2317 = new int[257];
  @ObfuscatedName("af")
  boolean[] field2319 = new boolean[256];
  @ObfuscatedName("ah")
  boolean[] field2296 = new boolean[16];
  @ObfuscatedName("ab")
  byte[] field2321 = new byte[256];
  @ObfuscatedName("aw")
  byte[] field2322 = new byte[4096];
  @ObfuscatedName("ak")
  int[] field2323 = new int[16];
  @ObfuscatedName("as")
  byte[] field2324 = new byte[18002];
  @ObfuscatedName("an")
  byte[] field2328 = new byte[18002];
  @ObfuscatedName("ao")
  byte[][] field2303 = new byte[6][258];
  @ObfuscatedName("at")
  int[][] field2301 = new int[6][258];
  @ObfuscatedName("ai")
  int[][] field2297 = new int[6][258];
  @ObfuscatedName("ac")
  int[][] field2329 = new int[6][258];
  @ObfuscatedName("ap")
  int[] field2330 = new int[6];

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lfy;S)V",
      garbageValue = "-23215"
  )
  public static void method3529(class174 class174_0) {
    class300.field3712 = class174_0;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IIILjj;II)V",
      garbageValue = "-596460194"
  )
  static void method3528(int i_0, int i_1, int i_2, class268 class268_3, int i_4) {
    class68 class68_5 = new class68();
    class68_5.field981 = i_0;
    class68_5.field988 = i_1 * 128;
    class68_5.field983 = i_2 * 128;
    int i_6 = class268_3.field3384;
    int i_7 = class268_3.field3385;
    if (i_4 == 1 || i_4 == 3) {
      i_6 = class268_3.field3385;
      i_7 = class268_3.field3384;
    }

    class68_5.field984 = (i_6 + i_1) * 128;
    class68_5.field992 = (i_7 + i_2) * 128;
    class68_5.field987 = class268_3.field3413;
    class68_5.field991 = class268_3.field3414 * 128;
    class68_5.field989 = class268_3.field3380;
    class68_5.field982 = class268_3.field3408;
    class68_5.field986 = class268_3.field3417;
    if (class268_3.field3410 != null) {
      class68_5.field994 = class268_3;
      class68_5.method1688();
    }

    class68.field985.addLast(class68_5);
    if (class68_5.field986 != null) {
      class68_5.field990 = class68_5.field989 + (int) (Math.random() * (double) (class68_5.field982
          - class68_5.field989));
    }

  }

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-852209287"
  )
  static int method3526(int i_0, class84 class84_1, boolean bool_2) {
    int i_3;
    if (i_0 == 5504) {
      class69.field1003 -= 2;
      i_3 = class69.field999[class69.field1003];
      int i_4 = class69.field999[class69.field1003 + 1];
      if (!client.field822) {
        client.field649 = i_3;
        client.field717 = i_4;
      }

      return 1;
    } else if (i_0 == 5505) {
      class69.field999[++class69.field1003 - 1] = client.field649;
      return 1;
    } else if (i_0 == 5506) {
      class69.field999[++class69.field1003 - 1] = client.field717;
      return 1;
    } else if (i_0 == 5530) {
      i_3 = class69.field999[--class69.field1003];
      if (i_3 < 0) {
        i_3 = 0;
      }

      client.field644 = i_3;
      return 1;
    } else if (i_0 == 5531) {
      class69.field999[++class69.field1003 - 1] = client.field644;
      return 1;
    } else {
      return 2;
    }
  }

  @ObfuscatedName("kd")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "799584462"
  )
  static void method3527() {
    if (client.field663 && class138.field1876 != null) {
      int i_0 = class138.field1876.field922[0];
      int i_1 = class138.field1876.field872[0];
      if (i_0 < 0 || i_1 < 0 || i_0 >= 104 || i_1 >= 104) {
        return;
      }

      BufferedFile.field1428 = class138.field1876.field931;
      int i_2 = class27
          .method460(class138.field1876.field931, class138.field1876.field881, class13.field82)
          - client.field644;
      if (i_2 < class269.field3478) {
        class269.field3478 = i_2;
      }

      class2.field23 = class138.field1876.field881;
      client.field663 = false;
    }

  }

}
