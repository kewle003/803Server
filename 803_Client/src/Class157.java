/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class157
{
    Class138[] aClass138Array1764;
    int anInt1765 = 0;
    int anInt1766 = 0;
    int anInt1767 = 0;
    Class103_Sub1 aClass103_Sub1_1768;
    Class144 aClass144_1769;
    Class138_Sub8 aClass138_Sub8_1770;
    
    void method3392(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
	bool_2_ &= ((Class157) this).aClass103_Sub1_1768.method15131();
	if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_1_ = i_0_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (((Class157) this).anInt1767 != i) {
	    if (((Class157) this).anInt1767 != 0)
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff].method3135();
	    if (i != 0) {
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3124(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3121(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3123(i_0_, i_1_);
	    }
	    ((Class157) this).anInt1767 = i;
	    ((Class157) this).anInt1765 = i_0_;
	    ((Class157) this).anInt1766 = i_1_;
	} else if (((Class157) this).anInt1767 != 0) {
	    ((Class157) this).aClass138Array1764
		[((Class157) this).anInt1767 & 0x7fffffff].method3121(bool);
	    if (((Class157) this).anInt1765 != i_0_
		|| ((Class157) this).anInt1766 != i_1_) {
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff]
		    .method3123(i_0_, i_1_);
		((Class157) this).anInt1765 = i_0_;
		((Class157) this).anInt1766 = i_1_;
	    }
	}
    }
    
    boolean method3393(int i) {
	return ((Class157) this).aClass138Array1764[i].method3119();
    }
    
    void method3394(int i, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
	bool_5_ &= ((Class157) this).aClass103_Sub1_1768.method15131();
	if (!bool_5_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_4_ = i_3_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (((Class157) this).anInt1767 != i) {
	    if (((Class157) this).anInt1767 != 0)
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff].method3135();
	    if (i != 0) {
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3124(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3121(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3123(i_3_, i_4_);
	    }
	    ((Class157) this).anInt1767 = i;
	    ((Class157) this).anInt1765 = i_3_;
	    ((Class157) this).anInt1766 = i_4_;
	} else if (((Class157) this).anInt1767 != 0) {
	    ((Class157) this).aClass138Array1764
		[((Class157) this).anInt1767 & 0x7fffffff].method3121(bool);
	    if (((Class157) this).anInt1765 != i_3_
		|| ((Class157) this).anInt1766 != i_4_) {
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff]
		    .method3123(i_3_, i_4_);
		((Class157) this).anInt1765 = i_3_;
		((Class157) this).anInt1766 = i_4_;
	    }
	}
    }
    
    void method3395(int i, int i_6_, int i_7_, boolean bool, boolean bool_8_) {
	bool_8_ &= ((Class157) this).aClass103_Sub1_1768.method15131();
	if (!bool_8_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_7_ = i_6_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (((Class157) this).anInt1767 != i) {
	    if (((Class157) this).anInt1767 != 0)
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff].method3135();
	    if (i != 0) {
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3124(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3121(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3123(i_6_, i_7_);
	    }
	    ((Class157) this).anInt1767 = i;
	    ((Class157) this).anInt1765 = i_6_;
	    ((Class157) this).anInt1766 = i_7_;
	} else if (((Class157) this).anInt1767 != 0) {
	    ((Class157) this).aClass138Array1764
		[((Class157) this).anInt1767 & 0x7fffffff].method3121(bool);
	    if (((Class157) this).anInt1765 != i_6_
		|| ((Class157) this).anInt1766 != i_7_) {
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff]
		    .method3123(i_6_, i_7_);
		((Class157) this).anInt1765 = i_6_;
		((Class157) this).anInt1766 = i_7_;
	    }
	}
    }
    
    boolean method3396(int i) {
	return ((Class157) this).aClass138Array1764[i].method3119();
    }
    
    void method3397(int i, int i_9_, int i_10_, boolean bool,
		    boolean bool_11_) {
	bool_11_ &= ((Class157) this).aClass103_Sub1_1768.method15131();
	if (!bool_11_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_10_ = i_9_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (((Class157) this).anInt1767 != i) {
	    if (((Class157) this).anInt1767 != 0)
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff].method3135();
	    if (i != 0) {
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3124(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3121(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3123(i_9_, i_10_);
	    }
	    ((Class157) this).anInt1767 = i;
	    ((Class157) this).anInt1765 = i_9_;
	    ((Class157) this).anInt1766 = i_10_;
	} else if (((Class157) this).anInt1767 != 0) {
	    ((Class157) this).aClass138Array1764
		[((Class157) this).anInt1767 & 0x7fffffff].method3121(bool);
	    if (((Class157) this).anInt1765 != i_9_
		|| ((Class157) this).anInt1766 != i_10_) {
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff]
		    .method3123(i_9_, i_10_);
		((Class157) this).anInt1765 = i_9_;
		((Class157) this).anInt1766 = i_10_;
	    }
	}
    }
    
    void method3398(int i, int i_12_, int i_13_, boolean bool,
		    boolean bool_14_) {
	bool_14_ &= ((Class157) this).aClass103_Sub1_1768.method15131();
	if (!bool_14_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_13_ = i_12_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (((Class157) this).anInt1767 != i) {
	    if (((Class157) this).anInt1767 != 0)
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff].method3135();
	    if (i != 0) {
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3124(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3121(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3123(i_12_, i_13_);
	    }
	    ((Class157) this).anInt1767 = i;
	    ((Class157) this).anInt1765 = i_12_;
	    ((Class157) this).anInt1766 = i_13_;
	} else if (((Class157) this).anInt1767 != 0) {
	    ((Class157) this).aClass138Array1764
		[((Class157) this).anInt1767 & 0x7fffffff].method3121(bool);
	    if (((Class157) this).anInt1765 != i_12_
		|| ((Class157) this).anInt1766 != i_13_) {
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff]
		    .method3123(i_12_, i_13_);
		((Class157) this).anInt1765 = i_12_;
		((Class157) this).anInt1766 = i_13_;
	    }
	}
    }
    
    boolean method3399(Class142 class142, int i) {
	if (((Class157) this).anInt1767 == 0)
	    return false;
	((Class157) this).aClass138Array1764
	    [((Class157) this).anInt1767 & 0x7fffffff].method3118(class142, i);
	return true;
    }
    
    void method3400(int i, int i_15_, int i_16_, boolean bool,
		    boolean bool_17_) {
	bool_17_ &= ((Class157) this).aClass103_Sub1_1768.method15131();
	if (!bool_17_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_16_ = i_15_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (((Class157) this).anInt1767 != i) {
	    if (((Class157) this).anInt1767 != 0)
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff].method3135();
	    if (i != 0) {
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3124(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3121(bool);
		((Class157) this).aClass138Array1764[i & 0x7fffffff]
		    .method3123(i_15_, i_16_);
	    }
	    ((Class157) this).anInt1767 = i;
	    ((Class157) this).anInt1765 = i_15_;
	    ((Class157) this).anInt1766 = i_16_;
	} else if (((Class157) this).anInt1767 != 0) {
	    ((Class157) this).aClass138Array1764
		[((Class157) this).anInt1767 & 0x7fffffff].method3121(bool);
	    if (((Class157) this).anInt1765 != i_15_
		|| ((Class157) this).anInt1766 != i_16_) {
		((Class157) this).aClass138Array1764
		    [((Class157) this).anInt1767 & 0x7fffffff]
		    .method3123(i_15_, i_16_);
		((Class157) this).anInt1765 = i_15_;
		((Class157) this).anInt1766 = i_16_;
	    }
	}
    }
    
    Class157(Class103_Sub1 class103_sub1) {
	((Class157) this).aClass103_Sub1_1768 = class103_sub1;
	((Class157) this).aClass144_1769 = new Class144(class103_sub1);
	((Class157) this).aClass138Array1764 = new Class138[16];
	((Class157) this).aClass138Array1764[1]
	    = new Class138_Sub6(class103_sub1);
	((Class157) this).aClass138Array1764[2]
	    = new Class138_Sub2(class103_sub1,
				((Class157) this).aClass144_1769);
	((Class157) this).aClass138Array1764[4]
	    = new Class138_Sub1(class103_sub1,
				((Class157) this).aClass144_1769);
	((Class157) this).aClass138Array1764[5]
	    = new Class138_Sub7(class103_sub1,
				((Class157) this).aClass144_1769);
	((Class157) this).aClass138Array1764[6]
	    = new Class138_Sub3(class103_sub1);
	((Class157) this).aClass138Array1764[7]
	    = new Class138_Sub9(class103_sub1);
	((Class157) this).aClass138Array1764[3]
	    = ((Class157) this).aClass138_Sub8_1770
	    = new Class138_Sub8(class103_sub1);
	((Class157) this).aClass138Array1764[8]
	    = new Class138_Sub4(class103_sub1,
				((Class157) this).aClass144_1769);
	((Class157) this).aClass138Array1764[9]
	    = new Class138_Sub5(class103_sub1,
				((Class157) this).aClass144_1769);
	if (!((Class157) this).aClass138Array1764[8].method3119())
	    ((Class157) this).aClass138Array1764[8]
		= ((Class157) this).aClass138Array1764[4];
	if (!((Class157) this).aClass138Array1764[9].method3119())
	    ((Class157) this).aClass138Array1764[9]
		= ((Class157) this).aClass138Array1764[8];
    }
    
    boolean method3401(Class142 class142, int i) {
	if (((Class157) this).anInt1767 == 0)
	    return false;
	((Class157) this).aClass138Array1764
	    [((Class157) this).anInt1767 & 0x7fffffff].method3118(class142, i);
	return true;
    }
    
    boolean method3402(Class142 class142, int i) {
	if (((Class157) this).anInt1767 == 0)
	    return false;
	((Class157) this).aClass138Array1764
	    [((Class157) this).anInt1767 & 0x7fffffff].method3118(class142, i);
	return true;
    }
}
