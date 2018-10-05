package rs.darkscape.client;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.util.Time;

@ObfuscatedName("ax")
public class Mouse implements MouseListener, MouseMotionListener, FocusListener {

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "Lax;"
  )
  public static Mouse mouse = new Mouse();
  @ObfuscatedName("q")
  @ObfuscatedGetter(
      intValue = -408912375
  )
  public static volatile int field424 = 0;
  @ObfuscatedName("i")
  @ObfuscatedGetter(
      intValue = 1905746791
  )
  public static volatile int field422 = -1;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -1193765943
  )
  public static volatile int field423 = -1;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = -182158863
  )
  public static int field419 = 0;
  @ObfuscatedName("k")
  @ObfuscatedGetter(
      intValue = -333703105
  )
  public static int field425 = 0;
  @ObfuscatedName("x")
  @ObfuscatedGetter(
      intValue = 1976419829
  )
  public static int field426 = 0;
  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -569585645
  )
  public static volatile int field421 = 0;
  @ObfuscatedName("n")
  @ObfuscatedGetter(
      intValue = -1462111047
  )
  public static volatile int field420 = 0;
  @ObfuscatedName("f")
  @ObfuscatedGetter(
      intValue = 894647401
  )
  public static volatile int field434 = 0;
  @ObfuscatedName("g")
  @ObfuscatedGetter(
      longValue = 2696384854056822279L
  )
  public static volatile long field430 = 0L;
  @ObfuscatedName("m")
  @ObfuscatedGetter(
      intValue = 1681711897
  )
  public static int field431 = 0;
  @ObfuscatedName("r")
  @ObfuscatedGetter(
      intValue = -1469671121
  )
  public static int field432 = 0;
  @ObfuscatedName("t")
  @ObfuscatedGetter(
      intValue = -2008842241
  )
  public static int field428 = 0;
  @ObfuscatedName("o")
  @ObfuscatedGetter(
      longValue = 7842482435590182425L
  )
  public static long field433 = 0L;
  @ObfuscatedName("jz")
  @ObfuscatedGetter(
      intValue = -1699928239
  )
  static int field435;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      intValue = 1210703827
  )
  static volatile int field417 = 0;

  @ObfuscatedName("ej")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "537461702"
  )
  static void method947(int i_0) {
    if (i_0 != client.state) {
      if (client.state == 0) {
        Buffer.field2334.method842();
      }

      if (i_0 == 20 || i_0 == 40 || i_0 == 45) {
        client.loginStage = 0;
        client.field616 = 0;
        client.field617 = 0;
        client.field804.method5246(i_0);
        if (i_0 != 20) {
          class87.method2005(false);
        }
      }

      if (i_0 != 20 && i_0 != 40 && class62.field869 != null) {
        class62.field869.close();
        class62.field869 = null;
      }

      if (client.state == 25) {
        client.field751 = 0;
        client.field633 = 0;
        client.field634 = 1;
        client.field635 = 0;
        client.field636 = 1;
      }

      if (i_0 != 5 && i_0 != 10) {
        if (i_0 == 20) {
          class87.method1994(class22.field183, class175.field2270, true,
                             client.state == 11 ? 4 : 0);
        } else if (i_0 == 11) {
          class87.method1994(class22.field183, class175.field2270, false, 4);
        } else {
          class59.method1079();
        }
      } else {
        class87.method1994(class22.field183, class175.field2270, true, 0);
      }

      client.state = i_0;
    }
  }

  @ObfuscatedName("gq")
  @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "96"
  )
  static boolean method943() {
    return (client.field658 & 0x2) != 0;
  }

  @ObfuscatedName("hx")
  @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1368654361"
  )
  static final void method948(int i_0, int i_1, int i_2, int i_3) {
    for (int i_4 = 0; i_4 < client.field603; i_4++) {
      if (client.field786[i_4] + client.field641[i_4] > i_0 && client.field786[i_4] < i_0 + i_2
          && client.field787[i_4] + client.field789[i_4] > i_1
          && client.field787[i_4] < i_3 + i_1) {
        client.field697[i_4] = true;
      }
    }

  }

  @ObfuscatedName("l")
  @ObfuscatedSignature(
      signature = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "-1838071369"
  )
  final int method916(MouseEvent mouseevent_1) {
    int i_2 = mouseevent_1.getButton();
    return !mouseevent_1.isAltDown() && i_2 != 2 ? (!mouseevent_1.isMetaDown() && i_2 != 3 ? 1 : 2)
        : 4;
  }

  public final synchronized void mousePressed(MouseEvent mouseevent_1) {
    if (mouse != null) {
      field417 = 0;
      field420 = mouseevent_1.getX();
      field434 = mouseevent_1.getY();
      field430 = Time.currentTimeMillis();
      field421 = this.method916(mouseevent_1);
      if (field421 != 0) {
        field424 = field421;
      }
    }

    if (mouseevent_1.isPopupTrigger()) {
      mouseevent_1.consume();
    }

  }

  public final synchronized void mouseReleased(MouseEvent mouseevent_1) {
    if (mouse != null) {
      field417 = 0;
      field424 = 0;
    }

    if (mouseevent_1.isPopupTrigger()) {
      mouseevent_1.consume();
    }

  }

  public final synchronized void mouseEntered(MouseEvent mouseevent_1) {
    if (mouse != null) {
      field417 = 0;
      field422 = mouseevent_1.getX();
      field423 = mouseevent_1.getY();
    }

  }

  public final synchronized void mouseDragged(MouseEvent mouseevent_1) {
    if (mouse != null) {
      field417 = 0;
      field422 = mouseevent_1.getX();
      field423 = mouseevent_1.getY();
    }

  }

  public final synchronized void mouseMoved(MouseEvent mouseevent_1) {
    if (mouse != null) {
      field417 = 0;
      field422 = mouseevent_1.getX();
      field423 = mouseevent_1.getY();
    }

  }

  public final synchronized void focusLost(FocusEvent focusevent_1) {
    if (mouse != null) {
      field424 = 0;
    }

  }

  public final synchronized void mouseExited(MouseEvent mouseevent_1) {
    if (mouse != null) {
      field417 = 0;
      field422 = -1;
      field423 = -1;
    }

  }

  public final void mouseClicked(MouseEvent mouseevent_1) {
    if (mouseevent_1.isPopupTrigger()) {
      mouseevent_1.consume();
    }

  }

  public final void focusGained(FocusEvent focusevent_1) {
  }

}
