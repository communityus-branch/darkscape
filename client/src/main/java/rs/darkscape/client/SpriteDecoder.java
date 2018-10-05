package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class SpriteDecoder {

  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 438437561
  )
  static int frameCount;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -2036603219
  )
  static int field3798;
  @ObfuscatedName("q")
  static int[] field3800;
  @ObfuscatedName("k")
  static int[] field3799;
  @ObfuscatedName("x")
  static byte[][] colorMaps;
  @ObfuscatedName("i")
  static int[] colorPalette;

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "42"
  )
  public static void decodeSprite(byte[] bytes) {
    Buffer buffer = new Buffer(bytes);
    buffer.offset = bytes.length - 2;
    frameCount = buffer.getUInt16();
    class7.field45 = new int[frameCount];
    class225.field2562 = new int[frameCount];
    field3800 = new int[frameCount];
    field3799 = new int[frameCount];
    colorMaps = new byte[frameCount][];
    buffer.offset = bytes.length - 7 - frameCount * 8;
    class305.field3729 = buffer.getUInt16();
    field3798 = buffer.getUInt16();
    int i_2 = (buffer.getUInt8() & 0xff) + 1;

    int i_3;
    for (i_3 = 0; i_3 < frameCount; i_3++) {
      class7.field45[i_3] = buffer.getUInt16();
    }

    for (i_3 = 0; i_3 < frameCount; i_3++) {
      class225.field2562[i_3] = buffer.getUInt16();
    }

    for (i_3 = 0; i_3 < frameCount; i_3++) {
      field3800[i_3] = buffer.getUInt16();
    }

    for (i_3 = 0; i_3 < frameCount; i_3++) {
      field3799[i_3] = buffer.getUInt16();
    }

    buffer.offset = bytes.length - 7 - frameCount * 8 - (i_2 - 1) * 3;
    colorPalette = new int[i_2];

    for (int i = 1; i < i_2; i++) {
      colorPalette[i] = buffer.getUInt24();
      if (colorPalette[i] == 0) {
        colorPalette[i] = 1;
      }
    }

    buffer.offset = 0;

    for (int i = 0; i < frameCount; i++) {
      int width = field3800[i];
      int height = field3799[i];
      int len = width * height;
      byte[] colorMap = new byte[len];
      colorMaps[i] = colorMap;
      int encoding = buffer.getUInt8();
      if (encoding == 0) {
        for (int j = 0; j < len; j++) {
          colorMap[j] = buffer.getInt8();
        }
      } else if (encoding == 1) {
        for (int j = 0; j < width; j++) {
          for (int k = 0; k < height; k++) {
            colorMap[j + k * width] = buffer.getInt8();
          }
        }
      }
    }

  }
}
