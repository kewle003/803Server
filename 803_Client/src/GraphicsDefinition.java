/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GraphicsDefinition
{
    int anInt6261;
    GraphicsDefinitionLoader loader;//aClass457_6262
    int graphicsID;//anInt6263
    int defaultModel;//anInt6264
    short[] aShortArray6265;
    short[] aShortArray6266;
    public int anInt6267 = 674679157;
    short[] aShortArray6268;
    short[] aShortArray6269;
    byte[] aByteArray6270;
    byte[] aByteArray6271;
    int anInt6272 = 1688050304;
    byte aByte6273;
    int anInt6274 = 396308096;
    int anInt6275;
    static final int anInt6276 = 8224;
    public boolean aBool6277;
    int anInt6278 = 0;
    int anInt6279;
    
    public final Class89 method10607(Class103 class103, int i, int i_0_,
				     Class166 class166, Class166 class166_1_,
				     int i_2_, int i_3_, int i_4_,
				     Class409 class409, byte i_5_) {
	return method10613(class103, i, true, class166, class166_1_, i_2_,
			   i_3_, i_4_, i_0_, 0, 0, 0, class409, i_5_,
			   -1955795570);
    }
    
    public final boolean method10608() {
	if (defaultModel * -1296595209 == -1)
	    return true;
	return (((GraphicsDefinitionLoader) loader)
		    .graphicsDefContainer.method4188
		(defaultModel * -1296595209, 0, -1448731365));
    }
    
    final Class89 method10609
	(Class103 class103, int i, boolean bool, Class166 class166,
	 Class166 class166_6_, int i_7_, int i_8_, int i_9_, int i_10_,
	 int i_11_, int i_12_, int i_13_, Class409 class409, byte i_14_) {
	int i_15_ = i;
	bool = bool & 0 != aByte6273;
	if (class409 != null)
	    i_15_ |= class409.method7356(-1422985805);
	if (anInt6274 * 750749173 != 128)
	    i_15_ |= 0x2;
	if (-115245283 * anInt6272 != 128
	    || -1589640547 * anInt6278 != 0 || i_10_ != 0)
	    i_15_ |= 0x5;
	if (bool)
	    i_15_ |= 0x7;
	Class89 class89;
	synchronized (((GraphicsDefinitionLoader) loader)
		      .aClass129_6255) {
	    class89
		= ((Class89)
		   (((GraphicsDefinitionLoader) loader)
			.aClass129_6255.get
		    ((long) ((graphicsID
			      = (190231187
				 * (graphicsID * -1853998181
				    | class103.anInt1456 * 1931687493 << 29)))
			     * -1853998181))));
	}
	if (class89 == null
	    || class103.method2301(class89.method1866(), i_15_) != 0) {
	    if (null != class89)
		i_15_ = class103.method2302(i_15_, class89.method1866());
	    int i_16_ = i_15_;
	    if (aShortArray6265 != null)
		i_16_ |= 0x4000;
	    if (aShortArray6266 != null)
		i_16_ |= 0x8000;
	    Class161 class161
		= Class161.method3448((((GraphicsDefinitionLoader)
					loader)
				       .graphicsDefContainer),
				      (defaultModel
				       * -1296595209),
				      0);
	    if (null == class161)
		return null;
	    if (class161.anInt1789 < 13)
		class161.method3464(2);
	    class89
		= (class103.method2356
		   (class161, i_16_,
		    -357525597 * (((GraphicsDefinitionLoader) loader)
				  .anInt6253),
		    -173801573 * anInt6275 + 64,
		    850 + -121178197 * anInt6261));
	    if (aShortArray6265 != null) {
		for (int i_17_ = 0;
		     i_17_ < aShortArray6265.length; i_17_++)
		    class89.method1908((aShortArray6265
					[i_17_]),
				       (aShortArray6268
					[i_17_]));
	    }
	    if (aShortArray6266 != null) {
		for (int i_18_ = 0;
		     i_18_ < aShortArray6266.length; i_18_++)
		    class89.method1985((aShortArray6266
					[i_18_]),
				       (aShortArray6269
					[i_18_]));
	    }
	    class89.method1928(i_15_);
	    synchronized (((GraphicsDefinitionLoader) loader)
			  .aClass129_6255) {
		((GraphicsDefinitionLoader) loader)
		    .aClass129_6255.put
		    (class89,
		     (long) ((graphicsID
			      = (190231187
				 * (graphicsID * -1853998181
				    | class103.anInt1456 * 1931687493 << 29)))
			     * -1853998181));
	    }
	}
	Class89 class89_19_ = class89.method2019(i_14_, i_15_, true);
	if (class409 != null)
	    class409.method7357(class89_19_, 0, (byte) -76);
	if (anInt6272 * -115245283 != 128
	    || 750749173 * anInt6274 != 128)
	    class89_19_.method1863(anInt6272 * -115245283,
				   anInt6274 * 750749173,
				   anInt6272 * -115245283);
	if (0 != -1589640547 * anInt6278) {
	    if (90 == anInt6278 * -1589640547)
		i_10_ += 4096;
	    if (180 == anInt6278 * -1589640547)
		i_10_ += 8192;
	    if (270 == anInt6278 * -1589640547)
		i_10_ += 12288;
	}
	if (i_10_ != 0) {
	    i_10_ &= 0x3fff;
	    class89_19_.method1868(i_10_);
	}
	if (bool) {
	    if (null != class166)
		class89_19_.method1875(aByte6273,
				       (-1594016339
					* anInt6279),
				       class166, class166_6_, i_7_, i_8_,
				       i_9_);
	    else {
		if (i_11_ != 0)
		    class89_19_.method1870(i_11_);
		if (0 != i_12_)
		    class89_19_.method1980(i_12_);
		if (i_13_ != 0)
		    class89_19_.method1927(0, i_13_, 0);
	    }
	}
	class89_19_.method1928(i);
	return class89_19_;
    }
    
    public final Class89 method10610
	(Class103 class103, int i, int i_20_, int i_21_, int i_22_, int i_23_,
	 Class409 class409, byte i_24_, byte i_25_) {
	if (aByte6273 != 3)
	    return method10613(class103, i, false, null, null, 0, 0, 0, i_20_,
			       0, 0, 0, class409, i_24_, -2113063336);
	return method10613(class103, i, true, null, null, 0, 0, 0, i_20_,
			   i_21_, i_22_, i_23_, class409, i_24_, -1990092456);
    }
    
    void method10611(RSByteBuffer class241_sub3, int i) {
	do {
	    if (i == 1)
		defaultModel
		    = class241_sub3.readBigSmart((byte) 99) * 539433671;
	    else if (2 == i)
		anInt6267 = class241_sub3.readBigSmart((byte) -17) * -674679157;
	    else if (4 == i)
		anInt6272
		    = class241_sub3.readUnsignedShort(1162222719) * -1630979275;
	    else if (i == 5)
		anInt6274
		    = class241_sub3.readUnsignedShort(1162222719) * 875511389;
	    else if (6 == i)
		anInt6278
		    = class241_sub3.readUnsignedShort(1162222719) * 836146101;
	    else if (7 == i)
		anInt6275
		    = class241_sub3.readUnsignedByte((byte) -71) * 596201107;
	    else if (i == 8)
		anInt6261
		    = class241_sub3.readUnsignedByte((byte) 82) * -1789637885;
	    else if (10 == i)
		aBool6277 = true;
	    else if (9 == i) {
		aByte6273 = (byte) 3;
		anInt6279 = 476734624;
	    } else if (15 == i) {
		aByte6273 = (byte) 3;
		anInt6279
		    = class241_sub3.readUnsignedShort(1162222719) * -72012251;
	    } else if (i == 16) {
		aByte6273 = (byte) 3;
		anInt6279
		    = class241_sub3.readInt((byte) 110) * -72012251;
	    } else if (40 == i) {
		int i_26_ = class241_sub3.readUnsignedByte((byte) -67);
		aShortArray6265 = new short[i_26_];
		aShortArray6268 = new short[i_26_];
		for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
		    aShortArray6265[i_27_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    aShortArray6268[i_27_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (i == 41) {
		int i_28_ = class241_sub3.readUnsignedByte((byte) 9);
		aShortArray6266 = new short[i_28_];
		aShortArray6269 = new short[i_28_];
		for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
		    aShortArray6266[i_29_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    aShortArray6269[i_29_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (i == 44) {
		int i_30_ = class241_sub3.readUnsignedShort(1162222719);
		int i_31_ = 0;
		for (int i_32_ = i_30_; i_32_ > 0; i_32_ >>= 1)
		    i_31_++;
		aByteArray6270 = new byte[i_31_];
		byte i_33_ = 0;
		for (int i_34_ = 0; i_34_ < i_31_; i_34_++) {
		    if ((i_30_ & 1 << i_34_) > 0) {
			aByteArray6270[i_34_] = i_33_;
			i_33_++;
		    } else
			aByteArray6270[i_34_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_35_ = class241_sub3.readUnsignedShort(1162222719);
		int i_36_ = 0;
		for (int i_37_ = i_35_; i_37_ > 0; i_37_ >>= 1)
		    i_36_++;
		aByteArray6271 = new byte[i_36_];
		byte i_38_ = 0;
		for (int i_39_ = 0; i_39_ < i_36_; i_39_++) {
		    if ((i_35_ & 1 << i_39_) > 0) {
			aByteArray6271[i_39_] = i_38_;
			i_38_++;
		    } else
			aByteArray6271[i_39_] = (byte) -1;
		}
	    } else if (46 == i)
		break;
	} while (false);
    }
    
    void decode/*method10612*/(RSByteBuffer buffer, int opcode, byte i_40_) {
		do {
		    if (opcode == 1) {
		    	defaultModel = buffer.readBigSmart((byte) -88) * 539433671;
		    } else if (2 == opcode) {
		    	anInt6267 = buffer.readBigSmart((byte) 33) * -674679157;
		    } else if (4 == opcode) {
		    	anInt6272 = buffer.readUnsignedShort(1162222719) * -1630979275;
		    } else if (opcode == 5) {
		    	anInt6274 = buffer.readUnsignedShort(1162222719) * 875511389;
		    } else if (6 == opcode) {
		    	anInt6278 = buffer.readUnsignedShort(1162222719) * 836146101;
		    } else if (7 == opcode) {
		    	anInt6275 = buffer.readUnsignedByte((byte) -93) * 596201107;
		    } else if (opcode == 8) {
		    	anInt6261 = buffer.readUnsignedByte((byte) -70) * -1789637885;
		    } else if (10 == opcode) {
		    	aBool6277 = true;
		    } else if (9 == opcode) {
		    	aByte6273 = (byte) 3;
		    	anInt6279 = 476734624;
		    } else if (15 == opcode) {
		    	aByte6273 = (byte) 3;
		    	anInt6279 = buffer.readUnsignedShort(1162222719) * -72012251;
		    } else if (opcode == 16) {
		    	aByte6273 = (byte) 3;
		    	anInt6279 = buffer.readInt((byte) 40) * -72012251;
		    } else if (40 == opcode) {
				int length = buffer.readUnsignedByte((byte) 72);
				aShortArray6265 = new short[length];
				aShortArray6268 = new short[length];
				for (int index = 0; index < length; index++) {
				    aShortArray6265[index] = (short) buffer.readUnsignedShort(1162222719);
				    aShortArray6268[index] = (short) buffer.readUnsignedShort(1162222719);
				}
		    } else if (opcode == 41) {
				int length = buffer.readUnsignedByte((byte) 35);
				aShortArray6266 = new short[length];
				aShortArray6269 = new short[length];
				for (int index = 0; index < length; index++) {
				    aShortArray6266[index] = (short) buffer.readUnsignedShort(1162222719);
				    aShortArray6269[index] = (short) buffer.readUnsignedShort(1162222719);
				}
		    } else if (opcode == 44) {
				int i_45_ = buffer.readUnsignedShort(1162222719);
				int i_46_ = 0;
				for (int i_47_ = i_45_; i_47_ > 0; i_47_ >>= 1) {
					i_46_++;
				}
				aByteArray6270 = new byte[i_46_];
				byte i_48_ = 0;
				for (int i_49_ = 0; i_49_ < i_46_; i_49_++) {
				    if ((i_45_ & 1 << i_49_) > 0) {
						aByteArray6270[i_49_] = i_48_;
						i_48_++;
				    } else {
				    	aByteArray6270[i_49_] = (byte) -1;
				    }
				}
		    } else if (45 == opcode) {
				int i_50_ = buffer.readUnsignedShort(1162222719);
				int i_51_ = 0;
				for (int i_52_ = i_50_; i_52_ > 0; i_52_ >>= 1) {
				    i_51_++;
				}
				aByteArray6271 = new byte[i_51_];
				byte i_53_ = 0;
				for (int i_54_ = 0; i_54_ < i_51_; i_54_++) {
				    if ((i_50_ & 1 << i_54_) > 0) {
						aByteArray6271[i_54_] = i_53_;
						i_53_++;
				    } else {
				    	aByteArray6271[i_54_] = (byte) -1;
				    }
				}
		    } else if (46 == opcode) {
		    	break;
		    }
		} while (false);
    }
    
    final Class89 method10613(Class103 class103, int i, boolean bool,
			      Class166 class166, Class166 class166_55_,
			      int i_56_, int i_57_, int i_58_, int i_59_,
			      int i_60_, int i_61_, int i_62_,
			      Class409 class409, byte i_63_, int i_64_) {
	int i_65_ = i;
	bool = bool & 0 != aByte6273;
	if (class409 != null)
	    i_65_ |= class409.method7356(-1311443881);
	if (anInt6274 * 750749173 != 128)
	    i_65_ |= 0x2;
	if (-115245283 * anInt6272 != 128
	    || -1589640547 * anInt6278 != 0 || i_59_ != 0)
	    i_65_ |= 0x5;
	if (bool)
	    i_65_ |= 0x7;
	Class89 class89;
	synchronized (((GraphicsDefinitionLoader) loader)
		      .aClass129_6255) {
	    class89
		= ((Class89)
		   (((GraphicsDefinitionLoader) loader)
			.aClass129_6255.get
		    ((long) ((graphicsID
			      = (190231187
				 * (graphicsID * -1853998181
				    | class103.anInt1456 * 1931687493 << 29)))
			     * -1853998181))));
	}
	if (class89 == null
	    || class103.method2301(class89.method1866(), i_65_) != 0) {
	    if (null != class89)
		i_65_ = class103.method2302(i_65_, class89.method1866());
	    int i_66_ = i_65_;
	    if (aShortArray6265 != null)
		i_66_ |= 0x4000;
	    if (aShortArray6266 != null)
		i_66_ |= 0x8000;
	    Class161 class161
		= Class161.method3448((((GraphicsDefinitionLoader)
					loader)
				       .graphicsDefContainer),
				      (defaultModel
				       * -1296595209),
				      0);
	    if (null == class161)
		return null;
	    if (class161.anInt1789 < 13)
		class161.method3464(2);
	    class89
		= (class103.method2356
		   (class161, i_66_,
		    -357525597 * (((GraphicsDefinitionLoader) loader)
				  .anInt6253),
		    -173801573 * anInt6275 + 64,
		    850 + -121178197 * anInt6261));
	    if (aShortArray6265 != null) {
		for (int i_67_ = 0;
		     i_67_ < aShortArray6265.length; i_67_++)
		    class89.method1908((aShortArray6265
					[i_67_]),
				       (aShortArray6268
					[i_67_]));
	    }
	    if (aShortArray6266 != null) {
		for (int i_68_ = 0;
		     i_68_ < aShortArray6266.length; i_68_++)
		    class89.method1985((aShortArray6266
					[i_68_]),
				       (aShortArray6269
					[i_68_]));
	    }
	    class89.method1928(i_65_);
	    synchronized (((GraphicsDefinitionLoader) loader)
			  .aClass129_6255) {
		((GraphicsDefinitionLoader) loader)
		    .aClass129_6255.put
		    (class89,
		     (long) ((graphicsID
			      = (190231187
				 * (graphicsID * -1853998181
				    | class103.anInt1456 * 1931687493 << 29)))
			     * -1853998181));
	    }
	}
	Class89 class89_69_ = class89.method2019(i_63_, i_65_, true);
	if (class409 != null)
	    class409.method7357(class89_69_, 0, (byte) -19);
	if (anInt6272 * -115245283 != 128
	    || 750749173 * anInt6274 != 128)
	    class89_69_.method1863(anInt6272 * -115245283,
				   anInt6274 * 750749173,
				   anInt6272 * -115245283);
	if (0 != -1589640547 * anInt6278) {
	    if (90 == anInt6278 * -1589640547)
		i_59_ += 4096;
	    if (180 == anInt6278 * -1589640547)
		i_59_ += 8192;
	    if (270 == anInt6278 * -1589640547)
		i_59_ += 12288;
	}
	if (i_59_ != 0) {
	    i_59_ &= 0x3fff;
	    class89_69_.method1868(i_59_);
	}
	if (bool) {
	    if (null != class166)
		class89_69_.method1875(aByte6273,
				       (-1594016339
					* anInt6279),
				       class166, class166_55_, i_56_, i_57_,
				       i_58_);
	    else {
		if (i_60_ != 0)
		    class89_69_.method1870(i_60_);
		if (0 != i_61_)
		    class89_69_.method1980(i_61_);
		if (i_62_ != 0)
		    class89_69_.method1927(0, i_62_, 0);
	    }
	}
	class89_69_.method1928(i);
	return class89_69_;
    }
    
    public final boolean method10614(int i) {
	if (defaultModel * -1296595209 == -1)
	    return true;
	return (((GraphicsDefinitionLoader) loader)
		    .graphicsDefContainer.method4188
		(defaultModel * -1296595209, 0, -1022818219));
    }
    
    void method10615(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 12);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) 118);
	}
    }
    
    void method10616(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -38);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) 55);
	}
    }
    
    void method10617(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 69);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) 104);
	}
    }
    
    void method10618(RSByteBuffer class241_sub3, int i) {
	do {
	    if (i == 1)
		defaultModel
		    = class241_sub3.readBigSmart((byte) -38) * 539433671;
	    else if (2 == i)
		anInt6267
		    = class241_sub3.readBigSmart((byte) -103) * -674679157;
	    else if (4 == i)
		anInt6272
		    = class241_sub3.readUnsignedShort(1162222719) * -1630979275;
	    else if (i == 5)
		anInt6274
		    = class241_sub3.readUnsignedShort(1162222719) * 875511389;
	    else if (6 == i)
		anInt6278
		    = class241_sub3.readUnsignedShort(1162222719) * 836146101;
	    else if (7 == i)
		anInt6275
		    = class241_sub3.readUnsignedByte((byte) 22) * 596201107;
	    else if (i == 8)
		anInt6261
		    = class241_sub3.readUnsignedByte((byte) 80) * -1789637885;
	    else if (10 == i)
		aBool6277 = true;
	    else if (9 == i) {
		aByte6273 = (byte) 3;
		anInt6279 = 476734624;
	    } else if (15 == i) {
		aByte6273 = (byte) 3;
		anInt6279
		    = class241_sub3.readUnsignedShort(1162222719) * -72012251;
	    } else if (i == 16) {
		aByte6273 = (byte) 3;
		anInt6279
		    = class241_sub3.readInt((byte) 84) * -72012251;
	    } else if (40 == i) {
		int i_70_ = class241_sub3.readUnsignedByte((byte) 28);
		aShortArray6265 = new short[i_70_];
		aShortArray6268 = new short[i_70_];
		for (int i_71_ = 0; i_71_ < i_70_; i_71_++) {
		    aShortArray6265[i_71_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    aShortArray6268[i_71_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (i == 41) {
		int i_72_ = class241_sub3.readUnsignedByte((byte) 16);
		aShortArray6266 = new short[i_72_];
		aShortArray6269 = new short[i_72_];
		for (int i_73_ = 0; i_73_ < i_72_; i_73_++) {
		    aShortArray6266[i_73_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		    aShortArray6269[i_73_]
			= (short) class241_sub3.readUnsignedShort(1162222719);
		}
	    } else if (i == 44) {
		int i_74_ = class241_sub3.readUnsignedShort(1162222719);
		int i_75_ = 0;
		for (int i_76_ = i_74_; i_76_ > 0; i_76_ >>= 1)
		    i_75_++;
		aByteArray6270 = new byte[i_75_];
		byte i_77_ = 0;
		for (int i_78_ = 0; i_78_ < i_75_; i_78_++) {
		    if ((i_74_ & 1 << i_78_) > 0) {
			aByteArray6270[i_78_] = i_77_;
			i_77_++;
		    } else
			aByteArray6270[i_78_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_79_ = class241_sub3.readUnsignedShort(1162222719);
		int i_80_ = 0;
		for (int i_81_ = i_79_; i_81_ > 0; i_81_ >>= 1)
		    i_80_++;
		aByteArray6271 = new byte[i_80_];
		byte i_82_ = 0;
		for (int i_83_ = 0; i_83_ < i_80_; i_83_++) {
		    if ((i_79_ & 1 << i_83_) > 0) {
			aByteArray6271[i_83_] = i_82_;
			i_82_++;
		    } else
			aByteArray6271[i_83_] = (byte) -1;
		}
	    } else if (46 == i)
		break;
	} while (false);
    }
    
    public final Class89 method10619
	(Class103 class103, int i, int i_84_, Class166 class166,
	 Class166 class166_85_, int i_86_, int i_87_, int i_88_,
	 Class409 class409, byte i_89_, byte i_90_) {
	return method10613(class103, i, true, class166, class166_85_, i_86_,
			   i_87_, i_88_, i_84_, 0, 0, 0, class409, i_89_,
			   -1969300759);
    }
    
    public final Class89 method10620(Class103 class103, int i,
				     Class409 class409, byte i_91_) {
	return method10613(class103, i, false, null, null, 0, 0, 0, 0, 0, 0, 0,
			   class409, i_91_, -1941600349);
    }
    
    public final Class89 method10621(Class103 class103, int i,
				     Class409 class409, byte i_92_) {
	return method10613(class103, i, false, null, null, 0, 0, 0, 0, 0, 0, 0,
			   class409, i_92_, -2043386735);
    }
    
    public final Class89 method10622(Class103 class103, int i,
				     Class409 class409, byte i_93_) {
	return method10613(class103, i, false, null, null, 0, 0, 0, 0, 0, 0, 0,
			   class409, i_93_, -2114578342);
    }
    
    public final Class89 method10623(Class103 class103, int i, int i_94_,
				     int i_95_, int i_96_, int i_97_,
				     Class409 class409, byte i_98_) {
	if (aByte6273 != 3)
	    return method10613(class103, i, false, null, null, 0, 0, 0, i_94_,
			       0, 0, 0, class409, i_98_, -2105035086);
	return method10613(class103, i, true, null, null, 0, 0, 0, i_94_,
			   i_95_, i_96_, i_97_, class409, i_98_, -1937177393);
    }
    
    public final Class89 method10624(Class103 class103, int i,
				     Class409 class409, byte i_99_,
				     byte i_100_) {
	return method10613(class103, i, false, null, null, 0, 0, 0, 0, 0, 0, 0,
			   class409, i_99_, -2057507053);
    }
    
    public final Class89 method10625(Class103 class103, int i, int i_101_,
				     Class166 class166, Class166 class166_102_,
				     int i_103_, int i_104_, int i_105_,
				     Class409 class409, byte i_106_) {
	return method10613(class103, i, true, class166, class166_102_, i_103_,
			   i_104_, i_105_, i_101_, 0, 0, 0, class409, i_106_,
			   -1959726682);
    }
    
    public final Class89 method10626(Class103 class103, int i, int i_107_,
				     Class166 class166, Class166 class166_108_,
				     int i_109_, int i_110_, int i_111_,
				     Class409 class409, byte i_112_) {
	return method10613(class103, i, true, class166, class166_108_, i_109_,
			   i_110_, i_111_, i_107_, 0, 0, 0, class409, i_112_,
			   -1942798616);
    }
    
    public final Class89 method10627(Class103 class103, int i, int i_113_,
				     Class166 class166, Class166 class166_114_,
				     int i_115_, int i_116_, int i_117_,
				     Class409 class409, byte i_118_) {
	return method10613(class103, i, true, class166, class166_114_, i_115_,
			   i_116_, i_117_, i_113_, 0, 0, 0, class409, i_118_,
			   -2033674124);
    }
    
    final Class89 method10628(Class103 class103, int i, boolean bool,
			      Class166 class166, Class166 class166_119_,
			      int i_120_, int i_121_, int i_122_, int i_123_,
			      int i_124_, int i_125_, int i_126_,
			      Class409 class409, byte i_127_) {
	int i_128_ = i;
	bool = bool & 0 != aByte6273;
	if (class409 != null)
	    i_128_ |= class409.method7356(1075308445);
	if (anInt6274 * 750749173 != 128)
	    i_128_ |= 0x2;
	if (-115245283 * anInt6272 != 128
	    || -1589640547 * anInt6278 != 0 || i_123_ != 0)
	    i_128_ |= 0x5;
	if (bool)
	    i_128_ |= 0x7;
	Class89 class89;
	synchronized (((GraphicsDefinitionLoader) loader)
		      .aClass129_6255) {
	    class89
		= ((Class89)
		   (((GraphicsDefinitionLoader) loader)
			.aClass129_6255.get
		    ((long) ((graphicsID
			      = (190231187
				 * (graphicsID * -1853998181
				    | class103.anInt1456 * 1931687493 << 29)))
			     * -1853998181))));
	}
	if (class89 == null
	    || class103.method2301(class89.method1866(), i_128_) != 0) {
	    if (null != class89)
		i_128_ = class103.method2302(i_128_, class89.method1866());
	    int i_129_ = i_128_;
	    if (aShortArray6265 != null)
		i_129_ |= 0x4000;
	    if (aShortArray6266 != null)
		i_129_ |= 0x8000;
	    Class161 class161
		= Class161.method3448((((GraphicsDefinitionLoader)
					loader)
				       .graphicsDefContainer),
				      (defaultModel
				       * -1296595209),
				      0);
	    if (null == class161)
		return null;
	    if (class161.anInt1789 < 13)
		class161.method3464(2);
	    class89
		= (class103.method2356
		   (class161, i_129_,
		    -357525597 * (((GraphicsDefinitionLoader) loader)
				  .anInt6253),
		    -173801573 * anInt6275 + 64,
		    850 + -121178197 * anInt6261));
	    if (aShortArray6265 != null) {
		for (int i_130_ = 0;
		     i_130_ < aShortArray6265.length;
		     i_130_++)
		    class89.method1908((aShortArray6265
					[i_130_]),
				       (aShortArray6268
					[i_130_]));
	    }
	    if (aShortArray6266 != null) {
		for (int i_131_ = 0;
		     i_131_ < aShortArray6266.length;
		     i_131_++)
		    class89.method1985((aShortArray6266
					[i_131_]),
				       (aShortArray6269
					[i_131_]));
	    }
	    class89.method1928(i_128_);
	    synchronized (((GraphicsDefinitionLoader) loader)
			  .aClass129_6255) {
		((GraphicsDefinitionLoader) loader)
		    .aClass129_6255.put
		    (class89,
		     (long) ((graphicsID
			      = (190231187
				 * (graphicsID * -1853998181
				    | class103.anInt1456 * 1931687493 << 29)))
			     * -1853998181));
	    }
	}
	Class89 class89_132_ = class89.method2019(i_127_, i_128_, true);
	if (class409 != null)
	    class409.method7357(class89_132_, 0, (byte) -96);
	if (anInt6272 * -115245283 != 128
	    || 750749173 * anInt6274 != 128)
	    class89_132_.method1863(anInt6272 * -115245283,
				    anInt6274 * 750749173,
				    anInt6272 * -115245283);
	if (0 != -1589640547 * anInt6278) {
	    if (90 == anInt6278 * -1589640547)
		i_123_ += 4096;
	    if (180 == anInt6278 * -1589640547)
		i_123_ += 8192;
	    if (270 == anInt6278 * -1589640547)
		i_123_ += 12288;
	}
	if (i_123_ != 0) {
	    i_123_ &= 0x3fff;
	    class89_132_.method1868(i_123_);
	}
	if (bool) {
	    if (null != class166)
		class89_132_.method1875(aByte6273,
					(-1594016339
					 * anInt6279),
					class166, class166_119_, i_120_,
					i_121_, i_122_);
	    else {
		if (i_124_ != 0)
		    class89_132_.method1870(i_124_);
		if (0 != i_125_)
		    class89_132_.method1980(i_125_);
		if (i_126_ != 0)
		    class89_132_.method1927(0, i_126_, 0);
	    }
	}
	class89_132_.method1928(i);
	return class89_132_;
    }
    
    final Class89 method10629(Class103 class103, int i, boolean bool,
			      Class166 class166, Class166 class166_133_,
			      int i_134_, int i_135_, int i_136_, int i_137_,
			      int i_138_, int i_139_, int i_140_,
			      Class409 class409, byte i_141_) {
	int i_142_ = i;
	bool = bool & 0 != aByte6273;
	if (class409 != null)
	    i_142_ |= class409.method7356(-421145273);
	if (anInt6274 * 750749173 != 128)
	    i_142_ |= 0x2;
	if (-115245283 * anInt6272 != 128
	    || -1589640547 * anInt6278 != 0 || i_137_ != 0)
	    i_142_ |= 0x5;
	if (bool)
	    i_142_ |= 0x7;
	Class89 class89;
	synchronized (((GraphicsDefinitionLoader) loader)
		      .aClass129_6255) {
	    class89
		= ((Class89)
		   (((GraphicsDefinitionLoader) loader)
			.aClass129_6255.get
		    ((long) ((graphicsID
			      = (190231187
				 * (graphicsID * -1853998181
				    | class103.anInt1456 * 1931687493 << 29)))
			     * -1853998181))));
	}
	if (class89 == null
	    || class103.method2301(class89.method1866(), i_142_) != 0) {
	    if (null != class89)
		i_142_ = class103.method2302(i_142_, class89.method1866());
	    int i_143_ = i_142_;
	    if (aShortArray6265 != null)
		i_143_ |= 0x4000;
	    if (aShortArray6266 != null)
		i_143_ |= 0x8000;
	    Class161 class161
		= Class161.method3448((((GraphicsDefinitionLoader)
					loader)
				       .graphicsDefContainer),
				      (defaultModel
				       * -1296595209),
				      0);
	    if (null == class161)
		return null;
	    if (class161.anInt1789 < 13)
		class161.method3464(2);
	    class89
		= (class103.method2356
		   (class161, i_143_,
		    -357525597 * (((GraphicsDefinitionLoader) loader)
				  .anInt6253),
		    -173801573 * anInt6275 + 64,
		    850 + -121178197 * anInt6261));
	    if (aShortArray6265 != null) {
		for (int i_144_ = 0;
		     i_144_ < aShortArray6265.length;
		     i_144_++)
		    class89.method1908((aShortArray6265
					[i_144_]),
				       (aShortArray6268
					[i_144_]));
	    }
	    if (aShortArray6266 != null) {
		for (int i_145_ = 0;
		     i_145_ < aShortArray6266.length;
		     i_145_++)
		    class89.method1985((aShortArray6266
					[i_145_]),
				       (aShortArray6269
					[i_145_]));
	    }
	    class89.method1928(i_142_);
	    synchronized (((GraphicsDefinitionLoader) loader)
			  .aClass129_6255) {
		((GraphicsDefinitionLoader) loader)
		    .aClass129_6255.put
		    (class89,
		     (long) ((graphicsID
			      = (190231187
				 * (graphicsID * -1853998181
				    | class103.anInt1456 * 1931687493 << 29)))
			     * -1853998181));
	    }
	}
	Class89 class89_146_ = class89.method2019(i_141_, i_142_, true);
	if (class409 != null)
	    class409.method7357(class89_146_, 0, (byte) 2);
	if (anInt6272 * -115245283 != 128
	    || 750749173 * anInt6274 != 128)
	    class89_146_.method1863(anInt6272 * -115245283,
				    anInt6274 * 750749173,
				    anInt6272 * -115245283);
	if (0 != -1589640547 * anInt6278) {
	    if (90 == anInt6278 * -1589640547)
		i_137_ += 4096;
	    if (180 == anInt6278 * -1589640547)
		i_137_ += 8192;
	    if (270 == anInt6278 * -1589640547)
		i_137_ += 12288;
	}
	if (i_137_ != 0) {
	    i_137_ &= 0x3fff;
	    class89_146_.method1868(i_137_);
	}
	if (bool) {
	    if (null != class166)
		class89_146_.method1875(aByte6273,
					(-1594016339
					 * anInt6279),
					class166, class166_133_, i_134_,
					i_135_, i_136_);
	    else {
		if (i_138_ != 0)
		    class89_146_.method1870(i_138_);
		if (0 != i_139_)
		    class89_146_.method1980(i_139_);
		if (i_140_ != 0)
		    class89_146_.method1927(0, i_140_, 0);
	    }
	}
	class89_146_.method1928(i);
	return class89_146_;
    }
    
    void read/*method10630*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) -69);
		    if (0 == opcode) {
		    	break;
		    }
		    decode(buffer, opcode, (byte) 7);
		}
    }
    
    GraphicsDefinition() {
	anInt6275 = 0;
	anInt6261 = 0;
	aBool6277 = false;
	aByte6273 = (byte) 0;
	anInt6279 = 72012251;
    }
    
    public static Class423[] method10631(int i) {
	return (new Class423[]
		{ Class423.aClass423_6053, Class423.aClass423_6058,
		  Class423.aClass423_6061, Class423.aClass423_6056,
		  Class423.aClass423_6048, Class423.aClass423_6059,
		  Class423.aClass423_6062, Class423.aClass423_6055,
		  Class423.aClass423_6051, Class423.aClass423_6049,
		  Class423.aClass423_6050, Class423.aClass423_6052,
		  Class423.aClass423_6064, Class423.aClass423_6054,
		  Class423.aClass423_6065, Class423.aClass423_6057,
		  Class423.aClass423_6060, Class423.aClass423_6047,
		  Class423.aClass423_6063 });
    }
    
    static final void method10632(ClientScriptData class454, byte i) {
	int i_148_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (client.currentFriendsChatName != null
	    && i_148_ < -612332369 * Class357_Sub1.currentFcSize)
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= Class350.currentFcUsers[i_148_].worldName;
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
    }
}
