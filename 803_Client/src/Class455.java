/* Class455 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class455
{
    static Class432 aClass432_6247;
    InterfaceComponent aClass58_6248;
    InterfaceDefinition aClass35_6249;
    
    boolean method10555(int i, int i_0_) {
	InterfaceComponent class58 = Class218_Sub3.method16576(i, i_0_, (byte) -81);
	if (null != class58) {
	    ((Class455) this).aClass35_6249
		= Class187.aClass35Array2203[i >> 16];
	    ((Class455) this).aClass58_6248 = class58;
	    return true;
	}
	method10559(-1491407426);
	return false;
    }
    
    boolean method10556(InterfaceDefinition class35, int i, int i_1_) {
	if (class35 != null) {
	    InterfaceComponent class58 = class35.method997(i, -1476456007);
	    if (class58 != null) {
		((Class455) this).aClass35_6249 = class35;
		((Class455) this).aClass58_6248 = class58;
		return true;
	    }
	}
	method10559(-727039221);
	return false;
    }
    
    boolean method10557(int i, int i_2_, byte i_3_) {
	InterfaceComponent class58 = Class218_Sub3.method16576(i, i_2_, (byte) -76);
	if (null != class58) {
	    ((Class455) this).aClass35_6249
		= Class187.aClass35Array2203[i >> 16];
	    ((Class455) this).aClass58_6248 = class58;
	    return true;
	}
	method10559(-409108022);
	return false;
    }
    
    boolean method10558(InterfaceDefinition class35, int i, int i_4_, int i_5_) {
	if (class35 != null) {
	    InterfaceComponent class58 = class35.method997(i, -301991199);
	    if (class58 != null) {
		((Class455) this).aClass35_6249 = class35;
		((Class455) this).aClass58_6248 = class58;
		return true;
	    }
	}
	method10559(-877322060);
	return false;
    }
    
    void method10559(int i) {
	((Class455) this).aClass35_6249 = null;
	((Class455) this).aClass58_6248 = null;
    }
    
    InterfaceComponent method10560() {
	return ((Class455) this).aClass35_6249.method997((445907013
							  * (((Class455) this)
							     .aClass58_6248
							     .componentHash)),
							 -1222273954);
    }
    
    InterfaceComponent method10561() {
	return ((Class455) this).aClass35_6249.method997((445907013
							  * (((Class455) this)
							     .aClass58_6248
							     .componentHash)),
							 -283923127);
    }
    
    InterfaceComponent method10562(int i) {
	return ((Class455) this).aClass35_6249.method997((445907013
							  * (((Class455) this)
							     .aClass58_6248
							     .componentHash)),
							 -173521346);
    }
    
    InterfaceComponent method10563() {
	return ((Class455) this).aClass35_6249.method997((445907013
							  * (((Class455) this)
							     .aClass58_6248
							     .componentHash)),
							 15227722);
    }
    
    boolean method10564(int i, int i_6_) {
	InterfaceComponent class58 = Class218_Sub3.method16576(i, i_6_, (byte) -107);
	if (null != class58) {
	    ((Class455) this).aClass35_6249
		= Class187.aClass35Array2203[i >> 16];
	    ((Class455) this).aClass58_6248 = class58;
	    return true;
	}
	method10559(-1083892030);
	return false;
    }
    
    boolean method10565(int i, int i_7_) {
	InterfaceComponent class58 = Class218_Sub3.method16576(i, i_7_, (byte) -21);
	if (null != class58) {
	    ((Class455) this).aClass35_6249
		= Class187.aClass35Array2203[i >> 16];
	    ((Class455) this).aClass58_6248 = class58;
	    return true;
	}
	method10559(-2014725737);
	return false;
    }
    
    InterfaceComponent method10566() {
	return ((Class455) this).aClass35_6249.method997((445907013
							  * (((Class455) this)
							     .aClass58_6248
							     .componentHash)),
							 -187795518);
    }
    
    boolean method10567(InterfaceDefinition class35, int i, int i_8_) {
	if (class35 != null) {
	    InterfaceComponent class58 = class35.method997(i, -519802854);
	    if (class58 != null) {
		((Class455) this).aClass35_6249 = class35;
		((Class455) this).aClass58_6248 = class58;
		return true;
	    }
	}
	method10559(-1359264840);
	return false;
    }
    
    Class455() {
	/* empty */
    }
    
    static void method10568(Class103 class103, int i) {
	if ((1327183635 * Class16.anInt148 >= 2 || client.aBool8544)
	    && null == client.aClass58_8365) {
	    String string;
	    if (client.aBool8544 && 1327183635 * Class16.anInt148 < 2)
		string = new StringBuilder().append(client.aString8464).append
			     (ClientMessage.MINISEPERATOR.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 20406))
			     .append
			     (client.aString8465).append
			     (" ").append
			     (Class6.aString33).toString();
	    else if (SparseVarDomain.method3110((byte) -120)
		     && 1327183635 * Class16.anInt148 > 2)
		string
		    = SkillTypeIterator.method11257(Class125.aClass241_Sub39_Sub11_1582,
					   (byte) 43);
	    else {
		Class241_Sub39_Sub11 class241_sub39_sub11
		    = Class125.aClass241_Sub39_Sub11_1582;
		if (null == class241_sub39_sub11)
		    return;
		string = SkillTypeIterator.method11257(class241_sub39_sub11, (byte) 76);
		int[] is
		    = Class213.method4309(class241_sub39_sub11, 2002526672);
		if (null != is)
		    string
			= new StringBuilder().append(string).append
			      (Class221.method4476(is, (byte) 64)).toString();
	    }
	    if (1327183635 * Class16.anInt148 > 2)
		string = new StringBuilder().append(string).append
			     (Class338.method6112(16777215, -263983808)).append
			     (" / ").append
			     (1327183635 * Class16.anInt148 - 2).append
			     (ClientMessage.MOREOPTIONS.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 17238))
			     .toString();
	    if (null != Class16.aClass58_158) {
		Class96 class96
		    = Class16.aClass58_158.method1589(Class425.aClass344_6080,
						      (client
						       .anInterface26_8552),
						      -1417409950);
		if (null == class96)
		    class96 = Class81.aClass96_1149;
		class96.method2120(string, Class16.anInt159 * -699845791,
				   Class16.anInt160 * -96898051,
				   Class16.aClass58_158.anInt850 * 439139681,
				   Class16.aClass58_158.scrollMinY * 1463495207,
				   -1687836431 * Class16.aClass58_158.colour,
				   1143403757 * Class16.aClass58_158.anInt881,
				   Class16.aClass58_158.horizontalTextAlign * 1543601685,
				   1285591903 * Class16.aClass58_158.verticalTextAlign,
				   client.aRandom8380, Class5.anInt28,
				   client.anIntArray8527,
				   Class133.aClass168Array1613,
				   Class242.anIntArray2783, (byte) -24);
		Class579.method12709(client.anIntArray8527[0],
				     client.anIntArray8527[1],
				     client.anIntArray8527[2],
				     client.anIntArray8527[3], (byte) -11);
	    }
	}
    }
    
    static final void method10569(ClientScriptData class454, int i) {
	Class4.method473(class454, -253230698);
    }
    
    public static int[] method10570(int i, int i_9_) {
	int[] is = new int[3];
	Class447.method7916(Class436.method7799(i, (byte) 32));
	is[0] = Class638.aCalendar8252.get(5);
	is[1] = Class638.aCalendar8252.get(2);
	is[2] = Class638.aCalendar8252.get(1);
	return is;
    }
}
