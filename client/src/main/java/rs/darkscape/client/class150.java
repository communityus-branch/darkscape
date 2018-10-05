package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.util.Time;

@ObfuscatedName("ed")
public class class150 extends class160 {

  @ObfuscatedName("pp")
  @ObfuscatedGetter(
      intValue = 692825213
  )
  static int field1928;
  @ObfuscatedName("fg")
  @ObfuscatedSignature(
      signature = "[Lll;"
  )
  static class318[] field1919;
  @ObfuscatedName("fv")
  @ObfuscatedSignature(
      signature = "[Lll;"
  )
  static class318[] field1926;
  @ObfuscatedName("z")
  long[] field1922 = new long[10];
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 1263861109
  )
  int field1920 = 256;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 1448416021
  )
  int field1921 = 1;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 699699497
  )
  int field1923 = 0;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      longValue = -5065002419865856429L
  )
  long field1925 = Time.currentTimeMillis();
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 918453221
  )
  int field1924;

  class150() {
    for (int i_1 = 0; i_1 < 10; i_1++) {
      this.field1922[i_1] = this.field1925;
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2021286604"
  )
  public void vmethod3330() {
    for (int i_1 = 0; i_1 < 10; i_1++) {
      this.field1922[i_1] = 0L;
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "2142370282"
  )
  public int vmethod3331(int i_1, int i_2) {
    int i_3 = this.field1920;
    int i_4 = this.field1921;
    this.field1920 = 300;
    this.field1921 = 1;
    this.field1925 = Time.currentTimeMillis();
    if (this.field1922[this.field1924] == 0L) {
      this.field1920 = i_3;
      this.field1921 = i_4;
    } else if (this.field1925 > this.field1922[this.field1924]) {
      this.field1920 = (int) ((long) (i_1 * 2560) / (this.field1925
          - this.field1922[this.field1924]));
    }

    if (this.field1920 < 25) {
      this.field1920 = 25;
    }

    if (this.field1920 > 256) {
      this.field1920 = 256;
      this.field1921 = (int) ((long) i_1 - (this.field1925 - this.field1922[this.field1924]) / 10L);
    }

    if (this.field1921 > i_1) {
      this.field1921 = i_1;
    }

    this.field1922[this.field1924] = this.field1925;
    this.field1924 = (this.field1924 + 1) % 10;
    int i_5;
    if (this.field1921 > 1) {
      for (i_5 = 0; i_5 < 10; i_5++) {
        if (this.field1922[i_5] != 0L) {
          this.field1922[i_5] += (long) this.field1921;
        }
      }
    }

    if (this.field1921 < i_2) {
      this.field1921 = i_2;
    }

    class63.method1539((long) this.field1921);

    for (i_5 = 0; this.field1923 < 256; this.field1923 += this.field1920) {
      ++i_5;
    }

    this.field1923 &= 0xff;
    return i_5;
  }

}
