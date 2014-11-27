/* Class369_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class369_Sub1 extends Class369
{
    static final int anInt10569 = 2;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10570;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10571;
    static final int anInt10572 = 32;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10573;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10574;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10575;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10576;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10577;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10578;
    Class268[] aClass268Array10579;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10580;
    static Class268 aClass268_10581 = new Class268();
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10582;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10583;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10584;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10585;
    static final int anInt10586 = 1;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10587;
    static final int anInt10588 = 4;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10589;
    static final int anInt10590 = 16;
    float[] aFloatArray10591 = new float[3];
    static final int anInt10592 = 64;
    static final int anInt10593 = 128;
    int anInt10594;
    int[] anIntArray10595;
    Class241_Sub23_Sub1 aClass241_Sub23_Sub1_10596;
    static final int anInt10597 = 8;
    protected Class116 aClass116_10598;
    
    void method6601() {
	aClass116_10598.method2805();
	((Class369_Sub1) this).anIntArray10595[aClass116_10598
						   .method2816(-1201235216)]
	    = -1;
	method16811(0);
	method16812();
    }
    
    boolean method16799(String string) throws Exception_Sub7 {
	aClass116_10598 = aClass103_Sub3_5566.method15784(string);
	if (aClass116_10598 == null)
	    throw new Exception_Sub7("");
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10570
	    = aClass116_10598.method2840("textureMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10571
	    = aClass116_10598.method2840("modelMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10585
	    = aClass116_10598.method2840("viewMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10589
	    = aClass116_10598.method2840("projectionMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10575
	    = aClass116_10598.method2840("modelViewMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10576
	    = aClass116_10598.method2840("modelViewProjectionMatrix",
					 -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10577
	    = aClass116_10598.method2840("viewProjectionMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10596
	    = aClass116_10598.method2840("ambientColour", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10584
	    = aClass116_10598.method2840("sunDirection", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10582
	    = aClass116_10598.method2840("sunColour", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10583
	    = aClass116_10598.method2840("antiSunColour", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10573
	    = aClass116_10598.method2840("sunExponent", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10578
	    = aClass116_10598.method2840("eyePosition", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10587
	    = aClass116_10598.method2840("eyePositionOS", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10580
	    = aClass116_10598.method2840("sunDirectionOS", -1665660917);
	if (!method16800()) {
	    aClass116_10598 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10570 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10571 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10585 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10589 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10575 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10576 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10577 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10596 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10584 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10582 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10583 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10573 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10578 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10587 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10580 = null;
	    return false;
	}
	if (aClass116_10598.method2804((byte) -53) == null) {
	    Class55 class55 = aClass116_10598.method2814(1666136651);
	    if (class55 == null)
		throw new Exception_Sub7(new StringBuilder().append
					     (aClass116_10598
						  .method2808(-1916125471))
					     .append
					     ("").toString());
	    aClass116_10598.method2895(class55);
	}
	((Class369_Sub1) this).anInt10594
	    = aClass116_10598.method2806(-95482374);
	((Class369_Sub1) this).anIntArray10595
	    = new int[((Class369_Sub1) this).anInt10594];
	return true;
    }
    
    abstract boolean method16800() throws Exception_Sub7;
    
    boolean method16801(String string) throws Exception_Sub7 {
	aClass116_10598 = aClass103_Sub3_5566.method15784(string);
	if (aClass116_10598 == null)
	    throw new Exception_Sub7("");
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10570
	    = aClass116_10598.method2840("textureMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10571
	    = aClass116_10598.method2840("modelMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10585
	    = aClass116_10598.method2840("viewMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10589
	    = aClass116_10598.method2840("projectionMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10575
	    = aClass116_10598.method2840("modelViewMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10576
	    = aClass116_10598.method2840("modelViewProjectionMatrix",
					 -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10577
	    = aClass116_10598.method2840("viewProjectionMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10596
	    = aClass116_10598.method2840("ambientColour", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10584
	    = aClass116_10598.method2840("sunDirection", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10582
	    = aClass116_10598.method2840("sunColour", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10583
	    = aClass116_10598.method2840("antiSunColour", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10573
	    = aClass116_10598.method2840("sunExponent", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10578
	    = aClass116_10598.method2840("eyePosition", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10587
	    = aClass116_10598.method2840("eyePositionOS", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10580
	    = aClass116_10598.method2840("sunDirectionOS", -1665660917);
	if (!method16800()) {
	    aClass116_10598 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10570 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10571 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10585 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10589 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10575 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10576 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10577 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10596 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10584 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10582 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10583 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10573 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10578 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10587 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10580 = null;
	    return false;
	}
	if (aClass116_10598.method2804((byte) -50) == null) {
	    Class55 class55 = aClass116_10598.method2814(-191204508);
	    if (class55 == null)
		throw new Exception_Sub7(new StringBuilder().append
					     (aClass116_10598
						  .method2808(1274765754))
					     .append
					     ("").toString());
	    aClass116_10598.method2895(class55);
	}
	((Class369_Sub1) this).anInt10594
	    = aClass116_10598.method2806(414169921);
	((Class369_Sub1) this).anIntArray10595
	    = new int[((Class369_Sub1) this).anInt10594];
	return true;
    }
    
    void method16802(int i, Class266 class266) {
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10587 != null) {
	    Class268 class268 = aClass103_Sub3_5566.method15643();
	    float[] fs
		= { class268.aFloatArray4353[12], class268.aFloatArray4353[13],
		    class268.aFloatArray4353[14] };
	    float[] fs_0_ = { 0.0F, 0.0F, 0.0F };
	    class268.method5209(fs_0_);
	    float[] fs_1_ = { 0.0F, 0.0F, 0.0F };
	    aClass103_Sub3_5566.method2307().method5119(0.0F, 0.0F, 0.0F,
							fs_1_);
	    class266.method5138(fs);
	    aClass116_10598.method2820((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10587),
				       fs[0], fs[1], fs[2], -1633425488);
	}
    }
    
    void method6594() {
	if (aClass116_10598 != null)
	    aClass116_10598.method2911();
    }
    
    boolean method16803(String string) throws Exception_Sub7 {
	aClass116_10598 = aClass103_Sub3_5566.method15784(string);
	if (aClass116_10598 == null)
	    throw new Exception_Sub7("");
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10570
	    = aClass116_10598.method2840("textureMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10571
	    = aClass116_10598.method2840("modelMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10585
	    = aClass116_10598.method2840("viewMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10589
	    = aClass116_10598.method2840("projectionMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10575
	    = aClass116_10598.method2840("modelViewMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10576
	    = aClass116_10598.method2840("modelViewProjectionMatrix",
					 -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10577
	    = aClass116_10598.method2840("viewProjectionMatrix", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10596
	    = aClass116_10598.method2840("ambientColour", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10584
	    = aClass116_10598.method2840("sunDirection", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10582
	    = aClass116_10598.method2840("sunColour", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10583
	    = aClass116_10598.method2840("antiSunColour", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10573
	    = aClass116_10598.method2840("sunExponent", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10578
	    = aClass116_10598.method2840("eyePosition", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10587
	    = aClass116_10598.method2840("eyePositionOS", -1665660917);
	((Class369_Sub1) this).aClass241_Sub23_Sub1_10580
	    = aClass116_10598.method2840("sunDirectionOS", -1665660917);
	if (!method16800()) {
	    aClass116_10598 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10570 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10571 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10585 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10589 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10575 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10576 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10577 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10596 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10584 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10582 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10583 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10573 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10578 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10587 = null;
	    ((Class369_Sub1) this).aClass241_Sub23_Sub1_10580 = null;
	    return false;
	}
	if (aClass116_10598.method2804((byte) -7) == null) {
	    Class55 class55 = aClass116_10598.method2814(1150670392);
	    if (class55 == null)
		throw new Exception_Sub7(new StringBuilder().append
					     (aClass116_10598
						  .method2808(-1762989167))
					     .append
					     ("").toString());
	    aClass116_10598.method2895(class55);
	}
	((Class369_Sub1) this).anInt10594
	    = aClass116_10598.method2806(1224931892);
	((Class369_Sub1) this).anIntArray10595
	    = new int[((Class369_Sub1) this).anInt10594];
	return true;
    }
    
    void method16804() {
	if (aClass116_10598 != null && aClass116_10598.method2874()) {
	    int i = aClass116_10598.method2816(-1251508990);
	    int i_2_ = ((Class369_Sub1) this).anIntArray10595[i];
	    if ((i_2_ & 0x1) != 0
		&& ((Class369_Sub1) this).aClass241_Sub23_Sub1_10571 != null)
		aClass116_10598.method2837((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10571),
					   aClass103_Sub3_5566.method15647(),
					   (byte) -1);
	    if ((i_2_ & 0x2) != 0) {
		if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10585 != null)
		    aClass116_10598.method2837((((Class369_Sub1) this)
						.aClass241_Sub23_Sub1_10585),
					       aClass103_Sub3_5566
						   .method15642(),
					       (byte) -95);
		if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10578
		    != null) {
		    ((Class369_Sub1) this).aFloatArray10591[0] = 0.0F;
		    ((Class369_Sub1) this).aFloatArray10591[1] = 0.0F;
		    ((Class369_Sub1) this).aFloatArray10591[2] = 0.0F;
		    aClass103_Sub3_5566.method2307().method5173
			(((Class369_Sub1) this).aFloatArray10591[0],
			 ((Class369_Sub1) this).aFloatArray10591[1],
			 ((Class369_Sub1) this).aFloatArray10591[2],
			 ((Class369_Sub1) this).aFloatArray10591);
		    aClass116_10598.method2820
			(((Class369_Sub1) this).aClass241_Sub23_Sub1_10578,
			 ((Class369_Sub1) this).aFloatArray10591[0],
			 ((Class369_Sub1) this).aFloatArray10591[1],
			 ((Class369_Sub1) this).aFloatArray10591[2],
			 -1633425488);
		}
	    }
	    if ((i_2_ & 0x10) != 0
		&& ((Class369_Sub1) this).aClass241_Sub23_Sub1_10575 != null)
		aClass116_10598.method2837((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10575),
					   aClass103_Sub3_5566.method15649(),
					   (byte) -81);
	    if ((i_2_ & 0x8) != 0
		&& ((Class369_Sub1) this).aClass241_Sub23_Sub1_10574 != null)
		aClass116_10598.method2837((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10574),
					   aClass103_Sub3_5566.method15643(),
					   (byte) -75);
	    if ((i_2_ & 0x4) != 0
		&& ((Class369_Sub1) this).aClass241_Sub23_Sub1_10589 != null)
		aClass116_10598.method2837((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10589),
					   aClass103_Sub3_5566.method15651(),
					   (byte) -70);
	    if ((i_2_ & 0x20) != 0
		&& ((Class369_Sub1) this).aClass241_Sub23_Sub1_10576 != null) {
		aClass268_10581.method5201(aClass103_Sub3_5566.method15649(),
					   aClass103_Sub3_5566.method15651());
		aClass116_10598.method2837((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10576),
					   aClass268_10581, (byte) -68);
	    }
	    if ((i_2_ & 0x40) != 0
		&& ((Class369_Sub1) this).aClass241_Sub23_Sub1_10577 != null) {
		aClass268_10581.method5201(aClass103_Sub3_5566.method15642(),
					   aClass103_Sub3_5566.method15651());
		aClass116_10598.method2837((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10577),
					   aClass268_10581, (byte) -58);
	    }
	    if (aClass103_Sub3_5566.method15685() == 0
		&& (((Class369_Sub1) this).anIntArray10595[i] & 0x80) != 0
		&& ((Class369_Sub1) this).aClass241_Sub23_Sub1_10570 != null) {
		aClass116_10598.method2826((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10570),
					   aClass103_Sub3_5566.method15694(),
					   65280);
		((Class369_Sub1) this).anIntArray10595[i] &= ~0x80;
	    }
	    ((Class369_Sub1) this).anIntArray10595[i] = 0;
	}
    }
    
    void method16805(int i, Class266 class266) {
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10587 != null) {
	    Class268 class268 = aClass103_Sub3_5566.method15643();
	    float[] fs
		= { class268.aFloatArray4353[12], class268.aFloatArray4353[13],
		    class268.aFloatArray4353[14] };
	    float[] fs_3_ = { 0.0F, 0.0F, 0.0F };
	    class268.method5209(fs_3_);
	    float[] fs_4_ = { 0.0F, 0.0F, 0.0F };
	    aClass103_Sub3_5566.method2307().method5119(0.0F, 0.0F, 0.0F,
							fs_4_);
	    class266.method5138(fs);
	    aClass116_10598.method2820((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10587),
				       fs[0], fs[1], fs[2], -1633425488);
	}
    }
    
    void method16806(int i, Class266 class266) {
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10580 != null) {
	    float[] fs = { aClass103_Sub3_5566.aFloatArray9558[0],
			   aClass103_Sub3_5566.aFloatArray9558[1],
			   aClass103_Sub3_5566.aFloatArray9558[2] };
	    class266.method5146(fs);
	    aClass116_10598.method2820((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10580),
				       fs[0], fs[1], fs[2], -1633425488);
	}
    }
    
    void method16807(boolean bool) {
	if (aClass116_10598 != null && aClass116_10598.method2874()) {
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10596 != null)
		aClass116_10598.method2820((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10596),
					   (aClass103_Sub3_5566.aFloat9563
					    * aClass103_Sub3_5566.aFloat9566),
					   (aClass103_Sub3_5566.aFloat9564
					    * aClass103_Sub3_5566.aFloat9566),
					   (aClass103_Sub3_5566.aFloat9556
					    * aClass103_Sub3_5566.aFloat9566),
					   -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10584 != null)
		aClass116_10598.method2820
		    (((Class369_Sub1) this).aClass241_Sub23_Sub1_10584,
		     aClass103_Sub3_5566.aFloatArray9558[0],
		     aClass103_Sub3_5566.aFloatArray9558[1],
		     aClass103_Sub3_5566.aFloatArray9558[2], -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10582 != null)
		aClass116_10598.method2820((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10582),
					   (aClass103_Sub3_5566.aFloat9563
					    * aClass103_Sub3_5566.aFloat9609),
					   (aClass103_Sub3_5566.aFloat9564
					    * aClass103_Sub3_5566.aFloat9609),
					   (aClass103_Sub3_5566.aFloat9556
					    * aClass103_Sub3_5566.aFloat9609),
					   -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10583 != null)
		aClass116_10598.method2820((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10583),
					   (-aClass103_Sub3_5566.aFloat9563
					    * aClass103_Sub3_5566.aFloat9568),
					   (-aClass103_Sub3_5566.aFloat9564
					    * aClass103_Sub3_5566.aFloat9568),
					   (-aClass103_Sub3_5566.aFloat9556
					    * aClass103_Sub3_5566.aFloat9568),
					   -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10573 != null)
		aClass116_10598.method2818((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10573),
					   64.0F + Math.abs(aClass103_Sub3_5566
							    .aFloatArray9558
							    [1]) * 928.0F,
					   (byte) -72);
	}
    }
    
    void method16808(int i) {
	((Class369_Sub1) this).aClass268Array10579[0].method5198();
	method16809(i);
    }
    
    void method16809(int i) {
	for (int i_5_ = 0; i_5_ < ((Class369_Sub1) this).anInt10594; i_5_++)
	    ((Class369_Sub1) this).anIntArray10595[i_5_] |= 128 << i;
    }
    
    void method16810(Class266 class266) {
	Class268 class268 = aClass103_Sub3_5566.aClass268_9511;
	class268.method5203(class266);
	int i = aClass116_10598.method2816(1919692031);
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10571 != null) {
	    aClass116_10598.method2837((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10571),
				       class268, (byte) -101);
	    ((Class369_Sub1) this).anIntArray10595[i] &= ~0x1;
	}
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10575 != null) {
	    aClass268_10581.method5201(class268,
				       aClass103_Sub3_5566.method15642());
	    aClass116_10598.method2837((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10575),
				       aClass268_10581, (byte) -5);
	    ((Class369_Sub1) this).anIntArray10595[i] &= ~0x10;
	}
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10576 != null) {
	    aClass268_10581.method5201(class268,
				       aClass103_Sub3_5566.method15978());
	    aClass116_10598.method2837((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10576),
				       aClass268_10581, (byte) -83);
	    ((Class369_Sub1) this).anIntArray10595[i] &= ~0x20;
	}
	method16805(i, class266);
	method16806(i, class266);
    }
    
    void method6598() {
	method16810(Class266.aClass266_4342);
    }
    
    void method16811(int i) {
	((Class369_Sub1) this).aClass268Array10579[0].method5198();
	method16809(i);
    }
    
    void method6599() {
	aClass116_10598.method2805();
	((Class369_Sub1) this).anIntArray10595[aClass116_10598
						   .method2816(-472605327)]
	    = -1;
	method16811(0);
	method16812();
    }
    
    void method6600() {
	aClass116_10598.method2805();
	((Class369_Sub1) this).anIntArray10595[aClass116_10598
						   .method2816(719858510)]
	    = -1;
	method16811(0);
	method16812();
    }
    
    void method6593() {
	if (aClass116_10598 != null)
	    aClass116_10598.method2911();
    }
    
    void method6609() {
	/* empty */
    }
    
    void method16812() {
	method16807(aClass103_Sub3_5566.aBool9600);
	method16813(aClass103_Sub3_5566.method15694());
	method16804();
	method6597();
    }
    
    void method6597() {
	/* empty */
    }
    
    Class369_Sub1(Class103_Sub3 class103_sub3) {
	super(class103_sub3);
	new Class266();
	((Class369_Sub1) this).aClass268Array10579
	    = new Class268[aClass103_Sub3_5566.anInt9647];
	for (int i = 0; i < aClass103_Sub3_5566.anInt9647; i++)
	    ((Class369_Sub1) this).aClass268Array10579[i] = new Class268();
    }
    
    void method6608() {
	/* empty */
    }
    
    void method16813(Class268 class268) {
	if (aClass116_10598 != null && aClass116_10598.method2874()
	    && aClass103_Sub3_5566.method15685() == 0) {
	    int i = aClass116_10598.method2816(1221510950);
	    if ((((Class369_Sub1) this).anIntArray10595[i] & 0x80) != 0
		&& ((Class369_Sub1) this).aClass241_Sub23_Sub1_10570 != null) {
		aClass116_10598.method2826((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10570),
					   class268, 65280);
		((Class369_Sub1) this).anIntArray10595[i] &= ~0x80;
	    }
	}
    }
    
    void method16814(int i, Class266 class266) {
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10580 != null) {
	    float[] fs = { aClass103_Sub3_5566.aFloatArray9558[0],
			   aClass103_Sub3_5566.aFloatArray9558[1],
			   aClass103_Sub3_5566.aFloatArray9558[2] };
	    class266.method5146(fs);
	    aClass116_10598.method2820((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10580),
				       fs[0], fs[1], fs[2], -1633425488);
	}
    }
    
    abstract boolean method16815() throws Exception_Sub7;
    
    void method16816(int i, Class266 class266) {
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10587 != null) {
	    Class268 class268 = aClass103_Sub3_5566.method15643();
	    float[] fs
		= { class268.aFloatArray4353[12], class268.aFloatArray4353[13],
		    class268.aFloatArray4353[14] };
	    float[] fs_6_ = { 0.0F, 0.0F, 0.0F };
	    class268.method5209(fs_6_);
	    float[] fs_7_ = { 0.0F, 0.0F, 0.0F };
	    aClass103_Sub3_5566.method2307().method5119(0.0F, 0.0F, 0.0F,
							fs_7_);
	    class266.method5138(fs);
	    aClass116_10598.method2820((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10587),
				       fs[0], fs[1], fs[2], -1633425488);
	}
    }
    
    void method6613() {
	method16810(Class266.aClass266_4342);
    }
    
    void method16817(Class266 class266) {
	Class268 class268 = aClass103_Sub3_5566.aClass268_9511;
	class268.method5203(class266);
	int i = aClass116_10598.method2816(1093657464);
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10571 != null) {
	    aClass116_10598.method2837((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10571),
				       class268, (byte) -76);
	    ((Class369_Sub1) this).anIntArray10595[i] &= ~0x1;
	}
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10575 != null) {
	    aClass268_10581.method5201(class268,
				       aClass103_Sub3_5566.method15642());
	    aClass116_10598.method2837((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10575),
				       aClass268_10581, (byte) -100);
	    ((Class369_Sub1) this).anIntArray10595[i] &= ~0x10;
	}
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10576 != null) {
	    aClass268_10581.method5201(class268,
				       aClass103_Sub3_5566.method15978());
	    aClass116_10598.method2837((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10576),
				       aClass268_10581, (byte) -107);
	    ((Class369_Sub1) this).anIntArray10595[i] &= ~0x20;
	}
	method16805(i, class266);
	method16806(i, class266);
    }
    
    void method16818(int i, Class266 class266) {
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10580 != null) {
	    float[] fs = { aClass103_Sub3_5566.aFloatArray9558[0],
			   aClass103_Sub3_5566.aFloatArray9558[1],
			   aClass103_Sub3_5566.aFloatArray9558[2] };
	    class266.method5146(fs);
	    aClass116_10598.method2820((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10580),
				       fs[0], fs[1], fs[2], -1633425488);
	}
    }
    
    void method16819(int i, Class266 class266) {
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10580 != null) {
	    float[] fs = { aClass103_Sub3_5566.aFloatArray9558[0],
			   aClass103_Sub3_5566.aFloatArray9558[1],
			   aClass103_Sub3_5566.aFloatArray9558[2] };
	    class266.method5146(fs);
	    aClass116_10598.method2820((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10580),
				       fs[0], fs[1], fs[2], -1633425488);
	}
    }
    
    void method16820(int i) {
	for (int i_8_ = 0; i_8_ < ((Class369_Sub1) this).anInt10594; i_8_++)
	    ((Class369_Sub1) this).anIntArray10595[i_8_] |= 128 << i;
    }
    
    void method16821(int i, Class266 class266) {
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10580 != null) {
	    float[] fs = { aClass103_Sub3_5566.aFloatArray9558[0],
			   aClass103_Sub3_5566.aFloatArray9558[1],
			   aClass103_Sub3_5566.aFloatArray9558[2] };
	    class266.method5146(fs);
	    aClass116_10598.method2820((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10580),
				       fs[0], fs[1], fs[2], -1633425488);
	}
    }
    
    void method16822(int i, Class266 class266) {
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10580 != null) {
	    float[] fs = { aClass103_Sub3_5566.aFloatArray9558[0],
			   aClass103_Sub3_5566.aFloatArray9558[1],
			   aClass103_Sub3_5566.aFloatArray9558[2] };
	    class266.method5146(fs);
	    aClass116_10598.method2820((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10580),
				       fs[0], fs[1], fs[2], -1633425488);
	}
    }
    
    void method16823(boolean bool) {
	if (aClass116_10598 != null && aClass116_10598.method2874()) {
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10596 != null)
		aClass116_10598.method2820((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10596),
					   (aClass103_Sub3_5566.aFloat9563
					    * aClass103_Sub3_5566.aFloat9566),
					   (aClass103_Sub3_5566.aFloat9564
					    * aClass103_Sub3_5566.aFloat9566),
					   (aClass103_Sub3_5566.aFloat9556
					    * aClass103_Sub3_5566.aFloat9566),
					   -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10584 != null)
		aClass116_10598.method2820
		    (((Class369_Sub1) this).aClass241_Sub23_Sub1_10584,
		     aClass103_Sub3_5566.aFloatArray9558[0],
		     aClass103_Sub3_5566.aFloatArray9558[1],
		     aClass103_Sub3_5566.aFloatArray9558[2], -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10582 != null)
		aClass116_10598.method2820((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10582),
					   (aClass103_Sub3_5566.aFloat9563
					    * aClass103_Sub3_5566.aFloat9609),
					   (aClass103_Sub3_5566.aFloat9564
					    * aClass103_Sub3_5566.aFloat9609),
					   (aClass103_Sub3_5566.aFloat9556
					    * aClass103_Sub3_5566.aFloat9609),
					   -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10583 != null)
		aClass116_10598.method2820((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10583),
					   (-aClass103_Sub3_5566.aFloat9563
					    * aClass103_Sub3_5566.aFloat9568),
					   (-aClass103_Sub3_5566.aFloat9564
					    * aClass103_Sub3_5566.aFloat9568),
					   (-aClass103_Sub3_5566.aFloat9556
					    * aClass103_Sub3_5566.aFloat9568),
					   -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10573 != null)
		aClass116_10598.method2818((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10573),
					   64.0F + Math.abs(aClass103_Sub3_5566
							    .aFloatArray9558
							    [1]) * 928.0F,
					   (byte) -82);
	}
    }
    
    void method6603() {
	/* empty */
    }
    
    void method16824(int i) {
	for (int i_9_ = 0; i_9_ < ((Class369_Sub1) this).anInt10594; i_9_++)
	    ((Class369_Sub1) this).anIntArray10595[i_9_] |= 128 << i;
    }
    
    void method6607() {
	if (aClass116_10598 != null)
	    aClass116_10598.method2911();
    }
    
    void method16825(Class266 class266) {
	Class268 class268 = aClass103_Sub3_5566.aClass268_9511;
	class268.method5203(class266);
	int i = aClass116_10598.method2816(-434420167);
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10571 != null) {
	    aClass116_10598.method2837((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10571),
				       class268, (byte) -2);
	    ((Class369_Sub1) this).anIntArray10595[i] &= ~0x1;
	}
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10575 != null) {
	    aClass268_10581.method5201(class268,
				       aClass103_Sub3_5566.method15642());
	    aClass116_10598.method2837((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10575),
				       aClass268_10581, (byte) -4);
	    ((Class369_Sub1) this).anIntArray10595[i] &= ~0x10;
	}
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10576 != null) {
	    aClass268_10581.method5201(class268,
				       aClass103_Sub3_5566.method15978());
	    aClass116_10598.method2837((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10576),
				       aClass268_10581, (byte) -125);
	    ((Class369_Sub1) this).anIntArray10595[i] &= ~0x20;
	}
	method16805(i, class266);
	method16806(i, class266);
    }
    
    void method16826(boolean bool) {
	if (aClass116_10598 != null && aClass116_10598.method2874()) {
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10596 != null)
		aClass116_10598.method2820((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10596),
					   (aClass103_Sub3_5566.aFloat9563
					    * aClass103_Sub3_5566.aFloat9566),
					   (aClass103_Sub3_5566.aFloat9564
					    * aClass103_Sub3_5566.aFloat9566),
					   (aClass103_Sub3_5566.aFloat9556
					    * aClass103_Sub3_5566.aFloat9566),
					   -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10584 != null)
		aClass116_10598.method2820
		    (((Class369_Sub1) this).aClass241_Sub23_Sub1_10584,
		     aClass103_Sub3_5566.aFloatArray9558[0],
		     aClass103_Sub3_5566.aFloatArray9558[1],
		     aClass103_Sub3_5566.aFloatArray9558[2], -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10582 != null)
		aClass116_10598.method2820((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10582),
					   (aClass103_Sub3_5566.aFloat9563
					    * aClass103_Sub3_5566.aFloat9609),
					   (aClass103_Sub3_5566.aFloat9564
					    * aClass103_Sub3_5566.aFloat9609),
					   (aClass103_Sub3_5566.aFloat9556
					    * aClass103_Sub3_5566.aFloat9609),
					   -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10583 != null)
		aClass116_10598.method2820((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10583),
					   (-aClass103_Sub3_5566.aFloat9563
					    * aClass103_Sub3_5566.aFloat9568),
					   (-aClass103_Sub3_5566.aFloat9564
					    * aClass103_Sub3_5566.aFloat9568),
					   (-aClass103_Sub3_5566.aFloat9556
					    * aClass103_Sub3_5566.aFloat9568),
					   -1633425488);
	    if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10573 != null)
		aClass116_10598.method2818((((Class369_Sub1) this)
					    .aClass241_Sub23_Sub1_10573),
					   64.0F + Math.abs(aClass103_Sub3_5566
							    .aFloatArray9558
							    [1]) * 928.0F,
					   (byte) -39);
	}
    }
    
    void method16827(int i, Class266 class266) {
	if (((Class369_Sub1) this).aClass241_Sub23_Sub1_10580 != null) {
	    float[] fs = { aClass103_Sub3_5566.aFloatArray9558[0],
			   aClass103_Sub3_5566.aFloatArray9558[1],
			   aClass103_Sub3_5566.aFloatArray9558[2] };
	    class266.method5146(fs);
	    aClass116_10598.method2820((((Class369_Sub1) this)
					.aClass241_Sub23_Sub1_10580),
				       fs[0], fs[1], fs[2], -1633425488);
	}
    }
    
    void method16828(int i) {
	((Class369_Sub1) this).aClass268Array10579[0].method5198();
	method16809(i);
    }
}
