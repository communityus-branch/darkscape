package rs.darkscape.client;

import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class class57 implements Runnable {

  @ObfuscatedName("fx")
  @ObfuscatedGetter(
      intValue = -245212773
  )
  static int field524;
  @ObfuscatedName("z")
  boolean field529 = true;
  @ObfuscatedName("w")
  Object field523 = new Object();
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 139404487
  )
  int field522 = 0;
  @ObfuscatedName("l")
  int[] field525 = new int[500];
  @ObfuscatedName("u")
  int[] field526 = new int[500];

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)Lib;",
      garbageValue = "-1295663391"
  )
  public static class258 method1035(int i_0) {
    class258 class258_1 = (class258) class258.field3267.method3989((long) i_0);
    if (class258_1 != null) {
      return class258_1;
    } else {
      byte[] bytes_2 = class258.field3272.method4625(13, i_0);
      class258_1 = new class258();
      class258_1.field3280 = i_0;
      if (bytes_2 != null) {
        class258_1.method4864(new Buffer(bytes_2));
      }

      class258.field3267.method3983(class258_1, (long) i_0);
      return class258_1;
    }
  }

  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-332860398"
  )
  static int method1034(int i_0, class84 class84_1, boolean bool_2) {
    String string_3;
    int i_4;
    if (i_0 == 4100) {
      string_3 = class69.field1001[--class55.field497];
      i_4 = class69.field999[--class69.field1003];
      class69.field1001[++class55.field497 - 1] = string_3 + i_4;
      return 1;
    } else {
      String string_27;
      if (i_0 == 4101) {
        class55.field497 -= 2;
        string_3 = class69.field1001[class55.field497];
        string_27 = class69.field1001[class55.field497 + 1];
        class69.field1001[++class55.field497 - 1] = string_3 + string_27;
        return 1;
      } else {
        int i_26;
        if (i_0 == 4102) {
          string_3 = class69.field1001[--class55.field497];
          i_4 = class69.field999[--class69.field1003];
          String[] arr_5 = class69.field1001;
          i_26 = ++class55.field497 - 1;
          String string_8;
          if (i_4 < 0) {
            string_8 = Integer.toString(i_4);
          } else {
            int i_10 = i_4;
            String string_9;
            if (i_4 < 0) {
              string_9 = Integer.toString(i_4, 10);
            } else {
              int i_11 = 2;

              for (int i_12 = i_4 / 10; i_12 != 0; i_11++) {
                i_12 /= 10;
              }

              char[] arr_13 = new char[i_11];
              arr_13[0] = 43;

              for (int i_14 = i_11 - 1; i_14 > 0; --i_14) {
                int i_15 = i_10;
                i_10 /= 10;
                int i_16 = i_15 - i_10 * 10;
                if (i_16 >= 10) {
                  arr_13[i_14] = (char) (i_16 + 87);
                } else {
                  arr_13[i_14] = (char) (i_16 + 48);
                }
              }

              string_9 = new String(arr_13);
            }

            string_8 = string_9;
          }

          arr_5[i_26] = string_3 + string_8;
          return 1;
        } else if (i_0 == 4103) {
          string_3 = class69.field1001[--class55.field497];
          class69.field1001[++class55.field497 - 1] = string_3.toLowerCase();
          return 1;
        } else {
          int i_18;
          if (i_0 == 4104) {
            i_18 = class69.field999[--class69.field1003];
            long long_19 = 86400000L * ((long) i_18 + 11745L);
            class69.field1007.setTime(new Date(long_19));
            i_26 = class69.field1007.get(5);
            int i_29 = class69.field1007.get(2);
            int i_22 = class69.field1007.get(1);
            class69.field1001[++class55.field497 - 1] =
                i_26 + "-" + class69.field998[i_29] + "-" + i_22;
            return 1;
          } else if (i_0 == 4105) {
            class55.field497 -= 2;
            string_3 = class69.field1001[class55.field497];
            string_27 = class69.field1001[class55.field497 + 1];
            if (class138.field1876.field546 != null && class138.field1876.field546.field2571) {
              class69.field1001[++class55.field497 - 1] = string_27;
            } else {
              class69.field1001[++class55.field497 - 1] = string_3;
            }

            return 1;
          } else if (i_0 == 4106) {
            i_18 = class69.field999[--class69.field1003];
            class69.field1001[++class55.field497 - 1] = Integer.toString(i_18);
            return 1;
          } else if (i_0 == 4107) {
            class55.field497 -= 2;
            int[] ints_25 = class69.field999;
            i_4 = ++class69.field1003 - 1;
            i_26 = class155.method3269(class69.field1001[class55.field497],
                                       class69.field1001[class55.field497 + 1], client.field827);
            byte b_31;
            if (i_26 > 0) {
              b_31 = 1;
            } else if (i_26 < 0) {
              b_31 = -1;
            } else {
              b_31 = 0;
            }

            ints_25[i_4] = b_31;
            return 1;
          } else {
            class298 class298_7;
            int i_23;
            byte[] bytes_24;
            if (i_0 == 4108) {
              string_3 = class69.field1001[--class55.field497];
              class69.field1003 -= 2;
              i_4 = class69.field999[class69.field1003];
              i_23 = class69.field999[class69.field1003 + 1];
              bytes_24 = class50.field461.method4625(i_23, 0);
              class298_7 = new class298(bytes_24);
              class69.field999[++class69.field1003 - 1] = class298_7.method5520(string_3, i_4);
              return 1;
            } else if (i_0 == 4109) {
              string_3 = class69.field1001[--class55.field497];
              class69.field1003 -= 2;
              i_4 = class69.field999[class69.field1003];
              i_23 = class69.field999[class69.field1003 + 1];
              bytes_24 = class50.field461.method4625(i_23, 0);
              class298_7 = new class298(bytes_24);
              class69.field999[++class69.field1003 - 1] = class298_7.method5519(string_3, i_4);
              return 1;
            } else if (i_0 == 4110) {
              class55.field497 -= 2;
              string_3 = class69.field1001[class55.field497];
              string_27 = class69.field1001[class55.field497 + 1];
              if (class69.field999[--class69.field1003] == 1) {
                class69.field1001[++class55.field497 - 1] = string_3;
              } else {
                class69.field1001[++class55.field497 - 1] = string_27;
              }

              return 1;
            } else if (i_0 == 4111) {
              string_3 = class69.field1001[--class55.field497];
              class69.field1001[++class55.field497 - 1] = class299.method5521(string_3);
              return 1;
            } else if (i_0 == 4112) {
              string_3 = class69.field1001[--class55.field497];
              i_4 = class69.field999[--class69.field1003];
              class69.field1001[++class55.field497 - 1] = string_3 + (char) i_4;
              return 1;
            } else if (i_0 == 4113) {
              i_18 = class69.field999[--class69.field1003];
              class69.field999[++class69.field1003 - 1] = class52.method1002((char) i_18) ? 1 : 0;
              return 1;
            } else if (i_0 == 4114) {
              i_18 = class69.field999[--class69.field1003];
              class69.field999[++class69.field1003 - 1] = Temp.method3362((char) i_18) ? 1 : 0;
              return 1;
            } else {
              boolean bool_6;
              int[] ints_17;
              char var_21;
              if (i_0 == 4115) {
                i_18 = class69.field999[--class69.field1003];
                ints_17 = class69.field999;
                i_23 = ++class69.field1003 - 1;
                var_21 = (char) i_18;
                bool_6 = var_21 >= 65 && var_21 <= 90 || var_21 >= 97 && var_21 <= 122;
                ints_17[i_23] = bool_6 ? 1 : 0;
                return 1;
              } else if (i_0 != 4116) {
                if (i_0 == 4117) {
                  string_3 = class69.field1001[--class55.field497];
                  if (string_3 != null) {
                    class69.field999[++class69.field1003 - 1] = string_3.length();
                  } else {
                    class69.field999[++class69.field1003 - 1] = 0;
                  }

                  return 1;
                } else if (i_0 == 4118) {
                  string_3 = class69.field1001[--class55.field497];
                  class69.field1003 -= 2;
                  i_4 = class69.field999[class69.field1003];
                  i_23 = class69.field999[class69.field1003 + 1];
                  class69.field1001[++class55.field497 - 1] = string_3.substring(i_4, i_23);
                  return 1;
                } else if (i_0 == 4119) {
                  string_3 = class69.field1001[--class55.field497];
                  StringBuilder stringbuilder_28 = new StringBuilder(string_3.length());
                  boolean bool_30 = false;

                  for (i_26 = 0; i_26 < string_3.length(); i_26++) {
                    var_21 = string_3.charAt(i_26);
                    if (var_21 == 60) {
                      bool_30 = true;
                    } else if (var_21 == 62) {
                      bool_30 = false;
                    } else if (!bool_30) {
                      stringbuilder_28.append(var_21);
                    }
                  }

                  class69.field1001[++class55.field497 - 1] = stringbuilder_28.toString();
                  return 1;
                } else if (i_0 == 4120) {
                  string_3 = class69.field1001[--class55.field497];
                  i_4 = class69.field999[--class69.field1003];
                  class69.field999[++class69.field1003 - 1] = string_3.indexOf(i_4);
                  return 1;
                } else if (i_0 == 4121) {
                  class55.field497 -= 2;
                  string_3 = class69.field1001[class55.field497];
                  string_27 = class69.field1001[class55.field497 + 1];
                  i_23 = class69.field999[--class69.field1003];
                  class69.field999[++class69.field1003 - 1] = string_3.indexOf(string_27, i_23);
                  return 1;
                } else {
                  return 2;
                }
              } else {
                i_18 = class69.field999[--class69.field1003];
                ints_17 = class69.field999;
                i_23 = ++class69.field1003 - 1;
                var_21 = (char) i_18;
                bool_6 = var_21 >= 48 && var_21 <= 57;
                ints_17[i_23] = bool_6 ? 1 : 0;
                return 1;
              }
            }
          }
        }
      }
    }
  }

  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-113"
  )
  public static void method1036() {
    class269.field3461.method3984();
    class269.field3428.method3984();
    class269.field3429.method3984();
  }

  public void run() {
    for (; this.field529; class63.method1539(50L)) {
      Object object_1 = this.field523;
      synchronized (this.field523) {
        if (this.field522 < 500) {
          this.field525[this.field522] = Mouse.field425;
          this.field526[this.field522] = Mouse.field426 * 673804999;
          ++this.field522;
        }
      }
    }

  }

}
