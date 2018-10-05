package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class310 {

  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 314571957
  )
  public int field3746;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -107586563
  )
  public int field3743;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -1771158899
  )
  public int field3747;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 2007958137
  )
  public int field3745;

  public class310(int i_1, int i_2, int i_3, int i_4) {
    this.method5679(i_1, i_2);
    this.method5680(i_3, i_4);
  }

  public class310(int i_1, int i_2) {
    this(0, 0, i_1, i_2);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "95"
  )
  public static void method5697() {
    class313.field3759 = new class203();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1588913620"
  )
  public void method5679(int i_1, int i_2) {
    this.field3746 = i_1;
    this.field3743 = i_2;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-997918539"
  )
  public void method5680(int i_1, int i_2) {
    this.field3747 = i_1;
    this.field3745 = i_2;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lkg;Lkg;I)V",
      garbageValue = "1253988141"
  )
  public void method5681(class310 class310_1, class310 class310_2) {
    this.method5682(class310_1, class310_2);
    this.method5683(class310_1, class310_2);
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lkg;Lkg;B)V",
      garbageValue = "-2"
  )
  void method5682(class310 class310_1, class310 class310_2) {
    class310_2.field3746 = this.field3746;
    class310_2.field3747 = this.field3747;
    if (this.field3746 < class310_1.field3746) {
      class310_2.field3747 -= class310_1.field3746 - this.field3746;
      class310_2.field3746 = class310_1.field3746;
    }

    if (class310_2.method5684() > class310_1.method5684()) {
      class310_2.field3747 -= class310_2.method5684() - class310_1.method5684();
    }

    if (class310_2.field3747 < 0) {
      class310_2.field3747 = 0;
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lkg;Lkg;I)V",
      garbageValue = "-1807714345"
  )
  void method5683(class310 class310_1, class310 class310_2) {
    class310_2.field3743 = this.field3743;
    class310_2.field3745 = this.field3745;
    if (this.field3743 < class310_1.field3743) {
      class310_2.field3745 -= class310_1.field3743 - this.field3743;
      class310_2.field3743 = class310_1.field3743;
    }

    if (class310_2.method5685() > class310_1.method5685()) {
      class310_2.field3745 -= class310_2.method5685() - class310_1.method5685();
    }

    if (class310_2.field3745 < 0) {
      class310_2.field3745 = 0;
    }

  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-33"
  )
  int method5684() {
    return this.field3746 + this.field3747;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1611748891"
  )
  int method5685() {
    return this.field3743 + this.field3745;
  }

  public String toString() {
    return null;
  }

}
