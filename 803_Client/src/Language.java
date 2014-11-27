/* Class437 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Locale;

//package com.jagex.core.constants;
public class Language implements Interface47 {
    public static Language aClass437_6130;
    public static Language aClass437_6131;
    String aString6132;
    public static Language aClass437_6133;
    static Language aClass437_6134;
    public static Language LOCALE_EN
	= new Language("EN", "en", "English", Class470.aClass470_6345, 0,
		       "GB");
    public static Language aClass437_6136;
    String aString6137;
    public static final int anInt6138 = 7;
    public static Language aClass437_6139;
    public int anInt6140;
    Locale aLocale6141;
    static Language[] aClass437Array6142;
    
    public Locale method7800(int i) {
	return ((Language) this).aLocale6141;
    }
    
    public Locale method7801() {
	return ((Language) this).aLocale6141;
    }
    
    public String method7802(byte i) {
	return ((Language) this).aString6132;
    }
    
    public int getId(byte i) {
	return -1326047777 * anInt6140;
    }
    
    Language(String string, String string_0_, String string_1_,
	     Class470 class470, int i, String string_2_) {
	((Language) this).aString6137 = string;
	((Language) this).aString6132 = string_0_;
	anInt6140 = 1863704095 * i;
	if (null != string_2_)
	    ((Language) this).aLocale6141
		= new Locale(string_0_.substring(0, 2), string_2_);
	else
	    ((Language) this).aLocale6141
		= new Locale(string_0_.substring(0, 2));
    }
    
    public static Language method7803(int i, int i_3_) {
	if (i < 0 || i >= aClass437Array6142.length)
	    return null;
	return aClass437Array6142[i];
    }
    
    public String toString() {
	return method7802((byte) -95).toLowerCase(Locale.ENGLISH);
    }
    
    static {
	aClass437_6131 = new Language("DE", "de", "German",
				      Class470.aClass470_6345, 1, "DE");
	aClass437_6130 = new Language("FR", "fr", "French",
				      Class470.aClass470_6345, 2, "FR");
	aClass437_6133 = new Language("PT", "pt", "Portuguese",
				      Class470.aClass470_6345, 3, "BR");
	aClass437_6134 = new Language("NL", "nl", "Dutch",
				      Class470.aClass470_6347, 4, "NL");
	aClass437_6139 = new Language("ES", "es", "Spanish",
				      Class470.aClass470_6347, 5, "ES");
	aClass437_6136
	    = new Language("ES_MX", "es-mx", "Spanish (Latin American)",
			   Class470.aClass470_6345, 6, "MX");
	Language[] class437s = method7812((byte) 25);
	aClass437Array6142 = new Language[class437s.length];
	Language[] class437s_4_ = class437s;
	for (int i = 0; i < class437s_4_.length; i++) {
	    Language class437 = class437s_4_[i];
	    if (null != aClass437Array6142[class437.anInt6140 * -1326047777])
		throw new IllegalStateException();
	    aClass437Array6142[class437.anInt6140 * -1326047777] = class437;
	}
    }
    
    public String method7804() {
	return ((Language) this).aString6132;
    }
    
    public int method10() {
	return -1326047777 * anInt6140;
    }
    
    public String method7805() {
	return method7802((byte) -86).toLowerCase(Locale.ENGLISH);
    }
    
    public static Language method7806(int i) {
	if (i < 0 || i >= aClass437Array6142.length)
	    return null;
	return aClass437Array6142[i];
    }
    
    public String method7807() {
	return method7802((byte) -13).toLowerCase(Locale.ENGLISH);
    }
    
    public int method9() {
	return -1326047777 * anInt6140;
    }
    
    public String method7808() {
	return method7802((byte) -46).toLowerCase(Locale.ENGLISH);
    }
    
    public static Language[] method7809() {
	return new Language[] { aClass437_6133, aClass437_6139, LOCALE_EN,
				aClass437_6136, aClass437_6134, aClass437_6131,
				aClass437_6130 };
    }
    
    public static Language[] method7810() {
	return new Language[] { aClass437_6133, aClass437_6139, LOCALE_EN,
				aClass437_6136, aClass437_6134, aClass437_6131,
				aClass437_6130 };
    }
    
    public String method7811() {
	return ((Language) this).aString6132;
    }
    
    public int method11() {
	return -1326047777 * anInt6140;
    }
    
    public static Language[] method7812(byte i) {
	return new Language[] { aClass437_6133, aClass437_6139, LOCALE_EN,
				aClass437_6136, aClass437_6134, aClass437_6131,
				aClass437_6130 };
    }
    
    public int method147() {
	return -1326047777 * anInt6140;
    }
    
    static final void method7813(ClientScriptData class454, byte i) {
	int i_5_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_5_, (byte) -112);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_5_ >> 16];
	Class135.method3101(class58, class35, class454, (byte) 39);
    }
    
    static final void setVarBit/*method7814*/(ClientScriptData scriptData, int i) throws VarBitOverflowException {
		VarBitType varBitType = (VarBitType) scriptData.script
				  .objectConstants[scriptData.step * 1938982693];
		VarDomain varDomain = (VarDomain)(
				scriptData.integerConstants[1938982693 * scriptData.step] == 0
				? scriptData.aMap6241.get(varBitType.baseVar.domain)
				: scriptData.aMap6238.get(varBitType.baseVar.domain));
		varDomain.setVarBitValue(varBitType,
				scriptData.integerStack[((scriptData.intStackPointer -= 1736754263) * 1482319719)],
				1061388156);
    }
    
    public Locale method7815() {
	return ((Language) this).aLocale6141;
    }
    
    public static void method7816(int i) {
	if (Class468.method10746(-418212801))
	    Entity.method17870(new Class472(), -942565154);
    }
}
