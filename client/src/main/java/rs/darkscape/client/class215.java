package rs.darkscape.client;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class215 implements Iterable {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgw;"
  )
  public SubNode field2445 = new SubNode();
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgw;"
  )
  SubNode field2444;

  public class215() {
    this.field2445.nextSubNode = this.field2445;
    this.field2445.prevSubNode = this.field2445;
  }

  @ObfuscatedName("z")
  public void method4168() {
    while (this.field2445.nextSubNode != this.field2445) {
      this.field2445.nextSubNode.unlinkSubNode();
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgw;)V"
  )
  public void method4155(SubNode class206_1) {
    if (class206_1.prevSubNode != null) {
      class206_1.unlinkSubNode();
    }

    class206_1.prevSubNode = this.field2445.prevSubNode;
    class206_1.nextSubNode = this.field2445;
    class206_1.prevSubNode.nextSubNode = class206_1;
    class206_1.nextSubNode.prevSubNode = class206_1;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "()Lgw;"
  )
  SubNode method4156() {
    SubNode class206_1 = this.field2445.nextSubNode;
    if (class206_1 == this.field2445) {
      return null;
    } else {
      class206_1.unlinkSubNode();
      return class206_1;
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "()Lgw;"
  )
  SubNode method4177() {
    return this.method4160((SubNode) null);
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lgw;)Lgw;"
  )
  SubNode method4160(SubNode class206_1) {
    SubNode class206_2;
    if (class206_1 == null) {
      class206_2 = this.field2445.nextSubNode;
    } else {
      class206_2 = class206_1;
    }

    if (class206_2 == this.field2445) {
      this.field2444 = null;
      return null;
    } else {
      this.field2444 = class206_2.nextSubNode;
      return class206_2;
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "()Lgw;"
  )
  SubNode method4159() {
    SubNode class206_1 = this.field2444;
    if (class206_1 == this.field2445) {
      this.field2444 = null;
      return null;
    } else {
      this.field2444 = class206_1.nextSubNode;
      return class206_1;
    }
  }

  public Iterator iterator() {
    return new class214(this);
  }

}
