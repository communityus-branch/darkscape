package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class295 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lkc;"
  )
  public static final class295 field3678 = new class295("PLAIN11", "p11_full");
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lkc;"
  )
  public static final class295 field3672 = new class295("PLAIN12", "p12_full");
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lkc;"
  )
  public static final class295 field3668 = new class295("BOLD12", "b12_full");
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lkc;"
  )
  public static final class295 field3673 = new class295("VERDANA11", "verdana_11pt_regular");
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lkc;"
  )
  public static final class295 field3670 = new class295("VERDANA13", "verdana_13pt_regular");
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lkc;"
  )
  public static final class295 field3669 = new class295("VERDANA15", "verdana_15pt_regular");
  @ObfuscatedName("fa")
  static int[] field3676;
  @ObfuscatedName("k")
  final String field3671;
  @ObfuscatedName("i")
  String field3666;

  class295(String string_1, String string_2) {
    this.field3671 = string_1;
    this.field3666 = string_2;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)[Lkc;",
      garbageValue = "106"
  )
  public static class295[] method5498() {
    return new class295[]{field3673, field3668, field3678, field3672, field3670, field3669};
  }

  @ObfuscatedName("fs")
  @ObfuscatedSignature(
      signature = "(Lba;I)V",
      garbageValue = "1542414635"
  )
  static final void method5502(class63 class63_0) {
    class63_0.field873 = false;
    class273 class273_1;
    if (class63_0.field900 != -1) {
      class273_1 = class3.method25(class63_0.field900);
      if (class273_1 != null && class273_1.field3540 != null) {
        ++class63_0.field902;
        if (class63_0.field908 < class273_1.field3540.length
            && class63_0.field902 > class273_1.field3541[class63_0.field908]) {
          class63_0.field902 = 1;
          ++class63_0.field908;
          class173
              .method3471(class273_1, class63_0.field908, class63_0.field931, class63_0.field881);
        }

        if (class63_0.field908 >= class273_1.field3540.length) {
          class63_0.field902 = 0;
          class63_0.field908 = 0;
          class173
              .method3471(class273_1, class63_0.field908, class63_0.field931, class63_0.field881);
        }
      } else {
        class63_0.field900 = -1;
      }
    }

    if (class63_0.field891 != -1 && client.field591 >= class63_0.field911) {
      if (class63_0.field876 < 0) {
        class63_0.field876 = 0;
      }

      int i_3 = class57.method1035(class63_0.field891).field3271;
      if (i_3 != -1) {
        class273 class273_2 = class3.method25(i_3);
        if (class273_2 != null && class273_2.field3540 != null) {
          ++class63_0.field910;
          if (class63_0.field876 < class273_2.field3540.length
              && class63_0.field910 > class273_2.field3541[class63_0.field876]) {
            class63_0.field910 = 1;
            ++class63_0.field876;
            class173
                .method3471(class273_2, class63_0.field876, class63_0.field931, class63_0.field881);
          }

          if (class63_0.field876 >= class273_2.field3540.length && (class63_0.field876 < 0
              || class63_0.field876 >= class273_2.field3540.length)) {
            class63_0.field891 = -1;
          }
        } else {
          class63_0.field891 = -1;
        }
      } else {
        class63_0.field891 = -1;
      }
    }

    if (class63_0.field903 != -1 && class63_0.field906 <= 1) {
      class273_1 = class3.method25(class63_0.field903);
      if (class273_1.field3551 == 1 && class63_0.field930 > 0
          && class63_0.field917 <= client.field591 && class63_0.field918 < client.field591) {
        class63_0.field906 = 1;
        return;
      }
    }

    if (class63_0.field903 != -1 && class63_0.field906 == 0) {
      class273_1 = class3.method25(class63_0.field903);
      if (class273_1 != null && class273_1.field3540 != null) {
        ++class63_0.field901;
        if (class63_0.field904 < class273_1.field3540.length
            && class63_0.field901 > class273_1.field3541[class63_0.field904]) {
          class63_0.field901 = 1;
          ++class63_0.field904;
          class173
              .method3471(class273_1, class63_0.field904, class63_0.field931, class63_0.field881);
        }

        if (class63_0.field904 >= class273_1.field3540.length) {
          class63_0.field904 -= class273_1.field3544;
          ++class63_0.field907;
          if (class63_0.field907 >= class273_1.field3550) {
            class63_0.field903 = -1;
          } else if (class63_0.field904 >= 0 && class63_0.field904 < class273_1.field3540.length) {
            class173
                .method3471(class273_1, class63_0.field904, class63_0.field931, class63_0.field881);
          } else {
            class63_0.field903 = -1;
          }
        }

        class63_0.field873 = class273_1.field3546;
      } else {
        class63_0.field903 = -1;
      }
    }

    if (class63_0.field906 > 0) {
      --class63_0.field906;
    }

  }

  @ObfuscatedName("jl")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "911738943"
  )
  static void method5501() {
    for (class55 class55_0 = (class55) client.field741.method4018(); class55_0 != null;
        class55_0 = (class55) client.field741.method4019()) {
      int i_1 = class55_0.field501;
      if (class261.method4931(i_1)) {
        boolean bool_2 = true;
        class230[] arr_3 = class42.field366[i_1];

        int i_4;
        for (i_4 = 0; i_4 < arr_3.length; i_4++) {
          if (arr_3[i_4] != null) {
            bool_2 = arr_3[i_4].field2604;
            break;
          }
        }

        if (!bool_2) {
          i_4 = (int) class55_0.hashKey;
          class230 class230_5 = class26.method434(i_4);
          if (class230_5 != null) {
            class60.method1114(class230_5);
          }
        }
      }
    }

  }

}
