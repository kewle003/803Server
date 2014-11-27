/* Class491 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class491
{
    public Interface54 anInterface54_6514;
    
    void method11240(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 65);
	    if (i == 0)
		break;
	    if (1 == i)
		anInterface54_6514
		    = Class95.method2102(class241_sub3, 159625258);
	}
    }
    
    public Class491(JS5 class210) {
	byte[] is = class210.method4194((DefaultsGroup.aClass512_6697.js5GroupId
					 * 692631693),
					1114092417);
	method11242(new RSByteBuffer(is), 1587048899);
    }
    
    void method11241(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 118);
	    if (i == 0)
		break;
	    if (1 == i)
		anInterface54_6514
		    = Class95.method2102(class241_sub3, 924465359);
	}
    }
    
    void method11242(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_0_ = class241_sub3.readUnsignedByte((byte) -33);
	    if (i_0_ == 0)
		break;
	    if (1 == i_0_)
		anInterface54_6514
		    = Class95.method2102(class241_sub3, 2095390271);
	}
    }
    
    static final void method11243(ClientScriptData class454, byte i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -119);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
	Class43.method1074(class58, class35, class454, 1398843445);
    }
    
    static final void method11244(ClientScriptData class454, int i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		  .method7880(i_2_, 996762312);
    }
    
    static final void method11245(ClientScriptData class454, int i) {
	HashTable.method7319(-1310643441 * Class573_Sub1.anInt8770, (byte) -79);
    }
    
    static final void method11246(ClientScriptData class454, byte i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_3_, (byte) -28);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_3_ >> 16];
	Class207.method4122(class58, class35, class454, -1539942107);
    }
    
    static final void method11247(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859,
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      == 1) ? 1 : 0,
	     (byte) 2);
	Class167.method3600((short) 2157);
	client.aBool8297 = false;
    }
}
