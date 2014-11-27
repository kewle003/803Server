/* Class560 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class HitMarkType
{
    public static final int anInt7272 = 1;
    public static final int anInt7273 = -1;
    public static final int anInt7274 = 0;
    public boolean aBool7275 = false;
    static final int anInt7276 = 16777215;
    static final int anInt7277 = 70;
    int anInt7278;
    public int anInt7279 = -1742961517;
    public int anInt7280 = 1972376951;
    public int anInt7281;
    int anInt7282;
    public int anInt7283;
    public int anInt7284;
    public int anInt7285;
    HitMarkTypeList myList;//aClass555_7286
    int anInt7287;
    public int anInt7288;
    String aString7289;
    int anInt7290;
    public int anInt7291;
    public int anInt7292 = -746311126;
    public int anInt7293;
    public int[] anIntArray7294;
    int anInt7295;
    int anInt7296;
    public static RSByteBuffer aClass241_Sub3_7297;
    
    public Class168 method12333(Class103 class103) {
	if (-1358762537 * anInt7287 < 0)
	    return null;
	Class168 class168
	    = ((Class168)
	       (((HitMarkTypeList) myList)
		    .hitmarkCache.get
		((long) (-1358762537 * anInt7287))));
	if (class168 == null) {
	    method12342(class103, (short) 3882);
	    class168
		= (Class168) (((HitMarkTypeList) myList)
				  .hitmarkCache.get
			      ((long) (-1358762537
				       * anInt7287)));
	}
	return class168;
    }
    
    public final HitMarkType method12334(Interface13 interface13,
				      Interface11 interface11, int i) {
	int i_0_ = -1;
	if (anIntArray7294 == null)
	    return this;
	if (null == interface13 || null == interface11)
	    return null;
	if (anInt7295 * -825419989 != -1) {
	    VarBitType class316
		= interface13.method93((anInt7295
					* -825419989),
				       1004582562);
	    if (class316 != null)
		i_0_ = interface11.getVarBitValue(class316, (short) 16327);
	} else if (-1 != anInt7296 * -638259185) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       (anInt7296
					* -638259185),
				       (byte) 50);
	    if (null != class179)
		i_0_ = interface11.getVarValueInt(class179, -1866475519);
	}
	if (i_0_ < 0 || i_0_ >= anIntArray7294.length - 1) {
	    int i_1_ = anIntArray7294[anIntArray7294.length - 1];
	    if (i_1_ != -1)
		return myList
			   .list(i_1_, -2030564844);
	    return null;
	}
	if (anIntArray7294[i_0_] == -1)
	    return null;
	return myList
		   .list(anIntArray7294[i_0_], -1822462607);
    }
    
    void decode/*method12335*/(RSByteBuffer buffer, int opcode, byte i_2_) {
		if (opcode == 1) {
		    anInt7279 = buffer.readBigSmart((byte) 32) * 1742961517;
		} else if (opcode == 2) {
		    anInt7280 = buffer.readTriByte(1771646547) * 326101641;
		    aBool7275 = true;
		} else if (opcode == 3) {
		    anInt7282 = buffer.readBigSmart((byte) -4) * -557102409;
		} else if (4 == opcode) {
		    anInt7278 = buffer.readBigSmart((byte) 5) * 229030721;
		} else if (opcode == 5) {
		    anInt7287 = buffer.readBigSmart((byte) 49) * -1789569561;
		} else if (6 == opcode) {
		    anInt7290 = buffer.readBigSmart((byte) -46) * -210288727;
		} else if (7 == opcode) {
		    anInt7283 = buffer.readShort((byte) 115) * -159065745;
		} else if (opcode == 8) {
		    aString7289 = buffer.readJagString(-291126178);
		} else if (opcode == 9) {
		    anInt7292 = buffer.readUnsignedShort(1162222719) * -1176438425;
		} else if (opcode == 10) {
		    anInt7284 = buffer.readShort((byte) 61) * 1876669523;
		} else if (opcode == 11) {
		    anInt7288 = 0;
		} else if (12 == opcode) {
		    anInt7285 = buffer.readUnsignedByte((byte) 25) * -694377875;
		} else if (13 == opcode) {
		    anInt7291 = buffer.readShort((byte) 99) * 1976077867;
		} else if (opcode == 14) {
		    anInt7288 = buffer.readUnsignedShort(1162222719) * 1245939887;
		} else if (opcode == 16) {
		    anInt7281 = buffer.readShort((byte) 116) * -1615255631;
		    anInt7293 = buffer.readShort((byte) 67) * 678019767;
		} else if (opcode == 17 || 18 == opcode) {
		    anInt7295 = buffer.readUnsignedShort(1162222719) * 658829187;
		    if (-825419989 * anInt7295 == 65535) {
		    	anInt7295 = -658829187;
		    }
		    anInt7296 = buffer.readUnsignedShort(1162222719) * 2055995119;
		    if (-638259185 * anInt7296 == 65535) {
		    	anInt7296 = -2055995119;
		    }
		    int i_3_ = -1;
		    if (18 == opcode) {
		    	i_3_ = buffer.readUnsignedShort(1162222719);
		    	if (65535 == i_3_) {
		    		i_3_ = -1;
		    	}
		    }
		    int i_4_ = buffer.readUnsignedByte((byte) -12);
		    anIntArray7294 = new int[i_4_ + 2];
		    for (int i_5_ = 0; i_5_ <= i_4_; i_5_++) {
				anIntArray7294[i_5_] = buffer.readUnsignedShort(1162222719);
				if (anIntArray7294[i_5_] == 65535) {
				    anIntArray7294[i_5_] = -1;
				}
		    }
		    anIntArray7294[i_4_ + 1] = i_3_;
		}
    }
    
    public Class168 method12336(Class103 class103, int i) {
	if (anInt7278 * 712758465 < 0)
	    return null;
	Class168 class168
	    = (Class168) (((HitMarkTypeList) myList)
			      .hitmarkCache.get
			  ((long) (712758465 * anInt7278)));
	if (null == class168) {
	    method12342(class103, (short) 5432);
	    class168
		= (Class168) (((HitMarkTypeList) myList)
				  .hitmarkCache.get
			      ((long) (anInt7278
				       * 712758465)));
	}
	return class168;
    }
    
    void decode/*method12337*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) -30);
		    if (0 == opcode) {
		    	break;
		    }
		    decode(buffer, opcode, (byte) -26);
		}
    }
    
    void method12338(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 40);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) -39);
	}
    }
    
    public Class168 method12339(Class103 class103, int i) {
	if (-1358762537 * anInt7287 < 0)
	    return null;
	Class168 class168
	    = ((Class168)
	       (((HitMarkTypeList) myList)
		    .hitmarkCache.get
		((long) (-1358762537 * anInt7287))));
	if (class168 == null) {
	    method12342(class103, (short) -12560);
	    class168
		= (Class168) (((HitMarkTypeList) myList)
				  .hitmarkCache.get
			      ((long) (-1358762537
				       * anInt7287)));
	}
	return class168;
    }
    
    public String method12340(int i) {
	String string = aString7289;
	for (;;) {
	    int i_7_ = string.indexOf("%1");
	    if (i_7_ < 0)
		break;
	    string
		= new StringBuilder().append(string.substring(0, i_7_)).append
		      (HashTable.method7322(i, false, 1663117747)).append
		      (string.substring(i_7_ + 2)).toString();
	}
	return string;
    }
    
    void method12341(RSByteBuffer class241_sub3, int i) {
	if (i == 1)
	    anInt7279 = class241_sub3.readBigSmart((byte) -48) * 1742961517;
	else if (i == 2) {
	    anInt7280 = class241_sub3.readTriByte(1771646547) * 326101641;
	    aBool7275 = true;
	} else if (i == 3)
	    anInt7282
		= class241_sub3.readBigSmart((byte) 6) * -557102409;
	else if (4 == i)
	    anInt7278
		= class241_sub3.readBigSmart((byte) -1) * 229030721;
	else if (i == 5)
	    anInt7287
		= class241_sub3.readBigSmart((byte) 103) * -1789569561;
	else if (6 == i)
	    anInt7290
		= class241_sub3.readBigSmart((byte) 38) * -210288727;
	else if (7 == i)
	    anInt7283 = class241_sub3.readShort((byte) 98) * -159065745;
	else if (i == 8)
	    aString7289
		= class241_sub3.readJagString(-1333066110);
	else if (i == 9)
	    anInt7292 = class241_sub3.readUnsignedShort(1162222719) * -1176438425;
	else if (i == 10)
	    anInt7284 = class241_sub3.readShort((byte) 88) * 1876669523;
	else if (i == 11)
	    anInt7288 = 0;
	else if (12 == i)
	    anInt7285 = class241_sub3.readUnsignedByte((byte) 63) * -694377875;
	else if (13 == i)
	    anInt7291 = class241_sub3.readShort((byte) 44) * 1976077867;
	else if (i == 14)
	    anInt7288 = class241_sub3.readUnsignedShort(1162222719) * 1245939887;
	else if (i == 16) {
	    anInt7281 = class241_sub3.readShort((byte) 52) * -1615255631;
	    anInt7293 = class241_sub3.readShort((byte) 104) * 678019767;
	} else if (i == 17 || 18 == i) {
	    anInt7295
		= class241_sub3.readUnsignedShort(1162222719) * 658829187;
	    if (-825419989 * anInt7295 == 65535)
		anInt7295 = -658829187;
	    anInt7296
		= class241_sub3.readUnsignedShort(1162222719) * 2055995119;
	    if (-638259185 * anInt7296 == 65535)
		anInt7296 = -2055995119;
	    int i_8_ = -1;
	    if (18 == i) {
		i_8_ = class241_sub3.readUnsignedShort(1162222719);
		if (65535 == i_8_)
		    i_8_ = -1;
	    }
	    int i_9_ = class241_sub3.readUnsignedByte((byte) 80);
	    anIntArray7294 = new int[i_9_ + 2];
	    for (int i_10_ = 0; i_10_ <= i_9_; i_10_++) {
		anIntArray7294[i_10_] = class241_sub3.readUnsignedShort(1162222719);
		if (anIntArray7294[i_10_] == 65535)
		    anIntArray7294[i_10_] = -1;
	    }
	    anIntArray7294[i_9_ + 1] = i_8_;
	}
    }
    
    void method12342/*method12342*/(Class103 class103, short i) {
		JS5 sprites = ((HitMarkTypeList) myList).sprites;
		if (anInt7282 * -10112249 >= 0
				&& (((HitMarkTypeList) myList).hitmarkCache.get((long) (-10112249 * anInt7282))) == null
				&& sprites.method4250(anInt7282 * -10112249, 145383837)) {
		    Class108 class108 = Class160.method3438(sprites, anInt7282 * -10112249);
		    ((HitMarkTypeList) myList).hitmarkCache.put(class103.method2289(class108, true),
		    		(long) (-10112249 * anInt7282));
		}
		if (-1358762537 * anInt7287 >= 0
				&& (((HitMarkTypeList) myList).hitmarkCache.get((long) (-1358762537 * anInt7287))) == null
				&& sprites.method4250(-1358762537 * anInt7287, 1894911497)) {
		    Class108 class108 = Class160.method3438(sprites, (-1358762537 * anInt7287));
		    ((HitMarkTypeList) myList).hitmarkCache.put(class103.method2289(class108, true),
		    		(long) (-1358762537 * anInt7287));
		}
		if (712758465 * anInt7278 >= 0
				&& (((HitMarkTypeList) myList).hitmarkCache.get((long) (anInt7278 * 712758465))) == null
				&& sprites.method4250(anInt7278 * 712758465, 861274289)) {
		    Class108 class108 = Class160.method3438(sprites, anInt7278 * 712758465);
		    ((HitMarkTypeList) myList).hitmarkCache.put(class103.method2289(class108, true),
		    		(long) (712758465 * anInt7278));
		}
		if (1925960857 * anInt7290 >= 0
				&& (((HitMarkTypeList) myList).hitmarkCache.get((long) (1925960857 * anInt7290))) == null
				&& sprites.method4250(anInt7290 * 1925960857, -311381964)) {
		    Class108 class108 = Class160.method3438(sprites, 1925960857 * anInt7290);
		    ((HitMarkTypeList) myList).hitmarkCache.put(class103.method2289(class108, true),
		    		(long) (1925960857 * anInt7290));
		}
    }
    
    HitMarkType() {
		anInt7282 = 557102409;
		anInt7287 = 1789569561;
		anInt7278 = -229030721;
		anInt7290 = 210288727;
		anInt7283 = 0;
		anInt7284 = 0;
		anInt7288 = -1245939887;
		aString7289 = "";
		anInt7285 = 694377875;
		anInt7291 = 0;
		anInt7281 = 0;
		anInt7293 = 0;
		anInt7295 = -658829187;
		anInt7296 = -2055995119;
    }
    
    void method12343(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -65);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) -101);
	}
    }
    
    void method12344(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -68);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) -28);
	}
    }
    
    public String method12345(int i, byte i_11_) {
	String string = aString7289;
	for (;;) {
	    int i_12_ = string.indexOf("%1");
	    if (i_12_ < 0)
		break;
	    string
		= new StringBuilder().append(string.substring(0, i_12_)).append
		      (HashTable.method7322(i, false, 1663117747)).append
		      (string.substring(i_12_ + 2)).toString();
	}
	return string;
    }
    
    public final HitMarkType method12346(Interface13 interface13,
				      Interface11 interface11) {
	int i = -1;
	if (anIntArray7294 == null)
	    return this;
	if (null == interface13 || null == interface11)
	    return null;
	if (anInt7295 * -825419989 != -1) {
	    VarBitType class316
		= interface13.method93((anInt7295
					* -825419989),
				       1037435774);
	    if (class316 != null)
		i = interface11.getVarBitValue(class316, (short) 3940);
	} else if (-1 != anInt7296 * -638259185) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       (anInt7296
					* -638259185),
				       (byte) 24);
	    if (null != class179)
		i = interface11.getVarValueInt(class179, -1219309671);
	}
	if (i < 0 || i >= anIntArray7294.length - 1) {
	    int i_13_ = anIntArray7294[anIntArray7294.length - 1];
	    if (i_13_ != -1)
		return myList
			   .list(i_13_, -1624429102);
	    return null;
	}
	if (anIntArray7294[i] == -1)
	    return null;
	return myList.list(anIntArray7294[i],
							    -2051112079);
    }
    
    public final HitMarkType method12347(Interface13 interface13,
				      Interface11 interface11) {
	int i = -1;
	if (anIntArray7294 == null)
	    return this;
	if (null == interface13 || null == interface11)
	    return null;
	if (anInt7295 * -825419989 != -1) {
	    VarBitType class316
		= interface13.method93((anInt7295
					* -825419989),
				       1656471507);
	    if (class316 != null)
		i = interface11.getVarBitValue(class316, (short) 10496);
	} else if (-1 != anInt7296 * -638259185) {
	    VarType class179
		= interface13.method96(VarDomainType.PLAYER,
				       (anInt7296
					* -638259185),
				       (byte) 85);
	    if (null != class179)
		i = interface11.getVarValueInt(class179, -202953148);
	}
	if (i < 0 || i >= anIntArray7294.length - 1) {
	    int i_14_ = anIntArray7294[anIntArray7294.length - 1];
	    if (i_14_ != -1)
		return myList
			   .list(i_14_, -1347623330);
	    return null;
	}
	if (anIntArray7294[i] == -1)
	    return null;
	return myList.list(anIntArray7294[i],
							    -1428995720);
    }
    
    public String method12348(int i) {
	String string = aString7289;
	for (;;) {
	    int i_15_ = string.indexOf("%1");
	    if (i_15_ < 0)
		break;
	    string
		= new StringBuilder().append(string.substring(0, i_15_)).append
		      (HashTable.method7322(i, false, 1663117747)).append
		      (string.substring(i_15_ + 2)).toString();
	}
	return string;
    }
    
    public Class168 method12349(Class103 class103, int i) {
	if (1925960857 * anInt7290 < 0)
	    return null;
	Class168 class168
	    = (Class168) (((HitMarkTypeList) myList)
			      .hitmarkCache.get
			  ((long) (1925960857 * anInt7290)));
	if (null == class168) {
	    method12342(class103, (short) -24958);
	    class168
		= (Class168) (((HitMarkTypeList) myList)
				  .hitmarkCache.get
			      ((long) (1925960857
				       * anInt7290)));
	}
	return class168;
    }
    
    public Class168 method12350(Class103 class103) {
	if (anInt7282 * -10112249 < 0)
	    return null;
	Class168 class168
	    = (Class168) (((HitMarkTypeList) myList)
			      .hitmarkCache.get
			  ((long) (anInt7282 * -10112249)));
	if (class168 == null) {
	    method12342(class103, (short) -5589);
	    class168
		= (Class168) (((HitMarkTypeList) myList)
				  .hitmarkCache.get
			      ((long) (-10112249
				       * anInt7282)));
	}
	return class168;
    }
    
    public Class168 method12351(Class103 class103, int i) {
	if (anInt7282 * -10112249 < 0)
	    return null;
	Class168 class168
	    = (Class168) (((HitMarkTypeList) myList)
			      .hitmarkCache.get
			  ((long) (anInt7282 * -10112249)));
	if (class168 == null) {
	    method12342(class103, (short) 13847);
	    class168
		= (Class168) (((HitMarkTypeList) myList)
				  .hitmarkCache.get
			      ((long) (-10112249
				       * anInt7282)));
	}
	return class168;
    }
    
    public Class168 method12352(Class103 class103) {
	if (-1358762537 * anInt7287 < 0)
	    return null;
	Class168 class168
	    = ((Class168)
	       (((HitMarkTypeList) myList)
		    .hitmarkCache.get
		((long) (-1358762537 * anInt7287))));
	if (class168 == null) {
	    method12342(class103, (short) 10102);
	    class168
		= (Class168) (((HitMarkTypeList) myList)
				  .hitmarkCache.get
			      ((long) (-1358762537
				       * anInt7287)));
	}
	return class168;
    }
    
    public Class168 method12353(Class103 class103) {
	if (anInt7278 * 712758465 < 0)
	    return null;
	Class168 class168
	    = (Class168) (((HitMarkTypeList) myList)
			      .hitmarkCache.get
			  ((long) (712758465 * anInt7278)));
	if (null == class168) {
	    method12342(class103, (short) -8174);
	    class168
		= (Class168) (((HitMarkTypeList) myList)
				  .hitmarkCache.get
			      ((long) (anInt7278
				       * 712758465)));
	}
	return class168;
    }
    
    public Class168 method12354(Class103 class103) {
	if (anInt7278 * 712758465 < 0)
	    return null;
	Class168 class168
	    = (Class168) (((HitMarkTypeList) myList)
			      .hitmarkCache.get
			  ((long) (712758465 * anInt7278)));
	if (null == class168) {
	    method12342(class103, (short) -21894);
	    class168
		= (Class168) (((HitMarkTypeList) myList)
				  .hitmarkCache.get
			      ((long) (anInt7278
				       * 712758465)));
	}
	return class168;
    }
    
    void method12355(Class103 class103) {
	JS5 class210
	    = ((HitMarkTypeList) myList).sprites;
	if (anInt7282 * -10112249 >= 0
	    && (((HitMarkTypeList) myList)
		    .hitmarkCache.get
		((long) (-10112249 * anInt7282))) == null
	    && class210.method4250(anInt7282 * -10112249,
				   1891418413)) {
	    Class108 class108
		= Class160.method3438(class210,
				      anInt7282 * -10112249);
	    ((HitMarkTypeList) myList).hitmarkCache
		.put
		(class103.method2289(class108, true),
		 (long) (-10112249 * anInt7282));
	}
	if (-1358762537 * anInt7287 >= 0
	    && (((HitMarkTypeList) myList)
		    .hitmarkCache.get
		((long) (-1358762537 * anInt7287))) == null
	    && class210.method4250(-1358762537 * anInt7287,
				   220883778)) {
	    Class108 class108
		= Class160.method3438(class210,
				      (-1358762537
				       * anInt7287));
	    ((HitMarkTypeList) myList).hitmarkCache
		.put
		(class103.method2289(class108, true),
		 (long) (-1358762537 * anInt7287));
	}
	if (712758465 * anInt7278 >= 0
	    && (((HitMarkTypeList) myList)
		    .hitmarkCache.get
		((long) (anInt7278 * 712758465))) == null
	    && class210.method4250(anInt7278 * 712758465,
				   2002843410)) {
	    Class108 class108
		= Class160.method3438(class210,
				      anInt7278 * 712758465);
	    ((HitMarkTypeList) myList).hitmarkCache
		.put
		(class103.method2289(class108, true),
		 (long) (712758465 * anInt7278));
	}
	if (1925960857 * anInt7290 >= 0
	    && (((HitMarkTypeList) myList)
		    .hitmarkCache.get
		((long) (1925960857 * anInt7290))) == null
	    && class210.method4250(anInt7290 * 1925960857,
				   515362300)) {
	    Class108 class108
		= Class160.method3438(class210, 1925960857 * (((HitMarkType) this)
							      .anInt7290));
	    ((HitMarkTypeList) myList).hitmarkCache
		.put
		(class103.method2289(class108, true),
		 (long) (1925960857 * anInt7290));
	}
    }
    
    void method12356(Class103 class103) {
	JS5 class210
	    = ((HitMarkTypeList) myList).sprites;
	if (anInt7282 * -10112249 >= 0
	    && (((HitMarkTypeList) myList)
		    .hitmarkCache.get
		((long) (-10112249 * anInt7282))) == null
	    && class210.method4250(anInt7282 * -10112249,
				   602600882)) {
	    Class108 class108
		= Class160.method3438(class210,
				      anInt7282 * -10112249);
	    ((HitMarkTypeList) myList).hitmarkCache
		.put
		(class103.method2289(class108, true),
		 (long) (-10112249 * anInt7282));
	}
	if (-1358762537 * anInt7287 >= 0
	    && (((HitMarkTypeList) myList)
		    .hitmarkCache.get
		((long) (-1358762537 * anInt7287))) == null
	    && class210.method4250(-1358762537 * anInt7287,
				   1679736067)) {
	    Class108 class108
		= Class160.method3438(class210,
				      (-1358762537
				       * anInt7287));
	    ((HitMarkTypeList) myList).hitmarkCache
		.put
		(class103.method2289(class108, true),
		 (long) (-1358762537 * anInt7287));
	}
	if (712758465 * anInt7278 >= 0
	    && (((HitMarkTypeList) myList)
		    .hitmarkCache.get
		((long) (anInt7278 * 712758465))) == null
	    && class210.method4250(anInt7278 * 712758465,
				   617016044)) {
	    Class108 class108
		= Class160.method3438(class210,
				      anInt7278 * 712758465);
	    ((HitMarkTypeList) myList).hitmarkCache
		.put
		(class103.method2289(class108, true),
		 (long) (712758465 * anInt7278));
	}
	if (1925960857 * anInt7290 >= 0
	    && (((HitMarkTypeList) myList)
		    .hitmarkCache.get
		((long) (1925960857 * anInt7290))) == null
	    && class210.method4250(anInt7290 * 1925960857,
				   -195403535)) {
	    Class108 class108
		= Class160.method3438(class210, 1925960857 * (((HitMarkType) this)
							      .anInt7290));
	    ((HitMarkTypeList) myList).hitmarkCache
		.put
		(class103.method2289(class108, true),
		 (long) (1925960857 * anInt7290));
	}
    }
    
    static final void method12357(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = Class21.myPlayer.method17839((byte) 40);
    }
}
