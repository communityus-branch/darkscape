package rs.darkscape.client;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public class class296 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  AbstractPack field3681;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lir;"
  )
  AbstractPack field3679;
  @ObfuscatedName("s")
  HashMap field3680;

  @ObfuscatedSignature(
      signature = "(Lir;Lir;)V"
  )
  public class296(AbstractPack class247_1, AbstractPack class247_2) {
    this.field3681 = class247_1;
    this.field3679 = class247_2;
    this.field3680 = new HashMap();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "([Lkc;B)Ljava/util/HashMap;",
      garbageValue = "-33"
  )
  public HashMap method5504(class295[] arr_1) {
    HashMap hashmap_2 = new HashMap();
    class295[] arr_3 = arr_1;

    for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
      class295 class295_5 = arr_3[i_4];
      if (this.field3680.containsKey(class295_5)) {
        hashmap_2.put(class295_5, this.field3680.get(class295_5));
      } else {
        AbstractPack class247_7 = this.field3681;
        AbstractPack class247_8 = this.field3679;
        String string_9 = class295_5.field3666;
        int i_10 = class247_7.method4642(string_9);
        int i_11 = class247_7.method4643(i_10, "");
        class298 class298_6 = class58.method1058(class247_7, class247_8, i_10, i_11);
        if (class298_6 != null) {
          this.field3680.put(class295_5, class298_6);
          hashmap_2.put(class295_5, class298_6);
        }
      }
    }

    return hashmap_2;
  }

}
