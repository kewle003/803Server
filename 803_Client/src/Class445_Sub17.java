/* Class445_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class445_Sub17 extends Class445
{
    public static final int anInt8661 = 3;
    public static final int anInt8662 = 4;
    public static final int anInt8663 = 2;
    public static final int anInt8664 = 1;
    public static final int anInt8665 = 0;
    
    public Class445_Sub17(Class241_Sub9 class241_sub9) {
	super(class241_sub9);
    }
    
    public Class445_Sub17(int i, Class241_Sub9 class241_sub9) {
	super(i, class241_sub9);
    }
    
    public void method14253(byte i) {
	if (2034617147 * anInt6176 < 0 || 2034617147 * anInt6176 > 4)
	    anInt6176 = method7881(46965338) * -679946765;
    }
    
    int method7883() {
	return 0;
    }
    
    int method7880(int i, int i_0_) {
	return 1;
    }
    
    void method7882(int i, int i_1_) {
	anInt6176 = i * -679946765;
    }
    
    public int method14254(int i) {
	return anInt6176 * 2034617147;
    }
    
    public int method14255() {
	return anInt6176 * 2034617147;
    }
    
    int method7884() {
	return 0;
    }
    
    int method7885() {
	return 0;
    }
    
    int method7881(int i) {
	return 0;
    }
    
    int method7886(int i) {
	return 1;
    }
    
    int method7879(int i) {
	return 1;
    }
    
    void method7888(int i) {
	anInt6176 = i * -679946765;
    }
    
    void method7889(int i) {
	anInt6176 = i * -679946765;
    }
    
    int method7887(int i) {
	return 1;
    }
    
    public int method14256() {
	return anInt6176 * 2034617147;
    }
    
    static final void method14257(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).intStackPointer -= 187673446;
	byte[] is = null;
	byte[] is_2_ = null;
	int i_3_;
	for (i_3_ = 0;
	     (i_3_ < 10
	      && (((ClientScriptData) class454).integerStack
		  [((ClientScriptData) class454).intStackPointer * 1482319719 + i_3_]) >= 0);
	     i_3_ += 2) {
	    /* empty */
	}
	if (i_3_ > 0) {
	    is = new byte[i_3_ / 2];
	    is_2_ = new byte[i_3_ / 2];
	    for (i_3_ -= 2; i_3_ >= 0; i_3_ -= 2) {
		is[i_3_ / 2] = (byte) (((ClientScriptData) class454).integerStack
				       [i_3_ + (((ClientScriptData) class454).intStackPointer
						* 1482319719)]);
		is_2_[i_3_ / 2]
		    = (byte) (((ClientScriptData) class454).integerStack
			      [1 + (i_3_ + 1482319719 * (((ClientScriptData) class454)
							 .intStackPointer))]);
	    }
	}
	Class124.method2995(class58, is, is_2_, class454, -1809065570);
    }
}
