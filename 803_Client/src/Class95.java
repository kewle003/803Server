/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95
{
    public int anInt1328;
    public int anInt1329;
    int anInt1330;
    public int anInt1331;
    static int anInt1332;
    
    Class95 method2099(int i) {
	return new Class95(anInt1331 * 264591637, i,
			   ((Class95) this).anInt1330 * -1464816515,
			   anInt1329 * -933656211);
    }
    
    Class95 method2100(int i, int i_0_) {
	return new Class95(anInt1331 * 264591637, i,
			   ((Class95) this).anInt1330 * -1464816515,
			   anInt1329 * -933656211);
    }
    
    Class95 method2101(int i) {
	return new Class95(anInt1331 * 264591637, i,
			   ((Class95) this).anInt1330 * -1464816515,
			   anInt1329 * -933656211);
    }
    
    Class95(int i, int i_1_, int i_2_, int i_3_) {
	anInt1331 = i * 907554365;
	anInt1328 = i_1_ * 2028904097;
	((Class95) this).anInt1330 = i_2_ * 45558997;
	anInt1329 = -311760795 * i_3_;
    }
    
    public static Interface54 method2102(RSByteBuffer class241_sub3, int i) {
	Class525 class525
	    = Class558.method12327(class241_sub3.readUnsignedByte((byte) 60),
				   (byte) 76);
	if (class525 == Class525.aClass525_6826)
	    return IncommingOpcode.method6124(class241_sub3, 1196236864);
	if (class525 == Class525.aClass525_6824)
	    return JSFunction.method6226(class241_sub3, 989160764);
	if (class525 == Class525.aClass525_6825)
	    return CS2MapList.method7513(class241_sub3, 1267307147);
	return null;
    }
    
    static final void method2103(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class561.method12368(class58, class35, class454, -25714421);
    }
    
    static final void method2104(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	int i_6_ = (Class72.aClass625_1100.list(i_4_, -1716860842)
			.method17196(i_5_, 16711935).anInt6298
		    * 2119010589);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_6_;
    }
    
    public static String getMessageFromBytes/*method2105*/(byte[] messageData, int messageDataOffset, 
    		int messageDataLength, int i_8_) {
		char[] chars = new char[messageDataLength];
		int outputLen = 0;
		for (int index = 0; index < messageDataLength; index++) {
		    int character = messageData[index + messageDataOffset] & 0xff;
		    if (character != 0) {
				if (character >= 128 && character < 160) {
				    int newChar = Class462.shiftCharacters[character - 128];
				    if (0 == newChar) {
				    	newChar = 63;
				    }
				    character = newChar;
				}
				chars[outputLen++] = (char) character;
		    }
		}
		return new String(chars, 0, outputLen);
    }
    
    static void method2106(int i, byte i_13_) {
	/* empty */
    }
    
    public static void method2107(int i, int i_14_) {
		Class241_Sub39_Sub13 class241_sub39_sub13
		    = NPC.method18030(3, (long) i);
		class241_sub39_sub13.method17278((byte) -63);
    }
    
    static void setVarcBit/*method2108*/(int varBitKey, int bitValue, int i_16_) {
		VarBitType varBitType = Class541.aClass199_Sub1_7008.list(varBitKey, (byte) -81);
		Class241_Sub39_Sub13 class241_sub39_sub13 = NPC.method18030(1, (long) (varBitType.baseVar.id * 414229387));
		try {
		    if (Class241_Sub39_Sub13.aBool10964) {
				((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941
					= Class473.varClientDomain.getVarValueInt(varBitType.baseVar, -729500694) * -1741260507;
			}
		    ((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941
		    	= varBitType.setVarbitValue(2092628653 * (((Class241_Sub39_Sub13)
		    			class241_sub39_sub13).anInt10941), bitValue, (byte) 73) * -1741260507;
		    class241_sub39_sub13.method17279((byte) 0);
		} catch (VarBitOverflowException exception_sub1) {
		    VarType.method3770(new StringBuilder().append("").append(varBitKey).toString(), exception_sub1, -8827190);
		}
    }
    
    static final void setItemSwapEvent/*method2109*/(InterfaceComponent component, InterfaceDefinition class35,
				 ClientScriptData scriptData, byte i) {
		String params = (String) 
				scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331];
		if (Class8.extractVarWatchKeys(params, scriptData, (byte) -22) != null) {
			params = params.substring(0, params.length() - 1);
		}
		component.onItemSwapScript = Class299.extractCs2Params(params, scriptData, -1618235342);
		component.hasClientScript = true;
    }
}
