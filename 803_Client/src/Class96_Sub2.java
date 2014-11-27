/* Class96_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub2 extends Class96
{
    int[] anIntArray9281;
    Class168[] aClass168Array9282;
    Class168[] aClass168Array9283;
    int[] anIntArray9284;
    int[] anIntArray9285;
    int[] anIntArray9286;
    Class103_Sub2 aClass103_Sub2_9287;
    
    void method2123(char c, int i, int i_0_, int i_1_, boolean bool) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub2) this).aClass103_Sub2_9287)
		.anIntArray9245)) {
	    i += ((Class96_Sub2) this).anIntArray9286[c];
	    i_0_ += ((Class96_Sub2) this).anIntArray9281[c];
	    if (bool)
		((Class96_Sub2) this).aClass168Array9283[c]
		    .method3666(i, i_0_, 1, i_1_, 1);
	    else
		((Class96_Sub2) this).aClass168Array9282[c]
		    .method3666(i, i_0_, 1, i_1_, 1);
	}
    }
    
    void method2154(char c, int i, int i_2_, int i_3_, boolean bool) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub2) this).aClass103_Sub2_9287)
		.anIntArray9245)) {
	    i += ((Class96_Sub2) this).anIntArray9286[c];
	    i_2_ += ((Class96_Sub2) this).anIntArray9281[c];
	    if (bool)
		((Class96_Sub2) this).aClass168Array9283[c]
		    .method3666(i, i_2_, 1, i_3_, 1);
	    else
		((Class96_Sub2) this).aClass168Array9282[c]
		    .method3666(i, i_2_, 1, i_3_, 1);
	}
    }
    
    void method2140(char c, int i, int i_4_, int i_5_, boolean bool,
		    Class135 class135, int i_6_, int i_7_) {
	/* empty */
    }
    
    Class96_Sub2(Class103_Sub2 class103_sub2, Class639 class639,
		 Class108_Sub1[] class108_sub1s, int[] is, int[] is_8_) {
	super(class103_sub2, class639);
	((Class96_Sub2) this).aClass103_Sub2_9287 = class103_sub2;
	((Class96_Sub2) this).aClass103_Sub2_9287 = class103_sub2;
	((Class96_Sub2) this).anIntArray9284 = is;
	((Class96_Sub2) this).anIntArray9285 = is_8_;
	((Class96_Sub2) this).aClass168Array9282
	    = new Class168[class108_sub1s.length];
	((Class96_Sub2) this).aClass168Array9283
	    = new Class168[class108_sub1s.length];
	((Class96_Sub2) this).anIntArray9281 = new int[class108_sub1s.length];
	((Class96_Sub2) this).anIntArray9286 = new int[class108_sub1s.length];
	for (int i = 0; i < class108_sub1s.length; i++) {
	    ((Class96_Sub2) this).aClass168Array9282[i]
		= ((Class96_Sub2) this).aClass103_Sub2_9287
		      .method2289(class108_sub1s[i], false);
	    int[] is_9_ = (int[]) class108_sub1s[i].method2707(false).clone();
	    for (int i_10_ = 0; i_10_ < is_9_.length; i_10_++) {
		int i_11_ = is_9_[i_10_];
		int i_12_
		    = (byte) ((i_11_ & 0xff) + (3 * (i_11_ >> 16 & 0xff)
						+ (i_11_ >> 8 & 0xff) * 4)
			      >> 3);
		is_9_[i_10_] = (is_9_[i_10_] & ~0xffffff | i_12_ << 16
				| i_12_ << 8 | i_12_);
	    }
	    ((Class96_Sub2) this).aClass168Array9283[i]
		= (((Class96_Sub2) this).aClass103_Sub2_9287.method2287
		   (is_9_, 0, ((Class96_Sub2) this).anIntArray9284[i],
		    ((Class96_Sub2) this).anIntArray9284[i],
		    ((Class96_Sub2) this).anIntArray9285[i], false));
	    ((Class96_Sub2) this).anIntArray9281[i]
		= class108_sub1s[i].method2697();
	    ((Class96_Sub2) this).anIntArray9286[i]
		= class108_sub1s[i].method2695();
	}
    }
    
    void method2129(char c, int i, int i_13_, int i_14_, boolean bool) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub2) this).aClass103_Sub2_9287)
		.anIntArray9245)) {
	    i += ((Class96_Sub2) this).anIntArray9286[c];
	    i_13_ += ((Class96_Sub2) this).anIntArray9281[c];
	    if (bool)
		((Class96_Sub2) this).aClass168Array9283[c]
		    .method3666(i, i_13_, 1, i_14_, 1);
	    else
		((Class96_Sub2) this).aClass168Array9282[c]
		    .method3666(i, i_13_, 1, i_14_, 1);
	}
    }
    
    void method2153(char c, int i, int i_15_, int i_16_, boolean bool) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub2) this).aClass103_Sub2_9287)
		.anIntArray9245)) {
	    i += ((Class96_Sub2) this).anIntArray9286[c];
	    i_15_ += ((Class96_Sub2) this).anIntArray9281[c];
	    if (bool)
		((Class96_Sub2) this).aClass168Array9283[c]
		    .method3666(i, i_15_, 1, i_16_, 1);
	    else
		((Class96_Sub2) this).aClass168Array9282[c]
		    .method3666(i, i_15_, 1, i_16_, 1);
	}
    }
    
    void method2131(char c, int i, int i_17_, int i_18_, boolean bool,
		    Class135 class135, int i_19_, int i_20_) {
	/* empty */
    }
    
    void method2126(char c, int i, int i_21_, int i_22_, boolean bool) {
	if (null
	    != (((Class103_Sub2) ((Class96_Sub2) this).aClass103_Sub2_9287)
		.anIntArray9245)) {
	    i += ((Class96_Sub2) this).anIntArray9286[c];
	    i_21_ += ((Class96_Sub2) this).anIntArray9281[c];
	    if (bool)
		((Class96_Sub2) this).aClass168Array9283[c]
		    .method3666(i, i_21_, 1, i_22_, 1);
	    else
		((Class96_Sub2) this).aClass168Array9282[c]
		    .method3666(i, i_21_, 1, i_22_, 1);
	}
    }
    
    void method2151(char c, int i, int i_23_, int i_24_, boolean bool,
		    Class135 class135, int i_25_, int i_26_) {
	/* empty */
    }
    
    public static void method15443(int i, byte i_27_) {
	if (i < 1)
	    Class573_Sub1.anInt8785 = Class573_Sub1.anInt8793 * 1227044387;
	else
	    Class573_Sub1.anInt8785 = i * -494320283;
    }
    
    static final void convertIntToString/*method15444*/(ClientScriptData scriptData, byte i) {
		int value
		    = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		scriptData.objectStack[(scriptData.objectStackPointer += -1650705371) * -290357331 - 1]
		    = Integer.toString(value);
    }
}
