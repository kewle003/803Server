/* Class548 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class548
{
    public Class541 aClass541_7053;
    public byte aByte7054;
    public Class475_Sub1_Sub3 aClass475_Sub1_Sub3_7055;
    public Class475_Sub1_Sub3 aClass475_Sub1_Sub3_7056;
    short aShort7057;
    public Class475_Sub1_Sub4 aClass475_Sub1_Sub4_7058;
    public Class475_Sub1_Sub5 aClass475_Sub1_Sub5_7059;
    Class475_Sub1_Sub2 aClass475_Sub1_Sub2_7060;
    public Class475_Sub1_Sub5 aClass475_Sub1_Sub5_7061;
    short aShort7062;
    public Class548 aClass548_7063;
    short aShort7064;
    short aShort7065;
    
    public Class548(int i) {
	aByte7054 = (byte) i;
    }
    
    public static int method12000(CharSequence charsequence,
				  CharSequence charsequence_0_, int i) {
	int i_1_ = charsequence.length();
	int i_2_ = charsequence_0_.length();
	if (i_1_ == 0)
	    return i_2_;
	if (i_2_ == 0)
	    return i_1_;
	int[] is = new int[i_1_ + 1];
	int[] is_3_ = new int[i_1_ + 1];
	for (int i_4_ = 0; i_4_ <= i_1_; i_4_++)
	    is[i_4_] = i_4_;
	for (int i_5_ = 1; i_5_ <= i_2_; i_5_++) {
	    is_3_[0] = i_5_;
	    char c = charsequence_0_.charAt(i_5_ - 1);
	    for (int i_6_ = 1; i_6_ <= i_1_; i_6_++)
		is_3_[i_6_]
		    = Math.min(Math.min(is_3_[i_6_ - 1] + 1, is[i_6_] + 1),
			       (is[i_6_ - 1]
				+ (charsequence.charAt(i_6_ - 1) == c ? 0
				   : 1)));
	    int[] is_7_ = is;
	    is = is_3_;
	    is_3_ = is_7_;
	}
	return is[i_1_];
    }
    
    public static void method12001(boolean bool, byte[] is, byte i) {
		if (Class395.aClass241_Sub3_5778 == null) {
		    Class395.aClass241_Sub3_5778 = new RSByteBuffer(20000);
		}
		Class395.aClass241_Sub3_5778.writeBytes(is, 0, is.length, 752061035);
		if (bool) {
		    Class296.method5722(Class395.aClass241_Sub3_5778.payload, (byte) 100);
		    Class395.aClass507_Sub1Array5780 = new Class507_Sub1[Class212.anInt2507 * 1153743561];
		    int i_8_ = 0;
		    for (int i_9_ = Class120_Sub15.anInt10541 * 1652918313;
		    		i_9_ <= -505875311 * Class509.anInt6681; i_9_++) {
				Class507_Sub1 class507_sub1 = Class115.method2803(i_9_, (byte) 77);
				if (class507_sub1 != null) {
				    Class395.aClass507_Sub1Array5780[i_8_++] = class507_sub1;
				}
		    }
		    Class395.aBool5776 = false;
		    Class395.aLong5783 = Class50.method1249((byte) 1) * 3007035773152075831L;
		    Class395.aClass241_Sub3_5778 = null;
		}
    }
    
    static void method12002(Class247_Sub2 class247_sub2, byte i) {
	((Class247_Sub2) class247_sub2).aClass475_Sub1_Sub1_Sub3_10068 = null;
	if (Class247_Sub2.anInt10067 * -846946095 < 20) {
	    Class247_Sub2.aClass421_10072.method7522(class247_sub2,
						     -1665299415);
	    Class247_Sub2.anInt10067 += 2136455217;
	}
    }
    
    static final void method12003(ClientScriptData class454, byte i) {
	int i_10_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_10_, (byte) -46);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_10_ >> 16];
	Class24.method929(class58, class35, class454, (byte) -7);
    }
}
