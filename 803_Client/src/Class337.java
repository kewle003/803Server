/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class337 implements Interface32
{
    public int anInt5078;
    
    public Class331 method183(int i) {
	return Class331.aClass331_5046;
    }
    
    Class337(int i) {
	anInt5078 = i * -961935777;
    }
    
    public static Class337 method6083(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readInt((byte) 69);
	return new Class337(i);
    }
    
    public Class331 method184() {
	return Class331.aClass331_5046;
    }
    
    public Class331 method182() {
	return Class331.aClass331_5046;
    }
    
    public static void method6084(byte i) {
	synchronized (Class490.aClass129_6512) {
	    Class490.aClass129_6512.removeSoftReferences((byte) 117);
	}
	synchronized (Class490.aClass129_6513) {
	    Class490.aClass129_6513.removeSoftReferences((byte) 71);
	}
    }
    
    static final void setCompScrollMax/*method6085*/(ClientScriptData scriptData, byte i) {
		int i_0_
		    = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -100);
		InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
		Class124.setScrollMax(class58, class35, scriptData, -1474180677);
    }
    
    static final void method6086(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class25.method934(-389323313).getId((byte) 0);
    }
    
    static final void method6087(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub31_8860
		  .method7880(i_1_, 996762312);
    }
    
    public static void showChatMessage/*method6088*/(
    		int opcode, int flags, String name, String nameUnfiltered, String nameSimple,
    		String message, String clan, int i_7_, byte i_8_) {
		Class41 class41 = (Class41) Class44.aMap610.get(Integer.valueOf(opcode));
		if (null == class41) {
		    class41 = new Class41();
		    Class44.aMap610.put(Integer.valueOf(opcode), class41);
		}
		ChatLine line = class41.method1052(opcode, flags, name, nameUnfiltered, nameSimple,
					 message, clan, i_7_, (byte) 81);
		Class44.aClass407_609.put(line, (long) (line.anInt10834 * 608603855));
		Class44.aClass410_611.method7431(line, (byte) -120);
		client.lastChatUpdate = client.anInt8494 * -531694491;
    }
}
