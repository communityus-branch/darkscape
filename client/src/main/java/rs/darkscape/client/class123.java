package rs.darkscape.client;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public final class class123 {

  @ObfuscatedName("gt")
  @ObfuscatedGetter(
      intValue = 1694856473
  )
  static int field1702;
  @ObfuscatedName("q")
  boolean field1699 = true;
  @ObfuscatedName("z")
  @ObfuscatedGetter(
      intValue = -1492522689
  )
  int field1703;
  @ObfuscatedName("w")
  @ObfuscatedGetter(
      intValue = -410849109
  )
  int field1695;
  @ObfuscatedName("s")
  @ObfuscatedGetter(
      intValue = 492997223
  )
  int field1696;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = -527325733
  )
  int field1694;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = -1095002287
  )
  int field1698;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = 1751012111
  )
  int field1700;

  class123(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
    this.field1703 = i_1;
    this.field1695 = i_2;
    this.field1696 = i_3;
    this.field1694 = i_4;
    this.field1698 = i_5;
    this.field1700 = i_6;
    this.field1699 = bool_7;
  }

  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "(Lgi;B)V",
      garbageValue = "2"
  )
  public static void method2869(PacketBuffer class189_0) {
    class312 class312_1 = (class312) class313.field3759.method4048();
    if (class312_1 != null) {
      int i_2 = class189_0.offset;
      class189_0.putInt32(class312_1.field3758);

      for (int i_3 = 0; i_3 < class312_1.field3749; i_3++) {
        if (class312_1.field3751[i_3] != 0) {
          class189_0.putInt8(class312_1.field3751[i_3]);
        } else {
          try {
            int i_4 = class312_1.field3748[i_3];
            Field field_5;
            int i_6;
            if (i_4 == 0) {
              field_5 = class312_1.field3752[i_3];
              i_6 = field_5.getInt((Object) null);
              class189_0.putInt8(0);
              class189_0.putInt32(i_6);
            } else if (i_4 == 1) {
              field_5 = class312_1.field3752[i_3];
              field_5.setInt((Object) null, class312_1.field3753[i_3]);
              class189_0.putInt8(0);
            } else if (i_4 == 2) {
              field_5 = class312_1.field3752[i_3];
              i_6 = field_5.getModifiers();
              class189_0.putInt8(0);
              class189_0.putInt32(i_6);
            }

            Method method_25;
            if (i_4 != 3) {
              if (i_4 == 4) {
                method_25 = class312_1.field3754[i_3];
                i_6 = method_25.getModifiers();
                class189_0.putInt8(0);
                class189_0.putInt32(i_6);
              }
            } else {
              method_25 = class312_1.field3754[i_3];
              byte[][] bytes_10 = class312_1.field3755[i_3];
              Object[] arr_7 = new Object[bytes_10.length];

              for (int i_8 = 0; i_8 < bytes_10.length; i_8++) {
                ObjectInputStream objectinputstream_9 = new ObjectInputStream(
                    new ByteArrayInputStream(bytes_10[i_8]));
                arr_7[i_8] = objectinputstream_9.readObject();
              }

              Object object_11 = method_25.invoke((Object) null, arr_7);
              if (object_11 == null) {
                class189_0.putInt8(0);
              } else if (object_11 instanceof Number) {
                class189_0.putInt8(1);
                class189_0.method3659(((Number) object_11).longValue());
              } else if (object_11 instanceof String) {
                class189_0.putInt8(2);
                class189_0.method3699((String) object_11);
              } else {
                class189_0.putInt8(4);
              }
            }
          } catch (ClassNotFoundException classnotfoundexception_13) {
            class189_0.putInt8(-10);
          } catch (InvalidClassException invalidclassexception_14) {
            class189_0.putInt8(-11);
          } catch (StreamCorruptedException streamcorruptedexception_15) {
            class189_0.putInt8(-12);
          } catch (OptionalDataException optionaldataexception_16) {
            class189_0.putInt8(-13);
          } catch (IllegalAccessException illegalaccessexception_17) {
            class189_0.putInt8(-14);
          } catch (IllegalArgumentException illegalargumentexception_18) {
            class189_0.putInt8(-15);
          } catch (InvocationTargetException invocationtargetexception_19) {
            class189_0.putInt8(-16);
          } catch (SecurityException securityexception_20) {
            class189_0.putInt8(-17);
          } catch (IOException ioexception_21) {
            class189_0.putInt8(-18);
          } catch (NullPointerException nullpointerexception_22) {
            class189_0.putInt8(-19);
          } catch (Exception exception_23) {
            class189_0.putInt8(-20);
          } catch (Throwable throwable_24) {
            class189_0.putInt8(-21);
          }
        }
      }

      class189_0.method3572(i_2);
      class312_1.unlinkNode();
    }
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(IIIII)I",
      garbageValue = "-1588641951"
  )
  static final int method2870(int i_0, int i_1, int i_2, int i_3) {
    int i_4 = 65536 - class122.field1693[i_2 * 1024 / i_3] >> 1;
    return ((65536 - i_4) * i_0 >> 16) + (i_4 * i_1 >> 16);
  }

}
