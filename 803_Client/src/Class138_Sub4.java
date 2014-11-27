/* Class138_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class138_Sub4 extends Class138
{
    Class148 aClass148_9892;
    static final String aString9893
	= "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
    static final String aString9894
	= "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
    boolean aBool9895 = false;
    boolean aBool9896 = false;
    Class144 aClass144_9897;
    
    void method3130(int i, int i_0_) {
	if (((Class138_Sub4) this).aBool9895) {
	    int i_1_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_2_ = i_0_ & 0xffff;
	    float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
	    int i_4_
		= ((Class148) ((Class138_Sub4) this).aClass148_9892).anInt1704;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "time"),
			       (float) (i_1_
					* ((Class103_Sub1)
					   (((Class138_Sub4) this)
					    .aClass103_Sub1_1621)).anInt9091
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_,
							   "breakWaterDepth"),
			       (float) i_2_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_,
							   "breakWaterOffset"),
			       f_3_);
	}
    }
    
    boolean method3119() {
	return ((Class138_Sub4) this).aBool9896;
    }
    
    void method3120(Class142 class142, int i) {
	if (!((Class138_Sub4) this).aBool9895) {
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    void method3121(boolean bool) {
	/* empty */
    }
    
    boolean method3127() {
	return ((Class138_Sub4) this).aBool9896;
    }
    
    void method3123(int i, int i_5_) {
	if (((Class138_Sub4) this).aBool9895) {
	    int i_6_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_7_ = i_5_ & 0xffff;
	    float f_8_ = (float) (i_5_ >> 16 & 0x3) / 8.0F;
	    int i_9_
		= ((Class148) ((Class138_Sub4) this).aClass148_9892).anInt1704;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "time"),
			       (float) (i_6_
					* ((Class103_Sub1)
					   (((Class138_Sub4) this)
					    .aClass103_Sub1_1621)).anInt9091
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_,
							   "breakWaterDepth"),
			       (float) i_7_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_,
							   "breakWaterOffset"),
			       f_8_);
	}
    }
    
    Class138_Sub4(Class103_Sub1 class103_sub1, Class144 class144) {
	super(class103_sub1);
	((Class138_Sub4) this).aClass144_9897 = class144;
	if ((((Class144) ((Class138_Sub4) this).aClass144_9897)
	     .aClass142_Sub3_1678) != null
	    && (((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		.aBool9215)
	    && (((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		.aBool9217)) {
	    Class156 class156
		= (Class156.method3389
		   (((Class138_Sub4) this).aClass103_Sub1_1621, 35633,
		    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
	    Class156 class156_10_
		= (Class156.method3389
		   (((Class138_Sub4) this).aClass103_Sub1_1621, 35632,
		    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
	    ((Class138_Sub4) this).aClass148_9892
		= Class148.method3226((((Class138_Sub4) this)
				       .aClass103_Sub1_1621),
				      new Class156[] { class156,
						       class156_10_ });
	    ((Class138_Sub4) this).aBool9896
		= ((Class138_Sub4) this).aClass148_9892 != null;
	}
    }
    
    boolean method3125() {
	return ((Class138_Sub4) this).aBool9896;
    }
    
    void method3118(Class142 class142, int i) {
	if (!((Class138_Sub4) this).aBool9895) {
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    void method3137(Class142 class142, int i) {
	if (!((Class138_Sub4) this).aBool9895) {
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    boolean method3128() {
	return ((Class138_Sub4) this).aBool9896;
    }
    
    void method3124(boolean bool) {
	Class142_Sub2 class142_sub2
	    = ((Class138_Sub4) this).aClass103_Sub1_1621.method15307();
	if (((Class138_Sub4) this).aBool9896 && class142_sub2 != null) {
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub4) this).aClass103_Sub1_1621
		.method15177(class142_sub2);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub4) this).aClass144_9897)
		 .aClass142_Sub3_1678);
	    int i
		= ((Class148) ((Class138_Sub4) this).aClass148_9892).anInt1704;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f
		(OpenGL.glGetUniformLocation(i, "sunDir"),
		 -(((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		   .aFloatArray9156[0]),
		 -(((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		   .aFloatArray9156[1]),
		 -(((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		   .aFloatArray9156[2]));
	    OpenGL.glUniform4f
		(OpenGL.glGetUniformLocation(i, "sunColour"),
		 (((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		  .aFloat9110),
		 (((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		  .aFloat9160),
		 (((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		  .aFloat9203),
		 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(((Class103_Sub1)
						 (((Class138_Sub4) this)
						  .aClass103_Sub1_1621))
						.aFloatArray9156[1]) * 928.0F);
	    ((Class138_Sub4) this).aBool9895 = true;
	}
    }
    
    void method3132(boolean bool) {
	/* empty */
    }
    
    void method3136() {
	if (((Class138_Sub4) this).aBool9895) {
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177(null);
	    OpenGL.glUseProgram(0);
	    ((Class138_Sub4) this).aBool9895 = false;
	}
    }
    
    void method3131() {
	if (((Class138_Sub4) this).aBool9895) {
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177(null);
	    OpenGL.glUseProgram(0);
	    ((Class138_Sub4) this).aBool9895 = false;
	}
    }
    
    void method3122(int i, int i_11_) {
	if (((Class138_Sub4) this).aBool9895) {
	    int i_12_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_13_ = i_11_ & 0xffff;
	    float f_14_ = (float) (i_11_ >> 16 & 0x3) / 8.0F;
	    int i_15_
		= ((Class148) ((Class138_Sub4) this).aClass148_9892).anInt1704;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "time"),
			       (float) (i_12_
					* ((Class103_Sub1)
					   (((Class138_Sub4) this)
					    .aClass103_Sub1_1621)).anInt9091
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_,
							   "breakWaterDepth"),
			       (float) i_13_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_,
							   "breakWaterOffset"),
			       f_14_);
	}
    }
    
    void method3133(int i, int i_16_) {
	if (((Class138_Sub4) this).aBool9895) {
	    int i_17_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_18_ = i_16_ & 0xffff;
	    float f_19_ = (float) (i_16_ >> 16 & 0x3) / 8.0F;
	    int i_20_
		= ((Class148) ((Class138_Sub4) this).aClass148_9892).anInt1704;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "time"),
			       (float) (i_17_
					* ((Class103_Sub1)
					   (((Class138_Sub4) this)
					    .aClass103_Sub1_1621)).anInt9091
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_,
							   "breakWaterDepth"),
			       (float) i_18_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_,
							   "breakWaterOffset"),
			       f_19_);
	}
    }
    
    boolean method3126() {
	return ((Class138_Sub4) this).aBool9896;
    }
    
    void method3129(boolean bool) {
	Class142_Sub2 class142_sub2
	    = ((Class138_Sub4) this).aClass103_Sub1_1621.method15307();
	if (((Class138_Sub4) this).aBool9896 && class142_sub2 != null) {
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub4) this).aClass103_Sub1_1621
		.method15177(class142_sub2);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub4) this).aClass144_9897)
		 .aClass142_Sub3_1678);
	    int i
		= ((Class148) ((Class138_Sub4) this).aClass148_9892).anInt1704;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f
		(OpenGL.glGetUniformLocation(i, "sunDir"),
		 -(((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		   .aFloatArray9156[0]),
		 -(((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		   .aFloatArray9156[1]),
		 -(((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		   .aFloatArray9156[2]));
	    OpenGL.glUniform4f
		(OpenGL.glGetUniformLocation(i, "sunColour"),
		 (((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		  .aFloat9110),
		 (((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		  .aFloat9160),
		 (((Class103_Sub1) ((Class138_Sub4) this).aClass103_Sub1_1621)
		  .aFloat9203),
		 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(((Class103_Sub1)
						 (((Class138_Sub4) this)
						  .aClass103_Sub1_1621))
						.aFloatArray9156[1]) * 928.0F);
	    ((Class138_Sub4) this).aBool9895 = true;
	}
    }
    
    void method3135() {
	if (((Class138_Sub4) this).aBool9895) {
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177(null);
	    OpenGL.glUseProgram(0);
	    ((Class138_Sub4) this).aBool9895 = false;
	}
    }
    
    void method3134(int i, int i_21_) {
	if (((Class138_Sub4) this).aBool9895) {
	    int i_22_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_23_ = i_21_ & 0xffff;
	    float f_24_ = (float) (i_21_ >> 16 & 0x3) / 8.0F;
	    int i_25_
		= ((Class148) ((Class138_Sub4) this).aClass148_9892).anInt1704;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "time"),
			       (float) (i_22_
					* ((Class103_Sub1)
					   (((Class138_Sub4) this)
					    .aClass103_Sub1_1621)).anInt9091
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_,
							   "breakWaterDepth"),
			       (float) i_23_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_25_,
							   "breakWaterOffset"),
			       f_24_);
	}
    }
    
    void method3138(Class142 class142, int i) {
	if (!((Class138_Sub4) this).aBool9895) {
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    void method3139(Class142 class142, int i) {
	if (!((Class138_Sub4) this).aBool9895) {
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub4) this).aClass103_Sub1_1621.method15178(i);
	}
    }
}
