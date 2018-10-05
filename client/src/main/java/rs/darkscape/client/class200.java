package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public final class class200 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgw;"
  )
  SubNode field2409 = new SubNode();
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lgo;"
  )
  class194 field2405 = new class194();
  @ObfuscatedName("w")
  int field2406;
  @ObfuscatedName("s")
  int field2407;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  HashMap field2408;

  public class200(int i_1) {
    this.field2406 = i_1;
    this.field2407 = i_1;

    int i_2;
    for (i_2 = 1; i_2 + i_2 < i_1; i_2 += i_2) {
    }

    this.field2408 = new HashMap(i_2);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(J)Lgw;"
  )
  public SubNode method3989(long long_1) {
    SubNode class206_3 = (SubNode) this.field2408.get(long_1);
    if (class206_3 != null) {
      this.field2405.method3910(class206_3);
    }

    return class206_3;
  }

  @ObfuscatedName("w")
  public void method3982(long long_1) {
    SubNode class206_3 = (SubNode) this.field2408.get(long_1);
    if (class206_3 != null) {
      class206_3.unlinkNode();
      class206_3.unlinkSubNode();
      ++this.field2407;
    }

  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgw;J)V"
  )
  public void method3983(SubNode class206_1, long long_2) {
    if (this.field2407 == 0) {
      SubNode class206_4 = this.field2405.method3922();
      class206_4.unlinkNode();
      class206_4.unlinkSubNode();
      if (class206_4 == this.field2409) {
        class206_4 = this.field2405.method3922();
        class206_4.unlinkNode();
        class206_4.unlinkSubNode();
      }
    } else {
      --this.field2407;
    }

    this.field2408.put(class206_1, long_2);
    this.field2405.method3910(class206_1);
  }

  @ObfuscatedName("l")
  public void method3984() {
    this.field2405.method3912();
    this.field2408.clear();
    this.field2409 = new SubNode();
    this.field2407 = this.field2406;
  }

}
