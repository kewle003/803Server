/* Class241_Sub35_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class241_Sub35_Sub2 extends Class241_Sub35
{
    static final String aString11007
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static float aFloat11008;
    static int anInt11009;
    static final String aString11010
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static Class180_Sub2[] aClass180_Sub2Array11011;
    static final String aString11012
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";
    static final String aString11013
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11014
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11015
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";
    static float[] aFloatArray11016 = { 0.0F, 0.0F, 0.0F };
    static final String aString11017
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11018
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    Class148[] aClass148Array11019 = null;
    
    void method16377(int i, int i_0_) {
	/* empty */
    }
    
    boolean method17430() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088)
		.aBool9217);
    }
    
    boolean method16401() {
	return ((Class241_Sub35_Sub2) this).aClass148Array11019 != null;
    }
    
    boolean method16392() {
	if (((Class103_Sub1) ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088)
	    .aBool9217) {
	    ((Class241_Sub35_Sub2) this).aClass148Array11019 = new Class148[3];
	    if (((Class103_Sub1)
		 ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088)
		.aBool9208) {
		((Class241_Sub35_Sub2) this).aClass148Array11019[0]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[1]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[2]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (((Class241_Sub35_Sub2) this).aClass148Array11019[i]
			== null)
			return false;
		}
	    } else {
		((Class241_Sub35_Sub2) this).aClass148Array11019[0]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[1]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[2]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (((Class241_Sub35_Sub2) this).aClass148Array11019[i]
			== null)
			return false;
		}
	    }
	    return ((Class241_Sub35_Sub2) this).aClass148Array11019 != null;
	}
	return false;
    }
    
    boolean method17431() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088)
		.aBool9217);
    }
    
    void method16376() {
	if (((Class241_Sub35_Sub2) this).aClass148Array11019 != null) {
	    for (int i = 0;
		 i < ((Class241_Sub35_Sub2) this).aClass148Array11019.length;
		 i++)
		((Class241_Sub35_Sub2) this).aClass148Array11019[i] = null;
	    ((Class241_Sub35_Sub2) this).aClass148Array11019 = null;
	}
    }
    
    void method16378(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_1_) {
	if (anInt11009 >= 1 && anInt11009 <= 3) {
	    int i_2_ = (((Class148) (((Class241_Sub35_Sub2) this)
				     .aClass148Array11019[anInt11009 - 1]))
			.anInt1704);
	    OpenGL.glUseProgram(i_2_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_2_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_2_,
							   "paramsWeightings"),
			       aFloat11008, aFloatArray11016[0],
			       aFloatArray11016[1], aFloatArray11016[2]);
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088.method15225(0);
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
		.method15177(class142_sub4);
	    for (int i_3_ = anInt11009 - 1; i_3_ >= 0; i_3_--) {
		if (aClass180_Sub2Array11011[i_3_] != null) {
		    if (i_3_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_2_, "remap_1"), 1);
		    if (i_3_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_2_, "remap_2"), 2);
		    if (i_3_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_2_, "remap_3"), 3);
		    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
			.method15225(i_3_ + 1);
		    Class142 class142
			= aClass180_Sub2Array11011[i_3_].method16033();
		    if (class142 != null)
			((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
			    .method15177(class142);
		}
	    }
	}
    }
    
    void method16385(int i) {
	OpenGL.glUseProgram(0);
	for (int i_4_ = anInt11009; i_4_ >= 0; i_4_--) {
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
		.method15225(i_4_);
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
		.method15177(null);
	}
    }
    
    int method16381() {
	return 2;
    }
    
    void method16393(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_5_) {
	if (anInt11009 >= 1 && anInt11009 <= 3) {
	    int i_6_ = (((Class148) (((Class241_Sub35_Sub2) this)
				     .aClass148Array11019[anInt11009 - 1]))
			.anInt1704);
	    OpenGL.glUseProgram(i_6_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_6_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_6_,
							   "paramsWeightings"),
			       aFloat11008, aFloatArray11016[0],
			       aFloatArray11016[1], aFloatArray11016[2]);
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088.method15225(0);
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
		.method15177(class142_sub4);
	    for (int i_7_ = anInt11009 - 1; i_7_ >= 0; i_7_--) {
		if (aClass180_Sub2Array11011[i_7_] != null) {
		    if (i_7_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_6_, "remap_1"), 1);
		    if (i_7_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_6_, "remap_2"), 2);
		    if (i_7_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_6_, "remap_3"), 3);
		    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
			.method15225(i_7_ + 1);
		    Class142 class142
			= aClass180_Sub2Array11011[i_7_].method16033();
		    if (class142 != null)
			((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
			    .method15177(class142);
		}
	    }
	}
    }
    
    boolean method16374() {
	return (aFloat11008 == 1.0F
		|| (aFloatArray11016[0] + aFloatArray11016[1]
		    + aFloatArray11016[2]) == 0.0F
		|| (aClass180_Sub2Array11011[0] == null
		    && aClass180_Sub2Array11011[1] == null
		    && aClass180_Sub2Array11011[2] == null));
    }
    
    static {
	aFloat11008 = 1.0F;
	anInt11009 = 1;
	aClass180_Sub2Array11011 = new Class180_Sub2[] { null, null, null };
    }
    
    boolean method16386() {
	return ((Class241_Sub35_Sub2) this).aClass148Array11019 != null;
    }
    
    Class102 method16379() {
	return Class102.aClass102_1440;
    }
    
    void method16403(int i) {
	OpenGL.glUseProgram(0);
	for (int i_8_ = anInt11009; i_8_ >= 0; i_8_--) {
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
		.method15225(i_8_);
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
		.method15177(null);
	}
    }
    
    void method16389() {
	if (((Class241_Sub35_Sub2) this).aClass148Array11019 != null) {
	    for (int i = 0;
		 i < ((Class241_Sub35_Sub2) this).aClass148Array11019.length;
		 i++)
		((Class241_Sub35_Sub2) this).aClass148Array11019[i] = null;
	    ((Class241_Sub35_Sub2) this).aClass148Array11019 = null;
	}
    }
    
    void method16390(int i, int i_9_) {
	/* empty */
    }
    
    boolean method16387() {
	if (((Class103_Sub1) ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088)
	    .aBool9217) {
	    ((Class241_Sub35_Sub2) this).aClass148Array11019 = new Class148[3];
	    if (((Class103_Sub1)
		 ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088)
		.aBool9208) {
		((Class241_Sub35_Sub2) this).aClass148Array11019[0]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[1]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[2]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (((Class241_Sub35_Sub2) this).aClass148Array11019[i]
			== null)
			return false;
		}
	    } else {
		((Class241_Sub35_Sub2) this).aClass148Array11019[0]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[1]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[2]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (((Class241_Sub35_Sub2) this).aClass148Array11019[i]
			== null)
			return false;
		}
	    }
	    return ((Class241_Sub35_Sub2) this).aClass148Array11019 != null;
	}
	return false;
    }
    
    boolean method17432() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088)
		.aBool9217);
    }
    
    void method16398(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_10_) {
	if (anInt11009 >= 1 && anInt11009 <= 3) {
	    int i_11_ = (((Class148) (((Class241_Sub35_Sub2) this)
				      .aClass148Array11019[anInt11009 - 1]))
			 .anInt1704);
	    OpenGL.glUseProgram(i_11_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_11_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_11_,
							   "paramsWeightings"),
			       aFloat11008, aFloatArray11016[0],
			       aFloatArray11016[1], aFloatArray11016[2]);
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088.method15225(0);
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
		.method15177(class142_sub4);
	    for (int i_12_ = anInt11009 - 1; i_12_ >= 0; i_12_--) {
		if (aClass180_Sub2Array11011[i_12_] != null) {
		    if (i_12_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_11_, "remap_1"), 1);
		    if (i_12_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_11_, "remap_2"), 2);
		    if (i_12_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_11_, "remap_3"), 3);
		    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
			.method15225(i_12_ + 1);
		    Class142 class142
			= aClass180_Sub2Array11011[i_12_].method16033();
		    if (class142 != null)
			((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
			    .method15177(class142);
		}
	    }
	}
    }
    
    void method16394(int i, Class142_Sub4 class142_sub4,
		     Class142_Sub4 class142_sub4_13_) {
	if (anInt11009 >= 1 && anInt11009 <= 3) {
	    int i_14_ = (((Class148) (((Class241_Sub35_Sub2) this)
				      .aClass148Array11019[anInt11009 - 1]))
			 .anInt1704);
	    OpenGL.glUseProgram(i_14_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_14_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_14_,
							   "paramsWeightings"),
			       aFloat11008, aFloatArray11016[0],
			       aFloatArray11016[1], aFloatArray11016[2]);
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088.method15225(0);
	    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
		.method15177(class142_sub4);
	    for (int i_15_ = anInt11009 - 1; i_15_ >= 0; i_15_--) {
		if (aClass180_Sub2Array11011[i_15_] != null) {
		    if (i_15_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_14_, "remap_1"), 1);
		    if (i_15_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_14_, "remap_2"), 2);
		    if (i_15_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_14_, "remap_3"), 3);
		    ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
			.method15225(i_15_ + 1);
		    Class142 class142
			= aClass180_Sub2Array11011[i_15_].method16033();
		    if (class142 != null)
			((Class241_Sub35_Sub2) this).aClass103_Sub1_10088
			    .method15177(class142);
		}
	    }
	}
    }
    
    int method16407() {
	return 2;
    }
    
    Class102 method16399() {
	return Class102.aClass102_1440;
    }
    
    Class102 method16391() {
	return Class102.aClass102_1440;
    }
    
    boolean method16375() {
	return (aFloat11008 == 1.0F
		|| (aFloatArray11016[0] + aFloatArray11016[1]
		    + aFloatArray11016[2]) == 0.0F
		|| (aClass180_Sub2Array11011[0] == null
		    && aClass180_Sub2Array11011[1] == null
		    && aClass180_Sub2Array11011[2] == null));
    }
    
    boolean method16404() {
	return (aFloat11008 == 1.0F
		|| (aFloatArray11016[0] + aFloatArray11016[1]
		    + aFloatArray11016[2]) == 0.0F
		|| (aClass180_Sub2Array11011[0] == null
		    && aClass180_Sub2Array11011[1] == null
		    && aClass180_Sub2Array11011[2] == null));
    }
    
    int method16405() {
	return 2;
    }
    
    int method16406() {
	return 2;
    }
    
    boolean method17433() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088)
		.aBool9217);
    }
    
    int method16408() {
	return 2;
    }
    
    int method16395() {
	return 2;
    }
    
    Class241_Sub35_Sub2(Class103_Sub1 class103_sub1) {
	super(class103_sub1);
    }
    
    void method16373(int i, int i_16_) {
	/* empty */
    }
    
    boolean method17434() {
	return (((Class103_Sub1)
		 ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088)
		.aBool9217);
    }
    
    boolean method16388() {
	if (((Class103_Sub1) ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088)
	    .aBool9217) {
	    ((Class241_Sub35_Sub2) this).aClass148Array11019 = new Class148[3];
	    if (((Class103_Sub1)
		 ((Class241_Sub35_Sub2) this).aClass103_Sub1_10088)
		.aBool9208) {
		((Class241_Sub35_Sub2) this).aClass148Array11019[0]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[1]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[2]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (((Class241_Sub35_Sub2) this).aClass148Array11019[i]
			== null)
			return false;
		}
	    } else {
		((Class241_Sub35_Sub2) this).aClass148Array11019[0]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[1]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class241_Sub35_Sub2) this).aClass148Array11019[2]
		    = (Class148.method3226
		       (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			(new Class156[]
			 { Class156.method3389
			   (((Class241_Sub35_Sub2) this).aClass103_Sub1_10088,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (((Class241_Sub35_Sub2) this).aClass148Array11019[i]
			== null)
			return false;
		}
	    }
	    return ((Class241_Sub35_Sub2) this).aClass148Array11019 != null;
	}
	return false;
    }
}
