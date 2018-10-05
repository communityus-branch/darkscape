package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class56 extends Node {

  @ObfuscatedName("w")
  boolean field505;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lhi;"
  )
  class230 field506;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -1049191845
  )
  int field511;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 1598662979
  )
  int field508;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 879102033
  )
  int field517;
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Lhi;"
  )
  class230 field507;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = -1181936113
  )
  int field509;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 1478440877
  )
  int field513;
  @ObfuscatedName("e")
  String field504;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = -1140422785
  )
  int field514;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = 285302449
  )
  int field515 = 76;
  @ObfuscatedName("z")
  Object[] field512;

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1438520718"
  )
  static void method1030(boolean bool_0) {
    class78.field1103 = "";
    class78.field1112 = "Enter your username/email & password.";
    class78.field1105 = "";
    class78.field1081 = 2;
    if (bool_0) {
      class78.field1086 = "";
    }

    if (class78.field1106 == null || class78.field1106.length() <= 0) {
      if (class10.field61.field959 != null) {
        class78.field1106 = class10.field61.field959;
        class78.field1108 = true;
      } else {
        class78.field1108 = false;
      }
    }

    class34.method586();
  }

  @ObfuscatedName("fg")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "54"
  )
  static final void method1031(String string_0) {
    if (string_0.equalsIgnoreCase("toggleroof")) {
      class10.field61.field960 = !class10.field61.field960;
      class54.method1018();
      if (class10.field61.field960) {
        class143.method3172(99, "", "Roofs are now all hidden");
      } else {
        class143.method3172(99, "", "Roofs will only be removed selectively");
      }
    }

    if (string_0.equalsIgnoreCase("displayfps")) {
      client.field597 = !client.field597;
    }

    if (string_0.equalsIgnoreCase("renderself")) {
      client.field699 = !client.field699;
    }

    if (string_0.equalsIgnoreCase("mouseovertext")) {
      client.field728 = !client.field728;
    }

    if (client.field747 >= 2) {
      if (string_0.equalsIgnoreCase("showcoord")) {
        class53.field476.field3839 = !class53.field476.field3839;
      }

      if (string_0.equalsIgnoreCase("fpson")) {
        client.field597 = true;
      }

      if (string_0.equalsIgnoreCase("fpsoff")) {
        client.field597 = false;
      }

      if (string_0.equalsIgnoreCase("gc")) {
        System.gc();
      }

      if (string_0.equalsIgnoreCase("clientdrop")) {
        class30.method516();
      }
    }

    OutboundPacket class172_1 = OutboundPacket
        .createOutboundPacket(OutboundPacketDescriptor.field2187, client.field626.field1218);
    class172_1.buffer.putInt8(string_0.length() + 1);
    class172_1.buffer.method3699(string_0);
    client.field626.method1980(class172_1);
  }

  @ObfuscatedName("io")
  @ObfuscatedSignature(
      signature = "(Lhi;Ljt;IIZI)V",
      garbageValue = "-2096518256"
  )
  static final void method1027(class230 class230_0, class269 class269_1, int i_2, int i_3,
                               boolean bool_4) {
    String[] arr_5 = class269_1.field3425;
    byte b_6 = -1;
    String str_7 = null;
    if (arr_5 != null && arr_5[i_3] != null) {
      if (i_3 == 0) {
        b_6 = 33;
      } else if (i_3 == 1) {
        b_6 = 34;
      } else if (i_3 == 2) {
        b_6 = 35;
      } else if (i_3 == 3) {
        b_6 = 36;
      } else {
        b_6 = 37;
      }

      str_7 = arr_5[i_3];
    } else if (i_3 == 4) {
      b_6 = 37;
      str_7 = "Drop";
    }

    if (b_6 != -1 && str_7 != null) {
      class243.method4612(str_7, class6.method71(16748608) + class269_1.field3433, b_6,
                          class269_1.field3431, i_2, class230_0.field2691, bool_4);
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([Ljava/lang/Object;B)V",
      garbageValue = "-106"
  )
  public void method1024(Object[] arr_1) {
    this.field512 = arr_1;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-529454320"
  )
  public void method1025(int i_1) {
    this.field515 = i_1;
  }

}
