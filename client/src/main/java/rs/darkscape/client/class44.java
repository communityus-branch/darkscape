package rs.darkscape.client;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class44 extends class95 {

  @ObfuscatedName("z")
  AudioFormat field373;
  @ObfuscatedName("l")
  byte[] field375;
  @ObfuscatedName("w")
  SourceDataLine field374;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -1571871947
  )
  int field372;

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2015063069"
  )
  protected void vmethod2176() {
    this.field373 = new AudioFormat((float) class95.field1300, 16, class95.field1295 ? 2 : 1, true,
                                    false);
    this.field375 = new byte[256 << (class95.field1295 ? 2 : 1)];
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "255"
  )
  protected void vmethod2163(int i_1) throws LineUnavailableException {
    try {
      Info dataline$info_2 = new Info(SourceDataLine.class, this.field373,
                                      i_1 << (class95.field1295 ? 2 : 1));
      this.field374 = (SourceDataLine) AudioSystem.getLine(dataline$info_2);
      this.field374.open();
      this.field374.start();
      this.field372 = i_1;
    } catch (LineUnavailableException lineunavailableexception_5) {
      int i_4 = (i_1 >>> 1 & 0x55555555) + (i_1 & 0x55555555);
      i_4 = (i_4 >>> 2 & 0x33333333) + (i_4 & 0x33333333);
      i_4 = (i_4 >>> 4) + i_4 & 0xf0f0f0f;
      i_4 += i_4 >>> 8;
      i_4 += i_4 >>> 16;
      int i_3 = i_4 & 0xff;
      if (i_3 != 1) {
        this.vmethod2163(class146.method3193(i_1));
      } else {
        this.field374 = null;
        throw lineunavailableexception_5;
      }
    }
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "83"
  )
  protected int vmethod2153() {
    return this.field372 - (this.field374.available() >> (class95.field1295 ? 2 : 1));
  }

  @ObfuscatedName("l")
  protected void vmethod2154() {
    int i_1 = 256;
    if (class95.field1295) {
      i_1 <<= 1;
    }

    for (int i_2 = 0; i_2 < i_1; i_2++) {
      int i_3 = super.field1299[i_2];
      if ((i_3 + 8388608 & ~0xffffff) != 0) {
        i_3 = 0x7fffff ^ i_3 >> 31;
      }

      this.field375[i_2 * 2] = (byte) (i_3 >> 8);
      this.field375[i_2 * 2 + 1] = (byte) (i_3 >> 16);
    }

    this.field374.write(this.field375, 0, i_1 << 1);
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1323448603"
  )
  protected void vmethod2155() {
    if (this.field374 != null) {
      this.field374.close();
      this.field374 = null;
    }

  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2047206903"
  )
  protected void vmethod2156() {
    this.field374.flush();
  }

}
