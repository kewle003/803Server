/* Class241_Sub39_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class InvType extends Class241_Sub39 implements Interface15
{
    public int[] anIntArray11224;
    public int anInt11225 = 0;
    public int[] anIntArray11226;
    public int size = 0;//anInt11227
    
    InvType() {
    	/* empty */
    }
    
    void decode/*method17609*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) 18);
		    if (opcode == 0) {
		    	break;
		    }
		    method17610(buffer, opcode, -486036511);
		}
    }
    
    void method17610(RSByteBuffer buffer, int opcode, int i_1_) {
		if (2 == opcode) {
		    size = buffer.readUnsignedShort(1162222719) * -905828959;
		} else if (opcode == 4) {
		    anInt11225 = buffer.readUnsignedByte((byte) -102) * -1756334653;
		    anIntArray11224 = new int[-662691093 * anInt11225];
		    anIntArray11226 = new int[anInt11225 * -662691093];
		    for (int i_2_ = 0; i_2_ < anInt11225 * -662691093; i_2_++) {
				anIntArray11224[i_2_] = buffer.readUnsignedShort(1162222719);
				anIntArray11226[i_2_] = buffer.readUnsignedShort(1162222719);
		    }
		}
    }
    
    void method17611(RSByteBuffer class241_sub3, int i) {
	if (2 == i)
	    size = class241_sub3.readUnsignedShort(1162222719) * -905828959;
	else if (i == 4) {
	    anInt11225 = class241_sub3.readUnsignedByte((byte) 67) * -1756334653;
	    anIntArray11224 = new int[-662691093 * anInt11225];
	    anIntArray11226 = new int[anInt11225 * -662691093];
	    for (int i_3_ = 0; i_3_ < anInt11225 * -662691093; i_3_++) {
		anIntArray11224[i_3_] = class241_sub3.readUnsignedShort(1162222719);
		anIntArray11226[i_3_] = class241_sub3.readUnsignedShort(1162222719);
	    }
	}
    }
    
    void method17612(RSByteBuffer class241_sub3, int i) {
	if (2 == i)
	    size = class241_sub3.readUnsignedShort(1162222719) * -905828959;
	else if (i == 4) {
	    anInt11225 = class241_sub3.readUnsignedByte((byte) 75) * -1756334653;
	    anIntArray11224 = new int[-662691093 * anInt11225];
	    anIntArray11226 = new int[anInt11225 * -662691093];
	    for (int i_4_ = 0; i_4_ < anInt11225 * -662691093; i_4_++) {
		anIntArray11224[i_4_] = class241_sub3.readUnsignedShort(1162222719);
		anIntArray11226[i_4_] = class241_sub3.readUnsignedShort(1162222719);
	    }
	}
    }
    
    void method17613(RSByteBuffer class241_sub3, int i) {
	if (2 == i)
	    size = class241_sub3.readUnsignedShort(1162222719) * -905828959;
	else if (i == 4) {
	    anInt11225 = class241_sub3.readUnsignedByte((byte) -78) * -1756334653;
	    anIntArray11224 = new int[-662691093 * anInt11225];
	    anIntArray11226 = new int[anInt11225 * -662691093];
	    for (int i_5_ = 0; i_5_ < anInt11225 * -662691093; i_5_++) {
		anIntArray11224[i_5_] = class241_sub3.readUnsignedShort(1162222719);
		anIntArray11226[i_5_] = class241_sub3.readUnsignedShort(1162222719);
	    }
	}
    }
    
    static final void method17614(ClientScriptData class454, int i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class515 class515
	    = Class441.aClass524_6158.method11745(i_6_, 1462516406);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -1123109927 * class515.anInt6770;
    }
    
    static boolean isForceRun/*method17615*/(int i) {
    	return AnimationDefinitionLoader.method12315(ClanChannelUser.aClass499_5588.aClass533_6559, (byte) 16);
    }
}
