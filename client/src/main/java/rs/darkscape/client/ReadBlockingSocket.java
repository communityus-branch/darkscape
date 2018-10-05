package rs.darkscape.client;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.net.AbstractSocket;
import rs.darkscape.client.sign.SignLink;
import rs.darkscape.client.sign.Task;

@ObfuscatedName("fr")
public final class ReadBlockingSocket extends AbstractSocket implements Runnable {

  @ObfuscatedName("fm")
  @ObfuscatedSignature(
      signature = "[Lll;"
  )
  static class318[] field1997;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = -841887779
  )
  final int field1995;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -1684221721
  )
  final int field1996;
  @ObfuscatedName("l")
  boolean field1990 = false;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = -540627
  )
  int field1992 = 0;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = -1830674929
  )
  int field1993 = 0;
  @ObfuscatedName("e")
  boolean field1998 = false;
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lev;"
  )
  SignLink field1989;
  @ObfuscatedName("s")
  Socket socket;
  @ObfuscatedName("z")
  InputStream field1988;
  @ObfuscatedName("w")
  OutputStream field1986;
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lee;"
  )
  Task field1987;
  @ObfuscatedName("k")
  byte[] field1994;

  @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;Lev;I)V"
  )
  public ReadBlockingSocket(Socket socket_1, SignLink class154_2, int i_3) throws IOException {
    this.field1989 = class154_2;
    this.socket = socket_1;
    this.field1995 = i_3;
    this.field1996 = i_3 - 100;
    this.socket.setSoTimeout(30000);
    this.socket.setTcpNoDelay(true);
    this.socket.setReceiveBufferSize(65536);
    this.socket.setSendBufferSize(65536);
    this.field1988 = this.socket.getInputStream();
    this.field1986 = this.socket.getOutputStream();
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "1"
  )
  public boolean available(int i_1) throws IOException {
    return this.field1990 ? false : this.field1988.available() >= i_1;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1213474120"
  )
  public int available() throws IOException {
    return this.field1990 ? 0 : this.field1988.available();
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2096783031"
  )
  public int read() throws IOException {
    return this.field1990 ? 0 : this.field1988.read();
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-2097961075"
  )
  public int read(byte[] bytes_1, int i_2, int i_3) throws IOException {
    if (this.field1990) {
      return 0;
    } else {
      int i_4;
      int i_5;
      for (i_4 = i_3; i_3 > 0; i_3 -= i_5) {
        i_5 = this.field1988.read(bytes_1, i_2, i_3);
        if (i_5 <= 0) {
          throw new EOFException();
        }

        i_2 += i_5;
      }

      return i_4;
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-100"
  )
  public void write(byte[] bytes_1, int i_2, int i_3) throws IOException {
    this.method3352(bytes_1, i_2, i_3);
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1775992211"
  )
  public void close() {
    if (!this.field1990) {
      synchronized (this) {
        this.field1990 = true;
        this.notifyAll();
      }

      if (this.field1987 != null) {
        while (this.field1987.status == 0) {
          class63.method1539(1L);
        }

        if (this.field1987.status == 1) {
          try {
            ((Thread) this.field1987.result).join();
          } catch (InterruptedException ignored) {
          }
        }
      }

      this.field1987 = null;
    }
  }

  @ObfuscatedName("ak")
  @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-436228985"
  )
  void method3352(byte[] bytes_1, int i_2, int i_3) throws IOException {
    if (!this.field1990) {
      if (this.field1998) {
        this.field1998 = false;
        throw new IOException();
      } else {
        if (this.field1994 == null) {
          this.field1994 = new byte[this.field1995];
        }

        synchronized (this) {
          for (int i_5 = 0; i_5 < i_3; i_5++) {
            this.field1994[this.field1993] = bytes_1[i_5 + i_2];
            this.field1993 = (this.field1993 + 1) % this.field1995;
            if ((this.field1996 + this.field1992) % this.field1995 == this.field1993) {
              throw new IOException();
            }
          }

          if (this.field1987 == null) {
            this.field1987 = this.field1989.startThread(this, 3);
          }

          this.notifyAll();
        }
      }
    }
  }

  public void run() {
    try {
      while (true) {
        label84:
        {
          int i_1;
          int i_2;
          synchronized (this) {
            if (this.field1993 == this.field1992) {
              if (this.field1990) {
                break label84;
              }

              try {
                this.wait();
              } catch (InterruptedException ignored) {
              }
            }

            i_2 = this.field1992;
            if (this.field1993 >= this.field1992) {
              i_1 = this.field1993 - this.field1992;
            } else {
              i_1 = this.field1995 - this.field1992;
            }
          }

          if (i_1 <= 0) {
            continue;
          }

          try {
            this.field1986.write(this.field1994, i_2, i_1);
          } catch (IOException ioexception_9) {
            this.field1998 = true;
          }

          this.field1992 = (i_1 + this.field1992) % this.field1995;

          try {
            if (this.field1993 == this.field1992) {
              this.field1986.flush();
            }
          } catch (IOException ioexception_8) {
            this.field1998 = true;
          }
          continue;
        }

        try {
          if (this.field1988 != null) {
            this.field1988.close();
          }

          if (this.field1986 != null) {
            this.field1986.close();
          }

          if (this.socket != null) {
            this.socket.close();
          }
        } catch (IOException ignored) {
        }

        this.field1994 = null;
        break;
      }
    } catch (Exception exception_12) {
      class5.method65((String) null, exception_12);
    }

  }

  protected void finalize() {
    this.close();
  }

}
