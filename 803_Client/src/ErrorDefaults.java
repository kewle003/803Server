/* Class497 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ErrorDefaults
{
    public int anInt6528;
    public int anInt6529;
    public static final int anInt6530 = 2;
    public static final int anInt6531 = 3;
    public static final int anInt6532 = 0;
    public int anInt6533;
    public static final int anInt6534 = 2;
    public static final int anInt6535 = 3;
    public static final int anInt6536 = 1;
    public static final int anInt6537 = 5;
    static final int anInt6538 = 100;
    public static final int anInt6539 = 1;
    static final int anInt6540 = 3;
    public int anInt6541;
    public static final int anInt6542 = 4;
    public int anInt6543;
    public static final int anInt6544 = 0;
    public int anInt6545;
    public int anInt6546;
    public int[][] anIntArrayArray6547 = new int[3][5];
    
    void decode/*method11294*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) -48);
		    if (opcode == 0) {
		    	break;
		    }
		    if (1 == opcode) {
		    	anInt6533 = buffer.readInt((byte) 106) * 1089590331;
		    } else if (opcode == 2) {
		    	anInt6541 = buffer.readInt((byte) 107) * 529154033;
		    } else if (opcode == 3) {
		    	anInt6546 = buffer.readInt((byte) 31) * -761564689;
		    } else if (opcode == 4) {
		    	anInt6543 = buffer.readUnsignedByte((byte) -43) * -316232767;
		    } else if (opcode == 5) {
		    	anInt6528 = buffer.readUnsignedByte((byte) 55) * 522665829;
		    } else if (opcode == 6) {
		    	anInt6529 = buffer.readInt((byte) 43) * -2056827283;
		    } else if (7 == opcode) {
		    	anInt6545 = buffer.readInt((byte) 43) * -57338141;
		    } else if (opcode >= 100) {
		    	opcode -= 100;
		    	anIntArrayArray6547[opcode & (int) (Math.pow(2.0, 3.0) - 1.0)][opcode >> 3]
		    			= buffer.readUnsignedShort(1162222719);
		    }
		}
    }
    
    public ErrorDefaults(JS5 class210) {
		byte[] data = class210.method4194((692631693 * DefaultsGroup.ERROR.js5GroupId),
						-1571812223);
		if (data != null) {
		    /* empty */
		}
		decode(new RSByteBuffer(data), 1584398182);
    }
    
    void method11295/*method11295*/(RSByteBuffer buffer) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) -94);
		    if (opcode == 0) {
		    	break;
		    }
		    if (1 == opcode) {
		    	anInt6533 = buffer.readInt((byte) 49) * 1089590331;
		    } else if (opcode == 2) {
		    	anInt6541 = buffer.readInt((byte) 41) * 529154033;
		    } else if (opcode == 3) {
		    	anInt6546 = buffer.readInt((byte) 27) * -761564689;
		    } else if (opcode == 4) {
		    	anInt6543 = buffer.readUnsignedByte((byte) -69) * -316232767;
		    } else if (opcode == 5) {
		    	anInt6528 = buffer.readUnsignedByte((byte) -31) * 522665829;
		    } else if (opcode == 6) {
		    	anInt6529 = buffer.readInt((byte) 65) * -2056827283;
		    } else if (7 == opcode) {
		    	anInt6545 = buffer.readInt((byte) 30) * -57338141;
		    } else if (opcode >= 100) {
		    	opcode -= 100;
		    	anIntArrayArray6547[opcode & (int) (Math.pow(2.0, 3.0) - 1.0)][opcode >> 3]
		    			= buffer.readUnsignedShort(1162222719);
		    }
		}
    }
    
    static final void method11296(ClientScriptData class454, byte i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -109);
	Class525.method11755(class58, class454, 1736754263);
    }
    
    public static final void method11297(short i) {
	if (!client.aBool8388) {
	    client.aFloat8356 += (12.0F - client.aFloat8356) / 2.0F;
	    client.aBool8392 = true;
	    client.aBool8388 = true;
	}
    }
    
    static final void method11298(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
    }
}
