package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class130 extends SubNode {

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  public static AbstractPack field1801;
  @ObfuscatedName("l")
  static String[] field1800;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "[Lda;"
  )
  class117[] field1802;

  @ObfuscatedSignature(
      signature = "(Lir;Lir;IZ)V",
      garbageValue = "0"
  )
  public class130(AbstractPack class247_1, AbstractPack class247_2, int i_3, boolean bool_4) {
    Deque class205_5 = new Deque();
    int i_6 = class247_1.method4636(i_3);
    this.field1802 = new class117[i_6];
    int[] ints_7 = class247_1.method4668(i_3);

    for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
      byte[] bytes_9 = class247_1.method4625(i_3, ints_7[i_8]);
      class124 class124_10 = null;
      int i_11 = (bytes_9[0] & 0xff) << 8 | bytes_9[1] & 0xff;

      for (class124 class124_12 = (class124) class205_5.getFirst(); class124_12 != null;
          class124_12 = (class124) class205_5.getNext()) {
        if (i_11 == class124_12.field1704) {
          class124_10 = class124_12;
          break;
        }
      }

      if (class124_10 == null) {
        byte[] bytes_13 = class247_2.method4676(i_11, 0);
        class124_10 = new class124(i_11, bytes_13);
        class205_5.addLast(class124_10);
      }

      this.field1802[ints_7[i_8]] = new class117(bytes_9, class124_10);
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)Liu;",
      garbageValue = "1311567042"
  )
  public static class253 method3074(int i_0) {
    class253 class253_1 = (class253) class253.field3228.method3989((long) i_0);
    if (class253_1 != null) {
      return class253_1;
    } else {
      byte[] bytes_2 = class253.field3226.method4625(5, i_0);
      class253_1 = new class253();
      if (bytes_2 != null) {
        class253_1.method4799(new Buffer(bytes_2));
      }

      class253.field3228.method3983(class253_1, (long) i_0);
      return class253_1;
    }
  }

  @ObfuscatedName("jg")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "0"
  )
  static void method3077(int i_0) {
    for (class211 class211_1 = (class211) client.field783.method4018(); class211_1 != null;
        class211_1 = (class211) client.field783.method4019()) {
      if ((long) i_0 == (class211_1.hashKey >> 48 & 0xffffL)) {
        class211_1.unlinkNode();
      }
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1439746475"
  )
  public boolean method3075(int i_1) {
    return this.field1802[i_1].field1552;
  }

}
