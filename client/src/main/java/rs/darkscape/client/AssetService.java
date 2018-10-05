package rs.darkscape.client;

import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.net.AbstractSocket;

@ObfuscatedName("ia")
public class AssetService {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lfd;"
  )
  public static AbstractSocket socket;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      longValue = -5739275915681687991L
  )
  public static long previousTime;
  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "Lig;"
  )
  public static RemoteArchiveRequest currentRequest;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 1110937007
  )
  public static int accumulatedTime = 0;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  public static HashMap field3212 = new HashMap(4096);
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1165925
  )
  public static int field3211 = 0;
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  public static HashMap field3199 = new HashMap(32);
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 1214867787
  )
  public static int field3198 = 0;
  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "Lgo;"
  )
  public static class194 field3202 = new class194();
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 351524551
  )
  public static int field3205 = 0;
  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  public static HashMap field3206 = new HashMap(4096);
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -887226239
  )
  public static int field3207 = 0;
  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "Lgk;"
  )
  public static Buffer field3209 = new Buffer(8);
  @ObfuscatedName("r")
  @ObfuscatedGetter(
      intValue = 2092860897
  )
  public static int field3210 = 0;
  @ObfuscatedName("o")
  public static CRC32 crc = new CRC32();
  @ObfuscatedName("a")
  @ObfuscatedSignature(
      signature = "[Lic;"
  )
  public static class249[] field3201 = new class249[256];
  @ObfuscatedName("j")
  public static byte encryptionKey = 0;
  @ObfuscatedName("d")
  @ObfuscatedGetter(
      intValue = 42575595
  )
  public static int field3214 = 0;
  @ObfuscatedName("h")
  @ObfuscatedGetter(
      intValue = -1264842351
  )
  public static int field3215 = 0;
  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  static HashMap field3204 = new HashMap(4096);

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;Lir;Lir;I)V",
      garbageValue = "1897264020"
  )
  public static void method4766(AbstractPack class247_0, AbstractPack class247_1, AbstractPack class247_2) {
    class267.field3367 = class247_0;
    class267.field3348 = class247_1;
    class139.field1877 = class247_2;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(CI)C",
      garbageValue = "-365895890"
  )
  public static char method4770(char var_0) {
    switch (var_0) {

      default:
        return Character.toLowerCase(var_0);
    }
  }

}
