package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class164 {

  @ObfuscatedName("ap")
  public int[][] field2029;
  @ObfuscatedName("ao")
  @ObfuscatedGetter(
      intValue = 2146339647
  )
  int field2025 = 0;
  @ObfuscatedName("at")
  @ObfuscatedGetter(
      intValue = -1748488477
  )
  int field2026 = 0;
  @ObfuscatedName("ai")
  @ObfuscatedGetter(
      intValue = -229074279
  )
  int field2027;
  @ObfuscatedName("ac")
  @ObfuscatedGetter(
      intValue = 1893638093
  )
  int field2030;

  public class164(int i_1, int i_2) {
    this.field2027 = i_1;
    this.field2030 = i_2;
    this.field2029 = new int[this.field2027][this.field2030];
    this.method3392();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "87"
  )
  public void method3392() {
    for (int i_1 = 0; i_1 < this.field2027; i_1++) {
      for (int i_2 = 0; i_2 < this.field2030; i_2++) {
        if (i_1 != 0 && i_2 != 0 && i_1 < this.field2027 - 5 && i_2 < this.field2030 - 5) {
          this.field2029[i_1][i_2] = 16777216;
        } else {
          this.field2029[i_1][i_2] = 16777215;
        }
      }
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "1912386247"
  )
  public void method3393(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
    i_1 -= this.field2025;
    i_2 -= this.field2026;
    if (i_3 == 0) {
      if (i_4 == 0) {
        this.method3397(i_1, i_2, 128);
        this.method3397(i_1 - 1, i_2, 8);
      }

      if (i_4 == 1) {
        this.method3397(i_1, i_2, 2);
        this.method3397(i_1, i_2 + 1, 32);
      }

      if (i_4 == 2) {
        this.method3397(i_1, i_2, 8);
        this.method3397(i_1 + 1, i_2, 128);
      }

      if (i_4 == 3) {
        this.method3397(i_1, i_2, 32);
        this.method3397(i_1, i_2 - 1, 2);
      }
    }

    if (i_3 == 1 || i_3 == 3) {
      if (i_4 == 0) {
        this.method3397(i_1, i_2, 1);
        this.method3397(i_1 - 1, i_2 + 1, 16);
      }

      if (i_4 == 1) {
        this.method3397(i_1, i_2, 4);
        this.method3397(i_1 + 1, i_2 + 1, 64);
      }

      if (i_4 == 2) {
        this.method3397(i_1, i_2, 16);
        this.method3397(i_1 + 1, i_2 - 1, 1);
      }

      if (i_4 == 3) {
        this.method3397(i_1, i_2, 64);
        this.method3397(i_1 - 1, i_2 - 1, 4);
      }
    }

    if (i_3 == 2) {
      if (i_4 == 0) {
        this.method3397(i_1, i_2, 130);
        this.method3397(i_1 - 1, i_2, 8);
        this.method3397(i_1, i_2 + 1, 32);
      }

      if (i_4 == 1) {
        this.method3397(i_1, i_2, 10);
        this.method3397(i_1, i_2 + 1, 32);
        this.method3397(i_1 + 1, i_2, 128);
      }

      if (i_4 == 2) {
        this.method3397(i_1, i_2, 40);
        this.method3397(i_1 + 1, i_2, 128);
        this.method3397(i_1, i_2 - 1, 2);
      }

      if (i_4 == 3) {
        this.method3397(i_1, i_2, 160);
        this.method3397(i_1, i_2 - 1, 2);
        this.method3397(i_1 - 1, i_2, 8);
      }
    }

    if (bool_5) {
      if (i_3 == 0) {
        if (i_4 == 0) {
          this.method3397(i_1, i_2, 65536);
          this.method3397(i_1 - 1, i_2, 4096);
        }

        if (i_4 == 1) {
          this.method3397(i_1, i_2, 1024);
          this.method3397(i_1, i_2 + 1, 16384);
        }

        if (i_4 == 2) {
          this.method3397(i_1, i_2, 4096);
          this.method3397(i_1 + 1, i_2, 65536);
        }

        if (i_4 == 3) {
          this.method3397(i_1, i_2, 16384);
          this.method3397(i_1, i_2 - 1, 1024);
        }
      }

      if (i_3 == 1 || i_3 == 3) {
        if (i_4 == 0) {
          this.method3397(i_1, i_2, 512);
          this.method3397(i_1 - 1, i_2 + 1, 8192);
        }

        if (i_4 == 1) {
          this.method3397(i_1, i_2, 2048);
          this.method3397(i_1 + 1, i_2 + 1, 32768);
        }

        if (i_4 == 2) {
          this.method3397(i_1, i_2, 8192);
          this.method3397(i_1 + 1, i_2 - 1, 512);
        }

        if (i_4 == 3) {
          this.method3397(i_1, i_2, 32768);
          this.method3397(i_1 - 1, i_2 - 1, 2048);
        }
      }

      if (i_3 == 2) {
        if (i_4 == 0) {
          this.method3397(i_1, i_2, 66560);
          this.method3397(i_1 - 1, i_2, 4096);
          this.method3397(i_1, i_2 + 1, 16384);
        }

        if (i_4 == 1) {
          this.method3397(i_1, i_2, 5120);
          this.method3397(i_1, i_2 + 1, 16384);
          this.method3397(i_1 + 1, i_2, 65536);
        }

        if (i_4 == 2) {
          this.method3397(i_1, i_2, 20480);
          this.method3397(i_1 + 1, i_2, 65536);
          this.method3397(i_1, i_2 - 1, 1024);
        }

        if (i_4 == 3) {
          this.method3397(i_1, i_2, 81920);
          this.method3397(i_1, i_2 - 1, 1024);
          this.method3397(i_1 - 1, i_2, 4096);
        }
      }
    }

  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(IIIIZB)V",
      garbageValue = "126"
  )
  public void method3394(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
    int i_6 = 256;
    if (bool_5) {
      i_6 += 131072;
    }

    i_1 -= this.field2025;
    i_2 -= this.field2026;

    for (int i_7 = i_1; i_7 < i_3 + i_1; i_7++) {
      if (i_7 >= 0 && i_7 < this.field2027) {
        for (int i_8 = i_2; i_8 < i_2 + i_4; i_8++) {
          if (i_8 >= 0 && i_8 < this.field2030) {
            this.method3397(i_7, i_8, i_6);
          }
        }
      }
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-770386169"
  )
  public void method3395(int i_1, int i_2) {
    i_1 -= this.field2025;
    i_2 -= this.field2026;
    this.field2029[i_1][i_2] |= 0x200000;
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "90"
  )
  public void method3410(int i_1, int i_2) {
    i_1 -= this.field2025;
    i_2 -= this.field2026;
    this.field2029[i_1][i_2] |= 0x40000;
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(IIIS)V",
      garbageValue = "23621"
  )
  void method3397(int i_1, int i_2, int i_3) {
    this.field2029[i_1][i_2] |= i_3;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "-30475067"
  )
  public void method3391(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
    i_1 -= this.field2025;
    i_2 -= this.field2026;
    if (i_3 == 0) {
      if (i_4 == 0) {
        this.method3400(i_1, i_2, 128);
        this.method3400(i_1 - 1, i_2, 8);
      }

      if (i_4 == 1) {
        this.method3400(i_1, i_2, 2);
        this.method3400(i_1, i_2 + 1, 32);
      }

      if (i_4 == 2) {
        this.method3400(i_1, i_2, 8);
        this.method3400(i_1 + 1, i_2, 128);
      }

      if (i_4 == 3) {
        this.method3400(i_1, i_2, 32);
        this.method3400(i_1, i_2 - 1, 2);
      }
    }

    if (i_3 == 1 || i_3 == 3) {
      if (i_4 == 0) {
        this.method3400(i_1, i_2, 1);
        this.method3400(i_1 - 1, i_2 + 1, 16);
      }

      if (i_4 == 1) {
        this.method3400(i_1, i_2, 4);
        this.method3400(i_1 + 1, i_2 + 1, 64);
      }

      if (i_4 == 2) {
        this.method3400(i_1, i_2, 16);
        this.method3400(i_1 + 1, i_2 - 1, 1);
      }

      if (i_4 == 3) {
        this.method3400(i_1, i_2, 64);
        this.method3400(i_1 - 1, i_2 - 1, 4);
      }
    }

    if (i_3 == 2) {
      if (i_4 == 0) {
        this.method3400(i_1, i_2, 130);
        this.method3400(i_1 - 1, i_2, 8);
        this.method3400(i_1, i_2 + 1, 32);
      }

      if (i_4 == 1) {
        this.method3400(i_1, i_2, 10);
        this.method3400(i_1, i_2 + 1, 32);
        this.method3400(i_1 + 1, i_2, 128);
      }

      if (i_4 == 2) {
        this.method3400(i_1, i_2, 40);
        this.method3400(i_1 + 1, i_2, 128);
        this.method3400(i_1, i_2 - 1, 2);
      }

      if (i_4 == 3) {
        this.method3400(i_1, i_2, 160);
        this.method3400(i_1, i_2 - 1, 2);
        this.method3400(i_1 - 1, i_2, 8);
      }
    }

    if (bool_5) {
      if (i_3 == 0) {
        if (i_4 == 0) {
          this.method3400(i_1, i_2, 65536);
          this.method3400(i_1 - 1, i_2, 4096);
        }

        if (i_4 == 1) {
          this.method3400(i_1, i_2, 1024);
          this.method3400(i_1, i_2 + 1, 16384);
        }

        if (i_4 == 2) {
          this.method3400(i_1, i_2, 4096);
          this.method3400(i_1 + 1, i_2, 65536);
        }

        if (i_4 == 3) {
          this.method3400(i_1, i_2, 16384);
          this.method3400(i_1, i_2 - 1, 1024);
        }
      }

      if (i_3 == 1 || i_3 == 3) {
        if (i_4 == 0) {
          this.method3400(i_1, i_2, 512);
          this.method3400(i_1 - 1, i_2 + 1, 8192);
        }

        if (i_4 == 1) {
          this.method3400(i_1, i_2, 2048);
          this.method3400(i_1 + 1, i_2 + 1, 32768);
        }

        if (i_4 == 2) {
          this.method3400(i_1, i_2, 8192);
          this.method3400(i_1 + 1, i_2 - 1, 512);
        }

        if (i_4 == 3) {
          this.method3400(i_1, i_2, 32768);
          this.method3400(i_1 - 1, i_2 - 1, 2048);
        }
      }

      if (i_3 == 2) {
        if (i_4 == 0) {
          this.method3400(i_1, i_2, 66560);
          this.method3400(i_1 - 1, i_2, 4096);
          this.method3400(i_1, i_2 + 1, 16384);
        }

        if (i_4 == 1) {
          this.method3400(i_1, i_2, 5120);
          this.method3400(i_1, i_2 + 1, 16384);
          this.method3400(i_1 + 1, i_2, 65536);
        }

        if (i_4 == 2) {
          this.method3400(i_1, i_2, 20480);
          this.method3400(i_1 + 1, i_2, 65536);
          this.method3400(i_1, i_2 - 1, 1024);
        }

        if (i_4 == 3) {
          this.method3400(i_1, i_2, 81920);
          this.method3400(i_1, i_2 - 1, 1024);
          this.method3400(i_1 - 1, i_2, 4096);
        }
      }
    }

  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(IIIIIZI)V",
      garbageValue = "1761910676"
  )
  public void method3399(int i_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
    int i_7 = 256;
    if (bool_6) {
      i_7 += 131072;
    }

    i_1 -= this.field2025;
    i_2 -= this.field2026;
    int i_8;
    if (i_5 == 1 || i_5 == 3) {
      i_8 = i_3;
      i_3 = i_4;
      i_4 = i_8;
    }

    for (i_8 = i_1; i_8 < i_3 + i_1; i_8++) {
      if (i_8 >= 0 && i_8 < this.field2027) {
        for (int i_9 = i_2; i_9 < i_2 + i_4; i_9++) {
          if (i_9 >= 0 && i_9 < this.field2030) {
            this.method3400(i_8, i_9, i_7);
          }
        }
      }
    }

  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "2133692895"
  )
  void method3400(int i_1, int i_2, int i_3) {
    this.field2029[i_1][i_2] &= ~i_3;
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1440413395"
  )
  public void method3401(int i_1, int i_2) {
    i_1 -= this.field2025;
    i_2 -= this.field2026;
    this.field2029[i_1][i_2] &= ~0x40000;
  }

}
