package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class Deque {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  public Node root = new Node();
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node examined;

  public Deque() {
    this.root.nextNode = this.root;
    this.root.prevNode = this.root;
  }

  @ObfuscatedName("z")
  public void clear() {
    while (true) {
      Node node = this.root.nextNode;
      if (node == this.root) {
        this.examined = null;
        return;
      }
      node.unlinkNode();
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lga;)V"
  )
  public void addLast(Node node) {
    if (node.prevNode != null) {
      node.unlinkNode();
    }

    node.prevNode = this.root.prevNode;
    node.nextNode = this.root;
    node.prevNode.nextNode = node;
    node.nextNode.prevNode = node;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lga;)V"
  )
  public void addFirst(Node class204_1) {
    if (class204_1.prevNode != null) {
      class204_1.unlinkNode();
    }

    class204_1.prevNode = this.root;
    class204_1.nextNode = this.root.nextNode;
    class204_1.prevNode.nextNode = class204_1;
    class204_1.nextNode.prevNode = class204_1;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node pollFirst() {
    Node class204_1 = this.root.nextNode;
    if (class204_1 == this.root) {
      return null;
    } else {
      class204_1.unlinkNode();
      return class204_1;
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node pollLast() {
    Node class204_1 = this.root.prevNode;
    if (class204_1 == this.root) {
      return null;
    } else {
      class204_1.unlinkNode();
      return class204_1;
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node getFirst() {
    Node class204_1 = this.root.nextNode;
    if (class204_1 == this.root) {
      this.examined = null;
      return null;
    } else {
      this.examined = class204_1.nextNode;
      return class204_1;
    }
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node getLast() {
    Node class204_1 = this.root.prevNode;
    if (class204_1 == this.root) {
      this.examined = null;
      return null;
    } else {
      this.examined = class204_1.prevNode;
      return class204_1;
    }
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node getNext() {
    Node class204_1 = this.examined;
    if (class204_1 == this.root) {
      this.examined = null;
      return null;
    } else {
      this.examined = class204_1.nextNode;
      return class204_1;
    }
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node getPrevious() {
    Node class204_1 = this.examined;
    if (class204_1 == this.root) {
      this.examined = null;
      return null;
    } else {
      this.examined = class204_1.prevNode;
      return class204_1;
    }
  }

}
