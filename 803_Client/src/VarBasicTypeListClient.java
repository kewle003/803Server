/* Class199_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config.vartype.general;
public class VarBasicTypeListClient extends VarTypeList {
    Class129 recentUse = new Class129(64);//aClass129_10706
    JS5 configClient;//aClass210_10707
    
    public VarType list(int i, int i_0_) {
		VarBasicType class179_sub1;
		synchronized (recentUse) {
		    class179_sub1 = (VarBasicType) recentUse.get((long) i);
		    if (null == class179_sub1) {
				byte[] is = configClient.getfile(
						(variableDomain.getJs5GroupID(-655025853).id * -1379677837),
						i, -163359892);
				class179_sub1 = new VarBasicType(variableDomain, i);
				if (is != null) {
				    class179_sub1.decode(new RSByteBuffer(is), 1560050159);
				}
				recentUse.put(class179_sub1, (long) i);
		    }
		}
		return class179_sub1;
    }
    
    public void method16956() {
	synchronized (recentUse) {
	    recentUse
		.reset(-1361152007);
	}
    }
    
    public void cacheReset/*method16957*/(int i) {
		synchronized (recentUse) {
		    recentUse.reset(-1588396337);
		}
    }
    
    public void cacheClean/*method16958*/(int i, byte i_1_) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2095700080);
		}
    }
    
    public void cacheRemoveSoftReferences/*method16959*/(int i) {
		synchronized (recentUse) {
		    recentUse.removeSoftReferences((byte) -74);
		}
    }
    
    public VarType method16888(int i) {
	VarBasicType class179_sub1;
	synchronized (recentUse) {
	    class179_sub1
		= (VarBasicType) ((VarBasicTypeListClient) this)
				      .recentUse.get((long) i);
	    if (null == class179_sub1) {
		byte[] is
		    = (configClient.getfile
		       ((variableDomain.getJs5GroupID(-655025853).id
			 * -1379677837),
			i, 658501425));
		class179_sub1 = new VarBasicType(variableDomain, i);
		if (is != null)
		    class179_sub1.decode(new RSByteBuffer(is),
					     1313947213);
		recentUse
		    .put(class179_sub1, (long) i);
	    }
	}
	return class179_sub1;
    }
    
    public VarType method16886(int i) {
	VarBasicType class179_sub1;
	synchronized (recentUse) {
	    class179_sub1
		= (VarBasicType) ((VarBasicTypeListClient) this)
				      .recentUse.get((long) i);
	    if (null == class179_sub1) {
		byte[] is
		    = (configClient.getfile
		       ((variableDomain.getJs5GroupID(-655025853).id
			 * -1379677837),
			i, 135224964));
		class179_sub1 = new VarBasicType(variableDomain, i);
		if (is != null)
		    class179_sub1.decode(new RSByteBuffer(is),
					     1278182750);
		recentUse
		    .put(class179_sub1, (long) i);
	    }
	}
	return class179_sub1;
    }
    
    public VarType method16890(int i) {
	VarBasicType class179_sub1;
	synchronized (recentUse) {
	    class179_sub1
		= (VarBasicType) ((VarBasicTypeListClient) this)
				      .recentUse.get((long) i);
	    if (null == class179_sub1) {
		byte[] is
		    = (configClient.getfile
		       ((variableDomain.getJs5GroupID(-655025853).id
			 * -1379677837),
			i, -705278854));
		class179_sub1 = new VarBasicType(variableDomain, i);
		if (is != null)
		    class179_sub1.decode(new RSByteBuffer(is), 920353352);
		recentUse
		    .put(class179_sub1, (long) i);
	    }
	}
	return class179_sub1;
    }
    
    public void method16960() {
	synchronized (recentUse) {
	    recentUse
		.reset(-2038818692);
	}
    }
    
    public void method16961() {
	synchronized (recentUse) {
	    recentUse
		.reset(-2099939644);
	}
    }
    
    public VarBasicTypeListClient(GameDefinition class471, VarDomainType class218, Language class437, JS5 class210) {
		super(class471, class218, class437,
				(null != class210 ? class210.getContainerCount((class218.getJs5GroupID(-655025853).id* -1379677837), (byte) -73) : 0));
		configClient = class210;
    }
    
    public void method16962() {
	synchronized (recentUse) {
	    recentUse.reset(-487268506);
	}
    }
    
    public void method16963() {
	synchronized (recentUse) {
	    recentUse.removeSoftReferences((byte) 11);
	}
    }
    
    public void method16964() {
	synchronized (recentUse) {
	    recentUse.removeSoftReferences((byte) 44);
	}
    }
    
    public void method16965(int i) {
	synchronized (recentUse) {
	    recentUse
		.clean(i, -2075088631);
	}
    }
    
    public void method16966() {
	synchronized (recentUse) {
	    recentUse.removeSoftReferences((byte) 60);
	}
    }
    
    static final void method16967(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (string.startsWith(Class475_Sub1_Sub5_Sub1.method17724(0,
								  1303269636))
	    || string.startsWith(Class475_Sub1_Sub5_Sub1
				     .method17724(1, 1227820070)))
	    string = string.substring(7);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class459.isIgnored(string, (byte) -29) ? 1 : 0;
    }
}
