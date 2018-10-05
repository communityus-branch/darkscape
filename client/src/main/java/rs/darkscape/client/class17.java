package rs.darkscape.client;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public final class class17 {

  // $FF: synthetic field
  @ObfuscatedSignature(
      signature = "Lak;"
  )
  final class30 this$0;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 595769027
  )
  int field131;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -354096829
  )
  int field133;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -907753045
  )
  int field132;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 529826899
  )
  int field134;

  @ObfuscatedSignature(
      signature = "(Lak;)V"
  )
  class17(class30 class30_1) {
    this.this$0 = class30_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1107039015"
  )
  public static int method170(int i_0, int i_1) {
    return (i_0 << 8) + i_1;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(CII)C",
      garbageValue = "2067503426"
  )
  static char method169(char var_0, int i_1) {
    if (var_0 >= 192 && var_0 <= 255) {
      if (var_0 >= 192 && var_0 <= 198) {
        return 'A';
      }

      if (var_0 == 199) {
        return 'C';
      }

      if (var_0 >= 200 && var_0 <= 203) {
        return 'E';
      }

      if (var_0 >= 204 && var_0 <= 207) {
        return 'I';
      }

      if (var_0 >= 210 && var_0 <= 214) {
        return 'O';
      }

      if (var_0 >= 217 && var_0 <= 220) {
        return 'U';
      }

      if (var_0 == 221) {
        return 'Y';
      }

      if (var_0 == 223) {
        return 's';
      }

      if (var_0 >= 224 && var_0 <= 230) {
        return 'a';
      }

      if (var_0 == 231) {
        return 'c';
      }

      if (var_0 >= 232 && var_0 <= 235) {
        return 'e';
      }

      if (var_0 >= 236 && var_0 <= 239) {
        return 'i';
      }

      if (var_0 >= 242 && var_0 <= 246) {
        return 'o';
      }

      if (var_0 >= 249 && var_0 <= 252) {
        return 'u';
      }

      if (var_0 == 253 || var_0 == 255) {
        return 'y';
      }
    }

    return var_0 == 338 ? 'O' : (var_0 == 339 ? 'o' : (var_0 == 376 ? 'Y' : var_0));
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgu;ILjava/lang/String;S)Ljava/lang/String;",
      garbageValue = "255"
  )
  static String method171(class197 class197_0, int i_1, String string_2) {
    if (class197_0 == null) {
      return string_2;
    } else {
      class195 class195_3 = (class195) class197_0.method3945((long) i_1);
      return class195_3 == null ? string_2 : (String) class195_3.field2394;
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-2023648608"
  )
  public static void method172(Buffer class182_0, int i_1) {
    class312 class312_2 = new class312();
    class312_2.field3749 = class182_0.getUInt8();
    class312_2.field3758 = class182_0.getInt32();
    class312_2.field3748 = new int[class312_2.field3749];
    class312_2.field3751 = new int[class312_2.field3749];
    class312_2.field3752 = new Field[class312_2.field3749];
    class312_2.field3753 = new int[class312_2.field3749];
    class312_2.field3754 = new Method[class312_2.field3749];
    class312_2.field3755 = new byte[class312_2.field3749][][];

    for (int i_3 = 0; i_3 < class312_2.field3749; i_3++) {
      try {
        int i_4 = class182_0.getUInt8();
        String string_5;
        String string_6;
        int i_7;
        if (i_4 != 0 && i_4 != 1 && i_4 != 2) {
          if (i_4 == 3 || i_4 == 4) {
            string_5 = class182_0.method3738();
            string_6 = class182_0.method3738();
            i_7 = class182_0.getUInt8();
            String[] arr_8 = new String[i_7];

            for (int i_9 = 0; i_9 < i_7; i_9++) {
              arr_8[i_9] = class182_0.method3738();
            }

            String string_20 = class182_0.method3738();
            byte[][] bytes_10 = new byte[i_7][];
            int i_12;
            if (i_4 == 3) {
              for (int i_11 = 0; i_11 < i_7; i_11++) {
                i_12 = class182_0.getInt32();
                bytes_10[i_11] = new byte[i_12];
                class182_0.method3539(bytes_10[i_11], 0, i_12);
              }
            }

            class312_2.field3748[i_3] = i_4;
            Class[] arr_21 = new Class[i_7];

            for (i_12 = 0; i_12 < i_7; i_12++) {
              arr_21[i_12] = SeekableFile.method2528(arr_8[i_12]);
            }

            Class class_22 = SeekableFile.method2528(string_20);
            if (SeekableFile.method2528(string_5).getClassLoader() == null) {
              throw new SecurityException();
            }

            Method[] arr_13 = SeekableFile.method2528(string_5).getDeclaredMethods();
            Method[] arr_14 = arr_13;

            for (int i_15 = 0; i_15 < arr_14.length; i_15++) {
              Method method_16 = arr_14[i_15];
              if (method_16.getName().equals(string_6)) {
                Class[] arr_17 = method_16.getParameterTypes();
                if (arr_17.length == arr_21.length) {
                  boolean bool_18 = true;

                  for (int i_19 = 0; i_19 < arr_21.length; i_19++) {
                    if (arr_17[i_19] != arr_21[i_19]) {
                      bool_18 = false;
                      break;
                    }
                  }

                  if (bool_18 && class_22 == method_16.getReturnType()) {
                    class312_2.field3754[i_3] = method_16;
                  }
                }
              }
            }

            class312_2.field3755[i_3] = bytes_10;
          }
        } else {
          string_5 = class182_0.method3738();
          string_6 = class182_0.method3738();
          i_7 = 0;
          if (i_4 == 1) {
            i_7 = class182_0.getInt32();
          }

          class312_2.field3748[i_3] = i_4;
          class312_2.field3753[i_3] = i_7;
          if (SeekableFile.method2528(string_5).getClassLoader() == null) {
            throw new SecurityException();
          }

          class312_2.field3752[i_3] = SeekableFile
              .method2528(string_5).getDeclaredField(string_6);
        }
      } catch (ClassNotFoundException classnotfoundexception_24) {
        class312_2.field3751[i_3] = -1;
      } catch (SecurityException securityexception_25) {
        class312_2.field3751[i_3] = -2;
      } catch (NullPointerException nullpointerexception_26) {
        class312_2.field3751[i_3] = -3;
      } catch (Exception exception_27) {
        class312_2.field3751[i_3] = -4;
      } catch (Throwable throwable_28) {
        class312_2.field3751[i_3] = -5;
      }
    }

    class313.field3759.method4031(class312_2);
  }

}
