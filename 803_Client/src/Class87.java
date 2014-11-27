/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87
{
    int anInt1259;
    static short[] aShortArray1260;
    static short[] aShortArray1261;
    static short[] aShortArray1262;
    static short[] aShortArray1263;
    static byte[] aByteArray1264;
    short[] aShortArray1265;
    short[] aShortArray1266;
    short[] aShortArray1267;
    short[] aShortArray1268;
    short[] aShortArray1269;
    boolean aBool1270;
    boolean aBool1271;
    byte[] aByteArray1272;
    Class241_Sub42 aClass241_Sub42_1273 = null;
    boolean aBool1274;
    static short[] aShortArray1275 = new short[500];
    static final int anInt1276 = 1;
    static final int anInt1277 = 2;
    static final int anInt1278 = 2;
    
    Class87(byte[] is, Class241_Sub42 class241_sub42) {
	((Class87) this).anInt1259 = 0;
	((Class87) this).aBool1270 = false;
	((Class87) this).aBool1274 = false;
	((Class87) this).aBool1271 = false;
	((Class87) this).aClass241_Sub42_1273 = class241_sub42;
	try {
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    RSByteBuffer class241_sub3_0_ = new RSByteBuffer(is);
	    int i = class241_sub3.readUnsignedByte((byte) 11);
	    class241_sub3.pointer += -1362085898;
	    int i_1_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_2_ = 0;
	    int i_3_ = -1;
	    int i_4_ = -1;
	    class241_sub3_0_.pointer
		= (class241_sub3.pointer * 421967667 + i_1_) * -681042949;
	    for (int i_5_ = 0; i_5_ < i_1_; i_5_++) {
		int i_6_
		    = (((Class241_Sub42) ((Class87) this).aClass241_Sub42_1273)
		       .anIntArray10171[i_5_]);
		if (i_6_ == 0)
		    i_3_ = i_5_;
		int i_7_ = class241_sub3.readUnsignedByte((byte) 60);
		if (i_7_ > 0) {
		    if (i_6_ == 0)
			i_4_ = i_5_;
		    aShortArray1275[i_2_] = (short) i_5_;
		    short i_8_ = 0;
		    if (i_6_ == 3 || i_6_ == 10)
			i_8_ = (short) 128;
		    if (i >= 2 && i_6_ == 7) {
			if ((i_7_ & 0x1) != 0) {
			    aShortArray1260[i_2_]
				= (short) class241_sub3_0_
					      .readSmart49152(-1305698547);
			    class241_sub3_0_.readSmart49152(-615502244);
			} else
			    aShortArray1260[i_2_] = i_8_;
			if ((i_7_ & 0x2) != 0) {
			    aShortArray1261[i_2_]
				= (short) class241_sub3_0_
					      .readSmart49152(1102525801);
			    class241_sub3_0_.readSmart49152(200753329);
			} else
			    aShortArray1261[i_2_] = i_8_;
			if ((i_7_ & 0x4) != 0) {
			    aShortArray1262[i_2_]
				= (short) class241_sub3_0_
					      .readSmart49152(324835013);
			    class241_sub3_0_.readSmart49152(972584758);
			} else
			    aShortArray1262[i_2_] = i_8_;
		    } else {
			if ((i_7_ & 0x1) != 0)
			    aShortArray1260[i_2_]
				= (short) class241_sub3_0_
					      .readSmart49152(-895583770);
			else
			    aShortArray1260[i_2_] = i_8_;
			if ((i_7_ & 0x2) != 0)
			    aShortArray1261[i_2_]
				= (short) class241_sub3_0_
					      .readSmart49152(1924757697);
			else
			    aShortArray1261[i_2_] = i_8_;
			if ((i_7_ & 0x4) != 0)
			    aShortArray1262[i_2_]
				= (short) class241_sub3_0_
					      .readSmart49152(1014024974);
			else
			    aShortArray1262[i_2_] = i_8_;
		    }
		    aByteArray1264[i_2_] = (byte) (i_7_ >>> 3 & 0x3);
		    if (i_6_ == 2 || i_6_ == 9) {
			aShortArray1260[i_2_]
			    = (short) (aShortArray1260[i_2_] << 2 & 0x3fff);
			aShortArray1261[i_2_]
			    = (short) (aShortArray1261[i_2_] << 2 & 0x3fff);
			aShortArray1262[i_2_]
			    = (short) (aShortArray1262[i_2_] << 2 & 0x3fff);
		    }
		    aShortArray1263[i_2_] = (short) -1;
		    if (i_6_ == 1 || i_6_ == 2 || i_6_ == 3) {
			if (i_3_ > i_4_) {
			    aShortArray1263[i_2_] = (short) i_3_;
			    i_4_ = i_3_;
			}
		    } else if (i_6_ == 5)
			((Class87) this).aBool1270 = true;
		    else if (i_6_ == 7)
			((Class87) this).aBool1274 = true;
		    else if (i_6_ == 9 || i_6_ == 10 || i_6_ == 8)
			((Class87) this).aBool1271 = true;
		    i_2_++;
		}
	    }
	    if (class241_sub3_0_.pointer * 421967667 != is.length)
		throw new RuntimeException();
	    ((Class87) this).anInt1259 = i_2_;
	    ((Class87) this).aShortArray1266 = new short[i_2_];
	    ((Class87) this).aShortArray1268 = new short[i_2_];
	    ((Class87) this).aShortArray1267 = new short[i_2_];
	    ((Class87) this).aShortArray1269 = new short[i_2_];
	    ((Class87) this).aShortArray1265 = new short[i_2_];
	    ((Class87) this).aByteArray1272 = new byte[i_2_];
	    for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
		((Class87) this).aShortArray1266[i_9_] = aShortArray1275[i_9_];
		((Class87) this).aShortArray1268[i_9_] = aShortArray1260[i_9_];
		((Class87) this).aShortArray1267[i_9_] = aShortArray1261[i_9_];
		((Class87) this).aShortArray1269[i_9_] = aShortArray1262[i_9_];
		((Class87) this).aShortArray1265[i_9_] = aShortArray1263[i_9_];
		((Class87) this).aByteArray1272[i_9_] = aByteArray1264[i_9_];
	    }
	} catch (Exception exception) {
	    ((Class87) this).anInt1259 = 0;
	    ((Class87) this).aBool1270 = false;
	    ((Class87) this).aBool1274 = false;
	}
    }
    
    static {
	aShortArray1260 = new short[500];
	aShortArray1261 = new short[500];
	aShortArray1262 = new short[500];
	aShortArray1263 = new short[500];
	aByteArray1264 = new byte[500];
    }
}
