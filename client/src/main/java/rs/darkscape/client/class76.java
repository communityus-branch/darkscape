package rs.darkscape.client;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class76 {

  @ObfuscatedName("z")
  static final BigInteger field1071 = new BigInteger("10001", 16);
  @ObfuscatedName("w")
  static final BigInteger field1069 = new BigInteger(
      "97e13ef453eef11c2e2b108891d256c90098b9da343c760762cdc2ccb5b9cc01552ee1f17fef7e9ad45cce00f378db17ae8f17c43fa4bdab098e5022b17175b147560d10c86658c7a471514e0bdce6c95f1b0ba8ceb5322e09b64b6bb30b1f88d2a879f88b871b4519717800df32d7f3e55f492af08025ab7ccd747491e82fe5",
      16);
  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "[Ldy;"
  )
  public static BufferedFile[] field1068;
  @ObfuscatedName("ak")
  static int[] field1073;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([Lgt;IB)Lgt;",
      garbageValue = "0"
  )
  public static class188 method1803(class188[] arr_0, int i_1) {
    class188[] arr_2 = arr_0;

    for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
      class188 class188_4 = arr_2[i_3];
      if (i_1 == class188_4.vmethod5815()) {
        return class188_4;
      }
    }

    return null;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(IIIZII)J",
      garbageValue = "1782575928"
  )
  public static long method1804(int i_0, int i_1, int i_2, boolean bool_3, int i_4) {
    long long_5 = (long) ((i_0 & 0x7f) << 0 | (i_1 & 0x7f) << 7 | (i_2 & 0x3) << 14)
        | ((long) i_4 & 0xffffffffL) << 17;
    if (bool_3) {
      long_5 |= 0x10000L;
    }

    return long_5;
  }

}
