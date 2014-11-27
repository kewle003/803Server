/* Class480 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class480
{
    public int[][] anIntArrayArray6417;
    HashTable aClass407_6418;
    public int anInt6419;
    int[][] anIntArrayArray6420;
    int[][] anIntArrayArray6421;
    public int anInt6422 = 0;
    int[] anIntArray6423;
    public boolean aBool6424;
    public String aString6425;
    Class482 aClass482_6426;
    public int[] anIntArray6427;
    public int anInt6428;
    int[] anIntArray6429;
    public int[] anIntArray6430;
    int[] anIntArray6431;
    int[] anIntArray6432;
    public String[] aStringArray6433;
    public int[] anIntArray6434;
    public int anInt6435 = 0;
    int[] anIntArray6436;
    public String[] aStringArray6437;
    public String aString6438;
    public int anInt6439;
    
    Class480() {
	aBool6424 = false;
	anInt6439 = 685774239;
    }
    
    public boolean method10960(Interface11 interface11) {
	if (null != ((Class480) this).anIntArrayArray6420) {
	    for (int i = 0; i < ((Class480) this).anIntArrayArray6420.length;
		 i++) {
		VarType class179
		    = (((Interface13) interface11).method96
		       (VarDomainType.PLAYER,
			((Class480) this).anIntArrayArray6420[i][0],
			(byte) 121));
		if (interface11.getVarValueInt(class179, -944248876)
		    >= ((Class480) this).anIntArrayArray6420[i][2])
		    return true;
	    }
	}
	if (null != ((Class480) this).anIntArrayArray6421) {
	    for (int i = 0; i < ((Class480) this).anIntArrayArray6421.length;
		 i++) {
		VarBitType class316
		    = (((Interface13) interface11).method93
		       (((Class480) this).anIntArrayArray6421[i][0],
			2112011363));
		if (interface11.getVarBitValue(class316, (short) 31381)
		    >= ((Class480) this).anIntArrayArray6421[i][2])
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method10961(Interface11 interface11, int i) {
	if (((Class480) this).anIntArrayArray6420 != null) {
	    for (int i_0_ = 0;
		 i_0_ < ((Class480) this).anIntArrayArray6420.length; i_0_++) {
		VarType class179
		    = (((Interface13) interface11).method96
		       (VarDomainType.PLAYER,
			((Class480) this).anIntArrayArray6420[i_0_][0],
			(byte) 123));
		if (interface11.getVarValueInt(class179, -1727707727)
		    >= ((Class480) this).anIntArrayArray6420[i_0_][1])
		    return true;
	    }
	}
	if (null != ((Class480) this).anIntArrayArray6421) {
	    for (int i_1_ = 0;
		 i_1_ < ((Class480) this).anIntArrayArray6421.length; i_1_++) {
		VarBitType class316
		    = (((Interface13) interface11).method93
		       (((Class480) this).anIntArrayArray6421[i_1_][0],
			1881810947));
		if (interface11.getVarBitValue(class316, (short) 19261)
		    >= ((Class480) this).anIntArrayArray6421[i_1_][1])
		    return true;
	    }
	}
	return false;
    }
    
    void method10962(int i) {
	if (null == aString6438)
	    aString6438 = aString6425;
    }
    
    public int method10963(int i, int i_2_, byte i_3_) {
	if (null == ((Class480) this).aClass407_6418)
	    return i_2_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       ((Class480) this).aClass407_6418.get((long) i));
	if (class241_sub22 == null)
	    return i_2_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public String method10964(int i, String string, int i_4_) {
	if (((Class480) this).aClass407_6418 == null)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       ((Class480) this).aClass407_6418.get((long) i));
	if (class241_sub26 == null)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    public boolean method10965(Interface11 interface11, int i) {
	if (null == anIntArray6430 || i < 0 || i >= anIntArray6430.length)
	    return false;
	VarType class179
	    = ((Interface13) interface11).method96(VarDomainType.PLAYER,
						   anIntArray6430[i],
						   (byte) 71);
	int i_5_ = interface11.getVarValueInt(class179, -1202678650);
	if (i_5_ < ((Class480) this).anIntArray6431[i]
	    || i_5_ > ((Class480) this).anIntArray6432[i])
	    return false;
	return true;
    }
    
    public boolean method10966(Interface11 interface11, int i) {
	if (null != ((Class480) this).anIntArrayArray6420) {
	    for (int i_6_ = 0;
		 i_6_ < ((Class480) this).anIntArrayArray6420.length; i_6_++) {
		VarType class179
		    = (((Interface13) interface11).method96
		       (VarDomainType.PLAYER,
			((Class480) this).anIntArrayArray6420[i_6_][0],
			(byte) 43));
		if (interface11.getVarValueInt(class179, -1864776464)
		    >= ((Class480) this).anIntArrayArray6420[i_6_][2])
		    return true;
	    }
	}
	if (null != ((Class480) this).anIntArrayArray6421) {
	    for (int i_7_ = 0;
		 i_7_ < ((Class480) this).anIntArrayArray6421.length; i_7_++) {
		VarBitType class316
		    = (((Interface13) interface11).method93
		       (((Class480) this).anIntArrayArray6421[i_7_][0],
			1939129951));
		if (interface11.getVarBitValue(class316, (short) 23017)
		    >= ((Class480) this).anIntArrayArray6421[i_7_][2])
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method10967(Interface11 interface11) {
	if (null != ((Class480) this).anIntArrayArray6420) {
	    for (int i = 0; i < ((Class480) this).anIntArrayArray6420.length;
		 i++) {
		VarType class179
		    = (((Interface13) interface11).method96
		       (VarDomainType.PLAYER,
			((Class480) this).anIntArrayArray6420[i][0],
			(byte) 78));
		if (interface11.getVarValueInt(class179, -1655545089)
		    >= ((Class480) this).anIntArrayArray6420[i][2])
		    return true;
	    }
	}
	if (null != ((Class480) this).anIntArrayArray6421) {
	    for (int i = 0; i < ((Class480) this).anIntArrayArray6421.length;
		 i++) {
		VarBitType class316
		    = (((Interface13) interface11).method93
		       (((Class480) this).anIntArrayArray6421[i][0],
			1954635556));
		if (interface11.getVarBitValue(class316, (short) 1145)
		    >= ((Class480) this).anIntArrayArray6421[i][2])
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method10968(Interface11 interface11, int i) {
	if (((Class480) this).aClass482_6426.method11013(interface11,
							 1179814701)
	    < -104133169 * anInt6419)
	    return false;
	return true;
    }
    
    public boolean method10969(Interface11 interface11, int i, int i_8_) {
	if (anIntArrayArray6417 == null || i < 0
	    || i >= anIntArrayArray6417.length)
	    return false;
	if (((Interface50) interface11).getSkillBaseLevel(anIntArrayArray6417[i][0],
						  299234860)
	    < anIntArrayArray6417[i][1])
	    return false;
	return true;
    }
    
    public boolean method10970(Interface11 interface11, int i, int i_9_) {
	if (anIntArray6427 == null || i < 0 || i >= anIntArray6427.length)
	    return false;
	if (!((Class480) this).aClass482_6426.method11010
		 (anIntArray6427[i], (short) 825)
		 .method10966(interface11, 70807293))
	    return false;
	return true;
    }
    
    public boolean method10971(Interface11 interface11, int i, int i_10_) {
	if (null == anIntArray6430 || i < 0 || i >= anIntArray6430.length)
	    return false;
	VarType class179
	    = ((Interface13) interface11).method96(VarDomainType.PLAYER,
						   anIntArray6430[i],
						   (byte) 127);
	int i_11_ = interface11.getVarValueInt(class179, -1376111984);
	if (i_11_ < ((Class480) this).anIntArray6431[i]
	    || i_11_ > ((Class480) this).anIntArray6432[i])
	    return false;
	return true;
    }
    
    public boolean method10972(Interface11 interface11, int i, int i_12_) {
	if (anIntArray6434 == null || i < 0 || i >= anIntArray6434.length)
	    return false;
	VarBitType class316
	    = ((Interface13) interface11).method93(anIntArray6434[i],
						   2131625833);
	int i_13_ = interface11.getVarBitValue(class316, (short) 19764);
	if (i_13_ < ((Class480) this).anIntArray6429[i]
	    || i_13_ > ((Class480) this).anIntArray6436[i])
	    return false;
	return true;
    }
    
    public boolean method10973(Interface11 interface11, int i) {
	if (((Class480) this).aClass482_6426.method11013(interface11,
							 -1732854422)
	    < anInt6419 * -104133169)
	    return false;
	if (anIntArrayArray6417 != null) {
	    for (int i_14_ = 0; i_14_ < anIntArrayArray6417.length; i_14_++) {
		if (((Interface50) interface11)
			.getSkillBaseLevel(anIntArrayArray6417[i_14_][0], -1655094176)
		    < anIntArrayArray6417[i_14_][1])
		    return false;
	    }
	}
	if (null != anIntArray6427) {
	    for (int i_15_ = 0; i_15_ < anIntArray6427.length; i_15_++) {
		if (!((Class480) this).aClass482_6426.method11010
			 (anIntArray6427[i_15_], (short) 5991)
			 .method10966(interface11, -660464772))
		    return false;
	    }
	}
	if (anIntArray6430 != null) {
	    for (int i_16_ = 0; i_16_ < anIntArray6430.length; i_16_++) {
		VarType class179
		    = ((Interface13) interface11).method96((VarDomainType
							    .PLAYER),
							   (anIntArray6430
							    [i_16_]),
							   (byte) 61);
		int i_17_ = interface11.getVarValueInt(class179, -424705308);
		if (i_17_ < ((Class480) this).anIntArray6431[i_16_]
		    || i_17_ > ((Class480) this).anIntArray6432[i_16_])
		    return false;
	    }
	}
	if (null != anIntArray6434) {
	    for (int i_18_ = 0; i_18_ < anIntArray6434.length; i_18_++) {
		VarBitType class316
		    = ((Interface13) interface11)
			  .method93(anIntArray6434[i_18_], 2118983671);
		int i_19_ = interface11.getVarBitValue(class316, (short) 1201);
		if (i_19_ < ((Class480) this).anIntArray6429[i_18_]
		    || i_19_ > ((Class480) this).anIntArray6436[i_18_])
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method10974(Interface11 interface11) {
	if (((Class480) this).anIntArrayArray6420 != null) {
	    for (int i = 0; i < ((Class480) this).anIntArrayArray6420.length;
		 i++) {
		VarType class179
		    = (((Interface13) interface11).method96
		       (VarDomainType.PLAYER,
			((Class480) this).anIntArrayArray6420[i][0],
			(byte) 33));
		if (interface11.getVarValueInt(class179, -1800761999)
		    >= ((Class480) this).anIntArrayArray6420[i][1])
		    return true;
	    }
	}
	if (null != ((Class480) this).anIntArrayArray6421) {
	    for (int i = 0; i < ((Class480) this).anIntArrayArray6421.length;
		 i++) {
		VarBitType class316
		    = (((Interface13) interface11).method93
		       (((Class480) this).anIntArrayArray6421[i][0],
			1519474168));
		if (interface11.getVarBitValue(class316, (short) 13655)
		    >= ((Class480) this).anIntArrayArray6421[i][1])
		    return true;
	    }
	}
	return false;
    }
    
    void method10975(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    aString6425 = class241_sub3.readJagString(255820705);
	else if (2 == i)
	    aString6438 = class241_sub3.readJagString(-1634414610);
	else if (i == 3) {
	    int i_20_ = class241_sub3.readUnsignedByte((byte) 27);
	    ((Class480) this).anIntArrayArray6420 = new int[i_20_][3];
	    for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
		((Class480) this).anIntArrayArray6420[i_21_][0]
		    = class241_sub3.readUnsignedShort(1162222719);
		((Class480) this).anIntArrayArray6420[i_21_][1]
		    = class241_sub3.readInt((byte) 47);
		((Class480) this).anIntArrayArray6420[i_21_][2]
		    = class241_sub3.readInt((byte) 93);
	    }
	} else if (i == 4) {
	    int i_22_ = class241_sub3.readUnsignedByte((byte) -35);
	    ((Class480) this).anIntArrayArray6421 = new int[i_22_][3];
	    for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
		((Class480) this).anIntArrayArray6421[i_23_][0]
		    = class241_sub3.readUnsignedShort(1162222719);
		((Class480) this).anIntArrayArray6421[i_23_][1]
		    = class241_sub3.readInt((byte) 22);
		((Class480) this).anIntArrayArray6421[i_23_][2]
		    = class241_sub3.readInt((byte) 94);
	    }
	} else if (i == 5)
	    class241_sub3.readUnsignedShort(1162222719);
	else if (i == 6)
	    anInt6422 = class241_sub3.readUnsignedByte((byte) -97) * -953757589;
	else if (i == 7)
	    anInt6435 = class241_sub3.readUnsignedByte((byte) 39) * -722791555;
	else if (i == 8)
	    aBool6424 = true;
	else if (9 == i)
	    anInt6428 = class241_sub3.readUnsignedByte((byte) -33) * 1287417821;
	else if (10 == i) {
	    int i_24_ = class241_sub3.readUnsignedByte((byte) -9);
	    ((Class480) this).anIntArray6423 = new int[i_24_];
	    for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
		((Class480) this).anIntArray6423[i_25_]
		    = class241_sub3.readInt((byte) 113);
	} else if (12 == i)
	    class241_sub3.readInt((byte) 2);
	else if (i == 13) {
	    int i_26_ = class241_sub3.readUnsignedByte((byte) 82);
	    anIntArray6427 = new int[i_26_];
	    for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
		anIntArray6427[i_27_] = class241_sub3.readUnsignedShort(1162222719);
	} else if (i == 14) {
	    int i_28_ = class241_sub3.readUnsignedByte((byte) 21);
	    anIntArrayArray6417 = new int[i_28_][2];
	    for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
		anIntArrayArray6417[i_29_][0]
		    = class241_sub3.readUnsignedByte((byte) -42);
		anIntArrayArray6417[i_29_][1]
		    = class241_sub3.readUnsignedByte((byte) -37);
	    }
	} else if (15 == i)
	    anInt6419 = class241_sub3.readUnsignedShort(1162222719) * 1337776431;
	else if (i == 17)
	    anInt6439 = class241_sub3.readBigSmart((byte) 6) * -685774239;
	else if (18 == i) {
	    int i_30_ = class241_sub3.readUnsignedByte((byte) 42);
	    anIntArray6430 = new int[i_30_];
	    ((Class480) this).anIntArray6431 = new int[i_30_];
	    ((Class480) this).anIntArray6432 = new int[i_30_];
	    aStringArray6433 = new String[i_30_];
	    for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
		anIntArray6430[i_31_] = class241_sub3.readInt((byte) 93);
		((Class480) this).anIntArray6431[i_31_]
		    = class241_sub3.readInt((byte) 11);
		((Class480) this).anIntArray6432[i_31_]
		    = class241_sub3.readInt((byte) 114);
		aStringArray6433[i_31_]
		    = class241_sub3.readString(1296193025);
	    }
	} else if (19 == i) {
	    int i_32_ = class241_sub3.readUnsignedByte((byte) 25);
	    anIntArray6434 = new int[i_32_];
	    ((Class480) this).anIntArray6429 = new int[i_32_];
	    ((Class480) this).anIntArray6436 = new int[i_32_];
	    aStringArray6437 = new String[i_32_];
	    for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
		anIntArray6434[i_33_] = class241_sub3.readInt((byte) 108);
		((Class480) this).anIntArray6429[i_33_]
		    = class241_sub3.readInt((byte) 58);
		((Class480) this).anIntArray6436[i_33_]
		    = class241_sub3.readInt((byte) 51);
		aStringArray6437[i_33_] = class241_sub3.readString(821602521);
	    }
	} else if (249 == i) {
	    int i_34_ = class241_sub3.readUnsignedByte((byte) -92);
	    if (((Class480) this).aClass407_6418 == null) {
		int i_35_ = method11001(i_34_, (byte) 48);
		((Class480) this).aClass407_6418 = new HashTable(i_35_);
	    }
	    for (int i_36_ = 0; i_36_ < i_34_; i_36_++) {
		boolean bool = class241_sub3.readUnsignedByte((byte) -95) == 1;
		int i_37_ = class241_sub3.readTriByte(1771646547);
		Node class241;
		if (bool)
		    class241
			= new ObjectNode(class241_sub3
						 .readString(-453702548));
		else
		    class241 = new IntegerNode(class241_sub3
						      .readInt((byte) 83));
		((Class480) this).aClass407_6418.put(class241,
							    (long) i_37_);
	    }
	}
    }
    
    void method10976() {
	if (null == aString6438)
	    aString6438 = aString6425;
    }
    
    void method10977() {
	if (null == aString6438)
	    aString6438 = aString6425;
    }
    
    void method10978(RSByteBuffer class241_sub3, byte i) {
	for (;;) {
	    int i_38_ = class241_sub3.readUnsignedByte((byte) 8);
	    if (i_38_ == 0)
		break;
	    method10997(class241_sub3, i_38_, -114081145);
	}
    }
    
    public int method10979(int i, int i_39_) {
	if (null == ((Class480) this).aClass407_6418)
	    return i_39_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       ((Class480) this).aClass407_6418.get((long) i));
	if (class241_sub22 == null)
	    return i_39_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public int method10980(int i, int i_40_) {
	if (null == ((Class480) this).aClass407_6418)
	    return i_40_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       ((Class480) this).aClass407_6418.get((long) i));
	if (class241_sub22 == null)
	    return i_40_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public String method10981(int i, String string) {
	if (((Class480) this).aClass407_6418 == null)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       ((Class480) this).aClass407_6418.get((long) i));
	if (class241_sub26 == null)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    public boolean method10982(Interface11 interface11) {
	if (((Class480) this).anIntArrayArray6420 != null) {
	    for (int i = 0; i < ((Class480) this).anIntArrayArray6420.length;
		 i++) {
		VarType class179
		    = (((Interface13) interface11).method96
		       (VarDomainType.PLAYER,
			((Class480) this).anIntArrayArray6420[i][0],
			(byte) 119));
		if (interface11.getVarValueInt(class179, -1611456201)
		    >= ((Class480) this).anIntArrayArray6420[i][1])
		    return true;
	    }
	}
	if (null != ((Class480) this).anIntArrayArray6421) {
	    for (int i = 0; i < ((Class480) this).anIntArrayArray6421.length;
		 i++) {
		VarBitType class316
		    = (((Interface13) interface11).method93
		       (((Class480) this).anIntArrayArray6421[i][0],
			1414778947));
		if (interface11.getVarBitValue(class316, (short) 13988)
		    >= ((Class480) this).anIntArrayArray6421[i][1])
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method10983(Interface11 interface11, int i) {
	if (anIntArray6434 == null || i < 0 || i >= anIntArray6434.length)
	    return false;
	VarBitType class316
	    = ((Interface13) interface11).method93(anIntArray6434[i],
						   1809510719);
	int i_41_ = interface11.getVarBitValue(class316, (short) 24604);
	if (i_41_ < ((Class480) this).anIntArray6429[i]
	    || i_41_ > ((Class480) this).anIntArray6436[i])
	    return false;
	return true;
    }
    
    public boolean method10984(Interface11 interface11) {
	if (null != ((Class480) this).anIntArrayArray6420) {
	    for (int i = 0; i < ((Class480) this).anIntArrayArray6420.length;
		 i++) {
		VarType class179
		    = (((Interface13) interface11).method96
		       (VarDomainType.PLAYER,
			((Class480) this).anIntArrayArray6420[i][0],
			(byte) 15));
		if (interface11.getVarValueInt(class179, -930547202)
		    >= ((Class480) this).anIntArrayArray6420[i][2])
		    return true;
	    }
	}
	if (null != ((Class480) this).anIntArrayArray6421) {
	    for (int i = 0; i < ((Class480) this).anIntArrayArray6421.length;
		 i++) {
		VarBitType class316
		    = (((Interface13) interface11).method93
		       (((Class480) this).anIntArrayArray6421[i][0],
			1690490534));
		if (interface11.getVarBitValue(class316, (short) 23336)
		    >= ((Class480) this).anIntArrayArray6421[i][2])
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method10985(Interface11 interface11, int i) {
	if (anIntArray6427 == null || i < 0 || i >= anIntArray6427.length)
	    return false;
	if (!((Class480) this).aClass482_6426.method11010
		 (anIntArray6427[i], (short) 3200)
		 .method10966(interface11, 1038939744))
	    return false;
	return true;
    }
    
    void method10986(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 30);
	    if (i == 0)
		break;
	    method10997(class241_sub3, i, -294170);
	}
    }
    
    public boolean method10987(Interface11 interface11) {
	if (((Class480) this).aClass482_6426.method11013(interface11,
							 417392012)
	    < anInt6419 * -104133169)
	    return false;
	if (anIntArrayArray6417 != null) {
	    for (int i = 0; i < anIntArrayArray6417.length; i++) {
		if (((Interface50) interface11)
			.getSkillBaseLevel(anIntArrayArray6417[i][0], -1651014721)
		    < anIntArrayArray6417[i][1])
		    return false;
	    }
	}
	if (null != anIntArray6427) {
	    for (int i = 0; i < anIntArray6427.length; i++) {
		if (!((Class480) this).aClass482_6426.method11010
			 (anIntArray6427[i], (short) -5811)
			 .method10966(interface11, -512180416))
		    return false;
	    }
	}
	if (anIntArray6430 != null) {
	    for (int i = 0; i < anIntArray6430.length; i++) {
		VarType class179
		    = ((Interface13) interface11).method96((VarDomainType
							    .PLAYER),
							   anIntArray6430[i],
							   (byte) 78);
		int i_42_ = interface11.getVarValueInt(class179, -762953366);
		if (i_42_ < ((Class480) this).anIntArray6431[i]
		    || i_42_ > ((Class480) this).anIntArray6432[i])
		    return false;
	    }
	}
	if (null != anIntArray6434) {
	    for (int i = 0; i < anIntArray6434.length; i++) {
		VarBitType class316
		    = ((Interface13) interface11).method93(anIntArray6434[i],
							   1308696694);
		int i_43_ = interface11.getVarBitValue(class316, (short) 27854);
		if (i_43_ < ((Class480) this).anIntArray6429[i]
		    || i_43_ > ((Class480) this).anIntArray6436[i])
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method10988(Interface11 interface11) {
	if (((Class480) this).aClass482_6426.method11013(interface11,
							 -370932755)
	    < anInt6419 * -104133169)
	    return false;
	if (anIntArrayArray6417 != null) {
	    for (int i = 0; i < anIntArrayArray6417.length; i++) {
		if (((Interface50) interface11)
			.getSkillBaseLevel(anIntArrayArray6417[i][0], -812421982)
		    < anIntArrayArray6417[i][1])
		    return false;
	    }
	}
	if (null != anIntArray6427) {
	    for (int i = 0; i < anIntArray6427.length; i++) {
		if (!((Class480) this).aClass482_6426.method11010
			 (anIntArray6427[i], (short) 1111)
			 .method10966(interface11, 1361978182))
		    return false;
	    }
	}
	if (anIntArray6430 != null) {
	    for (int i = 0; i < anIntArray6430.length; i++) {
		VarType class179
		    = ((Interface13) interface11).method96((VarDomainType
							    .PLAYER),
							   anIntArray6430[i],
							   (byte) 33);
		int i_44_ = interface11.getVarValueInt(class179, -594692834);
		if (i_44_ < ((Class480) this).anIntArray6431[i]
		    || i_44_ > ((Class480) this).anIntArray6432[i])
		    return false;
	    }
	}
	if (null != anIntArray6434) {
	    for (int i = 0; i < anIntArray6434.length; i++) {
		VarBitType class316
		    = ((Interface13) interface11).method93(anIntArray6434[i],
							   1973418021);
		int i_45_ = interface11.getVarBitValue(class316, (short) 27392);
		if (i_45_ < ((Class480) this).anIntArray6429[i]
		    || i_45_ > ((Class480) this).anIntArray6436[i])
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method10989(Interface11 interface11) {
	if (((Class480) this).aClass482_6426.method11013(interface11,
							 -845984534)
	    < -104133169 * anInt6419)
	    return false;
	return true;
    }
    
    public boolean method10990(Interface11 interface11) {
	if (((Class480) this).aClass482_6426.method11013(interface11,
							 -1967350193)
	    < -104133169 * anInt6419)
	    return false;
	return true;
    }
    
    public boolean method10991(Interface11 interface11) {
	if (((Class480) this).aClass482_6426.method11013(interface11,
							 464171180)
	    < -104133169 * anInt6419)
	    return false;
	return true;
    }
    
    public boolean method10992(Interface11 interface11, int i) {
	if (anIntArrayArray6417 == null || i < 0
	    || i >= anIntArrayArray6417.length)
	    return false;
	if (((Interface50) interface11).getSkillBaseLevel(anIntArrayArray6417[i][0],
						  367667407)
	    < anIntArrayArray6417[i][1])
	    return false;
	return true;
    }
    
    public boolean method10993(Interface11 interface11, int i) {
	if (anIntArray6427 == null || i < 0 || i >= anIntArray6427.length)
	    return false;
	if (!((Class480) this).aClass482_6426.method11010
		 (anIntArray6427[i], (short) -11925)
		 .method10966(interface11, 1775115394))
	    return false;
	return true;
    }
    
    public int method10994(int i, int i_46_) {
	if (null == ((Class480) this).aClass407_6418)
	    return i_46_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       ((Class480) this).aClass407_6418.get((long) i));
	if (class241_sub22 == null)
	    return i_46_;
	return class241_sub22.intValue * -1859754807;
    }
    
    void method10995(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -38);
	    if (i == 0)
		break;
	    method10997(class241_sub3, i, 128701922);
	}
    }
    
    public boolean method10996(Interface11 interface11, int i) {
	if (null == anIntArray6430 || i < 0 || i >= anIntArray6430.length)
	    return false;
	VarType class179
	    = ((Interface13) interface11).method96(VarDomainType.PLAYER,
						   anIntArray6430[i],
						   (byte) 75);
	int i_47_ = interface11.getVarValueInt(class179, -581146017);
	if (i_47_ < ((Class480) this).anIntArray6431[i]
	    || i_47_ > ((Class480) this).anIntArray6432[i])
	    return false;
	return true;
    }
    
    void method10997(RSByteBuffer class241_sub3, int i, int i_48_) {
	if (i == 1)
	    aString6425 = class241_sub3.readJagString(-792287442);
	else if (2 == i)
	    aString6438 = class241_sub3.readJagString(-828396762);
	else if (i == 3) {
	    int i_49_ = class241_sub3.readUnsignedByte((byte) -21);
	    ((Class480) this).anIntArrayArray6420 = new int[i_49_][3];
	    for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
		((Class480) this).anIntArrayArray6420[i_50_][0]
		    = class241_sub3.readUnsignedShort(1162222719);
		((Class480) this).anIntArrayArray6420[i_50_][1]
		    = class241_sub3.readInt((byte) 43);
		((Class480) this).anIntArrayArray6420[i_50_][2]
		    = class241_sub3.readInt((byte) 82);
	    }
	} else if (i == 4) {
	    int i_51_ = class241_sub3.readUnsignedByte((byte) 3);
	    ((Class480) this).anIntArrayArray6421 = new int[i_51_][3];
	    for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
		((Class480) this).anIntArrayArray6421[i_52_][0]
		    = class241_sub3.readUnsignedShort(1162222719);
		((Class480) this).anIntArrayArray6421[i_52_][1]
		    = class241_sub3.readInt((byte) 67);
		((Class480) this).anIntArrayArray6421[i_52_][2]
		    = class241_sub3.readInt((byte) 95);
	    }
	} else if (i == 5)
	    class241_sub3.readUnsignedShort(1162222719);
	else if (i == 6)
	    anInt6422 = class241_sub3.readUnsignedByte((byte) -75) * -953757589;
	else if (i == 7)
	    anInt6435 = class241_sub3.readUnsignedByte((byte) 55) * -722791555;
	else if (i == 8)
	    aBool6424 = true;
	else if (9 == i)
	    anInt6428 = class241_sub3.readUnsignedByte((byte) -85) * 1287417821;
	else if (10 == i) {
	    int i_53_ = class241_sub3.readUnsignedByte((byte) 93);
	    ((Class480) this).anIntArray6423 = new int[i_53_];
	    for (int i_54_ = 0; i_54_ < i_53_; i_54_++)
		((Class480) this).anIntArray6423[i_54_]
		    = class241_sub3.readInt((byte) 32);
	} else if (12 == i)
	    class241_sub3.readInt((byte) 92);
	else if (i == 13) {
	    int i_55_ = class241_sub3.readUnsignedByte((byte) -53);
	    anIntArray6427 = new int[i_55_];
	    for (int i_56_ = 0; i_56_ < i_55_; i_56_++)
		anIntArray6427[i_56_] = class241_sub3.readUnsignedShort(1162222719);
	} else if (i == 14) {
	    int i_57_ = class241_sub3.readUnsignedByte((byte) -74);
	    anIntArrayArray6417 = new int[i_57_][2];
	    for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
		anIntArrayArray6417[i_58_][0]
		    = class241_sub3.readUnsignedByte((byte) 27);
		anIntArrayArray6417[i_58_][1]
		    = class241_sub3.readUnsignedByte((byte) 29);
	    }
	} else if (15 == i)
	    anInt6419 = class241_sub3.readUnsignedShort(1162222719) * 1337776431;
	else if (i == 17)
	    anInt6439 = class241_sub3.readBigSmart((byte) -11) * -685774239;
	else if (18 == i) {
	    int i_59_ = class241_sub3.readUnsignedByte((byte) 17);
	    anIntArray6430 = new int[i_59_];
	    ((Class480) this).anIntArray6431 = new int[i_59_];
	    ((Class480) this).anIntArray6432 = new int[i_59_];
	    aStringArray6433 = new String[i_59_];
	    for (int i_60_ = 0; i_60_ < i_59_; i_60_++) {
		anIntArray6430[i_60_] = class241_sub3.readInt((byte) 106);
		((Class480) this).anIntArray6431[i_60_]
		    = class241_sub3.readInt((byte) 45);
		((Class480) this).anIntArray6432[i_60_]
		    = class241_sub3.readInt((byte) 64);
		aStringArray6433[i_60_]
		    = class241_sub3.readString(1212941752);
	    }
	} else if (19 == i) {
	    int i_61_ = class241_sub3.readUnsignedByte((byte) -13);
	    anIntArray6434 = new int[i_61_];
	    ((Class480) this).anIntArray6429 = new int[i_61_];
	    ((Class480) this).anIntArray6436 = new int[i_61_];
	    aStringArray6437 = new String[i_61_];
	    for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
		anIntArray6434[i_62_] = class241_sub3.readInt((byte) 44);
		((Class480) this).anIntArray6429[i_62_]
		    = class241_sub3.readInt((byte) 7);
		((Class480) this).anIntArray6436[i_62_]
		    = class241_sub3.readInt((byte) 116);
		aStringArray6437[i_62_] = class241_sub3.readString(-42909380);
	    }
	} else if (249 == i) {
	    int i_63_ = class241_sub3.readUnsignedByte((byte) -57);
	    if (((Class480) this).aClass407_6418 == null) {
		int i_64_ = method11001(i_63_, (byte) -100);
		((Class480) this).aClass407_6418 = new HashTable(i_64_);
	    }
	    for (int i_65_ = 0; i_65_ < i_63_; i_65_++) {
		boolean bool = class241_sub3.readUnsignedByte((byte) -70) == 1;
		int i_66_ = class241_sub3.readTriByte(1771646547);
		Node class241;
		if (bool)
		    class241
			= new ObjectNode(class241_sub3
						 .readString(1185833363));
		else
		    class241
			= new IntegerNode(class241_sub3
						 .readInt((byte) 122));
		((Class480) this).aClass407_6418.put(class241,
							    (long) i_66_);
	    }
	}
    }
    
    public boolean method10998(Interface11 interface11, int i) {
	if (anIntArray6434 == null || i < 0 || i >= anIntArray6434.length)
	    return false;
	VarBitType class316
	    = ((Interface13) interface11).method93(anIntArray6434[i],
						   1892860524);
	int i_67_ = interface11.getVarBitValue(class316, (short) 21245);
	if (i_67_ < ((Class480) this).anIntArray6429[i]
	    || i_67_ > ((Class480) this).anIntArray6436[i])
	    return false;
	return true;
    }
    
    static final void method10999(ClientScriptData class454, int i) {
	int i_68_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_68_, (byte) -3);
	int i_69_ = -1;
	int i_70_ = -1;
	Class118 class118
	    = class58.method1518(Class236.aClass103_2713, -1084516835);
	if (class118 != null) {
	    i_69_ = class118.anInt1560 * 1403518843;
	    i_70_ = 574765281 * class118.anInt1556;
	}
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_69_;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_70_;
    }
    
    static final void method11000(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_71_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_72_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	int i_73_ = (((ClientScriptData) class454).integerStack
		     [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class581.processActionButton(7, i_71_ << 16 | i_72_, i_73_, "", -631931769);
    }
    
    public static int method11001(int i, byte i_74_) {
	i = --i | i >>> 1;
	i |= i >>> 2;
	i |= i >>> 4;
	i |= i >>> 8;
	i |= i >>> 16;
	return 1 + i;
    }
    
    static final void addIgnore/*method11002*/(ClientScriptData scriptData, int i) {
		String string = (String) scriptData.objectStack[(scriptData.objectStackPointer -= -1650705371) * -290357331];
		Class258.addIgnore(string, true, (short) 256);
    }
    
    static final void decodeMasks/*method11003*/ (RSBitBuffer stream, int playerIndex, Player player, int mask, byte i_76_) {
    	//System.out.println("mask=0x"+Integer.toHexString(mask));
		if (0 != (mask & 0x1000)) {//0
		    int i_77_ = stream.readUnsignedByteS((byte) 82);
		    int[] is = new int[i_77_];
		    int[] is_78_ = new int[i_77_];
		    int[] is_79_ = new int[i_77_];
		    for (int i_80_ = 0; i_80_ < i_77_; i_80_++) {
				is[i_80_] = stream.readBigSmart((byte) -14);
				is_78_[i_80_] = stream.readUnsignedByte((byte) -24);
				is_79_[i_80_] = stream.readUnsignedLEShortA(1448102214);
		    }
		    Class107.method2685(player, is, is_78_, is_79_, -569124043);
		}
		if ((mask & 0x10000) != 0) {//1
		    player.aByte11416 = stream.getByteC(537746309);
		    player.aByte11395 = stream.getByteC(537746309);
		    player.aByte11412 = stream.readByteA(582493488);
		    player.aByte11413 = (byte) stream.readUnsignedByteS((byte) 88);
		    player.anInt11408 = (client.anInt8296 + stream.readUnsignedShort(1162222719)) * -1558068143;
		    player.anInt11389 = (client.anInt8296 + stream.readUnsignedShortA((byte) 69)) * -960497231;
		}
		if ((mask & 0x400000) != 0) {//Graphic 5 (2)
		    int gfxID = stream.readUnsignedShort(1162222719);//ID
		    int settingsHash = stream.readIntV2(1274614902);//SettingsHash
		    if (65535 == gfxID) {
		    	gfxID = -1;
		    }
		    int rotationHash = stream.getByteA(-2045913907);//SettingsHash2
		    int i_84_ = rotationHash & 0x7;
		    int i_85_ = rotationHash >> 3 & 0xf;
		    if (15 == i_85_) {
		    	i_85_ = -1;
		    }
		    boolean bool = (rotationHash >> 7 & 0x1) == 1;
		    //System.out.println("Decoded graphic type 1. ID="+gfxID);
		    player.method17788(gfxID, settingsHash, i_84_, i_85_, bool, 4, 1110531126);
		}
		if ((mask & 0x100) != 0) {//3
		    player.aBool11496 = stream.readByteC((byte) 15) == 1;
		}
		if (0 != (mask & 0x2)) {//Face entity (4)
		    int entityIndex = stream.readUnsignedLEShort((short) 7618);
		    if (entityIndex == 65535) {
		    	entityIndex = -1;
		    }
		    player.facingEntity = entityIndex * 1027225177;
		}
		if ((mask & 0x8000) != 0) {//Graphic 2 (5)
		    int gfxID = stream.readUnsignedLEShortA(-614473825);
		    int settingsHash = stream.readIntV2(1274614902);
		    if (65535 == gfxID) {
		    	gfxID = -1;
		    }
		    int rotationHash = stream.readByteC((byte) 30);
		    int i_90_ = rotationHash & 0x7;
		    int i_91_ = rotationHash >> 3 & 0xf;
		    if (15 == i_91_) {
		    	i_91_ = -1;
		    }
		    boolean bool = 1 == (rotationHash >> 7 & 0x1);
		    player.method17788(gfxID, settingsHash, i_90_, i_91_, bool, 1, -1414825913);
		}
		if (0 != (mask & 0x20000)) {//6
		    int i_92_ = stream.readByteC((byte) 33);
		    int[] is = new int[i_92_];
		    int[] is_93_ = new int[i_92_];
		    for (int i_94_ = 0; i_94_ < i_92_; i_94_++) {
			int i_95_ = stream.readUnsignedLEShort((short) 2061);
				if ((i_95_ & 0xc000) == 49152) {
				    int i_96_ = stream.readUnsignedLEShortA(1747392939);
				    is[i_94_] = i_95_ << 16 | i_96_;
				} else {
				    is[i_94_] = i_95_;
				}
				is_93_[i_94_] = stream.readUnsignedLEShortA(2031262605);
		    }
		    player.method17773(is, is_93_, 561638477);
		}
		if (0 != (mask & 0x200000)) {//7
		    player.aBool11494 = stream.getByteA(-1978908402) == 1;
		}
		if (0 != (mask & 0x400)) {//Graphic 3 (8)
		    int gfxID = stream.readUnsignedLEShort((short) 15740);
		    int settingsHash = stream.readIntV1((short) 5149);
		    if (gfxID == 65535) {
		    	gfxID = -1;
		    }
		    int rotationHash = stream.readUnsignedByteS((byte) 32);
		    int i_100_ = rotationHash & 0x7;
		    int i_101_ = rotationHash >> 3 & 0xf;
		    if (i_101_ == 15) {
		    	i_101_ = -1;
		    }
		    boolean bool = (rotationHash >> 7 & 0x1) == 1;
		    player.method17788(gfxID, settingsHash, i_100_, i_101_, bool, 2, -25795747);
		}
		if ((mask & 0x10) != 0) {//Emotes (9)
		    int[] animIDs = new int[4];
		    for (int index = 0; index < 4; index++) {
		    	animIDs[index] = stream.readBigSmart((byte) -16);
		    }
		    int delay = stream.readUnsignedByte((byte) -3);
		    Class638.method13557(player, animIDs, delay, false, (byte) 43);
		}
		if (0 != (mask & 0x80000)) {//10
		    stream.pointer += -1362085898;
		    int i_104_ = (stream.payload[((stream.pointer += -681042949) * 421967667 - 1)] & 0xff);
		    for (int i_105_ = 0; i_105_ < i_104_; i_105_++) {
				int i_106_ = stream.readUnsignedByte((byte) -110);
				BaseVarType class217 = (BaseVarType) Class494.method11278(BaseVarType.class, i_106_, (byte) -39);
				Class254 class254
				    = Class177.VAR_PLAYER_LIST.decodeVarValue(stream, class217, -1843925137);
				player.anInterface46_11409.method335(class254.key * 623518843, 
						class254.value, (byte) -20);
		    }
		}
		if (0 != (mask & 0x1)) {//Graphic 1 (11)
		    int gfxID = stream.readUnsignedShort(1162222719);
		    int settingsHash = stream.readIntV1((short) 653);
		    if (65535 == gfxID) {
		    	gfxID = -1;
		    }
		    int rotationHash = stream.readUnsignedByteS((byte) 51);
		    int i_110_ = rotationHash & 0x7;
		    int i_111_ = rotationHash >> 3 & 0xf;
		    if (i_111_ == 15) {
		    	i_111_ = -1;
		    }
		    boolean bool = 1 == (rotationHash >> 7 & 0x1);
		    player.method17788(gfxID, settingsHash, i_110_, i_111_, bool, 0, 978106450);
		}
		if ((mask & 0x40000) != 0) {//12
		    player.anInterface46_11409.method195(-1964500894);
		    stream.pointer += -1362085898;
		    int i_112_ = (stream.payload[((stream.pointer += -681042949) * 421967667 - 1)] & 0xff);
		    for (int i_113_ = 0; i_113_ < i_112_; i_113_++) {
				int i_114_ = stream.readByteC((byte) 84);
				BaseVarType class217 
					= (BaseVarType) Class494.method11278(BaseVarType.class, i_114_, (byte) -97);
				Class254 class254 
					= Class177.VAR_PLAYER_LIST.decodeVarValue(stream, class217, -1843925137);
				player.anInterface46_11409.method335(class254.key * 623518843, 
						class254.value, (byte) -8);
		    }
		}
		if ((mask & 0x800) != 0) {//13
		    int length = stream.readByteC((byte) 46);
		    byte[] is = new byte[length];
		    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
		    stream.readReverseA(is, 0, length, 1489266237);
		    GPI.aClass241_Sub3Array2366[playerIndex] = class241_sub3;
		    player.method17955(class241_sub3, -1405161748);
		}
		if ((mask & 0x80) != 0) {//Character data (appearance) (14)
		    int size = stream.readUnsignedByteS((byte) 88);
		    byte[] data = new byte[size];
		    RSByteBuffer appearanceBlock = new RSByteBuffer(data);
		    stream.readReverseA(data, 0, size, 1224380593);
		    GPI.aClass241_Sub3Array2373[playerIndex] = appearanceBlock;
		    player.decodeCharacterData(appearanceBlock, (byte) 14);
		}
		if ((mask & 0x4) != 0) {//Hits (15)
		    int count = stream.readByteC((byte) 93);
		    if (count > 0) {
				for (int index = 0; index < count; index++) {
				    int soakingMark = -1;
				    int damage = -1;
				    int soakingDamange = -1;
				    int hitMark = stream.readSmart((short) -6659);
				    if (hitMark == 32767) {
				    	hitMark = stream.readSmart((short) -25596);
				    	damage = stream.readSmart((short) -29565);
				    	soakingMark = stream.readSmart((short) -6524);
				    	soakingDamange = stream.readSmart((short) -25192);
				    } else if (32766 != hitMark) {
				    	damage = stream.readSmart((short) -19648);
				    } else {
				    	hitMark = -1;
				    	damage = stream.readUnsignedByteS((byte) 14);
				    }
				    int delay = stream.readSmart((short) 487);
				    player.setHitMark(hitMark, damage, soakingMark, soakingDamange,
				    		client.anInt8296, delay, -1740490402);
				}
		    }
		    int i_124_ = stream.readUnsignedByteS((byte) 45);
		    if (i_124_ > 0) {
				for (int i_125_ = 0; i_125_ < i_124_; i_125_++) {
				    int i_126_ = stream.readSmart((short) -26204);
				    int i_127_ = stream.readSmart((short) -1709);
				    if (i_127_ != 32767) {
						int i_128_ = stream.readSmart((short) -9526);
						int i_129_ = stream.readUnsignedByteS((byte) 94);
						int i_130_ = (i_127_ > 0 ? stream.readUnsignedByteS((byte) 59) : i_129_);
						player.method17791(i_126_, client.anInt8296, i_127_, i_128_, i_129_,
						     i_130_, (byte) 0);
				    } else {
				    	player.method17780(i_126_, 286511346);
				    }
				}
		    }
		}
		if ((mask & 0x100000) != 0) {//Normal overhead message? (16)
		    String message = stream.readString(694002999);
		    int flags = stream.getByteA(-2045496267);
		    if ((flags & 0x1) != 0) {
		    	Class318.appendChatboxMessage(2, flags,
					    player.getFormattedName(true, -1679178456),
					    player.getName(false, -122333825),
					    player.nameFiltered,
					    message, -2101540840);
		    }
		    player.setOverheadMessage(message, 0, 0, (byte) 54);
		}
		if (0 != (mask & 0x20)) {//Face direction (17)
		    player.facingDirection = stream.readUnsignedLEShort((short) 15269) * 1164488315;
		    if (player.queuedStepCount * -316498507 == 0) {
				player.method17804(player.facingDirection * -989200205, 1681769629);
				player.facingDirection = -1164488315;
		    }
		}
		if (0 != (mask & 0x800000)) {//Graphics 4 (18)
		    int gfxID = stream.readUnsignedShort(1162222719);
		    int settingsHash = stream.readInt((byte) 29);
		    if (65535 == gfxID) {
		    	gfxID = -1;
		    }
		    int rotationHash = stream.readUnsignedByteS((byte) 95);
		    int i_135_ = rotationHash & 0x7;
		    int i_136_ = rotationHash >> 3 & 0xf;
		    if (i_136_ == 15) {
		    	i_136_ = -1;
		    }
		    boolean bool = 1 == (rotationHash >> 7 & 0x1);
		    player.method17788(gfxID, settingsHash, i_135_, i_136_, bool, 3, -1260894521);
		}
		if (0 != (mask & 0x4000)) {//Force talk (19)
		    String message = stream.readString(954503966);
		    if (Class21.myPlayer == player) {
		    	Class318.appendChatboxMessage(2, 0,
					    player.getFormattedName(true, -1325057323),
					    player.getName(false, -122333825),
					    player.nameFiltered,
					    message, -1942144612);
		    }
		    player.setOverheadMessage(message, 0, 0, (byte) 123);
		}
		if ((mask & 0x40) != 0) {//Force movement (20)
		    player.anInt11401 = stream.readByteA(582493488) * 2045684417;
		    player.anInt11403 = stream.readByteS((byte) 1) * -182768233;
		    player.anInt11402 = stream.readByteS((byte) 1) * -9202803;
		    player.anInt11428 = stream.getByteC(537746309) * -1841438277;
		    player.anInt11386 = (stream.readUnsignedLEShort((short) 32483) + client.anInt8296) * 1486211439;
		    player.anInt11422 = (stream.readUnsignedShortA((byte) 82) + client.anInt8296) * -2087589789;
		    player.anInt11407 = stream.readUnsignedShortA((byte) 33) * 364183757;
		    player.anInt11401 += (player.scenePositionXQueue[0] * 2045684417);
		    player.anInt11403 += (-182768233 * player.scenePositionYQueue[0]);
		    player.anInt11402 += player.scenePositionXQueue[0] * -9202803;
		    player.anInt11428 += (-1841438277 * player.scenePositionYQueue[0]);
		    player.queuedStepCount = 1631398045;
		    player.anInt11430 = 0;
		}
    }
    
    static final void method11004(ClientScriptData class454, int i) {
	int i_137_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) (Math.random() * (double) (i_137_ + 1));
    }
    
    public static boolean method11005(int i, int i_138_) {
	for (Class241_Sub39_Sub11 class241_sub39_sub11
		 = ((Class241_Sub39_Sub11)
		    Class16.aClass429_150.method7694(16711935));
	     null != class241_sub39_sub11;
	     class241_sub39_sub11
		 = ((Class241_Sub39_Sub11)
		    Class16.aClass429_150.method7692(1893424945))) {
	    if (Class321.method5931((((Class241_Sub39_Sub11)
				      class241_sub39_sub11).anInt10879
				     * -142243581),
				    (byte) 2)
		&& (long) i == -218357506993850339L * (((Class241_Sub39_Sub11)
							class241_sub39_sub11)
						       .aLong10877))
		return true;
	}
	return false;
    }
}
