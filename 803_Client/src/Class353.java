/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class353 implements Interface37
{
    boolean aBool5436;
    static Class129 aClass129_5437;
    Class608 aClass608_5438;
    Interface39[] anInterface39Array5439;
    int anInt5440;
    int anInt5441;
    Class103 aClass103_5442;
    static byte[] aByteArray5443
	= { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6,
	    14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17,
	    94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41,
	    25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3,
	    67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112,
	    33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70,
	    -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24,
	    89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31,
	    97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97,
	    101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56,
	    -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51,
	    -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24,
	    53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42,
	    -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22,
	    26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110,
	    -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41,
	    -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85,
	    -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109,
	    -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87,
	    109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56,
	    -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82,
	    -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27,
	    -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2,
	    98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123,
	    -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86,
	    69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17,
	    -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116,
	    -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50,
	    99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2,
	    -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49,
	    127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };
    static String aString5444;
    
    public void method207(int i) {
	/* empty */
    }
    
    public void method195(int i) {
	if (Class236.aClass103_2713 != ((Class353) this).aClass103_5442) {
	    ((Class353) this).aClass103_5442 = Class236.aClass103_2713;
	    ((Class353) this).aBool5436 = true;
	}
	((Class353) this).aClass103_5442.method2450(3, 0);
	Interface39[] interface39s = ((Class353) this).anInterface39Array5439;
	for (int i_0_ = 0; i_0_ < interface39s.length; i_0_++) {
	    Interface39 interface39 = interface39s[i_0_];
	    if (interface39 != null)
		interface39.method191(-1742682691);
	}
    }
    
    public void method196(boolean bool, byte i) {
	bool = true;
	Interface39[] interface39s = ((Class353) this).anInterface39Array5439;
	for (int i_1_ = 0; i_1_ < interface39s.length; i_1_++) {
	    Interface39 interface39 = interface39s[i_1_];
	    if (null != interface39)
		interface39.method215(bool || ((Class353) this).aBool5436,
				      (byte) 15);
	}
	((Class353) this).aBool5436 = false;
    }
    
    public int method199(int i) {
	int i_2_ = 0;
	Interface39[] interface39s = ((Class353) this).anInterface39Array5439;
	for (int i_3_ = 0; i_3_ < interface39s.length; i_3_++) {
	    Interface39 interface39 = interface39s[i_3_];
	    if (null == interface39 || interface39.method107(-934865050))
		i_2_++;
	}
	return 100 * i_2_ / ((Class353) this).anInterface39Array5439.length;
    }
    
    static Class168 method6419(byte[] is) {
	if (null == is)
	    throw new RuntimeException("");
	Class168 class168;
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		MediaTracker mediatracker
		    = new MediaTracker(Class421.gameApplet);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i = image.getWidth(Class421.gameApplet);
		int i_4_ = image.getHeight(Class421.gameApplet);
		if (mediatracker.isErrorAny() || i < 0 || i_4_ < 0)
		    throw new RuntimeException("");
		int[] is_5_ = new int[i_4_ * i];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i, i_4_, is_5_, 0, i);
		pixelgrabber.grabPixels();
		class168
		    = Class236.aClass103_2713.method2259(is_5_, 0, i, i, i_4_,
							 (byte) -41);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class168;
    }
    
    public boolean method198(long l) {
	return (Class50.method1249((byte) 1)
		>= (long) (804148483 * ((Class353) this).anInt5440) + l);
    }
    
    static Class168 method6420(byte[] is) {
	if (null == is)
	    throw new RuntimeException("");
	Class168 class168;
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		MediaTracker mediatracker
		    = new MediaTracker(Class421.gameApplet);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i = image.getWidth(Class421.gameApplet);
		int i_6_ = image.getHeight(Class421.gameApplet);
		if (mediatracker.isErrorAny() || i < 0 || i_6_ < 0)
		    throw new RuntimeException("");
		int[] is_7_ = new int[i_6_ * i];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i, i_6_, is_7_, 0, i);
		pixelgrabber.grabPixels();
		class168
		    = Class236.aClass103_2713.method2259(is_7_, 0, i, i, i_6_,
							 (byte) 101);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class168;
    }
    
    static {
	aClass129_5437 = new Class129(128, 4);
    }
    
    public void method208(boolean bool) {
	bool = true;
	Interface39[] interface39s = ((Class353) this).anInterface39Array5439;
	for (int i = 0; i < interface39s.length; i++) {
	    Interface39 interface39 = interface39s[i];
	    if (null != interface39)
		interface39.method215(bool || ((Class353) this).aBool5436,
				      (byte) 66);
	}
	((Class353) this).aBool5436 = false;
    }
    
    public void method201(boolean bool) {
	bool = true;
	Interface39[] interface39s = ((Class353) this).anInterface39Array5439;
	for (int i = 0; i < interface39s.length; i++) {
	    Interface39 interface39 = interface39s[i];
	    if (null != interface39)
		interface39.method215(bool || ((Class353) this).aBool5436,
				      (byte) -39);
	}
	((Class353) this).aBool5436 = false;
    }
    
    public void method39() {
	if (Class236.aClass103_2713 != ((Class353) this).aClass103_5442) {
	    ((Class353) this).aClass103_5442 = Class236.aClass103_2713;
	    ((Class353) this).aBool5436 = true;
	}
	((Class353) this).aClass103_5442.method2450(3, 0);
	Interface39[] interface39s = ((Class353) this).anInterface39Array5439;
	for (int i = 0; i < interface39s.length; i++) {
	    Interface39 interface39 = interface39s[i];
	    if (interface39 != null)
		interface39.method191(-1742682691);
	}
    }
    
    public int method210() {
	return ((Class353) this).anInt5441 * 1654243753;
    }
    
    public int method203() {
	int i = 0;
	Interface39[] interface39s = ((Class353) this).anInterface39Array5439;
	for (int i_8_ = 0; i_8_ < interface39s.length; i_8_++) {
	    Interface39 interface39 = interface39s[i_8_];
	    if (null == interface39 || interface39.method107(462127294))
		i++;
	}
	return 100 * i / ((Class353) this).anInterface39Array5439.length;
    }
    
    Class353(Class608 class608, int i, int i_9_, Class371 class371) {
	((Class353) this).aClass608_5438 = class608;
	((Class353) this).anInt5440 = i * 363773355;
	((Class353) this).anInt5441 = -777096551 * i_9_;
	((Class353) this).anInterface39Array5439
	    = new Interface39[(((Class353) this).aClass608_5438
			       .anInterface32Array7757).length];
	for (int i_10_ = 0;
	     i_10_ < ((Class353) this).anInterface39Array5439.length; i_10_++)
	    ((Class353) this).anInterface39Array5439[i_10_]
		= class371.method6620((((Class353) this).aClass608_5438
				       .anInterface32Array7757[i_10_]),
				      (byte) 3);
    }
    
    static void method6421() {
	aClass129_5437.reset(-1186728399);
    }
    
    public boolean method202(long l) {
	return (Class50.method1249((byte) 1)
		>= (long) (804148483 * ((Class353) this).anInt5440) + l);
    }
    
    public boolean method206(long l) {
	return (Class50.method1249((byte) 1)
		>= (long) (804148483 * ((Class353) this).anInt5440) + l);
    }
    
    public int method197() {
	return ((Class353) this).anInt5441 * 1654243753;
    }
    
    public int method209() {
	return ((Class353) this).anInt5441 * 1654243753;
    }
    
    public int method200(int i) {
	return ((Class353) this).anInt5441 * 1654243753;
    }
    
    public int method211() {
	return ((Class353) this).anInt5441 * 1654243753;
    }
    
    static Class168 method6422(byte[] is) {
	if (null == is)
	    throw new RuntimeException("");
	Class168 class168;
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		MediaTracker mediatracker
		    = new MediaTracker(Class421.gameApplet);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i = image.getWidth(Class421.gameApplet);
		int i_11_ = image.getHeight(Class421.gameApplet);
		if (mediatracker.isErrorAny() || i < 0 || i_11_ < 0)
		    throw new RuntimeException("");
		int[] is_12_ = new int[i_11_ * i];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i, i_11_, is_12_, 0, i);
		pixelgrabber.grabPixels();
		class168
		    = Class236.aClass103_2713.method2259(is_12_, 0, i, i,
							 i_11_, (byte) -48);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class168;
    }
    
    static void method6423() {
	aClass129_5437.reset(-1800064543);
    }
    
    public static Class168 method6424(JS5 class210, int i) {
	Class168 class168 = (Class168) aClass129_5437.get((long) i);
	if (null == class168) {
	    if (Class68.aBool1058)
		class168
		    = Class236.aClass103_2713
			  .method2289(Class160.method3438(class210, i), true);
	    else
		class168
		    = Class63.method1619(class210.method4194(i, -867262800),
					 (byte) 72);
	    aClass129_5437.put(class168, (long) i);
	}
	return class168;
    }
    
    public static Class168 method6425(JS5 class210, int i) {
	Class168 class168 = (Class168) aClass129_5437.get((long) i);
	if (null == class168) {
	    if (Class68.aBool1058)
		class168
		    = Class236.aClass103_2713
			  .method2289(Class160.method3438(class210, i), true);
	    else
		class168
		    = Class63.method1619(class210.method4194(i, -1902531252),
					 (byte) 116);
	    aClass129_5437.put(class168, (long) i);
	}
	return class168;
    }
    
    static boolean method6426() {
	boolean bool;
	try {
	    Class606 class606 = new Class606();
	    byte[] is = class606.method13213(aByteArray5443, 1481881240);
	    Class63.method1619(is, (byte) 120);
	    bool = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool;
    }
    
    static boolean method6427() {
	boolean bool;
	try {
	    Class606 class606 = new Class606();
	    byte[] is = class606.method13213(aByteArray5443, 2006144977);
	    Class63.method1619(is, (byte) 87);
	    bool = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool;
    }
    
    public int method204() {
	int i = 0;
	Interface39[] interface39s = ((Class353) this).anInterface39Array5439;
	for (int i_13_ = 0; i_13_ < interface39s.length; i_13_++) {
	    Interface39 interface39 = interface39s[i_13_];
	    if (null == interface39 || interface39.method107(1564278079))
		i++;
	}
	return 100 * i / ((Class353) this).anInterface39Array5439.length;
    }
    
    public int method205() {
	int i = 0;
	Interface39[] interface39s = ((Class353) this).anInterface39Array5439;
	for (int i_14_ = 0; i_14_ < interface39s.length; i_14_++) {
	    Interface39 interface39 = interface39s[i_14_];
	    if (null == interface39 || interface39.method107(751699605))
		i++;
	}
	return 100 * i / ((Class353) this).anInterface39Array5439.length;
    }
    
    static Class168 method6428(byte[] is) {
	if (null == is)
	    throw new RuntimeException("");
	Class168 class168;
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		MediaTracker mediatracker
		    = new MediaTracker(Class421.gameApplet);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i = image.getWidth(Class421.gameApplet);
		int i_15_ = image.getHeight(Class421.gameApplet);
		if (mediatracker.isErrorAny() || i < 0 || i_15_ < 0)
		    throw new RuntimeException("");
		int[] is_16_ = new int[i_15_ * i];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i, i_15_, is_16_, 0, i);
		pixelgrabber.grabPixels();
		class168
		    = Class236.aClass103_2713.method2259(is_16_, 0, i, i,
							 i_15_, (byte) -43);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class168;
    }
    
    public void method194() {
	/* empty */
    }
    
    static final void method6429(ClientScriptData class454, int i) {
	int i_17_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_17_, (byte) -25);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_17_ >> 16];
	Class481.setContextMenuSelectEvent(class58, class35, class454, -759362859);
    }
    
    static final void method6430(ClientScriptData class454, int i) {
	System.out.println(((ClientScriptData) class454).objectStack
			   [((((ClientScriptData) class454).objectStackPointer -= -1650705371)
			     * -290357331)]);
    }
    
    static final void method6431(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	Class445_Sub16.aClass351_Sub1_8660.method6260
	    ((float) (((ClientScriptData) class454).integerStack
		      [((((ClientScriptData) class454).intStackPointer -= 1736754263)
			* 1482319719)]) / 1000.0F,
	     1789825217);
    }
}
