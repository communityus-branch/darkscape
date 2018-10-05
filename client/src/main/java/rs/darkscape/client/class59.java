package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class59 extends class166 {

  @ObfuscatedName("dy")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field543;

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "249825908"
  )
  static String method1076() {
    return class10.field61.field962 ? class265.method4976(class78.field1106) : class78.field1106;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "46558014"
  )
  static void method1079() {
    if (class78.field1101) {
      class78.field1083 = null;
      class78.field1084 = null;
      class78.field1111 = null;
      class78.field1092 = null;
      class78.field1087 = null;
      class78.field1117 = null;
      class124.field1708 = null;
      class235.field2783 = null;
      class78.field1089 = null;
      class166.field2047 = null;
      class13.field85 = null;
      class126.field1779 = null;
      class28.field237 = null;
      class232.field2752 = null;
      class64.field936 = null;
      class185.field2364 = null;
      class11.field69 = null;
      class77.field1077 = null;
      class186.field2367 = null;
      class81.field1169 = null;
      class40.field357 = null;
      class76.field1073 = null;
      class26.method427(2);
      class222.method4410(true);
      class78.field1101 = false;
    }
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "([BB)[B",
      garbageValue = "16"
  )
  static byte[] method1075(byte[] bytes_0) {
    int i_1 = bytes_0.length;
    byte[] bytes_2 = new byte[i_1];
    System.arraycopy(bytes_0, 0, bytes_2, 0, i_1);
    return bytes_2;
  }

  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-12265"
  )
  static void method1078() {
    if (class4.method36()) {
      class78.field1107 = true;
    }

  }

  @ObfuscatedName("fv")
  @ObfuscatedSignature(
      signature = "(Lba;II)V",
      garbageValue = "1397155000"
  )
  static final void method1080(class63 class63_0, int i_1) {
    if (class63_0.field917 > client.field591) {
      int i_2 = class63_0.field917 - client.field591;
      int i_3 = class63_0.field913 * 128 + class63_0.field874 * 64;
      int i_4 = class63_0.field915 * 128 + class63_0.field874 * 64;
      class63_0.field931 += (i_3 - class63_0.field931) / i_2;
      class63_0.field881 += (i_4 - class63_0.field881) / i_2;
      class63_0.field923 = 0;
      class63_0.field926 = class63_0.field919;
    } else if (class63_0.field918 >= client.field591) {
      class80.method1865(class63_0);
    } else {
      class35.method609(class63_0);
    }

    if (class63_0.field931 < 128 || class63_0.field881 < 128 || class63_0.field931 >= 13184
        || class63_0.field881 >= 13184) {
      class63_0.field903 = -1;
      class63_0.field891 = -1;
      class63_0.field917 = 0;
      class63_0.field918 = 0;
      class63_0.field931 = class63_0.field922[0] * 128 + class63_0.field874 * 64;
      class63_0.field881 = class63_0.field872[0] * 128 + class63_0.field874 * 64;
      class63_0.method1540();
    }

    if (class138.field1876 == class63_0 && (class63_0.field931 < 1536 || class63_0.field881 < 1536
        || class63_0.field931 >= 11776 || class63_0.field881 >= 11776)) {
      class63_0.field903 = -1;
      class63_0.field891 = -1;
      class63_0.field917 = 0;
      class63_0.field918 = 0;
      class63_0.field931 = class63_0.field922[0] * 128 + class63_0.field874 * 64;
      class63_0.field881 = class63_0.field872[0] * 128 + class63_0.field874 * 64;
      class63_0.method1540();
    }

    class3.method26(class63_0);
    class295.method5502(class63_0);
  }

  @ObfuscatedName("hg")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "52245424"
  )
  static void method1077() {
    client.field771 = 0;
    client.field716 = false;
    client.field735[0] = "Cancel";
    client.field740[0] = "";
    client.field720[0] = 1006;
    client.field590[0] = false;
    client.field771 = 1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IIILfk;B)Z",
      garbageValue = "27"
  )
  protected boolean vmethod3440(int i_1, int i_2, int i_3, class164 class164_4) {
    return i_2 == super.field2043 && i_3 == super.field2048;
  }

}
