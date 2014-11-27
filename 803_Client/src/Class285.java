/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class285
{
    public float aFloat4451;
    public float aFloat4452;
    public float aFloat4453;
    public float aFloat4454;
    
    public void method5524(Class285 class285_0_) {
	method5548(class285_0_.aFloat4454, class285_0_.aFloat4452,
		   class285_0_.aFloat4453, class285_0_.aFloat4451);
    }
    
    public void method5525(Class285 class285_1_) {
	method5548(class285_1_.aFloat4454, class285_1_.aFloat4452,
		   class285_1_.aFloat4453, class285_1_.aFloat4451);
    }
    
    public final void method5526(Class268 class268) {
	float f = aFloat4454;
	float f_2_ = aFloat4452;
	float f_3_ = aFloat4453;
	float f_4_ = aFloat4451;
	aFloat4454 = (class268.aFloatArray4353[0] * f
		      + class268.aFloatArray4353[4] * f_2_
		      + class268.aFloatArray4353[8] * f_3_
		      + class268.aFloatArray4353[12] * f_4_);
	aFloat4452 = (class268.aFloatArray4353[1] * f
		      + class268.aFloatArray4353[5] * f_2_
		      + class268.aFloatArray4353[9] * f_3_
		      + class268.aFloatArray4353[13] * f_4_);
	aFloat4453 = (class268.aFloatArray4353[2] * f
		      + class268.aFloatArray4353[6] * f_2_
		      + class268.aFloatArray4353[10] * f_3_
		      + class268.aFloatArray4353[14] * f_4_);
	aFloat4451 = (class268.aFloatArray4353[3] * f
		      + class268.aFloatArray4353[7] * f_2_
		      + class268.aFloatArray4353[11] * f_3_
		      + class268.aFloatArray4353[15] * f_4_);
    }
    
    final void method5527() {
	aFloat4451 = 0.0F;
	aFloat4453 = 0.0F;
	aFloat4452 = 0.0F;
	aFloat4454 = 0.0F;
    }
    
    public void method5528(int i) {
	method5548((float) (i >> 16 & 0xff) * 0.003921569F,
		   (float) (i >> 8 & 0xff) * 0.003921569F,
		   (float) (i >> 0 & 0xff) * 0.003921569F,
		   (float) (i >> 24 & 0xff) * 0.003921569F);
    }
    
    final void method5529() {
	aFloat4451 = 0.0F;
	aFloat4453 = 0.0F;
	aFloat4452 = 0.0F;
	aFloat4454 = 0.0F;
    }
    
    public final void method5530(float f) {
	aFloat4454 *= f;
	aFloat4452 *= f;
	aFloat4453 *= f;
	aFloat4451 *= f;
    }
    
    public final void method5531(float f) {
	aFloat4454 *= f;
	aFloat4452 *= f;
	aFloat4453 *= f;
	aFloat4451 *= f;
    }
    
    public final void method5532() {
	aFloat4454 = -aFloat4454;
	aFloat4452 = -aFloat4452;
	aFloat4453 = -aFloat4453;
	aFloat4451 = -aFloat4451;
    }
    
    public String toString() {
	return new StringBuilder().append(aFloat4454).append(",").append
		   (aFloat4452).append
		   (",").append
		   (aFloat4453).append
		   (",").append
		   (aFloat4451).toString();
    }
    
    public String method5533() {
	return new StringBuilder().append(aFloat4454).append(",").append
		   (aFloat4452).append
		   (",").append
		   (aFloat4453).append
		   (",").append
		   (aFloat4451).toString();
    }
    
    public String method5534() {
	return new StringBuilder().append(aFloat4454).append(",").append
		   (aFloat4452).append
		   (",").append
		   (aFloat4453).append
		   (",").append
		   (aFloat4451).toString();
    }
    
    public String method5535() {
	return new StringBuilder().append(aFloat4454).append(",").append
		   (aFloat4452).append
		   (",").append
		   (aFloat4453).append
		   (",").append
		   (aFloat4451).toString();
    }
    
    public void method5536(float f, float f_5_, float f_6_, float f_7_) {
	aFloat4454 = f;
	aFloat4452 = f_5_;
	aFloat4453 = f_6_;
	aFloat4451 = f_7_;
    }
    
    public void method5537(int i) {
	method5548((float) (i >> 16 & 0xff) * 0.003921569F,
		   (float) (i >> 8 & 0xff) * 0.003921569F,
		   (float) (i >> 0 & 0xff) * 0.003921569F,
		   (float) (i >> 24 & 0xff) * 0.003921569F);
    }
    
    public void method5538(Class285 class285_8_) {
	method5548(class285_8_.aFloat4454, class285_8_.aFloat4452,
		   class285_8_.aFloat4453, class285_8_.aFloat4451);
    }
    
    public Class285(float f, float f_9_, float f_10_, float f_11_) {
	method5548(f, f_9_, f_10_, f_11_);
    }
    
    public void method5539(int i) {
	method5548((float) (i >> 16 & 0xff) * 0.003921569F,
		   (float) (i >> 8 & 0xff) * 0.003921569F,
		   (float) (i >> 0 & 0xff) * 0.003921569F,
		   (float) (i >> 24 & 0xff) * 0.003921569F);
    }
    
    public final void method5540() {
	aFloat4454 = -aFloat4454;
	aFloat4452 = -aFloat4452;
	aFloat4453 = -aFloat4453;
	aFloat4451 = -aFloat4451;
    }
    
    final void method5541() {
	aFloat4451 = 0.0F;
	aFloat4453 = 0.0F;
	aFloat4452 = 0.0F;
	aFloat4454 = 0.0F;
    }
    
    final void method5542() {
	aFloat4451 = 0.0F;
	aFloat4453 = 0.0F;
	aFloat4452 = 0.0F;
	aFloat4454 = 0.0F;
    }
    
    public final void method5543(Class268 class268) {
	float f = aFloat4454;
	float f_12_ = aFloat4452;
	float f_13_ = aFloat4453;
	float f_14_ = aFloat4451;
	aFloat4454 = (class268.aFloatArray4353[0] * f
		      + class268.aFloatArray4353[4] * f_12_
		      + class268.aFloatArray4353[8] * f_13_
		      + class268.aFloatArray4353[12] * f_14_);
	aFloat4452 = (class268.aFloatArray4353[1] * f
		      + class268.aFloatArray4353[5] * f_12_
		      + class268.aFloatArray4353[9] * f_13_
		      + class268.aFloatArray4353[13] * f_14_);
	aFloat4453 = (class268.aFloatArray4353[2] * f
		      + class268.aFloatArray4353[6] * f_12_
		      + class268.aFloatArray4353[10] * f_13_
		      + class268.aFloatArray4353[14] * f_14_);
	aFloat4451 = (class268.aFloatArray4353[3] * f
		      + class268.aFloatArray4353[7] * f_12_
		      + class268.aFloatArray4353[11] * f_13_
		      + class268.aFloatArray4353[15] * f_14_);
    }
    
    public final void method5544() {
	aFloat4454 = -aFloat4454;
	aFloat4452 = -aFloat4452;
	aFloat4453 = -aFloat4453;
	aFloat4451 = -aFloat4451;
    }
    
    public Class285() {
	method5529();
    }
    
    public final void method5545() {
	aFloat4454 = -aFloat4454;
	aFloat4452 = -aFloat4452;
	aFloat4453 = -aFloat4453;
	aFloat4451 = -aFloat4451;
    }
    
    public final void method5546() {
	aFloat4454 = -aFloat4454;
	aFloat4452 = -aFloat4452;
	aFloat4453 = -aFloat4453;
	aFloat4451 = -aFloat4451;
    }
    
    public final void method5547(float f) {
	aFloat4454 *= f;
	aFloat4452 *= f;
	aFloat4453 *= f;
	aFloat4451 *= f;
    }
    
    public void method5548(float f, float f_15_, float f_16_, float f_17_) {
	aFloat4454 = f;
	aFloat4452 = f_15_;
	aFloat4453 = f_16_;
	aFloat4451 = f_17_;
    }
    
    public final void method5549(float f) {
	aFloat4454 *= f;
	aFloat4452 *= f;
	aFloat4453 *= f;
	aFloat4451 *= f;
    }
    
    public final void method5550() {
	aFloat4454 = -aFloat4454;
	aFloat4452 = -aFloat4452;
	aFloat4453 = -aFloat4453;
	aFloat4451 = -aFloat4451;
    }
    
    public final void method5551(Class268 class268) {
	float f = aFloat4454;
	float f_18_ = aFloat4452;
	float f_19_ = aFloat4453;
	float f_20_ = aFloat4451;
	aFloat4454 = (class268.aFloatArray4353[0] * f
		      + class268.aFloatArray4353[4] * f_18_
		      + class268.aFloatArray4353[8] * f_19_
		      + class268.aFloatArray4353[12] * f_20_);
	aFloat4452 = (class268.aFloatArray4353[1] * f
		      + class268.aFloatArray4353[5] * f_18_
		      + class268.aFloatArray4353[9] * f_19_
		      + class268.aFloatArray4353[13] * f_20_);
	aFloat4453 = (class268.aFloatArray4353[2] * f
		      + class268.aFloatArray4353[6] * f_18_
		      + class268.aFloatArray4353[10] * f_19_
		      + class268.aFloatArray4353[14] * f_20_);
	aFloat4451 = (class268.aFloatArray4353[3] * f
		      + class268.aFloatArray4353[7] * f_18_
		      + class268.aFloatArray4353[11] * f_19_
		      + class268.aFloatArray4353[15] * f_20_);
    }
}
