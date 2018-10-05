package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class98 {

  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = 866276291
  )
  static int field1335;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  HashMap field1332 = new HashMap(256);
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  HashMap field1333 = new HashMap(256);
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  AbstractPack field1334;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  AbstractPack field1331;

  @ObfuscatedSignature(
      signature = "(Lir;Lir;)V"
  )
  public class98(AbstractPack class247_1, AbstractPack class247_2) {
    this.field1334 = class247_1;
    this.field1331 = class247_2;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II[IB)Lct;",
      garbageValue = "0"
  )
  class93 method2223(int i_1, int i_2, int[] ints_3) {
    int i_4 = i_2 ^ (i_1 << 4 & 0xffff | i_1 >>> 12);
    i_4 |= i_1 << 16;
    long long_5 = (long) i_4;
    class93 class93_7 = (class93) this.field1333.get(long_5);
    if (class93_7 != null) {
      return class93_7;
    } else if (ints_3 != null && ints_3[0] <= 0) {
      return null;
    } else {
      class91 class91_8 = class91.method2071(this.field1334, i_1, i_2);
      if (class91_8 == null) {
        return null;
      } else {
        class93_7 = class91_8.method2069();
        this.field1333.put(class93_7, long_5);
        if (ints_3 != null) {
          ints_3[0] -= class93_7.field1278.length;
        }

        return class93_7;
      }
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II[II)Lct;",
      garbageValue = "70852076"
  )
  class93 method2218(int i_1, int i_2, int[] ints_3) {
    int i_4 = i_2 ^ (i_1 << 4 & 0xffff | i_1 >>> 12);
    i_4 |= i_1 << 16;
    long long_5 = (long) i_4 ^ 0x100000000L;
    class93 class93_7 = (class93) this.field1333.get(long_5);
    if (class93_7 != null) {
      return class93_7;
    } else if (ints_3 != null && ints_3[0] <= 0) {
      return null;
    } else {
      class92 class92_8 = (class92) this.field1332.get(long_5);
      if (class92_8 == null) {
        class92_8 = class92.method2088(this.field1331, i_1, i_2);
        if (class92_8 == null) {
          return null;
        }

        this.field1332.put(class92_8, long_5);
      }

      class93_7 = class92_8.method2083(ints_3);
      if (class93_7 == null) {
        return null;
      } else {
        class92_8.unlinkNode();
        this.field1333.put(class93_7, long_5);
        return class93_7;
      }
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I[II)Lct;",
      garbageValue = "2090805346"
  )
  public class93 method2216(int i_1, int[] ints_2) {
    if (this.field1334.method4637() == 1) {
      return this.method2223(0, i_1, ints_2);
    } else if (this.field1334.method4636(i_1) == 1) {
      return this.method2223(i_1, 0, ints_2);
    } else {
      throw new RuntimeException();
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I[II)Lct;",
      garbageValue = "1187754020"
  )
  public class93 method2220(int i_1, int[] ints_2) {
    if (this.field1331.method4637() == 1) {
      return this.method2218(0, i_1, ints_2);
    } else if (this.field1331.method4636(i_1) == 1) {
      return this.method2218(i_1, 0, ints_2);
    } else {
      throw new RuntimeException();
    }
  }

}
