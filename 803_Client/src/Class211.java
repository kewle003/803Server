/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class211
{
    static final int anInt2496 = 0;
    static final int anInt2497 = 1;
    static final int anInt2498 = 2;
    static final int anInt2499 = 3;
    static final int anInt2500 = 7;
    static final int anInt2501 = 4;
    static final int anInt2502 = 6;
    
    Class211() throws Throwable {
	throw new Error();
    }
    
    static boolean method4280(int i) {
		if (Class442.method7848(client.anInt8288 * 1766317249, 407777331))
		    return false;
		return true;
    }
    
    static void method4281(byte i) {
	if (null != Class16.aClass241_Sub39_Sub10_143) {
	    Class16.aClass241_Sub39_Sub10_143 = null;
	    Class579.method12709(Class193.anInt2298 * 1955430821,
				 282057643 * Class4.anInt16,
				 Class16.anInt147 * -885853667,
				 Class395.anInt5784 * -950722911, (byte) -51);
	}
    }
    
    static final void method4282(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class542.setComponentCursor(class58, class35, class454, 1513849141);
    }
    
    static final void method4283(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	SparseVarDomain.method3109(class58, class35, class454, -2147187923);
    }
    
    static boolean method4284(int i) {
	return Class185.aBool2185;
    }
    
    static final void decodeNPCsMasks/*method4285*/(byte i) {
		RSBitBuffer stream = ((ServerConnection) client.aClass190_8340).inputBuffer;
		for (int updateIdx = 0; updateIdx < client.anInt8334 * 2038574973; updateIdx++) {
		    int npcIndex = client.npcMaskUpdates[updateIdx];
		    NPC npc = ((NPC) (((ObjectNode) client.aClass407_8457.get((long) npcIndex)).objectValue));
		    stream.readUnsignedShort(1162222719);
		    int mask = stream.readUnsignedByte((byte) -6);
		    if (0 != (mask & 0x8)) {
		    	mask += stream.readUnsignedByte((byte) 65) << 8;
		    }
		    if (0 != (mask & 0x8000)) {
		    	mask += stream.readUnsignedByte((byte) -47) << 16;
			}
		    if (0 != (mask & 0x400000)) {
		    	mask += stream.readUnsignedByte((byte) -76) << 24;
			}
		    if (0 != (mask & 0x20000)) {//Face entity - ordinal 1
		    	npc.combatLevel = (stream.readUnsignedLEShort((short) 28232) * 190034923);
				if (65535 == 1239473347 * npc.combatLevel) {
					npc.combatLevel = (npc.definition.combatLevel) * 572907823;
			    }
		    }
		    if (0 != (mask & 0x200000)) {
				int i_3_ = (stream.payload[((stream.pointer += -681042949) * 421967667) - 1] & 0xff);
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				    int i_5_ = stream.readUnsignedByteS((byte) 68);
				    int i_6_ = stream.readIntV2(1274614902);
				    int i_7_ = stream.readTriByte(1771646547);
				    npc.method17996(i_5_, i_6_, i_7_, 1996815038);
				}
		    }
		    if (0 != (mask & 0x200)) {//Force movement ordinal 15
				npc.anInt11401 = stream.getByte(466068003) * 2045684417;
				npc.anInt11403 = stream.getByte(-2144628897) * -182768233;
				npc.anInt11402 = stream.readByteA(582493488) * -9202803;
				npc.anInt11428 = stream.getByteC(537746309) * -1841438277;
				npc.anInt11386  = (stream.readUnsignedLEShort((short) 15631) + client.anInt8296) * 1486211439;
				npc.anInt11422 = (stream.readUnsignedLEShortA(-281425597) + client.anInt8296) * -2087589789;
				npc.anInt11407 = stream.readUnsignedShort(1162222719) * 364183757;
				npc.anInt11401 += (2045684417 * npc.scenePositionXQueue[0]);
				npc.anInt11403 += (npc.scenePositionYQueue[0] * -182768233);
				npc.anInt11402 += (npc.scenePositionXQueue[0] * -9202803);
				npc.anInt11428 += (-1841438277 * npc.scenePositionYQueue[0]);
				npc.queuedStepCount = 1631398045;
				npc.anInt11430 = 0;
		    }
		    if (0 != (mask & 0x40)) {
				int i_8_ = stream.readByteC((byte) 82);
				if (i_8_ > 0) {
				    for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
						int i_10_ = -1;
						int i_11_ = -1;
						int i_12_ = -1;
						int i_13_ = stream.readSmart((short) -5681);
						if (i_13_ == 32767) {
						    i_13_ = stream.readSmart((short) -22337);
						    i_11_ = stream.readSmart((short) -24467);
						    i_10_ = stream.readSmart((short) -709);
						    i_12_ = stream.readSmart((short) -25303);
						} else if (i_13_ != 32766) {
						    i_11_ = stream.readSmart((short) -7678);
						} else {
						    i_13_ = -1;
						    i_11_ = stream.readUnsignedByte((byte) 66);
						}
						int i_14_ = stream.readSmart((short) -15757);
						npc.setHitMark(i_13_, i_11_, i_10_, i_12_, client.anInt8296, i_14_, -1881852832);
				    }
				}
				int i_15_ = stream.readUnsignedByteS((byte) 36);
				if (i_15_ > 0) {
				    for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
						int i_17_ = stream.readSmart((short) -3895);
						int i_18_ = stream.readSmart((short) -3281);
						if (32767 != i_18_) {
						    int i_19_ = stream.readSmart((short) -5519);
						    int i_20_ = stream.getByteA(-2018799463);
						    int i_21_ = (i_18_ > 0 ? stream.readUnsignedByte((byte) 39) : i_20_);
						    npc.method17791(i_17_, client.anInt8296, i_18_, i_19_, i_20_, i_21_, (byte) 0);
						} else {
						    npc.method17780(i_17_, 286511346);
						}
				    }
				}
		    }
		    if ((mask & 0x80000) != 0) {
				stream.pointer += -1362085898;
				int i_22_ = (stream.payload[((stream.pointer += -681042949) * 421967667) - 1] & 0xff);
				for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
				    int i_24_ = stream.readUnsignedByte((byte) -100);
				    BaseVarType class217 = ((BaseVarType) Class531.method11848(BaseVarType.method4351(-380686663), i_24_, 15012699));
				    Class254 class254 = Class333.VAR_NPC_LIST.decodeVarValue(stream, class217, -1843925137);
				    npc.anInterface46_11409.method335(class254.key * 623518843, class254.value, (byte) 14);
				}
		    }
		    if ((mask & 0x800) != 0) {
				int i_25_ = stream.readUnsignedLEShortA(1883136529);
				int i_26_ = stream.readIntV1((short) 7483);
				if (65535 == i_25_) {
				    i_25_ = -1;
				}
				int i_27_ = stream.readUnsignedByte((byte) 65);
				int i_28_ = i_27_ & 0x7;
				int i_29_ = i_27_ >> 3 & 0xf;
				if (i_29_ == 15) {
				    i_29_ = -1;
				}
				boolean bool = 1 == (i_27_ >> 7 & 0x1);
				npc.method17788(i_25_, i_26_, i_28_, i_29_, bool, 1, -1551326538);
		    }
		    if (0 != (mask & 0x80)) {
		    	npc.method17997(stream.readString(-1113072434), 0, 0, (short) 255);
		    }
		    if ((mask & 0x1) != 0) {
				int i_30_ = stream.readUnsignedShort(1162222719);
				int i_31_ = stream.readInt((byte) 70);
				if (i_30_ == 65535) {
				    i_30_ = -1;
				}
				int i_32_ = stream.readUnsignedByteS((byte) 12);
				int i_33_ = i_32_ & 0x7;
				int i_34_ = i_32_ >> 3 & 0xf;
				if (i_34_ == 15) {
				    i_34_ = -1;
				}
				boolean bool = 1 == (i_32_ >> 7 & 0x1);
				npc.method17788(i_30_, i_31_, i_33_, i_34_, bool, 0, 1478034320);
		    }
		    if ((mask & 0x100000) != 0) {
		    	npc.npcName = stream.readString(468552487);
		    	if ("".equals(npc.npcName) || npc.npcName.equals(npc.definition.name)) {
		    		npc.npcName = npc.definition.name;
		    	}
		    }
		    if ((mask & 0x800000) != 0) {
				int i_35_ = stream.readUnsignedByteS((byte) 66);
				int[] is = new int[8];
				short[] is_36_ = new short[8];
				for (int i_37_ = 0; i_37_ < 8; i_37_++) {
				    if (0 != (i_35_ & 1 << i_37_)) {
						is[i_37_] = stream.readBigSmart((byte) -52);
						is_36_[i_37_] = (short) stream.method14638(-1429327855);
				    } else {
						is[i_37_] = -1;
						is_36_[i_37_] = (short) -1;
				    }
				}
				npc.aClass400_11529 = new Class400(is, is_36_);
		    }
		    if ((mask & 0x4000000) != 0) {
				int i_38_ = stream.readUnsignedShort(1162222719);
				int i_39_ = stream.readIntV2(1274614902);
				if (i_38_ == 65535) {
				    i_38_ = -1;
				}
				int i_40_ = stream.readByteC((byte) 112);
				int i_41_ = i_40_ & 0x7;
				int i_42_ = i_40_ >> 3 & 0xf;
				if (15 == i_42_) {
				    i_42_ = -1;
				}
				boolean bool = (i_40_ >> 7 & 0x1) == 1;
				npc.method17788(i_38_, i_39_, i_41_, i_42_, bool, 2, -418556661);
		    }
		    if ((mask & 0x2) != 0) {
				npc.facingEntity = (stream.readUnsignedLEShort((short) 23211) * 1027225177);
				if (65535 == -36064791 * npc.facingEntity) {
				    npc.facingEntity = -1027225177;
				}
		    }
		    if (0 != (mask & 0x2000000)) {
				int i_43_ = stream.readUnsignedLEShort((short) 8106);
				int i_44_ = stream.readIntV2(1274614902);
				if (65535 == i_43_) {
				    i_43_ = -1;
				}
				int i_45_ = stream.readUnsignedByteS((byte) 25);
				int i_46_ = i_45_ & 0x7;
				int i_47_ = i_45_ >> 3 & 0xf;
				if (i_47_ == 15) {
				    i_47_ = -1;
				}
				boolean bool = (i_45_ >> 7 & 0x1) == 1;
				npc.method17788(i_43_, i_44_, i_46_, i_47_, bool, 4, 1953825439);
		    }
		    if ((mask & 0x4) != 0) {
		    	npc.anInt11521 = stream.readUnsignedLEShortA(-496211237) * -373723239;
		    	npc.anInt11522 = stream.readUnsignedLEShortA(286318087) * 836941349;
		    }
		    if (0 != (mask & 0x8000000)) {
				npc.aByte11416 = stream.getByte(1185684588);
				npc.aByte11395 = stream.getByte(-1587474330);
				npc.aByte11412 = stream.getByte(-2045941461);
				npc.aByte11413 = (byte) stream.readUnsignedByte((byte) -36);
				npc.anInt11408 = ((client.anInt8296
					+ stream.readUnsignedLEShortA(1794561739)) * -1558068143);
				npc.anInt11389 = ((client.anInt8296
					+ stream.readUnsignedLEShort((short) 2694)) * -960497231);
		    }
		    if (0 != (mask & 0x400)) {
				int i_48_ = stream.readUnsignedByte((byte) 21);
				int[] is = new int[i_48_];
				int[] is_49_ = new int[i_48_];
				for (int i_50_ = 0; i_50_ < i_48_; i_50_++) {
				    int i_51_ = stream.readUnsignedLEShort((short) 8816);
				    if ((i_51_ & 0xc000) == 49152) {
					int i_52_ = stream.readUnsignedShortA((byte) 109);
					is[i_50_] = i_51_ << 16 | i_52_;
				    } else
					is[i_50_] = i_51_;
				    is_49_[i_50_] = stream.readUnsignedLEShortA(-489061750);
				}
				npc.method17773(is, is_49_, -1393431684);
		    }
		    if (0 != (mask & 0x40000)) {
				int i_53_ = npc.definition.anIntArray5841.length;
				int i_54_ = 0;
				if (null != npc.definition.aShortArray5849) {
				    i_54_ = npc.definition.aShortArray5849.length;
				}
				int i_55_ = 0;
				if (npc.definition.aShortArray5813 != null) {
				    i_54_ = npc.definition.aShortArray5813.length;
				}
				int i_56_ = stream.readUnsignedByte((byte) -61);
				if (1 != (i_56_ & 0x1)) {
				    stream.pointer += -1362085898;
				    int[] is = null;
				    if (2 == (i_56_ & 0x2)) {
						is = new int[i_53_];
						for (int i_57_ = 0; i_57_ < i_53_; i_57_++) {
						    is[i_57_] = stream.readBigSmart((byte) 104);
						}
				    }
				    short[] is_58_ = null;
				    if (4 == (i_56_ & 0x4)) {
						is_58_ = new short[i_54_];
						for (int i_59_ = 0; i_59_ < i_54_; i_59_++) {
						    is_58_[i_59_] = (short) stream.readUnsignedLEShortA(1058526043);
						}
				    }
				    short[] is_60_ = null;
				    if (8 == (i_56_ & 0x8)) {
						is_60_ = new short[i_55_];
						for (int i_61_ = 0; i_61_ < i_55_; i_61_++) {
						    is_60_[i_61_] = (short) stream.readUnsignedLEShort((short) 21216);
						}
				    }
				    long l = (long) ((NPC.anInt11525 += 1674654299) * 275033555 - 1);
				    new Class404(l, is, null, null, null, is_58_, is_60_);
				}
		    }
		    if (0 != (mask & 0x10)) {
				int[] is = new int[4];
				for (int i_62_ = 0; i_62_ < 4; i_62_++) {
				    is[i_62_] = stream.readBigSmart((byte) 13);
				}
				int i_63_ = stream.readByteC((byte) 52);
				Class638.method13557(npc, is, i_63_, true, (byte) 82);
		    }
		    if ((mask & 0x1000000) != 0) {
				int i_64_ = stream.readUnsignedShort(1162222719);
				int i_65_ = stream.readInt((byte) 11);
				if (i_64_ == 65535) {
				    i_64_ = -1;
				}
				int i_66_ = stream.readUnsignedByteS((byte) 27);
				int i_67_ = i_66_ & 0x7;
				int i_68_ = i_66_ >> 3 & 0xf;
				if (i_68_ == 15) {
				    i_68_ = -1;
				}
				boolean bool = 1 == (i_66_ >> 7 & 0x1);
				npc.method17788(i_64_, i_65_, i_67_, i_68_, bool, 3, -1535015292);
		    }
		    if ((mask & 0x100) != 0) {
				int i_69_ = stream.readUnsignedByteS((byte) 75);
				int[] is = new int[i_69_];
				int[] is_70_ = new int[i_69_];
				int[] is_71_ = new int[i_69_];
				for (int i_72_ = 0; i_72_ < i_69_; i_72_++) {
				    int i_73_ = stream.readBigSmart((byte) -78);
				    is[i_72_] = i_73_;
				    is_70_[i_72_] = stream.readUnsignedByteS((byte) 13);
				    is_71_[i_72_] = stream.readUnsignedShortA((byte) 124);
				}
				Class107.method2685(npc, is, is_70_, is_71_, -1634788695);
		    }
		    if (0 != (mask & 0x4000)) {
				npc.anInt11530 = (stream.readUnsignedLEShort((short) 31312) * 1041382731);
				if (npc.anInt11530 * -1587321757 == 65535) {
				    npc.anInt11530 = -1041382731;
				}
		    }
		    if ((mask & 0x2000) != 0) {
				int i_74_ = npc.definition.modelIDs.length;
				int i_75_ = 0;
				if (null != npc.definition.aShortArray5849) {
				    i_75_ = npc.definition.aShortArray5849.length;
				}
				int i_76_ = 0;
				if (null != npc.definition.aShortArray5813) {
				    i_76_ = npc.definition.aShortArray5813.length;
				}
				int i_77_ = stream.getByteA(-2147221157);
				if (1 == (i_77_ & 0x1)) {
				    npc.aClass404_11531 = null;
				} else {
				    stream.pointer += -1362085898;
				    int[] is = null;
				    float[] fs = null;
				    int[][] is_78_ = null;
				    int[][] is_79_ = null;
				    if ((i_77_ & 0x2) == 2) {
						is = new int[i_74_];
						if ((i_77_ & 0x10) == 16) {
						    fs = new float[i_74_];
						    is_78_ = new int[i_74_][3];
						    is_79_ = new int[i_74_][3];
						}
						for (int i_80_ = 0; i_80_ < i_74_; i_80_++) {
						    is[i_80_] = stream.readBigSmart((byte) -34);
						    if ((i_77_ & 0x10) == 16 && -1 != is[i_80_]) {
								fs[i_80_] = stream.method14650(-350295778);
								for (int i_81_ = 0; i_81_ < 3; i_81_++) {
								    is_78_[i_80_][i_81_] = stream.method14667(-1139681986);
								}
								for (int i_82_ = 0; i_82_ < 3; i_82_++) {
								    is_79_[i_80_][i_82_] = stream.method14667(-88270314);
								}
						    }
						}
				    }
				    short[] is_83_ = null;
				    if ((i_77_ & 0x4) == 4) {
						is_83_ = new short[i_75_];
						for (int i_84_ = 0; i_84_ < i_75_; i_84_++) {
						    is_83_[i_84_] = (short) stream.readUnsignedLEShortA(283539960);
						}
				    }
				    short[] is_85_ = null;
				    if ((i_77_ & 0x8) == 8) {
						is_85_ = new short[i_76_];
						for (int i_86_ = 0; i_86_ < i_76_; i_86_++) {
						    is_85_[i_86_] = (short) stream.readUnsignedShortA((byte) 25);
						}
				    }
				    long l = (long) ((NPC.anInt11524 += -1265497825) * 1455305439 - 1);
				    npc.aClass404_11531 = new Class404(l, is, fs, is_78_, is_79_, is_83_, is_85_);
				}
		    }
		    if ((mask & 0x10000) != 0) {
				npc.anInterface46_11409.method195(-1906153066);
				stream.pointer += -1362085898;
				int i_87_ = (stream.payload[((stream.pointer += -681042949) * 421967667) - 1] & 0xff);
				for (int i_88_ = 0; i_88_ < i_87_; i_88_++) {
				    int i_89_ = stream.readUnsignedByte((byte) -12);
				    BaseVarType class217 = ((BaseVarType) Class531.method11848(
				    		BaseVarType.method4351(447230895), i_89_, -1065933440));
				    Class254 class254 = Class333.VAR_NPC_LIST.decodeVarValue(stream, class217, -1843925137);
				    npc.anInterface46_11409.method335(class254.key * 623518843, class254.value, (byte) -74);
				}
		    }
		    if (0 != (mask & 0x20)) {
				if (npc.definition.method7152(-1974725513)) {
				    Class638.method13558(npc, -825668477);
				}
				npc.setDefinition(MasterIndex.npcDefLoader.getNpcDefinition(
						stream.readBigSmart((byte) -15), -652424491),
						0 == (mask & 0x100000), 0 == (mask & 0x20000), true,
						745651160);
				npc.method17781(19489015 * npc.definition.size, (byte) -43);
				npc.anInt11400 = (607575013 * npc.definition.headsIcon << 3) * -687691613;
				if (npc.definition.method7152(-443933992)) {
				    Class612.method13238(
				    		npc.nodePlane,
				    		npc.scenePositionXQueue[0],
				    		npc.scenePositionYQueue[0], 0,
				    		null, npc, null, (byte) 99);
				}
		    }
		}
    }
    
    static final void method4286(byte i) {
	client.anInt8352 = -504628557;
	client.anInt8266 = -327526951;
	HitMarkType.aClass241_Sub3_7297 = null;
	Class208.method4135(-1070756622);
    }
}
