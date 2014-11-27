/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class92 implements Interface29
{
    SoundManager this$0;
    
    Class92(SoundManager class49) {
	((Class92) this).this$0 = class49;
    }
    
    public float method174(int i) {
	return ((float) Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8872.method14143(1903973452)
		/ 255.0F);
    }
    
    public float method173() {
	return ((float) Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8872.method14143(1987417159)
		/ 255.0F);
    }
    
    static void method2069(byte i) {
	Class247_Sub2.aClass96_10073 = null;
	Class5.aClass96_26 = null;
	Class81.aClass96_1149 = null;
	Class191.aClass168Array2284 = null;
	Class481.aClass168Array6456 = null;
	Class360.aClass168Array5502 = null;
	Class274.aClass168Array4379 = null;
	HitMarkTypeList.aClass168Array7251 = null;
	Class445_Sub9.aClass168Array8642 = null;
	Class133.aClass168_1616 = null;
	Class443.aClass168_6165 = null;
	Class5.aClass168Array27 = null;
    }
    
    static final void method2070(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -79) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray952
	    = Class299.extractCs2Params(string, class454, -378914113);
	class58.hasClientScript = true;
    }
    
    static final void method2071(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -97) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray912
	    = Class299.extractCs2Params(string, class454, -1550693190);
	class58.hasClientScript = true;
    }
    
    static final void method2072(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= 1924427709;
	Class330[] class330s = Class200.method4070((byte) 21);
	Class324[] class324s = Class327.method6016((byte) -30);
	Class524.method11750
	    (class330s[(((ClientScriptData) class454).integerStack
			[((ClientScriptData) class454).intStackPointer * 1482319719])],
	     class324s[(((ClientScriptData) class454).integerStack
			[1 + ((ClientScriptData) class454).intStackPointer * 1482319719])],
	     (((ClientScriptData) class454).integerStack
	      [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]),
	     (((ClientScriptData) class454).integerStack
	      [1482319719 * ((ClientScriptData) class454).intStackPointer + 3]),
	     (((ClientScriptData) class454).integerStack
	      [1482319719 * ((ClientScriptData) class454).intStackPointer + 4]),
	     (((ClientScriptData) class454).integerStack
	      [((ClientScriptData) class454).intStackPointer * 1482319719 + 5]),
	     (((ClientScriptData) class454).integerStack
	      [6 + 1482319719 * ((ClientScriptData) class454).intStackPointer]),
	     (((ClientScriptData) class454).integerStack
	      [((ClientScriptData) class454).intStackPointer * 1482319719 + 7]),
	     (((ClientScriptData) class454).integerStack
	      [((ClientScriptData) class454).intStackPointer * 1482319719 + 8]),
	     (((ClientScriptData) class454).integerStack
	      [1482319719 * ((ClientScriptData) class454).intStackPointer + 9]),
	     (((ClientScriptData) class454).integerStack
	      [((ClientScriptData) class454).intStackPointer * 1482319719 + 10]),
	     (byte) 0);
    }
    
    static final void method2073(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class639.method13604(i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff, (byte) 80);
    }
    
    static String method2074(byte[] is, int i, int i_1_, int i_2_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_3_ = i; i_3_ < i_1_ + i; i_3_ += 3) {
	    int i_4_ = is[i_3_] & 0xff;
	    stringbuilder.append(Class461.aCharArray6280[i_4_ >>> 2]);
	    if (i_3_ < i_1_ - 1) {
		int i_5_ = is[i_3_ + 1] & 0xff;
		stringbuilder.append(Class461.aCharArray6280
				     [(i_4_ & 0x3) << 4 | i_5_ >>> 4]);
		if (i_3_ < i_1_ - 2) {
		    int i_6_ = is[i_3_ + 2] & 0xff;
		    stringbuilder.append
			(Class461.aCharArray6280
			 [(i_5_ & 0xf) << 2 | i_6_ >>> 6])
			.append(Class461.aCharArray6280[i_6_ & 0x3f]);
		} else
		    stringbuilder.append
			(Class461.aCharArray6280[(i_5_ & 0xf) << 2])
			.append('=');
	    } else
		stringbuilder.append
		    (Class461.aCharArray6280[(i_4_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    static Class120 method2075(RSByteBuffer class241_sub3, byte i) {
	int i_7_ = class241_sub3.readUnsignedByte((byte) -27);
	Class613 class613 = Class42.method1068(i_7_, 1085780294);
	Class120 class120 = null;
	switch (class613.anInt7802 * 1730543511) {
	case 24:
	    class120 = new Class120_Sub22_Sub1(class241_sub3);
	    break;
	case 10:
	    class120 = new Class120_Sub20(class241_sub3, true);
	    break;
	default:
	    break;
	case 2:
	    class120 = new Class120_Sub1(class241_sub3);
	    break;
	case 0:
	    class120 = new Class120_Sub18(class241_sub3);
	    break;
	case 30:
	    class120 = new Class120_Sub6(class241_sub3);
	    break;
	case 21:
	    class120 = new Class120_Sub12(class241_sub3, 1, 0);
	    break;
	case 4:
	    class120 = new Class120_Sub13(class241_sub3);
	    break;
	case 9:
	    class120 = new Class120_Sub12(class241_sub3, 0, 0);
	    break;
	case 25:
	    class120 = new Class120_Sub9(class241_sub3);
	    break;
	case 26:
	    class120 = new Class120_Sub22_Sub2(class241_sub3);
	    break;
	case 12:
	    class120 = new Class120_Sub17(class241_sub3);
	    break;
	case 29:
	    class120 = new Class120_Sub2(class241_sub3);
	    break;
	case 15:
	    class120 = new Class120_Sub3(class241_sub3);
	    break;
	case 1:
	    class120 = new Class120_Sub10(class241_sub3);
	    break;
	case 14:
	    class120 = new Class120_Sub12(class241_sub3, 0, 1);
	    break;
	case 3:
	    class120 = new Class120_Sub21(class241_sub3);
	    break;
	case 11:
	    class120 = new Class120_Sub16(class241_sub3);
	    break;
	case 17:
	    class120 = new Class120_Sub19(class241_sub3);
	    break;
	case 13:
	    class120 = new Class120_Sub5(class241_sub3);
	    break;
	case 6:
	    class120 = new Class120_Sub8(class241_sub3);
	    break;
	case 16:
	    class120 = new Class120_Sub15(class241_sub3);
	    break;
	case 22:
	    class120 = new Class120_Sub12(class241_sub3, 1, 1);
	    break;
	case 23:
	    class120 = new Class120_Sub7(class241_sub3);
	    break;
	case 20:
	    class120 = new Class120_Sub4(class241_sub3);
	    break;
	case 18:
	    class120 = new Class120_Sub14(class241_sub3);
	    break;
	case 8:
	    class120 = new Class120_Sub11(class241_sub3);
	    break;
	case 28:
	    class120 = new Class120_Sub20(class241_sub3, false);
	    break;
	case 27:
	    class120 = new Class120_Sub23(class241_sub3);
	}
	return class120;
    }
    
    static Class621[] method2076(int i) {
	return (new Class621[]
		{ Class621.aClass621_7861, Class621.aClass621_7865,
		  Class621.aClass621_7873, Class621.aClass621_7871,
		  Class621.aClass621_7860, Class621.aClass621_7866,
		  Class621.aClass621_7867, Class621.aClass621_7870,
		  Class621.aClass621_7868, Class621.aClass621_7862,
		  Class621.aClass621_7869, Class621.aClass621_7864,
		  Class621.aClass621_7875, Class621.aClass621_7859,
		  Class621.aClass621_7872 });
    }
    
    static final void method2077(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_8_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_9_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	int i_10_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	float f = (float) (2.0 * Math.atan((double) ((float) i_8_ / 2.0F
						     / (float) i_10_)));
	float f_11_ = (float) (2.0 * Math.atan((double) ((float) i_9_ / 2.0F
							 / (float) i_10_)));
	Class445_Sub16.aClass351_Sub1_8660.method6259(f, f_11_, (byte) 42);
    }
}
