/* Class241_Sub45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class241_Sub45 extends Node
{
    Class103_Sub1 aClass103_Sub1_10184;
    Class166_Sub2 aClass166_Sub2_10185;
    Stream aStream10186;
    float aFloat10187;
    Class149_Sub1 aClass149_Sub1_10188;
    Class151 aClass151_10189;
    NativeHeapBuffer aNativeHeapBuffer10190;
    int[] anIntArray10191;
    int anInt10192;
    Class86 aClass86_10193;
    
    void method16488(int i) {
	((Class241_Sub45) this).aStream10186.method3783(i * 4 + 3);
	((Class241_Sub45) this).aStream10186.method3784(-1);
    }
    
    void method16489(int i) {
	((Class241_Sub45) this).aNativeHeapBuffer10190
	    = ((Class103_Sub1) ((Class241_Sub45) this).aClass103_Sub1_10184)
		  .aNativeHeap9165.method963(i * 4, true);
	((Class241_Sub45) this).aStream10186
	    = new Stream(((Class241_Sub45) this).aNativeHeapBuffer10190);
    }
    
    void method16490(int i) {
	((Class241_Sub45) this).aStream10186.method3783(i * 4 + 3);
	((Class241_Sub45) this).aStream10186.method3784(-1);
    }
    
    void method16491(int i, int i_0_, int i_1_) {
	((Class241_Sub45) this).anIntArray10191
	    [i_0_ * (((Class241_Sub45) this).aClass166_Sub2_10185.anInt2055
		     * 266270313) + i]
	    |= 1 << i_1_;
    }
    
    void method16492(int i, int i_2_, int i_3_, float f) {
	if (((Class241_Sub45) this).anInt10192 != -1) {
	    Class101 class101
		= (((Class241_Sub45) this).aClass103_Sub1_10184
		       .aClass107_1458.method2680
		   (((Class241_Sub45) this).anInt10192, -393816150));
	    int i_4_ = class101.aByte1430 & 0xff;
	    if (i_4_ != 0 && class101.aByte1427 != 4) {
		int i_5_;
		if (i_3_ < 0)
		    i_5_ = 0;
		else if (i_3_ > 127)
		    i_5_ = 16777215;
		else
		    i_5_ = 131586 * i_3_;
		if (i_4_ == 256)
		    i_2_ = i_5_;
		else {
		    int i_6_ = i_4_;
		    int i_7_ = 256 - i_4_;
		    i_2_
			= (((i_5_ & 0xff00ff) * i_6_ + (i_2_ & 0xff00ff) * i_7_
			    & ~0xff00ff)
			   + ((i_5_ & 0xff00) * i_6_ + (i_2_ & 0xff00) * i_7_
			      & 0xff0000)) >> 8;
		}
	    }
	    int i_8_ = class101.aByte1433 & 0xff;
	    if (i_8_ != 0) {
		i_8_ += 256;
		int i_9_ = ((i_2_ & 0xff0000) >> 16) * i_8_;
		if (i_9_ > 65535)
		    i_9_ = 65535;
		int i_10_ = ((i_2_ & 0xff00) >> 8) * i_8_;
		if (i_10_ > 65535)
		    i_10_ = 65535;
		int i_11_ = (i_2_ & 0xff) * i_8_;
		if (i_11_ > 65535)
		    i_11_ = 65535;
		i_2_
		    = (i_9_ << 8 & 0xff0000) + (i_10_ & 0xff00) + (i_11_ >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_12_ = i_2_ >> 16 & 0xff;
	    int i_13_ = i_2_ >> 8 & 0xff;
	    int i_14_ = i_2_ & 0xff;
	    i_12_ *= f;
	    if (i_12_ < 0)
		i_12_ = 0;
	    else if (i_12_ > 255)
		i_12_ = 255;
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
	    i_2_ = i_12_ << 16 | i_13_ << 8 | i_14_;
	}
	((Class241_Sub45) this).aStream10186.method3783(i * 4);
	((Class241_Sub45) this).aStream10186.method3784((byte) (i_2_ >> 16));
	((Class241_Sub45) this).aStream10186.method3784((byte) (i_2_ >> 8));
	((Class241_Sub45) this).aStream10186.method3784((byte) i_2_);
    }
    
    void method16493(int i) {
	((Class241_Sub45) this).aStream10186.method3787();
	Interface8 interface8
	    = (((Class241_Sub45) this).aClass103_Sub1_10184.method15213
	       (4, ((Class241_Sub45) this).aNativeHeapBuffer10190, i * 4,
		false));
	if (interface8 instanceof Class147_Sub1)
	    ((Class241_Sub45) this).aNativeHeapBuffer10190.method1686();
	((Class241_Sub45) this).aClass151_10189
	    = new Class151(interface8, 5121, 4, 0);
	((Class241_Sub45) this).aNativeHeapBuffer10190 = null;
	((Class241_Sub45) this).aStream10186 = null;
    }
    
    void method16494(int[] is, int i) {
	int i_15_ = 0;
	Class241_Sub3_Sub2 class241_sub3_sub2
	    = (((Class103_Sub1) ((Class241_Sub45) this).aClass103_Sub1_10184)
	       .aClass241_Sub3_Sub2_9231);
	class241_sub3_sub2.pointer = 0;
	if (((Class103_Sub1) ((Class241_Sub45) this).aClass103_Sub1_10184)
	    .aBool9144) {
	    for (int i_16_ = 0; i_16_ < i; i_16_++) {
		int i_17_ = is[i_16_];
		short[] is_18_ = (((Class166_Sub2) (((Class241_Sub45) this)
						    .aClass166_Sub2_10185))
				  .aShortArrayArray9829[i_17_]);
		int i_19_ = ((Class241_Sub45) this).anIntArray10191[i_17_];
		if (i_19_ != 0 && is_18_ != null) {
		    int i_20_ = 0;
		    int i_21_ = 0;
		    while (i_21_ < is_18_.length) {
			if ((i_19_ & 1 << i_20_++) != 0) {
			    class241_sub3_sub2.writeShort((is_18_[i_21_++]
							    & 0xffff),
							   -484048531);
			    i_15_++;
			    class241_sub3_sub2.writeShort((is_18_[i_21_++]
							    & 0xffff),
							   -484048531);
			    i_15_++;
			    class241_sub3_sub2.writeShort((is_18_[i_21_++]
							    & 0xffff),
							   -484048531);
			    i_15_++;
			} else
			    i_21_ += 3;
		    }
		}
	    }
	} else {
	    for (int i_22_ = 0; i_22_ < i; i_22_++) {
		int i_23_ = is[i_22_];
		short[] is_24_ = (((Class166_Sub2) (((Class241_Sub45) this)
						    .aClass166_Sub2_10185))
				  .aShortArrayArray9829[i_23_]);
		int i_25_ = ((Class241_Sub45) this).anIntArray10191[i_23_];
		if (i_25_ != 0 && is_24_ != null) {
		    int i_26_ = 0;
		    int i_27_ = 0;
		    while (i_27_ < is_24_.length) {
			if ((i_25_ & 1 << i_26_++) != 0) {
			    class241_sub3_sub2.method14621((is_24_[i_27_++]
							    & 0xffff),
							   (byte) -89);
			    i_15_++;
			    class241_sub3_sub2.method14621((is_24_[i_27_++]
							    & 0xffff),
							   (byte) 10);
			    i_15_++;
			    class241_sub3_sub2.method14621((is_24_[i_27_++]
							    & 0xffff),
							   (byte) 0);
			    i_15_++;
			} else
			    i_27_ += 3;
		    }
		}
	    }
	}
	if (i_15_ > 0) {
	    ((Class241_Sub45) this).aClass149_Sub1_10188.method99
		(5123, class241_sub3_sub2.payload,
		 class241_sub3_sub2.pointer * 421967667);
	    ((Class241_Sub45) this).aClass103_Sub1_10184.method15168
		(((Class166_Sub2)
		  ((Class241_Sub45) this).aClass166_Sub2_10185).aClass151_9826,
		 ((Class166_Sub2)
		  ((Class241_Sub45) this).aClass166_Sub2_10185).aClass151_9828,
		 ((Class241_Sub45) this).aClass151_10189,
		 ((Class166_Sub2) (((Class241_Sub45) this)
				   .aClass166_Sub2_10185)).aClass151_9830);
	    ((Class241_Sub45) this).aClass103_Sub1_10184.method15175
		(((Class241_Sub45) this).anInt10192,
		 (((Class166_Sub2)
		   ((Class241_Sub45) this).aClass166_Sub2_10185).anInt9810
		  & 0x7) != 0,
		 (((Class166_Sub2)
		   ((Class241_Sub45) this).aClass166_Sub2_10185).anInt9810
		  & 0x8) != 0);
	    if (((Class103_Sub1) ((Class241_Sub45) this).aClass103_Sub1_10184)
		.aBool9098)
		((Class241_Sub45) this).aClass103_Sub1_10184.method2335
		    (2147483647, ((Class241_Sub45) this).aClass86_10193);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPushMatrix();
	    OpenGL.glScalef(1.0F / ((Class241_Sub45) this).aFloat10187,
			    1.0F / ((Class241_Sub45) this).aFloat10187, 1.0F);
	    OpenGL.glMatrixMode(5888);
	    ((Class241_Sub45) this).aClass103_Sub1_10184.method15168
		(((Class166_Sub2)
		  ((Class241_Sub45) this).aClass166_Sub2_10185).aClass151_9826,
		 ((Class166_Sub2)
		  ((Class241_Sub45) this).aClass166_Sub2_10185).aClass151_9828,
		 ((Class241_Sub45) this).aClass151_10189,
		 ((Class166_Sub2) (((Class241_Sub45) this)
				   .aClass166_Sub2_10185)).aClass151_9830);
	    ((Class241_Sub45) this).aClass103_Sub1_10184.method15265
		(((Class241_Sub45) this).aClass149_Sub1_10188, 4, 0, i_15_);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	}
    }
    
    void method16495(int i, int i_28_, int i_29_) {
	((Class241_Sub45) this).anIntArray10191
	    [i_28_ * (((Class241_Sub45) this).aClass166_Sub2_10185.anInt2055
		      * 266270313) + i]
	    |= 1 << i_29_;
    }
    
    void method16496(int i) {
	((Class241_Sub45) this).aNativeHeapBuffer10190
	    = ((Class103_Sub1) ((Class241_Sub45) this).aClass103_Sub1_10184)
		  .aNativeHeap9165.method963(i * 4, true);
	((Class241_Sub45) this).aStream10186
	    = new Stream(((Class241_Sub45) this).aNativeHeapBuffer10190);
    }
    
    void method16497(int i) {
	((Class241_Sub45) this).aStream10186.method3783(i * 4 + 3);
	((Class241_Sub45) this).aStream10186.method3784(-1);
    }
    
    void method16498(int i) {
	((Class241_Sub45) this).aNativeHeapBuffer10190
	    = ((Class103_Sub1) ((Class241_Sub45) this).aClass103_Sub1_10184)
		  .aNativeHeap9165.method963(i * 4, true);
	((Class241_Sub45) this).aStream10186
	    = new Stream(((Class241_Sub45) this).aNativeHeapBuffer10190);
    }
    
    void method16499(int i) {
	((Class241_Sub45) this).aStream10186.method3783(i * 4 + 3);
	((Class241_Sub45) this).aStream10186.method3784(-1);
    }
    
    void method16500(int i, int i_30_, int i_31_) {
	((Class241_Sub45) this).anIntArray10191
	    [i_30_ * (((Class241_Sub45) this).aClass166_Sub2_10185.anInt2055
		      * 266270313) + i]
	    |= 1 << i_31_;
    }
    
    void method16501(int i, int i_32_, int i_33_) {
	((Class241_Sub45) this).anIntArray10191
	    [i_32_ * (((Class241_Sub45) this).aClass166_Sub2_10185.anInt2055
		      * 266270313) + i]
	    |= 1 << i_33_;
    }
    
    Class241_Sub45(Class166_Sub2 class166_sub2, int i, int i_34_,
		   Class86 class86) {
	((Class241_Sub45) this).aClass166_Sub2_10185 = class166_sub2;
	((Class241_Sub45) this).aClass103_Sub1_10184
	    = (((Class166_Sub2) ((Class241_Sub45) this).aClass166_Sub2_10185)
	       .aClass103_Sub1_9813);
	((Class241_Sub45) this).anInt10192 = i;
	((Class241_Sub45) this).aFloat10187 = (float) i_34_;
	((Class241_Sub45) this).aClass86_10193 = class86;
	((Class241_Sub45) this).anIntArray10191
	    = (new int
	       [(((Class241_Sub45) this).aClass166_Sub2_10185.anInt2055
		 * 266270313
		 * (((Class241_Sub45) this).aClass166_Sub2_10185.anInt2052
		    * -14610189))]);
	((Class241_Sub45) this).aClass149_Sub1_10188
	    = new Class149_Sub1(((Class241_Sub45) this).aClass103_Sub1_10184,
				5123, null, 1);
    }
    
    void method16502(int i, int i_35_, int i_36_, float f) {
	if (((Class241_Sub45) this).anInt10192 != -1) {
	    Class101 class101
		= (((Class241_Sub45) this).aClass103_Sub1_10184
		       .aClass107_1458.method2680
		   (((Class241_Sub45) this).anInt10192, 1263997636));
	    int i_37_ = class101.aByte1430 & 0xff;
	    if (i_37_ != 0 && class101.aByte1427 != 4) {
		int i_38_;
		if (i_36_ < 0)
		    i_38_ = 0;
		else if (i_36_ > 127)
		    i_38_ = 16777215;
		else
		    i_38_ = 131586 * i_36_;
		if (i_37_ == 256)
		    i_35_ = i_38_;
		else {
		    int i_39_ = i_37_;
		    int i_40_ = 256 - i_37_;
		    i_35_ = ((((i_38_ & 0xff00ff) * i_39_
			       + (i_35_ & 0xff00ff) * i_40_)
			      & ~0xff00ff)
			     + (((i_38_ & 0xff00) * i_39_
				 + (i_35_ & 0xff00) * i_40_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_41_ = class101.aByte1433 & 0xff;
	    if (i_41_ != 0) {
		i_41_ += 256;
		int i_42_ = ((i_35_ & 0xff0000) >> 16) * i_41_;
		if (i_42_ > 65535)
		    i_42_ = 65535;
		int i_43_ = ((i_35_ & 0xff00) >> 8) * i_41_;
		if (i_43_ > 65535)
		    i_43_ = 65535;
		int i_44_ = (i_35_ & 0xff) * i_41_;
		if (i_44_ > 65535)
		    i_44_ = 65535;
		i_35_ = (i_42_ << 8 & 0xff0000) + (i_43_ & 0xff00) + (i_44_
								      >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_45_ = i_35_ >> 16 & 0xff;
	    int i_46_ = i_35_ >> 8 & 0xff;
	    int i_47_ = i_35_ & 0xff;
	    i_45_ *= f;
	    if (i_45_ < 0)
		i_45_ = 0;
	    else if (i_45_ > 255)
		i_45_ = 255;
	    i_46_ *= f;
	    if (i_46_ < 0)
		i_46_ = 0;
	    else if (i_46_ > 255)
		i_46_ = 255;
	    i_47_ *= f;
	    if (i_47_ < 0)
		i_47_ = 0;
	    else if (i_47_ > 255)
		i_47_ = 255;
	    i_35_ = i_45_ << 16 | i_46_ << 8 | i_47_;
	}
	((Class241_Sub45) this).aStream10186.method3783(i * 4);
	((Class241_Sub45) this).aStream10186.method3784((byte) (i_35_ >> 16));
	((Class241_Sub45) this).aStream10186.method3784((byte) (i_35_ >> 8));
	((Class241_Sub45) this).aStream10186.method3784((byte) i_35_);
    }
    
    void method16503(int i, int i_48_, int i_49_, float f) {
	if (((Class241_Sub45) this).anInt10192 != -1) {
	    Class101 class101
		= (((Class241_Sub45) this).aClass103_Sub1_10184
		       .aClass107_1458.method2680
		   (((Class241_Sub45) this).anInt10192, -670760904));
	    int i_50_ = class101.aByte1430 & 0xff;
	    if (i_50_ != 0 && class101.aByte1427 != 4) {
		int i_51_;
		if (i_49_ < 0)
		    i_51_ = 0;
		else if (i_49_ > 127)
		    i_51_ = 16777215;
		else
		    i_51_ = 131586 * i_49_;
		if (i_50_ == 256)
		    i_48_ = i_51_;
		else {
		    int i_52_ = i_50_;
		    int i_53_ = 256 - i_50_;
		    i_48_ = ((((i_51_ & 0xff00ff) * i_52_
			       + (i_48_ & 0xff00ff) * i_53_)
			      & ~0xff00ff)
			     + (((i_51_ & 0xff00) * i_52_
				 + (i_48_ & 0xff00) * i_53_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_54_ = class101.aByte1433 & 0xff;
	    if (i_54_ != 0) {
		i_54_ += 256;
		int i_55_ = ((i_48_ & 0xff0000) >> 16) * i_54_;
		if (i_55_ > 65535)
		    i_55_ = 65535;
		int i_56_ = ((i_48_ & 0xff00) >> 8) * i_54_;
		if (i_56_ > 65535)
		    i_56_ = 65535;
		int i_57_ = (i_48_ & 0xff) * i_54_;
		if (i_57_ > 65535)
		    i_57_ = 65535;
		i_48_ = (i_55_ << 8 & 0xff0000) + (i_56_ & 0xff00) + (i_57_
								      >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_58_ = i_48_ >> 16 & 0xff;
	    int i_59_ = i_48_ >> 8 & 0xff;
	    int i_60_ = i_48_ & 0xff;
	    i_58_ *= f;
	    if (i_58_ < 0)
		i_58_ = 0;
	    else if (i_58_ > 255)
		i_58_ = 255;
	    i_59_ *= f;
	    if (i_59_ < 0)
		i_59_ = 0;
	    else if (i_59_ > 255)
		i_59_ = 255;
	    i_60_ *= f;
	    if (i_60_ < 0)
		i_60_ = 0;
	    else if (i_60_ > 255)
		i_60_ = 255;
	    i_48_ = i_58_ << 16 | i_59_ << 8 | i_60_;
	}
	((Class241_Sub45) this).aStream10186.method3783(i * 4);
	((Class241_Sub45) this).aStream10186.method3784((byte) (i_48_ >> 16));
	((Class241_Sub45) this).aStream10186.method3784((byte) (i_48_ >> 8));
	((Class241_Sub45) this).aStream10186.method3784((byte) i_48_);
    }
    
    void method16504(int i, int i_61_, int i_62_, float f) {
	if (((Class241_Sub45) this).anInt10192 != -1) {
	    Class101 class101
		= (((Class241_Sub45) this).aClass103_Sub1_10184
		       .aClass107_1458.method2680
		   (((Class241_Sub45) this).anInt10192, 807976074));
	    int i_63_ = class101.aByte1430 & 0xff;
	    if (i_63_ != 0 && class101.aByte1427 != 4) {
		int i_64_;
		if (i_62_ < 0)
		    i_64_ = 0;
		else if (i_62_ > 127)
		    i_64_ = 16777215;
		else
		    i_64_ = 131586 * i_62_;
		if (i_63_ == 256)
		    i_61_ = i_64_;
		else {
		    int i_65_ = i_63_;
		    int i_66_ = 256 - i_63_;
		    i_61_ = ((((i_64_ & 0xff00ff) * i_65_
			       + (i_61_ & 0xff00ff) * i_66_)
			      & ~0xff00ff)
			     + (((i_64_ & 0xff00) * i_65_
				 + (i_61_ & 0xff00) * i_66_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_67_ = class101.aByte1433 & 0xff;
	    if (i_67_ != 0) {
		i_67_ += 256;
		int i_68_ = ((i_61_ & 0xff0000) >> 16) * i_67_;
		if (i_68_ > 65535)
		    i_68_ = 65535;
		int i_69_ = ((i_61_ & 0xff00) >> 8) * i_67_;
		if (i_69_ > 65535)
		    i_69_ = 65535;
		int i_70_ = (i_61_ & 0xff) * i_67_;
		if (i_70_ > 65535)
		    i_70_ = 65535;
		i_61_ = (i_68_ << 8 & 0xff0000) + (i_69_ & 0xff00) + (i_70_
								      >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_71_ = i_61_ >> 16 & 0xff;
	    int i_72_ = i_61_ >> 8 & 0xff;
	    int i_73_ = i_61_ & 0xff;
	    i_71_ *= f;
	    if (i_71_ < 0)
		i_71_ = 0;
	    else if (i_71_ > 255)
		i_71_ = 255;
	    i_72_ *= f;
	    if (i_72_ < 0)
		i_72_ = 0;
	    else if (i_72_ > 255)
		i_72_ = 255;
	    i_73_ *= f;
	    if (i_73_ < 0)
		i_73_ = 0;
	    else if (i_73_ > 255)
		i_73_ = 255;
	    i_61_ = i_71_ << 16 | i_72_ << 8 | i_73_;
	}
	((Class241_Sub45) this).aStream10186.method3783(i * 4);
	((Class241_Sub45) this).aStream10186.method3784((byte) (i_61_ >> 16));
	((Class241_Sub45) this).aStream10186.method3784((byte) (i_61_ >> 8));
	((Class241_Sub45) this).aStream10186.method3784((byte) i_61_);
    }
    
    void method16505(int[] is, int i) {
	int i_74_ = 0;
	Class241_Sub3_Sub2 class241_sub3_sub2
	    = (((Class103_Sub1) ((Class241_Sub45) this).aClass103_Sub1_10184)
	       .aClass241_Sub3_Sub2_9231);
	class241_sub3_sub2.pointer = 0;
	if (((Class103_Sub1) ((Class241_Sub45) this).aClass103_Sub1_10184)
	    .aBool9144) {
	    for (int i_75_ = 0; i_75_ < i; i_75_++) {
		int i_76_ = is[i_75_];
		short[] is_77_ = (((Class166_Sub2) (((Class241_Sub45) this)
						    .aClass166_Sub2_10185))
				  .aShortArrayArray9829[i_76_]);
		int i_78_ = ((Class241_Sub45) this).anIntArray10191[i_76_];
		if (i_78_ != 0 && is_77_ != null) {
		    int i_79_ = 0;
		    int i_80_ = 0;
		    while (i_80_ < is_77_.length) {
			if ((i_78_ & 1 << i_79_++) != 0) {
			    class241_sub3_sub2.writeShort((is_77_[i_80_++]
							    & 0xffff),
							   -484048531);
			    i_74_++;
			    class241_sub3_sub2.writeShort((is_77_[i_80_++]
							    & 0xffff),
							   -484048531);
			    i_74_++;
			    class241_sub3_sub2.writeShort((is_77_[i_80_++]
							    & 0xffff),
							   -484048531);
			    i_74_++;
			} else
			    i_80_ += 3;
		    }
		}
	    }
	} else {
	    for (int i_81_ = 0; i_81_ < i; i_81_++) {
		int i_82_ = is[i_81_];
		short[] is_83_ = (((Class166_Sub2) (((Class241_Sub45) this)
						    .aClass166_Sub2_10185))
				  .aShortArrayArray9829[i_82_]);
		int i_84_ = ((Class241_Sub45) this).anIntArray10191[i_82_];
		if (i_84_ != 0 && is_83_ != null) {
		    int i_85_ = 0;
		    int i_86_ = 0;
		    while (i_86_ < is_83_.length) {
			if ((i_84_ & 1 << i_85_++) != 0) {
			    class241_sub3_sub2.method14621((is_83_[i_86_++]
							    & 0xffff),
							   (byte) 13);
			    i_74_++;
			    class241_sub3_sub2.method14621((is_83_[i_86_++]
							    & 0xffff),
							   (byte) 16);
			    i_74_++;
			    class241_sub3_sub2.method14621((is_83_[i_86_++]
							    & 0xffff),
							   (byte) -53);
			    i_74_++;
			} else
			    i_86_ += 3;
		    }
		}
	    }
	}
	if (i_74_ > 0) {
	    ((Class241_Sub45) this).aClass149_Sub1_10188.method99
		(5123, class241_sub3_sub2.payload,
		 class241_sub3_sub2.pointer * 421967667);
	    ((Class241_Sub45) this).aClass103_Sub1_10184.method15168
		(((Class166_Sub2)
		  ((Class241_Sub45) this).aClass166_Sub2_10185).aClass151_9826,
		 ((Class166_Sub2)
		  ((Class241_Sub45) this).aClass166_Sub2_10185).aClass151_9828,
		 ((Class241_Sub45) this).aClass151_10189,
		 ((Class166_Sub2) (((Class241_Sub45) this)
				   .aClass166_Sub2_10185)).aClass151_9830);
	    ((Class241_Sub45) this).aClass103_Sub1_10184.method15175
		(((Class241_Sub45) this).anInt10192,
		 (((Class166_Sub2)
		   ((Class241_Sub45) this).aClass166_Sub2_10185).anInt9810
		  & 0x7) != 0,
		 (((Class166_Sub2)
		   ((Class241_Sub45) this).aClass166_Sub2_10185).anInt9810
		  & 0x8) != 0);
	    if (((Class103_Sub1) ((Class241_Sub45) this).aClass103_Sub1_10184)
		.aBool9098)
		((Class241_Sub45) this).aClass103_Sub1_10184.method2335
		    (2147483647, ((Class241_Sub45) this).aClass86_10193);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPushMatrix();
	    OpenGL.glScalef(1.0F / ((Class241_Sub45) this).aFloat10187,
			    1.0F / ((Class241_Sub45) this).aFloat10187, 1.0F);
	    OpenGL.glMatrixMode(5888);
	    ((Class241_Sub45) this).aClass103_Sub1_10184.method15168
		(((Class166_Sub2)
		  ((Class241_Sub45) this).aClass166_Sub2_10185).aClass151_9826,
		 ((Class166_Sub2)
		  ((Class241_Sub45) this).aClass166_Sub2_10185).aClass151_9828,
		 ((Class241_Sub45) this).aClass151_10189,
		 ((Class166_Sub2) (((Class241_Sub45) this)
				   .aClass166_Sub2_10185)).aClass151_9830);
	    ((Class241_Sub45) this).aClass103_Sub1_10184.method15265
		(((Class241_Sub45) this).aClass149_Sub1_10188, 4, 0, i_74_);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	}
    }
}
