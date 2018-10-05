package rs.darkscape.client;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class14 implements class31 {

  @ObfuscatedName("oa")
  @ObfuscatedSignature(
      signature = "Lkn;"
  )
  static class293 field94;
  @ObfuscatedName("bj")
  @ObfuscatedGetter(
      intValue = 892739819
  )
  static int field104;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 1521413561
  )
  int field100;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 1962269323
  )
  int field90;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -1724489905
  )
  int field91;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -476751
  )
  int field95;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = -892770797
  )
  int field97;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -691106019
  )
  int field102;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = -129967555
  )
  int field105;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = 1390874549
  )
  int field98;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 1912646943
  )
  int field93;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = -495225415
  )
  int field99;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = 2005192815
  )
  int field101;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -1042718987
  )
  int field96;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -1910350211
  )
  int field89;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = -57751229
  )
  int field103;

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)Ljp;",
      garbageValue = "46"
  )
  public static class267 method123(int i_0) {
    class267 class267_1 = (class267) class267.field3349.method3989((long) i_0);
    if (class267_1 != null) {
      return class267_1;
    } else {
      byte[] bytes_2 = class267.field3367.method4625(32, i_0);
      class267_1 = new class267();
      if (bytes_2 != null) {
        class267_1.method4990(new Buffer(bytes_2));
      }

      class267.field3349.method3983(class267_1, (long) i_0);
      return class267_1;
    }
  }

  @ObfuscatedName("a")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "-1981801988"
  )
  static int method139(int i_0, class84 class84_1, boolean bool_2) {
    if (i_0 == 5000) {
      class69.field999[++class69.field1003 - 1] = client.field630;
      return 1;
    } else if (i_0 == 5001) {
      class69.field1003 -= 3;
      client.field630 = class69.field999[class69.field1003];
      class143.field1899 = PacketBuffer.method3847(class69.field999[class69.field1003 + 1]);
      if (class143.field1899 == null) {
        class143.field1899 = class307.field3734;
      }

      client.field795 = class69.field999[class69.field1003 + 2];
      OutboundPacket class172_22 = OutboundPacket
          .createOutboundPacket(OutboundPacketDescriptor.field2192, client.field626.field1218);
      class172_22.buffer.putInt8(client.field630);
      class172_22.buffer.putInt8(class143.field1899.field3735);
      class172_22.buffer.putInt8(client.field795);
      client.field626.method1980(class172_22);
      return 1;
    } else {
      String string_3;
      int i_4;
      int i_5;
      if (i_0 == 5002) {
        string_3 = class69.field1001[--class55.field497];
        class69.field1003 -= 2;
        i_4 = class69.field999[class69.field1003];
        i_5 = class69.field999[class69.field1003 + 1];
        OutboundPacket class172_15 = OutboundPacket
            .createOutboundPacket(OutboundPacketDescriptor.field2185, client.field626.field1218);
        class172_15.buffer.putInt8(class316.method5820(string_3) + 2);
        class172_15.buffer.method3699(string_3);
        class172_15.buffer.putInt8(i_4 - 1);
        class172_15.buffer.putInt8(i_5);
        client.field626.method1980(class172_15);
        return 1;
      } else {
        int i_10;
        if (i_0 == 5003) {
          class69.field1003 -= 2;
          i_10 = class69.field999[class69.field1003];
          i_4 = class69.field999[class69.field1003 + 1];
          class86 class86_6 = (class86) class83.field1180.get(Integer.valueOf(i_10));
          class58 class58_17 = class86_6.method1965(i_4);
          if (class58_17 != null) {
            class69.field999[++class69.field1003 - 1] = class58_17.field540;
            class69.field999[++class69.field1003 - 1] = class58_17.field535;
            class69.field1001[++class55.field497 - 1] =
                class58_17.field531 != null ? class58_17.field531 : "";
            class69.field1001[++class55.field497 - 1] =
                class58_17.field537 != null ? class58_17.field537 : "";
            class69.field1001[++class55.field497 - 1] =
                class58_17.field533 != null ? class58_17.field533 : "";
            class69.field999[++class69.field1003 - 1] =
                class58_17.method1040() ? 1 : (class58_17.method1043() ? 2 : 0);
          } else {
            class69.field999[++class69.field1003 - 1] = -1;
            class69.field999[++class69.field1003 - 1] = 0;
            class69.field1001[++class55.field497 - 1] = "";
            class69.field1001[++class55.field497 - 1] = "";
            class69.field1001[++class55.field497 - 1] = "";
            class69.field999[++class69.field1003 - 1] = 0;
          }

          return 1;
        } else if (i_0 == 5004) {
          i_10 = class69.field999[--class69.field1003];
          class58 class58_19 = class61.method1130(i_10);
          if (class58_19 != null) {
            class69.field999[++class69.field1003 - 1] = class58_19.field532;
            class69.field999[++class69.field1003 - 1] = class58_19.field535;
            class69.field1001[++class55.field497 - 1] =
                class58_19.field531 != null ? class58_19.field531 : "";
            class69.field1001[++class55.field497 - 1] =
                class58_19.field537 != null ? class58_19.field537 : "";
            class69.field1001[++class55.field497 - 1] =
                class58_19.field533 != null ? class58_19.field533 : "";
            class69.field999[++class69.field1003 - 1] =
                class58_19.method1040() ? 1 : (class58_19.method1043() ? 2 : 0);
          } else {
            class69.field999[++class69.field1003 - 1] = -1;
            class69.field999[++class69.field1003 - 1] = 0;
            class69.field1001[++class55.field497 - 1] = "";
            class69.field1001[++class55.field497 - 1] = "";
            class69.field1001[++class55.field497 - 1] = "";
            class69.field999[++class69.field1003 - 1] = 0;
          }

          return 1;
        } else if (i_0 == 5005) {
          if (class143.field1899 == null) {
            class69.field999[++class69.field1003 - 1] = -1;
          } else {
            class69.field999[++class69.field1003 - 1] = class143.field1899.field3735;
          }

          return 1;
        } else if (i_0 == 5008) {
          string_3 = class69.field1001[--class55.field497];
          i_4 = class69.field999[--class69.field1003];
          String string_16 = string_3.toLowerCase();
          byte b_21 = 0;
          if (string_16.startsWith("yellow:")) {
            b_21 = 0;
            string_3 = string_3.substring("yellow:".length());
          } else if (string_16.startsWith("red:")) {
            b_21 = 1;
            string_3 = string_3.substring("red:".length());
          } else if (string_16.startsWith("green:")) {
            b_21 = 2;
            string_3 = string_3.substring("green:".length());
          } else if (string_16.startsWith("cyan:")) {
            b_21 = 3;
            string_3 = string_3.substring("cyan:".length());
          } else if (string_16.startsWith("purple:")) {
            b_21 = 4;
            string_3 = string_3.substring("purple:".length());
          } else if (string_16.startsWith("white:")) {
            b_21 = 5;
            string_3 = string_3.substring("white:".length());
          } else if (string_16.startsWith("flash1:")) {
            b_21 = 6;
            string_3 = string_3.substring("flash1:".length());
          } else if (string_16.startsWith("flash2:")) {
            b_21 = 7;
            string_3 = string_3.substring("flash2:".length());
          } else if (string_16.startsWith("flash3:")) {
            b_21 = 8;
            string_3 = string_3.substring("flash3:".length());
          } else if (string_16.startsWith("glow1:")) {
            b_21 = 9;
            string_3 = string_3.substring("glow1:".length());
          } else if (string_16.startsWith("glow2:")) {
            b_21 = 10;
            string_3 = string_3.substring("glow2:".length());
          } else if (string_16.startsWith("glow3:")) {
            b_21 = 11;
            string_3 = string_3.substring("glow3:".length());
          } else if (client.field827 != 0) {
            if (string_16.startsWith("yellow:")) {
              b_21 = 0;
              string_3 = string_3.substring("yellow:".length());
            } else if (string_16.startsWith("red:")) {
              b_21 = 1;
              string_3 = string_3.substring("red:".length());
            } else if (string_16.startsWith("green:")) {
              b_21 = 2;
              string_3 = string_3.substring("green:".length());
            } else if (string_16.startsWith("cyan:")) {
              b_21 = 3;
              string_3 = string_3.substring("cyan:".length());
            } else if (string_16.startsWith("purple:")) {
              b_21 = 4;
              string_3 = string_3.substring("purple:".length());
            } else if (string_16.startsWith("white:")) {
              b_21 = 5;
              string_3 = string_3.substring("white:".length());
            } else if (string_16.startsWith("flash1:")) {
              b_21 = 6;
              string_3 = string_3.substring("flash1:".length());
            } else if (string_16.startsWith("flash2:")) {
              b_21 = 7;
              string_3 = string_3.substring("flash2:".length());
            } else if (string_16.startsWith("flash3:")) {
              b_21 = 8;
              string_3 = string_3.substring("flash3:".length());
            } else if (string_16.startsWith("glow1:")) {
              b_21 = 9;
              string_3 = string_3.substring("glow1:".length());
            } else if (string_16.startsWith("glow2:")) {
              b_21 = 10;
              string_3 = string_3.substring("glow2:".length());
            } else if (string_16.startsWith("glow3:")) {
              b_21 = 11;
              string_3 = string_3.substring("glow3:".length());
            }
          }

          string_16 = string_3.toLowerCase();
          byte b_7 = 0;
          if (string_16.startsWith("wave:")) {
            b_7 = 1;
            string_3 = string_3.substring("wave:".length());
          } else if (string_16.startsWith("wave2:")) {
            b_7 = 2;
            string_3 = string_3.substring("wave2:".length());
          } else if (string_16.startsWith("shake:")) {
            b_7 = 3;
            string_3 = string_3.substring("shake:".length());
          } else if (string_16.startsWith("scroll:")) {
            b_7 = 4;
            string_3 = string_3.substring("scroll:".length());
          } else if (string_16.startsWith("slide:")) {
            b_7 = 5;
            string_3 = string_3.substring("slide:".length());
          } else if (client.field827 != 0) {
            if (string_16.startsWith("wave:")) {
              b_7 = 1;
              string_3 = string_3.substring("wave:".length());
            } else if (string_16.startsWith("wave2:")) {
              b_7 = 2;
              string_3 = string_3.substring("wave2:".length());
            } else if (string_16.startsWith("shake:")) {
              b_7 = 3;
              string_3 = string_3.substring("shake:".length());
            } else if (string_16.startsWith("scroll:")) {
              b_7 = 4;
              string_3 = string_3.substring("scroll:".length());
            } else if (string_16.startsWith("slide:")) {
              b_7 = 5;
              string_3 = string_3.substring("slide:".length());
            }
          }

          OutboundPacket class172_8 = OutboundPacket
              .createOutboundPacket(OutboundPacketDescriptor.field2179, client.field626.field1218);
          class172_8.buffer.putInt8(0);
          int i_9 = class172_8.buffer.offset;
          class172_8.buffer.putInt8(i_4);
          class172_8.buffer.putInt8(b_21);
          class172_8.buffer.putInt8(b_7);
          PacketBuffer.method3840(class172_8.buffer, string_3);
          class172_8.buffer.method3545(class172_8.buffer.offset - i_9);
          client.field626.method1980(class172_8);
          return 1;
        } else {
          int i_13;
          if (i_0 == 5009) {
            class55.field497 -= 2;
            string_3 = class69.field1001[class55.field497];
            String string_18 = class69.field1001[class55.field497 + 1];
            OutboundPacket class172_11 = OutboundPacket
                .createOutboundPacket(OutboundPacketDescriptor.field2154, client.field626.field1218);
            class172_11.buffer.method3755(0);
            i_13 = class172_11.buffer.offset;
            class172_11.buffer.method3699(string_3);
            PacketBuffer.method3840(class172_11.buffer, string_18);
            class172_11.buffer.method3614(class172_11.buffer.offset - i_13);
            client.field626.method1980(class172_11);
            return 1;
          } else if (i_0 != 5015) {
            if (i_0 == 5016) {
              class69.field999[++class69.field1003 - 1] = client.field795;
              return 1;
            } else {
              int[] ints_12;
              if (i_0 == 5017) {
                i_10 = class69.field999[--class69.field1003];
                ints_12 = class69.field999;
                i_5 = ++class69.field1003 - 1;
                class86 class86_20 = (class86) class83.field1180.get(Integer.valueOf(i_10));
                if (class86_20 == null) {
                  i_13 = 0;
                } else {
                  i_13 = class86_20.method1976();
                }

                ints_12[i_5] = i_13;
                return 1;
              } else if (i_0 == 5018) {
                i_10 = class69.field999[--class69.field1003];
                class69.field999[++class69.field1003 - 1] = class66.method1621(i_10);
                return 1;
              } else if (i_0 == 5019) {
                i_10 = class69.field999[--class69.field1003];
                ints_12 = class69.field999;
                i_5 = ++class69.field1003 - 1;
                class58 class58_14 = (class58) class83.field1181.method3945((long) i_10);
                if (class58_14 == null) {
                  i_13 = -1;
                } else if (class58_14.prevSubNode == class83.field1184.field2445) {
                  i_13 = -1;
                } else {
                  i_13 = ((class58) class58_14.prevSubNode).field540;
                }

                ints_12[i_5] = i_13;
                return 1;
              } else if (i_0 == 5020) {
                string_3 = class69.field1001[--class55.field497];
                class56.method1031(string_3);
                return 1;
              } else if (i_0 == 5021) {
                client.field796 = class69.field1001[--class55.field497].toLowerCase().trim();
                return 1;
              } else if (i_0 == 5022) {
                class69.field1001[++class55.field497 - 1] = client.field796;
                return 1;
              } else {
                return 2;
              }
            }
          } else {
            if (class138.field1876 != null && class138.field1876.field552 != null) {
              string_3 = class138.field1876.field552.method5447();
            } else {
              string_3 = "";
            }

            class69.field1001[++class55.field497 - 1] = string_3;
            return 1;
          }
        }
      }
    }
  }

  @ObfuscatedName("gn")
  @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "16"
  )
  static final void method137(boolean bool_0) {
    class54.method1017();
    ++client.field626.field1224;
    if (client.field626.field1224 >= 50 || bool_0) {
      client.field626.field1224 = 0;
      if (!client.field756 && client.field626.method1983() != null) {
        OutboundPacket class172_1 = OutboundPacket
            .createOutboundPacket(OutboundPacketDescriptor.field2211, client.field626.field1218);
        client.field626.method1980(class172_1);

        try {
          client.field626.method1979();
        } catch (IOException ioexception_3) {
          client.field756 = true;
        }
      }

    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(La;B)V",
      garbageValue = "-105"
  )
  public void vmethod635(class20 class20_1) {
    if (class20_1.field166 > this.field93) {
      class20_1.field166 = this.field93;
    }

    if (class20_1.field167 < this.field93) {
      class20_1.field167 = this.field93;
    }

    if (class20_1.field168 > this.field96) {
      class20_1.field168 = this.field96;
    }

    if (class20_1.field162 < this.field96) {
      class20_1.field162 = this.field96;
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "2090621319"
  )
  public boolean vmethod636(int i_1, int i_2, int i_3) {
    return i_1 >= this.field100 && i_1 < this.field90 + this.field100 ?
        i_2 >= (this.field91 << 6) + (this.field95 << 3) && i_2 <= (this.field91 << 6) + (
            this.field97 << 3) + 7 && i_3 >= (this.field102 << 6) + (this.field105 << 3)
            && i_3 <= (this.field102 << 6) + (this.field98 << 3) + 7 : false;
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-658565537"
  )
  public boolean vmethod637(int i_1, int i_2) {
    return i_1 >= (this.field93 << 6) + (this.field99 << 3) && i_1 <= (this.field93 << 6) + (
        this.field101 << 3) + 7 && i_2 >= (this.field96 << 6) + (this.field89 << 3)
        && i_2 <= (this.field96 << 6) + (this.field103 << 3) + 7;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "56"
  )
  public int[] vmethod638(int i_1, int i_2, int i_3) {
    if (!this.vmethod636(i_1, i_2, i_3)) {
      return null;
    } else {
      int[] ints_4 = new int[]{
          this.field93 * 64 - this.field91 * 64 + i_2 + (this.field99 * 8 - this.field95 * 8),
          i_3 + (this.field96 * 64 - this.field102 * 64) + (this.field89 * 8 - this.field105 * 8)};
      return ints_4;
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(III)Lha;",
      garbageValue = "2128900046"
  )
  public class226 vmethod659(int i_1, int i_2) {
    if (!this.vmethod637(i_1, i_2)) {
      return null;
    } else {
      int i_3 = this.field91 * 64 - this.field93 * 64 + (this.field95 * 8 - this.field99 * 8) + i_1;
      int i_4 =
          this.field102 * 64 - this.field96 * 64 + i_2 + (this.field105 * 8 - this.field89 * 8);
      return new class226(this.field100, i_3, i_4);
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(Lgk;B)V",
      garbageValue = "-40"
  )
  public void vmethod639(Buffer class182_1) {
    this.field100 = class182_1.getUInt8();
    this.field90 = class182_1.getUInt8();
    this.field91 = class182_1.getUInt16();
    this.field95 = class182_1.getUInt8();
    this.field97 = class182_1.getUInt8();
    this.field102 = class182_1.getUInt16();
    this.field105 = class182_1.getUInt8();
    this.field98 = class182_1.getUInt8();
    this.field93 = class182_1.getUInt16();
    this.field99 = class182_1.getUInt8();
    this.field101 = class182_1.getUInt8();
    this.field96 = class182_1.getUInt16();
    this.field89 = class182_1.getUInt8();
    this.field103 = class182_1.getUInt8();
    this.method121();
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "87"
  )
  void method121() {
  }

}
