/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class158 implements Interface5
{
    int anInt1771;
    float[] aFloatArray1772;
    int anInt1773;
    
    Class158(int i, int i_0_) {
	((Class158) this).anInt1773 = i * 549445693;
	((Class158) this).anInt1771 = -978851187 * i_0_;
	((Class158) this).aFloatArray1772
	    = new float[(((Class158) this).anInt1771 * -1117329339
			 * (-1018972395 * ((Class158) this).anInt1773))];
    }
    
    public int method55() {
	return ((Class158) this).anInt1773 * -1018972395;
    }
    
    public void method29() {
	/* empty */
    }
    
    public int method64() {
	return ((Class158) this).anInt1773 * -1018972395;
    }
    
    public int method49() {
	return ((Class158) this).anInt1771 * -1117329339;
    }
    
    public int method52() {
	return ((Class158) this).anInt1773 * -1018972395;
    }
    
    public int method53() {
	return ((Class158) this).anInt1773 * -1018972395;
    }
    
    public void method28() {
	/* empty */
    }
    
    public void method27() {
	/* empty */
    }
    
    public int method54() {
	return ((Class158) this).anInt1771 * -1117329339;
    }
    
    static void method3403(Class103 class103, int i, int i_1_, int i_2_,
			   int i_3_, int i_4_, int i_5_) {
	if ((Exception_Sub5.aClass168_10705 == null
	     || Class570.aClass168_7359 == null
	     || Class102.aClass168_1448 == null)
	    && Class284.SPRITES_ARCHIVE
		   .method4250(Class540.anInt7003 * -1741231297, 2079670164)
	    && Class284.SPRITES_ARCHIVE.method4250((Exception_Sub3.anInt10695
						   * 726901365),
						  670130400)
	    && Class284.SPRITES_ARCHIVE
		   .method4250(428909623 * Class199.anInt2385, 359685413)) {
	    Class108 class108
		= Class160.method3437(Class284.SPRITES_ARCHIVE,
				      Exception_Sub3.anInt10695 * 726901365,
				      0);
	    Class570.aClass168_7359 = class103.method2289(class108, true);
	    class108.method2705();
	    Class363.aClass168_5534 = class103.method2289(class108, true);
	    Exception_Sub5.aClass168_10705
		= class103.method2289(Class160.method3437((Class284
							   .SPRITES_ARCHIVE),
							  (Class540.anInt7003
							   * -1741231297),
							  0),
				      true);
	    Class108 class108_6_
		= Class160.method3437(Class284.SPRITES_ARCHIVE,
				      428909623 * Class199.anInt2385, 0);
	    Class102.aClass168_1448 = class103.method2289(class108_6_, true);
	    class108_6_.method2705();
	    Class479.aClass168_6416 = class103.method2289(class108_6_, true);
	}
	if (Exception_Sub5.aClass168_10705 != null
	    && null != Class570.aClass168_7359
	    && null != Class102.aClass168_1448) {
	    int i_7_ = ((i_2_ - Class102.aClass168_1448.method3631() * 2)
			/ Exception_Sub5.aClass168_10705.method3631());
	    for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
		Exception_Sub5.aClass168_10705.method3646
		    ((i + Class102.aClass168_1448.method3631()
		      + i_8_ * Exception_Sub5.aClass168_10705.method3631()),
		     (i_1_ + i_3_
		      - Exception_Sub5.aClass168_10705.method3606()));
	    int i_9_ = ((i_3_ - i_4_ - Class102.aClass168_1448.method3606())
			/ Class570.aClass168_7359.method3606());
	    for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
		Class570.aClass168_7359.method3646
		    (i, (i_4_ + i_1_
			 + i_10_ * Class570.aClass168_7359.method3606()));
		Class363.aClass168_5534.method3646
		    (i_2_ + i - Class363.aClass168_5534.method3631(),
		     (i_4_ + i_1_
		      + i_10_ * Class570.aClass168_7359.method3606()));
	    }
	    Class102.aClass168_1448.method3646(i, (i_1_ + i_3_
						   - Class102
							 .aClass168_1448
							 .method3606()));
	    Class479.aClass168_6416.method3646
		(i + i_2_ - Class102.aClass168_1448.method3631(),
		 i_3_ + i_1_ - Class102.aClass168_1448.method3606());
	}
    }
    
    static final void method3404(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	ParamType.method13191(class58, class35, class454, (byte) 89);
    }
    
    static final void method3405(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	int i_11_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_12_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	int i_13_ = (((ClientScriptData) class454).integerStack
		     [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_14_ = (((ClientScriptData) class454).integerStack
		     [3 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_15_ = 256;
	Class402.soundManager.method1162(Class112.aClass112_1522, i_11_,
					  i_12_, i_14_,
					  Class130.aClass130_1597
					      .method3067(-960497231),
					  Class127.aClass127_1587, 0.0F, 0.0F,
					  null, 0, i_15_, i_13_, -53611670);
    }
    
    static final void method3406(ClientScriptData class454, int i) {
	int i_16_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (2 == client.friendListStage * -2020075851
	    && i_16_ < 1557840217 * client.friendListSize)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= client.friendList[i_16_].serverFlags * 910186329;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    static final void method3407(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	long l = Class103.method2636(-1758310733);
	if (0L == l)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 5;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= Class361_Sub1.method16756(l, string, -19173121);
    }
}
