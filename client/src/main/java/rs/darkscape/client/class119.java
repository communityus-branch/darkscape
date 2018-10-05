package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class class119 extends class127 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Ldc;"
  )
  static class119 field1641 = new class119();
  @ObfuscatedName("w")
  static byte[] field1578 = new byte[1];
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Ldc;"
  )
  static class119 field1579 = new class119();
  @ObfuscatedName("l")
  static byte[] field1580 = new byte[1];
  @ObfuscatedName("ar")
  static boolean[] field1616 = new boolean[4700];
  @ObfuscatedName("au")
  static boolean[] field1626 = new boolean[4700];
  @ObfuscatedName("av")
  static int[] field1582 = new int[4700];
  @ObfuscatedName("al")
  static int[] field1619 = new int[4700];
  @ObfuscatedName("ae")
  static int[] field1590 = new int[4700];
  @ObfuscatedName("az")
  static int[] field1589 = new int[4700];
  @ObfuscatedName("aq")
  static int[] field1577 = new int[4700];
  @ObfuscatedName("ad")
  static int[] field1623 = new int[4700];
  @ObfuscatedName("ax")
  static int[] field1625 = new int[1600];
  @ObfuscatedName("am")
  static int[][] field1592 = new int[1600][512];
  @ObfuscatedName("ay")
  static int[] field1638 = new int[12];
  @ObfuscatedName("ag")
  static int[][] field1640 = new int[12][2000];
  @ObfuscatedName("bk")
  static int[] field1608 = new int[2000];
  @ObfuscatedName("bp")
  static int[] field1595 = new int[2000];
  @ObfuscatedName("bi")
  static int[] field1631 = new int[12];
  @ObfuscatedName("bj")
  static int[] field1632 = new int[10];
  @ObfuscatedName("bo")
  static int[] field1630 = new int[10];
  @ObfuscatedName("bq")
  static int[] field1634 = new int[10];
  @ObfuscatedName("bg")
  static boolean field1612 = true;
  @ObfuscatedName("bn")
  static int[] field1594;
  @ObfuscatedName("bb")
  static int[] field1642;
  @ObfuscatedName("bx")
  static int[] field1643;
  @ObfuscatedName("bc")
  static int[] field1598;
  @ObfuscatedName("bh")
  static int field1635;
  @ObfuscatedName("bz")
  static int field1636;
  @ObfuscatedName("bu")
  static int field1637;

  static {
    field1594 = class122.field1681;
    field1642 = class122.field1693;
    field1643 = class122.field1675;
    field1598 = class122.field1691;
  }

  @ObfuscatedName("af")
  public boolean field1603 = false;
  @ObfuscatedName("u")
  int field1581 = 0;
  @ObfuscatedName("x")
  int field1585 = 0;
  @ObfuscatedName("y")
  byte field1596 = 0;
  @ObfuscatedName("a")
  int field1597 = 0;
  @ObfuscatedName("ai")
  int field1614 = -1;
  @ObfuscatedName("ac")
  int field1613 = -1;
  @ObfuscatedName("ap")
  int field1629 = -1;
  @ObfuscatedName("q")
  int[] field1646;
  @ObfuscatedName("k")
  int[] field1583;
  @ObfuscatedName("i")
  int[] field1584;
  @ObfuscatedName("e")
  int[] field1586;
  @ObfuscatedName("p")
  int[] field1587;
  @ObfuscatedName("b")
  int[] field1588;
  @ObfuscatedName("n")
  int[] field1615;
  @ObfuscatedName("f")
  int[] field1620;
  @ObfuscatedName("g")
  int[] field1591;
  @ObfuscatedName("m")
  byte[] field1645;
  @ObfuscatedName("r")
  byte[] field1593;
  @ObfuscatedName("o")
  short[] field1604;
  @ObfuscatedName("t")
  byte[] field1617;
  @ObfuscatedName("j")
  int[] field1621;
  @ObfuscatedName("d")
  int[] field1599;
  @ObfuscatedName("h")
  int[] field1600;
  @ObfuscatedName("c")
  int[][] field1601;
  @ObfuscatedName("v")
  int[][] field1602;
  @ObfuscatedName("an")
  int field1605;
  @ObfuscatedName("ao")
  int field1610;
  @ObfuscatedName("at")
  int field1611;
  @ObfuscatedName("ah")
  int field1633;
  @ObfuscatedName("ab")
  int field1628;
  @ObfuscatedName("aw")
  int field1606;
  @ObfuscatedName("as")
  int field1618;
  @ObfuscatedName("ak")
  int field1607;

  class119() {
  }

  @ObfuscatedSignature(
      signature = "([Ldc;I)V"
  )
  public class119(class119[] arr_1, int i_2) {
    boolean bool_3 = false;
    boolean bool_4 = false;
    boolean bool_5 = false;
    boolean bool_6 = false;
    this.field1581 = 0;
    this.field1585 = 0;
    this.field1597 = 0;
    this.field1596 = -1;

    int i_7;
    class119 class119_8;
    for (i_7 = 0; i_7 < i_2; i_7++) {
      class119_8 = arr_1[i_7];
      if (class119_8 != null) {
        this.field1581 += class119_8.field1581;
        this.field1585 += class119_8.field1585;
        this.field1597 += class119_8.field1597;
        if (class119_8.field1645 != null) {
          bool_3 = true;
        } else {
          if (this.field1596 == -1) {
            this.field1596 = class119_8.field1596;
          }

          if (this.field1596 != class119_8.field1596) {
            bool_3 = true;
          }
        }

        bool_4 |= class119_8.field1593 != null;
        bool_5 |= class119_8.field1604 != null;
        bool_6 |= class119_8.field1617 != null;
      }
    }

    this.field1646 = new int[this.field1581];
    this.field1583 = new int[this.field1581];
    this.field1584 = new int[this.field1581];
    this.field1586 = new int[this.field1585];
    this.field1587 = new int[this.field1585];
    this.field1588 = new int[this.field1585];
    this.field1615 = new int[this.field1585];
    this.field1620 = new int[this.field1585];
    this.field1591 = new int[this.field1585];
    if (bool_3) {
      this.field1645 = new byte[this.field1585];
    }

    if (bool_4) {
      this.field1593 = new byte[this.field1585];
    }

    if (bool_5) {
      this.field1604 = new short[this.field1585];
    }

    if (bool_6) {
      this.field1617 = new byte[this.field1585];
    }

    if (this.field1597 > 0) {
      this.field1621 = new int[this.field1597];
      this.field1599 = new int[this.field1597];
      this.field1600 = new int[this.field1597];
    }

    this.field1581 = 0;
    this.field1585 = 0;
    this.field1597 = 0;

    for (i_7 = 0; i_7 < i_2; i_7++) {
      class119_8 = arr_1[i_7];
      if (class119_8 != null) {
        int i_9;
        for (i_9 = 0; i_9 < class119_8.field1585; i_9++) {
          this.field1586[this.field1585] = this.field1581 + class119_8.field1586[i_9];
          this.field1587[this.field1585] = this.field1581 + class119_8.field1587[i_9];
          this.field1588[this.field1585] = this.field1581 + class119_8.field1588[i_9];
          this.field1615[this.field1585] = class119_8.field1615[i_9];
          this.field1620[this.field1585] = class119_8.field1620[i_9];
          this.field1591[this.field1585] = class119_8.field1591[i_9];
          if (bool_3) {
            if (class119_8.field1645 != null) {
              this.field1645[this.field1585] = class119_8.field1645[i_9];
            } else {
              this.field1645[this.field1585] = class119_8.field1596;
            }
          }

          if (bool_4 && class119_8.field1593 != null) {
            this.field1593[this.field1585] = class119_8.field1593[i_9];
          }

          if (bool_5) {
            if (class119_8.field1604 != null) {
              this.field1604[this.field1585] = class119_8.field1604[i_9];
            } else {
              this.field1604[this.field1585] = -1;
            }
          }

          if (bool_6) {
            if (class119_8.field1617 != null && class119_8.field1617[i_9] != -1) {
              this.field1617[this.field1585] = (byte) (this.field1597 + class119_8.field1617[i_9]);
            } else {
              this.field1617[this.field1585] = -1;
            }
          }

          ++this.field1585;
        }

        for (i_9 = 0; i_9 < class119_8.field1597; i_9++) {
          this.field1621[this.field1597] = this.field1581 + class119_8.field1621[i_9];
          this.field1599[this.field1597] = this.field1581 + class119_8.field1599[i_9];
          this.field1600[this.field1597] = this.field1581 + class119_8.field1600[i_9];
          ++this.field1597;
        }

        for (i_9 = 0; i_9 < class119_8.field1581; i_9++) {
          this.field1646[this.field1581] = class119_8.field1646[i_9];
          this.field1583[this.field1581] = class119_8.field1583[i_9];
          this.field1584[this.field1581] = class119_8.field1584[i_9];
          ++this.field1581;
        }
      }
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([[IIIIZI)Ldc;"
  )
  public class119 method2665(int[][] ints_1, int i_2, int i_3, int i_4, boolean bool_5, int i_6) {
    this.method2670();
    int i_7 = i_2 - this.field1606;
    int i_8 = i_2 + this.field1606;
    int i_9 = i_4 - this.field1606;
    int i_10 = i_4 + this.field1606;
    if (i_7 >= 0 && i_8 + 128 >> 7 < ints_1.length && i_9 >= 0
        && i_10 + 128 >> 7 < ints_1[0].length) {
      i_7 >>= 7;
      i_8 = i_8 + 127 >> 7;
      i_9 >>= 7;
      i_10 = i_10 + 127 >> 7;
      if (i_3 == ints_1[i_7][i_9] && i_3 == ints_1[i_8][i_9] && i_3 == ints_1[i_7][i_10]
          && i_3 == ints_1[i_8][i_10]) {
        return this;
      } else {
        class119 class119_11;
        if (bool_5) {
          class119_11 = new class119();
          class119_11.field1581 = this.field1581;
          class119_11.field1585 = this.field1585;
          class119_11.field1597 = this.field1597;
          class119_11.field1646 = this.field1646;
          class119_11.field1584 = this.field1584;
          class119_11.field1586 = this.field1586;
          class119_11.field1587 = this.field1587;
          class119_11.field1588 = this.field1588;
          class119_11.field1615 = this.field1615;
          class119_11.field1620 = this.field1620;
          class119_11.field1591 = this.field1591;
          class119_11.field1645 = this.field1645;
          class119_11.field1593 = this.field1593;
          class119_11.field1617 = this.field1617;
          class119_11.field1604 = this.field1604;
          class119_11.field1596 = this.field1596;
          class119_11.field1621 = this.field1621;
          class119_11.field1599 = this.field1599;
          class119_11.field1600 = this.field1600;
          class119_11.field1601 = this.field1601;
          class119_11.field1602 = this.field1602;
          class119_11.field1603 = this.field1603;
          class119_11.field1583 = new int[class119_11.field1581];
        } else {
          class119_11 = this;
        }

        int i_12;
        int i_13;
        int i_14;
        int i_15;
        int i_16;
        int i_17;
        int i_18;
        int i_19;
        int i_20;
        int i_21;
        if (i_6 == 0) {
          for (i_12 = 0; i_12 < class119_11.field1581; i_12++) {
            i_13 = i_2 + this.field1646[i_12];
            i_14 = i_4 + this.field1584[i_12];
            i_15 = i_13 & 0x7f;
            i_16 = i_14 & 0x7f;
            i_17 = i_13 >> 7;
            i_18 = i_14 >> 7;
            i_19 = ints_1[i_17][i_18] * (128 - i_15) + ints_1[i_17 + 1][i_18] * i_15 >> 7;
            i_20 = ints_1[i_17][i_18 + 1] * (128 - i_15) + i_15 * ints_1[i_17 + 1][i_18 + 1] >> 7;
            i_21 = i_19 * (128 - i_16) + i_20 * i_16 >> 7;
            class119_11.field1583[i_12] = i_21 + this.field1583[i_12] - i_3;
          }
        } else {
          for (i_12 = 0; i_12 < class119_11.field1581; i_12++) {
            i_13 = (-this.field1583[i_12] << 16) / super.field1781;
            if (i_13 < i_6) {
              i_14 = i_2 + this.field1646[i_12];
              i_15 = i_4 + this.field1584[i_12];
              i_16 = i_14 & 0x7f;
              i_17 = i_15 & 0x7f;
              i_18 = i_14 >> 7;
              i_19 = i_15 >> 7;
              i_20 = ints_1[i_18][i_19] * (128 - i_16) + ints_1[i_18 + 1][i_19] * i_16 >> 7;
              i_21 = ints_1[i_18][i_19 + 1] * (128 - i_16) + i_16 * ints_1[i_18 + 1][i_19 + 1] >> 7;
              int i_22 = i_20 * (128 - i_17) + i_21 * i_17 >> 7;
              class119_11.field1583[i_12] =
                  (i_6 - i_13) * (i_22 - i_3) / i_6 + this.field1583[i_12];
            }
          }
        }

        class119_11.method2673();
        return class119_11;
      }
    } else {
      return this;
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Z)Ldc;"
  )
  public class119 method2666(boolean bool_1) {
    if (!bool_1 && field1578.length < this.field1585) {
      field1578 = new byte[this.field1585 + 100];
    }

    return this.method2741(bool_1, field1641, field1578);
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Z)Ldc;"
  )
  public class119 method2667(boolean bool_1) {
    if (!bool_1 && field1580.length < this.field1585) {
      field1580 = new byte[this.field1585 + 100];
    }

    return this.method2741(bool_1, field1579, field1580);
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(ZLdc;[B)Ldc;"
  )
  class119 method2741(boolean bool_1, class119 class119_2, byte[] bytes_3) {
    class119_2.field1581 = this.field1581;
    class119_2.field1585 = this.field1585;
    class119_2.field1597 = this.field1597;
    if (class119_2.field1646 == null || class119_2.field1646.length < this.field1581) {
      class119_2.field1646 = new int[this.field1581 + 100];
      class119_2.field1583 = new int[this.field1581 + 100];
      class119_2.field1584 = new int[this.field1581 + 100];
    }

    int i_4;
    for (i_4 = 0; i_4 < this.field1581; i_4++) {
      class119_2.field1646[i_4] = this.field1646[i_4];
      class119_2.field1583[i_4] = this.field1583[i_4];
      class119_2.field1584[i_4] = this.field1584[i_4];
    }

    if (bool_1) {
      class119_2.field1593 = this.field1593;
    } else {
      class119_2.field1593 = bytes_3;
      if (this.field1593 == null) {
        for (i_4 = 0; i_4 < this.field1585; i_4++) {
          class119_2.field1593[i_4] = 0;
        }
      } else {
        for (i_4 = 0; i_4 < this.field1585; i_4++) {
          class119_2.field1593[i_4] = this.field1593[i_4];
        }
      }
    }

    class119_2.field1586 = this.field1586;
    class119_2.field1587 = this.field1587;
    class119_2.field1588 = this.field1588;
    class119_2.field1615 = this.field1615;
    class119_2.field1620 = this.field1620;
    class119_2.field1591 = this.field1591;
    class119_2.field1645 = this.field1645;
    class119_2.field1617 = this.field1617;
    class119_2.field1604 = this.field1604;
    class119_2.field1596 = this.field1596;
    class119_2.field1621 = this.field1621;
    class119_2.field1599 = this.field1599;
    class119_2.field1600 = this.field1600;
    class119_2.field1601 = this.field1601;
    class119_2.field1602 = this.field1602;
    class119_2.field1603 = this.field1603;
    class119_2.method2673();
    return class119_2;
  }

  @ObfuscatedName("u")
  void method2669(int i_1) {
    if (this.field1614 == -1) {
      int i_2 = 0;
      int i_3 = 0;
      int i_4 = 0;
      int i_5 = 0;
      int i_6 = 0;
      int i_7 = 0;
      int i_8 = field1642[i_1];
      int i_9 = field1594[i_1];

      for (int i_10 = 0; i_10 < this.field1581; i_10++) {
        int i_11 = class122.method2803(this.field1646[i_10], this.field1584[i_10], i_8, i_9);
        int i_12 = this.field1583[i_10];
        int i_13 = class122.method2828(this.field1646[i_10], this.field1584[i_10], i_8, i_9);
        if (i_11 < i_2) {
          i_2 = i_11;
        }

        if (i_11 > i_5) {
          i_5 = i_11;
        }

        if (i_12 < i_3) {
          i_3 = i_12;
        }

        if (i_12 > i_6) {
          i_6 = i_12;
        }

        if (i_13 < i_4) {
          i_4 = i_13;
        }

        if (i_13 > i_7) {
          i_7 = i_13;
        }
      }

      this.field1605 = (i_5 + i_2) / 2;
      this.field1610 = (i_6 + i_3) / 2;
      this.field1611 = (i_7 + i_4) / 2;
      this.field1614 = (i_5 - i_2 + 1) / 2;
      this.field1613 = (i_6 - i_3 + 1) / 2;
      this.field1629 = (i_7 - i_4 + 1) / 2;
      if (this.field1614 < 32) {
        this.field1614 = 32;
      }

      if (this.field1629 < 32) {
        this.field1629 = 32;
      }

      if (this.field1603) {
        this.field1614 += 8;
        this.field1629 += 8;
      }

    }
  }

  @ObfuscatedName("q")
  public void method2670() {
    if (this.field1633 != 1) {
      this.field1633 = 1;
      super.field1781 = 0;
      this.field1628 = 0;
      this.field1606 = 0;

      for (int i_1 = 0; i_1 < this.field1581; i_1++) {
        int i_2 = this.field1646[i_1];
        int i_3 = this.field1583[i_1];
        int i_4 = this.field1584[i_1];
        if (-i_3 > super.field1781) {
          super.field1781 = -i_3;
        }

        if (i_3 > this.field1628) {
          this.field1628 = i_3;
        }

        int i_5 = i_2 * i_2 + i_4 * i_4;
        if (i_5 > this.field1606) {
          this.field1606 = i_5;
        }
      }

      this.field1606 = (int) (Math.sqrt((double) this.field1606) + 0.99D);
      this.field1618 = (int) (
          Math.sqrt((double) (this.field1606 * this.field1606 + super.field1781 * super.field1781))
              + 0.99D);
      this.field1607 = this.field1618 + (int) (
          Math.sqrt((double) (this.field1606 * this.field1606 + this.field1628 * this.field1628))
              + 0.99D);
    }
  }

  @ObfuscatedName("i")
  void method2671() {
    if (this.field1633 != 2) {
      this.field1633 = 2;
      this.field1606 = 0;

      for (int i_1 = 0; i_1 < this.field1581; i_1++) {
        int i_2 = this.field1646[i_1];
        int i_3 = this.field1583[i_1];
        int i_4 = this.field1584[i_1];
        int i_5 = i_2 * i_2 + i_4 * i_4 + i_3 * i_3;
        if (i_5 > this.field1606) {
          this.field1606 = i_5;
        }
      }

      this.field1606 = (int) (Math.sqrt((double) this.field1606) + 0.99D);
      this.field1618 = this.field1606;
      this.field1607 = this.field1606 + this.field1606;
    }
  }

  @ObfuscatedName("x")
  public int method2672() {
    this.method2670();
    return this.field1606;
  }

  @ObfuscatedName("p")
  void method2673() {
    this.field1633 = 0;
    this.field1614 = -1;
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(Lew;I)V"
  )
  public void method2724(class130 class130_1, int i_2) {
    if (this.field1601 != null) {
      if (i_2 != -1) {
        class117 class117_3 = class130_1.field1802[i_2];
        class124 class124_4 = class117_3.field1546;
        field1635 = 0;
        field1636 = 0;
        field1637 = 0;

        for (int i_5 = 0; i_5 < class117_3.field1547; i_5++) {
          int i_6 = class117_3.field1548[i_5];
          this.method2676(class124_4.field1706[i_6], class124_4.field1707[i_6],
                          class117_3.field1549[i_5], class117_3.field1542[i_5],
                          class117_3.field1550[i_5]);
        }

        this.method2673();
      }
    }
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(Lew;ILew;I[I)V"
  )
  public void method2745(class130 class130_1, int i_2, class130 class130_3, int i_4, int[] ints_5) {
    if (i_2 != -1) {
      if (ints_5 != null && i_4 != -1) {
        class117 class117_6 = class130_1.field1802[i_2];
        class117 class117_7 = class130_3.field1802[i_4];
        class124 class124_8 = class117_6.field1546;
        field1635 = 0;
        field1636 = 0;
        field1637 = 0;
        byte b_9 = 0;
        int i_13 = b_9 + 1;
        int i_10 = ints_5[b_9];

        int i_11;
        int i_12;
        for (i_11 = 0; i_11 < class117_6.field1547; i_11++) {
          for (i_12 = class117_6.field1548[i_11]; i_12 > i_10; i_10 = ints_5[i_13++]) {
          }

          if (i_12 != i_10 || class124_8.field1706[i_12] == 0) {
            this.method2676(class124_8.field1706[i_12], class124_8.field1707[i_12],
                            class117_6.field1549[i_11], class117_6.field1542[i_11],
                            class117_6.field1550[i_11]);
          }
        }

        field1635 = 0;
        field1636 = 0;
        field1637 = 0;
        b_9 = 0;
        i_13 = b_9 + 1;
        i_10 = ints_5[b_9];

        for (i_11 = 0; i_11 < class117_7.field1547; i_11++) {
          for (i_12 = class117_7.field1548[i_11]; i_12 > i_10; i_10 = ints_5[i_13++]) {
          }

          if (i_12 == i_10 || class124_8.field1706[i_12] == 0) {
            this.method2676(class124_8.field1706[i_12], class124_8.field1707[i_12],
                            class117_7.field1549[i_11], class117_7.field1542[i_11],
                            class117_7.field1550[i_11]);
          }
        }

        this.method2673();
      } else {
        this.method2724(class130_1, i_2);
      }
    }
  }

  @ObfuscatedName("f")
  void method2676(int i_1, int[] ints_2, int i_3, int i_4, int i_5) {
    int i_6 = ints_2.length;
    int i_7;
    int i_8;
    int i_11;
    int i_12;
    if (i_1 == 0) {
      i_7 = 0;
      field1635 = 0;
      field1636 = 0;
      field1637 = 0;

      for (i_8 = 0; i_8 < i_6; i_8++) {
        int i_9 = ints_2[i_8];
        if (i_9 < this.field1601.length) {
          int[] ints_10 = this.field1601[i_9];

          for (i_11 = 0; i_11 < ints_10.length; i_11++) {
            i_12 = ints_10[i_11];
            field1635 += this.field1646[i_12];
            field1636 += this.field1583[i_12];
            field1637 += this.field1584[i_12];
            ++i_7;
          }
        }
      }

      if (i_7 > 0) {
        field1635 = i_3 + field1635 / i_7;
        field1636 = i_4 + field1636 / i_7;
        field1637 = i_5 + field1637 / i_7;
      } else {
        field1635 = i_3;
        field1636 = i_4;
        field1637 = i_5;
      }

    } else {
      int[] ints_18;
      int i_19;
      if (i_1 == 1) {
        for (i_7 = 0; i_7 < i_6; i_7++) {
          i_8 = ints_2[i_7];
          if (i_8 < this.field1601.length) {
            ints_18 = this.field1601[i_8];

            for (i_19 = 0; i_19 < ints_18.length; i_19++) {
              i_11 = ints_18[i_19];
              this.field1646[i_11] += i_3;
              this.field1583[i_11] += i_4;
              this.field1584[i_11] += i_5;
            }
          }
        }

      } else if (i_1 == 2) {
        for (i_7 = 0; i_7 < i_6; i_7++) {
          i_8 = ints_2[i_7];
          if (i_8 < this.field1601.length) {
            ints_18 = this.field1601[i_8];

            for (i_19 = 0; i_19 < ints_18.length; i_19++) {
              i_11 = ints_18[i_19];
              this.field1646[i_11] -= field1635;
              this.field1583[i_11] -= field1636;
              this.field1584[i_11] -= field1637;
              i_12 = (i_3 & 0xff) * 8;
              int i_13 = (i_4 & 0xff) * 8;
              int i_14 = (i_5 & 0xff) * 8;
              int i_15;
              int i_16;
              int i_17;
              if (i_14 != 0) {
                i_15 = field1594[i_14];
                i_16 = field1642[i_14];
                i_17 = i_15 * this.field1583[i_11] + i_16 * this.field1646[i_11] >> 16;
                this.field1583[i_11] =
                    i_16 * this.field1583[i_11] - i_15 * this.field1646[i_11] >> 16;
                this.field1646[i_11] = i_17;
              }

              if (i_12 != 0) {
                i_15 = field1594[i_12];
                i_16 = field1642[i_12];
                i_17 = i_16 * this.field1583[i_11] - i_15 * this.field1584[i_11] >> 16;
                this.field1584[i_11] =
                    i_15 * this.field1583[i_11] + i_16 * this.field1584[i_11] >> 16;
                this.field1583[i_11] = i_17;
              }

              if (i_13 != 0) {
                i_15 = field1594[i_13];
                i_16 = field1642[i_13];
                i_17 = i_15 * this.field1584[i_11] + i_16 * this.field1646[i_11] >> 16;
                this.field1584[i_11] =
                    i_16 * this.field1584[i_11] - i_15 * this.field1646[i_11] >> 16;
                this.field1646[i_11] = i_17;
              }

              this.field1646[i_11] += field1635;
              this.field1583[i_11] += field1636;
              this.field1584[i_11] += field1637;
            }
          }
        }

      } else if (i_1 == 3) {
        for (i_7 = 0; i_7 < i_6; i_7++) {
          i_8 = ints_2[i_7];
          if (i_8 < this.field1601.length) {
            ints_18 = this.field1601[i_8];

            for (i_19 = 0; i_19 < ints_18.length; i_19++) {
              i_11 = ints_18[i_19];
              this.field1646[i_11] -= field1635;
              this.field1583[i_11] -= field1636;
              this.field1584[i_11] -= field1637;
              this.field1646[i_11] = i_3 * this.field1646[i_11] / 128;
              this.field1583[i_11] = i_4 * this.field1583[i_11] / 128;
              this.field1584[i_11] = i_5 * this.field1584[i_11] / 128;
              this.field1646[i_11] += field1635;
              this.field1583[i_11] += field1636;
              this.field1584[i_11] += field1637;
            }
          }
        }

      } else if (i_1 == 5) {
        if (this.field1602 != null && this.field1593 != null) {
          for (i_7 = 0; i_7 < i_6; i_7++) {
            i_8 = ints_2[i_7];
            if (i_8 < this.field1602.length) {
              ints_18 = this.field1602[i_8];

              for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                i_11 = ints_18[i_19];
                i_12 = (this.field1593[i_11] & 0xff) + i_3 * 8;
                if (i_12 < 0) {
                  i_12 = 0;
                } else if (i_12 > 255) {
                  i_12 = 255;
                }

                this.field1593[i_11] = (byte) i_12;
              }
            }
          }
        }

      }
    }
  }

  @ObfuscatedName("g")
  public void method2677() {
    for (int i_1 = 0; i_1 < this.field1581; i_1++) {
      int i_2 = this.field1646[i_1];
      this.field1646[i_1] = this.field1584[i_1];
      this.field1584[i_1] = -i_2;
    }

    this.method2673();
  }

  @ObfuscatedName("m")
  public void method2678() {
    for (int i_1 = 0; i_1 < this.field1581; i_1++) {
      this.field1646[i_1] = -this.field1646[i_1];
      this.field1584[i_1] = -this.field1584[i_1];
    }

    this.method2673();
  }

  @ObfuscatedName("r")
  public void method2679() {
    for (int i_1 = 0; i_1 < this.field1581; i_1++) {
      int i_2 = this.field1584[i_1];
      this.field1584[i_1] = this.field1646[i_1];
      this.field1646[i_1] = -i_2;
    }

    this.method2673();
  }

  @ObfuscatedName("t")
  public void method2680(int i_1) {
    int i_2 = field1594[i_1];
    int i_3 = field1642[i_1];

    for (int i_4 = 0; i_4 < this.field1581; i_4++) {
      int i_5 = i_3 * this.field1583[i_4] - i_2 * this.field1584[i_4] >> 16;
      this.field1584[i_4] = i_2 * this.field1583[i_4] + i_3 * this.field1584[i_4] >> 16;
      this.field1583[i_4] = i_5;
    }

    this.method2673();
  }

  @ObfuscatedName("o")
  public void method2718(int i_1, int i_2, int i_3) {
    for (int i_4 = 0; i_4 < this.field1581; i_4++) {
      this.field1646[i_4] += i_1;
      this.field1583[i_4] += i_2;
      this.field1584[i_4] += i_3;
    }

    this.method2673();
  }

  @ObfuscatedName("y")
  public void method2681(int i_1, int i_2, int i_3) {
    for (int i_4 = 0; i_4 < this.field1581; i_4++) {
      this.field1646[i_4] = this.field1646[i_4] * i_1 / 128;
      this.field1583[i_4] = i_2 * this.field1583[i_4] / 128;
      this.field1584[i_4] = i_3 * this.field1584[i_4] / 128;
    }

    this.method2673();
  }

  @ObfuscatedName("a")
  public final void method2682(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
    field1625[0] = -1;
    if (this.field1633 != 2 && this.field1633 != 1) {
      this.method2671();
    }

    int i_8 = class122.field1687;
    int i_9 = class122.field1689;
    int i_10 = field1594[i_1];
    int i_11 = field1642[i_1];
    int i_12 = field1594[i_2];
    int i_13 = field1642[i_2];
    int i_14 = field1594[i_3];
    int i_15 = field1642[i_3];
    int i_16 = field1594[i_4];
    int i_17 = field1642[i_4];
    int i_18 = i_16 * i_6 + i_17 * i_7 >> 16;

    for (int i_19 = 0; i_19 < this.field1581; i_19++) {
      int i_20 = this.field1646[i_19];
      int i_21 = this.field1583[i_19];
      int i_22 = this.field1584[i_19];
      int i_23;
      if (i_3 != 0) {
        i_23 = i_21 * i_14 + i_20 * i_15 >> 16;
        i_21 = i_21 * i_15 - i_20 * i_14 >> 16;
        i_20 = i_23;
      }

      if (i_1 != 0) {
        i_23 = i_21 * i_11 - i_22 * i_10 >> 16;
        i_22 = i_21 * i_10 + i_22 * i_11 >> 16;
        i_21 = i_23;
      }

      if (i_2 != 0) {
        i_23 = i_22 * i_12 + i_20 * i_13 >> 16;
        i_22 = i_22 * i_13 - i_20 * i_12 >> 16;
        i_20 = i_23;
      }

      i_20 += i_5;
      i_21 += i_6;
      i_22 += i_7;
      i_23 = i_21 * i_17 - i_22 * i_16 >> 16;
      i_22 = i_21 * i_16 + i_22 * i_17 >> 16;
      field1590[i_19] = i_22 - i_18;
      field1582[i_19] = i_20 * class122.field1678 / i_22 + i_8;
      field1619[i_19] = i_23 * class122.field1678 / i_22 + i_9;
      if (this.field1597 > 0) {
        field1589[i_19] = i_20;
        field1577[i_19] = i_23;
        field1623[i_19] = i_22;
      }
    }

    try {
      this.method2685(false, false, false, 0L);
    } catch (Exception ignored) {
    }

  }

  @ObfuscatedName("c")
  public final void method2710(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7,
                               int i_8) {
    field1625[0] = -1;
    if (this.field1633 != 2 && this.field1633 != 1) {
      this.method2671();
    }

    int i_9 = class122.field1687;
    int i_10 = class122.field1689;
    int i_11 = field1594[i_1];
    int i_12 = field1642[i_1];
    int i_13 = field1594[i_2];
    int i_14 = field1642[i_2];
    int i_15 = field1594[i_3];
    int i_16 = field1642[i_3];
    int i_17 = field1594[i_4];
    int i_18 = field1642[i_4];
    int i_19 = i_17 * i_6 + i_18 * i_7 >> 16;

    for (int i_20 = 0; i_20 < this.field1581; i_20++) {
      int i_21 = this.field1646[i_20];
      int i_22 = this.field1583[i_20];
      int i_23 = this.field1584[i_20];
      int i_24;
      if (i_3 != 0) {
        i_24 = i_22 * i_15 + i_21 * i_16 >> 16;
        i_22 = i_22 * i_16 - i_21 * i_15 >> 16;
        i_21 = i_24;
      }

      if (i_1 != 0) {
        i_24 = i_22 * i_12 - i_23 * i_11 >> 16;
        i_23 = i_22 * i_11 + i_23 * i_12 >> 16;
        i_22 = i_24;
      }

      if (i_2 != 0) {
        i_24 = i_23 * i_13 + i_21 * i_14 >> 16;
        i_23 = i_23 * i_14 - i_21 * i_13 >> 16;
        i_21 = i_24;
      }

      i_21 += i_5;
      i_22 += i_6;
      i_23 += i_7;
      i_24 = i_22 * i_18 - i_23 * i_17 >> 16;
      i_23 = i_22 * i_17 + i_23 * i_18 >> 16;
      field1590[i_20] = i_23 - i_19;
      field1582[i_20] = i_9 + i_21 * class122.field1678 / i_8;
      field1619[i_20] = i_10 + i_24 * class122.field1678 / i_8;
      if (this.field1597 > 0) {
        field1589[i_20] = i_21;
        field1577[i_20] = i_24;
        field1623[i_20] = i_23;
      }
    }

    try {
      this.method2685(false, false, false, 0L);
    } catch (Exception ignored) {
    }

  }

  @ObfuscatedName("v")
  final void method2685(boolean bool_1, boolean bool_2, boolean bool_3, long long_4) {
    if (this.field1607 < 1600) {
      int i_6;
      for (i_6 = 0; i_6 < this.field1607; i_6++) {
        field1625[i_6] = 0;
      }

      i_6 = bool_3 ? 20 : 5;

      int i_7;
      int i_8;
      int i_10;
      int i_11;
      int i_12;
      int i_13;
      int i_15;
      int i_16;
      int i_18;
      int i_27;
      for (i_7 = 0; i_7 < this.field1585; i_7++) {
        if (this.field1591[i_7] != -2) {
          i_8 = this.field1586[i_7];
          i_27 = this.field1587[i_7];
          i_10 = this.field1588[i_7];
          i_11 = field1582[i_8];
          i_12 = field1582[i_27];
          i_13 = field1582[i_10];
          int i_28;
          if (!bool_1 || i_11 != -5000 && i_12 != -5000 && i_13 != -5000) {
            if (bool_2 && class228
                .method4494(field1619[i_8], field1619[i_27], field1619[i_10], i_11, i_12, i_13,
                            i_6)) {
              class120.field1647[++class120.field1656 - 1] = long_4;
              bool_2 = false;
            }

            if ((i_11 - i_12) * (field1619[i_10] - field1619[i_27]) - (i_13 - i_12) * (
                field1619[i_8] - field1619[i_27]) > 0) {
              field1626[i_7] = false;
              if (i_11 >= 0 && i_12 >= 0 && i_13 >= 0 && i_11 <= class122.field1688
                  && i_12 <= class122.field1688 && i_13 <= class122.field1688) {
                field1616[i_7] = false;
              } else {
                field1616[i_7] = true;
              }

              i_28 = (field1590[i_8] + field1590[i_27] + field1590[i_10]) / 3 + this.field1618;
              field1592[i_28][field1625[i_28]++] = i_7;
            }
          } else {
            i_28 = field1589[i_8];
            i_15 = field1589[i_27];
            i_16 = field1589[i_10];
            int i_17 = field1577[i_8];
            i_18 = field1577[i_27];
            int i_19 = field1577[i_10];
            int i_20 = field1623[i_8];
            int i_21 = field1623[i_27];
            int i_22 = field1623[i_10];
            i_28 -= i_15;
            i_16 -= i_15;
            i_17 -= i_18;
            i_19 -= i_18;
            i_20 -= i_21;
            i_22 -= i_21;
            int i_23 = i_17 * i_22 - i_20 * i_19;
            int i_24 = i_20 * i_16 - i_28 * i_22;
            int i_25 = i_28 * i_19 - i_17 * i_16;
            if (i_15 * i_23 + i_18 * i_24 + i_21 * i_25 > 0) {
              field1626[i_7] = true;
              int i_26 = (field1590[i_8] + field1590[i_27] + field1590[i_10]) / 3 + this.field1618;
              field1592[i_26][field1625[i_26]++] = i_7;
            }
          }
        }
      }

      int[] ints_9;
      if (this.field1645 == null) {
        for (i_7 = this.field1607 - 1; i_7 >= 0; --i_7) {
          i_8 = field1625[i_7];
          if (i_8 > 0) {
            ints_9 = field1592[i_7];

            for (i_10 = 0; i_10 < i_8; i_10++) {
              this.method2686(ints_9[i_10]);
            }
          }
        }

      } else {
        for (i_7 = 0; i_7 < 12; i_7++) {
          field1638[i_7] = 0;
          field1631[i_7] = 0;
        }

        for (i_7 = this.field1607 - 1; i_7 >= 0; --i_7) {
          i_8 = field1625[i_7];
          if (i_8 > 0) {
            ints_9 = field1592[i_7];

            for (i_10 = 0; i_10 < i_8; i_10++) {
              i_11 = ints_9[i_10];
              byte b_32 = this.field1645[i_11];
              i_13 = field1638[b_32]++;
              field1640[b_32][i_13] = i_11;
              if (b_32 < 10) {
                field1631[b_32] += i_7;
              } else if (b_32 == 10) {
                field1608[i_13] = i_7;
              } else {
                field1595[i_13] = i_7;
              }
            }
          }
        }

        i_7 = 0;
        if (field1638[1] > 0 || field1638[2] > 0) {
          i_7 = (field1631[1] + field1631[2]) / (field1638[1] + field1638[2]);
        }

        i_8 = 0;
        if (field1638[3] > 0 || field1638[4] > 0) {
          i_8 = (field1631[3] + field1631[4]) / (field1638[3] + field1638[4]);
        }

        i_27 = 0;
        if (field1638[6] > 0 || field1638[8] > 0) {
          i_27 = (field1631[8] + field1631[6]) / (field1638[8] + field1638[6]);
        }

        i_11 = 0;
        i_12 = field1638[10];
        int[] ints_29 = field1640[10];
        int[] ints_30 = field1608;
        if (i_11 == i_12) {
          i_11 = 0;
          i_12 = field1638[11];
          ints_29 = field1640[11];
          ints_30 = field1595;
        }

        if (i_11 < i_12) {
          i_10 = ints_30[i_11];
        } else {
          i_10 = -1000;
        }

        for (i_15 = 0; i_15 < 10; i_15++) {
          while (i_15 == 0 && i_10 > i_7) {
            this.method2686(ints_29[i_11++]);
            if (i_11 == i_12 && ints_29 != field1640[11]) {
              i_11 = 0;
              i_12 = field1638[11];
              ints_29 = field1640[11];
              ints_30 = field1595;
            }

            if (i_11 < i_12) {
              i_10 = ints_30[i_11];
            } else {
              i_10 = -1000;
            }
          }

          while (i_15 == 3 && i_10 > i_8) {
            this.method2686(ints_29[i_11++]);
            if (i_11 == i_12 && ints_29 != field1640[11]) {
              i_11 = 0;
              i_12 = field1638[11];
              ints_29 = field1640[11];
              ints_30 = field1595;
            }

            if (i_11 < i_12) {
              i_10 = ints_30[i_11];
            } else {
              i_10 = -1000;
            }
          }

          while (i_15 == 5 && i_10 > i_27) {
            this.method2686(ints_29[i_11++]);
            if (i_11 == i_12 && ints_29 != field1640[11]) {
              i_11 = 0;
              i_12 = field1638[11];
              ints_29 = field1640[11];
              ints_30 = field1595;
            }

            if (i_11 < i_12) {
              i_10 = ints_30[i_11];
            } else {
              i_10 = -1000;
            }
          }

          i_16 = field1638[i_15];
          int[] ints_31 = field1640[i_15];

          for (i_18 = 0; i_18 < i_16; i_18++) {
            this.method2686(ints_31[i_18]);
          }
        }

        while (i_10 != -1000) {
          this.method2686(ints_29[i_11++]);
          if (i_11 == i_12 && ints_29 != field1640[11]) {
            i_11 = 0;
            ints_29 = field1640[11];
            i_12 = field1638[11];
            ints_30 = field1595;
          }

          if (i_11 < i_12) {
            i_10 = ints_30[i_11];
          } else {
            i_10 = -1000;
          }
        }

      }
    }
  }

  @ObfuscatedName("af")
  final void method2686(int i_1) {
    if (field1626[i_1]) {
      this.method2687(i_1);
    } else {
      int i_2 = this.field1586[i_1];
      int i_3 = this.field1587[i_1];
      int i_4 = this.field1588[i_1];
      class122.field1677 = field1616[i_1];
      if (this.field1593 == null) {
        class122.field1671 = 0;
      } else {
        class122.field1671 = this.field1593[i_1] & 0xff;
      }

      if (this.field1604 != null && this.field1604[i_1] != -1) {
        int i_5;
        int i_6;
        int i_7;
        if (this.field1617 != null && this.field1617[i_1] != -1) {
          int i_8 = this.field1617[i_1] & 0xff;
          i_5 = this.field1621[i_8];
          i_6 = this.field1599[i_8];
          i_7 = this.field1600[i_8];
        } else {
          i_5 = i_2;
          i_6 = i_3;
          i_7 = i_4;
        }

        if (this.field1591[i_1] == -1) {
          class122.method2804(field1619[i_2], field1619[i_3], field1619[i_4], field1582[i_2],
                              field1582[i_3], field1582[i_4], this.field1615[i_1],
                              this.field1615[i_1], this.field1615[i_1], field1589[i_5],
                              field1589[i_6], field1589[i_7], field1577[i_5], field1577[i_6],
                              field1577[i_7], field1623[i_5], field1623[i_6], field1623[i_7],
                              this.field1604[i_1]);
        } else {
          class122.method2804(field1619[i_2], field1619[i_3], field1619[i_4], field1582[i_2],
                              field1582[i_3], field1582[i_4], this.field1615[i_1],
                              this.field1620[i_1], this.field1591[i_1], field1589[i_5],
                              field1589[i_6], field1589[i_7], field1577[i_5], field1577[i_6],
                              field1577[i_7], field1623[i_5], field1623[i_6], field1623[i_7],
                              this.field1604[i_1]);
        }
      } else if (this.field1591[i_1] == -1) {
        class122.method2796(field1619[i_2], field1619[i_3], field1619[i_4], field1582[i_2],
                            field1582[i_3], field1582[i_4], field1643[this.field1615[i_1]]);
      } else {
        class122.method2794(field1619[i_2], field1619[i_3], field1619[i_4], field1582[i_2],
                            field1582[i_3], field1582[i_4], this.field1615[i_1],
                            this.field1620[i_1], this.field1591[i_1]);
      }

    }
  }

  @ObfuscatedName("ah")
  final void method2687(int i_1) {
    int i_2 = class122.field1687;
    int i_3 = class122.field1689;
    int i_4 = 0;
    int i_5 = this.field1586[i_1];
    int i_6 = this.field1587[i_1];
    int i_7 = this.field1588[i_1];
    int i_8 = field1623[i_5];
    int i_9 = field1623[i_6];
    int i_10 = field1623[i_7];
    if (this.field1593 == null) {
      class122.field1671 = 0;
    } else {
      class122.field1671 = this.field1593[i_1] & 0xff;
    }

    int i_11;
    int i_12;
    int i_13;
    int i_14;
    if (i_8 >= 50) {
      field1632[i_4] = field1582[i_5];
      field1630[i_4] = field1619[i_5];
      field1634[i_4++] = this.field1615[i_1];
    } else {
      i_11 = field1589[i_5];
      i_12 = field1577[i_5];
      i_13 = this.field1615[i_1];
      if (i_10 >= 50) {
        i_14 = field1598[i_10 - i_8] * (50 - i_8);
        field1632[i_4] =
            i_2 + class122.field1678 * (i_11 + ((field1589[i_7] - i_11) * i_14 >> 16)) / 50;
        field1630[i_4] =
            i_3 + class122.field1678 * (i_12 + ((field1577[i_7] - i_12) * i_14 >> 16)) / 50;
        field1634[i_4++] = i_13 + ((this.field1591[i_1] - i_13) * i_14 >> 16);
      }

      if (i_9 >= 50) {
        i_14 = field1598[i_9 - i_8] * (50 - i_8);
        field1632[i_4] =
            i_2 + class122.field1678 * (i_11 + ((field1589[i_6] - i_11) * i_14 >> 16)) / 50;
        field1630[i_4] =
            i_3 + class122.field1678 * (i_12 + ((field1577[i_6] - i_12) * i_14 >> 16)) / 50;
        field1634[i_4++] = i_13 + ((this.field1620[i_1] - i_13) * i_14 >> 16);
      }
    }

    if (i_9 >= 50) {
      field1632[i_4] = field1582[i_6];
      field1630[i_4] = field1619[i_6];
      field1634[i_4++] = this.field1620[i_1];
    } else {
      i_11 = field1589[i_6];
      i_12 = field1577[i_6];
      i_13 = this.field1620[i_1];
      if (i_8 >= 50) {
        i_14 = field1598[i_8 - i_9] * (50 - i_9);
        field1632[i_4] =
            i_2 + class122.field1678 * (i_11 + ((field1589[i_5] - i_11) * i_14 >> 16)) / 50;
        field1630[i_4] =
            i_3 + class122.field1678 * (i_12 + ((field1577[i_5] - i_12) * i_14 >> 16)) / 50;
        field1634[i_4++] = i_13 + ((this.field1615[i_1] - i_13) * i_14 >> 16);
      }

      if (i_10 >= 50) {
        i_14 = field1598[i_10 - i_9] * (50 - i_9);
        field1632[i_4] =
            i_2 + class122.field1678 * (i_11 + ((field1589[i_7] - i_11) * i_14 >> 16)) / 50;
        field1630[i_4] =
            i_3 + class122.field1678 * (i_12 + ((field1577[i_7] - i_12) * i_14 >> 16)) / 50;
        field1634[i_4++] = i_13 + ((this.field1591[i_1] - i_13) * i_14 >> 16);
      }
    }

    if (i_10 >= 50) {
      field1632[i_4] = field1582[i_7];
      field1630[i_4] = field1619[i_7];
      field1634[i_4++] = this.field1591[i_1];
    } else {
      i_11 = field1589[i_7];
      i_12 = field1577[i_7];
      i_13 = this.field1591[i_1];
      if (i_9 >= 50) {
        i_14 = field1598[i_9 - i_10] * (50 - i_10);
        field1632[i_4] =
            i_2 + class122.field1678 * (i_11 + ((field1589[i_6] - i_11) * i_14 >> 16)) / 50;
        field1630[i_4] =
            i_3 + class122.field1678 * (i_12 + ((field1577[i_6] - i_12) * i_14 >> 16)) / 50;
        field1634[i_4++] = i_13 + ((this.field1620[i_1] - i_13) * i_14 >> 16);
      }

      if (i_8 >= 50) {
        i_14 = field1598[i_8 - i_10] * (50 - i_10);
        field1632[i_4] =
            i_2 + class122.field1678 * (i_11 + ((field1589[i_5] - i_11) * i_14 >> 16)) / 50;
        field1630[i_4] =
            i_3 + class122.field1678 * (i_12 + ((field1577[i_5] - i_12) * i_14 >> 16)) / 50;
        field1634[i_4++] = i_13 + ((this.field1615[i_1] - i_13) * i_14 >> 16);
      }
    }

    i_11 = field1632[0];
    i_12 = field1632[1];
    i_13 = field1632[2];
    i_14 = field1630[0];
    int i_15 = field1630[1];
    int i_16 = field1630[2];
    class122.field1677 = false;
    int i_17;
    int i_18;
    int i_19;
    int i_20;
    if (i_4 == 3) {
      if (i_11 < 0 || i_12 < 0 || i_13 < 0 || i_11 > class122.field1688 || i_12 > class122.field1688
          || i_13 > class122.field1688) {
        class122.field1677 = true;
      }

      if (this.field1604 != null && this.field1604[i_1] != -1) {
        if (this.field1617 != null && this.field1617[i_1] != -1) {
          i_20 = this.field1617[i_1] & 0xff;
          i_17 = this.field1621[i_20];
          i_18 = this.field1599[i_20];
          i_19 = this.field1600[i_20];
        } else {
          i_17 = i_5;
          i_18 = i_6;
          i_19 = i_7;
        }

        if (this.field1591[i_1] == -1) {
          class122.method2804(i_14, i_15, i_16, i_11, i_12, i_13, this.field1615[i_1],
                              this.field1615[i_1], this.field1615[i_1], field1589[i_17],
                              field1589[i_18], field1589[i_19], field1577[i_17], field1577[i_18],
                              field1577[i_19], field1623[i_17], field1623[i_18], field1623[i_19],
                              this.field1604[i_1]);
        } else {
          class122.method2804(i_14, i_15, i_16, i_11, i_12, i_13, field1634[0], field1634[1],
                              field1634[2], field1589[i_17], field1589[i_18], field1589[i_19],
                              field1577[i_17], field1577[i_18], field1577[i_19], field1623[i_17],
                              field1623[i_18], field1623[i_19], this.field1604[i_1]);
        }
      } else if (this.field1591[i_1] == -1) {
        class122.method2796(i_14, i_15, i_16, i_11, i_12, i_13, field1643[this.field1615[i_1]]);
      } else {
        class122.method2794(i_14, i_15, i_16, i_11, i_12, i_13, field1634[0], field1634[1],
                            field1634[2]);
      }
    }

    if (i_4 == 4) {
      if (i_11 < 0 || i_12 < 0 || i_13 < 0 || i_11 > class122.field1688 || i_12 > class122.field1688
          || i_13 > class122.field1688 || field1632[3] < 0 || field1632[3] > class122.field1688) {
        class122.field1677 = true;
      }

      if (this.field1604 != null && this.field1604[i_1] != -1) {
        if (this.field1617 != null && this.field1617[i_1] != -1) {
          i_20 = this.field1617[i_1] & 0xff;
          i_17 = this.field1621[i_20];
          i_18 = this.field1599[i_20];
          i_19 = this.field1600[i_20];
        } else {
          i_17 = i_5;
          i_18 = i_6;
          i_19 = i_7;
        }

        short s_21 = this.field1604[i_1];
        if (this.field1591[i_1] == -1) {
          class122.method2804(i_14, i_15, i_16, i_11, i_12, i_13, this.field1615[i_1],
                              this.field1615[i_1], this.field1615[i_1], field1589[i_17],
                              field1589[i_18], field1589[i_19], field1577[i_17], field1577[i_18],
                              field1577[i_19], field1623[i_17], field1623[i_18], field1623[i_19],
                              s_21);
          class122
              .method2804(i_14, i_16, field1630[3], i_11, i_13, field1632[3], this.field1615[i_1],
                          this.field1615[i_1], this.field1615[i_1], field1589[i_17],
                          field1589[i_18], field1589[i_19], field1577[i_17], field1577[i_18],
                          field1577[i_19], field1623[i_17], field1623[i_18], field1623[i_19], s_21);
        } else {
          class122.method2804(i_14, i_15, i_16, i_11, i_12, i_13, field1634[0], field1634[1],
                              field1634[2], field1589[i_17], field1589[i_18], field1589[i_19],
                              field1577[i_17], field1577[i_18], field1577[i_19], field1623[i_17],
                              field1623[i_18], field1623[i_19], s_21);
          class122.method2804(i_14, i_16, field1630[3], i_11, i_13, field1632[3], field1634[0],
                              field1634[2], field1634[3], field1589[i_17], field1589[i_18],
                              field1589[i_19], field1577[i_17], field1577[i_18], field1577[i_19],
                              field1623[i_17], field1623[i_18], field1623[i_19], s_21);
        }
      } else if (this.field1591[i_1] == -1) {
        i_17 = field1643[this.field1615[i_1]];
        class122.method2796(i_14, i_15, i_16, i_11, i_12, i_13, i_17);
        class122.method2796(i_14, i_16, field1630[3], i_11, i_13, field1632[3], i_17);
      } else {
        class122.method2794(i_14, i_15, i_16, i_11, i_12, i_13, field1634[0], field1634[1],
                            field1634[2]);
        class122.method2794(i_14, i_16, field1630[3], i_11, i_13, field1632[3], field1634[0],
                            field1634[2], field1634[3]);
      }
    }

  }

  @ObfuscatedName("cx")
  void vmethod3063(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8,
                   long long_9) {
    field1625[0] = -1;
    if (this.field1633 != 1) {
      this.method2670();
    }

    this.method2669(i_1);
    int i_11 = i_5 * i_8 - i_4 * i_6 >> 16;
    int i_12 = i_2 * i_7 + i_3 * i_11 >> 16;
    int i_13 = i_3 * this.field1606 >> 16;
    int i_14 = i_12 + i_13;
    if (i_14 > 50 && i_12 < 3500) {
      int i_15 = i_8 * i_4 + i_5 * i_6 >> 16;
      int i_16 = (i_15 - this.field1606) * class122.field1678;
      if (i_16 / i_14 < class122.field1684) {
        int i_17 = (i_15 + this.field1606) * class122.field1678;
        if (i_17 / i_14 > class122.field1683) {
          int i_18 = i_3 * i_7 - i_11 * i_2 >> 16;
          int i_19 = i_2 * this.field1606 >> 16;
          int i_20 = (i_18 + i_19) * class122.field1678;
          if (i_20 / i_14 > class122.field1685) {
            int i_21 = (i_3 * super.field1781 >> 16) + i_19;
            int i_22 = (i_18 - i_21) * class122.field1678;
            if (i_22 / i_14 < class122.field1686) {
              int i_23 = i_13 + (i_2 * super.field1781 >> 16);
              boolean bool_24 = false;
              boolean bool_25 = false;
              if (i_12 - i_23 <= 50) {
                bool_25 = true;
              }

              boolean bool_26 = bool_25 || this.field1597 > 0;
              int i_27 = class81.method1884();
              int i_28 = class120.field1649;
              boolean bool_30 = class165.method3437();
              boolean bool_32 = long_9 != 0L;
              boolean bool_33;
              if (bool_32) {
                bool_33 = (int) (long_9 >>> 16 & 0x1L) == 1;
                bool_32 = !bool_33;
              }

              bool_33 = false;
              int i_37;
              int i_38;
              int i_39;
              int i_40;
              int i_41;
              int i_42;
              int i_46;
              int i_52;
              if (bool_32 && bool_30) {
                boolean bool_34 = false;
                if (field1612) {
                  boolean bool_35;
                  if (!class165.method3437()) {
                    bool_35 = false;
                  } else {
                    class4.method56();
                    i_37 = this.field1605 + i_6;
                    i_38 = i_7 + this.field1610;
                    i_39 = i_8 + this.field1611;
                    i_40 = this.field1614;
                    i_41 = this.field1613;
                    i_42 = this.field1629;
                    int i_43 = class120.field1657 - i_37;
                    int i_44 = class120.field1659 - i_38;
                    int i_45 = class177.field2283 - i_39;
                    if (Math.abs(i_43) > i_40 + class98.field1335) {
                      bool_35 = false;
                    } else if (Math.abs(i_44) > i_41 + class120.field1655) {
                      bool_35 = false;
                    } else if (Math.abs(i_45) > i_42 + class312.field3757) {
                      bool_35 = false;
                    } else if (Math.abs(i_45 * class120.field1651 - i_44 * class120.field1654)
                        > i_42 * class120.field1655 + i_41 * class312.field3757) {
                      bool_35 = false;
                    } else if (Math.abs(i_43 * class120.field1654 - i_45 * class303.field3721)
                        > i_42 * class98.field1335 + i_40 * class312.field3757) {
                      bool_35 = false;
                    } else if (Math.abs(i_44 * class303.field3721 - i_43 * class120.field1651)
                        > i_40 * class120.field1655 + i_41 * class98.field1335) {
                      bool_35 = false;
                    } else {
                      bool_35 = true;
                    }
                  }

                  bool_34 = bool_35;
                } else {
                  i_52 = i_12 - i_13;
                  if (i_52 <= 50) {
                    i_52 = 50;
                  }

                  if (i_15 > 0) {
                    i_16 /= i_14;
                    i_17 /= i_52;
                  } else {
                    i_17 /= i_14;
                    i_16 /= i_52;
                  }

                  if (i_18 > 0) {
                    i_22 /= i_14;
                    i_20 /= i_52;
                  } else {
                    i_20 /= i_14;
                    i_22 /= i_52;
                  }

                  i_46 = i_27 - class122.field1687;
                  i_37 = i_28 - class122.field1689;
                  if (i_46 > i_16 && i_46 < i_17 && i_37 > i_22 && i_37 < i_20) {
                    bool_34 = true;
                  }
                }

                if (bool_34) {
                  if (this.field1603) {
                    class120.field1647[++class120.field1656 - 1] = long_9;
                  } else {
                    bool_33 = true;
                  }
                }
              }

              int i_51 = class122.field1687;
              i_52 = class122.field1689;
              i_46 = 0;
              i_37 = 0;
              if (i_1 != 0) {
                i_46 = field1594[i_1];
                i_37 = field1642[i_1];
              }

              for (i_38 = 0; i_38 < this.field1581; i_38++) {
                i_39 = this.field1646[i_38];
                i_40 = this.field1583[i_38];
                i_41 = this.field1584[i_38];
                if (i_1 != 0) {
                  i_42 = i_41 * i_46 + i_39 * i_37 >> 16;
                  i_41 = i_41 * i_37 - i_39 * i_46 >> 16;
                  i_39 = i_42;
                }

                i_39 += i_6;
                i_40 += i_7;
                i_41 += i_8;
                i_42 = i_41 * i_4 + i_5 * i_39 >> 16;
                i_41 = i_5 * i_41 - i_39 * i_4 >> 16;
                i_39 = i_42;
                i_42 = i_3 * i_40 - i_41 * i_2 >> 16;
                i_41 = i_40 * i_2 + i_3 * i_41 >> 16;
                field1590[i_38] = i_41 - i_12;
                if (i_41 >= 50) {
                  field1582[i_38] = i_39 * class122.field1678 / i_41 + i_51;
                  field1619[i_38] = i_42 * class122.field1678 / i_41 + i_52;
                } else {
                  field1582[i_38] = -5000;
                  bool_24 = true;
                }

                if (bool_26) {
                  field1589[i_38] = i_39;
                  field1577[i_38] = i_42;
                  field1623[i_38] = i_41;
                }
              }

              try {
                this.method2685(bool_24, bool_33, this.field1603, long_9);
              } catch (Exception ignored) {
              }

            }
          }
        }
      }
    }
  }

}
