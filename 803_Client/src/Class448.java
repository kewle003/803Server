/* Class448 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class448 implements Interface47
{
    public static Class448 aClass448_6184;
    public static Class448 aClass448_6185;
    public static Class448 aClass448_6186;
    public byte aByte6187;
    public static Class448 aClass448_6188;
    public int anInt6189;
    public static final int anInt6190 = 4;
    public static Class448 aClass448_6191 = new Class448(0, (byte) -1);
    static JS5 aClass210_6192;
    
    public int getId(byte i) {
	return aByte6187;
    }
    
    public int method10() {
	return aByte6187;
    }
    
    public int method7917(int i) {
	return aByte6187 + 1;
    }
    
    public static Class448[] method7918() {
	return new Class448[] { aClass448_6191, aClass448_6185, aClass448_6186,
				aClass448_6184, aClass448_6188 };
    }
    
    public int method9() {
	return aByte6187;
    }
    
    public static Class448[] method7919() {
	return new Class448[] { aClass448_6191, aClass448_6185, aClass448_6186,
				aClass448_6184, aClass448_6188 };
    }
    
    public int method11() {
	return aByte6187;
    }
    
    public int method147() {
	return aByte6187;
    }
    
    static {
	aClass448_6185 = new Class448(1, (byte) 0);
	aClass448_6186 = new Class448(2, (byte) 1);
	aClass448_6184 = new Class448(3, (byte) 2);
	aClass448_6188 = new Class448(4, (byte) 3);
    }
    
    Class448(int i, byte i_0_) {
	anInt6189 = 1291836503 * i;
	aByte6187 = i_0_;
    }
    
    public static Class448[] method7920() {
	return new Class448[] { aClass448_6191, aClass448_6185, aClass448_6186,
				aClass448_6184, aClass448_6188 };
    }
    
    public int method7921() {
	return aByte6187 + 1;
    }
    
    static int[] method7922(Class241_Sub27 class241_sub27, int i) {
		RSByteBuffer secureBuffer = new RSByteBuffer(518);
		int[] is = new int[4];
		for (int i_1_ = 0; i_1_ < 4; i_1_++)
		    is[i_1_] = (int) (Math.random() * 9.9999999E7);
		secureBuffer.writeByte(10, 53754097);
		secureBuffer.writeInt(is[0], 382309749);
		secureBuffer.writeInt(is[1], -350435427);
		secureBuffer.writeInt(is[2], 276960381);
		secureBuffer.writeInt(is[3], -664919511);
		for (int i_2_ = 0; i_2_ < 10; i_2_++)
			secureBuffer.writeInt((int) (Math.random() * 9.9999999E7),
					      1155582147);
		secureBuffer.writeShort((int) (Math.random() * 9.9999999E7),
					  -484048531);
		secureBuffer.applyRSA(RSAKeys.LOGIN_PUBLIC_KEY,
					  RSAKeys.LOGIN_MODULUS, (byte) -1);
		class241_sub27.data.writeBytes(
				secureBuffer.payload, 0,
		    	secureBuffer.pointer * 421967667, 752061035);
		return is;
    }
    
    static final int method7923(int i, byte i_3_) {
		return i >> 11 & 0x7f;
    }
    
    public static void method7924(int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8869, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub26_8870, 2,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub35_8859, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub7_8865, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8881, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852, 0,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub15_8851, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub8_8856,
	     Class71.aClass71_1088.anInt1093 * -915921191, (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub20_8854, 0,
	     (byte) 2);
	if (Class236.aClass103_2713 != null
	    && Class236.aClass103_2713.method2361()
	    && Class236.aClass103_2713.method2331())
	    Class236.aClass103_2713.method2235();
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub5_8886, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850, 1,
	     (byte) 2);
	Class40.method1042(1136763997);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub24_8871, 1,
	     (byte) 2);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887, 3,
	     (byte) 2);
	Class561.method12369(262144);
	client.aClass238_8477.method4833(20253145).method11400(-882745621);
	client.aBool8307 = true;
    }
}
