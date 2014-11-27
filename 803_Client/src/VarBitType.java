/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config.vartype.bit;
public class VarBitType implements Interface16 {
    String debugName;//aString4847
    public VarType baseVar;//aClass179_4848
    public int id;//anInt4849
    int startBit;//anInt4850
    int endBit;//anInt4851
    VarBitTypeListClient myList;//aClass199_Sub1_4852
    static int[] masklookup = new int[32];//anIntArray4853
    public static VarBasicTypeListClient VAR_CLAN_SETTINGS_LIST;//aClass199_Sub2_Sub2_4854
    
    public int setVarbitValue/*method5897*/(int original, int bitVal, byte i_1_) throws VarBitOverflowException {
		int mask = masklookup[(-1700373431 * endBit - startBit * -331342063)];
		if (bitVal < 0 || bitVal > mask) {
		    throw new VarBitOverflowException(debugName, bitVal, mask);
		}
		mask <<= -331342063 * startBit;
		return (original & (mask ^ 0xffffffff) | bitVal << -331342063 * startBit & mask);
    }
    
    void decode/*method5898*/(RSByteBuffer buffer, boolean bool, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) 22);
		    if (opcode == 0) {
		    	break;
		    }
		    decode(buffer, opcode, bool, 1454309808);
		}
    }
    
    VarBitType() {
	/* empty */
    }
    
    public int getVarbitValue/*method5899*/(int value, int i_4_) {
		int mask = masklookup[(-1700373431 * endBit - startBit * -331342063)];
		return value >> -331342063 * startBit & mask;
    }
    
    public int method5900(int i) {
	int i_6_
	    = masklookup[(-1700373431 * endBit
			      - startBit * -331342063)];
	return i >> -331342063 * startBit & i_6_;
    }
    
    public int method5901(int i, int i_7_) throws VarBitOverflowException {
	int i_8_
	    = masklookup[(-1700373431 * endBit
			      - startBit * -331342063)];
	if (i_7_ < 0 || i_7_ > i_8_)
	    throw new VarBitOverflowException(debugName, i_7_,
				     i_8_);
	i_8_ <<= -331342063 * startBit;
	return (i & (i_8_ ^ 0xffffffff)
		| i_7_ << -331342063 * startBit & i_8_);
    }
    
    void method5902(RSByteBuffer class241_sub3, boolean bool) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 17);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, bool, -1896967287);
	}
    }
    
    void method5903(RSByteBuffer class241_sub3, int i, boolean bool) {
	Class335 class335
	    = (Class335) Class531.method11848(Class520.method11693((byte) -4),
					      i, -479174985);
	switch (((Class335) class335).anInt5076 * -797536029) {
	case 1: {
	    int i_9_ = class241_sub3.readUnsignedByte((byte) -3);
	    VarDomainType class218
		= ((VarDomainType)
		   Class531.method11848(VarDomainType.method4361(-1030282803), i_9_,
					269404047));
	    if (class218 == null)
		throw new IllegalStateException("");
	    int i_10_ = class241_sub3.readBigSmart((byte) -66);
	    VarTypeList class199_sub2
		= ((VarTypeList)
		   ((VarBitTypeListClient) myList)
		       .listContainer.get(class218));
	    if (class199_sub2 != null)
		baseVar = class199_sub2.list(i_10_, -1814144106);
	    else if (!bool)
		throw new IllegalStateException("");
	    break;
	}
	default:
	    break;
	case 10:
	    startBit = class241_sub3.readUnsignedByte((byte) -51) * -274157071;
	    endBit = class241_sub3.readUnsignedByte((byte) -12) * -1557375495;
	    break;
	case 11:
	    /* empty */
	}
    }
    
    void decode/*method5904*/(RSByteBuffer buffer, int opcode, boolean bool, int i_11_) {
		Class335 class335 = (Class335) Class531.method11848(Class520.method11693((byte) -7),
				opcode, 655630711);
		switch (((Class335) class335).anInt5076 * -797536029) {
		case 1: {
		    int typeCode = buffer.readUnsignedByte((byte) 91);
		    VarDomainType domainType
				= ((VarDomainType) Class531.method11848(VarDomainType.method4361(1054681552), typeCode, -1870942778));
		    if (domainType == null) {
		    	throw new IllegalStateException("");
		    }
		    int code = buffer.readBigSmart((byte) 65);
		    VarTypeList class199_sub2 = ((VarTypeList) ((VarBitTypeListClient) myList).listContainer.get(domainType));
		    if (class199_sub2 != null) {
		    	baseVar = class199_sub2.list(code, -1932549647);
		    } else if (!bool) {
		    	throw new IllegalStateException("");
		    }
		    break;
		}
		default:
		    break;
		case 10:
		    startBit = buffer.readUnsignedByte((byte) -28) * -274157071;
		    endBit = buffer.readUnsignedByte((byte) 23) * -1557375495;
		    break;
		case 11:
		    /* empty */
		}
    }
    
    public int method5905(int i) {
	int i_14_
	    = masklookup[(-1700373431 * endBit
			      - startBit * -331342063)];
	return i >> -331342063 * startBit & i_14_;
    }
    
    void method5906(RSByteBuffer class241_sub3, boolean bool) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -76);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, bool, -1391404930);
	}
    }
    
    public int method5907(int i) {
	int i_15_
	    = masklookup[(-1700373431 * endBit
			      - startBit * -331342063)];
	return i >> -331342063 * startBit & i_15_;
    }
    
    public int method5908(int i) {
	int i_16_
	    = masklookup[(-1700373431 * endBit
			      - startBit * -331342063)];
	return i >> -331342063 * startBit & i_16_;
    }
    
    static {
		int i = 2;
		for (int bitIndex = 0; bitIndex < 32; bitIndex++) {
		    masklookup[bitIndex] = i - 1;
		    i += i;
		}
    }
    
    public static PlayerRights[] method5909(int i) {
	return (new PlayerRights[]
		{ PlayerRights.PMOD, PlayerRights.NORMAL,
		  PlayerRights.VIP, PlayerRights.VIP_PMOD,
		  PlayerRights.JMOD, PlayerRights.LMOD });
    }
    
    static final void method5910(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.anInt853 * -1307505439;
    }
    
    public static Class446[] method5911(int i) {
	if (null == ItemDefinitionLoader.aClass446Array7850) {
	    Class446[] class446s
		= Class501.method11441(Class288.fsimp14, (byte) -45);
	    Class446[] class446s_18_ = new Class446[class446s.length];
	    int i_19_ = 0;
	    int i_20_ = Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub24_8871.method14334((byte) 106);
	while_104_:
	    for (int i_21_ = 0; i_21_ < class446s.length; i_21_++) {
		Class446 class446 = class446s[i_21_];
		if ((class446.anInt6179 * 944464197 <= 0
		     || class446.anInt6179 * 944464197 >= 24)
		    && -954685139 * class446.anInt6177 >= 800
		    && -1042155793 * class446.anInt6180 >= 600
		    && (2 != i_20_
			|| (-954685139 * class446.anInt6177 <= 800
			    && -1042155793 * class446.anInt6180 <= 600))
		    && (i_20_ != 1
			|| (-954685139 * class446.anInt6177 <= 1024
			    && -1042155793 * class446.anInt6180 <= 768))) {
		    for (int i_22_ = 0; i_22_ < i_19_; i_22_++) {
			Class446 class446_23_ = class446s_18_[i_22_];
			if ((class446.anInt6177 * -954685139
			     == class446_23_.anInt6177 * -954685139)
			    && (class446_23_.anInt6180 * -1042155793
				== class446.anInt6180 * -1042155793)) {
			    if (class446.anInt6179 * 944464197
				> 944464197 * class446_23_.anInt6179)
				class446s_18_[i_22_] = class446;
			    continue while_104_;
			}
		    }
		    class446s_18_[i_19_] = class446;
		    i_19_++;
		}
	    }
	    ItemDefinitionLoader.aClass446Array7850 = new Class446[i_19_];
	    System.arraycopy(class446s_18_, 0, ItemDefinitionLoader.aClass446Array7850, 0,
			     i_19_);
	    int[] is = new int[ItemDefinitionLoader.aClass446Array7850.length];
	    for (int i_24_ = 0; i_24_ < ItemDefinitionLoader.aClass446Array7850.length;
		 i_24_++) {
		Class446 class446 = ItemDefinitionLoader.aClass446Array7850[i_24_];
		is[i_24_] = (class446.anInt6180 * -1042155793
			     * (-954685139 * class446.anInt6177));
	    }
	    Class241_Sub18_Sub1.method17137(is, ItemDefinitionLoader.aClass446Array7850,
					    -1626960504);
	}
	return ItemDefinitionLoader.aClass446Array7850;
    }
    
    public static void method5912(int i, short i_25_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(22, (long) i);
	class241_sub39_sub13.method17278((byte) -1);
    }
}
