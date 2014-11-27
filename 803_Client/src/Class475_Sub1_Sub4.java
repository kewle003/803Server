/* Class475_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class475_Sub1_Sub4 extends Class475_Sub1
{
    int anInt10740 = 0;
    Class241_Sub43[] aClass241_Sub43Array10741 = new Class241_Sub43[4];
    public short aShort10742;
    
    int method14458(Class241_Sub43[] class241_sub43s, int i) {
	if (aBool6394) {
	    Class287 class287 = method10874().aClass287_4386;
	    ((Class475_Sub1_Sub4) this).anInt10740
		= method14463(((int) class287.aFloat4477
			       >> 1591782305 * aClass552_8744.anInt7123),
			      ((int) class287.aFloat4479
			       >> 1591782305 * aClass552_8744.anInt7123),
			      (((Class475_Sub1_Sub4) this)
			       .aClass241_Sub43Array10741),
			      -1882131585) * -1212067923;
	    aBool6394 = false;
	}
	for (int i_0_ = 0;
	     i_0_ < ((Class475_Sub1_Sub4) this).anInt10740 * 1837952037;
	     i_0_++)
	    class241_sub43s[i_0_]
		= ((Class475_Sub1_Sub4) this).aClass241_Sub43Array10741[i_0_];
	return 1837952037 * ((Class475_Sub1_Sub4) this).anInt10740;
    }
    
    boolean method14490(Class103 class103) {
	Class287 class287 = method10874().aClass287_4386;
	return (aClass552_8744.aClass550_7131.method12043
		(aByte8745,
		 ((int) class287.aFloat4477
		  >> 1591782305 * aClass552_8744.anInt7123),
		 ((int) class287.aFloat4479
		  >> 1591782305 * aClass552_8744.anInt7123)));
    }
    
    boolean method14496(Class103 class103, byte i) {
	Class287 class287 = method10874().aClass287_4386;
	return (aClass552_8744.aClass550_7131.method12043
		(aByte8745,
		 ((int) class287.aFloat4477
		  >> 1591782305 * aClass552_8744.anInt7123),
		 ((int) class287.aFloat4479
		  >> 1591782305 * aClass552_8744.anInt7123)));
    }
    
    boolean method14460(int i) {
	Class287 class287 = method10874().aClass287_4386;
	return (((Class552) aClass552_8744).aBoolArrayArray7134
		[(1222806433 * ((Class552) aClass552_8744).anInt7165
		  + (((int) class287.aFloat4477
		      >> 1591782305 * aClass552_8744.anInt7123)
		     - -985319149 * ((Class552) aClass552_8744).anInt7128))]
		[(((int) class287.aFloat4479
		   >> aClass552_8744.anInt7123 * 1591782305)
		  - -1234452287 * ((Class552) aClass552_8744).anInt7160
		  + ((Class552) aClass552_8744).anInt7165 * 1222806433)]);
    }
    
    int method14489(Class241_Sub43[] class241_sub43s) {
	if (aBool6394) {
	    Class287 class287 = method10874().aClass287_4386;
	    ((Class475_Sub1_Sub4) this).anInt10740
		= method14463(((int) class287.aFloat4477
			       >> 1591782305 * aClass552_8744.anInt7123),
			      ((int) class287.aFloat4479
			       >> 1591782305 * aClass552_8744.anInt7123),
			      (((Class475_Sub1_Sub4) this)
			       .aClass241_Sub43Array10741),
			      -1882131585) * -1212067923;
	    aBool6394 = false;
	}
	for (int i = 0;
	     i < ((Class475_Sub1_Sub4) this).anInt10740 * 1837952037; i++)
	    class241_sub43s[i]
		= ((Class475_Sub1_Sub4) this).aClass241_Sub43Array10741[i];
	return 1837952037 * ((Class475_Sub1_Sub4) this).anInt10740;
    }
    
    boolean method14462(Class103 class103) {
	Class287 class287 = method10874().aClass287_4386;
	return (aClass552_8744.aClass550_7131.method12043
		(aByte8745,
		 ((int) class287.aFloat4477
		  >> 1591782305 * aClass552_8744.anInt7123),
		 ((int) class287.aFloat4479
		  >> 1591782305 * aClass552_8744.anInt7123)));
    }
    
    Class475_Sub1_Sub4(Class552 class552, int i, int i_1_, int i_2_, int i_3_,
		       int i_4_, int i_5_) {
	super(class552);
	nodePlane = (byte) i_3_;
	aByte8745 = (byte) i_4_;
	aShort10742 = (short) i_5_;
	method10898(new Class287((float) i, (float) i_1_, (float) i_2_));
	for (int i_6_ = 0; i_6_ < 4; i_6_++)
	    ((Class475_Sub1_Sub4) this).aClass241_Sub43Array10741[i_6_] = null;
    }
    
    boolean method14486() {
	Class287 class287 = method10874().aClass287_4386;
	return (((Class552) aClass552_8744).aBoolArrayArray7134
		[(1222806433 * ((Class552) aClass552_8744).anInt7165
		  + (((int) class287.aFloat4477
		      >> 1591782305 * aClass552_8744.anInt7123)
		     - -985319149 * ((Class552) aClass552_8744).anInt7128))]
		[(((int) class287.aFloat4479
		   >> aClass552_8744.anInt7123 * 1591782305)
		  - -1234452287 * ((Class552) aClass552_8744).anInt7160
		  + ((Class552) aClass552_8744).anInt7165 * 1222806433)]);
    }
}
