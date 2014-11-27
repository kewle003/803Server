/* Class241_Sub42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub42 extends Node
{
    public static final int anInt10159 = 3;
    public static final int anInt10160 = 7;
    public static final int anInt10161 = 2;
    int anInt10162;
    public static final int anInt10163 = 0;
    static final int anInt10164 = 6;
    int anInt10165;
    public static final int anInt10166 = 8;
    public static final int anInt10167 = 9;
    public static final int anInt10168 = 10;
    public static final int anInt10169 = 5;
    public static final int anInt10170 = 1;
    int[] anIntArray10171;
    int[][] anIntArrayArray10172;
    boolean[] aBoolArray10173;
    int[] anIntArray10174;
    
    Class241_Sub42(int i, byte[] is) {
	((Class241_Sub42) this).anInt10165 = -2120275137 * i;
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	((Class241_Sub42) this).anInt10162
	    = class241_sub3.readUnsignedShort(1162222719) * 79606207;
	((Class241_Sub42) this).anIntArray10171
	    = new int[1333411391 * ((Class241_Sub42) this).anInt10162];
	((Class241_Sub42) this).anIntArrayArray10172
	    = new int[1333411391 * ((Class241_Sub42) this).anInt10162][];
	((Class241_Sub42) this).aBoolArray10173
	    = new boolean[1333411391 * ((Class241_Sub42) this).anInt10162];
	((Class241_Sub42) this).anIntArray10174
	    = new int[1333411391 * ((Class241_Sub42) this).anInt10162];
	for (int i_0_ = 0;
	     i_0_ < ((Class241_Sub42) this).anInt10162 * 1333411391; i_0_++) {
	    ((Class241_Sub42) this).anIntArray10171[i_0_]
		= class241_sub3.readUnsignedByte((byte) 88);
	    if (((Class241_Sub42) this).anIntArray10171[i_0_] == 6)
		((Class241_Sub42) this).anIntArray10171[i_0_] = 2;
	}
	for (int i_1_ = 0;
	     i_1_ < 1333411391 * ((Class241_Sub42) this).anInt10162; i_1_++)
	    ((Class241_Sub42) this).aBoolArray10173[i_1_]
		= class241_sub3.readUnsignedByte((byte) -110) == 1;
	for (int i_2_ = 0;
	     i_2_ < 1333411391 * ((Class241_Sub42) this).anInt10162; i_2_++)
	    ((Class241_Sub42) this).anIntArray10174[i_2_]
		= class241_sub3.readUnsignedShort(1162222719);
	for (int i_3_ = 0;
	     i_3_ < ((Class241_Sub42) this).anInt10162 * 1333411391; i_3_++)
	    ((Class241_Sub42) this).anIntArrayArray10172[i_3_]
		= new int[class241_sub3.readSmart((short) -8407)];
	for (int i_4_ = 0;
	     i_4_ < ((Class241_Sub42) this).anInt10162 * 1333411391; i_4_++) {
	    for (int i_5_ = 0;
		 (i_5_
		  < ((Class241_Sub42) this).anIntArrayArray10172[i_4_].length);
		 i_5_++)
		((Class241_Sub42) this).anIntArrayArray10172[i_4_][i_5_]
		    = class241_sub3.readSmart((short) -13488);
	}
    }
    
    public static short method16451(int i, int i_6_) {
	int i_7_ = i >> 10 & 0x3f;
	int i_8_ = i >> 3 & 0x70;
	int i_9_ = i & 0x7f;
	i_8_ = i_9_ <= 64 ? i_9_ * i_8_ >> 7 : i_8_ * (127 - i_9_) >> 7;
	int i_10_ = i_9_ + i_8_;
	int i_11_;
	if (i_10_ != 0)
	    i_11_ = (i_8_ << 8) / i_10_;
	else
	    i_11_ = i_8_ << 1;
	int i_12_ = i_10_;
	return (short) (i_7_ << 10 | i_11_ >> 4 << 7 | i_12_);
    }
}
