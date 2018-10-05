package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public abstract class class105 extends Node {

  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "Ldo;"
  )
  class105 field1382;
  @ObfuscatedName("t")
  int field1384;
  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "Ldg;"
  )
  class108 field1383;
  @ObfuscatedName("w")
  volatile boolean field1385 = true;

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "()Ldo;"
  )
  protected abstract class105 vmethod4382();

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "()Ldo;"
  )
  protected abstract class105 vmethod4389();

  @ObfuscatedName("x")
  protected abstract int vmethod4395();

  @ObfuscatedName("e")
  protected abstract void vmethod4385(int[] var1, int var2, int var3);

  @ObfuscatedName("b")
  protected abstract void vmethod4386(int var1);

  @ObfuscatedName("ax")
  int vmethod2435() {
    return 255;
  }

  @ObfuscatedName("fg")
  final void method2439(int[] ints_1, int i_2, int i_3) {
    if (this.field1385) {
      this.vmethod4385(ints_1, i_2, i_3);
    } else {
      this.vmethod4386(i_3);
    }

  }

}
