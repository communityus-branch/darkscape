package rs.darkscape.client;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public final class class46 extends class315 {

  @ObfuscatedName("w")
  Image field383;
  @ObfuscatedName("z")
  Component field384;

  class46(int i_1, int i_2, Component component_3) {
    super.field3767 = i_1;
    super.field3769 = i_2;
    super.field3768 = new int[i_2 * i_1 + 1];
    DataBufferInt databufferint_4 = new DataBufferInt(super.field3768, super.field3768.length);
    DirectColorModel directcolormodel_5 = new DirectColorModel(32, 16711680, 65280, 255);
    WritableRaster writableraster_6 = Raster.createWritableRaster(
        directcolormodel_5.createCompatibleSampleModel(super.field3767, super.field3769),
        databufferint_4, (Point) null);
    this.field383 = new BufferedImage(directcolormodel_5, writableraster_6, false, new Hashtable());
    this.method751(component_3);
    this.method5808();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;B)V",
      garbageValue = "-102"
  )
  final void method751(Component component_1) {
    this.field384 = component_1;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1986786716"
  )
  public final void vmethod5809(int i_1, int i_2) {
    this.method754(this.field384.getGraphics(), i_1, i_2);
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-661513186"
  )
  public final void vmethod5810(int i_1, int i_2, int i_3, int i_4) {
    this.method755(this.field384.getGraphics(), i_1, i_2, i_3, i_4);
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;III)V",
      garbageValue = "1968187025"
  )
  final void method754(Graphics graphics_1, int i_2, int i_3) {
    try {
      graphics_1.drawImage(this.field383, i_2, i_3, this.field384);
    } catch (Exception exception_5) {
      this.field384.repaint();
    }

  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIIIB)V",
      garbageValue = "1"
  )
  final void method755(Graphics graphics_1, int i_2, int i_3, int i_4, int i_5) {
    try {
      Shape shape_6 = graphics_1.getClip();
      graphics_1.clipRect(i_2, i_3, i_4, i_5);
      graphics_1.drawImage(this.field383, 0, 0, this.field384);
      graphics_1.setClip(shape_6);
    } catch (Exception exception_7) {
      this.field384.repaint();
    }

  }

}
