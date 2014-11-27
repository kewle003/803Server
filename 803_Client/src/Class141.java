/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class141
{
    Class247_Sub1_Sub1[][] aClass247_Sub1_Sub1ArrayArray1631;
    Class241_Sub3_Sub2 aClass241_Sub3_Sub2_1632;
    Interface8 anInterface8_1633;
    int anInt1634 = 64;
    Class151 aClass151_1635;
    Class151 aClass151_1636;
    Class151 aClass151_1637;
    float[] aFloatArray1638 = new float[16];
    int[] anIntArray1639;
    int anInt1640;
    int anInt1641;
    int[] anIntArray1642;
    int[] anIntArray1643;
    int anInt1644 = 1600;
    int anInt1645 = 768;
    Class247_Sub1_Sub1[][] aClass247_Sub1_Sub1ArrayArray1646;
    int anInt1647 = 64;
    static float aFloat1648;
    
    void method3152(Class103_Sub1 class103_sub1, int i) {
	OpenGL.glGetFloatv(2982, ((Class141) this).aFloatArray1638, 0);
	float f = ((Class141) this).aFloatArray1638[0];
	float f_0_ = ((Class141) this).aFloatArray1638[4];
	float f_1_ = ((Class141) this).aFloatArray1638[8];
	float f_2_ = ((Class141) this).aFloatArray1638[1];
	float f_3_ = ((Class141) this).aFloatArray1638[5];
	float f_4_ = ((Class141) this).aFloatArray1638[9];
	float f_5_ = f + f_2_;
	float f_6_ = f_0_ + f_3_;
	float f_7_ = f_1_ + f_4_;
	float f_8_ = f - f_2_;
	float f_9_ = f_0_ - f_3_;
	float f_10_ = f_1_ - f_4_;
	float f_11_ = f_2_ - f;
	float f_12_ = f_3_ - f_0_;
	float f_13_ = f_4_ - f_1_;
	float[] fs = new float[3];
	float[] fs_14_ = new float[3];
	((Class103_Sub1) class103_sub1).aClass268_9136
	    .method5200(((Class103_Sub1) class103_sub1).aClass268_9121);
	((Class141) this).aClass241_Sub3_Sub2_1632.pointer = 0;
	if (((Class103_Sub1) class103_sub1).aBool9144) {
	    for (int i_15_ = i - 1; i_15_ >= 0; i_15_--) {
		int i_16_ = (((Class141) this).anIntArray1643[i_15_] > 64 ? 64
			     : ((Class141) this).anIntArray1643[i_15_]);
		if (i_16_ > 0) {
		    for (int i_17_ = i_16_ - 1; i_17_ >= 0; i_17_--) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (((Class141) this)
			       .aClass247_Sub1_Sub1ArrayArray1631[i_15_]
			       [i_17_]);
			int i_18_ = class247_sub1_sub1.anInt11065;
			byte i_19_ = (byte) (i_18_ >> 16);
			byte i_20_ = (byte) (i_18_ >> 8);
			byte i_21_ = (byte) i_18_;
			byte i_22_ = (byte) (i_18_ >>> 24);
			float f_23_
			    = (float) (class247_sub1_sub1.anInt11064 >> 12);
			float f_24_
			    = (float) (class247_sub1_sub1.anInt11061 >> 12);
			float f_25_
			    = (float) (class247_sub1_sub1.anInt11060 >> 12);
			int i_26_ = class247_sub1_sub1.anInt11058 >> 12;
			if (class247_sub1_sub1.aShort11066 != 0) {
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5232
				(class247_sub1_sub1.aShort11066, i_26_, i_26_,
				 0.0F, 0.0F, 0.0F);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5202
				(((Class103_Sub1) class103_sub1)
				 .aClass268_9136);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(1.0F, 0.0F, 0.0F, fs);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(0.0F, 1.0F, 0.0F, fs_14_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_23_ - fs[0] - fs_14_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_24_ - fs[1] - fs_14_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_25_ - fs[2] - fs_14_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_19_, -1907610580);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_20_, -1238337485);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_21_, 1232457330);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_22_, 369295922);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_23_ - fs[0] + fs_14_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_24_ - fs[1] + fs_14_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_25_ - fs[2] + fs_14_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_19_, 644396667);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_20_, -1019963982);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_21_, 893935203);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_22_, -1006559812);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_23_ + fs[0] + fs_14_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_24_ + fs[1] + fs_14_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_25_ + fs[2] + fs_14_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_19_, 1367053202);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_20_, 897569893);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_21_, 195998002);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_22_, 1520502254);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_23_ + fs[0] - fs_14_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_24_ + fs[1] - fs_14_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_25_ + fs[2] - fs_14_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_19_, 1325474564);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_20_, 895700756);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_21_, 1038137302);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_22_, -1367455594);
			} else {
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_23_ + f_5_ * (float) -i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_24_ + f_6_ * (float) -i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_25_ + f_7_ * (float) -i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_19_, 47688740);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_20_, -1650829691);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_21_, 89629505);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_22_, 562789967);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_23_ + f_11_ * (float) i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_24_ + f_12_ * (float) i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_25_ + f_13_ * (float) i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_19_, 1053463271);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_20_, 116167985);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_21_, -1885877839);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_22_, 970147976);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_23_ + f_5_ * (float) i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_24_ + f_6_ * (float) i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_25_ + f_7_ * (float) i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_19_, 1064638737);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_20_, -997572404);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_21_, -1481971118);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_22_, 441083048);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_23_ + f_8_ * (float) i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_24_ + f_9_ * (float) i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_25_ + f_10_ * (float) i_26_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_19_, 1428822015);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_20_, 1553918462);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_21_, -1881122897);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_22_, 175316651);
			}
		    }
		    if (((Class141) this).anIntArray1643[i_15_] > 64) {
			int i_27_
			    = ((Class141) this).anIntArray1643[i_15_] - 64 - 1;
			for (int i_28_
				 = ((Class141) this).anIntArray1639[i_27_] - 1;
			     i_28_ >= 0; i_28_--) {
			    Class247_Sub1_Sub1 class247_sub1_sub1
				= (((Class141) this)
				   .aClass247_Sub1_Sub1ArrayArray1646[i_27_]
				   [i_28_]);
			    int i_29_ = class247_sub1_sub1.anInt11065;
			    byte i_30_ = (byte) (i_29_ >> 16);
			    byte i_31_ = (byte) (i_29_ >> 8);
			    byte i_32_ = (byte) i_29_;
			    byte i_33_ = (byte) (i_29_ >>> 24);
			    float f_34_
				= (float) (class247_sub1_sub1.anInt11064
					   >> 12);
			    float f_35_
				= (float) (class247_sub1_sub1.anInt11061
					   >> 12);
			    float f_36_
				= (float) (class247_sub1_sub1.anInt11060
					   >> 12);
			    int i_37_ = class247_sub1_sub1.anInt11058 >> 12;
			    if (class247_sub1_sub1.aShort11066 != 0) {
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5232
				    (class247_sub1_sub1.aShort11066, i_37_,
				     i_37_, 0.0F, 0.0F, 0.0F);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5202
				    (((Class103_Sub1) class103_sub1)
				     .aClass268_9136);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(1.0F, 0.0F, 0.0F, fs);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(0.0F, 1.0F, 0.0F, fs_14_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_34_ - fs[0] - fs_14_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_35_ - fs[1] - fs_14_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_36_ - fs[2] - fs_14_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_30_, -2127031377);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_31_, -1653893413);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_32_, -371823876);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_33_, -681807367);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_34_ - fs[0] + fs_14_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_35_ - fs[1] + fs_14_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_36_ - fs[2] + fs_14_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_30_, -1957811857);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_31_, -688282904);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_32_, 1672945858);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_33_, -1674726061);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_34_ + fs[0] + fs_14_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_35_ + fs[1] + fs_14_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_36_ + fs[2] + fs_14_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_30_, -2094263994);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_31_, 1323110662);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_32_, -1175955854);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_33_, -2108883913);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_34_ + fs[0] - fs_14_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_35_ + fs[1] - fs_14_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_36_ + fs[2] - fs_14_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_30_, -575865462);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_31_, 1497607581);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_32_, 574581181);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_33_, 85574901);
			    } else {
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_34_ + f_5_ * (float) -i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_35_ + f_6_ * (float) -i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_36_ + f_7_ * (float) -i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_30_, 1453751417);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_31_, 1694958385);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_32_, 1483628324);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_33_, -1117160764);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_34_ + f_11_ * (float) i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_35_ + f_12_ * (float) i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_36_ + f_13_ * (float) i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_30_, -522305888);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_31_, 1461397070);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_32_, -1695809658);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_33_, 827066666);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_34_ + f_5_ * (float) i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_35_ + f_6_ * (float) i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_36_ + f_7_ * (float) i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_30_, -71743473);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_31_, 1674886639);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_32_, -1909729042);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_33_, 498372412);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_34_ + f_8_ * (float) i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_35_ + f_9_ * (float) i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_36_ + f_10_ * (float) i_37_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_30_, 1192807040);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_31_, 223245341);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_32_, -1093842572);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_33_, -188903184);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_38_ = i - 1; i_38_ >= 0; i_38_--) {
		int i_39_ = (((Class141) this).anIntArray1643[i_38_] > 64 ? 64
			     : ((Class141) this).anIntArray1643[i_38_]);
		if (i_39_ > 0) {
		    for (int i_40_ = i_39_ - 1; i_40_ >= 0; i_40_--) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (((Class141) this)
			       .aClass247_Sub1_Sub1ArrayArray1631[i_38_]
			       [i_40_]);
			int i_41_ = class247_sub1_sub1.anInt11065;
			byte i_42_ = (byte) (i_41_ >> 16);
			byte i_43_ = (byte) (i_41_ >> 8);
			byte i_44_ = (byte) i_41_;
			byte i_45_ = (byte) (i_41_ >>> 24);
			float f_46_
			    = (float) (class247_sub1_sub1.anInt11064 >> 12);
			float f_47_
			    = (float) (class247_sub1_sub1.anInt11061 >> 12);
			float f_48_
			    = (float) (class247_sub1_sub1.anInt11060 >> 12);
			int i_49_ = class247_sub1_sub1.anInt11058 >> 12;
			if (class247_sub1_sub1.aShort11066 != 0) {
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5232
				(class247_sub1_sub1.aShort11066, i_49_, i_49_,
				 0.0F, 0.0F, 0.0F);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5202
				(((Class103_Sub1) class103_sub1)
				 .aClass268_9136);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(1.0F, 0.0F, 0.0F, fs);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(0.0F, 1.0F, 0.0F, fs_14_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_46_ - fs[0] - fs_14_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_47_ - fs[1] - fs_14_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_48_ - fs[2] - fs_14_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_42_, -179418170);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_43_, -988522069);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_44_, -796473662);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_45_, -1646399208);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_46_ - fs[0] + fs_14_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_47_ - fs[1] + fs_14_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_48_ - fs[2] + fs_14_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_42_, -1355944225);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_43_, -2019018460);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_44_, -329000679);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_45_, 604465886);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_46_ + fs[0] + fs_14_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_47_ + fs[1] + fs_14_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_48_ + fs[2] + fs_14_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_42_, 1375276301);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_43_, -1161407352);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_44_, -154790024);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_45_, -377419616);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_46_ + fs[0] - fs_14_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_47_ + fs[1] - fs_14_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_48_ + fs[2] - fs_14_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_42_, 1372541789);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_43_, -1197149747);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_44_, 536454963);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_45_, 1002077542);
			} else {
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_46_ + f_5_ * (float) -i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_47_ + f_6_ * (float) -i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_48_ + f_7_ * (float) -i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_42_, -1045313775);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_43_, -1000588764);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_44_, -1748217941);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_45_, -665853861);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_46_ + f_11_ * (float) i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_47_ + f_12_ * (float) i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_48_ + f_13_ * (float) i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_42_, -1631234488);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_43_, -771379509);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_44_, 1052749985);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_45_, -803503183);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_46_ + f_5_ * (float) i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_47_ + f_6_ * (float) i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_48_ + f_7_ * (float) i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_42_, 602991735);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_43_, 289662797);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_44_, -767376662);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_45_, -1117420269);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_46_ + f_8_ * (float) i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_47_ + f_9_ * (float) i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_48_ + f_10_ * (float) i_49_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_42_, -1406323305);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_43_, -984941218);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_44_, -212463431);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_45_, 860266678);
			}
		    }
		    if (((Class141) this).anIntArray1643[i_38_] > 64) {
			int i_50_
			    = ((Class141) this).anIntArray1643[i_38_] - 64 - 1;
			for (int i_51_
				 = ((Class141) this).anIntArray1639[i_50_] - 1;
			     i_51_ >= 0; i_51_--) {
			    Class247_Sub1_Sub1 class247_sub1_sub1
				= (((Class141) this)
				   .aClass247_Sub1_Sub1ArrayArray1646[i_50_]
				   [i_51_]);
			    int i_52_ = class247_sub1_sub1.anInt11065;
			    byte i_53_ = (byte) (i_52_ >> 16);
			    byte i_54_ = (byte) (i_52_ >> 8);
			    byte i_55_ = (byte) i_52_;
			    byte i_56_ = (byte) (i_52_ >>> 24);
			    float f_57_
				= (float) (class247_sub1_sub1.anInt11064
					   >> 12);
			    float f_58_
				= (float) (class247_sub1_sub1.anInt11061
					   >> 12);
			    float f_59_
				= (float) (class247_sub1_sub1.anInt11060
					   >> 12);
			    int i_60_ = class247_sub1_sub1.anInt11058 >> 12;
			    if (class247_sub1_sub1.aShort11066 != 0) {
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5232
				    (class247_sub1_sub1.aShort11066, i_60_,
				     i_60_, 0.0F, 0.0F, 0.0F);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5202
				    (((Class103_Sub1) class103_sub1)
				     .aClass268_9136);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(1.0F, 0.0F, 0.0F, fs);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(0.0F, 1.0F, 0.0F, fs_14_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_57_ - fs[0] - fs_14_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_58_ - fs[1] - fs_14_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_59_ - fs[2] - fs_14_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_53_, -1238454065);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_54_, 112348805);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_55_, -113175695);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_56_, -928900029);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_57_ - fs[0] + fs_14_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_58_ - fs[1] + fs_14_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_59_ - fs[2] + fs_14_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_53_, 246045406);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_54_, -1121999791);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_55_, 283057923);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_56_, 1043880666);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_57_ + fs[0] + fs_14_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_58_ + fs[1] + fs_14_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_59_ + fs[2] + fs_14_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_53_, 1186851435);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_54_, -536865373);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_55_, -538629340);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_56_, -1169586762);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_57_ + fs[0] - fs_14_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_58_ + fs[1] - fs_14_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_59_ + fs[2] - fs_14_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_53_, 273615585);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_54_, -1972690349);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_55_, 1259929963);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_56_, -2039420533);
			    } else {
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_57_ + f_5_ * (float) -i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_58_ + f_6_ * (float) -i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_59_ + f_7_ * (float) -i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_53_, 1186707455);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_54_, -649180824);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_55_, 1749839870);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_56_, 422601147);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_57_ + f_11_ * (float) i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_58_ + f_12_ * (float) i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_59_ + f_13_ * (float) i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_53_, 51914863);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_54_, 1355679316);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_55_, 619793809);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_56_, -1137435186);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_57_ + f_5_ * (float) i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_58_ + f_6_ * (float) i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_59_ + f_7_ * (float) i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_53_, -1817237625);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_54_, -1040047622);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_55_, -1021820342);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_56_, -563729425);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_57_ + f_8_ * (float) i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_58_ + f_9_ * (float) i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_59_ + f_10_ * (float) i_60_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_53_, -642744536);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_54_, 155043768);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_55_, 725735254);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_56_, -1239318435);
			    }
			}
		    }
		}
	    }
	}
	if (((Class141) this).aClass241_Sub3_Sub2_1632.pointer * 421967667
	    != 0) {
	    ((Class141) this).anInterface8_1633.method51
		(24, ((Class141) this).aClass241_Sub3_Sub2_1632.payload,
		 (((Class141) this).aClass241_Sub3_Sub2_1632.pointer
		  * 421967667));
	    class103_sub1.method15168(((Class141) this).aClass151_1637, null,
				      ((Class141) this).aClass151_1635,
				      ((Class141) this).aClass151_1636);
	    class103_sub1.method15169(7, 0, (((Class141) this)
					     .aClass241_Sub3_Sub2_1632
					     .pointer) * 421967667 / 24);
	}
    }
    
    void method3153(Class103_Sub1 class103_sub1) {
	((Class141) this).anInterface8_1633
	    = class103_sub1.method15165(24, null, 196584, true);
	((Class141) this).aClass151_1636
	    = new Class151(((Class141) this).anInterface8_1633, 5126, 2, 0);
	((Class141) this).aClass151_1637
	    = new Class151(((Class141) this).anInterface8_1633, 5126, 3, 8);
	((Class141) this).aClass151_1635
	    = new Class151(((Class141) this).anInterface8_1633, 5121, 4, 20);
    }
    
    void method3154(Class103_Sub1 class103_sub1, int i) {
	OpenGL.glGetFloatv(2982, ((Class141) this).aFloatArray1638, 0);
	float f = ((Class141) this).aFloatArray1638[0];
	float f_61_ = ((Class141) this).aFloatArray1638[4];
	float f_62_ = ((Class141) this).aFloatArray1638[8];
	float f_63_ = ((Class141) this).aFloatArray1638[1];
	float f_64_ = ((Class141) this).aFloatArray1638[5];
	float f_65_ = ((Class141) this).aFloatArray1638[9];
	float f_66_ = f + f_63_;
	float f_67_ = f_61_ + f_64_;
	float f_68_ = f_62_ + f_65_;
	float f_69_ = f - f_63_;
	float f_70_ = f_61_ - f_64_;
	float f_71_ = f_62_ - f_65_;
	float f_72_ = f_63_ - f;
	float f_73_ = f_64_ - f_61_;
	float f_74_ = f_65_ - f_62_;
	float[] fs = new float[3];
	float[] fs_75_ = new float[3];
	((Class103_Sub1) class103_sub1).aClass268_9136
	    .method5200(((Class103_Sub1) class103_sub1).aClass268_9121);
	((Class141) this).aClass241_Sub3_Sub2_1632.pointer = 0;
	if (((Class103_Sub1) class103_sub1).aBool9144) {
	    for (int i_76_ = i - 1; i_76_ >= 0; i_76_--) {
		int i_77_ = (((Class141) this).anIntArray1643[i_76_] > 64 ? 64
			     : ((Class141) this).anIntArray1643[i_76_]);
		if (i_77_ > 0) {
		    for (int i_78_ = i_77_ - 1; i_78_ >= 0; i_78_--) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (((Class141) this)
			       .aClass247_Sub1_Sub1ArrayArray1631[i_76_]
			       [i_78_]);
			int i_79_ = class247_sub1_sub1.anInt11065;
			byte i_80_ = (byte) (i_79_ >> 16);
			byte i_81_ = (byte) (i_79_ >> 8);
			byte i_82_ = (byte) i_79_;
			byte i_83_ = (byte) (i_79_ >>> 24);
			float f_84_
			    = (float) (class247_sub1_sub1.anInt11064 >> 12);
			float f_85_
			    = (float) (class247_sub1_sub1.anInt11061 >> 12);
			float f_86_
			    = (float) (class247_sub1_sub1.anInt11060 >> 12);
			int i_87_ = class247_sub1_sub1.anInt11058 >> 12;
			if (class247_sub1_sub1.aShort11066 != 0) {
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5232
				(class247_sub1_sub1.aShort11066, i_87_, i_87_,
				 0.0F, 0.0F, 0.0F);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5202
				(((Class103_Sub1) class103_sub1)
				 .aClass268_9136);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(1.0F, 0.0F, 0.0F, fs);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(0.0F, 1.0F, 0.0F, fs_75_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_84_ - fs[0] - fs_75_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_85_ - fs[1] - fs_75_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_86_ - fs[2] - fs_75_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_80_, -464202984);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_81_, -542550915);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_82_, 911142009);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_83_, 1019729814);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_84_ - fs[0] + fs_75_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_85_ - fs[1] + fs_75_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_86_ - fs[2] + fs_75_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_80_, -1680775955);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_81_, -1667657725);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_82_, 429465559);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_83_, 1170520036);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_84_ + fs[0] + fs_75_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_85_ + fs[1] + fs_75_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_86_ + fs[2] + fs_75_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_80_, -1949153110);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_81_, -2062270351);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_82_, 353000336);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_83_, 874037168);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_84_ + fs[0] - fs_75_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_85_ + fs[1] - fs_75_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_86_ + fs[2] - fs_75_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_80_, -374393020);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_81_, -699869988);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_82_, 660665017);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_83_, -190095576);
			} else {
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_84_ + f_66_ * (float) -i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_85_ + f_67_ * (float) -i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_86_ + f_68_ * (float) -i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_80_, -499045332);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_81_, -1206406407);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_82_, -723878508);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_83_, 1179120916);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_84_ + f_72_ * (float) i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_85_ + f_73_ * (float) i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_86_ + f_74_ * (float) i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_80_, -2114759179);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_81_, 303011403);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_82_, 770676779);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_83_, 1725733489);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_84_ + f_66_ * (float) i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_85_ + f_67_ * (float) i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_86_ + f_68_ * (float) i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_80_, 525889772);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_81_, -247714377);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_82_, -69527317);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_83_, -645463198);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_84_ + f_69_ * (float) i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_85_ + f_70_ * (float) i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_86_ + f_71_ * (float) i_87_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_80_, -818637856);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_81_, -1850082229);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_82_, 1279589655);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_83_, 1673524548);
			}
		    }
		    if (((Class141) this).anIntArray1643[i_76_] > 64) {
			int i_88_
			    = ((Class141) this).anIntArray1643[i_76_] - 64 - 1;
			for (int i_89_
				 = ((Class141) this).anIntArray1639[i_88_] - 1;
			     i_89_ >= 0; i_89_--) {
			    Class247_Sub1_Sub1 class247_sub1_sub1
				= (((Class141) this)
				   .aClass247_Sub1_Sub1ArrayArray1646[i_88_]
				   [i_89_]);
			    int i_90_ = class247_sub1_sub1.anInt11065;
			    byte i_91_ = (byte) (i_90_ >> 16);
			    byte i_92_ = (byte) (i_90_ >> 8);
			    byte i_93_ = (byte) i_90_;
			    byte i_94_ = (byte) (i_90_ >>> 24);
			    float f_95_
				= (float) (class247_sub1_sub1.anInt11064
					   >> 12);
			    float f_96_
				= (float) (class247_sub1_sub1.anInt11061
					   >> 12);
			    float f_97_
				= (float) (class247_sub1_sub1.anInt11060
					   >> 12);
			    int i_98_ = class247_sub1_sub1.anInt11058 >> 12;
			    if (class247_sub1_sub1.aShort11066 != 0) {
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5232
				    (class247_sub1_sub1.aShort11066, i_98_,
				     i_98_, 0.0F, 0.0F, 0.0F);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5202
				    (((Class103_Sub1) class103_sub1)
				     .aClass268_9136);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(1.0F, 0.0F, 0.0F, fs);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(0.0F, 1.0F, 0.0F, fs_75_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_95_ - fs[0] - fs_75_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_96_ - fs[1] - fs_75_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_97_ - fs[2] - fs_75_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_91_, 1739034499);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_92_, -692278260);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_93_, 1683275335);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_94_, 799324669);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_95_ - fs[0] + fs_75_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_96_ - fs[1] + fs_75_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_97_ - fs[2] + fs_75_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_91_, -1599941471);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_92_, 1641287076);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_93_, 830334508);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_94_, 1324827101);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_95_ + fs[0] + fs_75_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_96_ + fs[1] + fs_75_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_97_ + fs[2] + fs_75_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_91_, -123818952);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_92_, 359657127);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_93_, 1002869801);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_94_, -626454326);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_95_ + fs[0] - fs_75_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_96_ + fs[1] - fs_75_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_97_ + fs[2] - fs_75_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_91_, 423581879);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_92_, 379249529);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_93_, 551328020);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_94_, -16091886);
			    } else {
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_95_ + f_66_ * (float) -i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_96_ + f_67_ * (float) -i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_97_ + f_68_ * (float) -i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_91_, -1360725880);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_92_, 1453338620);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_93_, -1217849246);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_94_, -288327944);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_95_ + f_72_ * (float) i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_96_ + f_73_ * (float) i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_97_ + f_74_ * (float) i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_91_, -545932534);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_92_, 104068085);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_93_, -2120961233);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_94_, 1000967319);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_95_ + f_66_ * (float) i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_96_ + f_67_ * (float) i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_97_ + f_68_ * (float) i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_91_, 518899134);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_92_, -331887074);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_93_, 34343104);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_94_, 966739712);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_95_ + f_69_ * (float) i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_96_ + f_70_ * (float) i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_97_ + f_71_ * (float) i_98_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_91_, -1388389802);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_92_, -1586804168);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_93_, 371180813);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_94_, -1021271858);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_99_ = i - 1; i_99_ >= 0; i_99_--) {
		int i_100_ = (((Class141) this).anIntArray1643[i_99_] > 64 ? 64
			      : ((Class141) this).anIntArray1643[i_99_]);
		if (i_100_ > 0) {
		    for (int i_101_ = i_100_ - 1; i_101_ >= 0; i_101_--) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (((Class141) this)
			       .aClass247_Sub1_Sub1ArrayArray1631[i_99_]
			       [i_101_]);
			int i_102_ = class247_sub1_sub1.anInt11065;
			byte i_103_ = (byte) (i_102_ >> 16);
			byte i_104_ = (byte) (i_102_ >> 8);
			byte i_105_ = (byte) i_102_;
			byte i_106_ = (byte) (i_102_ >>> 24);
			float f_107_
			    = (float) (class247_sub1_sub1.anInt11064 >> 12);
			float f_108_
			    = (float) (class247_sub1_sub1.anInt11061 >> 12);
			float f_109_
			    = (float) (class247_sub1_sub1.anInt11060 >> 12);
			int i_110_ = class247_sub1_sub1.anInt11058 >> 12;
			if (class247_sub1_sub1.aShort11066 != 0) {
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5232
				(class247_sub1_sub1.aShort11066, i_110_,
				 i_110_, 0.0F, 0.0F, 0.0F);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5202
				(((Class103_Sub1) class103_sub1)
				 .aClass268_9136);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(1.0F, 0.0F, 0.0F, fs);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(0.0F, 1.0F, 0.0F, fs_75_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_107_ - fs[0] - fs_75_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_108_ - fs[1] - fs_75_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_109_ - fs[2] - fs_75_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_103_, 1564781867);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_104_, -1128492584);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_105_, -200060611);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_106_, -454343749);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_107_ - fs[0] + fs_75_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_108_ - fs[1] + fs_75_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_109_ - fs[2] + fs_75_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_103_, 290869452);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_104_, -1215585979);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_105_, 1002267052);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_106_, -48679988);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_107_ + fs[0] + fs_75_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_108_ + fs[1] + fs_75_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_109_ + fs[2] + fs_75_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_103_, 310612093);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_104_, -1535258596);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_105_, 961481714);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_106_, -1073910320);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_107_ + fs[0] - fs_75_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_108_ + fs[1] - fs_75_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_109_ + fs[2] - fs_75_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_103_, 497644189);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_104_, 1337128335);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_105_, -1691458916);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_106_, -1462611123);
			} else {
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_107_ + f_66_ * (float) -i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_108_ + f_67_ * (float) -i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_109_ + f_68_ * (float) -i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_103_, 1727546940);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_104_, 1344895860);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_105_, 1054896693);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_106_, -31388155);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_107_ + f_72_ * (float) i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_108_ + f_73_ * (float) i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_109_ + f_74_ * (float) i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_103_, -2117493645);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_104_, -238228515);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_105_, 917120279);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_106_, 1427459803);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_107_ + f_66_ * (float) i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_108_ + f_67_ * (float) i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_109_ + f_68_ * (float) i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_103_, -1940799821);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_104_, -1402403600);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_105_, -355231890);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_106_, 909431343);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_107_ + f_69_ * (float) i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_108_ + f_70_ * (float) i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_109_ + f_71_ * (float) i_110_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_103_, -2143377674);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_104_, -829493568);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_105_, 24444435);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_106_, -318416478);
			}
		    }
		    if (((Class141) this).anIntArray1643[i_99_] > 64) {
			int i_111_
			    = ((Class141) this).anIntArray1643[i_99_] - 64 - 1;
			for (int i_112_ = (((Class141) this).anIntArray1639
					   [i_111_]) - 1;
			     i_112_ >= 0; i_112_--) {
			    Class247_Sub1_Sub1 class247_sub1_sub1
				= (((Class141) this)
				   .aClass247_Sub1_Sub1ArrayArray1646[i_111_]
				   [i_112_]);
			    int i_113_ = class247_sub1_sub1.anInt11065;
			    byte i_114_ = (byte) (i_113_ >> 16);
			    byte i_115_ = (byte) (i_113_ >> 8);
			    byte i_116_ = (byte) i_113_;
			    byte i_117_ = (byte) (i_113_ >>> 24);
			    float f_118_
				= (float) (class247_sub1_sub1.anInt11064
					   >> 12);
			    float f_119_
				= (float) (class247_sub1_sub1.anInt11061
					   >> 12);
			    float f_120_
				= (float) (class247_sub1_sub1.anInt11060
					   >> 12);
			    int i_121_ = class247_sub1_sub1.anInt11058 >> 12;
			    if (class247_sub1_sub1.aShort11066 != 0) {
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5232
				    (class247_sub1_sub1.aShort11066, i_121_,
				     i_121_, 0.0F, 0.0F, 0.0F);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5202
				    (((Class103_Sub1) class103_sub1)
				     .aClass268_9136);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(1.0F, 0.0F, 0.0F, fs);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(0.0F, 1.0F, 0.0F, fs_75_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_118_ - fs[0] - fs_75_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_119_ - fs[1] - fs_75_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_120_ - fs[2] - fs_75_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_114_, -613206122);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_115_, -1001057163);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_116_, 533363043);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_117_, -1940507542);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_118_ - fs[0] + fs_75_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_119_ - fs[1] + fs_75_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_120_ - fs[2] + fs_75_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_114_, 980946892);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_115_, 152460460);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_116_, 40198181);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_117_, 723197000);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_118_ + fs[0] + fs_75_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_119_ + fs[1] + fs_75_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_120_ + fs[2] + fs_75_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_114_, -110842908);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_115_, 176627041);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_116_, -293116674);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_117_, -1216826770);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_118_ + fs[0] - fs_75_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_119_ + fs[1] - fs_75_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_120_ + fs[2] - fs_75_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_114_, 1022629064);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_115_, 967791149);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_116_, -1012520497);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_117_, 979322353);
			    } else {
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_118_ + f_66_ * (float) -i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_119_ + f_67_ * (float) -i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_120_ + f_68_ * (float) -i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_114_, 1568758794);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_115_, -1137521738);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_116_, -2133527067);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_117_, 601248779);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_118_ + f_72_ * (float) i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_119_ + f_73_ * (float) i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_120_ + f_74_ * (float) i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_114_, -518083472);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_115_, 344924301);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_116_, -909118405);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_117_, 268534430);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_118_ + f_66_ * (float) i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_119_ + f_67_ * (float) i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_120_ + f_68_ * (float) i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_114_, -979436039);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_115_, 1664093893);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_116_, -906054177);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_117_, 827665493);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_118_ + f_69_ * (float) i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_119_ + f_70_ * (float) i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_120_ + f_71_ * (float) i_121_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_114_, 1319487940);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_115_, -21047493);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_116_, -192826281);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_117_, -449265450);
			    }
			}
		    }
		}
	    }
	}
	if (((Class141) this).aClass241_Sub3_Sub2_1632.pointer * 421967667
	    != 0) {
	    ((Class141) this).anInterface8_1633.method51
		(24, ((Class141) this).aClass241_Sub3_Sub2_1632.payload,
		 (((Class141) this).aClass241_Sub3_Sub2_1632.pointer
		  * 421967667));
	    class103_sub1.method15168(((Class141) this).aClass151_1637, null,
				      ((Class141) this).aClass151_1635,
				      ((Class141) this).aClass151_1636);
	    class103_sub1.method15169(7, 0, (((Class141) this)
					     .aClass241_Sub3_Sub2_1632
					     .pointer) * 421967667 / 24);
	}
    }
    
    void method3155(Class103_Sub1 class103_sub1) {
	class103_sub1.method15190(true);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (((Class103_Sub1) class103_sub1).aFloat9162 != aFloat1648)
	    class103_sub1.method2311(aFloat1648);
    }
    
    void method3156(Class103_Sub1 class103_sub1) {
	aFloat1648 = ((Class103_Sub1) class103_sub1).aFloat9162;
	class103_sub1.method15259();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	class103_sub1.method15190(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    Class141() {
	((Class141) this).aClass241_Sub3_Sub2_1632
	    = new Class241_Sub3_Sub2(786336);
	((Class141) this).anInt1647 = 64;
	((Class141) this).anInt1645 = 768;
	((Class141) this).anInt1644 = 1600;
	((Class141) this).anInt1640 = Class436.method7795(1600, (byte) -43);
	((Class141) this).anInt1634 = 64;
	((Class141) this).anIntArray1642 = new int[8191];
	((Class141) this).anIntArray1643 = new int[1600];
	((Class141) this).anIntArray1639 = new int[64];
	((Class141) this).aClass247_Sub1_Sub1ArrayArray1631
	    = new Class247_Sub1_Sub1[1600][64];
	((Class141) this).aClass247_Sub1_Sub1ArrayArray1646
	    = new Class247_Sub1_Sub1[64][768];
	((Class141) this).anInt1641 = 0;
    }
    
    void method3157(Class103_Sub1 class103_sub1) {
	((Class141) this).anInterface8_1633
	    = class103_sub1.method15165(24, null, 196584, true);
	((Class141) this).aClass151_1636
	    = new Class151(((Class141) this).anInterface8_1633, 5126, 2, 0);
	((Class141) this).aClass151_1637
	    = new Class151(((Class141) this).anInterface8_1633, 5126, 3, 8);
	((Class141) this).aClass151_1635
	    = new Class151(((Class141) this).anInterface8_1633, 5121, 4, 20);
    }
    
    void method3158(Class103_Sub1 class103_sub1) {
	((Class141) this).anInterface8_1633
	    = class103_sub1.method15165(24, null, 196584, true);
	((Class141) this).aClass151_1636
	    = new Class151(((Class141) this).anInterface8_1633, 5126, 2, 0);
	((Class141) this).aClass151_1637
	    = new Class151(((Class141) this).anInterface8_1633, 5126, 3, 8);
	((Class141) this).aClass151_1635
	    = new Class151(((Class141) this).anInterface8_1633, 5121, 4, 20);
    }
    
    void method3159(Class103_Sub1 class103_sub1) {
	class103_sub1.method15190(true);
	OpenGL.glEnable(16384);
	OpenGL.glEnable(16385);
	if (((Class103_Sub1) class103_sub1).aFloat9162 != aFloat1648)
	    class103_sub1.method2311(aFloat1648);
    }
    
    void method3160(Class103_Sub1 class103_sub1, Class98 class98) {
	if (((Class103_Sub1) class103_sub1).aClass268_9150 != null) {
	    method3162(class103_sub1);
	    float f = (((Class103_Sub1) class103_sub1).aClass268_9150
		       .aFloatArray4353[2]);
	    float f_122_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[6]);
	    float f_123_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[10]);
	    float f_124_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[14]);
	    try {
		int i = 0;
		int i_125_ = 2147483647;
		int i_126_ = 0;
		Class247_Sub1 class247_sub1
		    = class98.aClass441_1353.aClass247_Sub1_6157;
		for (Class247_Sub1 class247_sub1_127_
			 = class247_sub1.aClass247_Sub1_10037;
		     class247_sub1_127_ != class247_sub1;
		     class247_sub1_127_
			 = class247_sub1_127_.aClass247_Sub1_10037) {
		    Class247_Sub1_Sub1 class247_sub1_sub1
			= (Class247_Sub1_Sub1) class247_sub1_127_;
		    int i_128_
			= (int) (f * (float) (class247_sub1_sub1.anInt11064
					      >> 12)
				 + (f_122_
				    * (float) (class247_sub1_sub1.anInt11061
					       >> 12))
				 + (f_123_
				    * (float) (class247_sub1_sub1.anInt11060
					       >> 12))
				 + f_124_);
		    if (i_128_ > i_126_)
			i_126_ = i_128_;
		    if (i_128_ < i_125_)
			i_125_ = i_128_;
		    ((Class141) this).anIntArray1642[i++] = i_128_;
		}
		int i_129_ = i_126_ - i_125_;
		int i_130_;
		if (i_129_ + 2 > 1600) {
		    i_130_ = (1 + Class436.method7795(i_129_, (byte) -89)
			      - ((Class141) this).anInt1640);
		    i_129_ = (i_129_ >> i_130_) + 2;
		} else {
		    i_130_ = 0;
		    i_129_ += 2;
		}
		Class247_Sub1 class247_sub1_131_
		    = class247_sub1.aClass247_Sub1_10037;
		i = 0;
		int i_132_ = -2;
		boolean bool = true;
		boolean bool_133_ = true;
		while (class247_sub1_131_ != class247_sub1) {
		    ((Class141) this).anInt1641 = 0;
		    for (int i_134_ = 0; i_134_ < i_129_; i_134_++)
			((Class141) this).anIntArray1643[i_134_] = 0;
		    for (int i_135_ = 0; i_135_ < 64; i_135_++)
			((Class141) this).anIntArray1639[i_135_] = 0;
		    for (/**/; class247_sub1_131_ != class247_sub1;
			 class247_sub1_131_
			     = class247_sub1_131_.aClass247_Sub1_10037) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (Class247_Sub1_Sub1) class247_sub1_131_;
			if (bool_133_) {
			    i_132_ = class247_sub1_sub1.anInt11062;
			    bool = class247_sub1_sub1.aBool11067;
			    bool_133_ = false;
			}
			if (i > 0
			    && (i_132_ != class247_sub1_sub1.anInt11062
				|| bool != class247_sub1_sub1.aBool11067)) {
			    bool_133_ = true;
			    break;
			}
			int i_136_
			    = (((Class141) this).anIntArray1642[i++] - i_125_
			       >> i_130_);
			if (i_136_ < 1600) {
			    if (((Class141) this).anIntArray1643[i_136_] < 64)
				((Class141) this)
				    .aClass247_Sub1_Sub1ArrayArray1631[i_136_]
				    [((Class141) this).anIntArray1643
					 [i_136_]++]
				    = class247_sub1_sub1;
			    else {
				if (((Class141) this).anIntArray1643[i_136_]
				    == 64) {
				    if (((Class141) this).anInt1641 == 64)
					continue;
				    ((Class141) this).anIntArray1643[i_136_]
					+= 1 + ((Class141) this).anInt1641++;
				}
				((Class141) this)
				    .aClass247_Sub1_Sub1ArrayArray1646
				    [(((Class141) this).anIntArray1643[i_136_]
				      - 64 - 1)]
				    [((Class141) this).anIntArray1639
					 [(((Class141) this).anIntArray1643
					   [i_136_]) - 64 - 1]++]
				    = class247_sub1_sub1;
			    }
			}
		    }
		    if (i_132_ >= 0)
			class103_sub1.method15173(i_132_);
		    else
			class103_sub1.method15173(-1);
		    if (bool && (((Class103_Sub1) class103_sub1).aFloat9162
				 != aFloat1648))
			class103_sub1.method2311(aFloat1648);
		    else if (((Class103_Sub1) class103_sub1).aFloat9162
			     != 1.0F)
			class103_sub1.method2311(1.0F);
		    method3154(class103_sub1, i_129_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method3159(class103_sub1);
	}
    }
    
    void method3161(Class103_Sub1 class103_sub1, Class98 class98) {
	if (((Class103_Sub1) class103_sub1).aClass268_9150 != null) {
	    method3162(class103_sub1);
	    float f = (((Class103_Sub1) class103_sub1).aClass268_9150
		       .aFloatArray4353[2]);
	    float f_137_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[6]);
	    float f_138_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[10]);
	    float f_139_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[14]);
	    try {
		int i = 0;
		int i_140_ = 2147483647;
		int i_141_ = 0;
		Class247_Sub1 class247_sub1
		    = class98.aClass441_1353.aClass247_Sub1_6157;
		for (Class247_Sub1 class247_sub1_142_
			 = class247_sub1.aClass247_Sub1_10037;
		     class247_sub1_142_ != class247_sub1;
		     class247_sub1_142_
			 = class247_sub1_142_.aClass247_Sub1_10037) {
		    Class247_Sub1_Sub1 class247_sub1_sub1
			= (Class247_Sub1_Sub1) class247_sub1_142_;
		    int i_143_
			= (int) (f * (float) (class247_sub1_sub1.anInt11064
					      >> 12)
				 + (f_137_
				    * (float) (class247_sub1_sub1.anInt11061
					       >> 12))
				 + (f_138_
				    * (float) (class247_sub1_sub1.anInt11060
					       >> 12))
				 + f_139_);
		    if (i_143_ > i_141_)
			i_141_ = i_143_;
		    if (i_143_ < i_140_)
			i_140_ = i_143_;
		    ((Class141) this).anIntArray1642[i++] = i_143_;
		}
		int i_144_ = i_141_ - i_140_;
		int i_145_;
		if (i_144_ + 2 > 1600) {
		    i_145_ = (1 + Class436.method7795(i_144_, (byte) -106)
			      - ((Class141) this).anInt1640);
		    i_144_ = (i_144_ >> i_145_) + 2;
		} else {
		    i_145_ = 0;
		    i_144_ += 2;
		}
		Class247_Sub1 class247_sub1_146_
		    = class247_sub1.aClass247_Sub1_10037;
		i = 0;
		int i_147_ = -2;
		boolean bool = true;
		boolean bool_148_ = true;
		while (class247_sub1_146_ != class247_sub1) {
		    ((Class141) this).anInt1641 = 0;
		    for (int i_149_ = 0; i_149_ < i_144_; i_149_++)
			((Class141) this).anIntArray1643[i_149_] = 0;
		    for (int i_150_ = 0; i_150_ < 64; i_150_++)
			((Class141) this).anIntArray1639[i_150_] = 0;
		    for (/**/; class247_sub1_146_ != class247_sub1;
			 class247_sub1_146_
			     = class247_sub1_146_.aClass247_Sub1_10037) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (Class247_Sub1_Sub1) class247_sub1_146_;
			if (bool_148_) {
			    i_147_ = class247_sub1_sub1.anInt11062;
			    bool = class247_sub1_sub1.aBool11067;
			    bool_148_ = false;
			}
			if (i > 0
			    && (i_147_ != class247_sub1_sub1.anInt11062
				|| bool != class247_sub1_sub1.aBool11067)) {
			    bool_148_ = true;
			    break;
			}
			int i_151_
			    = (((Class141) this).anIntArray1642[i++] - i_140_
			       >> i_145_);
			if (i_151_ < 1600) {
			    if (((Class141) this).anIntArray1643[i_151_] < 64)
				((Class141) this)
				    .aClass247_Sub1_Sub1ArrayArray1631[i_151_]
				    [((Class141) this).anIntArray1643
					 [i_151_]++]
				    = class247_sub1_sub1;
			    else {
				if (((Class141) this).anIntArray1643[i_151_]
				    == 64) {
				    if (((Class141) this).anInt1641 == 64)
					continue;
				    ((Class141) this).anIntArray1643[i_151_]
					+= 1 + ((Class141) this).anInt1641++;
				}
				((Class141) this)
				    .aClass247_Sub1_Sub1ArrayArray1646
				    [(((Class141) this).anIntArray1643[i_151_]
				      - 64 - 1)]
				    [((Class141) this).anIntArray1639
					 [(((Class141) this).anIntArray1643
					   [i_151_]) - 64 - 1]++]
				    = class247_sub1_sub1;
			    }
			}
		    }
		    if (i_147_ >= 0)
			class103_sub1.method15173(i_147_);
		    else
			class103_sub1.method15173(-1);
		    if (bool && (((Class103_Sub1) class103_sub1).aFloat9162
				 != aFloat1648))
			class103_sub1.method2311(aFloat1648);
		    else if (((Class103_Sub1) class103_sub1).aFloat9162
			     != 1.0F)
			class103_sub1.method2311(1.0F);
		    method3154(class103_sub1, i_144_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method3159(class103_sub1);
	}
    }
    
    void method3162(Class103_Sub1 class103_sub1) {
	aFloat1648 = ((Class103_Sub1) class103_sub1).aFloat9162;
	class103_sub1.method15259();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	class103_sub1.method15190(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    void method3163(Class103_Sub1 class103_sub1, int i) {
	OpenGL.glGetFloatv(2982, ((Class141) this).aFloatArray1638, 0);
	float f = ((Class141) this).aFloatArray1638[0];
	float f_152_ = ((Class141) this).aFloatArray1638[4];
	float f_153_ = ((Class141) this).aFloatArray1638[8];
	float f_154_ = ((Class141) this).aFloatArray1638[1];
	float f_155_ = ((Class141) this).aFloatArray1638[5];
	float f_156_ = ((Class141) this).aFloatArray1638[9];
	float f_157_ = f + f_154_;
	float f_158_ = f_152_ + f_155_;
	float f_159_ = f_153_ + f_156_;
	float f_160_ = f - f_154_;
	float f_161_ = f_152_ - f_155_;
	float f_162_ = f_153_ - f_156_;
	float f_163_ = f_154_ - f;
	float f_164_ = f_155_ - f_152_;
	float f_165_ = f_156_ - f_153_;
	float[] fs = new float[3];
	float[] fs_166_ = new float[3];
	((Class103_Sub1) class103_sub1).aClass268_9136
	    .method5200(((Class103_Sub1) class103_sub1).aClass268_9121);
	((Class141) this).aClass241_Sub3_Sub2_1632.pointer = 0;
	if (((Class103_Sub1) class103_sub1).aBool9144) {
	    for (int i_167_ = i - 1; i_167_ >= 0; i_167_--) {
		int i_168_ = (((Class141) this).anIntArray1643[i_167_] > 64
			      ? 64 : ((Class141) this).anIntArray1643[i_167_]);
		if (i_168_ > 0) {
		    for (int i_169_ = i_168_ - 1; i_169_ >= 0; i_169_--) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (((Class141) this)
			       .aClass247_Sub1_Sub1ArrayArray1631[i_167_]
			       [i_169_]);
			int i_170_ = class247_sub1_sub1.anInt11065;
			byte i_171_ = (byte) (i_170_ >> 16);
			byte i_172_ = (byte) (i_170_ >> 8);
			byte i_173_ = (byte) i_170_;
			byte i_174_ = (byte) (i_170_ >>> 24);
			float f_175_
			    = (float) (class247_sub1_sub1.anInt11064 >> 12);
			float f_176_
			    = (float) (class247_sub1_sub1.anInt11061 >> 12);
			float f_177_
			    = (float) (class247_sub1_sub1.anInt11060 >> 12);
			int i_178_ = class247_sub1_sub1.anInt11058 >> 12;
			if (class247_sub1_sub1.aShort11066 != 0) {
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5232
				(class247_sub1_sub1.aShort11066, i_178_,
				 i_178_, 0.0F, 0.0F, 0.0F);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5202
				(((Class103_Sub1) class103_sub1)
				 .aClass268_9136);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(1.0F, 0.0F, 0.0F, fs);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(0.0F, 1.0F, 0.0F, fs_166_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_175_ - fs[0] - fs_166_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_176_ - fs[1] - fs_166_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_177_ - fs[2] - fs_166_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_171_, 551316814);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_172_, 1013518561);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_173_, 1464805558);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_174_, 1478154655);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_175_ - fs[0] + fs_166_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_176_ - fs[1] + fs_166_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_177_ - fs[2] + fs_166_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_171_, -864485076);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_172_, 799272438);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_173_, -495986233);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_174_, -178313800);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_175_ + fs[0] + fs_166_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_176_ + fs[1] + fs_166_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_177_ + fs[2] + fs_166_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_171_, -1534115999);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_172_, -538354254);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_173_, -1714136913);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_174_, -1141622199);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_175_ + fs[0] - fs_166_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_176_ + fs[1] - fs_166_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_177_ + fs[2] - fs_166_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_171_, -677471066);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_172_, 689206736);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_173_, -145292663);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_174_, -641159637);
			} else {
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060
				(f_175_ + f_157_ * (float) -i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060
				(f_176_ + f_158_ * (float) -i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060
				(f_177_ + f_159_ * (float) -i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_171_, 1116089755);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_172_, -37030935);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_173_, 1293413405);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_174_, -1902915709);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_175_ + f_163_ * (float) i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_176_ + f_164_ * (float) i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_177_ + f_165_ * (float) i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_171_, -1480616407);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_172_, -402996001);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_173_, 388911658);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_174_, 551644581);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_175_ + f_157_ * (float) i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_176_ + f_158_ * (float) i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_177_ + f_159_ * (float) i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_171_, -1172109617);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_172_, -637902094);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_173_, 967275164);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_174_, -1717662513);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_175_ + f_160_ * (float) i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_176_ + f_161_ * (float) i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17060(f_177_ + f_162_ * (float) i_178_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_171_, -609458330);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_172_, -1457831187);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_173_, -1976801163);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_174_, -749843743);
			}
		    }
		    if (((Class141) this).anIntArray1643[i_167_] > 64) {
			int i_179_ = (((Class141) this).anIntArray1643[i_167_]
				      - 64 - 1);
			for (int i_180_ = (((Class141) this).anIntArray1639
					   [i_179_]) - 1;
			     i_180_ >= 0; i_180_--) {
			    Class247_Sub1_Sub1 class247_sub1_sub1
				= (((Class141) this)
				   .aClass247_Sub1_Sub1ArrayArray1646[i_179_]
				   [i_180_]);
			    int i_181_ = class247_sub1_sub1.anInt11065;
			    byte i_182_ = (byte) (i_181_ >> 16);
			    byte i_183_ = (byte) (i_181_ >> 8);
			    byte i_184_ = (byte) i_181_;
			    byte i_185_ = (byte) (i_181_ >>> 24);
			    float f_186_
				= (float) (class247_sub1_sub1.anInt11064
					   >> 12);
			    float f_187_
				= (float) (class247_sub1_sub1.anInt11061
					   >> 12);
			    float f_188_
				= (float) (class247_sub1_sub1.anInt11060
					   >> 12);
			    int i_189_ = class247_sub1_sub1.anInt11058 >> 12;
			    if (class247_sub1_sub1.aShort11066 != 0) {
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5232
				    (class247_sub1_sub1.aShort11066, i_189_,
				     i_189_, 0.0F, 0.0F, 0.0F);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5202
				    (((Class103_Sub1) class103_sub1)
				     .aClass268_9136);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(1.0F, 0.0F, 0.0F, fs);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(0.0F, 1.0F, 0.0F, fs_166_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_186_ - fs[0] - fs_166_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_187_ - fs[1] - fs_166_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_188_ - fs[2] - fs_166_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_182_, 1209802442);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_183_, 69520522);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_184_, 146582821);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_185_, 1322485962);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_186_ - fs[0] + fs_166_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_187_ - fs[1] + fs_166_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_188_ - fs[2] + fs_166_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_182_, 1148386004);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_183_, -1982884811);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_184_, -1283718525);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_185_, -957192555);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_186_ + fs[0] + fs_166_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_187_ + fs[1] + fs_166_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_188_ + fs[2] + fs_166_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_182_, -1848179700);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_183_, -754301238);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_184_, -869493655);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_185_, -868386441);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_186_ + fs[0] - fs_166_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_187_ + fs[1] - fs_166_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(f_188_ + fs[2] - fs_166_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_182_, 604217839);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_183_, 530952817);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_184_, -1612927248);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_185_, -1841337041);
			    } else {
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_186_ + f_157_ * (float) -i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_187_ + f_158_ * (float) -i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_188_ + f_159_ * (float) -i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_182_, 672417202);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_183_, -657820265);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_184_, -1607731734);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_185_, 1179166626);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_186_ + f_163_ * (float) i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_187_ + f_164_ * (float) i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_188_ + f_165_ * (float) i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_182_, 761396272);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_183_, -64165382);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_184_, -1209396901);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_185_, -1573864340);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_186_ + f_157_ * (float) i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_187_ + f_158_ * (float) i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_188_ + f_159_ * (float) i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_182_, -1344197402);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_183_, 1427382645);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_184_, 25428822);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_185_, -1480136258);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_186_ + f_160_ * (float) i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_187_ + f_161_ * (float) i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17060
				    (f_188_ + f_162_ * (float) i_189_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_182_, -491852383);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_183_, -314333782);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_184_, -1134921395);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_185_, 1385002375);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int i_190_ = i - 1; i_190_ >= 0; i_190_--) {
		int i_191_ = (((Class141) this).anIntArray1643[i_190_] > 64
			      ? 64 : ((Class141) this).anIntArray1643[i_190_]);
		if (i_191_ > 0) {
		    for (int i_192_ = i_191_ - 1; i_192_ >= 0; i_192_--) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (((Class141) this)
			       .aClass247_Sub1_Sub1ArrayArray1631[i_190_]
			       [i_192_]);
			int i_193_ = class247_sub1_sub1.anInt11065;
			byte i_194_ = (byte) (i_193_ >> 16);
			byte i_195_ = (byte) (i_193_ >> 8);
			byte i_196_ = (byte) i_193_;
			byte i_197_ = (byte) (i_193_ >>> 24);
			float f_198_
			    = (float) (class247_sub1_sub1.anInt11064 >> 12);
			float f_199_
			    = (float) (class247_sub1_sub1.anInt11061 >> 12);
			float f_200_
			    = (float) (class247_sub1_sub1.anInt11060 >> 12);
			int i_201_ = class247_sub1_sub1.anInt11058 >> 12;
			if (class247_sub1_sub1.aShort11066 != 0) {
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5232
				(class247_sub1_sub1.aShort11066, i_201_,
				 i_201_, 0.0F, 0.0F, 0.0F);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5202
				(((Class103_Sub1) class103_sub1)
				 .aClass268_9136);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(1.0F, 0.0F, 0.0F, fs);
			    ((Class103_Sub1) class103_sub1).aClass268_9161
				.method5208(0.0F, 1.0F, 0.0F, fs_166_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_198_ - fs[0] - fs_166_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_199_ - fs[1] - fs_166_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_200_ - fs[2] - fs_166_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_194_, -1654466117);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_195_, -1503619821);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_196_, 1761257649);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_197_, 140297112);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_198_ - fs[0] + fs_166_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_199_ - fs[1] + fs_166_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_200_ - fs[2] + fs_166_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_194_, -1519361281);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_195_, 1396605767);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_196_, 886838034);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_197_, 678829499);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_198_ + fs[0] + fs_166_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_199_ + fs[1] + fs_166_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_200_ + fs[2] + fs_166_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_194_, -1837440960);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_195_, -1316151365);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_196_, -2056529236);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_197_, 557223558);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_198_ + fs[0] - fs_166_[0]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_199_ + fs[1] - fs_166_[1]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_200_ + fs[2] - fs_166_[2]);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_194_, -1216858366);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_195_, -11545858);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_196_, 1299998197);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_197_, 402366147);
			} else {
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064
				(f_198_ + f_157_ * (float) -i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064
				(f_199_ + f_158_ * (float) -i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064
				(f_200_ + f_159_ * (float) -i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_194_, 1136074018);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_195_, -308615321);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_196_, -1088744113);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_197_, 805651218);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_198_ + f_163_ * (float) i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_199_ + f_164_ * (float) i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_200_ + f_165_ * (float) i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_194_, -1803821239);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_195_, -818321260);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_196_, -313156052);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_197_, 39497066);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_198_ + f_157_ * (float) i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_199_ + f_158_ * (float) i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_200_ + f_159_ * (float) i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_194_, -1165610244);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_195_, 1098474867);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_196_, -969855867);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_197_, -1498169102);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(1.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(0.0F);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_198_ + f_160_ * (float) i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_199_ + f_161_ * (float) i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.method17064(f_200_ + f_162_ * (float) i_201_);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_194_, 1568185797);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_195_, -517546912);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_196_, 1616454500);
			    ((Class141) this).aClass241_Sub3_Sub2_1632
				.writeByte(i_197_, 1106021082);
			}
		    }
		    if (((Class141) this).anIntArray1643[i_190_] > 64) {
			int i_202_ = (((Class141) this).anIntArray1643[i_190_]
				      - 64 - 1);
			for (int i_203_ = (((Class141) this).anIntArray1639
					   [i_202_]) - 1;
			     i_203_ >= 0; i_203_--) {
			    Class247_Sub1_Sub1 class247_sub1_sub1
				= (((Class141) this)
				   .aClass247_Sub1_Sub1ArrayArray1646[i_202_]
				   [i_203_]);
			    int i_204_ = class247_sub1_sub1.anInt11065;
			    byte i_205_ = (byte) (i_204_ >> 16);
			    byte i_206_ = (byte) (i_204_ >> 8);
			    byte i_207_ = (byte) i_204_;
			    byte i_208_ = (byte) (i_204_ >>> 24);
			    float f_209_
				= (float) (class247_sub1_sub1.anInt11064
					   >> 12);
			    float f_210_
				= (float) (class247_sub1_sub1.anInt11061
					   >> 12);
			    float f_211_
				= (float) (class247_sub1_sub1.anInt11060
					   >> 12);
			    int i_212_ = class247_sub1_sub1.anInt11058 >> 12;
			    if (class247_sub1_sub1.aShort11066 != 0) {
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5232
				    (class247_sub1_sub1.aShort11066, i_212_,
				     i_212_, 0.0F, 0.0F, 0.0F);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161.method5202
				    (((Class103_Sub1) class103_sub1)
				     .aClass268_9136);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(1.0F, 0.0F, 0.0F, fs);
				((Class103_Sub1) class103_sub1)
				    .aClass268_9161
				    .method5208(0.0F, 1.0F, 0.0F, fs_166_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_209_ - fs[0] - fs_166_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_210_ - fs[1] - fs_166_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_211_ - fs[2] - fs_166_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_205_, -355514773);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_206_, 1308022429);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_207_, 709774588);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_208_, 627745192);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_209_ - fs[0] + fs_166_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_210_ - fs[1] + fs_166_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_211_ - fs[2] + fs_166_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_205_, -1642333127);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_206_, -2129838365);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_207_, -84890203);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_208_, 1572551170);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_209_ + fs[0] + fs_166_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_210_ + fs[1] + fs_166_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_211_ + fs[2] + fs_166_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_205_, -893666308);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_206_, 1218003316);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_207_, -791596889);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_208_, 161908359);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_209_ + fs[0] - fs_166_[0]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_210_ + fs[1] - fs_166_[1]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(f_211_ + fs[2] - fs_166_[2]);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_205_, -745700935);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_206_, 242260732);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_207_, -1843509674);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_208_, -85504626);
			    } else {
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_209_ + f_157_ * (float) -i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_210_ + f_158_ * (float) -i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_211_ + f_159_ * (float) -i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_205_, -1582012877);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_206_, -1448737535);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_207_, -1617906013);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_208_, -443422866);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_209_ + f_163_ * (float) i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_210_ + f_164_ * (float) i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_211_ + f_165_ * (float) i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_205_, 1699240246);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_206_, 1684229135);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_207_, 251299288);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_208_, 304120225);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_209_ + f_157_ * (float) i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_210_ + f_158_ * (float) i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_211_ + f_159_ * (float) i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_205_, -1828989361);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_206_, 805725001);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_207_, -640447149);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_208_, 660281247);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(1.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064(0.0F);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_209_ + f_160_ * (float) i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_210_ + f_161_ * (float) i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .method17064
				    (f_211_ + f_162_ * (float) i_212_);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_205_, 1672803952);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_206_, 197211581);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_207_, 580813806);
				((Class141) this).aClass241_Sub3_Sub2_1632
				    .writeByte(i_208_, -303253607);
			    }
			}
		    }
		}
	    }
	}
	if (((Class141) this).aClass241_Sub3_Sub2_1632.pointer * 421967667
	    != 0) {
	    ((Class141) this).anInterface8_1633.method51
		(24, ((Class141) this).aClass241_Sub3_Sub2_1632.payload,
		 (((Class141) this).aClass241_Sub3_Sub2_1632.pointer
		  * 421967667));
	    class103_sub1.method15168(((Class141) this).aClass151_1637, null,
				      ((Class141) this).aClass151_1635,
				      ((Class141) this).aClass151_1636);
	    class103_sub1.method15169(7, 0, (((Class141) this)
					     .aClass241_Sub3_Sub2_1632
					     .pointer) * 421967667 / 24);
	}
    }
    
    void method3164(Class103_Sub1 class103_sub1, Class98 class98) {
	if (((Class103_Sub1) class103_sub1).aClass268_9150 != null) {
	    method3162(class103_sub1);
	    float f = (((Class103_Sub1) class103_sub1).aClass268_9150
		       .aFloatArray4353[2]);
	    float f_213_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[6]);
	    float f_214_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[10]);
	    float f_215_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[14]);
	    try {
		int i = 0;
		int i_216_ = 2147483647;
		int i_217_ = 0;
		Class247_Sub1 class247_sub1
		    = class98.aClass441_1353.aClass247_Sub1_6157;
		for (Class247_Sub1 class247_sub1_218_
			 = class247_sub1.aClass247_Sub1_10037;
		     class247_sub1_218_ != class247_sub1;
		     class247_sub1_218_
			 = class247_sub1_218_.aClass247_Sub1_10037) {
		    Class247_Sub1_Sub1 class247_sub1_sub1
			= (Class247_Sub1_Sub1) class247_sub1_218_;
		    int i_219_
			= (int) (f * (float) (class247_sub1_sub1.anInt11064
					      >> 12)
				 + (f_213_
				    * (float) (class247_sub1_sub1.anInt11061
					       >> 12))
				 + (f_214_
				    * (float) (class247_sub1_sub1.anInt11060
					       >> 12))
				 + f_215_);
		    if (i_219_ > i_217_)
			i_217_ = i_219_;
		    if (i_219_ < i_216_)
			i_216_ = i_219_;
		    ((Class141) this).anIntArray1642[i++] = i_219_;
		}
		int i_220_ = i_217_ - i_216_;
		int i_221_;
		if (i_220_ + 2 > 1600) {
		    i_221_ = (1 + Class436.method7795(i_220_, (byte) -29)
			      - ((Class141) this).anInt1640);
		    i_220_ = (i_220_ >> i_221_) + 2;
		} else {
		    i_221_ = 0;
		    i_220_ += 2;
		}
		Class247_Sub1 class247_sub1_222_
		    = class247_sub1.aClass247_Sub1_10037;
		i = 0;
		int i_223_ = -2;
		boolean bool = true;
		boolean bool_224_ = true;
		while (class247_sub1_222_ != class247_sub1) {
		    ((Class141) this).anInt1641 = 0;
		    for (int i_225_ = 0; i_225_ < i_220_; i_225_++)
			((Class141) this).anIntArray1643[i_225_] = 0;
		    for (int i_226_ = 0; i_226_ < 64; i_226_++)
			((Class141) this).anIntArray1639[i_226_] = 0;
		    for (/**/; class247_sub1_222_ != class247_sub1;
			 class247_sub1_222_
			     = class247_sub1_222_.aClass247_Sub1_10037) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (Class247_Sub1_Sub1) class247_sub1_222_;
			if (bool_224_) {
			    i_223_ = class247_sub1_sub1.anInt11062;
			    bool = class247_sub1_sub1.aBool11067;
			    bool_224_ = false;
			}
			if (i > 0
			    && (i_223_ != class247_sub1_sub1.anInt11062
				|| bool != class247_sub1_sub1.aBool11067)) {
			    bool_224_ = true;
			    break;
			}
			int i_227_
			    = (((Class141) this).anIntArray1642[i++] - i_216_
			       >> i_221_);
			if (i_227_ < 1600) {
			    if (((Class141) this).anIntArray1643[i_227_] < 64)
				((Class141) this)
				    .aClass247_Sub1_Sub1ArrayArray1631[i_227_]
				    [((Class141) this).anIntArray1643
					 [i_227_]++]
				    = class247_sub1_sub1;
			    else {
				if (((Class141) this).anIntArray1643[i_227_]
				    == 64) {
				    if (((Class141) this).anInt1641 == 64)
					continue;
				    ((Class141) this).anIntArray1643[i_227_]
					+= 1 + ((Class141) this).anInt1641++;
				}
				((Class141) this)
				    .aClass247_Sub1_Sub1ArrayArray1646
				    [(((Class141) this).anIntArray1643[i_227_]
				      - 64 - 1)]
				    [((Class141) this).anIntArray1639
					 [(((Class141) this).anIntArray1643
					   [i_227_]) - 64 - 1]++]
				    = class247_sub1_sub1;
			    }
			}
		    }
		    if (i_223_ >= 0)
			class103_sub1.method15173(i_223_);
		    else
			class103_sub1.method15173(-1);
		    if (bool && (((Class103_Sub1) class103_sub1).aFloat9162
				 != aFloat1648))
			class103_sub1.method2311(aFloat1648);
		    else if (((Class103_Sub1) class103_sub1).aFloat9162
			     != 1.0F)
			class103_sub1.method2311(1.0F);
		    method3154(class103_sub1, i_220_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method3159(class103_sub1);
	}
    }
    
    void method3165(Class103_Sub1 class103_sub1) {
	aFloat1648 = ((Class103_Sub1) class103_sub1).aFloat9162;
	class103_sub1.method15259();
	OpenGL.glDisable(16384);
	OpenGL.glDisable(16385);
	class103_sub1.method15190(false);
	OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
    
    void method3166(Class103_Sub1 class103_sub1, Class98 class98) {
	if (((Class103_Sub1) class103_sub1).aClass268_9150 != null) {
	    method3162(class103_sub1);
	    float f = (((Class103_Sub1) class103_sub1).aClass268_9150
		       .aFloatArray4353[2]);
	    float f_228_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[6]);
	    float f_229_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[10]);
	    float f_230_ = (((Class103_Sub1) class103_sub1).aClass268_9150
			    .aFloatArray4353[14]);
	    try {
		int i = 0;
		int i_231_ = 2147483647;
		int i_232_ = 0;
		Class247_Sub1 class247_sub1
		    = class98.aClass441_1353.aClass247_Sub1_6157;
		for (Class247_Sub1 class247_sub1_233_
			 = class247_sub1.aClass247_Sub1_10037;
		     class247_sub1_233_ != class247_sub1;
		     class247_sub1_233_
			 = class247_sub1_233_.aClass247_Sub1_10037) {
		    Class247_Sub1_Sub1 class247_sub1_sub1
			= (Class247_Sub1_Sub1) class247_sub1_233_;
		    int i_234_
			= (int) (f * (float) (class247_sub1_sub1.anInt11064
					      >> 12)
				 + (f_228_
				    * (float) (class247_sub1_sub1.anInt11061
					       >> 12))
				 + (f_229_
				    * (float) (class247_sub1_sub1.anInt11060
					       >> 12))
				 + f_230_);
		    if (i_234_ > i_232_)
			i_232_ = i_234_;
		    if (i_234_ < i_231_)
			i_231_ = i_234_;
		    ((Class141) this).anIntArray1642[i++] = i_234_;
		}
		int i_235_ = i_232_ - i_231_;
		int i_236_;
		if (i_235_ + 2 > 1600) {
		    i_236_ = (1 + Class436.method7795(i_235_, (byte) -8)
			      - ((Class141) this).anInt1640);
		    i_235_ = (i_235_ >> i_236_) + 2;
		} else {
		    i_236_ = 0;
		    i_235_ += 2;
		}
		Class247_Sub1 class247_sub1_237_
		    = class247_sub1.aClass247_Sub1_10037;
		i = 0;
		int i_238_ = -2;
		boolean bool = true;
		boolean bool_239_ = true;
		while (class247_sub1_237_ != class247_sub1) {
		    ((Class141) this).anInt1641 = 0;
		    for (int i_240_ = 0; i_240_ < i_235_; i_240_++)
			((Class141) this).anIntArray1643[i_240_] = 0;
		    for (int i_241_ = 0; i_241_ < 64; i_241_++)
			((Class141) this).anIntArray1639[i_241_] = 0;
		    for (/**/; class247_sub1_237_ != class247_sub1;
			 class247_sub1_237_
			     = class247_sub1_237_.aClass247_Sub1_10037) {
			Class247_Sub1_Sub1 class247_sub1_sub1
			    = (Class247_Sub1_Sub1) class247_sub1_237_;
			if (bool_239_) {
			    i_238_ = class247_sub1_sub1.anInt11062;
			    bool = class247_sub1_sub1.aBool11067;
			    bool_239_ = false;
			}
			if (i > 0
			    && (i_238_ != class247_sub1_sub1.anInt11062
				|| bool != class247_sub1_sub1.aBool11067)) {
			    bool_239_ = true;
			    break;
			}
			int i_242_
			    = (((Class141) this).anIntArray1642[i++] - i_231_
			       >> i_236_);
			if (i_242_ < 1600) {
			    if (((Class141) this).anIntArray1643[i_242_] < 64)
				((Class141) this)
				    .aClass247_Sub1_Sub1ArrayArray1631[i_242_]
				    [((Class141) this).anIntArray1643
					 [i_242_]++]
				    = class247_sub1_sub1;
			    else {
				if (((Class141) this).anIntArray1643[i_242_]
				    == 64) {
				    if (((Class141) this).anInt1641 == 64)
					continue;
				    ((Class141) this).anIntArray1643[i_242_]
					+= 1 + ((Class141) this).anInt1641++;
				}
				((Class141) this)
				    .aClass247_Sub1_Sub1ArrayArray1646
				    [(((Class141) this).anIntArray1643[i_242_]
				      - 64 - 1)]
				    [((Class141) this).anIntArray1639
					 [(((Class141) this).anIntArray1643
					   [i_242_]) - 64 - 1]++]
				    = class247_sub1_sub1;
			    }
			}
		    }
		    if (i_238_ >= 0)
			class103_sub1.method15173(i_238_);
		    else
			class103_sub1.method15173(-1);
		    if (bool && (((Class103_Sub1) class103_sub1).aFloat9162
				 != aFloat1648))
			class103_sub1.method2311(aFloat1648);
		    else if (((Class103_Sub1) class103_sub1).aFloat9162
			     != 1.0F)
			class103_sub1.method2311(1.0F);
		    method3154(class103_sub1, i_235_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method3159(class103_sub1);
	}
    }
}
