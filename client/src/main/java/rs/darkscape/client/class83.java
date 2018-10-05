package rs.darkscape.client;

import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class83 {

  @ObfuscatedName("z")
  static final Map field1180 = new HashMap();
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgu;"
  )
  static final class197 field1181 = new class197(1024);
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lhj;"
  )
  static final class215 field1184 = new class215();
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 556765175
  )
  static int field1186 = 0;

  @ObfuscatedName("gv")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZI)V",
      garbageValue = "1049390668"
  )
  static final void method1933(String string_0, boolean bool_1) {
    if (client.field677) {
      byte b_2 = 4;
      int i_3 = b_2 + 6;
      int i_4 = b_2 + 6;
      int i_5 = class63.field933.method5519(string_0, 250);
      int i_6 = class63.field933.method5520(string_0, 250) * 13;
      class314.method5763(i_3 - b_2, i_4 - b_2, b_2 + i_5 + b_2, b_2 + b_2 + i_6, 0);
      class314.method5734(i_3 - b_2, i_4 - b_2, b_2 + i_5 + b_2, i_6 + b_2 + b_2, 16777215);
      class63.field933.method5526(string_0, i_3, i_4, i_5, i_6, 16777215, -1, 1, 1, 0);
      Mouse.method948(i_3 - b_2, i_4 - b_2, b_2 + i_5 + b_2, b_2 + b_2 + i_6);
      if (bool_1) {
        Temp.field2014.vmethod5809(0, 0);
      } else {
        int i_7 = i_3;
        int i_8 = i_4;
        int i_9 = i_5;
        int i_10 = i_6;

        for (int i_11 = 0; i_11 < client.field603; i_11++) {
          if (client.field641[i_11] + client.field786[i_11] > i_7
              && client.field786[i_11] < i_7 + i_9
              && client.field789[i_11] + client.field787[i_11] > i_8
              && client.field787[i_11] < i_10 + i_8) {
            client.field788[i_11] = true;
          }
        }
      }

    }
  }

  @ObfuscatedName("he")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1621920950"
  )
  static final void method1940() {
    int i_0 = Mouse.field435;
    int i_1 = class0.field1;
    int i_2 = class135.field1856;
    int i_3 = Temp.field1933;
    int i_4 = 6116423;
    class314.method5763(i_0, i_1, i_2, i_3, i_4);
    class314.method5763(i_0 + 1, i_1 + 1, i_2 - 2, 16, 0);
    class314.method5734(i_0 + 1, i_1 + 18, i_2 - 2, i_3 - 19, 0);
    class293.field3660.method5522("Choose Option", i_0 + 3, i_1 + 14, i_4, -1);
    int i_5 = Mouse.field425;
    int i_6 = Mouse.field426 * 673804999;

    int i_7;
    int i_8;
    int i_9;
    for (i_7 = 0; i_7 < client.field771; i_7++) {
      i_8 = i_1 + (client.field771 - 1 - i_7) * 15 + 31;
      i_9 = 16777215;
      if (i_5 > i_0 && i_5 < i_2 + i_0 && i_6 > i_8 - 13 && i_6 < i_8 + 3) {
        i_9 = 16776960;
      }

      class293.field3660.method5522(class18.method176(i_7), i_0 + 3, i_8, i_9, 0);
    }

    i_7 = Mouse.field435;
    i_8 = class0.field1;
    i_9 = class135.field1856;
    int i_10 = Temp.field1933;

    for (int i_11 = 0; i_11 < client.field603; i_11++) {
      if (client.field641[i_11] + client.field786[i_11] > i_7 && client.field786[i_11] < i_7 + i_9
          && client.field789[i_11] + client.field787[i_11] > i_8
          && client.field787[i_11] < i_8 + i_10) {
        client.field788[i_11] = true;
      }
    }

  }

  @ObfuscatedName("ib")
  @ObfuscatedSignature(
      signature = "([Lhi;II)V",
      garbageValue = "1406653934"
  )
  static final void method1923(class230[] arr_0, int i_1) {
    for (int i_2 = 0; i_2 < arr_0.length; i_2++) {
      class230 class230_3 = arr_0[i_2];
      if (class230_3 != null) {
        if (class230_3.field2721 == 0) {
          if (class230_3.field2736 != null) {
            method1923(class230_3.field2736, i_1);
          }

          class55 class55_4 = (class55) client.field741.get((long) class230_3.field2691);
          if (class55_4 != null) {
            int i_5 = class55_4.field501;
            if (class261.method4931(i_5)) {
              method1923(class42.field366[i_5], i_1);
            }
          }
        }

        class56 class56_6;
        if (i_1 == 0 && class230_3.field2654 != null) {
          class56_6 = new class56();
          class56_6.field506 = class230_3;
          class56_6.field512 = class230_3.field2654;
          class68.method1696(class56_6);
        }

        if (i_1 == 1 && class230_3.field2714 != null) {
          if (class230_3.field2606 >= 0) {
            class230 class230_7 = class26.method434(class230_3.field2691);
            if (class230_7 == null || class230_7.field2736 == null
                || class230_3.field2606 >= class230_7.field2736.length
                || class230_3 != class230_7.field2736[class230_3.field2606]) {
              continue;
            }
          }

          class56_6 = new class56();
          class56_6.field506 = class230_3;
          class56_6.field512 = class230_3.field2714;
          class68.method1696(class56_6);
        }
      }
    }

  }

}
