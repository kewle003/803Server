/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class350 implements Interface17
{
    JS5 aClass210_5385;
    JS5 aClass210_5386;
    Class129 aClass129_5387 = new Class129(64);
    public static FriendsChatUser[] currentFcUsers;//aClass197Array5388
    
    public Class372 method6237(int i) {
	Class372 class372;
	synchronized (((Class350) this).aClass129_5387) {
	    class372 = ((Class372)
			((Class350) this).aClass129_5387.get((long) i));
	}
	if (null != class372)
	    return class372;
	byte[] is;
	synchronized (((Class350) this).aClass210_5385) {
	    is = ((Class350) this).aClass210_5385.getfile(((Js5ConfigGroup
							       .aClass37_386
							       .id)
							      * -1379677837),
							     i, 1816279046);
	}
	class372 = new Class372();
	((Class372) class372).aClass350_5578 = this;
	if (null != is)
	    class372.method6633(new RSByteBuffer(is), (byte) -1);
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.put(class372, (long) i);
	}
	return class372;
    }
    
    public void method6238(int i, int i_0_) {
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.clean(i, -1999653658);
	}
    }
    
    public void method6239(int i) {
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.reset(-839424501);
	}
    }
    
    public void method6240() {
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.reset(-571613242);
	}
    }
    
    public void method6241(int i) {
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.clean(i, -2007269329);
	}
    }
    
    public void method6242(int i) {
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.removeSoftReferences((byte) -84);
	}
    }
    
    public Class372 method6243(int i) {
	Class372 class372;
	synchronized (((Class350) this).aClass129_5387) {
	    class372 = ((Class372)
			((Class350) this).aClass129_5387.get((long) i));
	}
	if (null != class372)
	    return class372;
	byte[] is;
	synchronized (((Class350) this).aClass210_5385) {
	    is = ((Class350) this).aClass210_5385.getfile(((Js5ConfigGroup
							       .aClass37_386
							       .id)
							      * -1379677837),
							     i, -38136850);
	}
	class372 = new Class372();
	((Class372) class372).aClass350_5578 = this;
	if (null != is)
	    class372.method6633(new RSByteBuffer(is), (byte) -1);
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.put(class372, (long) i);
	}
	return class372;
    }
    
    public Class372 method6244(int i, int i_1_) {
	Class372 class372;
	synchronized (((Class350) this).aClass129_5387) {
	    class372 = ((Class372)
			((Class350) this).aClass129_5387.get((long) i));
	}
	if (null != class372)
	    return class372;
	byte[] is;
	synchronized (((Class350) this).aClass210_5385) {
	    is = ((Class350) this).aClass210_5385.getfile(((Js5ConfigGroup
							       .aClass37_386
							       .id)
							      * -1379677837),
							     i, 135397287);
	}
	class372 = new Class372();
	((Class372) class372).aClass350_5578 = this;
	if (null != is)
	    class372.method6633(new RSByteBuffer(is), (byte) -1);
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.put(class372, (long) i);
	}
	return class372;
    }
    
    public void method6245() {
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.reset(-1058911873);
	}
    }
    
    public void method6246(int i) {
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.clean(i, -2134754779);
	}
    }
    
    public Class350(GameDefinition game, Language locale, JS5 class210,
		    JS5 class210_2_) {
	((Class350) this).aClass210_5385 = class210;
	((Class350) this).aClass210_5386 = class210_2_;
	((Class350) this).aClass210_5385.getContainerCount((-1379677837
						     * (Js5ConfigGroup.aClass37_386
							.id)),
						    (byte) -33);
    }
    
    public void method6247(int i) {
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.clean(i, -2065229008);
	}
    }
    
    public void method6248(int i) {
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.clean(i, -2096602684);
	}
    }
    
    public void method6249() {
	synchronized (((Class350) this).aClass129_5387) {
	    ((Class350) this).aClass129_5387.removeSoftReferences((byte) 18);
	}
    }
    
    static final void method6250(ClientScriptData class454, short i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class59.method1597(class58, class35, class454, -1851537897);
    }
    
    static final void method6251(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (string.startsWith(Class475_Sub1_Sub5_Sub1.method17724(0,
								  704621360))
	    || string.startsWith(Class475_Sub1_Sub5_Sub1
				     .method17724(1, 2131930017)))
	    string = string.substring(7);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class443.method7869(string, 959781563);
    }
    
    static final void method6252(byte i) {
	int i_3_ = GPI.viewportPlayerCount * 794073197;
	int[] is = GPI.viewportPlayerIndicies;
	for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[is[i_4_]];
	    if (class475_sub1_sub1_sub3_sub1 != null)
		Class120_Sub4.method15604(class475_sub1_sub1_sub3_sub1, false,
					  (byte) 2);
	}
    }
}
