/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class317 implements Interface32
{
    public Class330 aClass330_4855;
    public Class324 aClass324_4856;
    public int anInt4857;
    public int anInt4858;
    public int anInt4859;
    public int anInt4860;
    public int anInt4861;
    public int anInt4862;
    public int anInt4863;
    public int anInt4864;
    public boolean aBool4865;
    
    Class317(int i, Class330 class330, Class324 class324, int i_0_, int i_1_,
	     int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool) {
	anInt4864 = 2007743519 * i;
	aClass330_4855 = class330;
	aClass324_4856 = class324;
	anInt4857 = -2005600937 * i_0_;
	anInt4858 = -636697539 * i_1_;
	anInt4862 = -208072723 * i_2_;
	anInt4863 = i_3_ * -1467892893;
	anInt4859 = -1426155365 * i_4_;
	anInt4860 = i_5_ * -739938267;
	anInt4861 = i_6_ * 1561853911;
	aBool4865 = bool;
    }
    
    public Class331 method184() {
	return Class331.aClass331_5040;
    }
    
    public Class331 method183(int i) {
	return Class331.aClass331_5040;
    }
    
    public Class331 method182() {
	return Class331.aClass331_5040;
    }
    
    public static Class317 method5913(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) 47);
	Class330 class330 = (Class200.method4070((byte) 43)
			     [class241_sub3.readUnsignedByte((byte) 10)]);
	Class324 class324 = (Class327.method6016((byte) -99)
			     [class241_sub3.readUnsignedByte((byte) -62)]);
	int i_7_ = class241_sub3.readShort((byte) 75);
	int i_8_ = class241_sub3.readShort((byte) 57);
	int i_9_ = class241_sub3.readUnsignedShort(1162222719);
	int i_10_ = class241_sub3.readUnsignedShort(1162222719);
	int i_11_ = class241_sub3.readInt((byte) 35);
	int i_12_ = class241_sub3.readInt((byte) 97);
	int i_13_ = class241_sub3.readInt((byte) 94);
	boolean bool = class241_sub3.readUnsignedByte((byte) -8) == 1;
	return new Class317(i, class330, class324, i_7_, i_8_, i_9_, i_10_,
			    i_11_, i_12_, i_13_, bool);
    }
    
    static final void setComponentSprite/*method5914*/(InterfaceComponent component, InterfaceDefinition iFace,
				 ClientScriptData scriptData, byte i) {
		int spriteID = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		component.slot2 = -1725308621;
		component.anInt995 = 560956375;
		if (component.spriteID * 1032303763 != spriteID) {
			component.spriteID = spriteID * 786532763;
		    WorldType.refreshComponent(component, 1943897333);
		}
		if (-1 == -389932081 * component.slot1 && !iFace.aBool374) {
		    CsDelta_SetMemberVarBit.method17443(component.componentHash * 445907013, (byte) 13);
		}
    }
}
