/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class319 implements Interface32
{
    public int anInt4868;
    public int anInt4869;
    public Class330 aClass330_4870;
    public Class324 aClass324_4871;
    public int anInt4872;
    
    public Class331 method183(int i) {
	return Class331.aClass331_5041;
    }
    
    public Class331 method182() {
	return Class331.aClass331_5041;
    }
    
    public Class331 method184() {
	return Class331.aClass331_5041;
    }
    
    Class319(int i, Class330 class330, Class324 class324, int i_0_, int i_1_) {
	anInt4869 = -91254435 * i;
	aClass330_4870 = class330;
	aClass324_4871 = class324;
	anInt4868 = -1459661933 * i_0_;
	anInt4872 = i_1_ * -1701061247;
    }
    
    public static Class319 method5920(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readBigSmart((byte) 42);
	Class330 class330 = (Class200.method4070((byte) -26)
			     [class241_sub3.readUnsignedByte((byte) -49)]);
	Class324 class324 = (Class327.method6016((byte) -14)
			     [class241_sub3.readUnsignedByte((byte) 58)]);
	int i_2_ = class241_sub3.readShort((byte) 89);
	int i_3_ = class241_sub3.readShort((byte) 56);
	return new Class319(i, class330, class324, i_2_, i_3_);
    }
    
    public static Class319 method5921(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readBigSmart((byte) 27);
	Class330 class330 = (Class200.method4070((byte) -22)
			     [class241_sub3.readUnsignedByte((byte) -56)]);
	Class324 class324 = (Class327.method6016((byte) -82)
			     [class241_sub3.readUnsignedByte((byte) 106)]);
	int i_4_ = class241_sub3.readShort((byte) 51);
	int i_5_ = class241_sub3.readShort((byte) 96);
	return new Class319(i, class330, class324, i_4_, i_5_);
    }
    
    static final void method5922(ClientScriptData class454, short i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_6_, (byte) -31);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_6_ >> 16];
	VarTypeList.setComponentFont(class58, class35, class454, -324732186);
    }
    
    static final void method5923(ClientScriptData class454, int i) {
	int i_7_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (2 != 1766317249 * client.anInt8288
	    || Class261.method5091(32507318))
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= ClanSettings.method6718(i_7_, string, (byte) 0) ? 1 : 0;
    }
}
