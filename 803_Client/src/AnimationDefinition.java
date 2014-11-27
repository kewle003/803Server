/* Class549 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationDefinition
{
    public boolean aBool7066;
    AnimationDefinitionLoader loader;//aClass556_7067
    public int[][] handledSounds;//anIntArrayArray7068
    public int[] anIntArray7069;
    public int animationID;//anInt7070
    public int[] anIntArray7071;
    public int duration = 0;//anInt7072
    public AnimationConfig config;//aClass543_7073
    public int[] frameDurations;//anIntArray7074
    public int anInt7075 = -2027290735;
    public int anInt7076 = 1107184331;
    public int anInt7077 = -1116634715;
    public int anInt7078;
    public int anInt7079;
    public int itemInHand = 1041903851;//anInt7080
    public int anInt7081;
    public static boolean aBool7082 = false;
    public boolean aBool7083;
    HashTable paramaters;//aClass407_7084
    public int[] anIntArray7085;
    public int anInt7086;
    public int[] soundMinDelay;//anIntArray7087
    public int anInt7088;
    public int[] soundMaxDelay;//anIntArray7089
    
    void method12004(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -36);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, -1780357993);
	}
    }
    
    public String method12005(int i, String string, int i_0_) {
	if (null == paramaters)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       paramaters.get((long) i));
	if (null == class241_sub26)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    void decode/*method12006*/(RSByteBuffer buffer, int opcode, int i_1_) {
		if (opcode == 1) {
		    int length = buffer.readUnsignedShort(1162222719);
		    frameDurations = new int[length];
		    for (int index = 0; index < length; index++) {
		    	frameDurations[index] = buffer.readUnsignedShort(1162222719);
		    }
		    anIntArray7069 = new int[length];
		    for (int index = 0; index < length; index++) {
		    	anIntArray7069[index] = buffer.readUnsignedShort(1162222719);
		    }
		    for (int index = 0; index < length; index++) {
		    	anIntArray7069[index] = (buffer.readUnsignedShort(1162222719) << 16) + anIntArray7069[index];
		    }
		} else if (opcode == 2) {
		    anInt7075 = buffer.readUnsignedShort(1162222719) * 2027290735;
		} else if (opcode == 5) {
		    anInt7076 = buffer.readUnsignedByte((byte) 97) * -637556593;
		} else if (6 == opcode) {
		    anInt7077 = buffer.readUnsignedShort(1162222719) * 1116634715;
		} else if (7 == opcode) {
		    itemInHand = buffer.readUnsignedShort(1162222719) * -1041903851;
		} else if (opcode == 8) {
		    anInt7079 = buffer.readUnsignedByte((byte) 23) * -1929161823;
		} else if (opcode == 9) {
		    anInt7088 = buffer.readUnsignedByte((byte) -18) * 1999418723;
		} else if (opcode == 10) {
		    anInt7081 = buffer.readUnsignedByte((byte) -11) * -1807237171;
		} else if (11 == opcode) {
		    anInt7078 = buffer.readUnsignedByte((byte) -17) * -749580149;
		} else if (12 == opcode) {
		    int length = buffer.readUnsignedByte((byte) -44);
		    anIntArray7071 = new int[length];
		    for (int index = 0; index < length; index++) {
		    	anIntArray7071[index] = buffer.readUnsignedShort(1162222719);
		    }
		    for (int index = 0; index < length; index++) {
		    	anIntArray7071[index] = (buffer.readUnsignedShort(1162222719) << 16) + anIntArray7071[index];
		    }
		} else if (13 == opcode) {
		    int length = buffer.readUnsignedShort(1162222719);
		    handledSounds = new int[length][];
		    for (int index = 0; index < length; index++) {
		    	int values = buffer.readUnsignedByte((byte) -12);
				if (values > 0) {
				    handledSounds[index] = new int[values];
				    handledSounds[index][0] = buffer.readTriByte(1771646547);
				    for (int valueIdx = 1; valueIdx < values; valueIdx++) {
				    	handledSounds[index][valueIdx] = buffer.readUnsignedShort(1162222719);
				    }
				}
		    }
		} else if (14 == opcode) {
		    aBool7083 = true;
		} else if (opcode == 15) {
		    aBool7066 = true;
		} else if (16 != opcode && 18 != opcode) {
		    if (19 == opcode) {
				if (null == anIntArray7085) {
				    anIntArray7085 = new int[handledSounds.length];
				    for (int index = 0; index < handledSounds.length; index++) {
				    	anIntArray7085[index] = 255;
				    }
				}
				anIntArray7085[buffer.readUnsignedByte((byte) 105)] = buffer.readUnsignedByte((byte) -18);
		    } else if (opcode == 20) {
				if (soundMaxDelay == null || null == soundMinDelay) {
				    soundMaxDelay = new int[handledSounds.length];
				    soundMinDelay = new int[handledSounds.length];
				    for (int index = 0; index < handledSounds.length; index++) {
						soundMaxDelay[index] = 256;
						soundMinDelay[index] = 256;
				    }
				}
				int index = buffer.readUnsignedByte((byte) -29);
				soundMaxDelay[index] = buffer.readUnsignedShort(1162222719);
				soundMinDelay[index] = buffer.readUnsignedShort(1162222719);
		    } else if (opcode == 22) {
		    	anInt7086 = buffer.readUnsignedByte((byte) 25) * -1464766871;
		    } else if (opcode == 23) {
		    	buffer.readUnsignedShort(1162222719);
		    } else if (opcode == 24) {
				int configID = buffer.readUnsignedShort(1162222719);
				config = loader.animationConfigLoader.getConfig(configID, -1946742207);
		    } else if (249 == opcode) {
				int length = buffer.readUnsignedByte((byte) 44);
				if (paramaters == null) {
				    int i_18_ = Class480.method11001(length, (byte) 47);
				    paramaters = new HashTable(i_18_);
				}
				for (int index = 0; index < length; index++) {
				    boolean stringInstance = buffer.readUnsignedByte((byte) -62) == 1;
				    int key = buffer.readTriByte(1771646547);
				    Node value;
				    if (stringInstance) {
				    	value = new ObjectNode(buffer.readString(170932207));
				    } else {
				    	value = new IntegerNode(buffer.readInt((byte) 87));
				    }
				    paramaters.put(value, (long) key);
				}
		    }
		}
    }
    
    void postDecodeEvent/*method12007*/(short i) {
		if (2119332939 * anInt7088 == -1) {
		    if (config != null
			&& config.aBoolArray7014 != null)
			anInt7088 = -296129850;
		    else
			anInt7088 = 0;
		}
		if (anInt7081 * 377701637 == -1) {
		    if (null != config && config.aBoolArray7014 != null) {
		    	anInt7081 = 680492954;
		    } else {
		    	anInt7081 = 0;
		    }
		}
		if (frameDurations != null) {
		    duration = 0;
		    for (int i_21_ = 0; i_21_ < frameDurations.length; i_21_++) {
		    	duration += frameDurations[i_21_] * -184347003;
		    }
		}
    }
    
    void read/*method12008*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) 17);
		    if (opcode == 0) {
			break;
	            }
		    decode(buffer, opcode, -2045110389);
		}
    }
    
    public int method12009(int i, int i_23_, int i_24_) {
	if (null == paramaters)
	    return i_23_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       paramaters.get((long) i));
	if (class241_sub22 == null)
	    return i_23_;
	return -1859754807 * class241_sub22.intValue;
    }
    
    void method12010(RSByteBuffer class241_sub3, int i) {
	if (i == 1) {
	    int i_25_ = class241_sub3.readUnsignedShort(1162222719);
	    frameDurations = new int[i_25_];
	    for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
		frameDurations[i_26_] = class241_sub3.readUnsignedShort(1162222719);
	    anIntArray7069 = new int[i_25_];
	    for (int i_27_ = 0; i_27_ < i_25_; i_27_++)
		anIntArray7069[i_27_] = class241_sub3.readUnsignedShort(1162222719);
	    for (int i_28_ = 0; i_28_ < i_25_; i_28_++)
		anIntArray7069[i_28_] = (class241_sub3.readUnsignedShort(1162222719)
					 << 16) + anIntArray7069[i_28_];
	} else if (i == 2)
	    anInt7075 = class241_sub3.readUnsignedShort(1162222719) * 2027290735;
	else if (i == 5)
	    anInt7076 = class241_sub3.readUnsignedByte((byte) 11) * -637556593;
	else if (6 == i)
	    anInt7077 = class241_sub3.readUnsignedShort(1162222719) * 1116634715;
	else if (7 == i)
	    itemInHand = class241_sub3.readUnsignedShort(1162222719) * -1041903851;
	else if (i == 8)
	    anInt7079 = class241_sub3.readUnsignedByte((byte) 65) * -1929161823;
	else if (i == 9)
	    anInt7088 = class241_sub3.readUnsignedByte((byte) -27) * 1999418723;
	else if (i == 10)
	    anInt7081 = class241_sub3.readUnsignedByte((byte) 41) * -1807237171;
	else if (11 == i)
	    anInt7078 = class241_sub3.readUnsignedByte((byte) 36) * -749580149;
	else if (12 == i) {
	    int i_29_ = class241_sub3.readUnsignedByte((byte) 78);
	    anIntArray7071 = new int[i_29_];
	    for (int i_30_ = 0; i_30_ < i_29_; i_30_++)
		anIntArray7071[i_30_] = class241_sub3.readUnsignedShort(1162222719);
	    for (int i_31_ = 0; i_31_ < i_29_; i_31_++)
		anIntArray7071[i_31_] = (class241_sub3.readUnsignedShort(1162222719)
					 << 16) + anIntArray7071[i_31_];
	} else if (13 == i) {
	    int i_32_ = class241_sub3.readUnsignedShort(1162222719);
	    handledSounds = new int[i_32_][];
	    for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
		int i_34_ = class241_sub3.readUnsignedByte((byte) 106);
		if (i_34_ > 0) {
		    handledSounds[i_33_] = new int[i_34_];
		    handledSounds[i_33_][0]
			= class241_sub3.readTriByte(1771646547);
		    for (int i_35_ = 1; i_35_ < i_34_; i_35_++)
			handledSounds[i_33_][i_35_]
			    = class241_sub3.readUnsignedShort(1162222719);
		}
	    }
	} else if (14 == i)
	    aBool7083 = true;
	else if (i == 15)
	    aBool7066 = true;
	else if (16 != i && 18 != i) {
	    if (19 == i) {
		if (null == anIntArray7085) {
		    anIntArray7085 = new int[handledSounds.length];
		    for (int i_36_ = 0; i_36_ < handledSounds.length;
			 i_36_++)
			anIntArray7085[i_36_] = 255;
		}
		anIntArray7085[class241_sub3.readUnsignedByte((byte) -15)]
		    = class241_sub3.readUnsignedByte((byte) 76);
	    } else if (i == 20) {
		if (soundMaxDelay == null || null == soundMinDelay) {
		    soundMaxDelay = new int[handledSounds.length];
		    soundMinDelay = new int[handledSounds.length];
		    for (int i_37_ = 0; i_37_ < handledSounds.length;
			 i_37_++) {
			soundMaxDelay[i_37_] = 256;
			soundMinDelay[i_37_] = 256;
		    }
		}
		int i_38_ = class241_sub3.readUnsignedByte((byte) -112);
		soundMaxDelay[i_38_] = class241_sub3.readUnsignedShort(1162222719);
		soundMinDelay[i_38_] = class241_sub3.readUnsignedShort(1162222719);
	    } else if (i == 22)
		anInt7086
		    = class241_sub3.readUnsignedByte((byte) -28) * -1464766871;
	    else if (i == 23)
		class241_sub3.readUnsignedShort(1162222719);
	    else if (i == 24) {
		int i_39_ = class241_sub3.readUnsignedShort(1162222719);
		config
		    = ((AnimationDefinitionLoader) loader)
			  .animationConfigLoader.getConfig(i_39_, -1041282084);
	    } else if (249 == i) {
		int i_40_ = class241_sub3.readUnsignedByte((byte) -90);
		if (paramaters == null) {
		    int i_41_ = Class480.method11001(i_40_, (byte) 22);
		    paramaters = new HashTable(i_41_);
		}
		for (int i_42_ = 0; i_42_ < i_40_; i_42_++) {
		    boolean bool = class241_sub3.readUnsignedByte((byte) 75) == 1;
		    int i_43_ = class241_sub3.readTriByte(1771646547);
		    Node class241;
		    if (bool)
			class241 = (new ObjectNode
				    (class241_sub3.readString(-1869009926)));
		    else
			class241
			    = new IntegerNode(class241_sub3
						     .readInt((byte) 18));
		    paramaters.put(class241,
								(long) i_43_);
		}
	    }
	}
    }
    
    void method12011(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 60);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, -1827523081);
	}
    }
    
    public boolean method12012(int i) {
	if (anIntArray7069 == null)
	    return true;
	boolean bool = true;
	int[] is = anIntArray7069;
	for (int i_44_ = 0; i_44_ < is.length; i_44_++) {
	    int i_45_ = is[i_44_];
	    if (loader.method12297(i_45_ >>> 16,
							     -1998686552)
		== null)
		bool = false;
	}
	return bool;
    }
    
    void method12013(RSByteBuffer class241_sub3, int i) {
	if (i == 1) {
	    int i_46_ = class241_sub3.readUnsignedShort(1162222719);
	    frameDurations = new int[i_46_];
	    for (int i_47_ = 0; i_47_ < i_46_; i_47_++)
		frameDurations[i_47_] = class241_sub3.readUnsignedShort(1162222719);
	    anIntArray7069 = new int[i_46_];
	    for (int i_48_ = 0; i_48_ < i_46_; i_48_++)
		anIntArray7069[i_48_] = class241_sub3.readUnsignedShort(1162222719);
	    for (int i_49_ = 0; i_49_ < i_46_; i_49_++)
		anIntArray7069[i_49_] = (class241_sub3.readUnsignedShort(1162222719)
					 << 16) + anIntArray7069[i_49_];
	} else if (i == 2)
	    anInt7075 = class241_sub3.readUnsignedShort(1162222719) * 2027290735;
	else if (i == 5)
	    anInt7076 = class241_sub3.readUnsignedByte((byte) 81) * -637556593;
	else if (6 == i)
	    anInt7077 = class241_sub3.readUnsignedShort(1162222719) * 1116634715;
	else if (7 == i)
	    itemInHand = class241_sub3.readUnsignedShort(1162222719) * -1041903851;
	else if (i == 8)
	    anInt7079 = class241_sub3.readUnsignedByte((byte) 8) * -1929161823;
	else if (i == 9)
	    anInt7088 = class241_sub3.readUnsignedByte((byte) -63) * 1999418723;
	else if (i == 10)
	    anInt7081 = class241_sub3.readUnsignedByte((byte) -10) * -1807237171;
	else if (11 == i)
	    anInt7078 = class241_sub3.readUnsignedByte((byte) -32) * -749580149;
	else if (12 == i) {
	    int i_50_ = class241_sub3.readUnsignedByte((byte) 75);
	    anIntArray7071 = new int[i_50_];
	    for (int i_51_ = 0; i_51_ < i_50_; i_51_++)
		anIntArray7071[i_51_] = class241_sub3.readUnsignedShort(1162222719);
	    for (int i_52_ = 0; i_52_ < i_50_; i_52_++)
		anIntArray7071[i_52_] = (class241_sub3.readUnsignedShort(1162222719)
					 << 16) + anIntArray7071[i_52_];
	} else if (13 == i) {
	    int i_53_ = class241_sub3.readUnsignedShort(1162222719);
	    handledSounds = new int[i_53_][];
	    for (int i_54_ = 0; i_54_ < i_53_; i_54_++) {
		int i_55_ = class241_sub3.readUnsignedByte((byte) 96);
		if (i_55_ > 0) {
		    handledSounds[i_54_] = new int[i_55_];
		    handledSounds[i_54_][0]
			= class241_sub3.readTriByte(1771646547);
		    for (int i_56_ = 1; i_56_ < i_55_; i_56_++)
			handledSounds[i_54_][i_56_]
			    = class241_sub3.readUnsignedShort(1162222719);
		}
	    }
	} else if (14 == i)
	    aBool7083 = true;
	else if (i == 15)
	    aBool7066 = true;
	else if (16 != i && 18 != i) {
	    if (19 == i) {
		if (null == anIntArray7085) {
		    anIntArray7085 = new int[handledSounds.length];
		    for (int i_57_ = 0; i_57_ < handledSounds.length;
			 i_57_++)
			anIntArray7085[i_57_] = 255;
		}
		anIntArray7085[class241_sub3.readUnsignedByte((byte) -70)]
		    = class241_sub3.readUnsignedByte((byte) -28);
	    } else if (i == 20) {
		if (soundMaxDelay == null || null == soundMinDelay) {
		    soundMaxDelay = new int[handledSounds.length];
		    soundMinDelay = new int[handledSounds.length];
		    for (int i_58_ = 0; i_58_ < handledSounds.length;
			 i_58_++) {
			soundMaxDelay[i_58_] = 256;
			soundMinDelay[i_58_] = 256;
		    }
		}
		int i_59_ = class241_sub3.readUnsignedByte((byte) -64);
		soundMaxDelay[i_59_] = class241_sub3.readUnsignedShort(1162222719);
		soundMinDelay[i_59_] = class241_sub3.readUnsignedShort(1162222719);
	    } else if (i == 22)
		anInt7086 = class241_sub3.readUnsignedByte((byte) 30) * -1464766871;
	    else if (i == 23)
		class241_sub3.readUnsignedShort(1162222719);
	    else if (i == 24) {
		int i_60_ = class241_sub3.readUnsignedShort(1162222719);
		config
		    = ((AnimationDefinitionLoader) loader)
			  .animationConfigLoader.getConfig(i_60_, -1734988455);
	    } else if (249 == i) {
		int i_61_ = class241_sub3.readUnsignedByte((byte) 36);
		if (paramaters == null) {
		    int i_62_ = Class480.method11001(i_61_, (byte) -14);
		    paramaters = new HashTable(i_62_);
		}
		for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
		    boolean bool = class241_sub3.readUnsignedByte((byte) -12) == 1;
		    int i_64_ = class241_sub3.readTriByte(1771646547);
		    Node class241;
		    if (bool)
			class241 = (new ObjectNode
				    (class241_sub3.readString(-1619672444)));
		    else
			class241
			    = new IntegerNode(class241_sub3
						     .readInt((byte) 2));
		    paramaters.put(class241,
								(long) i_64_);
		}
	    }
	}
    }
    
    void method12014(RSByteBuffer class241_sub3, int i) {
	if (i == 1) {
	    int i_65_ = class241_sub3.readUnsignedShort(1162222719);
	    frameDurations = new int[i_65_];
	    for (int i_66_ = 0; i_66_ < i_65_; i_66_++)
		frameDurations[i_66_] = class241_sub3.readUnsignedShort(1162222719);
	    anIntArray7069 = new int[i_65_];
	    for (int i_67_ = 0; i_67_ < i_65_; i_67_++)
		anIntArray7069[i_67_] = class241_sub3.readUnsignedShort(1162222719);
	    for (int i_68_ = 0; i_68_ < i_65_; i_68_++)
		anIntArray7069[i_68_] = (class241_sub3.readUnsignedShort(1162222719)
					 << 16) + anIntArray7069[i_68_];
	} else if (i == 2)
	    anInt7075 = class241_sub3.readUnsignedShort(1162222719) * 2027290735;
	else if (i == 5)
	    anInt7076 = class241_sub3.readUnsignedByte((byte) -14) * -637556593;
	else if (6 == i)
	    anInt7077 = class241_sub3.readUnsignedShort(1162222719) * 1116634715;
	else if (7 == i)
	    itemInHand = class241_sub3.readUnsignedShort(1162222719) * -1041903851;
	else if (i == 8)
	    anInt7079 = class241_sub3.readUnsignedByte((byte) 70) * -1929161823;
	else if (i == 9)
	    anInt7088 = class241_sub3.readUnsignedByte((byte) 32) * 1999418723;
	else if (i == 10)
	    anInt7081 = class241_sub3.readUnsignedByte((byte) 64) * -1807237171;
	else if (11 == i)
	    anInt7078 = class241_sub3.readUnsignedByte((byte) 62) * -749580149;
	else if (12 == i) {
	    int i_69_ = class241_sub3.readUnsignedByte((byte) -31);
	    anIntArray7071 = new int[i_69_];
	    for (int i_70_ = 0; i_70_ < i_69_; i_70_++)
		anIntArray7071[i_70_] = class241_sub3.readUnsignedShort(1162222719);
	    for (int i_71_ = 0; i_71_ < i_69_; i_71_++)
		anIntArray7071[i_71_] = (class241_sub3.readUnsignedShort(1162222719)
					 << 16) + anIntArray7071[i_71_];
	} else if (13 == i) {
	    int i_72_ = class241_sub3.readUnsignedShort(1162222719);
	    handledSounds = new int[i_72_][];
	    for (int i_73_ = 0; i_73_ < i_72_; i_73_++) {
		int i_74_ = class241_sub3.readUnsignedByte((byte) 59);
		if (i_74_ > 0) {
		    handledSounds[i_73_] = new int[i_74_];
		    handledSounds[i_73_][0]
			= class241_sub3.readTriByte(1771646547);
		    for (int i_75_ = 1; i_75_ < i_74_; i_75_++)
			handledSounds[i_73_][i_75_]
			    = class241_sub3.readUnsignedShort(1162222719);
		}
	    }
	} else if (14 == i)
	    aBool7083 = true;
	else if (i == 15)
	    aBool7066 = true;
	else if (16 != i && 18 != i) {
	    if (19 == i) {
		if (null == anIntArray7085) {
		    anIntArray7085 = new int[handledSounds.length];
		    for (int i_76_ = 0; i_76_ < handledSounds.length;
			 i_76_++)
			anIntArray7085[i_76_] = 255;
		}
		anIntArray7085[class241_sub3.readUnsignedByte((byte) 96)]
		    = class241_sub3.readUnsignedByte((byte) -60);
	    } else if (i == 20) {
		if (soundMaxDelay == null || null == soundMinDelay) {
		    soundMaxDelay = new int[handledSounds.length];
		    soundMinDelay = new int[handledSounds.length];
		    for (int i_77_ = 0; i_77_ < handledSounds.length;
			 i_77_++) {
			soundMaxDelay[i_77_] = 256;
			soundMinDelay[i_77_] = 256;
		    }
		}
		int i_78_ = class241_sub3.readUnsignedByte((byte) -46);
		soundMaxDelay[i_78_] = class241_sub3.readUnsignedShort(1162222719);
		soundMinDelay[i_78_] = class241_sub3.readUnsignedShort(1162222719);
	    } else if (i == 22)
		anInt7086 = class241_sub3.readUnsignedByte((byte) 36) * -1464766871;
	    else if (i == 23)
		class241_sub3.readUnsignedShort(1162222719);
	    else if (i == 24) {
		int i_79_ = class241_sub3.readUnsignedShort(1162222719);
		config
		    = ((AnimationDefinitionLoader) loader)
			  .animationConfigLoader.getConfig(i_79_, -2062695011);
	    } else if (249 == i) {
		int i_80_ = class241_sub3.readUnsignedByte((byte) -82);
		if (paramaters == null) {
		    int i_81_ = Class480.method11001(i_80_, (byte) 45);
		    paramaters = new HashTable(i_81_);
		}
		for (int i_82_ = 0; i_82_ < i_80_; i_82_++) {
		    boolean bool = class241_sub3.readUnsignedByte((byte) 39) == 1;
		    int i_83_ = class241_sub3.readTriByte(1771646547);
		    Node class241;
		    if (bool)
			class241
			    = new ObjectNode(class241_sub3
						     .readString(711614228));
		    else
			class241
			    = new IntegerNode(class241_sub3
						     .readInt((byte) 81));
		    paramaters.put(class241,
								(long) i_83_);
		}
	    }
	}
    }
    
    void method12015(RSByteBuffer class241_sub3, int i) {
	if (i == 1) {
	    int i_84_ = class241_sub3.readUnsignedShort(1162222719);
	    frameDurations = new int[i_84_];
	    for (int i_85_ = 0; i_85_ < i_84_; i_85_++)
		frameDurations[i_85_] = class241_sub3.readUnsignedShort(1162222719);
	    anIntArray7069 = new int[i_84_];
	    for (int i_86_ = 0; i_86_ < i_84_; i_86_++)
		anIntArray7069[i_86_] = class241_sub3.readUnsignedShort(1162222719);
	    for (int i_87_ = 0; i_87_ < i_84_; i_87_++)
		anIntArray7069[i_87_] = (class241_sub3.readUnsignedShort(1162222719)
					 << 16) + anIntArray7069[i_87_];
	} else if (i == 2)
	    anInt7075 = class241_sub3.readUnsignedShort(1162222719) * 2027290735;
	else if (i == 5)
	    anInt7076 = class241_sub3.readUnsignedByte((byte) -47) * -637556593;
	else if (6 == i)
	    anInt7077 = class241_sub3.readUnsignedShort(1162222719) * 1116634715;
	else if (7 == i)
	    itemInHand = class241_sub3.readUnsignedShort(1162222719) * -1041903851;
	else if (i == 8)
	    anInt7079 = class241_sub3.readUnsignedByte((byte) 13) * -1929161823;
	else if (i == 9)
	    anInt7088 = class241_sub3.readUnsignedByte((byte) 98) * 1999418723;
	else if (i == 10)
	    anInt7081 = class241_sub3.readUnsignedByte((byte) -3) * -1807237171;
	else if (11 == i)
	    anInt7078 = class241_sub3.readUnsignedByte((byte) 25) * -749580149;
	else if (12 == i) {
	    int i_88_ = class241_sub3.readUnsignedByte((byte) 42);
	    anIntArray7071 = new int[i_88_];
	    for (int i_89_ = 0; i_89_ < i_88_; i_89_++)
		anIntArray7071[i_89_] = class241_sub3.readUnsignedShort(1162222719);
	    for (int i_90_ = 0; i_90_ < i_88_; i_90_++)
		anIntArray7071[i_90_] = (class241_sub3.readUnsignedShort(1162222719)
					 << 16) + anIntArray7071[i_90_];
	} else if (13 == i) {
	    int i_91_ = class241_sub3.readUnsignedShort(1162222719);
	    handledSounds = new int[i_91_][];
	    for (int i_92_ = 0; i_92_ < i_91_; i_92_++) {
		int i_93_ = class241_sub3.readUnsignedByte((byte) -85);
		if (i_93_ > 0) {
		    handledSounds[i_92_] = new int[i_93_];
		    handledSounds[i_92_][0]
			= class241_sub3.readTriByte(1771646547);
		    for (int i_94_ = 1; i_94_ < i_93_; i_94_++)
			handledSounds[i_92_][i_94_]
			    = class241_sub3.readUnsignedShort(1162222719);
		}
	    }
	} else if (14 == i)
	    aBool7083 = true;
	else if (i == 15)
	    aBool7066 = true;
	else if (16 != i && 18 != i) {
	    if (19 == i) {
		if (null == anIntArray7085) {
		    anIntArray7085 = new int[handledSounds.length];
		    for (int i_95_ = 0; i_95_ < handledSounds.length;
			 i_95_++)
			anIntArray7085[i_95_] = 255;
		}
		anIntArray7085[class241_sub3.readUnsignedByte((byte) -122)]
		    = class241_sub3.readUnsignedByte((byte) -25);
	    } else if (i == 20) {
		if (soundMaxDelay == null || null == soundMinDelay) {
		    soundMaxDelay = new int[handledSounds.length];
		    soundMinDelay = new int[handledSounds.length];
		    for (int i_96_ = 0; i_96_ < handledSounds.length;
			 i_96_++) {
			soundMaxDelay[i_96_] = 256;
			soundMinDelay[i_96_] = 256;
		    }
		}
		int i_97_ = class241_sub3.readUnsignedByte((byte) -113);
		soundMaxDelay[i_97_] = class241_sub3.readUnsignedShort(1162222719);
		soundMinDelay[i_97_] = class241_sub3.readUnsignedShort(1162222719);
	    } else if (i == 22)
		anInt7086 = class241_sub3.readUnsignedByte((byte) 42) * -1464766871;
	    else if (i == 23)
		class241_sub3.readUnsignedShort(1162222719);
	    else if (i == 24) {
		int i_98_ = class241_sub3.readUnsignedShort(1162222719);
		config
		    = ((AnimationDefinitionLoader) loader)
			  .animationConfigLoader.getConfig(i_98_, -1399036019);
	    } else if (249 == i) {
		int i_99_ = class241_sub3.readUnsignedByte((byte) -60);
		if (paramaters == null) {
		    int i_100_ = Class480.method11001(i_99_, (byte) 13);
		    paramaters = new HashTable(i_100_);
		}
		for (int i_101_ = 0; i_101_ < i_99_; i_101_++) {
		    boolean bool = class241_sub3.readUnsignedByte((byte) -68) == 1;
		    int i_102_ = class241_sub3.readTriByte(1771646547);
		    Node class241;
		    if (bool)
			class241
			    = new ObjectNode(class241_sub3
						     .readString(884286817));
		    else
			class241
			    = new IntegerNode(class241_sub3
						     .readInt((byte) 66));
		    paramaters.put(class241,
								(long) i_102_);
		}
	    }
	}
    }
    
    AnimationDefinition() {
	anInt7079 = -2008459453;
	anInt7088 = -1999418723;
	anInt7081 = 1807237171;
	anInt7078 = -1499160298;
	aBool7083 = false;
	aBool7066 = false;
	anInt7086 = 1464766871;
    }
    
    void method12016() {
	if (2119332939 * anInt7088 == -1) {
	    if (config != null
		&& config.aBoolArray7014 != null)
		anInt7088 = -296129850;
	    else
		anInt7088 = 0;
	}
	if (anInt7081 * 377701637 == -1) {
	    if (null != config
		&& config.aBoolArray7014 != null)
		anInt7081 = 680492954;
	    else
		anInt7081 = 0;
	}
	if (frameDurations != null) {
	    duration = 0;
	    for (int i = 0; i < frameDurations.length; i++)
		duration += frameDurations[i] * -184347003;
	}
    }
    
    public boolean method12017() {
	if (anIntArray7069 == null)
	    return true;
	boolean bool = true;
	int[] is = anIntArray7069;
	for (int i = 0; i < is.length; i++) {
	    int i_103_ = is[i];
	    if (loader.method12297(i_103_ >>> 16,
							     -2016534046)
		== null)
		bool = false;
	}
	return bool;
    }
    
    public boolean method12018() {
	if (anIntArray7069 == null)
	    return true;
	boolean bool = true;
	int[] is = anIntArray7069;
	for (int i = 0; i < is.length; i++) {
	    int i_104_ = is[i];
	    if (loader.method12297(i_104_ >>> 16,
							     -1344056617)
		== null)
		bool = false;
	}
	return bool;
    }
    
    public String method12019(int i, String string) {
	if (null == paramaters)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       paramaters.get((long) i));
	if (null == class241_sub26)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    public boolean method12020() {
	if (anIntArray7069 == null)
	    return true;
	boolean bool = true;
	int[] is = anIntArray7069;
	for (int i = 0; i < is.length; i++) {
	    int i_105_ = is[i];
	    if (loader.method12297(i_105_ >>> 16,
							     -1742872705)
		== null)
		bool = false;
	}
	return bool;
    }
    
    public boolean method12021() {
	if (anIntArray7069 == null)
	    return true;
	boolean bool = true;
	int[] is = anIntArray7069;
	for (int i = 0; i < is.length; i++) {
	    int i_106_ = is[i];
	    if (loader.method12297(i_106_ >>> 16,
							     -1442947772)
		== null)
		bool = false;
	}
	return bool;
    }
    
    public int method12022(int i, int i_107_) {
	if (null == paramaters)
	    return i_107_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       paramaters.get((long) i));
	if (class241_sub22 == null)
	    return i_107_;
	return -1859754807 * class241_sub22.intValue;
    }
    
    public int method12023(int i, int i_108_) {
	if (null == paramaters)
	    return i_108_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       paramaters.get((long) i));
	if (class241_sub22 == null)
	    return i_108_;
	return -1859754807 * class241_sub22.intValue;
    }
    
    public int method12024(int i, int i_109_) {
	if (null == paramaters)
	    return i_109_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       paramaters.get((long) i));
	if (class241_sub22 == null)
	    return i_109_;
	return -1859754807 * class241_sub22.intValue;
    }
    
    public String method12025(int i, String string) {
	if (null == paramaters)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       paramaters.get((long) i));
	if (null == class241_sub26)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    public String method12026(int i, String string) {
	if (null == paramaters)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       paramaters.get((long) i));
	if (null == class241_sub26)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    public String method12027(int i, String string) {
	if (null == paramaters)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       paramaters.get((long) i));
	if (null == class241_sub26)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    void method12028() {
	if (2119332939 * anInt7088 == -1) {
	    if (config != null
		&& config.aBoolArray7014 != null)
		anInt7088 = -296129850;
	    else
		anInt7088 = 0;
	}
	if (anInt7081 * 377701637 == -1) {
	    if (null != config
		&& config.aBoolArray7014 != null)
		anInt7081 = 680492954;
	    else
		anInt7081 = 0;
	}
	if (frameDurations != null) {
	    duration = 0;
	    for (int i = 0; i < frameDurations.length; i++)
		duration += frameDurations[i] * -184347003;
	}
    }
    
    static final void method12029(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	class58.aString935 = (String) (((ClientScriptData) class454).objectStack
				       [(((ClientScriptData) class454).objectStackPointer
					 -= -1650705371) * -290357331]);
    }
    
    static final void method12030(ClientScriptData class454, int i) {
	int i_110_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_110_, (byte) -62);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_110_ >> 16];
	Class281.method5488(class58, class35, false, 0, class454, 759788938);
    }
    
    static final void setVarcompSize/*method12031*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
		InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
		Class468.setComponentSize(class58, class35, scriptData, 211663635);
    }
    
    static final void method12032(ClientScriptData class454, short i) {
	client.aBool8386 = true;
	Class488.method11148(-1028385774);
    }
}
