package rs.darkscape.client;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class203 implements Iterable {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node field2419 = new Node();
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node field2420;

  public class203() {
    this.field2419.nextNode = this.field2419;
    this.field2419.prevNode = this.field2419;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lga;Lga;)V"
  )
  public static void method4036(Node class204_0, Node class204_1) {
    if (class204_0.prevNode != null) {
      class204_0.unlinkNode();
    }

    class204_0.prevNode = class204_1;
    class204_0.nextNode = class204_1.nextNode;
    class204_0.prevNode.nextNode = class204_0;
    class204_0.nextNode.prevNode = class204_0;
  }

  @ObfuscatedName("z")
  public void method4030() {
    while (this.field2419.nextNode != this.field2419) {
      this.field2419.nextNode.unlinkNode();
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lga;)V"
  )
  public void method4031(Node class204_1) {
    if (class204_1.prevNode != null) {
      class204_1.unlinkNode();
    }

    class204_1.prevNode = this.field2419.prevNode;
    class204_1.nextNode = this.field2419;
    class204_1.prevNode.nextNode = class204_1;
    class204_1.nextNode.prevNode = class204_1;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lga;)V"
  )
  public void method4038(Node class204_1) {
    if (class204_1.prevNode != null) {
      class204_1.unlinkNode();
    }

    class204_1.prevNode = this.field2419;
    class204_1.nextNode = this.field2419.nextNode;
    class204_1.prevNode.nextNode = class204_1;
    class204_1.nextNode.prevNode = class204_1;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node method4048() {
    return this.method4034((Node) null);
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Lga;)Lga;"
  )
  Node method4034(Node class204_1) {
    Node class204_2;
    if (class204_1 == null) {
      class204_2 = this.field2419.nextNode;
    } else {
      class204_2 = class204_1;
    }

    if (class204_2 == this.field2419) {
      this.field2420 = null;
      return null;
    } else {
      this.field2420 = class204_2.nextNode;
      return class204_2;
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node method4033() {
    Node class204_1 = this.field2420;
    if (class204_1 == this.field2419) {
      this.field2420 = null;
      return null;
    } else {
      this.field2420 = class204_1.nextNode;
      return class204_1;
    }
  }

  @ObfuscatedName("x")
  public boolean method4043() {
    return this.field2419.nextNode == this.field2419;
  }

  public Iterator iterator() {
    return new class199(this);
  }

}
