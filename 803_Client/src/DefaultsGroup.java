/* Class512 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config.defaults;
public class DefaultsGroup {
    public static DefaultsGroup AUDIO;//aClass512_6690
    static DefaultsGroup aClass512_6691;
    static DefaultsGroup GRAPHICS;//aClass512_6692
    static DefaultsGroup ERROR;//aClass512_6693
    static DefaultsGroup MICROTRANSACTION;//aClass512_6694
    public static DefaultsGroup MAP;//aClass512_6695
    static DefaultsGroup aClass512_6696;
    static DefaultsGroup aClass512_6697;
    static DefaultsGroup SKILL;//aClass512_6698
    static DefaultsGroup aClass512_6699;
    public int js5GroupId;//anInt6700
    
    static {
    	MAP = new DefaultsGroup(1);
		aClass512_6691 = new DefaultsGroup(2);
		GRAPHICS = new DefaultsGroup(3);
		AUDIO = new DefaultsGroup(4);
		MICROTRANSACTION = new DefaultsGroup(5);
		aClass512_6699 = new DefaultsGroup(6);
		aClass512_6696 = new DefaultsGroup(7);
		aClass512_6697 = new DefaultsGroup(8);
		SKILL = new DefaultsGroup(9);
		ERROR = new DefaultsGroup(10);
    }
    
    DefaultsGroup(int i) {
    	js5GroupId = -324810171 * i;
    }
    
    static final void method11558(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	HashTable.method7319(i_0_, (byte) 31);
    }
    
    static void executeClientScript/*method11559*/(ClientScript script, int maxSteps, ClientScriptData scriptData, int i_1_) {
    	scriptData.intStackPointer = 0;
    	scriptData.objectStackPointer = 0;
    	scriptData.step = -1924545709;
    	scriptData.script = script;
    	scriptData.actions = scriptData.script.actions;
    	scriptData.integerConstants = scriptData.script.integerConstants;
		Cs2Action class243 = null;
		scriptData.anInt6227 = 0;
		scriptData.aMap6241.clear();
		scriptData.aMap6241.put(VarDomainType.PLAYER,
						   Class1.aClass19_11.varPlayerDomain);
		scriptData.aMap6241.put(VarDomainType.CLIENT,
						   Class473.varClientDomain);
		scriptData.aMap6241.put(VarDomainType.CLAN,
						   Class520.varClanDomain);
		if (null != scriptData.clanSettings) {
			scriptData.aMap6241.put(VarDomainType.CLAN_SETTING,
					Class499.method11333(scriptData.clanSettings, (byte) -1));
		}
		if (scriptData.varEntity instanceof NPC) {
			scriptData.aMap6241.put(VarDomainType.NPC, 
					scriptData.varEntity.anInterface12_11440);
		}
		if (scriptData.varEntity instanceof Player) {
			scriptData.aMap6238.put(VarDomainType.PLAYER,
					scriptData.varEntity.anInterface12_11440);
		}
		try {
		    try {
				Class450.clientScriptStepCount = 0;
				for (;;) {
				    Class450.clientScriptStepCount += 928053883;
				    if (199873715 * Class450.clientScriptStepCount > maxSteps) {
				    	throw new RuntimeException("");
				    }
				    class243 = scriptData.actions[(scriptData.step += 1924545709) * 1938982693];
				    if (Class450.aBool6202 && (Class450.aString6204 == null || (null != (scriptData.script.aString10815)
				    		&& scriptData.script.aString10815.indexOf(Class450.aString6204) != -1))) {
				    	System.out.println(new StringBuilder().append(scriptData.script.aString10815)
							       .append(": ").append(class243).toString());
				    }
				    if (1 == scriptData.integerConstants[scriptData.step * 1938982693]) {
				    	scriptData.aBool6246 = true;
				    } else {
				    	scriptData.aBool6246 = false;
				    }
				    if (class243 == Cs2Action.aClass243_3074
				    		&& 0 == (-1018886827 * scriptData.anInt6227)) {
						Class162.method3516(-1541809656);
						break;
				    }
				    Class260.runClientScript(class243, scriptData, 743135541);
				}
		    } catch (Exception exception) {
		    	StringBuilder stringbuilder = new StringBuilder(30);
				stringbuilder.append("").append(4356572401218184725L * (scriptData.script
							     .hashCode))
				    .append(" ");
				for (int i_2_ = scriptData.anInt6227 * -1018886827 - 1; i_2_ >= 0; i_2_--)
				    stringbuilder.append("").append(4356572401218184725L
					 * (((Class466) scriptData.aClass466Array6228[i_2_])
					    .aClass241_Sub39_Sub1_6315.hashCode))
					.append(" ");
				stringbuilder.append("").append(Integer.valueOf(-1719976835 * class243.actionID));
		    	System.err.println("Error in client script: "+exception.getMessage()+", data="+stringbuilder.toString());
		    	
				/*StringBuilder stringbuilder = new StringBuilder(30);
				stringbuilder.append("").append(4356572401218184725L * (((ClientScriptData) class454)
							     .aClass241_Sub39_Sub1_6245
							     .aLong2774))
				    .append(" ");
				for (int i_2_ = ((ClientScriptData) class454).anInt6227 * -1018886827 - 1; i_2_ >= 0; i_2_--)
				    stringbuilder.append("").append(4356572401218184725L
					 * (((Class466) ((ClientScriptData) class454).aClass466Array6228[i_2_])
					    .aClass241_Sub39_Sub1_6315.aLong2774))
					.append(" ");
				stringbuilder.append("").append(Integer.valueOf(-1719976835 * class243.anInt3821));
				Class179.method3770(stringbuilder.toString(), exception, -1977716657);
				Class162.method3516(-1512328174);*/
		    }
		} catch (Throwable object) {
		    Class162.method3516(-1706971006);
		    throw object;
		}
    }
    
    static final void method11560(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class482.method11020(class58, class35, class454, (byte) 9);
    }
    
    static final void method11561(ClientScriptData class454, short i) {
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = Class499.method11335(-1357466360).toString();
    }
}
