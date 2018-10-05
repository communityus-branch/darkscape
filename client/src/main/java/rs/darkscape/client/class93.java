package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class93 extends class108 {

  @ObfuscatedName("z")
  public int field1279;
  @ObfuscatedName("w")
  public byte[] field1278;
  @ObfuscatedName("s")
  public int field1277;
  @ObfuscatedName("u")
  public boolean field1281;
  @ObfuscatedName("l")
  int field1280;

  class93(int i_1, byte[] bytes_2, int i_3, int i_4) {
    this.field1279 = i_1;
    this.field1278 = bytes_2;
    this.field1277 = i_3;
    this.field1280 = i_4;
  }

  class93(int i_1, byte[] bytes_2, int i_3, int i_4, boolean bool_5) {
    this.field1279 = i_1;
    this.field1278 = bytes_2;
    this.field1277 = i_3;
    this.field1280 = i_4;
    this.field1281 = bool_5;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lcu;)Lct;"
  )
  public class93 method2115(class102 class102_1) {
    this.field1278 = class102_1.method2239(this.field1278);
    this.field1279 = class102_1.method2240(this.field1279);
    if (this.field1277 == this.field1280) {
      this.field1277 = this.field1280 = class102_1.method2241(this.field1277);
    } else {
      this.field1277 = class102_1.method2241(this.field1277);
      this.field1280 = class102_1.method2241(this.field1280);
      if (this.field1277 == this.field1280) {
        --this.field1277;
      }
    }

    return this;
  }

}
