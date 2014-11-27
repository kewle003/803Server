/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

//package com.jagex.game.runetek6.config.vartype.constants;
public class VarTransmitLevel implements Interface47 {
    public static VarTransmitLevel ON_SET_DIFFERENT;//aClass300_4604
    int serialID;//anInt4605
    public static VarTransmitLevel ON_SET_ALWAYS;//aClass300_4606
    public static VarTransmitLevel NEVER;//aClass300_4607
    
    public static VarTransmitLevel[] method5818() {
    	return new VarTransmitLevel[] { NEVER, ON_SET_DIFFERENT, ON_SET_ALWAYS };
    }
    
    public int getId(byte i) {
    	return serialID * 790943173;
    }
    
    VarTransmitLevel(int i) {
    	serialID = 1630789901 * i;
    }
    
    public int method9() {
    	return serialID * 790943173;
    }
    
    public int method10() {
    	return serialID * 790943173;
    }
    
    static {
    	NEVER = new VarTransmitLevel(0);
		ON_SET_DIFFERENT = new VarTransmitLevel(1);
		ON_SET_ALWAYS = new VarTransmitLevel(2);
    }
    
    public int method147/*method147*/() {
    	return serialID * 790943173;
    }
    
    public static VarTransmitLevel[] method5819() {
	return (new VarTransmitLevel[]
		{ NEVER, ON_SET_DIFFERENT, ON_SET_ALWAYS });
    }
    
    public int method11() {
	return serialID * 790943173;
    }
    
    public static VarTransmitLevel[] method5820() {
	return (new VarTransmitLevel[]
		{ NEVER, ON_SET_DIFFERENT, ON_SET_ALWAYS });
    }
    
    static final void method5821(ClientScriptData class454, byte i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -12);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.method13624(class58).method15040((short) -2534);
    }
    
    static final void method5822(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStackPointer -= 993556554;
	String string
	    = (String) (((ClientScriptData) class454).objectStack
			[-290357331 * ((ClientScriptData) class454).objectStackPointer]);
	String string_1_
	    = (String) (((ClientScriptData) class454).objectStack
			[1 + ((ClientScriptData) class454).objectStackPointer * -290357331]);
	Class238.method4881(string, string_1_, 2088696566);
    }
    
    static final void getSkillBaseLevel/*method5823*/(ClientScriptData scriptData, int i) {
		int skillID
		    = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = Class1.aClass19_11.getSkillBaseLevel(skillID, -2049143014);
    }
    
    static String method5824(long l, int i, boolean bool, int i_3_) {
	Calendar calendar;
	if (bool) {
	    Class103_Sub2.method15432(l);
	    calendar = Class638.aCalendar8253;
	} else {
	    Class447.method7916(l);
	    calendar = Class638.aCalendar8252;
	}
	int i_4_ = calendar.get(5);
	int i_5_ = calendar.get(2) + 1;
	int i_6_ = calendar.get(1);
	int i_7_ = calendar.get(11);
	int i_8_ = calendar.get(12);
	return new StringBuilder().append(Integer.toString(i_4_ / 10)).append
		   (i_4_ % 10).append
		   ("/").append
		   (i_5_ / 10).append
		   (i_5_ % 10).append
		   ("/").append
		   (i_6_ % 100 / 10).append
		   (i_6_ % 10).append
		   (" ").append
		   (i_7_ / 10).append
		   (i_7_ % 10).append
		   (":").append
		   (i_8_ / 10).append
		   (i_8_ % 10).toString();
    }
    
    static void method5825(Class423 class423, byte i) {
	Class9.aClass423_53 = class423;
    }
    
    static final void method5826(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_9_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	short i_10_
	    = (short) (((ClientScriptData) class454).integerStack
		       [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	short i_11_
	    = (short) (((ClientScriptData) class454).integerStack
		       [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	if (i_9_ >= 0 && i_9_ < 5) {
	    class58.method1577(i_9_, i_10_, i_11_, -160216585);
	    WorldType.refreshComponent(class58, -1216277549);
	    if (-389932081 * class58.slot1 == -1 && !class35.aBool374)
		Class219.method4378(445907013 * class58.componentHash, i_9_,
				    -1415425991);
	}
    }
    
    static final void method5827(ClientScriptData class454, int i) {
	Class308.closeInterface(true, (byte) -84);
    }
}
