package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.util.Time;

@ObfuscatedName("bc")
public class class67 {

  @ObfuscatedName("ag")
  @ObfuscatedGetter(
      intValue = 973416531
  )
  static int field978;
  @ObfuscatedName("fu")
  static int[][] field973;
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lkf;"
  )
  public final class290 field970;
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lje;"
  )
  public final class284 field975;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Llm;"
  )
  final class322 field974;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -1943530059
  )
  int field976 = 0;

  @ObfuscatedSignature(
      signature = "(Llm;)V"
  )
  class67(class322 class322_1) {
    this.field974 = class322_1;
    this.field970 = new class290(class322_1);
    this.field975 = new class284(class322_1);
  }

  @ObfuscatedName("z")
  public static boolean method1683(long long_0) {
    boolean bool_2 = long_0 != 0L;
    if (bool_2) {
      boolean bool_3 = (int) (long_0 >>> 16 & 0x1L) == 1;
      bool_2 = !bool_3;
    }

    return bool_2;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgu;IIS)I",
      garbageValue = "-17706"
  )
  static int method1668(class197 class197_0, int i_1, int i_2) {
    if (class197_0 == null) {
      return i_2;
    } else {
      class211 class211_3 = (class211) class197_0.method3945((long) i_1);
      return class211_3 == null ? i_2 : class211_3.field2438;
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1734020068"
  )
  public static void method1685(int i_0, int i_1) {
    class263 class263_3 = (class263) class263.field3321.method3989((long) i_0);
    class263 class263_2;
    if (class263_3 != null) {
      class263_2 = class263_3;
    } else {
      byte[] bytes_8 = class263.field3322.method4625(14, i_0);
      class263_3 = new class263();
      if (bytes_8 != null) {
        class263_3.method4941(new Buffer(bytes_8));
      }

      class263.field3321.method3983(class263_3, (long) i_0);
      class263_2 = class263_3;
    }

    int i_4 = class263_2.field3320;
    int i_5 = class263_2.field3323;
    int i_6 = class263_2.field3326;
    int i_7 = class225.field2557[i_6 - i_5];
    if (i_1 < 0 || i_1 > i_7) {
      i_1 = 0;
    }

    i_7 <<= i_5;
    class225.field2558[i_4] = class225.field2558[i_4] & ~i_7 | i_1 << i_5 & i_7;
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(Lly;B)V",
      garbageValue = "-7"
  )
  static final void method1682(class317 class317_0) {
    short s_1 = 256;

    int i_2;
    for (i_2 = 0; i_2 < class186.field2367.length; i_2++) {
      class186.field2367[i_2] = 0;
    }

    int i_3;
    for (i_2 = 0; i_2 < 5000; i_2++) {
      i_3 = (int) (Math.random() * 128.0D * (double) s_1);
      class186.field2367[i_3] = (int) (Math.random() * 256.0D);
    }

    int i_4;
    int i_5;
    for (i_2 = 0; i_2 < 20; i_2++) {
      for (i_3 = 1; i_3 < s_1 - 1; i_3++) {
        for (i_4 = 1; i_4 < 127; i_4++) {
          i_5 = i_4 + (i_3 << 7);
          class81.field1169[i_5] =
              (class186.field2367[i_5 - 128] + class186.field2367[i_5 + 1] + class186.field2367[i_5
                  + 128] + class186.field2367[i_5 - 1]) / 4;
        }
      }

      int[] ints_8 = class186.field2367;
      class186.field2367 = class81.field1169;
      class81.field1169 = ints_8;
    }

    if (class317_0 != null) {
      i_2 = 0;

      for (i_3 = 0; i_3 < class317_0.field3781; i_3++) {
        for (i_4 = 0; i_4 < class317_0.field3780; i_4++) {
          if (class317_0.colorMap[i_2++] != 0) {
            i_5 = i_4 + class317_0.field3782 + 16;
            int i_6 = i_3 + class317_0.field3778 + 16;
            int i_7 = i_5 + (i_6 << 7);
            class186.field2367[i_7] = 0;
          }
        }
      }
    }

  }

  @ObfuscatedName("gc")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1786186478"
  )
  static void method1655() {
    int i_0 = class81.field1167;
    int[] ints_1 = class81.field1159;

    for (int i_2 = 0; i_2 < i_0; i_2++) {
      if (ints_1[i_2] != client.field707 && ints_1[i_2] != client.field628) {
        class11.method98(client.field610[ints_1[i_2]], true);
      }
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2083457181"
  )
  boolean method1624() {
    return this.field976 == 2;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1458971090"
  )
  final void method1625() {
    this.field976 = 1;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-2029618051"
  )
  final void method1679(Buffer class182_1, int i_2) {
    this.field970.method5424(class182_1, i_2);
    this.field976 = 2;
    class53.method1012();
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "916911588"
  )
  final void method1627() {
    for (class294 class294_1 = (class294) this.field970.field3639.method4111(); class294_1 != null;
        class294_1 = (class294) this.field970.field3639.method4114()) {
      if ((long) class294_1.field3665 < Time.currentTimeMillis() / 1000L - 5L) {
        if (class294_1.field3664 > 0) {
          class143.method3172(5, "", class294_1.field3662 + " has logged in.");
        }

        if (class294_1.field3664 == 0) {
          class143.method3172(5, "", class294_1.field3662 + " has logged out.");
        }

        class294_1.method4121();
      }
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-746063861"
  )
  final void method1628() {
    this.field976 = 0;
    this.field970.method5326();
    this.field975.method5326();
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Lkm;ZI)Z",
      garbageValue = "-1961233435"
  )
  final boolean method1660(class291 class291_1, boolean bool_2) {
    return class291_1 == null ? false : (class291_1.equals(class138.field1876.field552) ? true
        : this.field970.method5423(class291_1, bool_2));
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "-1614375319"
  )
  final boolean method1630(class291 class291_1) {
    return class291_1 == null ? false : this.field975.method5329(class291_1);
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "25"
  )
  final void method1631(String string_1) {
    if (string_1 != null) {
      class291 class291_2 = new class291(string_1, this.field974);
      if (class291_2.method5441()) {
        Object obj_10000;
        String str_4;
        if (this.method1632()) {
          obj_10000 = null;
          str_4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
          class143.method3172(30, "", str_4);
        } else if (class138.field1876.field552.equals(class291_2)) {
          obj_10000 = null;
          str_4 = "You can\'t add yourself to your own friend list";
          class143.method3172(30, "", str_4);
        } else if (this.method1660(class291_2, false)) {
          class233.method4588(string_1);
        } else if (this.method1630(class291_2)) {
          class51.method995(string_1);
        } else {
          OutboundPacket class172_3 = OutboundPacket
              .createOutboundPacket(OutboundPacketDescriptor.field2194, client.field626.field1218);
          class172_3.buffer.putInt8(class316.method5820(string_1));
          class172_3.buffer.method3699(string_1);
          client.field626.method1980(class172_3);
        }
      }
    }
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1546113149"
  )
  final boolean method1632() {
    return this.field970.method5328() || this.field970.method5327() >= 200 && client.field698 != 1;
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "1"
  )
  final void method1633(String string_1) {
    if (string_1 != null) {
      class291 class291_2 = new class291(string_1, this.field974);
      if (class291_2.method5441()) {
        if (this.method1634()) {
          class28.method475();
        } else {
          StringBuilder stringbuilder_10000;
          String string_4;
          if (class138.field1876.field552.equals(class291_2)) {
            stringbuilder_10000 = null;
            string_4 = "You can\'t add yourself to your own ignore list";
            class143.method3172(30, "", string_4);
          } else if (this.method1630(class291_2)) {
            class21.method271(string_1);
          } else if (this.method1660(class291_2, false)) {
            stringbuilder_10000 = new StringBuilder();
            Object obj_10001 = null;
            stringbuilder_10000 = stringbuilder_10000.append("Please remove ").append(string_1);
            obj_10001 = null;
            string_4 = stringbuilder_10000.append(" from your friend list first").toString();
            class143.method3172(30, "", string_4);
          } else {
            OutboundPacket class172_3 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2221, client.field626.field1218);
            class172_3.buffer.putInt8(class316.method5820(string_1));
            class172_3.buffer.method3699(string_1);
            client.field626.method1980(class172_3);
          }
        }
      }
    }
  }

  @ObfuscatedName("m")
  @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "128"
  )
  final boolean method1634() {
    return this.field975.method5328() || this.field975.method5327() >= 100 && client.field698 != 1;
  }

  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-434645488"
  )
  final void method1665(String string_1) {
    if (string_1 != null) {
      class291 class291_2 = new class291(string_1, this.field974);
      if (class291_2.method5441()) {
        if (this.field970.method5393(class291_2)) {
          client.field647 = client.field801;
          OutboundPacket class172_3 = OutboundPacket
              .createOutboundPacket(OutboundPacketDescriptor.field2203, client.field626.field1218);
          class172_3.buffer.putInt8(class316.method5820(string_1));
          class172_3.buffer.method3699(string_1);
          client.field626.method1980(class172_3);
        }

        class53.method1012();
      }
    }
  }

  @ObfuscatedName("t")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-636186966"
  )
  final void method1636(String string_1) {
    if (string_1 != null) {
      class291 class291_2 = new class291(string_1, this.field974);
      if (class291_2.method5441()) {
        if (this.field975.method5393(class291_2)) {
          client.field647 = client.field801;
          OutboundPacket class172_3 = OutboundPacket
              .createOutboundPacket(OutboundPacketDescriptor.field2157, client.field626.field1218);
          class172_3.buffer.putInt8(class316.method5820(string_1));
          class172_3.buffer.method3699(string_1);
          client.field626.method1980(class172_3);
        }

        class47.method910();
        if (class14.field94 != null) {
          class14.field94.method5468();
        }

      }
    }
  }

  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "1644898931"
  )
  final boolean method1637(class291 class291_1) {
    class292 class292_2 = (class292) this.field970.method5330(class291_1);
    return class292_2 != null && class292_2.method5415();
  }

}
