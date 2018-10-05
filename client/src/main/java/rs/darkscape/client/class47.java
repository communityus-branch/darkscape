package rs.darkscape.client;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import rs.darkscape.client.net.AbstractSocket;
import rs.darkscape.client.net.AsyncSocket;
import rs.darkscape.client.sign.SignLink;
import rs.darkscape.client.util.Time;

@ObfuscatedName("aj")
public abstract class class47 extends Applet implements Runnable, FocusListener, WindowListener {

  @ObfuscatedName("b")
  @ObfuscatedGetter(
      intValue = -1422310459
  )
  protected static int field393 = 0;
  @ObfuscatedName("g")
  protected static long[] field394 = new long[32];
  @ObfuscatedName("r")
  protected static long[] field404 = new long[32];
  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "Lev;"
  )
  protected static SignLink field392;
  @ObfuscatedName("s")
  @ObfuscatedSignature(
      signature = "Laj;"
  )
  static class47 field386 = null;
  @ObfuscatedName("l")
  @ObfuscatedGetter(
      intValue = 1414651903
  )
  static int field387 = 0;
  @ObfuscatedName("u")
  @ObfuscatedGetter(
      longValue = -5838759279061655367L
  )
  static long field388 = 0L;
  @ObfuscatedName("q")
  static boolean field389 = false;
  @ObfuscatedName("e")
  @ObfuscatedGetter(
      intValue = -1662117949
  )
  static int field391 = 20;
  @ObfuscatedName("p")
  @ObfuscatedGetter(
      intValue = 1070405191
  )
  static int field385 = 1;
  @ObfuscatedName("ai")
  @ObfuscatedGetter(
      intValue = 1878379069
  )
  static int field413 = 500;
  @ObfuscatedName("az")
  static volatile boolean field390 = true;
  @ObfuscatedName("aj")
  @ObfuscatedGetter(
      longValue = -3346366327004911519L
  )
  static long field415 = -1L;
  @ObfuscatedName("ax")
  @ObfuscatedGetter(
      longValue = 1928704871308797659L
  )
  static long field416 = -1L;
  @ObfuscatedName("ae")
  final EventQueue field399;
  @ObfuscatedName("o")
  @ObfuscatedGetter(
      intValue = 2027069893
  )
  protected int field396;
  @ObfuscatedName("a")
  @ObfuscatedGetter(
      intValue = -81949229
  )
  protected int field397;
  @ObfuscatedName("v")
  @ObfuscatedGetter(
      intValue = -385865539
  )
  int field395;
  @ObfuscatedName("af")
  @ObfuscatedGetter(
      intValue = -1565245549
  )
  int field402;
  @ObfuscatedName("as")
  Frame field403;
  @ObfuscatedName("k")
  boolean field401 = false;
  @ObfuscatedName("j")
  @ObfuscatedGetter(
      intValue = 1346865451
  )
  int field398 = 0;
  @ObfuscatedName("d")
  @ObfuscatedGetter(
      intValue = 2128545057
  )
  int field411 = 0;
  @ObfuscatedName("ao")
  volatile boolean field406 = true;
  @ObfuscatedName("ac")
  boolean field408 = false;
  @ObfuscatedName("ap")
  volatile boolean field409 = false;
  @ObfuscatedName("aa")
  @ObfuscatedGetter(
      longValue = 2801001644697647105L
  )
  volatile long field410 = 0L;
  @ObfuscatedName("ah")
  @ObfuscatedGetter(
      intValue = -318529133
  )
  int field400;
  @ObfuscatedName("ab")
  @ObfuscatedGetter(
      intValue = 1497598001
  )
  int field414;
  @ObfuscatedName("av")
  @ObfuscatedSignature(
      signature = "Laa;"
  )
  MouseWheelImpl mouseWheel;
  @ObfuscatedName("al")
  Clipboard clipboard;
  @ObfuscatedName("an")
  Canvas canvas;

  protected class47() {
    EventQueue eventqueue_1 = null;

    try {
      eventqueue_1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
    } catch (Throwable ignored) {
    }

    this.field399 = eventqueue_1;
    class40 class40_2 = new class40();
    class95.field1297 = class40_2;
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;IIB)Lfd;",
      garbageValue = "-82"
  )
  public static AbstractSocket createAsyncSocket(Socket socket_0, int i_1, int i_2) throws IOException {
    return new AsyncSocket(socket_0, i_1, i_2);
  }

  @ObfuscatedName("u")
  @ObfuscatedSignature(
      signature = "(ILce;ZB)I",
      garbageValue = "-7"
  )
  static int method909(int i_0, class84 class84_1, boolean bool_2) {
    int i_3 = -1;
    class230 class230_4;
    if (i_0 >= 2000) {
      i_0 -= 1000;
      i_3 = class69.field999[--class69.field1003];
      class230_4 = class26.method434(i_3);
    } else {
      class230_4 = bool_2 ? class276.field3561 : class260.field3301;
    }

    if (i_0 == 1000) {
      class69.field1003 -= 4;
      class230_4.field2607 = class69.field999[class69.field1003];
      class230_4.field2615 = class69.field999[class69.field1003 + 1];
      class230_4.field2610 = class69.field999[class69.field1003 + 2];
      class230_4.field2611 = class69.field999[class69.field1003 + 3];
      class60.method1114(class230_4);
      Buffer.field2334.method1152(class230_4);
      if (i_3 != -1 && class230_4.field2721 == 0) {
        Temp.method3388(class42.field366[i_3 >> 16], class230_4, false);
      }

      return 1;
    } else if (i_0 == 1001) {
      class69.field1003 -= 4;
      class230_4.field2616 = class69.field999[class69.field1003];
      class230_4.field2617 = class69.field999[class69.field1003 + 1];
      class230_4.field2612 = class69.field999[class69.field1003 + 2];
      class230_4.field2624 = class69.field999[class69.field1003 + 3];
      class60.method1114(class230_4);
      Buffer.field2334.method1152(class230_4);
      if (i_3 != -1 && class230_4.field2721 == 0) {
        Temp.method3388(class42.field366[i_3 >> 16], class230_4, false);
      }

      return 1;
    } else if (i_0 == 1003) {
      boolean bool_5 = class69.field999[--class69.field1003] == 1;
      if (bool_5 != class230_4.field2625) {
        class230_4.field2625 = bool_5;
        class60.method1114(class230_4);
      }

      return 1;
    } else if (i_0 == 1005) {
      class230_4.field2648 = class69.field999[--class69.field1003] == 1;
      return 1;
    } else if (i_0 == 1006) {
      class230_4.field2740 = class69.field999[--class69.field1003] == 1;
      return 1;
    } else {
      return 2;
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "670224222"
  )
  static void method910() {
    Iterator iterator_0 = class83.field1181.iterator();

    while (iterator_0.hasNext()) {
      class58 class58_1 = (class58) iterator_0.next();
      class58_1.method1042();
    }

  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "0"
  )
  public static final void method913(int i_0, int i_1) {
    class120.field1648 = i_0;
    class120.field1649 = i_1;
    class120.field1650 = true;
    class120.field1656 = 0;
    class120.field1652 = false;
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(ILce;ZI)I",
      garbageValue = "794717505"
  )
  static int method914(int i_0, class84 class84_1, boolean bool_2) {
    class230 class230_3 = bool_2 ? class276.field3561 : class260.field3301;
    if (i_0 == 1800) {
      class69.field999[++class69.field1003 - 1] = SignLink
          .method3252(class24.method425(class230_3));
      return 1;
    } else if (i_0 != 1801) {
      if (i_0 == 1802) {
        if (class230_3.field2679 == null) {
          class69.field1001[++class55.field497 - 1] = "";
        } else {
          class69.field1001[++class55.field497 - 1] = class230_3.field2679;
        }

        return 1;
      } else {
        return 2;
      }
    } else {
      int i_4 = class69.field999[--class69.field1003];
      --i_4;
      if (class230_3.field2680 != null && i_4 < class230_3.field2680.length
          && class230_3.field2680[i_4] != null) {
        class69.field1001[++class55.field497 - 1] = class230_3.field2680[i_4];
      } else {
        class69.field1001[++class55.field497 - 1] = "";
      }

      return 1;
    }
  }

  @ObfuscatedName("an")
  @ObfuscatedSignature(
      signature = "([BI)[B",
      garbageValue = "-1083003215"
  )
  static final byte[] unpack(byte[] bytes_0) {
    Buffer class182_1 = new Buffer(bytes_0);
    int i_2 = class182_1.getUInt8();
    int i_3 = class182_1.getInt32();
    if (i_3 < 0 || AbstractPack.field3176 != 0 && i_3 > AbstractPack.field3176) {
      throw new RuntimeException();
    } else if (i_2 == 0) {
      byte[] bytes_4 = new byte[i_3];
      class182_1.method3539(bytes_4, 0, i_3);
      return bytes_4;
    } else {
      int i_6 = class182_1.getInt32();
      if (i_6 >= 0 && (AbstractPack.field3176 == 0 || i_6 <= AbstractPack.field3176)) {
        byte[] bytes_5 = new byte[i_6];
        if (i_2 == 1) {
          class176.method3489(bytes_5, i_6, bytes_0, i_3, 9);
        } else {
          AbstractPack.field3172.method3483(class182_1, bytes_5);
        }

        return bytes_5;
      } else {
        throw new RuntimeException();
      }
    }
  }

  @ObfuscatedName("q")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "349970276"
  )
  protected final void method906(int i_1, int i_2) {
    if (this.field400 != i_1 || i_2 != this.field414) {
      this.method784();
    }

    this.field400 = i_1;
    this.field414 = i_2;
  }

  @ObfuscatedName("i")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;B)V",
      garbageValue = "-2"
  )
  final void method768(Object object_1) {
    if (this.field399 != null) {
      for (int i_2 = 0; i_2 < 50 && this.field399.peekEvent() != null; i_2++) {
        class63.method1539(1L);
      }

      if (object_1 != null) {
        this.field399.postEvent(new ActionEvent(object_1, 1001, "dummy"));
      }

    }
  }

  @ObfuscatedName("x")
  @ObfuscatedSignature(
      signature = "(B)Lfp;",
      garbageValue = "10"
  )
  protected MouseWheel getMouseWheel() {
    if (this.mouseWheel == null) {
      this.mouseWheel = new MouseWheelImpl();
      this.mouseWheel.bind(this.canvas);
    }
    return this.mouseWheel;
  }

  @ObfuscatedName("e")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1223644500"
  )
  protected void initializeClipboard() {
    this.clipboard = this.getToolkit().getSystemClipboard();
  }

  @ObfuscatedName("p")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "8637"
  )
  protected void method771(String string_1) {
    this.clipboard.setContents(new StringSelection(string_1), (ClipboardOwner) null);
  }

  @ObfuscatedName("b")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
  )
  protected final void initializeKeyboard() {
    if (SignLink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
      Keyboard.keyCodeMap[186] = 57;
      Keyboard.keyCodeMap[187] = 27;
      Keyboard.keyCodeMap[188] = 71;
      Keyboard.keyCodeMap[189] = 26;
      Keyboard.keyCodeMap[190] = 72;
      Keyboard.keyCodeMap[191] = 73;
      Keyboard.keyCodeMap[192] = 58;
      Keyboard.keyCodeMap[219] = 42;
      Keyboard.keyCodeMap[220] = 74;
      Keyboard.keyCodeMap[221] = 43;
      Keyboard.keyCodeMap[222] = 59;
      Keyboard.keyCodeMap[223] = 28;
    } else {
      Keyboard.keyCodeMap[44] = 71;
      Keyboard.keyCodeMap[45] = 26;
      Keyboard.keyCodeMap[46] = 72;
      Keyboard.keyCodeMap[47] = 73;
      Keyboard.keyCodeMap[59] = 57;
      Keyboard.keyCodeMap[61] = 27;
      Keyboard.keyCodeMap[91] = 42;
      Keyboard.keyCodeMap[92] = 74;
      Keyboard.keyCodeMap[93] = 43;
      Keyboard.keyCodeMap[192] = 28;
      Keyboard.keyCodeMap[222] = 58;
      Keyboard.keyCodeMap[520] = 59;
    }

    Canvas canvas = this.canvas;
    canvas.setFocusTraversalKeysEnabled(false);
    canvas.addKeyListener(Keyboard.keyboard);
    canvas.addFocusListener(Keyboard.keyboard);
  }

  @ObfuscatedName("n")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "45124386"
  )
  protected final void initializeMouse() {
    Canvas canvas_1 = this.canvas;
    canvas_1.addMouseListener(Mouse.mouse);
    canvas_1.addMouseMotionListener(Mouse.mouse);
    canvas_1.addFocusListener(Mouse.mouse);
  }

  @ObfuscatedName("f")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1629251833"
  )
  final void method854() {
    Container container_1 = this.method799();
    if (container_1 != null) {
      class310 class310_2 = this.method800();
      this.field396 = Math.max(class310_2.field3747, this.field395);
      this.field397 = Math.max(class310_2.field3745, this.field402);
      if (this.field396 <= 0) {
        this.field396 = 1;
      }

      if (this.field397 <= 0) {
        this.field397 = 1;
      }

      class82.field1179 = Math.min(this.field396, this.field400);
      class243.field3138 = Math.min(this.field397, this.field414);
      this.field398 = (this.field396 - class82.field1179) / 2;
      this.field411 = 0;
      this.canvas.setSize(class82.field1179, class243.field3138);
      Temp.field2014 = new class46(class82.field1179, class243.field3138, this.canvas);
      if (container_1 == this.field403) {
        Insets insets_3 = this.field403.getInsets();
        this.canvas.setLocation(this.field398 + insets_3.left, insets_3.top + this.field411);
      } else {
        this.canvas.setLocation(this.field398, this.field411);
      }

      this.field406 = true;
      this.vmethod1144();
    }
  }

  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2141234055"
  )
  protected abstract void vmethod1144();

  @ObfuscatedName("a")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1970135042"
  )
  void method776() {
    int i_1 = this.field398;
    int i_2 = this.field411;
    int i_3 = this.field396 - class82.field1179 - i_1;
    int i_4 = this.field397 - class243.field3138 - i_2;
    if (i_1 > 0 || i_3 > 0 || i_2 > 0 || i_4 > 0) {
      try {
        Container container_5 = this.method799();
        int i_6 = 0;
        int i_7 = 0;
        if (container_5 == this.field403) {
          Insets insets_8 = this.field403.getInsets();
          i_6 = insets_8.left;
          i_7 = insets_8.top;
        }

        Graphics graphics_10 = container_5.getGraphics();
        graphics_10.setColor(Color.black);
        if (i_1 > 0) {
          graphics_10.fillRect(i_6, i_7, i_1, this.field397);
        }

        if (i_2 > 0) {
          graphics_10.fillRect(i_6, i_7, this.field396, i_2);
        }

        if (i_3 > 0) {
          graphics_10.fillRect(i_6 + this.field396 - i_3, i_7, i_3, this.field397);
        }

        if (i_4 > 0) {
          graphics_10.fillRect(i_6, i_7 + this.field397 - i_4, this.field396, i_4);
        }
      } catch (Exception ignored) {
      }
    }

  }

  @ObfuscatedName("c")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
  )
  final void method777() {
    Canvas canvas_1 = this.canvas;
    canvas_1.removeKeyListener(Keyboard.keyboard);
    canvas_1.removeFocusListener(Keyboard.keyboard);
    Keyboard.pressedKeyWritePointer = -1;
    Canvas canvas_2 = this.canvas;
    canvas_2.removeMouseListener(Mouse.mouse);
    canvas_2.removeMouseMotionListener(Mouse.mouse);
    canvas_2.removeFocusListener(Mouse.mouse);
    Mouse.field424 = 0;
    if (this.mouseWheel != null) {
      this.mouseWheel.method668(this.canvas);
    }

    this.method779();
    Canvas canvas_3 = this.canvas;
    canvas_3.setFocusTraversalKeysEnabled(false);
    canvas_3.addKeyListener(Keyboard.keyboard);
    canvas_3.addFocusListener(Keyboard.keyboard);
    Canvas canvas_4 = this.canvas;
    canvas_4.addMouseListener(Mouse.mouse);
    canvas_4.addMouseMotionListener(Mouse.mouse);
    canvas_4.addFocusListener(Mouse.mouse);
    if (this.mouseWheel != null) {
      this.mouseWheel.bind(this.canvas);
    }

    this.method784();
  }

  @ObfuscatedName("v")
  @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1907342193"
  )
  protected final void method778(int i_1, int i_2, int i_3) {
    try {
      if (field386 != null) {
        ++field387;
        if (field387 >= 3) {
          this.method788("alreadyloaded");
          return;
        }

        this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
        return;
      }

      field386 = this;
      class82.field1179 = i_1;
      class243.field3138 = i_2;
      class42.field362 = i_3;
      class152.field1938 = this;
      if (field392 == null) {
        field392 = new SignLink();
      }

      field392.startThread(this, 1);
    } catch (Exception exception_5) {
      class5.method65((String) null, exception_5);
      this.method788("crash");
    }

  }

  @ObfuscatedName("af")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1647866935"
  )
  final synchronized void method779() {
    Container container_1 = this.method799();
    if (this.canvas != null) {
      this.canvas.removeFocusListener(this);
      container_1.remove(this.canvas);
    }

    class82.field1179 = Math.max(container_1.getWidth(), this.field395);
    class243.field3138 = Math.max(container_1.getHeight(), this.field402);
    Insets insets_2;
    if (this.field403 != null) {
      insets_2 = this.field403.getInsets();
      class82.field1179 -= insets_2.right + insets_2.left;
      class243.field3138 -= insets_2.bottom + insets_2.top;
    }

    this.canvas = new class42(this);
    container_1.add(this.canvas);
    this.canvas.setSize(class82.field1179, class243.field3138);
    this.canvas.setVisible(true);
    this.canvas.setBackground(Color.BLACK);
    if (container_1 == this.field403) {
      insets_2 = this.field403.getInsets();
      this.canvas.setLocation(insets_2.left + this.field398, insets_2.top + this.field411);
    } else {
      this.canvas.setLocation(this.field398, this.field411);
    }

    this.canvas.addFocusListener(this);
    this.canvas.requestFocus();
    this.field406 = true;
    if (Temp.field2014 != null && class82.field1179 == Temp.field2014.field3767
        && class243.field3138 == Temp.field2014.field3769) {
      ((class46) Temp.field2014).method751(this.canvas);
      Temp.field2014.vmethod5809(0, 0);
    } else {
      Temp.field2014 = new class46(class82.field1179, class243.field3138, this.canvas);
    }

    this.field409 = false;
    this.field410 = Time.currentTimeMillis();
  }

  @ObfuscatedName("ah")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "375421429"
  )
  protected final boolean method774() {
    String string_1 = this.getDocumentBase().getHost().toLowerCase();
    if (!string_1.equals("jagex.com") && !string_1.endsWith(".jagex.com")) {
      if (!string_1.equals("runescape.com") && !string_1.endsWith(".runescape.com")) {
        if (string_1.endsWith("127.0.0.1")) {
          return true;
        } else {
          while (string_1.length() > 0 && string_1.charAt(string_1.length() - 1) >= 48
              && string_1.charAt(string_1.length() - 1) <= 57) {
            string_1 = string_1.substring(0, string_1.length() - 1);
          }

          if (string_1.endsWith("192.168.1.")) {
            return true;
          } else {
            //this.method788("invalidhost");
            return true;
          }
        }
      } else {
        return true;
      }
    } else {
      return true;
    }
  }

  @ObfuscatedName("ab")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2136042033"
  )
  void beginUpdate() {
    long long_1 = Time.currentTimeMillis();
    long long_3 = field404[class20.field172];
    field404[class20.field172] = long_1;
    class20.field172 = class20.field172 + 1 & 0x1f;
    if (long_3 != 0L && long_1 > long_3) {
    }

    synchronized (this) {
      class18.field146 = field390;
    }

    this.update();
  }

  @ObfuscatedName("aw")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "243481673"
  )
  void method782() {
    Container container_1 = this.method799();
    long long_2 = Time.currentTimeMillis();
    long long_4 = field394[class257.field3259];
    field394[class257.field3259] = long_2;
    class257.field3259 = class257.field3259 + 1 & 0x1f;
    if (long_4 != 0L && long_2 > long_4) {
      int i_6 = (int) (long_2 - long_4);
      field393 = ((i_6 >> 1) + 32000) / i_6;
    }

    if (++field413 - 1 > 50) {
      field413 -= 50;
      this.field406 = true;
      this.canvas.setSize(class82.field1179, class243.field3138);
      this.canvas.setVisible(true);
      if (container_1 == this.field403) {
        Insets insets_7 = this.field403.getInsets();
        this.canvas.setLocation(this.field398 + insets_7.left, this.field411 + insets_7.top);
      } else {
        this.canvas.setLocation(this.field398, this.field411);
      }
    }

    if (this.field409) {
      this.method777();
    }

    this.method783();
    this.vmethod1137(this.field406);
    if (this.field406) {
      this.method776();
    }

    this.field406 = false;
  }

  @ObfuscatedName("ak")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-460416978"
  )
  final void method783() {
    class310 class310_1 = this.method800();
    if (class310_1.field3747 != this.field396 || this.field397 != class310_1.field3745
        || this.field408) {
      this.method854();
      this.field408 = false;
    }

  }

  @ObfuscatedName("as")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
  )
  final void method784() {
    this.field408 = true;
  }

  @ObfuscatedName("an")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-199508735"
  )
  final synchronized void method785() {
    if (!field389) {
      field389 = true;

      try {
        this.canvas.removeFocusListener(this);
      } catch (Exception ignored) {
      }

      try {
        this.vmethod1187();
      } catch (Exception ignored) {
      }

      if (this.field403 != null) {
        try {
          System.exit(0);
        } catch (Throwable ignored) {
        }
      }

      if (field392 != null) {
        try {
          field392.halt();
        } catch (Exception ignored) {
        }
      }

      this.vmethod1132();
    }
  }

  @ObfuscatedName("ao")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1300111147"
  )
  protected abstract void initialize();

  @ObfuscatedName("at")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1052023991"
  )
  protected abstract void update();

  @ObfuscatedName("ai")
  @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "0"
  )
  protected abstract void vmethod1137(boolean var1);

  @ObfuscatedName("ac")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2060326728"
  )
  protected abstract void vmethod1187();

  @ObfuscatedName("ap")
  @ObfuscatedSignature(
      signature = "(ILjava/lang/String;ZI)V",
      garbageValue = "490645637"
  )
  protected final void method796(int i_1, String string_2, boolean bool_3) {
    try {
      Graphics graphics_4 = this.canvas.getGraphics();
      if (SignLink.field1961 == null) {
        SignLink.field1961 = new Font("Helvetica", 1, 13);
        class29.field256 = this.canvas.getFontMetrics(SignLink.field1961);
      }

      if (bool_3) {
        graphics_4.setColor(Color.black);
        graphics_4.fillRect(0, 0, class82.field1179, class243.field3138);
      }

      Color color_5 = new Color(140, 17, 17);

      try {
        if (class71.field1028 == null) {
          class71.field1028 = this.canvas.createImage(304, 34);
        }

        Graphics graphics_6 = class71.field1028.getGraphics();
        graphics_6.setColor(color_5);
        graphics_6.drawRect(0, 0, 303, 33);
        graphics_6.fillRect(2, 2, i_1 * 3, 30);
        graphics_6.setColor(Color.black);
        graphics_6.drawRect(1, 1, 301, 31);
        graphics_6.fillRect(i_1 * 3 + 2, 2, 300 - i_1 * 3, 30);
        graphics_6.setFont(SignLink.field1961);
        graphics_6.setColor(Color.white);
        graphics_6.drawString(string_2, (304 - class29.field256.stringWidth(string_2)) / 2, 22);
        graphics_4
            .drawImage(class71.field1028, class82.field1179 / 2 - 152, class243.field3138 / 2 - 18,
                       (ImageObserver) null);
      } catch (Exception exception_9) {
        int i_7 = class82.field1179 / 2 - 152;
        int i_8 = class243.field3138 / 2 - 18;
        graphics_4.setColor(color_5);
        graphics_4.drawRect(i_7, i_8, 303, 33);
        graphics_4.fillRect(i_7 + 2, i_8 + 2, i_1 * 3, 30);
        graphics_4.setColor(Color.black);
        graphics_4.drawRect(i_7 + 1, i_8 + 1, 301, 31);
        graphics_4.fillRect(i_7 + i_1 * 3 + 2, i_8 + 2, 300 - i_1 * 3, 30);
        graphics_4.setFont(SignLink.field1961);
        graphics_4.setColor(Color.white);
        graphics_4.drawString(string_2, i_7 + (304 - class29.field256.stringWidth(string_2)) / 2,
                              i_8 + 22);
      }
    } catch (Exception exception_10) {
      this.canvas.repaint();
    }

  }

  @ObfuscatedName("aa")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-82"
  )
  protected final void method842() {
    class71.field1028 = null;
    SignLink.field1961 = null;
    class29.field256 = null;
  }

  @ObfuscatedName("ar")
  @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1327956818"
  )
  protected void method788(String string_1) {
    if (!this.field401) {
      this.field401 = true;
      System.out.println("error_game_" + string_1);

      try {
        this.getAppletContext()
            .showDocument(new URL(this.getCodeBase(), "error_game_" + string_1 + ".ws"), "_self");
      } catch (Exception ignored) {
      }

    }
  }

  @ObfuscatedName("au")
  @ObfuscatedSignature(
      signature = "(I)Ljava/awt/Container;",
      garbageValue = "-1235194173"
  )
  Container method799() {
    return (Container) (this.field403 != null ? this.field403 : this);
  }

  @ObfuscatedName("av")
  @ObfuscatedSignature(
      signature = "(B)Lkg;",
      garbageValue = "20"
  )
  class310 method800() {
    Container container_1 = this.method799();
    int i_2 = Math.max(container_1.getWidth(), this.field395);
    int i_3 = Math.max(container_1.getHeight(), this.field402);
    if (this.field403 != null) {
      Insets insets_4 = this.field403.getInsets();
      i_2 -= insets_4.left + insets_4.right;
      i_3 -= insets_4.top + insets_4.bottom;
    }

    return new class310(i_2, i_3);
  }

  @ObfuscatedName("al")
  @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-997320713"
  )
  protected final boolean method801() {
    return this.field403 != null;
  }

  @ObfuscatedName("az")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1676093665"
  )
  protected abstract void vmethod1132();

  public final void destroy() {
    if (this == field386 && !field389) {
      field388 = Time.currentTimeMillis();
      class63.method1539(5000L);
      this.method785();
    }
  }

  public final synchronized void paint(Graphics graphics_1) {
    if (this == field386 && !field389) {
      this.field406 = true;
      if (Time.currentTimeMillis() - this.field410 > 1000L) {
        Rectangle rectangle_2 = graphics_1.getClipBounds();
        if (rectangle_2 == null
            || rectangle_2.width >= class82.field1179 && rectangle_2.height >= class243.field3138) {
          this.field409 = true;
        }
      }

    }
  }

  public void run() {
    try {
      if (SignLink.javaVendor != null) {
        String string_1 = SignLink.javaVendor.toLowerCase();
        if (string_1.indexOf("sun") != -1 || string_1.indexOf("apple") != -1) {
          String string_2 = SignLink.javaVersion;
          if (string_2.equals("1.1") || string_2.startsWith("1.1.") || string_2.equals("1.2")
              || string_2.startsWith("1.2.") || string_2.equals("1.3") || string_2
              .startsWith("1.3.") || string_2.equals("1.4") || string_2.startsWith("1.4.")
              || string_2.equals("1.5") || string_2.startsWith("1.5.") || string_2
              .equals("1.6.0")) {
            this.method788("wrongjava");
            return;
          }

          if (string_2.startsWith("1.6.0_")) {
            int i_3;
            for (i_3 = 6; i_3 < string_2.length(); i_3++) {
              char var_5 = string_2.charAt(i_3);
              boolean bool_4 = var_5 >= 48 && var_5 <= 57;
              if (!bool_4) {
                break;
              }
            }

            String string_6 = string_2.substring(6, i_3);
            if (class102.method2249(string_6)) {
              int i_9 = class68.method1693(string_6, 10, true);
              if (i_9 < 10) {
                this.method788("wrongjava");
                return;
              }
            }
          }

          field385 = 5;
        }
      }

      this.setFocusCycleRoot(true);
      this.method779();
      this.initialize();
      class43.field368 = class43.method712();

      while (field388 == 0L || Time.currentTimeMillis() < field388) {
        class8.field48 = class43.field368.vmethod3331(field391, field385);

        for (int i_7 = 0; i_7 < class8.field48; i_7++) {
          this.beginUpdate();
        }

        this.method782();
        this.method768(this.canvas);
      }
    } catch (Exception exception_8) {
      class5.method65((String) null, exception_8);
      this.method788("crash");
    }

    this.method785();
  }

  public final void start() {
    if (this == field386 && !field389) {
      field388 = 0L;
    }
  }

  public final void stop() {
    if (this == field386 && !field389) {
      field388 = Time.currentTimeMillis() + 4000L;
    }
  }

  public final void update(Graphics graphics_1) {
    this.paint(graphics_1);
  }

  public final void focusGained(FocusEvent focusevent_1) {
    field390 = true;
    this.field406 = true;
  }

  public final void focusLost(FocusEvent focusevent_1) {
    field390 = false;
  }

  public final void windowDeactivated(WindowEvent windowevent_1) {
  }

  public final void windowIconified(WindowEvent windowevent_1) {
  }

  public final void windowOpened(WindowEvent windowevent_1) {
  }

  public final void windowDeiconified(WindowEvent windowevent_1) {
  }

  public final void windowActivated(WindowEvent windowevent_1) {
  }

  public final void windowClosed(WindowEvent windowevent_1) {
  }

  public final void windowClosing(WindowEvent windowevent_1) {
    this.destroy();
  }

  public abstract void init();

}
