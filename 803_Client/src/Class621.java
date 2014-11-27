/* Class621 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class621 implements Interface47
{
    static Class621 aClass621_7859;
    static Class621 aClass621_7860;
    static Class621 aClass621_7861;
    static Class621 aClass621_7862;
    int anInt7863;
    static Class621 aClass621_7864;
    static Class621 aClass621_7865;
    static Class621 aClass621_7866;
    static Class621 aClass621_7867;
    static Class621 aClass621_7868;
    static Class621 aClass621_7869;
    static Class621 aClass621_7870 = new Class621(7, 100);
    static Class621 aClass621_7871;
    static Class621 aClass621_7872;
    static Class621 aClass621_7873;
    int anInt7874;
    static Class621 aClass621_7875;
    public static Class4 aClass4_7876;
    public static ParamTypeList paramTypeList;//aClass616_7877
    
    public int method10() {
	return ((Class621) this).anInt7863 * 823137161;
    }
    
    static Class621[] method13342() {
	return (new Class621[]
		{ aClass621_7861, aClass621_7865, aClass621_7873,
		  aClass621_7871, aClass621_7860, aClass621_7866,
		  aClass621_7867, aClass621_7870, aClass621_7868,
		  aClass621_7862, aClass621_7869, aClass621_7864,
		  aClass621_7875, aClass621_7859, aClass621_7872 });
    }
    
    static {
	aClass621_7860 = new Class621(6, 101);
	aClass621_7861 = new Class621(1, 102);
	aClass621_7862 = new Class621(10, 103);
	aClass621_7859 = new Class621(8, 104);
	aClass621_7867 = new Class621(13, 105);
	aClass621_7864 = new Class621(4, 106);
	aClass621_7866 = new Class621(9, 107);
	aClass621_7875 = new Class621(12, 108);
	aClass621_7868 = new Class621(3, 109);
	aClass621_7869 = new Class621(11, 110);
	aClass621_7865 = new Class621(2, 111);
	aClass621_7871 = new Class621(5, 112);
	aClass621_7872 = new Class621(14, 113);
	aClass621_7873 = new Class621(0, 114);
    }
    
    public int method9() {
	return ((Class621) this).anInt7863 * 823137161;
    }
    
    Class621(int i, int i_0_) {
	((Class621) this).anInt7874 = i * -1899630841;
	((Class621) this).anInt7863 = 1411404473 * i_0_;
    }
    
    public int getId(byte i) {
	return ((Class621) this).anInt7863 * 823137161;
    }
    
    public int method147() {
	return ((Class621) this).anInt7863 * 823137161;
    }
    
    public int method11() {
	return ((Class621) this).anInt7863 * 823137161;
    }
    
    static Class621[] method13343() {
	return (new Class621[]
		{ aClass621_7861, aClass621_7865, aClass621_7873,
		  aClass621_7871, aClass621_7860, aClass621_7866,
		  aClass621_7867, aClass621_7870, aClass621_7868,
		  aClass621_7862, aClass621_7869, aClass621_7864,
		  aClass621_7875, aClass621_7859, aClass621_7872 });
    }
    
    static final void method13344(ClientScriptData class454, int i) {
	GameShell3.method13074(1845953325);
    }
    
    static final void method13345(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if ((Class445_Sub16.aClass351_Sub1_8660.method6332((short) -4183)
	     != Class39.aClass39_586)
	    || (Class445_Sub16.aClass351_Sub1_8660.method6356(-1905571706)
		!= Class61.aClass61_1020))
	    throw new RuntimeException();
	Class380_Sub2 class380_sub2
	    = ((Class380_Sub2)
	       Class445_Sub16.aClass351_Sub1_8660.method6283(1494881253));
	Class434_Sub5 class434_sub5
	    = ((Class434_Sub5)
	       Class445_Sub16.aClass351_Sub1_8660.method6284((byte) 1));
	Class287 class287 = class380_sub2.method16691(1482319719);
	Class287 class287_2_ = Class287.method5562(class287);
	class287_2_.aFloat4474 += (float) i_1_;
	Class287 class287_3_
	    = Class287.method5578(class434_sub5.method7753((short) 128),
				  class287_2_);
	class287_3_.method5573();
	float f = class380_sub2.method16720(1948027200).method5559();
	Class290.method5663(class434_sub5.method7753((short) 128), class287_3_,
			    class287, f, Class450.aClass287Array6201);
	Object object = null;
	if (Class450.aClass287Array6201[0] == null)
	    throw new RuntimeException("");
	Class287 class287_4_;
	if (Class450.aClass287Array6201[1] == null)
	    class287_4_ = Class450.aClass287Array6201[0];
	else if (Class287.method5578
		     (class434_sub5.method7753((short) 128),
		      Class450.aClass287Array6201[0])
		     .method5559()
		 < Class287.method5578
		       (class434_sub5.method7753((short) 128),
			Class450.aClass287Array6201[1])
		       .method5559())
	    class287_4_ = Class450.aClass287Array6201[1];
	else
	    class287_4_ = Class450.aClass287Array6201[0];
	float f_5_
	    = Class107.method2684(class287.aFloat4477 - class287_4_.aFloat4477,
				  class287.aFloat4479 - class287_4_.aFloat4479,
				  (byte) 12);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) ((double) f_5_ * 2607.5945876176133) & 0x3fff;
    }
}
