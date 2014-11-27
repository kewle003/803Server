/* Class241_Sub39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ClientScript extends Class241_Sub39
{
    public Cs2Action[] actions;//aClass243Array10809
    Interface13 anInterface13_10810;
    public int anInt10811;
    public int[] integerConstants;//anIntArray10812
    public Object[] objectConstants;//anObjectArray10813
    public int anInt10814;
    public String aString10815;
    public int anInt10816;
    public int anInt10817;
    public int anInt10818;
    public int anInt10819;
    public HashTable[] aClass407Array10820;
    public Class614 aClass614_10821;
    
    Cs2Action method17069(RSByteBuffer buffer, Cs2Action[] class243s, byte i) {
		int i_0_ = buffer.readUnsignedShort(1162222719);
		if (i_0_ < 0 || i_0_ >= class243s.length) {
		    throw new RuntimeException("");
		}
		Cs2Action class243 = class243s[i_0_];
		return class243;
    }
    
    public ClientScript(RSByteBuffer buffer, Interface13 interface13) {
		anInterface13_10810 = interface13;
		int i = method17070(buffer, -2114455906);
		int step = 0;
		Cs2Action[] class243s = Class247_Sub5.method16512(1736754263);
		while (buffer.pointer * 421967667 < i) {
		    Cs2Action class243 = method17069(buffer, class243s, (byte) 98);
		    decodeAction(buffer, step, class243, 1093979739);
		    step++;
		}
    }
    
    int method17070(RSByteBuffer class241_sub3, int i) {
	class241_sub3.pointer
	    = (class241_sub3.payload.length - 2) * -681042949;
	int i_2_ = class241_sub3.readUnsignedShort(1162222719);
	int i_3_ = class241_sub3.payload.length - 2 - i_2_ - 16;
	class241_sub3.pointer = i_3_ * -681042949;
	int i_4_ = class241_sub3.readInt((byte) 101);
	anInt10814 = class241_sub3.readUnsignedShort(1162222719) * 764889155;
	anInt10811 = class241_sub3.readUnsignedShort(1162222719) * 940979311;
	anInt10816 = class241_sub3.readUnsignedShort(1162222719) * -1137538191;
	anInt10817 = class241_sub3.readUnsignedShort(1162222719) * -879787087;
	anInt10818 = class241_sub3.readUnsignedShort(1162222719) * -778317863;
	anInt10819 = class241_sub3.readUnsignedShort(1162222719) * -445886225;
	int i_5_ = class241_sub3.readUnsignedByte((byte) 5);
	if (i_5_ > 0) {
	    aClass407Array10820 = new HashTable[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
		int i_7_ = class241_sub3.readUnsignedShort(1162222719);
		HashTable class407
		    = new HashTable(Class480.method11001(i_7_, (byte) 39));
		aClass407Array10820[i_6_] = class407;
		while (i_7_-- > 0) {
		    int i_8_ = class241_sub3.readInt((byte) 30);
		    int i_9_ = class241_sub3.readInt((byte) 18);
		    class407.put(new IntegerNode(i_9_), (long) i_8_);
		}
	    }
	}
	class241_sub3.pointer = 0;
	aString10815 = class241_sub3.readNullString(1766862422);
	actions = new Cs2Action[i_4_];
	return i_3_;
    }
    
    void decodeAction/*method17071*/(RSByteBuffer buffer, int step, Cs2Action action, int i_10_) {
		int actionCount = actions.length;
		if (action == Cs2Action.STORE_VAR || action == Cs2Action.SET_VAR) {
		    VarDomainType varDomainType = ((VarDomainType) Class531.method11848(
		    		VarDomainType.method4361(2131184652),
		    		buffer.readUnsignedByte((byte) -2),
					2000371078));
		    int key = buffer.readUnsignedShort(1162222719);
		    if (objectConstants == null) {
		    	objectConstants = new Object[actionCount];
		    }
		    objectConstants[step] = anInterface13_10810.method96(varDomainType, key, (byte) 60);
		    if (integerConstants == null) {
		    	integerConstants = new int[actionCount];
		    }
		    integerConstants[step] = buffer.readUnsignedByte((byte) -90);
		} else if (Cs2Action.STORE_STR_CONST == action) {
		    BaseVarType varType = (BaseVarType) Class531.method11848(
		    		BaseVarType.method4351(1088163673),
					buffer.readUnsignedByte((byte) -119),
					310043829);
		    switch (393914799 * varType.anInt2538) {
		    case 0:
				if (objectConstants == null) {
				    objectConstants = new Object[actionCount];
				}
				objectConstants[step] = buffer.readString(92777820).intern();
				break;
		    case 2:
				if (null == integerConstants) {
				    integerConstants = new int[actionCount];
				}
				action = Cs2Action.STORE_INT_CONST;
				integerConstants[step] = buffer.readInt((byte) 96);
				break;
		    case 1:
				if (objectConstants == null) {
				    objectConstants = new Object[actionCount];
				}
				action = Cs2Action.STORE_LONG_CONST;
				objectConstants[step] = Long.valueOf(buffer.readLong((short) 4184));
				break;
		    default:
		    	throw new RuntimeException();
		    }
		} else if (Cs2Action.STORE_VARBIT == action || Cs2Action.SET_VARBIT == action) {
		    int key = buffer.readUnsignedShort(1162222719);
		    if (objectConstants == null) {
		    	objectConstants = new Object[actionCount];
		    }
		    objectConstants[step] = anInterface13_10810.method93(key, 1713135618);
		    if (null == integerConstants) {
		    	integerConstants = new int[actionCount];
		    }
		    integerConstants[step] = buffer.readUnsignedByte((byte) 60);
		} else {
		    if (integerConstants == null) {
		    	integerConstants = new int[actionCount];
		    }
		    if (action != null && action.hasIntConst) {
		    	integerConstants[step] = buffer.readInt((byte) 13);
		    } else {
		    	integerConstants[step] = buffer.readUnsignedByte((byte) -18);
		    }
		}
		actions[step] = action;
    }
    
    Cs2Action method17072(RSByteBuffer class241_sub3, Cs2Action[] class243s) {
	int i = class241_sub3.readUnsignedShort(1162222719);
	if (i < 0 || i >= class243s.length)
	    throw new RuntimeException("");
	Cs2Action class243 = class243s[i];
	return class243;
    }
    
    Cs2Action method17073(RSByteBuffer class241_sub3, Cs2Action[] class243s) {
	int i = class241_sub3.readUnsignedShort(1162222719);
	if (i < 0 || i >= class243s.length)
	    throw new RuntimeException("");
	Cs2Action class243 = class243s[i];
	return class243;
    }
    
    Cs2Action method17074(RSByteBuffer class241_sub3, Cs2Action[] class243s) {
	int i = class241_sub3.readUnsignedShort(1162222719);
	if (i < 0 || i >= class243s.length)
	    throw new RuntimeException("");
	Cs2Action class243 = class243s[i];
	return class243;
    }
    
    int method17075(RSByteBuffer class241_sub3) {
	class241_sub3.pointer
	    = (class241_sub3.payload.length - 2) * -681042949;
	int i = class241_sub3.readUnsignedShort(1162222719);
	int i_14_ = class241_sub3.payload.length - 2 - i - 16;
	class241_sub3.pointer = i_14_ * -681042949;
	int i_15_ = class241_sub3.readInt((byte) 52);
	anInt10814 = class241_sub3.readUnsignedShort(1162222719) * 764889155;
	anInt10811 = class241_sub3.readUnsignedShort(1162222719) * 940979311;
	anInt10816 = class241_sub3.readUnsignedShort(1162222719) * -1137538191;
	anInt10817 = class241_sub3.readUnsignedShort(1162222719) * -879787087;
	anInt10818 = class241_sub3.readUnsignedShort(1162222719) * -778317863;
	anInt10819 = class241_sub3.readUnsignedShort(1162222719) * -445886225;
	int i_16_ = class241_sub3.readUnsignedByte((byte) -45);
	if (i_16_ > 0) {
	    aClass407Array10820 = new HashTable[i_16_];
	    for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
		int i_18_ = class241_sub3.readUnsignedShort(1162222719);
		HashTable class407
		    = new HashTable(Class480.method11001(i_18_, (byte) -56));
		aClass407Array10820[i_17_] = class407;
		while (i_18_-- > 0) {
		    int i_19_ = class241_sub3.readInt((byte) 98);
		    int i_20_ = class241_sub3.readInt((byte) 31);
		    class407.put(new IntegerNode(i_20_),
					(long) i_19_);
		}
	    }
	}
	class241_sub3.pointer = 0;
	aString10815 = class241_sub3.readNullString(-57007613);
	actions = new Cs2Action[i_15_];
	return i_14_;
    }
    
    int method17076(RSByteBuffer class241_sub3) {
	class241_sub3.pointer
	    = (class241_sub3.payload.length - 2) * -681042949;
	int i = class241_sub3.readUnsignedShort(1162222719);
	int i_21_ = class241_sub3.payload.length - 2 - i - 16;
	class241_sub3.pointer = i_21_ * -681042949;
	int i_22_ = class241_sub3.readInt((byte) 116);
	anInt10814 = class241_sub3.readUnsignedShort(1162222719) * 764889155;
	anInt10811 = class241_sub3.readUnsignedShort(1162222719) * 940979311;
	anInt10816 = class241_sub3.readUnsignedShort(1162222719) * -1137538191;
	anInt10817 = class241_sub3.readUnsignedShort(1162222719) * -879787087;
	anInt10818 = class241_sub3.readUnsignedShort(1162222719) * -778317863;
	anInt10819 = class241_sub3.readUnsignedShort(1162222719) * -445886225;
	int i_23_ = class241_sub3.readUnsignedByte((byte) 77);
	if (i_23_ > 0) {
	    aClass407Array10820 = new HashTable[i_23_];
	    for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
		int i_25_ = class241_sub3.readUnsignedShort(1162222719);
		HashTable class407
		    = new HashTable(Class480.method11001(i_25_, (byte) -10));
		aClass407Array10820[i_24_] = class407;
		while (i_25_-- > 0) {
		    int i_26_ = class241_sub3.readInt((byte) 115);
		    int i_27_ = class241_sub3.readInt((byte) 47);
		    class407.put(new IntegerNode(i_27_),
					(long) i_26_);
		}
	    }
	}
	class241_sub3.pointer = 0;
	aString10815 = class241_sub3.readNullString(-381537475);
	actions = new Cs2Action[i_22_];
	return i_21_;
    }
    
    Cs2Action method17077(RSByteBuffer class241_sub3, Cs2Action[] class243s) {
	int i = class241_sub3.readUnsignedShort(1162222719);
	if (i < 0 || i >= class243s.length)
	    throw new RuntimeException("");
	Cs2Action class243 = class243s[i];
	return class243;
    }
    
    void method17078(RSByteBuffer class241_sub3, int i, Cs2Action class243) {
	int i_28_ = actions.length;
	if (class243 == Cs2Action.STORE_VAR
	    || class243 == Cs2Action.SET_VAR) {
	    VarDomainType class218
		= ((VarDomainType)
		   Class531.method11848(VarDomainType.method4361(-1790287792),
					class241_sub3.readUnsignedByte((byte) 31),
					1791096730));
	    int i_29_ = class241_sub3.readUnsignedShort(1162222719);
	    if (objectConstants == null)
		objectConstants = new Object[i_28_];
	    objectConstants[i]
		= anInterface13_10810
		      .method96(class218, i_29_, (byte) 77);
	    if (integerConstants == null)
		integerConstants = new int[i_28_];
	    integerConstants[i] = class241_sub3.readUnsignedByte((byte) -3);
	} else if (Cs2Action.STORE_STR_CONST == class243) {
	    BaseVarType class217
		= ((BaseVarType)
		   Class531.method11848(BaseVarType.method4351(1560949449),
					class241_sub3.readUnsignedByte((byte) 48),
					-1935775348));
	    switch (393914799 * class217.anInt2538) {
	    case 0:
		if (objectConstants == null)
		    objectConstants = new Object[i_28_];
		objectConstants[i]
		    = class241_sub3.readString(-1355733495).intern();
		break;
	    case 2:
		if (null == integerConstants)
		    integerConstants = new int[i_28_];
		class243 = Cs2Action.STORE_INT_CONST;
		integerConstants[i] = class241_sub3.readInt((byte) 119);
		break;
	    case 1:
		if (objectConstants == null)
		    objectConstants = new Object[i_28_];
		class243 = Cs2Action.STORE_LONG_CONST;
		objectConstants[i]
		    = Long.valueOf(class241_sub3.readLong((short) 29131));
		break;
	    default:
		throw new RuntimeException();
	    }
	} else if (Cs2Action.STORE_VARBIT == class243
		   || Cs2Action.SET_VARBIT == class243) {
	    int i_30_ = class241_sub3.readUnsignedShort(1162222719);
	    if (objectConstants == null)
		objectConstants = new Object[i_28_];
	    objectConstants[i]
		= anInterface13_10810
		      .method93(i_30_, 1180345756);
	    if (null == integerConstants)
		integerConstants = new int[i_28_];
	    integerConstants[i] = class241_sub3.readUnsignedByte((byte) 21);
	} else {
	    if (integerConstants == null)
		integerConstants = new int[i_28_];
	    if (class243 != null && class243.hasIntConst)
		integerConstants[i] = class241_sub3.readInt((byte) 101);
	    else
		integerConstants[i] = class241_sub3.readUnsignedByte((byte) 13);
	}
	actions[i] = class243;
    }
    
    void method17079(RSByteBuffer class241_sub3, int i, Cs2Action class243) {
	int i_31_ = actions.length;
	if (class243 == Cs2Action.STORE_VAR
	    || class243 == Cs2Action.SET_VAR) {
	    VarDomainType class218
		= ((VarDomainType)
		   Class531.method11848(VarDomainType.method4361(1077416086),
					class241_sub3.readUnsignedByte((byte) -91),
					-145997848));
	    int i_32_ = class241_sub3.readUnsignedShort(1162222719);
	    if (objectConstants == null)
		objectConstants = new Object[i_31_];
	    objectConstants[i]
		= anInterface13_10810
		      .method96(class218, i_32_, (byte) 106);
	    if (integerConstants == null)
		integerConstants = new int[i_31_];
	    integerConstants[i] = class241_sub3.readUnsignedByte((byte) 105);
	} else if (Cs2Action.STORE_STR_CONST == class243) {
	    BaseVarType class217
		= ((BaseVarType)
		   Class531.method11848(BaseVarType.method4351(263556744),
					class241_sub3.readUnsignedByte((byte) -11),
					-1906901833));
	    switch (393914799 * class217.anInt2538) {
	    case 0:
		if (objectConstants == null)
		    objectConstants = new Object[i_31_];
		objectConstants[i]
		    = class241_sub3.readString(1182222237).intern();
		break;
	    case 2:
		if (null == integerConstants)
		    integerConstants = new int[i_31_];
		class243 = Cs2Action.STORE_INT_CONST;
		integerConstants[i] = class241_sub3.readInt((byte) 25);
		break;
	    case 1:
		if (objectConstants == null)
		    objectConstants = new Object[i_31_];
		class243 = Cs2Action.STORE_LONG_CONST;
		objectConstants[i]
		    = Long.valueOf(class241_sub3.readLong((short) 26618));
		break;
	    default:
		throw new RuntimeException();
	    }
	} else if (Cs2Action.STORE_VARBIT == class243
		   || Cs2Action.SET_VARBIT == class243) {
	    int i_33_ = class241_sub3.readUnsignedShort(1162222719);
	    if (objectConstants == null) {
	    	objectConstants = new Object[i_31_];
	    }
	    objectConstants[i] = anInterface13_10810.method93(i_33_, 1073290822);
	    if (null == integerConstants) {
	    	integerConstants = new int[i_31_];
	    }
	    integerConstants[i] = class241_sub3.readUnsignedByte((byte) 22);
	} else {
	    if (integerConstants == null)
		integerConstants = new int[i_31_];
	    if (class243 != null && class243.hasIntConst) {
	    	integerConstants[i] = class241_sub3.readInt((byte) 97);
	    } else {
	    	integerConstants[i] = class241_sub3.readUnsignedByte((byte) -105);
	    }
	}
	actions[i] = class243;
    }
}
