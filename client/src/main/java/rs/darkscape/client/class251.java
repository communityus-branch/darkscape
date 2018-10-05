package rs.darkscape.client;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class251 {

  @ObfuscatedName("z")
  final HashMap field3220 = new HashMap();
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lkg;"
  )
  class310 field3219 = new class310(0, 0);
  @ObfuscatedName("s")
  int[] field3218 = new int[2048];
  @ObfuscatedName("l")
  int[] field3216 = new int[2048];
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1551393161
  )
  int field3217 = 0;

  public class251() {
    class64.method1560();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
      garbageValue = "-1980014136"
  )
  public static String method4794(CharSequence[] arr_0, int i_1, int i_2) {
    if (i_2 == 0) {
      return "";
    } else if (i_2 == 1) {
      CharSequence charsequence_3 = arr_0[i_1];
      return charsequence_3 == null ? "null" : charsequence_3.toString();
    } else {
      int i_8 = i_2 + i_1;
      int i_4 = 0;

      for (int i_5 = i_1; i_5 < i_8; i_5++) {
        CharSequence charsequence_6 = arr_0[i_5];
        if (charsequence_6 == null) {
          i_4 += 4;
        } else {
          i_4 += charsequence_6.length();
        }
      }

      StringBuilder stringbuilder_9 = new StringBuilder(i_4);

      for (int i_10 = i_1; i_10 < i_8; i_10++) {
        CharSequence charsequence_7 = arr_0[i_10];
        if (charsequence_7 == null) {
          stringbuilder_9.append("null");
        } else {
          stringbuilder_9.append(charsequence_7);
        }
      }

      return stringbuilder_9.toString();
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1389377337"
  )
  void method4771(int i_1) {
    int i_2 = i_1 * 2 + 1;
    double[] doubles_3 = class266.method4986(0.0D, (double) ((float) i_1 / 3.0F), i_1);
    double d_4 = doubles_3[i_1] * doubles_3[i_1];
    int[] ints_6 = new int[i_2 * i_2];
    boolean bool_7 = false;

    for (int i_8 = 0; i_8 < i_2; i_8++) {
      for (int i_9 = 0; i_9 < i_2; i_9++) {
        int i_10 = ints_6[i_9 + i_8 * i_2] = (int) (256.0D * (doubles_3[i_8] * doubles_3[i_9]
            / d_4));
        if (!bool_7 && i_10 > 0) {
          bool_7 = true;
        }
      }
    }

    class318 class318_11 = new class318(ints_6, i_2, i_2);
    this.field3220.put(Integer.valueOf(i_1), class318_11);
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IB)Lll;",
      garbageValue = "85"
  )
  class318 method4772(int i_1) {
    if (!this.field3220.containsKey(Integer.valueOf(i_1))) {
      this.method4771(i_1);
    }

    return (class318) this.field3220.get(Integer.valueOf(i_1));
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1087608107"
  )
  public final void method4773(int i_1, int i_2) {
    if (this.field3217 < this.field3218.length) {
      this.field3218[this.field3217] = i_1;
      this.field3216[this.field3217] = i_2;
      ++this.field3217;
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "641561299"
  )
  public final void method4774() {
    this.field3217 = 0;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(IILll;FI)V",
      garbageValue = "2066136906"
  )
  public final void method4776(int i_1, int i_2, class318 class318_3, float f_4) {
    int i_5 = (int) (f_4 * 18.0F);
    class318 class318_6 = this.method4772(i_5);
    int i_7 = i_5 * 2 + 1;
    class310 class310_8 = new class310(0, 0, class318_3.field3787, class318_3.field3788);
    class310 class310_9 = new class310(0, 0);
    this.field3219.method5680(i_7, i_7);
    System.nanoTime();

    int i_10;
    int i_11;
    int i_12;
    for (i_10 = 0; i_10 < this.field3217; i_10++) {
      i_11 = this.field3218[i_10];
      i_12 = this.field3216[i_10];
      int i_13 = (int) ((float) (i_11 - i_1) * f_4) - i_5;
      int i_14 = (int) ((float) class318_3.field3788 - f_4 * (float) (i_12 - i_2)) - i_5;
      this.field3219.method5679(i_13, i_14);
      this.field3219.method5681(class310_8, class310_9);
      this.method4790(class318_6, class318_3, class310_9);
    }

    System.nanoTime();
    System.nanoTime();

    for (i_10 = 0; i_10 < class318_3.field3791.length; i_10++) {
      if (class318_3.field3791[i_10] == 0) {
        class318_3.field3791[i_10] = -16777216;
      } else {
        i_11 = (class318_3.field3791[i_10] + 64 - 1) / 256;
        if (i_11 <= 0) {
          class318_3.field3791[i_10] = -16777216;
        } else {
          if (i_11 > class224.field2554.length) {
            i_11 = class224.field2554.length;
          }

          i_12 = class224.field2554[i_11 - 1];
          class318_3.field3791[i_10] = ~0xffffff | i_12;
        }
      }
    }

    System.nanoTime();
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(Lll;Lll;Lkg;B)V",
      garbageValue = "-68"
  )
  void method4790(class318 class318_1, class318 class318_2, class310 class310_3) {
    if (class310_3.field3747 != 0 && class310_3.field3745 != 0) {
      int i_4 = 0;
      int i_5 = 0;
      if (class310_3.field3746 == 0) {
        i_4 = class318_1.field3787 - class310_3.field3747;
      }

      if (class310_3.field3743 == 0) {
        i_5 = class318_1.field3788 - class310_3.field3745;
      }

      int i_6 = i_4 + i_5 * class318_1.field3787;
      int i_7 = class310_3.field3746 + class318_2.field3787 * class310_3.field3743;

      for (int i_8 = 0; i_8 < class310_3.field3745; i_8++) {
        for (int i_9 = 0; i_9 < class310_3.field3747; i_9++) {
          int i_10001 = i_7++;
          class318_2.field3791[i_10001] += class318_1.field3791[i_6++];
        }

        i_6 += class318_1.field3787 - class310_3.field3747;
        i_7 += class318_2.field3787 - class310_3.field3747;
      }

    }
  }

}
