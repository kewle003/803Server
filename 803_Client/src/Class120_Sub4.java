/* Class120_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub4 extends Class120
{
    public void method2958(int i) {
	Class22.method899(true, -947753158);
    }
    
    Class120_Sub4(RSByteBuffer class241_sub3) {
	super(class241_sub3);
    }
    
    public void method2961() {
	Class22.method899(true, 1441890755);
    }
    
    static final void method15604
	(Entity class475_sub1_sub1_sub3, boolean bool,
	 byte i) {
	int i_0_ = Class448.aClass448_6191.aByte6187;
	int i_1_ = 0;
	if (1663546767 * class475_sub1_sub1_sub3.anInt11386 > client.anInt8296)
	    Exception_Sub3.method16944(class475_sub1_sub1_sub3, 1447590839);
	else if (-1825056437 * class475_sub1_sub1_sub3.anInt11422
		 >= client.anInt8296)
	    Class120_Sub11.method16780(class475_sub1_sub1_sub3, (short) 18681);
	else {
	    Class326_Sub3.method16594(class475_sub1_sub1_sub3, bool,
				      (short) 21487);
	    i_0_ = Class88.anInt1296 * 1455647363;
	    i_1_ = Class238.anInt2757 * -1951431903;
	}
	Class287 class287
	    = class475_sub1_sub1_sub3.method10874().aClass287_4386;
	if ((int) class287.aFloat4477 < 512 || (int) class287.aFloat4479 < 512
	    || ((int) class287.aFloat4477
		>= (client.aClass238_8477.method4744(-1996479004) - 1) * 512)
	    || ((int) class287.aFloat4479
		>= (client.aClass238_8477.method4745(1047040790) - 1) * 512)) {
	    class475_sub1_sub1_sub3.aClass409_11375.method7347(-1, -258360361);
	    for (int i_2_ = 0;
		 i_2_ < class475_sub1_sub1_sub3.aClass244Array11404.length;
		 i_2_++) {
		class475_sub1_sub1_sub3.aClass244Array11404[i_2_].graphicsID
		    = 1386773949;
		class475_sub1_sub1_sub3.aClass244Array11404[i_2_]
		    .aClass409_3935.method7347(-1, 2090060571);
	    }
	    class475_sub1_sub1_sub3.anIntArray11397 = null;
	    class475_sub1_sub1_sub3.anInt11386 = 0;
	    class475_sub1_sub1_sub3.anInt11422 = 0;
	    i_0_ = Class448.aClass448_6191.aByte6187;
	    i_1_ = 0;
	    class475_sub1_sub1_sub3.method10880
		((float) (class475_sub1_sub1_sub3.scenePositionXQueue[0] * 512
			  + (class475_sub1_sub1_sub3.method17782(-1176995410)
			     * 256)),
		 class287.aFloat4474,
		 (float) (512 * class475_sub1_sub1_sub3.scenePositionYQueue[0]
			  + (class475_sub1_sub1_sub3.method17782(-166484903)
			     * 256)));
	    class475_sub1_sub1_sub3.method17777((short) 18749);
	}
	if ((class475_sub1_sub1_sub3
	     == Class21.myPlayer)
	    && ((int) class287.aFloat4477 < 6144
		|| (int) class287.aFloat4479 < 6144
		|| ((int) class287.aFloat4477
		    >= ((client.aClass238_8477.method4744(-1956654755) - 12)
			* 512))
		|| ((int) class287.aFloat4479
		    >= ((client.aClass238_8477.method4745(-253459154) - 12)
			* 512)))) {
	    class475_sub1_sub1_sub3.aClass409_11375.method7347(-1, -84287957);
	    for (int i_3_ = 0;
		 i_3_ < class475_sub1_sub1_sub3.aClass244Array11404.length;
		 i_3_++) {
		class475_sub1_sub1_sub3.aClass244Array11404[i_3_].graphicsID
		    = 1386773949;
		class475_sub1_sub1_sub3.aClass244Array11404[i_3_]
		    .aClass409_3935.method7347(-1, -1132159429);
	    }
	    class475_sub1_sub1_sub3.anIntArray11397 = null;
	    class475_sub1_sub1_sub3.anInt11386 = 0;
	    class475_sub1_sub1_sub3.anInt11422 = 0;
	    i_0_ = Class448.aClass448_6191.aByte6187;
	    i_1_ = 0;
	    class475_sub1_sub1_sub3.method10880
		((float) (512 * class475_sub1_sub1_sub3.scenePositionXQueue[0]
			  + (class475_sub1_sub1_sub3.method17782(239414401)
			     * 256)),
		 class287.aFloat4474,
		 (float) (512 * class475_sub1_sub1_sub3.scenePositionYQueue[0]
			  + (class475_sub1_sub1_sub3.method17782(-295494548)
			     * 256)));
	    class475_sub1_sub1_sub3.method17777((short) 15126);
	}
	int i_4_ = HashTable.method7317(class475_sub1_sub1_sub3, (byte) -95);
	Class163.method3530(class475_sub1_sub1_sub3, -187890047);
	Class72.method1742(class475_sub1_sub1_sub3, i_0_, i_1_, i_4_,
			   -1106161524);
	Class294.method5701(class475_sub1_sub1_sub3, i_0_, -349829578);
	Class121.method2974(class475_sub1_sub1_sub3, (byte) 1);
	Class278 class278 = Class278.method5414();
	class278.method5395(Class282.method5490(class475_sub1_sub1_sub3
						    .aClass8_11406
						    .method514((byte) -95)),
			    Class282.method5490(class475_sub1_sub1_sub3
						    .aClass8_11424
						    .method514((byte) 56)),
			    Class282.method5490(class475_sub1_sub1_sub3
						    .aClass8_11423
						    .method514((byte) -52)));
	class475_sub1_sub1_sub3.method10878(class278);
	class278.method5375();
    }
}
