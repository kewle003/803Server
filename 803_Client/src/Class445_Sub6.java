/* Class445_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class445_Sub6 extends Class445
{
    static final int anInt8636 = 0;
    static final int anInt8637 = 255;
    
    int method7886(int i) {
	return 1;
    }
    
    public Class445_Sub6(int i, Class241_Sub9 class241_sub9) {
	super(i, class241_sub9);
    }
    
    public void method14142(int i) {
	if (2034617147 * anInt6176 < 0 && 2034617147 * anInt6176 > 255)
	    anInt6176 = method7881(1220923693) * -679946765;
    }
    
    int method7881(int i) {
	return 127;
    }
    
    public Class445_Sub6(Class241_Sub9 class241_sub9) {
	super(class241_sub9);
    }
    
    void method7882(int i, int i_0_) {
	anInt6176 = -679946765 * i;
    }
    
    public int method14143(int i) {
	return 2034617147 * anInt6176;
    }
    
    int method7883() {
	return 127;
    }
    
    void method7888(int i) {
	anInt6176 = -679946765 * i;
    }
    
    int method7884() {
	return 127;
    }
    
    int method7879(int i) {
	return 1;
    }
    
    int method7885() {
	return 127;
    }
    
    int method7887(int i) {
	return 1;
    }
    
    int method7880(int i, int i_1_) {
	return 1;
    }
    
    void method7889(int i) {
	anInt6176 = -679946765 * i;
    }
    
    public int method14144() {
	return 2034617147 * anInt6176;
    }
    
    public static void method14145(int i, int i_2_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(12, (long) i);
	class241_sub39_sub13.method17278((byte) -81);
    }
    
    static final void method14146(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	ParamType class603
	    = Class621.paramTypeList.list(i_3_, 636991580);
	if (class603.defaultint * 2015998927 != i_4_)
	    class58.method1521(i_3_, i_4_, 121071141);
	else
	    class58.method1523(i_3_, 2016139390);
    }
}
