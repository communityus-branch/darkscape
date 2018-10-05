package gameApplet;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.*;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Lantern Web/ Laughing Bud
 * @date 14/07/2018
 */

public class GameApplet extends JFrame implements AppletStub {

    private String host;
    private Class<?> clnt;
    private Applet v_client;
    private Map<String, String> map;

    public GameApplet() throws Exception {
        super("#171-7 Deob");
        setPreferredSize(new Dimension(782, 542));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        URLClassLoader loader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        Class<?> urlClass = URLClassLoader.class;
        Method method = urlClass.getDeclaredMethod("addURL", new Class[]{URL.class});
        method.setAccessible(true);
        method.invoke(loader, new Object[]{new File("../gamepack.jar").toURI().toURL()});
    }

    public static void main(String[] args) throws Exception {
        GameApplet app = new GameApplet();
        app.startApplet();
    }

    private void startApplet() {
        try {
            clnt = Class.forName("java");
            map = new HashMap<>();
            host = new String("http://127.0.0.1");

            map.put("1", ".runescape.com");
            map.put("2", "59985");
            map.put("3", "0");
            map.put("4", "33");
            map.put("5", "http://www.runescape.com/g=oldscape/slr.ws?order=LPWM");
            map.put("6", "1");
            map.put("7", "true");
            map.put("8", "0");
            map.put("9", "false");
            map.put("10", "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw");
            map.put("11", "0");
            map.put("12", "");
            map.put("13", "319");
            map.put("14", "true");
            map.put("15", "5");
            map.put("16", "0");

            v_client = (Applet) clnt.getConstructor().newInstance();
            clnt.getSuperclass().getMethod("setStub", AppletStub.class).invoke(v_client, this);

            add(v_client);
            pack();
            setVisible(true);

            clnt.getMethod("init").invoke(v_client);
            clnt.getMethod("start").invoke(v_client);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see java.applet.AppletStub#appletResize(int, int)
     */
    @Override
    public void appletResize(int width, int height) {
        try {
            clnt.getSuperclass().getMethod("resize", Integer.class, Integer.class).invoke(v_client, width, height);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
                | SecurityException e) {
            e.printStackTrace();
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see java.applet.AppletStub#getAppletContext()
     */
    @Override
    public AppletContext getAppletContext() {
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.applet.AppletStub#getCodeBase()
     */
    @Override
    public URL getCodeBase() {
        try {
            return new URL(host);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.applet.AppletStub#getDocumentBase()
     */
    @Override
    public URL getDocumentBase() {
        try {
            return new URL(host);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.applet.AppletStub#getParameter(java.lang.String)
     */
    @Override
    public String getParameter(String key) {
        return map.get(key);
    }
}