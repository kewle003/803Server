/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class275
{
    public static final int anInt4380 = 3;
    public static final int anInt4381 = 0;
    public static final int anInt4382 = 1;
    public static final int anInt4383 = 4;
    public static final int anInt4384 = 2;
    
    Class275() throws Throwable {
	throw new Error();
    }
    
    public static Class334 method5346(RSByteBuffer class241_sub3, int i) {
	int i_0_ = class241_sub3.readBigSmart((byte) -29);
	return new Class334(i_0_);
    }
    
    static ClientScript method5347(byte[] is, byte i) {
    	return new ClientScript(new RSByteBuffer(is), Class215.anInterface13_2523);
    }
    
    static final void method5348(ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	Class299_Sub1.fcKickUser(string, 1986659788);
    }
    
    static final void method5349(ClientScriptData class454, int i) {
	if (client.aBool8267)
	    JSFunction.aClass348_5369.method6212((byte) 0);
    }
    
    static final void method5350(ClientScriptData class454, short i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -123);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
	Class564.setComponentText(class58, class35, class454, 190231187);
    }
}
