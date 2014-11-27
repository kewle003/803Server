/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class102
{
    public static Class102 aClass102_1437;
    static Class102 aClass102_1438;
    static Class102 aClass102_1439;
    public static Class102 aClass102_1440;
    public static Class102 aClass102_1441;
    static Class102 aClass102_1442;
    public static Class102 aClass102_1443;
    public static Class102 aClass102_1444;
    static Class102 aClass102_1445 = new Class102(2, 1);
    public int anInt1446;
    public int anInt1447;
    public static Class168 aClass168_1448;
    
    static {
	aClass102_1438 = new Class102(4, 2);
	aClass102_1439 = new Class102(3, 4);
	aClass102_1440 = new Class102(5, 1);
	aClass102_1441 = new Class102(6, 2);
	aClass102_1437 = new Class102(8, 3);
	aClass102_1442 = new Class102(7, 4);
	aClass102_1444 = new Class102(1, 2);
	aClass102_1443 = new Class102(0, 4);
    }
    
    Class102(int i, int i_0_) {
	anInt1446 = -937295961 * i;
	anInt1447 = -6758911 * i_0_;
    }
    
    static final void method2210(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	Class595.method13079(i_1_, new Class241_Sub11(i_2_, 3), null, true,
			     (byte) 0);
    }
    
    public static String method2211(byte[] is, int i) {
	return Class92.method2074(is, 0, is.length, -473809449);
    }
    
    public static void method2212(Class426 class426, Frame frame, byte i) {
	class426.method7576(-1120037695);
	frame.setVisible(false);
	frame.dispose();
    }
    
    static final void method2213(long l) {
	try {
	    Thread.sleep(l);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static final void method2214(ClientScriptData class454, byte i) {
	InterfaceComponent class58
	    = Js5ConfigGroup.getInterfaceComponent((((ClientScriptData) class454).integerStack
				  [(((ClientScriptData) class454).intStackPointer
				    -= 1736754263) * 1482319719]),
				 (byte) -82);
	if (877329925 * class58.slot2 != -1)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1809275135 * class58.anInt975;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
}
