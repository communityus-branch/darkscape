package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public enum class240 implements class188 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lif;"
  )
  field3101(3, 0),
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lif;"
  )
  field3107(5, 1),
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lif;"
  )
  field3097(7, 2),
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lif;"
  )
  field3099(2, 3),
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lif;"
  )
  field3100(6, 4),
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lif;"
  )
  field3098(4, 5),
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Lif;"
  )
  field3102(1, 6),
  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "Lif;"
  )
  field3103(0, 7);

  @ObfuscatedName("ip")
  @ObfuscatedSignature(
      signature = "Lhi;"
  )
  static class230 field3096;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 1490628439
  )
  public final int field3104;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -838974909
  )
  final int field3105;

  class240(int i_3, int i_4) {
    this.field3104 = i_3;
    this.field3105 = i_4;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Lgi;II)Z",
      garbageValue = "-641567256"
  )
  static boolean method4601(PacketBuffer class189_0, int i_1) {
    int i_2 = class189_0.method3817(2);
    int i_3;
    int i_4;
    int i_7;
    int i_8;
    int i_9;
    int i_10;
    if (i_2 == 0) {
      if (class189_0.method3817(1) != 0) {
        method4601(class189_0, i_1);
      }

      i_3 = class189_0.method3817(13);
      i_4 = class189_0.method3817(13);
      boolean bool_12 = class189_0.method3817(1) == 1;
      if (bool_12) {
        class81.field1166[++class81.field1165 - 1] = i_1;
      }

      if (client.field610[i_1] != null) {
        throw new RuntimeException();
      } else {
        class60 class60_6 = client.field610[i_1] = new class60();
        class60_6.field574 = i_1;
        if (class81.field1157[i_1] != null) {
          class60_6.method1082(class81.field1157[i_1]);
        }

        class60_6.field926 = class81.field1163[i_1];
        class60_6.field897 = class81.field1164[i_1];
        i_7 = class81.field1162[i_1];
        i_8 = i_7 >> 28;
        i_9 = i_7 >> 14 & 0xff;
        i_10 = i_7 & 0xff;
        class60_6.field928[0] = class81.field1153[i_1];
        class60_6.field567 = (byte) i_8;
        class60_6
            .method1103((i_9 << 13) + i_3 - class62.field868, (i_10 << 13) + i_4 - client.field754);
        class60_6.field571 = false;
        return true;
      }
    } else if (i_2 == 1) {
      i_3 = class189_0.method3817(2);
      i_4 = class81.field1162[i_1];
      class81.field1162[i_1] = (i_4 & 0xfffffff) + (((i_4 >> 28) + i_3 & 0x3) << 28);
      return false;
    } else {
      int i_5;
      int i_11;
      if (i_2 == 2) {
        i_3 = class189_0.method3817(5);
        i_4 = i_3 >> 3;
        i_5 = i_3 & 0x7;
        i_11 = class81.field1162[i_1];
        i_7 = (i_11 >> 28) + i_4 & 0x3;
        i_8 = i_11 >> 14 & 0xff;
        i_9 = i_11 & 0xff;
        if (i_5 == 0) {
          --i_8;
          --i_9;
        }

        if (i_5 == 1) {
          --i_9;
        }

        if (i_5 == 2) {
          ++i_8;
          --i_9;
        }

        if (i_5 == 3) {
          --i_8;
        }

        if (i_5 == 4) {
          ++i_8;
        }

        if (i_5 == 5) {
          --i_8;
          ++i_9;
        }

        if (i_5 == 6) {
          ++i_9;
        }

        if (i_5 == 7) {
          ++i_8;
          ++i_9;
        }

        class81.field1162[i_1] = (i_8 << 14) + i_9 + (i_7 << 28);
        return false;
      } else {
        i_3 = class189_0.method3817(18);
        i_4 = i_3 >> 16;
        i_5 = i_3 >> 8 & 0xff;
        i_11 = i_3 & 0xff;
        i_7 = class81.field1162[i_1];
        i_8 = (i_7 >> 28) + i_4 & 0x3;
        i_9 = i_5 + (i_7 >> 14) & 0xff;
        i_10 = i_11 + i_7 & 0xff;
        class81.field1162[i_1] = (i_9 << 14) + i_10 + (i_8 << 28);
        return false;
      }
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
  )
  public int vmethod5815() {
    return this.field3105;
  }

}
