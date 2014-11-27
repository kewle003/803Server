/* Class539 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class539
{
    JS5 aClass210_6997;
    Class129 aClass129_6998 = new Class129(64);
    Class504 aClass504_6999;
    public static Class554 aClass554_7000 = new Class554();
    static int anInt7001;
    
    public Class539(GameDefinition class471, Language class437, JS5 class210,
		    Class504 class504) {
	((Class539) this).aClass210_6997 = class210;
	((Class539) this).aClass210_6997.getContainerCount((Js5ConfigGroup.aClass37_415
						     .id) * -1379677837,
						    (byte) -124);
	((Class539) this).aClass504_6999 = class504;
    }
    
    public Class554 method11908(int i, int i_0_) {
	Class554 class554;
	synchronized (((Class539) this).aClass129_6998) {
	    class554 = ((Class554)
			((Class539) this).aClass129_6998.get((long) i));
	}
	if (class554 != null)
	    return class554;
	byte[] is;
	synchronized (((Class539) this).aClass210_6997) {
	    is = ((Class539) this).aClass210_6997.getfile((-1379677837
							      * (Js5ConfigGroup
								 .aClass37_415
								 .id)),
							     i, -1438845412);
	}
	class554 = new Class554();
	((Class554) class554).aClass539_7219 = this;
	if (null != is)
	    class554.method12257(new RSByteBuffer(is), (short) 32767);
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.put(class554, (long) i);
	}
	return class554;
    }
    
    public Class554 method11909(int i) {
	Class554 class554;
	synchronized (((Class539) this).aClass129_6998) {
	    class554 = ((Class554)
			((Class539) this).aClass129_6998.get((long) i));
	}
	if (class554 != null)
	    return class554;
	byte[] is;
	synchronized (((Class539) this).aClass210_6997) {
	    is = ((Class539) this).aClass210_6997.getfile((-1379677837
							      * (Js5ConfigGroup
								 .aClass37_415
								 .id)),
							     i, 1887524227);
	}
	class554 = new Class554();
	((Class554) class554).aClass539_7219 = this;
	if (null != is)
	    class554.method12257(new RSByteBuffer(is), (short) 32767);
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.put(class554, (long) i);
	}
	return class554;
    }
    
    public void method11910(byte i) {
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.removeSoftReferences((byte) -80);
	}
    }
    
    public void method11911(int i) {
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.reset(-2133119064);
	}
    }
    
    public void method11912(int i, byte i_1_) {
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.clean(i, -2011251096);
	}
    }
    
    public Class554 method11913(int i) {
	Class554 class554;
	synchronized (((Class539) this).aClass129_6998) {
	    class554 = ((Class554)
			((Class539) this).aClass129_6998.get((long) i));
	}
	if (class554 != null)
	    return class554;
	byte[] is;
	synchronized (((Class539) this).aClass210_6997) {
	    is = ((Class539) this).aClass210_6997.getfile((-1379677837
							      * (Js5ConfigGroup
								 .aClass37_415
								 .id)),
							     i, -756882009);
	}
	class554 = new Class554();
	((Class554) class554).aClass539_7219 = this;
	if (null != is)
	    class554.method12257(new RSByteBuffer(is), (short) 32767);
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.put(class554, (long) i);
	}
	return class554;
    }
    
    public Class554 method11914(int i) {
	Class554 class554;
	synchronized (((Class539) this).aClass129_6998) {
	    class554 = ((Class554)
			((Class539) this).aClass129_6998.get((long) i));
	}
	if (class554 != null)
	    return class554;
	byte[] is;
	synchronized (((Class539) this).aClass210_6997) {
	    is = ((Class539) this).aClass210_6997.getfile((-1379677837
							      * (Js5ConfigGroup
								 .aClass37_415
								 .id)),
							     i, -752709673);
	}
	class554 = new Class554();
	((Class554) class554).aClass539_7219 = this;
	if (null != is)
	    class554.method12257(new RSByteBuffer(is), (short) 32767);
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.put(class554, (long) i);
	}
	return class554;
    }
    
    public void method11915() {
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.reset(280174881);
	}
    }
    
    public void method11916() {
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.reset(-371059078);
	}
    }
    
    public void method11917() {
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.reset(-967767211);
	}
    }
    
    public void method11918() {
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.reset(-1932408703);
	}
    }
    
    public void method11919(int i) {
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.clean(i, -2046110841);
	}
    }
    
    public void method11920() {
	synchronized (((Class539) this).aClass129_6998) {
	    ((Class539) this).aClass129_6998.removeSoftReferences((byte) -19);
	}
    }
    
    static final void method11921(ClientScriptData class454, byte i) {
	Class402.soundManager.method1215((byte) 0);
    }
    
    static final void method11922(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	Class402.soundManager.method1151(i_2_, i_3_, (byte) 2);
    }
    
    static final void method11923(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub14_8876
		  .method14224(1656271664) ? 1 : 0;
    }
    
    static final void method11924(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	float f = (float) (((ClientScriptData) class454).integerStack
			   [((ClientScriptData) class454).intStackPointer * 1482319719]);
	float f_4_
	    = (float) (((ClientScriptData) class454).integerStack
		       [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	float f_5_
	    = (float) (((ClientScriptData) class454).integerStack
		       [2 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	float f_6_
	    = ((float) (((ClientScriptData) class454).integerStack
			[1482319719 * ((ClientScriptData) class454).intStackPointer + 3])
	       / 1000.0F);
	Class445_Sub16.aClass351_Sub1_8660
	    .method6270(Class287.method5561(f, f_4_, f_5_), f_6_, (byte) -83);
    }
}
