package rs.darkscape.client;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public final class MouseWheelImpl implements MouseWheel, MouseWheelListener {

  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = 853846113
  )
  int field328 = 0;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "1305046280"
  )
  void bind(Component component) {
    component.addMouseWheelListener(this);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "1338502209"
  )
  void method668(Component component_1) {
    component_1.removeMouseWheelListener(this);
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-371619108"
  )
  public synchronized int get() {
    int i_1 = this.field328;
    this.field328 = 0;
    return i_1;
  }

  public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent_1) {
    this.field328 += mousewheelevent_1.getWheelRotation();
  }

}
