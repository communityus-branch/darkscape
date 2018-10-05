package rs.darkscape.client.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class AsyncInputStream implements Runnable {

  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 60058349
  )
  int field1931 = 0;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = 1081366057
  )
  int field1929 = 0;
  @ObfuscatedName("w")
  InputStream inputStream;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 254778797
  )
  int capacity;
  @ObfuscatedName("l")
  byte[] buffer;
  @ObfuscatedName("z")
  Thread thread;
  @ObfuscatedName("k")
  IOException field1935;

  public AsyncInputStream(InputStream inputStream, int capacity) {
    this.inputStream = inputStream;
    this.capacity = capacity + 1;
    this.buffer = new byte[this.capacity];
    this.thread = new Thread(this);
    this.thread.setDaemon(true);
    this.thread.start();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-1623980181"
  )
  public boolean available(int len) throws IOException {
    if (len == 0) {
      return true;
    }

    if (len > 0 && len < this.capacity) {
      synchronized (this) {
        int i_3;
        if (this.field1931 <= this.field1929) {
          i_3 = this.field1929 - this.field1931;
        } else {
          i_3 = this.capacity - this.field1931 + this.field1929;
        }

        if (i_3 < len) {
          if (this.field1935 != null) {
            throw new IOException(this.field1935.toString());
          } else {
            this.notifyAll();
            return false;
          }
        } else {
          return true;
        }
      }
    } else {
      throw new IOException();
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-200801409"
  )
  public int available() throws IOException {
    synchronized (this) {
      int len;
      if (this.field1931 <= this.field1929) {
        len = this.field1929 - this.field1931;
      } else {
        len = this.capacity - this.field1931 + this.field1929;
      }

      if (len <= 0 && this.field1935 != null) {
        throw new IOException(this.field1935.toString());
      }

      this.notifyAll();
      return len;
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1567970843"
  )
  public int read() throws IOException {
    synchronized (this) {
      if (this.field1931 == this.field1929) {
        if (this.field1935 != null) {
          throw new IOException(this.field1935.toString());
        } else {
          return -1;
        }
      } else {
        int i_2 = this.buffer[this.field1931] & 0xff;
        this.field1931 = (this.field1931 + 1) % this.capacity;
        this.notifyAll();
        return i_2;
      }
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "2131824940"
  )
  public int method3224(byte[] bytes_1, int i_2, int i_3) throws IOException {
    if (i_3 >= 0 && i_2 >= 0 && i_3 + i_2 <= bytes_1.length) {
      synchronized (this) {
        int i_5;
        if (this.field1931 <= this.field1929) {
          i_5 = this.field1929 - this.field1931;
        } else {
          i_5 = this.capacity - this.field1931 + this.field1929;
        }

        if (i_3 > i_5) {
          i_3 = i_5;
        }

        if (i_3 == 0 && this.field1935 != null) {
          throw new IOException(this.field1935.toString());
        } else {
          if (i_3 + this.field1931 <= this.capacity) {
            System.arraycopy(this.buffer, this.field1931, bytes_1, i_2, i_3);
          } else {
            int i_6 = this.capacity - this.field1931;
            System.arraycopy(this.buffer, this.field1931, bytes_1, i_2, i_6);
            System.arraycopy(this.buffer, 0, bytes_1, i_6 + i_2, i_3 - i_6);
          }

          this.field1931 = (i_3 + this.field1931) % this.capacity;
          this.notifyAll();
          return i_3;
        }
      }
    } else {
      throw new IOException();
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "17"
  )
  public void method3215() {
    synchronized (this) {
      if (this.field1935 == null) {
        this.field1935 = new IOException("");
      }

      this.notifyAll();
    }

    try {
      this.thread.join();
    } catch (InterruptedException ignored) {
    }

  }

  public void run() {
    while (true) {
      int i_1;
      synchronized (this) {
        while (true) {
          if (this.field1935 != null) {
            return;
          }

          if (this.field1931 == 0) {
            i_1 = this.capacity - this.field1929 - 1;
          } else if (this.field1931 <= this.field1929) {
            i_1 = this.capacity - this.field1929;
          } else {
            i_1 = this.field1931 - this.field1929 - 1;
          }

          if (i_1 > 0) {
            break;
          }

          try {
            this.wait();
          } catch (InterruptedException ignored) {
          }
        }
      }

      int read;
      try {
        read = this.inputStream.read(this.buffer, this.field1929, i_1);
        if (read == -1) {
          throw new EOFException();
        }
      } catch (IOException ioexception_11) {
        IOException ioexception_3 = ioexception_11;
        synchronized (this) {
          this.field1935 = ioexception_3;
          return;
        }
      }

      synchronized (this) {
        this.field1929 = (read + this.field1929) % this.capacity;
      }
    }
  }

}
