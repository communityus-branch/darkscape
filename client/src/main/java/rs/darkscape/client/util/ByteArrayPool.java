package rs.darkscape.client.util;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public final class ByteArrayPool {

  @ObfuscatedName("k")
  public static int[] variableLengths;
  @ObfuscatedName("i")
  public static int[] variableLengthPointers;
  @ObfuscatedName("x")
  public static byte[][][] variableLengthStack;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -1482189207
  )
  public static int smallStackPointer = 0;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -2077994379
  )
  public static int mediumStackPointer = 0;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 298568903
  )
  public static int largeStackPointer = 0;
  @ObfuscatedName("l")
  public static byte[][] smallLengthStack = new byte[1000][];
  @ObfuscatedName("u")
  public static byte[][] mediumLengthStack = new byte[250][];
  @ObfuscatedName("q")
  public static byte[][] largeStack = new byte[50][];

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IZI)[B",
      garbageValue = "-2010983682"
  )
  public static synchronized byte[] getByteArray(int len) {
    if (len == 100) {
      if (smallStackPointer > 0) {
        byte[] bytes = smallLengthStack[--smallStackPointer];
        smallLengthStack[smallStackPointer] = null;
        return bytes;
      }
    }

    if (len == 5000) {
      if (mediumStackPointer > 0) {
        byte[] bytes = mediumLengthStack[--mediumStackPointer];
        mediumLengthStack[mediumStackPointer] = null;
        return bytes;
      }
    }

    if (len == 30000) {
      if (largeStackPointer > 0) {
        byte[] bytes = largeStack[--largeStackPointer];
        largeStack[largeStackPointer] = null;
        return bytes;
      }
    }

    if (variableLengthStack != null) {
      for (int i = 0; i < variableLengths.length; i++) {
        if (variableLengths[i] == len) {
          if (variableLengthPointers[i] > 0) {
            byte[] bytes = variableLengthStack[i][--variableLengthPointers[i]];
            variableLengthStack[i][variableLengthPointers[i]] = null;
            return bytes;
          }
        }
      }
    }

    return new byte[len];
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1705135152"
  )
  public static synchronized void pushByteArray(byte[] bytes) {
    if (bytes.length == 100 && smallStackPointer < 1000) {
      smallLengthStack[++smallStackPointer - 1] = bytes;
    } else if (bytes.length == 5000 && mediumStackPointer < 250) {
      mediumLengthStack[++mediumStackPointer - 1] = bytes;
    } else if (bytes.length == 30000 && largeStackPointer < 50) {
      largeStack[++largeStackPointer - 1] = bytes;
    } else {
      if (variableLengthStack == null) {
        return;
      }

      for (int i = 0; i < variableLengths.length; i++) {
        if (bytes.length == variableLengths[i]
            && variableLengthPointers[i] < variableLengthStack[i].length) {
          variableLengthStack[i][variableLengthPointers[i]++] = bytes;
          return;
        }
      }

    }
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([I[II)V",
      garbageValue = "773113121"
  )
  public static void initialize(int[] capacity, int[] arrayLens) {
    if (capacity != null && arrayLens != null) {
      variableLengths = capacity;
      variableLengthPointers = new int[capacity.length];
      variableLengthStack = new byte[capacity.length][][];

      for (int i = 0; i < variableLengths.length; i++) {
        variableLengthStack[i] = new byte[arrayLens[i]][];
      }
    } else {
      variableLengths = null;
      variableLengthPointers = null;
      variableLengthStack = null;
    }
  }
}
