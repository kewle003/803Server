/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

//package com.jagex.js5;
public class MasterIndex {
    Class274[] aClass274Array4514;
    public static NPCDefinitionLoader npcDefLoader;//aClass405_4515
    
    MasterIndex(RSByteBuffer buffer, BigInteger biginteger, BigInteger biginteger_0_) {
    	buffer.pointer = 889752551;
		int i = buffer.readUnsignedByte((byte) -1);
		buffer.pointer += i * 1351138928;
		byte[] is = new byte[(buffer.payload.length - buffer.pointer * 421967667)];
		buffer.readBytes(is, 0, is.length, (byte) -21);
		byte[] expected;
		if (biginteger == null || null == biginteger_0_) {
			expected = is;
		} else {
		    BigInteger biginteger_2_ = new BigInteger(is);
		    BigInteger biginteger_3_ = biginteger_2_.modPow(biginteger, biginteger_0_);
		    expected = biginteger_3_.toByteArray();
		}
		if (expected.length != 65 && expected.length != 64) {
		    throw new RuntimeException("Incorrect Whirlpool length - got: " + expected.length + " bytes");
		}
		byte[] got = Class187.whirlpool(buffer.payload, 5, (buffer.pointer * 421967667 - is.length - 5),
						   (short) 255);
		for (int i_5_ = 0; i_5_ < 64; i_5_++) {
		    if (got[i_5_] != expected[i_5_ + (expected.length == 65 ? 1 : 0)]) {
		    	throw new RuntimeException("Masterindex Whirlpool from server does not match my calculation - expected:" + expected/*js5.av(var4)*/ + " got:" + got/*js5.av(var7)*/);
		    }
		}
		aClass274Array4514 = new Class274[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			buffer.pointer = 1351138928 * i_6_ + 208709602;
		    int i_7_ = buffer.readInt((byte) 96);
		    int i_8_ = buffer.readInt((byte) 88);
		    int i_9_ = buffer.readInt((byte) 107);
		    int i_10_ = buffer.readInt((byte) 88);
		    byte[] is_11_ = new byte[64];
		    buffer.readBytes(is_11_, 0, 64, (byte) -31);
		    aClass274Array4514[i_6_] = new Class274(i_7_, i_9_, i_8_, i_10_, is_11_);
		}
    }
    
    static final void method5728(ClientScriptData class454, int i) {
	int i_12_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1620255081 * client.aClass220Array8426[i_12_].anInt2563;
    }
    
    static final void method5729(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub18_8862
		  .method14259(2126534719) ? 1 : 0;
    }
    
    static final void method5730(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_13_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_14_ = (((ClientScriptData) class454).integerStack
		     [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	Class410 class410
	    = Class573.method12587(i_13_ >> 14 & 0x3fff, i_13_ & 0x3fff);
	boolean bool = false;
	for (Class241_Sub39_Sub12 class241_sub39_sub12
		 = (Class241_Sub39_Sub12) class410.method7440(-1397088259);
	     class241_sub39_sub12 != null;
	     class241_sub39_sub12
		 = (Class241_Sub39_Sub12) class410.method7435((byte) -1)) {
	    if (i_14_ == class241_sub39_sub12.anInt10925 * 1100684019) {
		bool = true;
		break;
	    }
	}
	if (bool)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
}
