/* Class391 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class391
{
    int anInt5735;
    Interface40 anInterface40_5736;
    Interface40 anInterface40_5737;
    static float aFloat5738;
    int anInt5739 = 64;
    int anInt5740 = 768;
    int anInt5741 = 1600;
    int anInt5742 = Class436.method7795(1600, (byte) -8);
    int[] anIntArray5743;
    Class247_Sub1_Sub1[][] aClass247_Sub1_Sub1ArrayArray5744;
    int[] anIntArray5745;
    int[] anIntArray5746;
    int anInt5747 = 64;
    Class247_Sub1_Sub1[][] aClass247_Sub1_Sub1ArrayArray5748;
    Interface33 anInterface33_5749;
    Class366 aClass366_5750;
    
    Class391(Class103_Sub3 class103_sub3) {
	((Class391) this).anIntArray5746 = new int[8191];
	((Class391) this).anIntArray5745 = new int[1600];
	((Class391) this).anIntArray5743 = new int[64];
	((Class391) this).aClass247_Sub1_Sub1ArrayArray5744
	    = new Class247_Sub1_Sub1[1600][64];
	((Class391) this).aClass247_Sub1_Sub1ArrayArray5748
	    = new Class247_Sub1_Sub1[64][768];
	((Class391) this).anInt5735 = 0;
	((Class391) this).aClass366_5750
	    = (class103_sub3.method15697
	       (new Class314[]
		{ new Class314(new Class367[] { Class367.aClass367_5545,
						Class367.aClass367_5547,
						Class367.aClass367_5549 }),
		  new Class314(Class367.aClass367_5548) }));
	((Class391) this).anInterface40_5737 = class103_sub3.method15752(true);
	((Class391) this).anInterface40_5736
	    = class103_sub3.method15752(false);
	((Class391) this).anInterface40_5736.method221(393168, 12);
	((Class391) this).anInterface33_5749
	    = class103_sub3.method15714(false);
	((Class391) this).anInterface33_5749.method185(49146);
	ByteBuffer bytebuffer = class103_sub3.aByteBuffer9490;
	bytebuffer.clear();
	for (int i = 0; i < 8191; i++) {
	    int i_0_ = i * 4;
	    bytebuffer.putShort((short) i_0_);
	    bytebuffer.putShort((short) (i_0_ + 1));
	    bytebuffer.putShort((short) (i_0_ + 2));
	    bytebuffer.putShort((short) (i_0_ + 2));
	    bytebuffer.putShort((short) (i_0_ + 3));
	    bytebuffer.putShort((short) i_0_);
	}
	((Class391) this).anInterface33_5749
	    .method268(0, bytebuffer.position(), class103_sub3.aLong9491);
	bytebuffer.clear();
	for (int i = 0; i < 8191; i++) {
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(-1.0F);
	    bytebuffer.putFloat(0.0F);
	}
	((Class391) this).anInterface40_5736
	    .method268(0, bytebuffer.position(), class103_sub3.aLong9491);
    }
    
    void method6996(Class103_Sub3 class103_sub3, int i, boolean bool) {
	int i_1_ = 0;
	Class268 class268 = class103_sub3.aClass268_9504;
	float f = class268.aFloatArray4353[0];
	float f_2_ = class268.aFloatArray4353[4];
	float f_3_ = class268.aFloatArray4353[8];
	float f_4_ = class268.aFloatArray4353[1];
	float f_5_ = class268.aFloatArray4353[5];
	float f_6_ = class268.aFloatArray4353[9];
	float f_7_ = f + f_4_;
	float f_8_ = f_2_ + f_5_;
	float f_9_ = f_3_ + f_6_;
	float f_10_ = f - f_4_;
	float f_11_ = f_2_ - f_5_;
	float f_12_ = f_3_ - f_6_;
	float f_13_ = f_4_ - f;
	float f_14_ = f_5_ - f_2_;
	float f_15_ = f_6_ - f_3_;
	float[] fs = new float[3];
	float[] fs_16_ = new float[3];
	class103_sub3.aClass268_9511
	    .method5200(((Class103_Sub3) class103_sub3).aClass268_9505);
	ByteBuffer bytebuffer = class103_sub3.aByteBuffer9490;
	bytebuffer.clear();
	for (int i_17_ = i - 1; i_17_ >= 0; i_17_--) {
	    int i_18_ = (((Class391) this).anIntArray5745[i_17_] > 64 ? 64
			 : ((Class391) this).anIntArray5745[i_17_]);
	    if (i_18_ > 0) {
		for (int i_19_ = i_18_ - 1; i_19_ >= 0; i_19_--) {
		    Class247_Sub1_Sub1 class247_sub1_sub1
			= (((Class391) this).aClass247_Sub1_Sub1ArrayArray5744
			   [i_17_][i_19_]);
		    int i_20_ = class247_sub1_sub1.anInt11065;
		    byte i_21_ = (byte) (i_20_ >> 16);
		    byte i_22_ = (byte) (i_20_ >> 8);
		    byte i_23_ = (byte) i_20_;
		    byte i_24_ = (byte) (i_20_ >>> 24);
		    if (((Class103_Sub3) class103_sub3).anInt9633 == 0) {
			byte i_25_ = i_21_;
			i_21_ = i_23_;
			i_23_ = i_25_;
		    }
		    float f_26_
			= (float) (class247_sub1_sub1.anInt11064 >> 12);
		    float f_27_
			= (float) (class247_sub1_sub1.anInt11061 >> 12);
		    float f_28_
			= (float) (class247_sub1_sub1.anInt11060 >> 12);
		    int i_29_ = class247_sub1_sub1.anInt11058 >> 12;
		    if (class247_sub1_sub1.aShort11066 != 0) {
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5232
			    (class247_sub1_sub1.aShort11066, i_29_, i_29_,
			     0.0F, 0.0F, 0.0F);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5202(class103_sub3.aClass268_9511);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5208(1.0F, 0.0F, 0.0F, fs);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5208(0.0F, 1.0F, 0.0F, fs_16_);
			bytebuffer.putFloat(f_26_ - fs[0] - fs_16_[0]);
			bytebuffer.putFloat(f_27_ - fs[1] - fs_16_[1]);
			bytebuffer.putFloat(f_28_ - fs[2] - fs_16_[2]);
			bytebuffer.put(i_21_);
			bytebuffer.put(i_22_);
			bytebuffer.put(i_23_);
			bytebuffer.put(i_24_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_26_ - fs[0] + fs_16_[0]);
			bytebuffer.putFloat(f_27_ - fs[1] + fs_16_[1]);
			bytebuffer.putFloat(f_28_ - fs[2] + fs_16_[2]);
			bytebuffer.put(i_21_);
			bytebuffer.put(i_22_);
			bytebuffer.put(i_23_);
			bytebuffer.put(i_24_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_26_ + fs[0] + fs_16_[0]);
			bytebuffer.putFloat(f_27_ + fs[1] + fs_16_[1]);
			bytebuffer.putFloat(f_28_ + fs[2] + fs_16_[2]);
			bytebuffer.put(i_21_);
			bytebuffer.put(i_22_);
			bytebuffer.put(i_23_);
			bytebuffer.put(i_24_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_26_ + fs[0] - fs_16_[0]);
			bytebuffer.putFloat(f_27_ + fs[1] - fs_16_[1]);
			bytebuffer.putFloat(f_28_ + fs[2] - fs_16_[2]);
			bytebuffer.put(i_21_);
			bytebuffer.put(i_22_);
			bytebuffer.put(i_23_);
			bytebuffer.put(i_24_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    } else {
			bytebuffer.putFloat(f_26_ + f_7_ * (float) -i_29_);
			bytebuffer.putFloat(f_27_ + f_8_ * (float) -i_29_);
			bytebuffer.putFloat(f_28_ + f_9_ * (float) -i_29_);
			bytebuffer.put(i_21_);
			bytebuffer.put(i_22_);
			bytebuffer.put(i_23_);
			bytebuffer.put(i_24_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_26_ + f_13_ * (float) i_29_);
			bytebuffer.putFloat(f_27_ + f_14_ * (float) i_29_);
			bytebuffer.putFloat(f_28_ + f_15_ * (float) i_29_);
			bytebuffer.put(i_21_);
			bytebuffer.put(i_22_);
			bytebuffer.put(i_23_);
			bytebuffer.put(i_24_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_26_ + f_7_ * (float) i_29_);
			bytebuffer.putFloat(f_27_ + f_8_ * (float) i_29_);
			bytebuffer.putFloat(f_28_ + f_9_ * (float) i_29_);
			bytebuffer.put(i_21_);
			bytebuffer.put(i_22_);
			bytebuffer.put(i_23_);
			bytebuffer.put(i_24_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_26_ + f_10_ * (float) i_29_);
			bytebuffer.putFloat(f_27_ + f_11_ * (float) i_29_);
			bytebuffer.putFloat(f_28_ + f_12_ * (float) i_29_);
			bytebuffer.put(i_21_);
			bytebuffer.put(i_22_);
			bytebuffer.put(i_23_);
			bytebuffer.put(i_24_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    }
		    i_1_++;
		}
		if (((Class391) this).anIntArray5745[i_17_] > 64) {
		    int i_30_
			= ((Class391) this).anIntArray5745[i_17_] - 64 - 1;
		    for (int i_31_
			     = ((Class391) this).anIntArray5743[i_30_] - 1;
			 i_31_ >= 0; i_31_--) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (((Class391) this)
			       .aClass247_Sub1_Sub1ArrayArray5748[i_30_]
			       [i_31_]);
			int i_32_ = class247_sub1_sub1.anInt11065;
			byte i_33_ = (byte) (i_32_ >> 16);
			byte i_34_ = (byte) (i_32_ >> 8);
			byte i_35_ = (byte) i_32_;
			byte i_36_ = (byte) (i_32_ >>> 24);
			float f_37_
			    = (float) (class247_sub1_sub1.anInt11064 >> 12);
			float f_38_
			    = (float) (class247_sub1_sub1.anInt11061 >> 12);
			float f_39_
			    = (float) (class247_sub1_sub1.anInt11060 >> 12);
			int i_40_ = class247_sub1_sub1.anInt11058 >> 12;
			if (((Class103_Sub3) class103_sub3).anInt9633 == 0) {
			    byte i_41_ = i_33_;
			    i_33_ = i_35_;
			    i_35_ = i_41_;
			}
			if (class247_sub1_sub1.aShort11066 != 0) {
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5232
				(class247_sub1_sub1.aShort11066, i_40_, i_40_,
				 0.0F, 0.0F, 0.0F);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5202(class103_sub3.aClass268_9511);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5208(1.0F, 0.0F, 0.0F, fs);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5208(0.0F, 1.0F, 0.0F, fs_16_);
			    bytebuffer.putFloat(f_37_ - fs[0] - fs_16_[0]);
			    bytebuffer.putFloat(f_38_ - fs[1] - fs_16_[1]);
			    bytebuffer.putFloat(f_39_ - fs[2] - fs_16_[2]);
			    bytebuffer.put(i_33_);
			    bytebuffer.put(i_34_);
			    bytebuffer.put(i_35_);
			    bytebuffer.put(i_36_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_37_ - fs[0] + fs_16_[0]);
			    bytebuffer.putFloat(f_38_ - fs[1] + fs_16_[1]);
			    bytebuffer.putFloat(f_39_ - fs[2] + fs_16_[2]);
			    bytebuffer.put(i_33_);
			    bytebuffer.put(i_34_);
			    bytebuffer.put(i_35_);
			    bytebuffer.put(i_36_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_37_ + fs[0] + fs_16_[0]);
			    bytebuffer.putFloat(f_38_ + fs[1] + fs_16_[1]);
			    bytebuffer.putFloat(f_39_ + fs[2] + fs_16_[2]);
			    bytebuffer.put(i_33_);
			    bytebuffer.put(i_34_);
			    bytebuffer.put(i_35_);
			    bytebuffer.put(i_36_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_37_ + fs[0] - fs_16_[0]);
			    bytebuffer.putFloat(f_38_ + fs[1] - fs_16_[1]);
			    bytebuffer.putFloat(f_39_ + fs[2] - fs_16_[2]);
			    bytebuffer.put(i_33_);
			    bytebuffer.put(i_34_);
			    bytebuffer.put(i_35_);
			    bytebuffer.put(i_36_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			} else {
			    bytebuffer.putFloat(f_37_ + f_7_ * (float) -i_40_);
			    bytebuffer.putFloat(f_38_ + f_8_ * (float) -i_40_);
			    bytebuffer.putFloat(f_39_ + f_9_ * (float) -i_40_);
			    bytebuffer.put(i_33_);
			    bytebuffer.put(i_34_);
			    bytebuffer.put(i_35_);
			    bytebuffer.put(i_36_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_37_ + f_13_ * (float) i_40_);
			    bytebuffer.putFloat(f_38_ + f_14_ * (float) i_40_);
			    bytebuffer.putFloat(f_39_ + f_15_ * (float) i_40_);
			    bytebuffer.put(i_33_);
			    bytebuffer.put(i_34_);
			    bytebuffer.put(i_35_);
			    bytebuffer.put(i_36_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_37_ + f_7_ * (float) i_40_);
			    bytebuffer.putFloat(f_38_ + f_8_ * (float) i_40_);
			    bytebuffer.putFloat(f_39_ + f_9_ * (float) i_40_);
			    bytebuffer.put(i_33_);
			    bytebuffer.put(i_34_);
			    bytebuffer.put(i_35_);
			    bytebuffer.put(i_36_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_37_ + f_10_ * (float) i_40_);
			    bytebuffer.putFloat(f_38_ + f_11_ * (float) i_40_);
			    bytebuffer.putFloat(f_39_ + f_12_ * (float) i_40_);
			    bytebuffer.put(i_33_);
			    bytebuffer.put(i_34_);
			    bytebuffer.put(i_35_);
			    bytebuffer.put(i_36_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			}
			i_1_++;
		    }
		}
	    }
	}
	((Class391) this).anInterface40_5737
	    .method268(0, bytebuffer.position(), class103_sub3.aLong9491);
	class103_sub3.method15955(0, ((Class391) this).anInterface40_5737);
	class103_sub3.method15955(1, ((Class391) this).anInterface40_5736);
	class103_sub3.method15716(((Class391) this).aClass366_5750);
	Class358 class358 = ((Class103_Sub3) class103_sub3).aClass358_9595;
	class358.method6468(i_1_, bool);
    }
    
    void method6997() {
	((Class391) this).anInterface40_5737.method28();
    }
    
    void method6998(Class103_Sub3 class103_sub3, Class98 class98) {
	class103_sub3.method2308(false);
	aFloat5738 = class103_sub3.aFloat9566;
	float f = class103_sub3.aClass268_9504.aFloatArray4353[2];
	float f_42_ = class103_sub3.aClass268_9504.aFloatArray4353[6];
	float f_43_ = class103_sub3.aClass268_9504.aFloatArray4353[10];
	float f_44_ = class103_sub3.aClass268_9504.aFloatArray4353[14];
	int i = 0;
	int i_45_ = 2147483647;
	int i_46_ = 0;
	Class247_Sub1 class247_sub1
	    = class98.aClass441_1353.aClass247_Sub1_6157;
	for (Class247_Sub1 class247_sub1_47_
		 = class247_sub1.aClass247_Sub1_10037;
	     class247_sub1_47_ != class247_sub1;
	     class247_sub1_47_ = class247_sub1_47_.aClass247_Sub1_10037) {
	    Class247_Sub1_Sub1 class247_sub1_sub1
		= (Class247_Sub1_Sub1) class247_sub1_47_;
	    int i_48_
		= (int) (f * (float) (class247_sub1_sub1.anInt11064 >> 12)
			 + f_42_ * (float) (class247_sub1_sub1.anInt11061
					    >> 12)
			 + f_43_ * (float) (class247_sub1_sub1.anInt11060
					    >> 12)
			 + f_44_);
	    if (i_48_ > i_46_)
		i_46_ = i_48_;
	    if (i_48_ < i_45_)
		i_45_ = i_48_;
	    ((Class391) this).anIntArray5746[i++] = i_48_;
	}
	int i_49_ = i_46_ - i_45_;
	int i_50_;
	if (i_49_ + 2 > 1600) {
	    i_50_ = (1 + Class436.method7795(i_49_, (byte) -111)
		     - ((Class391) this).anInt5742);
	    i_49_ = (i_49_ >> i_50_) + 2;
	} else {
	    i_50_ = 0;
	    i_49_ += 2;
	}
	class103_sub3.method15718(((Class391) this).anInterface33_5749);
	Class358 class358 = ((Class103_Sub3) class103_sub3).aClass358_9595;
	class358.method6476(Class268.aClass268_4354);
	class358.aClass268_5474.method5198();
	class358.anInt5471 = -1;
	boolean bool = class103_sub3.anInt9613 > 0;
	if (bool) {
	    class358.aClass285_5472.method5548(0.0F, 0.0F, 1.0F,
					       -class103_sub3.aFloat9615);
	    class358.aClass287_5473.method5568
		((float) (class103_sub3.anInt9589 >> 16 & 0xff) / 255.0F,
		 (float) (class103_sub3.anInt9589 >> 8 & 0xff) / 255.0F,
		 (float) (class103_sub3.anInt9589 >> 0 & 0xff) / 255.0F);
	    class358.aClass285_5472
		.method5543(((Class103_Sub3) class103_sub3).aClass268_9645);
	    class358.aClass285_5472.method5531(1.0F
					       / (class103_sub3.aFloat9616
						  - class103_sub3.aFloat9615));
	} else {
	    class358.aClass285_5472.method5548(0.0F, 0.0F, 0.0F, 0.0F);
	    class358.aClass287_5473.method5568(0.0F, 0.0F, 0.0F);
	}
	method6999(class103_sub3, class247_sub1, i_49_, i_45_, i_50_, class358,
		   bool);
	if (class103_sub3.aFloat9566 != aFloat5738)
	    class103_sub3.method2311(aFloat5738);
	class103_sub3.method2308(true);
    }
    
    void method6999(Class103_Sub3 class103_sub3, Class247_Sub1 class247_sub1,
		    int i, int i_51_, int i_52_, Class358 class358,
		    boolean bool) {
	Class247_Sub1 class247_sub1_53_ = class247_sub1.aClass247_Sub1_10037;
	int i_54_ = 0;
	int i_55_ = -2;
	boolean bool_56_ = true;
	boolean bool_57_ = true;
	while (class247_sub1_53_ != class247_sub1) {
	    ((Class391) this).anInt5735 = 0;
	    for (int i_58_ = 0; i_58_ < i; i_58_++)
		((Class391) this).anIntArray5745[i_58_] = 0;
	    for (int i_59_ = 0; i_59_ < 64; i_59_++)
		((Class391) this).anIntArray5743[i_59_] = 0;
	    for (/**/; class247_sub1_53_ != class247_sub1;
		 class247_sub1_53_ = class247_sub1_53_.aClass247_Sub1_10037) {
		Class247_Sub1_Sub1 class247_sub1_sub1
		    = (Class247_Sub1_Sub1) class247_sub1_53_;
		if (bool_57_) {
		    i_55_ = class247_sub1_sub1.anInt11062;
		    bool_56_ = class247_sub1_sub1.aBool11067;
		    bool_57_ = false;
		}
		if (i_54_ > 0
		    && (i_55_ != class247_sub1_sub1.anInt11062
			|| bool_56_ != class247_sub1_sub1.aBool11067)) {
		    bool_57_ = true;
		    break;
		}
		method7000((((Class391) this).anIntArray5746[i_54_++] - i_51_
			    >> i_52_),
			   class247_sub1_sub1);
	    }
	    class358.anInterface41_5470 = null;
	    if (i_55_ >= 0) {
		Class101 class101
		    = class103_sub3.aClass107_1458.method2680(i_55_,
							      -1947077445);
		if (class101.anInt1403 * 218388063 != -1)
		    class358.anInterface41_5470
			= ((Class103_Sub3) class103_sub3).aClass379_9518
			      .method6844(class101);
	    }
	    if (bool_56_ && class103_sub3.aFloat9566 != aFloat5738)
		class103_sub3.method2311(aFloat5738);
	    else if (class103_sub3.aFloat9566 != 1.0F)
		class103_sub3.method2311(1.0F);
	    method6996(class103_sub3, i, bool);
	}
    }
    
    void method7000(int i, Class247_Sub1_Sub1 class247_sub1_sub1) {
	if (i < 1600) {
	    if (((Class391) this).anIntArray5745[i] < 64)
		((Class391) this).aClass247_Sub1_Sub1ArrayArray5744[i]
		    [((Class391) this).anIntArray5745[i]++]
		    = class247_sub1_sub1;
	    else {
		if (((Class391) this).anIntArray5745[i] == 64) {
		    if (((Class391) this).anInt5735 == 64)
			return;
		    ((Class391) this).anIntArray5745[i]
			+= 1 + ((Class391) this).anInt5735++;
		}
		((Class391) this).aClass247_Sub1_Sub1ArrayArray5748
		    [((Class391) this).anIntArray5745[i] - 64 - 1]
		    [((Class391) this).anIntArray5743
			 [((Class391) this).anIntArray5745[i] - 64 - 1]++]
		    = class247_sub1_sub1;
	    }
	}
    }
    
    void method7001(Class103_Sub3 class103_sub3, Class98 class98) {
	class103_sub3.method2308(false);
	aFloat5738 = class103_sub3.aFloat9566;
	float f = class103_sub3.aClass268_9504.aFloatArray4353[2];
	float f_60_ = class103_sub3.aClass268_9504.aFloatArray4353[6];
	float f_61_ = class103_sub3.aClass268_9504.aFloatArray4353[10];
	float f_62_ = class103_sub3.aClass268_9504.aFloatArray4353[14];
	int i = 0;
	int i_63_ = 2147483647;
	int i_64_ = 0;
	Class247_Sub1 class247_sub1
	    = class98.aClass441_1353.aClass247_Sub1_6157;
	for (Class247_Sub1 class247_sub1_65_
		 = class247_sub1.aClass247_Sub1_10037;
	     class247_sub1_65_ != class247_sub1;
	     class247_sub1_65_ = class247_sub1_65_.aClass247_Sub1_10037) {
	    Class247_Sub1_Sub1 class247_sub1_sub1
		= (Class247_Sub1_Sub1) class247_sub1_65_;
	    int i_66_
		= (int) (f * (float) (class247_sub1_sub1.anInt11064 >> 12)
			 + f_60_ * (float) (class247_sub1_sub1.anInt11061
					    >> 12)
			 + f_61_ * (float) (class247_sub1_sub1.anInt11060
					    >> 12)
			 + f_62_);
	    if (i_66_ > i_64_)
		i_64_ = i_66_;
	    if (i_66_ < i_63_)
		i_63_ = i_66_;
	    ((Class391) this).anIntArray5746[i++] = i_66_;
	}
	int i_67_ = i_64_ - i_63_;
	int i_68_;
	if (i_67_ + 2 > 1600) {
	    i_68_ = (1 + Class436.method7795(i_67_, (byte) -103)
		     - ((Class391) this).anInt5742);
	    i_67_ = (i_67_ >> i_68_) + 2;
	} else {
	    i_68_ = 0;
	    i_67_ += 2;
	}
	class103_sub3.method15718(((Class391) this).anInterface33_5749);
	Class358 class358 = ((Class103_Sub3) class103_sub3).aClass358_9595;
	class358.method6476(Class268.aClass268_4354);
	class358.aClass268_5474.method5198();
	class358.anInt5471 = -1;
	boolean bool = class103_sub3.anInt9613 > 0;
	if (bool) {
	    class358.aClass285_5472.method5548(0.0F, 0.0F, 1.0F,
					       -class103_sub3.aFloat9615);
	    class358.aClass287_5473.method5568
		((float) (class103_sub3.anInt9589 >> 16 & 0xff) / 255.0F,
		 (float) (class103_sub3.anInt9589 >> 8 & 0xff) / 255.0F,
		 (float) (class103_sub3.anInt9589 >> 0 & 0xff) / 255.0F);
	    class358.aClass285_5472
		.method5543(((Class103_Sub3) class103_sub3).aClass268_9645);
	    class358.aClass285_5472.method5531(1.0F
					       / (class103_sub3.aFloat9616
						  - class103_sub3.aFloat9615));
	} else {
	    class358.aClass285_5472.method5548(0.0F, 0.0F, 0.0F, 0.0F);
	    class358.aClass287_5473.method5568(0.0F, 0.0F, 0.0F);
	}
	method6999(class103_sub3, class247_sub1, i_67_, i_63_, i_68_, class358,
		   bool);
	if (class103_sub3.aFloat9566 != aFloat5738)
	    class103_sub3.method2311(aFloat5738);
	class103_sub3.method2308(true);
    }
    
    void method7002() {
	((Class391) this).anInterface40_5737.method28();
    }
    
    void method7003() {
	((Class391) this).anInterface40_5737.method28();
    }
    
    void method7004() {
	((Class391) this).anInterface40_5737.method28();
    }
    
    void method7005(Class103_Sub3 class103_sub3, int i, boolean bool) {
	int i_69_ = 0;
	Class268 class268 = class103_sub3.aClass268_9504;
	float f = class268.aFloatArray4353[0];
	float f_70_ = class268.aFloatArray4353[4];
	float f_71_ = class268.aFloatArray4353[8];
	float f_72_ = class268.aFloatArray4353[1];
	float f_73_ = class268.aFloatArray4353[5];
	float f_74_ = class268.aFloatArray4353[9];
	float f_75_ = f + f_72_;
	float f_76_ = f_70_ + f_73_;
	float f_77_ = f_71_ + f_74_;
	float f_78_ = f - f_72_;
	float f_79_ = f_70_ - f_73_;
	float f_80_ = f_71_ - f_74_;
	float f_81_ = f_72_ - f;
	float f_82_ = f_73_ - f_70_;
	float f_83_ = f_74_ - f_71_;
	float[] fs = new float[3];
	float[] fs_84_ = new float[3];
	class103_sub3.aClass268_9511
	    .method5200(((Class103_Sub3) class103_sub3).aClass268_9505);
	ByteBuffer bytebuffer = class103_sub3.aByteBuffer9490;
	bytebuffer.clear();
	for (int i_85_ = i - 1; i_85_ >= 0; i_85_--) {
	    int i_86_ = (((Class391) this).anIntArray5745[i_85_] > 64 ? 64
			 : ((Class391) this).anIntArray5745[i_85_]);
	    if (i_86_ > 0) {
		for (int i_87_ = i_86_ - 1; i_87_ >= 0; i_87_--) {
		    Class247_Sub1_Sub1 class247_sub1_sub1
			= (((Class391) this).aClass247_Sub1_Sub1ArrayArray5744
			   [i_85_][i_87_]);
		    int i_88_ = class247_sub1_sub1.anInt11065;
		    byte i_89_ = (byte) (i_88_ >> 16);
		    byte i_90_ = (byte) (i_88_ >> 8);
		    byte i_91_ = (byte) i_88_;
		    byte i_92_ = (byte) (i_88_ >>> 24);
		    if (((Class103_Sub3) class103_sub3).anInt9633 == 0) {
			byte i_93_ = i_89_;
			i_89_ = i_91_;
			i_91_ = i_93_;
		    }
		    float f_94_
			= (float) (class247_sub1_sub1.anInt11064 >> 12);
		    float f_95_
			= (float) (class247_sub1_sub1.anInt11061 >> 12);
		    float f_96_
			= (float) (class247_sub1_sub1.anInt11060 >> 12);
		    int i_97_ = class247_sub1_sub1.anInt11058 >> 12;
		    if (class247_sub1_sub1.aShort11066 != 0) {
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5232
			    (class247_sub1_sub1.aShort11066, i_97_, i_97_,
			     0.0F, 0.0F, 0.0F);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5202(class103_sub3.aClass268_9511);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5208(1.0F, 0.0F, 0.0F, fs);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5208(0.0F, 1.0F, 0.0F, fs_84_);
			bytebuffer.putFloat(f_94_ - fs[0] - fs_84_[0]);
			bytebuffer.putFloat(f_95_ - fs[1] - fs_84_[1]);
			bytebuffer.putFloat(f_96_ - fs[2] - fs_84_[2]);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_94_ - fs[0] + fs_84_[0]);
			bytebuffer.putFloat(f_95_ - fs[1] + fs_84_[1]);
			bytebuffer.putFloat(f_96_ - fs[2] + fs_84_[2]);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_94_ + fs[0] + fs_84_[0]);
			bytebuffer.putFloat(f_95_ + fs[1] + fs_84_[1]);
			bytebuffer.putFloat(f_96_ + fs[2] + fs_84_[2]);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_94_ + fs[0] - fs_84_[0]);
			bytebuffer.putFloat(f_95_ + fs[1] - fs_84_[1]);
			bytebuffer.putFloat(f_96_ + fs[2] - fs_84_[2]);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    } else {
			bytebuffer.putFloat(f_94_ + f_75_ * (float) -i_97_);
			bytebuffer.putFloat(f_95_ + f_76_ * (float) -i_97_);
			bytebuffer.putFloat(f_96_ + f_77_ * (float) -i_97_);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_94_ + f_81_ * (float) i_97_);
			bytebuffer.putFloat(f_95_ + f_82_ * (float) i_97_);
			bytebuffer.putFloat(f_96_ + f_83_ * (float) i_97_);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_94_ + f_75_ * (float) i_97_);
			bytebuffer.putFloat(f_95_ + f_76_ * (float) i_97_);
			bytebuffer.putFloat(f_96_ + f_77_ * (float) i_97_);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_94_ + f_78_ * (float) i_97_);
			bytebuffer.putFloat(f_95_ + f_79_ * (float) i_97_);
			bytebuffer.putFloat(f_96_ + f_80_ * (float) i_97_);
			bytebuffer.put(i_89_);
			bytebuffer.put(i_90_);
			bytebuffer.put(i_91_);
			bytebuffer.put(i_92_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    }
		    i_69_++;
		}
		if (((Class391) this).anIntArray5745[i_85_] > 64) {
		    int i_98_
			= ((Class391) this).anIntArray5745[i_85_] - 64 - 1;
		    for (int i_99_
			     = ((Class391) this).anIntArray5743[i_98_] - 1;
			 i_99_ >= 0; i_99_--) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (((Class391) this)
			       .aClass247_Sub1_Sub1ArrayArray5748[i_98_]
			       [i_99_]);
			int i_100_ = class247_sub1_sub1.anInt11065;
			byte i_101_ = (byte) (i_100_ >> 16);
			byte i_102_ = (byte) (i_100_ >> 8);
			byte i_103_ = (byte) i_100_;
			byte i_104_ = (byte) (i_100_ >>> 24);
			float f_105_
			    = (float) (class247_sub1_sub1.anInt11064 >> 12);
			float f_106_
			    = (float) (class247_sub1_sub1.anInt11061 >> 12);
			float f_107_
			    = (float) (class247_sub1_sub1.anInt11060 >> 12);
			int i_108_ = class247_sub1_sub1.anInt11058 >> 12;
			if (((Class103_Sub3) class103_sub3).anInt9633 == 0) {
			    byte i_109_ = i_101_;
			    i_101_ = i_103_;
			    i_103_ = i_109_;
			}
			if (class247_sub1_sub1.aShort11066 != 0) {
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5232
				(class247_sub1_sub1.aShort11066, i_108_,
				 i_108_, 0.0F, 0.0F, 0.0F);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5202(class103_sub3.aClass268_9511);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5208(1.0F, 0.0F, 0.0F, fs);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5208(0.0F, 1.0F, 0.0F, fs_84_);
			    bytebuffer.putFloat(f_105_ - fs[0] - fs_84_[0]);
			    bytebuffer.putFloat(f_106_ - fs[1] - fs_84_[1]);
			    bytebuffer.putFloat(f_107_ - fs[2] - fs_84_[2]);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_105_ - fs[0] + fs_84_[0]);
			    bytebuffer.putFloat(f_106_ - fs[1] + fs_84_[1]);
			    bytebuffer.putFloat(f_107_ - fs[2] + fs_84_[2]);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_105_ + fs[0] + fs_84_[0]);
			    bytebuffer.putFloat(f_106_ + fs[1] + fs_84_[1]);
			    bytebuffer.putFloat(f_107_ + fs[2] + fs_84_[2]);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_105_ + fs[0] - fs_84_[0]);
			    bytebuffer.putFloat(f_106_ + fs[1] - fs_84_[1]);
			    bytebuffer.putFloat(f_107_ + fs[2] - fs_84_[2]);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			} else {
			    bytebuffer
				.putFloat(f_105_ + f_75_ * (float) -i_108_);
			    bytebuffer
				.putFloat(f_106_ + f_76_ * (float) -i_108_);
			    bytebuffer
				.putFloat(f_107_ + f_77_ * (float) -i_108_);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer
				.putFloat(f_105_ + f_81_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_106_ + f_82_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_107_ + f_83_ * (float) i_108_);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer
				.putFloat(f_105_ + f_75_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_106_ + f_76_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_107_ + f_77_ * (float) i_108_);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer
				.putFloat(f_105_ + f_78_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_106_ + f_79_ * (float) i_108_);
			    bytebuffer
				.putFloat(f_107_ + f_80_ * (float) i_108_);
			    bytebuffer.put(i_101_);
			    bytebuffer.put(i_102_);
			    bytebuffer.put(i_103_);
			    bytebuffer.put(i_104_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			}
			i_69_++;
		    }
		}
	    }
	}
	((Class391) this).anInterface40_5737
	    .method268(0, bytebuffer.position(), class103_sub3.aLong9491);
	class103_sub3.method15955(0, ((Class391) this).anInterface40_5737);
	class103_sub3.method15955(1, ((Class391) this).anInterface40_5736);
	class103_sub3.method15716(((Class391) this).aClass366_5750);
	Class358 class358 = ((Class103_Sub3) class103_sub3).aClass358_9595;
	class358.method6468(i_69_, bool);
    }
    
    void method7006(Class103_Sub3 class103_sub3, Class98 class98) {
	class103_sub3.method2308(false);
	aFloat5738 = class103_sub3.aFloat9566;
	float f = class103_sub3.aClass268_9504.aFloatArray4353[2];
	float f_110_ = class103_sub3.aClass268_9504.aFloatArray4353[6];
	float f_111_ = class103_sub3.aClass268_9504.aFloatArray4353[10];
	float f_112_ = class103_sub3.aClass268_9504.aFloatArray4353[14];
	int i = 0;
	int i_113_ = 2147483647;
	int i_114_ = 0;
	Class247_Sub1 class247_sub1
	    = class98.aClass441_1353.aClass247_Sub1_6157;
	for (Class247_Sub1 class247_sub1_115_
		 = class247_sub1.aClass247_Sub1_10037;
	     class247_sub1_115_ != class247_sub1;
	     class247_sub1_115_ = class247_sub1_115_.aClass247_Sub1_10037) {
	    Class247_Sub1_Sub1 class247_sub1_sub1
		= (Class247_Sub1_Sub1) class247_sub1_115_;
	    int i_116_
		= (int) (f * (float) (class247_sub1_sub1.anInt11064 >> 12)
			 + f_110_ * (float) (class247_sub1_sub1.anInt11061
					     >> 12)
			 + f_111_ * (float) (class247_sub1_sub1.anInt11060
					     >> 12)
			 + f_112_);
	    if (i_116_ > i_114_)
		i_114_ = i_116_;
	    if (i_116_ < i_113_)
		i_113_ = i_116_;
	    ((Class391) this).anIntArray5746[i++] = i_116_;
	}
	int i_117_ = i_114_ - i_113_;
	int i_118_;
	if (i_117_ + 2 > 1600) {
	    i_118_ = (1 + Class436.method7795(i_117_, (byte) -34)
		      - ((Class391) this).anInt5742);
	    i_117_ = (i_117_ >> i_118_) + 2;
	} else {
	    i_118_ = 0;
	    i_117_ += 2;
	}
	class103_sub3.method15718(((Class391) this).anInterface33_5749);
	Class358 class358 = ((Class103_Sub3) class103_sub3).aClass358_9595;
	class358.method6476(Class268.aClass268_4354);
	class358.aClass268_5474.method5198();
	class358.anInt5471 = -1;
	boolean bool = class103_sub3.anInt9613 > 0;
	if (bool) {
	    class358.aClass285_5472.method5548(0.0F, 0.0F, 1.0F,
					       -class103_sub3.aFloat9615);
	    class358.aClass287_5473.method5568
		((float) (class103_sub3.anInt9589 >> 16 & 0xff) / 255.0F,
		 (float) (class103_sub3.anInt9589 >> 8 & 0xff) / 255.0F,
		 (float) (class103_sub3.anInt9589 >> 0 & 0xff) / 255.0F);
	    class358.aClass285_5472
		.method5543(((Class103_Sub3) class103_sub3).aClass268_9645);
	    class358.aClass285_5472.method5531(1.0F
					       / (class103_sub3.aFloat9616
						  - class103_sub3.aFloat9615));
	} else {
	    class358.aClass285_5472.method5548(0.0F, 0.0F, 0.0F, 0.0F);
	    class358.aClass287_5473.method5568(0.0F, 0.0F, 0.0F);
	}
	method6999(class103_sub3, class247_sub1, i_117_, i_113_, i_118_,
		   class358, bool);
	if (class103_sub3.aFloat9566 != aFloat5738)
	    class103_sub3.method2311(aFloat5738);
	class103_sub3.method2308(true);
    }
    
    void method7007(Class103_Sub3 class103_sub3, Class247_Sub1 class247_sub1,
		    int i, int i_119_, int i_120_, Class358 class358,
		    boolean bool) {
	Class247_Sub1 class247_sub1_121_ = class247_sub1.aClass247_Sub1_10037;
	int i_122_ = 0;
	int i_123_ = -2;
	boolean bool_124_ = true;
	boolean bool_125_ = true;
	while (class247_sub1_121_ != class247_sub1) {
	    ((Class391) this).anInt5735 = 0;
	    for (int i_126_ = 0; i_126_ < i; i_126_++)
		((Class391) this).anIntArray5745[i_126_] = 0;
	    for (int i_127_ = 0; i_127_ < 64; i_127_++)
		((Class391) this).anIntArray5743[i_127_] = 0;
	    for (/**/; class247_sub1_121_ != class247_sub1;
		 class247_sub1_121_
		     = class247_sub1_121_.aClass247_Sub1_10037) {
		Class247_Sub1_Sub1 class247_sub1_sub1
		    = (Class247_Sub1_Sub1) class247_sub1_121_;
		if (bool_125_) {
		    i_123_ = class247_sub1_sub1.anInt11062;
		    bool_124_ = class247_sub1_sub1.aBool11067;
		    bool_125_ = false;
		}
		if (i_122_ > 0
		    && (i_123_ != class247_sub1_sub1.anInt11062
			|| bool_124_ != class247_sub1_sub1.aBool11067)) {
		    bool_125_ = true;
		    break;
		}
		method7000((((Class391) this).anIntArray5746[i_122_++] - i_119_
			    >> i_120_),
			   class247_sub1_sub1);
	    }
	    class358.anInterface41_5470 = null;
	    if (i_123_ >= 0) {
		Class101 class101
		    = class103_sub3.aClass107_1458.method2680(i_123_,
							      -876072441);
		if (class101.anInt1403 * 218388063 != -1)
		    class358.anInterface41_5470
			= ((Class103_Sub3) class103_sub3).aClass379_9518
			      .method6844(class101);
	    }
	    if (bool_124_ && class103_sub3.aFloat9566 != aFloat5738)
		class103_sub3.method2311(aFloat5738);
	    else if (class103_sub3.aFloat9566 != 1.0F)
		class103_sub3.method2311(1.0F);
	    method6996(class103_sub3, i, bool);
	}
    }
    
    void method7008(Class103_Sub3 class103_sub3, Class247_Sub1 class247_sub1,
		    int i, int i_128_, int i_129_, Class358 class358,
		    boolean bool) {
	Class247_Sub1 class247_sub1_130_ = class247_sub1.aClass247_Sub1_10037;
	int i_131_ = 0;
	int i_132_ = -2;
	boolean bool_133_ = true;
	boolean bool_134_ = true;
	while (class247_sub1_130_ != class247_sub1) {
	    ((Class391) this).anInt5735 = 0;
	    for (int i_135_ = 0; i_135_ < i; i_135_++)
		((Class391) this).anIntArray5745[i_135_] = 0;
	    for (int i_136_ = 0; i_136_ < 64; i_136_++)
		((Class391) this).anIntArray5743[i_136_] = 0;
	    for (/**/; class247_sub1_130_ != class247_sub1;
		 class247_sub1_130_
		     = class247_sub1_130_.aClass247_Sub1_10037) {
		Class247_Sub1_Sub1 class247_sub1_sub1
		    = (Class247_Sub1_Sub1) class247_sub1_130_;
		if (bool_134_) {
		    i_132_ = class247_sub1_sub1.anInt11062;
		    bool_133_ = class247_sub1_sub1.aBool11067;
		    bool_134_ = false;
		}
		if (i_131_ > 0
		    && (i_132_ != class247_sub1_sub1.anInt11062
			|| bool_133_ != class247_sub1_sub1.aBool11067)) {
		    bool_134_ = true;
		    break;
		}
		method7000((((Class391) this).anIntArray5746[i_131_++] - i_128_
			    >> i_129_),
			   class247_sub1_sub1);
	    }
	    class358.anInterface41_5470 = null;
	    if (i_132_ >= 0) {
		Class101 class101
		    = class103_sub3.aClass107_1458.method2680(i_132_,
							      -1909678053);
		if (class101.anInt1403 * 218388063 != -1)
		    class358.anInterface41_5470
			= ((Class103_Sub3) class103_sub3).aClass379_9518
			      .method6844(class101);
	    }
	    if (bool_133_ && class103_sub3.aFloat9566 != aFloat5738)
		class103_sub3.method2311(aFloat5738);
	    else if (class103_sub3.aFloat9566 != 1.0F)
		class103_sub3.method2311(1.0F);
	    method6996(class103_sub3, i, bool);
	}
    }
    
    void method7009(Class103_Sub3 class103_sub3, Class247_Sub1 class247_sub1,
		    int i, int i_137_, int i_138_, Class358 class358,
		    boolean bool) {
	Class247_Sub1 class247_sub1_139_ = class247_sub1.aClass247_Sub1_10037;
	int i_140_ = 0;
	int i_141_ = -2;
	boolean bool_142_ = true;
	boolean bool_143_ = true;
	while (class247_sub1_139_ != class247_sub1) {
	    ((Class391) this).anInt5735 = 0;
	    for (int i_144_ = 0; i_144_ < i; i_144_++)
		((Class391) this).anIntArray5745[i_144_] = 0;
	    for (int i_145_ = 0; i_145_ < 64; i_145_++)
		((Class391) this).anIntArray5743[i_145_] = 0;
	    for (/**/; class247_sub1_139_ != class247_sub1;
		 class247_sub1_139_
		     = class247_sub1_139_.aClass247_Sub1_10037) {
		Class247_Sub1_Sub1 class247_sub1_sub1
		    = (Class247_Sub1_Sub1) class247_sub1_139_;
		if (bool_143_) {
		    i_141_ = class247_sub1_sub1.anInt11062;
		    bool_142_ = class247_sub1_sub1.aBool11067;
		    bool_143_ = false;
		}
		if (i_140_ > 0
		    && (i_141_ != class247_sub1_sub1.anInt11062
			|| bool_142_ != class247_sub1_sub1.aBool11067)) {
		    bool_143_ = true;
		    break;
		}
		method7000((((Class391) this).anIntArray5746[i_140_++] - i_137_
			    >> i_138_),
			   class247_sub1_sub1);
	    }
	    class358.anInterface41_5470 = null;
	    if (i_141_ >= 0) {
		Class101 class101
		    = class103_sub3.aClass107_1458.method2680(i_141_,
							      1658276755);
		if (class101.anInt1403 * 218388063 != -1)
		    class358.anInterface41_5470
			= ((Class103_Sub3) class103_sub3).aClass379_9518
			      .method6844(class101);
	    }
	    if (bool_142_ && class103_sub3.aFloat9566 != aFloat5738)
		class103_sub3.method2311(aFloat5738);
	    else if (class103_sub3.aFloat9566 != 1.0F)
		class103_sub3.method2311(1.0F);
	    method6996(class103_sub3, i, bool);
	}
    }
    
    void method7010(int i, Class247_Sub1_Sub1 class247_sub1_sub1) {
	if (i < 1600) {
	    if (((Class391) this).anIntArray5745[i] < 64)
		((Class391) this).aClass247_Sub1_Sub1ArrayArray5744[i]
		    [((Class391) this).anIntArray5745[i]++]
		    = class247_sub1_sub1;
	    else {
		if (((Class391) this).anIntArray5745[i] == 64) {
		    if (((Class391) this).anInt5735 == 64)
			return;
		    ((Class391) this).anIntArray5745[i]
			+= 1 + ((Class391) this).anInt5735++;
		}
		((Class391) this).aClass247_Sub1_Sub1ArrayArray5748
		    [((Class391) this).anIntArray5745[i] - 64 - 1]
		    [((Class391) this).anIntArray5743
			 [((Class391) this).anIntArray5745[i] - 64 - 1]++]
		    = class247_sub1_sub1;
	    }
	}
    }
    
    void method7011(Class103_Sub3 class103_sub3, int i, boolean bool) {
	int i_146_ = 0;
	Class268 class268 = class103_sub3.aClass268_9504;
	float f = class268.aFloatArray4353[0];
	float f_147_ = class268.aFloatArray4353[4];
	float f_148_ = class268.aFloatArray4353[8];
	float f_149_ = class268.aFloatArray4353[1];
	float f_150_ = class268.aFloatArray4353[5];
	float f_151_ = class268.aFloatArray4353[9];
	float f_152_ = f + f_149_;
	float f_153_ = f_147_ + f_150_;
	float f_154_ = f_148_ + f_151_;
	float f_155_ = f - f_149_;
	float f_156_ = f_147_ - f_150_;
	float f_157_ = f_148_ - f_151_;
	float f_158_ = f_149_ - f;
	float f_159_ = f_150_ - f_147_;
	float f_160_ = f_151_ - f_148_;
	float[] fs = new float[3];
	float[] fs_161_ = new float[3];
	class103_sub3.aClass268_9511
	    .method5200(((Class103_Sub3) class103_sub3).aClass268_9505);
	ByteBuffer bytebuffer = class103_sub3.aByteBuffer9490;
	bytebuffer.clear();
	for (int i_162_ = i - 1; i_162_ >= 0; i_162_--) {
	    int i_163_ = (((Class391) this).anIntArray5745[i_162_] > 64 ? 64
			  : ((Class391) this).anIntArray5745[i_162_]);
	    if (i_163_ > 0) {
		for (int i_164_ = i_163_ - 1; i_164_ >= 0; i_164_--) {
		    Class247_Sub1_Sub1 class247_sub1_sub1
			= (((Class391) this).aClass247_Sub1_Sub1ArrayArray5744
			   [i_162_][i_164_]);
		    int i_165_ = class247_sub1_sub1.anInt11065;
		    byte i_166_ = (byte) (i_165_ >> 16);
		    byte i_167_ = (byte) (i_165_ >> 8);
		    byte i_168_ = (byte) i_165_;
		    byte i_169_ = (byte) (i_165_ >>> 24);
		    if (((Class103_Sub3) class103_sub3).anInt9633 == 0) {
			byte i_170_ = i_166_;
			i_166_ = i_168_;
			i_168_ = i_170_;
		    }
		    float f_171_
			= (float) (class247_sub1_sub1.anInt11064 >> 12);
		    float f_172_
			= (float) (class247_sub1_sub1.anInt11061 >> 12);
		    float f_173_
			= (float) (class247_sub1_sub1.anInt11060 >> 12);
		    int i_174_ = class247_sub1_sub1.anInt11058 >> 12;
		    if (class247_sub1_sub1.aShort11066 != 0) {
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5232
			    (class247_sub1_sub1.aShort11066, i_174_, i_174_,
			     0.0F, 0.0F, 0.0F);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5202(class103_sub3.aClass268_9511);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5208(1.0F, 0.0F, 0.0F, fs);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5208(0.0F, 1.0F, 0.0F, fs_161_);
			bytebuffer.putFloat(f_171_ - fs[0] - fs_161_[0]);
			bytebuffer.putFloat(f_172_ - fs[1] - fs_161_[1]);
			bytebuffer.putFloat(f_173_ - fs[2] - fs_161_[2]);
			bytebuffer.put(i_166_);
			bytebuffer.put(i_167_);
			bytebuffer.put(i_168_);
			bytebuffer.put(i_169_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_171_ - fs[0] + fs_161_[0]);
			bytebuffer.putFloat(f_172_ - fs[1] + fs_161_[1]);
			bytebuffer.putFloat(f_173_ - fs[2] + fs_161_[2]);
			bytebuffer.put(i_166_);
			bytebuffer.put(i_167_);
			bytebuffer.put(i_168_);
			bytebuffer.put(i_169_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_171_ + fs[0] + fs_161_[0]);
			bytebuffer.putFloat(f_172_ + fs[1] + fs_161_[1]);
			bytebuffer.putFloat(f_173_ + fs[2] + fs_161_[2]);
			bytebuffer.put(i_166_);
			bytebuffer.put(i_167_);
			bytebuffer.put(i_168_);
			bytebuffer.put(i_169_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_171_ + fs[0] - fs_161_[0]);
			bytebuffer.putFloat(f_172_ + fs[1] - fs_161_[1]);
			bytebuffer.putFloat(f_173_ + fs[2] - fs_161_[2]);
			bytebuffer.put(i_166_);
			bytebuffer.put(i_167_);
			bytebuffer.put(i_168_);
			bytebuffer.put(i_169_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    } else {
			bytebuffer.putFloat(f_171_ + f_152_ * (float) -i_174_);
			bytebuffer.putFloat(f_172_ + f_153_ * (float) -i_174_);
			bytebuffer.putFloat(f_173_ + f_154_ * (float) -i_174_);
			bytebuffer.put(i_166_);
			bytebuffer.put(i_167_);
			bytebuffer.put(i_168_);
			bytebuffer.put(i_169_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_171_ + f_158_ * (float) i_174_);
			bytebuffer.putFloat(f_172_ + f_159_ * (float) i_174_);
			bytebuffer.putFloat(f_173_ + f_160_ * (float) i_174_);
			bytebuffer.put(i_166_);
			bytebuffer.put(i_167_);
			bytebuffer.put(i_168_);
			bytebuffer.put(i_169_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_171_ + f_152_ * (float) i_174_);
			bytebuffer.putFloat(f_172_ + f_153_ * (float) i_174_);
			bytebuffer.putFloat(f_173_ + f_154_ * (float) i_174_);
			bytebuffer.put(i_166_);
			bytebuffer.put(i_167_);
			bytebuffer.put(i_168_);
			bytebuffer.put(i_169_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_171_ + f_155_ * (float) i_174_);
			bytebuffer.putFloat(f_172_ + f_156_ * (float) i_174_);
			bytebuffer.putFloat(f_173_ + f_157_ * (float) i_174_);
			bytebuffer.put(i_166_);
			bytebuffer.put(i_167_);
			bytebuffer.put(i_168_);
			bytebuffer.put(i_169_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    }
		    i_146_++;
		}
		if (((Class391) this).anIntArray5745[i_162_] > 64) {
		    int i_175_
			= ((Class391) this).anIntArray5745[i_162_] - 64 - 1;
		    for (int i_176_
			     = ((Class391) this).anIntArray5743[i_175_] - 1;
			 i_176_ >= 0; i_176_--) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (((Class391) this)
			       .aClass247_Sub1_Sub1ArrayArray5748[i_175_]
			       [i_176_]);
			int i_177_ = class247_sub1_sub1.anInt11065;
			byte i_178_ = (byte) (i_177_ >> 16);
			byte i_179_ = (byte) (i_177_ >> 8);
			byte i_180_ = (byte) i_177_;
			byte i_181_ = (byte) (i_177_ >>> 24);
			float f_182_
			    = (float) (class247_sub1_sub1.anInt11064 >> 12);
			float f_183_
			    = (float) (class247_sub1_sub1.anInt11061 >> 12);
			float f_184_
			    = (float) (class247_sub1_sub1.anInt11060 >> 12);
			int i_185_ = class247_sub1_sub1.anInt11058 >> 12;
			if (((Class103_Sub3) class103_sub3).anInt9633 == 0) {
			    byte i_186_ = i_178_;
			    i_178_ = i_180_;
			    i_180_ = i_186_;
			}
			if (class247_sub1_sub1.aShort11066 != 0) {
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5232
				(class247_sub1_sub1.aShort11066, i_185_,
				 i_185_, 0.0F, 0.0F, 0.0F);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5202(class103_sub3.aClass268_9511);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5208(1.0F, 0.0F, 0.0F, fs);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5208(0.0F, 1.0F, 0.0F, fs_161_);
			    bytebuffer.putFloat(f_182_ - fs[0] - fs_161_[0]);
			    bytebuffer.putFloat(f_183_ - fs[1] - fs_161_[1]);
			    bytebuffer.putFloat(f_184_ - fs[2] - fs_161_[2]);
			    bytebuffer.put(i_178_);
			    bytebuffer.put(i_179_);
			    bytebuffer.put(i_180_);
			    bytebuffer.put(i_181_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_182_ - fs[0] + fs_161_[0]);
			    bytebuffer.putFloat(f_183_ - fs[1] + fs_161_[1]);
			    bytebuffer.putFloat(f_184_ - fs[2] + fs_161_[2]);
			    bytebuffer.put(i_178_);
			    bytebuffer.put(i_179_);
			    bytebuffer.put(i_180_);
			    bytebuffer.put(i_181_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_182_ + fs[0] + fs_161_[0]);
			    bytebuffer.putFloat(f_183_ + fs[1] + fs_161_[1]);
			    bytebuffer.putFloat(f_184_ + fs[2] + fs_161_[2]);
			    bytebuffer.put(i_178_);
			    bytebuffer.put(i_179_);
			    bytebuffer.put(i_180_);
			    bytebuffer.put(i_181_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_182_ + fs[0] - fs_161_[0]);
			    bytebuffer.putFloat(f_183_ + fs[1] - fs_161_[1]);
			    bytebuffer.putFloat(f_184_ + fs[2] - fs_161_[2]);
			    bytebuffer.put(i_178_);
			    bytebuffer.put(i_179_);
			    bytebuffer.put(i_180_);
			    bytebuffer.put(i_181_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			} else {
			    bytebuffer
				.putFloat(f_182_ + f_152_ * (float) -i_185_);
			    bytebuffer
				.putFloat(f_183_ + f_153_ * (float) -i_185_);
			    bytebuffer
				.putFloat(f_184_ + f_154_ * (float) -i_185_);
			    bytebuffer.put(i_178_);
			    bytebuffer.put(i_179_);
			    bytebuffer.put(i_180_);
			    bytebuffer.put(i_181_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer
				.putFloat(f_182_ + f_158_ * (float) i_185_);
			    bytebuffer
				.putFloat(f_183_ + f_159_ * (float) i_185_);
			    bytebuffer
				.putFloat(f_184_ + f_160_ * (float) i_185_);
			    bytebuffer.put(i_178_);
			    bytebuffer.put(i_179_);
			    bytebuffer.put(i_180_);
			    bytebuffer.put(i_181_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer
				.putFloat(f_182_ + f_152_ * (float) i_185_);
			    bytebuffer
				.putFloat(f_183_ + f_153_ * (float) i_185_);
			    bytebuffer
				.putFloat(f_184_ + f_154_ * (float) i_185_);
			    bytebuffer.put(i_178_);
			    bytebuffer.put(i_179_);
			    bytebuffer.put(i_180_);
			    bytebuffer.put(i_181_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer
				.putFloat(f_182_ + f_155_ * (float) i_185_);
			    bytebuffer
				.putFloat(f_183_ + f_156_ * (float) i_185_);
			    bytebuffer
				.putFloat(f_184_ + f_157_ * (float) i_185_);
			    bytebuffer.put(i_178_);
			    bytebuffer.put(i_179_);
			    bytebuffer.put(i_180_);
			    bytebuffer.put(i_181_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			}
			i_146_++;
		    }
		}
	    }
	}
	((Class391) this).anInterface40_5737
	    .method268(0, bytebuffer.position(), class103_sub3.aLong9491);
	class103_sub3.method15955(0, ((Class391) this).anInterface40_5737);
	class103_sub3.method15955(1, ((Class391) this).anInterface40_5736);
	class103_sub3.method15716(((Class391) this).aClass366_5750);
	Class358 class358 = ((Class103_Sub3) class103_sub3).aClass358_9595;
	class358.method6468(i_146_, bool);
    }
    
    void method7012(Class103_Sub3 class103_sub3, int i, boolean bool) {
	int i_187_ = 0;
	Class268 class268 = class103_sub3.aClass268_9504;
	float f = class268.aFloatArray4353[0];
	float f_188_ = class268.aFloatArray4353[4];
	float f_189_ = class268.aFloatArray4353[8];
	float f_190_ = class268.aFloatArray4353[1];
	float f_191_ = class268.aFloatArray4353[5];
	float f_192_ = class268.aFloatArray4353[9];
	float f_193_ = f + f_190_;
	float f_194_ = f_188_ + f_191_;
	float f_195_ = f_189_ + f_192_;
	float f_196_ = f - f_190_;
	float f_197_ = f_188_ - f_191_;
	float f_198_ = f_189_ - f_192_;
	float f_199_ = f_190_ - f;
	float f_200_ = f_191_ - f_188_;
	float f_201_ = f_192_ - f_189_;
	float[] fs = new float[3];
	float[] fs_202_ = new float[3];
	class103_sub3.aClass268_9511
	    .method5200(((Class103_Sub3) class103_sub3).aClass268_9505);
	ByteBuffer bytebuffer = class103_sub3.aByteBuffer9490;
	bytebuffer.clear();
	for (int i_203_ = i - 1; i_203_ >= 0; i_203_--) {
	    int i_204_ = (((Class391) this).anIntArray5745[i_203_] > 64 ? 64
			  : ((Class391) this).anIntArray5745[i_203_]);
	    if (i_204_ > 0) {
		for (int i_205_ = i_204_ - 1; i_205_ >= 0; i_205_--) {
		    Class247_Sub1_Sub1 class247_sub1_sub1
			= (((Class391) this).aClass247_Sub1_Sub1ArrayArray5744
			   [i_203_][i_205_]);
		    int i_206_ = class247_sub1_sub1.anInt11065;
		    byte i_207_ = (byte) (i_206_ >> 16);
		    byte i_208_ = (byte) (i_206_ >> 8);
		    byte i_209_ = (byte) i_206_;
		    byte i_210_ = (byte) (i_206_ >>> 24);
		    if (((Class103_Sub3) class103_sub3).anInt9633 == 0) {
			byte i_211_ = i_207_;
			i_207_ = i_209_;
			i_209_ = i_211_;
		    }
		    float f_212_
			= (float) (class247_sub1_sub1.anInt11064 >> 12);
		    float f_213_
			= (float) (class247_sub1_sub1.anInt11061 >> 12);
		    float f_214_
			= (float) (class247_sub1_sub1.anInt11060 >> 12);
		    int i_215_ = class247_sub1_sub1.anInt11058 >> 12;
		    if (class247_sub1_sub1.aShort11066 != 0) {
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5232
			    (class247_sub1_sub1.aShort11066, i_215_, i_215_,
			     0.0F, 0.0F, 0.0F);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5202(class103_sub3.aClass268_9511);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5208(1.0F, 0.0F, 0.0F, fs);
			((Class103_Sub3) class103_sub3).aClass268_9646
			    .method5208(0.0F, 1.0F, 0.0F, fs_202_);
			bytebuffer.putFloat(f_212_ - fs[0] - fs_202_[0]);
			bytebuffer.putFloat(f_213_ - fs[1] - fs_202_[1]);
			bytebuffer.putFloat(f_214_ - fs[2] - fs_202_[2]);
			bytebuffer.put(i_207_);
			bytebuffer.put(i_208_);
			bytebuffer.put(i_209_);
			bytebuffer.put(i_210_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_212_ - fs[0] + fs_202_[0]);
			bytebuffer.putFloat(f_213_ - fs[1] + fs_202_[1]);
			bytebuffer.putFloat(f_214_ - fs[2] + fs_202_[2]);
			bytebuffer.put(i_207_);
			bytebuffer.put(i_208_);
			bytebuffer.put(i_209_);
			bytebuffer.put(i_210_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_212_ + fs[0] + fs_202_[0]);
			bytebuffer.putFloat(f_213_ + fs[1] + fs_202_[1]);
			bytebuffer.putFloat(f_214_ + fs[2] + fs_202_[2]);
			bytebuffer.put(i_207_);
			bytebuffer.put(i_208_);
			bytebuffer.put(i_209_);
			bytebuffer.put(i_210_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_212_ + fs[0] - fs_202_[0]);
			bytebuffer.putFloat(f_213_ + fs[1] - fs_202_[1]);
			bytebuffer.putFloat(f_214_ + fs[2] - fs_202_[2]);
			bytebuffer.put(i_207_);
			bytebuffer.put(i_208_);
			bytebuffer.put(i_209_);
			bytebuffer.put(i_210_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    } else {
			bytebuffer.putFloat(f_212_ + f_193_ * (float) -i_215_);
			bytebuffer.putFloat(f_213_ + f_194_ * (float) -i_215_);
			bytebuffer.putFloat(f_214_ + f_195_ * (float) -i_215_);
			bytebuffer.put(i_207_);
			bytebuffer.put(i_208_);
			bytebuffer.put(i_209_);
			bytebuffer.put(i_210_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_212_ + f_199_ * (float) i_215_);
			bytebuffer.putFloat(f_213_ + f_200_ * (float) i_215_);
			bytebuffer.putFloat(f_214_ + f_201_ * (float) i_215_);
			bytebuffer.put(i_207_);
			bytebuffer.put(i_208_);
			bytebuffer.put(i_209_);
			bytebuffer.put(i_210_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_212_ + f_193_ * (float) i_215_);
			bytebuffer.putFloat(f_213_ + f_194_ * (float) i_215_);
			bytebuffer.putFloat(f_214_ + f_195_ * (float) i_215_);
			bytebuffer.put(i_207_);
			bytebuffer.put(i_208_);
			bytebuffer.put(i_209_);
			bytebuffer.put(i_210_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(f_212_ + f_196_ * (float) i_215_);
			bytebuffer.putFloat(f_213_ + f_197_ * (float) i_215_);
			bytebuffer.putFloat(f_214_ + f_198_ * (float) i_215_);
			bytebuffer.put(i_207_);
			bytebuffer.put(i_208_);
			bytebuffer.put(i_209_);
			bytebuffer.put(i_210_);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(0.0F);
		    }
		    i_187_++;
		}
		if (((Class391) this).anIntArray5745[i_203_] > 64) {
		    int i_216_
			= ((Class391) this).anIntArray5745[i_203_] - 64 - 1;
		    for (int i_217_
			     = ((Class391) this).anIntArray5743[i_216_] - 1;
			 i_217_ >= 0; i_217_--) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (((Class391) this)
			       .aClass247_Sub1_Sub1ArrayArray5748[i_216_]
			       [i_217_]);
			int i_218_ = class247_sub1_sub1.anInt11065;
			byte i_219_ = (byte) (i_218_ >> 16);
			byte i_220_ = (byte) (i_218_ >> 8);
			byte i_221_ = (byte) i_218_;
			byte i_222_ = (byte) (i_218_ >>> 24);
			float f_223_
			    = (float) (class247_sub1_sub1.anInt11064 >> 12);
			float f_224_
			    = (float) (class247_sub1_sub1.anInt11061 >> 12);
			float f_225_
			    = (float) (class247_sub1_sub1.anInt11060 >> 12);
			int i_226_ = class247_sub1_sub1.anInt11058 >> 12;
			if (((Class103_Sub3) class103_sub3).anInt9633 == 0) {
			    byte i_227_ = i_219_;
			    i_219_ = i_221_;
			    i_221_ = i_227_;
			}
			if (class247_sub1_sub1.aShort11066 != 0) {
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5232
				(class247_sub1_sub1.aShort11066, i_226_,
				 i_226_, 0.0F, 0.0F, 0.0F);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5202(class103_sub3.aClass268_9511);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5208(1.0F, 0.0F, 0.0F, fs);
			    ((Class103_Sub3) class103_sub3).aClass268_9646
				.method5208(0.0F, 1.0F, 0.0F, fs_202_);
			    bytebuffer.putFloat(f_223_ - fs[0] - fs_202_[0]);
			    bytebuffer.putFloat(f_224_ - fs[1] - fs_202_[1]);
			    bytebuffer.putFloat(f_225_ - fs[2] - fs_202_[2]);
			    bytebuffer.put(i_219_);
			    bytebuffer.put(i_220_);
			    bytebuffer.put(i_221_);
			    bytebuffer.put(i_222_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(f_223_ - fs[0] + fs_202_[0]);
			    bytebuffer.putFloat(f_224_ - fs[1] + fs_202_[1]);
			    bytebuffer.putFloat(f_225_ - fs[2] + fs_202_[2]);
			    bytebuffer.put(i_219_);
			    bytebuffer.put(i_220_);
			    bytebuffer.put(i_221_);
			    bytebuffer.put(i_222_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_223_ + fs[0] + fs_202_[0]);
			    bytebuffer.putFloat(f_224_ + fs[1] + fs_202_[1]);
			    bytebuffer.putFloat(f_225_ + fs[2] + fs_202_[2]);
			    bytebuffer.put(i_219_);
			    bytebuffer.put(i_220_);
			    bytebuffer.put(i_221_);
			    bytebuffer.put(i_222_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(f_223_ + fs[0] - fs_202_[0]);
			    bytebuffer.putFloat(f_224_ + fs[1] - fs_202_[1]);
			    bytebuffer.putFloat(f_225_ + fs[2] - fs_202_[2]);
			    bytebuffer.put(i_219_);
			    bytebuffer.put(i_220_);
			    bytebuffer.put(i_221_);
			    bytebuffer.put(i_222_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			} else {
			    bytebuffer
				.putFloat(f_223_ + f_193_ * (float) -i_226_);
			    bytebuffer
				.putFloat(f_224_ + f_194_ * (float) -i_226_);
			    bytebuffer
				.putFloat(f_225_ + f_195_ * (float) -i_226_);
			    bytebuffer.put(i_219_);
			    bytebuffer.put(i_220_);
			    bytebuffer.put(i_221_);
			    bytebuffer.put(i_222_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer
				.putFloat(f_223_ + f_199_ * (float) i_226_);
			    bytebuffer
				.putFloat(f_224_ + f_200_ * (float) i_226_);
			    bytebuffer
				.putFloat(f_225_ + f_201_ * (float) i_226_);
			    bytebuffer.put(i_219_);
			    bytebuffer.put(i_220_);
			    bytebuffer.put(i_221_);
			    bytebuffer.put(i_222_);
			    bytebuffer.putFloat(0.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer
				.putFloat(f_223_ + f_193_ * (float) i_226_);
			    bytebuffer
				.putFloat(f_224_ + f_194_ * (float) i_226_);
			    bytebuffer
				.putFloat(f_225_ + f_195_ * (float) i_226_);
			    bytebuffer.put(i_219_);
			    bytebuffer.put(i_220_);
			    bytebuffer.put(i_221_);
			    bytebuffer.put(i_222_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer
				.putFloat(f_223_ + f_196_ * (float) i_226_);
			    bytebuffer
				.putFloat(f_224_ + f_197_ * (float) i_226_);
			    bytebuffer
				.putFloat(f_225_ + f_198_ * (float) i_226_);
			    bytebuffer.put(i_219_);
			    bytebuffer.put(i_220_);
			    bytebuffer.put(i_221_);
			    bytebuffer.put(i_222_);
			    bytebuffer.putFloat(1.0F);
			    bytebuffer.putFloat(0.0F);
			}
			i_187_++;
		    }
		}
	    }
	}
	((Class391) this).anInterface40_5737
	    .method268(0, bytebuffer.position(), class103_sub3.aLong9491);
	class103_sub3.method15955(0, ((Class391) this).anInterface40_5737);
	class103_sub3.method15955(1, ((Class391) this).anInterface40_5736);
	class103_sub3.method15716(((Class391) this).aClass366_5750);
	Class358 class358 = ((Class103_Sub3) class103_sub3).aClass358_9595;
	class358.method6468(i_187_, bool);
    }
    
    void method7013(Class103_Sub3 class103_sub3) {
	((Class391) this).anInterface40_5737.method221(786336, 24);
    }
}
