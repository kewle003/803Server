/* Class241_Sub39_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub39_Sub9 extends Class241_Sub39
{
    int[][] anIntArrayArray10859;
    Class625 myList;//aClass625_10860
    int[] anIntArray10861;
    String[] aStringArray10862;
    public int[] anIntArray10863;
    public boolean aBool10864 = true;
    
    public int method17173(int i, int i_0_) {
	if (null == anIntArray10861 || i < 0
	    || i > anIntArray10861.length)
	    return -1;
	if (null == anIntArrayArray10859[i]
	    || i_0_ < 0
	    || (i_0_
		> anIntArrayArray10859[i].length))
	    return -1;
	return anIntArrayArray10859[i][i_0_];
    }
    
    void decode/*method17174*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) -29);
		    if (0 == opcode) {
		    	break;
		    }
		    decode(buffer, opcode, (byte) 28);
		}
    }
    
    public String method17175(RSByteBuffer class241_sub3) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null != anIntArray10861) {
	    for (int i = 0;
		 i < anIntArray10861.length;
		 i++) {
		stringbuilder
		    .append(aStringArray10862[i]);
		stringbuilder.append
		    (myList.method13441
		     (method17196(i, 16711935),
		      anIntArrayArray10859[i],
		      class241_sub3.method14649((Class93.method2093
						 ((((Class241_Sub39_Sub9) this)
						   .anIntArray10861[i]),
						  696491075)
						 .anInt6311) * -196455913,
						-1487016956)));
	    }
	}
	stringbuilder.append(aStringArray10862[aStringArray10862.length - 1]);
	return stringbuilder.toString();
    }
    
    public void method17176(RSByteBuffer class241_sub3, int[] is, int i) {
	if (null != anIntArray10861) {
	    for (int i_2_ = 0;
		 (i_2_ < anIntArray10861.length
		  && i_2_ < is.length);
		 i_2_++) {
		int i_3_ = method17196(i_2_, 16711935).anInt6305 * 32676713;
		if (i_3_ > 0)
		    class241_sub3.method14628((long) is[i_2_], i_3_,
					      (short) 30000);
	    }
	}
    }
    
    public String method17177(RSByteBuffer buffer, int i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (null != anIntArray10861) {
		    for (int index = 0; index < anIntArray10861.length; index++) {
				stringbuilder.append(aStringArray10862[index]);
				stringbuilder.append(
						myList.method13441(
								method17196(index, 16711935),
								anIntArrayArray10859[index],
								buffer.method14649(
										(Class93.method2093(anIntArray10861[index], 696491075).anInt6311) * -196455913,
										-1071420209)));
		    }
		}
		stringbuilder.append(aStringArray10862[aStringArray10862.length - 1]);
		return stringbuilder.toString();
    }
    
    public String method17178(byte i) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null == aStringArray10862)
	    return "";
	stringbuilder
	    .append(aStringArray10862[0]);
	for (int i_5_ = 1;
	     i_5_ < aStringArray10862.length;
	     i_5_++) {
	    for (int i_6_ = 0; i_6_ < 3; i_6_++)
		stringbuilder.append('.');
	    stringbuilder
		.append(aStringArray10862[i_5_]);
	}
	return stringbuilder.toString();
    }
    
    void decode/*method17179*/(RSByteBuffer buffer, int opcode, byte i_7_) {
	if (1 == opcode) {
	    aStringArray10862 = Class225.method4625(buffer.readString(-402310733), '<', 1476972878);
	} else if (2 == opcode) {
	    int length = buffer.readUnsignedByte((byte) 41);
	    anIntArray10863 = new int[length];
	    for (int index = 0; index < length; index++) {
	    	anIntArray10863[index] = buffer.readUnsignedShort(1162222719);
	    }
	} else if (3 == opcode) {
	    int i_10_ = buffer.readUnsignedByte((byte) 92);
	    anIntArray10861 = new int[i_10_];
	    anIntArrayArray10859 = new int[i_10_][];
	    for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
			int i_12_ = buffer.readUnsignedShort(1162222719);
			Class465 class465 = Class93.method2093(i_12_, 696491075);
			if (class465 != null) {
			    anIntArray10861[i_11_] = i_12_;
			    anIntArrayArray10859[i_11_] = new int[class465.anInt6312 * 836325995];
			    for (int i_13_ = 0; i_13_ < 836325995 * class465.anInt6312; i_13_++) {
			    	anIntArrayArray10859[i_11_][i_13_] = buffer.readUnsignedShort(1162222719);
			    }
			}
	    }
	} else if (opcode == 4)
	    aBool10864 = false;
    }
    
    void method17180(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 104);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) -10);
	}
    }
    
    public int method17181(int i, int i_14_, int i_15_) {
	if (null == anIntArray10861 || i < 0
	    || i > anIntArray10861.length)
	    return -1;
	if (null == anIntArrayArray10859[i]
	    || i_14_ < 0
	    || (i_14_
		> anIntArrayArray10859[i].length))
	    return -1;
	return anIntArrayArray10859[i][i_14_];
    }
    
    void method17182(short i) {
		if (null != anIntArray10863) {
		    for (int index = 0; index < anIntArray10863.length; index++) {
		    	anIntArray10863[index] |= 0x8000;
		    }
		}
    }
    
    public void method17183(RSByteBuffer class241_sub3, int[] is) {
	if (null != anIntArray10861) {
	    for (int i = 0;
		 (i < anIntArray10861.length
		  && i < is.length);
		 i++) {
		int i_17_ = method17196(i, 16711935).anInt6305 * 32676713;
		if (i_17_ > 0)
		    class241_sub3.method14628((long) is[i], i_17_,
					      (short) 30000);
	    }
	}
    }
    
    void method17184(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 40);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) 76);
	}
    }
    
    void method17185(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -42);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) -24);
	}
    }
    
    public String method17186(RSByteBuffer class241_sub3) {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null != anIntArray10861) {
	    for (int i = 0;
		 i < anIntArray10861.length;
		 i++) {
		stringbuilder
		    .append(aStringArray10862[i]);
		stringbuilder.append
		    (myList.method13441
		     (method17196(i, 16711935),
		      anIntArrayArray10859[i],
		      class241_sub3.method14649((Class93.method2093
						 ((((Class241_Sub39_Sub9) this)
						   .anIntArray10861[i]),
						  696491075)
						 .anInt6311) * -196455913,
						1952084133)));
	    }
	}
	stringbuilder.append(aStringArray10862
			     [(((Class241_Sub39_Sub9) this)
			       .aStringArray10862).length - 1]);
	return stringbuilder.toString();
    }
    
    void method17187(RSByteBuffer class241_sub3, int i) {
	if (1 == i)
	    aStringArray10862
		= Class225.method4625(class241_sub3.readString(1757609610),
				      '<', 955023916);
	else if (2 == i) {
	    int i_18_ = class241_sub3.readUnsignedByte((byte) -69);
	    anIntArray10863 = new int[i_18_];
	    for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
		anIntArray10863[i_19_] = class241_sub3.readUnsignedShort(1162222719);
	} else if (3 == i) {
	    int i_20_ = class241_sub3.readUnsignedByte((byte) -85);
	    anIntArray10861 = new int[i_20_];
	    anIntArrayArray10859
		= new int[i_20_][];
	    for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
		int i_22_ = class241_sub3.readUnsignedShort(1162222719);
		Class465 class465 = Class93.method2093(i_22_, 696491075);
		if (class465 != null) {
		    anIntArray10861[i_21_]
			= i_22_;
		    anIntArrayArray10859[i_21_]
			= new int[class465.anInt6312 * 836325995];
		    for (int i_23_ = 0; i_23_ < 836325995 * class465.anInt6312;
			 i_23_++)
			anIntArrayArray10859
			    [i_21_][i_23_]
			    = class241_sub3.readUnsignedShort(1162222719);
		}
	    }
	} else if (i == 4)
	    aBool10864 = false;
    }
    
    public String method17188() {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null == aStringArray10862)
	    return "";
	stringbuilder
	    .append(aStringArray10862[0]);
	for (int i = 1;
	     i < aStringArray10862.length; i++) {
	    for (int i_24_ = 0; i_24_ < 3; i_24_++)
		stringbuilder.append('.');
	    stringbuilder
		.append(aStringArray10862[i]);
	}
	return stringbuilder.toString();
    }
    
    void method17189(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 45);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) 9);
	}
    }
    
    public String method17190() {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null == aStringArray10862)
	    return "";
	stringbuilder
	    .append(aStringArray10862[0]);
	for (int i = 1;
	     i < aStringArray10862.length; i++) {
	    for (int i_25_ = 0; i_25_ < 3; i_25_++)
		stringbuilder.append('.');
	    stringbuilder
		.append(aStringArray10862[i]);
	}
	return stringbuilder.toString();
    }
    
    void method17191(RSByteBuffer class241_sub3, int i) {
	if (1 == i)
	    aStringArray10862
		= Class225.method4625(class241_sub3.readString(1864807962),
				      '<', 1300971877);
	else if (2 == i) {
	    int i_26_ = class241_sub3.readUnsignedByte((byte) 78);
	    anIntArray10863 = new int[i_26_];
	    for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
		anIntArray10863[i_27_] = class241_sub3.readUnsignedShort(1162222719);
	} else if (3 == i) {
	    int i_28_ = class241_sub3.readUnsignedByte((byte) -102);
	    anIntArray10861 = new int[i_28_];
	    anIntArrayArray10859
		= new int[i_28_][];
	    for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
		int i_30_ = class241_sub3.readUnsignedShort(1162222719);
		Class465 class465 = Class93.method2093(i_30_, 696491075);
		if (class465 != null) {
		    anIntArray10861[i_29_]
			= i_30_;
		    anIntArrayArray10859[i_29_]
			= new int[class465.anInt6312 * 836325995];
		    for (int i_31_ = 0; i_31_ < 836325995 * class465.anInt6312;
			 i_31_++)
			anIntArrayArray10859
			    [i_29_][i_31_]
			    = class241_sub3.readUnsignedShort(1162222719);
		}
	    }
	} else if (i == 4)
	    aBool10864 = false;
    }
    
    public String method17192() {
	StringBuilder stringbuilder = new StringBuilder(80);
	if (null == aStringArray10862)
	    return "";
	stringbuilder
	    .append(aStringArray10862[0]);
	for (int i = 1;
	     i < aStringArray10862.length; i++) {
	    for (int i_32_ = 0; i_32_ < 3; i_32_++)
		stringbuilder.append('.');
	    stringbuilder
		.append(aStringArray10862[i]);
	}
	return stringbuilder.toString();
    }
    
    public int method17193(int i) {
	if (anIntArray10861 == null)
	    return 0;
	return anIntArray10861.length;
    }
    
    Class241_Sub39_Sub9() {
	/* empty */
    }
    
    public Class465 method17194(int i) {
	if (anIntArray10861 == null || i < 0
	    || i > anIntArray10861.length)
	    return null;
	return Class93.method2093((anIntArray10861
				   [i]),
				  696491075);
    }
    
    public int method17195(int i, int i_33_) {
	if (null == anIntArray10861 || i < 0
	    || i > anIntArray10861.length)
	    return -1;
	if (null == anIntArrayArray10859[i]
	    || i_33_ < 0
	    || (i_33_
		> anIntArrayArray10859[i].length))
	    return -1;
	return anIntArrayArray10859[i][i_33_];
    }
    
    public Class465 method17196(int i, int i_34_) {
	if (anIntArray10861 == null || i < 0
	    || i > anIntArray10861.length)
	    return null;
	return Class93.method2093((anIntArray10861
				   [i]),
				  696491075);
    }
}
