package rs.darkscape.client;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.sign.SignLink;

@ObfuscatedName("bg")
public class class61 implements Comparator {

  @ObfuscatedName("po")
  @ObfuscatedSignature(
      signature = "Lcu;"
  )
  static class102 field577;
  @ObfuscatedName("dz")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field576;
  @ObfuscatedName("z")
  boolean field575;

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IB)Lbh;",
      garbageValue = "44"
  )
  static class58 method1130(int i_0) {
    return (class58) class83.field1181.method3945((long) i_0);
  }

  @ObfuscatedName("m")
  @ObfuscatedSignature(
      signature = "(Lbb;B)V",
      garbageValue = "95"
  )
  static void method1129(class65 class65_0) {
    if (class65_0.method1589() != client.field668) {
      client.field668 = class65_0.method1589();
      boolean bool_1 = class65_0.method1589();
      if (bool_1 != class269.field3426) {
        class57.method1036();
        class269.field3426 = bool_1;
      }
    }

    class54.field485 = class65_0.field950;
    client.field581 = class65_0.field947;
    client.field632 = class65_0.field948;
    class26.field223 = client.field777 == 0 ? 43594 : class65_0.field947 + 40000;
    class68.field996 = client.field777 == 0 ? 443 : class65_0.field947 + 50000;
    class290.field3636 = class26.field223;
  }

  @ObfuscatedName("m")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-173135414"
  )
  static int method1126(int i_0, class84 class84_1, boolean bool_2) {
    class230 class230_3 = class26.method434(class69.field999[--class69.field1003]);
    if (i_0 == 2800) {
      class69.field999[++class69.field1003 - 1] = SignLink
          .method3252(class24.method425(class230_3));
      return 1;
    } else if (i_0 != 2801) {
      if (i_0 == 2802) {
        if (class230_3.field2679 == null) {
          class69.field1001[++class55.field497 - 1] = "";
        } else {
          class69.field1001[++class55.field497 - 1] = class230_3.field2679;
        }

        return 1;
      } else {
        return 2;
      }
    } else {
      int i_4 = class69.field999[--class69.field1003];
      --i_4;
      if (class230_3.field2680 != null && i_4 < class230_3.field2680.length
          && class230_3.field2680[i_4] != null) {
        class69.field1001[++class55.field497 - 1] = class230_3.field2680[i_4];
      } else {
        class69.field1001[++class55.field497 - 1] = "";
      }

      return 1;
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ls;Ls;B)I",
      garbageValue = "-86"
  )
  int method1123(class2 class2_1, class2 class2_2) {
    if (class2_2.field19 == class2_1.field19) {
      return 0;
    } else {
      if (this.field575) {
        if (client.field581 == class2_1.field19) {
          return -1;
        }

        if (class2_2.field19 == client.field581) {
          return 1;
        }
      }

      return class2_1.field19 < class2_2.field19 ? -1 : 1;
    }
  }

  public int compare(Object object_1, Object object_2) {
    return this.method1123((class2) object_1, (class2) object_2);
  }

  public boolean equals(Object object_1) {
    return super.equals(object_1);
  }

}
