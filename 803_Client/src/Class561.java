/* Class561 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

class Class561 implements Comparator
{
    Class393_Sub2 this$0;
    public static short[][][] aShortArrayArrayArray7298;
    
    public int method12358(Object object, Object object_0_) {
	return method12359((Class225) object, (Class225) object_0_,
			   2070020181);
    }
    
    int method12359(Class225 class225, Class225 class225_1_, int i) {
	float f = class225.method4517(-2132478608);
	float f_2_ = class225_1_.method4517(1204613349);
	if (f_2_ > f)
	    return 1;
	if (f_2_ < f)
	    return -1;
	return 0;
    }
    
    public int compare(Object object, Object object_3_) {
	return method12359((Class225) object, (Class225) object_3_,
			   1812064188);
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    public boolean method12360(Object object) {
	return super.equals(object);
    }
    
    public int method12361(Object object, Object object_4_) {
	return method12359((Class225) object, (Class225) object_4_,
			   2137242247);
    }
    
    public boolean method12362(Object object) {
	return super.equals(object);
    }
    
    public int method12363(Object object, Object object_5_) {
	return method12359((Class225) object, (Class225) object_5_,
			   2131503348);
    }
    
    public int method12364(Object object, Object object_6_) {
	return method12359((Class225) object, (Class225) object_6_,
			   1767977472);
    }
    
    Class561(Class393_Sub2 class393_sub2) {
	((Class561) this).this$0 = class393_sub2;
    }
    
    public boolean method12365(Object object) {
	return super.equals(object);
    }
    
    public int method12366(Object object, Object object_7_) {
	return method12359((Class225) object, (Class225) object_7_,
			   2084754423);
    }
    
    static final void method12367(InterfaceComponent class58, ClientScriptData class454, int i) {
	int i_8_ = 10;
	int i_9_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class258.method5066(class58, i_8_, i_9_, class454, (byte) -26);
    }
    
    static final void method12368(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	class58.aBool893
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	WorldType.refreshComponent(class58, -1207152623);
    }
    
    public static void method12369(int i) {
	int i_10_ = 0;
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub32_8864
		.method14500(-1214672675)
	    == 1) {
	    i_10_ |= 0x1;
	    i_10_ |= 0x10;
	    i_10_ |= 0x20;
	    i_10_ |= 0x2;
	    i_10_ |= 0x4;
	}
	if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub33_8890
		.method14529(-485668821)
	    == 0)
	    i_10_ |= 0x40;
	Class166.method3589(i_10_, -1628132258);
	client.aClass238_8477.getObjectLoader(-2060011957).method11852(i_10_,
								  1598317890);
	Class277.aClass236_4389.method4706(-2146733245).getObjectLoader
	    (-2017523943).method11852(i_10_, 1099839252);
	JS5.itemDefLoader.method13285(i_10_, 572439019);
	MasterIndex.npcDefLoader.method7228(i_10_, -1690838752);
	Class240.graphicsDefLoader.method10581(i_10_, 1170448238);
	ClanSettings.method6719(i_10_, 1145733521);
	Class185.method3859(i_10_, 258826660);
	Class545.method11990(i_10_, 1526428202);
	Class475_Sub1_Sub1_Sub2.method17766(i_10_, (short) 255);
	Class393.method7055(i_10_, (byte) -3);
	client.aClass238_8477.method4768((byte) 5);
    }
    
    static final void method12370(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub6_8888,
	     (((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     (byte) 2);
	Class167.method3600((short) -5233);
	client.aBool8297 = false;
    }
    
    static final void method12371(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class222.method4486(class58, class35, class454, -1999772580);
    }
    
    public static void method12372(Class614 class614, int i, int i_11_,
				   int i_12_) {
	ClientScriptData class454 = Class61.method1608(1670850459);
	Class519.method11667(class614, i, i_11_, class454, -1551927424);
    }
}
