/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class338
{
    static final int anInt5079 = 0;
    static final int anInt5080 = 2;
    static Class129 aClass129_5081;
    public static final int anInt5082 = 1;
    public static final int anInt5083 = 2;
    public static final int anInt5084 = 0;
    static int anInt5085;
    public int anInt5086;
    static final int anInt5087 = 1;
    public static Class338[] aClass338Array5088 = new Class338[16];
    int anInt5089;
    public static HashTable aClass407_5090;
    public static final int anInt5091 = 1;
    public int anInt5092;
    public int anInt5093;
    static final int anInt5094 = 1;
    public int anInt5095;
    public int anInt5096;
    public int anInt5097;
    public int anInt5098;
    public int anInt5099;
    public int anInt5100 = 0;
    public int anInt5101 = 0;
    boolean aBool5102 = false;
    public static final int anInt5103 = 0;
    public long aLong5104;
    public int anInt5105;
    
    void method6089(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 16);
	    if (0 == i)
		break;
	    method6093(class241_sub3, i, (byte) 1);
	}
    }
    
    void method6090(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_0_ = class241_sub3.readUnsignedByte((byte) -54);
	    if (0 == i_0_)
		break;
	    method6093(class241_sub3, i_0_, (byte) 1);
	}
    }
    
    void method6091() {
	anInt5105
	    = (Class282.anIntArray4441
	       [((Class338) this).anInt5089 * 1453566739 << 3]) * 87628769;
	long l = (long) (-54747725 * anInt5095);
	long l_1_ = (long) (anInt5096 * 1684111005);
	long l_2_ = (long) (-529083375 * anInt5097);
	anInt5086
	    = ((int) Math.sqrt((double) (l_2_ * l_2_ + (l_1_ * l_1_ + l * l)))
	       * -1744184031);
	if (anInt5099 * 933168033 == 0)
	    anInt5099 = 1486594145;
	if (0 == anInt5098 * 1066833957)
	    aLong5104 = -1042315049885201759L;
	else if (anInt5098 * 1066833957 == 1) {
	    aLong5104
		= ((long) (1682913032 * anInt5086 / (anInt5099 * 933168033))
		   * -3985467196167719585L);
	    aLong5104 *= -2669198612719589729L * aLong5104;
	} else if (1066833957 * anInt5098 == 2)
	    aLong5104
		= -3985467196167719585L * (long) (anInt5086 * 1682913032
						  / (anInt5099 * 933168033));
	if (((Class338) this).aBool5102)
	    anInt5086 *= -1;
    }
    
    void method6092(int i) {
	anInt5105
	    = (Class282.anIntArray4441
	       [((Class338) this).anInt5089 * 1453566739 << 3]) * 87628769;
	long l = (long) (-54747725 * anInt5095);
	long l_3_ = (long) (anInt5096 * 1684111005);
	long l_4_ = (long) (-529083375 * anInt5097);
	anInt5086
	    = ((int) Math.sqrt((double) (l_4_ * l_4_ + (l_3_ * l_3_ + l * l)))
	       * -1744184031);
	if (anInt5099 * 933168033 == 0)
	    anInt5099 = 1486594145;
	if (0 == anInt5098 * 1066833957)
	    aLong5104 = -1042315049885201759L;
	else if (anInt5098 * 1066833957 == 1) {
	    aLong5104
		= ((long) (1682913032 * anInt5086 / (anInt5099 * 933168033))
		   * -3985467196167719585L);
	    aLong5104 *= -2669198612719589729L * aLong5104;
	} else if (1066833957 * anInt5098 == 2)
	    aLong5104
		= -3985467196167719585L * (long) (anInt5086 * 1682913032
						  / (anInt5099 * 933168033));
	if (((Class338) this).aBool5102)
	    anInt5086 *= -1;
    }
    
    static {
	anInt5085 = 0;
	aClass407_5090 = new HashTable(16);
	aClass129_5081 = new Class129(64);
    }
    
    void method6093(RSByteBuffer class241_sub3, int i, byte i_5_) {
	if (i == 1)
	    ((Class338) this).anInt5089
		= class241_sub3.readUnsignedShort(1162222719) * 1773197083;
	else if (i == 2)
	    class241_sub3.readUnsignedByte((byte) 118);
	else if (i == 3) {
	    anInt5095 = class241_sub3.readInt((byte) 43) * 1388271995;
	    anInt5096 = class241_sub3.readInt((byte) 67) * -1257703499;
	    anInt5097 = class241_sub3.readInt((byte) 23) * 543726833;
	} else if (4 == i) {
	    anInt5098 = class241_sub3.readUnsignedByte((byte) -64) * 1019986861;
	    anInt5099 = class241_sub3.readInt((byte) 54) * 1486594145;
	} else if (i == 6)
	    anInt5092 = class241_sub3.readUnsignedByte((byte) 11) * -1617456419;
	else if (i == 8)
	    anInt5100 = 147175923;
	else if (9 == i)
	    anInt5101 = -1512874621;
	else if (10 == i)
	    ((Class338) this).aBool5102 = true;
    }
    
    public static Class338 method6094(int i) {
	Class338 class338 = (Class338) aClass129_5081.get((long) i);
	if (class338 != null)
	    return class338;
	byte[] is = Class495.aClass210_6523.getfile(1, i, 1004908777);
	class338 = new Class338();
	class338.anInt5093 = -396362639 * i;
	if (is != null)
	    class338.method6090(new RSByteBuffer(is), -60559534);
	class338.method6092(-652984376);
	if (2 == class338.anInt5092 * 2676085
	    && aClass407_5090.get((long) i) == null) {
	    aClass407_5090.put(new IntegerNode(anInt5085
							 * -237558989),
				      (long) i);
	    aClass338Array5088[(anInt5085 += 1694339067) * -237558989 - 1]
		= class338;
	}
	aClass129_5081.put(class338, (long) i);
	return class338;
    }
    
    public static Class338 method6095(int i) {
	Class338 class338 = (Class338) aClass129_5081.get((long) i);
	if (class338 != null)
	    return class338;
	byte[] is = Class495.aClass210_6523.getfile(1, i, -245163628);
	class338 = new Class338();
	class338.anInt5093 = -396362639 * i;
	if (is != null)
	    class338.method6090(new RSByteBuffer(is), -409942083);
	class338.method6092(1090255307);
	if (2 == class338.anInt5092 * 2676085
	    && aClass407_5090.get((long) i) == null) {
	    aClass407_5090.put(new IntegerNode(anInt5085
							 * -237558989),
				      (long) i);
	    aClass338Array5088[(anInt5085 += 1694339067) * -237558989 - 1]
		= class338;
	}
	aClass129_5081.put(class338, (long) i);
	return class338;
    }
    
    public static Class338 method6096(int i) {
	Class338 class338 = (Class338) aClass129_5081.get((long) i);
	if (class338 != null)
	    return class338;
	byte[] is = Class495.aClass210_6523.getfile(1, i, 1503556431);
	class338 = new Class338();
	class338.anInt5093 = -396362639 * i;
	if (is != null)
	    class338.method6090(new RSByteBuffer(is), 1657101343);
	class338.method6092(1480063230);
	if (2 == class338.anInt5092 * 2676085
	    && aClass407_5090.get((long) i) == null) {
	    aClass407_5090.put(new IntegerNode(anInt5085
							 * -237558989),
				      (long) i);
	    aClass338Array5088[(anInt5085 += 1694339067) * -237558989 - 1]
		= class338;
	}
	aClass129_5081.put(class338, (long) i);
	return class338;
    }
    
    public static Class338 method6097(int i) {
	Class338 class338 = (Class338) aClass129_5081.get((long) i);
	if (class338 != null)
	    return class338;
	byte[] is = Class495.aClass210_6523.getfile(1, i, 1330338554);
	class338 = new Class338();
	class338.anInt5093 = -396362639 * i;
	if (is != null)
	    class338.method6090(new RSByteBuffer(is), -1065710526);
	class338.method6092(1314481668);
	if (2 == class338.anInt5092 * 2676085
	    && aClass407_5090.get((long) i) == null) {
	    aClass407_5090.put(new IntegerNode(anInt5085
							 * -237558989),
				      (long) i);
	    aClass338Array5088[(anInt5085 += 1694339067) * -237558989 - 1]
		= class338;
	}
	aClass129_5081.put(class338, (long) i);
	return class338;
    }
    
    public static Class338 method6098(int i) {
	Class338 class338 = (Class338) aClass129_5081.get((long) i);
	if (class338 != null)
	    return class338;
	byte[] is = Class495.aClass210_6523.getfile(1, i, -1255354256);
	class338 = new Class338();
	class338.anInt5093 = -396362639 * i;
	if (is != null)
	    class338.method6090(new RSByteBuffer(is), -301328759);
	class338.method6092(2090659315);
	if (2 == class338.anInt5092 * 2676085
	    && aClass407_5090.get((long) i) == null) {
	    aClass407_5090.put(new IntegerNode(anInt5085
							 * -237558989),
				      (long) i);
	    aClass338Array5088[(anInt5085 += 1694339067) * -237558989 - 1]
		= class338;
	}
	aClass129_5081.put(class338, (long) i);
	return class338;
    }
    
    Class338() {
	/* empty */
    }
    
    void method6099(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -1);
	    if (0 == i)
		break;
	    method6093(class241_sub3, i, (byte) 1);
	}
    }
    
    void method6100() {
	anInt5105
	    = (Class282.anIntArray4441
	       [((Class338) this).anInt5089 * 1453566739 << 3]) * 87628769;
	long l = (long) (-54747725 * anInt5095);
	long l_6_ = (long) (anInt5096 * 1684111005);
	long l_7_ = (long) (-529083375 * anInt5097);
	anInt5086
	    = ((int) Math.sqrt((double) (l_7_ * l_7_ + (l_6_ * l_6_ + l * l)))
	       * -1744184031);
	if (anInt5099 * 933168033 == 0)
	    anInt5099 = 1486594145;
	if (0 == anInt5098 * 1066833957)
	    aLong5104 = -1042315049885201759L;
	else if (anInt5098 * 1066833957 == 1) {
	    aLong5104
		= ((long) (1682913032 * anInt5086 / (anInt5099 * 933168033))
		   * -3985467196167719585L);
	    aLong5104 *= -2669198612719589729L * aLong5104;
	} else if (1066833957 * anInt5098 == 2)
	    aLong5104
		= -3985467196167719585L * (long) (anInt5086 * 1682913032
						  / (anInt5099 * 933168033));
	if (((Class338) this).aBool5102)
	    anInt5086 *= -1;
    }
    
    void method6101(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    ((Class338) this).anInt5089
		= class241_sub3.readUnsignedShort(1162222719) * 1773197083;
	else if (i == 2)
	    class241_sub3.readUnsignedByte((byte) 35);
	else if (i == 3) {
	    anInt5095 = class241_sub3.readInt((byte) 14) * 1388271995;
	    anInt5096 = class241_sub3.readInt((byte) 7) * -1257703499;
	    anInt5097 = class241_sub3.readInt((byte) 119) * 543726833;
	} else if (4 == i) {
	    anInt5098 = class241_sub3.readUnsignedByte((byte) -53) * 1019986861;
	    anInt5099 = class241_sub3.readInt((byte) 114) * 1486594145;
	} else if (i == 6)
	    anInt5092 = class241_sub3.readUnsignedByte((byte) -17) * -1617456419;
	else if (i == 8)
	    anInt5100 = 147175923;
	else if (9 == i)
	    anInt5101 = -1512874621;
	else if (10 == i)
	    ((Class338) this).aBool5102 = true;
    }
    
    void method6102(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    ((Class338) this).anInt5089
		= class241_sub3.readUnsignedShort(1162222719) * 1773197083;
	else if (i == 2)
	    class241_sub3.readUnsignedByte((byte) 103);
	else if (i == 3) {
	    anInt5095 = class241_sub3.readInt((byte) 109) * 1388271995;
	    anInt5096 = class241_sub3.readInt((byte) 29) * -1257703499;
	    anInt5097 = class241_sub3.readInt((byte) 28) * 543726833;
	} else if (4 == i) {
	    anInt5098 = class241_sub3.readUnsignedByte((byte) -9) * 1019986861;
	    anInt5099 = class241_sub3.readInt((byte) 40) * 1486594145;
	} else if (i == 6)
	    anInt5092 = class241_sub3.readUnsignedByte((byte) 43) * -1617456419;
	else if (i == 8)
	    anInt5100 = 147175923;
	else if (9 == i)
	    anInt5101 = -1512874621;
	else if (10 == i)
	    ((Class338) this).aBool5102 = true;
    }
    
    public static void method6103(JS5 class210) {
	Class495.aClass210_6523 = class210;
    }
    
    public static void method6104(JS5 class210) {
	Class495.aClass210_6523 = class210;
    }
    
    public static void method6105() {
	aClass129_5081.reset(-568921181);
    }
    
    public static void method6106() {
	aClass129_5081.reset(-979867334);
    }
    
    public static void method6107() {
	aClass129_5081.reset(-1574121550);
    }
    
    public static void method6108() {
	aClass129_5081.reset(-253247266);
    }
    
    public static Class519[] method6109(int i) {
	return (new Class519[]
		{ Class519.aClass519_6789, Class519.aClass519_6790,
		  Class519.aClass519_6791 });
    }
    
    static final void method6110(ClientScriptData class454, int i) {
	int i_8_ = ((client.anIntArrayArrayArray8405
		     [(((ClientScriptData) class454).integerStack
		       [((((ClientScriptData) class454).intStackPointer -= 1736754263)
			 * 1482319719)])]).length
		    >> 1);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_8_;
    }
    
    static final void method6111(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1;
    }
    
    public static String method6112(int i, int i_9_) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    static void method6113
	(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_,
	 int i_15_, Class241_Sub39_Sub11 class241_sub39_sub11, Class96 class96,
	 Class639 class639, int i_16_, int i_17_, int i_18_) {
	if (i > i_11_ && i < i_13_ + i_11_
	    && i_10_ > i_15_ - -351886683 * class639.anInt8258 - 1
	    && i_10_ < i_15_ + 326424439 * class639.anInt8260
	    && ((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10876)
	    i_16_ = i_17_;
	int[] is = Class213.method4309(class241_sub39_sub11, 343937022);
	String string = SkillTypeIterator.method11257(class241_sub39_sub11, (byte) 30);
	if (is != null)
	    string = new StringBuilder().append(string).append
			 (Class221.method4476(is, (byte) 2)).toString();
	class96.method2119(string, i_11_ + 3, i_15_, i_16_, 0,
			   client.aRandom8380, Class5.anInt28,
			   Class133.aClass168Array1613,
			   Class242.anIntArray2783, 50255114);
	if (((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10868)
	    Class443.aClass168_6165.method3646
		(5 + i_11_ + class639.method13562(string, (byte) 18),
		 i_15_ - class639.anInt8258 * -351886683);
    }
}
