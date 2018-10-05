package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class113 extends class127 {

  @ObfuscatedName("ai")
  static int[] field1494 = new int[10000];
  @ObfuscatedName("ac")
  static int[] field1475 = new int[10000];
  @ObfuscatedName("ap")
  static int field1474 = 0;
  @ObfuscatedName("aa")
  static int[] field1497;
  @ObfuscatedName("ar")
  static int[] field1495;

  static {
    field1497 = class122.field1681;
    field1495 = class122.field1693;
  }

  @ObfuscatedName("ah")
  public short field1486;
  @ObfuscatedName("ab")
  public short field1487;
  @ObfuscatedName("z")
  int field1461 = 0;
  @ObfuscatedName("u")
  int field1463 = 0;
  @ObfuscatedName("g")
  byte field1473 = 0;
  @ObfuscatedName("aw")
  boolean field1488 = false;
  @ObfuscatedName("m")
  int field1484;
  @ObfuscatedName("w")
  int[] field1460;
  @ObfuscatedName("s")
  int[] field1490;
  @ObfuscatedName("l")
  int[] field1462;
  @ObfuscatedName("a")
  int[] field1479;
  @ObfuscatedName("q")
  int[] field1477;
  @ObfuscatedName("k")
  int[] field1465;
  @ObfuscatedName("i")
  int[] field1466;
  @ObfuscatedName("x")
  byte[] field1467;
  @ObfuscatedName("e")
  byte[] field1468;
  @ObfuscatedName("p")
  byte[] field1469;
  @ObfuscatedName("j")
  int[] field1478;
  @ObfuscatedName("f")
  short[] field1472;
  @ObfuscatedName("b")
  byte[] field1470;
  @ObfuscatedName("n")
  short[] field1471;
  @ObfuscatedName("r")
  byte[] field1459;
  @ObfuscatedName("t")
  short[] field1476;
  @ObfuscatedName("o")
  short[] field1491;
  @ObfuscatedName("y")
  short[] field1464;
  @ObfuscatedName("d")
  int[][] field1481;
  @ObfuscatedName("h")
  int[][] field1482;
  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "[Ldw;"
  )
  class121[] field1496;
  @ObfuscatedName("c")
  @ObfuscatedSignature(
      signature = "[Ldj;"
  )
  class129[] field1483;
  @ObfuscatedName("af")
  @ObfuscatedSignature(
      signature = "[Ldw;"
  )
  class121[] field1485;
  @ObfuscatedName("ak")
  int field1489;
  @ObfuscatedName("as")
  int field1480;
  @ObfuscatedName("an")
  int field1492;
  @ObfuscatedName("ao")
  int field1498;
  @ObfuscatedName("at")
  int field1493;

  class113() {
  }

  @ObfuscatedSignature(
      signature = "([Ldb;I)V"
  )
  public class113(class113[] arr_1, int i_2) {
    boolean bool_3 = false;
    boolean bool_4 = false;
    boolean bool_5 = false;
    boolean bool_6 = false;
    boolean bool_7 = false;
    boolean bool_8 = false;
    this.field1461 = 0;
    this.field1463 = 0;
    this.field1484 = 0;
    this.field1473 = -1;

    int i_9;
    class113 class113_10;
    for (i_9 = 0; i_9 < i_2; i_9++) {
      class113_10 = arr_1[i_9];
      if (class113_10 != null) {
        this.field1461 += class113_10.field1461;
        this.field1463 += class113_10.field1463;
        this.field1484 += class113_10.field1484;
        if (class113_10.field1468 != null) {
          bool_4 = true;
        } else {
          if (this.field1473 == -1) {
            this.field1473 = class113_10.field1473;
          }

          if (this.field1473 != class113_10.field1473) {
            bool_4 = true;
          }
        }

        bool_3 |= class113_10.field1467 != null;
        bool_5 |= class113_10.field1469 != null;
        bool_6 |= class113_10.field1478 != null;
        bool_7 |= class113_10.field1472 != null;
        bool_8 |= class113_10.field1470 != null;
      }
    }

    this.field1460 = new int[this.field1461];
    this.field1490 = new int[this.field1461];
    this.field1462 = new int[this.field1461];
    this.field1479 = new int[this.field1461];
    this.field1477 = new int[this.field1463];
    this.field1465 = new int[this.field1463];
    this.field1466 = new int[this.field1463];
    if (bool_3) {
      this.field1467 = new byte[this.field1463];
    }

    if (bool_4) {
      this.field1468 = new byte[this.field1463];
    }

    if (bool_5) {
      this.field1469 = new byte[this.field1463];
    }

    if (bool_6) {
      this.field1478 = new int[this.field1463];
    }

    if (bool_7) {
      this.field1472 = new short[this.field1463];
    }

    if (bool_8) {
      this.field1470 = new byte[this.field1463];
    }

    this.field1471 = new short[this.field1463];
    if (this.field1484 > 0) {
      this.field1459 = new byte[this.field1484];
      this.field1476 = new short[this.field1484];
      this.field1491 = new short[this.field1484];
      this.field1464 = new short[this.field1484];
    }

    this.field1461 = 0;
    this.field1463 = 0;
    this.field1484 = 0;

    for (i_9 = 0; i_9 < i_2; i_9++) {
      class113_10 = arr_1[i_9];
      if (class113_10 != null) {
        int i_11;
        for (i_11 = 0; i_11 < class113_10.field1463; i_11++) {
          if (bool_3 && class113_10.field1467 != null) {
            this.field1467[this.field1463] = class113_10.field1467[i_11];
          }

          if (bool_4) {
            if (class113_10.field1468 != null) {
              this.field1468[this.field1463] = class113_10.field1468[i_11];
            } else {
              this.field1468[this.field1463] = class113_10.field1473;
            }
          }

          if (bool_5 && class113_10.field1469 != null) {
            this.field1469[this.field1463] = class113_10.field1469[i_11];
          }

          if (bool_6 && class113_10.field1478 != null) {
            this.field1478[this.field1463] = class113_10.field1478[i_11];
          }

          if (bool_7) {
            if (class113_10.field1472 != null) {
              this.field1472[this.field1463] = class113_10.field1472[i_11];
            } else {
              this.field1472[this.field1463] = -1;
            }
          }

          if (bool_8) {
            if (class113_10.field1470 != null && class113_10.field1470[i_11] != -1) {
              this.field1470[this.field1463] = (byte) (this.field1484
                  + class113_10.field1470[i_11]);
            } else {
              this.field1470[this.field1463] = -1;
            }
          }

          this.field1471[this.field1463] = class113_10.field1471[i_11];
          this.field1477[this.field1463] = this
              .method2572(class113_10, class113_10.field1477[i_11]);
          this.field1465[this.field1463] = this
              .method2572(class113_10, class113_10.field1465[i_11]);
          this.field1466[this.field1463] = this
              .method2572(class113_10, class113_10.field1466[i_11]);
          ++this.field1463;
        }

        for (i_11 = 0; i_11 < class113_10.field1484; i_11++) {
          byte b_12 = this.field1459[this.field1484] = class113_10.field1459[i_11];
          if (b_12 == 0) {
            this.field1476[this.field1484] = (short) this
                .method2572(class113_10, class113_10.field1476[i_11]);
            this.field1491[this.field1484] = (short) this
                .method2572(class113_10, class113_10.field1491[i_11]);
            this.field1464[this.field1484] = (short) this
                .method2572(class113_10, class113_10.field1464[i_11]);
          }

          ++this.field1484;
        }
      }
    }

  }

  class113(byte[] bytes_1) {
    if (bytes_1[bytes_1.length - 1] == -1 && bytes_1[bytes_1.length - 2] == -1) {
      this.method2632(bytes_1);
    } else {
      this.method2570(bytes_1);
    }

  }

  @ObfuscatedSignature(
      signature = "(Ldb;ZZZZ)V",
      garbageValue = "1"
  )
  public class113(class113 class113_1, boolean bool_2, boolean bool_3, boolean bool_4,
                  boolean bool_5) {
    this.field1461 = class113_1.field1461;
    this.field1463 = class113_1.field1463;
    this.field1484 = class113_1.field1484;
    int i_6;
    if (bool_2) {
      this.field1460 = class113_1.field1460;
      this.field1490 = class113_1.field1490;
      this.field1462 = class113_1.field1462;
    } else {
      this.field1460 = new int[this.field1461];
      this.field1490 = new int[this.field1461];
      this.field1462 = new int[this.field1461];

      for (i_6 = 0; i_6 < this.field1461; i_6++) {
        this.field1460[i_6] = class113_1.field1460[i_6];
        this.field1490[i_6] = class113_1.field1490[i_6];
        this.field1462[i_6] = class113_1.field1462[i_6];
      }
    }

    if (bool_3) {
      this.field1471 = class113_1.field1471;
    } else {
      this.field1471 = new short[this.field1463];

      for (i_6 = 0; i_6 < this.field1463; i_6++) {
        this.field1471[i_6] = class113_1.field1471[i_6];
      }
    }

    if (!bool_4 && class113_1.field1472 != null) {
      this.field1472 = new short[this.field1463];

      for (i_6 = 0; i_6 < this.field1463; i_6++) {
        this.field1472[i_6] = class113_1.field1472[i_6];
      }
    } else {
      this.field1472 = class113_1.field1472;
    }

    this.field1469 = class113_1.field1469;
    this.field1477 = class113_1.field1477;
    this.field1465 = class113_1.field1465;
    this.field1466 = class113_1.field1466;
    this.field1467 = class113_1.field1467;
    this.field1468 = class113_1.field1468;
    this.field1470 = class113_1.field1470;
    this.field1473 = class113_1.field1473;
    this.field1459 = class113_1.field1459;
    this.field1476 = class113_1.field1476;
    this.field1491 = class113_1.field1491;
    this.field1464 = class113_1.field1464;
    this.field1479 = class113_1.field1479;
    this.field1478 = class113_1.field1478;
    this.field1481 = class113_1.field1481;
    this.field1482 = class113_1.field1482;
    this.field1496 = class113_1.field1496;
    this.field1483 = class113_1.field1483;
    this.field1485 = class113_1.field1485;
    this.field1486 = class113_1.field1486;
    this.field1487 = class113_1.field1487;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;II)Ldb;"
  )
  public static class113 method2568(AbstractPack class247_0, int i_1, int i_2) {
    byte[] bytes_3 = class247_0.method4625(i_1, i_2);
    return bytes_3 == null ? null : new class113(bytes_3);
  }

  @ObfuscatedName("c")
  @ObfuscatedSignature(
      signature = "(Ldb;Ldb;IIIZ)V"
  )
  static void method2588(class113 class113_0, class113 class113_1, int i_2, int i_3, int i_4,
                         boolean bool_5) {
    class113_0.method2627();
    class113_0.method2585();
    class113_1.method2627();
    class113_1.method2585();
    ++field1474;
    int i_6 = 0;
    int[] ints_7 = class113_1.field1460;
    int i_8 = class113_1.field1461;

    int i_9;
    for (i_9 = 0; i_9 < class113_0.field1461; i_9++) {
      class121 class121_10 = class113_0.field1496[i_9];
      if (class121_10.field1666 != 0) {
        int i_11 = class113_0.field1490[i_9] - i_3;
        if (i_11 <= class113_1.field1489) {
          int i_12 = class113_0.field1460[i_9] - i_2;
          if (i_12 >= class113_1.field1480 && i_12 <= class113_1.field1492) {
            int i_13 = class113_0.field1462[i_9] - i_4;
            if (i_13 >= class113_1.field1493 && i_13 <= class113_1.field1498) {
              for (int i_14 = 0; i_14 < i_8; i_14++) {
                class121 class121_15 = class113_1.field1496[i_14];
                if (i_12 == ints_7[i_14] && i_13 == class113_1.field1462[i_14]
                    && i_11 == class113_1.field1490[i_14] && class121_15.field1666 != 0) {
                  if (class113_0.field1485 == null) {
                    class113_0.field1485 = new class121[class113_0.field1461];
                  }

                  if (class113_1.field1485 == null) {
                    class113_1.field1485 = new class121[i_8];
                  }

                  class121 class121_16 = class113_0.field1485[i_9];
                  if (class121_16 == null) {
                    class121_16 = class113_0.field1485[i_9] = new class121(class121_10);
                  }

                  class121 class121_17 = class113_1.field1485[i_14];
                  if (class121_17 == null) {
                    class121_17 = class113_1.field1485[i_14] = new class121(class121_15);
                  }

                  class121_16.field1665 += class121_15.field1665;
                  class121_16.field1661 += class121_15.field1661;
                  class121_16.field1662 += class121_15.field1662;
                  class121_16.field1666 += class121_15.field1666;
                  class121_17.field1665 += class121_10.field1665;
                  class121_17.field1661 += class121_10.field1661;
                  class121_17.field1662 += class121_10.field1662;
                  class121_17.field1666 += class121_10.field1666;
                  ++i_6;
                  field1494[i_9] = field1474;
                  field1475[i_14] = field1474;
                }
              }
            }
          }
        }
      }
    }

    if (i_6 >= 3 && bool_5) {
      for (i_9 = 0; i_9 < class113_0.field1463; i_9++) {
        if (field1494[class113_0.field1477[i_9]] == field1474
            && field1494[class113_0.field1465[i_9]] == field1474
            && field1494[class113_0.field1466[i_9]] == field1474) {
          if (class113_0.field1467 == null) {
            class113_0.field1467 = new byte[class113_0.field1463];
          }

          class113_0.field1467[i_9] = 2;
        }
      }

      for (i_9 = 0; i_9 < class113_1.field1463; i_9++) {
        if (field1474 == field1475[class113_1.field1477[i_9]]
            && field1474 == field1475[class113_1.field1465[i_9]]
            && field1474 == field1475[class113_1.field1466[i_9]]) {
          if (class113_1.field1467 == null) {
            class113_1.field1467 = new byte[class113_1.field1463];
          }

          class113_1.field1467[i_9] = 2;
        }
      }

    }
  }

  @ObfuscatedName("af")
  static final int method2590(int i_0, int i_1) {
    i_1 = (i_0 & 0x7f) * i_1 >> 7;
    if (i_1 < 2) {
      i_1 = 2;
    } else if (i_1 > 126) {
      i_1 = 126;
    }

    return (i_0 & 0xff80) + i_1;
  }

  @ObfuscatedName("ah")
  static final int method2591(int i_0) {
    if (i_0 < 2) {
      i_0 = 2;
    } else if (i_0 > 126) {
      i_0 = 126;
    }

    return i_0;
  }

  @ObfuscatedName("w")
  void method2632(byte[] bytes_1) {
    Buffer class182_2 = new Buffer(bytes_1);
    Buffer class182_3 = new Buffer(bytes_1);
    Buffer class182_4 = new Buffer(bytes_1);
    Buffer class182_5 = new Buffer(bytes_1);
    Buffer class182_6 = new Buffer(bytes_1);
    Buffer class182_7 = new Buffer(bytes_1);
    Buffer class182_8 = new Buffer(bytes_1);
    class182_2.offset = bytes_1.length - 23;
    int i_9 = class182_2.getUInt16();
    int i_10 = class182_2.getUInt16();
    int i_11 = class182_2.getUInt8();
    int i_12 = class182_2.getUInt8();
    int i_13 = class182_2.getUInt8();
    int i_14 = class182_2.getUInt8();
    int i_15 = class182_2.getUInt8();
    int i_16 = class182_2.getUInt8();
    int i_17 = class182_2.getUInt8();
    int i_18 = class182_2.getUInt16();
    int i_19 = class182_2.getUInt16();
    int i_20 = class182_2.getUInt16();
    int i_21 = class182_2.getUInt16();
    int i_22 = class182_2.getUInt16();
    int i_23 = 0;
    int i_24 = 0;
    int i_25 = 0;
    int i_26;
    if (i_11 > 0) {
      this.field1459 = new byte[i_11];
      class182_2.offset = 0;

      for (i_26 = 0; i_26 < i_11; i_26++) {
        byte b_27 = this.field1459[i_26] = class182_2.getInt8();
        if (b_27 == 0) {
          ++i_23;
        }

        if (b_27 >= 1 && b_27 <= 3) {
          ++i_24;
        }

        if (b_27 == 2) {
          ++i_25;
        }
      }
    }

    i_26 = i_11 + i_9;
    int i_28 = i_26;
    if (i_12 == 1) {
      i_26 += i_10;
    }

    int i_29 = i_26;
    i_26 += i_10;
    int i_30 = i_26;
    if (i_13 == 255) {
      i_26 += i_10;
    }

    int i_31 = i_26;
    if (i_15 == 1) {
      i_26 += i_10;
    }

    int i_32 = i_26;
    if (i_17 == 1) {
      i_26 += i_9;
    }

    int i_33 = i_26;
    if (i_14 == 1) {
      i_26 += i_10;
    }

    int i_34 = i_26;
    i_26 += i_21;
    int i_35 = i_26;
    if (i_16 == 1) {
      i_26 += i_10 * 2;
    }

    int i_36 = i_26;
    i_26 += i_22;
    int i_37 = i_26;
    i_26 += i_10 * 2;
    int i_38 = i_26;
    i_26 += i_18;
    int i_39 = i_26;
    i_26 += i_19;
    int i_40 = i_26;
    i_26 += i_20;
    int i_41 = i_26;
    i_26 += i_23 * 6;
    int i_42 = i_26;
    i_26 += i_24 * 6;
    int i_43 = i_26;
    i_26 += i_24 * 6;
    int i_44 = i_26;
    i_26 += i_24 * 2;
    int i_45 = i_26;
    i_26 += i_24;
    int i_46 = i_26;
    i_26 += i_24 * 2 + i_25 * 2;
    this.field1461 = i_9;
    this.field1463 = i_10;
    this.field1484 = i_11;
    this.field1460 = new int[i_9];
    this.field1490 = new int[i_9];
    this.field1462 = new int[i_9];
    this.field1477 = new int[i_10];
    this.field1465 = new int[i_10];
    this.field1466 = new int[i_10];
    if (i_17 == 1) {
      this.field1479 = new int[i_9];
    }

    if (i_12 == 1) {
      this.field1467 = new byte[i_10];
    }

    if (i_13 == 255) {
      this.field1468 = new byte[i_10];
    } else {
      this.field1473 = (byte) i_13;
    }

    if (i_14 == 1) {
      this.field1469 = new byte[i_10];
    }

    if (i_15 == 1) {
      this.field1478 = new int[i_10];
    }

    if (i_16 == 1) {
      this.field1472 = new short[i_10];
    }

    if (i_16 == 1 && i_11 > 0) {
      this.field1470 = new byte[i_10];
    }

    this.field1471 = new short[i_10];
    if (i_11 > 0) {
      this.field1476 = new short[i_11];
      this.field1491 = new short[i_11];
      this.field1464 = new short[i_11];
    }

    class182_2.offset = i_11;
    class182_3.offset = i_38;
    class182_4.offset = i_39;
    class182_5.offset = i_40;
    class182_6.offset = i_32;
    int i_48 = 0;
    int i_49 = 0;
    int i_50 = 0;

    int i_51;
    int i_52;
    int i_53;
    int i_54;
    int i_55;
    for (i_51 = 0; i_51 < i_9; i_51++) {
      i_52 = class182_2.getUInt8();
      i_53 = 0;
      if ((i_52 & 0x1) != 0) {
        i_53 = class182_3.method3561();
      }

      i_54 = 0;
      if ((i_52 & 0x2) != 0) {
        i_54 = class182_4.method3561();
      }

      i_55 = 0;
      if ((i_52 & 0x4) != 0) {
        i_55 = class182_5.method3561();
      }

      this.field1460[i_51] = i_48 + i_53;
      this.field1490[i_51] = i_49 + i_54;
      this.field1462[i_51] = i_50 + i_55;
      i_48 = this.field1460[i_51];
      i_49 = this.field1490[i_51];
      i_50 = this.field1462[i_51];
      if (i_17 == 1) {
        this.field1479[i_51] = class182_6.getUInt8();
      }
    }

    class182_2.offset = i_37;
    class182_3.offset = i_28;
    class182_4.offset = i_30;
    class182_5.offset = i_33;
    class182_6.offset = i_31;
    class182_7.offset = i_35;
    class182_8.offset = i_36;

    for (i_51 = 0; i_51 < i_10; i_51++) {
      this.field1471[i_51] = (short) class182_2.getUInt16();
      if (i_12 == 1) {
        this.field1467[i_51] = class182_3.getInt8();
      }

      if (i_13 == 255) {
        this.field1468[i_51] = class182_4.getInt8();
      }

      if (i_14 == 1) {
        this.field1469[i_51] = class182_5.getInt8();
      }

      if (i_15 == 1) {
        this.field1478[i_51] = class182_6.getUInt8();
      }

      if (i_16 == 1) {
        this.field1472[i_51] = (short) (class182_7.getUInt16() - 1);
      }

      if (this.field1470 != null && this.field1472[i_51] != -1) {
        this.field1470[i_51] = (byte) (class182_8.getUInt8() - 1);
      }
    }

    class182_2.offset = i_34;
    class182_3.offset = i_29;
    i_51 = 0;
    i_52 = 0;
    i_53 = 0;
    i_54 = 0;

    int i_56;
    for (i_55 = 0; i_55 < i_10; i_55++) {
      i_56 = class182_3.getUInt8();
      if (i_56 == 1) {
        i_51 = class182_2.method3561() + i_54;
        i_52 = class182_2.method3561() + i_51;
        i_53 = class182_2.method3561() + i_52;
        i_54 = i_53;
        this.field1477[i_55] = i_51;
        this.field1465[i_55] = i_52;
        this.field1466[i_55] = i_53;
      }

      if (i_56 == 2) {
        i_52 = i_53;
        i_53 = class182_2.method3561() + i_54;
        i_54 = i_53;
        this.field1477[i_55] = i_51;
        this.field1465[i_55] = i_52;
        this.field1466[i_55] = i_53;
      }

      if (i_56 == 3) {
        i_51 = i_53;
        i_53 = class182_2.method3561() + i_54;
        i_54 = i_53;
        this.field1477[i_55] = i_51;
        this.field1465[i_55] = i_52;
        this.field1466[i_55] = i_53;
      }

      if (i_56 == 4) {
        int i_57 = i_51;
        i_51 = i_52;
        i_52 = i_57;
        i_53 = class182_2.method3561() + i_54;
        i_54 = i_53;
        this.field1477[i_55] = i_51;
        this.field1465[i_55] = i_57;
        this.field1466[i_55] = i_53;
      }
    }

    class182_2.offset = i_41;
    class182_3.offset = i_42;
    class182_4.offset = i_43;
    class182_5.offset = i_44;
    class182_6.offset = i_45;
    class182_7.offset = i_46;

    for (i_55 = 0; i_55 < i_11; i_55++) {
      i_56 = this.field1459[i_55] & 0xff;
      if (i_56 == 0) {
        this.field1476[i_55] = (short) class182_2.getUInt16();
        this.field1491[i_55] = (short) class182_2.getUInt16();
        this.field1464[i_55] = (short) class182_2.getUInt16();
      }
    }

    class182_2.offset = i_26;
    i_55 = class182_2.getUInt8();
    if (i_55 != 0) {
      new class126();
      class182_2.getUInt16();
      class182_2.getUInt16();
      class182_2.getUInt16();
      class182_2.getInt32();
    }

  }

  @ObfuscatedName("s")
  void method2570(byte[] bytes_1) {
    boolean bool_2 = false;
    boolean bool_3 = false;
    Buffer class182_4 = new Buffer(bytes_1);
    Buffer class182_5 = new Buffer(bytes_1);
    Buffer class182_6 = new Buffer(bytes_1);
    Buffer class182_7 = new Buffer(bytes_1);
    Buffer class182_8 = new Buffer(bytes_1);
    class182_4.offset = bytes_1.length - 18;
    int i_9 = class182_4.getUInt16();
    int i_10 = class182_4.getUInt16();
    int i_11 = class182_4.getUInt8();
    int i_12 = class182_4.getUInt8();
    int i_13 = class182_4.getUInt8();
    int i_14 = class182_4.getUInt8();
    int i_15 = class182_4.getUInt8();
    int i_16 = class182_4.getUInt8();
    int i_17 = class182_4.getUInt16();
    int i_18 = class182_4.getUInt16();
    int i_19 = class182_4.getUInt16();
    int i_20 = class182_4.getUInt16();
    byte b_21 = 0;
    int i_45 = b_21 + i_9;
    int i_23 = i_45;
    i_45 += i_10;
    int i_24 = i_45;
    if (i_13 == 255) {
      i_45 += i_10;
    }

    int i_25 = i_45;
    if (i_15 == 1) {
      i_45 += i_10;
    }

    int i_26 = i_45;
    if (i_12 == 1) {
      i_45 += i_10;
    }

    int i_27 = i_45;
    if (i_16 == 1) {
      i_45 += i_9;
    }

    int i_28 = i_45;
    if (i_14 == 1) {
      i_45 += i_10;
    }

    int i_29 = i_45;
    i_45 += i_20;
    int i_30 = i_45;
    i_45 += i_10 * 2;
    int i_31 = i_45;
    i_45 += i_11 * 6;
    int i_32 = i_45;
    i_45 += i_17;
    int i_33 = i_45;
    i_45 += i_18;
    int i_10000 = i_45 + i_19;
    this.field1461 = i_9;
    this.field1463 = i_10;
    this.field1484 = i_11;
    this.field1460 = new int[i_9];
    this.field1490 = new int[i_9];
    this.field1462 = new int[i_9];
    this.field1477 = new int[i_10];
    this.field1465 = new int[i_10];
    this.field1466 = new int[i_10];
    if (i_11 > 0) {
      this.field1459 = new byte[i_11];
      this.field1476 = new short[i_11];
      this.field1491 = new short[i_11];
      this.field1464 = new short[i_11];
    }

    if (i_16 == 1) {
      this.field1479 = new int[i_9];
    }

    if (i_12 == 1) {
      this.field1467 = new byte[i_10];
      this.field1470 = new byte[i_10];
      this.field1472 = new short[i_10];
    }

    if (i_13 == 255) {
      this.field1468 = new byte[i_10];
    } else {
      this.field1473 = (byte) i_13;
    }

    if (i_14 == 1) {
      this.field1469 = new byte[i_10];
    }

    if (i_15 == 1) {
      this.field1478 = new int[i_10];
    }

    this.field1471 = new short[i_10];
    class182_4.offset = b_21;
    class182_5.offset = i_32;
    class182_6.offset = i_33;
    class182_7.offset = i_45;
    class182_8.offset = i_27;
    int i_35 = 0;
    int i_36 = 0;
    int i_37 = 0;

    int i_38;
    int i_39;
    int i_40;
    int i_41;
    int i_42;
    for (i_38 = 0; i_38 < i_9; i_38++) {
      i_39 = class182_4.getUInt8();
      i_40 = 0;
      if ((i_39 & 0x1) != 0) {
        i_40 = class182_5.method3561();
      }

      i_41 = 0;
      if ((i_39 & 0x2) != 0) {
        i_41 = class182_6.method3561();
      }

      i_42 = 0;
      if ((i_39 & 0x4) != 0) {
        i_42 = class182_7.method3561();
      }

      this.field1460[i_38] = i_35 + i_40;
      this.field1490[i_38] = i_36 + i_41;
      this.field1462[i_38] = i_37 + i_42;
      i_35 = this.field1460[i_38];
      i_36 = this.field1490[i_38];
      i_37 = this.field1462[i_38];
      if (i_16 == 1) {
        this.field1479[i_38] = class182_8.getUInt8();
      }
    }

    class182_4.offset = i_30;
    class182_5.offset = i_26;
    class182_6.offset = i_24;
    class182_7.offset = i_28;
    class182_8.offset = i_25;

    for (i_38 = 0; i_38 < i_10; i_38++) {
      this.field1471[i_38] = (short) class182_4.getUInt16();
      if (i_12 == 1) {
        i_39 = class182_5.getUInt8();
        if ((i_39 & 0x1) == 1) {
          this.field1467[i_38] = 1;
          bool_2 = true;
        } else {
          this.field1467[i_38] = 0;
        }

        if ((i_39 & 0x2) == 2) {
          this.field1470[i_38] = (byte) (i_39 >> 2);
          this.field1472[i_38] = this.field1471[i_38];
          this.field1471[i_38] = 127;
          if (this.field1472[i_38] != -1) {
            bool_3 = true;
          }
        } else {
          this.field1470[i_38] = -1;
          this.field1472[i_38] = -1;
        }
      }

      if (i_13 == 255) {
        this.field1468[i_38] = class182_6.getInt8();
      }

      if (i_14 == 1) {
        this.field1469[i_38] = class182_7.getInt8();
      }

      if (i_15 == 1) {
        this.field1478[i_38] = class182_8.getUInt8();
      }
    }

    class182_4.offset = i_29;
    class182_5.offset = i_23;
    i_38 = 0;
    i_39 = 0;
    i_40 = 0;
    i_41 = 0;

    int i_43;
    int i_44;
    for (i_42 = 0; i_42 < i_10; i_42++) {
      i_43 = class182_5.getUInt8();
      if (i_43 == 1) {
        i_38 = class182_4.method3561() + i_41;
        i_39 = class182_4.method3561() + i_38;
        i_40 = class182_4.method3561() + i_39;
        i_41 = i_40;
        this.field1477[i_42] = i_38;
        this.field1465[i_42] = i_39;
        this.field1466[i_42] = i_40;
      }

      if (i_43 == 2) {
        i_39 = i_40;
        i_40 = class182_4.method3561() + i_41;
        i_41 = i_40;
        this.field1477[i_42] = i_38;
        this.field1465[i_42] = i_39;
        this.field1466[i_42] = i_40;
      }

      if (i_43 == 3) {
        i_38 = i_40;
        i_40 = class182_4.method3561() + i_41;
        i_41 = i_40;
        this.field1477[i_42] = i_38;
        this.field1465[i_42] = i_39;
        this.field1466[i_42] = i_40;
      }

      if (i_43 == 4) {
        i_44 = i_38;
        i_38 = i_39;
        i_39 = i_44;
        i_40 = class182_4.method3561() + i_41;
        i_41 = i_40;
        this.field1477[i_42] = i_38;
        this.field1465[i_42] = i_44;
        this.field1466[i_42] = i_40;
      }
    }

    class182_4.offset = i_31;

    for (i_42 = 0; i_42 < i_11; i_42++) {
      this.field1459[i_42] = 0;
      this.field1476[i_42] = (short) class182_4.getUInt16();
      this.field1491[i_42] = (short) class182_4.getUInt16();
      this.field1464[i_42] = (short) class182_4.getUInt16();
    }

    if (this.field1470 != null) {
      boolean bool_46 = false;

      for (i_43 = 0; i_43 < i_10; i_43++) {
        i_44 = this.field1470[i_43] & 0xff;
        if (i_44 != 255) {
          if (this.field1477[i_43] == (this.field1476[i_44] & 0xffff) && this.field1465[i_43] == (
              this.field1491[i_44] & 0xffff) && this.field1466[i_43] == (this.field1464[i_44]
              & 0xffff)) {
            this.field1470[i_43] = -1;
          } else {
            bool_46 = true;
          }
        }
      }

      if (!bool_46) {
        this.field1470 = null;
      }
    }

    if (!bool_3) {
      this.field1472 = null;
    }

    if (!bool_2) {
      this.field1467 = null;
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Ldb;I)I"
  )
  final int method2572(class113 class113_1, int i_2) {
    int i_3 = -1;
    int i_4 = class113_1.field1460[i_2];
    int i_5 = class113_1.field1490[i_2];
    int i_6 = class113_1.field1462[i_2];

    for (int i_7 = 0; i_7 < this.field1461; i_7++) {
      if (i_4 == this.field1460[i_7] && i_5 == this.field1490[i_7] && i_6 == this.field1462[i_7]) {
        i_3 = i_7;
        break;
      }
    }

    if (i_3 == -1) {
      this.field1460[this.field1461] = i_4;
      this.field1490[this.field1461] = i_5;
      this.field1462[this.field1461] = i_6;
      if (class113_1.field1479 != null) {
        this.field1479[this.field1461] = class113_1.field1479[i_2];
      }

      i_3 = this.field1461++;
    }

    return i_3;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "()Ldb;"
  )
  public class113 method2650() {
    class113 class113_1 = new class113();
    if (this.field1467 != null) {
      class113_1.field1467 = new byte[this.field1463];

      for (int i_2 = 0; i_2 < this.field1463; i_2++) {
        class113_1.field1467[i_2] = this.field1467[i_2];
      }
    }

    class113_1.field1461 = this.field1461;
    class113_1.field1463 = this.field1463;
    class113_1.field1484 = this.field1484;
    class113_1.field1460 = this.field1460;
    class113_1.field1490 = this.field1490;
    class113_1.field1462 = this.field1462;
    class113_1.field1477 = this.field1477;
    class113_1.field1465 = this.field1465;
    class113_1.field1466 = this.field1466;
    class113_1.field1468 = this.field1468;
    class113_1.field1469 = this.field1469;
    class113_1.field1470 = this.field1470;
    class113_1.field1471 = this.field1471;
    class113_1.field1472 = this.field1472;
    class113_1.field1473 = this.field1473;
    class113_1.field1459 = this.field1459;
    class113_1.field1476 = this.field1476;
    class113_1.field1491 = this.field1491;
    class113_1.field1464 = this.field1464;
    class113_1.field1479 = this.field1479;
    class113_1.field1478 = this.field1478;
    class113_1.field1481 = this.field1481;
    class113_1.field1482 = this.field1482;
    class113_1.field1496 = this.field1496;
    class113_1.field1483 = this.field1483;
    class113_1.field1486 = this.field1486;
    class113_1.field1487 = this.field1487;
    return class113_1;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "([[IIIIZI)Ldb;"
  )
  public class113 method2567(int[][] ints_1, int i_2, int i_3, int i_4, boolean bool_5, int i_6) {
    this.method2627();
    int i_7 = i_2 + this.field1480;
    int i_8 = i_2 + this.field1492;
    int i_9 = i_4 + this.field1493;
    int i_10 = i_4 + this.field1498;
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
        class113 class113_11 = new class113();
        class113_11.field1461 = this.field1461;
        class113_11.field1463 = this.field1463;
        class113_11.field1484 = this.field1484;
        class113_11.field1460 = this.field1460;
        class113_11.field1462 = this.field1462;
        class113_11.field1477 = this.field1477;
        class113_11.field1465 = this.field1465;
        class113_11.field1466 = this.field1466;
        class113_11.field1467 = this.field1467;
        class113_11.field1468 = this.field1468;
        class113_11.field1469 = this.field1469;
        class113_11.field1470 = this.field1470;
        class113_11.field1471 = this.field1471;
        class113_11.field1472 = this.field1472;
        class113_11.field1473 = this.field1473;
        class113_11.field1459 = this.field1459;
        class113_11.field1476 = this.field1476;
        class113_11.field1491 = this.field1491;
        class113_11.field1464 = this.field1464;
        class113_11.field1479 = this.field1479;
        class113_11.field1478 = this.field1478;
        class113_11.field1481 = this.field1481;
        class113_11.field1482 = this.field1482;
        class113_11.field1486 = this.field1486;
        class113_11.field1487 = this.field1487;
        class113_11.field1490 = new int[class113_11.field1461];
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
          for (i_12 = 0; i_12 < class113_11.field1461; i_12++) {
            i_13 = i_2 + this.field1460[i_12];
            i_14 = i_4 + this.field1462[i_12];
            i_15 = i_13 & 0x7f;
            i_16 = i_14 & 0x7f;
            i_17 = i_13 >> 7;
            i_18 = i_14 >> 7;
            i_19 = ints_1[i_17][i_18] * (128 - i_15) + ints_1[i_17 + 1][i_18] * i_15 >> 7;
            i_20 = ints_1[i_17][i_18 + 1] * (128 - i_15) + i_15 * ints_1[i_17 + 1][i_18 + 1] >> 7;
            i_21 = i_19 * (128 - i_16) + i_20 * i_16 >> 7;
            class113_11.field1490[i_12] = i_21 + this.field1490[i_12] - i_3;
          }
        } else {
          for (i_12 = 0; i_12 < class113_11.field1461; i_12++) {
            i_13 = (-this.field1490[i_12] << 16) / super.field1781;
            if (i_13 < i_6) {
              i_14 = i_2 + this.field1460[i_12];
              i_15 = i_4 + this.field1462[i_12];
              i_16 = i_14 & 0x7f;
              i_17 = i_15 & 0x7f;
              i_18 = i_14 >> 7;
              i_19 = i_15 >> 7;
              i_20 = ints_1[i_18][i_19] * (128 - i_16) + ints_1[i_18 + 1][i_19] * i_16 >> 7;
              i_21 = ints_1[i_18][i_19 + 1] * (128 - i_16) + i_16 * ints_1[i_18 + 1][i_19 + 1] >> 7;
              int i_22 = i_20 * (128 - i_17) + i_21 * i_17 >> 7;
              class113_11.field1490[i_12] =
                  (i_6 - i_13) * (i_22 - i_3) / i_6 + this.field1490[i_12];
            }
          }
        }

        class113_11.method2586();
        return class113_11;
      }
    } else {
      return this;
    }
  }

  @ObfuscatedName("i")
  void method2575() {
    int[] ints_1;
    int i_2;
    int i_3;
    int i_4;
    if (this.field1479 != null) {
      ints_1 = new int[256];
      i_2 = 0;

      for (i_3 = 0; i_3 < this.field1461; i_3++) {
        i_4 = this.field1479[i_3];
        ++ints_1[i_4];
        if (i_4 > i_2) {
          i_2 = i_4;
        }
      }

      this.field1481 = new int[i_2 + 1][];

      for (i_3 = 0; i_3 <= i_2; i_3++) {
        this.field1481[i_3] = new int[ints_1[i_3]];
        ints_1[i_3] = 0;
      }

      for (i_3 = 0; i_3 < this.field1461; this.field1481[i_4][ints_1[i_4]++] = i_3++) {
        i_4 = this.field1479[i_3];
      }

      this.field1479 = null;
    }

    if (this.field1478 != null) {
      ints_1 = new int[256];
      i_2 = 0;

      for (i_3 = 0; i_3 < this.field1463; i_3++) {
        i_4 = this.field1478[i_3];
        ++ints_1[i_4];
        if (i_4 > i_2) {
          i_2 = i_4;
        }
      }

      this.field1482 = new int[i_2 + 1][];

      for (i_3 = 0; i_3 <= i_2; i_3++) {
        this.field1482[i_3] = new int[ints_1[i_3]];
        ints_1[i_3] = 0;
      }

      for (i_3 = 0; i_3 < this.field1463; this.field1482[i_4][ints_1[i_4]++] = i_3++) {
        i_4 = this.field1478[i_3];
      }

      this.field1478 = null;
    }

  }

  @ObfuscatedName("x")
  public void method2576() {
    for (int i_1 = 0; i_1 < this.field1461; i_1++) {
      int i_2 = this.field1460[i_1];
      this.field1460[i_1] = this.field1462[i_1];
      this.field1462[i_1] = -i_2;
    }

    this.method2586();
  }

  @ObfuscatedName("p")
  public void method2573() {
    for (int i_1 = 0; i_1 < this.field1461; i_1++) {
      this.field1460[i_1] = -this.field1460[i_1];
      this.field1462[i_1] = -this.field1462[i_1];
    }

    this.method2586();
  }

  @ObfuscatedName("b")
  public void method2578() {
    for (int i_1 = 0; i_1 < this.field1461; i_1++) {
      int i_2 = this.field1462[i_1];
      this.field1462[i_1] = this.field1460[i_1];
      this.field1460[i_1] = -i_2;
    }

    this.method2586();
  }

  @ObfuscatedName("n")
  public void method2653(int i_1) {
    int i_2 = field1497[i_1];
    int i_3 = field1495[i_1];

    for (int i_4 = 0; i_4 < this.field1461; i_4++) {
      int i_5 = i_2 * this.field1462[i_4] + i_3 * this.field1460[i_4] >> 16;
      this.field1462[i_4] = i_3 * this.field1462[i_4] - i_2 * this.field1460[i_4] >> 16;
      this.field1460[i_4] = i_5;
    }

    this.method2586();
  }

  @ObfuscatedName("f")
  public void method2580(int i_1, int i_2, int i_3) {
    for (int i_4 = 0; i_4 < this.field1461; i_4++) {
      this.field1460[i_4] += i_1;
      this.field1490[i_4] += i_2;
      this.field1462[i_4] += i_3;
    }

    this.method2586();
  }

  @ObfuscatedName("g")
  public void method2581(short s_1, short s_2) {
    for (int i_3 = 0; i_3 < this.field1463; i_3++) {
      if (this.field1471[i_3] == s_1) {
        this.field1471[i_3] = s_2;
      }
    }

  }

  @ObfuscatedName("m")
  public void method2582(short s_1, short s_2) {
    if (this.field1472 != null) {
      for (int i_3 = 0; i_3 < this.field1463; i_3++) {
        if (this.field1472[i_3] == s_1) {
          this.field1472[i_3] = s_2;
        }
      }

    }
  }

  @ObfuscatedName("r")
  public void method2583() {
    int i_1;
    for (i_1 = 0; i_1 < this.field1461; i_1++) {
      this.field1462[i_1] = -this.field1462[i_1];
    }

    for (i_1 = 0; i_1 < this.field1463; i_1++) {
      int i_2 = this.field1477[i_1];
      this.field1477[i_1] = this.field1466[i_1];
      this.field1466[i_1] = i_2;
    }

    this.method2586();
  }

  @ObfuscatedName("t")
  public void method2592(int i_1, int i_2, int i_3) {
    for (int i_4 = 0; i_4 < this.field1461; i_4++) {
      this.field1460[i_4] = this.field1460[i_4] * i_1 / 128;
      this.field1490[i_4] = i_2 * this.field1490[i_4] / 128;
      this.field1462[i_4] = i_3 * this.field1462[i_4] / 128;
    }

    this.method2586();
  }

  @ObfuscatedName("o")
  public void method2585() {
    if (this.field1496 == null) {
      this.field1496 = new class121[this.field1461];

      int i_1;
      for (i_1 = 0; i_1 < this.field1461; i_1++) {
        this.field1496[i_1] = new class121();
      }

      for (i_1 = 0; i_1 < this.field1463; i_1++) {
        int i_2 = this.field1477[i_1];
        int i_3 = this.field1465[i_1];
        int i_4 = this.field1466[i_1];
        int i_5 = this.field1460[i_3] - this.field1460[i_2];
        int i_6 = this.field1490[i_3] - this.field1490[i_2];
        int i_7 = this.field1462[i_3] - this.field1462[i_2];
        int i_8 = this.field1460[i_4] - this.field1460[i_2];
        int i_9 = this.field1490[i_4] - this.field1490[i_2];
        int i_10 = this.field1462[i_4] - this.field1462[i_2];
        int i_11 = i_6 * i_10 - i_9 * i_7;
        int i_12 = i_7 * i_8 - i_10 * i_5;

        int i_13;
        for (i_13 = i_5 * i_9 - i_8 * i_6;
            i_11 > 8192 || i_12 > 8192 || i_13 > 8192 || i_11 < -8192 || i_12 < -8192
                || i_13 < -8192; i_13 >>= 1) {
          i_11 >>= 1;
          i_12 >>= 1;
        }

        int i_14 = (int) Math.sqrt((double) (i_11 * i_11 + i_12 * i_12 + i_13 * i_13));
        if (i_14 <= 0) {
          i_14 = 1;
        }

        i_11 = i_11 * 256 / i_14;
        i_12 = i_12 * 256 / i_14;
        i_13 = i_13 * 256 / i_14;
        byte b_15;
        if (this.field1467 == null) {
          b_15 = 0;
        } else {
          b_15 = this.field1467[i_1];
        }

        if (b_15 == 0) {
          class121 class121_16 = this.field1496[i_2];
          class121_16.field1665 += i_11;
          class121_16.field1661 += i_12;
          class121_16.field1662 += i_13;
          ++class121_16.field1666;
          class121_16 = this.field1496[i_3];
          class121_16.field1665 += i_11;
          class121_16.field1661 += i_12;
          class121_16.field1662 += i_13;
          ++class121_16.field1666;
          class121_16 = this.field1496[i_4];
          class121_16.field1665 += i_11;
          class121_16.field1661 += i_12;
          class121_16.field1662 += i_13;
          ++class121_16.field1666;
        } else if (b_15 == 1) {
          if (this.field1483 == null) {
            this.field1483 = new class129[this.field1463];
          }

          class129 class129_17 = this.field1483[i_1] = new class129();
          class129_17.field1793 = i_11;
          class129_17.field1794 = i_12;
          class129_17.field1795 = i_13;
        }
      }

    }
  }

  @ObfuscatedName("y")
  void method2586() {
    this.field1496 = null;
    this.field1485 = null;
    this.field1483 = null;
    this.field1488 = false;
  }

  @ObfuscatedName("a")
  void method2627() {
    if (!this.field1488) {
      super.field1781 = 0;
      this.field1489 = 0;
      this.field1480 = 999999;
      this.field1492 = -999999;
      this.field1498 = -99999;
      this.field1493 = 99999;

      for (int i_1 = 0; i_1 < this.field1461; i_1++) {
        int i_2 = this.field1460[i_1];
        int i_3 = this.field1490[i_1];
        int i_4 = this.field1462[i_1];
        if (i_2 < this.field1480) {
          this.field1480 = i_2;
        }

        if (i_2 > this.field1492) {
          this.field1492 = i_2;
        }

        if (i_4 < this.field1493) {
          this.field1493 = i_4;
        }

        if (i_4 > this.field1498) {
          this.field1498 = i_4;
        }

        if (-i_3 > super.field1781) {
          super.field1781 = -i_3;
        }

        if (i_3 > this.field1489) {
          this.field1489 = i_3;
        }
      }

      this.field1488 = true;
    }
  }

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "(IIIII)Ldc;"
  )
  public final class119 method2589(int i_1, int i_2, int i_3, int i_4, int i_5) {
    this.method2585();
    int i_6 = (int) Math.sqrt((double) (i_5 * i_5 + i_3 * i_3 + i_4 * i_4));
    int i_7 = i_6 * i_2 >> 8;
    class119 class119_8 = new class119();
    class119_8.field1615 = new int[this.field1463];
    class119_8.field1620 = new int[this.field1463];
    class119_8.field1591 = new int[this.field1463];
    if (this.field1484 > 0 && this.field1470 != null) {
      int[] ints_9 = new int[this.field1484];

      int i_10;
      for (i_10 = 0; i_10 < this.field1463; i_10++) {
        if (this.field1470[i_10] != -1) {
          ++ints_9[this.field1470[i_10] & 0xff];
        }
      }

      class119_8.field1597 = 0;

      for (i_10 = 0; i_10 < this.field1484; i_10++) {
        if (ints_9[i_10] > 0 && this.field1459[i_10] == 0) {
          ++class119_8.field1597;
        }
      }

      class119_8.field1621 = new int[class119_8.field1597];
      class119_8.field1599 = new int[class119_8.field1597];
      class119_8.field1600 = new int[class119_8.field1597];
      i_10 = 0;

      int i_11;
      for (i_11 = 0; i_11 < this.field1484; i_11++) {
        if (ints_9[i_11] > 0 && this.field1459[i_11] == 0) {
          class119_8.field1621[i_10] = this.field1476[i_11] & 0xffff;
          class119_8.field1599[i_10] = this.field1491[i_11] & 0xffff;
          class119_8.field1600[i_10] = this.field1464[i_11] & 0xffff;
          ints_9[i_11] = i_10++;
        } else {
          ints_9[i_11] = -1;
        }
      }

      class119_8.field1617 = new byte[this.field1463];

      for (i_11 = 0; i_11 < this.field1463; i_11++) {
        if (this.field1470[i_11] != -1) {
          class119_8.field1617[i_11] = (byte) ints_9[this.field1470[i_11] & 0xff];
        } else {
          class119_8.field1617[i_11] = -1;
        }
      }
    }

    for (int i_16 = 0; i_16 < this.field1463; i_16++) {
      byte b_17;
      if (this.field1467 == null) {
        b_17 = 0;
      } else {
        b_17 = this.field1467[i_16];
      }

      byte b_18;
      if (this.field1469 == null) {
        b_18 = 0;
      } else {
        b_18 = this.field1469[i_16];
      }

      short s_12;
      if (this.field1472 == null) {
        s_12 = -1;
      } else {
        s_12 = this.field1472[i_16];
      }

      if (b_18 == -2) {
        b_17 = 3;
      }

      if (b_18 == -1) {
        b_17 = 2;
      }

      class121 class121_13;
      int i_14;
      class129 class129_19;
      if (s_12 == -1) {
        if (b_17 != 0) {
          if (b_17 == 1) {
            class129_19 = this.field1483[i_16];
            i_14 = (i_4 * class129_19.field1794 + i_5 * class129_19.field1795
                + i_3 * class129_19.field1793) / (i_7 / 2 + i_7) + i_1;
            class119_8.field1615[i_16] = method2590(this.field1471[i_16] & 0xffff, i_14);
            class119_8.field1591[i_16] = -1;
          } else if (b_17 == 3) {
            class119_8.field1615[i_16] = 128;
            class119_8.field1591[i_16] = -1;
          } else {
            class119_8.field1591[i_16] = -2;
          }
        } else {
          int i_15 = this.field1471[i_16] & 0xffff;
          if (this.field1485 != null && this.field1485[this.field1477[i_16]] != null) {
            class121_13 = this.field1485[this.field1477[i_16]];
          } else {
            class121_13 = this.field1496[this.field1477[i_16]];
          }

          i_14 = (i_4 * class121_13.field1661 + i_5 * class121_13.field1662
              + i_3 * class121_13.field1665) / (i_7 * class121_13.field1666) + i_1;
          class119_8.field1615[i_16] = method2590(i_15, i_14);
          if (this.field1485 != null && this.field1485[this.field1465[i_16]] != null) {
            class121_13 = this.field1485[this.field1465[i_16]];
          } else {
            class121_13 = this.field1496[this.field1465[i_16]];
          }

          i_14 = (i_4 * class121_13.field1661 + i_5 * class121_13.field1662
              + i_3 * class121_13.field1665) / (i_7 * class121_13.field1666) + i_1;
          class119_8.field1620[i_16] = method2590(i_15, i_14);
          if (this.field1485 != null && this.field1485[this.field1466[i_16]] != null) {
            class121_13 = this.field1485[this.field1466[i_16]];
          } else {
            class121_13 = this.field1496[this.field1466[i_16]];
          }

          i_14 = (i_4 * class121_13.field1661 + i_5 * class121_13.field1662
              + i_3 * class121_13.field1665) / (i_7 * class121_13.field1666) + i_1;
          class119_8.field1591[i_16] = method2590(i_15, i_14);
        }
      } else if (b_17 != 0) {
        if (b_17 == 1) {
          class129_19 = this.field1483[i_16];
          i_14 = (i_4 * class129_19.field1794 + i_5 * class129_19.field1795
              + i_3 * class129_19.field1793) / (i_7 / 2 + i_7) + i_1;
          class119_8.field1615[i_16] = method2591(i_14);
          class119_8.field1591[i_16] = -1;
        } else {
          class119_8.field1591[i_16] = -2;
        }
      } else {
        if (this.field1485 != null && this.field1485[this.field1477[i_16]] != null) {
          class121_13 = this.field1485[this.field1477[i_16]];
        } else {
          class121_13 = this.field1496[this.field1477[i_16]];
        }

        i_14 = (i_4 * class121_13.field1661 + i_5 * class121_13.field1662
            + i_3 * class121_13.field1665) / (i_7 * class121_13.field1666) + i_1;
        class119_8.field1615[i_16] = method2591(i_14);
        if (this.field1485 != null && this.field1485[this.field1465[i_16]] != null) {
          class121_13 = this.field1485[this.field1465[i_16]];
        } else {
          class121_13 = this.field1496[this.field1465[i_16]];
        }

        i_14 = (i_4 * class121_13.field1661 + i_5 * class121_13.field1662
            + i_3 * class121_13.field1665) / (i_7 * class121_13.field1666) + i_1;
        class119_8.field1620[i_16] = method2591(i_14);
        if (this.field1485 != null && this.field1485[this.field1466[i_16]] != null) {
          class121_13 = this.field1485[this.field1466[i_16]];
        } else {
          class121_13 = this.field1496[this.field1466[i_16]];
        }

        i_14 = (i_4 * class121_13.field1661 + i_5 * class121_13.field1662
            + i_3 * class121_13.field1665) / (i_7 * class121_13.field1666) + i_1;
        class119_8.field1591[i_16] = method2591(i_14);
      }
    }

    this.method2575();
    class119_8.field1581 = this.field1461;
    class119_8.field1646 = this.field1460;
    class119_8.field1583 = this.field1490;
    class119_8.field1584 = this.field1462;
    class119_8.field1585 = this.field1463;
    class119_8.field1586 = this.field1477;
    class119_8.field1587 = this.field1465;
    class119_8.field1588 = this.field1466;
    class119_8.field1645 = this.field1468;
    class119_8.field1593 = this.field1469;
    class119_8.field1596 = this.field1473;
    class119_8.field1601 = this.field1481;
    class119_8.field1602 = this.field1482;
    class119_8.field1604 = this.field1472;
    return class119_8;
  }

}
