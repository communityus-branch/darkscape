package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class class85 extends class127 {

  @ObfuscatedName("gc")
  @ObfuscatedGetter(
      intValue = -127094665
  )
  static int field1201;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -718862821
  )
  int field1207;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 715597741
  )
  int field1204;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 811632703
  )
  int field1200;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 263990655
  )
  int field1206;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1730539295
  )
  int field1198;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -2035092851
  )
  int field1203;
  @ObfuscatedName("k")
  @ObfuscatedSignature(
      signature = "Ljn;"
  )
  class273 field1202;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 1387682185
  )
  int field1205;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = -71136025
  )
  int field1199;

  @ObfuscatedSignature(
      signature = "(IIIIIIIZLdf;)V"
  )
  class85(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean bool_8,
          class127 class127_9) {
    this.field1207 = i_1;
    this.field1204 = i_2;
    this.field1200 = i_3;
    this.field1206 = i_4;
    this.field1198 = i_5;
    this.field1203 = i_6;
    if (i_7 != -1) {
      this.field1202 = class3.method25(i_7);
      this.field1205 = 0;
      this.field1199 = client.field591 - 1;
      if (this.field1202.field3553 == 0 && class127_9 != null && class127_9 instanceof class85) {
        class85 class85_10 = (class85) class127_9;
        if (this.field1202 == class85_10.field1202) {
          this.field1205 = class85_10.field1205;
          this.field1199 = class85_10.field1199;
          return;
        }
      }

      if (bool_8 && this.field1202.field3544 != -1) {
        this.field1205 = (int) (Math.random() * (double) this.field1202.field3540.length);
        this.field1199 -= (int) (Math.random() * (double) this.field1202.field3541[this.field1205]);
      }
    }

  }

  @ObfuscatedName("fy")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
  )
  static final void method1962() {
    int i_0;
    int i_1;
    int i_2;
    int i_3;
    int i_4;
    int i_5;
    if (client.field655 == 0) {
      i_0 = class138.field1876.field931;
      i_1 = class138.field1876.field881;
      if (BufferedFile.field1428 - i_0 < -500 || BufferedFile.field1428 - i_0 > 500
          || class2.field23 - i_1 < -500 || class2.field23 - i_1 > 500) {
        BufferedFile.field1428 = i_0;
        class2.field23 = i_1;
      }

      if (i_0 != BufferedFile.field1428) {
        BufferedFile.field1428 += (i_0 - BufferedFile.field1428) / 16;
      }

      if (i_1 != class2.field23) {
        class2.field23 += (i_1 - class2.field23) / 16;
      }

      i_2 = BufferedFile.field1428 >> 7;
      i_3 = class2.field23 >> 7;
      i_4 = class27.method460(BufferedFile.field1428, class2.field23, class13.field82);
      i_5 = 0;
      int i_6;
      if (i_2 > 3 && i_3 > 3 && i_2 < 100 && i_3 < 100) {
        for (i_6 = i_2 - 4; i_6 <= i_2 + 4; i_6++) {
          for (int i_7 = i_3 - 4; i_7 <= i_3 + 4; i_7++) {
            int i_8 = class13.field82;
            if (i_8 < 3 && (class50.field443[1][i_6][i_7] & 0x2) == 2) {
              ++i_8;
            }

            int i_9 = i_4 - class50.field459[i_8][i_6][i_7];
            if (i_9 > i_5) {
              i_5 = i_9;
            }
          }
        }
      }

      i_6 = i_5 * 192;
      if (i_6 > 98048) {
        i_6 = 98048;
      }

      if (i_6 < 32768) {
        i_6 = 32768;
      }

      if (i_6 > client.field738) {
        client.field738 += (i_6 - client.field738) / 24;
      } else if (i_6 < client.field738) {
        client.field738 += (i_6 - client.field738) / 80;
      }

      class269.field3478 = class27
          .method460(class138.field1876.field931, class138.field1876.field881, class13.field82)
          - client.field644;
    } else if (client.field655 == 1) {
      class181.method3527();
      short s_10 = -1;
      if (Keyboard.keyActive[33]) {
        s_10 = 0;
      } else if (Keyboard.keyActive[49]) {
        s_10 = 1024;
      }

      if (Keyboard.keyActive[48]) {
        if (s_10 == 0) {
          s_10 = 1792;
        } else if (s_10 == 1024) {
          s_10 = 1280;
        } else {
          s_10 = 1536;
        }
      } else if (Keyboard.keyActive[50]) {
        if (s_10 == 0) {
          s_10 = 256;
        } else if (s_10 == 1024) {
          s_10 = 768;
        } else {
          s_10 = 512;
        }
      }

      byte b_11 = 0;
      if (Keyboard.keyActive[35]) {
        b_11 = -1;
      } else if (Keyboard.keyActive[51]) {
        b_11 = 1;
      }

      i_2 = 0;
      if (s_10 >= 0 || b_11 != 0) {
        i_2 = Keyboard.keyActive[81] ? client.field661 : client.field750;
        i_2 *= 16;
        client.field613 = s_10;
        client.field659 = b_11;
      }

      if (client.field657 < i_2) {
        client.field657 += i_2 / 8;
        if (client.field657 > i_2) {
          client.field657 = i_2;
        }
      } else if (client.field657 > i_2) {
        client.field657 = client.field657 * 9 / 10;
      }

      if (client.field657 > 0) {
        i_3 = client.field657 / 16;
        if (client.field613 >= 0) {
          i_0 = client.field613 - field1201 & 0x7ff;
          i_4 = class122.field1681[i_0];
          i_5 = class122.field1693[i_0];
          BufferedFile.field1428 += i_4 * i_3 / 65536;
          class2.field23 += i_3 * i_5 / 65536;
        }

        if (client.field659 != 0) {
          class269.field3478 += i_3 * client.field659;
          if (class269.field3478 > 0) {
            class269.field3478 = 0;
          }
        }
      } else {
        client.field613 = -1;
        client.field659 = -1;
      }

      if (Keyboard.keyActive[13]) {
        client.field626
            .method1980(OutboundPacket.createOutboundPacket(OutboundPacketDescriptor.field2142, client.field626.field1218));
        client.field655 = 0;
      }
    }

    if (Mouse.field419 == 4 && class253.field3229) {
      i_0 = Mouse.field426 * 673804999 - client.field654 * 673804999;
      client.field652 = i_0 * 2;
      client.field654 =
          (i_0 != -1 && i_0 != 1 ? (Mouse.field426 * 673804999 + client.field654 * 673804999) / 2
              : Mouse.field426 * 673804999) * -1660309769;
      i_1 = client.field653 - Mouse.field425;
      client.field608 = i_1 * 2;
      client.field653 =
          i_1 != -1 && i_1 != 1 ? (Mouse.field425 + client.field653) / 2 : Mouse.field425;
    } else {
      if (Keyboard.keyActive[96]) {
        client.field608 += (-24 - client.field608) / 2;
      } else if (Keyboard.keyActive[97]) {
        client.field608 += (24 - client.field608) / 2;
      } else {
        client.field608 /= 2;
      }

      if (Keyboard.keyActive[98]) {
        client.field652 += (12 - client.field652) / 2;
      } else if (Keyboard.keyActive[99]) {
        client.field652 += (-12 - client.field652) / 2;
      } else {
        client.field652 /= 2;
      }

      client.field654 = Mouse.field426;
      client.field653 = Mouse.field425;
    }

    client.field717 = client.field608 / 2 + client.field717 & 0x7ff;
    client.field649 += client.field652 / 2;
    if (client.field649 < 128) {
      client.field649 = 128;
    }

    if (client.field649 > 383) {
      client.field649 = 383;
    }

  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)Ldc;",
      garbageValue = "2119202332"
  )
  protected final class119 vmethod3067() {
    if (this.field1202 != null) {
      int i_1 = client.field591 - this.field1199;
      if (i_1 > 100 && this.field1202.field3544 > 0) {
        i_1 = 100;
      }

      label55:
      {
        do {
          do {
            if (i_1 <= this.field1202.field3541[this.field1205]) {
              break label55;
            }

            i_1 -= this.field1202.field3541[this.field1205];
            ++this.field1205;
          } while (this.field1205 < this.field1202.field3540.length);

          this.field1205 -= this.field1202.field3544;
        } while (this.field1205 >= 0 && this.field1205 < this.field1202.field3540.length);

        this.field1202 = null;
      }

      this.field1199 = client.field591 - i_1;
    }

    class268 class268_12 = SeekableFile.method2527(this.field1207);
    if (class268_12.field3410 != null) {
      class268_12 = class268_12.method5056();
    }

    if (class268_12 == null) {
      return null;
    } else {
      int i_2;
      int i_3;
      if (this.field1200 != 1 && this.field1200 != 3) {
        i_2 = class268_12.field3384;
        i_3 = class268_12.field3385;
      } else {
        i_2 = class268_12.field3385;
        i_3 = class268_12.field3384;
      }

      int i_4 = (i_2 >> 1) + this.field1198;
      int i_5 = (i_2 + 1 >> 1) + this.field1198;
      int i_6 = (i_3 >> 1) + this.field1203;
      int i_7 = (i_3 + 1 >> 1) + this.field1203;
      int[][] ints_8 = class50.field459[this.field1206];
      int i_9 = ints_8[i_5][i_7] + ints_8[i_4][i_7] + ints_8[i_5][i_6] + ints_8[i_4][i_6] >> 2;
      int i_10 = (this.field1198 << 7) + (i_2 << 6);
      int i_11 = (this.field1203 << 7) + (i_3 << 6);
      return class268_12
          .method5032(this.field1204, this.field1200, ints_8, i_10, i_9, i_11, this.field1202,
                      this.field1205);
    }
  }

}
