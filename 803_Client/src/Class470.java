/* Class470 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashSet;
import java.util.Set;

public class Class470 implements Interface47
{
    static Class470 aClass470_6336;
    static Class470 aClass470_6337;
    public static Class470 aClass470_6338;
    public static Class470 aClass470_6339 = new Class470("", 4);
    public static Class470 aClass470_6340;
    public static Class470 aClass470_6341;
    static Class470 aClass470_6342;
    public static Class470 aClass470_6343;
    static Class470 aClass470_6344;
    public static Class470 aClass470_6345;
    int anInt6346;
    public static Class470 aClass470_6347
	= new Class470("", 3, new Class458[] { Class458.aClass458_6258 });
    Set aSet6348;
    
    Class470(String string, int i) {
	((Class470) this).aSet6348 = new HashSet();
	((Class470) this).anInt6346 = -1039112103 * i;
    }
    
    public boolean method10759(Class458 class458) {
	return ((Class470) this).aSet6348.contains(class458);
    }
    
    Class470(String string, int i, Class458[] class458s) {
	((Class470) this).aSet6348 = new HashSet();
	((Class470) this).anInt6346 = -1039112103 * i;
	Class458[] class458s_0_ = class458s;
	for (int i_1_ = 0; i_1_ < class458s_0_.length; i_1_++) {
	    Class458 class458 = class458s_0_[i_1_];
	    ((Class470) this).aSet6348.add(class458);
	}
    }
    
    public int getId(byte i) {
	return -2145886231 * ((Class470) this).anInt6346;
    }
    
    public boolean method10760(Class458 class458, int i) {
	return ((Class470) this).aSet6348.contains(class458);
    }
    
    public static Class470[] method10761(int i) {
	return new Class470[] { aClass470_6345, aClass470_6338, aClass470_6336,
				aClass470_6344, aClass470_6337, aClass470_6347,
				aClass470_6341, aClass470_6339, aClass470_6343,
				aClass470_6340, aClass470_6342 };
    }
    
    public int method147() {
	return -2145886231 * ((Class470) this).anInt6346;
    }
    
    public static Class470[] method10762() {
	return new Class470[] { aClass470_6345, aClass470_6338, aClass470_6336,
				aClass470_6344, aClass470_6337, aClass470_6347,
				aClass470_6341, aClass470_6339, aClass470_6343,
				aClass470_6340, aClass470_6342 };
    }
    
    public int method11() {
	return -2145886231 * ((Class470) this).anInt6346;
    }
    
    static final void method10763(ClientScriptData class454, int i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_2_, (byte) -125);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_2_ >> 16];
	Class467.setKeyTypedEvent(class58, class35, class454, 1891774440);
    }
    
    public boolean method10764(Class458 class458) {
	return ((Class470) this).aSet6348.contains(class458);
    }
    
    public static Class470[] method10765() {
	return new Class470[] { aClass470_6345, aClass470_6338, aClass470_6336,
				aClass470_6344, aClass470_6337, aClass470_6347,
				aClass470_6341, aClass470_6339, aClass470_6343,
				aClass470_6340, aClass470_6342 };
    }
    
    public int method9() {
	return -2145886231 * ((Class470) this).anInt6346;
    }
    
    static {
	aClass470_6337
	    = new Class470("", 11, new Class458[] { Class458.aClass458_6258 });
	aClass470_6338
	    = new Class470("", 5, new Class458[] { Class458.aClass458_6258,
						   Class458.aClass458_6257 });
	aClass470_6336
	    = new Class470("", 8, new Class458[] { Class458.aClass458_6258,
						   Class458.aClass458_6257 });
	aClass470_6341
	    = new Class470("", 2, new Class458[] { Class458.aClass458_6258,
						   Class458.aClass458_6259 });
	aClass470_6342
	    = new Class470("", 9, new Class458[] { Class458.aClass458_6258,
						   Class458.aClass458_6259 });
	aClass470_6343
	    = new Class470("", 1, new Class458[] { Class458.aClass458_6258,
						   Class458.aClass458_6257 });
	aClass470_6344
	    = new Class470("", 6, new Class458[] { Class458.aClass458_6257 });
	aClass470_6345
	    = new Class470("", 0, new Class458[] { Class458.aClass458_6257 });
	aClass470_6340
	    = new Class470("", 10, new Class458[] { Class458.aClass458_6258 });
	method10761(-1195904434);
    }
    
    public boolean method10766(Class458 class458) {
	return ((Class470) this).aSet6348.contains(class458);
    }
    
    public boolean method10767(Class458 class458) {
	return ((Class470) this).aSet6348.contains(class458);
    }
    
    public boolean method10768(Class458 class458) {
	return ((Class470) this).aSet6348.contains(class458);
    }
    
    public int method10() {
	return -2145886231 * ((Class470) this).anInt6346;
    }
    
    static void method10769(int i, int i_3_, int i_4_) {
	Class16.anInt135 = -1859189089 * i;
	Class16.anInt177 = 773548735 * i_3_;
    }
    
    static void method10770(int i) {
	RS3File class408
	    = Class477.openPrefs("2", client.currentGame.name,
				   false, (byte) -79);
	Class473.varClientDomain.load(class408, (byte) 101);
    }
    
    static final void method10771(ClientScriptData class454, byte i) {
	int i_5_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class1.aClass19_11.method879(i_5_, 404298002);
    }
    
    static final void method10772(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = Class245.method4918(Class436.method7799((((ClientScriptData) class454)
						       .integerStack
						       [((((ClientScriptData) class454)
							      .intStackPointer
							  -= 1736754263)
							 * 1482319719)]),
						      (byte) 32),
				  VarPlayerDomain.currentLocale.getId((byte) 0),
				  -1341977925);
    }
    
    static final void method10773(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_7_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (Class123.aClass292_1579.method5686(i_6_, (byte) 109)
	       .aCharArray10969[i_7_]);
    }
    
    public static String method10774(Class241_Sub39_Sub11 class241_sub39_sub11,
				     int i) {
	if (Class16.aBool141 || null == class241_sub39_sub11)
	    return "";
	if ((((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869 == null
	     || ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869
		    .length() == 0)
	    && (((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
		!= null)
	    && ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
		   .length() > 0)
	    return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880;
	return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869;
    }
}
