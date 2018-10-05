package rs.darkscape.client;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public final class class80 extends class127 {

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "Lcn;"
  )
  public static class98 field1149;
  @ObfuscatedName("ck")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field1147;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 540016053
  )
  int field1151;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 119742129
  )
  int field1148;

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(S)Lbx;",
      garbageValue = "-27003"
  )
  static class66 method1859() {
    SeekableFile class110_0 = null;
    class66 class66_1 = new class66();

    try {
      class110_0 = class22.method283("", class112.field1455.field3144, false);
      byte[] bytes_2 = new byte[(int) class110_0.length()];

      int i_4;
      for (int i_3 = 0; i_3 < bytes_2.length; i_3 += i_4) {
        i_4 = class110_0.read(bytes_2, i_3, bytes_2.length - i_3);
        if (i_4 == -1) {
          throw new IOException();
        }
      }

      class66_1 = new class66(new Buffer(bytes_2));
    } catch (Exception ignored) {
    }

    try {
      if (class110_0 != null) {
        class110_0.close();
      }
    } catch (Exception ignored) {
    }

    return class66_1;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1165618806"
  )
  public static void method1866(int i_0) {
    Mouse.field417 = i_0;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "916064134"
  )
  public static int method1864(int i_0) {
    return Keyboard.method673(class120.field1647[i_0]);
  }

  @ObfuscatedName("fo")
  @ObfuscatedSignature(
      signature = "(Lba;B)V",
      garbageValue = "-41"
  )
  static final void method1865(class63 class63_0) {
    if (class63_0.field918 == client.field591 || class63_0.field903 == -1 || class63_0.field906 != 0
        || class63_0.field901 + 1 > class3
        .method25(class63_0.field903).field3541[class63_0.field904]) {
      int i_1 = class63_0.field918 - class63_0.field917;
      int i_2 = client.field591 - class63_0.field917;
      int i_3 = class63_0.field913 * 128 + class63_0.field874 * 64;
      int i_4 = class63_0.field915 * 128 + class63_0.field874 * 64;
      int i_5 = class63_0.field916 * 128 + class63_0.field874 * 64;
      int i_6 = class63_0.field929 * 128 + class63_0.field874 * 64;
      class63_0.field931 = (i_2 * i_5 + i_3 * (i_1 - i_2)) / i_1;
      class63_0.field881 = (i_2 * i_6 + i_4 * (i_1 - i_2)) / i_1;
    }

    class63_0.field923 = 0;
    class63_0.field926 = class63_0.field919;
    class63_0.field905 = class63_0.field926;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
  )
  protected final class119 vmethod3067() {
    return class111.method2563(this.field1151).method5093(this.field1148);
  }

}
