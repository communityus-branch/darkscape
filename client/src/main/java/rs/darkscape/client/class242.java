package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public enum class242 implements class188 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Liz;"
  )
  field3125(0, -1, true, false, true),
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Liz;"
  )
  field3119(1, 0, true, true, true),
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Liz;"
  )
  field3121(2, 1, true, true, false),
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Liz;"
  )
  field3120(3, 2, false, false, true),
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Liz;"
  )
  field3122(4, 3, false, false, true),
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Liz;"
  )
  field3118(5, 10, false, false, true);

  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 1058981555
  )
  public final int field3128;
  @ObfuscatedName("x")
  public final boolean field3126;
  @ObfuscatedName("e")
  public final boolean field3127;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -609392397
  )
  final int field3124;

  class242(int i_3, int i_4, boolean bool_5, boolean bool_6, boolean bool_7) {
    this.field3124 = i_3;
    this.field3128 = i_4;
    this.field3126 = bool_6;
    this.field3127 = bool_7;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1507833078"
  )
  public static void method4605() {
    if (AssetService.socket != null) {
      AssetService.socket.close();
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
  )
  public int vmethod5815() {
    return this.field3124;
  }

}
