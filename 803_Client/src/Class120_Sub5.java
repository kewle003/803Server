/* Class120_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub5 extends Class120
{
    int anInt10480;
    int anInt10481;
    int anInt10482;
    int anInt10483;
    Class221 aClass221_10484;
    public static Interface6 anInterface6_10485;
    
    Class120_Sub5(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub5) this).anInt10482
	    = class241_sub3.readUnsignedShort(1162222719) * 2054080497;
	((Class120_Sub5) this).anInt10481
	    = class241_sub3.readUnsignedByte((byte) -22) * 1456837813;
	((Class120_Sub5) this).anInt10480
	    = class241_sub3.readUnsignedByte((byte) -41) * 1341719439;
	((Class120_Sub5) this).anInt10483
	    = class241_sub3.readUnsignedByte((byte) 23) * -265604997;
	((Class120_Sub5) this).aClass221_10484
	    = (Class402.soundManager.method1161
	       (Class112.aClass112_1522, this,
		-1431221999 * ((Class120_Sub5) this).anInt10482,
		((Class120_Sub5) this).anInt10483 * 1863659187,
		-914769507 * ((Class120_Sub5) this).anInt10481,
		Class130.aClass130_1597.method3067(-960497231),
		Class127.aClass127_1587, 0.0F, 0.0F, null, 0,
		((Class120_Sub5) this).anInt10480 * -860701841, false,
		1747354854));
	if (((Class120_Sub5) this).aClass221_10484 != null)
	    ((Class120_Sub5) this).aClass221_10484.method4438(1406443356);
    }
    
    public void method2958(int i) {
	if (((Class120_Sub5) this).aClass221_10484 != null)
	    ((Class120_Sub5) this).aClass221_10484.method4392(1116226063);
    }
    
    void method2959(int i) {
	if (null != ((Class120_Sub5) this).aClass221_10484) {
	    ((Class120_Sub5) this).aClass221_10484.method4405(50, -1144211437);
	    Class402.soundManager.method1136((((Class120_Sub5) this)
					       .aClass221_10484),
					      (byte) -105);
	    ((Class120_Sub5) this).aClass221_10484 = null;
	}
    }
    
    void method2966() {
	if (null != ((Class120_Sub5) this).aClass221_10484) {
	    ((Class120_Sub5) this).aClass221_10484.method4405(50, -646024593);
	    Class402.soundManager.method1136((((Class120_Sub5) this)
					       .aClass221_10484),
					      (byte) -77);
	    ((Class120_Sub5) this).aClass221_10484 = null;
	}
    }
    
    void method2965() {
	if (null != ((Class120_Sub5) this).aClass221_10484) {
	    ((Class120_Sub5) this).aClass221_10484.method4405(50, -1528760825);
	    Class402.soundManager.method1136((((Class120_Sub5) this)
					       .aClass221_10484),
					      (byte) -55);
	    ((Class120_Sub5) this).aClass221_10484 = null;
	}
    }
    
    void method2963() {
	if (null != ((Class120_Sub5) this).aClass221_10484) {
	    ((Class120_Sub5) this).aClass221_10484.method4405(50, -1711644055);
	    Class402.soundManager.method1136((((Class120_Sub5) this)
					       .aClass221_10484),
					      (byte) -13);
	    ((Class120_Sub5) this).aClass221_10484 = null;
	}
    }
    
    void method2967() {
	if (null != ((Class120_Sub5) this).aClass221_10484) {
	    ((Class120_Sub5) this).aClass221_10484.method4405(50, -188013866);
	    Class402.soundManager.method1136((((Class120_Sub5) this)
					       .aClass221_10484),
					      (byte) -34);
	    ((Class120_Sub5) this).aClass221_10484 = null;
	}
    }
    
    public void method2961() {
	if (((Class120_Sub5) this).aClass221_10484 != null)
	    ((Class120_Sub5) this).aClass221_10484.method4392(1072682865);
    }
    
    static final void method16769(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -1642917540;
	class58.anInt989
	    = (((ClientScriptData) class454).integerStack
	       [1482319719 * ((ClientScriptData) class454).intStackPointer]) * -1350910127;
	class58.anInt992
	    = ((((ClientScriptData) class454).integerStack
		[1 + 1482319719 * ((ClientScriptData) class454).intStackPointer])
	       * 1330043327);
	class58.anInt1013
	    = (((ClientScriptData) class454).integerStack
	       [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]) * 669556303;
	class58.anInt994
	    = ((((ClientScriptData) class454).integerStack
		[3 + 1482319719 * ((ClientScriptData) class454).intStackPointer])
	       * -1167831237);
	WorldType.refreshComponent(class58, -270654714);
    }
}
