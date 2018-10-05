package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class Node {

  @ObfuscatedName("cs")
  public long hashKey;
  @ObfuscatedName("ct")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  public Node nextNode;
  @ObfuscatedName("cc")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node prevNode;

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lga;Lga;)V"
  )
  public static void link(Node first, Node second) {
    if (first.prevNode != null) {
      first.unlinkNode();
    }

    first.prevNode = second.prevNode;
    first.nextNode = second;
    first.prevNode.nextNode = first;
    first.nextNode.prevNode = first;
  }

  @ObfuscatedName("jm")
  public void unlinkNode() {
    if (this.prevNode != null) {
      this.prevNode.nextNode = this.nextNode;
      this.nextNode.prevNode = this.prevNode;
      this.nextNode = null;
      this.prevNode = null;
    }
  }

  @ObfuscatedName("jw")
  public boolean isLinked() {
    return this.prevNode != null;
  }

}
