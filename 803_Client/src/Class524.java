/* Class524 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class524
{
    JS5 aClass210_6816;
    Class129 aClass129_6817 = new Class129(128);
    public static final int anInt6818 = 128;
    public static final int anInt6819 = 64;
    JS5 aClass210_6820;
    Class129 aClass129_6821 = new Class129(64);
    static Class600 aClass600_6822;
    
    public void method11734(byte i) {
	synchronized (((Class524) this).aClass129_6817) {
	    ((Class524) this).aClass129_6817.reset(-550560015);
	}
	synchronized (((Class524) this).aClass129_6821) {
	    ((Class524) this).aClass129_6821.reset(-1146966567);
	}
    }
    
    public void method11735() {
	synchronized (((Class524) this).aClass129_6817) {
	    ((Class524) this).aClass129_6817.removeSoftReferences((byte) 41);
	}
	synchronized (((Class524) this).aClass129_6821) {
	    ((Class524) this).aClass129_6821.removeSoftReferences((byte) -63);
	}
    }
    
    public void method11736(int i) {
	synchronized (((Class524) this).aClass129_6817) {
	    ((Class524) this).aClass129_6817.clean(i, -2022203097);
	}
	synchronized (((Class524) this).aClass129_6821) {
	    ((Class524) this).aClass129_6821.clean(i, -2122143351);
	}
    }
    
    public void method11737(int i, int i_0_, int i_1_) {
	((Class524) this).aClass129_6817 = new Class129(i);
	((Class524) this).aClass129_6821 = new Class129(i_0_);
    }
    
    public void method11738(int i, int i_2_) {
	synchronized (((Class524) this).aClass129_6817) {
	    ((Class524) this).aClass129_6817.clean(i, -1998891253);
	}
	synchronized (((Class524) this).aClass129_6821) {
	    ((Class524) this).aClass129_6821.clean(i, -2107900907);
	}
    }
    
    public void method11739(int i) {
	synchronized (((Class524) this).aClass129_6817) {
	    ((Class524) this).aClass129_6817.removeSoftReferences((byte) -40);
	}
	synchronized (((Class524) this).aClass129_6821) {
	    ((Class524) this).aClass129_6821.removeSoftReferences((byte) -92);
	}
    }
    
    public Class515 method11740(int i) {
	Class515 class515;
	synchronized (((Class524) this).aClass129_6817) {
	    class515 = ((Class515)
			((Class524) this).aClass129_6817.get((long) i));
	}
	if (null != class515)
	    return class515;
	byte[] is;
	synchronized (((Class524) this).aClass210_6820) {
	    is = ((Class524) this).aClass210_6820.getfile(((Js5ConfigGroup
							       .aClass37_419
							       .id)
							      * -1379677837),
							     i, 656497216);
	}
	class515 = new Class515();
	class515.anInt6731 = 1142548591 * i;
	((Class515) class515).aClass524_6734 = this;
	if (is != null)
	    class515.method11581(new RSByteBuffer(is), 1110253448);
	class515.method11580(488320026);
	synchronized (((Class524) this).aClass129_6817) {
	    ((Class524) this).aClass129_6817.put(class515, (long) i);
	}
	return class515;
    }
    
    public void method11741(int i, int i_3_) {
	((Class524) this).aClass129_6817 = new Class129(i);
	((Class524) this).aClass129_6821 = new Class129(i_3_);
    }
    
    public void method11742(int i, int i_4_) {
	((Class524) this).aClass129_6817 = new Class129(i);
	((Class524) this).aClass129_6821 = new Class129(i_4_);
    }
    
    public Class524(GameDefinition class471, Language class437, JS5 class210,
		    JS5 class210_5_) {
	((Class524) this).aClass210_6820 = class210;
	((Class524) this).aClass210_6816 = class210_5_;
	((Class524) this).aClass210_6820.getContainerCount((Js5ConfigGroup.aClass37_419
						     .id) * -1379677837,
						    (byte) -69);
    }
    
    public void method11743() {
	synchronized (((Class524) this).aClass129_6817) {
	    ((Class524) this).aClass129_6817.reset(148539354);
	}
	synchronized (((Class524) this).aClass129_6821) {
	    ((Class524) this).aClass129_6821.reset(-1206109910);
	}
    }
    
    public void method11744(int i) {
	synchronized (((Class524) this).aClass129_6817) {
	    ((Class524) this).aClass129_6817.clean(i, -2014952162);
	}
	synchronized (((Class524) this).aClass129_6821) {
	    ((Class524) this).aClass129_6821.clean(i, -2032540798);
	}
    }
    
    public Class515 method11745(int i, int i_6_) {
	Class515 class515;
	synchronized (((Class524) this).aClass129_6817) {
	    class515 = ((Class515)
			((Class524) this).aClass129_6817.get((long) i));
	}
	if (null != class515)
	    return class515;
	byte[] is;
	synchronized (((Class524) this).aClass210_6820) {
	    is = ((Class524) this).aClass210_6820.getfile(((Js5ConfigGroup
							       .aClass37_419
							       .id)
							      * -1379677837),
							     i, 1398206648);
	}
	class515 = new Class515();
	class515.anInt6731 = 1142548591 * i;
	((Class515) class515).aClass524_6734 = this;
	if (is != null)
	    class515.method11581(new RSByteBuffer(is), 1110253448);
	class515.method11580(-832056749);
	synchronized (((Class524) this).aClass129_6817) {
	    ((Class524) this).aClass129_6817.put(class515, (long) i);
	}
	return class515;
    }
    
    public void method11746() {
	synchronized (((Class524) this).aClass129_6817) {
	    ((Class524) this).aClass129_6817.reset(-263349922);
	}
	synchronized (((Class524) this).aClass129_6821) {
	    ((Class524) this).aClass129_6821.reset(-51027367);
	}
    }
    
    static final void method11747(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	client.aShort8341
	    = (short) (((ClientScriptData) class454).integerStack
		       [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	if (client.aShort8341 <= 0)
	    client.aShort8341 = (short) 256;
	client.aShort8569
	    = (short) (((ClientScriptData) class454).integerStack
		       [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	if (client.aShort8569 <= 0)
	    client.aShort8569 = (short) 320;
    }
    
    static void method11748(int i) {
	if (null != Class86.currentLoadingStage) {
	    CcDeltaNode.aClass70_9022 = new Class70();
	    CcDeltaNode.aClass70_9022.method1696
		(520848576188654631L * Class445_Sub3.aLong8621,
		 ((LoadingScreenDef) Class86.currentLoadingStage).aClass635_5476
		     .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 22396),
		 ((LoadingScreenDef) Class86.currentLoadingStage).aClass635_5476
		     .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 18761),
		 ((LoadingScreenDef) Class86.currentLoadingStage).anInt5496 * -1299978731,
		 Class86.currentLoadingStage, -228813250);
	    Class384.aThread5701
		= new Thread(CcDeltaNode.aClass70_9022, "");
	    Class384.aThread5701.start();
	}
    }
    
    static final void method11749(ClientScriptData class454, int i) {
	long l = Class50.method1249((byte) 1);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class469.method10758(l);
    }
    
    public static void method11750(Class330 class330, Class324 class324, int i,
				   int i_7_, int i_8_, int i_9_, int i_10_,
				   int i_11_, int i_12_, int i_13_, int i_14_,
				   byte i_15_) {
	Class191.aClass330_2279 = class330;
	Class191.aClass324_2277 = class324;
	Class191.anInt2278 = 1439306743 * i;
	Class191.anInt2280 = i_7_ * -210827349;
	Class191.anInt2281 = i_8_ * -1365769619;
	Class191.anInt2282 = i_9_ * 315646731;
	VarType.anInt2131 = i_10_ * -1398063585;
	Class214.anInt2515 = 1289776495 * i_11_;
	Class47.anInt634 = i_12_ * -328345385;
	Class452.aClass108_6211 = null;
	Class450.aClass108_6208 = null;
	Class65.aClass108_1047 = null;
	Class222.anInt2592 = -1359062081 * i_13_;
	Class122.anInt1571 = i_14_ * -1391218065;
	NodeCollection.method7698(1125904750);
	Class349.aBool5382 = true;
    }
}
