package rs.darkscape.client.net;

import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.io.AsyncInputStream;
import rs.darkscape.client.io.AsyncOutputStream;

@ObfuscatedName("ft")
public class AsyncSocket extends AbstractSocket {

  @ObfuscatedName("z")
  Socket socket;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lej;"
  )
  AsyncInputStream inputStream;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lfc;"
  )
  AsyncOutputStream ouputStream;

  public AsyncSocket(Socket socket, int i_2, int i_3) throws IOException {
    this.socket = socket;
    this.socket.setSoTimeout(30000);
    this.socket.setTcpNoDelay(true);
    this.socket.setReceiveBufferSize(65536);
    this.socket.setSendBufferSize(65536);
    this.inputStream = new AsyncInputStream(this.socket.getInputStream(), i_2);
    this.ouputStream = new AsyncOutputStream(this.socket.getOutputStream(), i_3);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "1"
  )
  public boolean available(int len) throws IOException {
    return this.inputStream.available(len);
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1213474120"
  )
  public int available() throws IOException {
    return this.inputStream.available();
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2096783031"
  )
  public int read() throws IOException {
    return this.inputStream.read();
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-2097961075"
  )
  public int read(byte[] bytes_1, int i_2, int i_3) throws IOException {
    return this.inputStream.method3224(bytes_1, i_2, i_3);
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-100"
  )
  public void write(byte[] bytes_1, int i_2, int i_3) throws IOException {
    this.ouputStream.write(bytes_1, i_2, i_3);
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1775992211"
  )
  public void close() {
    this.ouputStream.halt();

    try {
      this.socket.close();
    } catch (IOException ignored) {
    }

    this.inputStream.method3215();
  }

  protected void finalize() {
    this.close();
  }

}
