/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config.vartype.constants;
public class VarDomainType implements Interface47 {
    public static VarDomainType CLAN_SETTING;//aClass218_2542
    public static VarDomainType NPC;//aClass218_2543
    static VarDomainType WORLD;//aClass218_2544
    public static VarDomainType PLAYER;//aClass218_2545
    static VarDomainType REGION;//aClass218_2546
    static VarDomainType OBJECT;//aClass218_2547
    public static VarDomainType CLAN;//aClass218_2548
    int anInt2549;
    static VarDomainType aClass218_2550;//aClass218_2550
    static VarDomainType aClass218_2551;//aClass218_2551
    Js5ConfigGroup js5GroupID;//aClass37_2552
    public static VarDomainType CLIENT;//aClass218_2553
    
    public static VarDomainType[] method4361(int i) {
    	return new VarDomainType[] { aClass218_2550, OBJECT, CLIENT,
				CLAN, CLAN_SETTING, NPC,
				WORLD, REGION, aClass218_2551, PLAYER };
    }
    
    VarDomainType(Js5ConfigGroup class37, int i, boolean bool, boolean bool_0_) {
		js5GroupID = class37;
		anInt2549 = i * 294389645;
    }
    
    public Js5ConfigGroup getJs5GroupID/*method4362*/(int i) {
    	return js5GroupID;
    }
    
    public int getId(byte i) {
		return anInt2549 * 261919557;
    }
    
    public Object method4363(VarType class179) {
	if (class179.aBool2130)
	    return method4364(class179, (byte) -30);
	return class179.dataType.getDefaultValue((byte) 125);
    }
    
    Object method4364(VarType class179, byte i) {
    	return class179.dataType.getDefaultValue((byte) 95);
    }
    
    public int method11() {
	return anInt2549 * 261919557;
    }
    
    public int method9() {
	return anInt2549 * 261919557;
    }
    
    public int method10() {
	return anInt2549 * 261919557;
    }
    
    Object method4365(VarType class179) {
	return class179.dataType.getDefaultValue((byte) 83);
    }
    
    public int method147() {
	return anInt2549 * 261919557;
    }
    
    public Object getDefaultValue/*method4366*/(VarType class179, byte i) {
		if (class179.aBool2130) {
		    return method4364(class179, (byte) -69);
		}
		return class179.dataType.getDefaultValue((byte) 59);
    }
    
    public static VarDomainType[] method4367() {
	return new VarDomainType[] { aClass218_2550, OBJECT, CLIENT,
				CLAN, CLAN_SETTING, NPC,
				WORLD, REGION, aClass218_2551,
				PLAYER };
    }
    
    Object method4368(VarType class179) {
	return class179.dataType.getDefaultValue((byte) 52);
    }
    
    public static VarDomainType[] method4369() {
	return new VarDomainType[] { aClass218_2550, OBJECT, CLIENT,
				CLAN, CLAN_SETTING, NPC,
				WORLD, REGION, aClass218_2551,
				PLAYER };
    }
    
    static {
    	PLAYER = new Class218_Sub2(Js5ConfigGroup.VAR_PLAYER, 0, true, true);
		NPC = new Class218_Sub4(Js5ConfigGroup.VAR_NPC, 1, false, true);
		CLIENT = new Class218_Sub5(Js5ConfigGroup.VAR_CLIENT, 2, true, true);
		WORLD = new Class218_Sub3(Js5ConfigGroup.VAR_WORLD, 3, false, false);
		REGION = new VarDomainType(Js5ConfigGroup.VAR_REGION, 4, false, false);
		OBJECT = new VarDomainType(Js5ConfigGroup.VAR_OBJECT, 5, true, false);
		CLAN = new VarDomainType(Js5ConfigGroup.VAR_CLAN, 6, true, true);
		CLAN_SETTING = new VarDomainType(Js5ConfigGroup.VAR_CLAN_SETTING, 7, true, false);
		aClass218_2550 = new Class218_Sub1(Js5ConfigGroup.aClass37_445, 8, false, false);
		aClass218_2551 = new VarDomainType(Js5ConfigGroup.aClass37_451, 10, false, false);
    }
    
    public Object method4370(VarType class179) {
	if (class179.aBool2130)
	    return method4364(class179, (byte) -123);
	return class179.dataType.getDefaultValue((byte) 80);
    }
    
    Object method4371(VarType class179) {
	return class179.dataType.getDefaultValue((byte) 50);
    }
    
    static final void method4372(ClientScriptData class454, short i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_2_, (byte) -14);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_2_ >> 16];
	Class323.method5960(class58, class35, class454, -1556698664);
    }
    
    public static void method4373(int i) {
	Class494.aClass109_6520.method2756(-1091236291);
    }
}
