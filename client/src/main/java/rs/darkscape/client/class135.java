package rs.darkscape.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class135 implements Runnable {

  @ObfuscatedName("i")
  static ScheduledExecutorService field1855;
  @ObfuscatedName("cp")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field1852;
  @ObfuscatedName("jf")
  @ObfuscatedGetter(
      intValue = 1445652317
  )
  static int field1856;
  @ObfuscatedName("z")
  final Thread field1854 = new Thread(this);
  @ObfuscatedName("s")
  Queue field1858 = new LinkedList();
  @ObfuscatedName("w")
  volatile boolean field1853;

  public class135() {
    this.field1854.setPriority(1);
    this.field1854.start();
  }

  @ObfuscatedName("ak")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "892303579"
  )
  static void method3114(int i_0) {
    if (i_0 != -1) {
      if (class261.method4931(i_0)) {
        class230[] arr_1 = class42.field366[i_0];

        for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
          class230 class230_3 = arr_1[i_2];
          if (class230_3.field2687 != null) {
            class56 class56_4 = new class56();
            class56_4.field506 = class230_3;
            class56_4.field512 = class230_3.field2687;
            class309.method5674(class56_4, 5000000);
          }
        }

      }
    }
  }

  @ObfuscatedName("iz")
  @ObfuscatedSignature(
      signature = "(III)Ljava/lang/String;",
      garbageValue = "-509659041"
  )
  static final String method3113(int i_0, int i_1) {
    int i_2 = i_1 - i_0;
    return i_2 < -9 ? class6.method71(16711680) : (i_2 < -6 ? class6.method71(16723968)
        : (i_2 < -3 ? class6.method71(16740352) : (i_2 < 0 ? class6.method71(16756736)
            : (i_2 > 9 ? class6.method71(65280) : (i_2 > 6 ? class6.method71(4259584)
                : (i_2 > 3 ? class6.method71(8453888)
                    : (i_2 > 0 ? class6.method71(12648192) : class6.method71(16776960))))))));
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/net/URL;I)Leh;",
      garbageValue = "790678851"
  )
  public class136 method3109(URL url_1) {
    class136 class136_2 = new class136(url_1);
    synchronized (this) {
      this.field1858.add(class136_2);
      this.notify();
      return class136_2;
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1955026569"
  )
  public void method3106() {
    this.field1853 = true;

    try {
      synchronized (this) {
        this.notify();
      }

      this.field1854.join();
    } catch (InterruptedException ignored) {
    }

  }

  public void run() {
    while (!this.field1853) {
      try {
        class136 class136_1;
        synchronized (this) {
          class136_1 = (class136) this.field1858.poll();
          if (class136_1 == null) {
            try {
              this.wait();
            } catch (InterruptedException ignored) {
            }
            continue;
          }
        }

        DataInputStream datainputstream_2 = null;
        URLConnection urlconnection_3 = null;

        try {
          urlconnection_3 = class136_1.field1867.openConnection();
          urlconnection_3.setConnectTimeout(5000);
          urlconnection_3.setReadTimeout(5000);
          urlconnection_3.setUseCaches(false);
          urlconnection_3.setRequestProperty("Connection", "close");
          int i_7 = urlconnection_3.getContentLength();
          if (i_7 >= 0) {
            byte[] bytes_5 = new byte[i_7];
            datainputstream_2 = new DataInputStream(urlconnection_3.getInputStream());
            datainputstream_2.readFully(bytes_5);
            class136_1.field1861 = bytes_5;
          }

          class136_1.field1859 = true;
        } catch (IOException ioexception_14) {
          class136_1.field1859 = true;
        } finally {
          if (datainputstream_2 != null) {
            datainputstream_2.close();
          }

          if (urlconnection_3 != null && urlconnection_3 instanceof HttpURLConnection) {
            ((HttpURLConnection) urlconnection_3).disconnect();
          }

        }
      } catch (Exception exception_17) {
        class5.method65((String) null, exception_17);
      }
    }

  }

}
