/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class323 implements Interface32
{
    public static final int anInt4911 = 2;
    public static final int anInt4912 = 1;
    public int anInt4913;
    public int anInt4914;
    public Class324 aClass324_4915;
    public static final int anInt4916 = 0;
    public int anInt4917;
    public Class330 aClass330_4918;
    public int anInt4919;
    public int anInt4920;
    static int basePlane;//anInt4921
    
    public Class331 method183(int i) {
	return Class331.aClass331_5039;
    }
    
    public static Class323 method5957(RSByteBuffer class241_sub3) {
	Class330 class330 = (Class200.method4070((byte) 47)
			     [class241_sub3.readUnsignedByte((byte) 12)]);
	Class324 class324 = (Class327.method6016((byte) -73)
			     [class241_sub3.readUnsignedByte((byte) -26)]);
	int i = class241_sub3.readShort((byte) 62);
	int i_0_ = class241_sub3.readShort((byte) 60);
	int i_1_ = class241_sub3.readBigSmart((byte) -55);
	int i_2_ = class241_sub3.readInt((byte) 3);
	int i_3_ = class241_sub3.readUnsignedByte((byte) 8);
	return new Class323(class330, class324, i, i_0_, i_1_, i_2_, i_3_);
    }
    
    public Class331 method184() {
	return Class331.aClass331_5039;
    }
    
    public Class331 method182() {
	return Class331.aClass331_5039;
    }
    
    public static Class323 method5958(RSByteBuffer class241_sub3) {
	Class330 class330 = (Class200.method4070((byte) -103)
			     [class241_sub3.readUnsignedByte((byte) 77)]);
	Class324 class324 = (Class327.method6016((byte) -37)
			     [class241_sub3.readUnsignedByte((byte) -16)]);
	int i = class241_sub3.readShort((byte) 75);
	int i_4_ = class241_sub3.readShort((byte) 96);
	int i_5_ = class241_sub3.readBigSmart((byte) -32);
	int i_6_ = class241_sub3.readInt((byte) 45);
	int i_7_ = class241_sub3.readUnsignedByte((byte) 38);
	return new Class323(class330, class324, i, i_4_, i_5_, i_6_, i_7_);
    }
    
    Class323(Class330 class330, Class324 class324, int i, int i_8_, int i_9_,
	     int i_10_, int i_11_) {
	aClass330_4918 = class330;
	aClass324_4915 = class324;
	anInt4914 = 662753183 * i;
	anInt4917 = i_8_ * -900363269;
	anInt4913 = -1447509155 * i_9_;
	anInt4919 = i_10_ * 1493329017;
	anInt4920 = i_11_ * 120434813;
    }
    
    public static Class323 method5959(RSByteBuffer class241_sub3) {
	Class330 class330 = (Class200.method4070((byte) -23)
			     [class241_sub3.readUnsignedByte((byte) 86)]);
	Class324 class324 = (Class327.method6016((byte) -105)
			     [class241_sub3.readUnsignedByte((byte) 85)]);
	int i = class241_sub3.readShort((byte) 63);
	int i_12_ = class241_sub3.readShort((byte) 80);
	int i_13_ = class241_sub3.readBigSmart((byte) -59);
	int i_14_ = class241_sub3.readInt((byte) 21);
	int i_15_ = class241_sub3.readUnsignedByte((byte) 0);
	return new Class323(class330, class324, i, i_12_, i_13_, i_14_, i_15_);
    }
    
    static final void method5960(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	int[] is = Class8.extractVarWatchKeys(string, class454, (byte) -105);
	if (null != is)
	    string = string.substring(0, string.length() - 1);
	class58.onVarcChangeScript
	    = Class299.extractCs2Params(string, class454, 2132922562);
	class58.varcChangeWatch = is;
	class58.hasClientScript = true;
    }
    
    public static boolean method5961(char c, int i) {
	if (c >= ' ' && c <= '~')
	    return true;
	if (c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if ('\u20ac' == c || '\u0152' == c || c == '\u2014' || '\u0153' == c
	    || '\u0178' == c)
	    return true;
	return false;
    }
    
    public static Class67 method5962(int i, int i_16_) {
	if (((Class67) Class67.aClass67_1054).anInt1053 * -1240272535 == i)
	    return Class67.aClass67_1054;
	if (((Class67) Class67.aClass67_1052).anInt1053 * -1240272535 == i)
	    return Class67.aClass67_1052;
	return null;
    }
    
    static final void method5963(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.anInt890 * -765284509;
    }
    
    static final void method5964(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class249.anInt3998 * 1315882367;
    }
}
