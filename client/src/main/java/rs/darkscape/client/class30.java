package rs.darkscape.client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public final class class30 {

  @ObfuscatedName("x")
  final java.util.HashMap field271;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = 984068981
  )
  public int field276 = 0;
  @ObfuscatedName("z")
  boolean field272 = false;
  @ObfuscatedName("w")
  boolean field264 = false;
  @ObfuscatedName("k")
  java.util.HashMap field269 = new java.util.HashMap();
  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "[Lly;"
  )
  class317[] field279;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Lao;"
  )
  class33 field265;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 1298084395
  )
  int field273;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = -1151941721
  )
  int field278;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -572130391
  )
  int field274;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = -1931488771
  )
  int field270;
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "[[Lh;"
  )
  class23[][] field268;
  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lll;"
  )
  class318 field266;
  @ObfuscatedName("u")
  java.util.HashMap field267;

  @ObfuscatedSignature(
      signature = "([Lly;Ljava/util/HashMap;)V"
  )
  public class30(class317[] arr_1, java.util.HashMap hashmap_2) {
    this.field279 = arr_1;
    this.field271 = hashmap_2;
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1780304289"
  )
  static final int method519(int i_0, int i_1) {
    if (i_0 == -2) {
      return 12345678;
    } else if (i_0 == -1) {
      if (i_1 < 2) {
        i_1 = 2;
      } else if (i_1 > 126) {
        i_1 = 126;
      }

      return i_1;
    } else {
      i_1 = (i_0 & 0x7f) * i_1 / 128;
      if (i_1 < 2) {
        i_1 = 2;
      } else if (i_1 > 126) {
        i_1 = 126;
      }

      return (i_0 & 0xff80) + i_1;
    }
  }

  @ObfuscatedName("fu")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-28"
  )
  static void method484() {
    client.field626.method1978();
    client.field626.field1219.offset = 0;
    client.field626.field1220 = null;
    client.field626.field1215 = null;
    client.field626.field1226 = null;
    client.field626.field1227 = null;
    client.field626.field1225 = 0;
    client.field626.field1228 = 0;
    client.field598 = 0;
    client.field771 = 0;
    client.field716 = false;
    client.field810 = 0;
    client.field808 = 0;

    int i_0;
    for (i_0 = 0; i_0 < 2048; i_0++) {
      client.field610[i_0] = null;
    }

    class138.field1876 = null;

    for (i_0 = 0; i_0 < client.field843.length; i_0++) {
      class72 class72_1 = client.field843[i_0];
      if (class72_1 != null) {
        class72_1.field897 = -1;
        class72_1.field898 = false;
      }
    }

    class53.field474 = new HashMap(32);
    Mouse.method947(30);

    for (i_0 = 0; i_0 < 100; i_0++) {
      client.field697[i_0] = true;
    }

    OutboundPacket class172_3 = OutboundPacket
        .createOutboundPacket(OutboundPacketDescriptor.field2215, client.field626.field1218);
    PacketBuffer class189_4 = class172_3.buffer;
    int i_2 = client.field792 ? 2 : 1;
    class189_4.putInt8(i_2);
    class172_3.buffer.method3755(class82.field1179);
    class172_3.buffer.method3755(class243.field3138);
    client.field626.method1980(class172_3);
  }

  @ObfuscatedName("fk")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-248203091"
  )
  static final void method516() {
    if (client.field627 > 0) {
      class97.method2213();
    } else {
      client.field804.method5262();
      Mouse.method947(40);
      class62.field869 = client.field626.method1983();
      client.field626.method1984();
    }
  }

  @ObfuscatedName("ho")
  @ObfuscatedSignature(
      signature = "(ZLgi;I)V",
      garbageValue = "993240466"
  )
  static final void method500(boolean bool_0, PacketBuffer class189_1) {
    while (true) {
      if (class189_1.method3825(client.field626.field1225) >= 27) {
        int i_2 = class189_1.method3817(15);
        if (i_2 != 32767) {
          boolean bool_3 = false;
          if (client.field843[i_2] == null) {
            client.field843[i_2] = new class72();
            bool_3 = true;
          }

          class72 class72_4 = client.field843[i_2];
          client.field639[++client.field622 - 1] = i_2;
          class72_4.field914 = client.field591;
          int i_5;
          if (bool_0) {
            i_5 = class189_1.method3817(8);
            if (i_5 > 127) {
              i_5 -= 256;
            }
          } else {
            i_5 = class189_1.method3817(5);
            if (i_5 > 15) {
              i_5 -= 32;
            }
          }

          int i_6 = client.field706[class189_1.method3817(3)];
          if (bool_3) {
            class72_4.field926 = class72_4.field905 = i_6;
          }

          int i_7 = class189_1.method3817(1);
          int i_8;
          if (bool_0) {
            i_8 = class189_1.method3817(8);
            if (i_8 > 127) {
              i_8 -= 256;
            }
          } else {
            i_8 = class189_1.method3817(5);
            if (i_8 > 15) {
              i_8 -= 32;
            }
          }

          class72_4.field1037 = class270.method5157(class189_1.method3817(14));
          int i_9 = class189_1.method3817(1);
          if (i_9 == 1) {
            client.field666[++client.field624 - 1] = i_2;
          }

          class72_4.field874 = class72_4.field1037.field3497;
          class72_4.field924 = class72_4.field1037.field3500;
          if (class72_4.field924 == 0) {
            class72_4.field905 = 0;
          }

          class72_4.field899 = class72_4.field1037.field3498;
          class72_4.field880 = class72_4.field1037.field3495;
          class72_4.field870 = class72_4.field1037.field3502;
          class72_4.field882 = class72_4.field1037.field3501;
          class72_4.field893 = class72_4.field1037.field3519;
          class72_4.field877 = class72_4.field1037.field3496;
          class72_4.field878 = class72_4.field1037.field3486;
          class72_4.method1788(class138.field1876.field922[0] + i_5,
                               class138.field1876.field872[0] + i_8, i_7 == 1);
          continue;
        }
      }

      class189_1.method3816();
      return;
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;ZB)V",
      garbageValue = "2"
  )
  public void method490(AbstractPack class247_1, String string_2, boolean bool_3) {
    if (!this.field264) {
      this.field272 = false;
      this.field264 = true;
      System.nanoTime();
      int i_4 = class247_1.method4642(class29.field252.field255);
      int i_5 = class247_1.method4643(i_4, string_2);
      Buffer class182_6 = new Buffer(class247_1.method4684(class29.field252.field255, string_2));
      Buffer class182_7 = new Buffer(class247_1.method4684(class29.field251.field255, string_2));
      Buffer class182_8 = new Buffer(class247_1.method4684(string_2, class29.field262.field255));
      System.nanoTime();
      System.nanoTime();
      this.field265 = new class33();

      try {
        this.field265.method550(class182_6, class182_8, class182_7, i_5, bool_3);
      } catch (IllegalStateException illegalstateexception_20) {
        return;
      }

      this.field265.method217();
      this.field265.method218();
      this.field265.method219();
      this.field273 = this.field265.method258() * 64;
      this.field278 = this.field265.method247() * 64;
      this.field274 = (this.field265.method214() - this.field265.method258() + 1) * 64;
      this.field270 = (this.field265.method249() - this.field265.method247() + 1) * 64;
      int i_17 = this.field265.method214() - this.field265.method258() + 1;
      int i_10 = this.field265.method249() - this.field265.method247() + 1;
      System.nanoTime();
      System.nanoTime();
      class23.field188.method4006();
      class23.field189.method4006();
      this.field268 = new class23[i_17][i_10];
      Iterator iterator_11 = this.field265.field292.iterator();

      while (iterator_11.hasNext()) {
        class10 class10_12 = (class10) iterator_11.next();
        int i_13 = class10_12.field127;
        int i_14 = class10_12.field117;
        int i_15 = i_13 - this.field265.method258();
        int i_16 = i_14 - this.field265.method247();
        this.field268[i_15][i_16] = new class23(i_13, i_14, this.field265.method211(),
                                                this.field271);
        this.field268[i_15][i_16].method400(class10_12, this.field265.field290);
      }

      for (int i_18 = 0; i_18 < i_17; i_18++) {
        for (int i_19 = 0; i_19 < i_10; i_19++) {
          if (this.field268[i_18][i_19] == null) {
            this.field268[i_18][i_19] = new class23(this.field265.method258() + i_18,
                                                    this.field265.method247() + i_19,
                                                    this.field265.method211(), this.field271);
            this.field268[i_18][i_19].method287(this.field265.field291, this.field265.field290);
          }
        }
      }

      System.nanoTime();
      System.nanoTime();
      if (class247_1.method4644(class29.field257.field255, string_2)) {
        byte[] bytes_21 = class247_1.method4684(class29.field257.field255, string_2);
        this.field266 = class284.method5324(bytes_21);
      }

      System.nanoTime();
      class247_1.method4702();
      class247_1.method4640();
      this.field272 = true;
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-109"
  )
  public final void method482() {
    this.field267 = null;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IIIIIIIIB)V",
      garbageValue = "-102"
  )
  public final void method483(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7,
                              int i_8) {
    int[] ints_9 = class314.field3766;
    int i_10 = class314.field3761;
    int i_11 = class314.field3762;
    int[] ints_12 = new int[4];
    class314.method5722(ints_12);
    class17 class17_13 = this.method518(i_1, i_2, i_3, i_4);
    float f_14 = this.method492(i_7 - i_5, i_3 - i_1);
    int i_15 = (int) Math.ceil((double) f_14);
    this.field276 = i_15;
    if (!this.field269.containsKey(Integer.valueOf(i_15))) {
      class35 class35_16 = new class35(i_15);
      class35_16.method592();
      this.field269.put(Integer.valueOf(i_15), class35_16);
    }

    class23[] arr_22 = new class23[8];

    int i_17;
    int i_18;
    for (i_17 = class17_13.field132; i_17 < class17_13.field132 + class17_13.field131; i_17++) {
      for (i_18 = class17_13.field134; i_18 < class17_13.field134 + class17_13.field133; i_18++) {
        this.method485(i_17, i_18, arr_22);
        this.field268[i_17][i_18]
            .method290(i_15, (class35) this.field269.get(Integer.valueOf(i_15)), arr_22,
                       this.field279);
      }
    }

    class314.method5718(ints_9, i_10, i_11);
    class314.method5723(ints_12);
    i_17 = (int) (64.0F * f_14);
    i_18 = this.field273 + i_1;
    int i_19 = i_2 + this.field278;

    for (int i_20 = class17_13.field132; i_20 < class17_13.field131 + class17_13.field132; i_20++) {
      for (int i_21 = class17_13.field134; i_21 < class17_13.field133 + class17_13.field134;
          i_21++) {
        this.field268[i_20][i_21]
            .method314(i_5 + i_17 * (this.field268[i_20][i_21].field191 * 64 - i_18) / 64,
                       i_8 - i_17 * (this.field268[i_20][i_21].field192 * 64 - i_19 + 64) / 64,
                       i_17);
      }
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
      garbageValue = "-1738532416"
  )
  public final void method491(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7,
                              int i_8, HashSet hashset_9, HashSet hashset_10, int i_11, int i_12,
                              boolean bool_13) {
    class17 class17_14 = this.method518(i_1, i_2, i_3, i_4);
    float f_15 = this.method492(i_7 - i_5, i_3 - i_1);
    int i_16 = (int) (f_15 * 64.0F);
    int i_17 = this.field273 + i_1;
    int i_18 = i_2 + this.field278;

    int i_19;
    int i_20;
    for (i_19 = class17_14.field132; i_19 < class17_14.field132 + class17_14.field131; i_19++) {
      for (i_20 = class17_14.field134; i_20 < class17_14.field134 + class17_14.field133; i_20++) {
        if (bool_13) {
          this.field268[i_19][i_20].method340();
        }

        this.field268[i_19][i_20]
            .method382(i_5 + i_16 * (this.field268[i_19][i_20].field191 * 64 - i_17) / 64,
                       i_8 - i_16 * (this.field268[i_19][i_20].field192 * 64 - i_18 + 64) / 64,
                       i_16, hashset_9);
      }
    }

    if (hashset_10 != null && i_11 > 0) {
      for (i_19 = class17_14.field132; i_19 < class17_14.field132 + class17_14.field131; i_19++) {
        for (i_20 = class17_14.field134; i_20 < class17_14.field133 + class17_14.field134; i_20++) {
          this.field268[i_19][i_20].method311(hashset_10, i_11, i_12);
        }
      }
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(II[Lh;I)V",
      garbageValue = "1440038510"
  )
  void method485(int i_1, int i_2, class23[] arr_3) {
    boolean bool_4 = i_1 <= 0;
    boolean bool_5 = i_1 >= this.field268.length - 1;
    boolean bool_6 = i_2 <= 0;
    boolean bool_7 = i_2 >= this.field268[0].length - 1;
    if (bool_7) {
      arr_3[class240.field3101.vmethod5815()] = null;
    } else {
      arr_3[class240.field3101.vmethod5815()] = this.field268[i_1][i_2 + 1];
    }

    arr_3[class240.field3107.vmethod5815()] =
        !bool_7 && !bool_5 ? this.field268[i_1 + 1][i_2 + 1] : null;
    arr_3[class240.field3103.vmethod5815()] =
        !bool_7 && !bool_4 ? this.field268[i_1 - 1][i_2 + 1] : null;
    arr_3[class240.field3097.vmethod5815()] = bool_5 ? null : this.field268[i_1 + 1][i_2];
    arr_3[class240.field3102.vmethod5815()] = bool_4 ? null : this.field268[i_1 - 1][i_2];
    arr_3[class240.field3100.vmethod5815()] = bool_6 ? null : this.field268[i_1][i_2 - 1];
    arr_3[class240.field3099.vmethod5815()] =
        !bool_6 && !bool_5 ? this.field268[i_1 + 1][i_2 - 1] : null;
    arr_3[class240.field3098.vmethod5815()] =
        !bool_6 && !bool_4 ? this.field268[i_1 - 1][i_2 - 1] : null;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(IIIILjava/util/HashSet;III)V",
      garbageValue = "2097379080"
  )
  public void method486(int i_1, int i_2, int i_3, int i_4, HashSet hashset_5, int i_6, int i_7) {
    if (this.field266 != null) {
      this.field266.method5853(i_1, i_2, i_3, i_4);
      if (i_6 > 0 && i_6 % i_7 < i_7 / 2) {
        if (this.field267 == null) {
          this.method505();
        }

        Iterator iterator_8 = hashset_5.iterator();

        while (true) {
          List list_10;
          do {
            if (!iterator_8.hasNext()) {
              return;
            }

            int i_9 = ((Integer) iterator_8.next()).intValue();
            list_10 = (List) this.field267.get(Integer.valueOf(i_9));
          } while (list_10 == null);

          Iterator iterator_11 = list_10.iterator();

          while (iterator_11.hasNext()) {
            class28 class28_12 = (class28) iterator_11.next();
            int i_13 = i_3 * (class28_12.field236.field2564 - this.field273) / this.field274;
            int i_14 = i_4 - (class28_12.field236.field2565 - this.field278) * i_4 / this.field270;
            class314.method5784(i_13 + i_1, i_14 + i_2, 2, 16776960, 256);
          }
        }
      }
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(IIIIIIIIIII)Ljava/util/List;",
      garbageValue = "-1764374656"
  )
  public List method487(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8,
                        int i_9, int i_10) {
    LinkedList linkedlist_11 = new LinkedList();
    if (!this.field272) {
      return linkedlist_11;
    } else {
      class17 class17_12 = this.method518(i_1, i_2, i_3, i_4);
      float f_13 = this.method492(i_7, i_3 - i_1);
      int i_14 = (int) (64.0F * f_13);
      int i_15 = this.field273 + i_1;
      int i_16 = i_2 + this.field278;

      for (int i_17 = class17_12.field132; i_17 < class17_12.field132 + class17_12.field131;
          i_17++) {
        for (int i_18 = class17_12.field134; i_18 < class17_12.field134 + class17_12.field133;
            i_18++) {
          List list_19 = this.field268[i_17][i_18]
              .method319(i_5 + i_14 * (this.field268[i_17][i_18].field191 * 64 - i_15) / 64,
                         i_8 + i_6
                             - i_14 * (this.field268[i_17][i_18].field192 * 64 - i_16 + 64) / 64,
                         i_14, i_9, i_10);
          if (!list_19.isEmpty()) {
            linkedlist_11.addAll(list_19);
          }
        }
      }

      return linkedlist_11;
    }
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(IIIIS)Lt;",
      garbageValue = "1596"
  )
  class17 method518(int i_1, int i_2, int i_3, int i_4) {
    class17 class17_5 = new class17(this);
    int i_6 = this.field273 + i_1;
    int i_7 = i_2 + this.field278;
    int i_8 = i_3 + this.field273;
    int i_9 = i_4 + this.field278;
    int i_10 = i_6 / 64;
    int i_11 = i_7 / 64;
    int i_12 = i_8 / 64;
    int i_13 = i_9 / 64;
    class17_5.field131 = i_12 - i_10 + 1;
    class17_5.field133 = i_13 - i_11 + 1;
    class17_5.field132 = i_10 - this.field265.method258();
    class17_5.field134 = i_11 - this.field265.method247();
    if (class17_5.field132 < 0) {
      class17_5.field131 += class17_5.field132;
      class17_5.field132 = 0;
    }

    if (class17_5.field132 > this.field268.length - class17_5.field131) {
      class17_5.field131 = this.field268.length - class17_5.field132;
    }

    if (class17_5.field134 < 0) {
      class17_5.field133 += class17_5.field134;
      class17_5.field134 = 0;
    }

    if (class17_5.field134 > this.field268[0].length - class17_5.field133) {
      class17_5.field133 = this.field268[0].length - class17_5.field134;
    }

    class17_5.field131 = Math.min(class17_5.field131, this.field268.length);
    class17_5.field133 = Math.min(class17_5.field133, this.field268[0].length);
    return class17_5;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2090974664"
  )
  public boolean method513() {
    return this.field272;
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(B)Ljava/util/HashMap;",
      garbageValue = "-63"
  )
  public java.util.HashMap method489() {
    this.method505();
    return this.field267;
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "21"
  )
  void method505() {
    if (this.field267 == null) {
      this.field267 = new java.util.HashMap();
    }

    this.field267.clear();

    for (int i_1 = 0; i_1 < this.field268.length; i_1++) {
      for (int i_2 = 0; i_2 < this.field268[i_1].length; i_2++) {
        List list_3 = this.field268[i_1][i_2].method356();
        Iterator iterator_4 = list_3.iterator();

        while (iterator_4.hasNext()) {
          class28 class28_5 = (class28) iterator_4.next();
          if (!this.field267.containsKey(Integer.valueOf(class28_5.field240))) {
            LinkedList linkedlist_6 = new LinkedList();
            linkedlist_6.add(class28_5);
            this.field267.put(Integer.valueOf(class28_5.field240), linkedlist_6);
          } else {
            List list_7 = (List) this.field267.get(Integer.valueOf(class28_5.field240));
            list_7.add(class28_5);
          }
        }
      }
    }

  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(III)F",
      garbageValue = "-168004314"
  )
  float method492(int i_1, int i_2) {
    float f_3 = (float) i_1 / (float) i_2;
    if (f_3 > 8.0F) {
      return 8.0F;
    } else if (f_3 < 1.0F) {
      return 1.0F;
    } else {
      int i_4 = Math.round(f_3);
      return Math.abs((float) i_4 - f_3) < 0.05F ? (float) i_4 : f_3;
    }
  }

}
