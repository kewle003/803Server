/* Class120_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub1 extends Class120
{
    int anInt9031;
    int anInt9032;
    
    public void method2958(int i) {
	Class25.aClass93Array213
	    [((Class120_Sub1) this).anInt9032 * -625034773].method2083
	    (-535596545).setDirection
	    (-871647759 * ((Class120_Sub1) this).anInt9031, true, (byte) 77);
    }
    
    Class120_Sub1(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub1) this).anInt9032
	    = class241_sub3.readUnsignedShort(1162222719) * 2013177539;
	((Class120_Sub1) this).anInt9031
	    = class241_sub3.readUnsignedShort(1162222719) * -854549743;
    }
    
    public void method2961() {
	Class25.aClass93Array213
	    [((Class120_Sub1) this).anInt9032 * -625034773].method2083
	    (-1956645279).setDirection
	    (-871647759 * ((Class120_Sub1) this).anInt9031, true, (byte) 19);
    }
    
    public static boolean method15109(int i, int i_0_) {
	return i == 19 || 9 == i || 5 == i;
    }
}
