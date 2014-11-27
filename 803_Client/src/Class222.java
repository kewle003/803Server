/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class222
{
    RSByteBuffer aClass241_Sub3_2586;
    boolean aBool2587;
    int anInt2588;
    int anInt2589;
    static short aShort2590;
    Class225 this$0;
    public static String javaVendor;//aString2591
    static int anInt2592;
    
    Class222(Class225 class225, RSByteBuffer class241_sub3, boolean bool) {
	((Class222) this).this$0 = class225;
	((Class222) this).aClass241_Sub3_2586 = class241_sub3;
	((Class222) this).aBool2587 = bool;
	((Class222) this).anInt2588 = -1170883249;
	((Class222) this).anInt2589 = -453817619;
    }
    
    void method4482(int i) {
	if (((Class222) this).aClass241_Sub3_2586 != null
	    && false == ((Class222) this).aBool2587)
	    ((Class222) this).aClass241_Sub3_2586.method14618(-174251917);
	((Class222) this).anInt2588 = -1170883249;
	((Class222) this).anInt2589 = -453817619;
    }
    
    public static void method4483(byte i) {
	if ((1766317249 * client.anInt8288 == 19
	     || 9 == client.anInt8288 * 1766317249)
	    && client.aClass190_8340 != null) {
	    for (;;) {
		Interface56 interface56
		    = (Interface56) Class551.aLinkedList7121.poll();
		if (null == interface56)
		    break;
		interface56.method191(-1987007789);
	    }
	}
    }
    
    static final void method4484(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	if (i_1_ == -1)
	    throw new RuntimeException();
	ClientScriptMap class406
	    = Class105_Sub1.cs2MapsList.list(i_1_, (byte) -26);
	if (i_0_ != class406.aChar5898)
	    throw new RuntimeException();
	int[] is = class406.method7248(Integer.valueOf(i_2_), 2129690414);
	int i_3_ = 0;
	if (is != null)
	    i_3_ = is.length;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_3_;
    }
    
    static final void method4485(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 1736754263;
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = AnimationConfigLoader.method11906(i_4_, -1018087850);
    }
    
    static final void method4486(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 1830590986;
	class58.anInt809
	    = (((ClientScriptData) class454).integerStack
	       [((ClientScriptData) class454).intStackPointer * 1482319719]) * 432904049;
	class58.anInt882
	    = ((((ClientScriptData) class454).integerStack
		[1 + ((ClientScriptData) class454).intStackPointer * 1482319719])
	       * -1502095023);
	class58.anInt853
	    = ((((ClientScriptData) class454).integerStack
		[1482319719 * ((ClientScriptData) class454).intStackPointer + 2])
	       * -1842792671);
	class58.anInt885
	    = ((((ClientScriptData) class454).integerStack
		[3 + 1482319719 * ((ClientScriptData) class454).intStackPointer])
	       * -1656663299);
	class58.anInt886
	    = ((((ClientScriptData) class454).integerStack
		[1482319719 * ((ClientScriptData) class454).intStackPointer + 4])
	       * -190736269);
	class58.anInt890
	    = ((((ClientScriptData) class454).integerStack
		[5 + ((ClientScriptData) class454).intStackPointer * 1482319719])
	       * -1219737013);
	WorldType.refreshComponent(class58, -607623356);
	if (-389932081 * class58.slot1 == -1 && !class35.aBool374) {
	    Class267.method5195(class58.componentHash * 445907013, (byte) 52);
	    Class124.method2998(445907013 * class58.componentHash, 144346770);
	}
    }
    
    static boolean method4487(int i, int i_5_) {
	return i == 16 || i == 14;
    }
    
    public static int method4488(int i) {
	return 10;
    }
    
    public static void method4489(JS5 class210, JS5 class210_6_,
				  JS5 class210_7_, JS5 class210_8_,
				  int i) {
	Class398.aClass210_5791 = class210;
	InterfaceComponent.aClass210_824 = class210_6_;
	Class54.aClass210_694 = class210_7_;
	Class187.aClass35Array2203
	    = new InterfaceDefinition[Class398.aClass210_5791.getFileCount((byte) 67)];
	Class473.aBoolArray6378
	    = new boolean[Class398.aClass210_5791.getFileCount((byte) -35)];
    }
}
