package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class290 extends class285 {

  @ObfuscatedName("dw")
  @ObfuscatedGetter(
      intValue = -2042738183
  )
  static int field3636;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Llm;"
  )
  final class322 field3635;
  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "Lhp;"
  )
  public class208 field3639 = new class208();
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -720372311
  )
  int field3637 = 1;

  @ObfuscatedSignature(
      signature = "(Llm;)V"
  )
  public class290(class322 class322_1) {
    super(400);
    this.field3635 = class322_1;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)Ljx;",
      garbageValue = "2139940378"
  )
  class282 vmethod5461() {
    return new class292();
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(II)[Ljx;",
      garbageValue = "828432673"
  )
  class282[] vmethod5462(int i_1) {
    return new class292[i_1];
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(Lkm;ZI)Z",
      garbageValue = "1240127676"
  )
  public boolean method5423(class291 class291_1, boolean bool_2) {
    class292 class292_3 = (class292) this.method5330(class291_1);
    return class292_3 == null ? false : !bool_2 || class292_3.field3628 != 0;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(Lgk;II)V",
      garbageValue = "1284102001"
  )
  public void method5424(Buffer class182_1, int i_2) {
    while (true) {
      if (class182_1.offset < i_2) {
        boolean bool_3 = class182_1.getUInt8() == 1;
        class291 class291_4 = new class291(class182_1.method3738(), this.field3635);
        class291 class291_5 = new class291(class182_1.method3738(), this.field3635);
        int i_6 = class182_1.getUInt16();
        int i_7 = class182_1.getUInt8();
        int i_8 = class182_1.getUInt8();
        boolean bool_9 = (i_8 & 0x2) != 0;
        boolean bool_10 = (i_8 & 0x1) != 0;
        if (i_6 > 0) {
          class182_1.method3738();
          class182_1.getUInt8();
          class182_1.getInt32();
        }

        class182_1.method3738();
        if (class291_4 != null && class291_4.method5441()) {
          class292 class292_11 = (class292) this.method5331(class291_4);
          if (bool_3) {
            class292 class292_12 = (class292) this.method5331(class291_5);
            if (class292_12 != null && class292_12 != class292_11) {
              if (class292_11 != null) {
                this.method5334(class292_12);
              } else {
                class292_11 = class292_12;
              }
            }
          }

          if (class292_11 != null) {
            this.method5338(class292_11, class291_4, class291_5);
            if (i_6 != class292_11.field3628) {
              boolean bool_14 = true;

              for (class294 class294_13 = (class294) this.field3639.method4111();
                  class294_13 != null; class294_13 = (class294) this.field3639.method4114()) {
                if (class294_13.field3662.equals(class291_4)) {
                  if (i_6 != 0 && class294_13.field3664 == 0) {
                    class294_13.method4121();
                    bool_14 = false;
                  } else if (i_6 == 0 && class294_13.field3664 != 0) {
                    class294_13.method4121();
                    bool_14 = false;
                  }
                }
              }

              if (bool_14) {
                this.field3639.method4112(new class294(class291_4, i_6));
              }
            }
          } else {
            if (this.method5327() >= 400) {
              continue;
            }

            class292_11 = (class292) this.method5335(class291_4, class291_5);
          }

          if (i_6 != class292_11.field3628) {
            class292_11.field3627 = ++this.field3637 - 1;
            if (class292_11.field3628 == -1 && i_6 == 0) {
              class292_11.field3627 = -(class292_11.field3627 * -1772374531) * -745943211;
            }

            class292_11.field3628 = i_6;
          }

          class292_11.field3629 = i_7;
          class292_11.field3648 = bool_9;
          class292_11.field3650 = bool_10;
          continue;
        }

        throw new IllegalStateException();
      }

      this.method5337();
      return;
    }
  }

}
