/* Class564 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class564
{
    public int[] anIntArray7306;
    public int[] anIntArray7307;
    public int anInt7308;
    
    public static Class564 method12412(JS5 class210, String string,
				       boolean bool) {
	int i = class210.identifierToIndex(string, -187631888);
	if (-1 == i)
	    return new Class564(0);
	int[] is = class210.getChildIndicies(i, (byte) 26);
	Class564 class564 = new Class564(is.length);
	int i_0_ = 0;
	int i_1_ = 0;
	while (i_0_ < 81284827 * class564.anInt7308) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(class210.getfile(i, is[i_1_++],
							-620002619));
	    int i_2_ = class241_sub3.readInt((byte) 34);
	    int i_3_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_4_ = class241_sub3.readUnsignedByte((byte) -80);
	    if (bool || i_4_ != 1) {
		class564.anIntArray7306[i_0_] = i_2_;
		class564.anIntArray7307[i_0_] = i_3_;
		i_0_++;
	    } else
		class564.anInt7308 -= -1563361965;
	}
	return class564;
    }
    
    public Class564(int i) {
		anInt7308 = i * -1563361965;
		anIntArray7306 = new int[81284827 * anInt7308];
		anIntArray7307 = new int[81284827 * anInt7308];
    }
    
    public static Class564 method12413(JS5 class210, String string,
				       boolean bool) {
	int i = class210.identifierToIndex(string, -187631888);
	if (-1 == i)
	    return new Class564(0);
	int[] is = class210.getChildIndicies(i, (byte) -1);
	Class564 class564 = new Class564(is.length);
	int i_5_ = 0;
	int i_6_ = 0;
	while (i_5_ < 81284827 * class564.anInt7308) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(class210.getfile(i, is[i_6_++],
							-175666462));
	    int i_7_ = class241_sub3.readInt((byte) 83);
	    int i_8_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_9_ = class241_sub3.readUnsignedByte((byte) -12);
	    if (bool || i_9_ != 1) {
		class564.anIntArray7306[i_5_] = i_7_;
		class564.anIntArray7307[i_5_] = i_8_;
		i_5_++;
	    } else
		class564.anInt7308 -= -1563361965;
	}
	return class564;
    }
    
    public static Class564 method12414(JS5 class210, String string,
				       boolean bool) {
	int i = class210.identifierToIndex(string, -187631888);
	if (-1 == i)
	    return new Class564(0);
	int[] is = class210.getChildIndicies(i, (byte) 39);
	Class564 class564 = new Class564(is.length);
	int i_10_ = 0;
	int i_11_ = 0;
	while (i_10_ < 81284827 * class564.anInt7308) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(class210.getfile(i, is[i_11_++],
							964488713));
	    int i_12_ = class241_sub3.readInt((byte) 87);
	    int i_13_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_14_ = class241_sub3.readUnsignedByte((byte) 20);
	    if (bool || i_14_ != 1) {
		class564.anIntArray7306[i_10_] = i_12_;
		class564.anIntArray7307[i_10_] = i_13_;
		i_10_++;
	    } else
		class564.anInt7308 -= -1563361965;
	}
	return class564;
    }
    
    static final void storeClanMemberRank/*method12415*/(ClientScriptData scriptData, byte i) {
    	int index = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
    			= scriptData.clanSettings.clanMemberRanks[index];
    }
    
    static final void method12416(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	Class135_Sub1.removeIgnore(string, (byte) -5);
    }
    
    static final void setComponentText/*method12417*/(InterfaceComponent component, InterfaceDefinition iFace,
				  ClientScriptData scriptData, int i) {
		String string = (String) 
				scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331];
		if (!string.equals(component.text)) {
			component.text = string;
		    WorldType.refreshComponent(component, -1783414464);
		}
		if (-1 == component.slot1 * -389932081 && !iFace.aBool374) {
		    Class95.method2107(component.componentHash * 445907013, 1017241179);
		}
    }
    
    static int method12418(byte i) {
    	return (Class44.anInt612 += 2009106375) * 1909524983 - 1;
    }
    
    static final void method12419(ClientScriptData class454, int i) {
	if (null != client.aString8287)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= client.aString8287;
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
    }
}
