package rs.darkscape.client.io;

import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class AsyncOutputStream implements Runnable {

  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 769097443
  )
  int field2010 = 0;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -2146315675
  )
  int field2005 = 0;
  @ObfuscatedName("w")
  OutputStream outputStream;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -837409575
  )
  int capacity;
  @ObfuscatedName("l")
  byte[] buffer;
  @ObfuscatedName("z")
  Thread thread;
  @ObfuscatedName("k")
  IOException field2011;
  @ObfuscatedName("i")
  boolean field2009;

  public AsyncOutputStream(OutputStream outputStream, int capacity) {
    this.outputStream = outputStream;
    this.capacity = capacity + 1;
    this.buffer = new byte[this.capacity];
    this.thread = new Thread(this);
    this.thread.setDaemon(true);
    this.thread.start();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1097599728"
  )
  public boolean hasException() {
    if (this.field2009) {
      try {
        this.outputStream.close();
        if (this.field2011 == null) {
          this.field2011 = new IOException("");
        }
      } catch (IOException ioexception_2) {
        if (this.field2011 == null) {
          this.field2011 = new IOException(ioexception_2);
        }
      }

      return true;
    } else {
      return false;
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1100841407"
  )
  public void write(byte[] bytes_1, int i_2, int i_3) throws IOException {
    if (i_3 >= 0 && i_2 >= 0 && i_3 + i_2 <= bytes_1.length) {
      synchronized (this) {
        if (this.field2011 != null) {
          throw new IOException(this.field2011.toString());
        } else {
          int i_5;
          if (this.field2010 <= this.field2005) {
            i_5 = this.capacity - this.field2005 + this.field2010 - 1;
          } else {
            i_5 = this.field2010 - this.field2005 - 1;
          }

          if (i_5 < i_3) {
            throw new IOException("");
          } else {
            if (i_3 + this.field2005 <= this.capacity) {
              System.arraycopy(bytes_1, i_2, this.buffer, this.field2005, i_3);
            } else {
              int i_6 = this.capacity - this.field2005;
              System.arraycopy(bytes_1, i_2, this.buffer, this.field2005, i_6);
              System.arraycopy(bytes_1, i_6 + i_2, this.buffer, 0, i_3 - i_6);
            }

            this.field2005 = (i_3 + this.field2005) % this.capacity;
            this.notifyAll();
          }
        }
      }
    } else {
      throw new IOException();
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1681840837"
  )
  public void halt() {
    synchronized (this) {
      this.field2009 = true;
      this.notifyAll();
    }

    try {
      this.thread.join();
    } catch (InterruptedException ignored) {
    }

  }

  public void run() {
    do {
      int i_1;
      synchronized (this) {
        while (true) {
          if (this.field2011 != null) {
            return;
          }

          if (this.field2010 <= this.field2005) {
            i_1 = this.field2005 - this.field2010;
          } else {
            i_1 = this.capacity - this.field2010 + this.field2005;
          }

          if (i_1 > 0) {
            break;
          }

          try {
            this.outputStream.flush();
          } catch (IOException ioexception_11) {
            this.field2011 = ioexception_11;
            return;
          }

          if (this.hasException()) {
            return;
          }

          try {
            this.wait();
          } catch (InterruptedException ignored) {
          }
        }
      }

      try {
        if (i_1 + this.field2010 <= this.capacity) {
          this.outputStream.write(this.buffer, this.field2010, i_1);
        } else {
          int i_7 = this.capacity - this.field2010;
          this.outputStream.write(this.buffer, this.field2010, i_7);
          this.outputStream.write(this.buffer, 0, i_1 - i_7);
        }
      } catch (IOException ioexception_10) {
        IOException ioexception_2 = ioexception_10;
        synchronized (this) {
          this.field2011 = ioexception_2;
          return;
        }
      }

      synchronized (this) {
        this.field2010 = (i_1 + this.field2010) % this.capacity;
      }
    } while (!this.hasException());

  }

}
