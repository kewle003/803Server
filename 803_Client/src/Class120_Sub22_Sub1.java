/* Class120_Sub22_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub22_Sub1 extends Class120_Sub22
{
    int anInt10645;
    int anInt10646;
    int anInt10647;
    
    public void method2961() {
	int i = anInt10646 * 2015894016 + 256;
	int i_0_ = 256 + anInt10645 * 779192832;
	int i_1_ = -364009419 * anInt10647;
	if (i_1_ < 3
	    && (client.aClass238_8477.method4753((byte) -125).method4331
		(anInt10646 * -256109555,
		 anInt10645 * -1550370619,
		 53408430)))
	    i_1_++;
	Class475_Sub1_Sub1_Sub5 class475_sub1_sub1_sub5
	    = (new Class475_Sub1_Sub1_Sub5
	       (client.aClass238_8477.method4751(-1368171839),
		-561032075 * anInt10626, 0,
		-364009419 * anInt10647, i_1_, i,
		(Class96_Sub5.method16046(i, i_0_,
					  -364009419 * ((Class120_Sub22_Sub1)
							this).anInt10647,
					  1679943327)
		 - 1286373401 * anInt10624),
		i_0_, anInt10646 * -256109555,
		-256109555 * anInt10646,
		-1550370619 * anInt10645,
		-1550370619 * anInt10645,
		-2006248849 * anInt10625, false,
		0));
	client.aClass407_8454.put
	    (new Class241_Sub39_Sub7(class475_sub1_sub1_sub5),
	     (long) (anInt10646 * -256109555 << 16
		     | -1550370619 * anInt10645));
    }
    
    public void method2958(int i) {
	int i_2_ = anInt10646 * 2015894016 + 256;
	int i_3_ = 256 + anInt10645 * 779192832;
	int i_4_ = -364009419 * anInt10647;
	if (i_4_ < 3
	    && (client.aClass238_8477.method4753((byte) -39).method4331
		(anInt10646 * -256109555,
		 anInt10645 * -1550370619,
		 -1099363435)))
	    i_4_++;
	Class475_Sub1_Sub1_Sub5 class475_sub1_sub1_sub5
	    = (new Class475_Sub1_Sub1_Sub5
	       (client.aClass238_8477.method4751(-1015350774),
		-561032075 * anInt10626, 0,
		-364009419 * anInt10647, i_4_,
		i_2_,
		(Class96_Sub5.method16046(i_2_, i_3_,
					  -364009419 * ((Class120_Sub22_Sub1)
							this).anInt10647,
					  1599820321)
		 - 1286373401 * anInt10624),
		i_3_, anInt10646 * -256109555,
		-256109555 * anInt10646,
		-1550370619 * anInt10645,
		-1550370619 * anInt10645,
		-2006248849 * anInt10625, false,
		0));
	client.aClass407_8454.put
	    (new Class241_Sub39_Sub7(class475_sub1_sub1_sub5),
	     (long) (anInt10646 * -256109555 << 16
		     | -1550370619 * anInt10645));
    }
    
    Class120_Sub22_Sub1(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	int i = class241_sub3.readInt((byte) 88);
	anInt10646 = -82289979 * (i >>> 16);
	anInt10645 = 517965325 * (i & 0xffff);
	anInt10647
	    = class241_sub3.readUnsignedByte((byte) 37) * -1793693155;
    }
}
