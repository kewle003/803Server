/* Class336 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class336 implements Interface51
{
    public String method370(Class465 class465, int[] is, long l) {
	if (Class465.aClass465_6296 == class465) {
	    ClientScriptMap class406
		= Class105_Sub1.cs2MapsList.list(is[0], (byte) -49);
	    return class406.getStringValue((int) l, -437258978);
	}
	if (class465 == Class465.aClass465_6299
	    || class465 == Class465.aClass465_6303) {
	    ItemDefinition class623
		= JS5.itemDefLoader.list((int) l, (short) -12385);
	    return class623.name;
	}
	if (class465 == Class465.aClass465_6306
	    || class465 == Class465.aClass465_6300
	    || Class465.aClass465_6304 == class465)
	    return Class105_Sub1.cs2MapsList.list
		       (is[0], (byte) -63).getStringValue((int) l, -437258978);
	return null;
    }
    
    public String method369(Class465 class465, int[] is, long l) {
	if (Class465.aClass465_6296 == class465) {
	    ClientScriptMap class406
		= Class105_Sub1.cs2MapsList.list(is[0], (byte) -17);
	    return class406.getStringValue((int) l, -437258978);
	}
	if (class465 == Class465.aClass465_6299
	    || class465 == Class465.aClass465_6303) {
	    ItemDefinition class623
		= JS5.itemDefLoader.list((int) l, (short) -1546);
	    return class623.name;
	}
	if (class465 == Class465.aClass465_6306
	    || class465 == Class465.aClass465_6300
	    || Class465.aClass465_6304 == class465)
	    return Class105_Sub1.cs2MapsList.list
		       (is[0], (byte) -45).getStringValue((int) l, -437258978);
	return null;
    }
    
    public String method371(Class465 class465, int[] is, long l) {
	if (Class465.aClass465_6296 == class465) {
	    ClientScriptMap class406
		= Class105_Sub1.cs2MapsList.list(is[0], (byte) -125);
	    return class406.getStringValue((int) l, -437258978);
	}
	if (class465 == Class465.aClass465_6299
	    || class465 == Class465.aClass465_6303) {
	    ItemDefinition class623
		= JS5.itemDefLoader.list((int) l, (short) 24233);
	    return class623.name;
	}
	if (class465 == Class465.aClass465_6306
	    || class465 == Class465.aClass465_6300
	    || Class465.aClass465_6304 == class465)
	    return Class105_Sub1.cs2MapsList.list
		       (is[0], (byte) -100).getStringValue((int) l, -437258978);
	return null;
    }
    
    public String method372(Class465 class465, int[] is, long l) {
	if (Class465.aClass465_6296 == class465) {
	    ClientScriptMap class406
		= Class105_Sub1.cs2MapsList.list(is[0], (byte) -84);
	    return class406.getStringValue((int) l, -437258978);
	}
	if (class465 == Class465.aClass465_6299
	    || class465 == Class465.aClass465_6303) {
	    ItemDefinition class623
		= JS5.itemDefLoader.list((int) l, (short) 5511);
	    return class623.name;
	}
	if (class465 == Class465.aClass465_6306
	    || class465 == Class465.aClass465_6300
	    || Class465.aClass465_6304 == class465)
	    return Class105_Sub1.cs2MapsList.list
		       (is[0], (byte) -108).getStringValue((int) l, -437258978);
	return null;
    }
    
    public String method368(Class465 class465, int[] is, long l) {
	if (Class465.aClass465_6296 == class465) {
	    ClientScriptMap class406
		= Class105_Sub1.cs2MapsList.list(is[0], (byte) -29);
	    return class406.getStringValue((int) l, -437258978);
	}
	if (class465 == Class465.aClass465_6299
	    || class465 == Class465.aClass465_6303) {
	    ItemDefinition class623
		= JS5.itemDefLoader.list((int) l, (short) -17355);
	    return class623.name;
	}
	if (class465 == Class465.aClass465_6306
	    || class465 == Class465.aClass465_6300
	    || Class465.aClass465_6304 == class465)
	    return Class105_Sub1.cs2MapsList.list
		       (is[0], (byte) -59).getStringValue((int) l, -437258978);
	return null;
    }
    
    public static byte[][][] method6078(int i, int i_0_) {
	byte[][][] is = new byte[8][4][];
	int i_1_ = i;
	int i_2_ = i;
	byte[] is_3_ = new byte[i_2_ * i_1_];
	int i_4_ = 0;
	for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
	    for (int i_6_ = 0; i_6_ < i_1_; i_6_++) {
		if (i_6_ <= i_5_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[0][0] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_7_ = i_2_ - 1; i_7_ >= 0; i_7_--) {
	    for (int i_8_ = 0; i_8_ < i_2_; i_8_++) {
		if (i_8_ <= i_7_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[0][1] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
	    for (int i_10_ = 0; i_10_ < i_1_; i_10_++) {
		if (i_10_ >= i_9_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[0][2] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_11_ = i_2_ - 1; i_11_ >= 0; i_11_--) {
	    for (int i_12_ = 0; i_12_ < i_1_; i_12_++) {
		if (i_12_ >= i_11_)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[0][3] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_13_ = i_2_ - 1; i_13_ >= 0; i_13_--) {
	    for (int i_14_ = 0; i_14_ < i_1_; i_14_++) {
		if (i_14_ <= i_13_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[1][0] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
	    for (int i_16_ = 0; i_16_ < i_1_; i_16_++) {
		if (i_4_ < 0 || i_4_ >= is_3_.length)
		    i_4_++;
		else {
		    if (i_16_ >= i_15_ << 1)
			is_3_[i_4_] = (byte) -1;
		    i_4_++;
		}
	    }
	}
	is[1][1] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_17_ = 0; i_17_ < i_2_; i_17_++) {
	    for (int i_18_ = i_1_ - 1; i_18_ >= 0; i_18_--) {
		if (i_18_ <= i_17_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[1][2] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_19_ = i_2_ - 1; i_19_ >= 0; i_19_--) {
	    for (int i_20_ = i_1_ - 1; i_20_ >= 0; i_20_--) {
		if (i_20_ >= i_19_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[1][3] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_21_ = i_2_ - 1; i_21_ >= 0; i_21_--) {
	    for (int i_22_ = i_1_ - 1; i_22_ >= 0; i_22_--) {
		if (i_22_ <= i_21_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][0] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_23_ = i_2_ - 1; i_23_ >= 0; i_23_--) {
	    for (int i_24_ = 0; i_24_ < i_1_; i_24_++) {
		if (i_24_ >= i_23_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_25_ = 0; i_25_ < i_2_; i_25_++) {
	    for (int i_26_ = 0; i_26_ < i_1_; i_26_++) {
		if (i_26_ <= i_25_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][2] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_27_ = 0; i_27_ < i_2_; i_27_++) {
	    for (int i_28_ = i_1_ - 1; i_28_ >= 0; i_28_--) {
		if (i_28_ >= i_27_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[2][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_29_ = i_2_ - 1; i_29_ >= 0; i_29_--) {
	    for (int i_30_ = 0; i_30_ < i_1_; i_30_++) {
		if (i_30_ >= i_29_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][0] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_31_ = 0; i_31_ < i_2_; i_31_++) {
	    for (int i_32_ = 0; i_32_ < i_1_; i_32_++) {
		if (i_32_ <= i_31_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_33_ = 0; i_33_ < i_2_; i_33_++) {
	    for (int i_34_ = i_1_ - 1; i_34_ >= 0; i_34_--) {
		if (i_34_ >= i_33_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][2] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_35_ = i_2_ - 1; i_35_ >= 0; i_35_--) {
	    for (int i_36_ = i_1_ - 1; i_36_ >= 0; i_36_--) {
		if (i_36_ <= i_35_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[3][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_37_ = i_2_ - 1; i_37_ >= 0; i_37_--) {
	    for (int i_38_ = i_1_ - 1; i_38_ >= 0; i_38_--) {
		if (i_38_ >= i_37_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][0] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_39_ = i_2_ - 1; i_39_ >= 0; i_39_--) {
	    for (int i_40_ = 0; i_40_ < i_1_; i_40_++) {
		if (i_40_ <= i_39_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][1] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_41_ = 0; i_41_ < i_2_; i_41_++) {
	    for (int i_42_ = 0; i_42_ < i_1_; i_42_++) {
		if (i_42_ >= i_41_ >> 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][2] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_43_ = 0; i_43_ < i_2_; i_43_++) {
	    for (int i_44_ = i_1_ - 1; i_44_ >= 0; i_44_--) {
		if (i_44_ <= i_43_ << 1)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[4][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_45_ = 0; i_45_ < i_2_; i_45_++) {
	    for (int i_46_ = 0; i_46_ < i_1_; i_46_++) {
		if (i_46_ <= i_1_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][0] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_47_ = 0; i_47_ < i_2_; i_47_++) {
	    for (int i_48_ = 0; i_48_ < i_1_; i_48_++) {
		if (i_47_ <= i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][1] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_49_ = 0; i_49_ < i_2_; i_49_++) {
	    for (int i_50_ = 0; i_50_ < i_1_; i_50_++) {
		if (i_50_ >= i_1_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][2] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_51_ = 0; i_51_ < i_2_; i_51_++) {
	    for (int i_52_ = 0; i_52_ < i_1_; i_52_++) {
		if (i_51_ >= i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[5][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_53_ = 0; i_53_ < i_2_; i_53_++) {
	    for (int i_54_ = 0; i_54_ < i_1_; i_54_++) {
		if (i_54_ <= i_53_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][0] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_55_ = i_2_ - 1; i_55_ >= 0; i_55_--) {
	    for (int i_56_ = 0; i_56_ < i_1_; i_56_++) {
		if (i_56_ <= i_55_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][1] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_57_ = i_2_ - 1; i_57_ >= 0; i_57_--) {
	    for (int i_58_ = i_1_ - 1; i_58_ >= 0; i_58_--) {
		if (i_58_ <= i_57_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][2] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_59_ = 0; i_59_ < i_2_; i_59_++) {
	    for (int i_60_ = i_1_ - 1; i_60_ >= 0; i_60_--) {
		if (i_60_ <= i_59_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[6][3] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_61_ = 0; i_61_ < i_2_; i_61_++) {
	    for (int i_62_ = 0; i_62_ < i_1_; i_62_++) {
		if (i_62_ >= i_61_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][0] = is_3_;
	is_3_ = new byte[i_2_ * i_1_];
	i_4_ = 0;
	for (int i_63_ = i_2_ - 1; i_63_ >= 0; i_63_--) {
	    for (int i_64_ = 0; i_64_ < i_1_; i_64_++) {
		if (i_64_ >= i_63_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][1] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_65_ = i_2_ - 1; i_65_ >= 0; i_65_--) {
	    for (int i_66_ = i_1_ - 1; i_66_ >= 0; i_66_--) {
		if (i_66_ >= i_65_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][2] = is_3_;
	is_3_ = new byte[i_1_ * i_2_];
	i_4_ = 0;
	for (int i_67_ = 0; i_67_ < i_2_; i_67_++) {
	    for (int i_68_ = i_1_ - 1; i_68_ >= 0; i_68_--) {
		if (i_68_ >= i_67_ - i_2_ / 2)
		    is_3_[i_4_] = (byte) -1;
		i_4_++;
	    }
	}
	is[7][3] = is_3_;
	return is;
    }
    
    static final void method6079(ClientScriptData class454, int i) {
	int i_69_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_69_, (byte) -89);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_69_ >> 16];
	LoadingScreenDef.method6482(class58, class35, class454, -1547228749);
    }
    
    static final void loadCs2MapValue/*method6080*/(ClientScriptData scriptData, byte i) {
    	scriptData.intStackPointer -= -1642917540;
		int type1 = scriptData.integerStack[1482319719 * scriptData.intStackPointer];
		int type = scriptData.integerStack[1482319719 * scriptData.intStackPointer + 1];
		int mapID = scriptData.integerStack[2 + 1482319719 * scriptData.intStackPointer];
		int key = scriptData.integerStack[3 + scriptData.intStackPointer * 1482319719];
		ClientScriptMap scriptMap = Class105_Sub1.cs2MapsList.list(mapID, (byte) -72);
		if (scriptMap.type != type1 || scriptMap.aChar5898 != type) {
		    throw new RuntimeException(new StringBuilder().append(mapID)
		    		.append(" ").append(key).toString());
		}
		if (115 == type) {
			scriptData.objectStack[((scriptData.objectStackPointer += -1650705371) * -290357331 - 1)]
					= scriptMap.getStringValue(key, -437258978);
		} else {
			scriptData.integerStack[((scriptData.intStackPointer += 1736754263) * 1482319719 - 1)]
					= scriptMap.getIntValue(key, -1977031040);
		}
    }
    
    public static final void method6081(int i, int i_74_, int i_75_, int i_76_,
					int i_77_, boolean bool, byte i_78_) {
		Class563.anInt7304 = i * 1851273669;
		Class473.anInt6379 = -587410343 * i_74_;
		Class434.anInt6120 = 1198081709 * i_75_;
		Class53.anInt691 = 761052961 * i_76_;
		Class46.anInt625 = -1318374229 * i_77_;
		if (4 == Class296.anInt4513 * 115241065) {
		    Class509.method11526(-1833215014);
		}
		if (bool && Class46.anInt625 * 868689411 >= 100) {
		    Class462.anInt6284 = -1098038784 * Class563.anInt7304 + 774563072;
		    Class636.anInt8248 = -1908580096 + 1516278272 * Class473.anInt6379;
		    Class175.anInt2123
			= (Class96_Sub5.method16046(133333741 * Class462.anInt6284,
						    -271636831 * Class636.anInt8248,
						    (993680393
						     * Class357_Sub1.anInt10357),
						    -24081165)
			   - -633729755 * Class434.anInt6120) * -1365297795;
		}
		Class296.anInt4513 = 1415978969;
		Class254.anInt4134 = -162819257;
		Class245.anInt3961 = -1540801703;
    }
    
    static void method6082(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = (Class326_Sub3.aClass482_10288.method11010
	       ((((ClientScriptData) class454).integerStack
		 [((((ClientScriptData) class454).intStackPointer -= 1736754263)
		   * 1482319719)]),
		(short) -21583)
	       .aString6425);
    }
}
