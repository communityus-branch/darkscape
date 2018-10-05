package rs.darkscape.client;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class210 implements Iterator {

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node field2434 = null;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgu;"
  )
  class197 field2437;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lga;"
  )
  Node field2435;
  @ObfuscatedName("s")
  int field2436;

  @ObfuscatedSignature(
      signature = "(Lgu;)V"
  )
  class210(class197 class197_1) {
    this.field2437 = class197_1;
    this.method4124();
  }

  @ObfuscatedName("p")
  void method4124() {
    this.field2435 = this.field2437.field2397[0].nextNode;
    this.field2436 = 1;
    this.field2434 = null;
  }

  public boolean hasNext() {
    if (this.field2437.field2397[this.field2436 - 1] != this.field2435) {
      return true;
    } else {
      while (this.field2436 < this.field2437.field2398) {
        if (this.field2437.field2397[this.field2436++].nextNode != this.field2437.field2397[
            this.field2436 - 1]) {
          this.field2435 = this.field2437.field2397[this.field2436 - 1].nextNode;
          return true;
        }

        this.field2435 = this.field2437.field2397[this.field2436 - 1];
      }

      return false;
    }
  }

  public void remove() {
    if (this.field2434 == null) {
      throw new IllegalStateException();
    } else {
      this.field2434.unlinkNode();
      this.field2434 = null;
    }
  }

  public Object next() {
    Node class204_1;
    if (this.field2437.field2397[this.field2436 - 1] != this.field2435) {
      class204_1 = this.field2435;
      this.field2435 = class204_1.nextNode;
      this.field2434 = class204_1;
      return class204_1;
    } else {
      do {
        if (this.field2436 >= this.field2437.field2398) {
          return null;
        }

        class204_1 = this.field2437.field2397[this.field2436++].nextNode;
      } while (class204_1 == this.field2437.field2397[this.field2436 - 1]);

      this.field2435 = class204_1.nextNode;
      this.field2434 = class204_1;
      return class204_1;
    }
  }

}
