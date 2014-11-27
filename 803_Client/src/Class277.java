/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Stack;

public class Class277 implements Interface64
{
    String aString4387;
    boolean aBool4388;
    public static Class236 aClass236_4389;
    
    boolean method5362() {
	return ((Class277) this).aBool4388;
    }
    
    public int method146(byte i) {
	if (((Class277) this).aBool4388)
	    return 100;
	int i_0_;
	try {
	    i_0_
		= Class120_Sub18.aClass585_10604
		      .load(((Class277) this).aString4387, -2096836016);
	} catch (Exception_Sub3 exception_sub3) {
	    Class120_Sub16.method16795(Class640.aClass640_8263,
				       exception_sub3.aString10692,
				       -702757577 * exception_sub3.anInt10693,
				       exception_sub3.getCause(), 618640024);
	    ((Class277) this).aBool4388 = true;
	    return 100;
	}
	return i_0_;
    }
    
    public Class632 method449() {
	return Class632.aClass632_8053;
    }
    
    void method5363(int i) {
	((Class277) this).aBool4388 = true;
    }
    
    public Class632 method446(byte i) {
	return Class632.aClass632_8053;
    }
    
    public int method447() {
	if (((Class277) this).aBool4388)
	    return 100;
	int i;
	try {
	    i = Class120_Sub18.aClass585_10604
		    .load(((Class277) this).aString4387, -2061677183);
	} catch (Exception_Sub3 exception_sub3) {
	    Class120_Sub16.method16795(Class640.aClass640_8263,
				       exception_sub3.aString10692,
				       -702757577 * exception_sub3.anInt10693,
				       exception_sub3.getCause(), -1626052788);
	    ((Class277) this).aBool4388 = true;
	    return 100;
	}
	return i;
    }
    
    public Class632 method448() {
	return Class632.aClass632_8053;
    }
    
    boolean method5364() {
	return ((Class277) this).aBool4388;
    }
    
    public Class632 method450() {
	return Class632.aClass632_8053;
    }
    
    boolean method5365(short i) {
	return ((Class277) this).aBool4388;
    }
    
    boolean method5366() {
	return ((Class277) this).aBool4388;
    }
    
    boolean method5367() {
	return ((Class277) this).aBool4388;
    }
    
    Class277(String string) {
	((Class277) this).aString4387 = string;
    }
    
    void method5368() {
	((Class277) this).aBool4388 = true;
    }
    
    void method5369() {
	((Class277) this).aBool4388 = true;
    }
    
    public static void method5370(int i) {
	synchronized (Class542.aStack7010) {
	    Class542.aStack7010 = new Stack();
	}
    }
    
    static final void method5371(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStackPointer -= 993556554;
	String string
	    = (String) (((ClientScriptData) class454).objectStack
			[((ClientScriptData) class454).objectStackPointer * -290357331]);
	String string_1_
	    = (String) (((ClientScriptData) class454).objectStack
			[((ClientScriptData) class454).objectStackPointer * -290357331 + 1]);
	if (Class21.myPlayer.aClass490_11499 != null
	    && (Class21.myPlayer.aClass490_11499
		.aBool6507))
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= string_1_;
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= string;
    }
    
    static void method5372(int i) {
	Class13.aString113 = "";
	Class13.aString112 = "";
    }
    
    static final void method5373(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -94) != null)
	    string = string.substring(0, string.length() - 1);
	class58.onMouseUpScript
	    = Class299.extractCs2Params(string, class454, 1504215976);
	class58.hasClientScript = true;
    }
    
    static int method5374(Class241_Sub39_Sub11 class241_sub39_sub11,
			  Class639 class639, byte i) {
	String string = SkillTypeIterator.method11257(class241_sub39_sub11, (byte) 25);
	int[] is = Class213.method4309(class241_sub39_sub11, 344043898);
	if (is != null)
	    string = new StringBuilder().append(string).append
			 (Class221.method4476(is, (byte) 80)).toString();
	int i_2_ = class639.method13579(string, Class133.aClass168Array1613,
					1190536090);
	if (((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10868)
	    i_2_ += Class443.aClass168_6165.method3631() + 4;
	return i_2_;
    }
}
