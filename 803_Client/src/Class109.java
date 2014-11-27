/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public final class Class109
{
    Class410 aClass410_1507;
    int anInt1508;
    int anInt1509;
    Class241_Sub39 aClass241_Sub39_1510 = new Class241_Sub39();
    HashTable aClass407_1511;
    
    public Class241_Sub39 method2754(long l) {
	Class241_Sub39 class241_sub39
	    = (Class241_Sub39) ((Class109) this).aClass407_1511.get(l);
	if (null != class241_sub39)
	    ((Class109) this).aClass410_1507.method7431(class241_sub39,
							(byte) -96);
	return class241_sub39;
    }
    
    public Class109(int i) {
	((Class109) this).aClass410_1507 = new Class410();
	((Class109) this).anInt1508 = 1367352073 * i;
	((Class109) this).anInt1509 = i * -43115935;
	int i_0_;
	for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
	    /* empty */
	}
	((Class109) this).aClass407_1511 = new HashTable(i_0_);
    }
    
    public void method2755(Class241_Sub39 class241_sub39, long l) {
	if (0 == ((Class109) this).anInt1509 * 2001996193) {
	    Class241_Sub39 class241_sub39_1_
		= ((Class109) this).aClass410_1507.method7432(16777472);
	    class241_sub39_1_.remove((byte) 36);
	    class241_sub39_1_.method16441((byte) 2);
	    if (((Class109) this).aClass241_Sub39_1510 == class241_sub39_1_) {
		class241_sub39_1_
		    = ((Class109) this).aClass410_1507.method7432(16777472);
		class241_sub39_1_.remove((byte) 36);
		class241_sub39_1_.method16441((byte) 2);
	    }
	} else
	    ((Class109) this).anInt1509 -= -43115935;
	((Class109) this).aClass407_1511.put(class241_sub39, l);
	((Class109) this).aClass410_1507.method7431(class241_sub39,
						    (byte) -37);
    }
    
    public void method2756(int i) {
	((Class109) this).aClass410_1507.method7434(-632248832);
	((Class109) this).aClass407_1511.method7293(-901610021);
	((Class109) this).aClass241_Sub39_1510 = new Class241_Sub39();
	((Class109) this).anInt1509
	    = ((Class109) this).anInt1508 * -1723311463;
    }
    
    public Class241_Sub39 method2757(long l) {
	Class241_Sub39 class241_sub39
	    = (Class241_Sub39) ((Class109) this).aClass407_1511.get(l);
	if (null != class241_sub39)
	    ((Class109) this).aClass410_1507.method7431(class241_sub39,
							(byte) -120);
	return class241_sub39;
    }
    
    public Class241_Sub39 method2758(long l) {
	Class241_Sub39 class241_sub39
	    = (Class241_Sub39) ((Class109) this).aClass407_1511.get(l);
	if (null != class241_sub39)
	    ((Class109) this).aClass410_1507.method7431(class241_sub39,
							(byte) -73);
	return class241_sub39;
    }
    
    public void method2759(Class241_Sub39 class241_sub39, long l) {
	if (0 == ((Class109) this).anInt1509 * 2001996193) {
	    Class241_Sub39 class241_sub39_2_
		= ((Class109) this).aClass410_1507.method7432(16777472);
	    class241_sub39_2_.remove((byte) 36);
	    class241_sub39_2_.method16441((byte) 2);
	    if (((Class109) this).aClass241_Sub39_1510 == class241_sub39_2_) {
		class241_sub39_2_
		    = ((Class109) this).aClass410_1507.method7432(16777472);
		class241_sub39_2_.remove((byte) 36);
		class241_sub39_2_.method16441((byte) 2);
	    }
	} else
	    ((Class109) this).anInt1509 -= -43115935;
	((Class109) this).aClass407_1511.put(class241_sub39, l);
	((Class109) this).aClass410_1507.method7431(class241_sub39,
						    (byte) -39);
    }
    
    public void method2760(Class241_Sub39 class241_sub39, long l) {
	if (0 == ((Class109) this).anInt1509 * 2001996193) {
	    Class241_Sub39 class241_sub39_3_
		= ((Class109) this).aClass410_1507.method7432(16777472);
	    class241_sub39_3_.remove((byte) 36);
	    class241_sub39_3_.method16441((byte) 2);
	    if (((Class109) this).aClass241_Sub39_1510 == class241_sub39_3_) {
		class241_sub39_3_
		    = ((Class109) this).aClass410_1507.method7432(16777472);
		class241_sub39_3_.remove((byte) 36);
		class241_sub39_3_.method16441((byte) 2);
	    }
	} else
	    ((Class109) this).anInt1509 -= -43115935;
	((Class109) this).aClass407_1511.put(class241_sub39, l);
	((Class109) this).aClass410_1507.method7431(class241_sub39,
						    (byte) -71);
    }
    
    public void method2761() {
	((Class109) this).aClass410_1507.method7434(-2055923583);
	((Class109) this).aClass407_1511.method7293(1261479444);
	((Class109) this).aClass241_Sub39_1510 = new Class241_Sub39();
	((Class109) this).anInt1509
	    = ((Class109) this).anInt1508 * -1723311463;
    }
    
    static boolean method2762(int i) {
	return null != Class9.aClass22_51;
    }
    
    public static Container getTopContainer/*method2763*/(byte i) {
		if (null != Class228.aFrame2674) {
			return Class228.aFrame2674;
		}
		if (null != Class241_Sub40_Sub1.frame) {
			return Class241_Sub40_Sub1.frame;
		}
		return Class421.gameApplet;
    }
    
    static final void method2764(ClientScriptData class454, byte i) {
	if (client.currentFriendsChatName != null)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= Class357_Sub1.currentFcSize * -612332369;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    public static void method2765(byte i) {
	if (Class228.aFrame2674 == null) {
	    int i_4_ = client.leftMargin * -2063759389;
	    int i_5_ = 303720107 * client.topMargin;
	    int i_6_ = (Class294.frameWid * 884255947
			- Class494.canvasWid * -1080559003 - i_4_);
	    int i_7_ = (-828675613 * Class43.frameHei
			- 963058943 * Class67.canvasHei - i_5_);
	    if (i_4_ > 0 || i_6_ > 0 || i_5_ > 0 || i_7_ > 0) {
		try {
		    Container container = getTopContainer((byte) 20);
		    int i_8_ = 0;
		    int i_9_ = 0;
		    if (Class241_Sub40_Sub1.frame == container) {
			Insets insets
			    = Class241_Sub40_Sub1.frame.getInsets();
			i_8_ = insets.left;
			i_9_ = insets.top;
		    }
		    Graphics graphics = container.getGraphics();
		    graphics.setColor(Color.black);
		    if (i_4_ > 0)
			graphics.fillRect(i_8_, i_9_, i_4_,
					  -828675613 * Class43.frameHei);
		    if (i_5_ > 0)
			graphics.fillRect(i_8_, i_9_,
					  884255947 * Class294.frameWid,
					  i_5_);
		    if (i_6_ > 0)
			graphics.fillRect((Class294.frameWid * 884255947
					   + i_8_ - i_6_),
					  i_9_, i_6_,
					  Class43.frameHei * -828675613);
		    if (i_7_ > 0)
			graphics.fillRect(i_8_,
					  (i_9_ + Class43.frameHei * -828675613
					   - i_7_),
					  Class294.frameWid * 884255947,
					  i_7_);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
    }
    
    public static final void method2766(InterfaceComponent class58, int i, int i_10_,
					int i_11_) {
	if (client.aClass58_8365 == null && !Class16.aBool141
	    && (null != class58 && Class388.method6963(class58, 1529200151))) {
	    client.aClass58_8365 = class58;
	    client.aClass58_8499 = Class20.method883(class58, 1138201567);
	    client.anInt8479 = i * -1045260019;
	    client.anInt8484 = i_10_ * -1495746211;
	    Class380.anInt5658 = 0;
	    client.aBool8490 = false;
	}
    }
    
    public static void method2767(String string, boolean bool, int i) {
	string = string.toLowerCase();
	Class72.anInt1099 = 0;
	if (client.anInt8574 * -1078012699 != client.anInt8528 * 76704137
	    || bool != client.aBool8362
	    || !string.equals(Class402.aString5872)) {
	    Class402.aString5872 = string;
	    client.anInt8574 = client.anInt8528 * -207045675;
	    client.aBool8362 = bool;
	    short[] is = new short[16];
	    int i_12_ = 0;
	    for (int i_13_ = 0;
		 i_13_ < -345685855 * JS5.itemDefLoader.num;
		 i_13_++) {
		ItemDefinition class623
		    = JS5.itemDefLoader.list(i_13_,
							  (short) 11157);
		if ((!bool || class623.stockmarket)
		    && -1 == class623.noteTemplateID * -1365591143
		    && -1 == 1106873195 * class623.lendTemplateID
		    && 911570241 * class623.boughttemplate == -1
		    && -1534545903 * class623.dummyitem == 0
		    && (class623.name.toLowerCase().indexOf(string)
			!= -1)) {
		    if (i_12_ >= 250) {
			Class120_Sub16.anInt10563 = -364935133;
			Class66_Sub2.aShortArray10479 = null;
			return;
		    }
		    if (i_12_ >= is.length) {
			short[] is_14_ = new short[is.length * 2];
			for (int i_15_ = 0; i_15_ < i_12_; i_15_++)
			    is_14_[i_15_] = is[i_15_];
			is = is_14_;
		    }
		    is[i_12_++] = (short) i_13_;
		}
	    }
	    Class66_Sub2.aShortArray10479 = is;
	    Class120_Sub16.anInt10563 = 364935133 * i_12_;
	    String[] strings
		= new String[Class120_Sub16.anInt10563 * 678860917];
	    for (int i_16_ = 0; i_16_ < 678860917 * Class120_Sub16.anInt10563;
		 i_16_++)
		strings[i_16_] = (JS5.itemDefLoader.list
				  (is[i_16_], (short) -6435).name);
	    Class482.method11025(strings, Class66_Sub2.aShortArray10479,
				 (byte) 108);
	}
    }
    
    static Class535 method2768(int i, int i_17_, int i_18_, Class89 class89,
			       int i_19_) {
	if (class89 == null)
	    return null;
	Class535 class535
	    = new Class535(i, i_17_, i_18_, class89.method1893(),
			   class89.method1895(), class89.method1906(),
			   class89.method1902(), class89.method1865(),
			   class89.method1899(), class89.method1996());
	return class535;
    }
    
    static final void method2769(ClientScriptData class454, int i) {
	int i_20_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_20_, (byte) -56);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_20_ >> 16];
	Class67.method1644(class58, class35, class454, (byte) 1);
    }
    
    static final void method2770(ClientScriptData class454, int i) {
	int i_21_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_21_, (byte) -88);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_21_ >> 16];
	Class322.method5954(class58, class35, class454, 1227459418);
    }
}
