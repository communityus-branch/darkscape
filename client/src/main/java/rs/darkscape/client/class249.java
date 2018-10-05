package rs.darkscape.client;

import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class249 extends AbstractPack {

  @ObfuscatedName("dl")
  @ObfuscatedGetter(
      intValue = 194552531
  )
  static int field3192;
  @ObfuscatedName("ab")
  static CRC32 field3189 = new CRC32();
  @ObfuscatedName("v")
  volatile boolean field3188 = false;
  @ObfuscatedName("af")
  boolean field3191 = false;
  @ObfuscatedName("as")
  @ObfuscatedGetter(
      intValue = 856504919
  )
  int field3194 = -1;
  @ObfuscatedName("d")
  @ObfuscatedSignature(
      signature = "Lff;"
  )
  StorageVolume archives;
  @ObfuscatedName("h")
  @ObfuscatedSignature(
      signature = "Lff;"
  )
  StorageVolume manifests;
  @ObfuscatedName("c")
  @ObfuscatedGetter(
      intValue = -1684100553
  )
  int id;
  @ObfuscatedName("aw")
  @ObfuscatedGetter(
      intValue = 1809929257
  )
  int releaseChecksum;
  @ObfuscatedName("ak")
  @ObfuscatedGetter(
      intValue = 439984845
  )
  int releaseVersion;
  @ObfuscatedName("ah")
  volatile boolean[] field3185;

  @ObfuscatedSignature(
      signature = "(Lff;Lff;IZZZ)V"
  )
  public class249(StorageVolume archives, StorageVolume manifests, int i_3, boolean deleteGroups,
                  boolean deleteChildren, boolean bool_6) {
    super(deleteGroups, deleteChildren);
    this.archives = archives;
    this.manifests = manifests;
    this.id = i_3;
    this.field3191 = bool_6;
    int id = this.id;
    if (class185.releaseManifest != null) {
      class185.releaseManifest.offset = id * 8 + 5;
      int i_9 = class185.releaseManifest.getInt32();
      int i_10 = class185.releaseManifest.getInt32();
      this.method4723(i_9, i_10);
    } else {
      class22.request((class249) null, 255, 255, 0, (byte) 0, true);
      AssetService.field3201[id] = this;
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-114"
  )
  void vmethod4721(int i_1) {
    class54.method1021(this.id, i_1);
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "35"
  )
  int vmethod4727(int i_1) {
    if (super.field3165[i_1] != null) {
      return 100;
    } else if (this.field3185[i_1]) {
      return 100;
    } else {
      int i_3 = this.id;
      long long_4 = (long) ((i_3 << 16) + i_1);
      int i_2;
      if (AssetService.currentRequest != null && long_4 == AssetService.currentRequest.hashKey) {
        i_2 = class301.buffer.offset * 99 / (class301.buffer.bytes.length
            - AssetService.currentRequest.trailerLength) + 1;
      } else {
        i_2 = 0;
      }

      return i_2;
    }
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "10"
  )
  void vmethod4722(int i_1) {
    if (this.archives != null && this.field3185 != null && this.field3185[i_1]) {
      StorageVolume class162_2 = this.archives;
      byte[] bytes_4 = null;
      Deque class205_5 = class248.field3182;
      synchronized (class248.field3182) {
        for (class245 class245_6 = (class245) class248.field3182.getFirst(); class245_6 != null;
            class245_6 = (class245) class248.field3182.getNext()) {
          if ((long) i_1 == class245_6.hashKey && class162_2 == class245_6.field3151
              && class245_6.field3150 == 0) {
            bytes_4 = class245_6.field3149;
            break;
          }
        }
      }

      if (bytes_4 != null) {
        this.method4746(class162_2, i_1, bytes_4, true);
      } else {
        byte[] bytes_9 = class162_2.method3372(i_1);
        this.method4746(class162_2, i_1, bytes_9, true);
      }
    } else {
      class22.request(this, this.id, i_1, super.checksums[i_1], (byte) 2, true);
    }

  }

  @ObfuscatedName("cn")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "75"
  )
  public int method4720() {
    if (this.field3188) {
      return 100;
    } else if (super.field3165 != null) {
      return 99;
    } else {
      int i_2 = this.id;
      long long_3 = (long) (i_2 + 16711680);
      int i_1;
      if (AssetService.currentRequest != null && long_3 == AssetService.currentRequest.hashKey) {
        i_1 = class301.buffer.offset * 99 / (class301.buffer.bytes.length
            - AssetService.currentRequest.trailerLength) + 1;
      } else {
        i_1 = 0;
      }

      int i_5 = i_1;
      if (i_1 >= 100) {
        i_5 = 99;
      }

      return i_5;
    }
  }

  @ObfuscatedName("cp")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1996421048"
  )
  public void method4723(int checksum, int version) {
    this.releaseChecksum = checksum;
    this.releaseVersion = version;
    if (this.manifests != null) {
      int id = this.id;
      StorageVolume class162_4 = this.manifests;
      byte[] bytes_6 = null;
      synchronized (class248.field3182) {
        for (class245 class245_8 = (class245) class248.field3182.getFirst(); class245_8 != null;
            class245_8 = (class245) class248.field3182.getNext()) {
          if ((long) id == class245_8.hashKey && class162_4 == class245_8.field3151
              && class245_8.field3150 == 0) {
            bytes_6 = class245_8.field3149;
            break;
          }
        }
      }

      if (bytes_6 != null) {
        this.method4746(class162_4, id, bytes_6, true);
      } else {
        byte[] bytes_11 = class162_4.method3372(id);
        this.method4746(class162_4, id, bytes_11, true);
      }
    } else {
      class22.request(this, 255, this.id, this.releaseChecksum, (byte) 0, true);
    }

  }

  @ObfuscatedName("cz")
  @ObfuscatedSignature(
      signature = "(I[BZZI)V",
      garbageValue = "-1745310697"
  )
  public void method4729(int i_1, byte[] bytes_2, boolean bool_3, boolean bool_4) {
    if (bool_3) {
      if (this.field3188) {
        throw new RuntimeException();
      }

      if (this.manifests != null) {
        int i_5 = this.id;
        StorageVolume class162_6 = this.manifests;
        class245 class245_7 = new class245();
        class245_7.field3150 = 0;
        class245_7.hashKey = (long) i_5;
        class245_7.field3149 = bytes_2;
        class245_7.field3151 = class162_6;
        Deque class205_8 = class248.field3182;
        synchronized (class248.field3182) {
          class248.field3182.addLast(class245_7);
        }

        PacketBuffer.method3848();
      }

      this.decode(bytes_2);
      this.method4726();
    } else {
      bytes_2[bytes_2.length - 2] = (byte) (super.versions[i_1] >> 8);
      bytes_2[bytes_2.length - 1] = (byte) super.versions[i_1];
      if (this.archives != null) {
        StorageVolume class162_11 = this.archives;
        class245 class245_14 = new class245();
        class245_14.field3150 = 0;
        class245_14.hashKey = (long) i_1;
        class245_14.field3149 = bytes_2;
        class245_14.field3151 = class162_11;
        Deque class205_15 = class248.field3182;
        synchronized (class248.field3182) {
          class248.field3182.addLast(class245_14);
        }

        PacketBuffer.method3848();
        this.field3185[i_1] = true;
      }

      if (bool_4) {
        super.field3165[i_1] = Temp.method3324(bytes_2, false);
      }
    }

  }

  @ObfuscatedName("ck")
  @ObfuscatedSignature(
      signature = "(Lff;I[BZB)V",
      garbageValue = "-91"
  )
  void method4746(StorageVolume class162_1, int i_2, byte[] bytes_3, boolean bool_4) {
    int i_5;
    if (class162_1 == this.manifests) {
      if (this.field3188) {
        throw new RuntimeException();
      } else if (bytes_3 == null) {
        class22.request(this, 255, this.id, this.releaseChecksum, (byte) 0, true);
      } else {
        field3189.reset();
        field3189.update(bytes_3, 0, bytes_3.length);
        i_5 = (int) field3189.getValue();
        if (i_5 != this.releaseChecksum) {
          class22.request(this, 255, this.id, this.releaseChecksum, (byte) 0, true);
        } else {
          Buffer class182_9 = new Buffer(class47.unpack(bytes_3));
          int i_7 = class182_9.getUInt8();
          if (i_7 != 5 && i_7 != 6) {
            throw new RuntimeException(i_7 + "," + this.id + "," + i_2);
          } else {
            int i_8 = 0;
            if (i_7 >= 6) {
              i_8 = class182_9.getInt32();
            }

            if (i_8 != this.releaseVersion) {
              class22.request(this, 255, this.id, this.releaseChecksum, (byte) 0, true);
            } else {
              this.decode(bytes_3);
              this.method4726();
            }
          }
        }
      }
    } else {
      if (!bool_4 && i_2 == this.field3194) {
        this.field3188 = true;
      }

      if (bytes_3 != null && bytes_3.length > 2) {
        field3189.reset();
        field3189.update(bytes_3, 0, bytes_3.length - 2);
        i_5 = (int) field3189.getValue();
        int i_6 =
            ((bytes_3[bytes_3.length - 2] & 0xff) << 8) + (bytes_3[bytes_3.length - 1] & 0xff);
        if (i_5 == super.checksums[i_2] && i_6 == super.versions[i_2]) {
          this.field3185[i_2] = true;
          if (bool_4) {
            super.field3165[i_2] = Temp.method3324(bytes_3, false);
          }

        } else {
          this.field3185[i_2] = false;
          if (this.field3191 || bool_4) {
            class22.request(this, this.id, i_2, super.checksums[i_2], (byte) 2, bool_4);
          }

        }
      } else {
        this.field3185[i_2] = false;
        if (this.field3191 || bool_4) {
          class22.request(this, this.id, i_2, super.checksums[i_2], (byte) 2, bool_4);
        }

      }
    }
  }

  @ObfuscatedName("cu")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-160763890"
  )
  void method4726() {
    this.field3185 = new boolean[super.field3165.length];

    int i_1;
    for (i_1 = 0; i_1 < this.field3185.length; i_1++) {
      this.field3185[i_1] = false;
    }

    if (this.archives == null) {
      this.field3188 = true;
    } else {
      this.field3194 = -1;

      for (i_1 = 0; i_1 < this.field3185.length; i_1++) {
        if (super.groupSizes[i_1] > 0) {
          StorageVolume class162_2 = this.archives;
          class245 class245_4 = new class245();
          class245_4.field3150 = 1;
          class245_4.hashKey = (long) i_1;
          class245_4.field3151 = class162_2;
          class245_4.field3152 = this;
          Deque class205_5 = class248.field3182;
          synchronized (class248.field3182) {
            class248.field3182.addLast(class245_4);
          }

          PacketBuffer.method3848();
          this.field3194 = i_1;
        }
      }

      if (this.field3194 == -1) {
        this.field3188 = true;
      }

    }
  }

  @ObfuscatedName("cm")
  @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "270216094"
  )
  public boolean method4725(int i_1) {
    return this.field3185[i_1];
  }

  @ObfuscatedName("dh")
  @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1526395619"
  )
  public boolean method4734(int i_1) {
    return this.method4668(i_1) != null;
  }

  @ObfuscatedName("do")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1226405037"
  )
  public int method4755() {
    int i_1 = 0;
    int i_2 = 0;

    int i_3;
    for (i_3 = 0; i_3 < super.field3165.length; i_3++) {
      if (super.groupSizes[i_3] > 0) {
        i_1 += 100;
        i_2 += this.vmethod4727(i_3);
      }
    }

    if (i_1 == 0) {
      return 100;
    } else {
      i_3 = i_2 * 100 / i_1;
      return i_3;
    }
  }

}
