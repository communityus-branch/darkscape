package rs.darkscape.client;

import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class4 {

  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -505500629
  )
  public int field29;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 1231470581
  )
  public int field30;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 528031905
  )
  public int field33;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1404264417
  )
  public int field32;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -1551136007
  )
  public int field28;
  @ObfuscatedName("z")
  byte field31;

  public class4() {
  }

  @ObfuscatedSignature(
      signature = "(Lgk;Z)V",
      garbageValue = "0"
  )
  public class4(Buffer class182_1, boolean bool_2) {
    this.field31 = class182_1.getInt8();
    this.field29 = class182_1.getUInt16();
    this.field30 = class182_1.getInt32();
    this.field33 = class182_1.getInt32();
    this.field32 = class182_1.getInt32();
    this.field28 = class182_1.getInt32();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1218832541"
  )
  static boolean method36() {
    try {
      if (class49.field439 == null) {
        class49.field439 = class28.field249.method3109(new URL(class26.field219));
      } else if (class49.field439.method3117()) {
        byte[] bytes_0 = class49.field439.method3116();
        Buffer class182_1 = new Buffer(bytes_0);
        class182_1.getInt32();
        class65.field945 = class182_1.getUInt16();
        class65.field949 = new class65[class65.field945];

        class65 class65_3;
        for (int i_2 = 0; i_2 < class65.field945; class65_3.field943 = i_2++) {
          class65_3 = class65.field949[i_2] = new class65();
          class65_3.field947 = class182_1.getUInt16();
          class65_3.field948 = class182_1.getInt32();
          class65_3.field950 = class182_1.method3738();
          class65_3.field951 = class182_1.method3738();
          class65_3.field952 = class182_1.getUInt8();
          class65_3.field955 = class182_1.method3551();
        }

        class22.method282(class65.field949, 0, class65.field949.length - 1, class65.field946,
                          class65.field939);
        class49.field439 = null;
        return true;
      }
    } catch (Exception exception_4) {
      exception_4.printStackTrace();
      class49.field439 = null;
    }

    return false;
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-106852228"
  )
  static final void method56() {
    if (!class120.field1652) {
      int i_0 = class125.field1759;
      int i_1 = class125.field1737;
      int i_2 = class125.field1740;
      int i_3 = class125.field1771;
      byte b_4 = 50;
      short s_5 = 3500;
      int i_6 = (class120.field1648 - class122.field1687) * b_4 / class122.field1678;
      int i_7 = (class120.field1649 - class122.field1689) * b_4 / class122.field1678;
      int i_8 = (class120.field1648 - class122.field1687) * s_5 / class122.field1678;
      int i_9 = (class120.field1649 - class122.field1689) * s_5 / class122.field1678;
      int i_10 = class122.method2807(i_7, b_4, i_1, i_0);
      int i_11 = class122.method2790(i_7, b_4, i_1, i_0);
      i_7 = i_10;
      i_10 = class122.method2807(i_9, s_5, i_1, i_0);
      int i_12 = class122.method2790(i_9, s_5, i_1, i_0);
      i_9 = i_10;
      i_10 = class122.method2805(i_6, i_11, i_3, i_2);
      i_11 = class122.method2806(i_6, i_11, i_3, i_2);
      i_6 = i_10;
      i_10 = class122.method2805(i_8, i_12, i_3, i_2);
      i_12 = class122.method2806(i_8, i_12, i_3, i_2);
      class120.field1657 = (i_10 + i_6) / 2;
      class120.field1659 = (i_9 + i_7) / 2;
      class177.field2283 = (i_12 + i_11) / 2;
      class303.field3721 = (i_10 - i_6) / 2;
      class120.field1651 = (i_9 - i_7) / 2;
      class120.field1654 = (i_12 - i_11) / 2;
      class98.field1335 = Math.abs(class303.field3721);
      class120.field1655 = Math.abs(class120.field1651);
      class312.field3757 = Math.abs(class120.field1654);
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1516792528"
  )
  public int method38() {
    return this.field31 & 0x7;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "63"
  )
  public int method39() {
    return (this.field31 & 0x8) == 8 ? 1 : 0;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-658609218"
  )
  void method44(int i_1) {
    this.field31 &= ~0x7;
    this.field31 = (byte) (this.field31 | i_1 & 0x7);
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "74851290"
  )
  void method40(int i_1) {
    this.field31 &= ~0x8;
    if (i_1 == 1) {
      this.field31 = (byte) (this.field31 | 0x8);
    }

  }

}
