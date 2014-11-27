/* Class88_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class88_Sub2_Sub1 extends Class88_Sub2
{
    Class142_Sub2 aClass142_Sub2_11169;
    static int[] anIntArray11170 = new int[4];
    Class103_Sub1 aClass103_Sub1_11171;
    
    int method17585() {
	return (((Class142_Sub2)
		 ((Class88_Sub2_Sub1) this).aClass142_Sub2_11169)
		.anInt10019);
    }
    
    Class142_Sub2 method15123() {
	return ((Class88_Sub2_Sub1) this).aClass142_Sub2_11169;
    }
    
    int method17586() {
	return (((Class142_Sub2)
		 ((Class88_Sub2_Sub1) this).aClass142_Sub2_11169)
		.anInt10019);
    }
    
    boolean method17587(Class142_Sub2 class142_sub2,
			Class142_Sub2 class142_sub2_0_, float f) {
	boolean bool = true;
	Class105_Sub2_Sub1 class105_sub2_sub1
	    = (((Class103_Sub1)
		((Class88_Sub2_Sub1) this).aClass103_Sub1_11171)
	       .aClass105_Sub2_Sub1_9225);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171
	    .method2260(anIntArray11170);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method2572();
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15145();
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glPushAttrib(2048);
	OpenGL.glViewport(0, 0,
			  ((Class142_Sub2) (((Class88_Sub2_Sub1) this)
					    .aClass142_Sub2_11169)).anInt10019,
			  (((Class142_Sub2)
			    ((Class88_Sub2_Sub1) this).aClass142_Sub2_11169)
			   .anInt10019));
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15185(false);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15186(false);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15189(false);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15190(false);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15173(-2);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15225(1);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15182(0.0F, 0.0F,
								    0.0F, f);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15180(34165,
								    34165);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171
	    .method15177(class142_sub2_0_);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15225(0);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15178(1);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171
	    .method15177(class142_sub2);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171
	    .method2244(class105_sub2_sub1, -519163929);
	for (int i = 0; i < 6; i++) {
	    int i_1_ = 34069 + i;
	    class105_sub2_sub1.method15585(0, ((Class88_Sub2_Sub1) this)
						  .aClass142_Sub2_11169
						  .method16284(i_1_, 0));
	    class105_sub2_sub1.method16915(0);
	    if (class105_sub2_sub1.method15586()) {
		OpenGL.glBegin(7);
		switch (i_1_) {
		case 34070:
		    OpenGL.glTexCoord3i(-65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34074:
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34073:
		    OpenGL.glTexCoord3i(-65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34071:
		    OpenGL.glTexCoord3i(-65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34069:
		    OpenGL.glTexCoord3i(65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34072:
		    OpenGL.glTexCoord3i(-65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		}
		OpenGL.glEnd();
	    } else {
		bool = false;
		break;
	    }
	}
	class105_sub2_sub1.method15585(0, null);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171
	    .method2245(class105_sub2_sub1, -1317551112);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15225(1);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15177(null);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15180(8448,
								    8448);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15225(0);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15177(null);
	OpenGL.glPopAttrib();
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method2445
	    (anIntArray11170[0], anIntArray11170[1], anIntArray11170[2],
	     anIntArray11170[3]);
	if (bool && !((Class103_Sub1) (((Class88_Sub2_Sub1) this)
				       .aClass103_Sub1_11171)).aBool9187)
	    ((Class88_Sub2_Sub1) this).aClass142_Sub2_11169.method3169();
	return bool;
    }
    
    Class142_Sub2 method15124() {
	return ((Class88_Sub2_Sub1) this).aClass142_Sub2_11169;
    }
    
    boolean method17588(Class142_Sub2 class142_sub2,
			Class142_Sub2 class142_sub2_2_, float f) {
	boolean bool = true;
	Class105_Sub2_Sub1 class105_sub2_sub1
	    = (((Class103_Sub1)
		((Class88_Sub2_Sub1) this).aClass103_Sub1_11171)
	       .aClass105_Sub2_Sub1_9225);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171
	    .method2260(anIntArray11170);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method2572();
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15145();
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glPushAttrib(2048);
	OpenGL.glViewport(0, 0,
			  ((Class142_Sub2) (((Class88_Sub2_Sub1) this)
					    .aClass142_Sub2_11169)).anInt10019,
			  (((Class142_Sub2)
			    ((Class88_Sub2_Sub1) this).aClass142_Sub2_11169)
			   .anInt10019));
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15185(false);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15186(false);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15189(false);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15190(false);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15173(-2);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15225(1);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15182(0.0F, 0.0F,
								    0.0F, f);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15180(34165,
								    34165);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171
	    .method15177(class142_sub2_2_);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15225(0);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15178(1);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171
	    .method15177(class142_sub2);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171
	    .method2244(class105_sub2_sub1, -519163929);
	for (int i = 0; i < 6; i++) {
	    int i_3_ = 34069 + i;
	    class105_sub2_sub1.method15585(0, ((Class88_Sub2_Sub1) this)
						  .aClass142_Sub2_11169
						  .method16284(i_3_, 0));
	    class105_sub2_sub1.method16915(0);
	    if (class105_sub2_sub1.method15586()) {
		OpenGL.glBegin(7);
		switch (i_3_) {
		case 34070:
		    OpenGL.glTexCoord3i(-65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34074:
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34073:
		    OpenGL.glTexCoord3i(-65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34071:
		    OpenGL.glTexCoord3i(-65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34069:
		    OpenGL.glTexCoord3i(65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34072:
		    OpenGL.glTexCoord3i(-65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		}
		OpenGL.glEnd();
	    } else {
		bool = false;
		break;
	    }
	}
	class105_sub2_sub1.method15585(0, null);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171
	    .method2245(class105_sub2_sub1, 708215450);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15225(1);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15177(null);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15180(8448,
								    8448);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15225(0);
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method15177(null);
	OpenGL.glPopAttrib();
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171.method2445
	    (anIntArray11170[0], anIntArray11170[1], anIntArray11170[2],
	     anIntArray11170[3]);
	if (bool && !((Class103_Sub1) (((Class88_Sub2_Sub1) this)
				       .aClass103_Sub1_11171)).aBool9187)
	    ((Class88_Sub2_Sub1) this).aClass142_Sub2_11169.method3169();
	return bool;
    }
    
    Class88_Sub2_Sub1(Class103_Sub1 class103_sub1, int i) {
	((Class88_Sub2_Sub1) this).aClass103_Sub1_11171 = class103_sub1;
	((Class88_Sub2_Sub1) this).aClass142_Sub2_11169
	    = new Class142_Sub2(class103_sub1, Class175.aClass175_2110,
				Class102.aClass102_1440, i);
    }
    
    int method17589() {
	return (((Class142_Sub2)
		 ((Class88_Sub2_Sub1) this).aClass142_Sub2_11169)
		.anInt10019);
    }
    
    Class142_Sub2 method15125() {
	return ((Class88_Sub2_Sub1) this).aClass142_Sub2_11169;
    }
}
