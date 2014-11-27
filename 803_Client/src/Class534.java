/* Class534 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class534 implements Interface47
{
    static int anInt6968;
    static Class534 aClass534_6969;
    static Class534 aClass534_6970;
    static Class534 aClass534_6971;
    static Class534 aClass534_6972;
    static Class534 aClass534_6973 = new Class534(0);
    int anInt6974;
    static Class534 aClass534_6975 = new Class534(1);
    
    public static Class534[] method11877() {
	return (new Class534[]
		{ aClass534_6975, aClass534_6973, aClass534_6970,
		  aClass534_6971, aClass534_6972, aClass534_6969 });
    }
    
    public int getId(byte i) {
	return ((Class534) this).anInt6974 * 1037707715;
    }
    
    static {
	aClass534_6970 = new Class534(2);
	aClass534_6969 = new Class534(3);
	aClass534_6972 = new Class534(4);
	aClass534_6971 = new Class534(5);
    }
    
    public int method9() {
	return ((Class534) this).anInt6974 * 1037707715;
    }
    
    public int method147() {
	return ((Class534) this).anInt6974 * 1037707715;
    }
    
    public int method11() {
	return ((Class534) this).anInt6974 * 1037707715;
    }
    
    Class534(int i) {
	((Class534) this).anInt6974 = -1584328981 * i;
    }
    
    public static Class534[] method11878() {
	return (new Class534[]
		{ aClass534_6975, aClass534_6973, aClass534_6970,
		  aClass534_6971, aClass534_6972, aClass534_6969 });
    }
    
    public int method10() {
	return ((Class534) this).anInt6974 * 1037707715;
    }
    
    public static Class534[] method11879() {
	return (new Class534[]
		{ aClass534_6975, aClass534_6973, aClass534_6970,
		  aClass534_6971, aClass534_6972, aClass534_6969 });
    }
    
    static final void method11880(ClientScriptData class454, int i) {
	Class440.method7832((((ClientScriptData) class454).integerStack
			     [((((ClientScriptData) class454).intStackPointer -= 1736754263)
			       * 1482319719)]),
			    -1, -1, false, (byte) 23);
    }
    
    static final void method11881(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub39_Sub12 class241_sub39_sub12 = Class573.method12560(i_0_);
	if (null == class241_sub39_sub12)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub39_sub12.anInt10927 * 414094675;
    }
    
    static void method11882(String menuOption, String string_1_, int cursorID, int i_2_,
			    int slot2, long l, int slot1, int compHash, boolean bool,
			    boolean bool_6_, long l_7_, boolean bool_8_, int i_9_) {
		if (!Class16.aBool141 && Class16.anInt148 * 1327183635 < 506) {
			cursorID = (cursorID != -1) ? cursorID : client.anInt8458 * 12960807;
		    Class241_Sub39_Sub11 class241_sub39_sub11
				= new Class241_Sub39_Sub11(menuOption, string_1_, cursorID, i_2_, slot2, l,
						slot1, compHash, bool, bool_6_, l_7_, bool_8_);
		    Class355.method6437(class241_sub39_sub11, 1623890574);
		}
    }
}
