/* Class426 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.lang.reflect.Field;

public class Class426
{
    GraphicsDevice aGraphicsDevice6081;
    DisplayMode aDisplayMode6082;
    
    int[] method7569() {
	DisplayMode[] displaymodes
	    = aGraphicsDevice6081.getDisplayModes();
	int[] is = new int[displaymodes.length << 2];
	for (int i = 0; i < displaymodes.length; i++) {
	    is[i << 2] = displaymodes[i].getWidth();
	    is[(i << 2) + 1] = displaymodes[i].getHeight();
	    is[2 + (i << 2)] = displaymodes[i].getBitDepth();
	    is[(i << 2) + 3] = displaymodes[i].getRefreshRate();
	}
	return is;
    }
    
    int[] method7570(int i) {
	DisplayMode[] displaymodes
	    = aGraphicsDevice6081.getDisplayModes();
	int[] is = new int[displaymodes.length << 2];
	for (int i_0_ = 0; i_0_ < displaymodes.length; i_0_++) {
	    is[i_0_ << 2] = displaymodes[i_0_].getWidth();
	    is[(i_0_ << 2) + 1] = displaymodes[i_0_].getHeight();
	    is[2 + (i_0_ << 2)] = displaymodes[i_0_].getBitDepth();
	    is[(i_0_ << 2) + 3] = displaymodes[i_0_].getRefreshRate();
	}
	return is;
    }
    
    public Class426() throws Exception {
		GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		aGraphicsDevice6081 = graphicsenvironment.getDefaultScreenDevice();
		if (!aGraphicsDevice6081.isFullScreenSupported()) {
			GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
			GraphicsDevice[] graphicsdevices_1_ = graphicsdevices;
			for (int i = 0; i < graphicsdevices_1_.length; i++) {
				GraphicsDevice graphicsdevice = graphicsdevices_1_[i];
				if (null != graphicsdevice && graphicsdevice.isFullScreenSupported()) {
					aGraphicsDevice6081 = graphicsdevice;
					return;
				}
			}
			throw new Exception();
		}
    }
    
    void method7571(Frame frame, int i, int i_2_, int i_3_, int i_4_) {
	aDisplayMode6082
	    = aGraphicsDevice6081.getDisplayMode();
	if (aDisplayMode6082 == null)
	    throw new NullPointerException();
	frame.setUndecorated(true);
	frame.enableInputMethods(false);
	method7572(frame, (byte) 3);
	if (i_4_ == 0) {
	    int i_5_ = aDisplayMode6082.getRefreshRate();
	    DisplayMode[] displaymodes
		= aGraphicsDevice6081.getDisplayModes();
	    boolean bool = false;
	    for (int i_6_ = 0; i_6_ < displaymodes.length; i_6_++) {
		if (displaymodes[i_6_].getWidth() == i
		    && displaymodes[i_6_].getHeight() == i_2_
		    && displaymodes[i_6_].getBitDepth() == i_3_) {
		    int i_7_ = displaymodes[i_6_].getRefreshRate();
		    if (!bool
			|| Math.abs(i_7_ - i_5_) < Math.abs(i_4_ - i_5_)) {
			i_4_ = i_7_;
			bool = true;
		    }
		}
	    }
	    if (!bool)
		i_4_ = i_5_;
	}
	aGraphicsDevice6081
	    .setDisplayMode(new DisplayMode(i, i_2_, i_3_, i_4_));
    }
    
    void method7572(Frame frame, byte i) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_8_
		= ((Boolean) field.get(aGraphicsDevice6081))
		      .booleanValue();
	    if (bool_8_) {
		field.set(aGraphicsDevice6081,
			  Boolean.FALSE);
		bool = true;
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    aGraphicsDevice6081.setFullScreenWindow(frame);
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice6081,
			      Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Throwable object) {
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice6081,
			      Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    throw object;
	}
    }
    
    void method7573() {
	if (aDisplayMode6082 != null) {
	    DisplayMode[] displaymodes
		= aGraphicsDevice6081.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_9_ = displaymodes;
	    for (int i = 0; i < displaymodes_9_.length; i++) {
		DisplayMode displaymode = displaymodes_9_[i];
		if (displaymode.equals(aDisplayMode6082)) {
		    aGraphicsDevice6081
			.setDisplayMode(aDisplayMode6082);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice6081, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode6082 = null;
	}
	method7572(null, (byte) 3);
    }
    
    void method7574(Frame frame, int i, int i_10_, int i_11_, int i_12_,
		    int i_13_) {
	aDisplayMode6082
	    = aGraphicsDevice6081.getDisplayMode();
	if (aDisplayMode6082 == null)
	    throw new NullPointerException();
	frame.setUndecorated(true);
	frame.enableInputMethods(false);
	method7572(frame, (byte) 3);
	if (i_12_ == 0) {
	    int i_14_ = aDisplayMode6082.getRefreshRate();
	    DisplayMode[] displaymodes
		= aGraphicsDevice6081.getDisplayModes();
	    boolean bool = false;
	    for (int i_15_ = 0; i_15_ < displaymodes.length; i_15_++) {
		if (displaymodes[i_15_].getWidth() == i
		    && displaymodes[i_15_].getHeight() == i_10_
		    && displaymodes[i_15_].getBitDepth() == i_11_) {
		    int i_16_ = displaymodes[i_15_].getRefreshRate();
		    if (!bool
			|| Math.abs(i_16_ - i_14_) < Math.abs(i_12_ - i_14_)) {
			i_12_ = i_16_;
			bool = true;
		    }
		}
	    }
	    if (!bool)
		i_12_ = i_14_;
	}
	aGraphicsDevice6081
	    .setDisplayMode(new DisplayMode(i, i_10_, i_11_, i_12_));
    }
    
    void method7575() {
	if (aDisplayMode6082 != null) {
	    DisplayMode[] displaymodes
		= aGraphicsDevice6081.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_17_ = displaymodes;
	    for (int i = 0; i < displaymodes_17_.length; i++) {
		DisplayMode displaymode = displaymodes_17_[i];
		if (displaymode.equals(aDisplayMode6082)) {
		    aGraphicsDevice6081
			.setDisplayMode(aDisplayMode6082);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice6081, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode6082 = null;
	}
	method7572(null, (byte) 3);
    }
    
    void method7576(int i) {
	if (aDisplayMode6082 != null) {
	    DisplayMode[] displaymodes
		= aGraphicsDevice6081.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_18_ = displaymodes;
	    for (int i_19_ = 0; i_19_ < displaymodes_18_.length; i_19_++) {
		DisplayMode displaymode = displaymodes_18_[i_19_];
		if (displaymode.equals(aDisplayMode6082)) {
		    aGraphicsDevice6081
			.setDisplayMode(aDisplayMode6082);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice6081, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode6082 = null;
	}
	method7572(null, (byte) 3);
    }
    
    void method7577() {
	if (aDisplayMode6082 != null) {
	    DisplayMode[] displaymodes
		= aGraphicsDevice6081.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_20_ = displaymodes;
	    for (int i = 0; i < displaymodes_20_.length; i++) {
		DisplayMode displaymode = displaymodes_20_[i];
		if (displaymode.equals(aDisplayMode6082)) {
		    aGraphicsDevice6081
			.setDisplayMode(aDisplayMode6082);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice6081, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode6082 = null;
	}
	method7572(null, (byte) 3);
    }
    
    void method7578() {
	if (aDisplayMode6082 != null) {
	    DisplayMode[] displaymodes
		= aGraphicsDevice6081.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_21_ = displaymodes;
	    for (int i = 0; i < displaymodes_21_.length; i++) {
		DisplayMode displaymode = displaymodes_21_[i];
		if (displaymode.equals(aDisplayMode6082)) {
		    aGraphicsDevice6081
			.setDisplayMode(aDisplayMode6082);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice6081, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode6082 = null;
	}
	method7572(null, (byte) 3);
    }
    
    void method7579(Frame frame) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_22_
		= ((Boolean) field.get(aGraphicsDevice6081))
		      .booleanValue();
	    if (bool_22_) {
		field.set(aGraphicsDevice6081,
			  Boolean.FALSE);
		bool = true;
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    aGraphicsDevice6081.setFullScreenWindow(frame);
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice6081,
			      Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Throwable object) {
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice6081,
			      Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    throw object;
	}
    }
    
    public static final int method7580(int i, int i_23_, byte i_24_) {
	if (-1 == i)
	    return 12345678;
	i_23_ = i_23_ * (i & 0x7f) >> 7;
	if (i_23_ < 2)
	    i_23_ = 2;
	else if (i_23_ > 126)
	    i_23_ = 126;
	return (i & 0xff80) + i_23_;
    }
    
    static void method7581(int i) {
	synchronized (Class484.aQueue6468) {
	    Point point;
	    if (Class344.canvas.isShowing())
		point = Class344.canvas.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class241_Sub24_Sub1 class241_sub24_sub1
		    = (Class241_Sub24_Sub1) Class484.aQueue6468.poll();
		if (null == class241_sub24_sub1)
		    break;
		if (null == point || !Class344.canvas.isShowing()
		    || !Class47.isWindowFocused)
		    class241_sub24_sub1.method15070(430084714);
		else {
		    class241_sub24_sub1.method17009(point, (short) 1748);
		    if (!class241_sub24_sub1.method17008((byte) 72)
			&& (class241_sub24_sub1.getX((byte) 45)
			    < Class494.canvasWid * -1080559003)
			&& (class241_sub24_sub1.getY((byte) 96)
			    < Class67.canvasHei * 963058943)
			&& class241_sub24_sub1.getX((byte) 103) >= 0
			&& class241_sub24_sub1.getY((byte) 25) >= 0) {
			int i_25_ = class241_sub24_sub1.method15064(958524694);
			if (class241_sub24_sub1.method15064(1836278329) == -1)
			    Class484.aClass464_Sub2_6464
				.method10683(class241_sub24_sub1, 1259745225);
			else if (Class298.method5736(i_25_, -938250717))
			    Class484.aClass464_Sub2_6464
				.method14613(class241_sub24_sub1, -1265424500);
		    }
		}
	    }
	}
    }
}
