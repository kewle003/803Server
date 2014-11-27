/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class207
{
    static final int anInt2446 = 10000;
    long aLong2447;
    int anInt2448;
    static final int anInt2449 = 10;
    int anInt2450;
    static final int anInt2451 = 2;
    ExecutorService anExecutorService2452;
    static final int anInt2453 = 10000;
    volatile int anInt2454 = 0;
    String aString2455;
    static final int anInt2456 = 60000;
    boolean aBool2457;
    
    public Class207(String string, int i, int i_0_) {
	((Class207) this).anExecutorService2452
	    = Executors.newFixedThreadPool(2);
	((Class207) this).aBool2457 = false;
	((Class207) this).aString2455 = string;
	((Class207) this).anInt2450 = i * -785195645;
	((Class207) this).anInt2448 = i_0_ * -1272673757;
    }
    
    public void method4095(String string, int i, int i_1_) {
	((Class207) this).aString2455 = string;
	((Class207) this).anInt2450 = -785195645 * i;
    }
    
    boolean method4096(int i) {
	return -2105892015 * ((Class207) this).anInt2454 >= 10;
    }
    
    void method4097(boolean bool) {
	((Class207) this).aBool2457 = bool;
    }
    
    void method4098() {
	((Class207) this).anInt2454 -= 2107409841;
    }
    
    void method4099(int i) {
	((Class207) this).anInt2454 -= 2107409841;
    }
    
    public void method4100(int i) {
	((Class207) this).anExecutorService2452.shutdown();
    }
    
    Class241_Sub39_Sub5_Sub2 method4101(int i, int i_2_, byte i_3_,
					boolean bool, int i_4_, int i_5_,
					byte i_6_) {
	if (i < 0 || i_2_ < 0)
	    throw new RuntimeException(new StringBuilder().append(i).append
					   (",").append
					   (i_2_).toString());
	if (method4096(-485951522))
	    return null;
	boolean bool_7_ = 255 == i && i_2_ == 255;
	if (!((Class207) this).aBool2457 && !bool_7_)
	    return null;
	if (4371093245140365107L * ((Class207) this).aLong2447 + 10000L
	    >= Class50.method1249((byte) 1))
	    return null;
	Object object = null;
	String string;
	if (bool_7_)
	    string = new StringBuilder().append("&cb=").append
			 (Class50.method1249((byte) 1)).toString();
	else
	    string = new StringBuilder().append("&c=").append(i_4_).append
			 ("&v=").append
			 (i_5_).toString();
	URL url;
	try {
	    url = new URL("http", ((Class207) this).aString2455,
			  ((Class207) this).anInt2450 * 175184171,
			  new StringBuilder().append("/ms?m=").append
			      (((Class207) this).anInt2448 * 365786507).append
			      ("&a=").append
			      (i).append
			      ("&g=").append
			      (i_2_).append
			      (string).toString());
	} catch (MalformedURLException malformedurlexception) {
	    return null;
	}
	Class241_Sub39_Sub5_Sub2 class241_sub39_sub5_sub2
	    = new Class241_Sub39_Sub5_Sub2(i_3_);
	((Class241_Sub39_Sub5_Sub2) class241_sub39_sub5_sub2).urgent
	    = bool;
	((Class207) this).anInt2454 += 2107409841;
	Future future
	    = ((Class207) this).anExecutorService2452
		  .submit(new Class206(this, url, class241_sub39_sub5_sub2));
	class241_sub39_sub5_sub2.method17660(future, -1990477973);
	return class241_sub39_sub5_sub2;
    }
    
    public void method4102(String string, int i) {
	((Class207) this).aString2455 = string;
	((Class207) this).anInt2450 = -785195645 * i;
    }
    
    void method4103(boolean bool, short i) {
	((Class207) this).aBool2457 = bool;
    }
    
    boolean method4104() {
	return -2105892015 * ((Class207) this).anInt2454 >= 10;
    }
    
    boolean method4105() {
	return -2105892015 * ((Class207) this).anInt2454 >= 10;
    }
    
    Class241_Sub39_Sub5_Sub2 method4106() {
	return method4101(255, 255, (byte) 0, true, 0, 0, (byte) 122);
    }
    
    Class241_Sub39_Sub5_Sub2 method4107() {
	return method4101(255, 255, (byte) 0, true, 0, 0, (byte) 38);
    }
    
    Class241_Sub39_Sub5_Sub2 method4108(int i, int i_8_, byte i_9_,
					boolean bool, int i_10_, int i_11_) {
	if (i < 0 || i_8_ < 0)
	    throw new RuntimeException(new StringBuilder().append(i).append
					   (",").append
					   (i_8_).toString());
	if (method4096(-1159725682))
	    return null;
	boolean bool_12_ = 255 == i && i_8_ == 255;
	if (!((Class207) this).aBool2457 && !bool_12_)
	    return null;
	if (4371093245140365107L * ((Class207) this).aLong2447 + 10000L
	    >= Class50.method1249((byte) 1))
	    return null;
	Object object = null;
	String string;
	if (bool_12_)
	    string = new StringBuilder().append("&cb=").append
			 (Class50.method1249((byte) 1)).toString();
	else
	    string = new StringBuilder().append("&c=").append(i_10_).append
			 ("&v=").append
			 (i_11_).toString();
	URL url;
	try {
	    url = new URL("http", ((Class207) this).aString2455,
			  ((Class207) this).anInt2450 * 175184171,
			  new StringBuilder().append("/ms?m=").append
			      (((Class207) this).anInt2448 * 365786507).append
			      ("&a=").append
			      (i).append
			      ("&g=").append
			      (i_8_).append
			      (string).toString());
	} catch (MalformedURLException malformedurlexception) {
	    return null;
	}
	Class241_Sub39_Sub5_Sub2 class241_sub39_sub5_sub2
	    = new Class241_Sub39_Sub5_Sub2(i_9_);
	((Class241_Sub39_Sub5_Sub2) class241_sub39_sub5_sub2).urgent
	    = bool;
	((Class207) this).anInt2454 += 2107409841;
	Future future
	    = ((Class207) this).anExecutorService2452
		  .submit(new Class206(this, url, class241_sub39_sub5_sub2));
	class241_sub39_sub5_sub2.method17660(future, -1984184494);
	return class241_sub39_sub5_sub2;
    }
    
    boolean method4109() {
	return -2105892015 * ((Class207) this).anInt2454 >= 10;
    }
    
    Class241_Sub39_Sub5_Sub2 method4110() {
	return method4101(255, 255, (byte) 0, true, 0, 0, (byte) 28);
    }
    
    void method4111() {
	((Class207) this).anInt2454 -= 2107409841;
    }
    
    void method4112() {
	((Class207) this).anInt2454 -= 2107409841;
    }
    
    void method4113() {
	((Class207) this).anInt2454 -= 2107409841;
    }
    
    public void method4114() {
	((Class207) this).anExecutorService2452.shutdown();
    }
    
    public void method4115() {
	((Class207) this).anExecutorService2452.shutdown();
    }
    
    Class241_Sub39_Sub5_Sub2 method4116(int i) {
	return method4101(255, 255, (byte) 0, true, 0, 0, (byte) 14);
    }
    
    void method4117(boolean bool) {
	((Class207) this).aBool2457 = bool;
    }
    
    void method4118(boolean bool) {
	((Class207) this).aBool2457 = bool;
    }
    
    static final void method4119(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_13_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_14_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (Class123.aClass292_1579.method5686(i_13_, (byte) 56)
	       .aCharArray10965[i_14_]);
    }
    
    static final void method4120(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_15_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_16_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	int i_17_ = (((ClientScriptData) class454).integerStack
		     [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class581.processActionButton(9, i_15_ << 16 | i_16_, i_17_, "", -499072277);
    }
    
    static void method4121(ClientScriptData class454, byte i) {
	Class480 class480 = (Class326_Sub3.aClass482_10288.method11010
			     ((((ClientScriptData) class454).integerStack
			       [(((ClientScriptData) class454).intStackPointer
				 -= 1736754263) * 1482319719]),
			      (short) -23498));
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (null == class480.anIntArray6427 ? 0
	       : class480.anIntArray6427.length);
    }
    
    static final void method4122(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	class58.anInt890
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * -1219737013);
	WorldType.refreshComponent(class58, 579548252);
	if (class58.slot1 * -389932081 == -1 && !class35.aBool374)
	    Class267.method5195(445907013 * class58.componentHash, (byte) 11);
    }
    
    static final void method4123(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881,
	     (((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     (byte) 2);
	Class167.method3600((short) 5756);
    }
    
    static final void method4124(ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	Class258.addIgnore(string, false, (short) 256);
    }
    
    static final void method4125(ClientScriptData class454, int i) {
	int i_18_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (2 == client.friendListStage * -2020075851
	    && i_18_ < 1557840217 * client.friendListSize) {
	    Friend class18 = client.friendList[i_18_];
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class18.currentName;
	    if (class18.previousName != null)
		((ClientScriptData) class454).objectStack
		    [((((ClientScriptData) class454).objectStackPointer += -1650705371)
		      * -290357331) - 1]
		    = class18.previousName;
	    else
		((ClientScriptData) class454).objectStack
		    [((((ClientScriptData) class454).objectStackPointer += -1650705371)
		      * -290357331) - 1]
		    = "";
	} else {
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	}
    }
}
