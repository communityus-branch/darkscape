package rs.darkscape.client;

import java.awt.FontMetrics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.util.Time;

@ObfuscatedName("aw")
public class class29 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Law;"
  )
  public static final class29 field252 = new class29("details");
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Law;"
  )
  public static final class29 field251 = new class29("compositemap");
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Law;"
  )
  public static final class29 field257 = new class29("compositetexture");
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Law;"
  )
  public static final class29 field262 = new class29("area");
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Law;"
  )
  public static final class29 field254 = new class29("labels");
  @ObfuscatedName("ak")
  static FontMetrics field256;
  @ObfuscatedName("ff")
  static byte[][] field253;
  @ObfuscatedName("ic")
  @ObfuscatedSignature(
      signature = "Lde;"
  )
  static class111 field250;
  @ObfuscatedName("q")
  public final String field255;

  class29(String string_1) {
    this.field255 = string_1;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1545308790"
  )
  static void method476() {
    try {
      File file_0 = new File(class18.field143, "random.dat");
      int i_2;
      if (file_0.exists()) {
        class155.field1968 = new BufferedFile(new SeekableFile(file_0, "rw", 25L), 24, 0);
      } else {
        label38:
        for (int i_1 = 0; i_1 < class8.filestoreLocation.length; i_1++) {
          for (i_2 = 0; i_2 < class155.cacheLocation.length; i_2++) {
            File file_3 = new File(
                class155.cacheLocation[i_2] + class8.filestoreLocation[i_1] + File.separatorChar
                    + "random.dat");
            if (file_3.exists()) {
              class155.field1968 = new BufferedFile(new SeekableFile(file_3, "rw", 25L), 24, 0);
              break label38;
            }
          }
        }
      }

      if (class155.field1968 == null) {
        RandomAccessFile randomaccessfile_4 = new RandomAccessFile(file_0, "rw");
        i_2 = randomaccessfile_4.read();
        randomaccessfile_4.seek(0L);
        randomaccessfile_4.write(i_2);
        randomaccessfile_4.seek(0L);
        randomaccessfile_4.close();
        class155.field1968 = new BufferedFile(new SeekableFile(file_0, "rw", 25L), 24, 0);
      }
    } catch (IOException ignored) {
    }

  }

  @ObfuscatedName("t")
  @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "123"
  )
  static int method477(int i_0, class84 class84_1, boolean bool_2) {
    int i_3;
    if (i_0 == 3903) {
      i_3 = class69.field999[--class69.field1003];
      class69.field999[++class69.field1003 - 1] = client.field844[i_3].method39();
      return 1;
    } else if (i_0 == 3904) {
      i_3 = class69.field999[--class69.field1003];
      class69.field999[++class69.field1003 - 1] = client.field844[i_3].field29;
      return 1;
    } else if (i_0 == 3905) {
      i_3 = class69.field999[--class69.field1003];
      class69.field999[++class69.field1003 - 1] = client.field844[i_3].field30;
      return 1;
    } else if (i_0 == 3906) {
      i_3 = class69.field999[--class69.field1003];
      class69.field999[++class69.field1003 - 1] = client.field844[i_3].field33;
      return 1;
    } else if (i_0 == 3907) {
      i_3 = class69.field999[--class69.field1003];
      class69.field999[++class69.field1003 - 1] = client.field844[i_3].field32;
      return 1;
    } else if (i_0 == 3908) {
      i_3 = class69.field999[--class69.field1003];
      class69.field999[++class69.field1003 - 1] = client.field844[i_3].field28;
      return 1;
    } else {
      int i_12;
      if (i_0 == 3910) {
        i_3 = class69.field999[--class69.field1003];
        i_12 = client.field844[i_3].method38();
        class69.field999[++class69.field1003 - 1] = i_12 == 0 ? 1 : 0;
        return 1;
      } else if (i_0 == 3911) {
        i_3 = class69.field999[--class69.field1003];
        i_12 = client.field844[i_3].method38();
        class69.field999[++class69.field1003 - 1] = i_12 == 2 ? 1 : 0;
        return 1;
      } else if (i_0 == 3912) {
        i_3 = class69.field999[--class69.field1003];
        i_12 = client.field844[i_3].method38();
        class69.field999[++class69.field1003 - 1] = i_12 == 5 ? 1 : 0;
        return 1;
      } else if (i_0 == 3913) {
        i_3 = class69.field999[--class69.field1003];
        i_12 = client.field844[i_3].method38();
        class69.field999[++class69.field1003 - 1] = i_12 == 1 ? 1 : 0;
        return 1;
      } else {
        boolean bool_13;
        if (i_0 == 3914) {
          bool_13 = class69.field999[--class69.field1003] == 1;
          if (class19.field154 != null) {
            class19.field154.method9(class1.field11, bool_13);
          }

          return 1;
        } else if (i_0 == 3915) {
          bool_13 = class69.field999[--class69.field1003] == 1;
          if (class19.field154 != null) {
            class19.field154.method9(class1.field13, bool_13);
          }

          return 1;
        } else if (i_0 == 3916) {
          class69.field1003 -= 2;
          bool_13 = class69.field999[class69.field1003] == 1;
          boolean bool_4 = class69.field999[class69.field1003 + 1] == 1;
          if (class19.field154 != null) {
            client.field665.field575 = bool_4;
            class19.field154.method9(client.field665, bool_13);
          }

          return 1;
        } else if (i_0 == 3917) {
          bool_13 = class69.field999[--class69.field1003] == 1;
          if (class19.field154 != null) {
            class19.field154.method9(class1.field9, bool_13);
          }

          return 1;
        } else if (i_0 == 3918) {
          bool_13 = class69.field999[--class69.field1003] == 1;
          if (class19.field154 != null) {
            class19.field154.method9(class1.field16, bool_13);
          }

          return 1;
        } else if (i_0 == 3919) {
          class69.field999[++class69.field1003 - 1] =
              class19.field154 == null ? 0 : class19.field154.field10.size();
          return 1;
        } else {
          class2 class2_11;
          if (i_0 == 3920) {
            i_3 = class69.field999[--class69.field1003];
            class2_11 = (class2) class19.field154.field10.get(i_3);
            class69.field999[++class69.field1003 - 1] = class2_11.field19;
            return 1;
          } else if (i_0 == 3921) {
            i_3 = class69.field999[--class69.field1003];
            class2_11 = (class2) class19.field154.field10.get(i_3);
            class69.field1001[++class55.field497 - 1] = class2_11.method16();
            return 1;
          } else if (i_0 == 3922) {
            i_3 = class69.field999[--class69.field1003];
            class2_11 = (class2) class19.field154.field10.get(i_3);
            class69.field1001[++class55.field497 - 1] = class2_11.method18();
            return 1;
          } else if (i_0 == 3923) {
            i_3 = class69.field999[--class69.field1003];
            class2_11 = (class2) class19.field154.field10.get(i_3);
            long long_5 = Time.currentTimeMillis() - class70.field1013 - class2_11.field20;
            int i_7 = (int) (long_5 / 3600000L);
            int i_8 = (int) ((long_5 - (long) (i_7 * 3600000)) / 60000L);
            int i_9 = (int) ((long_5 - (long) (i_7 * 3600000) - (long) (i_8 * 60000)) / 1000L);
            String string_10 = i_7 + ":" + i_8 / 10 + i_8 % 10 + ":" + i_9 / 10 + i_9 % 10;
            class69.field1001[++class55.field497 - 1] = string_10;
            return 1;
          } else if (i_0 == 3924) {
            i_3 = class69.field999[--class69.field1003];
            class2_11 = (class2) class19.field154.field10.get(i_3);
            class69.field999[++class69.field1003 - 1] = class2_11.field17.field33;
            return 1;
          } else if (i_0 == 3925) {
            i_3 = class69.field999[--class69.field1003];
            class2_11 = (class2) class19.field154.field10.get(i_3);
            class69.field999[++class69.field1003 - 1] = class2_11.field17.field30;
            return 1;
          } else if (i_0 == 3926) {
            i_3 = class69.field999[--class69.field1003];
            class2_11 = (class2) class19.field154.field10.get(i_3);
            class69.field999[++class69.field1003 - 1] = class2_11.field17.field29;
            return 1;
          } else {
            return 2;
          }
        }
      }
    }
  }

  @ObfuscatedName("fd")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "120"
  )
  static void method478() {
    int i_0;
    if (client.field609 == 0) {
      class28.field248 = new class125(4, 104, 104, class50.field459);

      for (i_0 = 0; i_0 < 4; i_0++) {
        client.field642[i_0] = new class164(104, 104);
      }

      class72.field1038 = new class318(512, 512);
      class78.field1100 = "Starting game engine...";
      class78.field1099 = 5;
      client.field609 = 20;
    } else {
      int i_1;
      int i_2;
      int i_3;
      int i_4;
      if (client.field609 == 20) {
        int[] ints_33 = new int[9];

        for (i_1 = 0; i_1 < 9; i_1++) {
          i_2 = i_1 * 32 + 15 + 128;
          i_3 = i_2 * 3 + 600;
          i_4 = class122.field1681[i_2];
          ints_33[i_1] = i_4 * i_3 >> 16;
        }

        class125.method2893(ints_33, 500, 800, 512, 334);
        class78.field1100 = "Prepared visibility map";
        class78.field1099 = 10;
        client.field609 = 30;
      } else if (client.field609 == 30) {
        class77.field1079 = class53.method1009(0, false, true, true);
        class37.field326 = class53.method1009(1, false, true, true);
        class97.field1329 = class53.method1009(2, true, false, true);
        class224.field2548 = class53.method1009(3, false, true, true);
        class135.field1852 = class53.method1009(4, false, true, true);
        RemoteArchiveRequest.field3159 = class53.method1009(5, true, true, true);
        class80.field1147 = class53.method1009(6, true, true, true);
        class21.field179 = class53.method1009(7, false, true, true);
        class175.field2270 = class53.method1009(8, false, true, true);
        class268.field3419 = class53.method1009(9, false, true, true);
        class22.field183 = class53.method1009(10, false, true, true);
        class61.field576 = class53.method1009(11, false, true, true);
        client.field854 = class53.method1009(12, false, true, true);
        class50.field461 = class53.method1009(13, true, false, true);
        class59.field543 = class53.method1009(14, false, true, true);
        class36.field312 = class53.method1009(15, false, true, true);
        class24.field207 = class53.method1009(16, true, true, true);
        class78.field1100 = "Connecting to update server";
        class78.field1099 = 20;
        client.field609 = 40;
      } else if (client.field609 == 40) {
        byte b_30 = 0;
        i_0 = b_30 + class77.field1079.method4720() * 4 / 100;
        i_0 += class37.field326.method4720() * 4 / 100;
        i_0 += class97.field1329.method4720() * 2 / 100;
        i_0 += class224.field2548.method4720() * 2 / 100;
        i_0 += class135.field1852.method4720() * 6 / 100;
        i_0 += RemoteArchiveRequest.field3159.method4720() * 4 / 100;
        i_0 += class80.field1147.method4720() * 2 / 100;
        i_0 += class21.field179.method4720() * 58 / 100;
        i_0 += class175.field2270.method4720() * 2 / 100;
        i_0 += class268.field3419.method4720() * 2 / 100;
        i_0 += class22.field183.method4720() * 2 / 100;
        i_0 += class61.field576.method4720() * 2 / 100;
        i_0 += client.field854.method4720() * 2 / 100;
        i_0 += class50.field461.method4720() * 2 / 100;
        i_0 += class59.field543.method4720() * 2 / 100;
        i_0 += class36.field312.method4720() * 2 / 100;
        i_0 += class24.field207.method4720() * 2 / 100;
        if (i_0 != 100) {
          if (i_0 != 0) {
            class78.field1100 = "Checking for updates - " + i_0 + "%";
          }

          class78.field1099 = 30;
        } else {
          class32.method548(class77.field1079, "Animations");
          class32.method548(class37.field326, "Skeletons");
          class32.method548(class135.field1852, "Sound FX");
          class32.method548(RemoteArchiveRequest.field3159, "Maps");
          class32.method548(class80.field1147, "Music Tracks");
          class32.method548(class21.field179, "Models");
          class32.method548(class175.field2270, "Sprites");
          class32.method548(class61.field576, "Music Jingles");
          class32.method548(class59.field543, "Music Samples");
          class32.method548(class36.field312, "Music Patches");
          class32.method548(class24.field207, "World Map");
          class78.field1100 = "Loaded update list";
          class78.field1099 = 30;
          client.field609 = 45;
        }
      } else {
        class249 class249_25;
        class249 class249_27;
        if (client.field609 == 45) {
          class68.method1697(22050, !client.field585, 2);
          class218 class218_32 = new class218();
          class218_32.method4257(9, 128);
          class28.field244 = class65.method1582(class47.field392, 0, 22050);
          class28.field244.method2143(class218_32);
          class249_25 = class36.field312;
          class249 class249_26 = class59.field543;
          class249_27 = class135.field1852;
          class177.field2284 = class249_25;
          class217.field2464 = class249_26;
          class217.field2458 = class249_27;
          class217.field2459 = class218_32;
          class63.field879 = class65.method1582(class47.field392, 1, 2048);
          class36.field310 = new class88();
          class63.field879.method2143(class36.field310);
          class61.field577 = new class102(22050, class95.field1300);
          class78.field1100 = "Prepared sound engine";
          class78.field1099 = 35;
          client.field609 = 50;
          class1.field14 = new class296(class175.field2270, class50.field461);
        } else if (client.field609 == 50) {
          i_0 = class295.method5498().length;
          client.field631 = class1.field14.method5504(class295.method5498());
          if (client.field631.size() < i_0) {
            class78.field1100 = "Loading fonts - " + client.field631.size() * 100 / i_0 + "%";
            class78.field1099 = 40;
          } else {
            Temp.field1936 = (class298) client.field631.get(class295.field3678);
            class63.field933 = (class298) client.field631.get(class295.field3672);
            class293.field3660 = (class298) client.field631.get(class295.field3668);
            class27.field228 = new ComputerInformation();
            class78.field1100 = "Loaded fonts";
            class78.field1099 = 40;
            client.field609 = 60;
          }
        } else if (client.field609 == 60) {
          i_0 = class224.method4426(class22.field183, class175.field2270);
          i_1 = class11.method99();
          if (i_0 < i_1) {
            class78.field1100 = "Loading title screen - " + i_0 * 100 / i_1 + "%";
            class78.field1099 = 50;
          } else {
            class78.field1100 = "Loaded title screen";
            class78.field1099 = 50;
            Mouse.method947(5);
            client.field609 = 70;
          }
        } else if (client.field609 == 70) {
          if (!class97.field1329.method4629()) {
            class78.field1100 = "Loading config - " + class97.field1329.method4755() + "%";
            class78.field1099 = 60;
          } else {
            class21.method277(class97.field1329);
            class58.method1069(class97.field1329);
            class257.method4851(class97.field1329, class21.field179);
            class249 class249_31 = class97.field1329;
            class249_25 = class21.field179;
            boolean bool_29 = client.field585;
            class268.field3377 = class249_31;
            class130.field1801 = class249_25;
            class268.field3416 = bool_29;
            class249_27 = class97.field1329;
            class249 class249_28 = class21.field179;
            class271.field3490 = class249_27;
            class271.field3487 = class249_28;
            class249 class249_5 = class97.field1329;
            class7.field42 = class249_5;
            class249 class249_6 = class97.field1329;
            class249 class249_7 = class21.field179;
            boolean bool_8 = client.field668;
            class298 class298_9 = Temp.field1936;
            class269.field3424 = class249_6;
            class269.field3454 = class249_7;
            class269.field3426 = bool_8;
            class86.field1212 = class269.field3424.method4636(10);
            class269.field3466 = class298_9;
            class249 class249_10 = class97.field1329;
            class249 class249_11 = class77.field1079;
            class249 class249_12 = class37.field326;
            class273.field3538 = class249_10;
            class273.field3536 = class249_11;
            class273.field3537 = class249_12;
            class249 class249_13 = class97.field1329;
            class249 class249_14 = class21.field179;
            class258.field3272 = class249_13;
            class258.field3279 = class249_14;
            class249 class249_15 = class97.field1329;
            class263.field3322 = class249_15;
            class249 class249_16 = class97.field1329;
            class0.field2 = class249_16;
            class254.field3232 = class0.field2.method4636(16);
            class11.method100(class224.field2548, class21.field179, class175.field2270,
                              class50.field461);
            class160.method3344(class97.field1329);
            class249 class249_17 = class97.field1329;
            class266.field3338 = class249_17;
            class129.method3072(class97.field1329);
            class249 class249_18 = class97.field1329;
            class257.field3264 = class249_18;
            class249 class249_19 = class97.field1329;
            class264.field3327 = class249_19;
            class22.field185 = new class82();
            AssetService.method4766(class97.field1329, class175.field2270, class50.field461);
            class144.method3181(class97.field1329, class175.field2270);
            class249 class249_20 = class97.field1329;
            class249 class249_21 = class175.field2270;
            class255.field3237 = class249_21;
            if (class249_20.method4629()) {
              class255.field3236 = class249_20.method4636(35);
              class255.field3246 = new class255[class255.field3236];

              for (int i_22 = 0; i_22 < class255.field3236; i_22++) {
                byte[] bytes_23 = class249_20.method4625(35, i_22);
                if (bytes_23 != null) {
                  class255.field3246[i_22] = new class255(i_22);
                  class255.field3246[i_22].method4816(new Buffer(bytes_23));
                  class255.field3246[i_22].method4828();
                }
              }
            }

            class78.field1100 = "Loaded config";
            class78.field1099 = 60;
            client.field609 = 80;
          }
        } else if (client.field609 == 80) {
          i_0 = 0;
          if (class128.field1791 == null) {
            class128.field1791 = class137.method3127(class175.field2270, "compass", "");
          } else {
            ++i_0;
          }

          if (class136.field1862 == null) {
            class136.field1862 = class137.method3127(class175.field2270, "mapedge", "");
          } else {
            ++i_0;
          }

          if (class25.field214 == null) {
            class25.field214 = class13.method113(class175.field2270, "mapscene", "");
          } else {
            ++i_0;
          }

          if (class150.field1919 == null) {
            class150.field1919 = class21.method279(class175.field2270, "headicons_pk", "");
          } else {
            ++i_0;
          }

          if (class43.field369 == null) {
            class43.field369 = class21.method279(class175.field2270, "headicons_prayer", "");
          } else {
            ++i_0;
          }

          if (class150.field1926 == null) {
            class150.field1926 = class21.method279(class175.field2270, "headicons_hint", "");
          } else {
            ++i_0;
          }

          if (class111.field1446 == null) {
            class111.field1446 = class21.method279(class175.field2270, "mapmarker", "");
          } else {
            ++i_0;
          }

          if (ReadBlockingSocket.field1997 == null) {
            ReadBlockingSocket.field1997 = class21.method279(class175.field2270, "cross", "");
          } else {
            ++i_0;
          }

          if (class36.field314 == null) {
            class36.field314 = class21.method279(class175.field2270, "mapdots", "");
          } else {
            ++i_0;
          }

          if (class243.field3139 == null) {
            class243.field3139 = class13.method113(class175.field2270, "scrollbar", "");
          } else {
            ++i_0;
          }

          if (class322.field3881 == null) {
            class322.field3881 = class13.method113(class175.field2270, "mod_icons", "");
          } else {
            ++i_0;
          }

          if (i_0 < 11) {
            class78.field1100 = "Loading sprites - " + i_0 * 100 / 12 + "%";
            class78.field1099 = 70;
          } else {
            class299.field3698 = class322.field3881;
            class136.field1862.method5843();
            i_1 = (int) (Math.random() * 21.0D) - 10;
            i_2 = (int) (Math.random() * 21.0D) - 10;
            i_3 = (int) (Math.random() * 21.0D) - 10;
            i_4 = (int) (Math.random() * 41.0D) - 20;
            class25.field214[0].method5822(i_1 + i_4, i_2 + i_4, i_3 + i_4);
            class78.field1100 = "Loaded sprites";
            class78.field1099 = 70;
            client.field609 = 90;
          }
        } else if (client.field609 == 90) {
          if (!class268.field3419.method4629()) {
            class78.field1100 = "Loading textures - " + "0%";
            class78.field1099 = 90;
          } else {
            field250 = new class111(class268.field3419, class175.field2270, 20, 0.8D,
                                    client.field585 ? 64 : 128);
            class122.method2789(field250);
            class122.method2830(0.8D);
            client.field609 = 100;
          }
        } else if (client.field609 == 100) {
          i_0 = field250.method2530();
          if (i_0 < 100) {
            class78.field1100 = "Loading textures - " + i_0 + "%";
            class78.field1099 = 90;
          } else {
            class78.field1100 = "Loaded textures";
            class78.field1099 = 90;
            client.field609 = 110;
          }
        } else if (client.field609 == 110) {
          class26.field220 = new class57();
          class47.field392.startThread(class26.field220, 10);
          class78.field1100 = "Loaded input handler";
          class78.field1099 = 92;
          client.field609 = 120;
        } else if (client.field609 == 120) {
          if (!class22.field183.method4646("huffman", "")) {
            class78.field1100 = "Loading wordpack - " + 0 + "%";
            class78.field1099 = 94;
          } else {
            class174 class174_24 = new class174(class22.field183.method4684("huffman", ""));
            class181.method3529(class174_24);
            class78.field1100 = "Loaded wordpack";
            class78.field1099 = 94;
            client.field609 = 130;
          }
        } else if (client.field609 == 130) {
          if (!class224.field2548.method4629()) {
            class78.field1100 =
                "Loading interfaces - " + class224.field2548.method4755() * 4 / 5 + "%";
            class78.field1099 = 96;
          } else if (!client.field854.method4629()) {
            class78.field1100 =
                "Loading interfaces - " + (80 + client.field854.method4755() / 6) + "%";
            class78.field1099 = 96;
          } else if (!class50.field461.method4629()) {
            class78.field1100 =
                "Loading interfaces - " + (96 + class50.field461.method4755() / 50) + "%";
            class78.field1099 = 96;
          } else {
            class78.field1100 = "Loaded interfaces";
            class78.field1099 = 98;
            client.field609 = 140;
          }
        } else if (client.field609 == 140) {
          class78.field1099 = 100;
          if (!class24.field207.method4704(field252.field255)) {
            class78.field1100 =
                "Loading world map - " + class24.field207.method4687(field252.field255) / 10 + "%";
          } else {
            if (class53.field476 == null) {
              class53.field476 = new class321();
              class53.field476.method6000(class24.field207, class293.field3660, client.field631,
                                          class25.field214);
            }

            i_0 = class53.field476.method6094();
            if (i_0 < 100) {
              class78.field1100 = "Loading world map - " + (i_0 * 9 / 10 + 10) + "%";
            } else {
              class78.field1100 = "Loaded world map";
              client.field609 = 150;
            }
          }
        } else if (client.field609 == 150) {
          Mouse.method947(10);
        }
      }
    }
  }

  @ObfuscatedName("hk")
  @ObfuscatedSignature(
      signature = "(Lfl;S)V",
      garbageValue = "-22268"
  )
  static final void method479(class171 class171_0) {
    PacketBuffer class189_1 = client.field626.field1219;
    int i_2;
    int i_3;
    int i_4;
    byte b_5;
    int i_6;
    int i_7;
    int i_8;
    int i_9;
    int i_10;
    int i_12;
    int i_13;
    int i_37;
    int i_39;
    if (class171.field2246 == class171_0) {
      i_2 = class189_1.getUInt16();
      i_3 = class189_1.method3551();
      byte b_38 = class189_1.getInt8();
      b_5 = class189_1.method3660();
      i_6 = class189_1.getUInt8() * 4;
      i_7 = class189_1.method3765();
      i_8 = class189_1.method3765();
      i_9 = class189_1.method3765();
      i_10 = (i_9 >> 4 & 0x7) + class57.field524;
      i_39 = (i_9 & 0x7) + class226.field2568;
      i_12 = class189_1.method3613();
      i_13 = class189_1.method3577() * 4;
      int i_40 = class189_1.getUInt16();
      i_4 = b_38 + i_10;
      i_37 = b_5 + i_39;
      if (i_10 >= 0 && i_39 >= 0 && i_10 < 104 && i_39 < 104 && i_4 >= 0 && i_37 >= 0 && i_4 < 104
          && i_37 < 104 && i_12 != 65535) {
        i_10 = i_10 * 128 + 64;
        i_39 = i_39 * 128 + 64;
        i_4 = i_4 * 128 + 64;
        i_37 = i_37 * 128 + 64;
        class79 class79_15 = new class79(i_12, class13.field82, i_10, i_39,
                                         class27.method460(i_10, i_39, class13.field82) - i_13,
                                         i_40 + client.field591, i_2 + client.field591, i_7, i_8,
                                         i_3, i_6);
        class79_15.method1849(i_4, i_37, class27.method460(i_4, i_37, class13.field82) - i_6,
                              i_40 + client.field591);
        client.field710.addLast(class79_15);
      }

    } else if (class171.field2243 == class171_0) {
      i_2 = class189_1.method3607();
      i_3 = (i_2 >> 4 & 0x7) + class57.field524;
      i_4 = (i_2 & 0x7) + class226.field2568;
      i_37 = class189_1.method3765();
      i_6 = i_37 >> 2;
      i_7 = i_37 & 0x3;
      i_8 = client.field846[i_6];
      i_9 = class189_1.method3613();
      if (i_3 >= 0 && i_4 >= 0 && i_3 < 104 && i_4 < 104) {
        class241.method4602(class13.field82, i_3, i_4, i_8, i_9, i_6, i_7, 0, -1);
      }

    } else if (class171.field2248 == class171_0) {
      i_2 = class189_1.method3646();
      i_3 = class189_1.getUInt8();
      i_4 = i_3 >> 2;
      i_37 = i_3 & 0x3;
      i_6 = client.field846[i_4];
      i_7 = class189_1.getUInt8();
      i_8 = (i_7 >> 4 & 0x7) + class57.field524;
      i_9 = (i_7 & 0x7) + class226.field2568;
      if (i_8 >= 0 && i_9 >= 0 && i_8 < 103 && i_9 < 103) {
        if (i_6 == 0) {
          class128 class128_31 = class28.field248.method2894(class13.field82, i_8, i_9);
          if (class128_31 != null) {
            i_39 = Keyboard.method673(class128_31.field1786);
            if (i_4 == 2) {
              class128_31.field1787 = new class85(i_39, 2, i_37 + 4, class13.field82, i_8, i_9, i_2,
                                                  false, class128_31.field1787);
              class128_31.field1788 = new class85(i_39, 2, i_37 + 1 & 0x3, class13.field82, i_8,
                                                  i_9, i_2, false, class128_31.field1788);
            } else {
              class128_31.field1787 = new class85(i_39, i_4, i_37, class13.field82, i_8, i_9, i_2,
                                                  false, class128_31.field1787);
            }
          }
        }

        if (i_6 == 1) {
          class133 class133_41 = class28.field248.method2895(class13.field82, i_8, i_9);
          if (class133_41 != null) {
            i_39 = Keyboard.method673(class133_41.field1824);
            if (i_4 != 4 && i_4 != 5) {
              if (i_4 == 6) {
                class133_41.field1823 = new class85(i_39, 4, i_37 + 4, class13.field82, i_8, i_9,
                                                    i_2, false, class133_41.field1823);
              } else if (i_4 == 7) {
                class133_41.field1823 = new class85(i_39, 4, (i_37 + 2 & 0x3) + 4, class13.field82,
                                                    i_8, i_9, i_2, false, class133_41.field1823);
              } else if (i_4 == 8) {
                class133_41.field1823 = new class85(i_39, 4, i_37 + 4, class13.field82, i_8, i_9,
                                                    i_2, false, class133_41.field1823);
                class133_41.field1831 = new class85(i_39, 4, (i_37 + 2 & 0x3) + 4, class13.field82,
                                                    i_8, i_9, i_2, false, class133_41.field1831);
              }
            } else {
              class133_41.field1823 = new class85(i_39, 4, i_37, class13.field82, i_8, i_9, i_2,
                                                  false, class133_41.field1823);
            }
          }
        }

        if (i_6 == 2) {
          class134 class134_42 = class28.field248.method2896(class13.field82, i_8, i_9);
          if (i_4 == 11) {
            i_4 = 10;
          }

          if (class134_42 != null) {
            class134_42.field1844 = new class85(Keyboard.method673(class134_42.field1848), i_4, i_37,
                                                class13.field82, i_8, i_9, i_2, false,
                                                class134_42.field1844);
          }
        }

        if (i_6 == 3) {
          class115 class115_43 = class28.field248.method2953(class13.field82, i_8, i_9);
          if (class115_43 != null) {
            class115_43.field1524 = new class85(Keyboard.method673(class115_43.field1526), 22, i_37,
                                                class13.field82, i_8, i_9, i_2, false,
                                                class115_43.field1524);
          }
        }
      }

    } else if (class171.field2241 == class171_0) {
      i_2 = class189_1.getUInt16();
      i_3 = class189_1.getUInt16();
      i_4 = class189_1.method3765();
      i_37 = (i_4 >> 4 & 0x7) + class57.field524;
      i_6 = (i_4 & 0x7) + class226.field2568;
      i_7 = class189_1.getUInt8();
      if (i_37 >= 0 && i_6 >= 0 && i_37 < 104 && i_6 < 104) {
        i_37 = i_37 * 128 + 64;
        i_6 = i_6 * 128 + 64;
        class70 class70_44 = new class70(i_2, class13.field82, i_37, i_6,
                                         class27.method460(i_37, i_6, class13.field82) - i_7, i_3,
                                         client.field591);
        client.field711.addLast(class70_44);
      }

    } else {
      class80 class80_33;
      if (class171.field2249 == class171_0) {
        i_2 = class189_1.method3765();
        i_3 = (i_2 >> 4 & 0x7) + class57.field524;
        i_4 = (i_2 & 0x7) + class226.field2568;
        i_37 = class189_1.method3613();
        i_6 = class189_1.method3585();
        if (i_3 >= 0 && i_4 >= 0 && i_3 < 104 && i_4 < 104) {
          class80_33 = new class80();
          class80_33.field1151 = i_37;
          class80_33.field1148 = i_6;
          if (client.field708[class13.field82][i_3][i_4] == null) {
            client.field708[class13.field82][i_3][i_4] = new Deque();
          }

          client.field708[class13.field82][i_3][i_4].addLast(class80_33);
          class253.method4808(i_3, i_4);
        }

      } else if (class171.field2247 == class171_0) {
        i_2 = class189_1.getUInt8();
        i_3 = i_2 >> 2;
        i_4 = i_2 & 0x3;
        i_37 = client.field846[i_3];
        i_6 = class189_1.method3765();
        i_7 = (i_6 >> 4 & 0x7) + class57.field524;
        i_8 = (i_6 & 0x7) + class226.field2568;
        if (i_7 >= 0 && i_8 >= 0 && i_7 < 104 && i_8 < 104) {
          class241.method4602(class13.field82, i_7, i_8, i_37, -1, i_3, i_4, 0, -1);
        }

      } else if (class171.field2242 == class171_0) {
        i_2 = class189_1.method3646();
        i_3 = class189_1.method3577();
        i_4 = (i_3 >> 4 & 0x7) + class57.field524;
        i_37 = (i_3 & 0x7) + class226.field2568;
        if (i_4 >= 0 && i_37 >= 0 && i_4 < 104 && i_37 < 104) {
          Deque class205_34 = client.field708[class13.field82][i_4][i_37];
          if (class205_34 != null) {
            for (class80_33 = (class80) class205_34.getFirst(); class80_33 != null;
                class80_33 = (class80) class205_34.getNext()) {
              if ((i_2 & 0x7fff) == class80_33.field1151) {
                class80_33.unlinkNode();
                break;
              }
            }

            if (class205_34.getFirst() == null) {
              client.field708[class13.field82][i_4][i_37] = null;
            }

            class253.method4808(i_4, i_37);
          }
        }

      } else {
        if (class171.field2245 == class171_0) {
          i_2 = class189_1.method3607();
          i_3 = (i_2 >> 4 & 0x7) + class57.field524;
          i_4 = (i_2 & 0x7) + class226.field2568;
          b_5 = class189_1.getInt8();
          i_6 = class189_1.getUInt16();
          i_7 = class189_1.method3607();
          i_8 = i_7 >> 2;
          i_9 = i_7 & 0x3;
          i_10 = client.field846[i_8];
          byte b_11 = class189_1.getInt8();
          i_12 = class189_1.getUInt16();
          i_13 = class189_1.method3585();
          byte b_14 = class189_1.method3610();
          int i_35 = class189_1.method3613();
          byte b_16 = class189_1.method3660();
          class60 class60_17;
          if (i_35 == client.field628) {
            class60_17 = class138.field1876;
          } else {
            class60_17 = client.field610[i_35];
          }

          if (class60_17 != null) {
            class268 class268_18 = SeekableFile.method2527(i_6);
            int i_19;
            int i_20;
            if (i_9 != 1 && i_9 != 3) {
              i_19 = class268_18.field3384;
              i_20 = class268_18.field3385;
            } else {
              i_19 = class268_18.field3385;
              i_20 = class268_18.field3384;
            }

            int i_21 = i_3 + (i_19 >> 1);
            int i_22 = i_3 + (i_19 + 1 >> 1);
            int i_23 = i_4 + (i_20 >> 1);
            int i_24 = i_4 + (i_20 + 1 >> 1);
            int[][] ints_25 = class50.field459[class13.field82];
            int i_26 = ints_25[i_22][i_24] + ints_25[i_21][i_23] + ints_25[i_22][i_23]
                + ints_25[i_21][i_24] >> 2;
            int i_27 = (i_3 << 7) + (i_19 << 6);
            int i_28 = (i_4 << 7) + (i_20 << 6);
            class119 class119_29 = class268_18.method5031(i_8, i_9, ints_25, i_27, i_26, i_28);
            if (class119_29 != null) {
              class241.method4602(class13.field82, i_3, i_4, i_10, -1, 0, 0, i_12 + 1, i_13 + 1);
              class60_17.field545 = i_12 + client.field591;
              class60_17.field555 = i_13 + client.field591;
              class60_17.field563 = class119_29;
              class60_17.field556 = i_3 * 128 + i_19 * 64;
              class60_17.field558 = i_4 * 128 + i_20 * 64;
              class60_17.field557 = i_26;
              byte b_30;
              if (b_14 > b_5) {
                b_30 = b_14;
                b_14 = b_5;
                b_5 = b_30;
              }

              if (b_16 > b_11) {
                b_30 = b_16;
                b_16 = b_11;
                b_11 = b_30;
              }

              class60_17.field559 = b_14 + i_3;
              class60_17.field565 = b_5 + i_3;
              class60_17.field547 = b_16 + i_4;
              class60_17.field553 = i_4 + b_11;
            }
          }
        }

        if (class171.field2250 == class171_0) {
          i_2 = class189_1.method3607();
          i_3 = class189_1.getUInt8();
          i_4 = i_3 >> 4 & 0xf;
          i_37 = i_3 & 0x7;
          i_6 = class189_1.method3607();
          i_7 = (i_6 >> 4 & 0x7) + class57.field524;
          i_8 = (i_6 & 0x7) + class226.field2568;
          i_9 = class189_1.method3646();
          if (i_7 >= 0 && i_8 >= 0 && i_7 < 104 && i_8 < 104) {
            i_10 = i_4 + 1;
            if (class138.field1876.field922[0] >= i_7 - i_10
                && class138.field1876.field922[0] <= i_7 + i_10
                && class138.field1876.field872[0] >= i_8 - i_10
                && class138.field1876.field872[0] <= i_10 + i_8 && client.field815 != 0 && i_37 > 0
                && client.field656 < 50) {
              client.field817[client.field656] = i_9;
              client.field676[client.field656] = i_37;
              client.field819[client.field656] = i_2;
              client.field719[client.field656] = null;
              client.field820[client.field656] = i_4 + (i_8 << 8) + (i_7 << 16);
              ++client.field656;
            }
          }
        }

        if (class171.field2244 == class171_0) {
          i_2 = class189_1.getUInt8();
          i_3 = (i_2 >> 4 & 0x7) + class57.field524;
          i_4 = (i_2 & 0x7) + class226.field2568;
          i_37 = class189_1.method3613();
          i_6 = class189_1.method3613();
          i_7 = class189_1.method3646();
          if (i_3 >= 0 && i_4 >= 0 && i_3 < 104 && i_4 < 104) {
            Deque class205_32 = client.field708[class13.field82][i_3][i_4];
            if (class205_32 != null) {
              for (class80 class80_36 = (class80) class205_32.getFirst(); class80_36 != null;
                  class80_36 = (class80) class205_32.getNext()) {
                if ((i_6 & 0x7fff) == class80_36.field1151 && i_7 == class80_36.field1148) {
                  class80_36.field1148 = i_37;
                  break;
                }
              }

              class253.method4808(i_3, i_4);
            }
          }

        }
      }
    }
  }

}
