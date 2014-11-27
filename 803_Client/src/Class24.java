/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class24
{
    static int anInt209;
    static Class129 aClass129_210 = new Class129(32);
    public static ClanSettings guestClanSettings;//aClass374_211
    
    public static void method913() {
	synchronized (aClass129_210) {
	    aClass129_210.reset(-2010245899);
	}
    }
    
    static void method914(int i) {
	synchronized (aClass129_210) {
	    aClass129_210.clean(i, -2071808200);
	}
    }
    
    public static Class89 method915(Class103 class103, int i, int i_0_,
				    int i_1_, int i_2_, Class89 class89,
				    short i_3_, byte i_4_, Class409 class409) {
	if (null == class89)
	    return null;
	int i_5_ = 2055;
	if (null != class409) {
	    i_5_ |= class409.method7356(874571311);
	    i_5_ &= ~0x200;
	}
	long l = (long) ((i_3_ & 0xffff) << 8 | i_4_);
	Class89 class89_6_;
	synchronized (aClass129_210) {
	    class89_6_ = (Class89) aClass129_210.get(l);
	}
	if (null == class89_6_
	    || class103.method2301(class89_6_.method1866(), i_5_) != 0) {
	    if (class89_6_ != null)
		i_5_ = class103.method2302(i_5_, class89_6_.method1866());
	    Class161 class161 = new Class161(4, 2, 2);
	    int i_7_ = 128;
	    int[] is = new int[4];
	    is[0] = class161.method3451(-i_7_, 0, -i_7_);
	    is[1] = class161.method3451(i_7_, 0, -i_7_);
	    is[2] = class161.method3451(i_7_, 0, i_7_);
	    is[3] = class161.method3451(-i_7_, 0, i_7_);
	    class161.method3452(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_4_,
				i_3_);
	    class161.method3452(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_4_,
				i_3_);
	    class161.method3468((short) 1, (short) 2, (short) 0);
	    class161.method3468((short) 2, (short) 3, (short) 0);
	    class89_6_ = class103.method2356(class161, i_5_,
					     anInt209 * 610682175, 64, 768);
	    synchronized (aClass129_210) {
		aClass129_210.put(class89_6_, l);
	    }
	}
	int i_8_ = class89.method1895();
	int i_9_ = class89.method1906();
	int i_10_ = class89.method1899();
	int i_11_ = class89.method1996();
	if (null != class409) {
	    class89_6_ = class89_6_.method2019((byte) 3, i_5_, true);
	    class89_6_.method1863(i_9_ - i_8_ >> 1, 128, i_11_ - i_10_ >> 1);
	    class89_6_.method1927(i_9_ + i_8_ >> 1, 0, i_11_ + i_10_ >> 1);
	    class409.method7398(class89_6_, (byte) -48);
	} else {
	    class89_6_ = class89_6_.method2019((byte) 3, i_5_, true);
	    class89_6_.method1863(i_9_ - i_8_ >> 1, 128, i_11_ - i_10_ >> 1);
	    class89_6_.method1927(i_9_ + i_8_ >> 1, 0, i_11_ + i_10_ >> 1);
	}
	if (i_0_ != 0)
	    class89_6_.method1870(i_0_);
	if (i_1_ != 0)
	    class89_6_.method1980(i_1_);
	if (0 != i_2_)
	    class89_6_.method1927(0, i_2_, 0);
	return class89_6_;
    }
    
    static void method916(int i) {
	anInt209 = i * 1277831871;
	synchronized (aClass129_210) {
	    aClass129_210.reset(99500753);
	}
    }
    
    static void method917(int i) {
	anInt209 = i * 1277831871;
	synchronized (aClass129_210) {
	    aClass129_210.reset(-1019204855);
	}
    }
    
    static void method918(int i) {
	anInt209 = i * 1277831871;
	synchronized (aClass129_210) {
	    aClass129_210.reset(-1196106697);
	}
    }
    
    static void method919(int i) {
	synchronized (aClass129_210) {
	    aClass129_210.clean(i, -2097921211);
	}
    }
    
    public static void method920() {
	synchronized (aClass129_210) {
	    aClass129_210.reset(-1808813602);
	}
    }
    
    public static void method921() {
	synchronized (aClass129_210) {
	    aClass129_210.reset(-2080326451);
	}
    }
    
    Class24() throws Throwable {
	throw new Error();
    }
    
    static void method922(int i) {
	synchronized (aClass129_210) {
	    aClass129_210.clean(i, -2035193551);
	}
    }
    
    public static Class89 method923(Class103 class103, int i, int i_12_,
				    int i_13_, int i_14_, int i_15_,
				    Class89 class89, int i_16_, int i_17_,
				    int i_18_, int i_19_, Class409 class409) {
	if (class89 == null)
	    return null;
	int i_20_ = 2055;
	if (class409 != null) {
	    i_20_ |= class409.method7356(-105336881);
	    i_20_ &= ~0x200;
	}
	long l = (((long) i_17_ << 48)
		  + (((long) i_16_ << 32)
		     + (long) (i_15_ + (i_18_ << 16) + (i_19_ << 24))));
	Class89 class89_21_;
	synchronized (aClass129_210) {
	    class89_21_ = (Class89) aClass129_210.get(l);
	}
	if (class89_21_ == null
	    || class103.method2301(class89_21_.method1866(), i_20_) != 0) {
	    if (class89_21_ != null)
		i_20_ = class103.method2302(i_20_, class89_21_.method1866());
	    int i_22_;
	    if (1 == i_15_)
		i_22_ = 9;
	    else if (i_15_ == 2)
		i_22_ = 12;
	    else if (i_15_ == 3)
		i_22_ = 15;
	    else if (i_15_ == 4)
		i_22_ = 18;
	    else
		i_22_ = 21;
	    int i_23_ = 3;
	    int[] is = { 64, 96, 128 };
	    Class161 class161 = new Class161(1 + i_23_ * i_22_,
					     2 * (i_22_ * i_23_) - i_22_, 0);
	    int i_24_ = class161.method3451(0, 0, 0);
	    int[][] is_25_ = new int[i_23_][i_22_];
	    for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
		int i_27_ = is[i_26_];
		int i_28_ = is[i_26_];
		for (int i_29_ = 0; i_29_ < i_22_; i_29_++) {
		    int i_30_ = (i_29_ << 14) / i_22_;
		    int i_31_ = Class282.anIntArray4430[i_30_] * i_27_ >> 14;
		    int i_32_ = i_28_ * Class282.anIntArray4441[i_30_] >> 14;
		    is_25_[i_26_][i_29_]
			= class161.method3451(i_31_, 0, i_32_);
		}
	    }
	    for (int i_33_ = 0; i_33_ < i_23_; i_33_++) {
		int i_34_ = (i_33_ * 256 + 128) / i_23_;
		int i_35_ = 256 - i_34_;
		byte i_36_ = (byte) (i_18_ * i_35_ + i_34_ * i_19_ >> 8);
		short i_37_
		    = (short) (((i_34_ * (i_17_ & 0x7f) + i_35_ * (i_16_
								   & 0x7f)
				 & 0x7f00)
				+ ((i_34_ * (i_17_ & 0x380) + i_35_ * (i_16_
								       & 0x380)
				    & 0x38000)
				   + (((i_17_ & 0xfc00) * i_34_
				       + i_35_ * (i_16_ & 0xfc00))
				      & 0xfc0000)))
			       >> 8);
		for (int i_38_ = 0; i_38_ < i_22_; i_38_++) {
		    if (0 == i_33_)
			class161.method3452(i_24_,
					    is_25_[0][(1 + i_38_) % i_22_],
					    is_25_[0][i_38_], (byte) 1,
					    (byte) -1, i_37_, i_36_,
					    (short) -1);
		    else {
			class161.method3452(is_25_[i_33_ - 1][i_38_],
					    (is_25_[i_33_ - 1]
					     [(i_38_ + 1) % i_22_]),
					    is_25_[i_33_][(i_38_ + 1) % i_22_],
					    (byte) 1, (byte) -1, i_37_, i_36_,
					    (short) -1);
			class161.method3452(is_25_[i_33_ - 1][i_38_],
					    is_25_[i_33_][(1 + i_38_) % i_22_],
					    is_25_[i_33_][i_38_], (byte) 1,
					    (byte) -1, i_37_, i_36_,
					    (short) -1);
		    }
		}
	    }
	    class89_21_ = class103.method2356(class161, i_20_,
					      610682175 * anInt209, 64, 768);
	    synchronized (aClass129_210) {
		aClass129_210.put(class89_21_, l);
	    }
	}
	int i_39_ = class89.method1895();
	int i_40_ = class89.method1906();
	int i_41_ = class89.method1899();
	int i_42_ = class89.method1996();
	if (class409 != null) {
	    class89_21_ = class89_21_.method2019((byte) 3, i_20_, true);
	    class89_21_.method1863(i_40_ - i_39_ >> 1, 128,
				   i_42_ - i_41_ >> 1);
	    class89_21_.method1927(i_39_ + i_40_ >> 1, 0, i_41_ + i_42_ >> 1);
	    class409.method7398(class89_21_, (byte) -35);
	} else {
	    class89_21_ = class89_21_.method2019((byte) 3, i_20_, true);
	    class89_21_.method1863(i_40_ - i_39_ >> 1, 128,
				   i_42_ - i_41_ >> 1);
	    class89_21_.method1927(i_40_ + i_39_ >> 1, 0, i_42_ + i_41_ >> 1);
	}
	if (i_12_ != 0)
	    class89_21_.method1870(i_12_);
	if (i_13_ != 0)
	    class89_21_.method1980(i_13_);
	if (0 != i_14_)
	    class89_21_.method1927(0, i_14_, 0);
	return class89_21_;
    }
    
    static void method924(int i) {
	synchronized (aClass129_210) {
	    aClass129_210.clean(i, -2021536622);
	}
    }
    
    static void method925() {
	synchronized (aClass129_210) {
	    aClass129_210.removeSoftReferences((byte) -75);
	}
    }
    
    static void method926() {
	synchronized (aClass129_210) {
	    aClass129_210.removeSoftReferences((byte) -93);
	}
    }
    
    public static Class260[] method927(int i) {
	return (new Class260[]
		{ Class260.aClass260_4219, Class260.aClass260_4252,
		  Class260.aClass260_4239, Class260.aClass260_4249,
		  Class260.aClass260_4257, Class260.aClass260_4238,
		  Class260.aClass260_4241, Class260.aClass260_4246,
		  Class260.aClass260_4253, Class260.aClass260_4222,
		  Class260.aClass260_4233, Class260.aClass260_4244,
		  Class260.aClass260_4250, Class260.aClass260_4227,
		  Class260.aClass260_4242, Class260.aClass260_4221,
		  Class260.aClass260_4251, Class260.aClass260_4223,
		  Class260.aClass260_4231, Class260.aClass260_4245,
		  Class260.aClass260_4232, Class260.aClass260_4243,
		  Class260.aClass260_4247, Class260.aClass260_4228,
		  Class260.aClass260_4248, Class260.aClass260_4256,
		  Class260.aClass260_4217, Class260.aClass260_4254,
		  Class260.aClass260_4236, Class260.aClass260_4226,
		  Class260.aClass260_4230, Class260.aClass260_4224,
		  Class260.aClass260_4237, Class260.aClass260_4255,
		  Class260.aClass260_4229, Class260.aClass260_4240,
		  Class260.aClass260_4234, Class260.aClass260_4218,
		  Class260.aClass260_4225, Class260.aClass260_4220,
		  Class260.aClass260_4235 });
    }
    
    public static Class563 method928(Socket socket, int i, byte i_43_)
	throws IOException {
	return new Class563_Sub1(socket, i);
    }
    
    static final void method929(InterfaceComponent class58, InterfaceDefinition class35,
				ClientScriptData class454, byte i) {
	class58.anInt920
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * 1718720659);
	WorldType.refreshComponent(class58, -844965644);
    }
    
    static final void method930(ClientScriptData class454, int i) {
	int i_44_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_44_, (byte) -67);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_44_ >> 16];
	Class192.setClanChannelUpdateEvent(class58, class35, class454, (byte) -61);
    }
    
    static final void method931(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class129.method3065(Class241_Sub5_Sub9.aClass241_Sub9_11043
				      .aClass445_Sub11_8893
				      .method14197((byte) -59),
				  200, 132786626);
    }
    
    static final void method932(ClientScriptData class454, short i) {
	/* empty */
    }
    
    static Class241_Sub24_Sub2 method933(int i, int i_45_, int i_46_, long l,
					 int i_47_, byte i_48_) {
	synchronized (Class241_Sub24_Sub2.aClass241_Sub24_Sub2Array10898) {
	    Class241_Sub24_Sub2 class241_sub24_sub2;
	    if (HashTable.anInt5913 * 1510128627 == 0)
		class241_sub24_sub2 = new Class241_Sub24_Sub2();
	    else
		class241_sub24_sub2
		    = (Class241_Sub24_Sub2.aClass241_Sub24_Sub2Array10898
		       [(HashTable.anInt5913 -= -2081598149) * 1510128627]);
	    ((Class241_Sub24_Sub2) class241_sub24_sub2).anInt10902
		= i * 1701358193;
	    ((Class241_Sub24_Sub2) class241_sub24_sub2).anInt10900
		= -1487331277 * i_45_;
	    ((Class241_Sub24_Sub2) class241_sub24_sub2).anInt10901
		= 1058498459 * i_46_;
	    ((Class241_Sub24_Sub2) class241_sub24_sub2).aLong10903
		= l * -8527289436166315429L;
	    ((Class241_Sub24_Sub2) class241_sub24_sub2).anInt10904
		= 1015050931 * i_47_;
	    Class241_Sub24_Sub2 class241_sub24_sub2_49_ = class241_sub24_sub2;
	    return class241_sub24_sub2_49_;
	}
    }
}
