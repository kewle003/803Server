/* Class96_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class96_Sub4 extends Class96
{
    Interface41 anInterface41_9655;
    Class103_Sub3 aClass103_Sub3_9656;
    Interface40 anInterface40_9657;
    byte[] aByteArray9658 = new byte[512];
    int anInt9659;
    int anInt9660;
    
    void method2129(char c, int i, int i_0_, int i_1_, boolean bool) {
	if (((Class96_Sub4) this).aClass103_Sub3_9656.method15624()
	    != Class376.aClass376_5635) {
	    i += ((Class96_Sub4) this).aByteArray9658[c * '\002'];
	    i_0_ += ((Class96_Sub4) this).aByteArray9658[c * '\002' + '\001'];
	    ((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		.aClass390_9547.method6972
		((float) i, (float) i_0_,
		 (float) (i + ((Class96_Sub4) this).anInt9660),
		 (float) (i_0_ + ((Class96_Sub4) this).anInt9660),
		 ((float) (c % '\020') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method242()),
		 ((float) (c / '\020') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method233()),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method242()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method233()),
		 ((Class96_Sub4) this).anInterface41_9655, i_1_);
	} else {
	    ((Class96_Sub4) this).aClass103_Sub3_9656.method15654();
	    ((Class96_Sub4) this).aClass103_Sub3_9656.method15640(1);
	    Class352 class352
		= (((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class96_Sub4) this).anInterface41_9655;
	    class352.method6408(0, i_1_);
	    float f
		= (float) ((Class96_Sub4) this).aClass103_Sub3_9656.method2237
			      ((byte) 4).method2655();
	    float f_2_
		= (float) ((Class96_Sub4) this).aClass103_Sub3_9656.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5206(2.0F / f, 2.0F / f_2_, 1.0F,
					       1.0F);
	    class352.aClass268_5428.aFloatArray4353[12]
		= (((float) i
		    + ((Class96_Sub4) this).aClass103_Sub3_9656.method15622())
		   * 2.0F / f) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= (((float) i_0_
		    + ((Class96_Sub4) this).aClass103_Sub3_9656.method15622())
		   * 2.0F / f_2_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5198();
	    class352.anInterface40_5432
		= ((Class96_Sub4) this).anInterface40_9657;
	    class352.anInt5434 = c * '\004';
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		   .aClass366_9485);
	    class352.method6410();
	}
    }
    
    void method2126(char c, int i, int i_3_, int i_4_, boolean bool) {
	if (((Class96_Sub4) this).aClass103_Sub3_9656.method15624()
	    != Class376.aClass376_5635) {
	    i += ((Class96_Sub4) this).aByteArray9658[c * '\002'];
	    i_3_ += ((Class96_Sub4) this).aByteArray9658[c * '\002' + '\001'];
	    ((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		.aClass390_9547.method6972
		((float) i, (float) i_3_,
		 (float) (i + ((Class96_Sub4) this).anInt9660),
		 (float) (i_3_ + ((Class96_Sub4) this).anInt9660),
		 ((float) (c % '\020') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method242()),
		 ((float) (c / '\020') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method233()),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method242()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method233()),
		 ((Class96_Sub4) this).anInterface41_9655, i_4_);
	} else {
	    ((Class96_Sub4) this).aClass103_Sub3_9656.method15654();
	    ((Class96_Sub4) this).aClass103_Sub3_9656.method15640(1);
	    Class352 class352
		= (((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class96_Sub4) this).anInterface41_9655;
	    class352.method6408(0, i_4_);
	    float f
		= (float) ((Class96_Sub4) this).aClass103_Sub3_9656.method2237
			      ((byte) 4).method2655();
	    float f_5_
		= (float) ((Class96_Sub4) this).aClass103_Sub3_9656.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5206(2.0F / f, 2.0F / f_5_, 1.0F,
					       1.0F);
	    class352.aClass268_5428.aFloatArray4353[12]
		= (((float) i
		    + ((Class96_Sub4) this).aClass103_Sub3_9656.method15622())
		   * 2.0F / f) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= (((float) i_3_
		    + ((Class96_Sub4) this).aClass103_Sub3_9656.method15622())
		   * 2.0F / f_5_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5198();
	    class352.anInterface40_5432
		= ((Class96_Sub4) this).anInterface40_9657;
	    class352.anInt5434 = c * '\004';
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		   .aClass366_9485);
	    class352.method6410();
	}
    }
    
    void method2140(char c, int i, int i_6_, int i_7_, boolean bool,
		    Class135 class135, int i_8_, int i_9_) {
	/* empty */
    }
    
    void method2123(char c, int i, int i_10_, int i_11_, boolean bool) {
	if (((Class96_Sub4) this).aClass103_Sub3_9656.method15624()
	    != Class376.aClass376_5635) {
	    i += ((Class96_Sub4) this).aByteArray9658[c * '\002'];
	    i_10_ += ((Class96_Sub4) this).aByteArray9658[c * '\002' + '\001'];
	    ((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		.aClass390_9547.method6972
		((float) i, (float) i_10_,
		 (float) (i + ((Class96_Sub4) this).anInt9660),
		 (float) (i_10_ + ((Class96_Sub4) this).anInt9660),
		 ((float) (c % '\020') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method242()),
		 ((float) (c / '\020') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method233()),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method242()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method233()),
		 ((Class96_Sub4) this).anInterface41_9655, i_11_);
	} else {
	    ((Class96_Sub4) this).aClass103_Sub3_9656.method15654();
	    ((Class96_Sub4) this).aClass103_Sub3_9656.method15640(1);
	    Class352 class352
		= (((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class96_Sub4) this).anInterface41_9655;
	    class352.method6408(0, i_11_);
	    float f
		= (float) ((Class96_Sub4) this).aClass103_Sub3_9656.method2237
			      ((byte) 4).method2655();
	    float f_12_
		= (float) ((Class96_Sub4) this).aClass103_Sub3_9656.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5206(2.0F / f, 2.0F / f_12_, 1.0F,
					       1.0F);
	    class352.aClass268_5428.aFloatArray4353[12]
		= (((float) i
		    + ((Class96_Sub4) this).aClass103_Sub3_9656.method15622())
		   * 2.0F / f) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= (((float) i_10_
		    + ((Class96_Sub4) this).aClass103_Sub3_9656.method15622())
		   * 2.0F / f_12_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5198();
	    class352.anInterface40_5432
		= ((Class96_Sub4) this).anInterface40_9657;
	    class352.anInt5434 = c * '\004';
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		   .aClass366_9485);
	    class352.method6410();
	}
    }
    
    void method2131(char c, int i, int i_13_, int i_14_, boolean bool,
		    Class135 class135, int i_15_, int i_16_) {
	/* empty */
    }
    
    void method2153(char c, int i, int i_17_, int i_18_, boolean bool) {
	if (((Class96_Sub4) this).aClass103_Sub3_9656.method15624()
	    != Class376.aClass376_5635) {
	    i += ((Class96_Sub4) this).aByteArray9658[c * '\002'];
	    i_17_ += ((Class96_Sub4) this).aByteArray9658[c * '\002' + '\001'];
	    ((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		.aClass390_9547.method6972
		((float) i, (float) i_17_,
		 (float) (i + ((Class96_Sub4) this).anInt9660),
		 (float) (i_17_ + ((Class96_Sub4) this).anInt9660),
		 ((float) (c % '\020') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method242()),
		 ((float) (c / '\020') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method233()),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method242()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method233()),
		 ((Class96_Sub4) this).anInterface41_9655, i_18_);
	} else {
	    ((Class96_Sub4) this).aClass103_Sub3_9656.method15654();
	    ((Class96_Sub4) this).aClass103_Sub3_9656.method15640(1);
	    Class352 class352
		= (((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class96_Sub4) this).anInterface41_9655;
	    class352.method6408(0, i_18_);
	    float f
		= (float) ((Class96_Sub4) this).aClass103_Sub3_9656.method2237
			      ((byte) 4).method2655();
	    float f_19_
		= (float) ((Class96_Sub4) this).aClass103_Sub3_9656.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5206(2.0F / f, 2.0F / f_19_, 1.0F,
					       1.0F);
	    class352.aClass268_5428.aFloatArray4353[12]
		= (((float) i
		    + ((Class96_Sub4) this).aClass103_Sub3_9656.method15622())
		   * 2.0F / f) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= (((float) i_17_
		    + ((Class96_Sub4) this).aClass103_Sub3_9656.method15622())
		   * 2.0F / f_19_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5198();
	    class352.anInterface40_5432
		= ((Class96_Sub4) this).anInterface40_9657;
	    class352.anInt5434 = c * '\004';
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		   .aClass366_9485);
	    class352.method6410();
	}
    }
    
    void method2154(char c, int i, int i_20_, int i_21_, boolean bool) {
	if (((Class96_Sub4) this).aClass103_Sub3_9656.method15624()
	    != Class376.aClass376_5635) {
	    i += ((Class96_Sub4) this).aByteArray9658[c * '\002'];
	    i_20_ += ((Class96_Sub4) this).aByteArray9658[c * '\002' + '\001'];
	    ((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		.aClass390_9547.method6972
		((float) i, (float) i_20_,
		 (float) (i + ((Class96_Sub4) this).anInt9660),
		 (float) (i_20_ + ((Class96_Sub4) this).anInt9660),
		 ((float) (c % '\020') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method242()),
		 ((float) (c / '\020') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method233()),
		 ((float) (c % '\020' + '\001') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method242()),
		 ((float) (c / '\020' + '\001') / 16.0F
		  * ((Class96_Sub4) this).anInterface41_9655.method233()),
		 ((Class96_Sub4) this).anInterface41_9655, i_21_);
	} else {
	    ((Class96_Sub4) this).aClass103_Sub3_9656.method15654();
	    ((Class96_Sub4) this).aClass103_Sub3_9656.method15640(1);
	    Class352 class352
		= (((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		   .aClass352_9593);
	    class352.anInterface41_5433
		= ((Class96_Sub4) this).anInterface41_9655;
	    class352.method6408(0, i_21_);
	    float f
		= (float) ((Class96_Sub4) this).aClass103_Sub3_9656.method2237
			      ((byte) 4).method2655();
	    float f_22_
		= (float) ((Class96_Sub4) this).aClass103_Sub3_9656.method2237
			      ((byte) 4).method2654();
	    class352.aClass268_5428.method5206(2.0F / f, 2.0F / f_22_, 1.0F,
					       1.0F);
	    class352.aClass268_5428.aFloatArray4353[12]
		= (((float) i
		    + ((Class96_Sub4) this).aClass103_Sub3_9656.method15622())
		   * 2.0F / f) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[13]
		= (((float) i_20_
		    + ((Class96_Sub4) this).aClass103_Sub3_9656.method15622())
		   * 2.0F / f_22_) - 1.0F;
	    class352.aClass268_5428.aFloatArray4353[14] = -1.0F;
	    class352.aClass268_5431.method5198();
	    class352.anInterface40_5432
		= ((Class96_Sub4) this).anInterface40_9657;
	    class352.anInt5434 = c * '\004';
	    class352.aClass366_5435
		= (((Class103_Sub3) ((Class96_Sub4) this).aClass103_Sub3_9656)
		   .aClass366_9485);
	    class352.method6410();
	}
    }
    
    void method2151(char c, int i, int i_23_, int i_24_, boolean bool,
		    Class135 class135, int i_25_, int i_26_) {
	/* empty */
    }
    
    Class96_Sub4(Class103_Sub3 class103_sub3, Class639 class639,
		 Class108[] class108s, boolean bool) {
	super(class103_sub3, class639);
	((Class96_Sub4) this).aClass103_Sub3_9656 = class103_sub3;
	((Class96_Sub4) this).anInt9660 = 0;
	for (int i = 0; i < 256; i++) {
	    Class108 class108 = class108s[i];
	    if (class108.method2694() > ((Class96_Sub4) this).anInt9660)
		((Class96_Sub4) this).anInt9660 = class108.method2694();
	    if (class108.method2698() > ((Class96_Sub4) this).anInt9660)
		((Class96_Sub4) this).anInt9660 = class108.method2698();
	}
	((Class96_Sub4) this).anInt9659 = ((Class96_Sub4) this).anInt9660 * 16;
	if (bool) {
	    byte[] is = new byte[(((Class96_Sub4) this).anInt9659
				  * ((Class96_Sub4) this).anInt9659)];
	    for (int i = 0; i < 256; i++) {
		Class108 class108 = class108s[i];
		int i_27_ = class108.method2694();
		int i_28_ = class108.method2698();
		int i_29_ = i % 16 * ((Class96_Sub4) this).anInt9660;
		int i_30_ = i / 16 * ((Class96_Sub4) this).anInt9660;
		int i_31_ = i_30_ * ((Class96_Sub4) this).anInt9659 + i_29_;
		int i_32_ = 0;
		if (class108.method2691()) {
		    Class108_Sub2 class108_sub2 = (Class108_Sub2) class108s[i];
		    if (!class108_sub2.method2692()) {
			byte[] is_33_ = class108_sub2.aByteArray9309;
			for (int i_34_ = 0; i_34_ < i_27_; i_34_++) {
			    for (int i_35_ = 0; i_35_ < i_28_; i_35_++)
				is[i_31_++]
				    = (byte) (is_33_[i_32_++] == 0 ? 0 : -1);
			    i_31_ += ((Class96_Sub4) this).anInt9659 - i_28_;
			}
		    } else {
			byte[] is_36_ = class108_sub2.aByteArray9310;
			for (int i_37_ = 0; i_37_ < i_27_; i_37_++) {
			    for (int i_38_ = 0; i_38_ < i_28_; i_38_++)
				is[i_31_++] = is_36_[i_32_++];
			    i_31_ += ((Class96_Sub4) this).anInt9659 - i_28_;
			}
		    }
		} else {
		    Class108_Sub1 class108_sub1 = (Class108_Sub1) class108s[i];
		    int[] is_39_ = class108_sub1.method2707(false);
		    if (!class108_sub1.method2692()) {
			for (int i_40_ = 0; i_40_ < i_27_; i_40_++) {
			    for (int i_41_ = 0; i_41_ < i_28_; i_41_++) {
				int i_42_ = is_39_[i_32_++];
				byte i_43_ = (byte) (((i_42_ >> 16 & 0xff) * 3
						      + (i_42_ >> 8 & 0xff) * 4
						      + (i_42_ & 0xff))
						     >> 3);
				is[i_31_++] = i_43_;
			    }
			    i_31_ += ((Class96_Sub4) this).anInt9659 - i_28_;
			}
		    } else {
			for (int i_44_ = 0; i_44_ < i_27_; i_44_++) {
			    for (int i_45_ = 0; i_45_ < i_28_; i_45_++)
				is[i_31_++]
				    = (byte) (is_39_[i_32_++] >> 24 & 0xff);
			    i_31_ += ((Class96_Sub4) this).anInt9659 - i_28_;
			}
		    }
		}
	    }
	    int[] is_46_ = new int[is.length];
	    for (int i = 0; i < is.length; i++)
		is_46_[i] = is[i] << 24 | 0xffffff;
	    ((Class96_Sub4) this).anInterface41_9655
		= class103_sub3.method15828(((Class96_Sub4) this).anInt9659,
					    ((Class96_Sub4) this).anInt9659,
					    false, is_46_);
	} else {
	    int[] is = new int[(((Class96_Sub4) this).anInt9659
				* ((Class96_Sub4) this).anInt9659)];
	    for (int i = 0; i < 256; i++) {
		Class108 class108 = class108s[i];
		int i_47_ = class108.method2694();
		int i_48_ = class108.method2698();
		int i_49_ = i % 16 * ((Class96_Sub4) this).anInt9660;
		int i_50_ = i / 16 * ((Class96_Sub4) this).anInt9660;
		int i_51_ = i_50_ * ((Class96_Sub4) this).anInt9659 + i_49_;
		int i_52_ = 0;
		if (class108.method2691()) {
		    Class108_Sub2 class108_sub2 = (Class108_Sub2) class108s[i];
		    int[] is_53_ = class108_sub2.anIntArray9308;
		    byte[] is_54_ = class108_sub2.aByteArray9310;
		    byte[] is_55_ = class108_sub2.aByteArray9309;
		    if (is_54_ != null) {
			for (int i_56_ = 0; i_56_ < i_47_; i_56_++) {
			    for (int i_57_ = 0; i_57_ < i_48_; i_57_++) {
				is[i_51_++] = (is_54_[i_52_] << 24
					       | is_53_[is_55_[i_52_] & 0xff]);
				i_52_++;
			    }
			    i_51_ += ((Class96_Sub4) this).anInt9659 - i_48_;
			}
		    } else {
			for (int i_58_ = 0; i_58_ < i_47_; i_58_++) {
			    for (int i_59_ = 0; i_59_ < i_48_; i_59_++) {
				int i_60_;
				if ((i_60_ = is_55_[i_52_++]) != 0)
				    is[i_51_++]
					= ~0xffffff | is_53_[i_60_ & 0xff];
				else
				    i_51_++;
			    }
			    i_51_ += ((Class96_Sub4) this).anInt9659 - i_48_;
			}
		    }
		} else {
		    Class108_Sub1 class108_sub1 = (Class108_Sub1) class108s[i];
		    int[] is_61_ = class108_sub1.method2707(false);
		    if (!class108_sub1.method2692()) {
			for (int i_62_ = 0; i_62_ < i_47_; i_62_++) {
			    for (int i_63_ = 0; i_63_ < i_48_; i_63_++) {
				int i_64_ = is_61_[i_52_] & 0xffffff;
				is[i_51_++]
				    = (i_64_ == 0 ? 0 : 255) << 24 | i_64_;
				i_52_++;
			    }
			    i_51_ += ((Class96_Sub4) this).anInt9659 - i_48_;
			}
		    } else {
			for (int i_65_ = 0; i_65_ < i_47_; i_65_++) {
			    for (int i_66_ = 0; i_66_ < i_48_; i_66_++)
				is[i_51_++] = is_61_[i_52_++];
			    i_51_ += ((Class96_Sub4) this).anInt9659 - i_48_;
			}
		    }
		}
	    }
	    ((Class96_Sub4) this).anInterface41_9655
		= class103_sub3.method15828(((Class96_Sub4) this).anInt9659,
					    ((Class96_Sub4) this).anInt9659,
					    false, is);
	}
	((Class96_Sub4) this).anInterface41_9655
	    .method176(Class312.aClass312_4831);
	((Class96_Sub4) this).anInterface40_9657
	    = class103_sub3.method15752(false);
	((Class96_Sub4) this).anInterface40_9657.method221(20480, 20);
	ByteBuffer bytebuffer
	    = ((Class96_Sub4) this).aClass103_Sub3_9656.aByteBuffer9490;
	bytebuffer.clear();
	float f = (((Class96_Sub4) this).anInterface41_9655
		       .method225((float) ((Class96_Sub4) this).anInt9659)
		   / (float) ((Class96_Sub4) this).anInt9659);
	float f_67_ = (((Class96_Sub4) this).anInterface41_9655
			   .method226((float) ((Class96_Sub4) this).anInt9659)
		       / (float) ((Class96_Sub4) this).anInt9659);
	for (int i = 0; i < 256; i++) {
	    Class108 class108 = class108s[i];
	    int i_68_ = class108.method2694();
	    int i_69_ = class108.method2698();
	    int i_70_ = class108.method2697();
	    int i_71_ = class108.method2695();
	    float f_72_ = (float) (i % 16 * ((Class96_Sub4) this).anInt9660);
	    float f_73_ = (float) (i / 16 * ((Class96_Sub4) this).anInt9660);
	    float f_74_ = f_72_ * f;
	    float f_75_ = f_73_ * f_67_;
	    float f_76_ = (f_72_ + (float) i_69_) * f;
	    float f_77_ = (f_73_ + (float) i_68_) * f_67_;
	    bytebuffer.putFloat((float) i_71_);
	    bytebuffer.putFloat((float) i_70_);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_74_);
	    bytebuffer.putFloat(f_75_);
	    bytebuffer.putFloat((float) i_71_);
	    bytebuffer.putFloat((float) (i_70_ + i_68_));
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_74_);
	    bytebuffer.putFloat(f_77_);
	    bytebuffer.putFloat((float) (i_71_ + i_69_));
	    bytebuffer.putFloat((float) (i_70_ + i_68_));
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_76_);
	    bytebuffer.putFloat(f_77_);
	    bytebuffer.putFloat((float) (i_71_ + i_69_));
	    bytebuffer.putFloat((float) i_70_);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(f_76_);
	    bytebuffer.putFloat(f_75_);
	}
	((Class96_Sub4) this).anInterface40_9657.method268
	    (0, bytebuffer.position(),
	     ((Class96_Sub4) this).aClass103_Sub3_9656.aLong9491);
	for (int i = 0; i < 256; i++) {
	    Class108 class108 = class108s[i];
	    ((Class96_Sub4) this).aByteArray9658[i * 2]
		= (byte) class108.method2695();
	    ((Class96_Sub4) this).aByteArray9658[i * 2 + 1]
		= (byte) class108.method2697();
	}
    }
}
