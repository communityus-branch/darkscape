package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public final class class194 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgw;"
  )
  SubNode field2393 = new SubNode();

  public class194() {
    this.field2393.nextSubNode = this.field2393;
    this.field2393.prevSubNode = this.field2393;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgw;Lgw;)V"
  )
  static void method3909(SubNode class206_0, SubNode class206_1) {
    if (class206_0.prevSubNode != null) {
      class206_0.unlinkSubNode();
    }

    class206_0.prevSubNode = class206_1;
    class206_0.nextSubNode = class206_1.nextSubNode;
    class206_0.prevSubNode.nextSubNode = class206_0;
    class206_0.nextSubNode.prevSubNode = class206_0;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lgw;)V"
  )
  public void method3910(SubNode class206_1) {
    if (class206_1.prevSubNode != null) {
      class206_1.unlinkSubNode();
    }

    class206_1.prevSubNode = this.field2393.prevSubNode;
    class206_1.nextSubNode = this.field2393;
    class206_1.prevSubNode.nextSubNode = class206_1;
    class206_1.nextSubNode.prevSubNode = class206_1;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgw;)V"
  )
  public void method3908(SubNode class206_1) {
    if (class206_1.prevSubNode != null) {
      class206_1.unlinkSubNode();
    }

    class206_1.prevSubNode = this.field2393;
    class206_1.nextSubNode = this.field2393.nextSubNode;
    class206_1.prevSubNode.nextSubNode = class206_1;
    class206_1.nextSubNode.prevSubNode = class206_1;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "()Lgw;"
  )
  SubNode method3922() {
    SubNode class206_1 = this.field2393.nextSubNode;
    if (class206_1 == this.field2393) {
      return null;
    } else {
      class206_1.unlinkSubNode();
      return class206_1;
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "()Lgw;"
  )
  public SubNode method3932() {
    SubNode class206_1 = this.field2393.nextSubNode;
    return class206_1 == this.field2393 ? null : class206_1;
  }

  @ObfuscatedName("q")
  void method3912() {
    while (true) {
      SubNode class206_1 = this.field2393.nextSubNode;
      if (class206_1 == this.field2393) {
        return;
      }

      class206_1.unlinkSubNode();
    }
  }

}
