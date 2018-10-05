package rs.darkscape.client;

import java.util.Random;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class ComputerInformation extends Node {

  @ObfuscatedName("al")
  @ObfuscatedGetter(
      intValue = 7624373
  )
  int field3904;
  @ObfuscatedName("aj")
  @ObfuscatedGetter(
      intValue = -2092428531
  )
  int field3909;
  @ObfuscatedName("ax")
  @ObfuscatedGetter(
      intValue = 1126186449
  )
  int field3910;
  @ObfuscatedName("am")
  @ObfuscatedGetter(
      intValue = 1538474183
  )
  int field3889;
  @ObfuscatedName("ay")
  @ObfuscatedGetter(
      intValue = 351520139
  )
  int field3912;
  @ObfuscatedName("bi")
  @ObfuscatedGetter(
      intValue = -1130492829
  )
  int field3916;
  @ObfuscatedName("bp")
  int[] field3915 = new int[3];
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -438996515
  )
  int operatingSystem;
  @ObfuscatedName("k")
  boolean arch64Bit;
  @ObfuscatedName("af")
  @ObfuscatedGetter(
      intValue = -778326201
  )
  int operatingSystemVersion;
  @ObfuscatedName("an")
  @ObfuscatedGetter(
      intValue = -1703178915
  )
  int javaVendor;
  @ObfuscatedName("ao")
  @ObfuscatedGetter(
      intValue = 2041961125
  )
  int field3897;
  @ObfuscatedName("at")
  @ObfuscatedGetter(
      intValue = -1684217887
  )
  int field3898;
  @ObfuscatedName("ai")
  @ObfuscatedGetter(
      intValue = 546169143
  )
  int field3900;
  @ObfuscatedName("ac")
  boolean field3891;
  @ObfuscatedName("ap")
  @ObfuscatedGetter(
      intValue = 1784732867
  )
  int field3901;
  @ObfuscatedName("ar")
  @ObfuscatedGetter(
      intValue = 170995375
  )
  int field3902;
  @ObfuscatedName("av")
  @ObfuscatedGetter(
      intValue = -397278319
  )
  int field3906;
  @ObfuscatedName("ae")
  String field3905;
  @ObfuscatedName("az")
  String field3914;
  @ObfuscatedName("aq")
  String field3907;
  @ObfuscatedName("ad")
  String field3908;
  @ObfuscatedName("ag")
  String field3913;
  @ObfuscatedName("bk")
  String field3894;

  @ObfuscatedSignature(
      signature = "(Z)V",
      garbageValue = "1"
  )
  public ComputerInformation() {
    if (class75.osName.startsWith("win")) {
      this.operatingSystem = 1;
    } else if (class75.osName.startsWith("mac")) {
      this.operatingSystem = 2;
    } else if (class75.osName.startsWith("linux")) {
      this.operatingSystem = 3;
    } else {
      this.operatingSystem = 4;
    }

    String osArch;
    try {
      osArch = System.getProperty("os.arch").toLowerCase();
    } catch (Exception exception_13) {
      osArch = "";
    }

    String osVersion;
    try {
      osVersion = System.getProperty("os.version").toLowerCase();
    } catch (Exception exception_12) {
      osVersion = "";
    }

    String str_4 = "Unknown";
    String str_5 = "1.1";

    try {
      str_4 = System.getProperty("java.vendor");
      str_5 = System.getProperty("java.version");
    } catch (Exception ignored) {
    }

    if (!osArch.startsWith("amd64") && !osArch.startsWith("x86_64")) {
      this.arch64Bit = false;
    } else {
      this.arch64Bit = true;
    }

    if (this.operatingSystem == 1) {
      if (osVersion.indexOf("4.0") != -1) {
        this.operatingSystemVersion = 1;
      } else if (osVersion.indexOf("4.1") != -1) {
        this.operatingSystemVersion = 2;
      } else if (osVersion.indexOf("4.9") != -1) {
        this.operatingSystemVersion = 3;
      } else if (osVersion.indexOf("5.0") != -1) {
        this.operatingSystemVersion = 4;
      } else if (osVersion.indexOf("5.1") != -1) {
        this.operatingSystemVersion = 5;
      } else if (osVersion.indexOf("5.2") != -1) {
        this.operatingSystemVersion = 8;
      } else if (osVersion.indexOf("6.0") != -1) {
        this.operatingSystemVersion = 6;
      } else if (osVersion.indexOf("6.1") != -1) {
        this.operatingSystemVersion = 7;
      } else if (osVersion.indexOf("6.2") != -1) {
        this.operatingSystemVersion = 9;
      } else if (osVersion.indexOf("6.3") != -1) {
        this.operatingSystemVersion = 10;
      } else if (osVersion.indexOf("10.0") != -1) {
        this.operatingSystemVersion = 11;
      }
    } else if (this.operatingSystem == 2) {
      if (osVersion.indexOf("10.4") != -1) {
        this.operatingSystemVersion = 20;
      } else if (osVersion.indexOf("10.5") != -1) {
        this.operatingSystemVersion = 21;
      } else if (osVersion.indexOf("10.6") != -1) {
        this.operatingSystemVersion = 22;
      } else if (osVersion.indexOf("10.7") != -1) {
        this.operatingSystemVersion = 23;
      } else if (osVersion.indexOf("10.8") != -1) {
        this.operatingSystemVersion = 24;
      } else if (osVersion.indexOf("10.9") != -1) {
        this.operatingSystemVersion = 25;
      } else if (osVersion.indexOf("10.10") != -1) {
        this.operatingSystemVersion = 26;
      } else if (osVersion.indexOf("10.11") != -1) {
        this.operatingSystemVersion = 27;
      }
    }

    if (str_4.toLowerCase().indexOf("sun") != -1) {
      this.javaVendor = 1;
    } else if (str_4.toLowerCase().indexOf("microsoft") != -1) {
      this.javaVendor = 2;
    } else if (str_4.toLowerCase().indexOf("apple") != -1) {
      this.javaVendor = 3;
    } else if (str_4.toLowerCase().indexOf("oracle") != -1) {
      this.javaVendor = 5;
    } else {
      this.javaVendor = 4;
    }

    int i_9 = 2;
    int i_7 = 0;

    char var_8;
    try {
      while (i_9 < str_5.length()) {
        var_8 = str_5.charAt(i_9);
        if (var_8 < 48 || var_8 > 57) {
          break;
        }

        i_7 = i_7 * 10 + (var_8 - 48);
        ++i_9;
      }
    } catch (Exception ignored) {
    }

    this.field3897 = i_7;
    i_9 = str_5.indexOf(46, 2) + 1;
    i_7 = 0;

    try {
      while (i_9 < str_5.length()) {
        var_8 = str_5.charAt(i_9);
        if (var_8 < 48 || var_8 > 57) {
          break;
        }

        i_7 = i_7 * 10 + (var_8 - 48);
        ++i_9;
      }
    } catch (Exception ignored) {
    }

    this.field3898 = i_7;
    i_9 = str_5.indexOf(95, 4) + 1;
    i_7 = 0;

    try {
      while (i_9 < str_5.length()) {
        var_8 = str_5.charAt(i_9);
        if (var_8 < 48 || var_8 > 57) {
          break;
        }

        i_7 = i_7 * 10 + (var_8 - 48);
        ++i_9;
      }
    } catch (Exception ignored) {
    }

    this.field3900 = i_7;
    this.field3891 = false;
    this.field3901 = (int) ((long) ((new Random()).nextInt(31457280) + 230686720) / 1048576L) + 1;
    if (this.field3897 > 3) {
      this.field3902 = Runtime.getRuntime().availableProcessors();
    } else {
      this.field3902 = 0;
    }

    this.field3906 = 0;
    if (this.field3905 == null) {
      this.field3905 = "";
    }

    if (this.field3914 == null) {
      this.field3914 = "";
    }

    if (this.field3907 == null) {
      this.field3907 = "";
    }

    if (this.field3908 == null) {
      this.field3908 = "";
    }

    if (this.field3913 == null) {
      this.field3913 = "";
    }

    if (this.field3894 == null) {
      this.field3894 = "";
    }

    this.method6211();
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-5446469"
  )
  void method6211() {
    if (this.field3905.length() > 40) {
      this.field3905 = this.field3905.substring(0, 40);
    }

    if (this.field3914.length() > 40) {
      this.field3914 = this.field3914.substring(0, 40);
    }

    if (this.field3907.length() > 10) {
      this.field3907 = this.field3907.substring(0, 10);
    }

    if (this.field3908.length() > 10) {
      this.field3908 = this.field3908.substring(0, 10);
    }

  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgk;S)V",
      garbageValue = "8212"
  )
  public void encode(Buffer buffer) {
    buffer.putInt8(6);
    buffer.putInt8(this.operatingSystem);
    buffer.putInt8(this.arch64Bit ? 1 : 0);
    buffer.putInt8(this.operatingSystemVersion);
    buffer.putInt8(this.javaVendor);
    buffer.putInt8(this.field3897);
    buffer.putInt8(this.field3898);
    buffer.putInt8(this.field3900);
    buffer.putInt8(this.field3891 ? 1 : 0);
    buffer.method3755(this.field3901);
    buffer.putInt8(this.field3902);
    buffer.method3534(this.field3906);
    buffer.method3755(this.field3904);
    buffer.method3540(this.field3905);
    buffer.method3540(this.field3914);
    buffer.method3540(this.field3907);
    buffer.method3540(this.field3908);
    buffer.putInt8(this.field3910);
    buffer.method3755(this.field3909);
    buffer.method3540(this.field3913);
    buffer.method3540(this.field3894);
    buffer.putInt8(this.field3889);
    buffer.putInt8(this.field3912);

    for (int i_2 = 0; i_2 < this.field3915.length; i_2++) {
      buffer.putInt32(this.field3915[i_2]);
    }

    buffer.putInt32(this.field3916);
  }

  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-782378364"
  )
  public int method6215() {
    byte b_1 = 38;
    String string_4 = this.field3905;
    int i_3 = string_4.length() + 2;
    int i_20 = i_3 + b_1;
    String string_7 = this.field3914;
    int i_6 = string_7.length() + 2;
    i_20 += i_6;
    String string_10 = this.field3907;
    int i_9 = string_10.length() + 2;
    i_20 += i_9;
    String string_13 = this.field3908;
    int i_12 = string_13.length() + 2;
    i_20 += i_12;
    String string_16 = this.field3913;
    int i_15 = string_16.length() + 2;
    i_20 += i_15;
    String string_19 = this.field3894;
    int i_18 = string_19.length() + 2;
    i_20 += i_18;
    return i_20;
  }

}
