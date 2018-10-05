package rs.darkscape.client;

import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class20 {

  @ObfuscatedName("t")
  @ObfuscatedGetter(
      intValue = 589485321
  )
  static int field172;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -569300431
  )
  int field170 = -1;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 332294683
  )
  int field163 = -1;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -851588879
  )
  int field164 = -1;
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "Lha;"
  )
  class226 field165 = null;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -1049310257
  )
  int field166 = Integer.MAX_VALUE;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 1487084263
  )
  int field167 = 0;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = -1973252047
  )
  int field168 = Integer.MAX_VALUE;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -1303313193
  )
  int field162 = 0;
  @ObfuscatedName("p")
  boolean field173 = false;
  @ObfuscatedName("w")
  String field161;
  @ObfuscatedName("s")
  String field171;
  @ObfuscatedName("b")
  LinkedList field160;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)[Liz;",
      garbageValue = "-4"
  )
  public static class242[] method216() {
    return new class242[]{class242.field3125, class242.field3118, class242.field3121,
        class242.field3120, class242.field3122, class242.field3119};
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)J",
      garbageValue = "-1525705371"
  )
  public static long method262(int i_0) {
    return class120.field1647[i_0];
  }

  @ObfuscatedName("gd")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2118827798"
  )
  static boolean method260() {
    return (client.field658 & 0x4) != 0;
  }

  @ObfuscatedName("jt")
  @ObfuscatedSignature(
      signature = "(Lbj;ZI)V",
      garbageValue = "1846472560"
  )
  static final void method261(class55 class55_0, boolean bool_1) {
    int i_2 = class55_0.field501;
    int i_3 = (int) class55_0.hashKey;
    class55_0.unlinkNode();
    if (bool_1) {
      class66.method1622(i_2);
    }

    class130.method3077(i_2);
    class230 class230_4 = class26.method434(i_3);
    if (class230_4 != null) {
      class60.method1114(class230_4);
    }

    class170.method3448();
    if (client.field683 != -1) {
      int i_5 = client.field683;
      if (class261.method4931(i_5)) {
        class83.method1923(class42.field366[i_5], 1);
      }
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "1965636190"
  )
  public void method200(Buffer class182_1, int i_2) {
    this.field170 = i_2;
    this.field161 = class182_1.method3738();
    this.field171 = class182_1.method3738();
    this.field165 = new class226(class182_1.getInt32());
    this.field163 = class182_1.getInt32();
    class182_1.getUInt8();
    this.field173 = class182_1.getUInt8() == 1;
    this.field164 = class182_1.getUInt8();
    int i_3 = class182_1.getUInt8();
    this.field160 = new LinkedList();

    for (int i_4 = 0; i_4 < i_3; i_4++) {
      this.field160.add(this.method201(class182_1));
    }

    this.method206();
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;I)Las;",
      garbageValue = "2074726298"
  )
  class31 method201(Buffer class182_1) {
    int i_2 = class182_1.getUInt8();
    class15 class15_3 = (class15) class76.method1803(class15.method145(), i_2);
    Object obj_4 = null;
    switch (class15_3.field110) {
      case 0:
        obj_4 = new class14();
        break;
      case 1:
        obj_4 = new class37();
        break;
      case 2:
        obj_4 = new class18();
        break;
      case 3:
        obj_4 = new class27();
        break;
      default:
        throw new IllegalStateException("");
    }

    ((class31) obj_4).vmethod639(class182_1);
    return (class31) obj_4;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IIIB)Z",
      garbageValue = "8"
  )
  public boolean method202(int i_1, int i_2, int i_3) {
    Iterator iterator_4 = this.field160.iterator();

    class31 class31_5;
    do {
      if (!iterator_4.hasNext()) {
        return false;
      }

      class31_5 = (class31) iterator_4.next();
    } while (!class31_5.vmethod636(i_1, i_2, i_3));

    return true;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1006376583"
  )
  public boolean method203(int i_1, int i_2) {
    int i_3 = i_1 / 64;
    int i_4 = i_2 / 64;
    if (i_3 >= this.field166 && i_3 <= this.field167) {
      if (i_4 >= this.field168 && i_4 <= this.field162) {
        Iterator iterator_5 = this.field160.iterator();

        class31 class31_6;
        do {
          if (!iterator_5.hasNext()) {
            return false;
          }

          class31_6 = (class31) iterator_5.next();
        } while (!class31_6.vmethod637(i_1, i_2));

        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "-19"
  )
  public int[] method213(int i_1, int i_2, int i_3) {
    Iterator iterator_4 = this.field160.iterator();

    class31 class31_5;
    do {
      if (!iterator_4.hasNext()) {
        return null;
      }

      class31_5 = (class31) iterator_4.next();
    } while (!class31_5.vmethod636(i_1, i_2, i_3));

    return class31_5.vmethod638(i_1, i_2, i_3);
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(III)Lha;",
      garbageValue = "-2056689977"
  )
  public class226 method205(int i_1, int i_2) {
    Iterator iterator_3 = this.field160.iterator();

    class31 class31_4;
    do {
      if (!iterator_3.hasNext()) {
        return null;
      }

      class31_4 = (class31) iterator_3.next();
    } while (!class31_4.vmethod637(i_1, i_2));

    return class31_4.vmethod659(i_1, i_2);
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1897199586"
  )
  void method206() {
    Iterator iterator_1 = this.field160.iterator();

    while (iterator_1.hasNext()) {
      class31 class31_2 = (class31) iterator_1.next();
      class31_2.vmethod635(this);
    }

  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-31"
  )
  public int method207() {
    return this.field170;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-8"
  )
  public boolean method208() {
    return this.field173;
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "210931606"
  )
  public String method209() {
    return this.field161;
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1948906738"
  )
  public String method210() {
    return this.field171;
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "118"
  )
  int method211() {
    return this.field163;
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "57"
  )
  public int method212() {
    return this.field164;
  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-162318051"
  )
  public int method258() {
    return this.field166;
  }

  @ObfuscatedName("m")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2125416250"
  )
  public int method214() {
    return this.field167;
  }

  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "308300610"
  )
  public int method247() {
    return this.field168;
  }

  @ObfuscatedName("t")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "255269420"
  )
  public int method249() {
    return this.field162;
  }

  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1363563177"
  )
  public int method217() {
    return this.field165.field2564;
  }

  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "825438900"
  )
  public int method218() {
    return this.field165.field2567;
  }

  @ObfuscatedName("a")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-108"
  )
  public int method219() {
    return this.field165.field2565;
  }

  @ObfuscatedName("c")
  @ObfuscatedSignature(
      signature = "(I)Lha;",
      garbageValue = "-1421911827"
  )
  public class226 method256() {
    return new class226(this.field165);
  }

}
