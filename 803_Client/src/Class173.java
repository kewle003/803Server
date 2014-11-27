/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class173
{
    Interface6 anInterface6_2097;
    Class129 aClass129_2098 = new Class129(6291456, 256);
    Class103_Sub1 aClass103_Sub1_2099;
    
    void method3716() {
	((Class173) this).aClass129_2098.clean(5, -2067005305);
    }
    
    Class142_Sub4 method3717(Class101 class101) {
	return method3723(class101, class101.anInt1406 * 608905203);
    }
    
    Class142_Sub4 method3718(Class101 class101, int i) {
	Class142_Sub4 class142_sub4
	    = ((Class142_Sub4)
	       ((Class173) this).aClass129_2098
		   .get((long) (class101.anInt1403 * 218388063)));
	if (class142_sub4 != null)
	    return class142_sub4;
	if (!method3719(class101, i))
	    return null;
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	Class142_Sub4 class142_sub4_0_;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    int[] is;
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		is = (((Class173) this).anInterface6_2097.method30
		      (class101.anInt1403 * 218388063, 0.7F, i, i, false,
		       -2086874277));
	    else
		is = (((Class173) this).anInterface6_2097.method37
		      (class101.anInt1403 * 218388063, 0.7F, i, i, true,
		       760987440));
	    class142_sub4_0_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, i, i, class101.aByte1369 != 0, is, 0,
				    0, false);
	} else {
	    float[] fs = (((Class173) this).anInterface6_2097.method33
			  (class101.anInt1403 * 218388063, 0.7F, i, i, false,
			   -1231511456));
	    class142_sub4_0_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, Class175.aClass175_2110,
				    Class102.aClass102_1444, i, i,
				    class101.aByte1369 != 0, fs,
				    Class175.aClass175_2110);
	}
	class142_sub4_0_.method16906(class101.aByte1395 == 1,
				     class101.aByte1370 == 1);
	((Class173) this).aClass129_2098.method3026(class142_sub4_0_,
						    (long) (class101.anInt1403
							    * 218388063),
						    i * i, -2099892257);
	return class142_sub4_0_;
    }
    
    boolean method3719(Class101 class101, int i) {
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		return (((Class173) this).anInterface6_2097.method31
			(class101.anInt1403 * 218388063,
			 Class537.aClass537_6990, 0.7F, i, i, false,
			 318312670));
	    return (((Class173) this).anInterface6_2097.method31
		    (class101.anInt1403 * 218388063, Class537.aClass537_6991,
		     0.7F, i, i, true, 1936266474));
	}
	return (((Class173) this).anInterface6_2097.method31
		(class101.anInt1403 * 218388063, Class537.aClass537_6992, 0.7F,
		 i, i, false, -2010994812));
    }
    
    boolean method3720(Class101 class101, int i) {
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		return (((Class173) this).anInterface6_2097.method31
			(class101.anInt1403 * 218388063,
			 Class537.aClass537_6990, 0.7F, i, i, false,
			 2044589984));
	    return (((Class173) this).anInterface6_2097.method31
		    (class101.anInt1403 * 218388063, Class537.aClass537_6991,
		     0.7F, i, i, true, 1897307079));
	}
	return (((Class173) this).anInterface6_2097.method31
		(class101.anInt1403 * 218388063, Class537.aClass537_6992, 0.7F,
		 i, i, false, 1842825164));
    }
    
    void method3721() {
	((Class173) this).aClass129_2098.reset(-463892202);
    }
    
    boolean method3722(Class101 class101, int i) {
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		return (((Class173) this).anInterface6_2097.method31
			(class101.anInt1403 * 218388063,
			 Class537.aClass537_6990, 0.7F, i, i, false,
			 -246087152));
	    return (((Class173) this).anInterface6_2097.method31
		    (class101.anInt1403 * 218388063, Class537.aClass537_6991,
		     0.7F, i, i, true, 276488647));
	}
	return (((Class173) this).anInterface6_2097.method31
		(class101.anInt1403 * 218388063, Class537.aClass537_6992, 0.7F,
		 i, i, false, 1090893688));
    }
    
    Class142_Sub4 method3723(Class101 class101, int i) {
	Class142_Sub4 class142_sub4
	    = ((Class142_Sub4)
	       ((Class173) this).aClass129_2098
		   .get((long) (class101.anInt1403 * 218388063)));
	if (class142_sub4 != null)
	    return class142_sub4;
	if (!method3719(class101, i))
	    return null;
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	Class142_Sub4 class142_sub4_1_;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    int[] is;
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		is = (((Class173) this).anInterface6_2097.method30
		      (class101.anInt1403 * 218388063, 0.7F, i, i, false,
		       -2086874277));
	    else
		is = (((Class173) this).anInterface6_2097.method37
		      (class101.anInt1403 * 218388063, 0.7F, i, i, true,
		       -156445711));
	    class142_sub4_1_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, i, i, class101.aByte1369 != 0, is, 0,
				    0, false);
	} else {
	    float[] fs = (((Class173) this).anInterface6_2097.method33
			  (class101.anInt1403 * 218388063, 0.7F, i, i, false,
			   -480466274));
	    class142_sub4_1_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, Class175.aClass175_2110,
				    Class102.aClass102_1444, i, i,
				    class101.aByte1369 != 0, fs,
				    Class175.aClass175_2110);
	}
	class142_sub4_1_.method16906(class101.aByte1395 == 1,
				     class101.aByte1370 == 1);
	((Class173) this).aClass129_2098.method3026(class142_sub4_1_,
						    (long) (class101.anInt1403
							    * 218388063),
						    i * i, -1636120908);
	return class142_sub4_1_;
    }
    
    Class142_Sub4 method3724(Class101 class101, int i) {
	Class142_Sub4 class142_sub4
	    = ((Class142_Sub4)
	       ((Class173) this).aClass129_2098
		   .get((long) (class101.anInt1403 * 218388063)));
	if (class142_sub4 != null)
	    return class142_sub4;
	if (!method3719(class101, i))
	    return null;
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	Class142_Sub4 class142_sub4_2_;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    int[] is;
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		is = (((Class173) this).anInterface6_2097.method30
		      (class101.anInt1403 * 218388063, 0.7F, i, i, false,
		       -2086874277));
	    else
		is = (((Class173) this).anInterface6_2097.method37
		      (class101.anInt1403 * 218388063, 0.7F, i, i, true,
		       36886411));
	    class142_sub4_2_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, i, i, class101.aByte1369 != 0, is, 0,
				    0, false);
	} else {
	    float[] fs = (((Class173) this).anInterface6_2097.method33
			  (class101.anInt1403 * 218388063, 0.7F, i, i, false,
			   1523638297));
	    class142_sub4_2_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, Class175.aClass175_2110,
				    Class102.aClass102_1444, i, i,
				    class101.aByte1369 != 0, fs,
				    Class175.aClass175_2110);
	}
	class142_sub4_2_.method16906(class101.aByte1395 == 1,
				     class101.aByte1370 == 1);
	((Class173) this).aClass129_2098.method3026(class142_sub4_2_,
						    (long) (class101.anInt1403
							    * 218388063),
						    i * i, -1723353680);
	return class142_sub4_2_;
    }
    
    boolean method3725(Class101 class101, int i) {
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		return (((Class173) this).anInterface6_2097.method31
			(class101.anInt1403 * 218388063,
			 Class537.aClass537_6990, 0.7F, i, i, false,
			 1100013004));
	    return (((Class173) this).anInterface6_2097.method31
		    (class101.anInt1403 * 218388063, Class537.aClass537_6991,
		     0.7F, i, i, true, -1263931536));
	}
	return (((Class173) this).anInterface6_2097.method31
		(class101.anInt1403 * 218388063, Class537.aClass537_6992, 0.7F,
		 i, i, false, -23619155));
    }
    
    Class142_Sub4 method3726(Class101 class101, int i) {
	Class142_Sub4 class142_sub4
	    = ((Class142_Sub4)
	       ((Class173) this).aClass129_2098
		   .get((long) (class101.anInt1403 * 218388063)));
	if (class142_sub4 != null)
	    return class142_sub4;
	if (!method3719(class101, i))
	    return null;
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	Class142_Sub4 class142_sub4_3_;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    int[] is;
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		is = (((Class173) this).anInterface6_2097.method30
		      (class101.anInt1403 * 218388063, 0.7F, i, i, false,
		       -2086874277));
	    else
		is = (((Class173) this).anInterface6_2097.method37
		      (class101.anInt1403 * 218388063, 0.7F, i, i, true,
		       -265731478));
	    class142_sub4_3_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, i, i, class101.aByte1369 != 0, is, 0,
				    0, false);
	} else {
	    float[] fs = (((Class173) this).anInterface6_2097.method33
			  (class101.anInt1403 * 218388063, 0.7F, i, i, false,
			   -1614918241));
	    class142_sub4_3_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, Class175.aClass175_2110,
				    Class102.aClass102_1444, i, i,
				    class101.aByte1369 != 0, fs,
				    Class175.aClass175_2110);
	}
	class142_sub4_3_.method16906(class101.aByte1395 == 1,
				     class101.aByte1370 == 1);
	((Class173) this).aClass129_2098.method3026(class142_sub4_3_,
						    (long) (class101.anInt1403
							    * 218388063),
						    i * i, 773266566);
	return class142_sub4_3_;
    }
    
    Class142_Sub4 method3727(Class101 class101, int i) {
	Class142_Sub4 class142_sub4
	    = ((Class142_Sub4)
	       ((Class173) this).aClass129_2098
		   .get((long) (class101.anInt1403 * 218388063)));
	if (class142_sub4 != null)
	    return class142_sub4;
	if (!method3719(class101, i))
	    return null;
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	Class142_Sub4 class142_sub4_4_;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    int[] is;
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		is = (((Class173) this).anInterface6_2097.method30
		      (class101.anInt1403 * 218388063, 0.7F, i, i, false,
		       -2086874277));
	    else
		is = (((Class173) this).anInterface6_2097.method37
		      (class101.anInt1403 * 218388063, 0.7F, i, i, true,
		       -193468068));
	    class142_sub4_4_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, i, i, class101.aByte1369 != 0, is, 0,
				    0, false);
	} else {
	    float[] fs = (((Class173) this).anInterface6_2097.method33
			  (class101.anInt1403 * 218388063, 0.7F, i, i, false,
			   2077511102));
	    class142_sub4_4_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, Class175.aClass175_2110,
				    Class102.aClass102_1444, i, i,
				    class101.aByte1369 != 0, fs,
				    Class175.aClass175_2110);
	}
	class142_sub4_4_.method16906(class101.aByte1395 == 1,
				     class101.aByte1370 == 1);
	((Class173) this).aClass129_2098.method3026(class142_sub4_4_,
						    (long) (class101.anInt1403
							    * 218388063),
						    i * i, -1544571393);
	return class142_sub4_4_;
    }
    
    Class142_Sub4 method3728(Class101 class101) {
	return method3723(class101, class101.anInt1406 * 608905203);
    }
    
    Class173(Class103_Sub1 class103_sub1, Interface6 interface6) {
	((Class173) this).aClass103_Sub1_2099 = class103_sub1;
	((Class173) this).anInterface6_2097 = interface6;
    }
    
    Class142_Sub4 method3729(Class101 class101, int i) {
	Class142_Sub4 class142_sub4
	    = ((Class142_Sub4)
	       ((Class173) this).aClass129_2098
		   .get((long) (class101.anInt1403 * 218388063)));
	if (class142_sub4 != null)
	    return class142_sub4;
	if (!method3719(class101, i))
	    return null;
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	Class142_Sub4 class142_sub4_5_;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    int[] is;
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		is = (((Class173) this).anInterface6_2097.method30
		      (class101.anInt1403 * 218388063, 0.7F, i, i, false,
		       -2086874277));
	    else
		is = (((Class173) this).anInterface6_2097.method37
		      (class101.anInt1403 * 218388063, 0.7F, i, i, true,
		       1830046762));
	    class142_sub4_5_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, i, i, class101.aByte1369 != 0, is, 0,
				    0, false);
	} else {
	    float[] fs = (((Class173) this).anInterface6_2097.method33
			  (class101.anInt1403 * 218388063, 0.7F, i, i, false,
			   -1122643443));
	    class142_sub4_5_
		= new Class142_Sub4(((Class173) this).aClass103_Sub1_2099,
				    3553, Class175.aClass175_2110,
				    Class102.aClass102_1444, i, i,
				    class101.aByte1369 != 0, fs,
				    Class175.aClass175_2110);
	}
	class142_sub4_5_.method16906(class101.aByte1395 == 1,
				     class101.aByte1370 == 1);
	((Class173) this).aClass129_2098.method3026(class142_sub4_5_,
						    (long) (class101.anInt1403
							    * 218388063),
						    i * i, -1937234484);
	return class142_sub4_5_;
    }
    
    boolean method3730(Class101 class101, int i) {
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		return (((Class173) this).anInterface6_2097.method31
			(class101.anInt1403 * 218388063,
			 Class537.aClass537_6990, 0.7F, i, i, false,
			 -1966952946));
	    return (((Class173) this).anInterface6_2097.method31
		    (class101.anInt1403 * 218388063, Class537.aClass537_6991,
		     0.7F, i, i, true, 95306647));
	}
	return (((Class173) this).anInterface6_2097.method31
		(class101.anInt1403 * 218388063, Class537.aClass537_6992, 0.7F,
		 i, i, false, 1450934362));
    }
    
    boolean method3731(Class101 class101, int i) {
	if (i == -1)
	    i = class101.anInt1406 * 608905203;
	if (!class101.aBool1409
	    || !((Class173) this).aClass103_Sub1_2099.method2331()) {
	    if (class101.aClass529_1391 != Class529.aClass529_6942
		|| !Class628.method13474(class101.aByte1427, -768281831))
		return (((Class173) this).anInterface6_2097.method31
			(class101.anInt1403 * 218388063,
			 Class537.aClass537_6990, 0.7F, i, i, false,
			 467688258));
	    return (((Class173) this).anInterface6_2097.method31
		    (class101.anInt1403 * 218388063, Class537.aClass537_6991,
		     0.7F, i, i, true, -536412744));
	}
	return (((Class173) this).anInterface6_2097.method31
		(class101.anInt1403 * 218388063, Class537.aClass537_6992, 0.7F,
		 i, i, false, 156841491));
    }
    
    void method3732() {
	((Class173) this).aClass129_2098.clean(5, -2047693968);
    }
    
    void method3733() {
	((Class173) this).aClass129_2098.reset(-1130079306);
    }
    
    void method3734() {
	((Class173) this).aClass129_2098.reset(-1567654266);
    }
    
    void method3735() {
	((Class173) this).aClass129_2098.reset(-2086952391);
    }
}
