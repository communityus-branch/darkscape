package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public enum class233 implements class188 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2773(0, 0),
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2775(1, 0),
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2755(2, 0),
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2757(3, 0),
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2758(9, 2),
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2754(4, 1),
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2770(5, 1),
  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2761(6, 1),
  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2762(7, 1),
  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2763(8, 1),
  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2760(12, 2),
  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2765(13, 2),
  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2766(14, 2),
  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2767(15, 2),
  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2768(16, 2),
  @ObfuscatedName("m")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2769(17, 2),
  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2774(18, 2),
  @ObfuscatedName("t")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2771(19, 2),
  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2772(20, 2),
  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2756(21, 2),
  @ObfuscatedName("a")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2759(10, 2),
  @ObfuscatedName("j")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2764(11, 2),
  @ObfuscatedName("d")
  @ObfuscatedSignature(
      signature = "Lhl;"
  )
  field2776(22, 3);

  @ObfuscatedName("h")
  @ObfuscatedGetter(
      intValue = -89106173
  )
  public final int field2777;

  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
  )
  class233(int i_3, int i_4) {
    this.field2777 = i_3;
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(Lir;II)Lly;",
      garbageValue = "-1839830741"
  )
  public static class317 method4589(AbstractPack class247_0, int id) {
    byte[] bytes = class247_0.get(id);
    boolean success = false;
    if (bytes != null) {
      SpriteDecoder.decodeSprite(bytes);
      success = true;
    }

    return !success ? null : class305.method5658();
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "-31"
  )
  static final void method4588(String string_0) {
    StringBuilder stringbuilder_10000 = (new StringBuilder()).append(string_0);
    Object obj_10001 = null;
    String string_1 = stringbuilder_10000.append(" is already on your friend list").toString();
    class143.method3172(30, "", string_1);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "59"
  )
  public int vmethod5815() {
    return this.field2777;
  }

}
