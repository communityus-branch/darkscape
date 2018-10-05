package rs.darkscape.client;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class199 implements Iterator {

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node field2402 = null;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgy;"
  )
  class203 field2404;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node field2403;

  @ObfuscatedSignature(
      signature = "(Lgy;)V"
  )
  class199(class203 class203_1) {
    this.field2404 = class203_1;
    this.field2403 = this.field2404.field2419.nextNode;
    this.field2402 = null;
  }

  public Object next() {
    Node class204_1 = this.field2403;
    if (class204_1 == this.field2404.field2419) {
      class204_1 = null;
      this.field2403 = null;
    } else {
      this.field2403 = class204_1.nextNode;
    }

    this.field2402 = class204_1;
    return class204_1;
  }

  public boolean hasNext() {
    return this.field2404.field2419 != this.field2403;
  }

  public void remove() {
    if (this.field2402 == null) {
      throw new IllegalStateException();
    } else {
      this.field2402.unlinkNode();
      this.field2402 = null;
    }
  }

}
