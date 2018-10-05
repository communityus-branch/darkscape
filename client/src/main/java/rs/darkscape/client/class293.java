package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class293 extends class285 {

  @ObfuscatedName("eg")
  @ObfuscatedSignature(
      signature = "Lkj;"
  )
  static class298 field3660;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Llm;"
  )
  final class322 field3656;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lke;"
  )
  final class288 field3652;
  @ObfuscatedName("e")
  public String field3654 = null;
  @ObfuscatedName("p")
  public String field3655 = null;
  @ObfuscatedName("b")
  public byte field3651;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = 1049775565
  )
  public int field3657;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = -1251671567
  )
  int field3658 = 1;

  @ObfuscatedSignature(
      signature = "(Llm;Lke;)V"
  )
  public class293(class322 class322_1, class288 class288_2) {
    super(100);
    this.field3656 = class322_1;
    this.field3652 = class288_2;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(CB)Z",
      garbageValue = "-34"
  )
  public static boolean method5496(char var_0) {
    if ((var_0 <= 0 || var_0 >= 128) && (var_0 < 160 || var_0 > 255)) {
      if (var_0 != 0) {
        char[] arr_1 = class301.field3714;

        for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
          char var_3 = arr_1[i_2];
          if (var_0 == var_3) {
            return true;
          }
        }
      }

      return false;
    } else {
      return true;
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
  )
  class282 vmethod5461() {
    return new class281();
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
  )
  class282[] vmethod5462(int i_1) {
    return new class281[i_1];
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "191342442"
  )
  final void method5477(String string_1) {
    long long_5 = 0L;
    int i_7 = string_1.length();

    for (int i_8 = 0; i_8 < i_7; i_8++) {
      long_5 *= 37L;
      char var_9 = string_1.charAt(i_8);
      if (var_9 >= 65 && var_9 <= 90) {
        long_5 += (long) (var_9 + 1 - 65);
      } else if (var_9 >= 97 && var_9 <= 122) {
        long_5 += (long) (var_9 + 1 - 97);
      } else if (var_9 >= 48 && var_9 <= 57) {
        long_5 += (long) (var_9 + 27 - 48);
      }

      if (long_5 >= 177917621779460413L) {
        break;
      }
    }

    while (long_5 % 37L == 0L && long_5 != 0L) {
      long_5 /= 37L;
    }

    String string_10 = OutboundPacket.method3457(long_5);
    if (string_10 == null) {
      string_10 = "";
    }

    this.field3654 = string_10;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1517543240"
  )
  final void method5464(String string_1) {
    long long_5 = 0L;
    int i_7 = string_1.length();

    for (int i_8 = 0; i_8 < i_7; i_8++) {
      long_5 *= 37L;
      char var_9 = string_1.charAt(i_8);
      if (var_9 >= 65 && var_9 <= 90) {
        long_5 += (long) (var_9 + 1 - 65);
      } else if (var_9 >= 97 && var_9 <= 122) {
        long_5 += (long) (var_9 + 1 - 97);
      } else if (var_9 >= 48 && var_9 <= 57) {
        long_5 += (long) (var_9 + 27 - 48);
      }

      if (long_5 >= 177917621779460413L) {
        break;
      }
    }

    while (long_5 % 37L == 0L && long_5 != 0L) {
      long_5 /= 37L;
    }

    String string_10 = OutboundPacket.method3457(long_5);
    if (string_10 == null) {
      string_10 = "";
    }

    this.field3655 = string_10;
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "-107804510"
  )
  public final void method5463(Buffer class182_1) {
    this.method5464(class182_1.method3738());
    long long_2 = class182_1.getUInt64();
    long long_5 = long_2;
    String string_4;
    int i_7;
    if (long_2 > 0L && long_2 < 6582952005840035281L) {
      if (long_2 % 37L == 0L) {
        string_4 = null;
      } else {
        i_7 = 0;

        for (long long_8 = long_2; long_8 != 0L; long_8 /= 37L) {
          ++i_7;
        }

        StringBuilder stringbuilder_10 = new StringBuilder(i_7);

        while (long_5 != 0L) {
          long long_11 = long_5;
          long_5 /= 37L;
          stringbuilder_10.append(class303.field3720[(int) (long_11 - long_5 * 37L)]);
        }

        string_4 = stringbuilder_10.reverse().toString();
      }
    } else {
      string_4 = null;
    }

    this.method5477(string_4);
    this.field3651 = class182_1.getInt8();
    i_7 = class182_1.getUInt8();
    if (i_7 != 255) {
      this.method5326();

      for (int i_13 = 0; i_13 < i_7; i_13++) {
        class281 class281_9 = (class281) this
            .method5377(new class291(class182_1.method3738(), this.field3656));
        int i_14 = class182_1.getUInt16();
        class281_9.method5412(i_14, ++this.field3658 - 1);
        class281_9.field3629 = class182_1.getInt8();
        class182_1.method3738();
        this.method5482(class281_9);
      }

    }
  }

  @ObfuscatedName("cf")
  @ObfuscatedSignature(
      signature = "(Lgk;I)V",
      garbageValue = "345415230"
  )
  public final void method5489(Buffer class182_1) {
    class291 class291_2 = new class291(class182_1.method3738(), this.field3656);
    int i_3 = class182_1.getUInt16();
    byte b_4 = class182_1.getInt8();
    boolean bool_5 = false;
    if (b_4 == -128) {
      bool_5 = true;
    }

    class281 class281_6;
    if (bool_5) {
      if (this.method5327() == 0) {
        return;
      }

      class281_6 = (class281) this.method5331(class291_2);
      if (class281_6 != null && class281_6.method5414() == i_3) {
        this.method5334(class281_6);
      }
    } else {
      class182_1.method3738();
      class281_6 = (class281) this.method5331(class291_2);
      if (class281_6 == null) {
        if (this.method5327() > super.field3620) {
          return;
        }

        class281_6 = (class281) this.method5377(class291_2);
      }

      class281_6.method5412(i_3, ++this.field3658 - 1);
      class281_6.field3629 = b_4;
      this.method5482(class281_6);
    }

  }

  @ObfuscatedName("ca")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-54"
  )
  public final void method5467() {
    for (int i_1 = 0; i_1 < this.method5327(); i_1++) {
      ((class281) this.method5336(i_1)).method5272();
    }

  }

  @ObfuscatedName("cr")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "453420624"
  )
  public final void method5468() {
    for (int i_1 = 0; i_1 < this.method5327(); i_1++) {
      ((class281) this.method5336(i_1)).method5273();
    }

  }

  @ObfuscatedName("cv")
  @ObfuscatedSignature(
      signature = "(Ljz;I)V",
      garbageValue = "-1325604678"
  )
  final void method5482(class281 class281_1) {
    if (class281_1.method5287().equals(this.field3652.vmethod5420())) {
      this.field3657 = class281_1.field3629;
    }

  }

}
