/* Class120_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub6 extends Class120
{
    int anInt10486;
    int anInt10487;
    
    boolean method2962() {
	Class402.soundManager.method1163(-988018871 * (((Class120_Sub6) this)
							.anInt10486),
					  250422915 * (((Class120_Sub6) this)
						       .anInt10487),
					  378943703);
	return true;
    }
    
    public void method2958(int i) {
	Class402.soundManager.method1168(-988018871 * (((Class120_Sub6) this)
							.anInt10486),
					  -1690522042);
    }
    
    public void method2961() {
	Class402.soundManager.method1168(-988018871 * (((Class120_Sub6) this)
							.anInt10486),
					  583230854);
    }
    
    boolean method2960(byte i) {
	Class402.soundManager.method1163(-988018871 * (((Class120_Sub6) this)
							.anInt10486),
					  250422915 * (((Class120_Sub6) this)
						       .anInt10487),
					  378943703);
	return true;
    }
    
    Class120_Sub6(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub6) this).anInt10486
	    = class241_sub3.readUnsignedShort(1162222719) * 696490745;
	((Class120_Sub6) this).anInt10487
	    = class241_sub3.readUnsignedByte((byte) 18) * 870635563;
    }
    
    boolean method2957() {
	Class402.soundManager.method1163(-988018871 * (((Class120_Sub6) this)
							.anInt10486),
					  250422915 * (((Class120_Sub6) this)
						       .anInt10487),
					  378943703);
	return true;
    }
    
    boolean method2964() {
	Class402.soundManager.method1163(-988018871 * (((Class120_Sub6) this)
							.anInt10486),
					  250422915 * (((Class120_Sub6) this)
						       .anInt10487),
					  378943703);
	return true;
    }
    
    static final void method16770(InterfaceComponent class58, ClientScriptData class454, int i) {
	Class639 class639
	    = class58.method1511(Class425.aClass344_6080,
				 client.anInterface26_8552, (byte) 90);
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_2_ = class639.method13563(class58.text,
					439139681 * class58.anInt850,
					class58.textLineHeight * 960697577, i_1_,
					i_0_, Class445_Sub9.aClass168Array8642,
					2116664577);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_2_;
    }
    
    static final void method16771(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub39_Sub9 class241_sub39_sub9
	    = Class72.aClass625_1100.list(i_3_, 343897072);
	if (class241_sub39_sub9.anIntArray10863 == null)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub39_sub9.anIntArray10863.length;
    }
}
