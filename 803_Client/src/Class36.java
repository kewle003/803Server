/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class36
{
    int anInt376;
    int[] anIntArray377;
    int anInt378;
    int[] anIntArray379;
    int[] anIntArray380 = null;
    Class57 aClass57_381;
    int[] anIntArray382;
    int[] anIntArray383;
    
    void method1003(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method1004(Class57 class57) {
	((Class36) this).aClass57_381 = class57;
	int i = ((Class36) this).aClass57_381.method1396();
	((Class36) this).aClass57_381.method1441(16);
	((Class36) this).anInt378
	    = (((Class36) this).aClass57_381.method1411() != 0
	       ? ((Class36) this).aClass57_381.method1441(4) + 1 : 1);
	if (((Class36) this).aClass57_381.method1411() != 0) {
	    ((Class36) this).anInt376
		= ((Class36) this).aClass57_381.method1441(8) + 1;
	    if (((Class36) this).anIntArray382 == null
		|| (((Class36) this).anIntArray382.length
		    != ((Class36) this).anInt376))
		((Class36) this).anIntArray382
		    = new int[((Class36) this).anInt376];
	    else
		method1003(((Class36) this).anIntArray382);
	    if (((Class36) this).anIntArray383 == null
		|| (((Class36) this).anIntArray383.length
		    != ((Class36) this).anInt376))
		((Class36) this).anIntArray383
		    = new int[((Class36) this).anInt376];
	    else
		method1003(((Class36) this).anIntArray383);
	    for (int i_0_ = 0; i_0_ < ((Class36) this).anInt376; i_0_++) {
		((Class36) this).anIntArray382[i_0_]
		    = ((Class36) this).aClass57_381
			  .method1441(method1006(i - 1));
		((Class36) this).anIntArray383[i_0_]
		    = ((Class36) this).aClass57_381
			  .method1441(method1006(i - 1));
	    }
	} else
	    ((Class36) this).anInt376 = 0;
	((Class36) this).aClass57_381.method1441(2);
	if (((Class36) this).anInt378 > 1) {
	    ((Class36) this).anIntArray380 = new int[i];
	    for (int i_1_ = 0; i_1_ < i; i_1_++)
		((Class36) this).anIntArray380[i_1_]
		    = ((Class36) this).aClass57_381.method1441(4);
	}
	if (((Class36) this).anIntArray379 == null
	    || (((Class36) this).anIntArray379.length
		!= ((Class36) this).anInt378))
	    ((Class36) this).anIntArray379
		= new int[((Class36) this).anInt378];
	else
	    method1003(((Class36) this).anIntArray379);
	if (((Class36) this).anIntArray377 == null
	    || (((Class36) this).anIntArray377.length
		!= ((Class36) this).anInt378))
	    ((Class36) this).anIntArray377
		= new int[((Class36) this).anInt378];
	else
	    method1003(((Class36) this).anIntArray377);
	for (int i_2_ = 0; i_2_ < ((Class36) this).anInt378; i_2_++) {
	    ((Class36) this).aClass57_381.method1441(8);
	    ((Class36) this).anIntArray379[i_2_]
		= ((Class36) this).aClass57_381.method1441(8);
	    ((Class36) this).anIntArray377[i_2_]
		= ((Class36) this).aClass57_381.method1441(8);
	}
    }
    
    void method1005(Class57 class57) {
	((Class36) this).aClass57_381 = class57;
	int i = ((Class36) this).aClass57_381.method1396();
	((Class36) this).aClass57_381.method1441(16);
	((Class36) this).anInt378
	    = (((Class36) this).aClass57_381.method1411() != 0
	       ? ((Class36) this).aClass57_381.method1441(4) + 1 : 1);
	if (((Class36) this).aClass57_381.method1411() != 0) {
	    ((Class36) this).anInt376
		= ((Class36) this).aClass57_381.method1441(8) + 1;
	    if (((Class36) this).anIntArray382 == null
		|| (((Class36) this).anIntArray382.length
		    != ((Class36) this).anInt376))
		((Class36) this).anIntArray382
		    = new int[((Class36) this).anInt376];
	    else
		method1003(((Class36) this).anIntArray382);
	    if (((Class36) this).anIntArray383 == null
		|| (((Class36) this).anIntArray383.length
		    != ((Class36) this).anInt376))
		((Class36) this).anIntArray383
		    = new int[((Class36) this).anInt376];
	    else
		method1003(((Class36) this).anIntArray383);
	    for (int i_3_ = 0; i_3_ < ((Class36) this).anInt376; i_3_++) {
		((Class36) this).anIntArray382[i_3_]
		    = ((Class36) this).aClass57_381
			  .method1441(method1006(i - 1));
		((Class36) this).anIntArray383[i_3_]
		    = ((Class36) this).aClass57_381
			  .method1441(method1006(i - 1));
	    }
	} else
	    ((Class36) this).anInt376 = 0;
	((Class36) this).aClass57_381.method1441(2);
	if (((Class36) this).anInt378 > 1) {
	    ((Class36) this).anIntArray380 = new int[i];
	    for (int i_4_ = 0; i_4_ < i; i_4_++)
		((Class36) this).anIntArray380[i_4_]
		    = ((Class36) this).aClass57_381.method1441(4);
	}
	if (((Class36) this).anIntArray379 == null
	    || (((Class36) this).anIntArray379.length
		!= ((Class36) this).anInt378))
	    ((Class36) this).anIntArray379
		= new int[((Class36) this).anInt378];
	else
	    method1003(((Class36) this).anIntArray379);
	if (((Class36) this).anIntArray377 == null
	    || (((Class36) this).anIntArray377.length
		!= ((Class36) this).anInt378))
	    ((Class36) this).anIntArray377
		= new int[((Class36) this).anInt378];
	else
	    method1003(((Class36) this).anIntArray377);
	for (int i_5_ = 0; i_5_ < ((Class36) this).anInt378; i_5_++) {
	    ((Class36) this).aClass57_381.method1441(8);
	    ((Class36) this).anIntArray379[i_5_]
		= ((Class36) this).aClass57_381.method1441(8);
	    ((Class36) this).anIntArray377[i_5_]
		= ((Class36) this).aClass57_381.method1441(8);
	}
    }
    
    int method1006(int i) {
	int i_6_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_6_++;
	return i_6_;
    }
    
    void method1007(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method1008(int[] is) {
	if (is != null) {
	    for (int i = 0; i < is.length; i++)
		is[i] = 0;
	}
    }
    
    void method1009(Class57 class57) {
	((Class36) this).aClass57_381 = class57;
	int i = ((Class36) this).aClass57_381.method1396();
	((Class36) this).aClass57_381.method1441(16);
	((Class36) this).anInt378
	    = (((Class36) this).aClass57_381.method1411() != 0
	       ? ((Class36) this).aClass57_381.method1441(4) + 1 : 1);
	if (((Class36) this).aClass57_381.method1411() != 0) {
	    ((Class36) this).anInt376
		= ((Class36) this).aClass57_381.method1441(8) + 1;
	    if (((Class36) this).anIntArray382 == null
		|| (((Class36) this).anIntArray382.length
		    != ((Class36) this).anInt376))
		((Class36) this).anIntArray382
		    = new int[((Class36) this).anInt376];
	    else
		method1003(((Class36) this).anIntArray382);
	    if (((Class36) this).anIntArray383 == null
		|| (((Class36) this).anIntArray383.length
		    != ((Class36) this).anInt376))
		((Class36) this).anIntArray383
		    = new int[((Class36) this).anInt376];
	    else
		method1003(((Class36) this).anIntArray383);
	    for (int i_7_ = 0; i_7_ < ((Class36) this).anInt376; i_7_++) {
		((Class36) this).anIntArray382[i_7_]
		    = ((Class36) this).aClass57_381
			  .method1441(method1006(i - 1));
		((Class36) this).anIntArray383[i_7_]
		    = ((Class36) this).aClass57_381
			  .method1441(method1006(i - 1));
	    }
	} else
	    ((Class36) this).anInt376 = 0;
	((Class36) this).aClass57_381.method1441(2);
	if (((Class36) this).anInt378 > 1) {
	    ((Class36) this).anIntArray380 = new int[i];
	    for (int i_8_ = 0; i_8_ < i; i_8_++)
		((Class36) this).anIntArray380[i_8_]
		    = ((Class36) this).aClass57_381.method1441(4);
	}
	if (((Class36) this).anIntArray379 == null
	    || (((Class36) this).anIntArray379.length
		!= ((Class36) this).anInt378))
	    ((Class36) this).anIntArray379
		= new int[((Class36) this).anInt378];
	else
	    method1003(((Class36) this).anIntArray379);
	if (((Class36) this).anIntArray377 == null
	    || (((Class36) this).anIntArray377.length
		!= ((Class36) this).anInt378))
	    ((Class36) this).anIntArray377
		= new int[((Class36) this).anInt378];
	else
	    method1003(((Class36) this).anIntArray377);
	for (int i_9_ = 0; i_9_ < ((Class36) this).anInt378; i_9_++) {
	    ((Class36) this).aClass57_381.method1441(8);
	    ((Class36) this).anIntArray379[i_9_]
		= ((Class36) this).aClass57_381.method1441(8);
	    ((Class36) this).anIntArray377[i_9_]
		= ((Class36) this).aClass57_381.method1441(8);
	}
    }
    
    int method1010(int i) {
	int i_10_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_10_++;
	return i_10_;
    }
    
    Class36() {
	/* empty */
    }
}
