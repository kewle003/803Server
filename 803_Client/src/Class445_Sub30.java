/* Class445_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class445_Sub30 extends Class445
{
    public static final int anInt8708 = 1;
    public static final int anInt8709 = 2;
    public static final int anInt8710 = 3;
    public static Class168 aClass168_8711;
    
    int method7885() {
	return (aClass241_Sub9_6175.method14914(-1793673717)
		    .method7548(-1074574479)
		? 3 : 2);
    }
    
    public Class445_Sub30(int i, Class241_Sub9 class241_sub9) {
	super(i, class241_sub9);
    }
    
    public void method14385(int i) {
	if (2034617147 * anInt6176 < 1 || anInt6176 * 2034617147 > 3)
	    anInt6176 = method7881(-2021777737) * -679946765;
    }
    
    int method7884() {
	return (aClass241_Sub9_6175.method14914(-1793673717)
		    .method7548(1249240880)
		? 3 : 2);
    }
    
    int method7880(int i, int i_0_) {
	return 1;
    }
    
    void method7882(int i, int i_1_) {
	anInt6176 = -679946765 * i;
    }
    
    int method7886(int i) {
	return 1;
    }
    
    int method7883() {
	return (aClass241_Sub9_6175.method14914(-1793673717)
		    .method7548(-1620520337)
		? 3 : 2);
    }
    
    public int method14386(int i) {
	return 2034617147 * anInt6176;
    }
    
    public Class445_Sub30(Class241_Sub9 class241_sub9) {
	super(class241_sub9);
    }
    
    int method7887(int i) {
	return 1;
    }
    
    int method7881(int i) {
	return (aClass241_Sub9_6175.method14914(-1793673717)
		    .method7548(-1368986877)
		? 3 : 2);
    }
    
    int method7879(int i) {
	return 1;
    }
    
    void method7888(int i) {
	anInt6176 = -679946765 * i;
    }
    
    void method7889(int i) {
	anInt6176 = -679946765 * i;
    }
    
    public int method14387() {
	return 2034617147 * anInt6176;
    }
    
    public static final int method14388(int i, int i_2_, int i_3_) {
	if (-2 == i)
	    return 12345678;
	if (i == -1) {
	    if (i_2_ < 2)
		i_2_ = 2;
	    else if (i_2_ > 126)
		i_2_ = 126;
	    return i_2_;
	}
	i_2_ = i_2_ * (i & 0x7f) >> 7;
	if (i_2_ < 2)
	    i_2_ = 2;
	else if (i_2_ > 126)
	    i_2_ = 126;
	return (i & 0xff80) + i_2_;
    }
}
