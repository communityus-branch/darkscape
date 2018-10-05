package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public final class class201 {

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lhj;"
  )
  class215 field2413 = new class215();
  @ObfuscatedName("z")
  int field2410;
  @ObfuscatedName("w")
  int field2411;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lgu;"
  )
  class197 field2412;

  public class201(int i_1, int i_2) {
    this.field2410 = i_1;
    this.field2411 = i_1;

    int i_3;
    for (i_3 = 1; i_3 + i_3 < i_1 && i_3 < i_2; i_3 += i_3) {
    }

    this.field2412 = new class197(i_3);
  }

  @ObfuscatedName("z")
  public Object method3997(long long_1) {
    class212 class212_3 = (class212) this.field2412.method3945(long_1);
    if (class212_3 == null) {
      return null;
    } else {
      Object object_4 = class212_3.vmethod4137();
      if (object_4 == null) {
        class212_3.unlinkNode();
        class212_3.unlinkSubNode();
        this.field2411 += class212_3.field2439;
        return null;
      } else {
        if (class212_3.vmethod4136()) {
          class196 class196_5 = new class196(object_4, class212_3.field2439);
          this.field2412.method3944(class196_5, class212_3.hashKey);
          this.field2413.method4155(class196_5);
          class196_5.subNodeHashKey = 0L;
          class212_3.unlinkNode();
          class212_3.unlinkSubNode();
        } else {
          this.field2413.method4155(class212_3);
          class212_3.subNodeHashKey = 0L;
        }

        return object_4;
      }
    }
  }

  @ObfuscatedName("w")
  void method3993(long long_1) {
    class212 class212_3 = (class212) this.field2412.method3945(long_1);
    this.method3996(class212_3);
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lhh;)V"
  )
  void method3996(class212 class212_1) {
    if (class212_1 != null) {
      class212_1.unlinkNode();
      class212_1.unlinkSubNode();
      this.field2411 += class212_1.field2439;
    }

  }

  @ObfuscatedName("l")
  public void method4007(Object object_1, long long_2) {
    this.method3998(object_1, long_2, 1);
  }

  @ObfuscatedName("u")
  public void method3998(Object object_1, long long_2, int i_4) {
    if (i_4 > this.field2410) {
      throw new IllegalStateException();
    } else {
      this.method3993(long_2);
      this.field2411 -= i_4;

      while (this.field2411 < 0) {
        class212 class212_5 = (class212) this.field2413.method4156();
        this.method3996(class212_5);
      }

      class196 class196_6 = new class196(object_1, i_4);
      this.field2412.method3944(class196_6, long_2);
      this.field2413.method4155(class196_6);
      class196_6.subNodeHashKey = 0L;
    }
  }

  @ObfuscatedName("q")
  public void method3999(int i_1) {
    for (class212 class212_2 = (class212) this.field2413.method4177(); class212_2 != null;
        class212_2 = (class212) this.field2413.method4159()) {
      if (class212_2.vmethod4136()) {
        if (class212_2.vmethod4137() == null) {
          class212_2.unlinkNode();
          class212_2.unlinkSubNode();
          this.field2411 += class212_2.field2439;
        }
      } else if (++class212_2.subNodeHashKey > (long) i_1) {
        class207 class207_3 = new class207(class212_2.vmethod4137(), class212_2.field2439);
        this.field2412.method3944(class207_3, class212_2.hashKey);
        class194.method3909(class207_3, class212_2);
        class212_2.unlinkNode();
        class212_2.unlinkSubNode();
      }
    }

  }

  @ObfuscatedName("i")
  public void method4006() {
    this.field2413.method4168();
    this.field2412.method3951();
    this.field2411 = this.field2410;
  }

}
