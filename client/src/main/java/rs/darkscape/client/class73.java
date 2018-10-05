package rs.darkscape.client;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class73 {

  @ObfuscatedName("u")
  static final BigInteger field1039 = new BigInteger(
      "80782894952180643741752986186714059433953886149239752893425047584684715842049");
  @ObfuscatedName("q")
  static final BigInteger field1044 = new BigInteger(
      "7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-373456508"
  )
  static int method1799(int i_0, class84 class84_1, boolean bool_2) {
    int i_3;
    if (i_0 == 4200) {
      i_3 = class69.field999[--class69.field1003];
      class69.field1001[++class55.field497 - 1] = class111.method2563(i_3).field3433;
      return 1;
    } else {
      int i_4;
      class269 class269_17;
      if (i_0 == 4201) {
        class69.field1003 -= 2;
        i_3 = class69.field999[class69.field1003];
        i_4 = class69.field999[class69.field1003 + 1];
        class269_17 = class111.method2563(i_3);
        if (i_4 >= 1 && i_4 <= 5 && class269_17.field3447[i_4 - 1] != null) {
          class69.field1001[++class55.field497 - 1] = class269_17.field3447[i_4 - 1];
        } else {
          class69.field1001[++class55.field497 - 1] = "";
        }

        return 1;
      } else if (i_0 == 4202) {
        class69.field1003 -= 2;
        i_3 = class69.field999[class69.field1003];
        i_4 = class69.field999[class69.field1003 + 1];
        class269_17 = class111.method2563(i_3);
        if (i_4 >= 1 && i_4 <= 5 && class269_17.field3425[i_4 - 1] != null) {
          class69.field1001[++class55.field497 - 1] = class269_17.field3425[i_4 - 1];
        } else {
          class69.field1001[++class55.field497 - 1] = "";
        }

        return 1;
      } else if (i_0 == 4203) {
        i_3 = class69.field999[--class69.field1003];
        class69.field999[++class69.field1003 - 1] = class111.method2563(i_3).field3445;
        return 1;
      } else if (i_0 == 4204) {
        i_3 = class69.field999[--class69.field1003];
        class69.field999[++class69.field1003 - 1] = class111.method2563(i_3).field3444 == 1 ? 1 : 0;
        return 1;
      } else {
        class269 class269_13;
        if (i_0 == 4205) {
          i_3 = class69.field999[--class69.field1003];
          class269_13 = class111.method2563(i_3);
          if (class269_13.field3465 == -1 && class269_13.field3464 >= 0) {
            class69.field999[++class69.field1003 - 1] = class269_13.field3464;
          } else {
            class69.field999[++class69.field1003 - 1] = i_3;
          }

          return 1;
        } else if (i_0 == 4206) {
          i_3 = class69.field999[--class69.field1003];
          class269_13 = class111.method2563(i_3);
          if (class269_13.field3465 >= 0 && class269_13.field3464 >= 0) {
            class69.field999[++class69.field1003 - 1] = class269_13.field3464;
          } else {
            class69.field999[++class69.field1003 - 1] = i_3;
          }

          return 1;
        } else if (i_0 == 4207) {
          i_3 = class69.field999[--class69.field1003];
          class69.field999[++class69.field1003 - 1] = class111.method2563(i_3).field3446 ? 1 : 0;
          return 1;
        } else if (i_0 == 4208) {
          i_3 = class69.field999[--class69.field1003];
          class269_13 = class111.method2563(i_3);
          if (class269_13.field3477 == -1 && class269_13.field3476 >= 0) {
            class69.field999[++class69.field1003 - 1] = class269_13.field3476;
          } else {
            class69.field999[++class69.field1003 - 1] = i_3;
          }

          return 1;
        } else if (i_0 == 4209) {
          i_3 = class69.field999[--class69.field1003];
          class269_13 = class111.method2563(i_3);
          if (class269_13.field3477 >= 0 && class269_13.field3476 >= 0) {
            class69.field999[++class69.field1003 - 1] = class269_13.field3476;
          } else {
            class69.field999[++class69.field1003 - 1] = i_3;
          }

          return 1;
        } else if (i_0 == 4210) {
          String string_14 = class69.field1001[--class55.field497];
          i_4 = class69.field999[--class69.field1003];
          boolean bool_6 = i_4 == 1;
          String string_5 = string_14.toLowerCase();
          short[] shorts_7 = new short[16];
          int i_8 = 0;
          int i_9 = 0;

          while (true) {
            if (i_9 >= class86.field1212) {
              class27.field231 = shorts_7;
              class55.field495 = 0;
              class126.field1778 = i_8;
              String[] arr_15 = new String[class126.field1778];

              for (int i_16 = 0; i_16 < class126.field1778; i_16++) {
                arr_15[i_16] = class111.method2563(shorts_7[i_16]).field3433;
              }

              class133.method3100(arr_15, class27.field231);
              break;
            }

            class269 class269_10 = class111.method2563(i_9);
            if ((!bool_6 || class269_10.field3436) && class269_10.field3465 == -1
                && class269_10.field3433.toLowerCase().indexOf(string_5) != -1) {
              if (i_8 >= 250) {
                class126.field1778 = -1;
                class27.field231 = null;
                break;
              }

              if (i_8 >= shorts_7.length) {
                short[] shorts_11 = new short[shorts_7.length * 2];

                for (int i_12 = 0; i_12 < i_8; i_12++) {
                  shorts_11[i_12] = shorts_7[i_12];
                }

                shorts_7 = shorts_11;
              }

              shorts_7[i_8++] = (short) i_9;
            }

            ++i_9;
          }

          class69.field999[++class69.field1003 - 1] = class126.field1778;
          return 1;
        } else if (i_0 != 4211) {
          if (i_0 == 4212) {
            class55.field495 = 0;
            return 1;
          } else {
            return 2;
          }
        } else {
          if (class27.field231 != null && class55.field495 < class126.field1778) {
            class69.field999[++class69.field1003 - 1] =
                class27.field231[++class55.field495 - 1] & 0xffff;
          } else {
            class69.field999[++class69.field1003 - 1] = -1;
          }

          return 1;
        }
      }
    }
  }

}
