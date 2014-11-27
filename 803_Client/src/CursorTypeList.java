/* Class605 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

//package com.jagex.game.runetek6.config.cursortype;
public class CursorTypeList {
    Class129 cursorCache;//aClass129_7751
    JS5 sprites;//aClass210_7752
    Class129 recentUse = new Class129(64);//aClass129_7753
    JS5 configClient;//aClass210_7754
    
    public void method13201(int i) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2140094683);
		}
		synchronized (cursorCache) {
		    cursorCache.clean(i, -2068782939);
		}
    }
    
    public void method13202() {
	synchronized (recentUse) {
	    recentUse.removeSoftReferences((byte) -8);
	}
	synchronized (cursorCache) {
	    cursorCache.removeSoftReferences((byte) 63);
	}
    }
    
    public void cacheReset/*method13203*/(int i) {
		synchronized (recentUse) {
		    recentUse.reset(-1933336678);
		}
		synchronized (cursorCache) {
		    cursorCache.reset(54841021);
		}
    }
    
    public void cacheClean/*method13204*/(int i, byte i_0_) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2007703026);
		}
		synchronized (cursorCache) {
		    cursorCache.clean(i, -2030126452);
		}
    }
    
    public void cacheRemoveSoftReferences/*method13205*/(byte i) {
		synchronized (recentUse) {
		    recentUse.removeSoftReferences((byte) -23);
		}
		synchronized (cursorCache) {
		    cursorCache.removeSoftReferences((byte) -63);
		}
    }
    
    public CursorType method13206(int i) {
	CursorType class631;
	synchronized (recentUse) {
	    class631 = ((CursorType)
			recentUse.get((long) i));
	}
	if (null != class631)
	    return class631;
	byte[] is;
	synchronized (configClient) {
	    is = configClient.getfile(((Js5ConfigGroup
							       .CURSORTYPE
							       .id)
							      * -1379677837),
							     i, -982469416);
	}
	class631 = new CursorType();
	((CursorType) class631).myList = this;
	if (null != is)
	    class631.decode(new RSByteBuffer(is), 1008653040);
	synchronized (recentUse) {
	    recentUse.put(class631, (long) i);
	}
	return class631;
    }
    
    public CursorType method13207(int i) {
	CursorType class631;
	synchronized (recentUse) {
	    class631 = ((CursorType)
			recentUse.get((long) i));
	}
	if (null != class631)
	    return class631;
	byte[] is;
	synchronized (configClient) {
	    is = configClient.getfile(((Js5ConfigGroup
							       .CURSORTYPE
							       .id)
							      * -1379677837),
							     i, -1431179047);
	}
	class631 = new CursorType();
	((CursorType) class631).myList = this;
	if (null != is)
	    class631.decode(new RSByteBuffer(is), -1005853146);
	synchronized (recentUse) {
	    recentUse.put(class631, (long) i);
	}
	return class631;
    }
    
    public CursorType list/*method13208*/(int i, int i_1_) {
		CursorType class631;
		synchronized (recentUse) {
		    class631 = ((CursorType) recentUse.get((long) i));
		}
		if (null != class631) {
		    return class631;
		}
		byte[] data;
		synchronized (configClient) {
			data = configClient.getfile(
		    		(Js5ConfigGroup.CURSORTYPE.id * -1379677837), i, 2012323443);
		}
		class631 = new CursorType();
		((CursorType) class631).myList = this;
		if (null != data) {
		    class631.decode(new RSByteBuffer(data), 1532115676);
		}
		synchronized (recentUse) {
		    recentUse.put(class631, (long) i);
		}
		return class631;
    }
    
    public CursorTypeList(GameDefinition class471, Language class437, JS5 class210,JS5 class210_2_) {
		cursorCache = new Class129(2);
		configClient = class210;
		sprites = class210_2_;
		configClient.getContainerCount((Js5ConfigGroup.CURSORTYPE.id) * -1379677837, (byte) -76);
    }
    
    public void method13209() {
	synchronized (recentUse) {
	    recentUse.removeSoftReferences((byte) -16);
	}
	synchronized (cursorCache) {
	    cursorCache.removeSoftReferences((byte) 75);
	}
    }
    
    static final void method13210(ClientScriptData class454, int i) {
	((ClientScriptData) class454).longStack
	    [(((ClientScriptData) class454).anInt6231 += 710535117) * -735224571 - 1]
	    = ((Long) (((ClientScriptData) class454).script
		       .objectConstants
		       [((ClientScriptData) class454).step * 1938982693]))
		  .longValue();
    }
    
    static Class105_Sub1_Sub3 method13211(Class103_Sub2 class103_sub2,
					  Canvas canvas, int i, int i_3_,
					  int i_4_) {
	Class105_Sub1_Sub3_Sub1 class105_sub1_sub3_sub1
	    = new Class105_Sub1_Sub3_Sub1(class103_sub2, canvas, i, i_3_);
	return class105_sub1_sub3_sub1;
    }
}
