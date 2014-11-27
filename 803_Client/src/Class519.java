/* Class519 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class519 implements Interface47
{
    static Class519 aClass519_6789;
    static Class519 aClass519_6790 = new Class519(0);
    static Class519 aClass519_6791;
    int anInt6792;
    
    public int getId(byte i) {
	return ((Class519) this).anInt6792 * 1174006635;
    }
    
    public int method147() {
	return ((Class519) this).anInt6792 * 1174006635;
    }
    
    public int method9() {
	return ((Class519) this).anInt6792 * 1174006635;
    }
    
    public static Class519[] method11664() {
	return (new Class519[]
		{ aClass519_6789, aClass519_6790, aClass519_6791 });
    }
    
    public int method10() {
	return ((Class519) this).anInt6792 * 1174006635;
    }
    
    static {
	aClass519_6789 = new Class519(1);
	aClass519_6791 = new Class519(2);
    }
    
    public int method11() {
	return ((Class519) this).anInt6792 * 1174006635;
    }
    
    Class519(int i) {
	((Class519) this).anInt6792 = 1220143427 * i;
    }
    
    public static Class519[] method11665() {
	return (new Class519[]
		{ aClass519_6789, aClass519_6790, aClass519_6791 });
    }
    
    public static Class519[] method11666() {
	return (new Class519[]
		{ aClass519_6789, aClass519_6790, aClass519_6791 });
    }
    
    static void method11667(Class614 class614, int i, int i_0_,
			    ClientScriptData class454, int i_1_) {
	ClientScript class241_sub39_sub1
	    = Class355.method6436(class614, i, i_0_, 135503473);
	if (null == class241_sub39_sub1)
	    Class162.method3516(-1895481667);
	else {
	    ((ClientScriptData) class454).integerVariables
		= new int[1601258603 * class241_sub39_sub1.anInt10814];
	    ((ClientScriptData) class454).objectValues
		= new Object[1764338319 * class241_sub39_sub1.anInt10811];
	    if (class241_sub39_sub1.aClass614_10821 == Class614.aClass614_7810
		|| (Class614.aClass614_7808
		    == class241_sub39_sub1.aClass614_10821)
		|| (Class614.aClass614_7811
		    == class241_sub39_sub1.aClass614_10821)) {
		int i_2_ = 0;
		int i_3_ = 0;
		if (Class417.aClass58_6019 != null) {
		    i_2_ = -361730557 * Class417.aClass58_6019.anInt928;
		    i_3_ = -145726829 * Class417.aClass58_6019.anInt894;
		}
		((ClientScriptData) class454).integerVariables[0] = i;
		((ClientScriptData) class454).integerVariables[1]
		    = Class106.aClass580_1503.method12718(1136479801) - i_2_;
		((ClientScriptData) class454).integerVariables[2]
		    = Class106.aClass580_1503.method12740((byte) -127) - i_3_;
	    } else if ((class241_sub39_sub1.aClass614_10821
			== Class614.aClass614_7813)
		       || (class241_sub39_sub1.aClass614_10821
			   == Class614.aClass614_7806)
		       || (Class614.aClass614_7807
			   == class241_sub39_sub1.aClass614_10821)
		       || (class241_sub39_sub1.aClass614_10821
			   == Class614.aClass614_7819)
		       || (Class614.aClass614_7809
			   == class241_sub39_sub1.aClass614_10821))
		((ClientScriptData) class454).integerVariables[0] = i;
	    else if (Class614.aClass614_7818
		     == class241_sub39_sub1.aClass614_10821)
		((ClientScriptData) class454).integerVariables[0]
		    = ((ClientScriptData) class454).anInt6218 * 1201883481;
	    DefaultsGroup.executeClientScript(class241_sub39_sub1, 200000, class454,
				 -1082309012);
	}
    }
    
    static final void method11668(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 2]);
	int i_7_ = (((ClientScriptData) class454).integerStack
		    [3 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_8_ = 256;
	Class402.soundManager.method1162(Class112.aClass112_1522, i_4_, i_5_,
					  i_7_,
					  Class130.aClass130_1597
					      .method3067(-960497231),
					  Class127.aClass127_1587, 0.0F, 0.0F,
					  null, 0, i_8_, i_6_, -1178381569);
    }
    
    static final void method11669(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854
		  .method14281(-844813282) == 1 ? 1 : 0;
    }
    
    static final void method11670(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStackPointer -= 993556554;
	String string
	    = (String) (((ClientScriptData) class454).objectStack
			[-290357331 * ((ClientScriptData) class454).objectStackPointer]);
	String string_9_
	    = (String) (((ClientScriptData) class454).objectStack
			[1 + ((ClientScriptData) class454).objectStackPointer * -290357331]);
	Class241_Sub11.method14943(string, string_9_, -1461856082);
    }
    
    static final void method11671(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -48) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray980
	    = Class299.extractCs2Params(string, class454, -559537476);
	class58.hasClientScript = true;
    }
    
    static final void method11672(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0;
    }
    
    static final void method11673(int i, int i_10_, int i_11_, int i_12_,
				  int i_13_, int i_14_, int i_15_, int i_16_,
				  int i_17_, int i_18_) {
	if (i_11_ >= 1 && i_12_ >= 1
	    && i_11_ <= client.aClass238_8477.method4744(-1373080596) - 2
	    && i_12_ <= client.aClass238_8477.method4745(1178347984) - 2) {
	    int i_19_ = i;
	    if (i_19_ < 3 && client.aClass238_8477.method4753((byte) -66)
				 .method4331(i_11_, i_12_, 1955889563))
		i_19_++;
	    if (client.aClass238_8477.method4751(-1991053603) != null) {
		client.aClass238_8477.method4759(-35878102).method16545
		    (Class236.aClass103_2713, i, i_10_, i_11_, i_12_,
		     (byte) -107);
		if (i_13_ >= 0) {
		    int i_20_
			= Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub18_8862.method14262((byte) 113);
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			((Class241_Sub5_Sub9.aClass241_Sub9_11043
			  .aClass445_Sub18_8862),
			 1, (byte) 2);
		    client.aClass238_8477.method4759(-35878102).method16539
			(Class236.aClass103_2713, i_19_, i, i_11_, i_12_,
			 i_13_, i_14_, i_15_, i_16_, i_17_, 1892864491);
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			((Class241_Sub5_Sub9.aClass241_Sub9_11043
			  .aClass445_Sub18_8862),
			 i_20_, (byte) 2);
		}
		Class558.method12326((Class21.myPlayer
				      .nodePlane),
				     953479709);
	    }
	}
    }
    
    static final void method11674(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	if (4 == -1579470857 * class58.componentType)
	    SkillData.method11327(class58, class35, class454, (byte) 3);
    }
    
    static final void storeClanBanName/*method11675*/(ClientScriptData scriptData, byte i) {
		int index = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		scriptData.objectStack[(scriptData.objectStackPointer += -1650705371) * -290357331 - 1]
		    = scriptData.clanSettings.clanBanNames[index];
    }
}
