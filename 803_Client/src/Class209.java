/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.js5;
public abstract class Class209 {
    RSByteBuffer aClass241_Sub3_2458;
    Class241_Sub39_Sub5_Sub3 aClass241_Sub39_Sub5_Sub3_2459;
    static final int anInt2460 = 3;
    static final int anInt2461 = 512;
    static final int anInt2462 = 5;
    static final int anInt2463 = 5;
    Class410 aClass410_2464 = new Class410();
    Class410 aClass410_2465 = new Class410();
    Class410 aClass410_2466 = new Class410();
    int anInt2467;
    int anInt2468;
    long aLong2469;
    RSByteBuffer aClass241_Sub3_2470;
    byte aByte2471;
    public volatile int anInt2472;
    public volatile int anInt2473;
    RSByteBuffer aClass241_Sub3_2474;
    public volatile int anInt2475;
    static final int anInt2476 = 100;
    static final int anInt2477 = 20;
    public volatile int anInt2478;
    Class410 aClass410_2479 = new Class410();
    public static JS5 HUFFMAN_ARCHIVE;//aClass210_2480
    
    public abstract void method4138(int i);
    
    Class241_Sub39_Sub5_Sub3 method4139(int i, int i_0_, byte i_1_, boolean urgent, byte i_2_) {
		long hash = (long) i_0_ + ((long) i << 32);
		Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
		    = new Class241_Sub39_Sub5_Sub3();
		class241_sub39_sub5_sub3.aLong10147 = 7038950999658635139L * hash;
		((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3).aByte11451 = i_1_;
		((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3).urgent  = urgent;
		if (urgent) {
		    if (method4153(1958881907) >= 100) {
		    	throw new RuntimeException("Urgent list exceeded max limit of 100");
		    }
		    aClass410_2464.method7431(class241_sub39_sub5_sub3, (byte) -65);
		} else {
		    if (method4170(1043004052) >= 20) {
		    	throw new RuntimeException("Prefetch list exceeded max limit of 20");
		    }
		    aClass410_2466.method7431(class241_sub39_sub5_sub3, (byte) 0);
		}
		return class241_sub39_sub5_sub3;
    }
    
    public abstract void method4140();
    
    public boolean method4141(int i) {
	return method4153(2127275891) >= 100;
    }
    
    Class209() {
		aClass241_Sub3_2470 = new RSByteBuffer(6);
		aByte2471 = (byte) 0;
		anInt2472 = 0;
		anInt2473 = 0;
		anInt2478 = -254315631;
		anInt2475 = -1455410379;
		aClass241_Sub3_2474 = new RSByteBuffer(5);
		aClass241_Sub3_2458 = new RSByteBuffer(5);
		anInt2467 = 0;
		aClass241_Sub39_Sub5_Sub3_2459 = null;
    }
    
    public abstract void method4142(Object object, boolean bool);
    
    abstract void method4143(int i, int i_3_, int i_4_);
    
    public abstract boolean method4144(int i);
    
    public abstract void method4145(Object object, boolean bool, int i);
    
    public abstract void method4146(boolean bool, int i);
    
    public abstract void method4147(Object object, boolean bool);
    
    public abstract void method4148(int i);
    
    public boolean method4149(int i) {
	return method4170(146330972) >= 20;
    }
    
    Class241_Sub39_Sub5_Sub3 method4150(int i, int i_5_, byte i_6_,
					boolean bool) {
	long l = (long) i_5_ + ((long) i << 32);
	Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
	    = new Class241_Sub39_Sub5_Sub3();
	class241_sub39_sub5_sub3.aLong10147 = 7038950999658635139L * l;
	((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3).aByte11451
	    = i_6_;
	((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3).urgent
	    = bool;
	if (bool) {
	    if (method4153(2115376481) >= 100)
		throw new RuntimeException();
	    aClass410_2464
		.method7431(class241_sub39_sub5_sub3, (byte) -75);
	} else {
	    if (method4170(-246189740) >= 20)
		throw new RuntimeException();
	    aClass410_2466
		.method7431(class241_sub39_sub5_sub3, (byte) -95);
	}
	return class241_sub39_sub5_sub3;
    }
    
    Class241_Sub39_Sub5_Sub3 method4151(int i, int i_7_, byte i_8_,
					boolean bool) {
	long l = (long) i_7_ + ((long) i << 32);
	Class241_Sub39_Sub5_Sub3 class241_sub39_sub5_sub3
	    = new Class241_Sub39_Sub5_Sub3();
	class241_sub39_sub5_sub3.aLong10147 = 7038950999658635139L * l;
	((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3).aByte11451
	    = i_8_;
	((Class241_Sub39_Sub5_Sub3) class241_sub39_sub5_sub3).urgent
	    = bool;
	if (bool) {
	    if (method4153(2088170468) >= 100)
		throw new RuntimeException();
	    aClass410_2464
		.method7431(class241_sub39_sub5_sub3, (byte) -62);
	} else {
	    if (method4170(-2063180138) >= 20)
		throw new RuntimeException();
	    aClass410_2466
		.method7431(class241_sub39_sub5_sub3, (byte) -72);
	}
	return class241_sub39_sub5_sub3;
    }
    
    abstract void method4152(int i, int i_9_);
    
    public int method4153(int i) {
	return (aClass410_2464.method7436(-2108130795)
		+ aClass410_2465.method7436(-2108130795));
    }
    
    public boolean method4154() {
	return method4153(2135287238) >= 100;
    }
    
    public boolean method4155() {
	return method4153(2034512586) >= 100;
    }
    
    int method4156() {
	return (aClass410_2466.method7436(-2108130795)
		+ aClass410_2479.method7436(-2108130795));
    }
    
    int method4157() {
	return (aClass410_2466.method7436(-2108130795)
		+ aClass410_2479.method7436(-2108130795));
    }
    
    int method4158() {
	return (aClass410_2466.method7436(-2108130795)
		+ aClass410_2479.method7436(-2108130795));
    }
    
    public boolean method4159() {
	return method4170(153827363) >= 20;
    }
    
    public boolean method4160() {
	return method4170(291476326) >= 20;
    }
    
    public int method4161() {
	return (aClass410_2464.method7436(-2108130795)
		+ aClass410_2465.method7436(-2108130795));
    }
    
    public abstract boolean method4162();
    
    public abstract boolean method4163();
    
    public int method4164() {
	return (aClass410_2464.method7436(-2108130795)
		+ aClass410_2465.method7436(-2108130795));
    }
    
    public abstract void method4165(Object object, boolean bool);
    
    public abstract void method4166(int i);
    
    public abstract void method4167(boolean bool);
    
    public abstract void method4168(boolean bool);
    
    public abstract void method4169();
    
    int method4170(int i) {
	return (aClass410_2466.method7436(-2108130795)
		+ aClass410_2479.method7436(-2108130795));
    }
    
    public int method4171() {
	return (aClass410_2464.method7436(-2108130795)
		+ aClass410_2465.method7436(-2108130795));
    }
    
    public abstract void method4172();
    
    abstract void method4173(int i, int i_10_);
    
    abstract void method4174(int i, int i_11_);
    
    abstract void method4175(int i, int i_12_);
    
    public abstract void method4176();
    
    public abstract void method4177();
    
    public static String method4178(String string, char c, String string_13_,
				    int i) {
	int i_14_ = string.length();
	int i_15_ = string_13_.length();
	int i_16_ = i_14_;
	int i_17_ = i_15_ - 1;
	if (0 != i_17_) {
	    int i_18_ = 0;
	    for (;;) {
		i_18_ = string.indexOf(c, i_18_);
		if (i_18_ < 0)
		    break;
		i_18_++;
		i_16_ += i_17_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_16_);
	int i_19_ = 0;
	for (;;) {
	    int i_20_ = string.indexOf(c, i_19_);
	    if (i_20_ < 0)
		break;
	    stringbuilder.append(string.substring(i_19_, i_20_));
	    stringbuilder.append(string_13_);
	    i_19_ = 1 + i_20_;
	}
	stringbuilder.append(string.substring(i_19_));
	return stringbuilder.toString();
    }
}
