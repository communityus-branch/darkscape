package rs.darkscape.client;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public final class class197 implements Iterable {

  @ObfuscatedName("u")
  int field2396 = 0;
  @ObfuscatedName("z")
  int field2398;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "[Lga;"
  )
  Node[] field2397;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node field2400;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node field2399;

  public class197(int i_1) {
    this.field2398 = i_1;
    this.field2397 = new Node[i_1];

    for (int i_2 = 0; i_2 < i_1; i_2++) {
      Node class204_3 = this.field2397[i_2] = new Node();
      class204_3.nextNode = class204_3;
      class204_3.prevNode = class204_3;
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(J)Lga;"
  )
  public Node method3945(long long_1) {
    Node class204_3 = this.field2397[(int) (long_1 & (long) (this.field2398 - 1))];

    for (this.field2400 = class204_3.nextNode; class204_3 != this.field2400;
        this.field2400 = this.field2400.nextNode) {
      if (this.field2400.hashKey == long_1) {
        Node class204_4 = this.field2400;
        this.field2400 = this.field2400.nextNode;
        return class204_4;
      }
    }

    this.field2400 = null;
    return null;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lga;J)V"
  )
  public void method3944(Node class204_1, long long_2) {
    if (class204_1.prevNode != null) {
      class204_1.unlinkNode();
    }

    Node class204_4 = this.field2397[(int) (long_2 & (long) (this.field2398 - 1))];
    class204_1.prevNode = class204_4.prevNode;
    class204_1.nextNode = class204_4;
    class204_1.prevNode.nextNode = class204_1;
    class204_1.nextNode.prevNode = class204_1;
    class204_1.hashKey = long_2;
  }

  @ObfuscatedName("s")
  public void method3951() {
    for (int i_1 = 0; i_1 < this.field2398; i_1++) {
      Node class204_2 = this.field2397[i_1];

      while (true) {
        Node class204_3 = class204_2.nextNode;
        if (class204_3 == class204_2) {
          break;
        }

        class204_3.unlinkNode();
      }
    }

    this.field2400 = null;
    this.field2399 = null;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node method3955() {
    this.field2396 = 0;
    return this.method3947();
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "()Lga;"
  )
  public Node method3947() {
    Node class204_1;
    if (this.field2396 > 0 && this.field2397[this.field2396 - 1] != this.field2399) {
      class204_1 = this.field2399;
      this.field2399 = class204_1.nextNode;
      return class204_1;
    } else {
      do {
        if (this.field2396 >= this.field2398) {
          return null;
        }

        class204_1 = this.field2397[this.field2396++].nextNode;
      } while (class204_1 == this.field2397[this.field2396 - 1]);

      this.field2399 = class204_1.nextNode;
      return class204_1;
    }
  }

  public Iterator iterator() {
    return new class210(this);
  }

}
