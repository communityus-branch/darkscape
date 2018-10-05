package rs.darkscape.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class1 {

  @ObfuscatedName("w")
  public static Comparator field9 = new class7();
  @ObfuscatedName("s")
  public static Comparator field13;
  @ObfuscatedName("l")
  public static Comparator field11;
  @ObfuscatedName("u")
  public static Comparator field16;
  @ObfuscatedName("mt")
  @ObfuscatedGetter(
      intValue = -1202584647
  )
  static int field15;
  @ObfuscatedName("ea")
  @ObfuscatedSignature(
      signature = "Lkv;"
  )
  static class296 field14;

  static {
    new class0();
    field13 = new class5();
    field11 = new class6();
    field16 = new class3();
  }

  @ObfuscatedName("z")
  public final List field10;

  @ObfuscatedSignature(
      signature = "(Lgk;Z)V",
      garbageValue = "1"
  )
  public class1(Buffer class182_1, boolean bool_2) {
    int i_3 = class182_1.getUInt16();
    boolean bool_4 = class182_1.getUInt8() == 1;
    byte b_5;
    if (bool_4) {
      b_5 = 1;
    } else {
      b_5 = 0;
    }

    int i_6 = class182_1.getUInt16();
    this.field10 = new ArrayList(i_6);

    for (int i_7 = 0; i_7 < i_6; i_7++) {
      this.field10.add(new class2(class182_1, b_5, i_3));
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "319934987"
  )
  public static final boolean method8() {
    Keyboard class39_0 = Keyboard.keyboard;
    synchronized (Keyboard.keyboard) {
      if (Keyboard.field352 == Keyboard.field350) {
        return false;
      } else {
        Temp.field2016 = Keyboard.typedKeyCode[Keyboard.field350];
        Keyboard.field342 = Keyboard.typedKeyChar[Keyboard.field350];
        Keyboard.field350 = Keyboard.field350 + 1 & 0x7f;
        return true;
      }
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)Ljv;",
      garbageValue = "1"
  )
  public static class272 method15(int i_0) {
    class272 class272_1 = (class272) class272.field3524.method3989((long) i_0);
    if (class272_1 != null) {
      return class272_1;
    } else {
      byte[] bytes_2 = class272.field3529.method4625(4, i_0);
      class272_1 = new class272();
      if (bytes_2 != null) {
        class272_1.method5194(new Buffer(bytes_2), i_0);
      }

      class272_1.method5195();
      class272.field3524.method3983(class272_1, (long) i_0);
      return class272_1;
    }
  }

  @ObfuscatedName("il")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lhi;I)Ljava/lang/String;",
      garbageValue = "1244240994"
  )
  static String method11(String string_0, class230 class230_1) {
    if (string_0.indexOf("%") != -1) {
      for (int i_2 = 1; i_2 <= 5; i_2++) {
        while (true) {
          int i_3 = string_0.indexOf("%" + i_2);
          if (i_3 == -1) {
            break;
          }

          String string_4 = string_0.substring(0, i_3);
          int i_6 = class137.method3119(class230_1, i_2 - 1);
          String str_5;
          if (i_6 < 999999999) {
            str_5 = Integer.toString(i_6);
          } else {
            str_5 = "*";
          }

          string_0 = string_4 + str_5 + string_0.substring(i_3 + 2);
        }
      }
    }

    return string_0;
  }

  @ObfuscatedName("js")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1214880142"
  )
  static final void method13() {
    client.field828 = client.field801;
    class54.field489 = true;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;ZB)V",
      garbageValue = "48"
  )
  public void method9(Comparator comparator_1, boolean bool_2) {
    if (bool_2) {
      Collections.sort(this.field10, comparator_1);
    } else {
      Collections.sort(this.field10, Collections.reverseOrder(comparator_1));
    }

  }

}
