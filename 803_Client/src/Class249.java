/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class249
{
    String aString3993;
    int anInt3994;
    int anInt3995;
    int anInt3996;
    int anInt3997;
    public static int anInt3998;
    
    public int method4990() {
	return 793342189 * ((Class249) this).anInt3996;
    }
    
    public String method4991(int i) {
	return ((Class249) this).aString3993;
    }
    
    public int method4992(int i) {
	return 793342189 * ((Class249) this).anInt3996;
    }
    
    public int method4993(byte i) {
	return 1025045775 * ((Class249) this).anInt3994;
    }
    
    public int method4994() {
	return ((Class249) this).anInt3995 * -1139099359;
    }
    
    public int method4995(int i) {
	return ((Class249) this).anInt3995 * -1139099359;
    }
    
    public String method4996() {
	return ((Class249) this).aString3993;
    }
    
    public int method4997() {
	return 793342189 * ((Class249) this).anInt3996;
    }
    
    public int method4998() {
	return 1025045775 * ((Class249) this).anInt3994;
    }
    
    public String method4999() {
	return ((Class249) this).aString3993;
    }
    
    public int method5000(int i) {
	return ((Class249) this).anInt3997 * 2139061797;
    }
    
    public int method5001() {
	return 793342189 * ((Class249) this).anInt3996;
    }
    
    public int method5002() {
	return ((Class249) this).anInt3995 * -1139099359;
    }
    
    Class249() {
	/* empty */
    }
    
    static final void setComponentFilled/*method5003*/(InterfaceComponent component, InterfaceDefinition iFace,
				 ClientScriptData scriptData, byte i) {
    	component.filledBox = (scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719] == 1);
		WorldType.refreshComponent(component, 673361481);
    }
    
    public static void method5004(int i) {
	if (Class68.anInterface37Array1056 != null) {
	    Interface37[] interface37s = Class68.anInterface37Array1056;
	    for (int i_0_ = 0; i_0_ < interface37s.length; i_0_++) {
		Interface37 interface37 = interface37s[i_0_];
		interface37.method195(-1477543924);
	    }
	}
    }
    
    static void method5005(int i, String string, String string_1_, int i_2_) {
	if (null != client.aClass190_8340) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4123,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeShort
		((1 + Class467.method10740(string, -18130900)
		  + Class467.method10740(string_1_, -18130900)),
		 -484048531);
	    class241_sub27.data.method14630(string,
								723285390);
	    class241_sub27.data.method14630(string_1_,
								1586643035);
	    class241_sub27.data.writeByte(i, 1277653059);
	    client.aClass190_8340.sendPacket(class241_sub27, -2009728032);
	}
    }
    
    static void method5006(Class628_Sub1 class628_sub1, int i, int i_3_,
			   int i_4_) {
	class628_sub1.method14314(i, 1864976825);
	int i_5_;
	if (i_3_ > 100000) {
	    Class13.method666((byte) -48);
	    i_5_ = 4;
	} else if (i_3_ > 50000) {
	    Class448.method7924(694012827);
	    i_5_ = 3;
	} else if (i_3_ > 10000) {
	    Class13.method673(1755947461);
	    i_5_ = 2;
	} else {
	    WorldTile.method16486(true, -1787557994);
	    i_5_ = 1;
	}
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893
		.method14197((byte) -42)
	    != i) {
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8879,
		 i, (byte) 2);
	    GraphicsDefaults.method11570(i, false, 1945822518);
	} else
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14912
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893,
		 true, 2146040721);
	Class167.method3600((short) -8853);
	class628_sub1.method14319(i_5_, -1334179798);
    }
    
    static final void method5007(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 1736754263;
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class270.method5299(i_6_, (byte) 67);
    }
    
    public static Class326 method5008(RSByteBuffer class241_sub3, int i) {
	Class326 class326 = Class257.method5058(class241_sub3, 2061106813);
	int i_7_ = class241_sub3.readInt((byte) 84);
	int i_8_ = class241_sub3.readInt((byte) 107);
	return new Class326_Sub3(class326.aClass330_5008,
				 class326.aClass324_5007,
				 601610705 * class326.anInt5014,
				 -942384019 * class326.anInt5009,
				 -664032457 * class326.anInt5006,
				 class326.anInt5011 * 524993587,
				 -305994951 * class326.anInt5012,
				 -2074180427 * class326.anInt5013,
				 class326.anInt5010 * -401483607, i_7_, i_8_);
    }
}
