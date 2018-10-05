package rs.darkscape.client;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public final class SeekableFile {

  @ObfuscatedName("z")
  RandomAccessFile file;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      longValue = 274542586179813579L
  )
  long maximumLength;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      longValue = -2383434283230612419L
  )
  long position;

  public SeekableFile(File file_1, String string_2, long long_3) throws IOException {
    if (long_3 == -1L) {
      long_3 = Long.MAX_VALUE;
    }

    if (file_1.length() >= long_3) {
      file_1.delete();
    }

    this.file = new RandomAccessFile(file_1, string_2);
    this.maximumLength = long_3;
    this.position = 0L;
    int i_5 = this.file.read();
    if (i_5 != -1 && !string_2.equals("r")) {
      this.file.seek(0L);
      this.file.write(i_5);
    }

    this.file.seek(0L);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(IB)Ljj;",
      garbageValue = "0"
  )
  public static class268 method2527(int i_0) {
    class268 class268_1 = (class268) class268.field3371.method3989((long) i_0);
    if (class268_1 != null) {
      return class268_1;
    } else {
      byte[] bytes_2 = class268.field3377.method4625(6, i_0);
      class268_1 = new class268();
      class268_1.field3376 = i_0;
      if (bytes_2 != null) {
        class268_1.method5026(new Buffer(bytes_2));
      }

      class268_1.method5025();
      if (class268_1.field3398) {
        class268_1.field3386 = 0;
        class268_1.field3404 = false;
      }

      class268.field3371.method3983(class268_1, (long) i_0);
      return class268_1;
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/Class;",
      garbageValue = "471719686"
  )
  static Class method2528(String string_0) throws ClassNotFoundException {
    return string_0.equals("B") ? Byte.TYPE : (string_0.equals("I") ? Integer.TYPE
        : (string_0.equals("S") ? Short.TYPE : (string_0.equals("J") ? Long.TYPE
            : (string_0.equals("Z") ? Boolean.TYPE : (string_0.equals("F") ? Float.TYPE
                : (string_0.equals("D") ? Double.TYPE : (string_0.equals("C") ? Character.TYPE
                    : (string_0.equals("void") ? Void.TYPE : Class.forName(string_0)))))))));
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1058679148"
  )
  static final int method2511(int i_0, int i_1) {
    int i_2 = i_0 + i_1 * 57;
    i_2 ^= i_2 << 13;
    int i_3 = (i_2 * i_2 * 15731 + 789221) * i_2 + 1376312589 & 0x7fffffff;
    return i_3 >> 19 & 0xff;
  }

  @ObfuscatedName("z")
  final void seek(long pos) throws IOException {
    this.file.seek(pos);
    this.position = pos;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "2068014538"
  )
  public final void write(byte[] bytes_1, int i_2, int i_3) throws IOException {
    if ((long) i_3 + this.position > this.maximumLength) {
      this.file.seek(1L + this.maximumLength);
      this.file.write(1);
      throw new EOFException();
    } else {
      this.file.write(bytes_1, i_2, i_3);
      this.position += (long) i_3;
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "746943081"
  )
  public final void close() throws IOException {
    this.close(false);
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "122"
  )
  public final void close(boolean sync) throws IOException {
    if (this.file != null) {
      if (sync) {
        try {
          this.file.getFD().sync();
        } catch (SyncFailedException ignored) {
        }
      }

      this.file.close();
      this.file = null;
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-1046460358"
  )
  public final long length() throws IOException {
    return this.file.length();
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-210430337"
  )
  public final int read(byte[] src, int off, int len) throws IOException {
    int i_4 = this.file.read(src, off, len);
    if (i_4 > 0) {
      this.position += (long) i_4;
    }

    return i_4;
  }

  protected void finalize() throws Throwable {
    if (this.file != null) {
      System.out.println();
      this.close();
    }

  }

}
