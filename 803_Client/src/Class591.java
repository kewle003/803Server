/* Class591 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class591
{
    int[][] anIntArrayArray7621;
    static final int anInt7622 = 7;
    static final int anInt7623 = 6;
    static final int anInt7624 = 14;
    int anInt7625;
    int anInt7626;
    
    public short[] method12912(short[] is, short i) {
	if (null != ((Class591) this).anIntArrayArray7621) {
	    int i_0_
		= ((int) ((long) is.length
			  * (long) (-542836685 * ((Class591) this).anInt7625)
			  / (long) (2075597127 * ((Class591) this).anInt7626))
		   + 14);
	    int[] is_1_ = new int[i_0_];
	    int i_2_ = 0;
	    int i_3_ = 0;
	    for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
		int i_5_ = is[i_4_];
		int[] is_6_ = ((Class591) this).anIntArrayArray7621[i_3_];
		for (int i_7_ = 0; i_7_ < 14; i_7_++)
		    is_1_[i_7_ + i_2_] += is_6_[i_7_] * i_5_ >> 2;
		i_3_ += ((Class591) this).anInt7625 * -542836685;
		int i_8_ = i_3_ / (((Class591) this).anInt7626 * 2075597127);
		i_2_ += i_8_;
		i_3_ -= i_8_ * (2075597127 * ((Class591) this).anInt7626);
	    }
	    is = new short[i_0_];
	    for (int i_9_ = 0; i_9_ < i_0_; i_9_++) {
		int i_10_ = 8192 + is_1_[i_9_] >> 14;
		if (i_10_ < -32768)
		    is[i_9_] = (short) -32768;
		else if (i_10_ > 32767)
		    is[i_9_] = (short) 32767;
		else
		    is[i_9_] = (short) i_10_;
	    }
	}
	return is;
    }
    
    public Class591(int i, int i_11_) {
	if (i != i_11_) {
	    int i_12_ = Class299.method5813(i, i_11_, -973300995);
	    i /= i_12_;
	    i_11_ /= i_12_;
	    ((Class591) this).anInt7626 = 1956823159 * i;
	    ((Class591) this).anInt7625 = i_11_ * 1949221627;
	    ((Class591) this).anIntArrayArray7621 = new int[i][14];
	    for (int i_13_ = 0; i_13_ < i; i_13_++) {
		int[] is = ((Class591) this).anIntArrayArray7621[i_13_];
		double d = 6.0 + (double) i_13_ / (double) i;
		int i_14_ = (int) Math.floor(d - 7.0 + 1.0);
		if (i_14_ < 0)
		    i_14_ = 0;
		int i_15_ = (int) Math.ceil(7.0 + d);
		if (i_15_ > 14)
		    i_15_ = 14;
		double d_16_ = (double) i_11_ / (double) i;
		for (/**/; i_14_ < i_15_; i_14_++) {
		    double d_17_ = 3.141592653589793 * ((double) i_14_ - d);
		    double d_18_ = d_16_;
		    if (d_17_ < -1.0E-4 || d_17_ > 1.0E-4)
			d_18_ *= Math.sin(d_17_) / d_17_;
		    d_18_ *= 0.54 + 0.46 * Math.cos(0.2243994752564138
						    * ((double) i_14_ - d));
		    is[i_14_] = (int) Math.floor(d_18_ * 65536.0 + 0.5);
		}
	    }
	}
    }
    
    public short[] method12913(short[] is) {
	if (null != ((Class591) this).anIntArrayArray7621) {
	    int i
		= ((int) ((long) is.length
			  * (long) (-542836685 * ((Class591) this).anInt7625)
			  / (long) (2075597127 * ((Class591) this).anInt7626))
		   + 14);
	    int[] is_19_ = new int[i];
	    int i_20_ = 0;
	    int i_21_ = 0;
	    for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
		int i_23_ = is[i_22_];
		int[] is_24_ = ((Class591) this).anIntArrayArray7621[i_21_];
		for (int i_25_ = 0; i_25_ < 14; i_25_++)
		    is_19_[i_25_ + i_20_] += is_24_[i_25_] * i_23_ >> 2;
		i_21_ += ((Class591) this).anInt7625 * -542836685;
		int i_26_ = i_21_ / (((Class591) this).anInt7626 * 2075597127);
		i_20_ += i_26_;
		i_21_ -= i_26_ * (2075597127 * ((Class591) this).anInt7626);
	    }
	    is = new short[i];
	    for (int i_27_ = 0; i_27_ < i; i_27_++) {
		int i_28_ = 8192 + is_19_[i_27_] >> 14;
		if (i_28_ < -32768)
		    is[i_27_] = (short) -32768;
		else if (i_28_ > 32767)
		    is[i_27_] = (short) 32767;
		else
		    is[i_27_] = (short) i_28_;
	    }
	}
	return is;
    }
    
    public short[] method12914(short[] is) {
	if (null != ((Class591) this).anIntArrayArray7621) {
	    int i
		= ((int) ((long) is.length
			  * (long) (-542836685 * ((Class591) this).anInt7625)
			  / (long) (2075597127 * ((Class591) this).anInt7626))
		   + 14);
	    int[] is_29_ = new int[i];
	    int i_30_ = 0;
	    int i_31_ = 0;
	    for (int i_32_ = 0; i_32_ < is.length; i_32_++) {
		int i_33_ = is[i_32_];
		int[] is_34_ = ((Class591) this).anIntArrayArray7621[i_31_];
		for (int i_35_ = 0; i_35_ < 14; i_35_++)
		    is_29_[i_35_ + i_30_] += is_34_[i_35_] * i_33_ >> 2;
		i_31_ += ((Class591) this).anInt7625 * -542836685;
		int i_36_ = i_31_ / (((Class591) this).anInt7626 * 2075597127);
		i_30_ += i_36_;
		i_31_ -= i_36_ * (2075597127 * ((Class591) this).anInt7626);
	    }
	    is = new short[i];
	    for (int i_37_ = 0; i_37_ < i; i_37_++) {
		int i_38_ = 8192 + is_29_[i_37_] >> 14;
		if (i_38_ < -32768)
		    is[i_37_] = (short) -32768;
		else if (i_38_ > 32767)
		    is[i_37_] = (short) 32767;
		else
		    is[i_37_] = (short) i_38_;
	    }
	}
	return is;
    }
    
    static final void method12915(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_39_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_40_ = (((ClientScriptData) class454).integerStack
		     [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (null
	    != Class21.myPlayer.aClass490_11499) {
	    for (int i_41_ = 0; i_41_ < Class372.anIntArray5583.length;
		 i_41_++) {
		if (Class372.anIntArray5583[i_41_] == i_39_) {
		    Class21.myPlayer
			.aClass490_11499.method11211
			(i_41_, i_40_, CS2MapList.aClass350_6031, (byte) -62);
		    return;
		}
	    }
	    for (int i_42_ = 0; i_42_ < Class372.anIntArray5584.length;
		 i_42_++) {
		if (i_39_ == Class372.anIntArray5584[i_42_]) {
		    Class21.myPlayer
			.aClass490_11499.method11211
			(i_42_, i_40_, CS2MapList.aClass350_6031, (byte) -128);
		    break;
		}
	    }
	}
    }
    
    static final void method12916(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class496.method11289(class58, class35, class454, (byte) 20);
    }
    
    static final void method12917(ClientScriptData class454, byte i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_43_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_44_ = (((ClientScriptData) class454).integerStack
		     [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	Class287 class287
	    = Class287.method5561((float) i_43_, (float) i_43_, (float) i_43_);
	if (-1.0F == class287.aFloat4477)
	    class287.aFloat4477 = Float.POSITIVE_INFINITY;
	if (class287.aFloat4474 == -1.0F)
	    class287.aFloat4474 = Float.POSITIVE_INFINITY;
	if (-1.0F == class287.aFloat4479)
	    class287.aFloat4479 = Float.POSITIVE_INFINITY;
	Class445_Sub16.aClass351_Sub1_8660.method6264(class287, 2138927076);
	Class445_Sub16.aClass351_Sub1_8660.method6261((float) i_44_ / 1000.0F,
						      -2002518324);
	class287.method5564();
    }
    
    static final String[] method12918(String[] strings, int i) {
	String[] strings_45_ = new String[5];
	for (int i_46_ = 0; i_46_ < 5; i_46_++) {
	    strings_45_[i_46_]
		= new StringBuilder().append(i_46_).append(" ").toString();
	    if (strings != null && strings[i_46_] != null)
		strings_45_[i_46_]
		    = new StringBuilder().append(strings_45_[i_46_]).append
			  (strings[i_46_]).toString();
	}
	return strings_45_;
    }
}
