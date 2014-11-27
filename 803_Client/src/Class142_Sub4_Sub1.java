/* Class142_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class142_Sub4_Sub1 extends Class142_Sub4
{
    boolean aBool10698;
    int anInt10699;
    float aFloat10700;
    float aFloat10701;
    boolean aBool10702;
    int anInt10703;
    
    static Class142_Sub4_Sub1 method16946
	(Class103_Sub1 class103_sub1, Class175 class175, Class102 class102,
	 int i, int i_0_, boolean bool, byte[] is, Class175 class175_1_) {
	if (((Class103_Sub1) class103_sub1).aBool9213
	    || (Class76.method1772(i, (byte) 92)
		&& Class76.method1772(i_0_, (byte) 42)))
	    return new Class142_Sub4_Sub1(class103_sub1, 3553, class175,
					  class102, i, i_0_, bool, is,
					  class175_1_);
	if (((Class103_Sub1) class103_sub1).aBool9211)
	    return new Class142_Sub4_Sub1(class103_sub1, 34037, class175,
					  class102, i, i_0_, bool, is,
					  class175_1_);
	return new Class142_Sub4_Sub1(class103_sub1, class175, class102, i,
				      i_0_, Class480.method11001(i, (byte) 44),
				      Class480.method11001(i_0_, (byte) -6),
				      is, class175_1_);
    }
    
    static Class142_Sub4_Sub1 method16947(Class103_Sub1 class103_sub1, int i,
					  int i_2_, boolean bool, int[] is,
					  int i_3_, int i_4_) {
	if (((Class103_Sub1) class103_sub1).aBool9213
	    || (Class76.method1772(i, (byte) 14)
		&& Class76.method1772(i_2_, (byte) 53)))
	    return new Class142_Sub4_Sub1(class103_sub1, 3553, i, i_2_, bool,
					  is, i_3_, i_4_);
	if (((Class103_Sub1) class103_sub1).aBool9211)
	    return new Class142_Sub4_Sub1(class103_sub1, 34037, i, i_2_, bool,
					  is, i_3_, i_4_);
	return new Class142_Sub4_Sub1(class103_sub1, i, i_2_,
				      Class480.method11001(i, (byte) -21),
				      Class480.method11001(i_2_, (byte) 36),
				      is);
    }
    
    void method3184(boolean bool) {
	super.method3168(bool && !((Class142_Sub4_Sub1) this).aBool10698);
    }
    
    static Class142_Sub4_Sub1 method16948(Class103_Sub1 class103_sub1, int i,
					  int i_5_, int i_6_, int i_7_) {
	if (((Class103_Sub1) class103_sub1).aBool9213
	    || (Class76.method1772(i_6_, (byte) 72)
		&& Class76.method1772(i_7_, (byte) 115)))
	    return new Class142_Sub4_Sub1(class103_sub1, 3553, i, i_5_, i_6_,
					  i_7_, true);
	if (((Class103_Sub1) class103_sub1).aBool9211)
	    return new Class142_Sub4_Sub1(class103_sub1, 34037, i, i_5_, i_6_,
					  i_7_, true);
	return new Class142_Sub4_Sub1(class103_sub1, i, i_5_, i_6_, i_7_,
				      Class480.method11001(i_6_, (byte) -102),
				      Class480.method11001(i_7_, (byte) 1),
				      true);
    }
    
    Class142_Sub4_Sub1(Class103_Sub1 class103_sub1, int i, Class175 class175,
		       Class102 class102, int i_8_, int i_9_) {
	super(class103_sub1, i, class175, class102, i_8_, i_9_);
	((Class142_Sub4_Sub1) this).anInt10699 = i_8_;
	((Class142_Sub4_Sub1) this).anInt10703 = i_9_;
	if (((Class142_Sub4_Sub1) this).anInt1654 == 34037) {
	    ((Class142_Sub4_Sub1) this).aFloat10700 = (float) i_9_;
	    ((Class142_Sub4_Sub1) this).aFloat10701 = (float) i_8_;
	    ((Class142_Sub4_Sub1) this).aBool10702 = false;
	} else {
	    ((Class142_Sub4_Sub1) this).aFloat10700 = 1.0F;
	    ((Class142_Sub4_Sub1) this).aFloat10701 = 1.0F;
	    ((Class142_Sub4_Sub1) this).aBool10702 = true;
	}
	((Class142_Sub4_Sub1) this).aBool10698 = false;
    }
    
    Class142_Sub4_Sub1(Class103_Sub1 class103_sub1, int i, int i_10_,
		       int i_11_, boolean bool, int[] is, int i_12_,
		       int i_13_) {
	super(class103_sub1, i, i_10_, i_11_, bool, is, i_12_, i_13_, true);
	((Class142_Sub4_Sub1) this).anInt10699 = i_10_;
	((Class142_Sub4_Sub1) this).anInt10703 = i_11_;
	if (((Class142_Sub4_Sub1) this).anInt1654 == 34037) {
	    ((Class142_Sub4_Sub1) this).aFloat10700 = (float) i_11_;
	    ((Class142_Sub4_Sub1) this).aFloat10701 = (float) i_10_;
	    ((Class142_Sub4_Sub1) this).aBool10702 = false;
	} else {
	    ((Class142_Sub4_Sub1) this).aFloat10700 = 1.0F;
	    ((Class142_Sub4_Sub1) this).aFloat10701 = 1.0F;
	    ((Class142_Sub4_Sub1) this).aBool10702 = true;
	}
	((Class142_Sub4_Sub1) this).aBool10698 = false;
    }
    
    Class142_Sub4_Sub1(Class103_Sub1 class103_sub1, int i, Class175 class175,
		       Class102 class102, int i_14_, int i_15_, boolean bool,
		       byte[] is, Class175 class175_16_) {
	super(class103_sub1, i, class175, class102, i_14_, i_15_, bool, is,
	      class175_16_, true);
	((Class142_Sub4_Sub1) this).anInt10699 = i_14_;
	((Class142_Sub4_Sub1) this).anInt10703 = i_15_;
	if (((Class142_Sub4_Sub1) this).anInt1654 == 34037) {
	    ((Class142_Sub4_Sub1) this).aFloat10700 = (float) i_15_;
	    ((Class142_Sub4_Sub1) this).aFloat10701 = (float) i_14_;
	    ((Class142_Sub4_Sub1) this).aBool10702 = false;
	} else {
	    ((Class142_Sub4_Sub1) this).aFloat10700 = 1.0F;
	    ((Class142_Sub4_Sub1) this).aFloat10701 = 1.0F;
	    ((Class142_Sub4_Sub1) this).aBool10702 = true;
	}
	((Class142_Sub4_Sub1) this).aBool10698 = false;
    }
    
    Class142_Sub4_Sub1(Class103_Sub1 class103_sub1, int i, int i_17_,
		       int i_18_, int i_19_, int i_20_, boolean bool) {
	super(class103_sub1, i, i_17_, i_18_, i_19_, i_20_);
	((Class142_Sub4_Sub1) this).anInt10699 = i_19_;
	((Class142_Sub4_Sub1) this).anInt10703 = i_20_;
	if (((Class142_Sub4_Sub1) this).anInt1654 == 34037) {
	    ((Class142_Sub4_Sub1) this).aFloat10700 = (float) i_20_;
	    ((Class142_Sub4_Sub1) this).aFloat10701 = (float) i_19_;
	    ((Class142_Sub4_Sub1) this).aBool10702 = false;
	} else {
	    ((Class142_Sub4_Sub1) this).aFloat10700 = 1.0F;
	    ((Class142_Sub4_Sub1) this).aFloat10701 = 1.0F;
	    ((Class142_Sub4_Sub1) this).aBool10702 = true;
	}
	((Class142_Sub4_Sub1) this).aBool10698 = false;
    }
    
    Class142_Sub4_Sub1(Class103_Sub1 class103_sub1, Class175 class175,
		       Class102 class102, int i, int i_21_, int i_22_,
		       int i_23_) {
	super(class103_sub1, 3553, class175, class102, i_22_, i_23_);
	((Class142_Sub4_Sub1) this).anInt10699 = i;
	((Class142_Sub4_Sub1) this).anInt10703 = i_21_;
	((Class142_Sub4_Sub1) this).aFloat10700
	    = (float) i_21_ / (float) i_23_;
	((Class142_Sub4_Sub1) this).aFloat10701 = (float) i / (float) i_22_;
	((Class142_Sub4_Sub1) this).aBool10702 = false;
	((Class142_Sub4_Sub1) this).aBool10698 = true;
	method16906(false, false);
    }
    
    static Class142_Sub4_Sub1 method16949(Class103_Sub1 class103_sub1,
					  Class175 class175, Class102 class102,
					  int i, int i_24_) {
	if (((Class103_Sub1) class103_sub1).aBool9213
	    || (Class76.method1772(i, (byte) 28)
		&& Class76.method1772(i_24_, (byte) 106)))
	    return new Class142_Sub4_Sub1(class103_sub1, 3553, class175,
					  class102, i, i_24_);
	if (((Class103_Sub1) class103_sub1).aBool9211)
	    return new Class142_Sub4_Sub1(class103_sub1, 34037, class175,
					  class102, i, i_24_);
	return new Class142_Sub4_Sub1(class103_sub1, class175, class102, i,
				      i_24_,
				      Class480.method11001(i, (byte) 36),
				      Class480.method11001(i_24_, (byte) -71));
    }
    
    Class142_Sub4_Sub1(Class103_Sub1 class103_sub1, Class175 class175,
		       Class102 class102, int i, int i_25_, int i_26_,
		       int i_27_, byte[] is, Class175 class175_28_) {
	super(class103_sub1, 3553, class175, class102, i_26_, i_27_);
	((Class142_Sub4_Sub1) this).anInt10699 = i;
	((Class142_Sub4_Sub1) this).anInt10703 = i_25_;
	method16903(0, i_27_ - i_25_, i, i_25_, is, class175_28_, 0, 0, true);
	((Class142_Sub4_Sub1) this).aFloat10700
	    = (float) i_25_ / (float) i_27_;
	((Class142_Sub4_Sub1) this).aFloat10701 = (float) i / (float) i_26_;
	((Class142_Sub4_Sub1) this).aBool10702 = false;
	((Class142_Sub4_Sub1) this).aBool10698 = true;
	method16906(false, false);
    }
    
    Class142_Sub4_Sub1(Class103_Sub1 class103_sub1, int i, int i_29_,
		       int i_30_, int i_31_, int i_32_, int i_33_,
		       boolean bool) {
	super(class103_sub1, 3553, i, i_29_, i_32_, i_33_);
	((Class142_Sub4_Sub1) this).anInt10699 = i_30_;
	((Class142_Sub4_Sub1) this).anInt10703 = i_31_;
	((Class142_Sub4_Sub1) this).aFloat10700
	    = (float) i_31_ / (float) i_33_;
	((Class142_Sub4_Sub1) this).aFloat10701
	    = (float) i_30_ / (float) i_32_;
	((Class142_Sub4_Sub1) this).aBool10702 = false;
	((Class142_Sub4_Sub1) this).aBool10698 = true;
	method16906(false, false);
    }
    
    static Class142_Sub4_Sub1 method16950
	(Class103_Sub1 class103_sub1, Class175 class175, Class102 class102,
	 int i, int i_34_, boolean bool, byte[] is, Class175 class175_35_) {
	if (((Class103_Sub1) class103_sub1).aBool9213
	    || (Class76.method1772(i, (byte) 59)
		&& Class76.method1772(i_34_, (byte) 76)))
	    return new Class142_Sub4_Sub1(class103_sub1, 3553, class175,
					  class102, i, i_34_, bool, is,
					  class175_35_);
	if (((Class103_Sub1) class103_sub1).aBool9211)
	    return new Class142_Sub4_Sub1(class103_sub1, 34037, class175,
					  class102, i, i_34_, bool, is,
					  class175_35_);
	return new Class142_Sub4_Sub1(class103_sub1, class175, class102, i,
				      i_34_,
				      Class480.method11001(i, (byte) -32),
				      Class480.method11001(i_34_, (byte) -41),
				      is, class175_35_);
    }
    
    static Class142_Sub4_Sub1 method16951(Class103_Sub1 class103_sub1, int i,
					  int i_36_, int i_37_, int i_38_) {
	if (((Class103_Sub1) class103_sub1).aBool9213
	    || (Class76.method1772(i_37_, (byte) 73)
		&& Class76.method1772(i_38_, (byte) 120)))
	    return new Class142_Sub4_Sub1(class103_sub1, 3553, i, i_36_, i_37_,
					  i_38_, true);
	if (((Class103_Sub1) class103_sub1).aBool9211)
	    return new Class142_Sub4_Sub1(class103_sub1, 34037, i, i_36_,
					  i_37_, i_38_, true);
	return new Class142_Sub4_Sub1(class103_sub1, i, i_36_, i_37_, i_38_,
				      Class480.method11001(i_37_, (byte) 56),
				      Class480.method11001(i_38_, (byte) -77),
				      true);
    }
    
    static Class142_Sub4_Sub1 method16952
	(Class103_Sub1 class103_sub1, Class175 class175, Class102 class102,
	 int i, int i_39_, boolean bool, byte[] is, Class175 class175_40_) {
	if (((Class103_Sub1) class103_sub1).aBool9213
	    || (Class76.method1772(i, (byte) 15)
		&& Class76.method1772(i_39_, (byte) 76)))
	    return new Class142_Sub4_Sub1(class103_sub1, 3553, class175,
					  class102, i, i_39_, bool, is,
					  class175_40_);
	if (((Class103_Sub1) class103_sub1).aBool9211)
	    return new Class142_Sub4_Sub1(class103_sub1, 34037, class175,
					  class102, i, i_39_, bool, is,
					  class175_40_);
	return new Class142_Sub4_Sub1(class103_sub1, class175, class102, i,
				      i_39_,
				      Class480.method11001(i, (byte) 43),
				      Class480.method11001(i_39_, (byte) -117),
				      is, class175_40_);
    }
    
    static Class142_Sub4_Sub1 method16953(Class103_Sub1 class103_sub1, int i,
					  int i_41_, int i_42_, int i_43_) {
	if (((Class103_Sub1) class103_sub1).aBool9213
	    || (Class76.method1772(i_42_, (byte) 70)
		&& Class76.method1772(i_43_, (byte) 45)))
	    return new Class142_Sub4_Sub1(class103_sub1, 3553, i, i_41_, i_42_,
					  i_43_, true);
	if (((Class103_Sub1) class103_sub1).aBool9211)
	    return new Class142_Sub4_Sub1(class103_sub1, 34037, i, i_41_,
					  i_42_, i_43_, true);
	return new Class142_Sub4_Sub1(class103_sub1, i, i_41_, i_42_, i_43_,
				      Class480.method11001(i_42_, (byte) -26),
				      Class480.method11001(i_43_, (byte) -64),
				      true);
    }
    
    Class142_Sub4_Sub1(Class103_Sub1 class103_sub1, int i, int i_44_,
		       int i_45_, int i_46_, int[] is) {
	super(class103_sub1, 3553, Class175.aClass175_2110,
	      Class102.aClass102_1440, i_45_, i_46_);
	((Class142_Sub4_Sub1) this).anInt10699 = i;
	((Class142_Sub4_Sub1) this).anInt10703 = i_44_;
	method16904(0, i_46_ - i_44_, i, i_44_, is, 0, 0, true);
	((Class142_Sub4_Sub1) this).aFloat10700
	    = (float) i_44_ / (float) i_46_;
	((Class142_Sub4_Sub1) this).aFloat10701 = (float) i / (float) i_45_;
	((Class142_Sub4_Sub1) this).aBool10702 = false;
	((Class142_Sub4_Sub1) this).aBool10698 = true;
	method16906(false, false);
    }
    
    void method3168(boolean bool) {
	super.method3168(bool && !((Class142_Sub4_Sub1) this).aBool10698);
    }
}
