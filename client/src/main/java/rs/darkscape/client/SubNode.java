package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class SubNode extends Node {

  @ObfuscatedName("cj")
  @ObfuscatedSignature(
      signature = "Lgw;"
  )
  public SubNode nextSubNode;
  @ObfuscatedName("ci")
  @ObfuscatedSignature(
      signature = "Lgw;"
  )
  public SubNode prevSubNode;
  @ObfuscatedName("cx")
  long subNodeHashKey;

  @ObfuscatedName("cz")
  public void unlinkSubNode() {
    if (this.prevSubNode != null) {
      this.prevSubNode.nextSubNode = this.nextSubNode;
      this.nextSubNode.prevSubNode = this.prevSubNode;
      this.nextSubNode = null;
      this.prevSubNode = null;
    }
  }

}
