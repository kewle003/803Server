/* Exception_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub3 extends Exception
{
    public String aString10692;
    public int anInt10693;
    static String[] aStringArray10694;
    public static int anInt10695;
    
    Exception_Sub3(int i, String string, Throwable throwable) {
	super(throwable);
	aString10692 = string;
	anInt10693 = i * 164364423;
    }
    
    Exception_Sub3(int i, String string) {
	this(i, string, null);
    }
    
    static final void method16944
	(Entity class475_sub1_sub1_sub3, int i) {
	int i_0_ = (class475_sub1_sub1_sub3.anInt11386 * 1663546767
		    - client.anInt8296);
	int i_1_ = (1372226048 * class475_sub1_sub1_sub3.anInt11401
		    + class475_sub1_sub1_sub3.method17782(1062263153) * 256);
	int i_2_ = (-1002156544 * class475_sub1_sub1_sub3.anInt11403
		    + class475_sub1_sub1_sub3.method17782(1480478787) * 256);
	Class287 class287
	    = class475_sub1_sub1_sub3.method10874().aClass287_4386;
	class475_sub1_sub1_sub3.method10880
	    ((float) ((i_1_ - (int) class287.aFloat4477) / i_0_
		      + (int) class287.aFloat4477),
	     (float) (int) class287.aFloat4474,
	     (float) ((i_2_ - (int) class287.aFloat4479) / i_0_
		      + (int) class287.aFloat4479));
	class475_sub1_sub1_sub3.anInt11429 = 0;
	class475_sub1_sub1_sub3.method17804((class475_sub1_sub1_sub3.anInt11407
					     * 161672197),
					    1524173078);
    }
}
