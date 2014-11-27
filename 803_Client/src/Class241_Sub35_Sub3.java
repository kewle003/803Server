/* Class241_Sub35_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class241_Sub35_Sub3 extends Class241_Sub35
{
    Class142_Sub4 aClass142_Sub4_11020;
    static float aFloat11021 = 0.25F;
    Class142_Sub4[] aClass142_Sub4Array11022;
    static float aFloat11023;
    static float aFloat11024 = 1.0F;
    static final String aString11025
	= "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
    static final String aString11026
	= "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
    Class105_Sub2_Sub1 aClass105_Sub2_Sub1_11027;
    static final String aString11028
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";
    Class105_Sub2_Sub1 aClass105_Sub2_Sub1_11029;
    Class142_Sub4 aClass142_Sub4_11030;
    static final String aString11031
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
    int anInt11032;
    int anInt11033;
    static final int anInt11034 = 256;
    int anInt11035;
    int anInt11036;
    Class148 aClass148_11037;
    Class148 aClass148_11038;
    Class148 aClass148_11039;
    Class148 aClass148_11040;
    
    void method16385(int i) {
	OpenGL.glUseProgram(0);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(1);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15177(null);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(0);
    }
    
    int method16408() {
	return 0;
    }
    
    boolean method16401() {
	return ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027 != null;
    }
    
    int method16395() {
	return 0;
    }
    
    void method16376() {
	((Class241_Sub35_Sub3) this).anInt11036 = -1;
	((Class241_Sub35_Sub3) this).anInt11035 = -1;
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029 = null;
	((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022 = null;
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027 = null;
	((Class241_Sub35_Sub3) this).aClass142_Sub4_11030 = null;
	((Class241_Sub35_Sub3) this).aClass142_Sub4_11020 = null;
	((Class241_Sub35_Sub3) this).aClass148_11040 = null;
	((Class241_Sub35_Sub3) this).aClass148_11039 = null;
	((Class241_Sub35_Sub3) this).aClass148_11038 = null;
	((Class241_Sub35_Sub3) this).aClass148_11037 = null;
    }
    
    void method16377(int i, int i_0_) {
	((Class241_Sub35_Sub3) this).anInt11032 = i;
	((Class241_Sub35_Sub3) this).anInt11033 = i_0_;
	int i_1_ = RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11032,
				     -1959341094);
	int i_2_ = RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11033,
				     -1959341094);
	if (((Class241_Sub35_Sub3) this).anInt11035 != i_1_
	    || ((Class241_Sub35_Sub3) this).anInt11036 != i_2_) {
	    if (((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
		!= null) {
		for (int i_3_ = 0;
		     i_3_ < (((Class241_Sub35_Sub3) this)
			     .aClass142_Sub4Array11022).length;
		     i_3_++)
		    ((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
			[i_3_].method3176();
		((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022 = null;
	    }
	    if (i_1_ > 256 || i_2_ > 256) {
		int i_4_ = i_1_;
		int i_5_ = i_2_;
		int i_6_ = 0;
		while (i_4_ > 256 || i_5_ > 256) {
		    if (i_4_ > 256)
			i_4_ >>= 1;
		    if (i_5_ > 256)
			i_5_ >>= 1;
		    i_6_++;
		}
		if (((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029
		    == null)
		    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029
			= new Class105_Sub2_Sub1(((Class241_Sub35_Sub3) this)
						 .aClass103_Sub1_10088);
		((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
		    = new Class142_Sub4[i_6_];
		i_4_ = i_1_;
		i_5_ = i_2_;
		i_6_ = 0;
		while (i_4_ > 256 || i_5_ > 256) {
		    ((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
			[i_6_++]
			= new Class142_Sub4((((Class241_Sub35_Sub3) this)
					     .aClass103_Sub1_10088),
					    3553, Class175.aClass175_2110,
					    method16379(), i_4_, i_5_);
		    if (i_4_ > 256)
			i_4_ >>= 1;
		    if (i_5_ > 256)
			i_5_ >>= 1;
		}
	    } else
		((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029 = null;
	    ((Class241_Sub35_Sub3) this).anInt11035 = i_1_;
	    ((Class241_Sub35_Sub3) this).anInt11036 = i_2_;
	}
    }
    
    void method16378(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_7_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022 != null) {
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029,
		 -519163929);
	    int i_8_
		= RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11032,
				    -1959341094);
	    int i_9_
		= RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11033,
				    -1959341094);
	    int i_10_ = 0;
	    while (i_8_ > 256 || i_9_ > 256) {
		OpenGL.glViewport(0, 0, i_8_, i_9_);
		((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029
		    .method15585
		    (0, ((Class241_Sub35_Sub3) this)
			    .aClass142_Sub4Array11022[i_10_].method16902(0));
		if (i_10_ == 0) {
		    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
			.method15177(class142_sub4);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
						 .anInt11032),
					0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
						 .anInt11032),
					(float) (((Class241_Sub35_Sub3) this)
						 .anInt11033));
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F,
					(float) (((Class241_Sub35_Sub3) this)
						 .anInt11033));
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
			.method15177
			(((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
			 [i_10_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_8_ > 256)
		    i_8_ >>= 1;
		if (i_9_ > 256)
		    i_9_ >>= 1;
		i_10_++;
	    }
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029,
		 -230743736);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15177
		(((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
		 [i_10_ - 1]);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -519163929);
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		.method16915(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_11_
		= (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11039)
		   .anInt1704);
	    OpenGL.glUseProgram(i_11_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_11_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_11_, "params"),
			       aFloat11023, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
		.method15177(class142_sub4);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -519163929);
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		.method16915(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_12_
		= (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11040)
		   .anInt1704);
	    OpenGL.glUseProgram(i_12_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_12_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_12_, "params"),
			       aFloat11023, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
					 .anInt11032),
				0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
					 .anInt11032),
				(float) (((Class241_Sub35_Sub3) this)
					 .anInt11033));
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) (((Class241_Sub35_Sub3) this)
					       .anInt11033));
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method16915(1);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11030);
	int i_13_ = (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11037)
		     .anInt1704);
	OpenGL.glUseProgram(i_13_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_13_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_13_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method16915(0);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11020);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_13_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
	    (((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
	     -992481767);
	int i_14_ = (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11038)
		     .anInt1704);
	OpenGL.glUseProgram(i_14_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_14_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_14_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_14_, "params"),
			   aFloat11021, aFloat11024, 0.0F);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(1);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11030);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(0);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(class142_sub4);
    }
    
    Class241_Sub35_Sub3(Class103_Sub1 class103_sub1) {
	super(class103_sub1);
    }
    
    Class102 method16379() {
	return Class102.aClass102_1444;
    }
    
    int method16381() {
	return 0;
    }
    
    boolean method17435() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9201
		&& ((Class103_Sub1) (((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088)).aBool9217
		&& ((Class103_Sub1) (((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088)).aBool9212);
    }
    
    static {
	aFloat11023 = 1.0F;
    }
    
    boolean method16386() {
	return ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027 != null;
    }
    
    boolean method16387() {
	if (((Class103_Sub1)
	     ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9201
	    && ((Class103_Sub1)
		((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9217
	    && ((Class103_Sub1)
		((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9212) {
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		= new Class105_Sub2_Sub1(((Class241_Sub35_Sub3) this)
					 .aClass103_Sub1_10088);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11030
		= new Class142_Sub4((((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088),
				    3553, Class175.aClass175_2110,
				    method16379(), 256, 256);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11030
		.method16906(false, false);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11020
		= new Class142_Sub4((((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088),
				    3553, Class175.aClass175_2110,
				    method16379(), 256, 256);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11020
		.method16906(false, false);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -519163929);
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method15585
		(0, ((Class241_Sub35_Sub3) this).aClass142_Sub4_11030
			.method16902(0));
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method15585
		(1, ((Class241_Sub35_Sub3) this).aClass142_Sub4_11020
			.method16902(0));
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		.method16915(0);
	    if (!((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		     .method15586()) {
		((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
		    (((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		     -774053575);
		return false;
	    }
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -1076466813);
	    ((Class241_Sub35_Sub3) this).aClass148_11040
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    ((Class241_Sub35_Sub3) this).aClass148_11039
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    ((Class241_Sub35_Sub3) this).aClass148_11038
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
	    ((Class241_Sub35_Sub3) this).aClass148_11037
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (((Class241_Sub35_Sub3) this).aClass148_11039 != null
		    && ((Class241_Sub35_Sub3) this).aClass148_11040 != null
		    && ((Class241_Sub35_Sub3) this).aClass148_11038 != null
		    && ((Class241_Sub35_Sub3) this).aClass148_11037 != null);
	}
	return false;
    }
    
    boolean method16388() {
	if (((Class103_Sub1)
	     ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9201
	    && ((Class103_Sub1)
		((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9217
	    && ((Class103_Sub1)
		((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9212) {
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		= new Class105_Sub2_Sub1(((Class241_Sub35_Sub3) this)
					 .aClass103_Sub1_10088);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11030
		= new Class142_Sub4((((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088),
				    3553, Class175.aClass175_2110,
				    method16379(), 256, 256);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11030
		.method16906(false, false);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11020
		= new Class142_Sub4((((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088),
				    3553, Class175.aClass175_2110,
				    method16379(), 256, 256);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11020
		.method16906(false, false);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -519163929);
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method15585
		(0, ((Class241_Sub35_Sub3) this).aClass142_Sub4_11030
			.method16902(0));
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method15585
		(1, ((Class241_Sub35_Sub3) this).aClass142_Sub4_11020
			.method16902(0));
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		.method16915(0);
	    if (!((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		     .method15586()) {
		((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
		    (((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		     -84878928);
		return false;
	    }
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -396106825);
	    ((Class241_Sub35_Sub3) this).aClass148_11040
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    ((Class241_Sub35_Sub3) this).aClass148_11039
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    ((Class241_Sub35_Sub3) this).aClass148_11038
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
	    ((Class241_Sub35_Sub3) this).aClass148_11037
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (((Class241_Sub35_Sub3) this).aClass148_11039 != null
		    && ((Class241_Sub35_Sub3) this).aClass148_11040 != null
		    && ((Class241_Sub35_Sub3) this).aClass148_11038 != null
		    && ((Class241_Sub35_Sub3) this).aClass148_11037 != null);
	}
	return false;
    }
    
    void method16389() {
	((Class241_Sub35_Sub3) this).anInt11036 = -1;
	((Class241_Sub35_Sub3) this).anInt11035 = -1;
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029 = null;
	((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022 = null;
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027 = null;
	((Class241_Sub35_Sub3) this).aClass142_Sub4_11030 = null;
	((Class241_Sub35_Sub3) this).aClass142_Sub4_11020 = null;
	((Class241_Sub35_Sub3) this).aClass148_11040 = null;
	((Class241_Sub35_Sub3) this).aClass148_11039 = null;
	((Class241_Sub35_Sub3) this).aClass148_11038 = null;
	((Class241_Sub35_Sub3) this).aClass148_11037 = null;
    }
    
    boolean method17436() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9201
		&& ((Class103_Sub1) (((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088)).aBool9217
		&& ((Class103_Sub1) (((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088)).aBool9212);
    }
    
    void method16373(int i, int i_15_) {
	((Class241_Sub35_Sub3) this).anInt11032 = i;
	((Class241_Sub35_Sub3) this).anInt11033 = i_15_;
	int i_16_ = RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11032,
				      -1959341094);
	int i_17_ = RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11033,
				      -1959341094);
	if (((Class241_Sub35_Sub3) this).anInt11035 != i_16_
	    || ((Class241_Sub35_Sub3) this).anInt11036 != i_17_) {
	    if (((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
		!= null) {
		for (int i_18_ = 0;
		     i_18_ < (((Class241_Sub35_Sub3) this)
			      .aClass142_Sub4Array11022).length;
		     i_18_++)
		    ((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
			[i_18_].method3176();
		((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022 = null;
	    }
	    if (i_16_ > 256 || i_17_ > 256) {
		int i_19_ = i_16_;
		int i_20_ = i_17_;
		int i_21_ = 0;
		while (i_19_ > 256 || i_20_ > 256) {
		    if (i_19_ > 256)
			i_19_ >>= 1;
		    if (i_20_ > 256)
			i_20_ >>= 1;
		    i_21_++;
		}
		if (((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029
		    == null)
		    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029
			= new Class105_Sub2_Sub1(((Class241_Sub35_Sub3) this)
						 .aClass103_Sub1_10088);
		((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
		    = new Class142_Sub4[i_21_];
		i_19_ = i_16_;
		i_20_ = i_17_;
		i_21_ = 0;
		while (i_19_ > 256 || i_20_ > 256) {
		    ((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
			[i_21_++]
			= new Class142_Sub4((((Class241_Sub35_Sub3) this)
					     .aClass103_Sub1_10088),
					    3553, Class175.aClass175_2110,
					    method16379(), i_19_, i_20_);
		    if (i_19_ > 256)
			i_19_ >>= 1;
		    if (i_20_ > 256)
			i_20_ >>= 1;
		}
	    } else
		((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029 = null;
	    ((Class241_Sub35_Sub3) this).anInt11035 = i_16_;
	    ((Class241_Sub35_Sub3) this).anInt11036 = i_17_;
	}
    }
    
    void method16393(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_22_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022 != null) {
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029,
		 -519163929);
	    int i_23_
		= RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11032,
				    -1959341094);
	    int i_24_
		= RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11033,
				    -1959341094);
	    int i_25_ = 0;
	    while (i_23_ > 256 || i_24_ > 256) {
		OpenGL.glViewport(0, 0, i_23_, i_24_);
		((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029
		    .method15585
		    (0, ((Class241_Sub35_Sub3) this)
			    .aClass142_Sub4Array11022[i_25_].method16902(0));
		if (i_25_ == 0) {
		    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
			.method15177(class142_sub4);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
						 .anInt11032),
					0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
						 .anInt11032),
					(float) (((Class241_Sub35_Sub3) this)
						 .anInt11033));
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F,
					(float) (((Class241_Sub35_Sub3) this)
						 .anInt11033));
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
			.method15177
			(((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
			 [i_25_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_23_ > 256)
		    i_23_ >>= 1;
		if (i_24_ > 256)
		    i_24_ >>= 1;
		i_25_++;
	    }
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029,
		 557937465);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15177
		(((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
		 [i_25_ - 1]);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -519163929);
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		.method16915(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_26_
		= (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11039)
		   .anInt1704);
	    OpenGL.glUseProgram(i_26_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_26_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_26_, "params"),
			       aFloat11023, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
		.method15177(class142_sub4);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -519163929);
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		.method16915(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_27_
		= (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11040)
		   .anInt1704);
	    OpenGL.glUseProgram(i_27_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_27_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_27_, "params"),
			       aFloat11023, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
					 .anInt11032),
				0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
					 .anInt11032),
				(float) (((Class241_Sub35_Sub3) this)
					 .anInt11033));
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) (((Class241_Sub35_Sub3) this)
					       .anInt11033));
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method16915(1);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11030);
	int i_28_ = (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11037)
		     .anInt1704);
	OpenGL.glUseProgram(i_28_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_28_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_28_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method16915(0);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11020);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_28_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
	    (((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
	     285067869);
	int i_29_ = (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11038)
		     .anInt1704);
	OpenGL.glUseProgram(i_29_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_29_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_29_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_29_, "params"),
			   aFloat11021, aFloat11024, 0.0F);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(1);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11030);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(0);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(class142_sub4);
    }
    
    void method16398(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_30_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022 != null) {
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029,
		 -519163929);
	    int i_31_
		= RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11032,
				    -1959341094);
	    int i_32_
		= RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11033,
				    -1959341094);
	    int i_33_ = 0;
	    while (i_31_ > 256 || i_32_ > 256) {
		OpenGL.glViewport(0, 0, i_31_, i_32_);
		((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029
		    .method15585
		    (0, ((Class241_Sub35_Sub3) this)
			    .aClass142_Sub4Array11022[i_33_].method16902(0));
		if (i_33_ == 0) {
		    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
			.method15177(class142_sub4);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
						 .anInt11032),
					0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
						 .anInt11032),
					(float) (((Class241_Sub35_Sub3) this)
						 .anInt11033));
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F,
					(float) (((Class241_Sub35_Sub3) this)
						 .anInt11033));
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
			.method15177
			(((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
			 [i_33_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_31_ > 256)
		    i_31_ >>= 1;
		if (i_32_ > 256)
		    i_32_ >>= 1;
		i_33_++;
	    }
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029,
		 -730210285);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15177
		(((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
		 [i_33_ - 1]);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -519163929);
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		.method16915(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_34_
		= (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11039)
		   .anInt1704);
	    OpenGL.glUseProgram(i_34_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_34_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_34_, "params"),
			       aFloat11023, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
		.method15177(class142_sub4);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -519163929);
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		.method16915(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_35_
		= (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11040)
		   .anInt1704);
	    OpenGL.glUseProgram(i_35_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_35_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_35_, "params"),
			       aFloat11023, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
					 .anInt11032),
				0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
					 .anInt11032),
				(float) (((Class241_Sub35_Sub3) this)
					 .anInt11033));
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) (((Class241_Sub35_Sub3) this)
					       .anInt11033));
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method16915(1);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11030);
	int i_36_ = (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11037)
		     .anInt1704);
	OpenGL.glUseProgram(i_36_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_36_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_36_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method16915(0);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11020);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_36_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
	    (((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
	     -1429996698);
	int i_37_ = (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11038)
		     .anInt1704);
	OpenGL.glUseProgram(i_37_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_37_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_37_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_37_, "params"),
			   aFloat11021, aFloat11024, 0.0F);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(1);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11030);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(0);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(class142_sub4);
    }
    
    boolean method16374() {
	return false;
    }
    
    boolean method16392() {
	if (((Class103_Sub1)
	     ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9201
	    && ((Class103_Sub1)
		((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9217
	    && ((Class103_Sub1)
		((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9212) {
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		= new Class105_Sub2_Sub1(((Class241_Sub35_Sub3) this)
					 .aClass103_Sub1_10088);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11030
		= new Class142_Sub4((((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088),
				    3553, Class175.aClass175_2110,
				    method16379(), 256, 256);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11030
		.method16906(false, false);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11020
		= new Class142_Sub4((((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088),
				    3553, Class175.aClass175_2110,
				    method16379(), 256, 256);
	    ((Class241_Sub35_Sub3) this).aClass142_Sub4_11020
		.method16906(false, false);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -519163929);
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method15585
		(0, ((Class241_Sub35_Sub3) this).aClass142_Sub4_11030
			.method16902(0));
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method15585
		(1, ((Class241_Sub35_Sub3) this).aClass142_Sub4_11020
			.method16902(0));
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		.method16915(0);
	    if (!((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		     .method15586()) {
		((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
		    (((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		     -349685712);
		return false;
	    }
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -973540932);
	    ((Class241_Sub35_Sub3) this).aClass148_11040
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    ((Class241_Sub35_Sub3) this).aClass148_11039
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    ((Class241_Sub35_Sub3) this).aClass148_11038
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
	    ((Class241_Sub35_Sub3) this).aClass148_11037
		= (Class148.method3226
		   (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub3) this).aClass103_Sub1_10088,
			35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (((Class241_Sub35_Sub3) this).aClass148_11039 != null
		    && ((Class241_Sub35_Sub3) this).aClass148_11040 != null
		    && ((Class241_Sub35_Sub3) this).aClass148_11038 != null
		    && ((Class241_Sub35_Sub3) this).aClass148_11037 != null);
	}
	return false;
    }
    
    Class102 method16399() {
	return Class102.aClass102_1444;
    }
    
    Class102 method16391() {
	return Class102.aClass102_1444;
    }
    
    void method16403(int i) {
	OpenGL.glUseProgram(0);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(1);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15177(null);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(0);
    }
    
    boolean method16404() {
	return false;
    }
    
    int method16405() {
	return 0;
    }
    
    int method16406() {
	return 0;
    }
    
    int method16407() {
	return 0;
    }
    
    void method16394(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_38_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022 != null) {
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029,
		 -519163929);
	    int i_39_
		= RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11032,
				    -1959341094);
	    int i_40_
		= RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11033,
				    -1959341094);
	    int i_41_ = 0;
	    while (i_39_ > 256 || i_40_ > 256) {
		OpenGL.glViewport(0, 0, i_39_, i_40_);
		((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029
		    .method15585
		    (0, ((Class241_Sub35_Sub3) this)
			    .aClass142_Sub4Array11022[i_41_].method16902(0));
		if (i_41_ == 0) {
		    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
			.method15177(class142_sub4);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
						 .anInt11032),
					0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
						 .anInt11032),
					(float) (((Class241_Sub35_Sub3) this)
						 .anInt11033));
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F,
					(float) (((Class241_Sub35_Sub3) this)
						 .anInt11033));
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
			.method15177
			(((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
			 [i_41_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_39_ > 256)
		    i_39_ >>= 1;
		if (i_40_ > 256)
		    i_40_ >>= 1;
		i_41_++;
	    }
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029,
		 61621440);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15177
		(((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
		 [i_41_ - 1]);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -519163929);
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		.method16915(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_42_
		= (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11039)
		   .anInt1704);
	    OpenGL.glUseProgram(i_42_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_42_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_42_, "params"),
			       aFloat11023, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
		.method15177(class142_sub4);
	    ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2244
		(((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
		 -519163929);
	    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027
		.method16915(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_43_
		= (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11040)
		   .anInt1704);
	    OpenGL.glUseProgram(i_43_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_43_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_43_, "params"),
			       aFloat11023, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
					 .anInt11032),
				0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) (((Class241_Sub35_Sub3) this)
					 .anInt11032),
				(float) (((Class241_Sub35_Sub3) this)
					 .anInt11033));
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) (((Class241_Sub35_Sub3) this)
					       .anInt11033));
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method16915(1);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11030);
	int i_44_ = (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11037)
		     .anInt1704);
	OpenGL.glUseProgram(i_44_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_44_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_44_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027.method16915(0);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11020);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_44_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method2245
	    (((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11027,
	     158694386);
	int i_45_ = (((Class148) ((Class241_Sub35_Sub3) this).aClass148_11038)
		     .anInt1704);
	OpenGL.glUseProgram(i_45_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_45_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_45_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_45_, "params"),
			   aFloat11021, aFloat11024, 0.0F);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(1);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(((Class241_Sub35_Sub3) this).aClass142_Sub4_11030);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088.method15225(0);
	((Class241_Sub35_Sub3) this).aClass103_Sub1_10088
	    .method15177(class142_sub4);
    }
    
    void method16390(int i, int i_46_) {
	((Class241_Sub35_Sub3) this).anInt11032 = i;
	((Class241_Sub35_Sub3) this).anInt11033 = i_46_;
	int i_47_ = RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11032,
				      -1959341094);
	int i_48_ = RSAKeys.method860(((Class241_Sub35_Sub3) this).anInt11033,
				      -1959341094);
	if (((Class241_Sub35_Sub3) this).anInt11035 != i_47_
	    || ((Class241_Sub35_Sub3) this).anInt11036 != i_48_) {
	    if (((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
		!= null) {
		for (int i_49_ = 0;
		     i_49_ < (((Class241_Sub35_Sub3) this)
			      .aClass142_Sub4Array11022).length;
		     i_49_++)
		    ((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
			[i_49_].method3176();
		((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022 = null;
	    }
	    if (i_47_ > 256 || i_48_ > 256) {
		int i_50_ = i_47_;
		int i_51_ = i_48_;
		int i_52_ = 0;
		while (i_50_ > 256 || i_51_ > 256) {
		    if (i_50_ > 256)
			i_50_ >>= 1;
		    if (i_51_ > 256)
			i_51_ >>= 1;
		    i_52_++;
		}
		if (((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029
		    == null)
		    ((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029
			= new Class105_Sub2_Sub1(((Class241_Sub35_Sub3) this)
						 .aClass103_Sub1_10088);
		((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
		    = new Class142_Sub4[i_52_];
		i_50_ = i_47_;
		i_51_ = i_48_;
		i_52_ = 0;
		while (i_50_ > 256 || i_51_ > 256) {
		    ((Class241_Sub35_Sub3) this).aClass142_Sub4Array11022
			[i_52_++]
			= new Class142_Sub4((((Class241_Sub35_Sub3) this)
					     .aClass103_Sub1_10088),
					    3553, Class175.aClass175_2110,
					    method16379(), i_50_, i_51_);
		    if (i_50_ > 256)
			i_50_ >>= 1;
		    if (i_51_ > 256)
			i_51_ >>= 1;
		}
	    } else
		((Class241_Sub35_Sub3) this).aClass105_Sub2_Sub1_11029 = null;
	    ((Class241_Sub35_Sub3) this).anInt11035 = i_47_;
	    ((Class241_Sub35_Sub3) this).anInt11036 = i_48_;
	}
    }
    
    boolean method16375() {
	return false;
    }
    
    boolean method17437() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9201
		&& ((Class103_Sub1) (((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088)).aBool9217
		&& ((Class103_Sub1) (((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088)).aBool9212);
    }
    
    boolean method17438() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub3) this).aClass103_Sub1_10088).aBool9201
		&& ((Class103_Sub1) (((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088)).aBool9217
		&& ((Class103_Sub1) (((Class241_Sub35_Sub3) this)
				     .aClass103_Sub1_10088)).aBool9212);
    }
}
