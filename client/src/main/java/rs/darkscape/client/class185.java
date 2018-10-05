package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class185 {

  @ObfuscatedName("e")
  static final int[] field2361 = new int[2048];
  @ObfuscatedName("p")
  static final int[] field2362 = new int[2048];
  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "Lgk;"
  )
  public static Buffer releaseManifest;
  @ObfuscatedName("h")
  static int[] field2364;

  static {
    double d_0 = 0.0030679615757712823D;

    for (int i_2 = 0; i_2 < 2048; i_2++) {
      field2361[i_2] = (int) (65536.0D * Math.sin(d_0 * (double) i_2));
      field2362[i_2] = (int) (65536.0D * Math.cos(d_0 * (double) i_2));
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "29745"
  )
  public static void method3787() {
    if (Mouse.mouse != null) {
      Mouse class48_0 = Mouse.mouse;
      synchronized (Mouse.mouse) {
        Mouse.mouse = null;
      }
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(ZZI)I",
      garbageValue = "-249249572"
  )
  public static int method3786(boolean bool_0, boolean bool_1) {
    byte b_2 = 0;
    int i_3 = b_2 + AssetService.field3198 + AssetService.field3211;
    return i_3;
  }

}
