package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class221 extends Node {

  @ObfuscatedName("em")
  @ObfuscatedGetter(
      longValue = 2964529997511100277L
  )
  static long field2535;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "[Lct;"
  )
  class93[] field2533 = new class93[128];
  @ObfuscatedName("s")
  short[] field2534 = new short[128];
  @ObfuscatedName("l")
  byte[] field2532 = new byte[128];
  @ObfuscatedName("u")
  byte[] field2536 = new byte[128];
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "[Lho;"
  )
  class216[] field2537 = new class216[128];
  @ObfuscatedName("k")
  byte[] field2538 = new byte[128];
  @ObfuscatedName("i")
  int[] field2539 = new int[128];
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 682383381
  )
  int field2540;

  class221(byte[] bytes_1) {
    Buffer class182_2 = new Buffer(bytes_1);

    int i_3;
    for (i_3 = 0; class182_2.bytes[i_3 + class182_2.offset] != 0; i_3++) {
    }

    byte[] bytes_4 = new byte[i_3];

    int i_5;
    for (i_5 = 0; i_5 < i_3; i_5++) {
      bytes_4[i_5] = class182_2.getInt8();
    }

    ++class182_2.offset;
    ++i_3;
    i_5 = class182_2.offset;
    class182_2.offset += i_3;

    int i_6;
    for (i_6 = 0; class182_2.bytes[i_6 + class182_2.offset] != 0; i_6++) {
    }

    byte[] bytes_7 = new byte[i_6];

    int i_8;
    for (i_8 = 0; i_8 < i_6; i_8++) {
      bytes_7[i_8] = class182_2.getInt8();
    }

    ++class182_2.offset;
    ++i_6;
    i_8 = class182_2.offset;
    class182_2.offset += i_6;

    int i_9;
    for (i_9 = 0; class182_2.bytes[i_9 + class182_2.offset] != 0; i_9++) {
    }

    byte[] bytes_10 = new byte[i_9];

    for (int i_11 = 0; i_11 < i_9; i_11++) {
      bytes_10[i_11] = class182_2.getInt8();
    }

    ++class182_2.offset;
    ++i_9;
    byte[] bytes_38 = new byte[i_9];
    int i_12;
    int i_14;
    if (i_9 > 1) {
      bytes_38[1] = 1;
      int i_13 = 1;
      i_12 = 2;

      for (i_14 = 2; i_14 < i_9; i_14++) {
        int i_15 = class182_2.getUInt8();
        if (i_15 == 0) {
          i_13 = i_12++;
        } else {
          if (i_15 <= i_13) {
            --i_15;
          }

          i_13 = i_15;
        }

        bytes_38[i_14] = (byte) i_13;
      }
    } else {
      i_12 = i_9;
    }

    class216[] arr_39 = new class216[i_12];

    class216 class216_40;
    for (i_14 = 0; i_14 < arr_39.length; i_14++) {
      class216_40 = arr_39[i_14] = new class216();
      int i_16 = class182_2.getUInt8();
      if (i_16 > 0) {
        class216_40.field2447 = new byte[i_16 * 2];
      }

      i_16 = class182_2.getUInt8();
      if (i_16 > 0) {
        class216_40.field2449 = new byte[i_16 * 2 + 2];
        class216_40.field2449[1] = 64;
      }
    }

    i_14 = class182_2.getUInt8();
    byte[] bytes_47 = i_14 > 0 ? new byte[i_14 * 2] : null;
    i_14 = class182_2.getUInt8();
    byte[] bytes_41 = i_14 > 0 ? new byte[i_14 * 2] : null;

    int i_17;
    for (i_17 = 0; class182_2.bytes[i_17 + class182_2.offset] != 0; i_17++) {
    }

    byte[] bytes_18 = new byte[i_17];

    int i_19;
    for (i_19 = 0; i_19 < i_17; i_19++) {
      bytes_18[i_19] = class182_2.getInt8();
    }

    ++class182_2.offset;
    ++i_17;
    i_19 = 0;

    int i_20;
    for (i_20 = 0; i_20 < 128; i_20++) {
      i_19 += class182_2.getUInt8();
      this.field2534[i_20] = (short) i_19;
    }

    i_19 = 0;

    for (i_20 = 0; i_20 < 128; i_20++) {
      i_19 += class182_2.getUInt8();
      this.field2534[i_20] = (short) (this.field2534[i_20] + (i_19 << 8));
    }

    i_20 = 0;
    int i_21 = 0;
    int i_22 = 0;

    int i_23;
    for (i_23 = 0; i_23 < 128; i_23++) {
      if (i_20 == 0) {
        if (i_21 < bytes_18.length) {
          i_20 = bytes_18[i_21++];
        } else {
          i_20 = -1;
        }

        i_22 = class182_2.method3566();
      }

      this.field2534[i_23] = (short) (this.field2534[i_23] + ((i_22 - 1 & 0x2) << 14));
      this.field2539[i_23] = i_22;
      --i_20;
    }

    i_20 = 0;
    i_21 = 0;
    i_23 = 0;

    int i_24;
    for (i_24 = 0; i_24 < 128; i_24++) {
      if (this.field2539[i_24] != 0) {
        if (i_20 == 0) {
          if (i_21 < bytes_4.length) {
            i_20 = bytes_4[i_21++];
          } else {
            i_20 = -1;
          }

          i_23 = class182_2.bytes[i_5++] - 1;
        }

        this.field2538[i_24] = (byte) i_23;
        --i_20;
      }
    }

    i_20 = 0;
    i_21 = 0;
    i_24 = 0;

    for (int i_25 = 0; i_25 < 128; i_25++) {
      if (this.field2539[i_25] != 0) {
        if (i_20 == 0) {
          if (i_21 < bytes_7.length) {
            i_20 = bytes_7[i_21++];
          } else {
            i_20 = -1;
          }

          i_24 = class182_2.bytes[i_8++] + 16 << 2;
        }

        this.field2536[i_25] = (byte) i_24;
        --i_20;
      }
    }

    i_20 = 0;
    i_21 = 0;
    class216 class216_42 = null;

    int i_26;
    for (i_26 = 0; i_26 < 128; i_26++) {
      if (this.field2539[i_26] != 0) {
        if (i_20 == 0) {
          class216_42 = arr_39[bytes_38[i_21]];
          if (i_21 < bytes_10.length) {
            i_20 = bytes_10[i_21++];
          } else {
            i_20 = -1;
          }
        }

        this.field2537[i_26] = class216_42;
        --i_20;
      }
    }

    i_20 = 0;
    i_21 = 0;
    i_26 = 0;

    int i_27;
    for (i_27 = 0; i_27 < 128; i_27++) {
      if (i_20 == 0) {
        if (i_21 < bytes_18.length) {
          i_20 = bytes_18[i_21++];
        } else {
          i_20 = -1;
        }

        if (this.field2539[i_27] > 0) {
          i_26 = class182_2.getUInt8() + 1;
        }
      }

      this.field2532[i_27] = (byte) i_26;
      --i_20;
    }

    this.field2540 = class182_2.getUInt8() + 1;

    class216 class216_28;
    int i_29;
    for (i_27 = 0; i_27 < i_12; i_27++) {
      class216_28 = arr_39[i_27];
      if (class216_28.field2447 != null) {
        for (i_29 = 1; i_29 < class216_28.field2447.length; i_29 += 2) {
          class216_28.field2447[i_29] = class182_2.getInt8();
        }
      }

      if (class216_28.field2449 != null) {
        for (i_29 = 3; i_29 < class216_28.field2449.length - 2; i_29 += 2) {
          class216_28.field2449[i_29] = class182_2.getInt8();
        }
      }
    }

    if (bytes_47 != null) {
      for (i_27 = 1; i_27 < bytes_47.length; i_27 += 2) {
        bytes_47[i_27] = class182_2.getInt8();
      }
    }

    if (bytes_41 != null) {
      for (i_27 = 1; i_27 < bytes_41.length; i_27 += 2) {
        bytes_41[i_27] = class182_2.getInt8();
      }
    }

    for (i_27 = 0; i_27 < i_12; i_27++) {
      class216_28 = arr_39[i_27];
      if (class216_28.field2449 != null) {
        i_19 = 0;

        for (i_29 = 2; i_29 < class216_28.field2449.length; i_29 += 2) {
          i_19 = 1 + i_19 + class182_2.getUInt8();
          class216_28.field2449[i_29] = (byte) i_19;
        }
      }
    }

    for (i_27 = 0; i_27 < i_12; i_27++) {
      class216_28 = arr_39[i_27];
      if (class216_28.field2447 != null) {
        i_19 = 0;

        for (i_29 = 2; i_29 < class216_28.field2447.length; i_29 += 2) {
          i_19 = 1 + i_19 + class182_2.getUInt8();
          class216_28.field2447[i_29] = (byte) i_19;
        }
      }
    }

    byte b_30;
    int i_32;
    int i_33;
    int i_34;
    int i_35;
    int i_36;
    int i_44;
    byte b_46;
    if (bytes_47 != null) {
      i_19 = class182_2.getUInt8();
      bytes_47[0] = (byte) i_19;

      for (i_27 = 2; i_27 < bytes_47.length; i_27 += 2) {
        i_19 = 1 + i_19 + class182_2.getUInt8();
        bytes_47[i_27] = (byte) i_19;
      }

      b_46 = bytes_47[0];
      byte b_43 = bytes_47[1];

      for (i_29 = 0; i_29 < b_46; i_29++) {
        this.field2532[i_29] = (byte) (b_43 * this.field2532[i_29] + 32 >> 6);
      }

      for (i_29 = 2; i_29 < bytes_47.length; i_29 += 2) {
        b_30 = bytes_47[i_29];
        byte b_31 = bytes_47[i_29 + 1];
        i_32 = b_43 * (b_30 - b_46) + (b_30 - b_46) / 2;

        for (i_33 = b_46; i_33 < b_30; i_33++) {
          i_35 = b_30 - b_46;
          i_36 = i_32 >>> 31;
          i_34 = (i_32 + i_36) / i_35 - i_36;
          this.field2532[i_33] = (byte) (i_34 * this.field2532[i_33] + 32 >> 6);
          i_32 += b_31 - b_43;
        }

        b_46 = b_30;
        b_43 = b_31;
      }

      for (i_44 = b_46; i_44 < 128; i_44++) {
        this.field2532[i_44] = (byte) (b_43 * this.field2532[i_44] + 32 >> 6);
      }

      class216_40 = null;
    }

    if (bytes_41 != null) {
      i_19 = class182_2.getUInt8();
      bytes_41[0] = (byte) i_19;

      for (i_27 = 2; i_27 < bytes_41.length; i_27 += 2) {
        i_19 = 1 + i_19 + class182_2.getUInt8();
        bytes_41[i_27] = (byte) i_19;
      }

      b_46 = bytes_41[0];
      int i_49 = bytes_41[1] << 1;

      for (i_29 = 0; i_29 < b_46; i_29++) {
        i_44 = i_49 + (this.field2536[i_29] & 0xff);
        if (i_44 < 0) {
          i_44 = 0;
        }

        if (i_44 > 128) {
          i_44 = 128;
        }

        this.field2536[i_29] = (byte) i_44;
      }

      int i_45;
      for (i_29 = 2; i_29 < bytes_41.length; i_29 += 2) {
        b_30 = bytes_41[i_29];
        i_45 = bytes_41[i_29 + 1] << 1;
        i_32 = i_49 * (b_30 - b_46) + (b_30 - b_46) / 2;

        for (i_33 = b_46; i_33 < b_30; i_33++) {
          i_35 = b_30 - b_46;
          i_36 = i_32 >>> 31;
          i_34 = (i_36 + i_32) / i_35 - i_36;
          int i_37 = i_34 + (this.field2536[i_33] & 0xff);
          if (i_37 < 0) {
            i_37 = 0;
          }

          if (i_37 > 128) {
            i_37 = 128;
          }

          this.field2536[i_33] = (byte) i_37;
          i_32 += i_45 - i_49;
        }

        b_46 = b_30;
        i_49 = i_45;
      }

      for (i_44 = b_46; i_44 < 128; i_44++) {
        i_45 = i_49 + (this.field2536[i_44] & 0xff);
        if (i_45 < 0) {
          i_45 = 0;
        }

        if (i_45 > 128) {
          i_45 = 128;
        }

        this.field2536[i_44] = (byte) i_45;
      }

      Object obj_48 = null;
    }

    for (i_27 = 0; i_27 < i_12; i_27++) {
      arr_39[i_27].field2448 = class182_2.getUInt8();
    }

    for (i_27 = 0; i_27 < i_12; i_27++) {
      class216_28 = arr_39[i_27];
      if (class216_28.field2447 != null) {
        class216_28.field2450 = class182_2.getUInt8();
      }

      if (class216_28.field2449 != null) {
        class216_28.field2446 = class182_2.getUInt8();
      }

      if (class216_28.field2448 > 0) {
        class216_28.field2451 = class182_2.getUInt8();
      }
    }

    for (i_27 = 0; i_27 < i_12; i_27++) {
      arr_39[i_27].field2452 = class182_2.getUInt8();
    }

    for (i_27 = 0; i_27 < i_12; i_27++) {
      class216_28 = arr_39[i_27];
      if (class216_28.field2452 > 0) {
        class216_28.field2453 = class182_2.getUInt8();
      }
    }

    for (i_27 = 0; i_27 < i_12; i_27++) {
      class216_28 = arr_39[i_27];
      if (class216_28.field2453 > 0) {
        class216_28.field2454 = class182_2.getUInt8();
      }
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)Lly;",
      garbageValue = "1835582979"
  )
  public static class317 method4374(AbstractPack class247_0, String groupName, String childName) {
    int groupId = class247_0.method4642(groupName);
    int childId = class247_0.method4643(groupId, childName);
    class317 class317_5;
    if (!class306.method5660(class247_0, groupId, childId)) {
      class317_5 = null;
    } else {
      class317_5 = class305.method5658();
    }

    return class317_5;
  }

  @ObfuscatedName("ix")
  @ObfuscatedSignature(
      signature = "(Lbu;IIII)V",
      garbageValue = "-1709674854"
  )
  static final void method4371(class60 class60_0, int i_1, int i_2, int i_3) {
    if (class138.field1876 != class60_0) {
      if (client.field771 < 400) {
        String string_4;
        if (class60_0.field564 == 0) {
          string_4 = class60_0.field550[0] + class60_0.field552 + class60_0.field550[1] + class135
              .method3113(class60_0.field551, class138.field1876.field551) + " " + " (" + "level-"
              + class60_0.field551 + ")" + class60_0.field550[2];
        } else {
          string_4 = class60_0.field550[0] + class60_0.field552 + class60_0.field550[1] + " " + " ("
              + "skill-" + class60_0.field564 + ")" + class60_0.field550[2];
        }

        int i_5;
        if (client.field733 == 1) {
          class50.method993("Use", client.field734 + " " + "->" + " " + class6.method71(16777215)
              + string_4, 14, i_1, i_2, i_3);
        } else if (client.field785) {
          if ((class63.field932 & 0x8) == 8) {
            class50.method993(client.field612,
                              client.field739 + " " + "->" + " " + class6.method71(16777215)
                                  + string_4, 15, i_1, i_2, i_3);
          }
        } else {
          for (i_5 = 7; i_5 >= 0; --i_5) {
            if (client.field704[i_5] != null) {
              short s_6 = 0;
              if (client.field704[i_5].equalsIgnoreCase("Attack")) {
                if (client.field607 == class77.field1074) {
                  continue;
                }

                if (client.field607 == class77.field1075 || client.field607 == class77.field1080
                    && class60_0.field551 > class138.field1876.field551) {
                  s_6 = 2000;
                }

                if (class138.field1876.field568 != 0 && class60_0.field568 != 0) {
                  if (class60_0.field568 == class138.field1876.field568) {
                    s_6 = 2000;
                  } else {
                    s_6 = 0;
                  }
                }
              } else if (client.field709[i_5]) {
                s_6 = 2000;
              }

              boolean bool_7 = false;
              int i_8 = client.field703[i_5] + s_6;
              class50
                  .method993(client.field704[i_5], class6.method71(16777215) + string_4, i_8, i_1,
                             i_2, i_3);
            }
          }
        }

        for (i_5 = 0; i_5 < client.field771; i_5++) {
          if (client.field720[i_5] == 23) {
            client.field740[i_5] = class6.method71(16777215) + string_4;
            break;
          }
        }

      }
    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Lcn;[B[IB)Z",
      garbageValue = "19"
  )
  boolean method4372(class98 class98_1, byte[] bytes_2, int[] ints_3) {
    boolean bool_4 = true;
    int i_5 = 0;
    class93 class93_6 = null;

    for (int i_7 = 0; i_7 < 128; i_7++) {
      if (bytes_2 == null || bytes_2[i_7] != 0) {
        int i_8 = this.field2539[i_7];
        if (i_8 != 0) {
          if (i_5 != i_8) {
            i_5 = i_8--;
            if ((i_8 & 0x1) == 0) {
              class93_6 = class98_1.method2216(i_8 >> 2, ints_3);
            } else {
              class93_6 = class98_1.method2220(i_8 >> 2, ints_3);
            }

            if (class93_6 == null) {
              bool_4 = false;
            }
          }

          if (class93_6 != null) {
            this.field2533[i_7] = class93_6;
            this.field2539[i_7] = 0;
          }
        }
      }
    }

    return bool_4;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1211152813"
  )
  void method4373() {
    this.field2539 = null;
  }

}
