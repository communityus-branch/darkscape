package rs.darkscape.client;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class66 {

  @ObfuscatedName("bk")
  @ObfuscatedGetter(
      intValue = 1850992515
  )
  static int field966;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -344414119
  )
  static int field964 = 6;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -514581919
  )
  int field957 = 1;
  @ObfuscatedName("q")
  String field959 = null;
  @ObfuscatedName("k")
  boolean field962 = false;
  @ObfuscatedName("i")
  LinkedHashMap field963 = new LinkedHashMap();
  @ObfuscatedName("s")
  boolean field960;
  @ObfuscatedName("l")
  boolean field958;

  class66() {
    this.method1613(true);
  }

  @ObfuscatedSignature(
      signature = "(Lgk;)V"
  )
  class66(Buffer class182_1) {
    if (class182_1 != null && class182_1.bytes != null) {
      int i_2 = class182_1.getUInt8();
      if (i_2 >= 0 && i_2 <= field964) {
        if (class182_1.getUInt8() == 1) {
          this.field960 = true;
        }

        if (i_2 > 1) {
          this.field958 = class182_1.getUInt8() == 1;
        }

        if (i_2 > 3) {
          this.field957 = class182_1.getUInt8();
        }

        if (i_2 > 2) {
          int i_3 = class182_1.getUInt8();

          for (int i_4 = 0; i_4 < i_3; i_4++) {
            int i_5 = class182_1.getInt32();
            int i_6 = class182_1.getInt32();
            this.field963.put(Integer.valueOf(i_5), Integer.valueOf(i_6));
          }
        }

        if (i_2 > 4) {
          this.field959 = class182_1.method3752();
        }

        if (i_2 > 5) {
          this.field962 = class182_1.method3555();
        }
      } else {
        this.method1613(true);
      }
    } else {
      this.method1613(true);
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-179570605"
  )
  public static void method1622(int i_0) {
    if (i_0 != -1) {
      if (class175.field2271[i_0]) {
        class230.field2729.method4639(i_0);
        if (class42.field366[i_0] != null) {
          boolean bool_1 = true;

          for (int i_2 = 0; i_2 < class42.field366[i_0].length; i_2++) {
            if (class42.field366[i_0][i_2] != null) {
              if (class42.field366[i_0][i_2].field2721 != 2) {
                class42.field366[i_0][i_2] = null;
              } else {
                bool_1 = false;
              }
            }
          }

          if (bool_1) {
            class42.field366[i_0] = null;
          }

          class175.field2271[i_0] = false;
        }
      }
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1297107509"
  )
  static int method1621(int i_0) {
    class58 class58_1 = (class58) class83.field1181.method3945((long) i_0);
    return class58_1 == null ? -1 : (class58_1.nextSubNode == class83.field1184.field2445 ? -1
        : ((class58) class58_1.nextSubNode).field540);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1739738727"
  )
  void method1613(boolean bool_1) {
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)Lgk;",
      garbageValue = "1661970638"
  )
  Buffer method1609() {
    Buffer class182_1 = new Buffer(100);
    class182_1.putInt8(field964);
    class182_1.putInt8(this.field960 ? 1 : 0);
    class182_1.putInt8(this.field958 ? 1 : 0);
    class182_1.putInt8(this.field957);
    class182_1.putInt8(this.field963.size());
    Iterator iterator_2 = this.field963.entrySet().iterator();

    while (iterator_2.hasNext()) {
      Entry map$entry_3 = (Entry) iterator_2.next();
      class182_1.putInt32(((Integer) map$entry_3.getKey()).intValue());
      class182_1.putInt32(((Integer) map$entry_3.getValue()).intValue());
    }

    class182_1.method3699(this.field959 != null ? this.field959 : "");
    class182_1.method3766(this.field962);
    return class182_1;
  }

}
