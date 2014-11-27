/* Class241_Sub39_Sub6_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub39_Sub6_Sub1 extends Class241_Sub39_Sub6
{
    float aFloat11242;
    float aFloat11243;
    float aFloat11244;
    Class81 aClass81_11245;
    
    public void method17115(float f) {
	((Class241_Sub39_Sub6_Sub1) this).aFloat11242
	    += f * ((Class241_Sub39_Sub6_Sub1) this).aFloat11244;
    }
    
    Class241_Sub39_Sub6_Sub1(int i, RSByteBuffer class241_sub3) {
	super(i);
	((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
	    = Class518.method11658(class241_sub3.readUnsignedByte((byte) 62),
				   418252911);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11243
	    = class241_sub3.method14650(-1578097729);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11244
	    = class241_sub3.method14650(-346252131);
    }
    
    public void method17112(float f) {
	((Class241_Sub39_Sub6_Sub1) this).aFloat11242
	    += f * ((Class241_Sub39_Sub6_Sub1) this).aFloat11244;
    }
    
    public void method17116(float f, int i) {
	((Class241_Sub39_Sub6_Sub1) this).aFloat11242
	    += f * ((Class241_Sub39_Sub6_Sub1) this).aFloat11244;
    }
    
    public void method17114(RSByteBuffer class241_sub3, int i) {
	((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
	    = Class518.method11658(class241_sub3.readUnsignedByte((byte) 49),
				   -1108159416);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11243
	    = class241_sub3.method14650(-261899832);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11244
	    = class241_sub3.method14650(-1020792544);
    }
    
    public void method17118(Class79 class79, Class266 class266,
			    Class268 class268) {
	float f = (float) Math.sin((double) ((Class241_Sub39_Sub6_Sub1) this)
					    .aFloat11242);
	float f_0_ = f * ((Class241_Sub39_Sub6_Sub1) this).aFloat11243;
	if (Class81.aClass81_1145
	    == ((Class241_Sub39_Sub6_Sub1) this).aClass81_11245) {
	    Class79 class79_1_;
	    (class79_1_ = class79).anInt1137
		= ((int) ((float) (238159603 * class79_1_.anInt1137) + f_0_)
		   * 2139849275);
	    class266.method5133(f_0_, 0.0F, 0.0F);
	} else if (((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
		   == Class81.aClass81_1143) {
	    Class79 class79_2_;
	    (class79_2_ = class79).anInt1136
		= ((int) ((float) (class79_2_.anInt1136 * -1348336023) + f_0_)
		   * 1289480665);
	    class266.method5133(0.0F, f_0_, 0.0F);
	} else if (((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
		   == Class81.aClass81_1144) {
	    Class79 class79_3_;
	    (class79_3_ = class79).anInt1135
		= 279197473 * (int) (f_0_ + (float) (class79_3_.anInt1135
						     * 676728033));
	    class266.method5133(0.0F, 0.0F, f_0_);
	} else if (Class81.aClass81_1148
		   == ((Class241_Sub39_Sub6_Sub1) this).aClass81_11245)
	    class266.method5128(1.0F, 0.0F, 0.0F, f_0_);
	else if (((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
		 == Class81.aClass81_1146)
	    class266.method5128(0.0F, 1.0F, 0.0F, f_0_);
	else if (Class81.aClass81_1147
		 == ((Class241_Sub39_Sub6_Sub1) this).aClass81_11245)
	    class266.method5128(0.0F, 0.0F, 1.0F, f_0_);
    }
    
    public void method17123(float f) {
	((Class241_Sub39_Sub6_Sub1) this).aFloat11242
	    += f * ((Class241_Sub39_Sub6_Sub1) this).aFloat11244;
    }
    
    public Class241_Sub39_Sub6_Sub1(int i, Class81 class81, float f,
				    float f_4_) {
	super(i);
	((Class241_Sub39_Sub6_Sub1) this).aClass81_11245 = class81;
	((Class241_Sub39_Sub6_Sub1) this).aFloat11243 = f;
	((Class241_Sub39_Sub6_Sub1) this).aFloat11244 = f_4_;
    }
    
    public void method17113(Class79 class79, Class266 class266,
			    Class268 class268, byte i) {
	float f = (float) Math.sin((double) ((Class241_Sub39_Sub6_Sub1) this)
					    .aFloat11242);
	float f_5_ = f * ((Class241_Sub39_Sub6_Sub1) this).aFloat11243;
	if (Class81.aClass81_1145
	    == ((Class241_Sub39_Sub6_Sub1) this).aClass81_11245) {
	    Class79 class79_6_;
	    (class79_6_ = class79).anInt1137
		= ((int) ((float) (238159603 * class79_6_.anInt1137) + f_5_)
		   * 2139849275);
	    class266.method5133(f_5_, 0.0F, 0.0F);
	} else if (((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
		   == Class81.aClass81_1143) {
	    Class79 class79_7_;
	    (class79_7_ = class79).anInt1136
		= ((int) ((float) (class79_7_.anInt1136 * -1348336023) + f_5_)
		   * 1289480665);
	    class266.method5133(0.0F, f_5_, 0.0F);
	} else if (((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
		   == Class81.aClass81_1144) {
	    Class79 class79_8_;
	    (class79_8_ = class79).anInt1135
		= 279197473 * (int) (f_5_ + (float) (class79_8_.anInt1135
						     * 676728033));
	    class266.method5133(0.0F, 0.0F, f_5_);
	} else if (Class81.aClass81_1148
		   == ((Class241_Sub39_Sub6_Sub1) this).aClass81_11245)
	    class266.method5128(1.0F, 0.0F, 0.0F, f_5_);
	else if (((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
		 == Class81.aClass81_1146)
	    class266.method5128(0.0F, 1.0F, 0.0F, f_5_);
	else if (Class81.aClass81_1147
		 == ((Class241_Sub39_Sub6_Sub1) this).aClass81_11245)
	    class266.method5128(0.0F, 0.0F, 1.0F, f_5_);
    }
    
    public void method17117(Class79 class79, Class266 class266,
			    Class268 class268) {
	float f = (float) Math.sin((double) ((Class241_Sub39_Sub6_Sub1) this)
					    .aFloat11242);
	float f_9_ = f * ((Class241_Sub39_Sub6_Sub1) this).aFloat11243;
	if (Class81.aClass81_1145
	    == ((Class241_Sub39_Sub6_Sub1) this).aClass81_11245) {
	    Class79 class79_10_;
	    (class79_10_ = class79).anInt1137
		= ((int) ((float) (238159603 * class79_10_.anInt1137) + f_9_)
		   * 2139849275);
	    class266.method5133(f_9_, 0.0F, 0.0F);
	} else if (((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
		   == Class81.aClass81_1143) {
	    Class79 class79_11_;
	    (class79_11_ = class79).anInt1136
		= ((int) ((float) (class79_11_.anInt1136 * -1348336023) + f_9_)
		   * 1289480665);
	    class266.method5133(0.0F, f_9_, 0.0F);
	} else if (((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
		   == Class81.aClass81_1144) {
	    Class79 class79_12_;
	    (class79_12_ = class79).anInt1135
		= 279197473 * (int) (f_9_ + (float) (class79_12_.anInt1135
						     * 676728033));
	    class266.method5133(0.0F, 0.0F, f_9_);
	} else if (Class81.aClass81_1148
		   == ((Class241_Sub39_Sub6_Sub1) this).aClass81_11245)
	    class266.method5128(1.0F, 0.0F, 0.0F, f_9_);
	else if (((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
		 == Class81.aClass81_1146)
	    class266.method5128(0.0F, 1.0F, 0.0F, f_9_);
	else if (Class81.aClass81_1147
		 == ((Class241_Sub39_Sub6_Sub1) this).aClass81_11245)
	    class266.method5128(0.0F, 0.0F, 1.0F, f_9_);
    }
    
    public void method17120(RSByteBuffer class241_sub3) {
	((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
	    = Class518.method11658(class241_sub3.readUnsignedByte((byte) -47),
				   389533616);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11243
	    = class241_sub3.method14650(-856333187);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11244
	    = class241_sub3.method14650(-1441079205);
    }
    
    public void method17121(RSByteBuffer class241_sub3) {
	((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
	    = Class518.method11658(class241_sub3.readUnsignedByte((byte) -52),
				   1971481559);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11243
	    = class241_sub3.method14650(-1647504288);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11244
	    = class241_sub3.method14650(-1851441829);
    }
    
    public void method17124(RSByteBuffer class241_sub3) {
	((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
	    = Class518.method11658(class241_sub3.readUnsignedByte((byte) 16),
				   1234330502);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11243
	    = class241_sub3.method14650(-1776635392);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11244
	    = class241_sub3.method14650(-1962191559);
    }
    
    public void method17119(RSByteBuffer class241_sub3) {
	((Class241_Sub39_Sub6_Sub1) this).aClass81_11245
	    = Class518.method11658(class241_sub3.readUnsignedByte((byte) -77),
				   -1238646846);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11243
	    = class241_sub3.method14650(-1308788331);
	((Class241_Sub39_Sub6_Sub1) this).aFloat11244
	    = class241_sub3.method14650(-1391782469);
    }
}
