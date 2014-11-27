/* Class120_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub7 extends Class120
{
    int anInt10493;
    int anInt10494;
    public static JS5 FONTS_ARCHIVE;//aClass210_10495
    static int anInt10496;
    
    Class120_Sub7(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub7) this).anInt10493
	    = class241_sub3.readUnsignedShort(1162222719) * 89004853;
	((Class120_Sub7) this).anInt10494
	    = class241_sub3.readBigSmart((byte) -86) * 213333233;
    }
    
    boolean method2962() {
	AnimationDefinition class549
	    = Class394.animationDefLoader.getAnimationDefinition((977091601
						   * (((Class120_Sub7) this)
						      .anInt10494)),
						  (byte) -32);
	return class549.method12012(1404030079);
    }
    
    boolean method2960(byte i) {
	AnimationDefinition class549
	    = Class394.animationDefLoader.getAnimationDefinition((977091601
						   * (((Class120_Sub7) this)
						      .anInt10494)),
						  (byte) -5);
	return class549.method12012(878860243);
    }
    
    public void method2961() {
	Class132 class132 = (Class258.aClass132Array4209
			     [((Class120_Sub7) this).anInt10493 * 492674845]);
	Class462.method10658(-1076478559 * ((Class132) class132).anInt1611,
			     ((Class132) class132).anInt1609 * 341479421,
			     1034590867 * ((Class132) class132).anInt1606,
			     1847644723 * (((Class132) class132).aClass527_1607
					   .anInt6918),
			     -2030829961 * (((Class132) class132)
					    .aClass527_1607.anInt6931),
			     ((Class132) class132).anInt1608 * -245993177,
			     ((Class120_Sub7) this).anInt10494 * 977091601, 0,
			     -419847630);
    }
    
    public void method2958(int i) {
	Class132 class132 = (Class258.aClass132Array4209
			     [((Class120_Sub7) this).anInt10493 * 492674845]);
	Class462.method10658(-1076478559 * ((Class132) class132).anInt1611,
			     ((Class132) class132).anInt1609 * 341479421,
			     1034590867 * ((Class132) class132).anInt1606,
			     1847644723 * (((Class132) class132).aClass527_1607
					   .anInt6918),
			     -2030829961 * (((Class132) class132)
					    .aClass527_1607.anInt6931),
			     ((Class132) class132).anInt1608 * -245993177,
			     ((Class120_Sub7) this).anInt10494 * 977091601, 0,
			     2130604231);
    }
    
    boolean method2957() {
	AnimationDefinition class549
	    = Class394.animationDefLoader.getAnimationDefinition((977091601
						   * (((Class120_Sub7) this)
						      .anInt10494)),
						  (byte) 8);
	return class549.method12012(877850737);
    }
    
    boolean method2964() {
	AnimationDefinition class549
	    = Class394.animationDefLoader.getAnimationDefinition((977091601
						   * (((Class120_Sub7) this)
						      .anInt10494)),
						  (byte) -73);
	return class549.method12012(476020555);
    }
    
    public static void method16774(int i, int i_0_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(4, (long) i);
	class241_sub39_sub13.method17278((byte) -73);
    }
}
