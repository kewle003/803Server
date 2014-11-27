/* Class241_Sub40_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class Class241_Sub40_Sub3 extends Class241_Sub40
{
    float aFloat10905;
    static final int anInt10906 = 0;
    int anInt10907;
    int anInt10908;
    String aString10909;
    String aString10910;
    float aFloat10911;
    String aString10912;
    static final int anInt10913 = 128;
    
    Class241_Sub40_Sub3(OggStreamState oggstreamstate) {
	super(oggstreamstate);
    }
    
    void method16447(OggPacket oggpacket, int i) {
	if (((Class241_Sub40_Sub3) this).anInt10151 * 647070621 <= 0
	    || "SUB".equals(((Class241_Sub40_Sub3) this).aString10912)) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(oggpacket.getData());
	    int i_0_ = class241_sub3.readUnsignedByte((byte) -93);
	    if (647070621 * ((Class241_Sub40_Sub3) this).anInt10151 <= 8) {
		if (0 == (i_0_ | 0x80))
		    throw new IllegalStateException();
		if (0 == ((Class241_Sub40_Sub3) this).anInt10151 * 647070621) {
		    class241_sub3.pointer += 1515881357;
		    ((Class241_Sub40_Sub3) this).anInt10907
			= class241_sub3.method14764((byte) -11) * 490889739;
		    ((Class241_Sub40_Sub3) this).anInt10908
			= class241_sub3.method14764((byte) -40) * 1379740615;
		    if ((((Class241_Sub40_Sub3) this).anInt10907 * 1464441251
			 == 0)
			|| 0 == (2099324407
				 * ((Class241_Sub40_Sub3) this).anInt10908))
			throw new IllegalStateException();
		    RSByteBuffer class241_sub3_1_ = new RSByteBuffer(16);
		    class241_sub3.readBytes(class241_sub3_1_.payload,
					      0, 16, (byte) -8);
		    ((Class241_Sub40_Sub3) this).aString10909
			= class241_sub3_1_.readString(1345455323);
		    class241_sub3_1_.pointer = 0;
		    class241_sub3.readBytes(class241_sub3_1_.payload,
					      0, 16, (byte) -19);
		    ((Class241_Sub40_Sub3) this).aString10912
			= class241_sub3_1_.readString(993402716);
		}
	    } else {
		if (0 == i_0_) {
		    long l = class241_sub3.method14720((byte) 57);
		    long l_2_ = class241_sub3.method14720((byte) 11);
		    long l_3_ = class241_sub3.method14720((byte) 27);
		    if (l < 0L || l_2_ < 0L || l_3_ < 0L || l_3_ > l)
			throw new IllegalStateException();
		    ((Class241_Sub40_Sub3) this).aFloat10911
			= ((float) ((long) (2099324407
					    * (((Class241_Sub40_Sub3) this)
					       .anInt10908))
				    * l)
			   / (float) (((Class241_Sub40_Sub3) this).anInt10907
				      * 1464441251));
		    ((Class241_Sub40_Sub3) this).aFloat10905
			= ((float) ((long) (2099324407
					    * (((Class241_Sub40_Sub3) this)
					       .anInt10908))
				    * (l + l_2_))
			   / (float) (((Class241_Sub40_Sub3) this).anInt10907
				      * 1464441251));
		    int i_4_ = class241_sub3.method14764((byte) 32);
		    if (i_4_ < 0
			|| i_4_ > (class241_sub3.payload.length
				   - 421967667 * class241_sub3.pointer))
			throw new IllegalStateException();
		    ((Class241_Sub40_Sub3) this).aString10910
			= Friend.method864(class241_sub3.payload,
					    (421967667
					     * class241_sub3.pointer),
					    i_4_, 1264476317);
		}
		if (0 != (i_0_ | 0x80))
		    return;
	    }
	}
    }
    
    String method17240(int i) {
	return ((Class241_Sub40_Sub3) this).aString10909;
    }
    
    void method16442(OggPacket oggpacket) {
	if (((Class241_Sub40_Sub3) this).anInt10151 * 647070621 <= 0
	    || "SUB".equals(((Class241_Sub40_Sub3) this).aString10912)) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(oggpacket.getData());
	    int i = class241_sub3.readUnsignedByte((byte) -92);
	    if (647070621 * ((Class241_Sub40_Sub3) this).anInt10151 <= 8) {
		if (0 == (i | 0x80))
		    throw new IllegalStateException();
		if (0 == ((Class241_Sub40_Sub3) this).anInt10151 * 647070621) {
		    class241_sub3.pointer += 1515881357;
		    ((Class241_Sub40_Sub3) this).anInt10907
			= class241_sub3.method14764((byte) -11) * 490889739;
		    ((Class241_Sub40_Sub3) this).anInt10908
			= class241_sub3.method14764((byte) -100) * 1379740615;
		    if ((((Class241_Sub40_Sub3) this).anInt10907 * 1464441251
			 == 0)
			|| 0 == (2099324407
				 * ((Class241_Sub40_Sub3) this).anInt10908))
			throw new IllegalStateException();
		    RSByteBuffer class241_sub3_5_ = new RSByteBuffer(16);
		    class241_sub3.readBytes(class241_sub3_5_.payload,
					      0, 16, (byte) 102);
		    ((Class241_Sub40_Sub3) this).aString10909
			= class241_sub3_5_.readString(-1150672430);
		    class241_sub3_5_.pointer = 0;
		    class241_sub3.readBytes(class241_sub3_5_.payload,
					      0, 16, (byte) 1);
		    ((Class241_Sub40_Sub3) this).aString10912
			= class241_sub3_5_.readString(-1575847583);
		}
	    } else {
		if (0 == i) {
		    long l = class241_sub3.method14720((byte) 37);
		    long l_6_ = class241_sub3.method14720((byte) 33);
		    long l_7_ = class241_sub3.method14720((byte) 76);
		    if (l < 0L || l_6_ < 0L || l_7_ < 0L || l_7_ > l)
			throw new IllegalStateException();
		    ((Class241_Sub40_Sub3) this).aFloat10911
			= ((float) ((long) (2099324407
					    * (((Class241_Sub40_Sub3) this)
					       .anInt10908))
				    * l)
			   / (float) (((Class241_Sub40_Sub3) this).anInt10907
				      * 1464441251));
		    ((Class241_Sub40_Sub3) this).aFloat10905
			= ((float) ((long) (2099324407
					    * (((Class241_Sub40_Sub3) this)
					       .anInt10908))
				    * (l + l_6_))
			   / (float) (((Class241_Sub40_Sub3) this).anInt10907
				      * 1464441251));
		    int i_8_ = class241_sub3.method14764((byte) -41);
		    if (i_8_ < 0
			|| i_8_ > (class241_sub3.payload.length
				   - 421967667 * class241_sub3.pointer))
			throw new IllegalStateException();
		    ((Class241_Sub40_Sub3) this).aString10910
			= Friend.method864(class241_sub3.payload,
					    (421967667
					     * class241_sub3.pointer),
					    i_8_, 1264476317);
		}
		if (0 != (i | 0x80))
		    return;
	    }
	}
    }
    
    public float method17241(int i) {
	return ((Class241_Sub40_Sub3) this).aFloat10905;
    }
    
    public String method17242(byte i) {
	return ((Class241_Sub40_Sub3) this).aString10910;
    }
    
    void method16445(int i) {
	/* empty */
    }
    
    void method16446(OggPacket oggpacket) {
	if (((Class241_Sub40_Sub3) this).anInt10151 * 647070621 <= 0
	    || "SUB".equals(((Class241_Sub40_Sub3) this).aString10912)) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(oggpacket.getData());
	    int i = class241_sub3.readUnsignedByte((byte) -33);
	    if (647070621 * ((Class241_Sub40_Sub3) this).anInt10151 <= 8) {
		if (0 == (i | 0x80))
		    throw new IllegalStateException();
		if (0 == ((Class241_Sub40_Sub3) this).anInt10151 * 647070621) {
		    class241_sub3.pointer += 1515881357;
		    ((Class241_Sub40_Sub3) this).anInt10907
			= class241_sub3.method14764((byte) -48) * 490889739;
		    ((Class241_Sub40_Sub3) this).anInt10908
			= class241_sub3.method14764((byte) -27) * 1379740615;
		    if ((((Class241_Sub40_Sub3) this).anInt10907 * 1464441251
			 == 0)
			|| 0 == (2099324407
				 * ((Class241_Sub40_Sub3) this).anInt10908))
			throw new IllegalStateException();
		    RSByteBuffer class241_sub3_9_ = new RSByteBuffer(16);
		    class241_sub3.readBytes(class241_sub3_9_.payload,
					      0, 16, (byte) 2);
		    ((Class241_Sub40_Sub3) this).aString10909
			= class241_sub3_9_.readString(-1865996241);
		    class241_sub3_9_.pointer = 0;
		    class241_sub3.readBytes(class241_sub3_9_.payload,
					      0, 16, (byte) 5);
		    ((Class241_Sub40_Sub3) this).aString10912
			= class241_sub3_9_.readString(-418818327);
		}
	    } else {
		if (0 == i) {
		    long l = class241_sub3.method14720((byte) 3);
		    long l_10_ = class241_sub3.method14720((byte) 38);
		    long l_11_ = class241_sub3.method14720((byte) 65);
		    if (l < 0L || l_10_ < 0L || l_11_ < 0L || l_11_ > l)
			throw new IllegalStateException();
		    ((Class241_Sub40_Sub3) this).aFloat10911
			= ((float) ((long) (2099324407
					    * (((Class241_Sub40_Sub3) this)
					       .anInt10908))
				    * l)
			   / (float) (((Class241_Sub40_Sub3) this).anInt10907
				      * 1464441251));
		    ((Class241_Sub40_Sub3) this).aFloat10905
			= ((float) ((long) (2099324407
					    * (((Class241_Sub40_Sub3) this)
					       .anInt10908))
				    * (l + l_10_))
			   / (float) (((Class241_Sub40_Sub3) this).anInt10907
				      * 1464441251));
		    int i_12_ = class241_sub3.method14764((byte) 1);
		    if (i_12_ < 0
			|| i_12_ > (class241_sub3.payload.length
				    - 421967667 * class241_sub3.pointer))
			throw new IllegalStateException();
		    ((Class241_Sub40_Sub3) this).aString10910
			= Friend.method864(class241_sub3.payload,
					    (421967667
					     * class241_sub3.pointer),
					    i_12_, 1264476317);
		}
		if (0 != (i | 0x80))
		    return;
	    }
	}
    }
    
    String method17243() {
	return ((Class241_Sub40_Sub3) this).aString10909;
    }
    
    void method16444() {
	/* empty */
    }
    
    public String method17244() {
	return ((Class241_Sub40_Sub3) this).aString10910;
    }
    
    public float method17245() {
	return ((Class241_Sub40_Sub3) this).aFloat10911;
    }
    
    public float method17246(int i) {
	return ((Class241_Sub40_Sub3) this).aFloat10911;
    }
    
    public float method17247() {
	return ((Class241_Sub40_Sub3) this).aFloat10911;
    }
    
    public float method17248() {
	return ((Class241_Sub40_Sub3) this).aFloat10905;
    }
    
    public String method17249() {
	return ((Class241_Sub40_Sub3) this).aString10910;
    }
    
    public String method17250() {
	return ((Class241_Sub40_Sub3) this).aString10910;
    }
    
    public float method17251() {
	return ((Class241_Sub40_Sub3) this).aFloat10911;
    }
}
