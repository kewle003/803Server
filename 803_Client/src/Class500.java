/* Class500 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class500
{
    Class88 aClass88_6564;
    int anInt6565;
    float aFloat6566;
    float aFloat6567;
    float aFloat6568;
    float aFloat6569;
    int anInt6570;
    float aFloat6571;
    float aFloat6572;
    float aFloat6573;
    Class287 aClass287_6574;
    Class589 aClass589_6575;
    float aFloat6576 = 1.0F;
    int anInt6577;
    float aFloat6578;
    float aFloat6579;
    float aFloat6580;
    int[] anIntArray6581;
    float[] aFloatArray6582;
    
    public void method11337(RSByteBuffer class241_sub3, Class501 class501,
			    byte i) {
	int i_0_ = class241_sub3.readUnsignedByte((byte) -25);
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864
		.method14500(1681571114) == 1
	    && Class236.aClass103_2713.method2315() > 0) {
	    if ((i_0_ & Class481.aClass481_6454.anInt6452 * -983461933) != 0)
		((Class500) this).anInt6577
		    = class241_sub3.readInt((byte) 119) * 1072059061;
	    else
		((Class500) this).anInt6577 = 1964617035;
	    if ((i_0_ & Class481.aClass481_6455.anInt6452 * -983461933) != 0)
		((Class500) this).aFloat6573
		    = (float) class241_sub3.readUnsignedShort(1162222719) / 256.0F;
	    else
		((Class500) this).aFloat6573 = 1.1523438F;
	    if ((i_0_ & Class481.aClass481_6442.anInt6452 * -983461933) != 0)
		((Class500) this).aFloat6566
		    = (float) class241_sub3.readUnsignedShort(1162222719) / 256.0F;
	    else
		((Class500) this).aFloat6566 = 0.69921875F;
	    if ((i_0_ & Class481.aClass481_6444.anInt6452 * -983461933) != 0)
		((Class500) this).aFloat6567
		    = (float) class241_sub3.readUnsignedShort(1162222719) / 256.0F;
	    else
		((Class500) this).aFloat6567 = 1.2F;
	} else {
	    if ((i_0_ & -983461933 * Class481.aClass481_6454.anInt6452) != 0)
		class241_sub3.readInt((byte) 28);
	    if (0 != (i_0_ & Class481.aClass481_6455.anInt6452 * -983461933))
		class241_sub3.readUnsignedShort(1162222719);
	    if (0 != (i_0_ & Class481.aClass481_6442.anInt6452 * -983461933))
		class241_sub3.readUnsignedShort(1162222719);
	    if ((i_0_ & -983461933 * Class481.aClass481_6444.anInt6452) != 0)
		class241_sub3.readUnsignedShort(1162222719);
	    ((Class500) this).anInt6577 = 1964617035;
	    ((Class500) this).aFloat6567 = 1.2F;
	    ((Class500) this).aFloat6566 = 0.69921875F;
	    ((Class500) this).aFloat6573 = 1.1523438F;
	}
	if (0 != (i_0_ & Class481.aClass481_6441.anInt6452 * -983461933))
	    ((Class500) this).aClass287_6574
		= Class287.method5561((float) class241_sub3
						  .readShort((byte) 57),
				      (float) class241_sub3
						  .readShort((byte) 72),
				      (float) class241_sub3
						  .readShort((byte) 115));
	else
	    ((Class500) this).aClass287_6574
		= Class287.method5561(-50.0F, -60.0F, -50.0F);
	if (0 != (i_0_ & Class481.aClass481_6445.anInt6452 * -983461933))
	    ((Class500) this).anInt6565
		= class241_sub3.readInt((byte) 88) * 109110291;
	else
	    ((Class500) this).anInt6565 = 511437944;
	if ((i_0_ & Class481.aClass481_6446.anInt6452 * -983461933) != 0)
	    ((Class500) this).anInt6570
		= class241_sub3.readUnsignedShort(1162222719) * -1591825827;
	else
	    ((Class500) this).anInt6570 = 0;
	if (0 != (i_0_ & -983461933 * Class481.aClass481_6447.anInt6452)) {
	    int i_1_ = class241_sub3.readUnsignedShort(1162222719);
	    ((Class500) this).aClass88_6564
		= class501.method11413(i_1_, -16777216);
	} else
	    ((Class500) this).aClass88_6564 = Class501.aClass88_6589;
    }
    
    public Class500(RSByteBuffer class241_sub3, Class501 class501) {
	((Class500) this).aFloat6571 = 0.0F;
	((Class500) this).aFloat6578 = 1.0F;
	((Class500) this).aFloat6569 = 0.0F;
	((Class500) this).aFloat6580 = 1.0F;
	((Class500) this).anIntArray6581 = new int[] { -1, -1, -1 };
	((Class500) this).aFloatArray6582 = new float[] { 0.0F, 0.0F, 0.0F };
	method11337(class241_sub3, class501, (byte) 1);
    }
    
    void method11338(int i) {
	((Class500) this).anInt6577 = 1964617035;
	((Class500) this).aClass287_6574
	    = Class287.method5561(-50.0F, -60.0F, -50.0F);
	((Class500) this).aFloat6573 = 1.1523438F;
	((Class500) this).aFloat6566 = 0.69921875F;
	((Class500) this).aFloat6567 = 1.2F;
	((Class500) this).anInt6565 = 511437944;
	((Class500) this).anInt6570 = 0;
	((Class500) this).aClass88_6564 = Class501.aClass88_6589;
	((Class500) this).aFloat6572 = 1.0F;
	((Class500) this).aFloat6579 = 0.25F;
	((Class500) this).aFloat6568 = 1.0F;
	((Class500) this).aClass589_6575 = Class501.aClass589_6585;
	((Class500) this).aFloat6576 = 1.0F;
	((Class500) this).aFloat6571 = 0.0F;
	((Class500) this).aFloat6578 = 1.0F;
	((Class500) this).aFloat6569 = 0.0F;
	((Class500) this).aFloat6580 = 1.0F;
	int[] is = ((Class500) this).anIntArray6581;
	int[] is_2_ = ((Class500) this).anIntArray6581;
	((Class500) this).anIntArray6581[2] = -1;
	is_2_[1] = -1;
	is[0] = -1;
	float[] fs = ((Class500) this).aFloatArray6582;
	float[] fs_3_ = ((Class500) this).aFloatArray6582;
	((Class500) this).aFloatArray6582[2] = 0.0F;
	fs_3_[1] = 0.0F;
	fs[0] = 0.0F;
    }
    
    void method11339(Class500 class500_4_, byte i) {
	((Class500) this).anInt6577 = 1 * ((Class500) class500_4_).anInt6577;
	((Class500) this).aFloat6573 = ((Class500) class500_4_).aFloat6573;
	((Class500) this).aFloat6566 = ((Class500) class500_4_).aFloat6566;
	((Class500) this).aFloat6567 = ((Class500) class500_4_).aFloat6567;
	((Class500) this).aClass287_6574
	    .method5655(((Class500) class500_4_).aClass287_6574);
	((Class500) this).anInt6565 = ((Class500) class500_4_).anInt6565 * 1;
	((Class500) this).anInt6570 = ((Class500) class500_4_).anInt6570 * 1;
	((Class500) this).aClass88_6564
	    = ((Class500) class500_4_).aClass88_6564;
	((Class500) this).aFloat6572 = ((Class500) class500_4_).aFloat6572;
	((Class500) this).aFloat6579 = ((Class500) class500_4_).aFloat6579;
	((Class500) this).aFloat6568 = ((Class500) class500_4_).aFloat6568;
	((Class500) this).aClass589_6575
	    = ((Class500) class500_4_).aClass589_6575;
	((Class500) this).aFloat6576 = ((Class500) class500_4_).aFloat6576;
	((Class500) this).aFloat6571 = ((Class500) class500_4_).aFloat6571;
	((Class500) this).aFloat6578 = ((Class500) class500_4_).aFloat6578;
	((Class500) this).aFloat6569 = ((Class500) class500_4_).aFloat6569;
	((Class500) this).aFloat6580 = ((Class500) class500_4_).aFloat6580;
	((Class500) this).anIntArray6581[0]
	    = ((Class500) class500_4_).anIntArray6581[0];
	((Class500) this).anIntArray6581[1]
	    = ((Class500) class500_4_).anIntArray6581[1];
	((Class500) this).anIntArray6581[2]
	    = ((Class500) class500_4_).anIntArray6581[2];
	((Class500) this).aFloatArray6582[0]
	    = ((Class500) class500_4_).aFloatArray6582[0];
	((Class500) this).aFloatArray6582[1]
	    = ((Class500) class500_4_).aFloatArray6582[1];
	((Class500) this).aFloatArray6582[2]
	    = ((Class500) class500_4_).aFloatArray6582[2];
    }
    
    public void method11340(RSByteBuffer class241_sub3, Class501 class501) {
	int i = class241_sub3.readUnsignedShort(1162222719);
	int i_5_ = class241_sub3.readShort((byte) 115);
	int i_6_ = class241_sub3.readShort((byte) 126);
	int i_7_ = class241_sub3.readShort((byte) 87);
	int i_8_ = class241_sub3.readUnsignedShort(1162222719);
	client.anInt8468 = 2138879237 * i_8_;
	((Class500) this).aClass589_6575
	    = class501.method11399(i, i_5_, i_6_, i_7_, 1230898968);
    }
    
    void method11341(RSByteBuffer class241_sub3, int i, byte i_9_) {
	((Class500) this).anIntArray6581[i]
	    = class241_sub3.readUnsignedShort(1162222719);
	((Class500) this).aFloatArray6582[i]
	    = class241_sub3.method14650(-1457037737);
    }
    
    public void method11342(RSByteBuffer class241_sub3, short i) {
	((Class500) this).aFloat6572 = class241_sub3.method14650(-1436582414);
	((Class500) this).aFloat6579 = class241_sub3.method14650(-353693059);
	((Class500) this).aFloat6568 = class241_sub3.method14650(-2143465761);
    }
    
    public void method11343(RSByteBuffer class241_sub3, int i) {
	method11341(class241_sub3, 0, (byte) 36);
    }
    
    public int method11344() {
	return ((Class500) this).anInt6565 * 128091675;
    }
    
    void method11345(RSByteBuffer class241_sub3, int i) {
	((Class500) this).anIntArray6581[i]
	    = class241_sub3.readUnsignedShort(1162222719);
	((Class500) this).aFloatArray6582[i]
	    = class241_sub3.method14650(-684111417);
    }
    
    boolean method11346(Class500 class500_10_, byte i) {
	return ((14388125 * ((Class500) class500_10_).anInt6577
		 == 14388125 * ((Class500) this).anInt6577)
		&& (((Class500) this).aFloat6573
		    == ((Class500) class500_10_).aFloat6573)
		&& (((Class500) class500_10_).aFloat6566
		    == ((Class500) this).aFloat6566)
		&& (((Class500) class500_10_).aFloat6567
		    == ((Class500) this).aFloat6567)
		&& (((Class500) class500_10_).aFloat6579
		    == ((Class500) this).aFloat6579)
		&& (((Class500) class500_10_).aFloat6572
		    == ((Class500) this).aFloat6572)
		&& (((Class500) class500_10_).aFloat6568
		    == ((Class500) this).aFloat6568)
		&& (128091675 * ((Class500) class500_10_).anInt6565
		    == 128091675 * ((Class500) this).anInt6565)
		&& (((Class500) this).anInt6570 * 1402305013
		    == ((Class500) class500_10_).anInt6570 * 1402305013)
		&& (((Class500) this).aClass88_6564
		    == ((Class500) class500_10_).aClass88_6564)
		&& (((Class500) class500_10_).aClass589_6575
		    == ((Class500) this).aClass589_6575)
		&& (((Class500) class500_10_).aFloat6576
		    == ((Class500) this).aFloat6576)
		&& (((Class500) this).aFloat6571
		    == ((Class500) class500_10_).aFloat6571)
		&& (((Class500) this).aFloat6578
		    == ((Class500) class500_10_).aFloat6578)
		&& (((Class500) class500_10_).aFloat6569
		    == ((Class500) this).aFloat6569)
		&& (((Class500) this).aFloat6580
		    == ((Class500) class500_10_).aFloat6580)
		&& (((Class500) class500_10_).anIntArray6581[0]
		    == ((Class500) this).anIntArray6581[0])
		&& (((Class500) class500_10_).anIntArray6581[1]
		    == ((Class500) this).anIntArray6581[1])
		&& (((Class500) this).anIntArray6581[2]
		    == ((Class500) class500_10_).anIntArray6581[2])
		&& (((Class500) class500_10_).aFloatArray6582[0]
		    == ((Class500) this).aFloatArray6582[0])
		&& (((Class500) this).aFloatArray6582[1]
		    == ((Class500) class500_10_).aFloatArray6582[1])
		&& (((Class500) class500_10_).aFloatArray6582[2]
		    == ((Class500) this).aFloatArray6582[2]));
    }
    
    public Class500() {
	((Class500) this).aFloat6571 = 0.0F;
	((Class500) this).aFloat6578 = 1.0F;
	((Class500) this).aFloat6569 = 0.0F;
	((Class500) this).aFloat6580 = 1.0F;
	((Class500) this).anIntArray6581 = new int[] { -1, -1, -1 };
	((Class500) this).aFloatArray6582 = new float[] { 0.0F, 0.0F, 0.0F };
	method11338(-2098323908);
    }
    
    void method11347(Class501 class501, Class473 class473) {
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864
		.method14500(2061005715) == 1
	    && Class236.aClass103_2713.method2315() > 0) {
	    if (class473.method10804(-1712785293) != -1)
		((Class500) this).anInt6577
		    = class473.method10804(424774123) * 1072059061;
	    if (class473.method10832((byte) 4) != -1.0F)
		((Class500) this).aFloat6573 = class473.method10832((byte) 4);
	    if (class473.method10788(-317175061) != -1.0F)
		((Class500) this).aFloat6566
		    = class473.method10788(-317175061);
	    if (class473.method10813((short) 11535) != -1.0F)
		((Class500) this).aFloat6567
		    = class473.method10813((short) 7839);
	}
	if (class473.method10814(786150148) != null)
	    ((Class500) this).aClass287_6574
		.method5655(class473.method10814(926151060));
	if (class473.method10791(-1642322996) != -1)
	    ((Class500) this).anInt6565
		= class473.method10791(-489619721) * 109110291;
	if (class473.method10792(800879026) != -1)
	    ((Class500) this).anInt6570
		= class473.method10792(-44406255) * -1591825827;
	if (class473.method10796(-2101375760) != -1.0F)
	    ((Class500) this).aFloat6579 = class473.method10796(1229234079);
	if (class473.method10790(-324691636) != -1.0F)
	    ((Class500) this).aFloat6568 = class473.method10790(-324691636);
	if (class473.method10795(-191994407) != -1.0F)
	    ((Class500) this).aFloat6572 = class473.method10795(-534325462);
	if (class473.method10822((short) 21132) != -1)
	    ((Class500) this).aClass88_6564
		= class501.method11413(class473.method10822((short) -1038),
				       -16777216);
	if (class473.method10797(-2045119408) != -1) {
	    int i = class473.method10797(-554165392);
	    int i_11_ = class473.method10798(1215264582);
	    int i_12_ = class473.method10799(-1273778638);
	    int i_13_ = class473.method10794((byte) -66);
	    int i_14_ = class473.method10825(-1819043628);
	    client.anInt8468 = i_14_ * 2138879237;
	    ((Class500) this).aClass589_6575
		= class501.method11399(i, i_11_, i_12_, i_13_, 1230898968);
	}
	if (class473.method10802(0, 1782568498) != -1) {
	    ((Class500) this).anIntArray6581[0]
		= class473.method10802(0, 1406600986);
	    ((Class500) this).aFloatArray6582[0]
		= class473.method10803(0, -106605539);
	}
	if (class473.method10802(1, 897516929) != -1) {
	    ((Class500) this).anIntArray6581[1]
		= class473.method10802(1, 1096901173);
	    ((Class500) this).aFloatArray6582[1]
		= class473.method10803(1, -1278305340);
	}
	if (class473.method10802(2, -195529965) != -1) {
	    ((Class500) this).anIntArray6581[2]
		= class473.method10802(2, -324900870);
	    ((Class500) this).aFloatArray6582[2]
		= class473.method10803(2, -1969233408);
	}
    }
    
    public Class589 method11348(int i) {
	return ((Class500) this).aClass589_6575;
    }
    
    void method11349() {
	((Class500) this).anInt6577 = 1964617035;
	((Class500) this).aClass287_6574
	    = Class287.method5561(-50.0F, -60.0F, -50.0F);
	((Class500) this).aFloat6573 = 1.1523438F;
	((Class500) this).aFloat6566 = 0.69921875F;
	((Class500) this).aFloat6567 = 1.2F;
	((Class500) this).anInt6565 = 511437944;
	((Class500) this).anInt6570 = 0;
	((Class500) this).aClass88_6564 = Class501.aClass88_6589;
	((Class500) this).aFloat6572 = 1.0F;
	((Class500) this).aFloat6579 = 0.25F;
	((Class500) this).aFloat6568 = 1.0F;
	((Class500) this).aClass589_6575 = Class501.aClass589_6585;
	((Class500) this).aFloat6576 = 1.0F;
	((Class500) this).aFloat6571 = 0.0F;
	((Class500) this).aFloat6578 = 1.0F;
	((Class500) this).aFloat6569 = 0.0F;
	((Class500) this).aFloat6580 = 1.0F;
	int[] is = ((Class500) this).anIntArray6581;
	int[] is_15_ = ((Class500) this).anIntArray6581;
	((Class500) this).anIntArray6581[2] = -1;
	is_15_[1] = -1;
	is[0] = -1;
	float[] fs = ((Class500) this).aFloatArray6582;
	float[] fs_16_ = ((Class500) this).aFloatArray6582;
	((Class500) this).aFloatArray6582[2] = 0.0F;
	fs_16_[1] = 0.0F;
	fs[0] = 0.0F;
    }
    
    void method11350() {
	((Class500) this).anInt6577 = 1964617035;
	((Class500) this).aClass287_6574
	    = Class287.method5561(-50.0F, -60.0F, -50.0F);
	((Class500) this).aFloat6573 = 1.1523438F;
	((Class500) this).aFloat6566 = 0.69921875F;
	((Class500) this).aFloat6567 = 1.2F;
	((Class500) this).anInt6565 = 511437944;
	((Class500) this).anInt6570 = 0;
	((Class500) this).aClass88_6564 = Class501.aClass88_6589;
	((Class500) this).aFloat6572 = 1.0F;
	((Class500) this).aFloat6579 = 0.25F;
	((Class500) this).aFloat6568 = 1.0F;
	((Class500) this).aClass589_6575 = Class501.aClass589_6585;
	((Class500) this).aFloat6576 = 1.0F;
	((Class500) this).aFloat6571 = 0.0F;
	((Class500) this).aFloat6578 = 1.0F;
	((Class500) this).aFloat6569 = 0.0F;
	((Class500) this).aFloat6580 = 1.0F;
	int[] is = ((Class500) this).anIntArray6581;
	int[] is_17_ = ((Class500) this).anIntArray6581;
	((Class500) this).anIntArray6581[2] = -1;
	is_17_[1] = -1;
	is[0] = -1;
	float[] fs = ((Class500) this).aFloatArray6582;
	float[] fs_18_ = ((Class500) this).aFloatArray6582;
	((Class500) this).aFloatArray6582[2] = 0.0F;
	fs_18_[1] = 0.0F;
	fs[0] = 0.0F;
    }
    
    void method11351(Class500 class500_19_) {
	((Class500) this).anInt6577 = 1 * ((Class500) class500_19_).anInt6577;
	((Class500) this).aFloat6573 = ((Class500) class500_19_).aFloat6573;
	((Class500) this).aFloat6566 = ((Class500) class500_19_).aFloat6566;
	((Class500) this).aFloat6567 = ((Class500) class500_19_).aFloat6567;
	((Class500) this).aClass287_6574
	    .method5655(((Class500) class500_19_).aClass287_6574);
	((Class500) this).anInt6565 = ((Class500) class500_19_).anInt6565 * 1;
	((Class500) this).anInt6570 = ((Class500) class500_19_).anInt6570 * 1;
	((Class500) this).aClass88_6564
	    = ((Class500) class500_19_).aClass88_6564;
	((Class500) this).aFloat6572 = ((Class500) class500_19_).aFloat6572;
	((Class500) this).aFloat6579 = ((Class500) class500_19_).aFloat6579;
	((Class500) this).aFloat6568 = ((Class500) class500_19_).aFloat6568;
	((Class500) this).aClass589_6575
	    = ((Class500) class500_19_).aClass589_6575;
	((Class500) this).aFloat6576 = ((Class500) class500_19_).aFloat6576;
	((Class500) this).aFloat6571 = ((Class500) class500_19_).aFloat6571;
	((Class500) this).aFloat6578 = ((Class500) class500_19_).aFloat6578;
	((Class500) this).aFloat6569 = ((Class500) class500_19_).aFloat6569;
	((Class500) this).aFloat6580 = ((Class500) class500_19_).aFloat6580;
	((Class500) this).anIntArray6581[0]
	    = ((Class500) class500_19_).anIntArray6581[0];
	((Class500) this).anIntArray6581[1]
	    = ((Class500) class500_19_).anIntArray6581[1];
	((Class500) this).anIntArray6581[2]
	    = ((Class500) class500_19_).anIntArray6581[2];
	((Class500) this).aFloatArray6582[0]
	    = ((Class500) class500_19_).aFloatArray6582[0];
	((Class500) this).aFloatArray6582[1]
	    = ((Class500) class500_19_).aFloatArray6582[1];
	((Class500) this).aFloatArray6582[2]
	    = ((Class500) class500_19_).aFloatArray6582[2];
    }
    
    void method11352(Class500 class500_20_) {
	((Class500) this).anInt6577 = 1 * ((Class500) class500_20_).anInt6577;
	((Class500) this).aFloat6573 = ((Class500) class500_20_).aFloat6573;
	((Class500) this).aFloat6566 = ((Class500) class500_20_).aFloat6566;
	((Class500) this).aFloat6567 = ((Class500) class500_20_).aFloat6567;
	((Class500) this).aClass287_6574
	    .method5655(((Class500) class500_20_).aClass287_6574);
	((Class500) this).anInt6565 = ((Class500) class500_20_).anInt6565 * 1;
	((Class500) this).anInt6570 = ((Class500) class500_20_).anInt6570 * 1;
	((Class500) this).aClass88_6564
	    = ((Class500) class500_20_).aClass88_6564;
	((Class500) this).aFloat6572 = ((Class500) class500_20_).aFloat6572;
	((Class500) this).aFloat6579 = ((Class500) class500_20_).aFloat6579;
	((Class500) this).aFloat6568 = ((Class500) class500_20_).aFloat6568;
	((Class500) this).aClass589_6575
	    = ((Class500) class500_20_).aClass589_6575;
	((Class500) this).aFloat6576 = ((Class500) class500_20_).aFloat6576;
	((Class500) this).aFloat6571 = ((Class500) class500_20_).aFloat6571;
	((Class500) this).aFloat6578 = ((Class500) class500_20_).aFloat6578;
	((Class500) this).aFloat6569 = ((Class500) class500_20_).aFloat6569;
	((Class500) this).aFloat6580 = ((Class500) class500_20_).aFloat6580;
	((Class500) this).anIntArray6581[0]
	    = ((Class500) class500_20_).anIntArray6581[0];
	((Class500) this).anIntArray6581[1]
	    = ((Class500) class500_20_).anIntArray6581[1];
	((Class500) this).anIntArray6581[2]
	    = ((Class500) class500_20_).anIntArray6581[2];
	((Class500) this).aFloatArray6582[0]
	    = ((Class500) class500_20_).aFloatArray6582[0];
	((Class500) this).aFloatArray6582[1]
	    = ((Class500) class500_20_).aFloatArray6582[1];
	((Class500) this).aFloatArray6582[2]
	    = ((Class500) class500_20_).aFloatArray6582[2];
    }
    
    public void method11353(RSByteBuffer class241_sub3, Class501 class501) {
	int i = class241_sub3.readUnsignedByte((byte) 55);
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864
		.method14500(-456753706) == 1
	    && Class236.aClass103_2713.method2315() > 0) {
	    if ((i & Class481.aClass481_6454.anInt6452 * -983461933) != 0)
		((Class500) this).anInt6577
		    = class241_sub3.readInt((byte) 25) * 1072059061;
	    else
		((Class500) this).anInt6577 = 1964617035;
	    if ((i & Class481.aClass481_6455.anInt6452 * -983461933) != 0)
		((Class500) this).aFloat6573
		    = (float) class241_sub3.readUnsignedShort(1162222719) / 256.0F;
	    else
		((Class500) this).aFloat6573 = 1.1523438F;
	    if ((i & Class481.aClass481_6442.anInt6452 * -983461933) != 0)
		((Class500) this).aFloat6566
		    = (float) class241_sub3.readUnsignedShort(1162222719) / 256.0F;
	    else
		((Class500) this).aFloat6566 = 0.69921875F;
	    if ((i & Class481.aClass481_6444.anInt6452 * -983461933) != 0)
		((Class500) this).aFloat6567
		    = (float) class241_sub3.readUnsignedShort(1162222719) / 256.0F;
	    else
		((Class500) this).aFloat6567 = 1.2F;
	} else {
	    if ((i & -983461933 * Class481.aClass481_6454.anInt6452) != 0)
		class241_sub3.readInt((byte) 43);
	    if (0 != (i & Class481.aClass481_6455.anInt6452 * -983461933))
		class241_sub3.readUnsignedShort(1162222719);
	    if (0 != (i & Class481.aClass481_6442.anInt6452 * -983461933))
		class241_sub3.readUnsignedShort(1162222719);
	    if ((i & -983461933 * Class481.aClass481_6444.anInt6452) != 0)
		class241_sub3.readUnsignedShort(1162222719);
	    ((Class500) this).anInt6577 = 1964617035;
	    ((Class500) this).aFloat6567 = 1.2F;
	    ((Class500) this).aFloat6566 = 0.69921875F;
	    ((Class500) this).aFloat6573 = 1.1523438F;
	}
	if (0 != (i & Class481.aClass481_6441.anInt6452 * -983461933))
	    ((Class500) this).aClass287_6574
		= Class287.method5561((float) class241_sub3
						  .readShort((byte) 85),
				      (float) class241_sub3
						  .readShort((byte) 54),
				      (float) class241_sub3
						  .readShort((byte) 58));
	else
	    ((Class500) this).aClass287_6574
		= Class287.method5561(-50.0F, -60.0F, -50.0F);
	if (0 != (i & Class481.aClass481_6445.anInt6452 * -983461933))
	    ((Class500) this).anInt6565
		= class241_sub3.readInt((byte) 88) * 109110291;
	else
	    ((Class500) this).anInt6565 = 511437944;
	if ((i & Class481.aClass481_6446.anInt6452 * -983461933) != 0)
	    ((Class500) this).anInt6570
		= class241_sub3.readUnsignedShort(1162222719) * -1591825827;
	else
	    ((Class500) this).anInt6570 = 0;
	if (0 != (i & -983461933 * Class481.aClass481_6447.anInt6452)) {
	    int i_21_ = class241_sub3.readUnsignedShort(1162222719);
	    ((Class500) this).aClass88_6564
		= class501.method11413(i_21_, -16777216);
	} else
	    ((Class500) this).aClass88_6564 = Class501.aClass88_6589;
    }
    
    void method11354(Class103 class103, Class500 class500_22_,
		     Class500 class500_23_, float f, int i) {
	((Class500) this).anInt6577
	    = Class54.method1306((14388125
				  * ((Class500) class500_22_).anInt6577),
				 (((Class500) class500_23_).anInt6577
				  * 14388125),
				 f * 255.0F, 1372221625) * 1072059061;
	((Class500) this).aFloat6566
	    = (((Class500) class500_22_).aFloat6566
	       + f * (((Class500) class500_23_).aFloat6566
		      - ((Class500) class500_22_).aFloat6566));
	((Class500) this).aFloat6567
	    = (((Class500) class500_22_).aFloat6567
	       + (((Class500) class500_23_).aFloat6567
		  - ((Class500) class500_22_).aFloat6567) * f);
	((Class500) this).aFloat6573
	    = (f * (((Class500) class500_23_).aFloat6573
		    - ((Class500) class500_22_).aFloat6573)
	       + ((Class500) class500_22_).aFloat6573);
	((Class500) this).aFloat6568
	    = ((((Class500) class500_23_).aFloat6568
		- ((Class500) class500_22_).aFloat6568) * f
	       + ((Class500) class500_22_).aFloat6568);
	((Class500) this).aFloat6572
	    = (f * (((Class500) class500_23_).aFloat6572
		    - ((Class500) class500_22_).aFloat6572)
	       + ((Class500) class500_22_).aFloat6572);
	((Class500) this).aFloat6579
	    = (f * (((Class500) class500_23_).aFloat6579
		    - ((Class500) class500_22_).aFloat6579)
	       + ((Class500) class500_22_).aFloat6579);
	((Class500) this).anInt6565
	    = Class54.method1306((((Class500) class500_22_).anInt6565
				  * 128091675),
				 (((Class500) class500_23_).anInt6565
				  * 128091675),
				 255.0F * f, 1372221625) * 109110291;
	((Class500) this).anInt6570
	    = ((int) ((float) (((Class500) class500_23_).anInt6570 * 1402305013
			       - (1402305013
				  * ((Class500) class500_22_).anInt6570)) * f
		      + (float) (1402305013
				 * ((Class500) class500_22_).anInt6570))
	       * -1591825827);
	if (((Class500) class500_22_).aClass88_6564
	    != ((Class500) class500_23_).aClass88_6564)
	    ((Class500) this).aClass88_6564
		= class103.method2319(((Class500) class500_22_).aClass88_6564,
				      ((Class500) class500_23_).aClass88_6564,
				      f, ((Class500) this).aClass88_6564);
	if (((Class500) class500_22_).aClass589_6575
	    != ((Class500) class500_23_).aClass589_6575) {
	    if (null == ((Class500) class500_22_).aClass589_6575) {
		((Class500) this).aClass589_6575
		    = ((Class500) class500_23_).aClass589_6575;
		if (null != ((Class500) this).aClass589_6575)
		    ((Class500) this).aClass589_6575
			.method12887((int) (255.0F * f), 0, -1149514131);
	    } else {
		((Class500) this).aClass589_6575
		    = ((Class500) class500_22_).aClass589_6575;
		if (null != ((Class500) this).aClass589_6575)
		    ((Class500) this).aClass589_6575
			.method12887((int) (f * 255.0F), 255, -1179158323);
	    }
	}
	((Class500) this).aFloat6576
	    = (((Class500) class500_22_).aFloat6576
	       + (((Class500) class500_23_).aFloat6576
		  - ((Class500) class500_22_).aFloat6576) * f);
	((Class500) this).aFloat6571
	    = (f * (((Class500) class500_23_).aFloat6571
		    - ((Class500) class500_22_).aFloat6571)
	       + ((Class500) class500_22_).aFloat6571);
	((Class500) this).aFloat6578
	    = (((Class500) class500_22_).aFloat6578
	       + (((Class500) class500_23_).aFloat6578
		  - ((Class500) class500_22_).aFloat6578) * f);
	((Class500) this).aFloat6569
	    = (((Class500) class500_22_).aFloat6569
	       + f * (((Class500) class500_23_).aFloat6569
		      - ((Class500) class500_22_).aFloat6569));
	((Class500) this).aFloat6580
	    = (f * (((Class500) class500_23_).aFloat6580
		    - ((Class500) class500_22_).aFloat6580)
	       + ((Class500) class500_22_).aFloat6580);
	float f_24_ = (((Class500) class500_22_).aFloatArray6582[1]
		       + ((Class500) class500_22_).aFloatArray6582[0]
		       + ((Class500) class500_22_).aFloatArray6582[2]);
	float f_25_ = (((Class500) class500_23_).aFloatArray6582[2]
		       + (((Class500) class500_23_).aFloatArray6582[0]
			  + ((Class500) class500_23_).aFloatArray6582[1]));
	float f_26_ = (f_25_ - f_24_) * f + f_24_;
	if (f_26_ == 0.0F) {
	    int[] is = ((Class500) this).anIntArray6581;
	    int[] is_27_ = ((Class500) this).anIntArray6581;
	    ((Class500) this).anIntArray6581[2] = -1;
	    is_27_[1] = -1;
	    is[0] = -1;
	    float[] fs = ((Class500) this).aFloatArray6582;
	    float[] fs_28_ = ((Class500) this).aFloatArray6582;
	    ((Class500) this).aFloatArray6582[2] = 0.0F;
	    fs_28_[1] = 0.0F;
	    fs[0] = 0.0F;
	} else if (((Class500) class500_22_).anIntArray6581[0] == -1
		   && -1 == ((Class500) class500_22_).anIntArray6581[1]
		   && -1 == ((Class500) class500_22_).anIntArray6581[2]) {
	    for (int i_29_ = 0; i_29_ < 3; i_29_++) {
		((Class500) this).anIntArray6581[i_29_]
		    = ((Class500) class500_23_).anIntArray6581[i_29_];
		if (((Class500) this).anIntArray6581[i_29_] == -1)
		    ((Class500) this).aFloatArray6582[i_29_] = 0.0F;
		else
		    ((Class500) this).aFloatArray6582[i_29_]
			= ((Class500) class500_23_).aFloatArray6582[i_29_] * f;
	    }
	} else if (-1 == ((Class500) class500_23_).anIntArray6581[0]
		   && -1 == ((Class500) class500_23_).anIntArray6581[1]
		   && ((Class500) class500_23_).anIntArray6581[2] == -1) {
	    for (int i_30_ = 0; i_30_ < 3; i_30_++) {
		((Class500) this).anIntArray6581[i_30_]
		    = ((Class500) class500_22_).anIntArray6581[i_30_];
		if (-1 == ((Class500) this).anIntArray6581[i_30_])
		    ((Class500) this).aFloatArray6582[i_30_] = 0.0F;
		else
		    ((Class500) this).aFloatArray6582[i_30_]
			= (((Class500) class500_22_).aFloatArray6582[i_30_]
			   * (1.0F - f));
	    }
	} else {
	    float f_31_ = 1.0F - f;
	    int i_32_ = 0;
	    int[] is = { -1, -1, -1, -1, -1, -1 };
	    float[] fs = { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
	    for (int i_33_ = 0; i_33_ < 3; i_33_++) {
		if (((Class500) class500_22_).anIntArray6581[i_33_] > -1) {
		    is[i_32_]
			= ((Class500) class500_22_).anIntArray6581[i_33_];
		    fs[i_32_++] = f_31_ * (((Class500) class500_22_)
					   .aFloatArray6582[i_33_]);
		}
	    }
	    int i_34_ = i_32_;
	    for (int i_35_ = 0; i_35_ < 3; i_35_++) {
		if (((Class500) class500_23_).anIntArray6581[i_35_] > -1) {
		    float f_36_
			= ((Class500) class500_23_).aFloatArray6582[i_35_] * f;
		    for (int i_37_ = 0; i_37_ < i_34_; i_37_++) {
			if (((Class500) class500_23_).anIntArray6581[i_35_]
			    == is[i_37_]) {
			    fs[i_37_] += f_36_;
			    break;
			}
			if (i_34_ - 1 == i_37_) {
			    is[i_32_] = (((Class500) class500_23_)
					 .anIntArray6581[i_35_]);
			    fs[i_32_++] = f_36_;
			}
		    }
		}
	    }
	    if (i_32_ > 3) {
		float f_38_ = 0.0F;
		float f_39_ = 0.0F;
		for (int i_40_ = 0; i_40_ < i_32_; i_40_++)
		    f_38_ += fs[i_40_];
		Class76.method1769(fs, is, 0, i_32_ - 1, -2144283862);
		for (int i_41_ = 0; i_41_ < 3; i_41_++)
		    f_39_ += fs[i_41_];
		float f_42_ = f_38_ / f_39_;
		for (int i_43_ = 0; i_43_ < 3; i_43_++)
		    fs[i_43_] *= f_42_;
	    }
	    for (int i_44_ = 0; i_44_ < 3; i_44_++) {
		((Class500) this).anIntArray6581[i_44_] = is[i_44_];
		((Class500) this).aFloatArray6582[i_44_] = fs[i_44_];
	    }
	}
    }
    
    public void method11355(RSByteBuffer class241_sub3) {
	method11341(class241_sub3, 0, (byte) 8);
    }
    
    public void method11356(RSByteBuffer class241_sub3) {
	method11341(class241_sub3, 0, (byte) 80);
    }
    
    public void method11357(RSByteBuffer class241_sub3) {
	method11341(class241_sub3, 0, (byte) 66);
    }
    
    void method11358(RSByteBuffer class241_sub3, int i) {
	((Class500) this).anIntArray6581[i]
	    = class241_sub3.readUnsignedShort(1162222719);
	((Class500) this).aFloatArray6582[i]
	    = class241_sub3.method14650(-646074588);
    }
    
    void method11359(RSByteBuffer class241_sub3, int i) {
	((Class500) this).anIntArray6581[i]
	    = class241_sub3.readUnsignedShort(1162222719);
	((Class500) this).aFloatArray6582[i]
	    = class241_sub3.method14650(-2012182173);
    }
    
    void method11360(Class501 class501, Class473 class473, int i) {
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864
		.method14500(188922696) == 1
	    && Class236.aClass103_2713.method2315() > 0) {
	    if (class473.method10804(1004821878) != -1)
		((Class500) this).anInt6577
		    = class473.method10804(-104103410) * 1072059061;
	    if (class473.method10832((byte) 4) != -1.0F)
		((Class500) this).aFloat6573 = class473.method10832((byte) 4);
	    if (class473.method10788(-317175061) != -1.0F)
		((Class500) this).aFloat6566
		    = class473.method10788(-317175061);
	    if (class473.method10813((short) 30506) != -1.0F)
		((Class500) this).aFloat6567
		    = class473.method10813((short) 6332);
	}
	if (class473.method10814(351288069) != null)
	    ((Class500) this).aClass287_6574
		.method5655(class473.method10814(1221453760));
	if (class473.method10791(-1235284485) != -1)
	    ((Class500) this).anInt6565
		= class473.method10791(1834536919) * 109110291;
	if (class473.method10792(-1869159896) != -1)
	    ((Class500) this).anInt6570
		= class473.method10792(1902887545) * -1591825827;
	if (class473.method10796(-70395531) != -1.0F)
	    ((Class500) this).aFloat6579 = class473.method10796(-1879284860);
	if (class473.method10790(-324691636) != -1.0F)
	    ((Class500) this).aFloat6568 = class473.method10790(-324691636);
	if (class473.method10795(-303667211) != -1.0F)
	    ((Class500) this).aFloat6572 = class473.method10795(211604195);
	if (class473.method10822((short) -7013) != -1)
	    ((Class500) this).aClass88_6564
		= class501.method11413(class473.method10822((short) 1348),
				       -16777216);
	if (class473.method10797(-728378714) != -1) {
	    int i_45_ = class473.method10797(-2131316087);
	    int i_46_ = class473.method10798(315244089);
	    int i_47_ = class473.method10799(-1273778638);
	    int i_48_ = class473.method10794((byte) -55);
	    int i_49_ = class473.method10825(-1726637886);
	    client.anInt8468 = i_49_ * 2138879237;
	    ((Class500) this).aClass589_6575
		= class501.method11399(i_45_, i_46_, i_47_, i_48_, 1230898968);
	}
	if (class473.method10802(0, 1959675164) != -1) {
	    ((Class500) this).anIntArray6581[0]
		= class473.method10802(0, 2061168502);
	    ((Class500) this).aFloatArray6582[0]
		= class473.method10803(0, -2102333595);
	}
	if (class473.method10802(1, 1200371281) != -1) {
	    ((Class500) this).anIntArray6581[1]
		= class473.method10802(1, 568419817);
	    ((Class500) this).aFloatArray6582[1]
		= class473.method10803(1, -518232951);
	}
	if (class473.method10802(2, 408314299) != -1) {
	    ((Class500) this).anIntArray6581[2]
		= class473.method10802(2, 305155067);
	    ((Class500) this).aFloatArray6582[2]
		= class473.method10803(2, -1121106684);
	}
    }
    
    public Class589 method11361() {
	return ((Class500) this).aClass589_6575;
    }
    
    public int method11362() {
	return ((Class500) this).anInt6565 * 128091675;
    }
    
    boolean method11363(Class500 class500_50_) {
	return ((14388125 * ((Class500) class500_50_).anInt6577
		 == 14388125 * ((Class500) this).anInt6577)
		&& (((Class500) this).aFloat6573
		    == ((Class500) class500_50_).aFloat6573)
		&& (((Class500) class500_50_).aFloat6566
		    == ((Class500) this).aFloat6566)
		&& (((Class500) class500_50_).aFloat6567
		    == ((Class500) this).aFloat6567)
		&& (((Class500) class500_50_).aFloat6579
		    == ((Class500) this).aFloat6579)
		&& (((Class500) class500_50_).aFloat6572
		    == ((Class500) this).aFloat6572)
		&& (((Class500) class500_50_).aFloat6568
		    == ((Class500) this).aFloat6568)
		&& (128091675 * ((Class500) class500_50_).anInt6565
		    == 128091675 * ((Class500) this).anInt6565)
		&& (((Class500) this).anInt6570 * 1402305013
		    == ((Class500) class500_50_).anInt6570 * 1402305013)
		&& (((Class500) this).aClass88_6564
		    == ((Class500) class500_50_).aClass88_6564)
		&& (((Class500) class500_50_).aClass589_6575
		    == ((Class500) this).aClass589_6575)
		&& (((Class500) class500_50_).aFloat6576
		    == ((Class500) this).aFloat6576)
		&& (((Class500) this).aFloat6571
		    == ((Class500) class500_50_).aFloat6571)
		&& (((Class500) this).aFloat6578
		    == ((Class500) class500_50_).aFloat6578)
		&& (((Class500) class500_50_).aFloat6569
		    == ((Class500) this).aFloat6569)
		&& (((Class500) this).aFloat6580
		    == ((Class500) class500_50_).aFloat6580)
		&& (((Class500) class500_50_).anIntArray6581[0]
		    == ((Class500) this).anIntArray6581[0])
		&& (((Class500) class500_50_).anIntArray6581[1]
		    == ((Class500) this).anIntArray6581[1])
		&& (((Class500) this).anIntArray6581[2]
		    == ((Class500) class500_50_).anIntArray6581[2])
		&& (((Class500) class500_50_).aFloatArray6582[0]
		    == ((Class500) this).aFloatArray6582[0])
		&& (((Class500) this).aFloatArray6582[1]
		    == ((Class500) class500_50_).aFloatArray6582[1])
		&& (((Class500) class500_50_).aFloatArray6582[2]
		    == ((Class500) this).aFloatArray6582[2]));
    }
    
    boolean method11364(Class500 class500_51_) {
	return ((14388125 * ((Class500) class500_51_).anInt6577
		 == 14388125 * ((Class500) this).anInt6577)
		&& (((Class500) this).aFloat6573
		    == ((Class500) class500_51_).aFloat6573)
		&& (((Class500) class500_51_).aFloat6566
		    == ((Class500) this).aFloat6566)
		&& (((Class500) class500_51_).aFloat6567
		    == ((Class500) this).aFloat6567)
		&& (((Class500) class500_51_).aFloat6579
		    == ((Class500) this).aFloat6579)
		&& (((Class500) class500_51_).aFloat6572
		    == ((Class500) this).aFloat6572)
		&& (((Class500) class500_51_).aFloat6568
		    == ((Class500) this).aFloat6568)
		&& (128091675 * ((Class500) class500_51_).anInt6565
		    == 128091675 * ((Class500) this).anInt6565)
		&& (((Class500) this).anInt6570 * 1402305013
		    == ((Class500) class500_51_).anInt6570 * 1402305013)
		&& (((Class500) this).aClass88_6564
		    == ((Class500) class500_51_).aClass88_6564)
		&& (((Class500) class500_51_).aClass589_6575
		    == ((Class500) this).aClass589_6575)
		&& (((Class500) class500_51_).aFloat6576
		    == ((Class500) this).aFloat6576)
		&& (((Class500) this).aFloat6571
		    == ((Class500) class500_51_).aFloat6571)
		&& (((Class500) this).aFloat6578
		    == ((Class500) class500_51_).aFloat6578)
		&& (((Class500) class500_51_).aFloat6569
		    == ((Class500) this).aFloat6569)
		&& (((Class500) this).aFloat6580
		    == ((Class500) class500_51_).aFloat6580)
		&& (((Class500) class500_51_).anIntArray6581[0]
		    == ((Class500) this).anIntArray6581[0])
		&& (((Class500) class500_51_).anIntArray6581[1]
		    == ((Class500) this).anIntArray6581[1])
		&& (((Class500) this).anIntArray6581[2]
		    == ((Class500) class500_51_).anIntArray6581[2])
		&& (((Class500) class500_51_).aFloatArray6582[0]
		    == ((Class500) this).aFloatArray6582[0])
		&& (((Class500) this).aFloatArray6582[1]
		    == ((Class500) class500_51_).aFloatArray6582[1])
		&& (((Class500) class500_51_).aFloatArray6582[2]
		    == ((Class500) this).aFloatArray6582[2]));
    }
    
    public void method11365(RSByteBuffer class241_sub3, Class501 class501,
			    int i) {
	int i_52_ = class241_sub3.readUnsignedShort(1162222719);
	int i_53_ = class241_sub3.readShort((byte) 126);
	int i_54_ = class241_sub3.readShort((byte) 73);
	int i_55_ = class241_sub3.readShort((byte) 67);
	int i_56_ = class241_sub3.readUnsignedShort(1162222719);
	client.anInt8468 = 2138879237 * i_56_;
	((Class500) this).aClass589_6575
	    = class501.method11399(i_52_, i_53_, i_54_, i_55_, 1230898968);
    }
    
    void method11366(Class501 class501, Class473 class473) {
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864
		.method14500(-1311627229) == 1
	    && Class236.aClass103_2713.method2315() > 0) {
	    if (class473.method10804(444560234) != -1)
		((Class500) this).anInt6577
		    = class473.method10804(-457332434) * 1072059061;
	    if (class473.method10832((byte) 4) != -1.0F)
		((Class500) this).aFloat6573 = class473.method10832((byte) 4);
	    if (class473.method10788(-317175061) != -1.0F)
		((Class500) this).aFloat6566
		    = class473.method10788(-317175061);
	    if (class473.method10813((short) 26712) != -1.0F)
		((Class500) this).aFloat6567
		    = class473.method10813((short) 8921);
	}
	if (class473.method10814(1270736265) != null)
	    ((Class500) this).aClass287_6574
		.method5655(class473.method10814(721668798));
	if (class473.method10791(-608976490) != -1)
	    ((Class500) this).anInt6565
		= class473.method10791(962989129) * 109110291;
	if (class473.method10792(-999994619) != -1)
	    ((Class500) this).anInt6570
		= class473.method10792(1148594794) * -1591825827;
	if (class473.method10796(-987199973) != -1.0F)
	    ((Class500) this).aFloat6579 = class473.method10796(487486449);
	if (class473.method10790(-324691636) != -1.0F)
	    ((Class500) this).aFloat6568 = class473.method10790(-324691636);
	if (class473.method10795(-1620780772) != -1.0F)
	    ((Class500) this).aFloat6572 = class473.method10795(-216131654);
	if (class473.method10822((short) -14506) != -1)
	    ((Class500) this).aClass88_6564
		= class501.method11413(class473.method10822((short) 17659),
				       -16777216);
	if (class473.method10797(-874326351) != -1) {
	    int i = class473.method10797(-1507324487);
	    int i_57_ = class473.method10798(-449351004);
	    int i_58_ = class473.method10799(-1273778638);
	    int i_59_ = class473.method10794((byte) -59);
	    int i_60_ = class473.method10825(-2054918998);
	    client.anInt8468 = i_60_ * 2138879237;
	    ((Class500) this).aClass589_6575
		= class501.method11399(i, i_57_, i_58_, i_59_, 1230898968);
	}
	if (class473.method10802(0, 1873419065) != -1) {
	    ((Class500) this).anIntArray6581[0]
		= class473.method10802(0, 1902048255);
	    ((Class500) this).aFloatArray6582[0]
		= class473.method10803(0, -470151329);
	}
	if (class473.method10802(1, 1325151923) != -1) {
	    ((Class500) this).anIntArray6581[1]
		= class473.method10802(1, 2119126192);
	    ((Class500) this).aFloatArray6582[1]
		= class473.method10803(1, -122169330);
	}
	if (class473.method10802(2, 671753537) != -1) {
	    ((Class500) this).anIntArray6581[2]
		= class473.method10802(2, 2007187949);
	    ((Class500) this).aFloatArray6582[2]
		= class473.method10803(2, -1051856605);
	}
    }
    
    public void method11367(RSByteBuffer class241_sub3) {
	((Class500) this).aFloat6572 = class241_sub3.method14650(-505863680);
	((Class500) this).aFloat6579 = class241_sub3.method14650(-834276607);
	((Class500) this).aFloat6568 = class241_sub3.method14650(-365653686);
    }
    
    public void method11368(RSByteBuffer class241_sub3, Class501 class501) {
	int i = class241_sub3.readUnsignedShort(1162222719);
	int i_61_ = class241_sub3.readShort((byte) 112);
	int i_62_ = class241_sub3.readShort((byte) 75);
	int i_63_ = class241_sub3.readShort((byte) 47);
	int i_64_ = class241_sub3.readUnsignedShort(1162222719);
	client.anInt8468 = 2138879237 * i_64_;
	((Class500) this).aClass589_6575
	    = class501.method11399(i, i_61_, i_62_, i_63_, 1230898968);
    }
    
    public int method11369() {
	return ((Class500) this).anInt6565 * 128091675;
    }
    
    public int method11370(byte i) {
	return ((Class500) this).anInt6565 * 128091675;
    }
    
    public Class589 method11371() {
	return ((Class500) this).aClass589_6575;
    }
    
    static final void method11372(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	float f = (float) (((ClientScriptData) class454).integerStack
			   [((ClientScriptData) class454).intStackPointer * 1482319719]);
	float f_65_
	    = (float) (((ClientScriptData) class454).integerStack
		       [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	float f_66_
	    = (float) (((ClientScriptData) class454).integerStack
		       [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	float f_67_
	    = ((float) (((ClientScriptData) class454).integerStack
			[((ClientScriptData) class454).intStackPointer * 1482319719 + 3])
	       / 1000.0F);
	Class445_Sub16.aClass351_Sub1_8660.method6271
	    (Class287.method5561(f, f_65_, f_66_), f_67_, -965732127);
    }
    
    static int method11373(char c, Language class437, byte i) {
	int i_68_ = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i_68_ = 1 + (c << 4);
	}
	if (c == 241 && Language.aClass437_6139 == class437)
	    i_68_ = 1762;
	return i_68_;
    }
    
    static final void method11374(ClientScriptData class454, short i) {
	int i_69_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	ItemDefinition class623
	    = JS5.itemDefLoader.list(i_69_, (short) 5249);
	int i_70_;
	if (class623.aBool7953)
	    i_70_ = 1075803965 * class623.anInt7910;
	else if (class623.membersOnly)
	    i_70_ = ClanChannelUser.aClass499_5588.anInt6561 * -1445883597;
	else
	    i_70_ = ClanChannelUser.aClass499_5588.anInt6560 * -1492711707;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_70_;
    }
    
    public static Frame method11375(Class426 class426, int i, int i_71_,
				    int i_72_, int i_73_, byte i_74_) {
	if (0 == i_72_) {
	    Class446[] class446s = Class501.method11441(class426, (byte) -91);
	    if (class446s == null)
		return null;
	    boolean bool = false;
	    for (int i_75_ = 0; i_75_ < class446s.length; i_75_++) {
		if (-954685139 * class446s[i_75_].anInt6177 == i
		    && class446s[i_75_].anInt6180 * -1042155793 == i_71_
		    && (i_73_ == 0
			|| i_73_ == 188311769 * (((Class446) class446s[i_75_])
						 .anInt6178))
		    && (!bool
			|| 944464197 * class446s[i_75_].anInt6179 > i_72_)) {
		    i_72_ = 944464197 * class446s[i_75_].anInt6179;
		    bool = true;
		}
	    }
	    if (!bool)
		return null;
	}
	Frame frame = new Frame("Jagex Full Screen");
	frame.setResizable(false);
	class426.method7574(frame, i, i_71_, i_72_, i_73_, -1618986642);
	return frame;
    }
}
