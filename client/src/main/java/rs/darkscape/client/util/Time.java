package rs.darkscape.client.util;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public final class Time {

  @ObfuscatedName("z")
  @ObfuscatedGetter(
      longValue = -7929231222859405373L
  )
  static long previous;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      longValue = 2010951404606687319L
  )
  static long delta;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "604838575"
  )
  public static synchronized long currentTimeMillis() {
    long current = System.currentTimeMillis();
    if (current < previous) {
      delta += previous - current;
    }

    previous = current;
    return current + delta;
  }
}
