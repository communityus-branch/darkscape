package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class228 {

  @ObfuscatedName("z")
  public static final short[] field2582 = new short[]{(short) 6798, (short) 8741, (short) 25238,
      (short) 4626, (short) 4550};
  @ObfuscatedName("w")
  public static final short[][] field2583 = new short[][]{
      {(short) 6798, (short) 107, (short) 10283, (short) 16, (short) 4797, (short) 7744,
          (short) 5799, (short) 4634, (short) -31839, (short) 22433, (short) 2983, (short) -11343,
          (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845,
          (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701,
          (short) -14010},
      {(short) 8741, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404,
          (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783,
          (short) 1341, (short) 16578, (short) -30533, (short) 25239, (short) 8, (short) 5281,
          (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571,
          (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010},
      {(short) 25238, (short) 8742, (short) 12, (short) -1506, (short) -22374, (short) 7735,
          (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915,
          (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 8, (short) 5281,
          (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571,
          (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010},
      {(short) 4626, (short) 11146, (short) 6439, (short) 12, (short) 4758, (short) 10270},
      {(short) 4550, (short) 4537, (short) 5681, (short) 5673, (short) 5790, (short) 6806,
          (short) 8076, (short) 4574, (short) 17050, (short) 0, (short) 127, (short) -31821}};
  @ObfuscatedName("s")
  public static final short[] field2586 = new short[]{(short) -10304, (short) 9104, (short) -1,
      (short) -1, (short) -1};
  @ObfuscatedName("l")
  public static final short[][] field2585 = new short[][]{
      {(short) 6554, (short) 115, (short) 10304, (short) 28, (short) 5702, (short) 7756,
          (short) 5681, (short) 4510, (short) -31835, (short) 22437, (short) 2859, (short) -11339,
          (short) 16, (short) 5157, (short) 10446, (short) 3658, (short) -27314, (short) -21965,
          (short) 472, (short) 580, (short) 784, (short) 21966, (short) 28950, (short) -15697,
          (short) -14002},
      {(short) 9104, (short) 10275, (short) 7595, (short) 3610, (short) 7975, (short) 8526,
          (short) 918, (short) -26734, (short) 24466, (short) 10145, (short) -6882, (short) 5027,
          (short) 1457, (short) 16565, (short) -30545, (short) 25486, (short) 24, (short) 5392,
          (short) 10429, (short) 3673, (short) -27335, (short) -21957, (short) 192, (short) 687,
          (short) 412, (short) 21821, (short) 28835, (short) -15460, (short) -14019}, new short[0],
      new short[0], new short[0]};

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "1857567287"
  )
  static int method4495(int i_0, class84 class84_1, boolean bool_2) {
    class230 class230_3;
    if (i_0 >= 2000) {
      i_0 -= 1000;
      class230_3 = class26.method434(class69.field999[--class69.field1003]);
    } else {
      class230_3 = bool_2 ? class276.field3561 : class260.field3301;
    }

    String string_4 = class69.field1001[--class55.field497];
    int[] ints_5 = null;
    if (string_4.length() > 0 && string_4.charAt(string_4.length() - 1) == 89) {
      int i_6 = class69.field999[--class69.field1003];
      if (i_6 > 0) {
        for (ints_5 = new int[i_6]; i_6-- > 0;
            ints_5[i_6] = class69.field999[--class69.field1003]) {
        }
      }

      string_4 = string_4.substring(0, string_4.length() - 1);
    }

    Object[] arr_8 = new Object[string_4.length() + 1];

    int i_7;
    for (i_7 = arr_8.length - 1; i_7 >= 1; --i_7) {
      if (string_4.charAt(i_7 - 1) == 115) {
        arr_8[i_7] = class69.field1001[--class55.field497];
      } else {
        arr_8[i_7] = new Integer(class69.field999[--class69.field1003]);
      }
    }

    i_7 = class69.field999[--class69.field1003];
    if (i_7 != -1) {
      arr_8[0] = new Integer(i_7);
    } else {
      arr_8 = null;
    }

    if (i_0 == 1400) {
      class230_3.field2688 = arr_8;
    } else if (i_0 == 1401) {
      class230_3.field2614 = arr_8;
    } else if (i_0 == 1402) {
      class230_3.field2690 = arr_8;
    } else if (i_0 == 1403) {
      class230_3.field2692 = arr_8;
    } else if (i_0 == 1404) {
      class230_3.field2694 = arr_8;
    } else if (i_0 == 1405) {
      class230_3.field2695 = arr_8;
    } else if (i_0 == 1406) {
      class230_3.field2698 = arr_8;
    } else if (i_0 == 1407) {
      class230_3.field2699 = arr_8;
      class230_3.field2700 = ints_5;
    } else if (i_0 == 1408) {
      class230_3.field2705 = arr_8;
    } else if (i_0 == 1409) {
      class230_3.field2706 = arr_8;
    } else if (i_0 == 1410) {
      class230_3.field2696 = arr_8;
    } else if (i_0 == 1411) {
      class230_3.field2689 = arr_8;
    } else if (i_0 == 1412) {
      class230_3.field2594 = arr_8;
    } else if (i_0 == 1414) {
      class230_3.field2670 = arr_8;
      class230_3.field2733 = ints_5;
    } else if (i_0 == 1415) {
      class230_3.field2703 = arr_8;
      class230_3.field2635 = ints_5;
    } else if (i_0 == 1416) {
      class230_3.field2734 = arr_8;
    } else if (i_0 == 1417) {
      class230_3.field2707 = arr_8;
    } else if (i_0 == 1418) {
      class230_3.field2708 = arr_8;
    } else if (i_0 == 1419) {
      class230_3.field2637 = arr_8;
    } else if (i_0 == 1420) {
      class230_3.field2718 = arr_8;
    } else if (i_0 == 1421) {
      class230_3.field2711 = arr_8;
    } else if (i_0 == 1422) {
      class230_3.field2712 = arr_8;
    } else if (i_0 == 1423) {
      class230_3.field2654 = arr_8;
    } else if (i_0 == 1424) {
      class230_3.field2714 = arr_8;
    } else if (i_0 == 1425) {
      class230_3.field2716 = arr_8;
    } else if (i_0 == 1426) {
      class230_3.field2693 = arr_8;
    } else {
      if (i_0 != 1427) {
        return 2;
      }

      class230_3.field2715 = arr_8;
    }

    class230_3.field2686 = true;
    return 1;
  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "(IIIIIIII)Z",
      garbageValue = "-861297609"
  )
  static final boolean method4494(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
    int i_7 = class120.field1649 + i_6;
    if (i_7 < i_0 && i_7 < i_1 && i_7 < i_2) {
      return false;
    } else {
      i_7 = class120.field1649 - i_6;
      if (i_7 > i_0 && i_7 > i_1 && i_7 > i_2) {
        return false;
      } else {
        i_7 = class120.field1648 + i_6;
        if (i_7 < i_3 && i_7 < i_4 && i_7 < i_5) {
          return false;
        } else {
          i_7 = class120.field1648 - i_6;
          return i_7 <= i_3 || i_7 <= i_4 || i_7 <= i_5;
        }
      }
    }
  }

}
