/* Class569 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class569
{
    Class393_Sub2 this$0;
    byte[] aByteArray7337;
    byte[] aByteArray7338;
    int anInt7339;
    Class565 aClass565_7340;
    int anInt7341;
    int anInt7342;
    float aFloat7343;
    int anInt7344;
    int anInt7345;
    int anInt7346;
    static int anInt7347;
    
    Class569(Class393_Sub2 class393_sub2, Class565 class565, int i, float f,
	     int i_0_, int i_1_, boolean bool, boolean bool_2_) {
	((Class569) this).this$0 = class393_sub2;
	((Class569) this).aClass565_7340 = class565;
	((Class569) this).aByteArray7337 = new byte[i];
	((Class569) this).aByteArray7338 = new byte[i_0_ / 8];
	((Class569) this).anInt7341
	    = ((Class569) this).aByteArray7337.length * 1283825485;
	((Class569) this).aFloat7343 = f;
	((Class569) this).anInt7344 = i_0_ * -296007079;
	((Class569) this).anInt7346 = 453820381 * i_1_;
	((Class569) this).anInt7339 = 0;
	((Class569) this).anInt7345 = 0;
	((Class569) this).anInt7342 = 0;
    }
    
    void method12479(byte[] is, int i, int i_3_, int i_4_) {
	int i_5_ = i;
	while (i_5_ < i + i_3_) {
	    ((Class569) this).aByteArray7337[(((Class569) this).anInt7339
					      * 247748877)]
		= is[i_5_];
	    ((Class569) this).aByteArray7337[1 + 247748877 * (((Class569) this)
							      .anInt7339)]
		= is[1 + i_5_];
	    i_5_ += 2;
	    ((Class569) this).anInt7339 += -2085995638;
	    ((Class569) this).anInt7339
		= (247748877 * ((Class569) this).anInt7339
		   % ((Class569) this).aByteArray7337.length * 1104485829);
	    ((Class569) this).anInt7341 -= -1727316326;
	}
    }
    
    int method12480(int i) {
	return 1899016581 * ((Class569) this).anInt7341;
    }
    
    void method12481(byte[] is, int i, int i_6_) {
	int i_7_ = i;
	while (i_7_ < i + i_6_) {
	    ((Class569) this).aByteArray7337[(((Class569) this).anInt7339
					      * 247748877)]
		= is[i_7_];
	    ((Class569) this).aByteArray7337[1 + 247748877 * (((Class569) this)
							      .anInt7339)]
		= is[1 + i_7_];
	    i_7_ += 2;
	    ((Class569) this).anInt7339 += -2085995638;
	    ((Class569) this).anInt7339
		= (247748877 * ((Class569) this).anInt7339
		   % ((Class569) this).aByteArray7337.length * 1104485829);
	    ((Class569) this).anInt7341 -= -1727316326;
	}
    }
    
    void method12482(byte[] is, int i, int i_8_) {
	int i_9_ = i;
	while (i_9_ < i + i_8_) {
	    ((Class569) this).aByteArray7337[(((Class569) this).anInt7339
					      * 247748877)]
		= is[i_9_];
	    ((Class569) this).aByteArray7337[1 + 247748877 * (((Class569) this)
							      .anInt7339)]
		= is[1 + i_9_];
	    i_9_ += 2;
	    ((Class569) this).anInt7339 += -2085995638;
	    ((Class569) this).anInt7339
		= (247748877 * ((Class569) this).anInt7339
		   % ((Class569) this).aByteArray7337.length * 1104485829);
	    ((Class569) this).anInt7341 -= -1727316326;
	}
    }
    
    void method12483(byte[] is, int i, int i_10_) {
	int i_11_ = i;
	while (i_11_ < i + i_10_) {
	    ((Class569) this).aByteArray7337[(((Class569) this).anInt7339
					      * 247748877)]
		= is[i_11_];
	    ((Class569) this).aByteArray7337[1 + 247748877 * (((Class569) this)
							      .anInt7339)]
		= is[1 + i_11_];
	    i_11_ += 2;
	    ((Class569) this).anInt7339 += -2085995638;
	    ((Class569) this).anInt7339
		= (247748877 * ((Class569) this).anInt7339
		   % ((Class569) this).aByteArray7337.length * 1104485829);
	    ((Class569) this).anInt7341 -= -1727316326;
	}
    }
    
    int method12484() {
	return 1899016581 * ((Class569) this).anInt7341;
    }
    
    static final boolean method12485(Class548[][][] class548s, int i,
				     int i_12_, int i_13_, boolean bool,
				     int i_14_) {
	byte[][][] is = client.aClass238_8477.method4785(-1218485036);
	byte i_15_
	    = bool ? (byte) 1 : (byte) (485246749 * client.anInt8407 & 0xff);
	if (is[Class357_Sub1.anInt10357 * 993680393][i_12_][i_13_] == i_15_)
	    return false;
	Class215 class215 = client.aClass238_8477.method4753((byte) -15);
	if (((class215.heightmapData
	      [993680393 * Class357_Sub1.anInt10357][i_12_][i_13_])
	     & 0x4)
	    == 0)
	    return false;
	int i_16_ = 0;
	int i_17_ = 0;
	client.anIntArray8475[i_16_] = i_12_;
	client.anIntArray8330[i_16_++] = i_13_;
	is[Class357_Sub1.anInt10357 * 993680393][i_12_][i_13_] = i_15_;
	while (i_17_ != i_16_) {
	    int i_18_ = client.anIntArray8475[i_17_] & 0xffff;
	    int i_19_ = client.anIntArray8475[i_17_] >> 16 & 0xff;
	    int i_20_ = client.anIntArray8475[i_17_] >> 24 & 0xff;
	    int i_21_ = client.anIntArray8330[i_17_] & 0xffff;
	    int i_22_ = client.anIntArray8330[i_17_] >> 16 & 0xff;
	    i_17_ = 1 + i_17_ & 0xfff;
	    boolean bool_23_ = false;
	    if (0 == ((class215.heightmapData
		       [Class357_Sub1.anInt10357 * 993680393][i_18_][i_21_])
		      & 0x4))
		bool_23_ = true;
	    boolean bool_24_ = false;
	    if (class548s != null) {
		int i_25_ = Class357_Sub1.anInt10357 * 993680393 + 1;
	    while_130_:
		for (/**/; i_25_ <= 3; i_25_++) {
		    if (null != class548s[i_25_]
			&& 0 == ((class215.heightmapData[i_25_]
				  [i_18_][i_21_])
				 & 0x8)) {
			if (bool_23_
			    && null != class548s[i_25_][i_18_][i_21_]) {
			    if (null != (class548s[i_25_][i_18_][i_21_]
					 .aClass475_Sub1_Sub3_7055)) {
				int i_26_
				    = Class186.method3864(i_19_, -976732348);
				if (i_26_ == (class548s[i_25_][i_18_][i_21_]
					      .aClass475_Sub1_Sub3_7055
					      .aShort10724)
				    || ((class548s[i_25_][i_18_][i_21_]
					 .aClass475_Sub1_Sub3_7056) != null
					&& (class548s[i_25_][i_18_][i_21_]
					    .aClass475_Sub1_Sub3_7056
					    .aShort10724) == i_26_))
				    continue;
				if (i_20_ != 0) {
				    int i_27_
					= Class186.method3864(i_20_,
							      1473005794);
				    if (i_27_ == (class548s[i_25_][i_18_]
						  [i_21_]
						  .aClass475_Sub1_Sub3_7055
						  .aShort10724)
					|| ((class548s[i_25_][i_18_][i_21_]
					     .aClass475_Sub1_Sub3_7056) != null
					    && (class548s[i_25_][i_18_][i_21_]
						.aClass475_Sub1_Sub3_7056
						.aShort10724) == i_27_))
					continue;
				}
				if (i_22_ != 0) {
				    int i_28_
					= Class186.method3864(i_22_,
							      1823381374);
				    if (i_28_ == (class548s[i_25_][i_18_]
						  [i_21_]
						  .aClass475_Sub1_Sub3_7055
						  .aShort10724)
					|| (null != (class548s[i_25_][i_18_]
						     [i_21_]
						     .aClass475_Sub1_Sub3_7056)
					    && (class548s[i_25_][i_18_][i_21_]
						.aClass475_Sub1_Sub3_7056
						.aShort10724) == i_28_))
					continue;
				}
			    }
			    Class548 class548 = class548s[i_25_][i_18_][i_21_];
			    if (class548.aClass541_7053 != null) {
				for (Class541 class541
					 = class548.aClass541_7053;
				     null != class541;
				     class541 = class541.aClass541_7005) {
				    Class475_Sub1_Sub1 class475_sub1_sub1
					= class541.aClass475_Sub1_Sub1_7004;
				    if (class475_sub1_sub1
					instanceof Interface24) {
					Interface24 interface24
					    = (Interface24) class475_sub1_sub1;
					int i_29_
					    = interface24.method139(591463713);
					int i_30_ = interface24
							.method140(1262705295);
					if (21 == i_29_)
					    i_29_ = 19;
					int i_31_ = i_29_ | i_30_ << 6;
					if (i_31_ == i_19_
					    || 0 != i_20_ && i_20_ == i_31_
					    || 0 != i_22_ && i_31_ == i_22_)
					    continue while_130_;
				    }
				}
			    }
			}
			Class548 class548 = class548s[i_25_][i_18_][i_21_];
			if (null != class548
			    && null != class548.aClass541_7053) {
			    for (Class541 class541 = class548.aClass541_7053;
				 class541 != null;
				 class541 = class541.aClass541_7005) {
				Class475_Sub1_Sub1 class475_sub1_sub1
				    = class541.aClass475_Sub1_Sub1_7004;
				if ((class475_sub1_sub1.aShort10717
				     != class475_sub1_sub1.aShort10716)
				    || (class475_sub1_sub1.aShort10718
					!= class475_sub1_sub1.aShort10719)) {
				    short i_32_
					= class475_sub1_sub1.aShort10717;
				    short i_33_
					= class475_sub1_sub1.aShort10716;
				    short i_34_
					= class475_sub1_sub1.aShort10718;
				    short i_35_
					= class475_sub1_sub1.aShort10719;
				    int i_36_
					= Math.max(0,
						   Math.min(i_32_,
							    (is[i_25_].length
							     - 1)));
				    int i_37_
					= Math.max(0,
						   Math.min(i_34_,
							    (is[i_25_]
							     [0]).length - 1));
				    int i_38_
					= Math.max(0,
						   Math.min(i_33_,
							    (is[i_25_].length
							     - 1)));
				    int i_39_
					= Math.max(0,
						   Math.min(i_35_,
							    (is[i_25_]
							     [0]).length - 1));
				    for (/**/; i_36_ <= i_38_; i_36_++) {
					for (/**/; i_37_ <= i_39_; i_37_++)
					    is[i_25_][i_36_][i_37_] = i_15_;
				    }
				}
			    }
			}
			is[i_25_][i_18_][i_21_] = i_15_;
			bool_24_ = true;
		    }
		}
	    }
	    if (bool_24_) {
		int i_40_ = client.aClass238_8477.method4751(-803840746)
				.aClass166Array7184
				[993680393 * Class357_Sub1.anInt10357 + 1]
				.method3551(i_18_, i_21_, -1837629304);
		if (client.anIntArray8423[i] < i_40_)
		    client.anIntArray8423[i] = i_40_;
		int i_41_ = i_18_ << 9;
		int i_42_ = i_21_ << 9;
		if (client.anIntArray8424[i] > i_41_)
		    client.anIntArray8424[i] = i_41_;
		else if (client.anIntArray8425[i] < i_41_)
		    client.anIntArray8425[i] = i_41_;
		if (client.anIntArray8427[i] > i_42_)
		    client.anIntArray8427[i] = i_42_;
		else if (client.anIntArray8529[i] < i_42_)
		    client.anIntArray8529[i] = i_42_;
	    }
	    if (!bool_23_) {
		if (i_18_ >= 1 && (is[993680393 * Class357_Sub1.anInt10357]
				   [i_18_ - 1][i_21_]) != i_15_) {
		    client.anIntArray8475[i_16_]
			= i_18_ - 1 | 0x120000 | ~0x2cffffff;
		    client.anIntArray8330[i_16_] = i_21_ | 0x130000;
		    i_16_ = i_16_ + 1 & 0xfff;
		    is[993680393 * Class357_Sub1.anInt10357][i_18_ - 1][i_21_]
			= i_15_;
		}
		if (++i_21_ < client.aClass238_8477.method4745(1834722805)) {
		    if (i_18_ - 1 >= 0
			&& i_15_ != (is[Class357_Sub1.anInt10357 * 993680393]
				     [i_18_ - 1][i_21_])
			&& 0 == ((class215.heightmapData
				  [993680393 * Class357_Sub1.anInt10357][i_18_]
				  [i_21_])
				 & 0x4)
			&& ((class215.heightmapData
			     [Class357_Sub1.anInt10357 * 993680393][i_18_ - 1]
			     [i_21_ - 1])
			    & 0x4) == 0) {
			client.anIntArray8475[i_16_]
			    = i_18_ - 1 | 0x120000 | 0x52000000;
			client.anIntArray8330[i_16_] = i_21_ | 0x130000;
			i_16_ = 1 + i_16_ & 0xfff;
			is[Class357_Sub1.anInt10357 * 993680393][i_18_ - 1]
			    [i_21_]
			    = i_15_;
		    }
		    if (i_15_ != (is[993680393 * Class357_Sub1.anInt10357]
				  [i_18_][i_21_])) {
			client.anIntArray8475[i_16_]
			    = i_18_ | 0x520000 | 0x13000000;
			client.anIntArray8330[i_16_] = i_21_ | 0x530000;
			i_16_ = 1 + i_16_ & 0xfff;
			is[Class357_Sub1.anInt10357 * 993680393][i_18_][i_21_]
			    = i_15_;
		    }
		    if ((1 + i_18_
			 < client.aClass238_8477.method4744(-1777814671))
			&& i_15_ != (is[993680393 * Class357_Sub1.anInt10357]
				     [1 + i_18_][i_21_])
			&& ((class215.heightmapData
			     [993680393 * Class357_Sub1.anInt10357][i_18_]
			     [i_21_])
			    & 0x4) == 0
			&& ((class215.heightmapData
			     [Class357_Sub1.anInt10357 * 993680393][i_18_ + 1]
			     [i_21_ - 1])
			    & 0x4) == 0) {
			client.anIntArray8475[i_16_]
			    = i_18_ + 1 | 0x520000 | ~0x6dffffff;
			client.anIntArray8330[i_16_] = i_21_ | 0x530000;
			i_16_ = 1 + i_16_ & 0xfff;
			is[993680393 * Class357_Sub1.anInt10357][1 + i_18_]
			    [i_21_]
			    = i_15_;
		    }
		}
		i_21_--;
		if (1 + i_18_ < client.aClass238_8477.method4744(-1528642018)
		    && (is[993680393 * Class357_Sub1.anInt10357][i_18_ + 1]
			[i_21_]) != i_15_) {
		    client.anIntArray8475[i_16_]
			= 1 + i_18_ | 0x920000 | 0x53000000;
		    client.anIntArray8330[i_16_] = i_21_ | 0x930000;
		    i_16_ = 1 + i_16_ & 0xfff;
		    is[993680393 * Class357_Sub1.anInt10357][1 + i_18_][i_21_]
			= i_15_;
		}
		if (--i_21_ >= 0) {
		    if (i_18_ - 1 >= 0
			&& i_15_ != (is[993680393 * Class357_Sub1.anInt10357]
				     [i_18_ - 1][i_21_])
			&& ((class215.heightmapData
			     [Class357_Sub1.anInt10357 * 993680393][i_18_]
			     [i_21_])
			    & 0x4) == 0
			&& ((class215.heightmapData
			     [993680393 * Class357_Sub1.anInt10357][i_18_ - 1]
			     [1 + i_21_])
			    & 0x4) == 0) {
			client.anIntArray8475[i_16_]
			    = i_18_ - 1 | 0xd20000 | 0x12000000;
			client.anIntArray8330[i_16_] = i_21_ | 0xd30000;
			i_16_ = 1 + i_16_ & 0xfff;
			is[Class357_Sub1.anInt10357 * 993680393][i_18_ - 1]
			    [i_21_]
			    = i_15_;
		    }
		    if (is[Class357_Sub1.anInt10357 * 993680393][i_18_][i_21_]
			!= i_15_) {
			client.anIntArray8475[i_16_]
			    = i_18_ | 0xd20000 | ~0x6cffffff;
			client.anIntArray8330[i_16_] = i_21_ | 0xd30000;
			i_16_ = i_16_ + 1 & 0xfff;
			is[Class357_Sub1.anInt10357 * 993680393][i_18_][i_21_]
			    = i_15_;
		    }
		    if ((i_18_ + 1
			 < client.aClass238_8477.method4744(-1694184807))
			&& (is[Class357_Sub1.anInt10357 * 993680393][i_18_ + 1]
			    [i_21_]) != i_15_
			&& ((class215.heightmapData
			     [Class357_Sub1.anInt10357 * 993680393][i_18_]
			     [i_21_])
			    & 0x4) == 0
			&& 0 == ((class215.heightmapData
				  [993680393 * Class357_Sub1.anInt10357]
				  [1 + i_18_][1 + i_21_])
				 & 0x4)) {
			client.anIntArray8475[i_16_]
			    = i_18_ + 1 | 0x920000 | ~0x2dffffff;
			client.anIntArray8330[i_16_] = i_21_ | 0x930000;
			i_16_ = i_16_ + 1 & 0xfff;
			is[993680393 * Class357_Sub1.anInt10357][i_18_ + 1]
			    [i_21_]
			    = i_15_;
		    }
		}
	    }
	}
	if (client.anIntArray8423[i] != -1000000) {
	    client.anIntArray8423[i] += 40;
	    client.anIntArray8424[i] -= 512;
	    client.anIntArray8425[i] += 512;
	    client.anIntArray8529[i] += 512;
	    client.anIntArray8427[i] -= 512;
	}
	return true;
    }
    
    static void setComponentSprite/*method12486*/(int compHash, int spriteID, int i_44_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(13, (long) compHash);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941 = spriteID * -1741260507;
    }
    
    static final void method12487(ClientScriptData class454, int i) {
	int i_45_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_45_, (byte) -67);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_45_ >> 16];
	Class277.method5373(class58, class35, class454, -2033804837);
    }
}
