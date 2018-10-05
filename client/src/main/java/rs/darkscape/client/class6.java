package rs.darkscape.client;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
final class class6 implements Comparator {

  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 2122998471
  )
  public static int field37;
  @ObfuscatedName("mb")
  @ObfuscatedGetter(
      intValue = -1755726803
  )
  static int field39;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1575797810"
  )
  static int method69(int i_0, int i_1) {
    class272 class272_2 = class1.method15(i_0);
    if (class272_2 == null) {
      return i_1;
    } else if (class272_2.field3528 >= 0) {
      return class272_2.field3528 | ~0xffffff;
    } else {
      int i_3;
      int i_4;
      byte b_5;
      int i_7;
      if (class272_2.field3526 >= 0) {
        i_4 = class122.field1667.vmethod3092(class272_2.field3526);
        b_5 = 96;
        if (i_4 == -2) {
          i_3 = 12345678;
        } else if (i_4 == -1) {
          if (b_5 < 0) {
            b_5 = 0;
          } else if (b_5 > 127) {
            b_5 = 127;
          }

          i_7 = 127 - b_5;
          i_3 = i_7;
        } else {
          i_7 = b_5 * (i_4 & 0x7f) / 128;
          if (i_7 < 2) {
            i_7 = 2;
          } else if (i_7 > 126) {
            i_7 = 126;
          }

          i_3 = i_7 + (i_4 & 0xff80);
        }

        return class122.field1675[i_3] | ~0xffffff;
      } else if (class272_2.field3533 == 16711935) {
        return i_1;
      } else {
        i_3 = class260.method4908(class272_2.field3525, class272_2.field3530, class272_2.field3531);
        b_5 = 96;
        if (i_3 == -2) {
          i_4 = 12345678;
        } else if (i_3 == -1) {
          if (b_5 < 0) {
            b_5 = 0;
          } else if (b_5 > 127) {
            b_5 = 127;
          }

          i_7 = 127 - b_5;
          i_4 = i_7;
        } else {
          i_7 = b_5 * (i_3 & 0x7f) / 128;
          if (i_7 < 2) {
            i_7 = 2;
          } else if (i_7 > 126) {
            i_7 = 126;
          }

          i_4 = i_7 + (i_3 & 0xff80);
        }

        return class122.field1675[i_4] | ~0xffffff;
      }
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "2"
  )
  static String method71(int i_0) {
    return "<col=" + Integer.toHexString(i_0) + ">";
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1623615200"
  )
  static void method75() {
    for (class68 class68_0 = (class68) class68.field985.getFirst(); class68_0 != null;
        class68_0 = (class68) class68.field985.getNext()) {
      if (class68_0.field994 != null) {
        class68_0.method1688();
      }
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lgi;II)V",
      garbageValue = "392289778"
  )
  static void method73(PacketBuffer class189_0, int i_1) {
    boolean bool_2 = class189_0.method3817(1) == 1;
    if (bool_2) {
      class81.field1166[++class81.field1165 - 1] = i_1;
    }

    int i_3 = class189_0.method3817(2);
    class60 class60_4 = client.field610[i_1];
    if (i_3 == 0) {
      if (bool_2) {
        class60_4.field571 = false;
      } else if (client.field628 == i_1) {
        throw new RuntimeException();
      } else {
        class81.field1162[i_1] =
            (class60_4.field567 << 28) + (class62.field868 + class60_4.field922[0] >> 13 << 14) + (
                client.field754 + class60_4.field872[0] >> 13);
        if (class60_4.field920 != -1) {
          class81.field1163[i_1] = class60_4.field920;
        } else {
          class81.field1163[i_1] = class60_4.field926;
        }

        class81.field1164[i_1] = class60_4.field897;
        client.field610[i_1] = null;
        if (class189_0.method3817(1) != 0) {
          class240.method4601(class189_0, i_1);
        }

      }
    } else {
      int i_5;
      int i_6;
      int i_7;
      if (i_3 == 1) {
        i_5 = class189_0.method3817(3);
        i_6 = class60_4.field922[0];
        i_7 = class60_4.field872[0];
        if (i_5 == 0) {
          --i_6;
          --i_7;
        } else if (i_5 == 1) {
          --i_7;
        } else if (i_5 == 2) {
          ++i_6;
          --i_7;
        } else if (i_5 == 3) {
          --i_6;
        } else if (i_5 == 4) {
          ++i_6;
        } else if (i_5 == 5) {
          --i_6;
          ++i_7;
        } else if (i_5 == 6) {
          ++i_7;
        } else if (i_5 == 7) {
          ++i_6;
          ++i_7;
        }

        if (client.field628 == i_1 && (class60_4.field931 < 1536 || class60_4.field881 < 1536
            || class60_4.field931 >= 11776 || class60_4.field881 >= 11776)) {
          class60_4.method1103(i_6, i_7);
          class60_4.field571 = false;
        } else if (bool_2) {
          class60_4.field571 = true;
          class60_4.field572 = i_6;
          class60_4.field573 = i_7;
        } else {
          class60_4.field571 = false;
          class60_4.method1106(i_6, i_7, class81.field1153[i_1]);
        }

      } else if (i_3 == 2) {
        i_5 = class189_0.method3817(4);
        i_6 = class60_4.field922[0];
        i_7 = class60_4.field872[0];
        if (i_5 == 0) {
          i_6 -= 2;
          i_7 -= 2;
        } else if (i_5 == 1) {
          --i_6;
          i_7 -= 2;
        } else if (i_5 == 2) {
          i_7 -= 2;
        } else if (i_5 == 3) {
          ++i_6;
          i_7 -= 2;
        } else if (i_5 == 4) {
          i_6 += 2;
          i_7 -= 2;
        } else if (i_5 == 5) {
          i_6 -= 2;
          --i_7;
        } else if (i_5 == 6) {
          i_6 += 2;
          --i_7;
        } else if (i_5 == 7) {
          i_6 -= 2;
        } else if (i_5 == 8) {
          i_6 += 2;
        } else if (i_5 == 9) {
          i_6 -= 2;
          ++i_7;
        } else if (i_5 == 10) {
          i_6 += 2;
          ++i_7;
        } else if (i_5 == 11) {
          i_6 -= 2;
          i_7 += 2;
        } else if (i_5 == 12) {
          --i_6;
          i_7 += 2;
        } else if (i_5 == 13) {
          i_7 += 2;
        } else if (i_5 == 14) {
          ++i_6;
          i_7 += 2;
        } else if (i_5 == 15) {
          i_6 += 2;
          i_7 += 2;
        }

        if (client.field628 == i_1 && (class60_4.field931 < 1536 || class60_4.field881 < 1536
            || class60_4.field931 >= 11776 || class60_4.field881 >= 11776)) {
          class60_4.method1103(i_6, i_7);
          class60_4.field571 = false;
        } else if (bool_2) {
          class60_4.field571 = true;
          class60_4.field572 = i_6;
          class60_4.field573 = i_7;
        } else {
          class60_4.field571 = false;
          class60_4.method1106(i_6, i_7, class81.field1153[i_1]);
        }

      } else {
        i_5 = class189_0.method3817(1);
        int i_8;
        int i_9;
        int i_10;
        int i_11;
        if (i_5 == 0) {
          i_6 = class189_0.method3817(12);
          i_7 = i_6 >> 10;
          i_8 = i_6 >> 5 & 0x1f;
          if (i_8 > 15) {
            i_8 -= 32;
          }

          i_9 = i_6 & 0x1f;
          if (i_9 > 15) {
            i_9 -= 32;
          }

          i_10 = i_8 + class60_4.field922[0];
          i_11 = i_9 + class60_4.field872[0];
          if (client.field628 == i_1 && (class60_4.field931 < 1536 || class60_4.field881 < 1536
              || class60_4.field931 >= 11776 || class60_4.field881 >= 11776)) {
            class60_4.method1103(i_10, i_11);
            class60_4.field571 = false;
          } else if (bool_2) {
            class60_4.field571 = true;
            class60_4.field572 = i_10;
            class60_4.field573 = i_11;
          } else {
            class60_4.field571 = false;
            class60_4.method1106(i_10, i_11, class81.field1153[i_1]);
          }

          class60_4.field567 = (byte) (i_7 + class60_4.field567 & 0x3);
          if (client.field628 == i_1) {
            class13.field82 = class60_4.field567;
          }

        } else {
          i_6 = class189_0.method3817(30);
          i_7 = i_6 >> 28;
          i_8 = i_6 >> 14 & 0x3fff;
          i_9 = i_6 & 0x3fff;
          i_10 = (i_8 + class62.field868 + class60_4.field922[0] & 0x3fff) - class62.field868;
          i_11 = (i_9 + client.field754 + class60_4.field872[0] & 0x3fff) - client.field754;
          if (client.field628 == i_1 && (class60_4.field931 < 1536 || class60_4.field881 < 1536
              || class60_4.field931 >= 11776 || class60_4.field881 >= 11776)) {
            class60_4.method1103(i_10, i_11);
            class60_4.field571 = false;
          } else if (bool_2) {
            class60_4.field571 = true;
            class60_4.field572 = i_10;
            class60_4.field573 = i_11;
          } else {
            class60_4.field571 = false;
            class60_4.method1106(i_10, i_11, class81.field1153[i_1]);
          }

          class60_4.field567 = (byte) (i_7 + class60_4.field567 & 0x3);
          if (client.field628 == i_1) {
            class13.field82 = class60_4.field567;
          }

        }
      }
    }
  }

  @ObfuscatedName("c")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-127094665"
  )
  static int method74(int i_0, class84 class84_1, boolean bool_2) {
    if (i_0 == 5306) {
      int[] ints_3 = class69.field999;
      int i_4 = ++class69.field1003 - 1;
      int i_5 = client.field792 ? 2 : 1;
      ints_3[i_4] = i_5;
      return 1;
    } else {
      int i_6;
      if (i_0 == 5307) {
        i_6 = class69.field999[--class69.field1003];
        if (i_6 == 1 || i_6 == 2) {
          class50.method991(i_6);
        }

        return 1;
      } else if (i_0 == 5308) {
        class69.field999[++class69.field1003 - 1] = class10.field61.field957;
        return 1;
      } else if (i_0 != 5309) {
        return 2;
      } else {
        i_6 = class69.field999[--class69.field1003];
        if (i_6 == 1 || i_6 == 2) {
          class10.field61.field957 = i_6;
          class54.method1018();
        }

        return 1;
      }
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ls;Ls;I)I",
      garbageValue = "-1297295614"
  )
  int method66(class2 class2_1, class2 class2_2) {
    return class2_1.method16().compareTo(class2_2.method16());
  }

  public int compare(Object object_1, Object object_2) {
    return this.method66((class2) object_1, (class2) object_2);
  }

  public boolean equals(Object object_1) {
    return super.equals(object_1);
  }

}
