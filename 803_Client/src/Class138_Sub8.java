/* Class138_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class138_Sub8 extends Class138
{
    static final String aString10005
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
    boolean aBool10006;
    static final String aString10007
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
    static final String aString10008
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
    boolean aBool10009;
    static float[] aFloatArray10010 = { 0.0F, -1.0F, 0.0F, 0.0F };
    boolean aBool10011;
    boolean aBool10012 = false;
    Class142_Sub4 aClass142_Sub4_10013;
    Class153 aClass153_10014;
    Class153 aClass153_10015;
    Class153 aClass153_10016;
    Class153 aClass153_10017;
    static final String aString10018
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
    
    void method3121(boolean bool) {
	/* empty */
    }
    
    boolean method3119() {
	return ((Class138_Sub8) this).aBool10009;
    }
    
    void method3124(boolean bool) {
	((Class138_Sub8) this).aBool10011 = bool;
	((Class138_Sub8) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub8) this).aClass103_Sub1_1621
	    .method15177(((Class138_Sub8) this).aClass142_Sub4_10013);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15180(34165, 7681);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 34166, 768);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15181(2, 5890, 770);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 34168, 770);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15225(0);
	method16278();
    }
    
    void method3135() {
	if (((Class138_Sub8) this).aBool10006) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    ((Class138_Sub8) this).aBool10006 = false;
	}
	((Class138_Sub8) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15177(null);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15180(8448, 8448);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 5890, 768);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15181(2, 34166, 770);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 5890, 770);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15225(0);
	if (((Class138_Sub8) this).aBool10012) {
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 5890,
								   768);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	    ((Class138_Sub8) this).aBool10012 = false;
	}
    }
    
    void method3129(boolean bool) {
	((Class138_Sub8) this).aBool10011 = bool;
	((Class138_Sub8) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub8) this).aClass103_Sub1_1621
	    .method15177(((Class138_Sub8) this).aClass142_Sub4_10013);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15180(34165, 7681);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 34166, 768);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15181(2, 5890, 770);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 34168, 770);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15225(0);
	method16278();
    }
    
    Class138_Sub8(Class103_Sub1 class103_sub1) {
	super(class103_sub1);
	if (((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
	    .aBool9214) {
	    ((Class138_Sub8) this).aClass153_10017
		= (Class153.method3236
		   (((Class138_Sub8) this).aClass103_Sub1_1621, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
	    ((Class138_Sub8) this).aClass153_10016
		= (Class153.method3236
		   (((Class138_Sub8) this).aClass103_Sub1_1621, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
	    ((Class138_Sub8) this).aClass153_10015
		= (Class153.method3236
		   (((Class138_Sub8) this).aClass103_Sub1_1621, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
	    ((Class138_Sub8) this).aClass153_10014
		= (Class153.method3236
		   (((Class138_Sub8) this).aClass103_Sub1_1621, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
	    if (((Class138_Sub8) this).aClass153_10017 != null
		& ((Class138_Sub8) this).aClass153_10016 != null
		& ((Class138_Sub8) this).aClass153_10015 != null
		& ((Class138_Sub8) this).aClass153_10014 != null) {
		((Class138_Sub8) this).aClass142_Sub4_10013
		    = new Class142_Sub4(class103_sub1, 3553,
					Class175.aClass175_2112,
					Class102.aClass102_1440, 2, 1, false,
					new byte[] { 0, -1 },
					Class175.aClass175_2112, false);
		((Class138_Sub8) this).aClass142_Sub4_10013.method16906(false,
									false);
		((Class138_Sub8) this).aBool10009 = true;
	    } else
		((Class138_Sub8) this).aBool10009 = false;
	} else
	    ((Class138_Sub8) this).aBool10009 = false;
    }
    
    void method16277() {
	if (((Class138_Sub8) this).aBool10006) {
	    float f
		= (((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .aFloat9134);
	    float f_0_
		= (((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .aFloat9133);
	    float f_1_ = f - (f - f_0_) * 0.125F;
	    float f_2_ = f - (f - f_0_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_2_, f_1_,
		 256.0F / (float) ((((Class103_Sub1) (((Class138_Sub8) this)
						      .aClass103_Sub1_1621))
				    .aClass86_9039.anInt1252)
				   * -1282025259),
		 (float) ((((Class103_Sub1)
			    ((Class138_Sub8) this).aClass103_Sub1_1621)
			   .aClass86_9039.anInt1253)
			  * 642800105) / 255.0F);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15211
		((((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		  .aClass86_9039.anInt1251) * 1897985763);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15225(0);
	}
    }
    
    void method3118(Class142 class142, int i) {
	if (class142 == null) {
	    if (!((Class138_Sub8) this).aBool10012) {
		((Class138_Sub8) this).aClass103_Sub1_1621.method15177
		    (((Class103_Sub1)
		      ((Class138_Sub8) this).aClass103_Sub1_1621)
		     .aClass142_Sub4_9190);
		((Class138_Sub8) this).aClass103_Sub1_1621.method15178(1);
		((Class138_Sub8) this).aClass103_Sub1_1621
		    .method15181(0, 34168, 768);
		((Class138_Sub8) this).aClass103_Sub1_1621
		    .method15352(0, 34168, 770);
		((Class138_Sub8) this).aBool10012 = true;
	    }
	} else {
	    if (((Class138_Sub8) this).aBool10012) {
		((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 5890,
								       768);
		((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 5890,
								       770);
		((Class138_Sub8) this).aBool10012 = false;
	    }
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    void method3137(Class142 class142, int i) {
	if (class142 == null) {
	    if (!((Class138_Sub8) this).aBool10012) {
		((Class138_Sub8) this).aClass103_Sub1_1621.method15177
		    (((Class103_Sub1)
		      ((Class138_Sub8) this).aClass103_Sub1_1621)
		     .aClass142_Sub4_9190);
		((Class138_Sub8) this).aClass103_Sub1_1621.method15178(1);
		((Class138_Sub8) this).aClass103_Sub1_1621
		    .method15181(0, 34168, 768);
		((Class138_Sub8) this).aClass103_Sub1_1621
		    .method15352(0, 34168, 770);
		((Class138_Sub8) this).aBool10012 = true;
	    }
	} else {
	    if (((Class138_Sub8) this).aBool10012) {
		((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 5890,
								       768);
		((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 5890,
								       770);
		((Class138_Sub8) this).aBool10012 = false;
	    }
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    void method3138(Class142 class142, int i) {
	if (class142 == null) {
	    if (!((Class138_Sub8) this).aBool10012) {
		((Class138_Sub8) this).aClass103_Sub1_1621.method15177
		    (((Class103_Sub1)
		      ((Class138_Sub8) this).aClass103_Sub1_1621)
		     .aClass142_Sub4_9190);
		((Class138_Sub8) this).aClass103_Sub1_1621.method15178(1);
		((Class138_Sub8) this).aClass103_Sub1_1621
		    .method15181(0, 34168, 768);
		((Class138_Sub8) this).aClass103_Sub1_1621
		    .method15352(0, 34168, 770);
		((Class138_Sub8) this).aBool10012 = true;
	    }
	} else {
	    if (((Class138_Sub8) this).aBool10012) {
		((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 5890,
								       768);
		((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 5890,
								       770);
		((Class138_Sub8) this).aBool10012 = false;
	    }
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    boolean method3128() {
	return ((Class138_Sub8) this).aBool10009;
    }
    
    boolean method3126() {
	return ((Class138_Sub8) this).aBool10009;
    }
    
    boolean method3127() {
	return ((Class138_Sub8) this).aBool10009;
    }
    
    void method16278() {
	Class268 class268
	    = (((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
	       .aClass268_9150);
	if (((Class138_Sub8) this).aBool10011)
	    OpenGL.glBindProgramARB
		(34336,
		 ((((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .anInt9180) == 2147483647
		  ? (((Class153) ((Class138_Sub8) this).aClass153_10016)
		     .anInt1718)
		  : (((Class153) ((Class138_Sub8) this).aClass153_10014)
		     .anInt1718)));
	else
	    OpenGL.glBindProgramARB
		(34336,
		 ((((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .anInt9180) == 2147483647
		  ? (((Class153) ((Class138_Sub8) this).aClass153_10017)
		     .anInt1718)
		  : (((Class153) ((Class138_Sub8) this).aClass153_10015)
		     .anInt1718)));
	float f = (float) ((Class103_Sub1) (((Class138_Sub8) this)
					    .aClass103_Sub1_1621)).anInt9180;
	float f_3_
	    = class268.aFloatArray4353[4] * f + class268.aFloatArray4353[12];
	float f_4_
	    = class268.aFloatArray4353[5] * f + class268.aFloatArray4353[13];
	float f_5_
	    = class268.aFloatArray4353[6] * f + class268.aFloatArray4353[14];
	aFloatArray10010[0] = -class268.aFloatArray4353[4];
	aFloatArray10010[1] = -class268.aFloatArray4353[5];
	aFloatArray10010[2] = -class268.aFloatArray4353[6];
	aFloatArray10010[3]
	    = -(aFloatArray10010[0] * f_3_ + aFloatArray10010[1] * f_4_
		+ aFloatArray10010[2] * f_5_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray10010[0],
					    aFloatArray10010[1],
					    aFloatArray10010[2],
					    aFloatArray10010[3]);
	OpenGL.glEnable(34336);
	((Class138_Sub8) this).aBool10006 = true;
	method16277();
    }
    
    void method16279() {
	Class268 class268
	    = (((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
	       .aClass268_9150);
	if (((Class138_Sub8) this).aBool10011)
	    OpenGL.glBindProgramARB
		(34336,
		 ((((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .anInt9180) == 2147483647
		  ? (((Class153) ((Class138_Sub8) this).aClass153_10016)
		     .anInt1718)
		  : (((Class153) ((Class138_Sub8) this).aClass153_10014)
		     .anInt1718)));
	else
	    OpenGL.glBindProgramARB
		(34336,
		 ((((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .anInt9180) == 2147483647
		  ? (((Class153) ((Class138_Sub8) this).aClass153_10017)
		     .anInt1718)
		  : (((Class153) ((Class138_Sub8) this).aClass153_10015)
		     .anInt1718)));
	float f = (float) ((Class103_Sub1) (((Class138_Sub8) this)
					    .aClass103_Sub1_1621)).anInt9180;
	float f_6_
	    = class268.aFloatArray4353[4] * f + class268.aFloatArray4353[12];
	float f_7_
	    = class268.aFloatArray4353[5] * f + class268.aFloatArray4353[13];
	float f_8_
	    = class268.aFloatArray4353[6] * f + class268.aFloatArray4353[14];
	aFloatArray10010[0] = -class268.aFloatArray4353[4];
	aFloatArray10010[1] = -class268.aFloatArray4353[5];
	aFloatArray10010[2] = -class268.aFloatArray4353[6];
	aFloatArray10010[3]
	    = -(aFloatArray10010[0] * f_6_ + aFloatArray10010[1] * f_7_
		+ aFloatArray10010[2] * f_8_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray10010[0],
					    aFloatArray10010[1],
					    aFloatArray10010[2],
					    aFloatArray10010[3]);
	OpenGL.glEnable(34336);
	((Class138_Sub8) this).aBool10006 = true;
	method16277();
    }
    
    void method3132(boolean bool) {
	/* empty */
    }
    
    boolean method3125() {
	return ((Class138_Sub8) this).aBool10009;
    }
    
    void method3131() {
	if (((Class138_Sub8) this).aBool10006) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    ((Class138_Sub8) this).aBool10006 = false;
	}
	((Class138_Sub8) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15177(null);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15180(8448, 8448);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 5890, 768);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15181(2, 34166, 770);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 5890, 770);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15225(0);
	if (((Class138_Sub8) this).aBool10012) {
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 5890,
								   768);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	    ((Class138_Sub8) this).aBool10012 = false;
	}
    }
    
    void method3122(int i, int i_9_) {
	/* empty */
    }
    
    void method3133(int i, int i_10_) {
	/* empty */
    }
    
    void method3134(int i, int i_11_) {
	/* empty */
    }
    
    void method16280() {
	Class268 class268
	    = (((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
	       .aClass268_9150);
	if (((Class138_Sub8) this).aBool10011)
	    OpenGL.glBindProgramARB
		(34336,
		 ((((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .anInt9180) == 2147483647
		  ? (((Class153) ((Class138_Sub8) this).aClass153_10016)
		     .anInt1718)
		  : (((Class153) ((Class138_Sub8) this).aClass153_10014)
		     .anInt1718)));
	else
	    OpenGL.glBindProgramARB
		(34336,
		 ((((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .anInt9180) == 2147483647
		  ? (((Class153) ((Class138_Sub8) this).aClass153_10017)
		     .anInt1718)
		  : (((Class153) ((Class138_Sub8) this).aClass153_10015)
		     .anInt1718)));
	float f = (float) ((Class103_Sub1) (((Class138_Sub8) this)
					    .aClass103_Sub1_1621)).anInt9180;
	float f_12_
	    = class268.aFloatArray4353[4] * f + class268.aFloatArray4353[12];
	float f_13_
	    = class268.aFloatArray4353[5] * f + class268.aFloatArray4353[13];
	float f_14_
	    = class268.aFloatArray4353[6] * f + class268.aFloatArray4353[14];
	aFloatArray10010[0] = -class268.aFloatArray4353[4];
	aFloatArray10010[1] = -class268.aFloatArray4353[5];
	aFloatArray10010[2] = -class268.aFloatArray4353[6];
	aFloatArray10010[3]
	    = -(aFloatArray10010[0] * f_12_ + aFloatArray10010[1] * f_13_
		+ aFloatArray10010[2] * f_14_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray10010[0],
					    aFloatArray10010[1],
					    aFloatArray10010[2],
					    aFloatArray10010[3]);
	OpenGL.glEnable(34336);
	((Class138_Sub8) this).aBool10006 = true;
	method16277();
    }
    
    void method3120(Class142 class142, int i) {
	if (class142 == null) {
	    if (!((Class138_Sub8) this).aBool10012) {
		((Class138_Sub8) this).aClass103_Sub1_1621.method15177
		    (((Class103_Sub1)
		      ((Class138_Sub8) this).aClass103_Sub1_1621)
		     .aClass142_Sub4_9190);
		((Class138_Sub8) this).aClass103_Sub1_1621.method15178(1);
		((Class138_Sub8) this).aClass103_Sub1_1621
		    .method15181(0, 34168, 768);
		((Class138_Sub8) this).aClass103_Sub1_1621
		    .method15352(0, 34168, 770);
		((Class138_Sub8) this).aBool10012 = true;
	    }
	} else {
	    if (((Class138_Sub8) this).aBool10012) {
		((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 5890,
								       768);
		((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 5890,
								       770);
		((Class138_Sub8) this).aBool10012 = false;
	    }
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    void method3136() {
	if (((Class138_Sub8) this).aBool10006) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    ((Class138_Sub8) this).aBool10006 = false;
	}
	((Class138_Sub8) this).aClass103_Sub1_1621.method15225(1);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15177(null);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15180(8448, 8448);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 5890, 768);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15181(2, 34166, 770);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 5890, 770);
	((Class138_Sub8) this).aClass103_Sub1_1621.method15225(0);
	if (((Class138_Sub8) this).aBool10012) {
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 5890,
								   768);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 5890,
								   770);
	    ((Class138_Sub8) this).aBool10012 = false;
	}
    }
    
    void method3130(int i, int i_15_) {
	/* empty */
    }
    
    void method3139(Class142 class142, int i) {
	if (class142 == null) {
	    if (!((Class138_Sub8) this).aBool10012) {
		((Class138_Sub8) this).aClass103_Sub1_1621.method15177
		    (((Class103_Sub1)
		      ((Class138_Sub8) this).aClass103_Sub1_1621)
		     .aClass142_Sub4_9190);
		((Class138_Sub8) this).aClass103_Sub1_1621.method15178(1);
		((Class138_Sub8) this).aClass103_Sub1_1621
		    .method15181(0, 34168, 768);
		((Class138_Sub8) this).aClass103_Sub1_1621
		    .method15352(0, 34168, 770);
		((Class138_Sub8) this).aBool10012 = true;
	    }
	} else {
	    if (((Class138_Sub8) this).aBool10012) {
		((Class138_Sub8) this).aClass103_Sub1_1621.method15181(0, 5890,
								       768);
		((Class138_Sub8) this).aClass103_Sub1_1621.method15352(0, 5890,
								       770);
		((Class138_Sub8) this).aBool10012 = false;
	    }
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15177(class142);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15178(i);
	}
    }
    
    void method3123(int i, int i_16_) {
	/* empty */
    }
    
    void method16281() {
	Class268 class268
	    = (((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
	       .aClass268_9150);
	if (((Class138_Sub8) this).aBool10011)
	    OpenGL.glBindProgramARB
		(34336,
		 ((((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .anInt9180) == 2147483647
		  ? (((Class153) ((Class138_Sub8) this).aClass153_10016)
		     .anInt1718)
		  : (((Class153) ((Class138_Sub8) this).aClass153_10014)
		     .anInt1718)));
	else
	    OpenGL.glBindProgramARB
		(34336,
		 ((((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .anInt9180) == 2147483647
		  ? (((Class153) ((Class138_Sub8) this).aClass153_10017)
		     .anInt1718)
		  : (((Class153) ((Class138_Sub8) this).aClass153_10015)
		     .anInt1718)));
	float f = (float) ((Class103_Sub1) (((Class138_Sub8) this)
					    .aClass103_Sub1_1621)).anInt9180;
	float f_17_
	    = class268.aFloatArray4353[4] * f + class268.aFloatArray4353[12];
	float f_18_
	    = class268.aFloatArray4353[5] * f + class268.aFloatArray4353[13];
	float f_19_
	    = class268.aFloatArray4353[6] * f + class268.aFloatArray4353[14];
	aFloatArray10010[0] = -class268.aFloatArray4353[4];
	aFloatArray10010[1] = -class268.aFloatArray4353[5];
	aFloatArray10010[2] = -class268.aFloatArray4353[6];
	aFloatArray10010[3]
	    = -(aFloatArray10010[0] * f_17_ + aFloatArray10010[1] * f_18_
		+ aFloatArray10010[2] * f_19_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray10010[0],
					    aFloatArray10010[1],
					    aFloatArray10010[2],
					    aFloatArray10010[3]);
	OpenGL.glEnable(34336);
	((Class138_Sub8) this).aBool10006 = true;
	method16277();
    }
    
    void method16282() {
	if (((Class138_Sub8) this).aBool10006) {
	    float f
		= (((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .aFloat9134);
	    float f_20_
		= (((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .aFloat9133);
	    float f_21_ = f - (f - f_20_) * 0.125F;
	    float f_22_ = f - (f - f_20_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_22_, f_21_,
		 256.0F / (float) ((((Class103_Sub1) (((Class138_Sub8) this)
						      .aClass103_Sub1_1621))
				    .aClass86_9039.anInt1252)
				   * -1282025259),
		 (float) ((((Class103_Sub1)
			    ((Class138_Sub8) this).aClass103_Sub1_1621)
			   .aClass86_9039.anInt1253)
			  * 642800105) / 255.0F);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15211
		((((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		  .aClass86_9039.anInt1251) * 1897985763);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15225(0);
	}
    }
    
    void method16283() {
	if (((Class138_Sub8) this).aBool10006) {
	    float f
		= (((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .aFloat9134);
	    float f_23_
		= (((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		   .aFloat9133);
	    float f_24_ = f - (f - f_23_) * 0.125F;
	    float f_25_ = f - (f - f_23_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_25_, f_24_,
		 256.0F / (float) ((((Class103_Sub1) (((Class138_Sub8) this)
						      .aClass103_Sub1_1621))
				    .aClass86_9039.anInt1252)
				   * -1282025259),
		 (float) ((((Class103_Sub1)
			    ((Class138_Sub8) this).aClass103_Sub1_1621)
			   .aClass86_9039.anInt1253)
			  * 642800105) / 255.0F);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15225(1);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15211
		((((Class103_Sub1) ((Class138_Sub8) this).aClass103_Sub1_1621)
		  .aClass86_9039.anInt1251) * 1897985763);
	    ((Class138_Sub8) this).aClass103_Sub1_1621.method15225(0);
	}
    }
}
