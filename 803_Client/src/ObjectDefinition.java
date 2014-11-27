/* Class526 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class ObjectDefinition {
    public int[] toObjectIDs;//anIntArray6827
    public static short[] aShortArray6828 = new short[256];
    ObjectDefinitionLoader loader;//aClass532_6829
    public int objectID;//anInt6830
    byte[] aByteArray6831;
    int[][] modelIDs;//anIntArrayArray6832
    public int[] anIntArray6833;
    short[] originalColors;//aShortArray6834
    short[] modifiedColors;//aShortArray6835
    public String name = "null";//aString6836
    short[] aShortArray6837;
    int anInt6838;
    byte[] aByteArray6839;
    public boolean aBool6840;
    public int anInt6841;
    public boolean aBool6842;
    byte aByte6843;
    byte aByte6844 = 0;
    public int sizeX = 400055885;//anInt6845
    public int sizeY = -1685453665;//anInt6846
    public int clipType = 636856726;//anInt6847
    public int anInt6848 = 1338633203;
    byte aByte6849 = 0;
    int anInt6850 = 1785892085;
    public int anInt6851;
    public int anInt6852;
    public int anInt6853;
    public int anInt6854;
    public int anInt6855;
    int[] anIntArray6856;
    public int mapSpriteID;//anInt6857
    public int anInt6858;
    int anInt6859;
    int anInt6860;
    public String[] options;//aStringArray6861
    int[] anIntArray6862;
    byte[] aByteArray6863;
    public int anInt6864;
    public boolean aBool6865;
    int varBitID;//anInt6866
    public boolean aBool6867;
    public boolean aBool6868;
    public boolean aBool6869;
    public boolean aBool6870;
    int anInt6871;
    int anInt6872;
    int anInt6873;
    int anInt6874;
    public boolean aBool6875;
    int anInt6876;
    static final int anInt6877 = 6;
    int anInt6878;
    public boolean aBool6879;
    boolean clippingFlag;//aBool6880
    public int anInt6881;
    public boolean membersObject;//aBool6882
    public int anInt6883;
    byte aByte6884;
    int varpID;//anInt6885
    public int anInt6886;
    public int anInt6887;
    public int anInt6888;
    public int anInt6889;
    public boolean aBool6890;
    public int anInt6891;
    public int[] anIntArray6892;
    int anInt6893;
    HashTable parameters;//aClass407_6894
    public boolean aBool6895;
    int anInt6896;
    public Class518 aClass518_6897;
    public boolean aBool6898;
    short[] aShortArray6899;
    public int anInt6900;
    byte[] aByteArray6901;
    byte aByte6902;
    public boolean bloom;//aBool6903
    static final int anInt6904 = 127007;
    public Class272 aClass272_6905;
    int[] anIntArray6906;
    public static client aclient6907;
    
    public int method11759(byte i) {
	if (null != anIntArray6862) {
	    if (anIntArray6862.length > 1) {
		int i_0_ = (int) (Math.random() * 65535.0);
		for (int i_1_ = 0;
		     i_1_ < anIntArray6862.length; i_1_++) {
		    if (i_0_ <= anIntArray6856[i_1_])
			return anIntArray6862[i_1_];
		    i_0_ -= anIntArray6856[i_1_];
		}
	    } else
		return anIntArray6862[0];
	}
	return -1;
    }
    
    void decode/*method11760*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) 34);
		    if (opcode == 0) {
		    	break;
		    }
		    decode(buffer, opcode, -927479132);
		}
    }
    
    void decode/*method11761*/(RSByteBuffer buffer, int opcode, int i_3_) {
		if (opcode == 1) {//Unknown
		    int length = buffer.readUnsignedByte((byte) -6);
		    aByteArray6831 = new byte[length];
		    modelIDs = new int[length][];
		    for (int index = 0; index < length; index++) {
		    	aByteArray6831[index] = buffer.getByte(-1457071953);
				int i_6_ = buffer.readUnsignedByte((byte) 52);
				modelIDs[index] = new int[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				    modelIDs[index][i_7_] = buffer.readBigSmart((byte) 105);
				}
		    }
		} else if (opcode == 2) {
		    name = buffer.readString(-103011835);
		} else if (14 == opcode) {
		    sizeX = buffer.readUnsignedByte((byte) 75) * 400055885;
		} else if (opcode == 15) {
		    sizeY = buffer.readUnsignedByte((byte) -80) * -1685453665;
		} else if (opcode == 17) {
		    clipType = 0;
		} else if (opcode != 18) {
		    if (19 == opcode) {//Unknown
		    	anInt6848 = buffer.readUnsignedByte((byte) 56) * -1338633203;
		    } else if (opcode == 21) {//Unknown
		    	aByte6849 = (byte) 1;
		    } else if (opcode == 22) {//Unknown
		    	aBool6842 = true;
		    } else if (23 == opcode) {//Unknown
		    	anInt6852 = -1796196245;
		    } else if (24 == opcode) {//Unknown
				int i_8_ = buffer.readBigSmart((byte) 70);
				if (i_8_ != -1)
				    anIntArray6862 = new int[] { i_8_ };
		    } else if (opcode == 27) {
		    	clipType = 318428363;
		    } else if (28 == opcode) {//Unknown
		    	anInt6858 = (buffer.readUnsignedByte((byte) 88) << 2) * -586822403;
		    } else if (29 == opcode) {//Unknown
		    	anInt6859 = buffer.getByte(26893640) * 786444475;
		    } else if (39 == opcode) {//Unknown
		    	anInt6860 = buffer.getByte(933916026) * 1528853989;
		    } else if (opcode >= 30 && opcode < 35) {
		    	options[opcode - 30] = buffer.readString(231541190);
		    } else if (40 == opcode) {//Unknown
				int length = buffer.readUnsignedByte((byte) -40);
				originalColors = new short[length];
				modifiedColors = new short[length];
				for (int index = 0; index < length; index++) {
				    originalColors[index] = (short) buffer.readUnsignedShort(1162222719);
				    modifiedColors[index] = (short) buffer.readUnsignedShort(1162222719);
				}
		    } else if (opcode == 41) {//Unknown
				int length = buffer.readUnsignedByte((byte) -21);
				aShortArray6837 = new short[length];
				aShortArray6899 = new short[length];
				for (int index = 0; index < length; index++) {
				    aShortArray6837[index] = (short) buffer.readUnsignedShort(1162222719);
				    aShortArray6899[index] = (short) buffer.readUnsignedShort(1162222719);
				}
		    } else if (42 == opcode) {//Unknown
				int length = buffer.readUnsignedByte((byte) -48);
				aByteArray6901 = new byte[length];
				for (int index = 0; index < length; index++) {
				    aByteArray6901[index] = buffer.getByte(-448826978);
				}
		    } else if (44 == opcode) {//Unknown
				int i_15_ = buffer.readUnsignedShort(1162222719);
				int i_16_ = 0;
				for (int i_17_ = i_15_; i_17_ > 0; i_17_ >>= 1) {
				    i_16_++;
				}
				aByteArray6839 = new byte[i_16_];
				byte i_18_ = 0;
				for (int i_19_ = 0; i_19_ < i_16_; i_19_++) {
				    if ((i_15_ & 1 << i_19_) > 0) {
						aByteArray6839[i_19_] = i_18_;
						i_18_++;
				    } else {
				    	aByteArray6839[i_19_] = (byte) -1;
				    }
				}
		    } else if (45 == opcode) {//Unknown
				int i_20_ = buffer.readUnsignedShort(1162222719);
				int i_21_ = 0;
				for (int i_22_ = i_20_; i_22_ > 0; i_22_ >>= 1)
				    i_21_++;
				aByteArray6863 = new byte[i_21_];
				byte i_23_ = 0;
				for (int i_24_ = 0; i_24_ < i_21_; i_24_++) {
				    if ((i_20_ & 1 << i_24_) > 0) {
					aByteArray6863[i_24_] = i_23_;
					i_23_++;
				    } else
					aByteArray6863[i_24_] = (byte) -1;
				}
		    } else if (opcode == 62) {//Unknown
		    	aBool6868 = true;
		    } else if (64 == opcode) {//Unknown
		    	aBool6869 = false;
		    } else if (65 == opcode) {//Unknown
		    	anInt6896 = buffer.readUnsignedShort(1162222719) * -1740981117;
		    } else if (66 == opcode) {//Unknown
		    	anInt6871 = buffer.readUnsignedShort(1162222719) * -1188863729;
		    } else if (opcode == 67) {//Unknown
		    	anInt6872 = buffer.readUnsignedShort(1162222719) * -2142300815;
		    } else if (opcode == 69) {//Unused
		    	buffer.readUnsignedByte((byte) -25);
		    } else if (70 == opcode) {//Unknown
		    	anInt6873 = ((buffer.readShort((byte) 91) << 2) * -2075267633);
		    } else if (opcode == 71) {//Unknown
		    	anInt6874 = ((buffer.readShort((byte) 68) << 2) * -1858556577);
		    } else if (opcode == 72) {//Unknown
		    	anInt6838 = (buffer.readShort((byte) 100) << 2) * 180348373;
		    } else if (73 == opcode) {//Unknown
		    	aBool6879 = true;
		    } else if (74 == opcode) {
		    	clippingFlag = true;
		    } else if (opcode == 75) {//Unknown
		    	anInt6881 = buffer.readUnsignedByte((byte) 20) * 1901826337;
		    } else if (opcode == 77 || opcode == 92) {
				varBitID = buffer.readUnsignedShort(1162222719) * 2140454431;
				if (65535 == 230637023 * varBitID) {
				    varBitID = -2140454431;
				}
				varpID = buffer.readUnsignedShort(1162222719) * 2083726957;
				if (65535 == varpID * 872338277) {
				    varpID = -2083726957;
				}
				int obj = -1;
				if (opcode == 92) {
					obj = buffer.readBigSmart((byte) -26);
				}
				int length = buffer.readUnsignedByte((byte) 94);
				toObjectIDs = new int[2 + length];
				for (int index = 0; index <= length; index++) {
				    toObjectIDs[index] = buffer.readBigSmart((byte) -86);
				}
				toObjectIDs[length + 1] = obj;
		    } else if (opcode == 78) {//Unknown
				anInt6886 = buffer.readUnsignedShort(1162222719) * -992778665;
				anInt6841 = buffer.readUnsignedByte((byte) 11) * 899637949;
		    } else if (79 == opcode) {//Unknown
				anInt6887 = buffer.readUnsignedShort(1162222719) * 1317152953;
				anInt6891 = buffer.readUnsignedShort(1162222719) * -564386735;
				anInt6841 = buffer.readUnsignedByte((byte) -47) * 899637949;
				int length = buffer.readUnsignedByte((byte) 35);
				anIntArray6892 = new int[length];
				for (int index = 0; index < length; index++) {
				    anIntArray6892[index] = buffer.readUnsignedShort(1162222719);
				}
		    } else if (opcode == 81) {//Unknown
				aByte6849 = (byte) 2;
				anInt6850 = buffer.readUnsignedByte((byte) -31) * -1921840384;
		    } else if (opcode == 82) {//Unknown
		    	aBool6890 = true;
		    } else if (opcode == 88) {//Unknown
		    	aBool6895 = false;
		    } else if (opcode == 89) {//Unknown
		    	aBool6840 = false;
		    } else if (opcode == 91) {//Unknown
		    	membersObject = true;
		    } else if (93 == opcode) {//Unknown
				aByte6849 = (byte) 3;
				anInt6850 = buffer.readUnsignedShort(1162222719) * -1785892085;
		    } else if (opcode == 94) {//Unknown
		    	aByte6849 = (byte) 4;
		    } else if (95 == opcode) {//Unknown
				aByte6849 = (byte) 5;
				anInt6850 = buffer.readShort((byte) 118) * -1785892085;
		    } else if (opcode == 97) {//Unknown
		    	aBool6865 = true;
		    } else if (98 == opcode) {//Unknown
		    	aBool6898 = true;
		    } else if (opcode == 99 || 100 == opcode) {//Unused
				buffer.readUnsignedByte((byte) -52);
				buffer.readUnsignedShort(1162222719);
		    } else if (101 == opcode) {//Unknown
		    	anInt6851 = buffer.readUnsignedByte((byte) -33) * 249753407;
		    } else if (102 == opcode) {//Unknown
		    	anInt6864 = buffer.readUnsignedShort(1162222719) * 709057213;
		    } else if (opcode == 103) {//Unknown
		    	anInt6852 = 0;
		    } else if (opcode == 104) {//Unknown
		    	anInt6889 = buffer.readUnsignedByte((byte) -19) * -1125233385;
		    } else if (opcode == 105) {//Unknown
		    	aBool6867 = true;
		    } else if (opcode == 106) {//Unknown
				int length = buffer.readUnsignedByte((byte) 33);
				int i_31_ = 0;
				anIntArray6862 = new int[length];
				anIntArray6856 = new int[length];
				for (int index = 0; index < length; index++) {
				    anIntArray6862[index] = buffer.readBigSmart((byte) -47);
				    i_31_ += anIntArray6856[index] = buffer.readUnsignedByte((byte) -87);
				}
				for (int index = 0; index < length; index++) {
				    anIntArray6856[index] = (anIntArray6856[index] * 65535 / i_31_);
				}
		    } else if (opcode == 107) {
		    	mapSpriteID = buffer.readUnsignedShort(1162222719) * -598427945;
		    } else if (opcode >= 150 && opcode < 155) {
		    	options[opcode - 150] = buffer.readString(-987263829);
		    	if (!loader.onMembersServer) {
		    		options[opcode - 150] = null;
		    	}
		    } else if (160 == opcode) {//(Cursor IDs?)
				int length = buffer.readUnsignedByte((byte) 25);
				anIntArray6833 = new int[length];
				for (int index = 0; index < length; index++) {
				    anIntArray6833[index] = buffer.readUnsignedShort(1162222719);
				}
		    } else if (opcode == 162) {//Unknown
				aByte6849 = (byte) 3;
				anInt6850 = buffer.readInt((byte) 82) * -1785892085;
		    } else if (opcode == 163) {//Unknown
				aByte6884 = buffer.getByte(-741851008);
				aByte6902 = buffer.getByte(-406058407);
				aByte6843 = buffer.getByte(139864534);
				aByte6844 = buffer.getByte(1044403966);
		    } else if (opcode == 164) {//Unknown
		    	anInt6876 = buffer.readShort((byte) 78) * 1790332219;
		    } else if (165 == opcode) {//Unknown
		    	anInt6893 = buffer.readShort((byte) 54) * 2040823525;
		    } else if (opcode == 166) {//Unknown
		    	anInt6878 = buffer.readShort((byte) 66) * 1304973391;
		    } else if (167 == opcode) {//Unknown
		    	anInt6883 = buffer.readUnsignedShort(1162222719) * 1337263557;
		    } else if (168 != opcode && opcode != 169) {
				if (opcode == 170) {//Unknown
				    anInt6853 = (buffer.readSmart((short) -20092) * 2033307369);
				} else if (171 == opcode) {//Unknown
				    anInt6854 = (buffer.readSmart((short) -28312) * -1648174573);
				} else if (opcode == 173) {//Unknown
				    anInt6900 = buffer.readUnsignedShort(1162222719) * -582011349;
				    anInt6855 = buffer.readUnsignedShort(1162222719) * -806337933;
				} else if (opcode == 177) {//Unknown
				    aBool6870 = true;
				} else if (178 == opcode) {//Unknown
				    anInt6888 = buffer.readUnsignedByte((byte) 78) * -1821241153;
				} else if (186 == opcode) {//Unknown
				    aClass518_6897 = ((Class518)
					   Class531.method11848(
							   Class107.method2688((byte) -53),
							   buffer.readUnsignedByte((byte) -15),
							   526749642));
				} else if (opcode == 189) {//Unknown
				    bloom = true;
				} else if (opcode >= 190 && opcode < 196) {//Unknown
				    if (null == anIntArray6906) {
						anIntArray6906 = new int[6];
						Arrays.fill(anIntArray6906, -1);
				    }
				    anIntArray6906[opcode - 190] = buffer.readUnsignedShort(1162222719);
				} else if (196 == opcode) {//Unknown
				    Class531.method11848(Class104.method2648(536296049),
							 buffer.readUnsignedByte((byte) -13),
							 -1392672475);
				} else if (opcode == 197) {//Unknown
				    Class531.method11848(Class320.method5924((short) 255),
							 buffer.readUnsignedByte((byte) 7),
							 707910095);
				} else if (opcode != 198 && 199 != opcode) {
				    if (200 == opcode) {//Unknown
				    	aBool6875 = true;
				    } else if (opcode == 201) {//Unknown
						aClass272_6905 = new Class272();
						aClass272_6905.aFloat4367 = (float) buffer.readSmart49152(884106955);
						aClass272_6905.aFloat4363 = (float) buffer.readSmart49152(-1309912325);
						aClass272_6905.aFloat4365 = (float) buffer.readSmart49152(742699466);
						aClass272_6905.aFloat4366 = (float) buffer.readSmart49152(474035958);
						aClass272_6905.aFloat4364 = (float) buffer.readSmart49152(-374153822);
						aClass272_6905.aFloat4368 = (float) buffer.readSmart49152(-1643988432);
				    } else if (opcode == 249) {
						int length = buffer.readUnsignedByte((byte) -51);
						if (parameters == null) {
						    int i_37_ = Class480.method11001(length, (byte) 55);
						    parameters = new HashTable(i_37_);
						}
						for (int index = 0; index < length; index++) {
						    boolean stringInstance = buffer.readUnsignedByte((byte) -84) == 1;
						    int key = buffer.readTriByte(1771646547);
						    Node value;
						    if (stringInstance) {
						    	value = new ObjectNode(buffer.readString(1144004725));
						    } else {
						    	value = new IntegerNode(buffer.readInt((byte) 93));
						    }
						    parameters.put(value, (long) key);
						}
				    }
				}
		    }
		}
    }
    
    void postDecodeEvent/*method11762*/(byte i) {
		if (-1 == anInt6848 * -1389471035) {
		    anInt6848 = 0;
		    if (aByteArray6831 != null && aByteArray6831.length == 1
		    		&& (-2030829961 * Class527.aClass527_6928.anInt6931 == aByteArray6831[0])) {
		    	anInt6848 = -1338633203;
		    }
		    for (int index = 0; index < 5; index++) {
				if (null != options[index]) {
				    anInt6848 = -1338633203;
				    break;
				}
		    }
		}
		if (-1 == anInt6881 * -309513503) {
		    anInt6881 = (0 != 811987171 * clipType ? 1 : 0) * 1901826337;
		}
		if (method11772(2084372915) || aBool6898 || toObjectIDs != null) {
		    aBool6870 = true;
		}
    }
    
    public final synchronized Class89 method11763
	(Class103 class103, int i, int i_41_, int i_42_, Class166 class166,
	 Class166 class166_43_, int i_44_, int i_45_, int i_46_,
	 Class409 class409, Class536 class536) {
	if (Class589.method12899(i_41_, (byte) 14))
	    i_41_ = -2030829961 * Class527.aClass527_6930.anInt6931;
	long l
	    = (long) ((i_41_ << 3) + (objectID * -2079513015 << 10) + i_42_);
	int i_47_ = i;
	l |= (long) (1931687493 * class103.anInt1456 << 29);
	if (class536 != null)
	    l |= 5713778495036234511L * ((Class536) class536).aLong6989 << 32;
	if (class409 != null)
	    i |= class409.method7356(-990246582);
	if (3 == aByte6849)
	    i |= 0x7;
	else {
	    if (aByte6849 != 0
		|| 0 != anInt6893 * 843976429)
		i |= 0x2;
	    if (anInt6876 * -917044237 != 0)
		i |= 0x1;
	    if (0 != anInt6878 * -372455761)
		i |= 0x4;
	}
	if (Class527.aClass527_6928.anInt6931 * -2030829961 == i_41_
	    && i_42_ > 3)
	    i |= 0x5;
	Class89 class89;
	synchronized (((ObjectDefinitionLoader) loader)
		      .aClass129_6961) {
	    class89 = (Class89) ((ObjectDefinitionLoader) loader)
				    .aClass129_6961.get(l);
	}
	if (null == class89
	    || class103.method2301(class89.method1866(), i) != 0) {
	    if (null != class89)
		i = class103.method2302(i, class89.method1866());
	    class89 = method11767(class103, i, i_41_, i_42_, class536,
				  -2017039446);
	    if (null == class89)
		return null;
	    synchronized (((ObjectDefinitionLoader) loader)
			  .aClass129_6961) {
		((ObjectDefinitionLoader) loader)
		    .aClass129_6961.put(class89, l);
	    }
	}
	boolean bool = false;
	if (null != class409) {
	    class89 = class89.method2019((byte) 1, i, true);
	    bool = true;
	    class409.method7357(class89, i_42_ & 0x3, (byte) -18);
	}
	if (-2030829961 * Class527.aClass527_6928.anInt6931 == i_41_
	    && i_42_ > 3) {
	    if (!bool) {
		class89 = class89.method2019((byte) 3, i, true);
		bool = true;
	    }
	    class89.method1868(2048);
	}
	if (aByte6849 != 0) {
	    if (!bool) {
		class89 = class89.method2019((byte) 3, i, true);
		bool = true;
	    }
	    class89.method1875(aByte6849,
			       -626573149 * anInt6850,
			       class166, class166_43_, i_44_, i_45_, i_46_);
	}
	if (anInt6876 * -917044237 != 0
	    || 0 != anInt6893 * 843976429
	    || 0 != -372455761 * anInt6878) {
	    if (!bool) {
		class89 = class89.method2019((byte) 3, i, true);
		bool = true;
	    }
	    class89.method1927(-917044237 * anInt6876,
			       843976429 * anInt6893,
			       -372455761 * anInt6878);
	}
	if (bool)
	    class89.method1928(i_47_);
	return class89;
    }
    
    public final boolean method11764(Class477 class477, int i) {
	if (modelIDs == null)
	    return true;
	boolean bool = true;
	synchronized (((ObjectDefinitionLoader) loader)
		      .modelDefContainer) {
	    for (int i_48_ = 0;
		 i_48_ < modelIDs.length;
		 i_48_++) {
		for (int i_49_ = 0;
		     (i_49_
		      < modelIDs[i_48_].length);
		     i_49_++) {
		    boolean bool_50_
			= (((ObjectDefinitionLoader) loader)
			       .modelDefContainer.method4188
			   ((modelIDs[i_48_]
			     [i_49_]),
			    0, -593847521));
		    bool &= bool_50_;
		    if (!bool_50_)
			class477.anInt6401 = 1036614483 * (((ObjectDefinition) this)
							   .modelIDs
							   [i_48_][i_49_]);
		}
	    }
	}
	return bool;
    }
    
    public final synchronized Class399 method11765
	(Class103 class103, int i, int i_51_, int i_52_, Class166 class166,
	 Class166 class166_53_, int i_54_, int i_55_, int i_56_, boolean bool,
	 Class536 class536, int i_57_) {
	if (Class589.method12899(i_51_, (byte) 92))
	    i_51_ = Class527.aClass527_6930.anInt6931 * -2030829961;
	long l = (long) (i_52_
			 + ((i_51_ << 3) + (-2079513015 * objectID << 10)));
	l |= (long) (class103.anInt1456 * 1931687493 << 29);
	if (null != class536)
	    l |= 5713778495036234511L * ((Class536) class536).aLong6989 << 32;
	int i_58_ = i;
	if (aByte6849 == 3)
	    i_58_ |= 0x7;
	else {
	    if (0 != aByte6849
		|| 843976429 * anInt6893 != 0)
		i_58_ |= 0x2;
	    if (0 != -917044237 * anInt6876)
		i_58_ |= 0x1;
	    if (-372455761 * anInt6878 != 0)
		i_58_ |= 0x4;
	}
	if (bool)
	    i_58_ |= 0x40000;
	boolean bool_59_ = (0 != aByte6849
			    && (null != class166 || class166_53_ != null));
	boolean bool_60_ = (-917044237 * anInt6876 != 0
			    || 0 != 843976429 * anInt6893
			    || 0 != -372455761 * anInt6878);
	Class399 class399;
	synchronized (((ObjectDefinitionLoader) loader)
		      .aClass129_6956) {
	    class399 = (Class399) ((ObjectDefinitionLoader) loader)
				      .aClass129_6956.get(l);
	}
	Class89 class89
	    = (Class89) (class399 != null ? class399.anObject5795 : null);
	Class241_Sub39_Sub17 class241_sub39_sub17 = null;
	if (null == class89
	    || class103.method2301(class89.method1866(), i_58_) != 0) {
	    if (null != class89)
		i_58_ = class103.method2302(i_58_, class89.method1866());
	    int i_61_ = i_58_;
	    if (i_51_ == -2030829961 * Class527.aClass527_6928.anInt6931
		&& i_52_ > 3)
		i_61_ |= 0x5;
	    class89 = method11767(class103, i_61_, i_51_, i_52_, class536,
				  -1753903345);
	    if (class89 == null)
		return null;
	    if (Class527.aClass527_6928.anInt6931 * -2030829961 == i_51_
		&& i_52_ > 3)
		class89.method1868(2048);
	    if (bool && !bool_59_ && !bool_60_)
		class241_sub39_sub17 = class89.method1892(null);
	    class89.method1928(i_58_);
	    class399 = new Class399(class89, class241_sub39_sub17);
	    synchronized (((ObjectDefinitionLoader) loader)
			  .aClass129_6956) {
		((ObjectDefinitionLoader) loader)
		    .aClass129_6956.put(class399, l);
	    }
	} else {
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) class399.anObject5794;
	    if (bool && null == class241_sub39_sub17 && !bool_59_ && !bool_60_)
		class241_sub39_sub17
		    = (Class241_Sub39_Sub17) (class399.anObject5794
					      = class89.method1892(null));
	}
	if (bool_59_ || bool_60_) {
	    class89 = class89.method2019((byte) 0, i_58_, true);
	    if (bool_59_)
		class89.method1875(aByte6849,
				   anInt6850 * -626573149,
				   class166, class166_53_, i_54_, i_55_,
				   i_56_);
	    if (bool_60_)
		class89.method1927(anInt6876 * -917044237,
				   anInt6893 * 843976429,
				   anInt6878 * -372455761);
	    if (bool)
		class241_sub39_sub17 = class89.method1892(null);
	    class89.method1928(i);
	} else
	    class89 = class89.method2019((byte) 0, i, true);
	((ObjectDefinitionLoader) loader).aClass399_6966
	    .anObject5795
	    = class89;
	((ObjectDefinitionLoader) loader).aClass399_6966
	    .anObject5794
	    = class241_sub39_sub17;
	return ((ObjectDefinitionLoader) loader).aClass399_6966;
    }
    
    public final synchronized Class89 method11766
	(Class103 class103, int i, int i_62_, int i_63_, Class166 class166,
	 Class166 class166_64_, int i_65_, int i_66_, int i_67_,
	 Class409 class409, Class536 class536) {
	if (Class589.method12899(i_62_, (byte) 21))
	    i_62_ = -2030829961 * Class527.aClass527_6930.anInt6931;
	long l
	    = (long) ((i_62_ << 3) + (objectID * -2079513015 << 10) + i_63_);
	int i_68_ = i;
	l |= (long) (1931687493 * class103.anInt1456 << 29);
	if (class536 != null)
	    l |= 5713778495036234511L * ((Class536) class536).aLong6989 << 32;
	if (class409 != null)
	    i |= class409.method7356(2002140871);
	if (3 == aByte6849)
	    i |= 0x7;
	else {
	    if (aByte6849 != 0
		|| 0 != anInt6893 * 843976429)
		i |= 0x2;
	    if (anInt6876 * -917044237 != 0)
		i |= 0x1;
	    if (0 != anInt6878 * -372455761)
		i |= 0x4;
	}
	if (Class527.aClass527_6928.anInt6931 * -2030829961 == i_62_
	    && i_63_ > 3)
	    i |= 0x5;
	Class89 class89;
	synchronized (((ObjectDefinitionLoader) loader)
		      .aClass129_6961) {
	    class89 = (Class89) ((ObjectDefinitionLoader) loader)
				    .aClass129_6961.get(l);
	}
	if (null == class89
	    || class103.method2301(class89.method1866(), i) != 0) {
	    if (null != class89)
		i = class103.method2302(i, class89.method1866());
	    class89 = method11767(class103, i, i_62_, i_63_, class536,
				  -2112080659);
	    if (null == class89)
		return null;
	    synchronized (((ObjectDefinitionLoader) loader)
			  .aClass129_6961) {
		((ObjectDefinitionLoader) loader)
		    .aClass129_6961.put(class89, l);
	    }
	}
	boolean bool = false;
	if (null != class409) {
	    class89 = class89.method2019((byte) 1, i, true);
	    bool = true;
	    class409.method7357(class89, i_63_ & 0x3, (byte) -17);
	}
	if (-2030829961 * Class527.aClass527_6928.anInt6931 == i_62_
	    && i_63_ > 3) {
	    if (!bool) {
		class89 = class89.method2019((byte) 3, i, true);
		bool = true;
	    }
	    class89.method1868(2048);
	}
	if (aByte6849 != 0) {
	    if (!bool) {
		class89 = class89.method2019((byte) 3, i, true);
		bool = true;
	    }
	    class89.method1875(aByte6849,
			       -626573149 * anInt6850,
			       class166, class166_64_, i_65_, i_66_, i_67_);
	}
	if (anInt6876 * -917044237 != 0
	    || 0 != anInt6893 * 843976429
	    || 0 != -372455761 * anInt6878) {
	    if (!bool) {
		class89 = class89.method2019((byte) 3, i, true);
		bool = true;
	    }
	    class89.method1927(-917044237 * anInt6876,
			       843976429 * anInt6893,
			       -372455761 * anInt6878);
	}
	if (bool)
	    class89.method1928(i_68_);
	return class89;
    }
    
    Class89 method11767(Class103 class103, int i, int i_69_, int i_70_,
			Class536 class536, int i_71_) {
	int i_72_ = 64 + -1803905933 * anInt6859;
	int i_73_ = 850 + 203472801 * anInt6860;
	int i_74_ = i;
	boolean bool
	    = (aBool6868
	       || (i_69_ == -2030829961 * Class527.aClass527_6910.anInt6931
		   && i_70_ > 3));
	if (bool)
	    i |= 0x10;
	if (0 == i_70_) {
	    if (128 != 705720875 * anInt6896
		|| 0 != anInt6873 * 606992687)
		i |= 0x1;
	    if (anInt6872 * -1990653039 != 128
		|| 0 != anInt6838 * -1326830723)
		i |= 0x4;
	} else
	    i |= 0xd;
	if (128 != 1410035183 * anInt6871
	    || anInt6874 * -1440551265 != 0)
	    i |= 0x2;
	if (null != originalColors)
	    i |= 0x4000;
	if (aShortArray6837 != null)
	    i |= 0x8000;
	if (0 != aByte6844)
	    i |= 0x80000;
	Class89 class89 = null;
	if (null != aByteArray6831) {
	    int i_75_ = -1;
	    for (int i_76_ = 0;
		 i_76_ < aByteArray6831.length; i_76_++) {
		if (i_69_ == aByteArray6831[i_76_]) {
		    i_75_ = i_76_;
		    break;
		}
	    }
	    if (-1 == i_75_)
		return null;
	    int[] is = ((null != class536
			 && ((Class536) class536).anIntArray6987 != null)
			? ((Class536) class536).anIntArray6987
			: modelIDs[i_75_]);
	    int i_77_ = is.length;
	    if (i_77_ > 0) {
		long l = (long) (1931687493 * class103.anInt1456);
		for (int i_78_ = 0; i_78_ < i_77_; i_78_++)
		    l = (long) is[i_78_] + l * 67783L;
		synchronized (((ObjectDefinitionLoader) loader)
			      .aClass129_6960) {
		    class89 = ((Class89)
			       ((ObjectDefinitionLoader) loader)
				   .aClass129_6960.get(l));
		}
		if (null != class89) {
		    if (i_72_ != class89.method1905())
			i |= 0x1000;
		    if (i_73_ != class89.method1862())
			i |= 0x2000;
		}
		if (null == class89
		    || class103.method2301(class89.method1866(), i) != 0) {
		    int i_79_ = i | 0x1f01f;
		    if (null != class89)
			i_79_
			    = class103.method2302(i_79_, class89.method1866());
		    Class161 class161 = null;
		    synchronized (((ObjectDefinitionLoader) loader)
				  .aClass161Array6965) {
			for (int i_80_ = 0; i_80_ < i_77_; i_80_++) {
			    synchronized (((ObjectDefinitionLoader)
					   loader)
					  .modelDefContainer) {
				class161
				    = Class161.method3448((((ObjectDefinitionLoader)
							    (((ObjectDefinition) this)
							     .loader))
							   .modelDefContainer),
							  is[i_80_], 0);
			    }
			    if (class161 == null) {
				Class89 class89_81_ = null;
				return class89_81_;
			    }
			    if (class161.anInt1789 < 13)
				class161.method3464(2);
			    if (i_77_ > 1)
				((ObjectDefinitionLoader) loader)
				    .aClass161Array6965[i_80_]
				    = class161;
			}
			if (i_77_ > 1)
			    class161
				= new Class161((((ObjectDefinitionLoader) (((ObjectDefinition) this)
							     .loader))
						.aClass161Array6965),
					       i_77_);
		    }
		    class89
			= class103.method2356(class161, i_79_,
					      (((ObjectDefinitionLoader) (((ObjectDefinition) this)
							    .loader))
					       .anInt6963) * 418505353,
					      i_72_, i_73_);
		    synchronized (((ObjectDefinitionLoader) loader)
				  .aClass129_6960) {
			((ObjectDefinitionLoader) loader)
			    .aClass129_6960.put(class89, l);
		    }
		}
	    }
	}
	if (class89 == null)
	    return null;
	Class89 class89_82_ = class89.method2019((byte) 0, i, true);
	if (i_72_ != class89.method1905())
	    class89_82_.method1903(i_72_);
	if (i_73_ != class89.method1862())
	    class89_82_.method2057(i_73_);
	if (bool)
	    class89_82_.method1873();
	if (i_69_ == Class527.aClass527_6930.anInt6931 * -2030829961
	    && i_70_ > 3) {
	    class89_82_.method1869(2048);
	    class89_82_.method1927(180, 0, -180);
	}
	i_70_ &= 0x3;
	if (i_70_ == 1)
	    class89_82_.method1869(4096);
	else if (2 == i_70_)
	    class89_82_.method1869(8192);
	else if (i_70_ == 3)
	    class89_82_.method1869(12288);
	if (originalColors != null) {
	    short[] is;
	    if (null != class536
		&& null != ((Class536) class536).aShortArray6986)
		is = ((Class536) class536).aShortArray6986;
	    else
		is = modifiedColors;
	    for (int i_83_ = 0;
		 i_83_ < originalColors.length; i_83_++) {
		if (aByteArray6901 != null
		    && i_83_ < aByteArray6901.length)
		    class89_82_.method1908((originalColors
					    [i_83_]),
					   aShortArray6828[(((ObjectDefinition) this)
							    .aByteArray6901
							    [i_83_]) & 0xff]);
		else
		    class89_82_.method1908((originalColors
					    [i_83_]),
					   is[i_83_]);
	    }
	}
	if (aShortArray6837 != null) {
	    short[] is;
	    if (null != class536
		&& null != ((Class536) class536).aShortArray6988)
		is = ((Class536) class536).aShortArray6988;
	    else
		is = aShortArray6899;
	    for (int i_84_ = 0;
		 i_84_ < aShortArray6837.length; i_84_++)
		class89_82_.method1985((aShortArray6837
					[i_84_]),
				       is[i_84_]);
	}
	if (aByte6844 != 0)
	    class89_82_.method1911(aByte6884,
				   aByte6902,
				   aByte6843,
				   aByte6844 & 0xff);
	if (705720875 * anInt6896 != 128
	    || 128 != 1410035183 * anInt6871
	    || 128 != -1990653039 * anInt6872)
	    class89_82_.method1863(705720875 * anInt6896,
				   1410035183 * anInt6871,
				   anInt6872 * -1990653039);
	if (anInt6873 * 606992687 != 0
	    || -1440551265 * anInt6874 != 0
	    || anInt6838 * -1326830723 != 0)
	    class89_82_.method1927(anInt6873 * 606992687,
				   -1440551265 * anInt6874,
				   anInt6838 * -1326830723);
	class89_82_.method1928(i_74_);
	return class89_82_;
    }
    
    public final ObjectDefinition method11768(Interface13 interface13, Interface11 interface11, int i) {
		int transformTo = -1;
		if (-1 != 230637023 * varBitID) {
			VarBitType class316 = interface13.method93(varBitID * 230637023, 1117851925);
			if (null != class316) {
				transformTo = interface11.getVarBitValue(class316, (short) 11021);
			}
		} else if (872338277 * varpID != -1) {
			VarType class179 = interface13.method96(VarDomainType.PLAYER, varpID * 872338277, (byte) 112);
			if (null != class179) {
				transformTo = interface11.getVarValueInt(class179, -1909080409);
			}
		}
		if (transformTo < 0 || transformTo >= toObjectIDs.length - 1) {
			int i_86_ = toObjectIDs[toObjectIDs.length - 1];
			if (i_86_ != -1) {
				return loader.getObjectDefinition(i_86_, 577892407);
			}
			return null;
		}
		if (-1 == toObjectIDs[transformTo]) {
			return null;
		}
		return loader.getObjectDefinition(toObjectIDs[transformTo], 577892407);
    }
    
    public int method11769(int i, int i_87_, int i_88_) {
	if (null == parameters)
	    return i_87_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       parameters.get((long) i));
	if (class241_sub22 == null)
	    return i_87_;
	return -1859754807 * class241_sub22.intValue;
    }
    
    public boolean method11770() {
	return null != anIntArray6862;
    }
    
    public boolean method11771(byte i) {
	if (null == toObjectIDs)
	    return -754260633 * anInt6886 != -1 || anIntArray6892 != null;
	for (int i_89_ = 0; i_89_ < toObjectIDs.length; i_89_++) {
	    if (-1 != toObjectIDs[i_89_]) {
		ObjectDefinition class526_90_
		    = loader
			  .getObjectDefinition(toObjectIDs[i_89_], 577892407);
		if (-1 != class526_90_.anInt6886 * -754260633
		    || class526_90_.anIntArray6892 != null)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method11772(int i) {
    	return null != anIntArray6862;
    }
    
    public int method11773(int i, int i_91_) {
	if (null == parameters)
	    return i_91_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       parameters.get((long) i));
	if (class241_sub22 == null)
	    return i_91_;
	return -1859754807 * class241_sub22.intValue;
    }
    
    void method11774() {
	if (-1 == anInt6848 * -1389471035) {
	    anInt6848 = 0;
	    if (aByteArray6831 != null
		&& aByteArray6831.length == 1
		&& (-2030829961 * Class527.aClass527_6928.anInt6931
		    == aByteArray6831[0]))
		anInt6848 = -1338633203;
	    for (int i = 0; i < 5; i++) {
		if (null != options[i]) {
		    anInt6848 = -1338633203;
		    break;
		}
	    }
	}
	if (-1 == anInt6881 * -309513503)
	    anInt6881 = (0 != 811987171 * clipType ? 1 : 0) * 1901826337;
	if (method11772(2123883410) || aBool6898 || toObjectIDs != null)
	    aBool6870 = true;
    }
    
    public int[] method11775(int i) {
	return anIntArray6862;
    }
    
    public boolean method11776(int i) {
	return (anIntArray6862 != null
		&& anIntArray6862.length > 1);
    }
    
    public int method11777(int i, int i_92_) {
	if (null == anIntArray6906)
	    return -1;
	return anIntArray6906[i];
    }
    
    public final synchronized Class399 method11778
	(Class103 class103, int i, int i_93_, int i_94_, Class166 class166,
	 Class166 class166_95_, int i_96_, int i_97_, int i_98_, boolean bool,
	 Class536 class536) {
	if (Class589.method12899(i_93_, (byte) 20))
	    i_93_ = Class527.aClass527_6930.anInt6931 * -2030829961;
	long l = (long) (i_94_
			 + ((i_93_ << 3) + (-2079513015 * objectID << 10)));
	l |= (long) (class103.anInt1456 * 1931687493 << 29);
	if (null != class536)
	    l |= 5713778495036234511L * ((Class536) class536).aLong6989 << 32;
	int i_99_ = i;
	if (aByte6849 == 3)
	    i_99_ |= 0x7;
	else {
	    if (0 != aByte6849
		|| 843976429 * anInt6893 != 0)
		i_99_ |= 0x2;
	    if (0 != -917044237 * anInt6876)
		i_99_ |= 0x1;
	    if (-372455761 * anInt6878 != 0)
		i_99_ |= 0x4;
	}
	if (bool)
	    i_99_ |= 0x40000;
	boolean bool_100_ = (0 != aByte6849
			     && (null != class166 || class166_95_ != null));
	boolean bool_101_ = (-917044237 * anInt6876 != 0
			     || 0 != 843976429 * anInt6893
			     || 0 != -372455761 * anInt6878);
	Class399 class399;
	synchronized (((ObjectDefinitionLoader) loader)
		      .aClass129_6956) {
	    class399 = (Class399) ((ObjectDefinitionLoader) loader)
				      .aClass129_6956.get(l);
	}
	Class89 class89
	    = (Class89) (class399 != null ? class399.anObject5795 : null);
	Class241_Sub39_Sub17 class241_sub39_sub17 = null;
	if (null == class89
	    || class103.method2301(class89.method1866(), i_99_) != 0) {
	    if (null != class89)
		i_99_ = class103.method2302(i_99_, class89.method1866());
	    int i_102_ = i_99_;
	    if (i_93_ == -2030829961 * Class527.aClass527_6928.anInt6931
		&& i_94_ > 3)
		i_102_ |= 0x5;
	    class89 = method11767(class103, i_102_, i_93_, i_94_, class536,
				  -2069916276);
	    if (class89 == null)
		return null;
	    if (Class527.aClass527_6928.anInt6931 * -2030829961 == i_93_
		&& i_94_ > 3)
		class89.method1868(2048);
	    if (bool && !bool_100_ && !bool_101_)
		class241_sub39_sub17 = class89.method1892(null);
	    class89.method1928(i_99_);
	    class399 = new Class399(class89, class241_sub39_sub17);
	    synchronized (((ObjectDefinitionLoader) loader)
			  .aClass129_6956) {
		((ObjectDefinitionLoader) loader)
		    .aClass129_6956.put(class399, l);
	    }
	} else {
	    class241_sub39_sub17
		= (Class241_Sub39_Sub17) class399.anObject5794;
	    if (bool && null == class241_sub39_sub17 && !bool_100_
		&& !bool_101_)
		class241_sub39_sub17
		    = (Class241_Sub39_Sub17) (class399.anObject5794
					      = class89.method1892(null));
	}
	if (bool_100_ || bool_101_) {
	    class89 = class89.method2019((byte) 0, i_99_, true);
	    if (bool_100_)
		class89.method1875(aByte6849,
				   anInt6850 * -626573149,
				   class166, class166_95_, i_96_, i_97_,
				   i_98_);
	    if (bool_101_)
		class89.method1927(anInt6876 * -917044237,
				   anInt6893 * 843976429,
				   anInt6878 * -372455761);
	    if (bool)
		class241_sub39_sub17 = class89.method1892(null);
	    class89.method1928(i);
	} else
	    class89 = class89.method2019((byte) 0, i, true);
	((ObjectDefinitionLoader) loader).aClass399_6966
	    .anObject5795
	    = class89;
	((ObjectDefinitionLoader) loader).aClass399_6966
	    .anObject5794
	    = class241_sub39_sub17;
	return ((ObjectDefinitionLoader) loader).aClass399_6966;
    }
    
    void method11779(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -87);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, -564032118);
	}
    }
    
    void method11780(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -12);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, 1499086002);
	}
    }
    
    public int method11781(int i, int i_103_) {
	if (null == parameters)
	    return i_103_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       parameters.get((long) i));
	if (class241_sub22 == null)
	    return i_103_;
	return -1859754807 * class241_sub22.intValue;
    }
    
    public final boolean method11782(int i) {
	if (null == modelIDs)
	    return true;
	boolean bool = true;
	synchronized (((ObjectDefinitionLoader) loader)
		      .modelDefContainer) {
	    for (int i_104_ = 0;
		 i_104_ < aByteArray6831.length; i_104_++) {
		if (i == aByteArray6831[i_104_]) {
		    for (int i_105_ = 0;
			 i_105_ < (modelIDs
				   [i_104_]).length;
			 i_105_++) {
			if (!((ObjectDefinitionLoader) loader)
				 .modelDefContainer.method4188
			     ((modelIDs[i_104_]
			       [i_105_]),
			      0, -634309266))
			    bool = false;
		    }
		}
	    }
	}
	return bool;
    }
    
    public final boolean method11783(int i) {
	if (null == modelIDs)
	    return true;
	boolean bool = true;
	synchronized (((ObjectDefinitionLoader) loader)
		      .modelDefContainer) {
	    for (int i_106_ = 0;
		 i_106_ < aByteArray6831.length; i_106_++) {
		if (i == aByteArray6831[i_106_]) {
		    for (int i_107_ = 0;
			 i_107_ < (modelIDs
				   [i_106_]).length;
			 i_107_++) {
			if (!((ObjectDefinitionLoader) loader)
				 .modelDefContainer.method4188
			     ((modelIDs[i_106_]
			       [i_107_]),
			      0, -929945134))
			    bool = false;
		    }
		}
	    }
	}
	return bool;
    }
    
    public final boolean method11784(int i) {
	if (null == modelIDs)
	    return true;
	boolean bool = true;
	synchronized (((ObjectDefinitionLoader) loader)
		      .modelDefContainer) {
	    for (int i_108_ = 0;
		 i_108_ < aByteArray6831.length; i_108_++) {
		if (i == aByteArray6831[i_108_]) {
		    for (int i_109_ = 0;
			 i_109_ < (modelIDs
				   [i_108_]).length;
			 i_109_++) {
			if (!((ObjectDefinitionLoader) loader)
				 .modelDefContainer.method4188
			     ((modelIDs[i_108_]
			       [i_109_]),
			      0, -917663642))
			    bool = false;
		    }
		}
	    }
	}
	return bool;
    }
    
    public final boolean method11785(Class477 class477) {
	if (modelIDs == null)
	    return true;
	boolean bool = true;
	synchronized (((ObjectDefinitionLoader) loader)
		      .modelDefContainer) {
	    for (int i = 0; i < modelIDs.length;
		 i++) {
		for (int i_110_ = 0;
		     i_110_ < modelIDs[i].length;
		     i_110_++) {
		    boolean bool_111_
			= (((ObjectDefinitionLoader) loader)
			       .modelDefContainer.method4188
			   (modelIDs[i][i_110_],
			    0, -1099150071));
		    bool &= bool_111_;
		    if (!bool_111_)
			class477.anInt6401
			    = 1036614483 * (((ObjectDefinition) this)
					    .modelIDs[i][i_110_]);
		}
	    }
	}
	return bool;
    }
    
    public String method11786(int i, String string, int i_112_) {
	if (null == parameters)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       parameters.get((long) i));
	if (null == class241_sub26)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    public final boolean method11787(Class477 class477) {
	if (modelIDs == null)
	    return true;
	boolean bool = true;
	synchronized (((ObjectDefinitionLoader) loader)
		      .modelDefContainer) {
	    for (int i = 0; i < modelIDs.length;
		 i++) {
		for (int i_113_ = 0;
		     i_113_ < modelIDs[i].length;
		     i_113_++) {
		    boolean bool_114_
			= (((ObjectDefinitionLoader) loader)
			       .modelDefContainer.method4188
			   (modelIDs[i][i_113_],
			    0, -1089231738));
		    bool &= bool_114_;
		    if (!bool_114_)
			class477.anInt6401
			    = 1036614483 * (((ObjectDefinition) this)
					    .modelIDs[i][i_113_]);
		}
	    }
	}
	return bool;
    }
    
    ObjectDefinition() {
	aBool6842 = false;
	anInt6852 = 1796196245;
	anInt6853 = 2059921856;
	anInt6854 = 0;
	anIntArray6862 = null;
	anIntArray6856 = null;
	aBool6875 = false;
	anInt6858 = 1098071872;
	anInt6859 = 0;
	anInt6860 = 0;
	mapSpriteID = 598427945;
	anInt6864 = -709057213;
	aBool6865 = false;
	anInt6851 = 0;
	aBool6867 = false;
	aBool6868 = false;
	aBool6869 = true;
	anInt6896 = 492716416;
	anInt6871 = -1850701952;
	anInt6872 = 663402624;
	anInt6873 = 0;
	anInt6874 = 0;
	anInt6838 = 0;
	anInt6876 = 0;
	anInt6893 = 0;
	anInt6878 = 0;
	aBool6879 = false;
	clippingFlag = false;
	anInt6881 = -1901826337;
	anInt6883 = 0;
	varBitID = -2140454431;
	varpID = -2083726957;
	anInt6886 = 992778665;
	anInt6841 = 0;
	anInt6888 = 0;
	anInt6889 = 828295657;
	anInt6887 = 0;
	anInt6891 = 0;
	aBool6840 = true;
	aBool6890 = false;
	aBool6895 = true;
	membersObject = false;
	aBool6898 = false;
	anInt6900 = 1328950016;
	anInt6855 = -264080640;
	aBool6870 = false;
	bloom = false;
	aClass518_6897 = Class518.aClass518_6786;
    }
    
    public final synchronized Class89 method11788
	(Class103 class103, int i, int i_115_, int i_116_, Class166 class166,
	 Class166 class166_117_, int i_118_, int i_119_, int i_120_,
	 Class409 class409, Class536 class536, int i_121_) {
	if (Class589.method12899(i_115_, (byte) 19))
	    i_115_ = -2030829961 * Class527.aClass527_6930.anInt6931;
	long l = (long) ((i_115_ << 3) + (objectID * -2079513015 << 10)
			 + i_116_);
	int i_122_ = i;
	l |= (long) (1931687493 * class103.anInt1456 << 29);
	if (class536 != null)
	    l |= 5713778495036234511L * ((Class536) class536).aLong6989 << 32;
	if (class409 != null)
	    i |= class409.method7356(1855650620);
	if (3 == aByte6849)
	    i |= 0x7;
	else {
	    if (aByte6849 != 0
		|| 0 != anInt6893 * 843976429)
		i |= 0x2;
	    if (anInt6876 * -917044237 != 0)
		i |= 0x1;
	    if (0 != anInt6878 * -372455761)
		i |= 0x4;
	}
	if (Class527.aClass527_6928.anInt6931 * -2030829961 == i_115_
	    && i_116_ > 3)
	    i |= 0x5;
	Class89 class89;
	synchronized (((ObjectDefinitionLoader) loader)
		      .aClass129_6961) {
	    class89 = (Class89) ((ObjectDefinitionLoader) loader)
				    .aClass129_6961.get(l);
	}
	if (null == class89
	    || class103.method2301(class89.method1866(), i) != 0) {
	    if (null != class89)
		i = class103.method2302(i, class89.method1866());
	    class89 = method11767(class103, i, i_115_, i_116_, class536,
				  -1923613758);
	    if (null == class89)
		return null;
	    synchronized (((ObjectDefinitionLoader) loader)
			  .aClass129_6961) {
		((ObjectDefinitionLoader) loader)
		    .aClass129_6961.put(class89, l);
	    }
	}
	boolean bool = false;
	if (null != class409) {
	    class89 = class89.method2019((byte) 1, i, true);
	    bool = true;
	    class409.method7357(class89, i_116_ & 0x3, (byte) -47);
	}
	if (-2030829961 * Class527.aClass527_6928.anInt6931 == i_115_
	    && i_116_ > 3) {
	    if (!bool) {
		class89 = class89.method2019((byte) 3, i, true);
		bool = true;
	    }
	    class89.method1868(2048);
	}
	if (aByte6849 != 0) {
	    if (!bool) {
		class89 = class89.method2019((byte) 3, i, true);
		bool = true;
	    }
	    class89.method1875(aByte6849,
			       -626573149 * anInt6850,
			       class166, class166_117_, i_118_, i_119_,
			       i_120_);
	}
	if (anInt6876 * -917044237 != 0
	    || 0 != anInt6893 * 843976429
	    || 0 != -372455761 * anInt6878) {
	    if (!bool) {
		class89 = class89.method2019((byte) 3, i, true);
		bool = true;
	    }
	    class89.method1927(-917044237 * anInt6876,
			       843976429 * anInt6893,
			       -372455761 * anInt6878);
	}
	if (bool)
	    class89.method1928(i_122_);
	return class89;
    }
    
    Class89 method11789(Class103 class103, int i, int i_123_, int i_124_,
			Class536 class536) {
	int i_125_ = 64 + -1803905933 * anInt6859;
	int i_126_ = 850 + 203472801 * anInt6860;
	int i_127_ = i;
	boolean bool
	    = (aBool6868
	       || (i_123_ == -2030829961 * Class527.aClass527_6910.anInt6931
		   && i_124_ > 3));
	if (bool)
	    i |= 0x10;
	if (0 == i_124_) {
	    if (128 != 705720875 * anInt6896
		|| 0 != anInt6873 * 606992687)
		i |= 0x1;
	    if (anInt6872 * -1990653039 != 128
		|| 0 != anInt6838 * -1326830723)
		i |= 0x4;
	} else
	    i |= 0xd;
	if (128 != 1410035183 * anInt6871
	    || anInt6874 * -1440551265 != 0)
	    i |= 0x2;
	if (null != originalColors)
	    i |= 0x4000;
	if (aShortArray6837 != null)
	    i |= 0x8000;
	if (0 != aByte6844)
	    i |= 0x80000;
	Class89 class89 = null;
	if (null != aByteArray6831) {
	    int i_128_ = -1;
	    for (int i_129_ = 0;
		 i_129_ < aByteArray6831.length; i_129_++) {
		if (i_123_ == aByteArray6831[i_129_]) {
		    i_128_ = i_129_;
		    break;
		}
	    }
	    if (-1 == i_128_)
		return null;
	    int[] is = ((null != class536
			 && ((Class536) class536).anIntArray6987 != null)
			? ((Class536) class536).anIntArray6987
			: modelIDs[i_128_]);
	    int i_130_ = is.length;
	    if (i_130_ > 0) {
		long l = (long) (1931687493 * class103.anInt1456);
		for (int i_131_ = 0; i_131_ < i_130_; i_131_++)
		    l = (long) is[i_131_] + l * 67783L;
		synchronized (((ObjectDefinitionLoader) loader)
			      .aClass129_6960) {
		    class89 = ((Class89)
			       ((ObjectDefinitionLoader) loader)
				   .aClass129_6960.get(l));
		}
		if (null != class89) {
		    if (i_125_ != class89.method1905())
			i |= 0x1000;
		    if (i_126_ != class89.method1862())
			i |= 0x2000;
		}
		if (null == class89
		    || class103.method2301(class89.method1866(), i) != 0) {
		    int i_132_ = i | 0x1f01f;
		    if (null != class89)
			i_132_ = class103.method2302(i_132_,
						     class89.method1866());
		    Class161 class161 = null;
		    synchronized (((ObjectDefinitionLoader) loader)
				  .aClass161Array6965) {
			for (int i_133_ = 0; i_133_ < i_130_; i_133_++) {
			    synchronized (((ObjectDefinitionLoader)
					   loader)
					  .modelDefContainer) {
				class161
				    = Class161.method3448((((ObjectDefinitionLoader)
							    (((ObjectDefinition) this)
							     .loader))
							   .modelDefContainer),
							  is[i_133_], 0);
			    }
			    if (class161 == null) {
				Class89 class89_134_ = null;
				return class89_134_;
			    }
			    if (class161.anInt1789 < 13)
				class161.method3464(2);
			    if (i_130_ > 1)
				((ObjectDefinitionLoader) loader)
				    .aClass161Array6965[i_133_]
				    = class161;
			}
			if (i_130_ > 1)
			    class161
				= new Class161((((ObjectDefinitionLoader) (((ObjectDefinition) this)
							     .loader))
						.aClass161Array6965),
					       i_130_);
		    }
		    class89
			= class103.method2356(class161, i_132_,
					      (((ObjectDefinitionLoader) (((ObjectDefinition) this)
							    .loader))
					       .anInt6963) * 418505353,
					      i_125_, i_126_);
		    synchronized (((ObjectDefinitionLoader) loader)
				  .aClass129_6960) {
			((ObjectDefinitionLoader) loader)
			    .aClass129_6960.put(class89, l);
		    }
		}
	    }
	}
	if (class89 == null)
	    return null;
	Class89 class89_135_ = class89.method2019((byte) 0, i, true);
	if (i_125_ != class89.method1905())
	    class89_135_.method1903(i_125_);
	if (i_126_ != class89.method1862())
	    class89_135_.method2057(i_126_);
	if (bool)
	    class89_135_.method1873();
	if (i_123_ == Class527.aClass527_6930.anInt6931 * -2030829961
	    && i_124_ > 3) {
	    class89_135_.method1869(2048);
	    class89_135_.method1927(180, 0, -180);
	}
	i_124_ &= 0x3;
	if (i_124_ == 1)
	    class89_135_.method1869(4096);
	else if (2 == i_124_)
	    class89_135_.method1869(8192);
	else if (i_124_ == 3)
	    class89_135_.method1869(12288);
	if (originalColors != null) {
	    short[] is;
	    if (null != class536
		&& null != ((Class536) class536).aShortArray6986)
		is = ((Class536) class536).aShortArray6986;
	    else
		is = modifiedColors;
	    for (int i_136_ = 0;
		 i_136_ < originalColors.length; i_136_++) {
		if (aByteArray6901 != null
		    && i_136_ < aByteArray6901.length)
		    class89_135_.method1908((originalColors
					     [i_136_]),
					    (aShortArray6828
					     [(aByteArray6901
					       [i_136_]) & 0xff]));
		else
		    class89_135_.method1908((originalColors
					     [i_136_]),
					    is[i_136_]);
	    }
	}
	if (aShortArray6837 != null) {
	    short[] is;
	    if (null != class536
		&& null != ((Class536) class536).aShortArray6988)
		is = ((Class536) class536).aShortArray6988;
	    else
		is = aShortArray6899;
	    for (int i_137_ = 0;
		 i_137_ < aShortArray6837.length; i_137_++)
		class89_135_.method1985((aShortArray6837
					 [i_137_]),
					is[i_137_]);
	}
	if (aByte6844 != 0)
	    class89_135_.method1911(aByte6884,
				    aByte6902,
				    aByte6843,
				    aByte6844 & 0xff);
	if (705720875 * anInt6896 != 128
	    || 128 != 1410035183 * anInt6871
	    || 128 != -1990653039 * anInt6872)
	    class89_135_.method1863(705720875 * anInt6896,
				    1410035183 * anInt6871,
				    anInt6872 * -1990653039);
	if (anInt6873 * 606992687 != 0
	    || -1440551265 * anInt6874 != 0
	    || anInt6838 * -1326830723 != 0)
	    class89_135_.method1927(anInt6873 * 606992687,
				    -1440551265 * anInt6874,
				    anInt6838 * -1326830723);
	class89_135_.method1928(i_127_);
	return class89_135_;
    }
    
    public boolean method11790() {
	return null != anIntArray6862;
    }
    
    Class89 method11791(Class103 class103, int i, int i_138_, int i_139_,
			Class536 class536) {
	int i_140_ = 64 + -1803905933 * anInt6859;
	int i_141_ = 850 + 203472801 * anInt6860;
	int i_142_ = i;
	boolean bool
	    = (aBool6868
	       || (i_138_ == -2030829961 * Class527.aClass527_6910.anInt6931
		   && i_139_ > 3));
	if (bool)
	    i |= 0x10;
	if (0 == i_139_) {
	    if (128 != 705720875 * anInt6896
		|| 0 != anInt6873 * 606992687)
		i |= 0x1;
	    if (anInt6872 * -1990653039 != 128
		|| 0 != anInt6838 * -1326830723)
		i |= 0x4;
	} else
	    i |= 0xd;
	if (128 != 1410035183 * anInt6871
	    || anInt6874 * -1440551265 != 0)
	    i |= 0x2;
	if (null != originalColors)
	    i |= 0x4000;
	if (aShortArray6837 != null)
	    i |= 0x8000;
	if (0 != aByte6844)
	    i |= 0x80000;
	Class89 class89 = null;
	if (null != aByteArray6831) {
	    int i_143_ = -1;
	    for (int i_144_ = 0;
		 i_144_ < aByteArray6831.length; i_144_++) {
		if (i_138_ == aByteArray6831[i_144_]) {
		    i_143_ = i_144_;
		    break;
		}
	    }
	    if (-1 == i_143_)
		return null;
	    int[] is = ((null != class536
			 && ((Class536) class536).anIntArray6987 != null)
			? ((Class536) class536).anIntArray6987
			: modelIDs[i_143_]);
	    int i_145_ = is.length;
	    if (i_145_ > 0) {
		long l = (long) (1931687493 * class103.anInt1456);
		for (int i_146_ = 0; i_146_ < i_145_; i_146_++)
		    l = (long) is[i_146_] + l * 67783L;
		synchronized (((ObjectDefinitionLoader) loader)
			      .aClass129_6960) {
		    class89 = ((Class89)
			       ((ObjectDefinitionLoader) loader)
				   .aClass129_6960.get(l));
		}
		if (null != class89) {
		    if (i_140_ != class89.method1905())
			i |= 0x1000;
		    if (i_141_ != class89.method1862())
			i |= 0x2000;
		}
		if (null == class89
		    || class103.method2301(class89.method1866(), i) != 0) {
		    int i_147_ = i | 0x1f01f;
		    if (null != class89)
			i_147_ = class103.method2302(i_147_,
						     class89.method1866());
		    Class161 class161 = null;
		    synchronized (((ObjectDefinitionLoader) loader)
				  .aClass161Array6965) {
			for (int i_148_ = 0; i_148_ < i_145_; i_148_++) {
			    synchronized (((ObjectDefinitionLoader)
					   loader)
					  .modelDefContainer) {
				class161
				    = Class161.method3448((((ObjectDefinitionLoader)
							    (((ObjectDefinition) this)
							     .loader))
							   .modelDefContainer),
							  is[i_148_], 0);
			    }
			    if (class161 == null) {
				Class89 class89_149_ = null;
				return class89_149_;
			    }
			    if (class161.anInt1789 < 13)
				class161.method3464(2);
			    if (i_145_ > 1)
				((ObjectDefinitionLoader) loader)
				    .aClass161Array6965[i_148_]
				    = class161;
			}
			if (i_145_ > 1)
			    class161
				= new Class161((((ObjectDefinitionLoader) (((ObjectDefinition) this)
							     .loader))
						.aClass161Array6965),
					       i_145_);
		    }
		    class89
			= class103.method2356(class161, i_147_,
					      (((ObjectDefinitionLoader) (((ObjectDefinition) this)
							    .loader))
					       .anInt6963) * 418505353,
					      i_140_, i_141_);
		    synchronized (((ObjectDefinitionLoader) loader)
				  .aClass129_6960) {
			((ObjectDefinitionLoader) loader)
			    .aClass129_6960.put(class89, l);
		    }
		}
	    }
	}
	if (class89 == null)
	    return null;
	Class89 class89_150_ = class89.method2019((byte) 0, i, true);
	if (i_140_ != class89.method1905())
	    class89_150_.method1903(i_140_);
	if (i_141_ != class89.method1862())
	    class89_150_.method2057(i_141_);
	if (bool)
	    class89_150_.method1873();
	if (i_138_ == Class527.aClass527_6930.anInt6931 * -2030829961
	    && i_139_ > 3) {
	    class89_150_.method1869(2048);
	    class89_150_.method1927(180, 0, -180);
	}
	i_139_ &= 0x3;
	if (i_139_ == 1)
	    class89_150_.method1869(4096);
	else if (2 == i_139_)
	    class89_150_.method1869(8192);
	else if (i_139_ == 3)
	    class89_150_.method1869(12288);
	if (originalColors != null) {
	    short[] is;
	    if (null != class536
		&& null != ((Class536) class536).aShortArray6986)
		is = ((Class536) class536).aShortArray6986;
	    else
		is = modifiedColors;
	    for (int i_151_ = 0;
		 i_151_ < originalColors.length; i_151_++) {
		if (aByteArray6901 != null
		    && i_151_ < aByteArray6901.length)
		    class89_150_.method1908((originalColors
					     [i_151_]),
					    (aShortArray6828
					     [(aByteArray6901
					       [i_151_]) & 0xff]));
		else
		    class89_150_.method1908((originalColors
					     [i_151_]),
					    is[i_151_]);
	    }
	}
	if (aShortArray6837 != null) {
	    short[] is;
	    if (null != class536
		&& null != ((Class536) class536).aShortArray6988)
		is = ((Class536) class536).aShortArray6988;
	    else
		is = aShortArray6899;
	    for (int i_152_ = 0;
		 i_152_ < aShortArray6837.length; i_152_++)
		class89_150_.method1985((aShortArray6837
					 [i_152_]),
					is[i_152_]);
	}
	if (aByte6844 != 0)
	    class89_150_.method1911(aByte6884,
				    aByte6902,
				    aByte6843,
				    aByte6844 & 0xff);
	if (705720875 * anInt6896 != 128
	    || 128 != 1410035183 * anInt6871
	    || 128 != -1990653039 * anInt6872)
	    class89_150_.method1863(705720875 * anInt6896,
				    1410035183 * anInt6871,
				    anInt6872 * -1990653039);
	if (anInt6873 * 606992687 != 0
	    || -1440551265 * anInt6874 != 0
	    || anInt6838 * -1326830723 != 0)
	    class89_150_.method1927(anInt6873 * 606992687,
				    -1440551265 * anInt6874,
				    anInt6838 * -1326830723);
	class89_150_.method1928(i_142_);
	return class89_150_;
    }
    
    public boolean method11792(int i, int i_153_) {
	if (null != anIntArray6862 && -1 != i) {
	    for (int i_154_ = 0;
		 i_154_ < anIntArray6862.length; i_154_++) {
		if (i == anIntArray6862[i_154_])
		    return true;
	    }
	}
	return false;
    }
    
    public final boolean method11793(int i, byte i_155_) {
		if (null == modelIDs) {
		    return true;
		}
		boolean bool = true;
		synchronized (loader.modelDefContainer) {
		    for (int i_156_ = 0; i_156_ < aByteArray6831.length; i_156_++) {
				if (i == aByteArray6831[i_156_]) {
				    for (int i_157_ = 0; i_157_ < modelIDs[i_156_].length; i_157_++) {
						if (!loader.modelDefContainer.method4188(modelIDs[i_156_][i_157_], 0, -1908532626)) {
						    bool = false;
						}
				    }
				}
		    }
		}
		return bool;
    }
    
    public final ObjectDefinition dummyMethod11794(Interface13 interface13, Interface11 interface11) {
		int i = -1;
		if (-1 != 230637023 * varBitID) {
		    VarBitType class316
			= interface13.method93(varBitID * 230637023, 1107515290);
		    if (null != class316)
			i = interface11.getVarBitValue(class316, (short) 17000);
		} else if (872338277 * varpID != -1) {
		    VarType class179
			= interface13.method96(VarDomainType.PLAYER,
					       varpID * 872338277,
					       (byte) 105);
		    if (null != class179)
			i = interface11.getVarValueInt(class179, -252546064);
		}
		if (i < 0 || i >= toObjectIDs.length - 1) {
		    int i_158_ = toObjectIDs[toObjectIDs.length - 1];
		    if (i_158_ != -1) {
				return loader.getObjectDefinition(i_158_, 577892407);
			}
		    return null;
		}
		if (-1 == toObjectIDs[i])
		    return null;
		return loader.getObjectDefinition(toObjectIDs[i], 577892407);
    }
    
    public int method11795(int i, int i_159_) {
	if (null == parameters)
	    return i_159_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       parameters.get((long) i));
	if (class241_sub22 == null)
	    return i_159_;
	return -1859754807 * class241_sub22.intValue;
    }
    
    public boolean method11796() {
	if (null == toObjectIDs)
	    return -754260633 * anInt6886 != -1 || anIntArray6892 != null;
	for (int i = 0; i < toObjectIDs.length; i++) {
	    if (-1 != toObjectIDs[i]) {
		ObjectDefinition class526_160_
		    = loader
			  .getObjectDefinition(toObjectIDs[i], 577892407);
		if (-1 != class526_160_.anInt6886 * -754260633
		    || class526_160_.anIntArray6892 != null)
		    return true;
	    }
	}
	return false;
    }
    
    public final ObjectDefinition method11797(Interface13 interface13,
				      Interface11 interface11) {
	int i = -1;
	if (-1 != 230637023 * varBitID) {
	    VarBitType class316
		= interface13.method93(varBitID * 230637023,
				       1299123488);
	    if (null != class316)
		i = interface11.getVarBitValue(class316, (short) 27321);
	} else if (872338277 * varpID != -1) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       varpID * 872338277,
				       (byte) 32);
	    if (null != class179)
		i = interface11.getVarValueInt(class179, -298654666);
	}
	if (i < 0 || i >= toObjectIDs.length - 1) {
	    int i_161_ = toObjectIDs[toObjectIDs.length - 1];
	    if (i_161_ != -1)
		return loader.getObjectDefinition(i_161_,
								    577892407);
	    return null;
	}
	if (-1 == toObjectIDs[i])
	    return null;
	return loader.getObjectDefinition(toObjectIDs[i],
							    577892407);
    }
    
    public int method11798(int i, int i_162_) {
	if (null == parameters)
	    return i_162_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       parameters.get((long) i));
	if (class241_sub22 == null)
	    return i_162_;
	return -1859754807 * class241_sub22.intValue;
    }
    
    Class89 method11799(Class103 class103, int i, int i_163_, int i_164_,
			Class536 class536) {
	int i_165_ = 64 + -1803905933 * anInt6859;
	int i_166_ = 850 + 203472801 * anInt6860;
	int i_167_ = i;
	boolean bool
	    = (aBool6868
	       || (i_163_ == -2030829961 * Class527.aClass527_6910.anInt6931
		   && i_164_ > 3));
	if (bool)
	    i |= 0x10;
	if (0 == i_164_) {
	    if (128 != 705720875 * anInt6896
		|| 0 != anInt6873 * 606992687)
		i |= 0x1;
	    if (anInt6872 * -1990653039 != 128
		|| 0 != anInt6838 * -1326830723)
		i |= 0x4;
	} else
	    i |= 0xd;
	if (128 != 1410035183 * anInt6871
	    || anInt6874 * -1440551265 != 0)
	    i |= 0x2;
	if (null != originalColors)
	    i |= 0x4000;
	if (aShortArray6837 != null)
	    i |= 0x8000;
	if (0 != aByte6844)
	    i |= 0x80000;
	Class89 class89 = null;
	if (null != aByteArray6831) {
	    int i_168_ = -1;
	    for (int i_169_ = 0;
		 i_169_ < aByteArray6831.length; i_169_++) {
		if (i_163_ == aByteArray6831[i_169_]) {
		    i_168_ = i_169_;
		    break;
		}
	    }
	    if (-1 == i_168_)
		return null;
	    int[] is = ((null != class536
			 && ((Class536) class536).anIntArray6987 != null)
			? ((Class536) class536).anIntArray6987
			: modelIDs[i_168_]);
	    int i_170_ = is.length;
	    if (i_170_ > 0) {
		long l = (long) (1931687493 * class103.anInt1456);
		for (int i_171_ = 0; i_171_ < i_170_; i_171_++)
		    l = (long) is[i_171_] + l * 67783L;
		synchronized (((ObjectDefinitionLoader) loader)
			      .aClass129_6960) {
		    class89 = ((Class89)
			       ((ObjectDefinitionLoader) loader)
				   .aClass129_6960.get(l));
		}
		if (null != class89) {
		    if (i_165_ != class89.method1905())
			i |= 0x1000;
		    if (i_166_ != class89.method1862())
			i |= 0x2000;
		}
		if (null == class89
		    || class103.method2301(class89.method1866(), i) != 0) {
		    int i_172_ = i | 0x1f01f;
		    if (null != class89)
			i_172_ = class103.method2302(i_172_,
						     class89.method1866());
		    Class161 class161 = null;
		    synchronized (((ObjectDefinitionLoader) loader)
				  .aClass161Array6965) {
			for (int i_173_ = 0; i_173_ < i_170_; i_173_++) {
			    synchronized (((ObjectDefinitionLoader)
					   loader)
					  .modelDefContainer) {
				class161
				    = Class161.method3448((((ObjectDefinitionLoader)
							    (((ObjectDefinition) this)
							     .loader))
							   .modelDefContainer),
							  is[i_173_], 0);
			    }
			    if (class161 == null) {
				Class89 class89_174_ = null;
				return class89_174_;
			    }
			    if (class161.anInt1789 < 13)
				class161.method3464(2);
			    if (i_170_ > 1)
				((ObjectDefinitionLoader) loader)
				    .aClass161Array6965[i_173_]
				    = class161;
			}
			if (i_170_ > 1)
			    class161
				= new Class161((((ObjectDefinitionLoader) (((ObjectDefinition) this)
							     .loader))
						.aClass161Array6965),
					       i_170_);
		    }
		    class89
			= class103.method2356(class161, i_172_,
					      (((ObjectDefinitionLoader) (((ObjectDefinition) this)
							    .loader))
					       .anInt6963) * 418505353,
					      i_165_, i_166_);
		    synchronized (((ObjectDefinitionLoader) loader)
				  .aClass129_6960) {
			((ObjectDefinitionLoader) loader)
			    .aClass129_6960.put(class89, l);
		    }
		}
	    }
	}
	if (class89 == null)
	    return null;
	Class89 class89_175_ = class89.method2019((byte) 0, i, true);
	if (i_165_ != class89.method1905())
	    class89_175_.method1903(i_165_);
	if (i_166_ != class89.method1862())
	    class89_175_.method2057(i_166_);
	if (bool)
	    class89_175_.method1873();
	if (i_163_ == Class527.aClass527_6930.anInt6931 * -2030829961
	    && i_164_ > 3) {
	    class89_175_.method1869(2048);
	    class89_175_.method1927(180, 0, -180);
	}
	i_164_ &= 0x3;
	if (i_164_ == 1)
	    class89_175_.method1869(4096);
	else if (2 == i_164_)
	    class89_175_.method1869(8192);
	else if (i_164_ == 3)
	    class89_175_.method1869(12288);
	if (originalColors != null) {
	    short[] is;
	    if (null != class536
		&& null != ((Class536) class536).aShortArray6986)
		is = ((Class536) class536).aShortArray6986;
	    else
		is = modifiedColors;
	    for (int i_176_ = 0;
		 i_176_ < originalColors.length; i_176_++) {
		if (aByteArray6901 != null
		    && i_176_ < aByteArray6901.length)
		    class89_175_.method1908((originalColors
					     [i_176_]),
					    (aShortArray6828
					     [(aByteArray6901
					       [i_176_]) & 0xff]));
		else
		    class89_175_.method1908((originalColors
					     [i_176_]),
					    is[i_176_]);
	    }
	}
	if (aShortArray6837 != null) {
	    short[] is;
	    if (null != class536
		&& null != ((Class536) class536).aShortArray6988)
		is = ((Class536) class536).aShortArray6988;
	    else
		is = aShortArray6899;
	    for (int i_177_ = 0;
		 i_177_ < aShortArray6837.length; i_177_++)
		class89_175_.method1985((aShortArray6837
					 [i_177_]),
					is[i_177_]);
	}
	if (aByte6844 != 0)
	    class89_175_.method1911(aByte6884,
				    aByte6902,
				    aByte6843,
				    aByte6844 & 0xff);
	if (705720875 * anInt6896 != 128
	    || 128 != 1410035183 * anInt6871
	    || 128 != -1990653039 * anInt6872)
	    class89_175_.method1863(705720875 * anInt6896,
				    1410035183 * anInt6871,
				    anInt6872 * -1990653039);
	if (anInt6873 * 606992687 != 0
	    || -1440551265 * anInt6874 != 0
	    || anInt6838 * -1326830723 != 0)
	    class89_175_.method1927(anInt6873 * 606992687,
				    -1440551265 * anInt6874,
				    anInt6838 * -1326830723);
	class89_175_.method1928(i_167_);
	return class89_175_;
    }
    
    public int method11800() {
	if (null != anIntArray6862) {
	    if (anIntArray6862.length > 1) {
		int i = (int) (Math.random() * 65535.0);
		for (int i_178_ = 0;
		     i_178_ < anIntArray6862.length;
		     i_178_++) {
		    if (i <= anIntArray6856[i_178_])
			return anIntArray6862[i_178_];
		    i -= anIntArray6856[i_178_];
		}
	    } else
		return anIntArray6862[0];
	}
	return -1;
    }
    
    public boolean method11801() {
	return null != anIntArray6862;
    }
    
    public boolean method11802() {
	if (null == toObjectIDs)
	    return -754260633 * anInt6886 != -1 || anIntArray6892 != null;
	for (int i = 0; i < toObjectIDs.length; i++) {
	    if (-1 != toObjectIDs[i]) {
		ObjectDefinition class526_179_
		    = loader
			  .getObjectDefinition(toObjectIDs[i], 577892407);
		if (-1 != class526_179_.anInt6886 * -754260633
		    || class526_179_.anIntArray6892 != null)
		    return true;
	    }
	}
	return false;
    }
    
    public int method11803() {
	if (null != anIntArray6862) {
	    if (anIntArray6862.length > 1) {
		int i = (int) (Math.random() * 65535.0);
		for (int i_180_ = 0;
		     i_180_ < anIntArray6862.length;
		     i_180_++) {
		    if (i <= anIntArray6856[i_180_])
			return anIntArray6862[i_180_];
		    i -= anIntArray6856[i_180_];
		}
	    } else
		return anIntArray6862[0];
	}
	return -1;
    }
    
    public final ObjectDefinition method11804(Interface13 interface13,
				      Interface11 interface11) {
	int i = -1;
	if (-1 != 230637023 * varBitID) {
	    VarBitType class316
		= interface13.method93(varBitID * 230637023,
				       2088971262);
	    if (null != class316)
		i = interface11.getVarBitValue(class316, (short) 19643);
	} else if (872338277 * varpID != -1) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       varpID * 872338277,
				       (byte) 26);
	    if (null != class179)
		i = interface11.getVarValueInt(class179, -105451398);
	}
	if (i < 0 || i >= toObjectIDs.length - 1) {
	    int i_181_ = toObjectIDs[toObjectIDs.length - 1];
	    if (i_181_ != -1)
		return loader.getObjectDefinition(i_181_,
								    577892407);
	    return null;
	}
	if (-1 == toObjectIDs[i])
	    return null;
	return loader.getObjectDefinition(toObjectIDs[i],
							    577892407);
    }
    
    public int method11805() {
	if (null != anIntArray6862) {
	    if (anIntArray6862.length > 1) {
		int i = (int) (Math.random() * 65535.0);
		for (int i_182_ = 0;
		     i_182_ < anIntArray6862.length;
		     i_182_++) {
		    if (i <= anIntArray6856[i_182_])
			return anIntArray6862[i_182_];
		    i -= anIntArray6856[i_182_];
		}
	    } else
		return anIntArray6862[0];
	}
	return -1;
    }
    
    public int[] method11806() {
	return anIntArray6862;
    }
    
    public boolean method11807(int i) {
	if (null != anIntArray6862 && -1 != i) {
	    for (int i_183_ = 0;
		 i_183_ < anIntArray6862.length; i_183_++) {
		if (i == anIntArray6862[i_183_])
		    return true;
	    }
	}
	return false;
    }
    
    public static boolean method11808(int i, int i_184_) {
	return (i >= Class527.aClass527_6924.anInt6931 * -2030829961
		&& i <= -2030829961 * Class527.aClass527_6927.anInt6931);
    }
    
    static boolean method11809(int i, int i_185_) {
	return (44 == i || 45 == i || i == 46 || 47 == i || i == 48 || 49 == i
		|| 50 == i || i == 51 || 52 == i || 53 == i || 15 == i);
    }
    
    static void method11810(int plane, int posX, int posY, GroundItem groundItem, int i_188_) {
		long posHash = (long) (plane << 28 | posY << 14 | posX);
		WorldTile class241_sub44
		    = (WorldTile) client.aClass407_8452.get(posHash);
		if (class241_sub44 == null) {
		    class241_sub44 = new WorldTile();
		    client.aClass407_8452.put(class241_sub44, posHash);
		    class241_sub44.aClass429_10181.addNode(groundItem,
							      (short) -13170);
		} else {
		    ItemDefinition itemDef = JS5.itemDefLoader.list(
		    		(groundItem.itemID * 2088213913), (short) -9262);
		    int newValue = 483161521 * itemDef.value;
		    if (-942978965 * itemDef.stackable == 1) {
		    	newValue *= 1 + (7683145 * ((GroundItem) groundItem).itemAmount);			
		    }
		    for (GroundItem class241_sub31_190_ = ((GroundItem) class241_sub44.aClass429_10181.method7694(16711935));
		    		null != class241_sub31_190_;
		    		class241_sub31_190_ = (GroundItem) class241_sub44.aClass429_10181.method7692(1269616755)) {
		    	itemDef = JS5.itemDefLoader.list(
		    			(class241_sub31_190_.itemID * 2088213913), (short) -4927);
				int prevItemValue = 483161521 * itemDef.value;
				if (1 == itemDef.stackable * -942978965) {
					prevItemValue *= 1 + (((GroundItem) class241_sub31_190_).itemAmount) * 7683145;
				}
				if (newValue > prevItemValue) {
				    Class326.method6004(groundItem, class241_sub31_190_, -989675525);
				    return;
				}
		    }
		    class241_sub44.aClass429_10181.addNode(groundItem, (short) -29674);
		}
    }
    
    public static Class425[] method11811(int i) {
	return (new Class425[]
		{ Class425.aClass425_6072, Class425.aClass425_6070,
		  Class425.aClass425_6071, Class425.aClass425_6076,
		  Class425.aClass425_6077, Class425.aClass425_6079,
		  Class425.aClass425_6075, Class425.aClass425_6074,
		  Class425.aClass425_6073 });
    }
}
