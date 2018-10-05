package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class248 implements Runnable {

  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = -580590333
  )
  public static int field3179 = 0;
  @ObfuscatedName("l")
  public static Object field3184 = new Object();
  @ObfuscatedName("u")
  static Thread field3183;
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  static Deque field3182 = new Deque();
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  static Deque field3180 = new Deque();

  public void run() {
    try {
      while (true) {
        Deque class205_2 = field3182;
        class245 class245_1;
        synchronized (field3182) {
          class245_1 = (class245) field3182.getFirst();
        }

        Object object_14;
        if (class245_1 != null) {
          if (class245_1.field3150 == 0) {
            class245_1.field3151.method3371((int) class245_1.hashKey, class245_1.field3149,
                                            class245_1.field3149.length);
            class205_2 = field3182;
            synchronized (field3182) {
              class245_1.unlinkNode();
            }
          } else if (class245_1.field3150 == 1) {
            class245_1.field3149 = class245_1.field3151.method3372((int) class245_1.hashKey);
            class205_2 = field3182;
            synchronized (field3182) {
              field3180.addLast(class245_1);
            }
          }

          object_14 = field3184;
          synchronized (field3184) {
            if (field3179 <= 1) {
              field3179 = 0;
              field3184.notifyAll();
              return;
            }

            field3179 = 600;
          }
        } else {
          class63.method1539(100L);
          object_14 = field3184;
          synchronized (field3184) {
            if (field3179 <= 1) {
              field3179 = 0;
              field3184.notifyAll();
              return;
            }

            --field3179;
          }
        }
      }
    } catch (Exception exception_13) {
      class5.method65((String) null, exception_13);
    }
  }

}
