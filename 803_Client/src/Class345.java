/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class345
{
    public static final int anInt5350 = 803;
    public static final int anInt5351 = 1;
    
    Class345() throws Throwable {
	throw new Error();
    }
    
    static Class method6175(String string, int i)
	throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    static final void method6176(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -74);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	Class25.method938(class58, class35, class454, 308570650);
    }
    
    public static int method6177(byte i) {
	Canvas canvas = new Canvas();
	canvas.setSize(100, 100);
	Class103 class103
	    = Class40.method1044(0, canvas, null, null, null, 0, (byte) 41);
	long l = Class50.method1249((byte) 1);
	for (int i_1_ = 0; i_1_ < 10000; i_1_++)
	    class103.method2270(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F,
				-65536, -65536, -65536, 1);
	int i_2_ = (int) (Class50.method1249((byte) 1) - l);
	class103.method2263(0, 0, 100, 100, -16777216, (byte) -5);
	class103.method2220((byte) 0);
	return i_2_;
    }
}
