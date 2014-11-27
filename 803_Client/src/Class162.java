/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Class162 implements Interface6
{
    JS5 aClass210_2039;
    JS5 aClass210_2040;
    
    float[] method3504(int i, byte i_0_) {
	int[] is = method3506(i, 1048280569);
	if (is == null)
	    return null;
	int[] is_1_ = null;
	if (((Class162) this).aClass210_2040.method4218(i, (byte) -56)) {
	    byte[] is_2_
		= ((Class162) this).aClass210_2040.method4194(i, 214948864);
	    if (null != is_2_) {
		try {
		    is_1_ = method3507(is_2_, 179065030);
		    for (int i_3_ = 0; i_3_ < is_1_.length; i_3_++)
			is_1_[i_3_] = is_1_[i_3_] & 0xfff;
		} catch (IOException ioexception) {
		    /* empty */
		}
	    }
	}
	if (is_1_ == null)
	    is_1_ = new int[is.length];
	float[] fs = new float[4 * is.length];
	int i_4_ = 0;
	for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
	    int i_6_ = is[i_5_];
	    int i_7_ = i_6_ >>> 24;
	    int i_8_ = (i_6_ & 0xff0000) >> 16;
	    int i_9_ = (i_6_ & 0xff00) >> 8;
	    int i_10_ = i_6_ & 0xff;
	    float f = 31.0F * (float) is_1_[i_5_] / 4096.0F + 1.0F;
	    fs[i_4_++] = (float) i_8_ * f / 255.0F;
	    fs[i_4_++] = (float) i_9_ * f / 255.0F;
	    fs[i_4_++] = f * (float) i_10_ / 255.0F;
	    fs[i_4_++] = (float) i_7_ / 255.0F;
	}
	return fs;
    }
    
    public boolean method31(int i, Class537 class537, float f, int i_11_,
			    int i_12_, boolean bool, int i_13_) {
	boolean bool_14_ = true;
	if (((Class162) this).aClass210_2040.method4218(i, (byte) -31))
	    bool_14_
		= ((Class162) this).aClass210_2040.method4250(i, 266960129);
	bool_14_ &= ((Class162) this).aClass210_2039.method4250(i, 1814377446);
	return bool_14_;
    }
    
    int[] method3505(int i, byte i_15_) {
	int[] is = method3506(i, 1515752841);
	if (is == null)
	    return null;
	for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
	    if (0 != (is[i_16_] & 0xffffff))
		is[i_16_] = is[i_16_] | ~0xffffff;
	    else
		is[i_16_] = is[i_16_] & 0xffffff;
	}
	return is;
    }
    
    int[] method3506(int i, int i_17_) {
	byte[] is
	    = ((Class162) this).aClass210_2039.method4194(i, -1815957995);
	if (null == is)
	    return null;
	int[] is_18_;
	try {
	    int[] is_19_ = method3507(is, 1421947893);
	    is_18_ = is_19_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is_18_;
    }
    
    public boolean method36(int i, Class537 class537, float f, int i_20_,
			    int i_21_, boolean bool) {
	boolean bool_22_ = true;
	if (((Class162) this).aClass210_2040.method4218(i, (byte) -107))
	    bool_22_
		= ((Class162) this).aClass210_2040.method4250(i, -598090841);
	bool_22_ &= ((Class162) this).aClass210_2039.method4250(i, 1977695373);
	return bool_22_;
    }
    
    public void method34(int i) {
	/* empty */
    }
    
    public void method40() {
	/* empty */
    }
    
    int[] method3507(byte[] is, int i) throws IOException {
	BufferedImage bufferedimage
	    = ImageIO.read(new ByteArrayInputStream(is));
	return Class530.method11845(bufferedimage, (short) 255);
    }
    
    int[] method3508(byte[] is) throws IOException {
	BufferedImage bufferedimage
	    = ImageIO.read(new ByteArrayInputStream(is));
	return Class530.method11845(bufferedimage, (short) 255);
    }
    
    public float[] method33(int i, float f, int i_23_, int i_24_, boolean bool,
			    int i_25_) {
	return method3504(i, (byte) -103);
    }
    
    public boolean method35(int i, Class537 class537, float f, int i_26_,
			    int i_27_, boolean bool) {
	boolean bool_28_ = true;
	if (((Class162) this).aClass210_2040.method4218(i, (byte) -127))
	    bool_28_
		= ((Class162) this).aClass210_2040.method4250(i, 217740067);
	bool_28_ &= ((Class162) this).aClass210_2039.method4250(i, 1150454678);
	return bool_28_;
    }
    
    public boolean method43(int i, Class537 class537, float f, int i_29_,
			    int i_30_, boolean bool) {
	boolean bool_31_ = true;
	if (((Class162) this).aClass210_2040.method4218(i, (byte) -35))
	    bool_31_
		= ((Class162) this).aClass210_2040.method4250(i, 503684985);
	bool_31_ &= ((Class162) this).aClass210_2039.method4250(i, 1068942275);
	return bool_31_;
    }
    
    public int[] method37(int i, float f, int i_32_, int i_33_, boolean bool,
			  int i_34_) {
	return method3505(i, (byte) 29);
    }
    
    public Class162(JS5 class210, JS5 class210_35_) {
	((Class162) this).aClass210_2039 = class210;
	((Class162) this).aClass210_2040 = class210_35_;
    }
    
    int[] method3509(int i) {
	int[] is = method3506(i, 2095451727);
	if (is == null)
	    return null;
	for (int i_36_ = 0; i_36_ < is.length; i_36_++) {
	    if (0 != (is[i_36_] & 0xffffff))
		is[i_36_] = is[i_36_] | ~0xffffff;
	    else
		is[i_36_] = is[i_36_] & 0xffffff;
	}
	return is;
    }
    
    public float[] method44(int i, float f, int i_37_, int i_38_,
			    boolean bool) {
	return method3504(i, (byte) -23);
    }
    
    public int[] method30(int i, float f, int i_39_, int i_40_, boolean bool,
			  int i_41_) {
	return method3506(i, -2006240430);
    }
    
    int[] method3510(int i) {
	byte[] is = ((Class162) this).aClass210_2039.method4194(i, 445338250);
	if (null == is)
	    return null;
	int[] is_42_;
	try {
	    int[] is_43_ = method3507(is, 565486491);
	    is_42_ = is_43_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is_42_;
    }
    
    float[] method3511(int i) {
	int[] is = method3506(i, -1205145745);
	if (is == null)
	    return null;
	int[] is_44_ = null;
	if (((Class162) this).aClass210_2040.method4218(i, (byte) -35)) {
	    byte[] is_45_
		= ((Class162) this).aClass210_2040.method4194(i, -1919449290);
	    if (null != is_45_) {
		try {
		    is_44_ = method3507(is_45_, 1348275825);
		    for (int i_46_ = 0; i_46_ < is_44_.length; i_46_++)
			is_44_[i_46_] = is_44_[i_46_] & 0xfff;
		} catch (IOException ioexception) {
		    /* empty */
		}
	    }
	}
	if (is_44_ == null)
	    is_44_ = new int[is.length];
	float[] fs = new float[4 * is.length];
	int i_47_ = 0;
	for (int i_48_ = 0; i_48_ < is.length; i_48_++) {
	    int i_49_ = is[i_48_];
	    int i_50_ = i_49_ >>> 24;
	    int i_51_ = (i_49_ & 0xff0000) >> 16;
	    int i_52_ = (i_49_ & 0xff00) >> 8;
	    int i_53_ = i_49_ & 0xff;
	    float f = 31.0F * (float) is_44_[i_48_] / 4096.0F + 1.0F;
	    fs[i_47_++] = (float) i_51_ * f / 255.0F;
	    fs[i_47_++] = (float) i_52_ * f / 255.0F;
	    fs[i_47_++] = f * (float) i_53_ / 255.0F;
	    fs[i_47_++] = (float) i_50_ / 255.0F;
	}
	return fs;
    }
    
    public void method39() {
	/* empty */
    }
    
    public boolean method38(int i, Class537 class537, float f, int i_54_,
			    int i_55_, boolean bool) {
	boolean bool_56_ = true;
	if (((Class162) this).aClass210_2040.method4218(i, (byte) -83))
	    bool_56_
		= ((Class162) this).aClass210_2040.method4250(i, -82513007);
	bool_56_ &= ((Class162) this).aClass210_2039.method4250(i, 937862889);
	return bool_56_;
    }
    
    public int[] method41(int i, float f, int i_57_, int i_58_, boolean bool) {
	return method3505(i, (byte) 29);
    }
    
    public int[] method42(int i, float f, int i_59_, int i_60_, boolean bool) {
	return method3506(i, -1056934177);
    }
    
    public float[] method32(int i, float f, int i_61_, int i_62_,
			    boolean bool) {
	return method3504(i, (byte) -115);
    }
    
    int[] method3512(int i) {
	int[] is = method3506(i, -1594467583);
	if (is == null)
	    return null;
	for (int i_63_ = 0; i_63_ < is.length; i_63_++) {
	    if (0 != (is[i_63_] & 0xffffff))
		is[i_63_] = is[i_63_] | ~0xffffff;
	    else
		is[i_63_] = is[i_63_] & 0xffffff;
	}
	return is;
    }
    
    int[] method3513(byte[] is) throws IOException {
	BufferedImage bufferedimage
	    = ImageIO.read(new ByteArrayInputStream(is));
	return Class530.method11845(bufferedimage, (short) 255);
    }
    
    int[] method3514(int i) {
	int[] is = method3506(i, 1675081100);
	if (is == null)
	    return null;
	for (int i_64_ = 0; i_64_ < is.length; i_64_++) {
	    if (0 != (is[i_64_] & 0xffffff))
		is[i_64_] = is[i_64_] | ~0xffffff;
	    else
		is[i_64_] = is[i_64_] & 0xffffff;
	}
	return is;
    }
    
    public static int[] method3515(BufferedImage bufferedimage) {
	if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
	    int[] is = null;
	    is = bufferedimage.getRaster().getPixels(0, 0,
						     bufferedimage.getWidth(),
						     bufferedimage.getHeight(),
						     is);
	    int[] is_65_
		= (new int
		   [bufferedimage.getWidth() * bufferedimage.getHeight()]);
	    if (bufferedimage.getType() == 10) {
		for (int i = 0; i < is_65_.length; i++)
		    is_65_[i]
			= is[i] + ((is[i] << 16) + (is[i] << 8)) + -16777216;
	    } else {
		for (int i = 0; i < is_65_.length; i++) {
		    int i_66_ = 2 * i;
		    is_65_[i] = ((is[i_66_ + 1] << 24) + is[i_66_]
				 + ((is[i_66_] << 8) + (is[i_66_] << 16)));
		}
	    }
	    return is_65_;
	}
	return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(),
				    bufferedimage.getHeight(), null, 0,
				    bufferedimage.getWidth());
    }
    
    static final void method3516(int i) {
	Class450.anInt6205 -= 351328599;
    }
    
    static final void method3517(ClientScriptData class454, byte i) {
	int i_67_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_67_, (byte) -75);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_67_ >> 16];
	Class249.setComponentFilled(class58, class35, class454, (byte) 19);
    }
    
    static final void method3518(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	class58.modelType = -553405919;
	class58.anInt879
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * 2003393911);
	if (-389932081 * class58.slot1 == -1 && !class35.aBool374)
	    Class120_Sub7.method16774(class58.componentHash * 445907013, 540612186);
    }
    
    static final void storeChannelMemberCount/*method3519*/(ClientScriptData scriptData, byte i) {
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
    			= 81956567 * scriptData.currentChannel.memberCount;
    }
    
    static final void method3520(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub29_8861
		  .method14377(-1901425199) ? 1 : 0;
    }
    
    public static Class241_Sub16 method3521(Class241_Sub16 class241_sub16,
					    int i) {
	synchronized (Class241_Sub16.aClass241_Sub16Array8981) {
	    if (0 == -1956990347 * Class241_Sub16.anInt8980) {
		Class241_Sub16 class241_sub16_68_
		    = new Class241_Sub16(class241_sub16);
		return class241_sub16_68_;
	    }
	    Class241_Sub16.aClass241_Sub16Array8981
		[(Class241_Sub16.anInt8980 -= -1131147811) * -1956990347]
		.method14989(class241_sub16, 902141971);
	    Class241_Sub16 class241_sub16_69_
		= (Class241_Sub16.aClass241_Sub16Array8981
		   [-1956990347 * Class241_Sub16.anInt8980]);
	    return class241_sub16_69_;
	}
    }
}
