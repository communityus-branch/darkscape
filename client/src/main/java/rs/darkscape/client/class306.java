package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class306 {

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(Lir;III)Z",
      garbageValue = "-1104652703"
  )
  static boolean method5660(AbstractPack class247_0, int i_1, int i_2) {
    byte[] bytes = class247_0.method4625(i_1, i_2);
    if (bytes == null) {
      return false;
    }
    SpriteDecoder.decodeSprite(bytes);
    return true;
  }

}
