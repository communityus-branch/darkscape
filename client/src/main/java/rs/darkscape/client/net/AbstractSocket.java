package rs.darkscape.client.net;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public abstract class AbstractSocket {

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "1"
  )
  public abstract boolean available(int var1) throws IOException;

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1213474120"
  )
  public abstract int available() throws IOException;

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2096783031"
  )
  public abstract int read() throws IOException;

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-2097961075"
  )
  public abstract int read(byte[] var1, int var2, int var3) throws IOException;

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-100"
  )
  public abstract void write(byte[] var1, int var2, int var3) throws IOException;

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1775992211"
  )
  public abstract void close();

}
