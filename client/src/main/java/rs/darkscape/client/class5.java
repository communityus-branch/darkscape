package rs.darkscape.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.sign.SignLink;

@ObfuscatedName("q")
final class class5 implements Comparator {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
      garbageValue = "53"
  )
  public static void method65(String string_0, Throwable throwable_1) {
    if (throwable_1 != null) {
      throwable_1.printStackTrace();
    } else {
      try {
        String str_2 = "";
        if (throwable_1 != null) {
          Throwable throwable_4 = throwable_1;
          String str_5;
          if (throwable_1 instanceof class152) {
            class152 class152_6 = (class152) throwable_1;
            str_5 = class152_6.field1941 + " | ";
            throwable_4 = class152_6.field1943;
          } else {
            str_5 = "";
          }

          StringWriter stringwriter_18 = new StringWriter();
          PrintWriter printwriter_7 = new PrintWriter(stringwriter_18);
          throwable_4.printStackTrace(printwriter_7);
          printwriter_7.close();
          String string_8 = stringwriter_18.toString();
          BufferedReader bufferedreader_9 = new BufferedReader(new StringReader(string_8));
          String string_10 = bufferedreader_9.readLine();

          label63:
          while (true) {
            while (true) {
              String string_11 = bufferedreader_9.readLine();
              if (string_11 == null) {
                str_5 = str_5 + "| " + string_10;
                str_2 = str_5;
                break label63;
              }

              int i_12 = string_11.indexOf(40);
              int i_13 = string_11.indexOf(41, i_12 + 1);
              if (i_12 >= 0 && i_13 >= 0) {
                String string_14 = string_11.substring(i_12 + 1, i_13);
                int i_15 = string_14.indexOf(".java:");
                if (i_15 >= 0) {
                  string_14 = string_14.substring(0, i_15) + string_14.substring(i_15 + 5);
                  str_5 = str_5 + string_14 + ' ';
                  continue;
                }

                string_11 = string_11.substring(0, i_12);
              }

              string_11 = string_11.trim();
              string_11 = string_11.substring(string_11.lastIndexOf(32) + 1);
              string_11 = string_11.substring(string_11.lastIndexOf(9) + 1);
              str_5 = str_5 + string_11 + ' ';
            }
          }
        }

        if (string_0 != null) {
          if (throwable_1 != null) {
            str_2 = str_2 + " | ";
          }

          str_2 = str_2 + string_0;
        }

        System.out.println("Error: " + str_2);
        str_2 = str_2.replace(':', '.');
        str_2 = str_2.replace('@', '_');
        str_2 = str_2.replace('&', '_');
        str_2 = str_2.replace('#', '_');
        if (class152.field1938 == null) {
          return;
        }

        URL url_3 = new URL(class152.field1938.getCodeBase(),
                            "clienterror.ws?c=" + class42.field362 + "&u=" + class152.field1939
                                + "&v1=" + SignLink.javaVendor + "&v2=" + SignLink.javaVersion + "&ct="
                                + class152.field1940 + "&e=" + str_2);
        DataInputStream datainputstream_17 = new DataInputStream(url_3.openStream());
        datainputstream_17.read();
        datainputstream_17.close();
      } catch (Exception ignored) {
      }

    }
  }

  @ObfuscatedName("ab")
  @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "116"
  )
  static int method59(int i_0, class84 class84_1, boolean bool_2) {
    if (i_0 == 6500) {
      class69.field999[++class69.field1003 - 1] = class4.method36() ? 1 : 0;
      return 1;
    } else {
      class65 class65_3;
      if (i_0 == 6501) {
        class65.field944 = 0;
        class65_3 = class236.method4592();
        if (class65_3 != null) {
          class69.field999[++class69.field1003 - 1] = class65_3.field947;
          class69.field999[++class69.field1003 - 1] = class65_3.field948;
          class69.field1001[++class55.field497 - 1] = class65_3.field951;
          class69.field999[++class69.field1003 - 1] = class65_3.field952;
          class69.field999[++class69.field1003 - 1] = class65_3.field955;
          class69.field1001[++class55.field497 - 1] = class65_3.field950;
        } else {
          class69.field999[++class69.field1003 - 1] = -1;
          class69.field999[++class69.field1003 - 1] = 0;
          class69.field1001[++class55.field497 - 1] = "";
          class69.field999[++class69.field1003 - 1] = 0;
          class69.field999[++class69.field1003 - 1] = 0;
          class69.field1001[++class55.field497 - 1] = "";
        }

        return 1;
      } else if (i_0 == 6502) {
        class65_3 = class236.method4592();
        if (class65_3 != null) {
          class69.field999[++class69.field1003 - 1] = class65_3.field947;
          class69.field999[++class69.field1003 - 1] = class65_3.field948;
          class69.field1001[++class55.field497 - 1] = class65_3.field951;
          class69.field999[++class69.field1003 - 1] = class65_3.field952;
          class69.field999[++class69.field1003 - 1] = class65_3.field955;
          class69.field1001[++class55.field497 - 1] = class65_3.field950;
        } else {
          class69.field999[++class69.field1003 - 1] = -1;
          class69.field999[++class69.field1003 - 1] = 0;
          class69.field1001[++class55.field497 - 1] = "";
          class69.field999[++class69.field1003 - 1] = 0;
          class69.field999[++class69.field1003 - 1] = 0;
          class69.field1001[++class55.field497 - 1] = "";
        }

        return 1;
      } else {
        class65 class65_4;
        int i_5;
        int i_11;
        if (i_0 == 6506) {
          i_11 = class69.field999[--class69.field1003];
          class65_4 = null;

          for (i_5 = 0; i_5 < class65.field945; i_5++) {
            if (i_11 == class65.field949[i_5].field947) {
              class65_4 = class65.field949[i_5];
              break;
            }
          }

          if (class65_4 != null) {
            class69.field999[++class69.field1003 - 1] = class65_4.field947;
            class69.field999[++class69.field1003 - 1] = class65_4.field948;
            class69.field1001[++class55.field497 - 1] = class65_4.field951;
            class69.field999[++class69.field1003 - 1] = class65_4.field952;
            class69.field999[++class69.field1003 - 1] = class65_4.field955;
            class69.field1001[++class55.field497 - 1] = class65_4.field950;
          } else {
            class69.field999[++class69.field1003 - 1] = -1;
            class69.field999[++class69.field1003 - 1] = 0;
            class69.field1001[++class55.field497 - 1] = "";
            class69.field999[++class69.field1003 - 1] = 0;
            class69.field999[++class69.field1003 - 1] = 0;
            class69.field1001[++class55.field497 - 1] = "";
          }

          return 1;
        } else if (i_0 == 6507) {
          class69.field1003 -= 4;
          i_11 = class69.field999[class69.field1003];
          boolean bool_15 = class69.field999[class69.field1003 + 1] == 1;
          i_5 = class69.field999[class69.field1003 + 2];
          boolean bool_6 = class69.field999[class69.field1003 + 3] == 1;
          if (class65.field949 != null) {
            class120.method2781(0, class65.field949.length - 1, i_11, bool_15, i_5, bool_6);
          }

          return 1;
        } else if (i_0 != 6511) {
          if (i_0 == 6512) {
            client.field725 = class69.field999[--class69.field1003] == 1;
            return 1;
          } else {
            int i_12;
            class264 class264_13;
            if (i_0 == 6513) {
              class69.field1003 -= 2;
              i_11 = class69.field999[class69.field1003];
              i_12 = class69.field999[class69.field1003 + 1];
              class264_13 = class241.method4603(i_12);
              if (class264_13.method4951()) {
                class69.field1001[++class55.field497 - 1] = class270.method5157(i_11)
                    .method5167(i_12, class264_13.field3333);
              } else {
                class69.field999[++class69.field1003 - 1] = class270.method5157(i_11)
                    .method5166(i_12, class264_13.field3330);
              }

              return 1;
            } else if (i_0 == 6514) {
              class69.field1003 -= 2;
              i_11 = class69.field999[class69.field1003];
              i_12 = class69.field999[class69.field1003 + 1];
              class264_13 = class241.method4603(i_12);
              if (class264_13.method4951()) {
                class69.field1001[++class55.field497 - 1] = SeekableFile
                    .method2527(i_11).method5036(i_12, class264_13.field3333);
              } else {
                class69.field999[++class69.field1003 - 1] = SeekableFile
                    .method2527(i_11).method5035(i_12, class264_13.field3330);
              }

              return 1;
            } else if (i_0 == 6515) {
              class69.field1003 -= 2;
              i_11 = class69.field999[class69.field1003];
              i_12 = class69.field999[class69.field1003 + 1];
              class264_13 = class241.method4603(i_12);
              if (class264_13.method4951()) {
                class69.field1001[++class55.field497 - 1] = class111.method2563(i_11)
                    .method5121(i_12, class264_13.field3333);
              } else {
                class69.field999[++class69.field1003 - 1] = class111.method2563(i_11)
                    .method5099(i_12, class264_13.field3330);
              }

              return 1;
            } else if (i_0 == 6516) {
              class69.field1003 -= 2;
              i_11 = class69.field999[class69.field1003];
              i_12 = class69.field999[class69.field1003 + 1];
              class264_13 = class241.method4603(i_12);
              int i_7;
              class265 class265_8;
              class265 class265_9;
              byte[] bytes_10;
              if (class264_13.method4951()) {
                String[] arr_14 = class69.field1001;
                i_7 = ++class55.field497 - 1;
                class265_9 = (class265) class265.field3334.method3989((long) i_11);
                if (class265_9 != null) {
                  class265_8 = class265_9;
                } else {
                  bytes_10 = class7.field42.method4625(34, i_11);
                  class265_9 = new class265();
                  if (bytes_10 != null) {
                    class265_9.method4960(new Buffer(bytes_10));
                  }

                  class265_9.method4961();
                  class265.field3334.method3983(class265_9, (long) i_11);
                  class265_8 = class265_9;
                }

                arr_14[i_7] = class265_8.method4963(i_12, class264_13.field3333);
              } else {
                int[] ints_16 = class69.field999;
                i_7 = ++class69.field1003 - 1;
                class265_9 = (class265) class265.field3334.method3989((long) i_11);
                if (class265_9 != null) {
                  class265_8 = class265_9;
                } else {
                  bytes_10 = class7.field42.method4625(34, i_11);
                  class265_9 = new class265();
                  if (bytes_10 != null) {
                    class265_9.method4960(new Buffer(bytes_10));
                  }

                  class265_9.method4961();
                  class265.field3334.method3983(class265_9, (long) i_11);
                  class265_8 = class265_9;
                }

                ints_16[i_7] = class265_8.method4962(i_12, class264_13.field3330);
              }

              return 1;
            } else if (i_0 == 6518) {
              class69.field999[++class69.field1003 - 1] = client.field588 ? 1 : 0;
              return 1;
            } else if (i_0 == 6520) {
              return 1;
            } else if (i_0 == 6521) {
              return 1;
            } else if (i_0 == 6522) {
              --class55.field497;
              --class69.field1003;
              return 1;
            } else if (i_0 == 6523) {
              --class55.field497;
              --class69.field1003;
              return 1;
            } else if (i_0 == 6524) {
              class69.field999[++class69.field1003 - 1] = -1;
              return 1;
            } else if (i_0 == 6525) {
              class69.field999[++class69.field1003 - 1] = 1;
              return 1;
            } else if (i_0 == 6526) {
              class69.field999[++class69.field1003 - 1] = 1;
              return 1;
            } else {
              return 2;
            }
          }
        } else {
          i_11 = class69.field999[--class69.field1003];
          if (i_11 >= 0 && i_11 < class65.field945) {
            class65_4 = class65.field949[i_11];
            class69.field999[++class69.field1003 - 1] = class65_4.field947;
            class69.field999[++class69.field1003 - 1] = class65_4.field948;
            class69.field1001[++class55.field497 - 1] = class65_4.field951;
            class69.field999[++class69.field1003 - 1] = class65_4.field952;
            class69.field999[++class69.field1003 - 1] = class65_4.field955;
            class69.field1001[++class55.field497 - 1] = class65_4.field950;
          } else {
            class69.field999[++class69.field1003 - 1] = -1;
            class69.field999[++class69.field1003 - 1] = 0;
            class69.field1001[++class55.field497 - 1] = "";
            class69.field999[++class69.field1003 - 1] = 0;
            class69.field999[++class69.field1003 - 1] = 0;
            class69.field1001[++class55.field497 - 1] = "";
          }

          return 1;
        }
      }
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ls;Ls;B)I",
      garbageValue = "43"
  )
  int method58(class2 class2_1, class2 class2_2) {
    return class2_1.field17.field30 < class2_2.field17.field30 ? -1
        : (class2_2.field17.field30 == class2_1.field17.field30 ? 0 : 1);
  }

  public boolean equals(Object object_1) {
    return super.equals(object_1);
  }

  public int compare(Object object_1, Object object_2) {
    return this.method58((class2) object_1, (class2) object_2);
  }

}
