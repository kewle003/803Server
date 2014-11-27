/* Class600 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class600 implements Interface47
{
    public static Class600 RUNESCAPE;//aClass600_7715
    int anInt7716;
    static Class600 WAR_OF_LEGENDS;//aClass600_7717
    public static Class600 STELLAR_DAWN;//aClass600_7718
    static Class600 EIGHT_REALMS;//aClass600_7719
    public static Class600 TRANSFORMERS;//aClass600_7720
    public static Class600 SCRATCH;//aClass600_7721
    static Class600 FUNORB;//aClass600_7722
    int id;//anInt7723
    public static Class600 LEGACY;//aClass600_7724
    String aString7725;
    
    public String method13150() {
	return aString7725;
    }
    
    public int method10() {
	return 713716789 * id;
    }
    
    public int getId(byte i) {
    	return 713716789 * id;
    }
    
    Class600(int i, int i_0_, String string, String string_1_, boolean bool, Class600[] class600s) {
		anInt7716 = i * 1681831689;
		id = 2063351325 * i_0_;
		aString7725 = string_1_;
    }
    
    static {
    	RUNESCAPE = new Class600(4, 0, "runescape", "RuneScape");
    	FUNORB = new Class600(7, 1, "funorb", "Fun Orb");
		WAR_OF_LEGENDS = new Class600(5, 2, "waroflegends", "War of Legends");
		STELLAR_DAWN = new Class600(0, 3, "stellardawn", "Stellar Dawn");
		EIGHT_REALMS = new Class600(3, 4, "8realms", "8 Realms");
		TRANSFORMERS = new Class600(2, 5, "transformers", "Transformers Universe");
		SCRATCH = new Class600(1, 6, "scratch", "Scratch");
		LEGACY = new Class600(6, -1, "legacy", "Legacy", true,
			   new Class600[] { RUNESCAPE, FUNORB,
					    WAR_OF_LEGENDS, EIGHT_REALMS,
					    STELLAR_DAWN });
    }
    
    public int method9() {
	return 713716789 * id;
    }
    
    Class600(int i, int i_2_, String string, String string_3_) {
		anInt7716 = i * 1681831689;
		id = i_2_ * 2063351325;
		aString7725 = string_3_;
    }
    
    public int method11() {
	return 713716789 * id;
    }
    
    public int method147() {
	return 713716789 * id;
    }
    
    public String method13151() {
	return aString7725;
    }
    
    public String toString() {
	return aString7725;
    }
    
    public String method13152() {
	return aString7725;
    }
    
    static final void method13153(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860
		  .method14441(-840939490) == 1 ? 1 : 0;
    }
    
    public static void method13154(int i, int i_4_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(11, (long) i);
	class241_sub39_sub13.method17278((byte) -10);
    }
}
