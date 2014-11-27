/* Class541 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class541
{
    public Class475_Sub1_Sub1 aClass475_Sub1_Sub1_7004;
    public Class541 aClass541_7005;
    static int anInt7006 = 0;
    static Class541 aClass541_7007;
    public static VarBitTypeListClient aClass199_Sub1_7008;
    public static long aLong7009;
    
    void method11934() {
	if (anInt7006 * 375985321 < 500) {
	    aClass475_Sub1_Sub1_7004 = null;
	    aClass541_7005 = aClass541_7007;
	    aClass541_7007 = this;
	    anInt7006 += -1739665511;
	}
    }
    
    void method11935(int i) {
	if (anInt7006 * 375985321 < 500) {
	    aClass475_Sub1_Sub1_7004 = null;
	    aClass541_7005 = aClass541_7007;
	    aClass541_7007 = this;
	    anInt7006 += -1739665511;
	}
    }
    
    void method11936() {
	if (anInt7006 * 375985321 < 500) {
	    aClass475_Sub1_Sub1_7004 = null;
	    aClass541_7005 = aClass541_7007;
	    aClass541_7007 = this;
	    anInt7006 += -1739665511;
	}
    }
    
    static Class541 method11937(Class475_Sub1_Sub1 class475_sub1_sub1) {
	Class541 class541;
	if (aClass541_7007 == null)
	    class541 = new Class541();
	else {
	    class541 = aClass541_7007;
	    aClass541_7007 = aClass541_7007.aClass541_7005;
	    class541.aClass541_7005 = null;
	    anInt7006 -= -1739665511;
	}
	class541.aClass475_Sub1_Sub1_7004 = class475_sub1_sub1;
	return class541;
    }
    
    static Class541 method11938(Class475_Sub1_Sub1 class475_sub1_sub1) {
	Class541 class541;
	if (aClass541_7007 == null)
	    class541 = new Class541();
	else {
	    class541 = aClass541_7007;
	    aClass541_7007 = aClass541_7007.aClass541_7005;
	    class541.aClass541_7005 = null;
	    anInt7006 -= -1739665511;
	}
	class541.aClass475_Sub1_Sub1_7004 = class475_sub1_sub1;
	return class541;
    }
    
    static Class541 method11939(Class475_Sub1_Sub1 class475_sub1_sub1) {
	Class541 class541;
	if (aClass541_7007 == null)
	    class541 = new Class541();
	else {
	    class541 = aClass541_7007;
	    aClass541_7007 = aClass541_7007.aClass541_7005;
	    class541.aClass541_7005 = null;
	    anInt7006 -= -1739665511;
	}
	class541.aClass475_Sub1_Sub1_7004 = class475_sub1_sub1;
	return class541;
    }
    
    void method11940() {
	if (anInt7006 * 375985321 < 500) {
	    aClass475_Sub1_Sub1_7004 = null;
	    aClass541_7005 = aClass541_7007;
	    aClass541_7007 = this;
	    anInt7006 += -1739665511;
	}
    }
    
    Class541() {
	/* empty */
    }
    
    void method11941() {
	if (anInt7006 * 375985321 < 500) {
	    aClass475_Sub1_Sub1_7004 = null;
	    aClass541_7005 = aClass541_7007;
	    aClass541_7007 = this;
	    anInt7006 += -1739665511;
	}
    }
    
    static final void method11942(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -80) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray996
	    = Class299.extractCs2Params(string, class454, 861530535);
	class58.hasClientScript = true;
    }
    
    static final void method11943(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -78);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -1735856329 * class58.anInt860;
    }
    
    static final void method11944(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4077,
					 client.aClass190_8339.packetCipher,
					 16711935);
	class241_sub27.data
	    .writeByte(Class421.getEncodedStringLength(string, -2063338652), -976503200);
	class241_sub27.data.writeString(string,
							    -678330963);
	client.aClass190_8339.sendPacket(class241_sub27, -1603903795);
    }
}
