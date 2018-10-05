package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class97 implements Runnable {

  @ObfuscatedName("ci")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field1329;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "[Lcx;"
  )
  volatile class95[] field1327 = new class95[2];

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1865447879"
  )
  public static boolean method2214(int i_0, int i_1) {
    return (i_0 >> i_1 + 1 & 0x1) != 0;
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;ZB)[B",
      garbageValue = "0"
  )
  public static byte[] method2211(Object object_0, boolean bool_1) {
    if (object_0 == null) {
      return null;
    } else if (object_0 instanceof byte[]) {
      byte[] bytes_3 = (byte[]) ((byte[]) object_0);
      return bool_1 ? class59.method1075(bytes_3) : bytes_3;
    } else if (object_0 instanceof class186) {
      class186 class186_2 = (class186) object_0;
      return class186_2.vmethod3789();
    } else {
      throw new IllegalArgumentException();
    }
  }

  @ObfuscatedName("ff")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1818249317"
  )
  static final void method2213() {
    client.field626.method1982();
    class54.method1020();
    class28.field248.method2903();

    for (int i_0 = 0; i_0 < 4; i_0++) {
      client.field642[i_0].method3392();
    }

    System.gc();
    class26.method427(2);
    client.field812 = -1;
    client.field813 = false;

    for (class68 class68_1 = (class68) class68.field985.getFirst(); class68_1 != null;
        class68_1 = (class68) class68.field985.getNext()) {
      if (class68_1.field993 != null) {
        class36.field310.method2009(class68_1.field993);
        class68_1.field993 = null;
      }

      if (class68_1.field980 != null) {
        class36.field310.method2009(class68_1.field980);
        class68_1.field980 = null;
      }
    }

    class68.field985.clear();
    Mouse.method947(10);
  }

  @ObfuscatedName("km")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-902888602"
  )
  static void method2215() {
    if (class21.field175 != null) {
      client.field650 = client.field591;
      class21.field175.method4774();

      for (int i_0 = 0; i_0 < client.field610.length; i_0++) {
        if (client.field610[i_0] != null) {
          class21.field175.method4773((client.field610[i_0].field931 >> 7) + class62.field868,
                                      (client.field610[i_0].field881 >> 7) + client.field754);
        }
      }
    }

  }

  public void run() {
    try {
      for (int i_1 = 0; i_1 < 2; i_1++) {
        class95 class95_2 = this.field1327[i_1];
        if (class95_2 != null) {
          class95_2.method2144();
        }
      }
    } catch (Exception exception_4) {
      class5.method65((String) null, exception_4);
    }

  }

}
