/* Class120_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub23 extends Class120
{
    int anInt10629;
    int anInt10630;
    static NodeCollection aClass429_10631;
    
    public void method2961() {
	client.anInt8358 = 1335515003 * client.anInt8296;
	client.anInt8359
	    = (client.anInt8296
	       + ((Class120_Sub23) this).anInt10630 * 1450473599) * -684653733;
	Class10.anInt67 = client.anInt8360 * -240050015;
	Class394.anInt5771 = 914180787 * client.anInt8573;
	Class241_Sub9.anInt8894 = client.anInt8563 * -2041271123;
	Class496.anInt6526 = client.anInt8363 * 31512999;
	client.anInt8360 = (((Class120_Sub23) this).anInt10629 * -781369601
			    >>> 24) * -566708135;
	client.anInt8573
	    = (489118791
	       * (-781369601 * ((Class120_Sub23) this).anInt10629 >>> 16
		  & 0xff));
	client.anInt8563
	    = ((((Class120_Sub23) this).anInt10629 * -781369601 >>> 8 & 0xff)
	       * -826214745);
	client.anInt8363 = (((Class120_Sub23) this).anInt10629 * -781369601
			    & 0xff) * -2119826937;
    }
    
    Class120_Sub23(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub23) this).anInt10630
	    = class241_sub3.readUnsignedShort(1162222719) * 1924351871;
	((Class120_Sub23) this).anInt10629
	    = class241_sub3.readInt((byte) 83) * -1173241601;
    }
    
    public void method2958(int i) {
	client.anInt8358 = 1335515003 * client.anInt8296;
	client.anInt8359
	    = (client.anInt8296
	       + ((Class120_Sub23) this).anInt10630 * 1450473599) * -684653733;
	Class10.anInt67 = client.anInt8360 * -240050015;
	Class394.anInt5771 = 914180787 * client.anInt8573;
	Class241_Sub9.anInt8894 = client.anInt8563 * -2041271123;
	Class496.anInt6526 = client.anInt8363 * 31512999;
	client.anInt8360 = (((Class120_Sub23) this).anInt10629 * -781369601
			    >>> 24) * -566708135;
	client.anInt8573
	    = (489118791
	       * (-781369601 * ((Class120_Sub23) this).anInt10629 >>> 16
		  & 0xff));
	client.anInt8563
	    = ((((Class120_Sub23) this).anInt10629 * -781369601 >>> 8 & 0xff)
	       * -826214745);
	client.anInt8363 = (((Class120_Sub23) this).anInt10629 * -781369601
			    & 0xff) * -2119826937;
    }
    
    static final void method16853(ClientScriptData class454, short i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class520.method11686(class58, class35, class454, 263448187);
    }
    
    public static Class333 method16854(RSByteBuffer buffer, int i) {
		Class333 class333 = new Class333();
		class333.anInt5058 = buffer.readUnsignedShort(1162222719) * 494032683;
		class333.aClass241_Sub39_Sub9_5059
		    = Class72.aClass625_1100.list(-1422545021 * class333.anInt5058, -32853592);
		return class333;
    }
    
    public static boolean method16855(int i, int i_0_) {
	if (i != -1324293729 * Class104.anInt1477
	    || Class582.aClass133_7565 == null) {
	    Class208.method4135(-1070756622);
	    Class582.aClass133_7565 = Class133.aClass133_1617;
	    Class104.anInt1477 = i * 775551583;
	}
	if (Class133.aClass133_1617 == Class582.aClass133_7565) {
	    byte[] is = Class112.aClass210_1527.method4194(i, 1336455748);
	    if (null == is)
		return false;
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    Class77.method1774(class241_sub3, 930213764);
	    int i_1_ = class241_sub3.readUnsignedByte((byte) -1);
	    for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
		Class104.aClass429_1484.addNode
		    (new Class241_Sub32(class241_sub3), (short) -4495);
	    int i_3_ = class241_sub3.readSmart((short) -3003);
	    Class104.aClass123Array1475 = new Class123[i_3_];
	    for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
		Class104.aClass123Array1475[i_4_]
		    = new Class123(class241_sub3);
	    int i_5_ = class241_sub3.readSmart((short) -4853);
	    Class25.aClass93Array213 = new Class93[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		Class25.aClass93Array213[i_6_]
		    = new Class93(class241_sub3, i_6_);
	    int i_7_ = class241_sub3.readSmart((short) -29127);
	    Class258.aClass132Array4209 = new Class132[i_7_];
	    for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
		Class258.aClass132Array4209[i_8_]
		    = new Class132(class241_sub3);
	    int i_9_ = class241_sub3.readSmart((short) -6702);
	    Class104.aClass122Array1476 = new Class122[i_9_];
	    for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
		Class104.aClass122Array1476[i_10_]
		    = new Class122(class241_sub3);
	    int i_11_ = class241_sub3.readSmart((short) -28369);
	    Class104.aClass120Array1479 = new Class120[i_11_];
	    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
		Class104.aClass120Array1479[i_12_]
		    = Class92.method2075(class241_sub3, (byte) 48);
	    Class582.aClass133_7565 = Class133.aClass133_1614;
	}
	if (Class582.aClass133_7565 == Class133.aClass133_1614) {
	    boolean bool = true;
	    Class93[] class93s = Class25.aClass93Array213;
	    for (int i_13_ = 0; i_13_ < class93s.length; i_13_++) {
		Class93 class93 = class93s[i_13_];
		if (!class93.method2082(-1594673915))
		    bool = false;
	    }
	    Class120[] class120s = Class104.aClass120Array1479;
	    for (int i_14_ = 0; i_14_ < class120s.length; i_14_++) {
		Class120 class120 = class120s[i_14_];
		if (!class120.method2960((byte) 125))
		    bool = false;
	    }
	    Class132[] class132s = Class258.aClass132Array4209;
	    for (int i_15_ = 0; i_15_ < class132s.length; i_15_++) {
		Class132 class132 = class132s[i_15_];
		if (!class132.method3079((byte) 1))
		    bool = false;
	    }
	    if (!bool)
		return false;
	    Class582.aClass133_7565 = Class133.aClass133_1615;
	}
	return true;
    }
}
