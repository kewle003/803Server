/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class198
{
    volatile boolean aBool2381;
    URL anURL2382;
    volatile byte[] aByteArray2383;
    
    byte[] method4025() {
	return ((Class198) this).aByteArray2383;
    }
    
    boolean method4026() {
	return ((Class198) this).aBool2381;
    }
    
    byte[] method4027(int i) {
	return ((Class198) this).aByteArray2383;
    }
    
    boolean method4028(int i) {
	return ((Class198) this).aBool2381;
    }
    
    boolean method4029() {
	return ((Class198) this).aBool2381;
    }
    
    boolean method4030() {
	return ((Class198) this).aBool2381;
    }
    
    Class198(URL url) {
	((Class198) this).anURL2382 = url;
    }
    
    byte[] method4031() {
	return ((Class198) this).aByteArray2383;
    }
    
    boolean method4032() {
	return ((Class198) this).aBool2381;
    }
    
    static Class579[] method4033(int i) {
	return (new Class579[]
		{ Class579.aClass579_7557, Class579.aClass579_7558 });
    }
    
    static int method4034(InterfaceComponent class58, int i, int i_0_) {
		if (!client.method13624(class58).method15039(i, 65280)
		    && class58.onContextMenuSelect == null)
		    return -1;
		return ((class58.customCursorIDs != null
			 && class58.customCursorIDs.length > i)
			? class58.customCursorIDs[i] : -1);
    }
    
    static final void method4035(ClientScriptData class454, byte i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class96_Sub2.method15443(i_1_, (byte) 0);
    }
    
    public static void method4036(byte i) {
	Class211.method4281((byte) -67);
	Class16.aBool141 = false;
	Class579.method12709(1011088115 * Class16.anInt156,
			     Class380.anInt5660 * 904064679,
			     Class593.anInt7631 * 1139603851,
			     LoadingScreenDef.anInt5500 * 630071575, (byte) -56);
	Class125.aClass241_Sub39_Sub11_1582 = null;
	Class478.aClass241_Sub39_Sub11_6402 = null;
    }
    
    static final void method4037(ClientScriptData class454, byte i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (null != Class573_Sub1.aClass407_8782) {
	    Node class241
		= Class573_Sub1.aClass407_8782.get((long) i_2_);
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241 != null ? 1 : 0;
	} else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    static final void method4038(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, byte i) {
	class58.aBool877
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	WorldType.refreshComponent(class58, -187223820);
	if (-389932081 * class58.slot1 == -1 && !class35.aBool374)
	    VarBitType.method5912(445907013 * class58.componentHash, (short) -14664);
    }
}
