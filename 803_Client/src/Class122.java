/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class122
{
    static final int anInt1567 = 2;
    int[] anIntArray1568;
    static final int anInt1569 = 0;
    int[] anIntArray1570;
    static int anInt1571;
    
    Class122(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readSmart((short) -8526);
	((Class122) this).anIntArray1568 = new int[i];
	((Class122) this).anIntArray1570 = new int[i];
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    int i_1_ = class241_sub3.readUnsignedByte((byte) -5);
	    ((Class122) this).anIntArray1568[i_0_] = i_1_;
	    int i_2_ = class241_sub3.readUnsignedShort(1162222719);
	    int i_3_ = class241_sub3.readUnsignedShort(1162222719);
	    ((Class122) this).anIntArray1570[i_0_] = (i_2_ << 16) + i_3_;
	}
    }
    
    void method2978(Class93 class93, int i, int i_4_) {
	int i_5_ = ((Class122) this).anIntArray1570[0];
	class93.method2081(i, i_5_ >>> 16, i_5_ & 0xffff, (byte) 65);
	Entity class475_sub1_sub1_sub3
	    = class93.method2083(-300334772);
	class475_sub1_sub1_sub3.queuedStepCount = 0;
	for (int i_6_ = ((Class122) this).anIntArray1568.length - 1; i_6_ >= 0;
	     i_6_--) {
	    int i_7_ = ((Class122) this).anIntArray1568[i_6_];
	    int i_8_ = ((Class122) this).anIntArray1570[i_6_];
	    class475_sub1_sub1_sub3.scenePositionXQueue
		[class475_sub1_sub1_sub3.queuedStepCount * -316498507]
		= i_8_ >> 16;
	    class475_sub1_sub1_sub3.scenePositionYQueue
		[-316498507 * class475_sub1_sub1_sub3.queuedStepCount]
		= i_8_ & 0xffff;
	    byte i_9_ = Class448.aClass448_6186.aByte6187;
	    if (i_7_ == 0)
		i_9_ = Class448.aClass448_6185.aByte6187;
	    else if (2 == i_7_)
		i_9_ = Class448.aClass448_6184.aByte6187;
	    class475_sub1_sub1_sub3.moveTypeQueue
		[-316498507 * class475_sub1_sub1_sub3.queuedStepCount]
		= i_9_;
	    class475_sub1_sub1_sub3.queuedStepCount += 1631398045;
	}
    }
    
    void method2979(Class93 class93, int i) {
	int i_10_ = ((Class122) this).anIntArray1570[0];
	class93.method2081(i, i_10_ >>> 16, i_10_ & 0xffff, (byte) 82);
	Entity class475_sub1_sub1_sub3
	    = class93.method2083(-63662917);
	class475_sub1_sub1_sub3.queuedStepCount = 0;
	for (int i_11_ = ((Class122) this).anIntArray1568.length - 1;
	     i_11_ >= 0; i_11_--) {
	    int i_12_ = ((Class122) this).anIntArray1568[i_11_];
	    int i_13_ = ((Class122) this).anIntArray1570[i_11_];
	    class475_sub1_sub1_sub3.scenePositionXQueue
		[class475_sub1_sub1_sub3.queuedStepCount * -316498507]
		= i_13_ >> 16;
	    class475_sub1_sub1_sub3.scenePositionYQueue
		[-316498507 * class475_sub1_sub1_sub3.queuedStepCount]
		= i_13_ & 0xffff;
	    byte i_14_ = Class448.aClass448_6186.aByte6187;
	    if (i_12_ == 0)
		i_14_ = Class448.aClass448_6185.aByte6187;
	    else if (2 == i_12_)
		i_14_ = Class448.aClass448_6184.aByte6187;
	    class475_sub1_sub1_sub3.moveTypeQueue
		[-316498507 * class475_sub1_sub1_sub3.queuedStepCount]
		= i_14_;
	    class475_sub1_sub1_sub3.queuedStepCount += 1631398045;
	}
    }
    
    public static void method2980(int i, int i_15_) {
	if (i < 0 || i > 2)
	    i = 0;
	Class487.anInt6480 = i * 862860999;
	Class42.aClass489Array602
	    = (new Class489
	       [Class90.anIntArray1300[Class487.anInt6480 * 275753719] + 1]);
	Class487.anInt6474 = 0;
	Class487.anInt6472 = 0;
    }
    
    static void method2981(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [((ClientScriptData) class454).intStackPointer * 1482319719 - 1]
	    = Class326_Sub3.aClass482_10288.method11010
		  ((((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer - 1]),
		   (short) 3765)
		  .method10966(Class1.aClass19_11, 1675722110) ? 1 : 0;
    }
    
    static final void method2982(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -20) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray971
	    = Class299.extractCs2Params(string, class454, -393825479);
	class58.hasClientScript = true;
    }
    
    public static void method2983(int i) {
		for (Class241_Sub39_Sub10 class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    Class16.aClass410_152.method7440(-1397088259));
		     null != class241_sub39_sub10;
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    Class16.aClass410_152.method7435((byte) -1))) {
		    if ((((Class241_Sub39_Sub10) class241_sub39_sub10).anInt10867
			 * 1633676605)
			> 1) {
			((Class241_Sub39_Sub10) class241_sub39_sub10).anInt10867 = 0;
			Class16.aClass129_155.put(class241_sub39_sub10,
							 (544876251290631095L
							  * (((Class241_Sub39_Sub11)
							      (Class241_Sub39_Sub11)
							      (((Class241_Sub39_Sub10)
								class241_sub39_sub10)
							       .aClass410_10866
							       .aClass241_Sub39_5934
							       .aClass241_Sub39_10148))
							     .aLong10872)));
			((Class241_Sub39_Sub10) class241_sub39_sub10)
			    .aClass410_10866.method7434(-323752823);
		    }
		}
		Class16.anInt149 = 0;
		Class16.anInt148 = 0;
		Class16.aClass429_150.method7652((byte) 27);
		Class16.aClass407_180.method7293(-93699336);
		Class16.aClass410_152.method7434(-1416291021);
		Class16.aBool141 = false;
    }
    
    static final void method2984(ClientScriptData class454, int i) {
	int i_16_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = Class372.method6659((byte) 29);
	if (null != class241_sub39_sub12) {
	    boolean bool
		= class241_sub39_sub12.method17257(i_16_ >> 28 & 0x3,
						   i_16_ >> 14 & 0x3fff,
						   i_16_ & 0x3fff,
						   Class450.anIntArray6199,
						   -196102969);
	    if (bool)
		Class120_Sub15.method16788(Class450.anIntArray6199[1],
					   Class450.anIntArray6199[2],
					   (byte) 0);
	}
    }
    
    static final void method2985(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_17_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_18_ = (((ClientScriptData) class454).integerStack
		     [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	((ClientScriptData) class454).aClass333_6242.anIntArray5060[i_17_] = i_18_;
    }
    
    static void method2986(Class535 class535, int i, int i_19_, int i_20_,
			   Class89 class89, int i_21_) {
	if (class89 != null)
	    class535.method11884(i, i_19_, i_20_, class89.method1893(),
				 class89.method1895(), class89.method1906(),
				 class89.method1902(), class89.method1865(),
				 class89.method1899(), class89.method1996());
    }
}
