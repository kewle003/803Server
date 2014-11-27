/* Class499 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class499
{
    public Interface54 anInterface54_6554;
    public Interface54 anInterface54_6555;
    public Interface54 anInterface54_6556;
    public Class533 aClass533_6557;
    public Class533 aClass533_6558;
    public Class533 aClass533_6559;
    public int anInt6560;
    public int anInt6561;
    public boolean aBool6562;
    public Interface54 anInterface54_6563;
    
    void method11329(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -50);
	    if (i == 0)
		break;
	    if (i == 1)
		anInterface54_6563
		    = Class95.method2102(class241_sub3, 1236675457);
	    else if (i == 2)
		anInterface54_6555
		    = Class95.method2102(class241_sub3, -596429948);
	    else if (i == 3)
		anInterface54_6556
		    = Class95.method2102(class241_sub3, 1353423752);
	    else if (4 == i)
		anInterface54_6554
		    = Class95.method2102(class241_sub3, -385195535);
	    else if (5 == i)
		aClass533_6558 = CS2MapList.method7513(class241_sub3, 619782727);
	    else if (i == 6)
		aClass533_6559
		    = CS2MapList.method7513(class241_sub3, -1651882401);
	    else if (7 == i)
		aClass533_6557
		    = CS2MapList.method7513(class241_sub3, -2085448175);
	    else if (i == 8)
		Class95.method2102(class241_sub3, -433157697);
	    else if (9 == i)
		Class95.method2102(class241_sub3, -2102849540);
	    else if (10 == i)
		Class95.method2102(class241_sub3, -1939025353);
	    else if (i == 11)
		aBool6562 = true;
	    else if (i == 12)
		anInt6561 = class241_sub3.readInt((byte) 59) * -1340812805;
	    else if (i == 13)
		anInt6560 = class241_sub3.readInt((byte) 66) * -1033091347;
	}
    }
    
    void method11330(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -13);
	    if (i == 0)
		break;
	    if (i == 1)
		anInterface54_6563
		    = Class95.method2102(class241_sub3, -1388012230);
	    else if (i == 2)
		anInterface54_6555
		    = Class95.method2102(class241_sub3, 1089297789);
	    else if (i == 3)
		anInterface54_6556
		    = Class95.method2102(class241_sub3, -182450406);
	    else if (4 == i)
		anInterface54_6554
		    = Class95.method2102(class241_sub3, 1379641794);
	    else if (5 == i)
		aClass533_6558 = CS2MapList.method7513(class241_sub3, 833237536);
	    else if (i == 6)
		aClass533_6559
		    = CS2MapList.method7513(class241_sub3, -487006457);
	    else if (7 == i)
		aClass533_6557 = CS2MapList.method7513(class241_sub3, 513180505);
	    else if (i == 8)
		Class95.method2102(class241_sub3, -1461366408);
	    else if (9 == i)
		Class95.method2102(class241_sub3, 305124342);
	    else if (10 == i)
		Class95.method2102(class241_sub3, -333131204);
	    else if (i == 11)
		aBool6562 = true;
	    else if (i == 12)
		anInt6561 = class241_sub3.readInt((byte) 71) * -1340812805;
	    else if (i == 13)
		anInt6560
		    = class241_sub3.readInt((byte) 123) * -1033091347;
	}
    }
    
    public Class499(JS5 class210) {
		byte[] is = class210.method4194((692631693 * DefaultsGroup.aClass512_6696.js5GroupId),
						-1790672375);
		decode(new RSByteBuffer(is), 1930815871);
    }
    
    void decode/*method11331*/(RSByteBuffer class241_sub3, int i) {
		for (;;) {
		    int i_0_ = class241_sub3.readUnsignedByte((byte) -4);
		    if (i_0_ == 0)
			break;
		    if (i_0_ == 1)
			anInterface54_6563
			    = Class95.method2102(class241_sub3, -2113260322);
		    else if (i_0_ == 2)
			anInterface54_6555
			    = Class95.method2102(class241_sub3, 1156953605);
		    else if (i_0_ == 3)
			anInterface54_6556
			    = Class95.method2102(class241_sub3, -1658038482);
		    else if (4 == i_0_)
			anInterface54_6554
			    = Class95.method2102(class241_sub3, -1947552389);
		    else if (5 == i_0_)
			aClass533_6558 = CS2MapList.method7513(class241_sub3, 233577608);
		    else if (i_0_ == 6)
			aClass533_6559
			    = CS2MapList.method7513(class241_sub3, -966692802);
		    else if (7 == i_0_)
			aClass533_6557
			    = CS2MapList.method7513(class241_sub3, -1529557513);
		    else if (i_0_ == 8)
			Class95.method2102(class241_sub3, 1147747819);
		    else if (9 == i_0_)
			Class95.method2102(class241_sub3, 1456826581);
		    else if (10 == i_0_)
			Class95.method2102(class241_sub3, 1116580267);
		    else if (i_0_ == 11)
			aBool6562 = true;
		    else if (i_0_ == 12)
			anInt6561 = class241_sub3.readInt((byte) 19) * -1340812805;
		    else if (i_0_ == 13)
			anInt6560
			    = class241_sub3.readInt((byte) 127) * -1033091347;
		}
    }
    
    static final void method11332(ClientScriptData class454, byte i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -7);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
	Class317.setComponentSprite(class58, class35, class454, (byte) 21);
    }
    
    static VarDomain method11333(ClanSettings settings, byte i) {
    	return new Class495(settings);
    }
    
    public static void method11334(int i, int i_2_, float f,
				   Interface29 interface29, byte i_3_) {
	if (Class483.aClass393_6461 != null)
	    Class483.aClass393_6461.method7032(1350005775)
		.method5857(i, i_2_, f, interface29, -730496956);
    }
    
    public static File method11335(int i) {
	return Class116.cacheDirectory;
    }
    
    static void setComponentColour/*method11336*/(int compHash, int colour, int i_5_) {
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(6, (long) compHash);
		class241_sub39_sub13.method17279((byte) 0);
		((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941
		    = -1741260507 * colour;
    }
}
