/* Class442 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Frame;

public final class Class442
{
    public static boolean aBool6160 = true;
    
    public static Class446[] method7844(Class426 class426) {
	int[] is = class426.method7570(470356928);
	Class446[] class446s = new Class446[is.length >> 2];
	for (int i = 0; i < class446s.length; i++) {
	    Class446 class446 = new Class446();
	    class446s[i] = class446;
	    class446.anInt6177 = 1054117541 * is[i << 2];
	    class446.anInt6180 = -1272580081 * is[(i << 2) + 1];
	    class446.anInt6179 = is[2 + (i << 2)] * 282069389;
	    ((Class446) class446).anInt6178 = is[(i << 2) + 3] * 201103209;
	}
	return class446s;
    }
    
    Class442() throws Throwable {
	throw new Error();
    }
    
    public static void method7845(Class426 class426, Frame frame) {
	class426.method7576(-1120037695);
	frame.setVisible(false);
	frame.dispose();
    }
    
    public static void method7846(Class426 class426, Frame frame) {
	class426.method7576(-1120037695);
	frame.setVisible(false);
	frame.dispose();
    }
    
    public static Class580 method7847(Component component, boolean bool,
				      int i) {
	return new Class580_Sub1(component, bool);
    }
    
    static boolean method7848(int i, int i_0_) {
	return 0 == i || i == 18 || i == 15;
    }
    
    static final void method7849(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class281.method5488(class58, class35, false, 2, class454, 1803291532);
    }
    
    public static int method7850(int i) {
	return CcDeltaNode.aClass70_9022.method1692(905689068);
    }
}
