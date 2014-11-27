/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class120
{
    public int anInt1565;
    public static int anInt1566;
    
    boolean method2957() {
	return true;
    }
    
    public abstract void method2958(int i);
    
    void method2959(int i) {
	/* empty */
    }
    
    boolean method2960(byte i) {
	return true;
    }
    
    public abstract void method2961();
    
    boolean method2962() {
	return true;
    }
    
    void method2963() {
	/* empty */
    }
    
    boolean method2964() {
	return true;
    }
    
    void method2965() {
	/* empty */
    }
    
    void method2966() {
	/* empty */
    }
    
    void method2967() {
	/* empty */
    }
    
    Class120(RSByteBuffer class241_sub3) {
	anInt1565 = class241_sub3.readUnsignedShort(1162222719) * -1505644693;
    }
    
    static Class120 method2968(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) -15);
	Class613 class613 = Class42.method1068(i, 1230202648);
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
    
    static Class120 method2969(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) -39);
	Class613 class613 = Class42.method1068(i, 1597409960);
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
    
    static Class120 method2970(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) -19);
	Class613 class613 = Class42.method1068(i, 1672818191);
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
    
    static final void method2971(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	Class445_Sub16.aClass351_Sub1_8660.method6266(1125057561);
    }
    
    static final void storeSkillXP/*method2972*/(ClientScriptData scriptData, int i) {
		int skillID = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = Class1.aClass19_11.getExperience(skillID, 2010181758);
    }
}
