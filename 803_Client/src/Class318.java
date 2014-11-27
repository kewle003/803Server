/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class318
{
    int anInt4866;
    Object anObject4867;
    
    Class318(Object object, int i) {
	((Class318) this).anObject4867 = object;
	((Class318) this).anInt4866 = i * -32922635;
    }
    
    public static void appendChatboxMessage/*method5915*/(int opcode, int i_0_, String nameToDisplay,
				  String replyToName, String string_2_,
				  String message, int i_4_) {
    	Class337.showChatMessage(opcode, i_0_, nameToDisplay, replyToName, string_2_, message, null, -1, (byte) 1);
    }
    
    static final void method5916(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class114.method2796(class58, class35, class454, 65280);
    }
    
    static final void method5917(ClientScriptData class454, int i) {
	int i_5_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_5_, (byte) -77);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_5_ >> 16];
	Class222.method4486(class58, class35, class454, -1999772580);
    }
    
    static final void method5918(InterfaceComponent[] class58s, int i, int i_6_) {
	for (int i_7_ = 0; i_7_ < class58s.length; i_7_++) {
	    InterfaceComponent class58 = class58s[i_7_];
	    if (null != class58) {
		if (0 == -1579470857 * class58.componentType) {
		    if (null != class58.aClass58Array1000)
			method5918(class58.aClass58Array1000, i, -1543776272);
		    Class241_Sub11 class241_sub11
			= ((Class241_Sub11)
			   (client.aClass407_8467.get
			    ((long) (445907013 * class58.componentHash))));
		    if (class241_sub11 != null)
			Class298.method5735((-443552671
					     * class241_sub11.interfaceID),
					    i, (byte) -27);
		}
		if (0 == i && class58.anObjectArray980 != null) {
		    ClientScriptCaller class241_sub14 = new ClientScriptCaller();
		    class241_sub14.component = class58;
		    class241_sub14.paramaters
			= class58.anObjectArray980;
		    Class42.method1067(class241_sub14, 1861088122);
		}
		if (1 == i && null != class58.anObjectArray981) {
		    if (-389932081 * class58.slot1 >= 0) {
			InterfaceComponent class58_8_
			    = Js5ConfigGroup.getInterfaceComponent(class58.componentHash * 445907013,
						 (byte) -58);
			if (null == class58_8_
			    || class58_8_.aClass58Array836 == null
			    || (class58.slot1 * -389932081
				>= class58_8_.aClass58Array836.length)
			    || class58 != (class58_8_.aClass58Array836
					   [-389932081 * class58.slot1]))
			    continue;
		    }
		    ClientScriptCaller class241_sub14 = new ClientScriptCaller();
		    class241_sub14.component = class58;
		    class241_sub14.paramaters
			= class58.anObjectArray981;
		    Class42.method1067(class241_sub14, -94303662);
		}
	    }
	}
    }
    
    static final void method5919(ClientScriptData class454, byte i) {
	Class257.method5064((byte) 86);
    }
}
