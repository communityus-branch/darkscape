package rs.darkscape.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class234 {

  @ObfuscatedName("w")
  public static final boolean[] field2780 = new boolean[]{true, true, true, true, true, true, true,
      true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
      true, false, false};
  @ObfuscatedName("s")
  public static int[] field2779 = new int[99];

  static {
    int i_0 = 0;

    for (int i_1 = 0; i_1 < 99; i_1++) {
      int i_2 = i_1 + 1;
      int i_3 = (int) ((double) i_2 + 300.0D * Math.pow(2.0D, (double) i_2 / 7.0D));
      i_0 += i_3;
      field2779[i_1] = i_0 / 4;
    }

  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1543629382"
  )
  static void method4590() {
    class78.field1106 = class78.field1106.trim();
    if (class78.field1106.length() == 0) {
      class2.method22("Please enter your username.", "If you created your account after November",
                      "2010, this will be the creation email address.");
    } else {
      long long_1 = client.method1535();
      byte b_0;
      if (long_1 == 0L) {
        b_0 = 5;
      } else {
        String string_4 = class78.field1106;
        Random random_5 = new Random();
        Buffer class182_6 = new Buffer(128);
        Buffer class182_7 = new Buffer(128);
        int[] ints_8 = new int[]{random_5.nextInt(), random_5.nextInt(), (int) (long_1 >> 32),
            (int) long_1};
        class182_6.putInt8(10);

        int i_9;
        for (i_9 = 0; i_9 < 4; i_9++) {
          class182_6.putInt32(random_5.nextInt());
        }

        class182_6.putInt32(ints_8[0]);
        class182_6.putInt32(ints_8[1]);
        class182_6.method3659(long_1);
        class182_6.method3659(0L);

        for (i_9 = 0; i_9 < 4; i_9++) {
          class182_6.putInt32(random_5.nextInt());
        }

        class182_6.method3571(class73.field1039, class73.field1044);
        class182_7.putInt8(10);

        for (i_9 = 0; i_9 < 3; i_9++) {
          class182_7.putInt32(random_5.nextInt());
        }

        class182_7.method3659(random_5.nextLong());
        class182_7.method3584(random_5.nextLong());
        if (client.field620 != null) {
          class182_7.method3542(client.field620, 0, client.field620.length);
        } else {
          byte[] bytes_10 = new byte[24];

          try {
            class155.field1968.method2476(0L);
            class155.field1968.method2478(bytes_10);

            int i_11;
            for (i_11 = 0; i_11 < 24 && bytes_10[i_11] == 0; i_11++) {
            }

            if (i_11 >= 24) {
              throw new IOException();
            }
          } catch (Exception exception_31) {
            for (int i_12 = 0; i_12 < 24; i_12++) {
              bytes_10[i_12] = -1;
            }
          }

          class182_7.method3542(bytes_10, 0, bytes_10.length);
        }

        class182_7.method3659(random_5.nextLong());
        class182_7.method3571(class73.field1039, class73.field1044);
        i_9 = class316.method5820(string_4);
        if (i_9 % 8 != 0) {
          i_9 += 8 - i_9 % 8;
        }

        Buffer class182_32 = new Buffer(i_9);
        class182_32.method3699(string_4);
        class182_32.offset = i_9;
        class182_32.method3567(ints_8);
        Buffer class182_22 = new Buffer(class182_7.offset + class182_6.offset
                                            + class182_32.offset + 5);
        class182_22.putInt8(2);
        class182_22.putInt8(class182_6.offset);
        class182_22.method3542(class182_6.bytes, 0, class182_6.offset);
        class182_22.putInt8(class182_7.offset);
        class182_22.method3542(class182_7.bytes, 0, class182_7.offset);
        class182_22.method3755(class182_32.offset);
        class182_22.method3542(class182_32.bytes, 0, class182_32.offset);
        byte[] bytes_13 = class182_22.bytes;
        int i_15 = bytes_13.length;
        StringBuilder stringbuilder_16 = new StringBuilder();

        int i_19;
        for (int i_17 = 0; i_17 < i_15 + 0; i_17 += 3) {
          int i_18 = bytes_13[i_17] & 0xff;
          stringbuilder_16.append(class304.field3722[i_18 >>> 2]);
          if (i_17 < i_15 - 1) {
            i_19 = bytes_13[i_17 + 1] & 0xff;
            stringbuilder_16.append(class304.field3722[(i_18 & 0x3) << 4 | i_19 >>> 4]);
            if (i_17 < i_15 - 2) {
              int i_20 = bytes_13[i_17 + 2] & 0xff;
              stringbuilder_16.append(class304.field3722[(i_19 & 0xf) << 2 | i_20 >>> 6])
                  .append(class304.field3722[i_20 & 0x3f]);
            } else {
              stringbuilder_16.append(class304.field3722[(i_19 & 0xf) << 2]).append("=");
            }
          } else {
            stringbuilder_16.append(class304.field3722[(i_18 & 0x3) << 4]).append("==");
          }
        }

        String string_14 = stringbuilder_16.toString();
        string_14 = string_14;

        byte b_3;
        try {
          URL url_25 = new URL(class142.method3161("services", false) + "m=accountappeal/login.ws");
          URLConnection urlconnection_33 = url_25.openConnection();
          urlconnection_33.setDoInput(true);
          urlconnection_33.setDoOutput(true);
          urlconnection_33.setConnectTimeout(5000);
          OutputStreamWriter outputstreamwriter_26 = new OutputStreamWriter(
              urlconnection_33.getOutputStream());
          outputstreamwriter_26.write(
              "data2=" + class304.method5634(string_14) + "&dest=" + class304
                  .method5634("passwordchoice.ws"));
          outputstreamwriter_26.flush();
          InputStream inputstream_27 = urlconnection_33.getInputStream();
          class182_22 = new Buffer(new byte[1000]);

          while (true) {
            i_19 = inputstream_27
                .read(class182_22.bytes, class182_22.offset, 1000 - class182_22.offset);
            if (i_19 == -1) {
              outputstreamwriter_26.close();
              inputstream_27.close();
              String string_28 = new String(class182_22.bytes);
              if (string_28.startsWith("OFFLINE")) {
                b_3 = 4;
              } else if (string_28.startsWith("WRONG")) {
                b_3 = 7;
              } else if (string_28.startsWith("RELOAD")) {
                b_3 = 3;
              } else if (string_28.startsWith("Not permitted for social network accounts.")) {
                b_3 = 6;
              } else {
                class182_22.method3553(ints_8);

                while (class182_22.offset > 0 && class182_22.bytes[class182_22.offset - 1] == 0) {
                  --class182_22.offset;
                }

                string_28 = new String(class182_22.bytes, 0, class182_22.offset);
                boolean bool_34;
                if (string_28 == null) {
                  bool_34 = false;
                } else {
                  label137:
                  {
                    try {
                      new URL(string_28);
                    } catch (MalformedURLException malformedurlexception_29) {
                      bool_34 = false;
                      break label137;
                    }

                    bool_34 = true;
                  }
                }

                if (bool_34) {
                  class270.method5156(string_28, true, false);
                  b_3 = 2;
                } else {
                  b_3 = 5;
                }
              }
              break;
            }

            class182_22.offset += i_19;
            if (class182_22.offset >= 1000) {
              b_3 = 5;
              break;
            }
          }
        } catch (Throwable throwable_30) {
          throwable_30.printStackTrace();
          b_3 = 5;
        }

        b_0 = b_3;
      }

      switch (b_0) {
        case 2:
          class2.method22(class237.field3049, class237.field3050, class237.field3072);
          class78.field1081 = 6;
          break;
        case 3:
          class2.method22("", "Error connecting to server.", "");
          break;
        case 4:
          class2.method22("The part of the website you are trying",
                          "to connect to is offline at the moment.", "Please try again later.");
          break;
        case 5:
          class2.method22("Sorry, there was an error trying to",
                          "log you in to this part of the website.", "Please try again later.");
          break;
        case 6:
          class2.method22("", "Error connecting to server.", "");
          break;
        case 7:
          class2.method22("You must enter a valid login to proceed. For accounts",
                          "created after 24th November 2010, please use your",
                          "email address. Otherwise please use your username.");
      }

    }
  }

}
