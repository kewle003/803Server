/* Class138_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class138_Sub2 extends Class138
{
    Class153 aClass153_9882;
    static final char aChar9883 = '\0';
    static final char aChar9884 = '\001';
    Class137 aClass137_9885;
    int anInt9886;
    static final String aString9887
	= "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
    float aFloat9888;
    float[] aFloatArray9889;
    Class144 aClass144_9890;
    static float[] aFloatArray9891 = new float[4];
    
    void method3136() {
	if (((Class138_Sub2) this).aClass137_9885 != null) {
	    ((Class138_Sub2) this).aClass137_9885.method3113('\001');
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	}
    }
    
    boolean method3119() {
	return true;
    }
    
    void method16211() {
	((Class138_Sub2) this).aClass137_9885
	    = new Class137(((Class138_Sub2) this).aClass103_Sub1_1621, 2);
	((Class138_Sub2) this).aClass137_9885.method3112(0);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15211(-16777216);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15180(260, 7681);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15352(0, 34166, 770);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glBindProgramARB(34336,
				((Class153) (((Class138_Sub2) this)
					     .aClass153_9882)).anInt1718);
	OpenGL.glEnable(34336);
	((Class138_Sub2) this).aClass137_9885.method3114();
	((Class138_Sub2) this).aClass137_9885.method3112(1);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15178(0);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15352(0, 5890, 770);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	OpenGL.glDisable(34820);
	((Class138_Sub2) this).aClass137_9885.method3114();
    }
    
    void method3124(boolean bool) {
	if (((Class138_Sub2) this).aClass137_9885 != null) {
	    ((Class138_Sub2) this).aClass137_9885.method3113('\0');
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((((Class103_Sub1)
				   ((Class138_Sub2) this).aClass103_Sub1_1621)
				  .aClass268_9121.aFloatArray4353),
				 0);
	    OpenGL.glMatrixMode(5888);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	    if (((Class138_Sub2) this).anInt9886
		!= ((Class103_Sub1)
		    ((Class138_Sub2) this).aClass103_Sub1_1621).anInt9091) {
		int i = (((Class103_Sub1)
			  ((Class138_Sub2) this).aClass103_Sub1_1621).anInt9091
			 % 5000 * 128 / 5000);
		for (int i_0_ = 0; i_0_ < 64; i_0_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_0_,
							 (((Class138_Sub2)
							   this)
							  .aFloatArray9889),
							 i);
		    i += 2;
		}
		if (((Class144) ((Class138_Sub2) this).aClass144_9890)
		    .aBool1679)
		    ((Class138_Sub2) this).aFloat9888
			= (float) ((((Class103_Sub1) (((Class138_Sub2) this)
						      .aClass103_Sub1_1621))
				    .anInt9091)
				   % 4000) / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		((Class138_Sub2) this).anInt9886
		    = ((Class103_Sub1)
		       ((Class138_Sub2) this).aClass103_Sub1_1621).anInt9091;
	    }
	}
    }
    
    void method3121(boolean bool) {
	/* empty */
    }
    
    Class138_Sub2(Class103_Sub1 class103_sub1, Class144 class144) {
	super(class103_sub1);
	((Class138_Sub2) this).aClass144_9890 = class144;
	if ((((Class103_Sub1) ((Class138_Sub2) this).aClass103_Sub1_1621)
	     .aBool9214)
	    && (((Class103_Sub1) ((Class138_Sub2) this).aClass103_Sub1_1621)
		.anInt9198) >= 2) {
	    ((Class138_Sub2) this).aClass153_9882
		= (Class153.method3236
		   (((Class138_Sub2) this).aClass103_Sub1_1621, 34336,
		    "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
	    if (((Class138_Sub2) this).aClass153_9882 != null) {
		int[][] is = Class218_Sub1.method16530(64, 256, 0, 4, 4, 3,
						       0.4F, false, 599321189);
		int[][] is_1_
		    = Class218_Sub1.method16530(64, 256, 8, 4, 4, 3, 0.4F,
						false, 599321189);
		int i = 0;
		((Class138_Sub2) this).aFloatArray9889 = new float[32768];
		for (int i_2_ = 0; i_2_ < 256; i_2_++) {
		    int[] is_3_ = is[i_2_];
		    int[] is_4_ = is_1_[i_2_];
		    for (int i_5_ = 0; i_5_ < 64; i_5_++) {
			((Class138_Sub2) this).aFloatArray9889[i++]
			    = (float) is_3_[i_5_] / 4096.0F;
			((Class138_Sub2) this).aFloatArray9889[i++]
			    = (float) is_4_[i_5_] / 4096.0F;
		    }
		}
		method16211();
	    }
	}
    }
    
    boolean method3127() {
	return true;
    }
    
    void method3118(Class142 class142, int i) {
	((Class138_Sub2) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15178(i);
    }
    
    void method3123(int i, int i_6_) {
	if (((Class138_Sub2) this).aClass137_9885 != null) {
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	    if ((i & 0x80) == 0) {
		if ((i_6_ & 0x1) == 1) {
		    if (!((Class144) ((Class138_Sub2) this).aClass144_9890)
			 .aBool1679) {
			int i_7_ = ((((Class103_Sub1) (((Class138_Sub2) this)
						       .aClass103_Sub1_1621))
				     .anInt9091)
				    % 4000 * 16 / 4000);
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub4Array1680[i_7_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub3_1684);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    ((Class138_Sub2)
							     this).aFloat9888,
							    0.0F, 0.0F, 1.0F);
		    }
		} else {
		    if (((Class144) ((Class138_Sub2) this).aClass144_9890)
			.aBool1679)
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub3_1684);
		    else
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub4Array1680[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		((Class138_Sub2) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	    if ((i & 0x40) == 0) {
		aFloatArray9891[0]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9110);
		aFloatArray9891[1]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9160);
		aFloatArray9891[2]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9203);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray9891, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_8_ = i & 0x3;
	    if (i_8_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_8_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    boolean method3125() {
	return true;
    }
    
    boolean method3126() {
	return true;
    }
    
    void method16212() {
	((Class138_Sub2) this).aClass137_9885
	    = new Class137(((Class138_Sub2) this).aClass103_Sub1_1621, 2);
	((Class138_Sub2) this).aClass137_9885.method3112(0);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15211(-16777216);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15180(260, 7681);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15352(0, 34166, 770);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glBindProgramARB(34336,
				((Class153) (((Class138_Sub2) this)
					     .aClass153_9882)).anInt1718);
	OpenGL.glEnable(34336);
	((Class138_Sub2) this).aClass137_9885.method3114();
	((Class138_Sub2) this).aClass137_9885.method3112(1);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15178(0);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15352(0, 5890, 770);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	OpenGL.glDisable(34820);
	((Class138_Sub2) this).aClass137_9885.method3114();
    }
    
    void method3138(Class142 class142, int i) {
	((Class138_Sub2) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15178(i);
    }
    
    void method3129(boolean bool) {
	if (((Class138_Sub2) this).aClass137_9885 != null) {
	    ((Class138_Sub2) this).aClass137_9885.method3113('\0');
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((((Class103_Sub1)
				   ((Class138_Sub2) this).aClass103_Sub1_1621)
				  .aClass268_9121.aFloatArray4353),
				 0);
	    OpenGL.glMatrixMode(5888);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	    if (((Class138_Sub2) this).anInt9886
		!= ((Class103_Sub1)
		    ((Class138_Sub2) this).aClass103_Sub1_1621).anInt9091) {
		int i = (((Class103_Sub1)
			  ((Class138_Sub2) this).aClass103_Sub1_1621).anInt9091
			 % 5000 * 128 / 5000);
		for (int i_9_ = 0; i_9_ < 64; i_9_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_9_,
							 (((Class138_Sub2)
							   this)
							  .aFloatArray9889),
							 i);
		    i += 2;
		}
		if (((Class144) ((Class138_Sub2) this).aClass144_9890)
		    .aBool1679)
		    ((Class138_Sub2) this).aFloat9888
			= (float) ((((Class103_Sub1) (((Class138_Sub2) this)
						      .aClass103_Sub1_1621))
				    .anInt9091)
				   % 4000) / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		((Class138_Sub2) this).anInt9886
		    = ((Class103_Sub1)
		       ((Class138_Sub2) this).aClass103_Sub1_1621).anInt9091;
	    }
	}
    }
    
    void method16213() {
	((Class138_Sub2) this).aClass137_9885
	    = new Class137(((Class138_Sub2) this).aClass103_Sub1_1621, 2);
	((Class138_Sub2) this).aClass137_9885.method3112(0);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15211(-16777216);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15180(260, 7681);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15352(0, 34166, 770);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glBindProgramARB(34336,
				((Class153) (((Class138_Sub2) this)
					     .aClass153_9882)).anInt1718);
	OpenGL.glEnable(34336);
	((Class138_Sub2) this).aClass137_9885.method3114();
	((Class138_Sub2) this).aClass137_9885.method3112(1);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15178(0);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15352(0, 5890, 770);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	OpenGL.glDisable(34820);
	((Class138_Sub2) this).aClass137_9885.method3114();
    }
    
    boolean method3128() {
	return true;
    }
    
    void method3132(boolean bool) {
	/* empty */
    }
    
    void method3139(Class142 class142, int i) {
	((Class138_Sub2) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15178(i);
    }
    
    void method16214() {
	((Class138_Sub2) this).aClass137_9885
	    = new Class137(((Class138_Sub2) this).aClass103_Sub1_1621, 2);
	((Class138_Sub2) this).aClass137_9885.method3112(0);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15211(-16777216);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15180(260, 7681);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15352(0, 34166, 770);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glBindProgramARB(34336,
				((Class153) (((Class138_Sub2) this)
					     .aClass153_9882)).anInt1718);
	OpenGL.glEnable(34336);
	((Class138_Sub2) this).aClass137_9885.method3114();
	((Class138_Sub2) this).aClass137_9885.method3112(1);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15178(0);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15352(0, 5890, 770);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	OpenGL.glDisable(34820);
	((Class138_Sub2) this).aClass137_9885.method3114();
    }
    
    void method3131() {
	if (((Class138_Sub2) this).aClass137_9885 != null) {
	    ((Class138_Sub2) this).aClass137_9885.method3113('\001');
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	}
    }
    
    void method3122(int i, int i_10_) {
	if (((Class138_Sub2) this).aClass137_9885 != null) {
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	    if ((i & 0x80) == 0) {
		if ((i_10_ & 0x1) == 1) {
		    if (!((Class144) ((Class138_Sub2) this).aClass144_9890)
			 .aBool1679) {
			int i_11_ = ((((Class103_Sub1) (((Class138_Sub2) this)
							.aClass103_Sub1_1621))
				      .anInt9091)
				     % 4000 * 16 / 4000);
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub4Array1680[i_11_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub3_1684);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    ((Class138_Sub2)
							     this).aFloat9888,
							    0.0F, 0.0F, 1.0F);
		    }
		} else {
		    if (((Class144) ((Class138_Sub2) this).aClass144_9890)
			.aBool1679)
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub3_1684);
		    else
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub4Array1680[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		((Class138_Sub2) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	    if ((i & 0x40) == 0) {
		aFloatArray9891[0]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9110);
		aFloatArray9891[1]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9160);
		aFloatArray9891[2]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9203);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray9891, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_12_ = i & 0x3;
	    if (i_12_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_12_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    void method3133(int i, int i_13_) {
	if (((Class138_Sub2) this).aClass137_9885 != null) {
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	    if ((i & 0x80) == 0) {
		if ((i_13_ & 0x1) == 1) {
		    if (!((Class144) ((Class138_Sub2) this).aClass144_9890)
			 .aBool1679) {
			int i_14_ = ((((Class103_Sub1) (((Class138_Sub2) this)
							.aClass103_Sub1_1621))
				      .anInt9091)
				     % 4000 * 16 / 4000);
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub4Array1680[i_14_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub3_1684);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    ((Class138_Sub2)
							     this).aFloat9888,
							    0.0F, 0.0F, 1.0F);
		    }
		} else {
		    if (((Class144) ((Class138_Sub2) this).aClass144_9890)
			.aBool1679)
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub3_1684);
		    else
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub4Array1680[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		((Class138_Sub2) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	    if ((i & 0x40) == 0) {
		aFloatArray9891[0]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9110);
		aFloatArray9891[1]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9160);
		aFloatArray9891[2]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9203);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray9891, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_15_ = i & 0x3;
	    if (i_15_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_15_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    void method3134(int i, int i_16_) {
	if (((Class138_Sub2) this).aClass137_9885 != null) {
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	    if ((i & 0x80) == 0) {
		if ((i_16_ & 0x1) == 1) {
		    if (!((Class144) ((Class138_Sub2) this).aClass144_9890)
			 .aBool1679) {
			int i_17_ = ((((Class103_Sub1) (((Class138_Sub2) this)
							.aClass103_Sub1_1621))
				      .anInt9091)
				     % 4000 * 16 / 4000);
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub4Array1680[i_17_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub3_1684);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    ((Class138_Sub2)
							     this).aFloat9888,
							    0.0F, 0.0F, 1.0F);
		    }
		} else {
		    if (((Class144) ((Class138_Sub2) this).aClass144_9890)
			.aBool1679)
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub3_1684);
		    else
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub4Array1680[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		((Class138_Sub2) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	    if ((i & 0x40) == 0) {
		aFloatArray9891[0]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9110);
		aFloatArray9891[1]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9160);
		aFloatArray9891[2]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9203);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray9891, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_18_ = i & 0x3;
	    if (i_18_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_18_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    void method3130(int i, int i_19_) {
	if (((Class138_Sub2) this).aClass137_9885 != null) {
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	    if ((i & 0x80) == 0) {
		if ((i_19_ & 0x1) == 1) {
		    if (!((Class144) ((Class138_Sub2) this).aClass144_9890)
			 .aBool1679) {
			int i_20_ = ((((Class103_Sub1) (((Class138_Sub2) this)
							.aClass103_Sub1_1621))
				      .anInt9091)
				     % 4000 * 16 / 4000);
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub4Array1680[i_20_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub3_1684);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    ((Class138_Sub2)
							     this).aFloat9888,
							    0.0F, 0.0F, 1.0F);
		    }
		} else {
		    if (((Class144) ((Class138_Sub2) this).aClass144_9890)
			.aBool1679)
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub3_1684);
		    else
			((Class138_Sub2) this).aClass103_Sub1_1621.method15177
			    (((Class144) ((Class138_Sub2) this).aClass144_9890)
			     .aClass142_Sub4Array1680[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		((Class138_Sub2) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	    if ((i & 0x40) == 0) {
		aFloatArray9891[0]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9110);
		aFloatArray9891[1]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9160);
		aFloatArray9891[2]
		    = (((Class103_Sub1)
			((Class138_Sub2) this).aClass103_Sub1_1621).aFloat9162
		       * ((Class103_Sub1) (((Class138_Sub2) this)
					   .aClass103_Sub1_1621)).aFloat9203);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray9891, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_21_ = i & 0x3;
	    if (i_21_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_21_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    void method3120(Class142 class142, int i) {
	((Class138_Sub2) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15178(i);
    }
    
    void method3137(Class142 class142, int i) {
	((Class138_Sub2) this).aClass103_Sub1_1621.method15177(class142);
	((Class138_Sub2) this).aClass103_Sub1_1621.method15178(i);
    }
    
    void method3135() {
	if (((Class138_Sub2) this).aClass137_9885 != null) {
	    ((Class138_Sub2) this).aClass137_9885.method3113('\001');
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15177(null);
	    ((Class138_Sub2) this).aClass103_Sub1_1621.method15225(0);
	}
    }
}
