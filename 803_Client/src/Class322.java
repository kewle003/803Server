/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class322
{
    Class322 aClass322_4901;
    float aFloat4902;
    Interface29 anInterface29_4903;
    float aFloat4904;
    float aFloat4905;
    float aFloat4906;
    long aLong4907;
    long aLong4908;
    public static int anInt4909;
    static long aLong4910;
    
    public void method5933(float f) {
	if (null == ((Class322) this).anInterface29_4903) {
	    ((Class322) this).aFloat4905 = f;
	    ((Class322) this).aFloat4906 = ((Class322) this).aFloat4902;
	    ((Class322) this).aLong4907
		= Class50.method1249((byte) 1) * 7198901118626061499L;
	    ((Class322) this).aLong4908
		= (7204357398973206311L * ((Class322) this).aLong4907
		   + 6827801048069137620L);
	}
    }
    
    public float method5934(int i) {
	float f = ((Class322) this).aFloat4902;
	for (Class322 class322_0_ = ((Class322) this).aClass322_4901;
	     null != class322_0_;
	     class322_0_ = class322_0_.method5939(490929106))
	    f *= class322_0_.method5937(1094734409);
	f = Math.min(Math.max(f, 0.0F), 1.0F);
	return f;
    }
    
    public float method5935(int i) {
	float f = 1.0F;
	for (Class322 class322_1_ = this; null != class322_1_;
	     class322_1_ = class322_1_.method5939(717510801))
	    f *= class322_1_.method5948(1016103124);
	return f;
    }
    
    Class322(int i, float f, Object object, Class308 class308,
	     Interface29 interface29, Class322 class322_2_) {
	((Class322) this).aClass322_4901 = class322_2_;
	((Class322) this).anInterface29_4903 = interface29;
	((Class322) this).aFloat4902 = 1.0F;
	((Class322) this).aFloat4904 = f;
	((Class322) this).aFloat4906 = -1.0F;
	((Class322) this).aFloat4905 = -1.0F;
	((Class322) this).aLong4907 = -7198901118626061499L;
	((Class322) this).aLong4908 = -5602301232593556861L;
    }
    
    public float method5936() {
	float f = 1.0F;
	for (Class322 class322_3_ = this; null != class322_3_;
	     class322_3_ = class322_3_.method5939(-4106137))
	    f *= class322_3_.method5948(-636447187);
	return f;
    }
    
    public float method5937(int i) {
	return ((Class322) this).aFloat4902;
    }
    
    public void method5938(float f, int i) {
	if (null == ((Class322) this).anInterface29_4903) {
	    ((Class322) this).aFloat4905 = f;
	    ((Class322) this).aFloat4906 = ((Class322) this).aFloat4902;
	    ((Class322) this).aLong4907
		= Class50.method1249((byte) 1) * 7198901118626061499L;
	    ((Class322) this).aLong4908
		= (7204357398973206311L * ((Class322) this).aLong4907
		   + 6827801048069137620L);
	}
    }
    
    public Class322 method5939(int i) {
	return ((Class322) this).aClass322_4901;
    }
    
    float method5940() {
	return ((Class322) this).aFloat4904;
    }
    
    float method5941() {
	return ((Class322) this).aFloat4904;
    }
    
    float method5942() {
	return ((Class322) this).aFloat4904;
    }
    
    float method5943() {
	return ((Class322) this).aFloat4904;
    }
    
    void method5944(int i) {
	if (((Class322) this).anInterface29_4903 != null) {
	    float f
		= ((Class322) this).anInterface29_4903.method174(1606592450);
	    if (f != ((Class322) this).aFloat4902
		&& ((Class322) this).aFloat4905 < 0.0F) {
		((Class322) this).aFloat4906 = ((Class322) this).aFloat4902;
		((Class322) this).aFloat4905 = f;
		((Class322) this).aLong4907
		    = Class50.method1249((byte) 1) * 7198901118626061499L;
		((Class322) this).aLong4908
		    = (((Class322) this).aLong4907 * 7204357398973206311L
		       + 6827801048069137620L);
	    }
	}
	if (((Class322) this).aFloat4905 >= 0.0F) {
	    long l = Class50.method1249((byte) 1);
	    if (l > -6140006533157483563L * ((Class322) this).aLong4908) {
		((Class322) this).aFloat4902 = ((Class322) this).aFloat4905;
		((Class322) this).aFloat4905 = -1.0F;
	    } else {
		float f = (((Class322) this).aFloat4905
			   - ((Class322) this).aFloat4906);
		long l_4_
		    = (-6140006533157483563L * ((Class322) this).aLong4908
		       - -3815530028666746765L * ((Class322) this).aLong4907);
		float f_5_ = f / (float) l_4_;
		((Class322) this).aFloat4902
		    = (((Class322) this).aFloat4906
		       + (float) (l - (((Class322) this).aLong4907
				       * -3815530028666746765L)) * f_5_);
		if (((Class322) this).aFloat4902
		    == ((Class322) this).aFloat4905)
		    ((Class322) this).aFloat4905 = -1.0F;
	    }
	}
	((Class322) this).aFloat4902
	    = Math.min(1.0F, Math.max(((Class322) this).aFloat4902, 0.0F));
    }
    
    void method5945() {
	if (((Class322) this).anInterface29_4903 != null) {
	    float f
		= ((Class322) this).anInterface29_4903.method174(-1333115451);
	    if (f != ((Class322) this).aFloat4902
		&& ((Class322) this).aFloat4905 < 0.0F) {
		((Class322) this).aFloat4906 = ((Class322) this).aFloat4902;
		((Class322) this).aFloat4905 = f;
		((Class322) this).aLong4907
		    = Class50.method1249((byte) 1) * 7198901118626061499L;
		((Class322) this).aLong4908
		    = (((Class322) this).aLong4907 * 7204357398973206311L
		       + 6827801048069137620L);
	    }
	}
	if (((Class322) this).aFloat4905 >= 0.0F) {
	    long l = Class50.method1249((byte) 1);
	    if (l > -6140006533157483563L * ((Class322) this).aLong4908) {
		((Class322) this).aFloat4902 = ((Class322) this).aFloat4905;
		((Class322) this).aFloat4905 = -1.0F;
	    } else {
		float f = (((Class322) this).aFloat4905
			   - ((Class322) this).aFloat4906);
		long l_6_
		    = (-6140006533157483563L * ((Class322) this).aLong4908
		       - -3815530028666746765L * ((Class322) this).aLong4907);
		float f_7_ = f / (float) l_6_;
		((Class322) this).aFloat4902
		    = (((Class322) this).aFloat4906
		       + (float) (l - (((Class322) this).aLong4907
				       * -3815530028666746765L)) * f_7_);
		if (((Class322) this).aFloat4902
		    == ((Class322) this).aFloat4905)
		    ((Class322) this).aFloat4905 = -1.0F;
	    }
	}
	((Class322) this).aFloat4902
	    = Math.min(1.0F, Math.max(((Class322) this).aFloat4902, 0.0F));
    }
    
    void method5946() {
	if (((Class322) this).anInterface29_4903 != null) {
	    float f
		= ((Class322) this).anInterface29_4903.method174(1432892346);
	    if (f != ((Class322) this).aFloat4902
		&& ((Class322) this).aFloat4905 < 0.0F) {
		((Class322) this).aFloat4906 = ((Class322) this).aFloat4902;
		((Class322) this).aFloat4905 = f;
		((Class322) this).aLong4907
		    = Class50.method1249((byte) 1) * 7198901118626061499L;
		((Class322) this).aLong4908
		    = (((Class322) this).aLong4907 * 7204357398973206311L
		       + 6827801048069137620L);
	    }
	}
	if (((Class322) this).aFloat4905 >= 0.0F) {
	    long l = Class50.method1249((byte) 1);
	    if (l > -6140006533157483563L * ((Class322) this).aLong4908) {
		((Class322) this).aFloat4902 = ((Class322) this).aFloat4905;
		((Class322) this).aFloat4905 = -1.0F;
	    } else {
		float f = (((Class322) this).aFloat4905
			   - ((Class322) this).aFloat4906);
		long l_8_
		    = (-6140006533157483563L * ((Class322) this).aLong4908
		       - -3815530028666746765L * ((Class322) this).aLong4907);
		float f_9_ = f / (float) l_8_;
		((Class322) this).aFloat4902
		    = (((Class322) this).aFloat4906
		       + (float) (l - (((Class322) this).aLong4907
				       * -3815530028666746765L)) * f_9_);
		if (((Class322) this).aFloat4902
		    == ((Class322) this).aFloat4905)
		    ((Class322) this).aFloat4905 = -1.0F;
	    }
	}
	((Class322) this).aFloat4902
	    = Math.min(1.0F, Math.max(((Class322) this).aFloat4902, 0.0F));
    }
    
    public float method5947() {
	return ((Class322) this).aFloat4902;
    }
    
    float method5948(int i) {
	return ((Class322) this).aFloat4904;
    }
    
    public void method5949(float f) {
	if (null == ((Class322) this).anInterface29_4903) {
	    ((Class322) this).aFloat4905 = f;
	    ((Class322) this).aFloat4906 = ((Class322) this).aFloat4902;
	    ((Class322) this).aLong4907
		= Class50.method1249((byte) 1) * 7198901118626061499L;
	    ((Class322) this).aLong4908
		= (7204357398973206311L * ((Class322) this).aLong4907
		   + 6827801048069137620L);
	}
    }
    
    static final void method5950(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_10_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_11_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	Class445_Sub16.aClass351_Sub1_8660
	    .method6272((float) i_10_, (float) i_11_, (byte) -10);
    }
    
    static final void method5951(Class475_Sub1 class475_sub1,
				 ClientScriptData class454, byte i) {
	boolean bool = false;
	int i_12_ = 0;
	int i_13_ = 0;
	int i_14_ = 0;
	int i_15_ = 0;
	if (null != class475_sub1.aClass97Array8748) {
	    for (int i_16_ = 0; i_16_ < class475_sub1.aClass97Array8748.length;
		 i_16_++) {
		Class97 class97 = class475_sub1.aClass97Array8748[i_16_];
		if (class97.aBool1352) {
		    int i_17_;
		    int i_18_;
		    if (class97.anInt1350 < class97.anInt1349) {
			i_17_ = class97.anInt1350 - class97.anInt1348;
			i_18_ = class97.anInt1349 + class97.anInt1348;
		    } else {
			i_17_ = class97.anInt1349 - class97.anInt1348;
			i_18_ = class97.anInt1348 + class97.anInt1350;
		    }
		    int i_19_;
		    int i_20_;
		    if (class97.anInt1351 < class97.anInt1347) {
			i_19_ = class97.anInt1351 - class97.anInt1348;
			i_20_ = class97.anInt1348 + class97.anInt1347;
		    } else {
			i_19_ = class97.anInt1347 - class97.anInt1348;
			i_20_ = class97.anInt1351 + class97.anInt1348;
		    }
		    if (!bool || i_17_ < i_12_)
			i_12_ = i_17_;
		    if (!bool || i_19_ < i_13_)
			i_13_ = i_19_;
		    if (!bool || i_18_ > i_14_)
			i_14_ = i_18_;
		    if (!bool || i_20_ > i_15_)
			i_15_ = i_20_;
		    bool = true;
		}
	    }
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = bool ? 1 : 0;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_12_;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_13_;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_14_;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_15_;
    }
    
    static void method5952(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [1482319719 * ((ClientScriptData) class454).intStackPointer - 1]
	    = (Class326_Sub3.aClass482_10288.method11010
	       ((((ClientScriptData) class454).integerStack
		 [((ClientScriptData) class454).intStackPointer * 1482319719 - 1]),
		(short) 3307)
	       .anInt6419) * -104133169;
    }
    
    static boolean method5953(int i) {
	Class13.anInt77 = 1651570860;
	Exception_Sub5.aClass190_10704 = client.aClass190_8339;
	return (CcDeltaNode.method15095
		(Class13.aLong82 * -3469600135743429117L == -1L, true, "", "",
		 Class13.aLong82 * -3469600135743429117L));
    }
    
    static final void method5954(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	class58.anInt879
	    = (((ClientScriptData) class454).integerStack
	       [((ClientScriptData) class454).intStackPointer * 1482319719]) * 2003393911;
	class58.anInt880
	    = (-424199415
	       * (((ClientScriptData) class454).integerStack
		  [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]));
	if (1 == (((ClientScriptData) class454).integerStack
		  [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]))
	    class58.modelType = -137137195;
	else
	    class58.modelType = 832537448;
	if ((((ClientScriptData) class454).integerStack
	     [3 + ((ClientScriptData) class454).intStackPointer * 1482319719])
	    == 1)
	    class58.aBool988 = true;
	else
	    class58.aBool988 = false;
	if (class58.slot1 * -389932081 == -1 && !class35.aBool374)
	    Class120_Sub7.method16774(445907013 * class58.componentHash,
				      1436351602);
    }
    
    static final void method5955(ClientScriptData class454, int i) {
	int i_21_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_21_, (byte) -88);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_21_ >> 16];
	Class294.method5697(class58, class35, class454, 2065155123);
    }
    
    public static int method5956(Class278 class278, byte i) {
	Class287 class287 = Class287.method5561(0.0F, 0.0F, 1.0F);
	class287.method5592(class278);
	double d = Math.atan2((double) class287.aFloat4477,
			      (double) class287.aFloat4479);
	class287.method5564();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
    }
}
