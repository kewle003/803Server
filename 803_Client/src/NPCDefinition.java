/* Class401 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class NPCDefinition
{
    static final int anInt5798 = 6;
    public static final int anInt5799 = 8;
    public static short[] aShortArray5800 = new short[256];
    NPCDefinitionLoader loader;//aClass405_5801
    public int npcID;//anInt5802
    public String name = "null";//aString5803
    public static final int anInt5804 = 2;
    public int[] modelIDs;//anIntArray5805
    public short aShort5806;
    int[][] anIntArrayArray5807;
    public int anInt5808;
    public int anInt5809;
    public boolean aBool5810;
    byte[] aByteArray5811;
    short[] aShortArray5812;
    public short[] aShortArray5813;
    public byte[] aByteArray5814;
    public byte[] aByteArray5815;
    byte aByte5816;
    byte aByte5817;
    byte aByte5818;
    public int anInt5819;
    public String[] options;//aStringArray5820
    int[] anIntArray5821;
    public int anInt5822;
    public boolean visibleOnMap;//aBool5823
    public int combatLevel;//anInt5824
    public int anInt5825;
    int anInt5826;
    public int anInt5827;
    public boolean aBool5828;
    public int size = -904961849;//anInt5829
    int anInt5830;
    public boolean aBool5831;
    int anInt5832;
    public short[] aShortArray5833;
    public int anInt5834;
    public int headsIcon;//anInt5835
    public int[] transformTo;//anIntArray5836
    public int anInt5837;
    int anInt5838;
    public boolean aBool5839;
    public boolean aBool5840;
    public int[] anIntArray5841;
    int anInt5842;
    public short aShort5843;
    public short aShort5844;
    public byte aByte5845;
    public Class272 aClass272_5846;
    public byte aByte5847;
    public int renderEmote = 1943785791;//anInt5848
    public short[] aShortArray5849;
    public int anInt5850;
    int anInt5851;
    public int anInt5852;
    public boolean aBool5853;
    HashTable paramaters;//aClass407_5854
    byte aByte5855 = 0;
    public int anInt5856;
    public int anInt5857;
    public int anInt5858;
    public int anInt5859;
    public Class439 respawnDirection;//aClass439_5860
    public byte aByte5861;
    public int[] anIntArray5862;
    public byte aByte5863;
    short[] aShortArray5864;
    public boolean aBool5865;
    public int anInt5866;
    public byte walkMask;//aByte5867
    public int anInt5868;
    public int[] anIntArray5869;
    public static final int anInt5870 = 1;
    public boolean aBool5871;
    
    public int method7140(int i) {
	if (anIntArray5821 == null)
	    return -1;
	return anIntArray5821[i];
    }
    
    void read/*method7141*/(RSByteBuffer buffer, byte i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) 87);
		    if (opcode == 0) {
		    	break;
		    }
		    decode(buffer, opcode, (byte) 15);
		}
    }
    
    void decode/*method7142*/(RSByteBuffer buffer, int opcode, byte i_1_) {
		if (opcode == 1) {
		    int length = buffer.readUnsignedByte((byte) 0);
		    modelIDs = new int[length];
		    for (int index = 0; index < length; index++) {
		    	modelIDs[index] = buffer.readBigSmart((byte) -10);
		    }
		} else if (opcode == 2) {
		    name = buffer.readString(-1495167315);
		} else if (opcode == 12) {
		    size = buffer.readUnsignedByte((byte) 45) * -904961849;
		} else if (opcode >= 30 && opcode < 35) {
		    options[opcode - 30] = buffer.readString(-1231670098);
		} else if (opcode == 40) {
		    int length = buffer.readUnsignedByte((byte) 45);
		    aShortArray5864 = new short[length];
		    aShortArray5849 = new short[length];
		    for (int index = 0; index < length; index++) {
		    	aShortArray5864[index] = (short) buffer.readUnsignedShort(1162222719);
		    	aShortArray5849[index] = (short) buffer.readUnsignedShort(1162222719);
		    }
		} else if (opcode == 41) {
		    int length = buffer.readUnsignedByte((byte) -31);
		    aShortArray5812 = new short[length];
		    aShortArray5813 = new short[length];
		    for (int index = 0; index < length; index++) {
		    	aShortArray5812[index] = (short) buffer.readUnsignedShort(1162222719);
		    	aShortArray5813[index] = (short) buffer.readUnsignedShort(1162222719);
		    }
		} else if (42 == opcode) {
		    int length = buffer.readUnsignedByte((byte) -21);
		    aByteArray5811 = new byte[length];
		    for (int index = 0; index < length; index++) {
		    	aByteArray5811[index] = buffer.getByte(-2033516183);
		    }
		} else if (opcode == 44) {
		    int length = buffer.readUnsignedShort(1162222719);
		    int i_11_ = 0;
		    for (int index = length; index > 0; index >>= 1) {
		    	i_11_++;
		    }
		    aByteArray5814 = new byte[i_11_];
		    byte i_13_ = 0;
		    for (int index = 0; index < i_11_; index++) {
				if ((length & 1 << index) > 0) {
				    aByteArray5814[index] = i_13_;
				    i_13_++;
				} else {
				    aByteArray5814[index] = (byte) -1;
				}
		    }
		} else if (45 == opcode) {
		    int i_15_ = buffer.readUnsignedShort(1162222719);
		    int i_16_ = 0;
		    for (int i_17_ = i_15_; i_17_ > 0; i_17_ >>= 1)
			i_16_++;
		    aByteArray5815 = new byte[i_16_];
		    byte i_18_ = 0;
		    for (int i_19_ = 0; i_19_ < i_16_; i_19_++) {
			if ((i_15_ & 1 << i_19_) > 0) {
			    aByteArray5815[i_19_] = i_18_;
			    i_18_++;
			} else
			    aByteArray5815[i_19_] = (byte) -1;
		    }
		} else if (60 == opcode) {
		    int length = buffer.readUnsignedByte((byte) -33);
		    anIntArray5841 = new int[length];
		    for (int index = 0; index < length; index++) {
		    	anIntArray5841[index] = buffer.readBigSmart((byte) -2);
		    }
		} else if (93 == opcode) {
		    visibleOnMap = false;
		} else if (95 == opcode) {
		    combatLevel = buffer.readUnsignedShort(1162222719) * -1961946619;
		} else if (97 == opcode) {
		    anInt5832 = buffer.readUnsignedShort(1162222719) * 1505594765;
		} else if (98 == opcode) {
		    anInt5826 = buffer.readUnsignedShort(1162222719) * -1692046727;
		} else if (opcode == 99) {
		    aBool5810 = true;
		} else if (opcode == 100) {
		    anInt5830 = buffer.getByte(-323814986) * 1892243083;
		} else if (opcode == 101) {
		    anInt5851 = buffer.getByte(984002005) * -1772205267;
		} else if (102 == opcode) {
		    int i_22_ = buffer.readUnsignedByte((byte) 41);
		    int i_23_ = 0;
		    for (int i_24_ = i_22_; 0 != i_24_; i_24_ >>= 1)
			i_23_++;
		    anIntArray5869 = new int[i_23_];
		    aShortArray5833 = new short[i_23_];
		    for (int i_25_ = 0; i_25_ < i_23_; i_25_++) {
			if ((i_22_ & 1 << i_25_) == 0) {
			    anIntArray5869[i_25_] = -1;
			    aShortArray5833[i_25_] = (short) -1;
			} else {
			    anIntArray5869[i_25_] = buffer.readBigSmart((byte) -22);
			    aShortArray5833[i_25_] = (short) buffer.method14638(-764586933);
			}
		    }
		} else if (opcode == 103) {
		    headsIcon = buffer.readUnsignedShort(1162222719) * 194505197;
		} else if (106 == opcode || 118 == opcode) {
		    anInt5842 = buffer.readUnsignedShort(1162222719) * 185589877;
		    if (anInt5842 * 637988829 == 65535) {
		    	anInt5842 = -185589877;
		    }
		    anInt5838 = buffer.readUnsignedShort(1162222719) * -938510031;
		    if (anInt5838 * 1115373521 == 65535) {
		    	anInt5838 = 938510031;
		    }
		    int i_26_ = -1;
		    if (opcode == 118) {
				i_26_ = buffer.readUnsignedShort(1162222719);
				if (i_26_ == 65535) {
				    i_26_ = -1;
				}
		    }
		    int i_27_ = buffer.readUnsignedByte((byte) 41);
		    transformTo = new int[i_27_ + 2];
		    for (int i_28_ = 0; i_28_ <= i_27_; i_28_++) {
				transformTo[i_28_] = buffer.readUnsignedShort(1162222719);
				if (transformTo[i_28_] == 65535) {
				    transformTo[i_28_] = -1;
				}
		    }
		    transformTo[1 + i_27_] = i_26_;
		} else if (opcode == 107) {
		    aBool5839 = false;
		} else if (109 == opcode) {
		    aBool5840 = false;
		} else if (opcode == 111) {
		    aBool5831 = false;
		} else if (opcode == 113) {
		    aShort5844 = (short) buffer.readUnsignedShort(1162222719);
		    aShort5843 = (short) buffer.readUnsignedShort(1162222719);
		} else if (opcode == 114) {
		    aByte5861 = buffer.getByte(1277060408);
		    aByte5845 = buffer.getByte(583859599);
		} else if (119 == opcode) {
		    walkMask = buffer.getByte(-1481711944);
		} else if (opcode == 121) {
		    anIntArrayArray5807 = new int[modelIDs.length][];
		    int i_29_ = buffer.readUnsignedByte((byte) -47);
		    for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
				int i_31_ = buffer.readUnsignedByte((byte) 75);
				int[] is = (anIntArrayArray5807[i_31_] = new int[3]);
				is[0] = buffer.getByte(186380641);
				is[1] = buffer.getByte(289534054);
				is[2] = buffer.getByte(1395175333);
		    }
		} else if (123 == opcode) {
		    anInt5859 = buffer.readUnsignedShort(1162222719) * -2085084669;
		} else if (125 == opcode) {
		    respawnDirection = ((Class439) Class531.method11848(
		    		Class303.method5853(1854594721),
		    		buffer.getByte(1100709720),
		    		-93122459));
		} else if (opcode == 127) {
		    renderEmote = buffer.readUnsignedShort(1162222719) * -1943785791;
		} else if (128 == opcode) {
		    Class531.method11848(
		    		Class84.method1836(-2079094956),
		    		buffer.readUnsignedByte((byte) 31),
		    		1658822168);
		} else if (134 == opcode) {
		    anInt5819 = buffer.readUnsignedShort(1162222719) * 1967521943;
		    if (65535 == 1319993127 * anInt5819) {
		    	anInt5819 = -1967521943;
		    }
		    anInt5852 = buffer.readUnsignedShort(1162222719) * 1621971823;
		    if (65535 == -199136369 * anInt5852) {
		    	anInt5852 = -1621971823;
		    }
		    anInt5808 = buffer.readUnsignedShort(1162222719) * 1512657805;
		    if (anInt5808 * -97900731 == 65535) {
		    	anInt5808 = -1512657805;
		    }
		    anInt5858 = buffer.readUnsignedShort(1162222719) * -1399212831;
		    if (-1561948383 * anInt5858 == 65535) {
		    	anInt5858 = 1399212831;
		    }
		    anInt5866 = buffer.readUnsignedByte((byte) 58) * -1700386903;
		} else if (opcode == 135 || opcode == 136) {
		    buffer.readUnsignedByte((byte) 56);
		    buffer.readUnsignedShort(1162222719);
		} else if (137 == opcode) {
		    anInt5822 = buffer.readUnsignedShort(1162222719) * -103989641;
		} else if (138 == opcode) {
		    anInt5834 = buffer.readBigSmart((byte) 52) * -1033010485;
		} else if (opcode == 140) {
		    anInt5857 = buffer.readUnsignedByte((byte) 0) * -563515889;
		} else if (141 == opcode) {
		    aBool5865 = true;
		} else if (opcode == 142) {
		    anInt5837 = buffer.readUnsignedShort(1162222719) * -789878303;
		} else if (143 == opcode) {
		    aBool5828 = true;
		} else if (opcode >= 150 && opcode < 155) {
		    options[opcode - 150] = buffer.readString(1025143814);
		    if (!loader.onMembersServer) {
		    	options[opcode - 150] = null;
		    }
		} else if (opcode == 155) {
		    aByte5816 = buffer.getByte(-666930354);
		    aByte5817 = buffer.getByte(-1873323603);
		    aByte5818 = buffer.getByte(-1435448936);
		    aByte5855 = buffer.getByte(-694178764);
		} else if (158 == opcode) {
		    aByte5863 = (byte) 1;
		} else if (opcode == 159) {
		    aByte5863 = (byte) 0;
		} else if (160 == opcode) {
		    int length = buffer.readUnsignedByte((byte) 94);
		    anIntArray5862 = new int[length];
		    for (int index = 0; index < length; index++) {
		    	anIntArray5862[index] = buffer.readUnsignedShort(1162222719);
		    }
		} else if (opcode != 162) {
		    if (163 == opcode) {
		    	anInt5827 = buffer.readUnsignedByte((byte) -25) * 1964661437;
		    } else if (164 == opcode) {
				anInt5850 = buffer.readUnsignedShort(1162222719) * -61624931;
				anInt5825 = buffer.readUnsignedShort(1162222719) * 1556973699;
		    } else if (opcode == 165) {
		    	anInt5868 = buffer.readUnsignedByte((byte) 21) * -153810237;
		    } else if (opcode == 168) {
		    	anInt5856 = buffer.readUnsignedByte((byte) -115) * 83712151;
		    } else if (opcode == 169) {
		    	aBool5853 = false;
		    } else if (opcode >= 170 && opcode < 176) {
				if (null == anIntArray5821) {
				    anIntArray5821 = new int[6];
				    Arrays.fill(anIntArray5821, -1);
				}
				int i_34_ = buffer.readUnsignedShort(1162222719);
				if (i_34_ == 65535) {
				    i_34_ = -1;
				}
				anIntArray5821[opcode - 170] = i_34_;
		    } else if (opcode != 178) {
				if (179 == opcode) {
				    aClass272_5846 = new Class272();
				    aClass272_5846.aFloat4367 = (float) buffer.readSmart49152(-1030313300);
				    aClass272_5846.aFloat4363 = (float) buffer.readSmart49152(-885908998);
				    aClass272_5846.aFloat4365 = (float) buffer.readSmart49152(1458927304);
				    aClass272_5846.aFloat4366 = (float) buffer.readSmart49152(721138811);
				    aClass272_5846.aFloat4364 = (float) buffer.readSmart49152(-961713867);
				    aClass272_5846.aFloat4368 = (float) buffer.readSmart49152(322183426);
				} else if (opcode == 180) {
				    anInt5809 = ((buffer.readUnsignedByte((byte) -1) & 0xff) * 1432756099);
				} else if (opcode == 181) {
				    aShort5806 = (short) buffer.readUnsignedShort(1162222719);
				    aByte5847 = (byte) buffer.readUnsignedByte((byte) -66);
				} else if (182 == opcode) {
				    aBool5871 = true;
				} else if (249 == opcode) {
				    int length = buffer.readUnsignedByte((byte) 14);
				    if (null == paramaters) {
						int i_36_ = Class480.method11001(length, (byte) 6);
						paramaters = new HashTable(i_36_);
				    }
				    for (int index = 0; index < length; index++) {
				    	boolean stringInstance = buffer.readUnsignedByte((byte) 19) == 1;
						int key = buffer.readTriByte(1771646547);
						Node value;
						if (stringInstance) {
							value = new ObjectNode(buffer.readString(-307348137));
						} else {
							value = new IntegerNode(buffer.readInt((byte) 55));
						}
						paramaters.put(value, (long) key);
				    }
				}
		    }
		}
    }
    
    public int method7143(int i) {
	if (anIntArray5821 == null)
	    return -1;
	return anIntArray5821[i];
    }
    
    public final Class89 method7144
	(Class103 class103, int i, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class404 class404) {
	if (null != transformTo) {
	    NPCDefinition class401_39_
		= method7176(interface13, interface11, (byte) 77);
	    if (null == class401_39_)
		return null;
	    return class401_39_.method7146(class103, i, interface13,
					   interface11, class409, class404,
					   (byte) 0);
	}
	if (anIntArray5841 == null
	    && (null == class404 || null == class404.anIntArray5879))
	    return null;
	int i_40_ = i;
	if (null != class409)
	    i_40_ |= class409.method7356(-144634909);
	long l = (long) (721052173 * npcID
			 | 1931687493 * class103.anInt1456 << 16);
	if (class404 != null)
	    l |= -8081736523608850807L * class404.aLong5882 << 24;
	Class89 class89;
	synchronized (((NPCDefinitionLoader) loader)
		      .aClass129_5888) {
	    class89 = (Class89) ((NPCDefinitionLoader) loader)
				    .aClass129_5888.get(l);
	}
	if (class89 == null || (class89.method1866() & i_40_) != i_40_) {
	    if (null != class89)
		i_40_ |= class89.method1866();
	    int i_41_ = i_40_;
	    if (null != aShortArray5864)
		i_41_ |= 0x4000;
	    if (aShortArray5812 != null)
		i_41_ |= 0x8000;
	    if (aByte5855 != 0)
		i_41_ |= 0x80000;
	    int[] is = (class404 != null && null != class404.anIntArray5879
			? class404.anIntArray5879 : anIntArray5841);
	    boolean bool = false;
	    synchronized (((NPCDefinitionLoader) loader)
			  .modelDefContainer) {
		for (int i_42_ = 0; i_42_ < is.length; i_42_++) {
		    if (!((NPCDefinitionLoader) loader)
			     .modelDefContainer
			     .method4188(is[i_42_], 0, -1009313829))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class161[] class161s = new Class161[is.length];
	    synchronized (((NPCDefinitionLoader) loader)
			  .modelDefContainer) {
		for (int i_43_ = 0; i_43_ < is.length; i_43_++)
		    class161s[i_43_]
			= Class161.method3448((((NPCDefinitionLoader) (((NPCDefinition) this)
							    .loader))
					       .modelDefContainer),
					      is[i_43_], 0);
	    }
	    for (int i_44_ = 0; i_44_ < is.length; i_44_++) {
		if (class161s[i_44_] != null
		    && class161s[i_44_].anInt1789 < 13)
		    class161s[i_44_].method3464(2);
	    }
	    Class161 class161;
	    if (class161s.length == 1)
		class161 = class161s[0];
	    else
		class161 = new Class161(class161s, class161s.length);
	    class89 = class103.method2356(class161, i_41_,
					  (1572144253
					   * (((NPCDefinitionLoader) (((NPCDefinition) this)
							   .loader))
					      .anInt5887)),
					  64, 768);
	    if (null != aShortArray5864) {
		short[] is_45_;
		if (class404 != null && null != class404.aShortArray5883)
		    is_45_ = class404.aShortArray5883;
		else
		    is_45_ = aShortArray5849;
		for (int i_46_ = 0;
		     i_46_ < aShortArray5864.length;
		     i_46_++) {
		    if (aByteArray5811 != null
			&& i_46_ < aByteArray5811.length)
			class89.method1908((aShortArray5864
					    [i_46_]),
					   aShortArray5800[(((NPCDefinition) this)
							    .aByteArray5811
							    [i_46_]) & 0xff]);
		    else
			class89.method1908((aShortArray5864
					    [i_46_]),
					   is_45_[i_46_]);
		}
	    }
	    if (null != aShortArray5812) {
		short[] is_47_;
		if (null != class404 && class404.aShortArray5884 != null)
		    is_47_ = class404.aShortArray5884;
		else
		    is_47_ = aShortArray5813;
		for (int i_48_ = 0;
		     i_48_ < aShortArray5812.length; i_48_++)
		    class89.method1985((aShortArray5812
					[i_48_]),
				       is_47_[i_48_]);
	    }
	    if (aByte5855 != 0)
		class89.method1911(aByte5816,
				   aByte5817,
				   aByte5818,
				   aByte5855 & 0xff);
	    class89.method1928(i_40_);
	    synchronized (((NPCDefinitionLoader) loader)
			  .aClass129_5888) {
		((NPCDefinitionLoader) loader)
		    .aClass129_5888.put(class89, l);
	    }
	}
	if (null != class409) {
	    class89 = class89.method2019((byte) 1, i_40_, true);
	    class409.method7357(class89, 0, (byte) -5);
	}
	class89.method1928(i);
	return class89;
    }
    
    public final Class89 method7145
	(Class103 class103, int i, Class539 class539, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class409 class409_49_,
	 Class409[] class409s, int[] is, int i_50_, Class404 class404,
	 int i_51_, boolean bool, int i_52_) {
	if (transformTo != null) {
	    NPCDefinition class401_53_
		= method7176(interface13, interface11, (byte) 105);
	    if (null == class401_53_)
		return null;
	    return class401_53_.method7145(class103, i, class539, interface13,
					   interface11, class409, class409_49_,
					   class409s, is, i_50_, class404,
					   i_51_, bool, 2108254229);
	}
	int i_54_ = i;
	if (128 != 1591795657 * anInt5826)
	    i_54_ |= 0x2;
	if (128 != anInt5832 * -625509051)
	    i_54_ |= 0x5;
	boolean bool_55_ = false;
	int i_56_ = null != class409s ? class409s.length : 0;
	for (int i_57_ = 0; i_57_ < i_56_; i_57_++) {
	    if (null != class409s[i_57_]) {
		i_54_ |= class409s[i_57_].method7356(-1029890119);
		bool_55_ = true;
	    }
	}
	if (class409 != null) {
	    i_54_ |= class409.method7356(-1255270268);
	    bool_55_ = true;
	}
	if (null != class409_49_) {
	    i_54_ |= class409_49_.method7356(-1098879305);
	    bool_55_ = true;
	}
	long l = (long) (721052173 * npcID
			 | 1931687493 * class103.anInt1456 << 16);
	if (null != class404)
	    l |= class404.aLong5882 * -8081736523608850807L << 24;
	Class89 class89;
	synchronized (((NPCDefinitionLoader) loader)
		      .aClass129_5893) {
	    class89 = (Class89) ((NPCDefinitionLoader) loader)
				    .aClass129_5893.get(l);
	}
	Class554 class554 = null;
	if (!bool && i_51_ != -1)
	    class554 = class539.method11908(i_51_, -2088958540);
	else if (1952014657 * renderEmote != -1)
	    class554
		= class539.method11908(1952014657 * renderEmote, -1488867423);
	if (null == class89 || (class89.method1866() & i_54_) != i_54_) {
	    if (class89 != null)
		i_54_ |= class89.method1866();
	    int i_58_ = i_54_;
	    if (aShortArray5864 != null)
		i_58_ |= 0x4000;
	    if (aShortArray5812 != null)
		i_58_ |= 0x8000;
	    if (aByte5855 != 0)
		i_58_ |= 0x80000;
	    int[] is_59_ = (null != class404 && class404.anIntArray5879 != null
			    ? class404.anIntArray5879 : modelIDs);
	    boolean bool_60_ = false;
	    synchronized (((NPCDefinitionLoader) loader)
			  .modelDefContainer) {
		for (int i_61_ = 0; i_61_ < is_59_.length; i_61_++) {
		    if (is_59_[i_61_] != -1
			&& !((NPCDefinitionLoader) loader)
				.modelDefContainer
				.method4188(is_59_[i_61_], 0, -918483175))
			bool_60_ = true;
		}
	    }
	    if (bool_60_)
		return null;
	    Class161[] class161s = new Class161[is_59_.length];
	    for (int i_62_ = 0; i_62_ < is_59_.length; i_62_++) {
		if (-1 != is_59_[i_62_]) {
		    synchronized (((NPCDefinitionLoader) loader)
				  .modelDefContainer) {
			class161s[i_62_]
			    = Class161.method3448((((NPCDefinitionLoader)
						    (((NPCDefinition) this)
						     .loader))
						   .modelDefContainer),
						  is_59_[i_62_], 0);
		    }
		    if (class161s[i_62_] != null) {
			if (class161s[i_62_].anInt1789 < 13)
			    class161s[i_62_].method3464(2);
			if (null != anIntArrayArray5807
			    && null != (anIntArrayArray5807
					[i_62_]))
			    class161s[i_62_].method3459((((NPCDefinition) this)
							 .anIntArrayArray5807
							 [i_62_][0]),
							(((NPCDefinition) this)
							 .anIntArrayArray5807
							 [i_62_][1]),
							(((NPCDefinition) this)
							 .anIntArrayArray5807
							 [i_62_][2]));
		    }
		}
	    }
	    if (class404 != null) {
		for (int i_63_ = 0; i_63_ < class161s.length; i_63_++) {
		    if (class161s[i_63_] != null) {
			if (null != ((Class404) class404).aFloatArray5880
			    && (((Class404) class404).aFloatArray5880[i_63_]
				!= 0.0F))
			    class161s[i_63_].method3494(((Class404) class404)
							.aFloatArray5880
							[i_63_]);
			if (null != ((Class404) class404).anIntArrayArray5878)
			    class161s[i_63_].method3489((((Class404) class404)
							 .anIntArrayArray5878
							 [i_63_][0]),
							(((Class404) class404)
							 .anIntArrayArray5878
							 [i_63_][1]),
							(((Class404) class404)
							 .anIntArrayArray5878
							 [i_63_][2]));
			if (null != ((Class404) class404).anIntArrayArray5881)
			    class161s[i_63_].method3459((((Class404) class404)
							 .anIntArrayArray5881
							 [i_63_][0]),
							(((Class404) class404)
							 .anIntArrayArray5881
							 [i_63_][1]),
							(((Class404) class404)
							 .anIntArrayArray5881
							 [i_63_][2]));
		    }
		}
	    }
	    if (null != class554 && null != class554.anIntArrayArray7231) {
		for (int i_64_ = 0;
		     i_64_ < class554.anIntArrayArray7231.length; i_64_++) {
		    if (i_64_ < class161s.length && class161s[i_64_] != null) {
			int i_65_ = 0;
			int i_66_ = 0;
			int i_67_ = 0;
			int i_68_ = 0;
			int i_69_ = 0;
			int i_70_ = 0;
			if (null != class554.anIntArrayArray7231[i_64_]) {
			    i_65_ = class554.anIntArrayArray7231[i_64_][0];
			    i_66_ = class554.anIntArrayArray7231[i_64_][1];
			    i_67_ = class554.anIntArrayArray7231[i_64_][2];
			    i_68_
				= class554.anIntArrayArray7231[i_64_][3] << 3;
			    i_69_
				= class554.anIntArrayArray7231[i_64_][4] << 3;
			    i_70_
				= class554.anIntArrayArray7231[i_64_][5] << 3;
			}
			if (0 != i_68_ || 0 != i_69_ || 0 != i_70_)
			    class161s[i_64_].method3489(i_68_, i_69_, i_70_);
			if (i_65_ != 0 || i_66_ != 0 || 0 != i_67_)
			    class161s[i_64_].method3459(i_65_, i_66_, i_67_);
		    }
		}
	    }
	    Class161 class161;
	    if (1 == class161s.length)
		class161 = class161s[0];
	    else
		class161 = new Class161(class161s, class161s.length);
	    class89
		= (class103.method2356
		   (class161, i_58_,
		    (((NPCDefinitionLoader) loader).anInt5887
		     * 1572144253),
		    341565731 * anInt5830 + 64,
		    2055483193 * anInt5851 + 850));
	    if (aShortArray5864 != null) {
		short[] is_71_;
		if (class404 != null && class404.aShortArray5883 != null)
		    is_71_ = class404.aShortArray5883;
		else
		    is_71_ = aShortArray5849;
		for (int i_72_ = 0;
		     i_72_ < aShortArray5864.length;
		     i_72_++) {
		    if (aByteArray5811 != null
			&& i_72_ < aByteArray5811.length)
			class89.method1908((aShortArray5864
					    [i_72_]),
					   aShortArray5800[(((NPCDefinition) this)
							    .aByteArray5811
							    [i_72_]) & 0xff]);
		    else
			class89.method1908((aShortArray5864
					    [i_72_]),
					   is_71_[i_72_]);
		}
	    }
	    if (null != aShortArray5812) {
		short[] is_73_;
		if (class404 != null && class404.aShortArray5884 != null)
		    is_73_ = class404.aShortArray5884;
		else
		    is_73_ = aShortArray5813;
		for (int i_74_ = 0;
		     i_74_ < aShortArray5812.length; i_74_++)
		    class89.method1985((aShortArray5812
					[i_74_]),
				       is_73_[i_74_]);
	    }
	    if (0 != aByte5855)
		class89.method1911(aByte5816,
				   aByte5817,
				   aByte5818,
				   aByte5855 & 0xff);
	    class89.method1922();
	    class89.method1928(i_54_);
	    synchronized (((NPCDefinitionLoader) loader)
			  .aClass129_5893) {
		((NPCDefinitionLoader) loader)
		    .aClass129_5893.put(class89, l);
	    }
	}
	Class89 class89_75_ = class89.method2019((byte) 4, i_54_, true);
	boolean bool_76_ = false;
	if (null != is) {
	    for (int i_77_ = 0; i_77_ < 12; i_77_++) {
		if (-1 != is[i_77_])
		    bool_76_ = true;
	    }
	}
	if (!bool_55_ && !bool_76_)
	    return class89_75_;
	Class266[] class266s = null;
	if (null != class554)
	    class266s = class554.method12258((byte) -5);
	if (bool_76_ && null != class266s) {
	    for (int i_78_ = 0; i_78_ < 12; i_78_++) {
		if (null != class266s[i_78_])
		    class89_75_.method1857(class266s[i_78_], 1 << i_78_, true);
	    }
	}
	int i_79_ = 0;
	int i_80_ = 1;
	while (i_79_ < i_56_) {
	    if (class409s[i_79_] != null)
		class409s[i_79_].method7358(class89_75_, 0, i_80_,
					    -1381991262);
	    i_79_++;
	    i_80_ <<= 1;
	}
	if (bool_76_) {
	    for (i_79_ = 0; i_79_ < 12; i_79_++) {
		if (is[i_79_] != -1) {
		    i_80_ = is[i_79_] - i_50_;
		    i_80_ &= 0x3fff;
		    Class266 class266 = new Class266();
		    class266.method5125(0.0F, 1.0F, 0.0F,
					Class282.method5490(i_80_));
		    class89_75_.method1857(class266, 1 << i_79_, false);
		}
	    }
	}
	if (bool_76_ && null != class266s) {
	    for (i_79_ = 0; i_79_ < 12; i_79_++) {
		if (class266s[i_79_] != null)
		    class89_75_.method1857(class266s[i_79_], 1 << i_79_,
					   false);
	    }
	}
	if (class409 != null && class409_49_ != null)
	    Class117.method2931(class89_75_, class409, class409_49_,
				-1882461106);
	else if (null != class409)
	    class409.method7357(class89_75_, 0, (byte) -88);
	else if (null != class409_49_)
	    class409_49_.method7357(class89_75_, 0, (byte) -128);
	if (128 != -625509051 * anInt5832
	    || 128 != anInt5826 * 1591795657)
	    class89_75_.method1863(anInt5832 * -625509051,
				   anInt5826 * 1591795657,
				   anInt5832 * -625509051);
	class89_75_.method1928(i);
	return class89_75_;
    }
    
    public final Class89 method7146(Class103 class103, int i,
				    Interface13 interface13,
				    Interface11 interface11, Class409 class409,
				    Class404 class404, byte i_81_) {
	if (null != transformTo) {
	    NPCDefinition class401_82_
		= method7176(interface13, interface11, (byte) 122);
	    if (null == class401_82_)
		return null;
	    return class401_82_.method7146(class103, i, interface13,
					   interface11, class409, class404,
					   (byte) 0);
	}
	if (anIntArray5841 == null
	    && (null == class404 || null == class404.anIntArray5879))
	    return null;
	int i_83_ = i;
	if (null != class409)
	    i_83_ |= class409.method7356(1895550109);
	long l = (long) (721052173 * npcID
			 | 1931687493 * class103.anInt1456 << 16);
	if (class404 != null)
	    l |= -8081736523608850807L * class404.aLong5882 << 24;
	Class89 class89;
	synchronized (((NPCDefinitionLoader) loader)
		      .aClass129_5888) {
	    class89 = (Class89) ((NPCDefinitionLoader) loader)
				    .aClass129_5888.get(l);
	}
	if (class89 == null || (class89.method1866() & i_83_) != i_83_) {
	    if (null != class89)
		i_83_ |= class89.method1866();
	    int i_84_ = i_83_;
	    if (null != aShortArray5864)
		i_84_ |= 0x4000;
	    if (aShortArray5812 != null)
		i_84_ |= 0x8000;
	    if (aByte5855 != 0)
		i_84_ |= 0x80000;
	    int[] is = (class404 != null && null != class404.anIntArray5879
			? class404.anIntArray5879 : anIntArray5841);
	    boolean bool = false;
	    synchronized (((NPCDefinitionLoader) loader)
			  .modelDefContainer) {
		for (int i_85_ = 0; i_85_ < is.length; i_85_++) {
		    if (!((NPCDefinitionLoader) loader)
			     .modelDefContainer
			     .method4188(is[i_85_], 0, -2102409089))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class161[] class161s = new Class161[is.length];
	    synchronized (((NPCDefinitionLoader) loader)
			  .modelDefContainer) {
		for (int i_86_ = 0; i_86_ < is.length; i_86_++)
		    class161s[i_86_]
			= Class161.method3448((((NPCDefinitionLoader) (((NPCDefinition) this)
							    .loader))
					       .modelDefContainer),
					      is[i_86_], 0);
	    }
	    for (int i_87_ = 0; i_87_ < is.length; i_87_++) {
		if (class161s[i_87_] != null
		    && class161s[i_87_].anInt1789 < 13)
		    class161s[i_87_].method3464(2);
	    }
	    Class161 class161;
	    if (class161s.length == 1)
		class161 = class161s[0];
	    else
		class161 = new Class161(class161s, class161s.length);
	    class89 = class103.method2356(class161, i_84_,
					  (1572144253
					   * (((NPCDefinitionLoader) (((NPCDefinition) this)
							   .loader))
					      .anInt5887)),
					  64, 768);
	    if (null != aShortArray5864) {
		short[] is_88_;
		if (class404 != null && null != class404.aShortArray5883)
		    is_88_ = class404.aShortArray5883;
		else
		    is_88_ = aShortArray5849;
		for (int i_89_ = 0;
		     i_89_ < aShortArray5864.length;
		     i_89_++) {
		    if (aByteArray5811 != null
			&& i_89_ < aByteArray5811.length)
			class89.method1908((aShortArray5864
					    [i_89_]),
					   aShortArray5800[(((NPCDefinition) this)
							    .aByteArray5811
							    [i_89_]) & 0xff]);
		    else
			class89.method1908((aShortArray5864
					    [i_89_]),
					   is_88_[i_89_]);
		}
	    }
	    if (null != aShortArray5812) {
		short[] is_90_;
		if (null != class404 && class404.aShortArray5884 != null)
		    is_90_ = class404.aShortArray5884;
		else
		    is_90_ = aShortArray5813;
		for (int i_91_ = 0;
		     i_91_ < aShortArray5812.length; i_91_++)
		    class89.method1985((aShortArray5812
					[i_91_]),
				       is_90_[i_91_]);
	    }
	    if (aByte5855 != 0)
		class89.method1911(aByte5816,
				   aByte5817,
				   aByte5818,
				   aByte5855 & 0xff);
	    class89.method1928(i_83_);
	    synchronized (((NPCDefinitionLoader) loader)
			  .aClass129_5888) {
		((NPCDefinitionLoader) loader)
		    .aClass129_5888.put(class89, l);
	    }
	}
	if (null != class409) {
	    class89 = class89.method2019((byte) 1, i_83_, true);
	    class409.method7357(class89, 0, (byte) -28);
	}
	class89.method1928(i);
	return class89;
    }
    
    public final boolean method7147(int i) {
	if (modelIDs == null)
	    return true;
	boolean bool = true;
	int[] is = modelIDs;
	for (int i_92_ = 0; i_92_ < is.length; i_92_++) {
	    int i_93_ = is[i_92_];
	    if (!((NPCDefinitionLoader) loader)
		     .modelDefContainer.method4188(i_93_, 0, -1606021593))
		bool = false;
	}
	return bool;
    }
    
    public int method7148(int i, int i_94_, byte i_95_) {
	if (null == paramaters)
	    return i_94_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       paramaters.get((long) i));
	if (class241_sub22 == null)
	    return i_94_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public String method7149(int i, String string, byte i_96_) {
	if (paramaters == null)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       paramaters.get((long) i));
	if (null == class241_sub26)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    public final Class89 method7150
	(Class103 class103, int i, Class539 class539, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class409 class409_97_,
	 Class409[] class409s, int[] is, int i_98_, Class404 class404,
	 int i_99_, boolean bool) {
	if (transformTo != null) {
	    NPCDefinition class401_100_
		= method7176(interface13, interface11, (byte) 5);
	    if (null == class401_100_)
		return null;
	    return class401_100_.method7145(class103, i, class539, interface13,
					    interface11, class409,
					    class409_97_, class409s, is, i_98_,
					    class404, i_99_, bool, 2003655381);
	}
	int i_101_ = i;
	if (128 != 1591795657 * anInt5826)
	    i_101_ |= 0x2;
	if (128 != anInt5832 * -625509051)
	    i_101_ |= 0x5;
	boolean bool_102_ = false;
	int i_103_ = null != class409s ? class409s.length : 0;
	for (int i_104_ = 0; i_104_ < i_103_; i_104_++) {
	    if (null != class409s[i_104_]) {
		i_101_ |= class409s[i_104_].method7356(487290346);
		bool_102_ = true;
	    }
	}
	if (class409 != null) {
	    i_101_ |= class409.method7356(49081755);
	    bool_102_ = true;
	}
	if (null != class409_97_) {
	    i_101_ |= class409_97_.method7356(-83563979);
	    bool_102_ = true;
	}
	long l = (long) (721052173 * npcID
			 | 1931687493 * class103.anInt1456 << 16);
	if (null != class404)
	    l |= class404.aLong5882 * -8081736523608850807L << 24;
	Class89 class89;
	synchronized (((NPCDefinitionLoader) loader)
		      .aClass129_5893) {
	    class89 = (Class89) ((NPCDefinitionLoader) loader)
				    .aClass129_5893.get(l);
	}
	Class554 class554 = null;
	if (!bool && i_99_ != -1)
	    class554 = class539.method11908(i_99_, -2056279066);
	else if (1952014657 * renderEmote != -1)
	    class554
		= class539.method11908(1952014657 * renderEmote, -409477747);
	if (null == class89 || (class89.method1866() & i_101_) != i_101_) {
	    if (class89 != null)
		i_101_ |= class89.method1866();
	    int i_105_ = i_101_;
	    if (aShortArray5864 != null)
		i_105_ |= 0x4000;
	    if (aShortArray5812 != null)
		i_105_ |= 0x8000;
	    if (aByte5855 != 0)
		i_105_ |= 0x80000;
	    int[] is_106_
		= (null != class404 && class404.anIntArray5879 != null
		   ? class404.anIntArray5879 : modelIDs);
	    boolean bool_107_ = false;
	    synchronized (((NPCDefinitionLoader) loader)
			  .modelDefContainer) {
		for (int i_108_ = 0; i_108_ < is_106_.length; i_108_++) {
		    if (is_106_[i_108_] != -1
			&& !((NPCDefinitionLoader) loader)
				.modelDefContainer
				.method4188(is_106_[i_108_], 0, -538867566))
			bool_107_ = true;
		}
	    }
	    if (bool_107_)
		return null;
	    Class161[] class161s = new Class161[is_106_.length];
	    for (int i_109_ = 0; i_109_ < is_106_.length; i_109_++) {
		if (-1 != is_106_[i_109_]) {
		    synchronized (((NPCDefinitionLoader) loader)
				  .modelDefContainer) {
			class161s[i_109_]
			    = Class161.method3448((((NPCDefinitionLoader)
						    (((NPCDefinition) this)
						     .loader))
						   .modelDefContainer),
						  is_106_[i_109_], 0);
		    }
		    if (class161s[i_109_] != null) {
			if (class161s[i_109_].anInt1789 < 13)
			    class161s[i_109_].method3464(2);
			if (null != anIntArrayArray5807
			    && null != (anIntArrayArray5807
					[i_109_]))
			    class161s[i_109_].method3459((((NPCDefinition) this)
							  .anIntArrayArray5807
							  [i_109_][0]),
							 (((NPCDefinition) this)
							  .anIntArrayArray5807
							  [i_109_][1]),
							 (((NPCDefinition) this)
							  .anIntArrayArray5807
							  [i_109_][2]));
		    }
		}
	    }
	    if (class404 != null) {
		for (int i_110_ = 0; i_110_ < class161s.length; i_110_++) {
		    if (class161s[i_110_] != null) {
			if (null != ((Class404) class404).aFloatArray5880
			    && (((Class404) class404).aFloatArray5880[i_110_]
				!= 0.0F))
			    class161s[i_110_].method3494(((Class404) class404)
							 .aFloatArray5880
							 [i_110_]);
			if (null != ((Class404) class404).anIntArrayArray5878)
			    class161s[i_110_].method3489((((Class404) class404)
							  .anIntArrayArray5878
							  [i_110_][0]),
							 (((Class404) class404)
							  .anIntArrayArray5878
							  [i_110_][1]),
							 (((Class404) class404)
							  .anIntArrayArray5878
							  [i_110_][2]));
			if (null != ((Class404) class404).anIntArrayArray5881)
			    class161s[i_110_].method3459((((Class404) class404)
							  .anIntArrayArray5881
							  [i_110_][0]),
							 (((Class404) class404)
							  .anIntArrayArray5881
							  [i_110_][1]),
							 (((Class404) class404)
							  .anIntArrayArray5881
							  [i_110_][2]));
		    }
		}
	    }
	    if (null != class554 && null != class554.anIntArrayArray7231) {
		for (int i_111_ = 0;
		     i_111_ < class554.anIntArrayArray7231.length; i_111_++) {
		    if (i_111_ < class161s.length
			&& class161s[i_111_] != null) {
			int i_112_ = 0;
			int i_113_ = 0;
			int i_114_ = 0;
			int i_115_ = 0;
			int i_116_ = 0;
			int i_117_ = 0;
			if (null != class554.anIntArrayArray7231[i_111_]) {
			    i_112_ = class554.anIntArrayArray7231[i_111_][0];
			    i_113_ = class554.anIntArrayArray7231[i_111_][1];
			    i_114_ = class554.anIntArrayArray7231[i_111_][2];
			    i_115_
				= class554.anIntArrayArray7231[i_111_][3] << 3;
			    i_116_
				= class554.anIntArrayArray7231[i_111_][4] << 3;
			    i_117_
				= class554.anIntArrayArray7231[i_111_][5] << 3;
			}
			if (0 != i_115_ || 0 != i_116_ || 0 != i_117_)
			    class161s[i_111_].method3489(i_115_, i_116_,
							 i_117_);
			if (i_112_ != 0 || i_113_ != 0 || 0 != i_114_)
			    class161s[i_111_].method3459(i_112_, i_113_,
							 i_114_);
		    }
		}
	    }
	    Class161 class161;
	    if (1 == class161s.length)
		class161 = class161s[0];
	    else
		class161 = new Class161(class161s, class161s.length);
	    class89
		= (class103.method2356
		   (class161, i_105_,
		    (((NPCDefinitionLoader) loader).anInt5887
		     * 1572144253),
		    341565731 * anInt5830 + 64,
		    2055483193 * anInt5851 + 850));
	    if (aShortArray5864 != null) {
		short[] is_118_;
		if (class404 != null && class404.aShortArray5883 != null)
		    is_118_ = class404.aShortArray5883;
		else
		    is_118_ = aShortArray5849;
		for (int i_119_ = 0;
		     i_119_ < aShortArray5864.length;
		     i_119_++) {
		    if (aByteArray5811 != null
			&& i_119_ < aByteArray5811.length)
			class89.method1908((aShortArray5864
					    [i_119_]),
					   aShortArray5800[(((NPCDefinition) this)
							    .aByteArray5811
							    [i_119_]) & 0xff]);
		    else
			class89.method1908((aShortArray5864
					    [i_119_]),
					   is_118_[i_119_]);
		}
	    }
	    if (null != aShortArray5812) {
		short[] is_120_;
		if (class404 != null && class404.aShortArray5884 != null)
		    is_120_ = class404.aShortArray5884;
		else
		    is_120_ = aShortArray5813;
		for (int i_121_ = 0;
		     i_121_ < aShortArray5812.length;
		     i_121_++)
		    class89.method1985((aShortArray5812
					[i_121_]),
				       is_120_[i_121_]);
	    }
	    if (0 != aByte5855)
		class89.method1911(aByte5816,
				   aByte5817,
				   aByte5818,
				   aByte5855 & 0xff);
	    class89.method1922();
	    class89.method1928(i_101_);
	    synchronized (((NPCDefinitionLoader) loader)
			  .aClass129_5893) {
		((NPCDefinitionLoader) loader)
		    .aClass129_5893.put(class89, l);
	    }
	}
	Class89 class89_122_ = class89.method2019((byte) 4, i_101_, true);
	boolean bool_123_ = false;
	if (null != is) {
	    for (int i_124_ = 0; i_124_ < 12; i_124_++) {
		if (-1 != is[i_124_])
		    bool_123_ = true;
	    }
	}
	if (!bool_102_ && !bool_123_)
	    return class89_122_;
	Class266[] class266s = null;
	if (null != class554)
	    class266s = class554.method12258((byte) -49);
	if (bool_123_ && null != class266s) {
	    for (int i_125_ = 0; i_125_ < 12; i_125_++) {
		if (null != class266s[i_125_])
		    class89_122_.method1857(class266s[i_125_], 1 << i_125_,
					    true);
	    }
	}
	int i_126_ = 0;
	int i_127_ = 1;
	while (i_126_ < i_103_) {
	    if (class409s[i_126_] != null)
		class409s[i_126_].method7358(class89_122_, 0, i_127_,
					     -255469976);
	    i_126_++;
	    i_127_ <<= 1;
	}
	if (bool_123_) {
	    for (i_126_ = 0; i_126_ < 12; i_126_++) {
		if (is[i_126_] != -1) {
		    i_127_ = is[i_126_] - i_98_;
		    i_127_ &= 0x3fff;
		    Class266 class266 = new Class266();
		    class266.method5125(0.0F, 1.0F, 0.0F,
					Class282.method5490(i_127_));
		    class89_122_.method1857(class266, 1 << i_126_, false);
		}
	    }
	}
	if (bool_123_ && null != class266s) {
	    for (i_126_ = 0; i_126_ < 12; i_126_++) {
		if (class266s[i_126_] != null)
		    class89_122_.method1857(class266s[i_126_], 1 << i_126_,
					    false);
	    }
	}
	if (class409 != null && class409_97_ != null)
	    Class117.method2931(class89_122_, class409, class409_97_,
				242998341);
	else if (null != class409)
	    class409.method7357(class89_122_, 0, (byte) -51);
	else if (null != class409_97_)
	    class409_97_.method7357(class89_122_, 0, (byte) -53);
	if (128 != -625509051 * anInt5832
	    || 128 != anInt5826 * 1591795657)
	    class89_122_.method1863(anInt5832 * -625509051,
				    anInt5826 * 1591795657,
				    anInt5832 * -625509051);
	class89_122_.method1928(i);
	return class89_122_;
    }
    
    public int method7151(int i, int i_128_) {
	if (null == paramaters)
	    return i_128_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       paramaters.get((long) i));
	if (class241_sub22 == null)
	    return i_128_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public boolean method7152(int i) {
	if (null == transformTo)
	    return (anInt5819 * 1319993127 != -1 || anInt5808 * -97900731 != -1
		    || -1 != anInt5858 * -1561948383);
	for (int i_129_ = 0; i_129_ < transformTo.length; i_129_++) {
	    if (transformTo[i_129_] != -1) {
		NPCDefinition class401_130_
		    = loader
			  .getNpcDefinition(transformTo[i_129_], -596466263);
		if (1319993127 * class401_130_.anInt5819 != -1
		    || -1 != class401_130_.anInt5808 * -97900731
		    || -1561948383 * class401_130_.anInt5858 != -1)
		    return true;
	    }
	}
	return false;
    }
    
    public int method7153(int i, byte i_131_) {
	if (anIntArray5821 == null)
	    return -1;
	return anIntArray5821[i];
    }
    
    public final Class89 method7154
	(Class103 class103, int i, Class539 class539, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class409 class409_132_,
	 Class409[] class409s, int[] is, int i_133_, Class404 class404) {
	return method7145(class103, i, class539, interface13, interface11,
			  class409, class409_132_, class409s, is, i_133_,
			  class404, renderEmote * 1952014657, true, 2020491852);
    }
    
    void method7155(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -15);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, (byte) 15);
	}
    }
    
    void method7156() {
	if (modelIDs == null)
	    modelIDs = new int[0];
	if (aByte5863 == -1) {
	    if (((NPCDefinitionLoader) loader).currentGame
		== GameDefinition.RUNESCAPE)
		aByte5863 = (byte) 1;
	    else
		aByte5863 = (byte) 0;
	}
    }
    
    void method7157() {
	if (modelIDs == null)
	    modelIDs = new int[0];
	if (aByte5863 == -1) {
	    if (((NPCDefinitionLoader) loader).currentGame
		== GameDefinition.RUNESCAPE)
		aByte5863 = (byte) 1;
	    else
		aByte5863 = (byte) 0;
	}
    }
    
    void method7158() {
	if (modelIDs == null)
	    modelIDs = new int[0];
	if (aByte5863 == -1) {
	    if (((NPCDefinitionLoader) loader).currentGame
		== GameDefinition.RUNESCAPE)
		aByte5863 = (byte) 1;
	    else
		aByte5863 = (byte) 0;
	}
    }
    
    public final Class89 method7159
	(Class103 class103, int i, Class539 class539, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class409 class409_134_,
	 Class409[] class409s, int[] is, int i_135_, Class404 class404) {
	return method7145(class103, i, class539, interface13, interface11,
			  class409, class409_134_, class409s, is, i_135_,
			  class404, renderEmote * 1952014657, true, 1872619985);
    }
    
    public final Class89 method7160
	(Class103 class103, int i, Class539 class539, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class409 class409_136_,
	 Class409[] class409s, int[] is, int i_137_, Class404 class404,
	 byte i_138_) {
	return method7145(class103, i, class539, interface13, interface11,
			  class409, class409_136_, class409s, is, i_137_,
			  class404, renderEmote * 1952014657, true, 1927748777);
    }
    
    void method7161(int i) {
	if (modelIDs == null)
	    modelIDs = new int[0];
	if (aByte5863 == -1) {
	    if (((NPCDefinitionLoader) loader).currentGame
		== GameDefinition.RUNESCAPE)
		aByte5863 = (byte) 1;
	    else
		aByte5863 = (byte) 0;
	}
    }
    
    public final Class89 method7162
	(Class103 class103, int i, Class539 class539, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class409 class409_139_,
	 Class409[] class409s, int[] is, int i_140_, Class404 class404) {
	return method7145(class103, i, class539, interface13, interface11,
			  class409, class409_139_, class409s, is, i_140_,
			  class404, renderEmote * 1952014657, true, 1836126932);
    }
    
    public final NPCDefinition method7163(Interface13 interface13,
				     Interface11 interface11) {
	int i = -1;
	if (-1 != 637988829 * anInt5842) {
	    VarBitType class316
		= interface13.method93(anInt5842 * 637988829,
				       1849174226);
	    if (null != class316)
		i = interface11.getVarBitValue(class316, (short) 23345);
	} else if (anInt5838 * 1115373521 != -1) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       (1115373521
					* anInt5838),
				       (byte) 93);
	    if (class179 != null)
		i = interface11.getVarValueInt(class179, -1195801469);
	}
	if (i < 0 || i >= transformTo.length - 1) {
	    int i_141_ = transformTo[transformTo.length - 1];
	    if (i_141_ != -1)
		return loader.getNpcDefinition(i_141_,
								   -831388392);
	    return null;
	}
	if (-1 == transformTo[i])
	    return null;
	return loader.getNpcDefinition(transformTo[i],
							   -966917951);
    }
    
    void method7164(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 7);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, (byte) 15);
	}
    }
    
    NPCDefinition() {
	anInt5822 = 103989641;
	visibleOnMap = true;
	combatLevel = 1961946619;
	anInt5832 = -557398400;
	anInt5826 = -1833616256;
	aBool5810 = false;
	aBool5828 = false;
	aBool5865 = false;
	anInt5830 = 0;
	anInt5851 = 0;
	anIntArray5869 = null;
	aShortArray5833 = null;
	anInt5834 = 1033010485;
	headsIcon = 1929199008;
	anInt5842 = -185589877;
	anInt5838 = 938510031;
	aBool5839 = true;
	aBool5840 = true;
	aBool5831 = true;
	aShort5844 = (short) 0;
	aShort5843 = (short) 0;
	aByte5861 = (byte) -96;
	aByte5845 = (byte) -16;
	aShort5806 = (short) -1;
	aByte5847 = (byte) 0;
	walkMask = (byte) 0;
	anInt5819 = -1967521943;
	anInt5852 = -1621971823;
	anInt5808 = -1512657805;
	anInt5858 = 1399212831;
	anInt5866 = 0;
	anInt5856 = 0;
	anInt5857 = -1962630927;
	anInt5859 = 2085084669;
	respawnDirection = Class439.aClass439_6144;
	anInt5837 = 789878303;
	aByte5863 = (byte) -1;
	anInt5827 = -1964661437;
	anInt5850 = 1403886848;
	anInt5825 = -846691584;
	anInt5868 = 0;
	aBool5853 = true;
	anInt5809 = 0;
	aBool5871 = false;
    }
    
    public final Class89 method7165
	(Class103 class103, int i, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class404 class404) {
	if (null != transformTo) {
	    NPCDefinition class401_142_
		= method7176(interface13, interface11, (byte) 99);
	    if (null == class401_142_)
		return null;
	    return class401_142_.method7146(class103, i, interface13,
					    interface11, class409, class404,
					    (byte) 0);
	}
	if (anIntArray5841 == null
	    && (null == class404 || null == class404.anIntArray5879))
	    return null;
	int i_143_ = i;
	if (null != class409)
	    i_143_ |= class409.method7356(-226260372);
	long l = (long) (721052173 * npcID
			 | 1931687493 * class103.anInt1456 << 16);
	if (class404 != null)
	    l |= -8081736523608850807L * class404.aLong5882 << 24;
	Class89 class89;
	synchronized (((NPCDefinitionLoader) loader)
		      .aClass129_5888) {
	    class89 = (Class89) ((NPCDefinitionLoader) loader)
				    .aClass129_5888.get(l);
	}
	if (class89 == null || (class89.method1866() & i_143_) != i_143_) {
	    if (null != class89)
		i_143_ |= class89.method1866();
	    int i_144_ = i_143_;
	    if (null != aShortArray5864)
		i_144_ |= 0x4000;
	    if (aShortArray5812 != null)
		i_144_ |= 0x8000;
	    if (aByte5855 != 0)
		i_144_ |= 0x80000;
	    int[] is = (class404 != null && null != class404.anIntArray5879
			? class404.anIntArray5879 : anIntArray5841);
	    boolean bool = false;
	    synchronized (((NPCDefinitionLoader) loader)
			  .modelDefContainer) {
		for (int i_145_ = 0; i_145_ < is.length; i_145_++) {
		    if (!((NPCDefinitionLoader) loader)
			     .modelDefContainer
			     .method4188(is[i_145_], 0, -2106811221))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class161[] class161s = new Class161[is.length];
	    synchronized (((NPCDefinitionLoader) loader)
			  .modelDefContainer) {
		for (int i_146_ = 0; i_146_ < is.length; i_146_++)
		    class161s[i_146_]
			= Class161.method3448((((NPCDefinitionLoader) (((NPCDefinition) this)
							    .loader))
					       .modelDefContainer),
					      is[i_146_], 0);
	    }
	    for (int i_147_ = 0; i_147_ < is.length; i_147_++) {
		if (class161s[i_147_] != null
		    && class161s[i_147_].anInt1789 < 13)
		    class161s[i_147_].method3464(2);
	    }
	    Class161 class161;
	    if (class161s.length == 1)
		class161 = class161s[0];
	    else
		class161 = new Class161(class161s, class161s.length);
	    class89 = class103.method2356(class161, i_144_,
					  (1572144253
					   * (((NPCDefinitionLoader) (((NPCDefinition) this)
							   .loader))
					      .anInt5887)),
					  64, 768);
	    if (null != aShortArray5864) {
		short[] is_148_;
		if (class404 != null && null != class404.aShortArray5883)
		    is_148_ = class404.aShortArray5883;
		else
		    is_148_ = aShortArray5849;
		for (int i_149_ = 0;
		     i_149_ < aShortArray5864.length;
		     i_149_++) {
		    if (aByteArray5811 != null
			&& i_149_ < aByteArray5811.length)
			class89.method1908((aShortArray5864
					    [i_149_]),
					   aShortArray5800[(((NPCDefinition) this)
							    .aByteArray5811
							    [i_149_]) & 0xff]);
		    else
			class89.method1908((aShortArray5864
					    [i_149_]),
					   is_148_[i_149_]);
		}
	    }
	    if (null != aShortArray5812) {
		short[] is_150_;
		if (null != class404 && class404.aShortArray5884 != null)
		    is_150_ = class404.aShortArray5884;
		else
		    is_150_ = aShortArray5813;
		for (int i_151_ = 0;
		     i_151_ < aShortArray5812.length;
		     i_151_++)
		    class89.method1985((aShortArray5812
					[i_151_]),
				       is_150_[i_151_]);
	    }
	    if (aByte5855 != 0)
		class89.method1911(aByte5816,
				   aByte5817,
				   aByte5818,
				   aByte5855 & 0xff);
	    class89.method1928(i_143_);
	    synchronized (((NPCDefinitionLoader) loader)
			  .aClass129_5888) {
		((NPCDefinitionLoader) loader)
		    .aClass129_5888.put(class89, l);
	    }
	}
	if (null != class409) {
	    class89 = class89.method2019((byte) 1, i_143_, true);
	    class409.method7357(class89, 0, (byte) -18);
	}
	class89.method1928(i);
	return class89;
    }
    
    public final Class89 method7166
	(Class103 class103, int i, Class539 class539, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class409 class409_152_,
	 Class409[] class409s, int[] is, int i_153_, Class404 class404,
	 int i_154_, boolean bool) {
	if (transformTo != null) {
	    NPCDefinition class401_155_
		= method7176(interface13, interface11, (byte) 97);
	    if (null == class401_155_)
		return null;
	    return class401_155_.method7145(class103, i, class539, interface13,
					    interface11, class409,
					    class409_152_, class409s, is,
					    i_153_, class404, i_154_, bool,
					    2115543889);
	}
	int i_156_ = i;
	if (128 != 1591795657 * anInt5826)
	    i_156_ |= 0x2;
	if (128 != anInt5832 * -625509051)
	    i_156_ |= 0x5;
	boolean bool_157_ = false;
	int i_158_ = null != class409s ? class409s.length : 0;
	for (int i_159_ = 0; i_159_ < i_158_; i_159_++) {
	    if (null != class409s[i_159_]) {
		i_156_ |= class409s[i_159_].method7356(1897745405);
		bool_157_ = true;
	    }
	}
	if (class409 != null) {
	    i_156_ |= class409.method7356(1807913078);
	    bool_157_ = true;
	}
	if (null != class409_152_) {
	    i_156_ |= class409_152_.method7356(2007508899);
	    bool_157_ = true;
	}
	long l = (long) (721052173 * npcID
			 | 1931687493 * class103.anInt1456 << 16);
	if (null != class404)
	    l |= class404.aLong5882 * -8081736523608850807L << 24;
	Class89 class89;
	synchronized (((NPCDefinitionLoader) loader)
		      .aClass129_5893) {
	    class89 = (Class89) ((NPCDefinitionLoader) loader)
				    .aClass129_5893.get(l);
	}
	Class554 class554 = null;
	if (!bool && i_154_ != -1)
	    class554 = class539.method11908(i_154_, -1393314513);
	else if (1952014657 * renderEmote != -1)
	    class554
		= class539.method11908(1952014657 * renderEmote, -372147688);
	if (null == class89 || (class89.method1866() & i_156_) != i_156_) {
	    if (class89 != null)
		i_156_ |= class89.method1866();
	    int i_160_ = i_156_;
	    if (aShortArray5864 != null)
		i_160_ |= 0x4000;
	    if (aShortArray5812 != null)
		i_160_ |= 0x8000;
	    if (aByte5855 != 0)
		i_160_ |= 0x80000;
	    int[] is_161_
		= (null != class404 && class404.anIntArray5879 != null
		   ? class404.anIntArray5879 : modelIDs);
	    boolean bool_162_ = false;
	    synchronized (((NPCDefinitionLoader) loader)
			  .modelDefContainer) {
		for (int i_163_ = 0; i_163_ < is_161_.length; i_163_++) {
		    if (is_161_[i_163_] != -1
			&& !((NPCDefinitionLoader) loader)
				.modelDefContainer
				.method4188(is_161_[i_163_], 0, -1912706728))
			bool_162_ = true;
		}
	    }
	    if (bool_162_)
		return null;
	    Class161[] class161s = new Class161[is_161_.length];
	    for (int i_164_ = 0; i_164_ < is_161_.length; i_164_++) {
		if (-1 != is_161_[i_164_]) {
		    synchronized (((NPCDefinitionLoader) loader)
				  .modelDefContainer) {
			class161s[i_164_]
			    = Class161.method3448((((NPCDefinitionLoader)
						    (((NPCDefinition) this)
						     .loader))
						   .modelDefContainer),
						  is_161_[i_164_], 0);
		    }
		    if (class161s[i_164_] != null) {
			if (class161s[i_164_].anInt1789 < 13)
			    class161s[i_164_].method3464(2);
			if (null != anIntArrayArray5807
			    && null != (anIntArrayArray5807
					[i_164_]))
			    class161s[i_164_].method3459((((NPCDefinition) this)
							  .anIntArrayArray5807
							  [i_164_][0]),
							 (((NPCDefinition) this)
							  .anIntArrayArray5807
							  [i_164_][1]),
							 (((NPCDefinition) this)
							  .anIntArrayArray5807
							  [i_164_][2]));
		    }
		}
	    }
	    if (class404 != null) {
		for (int i_165_ = 0; i_165_ < class161s.length; i_165_++) {
		    if (class161s[i_165_] != null) {
			if (null != ((Class404) class404).aFloatArray5880
			    && (((Class404) class404).aFloatArray5880[i_165_]
				!= 0.0F))
			    class161s[i_165_].method3494(((Class404) class404)
							 .aFloatArray5880
							 [i_165_]);
			if (null != ((Class404) class404).anIntArrayArray5878)
			    class161s[i_165_].method3489((((Class404) class404)
							  .anIntArrayArray5878
							  [i_165_][0]),
							 (((Class404) class404)
							  .anIntArrayArray5878
							  [i_165_][1]),
							 (((Class404) class404)
							  .anIntArrayArray5878
							  [i_165_][2]));
			if (null != ((Class404) class404).anIntArrayArray5881)
			    class161s[i_165_].method3459((((Class404) class404)
							  .anIntArrayArray5881
							  [i_165_][0]),
							 (((Class404) class404)
							  .anIntArrayArray5881
							  [i_165_][1]),
							 (((Class404) class404)
							  .anIntArrayArray5881
							  [i_165_][2]));
		    }
		}
	    }
	    if (null != class554 && null != class554.anIntArrayArray7231) {
		for (int i_166_ = 0;
		     i_166_ < class554.anIntArrayArray7231.length; i_166_++) {
		    if (i_166_ < class161s.length
			&& class161s[i_166_] != null) {
			int i_167_ = 0;
			int i_168_ = 0;
			int i_169_ = 0;
			int i_170_ = 0;
			int i_171_ = 0;
			int i_172_ = 0;
			if (null != class554.anIntArrayArray7231[i_166_]) {
			    i_167_ = class554.anIntArrayArray7231[i_166_][0];
			    i_168_ = class554.anIntArrayArray7231[i_166_][1];
			    i_169_ = class554.anIntArrayArray7231[i_166_][2];
			    i_170_
				= class554.anIntArrayArray7231[i_166_][3] << 3;
			    i_171_
				= class554.anIntArrayArray7231[i_166_][4] << 3;
			    i_172_
				= class554.anIntArrayArray7231[i_166_][5] << 3;
			}
			if (0 != i_170_ || 0 != i_171_ || 0 != i_172_)
			    class161s[i_166_].method3489(i_170_, i_171_,
							 i_172_);
			if (i_167_ != 0 || i_168_ != 0 || 0 != i_169_)
			    class161s[i_166_].method3459(i_167_, i_168_,
							 i_169_);
		    }
		}
	    }
	    Class161 class161;
	    if (1 == class161s.length)
		class161 = class161s[0];
	    else
		class161 = new Class161(class161s, class161s.length);
	    class89
		= (class103.method2356
		   (class161, i_160_,
		    (((NPCDefinitionLoader) loader).anInt5887
		     * 1572144253),
		    341565731 * anInt5830 + 64,
		    2055483193 * anInt5851 + 850));
	    if (aShortArray5864 != null) {
		short[] is_173_;
		if (class404 != null && class404.aShortArray5883 != null)
		    is_173_ = class404.aShortArray5883;
		else
		    is_173_ = aShortArray5849;
		for (int i_174_ = 0;
		     i_174_ < aShortArray5864.length;
		     i_174_++) {
		    if (aByteArray5811 != null
			&& i_174_ < aByteArray5811.length)
			class89.method1908((aShortArray5864
					    [i_174_]),
					   aShortArray5800[(((NPCDefinition) this)
							    .aByteArray5811
							    [i_174_]) & 0xff]);
		    else
			class89.method1908((aShortArray5864
					    [i_174_]),
					   is_173_[i_174_]);
		}
	    }
	    if (null != aShortArray5812) {
		short[] is_175_;
		if (class404 != null && class404.aShortArray5884 != null)
		    is_175_ = class404.aShortArray5884;
		else
		    is_175_ = aShortArray5813;
		for (int i_176_ = 0;
		     i_176_ < aShortArray5812.length;
		     i_176_++)
		    class89.method1985((aShortArray5812
					[i_176_]),
				       is_175_[i_176_]);
	    }
	    if (0 != aByte5855)
		class89.method1911(aByte5816,
				   aByte5817,
				   aByte5818,
				   aByte5855 & 0xff);
	    class89.method1922();
	    class89.method1928(i_156_);
	    synchronized (((NPCDefinitionLoader) loader)
			  .aClass129_5893) {
		((NPCDefinitionLoader) loader)
		    .aClass129_5893.put(class89, l);
	    }
	}
	Class89 class89_177_ = class89.method2019((byte) 4, i_156_, true);
	boolean bool_178_ = false;
	if (null != is) {
	    for (int i_179_ = 0; i_179_ < 12; i_179_++) {
		if (-1 != is[i_179_])
		    bool_178_ = true;
	    }
	}
	if (!bool_157_ && !bool_178_)
	    return class89_177_;
	Class266[] class266s = null;
	if (null != class554)
	    class266s = class554.method12258((byte) 21);
	if (bool_178_ && null != class266s) {
	    for (int i_180_ = 0; i_180_ < 12; i_180_++) {
		if (null != class266s[i_180_])
		    class89_177_.method1857(class266s[i_180_], 1 << i_180_,
					    true);
	    }
	}
	int i_181_ = 0;
	int i_182_ = 1;
	while (i_181_ < i_158_) {
	    if (class409s[i_181_] != null)
		class409s[i_181_].method7358(class89_177_, 0, i_182_,
					     -185193597);
	    i_181_++;
	    i_182_ <<= 1;
	}
	if (bool_178_) {
	    for (i_181_ = 0; i_181_ < 12; i_181_++) {
		if (is[i_181_] != -1) {
		    i_182_ = is[i_181_] - i_153_;
		    i_182_ &= 0x3fff;
		    Class266 class266 = new Class266();
		    class266.method5125(0.0F, 1.0F, 0.0F,
					Class282.method5490(i_182_));
		    class89_177_.method1857(class266, 1 << i_181_, false);
		}
	    }
	}
	if (bool_178_ && null != class266s) {
	    for (i_181_ = 0; i_181_ < 12; i_181_++) {
		if (class266s[i_181_] != null)
		    class89_177_.method1857(class266s[i_181_], 1 << i_181_,
					    false);
	    }
	}
	if (class409 != null && class409_152_ != null)
	    Class117.method2931(class89_177_, class409, class409_152_,
				-636742536);
	else if (null != class409)
	    class409.method7357(class89_177_, 0, (byte) -96);
	else if (null != class409_152_)
	    class409_152_.method7357(class89_177_, 0, (byte) -24);
	if (128 != -625509051 * anInt5832
	    || 128 != anInt5826 * 1591795657)
	    class89_177_.method1863(anInt5832 * -625509051,
				    anInt5826 * 1591795657,
				    anInt5832 * -625509051);
	class89_177_.method1928(i);
	return class89_177_;
    }
    
    public final Class89 method7167
	(Class103 class103, int i, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class404 class404) {
	if (null != transformTo) {
	    NPCDefinition class401_183_
		= method7176(interface13, interface11, (byte) 35);
	    if (null == class401_183_)
		return null;
	    return class401_183_.method7146(class103, i, interface13,
					    interface11, class409, class404,
					    (byte) 0);
	}
	if (anIntArray5841 == null
	    && (null == class404 || null == class404.anIntArray5879))
	    return null;
	int i_184_ = i;
	if (null != class409)
	    i_184_ |= class409.method7356(866001015);
	long l = (long) (721052173 * npcID
			 | 1931687493 * class103.anInt1456 << 16);
	if (class404 != null)
	    l |= -8081736523608850807L * class404.aLong5882 << 24;
	Class89 class89;
	synchronized (((NPCDefinitionLoader) loader)
		      .aClass129_5888) {
	    class89 = (Class89) ((NPCDefinitionLoader) loader)
				    .aClass129_5888.get(l);
	}
	if (class89 == null || (class89.method1866() & i_184_) != i_184_) {
	    if (null != class89)
		i_184_ |= class89.method1866();
	    int i_185_ = i_184_;
	    if (null != aShortArray5864)
		i_185_ |= 0x4000;
	    if (aShortArray5812 != null)
		i_185_ |= 0x8000;
	    if (aByte5855 != 0)
		i_185_ |= 0x80000;
	    int[] is = (class404 != null && null != class404.anIntArray5879
			? class404.anIntArray5879 : anIntArray5841);
	    boolean bool = false;
	    synchronized (((NPCDefinitionLoader) loader)
			  .modelDefContainer) {
		for (int i_186_ = 0; i_186_ < is.length; i_186_++) {
		    if (!((NPCDefinitionLoader) loader)
			     .modelDefContainer
			     .method4188(is[i_186_], 0, -546824630))
			bool = true;
		}
	    }
	    if (bool)
		return null;
	    Class161[] class161s = new Class161[is.length];
	    synchronized (((NPCDefinitionLoader) loader)
			  .modelDefContainer) {
		for (int i_187_ = 0; i_187_ < is.length; i_187_++)
		    class161s[i_187_]
			= Class161.method3448((((NPCDefinitionLoader) (((NPCDefinition) this)
							    .loader))
					       .modelDefContainer),
					      is[i_187_], 0);
	    }
	    for (int i_188_ = 0; i_188_ < is.length; i_188_++) {
		if (class161s[i_188_] != null
		    && class161s[i_188_].anInt1789 < 13)
		    class161s[i_188_].method3464(2);
	    }
	    Class161 class161;
	    if (class161s.length == 1)
		class161 = class161s[0];
	    else
		class161 = new Class161(class161s, class161s.length);
	    class89 = class103.method2356(class161, i_185_,
					  (1572144253
					   * (((NPCDefinitionLoader) (((NPCDefinition) this)
							   .loader))
					      .anInt5887)),
					  64, 768);
	    if (null != aShortArray5864) {
		short[] is_189_;
		if (class404 != null && null != class404.aShortArray5883)
		    is_189_ = class404.aShortArray5883;
		else
		    is_189_ = aShortArray5849;
		for (int i_190_ = 0;
		     i_190_ < aShortArray5864.length;
		     i_190_++) {
		    if (aByteArray5811 != null
			&& i_190_ < aByteArray5811.length)
			class89.method1908((aShortArray5864
					    [i_190_]),
					   aShortArray5800[(((NPCDefinition) this)
							    .aByteArray5811
							    [i_190_]) & 0xff]);
		    else
			class89.method1908((aShortArray5864
					    [i_190_]),
					   is_189_[i_190_]);
		}
	    }
	    if (null != aShortArray5812) {
		short[] is_191_;
		if (null != class404 && class404.aShortArray5884 != null)
		    is_191_ = class404.aShortArray5884;
		else
		    is_191_ = aShortArray5813;
		for (int i_192_ = 0;
		     i_192_ < aShortArray5812.length;
		     i_192_++)
		    class89.method1985((aShortArray5812
					[i_192_]),
				       is_191_[i_192_]);
	    }
	    if (aByte5855 != 0)
		class89.method1911(aByte5816,
				   aByte5817,
				   aByte5818,
				   aByte5855 & 0xff);
	    class89.method1928(i_184_);
	    synchronized (((NPCDefinitionLoader) loader)
			  .aClass129_5888) {
		((NPCDefinitionLoader) loader)
		    .aClass129_5888.put(class89, l);
	    }
	}
	if (null != class409) {
	    class89 = class89.method2019((byte) 1, i_184_, true);
	    class409.method7357(class89, 0, (byte) -103);
	}
	class89.method1928(i);
	return class89;
    }
    
    public final boolean method7168() {
	if (modelIDs == null)
	    return true;
	boolean bool = true;
	int[] is = modelIDs;
	for (int i = 0; i < is.length; i++) {
	    int i_193_ = is[i];
	    if (!((NPCDefinitionLoader) loader)
		     .modelDefContainer.method4188(i_193_, 0, -1750079210))
		bool = false;
	}
	return bool;
    }
    
    public final Class89 method7169
	(Class103 class103, int i, Class539 class539, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class409 class409_194_,
	 Class409[] class409s, int[] is, int i_195_, Class404 class404) {
	return method7145(class103, i, class539, interface13, interface11,
			  class409, class409_194_, class409s, is, i_195_,
			  class404, renderEmote * 1952014657, true, 2096149230);
    }
    
    public final Class89 method7170
	(Class103 class103, int i, Class539 class539, Interface13 interface13,
	 Interface11 interface11, Class409 class409, Class409 class409_196_,
	 Class409[] class409s, int[] is, int i_197_, Class404 class404) {
	return method7145(class103, i, class539, interface13, interface11,
			  class409, class409_196_, class409s, is, i_197_,
			  class404, renderEmote * 1952014657, true, 1949715867);
    }
    
    public int method7171(int i, int i_198_) {
	if (null == paramaters)
	    return i_198_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       paramaters.get((long) i));
	if (class241_sub22 == null)
	    return i_198_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public int method7172(int i, int i_199_) {
	if (null == paramaters)
	    return i_199_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       paramaters.get((long) i));
	if (class241_sub22 == null)
	    return i_199_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public final boolean method7173() {
	if (modelIDs == null)
	    return true;
	boolean bool = true;
	int[] is = modelIDs;
	for (int i = 0; i < is.length; i++) {
	    int i_200_ = is[i];
	    if (!((NPCDefinitionLoader) loader)
		     .modelDefContainer.method4188(i_200_, 0, -1531756474))
		bool = false;
	}
	return bool;
    }
    
    public int method7174(int i, int i_201_) {
	if (null == paramaters)
	    return i_201_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       paramaters.get((long) i));
	if (class241_sub22 == null)
	    return i_201_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public String method7175(int i, String string) {
	if (paramaters == null)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       paramaters.get((long) i));
	if (null == class241_sub26)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    public final NPCDefinition method7176(Interface13 interface13,
				     Interface11 interface11, byte i) {
	int i_202_ = -1;
	if (-1 != 637988829 * anInt5842) {
	    VarBitType class316
		= interface13.method93(anInt5842 * 637988829,
				       2114491707);
	    if (null != class316)
		i_202_ = interface11.getVarBitValue(class316, (short) 28650);
	} else if (anInt5838 * 1115373521 != -1) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       (1115373521
					* anInt5838),
				       (byte) 30);
	    if (class179 != null)
		i_202_ = interface11.getVarValueInt(class179, -870173144);
	}
	if (i_202_ < 0 || i_202_ >= transformTo.length - 1) {
	    int i_203_ = transformTo[transformTo.length - 1];
	    if (i_203_ != -1)
		return loader
			   .getNpcDefinition(i_203_, -1462667525);
	    return null;
	}
	if (-1 == transformTo[i_202_])
	    return null;
	return loader
		   .getNpcDefinition(transformTo[i_202_], -1703476533);
    }
    
    public final NPCDefinition method7177(Interface13 interface13,
				     Interface11 interface11) {
	int i = -1;
	if (-1 != 637988829 * anInt5842) {
	    VarBitType class316
		= interface13.method93(anInt5842 * 637988829,
				       1192119129);
	    if (null != class316)
		i = interface11.getVarBitValue(class316, (short) 20039);
	} else if (anInt5838 * 1115373521 != -1) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       (1115373521
					* anInt5838),
				       (byte) 39);
	    if (class179 != null)
		i = interface11.getVarValueInt(class179, -1574125396);
	}
	if (i < 0 || i >= transformTo.length - 1) {
	    int i_204_ = transformTo[transformTo.length - 1];
	    if (i_204_ != -1)
		return loader
			   .getNpcDefinition(i_204_, -1003787519);
	    return null;
	}
	if (-1 == transformTo[i])
	    return null;
	return loader.getNpcDefinition(transformTo[i],
							   -1888932831);
    }
    
    public boolean method7178() {
	if (null == transformTo)
	    return (anInt5819 * 1319993127 != -1 || anInt5808 * -97900731 != -1
		    || -1 != anInt5858 * -1561948383);
	for (int i = 0; i < transformTo.length; i++) {
	    if (transformTo[i] != -1) {
		NPCDefinition class401_205_
		    = loader
			  .getNpcDefinition(transformTo[i], -1836442284);
		if (1319993127 * class401_205_.anInt5819 != -1
		    || -1 != class401_205_.anInt5808 * -97900731
		    || -1561948383 * class401_205_.anInt5858 != -1)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method7179() {
	if (null == transformTo)
	    return (anInt5819 * 1319993127 != -1 || anInt5808 * -97900731 != -1
		    || -1 != anInt5858 * -1561948383);
	for (int i = 0; i < transformTo.length; i++) {
	    if (transformTo[i] != -1) {
		NPCDefinition class401_206_
		    = loader
			  .getNpcDefinition(transformTo[i], -1709960527);
		if (1319993127 * class401_206_.anInt5819 != -1
		    || -1 != class401_206_.anInt5808 * -97900731
		    || -1561948383 * class401_206_.anInt5858 != -1)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method7180() {
	if (null == transformTo)
	    return (anInt5819 * 1319993127 != -1 || anInt5808 * -97900731 != -1
		    || -1 != anInt5858 * -1561948383);
	for (int i = 0; i < transformTo.length; i++) {
	    if (transformTo[i] != -1) {
		NPCDefinition class401_207_
		    = loader
			  .getNpcDefinition(transformTo[i], -1463432618);
		if (1319993127 * class401_207_.anInt5819 != -1
		    || -1 != class401_207_.anInt5808 * -97900731
		    || -1561948383 * class401_207_.anInt5858 != -1)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method7181(Interface13 interface13, Interface11 interface11,
			      int i) {
	if (transformTo == null)
	    return true;
	int i_208_ = -1;
	if (anInt5842 * 637988829 != -1) {
	    VarBitType class316
		= interface13.method93(637988829 * anInt5842,
				       1887259822);
	    if (null != class316)
		i_208_ = interface11.getVarBitValue(class316, (short) 23608);
	} else if (-1 != 1115373521 * anInt5838) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       (anInt5838
					* 1115373521),
				       (byte) 66);
	    if (class179 != null)
		i_208_ = interface11.getVarValueInt(class179, -2066383414);
	}
	if (i_208_ < 0 || i_208_ >= transformTo.length - 1) {
	    int i_209_ = transformTo[transformTo.length - 1];
	    if (i_209_ != -1)
		return true;
	    return false;
	}
	if (transformTo[i_208_] == -1)
	    return false;
	return true;
    }
    
    public boolean method7182() {
	if (null == transformTo)
	    return (anInt5819 * 1319993127 != -1 || anInt5808 * -97900731 != -1
		    || -1 != anInt5858 * -1561948383);
	for (int i = 0; i < transformTo.length; i++) {
	    if (transformTo[i] != -1) {
		NPCDefinition class401_210_
		    = loader
			  .getNpcDefinition(transformTo[i], -1773445858);
		if (1319993127 * class401_210_.anInt5819 != -1
		    || -1 != class401_210_.anInt5808 * -97900731
		    || -1561948383 * class401_210_.anInt5858 != -1)
		    return true;
	    }
	}
	return false;
    }
    
    public final boolean method7183() {
	if (modelIDs == null)
	    return true;
	boolean bool = true;
	int[] is = modelIDs;
	for (int i = 0; i < is.length; i++) {
	    int i_211_ = is[i];
	    if (!((NPCDefinitionLoader) loader)
		     .modelDefContainer.method4188(i_211_, 0, -1970853346))
		bool = false;
	}
	return bool;
    }
    
    public boolean method7184() {
	if (null == transformTo)
	    return (anInt5819 * 1319993127 != -1 || anInt5808 * -97900731 != -1
		    || -1 != anInt5858 * -1561948383);
	for (int i = 0; i < transformTo.length; i++) {
	    if (transformTo[i] != -1) {
		NPCDefinition class401_212_
		    = loader
			  .getNpcDefinition(transformTo[i], -249631422);
		if (1319993127 * class401_212_.anInt5819 != -1
		    || -1 != class401_212_.anInt5808 * -97900731
		    || -1561948383 * class401_212_.anInt5858 != -1)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method7185() {
	if (null == transformTo)
	    return (anInt5819 * 1319993127 != -1 || anInt5808 * -97900731 != -1
		    || -1 != anInt5858 * -1561948383);
	for (int i = 0; i < transformTo.length; i++) {
	    if (transformTo[i] != -1) {
		NPCDefinition class401_213_
		    = loader
			  .getNpcDefinition(transformTo[i], -894075221);
		if (1319993127 * class401_213_.anInt5819 != -1
		    || -1 != class401_213_.anInt5808 * -97900731
		    || -1561948383 * class401_213_.anInt5858 != -1)
		    return true;
	    }
	}
	return false;
    }
    
    static int method7186
	(Class507_Sub1 class507_sub1, Class507_Sub1 class507_sub1_214_, int i,
	 boolean bool, int i_215_, boolean bool_216_, byte i_217_) {
	int i_218_ = Class589.method12902(class507_sub1, class507_sub1_214_, i,
					  bool, -452405680);
	if (0 != i_218_) {
	    if (bool)
		return -i_218_;
	    return i_218_;
	}
	if (i_215_ == -1)
	    return 0;
	int i_219_ = Class589.method12902(class507_sub1, class507_sub1_214_,
					  i_215_, bool_216_, 526458836);
	if (bool_216_)
	    return -i_219_;
	return i_219_;
    }
    
    static void method7187(Class411 class411, int i) {
	Class327.aClass411_5019 = class411;
	OutputStream_Sub1.aString8604 = null;
    }
}
