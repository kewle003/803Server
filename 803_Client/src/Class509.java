/* Class509 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class509
{
    static Class507_Sub1[] aClass507_Sub1Array6676;
    static final int anInt6677 = 1;
    static final int anInt6678 = -1;
    static final int anInt6679 = 2;
    static boolean aBool6680 = false;
    public static int anInt6681;
    public static int anInt6682;
    
    public static Class507_Sub1 method11516(int i) {
	if (!aBool6680 || i < Class120_Sub15.anInt10541 * 1652918313
	    || i > -505875311 * anInt6681)
	    return null;
	return (aClass507_Sub1Array6676
		[i - 1652918313 * Class120_Sub15.anInt10541]);
    }
    
    public static Class507_Sub1 method11517(int i) {
	if (!aBool6680 || i < Class120_Sub15.anInt10541 * 1652918313
	    || i > -505875311 * anInt6681)
	    return null;
	return (aClass507_Sub1Array6676
		[i - 1652918313 * Class120_Sub15.anInt10541]);
    }
    
    public static Class507_Sub1 method11518(int i) {
	if (!aBool6680 || i < Class120_Sub15.anInt10541 * 1652918313
	    || i > -505875311 * anInt6681)
	    return null;
	return (aClass507_Sub1Array6676
		[i - 1652918313 * Class120_Sub15.anInt10541]);
    }
    
    public static Class507_Sub1 method11519(int i) {
	if (!aBool6680 || i < Class120_Sub15.anInt10541 * 1652918313
	    || i > -505875311 * anInt6681)
	    return null;
	return (aClass507_Sub1Array6676
		[i - 1652918313 * Class120_Sub15.anInt10541]);
    }
    
    public static boolean method11520(byte[] is) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	int i = class241_sub3.readUnsignedByte((byte) -32);
	if (i != 2)
	    return false;
	boolean bool = class241_sub3.readUnsignedByte((byte) -50) == 1;
	if (bool)
	    SkillData.method11326(class241_sub3, (short) -20992);
	Class52.method1289(class241_sub3, (byte) 2);
	return true;
    }
    
    Class509() throws Throwable {
	throw new Error();
    }
    
    public static boolean method11521(byte[] is) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	int i = class241_sub3.readUnsignedByte((byte) -51);
	if (i != 2)
	    return false;
	boolean bool = class241_sub3.readUnsignedByte((byte) -108) == 1;
	if (bool)
	    SkillData.method11326(class241_sub3, (short) -11340);
	Class52.method1289(class241_sub3, (byte) -87);
	return true;
    }
    
    static void method11522(RSByteBuffer class241_sub3) {
	for (int i = 0; i < 1153743561 * Class212.anInt2507; i++) {
	    int i_0_ = class241_sub3.readSmart((short) -27490);
	    int i_1_ = class241_sub3.readUnsignedShort(1162222719);
	    if (i_1_ == 65535)
		i_1_ = -1;
	    if (null != aClass507_Sub1Array6676[i_0_])
		aClass507_Sub1Array6676[i_0_].anInt6669 = i_1_ * -857794107;
	}
    }
    
    static void method11523(RSByteBuffer class241_sub3) {
	for (int i = 0; i < 1153743561 * Class212.anInt2507; i++) {
	    int i_2_ = class241_sub3.readSmart((short) -14691);
	    int i_3_ = class241_sub3.readUnsignedShort(1162222719);
	    if (i_3_ == 65535)
		i_3_ = -1;
	    if (null != aClass507_Sub1Array6676[i_2_])
		aClass507_Sub1Array6676[i_2_].anInt6669 = i_3_ * -857794107;
	}
    }
    
    static void method11524(RSByteBuffer class241_sub3) {
	for (int i = 0; i < 1153743561 * Class212.anInt2507; i++) {
	    int i_4_ = class241_sub3.readSmart((short) -26901);
	    int i_5_ = class241_sub3.readUnsignedShort(1162222719);
	    if (i_5_ == 65535)
		i_5_ = -1;
	    if (null != aClass507_Sub1Array6676[i_4_])
		aClass507_Sub1Array6676[i_4_].anInt6669 = i_5_ * -857794107;
	}
    }
    
    static final void method11525(ClientScriptData class454, int i) {
	if (11 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4073,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    client.aClass190_8339.sendPacket(class241_sub27, -1580235914);
	}
    }
    
    static final void method11526(int i) {
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	Class287 class287
	    = Class445_Sub16.aClass351_Sub1_8660.method6288(617526823);
	Class462.anInt6284
	    = 1680747237 * ((int) class287.aFloat4477
			    - (127679513 * class522.baseX << 9));
	Class175.anInt2123 = -1365297795 * -(int) class287.aFloat4474;
	Class636.anInt8248
	    = ((int) class287.aFloat4479
	       - (468558693 * class522.baseY << 9)) * -1181860511;
	Class496.anInt6527
	    = ((int) ((double) Class445_Sub16.aClass351_Sub1_8660
				   .method6291((byte) 2)
		      * 2607.5945876176133)
	       & 0x3fff) * 709117373;
	Class322.anInt4909
	    = ((int) ((double) Class445_Sub16.aClass351_Sub1_8660
				   .method6292((byte) 66)
		      * 2607.5945876176133)
	       & 0x3fff) * 2118136689;
	Class120_Sub18.anInt10605 = 0;
    }
}
