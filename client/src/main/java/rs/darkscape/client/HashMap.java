package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public final class HashMap {

  @ObfuscatedName("u")
  int field2418 = 0;
  @ObfuscatedName("z")
  int len;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "[Lga;"
  )
  Node[] nodes;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node examine;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node field2417;

  public HashMap(int len) {
    this.len = len;
    this.nodes = new Node[len];

    for (int i = 0; i < len; i++) {
      Node node = this.nodes[i] = new Node();
      node.nextNode = node;
      node.prevNode = node;
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(J)Lga;"
  )
  public Node get(long key) {
    Node node = nodes[(int) (key & (long) (this.len - 1))];

    for (examine = node.nextNode;
        node != this.examine;
        examine = examine.nextNode) {
      if (examine.hashKey != key) {
        continue;
      }
      Node found = examine;
      examine = examine.nextNode;
      return found;
    }

    examine = null;
    return null;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lga;J)V"
  )
  public void put(Node node, long key) {
    if (node.prevNode != null) {
      node.unlinkNode();
    }

    Node bucket = this.nodes[(int) (key & (long) (this.len - 1))];
    node.prevNode = bucket.prevNode;
    node.nextNode = bucket;
    node.prevNode.nextNode = node;
    node.nextNode.prevNode = node;
    node.hashKey = key;
  }

  @ObfuscatedName("s")
  void clear() {
    for (int i_1 = 0; i_1 < this.len; i_1++) {
      Node class204_2 = this.nodes[i_1];

      while (true) {
        Node class204_3 = class204_2.nextNode;
        if (class204_3 == class204_2) {
          break;
        }

        class204_3.unlinkNode();
      }
    }

    this.examine = null;
    this.field2417 = null;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node method4018() {
    this.field2418 = 0;
    return this.method4019();
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node method4019() {
    Node class204_1;
    if (this.field2418 > 0 && this.nodes[this.field2418 - 1] != this.field2417) {
      class204_1 = this.field2417;
      this.field2417 = class204_1.nextNode;
      return class204_1;
    } else {
      do {
        if (this.field2418 >= this.len) {
          return null;
        }

        class204_1 = this.nodes[this.field2418++].nextNode;
      } while (class204_1 == this.nodes[this.field2418 - 1]);

      this.field2417 = class204_1.nextNode;
      return class204_1;
    }
  }

}
