package rs.darkscape.client;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public abstract class class285 {

  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -115006045
  )
  final int field3620;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 2097572835
  )
  int field3619 = 0;
  @ObfuscatedName("x")
  Comparator field3621 = null;
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "[Ljx;"
  )
  class282[] field3623;
  @ObfuscatedName("k")
  HashMap field3618;
  @ObfuscatedName("i")
  HashMap field3622;

  class285(int i_1) {
    this.field3620 = i_1;
    this.field3623 = this.vmethod5462(i_1);
    this.field3618 = new HashMap(i_1 / 8);
    this.field3622 = new HashMap(i_1 / 8);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
  )
  abstract class282 vmethod5461();

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
  )
  abstract class282[] vmethod5462(int var1);

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1666752471"
  )
  public void method5326() {
    this.field3619 = 0;
    Arrays.fill(this.field3623, (Object) null);
    this.field3618.clear();
    this.field3622.clear();
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "821008449"
  )
  public int method5327() {
    return this.field3619;
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-546371351"
  )
  public boolean method5328() {
    return this.field3620 == this.field3619;
  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "-1323034650"
  )
  public boolean method5329(class291 class291_1) {
    return !class291_1.method5441() ? false
        : (this.field3618.containsKey(class291_1) ? true : this.field3622.containsKey(class291_1));
  }

  @ObfuscatedName("m")
  @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "-1029474979"
  )
  public class282 method5330(class291 class291_1) {
    class282 class282_2 = this.method5331(class291_1);
    return class282_2 != null ? class282_2 : this.method5390(class291_1);
  }

  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "-520899073"
  )
  class282 method5331(class291 class291_1) {
    return !class291_1.method5441() ? null : (class282) this.field3618.get(class291_1);
  }

  @ObfuscatedName("t")
  @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "-2122724226"
  )
  class282 method5390(class291 class291_1) {
    return !class291_1.method5441() ? null : (class282) this.field3622.get(class291_1);
  }

  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "(Lkm;I)Z",
      garbageValue = "-630765365"
  )
  public final boolean method5393(class291 class291_1) {
    class282 class282_2 = this.method5331(class291_1);
    if (class282_2 == null) {
      return false;
    } else {
      this.method5334(class282_2);
      return true;
    }
  }

  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "-570676385"
  )
  final void method5334(class282 class282_1) {
    int i_2 = this.method5339(class282_1);
    if (i_2 != -1) {
      this.method5343(i_2);
      this.method5395(class282_1);
    }
  }

  @ObfuscatedName("a")
  @ObfuscatedSignature(
      signature = "(Lkm;I)Ljx;",
      garbageValue = "261191446"
  )
  class282 method5377(class291 class291_1) {
    return this.method5335(class291_1, (class291) null);
  }

  @ObfuscatedName("c")
  @ObfuscatedSignature(
      signature = "(Lkm;Lkm;I)Ljx;",
      garbageValue = "2051302762"
  )
  class282 method5335(class291 class291_1, class291 class291_2) {
    if (this.method5331(class291_1) != null) {
      throw new IllegalStateException();
    } else {
      class282 class282_3 = this.vmethod5461();
      class282_3.method5290(class291_1, class291_2);
      this.method5341(class282_3);
      this.method5342(class282_3);
      return class282_3;
    }
  }

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "(IB)Ljx;",
      garbageValue = "99"
  )
  public final class282 method5336(int i_1) {
    if (i_1 >= 0 && i_1 < this.field3619) {
      return this.field3623[i_1];
    } else {
      throw new ArrayIndexOutOfBoundsException(i_1);
    }
  }

  @ObfuscatedName("af")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1076089262"
  )
  public final void method5337() {
    if (this.field3621 == null) {
      Arrays.sort(this.field3623, 0, this.field3619);
    } else {
      Arrays.sort(this.field3623, 0, this.field3619, this.field3621);
    }

  }

  @ObfuscatedName("ah")
  @ObfuscatedSignature(
      signature = "(Ljx;Lkm;Lkm;B)V",
      garbageValue = "15"
  )
  final void method5338(class282 class282_1, class291 class291_2, class291 class291_3) {
    this.method5395(class282_1);
    class282_1.method5290(class291_2, class291_3);
    this.method5342(class282_1);
  }

  @ObfuscatedName("ab")
  @ObfuscatedSignature(
      signature = "(Ljx;B)I",
      garbageValue = "1"
  )
  final int method5339(class282 class282_1) {
    for (int i_2 = 0; i_2 < this.field3619; i_2++) {
      if (this.field3623[i_2] == class282_1) {
        return i_2;
      }
    }

    return -1;
  }

  @ObfuscatedName("aw")
  @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "-1961233435"
  )
  final void method5395(class282 class282_1) {
    if (this.field3618.remove(class282_1.field3610) == null) {
      throw new IllegalStateException();
    } else {
      if (class282_1.field3611 != null) {
        this.field3622.remove(class282_1.field3611);
      }

    }
  }

  @ObfuscatedName("ak")
  @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "234221683"
  )
  final void method5341(class282 class282_1) {
    this.field3623[++this.field3619 - 1] = class282_1;
  }

  @ObfuscatedName("as")
  @ObfuscatedSignature(
      signature = "(Ljx;I)V",
      garbageValue = "-914048201"
  )
  final void method5342(class282 class282_1) {
    this.field3618.put(class282_1.field3610, class282_1);
    if (class282_1.field3611 != null) {
      class282 class282_2 = (class282) this.field3622.put(class282_1.field3611, class282_1);
      if (class282_2 != null && class282_2 != class282_1) {
        class282_2.field3611 = null;
      }
    }

  }

  @ObfuscatedName("an")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1797268727"
  )
  final void method5343(int i_1) {
    --this.field3619;
    if (i_1 < this.field3619) {
      System.arraycopy(this.field3623, i_1 + 1, this.field3623, i_1, this.field3619 - i_1);
    }

  }

  @ObfuscatedName("ao")
  @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "20160"
  )
  public final void method5346() {
    this.field3621 = null;
  }

  @ObfuscatedName("at")
  @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;B)V",
      garbageValue = "-105"
  )
  public final void method5347(Comparator comparator_1) {
    if (this.field3621 == null) {
      this.field3621 = comparator_1;
    } else if (this.field3621 instanceof class283) {
      ((class283) this.field3621).method5307(comparator_1);
    }

  }

}
