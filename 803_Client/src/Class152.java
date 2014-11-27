/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class152
{
    static float[] aFloatArray1714 = new float[16384];
    static float[] aFloatArray1715 = new float[16384];
    
    Class152() throws Throwable {
	throw new Error();
    }
    
    static {
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    aFloatArray1714[i] = (float) Math.sin((double) i * d);
	    aFloatArray1715[i] = (float) Math.cos((double) i * d);
	}
    }
}
