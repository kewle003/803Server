/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class46
{
    public String aString623;
    public String aString624;
    static int anInt625;
    
    void method1120(Class54 class54) {
	aString623 = class54.method1298(-478251353);
	aString624 = class54.method1298(-489496922);
    }
    
    Class46() {
	/* empty */
    }
    
    void method1121(Class54 class54, int i) {
	aString623 = class54.method1298(-2047813894);
	aString624 = class54.method1298(-1509602297);
    }
    
    void method1122(Class54 class54) {
	aString623 = class54.method1298(-931161389);
	aString624 = class54.method1298(323872701);
    }
    
    static final void method1123(ClientScriptData class454, int i) {
	Class402.soundManager.method1168((((ClientScriptData) class454).integerStack
					   [(((ClientScriptData) class454).intStackPointer
					     -= 1736754263) * 1482319719]),
					  117252431);
    }
    
    static boolean method1124(byte i) {
	Class13.anInt77 = 1651570860;
	Exception_Sub5.aClass190_10704 = client.aClass190_8339;
	if (client.aByteArray8273 != null) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(client.aByteArray8273);
	    Class13.aLong82 = (class241_sub3.readLong((short) 18556)
			       * -7226492194362182485L);
	    Class13.aLong111 = (class241_sub3.readLong((short) 18070)
				* 4049046998799193519L);
	}
	if (-3469600135743429117L * Class13.aLong82 < 0L) {
	    Class175.setLoginResponse(35, -456840406);
	    return false;
	}
	return CcDeltaNode.method15095(false, true, "", "",
					  (Class13.aLong82
					   * -3469600135743429117L));
    }
    
    public static void method1125(long[] ls, int[] is, byte i) {
	Class241_Sub38.method16440(ls, is, 0, ls.length - 1, (byte) 102);
    }
    
    static final void method1126(ClientScriptData class454, byte i) {
	String string = null;
	if (null != Class621.aClass4_7876)
	    string = Class621.aClass4_7876.method470(903070482);
	if (null == string)
	    string = "";
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = string;
    }
    
    static final void method1127(InterfaceComponent class58, ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = ((((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer])
		    - 1);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (i_0_ < 0 || i_0_ > 9)
	    throw new RuntimeException();
	Class258.method5066(class58, i_0_, i_1_, class454, (byte) 40);
    }
    
    public static final void method1128(int i, int i_2_, int i_3_, int i_4_,
					boolean bool, int i_5_) {
	if (i_3_ < 1)
	    i_3_ = 1;
	if (i_4_ < 1)
	    i_4_ = 1;
	int i_6_ = i_4_ - 334;
	if (i_6_ < 0)
	    i_6_ = 0;
	else if (i_6_ > 100)
	    i_6_ = 100;
	int i_7_ = (client.aShort8551
		    + i_6_ * (client.aShort8279 - client.aShort8551) / 100);
	int i_8_ = 512 * (i_7_ * i_4_) / (i_3_ * 334);
	if (i_8_ < client.aShort8476) {
	    i_8_ = client.aShort8476;
	    i_7_ = 334 * (i_8_ * i_3_) / (i_4_ * 512);
	    if (i_7_ > client.aShort8556) {
		i_7_ = client.aShort8556;
		int i_9_ = 512 * (i_7_ * i_4_) / (334 * i_8_);
		int i_10_ = (i_3_ - i_9_) / 2;
		if (bool) {
		    Class236.aClass103_2713.method2572();
		    Class236.aClass103_2713.method2263(i, i_2_, i_10_, i_4_,
						       -16777216, (byte) -107);
		    Class236.aClass103_2713.method2263(i_3_ + i - i_10_, i_2_,
						       i_10_, i_4_, -16777216,
						       (byte) -78);
		}
		i += i_10_;
		i_3_ -= 2 * i_10_;
	    }
	} else if (i_8_ > client.aShort8558) {
	    i_8_ = client.aShort8558;
	    i_7_ = i_3_ * i_8_ * 334 / (i_4_ * 512);
	    if (i_7_ < client.aShort8555) {
		i_7_ = client.aShort8555;
		int i_11_ = 334 * (i_3_ * i_8_) / (i_7_ * 512);
		int i_12_ = (i_4_ - i_11_) / 2;
		if (bool) {
		    Class236.aClass103_2713.method2572();
		    Class236.aClass103_2713.method2263(i, i_2_, i_3_, i_12_,
						       -16777216, (byte) -98);
		    Class236.aClass103_2713.method2263(i, i_2_ + i_4_ - i_12_,
						       i_3_, i_12_, -16777216,
						       (byte) -82);
		}
		i_2_ += i_12_;
		i_4_ -= 2 * i_12_;
	    }
	}
	client.anInt8398 = -435554359 * (i_7_ * i_4_ / 334);
	client.anInt8559 = -403706817 * i;
	client.anInt8560 = i_2_ * 1308514843;
	client.anInt8561 = -1402286869 * (short) i_3_;
	client.anInt8562 = 1206253239 * (short) i_4_;
    }
}
