package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
public class class88 extends class105 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  Deque field1229 = new Deque();
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  Deque field1230 = new Deque();
  @ObfuscatedName("l")
  int field1231 = 0;
  @ObfuscatedName("u")
  int field1232 = -1;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ldo;)V"
  )
  public final synchronized void method2032(class105 class105_1) {
    this.field1229.addFirst(class105_1);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Ldo;)V"
  )
  public final synchronized void method2009(class105 class105_1) {
    class105_1.unlinkNode();
  }

  @ObfuscatedName("s")
  void method2010() {
    if (this.field1231 > 0) {
      for (class100 class100_1 = (class100) this.field1230.getFirst(); class100_1 != null;
          class100_1 = (class100) this.field1230.getNext()) {
        class100_1.field1338 -= this.field1231;
      }

      this.field1232 -= this.field1231;
      this.field1231 = 0;
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lga;Lcz;)V"
  )
  void method2011(Node class204_1, class100 class100_2) {
    while (this.field1230.root != class204_1
        && ((class100) class204_1).field1338 <= class100_2.field1338) {
      class204_1 = class204_1.nextNode;
    }

    Node.link(class100_2, class204_1);
    this.field1232 = ((class100) this.field1230.root.nextNode).field1338;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lcz;)V"
  )
  void method2008(class100 class100_1) {
    class100_1.unlinkNode();
    class100_1.method2231();
    Node class204_2 = this.field1230.root.nextNode;
    if (class204_2 == this.field1230.root) {
      this.field1232 = -1;
    } else {
      this.field1232 = ((class100) class204_2).field1338;
    }

  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "()Ldo;"
  )
  protected class105 vmethod4382() {
    return (class105) this.field1229.getFirst();
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "()Ldo;"
  )
  protected class105 vmethod4389() {
    return (class105) this.field1229.getNext();
  }

  @ObfuscatedName("x")
  protected int vmethod4395() {
    return 0;
  }

  @ObfuscatedName("e")
  public final synchronized void vmethod4385(int[] ints_1, int i_2, int i_3) {
    do {
      if (this.field1232 < 0) {
        this.method2042(ints_1, i_2, i_3);
        return;
      }

      if (i_3 + this.field1231 < this.field1232) {
        this.field1231 += i_3;
        this.method2042(ints_1, i_2, i_3);
        return;
      }

      int i_4 = this.field1232 - this.field1231;
      this.method2042(ints_1, i_2, i_4);
      i_2 += i_4;
      i_3 -= i_4;
      this.field1231 += i_4;
      this.method2010();
      class100 class100_5 = (class100) this.field1230.getFirst();
      synchronized (class100_5) {
        int i_7 = class100_5.method2232();
        if (i_7 < 0) {
          class100_5.field1338 = 0;
          this.method2008(class100_5);
        } else {
          class100_5.field1338 = i_7;
          this.method2011(class100_5.nextNode, class100_5);
        }
      }
    } while (i_3 != 0);

  }

  @ObfuscatedName("p")
  void method2042(int[] ints_1, int i_2, int i_3) {
    for (class105 class105_4 = (class105) this.field1229.getFirst(); class105_4 != null;
        class105_4 = (class105) this.field1229.getNext()) {
      class105_4.method2439(ints_1, i_2, i_3);
    }

  }

  @ObfuscatedName("b")
  public final synchronized void vmethod4386(int i_1) {
    do {
      if (this.field1232 < 0) {
        this.method2025(i_1);
        return;
      }

      if (this.field1231 + i_1 < this.field1232) {
        this.field1231 += i_1;
        this.method2025(i_1);
        return;
      }

      int i_2 = this.field1232 - this.field1231;
      this.method2025(i_2);
      i_1 -= i_2;
      this.field1231 += i_2;
      this.method2010();
      class100 class100_3 = (class100) this.field1230.getFirst();
      synchronized (class100_3) {
        int i_5 = class100_3.method2232();
        if (i_5 < 0) {
          class100_3.field1338 = 0;
          this.method2008(class100_3);
        } else {
          class100_3.field1338 = i_5;
          this.method2011(class100_3.nextNode, class100_3);
        }
      }
    } while (i_1 != 0);

  }

  @ObfuscatedName("n")
  void method2025(int i_1) {
    for (class105 class105_2 = (class105) this.field1229.getFirst(); class105_2 != null;
        class105_2 = (class105) this.field1229.getNext()) {
      class105_2.vmethod4386(i_1);
    }

  }

}
