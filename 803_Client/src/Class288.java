/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class288 implements Interface64
{
    String aString4480;
    JS5 aClass210_4481;
    protected static Class426 fsimp14;//aClass426_4482
    
    Class288(JS5 class210, String string) {
	((Class288) this).aClass210_4481 = class210;
	((Class288) this).aString4480 = string;
    }
    
    public int method146(byte i) {
	if (((Class288) this).aClass210_4481
		.containerIdentifierExists(((Class288) this).aString4480, -342644294))
	    return 100;
	return ((Class288) this).aClass210_4481
		   .method4210(((Class288) this).aString4480, -821959567);
    }
    
    public Class632 method446(byte i) {
	return Class632.aClass632_8054;
    }
    
    public int method447() {
	if (((Class288) this).aClass210_4481
		.containerIdentifierExists(((Class288) this).aString4480, 1056330731))
	    return 100;
	return ((Class288) this).aClass210_4481
		   .method4210(((Class288) this).aString4480, -1251314913);
    }
    
    public Class632 method448() {
	return Class632.aClass632_8054;
    }
    
    public Class632 method449() {
	return Class632.aClass632_8054;
    }
    
    public Class632 method450() {
	return Class632.aClass632_8054;
    }
    
    static final void decrementIntStack/*method5657*/(ClientScriptData scriptData, byte i) {
		scriptData.intStackPointer -= 1736754263;
    }
    
    static final void method5658(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	InterfaceComponent class58_0_ = LoadingScreenDef.method6489(class35, class58, -745258942);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58_0_ == null ? -1 : 445907013 * class58_0_.componentHash;
    }
    
    static final void method5659(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).objectStackPointer -= 993556554;
	String string
	    = (String) (((ClientScriptData) class454).objectStack
			[-290357331 * ((ClientScriptData) class454).objectStackPointer]);
	String string_1_
	    = (String) (((ClientScriptData) class454).objectStack
			[1 + -290357331 * ((ClientScriptData) class454).objectStackPointer]);
	if ((((ClientScriptData) class454).integerStack
	     [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	    == 1)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= string;
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= string_1_;
    }
    
    static final void method5660(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub6_8891
		  .method14143(1969419521);
    }
    
    static void method5661(int i) {
	if (WorldTile.anInt10182 * 257473507 < 0) {
	    WorldTile.anInt10182 = 0;
	    Class573_Sub1.anInt8773 = -362944491;
	    Class573_Sub1.anInt8794 = -1265261197;
	}
	if (WorldTile.anInt10182 * 257473507 > Class573_Sub1.anInt7390) {
	    WorldTile.anInt10182 = -1822006837 * Class573_Sub1.anInt7390;
	    Class573_Sub1.anInt8773 = -362944491;
	    Class573_Sub1.anInt8794 = -1265261197;
	}
	if (291545115 * WorldTile.anInt10183 < 0) {
	    WorldTile.anInt10183 = 0;
	    Class573_Sub1.anInt8773 = -362944491;
	    Class573_Sub1.anInt8794 = -1265261197;
	}
	if (291545115 * WorldTile.anInt10183 > Class573_Sub1.anInt7391) {
	    WorldTile.anInt10183 = -1182123501 * Class573_Sub1.anInt7391;
	    Class573_Sub1.anInt8773 = -362944491;
	    Class573_Sub1.anInt8794 = -1265261197;
	}
    }
}
