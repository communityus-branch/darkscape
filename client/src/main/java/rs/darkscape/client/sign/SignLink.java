package rs.darkscape.client.sign;

import java.awt.Font;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.AbstractPack;

@ObfuscatedName("ev")
public class SignLink implements Runnable {

  @ObfuscatedName("z")
  public static String javaVendor;
  @ObfuscatedName("w")
  public static String javaVersion;
  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field1956;
  @ObfuscatedName("aw")
  public static Font field1961;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lee;"
  )
  Task head = null;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lee;"
  )
  Task tail = null;
  @ObfuscatedName("q")
  boolean field1958;
  @ObfuscatedName("u")
  Thread thread;

  public SignLink() {
    javaVendor = "Unknown";
    javaVersion = "1.6";

    try {
      javaVendor = System.getProperty("java.vendor");
      javaVersion = System.getProperty("java.version");
    } catch (Exception ignored) {
    }

    this.field1958 = false;
    this.thread = new Thread(this);
    this.thread.setPriority(10);
    this.thread.setDaemon(true);
    this.thread.start();
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-80"
  )
  public static int method3252(int i_0) {
    return i_0 >> 11 & 0x3f;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "417031791"
  )
  public final void halt() {
    synchronized (this) {
      this.field1958 = true;
      this.notifyAll();
    }

    try {
      this.thread.join();
    } catch (InterruptedException ignored) {
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIILjava/lang/Object;I)Lee;",
      garbageValue = "755580471"
  )
  final Task queue(int type, int intArg, int i_3, Object objArg) {
    Task task = new Task();
    task.type = type;
    task.intArg = intArg;
    task.objArg = objArg;
    synchronized (this) {
      if (this.tail != null) {
        this.tail.next = task;
        this.tail = task;
      } else {
        this.tail = this.head = task;
      }

      this.notify();
      return task;
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;II)Lee;",
      garbageValue = "-334479783"
  )
  public final Task connect(String address, int port) {
    return this.queue(1, port, 0, address);
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/Runnable;II)Lee;",
      garbageValue = "1672602296"
  )
  public final Task startThread(Runnable runnable_1, int priority) {
    return this.queue(2, priority, 0, runnable_1);
  }

  public final void run() {
    while (true) {
      Task task;
      synchronized (this) {
        while (true) {
          if (this.field1958) {
            return;
          }

          if (this.head != null) {
            task = this.head;
            this.head = this.head.next;
            if (this.head == null) {
              this.tail = null;
            }
            break;
          }

          try {
            this.wait();
          } catch (InterruptedException ignored) {
          }
        }
      }

      try {
        int type = task.type;
        if (type == 1) {
          task.result = new Socket(InetAddress.getByName((String) task.objArg), task.intArg);
        } else if (type == 2) {
          Thread thread = new Thread((Runnable) task.objArg);
          thread.setDaemon(true);
          thread.start();
          thread.setPriority(task.intArg);
          task.result = thread;
        } else if (type == 4) {
          task.result = new DataInputStream(((URL) task.objArg).openStream());
        }

        task.status = 1;
      } catch (ThreadDeath threadDeath) {
        throw threadDeath;
      } catch (Throwable throwable) {
        task.status = 2;
      }
    }
  }

}
