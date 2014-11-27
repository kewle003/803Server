/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ReferenceTable
{
    byte[] aByteArray4455;
    int anInt4456;
    int[] entryChildIndexCount;//anIntArray4457
    int version;//anInt4458
    int entryCount;//anInt4459
    int[] entryIndicies;//anIntArray4460
    int[] entryVersions;//anIntArray4461
    Class78 identifiers;//aClass78_4462
    boolean hasIdentifiers;//aBool4463
    int[] entryCrcs;//anIntArray4464
    byte[][] entryDigests;//aByteArrayArray4465
    int[][] entryChildIndices;//anIntArrayArray4466
    int[] entryChildCounts;//anIntArray4467
    int[][] entryChildIdentifiers;//anIntArrayArray4468
    boolean hasDigests;//aBool4469
    Class78[] childIdentifiers;//aClass78Array4470
    int[] entryIdentifiers;//anIntArray4471
    int indexCount;//anInt4472
    static final int anInt4473 = 7;
    
    void method5552(byte[] is) {
	RSByteBuffer class241_sub3
	    = new RSByteBuffer(GPI.method4022(is, 1881317228));
	int i = class241_sub3.readUnsignedByte((byte) -43);
	if (i < 5 || i > 7)
	    throw new RuntimeException();
	if (i >= 6)
	    version
		= class241_sub3.readInt((byte) 43) * 98692631;
	else
	    version = 0;
	int i_0_ = class241_sub3.readUnsignedByte((byte) 92);
	hasIdentifiers = 0 != (i_0_ & 0x1);
	hasDigests = (i_0_ & 0x2) != 0;
	if (i >= 7)
	    entryCount
		= class241_sub3.readUnsignedBigSmart(-1299777195) * -1903462771;
	else
	    entryCount
		= class241_sub3.readUnsignedShort(1162222719) * -1903462771;
	int i_1_ = 0;
	int i_2_ = -1;
	entryIndicies
	    = new int[entryCount * 522206277];
	if (i >= 7) {
	    for (int i_3_ = 0; i_3_ < 522206277 * entryCount;
		 i_3_++) {
		entryIndicies[i_3_] = i_1_
		    += class241_sub3.readUnsignedBigSmart(-726965040);
		if (entryIndicies[i_3_] > i_2_)
		    i_2_ = entryIndicies[i_3_];
	    }
	} else {
	    for (int i_4_ = 0; i_4_ < entryCount * 522206277;
		 i_4_++) {
		entryIndicies[i_4_] = i_1_
		    += class241_sub3.readUnsignedShort(1162222719);
		if (entryIndicies[i_4_] > i_2_)
		    i_2_ = entryIndicies[i_4_];
	    }
	}
	indexCount = (i_2_ + 1) * -1421928735;
	entryCrcs
	    = new int[-546788063 * indexCount];
	if (hasDigests)
	    entryDigests
		= new byte[indexCount * -546788063][];
	entryVersions
	    = new int[indexCount * -546788063];
	entryChildCounts
	    = new int[-546788063 * indexCount];
	entryChildIndices
	    = new int[-546788063 * indexCount][];
	entryChildIndexCount
	    = new int[-546788063 * indexCount];
	if (hasIdentifiers) {
	    entryIdentifiers
		= new int[indexCount * -546788063];
	    for (int i_5_ = 0; i_5_ < indexCount * -546788063;
		 i_5_++)
		entryIdentifiers[i_5_] = -1;
	    for (int i_6_ = 0; i_6_ < entryCount * 522206277;
		 i_6_++)
		entryIdentifiers[(((ReferenceTable) this)
						  .entryIndicies[i_6_])]
		    = class241_sub3.readInt((byte) 101);
	    identifiers
		= new Class78(entryIdentifiers);
	}
	for (int i_7_ = 0; i_7_ < 522206277 * entryCount;
	     i_7_++)
	    entryCrcs[(entryIndicies
					      [i_7_])]
		= class241_sub3.readInt((byte) 111);
	if (hasDigests) {
	    for (int i_8_ = 0; i_8_ < entryCount * 522206277;
		 i_8_++) {
		byte[] is_9_ = new byte[64];
		class241_sub3.readBytes(is_9_, 0, 64, (byte) 95);
		entryDigests[(((ReferenceTable) this)
						       .entryIndicies[i_8_])]
		    = is_9_;
	    }
	}
	for (int i_10_ = 0; i_10_ < entryCount * 522206277;
	     i_10_++)
	    entryVersions[(entryIndicies
					      [i_10_])]
		= class241_sub3.readInt((byte) 127);
	if (i >= 7) {
	    for (int i_11_ = 0;
		 i_11_ < entryCount * 522206277; i_11_++)
		entryChildCounts[(((ReferenceTable) this)
						  .entryIndicies[i_11_])]
		    = class241_sub3.readUnsignedBigSmart(441038718);
	    for (int i_12_ = 0;
		 i_12_ < 522206277 * entryCount; i_12_++) {
		int i_13_ = entryIndicies[i_12_];
		int i_14_ = entryChildCounts[i_13_];
		i_1_ = 0;
		int i_15_ = -1;
		entryChildIndices[i_13_] = new int[i_14_];
		for (int i_16_ = 0; i_16_ < i_14_; i_16_++) {
		    int i_17_
			= (entryChildIndices[i_13_][i_16_]
			   = i_1_ += class241_sub3.readUnsignedBigSmart(348010642));
		    if (i_17_ > i_15_)
			i_15_ = i_17_;
		}
		entryChildIndexCount[i_13_] = 1 + i_15_;
		if (i_14_ == 1 + i_15_)
		    entryChildIndices[i_13_] = null;
	    }
	} else {
	    for (int i_18_ = 0;
		 i_18_ < 522206277 * entryCount; i_18_++)
		entryChildCounts[(((ReferenceTable) this)
						  .entryIndicies[i_18_])]
		    = class241_sub3.readUnsignedShort(1162222719);
	    for (int i_19_ = 0;
		 i_19_ < entryCount * 522206277; i_19_++) {
		int i_20_ = entryIndicies[i_19_];
		int i_21_ = entryChildCounts[i_20_];
		i_1_ = 0;
		int i_22_ = -1;
		entryChildIndices[i_20_] = new int[i_21_];
		for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
		    int i_24_
			= (entryChildIndices[i_20_][i_23_]
			   = i_1_ += class241_sub3.readUnsignedShort(1162222719));
		    if (i_24_ > i_22_)
			i_22_ = i_24_;
		}
		entryChildIndexCount[i_20_] = i_22_ + 1;
		if (i_21_ == 1 + i_22_)
		    entryChildIndices[i_20_] = null;
	    }
	}
	if (hasIdentifiers) {
	    entryChildIdentifiers = new int[1 + i_2_][];
	    childIdentifiers = new Class78[i_2_ + 1];
	    for (int i_25_ = 0;
		 i_25_ < entryCount * 522206277; i_25_++) {
		int i_26_ = entryIndicies[i_25_];
		int i_27_ = entryChildCounts[i_26_];
		entryChildIdentifiers[i_26_]
		    = new int[entryChildIndexCount[i_26_]];
		for (int i_28_ = 0;
		     i_28_ < entryChildIndexCount[i_26_]; i_28_++)
		    entryChildIdentifiers[i_26_][i_28_] = -1;
		for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
		    int i_30_;
		    if (null != entryChildIndices[i_26_])
			i_30_ = (entryChildIndices[i_26_]
				 [i_29_]);
		    else
			i_30_ = i_29_;
		    entryChildIdentifiers[i_26_][i_30_]
			= class241_sub3.readInt((byte) 74);
		}
		childIdentifiers[i_26_]
		    = new Class78(entryChildIdentifiers
				  [i_26_]);
	    }
	}
    }
    
    void decode/*method5553*/(byte[] is, int i) {
		RSByteBuffer buffer = new RSByteBuffer(GPI.method4022(is, 1881317228));
		int protocol = buffer.readUnsignedByte((byte) 51);
		if (protocol < 5 || protocol > 7) {
		    throw new RuntimeException();
		}
		if (protocol >= 6) {
		    version = buffer.readInt((byte) 78) * 98692631;
		} else {
		    version = 0;
		}
		int flags = buffer.readUnsignedByte((byte) -49);
		hasIdentifiers = 0 != (flags & 0x1);
		hasDigests = (flags & 0x2) != 0;
		if (protocol >= 7) {
		    entryCount = buffer.readUnsignedBigSmart(-2036520510) * -1903462771;
		} else {
		    entryCount = buffer.readUnsignedShort(1162222719) * -1903462771;
		}
		int offset = 0;
		int count = -1;
		entryIndicies = new int[entryCount * 522206277];
		if (protocol >= 7) {
		    for (int i_35_ = 0; i_35_ < 522206277 * entryCount; i_35_++) {
				entryIndicies[i_35_] = offset += buffer.readUnsignedBigSmart(-1915614727);
				if (entryIndicies[i_35_] > count) {
					count = entryIndicies[i_35_];
				}
		    }
		} else {
		    for (int i_36_ = 0; i_36_ < entryCount * 522206277; i_36_++) {
				entryIndicies[i_36_] = offset += buffer.readUnsignedShort(1162222719);
				if (entryIndicies[i_36_] > count) {
					count = entryIndicies[i_36_];
				}
		    }
		}
		indexCount = (count + 1) * -1421928735;
		entryCrcs = new int[-546788063 * indexCount];
		if (hasDigests) {
		    entryDigests = new byte[indexCount * -546788063][];
		}
		entryVersions = new int[indexCount * -546788063];
		entryChildCounts = new int[-546788063 * indexCount];
		entryChildIndices = new int[-546788063 * indexCount][];
		entryChildIndexCount = new int[-546788063 * indexCount];
		if (hasIdentifiers) {
		    entryIdentifiers = new int[indexCount * -546788063];
		    for (int index = 0; index < indexCount * -546788063; index++) {
		    	entryIdentifiers[index] = -1;
		    }
		    for (int index = 0; index < entryCount * 522206277; index++) {
		    	entryIdentifiers[entryIndicies[index]] = buffer.readInt((byte) 47);
		    }
		    identifiers = new Class78(entryIdentifiers);
		}
		for (int index = 0; index < 522206277 * entryCount; index++) {
		    entryCrcs[entryIndicies[index]] = buffer.readInt((byte) 49);
		}
		if (hasDigests) {
		    for (int i_40_ = 0; i_40_ < entryCount * 522206277; i_40_++) {
				byte[] digest = new byte[64];
				buffer.readBytes(digest, 0, 64, (byte) 19);
				entryDigests[entryIndicies[i_40_]] = digest;
		    }
		}
		for (int i_42_ = 0; i_42_ < entryCount * 522206277; i_42_++) {
		    entryVersions[entryIndicies[i_42_]] = buffer.readInt((byte) 78);
		}
		if (protocol >= 7) {
		    for (int i_43_ = 0; i_43_ < entryCount * 522206277; i_43_++) {
		    	entryChildCounts[entryIndicies[i_43_]] = buffer.readUnsignedBigSmart(-1039940474);
		    }
		    for (int i_44_ = 0; i_44_ < 522206277 * entryCount; i_44_++) {
				int i_45_ = entryIndicies[i_44_];
				int size = entryChildCounts[i_45_];
				offset = 0;
				int lastEntry = -1;
				entryChildIndices[i_45_] = new int[size];
				for (int i_48_ = 0; i_48_ < size; i_48_++) {
				    int i_49_ = (entryChildIndices[i_45_][i_48_]
					   = offset += buffer.readUnsignedBigSmart(1680717028));
				    if (i_49_ > lastEntry) {
				    	lastEntry = i_49_;
				    }
				}
				entryChildIndexCount[i_45_] = 1 + lastEntry;
				if (size == 1 + lastEntry) {
				    entryChildIndices[i_45_] = null;
				}
		    }
		} else {
		    for (int index = 0; index < 522206277 * entryCount; index++) {
		    	entryChildCounts[entryIndicies[index]] = buffer.readUnsignedShort(1162222719);
		    }
		    for (int i_51_ = 0; i_51_ < entryCount * 522206277; i_51_++) {
				int i_52_ = entryIndicies[i_51_];
				int i_53_ = entryChildCounts[i_52_];
				offset = 0;
				int i_54_ = -1;
				entryChildIndices[i_52_] = new int[i_53_];
				for (int i_55_ = 0; i_55_ < i_53_; i_55_++) {
				    int i_56_
					= (entryChildIndices[i_52_][i_55_]
					   = offset += buffer.readUnsignedShort(1162222719));
				    if (i_56_ > i_54_)
					i_54_ = i_56_;
				}
				entryChildIndexCount[i_52_] = i_54_ + 1;
				if (i_53_ == 1 + i_54_)
				    entryChildIndices[i_52_] = null;
		    }
		}
		if (hasIdentifiers) {
		    entryChildIdentifiers = new int[1 + count][];
		    childIdentifiers = new Class78[count + 1];
		    for (int i_57_ = 0; i_57_ < entryCount * 522206277; i_57_++) {
				int i_58_ = entryIndicies[i_57_];
				int i_59_ = entryChildCounts[i_58_];
				entryChildIdentifiers[i_58_] = new int[entryChildIndexCount[i_58_]];
				for (int i_60_ = 0; i_60_ < entryChildIndexCount[i_58_]; i_60_++) {
				    entryChildIdentifiers[i_58_][i_60_] = -1;
				}
				for (int i_61_ = 0; i_61_ < i_59_; i_61_++) {
				    int i_62_;
				    if (null != entryChildIndices[i_58_]) {
				    	i_62_ = (entryChildIndices[i_58_][i_61_]);
				    } else {
				    	i_62_ = i_61_;
				    }
				    entryChildIdentifiers[i_58_][i_62_] = buffer.readInt((byte) 22);
				}
				childIdentifiers[i_58_] = new Class78(entryChildIdentifiers[i_58_]);
		    }
		}
    }
    
    ReferenceTable(byte[] is, int i, byte[] is_63_) {
		anInt4456 = Class238.method4880(is, is.length, -1319893344) * 698173607;
		if (anInt4456 * -1738285289 != i)
		    throw new RuntimeException();
		if (null != is_63_) {
		    if (64 != is_63_.length)
			throw new RuntimeException();
		    aByteArray4455
			= Class187.whirlpool(is, 0, is.length, (short) 255);
		    for (int i_64_ = 0; i_64_ < 64; i_64_++) {
			if (is_63_[i_64_] != aByteArray4455[i_64_])
			    throw new RuntimeException();
		    }
		}
		decode(is, -1646682261);
    }
    
    void method5554(byte[] is) {
	RSByteBuffer class241_sub3
	    = new RSByteBuffer(GPI.method4022(is, 1881317228));
	int i = class241_sub3.readUnsignedByte((byte) -71);
	if (i < 5 || i > 7)
	    throw new RuntimeException();
	if (i >= 6)
	    version
		= class241_sub3.readInt((byte) 83) * 98692631;
	else
	    version = 0;
	int i_65_ = class241_sub3.readUnsignedByte((byte) 44);
	hasIdentifiers = 0 != (i_65_ & 0x1);
	hasDigests = (i_65_ & 0x2) != 0;
	if (i >= 7)
	    entryCount
		= class241_sub3.readUnsignedBigSmart(15588602) * -1903462771;
	else
	    entryCount
		= class241_sub3.readUnsignedShort(1162222719) * -1903462771;
	int i_66_ = 0;
	int i_67_ = -1;
	entryIndicies
	    = new int[entryCount * 522206277];
	if (i >= 7) {
	    for (int i_68_ = 0;
		 i_68_ < 522206277 * entryCount; i_68_++) {
		entryIndicies[i_68_] = i_66_
		    += class241_sub3.readUnsignedBigSmart(-962846827);
		if (entryIndicies[i_68_] > i_67_)
		    i_67_ = entryIndicies[i_68_];
	    }
	} else {
	    for (int i_69_ = 0;
		 i_69_ < entryCount * 522206277; i_69_++) {
		entryIndicies[i_69_] = i_66_
		    += class241_sub3.readUnsignedShort(1162222719);
		if (entryIndicies[i_69_] > i_67_)
		    i_67_ = entryIndicies[i_69_];
	    }
	}
	indexCount = (i_67_ + 1) * -1421928735;
	entryCrcs
	    = new int[-546788063 * indexCount];
	if (hasDigests)
	    entryDigests
		= new byte[indexCount * -546788063][];
	entryVersions
	    = new int[indexCount * -546788063];
	entryChildCounts
	    = new int[-546788063 * indexCount];
	entryChildIndices
	    = new int[-546788063 * indexCount][];
	entryChildIndexCount
	    = new int[-546788063 * indexCount];
	if (hasIdentifiers) {
	    entryIdentifiers
		= new int[indexCount * -546788063];
	    for (int i_70_ = 0;
		 i_70_ < indexCount * -546788063; i_70_++)
		entryIdentifiers[i_70_] = -1;
	    for (int i_71_ = 0;
		 i_71_ < entryCount * 522206277; i_71_++)
		entryIdentifiers[(((ReferenceTable) this)
						  .entryIndicies[i_71_])]
		    = class241_sub3.readInt((byte) 99);
	    identifiers
		= new Class78(entryIdentifiers);
	}
	for (int i_72_ = 0; i_72_ < 522206277 * entryCount;
	     i_72_++)
	    entryCrcs[(entryIndicies
					      [i_72_])]
		= class241_sub3.readInt((byte) 62);
	if (hasDigests) {
	    for (int i_73_ = 0;
		 i_73_ < entryCount * 522206277; i_73_++) {
		byte[] is_74_ = new byte[64];
		class241_sub3.readBytes(is_74_, 0, 64, (byte) -60);
		entryDigests[(((ReferenceTable) this)
						       .entryIndicies[i_73_])]
		    = is_74_;
	    }
	}
	for (int i_75_ = 0; i_75_ < entryCount * 522206277;
	     i_75_++)
	    entryVersions[(entryIndicies
					      [i_75_])]
		= class241_sub3.readInt((byte) 70);
	if (i >= 7) {
	    for (int i_76_ = 0;
		 i_76_ < entryCount * 522206277; i_76_++)
		entryChildCounts[(((ReferenceTable) this)
						  .entryIndicies[i_76_])]
		    = class241_sub3.readUnsignedBigSmart(1937952907);
	    for (int i_77_ = 0;
		 i_77_ < 522206277 * entryCount; i_77_++) {
		int i_78_ = entryIndicies[i_77_];
		int i_79_ = entryChildCounts[i_78_];
		i_66_ = 0;
		int i_80_ = -1;
		entryChildIndices[i_78_] = new int[i_79_];
		for (int i_81_ = 0; i_81_ < i_79_; i_81_++) {
		    int i_82_
			= (entryChildIndices[i_78_][i_81_]
			   = i_66_ += class241_sub3.readUnsignedBigSmart(169847406));
		    if (i_82_ > i_80_)
			i_80_ = i_82_;
		}
		entryChildIndexCount[i_78_] = 1 + i_80_;
		if (i_79_ == 1 + i_80_)
		    entryChildIndices[i_78_] = null;
	    }
	} else {
	    for (int i_83_ = 0;
		 i_83_ < 522206277 * entryCount; i_83_++)
		entryChildCounts[(((ReferenceTable) this)
						  .entryIndicies[i_83_])]
		    = class241_sub3.readUnsignedShort(1162222719);
	    for (int i_84_ = 0;
		 i_84_ < entryCount * 522206277; i_84_++) {
		int i_85_ = entryIndicies[i_84_];
		int i_86_ = entryChildCounts[i_85_];
		i_66_ = 0;
		int i_87_ = -1;
		entryChildIndices[i_85_] = new int[i_86_];
		for (int i_88_ = 0; i_88_ < i_86_; i_88_++) {
		    int i_89_
			= (entryChildIndices[i_85_][i_88_]
			   = i_66_ += class241_sub3.readUnsignedShort(1162222719));
		    if (i_89_ > i_87_)
			i_87_ = i_89_;
		}
		entryChildIndexCount[i_85_] = i_87_ + 1;
		if (i_86_ == 1 + i_87_)
		    entryChildIndices[i_85_] = null;
	    }
	}
	if (hasIdentifiers) {
	    entryChildIdentifiers = new int[1 + i_67_][];
	    childIdentifiers = new Class78[i_67_ + 1];
	    for (int i_90_ = 0;
		 i_90_ < entryCount * 522206277; i_90_++) {
		int i_91_ = entryIndicies[i_90_];
		int i_92_ = entryChildCounts[i_91_];
		entryChildIdentifiers[i_91_]
		    = new int[entryChildIndexCount[i_91_]];
		for (int i_93_ = 0;
		     i_93_ < entryChildIndexCount[i_91_]; i_93_++)
		    entryChildIdentifiers[i_91_][i_93_] = -1;
		for (int i_94_ = 0; i_94_ < i_92_; i_94_++) {
		    int i_95_;
		    if (null != entryChildIndices[i_91_])
			i_95_ = (entryChildIndices[i_91_]
				 [i_94_]);
		    else
			i_95_ = i_94_;
		    entryChildIdentifiers[i_91_][i_95_]
			= class241_sub3.readInt((byte) 65);
		}
		childIdentifiers[i_91_]
		    = new Class78(entryChildIdentifiers
				  [i_91_]);
	    }
	}
    }
    
    static final void method5555(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStackPointer -= 993556554;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (Class22.method901
	       ((String) (((ClientScriptData) class454).objectStack
			  [((ClientScriptData) class454).objectStackPointer * -290357331]),
		(String) (((ClientScriptData) class454).objectStack
			  [1 + -290357331 * ((ClientScriptData) class454).objectStackPointer]),
		VarPlayerDomain.currentLocale, 876279043));
    }
    
    static boolean method5556(int i, int i_96_, int i_97_, byte i_98_) {
	Class552 class552 = client.aClass238_8477.method4751(-1777695974);
	boolean bool = true;
	Interface24 interface24
	    = (Interface24) class552.method12132(i, i_96_, i_97_, (byte) 7);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, -1932720624);
	interface24
	    = (Interface24) class552.method12136(i, i_96_, i_97_,
						 client.anInterface57_8577,
						 -618137223);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, -952646735);
	interface24
	    = (Interface24) class552.method12100(i, i_96_, i_97_, 1379169088);
	if (null != interface24)
	    bool &= Class508.method11512(interface24, -247504493);
	return bool;
    }
    
    static final void method5557(ClientScriptData class454, int i) {
	int i_99_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_99_, (byte) -31);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_99_ >> 16];
	RS3File.method7341(class58, class35, class454, 637643344);
    }
    
    static final void method5558(ClientScriptData class454, byte i) {
	int i_100_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_100_, (byte) -65);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.scrollMaxX * 1257300791;
    }
}
