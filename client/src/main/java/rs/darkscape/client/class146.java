package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public enum class146 implements class188 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Let;"
  )
  field1908(3, 0),
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Let;"
  )
  field1910(1, 1),
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Let;"
  )
  field1907(2, 2),
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Let;"
  )
  field1905(0, 3);

  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1737035263
  )
  public final int field1909;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -999687567
  )
  final int field1906;

  class146(int i_3, int i_4) {
    this.field1909 = i_3;
    this.field1906 = i_4;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "5"
  )
  public static int method3193(int i_0) {
    --i_0;
    i_0 |= i_0 >>> 1;
    i_0 |= i_0 >>> 2;
    i_0 |= i_0 >>> 4;
    i_0 |= i_0 >>> 8;
    i_0 |= i_0 >>> 16;
    return i_0 + 1;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(III)Lhi;",
      garbageValue = "-1708513832"
  )
  public static class230 method3191(int i_0, int i_1) {
    class230 class230_2 = class26.method434(i_0);
    return i_1 == -1 ? class230_2
        : (class230_2 != null && class230_2.field2736 != null && i_1 < class230_2.field2736.length
            ? class230_2.field2736[i_1] : null);
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Lgk;IB)V",
      garbageValue = "0"
  )
  public static void method3190(Buffer class182_0, int i_1) {
    if (class155.field1968 != null) {
      try {
        class155.field1968.method2476(0L);
        class155.field1968.method2481(class182_0.bytes, i_1, 24);
      } catch (Exception ignored) {
      }
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
  )
  public int vmethod5815() {
    return this.field1906;
  }

}
