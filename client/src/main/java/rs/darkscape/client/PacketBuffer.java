package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public final class PacketBuffer extends Buffer {

  @ObfuscatedName("e")
  static final int[] field2374 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095,
      8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607,
      16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE,
      -1};
  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "Lgs;"
  )
  IssacRandom random;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = -1018793601
  )
  int field2375;

  public PacketBuffer(int i_1) {
    super(i_1);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IS)Lkb;",
      garbageValue = "255"
  )
  public static class307 method3847(int i_0) {
    class307[] arr_1 = new class307[]{class307.field3733, class307.field3732, class307.field3734};
    class307[] arr_2 = arr_1;

    for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
      class307 class307_4 = arr_2[i_3];
      if (i_0 == class307_4.field3735) {
        return class307_4;
      }
    }

    return null;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "24564"
  )
  static void method3848() {
    Object object_0 = class248.field3184;
    synchronized (class248.field3184) {
      if (class248.field3179 == 0) {
        class248.field3183 = new Thread(new class248());
        class248.field3183.setDaemon(true);
        class248.field3183.start();
        class248.field3183.setPriority(5);
      }

      class248.field3179 = 600;
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;Ljava/lang/String;B)I",
      garbageValue = "100"
  )
  public static int method3840(Buffer class182_0, String string_1) {
    int i_2 = class182_0.offset;
    byte[] bytes_3 = class244.method4618(string_1);
    class182_0.method3573(bytes_3.length);
    class182_0.offset += class300.field3712
        .method3475(bytes_3, 0, bytes_3.length, class182_0.bytes, class182_0.offset);
    return class182_0.offset - i_2;
  }

  @ObfuscatedName("ig")
  @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "1024436616"
  )
  public void method3836(int[] ints_1) {
    this.random = new IssacRandom(ints_1);
  }

  @ObfuscatedName("ir")
  @ObfuscatedSignature(
      signature = "(Lgs;B)V",
      garbageValue = "-62"
  )
  public void setRandom(IssacRandom random) {
    this.random = random;
  }

  @ObfuscatedName("iv")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-123"
  )
  public void writeEncryptedInt8(int v) {
    super.bytes[++super.offset - 1] = (byte) (v + this.random.next());
  }

  @ObfuscatedName("ic")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1803042160"
  )
  public int getEncryptedUInt8() {
    return super.bytes[++super.offset - 1] - this.random.next() & 0xff;
  }

  @ObfuscatedName("ia")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1051001340"
  )
  public boolean method3821() {
    int i_1 = super.bytes[super.offset] - this.random.method3853() & 0xff;
    return i_1 >= 128;
  }

  @ObfuscatedName("in")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1043804078"
  )
  public int method3841() {
    int i_1 = super.bytes[++super.offset - 1] - this.random.next() & 0xff;
    return i_1 < 128 ? i_1
        : (i_1 - 128 << 8) + (super.bytes[++super.offset - 1] - this.random.next() & 0xff);
  }

  @ObfuscatedName("is")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1583313616"
  )
  public void method3823() {
    this.field2375 = super.offset * 8;
  }

  @ObfuscatedName("iu")
  @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "597450860"
  )
  public int method3817(int i_1) {
    int i_2 = this.field2375 >> 3;
    int i_3 = 8 - (this.field2375 & 0x7);
    int i_4 = 0;

    for (this.field2375 += i_1; i_1 > i_3; i_3 = 8) {
      i_4 += (super.bytes[i_2++] & field2374[i_3]) << i_1 - i_3;
      i_1 -= i_3;
    }

    if (i_3 == i_1) {
      i_4 += super.bytes[i_2] & field2374[i_3];
    } else {
      i_4 += super.bytes[i_2] >> i_3 - i_1 & field2374[i_1];
    }

    return i_4;
  }

  @ObfuscatedName("it")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-535357999"
  )
  public void method3816() {
    super.offset = (this.field2375 + 7) / 8;
  }

  @ObfuscatedName("ie")
  @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "16711935"
  )
  public int method3825(int i_1) {
    return i_1 * 8 - this.field2375;
  }

}
