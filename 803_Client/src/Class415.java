/* Class415 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class415
{
    public int anInt6001;
    public int anInt6002;
    public int anInt6003;
    public boolean aBool6004;
    public boolean aBool6005;
    int anInt6006 = 0;
    public int anInt6007;
    public int anInt6008;
    public int anInt6009 = 989356395;
    
    void method7482(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 49);
	    if (i == 0)
		break;
	    method7484(class241_sub3, i, (byte) 1);
	}
    }
    
    void method7483(RSByteBuffer class241_sub3, int i) {
	for (;;) {
	    int i_0_ = class241_sub3.readUnsignedByte((byte) -114);
	    if (i_0_ == 0)
		break;
	    method7484(class241_sub3, i_0_, (byte) 9);
	}
    }
    
    void method7484(RSByteBuffer class241_sub3, int i, byte i_1_) {
	if (1 == i) {
	    ((Class415) this).anInt6006
		= class241_sub3.readTriByte(1771646547) * -354951195;
	    method7486(((Class415) this).anInt6006 * 1825129965, -1758217559);
	} else if (i == 2) {
	    anInt6009 = class241_sub3.readUnsignedShort(1162222719) * -989356395;
	    if (65535 == 1394687165 * anInt6009)
		anInt6009 = 989356395;
	} else if (3 == i)
	    anInt6003
		= (class241_sub3.readUnsignedShort(1162222719) << 2) * -59358039;
	else if (i == 4)
	    aBool6004 = false;
	else if (i == 5)
	    aBool6005 = false;
    }
    
    Class415() {
	anInt6003 = -326544896;
	aBool6004 = true;
	aBool6005 = true;
    }
    
    void method7485(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_2_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_3_ = (double) (i & 0xff) / 256.0;
	double d_4_ = d;
	if (d_2_ < d_4_)
	    d_4_ = d_2_;
	if (d_3_ < d_4_)
	    d_4_ = d_3_;
	double d_5_ = d;
	if (d_2_ > d_5_)
	    d_5_ = d_2_;
	if (d_3_ > d_5_)
	    d_5_ = d_3_;
	double d_6_ = 0.0;
	double d_7_ = 0.0;
	double d_8_ = (d_5_ + d_4_) / 2.0;
	if (d_4_ != d_5_) {
	    if (d_8_ < 0.5)
		d_7_ = (d_5_ - d_4_) / (d_5_ + d_4_);
	    if (d_8_ >= 0.5)
		d_7_ = (d_5_ - d_4_) / (2.0 - d_5_ - d_4_);
	    if (d == d_5_)
		d_6_ = (d_2_ - d_3_) / (d_5_ - d_4_);
	    else if (d_5_ == d_2_)
		d_6_ = 2.0 + (d_3_ - d) / (d_5_ - d_4_);
	    else if (d_3_ == d_5_)
		d_6_ = 4.0 + (d - d_2_) / (d_5_ - d_4_);
	}
	d_6_ /= 6.0;
	anInt6007 = (int) (256.0 * d_7_) * -1634909511;
	anInt6002 = 1017867537 * (int) (d_8_ * 256.0);
	if (-2071452791 * anInt6007 < 0)
	    anInt6007 = 0;
	else if (anInt6007 * -2071452791 > 255)
	    anInt6007 = -290097593;
	if (-1150999567 * anInt6002 < 0)
	    anInt6002 = 0;
	else if (-1150999567 * anInt6002 > 255)
	    anInt6002 = 1858184175;
	if (d_8_ > 0.5)
	    anInt6008 = 481608767 * (int) ((1.0 - d_8_) * d_7_ * 512.0);
	else
	    anInt6008 = (int) (512.0 * (d_7_ * d_8_)) * 481608767;
	if (555035583 * anInt6008 < 1)
	    anInt6008 = 481608767;
	anInt6001
	    = -1695623193 * (int) (d_6_ * (double) (anInt6008 * 555035583));
    }
    
    void method7486(int i, int i_9_) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_10_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_11_ = (double) (i & 0xff) / 256.0;
	double d_12_ = d;
	if (d_10_ < d_12_)
	    d_12_ = d_10_;
	if (d_11_ < d_12_)
	    d_12_ = d_11_;
	double d_13_ = d;
	if (d_10_ > d_13_)
	    d_13_ = d_10_;
	if (d_11_ > d_13_)
	    d_13_ = d_11_;
	double d_14_ = 0.0;
	double d_15_ = 0.0;
	double d_16_ = (d_13_ + d_12_) / 2.0;
	if (d_12_ != d_13_) {
	    if (d_16_ < 0.5)
		d_15_ = (d_13_ - d_12_) / (d_13_ + d_12_);
	    if (d_16_ >= 0.5)
		d_15_ = (d_13_ - d_12_) / (2.0 - d_13_ - d_12_);
	    if (d == d_13_)
		d_14_ = (d_10_ - d_11_) / (d_13_ - d_12_);
	    else if (d_13_ == d_10_)
		d_14_ = 2.0 + (d_11_ - d) / (d_13_ - d_12_);
	    else if (d_11_ == d_13_)
		d_14_ = 4.0 + (d - d_10_) / (d_13_ - d_12_);
	}
	d_14_ /= 6.0;
	anInt6007 = (int) (256.0 * d_15_) * -1634909511;
	anInt6002 = 1017867537 * (int) (d_16_ * 256.0);
	if (-2071452791 * anInt6007 < 0)
	    anInt6007 = 0;
	else if (anInt6007 * -2071452791 > 255)
	    anInt6007 = -290097593;
	if (-1150999567 * anInt6002 < 0)
	    anInt6002 = 0;
	else if (-1150999567 * anInt6002 > 255)
	    anInt6002 = 1858184175;
	if (d_16_ > 0.5)
	    anInt6008 = 481608767 * (int) ((1.0 - d_16_) * d_15_ * 512.0);
	else
	    anInt6008 = (int) (512.0 * (d_15_ * d_16_)) * 481608767;
	if (555035583 * anInt6008 < 1)
	    anInt6008 = 481608767;
	anInt6001
	    = -1695623193 * (int) (d_14_ * (double) (anInt6008 * 555035583));
    }
    
    void method7487(RSByteBuffer class241_sub3, int i) {
	if (1 == i) {
	    ((Class415) this).anInt6006
		= class241_sub3.readTriByte(1771646547) * -354951195;
	    method7486(((Class415) this).anInt6006 * 1825129965, -1287286731);
	} else if (i == 2) {
	    anInt6009 = class241_sub3.readUnsignedShort(1162222719) * -989356395;
	    if (65535 == 1394687165 * anInt6009)
		anInt6009 = 989356395;
	} else if (3 == i)
	    anInt6003
		= (class241_sub3.readUnsignedShort(1162222719) << 2) * -59358039;
	else if (i == 4)
	    aBool6004 = false;
	else if (i == 5)
	    aBool6005 = false;
    }
    
    public static Class425 method7488(int i) {
	if (null == GameShell3$FrameParameters.aClass425_4007)
	    return Class425.aClass425_6071;
	return GameShell3$FrameParameters.aClass425_4007;
    }
}
