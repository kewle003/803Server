/* Class241_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

@SuppressWarnings("restriction")
public class Class241_Sub17 extends Node
{
    int anInt8985;
    Class166_Sub1 aClass166_Sub1_8986;
    Class86 aClass86_8987;
    float aFloat8988;
    int anInt8989;
    Interface40 anInterface40_8990;
    int anInt8991 = 0;
    int[] anIntArray8992;
    int anInt8993 = 0;
    int anInt8994 = 0;
    Class103_Sub3 aClass103_Sub3_8995;
    long aLong8996;
    
    void method15019(int i, int i_0_, int i_1_) {
	((Class241_Sub17) this).anIntArray8992
	    [i_0_ * (((Class241_Sub17) this).aClass166_Sub1_8986.anInt2055
		     * 266270313) + i]
	    |= 1 << i_1_;
	((Class241_Sub17) this).anInt8991++;
    }
    
	void method15020(int i) {
	((Class241_Sub17) this).aLong8996
	    = ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493
		  .allocateMemory((long) (i * 4));
	for (int i_2_ = 3; i_2_ < i * 4; i_2_ += 4)
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) i_2_, (byte) 0);
    }
    
    void method15021(int i) {
	((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
	    (((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 3L,
	     (byte) -1);
    }
    
    void method15022(int i, int i_3_, int i_4_, float f) {
	if (((Class241_Sub17) this).anInt8985 != -1) {
	    Class101 class101
		= (((Class241_Sub17) this).aClass103_Sub3_8995
		       .aClass107_1458.method2680
		   (((Class241_Sub17) this).anInt8985, 1493831388));
	    int i_5_ = class101.aByte1430 & 0xff;
	    if (i_5_ != 0 && class101.aByte1427 != 4) {
		int i_6_;
		if (i_4_ < 0)
		    i_6_ = 0;
		else if (i_4_ > 127)
		    i_6_ = 16777215;
		else
		    i_6_ = 131586 * i_4_;
		if (i_5_ == 256)
		    i_3_ = i_6_;
		else {
		    int i_7_ = i_5_;
		    int i_8_ = 256 - i_5_;
		    i_3_
			= (((i_6_ & 0xff00ff) * i_7_ + (i_3_ & 0xff00ff) * i_8_
			    & ~0xff00ff)
			   + ((i_6_ & 0xff00) * i_7_ + (i_3_ & 0xff00) * i_8_
			      & 0xff0000)) >> 8;
		}
	    }
	    int i_9_ = class101.aByte1433 & 0xff;
	    if (i_9_ != 0) {
		i_9_ += 256;
		int i_10_ = ((i_3_ & 0xff0000) >> 16) * i_9_;
		if (i_10_ > 65535)
		    i_10_ = 65535;
		int i_11_ = ((i_3_ & 0xff00) >> 8) * i_9_;
		if (i_11_ > 65535)
		    i_11_ = 65535;
		int i_12_ = (i_3_ & 0xff) * i_9_;
		if (i_12_ > 65535)
		    i_12_ = 65535;
		i_3_ = (i_10_ << 8 & 0xff0000) + (i_11_ & 0xff00) + (i_12_
								     >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_13_ = i_3_ >> 16 & 0xff;
	    int i_14_ = i_3_ >> 8 & 0xff;
	    int i_15_ = i_3_ & 0xff;
	    i_13_ *= f;
	    if (i_13_ < 0)
		i_13_ = 0;
	    else if (i_13_ > 255)
		i_13_ = 255;
	    i_14_ *= f;
	    if (i_14_ < 0)
		i_14_ = 0;
	    else if (i_14_ > 255)
		i_14_ = 255;
	    i_15_ *= f;
	    if (i_15_ < 0)
		i_15_ = 0;
	    else if (i_15_ > 255)
		i_15_ = 255;
	    i_3_ = i_13_ << 16 | i_14_ << 8 | i_15_;
	}
	if ((((Class103_Sub3) ((Class241_Sub17) this).aClass103_Sub3_8995)
	     .anInt9633)
	    == 0) {
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 0L,
		 (byte) (i_3_ >> 16));
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 1L,
		 (byte) (i_3_ >> 8));
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 2L,
		 (byte) i_3_);
	} else {
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 0L,
		 (byte) i_3_);
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 1L,
		 (byte) (i_3_ >> 8));
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 2L,
		 (byte) (i_3_ >> 16));
	}
    }
    
    void method15023(int i) {
	((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
	    (((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 3L,
	     (byte) -1);
    }
    
    void method15024(int[] is, int i) {
	((Class241_Sub17) this).anInt8993 = 0;
	((Class241_Sub17) this).anInt8994 = 32767;
	((Class241_Sub17) this).anInt8989 = -32768;
	ByteBuffer bytebuffer
	    = ((Class241_Sub17) this).aClass103_Sub3_8995.aByteBuffer9490;
	for (int i_16_ = 0; i_16_ < i; i_16_++) {
	    int i_17_ = is[i_16_];
	    short[] is_18_ = (((Class166_Sub1)
			       ((Class241_Sub17) this).aClass166_Sub1_8986)
			      .aShortArrayArray9791[i_17_]);
	    int i_19_ = ((Class241_Sub17) this).anIntArray8992[i_17_];
	    if (i_19_ != 0 && is_18_ != null) {
		int i_20_ = 0;
		int i_21_ = 0;
		while (i_21_ < is_18_.length) {
		    if ((i_19_ & 1 << i_20_++) != 0) {
			for (int i_22_ = 0; i_22_ < 3; i_22_++) {
			    int i_23_ = is_18_[i_21_++] & 0xffff;
			    if (i_23_ > ((Class241_Sub17) this).anInt8989)
				((Class241_Sub17) this).anInt8989 = i_23_;
			    if (i_23_ < ((Class241_Sub17) this).anInt8994)
				((Class241_Sub17) this).anInt8994 = i_23_;
			    bytebuffer.putShort((short) i_23_);
			}
			((Class241_Sub17) this).anInt8993 += 3;
		    } else
			i_21_ += 3;
		}
	    }
	}
    }
    
    void method15025(int[] is, int i) {
	((Class241_Sub17) this).anInt8993 = 0;
	((Class241_Sub17) this).anInt8994 = 32767;
	((Class241_Sub17) this).anInt8989 = -32768;
	ByteBuffer bytebuffer
	    = ((Class241_Sub17) this).aClass103_Sub3_8995.aByteBuffer9490;
	for (int i_24_ = 0; i_24_ < i; i_24_++) {
	    int i_25_ = is[i_24_];
	    short[] is_26_ = (((Class166_Sub1)
			       ((Class241_Sub17) this).aClass166_Sub1_8986)
			      .aShortArrayArray9791[i_25_]);
	    int i_27_ = ((Class241_Sub17) this).anIntArray8992[i_25_];
	    if (i_27_ != 0 && is_26_ != null) {
		int i_28_ = 0;
		int i_29_ = 0;
		while (i_29_ < is_26_.length) {
		    if ((i_27_ & 1 << i_28_++) != 0) {
			for (int i_30_ = 0; i_30_ < 3; i_30_++) {
			    int i_31_ = is_26_[i_29_++] & 0xffff;
			    if (i_31_ > ((Class241_Sub17) this).anInt8989)
				((Class241_Sub17) this).anInt8989 = i_31_;
			    if (i_31_ < ((Class241_Sub17) this).anInt8994)
				((Class241_Sub17) this).anInt8994 = i_31_;
			    bytebuffer.putShort((short) i_31_);
			}
			((Class241_Sub17) this).anInt8993 += 3;
		    } else
			i_29_ += 3;
		}
	    }
	}
    }
    
    void method15026(int i) {
	((Class241_Sub17) this).aLong8996
	    = ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493
		  .allocateMemory((long) (i * 4));
	for (int i_32_ = 3; i_32_ < i * 4; i_32_ += 4)
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) i_32_, (byte) 0);
    }
    
    void method15027(int i, int i_33_, int i_34_, float f) {
	if (((Class241_Sub17) this).anInt8985 != -1) {
	    Class101 class101
		= (((Class241_Sub17) this).aClass103_Sub3_8995
		       .aClass107_1458.method2680
		   (((Class241_Sub17) this).anInt8985, 199592615));
	    int i_35_ = class101.aByte1430 & 0xff;
	    if (i_35_ != 0 && class101.aByte1427 != 4) {
		int i_36_;
		if (i_34_ < 0)
		    i_36_ = 0;
		else if (i_34_ > 127)
		    i_36_ = 16777215;
		else
		    i_36_ = 131586 * i_34_;
		if (i_35_ == 256)
		    i_33_ = i_36_;
		else {
		    int i_37_ = i_35_;
		    int i_38_ = 256 - i_35_;
		    i_33_ = ((((i_36_ & 0xff00ff) * i_37_
			       + (i_33_ & 0xff00ff) * i_38_)
			      & ~0xff00ff)
			     + (((i_36_ & 0xff00) * i_37_
				 + (i_33_ & 0xff00) * i_38_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_39_ = class101.aByte1433 & 0xff;
	    if (i_39_ != 0) {
		i_39_ += 256;
		int i_40_ = ((i_33_ & 0xff0000) >> 16) * i_39_;
		if (i_40_ > 65535)
		    i_40_ = 65535;
		int i_41_ = ((i_33_ & 0xff00) >> 8) * i_39_;
		if (i_41_ > 65535)
		    i_41_ = 65535;
		int i_42_ = (i_33_ & 0xff) * i_39_;
		if (i_42_ > 65535)
		    i_42_ = 65535;
		i_33_ = (i_40_ << 8 & 0xff0000) + (i_41_ & 0xff00) + (i_42_
								      >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_43_ = i_33_ >> 16 & 0xff;
	    int i_44_ = i_33_ >> 8 & 0xff;
	    int i_45_ = i_33_ & 0xff;
	    i_43_ *= f;
	    if (i_43_ < 0)
		i_43_ = 0;
	    else if (i_43_ > 255)
		i_43_ = 255;
	    i_44_ *= f;
	    if (i_44_ < 0)
		i_44_ = 0;
	    else if (i_44_ > 255)
		i_44_ = 255;
	    i_45_ *= f;
	    if (i_45_ < 0)
		i_45_ = 0;
	    else if (i_45_ > 255)
		i_45_ = 255;
	    i_33_ = i_43_ << 16 | i_44_ << 8 | i_45_;
	}
	if ((((Class103_Sub3) ((Class241_Sub17) this).aClass103_Sub3_8995)
	     .anInt9633)
	    == 0) {
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 0L,
		 (byte) (i_33_ >> 16));
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 1L,
		 (byte) (i_33_ >> 8));
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 2L,
		 (byte) i_33_);
	} else {
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 0L,
		 (byte) i_33_);
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 1L,
		 (byte) (i_33_ >> 8));
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 2L,
		 (byte) (i_33_ >> 16));
	}
    }
    
    void method15028(int i) {
	((Class241_Sub17) this).aLong8996
	    = ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493
		  .allocateMemory((long) (i * 4));
	for (int i_46_ = 3; i_46_ < i * 4; i_46_ += 4)
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) i_46_, (byte) 0);
    }
    
    void method15029(int i) {
	((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
	    (((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 3L,
	     (byte) -1);
    }
    
    void method15030(int i) {
	((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
	    (((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 3L,
	     (byte) -1);
    }
    
    void method15031(int i) {
	((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
	    (((Class241_Sub17) this).aLong8996 + (long) (i * 4) + 3L,
	     (byte) -1);
    }
    
    void method15032(int i) {
	((Class241_Sub17) this).aLong8996
	    = ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493
		  .allocateMemory((long) (i * 4));
	for (int i_47_ = 3; i_47_ < i * 4; i_47_ += 4)
	    ((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493.putByte
		(((Class241_Sub17) this).aLong8996 + (long) i_47_, (byte) 0);
    }
    
    Class241_Sub17(Class166_Sub1 class166_sub1, int i, int i_48_,
		   Class86 class86) {
	((Class241_Sub17) this).anInt8989 = 0;
	((Class241_Sub17) this).aClass166_Sub1_8986 = class166_sub1;
	((Class241_Sub17) this).aClass103_Sub3_8995
	    = (((Class166_Sub1) ((Class241_Sub17) this).aClass166_Sub1_8986)
	       .aClass103_Sub3_9767);
	((Class241_Sub17) this).anInt8985 = i;
	((Class241_Sub17) this).aFloat8988 = (float) i_48_;
	((Class241_Sub17) this).aClass86_8987 = class86;
	((Class241_Sub17) this).anIntArray8992
	    = new int[(((Class241_Sub17) this).aClass166_Sub1_8986.anInt2055
		       * 266270313
		       * (((Class241_Sub17) this).aClass166_Sub1_8986.anInt2052
			  * -14610189))];
    }
    
    void method15033(int i, int i_49_, int i_50_) {
	((Class241_Sub17) this).anIntArray8992
	    [i_49_ * (((Class241_Sub17) this).aClass166_Sub1_8986.anInt2055
		      * 266270313) + i]
	    |= 1 << i_50_;
	((Class241_Sub17) this).anInt8991++;
    }
    
    void method15034(int i) {
	((Class241_Sub17) this).anInterface40_8990
	    = ((Class241_Sub17) this).aClass103_Sub3_8995.method15752(false);
	((Class241_Sub17) this).anInterface40_8990.method221(i * 4, 4);
	((Class241_Sub17) this).anInterface40_8990
	    .method268(0, i * 4, ((Class241_Sub17) this).aLong8996);
	((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493
	    .freeMemory(((Class241_Sub17) this).aLong8996);
    }
    
    void method15035(int i) {
	((Class241_Sub17) this).anInterface40_8990
	    = ((Class241_Sub17) this).aClass103_Sub3_8995.method15752(false);
	((Class241_Sub17) this).anInterface40_8990.method221(i * 4, 4);
	((Class241_Sub17) this).anInterface40_8990
	    .method268(0, i * 4, ((Class241_Sub17) this).aLong8996);
	((Class241_Sub17) this).aClass103_Sub3_8995.anUnsafe9493
	    .freeMemory(((Class241_Sub17) this).aLong8996);
    }
    
    void method15036(int[] is, int i) {
	((Class241_Sub17) this).anInt8993 = 0;
	((Class241_Sub17) this).anInt8994 = 32767;
	((Class241_Sub17) this).anInt8989 = -32768;
	ByteBuffer bytebuffer
	    = ((Class241_Sub17) this).aClass103_Sub3_8995.aByteBuffer9490;
	for (int i_51_ = 0; i_51_ < i; i_51_++) {
	    int i_52_ = is[i_51_];
	    short[] is_53_ = (((Class166_Sub1)
			       ((Class241_Sub17) this).aClass166_Sub1_8986)
			      .aShortArrayArray9791[i_52_]);
	    int i_54_ = ((Class241_Sub17) this).anIntArray8992[i_52_];
	    if (i_54_ != 0 && is_53_ != null) {
		int i_55_ = 0;
		int i_56_ = 0;
		while (i_56_ < is_53_.length) {
		    if ((i_54_ & 1 << i_55_++) != 0) {
			for (int i_57_ = 0; i_57_ < 3; i_57_++) {
			    int i_58_ = is_53_[i_56_++] & 0xffff;
			    if (i_58_ > ((Class241_Sub17) this).anInt8989)
				((Class241_Sub17) this).anInt8989 = i_58_;
			    if (i_58_ < ((Class241_Sub17) this).anInt8994)
				((Class241_Sub17) this).anInt8994 = i_58_;
			    bytebuffer.putShort((short) i_58_);
			}
			((Class241_Sub17) this).anInt8993 += 3;
		    } else
			i_56_ += 3;
		}
	    }
	}
    }
}
