package rs.darkscape.client;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.util.ByteArrayPool;

@ObfuscatedName("gk")
public class Buffer extends Node {

  @ObfuscatedName("ay")
  static client field2334;
  @ObfuscatedName("s")
  static int[] crc32Table = new int[256];

  static {
    for (int i = 0; i < 256; i++) {
      int v = i;

      for (int j = 0; j < 8; j++) {
        if ((v & 0x1) == 1) {
          v = v >>> 1 ^ ~0x12477cdf;
        } else {
          v >>>= 1;
        }
      }

      crc32Table[i] = v;
    }
  }

  @ObfuscatedName("z")
  public byte[] bytes;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 1093285509
  )
  public int offset;

  public Buffer(int i_1) {
    this.bytes = ByteArrayPool.getByteArray(i_1);
    this.offset = 0;
  }

  public Buffer(byte[] bytes_1) {
    this.bytes = bytes_1;
    this.offset = 0;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)Ljy;",
      garbageValue = "2135304076"
  )
  public static class266 method3603(int i_0) {
    class266 class266_1 = (class266) class266.field3342.method3989((long) i_0);
    if (class266_1 != null) {
      return class266_1;
    } else {
      byte[] bytes_2 = class266.field3338.method4625(8, i_0);
      class266_1 = new class266();
      if (bytes_2 != null) {
        class266_1.method4978(new Buffer(bytes_2));
      }

      class266.field3342.method3983(class266_1, (long) i_0);
      return class266_1;
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1167762605"
  )
  public void destroy() {
    if (this.bytes != null) {
      ByteArrayPool.pushByteArray(this.bytes);
    }

    this.bytes = null;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "127253271"
  )
  public void putInt8(int i_1) {
    this.bytes[++this.offset - 1] = (byte) i_1;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-745758686"
  )
  public void method3755(int i_1) {
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 8);
    this.bytes[++this.offset - 1] = (byte) i_1;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1989229937"
  )
  public void method3534(int i_1) {
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 16);
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 8);
    this.bytes[++this.offset - 1] = (byte) i_1;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1971281074"
  )
  public void putInt32(int i_1) {
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 24);
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 16);
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 8);
    this.bytes[++this.offset - 1] = (byte) i_1;
  }

  @ObfuscatedName("i")
  public void method3584(long long_1) {
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 40));
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 32));
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 24));
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 16));
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 8));
    this.bytes[++this.offset - 1] = (byte) ((int) long_1);
  }

  @ObfuscatedName("x")
  public void method3659(long long_1) {
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 56));
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 48));
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 40));
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 32));
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 24));
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 16));
    this.bytes[++this.offset - 1] = (byte) ((int) (long_1 >> 8));
    this.bytes[++this.offset - 1] = (byte) ((int) long_1);
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "873639132"
  )
  public void method3766(boolean bool_1) {
    this.putInt8(bool_1 ? 1 : 0);
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1020478938"
  )
  public void method3699(String string_1) {
    int i_2 = string_1.indexOf(0);
    if (i_2 >= 0) {
      throw new IllegalArgumentException("");
    } else {
      this.offset += class23.method421(string_1, 0, string_1.length(), this.bytes, this.offset);
      this.bytes[++this.offset - 1] = 0;
    }
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1348251192"
  )
  public void method3540(String string_1) {
    int i_2 = string_1.indexOf(0);
    if (i_2 >= 0) {
      throw new IllegalArgumentException("");
    } else {
      this.bytes[++this.offset - 1] = 0;
      this.offset += class23.method421(string_1, 0, string_1.length(), this.bytes, this.offset);
      this.bytes[++this.offset - 1] = 0;
    }
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;B)V",
      garbageValue = "103"
  )
  public void method3541(CharSequence charsequence_1) {
    int i_3 = charsequence_1.length();
    int i_4 = 0;

    int i_5;
    for (i_5 = 0; i_5 < i_3; i_5++) {
      char var_6 = charsequence_1.charAt(i_5);
      if (var_6 <= 127) {
        ++i_4;
      } else if (var_6 <= 2047) {
        i_4 += 2;
      } else {
        i_4 += 3;
      }
    }

    this.bytes[++this.offset - 1] = 0;
    this.method3688(i_4);
    i_4 = this.offset;
    byte[] bytes_12 = this.bytes;
    int i_7 = this.offset;
    int i_8 = charsequence_1.length();
    int i_9 = i_7;

    for (int i_10 = 0; i_10 < i_8; i_10++) {
      char var_11 = charsequence_1.charAt(i_10);
      if (var_11 <= 127) {
        bytes_12[i_9++] = (byte) var_11;
      } else if (var_11 <= 2047) {
        bytes_12[i_9++] = (byte) (0xc0 | var_11 >> 6);
        bytes_12[i_9++] = (byte) (0x80 | var_11 & 0x3f);
      } else {
        bytes_12[i_9++] = (byte) (0xe0 | var_11 >> 12);
        bytes_12[i_9++] = (byte) (0x80 | var_11 >> 6 & 0x3f);
        bytes_12[i_9++] = (byte) (0x80 | var_11 & 0x3f);
      }
    }

    i_5 = i_9 - i_7;
    this.offset = i_5 + i_4;
  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "0"
  )
  public void method3542(byte[] bytes_1, int i_2, int i_3) {
    for (int i_4 = i_2; i_4 < i_3 + i_2; i_4++) {
      this.bytes[++this.offset - 1] = bytes_1[i_4];
    }

  }

  @ObfuscatedName("m")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1356616575"
  )
  public void method3543(int i_1) {
    this.bytes[this.offset - i_1 - 4] = (byte) (i_1 >> 24);
    this.bytes[this.offset - i_1 - 3] = (byte) (i_1 >> 16);
    this.bytes[this.offset - i_1 - 2] = (byte) (i_1 >> 8);
    this.bytes[this.offset - i_1 - 1] = (byte) i_1;
  }

  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1030510523"
  )
  public void method3614(int i_1) {
    this.bytes[this.offset - i_1 - 2] = (byte) (i_1 >> 8);
    this.bytes[this.offset - i_1 - 1] = (byte) i_1;
  }

  @ObfuscatedName("t")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "2091286553"
  )
  public void method3545(int i_1) {
    this.bytes[this.offset - i_1 - 1] = (byte) i_1;
  }

  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1027102667"
  )
  public void method3573(int i_1) {
    if (i_1 >= 0 && i_1 < 128) {
      this.putInt8(i_1);
    } else if (i_1 >= 0 && i_1 < 32768) {
      this.method3755(i_1 + 32768);
    } else {
      throw new IllegalArgumentException();
    }
  }

  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1319087228"
  )
  public void method3688(int i_1) {
    if ((i_1 & ~0x7f) != 0) {
      if ((i_1 & ~0x3fff) != 0) {
        if ((i_1 & ~0x1fffff) != 0) {
          if ((i_1 & ~0xfffffff) != 0) {
            this.putInt8(i_1 >>> 28 | 0x80);
          }

          this.putInt8(i_1 >>> 21 | 0x80);
        }

        this.putInt8(i_1 >>> 14 | 0x80);
      }

      this.putInt8(i_1 >>> 7 | 0x80);
    }

    this.putInt8(i_1 & 0x7f);
  }

  @ObfuscatedName("a")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1847684940"
  )
  public int getUInt8() {
    return this.bytes[++this.offset - 1] & 0xff;
  }

  @ObfuscatedName("c")
  @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "1250297886"
  )
  public byte getInt8() {
    return this.bytes[++this.offset - 1];
  }

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1084016458"
  )
  public int getUInt16() {
    this.offset += 2;
    return (this.bytes[this.offset - 1] & 0xff) + ((this.bytes[this.offset - 2] & 0xff) << 8);
  }

  @ObfuscatedName("af")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "0"
  )
  public int method3551() {
    this.offset += 2;
    int i_1 = (this.bytes[this.offset - 1] & 0xff) + ((this.bytes[this.offset - 2] & 0xff) << 8);
    if (i_1 > 32767) {
      i_1 -= 65536;
    }

    return i_1;
  }

  @ObfuscatedName("ah")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "3"
  )
  public int getUInt24() {
    this.offset += 3;
    return ((this.bytes[this.offset - 3] & 0xff) << 16) + (this.bytes[this.offset
        - 1] & 0xff) + ((this.bytes[this.offset - 2] & 0xff) << 8);
  }

  @ObfuscatedName("ab")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "300519100"
  )
  public int getInt32() {
    this.offset += 4;
    return ((this.bytes[this.offset - 3] & 0xff) << 16) + (this.bytes[this.offset
        - 1] & 0xff) + ((this.bytes[this.offset - 2] & 0xff) << 8) + (
        (this.bytes[this.offset - 4] & 0xff) << 24);
  }

  @ObfuscatedName("aw")
  @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-79725029"
  )
  public long getUInt64() {
    long long_1 = (long) this.getInt32() & 0xffffffffL;
    long long_3 = (long) this.getInt32() & 0xffffffffL;
    return (long_1 << 32) + long_3;
  }

  @ObfuscatedName("ak")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1667163047"
  )
  public boolean method3555() {
    return (this.getUInt8() & 0x1) == 1;
  }

  @ObfuscatedName("as")
  @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-38"
  )
  public String method3752() {
    if (this.bytes[this.offset] == 0) {
      ++this.offset;
      return null;
    } else {
      return this.method3738();
    }
  }

  @ObfuscatedName("an")
  @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1431819169"
  )
  public String method3738() {
    int i_1 = this.offset;

    while (this.bytes[++this.offset - 1] != 0) {
    }

    int i_2 = this.offset - i_1 - 1;
    return i_2 == 0 ? "" : class78.method1831(this.bytes, i_1, i_2);
  }

  @ObfuscatedName("ao")
  @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "43"
  )
  public String method3558() {
    byte b_1 = this.bytes[++this.offset - 1];
    if (b_1 != 0) {
      throw new IllegalStateException("");
    } else {
      int i_2 = this.offset;

      while (this.bytes[++this.offset - 1] != 0) {
      }

      int i_3 = this.offset - i_2 - 1;
      return i_3 == 0 ? "" : class78.method1831(this.bytes, i_2, i_3);
    }
  }

  @ObfuscatedName("at")
  @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1097930981"
  )
  public String method3559() {
    byte b_1 = this.bytes[++this.offset - 1];
    if (b_1 != 0) {
      throw new IllegalStateException("");
    } else {
      int i_2 = this.method3566();
      if (i_2 + this.offset > this.bytes.length) {
        throw new IllegalStateException("");
      } else {
        byte[] bytes_4 = this.bytes;
        int i_5 = this.offset;
        char[] arr_6 = new char[i_2];
        int i_7 = 0;
        int i_8 = i_5;

        int i_11;
        for (int i_9 = i_2 + i_5; i_8 < i_9; arr_6[i_7++] = (char) i_11) {
          int i_10 = bytes_4[i_8++] & 0xff;
          if (i_10 < 128) {
            if (i_10 == 0) {
              i_11 = 65533;
            } else {
              i_11 = i_10;
            }
          } else if (i_10 < 192) {
            i_11 = 65533;
          } else if (i_10 < 224) {
            if (i_8 < i_9 && (bytes_4[i_8] & 0xc0) == 128) {
              i_11 = (i_10 & 0x1f) << 6 | bytes_4[i_8++] & 0x3f;
              if (i_11 < 128) {
                i_11 = 65533;
              }
            } else {
              i_11 = 65533;
            }
          } else if (i_10 < 240) {
            if (i_8 + 1 < i_9 && (bytes_4[i_8] & 0xc0) == 128 && (bytes_4[i_8 + 1] & 0xc0) == 128) {
              i_11 = (i_10 & 0xf) << 12 | (bytes_4[i_8++] & 0x3f) << 6 | bytes_4[i_8++] & 0x3f;
              if (i_11 < 2048) {
                i_11 = 65533;
              }
            } else {
              i_11 = 65533;
            }
          } else if (i_10 < 248) {
            if (i_8 + 2 < i_9 && (bytes_4[i_8] & 0xc0) == 128 && (bytes_4[i_8 + 1] & 0xc0) == 128
                && (bytes_4[i_8 + 2] & 0xc0) == 128) {
              i_11 =
                  (i_10 & 0x7) << 18 | (bytes_4[i_8++] & 0x3f) << 12 | (bytes_4[i_8++] & 0x3f) << 6
                      | bytes_4[i_8++] & 0x3f;
              if (i_11 >= 65536 && i_11 <= 1114111) {
                i_11 = 65533;
              } else {
                i_11 = 65533;
              }
            } else {
              i_11 = 65533;
            }
          } else {
            i_11 = 65533;
          }
        }

        String string_3 = new String(arr_6, 0, i_7);
        this.offset += i_2;
        return string_3;
      }
    }
  }

  @ObfuscatedName("ai")
  @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "35"
  )
  public void method3539(byte[] bytes_1, int i_2, int i_3) {
    for (int i_4 = i_2; i_4 < i_3 + i_2; i_4++) {
      bytes_1[i_4] = this.bytes[++this.offset - 1];
    }

  }

  @ObfuscatedName("ac")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1820753890"
  )
  public int method3561() {
    int i_1 = this.bytes[this.offset] & 0xff;
    return i_1 < 128 ? this.getUInt8() - 64 : this.getUInt16() - 49152;
  }

  @ObfuscatedName("ap")
  @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "-18314"
  )
  public int method3562() {
    int i_1 = this.bytes[this.offset] & 0xff;
    return i_1 < 128 ? this.getUInt8() : this.getUInt16() - 32768;
  }

  @ObfuscatedName("aa")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "65"
  )
  public int method3563() {
    int i_1 = 0;

    int i_2;
    for (i_2 = this.method3562(); i_2 == 32767; i_2 = this.method3562()) {
      i_1 += 32767;
    }

    i_1 += i_2;
    return i_1;
  }

  @ObfuscatedName("ar")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1860852380"
  )
  public int getUSmart32() {
    return this.bytes[this.offset] < 0 ? this.getInt32() & 0x7fffffff : this.getUInt16();
  }

  @ObfuscatedName("au")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1133683651"
  )
  public int method3546() {
    if (this.bytes[this.offset] < 0) {
      return this.getInt32() & 0x7fffffff;
    } else {
      int i_1 = this.getUInt16();
      return i_1 == 32767 ? -1 : i_1;
    }
  }

  @ObfuscatedName("av")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-179794498"
  )
  public int method3566() {
    byte b_1 = this.bytes[++this.offset - 1];

    int i_2;
    for (i_2 = 0; b_1 < 0; b_1 = this.bytes[++this.offset - 1]) {
      i_2 = (i_2 | b_1 & 0x7f) << 7;
    }

    return i_2 | b_1;
  }

  @ObfuscatedName("al")
  @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "1224350853"
  )
  public void method3567(int[] ints_1) {
    int i_2 = this.offset / 8;
    this.offset = 0;

    for (int i_3 = 0; i_3 < i_2; i_3++) {
      int i_4 = this.getInt32();
      int i_5 = this.getInt32();
      int i_6 = 0;
      int i_7 = -1640531527;

      for (int i_8 = 32; i_8-- > 0;
          i_5 += i_4 + (i_4 << 4 ^ i_4 >>> 5) ^ ints_1[i_6 >>> 11 & 0x3] + i_6) {
        i_4 += i_5 + (i_5 << 4 ^ i_5 >>> 5) ^ i_6 + ints_1[i_6 & 0x3];
        i_6 += i_7;
      }

      this.offset -= 8;
      this.putInt32(i_4);
      this.putInt32(i_5);
    }

  }

  @ObfuscatedName("ae")
  @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "2094043910"
  )
  public void method3553(int[] ints_1) {
    int i_2 = this.offset / 8;
    this.offset = 0;

    for (int i_3 = 0; i_3 < i_2; i_3++) {
      int i_4 = this.getInt32();
      int i_5 = this.getInt32();
      int i_6 = -957401312;
      int i_7 = -1640531527;

      for (int i_8 = 32; i_8-- > 0; i_4 -= i_5 + (i_5 << 4 ^ i_5 >>> 5) ^ i_6 + ints_1[i_6 & 0x3]) {
        i_5 -= i_4 + (i_4 << 4 ^ i_4 >>> 5) ^ ints_1[i_6 >>> 11 & 0x3] + i_6;
        i_6 -= i_7;
      }

      this.offset -= 8;
      this.putInt32(i_4);
      this.putInt32(i_5);
    }

  }

  @ObfuscatedName("az")
  @ObfuscatedSignature(
      signature = "([IIIB)V",
      garbageValue = "30"
  )
  public void method3569(int[] ints_1, int i_2, int i_3) {
    int i_4 = this.offset;
    this.offset = i_2;
    int i_5 = (i_3 - i_2) / 8;

    for (int i_6 = 0; i_6 < i_5; i_6++) {
      int i_7 = this.getInt32();
      int i_8 = this.getInt32();
      int i_9 = 0;
      int i_10 = -1640531527;

      for (int i_11 = 32; i_11-- > 0;
          i_8 += i_7 + (i_7 << 4 ^ i_7 >>> 5) ^ ints_1[i_9 >>> 11 & 0x3] + i_9) {
        i_7 += i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ i_9 + ints_1[i_9 & 0x3];
        i_9 += i_10;
      }

      this.offset -= 8;
      this.putInt32(i_7);
      this.putInt32(i_8);
    }

    this.offset = i_4;
  }

  @ObfuscatedName("aq")
  @ObfuscatedSignature(
      signature = "([IIII)V",
      garbageValue = "-2112776432"
  )
  public void method3570(int[] ints_1, int i_2, int i_3) {
    int i_4 = this.offset;
    this.offset = i_2;
    int i_5 = (i_3 - i_2) / 8;

    for (int i_6 = 0; i_6 < i_5; i_6++) {
      int i_7 = this.getInt32();
      int i_8 = this.getInt32();
      int i_9 = -957401312;
      int i_10 = -1640531527;

      for (int i_11 = 32; i_11-- > 0;
          i_7 -= i_8 + (i_8 << 4 ^ i_8 >>> 5) ^ i_9 + ints_1[i_9 & 0x3]) {
        i_8 -= i_7 + (i_7 << 4 ^ i_7 >>> 5) ^ ints_1[i_9 >>> 11 & 0x3] + i_9;
        i_9 -= i_10;
      }

      this.offset -= 8;
      this.putInt32(i_7);
      this.putInt32(i_8);
    }

    this.offset = i_4;
  }

  @ObfuscatedName("ad")
  @ObfuscatedSignature(
      signature = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
      garbageValue = "-2021764687"
  )
  public void method3571(BigInteger biginteger_1, BigInteger biginteger_2) {
    int i_3 = this.offset;
    this.offset = 0;
    byte[] bytes_4 = new byte[i_3];
    this.method3539(bytes_4, 0, i_3);
    BigInteger biginteger_5 = new BigInteger(bytes_4);
    BigInteger biginteger_6 = biginteger_5.modPow(biginteger_1, biginteger_2);
    byte[] bytes_7 = biginteger_6.toByteArray();
    this.offset = 0;
    this.method3755(bytes_7.length);
    this.method3542(bytes_7, 0, bytes_7.length);
  }

  @ObfuscatedName("aj")
  @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "1"
  )
  public int method3572(int i_1) {
    int i_2 = class187.computeChecksum(this.bytes, i_1, this.offset);
    this.putInt32(i_2);
    return i_2;
  }

  @ObfuscatedName("ax")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-560337220"
  )
  public boolean method3756() {
    this.offset -= 4;
    int i_1 = class187.computeChecksum(this.bytes, 0, this.offset);
    int i_2 = this.getInt32();
    return i_2 == i_1;
  }

  @ObfuscatedName("am")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "108964368"
  )
  public void method3574(int i_1) {
    this.bytes[++this.offset - 1] = (byte) (i_1 + 128);
  }

  @ObfuscatedName("ay")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "0"
  )
  public void method3575(int i_1) {
    this.bytes[++this.offset - 1] = (byte) (0 - i_1);
  }

  @ObfuscatedName("ag")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2095651768"
  )
  public void method3576(int i_1) {
    this.bytes[++this.offset - 1] = (byte) (128 - i_1);
  }

  @ObfuscatedName("bk")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1015540220"
  )
  public int method3577() {
    return this.bytes[++this.offset - 1] - 128 & 0xff;
  }

  @ObfuscatedName("bp")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-333234069"
  )
  public int method3607() {
    return 0 - this.bytes[++this.offset - 1] & 0xff;
  }

  @ObfuscatedName("bi")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-667606696"
  )
  public int method3765() {
    return 128 - this.bytes[++this.offset - 1] & 0xff;
  }

  @ObfuscatedName("bj")
  @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "-1200890810"
  )
  public byte method3660() {
    return (byte) (this.bytes[++this.offset - 1] - 128);
  }

  @ObfuscatedName("bo")
  @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "-1272283600"
  )
  public byte method3610() {
    return (byte) (128 - this.bytes[++this.offset - 1]);
  }

  @ObfuscatedName("bq")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-35"
  )
  public void method3582(int i_1) {
    this.bytes[++this.offset - 1] = (byte) i_1;
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 8);
  }

  @ObfuscatedName("bh")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "1"
  )
  public void method3583(int i_1) {
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 8);
    this.bytes[++this.offset - 1] = (byte) (i_1 + 128);
  }

  @ObfuscatedName("bz")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "355756817"
  )
  public void method3771(int i_1) {
    this.bytes[++this.offset - 1] = (byte) (i_1 + 128);
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 8);
  }

  @ObfuscatedName("bu")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-125"
  )
  public int method3585() {
    this.offset += 2;
    return ((this.bytes[this.offset - 1] & 0xff) << 8) + (this.bytes[this.offset - 2] & 0xff);
  }

  @ObfuscatedName("bg")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1914369906"
  )
  public int method3613() {
    this.offset += 2;
    return (this.bytes[this.offset - 1] - 128 & 0xff) + ((this.bytes[this.offset - 2] & 0xff) << 8);
  }

  @ObfuscatedName("bl")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "104"
  )
  public int method3646() {
    this.offset += 2;
    return ((this.bytes[this.offset - 1] & 0xff) << 8) + (this.bytes[this.offset - 2] - 128 & 0xff);
  }

  @ObfuscatedName("ba")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-37"
  )
  public int method3588() {
    this.offset += 2;
    int i_1 = ((this.bytes[this.offset - 1] & 0xff) << 8) + (this.bytes[this.offset - 2] & 0xff);
    if (i_1 > 32767) {
      i_1 -= 65536;
    }

    return i_1;
  }

  @ObfuscatedName("bn")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-146230491"
  )
  public int method3533() {
    this.offset += 2;
    int i_1 =
        ((this.bytes[this.offset - 1] & 0xff) << 8) + (this.bytes[this.offset - 2] - 128 & 0xff);
    if (i_1 > 32767) {
      i_1 -= 65536;
    }

    return i_1;
  }

  @ObfuscatedName("bb")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "7272657"
  )
  public void method3731(int i_1) {
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 8);
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 16);
    this.bytes[++this.offset - 1] = (byte) i_1;
  }

  @ObfuscatedName("bx")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2079468396"
  )
  public int method3591() {
    this.offset += 3;
    return ((this.bytes[this.offset - 1] & 0xff) << 8) + ((this.bytes[this.offset - 3] & 0xff)
        << 16) + (this.bytes[this.offset
        - 2] & 0xff);
  }

  @ObfuscatedName("bc")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "18"
  )
  public void method3687(int i_1) {
    this.bytes[++this.offset - 1] = (byte) i_1;
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 8);
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 16);
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 24);
  }

  @ObfuscatedName("bs")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "351806005"
  )
  public void method3673(int i_1) {
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 8);
    this.bytes[++this.offset - 1] = (byte) i_1;
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 24);
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 16);
  }

  @ObfuscatedName("be")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1686058636"
  )
  public void method3594(int i_1) {
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 16);
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 24);
    this.bytes[++this.offset - 1] = (byte) i_1;
    this.bytes[++this.offset - 1] = (byte) (i_1 >> 8);
  }

  @ObfuscatedName("by")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2045011915"
  )
  public int method3595() {
    this.offset += 4;
    return (this.bytes[this.offset - 4] & 0xff) + ((this.bytes[this.offset
        - 3] & 0xff) << 8) + ((this.bytes[this.offset
        - 2] & 0xff) << 16) + ((this.bytes[this.offset - 1] & 0xff) << 24);
  }

  @ObfuscatedName("bv")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-557412257"
  )
  public int method3770() {
    this.offset += 4;
    return ((this.bytes[this.offset - 2] & 0xff) << 24) + ((this.bytes[this.offset - 4] & 0xff)
        << 8) + (this.bytes[this.offset
        - 3] & 0xff) + ((this.bytes[this.offset - 1] & 0xff) << 16);
  }

  @ObfuscatedName("br")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1053759299"
  )
  public int method3609() {
    this.offset += 4;
    return ((this.bytes[this.offset - 1] & 0xff) << 8) + ((this.bytes[this.offset - 4] & 0xff)
        << 16) + (this.bytes[this.offset
        - 2] & 0xff) + ((this.bytes[this.offset - 3] & 0xff) << 24);
  }

}
