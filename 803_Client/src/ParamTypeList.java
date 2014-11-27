/* Class616 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config.paramtype;
public class ParamTypeList {
    JS5 configClient;//aClass210_7831
    Class129 recentUse = new Class129(64);//aClass129_7832
    
    public void method13261() {
	synchronized (recentUse) {
	    recentUse.removeSoftReferences((byte) 30);
	}
    }
    
    public void cacheReset/*method13262*/(int i) {
		synchronized (recentUse) {
		    recentUse.reset(-293057746);
		}
    }
    
    public void method13263(int i) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2134048663);
		}
    }
    
    public void cacheClean/*method13264*/(int i, byte i_0_) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2007479425);
		}
    }
    
    public void cacheRemoveSoftReferences/*method13265*/(short i) {
		synchronized (recentUse) {
		    recentUse.removeSoftReferences((byte) -101);
		}
    }
    
    public ParamType method13266(int i) {
	ParamType class603;
	synchronized (recentUse) {
	    class603 = ((ParamType)
			recentUse.get((long) i));
	}
	if (class603 != null)
	    return class603;
	byte[] is;
	synchronized (configClient) {
	    is = configClient.getfile((-1379677837
							      * (Js5ConfigGroup
								 .PARAMTYPE
								 .id)),
							     i, -672978966);
	}
	class603 = new ParamType();
	if (null != is)
	    class603.decode(new RSByteBuffer(is), 1609457464);
	synchronized (recentUse) {
	    recentUse.put(class603, (long) i);
	}
	return class603;
    }
    
    public ParamType method13267(int i) {
	ParamType class603;
	synchronized (recentUse) {
	    class603 = ((ParamType)
			recentUse.get((long) i));
	}
	if (class603 != null)
	    return class603;
	byte[] is;
	synchronized (configClient) {
	    is = configClient.getfile((-1379677837
							      * (Js5ConfigGroup
								 .PARAMTYPE
								 .id)),
							     i, 405256302);
	}
	class603 = new ParamType();
	if (null != is)
	    class603.decode(new RSByteBuffer(is), 1609457464);
	synchronized (recentUse) {
	    recentUse.put(class603, (long) i);
	}
	return class603;
    }
    
    public ParamType method13268(int i) {
	ParamType class603;
	synchronized (recentUse) {
	    class603 = ((ParamType)
			recentUse.get((long) i));
	}
	if (class603 != null)
	    return class603;
	byte[] is;
	synchronized (configClient) {
	    is = configClient.getfile((-1379677837
							      * (Js5ConfigGroup
								 .PARAMTYPE
								 .id)),
							     i, 1229074246);
	}
	class603 = new ParamType();
	if (null != is)
	    class603.decode(new RSByteBuffer(is), 1609457464);
	synchronized (recentUse) {
	    recentUse.put(class603, (long) i);
	}
	return class603;
    }
    
    public void method13269(int i) {
	synchronized (recentUse) {
	    recentUse.clean(i, -2044179032);
	}
    }
    
    public ParamTypeList(GameDefinition game, Language lang, JS5 class210) {
		configClient = class210;
		if (null != configClient) {
		    configClient.getContainerCount(-1379677837 * Js5ConfigGroup.PARAMTYPE.id, (byte) -37);
		}
    }
    
    public void method13270() {
	synchronized (recentUse) {
	    recentUse.removeSoftReferences((byte) 66);
	}
    }
    
    public void method13271() {
	synchronized (recentUse) {
	    recentUse.removeSoftReferences((byte) 57);
	}
    }
    
    public ParamType list/*method13272*/(int id, int i_1_) {
		ParamType paramType;
		synchronized (recentUse) {
			paramType = ((ParamType) recentUse.get((long) id));
		}
		if (paramType != null) {
		    return paramType;
		}
		byte[] data;
		synchronized (configClient) {
			data = configClient.getfile((-1379677837 * (Js5ConfigGroup.PARAMTYPE.id)), id, 280111569);
		}
		paramType = new ParamType();
		if (null != data) {
			paramType.decode(new RSByteBuffer(data), 1609457464);
		}
		synchronized (recentUse) {
		    recentUse.put(paramType, (long) id);
		}
		return paramType;
    }
	    
	public void method13273(int i) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2041857652);
		}
    }
    
    static final void method13274(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub17_8887
		  .method14254(-1591347837);
    }
    
    static void method13275(int i, int i_2_, int i_3_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC.method18030(16, (long) i);
	class241_sub39_sub13.method17279((byte) 0);
	((Class241_Sub39_Sub13) class241_sub39_sub13).anInt10941
	    = -1741260507 * i_2_;
    }
}
