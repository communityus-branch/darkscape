package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.util.Time;

@ObfuscatedName("jb")
public class class280 {

  @ObfuscatedName("s")
  public boolean field3597 = false;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      longValue = -2788066611507117795L
  )
  long field3599 = -1L;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      longValue = -9141763007911040395L
  )
  long field3598 = -1L;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      longValue = 7389818107012479155L
  )
  long field3600 = 0L;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      longValue = 5136999404285714875L
  )
  long field3601 = 0L;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      longValue = -6017885431335410913L
  )
  long field3602 = 0L;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 1130447619
  )
  int field3604 = 0;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 866548259
  )
  int field3603 = 0;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = -646636543
  )
  int field3605 = 0;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 1822961763
  )
  int field3606 = 0;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "92"
  )
  public void method5244() {
    this.field3599 = Time.currentTimeMillis();
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-92"
  )
  public void method5262() {
    if (this.field3599 != -1L) {
      this.field3601 = Time.currentTimeMillis() - this.field3599;
      this.field3599 = -1L;
    }

  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2082197473"
  )
  public void method5246(int i_1) {
    this.field3598 = Time.currentTimeMillis();
    this.field3604 = i_1;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-222960010"
  )
  public void method5247() {
    if (this.field3598 != -1L) {
      this.field3600 = Time.currentTimeMillis() - this.field3598;
      this.field3598 = -1L;
    }

    ++this.field3605;
    this.field3597 = true;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-656792455"
  )
  public void method5248() {
    this.field3597 = false;
    this.field3603 = 0;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-450246624"
  )
  public void method5249() {
    this.method5247();
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "58"
  )
  public void method5245(Buffer class182_1) {
    long long_2 = this.field3601;
    long_2 /= 10L;
    if (long_2 < 0L) {
      long_2 = 0L;
    } else if (long_2 > 65535L) {
      long_2 = 65535L;
    }

    class182_1.method3755((int) long_2);
    long long_4 = this.field3600;
    long_4 /= 10L;
    if (long_4 < 0L) {
      long_4 = 0L;
    } else if (long_4 > 65535L) {
      long_4 = 65535L;
    }

    class182_1.method3755((int) long_4);
    long long_6 = this.field3602;
    long_6 /= 10L;
    if (long_6 < 0L) {
      long_6 = 0L;
    } else if (long_6 > 65535L) {
      long_6 = 65535L;
    }

    class182_1.method3755((int) long_6);
    class182_1.method3755(this.field3604);
    class182_1.method3755(this.field3603);
    class182_1.method3755(this.field3605);
    class182_1.method3755(this.field3606);
  }

}
