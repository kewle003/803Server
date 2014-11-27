/* Class120_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub20 extends Class120
{
    long aLong10617;
    int anInt10618;
    
    public void method2961() {
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       Class104.aClass407_1480.get(-7765902928608248243L
						  * (((Class120_Sub20) this)
						     .aLong10617)));
	if (null != class241_sub22)
	    class241_sub22.intValue
		= ((Class120_Sub20) this).anInt10618 * -6033603;
	else
	    Class104.aClass407_1480.put
		(new IntegerNode(-784815387
				    * ((Class120_Sub20) this).anInt10618),
		 -7765902928608248243L * ((Class120_Sub20) this).aLong10617);
    }
    
    Class120_Sub20(RSByteBuffer class241_sub3, boolean bool) {
	super(class241_sub3);
	int i = class241_sub3.readUnsignedShort(1162222719);
	if (bool)
	    ((Class120_Sub20) this).aLong10617
		= -2359699725872289147L * (0x100000000L | (long) i);
	else
	    ((Class120_Sub20) this).aLong10617
		= -2359699725872289147L * (long) i;
	((Class120_Sub20) this).anInt10618
	    = class241_sub3.readInt((byte) 88) * 824443629;
    }
    
    public void method2958(int i) {
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       Class104.aClass407_1480.get(-7765902928608248243L
						  * (((Class120_Sub20) this)
						     .aLong10617)));
	if (null != class241_sub22)
	    class241_sub22.intValue
		= ((Class120_Sub20) this).anInt10618 * -6033603;
	else
	    Class104.aClass407_1480.put
		(new IntegerNode(-784815387
				    * ((Class120_Sub20) this).anInt10618),
		 -7765902928608248243L * ((Class120_Sub20) this).aLong10617);
    }
    
    static final void setChatType/*method16847*/(ClientScriptData scriptData, byte i) {
		int type = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		ServerConnection class190 = ClanChannelDelta.method6943(-1523770095);
		Class241_Sub27 packet = Class445_Sub26.makePacket(
				OutgoingOpcode.CHAT_TYPE_PACKET, class190.packetCipher, 16711935);
		packet.data.writeByte(type, -307633480);
		class190.sendPacket(packet, -1677444773);
    }
    
    static RSByteBuffer encodePasswordBlock/*method16848*/(int i) {
		RSByteBuffer secureBuffer = Class577.method12684((byte) 0);
		secureBuffer.method14627(0L);
		secureBuffer.writeString(Class13.aString113, -1394661287);
		secureBuffer.method14627(-8566645190624485041L * Class13.aLong111);
		secureBuffer.method14627(client.aLong8306 * -7247048686966732057L);
		secureBuffer.applyRSA(RSAKeys.LOGIN_PUBLIC_KEY,
					  RSAKeys.LOGIN_MODULUS, (byte) -1);
		return secureBuffer;
    }
}
