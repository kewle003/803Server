/* Class241_Sub35_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class241_Sub35_Sub1 extends Class241_Sub35
{
    static float aFloat10997;
    static float aFloat10998;
    static final String aString10999
	= "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";
    static float aFloat11000;
    static float aFloat11001 = 1.0F;
    static float aFloat11002;
    Class148 aClass148_11003;
    
    boolean method16387() {
	if (((Class103_Sub1) ((Class241_Sub35_Sub1) this).aClass103_Sub1_10088)
	    .aBool9217) {
	    ((Class241_Sub35_Sub1) this).aClass148_11003
		= (Class148.method3226
		   (((Class241_Sub35_Sub1) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub1) this).aClass103_Sub1_10088,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
	    return ((Class241_Sub35_Sub1) this).aClass148_11003 != null;
	}
	return false;
    }
    
    boolean method17426() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub1) this).aClass103_Sub1_10088)
		.aBool9217);
    }
    
    Class241_Sub35_Sub1(Class103_Sub1 class103_sub1) {
	super(class103_sub1);
    }
    
    boolean method16392() {
	if (((Class103_Sub1) ((Class241_Sub35_Sub1) this).aClass103_Sub1_10088)
	    .aBool9217) {
	    ((Class241_Sub35_Sub1) this).aClass148_11003
		= (Class148.method3226
		   (((Class241_Sub35_Sub1) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub1) this).aClass103_Sub1_10088,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
	    return ((Class241_Sub35_Sub1) this).aClass148_11003 != null;
	}
	return false;
    }
    
    void method16377(int i, int i_0_) {
	/* empty */
    }
    
    void method16376() {
	((Class241_Sub35_Sub1) this).aClass148_11003 = null;
    }
    
    void method16378(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_1_) {
	int i_2_ = (((Class148) ((Class241_Sub35_Sub1) this).aClass148_11003)
		    .anInt1704);
	OpenGL.glUseProgram(i_2_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_2_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_2_, "paramsGamma"),
			   aFloat11001);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_2_, "paramsRanges"),
			   aFloat10998, aFloat10997, aFloat11000, aFloat11002);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088.method15225(0);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088
	    .method15177(class142_sub4);
    }
    
    boolean method16388() {
	if (((Class103_Sub1) ((Class241_Sub35_Sub1) this).aClass103_Sub1_10088)
	    .aBool9217) {
	    ((Class241_Sub35_Sub1) this).aClass148_11003
		= (Class148.method3226
		   (((Class241_Sub35_Sub1) this).aClass103_Sub1_10088,
		    (new Class156[]
		     { Class156.method3389
		       (((Class241_Sub35_Sub1) this).aClass103_Sub1_10088,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
	    return ((Class241_Sub35_Sub1) this).aClass148_11003 != null;
	}
	return false;
    }
    
    boolean method16374() {
	return (aFloat11001 == 1.0F && aFloat10998 == 0.0F
		&& aFloat10997 == 1.0F && aFloat11000 == 0.0F
		&& aFloat11002 == 1.0F);
    }
    
    int method16381() {
	return 1;
    }
    
    int method16407() {
	return 1;
    }
    
    boolean method16375() {
	return (aFloat11001 == 1.0F && aFloat10998 == 0.0F
		&& aFloat10997 == 1.0F && aFloat11000 == 0.0F
		&& aFloat11002 == 1.0F);
    }
    
    boolean method16386() {
	return ((Class241_Sub35_Sub1) this).aClass148_11003 != null;
    }
    
    int method16408() {
	return 1;
    }
    
    static {
	aFloat10998 = 0.0F;
	aFloat10997 = 1.0F;
	aFloat11000 = 0.0F;
	aFloat11002 = 1.0F;
    }
    
    void method16390(int i, int i_3_) {
	/* empty */
    }
    
    Class102 method16379() {
	return Class102.aClass102_1440;
    }
    
    void method16373(int i, int i_4_) {
	/* empty */
    }
    
    void method16393(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_5_) {
	int i_6_ = (((Class148) ((Class241_Sub35_Sub1) this).aClass148_11003)
		    .anInt1704);
	OpenGL.glUseProgram(i_6_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_6_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_6_, "paramsGamma"),
			   aFloat11001);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_6_, "paramsRanges"),
			   aFloat10998, aFloat10997, aFloat11000, aFloat11002);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088.method15225(0);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088
	    .method15177(class142_sub4);
    }
    
    void method16389() {
	((Class241_Sub35_Sub1) this).aClass148_11003 = null;
    }
    
    void method16394(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_7_) {
	int i_8_ = (((Class148) ((Class241_Sub35_Sub1) this).aClass148_11003)
		    .anInt1704);
	OpenGL.glUseProgram(i_8_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_8_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "paramsGamma"),
			   aFloat11001);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_8_, "paramsRanges"),
			   aFloat10998, aFloat10997, aFloat11000, aFloat11002);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088.method15225(0);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088
	    .method15177(class142_sub4);
    }
    
    void method16403(int i) {
	OpenGL.glUseProgram(0);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088.method15225(0);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088.method15177(null);
    }
    
    void method16398(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_9_) {
	int i_10_ = (((Class148) ((Class241_Sub35_Sub1) this).aClass148_11003)
		     .anInt1704);
	OpenGL.glUseProgram(i_10_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "paramsGamma"),
			   aFloat11001);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_10_, "paramsRanges"),
			   aFloat10998, aFloat10997, aFloat11000, aFloat11002);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088.method15225(0);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088
	    .method15177(class142_sub4);
    }
    
    Class102 method16391() {
	return Class102.aClass102_1440;
    }
    
    boolean method16401() {
	return ((Class241_Sub35_Sub1) this).aClass148_11003 != null;
    }
    
    boolean method16404() {
	return (aFloat11001 == 1.0F && aFloat10998 == 0.0F
		&& aFloat10997 == 1.0F && aFloat11000 == 0.0F
		&& aFloat11002 == 1.0F);
    }
    
    boolean method17427() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub1) this).aClass103_Sub1_10088)
		.aBool9217);
    }
    
    boolean method17428() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub1) this).aClass103_Sub1_10088)
		.aBool9217);
    }
    
    boolean method17429() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub1) this).aClass103_Sub1_10088)
		.aBool9217);
    }
    
    int method16405() {
	return 1;
    }
    
    int method16406() {
	return 1;
    }
    
    void method16385(int i) {
	OpenGL.glUseProgram(0);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088.method15225(0);
	((Class241_Sub35_Sub1) this).aClass103_Sub1_10088.method15177(null);
    }
    
    Class102 method16399() {
	return Class102.aClass102_1440;
    }
    
    int method16395() {
	return 1;
    }
}
