package rs.darkscape.client;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
public class class23 {

  @ObfuscatedName("t")
  @ObfuscatedSignature(
      signature = "Lha;"
  )
  static final class226 field193 = new class226();
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Lgl;"
  )
  static class201 field188 = new class201(37748736, 256);
  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "Lgl;"
  )
  static class201 field189 = new class201(256, 256);
  @ObfuscatedName("r")
  final HashMap field198;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = -1247610435
  )
  int field191;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 1988652209
  )
  int field192;
  @ObfuscatedName("b")
  LinkedList field195;
  @ObfuscatedName("g")
  List field196;
  @ObfuscatedName("m")
  HashMap field199;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = 1028613213
  )
  int field194;
  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "Lp;"
  )
  class10 field197;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = 1441464419
  )
  int field187;

  class23(int i_1, int i_2, int i_3, HashMap hashmap_4) {
    this.field191 = i_1;
    this.field192 = i_2;
    this.field195 = new LinkedList();
    this.field196 = new LinkedList();
    this.field199 = new HashMap();
    this.field194 = i_3 | ~0xffffff;
    this.field198 = hashmap_4;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)[Lli;",
      garbageValue = "-13"
  )
  public static class316[] method423() {
    return new class316[]{class316.field3771, class316.field3775, class316.field3774,
        class316.field3772, class316.field3773};
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(ILir;Ljava/lang/String;Ljava/lang/String;IZI)V",
      garbageValue = "-469912607"
  )
  public static void method422(int i_0, AbstractPack class247_1, String string_2, String string_3,
                               int i_4, boolean bool_5) {
    int i_6 = class247_1.method4642(string_2);
    int i_7 = class247_1.method4643(i_6, string_3);
    class65.method1602(i_0, class247_1, i_6, i_7, i_4, bool_5);
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;II[BII)I",
      garbageValue = "488772559"
  )
  public static int method421(CharSequence charsequence_0, int i_1, int i_2, byte[] bytes_3,
                              int i_4) {
    int i_5 = i_2 - i_1;

    for (int i_6 = 0; i_6 < i_5; i_6++) {
      char var_7 = charsequence_0.charAt(i_6 + i_1);
      if (var_7 > 0 && var_7 < 128 || var_7 >= 160 && var_7 <= 255) {
        bytes_3[i_6 + i_4] = (byte) var_7;
      } else if (var_7 == 8364) {
        bytes_3[i_6 + i_4] = -128;
      } else if (var_7 == 8218) {
        bytes_3[i_6 + i_4] = -126;
      } else if (var_7 == 402) {
        bytes_3[i_6 + i_4] = -125;
      } else if (var_7 == 8222) {
        bytes_3[i_6 + i_4] = -124;
      } else if (var_7 == 8230) {
        bytes_3[i_6 + i_4] = -123;
      } else if (var_7 == 8224) {
        bytes_3[i_6 + i_4] = -122;
      } else if (var_7 == 8225) {
        bytes_3[i_6 + i_4] = -121;
      } else if (var_7 == 710) {
        bytes_3[i_6 + i_4] = -120;
      } else if (var_7 == 8240) {
        bytes_3[i_6 + i_4] = -119;
      } else if (var_7 == 352) {
        bytes_3[i_6 + i_4] = -118;
      } else if (var_7 == 8249) {
        bytes_3[i_6 + i_4] = -117;
      } else if (var_7 == 338) {
        bytes_3[i_6 + i_4] = -116;
      } else if (var_7 == 381) {
        bytes_3[i_6 + i_4] = -114;
      } else if (var_7 == 8216) {
        bytes_3[i_6 + i_4] = -111;
      } else if (var_7 == 8217) {
        bytes_3[i_6 + i_4] = -110;
      } else if (var_7 == 8220) {
        bytes_3[i_6 + i_4] = -109;
      } else if (var_7 == 8221) {
        bytes_3[i_6 + i_4] = -108;
      } else if (var_7 == 8226) {
        bytes_3[i_6 + i_4] = -107;
      } else if (var_7 == 8211) {
        bytes_3[i_6 + i_4] = -106;
      } else if (var_7 == 8212) {
        bytes_3[i_6 + i_4] = -105;
      } else if (var_7 == 732) {
        bytes_3[i_6 + i_4] = -104;
      } else if (var_7 == 8482) {
        bytes_3[i_6 + i_4] = -103;
      } else if (var_7 == 353) {
        bytes_3[i_6 + i_4] = -102;
      } else if (var_7 == 8250) {
        bytes_3[i_6 + i_4] = -101;
      } else if (var_7 == 339) {
        bytes_3[i_6 + i_4] = -100;
      } else if (var_7 == 382) {
        bytes_3[i_6 + i_4] = -98;
      } else if (var_7 == 376) {
        bytes_3[i_6 + i_4] = -97;
      } else {
        bytes_3[i_6 + i_4] = 63;
      }
    }

    return i_5;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(IIIS)V",
      garbageValue = "-4430"
  )
  void method314(int i_1, int i_2, int i_3) {
    int i_5 = this.field191;
    int i_6 = this.field192;
    int i_7 = this.field187;
    class318 class318_4 = (class318) field188.method3997(class43.method716(i_5, i_6, i_7));
    if (class318_4 != null) {
      if (i_3 == this.field187 * 64) {
        class318_4.method5849(i_1, i_2);
      } else {
        class318_4.method5872(i_1, i_2, i_3, i_3);
      }

    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Lp;Ljava/util/List;I)V",
      garbageValue = "-463048404"
  )
  void method400(class10 class10_1, List list_2) {
    this.field199.clear();
    this.field197 = class10_1;
    this.method294(0, 0, 64, 64, this.field197);
    this.method289(list_2);
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;Ljava/util/List;B)V",
      garbageValue = "89"
  )
  void method287(HashSet hashset_1, List list_2) {
    this.field199.clear();
    Iterator iterator_3 = hashset_1.iterator();

    while (iterator_3.hasNext()) {
      class34 class34_4 = (class34) iterator_3.next();
      if (class34_4.method149() == this.field191 && class34_4.method168() == this.field192) {
        this.field195.add(class34_4);
        this.method294(class34_4.method565() * 8, class34_4.method563() * 8, 8, 8, class34_4);
      }
    }

    this.method289(list_2);
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(IIIILr;I)V",
      garbageValue = "-1457555663"
  )
  void method294(int i_1, int i_2, int i_3, int i_4, class16 class16_5) {
    for (int i_6 = i_1; i_6 < i_3 + i_1; i_6++) {
      label55:
      for (int i_7 = i_2; i_7 < i_2 + i_4; i_7++) {
        class226 class226_8 = new class226(0, i_6, i_7);

        for (int i_9 = 0; i_9 < class16_5.field121; i_9++) {
          class19[] arr_10 = class16_5.field126[i_9][i_6][i_7];
          if (arr_10 != null && arr_10.length != 0) {
            class19[] arr_11 = arr_10;

            for (int i_12 = 0; i_12 < arr_11.length; i_12++) {
              class19 class19_13 = arr_11[i_12];
              class255 class255_14 = this.method348(class19_13.field158);
              if (class255_14 != null) {
                class226 class226_15 = new class226(i_9, this.field191 * 64 + i_6,
                                                    this.field192 * 64 + i_7);
                class226 class226_16 = null;
                if (this.field197 != null) {
                  class226_16 = new class226(this.field197.field120 + i_9,
                                             i_6 + this.field197.field127 * 64,
                                             i_7 + this.field197.field117 * 64);
                } else {
                  class34 class34_17 = (class34) class16_5;
                  class226_16 = new class226(i_9 + class34_17.field120,
                                             i_6 + class34_17.field127 * 64
                                                 + class34_17.method584() * 8,
                                             class34_17.field117 * 64 + i_7
                                                 + class34_17.method564() * 8);
                }

                class28 class28_18 = new class28(class255_14.field3238, class226_16, class226_15,
                                                 this.method318(class255_14));
                this.field199.put(class226_8, class28_18);
                continue label55;
              }
            }
          }
        }
      }
    }

  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(Ljava/util/List;B)V",
      garbageValue = "-10"
  )
  void method289(List list_1) {
    Iterator iterator_2 = list_1.iterator();

    while (iterator_2.hasNext()) {
      class13 class13_3 = (class13) iterator_2.next();
      if (class13_3.field88.field2564 >> 6 == this.field191
          && class13_3.field88.field2565 >> 6 == this.field192) {
        class28 class28_4 = new class28(class13_3.field83, class13_3.field88, class13_3.field88,
                                        this.method306(class13_3.field83));
        this.field196.add(class28_4);
      }
    }

  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(ILai;[Lh;[Lly;I)V",
      garbageValue = "2109575831"
  )
  void method290(int i_1, class35 class35_2, class23[] arr_3, class317[] arr_4) {
    this.field187 = i_1;
    if (this.field197 != null || !this.field195.isEmpty()) {
      int i_6 = this.field191;
      int i_7 = this.field192;
      class318 class318_5 = (class318) field188.method3997(class43.method716(i_6, i_7, i_1));
      if (class318_5 == null) {
        class21 class21_8 = this.method297(this.field191, this.field192, arr_3);
        class318 class318_9 = new class318(this.field187 * 64, this.field187 * 64);
        class318_9.method5850();
        if (this.field197 != null) {
          this.method293(class35_2, arr_3, arr_4, class21_8);
        } else {
          this.method373(class35_2, arr_4, class21_8);
        }

        OutboundPacket.method3458(class318_9, this.field191, this.field192, this.field187);
      }
    }
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(IIILjava/util/HashSet;I)V",
      garbageValue = "1346650712"
  )
  void method382(int i_1, int i_2, int i_3, HashSet hashset_4) {
    if (hashset_4 == null) {
      hashset_4 = new HashSet();
    }

    this.method380(i_1, i_2, hashset_4, i_3);
    this.method337(i_1, i_2, hashset_4, i_3);
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;III)V",
      garbageValue = "476011751"
  )
  void method311(HashSet hashset_1, int i_2, int i_3) {
    Iterator iterator_4 = this.field199.values().iterator();

    while (iterator_4.hasNext()) {
      class28 class28_5 = (class28) iterator_4.next();
      if (hashset_1.contains(Integer.valueOf(class28_5.field240))) {
        class255 class255_6 = class255.field3246[class28_5.field240];
        this.method307(class255_6, class28_5.field235, class28_5.field245, i_2, i_3);
      }
    }

    this.method309(hashset_1, i_2, i_3);
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(Lai;[Lh;[Lly;Lj;I)V",
      garbageValue = "-488045984"
  )
  void method293(class35 class35_1, class23[] arr_2, class317[] arr_3, class21 class21_4) {
    int i_5;
    int i_6;
    for (i_5 = 0; i_5 < 64; i_5++) {
      for (i_6 = 0; i_6 < 64; i_6++) {
        this.method320(i_5, i_6, this.field197, class35_1, class21_4);
        this.method296(i_5, i_6, this.field197, class35_1);
      }
    }

    for (i_5 = 0; i_5 < 64; i_5++) {
      for (i_6 = 0; i_6 < 64; i_6++) {
        this.method295(i_5, i_6, this.field197, class35_1, arr_3);
      }
    }

  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "(Lai;[Lly;Lj;B)V",
      garbageValue = "-48"
  )
  void method373(class35 class35_1, class317[] arr_2, class21 class21_3) {
    Iterator iterator_4 = this.field195.iterator();

    class34 class34_5;
    int i_6;
    int i_7;
    while (iterator_4.hasNext()) {
      class34_5 = (class34) iterator_4.next();

      for (i_6 = class34_5.method565() * 8; i_6 < class34_5.method565() * 8 + 8; i_6++) {
        for (i_7 = class34_5.method563() * 8; i_7 < class34_5.method563() * 8 + 8; i_7++) {
          this.method320(i_6, i_7, class34_5, class35_1, class21_3);
          this.method296(i_6, i_7, class34_5, class35_1);
        }
      }
    }

    iterator_4 = this.field195.iterator();

    while (iterator_4.hasNext()) {
      class34_5 = (class34) iterator_4.next();

      for (i_6 = class34_5.method565() * 8; i_6 < class34_5.method565() * 8 + 8; i_6++) {
        for (i_7 = class34_5.method563() * 8; i_7 < class34_5.method563() * 8 + 8; i_7++) {
          this.method295(i_6, i_7, class34_5, class35_1, arr_2);
        }
      }
    }

  }

  @ObfuscatedName("m")
  @ObfuscatedSignature(
      signature = "(IILr;Lai;[Lly;I)V",
      garbageValue = "1267553766"
  )
  void method295(int i_1, int i_2, class16 class16_3, class35 class35_4, class317[] arr_5) {
    this.method304(i_1, i_2, class16_3);
    this.method406(i_1, i_2, class16_3, arr_5);
  }

  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "(IILr;Lai;Lj;I)V",
      garbageValue = "126232194"
  )
  void method320(int i_1, int i_2, class16 class16_3, class35 class35_4, class21 class21_5) {
    int i_6 = class16_3.field125[0][i_1][i_2] - 1;
    int i_7 = class16_3.field123[0][i_1][i_2] - 1;
    if (i_6 == -1 && i_7 == -1) {
      class314
          .method5763(this.field187 * i_1, this.field187 * (63 - i_2), this.field187, this.field187,
                      this.field194);
    }

    int i_8 = 16711935;
    if (i_7 != -1) {
      i_8 = class6.method69(i_7, this.field194);
    }

    if (i_7 > -1 && class16_3.field124[0][i_1][i_2] == 0) {
      class314
          .method5763(this.field187 * i_1, this.field187 * (63 - i_2), this.field187, this.field187,
                      i_8);
    } else {
      int i_9 = this.method302(i_1, i_2, class16_3, class21_5);
      if (i_7 == -1) {
        class314.method5763(this.field187 * i_1, this.field187 * (63 - i_2), this.field187,
                            this.field187, i_9);
      } else {
        class35_4
            .method606(this.field187 * i_1, this.field187 * (63 - i_2), i_9, i_8, this.field187,
                       this.field187, class16_3.field124[0][i_1][i_2],
                       class16_3.field116[0][i_1][i_2]);
      }
    }
  }

  @ObfuscatedName("t")
  @ObfuscatedSignature(
      signature = "(IILr;Lai;I)V",
      garbageValue = "1017441024"
  )
  void method296(int i_1, int i_2, class16 class16_3, class35 class35_4) {
    for (int i_5 = 1; i_5 < class16_3.field121; i_5++) {
      int i_6 = class16_3.field123[i_5][i_1][i_2] - 1;
      if (i_6 > -1) {
        int i_7 = class6.method69(i_6, this.field194);
        if (class16_3.field124[i_5][i_1][i_2] == 0) {
          class314.method5763(this.field187 * i_1, this.field187 * (63 - i_2), this.field187,
                              this.field187, i_7);
        } else {
          class35_4
              .method606(this.field187 * i_1, this.field187 * (63 - i_2), 0, i_7, this.field187,
                         this.field187, class16_3.field124[i_5][i_1][i_2],
                         class16_3.field116[i_5][i_1][i_2]);
        }
      }
    }

  }

  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "(II[Lh;I)Lj;",
      garbageValue = "-1376488982"
  )
  class21 method297(int i_1, int i_2, class23[] arr_3) {
    class21 class21_4 = (class21) field189.method3997(class43.method716(i_1, i_2, 0));
    class21 class21_5 = class21_4;
    if (class21_4 == null) {
      class21_5 = this.method298(arr_3);
      class12.method104(class21_5, i_1, i_2);
    }

    return class21_5;
  }

  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "([Lh;B)Lj;",
      garbageValue = "6"
  )
  class21 method298(class23[] arr_1) {
    class32 class32_2 = new class32(64, 64);
    if (this.field197 != null) {
      this.method300(0, 0, 64, 64, this.field197, class32_2);
    } else {
      Iterator iterator_3 = this.field195.iterator();

      while (iterator_3.hasNext()) {
        class34 class34_4 = (class34) iterator_3.next();
        this.method300(class34_4.method565() * 8, class34_4.method563() * 8, 8, 8, class34_4,
                       class32_2);
      }
    }

    this.method299(arr_1, class32_2);
    class21 class21_5 = new class21();
    class21_5.method265(class32_2);
    return class21_5;
  }

  @ObfuscatedName("a")
  @ObfuscatedSignature(
      signature = "([Lh;Lan;I)V",
      garbageValue = "1463076234"
  )
  void method299(class23[] arr_1, class32 class32_2) {
    class240[] arr_3 = class9.method85();
    class240[] arr_4 = arr_3;

    for (int i_5 = 0; i_5 < arr_4.length; i_5++) {
      class240 class240_6 = arr_4[i_5];
      if (arr_1[class240_6.vmethod5815()] != null) {
        byte b_7 = 0;
        byte b_8 = 0;
        byte b_9 = 64;
        byte b_10 = 64;
        byte b_11 = 0;
        byte b_12 = 0;
        switch (class240_6.field3104) {
          case 0:
            b_8 = 59;
            b_10 = 5;
            b_11 = 59;
            b_9 = 5;
            break;
          case 1:
            b_11 = 59;
            b_9 = 5;
            break;
          case 2:
            b_12 = 59;
            b_10 = 5;
            b_7 = 59;
            b_9 = 5;
            break;
          case 3:
            b_8 = 59;
            b_10 = 5;
            break;
          case 4:
            b_11 = 59;
            b_12 = 59;
            b_9 = 5;
            b_10 = 5;
            break;
          case 5:
            b_8 = 59;
            b_10 = 5;
            b_7 = 59;
            b_9 = 5;
            break;
          case 6:
            b_12 = 59;
            b_10 = 5;
            break;
          case 7:
            b_7 = 59;
            b_9 = 5;
        }

        this.method301(b_11, b_12, b_7, b_8, b_9, b_10, arr_1[class240_6.vmethod5815()], class32_2);
      }
    }

  }

  @ObfuscatedName("c")
  @ObfuscatedSignature(
      signature = "(IIIILr;Lan;I)V",
      garbageValue = "1938287225"
  )
  void method300(int i_1, int i_2, int i_3, int i_4, class16 class16_5, class32 class32_6) {
    for (int i_7 = i_1; i_7 < i_3 + i_1; i_7++) {
      for (int i_8 = i_2; i_8 < i_2 + i_4; i_8++) {
        int i_9 = class16_5.field125[0][i_7][i_8] - 1;
        if (i_9 != -1) {
          class259 class259_10 = class49.method953(i_9);
          class32_6.method541(i_7, i_8, 5, class259_10);
        }
      }
    }

  }

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "(IIIIIILh;Lan;I)V",
      garbageValue = "2106846136"
  )
  void method301(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, class23 class23_7,
                 class32 class32_8) {
    for (int i_9 = 0; i_9 < i_5; i_9++) {
      for (int i_10 = 0; i_10 < i_6; i_10++) {
        int i_11 = class23_7.method322(i_9 + i_1, i_10 + i_2);
        if (i_11 != -1) {
          class259 class259_12 = class49.method953(i_11);
          class32_8.method541(i_3 + i_9, i_10 + i_4, 5, class259_12);
        }
      }
    }

  }

  @ObfuscatedName("af")
  @ObfuscatedSignature(
      signature = "(IILr;Lj;I)I",
      garbageValue = "-2041354337"
  )
  int method302(int i_1, int i_2, class16 class16_3, class21 class21_4) {
    return class16_3.field125[0][i_1][i_2] == 0 ? this.field194 : class21_4.method272(i_1, i_2);
  }

  @ObfuscatedName("ah")
  @ObfuscatedSignature(
      signature = "(IILr;[Lly;I)V",
      garbageValue = "-1488997280"
  )
  void method406(int i_1, int i_2, class16 class16_3, class317[] arr_4) {
    for (int i_5 = 0; i_5 < class16_3.field121; i_5++) {
      class19[] arr_6 = class16_3.field126[i_5][i_1][i_2];
      if (arr_6 != null && arr_6.length != 0) {
        class19[] arr_7 = arr_6;

        for (int i_8 = 0; i_8 < arr_7.length; i_8++) {
          class19 class19_9 = arr_7[i_8];
          if (!class152.method3247(class19_9.field155)) {
            int i_11 = class19_9.field155;
            boolean bool_10 = i_11 == class233.field2776.field2777;
            if (!bool_10) {
              continue;
            }
          }

          class268 class268_12 = SeekableFile.method2527(class19_9.field158);
          if (class268_12.field3415 != -1) {
            if (class268_12.field3415 != 46 && class268_12.field3415 != 52) {
              arr_4[class268_12.field3415]
                  .method5825(this.field187 * i_1, this.field187 * (63 - i_2), this.field187 * 2,
                              this.field187 * 2);
            } else {
              arr_4[class268_12.field3415]
                  .method5825(this.field187 * i_1, this.field187 * (63 - i_2),
                              this.field187 * 2 + 1, this.field187 * 2 + 1);
            }
          }
        }
      }
    }

  }

  @ObfuscatedName("ab")
  @ObfuscatedSignature(
      signature = "(IILr;B)V",
      garbageValue = "-83"
  )
  void method304(int i_1, int i_2, class16 class16_3) {
    for (int i_4 = 0; i_4 < class16_3.field121; i_4++) {
      class19[] arr_5 = class16_3.field126[i_4][i_1][i_2];
      if (arr_5 != null && arr_5.length != 0) {
        class19[] arr_6 = arr_5;

        for (int i_7 = 0; i_7 < arr_6.length; i_7++) {
          class19 class19_8 = arr_6[i_7];
          if (class129.method3073(class19_8.field155)) {
            class268 class268_9 = SeekableFile.method2527(class19_8.field158);
            int i_10 = class268_9.field3388 != 0 ? -3407872 : -3355444;
            if (class19_8.field155 == class233.field2773.field2777) {
              this.method321(i_1, i_2, class19_8.field157, i_10);
            }

            if (class19_8.field155 == class233.field2755.field2777) {
              this.method321(i_1, i_2, class19_8.field157, -3355444);
              this.method321(i_1, i_2, class19_8.field157 + 1, i_10);
            }

            if (class19_8.field155 == class233.field2757.field2777) {
              if (class19_8.field157 == 0) {
                class314.method5736(this.field187 * i_1, this.field187 * (63 - i_2), 1, i_10);
              }

              if (class19_8.field157 == 1) {
                class314
                    .method5736(this.field187 * i_1 + this.field187 - 1, this.field187 * (63 - i_2),
                                1, i_10);
              }

              if (class19_8.field157 == 2) {
                class314.method5736(this.field187 * i_1 + this.field187 - 1,
                                    this.field187 * (63 - i_2) + this.field187 - 1, 1, i_10);
              }

              if (class19_8.field157 == 3) {
                class314
                    .method5736(this.field187 * i_1, this.field187 * (63 - i_2) + this.field187 - 1,
                                1, i_10);
              }
            }

            if (class19_8.field155 == class233.field2758.field2777) {
              int i_11 = class19_8.field157 % 2;
              int i_12;
              if (i_11 == 0) {
                for (i_12 = 0; i_12 < this.field187; i_12++) {
                  class314
                      .method5736(i_12 + this.field187 * i_1, (64 - i_2) * this.field187 - 1 - i_12,
                                  1, i_10);
                }
              } else {
                for (i_12 = 0; i_12 < this.field187; i_12++) {
                  class314
                      .method5736(i_12 + this.field187 * i_1, i_12 + this.field187 * (63 - i_2), 1,
                                  i_10);
                }
              }
            }
          }
        }
      }
    }

  }

  @ObfuscatedName("aw")
  @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "-22"
  )
  void method380(int i_1, int i_2, HashSet hashset_3, int i_4) {
    float f_5 = (float) i_4 / 64.0F;
    float f_6 = f_5 / 2.0F;
    Iterator iterator_7 = this.field199.entrySet().iterator();

    while (iterator_7.hasNext()) {
      Entry map$entry_8 = (Entry) iterator_7.next();
      class226 class226_9 = (class226) map$entry_8.getKey();
      int i_10 = (int) ((float) class226_9.field2564 * f_5 + (float) i_1 - f_6);
      int i_11 = (int) ((float) (i_2 + i_4) - (float) class226_9.field2565 * f_5 - f_6);
      class28 class28_12 = (class28) map$entry_8.getValue();
      if (class28_12 != null) {
        class28_12.field235 = i_10;
        class28_12.field245 = i_11;
        class255 class255_13 = class255.field3246[class28_12.field240];
        if (!hashset_3.contains(Integer.valueOf(class255_13.method4821()))) {
          this.method308(class28_12, i_10, i_11, f_5);
        }
      }
    }

  }

  @ObfuscatedName("ak")
  @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;III)V",
      garbageValue = "1896087870"
  )
  void method309(HashSet hashset_1, int i_2, int i_3) {
    Iterator iterator_4 = this.field196.iterator();

    while (iterator_4.hasNext()) {
      class28 class28_5 = (class28) iterator_4.next();
      class255 class255_6 = class255.field3246[class28_5.field240];
      if (class255_6 != null && hashset_1.contains(Integer.valueOf(class255_6.method4821()))) {
        this.method307(class255_6, class28_5.field235, class28_5.field245, i_2, i_3);
      }
    }

  }

  @ObfuscatedName("as")
  @ObfuscatedSignature(
      signature = "(Lie;IIIII)V",
      garbageValue = "112631536"
  )
  void method307(class255 class255_1, int i_2, int i_3, int i_4, int i_5) {
    class318 class318_6 = class255_1.method4815(false);
    if (class318_6 != null) {
      class318_6.method5851(i_2 - class318_6.field3787 / 2, i_3 - class318_6.field3788 / 2);
      if (i_4 % i_5 < i_5 / 2) {
        class314.method5784(i_2, i_3, 15, 16776960, 128);
        class314.method5784(i_2, i_3, 7, 16777215, 256);
      }

    }
  }

  @ObfuscatedName("an")
  @ObfuscatedSignature(
      signature = "(Lab;IIFI)V",
      garbageValue = "-1276060102"
  )
  void method308(class28 class28_1, int i_2, int i_3, float f_4) {
    class255 class255_5 = class255.field3246[class28_1.field240];
    this.method317(class255_5, i_2, i_3);
    this.method362(class28_1, class255_5, i_2, i_3, f_4);
  }

  @ObfuscatedName("ao")
  @ObfuscatedSignature(
      signature = "(Lie;III)V",
      garbageValue = "-1923264171"
  )
  void method317(class255 class255_1, int i_2, int i_3) {
    class318 class318_4 = class255_1.method4815(false);
    if (class318_4 != null) {
      int i_5 = this.method288(class318_4, class255_1.field3252);
      int i_6 = this.method284(class318_4, class255_1.field3253);
      class318_4.method5851(i_5 + i_2, i_3 + i_6);
    }

  }

  @ObfuscatedName("at")
  @ObfuscatedSignature(
      signature = "(Lab;Lie;IIFB)V",
      garbageValue = "1"
  )
  void method362(class28 class28_1, class255 class255_2, int i_3, int i_4, float f_5) {
    if (class28_1.field246 != null) {
      if (class28_1.field246.field181.method103(f_5)) {
        class298 class298_6 = (class298) this.field198.get(class28_1.field246.field181);
        class298_6
            .method5526(class28_1.field246.field186, i_3 - class28_1.field246.field184 / 2, i_4,
                        class28_1.field246.field184, class28_1.field246.field182,
                        ~0xffffff | class255_2.field3242, 0, 1, 0, class298_6.field3695 / 2);
      }
    }
  }

  @ObfuscatedName("ai")
  @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "-39"
  )
  void method337(int i_1, int i_2, HashSet hashset_3, int i_4) {
    float f_5 = (float) i_4 / 64.0F;
    Iterator iterator_6 = this.field196.iterator();

    while (iterator_6.hasNext()) {
      class28 class28_7 = (class28) iterator_6.next();
      int i_8 = class28_7.field236.field2564 % 64;
      int i_9 = class28_7.field236.field2565 % 64;
      class28_7.field235 = (int) ((float) i_1 + f_5 * (float) i_8);
      class28_7.field245 = (int) (f_5 * (float) (63 - i_9) + (float) i_2);
      if (!hashset_3.contains(Integer.valueOf(class28_7.field240))) {
        this.method308(class28_7, class28_7.field235, class28_7.field245, f_5);
      }
    }

  }

  @ObfuscatedName("ac")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "3"
  )
  void method340() {
    if (this.field197 != null) {
      for (int i_1 = 0; i_1 < 64; i_1++) {
        for (int i_2 = 0; i_2 < 64; i_2++) {
          this.method313(i_1, i_2, this.field197);
        }
      }
    } else {
      Iterator iterator_5 = this.field195.iterator();

      while (iterator_5.hasNext()) {
        class34 class34_6 = (class34) iterator_5.next();

        for (int i_3 = class34_6.method565() * 8; i_3 < class34_6.method565() * 8 + 8; i_3++) {
          for (int i_4 = class34_6.method563() * 8; i_4 < class34_6.method563() * 8 + 8; i_4++) {
            this.method313(i_3, i_4, class34_6);
          }
        }
      }
    }

  }

  @ObfuscatedName("ap")
  @ObfuscatedSignature(
      signature = "(IILr;I)V",
      garbageValue = "602031848"
  )
  void method313(int i_1, int i_2, class16 class16_3) {
    field193.method4436(0, i_1, i_2);

    for (int i_4 = 0; i_4 < class16_3.field121; i_4++) {
      class19[] arr_5 = class16_3.field126[i_4][i_1][i_2];
      if (arr_5 != null && arr_5.length != 0) {
        class19[] arr_6 = arr_5;

        for (int i_7 = 0; i_7 < arr_6.length; i_7++) {
          class19 class19_8 = arr_6[i_7];
          class255 class255_9 = this.method348(class19_8.field158);
          if (class255_9 != null) {
            class28 class28_10 = (class28) this.field199.get(field193);
            if (class28_10 != null) {
              if (class28_10.field240 != class255_9.field3238) {
                class28 class28_16 = new class28(class255_9.field3238, class28_10.field243,
                                                 class28_10.field236, this.method318(class255_9));
                this.field199.put(new class226(field193), class28_16);
                class28_10 = class28_16;
              }

              int i_15 = class28_10.field243.field2567 - class28_10.field236.field2567;
              class28_10.field236.field2567 = i_4;
              class28_10.field243.field2567 = i_15 + i_4;
              return;
            }

            class226 class226_11 = new class226(i_4, this.field191 * 64 + i_1,
                                                this.field192 * 64 + i_2);
            class226 class226_12 = null;
            if (this.field197 != null) {
              class226_12 = new class226(this.field197.field120 + i_4,
                                         this.field197.field127 * 64 + i_1,
                                         i_2 + this.field197.field117 * 64);
            } else {
              Iterator iterator_13 = this.field195.iterator();

              while (iterator_13.hasNext()) {
                class34 class34_14 = (class34) iterator_13.next();
                if (class34_14.method562(i_1, i_2)) {
                  class226_12 = new class226(i_4 + class34_14.field120,
                                             i_1 + class34_14.field127 * 64
                                                 + class34_14.method584() * 8,
                                             i_2 + class34_14.field117 * 64
                                                 + class34_14.method564() * 8);
                  break;
                }
              }
            }

            if (class226_12 != null) {
              class28_10 = new class28(class255_9.field3238, class226_12, class226_11,
                                       this.method318(class255_9));
              this.field199.put(new class226(field193), class28_10);
              return;
            }
          }
        }
      }
    }

    this.field199.remove(field193);
  }

  @ObfuscatedName("aa")
  @ObfuscatedSignature(
      signature = "(Lll;Ljd;I)I",
      garbageValue = "624399097"
  )
  int method288(class318 class318_1, class270 class270_2) {
    switch (class270_2.field3482) {
      case 0:
        return -class318_1.field3787 / 2;
      case 1:
        return 0;
      default:
        return -class318_1.field3787;
    }
  }

  @ObfuscatedName("ar")
  @ObfuscatedSignature(
      signature = "(Lll;Lis;I)I",
      garbageValue = "105388050"
  )
  int method284(class318 class318_1, class252 class252_2) {
    switch (class252_2.field3223) {
      case 1:
        return -class318_1.field3788 / 2;
      case 2:
        return 0;
      default:
        return -class318_1.field3788;
    }
  }

  @ObfuscatedName("au")
  @ObfuscatedSignature(
      signature = "(II)Lie;",
      garbageValue = "764273111"
  )
  class255 method348(int i_1) {
    class268 class268_2 = SeekableFile.method2527(i_1);
    if (class268_2.field3410 != null) {
      class268_2 = class268_2.method5056();
      if (class268_2 == null) {
        return null;
      }
    }

    return class268_2.field3397 != -1 ? class255.field3246[class268_2.field3397] : null;
  }

  @ObfuscatedName("av")
  @ObfuscatedSignature(
      signature = "(II)Ld;",
      garbageValue = "1836375512"
  )
  class22 method306(int i_1) {
    class255 class255_2 = class255.field3246[i_1];
    return this.method318(class255_2);
  }

  @ObfuscatedName("al")
  @ObfuscatedSignature(
      signature = "(Lie;I)Ld;",
      garbageValue = "1728647620"
  )
  class22 method318(class255 class255_1) {
    if (class255_1.field3241 != null && this.field198 != null
        && this.field198.get(class12.field70) != null) {
      class12 class12_2 = class12.method101(class255_1.field3243);
      if (class12_2 == null) {
        return null;
      } else {
        class298 class298_3 = (class298) this.field198.get(class12_2);
        if (class298_3 == null) {
          return null;
        } else {
          int i_4 = class298_3.method5520(class255_1.field3241, 1000000);
          String[] arr_5 = new String[i_4];
          class298_3.method5518(class255_1.field3241, (int[]) null, arr_5);
          int i_6 = arr_5.length * class298_3.field3695 / 2;
          int i_7 = 0;
          String[] arr_8 = arr_5;

          for (int i_9 = 0; i_9 < arr_8.length; i_9++) {
            String string_10 = arr_8[i_9];
            int i_11 = class298_3.method5517(string_10);
            if (i_11 > i_7) {
              i_7 = i_11;
            }
          }

          return new class22(class255_1.field3241, i_7, i_6, class12_2);
        }
      }
    } else {
      return null;
    }
  }

  @ObfuscatedName("ae")
  @ObfuscatedSignature(
      signature = "(IIIIII)Ljava/util/List;",
      garbageValue = "-1031458872"
  )
  List method319(int i_1, int i_2, int i_3, int i_4, int i_5) {
    LinkedList linkedlist_6 = new LinkedList();
    if (i_4 >= i_1 && i_5 >= i_2) {
      if (i_4 < i_3 + i_1 && i_5 < i_3 + i_2) {
        Iterator iterator_7 = this.field199.values().iterator();

        class28 class28_8;
        while (iterator_7.hasNext()) {
          class28_8 = (class28) iterator_7.next();
          if (class28_8.method464(i_4, i_5)) {
            linkedlist_6.add(class28_8);
          }
        }

        iterator_7 = this.field196.iterator();

        while (iterator_7.hasNext()) {
          class28_8 = (class28) iterator_7.next();
          if (class28_8.method464(i_4, i_5)) {
            linkedlist_6.add(class28_8);
          }
        }

        return linkedlist_6;
      } else {
        return linkedlist_6;
      }
    } else {
      return linkedlist_6;
    }
  }

  @ObfuscatedName("az")
  @ObfuscatedSignature(
      signature = "(B)Ljava/util/List;",
      garbageValue = "23"
  )
  List method356() {
    LinkedList linkedlist_1 = new LinkedList();
    linkedlist_1.addAll(this.field196);
    linkedlist_1.addAll(this.field199.values());
    return linkedlist_1;
  }

  @ObfuscatedName("aq")
  @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-60"
  )
  void method321(int i_1, int i_2, int i_3, int i_4) {
    i_3 %= 4;
    if (i_3 == 0) {
      class314.method5738(this.field187 * i_1, this.field187 * (63 - i_2), this.field187, i_4);
    }

    if (i_3 == 1) {
      class314.method5736(this.field187 * i_1, this.field187 * (63 - i_2), this.field187, i_4);
    }

    if (i_3 == 2) {
      class314.method5738(this.field187 * i_1 + this.field187 - 1, this.field187 * (63 - i_2),
                          this.field187, i_4);
    }

    if (i_3 == 3) {
      class314.method5736(this.field187 * i_1, this.field187 * (63 - i_2) + this.field187 - 1,
                          this.field187, i_4);
    }

  }

  @ObfuscatedName("ad")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1433133625"
  )
  int method322(int i_1, int i_2) {
    if (this.field197 != null) {
      return this.field197.method153(i_1, i_2);
    } else {
      if (!this.field195.isEmpty()) {
        Iterator iterator_3 = this.field195.iterator();

        while (iterator_3.hasNext()) {
          class34 class34_4 = (class34) iterator_3.next();
          if (class34_4.method562(i_1, i_2)) {
            return class34_4.method153(i_1, i_2);
          }
        }
      }

      return -1;
    }
  }

}
