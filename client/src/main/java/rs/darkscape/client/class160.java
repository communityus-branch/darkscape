package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public abstract class class160 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;B)V",
      garbageValue = "-42"
  )
  public static void method3344(AbstractPack class247_0) {
    class253.field3226 = class247_0;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1518279696"
  )
  static final void method3338(int i_0, int i_1, int i_2) {
    int i_3;
    for (i_3 = 0; i_3 < 8; i_3++) {
      for (int i_4 = 0; i_4 < 8; i_4++) {
        class50.field459[i_0][i_3 + i_1][i_4 + i_2] = 0;
      }
    }

    if (i_1 > 0) {
      for (i_3 = 1; i_3 < 8; i_3++) {
        class50.field459[i_0][i_1][i_3 + i_2] = class50.field459[i_0][i_1 - 1][i_3 + i_2];
      }
    }

    if (i_2 > 0) {
      for (i_3 = 1; i_3 < 8; i_3++) {
        class50.field459[i_0][i_3 + i_1][i_2] = class50.field459[i_0][i_3 + i_1][i_2 - 1];
      }
    }

    if (i_1 > 0 && class50.field459[i_0][i_1 - 1][i_2] != 0) {
      class50.field459[i_0][i_1][i_2] = class50.field459[i_0][i_1 - 1][i_2];
    } else if (i_2 > 0 && class50.field459[i_0][i_1][i_2 - 1] != 0) {
      class50.field459[i_0][i_1][i_2] = class50.field459[i_0][i_1][i_2 - 1];
    } else if (i_1 > 0 && i_2 > 0 && class50.field459[i_0][i_1 - 1][i_2 - 1] != 0) {
      class50.field459[i_0][i_1][i_2] = class50.field459[i_0][i_1 - 1][i_2 - 1];
    }

  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-39289384"
  )
  static int method3341(int i_0, class84 class84_1, boolean bool_2) {
    class230 class230_3;
    if (i_0 == 2700) {
      class230_3 = class26.method434(class69.field999[--class69.field1003]);
      class69.field999[++class69.field1003 - 1] = class230_3.field2649;
      return 1;
    } else if (i_0 == 2701) {
      class230_3 = class26.method434(class69.field999[--class69.field1003]);
      if (class230_3.field2649 != -1) {
        class69.field999[++class69.field1003 - 1] = class230_3.field2727;
      } else {
        class69.field999[++class69.field1003 - 1] = 0;
      }

      return 1;
    } else if (i_0 == 2702) {
      int i_5 = class69.field999[--class69.field1003];
      class55 class55_4 = (class55) client.field741.get((long) i_5);
      if (class55_4 != null) {
        class69.field999[++class69.field1003 - 1] = 1;
      } else {
        class69.field999[++class69.field1003 - 1] = 0;
      }

      return 1;
    } else if (i_0 == 2706) {
      class69.field999[++class69.field1003 - 1] = client.field683;
      return 1;
    } else {
      return 2;
    }
  }

  @ObfuscatedName("hu")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1653590324"
  )
  static final void method3342() {
    for (class62 class62_0 = (class62) client.field714.getFirst(); class62_0 != null;
        class62_0 = (class62) client.field714.getNext()) {
      if (class62_0.field860 == -1) {
        class62_0.field855 = 0;
        class74.method1800(class62_0);
      } else {
        class62_0.unlinkNode();
      }
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2021286604"
  )
  public abstract void vmethod3330();

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "2142370282"
  )
  public abstract int vmethod3331(int var1, int var2);

}
