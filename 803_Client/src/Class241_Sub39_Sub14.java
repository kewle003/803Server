/* Class241_Sub39_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub39_Sub14 extends Class241_Sub39
{
    public char[] aCharArray10965;
    public String aString10966;
    public int[] anIntArray10967;
    public int[] anIntArray10968;
    public char[] aCharArray10969;
    
    public int method17375(char c) {
	if (null == anIntArray10968)
	    return -1;
	for (int i = 0; i < anIntArray10968.length; i++) {
	    if (aCharArray10969[i] == c)
		return anIntArray10968[i];
	}
	return -1;
    }
    
    void method17376(RSByteBuffer class241_sub3, byte i) {
	for (;;) {
	    int i_0_ = class241_sub3.readUnsignedByte((byte) -45);
	    if (i_0_ == 0)
		break;
	    method17377(class241_sub3, i_0_, -703588794);
	}
    }
    
    void method17377(RSByteBuffer class241_sub3, int i, int i_1_) {
	do {
	    if (1 == i)
		aString10966 = class241_sub3.readString(124091227);
	    else if (i == 2) {
		int i_2_ = class241_sub3.readUnsignedByte((byte) -36);
		anIntArray10967 = new int[i_2_];
		aCharArray10965 = new char[i_2_];
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
		    anIntArray10967[i_3_]
			= class241_sub3.readUnsignedShort(1162222719);
		    byte i_4_ = class241_sub3.getByte(-1671386361);
		    aCharArray10965[i_3_]
			= i_4_ == 0 ? '\0' : Class80.method1809(i_4_,
								-50223321);
		}
	    } else if (3 == i) {
		int i_5_ = class241_sub3.readUnsignedByte((byte) -65);
		anIntArray10968 = new int[i_5_];
		aCharArray10969 = new char[i_5_];
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
		    anIntArray10968[i_6_]
			= class241_sub3.readUnsignedShort(1162222719);
		    byte i_7_ = class241_sub3.getByte(-670679648);
		    aCharArray10969[i_6_]
			= i_7_ == 0 ? '\0' : Class80.method1809(i_7_,
								63165084);
		}
	    } else if (i == 4)
		break;
	} while (false);
    }
    
    void method17378() {
	if (anIntArray10968 != null) {
	    for (int i = 0; i < anIntArray10968.length; i++)
		anIntArray10968[i] |= 0x8000;
	}
	if (anIntArray10967 != null) {
	    for (int i = 0; i < anIntArray10967.length; i++)
		anIntArray10967[i] |= 0x8000;
	}
    }
    
    public int method17379(char c, byte i) {
	if (null == anIntArray10968)
	    return -1;
	for (int i_8_ = 0; i_8_ < anIntArray10968.length; i_8_++) {
	    if (aCharArray10969[i_8_] == c)
		return anIntArray10968[i_8_];
	}
	return -1;
    }
    
    public int method17380(char c, byte i) {
	if (anIntArray10967 == null)
	    return -1;
	for (int i_9_ = 0; i_9_ < anIntArray10967.length; i_9_++) {
	    if (aCharArray10965[i_9_] == c)
		return anIntArray10967[i_9_];
	}
	return -1;
    }
    
    void method17381(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -95);
	    if (i == 0)
		break;
	    method17377(class241_sub3, i, -520252136);
	}
    }
    
    void method17382(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -57);
	    if (i == 0)
		break;
	    method17377(class241_sub3, i, -988888206);
	}
    }
    
    void method17383(int i) {
	if (anIntArray10968 != null) {
	    for (int i_10_ = 0; i_10_ < anIntArray10968.length; i_10_++)
		anIntArray10968[i_10_] |= 0x8000;
	}
	if (anIntArray10967 != null) {
	    for (int i_11_ = 0; i_11_ < anIntArray10967.length; i_11_++)
		anIntArray10967[i_11_] |= 0x8000;
	}
    }
    
    Class241_Sub39_Sub14() {
	/* empty */
    }
    
    public int method17384(char c) {
	if (null == anIntArray10968)
	    return -1;
	for (int i = 0; i < anIntArray10968.length; i++) {
	    if (aCharArray10969[i] == c)
		return anIntArray10968[i];
	}
	return -1;
    }
    
    public int method17385(char c) {
	if (anIntArray10967 == null)
	    return -1;
	for (int i = 0; i < anIntArray10967.length; i++) {
	    if (aCharArray10965[i] == c)
		return anIntArray10967[i];
	}
	return -1;
    }
    
    void method17386(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 45);
	    if (i == 0)
		break;
	    method17377(class241_sub3, i, -339497830);
	}
    }
    
    void method17387() {
	if (anIntArray10968 != null) {
	    for (int i = 0; i < anIntArray10968.length; i++)
		anIntArray10968[i] |= 0x8000;
	}
	if (anIntArray10967 != null) {
	    for (int i = 0; i < anIntArray10967.length; i++)
		anIntArray10967[i] |= 0x8000;
	}
    }
    
    void method17388() {
	if (anIntArray10968 != null) {
	    for (int i = 0; i < anIntArray10968.length; i++)
		anIntArray10968[i] |= 0x8000;
	}
	if (anIntArray10967 != null) {
	    for (int i = 0; i < anIntArray10967.length; i++)
		anIntArray10967[i] |= 0x8000;
	}
    }
    
    void method17389() {
	if (anIntArray10968 != null) {
	    for (int i = 0; i < anIntArray10968.length; i++)
		anIntArray10968[i] |= 0x8000;
	}
	if (anIntArray10967 != null) {
	    for (int i = 0; i < anIntArray10967.length; i++)
		anIntArray10967[i] |= 0x8000;
	}
    }
}
