package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class238 {

  @ObfuscatedName("gj")
  @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "111587198"
  )
  static final void method4594(int i_0, int i_1, int i_2) {
    if (i_0 >= 128 && i_1 >= 128 && i_0 <= 13056 && i_1 <= 13056) {
      int i_3 = class27.method460(i_0, i_1, class13.field82) - i_2;
      i_0 -= BufferedFile.field1431;
      i_3 -= class123.field1702;
      i_1 -= class226.field2563;
      int i_4 = class122.field1681[class7.field41];
      int i_5 = class122.field1693[class7.field41];
      int i_6 = class122.field1681[class85.field1201];
      int i_7 = class122.field1693[class85.field1201];
      int i_8 = i_6 * i_1 + i_0 * i_7 >> 16;
      i_1 = i_7 * i_1 - i_0 * i_6 >> 16;
      i_0 = i_8;
      i_8 = i_5 * i_3 - i_4 * i_1 >> 16;
      i_1 = i_3 * i_4 + i_5 * i_1 >> 16;
      if (i_1 >= 50) {
        client.field679 = i_0 * client.field840 / i_1 + client.field838 / 2;
        client.field680 = i_8 * client.field840 / i_1 + client.field662 / 2;
      } else {
        client.field679 = -1;
        client.field680 = -1;
      }

    } else {
      client.field679 = -1;
      client.field680 = -1;
    }
  }

}
