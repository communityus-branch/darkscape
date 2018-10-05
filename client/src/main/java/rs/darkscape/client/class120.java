package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class120 {

  @ObfuscatedName("z")
  public static boolean field1650 = false;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = 127802141
  )
  public static int field1656 = 0;
  @ObfuscatedName("g")
  public static long[] field1647 = new long[1000];
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1347288675
  )
  static int field1657;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -2010243593
  )
  static int field1659;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 1154137323
  )
  static int field1651;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -160115827
  )
  static int field1654;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -1132219127
  )
  static int field1655;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -2004293301
  )
  static int field1648 = 0;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 1960982477
  )
  static int field1649 = 0;
  @ObfuscatedName("l")
  static boolean field1652 = false;

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(IIIZIZB)V",
      garbageValue = "40"
  )
  static void method2781(int i_0, int i_1, int i_2, boolean bool_3, int i_4, boolean bool_5) {
    if (i_0 < i_1) {
      int i_6 = (i_0 + i_1) / 2;
      int i_7 = i_0;
      class65 class65_8 = class65.field949[i_6];
      class65.field949[i_6] = class65.field949[i_1];
      class65.field949[i_1] = class65_8;

      for (int i_9 = i_0; i_9 < i_1; i_9++) {
        if (BufferedFile.method2503(class65.field949[i_9], class65_8, i_2, bool_3, i_4, bool_5)
            <= 0) {
          class65 class65_10 = class65.field949[i_9];
          class65.field949[i_9] = class65.field949[i_7];
          class65.field949[i_7++] = class65_10;
        }
      }

      class65.field949[i_1] = class65.field949[i_7];
      class65.field949[i_7] = class65_8;
      method2781(i_0, i_7 - 1, i_2, bool_3, i_4, bool_5);
      method2781(i_7 + 1, i_1, i_2, bool_3, i_4, bool_5);
    }

  }

}
