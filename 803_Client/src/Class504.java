/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class504
{
    static final int anInt6626 = 2;
    public int anInt6627 = 311816427;
    public int[] anIntArray6628;
    public int[] anIntArray6629;
    public static final int anInt6630 = 0;
    public int anInt6631 = -1793382539;
    public static final int anInt6632 = 1;
    public int[] anIntArray6633;
    public static short[] aShortArray6634;
    
    void method11465(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 23);
	    if (i == 0)
		break;
	    if (i == 1) {
		int i_0_ = class241_sub3.readUnsignedByte((byte) 87);
		anIntArray6629 = new int[i_0_];
		for (int i_1_ = 0; i_1_ < anIntArray6629.length; i_1_++) {
		    anIntArray6629[i_1_]
			= class241_sub3.readUnsignedByte((byte) -4);
		    if (0 != anIntArray6629[i_1_]
			&& 2 != anIntArray6629[i_1_]) {
			/* empty */
		    }
		}
	    } else if (i == 3)
		anInt6627 = class241_sub3.readUnsignedByte((byte) 87) * -311816427;
	    else if (4 == i)
		anInt6631 = class241_sub3.readUnsignedByte((byte) 25) * 1793382539;
	    else if (i == 5) {
		anIntArray6628
		    = new int[class241_sub3.readUnsignedByte((byte) -98)];
		for (int i_2_ = 0; i_2_ < anIntArray6628.length; i_2_++)
		    anIntArray6628[i_2_]
			= class241_sub3.readUnsignedByte((byte) -1);
	    } else if (6 == i) {
		anIntArray6633 = new int[class241_sub3.readUnsignedByte((byte) 64)];
		for (int i_3_ = 0; i_3_ < anIntArray6633.length; i_3_++)
		    anIntArray6633[i_3_]
			= class241_sub3.readUnsignedByte((byte) -68);
	    }
	}
    }
    
    public Class504(JS5 class210) {
		byte[] is = class210.method4194((DefaultsGroup.aClass512_6699.js5GroupId
						 * 692631693),
						-1947595577);
		method11466(new RSByteBuffer(is), (byte) 52);
		if (null == anIntArray6629) {
		    throw new RuntimeException("");
		}
    }
    
    void method11466(RSByteBuffer class241_sub3, byte i) {
	for (;;) {
	    int i_4_ = class241_sub3.readUnsignedByte((byte) 52);
	    if (i_4_ == 0)
		break;
	    if (i_4_ == 1) {
		int i_5_ = class241_sub3.readUnsignedByte((byte) 60);
		anIntArray6629 = new int[i_5_];
		for (int i_6_ = 0; i_6_ < anIntArray6629.length; i_6_++) {
		    anIntArray6629[i_6_]
			= class241_sub3.readUnsignedByte((byte) -11);
		    if (0 != anIntArray6629[i_6_]
			&& 2 != anIntArray6629[i_6_]) {
			/* empty */
		    }
		}
	    } else if (i_4_ == 3)
		anInt6627 = class241_sub3.readUnsignedByte((byte) -14) * -311816427;
	    else if (4 == i_4_)
		anInt6631 = class241_sub3.readUnsignedByte((byte) -42) * 1793382539;
	    else if (i_4_ == 5) {
		anIntArray6628
		    = new int[class241_sub3.readUnsignedByte((byte) -40)];
		for (int i_7_ = 0; i_7_ < anIntArray6628.length; i_7_++)
		    anIntArray6628[i_7_]
			= class241_sub3.readUnsignedByte((byte) -32);
	    } else if (6 == i_4_) {
		anIntArray6633 = new int[class241_sub3.readUnsignedByte((byte) 32)];
		for (int i_8_ = 0; i_8_ < anIntArray6633.length; i_8_++)
		    anIntArray6633[i_8_]
			= class241_sub3.readUnsignedByte((byte) -57);
	    }
	}
    }
    
    static final void method11467(ClientScriptData class454, int i) {
	int i_9_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_9_, (byte) -13);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_9_ >> 16];
	Class281.method5488(class58, class35, false, 1, class454, -1911736942);
    }
}
