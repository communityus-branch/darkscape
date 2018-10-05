package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public abstract class AbstractPack {

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "Lfv;"
  )
  static class175 field3172 = new class175();
  @ObfuscatedName("t")
  @ObfuscatedGetter(
      intValue = -2137229897
  )
  static int field3176 = 0;
  @ObfuscatedName("g")
  @ObfuscatedGetter(
      intValue = 516934159
  )
  public int checksum;
  @ObfuscatedName("m")
  boolean deleteGroups;
  @ObfuscatedName("r")
  boolean deleteChildren;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = 883985551
  )
  int size;
  @ObfuscatedName("s")
  int[] ids;
  @ObfuscatedName("q")
  int[] checksums;
  @ObfuscatedName("k")
  int[] versions;
  @ObfuscatedName("i")
  int[] groupSizes;
  @ObfuscatedName("x")
  int[][] field3167;
  @ObfuscatedName("b")
  Object[] field3165;
  @ObfuscatedName("n")
  Object[][] field3169;
  @ObfuscatedName("l")
  int[] groupNames;
  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "Lgh;"
  )
  LinearHashMap field3163;
  @ObfuscatedName("e")
  int[][] field3168;
  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "[Lgh;"
  )
  LinearHashMap[] field3173;

  AbstractPack(boolean deleteGroups, boolean deleteChildren) {
    this.deleteGroups = deleteGroups;
    this.deleteChildren = deleteChildren;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "65"
  )
  void decode(byte[] bytes) {
    int len = bytes.length;
    this.checksum = class187.computeChecksum(bytes, 0, len);
    Buffer buffer = new Buffer(class47.unpack(bytes));
    int encoding = buffer.getUInt8();
    if (encoding < 5 || encoding > 7) {
      throw new RuntimeException("");
    }

    if (encoding >= 6) {
      buffer.getInt32();
    }

    int flags = buffer.getUInt8();
    if (encoding >= 7) {
      this.size = buffer.getUSmart32();
    } else {
      this.size = buffer.getUInt16();
    }

    int id = 0;
    int maximumId = -1;
    this.ids = new int[this.size];
    int i_9;
    if (encoding >= 7) {
      for (int i = 0; i < this.size; i++) {
        this.ids[i] = id += buffer.getUSmart32();
        if (this.ids[i] > maximumId) {
          maximumId = this.ids[i];
        }
      }
    } else {
      for (int i = 0; i < this.size; i++) {
        this.ids[i] = id += buffer.getUInt16();
        if (this.ids[i] > maximumId) {
          maximumId = this.ids[i];
        }
      }
    }

    this.checksums = new int[maximumId + 1];
    this.versions = new int[maximumId + 1];
    this.groupSizes = new int[maximumId + 1];
    this.field3167 = new int[maximumId + 1][];
    this.field3165 = new Object[maximumId + 1];
    this.field3169 = new Object[maximumId + 1][];
    if (flags != 0) {
      this.groupNames = new int[maximumId + 1];

      for (i_9 = 0; i_9 < this.size; i_9++) {
        this.groupNames[this.ids[i_9]] = buffer.getInt32();
      }

      this.field3163 = new LinearHashMap(this.groupNames);
    }

    for (int i = 0; i < this.size; i++) {
      this.checksums[this.ids[i]] = buffer.getInt32();
    }

    for (int i = 0; i < this.size; i++) {
      this.versions[this.ids[i]] = buffer.getInt32();
    }

    for (int i = 0; i < this.size; i++) {
      this.groupSizes[this.ids[i]] = buffer.getUInt16();
    }

    int i_10;
    int i_11;
    int i_12;
    int i_13;
    int i_14;
    if (encoding >= 7) {
      for (i_9 = 0; i_9 < this.size; i_9++) {
        i_10 = this.ids[i_9];
        i_11 = this.groupSizes[i_10];
        id = 0;
        i_12 = -1;
        this.field3167[i_10] = new int[i_11];

        for (i_13 = 0; i_13 < i_11; i_13++) {
          i_14 = this.field3167[i_10][i_13] = id += buffer.getUSmart32();
          if (i_14 > i_12) {
            i_12 = i_14;
          }
        }

        this.field3169[i_10] = new Object[i_12 + 1];
      }
    } else {
      for (i_9 = 0; i_9 < this.size; i_9++) {
        i_10 = this.ids[i_9];
        i_11 = this.groupSizes[i_10];
        id = 0;
        i_12 = -1;
        this.field3167[i_10] = new int[i_11];

        for (i_13 = 0; i_13 < i_11; i_13++) {
          i_14 = this.field3167[i_10][i_13] = id += buffer.getUInt16();
          if (i_14 > i_12) {
            i_12 = i_14;
          }
        }

        this.field3169[i_10] = new Object[i_12 + 1];
      }
    }

    if (flags != 0) {
      this.field3168 = new int[maximumId + 1][];
      this.field3173 = new LinearHashMap[maximumId + 1];

      for (i_9 = 0; i_9 < this.size; i_9++) {
        i_10 = this.ids[i_9];
        i_11 = this.groupSizes[i_10];
        this.field3168[i_10] = new int[this.field3169[i_10].length];

        for (i_12 = 0; i_12 < i_11; i_12++) {
          this.field3168[i_10][this.field3167[i_10][i_12]] = buffer.getInt32();
        }

        this.field3173[i_10] = new LinearHashMap(this.field3168[i_10]);
      }
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-114"
  )
  void vmethod4721(int i_1) {
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(III)[B",
      garbageValue = "1818456524"
  )
  public byte[] method4625(int i_1, int i_2) {
    return this.method4628(i_1, i_2, (int[]) null);
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(II[IB)[B",
      garbageValue = "18"
  )
  public byte[] method4628(int i_1, int i_2, int[] ints_3) {
    if (i_1 >= 0 && i_1 < this.field3169.length && this.field3169[i_1] != null && i_2 >= 0
        && i_2 < this.field3169[i_1].length) {
      if (this.field3169[i_1][i_2] == null) {
        boolean bool_4 = this.method4693(i_1, ints_3);
        if (!bool_4) {
          this.vmethod4722(i_1);
          bool_4 = this.method4693(i_1, ints_3);
          if (!bool_4) {
            return null;
          }
        }
      }

      byte[] bytes_5 = class97.method2211(this.field3169[i_1][i_2], false);
      if (this.deleteChildren) {
        this.field3169[i_1][i_2] = null;
      }

      return bytes_5;
    } else {
      return null;
    }
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "1"
  )
  public boolean method4696(int i_1, int i_2) {
    if (i_1 >= 0 && i_1 < this.field3169.length && this.field3169[i_1] != null && i_2 >= 0
        && i_2 < this.field3169[i_1].length) {
      if (this.field3169[i_1][i_2] != null) {
        return true;
      } else if (this.field3165[i_1] != null) {
        return true;
      } else {
        this.vmethod4722(i_1);
        return this.field3165[i_1] != null;
      }
    } else {
      return false;
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "107"
  )
  public boolean method4627(int i_1) {
    if (this.field3169.length == 1) {
      return this.method4696(0, i_1);
    } else if (this.field3169[i_1].length == 1) {
      return this.method4696(i_1, 0);
    } else {
      throw new RuntimeException();
    }
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "14"
  )
  public boolean method4707(int i_1) {
    if (this.field3165[i_1] != null) {
      return true;
    } else {
      this.vmethod4722(i_1);
      return this.field3165[i_1] != null;
    }
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "758366307"
  )
  public boolean method4629() {
    boolean bool_1 = true;

    for (int i_2 = 0; i_2 < this.ids.length; i_2++) {
      int i_3 = this.ids[i_2];
      if (this.field3165[i_3] == null) {
        this.vmethod4722(i_3);
        if (this.field3165[i_3] == null) {
          bool_1 = false;
        }
      }
    }

    return bool_1;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "35"
  )
  int vmethod4727(int i_1) {
    return this.field3165[i_1] != null ? 100 : 0;
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-265893488"
  )
  public byte[] get(int id) {
    if (this.field3169.length == 1) {
      return this.method4625(0, id);
    } else if (this.field3169[id].length == 1) {
      return this.method4625(id, 0);
    } else {
      throw new RuntimeException();
    }
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(III)[B",
      garbageValue = "-322980430"
  )
  public byte[] method4676(int i_1, int i_2) {
    if (i_1 >= 0 && i_1 < this.field3169.length && this.field3169[i_1] != null && i_2 >= 0
        && i_2 < this.field3169[i_1].length) {
      if (this.field3169[i_1][i_2] == null) {
        boolean bool_3 = this.method4693(i_1, (int[]) null);
        if (!bool_3) {
          this.vmethod4722(i_1);
          bool_3 = this.method4693(i_1, (int[]) null);
          if (!bool_3) {
            return null;
          }
        }
      }

      byte[] bytes_4 = class97.method2211(this.field3169[i_1][i_2], false);
      return bytes_4;
    } else {
      return null;
    }
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(IS)[B",
      garbageValue = "-10823"
  )
  public byte[] method4626(int i_1) {
    if (this.field3169.length == 1) {
      return this.method4676(0, i_1);
    } else if (this.field3169[i_1].length == 1) {
      return this.method4676(i_1, 0);
    } else {
      throw new RuntimeException();
    }
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "10"
  )
  void vmethod4722(int i_1) {
  }

  @ObfuscatedName("g")
  @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "889237551"
  )
  public int[] method4668(int i_1) {
    return this.field3167[i_1];
  }

  @ObfuscatedName("m")
  @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "180707885"
  )
  public int method4636(int i_1) {
    return this.field3169[i_1].length;
  }

  @ObfuscatedName("r")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "252467795"
  )
  public int method4637() {
    return this.field3169.length;
  }

  @ObfuscatedName("t")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "59"
  )
  public void method4702() {
    for (int i_1 = 0; i_1 < this.field3165.length; i_1++) {
      this.field3165[i_1] = null;
    }

  }

  @ObfuscatedName("o")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "38"
  )
  public void method4639(int i_1) {
    for (int i_2 = 0; i_2 < this.field3169[i_1].length; i_2++) {
      this.field3169[i_1][i_2] = null;
    }

  }

  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2135464480"
  )
  public void method4640() {
    for (int i_1 = 0; i_1 < this.field3169.length; i_1++) {
      if (this.field3169[i_1] != null) {
        for (int i_2 = 0; i_2 < this.field3169[i_1].length; i_2++) {
          this.field3169[i_1][i_2] = null;
        }
      }
    }

  }

  @ObfuscatedName("a")
  @ObfuscatedSignature(
      signature = "(I[IB)Z",
      garbageValue = "123"
  )
  boolean method4693(int i_1, int[] ints_2) {
    if (this.field3165[i_1] == null) {
      return false;
    } else {
      int i_3 = this.groupSizes[i_1];
      int[] ints_4 = this.field3167[i_1];
      Object[] arr_5 = this.field3169[i_1];
      boolean bool_6 = true;

      for (int i_7 = 0; i_7 < i_3; i_7++) {
        if (arr_5[ints_4[i_7]] == null) {
          bool_6 = false;
          break;
        }
      }

      if (bool_6) {
        return true;
      } else {
        byte[] bytes_18;
        if (ints_2 != null && (ints_2[0] != 0 || ints_2[1] != 0 || ints_2[2] != 0
            || ints_2[3] != 0)) {
          bytes_18 = class97.method2211(this.field3165[i_1], true);
          Buffer class182_8 = new Buffer(bytes_18);
          class182_8.method3570(ints_2, 5, class182_8.bytes.length);
        } else {
          bytes_18 = class97.method2211(this.field3165[i_1], false);
        }

        byte[] bytes_20 = class47.unpack(bytes_18);
        if (this.deleteGroups) {
          this.field3165[i_1] = null;
        }

        if (i_3 > 1) {
          int i_9 = bytes_20.length;
          --i_9;
          int i_10 = bytes_20[i_9] & 0xff;
          i_9 -= i_3 * i_10 * 4;
          Buffer class182_11 = new Buffer(bytes_20);
          int[] ints_12 = new int[i_3];
          class182_11.offset = i_9;

          int i_14;
          int i_15;
          for (int i_13 = 0; i_13 < i_10; i_13++) {
            i_14 = 0;

            for (i_15 = 0; i_15 < i_3; i_15++) {
              i_14 += class182_11.getInt32();
              ints_12[i_15] += i_14;
            }
          }

          byte[][] bytes_19 = new byte[i_3][];

          for (i_14 = 0; i_14 < i_3; i_14++) {
            bytes_19[i_14] = new byte[ints_12[i_14]];
            ints_12[i_14] = 0;
          }

          class182_11.offset = i_9;
          i_14 = 0;

          for (i_15 = 0; i_15 < i_10; i_15++) {
            int i_16 = 0;

            for (int i_17 = 0; i_17 < i_3; i_17++) {
              i_16 += class182_11.getInt32();
              System.arraycopy(bytes_20, i_14, bytes_19[i_17], ints_12[i_17], i_16);
              ints_12[i_17] += i_16;
              i_14 += i_16;
            }
          }

          for (i_15 = 0; i_15 < i_3; i_15++) {
            if (!this.deleteChildren) {
              arr_5[ints_4[i_15]] = Temp.method3324(bytes_19[i_15], false);
            } else {
              arr_5[ints_4[i_15]] = bytes_19[i_15];
            }
          }
        } else if (!this.deleteChildren) {
          arr_5[ints_4[0]] = Temp.method3324(bytes_20, false);
        } else {
          arr_5[ints_4[0]] = bytes_20;
        }

        return true;
      }
    }
  }

  @ObfuscatedName("c")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "258440210"
  )
  public int method4642(String string_1) {
    string_1 = string_1.toLowerCase();
    return this.field3163.method3967(class277.method5240(string_1));
  }

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)I",
      garbageValue = "-981702486"
  )
  public int method4643(int i_1, String string_2) {
    string_2 = string_2.toLowerCase();
    return this.field3173[i_1].method3967(class277.method5240(string_2));
  }

  @ObfuscatedName("af")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;B)Z",
      garbageValue = "9"
  )
  public boolean method4644(String string_1, String string_2) {
    string_1 = string_1.toLowerCase();
    string_2 = string_2.toLowerCase();
    int i_3 = this.field3163.method3967(class277.method5240(string_1));
    if (i_3 < 0) {
      return false;
    } else {
      int i_4 = this.field3173[i_3].method3967(class277.method5240(string_2));
      return i_4 >= 0;
    }
  }

  @ObfuscatedName("ah")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)[B",
      garbageValue = "222409025"
  )
  public byte[] method4684(String string_1, String string_2) {
    string_1 = string_1.toLowerCase();
    string_2 = string_2.toLowerCase();
    int i_3 = this.field3163.method3967(class277.method5240(string_1));
    int i_4 = this.field3173[i_3].method3967(class277.method5240(string_2));
    return this.method4625(i_3, i_4);
  }

  @ObfuscatedName("ab")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "-1256800993"
  )
  public boolean method4646(String string_1, String string_2) {
    string_1 = string_1.toLowerCase();
    string_2 = string_2.toLowerCase();
    int i_3 = this.field3163.method3967(class277.method5240(string_1));
    int i_4 = this.field3173[i_3].method3967(class277.method5240(string_2));
    return this.method4696(i_3, i_4);
  }

  @ObfuscatedName("aw")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Z",
      garbageValue = "-574756361"
  )
  public boolean method4704(String string_1) {
    string_1 = string_1.toLowerCase();
    int i_2 = this.field3163.method3967(class277.method5240(string_1));
    return this.method4707(i_2);
  }

  @ObfuscatedName("ak")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1722462563"
  )
  public void method4648(String string_1) {
    string_1 = string_1.toLowerCase();
    int i_2 = this.field3163.method3967(class277.method5240(string_1));
    if (i_2 >= 0) {
      this.vmethod4721(i_2);
    }
  }

  @ObfuscatedName("as")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "17959811"
  )
  public int method4687(String string_1) {
    string_1 = string_1.toLowerCase();
    int i_2 = this.field3163.method3967(class277.method5240(string_1));
    return this.vmethod4727(i_2);
  }

}
