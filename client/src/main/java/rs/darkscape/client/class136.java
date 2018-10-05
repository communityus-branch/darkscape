package rs.darkscape.client;

import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class136 {

  @ObfuscatedName("fl")
  @ObfuscatedSignature(
      signature = "Lll;"
  )
  static class318 field1862;
  @ObfuscatedName("z")
  final URL field1867;
  @ObfuscatedName("w")
  volatile boolean field1859;
  @ObfuscatedName("s")
  volatile byte[] field1861;

  class136(URL url_1) {
    this.field1867 = url_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "3647"
  )
  public boolean method3117() {
    return this.field1859;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "228107899"
  )
  public byte[] method3116() {
    return this.field1861;
  }

}
