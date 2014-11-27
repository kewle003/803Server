/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class269
{
    static float[] aFloatArray4355;
    static float[] aFloatArray4356 = new float[16384];
    
    static {
	aFloatArray4355 = new float[16384];
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    aFloatArray4356[i] = (float) Math.sin((double) i * d);
	    aFloatArray4355[i] = (float) Math.cos((double) i * d);
	}
    }
    
    Class269() throws Throwable {
	throw new Error();
    }
}
