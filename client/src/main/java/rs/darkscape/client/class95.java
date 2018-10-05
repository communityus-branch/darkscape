package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.util.Time;

@ObfuscatedName("cx")
public class class95 {

  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -2011144979
  )
  public static int field1300;
  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "Lcr;"
  )
  public static class89 field1297;
  @ObfuscatedName("q")
  protected static boolean field1295;
  @ObfuscatedName("f")
  protected int[] field1299;
  @ObfuscatedName("o")
  @ObfuscatedGetter(
      intValue = 515202779
  )
  int field1303;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = 175968633
  )
  int field1298 = 32;
  @ObfuscatedName("r")
  @ObfuscatedGetter(
      longValue = 3596213632832081127L
  )
  long field1305 = Time.currentTimeMillis();
  @ObfuscatedName("a")
  @ObfuscatedGetter(
      longValue = -4154193984933604857L
  )
  long field1294 = 0L;
  @ObfuscatedName("j")
  @ObfuscatedGetter(
      intValue = 1453548117
  )
  int field1304 = 0;
  @ObfuscatedName("d")
  @ObfuscatedGetter(
      intValue = 1903884361
  )
  int field1307 = 0;
  @ObfuscatedName("h")
  @ObfuscatedGetter(
      intValue = -1788167479
  )
  int field1308 = 0;
  @ObfuscatedName("c")
  @ObfuscatedGetter(
      longValue = 4750042735159967147L
  )
  long field1301 = 0L;
  @ObfuscatedName("v")
  boolean field1310 = true;
  @ObfuscatedName("as")
  @ObfuscatedGetter(
      intValue = 647567121
  )
  int field1313 = 0;
  @ObfuscatedName("an")
  @ObfuscatedSignature(
      signature = "[Ldo;"
  )
  class105[] field1312 = new class105[8];
  @ObfuscatedName("ao")
  @ObfuscatedSignature(
      signature = "[Ldo;"
  )
  class105[] field1309 = new class105[8];
  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "Ldo;"
  )
  class105 field1311;
  @ObfuscatedName("t")
  @ObfuscatedGetter(
      intValue = 1071187089
  )
  int field1302;
  @ObfuscatedName("y")
  @ObfuscatedGetter(
      intValue = 2049583437
  )
  int field1306;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/Throwable;Ljava/lang/String;)Len;"
  )
  public static class152 method2195(Throwable throwable_0, String string_1) {
    class152 class152_2;
    if (throwable_0 instanceof class152) {
      class152_2 = (class152) throwable_0;
      class152_2.field1941 = class152_2.field1941 + ' ' + string_1;
    } else {
      class152_2 = new class152(throwable_0, string_1);
    }

    return class152_2;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2015063069"
  )
  protected void vmethod2176() throws Exception {
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "255"
  )
  protected void vmethod2163(int i_1) throws Exception {
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "83"
  )
  protected int vmethod2153() throws Exception {
    return this.field1302;
  }

  @ObfuscatedName("l")
  protected void vmethod2154() throws Exception {
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1323448603"
  )
  protected void vmethod2155() {
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2047206903"
  )
  protected void vmethod2156() throws Exception {
  }

  @ObfuscatedName("ah")
  @ObfuscatedSignature(
      signature = "(Ldo;I)V",
      garbageValue = "-1537187837"
  )
  public final synchronized void method2143(class105 class105_1) {
    this.field1311 = class105_1;
  }

  @ObfuscatedName("ab")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "947574541"
  )
  public final synchronized void method2144() {
    if (this.field1299 != null) {
      long long_1 = Time.currentTimeMillis();

      try {
        if (this.field1294 != 0L) {
          if (long_1 < this.field1294) {
            return;
          }

          this.vmethod2163(this.field1302);
          this.field1294 = 0L;
          this.field1310 = true;
        }

        int i_3 = this.vmethod2153();
        if (this.field1308 - i_3 > this.field1304) {
          this.field1304 = this.field1308 - i_3;
        }

        int i_4 = this.field1303 + this.field1306;
        if (i_4 + 256 > 16384) {
          i_4 = 16128;
        }

        if (i_4 + 256 > this.field1302) {
          this.field1302 += 1024;
          if (this.field1302 > 16384) {
            this.field1302 = 16384;
          }

          this.vmethod2155();
          this.vmethod2163(this.field1302);
          i_3 = 0;
          this.field1310 = true;
          if (i_4 + 256 > this.field1302) {
            i_4 = this.field1302 - 256;
            this.field1306 = i_4 - this.field1303;
          }
        }

        while (i_3 < i_4) {
          this.method2149(this.field1299, 256);
          this.vmethod2154();
          i_3 += 256;
        }

        if (long_1 > this.field1301) {
          if (!this.field1310) {
            if (this.field1304 == 0 && this.field1307 == 0) {
              this.vmethod2155();
              this.field1294 = long_1 + 2000L;
              return;
            }

            this.field1306 = Math.min(this.field1307, this.field1304);
            this.field1307 = this.field1304;
          } else {
            this.field1310 = false;
          }

          this.field1304 = 0;
          this.field1301 = long_1 + 2000L;
        }

        this.field1308 = i_3;
      } catch (Exception exception_7) {
        this.vmethod2155();
        this.field1294 = 2000L + long_1;
      }

      try {
        if (long_1 > 500000L + this.field1305) {
          long_1 = this.field1305;
        }

        while (long_1 > 5000L + this.field1305) {
          this.method2188(256);
          this.field1305 += (long) (256000 / field1300);
        }
      } catch (Exception exception_6) {
        this.field1305 = long_1;
      }

    }
  }

  @ObfuscatedName("aw")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1969429173"
  )
  public final void method2145() {
    this.field1310 = true;
  }

  @ObfuscatedName("ak")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-58675993"
  )
  public final synchronized void method2146() {
    this.field1310 = true;

    try {
      this.vmethod2156();
    } catch (Exception exception_2) {
      this.vmethod2155();
      this.field1294 = Time.currentTimeMillis() + 2000L;
    }

  }

  @ObfuscatedName("as")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-917768670"
  )
  public final synchronized void method2147() {
    if (class69.field1010 != null) {
      boolean bool_1 = true;

      for (int i_2 = 0; i_2 < 2; i_2++) {
        if (this == class69.field1010.field1327[i_2]) {
          class69.field1010.field1327[i_2] = null;
        }

        if (class69.field1010.field1327[i_2] != null) {
          bool_1 = false;
        }
      }

      if (bool_1) {
        class135.field1855.shutdownNow();
        class135.field1855 = null;
        class69.field1010 = null;
      }
    }

    this.vmethod2155();
    this.field1299 = null;
  }

  @ObfuscatedName("an")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "52"
  )
  final void method2188(int i_1) {
    this.field1313 -= i_1;
    if (this.field1313 < 0) {
      this.field1313 = 0;
    }

    if (this.field1311 != null) {
      this.field1311.vmethod4386(i_1);
    }

  }

  @ObfuscatedName("ao")
  final void method2149(int[] ints_1, int i_2) {
    int i_3 = i_2;
    if (field1295) {
      i_3 = i_2 << 1;
    }

    class193.method3895(ints_1, 0, i_3);
    this.field1313 -= i_2;
    if (this.field1311 != null && this.field1313 <= 0) {
      this.field1313 += field1300 >> 4;
      class84.method1956(this.field1311);
      this.method2184(this.field1311, this.field1311.vmethod2435());
      int i_4 = 0;
      int i_5 = 255;

      int i_6;
      class105 class105_10;
      label104:
      for (i_6 = 7; i_5 != 0; --i_6) {
        int i_7;
        int i_8;
        if (i_6 < 0) {
          i_7 = i_6 & 0x3;
          i_8 = -(i_6 >> 2);
        } else {
          i_7 = i_6;
          i_8 = 0;
        }

        for (int i_9 = i_5 >>> i_7 & 0x11111111; i_9 != 0; i_9 >>>= 4) {
          if ((i_9 & 0x1) != 0) {
            i_5 &= ~(1 << i_7);
            class105_10 = null;
            class105 class105_11 = this.field1312[i_7];

            label98:
            while (true) {
              while (true) {
                if (class105_11 == null) {
                  break label98;
                }

                class108 class108_12 = class105_11.field1383;
                if (class108_12 != null && class108_12.field1416 > i_8) {
                  i_5 |= 1 << i_7;
                  class105_10 = class105_11;
                  class105_11 = class105_11.field1382;
                } else {
                  class105_11.field1385 = true;
                  int i_13 = class105_11.vmethod4395();
                  i_4 += i_13;
                  if (class108_12 != null) {
                    class108_12.field1416 += i_13;
                  }

                  if (i_4 >= this.field1298) {
                    break label104;
                  }

                  class105 class105_14 = class105_11.vmethod4382();
                  if (class105_14 != null) {
                    for (int i_15 = class105_11.field1384; class105_14 != null;
                        class105_14 = class105_11.vmethod4389()) {
                      this.method2184(class105_14, i_15 * class105_14.vmethod2435() >> 8);
                    }
                  }

                  class105 class105_18 = class105_11.field1382;
                  class105_11.field1382 = null;
                  if (class105_10 == null) {
                    this.field1312[i_7] = class105_18;
                  } else {
                    class105_10.field1382 = class105_18;
                  }

                  if (class105_18 == null) {
                    this.field1309[i_7] = class105_10;
                  }

                  class105_11 = class105_18;
                }
              }
            }
          }

          i_7 += 4;
          ++i_8;
        }
      }

      for (i_6 = 0; i_6 < 8; i_6++) {
        class105 class105_16 = this.field1312[i_6];
        class105[] arr_17 = this.field1312;
        this.field1309[i_6] = null;

        for (arr_17[i_6] = null; class105_16 != null; class105_16 = class105_10) {
          class105_10 = class105_16.field1382;
          class105_16.field1382 = null;
        }
      }
    }

    if (this.field1313 < 0) {
      this.field1313 = 0;
    }

    if (this.field1311 != null) {
      this.field1311.vmethod4385(ints_1, 0, i_2);
    }

    this.field1305 = Time.currentTimeMillis();
  }

  @ObfuscatedName("ai")
  @ObfuscatedSignature(
      signature = "(Ldo;II)V",
      garbageValue = "465802976"
  )
  final void method2184(class105 class105_1, int i_2) {
    int i_3 = i_2 >> 5;
    class105 class105_4 = this.field1309[i_3];
    if (class105_4 == null) {
      this.field1312[i_3] = class105_1;
    } else {
      class105_4.field1382 = class105_1;
    }

    this.field1309[i_3] = class105_1;
    class105_1.field1384 = i_2;
  }

}
