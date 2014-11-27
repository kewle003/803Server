/* Class241_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class CsDeltaNode extends Node
{
    abstract void method14865(RSByteBuffer class241_sub3);
    
    abstract void decode(RSByteBuffer buffer, byte i);//method14866
    
    abstract void applyToClanSettings(ClanSettings settings, byte i);//method14867
    
    CsDeltaNode() {
	/* empty */
    }
    
    abstract void method14868(ClanSettings class374);
    
    abstract void method14869(RSByteBuffer class241_sub3);
    
    abstract void method14870(ClanSettings class374);
    
    static void method14871(int i) {
	int i_0_ = -1;
	if (null != Class573_Sub1.aClass241_Sub39_Sub12_7405)
	    i_0_ = (Class573_Sub1.aClass241_Sub39_Sub12_7405.anInt10925
		    * 1100684019);
	Class493.method11268(-1196667101);
	for (int i_1_ = 0; i_1_ < 3; i_1_++) {
	    for (int i_2_ = 0; i_2_ < 5; i_2_++) {
		Class573_Sub1.aClass96ArrayArray8795[i_1_][i_2_] = null;
		Class573_Sub1.aClass639ArrayArray8784[i_1_][i_2_] = null;
	    }
	}
	Class573_Sub1.aClass241_Sub39_Sub12_7405 = null;
	if (i_0_ != -1)
	    Class440.method7832(i_0_, -1, -1, false, (byte) 23);
    }
    
    static final void method14872(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
		String params = (String) (((ClientScriptData) class454).objectStack
					  [(((ClientScriptData) class454).objectStackPointer
					    -= -1650705371) * -290357331]);
		if (Class8.extractVarWatchKeys(params, class454, (byte) -63) != null) {
			params = params.substring(0, params.length() - 1);
		}
		class58.onMouseHoverScript = Class299.extractCs2Params(params, class454, -1618058222);
		class58.hasClientScript = true;
    }
    
    public static void method14873(VarType class179, int i) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC
		  .method18030(2, (long) (414229387 * class179.id));
	class241_sub39_sub13.method17278((byte) -93);
    }
}
