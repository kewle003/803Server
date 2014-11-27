/* Class445_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class445_Sub27 extends Class445
{
    public static final int anInt8700 = 2;
    static final int anInt8701 = 1;
    public static final int anInt8702 = 0;
    
    void method7889(int i) {
	anInt6176 = -679946765 * i;
    }
    
    public boolean method14358(byte i) {
	return true;
    }
    
    public Class445_Sub27(int i, Class241_Sub9 class241_sub9) {
	super(i, class241_sub9);
    }
    
    public int method14359() {
	return anInt6176 * 2034617147;
    }
    
    public int method14360() {
	return anInt6176 * 2034617147;
    }
    
    public void method14361() {
	if (anInt6176 * 2034617147 < 0 && 2034617147 * anInt6176 > 2)
	    anInt6176 = method7881(891493319) * -679946765;
    }
    
    void method7882(int i, int i_0_) {
	anInt6176 = -679946765 * i;
    }
    
    public int method14362(byte i) {
	return anInt6176 * 2034617147;
    }
    
    int method7883() {
	return 1;
    }
    
    int method7884() {
	return 1;
    }
    
    int method7885() {
	return 1;
    }
    
    public int method7886(int i) {
	if (i == 0 || aClass241_Sub9_6175.aClass445_Sub29_8861
			  .method14378(-127811105) == 1)
	    return 1;
	return 2;
    }
    
    public int method7887(int i) {
	if (i == 0 || aClass241_Sub9_6175.aClass445_Sub29_8861
			  .method14378(2082244211) == 1)
	    return 1;
	return 2;
    }
    
    public int method7879(int i) {
	if (i == 0 || aClass241_Sub9_6175.aClass445_Sub29_8861
			  .method14378(-1376097152) == 1)
	    return 1;
	return 2;
    }
    
    void method7888(int i) {
	anInt6176 = -679946765 * i;
    }
    
    int method7881(int i) {
	return 1;
    }
    
    public void method14363() {
	if (anInt6176 * 2034617147 < 0 && 2034617147 * anInt6176 > 2)
	    anInt6176 = method7881(2091746242) * -679946765;
    }
    
    public Class445_Sub27(Class241_Sub9 class241_sub9) {
	super(class241_sub9);
    }
    
    public boolean method14364() {
	return true;
    }
    
    public void method14365(byte i) {
	if (anInt6176 * 2034617147 < 0 && 2034617147 * anInt6176 > 2)
	    anInt6176 = method7881(-1226381772) * -679946765;
    }
    
    public boolean method14366() {
	return true;
    }
    
    public boolean method14367() {
	return true;
    }
    
    public int method7880(int i, int i_1_) {
	if (i == 0 || aClass241_Sub9_6175.aClass445_Sub29_8861
			  .method14378(-2118621753) == 1)
	    return 1;
	return 2;
    }
    
    public int method14368() {
	return anInt6176 * 2034617147;
    }
    
    static void method14369(Class103 class103, int i, int i_2_, int i_3_,
			    int i_4_, int i_5_, Class96 class96,
			    Class639 class639, String string, byte i_6_) {
	int i_7_ = (255 - 18175593 * Class270.anInt4359
		    - Class16.anInt144 * 932005875);
	if (i_7_ < 0)
	    i_7_ = 0;
	if (Class363.aClass168_5533 == null
	    || null == Class445_Sub30.aClass168_8711) {
	    if (Class284.SPRITES_ARCHIVE
		    .method4250(-1141209597 * Class77.anInt1130, 245260858)
		&& Class284.SPRITES_ARCHIVE.method4250((1190535919
						       * Class163.anInt2050),
						      1389015985)) {
		Class363.aClass168_5533
		    = (class103.method2289
		       (Class160.method3437(Class284.SPRITES_ARCHIVE,
					    -1141209597 * Class77.anInt1130,
					    0),
			true));
		Class108 class108
		    = Class160.method3437(Class284.SPRITES_ARCHIVE,
					  Class163.anInt2050 * 1190535919, 0);
		Class445_Sub30.aClass168_8711
		    = class103.method2289(class108, true);
		class108.method2705();
		Class23.aClass168_208 = class103.method2289(class108, true);
	    } else
		class103.method2396(i, i_2_, i_3_, i_5_,
				    (i_7_ << 24
				     | -360598457 * Class262.anInt4317),
				    1);
	}
	if (Class363.aClass168_5533 != null
	    && Class445_Sub30.aClass168_8711 != null) {
	    int i_8_ = ((i_3_ - Class445_Sub30.aClass168_8711.method3631() * 2)
			/ Class363.aClass168_5533.method3631());
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
		Class363.aClass168_5533.method3646
		    ((i + Class445_Sub30.aClass168_8711.method3631()
		      + i_9_ * Class363.aClass168_5533.method3631()),
		     i_2_);
	    Class445_Sub30.aClass168_8711.method3646(i, i_2_);
	    Class23.aClass168_208.method3646(i + i_3_ - Class23
							    .aClass168_208
							    .method3631(),
					     i_2_);
	}
	class96.method2128(string, 3 + i,
			   (class639.anInt8258 * -351886683 + i_2_
			    + (20 - -351886683 * class639.anInt8258) / 2),
			   BaseVarType.anInt2541 * -304788339 | ~0xffffff, -1,
			   1841717961);
	class103.method2396(i, i_2_ + i_5_, i_3_, i_4_ - i_5_,
			    i_7_ << 24 | -360598457 * Class262.anInt4317, 1);
    }
}
