/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class111 implements Interface53
{
    SoundManager this$0;
    public static int anInt1513;
    
    public void method416(Interface52 interface52, int i) {
	if (null != interface52)
	    ((Class111) this).this$0.method1150(-441068592)
		.get((long) interface52.method408((byte) 1));
    }
    
    public void method418(Interface52 interface52) {
	if (null != interface52)
	    ((Class111) this).this$0.method1150(-1669941845)
		.get((long) interface52.method408((byte) 1));
    }
    
    public void method419(Interface52 interface52, int i, int i_0_,
			  boolean bool, byte i_1_) {
	((Class111) this).this$0.method1137((short) 255).add(interface52);
	if (bool)
	    ((Class111) this).this$0.method1227((byte) 79)
		.put(interface52, (long) i_0_);
	else
	    ((Class111) this).this$0.method1150(-1224564861).method3026
		(interface52, (long) i_0_, interface52.method405(164080763),
		 -742642691);
    }
    
    public void method417(Interface52 interface52) {
	if (null != interface52)
	    ((Class111) this).this$0.method1150(-629250920)
		.get((long) interface52.method408((byte) 1));
    }
    
    Class111(SoundManager class49) {
	((Class111) this).this$0 = class49;
    }
    
    public void method415(Interface52 interface52, int i, int i_2_,
			  boolean bool) {
	((Class111) this).this$0.method1137((short) 255).add(interface52);
	if (bool)
	    ((Class111) this).this$0.method1227((byte) -115)
		.put(interface52, (long) i_2_);
	else
	    ((Class111) this).this$0.method1150(-1504222774).method3026
		(interface52, (long) i_2_, interface52.method405(1646646532),
		 -1565864836);
    }
    
    static final void method2773(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class294.method5697(class58, class35, class454, 2065155123);
    }
    
    static final void method2774(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class66_Sub2.method16767((char) i_3_, 2057820036) ? 1 : 0;
    }
    
    static final void method2775(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class13.anInt94 * -214258071;
    }
}
