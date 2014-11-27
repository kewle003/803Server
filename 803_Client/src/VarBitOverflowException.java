/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config.vartype.bit;
public final class VarBitOverflowException extends Exception
{
	private static final long serialVersionUID = -1546963148649393238L;

	VarBitOverflowException(String string, int i, int i_0_) {
    	super("Varbit oveflow on varbit \'" + string + "\' Value " + i + " is outside the range 0-" + i_0_);
    }
    
    static void method16940(InterfaceComponent component, int i, int i_1_, int i_2_) {
		if (client.aBool8544) {
		    ParamType paramType = (NPCDefinitionLoader.anInt5897 * 820722975 != -1
		    		? Class621.paramTypeList.list((820722975 * NPCDefinitionLoader.anInt5897), 2084514294)
		    		: null);
		    if (client.method13624(component).method15043((byte) 6)
		    		&& 0 != (-1622803377 * Class613.anInt7804 & 0x20)
		    		&& (null == paramType || (component.method1519(NPCDefinitionLoader.anInt5897 * 820722975,
		    				paramType.defaultint * 2015998927, 623518843) != paramType.defaultint * 2015998927)))
			Class534.method11882(client.aString8464,
					     new StringBuilder().append
						 (client.aString8465).append
						 (" ").append
						 (Class6.aString33).append
						 (" ").append
						 (component.aString933).toString(),
					     1184895817 * Class213.anInt2512, 58,
					     component.slot2 * 877329925, 0L,
					     -389932081 * component.slot1,
					     component.componentHash * 445907013, true, false,
					     (long) ((-389932081 * component.slot1
						      << 32)
						     | 445907013 * component.componentHash),
					     false, -1236921043);
		}
		for (int menuIdx = 9; menuIdx >= 5; menuIdx--) {
		    String menuOption = Class409.getContextMenuOption(component, menuIdx, (byte) 27);
		    if (menuOption != null) {
		    	Class534.method11882(menuOption, component.aString933,
					     Class198.method4034(component, menuIdx, 1819355975),
					     1007, 877329925 * component.slot2,
					     (long) (menuIdx + 1),
					     -389932081 * component.slot1,
					     445907013 * component.componentHash, true, false,
					     (long) ((component.slot1 * -389932081 << 32)
						     | 445907013 * component.componentHash),
					     false, -1236921043);
		    }
		}
		String string = Class518.method11662(component, (byte) -51);
		if (string != null)
		    Class534.method11882(string, component.aString933,
		    		component.anInt937 * -828598245, 25,
		    		component.slot2 * 877329925, 0L,
					 -389932081 * component.slot1,
					 445907013 * component.componentHash, true, false,
					 (long) (component.slot1 * -389932081 << 32
						 | component.componentHash * 445907013),
					 false, -1236921043);
		for (int menuIdx = 4; menuIdx >= 0; menuIdx--) {
		    String menuOption = Class409.getContextMenuOption(component, menuIdx, (byte) 95);
		    if (null != menuOption)
		    	Class534.method11882(menuOption, component.aString933,
					     Class198.method4034(component, menuIdx, 1819355975),
					     57, 877329925 * component.slot2,
					     (long) (menuIdx + 1),
					     component.slot1 * -389932081,
					     component.componentHash * 445907013, true, false,
					     (long) ((-389932081 * component.slot1 << 32)
						     | component.componentHash * 445907013),
					     false, -1236921043);
		}
		if (client.method13624(component).method15051(-1613373035)) {
		    if (component.aString935 != null) {
		    	Class534.method11882(component.aString935, "", -1, 30,
					component.slot2 * 877329925, 0L,
					component.slot1 * -389932081,
					445907013 * component.componentHash, true, false,
					(long) ((component.slot1 * -389932081 << 32)
						     | component.componentHash * 445907013),
					     false, -1236921043);
		    } else {
		    	Class534.method11882(ClientMessage.CONTINU.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 32607),
		    			"", -1, 30, component.slot2 * 877329925, 0L,
		    			component.slot1 * -389932081,
		    			component.componentHash * 445907013, true, false,
		    			(long) (-389932081 * component.slot1 << 32
		    					| component.componentHash * 445907013),
				     	false, -1236921043);
		    }
		}
    }
}
