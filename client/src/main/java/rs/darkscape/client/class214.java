package rs.darkscape.client;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class214 implements Iterator {

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lgw;"
  )
  SubNode field2443 = null;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lhj;"
  )
  class215 field2442;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgw;"
  )
  SubNode field2441;

  @ObfuscatedSignature(
      signature = "(Lhj;)V"
  )
  class214(class215 class215_1) {
    this.field2442 = class215_1;
    this.field2441 = this.field2442.field2445.nextSubNode;
    this.field2443 = null;
  }

  public boolean hasNext() {
    return this.field2442.field2445 != this.field2441;
  }

  public Object next() {
    SubNode class206_1 = this.field2441;
    if (class206_1 == this.field2442.field2445) {
      class206_1 = null;
      this.field2441 = null;
    } else {
      this.field2441 = class206_1.nextSubNode;
    }

    this.field2443 = class206_1;
    return class206_1;
  }

  public void remove() {
    if (this.field2443 == null) {
      throw new IllegalStateException();
    } else {
      this.field2443.unlinkSubNode();
      this.field2443 = null;
    }
  }

}
