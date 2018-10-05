package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class253 extends SubNode {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  static AbstractPack field3226;
  @ObfuscatedName("ch")
  static boolean field3229;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgj;"
  )
  static class200 field3228 = new class200(64);
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 690841177
  )
  public int field3227 = 0;

  @ObfuscatedName("hc")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "843953881"
  )
  static final void method4808(int i_0, int i_1) {
    Deque class205_2 = client.field708[class13.field82][i_0][i_1];
    if (class205_2 == null) {
      class28.field248.method2877(class13.field82, i_0, i_1);
    } else {
      long long_3 = -99999999L;
      class80 class80_5 = null;

      class80 class80_6;
      for (class80_6 = (class80) class205_2.getFirst(); class80_6 != null;
          class80_6 = (class80) class205_2.getNext()) {
        class269 class269_7 = class111.method2563(class80_6.field1151);
        long long_8 = (long) class269_7.field3445;
        if (class269_7.field3444 == 1) {
          long_8 *= (long) (class80_6.field1148 + 1);
        }

        if (long_8 > long_3) {
          long_3 = long_8;
          class80_5 = class80_6;
        }
      }

      if (class80_5 == null) {
        class28.field248.method2877(class13.field82, i_0, i_1);
      } else {
        class205_2.addFirst(class80_5);
        class80 class80_12 = null;
        class80 class80_11 = null;

        for (class80_6 = (class80) class205_2.getFirst(); class80_6 != null;
            class80_6 = (class80) class205_2.getNext()) {
          if (class80_6.field1151 != class80_5.field1151) {
            if (class80_12 == null) {
              class80_12 = class80_6;
            }

            if (class80_12.field1151 != class80_6.field1151 && class80_11 == null) {
              class80_11 = class80_6;
            }
          }
        }

        long long_9 = class76.method1804(i_0, i_1, 3, false, 0);
        class28.field248.method2879(class13.field82, i_0, i_1, class27
                                        .method460(i_0 * 128 + 64, i_1 * 128 + 64, class13.field82), class80_5, long_9,
                                    class80_12, class80_11);
      }
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "884121490"
  )
  void method4799(Buffer class182_1) {
    while (true) {
      int i_2 = class182_1.getUInt8();
      if (i_2 == 0) {
        return;
      }

      this.method4805(class182_1, i_2);
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "646065158"
  )
  void method4805(Buffer class182_1, int i_2) {
    if (i_2 == 2) {
      this.field3227 = class182_1.getUInt16();
    }

  }

}
