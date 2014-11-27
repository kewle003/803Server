/* Class379 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class379
{
    Class103_Sub3 aClass103_Sub3_5653;
    Interface6 anInterface6_5654;
    Class129 aClass129_5655 = new Class129(6291456, 256);
    
    Interface41 method6843(Class101 class101) {
	return method6845(class101, class101.anInt1406 * 608905203);
    }
    
    Interface41 method6844(Class101 class101) {
	return method6845(class101, class101.anInt1406 * 608905203);
    }
    
    Interface41 method6845(Class101 class101, int i) {
	long l = (long) (i << 16 | class101.anInt1403 * 218388063);
	Interface41 interface41
	    = (Interface41) ((Class379) this).aClass129_5655.get(l);
	if (interface41 != null)
	    return interface41;
	if (!method6846(class101, i))
	    return null;
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	Interface41 interface41_0_;
	if (!class101.aBool1409
	    || !((Class379) this).aClass103_Sub3_5653.method2331()) {
	    int[] is;
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		is = (((Class379) this).anInterface6_5654.method30
		      (class101.anInt1403 * 218388063, 0.7F, i, i, false,
		       -2086874277));
	    else
		is = (((Class379) this).anInterface6_5654.method37
		      (class101.anInt1403 * 218388063, 0.7F, i, i, true,
		       15281709));
	    interface41_0_
		= ((Class379) this).aClass103_Sub3_5653.method15828(i, i, true,
								    is);
	} else {
	    float[] fs = (((Class379) this).anInterface6_5654.method33
			  (class101.anInt1403 * 218388063, 0.7F, i, i, false,
			   -1811884283));
	    interface41_0_
		= ((Class379) this).aClass103_Sub3_5653
		      .method15678(Class175.aClass175_2110, i, i, true, fs);
	}
	interface41_0_.method228(class101.aByte1395 == 1,
				 class101.aByte1370 == 1);
	((Class379) this).aClass129_5655.method3026(interface41_0_, l, i * i,
						    -1093558884);
	return interface41_0_;
    }
    
    boolean method6846(Class101 class101, int i) {
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	if (!class101.aBool1409
	    || !((Class379) this).aClass103_Sub3_5653.method2331()) {
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		return (((Class379) this).anInterface6_5654.method31
			(class101.anInt1403 * 218388063,
			 Class537.aClass537_6990, 0.7F, i, i, false,
			 -1801794372));
	    return (((Class379) this).anInterface6_5654.method31
		    (class101.anInt1403 * 218388063, Class537.aClass537_6991,
		     0.7F, i, i, true, 146398506));
	}
	return (((Class379) this).anInterface6_5654.method31
		(class101.anInt1403 * 218388063, Class537.aClass537_6992, 0.7F,
		 i, i, false, -1309865781));
    }
    
    void method6847() {
	((Class379) this).aClass129_5655.clean(5, -2034141912);
    }
    
    void method6848() {
	((Class379) this).aClass129_5655.reset(-318611331);
    }
    
    Class379(Class103_Sub3 class103_sub3, Interface6 interface6) {
	((Class379) this).aClass103_Sub3_5653 = class103_sub3;
	((Class379) this).anInterface6_5654 = interface6;
    }
    
    boolean method6849(Class101 class101, int i) {
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	if (!class101.aBool1409
	    || !((Class379) this).aClass103_Sub3_5653.method2331()) {
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		return (((Class379) this).anInterface6_5654.method31
			(class101.anInt1403 * 218388063,
			 Class537.aClass537_6990, 0.7F, i, i, false,
			 1908643591));
	    return (((Class379) this).anInterface6_5654.method31
		    (class101.anInt1403 * 218388063, Class537.aClass537_6991,
		     0.7F, i, i, true, 288529011));
	}
	return (((Class379) this).anInterface6_5654.method31
		(class101.anInt1403 * 218388063, Class537.aClass537_6992, 0.7F,
		 i, i, false, 1226653784));
    }
    
    Interface41 method6850(Class101 class101, int i) {
	long l = (long) (i << 16 | class101.anInt1403 * 218388063);
	Interface41 interface41
	    = (Interface41) ((Class379) this).aClass129_5655.get(l);
	if (interface41 != null)
	    return interface41;
	if (!method6846(class101, i))
	    return null;
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	Interface41 interface41_1_;
	if (!class101.aBool1409
	    || !((Class379) this).aClass103_Sub3_5653.method2331()) {
	    int[] is;
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		is = (((Class379) this).anInterface6_5654.method30
		      (class101.anInt1403 * 218388063, 0.7F, i, i, false,
		       -2086874277));
	    else
		is = (((Class379) this).anInterface6_5654.method37
		      (class101.anInt1403 * 218388063, 0.7F, i, i, true,
		       1616884542));
	    interface41_1_
		= ((Class379) this).aClass103_Sub3_5653.method15828(i, i, true,
								    is);
	} else {
	    float[] fs = (((Class379) this).anInterface6_5654.method33
			  (class101.anInt1403 * 218388063, 0.7F, i, i, false,
			   1691618434));
	    interface41_1_
		= ((Class379) this).aClass103_Sub3_5653
		      .method15678(Class175.aClass175_2110, i, i, true, fs);
	}
	interface41_1_.method228(class101.aByte1395 == 1,
				 class101.aByte1370 == 1);
	((Class379) this).aClass129_5655.method3026(interface41_1_, l, i * i,
						    -1584997511);
	return interface41_1_;
    }
    
    Interface41 method6851(Class101 class101) {
	return method6845(class101, class101.anInt1406 * 608905203);
    }
    
    Interface41 method6852(Class101 class101, int i) {
	long l = (long) (i << 16 | class101.anInt1403 * 218388063);
	Interface41 interface41
	    = (Interface41) ((Class379) this).aClass129_5655.get(l);
	if (interface41 != null)
	    return interface41;
	if (!method6846(class101, i))
	    return null;
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	Interface41 interface41_2_;
	if (!class101.aBool1409
	    || !((Class379) this).aClass103_Sub3_5653.method2331()) {
	    int[] is;
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		is = (((Class379) this).anInterface6_5654.method30
		      (class101.anInt1403 * 218388063, 0.7F, i, i, false,
		       -2086874277));
	    else
		is = (((Class379) this).anInterface6_5654.method37
		      (class101.anInt1403 * 218388063, 0.7F, i, i, true,
		       521950677));
	    interface41_2_
		= ((Class379) this).aClass103_Sub3_5653.method15828(i, i, true,
								    is);
	} else {
	    float[] fs = (((Class379) this).anInterface6_5654.method33
			  (class101.anInt1403 * 218388063, 0.7F, i, i, false,
			   -584089870));
	    interface41_2_
		= ((Class379) this).aClass103_Sub3_5653
		      .method15678(Class175.aClass175_2110, i, i, true, fs);
	}
	interface41_2_.method228(class101.aByte1395 == 1,
				 class101.aByte1370 == 1);
	((Class379) this).aClass129_5655.method3026(interface41_2_, l, i * i,
						    -1980429325);
	return interface41_2_;
    }
    
    Interface41 method6853(Class101 class101, int i) {
	long l = (long) (i << 16 | class101.anInt1403 * 218388063);
	Interface41 interface41
	    = (Interface41) ((Class379) this).aClass129_5655.get(l);
	if (interface41 != null)
	    return interface41;
	if (!method6846(class101, i))
	    return null;
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	Interface41 interface41_3_;
	if (!class101.aBool1409
	    || !((Class379) this).aClass103_Sub3_5653.method2331()) {
	    int[] is;
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		is = (((Class379) this).anInterface6_5654.method30
		      (class101.anInt1403 * 218388063, 0.7F, i, i, false,
		       -2086874277));
	    else
		is = (((Class379) this).anInterface6_5654.method37
		      (class101.anInt1403 * 218388063, 0.7F, i, i, true,
		       442756855));
	    interface41_3_
		= ((Class379) this).aClass103_Sub3_5653.method15828(i, i, true,
								    is);
	} else {
	    float[] fs = (((Class379) this).anInterface6_5654.method33
			  (class101.anInt1403 * 218388063, 0.7F, i, i, false,
			   -337805776));
	    interface41_3_
		= ((Class379) this).aClass103_Sub3_5653
		      .method15678(Class175.aClass175_2110, i, i, true, fs);
	}
	interface41_3_.method228(class101.aByte1395 == 1,
				 class101.aByte1370 == 1);
	((Class379) this).aClass129_5655.method3026(interface41_3_, l, i * i,
						    -2028757005);
	return interface41_3_;
    }
    
    Interface41 method6854(Class101 class101) {
	return method6845(class101, class101.anInt1406 * 608905203);
    }
    
    void method6855() {
	((Class379) this).aClass129_5655.clean(5, -2056078564);
    }
    
    void method6856() {
	((Class379) this).aClass129_5655.clean(5, -2129800368);
    }
}
