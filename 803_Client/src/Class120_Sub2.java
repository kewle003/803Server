/* Class120_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub2 extends Class120
{
    int anInt9311;
    int anInt9312;
    int anInt9313;
    int anInt9314;
    int anInt9315;
    public static JS5 CONFIG_ARCHIVE;//aClass210_9316
    
    public void method2961() {
	Class336.method6081(-27449627 * ((Class120_Sub2) this).anInt9314,
			    ((Class120_Sub2) this).anInt9311 * -1146526363,
			    492932253 * ((Class120_Sub2) this).anInt9312, 100,
			    100, false, (byte) 8);
	Class530.method11842(((Class120_Sub2) this).anInt9315 * 711509389,
			     -526459567 * ((Class120_Sub2) this).anInt9313, 0,
			     1478196670);
	client.aBool8354 = true;
    }
    
    public void method2958(int i) {
	Class336.method6081(-27449627 * ((Class120_Sub2) this).anInt9314,
			    ((Class120_Sub2) this).anInt9311 * -1146526363,
			    492932253 * ((Class120_Sub2) this).anInt9312, 100,
			    100, false, (byte) 59);
	Class530.method11842(((Class120_Sub2) this).anInt9315 * 711509389,
			     -526459567 * ((Class120_Sub2) this).anInt9313, 0,
			     650611825);
	client.aBool8354 = true;
    }
    
    Class120_Sub2(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub2) this).anInt9314
	    = class241_sub3.readUnsignedShort(1162222719) * 2067343085;
	((Class120_Sub2) this).anInt9312
	    = class241_sub3.readUnsignedShort(1162222719) * -2027333195;
	((Class120_Sub2) this).anInt9311
	    = class241_sub3.readUnsignedShort(1162222719) * 261964909;
	((Class120_Sub2) this).anInt9315
	    = class241_sub3.readUnsignedShort(1162222719) * -1706883771;
	((Class120_Sub2) this).anInt9313
	    = class241_sub3.readUnsignedShort(1162222719) * 1486785457;
    }
    
    static int method15460(int i, int i_0_, int i_1_) {
	if (i == -2030829961 * Class527.aClass527_6920.anInt6931
	    || -2030829961 * Class527.aClass527_6916.anInt6931 == i)
	    return Class475_Sub1_Sub3_Sub2.anIntArray11351[i_0_ & 0x3];
	return Class475_Sub1_Sub3_Sub2.anIntArray11362[i_0_ & 0x3];
    }
    
    static final void method15461(ClientScriptData class454, int i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_2_, (byte) -40);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_2_ >> 16];
	Class70.setVarpChangeEvent(class58, class35, class454, 1594312009);
    }
    
    static boolean method15462(int i) {
	boolean bool;
	try {
	    Class606 class606 = new Class606();
	    byte[] is
		= class606.method13213(Class353.aByteArray5443, 1450013389);
	    Class63.method1619(is, (byte) 85);
	    bool = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool;
    }
    
    static void setComponentAnimation/*method15463*/(int compHash, int i_3_, byte i_4_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(5, (long) compHash);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941
		    = -1741260507 * i_3_;
    }
    
    static final void method15464(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class120_Sub19.method16845(i_5_, i_6_, false, false,
					 -1130885408);
    }
}
