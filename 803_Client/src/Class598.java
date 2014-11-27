/* Class598 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class598
{
    Class129 aClass129_7705 = new Class129(64);
    JS5 aClass210_7706;
    public static final int anInt7707 = 64;
    public static final int anInt7708 = 64;
    Class129 aClass129_7709 = new Class129(64);
    JS5 aClass210_7710;
    
    public void method13116() {
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.reset(-426383771);
	}
	synchronized (((Class598) this).aClass129_7709) {
	    ((Class598) this).aClass129_7709.reset(-811426667);
	}
    }
    
    public Class601 method13117(int i, int i_0_) {
	Class601 class601;
	synchronized (((Class598) this).aClass129_7705) {
	    class601 = ((Class601)
			((Class598) this).aClass129_7705.get((long) i));
	}
	if (class601 != null)
	    return class601;
	byte[] is;
	synchronized (((Class598) this).aClass210_7710) {
	    is = ((Class598) this).aClass210_7710.getfile(((Js5ConfigGroup
							       .aClass37_456
							       .id)
							      * -1379677837),
							     i, -511056773);
	}
	class601 = new Class601();
	((Class601) class601).aClass598_7728 = this;
	if (is != null)
	    class601.method13160(new RSByteBuffer(is), -1874419510);
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.put(class601, (long) i);
	}
	return class601;
    }
    
    public void method13118(int i) {
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.reset(-1515619906);
	}
	synchronized (((Class598) this).aClass129_7709) {
	    ((Class598) this).aClass129_7709.reset(-369396436);
	}
    }
    
    public void method13119(int i, int i_1_) {
	((Class598) this).aClass129_7705 = new Class129(i);
	((Class598) this).aClass129_7709 = new Class129(i_1_);
    }
    
    public void method13120(int i, int i_2_) {
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.clean(i, -2102607321);
	}
	synchronized (((Class598) this).aClass129_7709) {
	    ((Class598) this).aClass129_7709.clean(i, -2110619352);
	}
    }
    
    public void method13121(int i, int i_3_) {
	((Class598) this).aClass129_7705 = new Class129(i);
	((Class598) this).aClass129_7709 = new Class129(i_3_);
    }
    
    public Class598(GameDefinition class471, Language class437, JS5 class210,
		    JS5 class210_4_) {
	((Class598) this).aClass210_7710 = class210;
	((Class598) this).aClass210_7706 = class210_4_;
	((Class598) this).aClass210_7710.getContainerCount((-1379677837
						     * (Js5ConfigGroup.aClass37_456
							.id)),
						    (byte) -63);
	Math.random();
	Math.random();
	Math.random();
	Math.random();
    }
    
    public Class601 method13122(int i) {
	Class601 class601;
	synchronized (((Class598) this).aClass129_7705) {
	    class601 = ((Class601)
			((Class598) this).aClass129_7705.get((long) i));
	}
	if (class601 != null)
	    return class601;
	byte[] is;
	synchronized (((Class598) this).aClass210_7710) {
	    is = ((Class598) this).aClass210_7710.getfile(((Js5ConfigGroup
							       .aClass37_456
							       .id)
							      * -1379677837),
							     i, -85546627);
	}
	class601 = new Class601();
	((Class601) class601).aClass598_7728 = this;
	if (is != null)
	    class601.method13160(new RSByteBuffer(is), 2069076538);
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.put(class601, (long) i);
	}
	return class601;
    }
    
    public void method13123(int i) {
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.removeSoftReferences((byte) 69);
	}
	synchronized (((Class598) this).aClass129_7709) {
	    ((Class598) this).aClass129_7709.removeSoftReferences((byte) 14);
	}
    }
    
    public void method13124(int i, int i_5_, int i_6_) {
	((Class598) this).aClass129_7705 = new Class129(i);
	((Class598) this).aClass129_7709 = new Class129(i_5_);
    }
    
    public void method13125() {
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.reset(-350204599);
	}
	synchronized (((Class598) this).aClass129_7709) {
	    ((Class598) this).aClass129_7709.reset(-540343416);
	}
    }
    
    public Class601 method13126(int i) {
	Class601 class601;
	synchronized (((Class598) this).aClass129_7705) {
	    class601 = ((Class601)
			((Class598) this).aClass129_7705.get((long) i));
	}
	if (class601 != null)
	    return class601;
	byte[] is;
	synchronized (((Class598) this).aClass210_7710) {
	    is = ((Class598) this).aClass210_7710.getfile(((Js5ConfigGroup
							       .aClass37_456
							       .id)
							      * -1379677837),
							     i, 1436607825);
	}
	class601 = new Class601();
	((Class601) class601).aClass598_7728 = this;
	if (is != null)
	    class601.method13160(new RSByteBuffer(is), -1227476657);
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.put(class601, (long) i);
	}
	return class601;
    }
    
    public void method13127() {
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.reset(-1485916749);
	}
	synchronized (((Class598) this).aClass129_7709) {
	    ((Class598) this).aClass129_7709.reset(-1262395027);
	}
    }
    
    public void method13128() {
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.reset(-2007111555);
	}
	synchronized (((Class598) this).aClass129_7709) {
	    ((Class598) this).aClass129_7709.reset(-525359226);
	}
    }
    
    public void method13129(int i) {
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.clean(i, -2082890967);
	}
	synchronized (((Class598) this).aClass129_7709) {
	    ((Class598) this).aClass129_7709.clean(i, -2047956881);
	}
    }
    
    public void method13130(int i) {
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.clean(i, -1994341626);
	}
	synchronized (((Class598) this).aClass129_7709) {
	    ((Class598) this).aClass129_7709.clean(i, -2096383188);
	}
    }
    
    public void method13131(int i) {
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.clean(i, -2127428475);
	}
	synchronized (((Class598) this).aClass129_7709) {
	    ((Class598) this).aClass129_7709.clean(i, -2092241092);
	}
    }
    
    public void method13132(int i) {
	synchronized (((Class598) this).aClass129_7705) {
	    ((Class598) this).aClass129_7705.clean(i, -2103513120);
	}
	synchronized (((Class598) this).aClass129_7709) {
	    ((Class598) this).aClass129_7709.clean(i, -2036905431);
	}
    }
    
    static void method13133(int i) {
	Class16.aClass241_Sub39_Sub11_170
	    = (new Class241_Sub39_Sub11
	       (ClientMessage.CANCEL.getLocalisedMessage(VarPlayerDomain.currentLocale,
						    (short) 30937),
		"", 12960807 * client.anInt8458, 1006, -1, 0L, 0, 0, true,
		false, 0L, true));
    }
    
    static final void getChannelUserNodeID/*method13134*/(ClientScriptData scriptData, int i) {
		int memberIndex = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = scriptData.currentChannel.channelUsers[memberIndex].nodeID * 398369433;
    }
}
