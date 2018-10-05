package rs.darkscape.client;

import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public final class StorageVolume {

  @ObfuscatedName("z")
  static byte[] field2004 = new byte[520];
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Ldy;"
  )
  BufferedFile field2000 = null;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Ldy;"
  )
  BufferedFile field2001 = null;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1445683659
  )
  int field1999 = 65000;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -561550751
  )
  int field2002;

  @ObfuscatedSignature(
      signature = "(ILdy;Ldy;I)V"
  )
  public StorageVolume(int i_1, BufferedFile class109_2, BufferedFile class109_3, int i_4) {
    this.field2002 = i_1;
    this.field2000 = class109_2;
    this.field2001 = class109_3;
    this.field1999 = i_4;
  }

  @ObfuscatedName("gi")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "2"
  )
  static void method3380() {
    if (client.field699) {
      class11.method98(class138.field1876, false);
    }

  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "1936326418"
  )
  public byte[] method3372(int i_1) {
    BufferedFile class109_2 = this.field2000;
    synchronized (this.field2000) {
      try {
        Object obj_10000;
        if (this.field2001.method2486() < (long) (i_1 * 6 + 6)) {
          obj_10000 = null;
          return (byte[]) obj_10000;
        } else {
          this.field2001.method2476((long) (i_1 * 6));
          this.field2001.method2479(field2004, 0, 6);
          int i_3 =
              ((field2004[0] & 0xff) << 16) + (field2004[2] & 0xff) + ((field2004[1] & 0xff) << 8);
          int i_4 =
              (field2004[5] & 0xff) + ((field2004[3] & 0xff) << 16) + ((field2004[4] & 0xff) << 8);
          if (i_3 < 0 || i_3 > this.field1999) {
            obj_10000 = null;
            return (byte[]) obj_10000;
          } else if (i_4 <= 0 || (long) i_4 > this.field2000.method2486() / 520L) {
            obj_10000 = null;
            return (byte[]) obj_10000;
          } else {
            byte[] bytes_5 = new byte[i_3];
            int i_6 = 0;
            int i_7 = 0;

            while (i_6 < i_3) {
              if (i_4 == 0) {
                obj_10000 = null;
                return (byte[]) obj_10000;
              }

              this.field2000.method2476((long) (i_4 * 520));
              int i_8 = i_3 - i_6;
              if (i_8 > 512) {
                i_8 = 512;
              }

              this.field2000.method2479(field2004, 0, i_8 + 8);
              int i_9 = (field2004[1] & 0xff) + ((field2004[0] & 0xff) << 8);
              int i_10 = (field2004[3] & 0xff) + ((field2004[2] & 0xff) << 8);
              int i_11 =
                  ((field2004[5] & 0xff) << 8) + ((field2004[4] & 0xff) << 16) + (field2004[6]
                      & 0xff);
              int i_12 = field2004[7] & 0xff;
              if (i_9 == i_1 && i_7 == i_10 && i_12 == this.field2002) {
                if (i_11 >= 0 && (long) i_11 <= this.field2000.method2486() / 520L) {
                  for (int i_13 = 0; i_13 < i_8; i_13++) {
                    bytes_5[i_6++] = field2004[i_13 + 8];
                  }

                  i_4 = i_11;
                  ++i_7;
                  continue;
                }

                obj_10000 = null;
                return (byte[]) obj_10000;
              }

              obj_10000 = null;
              return (byte[]) obj_10000;
            }

            byte[] bytes_18 = bytes_5;
            return bytes_18;
          }
        }
      } catch (IOException ioexception_16) {
        return null;
      }
    }
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(I[BII)Z",
      garbageValue = "-1888723881"
  )
  public boolean method3371(int i_1, byte[] bytes_2, int i_3) {
    BufferedFile class109_4 = this.field2000;
    synchronized (this.field2000) {
      if (i_3 >= 0 && i_3 <= this.field1999) {
        boolean bool_5 = this.method3375(i_1, bytes_2, i_3, true);
        if (!bool_5) {
          bool_5 = this.method3375(i_1, bytes_2, i_3, false);
        }

        return bool_5;
      } else {
        throw new IllegalArgumentException();
      }
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I[BIZB)Z",
      garbageValue = "20"
  )
  boolean method3375(int i_1, byte[] bytes_2, int i_3, boolean bool_4) {
    BufferedFile class109_5 = this.field2000;
    synchronized (this.field2000) {
      try {
        int i_6;
        boolean bool_10000;
        if (bool_4) {
          if (this.field2001.method2486() < (long) (i_1 * 6 + 6)) {
            bool_10000 = false;
            return bool_10000;
          }

          this.field2001.method2476((long) (i_1 * 6));
          this.field2001.method2479(field2004, 0, 6);
          i_6 =
              (field2004[5] & 0xff) + ((field2004[3] & 0xff) << 16) + ((field2004[4] & 0xff) << 8);
          if (i_6 <= 0 || (long) i_6 > this.field2000.method2486() / 520L) {
            bool_10000 = false;
            return bool_10000;
          }
        } else {
          i_6 = (int) ((this.field2000.method2486() + 519L) / 520L);
          if (i_6 == 0) {
            i_6 = 1;
          }
        }

        field2004[0] = (byte) (i_3 >> 16);
        field2004[1] = (byte) (i_3 >> 8);
        field2004[2] = (byte) i_3;
        field2004[3] = (byte) (i_6 >> 16);
        field2004[4] = (byte) (i_6 >> 8);
        field2004[5] = (byte) i_6;
        this.field2001.method2476((long) (i_1 * 6));
        this.field2001.method2481(field2004, 0, 6);
        int i_7 = 0;
        int i_8 = 0;

        while (true) {
          if (i_7 < i_3) {
            label143:
            {
              int i_9 = 0;
              int i_14;
              if (bool_4) {
                this.field2000.method2476((long) (i_6 * 520));

                try {
                  this.field2000.method2479(field2004, 0, 8);
                } catch (EOFException eofexception_16) {
                  break label143;
                }

                i_14 = (field2004[1] & 0xff) + ((field2004[0] & 0xff) << 8);
                int i_11 = (field2004[3] & 0xff) + ((field2004[2] & 0xff) << 8);
                i_9 = ((field2004[5] & 0xff) << 8) + ((field2004[4] & 0xff) << 16) + (field2004[6]
                    & 0xff);
                int i_12 = field2004[7] & 0xff;
                if (i_14 != i_1 || i_8 != i_11 || i_12 != this.field2002) {
                  bool_10000 = false;
                  return bool_10000;
                }

                if (i_9 < 0 || (long) i_9 > this.field2000.method2486() / 520L) {
                  bool_10000 = false;
                  return bool_10000;
                }
              }

              if (i_9 == 0) {
                bool_4 = false;
                i_9 = (int) ((this.field2000.method2486() + 519L) / 520L);
                if (i_9 == 0) {
                  ++i_9;
                }

                if (i_9 == i_6) {
                  ++i_9;
                }
              }

              if (i_3 - i_7 <= 512) {
                i_9 = 0;
              }

              field2004[0] = (byte) (i_1 >> 8);
              field2004[1] = (byte) i_1;
              field2004[2] = (byte) (i_8 >> 8);
              field2004[3] = (byte) i_8;
              field2004[4] = (byte) (i_9 >> 16);
              field2004[5] = (byte) (i_9 >> 8);
              field2004[6] = (byte) i_9;
              field2004[7] = (byte) this.field2002;
              this.field2000.method2476((long) (i_6 * 520));
              this.field2000.method2481(field2004, 0, 8);
              i_14 = i_3 - i_7;
              if (i_14 > 512) {
                i_14 = 512;
              }

              this.field2000.method2481(bytes_2, i_7, i_14);
              i_7 += i_14;
              i_6 = i_9;
              ++i_8;
              continue;
            }
          }

          bool_10000 = true;
          return bool_10000;
        }
      } catch (IOException ioexception_17) {
        return false;
      }
    }
  }

}
