/* Class120_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub11 extends Class120
{
    int anInt10511;
    
    public void method2958(int i) {
	Class258.aClass132Array4209
	    [1614229395 * ((Class120_Sub11) this).anInt10511]
	    .method3084(-618968414);
    }
    
    public void method2961() {
	Class258.aClass132Array4209
	    [1614229395 * ((Class120_Sub11) this).anInt10511]
	    .method3084(-1195029613);
    }
    
    Class120_Sub11(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub11) this).anInt10511
	    = class241_sub3.readUnsignedShort(1162222719) * -291748197;
    }
    
    static final void method16780
	(Entity class475_sub1_sub1_sub3, short i) {
	Class409 class409 = class475_sub1_sub1_sub3.aClass409_11375;
	if ((-1825056437 * class475_sub1_sub1_sub3.anInt11422
	     == client.anInt8296)
	    || !class409.method7364(-1441966171)
	    || class409.method7365(1, 920167652)) {
	    int i_0_ = (class475_sub1_sub1_sub3.anInt11422 * -1825056437
			- 1663546767 * class475_sub1_sub1_sub3.anInt11386);
	    int i_1_ = (client.anInt8296
			- 1663546767 * class475_sub1_sub1_sub3.anInt11386);
	    int i_2_
		= (class475_sub1_sub1_sub3.anInt11401 * 1372226048
		   + class475_sub1_sub1_sub3.method17782(456191136) * 256);
	    int i_3_
		= (-1002156544 * class475_sub1_sub1_sub3.anInt11403
		   + class475_sub1_sub1_sub3.method17782(1804326433) * 256);
	    int i_4_
		= (-1815180800 * class475_sub1_sub1_sub3.anInt11402
		   + class475_sub1_sub1_sub3.method17782(-771250739) * 256);
	    int i_5_
		= (class475_sub1_sub1_sub3.anInt11428 * -512301568
		   + class475_sub1_sub1_sub3.method17782(1865130693) * 256);
	    Class287 class287
		= class475_sub1_sub1_sub3.method10874().aClass287_4386;
	    class475_sub1_sub1_sub3.method10880
		((float) (((i_0_ - i_1_) * i_2_ + i_4_ * i_1_) / i_0_),
		 (float) (int) class287.aFloat4474,
		 (float) ((i_3_ * (i_0_ - i_1_) + i_5_ * i_1_) / i_0_));
	}
	class475_sub1_sub1_sub3.anInt11429 = 0;
	class475_sub1_sub1_sub3.setDirection((class475_sub1_sub1_sub3.anInt11407
					     * 161672197),
					    false, (byte) 20);
    }
}
