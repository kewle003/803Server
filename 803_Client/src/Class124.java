/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class124 implements Interface29
{
    SoundManager this$0;
    public static Class593 aClass593_1580;
    static int[] anIntArray1581;
    
    public float method173() {
	return ((float) Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8889.method14143(1856853984)
		/ 255.0F);
    }
    
    public float method174(int i) {
	return ((float) Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub6_8889.method14143(2101236155)
		/ 255.0F);
    }
    
    Class124(SoundManager class49) {
	((Class124) this).this$0 = class49;
    }
    
    static final void setScrollMax/*method2994*/(InterfaceComponent component, 
    		InterfaceDefinition iFace, ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= -821458770;
		component.scrollMaxX 
			= scriptData.integerStack[scriptData.intStackPointer * 1482319719] * -1665383801;
		component.scrollMaxY
		    = 32673755 * scriptData.integerStack[1482319719 * scriptData.intStackPointer + 1];
		WorldType.refreshComponent(component, -41711756);
		if (0 == -1579470857 * component.componentType) {
		    Class380.method6882(iFace, component, false, 663697802);
		}
    }
    
    static final void method2995(InterfaceComponent class58, byte[] is, byte[] is_0_,
				 ClientScriptData class454, int i) {
	int i_1_
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       - 1);
	if (i_1_ < 0 || i_1_ > 9)
	    throw new RuntimeException();
	Class120_Sub21.method16849(class58, i_1_, is, is_0_, class454,
				   -1937961011);
    }
    
    static final void method2996(ClientScriptData class454, int i) {
	Class573_Sub1.aBool8786
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
    }
    
    static final void method2997
	(Entity class475_sub1_sub1_sub3,
	 Entity class475_sub1_sub1_sub3_2_, int i, int i_3_,
	 int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
	int i_10_ = class475_sub1_sub1_sub3_2_.method17799(-1241972674);
	if (i_10_ != -1) {
	    Object object = null;
	    Class168 class168
		= (Class168) client.aClass129_8325.get((long) i_10_);
	    if (class168 == null) {
		Class108[] class108s
		    = Class160.method3439(Class284.SPRITES_ARCHIVE, i_10_, 0);
		if (class108s == null)
		    return;
		class168
		    = Class236.aClass103_2713.method2289(class108s[0], true);
		client.aClass129_8325.put(class168, (long) i_10_);
	    }
	    Class287 class287
		= class475_sub1_sub1_sub3.method10874().aClass287_4386;
	    Class123.method2992(class475_sub1_sub1_sub3.nodePlane,
				(int) class287.aFloat4477,
				(int) class287.aFloat4479,
				(class475_sub1_sub1_sub3.method17782(-59733354)
				 * 256),
				0, false, false, 1033506180);
	    int i_11_
		= (int) ((float) i_3_ + client.aFloatArray8336[0] - 18.0F);
	    int i_12_ = (int) ((float) i_4_ + client.aFloatArray8336[1] - 16.0F
			       - 54.0F);
	    i_11_ += 18 * (i / 4);
	    i_12_ += i % 4 * 18;
	    class168.method3646(i_11_, i_12_);
	    if (class475_sub1_sub1_sub3 == class475_sub1_sub1_sub3_2_)
		Class236.aClass103_2713.method2262(i_11_ - 1, i_12_ - 1, 18,
						   18, -256, -1350025710);
	    Class247_Sub2 class247_sub2 = Friend.method866(-2047397293);
	    ((Class247_Sub2) class247_sub2).aClass475_Sub1_Sub1_Sub3_10068
		= class475_sub1_sub1_sub3_2_;
	    ((Class247_Sub2) class247_sub2).anInt10069 = i_11_ * 1906257375;
	    ((Class247_Sub2) class247_sub2).anInt10070 = i_12_ * 1918178889;
	    ((Class247_Sub2) class247_sub2).anInt10066
		= (i_11_ + 16) * -465964839;
	    ((Class247_Sub2) class247_sub2).anInt10071
		= -1049905547 * (i_12_ + 16);
	    client.aClass421_8411.method7522(class247_sub2, -1665299415);
	}
    }
    
    public static void method2998(int i, int i_13_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(10, (long) i);
	class241_sub39_sub13.method17278((byte) -55);
    }
}
