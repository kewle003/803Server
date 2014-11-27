/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class279
{
    abstract ReferenceTable method5456();
    
    Class279() {
	/* empty */
    }
    
    abstract byte[] method5457(int i, int i_0_);
    
    abstract ReferenceTable method5458(int i);
    
    abstract int method5459(int i, short i_1_);
    
    abstract void method5460(int i);
    
    abstract byte[] method5461(int i);
    
    abstract void method5462(int i, int i_2_);
    
    abstract void method5463(int i);
    
    abstract int method5464(int i);
    
    abstract int method5465(int i);
    
    public static Class332 method5466(int i, int i_3_) {
	Class332 class332
	    = (Class332) Class332.aClass129_5049.get((long) i);
	if (class332 != null)
	    return class332;
	byte[] is = Class332.aClass210_5050.getfile(0, i, -244278027);
	class332 = new Class332();
	if (is != null)
	    class332.method6046(new RSByteBuffer(is), i, 1785844985);
	Class332.aClass129_5049.put(class332, (long) i);
	return class332;
    }
    
    public static void method5467(float f, Class287 class287,
				  Class278 class278, Class287 class287_4_,
				  Class287 class287_5_, Class287 class287_6_,
				  float f_7_, float f_8_, float f_9_, int i) {
	if (!class287_4_.method5601(class287)) {
	    Class287 class287_10_ = Class287.method5561(0.0F, 0.0F, 0.0F);
	    Class287 class287_11_
		= Class287.method5562(Class287.method5578(class287_4_,
							  class287));
	    class287_11_.method5592(class278);
	    Class287 class287_12_
		= Class287.method5578(class287_11_, class287_10_);
	    float f_13_ = class287_12_.method5559();
	    if (Float.POSITIVE_INFINITY == class287_6_.aFloat4477
		|| Float.isNaN(class287.aFloat4477) || f_13_ > f_8_
		|| f_13_ < f_9_) {
		class287.method5655(class287_4_);
		class287_5_.method5645();
	    } else {
		class278.method5390();
		Class287 class287_14_ = Class287.method5561(1.0F, 0.0F, 0.0F);
		Class287 class287_15_ = Class287.method5561(0.0F, 1.0F, 0.0F);
		Class287 class287_16_ = Class287.method5561(0.0F, 0.0F, 1.0F);
		class287_14_.method5592(class278);
		class287_15_.method5592(class278);
		class287_16_.method5592(class278);
		Class287 class287_17_
		    = Class287.method5561(Class287.method5580(class287_14_,
							      class287_5_),
					  Class287.method5580(class287_15_,
							      class287_5_),
					  Class287.method5580(class287_16_,
							      class287_5_));
		Class287 class287_18_ = Class287.method5562(class287_17_);
		Class287 class287_19_
		    = (Class287.method5561
		       (class287_12_.aFloat4477 * class287_6_.aFloat4477,
			class287_12_.aFloat4474 * class287_6_.aFloat4474,
			class287_6_.aFloat4479 * class287_12_.aFloat4479));
		class287_18_.method5651(class287_19_, f);
		class287_18_.method5588(f_7_);
		Class287 class287_20_
		    = Class287.method5591(class287_14_,
					  class287_18_.aFloat4477);
		class287_20_.method5651(class287_15_, class287_18_.aFloat4474);
		class287_20_.method5651(class287_16_, class287_18_.aFloat4479);
		class287_5_.method5655(class287_20_);
		class287.method5574(Class287.method5591(class287_5_, f));
	    }
	}
    }
}
