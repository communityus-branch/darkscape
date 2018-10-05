package rs.darkscape.client;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.util.Time;

@ObfuscatedName("ap")
public class class37 implements class31 {

  @ObfuscatedName("g")
  static int[][][] field325;
  @ObfuscatedName("cj")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field326;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -197733351
  )
  int field318;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 1775114501
  )
  int field324;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 1227159199
  )
  int field319;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 608429445
  )
  int field321;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -61550559
  )
  int field317;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 412323183
  )
  int field322;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 121293021
  )
  int field315;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 829826955
  )
  int field316;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 1482436255
  )
  int field320;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -1430909947
  )
  int field323;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lgi;I)V",
      garbageValue = "-1062831458"
  )
  static final void method660(PacketBuffer class189_0) {
    class189_0.method3823();
    int i_1 = client.field628;
    class60 class60_2 = class138.field1876 = client.field610[i_1] = new class60();
    class60_2.field574 = i_1;
    int i_3 = class189_0.method3817(30);
    byte b_4 = (byte) (i_3 >> 28);
    int i_5 = i_3 >> 14 & 0x3fff;
    int i_6 = i_3 & 0x3fff;
    class60_2.field922[0] = i_5 - class62.field868;
    class60_2.field931 = (class60_2.field922[0] << 7) + (class60_2.method1088() << 6);
    class60_2.field872[0] = i_6 - client.field754;
    class60_2.field881 = (class60_2.field872[0] << 7) + (class60_2.method1088() << 6);
    class13.field82 = class60_2.field567 = b_4;
    if (class81.field1157[i_1] != null) {
      class60_2.method1082(class81.field1157[i_1]);
    }

    class81.field1167 = 0;
    class81.field1159[++class81.field1167 - 1] = i_1;
    class81.field1156[i_1] = 0;
    class81.field1160 = 0;

    for (int i_7 = 1; i_7 < 2048; i_7++) {
      if (i_7 != i_1) {
        int i_8 = class189_0.method3817(18);
        int i_9 = i_8 >> 16;
        int i_10 = i_8 >> 8 & 0x255;
        int i_11 = i_8 & 0x255;
        class81.field1162[i_7] = (i_10 << 14) + i_11 + (i_9 << 28);
        class81.field1163[i_7] = 0;
        class81.field1164[i_7] = -1;
        class81.field1161[++class81.field1160 - 1] = i_7;
        class81.field1156[i_7] = 0;
      }
    }

    class189_0.method3816();
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "681063668"
  )
  public static int method652() {
    return ++Mouse.field417 - 1;
  }

  @ObfuscatedName("l")
  public static int method662(long long_0) {
    return (int) (long_0 >>> 0 & 0x7fL);
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-81"
  )
  static void method640() {
    Iterator iterator_0 = class83.field1181.iterator();

    while (iterator_0.hasNext()) {
      class58 class58_1 = (class58) iterator_0.next();
      class58_1.method1048();
    }

  }

  @ObfuscatedName("ae")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1520436203"
  )
  protected static int method661() {
    int i_0 = 0;
    if (class121.field1660 == null || !class121.field1660.isValid()) {
      try {
        Iterator iterator_1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

        while (iterator_1.hasNext()) {
          GarbageCollectorMXBean garbagecollectormxbean_2 = (GarbageCollectorMXBean) iterator_1
              .next();
          if (garbagecollectormxbean_2.isValid()) {
            class121.field1660 = garbagecollectormxbean_2;
            class47.field416 = -1L;
            class47.field415 = -1L;
          }
        }
      } catch (Throwable ignored) {
      }
    }

    if (class121.field1660 != null) {
      long long_9 = Time.currentTimeMillis();
      long long_3 = class121.field1660.getCollectionTime();
      if (class47.field415 != -1L) {
        long long_5 = long_3 - class47.field415;
        long long_7 = long_9 - class47.field416;
        if (long_7 != 0L) {
          i_0 = (int) (100L * long_5 / long_7);
        }
      }

      class47.field415 = long_3;
      class47.field416 = long_9;
    }

    return i_0;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(La;B)V",
      garbageValue = "-105"
  )
  public void vmethod635(class20 class20_1) {
    if (class20_1.field166 > this.field315) {
      class20_1.field166 = this.field315;
    }

    if (class20_1.field167 < this.field315) {
      class20_1.field167 = this.field315;
    }

    if (class20_1.field168 > this.field320) {
      class20_1.field168 = this.field320;
    }

    if (class20_1.field162 < this.field320) {
      class20_1.field162 = this.field320;
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "2090621319"
  )
  public boolean vmethod636(int i_1, int i_2, int i_3) {
    return i_1 >= this.field318 && i_1 < this.field318 + this.field324 ?
        i_2 >= (this.field319 << 6) + (this.field321 << 3) && i_2 <= (this.field319 << 6) + (
            this.field321 << 3) + 7 && i_3 >= (this.field317 << 6) + (this.field322 << 3)
            && i_3 <= (this.field317 << 6) + (this.field322 << 3) + 7 : false;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-658565537"
  )
  public boolean vmethod637(int i_1, int i_2) {
    return i_1 >= (this.field315 << 6) + (this.field316 << 3) && i_1 <= (this.field315 << 6) + (
        this.field316 << 3) + 7 && i_2 >= (this.field320 << 6) + (this.field323 << 3)
        && i_2 <= (this.field320 << 6) + (this.field323 << 3) + 7;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "56"
  )
  public int[] vmethod638(int i_1, int i_2, int i_3) {
    if (!this.vmethod636(i_1, i_2, i_3)) {
      return null;
    } else {
      int[] ints_4 = new int[]{
          this.field315 * 64 - this.field319 * 64 + i_2 + (this.field316 * 8 - this.field321 * 8),
          i_3 + (this.field320 * 64 - this.field317 * 64) + (this.field323 * 8
              - this.field322 * 8)};
      return ints_4;
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(III)Lha;",
      garbageValue = "2128900046"
  )
  public class226 vmethod659(int i_1, int i_2) {
    if (!this.vmethod637(i_1, i_2)) {
      return null;
    } else {
      int i_3 =
          this.field319 * 64 - this.field315 * 64 + (this.field321 * 8 - this.field316 * 8) + i_1;
      int i_4 =
          this.field317 * 64 - this.field320 * 64 + i_2 + (this.field322 * 8 - this.field323 * 8);
      return new class226(this.field318, i_3, i_4);
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-40"
  )
  public void vmethod639(Buffer class182_1) {
    this.field318 = class182_1.getUInt8();
    this.field324 = class182_1.getUInt8();
    this.field319 = class182_1.getUInt16();
    this.field321 = class182_1.getUInt8();
    this.field317 = class182_1.getUInt16();
    this.field322 = class182_1.getUInt8();
    this.field315 = class182_1.getUInt16();
    this.field316 = class182_1.getUInt8();
    this.field320 = class182_1.getUInt16();
    this.field323 = class182_1.getUInt8();
    this.method641();
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-49"
  )
  void method641() {
  }

}
