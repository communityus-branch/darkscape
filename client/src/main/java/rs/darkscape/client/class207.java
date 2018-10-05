package rs.darkscape.client;

import java.lang.ref.SoftReference;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gf")
public class class207 extends class212 {

  @ObfuscatedName("z")
  SoftReference field2429;

  class207(Object object_1, int i_2) {
    super(i_2);
    this.field2429 = new SoftReference(object_1);
  }

  @ObfuscatedName("z")
  Object vmethod4137() {
    return this.field2429.get();
  }

  @ObfuscatedName("w")
  boolean vmethod4136() {
    return true;
  }

}
