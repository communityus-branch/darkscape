package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class148 implements class147 {

  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 1540985035
  )
  public static int field1913;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-75"
  )
  static void method3195(int i_0, int i_1) {
    int[] ints_2 = new int[4];
    int[] ints_3 = new int[4];
    ints_2[0] = i_0;
    ints_3[0] = i_1;
    int i_4 = 1;

    for (int i_5 = 0; i_5 < 4; i_5++) {
      if (class65.field946[i_5] != i_0) {
        ints_2[i_4] = class65.field946[i_5];
        ints_3[i_4] = class65.field939[i_5];
        ++i_4;
      }
    }

    class65.field946 = ints_2;
    class65.field939 = ints_3;
    class22.method282(class65.field949, 0, class65.field949.length - 1, class65.field946,
                      class65.field939);
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-557133146"
  )
  public static boolean method3196() {
    try {
      if (class217.field2460 == 2) {
        if (class177.field2285 == null) {
          class177.field2285 = class223
              .method4415(class138.field1871, class217.field2461, class217.field2462);
          if (class177.field2285 == null) {
            return false;
          }
        }

        if (class80.field1149 == null) {
          class80.field1149 = new class98(class217.field2458, class217.field2464);
        }

        if (class217.field2459
            .method4198(class177.field2285, class177.field2284, class80.field1149, 22050)) {
          class217.field2459.method4199();
          class217.field2459.method4236(class309.field3740);
          class217.field2459.method4267(class177.field2285, class217.field2463);
          class217.field2460 = 0;
          class177.field2285 = null;
          class80.field1149 = null;
          class138.field1871 = null;
          return true;
        }
      }
    } catch (Exception exception_1) {
      exception_1.printStackTrace();
      class217.field2459.method4202();
      class217.field2460 = 0;
      class177.field2285 = null;
      class80.field1149 = null;
      class138.field1871 = null;
    }

    return false;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-2017324363"
  )
  public static boolean method3197(int i_0) {
    return (i_0 >> 31 & 0x1) != 0;
  }

  @ObfuscatedName("gt")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
  )
  static void method3198() {
    if (class138.field1876.field931 >> 7 == client.field808
        && class138.field1876.field881 >> 7 == client.field809) {
      client.field808 = 0;
    }

  }

}
