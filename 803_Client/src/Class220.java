/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class220
{
    byte aByte2561;
    public int anInt2562;
    public int anInt2563;
    public int anInt2564;
    public int anInt2565;
    public int anInt2566;
    
    public Class220(RSByteBuffer class241_sub3, VarTypeList class199_sub2) {
		aByte2561 = class241_sub3.getByte(-1142709152);
		anInt2564 = class241_sub3.readUnsignedShort(1162222719) * 1579832115;
		anInt2563 = class241_sub3.readInt((byte) 117) * -2143322407;
		anInt2566 = class241_sub3.readInt((byte) 43) * 121987971;
		anInt2565 = class241_sub3.readInt((byte) 110) * -539723171;
		anInt2562 = class241_sub3.readInt((byte) 64) * 2077168513;
		if (null != class199_sub2) {
		    Class445_Sub9.method14183(class241_sub3, class199_sub2, 834761587);
		}
    }
    
    public int method4379() {
	return 8 == (((Class220) this).aByte2561 & 0x8) ? 1 : 0;
    }
    
    public Class220() {
	/* empty */
    }
    
    public int method4380(int i) {
	return 8 == (((Class220) this).aByte2561 & 0x8) ? 1 : 0;
    }
    
    public int method4381() {
	return ((Class220) this).aByte2561 & 0x7;
    }
    
    public int method4382() {
	return 8 == (((Class220) this).aByte2561 & 0x8) ? 1 : 0;
    }
    
    public int method4383(byte i) {
	return ((Class220) this).aByte2561 & 0x7;
    }
    
    static final void method4384(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 1736754263;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	Class402.soundManager.method1146(i_0_, -1378710875);
    }
    
    public static void method4385(Class552 class552, Class103 class103,
				  int i) {
	Iterator iterator = Class487.aList6475.iterator();
	while (iterator.hasNext()) {
	    Class489 class489 = (Class489) iterator.next();
	    if (((Class489) class489).aBool6490)
		class489.method11163(class552, class103);
	}
    }
    
    static final void setVarcompLocation/*method4386*/(ClientScriptData scriptData, byte i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class445_Sub29.setComponentLocation(component, iFace, scriptData, (byte) 81);
    }
}
