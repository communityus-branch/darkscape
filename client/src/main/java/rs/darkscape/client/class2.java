package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public class class2 {

  @ObfuscatedName("ga")
  @ObfuscatedGetter(
      intValue = -313553599
  )
  static int field23;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -939579551
  )
  public final int field19;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      longValue = 3949284830848608531L
  )
  public final long field20;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lu;"
  )
  public final class4 field17;
  @ObfuscatedName("l")
  String field18;
  @ObfuscatedName("u")
  String field21;

  @ObfuscatedSignature(
      signature = "(Lgk;BI)V"
  )
  class2(Buffer class182_1, byte b_2, int i_3) {
    this.field18 = class182_1.method3738();
    this.field21 = class182_1.method3738();
    this.field19 = class182_1.getUInt16();
    this.field20 = class182_1.getUInt64();
    int i_4 = class182_1.getInt32();
    int i_5 = class182_1.getInt32();
    this.field17 = new class4();
    this.field17.method44(2);
    this.field17.method40(b_2);
    this.field17.field30 = i_4;
    this.field17.field33 = i_5;
    this.field17.field32 = 0;
    this.field17.field28 = 0;
    this.field17.field29 = i_3;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)Ljk;",
      garbageValue = "-241404147"
  )
  public static class260 method23(int i_0) {
    class260 class260_1 = (class260) class260.field3291.method3989((long) i_0);
    if (class260_1 != null) {
      return class260_1;
    } else {
      byte[] bytes_2 = class260.field3292.method4625(3, i_0);
      class260_1 = new class260();
      if (bytes_2 != null) {
        class260_1.method4894(new Buffer(bytes_2));
      }

      class260.field3291.method3983(class260_1, (long) i_0);
      return class260_1;
    }
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "127"
  )
  static void method22(String string_0, String string_1, String string_2) {
    class78.field1103 = string_0;
    class78.field1112 = string_1;
    class78.field1105 = string_2;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1845946507"
  )
  public String method16() {
    return this.field18;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1459489481"
  )
  public String method18() {
    return this.field21;
  }

}
