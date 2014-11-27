/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282
{
    public static final int anInt4429 = 10240;
    public static int[] anIntArray4430 = new int[16384];
    public static final int anInt4431 = 16384;
    public static final int anInt4432 = 14;
    public static final double aDouble4433 = 2607.5945876176133;
    public static final int anInt4434 = 14336;
    public static final int anInt4435 = 14;
    public static final int anInt4436 = 1024;
    public static final int anInt4437 = 2048;
    public static final int anInt4438 = 4096;
    public static final int anInt4439 = 6144;
    public static final int anInt4440 = 8192;
    public static int[] anIntArray4441 = new int[16384];
    public static final int anInt4442 = 16383;
    public static final int anInt4443 = 16384;
    public static final int anInt4444 = 16384;
    public static final int anInt4445 = 16383;
    public static final int anInt4446 = 12288;
    
    public static float method5490(int i) {
	i &= 0x3fff;
	return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
    }
    
    Class282() throws Throwable {
	throw new Error();
    }
    
    static {
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    anIntArray4430[i] = (int) (16384.0 * Math.sin((double) i * d));
	    anIntArray4441[i] = (int) (16384.0 * Math.cos((double) i * d));
	}
    }
    
    public static float method5491(int i) {
	i &= 0x3fff;
	return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
    }
    
    public static float method5492(int i) {
	i &= 0x3fff;
	return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
    }
    
    public static float method5493(int i) {
	i &= 0x3fff;
	return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
    }
}
