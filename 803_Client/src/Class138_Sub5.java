/* Class138_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class138_Sub5 extends Class138
{
    static final String aString9898
	= "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
    boolean aBool9899 = false;
    Class148 aClass148_9900;
    static final String aString9901
	= "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
    boolean aBool9902 = false;
    Class144 aClass144_9903;
    
    void method3138(Class142 class142, int i) {
	if (!((Class138_Sub5) this).aBool9899) {
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    boolean method3119() {
	return ((Class138_Sub5) this).aBool9902;
    }
    
    void method3124(boolean bool) {
	Class142_Sub2 class142_sub2
	    = ((Class138_Sub5) this).aClass103_Sub1_1621.method15307();
	if (((Class138_Sub5) this).aBool9902 && class142_sub2 != null) {
	    float f
		= (1.0F
		   + (1.0F - Math.abs(((Class103_Sub1) (((Class138_Sub5) this)
							.aClass103_Sub1_1621))
				      .aFloatArray9156[1])) * 2.0F);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub5) this).aClass103_Sub1_1621
		.method15177(class142_sub2);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub5) this).aClass144_9903)
		 .aClass142_Sub3_1678);
	    int i
		= ((Class148) ((Class138_Sub5) this).aClass148_9900).anInt1704;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f
		(OpenGL.glGetUniformLocation(i, "sunDir"),
		 -(((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		   .aFloatArray9156[0]),
		 -(((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		   .aFloatArray9156[1]),
		 -(((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		   .aFloatArray9156[2]));
	    OpenGL.glUniform4f
		(OpenGL.glGetUniformLocation(i, "sunColour"),
		 (((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		  .aFloat9110) * f,
		 (((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		  .aFloat9160) * f,
		 (((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		  .aFloat9203) * f,
		 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       64.0F + Math.abs(((Class103_Sub1)
						 (((Class138_Sub5) this)
						  .aClass103_Sub1_1621))
						.aFloatArray9156[1]) * 928.0F);
	    ((Class138_Sub5) this).aBool9899 = true;
	}
    }
    
    boolean method3128() {
	return ((Class138_Sub5) this).aBool9902;
    }
    
    void method3135() {
	if (((Class138_Sub5) this).aBool9899) {
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177(null);
	    OpenGL.glUseProgram(0);
	    ((Class138_Sub5) this).aBool9899 = false;
	}
    }
    
    void method3123(int i, int i_0_) {
	if (((Class138_Sub5) this).aBool9899) {
	    int i_1_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_2_ = i_0_ & 0xffff;
	    float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
	    float f_4_ = (float) (i_0_ >> 19 & 0xf) / 16.0F;
	    float f_5_ = (float) (i_0_ >> 23 & 0xf) / 16.0F;
	    int i_6_ = i_0_ >> 27 & 0xf;
	    int i_7_
		= ((Class148) ((Class138_Sub5) this).aClass148_9900).anInt1704;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "time"),
			       (float) (i_1_
					* ((Class103_Sub1)
					   (((Class138_Sub5) this)
					    .aClass103_Sub1_1621)).anInt9091
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_,
							   "breakWaterDepth"),
			       (float) i_2_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_,
							   "breakWaterOffset"),
			       f_3_);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_7_,
							   "waveIntensity"),
			       f_5_, f_4_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_,
							   "waveExponent"),
			       (float) i_6_);
	}
    }
    
    void method3139(Class142 class142, int i) {
	if (!((Class138_Sub5) this).aBool9899) {
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    boolean method3125() {
	return ((Class138_Sub5) this).aBool9902;
    }
    
    boolean method3126() {
	return ((Class138_Sub5) this).aBool9902;
    }
    
    boolean method3127() {
	return ((Class138_Sub5) this).aBool9902;
    }
    
    void method3121(boolean bool) {
	/* empty */
    }
    
    void method3120(Class142 class142, int i) {
	if (!((Class138_Sub5) this).aBool9899) {
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    void method3132(boolean bool) {
	/* empty */
    }
    
    void method3129(boolean bool) {
	Class142_Sub2 class142_sub2
	    = ((Class138_Sub5) this).aClass103_Sub1_1621.method15307();
	if (((Class138_Sub5) this).aBool9902 && class142_sub2 != null) {
	    float f
		= (1.0F
		   + (1.0F - Math.abs(((Class103_Sub1) (((Class138_Sub5) this)
							.aClass103_Sub1_1621))
				      .aFloatArray9156[1])) * 2.0F);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub5) this).aClass103_Sub1_1621
		.method15177(class142_sub2);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177
		(((Class144) ((Class138_Sub5) this).aClass144_9903)
		 .aClass142_Sub3_1678);
	    int i
		= ((Class148) ((Class138_Sub5) this).aClass148_9900).anInt1704;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f
		(OpenGL.glGetUniformLocation(i, "sunDir"),
		 -(((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		   .aFloatArray9156[0]),
		 -(((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		   .aFloatArray9156[1]),
		 -(((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		   .aFloatArray9156[2]));
	    OpenGL.glUniform4f
		(OpenGL.glGetUniformLocation(i, "sunColour"),
		 (((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		  .aFloat9110) * f,
		 (((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		  .aFloat9160) * f,
		 (((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		  .aFloat9203) * f,
		 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       64.0F + Math.abs(((Class103_Sub1)
						 (((Class138_Sub5) this)
						  .aClass103_Sub1_1621))
						.aFloatArray9156[1]) * 928.0F);
	    ((Class138_Sub5) this).aBool9899 = true;
	}
    }
    
    void method3131() {
	if (((Class138_Sub5) this).aBool9899) {
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177(null);
	    OpenGL.glUseProgram(0);
	    ((Class138_Sub5) this).aBool9899 = false;
	}
    }
    
    void method3122(int i, int i_8_) {
	if (((Class138_Sub5) this).aBool9899) {
	    int i_9_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_10_ = i_8_ & 0xffff;
	    float f_11_ = (float) (i_8_ >> 16 & 0x3) / 8.0F;
	    float f_12_ = (float) (i_8_ >> 19 & 0xf) / 16.0F;
	    float f_13_ = (float) (i_8_ >> 23 & 0xf) / 16.0F;
	    int i_14_ = i_8_ >> 27 & 0xf;
	    int i_15_
		= ((Class148) ((Class138_Sub5) this).aClass148_9900).anInt1704;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "time"),
			       (float) (i_9_
					* ((Class103_Sub1)
					   (((Class138_Sub5) this)
					    .aClass103_Sub1_1621)).anInt9091
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_,
							   "breakWaterDepth"),
			       (float) i_10_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_,
							   "breakWaterOffset"),
			       f_11_);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_15_,
							   "waveIntensity"),
			       f_13_, f_12_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_,
							   "waveExponent"),
			       (float) i_14_);
	}
    }
    
    void method3133(int i, int i_16_) {
	if (((Class138_Sub5) this).aBool9899) {
	    int i_17_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_18_ = i_16_ & 0xffff;
	    float f_19_ = (float) (i_16_ >> 16 & 0x3) / 8.0F;
	    float f_20_ = (float) (i_16_ >> 19 & 0xf) / 16.0F;
	    float f_21_ = (float) (i_16_ >> 23 & 0xf) / 16.0F;
	    int i_22_ = i_16_ >> 27 & 0xf;
	    int i_23_
		= ((Class148) ((Class138_Sub5) this).aClass148_9900).anInt1704;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "time"),
			       (float) (i_17_
					* ((Class103_Sub1)
					   (((Class138_Sub5) this)
					    .aClass103_Sub1_1621)).anInt9091
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_,
							   "breakWaterDepth"),
			       (float) i_18_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_,
							   "breakWaterOffset"),
			       f_19_);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_23_,
							   "waveIntensity"),
			       f_21_, f_20_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_23_,
							   "waveExponent"),
			       (float) i_22_);
	}
    }
    
    void method3134(int i, int i_24_) {
	if (((Class138_Sub5) this).aBool9899) {
	    int i_25_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_26_ = i_24_ & 0xffff;
	    float f_27_ = (float) (i_24_ >> 16 & 0x3) / 8.0F;
	    float f_28_ = (float) (i_24_ >> 19 & 0xf) / 16.0F;
	    float f_29_ = (float) (i_24_ >> 23 & 0xf) / 16.0F;
	    int i_30_ = i_24_ >> 27 & 0xf;
	    int i_31_
		= ((Class148) ((Class138_Sub5) this).aClass148_9900).anInt1704;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_31_, "time"),
			       (float) (i_25_
					* ((Class103_Sub1)
					   (((Class138_Sub5) this)
					    .aClass103_Sub1_1621)).anInt9091
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_31_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_31_,
							   "breakWaterDepth"),
			       (float) i_26_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_31_,
							   "breakWaterOffset"),
			       f_27_);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_31_,
							   "waveIntensity"),
			       f_29_, f_28_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_31_,
							   "waveExponent"),
			       (float) i_30_);
	}
    }
    
    void method3130(int i, int i_32_) {
	if (((Class138_Sub5) this).aBool9899) {
	    int i_33_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_34_ = i_32_ & 0xffff;
	    float f_35_ = (float) (i_32_ >> 16 & 0x3) / 8.0F;
	    float f_36_ = (float) (i_32_ >> 19 & 0xf) / 16.0F;
	    float f_37_ = (float) (i_32_ >> 23 & 0xf) / 16.0F;
	    int i_38_ = i_32_ >> 27 & 0xf;
	    int i_39_
		= ((Class148) ((Class138_Sub5) this).aClass148_9900).anInt1704;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_39_, "time"),
			       (float) (i_33_
					* ((Class103_Sub1)
					   (((Class138_Sub5) this)
					    .aClass103_Sub1_1621)).anInt9091
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_39_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_39_,
							   "breakWaterDepth"),
			       (float) i_34_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_39_,
							   "breakWaterOffset"),
			       f_35_);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_39_,
							   "waveIntensity"),
			       f_37_, f_36_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_39_,
							   "waveExponent"),
			       (float) i_38_);
	}
    }
    
    void method3118(Class142 class142, int i) {
	if (!((Class138_Sub5) this).aBool9899) {
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    void method3137(Class142 class142, int i) {
	if (!((Class138_Sub5) this).aBool9899) {
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    void method3136() {
	if (((Class138_Sub5) this).aBool9899) {
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15225(0);
	    ((Class138_Sub5) this).aClass103_Sub1_1621.method15177(null);
	    OpenGL.glUseProgram(0);
	    ((Class138_Sub5) this).aBool9899 = false;
	}
    }
    
    Class138_Sub5(Class103_Sub1 class103_sub1, Class144 class144) {
	super(class103_sub1);
	((Class138_Sub5) this).aClass144_9903 = class144;
	if ((((Class144) ((Class138_Sub5) this).aClass144_9903)
	     .aClass142_Sub3_1678) != null
	    && (((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		.aBool9215)
	    && (((Class103_Sub1) ((Class138_Sub5) this).aClass103_Sub1_1621)
		.aBool9217)) {
	    Class156 class156
		= (Class156.method3389
		   (((Class138_Sub5) this).aClass103_Sub1_1621, 35633,
		    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
	    Class156 class156_40_
		= (Class156.method3389
		   (((Class138_Sub5) this).aClass103_Sub1_1621, 35632,
		    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
	    ((Class138_Sub5) this).aClass148_9900
		= Class148.method3226((((Class138_Sub5) this)
				       .aClass103_Sub1_1621),
				      new Class156[] { class156,
						       class156_40_ });
	    ((Class138_Sub5) this).aBool9902
		= ((Class138_Sub5) this).aClass148_9900 != null;
	}
    }
}
