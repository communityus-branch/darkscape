package rs.darkscape.client.sign;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class Task {

  @ObfuscatedName("k")
  public int intArg;
  @ObfuscatedName("x")
  public volatile Object result;
  @ObfuscatedName("u")
  public volatile int status = 0;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lee;"
  )
  Task next;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -1948085191
  )
  int type;
  @ObfuscatedName("i")
  Object objArg;

}
