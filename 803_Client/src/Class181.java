/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class181
{
    Class103_Sub1 aClass103_Sub1_2137;
    static final String aString2138
	= "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";
    Class148 aClass148_2139;
    
    boolean method3773() {
	if (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137).aBool9201
	    && (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137)
		.aBool9217)
	    && ((Class181) this).aClass148_2139 == null) {
	    Class156 class156
		= (Class156.method3389
		   (((Class181) this).aClass103_Sub1_2137, 35632,
		    "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (class156 != null)
		((Class181) this).aClass148_2139
		    = Class148.method3226((((Class181) this)
					   .aClass103_Sub1_2137),
					  new Class156[] { class156 });
	}
	return ((Class181) this).aClass148_2139 != null;
    }
    
    boolean method3774(Class142_Sub3 class142_sub3,
		       Class142_Sub3 class142_sub3_0_, float f) {
	if (!method3779())
	    return false;
	Class105_Sub2_Sub1 class105_sub2_sub1
	    = (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137)
	       .aClass105_Sub2_Sub1_9225);
	Class241_Sub39_Sub18 class241_sub39_sub18
	    = new Class241_Sub39_Sub18(((Class181) this).aClass103_Sub1_2137,
				       Class175.aClass175_2110,
				       Class102.aClass102_1440,
				       (((Class142_Sub3) class142_sub3)
					.anInt10639),
				       (((Class142_Sub3) class142_sub3)
					.anInt10640));
	boolean bool = false;
	((Class181) this).aClass103_Sub1_2137.method2244(class105_sub2_sub1,
							 -519163929);
	class105_sub2_sub1.method15585(0, class241_sub39_sub18);
	if (class105_sub2_sub1.method15586()) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, ((Class142_Sub3) class142_sub3).anInt10639,
			      ((Class142_Sub3) class142_sub3).anInt10640);
	    OpenGL.glUseProgram(((Class148) ((Class181) this).aClass148_2139)
				.anInt1704);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation((((Class148)
							     (((Class181) this)
							      .aClass148_2139))
							    .anInt1704),
							   "heightMap"),
			       0);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation((((Class148)
							     (((Class181) this)
							      .aClass148_2139))
							    .anInt1704),
							   "rcpRelief"),
			       1.0F / f);
	    OpenGL.glUniform2f
		(OpenGL.glGetUniformLocation((((Class148) (((Class181) this)
							   .aClass148_2139))
					      .anInt1704),
					     "sampleSize"),
		 1.0F / (float) ((Class142_Sub3) class142_sub3_0_).anInt10639,
		 1.0F / (float) ((Class142_Sub3) class142_sub3_0_).anInt10640);
	    for (int i = 0; i < ((Class142_Sub3) class142_sub3).anInt10638;
		 i++) {
		float f_1_
		    = ((float) i
		       / (float) ((Class142_Sub3) class142_sub3).anInt10638);
		((Class181) this).aClass103_Sub1_2137
		    .method15177(class142_sub3_0_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f_1_);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f_1_);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f_1_);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f_1_);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		class142_sub3.method16879
		    (0, 0, i, ((Class142_Sub3) class142_sub3).anInt10639,
		     ((Class142_Sub3) class142_sub3).anInt10640, 0, 0);
	    }
	    OpenGL.glUseProgram(0);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    bool = true;
	}
	class105_sub2_sub1.method15585(0, null);
	((Class181) this).aClass103_Sub1_2137.method2245(class105_sub2_sub1,
							 -1516203865);
	return bool;
    }
    
    boolean method3775(Class142_Sub3 class142_sub3,
		       Class142_Sub3 class142_sub3_2_, float f) {
	if (!method3779())
	    return false;
	Class105_Sub2_Sub1 class105_sub2_sub1
	    = (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137)
	       .aClass105_Sub2_Sub1_9225);
	Class241_Sub39_Sub18 class241_sub39_sub18
	    = new Class241_Sub39_Sub18(((Class181) this).aClass103_Sub1_2137,
				       Class175.aClass175_2110,
				       Class102.aClass102_1440,
				       (((Class142_Sub3) class142_sub3)
					.anInt10639),
				       (((Class142_Sub3) class142_sub3)
					.anInt10640));
	boolean bool = false;
	((Class181) this).aClass103_Sub1_2137.method2244(class105_sub2_sub1,
							 -519163929);
	class105_sub2_sub1.method15585(0, class241_sub39_sub18);
	if (class105_sub2_sub1.method15586()) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, ((Class142_Sub3) class142_sub3).anInt10639,
			      ((Class142_Sub3) class142_sub3).anInt10640);
	    OpenGL.glUseProgram(((Class148) ((Class181) this).aClass148_2139)
				.anInt1704);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation((((Class148)
							     (((Class181) this)
							      .aClass148_2139))
							    .anInt1704),
							   "heightMap"),
			       0);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation((((Class148)
							     (((Class181) this)
							      .aClass148_2139))
							    .anInt1704),
							   "rcpRelief"),
			       1.0F / f);
	    OpenGL.glUniform2f
		(OpenGL.glGetUniformLocation((((Class148) (((Class181) this)
							   .aClass148_2139))
					      .anInt1704),
					     "sampleSize"),
		 1.0F / (float) ((Class142_Sub3) class142_sub3_2_).anInt10639,
		 1.0F / (float) ((Class142_Sub3) class142_sub3_2_).anInt10640);
	    for (int i = 0; i < ((Class142_Sub3) class142_sub3).anInt10638;
		 i++) {
		float f_3_
		    = ((float) i
		       / (float) ((Class142_Sub3) class142_sub3).anInt10638);
		((Class181) this).aClass103_Sub1_2137
		    .method15177(class142_sub3_2_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f_3_);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f_3_);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f_3_);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f_3_);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		class142_sub3.method16879
		    (0, 0, i, ((Class142_Sub3) class142_sub3).anInt10639,
		     ((Class142_Sub3) class142_sub3).anInt10640, 0, 0);
	    }
	    OpenGL.glUseProgram(0);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    bool = true;
	}
	class105_sub2_sub1.method15585(0, null);
	((Class181) this).aClass103_Sub1_2137.method2245(class105_sub2_sub1,
							 -1959705177);
	return bool;
    }
    
    boolean method3776() {
	if (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137).aBool9201
	    && (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137)
		.aBool9217)
	    && ((Class181) this).aClass148_2139 == null) {
	    Class156 class156
		= (Class156.method3389
		   (((Class181) this).aClass103_Sub1_2137, 35632,
		    "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (class156 != null)
		((Class181) this).aClass148_2139
		    = Class148.method3226((((Class181) this)
					   .aClass103_Sub1_2137),
					  new Class156[] { class156 });
	}
	return ((Class181) this).aClass148_2139 != null;
    }
    
    boolean method3777() {
	if (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137).aBool9201
	    && (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137)
		.aBool9217)
	    && ((Class181) this).aClass148_2139 == null) {
	    Class156 class156
		= (Class156.method3389
		   (((Class181) this).aClass103_Sub1_2137, 35632,
		    "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (class156 != null)
		((Class181) this).aClass148_2139
		    = Class148.method3226((((Class181) this)
					   .aClass103_Sub1_2137),
					  new Class156[] { class156 });
	}
	return ((Class181) this).aClass148_2139 != null;
    }
    
    boolean method3778() {
	if (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137).aBool9201
	    && (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137)
		.aBool9217)
	    && ((Class181) this).aClass148_2139 == null) {
	    Class156 class156
		= (Class156.method3389
		   (((Class181) this).aClass103_Sub1_2137, 35632,
		    "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (class156 != null)
		((Class181) this).aClass148_2139
		    = Class148.method3226((((Class181) this)
					   .aClass103_Sub1_2137),
					  new Class156[] { class156 });
	}
	return ((Class181) this).aClass148_2139 != null;
    }
    
    boolean method3779() {
	if (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137).aBool9201
	    && (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137)
		.aBool9217)
	    && ((Class181) this).aClass148_2139 == null) {
	    Class156 class156
		= (Class156.method3389
		   (((Class181) this).aClass103_Sub1_2137, 35632,
		    "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (class156 != null)
		((Class181) this).aClass148_2139
		    = Class148.method3226((((Class181) this)
					   .aClass103_Sub1_2137),
					  new Class156[] { class156 });
	}
	return ((Class181) this).aClass148_2139 != null;
    }
    
    Class181(Class103_Sub1 class103_sub1) {
	((Class181) this).aClass103_Sub1_2137 = class103_sub1;
    }
    
    boolean method3780(Class142_Sub3 class142_sub3,
		       Class142_Sub3 class142_sub3_4_, float f) {
	if (!method3779())
	    return false;
	Class105_Sub2_Sub1 class105_sub2_sub1
	    = (((Class103_Sub1) ((Class181) this).aClass103_Sub1_2137)
	       .aClass105_Sub2_Sub1_9225);
	Class241_Sub39_Sub18 class241_sub39_sub18
	    = new Class241_Sub39_Sub18(((Class181) this).aClass103_Sub1_2137,
				       Class175.aClass175_2110,
				       Class102.aClass102_1440,
				       (((Class142_Sub3) class142_sub3)
					.anInt10639),
				       (((Class142_Sub3) class142_sub3)
					.anInt10640));
	boolean bool = false;
	((Class181) this).aClass103_Sub1_2137.method2244(class105_sub2_sub1,
							 -519163929);
	class105_sub2_sub1.method15585(0, class241_sub39_sub18);
	if (class105_sub2_sub1.method15586()) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, ((Class142_Sub3) class142_sub3).anInt10639,
			      ((Class142_Sub3) class142_sub3).anInt10640);
	    OpenGL.glUseProgram(((Class148) ((Class181) this).aClass148_2139)
				.anInt1704);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation((((Class148)
							     (((Class181) this)
							      .aClass148_2139))
							    .anInt1704),
							   "heightMap"),
			       0);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation((((Class148)
							     (((Class181) this)
							      .aClass148_2139))
							    .anInt1704),
							   "rcpRelief"),
			       1.0F / f);
	    OpenGL.glUniform2f
		(OpenGL.glGetUniformLocation((((Class148) (((Class181) this)
							   .aClass148_2139))
					      .anInt1704),
					     "sampleSize"),
		 1.0F / (float) ((Class142_Sub3) class142_sub3_4_).anInt10639,
		 1.0F / (float) ((Class142_Sub3) class142_sub3_4_).anInt10640);
	    for (int i = 0; i < ((Class142_Sub3) class142_sub3).anInt10638;
		 i++) {
		float f_5_
		    = ((float) i
		       / (float) ((Class142_Sub3) class142_sub3).anInt10638);
		((Class181) this).aClass103_Sub1_2137
		    .method15177(class142_sub3_4_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f_5_);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f_5_);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f_5_);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f_5_);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		class142_sub3.method16879
		    (0, 0, i, ((Class142_Sub3) class142_sub3).anInt10639,
		     ((Class142_Sub3) class142_sub3).anInt10640, 0, 0);
	    }
	    OpenGL.glUseProgram(0);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    bool = true;
	}
	class105_sub2_sub1.method15585(0, null);
	((Class181) this).aClass103_Sub1_2137.method2245(class105_sub2_sub1,
							 -580526863);
	return bool;
    }
}
