/* Class120_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub15 extends Class120
{
    int anInt10539;
    int anInt10540;
    public static int anInt10541;
    public static Class207 aClass207_10542;
    
    public void method2961() {
	Class402.soundManager.method1173((((Class120_Sub15) this).anInt10540
					   * -387793929),
					  (((Class120_Sub15) this).anInt10539
					   * -1951226781),
					  (byte) -10);
    }
    
    public void method2958(int i) {
	Class402.soundManager.method1173((((Class120_Sub15) this).anInt10540
					   * -387793929),
					  (((Class120_Sub15) this).anInt10539
					   * -1951226781),
					  (byte) -29);
    }
    
    Class120_Sub15(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub15) this).anInt10540
	    = class241_sub3.readUnsignedShort(1162222719) * 15234503;
	((Class120_Sub15) this).anInt10539
	    = class241_sub3.readUnsignedByte((byte) 64) * -1254294197;
    }
    
    public static void method16788(int i, int i_0_, byte i_1_) {
	WorldTile.anInt10182
	    = -1822006837 * (i - Class573_Sub1.anInt7388);
	WorldTile.anInt10183
	    = (i_0_ - Class573_Sub1.anInt7389) * -1182123501;
	Class573_Sub1.anInt8773 = -362944491;
	Class573_Sub1.anInt8794 = -1265261197;
	Class288.method5661(497318259);
    }
}
