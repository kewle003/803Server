/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class245
{
    public static final int anInt3940 = -2;
    public static final int anInt3941 = 42;
    public static final int anInt3942 = -4;
    public static final int anInt3943 = 3;
    public static final int anInt3944 = 1;
    public static final int anInt3945 = -3;
    public static final int anInt3946 = -5;
    public static final int anInt3947 = 6;
    public static final int anInt3948 = 7;
    public static final int anInt3949 = 9;
    public static final int anInt3950 = 15;
    public static final int anInt3951 = 21;
    public static final int anInt3952 = 23;
    public static final int anInt3953 = 29;
    public static final int anInt3954 = 35;
    public static final int anInt3955 = 2;
    public static final int anInt3956 = 45;
    public static final int anInt3957 = 48;
    public static final int anInt3958 = 49;
    public static final int anInt3959 = 52;
    public static final int anInt3960 = 53;
    public static int anInt3961;
    
    Class245() throws Throwable {
	throw new Error();
    }
    
    static final void method4917(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (-2096187941 * Class6.aClass241_Sub12_38.anInt8940 < 512
	       || client.aBool8331 || client.aBool8293) ? 1 : 0;
    }
    
    public static String method4918(long l, int i, int i_0_) {
	Class447.method7916(l);
	int i_1_ = Class638.aCalendar8252.get(5);
	int i_2_ = Class638.aCalendar8252.get(2);
	int i_3_ = Class638.aCalendar8252.get(1);
	if (i == 3)
	    return LoadingScreenDef.method6487(l, i, -519671895);
	return new StringBuilder().append(Integer.toString(i_1_ / 10)).append
		   (i_1_ % 10).append
		   ("-").append
		   (Class638.aStringArrayArray8254[i][i_2_]).append
		   ("-").append
		   (i_3_).toString();
    }
    
    static final void method4919(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	HitMarkTypeList.method12290(class58, class35, class454, (byte) 0);
    }
    
    public static void method4920(int i, int i_4_) {
	Class2 class2
	    = (Class2) Class573_Sub1.aHashMap8781.get(Integer.valueOf(i));
	if (null == class2)
	    class2 = new Class2();
	((Class2) class2).anInt12 = Class573_Sub1.anInt8783 * -1980703257;
	((Class2) class2).anInt13 = Class573_Sub1.anInt8785 * -902921693;
	Class573_Sub1.aHashMap8781.put(Integer.valueOf(i), class2);
    }
}
