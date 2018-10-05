package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public final class class134 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Ldf;"
  )
  public class127 field1844;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      longValue = -7950024877031331151L
  )
  public long field1848 = 0L;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 1650174027
  )
  int field1841;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 220137999
  )
  int field1837;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -461194739
  )
  int field1838;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 1049351685
  )
  int field1839;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 2137493405
  )
  int field1845;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 1953890163
  )
  int field1842;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = -1165658199
  )
  int field1843;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = -902758735
  )
  int field1840;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 949196043
  )
  int field1850;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = 1947694915
  )
  int field1846;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = 1135945905
  )
  int field1847;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = -2116359181
  )
  int field1849 = 0;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIB)Lce;",
      garbageValue = "-10"
  )
  static class84 method3104(int i_0, int i_1) {
    class84 class84_2 = (class84) class84.field1190.method3989((long) (i_0 << 16));
    if (class84_2 != null) {
      return class84_2;
    } else {
      String string_3 = String.valueOf(i_0);
      int i_4 = client.field854.method4642(string_3);
      if (i_4 == -1) {
        return null;
      } else {
        byte[] bytes_5 = client.field854.get(i_4);
        if (bytes_5 != null) {
          if (bytes_5.length <= 1) {
            return null;
          }

          class84_2 = class10.method97(bytes_5);
          if (class84_2 != null) {
            class84.field1190.method3983(class84_2, (long) (i_0 << 16));
            return class84_2;
          }
        }

        return null;
      }
    }
  }

  @ObfuscatedName("fb")
  @ObfuscatedSignature(
      signature = "(Lbu;III)V",
      garbageValue = "-1928445443"
  )
  static void method3102(class60 class60_0, int i_1, int i_2) {
    if (class60_0.field903 == i_1 && i_1 != -1) {
      int i_3 = class3.method25(i_1).field3553;
      if (i_3 == 1) {
        class60_0.field904 = 0;
        class60_0.field901 = 0;
        class60_0.field906 = i_2;
        class60_0.field907 = 0;
      }

      if (i_3 == 2) {
        class60_0.field907 = 0;
      }
    } else if (i_1 == -1 || class60_0.field903 == -1 || class3.method25(i_1).field3547 >= class3
        .method25(class60_0.field903).field3547) {
      class60_0.field903 = i_1;
      class60_0.field904 = 0;
      class60_0.field901 = 0;
      class60_0.field906 = i_2;
      class60_0.field907 = 0;
      class60_0.field930 = class60_0.field909;
    }

  }

  @ObfuscatedName("ih")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "176398255"
  )
  static final void method3103() {
    boolean bool_0 = false;

    while (!bool_0) {
      bool_0 = true;

      for (int i_1 = 0; i_1 < client.field771 - 1; i_1++) {
        if (client.field720[i_1] < 1000 && client.field720[i_1 + 1] > 1000) {
          String string_2 = client.field740[i_1];
          client.field740[i_1] = client.field740[i_1 + 1];
          client.field740[i_1 + 1] = string_2;
          String string_3 = client.field735[i_1];
          client.field735[i_1] = client.field735[i_1 + 1];
          client.field735[i_1 + 1] = string_3;
          int i_4 = client.field720[i_1];
          client.field720[i_1] = client.field720[i_1 + 1];
          client.field720[i_1 + 1] = i_4;
          i_4 = client.field718[i_1];
          client.field718[i_1] = client.field718[i_1 + 1];
          client.field718[i_1 + 1] = i_4;
          i_4 = client.field851[i_1];
          client.field851[i_1] = client.field851[i_1 + 1];
          client.field851[i_1 + 1] = i_4;
          i_4 = client.field794[i_1];
          client.field794[i_1] = client.field794[i_1 + 1];
          client.field794[i_1 + 1] = i_4;
          boolean bool_5 = client.field590[i_1];
          client.field590[i_1] = client.field590[i_1 + 1];
          client.field590[i_1 + 1] = bool_5;
          bool_0 = false;
        }
      }
    }

  }

}
