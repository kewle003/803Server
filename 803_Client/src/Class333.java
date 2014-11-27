/* Class333 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class333
{
    public int anInt5058;
    public Class241_Sub39_Sub9 aClass241_Sub39_Sub9_5059;
    public int[] anIntArray5060;
    public static VarBasicTypeListClient VAR_NPC_LIST;//aClass199_Sub2_Sub2_5061
    
    public static Class333 method6060(RSByteBuffer class241_sub3) {
	Class333 class333 = new Class333();
	class333.anInt5058 = class241_sub3.readUnsignedShort(1162222719) * 494032683;
	class333.aClass241_Sub39_Sub9_5059
	    = Class72.aClass625_1100
		  .list(-1422545021 * class333.anInt5058, -307154896);
	return class333;
    }
    
    public static Class333 method6061(RSByteBuffer class241_sub3) {
	Class333 class333 = new Class333();
	class333.anInt5058 = class241_sub3.readUnsignedShort(1162222719) * 494032683;
	class333.aClass241_Sub39_Sub9_5059
	    = Class72.aClass625_1100
		  .list(-1422545021 * class333.anInt5058, -91549118);
	return class333;
    }
    
    public static Class333 method6062(RSByteBuffer class241_sub3) {
	Class333 class333 = new Class333();
	class333.anInt5058 = class241_sub3.readUnsignedShort(1162222719) * 494032683;
	class333.aClass241_Sub39_Sub9_5059
	    = Class72.aClass625_1100
		  .list(-1422545021 * class333.anInt5058, 1408711338);
	return class333;
    }
    
    public static void method6063(byte i) {
	if (!Class202.aBool2412) {
	    Class583.method12829((client.aClass238_8477.method4751(-1352382730)
				  .aClass548ArrayArrayArray7148),
				 (byte) 51);
	    if ((client.aClass238_8477.method4751(-1852715320)
		 .aClass548ArrayArrayArray7135)
		!= null)
		Class583.method12829((client.aClass238_8477.method4751
				      (-957611249)
				      .aClass548ArrayArrayArray7135),
				     (byte) 80);
	    Class202.aBool2412 = true;
	}
    }
    
    static final void method6064(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub10_8852,
	     (((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     (byte) 2);
	GraphicsDefaults.method11570(Class241_Sub5_Sub9.aClass241_Sub9_11043
				 .aClass445_Sub11_8893.method14197((byte) 31),
			     false, 1945822518);
	Class167.method3600((short) -2897);
    }
}
