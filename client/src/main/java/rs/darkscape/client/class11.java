package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.sign.SignLink;

@ObfuscatedName("b")
public class class11 {

  @ObfuscatedName("pl")
  @ObfuscatedGetter(
      intValue = -1317413597
  )
  static int field68;
  @ObfuscatedName("c")
  static int[] field69;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;Lir;Lir;Lir;S)V",
      garbageValue = "22982"
  )
  public static void method100(AbstractPack class247_0, AbstractPack class247_1, AbstractPack class247_2,
                               AbstractPack class247_3) {
    class230.field2729 = class247_0;
    class230.field2642 = class247_1;
    SignLink.field1956 = class247_2;
    class230.field2598 = class247_3;
    class42.field366 = new class230[class230.field2729.method4637()][];
    class175.field2271 = new boolean[class230.field2729.method4637()];
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1543564143"
  )
  static int method99() {
    return 11;
  }

  @ObfuscatedName("gr")
  @ObfuscatedSignature(
      signature = "(Lbu;ZI)V",
      garbageValue = "-863688081"
  )
  static void method98(class60 class60_0, boolean bool_1) {
    if (class60_0 != null && class60_0.vmethod1786() && !class60_0.field566) {
      class60_0.field560 = false;
      if ((client.field585 && class81.field1167 > 50 || class81.field1167 > 200) && bool_1
          && class60_0.field893 == class60_0.field900) {
        class60_0.field560 = true;
      }

      int i_2 = class60_0.field931 >> 7;
      int i_3 = class60_0.field881 >> 7;
      if (i_2 >= 0 && i_2 < 104 && i_3 >= 0 && i_3 < 104) {
        long long_4 = class76.method1804(0, 0, 0, false, class60_0.field574);
        if (class60_0.field563 != null && client.field591 >= class60_0.field545
            && client.field591 < class60_0.field555) {
          class60_0.field560 = false;
          class60_0.field562 = class27
              .method460(class60_0.field931, class60_0.field881, class13.field82);
          class60_0.field889 = client.field591;
          class28.field248.method3010(class13.field82, class60_0.field931, class60_0.field881,
                                      class60_0.field562, 60, class60_0, class60_0.field905, long_4,
                                      class60_0.field559, class60_0.field547, class60_0.field565,
                                      class60_0.field553);
        } else {
          if ((class60_0.field931 & 0x7f) == 64 && (class60_0.field881 & 0x7f) == 64) {
            if (client.field761[i_2][i_3] == client.field687) {
              return;
            }

            client.field761[i_2][i_3] = client.field687;
          }

          class60_0.field562 = class27
              .method460(class60_0.field931, class60_0.field881, class13.field82);
          class60_0.field889 = client.field591;
          class28.field248.method2883(class13.field82, class60_0.field931, class60_0.field881,
                                      class60_0.field562, 60, class60_0, class60_0.field905, long_4,
                                      class60_0.field873);
        }
      }
    }

  }

}
