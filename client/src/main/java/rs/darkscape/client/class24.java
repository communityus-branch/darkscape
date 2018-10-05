package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class24 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lc;"
  )
  static final class24 field208 = new class24(0);
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lc;"
  )
  static final class24 field204 = new class24(1);
  @ObfuscatedName("pk")
  @ObfuscatedGetter(
      intValue = -1187037229
  )
  static int field203;
  @ObfuscatedName("de")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field207;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -636830447
  )
  final int field205;

  class24(int i_1) {
    this.field205 = i_1;
  }

  @ObfuscatedName("gz")
  @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1818336157"
  )
  static final void method424(boolean bool_0) {
    for (int i_1 = 0; i_1 < client.field622; i_1++) {
      class72 class72_2 = client.field843[client.field639[i_1]];
      if (class72_2 != null && class72_2.vmethod1786() && class72_2.field1037.field3511 == bool_0
          && class72_2.field1037.method5165()) {
        int i_3 = class72_2.field931 >> 7;
        int i_4 = class72_2.field881 >> 7;
        if (i_3 >= 0 && i_3 < 104 && i_4 >= 0 && i_4 < 104) {
          if (class72_2.field874 == 1 && (class72_2.field931 & 0x7f) == 64
              && (class72_2.field881 & 0x7f) == 64) {
            if (client.field761[i_3][i_4] == client.field687) {
              continue;
            }

            client.field761[i_3][i_4] = client.field687;
          }

          long long_5 = class76
              .method1804(0, 0, 1, !class72_2.field1037.field3504, client.field639[i_1]);
          class72_2.field889 = client.field591;
          class28.field248.method2883(class13.field82, class72_2.field931, class72_2.field881,
                                      class27.method460(
                                          class72_2.field874 * 64 - 64 + class72_2.field931,
                                          class72_2.field874 * 64 - 64 + class72_2.field881,
                                          class13.field82), class72_2.field874 * 64 - 64 + 60,
                                      class72_2, class72_2.field905, long_5, class72_2.field873);
        }
      }
    }

  }

  @ObfuscatedName("jr")
  @ObfuscatedSignature(
      signature = "(Lhi;B)I",
      garbageValue = "-51"
  )
  static int method425(class230 class230_0) {
    class211 class211_1 = (class211) client.field783
        .get((long) class230_0.field2606 + ((long) class230_0.field2691 << 32));
    return class211_1 != null ? class211_1.field2438 : class230_0.field2678;
  }

}
