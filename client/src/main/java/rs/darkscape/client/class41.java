package rs.darkscape.client;

import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("av")
public class class41 {

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;",
      garbageValue = "-2076101299"
  )
  public static Object method702(Applet applet_0, String string_1) throws Throwable {
    return JSObject.getWindow(applet_0).call(string_1, (Object[]) null);
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;",
      garbageValue = "2114895599"
  )
  public static Object method700(Applet applet_0, String string_1, Object[] arr_2)
      throws Throwable {
    return JSObject.getWindow(applet_0).call(string_1, arr_2);
  }

}
