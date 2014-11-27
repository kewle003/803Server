/* Class515 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class515
{
    int anInt6730;
    public int anInt6731;
    int anInt6732;
    public int anInt6733;
    Class524 aClass524_6734;
    int anInt6735;
    public int anInt6736;
    public int[] anIntArray6737;
    public static final int anInt6738 = 0;
    public static final int anInt6739 = 1;
    public static final int anInt6740 = 2;
    public int anInt6741;
    public int anInt6742;
    public boolean aBool6743;
    public boolean aBool6744;
    public String[] aStringArray6745;
    public String aString6746;
    public int anInt6747;
    public int anInt6748;
    int anInt6749;
    public int anInt6750;
    int anInt6751;
    int anInt6752;
    int anInt6753;
    int anInt6754;
    int anInt6755;
    public String aString6756;
    public int anInt6757;
    public int[] anIntArray6758;
    public int anInt6759;
    public int anInt6760;
    public int anInt6761;
    public int anInt6762;
    public int anInt6763;
    public int anInt6764;
    public int anInt6765;
    public int anInt6766;
    public int anInt6767;
    public byte[] aByteArray6768;
    public boolean aBool6769;
    public int anInt6770;
    HashTable aClass407_6771;
    public int anInt6772 = 1739933211;
    
    void method11577(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -56);
	    if (0 == i)
		break;
	    method11600(class241_sub3, i, 1156257833);
	}
    }
    
    public int method11578(int i, int i_0_) {
	if (((Class515) this).aClass407_6771 == null)
	    return i_0_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       ((Class515) this).aClass407_6771.get((long) i));
	if (null == class241_sub22)
	    return i_0_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public Class168 method11579(Class103 class103, boolean bool, byte i) {
	int i_1_ = bool ? 926228791 * anInt6733 : -705700883 * anInt6772;
	int i_2_ = i_1_ | 1931687493 * class103.anInt1456 << 29;
	Class168 class168
	    = (Class168) ((Class524) ((Class515) this).aClass524_6734)
			     .aClass129_6821.get((long) i_2_);
	if (null != class168)
	    return class168;
	if (!((Class524) ((Class515) this).aClass524_6734).aClass210_6816
		 .method4250(i_1_, -508597693))
	    return null;
	Class108 class108 = Class160.method3437((((Class524) (((Class515) this)
							      .aClass524_6734))
						 .aClass210_6816),
						i_1_, 0);
	if (null != class108) {
	    class168 = class103.method2289(class108, true);
	    ((Class524) ((Class515) this).aClass524_6734).aClass129_6821
		.put(class168, (long) i_2_);
	}
	return class168;
    }
    
    void method11580(int i) {
	if (null != anIntArray6737) {
	    for (int i_3_ = 0; i_3_ < anIntArray6737.length; i_3_ += 2) {
		if (anIntArray6737[i_3_] < anInt6757 * -1967356869)
		    anInt6757 = -34622221 * anIntArray6737[i_3_];
		else if (anIntArray6737[i_3_] > anInt6759 * 1389678465)
		    anInt6759 = anIntArray6737[i_3_] * -176459647;
		if (anIntArray6737[1 + i_3_] < anInt6742 * -1576680733)
		    anInt6742 = anIntArray6737[1 + i_3_] * 1877185227;
		else if (anIntArray6737[i_3_ + 1] > anInt6747 * -1423735679)
		    anInt6747 = -380585087 * anIntArray6737[1 + i_3_];
	    }
	}
    }
    
    void method11581(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_4_ = class241_sub3.readUnsignedByte((byte) -24);
	    if (0 == i_4_)
		break;
	    method11600(class241_sub3, i_4_, 1459846316);
	}
    }
    
    void method11582(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    anInt6772 = class241_sub3.readBigSmart((byte) -89) * -1739933211;
	else if (i == 2)
	    anInt6733 = class241_sub3.readBigSmart((byte) -25) * -1223793529;
	else if (i == 3)
	    aString6756 = class241_sub3.readString(-646354180);
	else if (4 == i)
	    anInt6750 = class241_sub3.readTriByte(1771646547) * 300629935;
	else if (5 == i)
	    anInt6736 = class241_sub3.readTriByte(1771646547) * 1616514229;
	else if (i == 6)
	    anInt6760 = class241_sub3.readUnsignedByte((byte) -2) * 1417314457;
	else if (7 == i) {
	    int i_5_ = class241_sub3.readUnsignedByte((byte) 44);
	    if (0 == (i_5_ & 0x1))
		aBool6743 = false;
	    if ((i_5_ & 0x2) == 2)
		aBool6744 = true;
	} else if (8 == i)
	    class241_sub3.readUnsignedByte((byte) -9);
	else if (9 == i) {
	    ((Class515) this).anInt6754
		= class241_sub3.readUnsignedShort(1162222719) * -2068971849;
	    if (266944263 * ((Class515) this).anInt6754 == 65535)
		((Class515) this).anInt6754 = 2068971849;
	    ((Class515) this).anInt6751
		= class241_sub3.readUnsignedShort(1162222719) * 1805724347;
	    if (-366769549 * ((Class515) this).anInt6751 == 65535)
		((Class515) this).anInt6751 = -1805724347;
	    ((Class515) this).anInt6753
		= class241_sub3.readInt((byte) 122) * 102724097;
	    ((Class515) this).anInt6749
		= class241_sub3.readInt((byte) 4) * 2113146749;
	} else if (i >= 10 && i <= 14)
	    aStringArray6745[i - 10] = class241_sub3.readString(-723975466);
	else if (15 == i) {
	    int i_6_ = class241_sub3.readUnsignedByte((byte) -27);
	    anIntArray6737 = new int[2 * i_6_];
	    for (int i_7_ = 0; i_7_ < i_6_ * 2; i_7_++)
		anIntArray6737[i_7_] = class241_sub3.readShort((byte) 61);
	    anInt6761 = class241_sub3.readInt((byte) 65) * 1020951857;
	    int i_8_ = class241_sub3.readUnsignedByte((byte) 110);
	    anIntArray6758 = new int[i_8_];
	    for (int i_9_ = 0; i_9_ < anIntArray6758.length; i_9_++)
		anIntArray6758[i_9_] = class241_sub3.readInt((byte) 119);
	    aByteArray6768 = new byte[i_6_];
	    for (int i_10_ = 0; i_10_ < i_6_; i_10_++)
		aByteArray6768[i_10_] = class241_sub3.getByte(-532569364);
	} else if (16 == i)
	    aBool6769 = false;
	else if (i == 17)
	    aString6746 = class241_sub3.readString(-543432809);
	else if (18 == i)
	    ((Class515) this).anInt6732
		= class241_sub3.readBigSmart((byte) -67) * 141980625;
	else if (i == 19)
	    anInt6770 = class241_sub3.readUnsignedShort(1162222719) * -1100964759;
	else if (i == 20) {
	    ((Class515) this).anInt6755
		= class241_sub3.readUnsignedShort(1162222719) * -138458289;
	    if (65535 == ((Class515) this).anInt6755 * -976819281)
		((Class515) this).anInt6755 = 138458289;
	    ((Class515) this).anInt6735
		= class241_sub3.readUnsignedShort(1162222719) * 1926060813;
	    if (((Class515) this).anInt6735 * -1846219835 == 65535)
		((Class515) this).anInt6735 = -1926060813;
	    ((Class515) this).anInt6752
		= class241_sub3.readInt((byte) 81) * -401703861;
	    ((Class515) this).anInt6730
		= class241_sub3.readInt((byte) 123) * 109401063;
	} else if (i == 21)
	    anInt6767 = class241_sub3.readInt((byte) 42) * -1915918099;
	else if (i == 22)
	    anInt6741 = class241_sub3.readInt((byte) 107) * -163819409;
	else if (23 == i) {
	    anInt6762 = class241_sub3.readUnsignedByte((byte) 0) * 857603241;
	    anInt6763 = class241_sub3.readUnsignedByte((byte) -23) * 59659289;
	    anInt6764 = class241_sub3.readUnsignedByte((byte) 13) * -1055747971;
	} else if (24 == i) {
	    anInt6765 = class241_sub3.readShort((byte) 109) * -2002667899;
	    anInt6766 = class241_sub3.readShort((byte) 62) * -257030685;
	} else if (i == 25)
	    anInt6748 = class241_sub3.readBigSmart((byte) 13) * -1603650425;
	else if (249 == i) {
	    int i_11_ = class241_sub3.readUnsignedByte((byte) -33);
	    if (((Class515) this).aClass407_6771 == null) {
		int i_12_ = Class480.method11001(i_11_, (byte) -96);
		((Class515) this).aClass407_6771 = new HashTable(i_12_);
	    }
	    for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
		boolean bool = class241_sub3.readUnsignedByte((byte) 88) == 1;
		int i_14_ = class241_sub3.readTriByte(1771646547);
		Node class241;
		if (bool)
		    class241
			= new ObjectNode(class241_sub3
						 .readString(-769344991));
		else
		    class241 = new IntegerNode(class241_sub3
						      .readInt((byte) 73));
		((Class515) this).aClass407_6771.put(class241,
							    (long) i_14_);
	    }
	}
    }
    
    public Class168 method11583(Class103 class103, int i) {
	int i_15_
	    = anInt6748 * -337524425 | class103.anInt1456 * 1931687493 << 29;
	Class168 class168
	    = (Class168) ((Class524) ((Class515) this).aClass524_6734)
			     .aClass129_6821.get((long) i_15_);
	if (class168 != null)
	    return class168;
	if (!((Class524) ((Class515) this).aClass524_6734).aClass210_6816
		 .method4250(-337524425 * anInt6748, 831283896))
	    return null;
	Class108 class108 = Class160.method3437((((Class524) (((Class515) this)
							      .aClass524_6734))
						 .aClass210_6816),
						-337524425 * anInt6748, 0);
	if (null != class108) {
	    class168 = class103.method2289(class108, true);
	    ((Class524) ((Class515) this).aClass524_6734).aClass129_6821
		.put(class168, (long) i_15_);
	}
	return class168;
    }
    
    public Class168 method11584(Class103 class103, int i) {
	Class168 class168
	    = ((Class168)
	       (((Class524) ((Class515) this).aClass524_6734)
		    .aClass129_6821.get
		((long) (670352689 * ((Class515) this).anInt6732 | 0x20000
			 | class103.anInt1456 * 1931687493 << 29))));
	if (class168 != null)
	    return class168;
	((Class524) ((Class515) this).aClass524_6734).aClass210_6816
	    .method4250(((Class515) this).anInt6732 * 670352689, 1357496271);
	Class108 class108
	    = Class160.method3437((((Class524)
				    ((Class515) this).aClass524_6734)
				   .aClass210_6816),
				  ((Class515) this).anInt6732 * 670352689, 0);
	if (null != class108) {
	    class168 = class103.method2289(class108, true);
	    ((Class524) ((Class515) this).aClass524_6734).aClass129_6821
		.put
		(class168,
		 (long) (((Class515) this).anInt6732 * 670352689 | 0x20000
			 | 1931687493 * class103.anInt1456 << 29));
	}
	return class168;
    }
    
    public int method11585(int i, int i_16_, int i_17_) {
	if (((Class515) this).aClass407_6771 == null)
	    return i_16_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       ((Class515) this).aClass407_6771.get((long) i));
	if (null == class241_sub22)
	    return i_16_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public String method11586(int i, String string, int i_18_) {
	if (null == ((Class515) this).aClass407_6771)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       ((Class515) this).aClass407_6771.get((long) i));
	if (null == class241_sub26)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    public boolean method11587(Interface13 interface13,
			       Interface11 interface11, int i) {
	int i_19_;
	if (-366769549 * ((Class515) this).anInt6751 != -1) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       (-366769549
					* ((Class515) this).anInt6751),
				       (byte) 45);
	    i_19_ = interface11.getVarValueInt(class179, -1044417820);
	} else if (-1 != ((Class515) this).anInt6754 * 266944263) {
	    VarBitType class316
		= interface13.method93(266944263 * ((Class515) this).anInt6754,
				       2106614688);
	    i_19_ = interface11.getVarBitValue(class316, (short) 9251);
	} else
	    return true;
	if (i_19_ < -2136699391 * ((Class515) this).anInt6753
	    || i_19_ > ((Class515) this).anInt6749 * -122674731)
	    return false;
	boolean bool = false;
	int i_20_;
	if (-1 != ((Class515) this).anInt6735 * -1846219835) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       (((Class515) this).anInt6735
					* -1846219835),
				       (byte) 91);
	    i_20_ = interface11.getVarValueInt(class179, -213240911);
	} else if (-1 != -976819281 * ((Class515) this).anInt6755) {
	    VarBitType class316
		= interface13.method93((-976819281
					* ((Class515) this).anInt6755),
				       1599207346);
	    i_20_ = interface11.getVarBitValue(class316, (short) 6813);
	} else
	    return true;
	if (i_20_ < ((Class515) this).anInt6752 * 103705955
	    || i_20_ > ((Class515) this).anInt6730 * -1786507305)
	    return false;
	return true;
    }
    
    void method11588(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -40);
	    if (0 == i)
		break;
	    method11600(class241_sub3, i, -1351469065);
	}
    }
    
    void method11589(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 40);
	    if (0 == i)
		break;
	    method11600(class241_sub3, i, 1757838095);
	}
    }
    
    void method11590(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    anInt6772 = class241_sub3.readBigSmart((byte) 47) * -1739933211;
	else if (i == 2)
	    anInt6733 = class241_sub3.readBigSmart((byte) -53) * -1223793529;
	else if (i == 3)
	    aString6756 = class241_sub3.readString(30933774);
	else if (4 == i)
	    anInt6750 = class241_sub3.readTriByte(1771646547) * 300629935;
	else if (5 == i)
	    anInt6736 = class241_sub3.readTriByte(1771646547) * 1616514229;
	else if (i == 6)
	    anInt6760 = class241_sub3.readUnsignedByte((byte) -106) * 1417314457;
	else if (7 == i) {
	    int i_21_ = class241_sub3.readUnsignedByte((byte) 27);
	    if (0 == (i_21_ & 0x1))
		aBool6743 = false;
	    if ((i_21_ & 0x2) == 2)
		aBool6744 = true;
	} else if (8 == i)
	    class241_sub3.readUnsignedByte((byte) 2);
	else if (9 == i) {
	    ((Class515) this).anInt6754
		= class241_sub3.readUnsignedShort(1162222719) * -2068971849;
	    if (266944263 * ((Class515) this).anInt6754 == 65535)
		((Class515) this).anInt6754 = 2068971849;
	    ((Class515) this).anInt6751
		= class241_sub3.readUnsignedShort(1162222719) * 1805724347;
	    if (-366769549 * ((Class515) this).anInt6751 == 65535)
		((Class515) this).anInt6751 = -1805724347;
	    ((Class515) this).anInt6753
		= class241_sub3.readInt((byte) 109) * 102724097;
	    ((Class515) this).anInt6749
		= class241_sub3.readInt((byte) 80) * 2113146749;
	} else if (i >= 10 && i <= 14)
	    aStringArray6745[i - 10] = class241_sub3.readString(-693765010);
	else if (15 == i) {
	    int i_22_ = class241_sub3.readUnsignedByte((byte) -55);
	    anIntArray6737 = new int[2 * i_22_];
	    for (int i_23_ = 0; i_23_ < i_22_ * 2; i_23_++)
		anIntArray6737[i_23_] = class241_sub3.readShort((byte) 75);
	    anInt6761 = class241_sub3.readInt((byte) 74) * 1020951857;
	    int i_24_ = class241_sub3.readUnsignedByte((byte) -74);
	    anIntArray6758 = new int[i_24_];
	    for (int i_25_ = 0; i_25_ < anIntArray6758.length; i_25_++)
		anIntArray6758[i_25_] = class241_sub3.readInt((byte) 58);
	    aByteArray6768 = new byte[i_22_];
	    for (int i_26_ = 0; i_26_ < i_22_; i_26_++)
		aByteArray6768[i_26_] = class241_sub3.getByte(823519169);
	} else if (16 == i)
	    aBool6769 = false;
	else if (i == 17)
	    aString6746 = class241_sub3.readString(-321211526);
	else if (18 == i)
	    ((Class515) this).anInt6732
		= class241_sub3.readBigSmart((byte) 61) * 141980625;
	else if (i == 19)
	    anInt6770 = class241_sub3.readUnsignedShort(1162222719) * -1100964759;
	else if (i == 20) {
	    ((Class515) this).anInt6755
		= class241_sub3.readUnsignedShort(1162222719) * -138458289;
	    if (65535 == ((Class515) this).anInt6755 * -976819281)
		((Class515) this).anInt6755 = 138458289;
	    ((Class515) this).anInt6735
		= class241_sub3.readUnsignedShort(1162222719) * 1926060813;
	    if (((Class515) this).anInt6735 * -1846219835 == 65535)
		((Class515) this).anInt6735 = -1926060813;
	    ((Class515) this).anInt6752
		= class241_sub3.readInt((byte) 50) * -401703861;
	    ((Class515) this).anInt6730
		= class241_sub3.readInt((byte) 80) * 109401063;
	} else if (i == 21)
	    anInt6767 = class241_sub3.readInt((byte) 98) * -1915918099;
	else if (i == 22)
	    anInt6741 = class241_sub3.readInt((byte) 17) * -163819409;
	else if (23 == i) {
	    anInt6762 = class241_sub3.readUnsignedByte((byte) 11) * 857603241;
	    anInt6763 = class241_sub3.readUnsignedByte((byte) 2) * 59659289;
	    anInt6764 = class241_sub3.readUnsignedByte((byte) 17) * -1055747971;
	} else if (24 == i) {
	    anInt6765 = class241_sub3.readShort((byte) 105) * -2002667899;
	    anInt6766 = class241_sub3.readShort((byte) 83) * -257030685;
	} else if (i == 25)
	    anInt6748 = class241_sub3.readBigSmart((byte) -11) * -1603650425;
	else if (249 == i) {
	    int i_27_ = class241_sub3.readUnsignedByte((byte) 69);
	    if (((Class515) this).aClass407_6771 == null) {
		int i_28_ = Class480.method11001(i_27_, (byte) -21);
		((Class515) this).aClass407_6771 = new HashTable(i_28_);
	    }
	    for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
		boolean bool = class241_sub3.readUnsignedByte((byte) 75) == 1;
		int i_30_ = class241_sub3.readTriByte(1771646547);
		Node class241;
		if (bool)
		    class241
			= new ObjectNode(class241_sub3
						 .readString(-1663392080));
		else
		    class241 = new IntegerNode(class241_sub3
						      .readInt((byte) 3));
		((Class515) this).aClass407_6771.put(class241,
							    (long) i_30_);
	    }
	}
    }
    
    public Class168 method11591(Class103 class103) {
	int i = anInt6748 * -337524425 | class103.anInt1456 * 1931687493 << 29;
	Class168 class168
	    = (Class168) ((Class524) ((Class515) this).aClass524_6734)
			     .aClass129_6821.get((long) i);
	if (class168 != null)
	    return class168;
	if (!((Class524) ((Class515) this).aClass524_6734).aClass210_6816
		 .method4250(-337524425 * anInt6748, 657324103))
	    return null;
	Class108 class108 = Class160.method3437((((Class524) (((Class515) this)
							      .aClass524_6734))
						 .aClass210_6816),
						-337524425 * anInt6748, 0);
	if (null != class108) {
	    class168 = class103.method2289(class108, true);
	    ((Class524) ((Class515) this).aClass524_6734).aClass129_6821
		.put(class168, (long) i);
	}
	return class168;
    }
    
    void method11592(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    anInt6772 = class241_sub3.readBigSmart((byte) -70) * -1739933211;
	else if (i == 2)
	    anInt6733 = class241_sub3.readBigSmart((byte) -24) * -1223793529;
	else if (i == 3)
	    aString6756 = class241_sub3.readString(1869415678);
	else if (4 == i)
	    anInt6750 = class241_sub3.readTriByte(1771646547) * 300629935;
	else if (5 == i)
	    anInt6736 = class241_sub3.readTriByte(1771646547) * 1616514229;
	else if (i == 6)
	    anInt6760 = class241_sub3.readUnsignedByte((byte) -75) * 1417314457;
	else if (7 == i) {
	    int i_31_ = class241_sub3.readUnsignedByte((byte) -14);
	    if (0 == (i_31_ & 0x1))
		aBool6743 = false;
	    if ((i_31_ & 0x2) == 2)
		aBool6744 = true;
	} else if (8 == i)
	    class241_sub3.readUnsignedByte((byte) -31);
	else if (9 == i) {
	    ((Class515) this).anInt6754
		= class241_sub3.readUnsignedShort(1162222719) * -2068971849;
	    if (266944263 * ((Class515) this).anInt6754 == 65535)
		((Class515) this).anInt6754 = 2068971849;
	    ((Class515) this).anInt6751
		= class241_sub3.readUnsignedShort(1162222719) * 1805724347;
	    if (-366769549 * ((Class515) this).anInt6751 == 65535)
		((Class515) this).anInt6751 = -1805724347;
	    ((Class515) this).anInt6753
		= class241_sub3.readInt((byte) 109) * 102724097;
	    ((Class515) this).anInt6749
		= class241_sub3.readInt((byte) 99) * 2113146749;
	} else if (i >= 10 && i <= 14)
	    aStringArray6745[i - 10] = class241_sub3.readString(606000909);
	else if (15 == i) {
	    int i_32_ = class241_sub3.readUnsignedByte((byte) -2);
	    anIntArray6737 = new int[2 * i_32_];
	    for (int i_33_ = 0; i_33_ < i_32_ * 2; i_33_++)
		anIntArray6737[i_33_] = class241_sub3.readShort((byte) 106);
	    anInt6761 = class241_sub3.readInt((byte) 126) * 1020951857;
	    int i_34_ = class241_sub3.readUnsignedByte((byte) -1);
	    anIntArray6758 = new int[i_34_];
	    for (int i_35_ = 0; i_35_ < anIntArray6758.length; i_35_++)
		anIntArray6758[i_35_] = class241_sub3.readInt((byte) 11);
	    aByteArray6768 = new byte[i_32_];
	    for (int i_36_ = 0; i_36_ < i_32_; i_36_++)
		aByteArray6768[i_36_] = class241_sub3.getByte(-679147831);
	} else if (16 == i)
	    aBool6769 = false;
	else if (i == 17)
	    aString6746 = class241_sub3.readString(-2020535572);
	else if (18 == i)
	    ((Class515) this).anInt6732
		= class241_sub3.readBigSmart((byte) -70) * 141980625;
	else if (i == 19)
	    anInt6770 = class241_sub3.readUnsignedShort(1162222719) * -1100964759;
	else if (i == 20) {
	    ((Class515) this).anInt6755
		= class241_sub3.readUnsignedShort(1162222719) * -138458289;
	    if (65535 == ((Class515) this).anInt6755 * -976819281)
		((Class515) this).anInt6755 = 138458289;
	    ((Class515) this).anInt6735
		= class241_sub3.readUnsignedShort(1162222719) * 1926060813;
	    if (((Class515) this).anInt6735 * -1846219835 == 65535)
		((Class515) this).anInt6735 = -1926060813;
	    ((Class515) this).anInt6752
		= class241_sub3.readInt((byte) 115) * -401703861;
	    ((Class515) this).anInt6730
		= class241_sub3.readInt((byte) 103) * 109401063;
	} else if (i == 21)
	    anInt6767 = class241_sub3.readInt((byte) 98) * -1915918099;
	else if (i == 22)
	    anInt6741 = class241_sub3.readInt((byte) 33) * -163819409;
	else if (23 == i) {
	    anInt6762 = class241_sub3.readUnsignedByte((byte) 29) * 857603241;
	    anInt6763 = class241_sub3.readUnsignedByte((byte) -56) * 59659289;
	    anInt6764 = class241_sub3.readUnsignedByte((byte) 100) * -1055747971;
	} else if (24 == i) {
	    anInt6765 = class241_sub3.readShort((byte) 95) * -2002667899;
	    anInt6766 = class241_sub3.readShort((byte) 54) * -257030685;
	} else if (i == 25)
	    anInt6748 = class241_sub3.readBigSmart((byte) 95) * -1603650425;
	else if (249 == i) {
	    int i_37_ = class241_sub3.readUnsignedByte((byte) -55);
	    if (((Class515) this).aClass407_6771 == null) {
		int i_38_ = Class480.method11001(i_37_, (byte) -101);
		((Class515) this).aClass407_6771 = new HashTable(i_38_);
	    }
	    for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
		boolean bool = class241_sub3.readUnsignedByte((byte) -43) == 1;
		int i_40_ = class241_sub3.readTriByte(1771646547);
		Node class241;
		if (bool)
		    class241
			= new ObjectNode(class241_sub3
						 .readString(-1938981848));
		else
		    class241
			= new IntegerNode(class241_sub3
						 .readInt((byte) 121));
		((Class515) this).aClass407_6771.put(class241,
							    (long) i_40_);
	    }
	}
    }
    
    void method11593(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    anInt6772 = class241_sub3.readBigSmart((byte) -3) * -1739933211;
	else if (i == 2)
	    anInt6733 = class241_sub3.readBigSmart((byte) 8) * -1223793529;
	else if (i == 3)
	    aString6756 = class241_sub3.readString(-1596743567);
	else if (4 == i)
	    anInt6750 = class241_sub3.readTriByte(1771646547) * 300629935;
	else if (5 == i)
	    anInt6736 = class241_sub3.readTriByte(1771646547) * 1616514229;
	else if (i == 6)
	    anInt6760 = class241_sub3.readUnsignedByte((byte) 4) * 1417314457;
	else if (7 == i) {
	    int i_41_ = class241_sub3.readUnsignedByte((byte) -21);
	    if (0 == (i_41_ & 0x1))
		aBool6743 = false;
	    if ((i_41_ & 0x2) == 2)
		aBool6744 = true;
	} else if (8 == i)
	    class241_sub3.readUnsignedByte((byte) 111);
	else if (9 == i) {
	    ((Class515) this).anInt6754
		= class241_sub3.readUnsignedShort(1162222719) * -2068971849;
	    if (266944263 * ((Class515) this).anInt6754 == 65535)
		((Class515) this).anInt6754 = 2068971849;
	    ((Class515) this).anInt6751
		= class241_sub3.readUnsignedShort(1162222719) * 1805724347;
	    if (-366769549 * ((Class515) this).anInt6751 == 65535)
		((Class515) this).anInt6751 = -1805724347;
	    ((Class515) this).anInt6753
		= class241_sub3.readInt((byte) 67) * 102724097;
	    ((Class515) this).anInt6749
		= class241_sub3.readInt((byte) 66) * 2113146749;
	} else if (i >= 10 && i <= 14)
	    aStringArray6745[i - 10] = class241_sub3.readString(-193579048);
	else if (15 == i) {
	    int i_42_ = class241_sub3.readUnsignedByte((byte) -79);
	    anIntArray6737 = new int[2 * i_42_];
	    for (int i_43_ = 0; i_43_ < i_42_ * 2; i_43_++)
		anIntArray6737[i_43_] = class241_sub3.readShort((byte) 82);
	    anInt6761 = class241_sub3.readInt((byte) 84) * 1020951857;
	    int i_44_ = class241_sub3.readUnsignedByte((byte) -62);
	    anIntArray6758 = new int[i_44_];
	    for (int i_45_ = 0; i_45_ < anIntArray6758.length; i_45_++)
		anIntArray6758[i_45_] = class241_sub3.readInt((byte) 23);
	    aByteArray6768 = new byte[i_42_];
	    for (int i_46_ = 0; i_46_ < i_42_; i_46_++)
		aByteArray6768[i_46_] = class241_sub3.getByte(-733813253);
	} else if (16 == i)
	    aBool6769 = false;
	else if (i == 17)
	    aString6746 = class241_sub3.readString(-761650111);
	else if (18 == i)
	    ((Class515) this).anInt6732
		= class241_sub3.readBigSmart((byte) -87) * 141980625;
	else if (i == 19)
	    anInt6770 = class241_sub3.readUnsignedShort(1162222719) * -1100964759;
	else if (i == 20) {
	    ((Class515) this).anInt6755
		= class241_sub3.readUnsignedShort(1162222719) * -138458289;
	    if (65535 == ((Class515) this).anInt6755 * -976819281)
		((Class515) this).anInt6755 = 138458289;
	    ((Class515) this).anInt6735
		= class241_sub3.readUnsignedShort(1162222719) * 1926060813;
	    if (((Class515) this).anInt6735 * -1846219835 == 65535)
		((Class515) this).anInt6735 = -1926060813;
	    ((Class515) this).anInt6752
		= class241_sub3.readInt((byte) 39) * -401703861;
	    ((Class515) this).anInt6730
		= class241_sub3.readInt((byte) 54) * 109401063;
	} else if (i == 21)
	    anInt6767 = class241_sub3.readInt((byte) 47) * -1915918099;
	else if (i == 22)
	    anInt6741 = class241_sub3.readInt((byte) 28) * -163819409;
	else if (23 == i) {
	    anInt6762 = class241_sub3.readUnsignedByte((byte) -1) * 857603241;
	    anInt6763 = class241_sub3.readUnsignedByte((byte) -40) * 59659289;
	    anInt6764 = class241_sub3.readUnsignedByte((byte) -33) * -1055747971;
	} else if (24 == i) {
	    anInt6765 = class241_sub3.readShort((byte) 87) * -2002667899;
	    anInt6766 = class241_sub3.readShort((byte) 47) * -257030685;
	} else if (i == 25)
	    anInt6748 = class241_sub3.readBigSmart((byte) -13) * -1603650425;
	else if (249 == i) {
	    int i_47_ = class241_sub3.readUnsignedByte((byte) -20);
	    if (((Class515) this).aClass407_6771 == null) {
		int i_48_ = Class480.method11001(i_47_, (byte) -17);
		((Class515) this).aClass407_6771 = new HashTable(i_48_);
	    }
	    for (int i_49_ = 0; i_49_ < i_47_; i_49_++) {
		boolean bool = class241_sub3.readUnsignedByte((byte) -39) == 1;
		int i_50_ = class241_sub3.readTriByte(1771646547);
		Node class241;
		if (bool)
		    class241 = new ObjectNode(class241_sub3
						      .readString(928498993));
		else
		    class241 = new IntegerNode(class241_sub3
						      .readInt((byte) 29));
		((Class515) this).aClass407_6771.put(class241,
							    (long) i_50_);
	    }
	}
    }
    
    void method11594() {
	if (null != anIntArray6737) {
	    for (int i = 0; i < anIntArray6737.length; i += 2) {
		if (anIntArray6737[i] < anInt6757 * -1967356869)
		    anInt6757 = -34622221 * anIntArray6737[i];
		else if (anIntArray6737[i] > anInt6759 * 1389678465)
		    anInt6759 = anIntArray6737[i] * -176459647;
		if (anIntArray6737[1 + i] < anInt6742 * -1576680733)
		    anInt6742 = anIntArray6737[1 + i] * 1877185227;
		else if (anIntArray6737[i + 1] > anInt6747 * -1423735679)
		    anInt6747 = -380585087 * anIntArray6737[1 + i];
	    }
	}
    }
    
    void method11595() {
	if (null != anIntArray6737) {
	    for (int i = 0; i < anIntArray6737.length; i += 2) {
		if (anIntArray6737[i] < anInt6757 * -1967356869)
		    anInt6757 = -34622221 * anIntArray6737[i];
		else if (anIntArray6737[i] > anInt6759 * 1389678465)
		    anInt6759 = anIntArray6737[i] * -176459647;
		if (anIntArray6737[1 + i] < anInt6742 * -1576680733)
		    anInt6742 = anIntArray6737[1 + i] * 1877185227;
		else if (anIntArray6737[i + 1] > anInt6747 * -1423735679)
		    anInt6747 = -380585087 * anIntArray6737[1 + i];
	    }
	}
    }
    
    public boolean method11596(Interface13 interface13,
			       Interface11 interface11) {
	int i;
	if (-366769549 * ((Class515) this).anInt6751 != -1) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       (-366769549
					* ((Class515) this).anInt6751),
				       (byte) 92);
	    i = interface11.getVarValueInt(class179, -1271069494);
	} else if (-1 != ((Class515) this).anInt6754 * 266944263) {
	    VarBitType class316
		= interface13.method93(266944263 * ((Class515) this).anInt6754,
				       1603851315);
	    i = interface11.getVarBitValue(class316, (short) 1275);
	} else
	    return true;
	if (i < -2136699391 * ((Class515) this).anInt6753
	    || i > ((Class515) this).anInt6749 * -122674731)
	    return false;
	boolean bool = false;
	int i_51_;
	if (-1 != ((Class515) this).anInt6735 * -1846219835) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       (((Class515) this).anInt6735
					* -1846219835),
				       (byte) 126);
	    i_51_ = interface11.getVarValueInt(class179, -2106251669);
	} else if (-1 != -976819281 * ((Class515) this).anInt6755) {
	    VarBitType class316
		= interface13.method93((-976819281
					* ((Class515) this).anInt6755),
				       1149422612);
	    i_51_ = interface11.getVarBitValue(class316, (short) 30131);
	} else
	    return true;
	if (i_51_ < ((Class515) this).anInt6752 * 103705955
	    || i_51_ > ((Class515) this).anInt6730 * -1786507305)
	    return false;
	return true;
    }
    
    public Class168 method11597(Class103 class103, boolean bool) {
	int i = bool ? 926228791 * anInt6733 : -705700883 * anInt6772;
	int i_52_ = i | 1931687493 * class103.anInt1456 << 29;
	Class168 class168
	    = (Class168) ((Class524) ((Class515) this).aClass524_6734)
			     .aClass129_6821.get((long) i_52_);
	if (null != class168)
	    return class168;
	if (!((Class524) ((Class515) this).aClass524_6734).aClass210_6816
		 .method4250(i, 631254472))
	    return null;
	Class108 class108 = Class160.method3437((((Class524) (((Class515) this)
							      .aClass524_6734))
						 .aClass210_6816),
						i, 0);
	if (null != class108) {
	    class168 = class103.method2289(class108, true);
	    ((Class524) ((Class515) this).aClass524_6734).aClass129_6821
		.put(class168, (long) i_52_);
	}
	return class168;
    }
    
    public Class168 method11598(Class103 class103, boolean bool) {
	int i = bool ? 926228791 * anInt6733 : -705700883 * anInt6772;
	int i_53_ = i | 1931687493 * class103.anInt1456 << 29;
	Class168 class168
	    = (Class168) ((Class524) ((Class515) this).aClass524_6734)
			     .aClass129_6821.get((long) i_53_);
	if (null != class168)
	    return class168;
	if (!((Class524) ((Class515) this).aClass524_6734).aClass210_6816
		 .method4250(i, 1140109314))
	    return null;
	Class108 class108 = Class160.method3437((((Class524) (((Class515) this)
							      .aClass524_6734))
						 .aClass210_6816),
						i, 0);
	if (null != class108) {
	    class168 = class103.method2289(class108, true);
	    ((Class524) ((Class515) this).aClass524_6734).aClass129_6821
		.put(class168, (long) i_53_);
	}
	return class168;
    }
    
    public Class168 method11599(Class103 class103, boolean bool) {
	int i = bool ? 926228791 * anInt6733 : -705700883 * anInt6772;
	int i_54_ = i | 1931687493 * class103.anInt1456 << 29;
	Class168 class168
	    = (Class168) ((Class524) ((Class515) this).aClass524_6734)
			     .aClass129_6821.get((long) i_54_);
	if (null != class168)
	    return class168;
	if (!((Class524) ((Class515) this).aClass524_6734).aClass210_6816
		 .method4250(i, -472100603))
	    return null;
	Class108 class108 = Class160.method3437((((Class524) (((Class515) this)
							      .aClass524_6734))
						 .aClass210_6816),
						i, 0);
	if (null != class108) {
	    class168 = class103.method2289(class108, true);
	    ((Class524) ((Class515) this).aClass524_6734).aClass129_6821
		.put(class168, (long) i_54_);
	}
	return class168;
    }
    
    Class515() {
	anInt6733 = 1223793529;
	anInt6736 = -1616514229;
	anInt6760 = 0;
	aBool6743 = true;
	aBool6744 = false;
	aStringArray6745 = new String[5];
	((Class515) this).anInt6732 = -141980625;
	((Class515) this).anInt6754 = 2068971849;
	((Class515) this).anInt6751 = -1805724347;
	((Class515) this).anInt6755 = 138458289;
	((Class515) this).anInt6735 = -1926060813;
	anInt6757 = -2112861427;
	anInt6742 = 270298421;
	anInt6759 = -2147483648;
	anInt6747 = -2147483648;
	anInt6762 = -857603241;
	anInt6763 = -59659289;
	anInt6764 = 1055747971;
	aBool6769 = true;
	anInt6770 = 1100964759;
	anInt6748 = 1603650425;
    }
    
    void method11600(RSByteBuffer class241_sub3, int i, int i_55_) {
	if (i == 1)
	    anInt6772 = class241_sub3.readBigSmart((byte) -46) * -1739933211;
	else if (i == 2)
	    anInt6733 = class241_sub3.readBigSmart((byte) 82) * -1223793529;
	else if (i == 3)
	    aString6756 = class241_sub3.readString(-889781978);
	else if (4 == i)
	    anInt6750 = class241_sub3.readTriByte(1771646547) * 300629935;
	else if (5 == i)
	    anInt6736 = class241_sub3.readTriByte(1771646547) * 1616514229;
	else if (i == 6)
	    anInt6760 = class241_sub3.readUnsignedByte((byte) -44) * 1417314457;
	else if (7 == i) {
	    int i_56_ = class241_sub3.readUnsignedByte((byte) -59);
	    if (0 == (i_56_ & 0x1))
		aBool6743 = false;
	    if ((i_56_ & 0x2) == 2)
		aBool6744 = true;
	} else if (8 == i)
	    class241_sub3.readUnsignedByte((byte) -66);
	else if (9 == i) {
	    ((Class515) this).anInt6754
		= class241_sub3.readUnsignedShort(1162222719) * -2068971849;
	    if (266944263 * ((Class515) this).anInt6754 == 65535)
		((Class515) this).anInt6754 = 2068971849;
	    ((Class515) this).anInt6751
		= class241_sub3.readUnsignedShort(1162222719) * 1805724347;
	    if (-366769549 * ((Class515) this).anInt6751 == 65535)
		((Class515) this).anInt6751 = -1805724347;
	    ((Class515) this).anInt6753
		= class241_sub3.readInt((byte) 88) * 102724097;
	    ((Class515) this).anInt6749
		= class241_sub3.readInt((byte) 17) * 2113146749;
	} else if (i >= 10 && i <= 14)
	    aStringArray6745[i - 10] = class241_sub3.readString(-1622114077);
	else if (15 == i) {
	    int i_57_ = class241_sub3.readUnsignedByte((byte) 25);
	    anIntArray6737 = new int[2 * i_57_];
	    for (int i_58_ = 0; i_58_ < i_57_ * 2; i_58_++)
		anIntArray6737[i_58_] = class241_sub3.readShort((byte) 77);
	    anInt6761 = class241_sub3.readInt((byte) 81) * 1020951857;
	    int i_59_ = class241_sub3.readUnsignedByte((byte) 58);
	    anIntArray6758 = new int[i_59_];
	    for (int i_60_ = 0; i_60_ < anIntArray6758.length; i_60_++)
		anIntArray6758[i_60_] = class241_sub3.readInt((byte) 89);
	    aByteArray6768 = new byte[i_57_];
	    for (int i_61_ = 0; i_61_ < i_57_; i_61_++)
		aByteArray6768[i_61_] = class241_sub3.getByte(1583792346);
	} else if (16 == i)
	    aBool6769 = false;
	else if (i == 17)
	    aString6746 = class241_sub3.readString(1307025439);
	else if (18 == i)
	    ((Class515) this).anInt6732
		= class241_sub3.readBigSmart((byte) -20) * 141980625;
	else if (i == 19)
	    anInt6770 = class241_sub3.readUnsignedShort(1162222719) * -1100964759;
	else if (i == 20) {
	    ((Class515) this).anInt6755
		= class241_sub3.readUnsignedShort(1162222719) * -138458289;
	    if (65535 == ((Class515) this).anInt6755 * -976819281)
		((Class515) this).anInt6755 = 138458289;
	    ((Class515) this).anInt6735
		= class241_sub3.readUnsignedShort(1162222719) * 1926060813;
	    if (((Class515) this).anInt6735 * -1846219835 == 65535)
		((Class515) this).anInt6735 = -1926060813;
	    ((Class515) this).anInt6752
		= class241_sub3.readInt((byte) 119) * -401703861;
	    ((Class515) this).anInt6730
		= class241_sub3.readInt((byte) 61) * 109401063;
	} else if (i == 21)
	    anInt6767 = class241_sub3.readInt((byte) 54) * -1915918099;
	else if (i == 22)
	    anInt6741 = class241_sub3.readInt((byte) 11) * -163819409;
	else if (23 == i) {
	    anInt6762 = class241_sub3.readUnsignedByte((byte) -1) * 857603241;
	    anInt6763 = class241_sub3.readUnsignedByte((byte) -66) * 59659289;
	    anInt6764 = class241_sub3.readUnsignedByte((byte) 4) * -1055747971;
	} else if (24 == i) {
	    anInt6765 = class241_sub3.readShort((byte) 74) * -2002667899;
	    anInt6766 = class241_sub3.readShort((byte) 105) * -257030685;
	} else if (i == 25)
	    anInt6748 = class241_sub3.readBigSmart((byte) 59) * -1603650425;
	else if (249 == i) {
	    int i_62_ = class241_sub3.readUnsignedByte((byte) 59);
	    if (((Class515) this).aClass407_6771 == null) {
		int i_63_ = Class480.method11001(i_62_, (byte) -20);
		((Class515) this).aClass407_6771 = new HashTable(i_63_);
	    }
	    for (int i_64_ = 0; i_64_ < i_62_; i_64_++) {
		boolean bool = class241_sub3.readUnsignedByte((byte) -111) == 1;
		int i_65_ = class241_sub3.readTriByte(1771646547);
		Node class241;
		if (bool)
		    class241
			= new ObjectNode(class241_sub3
						 .readString(1073730108));
		else
		    class241
			= new IntegerNode(class241_sub3
						 .readInt((byte) 103));
		((Class515) this).aClass407_6771.put(class241,
							    (long) i_65_);
	    }
	}
    }
    
    public int method11601(int i, int i_66_) {
	if (((Class515) this).aClass407_6771 == null)
	    return i_66_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       ((Class515) this).aClass407_6771.get((long) i));
	if (null == class241_sub22)
	    return i_66_;
	return class241_sub22.intValue * -1859754807;
    }
    
    static final void method11602(ClientScriptData class454, byte i) {
	Class241_Sub38.method16439(class454,
				   (((ClientScriptData) class454)
				    .varEntity),
				   -1828724883);
    }
    
    public static final void method11603(int i) {
		if (-633801665 * client.anInt8418 != -1
		    && -265222603 * client.anInt8480 != -1) {
		    int i_67_ = (((client.anInt8401 * 1367758091
				   * (client.anInt8579 * 1242781841
				      - -178358177 * client.anInt8402))
				  >> 16)
				 + -178358177 * client.anInt8402);
		    client.anInt8401 += i_67_ * -1598304605;
		    if (client.anInt8401 * 1367758091 >= 65535) {
			client.anInt8401 = 770126173;
			if (!client.aBool8381)
			    client.aBool8404 = true;
			else
			    client.aBool8404 = false;
			client.aBool8381 = true;
		    } else {
			client.aBool8404 = false;
			client.aBool8381 = false;
		    }
		    float f = (float) (client.anInt8401 * 1367758091) / 65535.0F;
		    float[] fs = new float[3];
		    int i_68_ = 507873498 * client.anInt8399;
		    for (int i_69_ = 0; i_69_ < 3; i_69_++) {
			int i_70_ = ((client.anIntArrayArrayArray8405
				      [client.anInt8418 * -633801665][i_68_][i_69_])
				     * 3);
			int i_71_
			    = 3 * (client.anIntArrayArrayArray8405
				   [client.anInt8418 * -633801665][1 + i_68_][i_69_]);
			int i_72_
			    = (((client.anIntArrayArrayArray8405
				 [-633801665 * client.anInt8418][2 + i_68_][i_69_])
				- ((client.anIntArrayArrayArray8405
				    [-633801665 * client.anInt8418][3 + i_68_][i_69_])
				   - (client.anIntArrayArrayArray8405
				      [client.anInt8418 * -633801665][i_68_ + 2]
				      [i_69_])))
			       * 3);
			int i_73_ = (client.anIntArrayArrayArray8405
				     [client.anInt8418 * -633801665][i_68_][i_69_]);
			int i_74_ = i_71_ - i_70_;
			int i_75_ = i_72_ + (i_70_ - i_71_ * 2);
			int i_76_ = i_71_ + ((client.anIntArrayArrayArray8405
					      [-633801665 * client.anInt8418]
					      [i_68_ + 2][i_69_])
					     - i_73_) - i_72_;
			fs[i_69_]
			    = (float) i_73_ + ((f * (float) i_76_ + (float) i_75_) * f
					       + (float) i_74_) * f;
		    }
		    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
		    Class462.anInt6284
			= 1680747237 * ((int) fs[0] - class522.baseX * 947401216);
		    Class175.anInt2123 = (int) fs[1] * 1365297795;
		    Class636.anInt8248
			= (((int) fs[2] - class522.baseY * -616117760)
			   * -1181860511);
		    float[] fs_77_ = new float[3];
		    int i_78_ = 316910850 * client.anInt8400;
		    for (int i_79_ = 0; i_79_ < 3; i_79_++) {
			int i_80_ = ((client.anIntArrayArrayArray8405
				      [client.anInt8480 * -265222603][i_78_][i_79_])
				     * 3);
			int i_81_
			    = 3 * (client.anIntArrayArrayArray8405
				   [client.anInt8480 * -265222603][i_78_ + 1][i_79_]);
			int i_82_
			    = (((client.anIntArrayArrayArray8405
				 [-265222603 * client.anInt8480][i_78_ + 2][i_79_])
				- ((client.anIntArrayArrayArray8405
				    [client.anInt8480 * -265222603][3 + i_78_][i_79_])
				   - (client.anIntArrayArrayArray8405
				      [client.anInt8480 * -265222603][2 + i_78_]
				      [i_79_])))
			       * 3);
			int i_83_ = (client.anIntArrayArrayArray8405
				     [-265222603 * client.anInt8480][i_78_][i_79_]);
			int i_84_ = i_81_ - i_80_;
			int i_85_ = i_82_ + (i_80_ - 2 * i_81_);
			int i_86_
			    = ((client.anIntArrayArrayArray8405
				[-265222603 * client.anInt8480][2 + i_78_][i_79_])
			       - i_83_ + i_81_ - i_82_);
			fs_77_[i_79_] = ((float) i_83_
					 + f * (((float) i_85_ + (float) i_86_ * f) * f
						+ (float) i_84_));
		    }
		    float f_87_ = fs_77_[0] - fs[0];
		    float f_88_ = -1.0F * (fs_77_[1] - fs[1]);
		    float f_89_ = fs_77_[2] - fs[2];
		    double d = Math.sqrt((double) (f_87_ * f_87_ + f_89_ * f_89_));
		    Class496.anInt6527
			= ((int) (Math.atan2((double) f_88_, d) * 2607.5945876176133)
			   & 0x3fff) * 709117373;
		    Class322.anInt4909
			= ((int) (-Math.atan2((double) f_87_, (double) f_89_)
				  * 2607.5945876176133)
			   & 0x3fff) * 2118136689;
		    Class120_Sub18.anInt10605
			= (((1367758091 * client.anInt8401
			     * ((client.anIntArrayArrayArray8405
				 [-633801665 * client.anInt8418][2 + i_68_][3])
				- (client.anIntArrayArrayArray8405
				   [-633801665 * client.anInt8418][i_68_][3])))
			    >> 16)
			   + (client.anIntArrayArrayArray8405
			      [-633801665 * client.anInt8418][i_68_][3])) * 697117393;
		}
    }
    
    static final void method11604(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 1830590986;
	int i_90_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (i_90_ >= 2)
	    throw new RuntimeException();
	client.anInt8418 = -2047280193 * i_90_;
	int i_91_ = (((ClientScriptData) class454).integerStack
		     [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (i_91_ + 1 >= (client.anIntArrayArrayArray8405
			  [-633801665 * client.anInt8418]).length >> 1)
	    throw new RuntimeException();
	client.anInt8399 = 973071717 * i_91_;
	client.anInt8401 = 0;
	client.anInt8402 = -1916148833 * (((ClientScriptData) class454).integerStack
					  [2 + (((ClientScriptData) class454).intStackPointer
						* 1482319719)]);
	client.anInt8579
	    = 256600177 * (((ClientScriptData) class454).integerStack
			   [1482319719 * ((ClientScriptData) class454).intStackPointer + 3]);
	int i_92_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 4]);
	if (i_92_ >= 2)
	    throw new RuntimeException();
	client.anInt8480 = 759340061 * i_92_;
	int i_93_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 5]);
	if (1 + i_93_ >= (client.anIntArrayArrayArray8405
			  [client.anInt8480 * -265222603]).length >> 1)
	    throw new RuntimeException();
	client.anInt8400 = 1218996609 * i_93_;
	Class296.anInt4513 = -94060778;
	Class254.anInt4134 = -162819257;
	Class245.anInt3961 = -1540801703;
    }
}
