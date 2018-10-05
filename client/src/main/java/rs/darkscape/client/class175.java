package rs.darkscape.client;

import java.util.zip.Inflater;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class175 {

  @ObfuscatedName("k")
  static boolean[] field2271;
  @ObfuscatedName("cm")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field2270;
  @ObfuscatedName("z")
  Inflater field2268;

  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1000000"
  )
  class175(int i_1, int i_2, int i_3) {
  }

  public class175() {
    this(-1, 1000000, 1000000);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)Lii;",
      garbageValue = "-1879492666"
  )
  public static class257 method3485(int i_0) {
    class257 class257_1 = (class257) class257.field3260.method3989((long) i_0);
    if (class257_1 != null) {
      return class257_1;
    } else {
      byte[] bytes_2 = class257.field3264.method4625(15, i_0);
      class257_1 = new class257();
      if (bytes_2 != null) {
        class257_1.method4852(new Buffer(bytes_2));
      }

      class257.field3260.method3983(class257_1, (long) i_0);
      return class257_1;
    }
  }

  @ObfuscatedName("je")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "-6945047"
  )
  static void method3487(Buffer class182_0, int i_1) {
    byte[] bytes_2 = class182_0.bytes;
    if (client.field620 == null) {
      client.field620 = new byte[24];
    }

    class193.method3873(bytes_2, i_1, client.field620, 0, 24);
    class146.method3190(class182_0, i_1);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lgk;[BI)V",
      garbageValue = "641933971"
  )
  public void method3483(Buffer class182_1, byte[] bytes_2) {
    if (class182_1.bytes[class182_1.offset] == 31
        && class182_1.bytes[class182_1.offset + 1] == -117) {
      if (this.field2268 == null) {
        this.field2268 = new Inflater(true);
      }

      try {
        this.field2268.setInput(class182_1.bytes, class182_1.offset + 10,
                                class182_1.bytes.length - (class182_1.offset
                                    + 8 + 10));
        this.field2268.inflate(bytes_2);
      } catch (Exception exception_4) {
        this.field2268.reset();
        throw new RuntimeException("");
      }

      this.field2268.reset();
    } else {
      throw new RuntimeException("");
    }
  }

}
