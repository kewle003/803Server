/* Class475_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class475_Sub1_Sub3 extends Class475_Sub1
{
    public short aShort10724;
    public static final int anInt10725 = 2;
    public static final int anInt10726 = 4;
    public static final int anInt10727 = 8;
    public static final int anInt10728 = 16;
    public static final int anInt10729 = 32;
    public static final int anInt10730 = 64;
    public static final int anInt10731 = 128;
    static int[] anIntArray10732 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    Class241_Sub43[] aClass241_Sub43Array10733;
    int anInt10734 = 0;
    public static final int anInt10735 = 1;
    
    boolean method14496(Class103 class103, byte i) {
	Class287 class287 = method10874().aClass287_4386;
	return (aClass552_8744.aClass550_7131.method12044
		(this, aByte8745,
		 ((int) class287.aFloat4477
		  >> aClass552_8744.anInt7123 * 1591782305),
		 ((int) class287.aFloat4479
		  >> 1591782305 * aClass552_8744.anInt7123)));
    }
    
    int method14458(Class241_Sub43[] class241_sub43s, int i) {
	if (aBool6394) {
	    Class287 class287 = method10874().aClass287_4386;
	    int i_0_ = ((int) class287.aFloat4477
			>> 1591782305 * aClass552_8744.anInt7123);
	    int i_1_ = ((int) class287.aFloat4479
			>> aClass552_8744.anInt7123 * 1591782305);
	    int i_2_ = 0;
	    if (-985319149 * ((Class552) aClass552_8744).anInt7128 == i_0_)
		i_2_++;
	    else if (((Class552) aClass552_8744).anInt7128 * -985319149 < i_0_)
		i_2_ += 2;
	    if (((Class552) aClass552_8744).anInt7160 * -1234452287 == i_1_)
		i_2_ += 3;
	    else if (((Class552) aClass552_8744).anInt7160 * -1234452287
		     > i_1_)
		i_2_ += 6;
	    int i_3_ = anIntArray10732[i_2_];
	    if (0 == (aShort10724 & i_3_)) {
		if (1 == aShort10724 && i_0_ > 0)
		    i_0_--;
		else if (4 == aShort10724
			 && i_0_ <= aClass552_8744.anInt7138 * 120442351)
		    i_0_++;
		else if (aShort10724 == 8 && i_1_ > 0)
		    i_1_--;
		else if (aShort10724 == 2
			 && i_1_ <= -2069974325 * aClass552_8744.anInt7142)
		    i_1_++;
		else if (aShort10724 == 16 && i_0_ > 0
			 && i_1_ <= -2069974325 * aClass552_8744.anInt7142) {
		    i_0_--;
		    i_1_++;
		} else if (32 == aShort10724
			   && i_0_ <= aClass552_8744.anInt7138 * 120442351
			   && i_1_ <= aClass552_8744.anInt7142 * -2069974325) {
		    i_0_++;
		    i_1_++;
		} else if (aShort10724 == 128 && i_0_ > 0 && i_1_ > 0) {
		    i_0_--;
		    i_1_--;
		} else if (aShort10724 == 64
			   && i_0_ <= 120442351 * aClass552_8744.anInt7138
			   && i_1_ > 0) {
		    i_0_++;
		    i_1_--;
		} else
		    throw new RuntimeException("");
	    }
	    ((Class475_Sub1_Sub3) this).anInt10734
		= method14463(i_0_, i_1_,
			      (((Class475_Sub1_Sub3) this)
			       .aClass241_Sub43Array10733),
			      -1882131585) * -993630499;
	    aBool6394 = false;
	}
	for (int i_4_ = 0;
	     i_4_ < -32857739 * ((Class475_Sub1_Sub3) this).anInt10734; i_4_++)
	    class241_sub43s[i_4_]
		= ((Class475_Sub1_Sub3) this).aClass241_Sub43Array10733[i_4_];
	return -32857739 * ((Class475_Sub1_Sub3) this).anInt10734;
    }
    
    Class475_Sub1_Sub3(Class552 class552, int i, int i_5_, int i_6_, int i_7_,
		       int i_8_, int i_9_) {
	super(class552);
	((Class475_Sub1_Sub3) this).aClass241_Sub43Array10733
	    = new Class241_Sub43[4];
	nodePlane = (byte) i_7_;
	aByte8745 = (byte) i_8_;
	aShort10724 = (short) i_9_;
	method10898(new Class287((float) i, (float) i_5_, (float) i_6_));
	for (int i_10_ = 0; i_10_ < 4; i_10_++)
	    ((Class475_Sub1_Sub3) this).aClass241_Sub43Array10733[i_10_]
		= null;
    }
    
    boolean method14460(int i) {
	Class287 class287 = method10874().aClass287_4386;
	return (((Class552) aClass552_8744).aBoolArrayArray7134
		[(((int) class287.aFloat4477
		   >> aClass552_8744.anInt7123 * 1591782305)
		  - -985319149 * ((Class552) aClass552_8744).anInt7128
		  + ((Class552) aClass552_8744).anInt7165 * 1222806433)]
		[(((int) class287.aFloat4479
		   >> aClass552_8744.anInt7123 * 1591782305)
		  - -1234452287 * ((Class552) aClass552_8744).anInt7160
		  + 1222806433 * ((Class552) aClass552_8744).anInt7165)]);
    }
    
    int method14489(Class241_Sub43[] class241_sub43s) {
	if (aBool6394) {
	    Class287 class287 = method10874().aClass287_4386;
	    int i = ((int) class287.aFloat4477
		     >> 1591782305 * aClass552_8744.anInt7123);
	    int i_11_ = ((int) class287.aFloat4479
			 >> aClass552_8744.anInt7123 * 1591782305);
	    int i_12_ = 0;
	    if (-985319149 * ((Class552) aClass552_8744).anInt7128 == i)
		i_12_++;
	    else if (((Class552) aClass552_8744).anInt7128 * -985319149 < i)
		i_12_ += 2;
	    if (((Class552) aClass552_8744).anInt7160 * -1234452287 == i_11_)
		i_12_ += 3;
	    else if (((Class552) aClass552_8744).anInt7160 * -1234452287
		     > i_11_)
		i_12_ += 6;
	    int i_13_ = anIntArray10732[i_12_];
	    if (0 == (aShort10724 & i_13_)) {
		if (1 == aShort10724 && i > 0)
		    i--;
		else if (4 == aShort10724
			 && i <= aClass552_8744.anInt7138 * 120442351)
		    i++;
		else if (aShort10724 == 8 && i_11_ > 0)
		    i_11_--;
		else if (aShort10724 == 2
			 && i_11_ <= -2069974325 * aClass552_8744.anInt7142)
		    i_11_++;
		else if (aShort10724 == 16 && i > 0
			 && i_11_ <= -2069974325 * aClass552_8744.anInt7142) {
		    i--;
		    i_11_++;
		} else if (32 == aShort10724
			   && i <= aClass552_8744.anInt7138 * 120442351
			   && (i_11_
			       <= aClass552_8744.anInt7142 * -2069974325)) {
		    i++;
		    i_11_++;
		} else if (aShort10724 == 128 && i > 0 && i_11_ > 0) {
		    i--;
		    i_11_--;
		} else if (aShort10724 == 64
			   && i <= 120442351 * aClass552_8744.anInt7138
			   && i_11_ > 0) {
		    i++;
		    i_11_--;
		} else
		    throw new RuntimeException("");
	    }
	    ((Class475_Sub1_Sub3) this).anInt10734
		= method14463(i, i_11_,
			      (((Class475_Sub1_Sub3) this)
			       .aClass241_Sub43Array10733),
			      -1882131585) * -993630499;
	    aBool6394 = false;
	}
	for (int i = 0; i < -32857739 * ((Class475_Sub1_Sub3) this).anInt10734;
	     i++)
	    class241_sub43s[i]
		= ((Class475_Sub1_Sub3) this).aClass241_Sub43Array10733[i];
	return -32857739 * ((Class475_Sub1_Sub3) this).anInt10734;
    }
    
    boolean method14490(Class103 class103) {
	Class287 class287 = method10874().aClass287_4386;
	return (aClass552_8744.aClass550_7131.method12044
		(this, aByte8745,
		 ((int) class287.aFloat4477
		  >> aClass552_8744.anInt7123 * 1591782305),
		 ((int) class287.aFloat4479
		  >> 1591782305 * aClass552_8744.anInt7123)));
    }
    
    boolean method14462(Class103 class103) {
	Class287 class287 = method10874().aClass287_4386;
	return (aClass552_8744.aClass550_7131.method12044
		(this, aByte8745,
		 ((int) class287.aFloat4477
		  >> aClass552_8744.anInt7123 * 1591782305),
		 ((int) class287.aFloat4479
		  >> 1591782305 * aClass552_8744.anInt7123)));
    }
    
    boolean method14486() {
	Class287 class287 = method10874().aClass287_4386;
	return (((Class552) aClass552_8744).aBoolArrayArray7134
		[(((int) class287.aFloat4477
		   >> aClass552_8744.anInt7123 * 1591782305)
		  - -985319149 * ((Class552) aClass552_8744).anInt7128
		  + ((Class552) aClass552_8744).anInt7165 * 1222806433)]
		[(((int) class287.aFloat4479
		   >> aClass552_8744.anInt7123 * 1591782305)
		  - -1234452287 * ((Class552) aClass552_8744).anInt7160
		  + 1222806433 * ((Class552) aClass552_8744).anInt7165)]);
    }
    
    public static Class241_Sub27 method17004(int i) {
	Class241_Sub27 class241_sub27 = Class105_Sub1.method15442((byte) 82);
	((Class241_Sub27) class241_sub27).opcode = null;
	((Class241_Sub27) class241_sub27).expectedSize = 0;
	class241_sub27.data = new RSBitBuffer(5000);
	return class241_sub27;
    }
}
