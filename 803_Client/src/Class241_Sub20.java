/* Class241_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class241_Sub20 extends Node
{
    public static final int anInt8999 = 4;
    public static final int anInt9000 = 2;
    public static final int anInt9001 = 64;
    public static final int anInt9002 = 32;
    public static final int anInt9003 = 16;
    public static final int anInt9004 = 1;
    public static final int anInt9005 = 8;
    static Class241_Sub20 aClass241_Sub20_9006 = new Class241_Sub20(0, -1);
    public int anInt9007;
    public int anInt9008;
    
    public final int method15037() {
	return -438085493 * anInt9007 >> 18 & 0x7;
    }
    
    public final boolean method15038(int i) {
	return (anInt9007 * -438085493 >> 23 & 0x1) != 0;
    }
    
    public final boolean method15039(int i, int i_0_) {
    	return (-438085493 * anInt9007 >> 1 + i & 0x1) != 0;
    }
    
    public final int method15040(short i) {
	return Class448.method7923(-438085493 * anInt9007, (byte) -114);
    }
    
    public final int method15041(byte i) {
	return -438085493 * anInt9007 >> 18 & 0x7;
    }
    
    public final boolean method15042(int i) {
	return 0 != (-438085493 * anInt9007 >> 21 & 0x1);
    }
    
    public final boolean method15043(byte i) {
	return (anInt9007 * -438085493 >> 22 & 0x1) != 0;
    }
    
    public Class241_Sub20(int i, int i_1_) {
	anInt9007 = 1472745251 * i;
	anInt9008 = 2119713187 * i_1_;
    }
    
    public final boolean method15044() {
	return (-438085493 * anInt9007 & 0x1) != 0;
    }
    
    public final int method15045() {
	return -438085493 * anInt9007 >> 18 & 0x7;
    }
    
    public final boolean method15046(int i) {
	return (-438085493 * anInt9007 >> 1 + i & 0x1) != 0;
    }
    
    public final int method15047() {
	return Class448.method7923(-438085493 * anInt9007, (byte) -14);
    }
    
    static final int method15048(int i) {
	return i >> 11 & 0x7f;
    }
    
    static final int method15049(int i) {
	return i >> 11 & 0x7f;
    }
    
    static final int method15050(int i) {
	return i >> 11 & 0x7f;
    }
    
    public final boolean method15051(int i) {
	return (-438085493 * anInt9007 & 0x1) != 0;
    }
    
    public final boolean method15052() {
	return (anInt9007 * -438085493 >> 23 & 0x1) != 0;
    }
    
    public final int method15053() {
	return Class448.method7923(-438085493 * anInt9007, (byte) -72);
    }
    
    public final boolean method15054() {
	return (anInt9007 * -438085493 >> 23 & 0x1) != 0;
    }
    
    public final int method15055() {
	return -438085493 * anInt9007 >> 18 & 0x7;
    }
    
    static final void method15056(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	WorldType.method10547(class58, class35, class454, (byte) 48);
    }
    
    static void method15057(int i, int i_2_, int[] is, int[] is_3_, float[] fs,
			    float[] fs_4_, int i_5_, int i_6_, int i_7_,
			    int i_8_, int i_9_, int i_10_, byte i_11_) {
	int i_12_ = i_5_ + i_6_ * i;
	int i_13_ = i_2_ * i_8_ + i_7_;
	int i_14_ = i - i_9_;
	int i_15_ = i_2_ - i_9_;
	if (null == is) {
	    for (int i_16_ = 0; i_16_ < i_10_; i_16_++) {
		int i_17_ = i_12_ + i_9_;
		while (i_12_ < i_17_)
		    fs_4_[i_13_++] = fs[i_12_++];
		i_12_ += i_14_;
		i_13_ += i_15_;
	    }
	} else if (null == fs) {
	    for (int i_18_ = 0; i_18_ < i_10_; i_18_++) {
		int i_19_ = i_12_ + i_9_;
		while (i_12_ < i_19_)
		    is_3_[i_13_++] = is[i_12_++];
		i_12_ += i_14_;
		i_13_ += i_15_;
	    }
	} else {
	    for (int i_20_ = 0; i_20_ < i_10_; i_20_++) {
		int i_21_ = i_9_ + i_12_;
		while (i_12_ < i_21_) {
		    is_3_[i_13_] = is[i_12_];
		    fs_4_[i_13_++] = fs[i_12_++];
		}
		i_12_ += i_14_;
		i_13_ += i_15_;
	    }
	}
    }
}
