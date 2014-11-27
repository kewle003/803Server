/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class84
{
    public static boolean aBool1159 = false;
    
    Class84() throws Throwable {
	throw new Error();
    }
    
    static final void setVarcompFriendsChatUpdateEvent/*method1835*/(ClientScriptData class454, int i) {
		Class455 class455 = (((ClientScriptData) class454).aBool6246
				     ? ((ClientScriptData) class454).aClass455_6230
				     : ((ClientScriptData) class454).aClass455_6229);
		InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
		InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
		Class439.setFriendsChatUpdateEvent(class58, class35, class454, (byte) -11);
    }
    
    public static Class448[] method1836(int i) {
	return (new Class448[]
		{ Class448.aClass448_6191, Class448.aClass448_6185,
		  Class448.aClass448_6186, Class448.aClass448_6184,
		  Class448.aClass448_6188 });
    }
    
    public static void method1837(int i, String string, int i_0_, int i_1_) {
	ClientScript class241_sub39_sub1
	    = Class355.method6436(Class614.aClass614_7822, i, -1, 135503473);
	if (null != class241_sub39_sub1) {
	    ClientScriptData class454 = Class61.method1608(1159211680);
	    ((ClientScriptData) class454).integerVariables
		= new int[class241_sub39_sub1.anInt10814 * 1601258603];
	    ((ClientScriptData) class454).objectValues
		= new String[1764338319 * class241_sub39_sub1.anInt10811];
	    ((ClientScriptData) class454).objectValues[0] = string;
	    ((ClientScriptData) class454).integerVariables[0] = i_0_;
	    DefaultsGroup.executeClientScript(class241_sub39_sub1, 200000, class454,
				 -1927387119);
	}
    }
    
    public static void method1838(int i, int i_2_) {
	if (i == 25)
	    Class573_Sub1.aFloat7402 = 2.0F;
	else if (37 == i)
	    Class573_Sub1.aFloat7402 = 3.0F;
	else if (i == 50)
	    Class573_Sub1.aFloat7402 = 4.0F;
	else if (75 == i)
	    Class573_Sub1.aFloat7402 = 6.0F;
	else if (100 == i)
	    Class573_Sub1.aFloat7402 = 8.0F;
	else if (i == 200)
	    Class573_Sub1.aFloat7402 = 16.0F;
	Class573_Sub1.anInt8794 = -1265261197;
	Class573_Sub1.anInt8794 = -1265261197;
    }
    
    static final void method1839(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
    }
    
    public static void method1840(String string, int i, byte i_3_) {
	if (Class609.aClass397_7759 == null)
	    Class609.aClass397_7759 = new Server();
	Class609.aClass397_7759.aString5786 = string;
	Class609.aClass397_7759.nodeID = 1167304829 * (1099 + i);
	Class609.aClass397_7759.anInt5790
	    = 1350095168 + Class609.aClass397_7759.nodeID * 170709369;
	Class609.aClass397_7759.anInt5788
	    = Class609.aClass397_7759.nodeID * 170297199 + -147867408;
    }
    
    public static Class411[] method1841(byte i) {
	return (new Class411[]
		{ Class411.aClass411_5940, Class411.aClass411_5939,
		  Class411.aClass411_5936, Class411.aClass411_5938,
		  Class411.aClass411_5937 });
    }
}
