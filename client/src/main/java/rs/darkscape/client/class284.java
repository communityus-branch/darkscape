package rs.darkscape.client;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class284 extends class285 {

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Llm;"
  )
  final class322 field3615;

  @ObfuscatedSignature(
      signature = "(Llm;)V"
  )
  public class284(class322 class322_1) {
    super(400);
    this.field3615 = class322_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([BI)Lll;",
      garbageValue = "105126678"
  )
  public static final class318 method5324(byte[] bytes_0) {
    BufferedImage bufferedimage_1 = null;

    try {
      bufferedimage_1 = ImageIO.read(new ByteArrayInputStream(bytes_0));
      int i_2 = bufferedimage_1.getWidth();
      int i_3 = bufferedimage_1.getHeight();
      int[] ints_4 = new int[i_2 * i_3];
      PixelGrabber pixelgrabber_5 = new PixelGrabber(bufferedimage_1, 0, 0, i_2, i_3, ints_4, 0,
                                                     i_2);
      pixelgrabber_5.grabPixels();
      return new class318(ints_4, i_2, i_3);
    } catch (IOException ignored) {
    } catch (InterruptedException ignored) {
    }

    return new class318(0, 0);
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
  )
  class282 vmethod5461() {
    return new class286();
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
  )
  class282[] vmethod5462(int i_1) {
    return new class286[i_1];
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "777447956"
  )
  public void method5317(Buffer class182_1, int i_2) {
    while (true) {
      if (class182_1.offset < i_2) {
        int i_3 = class182_1.getUInt8();
        boolean bool_4 = (i_3 & 0x1) == 1;
        class291 class291_5 = new class291(class182_1.method3738(), this.field3615);
        class291 class291_6 = new class291(class182_1.method3738(), this.field3615);
        class182_1.method3738();
        if (class291_5 != null && class291_5.method5441()) {
          class286 class286_7 = (class286) this.method5331(class291_5);
          if (bool_4) {
            class286 class286_8 = (class286) this.method5331(class291_6);
            if (class286_8 != null && class286_8 != class286_7) {
              if (class286_7 != null) {
                this.method5334(class286_8);
              } else {
                class286_7 = class286_8;
              }
            }
          }

          if (class286_7 != null) {
            this.method5338(class286_7, class291_5, class291_6);
            continue;
          }

          if (this.method5327() < 400) {
            int i_9 = this.method5327();
            class286_7 = (class286) this.method5335(class291_5, class291_6);
            class286_7.field3624 = i_9;
          }
          continue;
        }

        throw new IllegalStateException();
      }

      return;
    }
  }

}
