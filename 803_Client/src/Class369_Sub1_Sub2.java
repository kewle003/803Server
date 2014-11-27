/* Class369_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class369_Sub1_Sub2 extends Class369_Sub1
{
    boolean aBool11172;
    Class375 aClass375_11173;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11174;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11175;
    public int anInt11176;
    Class285 aClass285_11177;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11178;
    public Class268 aClass268_11179;
    public Class287 aClass287_11180;
    public Class287 aClass287_11181;
    public int anInt11182;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11183;
    Class285 aClass285_11184;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11185;
    Class285 aClass285_11186;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11187;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11188;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11189;
    public Class285 aClass285_11190;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11191;
    public Class285 aClass285_11192;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11193;
    public Class268 aClass268_11194 = new Class268();
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11195;
    public Class287 aClass287_11196;
    public int anInt11197;
    public int anInt11198;
    boolean aBool11199;
    public int anInt11200;
    float aFloat11201;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_11202;
    Class55 aClass55_11203;
    
    public boolean method17590() {
	return ((Class369_Sub1_Sub2) this).aBool11199;
    }
    
    void method16826(boolean bool) {
	float f
	    = 1.0F + ((1.0F - Math.abs(aClass103_Sub3_5566.aFloatArray9558[1]))
		      * 2.0F);
	float f_0_ = aClass103_Sub3_5566.aFloat9609;
	aClass103_Sub3_5566.aFloat9609 *= f;
	super.method16807(bool);
	aClass103_Sub3_5566.aFloat9609 = f_0_;
    }
    
    boolean method16800() throws Exception_Sub7 {
	if (!((Class369_Sub1_Sub2) this).aClass375_11173.method6723())
	    return false;
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11174
	    = aClass116_10598.method2815("NormalSampler", (byte) -62);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11188
	    = aClass116_10598.method2815("EnvMapSampler", (byte) -115);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11191
	    = aClass116_10598.method2815("WVPMatrix", (byte) -43);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11175
	    = aClass116_10598.method2815("TexCoordMatrix", (byte) -90);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11178
	    = aClass116_10598.method2815("EyePosAndTime", (byte) -82);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11183
	    = aClass116_10598.method2815("SunDirectionAndExponent",
					 (byte) -41);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11185
	    = aClass116_10598.method2815("SunColourAndWaveExponent",
					 (byte) -103);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11187
	    = (aClass116_10598.method2815
	       ("WaveIntensityAndBreakWaterDepthAndOffset", (byte) -124));
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11189
	    = aClass116_10598.method2815("HeightFogPlane", (byte) -89);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11202
	    = aClass116_10598.method2815("HeightFogColour", (byte) -6);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11193
	    = aClass116_10598.method2815("DistanceFogPlane", (byte) -93);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11195
	    = aClass116_10598.method2815("DistanceFogColour", (byte) -8);
	((Class369_Sub1_Sub2) this).aClass55_11203
	    = aClass116_10598.method2810(((((Class369_Sub1_Sub2) this)
					   .aBool11172)
					  ? "EnvMappedSea" : "EnvMappedWater"),
					 (byte) 1);
	aClass116_10598.method2895(((Class369_Sub1_Sub2) this).aClass55_11203);
	return true;
    }
    
    void method17591() {
	((Class369_Sub1_Sub2) this).aFloat11201 = 2.4414062E-4F;
	int i = 256;
	float f = 0.3F;
	float f_1_ = 0.4F;
	float f_2_ = 0.1F;
	int i_3_ = 5;
	aClass268_11179.method5206(((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201);
	((Class369_Sub1_Sub2) this).aClass285_11184.method5548
	    (-aClass103_Sub3_5566.aFloatArray9558[0],
	     -aClass103_Sub3_5566.aFloatArray9558[1],
	     -aClass103_Sub3_5566.aFloatArray9558[2], 32.0F);
	((Class369_Sub1_Sub2) this).aClass285_11186.method5548
	    (aClass103_Sub3_5566.aFloat9563, aClass103_Sub3_5566.aFloat9564,
	     aClass103_Sub3_5566.aFloat9556, (float) i_3_);
	((Class369_Sub1_Sub2) this).aClass285_11177.method5548(f_2_, f_1_,
							       (float) i, f);
    }
    
    void method16807(boolean bool) {
	float f
	    = 1.0F + ((1.0F - Math.abs(aClass103_Sub3_5566.aFloatArray9558[1]))
		      * 2.0F);
	float f_4_ = aClass103_Sub3_5566.aFloat9609;
	aClass103_Sub3_5566.aFloat9609 *= f;
	super.method16807(bool);
	aClass103_Sub3_5566.aFloat9609 = f_4_;
    }
    
    void method16813(Class268 class268) {
	Class268 class268_5_ = new Class268();
	class268_5_.method5206(((Class369_Sub1_Sub2) this).aFloat11201,
			       ((Class369_Sub1_Sub2) this).aFloat11201, 1.0F,
			       1.0F);
	class268_5_.method5201(class268, class268_5_);
	super.method16813(class268_5_);
    }
    
    void method17592(int i) {
	((Class369_Sub1_Sub2) this).aFloat11201 = 2.4414062E-4F;
	int i_6_ = 256;
	float f = 0.3F;
	float f_7_ = 0.4F;
	float f_8_ = 0.1F;
	int i_9_ = 5;
	aClass268_11179.method5206(((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201);
	((Class369_Sub1_Sub2) this).aClass285_11184.method5548
	    (-aClass103_Sub3_5566.aFloatArray9558[0],
	     -aClass103_Sub3_5566.aFloatArray9558[1],
	     -aClass103_Sub3_5566.aFloatArray9558[2], 32.0F);
	((Class369_Sub1_Sub2) this).aClass285_11186.method5548
	    (aClass103_Sub3_5566.aFloat9563, aClass103_Sub3_5566.aFloat9564,
	     aClass103_Sub3_5566.aFloat9556, (float) i_9_);
	((Class369_Sub1_Sub2) this).aClass285_11177
	    .method5548(f_8_, f_7_, (float) i_6_, f);
    }
    
    boolean method16815() throws Exception_Sub7 {
	if (!((Class369_Sub1_Sub2) this).aClass375_11173.method6723())
	    return false;
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11174
	    = aClass116_10598.method2815("NormalSampler", (byte) -74);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11188
	    = aClass116_10598.method2815("EnvMapSampler", (byte) -21);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11191
	    = aClass116_10598.method2815("WVPMatrix", (byte) -63);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11175
	    = aClass116_10598.method2815("TexCoordMatrix", (byte) -49);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11178
	    = aClass116_10598.method2815("EyePosAndTime", (byte) -93);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11183
	    = aClass116_10598.method2815("SunDirectionAndExponent",
					 (byte) -77);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11185
	    = aClass116_10598.method2815("SunColourAndWaveExponent",
					 (byte) -75);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11187
	    = (aClass116_10598.method2815
	       ("WaveIntensityAndBreakWaterDepthAndOffset", (byte) -102));
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11189
	    = aClass116_10598.method2815("HeightFogPlane", (byte) -126);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11202
	    = aClass116_10598.method2815("HeightFogColour", (byte) -21);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11193
	    = aClass116_10598.method2815("DistanceFogPlane", (byte) -46);
	((Class369_Sub1_Sub2) this).aClass241_Sub23_Sub1_11195
	    = aClass116_10598.method2815("DistanceFogColour", (byte) -70);
	((Class369_Sub1_Sub2) this).aClass55_11203
	    = aClass116_10598.method2810(((((Class369_Sub1_Sub2) this)
					   .aBool11172)
					  ? "EnvMappedSea" : "EnvMappedWater"),
					 (byte) 1);
	aClass116_10598.method2895(((Class369_Sub1_Sub2) this).aClass55_11203);
	return true;
    }
    
    void method16823(boolean bool) {
	float f
	    = 1.0F + ((1.0F - Math.abs(aClass103_Sub3_5566.aFloatArray9558[1]))
		      * 2.0F);
	float f_10_ = aClass103_Sub3_5566.aFloat9609;
	aClass103_Sub3_5566.aFloat9609 *= f;
	super.method16807(bool);
	aClass103_Sub3_5566.aFloat9609 = f_10_;
    }
    
    public void method17593(int i) {
	method17592(-287024482);
	aClass116_10598.method2895(((Class369_Sub1_Sub2) this).aClass55_11203);
	aClass116_10598.method2805();
	aClass116_10598.method2828((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11174),
				   0,
				   (((Class369_Sub1_Sub2) this).aClass375_11173
				    .anInterface38_5629),
				   -342886340);
	aClass116_10598.method2828((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11188),
				   1, aClass103_Sub3_5566.method15636(),
				   -480526209);
	aClass116_10598.method2837((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11191),
				   aClass268_11194, (byte) -48);
	aClass116_10598.method2826((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11175),
				   aClass268_11179, 65280);
	int i_11_ = 1 << (8602901 * anInt11182 & 0x3);
	aClass116_10598.method2821((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11178),
				   aClass287_11181.aFloat4477,
				   aClass287_11181.aFloat4474,
				   aClass287_11181.aFloat4479,
				   (float) (aClass103_Sub3_5566.anInt9601
					    * i_11_ % 40000) / 40000.0F,
				   (short) -4407);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11183),
				   ((Class369_Sub1_Sub2) this).aClass285_11184,
				   16711935);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11185),
				   ((Class369_Sub1_Sub2) this).aClass285_11186,
				   16711935);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11187),
				   ((Class369_Sub1_Sub2) this).aClass285_11177,
				   16711935);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11189),
				   aClass285_11192, 16711935);
	aClass116_10598.method2822((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11202),
				   aClass287_11180, 1680093199);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11193),
				   aClass285_11190, 16711935);
	aClass116_10598.method2822((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11195),
				   aClass287_11196, -1877983189);
	aClass103_Sub3_5566.method15726(Class310.aClass310_4822,
					anInt11197 * -556923457,
					anInt11200 * -726581945,
					anInt11198 * 810204301,
					-1811199461 * anInt11176);
    }
    
    public void method17594() {
	method17592(-860089974);
	aClass116_10598.method2895(((Class369_Sub1_Sub2) this).aClass55_11203);
	aClass116_10598.method2805();
	aClass116_10598.method2828((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11174),
				   0,
				   (((Class369_Sub1_Sub2) this).aClass375_11173
				    .anInterface38_5629),
				   1367171126);
	aClass116_10598.method2828((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11188),
				   1, aClass103_Sub3_5566.method15636(),
				   1084142463);
	aClass116_10598.method2837((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11191),
				   aClass268_11194, (byte) -96);
	aClass116_10598.method2826((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11175),
				   aClass268_11179, 65280);
	int i = 1 << (8602901 * anInt11182 & 0x3);
	aClass116_10598.method2821((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11178),
				   aClass287_11181.aFloat4477,
				   aClass287_11181.aFloat4474,
				   aClass287_11181.aFloat4479,
				   (float) (aClass103_Sub3_5566.anInt9601 * i
					    % 40000) / 40000.0F,
				   (short) -15042);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11183),
				   ((Class369_Sub1_Sub2) this).aClass285_11184,
				   16711935);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11185),
				   ((Class369_Sub1_Sub2) this).aClass285_11186,
				   16711935);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11187),
				   ((Class369_Sub1_Sub2) this).aClass285_11177,
				   16711935);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11189),
				   aClass285_11192, 16711935);
	aClass116_10598.method2822((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11202),
				   aClass287_11180, 1421138984);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11193),
				   aClass285_11190, 16711935);
	aClass116_10598.method2822((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11195),
				   aClass287_11196, -1356853283);
	aClass103_Sub3_5566.method15726(Class310.aClass310_4822,
					anInt11197 * -556923457,
					anInt11200 * -726581945,
					anInt11198 * 810204301,
					-1811199461 * anInt11176);
    }
    
    public boolean method17595() {
	return ((Class369_Sub1_Sub2) this).aBool11199;
    }
    
    public void method17596() {
	method17592(-1381515298);
	aClass116_10598.method2895(((Class369_Sub1_Sub2) this).aClass55_11203);
	aClass116_10598.method2805();
	aClass116_10598.method2828((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11174),
				   0,
				   (((Class369_Sub1_Sub2) this).aClass375_11173
				    .anInterface38_5629),
				   1421619451);
	aClass116_10598.method2828((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11188),
				   1, aClass103_Sub3_5566.method15636(),
				   -39614647);
	aClass116_10598.method2837((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11191),
				   aClass268_11194, (byte) -23);
	aClass116_10598.method2826((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11175),
				   aClass268_11179, 65280);
	int i = 1 << (8602901 * anInt11182 & 0x3);
	aClass116_10598.method2821((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11178),
				   aClass287_11181.aFloat4477,
				   aClass287_11181.aFloat4474,
				   aClass287_11181.aFloat4479,
				   (float) (aClass103_Sub3_5566.anInt9601 * i
					    % 40000) / 40000.0F,
				   (short) -2707);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11183),
				   ((Class369_Sub1_Sub2) this).aClass285_11184,
				   16711935);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11185),
				   ((Class369_Sub1_Sub2) this).aClass285_11186,
				   16711935);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11187),
				   ((Class369_Sub1_Sub2) this).aClass285_11177,
				   16711935);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11189),
				   aClass285_11192, 16711935);
	aClass116_10598.method2822((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11202),
				   aClass287_11180, -346862337);
	aClass116_10598.method2823((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11193),
				   aClass285_11190, 16711935);
	aClass116_10598.method2822((((Class369_Sub1_Sub2) this)
				    .aClass241_Sub23_Sub1_11195),
				   aClass287_11196, -722588644);
	aClass103_Sub3_5566.method15726(Class310.aClass310_4822,
					anInt11197 * -556923457,
					anInt11200 * -726581945,
					anInt11198 * 810204301,
					-1811199461 * anInt11176);
    }
    
    public Class369_Sub1_Sub2(Class103_Sub3 class103_sub3, Class375 class375,
			      boolean bool) throws Exception_Sub7 {
	super(class103_sub3);
	aClass268_11179 = new Class268();
	aClass287_11181 = new Class287();
	((Class369_Sub1_Sub2) this).aClass285_11184 = new Class285();
	((Class369_Sub1_Sub2) this).aClass285_11186 = new Class285();
	((Class369_Sub1_Sub2) this).aClass285_11177 = new Class285();
	aClass285_11192 = new Class285();
	aClass287_11180 = new Class287();
	aClass285_11190 = new Class285();
	aClass287_11196 = new Class287();
	((Class369_Sub1_Sub2) this).aFloat11201 = 0.0F;
	new Class268();
	((Class369_Sub1_Sub2) this).aClass375_11173 = class375;
	((Class369_Sub1_Sub2) this).aBool11172 = bool;
	if (class103_sub3.method15605() && class103_sub3.method15606())
	    ((Class369_Sub1_Sub2) this).aBool11199
		= method16799("EnvMappedWater");
	else
	    ((Class369_Sub1_Sub2) this).aBool11199 = false;
    }
    
    public boolean method17597(int i) {
	return ((Class369_Sub1_Sub2) this).aBool11199;
    }
    
    void method17598() {
	((Class369_Sub1_Sub2) this).aFloat11201 = 2.4414062E-4F;
	int i = 256;
	float f = 0.3F;
	float f_12_ = 0.4F;
	float f_13_ = 0.1F;
	int i_14_ = 5;
	aClass268_11179.method5206(((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201);
	((Class369_Sub1_Sub2) this).aClass285_11184.method5548
	    (-aClass103_Sub3_5566.aFloatArray9558[0],
	     -aClass103_Sub3_5566.aFloatArray9558[1],
	     -aClass103_Sub3_5566.aFloatArray9558[2], 32.0F);
	((Class369_Sub1_Sub2) this).aClass285_11186.method5548
	    (aClass103_Sub3_5566.aFloat9563, aClass103_Sub3_5566.aFloat9564,
	     aClass103_Sub3_5566.aFloat9556, (float) i_14_);
	((Class369_Sub1_Sub2) this).aClass285_11177.method5548(f_13_, f_12_,
							       (float) i, f);
    }
    
    void method17599() {
	((Class369_Sub1_Sub2) this).aFloat11201 = 2.4414062E-4F;
	int i = 256;
	float f = 0.3F;
	float f_15_ = 0.4F;
	float f_16_ = 0.1F;
	int i_17_ = 5;
	aClass268_11179.method5206(((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201,
				   ((Class369_Sub1_Sub2) this).aFloat11201);
	((Class369_Sub1_Sub2) this).aClass285_11184.method5548
	    (-aClass103_Sub3_5566.aFloatArray9558[0],
	     -aClass103_Sub3_5566.aFloatArray9558[1],
	     -aClass103_Sub3_5566.aFloatArray9558[2], 32.0F);
	((Class369_Sub1_Sub2) this).aClass285_11186.method5548
	    (aClass103_Sub3_5566.aFloat9563, aClass103_Sub3_5566.aFloat9564,
	     aClass103_Sub3_5566.aFloat9556, (float) i_17_);
	((Class369_Sub1_Sub2) this).aClass285_11177.method5548(f_16_, f_15_,
							       (float) i, f);
    }
    
    static final void method17600(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).objectStackPointer -= -1650705371;
	((ClientScriptData) class454).intStackPointer -= 915295493;
	String string
	    = (String) (((ClientScriptData) class454).objectStack
			[-290357331 * ((ClientScriptData) class454).objectStackPointer]);
	boolean bool = 1 == (((ClientScriptData) class454).integerStack
			     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	boolean bool_18_
	    = ((((ClientScriptData) class454).integerStack
		[1 + 1482319719 * ((ClientScriptData) class454).intStackPointer])
	       == 1);
	boolean bool_19_
	    = 1 == (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 2]);
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4112,
					 client.aClass190_8339.packetCipher,
					 16711935);
	class241_sub27.data.writeShort
	    (Class421.getEncodedStringLength(string, -1709194542) + 1, -484048531);
	class241_sub27.data.writeString(string,
							    1052435942);
	int i_20_ = 0;
	if (bool)
	    i_20_ |= 0x1;
	if (bool_18_)
	    i_20_ |= 0x2;
	if (bool_19_)
	    i_20_ |= 0x4;
	class241_sub27.data.writeByte(i_20_, 743912299);
	client.aClass190_8339.sendPacket(class241_sub27, -1952136653);
    }
    
    public static void method17601(int i, int i_21_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(9, (long) i);
	class241_sub39_sub13.method17278((byte) -21);
    }
}
