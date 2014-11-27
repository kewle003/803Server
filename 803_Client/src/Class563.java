/* Class563 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

public abstract class Class563
{
    public static int anInt7304;
    static Class108_Sub2[] aClass108_Sub2Array7305;
    
    public static Class563 method12384(Socket socket, int i) throws IOException {
    	return new Class563_Sub1(socket, i);
    }
    
    public abstract void resetByteCounts(int i);//method12385
    
    Class563() {
	/* empty */
    }
    
    public abstract int read(byte[] is, int i, int i_0_, int i_1_) throws IOException;//method12386
    
    public abstract boolean isAvailable(int i, int i_2_) throws IOException;//method12387
    
    public abstract void close(int i);//method12388
    
    public abstract int method12389(int i) throws IOException;
    
    public abstract boolean method12390(int i) throws IOException;
    
    public abstract int method12391() throws IOException;
    
    public abstract int method12392() throws IOException;
    
    public abstract int method12393(byte[] is, int i, int i_3_)
	throws IOException;
    
    public abstract int method12394(byte[] is, int i, int i_4_)
	throws IOException;
    
    public abstract void write(byte[] is, int i, int i_5_, int i_6_) throws IOException;//method12395
    
    public abstract int method12396(byte[] is, int i, int i_7_)
	throws IOException;
    
    public abstract void method12397();
    
    public abstract void method12398();
    
    public abstract void method12399();
    
    public static Class563 method12400(Socket socket, int i) throws IOException {
	return new Class563_Sub1(socket, i);
    }
    
    public static Class563 method12401(Socket socket, int i) throws IOException {
	return new Class563_Sub1(socket, i);
    }
    
    public abstract int method12402(byte[] is, int i, int i_8_)
	throws IOException;
    
    static final void method12403(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class26.method954(class58, class35, class454, 1486913661);
    }
    
    static final void method12404(ClientScriptData class454, int i) {
	int i_9_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_9_, (byte) -76);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_9_ >> 16];
	Class198.method4038(class58, class35, class454, (byte) 81);
    }
    
    static final void method12405(ClientScriptData class454, int i) {
	int i_10_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_10_, (byte) -10);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_10_ >> 16];
	Class69.method1680(class58, class35, class454, 923694082);
    }
    
    static final void getIgnoreDisplayName/*method12406*/(ClientScriptData scriptData, int i) {
		int slotID
		    = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		if (-2020075851 * client.friendListStage != 0 && slotID < -750736473 * client.ignoreListSize) {
			scriptData.objectStack[((scriptData.objectStackPointer += -1650705371) * -290357331 - 1)]
					= client.ignoreList[slotID].currentName;
		} else {
			scriptData.objectStack[((scriptData.objectStackPointer += -1650705371) * -290357331 - 1)]
					= "";
		}
    }
    
    static final void method12407(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_12_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_13_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_12_ & i_13_;
    }
    
    static Class76 method12408(int i, int i_14_) {
	if (i == ((Class76) Class76.aClass76_1112).anInt1113 * 2063615435)
	    return Class76.aClass76_1112;
	if (i == ((Class76) Class76.aClass76_1111).anInt1113 * 2063615435)
	    return Class76.aClass76_1111;
	if (i == 2063615435 * ((Class76) Class76.aClass76_1110).anInt1113)
	    return Class76.aClass76_1110;
	return null;
    }
    
    static final void decodeNPCUpdate/*method12409*/(boolean largeView, int i) {
		client.anInt8337 = 0;
		client.anInt8334 = 0;
		client.anInt8455 += 190614637;
		Class463.processInScreenNPCs(950977626);
		Class213.addLocalNpcs(largeView, 1656849031);
		Class211.decodeNPCsMasks((byte) 59);
		boolean bool_15_ = false;
		for (int index = 0; index < 380401465 * client.anInt8337; index++) {
		    int i_17_ = client.anIntArray8338[index];
		    ObjectNode class241_sub26 = ((ObjectNode) client.aClass407_8457.get((long) i_17_));
		    NPC npc = (NPC) class241_sub26.objectValue;
		    if (client.anInt8455 * 2109562213 != 744517381 * npc.anInt11410) {
				if (Class16.aBool141 && Class480.method11005(i_17_, 886759333)) {
				    Class198.method4036((byte) 4);
				}
				if (npc.definition.method7152(-1226623241)) {
				    Class638.method13558(npc, -825668477);
				}
				npc.setDefinition(null, -1319357662);
				class241_sub26.remove((byte) 36);
				bool_15_ = true;
		    }
		}
		if (bool_15_) {
		    int i_18_ = client.anInt8434 * 743597371;
		    client.anInt8434 = client.aClass407_8457.method7306(684009368) * 1674259443;
		    int i_19_ = 0;
		    Iterator iterator = client.aClass407_8457.iterator();
		    while (iterator.hasNext()) {
				ObjectNode class241_sub26 = (ObjectNode) iterator.next();
				client.aClass241_Sub26Array8276[i_19_++] = class241_sub26;
		    }
		    for (int i_20_ = client.anInt8434 * 743597371; i_20_ < i_18_; i_20_++) {
		    	client.aClass241_Sub26Array8276[i_20_] = null;
		    }
		    Class39 class39 = Class445_Sub16.aClass351_Sub1_8660.method6332((short) -20672);
		    if (class39 == Class39.aClass39_586) {
				Class380_Sub2 class380_sub2 = (Class380_Sub2) Class445_Sub16.aClass351_Sub1_8660.method6283(1582267267);
				class380_sub2.method16693((byte) 72);
		    }
		    Class61 class61 = Class445_Sub16.aClass351_Sub1_8660.method6356(-2023752996);
		    if (Class61.aClass61_1020 == class61) {
		    	Class434_Sub5 class434_sub5 = (Class434_Sub5) Class445_Sub16.aClass351_Sub1_8660.method6284((byte) 1);
		    	class434_sub5.method14131((byte) 115);
		    }
		}
		if (421967667 * (((ServerConnection) client.aClass190_8340).inputBuffer.pointer)
		    != 1912225577 * ((ServerConnection) client.aClass190_8340).incommingPacketSize) {
		    throw new RuntimeException
			      (new StringBuilder().append
				   (421967667 * (((ServerConnection) client.aClass190_8340)
						 .inputBuffer.pointer))
				   .append
				   (" ").append
				   (1912225577
				    * ((ServerConnection) client.aClass190_8340).incommingPacketSize)
				   .toString());
		}
		for (int index = 0; index < client.localNpcCount * -1837469873; index++) {
		    if (client.aClass407_8457.get((long) client.localNpcIndicies[index]) == null) {
		    	throw new RuntimeException(new StringBuilder().append(index).append(" ")
		    			.append(-1837469873 * client.localNpcCount).toString());
		    }
		}
		if (client.anInt8434 * 743597371 - client.localNpcCount * -1837469873 != 0) {
		    throw new RuntimeException(new StringBuilder().append("")
		    		.append(743597371 * client.anInt8434 - -1837469873 * client.localNpcCount).toString());
		}
		for (int index = 0; index < client.anInt8434 * 743597371; index++) {
		    if (2109562213 * client.anInt8455
			!= (((Entity) client.aClass241_Sub26Array8276[index].objectValue).anInt11410) * 744517381) {
		    	throw new RuntimeException(new StringBuilder().append("")
		    			.append(-546698383 * ((Entity) client.aClass241_Sub26Array8276[index].objectValue).entityIndex)
						.toString());
		    }
		}
    }
    
    public static void method12410(byte i) {
	if (null != Class483.aClass393_6461) {
	    Class483.aClass393_6461.method7046((byte) 0);
	    Class483.aClass393_6461 = null;
	}
    }
    
    static final void method12411(ClientScriptData class454, int i) {
	int i_23_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_23_, (byte) -38);
	Class469.method10756(class58, class454, (byte) 21);
    }
}
