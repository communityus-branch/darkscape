package rs.darkscape.client;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
public class class54 {

  @ObfuscatedName("ov")
  static boolean field489;
  @ObfuscatedName("dd")
  static String field485;

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1976820406"
  )
  static void method1021(int i_0, int i_1) {
    long long_2 = (long) ((i_0 << 16) + i_1);
    RemoteArchiveRequest class246_4 = (RemoteArchiveRequest) AssetService.field3204.get(long_2);
    if (class246_4 != null) {
      AssetService.field3202.method3908(class246_4);
    }
  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "152334198"
  )
  static void method1018() {
    SeekableFile class110_0 = null;

    try {
      class110_0 = class22.method283("", class112.field1455.field3144, true);
      Buffer class182_1 = class10.field61.method1609();
      class110_0.write(class182_1.bytes, 0, class182_1.offset);
    } catch (Exception ignored) {
    }

    try {
      if (class110_0 != null) {
        class110_0.close(true);
      }
    } catch (Exception ignored) {
    }

  }

  @ObfuscatedName("fc")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2135811490"
  )
  static final void method1020() {
    class43.method715();
    class259.field3282.method3984();
    class260.field3291.method3984();
    class3.method34();
    class271.field3488.method3984();
    class271.field3489.method3984();
    class57.method1036();
    class273.field3552.method3984();
    class273.field3539.method3984();
    class258.field3267.method3984();
    class258.field3265.method3984();
    class263.field3321.method3984();
    class254.field3231.method3984();
    class267.field3349.method3984();
    class267.field3356.method3984();
    class267.field3351.method3984();
    class261.field3305.method3984();
    class261.field3306.method3984();
    class265.field3334.method3984();
    class264.field3328.method3984();
    class168.method3444();
    class192.method3871();
    class68.method1698();
    ((class111) class122.field1667).method2561();
    class84.field1190.method3984();
    class77.field1079.method4640();
    class37.field326.method4640();
    class224.field2548.method4640();
    class135.field1852.method4640();
    RemoteArchiveRequest.field3159.method4640();
    class80.field1147.method4640();
    class21.field179.method4640();
    class175.field2270.method4640();
    class268.field3419.method4640();
    class22.field183.method4640();
    class61.field576.method4640();
    client.field854.method4640();
  }

  @ObfuscatedName("fx")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2123313201"
  )
  static final void method1017() {
    if (class63.field879 != null) {
      class63.field879.method2144();
    }

    if (class28.field244 != null) {
      class28.field244.method2144();
    }

  }

  @ObfuscatedName("gs")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-93"
  )
  static void method1019() {
    if (client.field707 >= 0 && client.field610[client.field707] != null) {
      class11.method98(client.field610[client.field707], false);
    }

  }

}
