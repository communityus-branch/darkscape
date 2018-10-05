package rs.darkscape.client;

import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class BufferedFile {

  @ObfuscatedName("gb")
  @ObfuscatedGetter(
      intValue = -616699681
  )
  static int field1431;
  @ObfuscatedName("gx")
  @ObfuscatedGetter(
      intValue = -1361811045
  )
  static int field1428;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      longValue = -3424543290675881475L
  )
  long field1417 = -1L;
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      longValue = 3274252712356881353L
  )
  long field1420 = -1L;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 2034614507
  )
  int field1426 = 0;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Ldv;"
  )
  SeekableFile field1425;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      longValue = 2659913085887693439L
  )
  long field1422;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      longValue = -1520059601555540455L
  )
  long field1429;
  @ObfuscatedName("w")
  byte[] field1418;
  @ObfuscatedName("u")
  byte[] field1423;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      longValue = 3254553962279722903L
  )
  long field1424;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      longValue = -4630283547641529923L
  )
  long field1427;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -1746214469
  )
  int field1421;

  @ObfuscatedSignature(
      signature = "(Ldv;II)V"
  )
  public BufferedFile(SeekableFile class110_1, int i_2, int i_3) throws IOException {
    this.field1425 = class110_1;
    this.field1429 = this.field1422 = class110_1.length();
    this.field1418 = new byte[i_2];
    this.field1423 = new byte[i_3];
    this.field1424 = 0L;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Lbb;Lbb;IZIZI)I",
      garbageValue = "623148827"
  )
  static int method2503(class65 class65_0, class65 class65_1, int i_2, boolean bool_3, int i_4,
                        boolean bool_5) {
    int i_6 = class26.method428(class65_0, class65_1, i_2, bool_3);
    if (i_6 != 0) {
      return bool_3 ? -i_6 : i_6;
    } else if (i_4 == -1) {
      return 0;
    } else {
      int i_7 = class26.method428(class65_0, class65_1, i_4, bool_5);
      return bool_5 ? -i_7 : i_7;
    }
  }

  @ObfuscatedName("q")
  public static int method2484(long long_0) {
    return (int) (long_0 >>> 7 & 0x7fL);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2129971155"
  )
  public void method2493() throws IOException {
    this.method2482();
    this.field1425.close();
  }

  @ObfuscatedName("w")
  public void method2476(long long_1) throws IOException {
    if (long_1 < 0L) {
      throw new IOException("");
    } else {
      this.field1424 = long_1;
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "711180324"
  )
  public long method2486() {
    return this.field1429;
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1031181832"
  )
  public void method2478(byte[] bytes_1) throws IOException {
    this.method2479(bytes_1, 0, bytes_1.length);
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1873838718"
  )
  public void method2479(byte[] bytes_1, int i_2, int i_3) throws IOException {
    try {
      if (i_3 + i_2 > bytes_1.length) {
        throw new ArrayIndexOutOfBoundsException(i_3 + i_2 - bytes_1.length);
      }

      if (this.field1420 != -1L && this.field1424 >= this.field1420
          && this.field1424 + (long) i_3 <= (long) this.field1426 + this.field1420) {
        System
            .arraycopy(this.field1423, (int) (this.field1424 - this.field1420), bytes_1, i_2, i_3);
        this.field1424 += (long) i_3;
        return;
      }

      long long_4 = this.field1424;
      int i_7 = i_3;
      int i_8;
      if (this.field1424 >= this.field1417
          && this.field1424 < (long) this.field1421 + this.field1417) {
        i_8 = (int) ((long) this.field1421 - (this.field1424 - this.field1417));
        if (i_8 > i_3) {
          i_8 = i_3;
        }

        System
            .arraycopy(this.field1418, (int) (this.field1424 - this.field1417), bytes_1, i_2, i_8);
        this.field1424 += (long) i_8;
        i_2 += i_8;
        i_3 -= i_8;
      }

      if (i_3 > this.field1418.length) {
        this.field1425.seek(this.field1424);

        for (this.field1427 = this.field1424; i_3 > 0; i_3 -= i_8) {
          i_8 = this.field1425.read(bytes_1, i_2, i_3);
          if (i_8 == -1) {
            break;
          }

          this.field1427 += (long) i_8;
          this.field1424 += (long) i_8;
          i_2 += i_8;
        }
      } else if (i_3 > 0) {
        this.method2480();
        i_8 = i_3;
        if (i_3 > this.field1421) {
          i_8 = this.field1421;
        }

        System.arraycopy(this.field1418, 0, bytes_1, i_2, i_8);
        i_2 += i_8;
        i_3 -= i_8;
        this.field1424 += (long) i_8;
      }

      if (this.field1420 != -1L) {
        if (this.field1420 > this.field1424 && i_3 > 0) {
          i_8 = i_2 + (int) (this.field1420 - this.field1424);
          if (i_8 > i_3 + i_2) {
            i_8 = i_3 + i_2;
          }

          while (i_2 < i_8) {
            bytes_1[i_2++] = 0;
            --i_3;
            ++this.field1424;
          }
        }

        long long_13 = -1L;
        long long_10 = -1L;
        if (this.field1420 >= long_4 && this.field1420 < long_4 + (long) i_7) {
          long_13 = this.field1420;
        } else if (long_4 >= this.field1420 && long_4 < this.field1420 + (long) this.field1426) {
          long_13 = long_4;
        }

        if ((long) this.field1426 + this.field1420 > long_4
            && this.field1420 + (long) this.field1426 <= long_4 + (long) i_7) {
          long_10 = this.field1420 + (long) this.field1426;
        } else if ((long) i_7 + long_4 > this.field1420
            && long_4 + (long) i_7 <= (long) this.field1426 + this.field1420) {
          long_10 = (long) i_7 + long_4;
        }

        if (long_13 > -1L && long_10 > long_13) {
          int i_12 = (int) (long_10 - long_13);
          System.arraycopy(this.field1423, (int) (long_13 - this.field1420), bytes_1,
                           (int) (long_13 - long_4) + i_2, i_12);
          if (long_10 > this.field1424) {
            i_3 = (int) ((long) i_3 - (long_10 - this.field1424));
            this.field1424 = long_10;
          }
        }
      }
    } catch (IOException ioexception_16) {
      this.field1427 = -1L;
      throw ioexception_16;
    }

    if (i_3 > 0) {
      throw new EOFException();
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1728368269"
  )
  void method2480() throws IOException {
    this.field1421 = 0;
    if (this.field1427 != this.field1424) {
      this.field1425.seek(this.field1424);
      this.field1427 = this.field1424;
    }

    int i_1;
    for (this.field1417 = this.field1424; this.field1421 < this.field1418.length;
        this.field1421 += i_1) {
      i_1 = this.field1425
          .read(this.field1418, this.field1421, this.field1418.length - this.field1421);
      if (i_1 == -1) {
        break;
      }

      this.field1427 += (long) i_1;
    }

  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1219631347"
  )
  public void method2481(byte[] bytes_1, int i_2, int i_3) throws IOException {
    try {
      if ((long) i_3 + this.field1424 > this.field1429) {
        this.field1429 = (long) i_3 + this.field1424;
      }

      if (this.field1420 != -1L && (this.field1424 < this.field1420
          || this.field1424 > this.field1420 + (long) this.field1426)) {
        this.method2482();
      }

      if (this.field1420 != -1L
          && this.field1424 + (long) i_3 > (long) this.field1423.length + this.field1420) {
        int i_4 = (int) ((long) this.field1423.length - (this.field1424 - this.field1420));
        System
            .arraycopy(bytes_1, i_2, this.field1423, (int) (this.field1424 - this.field1420), i_4);
        this.field1424 += (long) i_4;
        i_2 += i_4;
        i_3 -= i_4;
        this.field1426 = this.field1423.length;
        this.method2482();
      }

      if (i_3 <= this.field1423.length) {
        if (i_3 > 0) {
          if (this.field1420 == -1L) {
            this.field1420 = this.field1424;
          }

          System.arraycopy(bytes_1, i_2, this.field1423, (int) (this.field1424 - this.field1420),
                           i_3);
          this.field1424 += (long) i_3;
          if (this.field1424 - this.field1420 > (long) this.field1426) {
            this.field1426 = (int) (this.field1424 - this.field1420);
          }

        }
      } else {
        if (this.field1427 != this.field1424) {
          this.field1425.seek(this.field1424);
          this.field1427 = this.field1424;
        }

        this.field1425.write(bytes_1, i_2, i_3);
        this.field1427 += (long) i_3;
        if (this.field1427 > this.field1422) {
          this.field1422 = this.field1427;
        }

        long long_9 = -1L;
        long long_6 = -1L;
        if (this.field1424 >= this.field1417
            && this.field1424 < this.field1417 + (long) this.field1421) {
          long_9 = this.field1424;
        } else if (this.field1417 >= this.field1424
            && this.field1417 < this.field1424 + (long) i_3) {
          long_9 = this.field1417;
        }

        if ((long) i_3 + this.field1424 > this.field1417
            && (long) i_3 + this.field1424 <= (long) this.field1421 + this.field1417) {
          long_6 = (long) i_3 + this.field1424;
        } else if ((long) this.field1421 + this.field1417 > this.field1424
            && this.field1417 + (long) this.field1421 <= this.field1424 + (long) i_3) {
          long_6 = (long) this.field1421 + this.field1417;
        }

        if (long_9 > -1L && long_6 > long_9) {
          int i_8 = (int) (long_6 - long_9);
          System.arraycopy(bytes_1, (int) (long_9 + (long) i_2 - this.field1424), this.field1418,
                           (int) (long_9 - this.field1417), i_8);
        }

        this.field1424 += (long) i_3;
      }
    } catch (IOException ioexception_12) {
      this.field1427 = -1L;
      throw ioexception_12;
    }
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-4"
  )
  void method2482() throws IOException {
    if (this.field1420 != -1L) {
      if (this.field1420 != this.field1427) {
        this.field1425.seek(this.field1420);
        this.field1427 = this.field1420;
      }

      this.field1425.write(this.field1423, 0, this.field1426);
      this.field1427 += (long) (this.field1426 * 1776216003) * 2034614507L;
      if (this.field1427 > this.field1422) {
        this.field1422 = this.field1427;
      }

      long long_1 = -1L;
      long long_3 = -1L;
      if (this.field1420 >= this.field1417
          && this.field1420 < this.field1417 + (long) this.field1421) {
        long_1 = this.field1420;
      } else if (this.field1417 >= this.field1420
          && this.field1417 < (long) this.field1426 + this.field1420) {
        long_1 = this.field1417;
      }

      if ((long) this.field1426 + this.field1420 > this.field1417
          && this.field1420 + (long) this.field1426 <= (long) this.field1421 + this.field1417) {
        long_3 = (long) this.field1426 + this.field1420;
      } else if ((long) this.field1421 + this.field1417 > this.field1420
          && (long) this.field1421 + this.field1417 <= (long) this.field1426 + this.field1420) {
        long_3 = (long) this.field1421 + this.field1417;
      }

      if (long_1 > -1L && long_3 > long_1) {
        int i_5 = (int) (long_3 - long_1);
        System.arraycopy(this.field1423, (int) (long_1 - this.field1420), this.field1418,
                         (int) (long_1 - this.field1417), i_5);
      }

      this.field1420 = -1L;
      this.field1426 = 0;
    }

  }

}
