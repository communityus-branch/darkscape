package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.sign.Task;

@ObfuscatedName("hy")
public class class225 {

  @ObfuscatedName("w")
  public static int[] field2559;
  @ObfuscatedName("s")
  public static int[] field2558;
  @ObfuscatedName("u")
  static int[] field2562;
  @ObfuscatedName("eo")
  @ObfuscatedSignature(
      signature = "Lee;"
  )
  static Task field2556;
  @ObfuscatedName("z")
  static int[] field2557 = new int[32];

  static {
    int i_0 = 2;

    for (int i_1 = 0; i_1 < 32; i_1++) {
      field2557[i_1] = i_0 - 1;
      i_0 += i_0;
    }

    field2559 = new int[2000];
    field2558 = new int[2000];
  }

}
