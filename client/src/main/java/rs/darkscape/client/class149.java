package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class149 extends class160 {

  @ObfuscatedName("z")
  @ObfuscatedGetter(
      longValue = 8091709939901434705L
  )
  long field1918 = System.nanoTime();

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2021286604"
  )
  public void vmethod3330() {
    this.field1918 = System.nanoTime();
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "2142370282"
  )
  public int vmethod3331(int i_1, int i_2) {
    long long_3 = 1000000L * (long) i_2;
    long long_5 = this.field1918 - System.nanoTime();
    if (long_5 < long_3) {
      long_5 = long_3;
    }

    class63.method1539(long_5 / 1000000L);
    long long_7 = System.nanoTime();

    int i_9;
    for (i_9 = 0; i_9 < 10 && (i_9 < 1 || this.field1918 < long_7);
        this.field1918 += 1000000L * (long) i_1) {
      ++i_9;
    }

    if (this.field1918 < long_7) {
      this.field1918 = long_7;
    }

    return i_9;
  }

}
