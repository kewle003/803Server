/* Class445_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class445_Sub24 extends Class445
{
    public static final int anInt8688 = 1;
    public static final int anInt8689 = 0;
    public static final int anInt8690 = 2;
    
    void method7889(int i) {
	anInt6176 = i * -679946765;
    }
    
    public Class445_Sub24(int i, Class241_Sub9 class241_sub9) {
	super(i, class241_sub9);
    }
    
    int method7881(int i) {
	if (aClass241_Sub9_6175.aClass445_Sub11_8893.method14198((byte) -45)
	    && Class212.method4289(aClass241_Sub9_6175.aClass445_Sub11_8893
				       .method14197((byte) -98),
				   1450906975))
	    return 1;
	return 0;
    }
    
    public Class445_Sub24(Class241_Sub9 class241_sub9) {
	super(class241_sub9);
    }
    
    public int method14333() {
	return 2034617147 * anInt6176;
    }
    
    public int method7880(int i, int i_0_) {
	return 1;
    }
    
    void method7882(int i, int i_1_) {
	anInt6176 = i * -679946765;
    }
    
    public int method14334(byte i) {
	return 2034617147 * anInt6176;
    }
    
    int method7883() {
	if (aClass241_Sub9_6175.aClass445_Sub11_8893.method14198((byte) -54)
	    && Class212.method4289(aClass241_Sub9_6175.aClass445_Sub11_8893
				       .method14197((byte) 55),
				   1450906975))
	    return 1;
	return 0;
    }
    
    public void method14335(int i) {
	if (anInt6176 * 2034617147 < 0 || anInt6176 * 2034617147 > 2)
	    anInt6176 = method7881(-1483256468) * -679946765;
    }
    
    int method7885() {
	if (aClass241_Sub9_6175.aClass445_Sub11_8893.method14198((byte) -114)
	    && Class212.method4289(aClass241_Sub9_6175.aClass445_Sub11_8893
				       .method14197((byte) 63),
				   1450906975))
	    return 1;
	return 0;
    }
    
    public int method7886(int i) {
	return 1;
    }
    
    public int method7887(int i) {
	return 1;
    }
    
    public int method7879(int i) {
	return 1;
    }
    
    void method7888(int i) {
	anInt6176 = i * -679946765;
    }
    
    public void method14336() {
	if (anInt6176 * 2034617147 < 0 || anInt6176 * 2034617147 > 2)
	    anInt6176 = method7881(-1678427351) * -679946765;
    }
    
    public boolean method14337(int i) {
	return true;
    }
    
    int method7884() {
	if (aClass241_Sub9_6175.aClass445_Sub11_8893.method14198((byte) -120)
	    && Class212.method4289(aClass241_Sub9_6175.aClass445_Sub11_8893
				       .method14197((byte) 16),
				   1450906975))
	    return 1;
	return 0;
    }
    
    public boolean method14338() {
	return true;
    }
    
    public int method14339() {
	return 2034617147 * anInt6176;
    }
    
    public int method14340() {
	return 2034617147 * anInt6176;
    }
    
    public boolean method14341() {
	return true;
    }
    
    public static Class433 method14342(int i) {
	if (null == Class9.aClass433_49)
	    return Class433.aClass433_6109;
	return Class9.aClass433_49;
    }
    
    static void method14343(int i, boolean bool, byte i_2_) {
	if (bool) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4026,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeShort(i, -484048531);
	    client.aClass190_8340.sendPacket(class241_sub27, -1608227836);
	} else
	    Class561.method12372(Class614.aClass614_7815, i, -1, 2050224297);
    }
    
    static final void method14344(ClientScriptData class454, int i) {
	Class432.method7745(((Class475_Sub1)
			     ((ClientScriptData) class454).anInterface24_6237),
			    (((ClientScriptData) class454).integerStack
			     [((((ClientScriptData) class454).intStackPointer -= 1736754263)
			       * 1482319719)]),
			    true, -1589042823);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) client.aFloatArray8336[0];
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) client.aFloatArray8336[1];
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) client.aFloatArray8336[2];
    }
    
    static final void method14345(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_3_, (byte) -38);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_3_ >> 16];
	SparseVarDomain.method3109(class58, class35, class454, -2147187923);
    }
}
