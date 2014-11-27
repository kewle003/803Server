/* Class383 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

public class ClanChannelDelta
{
    long updateNum = -3283415044873093589L;//aLong5688
    long clanHash;//aLong5689
    static final int anInt5690 = 2;
    static final int anInt5691 = 1;
    static final int anInt5692 = 4;
    static final int anInt5693 = 3;
    NodeCollection aClass429_5694 = new NodeCollection();
    static final int anInt5695 = 5;
    static Font aFont5696;
    
    public ClanChannelDelta(RSByteBuffer buffer) {
		decode(buffer, 1875556232);
    }
    
    void decode/*method6930*/(RSByteBuffer buffer, int i) {
		clanHash = buffer.readLong((short) 12194) * -5416579625094176905L;
		updateNum = buffer.readLong((short) 16133) * 3283415044873093589L;
		for (int type = buffer.readUnsignedByte((byte) -39); type != 0;
				type = buffer.readUnsignedByte((byte) -46)) {
			CcDeltaNode delta;
			if (1 == type) {
				delta = new CcDelta_Add(this);//Add
			} else if (type == 2) {
				delta = new CcDelta_Update(this);//Update
			} else if (3 == type) {
				delta = new CcDelta_Delete(this);//Delete
			} else if (type == 4) {
				delta = new CcDelta_Details(this);//Set details (name, kickReq, talkReq)
			} else if (type == 5) {
				delta = new CcDelta_Update_2(this);//Update also
			} else {
				throw new RuntimeException("");
			}
			delta.decode(buffer, (byte) 0);
			aClass429_5694.addNode(delta, (short) -27600);
		}
    }
    
    void method6931(RSByteBuffer class241_sub3) {
	clanHash = class241_sub3.readLong((short) 20730) * -5416579625094176905L;
	updateNum = class241_sub3.readLong((short) 14005) * 3283415044873093589L;
	for (int i = class241_sub3.readUnsignedByte((byte) 45); i != 0;
	     i = class241_sub3.readUnsignedByte((byte) 15)) {
	    CcDeltaNode class241_sub25;
	    if (1 == i)
		class241_sub25 = new CcDelta_Add(this);
	    else if (i == 4)
		class241_sub25 = new CcDelta_Details(this);
	    else if (3 == i)
		class241_sub25 = new CcDelta_Delete(this);
	    else if (i == 2)
		class241_sub25 = new CcDelta_Update(this);
	    else if (i == 5)
		class241_sub25 = new CcDelta_Update_2(this);
	    else
		throw new RuntimeException("");
	    class241_sub25.decode(class241_sub3, (byte) 0);
	    aClass429_5694.addNode(class241_sub25,
							(short) -28713);
	}
    }
    
    public void applyToClanChannel/*method6932*/(ClanChannel channel, int i) {
		if ((4356572401218184725L * channel.hashCode != clanHash * 648255348436888135L)
				|| (7246929671357706109L * updateNum != (1751384508691559187L * channel.updateNumber))) {
			throw new RuntimeException("");
		}
		for (CcDeltaNode delta = ((CcDeltaNode) aClass429_5694.method7694(16711935));
				delta != null;
				delta = (CcDeltaNode) aClass429_5694.method7692(754902382)) {
			delta.applyToClanChannel(channel, (byte) 14);
		}
		channel.updateNumber += 429383768188849947L;//1L
    }
    
    public void method6933(ClanChannel class241_sub6) {
	if ((4356572401218184725L * class241_sub6.hashCode
	     != clanHash * 648255348436888135L)
	    || (7246929671357706109L * updateNum
		!= (1751384508691559187L
		    * ((ClanChannel) class241_sub6).updateNumber)))
	    throw new RuntimeException("");
	for (CcDeltaNode class241_sub25
		 = ((CcDeltaNode)
		    aClass429_5694.method7694(16711935));
	     class241_sub25 != null;
	     class241_sub25 = (CcDeltaNode) ((ClanChannelDelta) this)
						   .aClass429_5694
						   .method7692(13442259))
	    class241_sub25.applyToClanChannel(class241_sub6, (byte) 63);
	((ClanChannel) class241_sub6).updateNumber += 429383768188849947L;
    }
    
    void method6934(RSByteBuffer class241_sub3) {
	clanHash
	    = class241_sub3.readLong((short) 20312) * -5416579625094176905L;
	updateNum
	    = class241_sub3.readLong((short) 1428) * 3283415044873093589L;
	for (int i = class241_sub3.readUnsignedByte((byte) -105); i != 0;
	     i = class241_sub3.readUnsignedByte((byte) 14)) {
	    CcDeltaNode class241_sub25;
	    if (1 == i)
		class241_sub25 = new CcDelta_Add(this);
	    else if (i == 4)
		class241_sub25 = new CcDelta_Details(this);
	    else if (3 == i)
		class241_sub25 = new CcDelta_Delete(this);
	    else if (i == 2)
		class241_sub25 = new CcDelta_Update(this);
	    else if (i == 5)
		class241_sub25 = new CcDelta_Update_2(this);
	    else
		throw new RuntimeException("");
	    class241_sub25.decode(class241_sub3, (byte) 0);
	    aClass429_5694.addNode(class241_sub25,
							(short) -11917);
	}
    }
    
    public void method6935(ClanChannel class241_sub6) {
	if ((4356572401218184725L * class241_sub6.hashCode
	     != clanHash * 648255348436888135L)
	    || (7246929671357706109L * updateNum
		!= (1751384508691559187L
		    * ((ClanChannel) class241_sub6).updateNumber)))
	    throw new RuntimeException("");
	for (CcDeltaNode class241_sub25
		 = ((CcDeltaNode)
		    aClass429_5694.method7694(16711935));
	     class241_sub25 != null;
	     class241_sub25 = (CcDeltaNode) ((ClanChannelDelta) this)
						   .aClass429_5694
						   .method7692(235145538))
	    class241_sub25.applyToClanChannel(class241_sub6, (byte) 25);
	((ClanChannel) class241_sub6).updateNumber += 429383768188849947L;
    }
    
    public void method6936(ClanChannel class241_sub6) {
	if ((4356572401218184725L * class241_sub6.hashCode
	     != clanHash * 648255348436888135L)
	    || (7246929671357706109L * updateNum
		!= (1751384508691559187L
		    * ((ClanChannel) class241_sub6).updateNumber)))
	    throw new RuntimeException("");
	for (CcDeltaNode class241_sub25
		 = ((CcDeltaNode)
		    aClass429_5694.method7694(16711935));
	     class241_sub25 != null;
	     class241_sub25 = (CcDeltaNode) ((ClanChannelDelta) this)
						   .aClass429_5694
						   .method7692(1701183660))
	    class241_sub25.applyToClanChannel(class241_sub6, (byte) 68);
	((ClanChannel) class241_sub6).updateNumber += 429383768188849947L;
    }
    
    public static Class212[] method6937(int i) {
	return (new Class212[]
		{ Class212.aClass212_2505, Class212.aClass212_2503,
		  Class212.aClass212_2504 });
    }
    
    static ClientScript method6938(int i, byte i_1_) {
		ClientScript class241_sub39_sub1
		    = ((ClientScript)
		       Class494.aClass109_6520.method2754((long) i));
		if (null != class241_sub39_sub1)
		    return class241_sub39_sub1;
		byte[] is = Class547.CS2_ARCHIVE.getfile(i, 0, -81453262);
		if (is == null || is.length <= 1)
		    return null;
		try {
		    class241_sub39_sub1 = Class275.method5347(is, (byte) 122);
		} catch (Exception exception) {
		    throw new RuntimeException(new StringBuilder().append
						   (exception.getMessage()).append
						   (" ").append
						   (i).toString());
		}
		Class494.aClass109_6520.method2755(class241_sub39_sub1, (long) i);
		return class241_sub39_sub1;
    }
    
    static final void method6939(ClientScriptData class454, byte i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub27 class241_sub27
	    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4048,
					 client.aClass190_8340.packetCipher,
					 16711935);
	class241_sub27.data.writeShort(i_2_, -484048531);
	client.aClass190_8340.sendPacket(class241_sub27, -1690834171);
    }
    
    static final void method6940(ClientScriptData class454, byte i) {
	Class241_Sub41 class241_sub41 = Class604.method13198((byte) 5);
	if (null == class241_sub41) {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= -1;
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= class241_sub41.anInt10158 * -1454932011;
	    int i_3_ = (-1163930595 * class241_sub41.anInt10153 << 28
			| (Class573.anInt7388
			   + class241_sub41.anInt10154 * 669485685) << 14
			| (-1535798317 * class241_sub41.anInt10152
			   + Class573.anInt7389));
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= i_3_;
	}
    }
    
    static final void method6941(ClientScriptData class454, byte i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub2_8875,
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      == 1) ? 1 : 0,
	     (byte) 2);
	Class167.method3600((short) 15516);
	client.aBool8297 = false;
    }
    
    static final void method6942(ClientScriptData class454, int i) {
	Class322.method5951(((Class475_Sub1)
			     ((ClientScriptData) class454).anInterface24_6237),
			    class454, (byte) 14);
    }
    
    public static ServerConnection method6943(int i) {
	if (Class523.method11733(1766317249 * client.anInt8288, 972314327)
	    || client.anInt8288 * 1766317249 == 8)
	    return client.aClass190_8339;
	return client.aClass190_8340;
    }
    
    static void method6944(int i) {
    	ServerConnection conn = method6943(-1500728699);
		Class241_Sub27 class241_sub27 = Class445_Sub26.makePacket(
				OutgoingOpcode.PACKET_RECEIVE_COUNT,
				conn.packetCipher, 16711935);
		class241_sub27.data.writeInt(client.anInt8342 * -364544137, -1252346406);
		conn.sendPacket(class241_sub27, -2067805236);
    }
    
    public static Class322 method6945(int i, byte i_4_) {
	if (null != Class483.aClass393_6461)
	    return Class483.aClass393_6461.method7032(846350355)
		       .method5858(i, (byte) 0);
	return null;
    }
}
