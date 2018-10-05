package rs.darkscape.client;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public final class class42 extends Canvas {

  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 1710290887
  )
  public static int field362;
  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "[[Lhi;"
  )
  public static class230[][] field366;
  @ObfuscatedName("z")
  Component field365;

  class42(Component component_1) {
    this.field365 = component_1;
  }

  public final void update(Graphics graphics_1) {
    this.field365.update(graphics_1);
  }

  public final void paint(Graphics graphics_1) {
    this.field365.paint(graphics_1);
  }

}
