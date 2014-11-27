/* Class55_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

import jaggl.OpenGL;

public class Class55_Sub2 extends Class55
{
    Map aMap10543;
    String aString10544;
    static final int anInt10545 = 35633;
    Class103_Sub3_Sub2 aClass103_Sub3_Sub2_10546;
    Class116_Sub1 aClass116_Sub1_10547;
    int anInt10548 = 0;
    static float[] aFloatArray10549;
    int anInt10550;
    boolean aBool10551;
    int[] anIntArray10552;
    static final int anInt10553 = 35632;
    Map aMap10554;
    int anInt10555 = 0;
    static int[] anIntArray10556;
    Map aMap10557;
    Map aMap10558;
    Map aMap10559;
    static final int anInt10560 = 13;
    String aString10561;
    static boolean $assertionsDisabled
	= !Class55_Sub2.class.desiredAssertionStatus();
    
    void method1358(int i, Class268 class268) {
	OpenGL.glUniform2fv(i, 4, class268.method5259(aFloatArray10549), 0);
    }
    
    Class55_Sub2(Class103_Sub3_Sub2 class103_sub3_sub2, Class117 class117) {
	((Class55_Sub2) this).anInt10550 = 0;
	((Class55_Sub2) this).aBool10551 = false;
	((Class55_Sub2) this).anIntArray10552 = new int[13];
	((Class55_Sub2) this).aMap10554 = new HashMap();
	((Class55_Sub2) this).aMap10543 = new HashMap();
	((Class55_Sub2) this).aMap10557 = new HashMap();
	((Class55_Sub2) this).aMap10558 = new HashMap();
	((Class55_Sub2) this).aMap10559 = new HashMap();
	aString697 = class117.aString1551;
	StringBuilder stringbuilder = new StringBuilder();
	if (class117.aString1548 != null) {
	    aString695 = class117.aString1548;
	    if (class117.aClass46Array1550 != null) {
		Class46[] class46s = class117.aClass46Array1550;
		for (int i = 0; i < class46s.length; i++) {
		    Class46 class46 = class46s[i];
		    stringbuilder.append(new StringBuilder().append
					     ("#define ").append
					     (class46.aString623).append
					     (" ").append
					     (class46.aString624).append
					     ('\n').toString());
		}
	    }
	    stringbuilder.append(new String(class103_sub3_sub2
						.method17555(aString695)));
	    ((Class55_Sub2) this).aString10544 = stringbuilder.toString();
	}
	if (class117.aString1547 != null) {
	    aString696 = class117.aString1547;
	    stringbuilder.setLength(0);
	    if (class117.aClass46Array1549 != null) {
		Class46[] class46s = class117.aClass46Array1549;
		for (int i = 0; i < class46s.length; i++) {
		    Class46 class46 = class46s[i];
		    stringbuilder.append(new StringBuilder().append
					     ("#define ").append
					     (class46.aString623).append
					     (" ").append
					     (class46.aString624).append
					     ('\n').toString());
		}
	    }
	    stringbuilder.append(new String(class103_sub3_sub2
						.method17555(aString696)));
	    ((Class55_Sub2) this).aString10561 = stringbuilder.toString();
	}
	Class430.method7702(((Class55_Sub2) this).anIntArray10552, 0,
			    ((Class55_Sub2) this).anIntArray10552.length, -1);
    }
    
    void method1348(Class241_Sub23_Sub1 class241_sub23_sub1, int i,
		    Interface31 interface31) {
	int i_0_
	    = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i_0_ != -1) {
	    if (interface31 == null)
		interface31 = (((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
			       .anInterface41_9584);
	    if (i
		< ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.anInt9647) {
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.method15686(i);
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		    .method15856(interface31);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture((((Class226) (Class226) interface31)
				      .anInt2660),
				     (((Class226) (Class226) interface31)
				      .anInt2661));
	    }
	    if ((((Class55_Sub2) this).aMap10559.get(Integer.valueOf(i_0_))
		 == null)
		|| ((Integer)
		    ((Class55_Sub2) this).aMap10559.get(Integer.valueOf(i_0_)))
		       .intValue() != i) {
		((Class55_Sub2) this).aMap10559.put(Integer.valueOf(i_0_),
						    Integer.valueOf(i));
		OpenGL.glUniform1i(i_0_, i);
	    }
	}
    }
    
    void method1353(int i, float f, float f_1_, float f_2_, float f_3_) {
	OpenGL.glUniform4f(i, f, f_1_, f_2_, f_3_);
    }
    
    int method16789(int i, String string, String string_4_) {
	if (string == null)
	    return 0;
	int i_5_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_5_, string);
	OpenGL.glCompileShader(i_5_);
	OpenGL.glGetShaderiv(i_5_, 35713, anIntArray10556, 0);
	if (anIntArray10556[0] == 0) {
	    OpenGL.glDeleteShader(i_5_);
	    i_5_ = 0;
	}
	return i_5_;
    }
    
    void method1340(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_6_) {
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1) {
	    if (((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)) == null
		|| (((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i)))
		       .floatValue() != f_6_) {
		((Class55_Sub2) this).aMap10554.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class55_Sub2) this).aMap10543.put(Integer.valueOf(i),
						    Float.valueOf(f_6_));
		if (class241_sub23_sub1.method17405(-1118852902)
		    != Class38.aClass38_483)
		    throw new IllegalArgumentException_Sub1
			      (class241_sub23_sub1, "");
		OpenGL.glUniform2f(i, f, f_6_);
	    }
	}
    }
    
    void method1325(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_7_, float f_8_) {
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1) {
	    if (((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)) == null
		|| (((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i))
		    == null)
		|| (((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i)))
		       .floatValue() != f_7_
		|| ((Float)
		    ((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i)))
		       .floatValue() != f_8_) {
		((Class55_Sub2) this).aMap10554.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class55_Sub2) this).aMap10543.put(Integer.valueOf(i),
						    Float.valueOf(f_7_));
		((Class55_Sub2) this).aMap10557.put(Integer.valueOf(i),
						    Float.valueOf(f_8_));
		if (class241_sub23_sub1.method17405(581890455)
		    != Class38.aClass38_575)
		    throw new IllegalArgumentException_Sub1
			      (class241_sub23_sub1, "");
		OpenGL.glUniform3f(i, f, f_7_, f_8_);
	    }
	}
    }
    
    void method1349(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_9_, float f_10_, float f_11_) {
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1) {
	    if (((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)) == null
		|| (((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i))
		    == null)
		|| (((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i))
		    == null)
		|| (((Class55_Sub2) this).aMap10558.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i)))
		       .floatValue() != f_9_
		|| ((Float)
		    ((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i)))
		       .floatValue() != f_10_
		|| ((Float)
		    ((Class55_Sub2) this).aMap10558.get(Integer.valueOf(i)))
		       .floatValue() != f_11_) {
		((Class55_Sub2) this).aMap10554.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class55_Sub2) this).aMap10543.put(Integer.valueOf(i),
						    Float.valueOf(f_9_));
		((Class55_Sub2) this).aMap10557.put(Integer.valueOf(i),
						    Float.valueOf(f_10_));
		((Class55_Sub2) this).aMap10558.put(Integer.valueOf(i),
						    Float.valueOf(f_11_));
		if (class241_sub23_sub1.method17405(1138546426)
		    != Class38.aClass38_485)
		    throw new IllegalArgumentException_Sub1
			      (class241_sub23_sub1, "");
		OpenGL.glUniform4f(i, f, f_9_, f_10_, f_11_);
	    }
	}
    }
    
    void method1316(Class241_Sub23_Sub1 class241_sub23_sub1, float[] fs,
		    int i) {
	int i_12_
	    = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i_12_ != -1)
	    OpenGL.glUniform4fv(i_12_, i, fs, 0);
    }
    
    void method1365(int i, Class268 class268) {
	OpenGL.glUniform4fv(i, 4, class268.method5233(aFloatArray10549), 0);
    }
    
    void method1332(Class241_Sub23_Sub1 class241_sub23_sub1, float f) {
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1) {
	    if (((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)) == null
		|| ((Float)
		    ((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)))
		       .floatValue() != f) {
		((Class55_Sub2) this).aMap10554.put(Integer.valueOf(i),
						    Float.valueOf(f));
		if ((class241_sub23_sub1.method17405(-323045665)
		     != Class38.aClass38_482)
		    && (class241_sub23_sub1.method17405(894613323)
			!= Class38.aClass38_528))
		    throw new IllegalArgumentException_Sub1
			      (class241_sub23_sub1, "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method1319(Class241_Sub23_Sub1 class241_sub23_sub1, int i,
		    Interface31 interface31) {
	int i_13_
	    = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i_13_ != -1) {
	    if (interface31 == null)
		interface31 = (((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
			       .anInterface41_9584);
	    if (i
		< ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.anInt9647) {
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.method15686(i);
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		    .method15856(interface31);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture((((Class226) (Class226) interface31)
				      .anInt2660),
				     (((Class226) (Class226) interface31)
				      .anInt2661));
	    }
	    if ((((Class55_Sub2) this).aMap10559.get(Integer.valueOf(i_13_))
		 == null)
		|| ((Integer) ((Class55_Sub2) this).aMap10559
				  .get(Integer.valueOf(i_13_)))
		       .intValue() != i) {
		((Class55_Sub2) this).aMap10559.put(Integer.valueOf(i_13_),
						    Integer.valueOf(i));
		OpenGL.glUniform1i(i_13_, i);
	    }
	}
    }
    
    void method1326(int i, float f, float f_14_, float f_15_) {
	OpenGL.glUniform3f(i, f, f_14_, f_15_);
    }
    
    void method1329(int i, float f, float f_16_, float f_17_, float f_18_) {
	OpenGL.glUniform4f(i, f, f_16_, f_17_, f_18_);
    }
    
    void method1322(int i, float[] fs, int i_19_) {
	OpenGL.glUniform4fv(i, i_19_, fs, 0);
    }
    
    void method1323(int i, Class268 class268) {
	OpenGL.glUniform3fv(i, 3, class268.method5228(aFloatArray10549), 0);
    }
    
    void method1338(int i, Class268 class268) {
	OpenGL.glUniform2fv(i, 4, class268.method5259(aFloatArray10549), 0);
    }
    
    void method1324(int i, Class268 class268) {
	OpenGL.glUniform4fv(i, 4, class268.method5233(aFloatArray10549), 0);
    }
    
    void method1334(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_20_) {
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1) {
	    if (((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)) == null
		|| (((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i)))
		       .floatValue() != f_20_) {
		((Class55_Sub2) this).aMap10554.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class55_Sub2) this).aMap10543.put(Integer.valueOf(i),
						    Float.valueOf(f_20_));
		if (class241_sub23_sub1.method17405(208925154)
		    != Class38.aClass38_483)
		    throw new IllegalArgumentException_Sub1
			      (class241_sub23_sub1, "");
		OpenGL.glUniform2f(i, f, f_20_);
	    }
	}
    }
    
    public void method28() {
	if (((Class55_Sub2) this).anInt10548 != 0) {
	    ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		.method17552(((Class55_Sub2) this).anInt10548);
	    if (((Class55_Sub2) this).anInt10555 != 0)
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		    .method17557((long) ((Class55_Sub2) this).anInt10555);
	    if (((Class55_Sub2) this).anInt10550 != 0)
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		    .method17557((long) ((Class55_Sub2) this).anInt10550);
	    ((Class55_Sub2) this).anInt10548 = 0;
	    ((Class55_Sub2) this).anInt10555 = 0;
	    ((Class55_Sub2) this).anInt10550 = 0;
	}
    }
    
    void method1312(int i, int i_21_, Interface31 interface31) {
	((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.method15686(i_21_);
	((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
	    .method15856(interface31);
	OpenGL.glUniform1i(i, i_21_);
    }
    
    static {
	anIntArray10556 = new int[2];
	aFloatArray10549 = new float[16];
    }
    
    public void method27() {
	if (((Class55_Sub2) this).anInt10548 != 0) {
	    ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		.method17552(((Class55_Sub2) this).anInt10548);
	    if (((Class55_Sub2) this).anInt10555 != 0)
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		    .method17557((long) ((Class55_Sub2) this).anInt10555);
	    if (((Class55_Sub2) this).anInt10550 != 0)
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		    .method17557((long) ((Class55_Sub2) this).anInt10550);
	    ((Class55_Sub2) this).anInt10548 = 0;
	    ((Class55_Sub2) this).anInt10555 = 0;
	    ((Class55_Sub2) this).anInt10550 = 0;
	}
    }
    
    public void method29() {
	if (((Class55_Sub2) this).anInt10548 != 0) {
	    ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		.method17552(((Class55_Sub2) this).anInt10548);
	    if (((Class55_Sub2) this).anInt10555 != 0)
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		    .method17557((long) ((Class55_Sub2) this).anInt10555);
	    if (((Class55_Sub2) this).anInt10550 != 0)
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		    .method17557((long) ((Class55_Sub2) this).anInt10550);
	    ((Class55_Sub2) this).anInt10548 = 0;
	    ((Class55_Sub2) this).anInt10555 = 0;
	    ((Class55_Sub2) this).anInt10550 = 0;
	}
    }
    
    void method1335(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_22_, float f_23_) {
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1) {
	    if (((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)) == null
		|| (((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i))
		    == null)
		|| (((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i)))
		       .floatValue() != f_22_
		|| ((Float)
		    ((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i)))
		       .floatValue() != f_23_) {
		((Class55_Sub2) this).aMap10554.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class55_Sub2) this).aMap10543.put(Integer.valueOf(i),
						    Float.valueOf(f_22_));
		((Class55_Sub2) this).aMap10557.put(Integer.valueOf(i),
						    Float.valueOf(f_23_));
		if (class241_sub23_sub1.method17405(1101874624)
		    != Class38.aClass38_575)
		    throw new IllegalArgumentException_Sub1
			      (class241_sub23_sub1, "");
		OpenGL.glUniform3f(i, f, f_22_, f_23_);
	    }
	}
    }
    
    void method16790() {
	method28();
    }
    
    void method16791() {
	method28();
    }
    
    void method1330(Class241_Sub23_Sub1 class241_sub23_sub1,
		    Class268 class268) {
	if (!$assertionsDisabled
	    && (class241_sub23_sub1.method17405(-361983216)
		!= Class38.aClass38_499))
	    throw new AssertionError();
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class268.method5259(aFloatArray10549),
				0);
    }
    
    public boolean method1311() {
	if (((Class55_Sub2) this).aBool10551)
	    return true;
	((Class103_Sub3_Sub2) ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546)
	    .aClass55_Sub2_11136
	    = null;
	((Class55_Sub2) this).anInt10555
	    = method16794(35633, ((Class55_Sub2) this).aString10544,
			  aString695);
	((Class55_Sub2) this).anInt10550
	    = method16794(35632, ((Class55_Sub2) this).aString10561,
			  aString696);
	if (((Class55_Sub2) this).anInt10555 == 0
	    || ((Class55_Sub2) this).anInt10550 == 0) {
	    if (((Class55_Sub2) this).anInt10555 != 0)
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10555);
	    if (((Class55_Sub2) this).anInt10550 != 0)
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10550);
	    return false;
	}
	((Class55_Sub2) this).anInt10548 = OpenGL.glCreateProgram();
	if (((Class55_Sub2) this).anInt10555 != 0)
	    OpenGL.glAttachShader(((Class55_Sub2) this).anInt10548,
				  ((Class55_Sub2) this).anInt10555);
	if (((Class55_Sub2) this).anInt10550 != 0)
	    OpenGL.glAttachShader(((Class55_Sub2) this).anInt10548,
				  ((Class55_Sub2) this).anInt10550);
	OpenGL.glLinkProgram(((Class55_Sub2) this).anInt10548);
	OpenGL.glGetProgramiv(((Class55_Sub2) this).anInt10548, 35714,
			      anIntArray10556, 0);
	if (anIntArray10556[0] == 0) {
	    if (((Class55_Sub2) this).anInt10555 != 0) {
		OpenGL.glDetachShader(((Class55_Sub2) this).anInt10548,
				      ((Class55_Sub2) this).anInt10555);
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10555);
	    }
	    if (((Class55_Sub2) this).anInt10550 != 0) {
		OpenGL.glDetachShader(((Class55_Sub2) this).anInt10548,
				      ((Class55_Sub2) this).anInt10550);
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10550);
	    }
	    OpenGL.glDeleteProgram(((Class55_Sub2) this).anInt10548);
	    return false;
	}
	OpenGL.glUseProgram(((Class55_Sub2) this).anInt10548);
	int i = -1;
	for (int i_24_ = 0; i_24_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2806(-226394095); i_24_++) {
	    if (((Class55_Sub2) this).aClass116_Sub1_10547
		    .method2898(i_24_, -888230765)
		== this) {
		i = i_24_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_25_ = 0; i_25_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2809(-2030046195); i_25_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub2) this).aClass116_Sub1_10547
		      .method2842(i_25_, -1819252252);
	    if (class241_sub23_sub1 != null)
		class241_sub23_sub1.method17403(i);
	}
	for (int i_26_ = 0; i_26_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2909(-117975702); i_26_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub2) this).aClass116_Sub1_10547
		      .method2839(i_26_, 382380485);
	    if (class241_sub23_sub1 != null)
		class241_sub23_sub1.method17403(i);
	}
	((Class55_Sub2) this).aString10544 = null;
	((Class55_Sub2) this).aString10561 = null;
	((Class55_Sub2) this).aBool10551 = true;
	return true;
    }
    
    void method16792() {
	method28();
    }
    
    public boolean method1317() {
	if (((Class55_Sub2) this).aBool10551)
	    return true;
	((Class103_Sub3_Sub2) ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546)
	    .aClass55_Sub2_11136
	    = null;
	((Class55_Sub2) this).anInt10555
	    = method16794(35633, ((Class55_Sub2) this).aString10544,
			  aString695);
	((Class55_Sub2) this).anInt10550
	    = method16794(35632, ((Class55_Sub2) this).aString10561,
			  aString696);
	if (((Class55_Sub2) this).anInt10555 == 0
	    || ((Class55_Sub2) this).anInt10550 == 0) {
	    if (((Class55_Sub2) this).anInt10555 != 0)
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10555);
	    if (((Class55_Sub2) this).anInt10550 != 0)
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10550);
	    return false;
	}
	((Class55_Sub2) this).anInt10548 = OpenGL.glCreateProgram();
	if (((Class55_Sub2) this).anInt10555 != 0)
	    OpenGL.glAttachShader(((Class55_Sub2) this).anInt10548,
				  ((Class55_Sub2) this).anInt10555);
	if (((Class55_Sub2) this).anInt10550 != 0)
	    OpenGL.glAttachShader(((Class55_Sub2) this).anInt10548,
				  ((Class55_Sub2) this).anInt10550);
	OpenGL.glLinkProgram(((Class55_Sub2) this).anInt10548);
	OpenGL.glGetProgramiv(((Class55_Sub2) this).anInt10548, 35714,
			      anIntArray10556, 0);
	if (anIntArray10556[0] == 0) {
	    if (((Class55_Sub2) this).anInt10555 != 0) {
		OpenGL.glDetachShader(((Class55_Sub2) this).anInt10548,
				      ((Class55_Sub2) this).anInt10555);
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10555);
	    }
	    if (((Class55_Sub2) this).anInt10550 != 0) {
		OpenGL.glDetachShader(((Class55_Sub2) this).anInt10548,
				      ((Class55_Sub2) this).anInt10550);
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10550);
	    }
	    OpenGL.glDeleteProgram(((Class55_Sub2) this).anInt10548);
	    return false;
	}
	OpenGL.glUseProgram(((Class55_Sub2) this).anInt10548);
	int i = -1;
	for (int i_27_ = 0; i_27_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2806(834344511); i_27_++) {
	    if (((Class55_Sub2) this).aClass116_Sub1_10547
		    .method2898(i_27_, 384384475)
		== this) {
		i = i_27_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_28_ = 0; i_28_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2809(-857890530); i_28_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub2) this).aClass116_Sub1_10547
		      .method2842(i_28_, -1505522239);
	    if (class241_sub23_sub1 != null)
		class241_sub23_sub1.method17403(i);
	}
	for (int i_29_ = 0; i_29_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2909(-1839350640); i_29_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub2) this).aClass116_Sub1_10547
		      .method2839(i_29_, 642214181);
	    if (class241_sub23_sub1 != null)
		class241_sub23_sub1.method17403(i);
	}
	((Class55_Sub2) this).aString10544 = null;
	((Class55_Sub2) this).aString10561 = null;
	((Class55_Sub2) this).aBool10551 = true;
	return true;
    }
    
    public boolean method1331() {
	if (((Class55_Sub2) this).aBool10551)
	    return true;
	((Class103_Sub3_Sub2) ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546)
	    .aClass55_Sub2_11136
	    = null;
	((Class55_Sub2) this).anInt10555
	    = method16794(35633, ((Class55_Sub2) this).aString10544,
			  aString695);
	((Class55_Sub2) this).anInt10550
	    = method16794(35632, ((Class55_Sub2) this).aString10561,
			  aString696);
	if (((Class55_Sub2) this).anInt10555 == 0
	    || ((Class55_Sub2) this).anInt10550 == 0) {
	    if (((Class55_Sub2) this).anInt10555 != 0)
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10555);
	    if (((Class55_Sub2) this).anInt10550 != 0)
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10550);
	    return false;
	}
	((Class55_Sub2) this).anInt10548 = OpenGL.glCreateProgram();
	if (((Class55_Sub2) this).anInt10555 != 0)
	    OpenGL.glAttachShader(((Class55_Sub2) this).anInt10548,
				  ((Class55_Sub2) this).anInt10555);
	if (((Class55_Sub2) this).anInt10550 != 0)
	    OpenGL.glAttachShader(((Class55_Sub2) this).anInt10548,
				  ((Class55_Sub2) this).anInt10550);
	OpenGL.glLinkProgram(((Class55_Sub2) this).anInt10548);
	OpenGL.glGetProgramiv(((Class55_Sub2) this).anInt10548, 35714,
			      anIntArray10556, 0);
	if (anIntArray10556[0] == 0) {
	    if (((Class55_Sub2) this).anInt10555 != 0) {
		OpenGL.glDetachShader(((Class55_Sub2) this).anInt10548,
				      ((Class55_Sub2) this).anInt10555);
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10555);
	    }
	    if (((Class55_Sub2) this).anInt10550 != 0) {
		OpenGL.glDetachShader(((Class55_Sub2) this).anInt10548,
				      ((Class55_Sub2) this).anInt10550);
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10550);
	    }
	    OpenGL.glDeleteProgram(((Class55_Sub2) this).anInt10548);
	    return false;
	}
	OpenGL.glUseProgram(((Class55_Sub2) this).anInt10548);
	int i = -1;
	for (int i_30_ = 0; i_30_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2806(-1936211484); i_30_++) {
	    if (((Class55_Sub2) this).aClass116_Sub1_10547
		    .method2898(i_30_, 1902016066)
		== this) {
		i = i_30_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_31_ = 0; i_31_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2809(-375223108); i_31_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub2) this).aClass116_Sub1_10547
		      .method2842(i_31_, -1485690319);
	    if (class241_sub23_sub1 != null)
		class241_sub23_sub1.method17403(i);
	}
	for (int i_32_ = 0; i_32_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2909(-675601852); i_32_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub2) this).aClass116_Sub1_10547
		      .method2839(i_32_, -1323875736);
	    if (class241_sub23_sub1 != null)
		class241_sub23_sub1.method17403(i);
	}
	((Class55_Sub2) this).aString10544 = null;
	((Class55_Sub2) this).aString10561 = null;
	((Class55_Sub2) this).aBool10551 = true;
	return true;
    }
    
    void method1333(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_33_) {
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1) {
	    if (((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)) == null
		|| (((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i)))
		       .floatValue() != f_33_) {
		((Class55_Sub2) this).aMap10554.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class55_Sub2) this).aMap10543.put(Integer.valueOf(i),
						    Float.valueOf(f_33_));
		if (class241_sub23_sub1.method17405(860079507)
		    != Class38.aClass38_483)
		    throw new IllegalArgumentException_Sub1
			      (class241_sub23_sub1, "");
		OpenGL.glUniform2f(i, f, f_33_);
	    }
	}
    }
    
    void method1341(Class241_Sub23_Sub1 class241_sub23_sub1, float[] fs,
		    int i) {
	int i_34_
	    = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i_34_ != -1)
	    OpenGL.glUniform4fv(i_34_, i, fs, 0);
    }
    
    void method16793() {
	method28();
    }
    
    Class55_Sub2(Class103_Sub3_Sub2 class103_sub3_sub2,
		 Class116_Sub1 class116_sub1, Class117 class117) {
	this(class103_sub3_sub2, class117);
	((Class55_Sub2) this).aClass116_Sub1_10547 = class116_sub1;
	((Class55_Sub2) this).aClass103_Sub3_Sub2_10546 = class103_sub3_sub2;
    }
    
    void method1342(Class241_Sub23_Sub1 class241_sub23_sub1, float[] fs,
		    int i) {
	int i_35_
	    = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i_35_ != -1)
	    OpenGL.glUniform4fv(i_35_, i, fs, 0);
    }
    
    void method1344(Class241_Sub23_Sub1 class241_sub23_sub1,
		    Class268 class268) {
	if (!$assertionsDisabled
	    && (class241_sub23_sub1.method17405(1694970632)
		!= Class38.aClass38_501))
	    throw new AssertionError();
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class268.method5233(aFloatArray10549),
				0);
    }
    
    void method1310(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_36_, float f_37_, float f_38_) {
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1) {
	    if (((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)) == null
		|| (((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i))
		    == null)
		|| (((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i))
		    == null)
		|| (((Class55_Sub2) this).aMap10558.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i)))
		       .floatValue() != f_36_
		|| ((Float)
		    ((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i)))
		       .floatValue() != f_37_
		|| ((Float)
		    ((Class55_Sub2) this).aMap10558.get(Integer.valueOf(i)))
		       .floatValue() != f_38_) {
		((Class55_Sub2) this).aMap10554.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class55_Sub2) this).aMap10543.put(Integer.valueOf(i),
						    Float.valueOf(f_36_));
		((Class55_Sub2) this).aMap10557.put(Integer.valueOf(i),
						    Float.valueOf(f_37_));
		((Class55_Sub2) this).aMap10558.put(Integer.valueOf(i),
						    Float.valueOf(f_38_));
		if (class241_sub23_sub1.method17405(1040906790)
		    != Class38.aClass38_485)
		    throw new IllegalArgumentException_Sub1
			      (class241_sub23_sub1, "");
		OpenGL.glUniform4f(i, f, f_36_, f_37_, f_38_);
	    }
	}
    }
    
    void method1315(Class241_Sub23_Sub1 class241_sub23_sub1, float[] fs,
		    int i) {
	int i_39_
	    = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i_39_ != -1)
	    OpenGL.glUniform4fv(i_39_, i, fs, 0);
    }
    
    void method1350(Class241_Sub23_Sub1 class241_sub23_sub1, float[] fs,
		    int i) {
	int i_40_
	    = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i_40_ != -1)
	    OpenGL.glUniform4fv(i_40_, i, fs, 0);
    }
    
    int method16794(int i, String string, String string_41_) {
	if (string == null)
	    return 0;
	int i_42_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_42_, string);
	OpenGL.glCompileShader(i_42_);
	OpenGL.glGetShaderiv(i_42_, 35713, anIntArray10556, 0);
	if (anIntArray10556[0] == 0) {
	    OpenGL.glDeleteShader(i_42_);
	    i_42_ = 0;
	}
	return i_42_;
    }
    
    public boolean method1328() {
	if (((Class55_Sub2) this).aBool10551)
	    return true;
	((Class103_Sub3_Sub2) ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546)
	    .aClass55_Sub2_11136
	    = null;
	((Class55_Sub2) this).anInt10555
	    = method16794(35633, ((Class55_Sub2) this).aString10544,
			  aString695);
	((Class55_Sub2) this).anInt10550
	    = method16794(35632, ((Class55_Sub2) this).aString10561,
			  aString696);
	if (((Class55_Sub2) this).anInt10555 == 0
	    || ((Class55_Sub2) this).anInt10550 == 0) {
	    if (((Class55_Sub2) this).anInt10555 != 0)
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10555);
	    if (((Class55_Sub2) this).anInt10550 != 0)
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10550);
	    return false;
	}
	((Class55_Sub2) this).anInt10548 = OpenGL.glCreateProgram();
	if (((Class55_Sub2) this).anInt10555 != 0)
	    OpenGL.glAttachShader(((Class55_Sub2) this).anInt10548,
				  ((Class55_Sub2) this).anInt10555);
	if (((Class55_Sub2) this).anInt10550 != 0)
	    OpenGL.glAttachShader(((Class55_Sub2) this).anInt10548,
				  ((Class55_Sub2) this).anInt10550);
	OpenGL.glLinkProgram(((Class55_Sub2) this).anInt10548);
	OpenGL.glGetProgramiv(((Class55_Sub2) this).anInt10548, 35714,
			      anIntArray10556, 0);
	if (anIntArray10556[0] == 0) {
	    if (((Class55_Sub2) this).anInt10555 != 0) {
		OpenGL.glDetachShader(((Class55_Sub2) this).anInt10548,
				      ((Class55_Sub2) this).anInt10555);
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10555);
	    }
	    if (((Class55_Sub2) this).anInt10550 != 0) {
		OpenGL.glDetachShader(((Class55_Sub2) this).anInt10548,
				      ((Class55_Sub2) this).anInt10550);
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10550);
	    }
	    OpenGL.glDeleteProgram(((Class55_Sub2) this).anInt10548);
	    return false;
	}
	OpenGL.glUseProgram(((Class55_Sub2) this).anInt10548);
	int i = -1;
	for (int i_43_ = 0; i_43_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2806(-1389949070); i_43_++) {
	    if (((Class55_Sub2) this).aClass116_Sub1_10547
		    .method2898(i_43_, -306296668)
		== this) {
		i = i_43_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_44_ = 0; i_44_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2809(-384859943); i_44_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub2) this).aClass116_Sub1_10547
		      .method2842(i_44_, 1937544697);
	    if (class241_sub23_sub1 != null)
		class241_sub23_sub1.method17403(i);
	}
	for (int i_45_ = 0; i_45_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2909(-2092130204); i_45_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub2) this).aClass116_Sub1_10547
		      .method2839(i_45_, -712931069);
	    if (class241_sub23_sub1 != null)
		class241_sub23_sub1.method17403(i);
	}
	((Class55_Sub2) this).aString10544 = null;
	((Class55_Sub2) this).aString10561 = null;
	((Class55_Sub2) this).aBool10551 = true;
	return true;
    }
    
    void method1343(Class241_Sub23_Sub1 class241_sub23_sub1,
		    Class268 class268) {
	if (!$assertionsDisabled
	    && (class241_sub23_sub1.method17405(-1602247120)
		!= Class38.aClass38_499))
	    throw new AssertionError();
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class268.method5259(aFloatArray10549),
				0);
    }
    
    void method1320(Class241_Sub23_Sub1 class241_sub23_sub1,
		    Class268 class268) {
	if (!$assertionsDisabled
	    && (class241_sub23_sub1.method17405(-344138399)
		!= Class38.aClass38_501))
	    throw new AssertionError();
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class268.method5233(aFloatArray10549),
				0);
    }
    
    void method1345(Class241_Sub23_Sub1 class241_sub23_sub1,
		    Class268 class268) {
	if (!$assertionsDisabled
	    && (class241_sub23_sub1.method17405(1848694315)
		!= Class38.aClass38_501))
	    throw new AssertionError();
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class268.method5233(aFloatArray10549),
				0);
    }
    
    void method1336(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_46_, float f_47_) {
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1) {
	    if (((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)) == null
		|| (((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i))
		    == null)
		|| (((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i)))
		       .floatValue() != f_46_
		|| ((Float)
		    ((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i)))
		       .floatValue() != f_47_) {
		((Class55_Sub2) this).aMap10554.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class55_Sub2) this).aMap10543.put(Integer.valueOf(i),
						    Float.valueOf(f_46_));
		((Class55_Sub2) this).aMap10557.put(Integer.valueOf(i),
						    Float.valueOf(f_47_));
		if (class241_sub23_sub1.method17405(126011733)
		    != Class38.aClass38_575)
		    throw new IllegalArgumentException_Sub1
			      (class241_sub23_sub1, "");
		OpenGL.glUniform3f(i, f, f_46_, f_47_);
	    }
	}
    }
    
    void method1347(Class241_Sub23_Sub1 class241_sub23_sub1, int i,
		    Interface31 interface31) {
	int i_48_
	    = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i_48_ != -1) {
	    if (interface31 == null)
		interface31 = (((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
			       .anInterface41_9584);
	    if (i
		< ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.anInt9647) {
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.method15686(i);
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		    .method15856(interface31);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture((((Class226) (Class226) interface31)
				      .anInt2660),
				     (((Class226) (Class226) interface31)
				      .anInt2661));
	    }
	    if ((((Class55_Sub2) this).aMap10559.get(Integer.valueOf(i_48_))
		 == null)
		|| ((Integer) ((Class55_Sub2) this).aMap10559
				  .get(Integer.valueOf(i_48_)))
		       .intValue() != i) {
		((Class55_Sub2) this).aMap10559.put(Integer.valueOf(i_48_),
						    Integer.valueOf(i));
		OpenGL.glUniform1i(i_48_, i);
	    }
	}
    }
    
    void method1359(Class241_Sub23_Sub1 class241_sub23_sub1, float f) {
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1) {
	    if (((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)) == null
		|| ((Float)
		    ((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)))
		       .floatValue() != f) {
		((Class55_Sub2) this).aMap10554.put(Integer.valueOf(i),
						    Float.valueOf(f));
		if ((class241_sub23_sub1.method17405(-1556240725)
		     != Class38.aClass38_482)
		    && (class241_sub23_sub1.method17405(1294539219)
			!= Class38.aClass38_528))
		    throw new IllegalArgumentException_Sub1
			      (class241_sub23_sub1, "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method1321(Class241_Sub23_Sub1 class241_sub23_sub1, int i,
		    Interface31 interface31) {
	int i_49_
	    = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i_49_ != -1) {
	    if (interface31 == null)
		interface31 = (((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
			       .anInterface41_9584);
	    if (i
		< ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.anInt9647) {
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.method15686(i);
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		    .method15856(interface31);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture((((Class226) (Class226) interface31)
				      .anInt2660),
				     (((Class226) (Class226) interface31)
				      .anInt2661));
	    }
	    if ((((Class55_Sub2) this).aMap10559.get(Integer.valueOf(i_49_))
		 == null)
		|| ((Integer) ((Class55_Sub2) this).aMap10559
				  .get(Integer.valueOf(i_49_)))
		       .intValue() != i) {
		((Class55_Sub2) this).aMap10559.put(Integer.valueOf(i_49_),
						    Integer.valueOf(i));
		OpenGL.glUniform1i(i_49_, i);
	    }
	}
    }
    
    void method1351(int i, float f, float f_50_, float f_51_) {
	OpenGL.glUniform3f(i, f, f_50_, f_51_);
    }
    
    void method1360(int i, float f, float f_52_, float f_53_) {
	OpenGL.glUniform3f(i, f, f_52_, f_53_);
    }
    
    void method1352(int i, float f, float f_54_, float f_55_, float f_56_) {
	OpenGL.glUniform4f(i, f, f_54_, f_55_, f_56_);
    }
    
    void method1337(Class241_Sub23_Sub1 class241_sub23_sub1, float f,
		    float f_57_, float f_58_) {
	int i = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i != -1) {
	    if (((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)) == null
		|| (((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i))
		    == null)
		|| (((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class55_Sub2) this).aMap10554.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class55_Sub2) this).aMap10543.get(Integer.valueOf(i)))
		       .floatValue() != f_57_
		|| ((Float)
		    ((Class55_Sub2) this).aMap10557.get(Integer.valueOf(i)))
		       .floatValue() != f_58_) {
		((Class55_Sub2) this).aMap10554.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class55_Sub2) this).aMap10543.put(Integer.valueOf(i),
						    Float.valueOf(f_57_));
		((Class55_Sub2) this).aMap10557.put(Integer.valueOf(i),
						    Float.valueOf(f_58_));
		if (class241_sub23_sub1.method17405(1849694984)
		    != Class38.aClass38_575)
		    throw new IllegalArgumentException_Sub1
			      (class241_sub23_sub1, "");
		OpenGL.glUniform3f(i, f, f_57_, f_58_);
	    }
	}
    }
    
    void method1354(int i, float f, float f_59_, float f_60_, float f_61_) {
	OpenGL.glUniform4f(i, f, f_59_, f_60_, f_61_);
    }
    
    void method1355(int i, float f, float f_62_, float f_63_, float f_64_) {
	OpenGL.glUniform4f(i, f, f_62_, f_63_, f_64_);
    }
    
    void method1356(int i, Class268 class268) {
	OpenGL.glUniform3fv(i, 3, class268.method5228(aFloatArray10549), 0);
    }
    
    void method1357(int i, Class268 class268) {
	OpenGL.glUniform2fv(i, 4, class268.method5259(aFloatArray10549), 0);
    }
    
    public boolean method1318() {
	if (((Class55_Sub2) this).aBool10551)
	    return true;
	((Class103_Sub3_Sub2) ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546)
	    .aClass55_Sub2_11136
	    = null;
	((Class55_Sub2) this).anInt10555
	    = method16794(35633, ((Class55_Sub2) this).aString10544,
			  aString695);
	((Class55_Sub2) this).anInt10550
	    = method16794(35632, ((Class55_Sub2) this).aString10561,
			  aString696);
	if (((Class55_Sub2) this).anInt10555 == 0
	    || ((Class55_Sub2) this).anInt10550 == 0) {
	    if (((Class55_Sub2) this).anInt10555 != 0)
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10555);
	    if (((Class55_Sub2) this).anInt10550 != 0)
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10550);
	    return false;
	}
	((Class55_Sub2) this).anInt10548 = OpenGL.glCreateProgram();
	if (((Class55_Sub2) this).anInt10555 != 0)
	    OpenGL.glAttachShader(((Class55_Sub2) this).anInt10548,
				  ((Class55_Sub2) this).anInt10555);
	if (((Class55_Sub2) this).anInt10550 != 0)
	    OpenGL.glAttachShader(((Class55_Sub2) this).anInt10548,
				  ((Class55_Sub2) this).anInt10550);
	OpenGL.glLinkProgram(((Class55_Sub2) this).anInt10548);
	OpenGL.glGetProgramiv(((Class55_Sub2) this).anInt10548, 35714,
			      anIntArray10556, 0);
	if (anIntArray10556[0] == 0) {
	    if (((Class55_Sub2) this).anInt10555 != 0) {
		OpenGL.glDetachShader(((Class55_Sub2) this).anInt10548,
				      ((Class55_Sub2) this).anInt10555);
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10555);
	    }
	    if (((Class55_Sub2) this).anInt10550 != 0) {
		OpenGL.glDetachShader(((Class55_Sub2) this).anInt10548,
				      ((Class55_Sub2) this).anInt10550);
		OpenGL.glDeleteShader(((Class55_Sub2) this).anInt10550);
	    }
	    OpenGL.glDeleteProgram(((Class55_Sub2) this).anInt10548);
	    return false;
	}
	OpenGL.glUseProgram(((Class55_Sub2) this).anInt10548);
	int i = -1;
	for (int i_65_ = 0; i_65_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2806(-1701163896); i_65_++) {
	    if (((Class55_Sub2) this).aClass116_Sub1_10547
		    .method2898(i_65_, 1208068503)
		== this) {
		i = i_65_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_66_ = 0; i_66_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2809(268081819); i_66_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub2) this).aClass116_Sub1_10547
		      .method2842(i_66_, 1805162121);
	    if (class241_sub23_sub1 != null)
		class241_sub23_sub1.method17403(i);
	}
	for (int i_67_ = 0; i_67_ < ((Class55_Sub2) this)
					.aClass116_Sub1_10547
					.method2909(-830416121); i_67_++) {
	    Class241_Sub23_Sub1 class241_sub23_sub1
		= ((Class55_Sub2) this).aClass116_Sub1_10547
		      .method2839(i_67_, -1086836999);
	    if (class241_sub23_sub1 != null)
		class241_sub23_sub1.method17403(i);
	}
	((Class55_Sub2) this).aString10544 = null;
	((Class55_Sub2) this).aString10561 = null;
	((Class55_Sub2) this).aBool10551 = true;
	return true;
    }
    
    void method1309(int i, Class268 class268) {
	OpenGL.glUniform2fv(i, 4, class268.method5259(aFloatArray10549), 0);
    }
    
    void method1339(int i, int i_68_, Interface31 interface31) {
	((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.method15686(i_68_);
	((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
	    .method15856(interface31);
	OpenGL.glUniform1i(i, i_68_);
    }
    
    void method1361(int i, float[] fs, int i_69_) {
	OpenGL.glUniform4fv(i, i_69_, fs, 0);
    }
    
    void method1362(int i, float[] fs, int i_70_) {
	OpenGL.glUniform4fv(i, i_70_, fs, 0);
    }
    
    void method1363(int i, float[] fs, int i_71_) {
	OpenGL.glUniform4fv(i, i_71_, fs, 0);
    }
    
    public void finalize() {
	method28();
    }
    
    void method1364(int i, Class268 class268) {
	OpenGL.glUniform4fv(i, 4, class268.method5233(aFloatArray10549), 0);
    }
    
    void method1346(Class241_Sub23_Sub1 class241_sub23_sub1, int i,
		    Interface31 interface31) {
	int i_72_
	    = ((Class241_Sub23_Sub1_Sub2) class241_sub23_sub1).method17950();
	if (i_72_ != -1) {
	    if (interface31 == null)
		interface31 = (((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
			       .anInterface41_9584);
	    if (i
		< ((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.anInt9647) {
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546.method15686(i);
		((Class55_Sub2) this).aClass103_Sub3_Sub2_10546
		    .method15856(interface31);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture((((Class226) (Class226) interface31)
				      .anInt2660),
				     (((Class226) (Class226) interface31)
				      .anInt2661));
	    }
	    if ((((Class55_Sub2) this).aMap10559.get(Integer.valueOf(i_72_))
		 == null)
		|| ((Integer) ((Class55_Sub2) this).aMap10559
				  .get(Integer.valueOf(i_72_)))
		       .intValue() != i) {
		((Class55_Sub2) this).aMap10559.put(Integer.valueOf(i_72_),
						    Integer.valueOf(i));
		OpenGL.glUniform1i(i_72_, i);
	    }
	}
    }
    
    void method1366(int i, Class268 class268) {
	OpenGL.glUniform4fv(i, 4, class268.method5233(aFloatArray10549), 0);
    }
}
