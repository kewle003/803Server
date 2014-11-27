/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

class Class176 implements Comparator
{
    Class393_Sub1 this$0;
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    int method3743(Class225 class225, Class225 class225_0_, int i) {
	float f = class225.method4517(-748532902);
	float f_1_ = class225_0_.method4517(-330810348);
	if (f_1_ > f)
	    return 1;
	if (f_1_ < f)
	    return -1;
	return 0;
    }
    
    public int compare(Object object, Object object_2_) {
	return method3743((Class225) object, (Class225) object_2_,
			  -1739631216);
    }
    
    public int method3744(Object object, Object object_3_) {
	return method3743((Class225) object, (Class225) object_3_,
			  -1738234253);
    }
    
    public int method3745(Object object, Object object_4_) {
	return method3743((Class225) object, (Class225) object_4_,
			  -1936826646);
    }
    
    public int method3746(Object object, Object object_5_) {
	return method3743((Class225) object, (Class225) object_5_,
			  -2123580215);
    }
    
    Class176(Class393_Sub1 class393_sub1) {
	((Class176) this).this$0 = class393_sub1;
    }
    
    public int method3747(Object object, Object object_6_) {
	return method3743((Class225) object, (Class225) object_6_,
			  -2145944786);
    }
    
    public boolean method3748(Object object) {
	return super.equals(object);
    }
    
    public boolean method3749(Object object) {
	return super.equals(object);
    }
    
    public int method3750(Object object, Object object_7_) {
	return method3743((Class225) object, (Class225) object_7_,
			  -1743311038);
    }
    
    public boolean method3751(Object object) {
	return super.equals(object);
    }
    
    static final void method3752(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class106.aClass580_1503.isMouseButtonPressed((byte) -5) ? 1 : 0;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class106.aClass580_1503.method12715(646049283) ? 1 : 0;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class106.aClass580_1503.method12713((byte) -35) ? 1 : 0;
    }
    
    static final void method3753(ClientScriptData class454, int i) {
	/* empty */
    }
    
    static final void method3754(ClientScriptData class454, int i) {
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = Class372.method6659((byte) 32);
	if (class241_sub39_sub12 != null) {
	    boolean bool
		= (class241_sub39_sub12.method17255
		   (257473507 * WorldTile.anInt10182 + Class573.anInt7388,
		    WorldTile.anInt10183 * 291545115 + Class573.anInt7389,
		    Class450.anIntArray6199, (byte) 64));
	    if (bool) {
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = Class450.anIntArray6199[1];
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = Class450.anIntArray6199[2];
	    } else {
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = -1;
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = -1;
	    }
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	}
    }
    
    static final void method3755(ClientScriptData class454, int i) {
	int i_8_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (i_8_ >= 1 && i_8_ <= 2) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub30_8878,
		 i_8_, (byte) 2);
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub30_8849,
		 i_8_, (byte) 2);
	    Class167.method3600((short) -8731);
	}
    }
    
    public static int method3756(int i, int i_9_, boolean bool, int i_10_) {
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, -672098049);
	if (null == class241_sub34)
	    return 0;
	if (i_9_ == -1)
	    return 0;
	int i_11_ = 0;
	for (int i_12_ = 0;
	     i_12_ < ((Class241_Sub34) class241_sub34).anIntArray10086.length;
	     i_12_++) {
	    if (((Class241_Sub34) class241_sub34).anIntArray10085[i_12_]
		== i_9_)
		i_11_ += (((Class241_Sub34) class241_sub34).anIntArray10086
			  [i_12_]);
	}
	return i_11_;
    }
    
    static final void method3757(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 2016113751 * GameShell3.currentFpsRate;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 2016113751 * GameShell3.currentFpsRate;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1;
    }
}
