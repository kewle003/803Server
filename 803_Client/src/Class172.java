/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class172
{
    Class142_Sub4[] aClass142_Sub4Array2076;
    Class105_Sub2_Sub1 aClass105_Sub2_Sub1_2077;
    Class105_Sub2_Sub1 aClass105_Sub2_Sub1_2078;
    Class105_Sub2_Sub1 aClass105_Sub2_Sub1_2079;
    boolean aBool2080;
    int anInt2081;
    int anInt2082;
    int anInt2083;
    boolean aBool2084;
    boolean aBool2085;
    boolean aBool2086;
    boolean aBool2087;
    int anInt2088 = 0;
    NodeCollection aClass429_2089;
    int anInt2090;
    Class241_Sub39_Sub18 aClass241_Sub39_Sub18_2091;
    Class142_Sub4 aClass142_Sub4_2092;
    Class241_Sub39_Sub18 aClass241_Sub39_Sub18_2093;
    Class102 aClass102_2094;
    boolean aBool2095;
    Class103_Sub1 aClass103_Sub1_2096;
    
    boolean method3687() {
	return ((Class172) this).aBool2084;
    }
    
    boolean method3688(Class241_Sub35 class241_sub35) {
	if (((Class172) this).aClass105_Sub2_Sub1_2079 != null) {
	    if (class241_sub35.method16401() || class241_sub35.method16392()) {
		((Class172) this).aClass429_2089.addNode(class241_sub35,
							    (short) -2729);
		method3697();
		if (class241_sub35.method16381() >= 0 && method3692()) {
		    if (((Class172) this).anInt2082 != -1
			&& ((Class172) this).anInt2083 != -1)
			class241_sub35.method16377(((Class172) this).anInt2082,
						   (((Class172) this)
						    .anInt2083));
		    ((Class241_Sub35) class241_sub35).aBool10089 = true;
		    return true;
		}
	    }
	    method3696(class241_sub35);
	}
	return false;
    }
    
    boolean method3689() {
	return ((Class172) this).aClass105_Sub2_Sub1_2079 != null;
    }
    
    boolean method3690() {
	return ((Class172) this).aBool2084;
    }
    
    boolean method3691(Class241_Sub35 class241_sub35) {
	if (((Class172) this).aClass105_Sub2_Sub1_2079 != null) {
	    if (class241_sub35.method16401() || class241_sub35.method16392()) {
		((Class172) this).aClass429_2089.addNode(class241_sub35,
							    (short) -5640);
		method3697();
		if (class241_sub35.method16381() >= 0 && method3692()) {
		    if (((Class172) this).anInt2082 != -1
			&& ((Class172) this).anInt2083 != -1)
			class241_sub35.method16377(((Class172) this).anInt2082,
						   (((Class172) this)
						    .anInt2083));
		    ((Class241_Sub35) class241_sub35).aBool10089 = true;
		    return true;
		}
	    }
	    method3696(class241_sub35);
	}
	return false;
    }
    
    boolean method3692() {
	if (((Class172) this).aBool2087) {
	    if (((Class172) this).aClass241_Sub39_Sub18_2093 != null) {
		((Class172) this).aClass241_Sub39_Sub18_2093.method28();
		((Class172) this).aClass241_Sub39_Sub18_2093 = null;
	    }
	    if (((Class172) this).aClass142_Sub4_2092 != null) {
		((Class172) this).aClass142_Sub4_2092.method3176();
		((Class172) this).aClass142_Sub4_2092 = null;
	    }
	}
	if (((Class172) this).aBool2086) {
	    if (((Class172) this).aClass241_Sub39_Sub18_2091 != null) {
		((Class172) this).aClass241_Sub39_Sub18_2091.method28();
		((Class172) this).aClass241_Sub39_Sub18_2091 = null;
	    }
	    if (((Class172) this).aClass142_Sub4Array2076[0] != null) {
		((Class172) this).aClass142_Sub4Array2076[0].method3176();
		((Class172) this).aClass142_Sub4Array2076[0] = null;
	    }
	    if (((Class172) this).aClass142_Sub4Array2076[1] != null) {
		((Class172) this).aClass142_Sub4Array2076[1].method3176();
		((Class172) this).aClass142_Sub4Array2076[1] = null;
	    }
	}
	if (((Class172) this).aBool2087) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null)
		((Class172) this).aClass241_Sub39_Sub18_2093
		    = new Class241_Sub39_Sub18((((Class172) this)
						.aClass103_Sub1_2096),
					       Class175.aClass175_2115,
					       Class102.aClass102_1437,
					       ((Class172) this).anInt2082,
					       ((Class172) this).anInt2083,
					       (((Class103_Sub1)
						 (((Class172) this)
						  .aClass103_Sub1_2096))
						.anInt9079));
	    if (((Class172) this).aBool2085)
		((Class172) this).aClass142_Sub4_2092
		    = new Class142_Sub4(((Class172) this).aClass103_Sub1_2096,
					34037, Class175.aClass175_2115,
					Class102.aClass102_1437,
					((Class172) this).anInt2082,
					((Class172) this).anInt2083);
	    else if (((Class172) this).aClass241_Sub39_Sub18_2093 == null)
		((Class172) this).aClass241_Sub39_Sub18_2093
		    = new Class241_Sub39_Sub18((((Class172) this)
						.aClass103_Sub1_2096),
					       Class175.aClass175_2115,
					       Class102.aClass102_1437,
					       ((Class172) this).anInt2082,
					       ((Class172) this).anInt2083);
	    ((Class172) this).aBool2087 = false;
	    ((Class172) this).aBool2095 = true;
	    ((Class172) this).aBool2080 = true;
	}
	if (((Class172) this).aBool2086) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null)
		((Class172) this).aClass241_Sub39_Sub18_2091
		    = (new Class241_Sub39_Sub18
		       (((Class172) this).aClass103_Sub1_2096,
			Class175.aClass175_2110,
			((Class172) this).aClass102_2094,
			((Class172) this).anInt2082,
			((Class172) this).anInt2083,
			((Class103_Sub1)
			 ((Class172) this).aClass103_Sub1_2096).anInt9079));
	    ((Class172) this).aClass142_Sub4Array2076[0]
		= new Class142_Sub4(((Class172) this).aClass103_Sub1_2096,
				    34037, Class175.aClass175_2110,
				    ((Class172) this).aClass102_2094,
				    ((Class172) this).anInt2082,
				    ((Class172) this).anInt2083);
	    ((Class172) this).aClass142_Sub4Array2076[1]
		= (((Class172) this).anInt2090 > 1
		   ? new Class142_Sub4(((Class172) this).aClass103_Sub1_2096,
				       34037, Class175.aClass175_2110,
				       ((Class172) this).aClass102_2094,
				       ((Class172) this).anInt2082,
				       ((Class172) this).anInt2083)
		   : null);
	    ((Class172) this).aBool2086 = false;
	    ((Class172) this).aBool2095 = true;
	    ((Class172) this).aBool2080 = true;
	}
	if (((Class172) this).aBool2095) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null) {
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15584(null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(0,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(1,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (0, ((Class172) this).aClass142_Sub4Array2076[0]
			    .method16902(0));
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (1, (((Class172) this).anInt2090 > 1
			 ? ((Class172) this).aClass142_Sub4Array2076[1]
			       .method16902(0)
			 : null));
		if (((Class172) this).aBool2085)
		    ((Class172) this).aClass105_Sub2_Sub1_2077.method15584
			(((Class172) this).aClass142_Sub4_2092.method16909(0));
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -558016248);
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2078, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15584(null);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15585(0,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15585
		    (0, ((Class172) this).aClass241_Sub39_Sub18_2091);
		((Class172) this).aClass105_Sub2_Sub1_2078
		    .method15584(((Class172) this).aClass241_Sub39_Sub18_2093);
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2078, -553169317);
	    } else {
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15584(null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(0,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(1,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (0, ((Class172) this).aClass142_Sub4Array2076[0]
			    .method16902(0));
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (1, (((Class172) this).anInt2090 > 1
			 ? ((Class172) this).aClass142_Sub4Array2076[1]
			       .method16902(0)
			 : null));
		if (((Class172) this).aBool2085)
		    ((Class172) this).aClass105_Sub2_Sub1_2077.method15584
			(((Class172) this).aClass142_Sub4_2092.method16909(0));
		else
		    ((Class172) this).aClass105_Sub2_Sub1_2077.method15584
			(((Class172) this).aClass241_Sub39_Sub18_2093);
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2077, 848106105);
	    }
	    ((Class172) this).aBool2095 = false;
	    ((Class172) this).aBool2080 = true;
	}
	if (((Class172) this).aBool2080) {
	    ((Class172) this).aClass103_Sub1_2096.method2244
		(((Class172) this).aClass105_Sub2_Sub1_2079, -519163929);
	    ((Class172) this).aBool2080
		= !((Class172) this).aClass105_Sub2_Sub1_2079.method15586();
	    ((Class172) this).aClass103_Sub1_2096.method2245
		(((Class172) this).aClass105_Sub2_Sub1_2079, 913751143);
	}
	return !((Class172) this).aBool2080;
    }
    
    boolean method3693(int i, int i_0_, int i_1_, int i_2_) {
	if (((Class172) this).aClass105_Sub2_Sub1_2079 == null
	    || ((Class172) this).aClass429_2089.isEmpty(-2100063556)
	    || method3706())
	    return false;
	if (((Class172) this).anInt2082 != i_1_
	    || ((Class172) this).anInt2083 != i_2_) {
	    ((Class172) this).anInt2082 = i_1_;
	    ((Class172) this).anInt2083 = i_2_;
	    for (Node class241
		     = ((Class172) this).aClass429_2089.method7694(16711935);
		 class241 != ((Class172) this).aClass429_2089.aClass241_6093;
		 class241 = class241.previousNode)
		((Class241_Sub35) class241).method16377((((Class172) this)
							 .anInt2082),
							(((Class172) this)
							 .anInt2083));
	    ((Class172) this).aBool2086 = true;
	    ((Class172) this).aBool2087 = true;
	    ((Class172) this).aBool2095 = true;
	}
	if (method3692()) {
	    ((Class172) this).anInt2088 = i;
	    ((Class172) this).anInt2081 = i_0_;
	    ((Class172) this).aBool2084 = true;
	    ((Class172) this).aClass103_Sub1_2096.method15138
		(-((Class172) this).anInt2088,
		 (((Class172) this).anInt2083 + ((Class172) this).anInt2081
		  - ((Class172) this).aClass103_Sub1_2096.method2237
			((byte) 4).method2654()));
	    ((Class172) this).aClass103_Sub1_2096.method2244
		(((Class172) this).aClass105_Sub2_Sub1_2079, -519163929);
	    ((Class172) this).aClass103_Sub1_2096.method2450(3, 0);
	    ((Class172) this).aClass105_Sub2_Sub1_2079.method16915(0);
	    return true;
	}
	return false;
    }
    
    boolean method3694(Class241_Sub35 class241_sub35) {
	if (((Class172) this).aClass105_Sub2_Sub1_2079 != null) {
	    if (class241_sub35.method16401() || class241_sub35.method16392()) {
		((Class172) this).aClass429_2089.addNode(class241_sub35,
							    (short) -4707);
		method3697();
		if (class241_sub35.method16381() >= 0 && method3692()) {
		    if (((Class172) this).anInt2082 != -1
			&& ((Class172) this).anInt2083 != -1)
			class241_sub35.method16377(((Class172) this).anInt2082,
						   (((Class172) this)
						    .anInt2083));
		    ((Class241_Sub35) class241_sub35).aBool10089 = true;
		    return true;
		}
	    }
	    method3696(class241_sub35);
	}
	return false;
    }
    
    void method3695() {
	if (((Class172) this).aBool2084) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null) {
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2078, -419693887);
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2077.method16915(0);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15587
		    (0, 0, ((Class172) this).anInt2082,
		     ((Class172) this).anInt2083, 0, 0, true,
		     ((Class172) this).aBool2085);
	    }
	    ((Class172) this).aClass103_Sub1_2096.method15171();
	    ((Class172) this).aClass103_Sub1_2096.method15192(0);
	    ((Class172) this).aClass103_Sub1_2096.method15178(1);
	    ((Class172) this).aClass103_Sub1_2096.method2572();
	    int i = 0;
	    int i_3_ = 1;
	    int i_4_ = 0;
	    int i_5_ = 0;
	    int i_6_ = 0;
	    Object object = null;
	    for (Class241_Sub35 class241_sub35
		     = ((Class241_Sub35)
			((Class172) this).aClass429_2089.method7694(16711935));
		 class241_sub35 != null;
		 class241_sub35
		     = (Class241_Sub35) ((Class172) this).aClass429_2089
					    .method7692(-242626159)) {
		if (!class241_sub35.method16374())
		    i_5_++;
	    }
	    Class241_Sub35[] class241_sub35s = new Class241_Sub35[i_5_];
	    i_5_ = 0;
	    for (Class241_Sub35 class241_sub35
		     = ((Class241_Sub35)
			((Class172) this).aClass429_2089.method7694(16711935));
		 class241_sub35 != null;
		 class241_sub35
		     = (Class241_Sub35) ((Class172) this).aClass429_2089
					    .method7692(2023557744)) {
		if (!class241_sub35.method16374())
		    class241_sub35s[i_5_++] = class241_sub35;
	    }
	    while (i_4_ < i_5_) {
		for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
		    Class241_Sub35 class241_sub35 = class241_sub35s[i_7_];
		    if (class241_sub35.method16381() == i_6_) {
			int i_8_ = class241_sub35.method16380();
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			    class241_sub35.method16378
				(i_9_,
				 ((Class172) this).aClass142_Sub4Array2076[i],
				 ((Class172) this).aClass142_Sub4_2092);
			    if (i_9_ == i_8_ - 1 && i_4_ == i_5_ - 1) {
				((Class172) this).aClass103_Sub1_2096
				    .method2245
				    ((((Class172) this)
				      .aClass105_Sub2_Sub1_2077),
				     -233963923);
				((Class172) this).aClass103_Sub1_2096
				    .method15138(0, 0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2088,
						  ((Class172) this).anInt2081);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2088,
						  (((Class172) this).anInt2081
						   + (((Class172) this)
						      .anInt2083)));
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    0.0F);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i((((Class172) this).anInt2088
						   + (((Class172) this)
						      .anInt2082)),
						  (((Class172) this).anInt2081
						   + (((Class172) this)
						      .anInt2083)));
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i((((Class172) this).anInt2088
						   + (((Class172) this)
						      .anInt2082)),
						  ((Class172) this).anInt2081);
				OpenGL.glEnd();
			    } else {
				((Class172) this).aClass105_Sub2_Sub1_2077
				    .method16915(i_3_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(0,
						  ((Class172) this).anInt2083);
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    0.0F);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2082,
						  ((Class172) this).anInt2083);
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2082,
						  0);
				OpenGL.glEnd();
			    }
			    class241_sub35.method16385(i_9_);
			    i_3_ = i_3_ + 1 & 0x1;
			    i = i + 1 & 0x1;
			}
			i_4_++;
		    }
		}
		i_6_++;
	    }
	    ((Class172) this).aBool2084 = false;
	    object = null;
	}
    }
    
    void method3696(Class241_Sub35 class241_sub35) {
	((Class241_Sub35) class241_sub35).aBool10089 = false;
	class241_sub35.method16376();
	class241_sub35.remove((byte) 36);
	method3697();
    }
    
    void method3697() {
	int i = 0;
	boolean bool = false;
	Class102 class102 = Class102.aClass102_1440;
	for (Class241_Sub35 class241_sub35
		 = ((Class241_Sub35)
		    ((Class172) this).aClass429_2089.method7694(16711935));
	     class241_sub35 != null;
	     class241_sub35 = (Class241_Sub35) ((Class172) this)
						   .aClass429_2089
						   .method7692(30692149)) {
	    Class102 class102_10_ = class241_sub35.method16379();
	    if (class102_10_.anInt1447 * -387243519
		> class102.anInt1447 * -387243519)
		class102 = class102_10_;
	    bool |= class241_sub35.method16382();
	    i += class241_sub35.method16380();
	}
	if (class102 != ((Class172) this).aClass102_2094) {
	    ((Class172) this).aClass102_2094 = class102;
	    ((Class172) this).aBool2086 = true;
	}
	int i_11_ = (((Class172) this).anInt2090 > 2 ? 2
		     : ((Class172) this).anInt2090);
	int i_12_ = i > 2 ? 2 : i;
	if (i_11_ != i_12_) {
	    ((Class172) this).aBool2086 = true;
	    ((Class172) this).aBool2095 = true;
	}
	if (bool != ((Class172) this).aBool2085) {
	    ((Class172) this).aBool2085 = bool;
	    ((Class172) this).aBool2087 = true;
	}
	((Class172) this).anInt2090 = i;
    }
    
    void method3698() {
	((Class172) this).aClass105_Sub2_Sub1_2077 = null;
	((Class172) this).aClass105_Sub2_Sub1_2078 = null;
	((Class172) this).aClass105_Sub2_Sub1_2079 = null;
	((Class172) this).aClass241_Sub39_Sub18_2093 = null;
	((Class172) this).aClass142_Sub4_2092 = null;
	((Class172) this).aClass142_Sub4Array2076 = null;
	((Class172) this).aClass241_Sub39_Sub18_2091 = null;
	if (!((Class172) this).aClass429_2089.isEmpty(-962253298)) {
	    for (Node class241
		     = ((Class172) this).aClass429_2089.method7694(16711935);
		 class241 != ((Class172) this).aClass429_2089.aClass241_6093;
		 class241 = class241.previousNode)
		((Class241_Sub35) class241).method16376();
	}
	((Class172) this).anInt2083 = 1;
	((Class172) this).anInt2082 = 1;
    }
    
    boolean method3699() {
	return ((Class172) this).aClass105_Sub2_Sub1_2079 != null;
    }
    
    boolean method3700(Class241_Sub35 class241_sub35) {
	if (((Class172) this).aClass105_Sub2_Sub1_2079 != null) {
	    if (class241_sub35.method16401() || class241_sub35.method16392()) {
		((Class172) this).aClass429_2089.addNode(class241_sub35,
							    (short) -27678);
		method3697();
		if (class241_sub35.method16381() >= 0 && method3692()) {
		    if (((Class172) this).anInt2082 != -1
			&& ((Class172) this).anInt2083 != -1)
			class241_sub35.method16377(((Class172) this).anInt2082,
						   (((Class172) this)
						    .anInt2083));
		    ((Class241_Sub35) class241_sub35).aBool10089 = true;
		    return true;
		}
	    }
	    method3696(class241_sub35);
	}
	return false;
    }
    
    boolean method3701() {
	return ((Class172) this).aBool2084;
    }
    
    boolean method3702() {
	for (Class241_Sub35 class241_sub35
		 = ((Class241_Sub35)
		    ((Class172) this).aClass429_2089.method7694(16711935));
	     class241_sub35 != null;
	     class241_sub35 = (Class241_Sub35) ((Class172) this)
						   .aClass429_2089
						   .method7692(264574615)) {
	    if (!class241_sub35.method16374())
		return false;
	}
	return true;
    }
    
    boolean method3703() {
	for (Class241_Sub35 class241_sub35
		 = ((Class241_Sub35)
		    ((Class172) this).aClass429_2089.method7694(16711935));
	     class241_sub35 != null;
	     class241_sub35 = (Class241_Sub35) ((Class172) this)
						   .aClass429_2089
						   .method7692(-494766920)) {
	    if (!class241_sub35.method16374())
		return false;
	}
	return true;
    }
    
    boolean method3704() {
	if (((Class172) this).aBool2087) {
	    if (((Class172) this).aClass241_Sub39_Sub18_2093 != null) {
		((Class172) this).aClass241_Sub39_Sub18_2093.method28();
		((Class172) this).aClass241_Sub39_Sub18_2093 = null;
	    }
	    if (((Class172) this).aClass142_Sub4_2092 != null) {
		((Class172) this).aClass142_Sub4_2092.method3176();
		((Class172) this).aClass142_Sub4_2092 = null;
	    }
	}
	if (((Class172) this).aBool2086) {
	    if (((Class172) this).aClass241_Sub39_Sub18_2091 != null) {
		((Class172) this).aClass241_Sub39_Sub18_2091.method28();
		((Class172) this).aClass241_Sub39_Sub18_2091 = null;
	    }
	    if (((Class172) this).aClass142_Sub4Array2076[0] != null) {
		((Class172) this).aClass142_Sub4Array2076[0].method3176();
		((Class172) this).aClass142_Sub4Array2076[0] = null;
	    }
	    if (((Class172) this).aClass142_Sub4Array2076[1] != null) {
		((Class172) this).aClass142_Sub4Array2076[1].method3176();
		((Class172) this).aClass142_Sub4Array2076[1] = null;
	    }
	}
	if (((Class172) this).aBool2087) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null)
		((Class172) this).aClass241_Sub39_Sub18_2093
		    = new Class241_Sub39_Sub18((((Class172) this)
						.aClass103_Sub1_2096),
					       Class175.aClass175_2115,
					       Class102.aClass102_1437,
					       ((Class172) this).anInt2082,
					       ((Class172) this).anInt2083,
					       (((Class103_Sub1)
						 (((Class172) this)
						  .aClass103_Sub1_2096))
						.anInt9079));
	    if (((Class172) this).aBool2085)
		((Class172) this).aClass142_Sub4_2092
		    = new Class142_Sub4(((Class172) this).aClass103_Sub1_2096,
					34037, Class175.aClass175_2115,
					Class102.aClass102_1437,
					((Class172) this).anInt2082,
					((Class172) this).anInt2083);
	    else if (((Class172) this).aClass241_Sub39_Sub18_2093 == null)
		((Class172) this).aClass241_Sub39_Sub18_2093
		    = new Class241_Sub39_Sub18((((Class172) this)
						.aClass103_Sub1_2096),
					       Class175.aClass175_2115,
					       Class102.aClass102_1437,
					       ((Class172) this).anInt2082,
					       ((Class172) this).anInt2083);
	    ((Class172) this).aBool2087 = false;
	    ((Class172) this).aBool2095 = true;
	    ((Class172) this).aBool2080 = true;
	}
	if (((Class172) this).aBool2086) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null)
		((Class172) this).aClass241_Sub39_Sub18_2091
		    = (new Class241_Sub39_Sub18
		       (((Class172) this).aClass103_Sub1_2096,
			Class175.aClass175_2110,
			((Class172) this).aClass102_2094,
			((Class172) this).anInt2082,
			((Class172) this).anInt2083,
			((Class103_Sub1)
			 ((Class172) this).aClass103_Sub1_2096).anInt9079));
	    ((Class172) this).aClass142_Sub4Array2076[0]
		= new Class142_Sub4(((Class172) this).aClass103_Sub1_2096,
				    34037, Class175.aClass175_2110,
				    ((Class172) this).aClass102_2094,
				    ((Class172) this).anInt2082,
				    ((Class172) this).anInt2083);
	    ((Class172) this).aClass142_Sub4Array2076[1]
		= (((Class172) this).anInt2090 > 1
		   ? new Class142_Sub4(((Class172) this).aClass103_Sub1_2096,
				       34037, Class175.aClass175_2110,
				       ((Class172) this).aClass102_2094,
				       ((Class172) this).anInt2082,
				       ((Class172) this).anInt2083)
		   : null);
	    ((Class172) this).aBool2086 = false;
	    ((Class172) this).aBool2095 = true;
	    ((Class172) this).aBool2080 = true;
	}
	if (((Class172) this).aBool2095) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null) {
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15584(null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(0,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(1,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (0, ((Class172) this).aClass142_Sub4Array2076[0]
			    .method16902(0));
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (1, (((Class172) this).anInt2090 > 1
			 ? ((Class172) this).aClass142_Sub4Array2076[1]
			       .method16902(0)
			 : null));
		if (((Class172) this).aBool2085)
		    ((Class172) this).aClass105_Sub2_Sub1_2077.method15584
			(((Class172) this).aClass142_Sub4_2092.method16909(0));
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -2029589319);
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2078, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15584(null);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15585(0,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15585
		    (0, ((Class172) this).aClass241_Sub39_Sub18_2091);
		((Class172) this).aClass105_Sub2_Sub1_2078
		    .method15584(((Class172) this).aClass241_Sub39_Sub18_2093);
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2078, 949155102);
	    } else {
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15584(null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(0,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(1,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (0, ((Class172) this).aClass142_Sub4Array2076[0]
			    .method16902(0));
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (1, (((Class172) this).anInt2090 > 1
			 ? ((Class172) this).aClass142_Sub4Array2076[1]
			       .method16902(0)
			 : null));
		if (((Class172) this).aBool2085)
		    ((Class172) this).aClass105_Sub2_Sub1_2077.method15584
			(((Class172) this).aClass142_Sub4_2092.method16909(0));
		else
		    ((Class172) this).aClass105_Sub2_Sub1_2077.method15584
			(((Class172) this).aClass241_Sub39_Sub18_2093);
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -578893641);
	    }
	    ((Class172) this).aBool2095 = false;
	    ((Class172) this).aBool2080 = true;
	}
	if (((Class172) this).aBool2080) {
	    ((Class172) this).aClass103_Sub1_2096.method2244
		(((Class172) this).aClass105_Sub2_Sub1_2079, -519163929);
	    ((Class172) this).aBool2080
		= !((Class172) this).aClass105_Sub2_Sub1_2079.method15586();
	    ((Class172) this).aClass103_Sub1_2096.method2245
		(((Class172) this).aClass105_Sub2_Sub1_2079, -667994491);
	}
	return !((Class172) this).aBool2080;
    }
    
    boolean method3705() {
	if (((Class172) this).aBool2087) {
	    if (((Class172) this).aClass241_Sub39_Sub18_2093 != null) {
		((Class172) this).aClass241_Sub39_Sub18_2093.method28();
		((Class172) this).aClass241_Sub39_Sub18_2093 = null;
	    }
	    if (((Class172) this).aClass142_Sub4_2092 != null) {
		((Class172) this).aClass142_Sub4_2092.method3176();
		((Class172) this).aClass142_Sub4_2092 = null;
	    }
	}
	if (((Class172) this).aBool2086) {
	    if (((Class172) this).aClass241_Sub39_Sub18_2091 != null) {
		((Class172) this).aClass241_Sub39_Sub18_2091.method28();
		((Class172) this).aClass241_Sub39_Sub18_2091 = null;
	    }
	    if (((Class172) this).aClass142_Sub4Array2076[0] != null) {
		((Class172) this).aClass142_Sub4Array2076[0].method3176();
		((Class172) this).aClass142_Sub4Array2076[0] = null;
	    }
	    if (((Class172) this).aClass142_Sub4Array2076[1] != null) {
		((Class172) this).aClass142_Sub4Array2076[1].method3176();
		((Class172) this).aClass142_Sub4Array2076[1] = null;
	    }
	}
	if (((Class172) this).aBool2087) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null)
		((Class172) this).aClass241_Sub39_Sub18_2093
		    = new Class241_Sub39_Sub18((((Class172) this)
						.aClass103_Sub1_2096),
					       Class175.aClass175_2115,
					       Class102.aClass102_1437,
					       ((Class172) this).anInt2082,
					       ((Class172) this).anInt2083,
					       (((Class103_Sub1)
						 (((Class172) this)
						  .aClass103_Sub1_2096))
						.anInt9079));
	    if (((Class172) this).aBool2085)
		((Class172) this).aClass142_Sub4_2092
		    = new Class142_Sub4(((Class172) this).aClass103_Sub1_2096,
					34037, Class175.aClass175_2115,
					Class102.aClass102_1437,
					((Class172) this).anInt2082,
					((Class172) this).anInt2083);
	    else if (((Class172) this).aClass241_Sub39_Sub18_2093 == null)
		((Class172) this).aClass241_Sub39_Sub18_2093
		    = new Class241_Sub39_Sub18((((Class172) this)
						.aClass103_Sub1_2096),
					       Class175.aClass175_2115,
					       Class102.aClass102_1437,
					       ((Class172) this).anInt2082,
					       ((Class172) this).anInt2083);
	    ((Class172) this).aBool2087 = false;
	    ((Class172) this).aBool2095 = true;
	    ((Class172) this).aBool2080 = true;
	}
	if (((Class172) this).aBool2086) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null)
		((Class172) this).aClass241_Sub39_Sub18_2091
		    = (new Class241_Sub39_Sub18
		       (((Class172) this).aClass103_Sub1_2096,
			Class175.aClass175_2110,
			((Class172) this).aClass102_2094,
			((Class172) this).anInt2082,
			((Class172) this).anInt2083,
			((Class103_Sub1)
			 ((Class172) this).aClass103_Sub1_2096).anInt9079));
	    ((Class172) this).aClass142_Sub4Array2076[0]
		= new Class142_Sub4(((Class172) this).aClass103_Sub1_2096,
				    34037, Class175.aClass175_2110,
				    ((Class172) this).aClass102_2094,
				    ((Class172) this).anInt2082,
				    ((Class172) this).anInt2083);
	    ((Class172) this).aClass142_Sub4Array2076[1]
		= (((Class172) this).anInt2090 > 1
		   ? new Class142_Sub4(((Class172) this).aClass103_Sub1_2096,
				       34037, Class175.aClass175_2110,
				       ((Class172) this).aClass102_2094,
				       ((Class172) this).anInt2082,
				       ((Class172) this).anInt2083)
		   : null);
	    ((Class172) this).aBool2086 = false;
	    ((Class172) this).aBool2095 = true;
	    ((Class172) this).aBool2080 = true;
	}
	if (((Class172) this).aBool2095) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null) {
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15584(null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(0,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(1,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (0, ((Class172) this).aClass142_Sub4Array2076[0]
			    .method16902(0));
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (1, (((Class172) this).anInt2090 > 1
			 ? ((Class172) this).aClass142_Sub4Array2076[1]
			       .method16902(0)
			 : null));
		if (((Class172) this).aBool2085)
		    ((Class172) this).aClass105_Sub2_Sub1_2077.method15584
			(((Class172) this).aClass142_Sub4_2092.method16909(0));
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -2029110396);
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2078, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15584(null);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15585(0,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15585
		    (0, ((Class172) this).aClass241_Sub39_Sub18_2091);
		((Class172) this).aClass105_Sub2_Sub1_2078
		    .method15584(((Class172) this).aClass241_Sub39_Sub18_2093);
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2078, 1061287484);
	    } else {
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15584(null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(0,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585(1,
								       null);
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (0, ((Class172) this).aClass142_Sub4Array2076[0]
			    .method16902(0));
		((Class172) this).aClass105_Sub2_Sub1_2077.method15585
		    (1, (((Class172) this).anInt2090 > 1
			 ? ((Class172) this).aClass142_Sub4Array2076[1]
			       .method16902(0)
			 : null));
		if (((Class172) this).aBool2085)
		    ((Class172) this).aClass105_Sub2_Sub1_2077.method15584
			(((Class172) this).aClass142_Sub4_2092.method16909(0));
		else
		    ((Class172) this).aClass105_Sub2_Sub1_2077.method15584
			(((Class172) this).aClass241_Sub39_Sub18_2093);
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -1031130219);
	    }
	    ((Class172) this).aBool2095 = false;
	    ((Class172) this).aBool2080 = true;
	}
	if (((Class172) this).aBool2080) {
	    ((Class172) this).aClass103_Sub1_2096.method2244
		(((Class172) this).aClass105_Sub2_Sub1_2079, -519163929);
	    ((Class172) this).aBool2080
		= !((Class172) this).aClass105_Sub2_Sub1_2079.method15586();
	    ((Class172) this).aClass103_Sub1_2096.method2245
		(((Class172) this).aClass105_Sub2_Sub1_2079, 132600031);
	}
	return !((Class172) this).aBool2080;
    }
    
    boolean method3706() {
	for (Class241_Sub35 class241_sub35
		 = ((Class241_Sub35)
		    ((Class172) this).aClass429_2089.method7694(16711935));
	     class241_sub35 != null;
	     class241_sub35 = (Class241_Sub35) ((Class172) this)
						   .aClass429_2089
						   .method7692(1835314506)) {
	    if (!class241_sub35.method16374())
		return false;
	}
	return true;
    }
    
    boolean method3707(int i, int i_13_, int i_14_, int i_15_) {
	if (((Class172) this).aClass105_Sub2_Sub1_2079 == null
	    || ((Class172) this).aClass429_2089.isEmpty(-302296918)
	    || method3706())
	    return false;
	if (((Class172) this).anInt2082 != i_14_
	    || ((Class172) this).anInt2083 != i_15_) {
	    ((Class172) this).anInt2082 = i_14_;
	    ((Class172) this).anInt2083 = i_15_;
	    for (Node class241
		     = ((Class172) this).aClass429_2089.method7694(16711935);
		 class241 != ((Class172) this).aClass429_2089.aClass241_6093;
		 class241 = class241.previousNode)
		((Class241_Sub35) class241).method16377((((Class172) this)
							 .anInt2082),
							(((Class172) this)
							 .anInt2083));
	    ((Class172) this).aBool2086 = true;
	    ((Class172) this).aBool2087 = true;
	    ((Class172) this).aBool2095 = true;
	}
	if (method3692()) {
	    ((Class172) this).anInt2088 = i;
	    ((Class172) this).anInt2081 = i_13_;
	    ((Class172) this).aBool2084 = true;
	    ((Class172) this).aClass103_Sub1_2096.method15138
		(-((Class172) this).anInt2088,
		 (((Class172) this).anInt2083 + ((Class172) this).anInt2081
		  - ((Class172) this).aClass103_Sub1_2096.method2237
			((byte) 4).method2654()));
	    ((Class172) this).aClass103_Sub1_2096.method2244
		(((Class172) this).aClass105_Sub2_Sub1_2079, -519163929);
	    ((Class172) this).aClass103_Sub1_2096.method2450(3, 0);
	    ((Class172) this).aClass105_Sub2_Sub1_2079.method16915(0);
	    return true;
	}
	return false;
    }
    
    void method3708() {
	if (((Class172) this).aBool2084) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null) {
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2078, -1505979101);
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2077.method16915(0);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15587
		    (0, 0, ((Class172) this).anInt2082,
		     ((Class172) this).anInt2083, 0, 0, true,
		     ((Class172) this).aBool2085);
	    }
	    ((Class172) this).aClass103_Sub1_2096.method15171();
	    ((Class172) this).aClass103_Sub1_2096.method15192(0);
	    ((Class172) this).aClass103_Sub1_2096.method15178(1);
	    ((Class172) this).aClass103_Sub1_2096.method2572();
	    int i = 0;
	    int i_16_ = 1;
	    int i_17_ = 0;
	    int i_18_ = 0;
	    int i_19_ = 0;
	    Object object = null;
	    for (Class241_Sub35 class241_sub35
		     = ((Class241_Sub35)
			((Class172) this).aClass429_2089.method7694(16711935));
		 class241_sub35 != null;
		 class241_sub35
		     = (Class241_Sub35) ((Class172) this).aClass429_2089
					    .method7692(1651767686)) {
		if (!class241_sub35.method16374())
		    i_18_++;
	    }
	    Class241_Sub35[] class241_sub35s = new Class241_Sub35[i_18_];
	    i_18_ = 0;
	    for (Class241_Sub35 class241_sub35
		     = ((Class241_Sub35)
			((Class172) this).aClass429_2089.method7694(16711935));
		 class241_sub35 != null;
		 class241_sub35
		     = (Class241_Sub35) ((Class172) this).aClass429_2089
					    .method7692(-190224406)) {
		if (!class241_sub35.method16374())
		    class241_sub35s[i_18_++] = class241_sub35;
	    }
	    while (i_17_ < i_18_) {
		for (int i_20_ = 0; i_20_ < i_18_; i_20_++) {
		    Class241_Sub35 class241_sub35 = class241_sub35s[i_20_];
		    if (class241_sub35.method16381() == i_19_) {
			int i_21_ = class241_sub35.method16380();
			for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
			    class241_sub35.method16378
				(i_22_,
				 ((Class172) this).aClass142_Sub4Array2076[i],
				 ((Class172) this).aClass142_Sub4_2092);
			    if (i_22_ == i_21_ - 1 && i_17_ == i_18_ - 1) {
				((Class172) this).aClass103_Sub1_2096
				    .method2245
				    ((((Class172) this)
				      .aClass105_Sub2_Sub1_2077),
				     -1109427418);
				((Class172) this).aClass103_Sub1_2096
				    .method15138(0, 0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2088,
						  ((Class172) this).anInt2081);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2088,
						  (((Class172) this).anInt2081
						   + (((Class172) this)
						      .anInt2083)));
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    0.0F);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i((((Class172) this).anInt2088
						   + (((Class172) this)
						      .anInt2082)),
						  (((Class172) this).anInt2081
						   + (((Class172) this)
						      .anInt2083)));
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i((((Class172) this).anInt2088
						   + (((Class172) this)
						      .anInt2082)),
						  ((Class172) this).anInt2081);
				OpenGL.glEnd();
			    } else {
				((Class172) this).aClass105_Sub2_Sub1_2077
				    .method16915(i_16_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(0,
						  ((Class172) this).anInt2083);
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    0.0F);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2082,
						  ((Class172) this).anInt2083);
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2082,
						  0);
				OpenGL.glEnd();
			    }
			    class241_sub35.method16385(i_22_);
			    i_16_ = i_16_ + 1 & 0x1;
			    i = i + 1 & 0x1;
			}
			i_17_++;
		    }
		}
		i_19_++;
	    }
	    ((Class172) this).aBool2084 = false;
	    object = null;
	}
    }
    
    void method3709() {
	if (((Class172) this).aBool2084) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null) {
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2078, -1737469264);
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2077.method16915(0);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15587
		    (0, 0, ((Class172) this).anInt2082,
		     ((Class172) this).anInt2083, 0, 0, true,
		     ((Class172) this).aBool2085);
	    }
	    ((Class172) this).aClass103_Sub1_2096.method15171();
	    ((Class172) this).aClass103_Sub1_2096.method15192(0);
	    ((Class172) this).aClass103_Sub1_2096.method15178(1);
	    ((Class172) this).aClass103_Sub1_2096.method2572();
	    int i = 0;
	    int i_23_ = 1;
	    int i_24_ = 0;
	    int i_25_ = 0;
	    int i_26_ = 0;
	    Object object = null;
	    for (Class241_Sub35 class241_sub35
		     = ((Class241_Sub35)
			((Class172) this).aClass429_2089.method7694(16711935));
		 class241_sub35 != null;
		 class241_sub35
		     = (Class241_Sub35) ((Class172) this).aClass429_2089
					    .method7692(672789442)) {
		if (!class241_sub35.method16374())
		    i_25_++;
	    }
	    Class241_Sub35[] class241_sub35s = new Class241_Sub35[i_25_];
	    i_25_ = 0;
	    for (Class241_Sub35 class241_sub35
		     = ((Class241_Sub35)
			((Class172) this).aClass429_2089.method7694(16711935));
		 class241_sub35 != null;
		 class241_sub35
		     = (Class241_Sub35) ((Class172) this).aClass429_2089
					    .method7692(1485987569)) {
		if (!class241_sub35.method16374())
		    class241_sub35s[i_25_++] = class241_sub35;
	    }
	    while (i_24_ < i_25_) {
		for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
		    Class241_Sub35 class241_sub35 = class241_sub35s[i_27_];
		    if (class241_sub35.method16381() == i_26_) {
			int i_28_ = class241_sub35.method16380();
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
			    class241_sub35.method16378
				(i_29_,
				 ((Class172) this).aClass142_Sub4Array2076[i],
				 ((Class172) this).aClass142_Sub4_2092);
			    if (i_29_ == i_28_ - 1 && i_24_ == i_25_ - 1) {
				((Class172) this).aClass103_Sub1_2096
				    .method2245
				    ((((Class172) this)
				      .aClass105_Sub2_Sub1_2077),
				     -629473198);
				((Class172) this).aClass103_Sub1_2096
				    .method15138(0, 0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2088,
						  ((Class172) this).anInt2081);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2088,
						  (((Class172) this).anInt2081
						   + (((Class172) this)
						      .anInt2083)));
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    0.0F);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i((((Class172) this).anInt2088
						   + (((Class172) this)
						      .anInt2082)),
						  (((Class172) this).anInt2081
						   + (((Class172) this)
						      .anInt2083)));
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i((((Class172) this).anInt2088
						   + (((Class172) this)
						      .anInt2082)),
						  ((Class172) this).anInt2081);
				OpenGL.glEnd();
			    } else {
				((Class172) this).aClass105_Sub2_Sub1_2077
				    .method16915(i_23_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(0,
						  ((Class172) this).anInt2083);
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    0.0F);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2082,
						  ((Class172) this).anInt2083);
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2082,
						  0);
				OpenGL.glEnd();
			    }
			    class241_sub35.method16385(i_29_);
			    i_23_ = i_23_ + 1 & 0x1;
			    i = i + 1 & 0x1;
			}
			i_24_++;
		    }
		}
		i_26_++;
	    }
	    ((Class172) this).aBool2084 = false;
	    object = null;
	}
    }
    
    void method3710() {
	if (((Class172) this).aBool2084) {
	    if (((Class172) this).aClass105_Sub2_Sub1_2078 != null) {
		((Class172) this).aClass103_Sub1_2096.method2245
		    (((Class172) this).aClass105_Sub2_Sub1_2078, -32737976);
		((Class172) this).aClass103_Sub1_2096.method2244
		    (((Class172) this).aClass105_Sub2_Sub1_2077, -519163929);
		((Class172) this).aClass105_Sub2_Sub1_2077.method16915(0);
		((Class172) this).aClass105_Sub2_Sub1_2078.method15587
		    (0, 0, ((Class172) this).anInt2082,
		     ((Class172) this).anInt2083, 0, 0, true,
		     ((Class172) this).aBool2085);
	    }
	    ((Class172) this).aClass103_Sub1_2096.method15171();
	    ((Class172) this).aClass103_Sub1_2096.method15192(0);
	    ((Class172) this).aClass103_Sub1_2096.method15178(1);
	    ((Class172) this).aClass103_Sub1_2096.method2572();
	    int i = 0;
	    int i_30_ = 1;
	    int i_31_ = 0;
	    int i_32_ = 0;
	    int i_33_ = 0;
	    Object object = null;
	    for (Class241_Sub35 class241_sub35
		     = ((Class241_Sub35)
			((Class172) this).aClass429_2089.method7694(16711935));
		 class241_sub35 != null;
		 class241_sub35
		     = (Class241_Sub35) ((Class172) this).aClass429_2089
					    .method7692(-329799215)) {
		if (!class241_sub35.method16374())
		    i_32_++;
	    }
	    Class241_Sub35[] class241_sub35s = new Class241_Sub35[i_32_];
	    i_32_ = 0;
	    for (Class241_Sub35 class241_sub35
		     = ((Class241_Sub35)
			((Class172) this).aClass429_2089.method7694(16711935));
		 class241_sub35 != null;
		 class241_sub35
		     = (Class241_Sub35) ((Class172) this).aClass429_2089
					    .method7692(-141535459)) {
		if (!class241_sub35.method16374())
		    class241_sub35s[i_32_++] = class241_sub35;
	    }
	    while (i_31_ < i_32_) {
		for (int i_34_ = 0; i_34_ < i_32_; i_34_++) {
		    Class241_Sub35 class241_sub35 = class241_sub35s[i_34_];
		    if (class241_sub35.method16381() == i_33_) {
			int i_35_ = class241_sub35.method16380();
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
			    class241_sub35.method16378
				(i_36_,
				 ((Class172) this).aClass142_Sub4Array2076[i],
				 ((Class172) this).aClass142_Sub4_2092);
			    if (i_36_ == i_35_ - 1 && i_31_ == i_32_ - 1) {
				((Class172) this).aClass103_Sub1_2096
				    .method2245
				    ((((Class172) this)
				      .aClass105_Sub2_Sub1_2077),
				     -873220731);
				((Class172) this).aClass103_Sub1_2096
				    .method15138(0, 0);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2088,
						  ((Class172) this).anInt2081);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2088,
						  (((Class172) this).anInt2081
						   + (((Class172) this)
						      .anInt2083)));
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    0.0F);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i((((Class172) this).anInt2088
						   + (((Class172) this)
						      .anInt2082)),
						  (((Class172) this).anInt2081
						   + (((Class172) this)
						      .anInt2083)));
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i((((Class172) this).anInt2088
						   + (((Class172) this)
						      .anInt2082)),
						  ((Class172) this).anInt2081);
				OpenGL.glEnd();
			    } else {
				((Class172) this).aClass105_Sub2_Sub1_2077
				    .method16915(i_30_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F,
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glVertex2i(0,
						  ((Class172) this).anInt2083);
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    0.0F);
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2082,
						  ((Class172) this).anInt2083);
				OpenGL.glTexCoord2f((float) (((Class172) this)
							     .anInt2082),
						    (float) (((Class172) this)
							     .anInt2083));
				OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
				OpenGL.glVertex2i(((Class172) this).anInt2082,
						  0);
				OpenGL.glEnd();
			    }
			    class241_sub35.method16385(i_36_);
			    i_30_ = i_30_ + 1 & 0x1;
			    i = i + 1 & 0x1;
			}
			i_31_++;
		    }
		}
		i_33_++;
	    }
	    ((Class172) this).aBool2084 = false;
	    object = null;
	}
    }
    
    boolean method3711(int i, int i_37_, int i_38_, int i_39_) {
	if (((Class172) this).aClass105_Sub2_Sub1_2079 == null
	    || ((Class172) this).aClass429_2089.isEmpty(1672525629)
	    || method3706())
	    return false;
	if (((Class172) this).anInt2082 != i_38_
	    || ((Class172) this).anInt2083 != i_39_) {
	    ((Class172) this).anInt2082 = i_38_;
	    ((Class172) this).anInt2083 = i_39_;
	    for (Node class241
		     = ((Class172) this).aClass429_2089.method7694(16711935);
		 class241 != ((Class172) this).aClass429_2089.aClass241_6093;
		 class241 = class241.previousNode)
		((Class241_Sub35) class241).method16377((((Class172) this)
							 .anInt2082),
							(((Class172) this)
							 .anInt2083));
	    ((Class172) this).aBool2086 = true;
	    ((Class172) this).aBool2087 = true;
	    ((Class172) this).aBool2095 = true;
	}
	if (method3692()) {
	    ((Class172) this).anInt2088 = i;
	    ((Class172) this).anInt2081 = i_37_;
	    ((Class172) this).aBool2084 = true;
	    ((Class172) this).aClass103_Sub1_2096.method15138
		(-((Class172) this).anInt2088,
		 (((Class172) this).anInt2083 + ((Class172) this).anInt2081
		  - ((Class172) this).aClass103_Sub1_2096.method2237
			((byte) 4).method2654()));
	    ((Class172) this).aClass103_Sub1_2096.method2244
		(((Class172) this).aClass105_Sub2_Sub1_2079, -519163929);
	    ((Class172) this).aClass103_Sub1_2096.method2450(3, 0);
	    ((Class172) this).aClass105_Sub2_Sub1_2079.method16915(0);
	    return true;
	}
	return false;
    }
    
    boolean method3712(Class241_Sub35 class241_sub35) {
	if (((Class172) this).aClass105_Sub2_Sub1_2079 != null) {
	    if (class241_sub35.method16401() || class241_sub35.method16392()) {
		((Class172) this).aClass429_2089.addNode(class241_sub35,
							    (short) -5748);
		method3697();
		if (class241_sub35.method16381() >= 0 && method3692()) {
		    if (((Class172) this).anInt2082 != -1
			&& ((Class172) this).anInt2083 != -1)
			class241_sub35.method16377(((Class172) this).anInt2082,
						   (((Class172) this)
						    .anInt2083));
		    ((Class241_Sub35) class241_sub35).aBool10089 = true;
		    return true;
		}
	    }
	    method3696(class241_sub35);
	}
	return false;
    }
    
    Class172(Class103_Sub1 class103_sub1) {
	((Class172) this).anInt2081 = 0;
	((Class172) this).anInt2082 = 1;
	((Class172) this).anInt2083 = 1;
	((Class172) this).aClass429_2089 = new NodeCollection();
	((Class172) this).aBool2086 = true;
	((Class172) this).aBool2087 = true;
	((Class172) this).aBool2095 = true;
	((Class172) this).aBool2080 = true;
	((Class172) this).aClass142_Sub4Array2076 = new Class142_Sub4[2];
	((Class172) this).aBool2085 = false;
	((Class172) this).anInt2090 = 0;
	((Class172) this).aClass102_2094 = Class102.aClass102_1440;
	((Class172) this).aClass103_Sub1_2096 = class103_sub1;
	if (((Class103_Sub1) ((Class172) this).aClass103_Sub1_2096).aBool9201
	    && (((Class103_Sub1) ((Class172) this).aClass103_Sub1_2096)
		.aBool9211)) {
	    ((Class172) this).aClass105_Sub2_Sub1_2079
		= ((Class172) this).aClass105_Sub2_Sub1_2077
		= new Class105_Sub2_Sub1(((Class172) this)
					 .aClass103_Sub1_2096);
	    if ((((Class103_Sub1) ((Class172) this).aClass103_Sub1_2096)
		 .anInt9079) > 1
		&& (((Class103_Sub1) ((Class172) this).aClass103_Sub1_2096)
		    .aBool9224)
		&& (((Class103_Sub1) ((Class172) this).aClass103_Sub1_2096)
		    .aBool9142))
		((Class172) this).aClass105_Sub2_Sub1_2079
		    = ((Class172) this).aClass105_Sub2_Sub1_2078
		    = new Class105_Sub2_Sub1(((Class172) this)
					     .aClass103_Sub1_2096);
	}
    }
    
    void method3713() {
	((Class172) this).aClass105_Sub2_Sub1_2077 = null;
	((Class172) this).aClass105_Sub2_Sub1_2078 = null;
	((Class172) this).aClass105_Sub2_Sub1_2079 = null;
	((Class172) this).aClass241_Sub39_Sub18_2093 = null;
	((Class172) this).aClass142_Sub4_2092 = null;
	((Class172) this).aClass142_Sub4Array2076 = null;
	((Class172) this).aClass241_Sub39_Sub18_2091 = null;
	if (!((Class172) this).aClass429_2089.isEmpty(-782559683)) {
	    for (Node class241
		     = ((Class172) this).aClass429_2089.method7694(16711935);
		 class241 != ((Class172) this).aClass429_2089.aClass241_6093;
		 class241 = class241.previousNode)
		((Class241_Sub35) class241).method16376();
	}
	((Class172) this).anInt2083 = 1;
	((Class172) this).anInt2082 = 1;
    }
    
    boolean method3714(Class241_Sub35 class241_sub35) {
	if (((Class172) this).aClass105_Sub2_Sub1_2079 != null) {
	    if (class241_sub35.method16401() || class241_sub35.method16392()) {
		((Class172) this).aClass429_2089.addNode(class241_sub35,
							    (short) -9741);
		method3697();
		if (class241_sub35.method16381() >= 0 && method3692()) {
		    if (((Class172) this).anInt2082 != -1
			&& ((Class172) this).anInt2083 != -1)
			class241_sub35.method16377(((Class172) this).anInt2082,
						   (((Class172) this)
						    .anInt2083));
		    ((Class241_Sub35) class241_sub35).aBool10089 = true;
		    return true;
		}
	    }
	    method3696(class241_sub35);
	}
	return false;
    }
    
    void method3715() {
	int i = 0;
	boolean bool = false;
	Class102 class102 = Class102.aClass102_1440;
	for (Class241_Sub35 class241_sub35
		 = ((Class241_Sub35)
		    ((Class172) this).aClass429_2089.method7694(16711935));
	     class241_sub35 != null;
	     class241_sub35 = (Class241_Sub35) ((Class172) this)
						   .aClass429_2089
						   .method7692(1302472423)) {
	    Class102 class102_40_ = class241_sub35.method16379();
	    if (class102_40_.anInt1447 * -387243519
		> class102.anInt1447 * -387243519)
		class102 = class102_40_;
	    bool |= class241_sub35.method16382();
	    i += class241_sub35.method16380();
	}
	if (class102 != ((Class172) this).aClass102_2094) {
	    ((Class172) this).aClass102_2094 = class102;
	    ((Class172) this).aBool2086 = true;
	}
	int i_41_ = (((Class172) this).anInt2090 > 2 ? 2
		     : ((Class172) this).anInt2090);
	int i_42_ = i > 2 ? 2 : i;
	if (i_41_ != i_42_) {
	    ((Class172) this).aBool2086 = true;
	    ((Class172) this).aBool2095 = true;
	}
	if (bool != ((Class172) this).aBool2085) {
	    ((Class172) this).aBool2085 = bool;
	    ((Class172) this).aBool2087 = true;
	}
	((Class172) this).anInt2090 = i;
    }
}
