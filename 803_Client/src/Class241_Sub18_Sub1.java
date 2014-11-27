/* Class241_Sub18_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub18_Sub1 extends Class241_Sub18
{
    NodeCollection aClass429_10842 = new NodeCollection();
    static Class295 aClass295_10843 = new Class295(64, Class294.aClass294_4496);
    int anInt10844;
    static final int anInt10845 = 100;
    int anInt10846 = 0;
    
    public static int huffmanEncrypt/*method17127*/(RSByteBuffer stream, String message, int i) {
		int offset = 421967667 * stream.pointer;
		byte[] msgData = Class542.getMessageData(message, 468558693);
		stream.writePSmart(msgData.length, -1531234668);
		stream.pointer += Class62.huffmanEncoder.encryptMessage(msgData, 0, msgData.length,
		    		stream.payload, (stream.pointer * 421967667), (byte) 98) * -681042949;
		return stream.pointer * 421967667 - offset;
    }
    
    public void method17128(int i, int i_1_) {
	/* empty */
    }
    
    synchronized int method17129(byte i) {
	return anInt10846 * -749011655;
    }
    
    static final void storeVarBit/*method17130*/(ClientScriptData scriptData, int i) {
		VarBitType varBitType = (VarBitType) scriptData.script
				  .objectConstants[1938982693 * scriptData.step];
		VarDomain varDomain = (VarDomain) (
				0 == scriptData.integerConstants[scriptData.step * 1938982693]
						? scriptData.aMap6241.get(varBitType.baseVar.domain)
						: scriptData.aMap6238.get(varBitType.baseVar.domain));
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = varDomain.getVarBitValue(varBitType, (short) 21279);
    }
    
    synchronized void method17131(Class241_Sub21 class241_sub21, int i) {
	for (/**/; -749011655 * anInt10846 >= 100;
	     anInt10846 -= -517021431)
	    aClass429_10842
		.getNext(-1507610456);
	aClass429_10842
	    .addNode(class241_sub21, (short) -11871);
	anInt10846 += -517021431;
    }
    
    synchronized double method17132(int i) {
	if (-749011655 * anInt10846 < 1)
	    return -1.0;
	Class241_Sub21 class241_sub21
	    = (Class241_Sub21) aClass429_10842
				   .method7694(16711935);
	if (class241_sub21 == null)
	    return -1.0;
	return (((Class241_Sub21) class241_sub21).aDouble9009
		- (double) ((float) (((Class241_Sub21) class241_sub21)
				     .aShortArrayArray9010[0]).length
			    / (float) Class251.anInt4000));
    }
    
    synchronized void method17133(int i) {
	/* empty */
    }
    
    synchronized void method17134(boolean bool, byte i) {
	/* empty */
    }
    
    Class241_Sub21 method17135(int i, double d) {
	long l = (long) ((1780718163 * anInt10844
			  << 32)
			 | i);
	Class241_Sub21 class241_sub21
	    = ((Class241_Sub21)
	       aClass295_10843.method5704(Long.valueOf(l), -1260281108));
	if (class241_sub21 != null) {
	    ((Class241_Sub21) class241_sub21).aDouble9009 = d;
	    aClass295_10843.method5706(Long.valueOf(l), 947775642);
	} else
	    class241_sub21
		= new Class241_Sub21(new short[(((Class241_Sub18_Sub1) this)
						.anInt10844) * 1780718163][i],
				     d);
	return class241_sub21;
    }
    
    public void method17136(int i) {
	/* empty */
    }
    
    public static void method17137(int[] is, Object[] objects, int i) {
	Class487.method11145(is, objects, 0, is.length - 1, -530253391);
    }
    
    synchronized void method17138() {
	/* empty */
    }
    
    synchronized void method17139(Class241_Sub21 class241_sub21) {
	for (/**/; -749011655 * anInt10846 >= 100;
	     anInt10846 -= -517021431)
	    aClass429_10842
		.getNext(-1894188415);
	aClass429_10842.addNode(class241_sub21,
								(short) -1562);
	anInt10846 += -517021431;
    }
    
    public static int method17140(int i, int i_2_, int i_3_) {
	int i_4_ = i_2_ >>> 24;
	int i_5_ = 255 - i_4_;
	i_2_ = ((i_2_ & 0xff00ff) * i_4_ & ~0xff00ff
		| i_4_ * (i_2_ & 0xff00) & 0xff0000) >>> 8;
	return i_2_ + (((i & 0xff00ff) * i_5_ & ~0xff00ff
			| (i & 0xff00) * i_5_ & 0xff0000)
		       >>> 8);
    }
    
    synchronized void method17141() {
	/* empty */
    }
    
    synchronized void method17142(boolean bool) {
	/* empty */
    }
    
    synchronized void method17143(boolean bool) {
	/* empty */
    }
    
    public static final void method17144(int i) {
	Class13.anInt101 = 1448084985;
	Class13.anInt110 = 1937545862;
	Class13.anInt75 = 695245318;
    }
    
    synchronized int method17145() {
	return anInt10846 * -749011655;
    }
    
    Class241_Sub21 method17146(int i, double d) {
	long l = (long) ((1780718163 * anInt10844
			  << 32)
			 | i);
	Class241_Sub21 class241_sub21
	    = ((Class241_Sub21)
	       aClass295_10843.method5704(Long.valueOf(l), 1046648756));
	if (class241_sub21 != null) {
	    ((Class241_Sub21) class241_sub21).aDouble9009 = d;
	    aClass295_10843.method5706(Long.valueOf(l), 947775642);
	} else
	    class241_sub21
		= new Class241_Sub21(new short[(((Class241_Sub18_Sub1) this)
						.anInt10844) * 1780718163][i],
				     d);
	return class241_sub21;
    }
    
    Class241_Sub18_Sub1(int i) {
	anInt10844 = i * 608680411;
    }
    
    public void method17147(int i) {
	/* empty */
    }
    
    static final void method17148(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_6_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_7_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	ItemDefinition class623
	    = JS5.itemDefLoader.list(i_6_, (short) 19123);
	if (i_7_ >= 1 && i_7_ <= 5
	    && null != class623.groundOptions[i_7_ - 1])
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= class623.groundOptions[i_7_ - 1];
	else
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
    }
    
    static final void method17149(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	long l = (long) (((ClientScriptData) class454).integerStack
			 [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	long l_8_
	    = (long) (((ClientScriptData) class454).integerStack
		      [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) (l * l_8_ / 100L + l);
    }
    
    static final void method17150(ClientScriptData class454, byte i) {
	int i_9_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_9_, (byte) -48);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_9_ >> 16];
	Class26.method954(class58, class35, class454, 1479686619);
    }
    
    static final void method17151(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= 1736754263;
    }
    
    public static void method17152(JS5 class210, JS5 class210_10_,
				   int i, int i_11_) {
	Class421.aClass210_6041 = class210;
	Class241_Sub39_Sub2.aClass210_10824 = class210_10_;
    }
}
