/* Class349 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class349 implements Interface13
{
    static boolean aBool5382;
    static String aString5383;
    public static JS5 DEFAULTS_ARCHIVE;//aClass210_5384
    
    public VarBitType method93(int key, int i_0_) {
    	return Class541.aClass199_Sub1_7008.list(key, (byte) -102);
    }
    
    public VarType method94(VarDomainType class218, int i) {
    	return ((VarTypeList) Class611.varTypes.get(class218)).list(i, -1981474021);
    }
    
    public VarType method96(VarDomainType type, int key, byte i_1_) {
    	return ((VarTypeList) Class611.varTypes.get(type)).list(key, -1937041796);
    }
    
    public VarBitType method95(int i) {
    	return Class541.aClass199_Sub1_7008.list(i, (byte) -105);
    }
    
    public VarBitType method92(int i) {
    	return Class541.aClass199_Sub1_7008.list(i, (byte) -21);
    }
    
    public static Class564 method6233(JS5 worldMapData, String identifier, boolean isP2pWorld, byte i) {
		int fileID = worldMapData.identifierToIndex(identifier, -187631888);
		if (-1 == fileID) {
		    return new Class564(0);
		}
		int[] indicies = worldMapData.getChildIndicies(fileID, (byte) 79);
		Class564 class564 = new Class564(indicies.length);
		int i_3_ = 0;
		int i_4_ = 0;
		while (i_3_ < 81284827 * class564.anInt7308) {
		    RSByteBuffer buffer = new RSByteBuffer(
		    		worldMapData.getfile(fileID, indicies[i_4_++], 913947734));
		    int i_5_ = buffer.readInt((byte) 43);
		    int i_6_ = buffer.readUnsignedShort(1162222719);
		    int p2pSection = buffer.readUnsignedByte((byte) -38);
		    if (isP2pWorld || p2pSection != 1) {
				class564.anIntArray7306[i_3_] = i_5_;
				class564.anIntArray7307[i_3_] = i_6_;
				i_3_++;
		    } else {
		    	class564.anInt7308 -= -1563361965;
		    }
		}
		return class564;
    }
    
    public static void method6234(int i) {
	synchronized (Class484.aQueue6468) {
	    for (;;) {
		Class241_Sub24_Sub1 class241_sub24_sub1
		    = (Class241_Sub24_Sub1) Class484.aQueue6468.poll();
		if (null == class241_sub24_sub1)
		    break;
		class241_sub24_sub1.method15070(-1911511446);
	    }
	}
    }
    
    static final void method6235(ClientScriptData class454, byte i) {
	int i_8_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (1629309841 * client.anInt8466 != -1) {
	    if (i_8_ == 0) {
		((ClientScriptData) class454).integerStack
		    [((((ClientScriptData) class454).intStackPointer += 1736754263)
		      * 1482319719) - 1]
		    = client.anInt8466 * 1629309841;
		return;
	    }
	    i_8_--;
	}
	Class241_Sub11 class241_sub11
	    = (Class241_Sub11) client.aClass407_8467.method7294(2090894173);
	while (i_8_-- > 0)
	    class241_sub11
		= (Class241_Sub11) client.aClass407_8467.method7295(752175127);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -443552671 * class241_sub11.interfaceID;
    }
    
    static final void method6236(ClientScriptData class454, byte i) {
	int i_9_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub14_8876
		  .method7880(i_9_, 996762312);
    }
}
