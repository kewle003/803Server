/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class213 implements Comparable
{
    long aLong2508;
    Object anObject2509;
    Object anObject2510;
    long aLong2511;
    static int anInt2512;
    
    public boolean method4295(Object object) {
	if (object instanceof Class213)
	    return ((Class213) this).anObject2510
		       .equals(((Class213) (Class213) object).anObject2510);
	throw new IllegalArgumentException();
    }
    
    int method4296(Class213 class213_0_, byte i) {
	if (6005784080488792907L * ((Class213) this).aLong2511
	    < 6005784080488792907L * ((Class213) class213_0_).aLong2511)
	    return -1;
	if (6005784080488792907L * ((Class213) this).aLong2511
	    > 6005784080488792907L * ((Class213) class213_0_).aLong2511)
	    return 1;
	return 0;
    }
    
    public boolean equals(Object object) {
	if (object instanceof Class213)
	    return ((Class213) this).anObject2510
		       .equals(((Class213) (Class213) object).anObject2510);
	throw new IllegalArgumentException();
    }
    
    public int method4297() {
	return ((Class213) this).anObject2510.hashCode();
    }
    
    public int compareTo(Object object) {
	return method4296((Class213) object, (byte) 2);
    }
    
    Class213(Object object, Object object_1_) {
	((Class213) this).anObject2509 = object;
	((Class213) this).anObject2510 = object_1_;
    }
    
    public boolean method4298(Object object) {
	if (object instanceof Class213)
	    return ((Class213) this).anObject2510
		       .equals(((Class213) (Class213) object).anObject2510);
	throw new IllegalArgumentException();
    }
    
    public boolean method4299(Object object) {
	if (object instanceof Class213)
	    return ((Class213) this).anObject2510
		       .equals(((Class213) (Class213) object).anObject2510);
	throw new IllegalArgumentException();
    }
    
    public int hashCode() {
	return ((Class213) this).anObject2510.hashCode();
    }
    
    int method4300(Class213 class213_2_) {
	if (6005784080488792907L * ((Class213) this).aLong2511
	    < 6005784080488792907L * ((Class213) class213_2_).aLong2511)
	    return -1;
	if (6005784080488792907L * ((Class213) this).aLong2511
	    > 6005784080488792907L * ((Class213) class213_2_).aLong2511)
	    return 1;
	return 0;
    }
    
    public int method4301() {
	return ((Class213) this).anObject2510.hashCode();
    }
    
    int method4302(Class213 class213_3_) {
	if (6005784080488792907L * ((Class213) this).aLong2511
	    < 6005784080488792907L * ((Class213) class213_3_).aLong2511)
	    return -1;
	if (6005784080488792907L * ((Class213) this).aLong2511
	    > 6005784080488792907L * ((Class213) class213_3_).aLong2511)
	    return 1;
	return 0;
    }
    
    int method4303(Class213 class213_4_) {
	if (6005784080488792907L * ((Class213) this).aLong2511
	    < 6005784080488792907L * ((Class213) class213_4_).aLong2511)
	    return -1;
	if (6005784080488792907L * ((Class213) this).aLong2511
	    > 6005784080488792907L * ((Class213) class213_4_).aLong2511)
	    return 1;
	return 0;
    }
    
    public int method4304(Object object) {
	return method4296((Class213) object, (byte) 2);
    }
    
    public int method4305(Object object) {
	return method4296((Class213) object, (byte) 2);
    }
    
    static final void method4306(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) (6353119288506319851L * Class541.aLong7009 / 60000L);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) ((6353119288506319851L * Class541.aLong7009
		      - Class50.method1249((byte) 1)
		      - 5522549561862698689L * Class209_Sub1.aLong10285)
		     / 60000L);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class599.aBool7714 ? 1 : 0;
    }
    
    public static Class323 method4307(RSByteBuffer class241_sub3, int i) {
	Class330 class330 = (Class200.method4070((byte) 103)
			     [class241_sub3.readUnsignedByte((byte) 75)]);
	Class324 class324 = (Class327.method6016((byte) -33)
			     [class241_sub3.readUnsignedByte((byte) 3)]);
	int i_5_ = class241_sub3.readShort((byte) 90);
	int i_6_ = class241_sub3.readShort((byte) 52);
	int i_7_ = class241_sub3.readBigSmart((byte) -6);
	int i_8_ = class241_sub3.readInt((byte) 32);
	int i_9_ = class241_sub3.readUnsignedByte((byte) 87);
	return new Class323(class330, class324, i_5_, i_6_, i_7_, i_8_, i_9_);
    }
    
    static final void addLocalNpcs/*method4308*/(boolean largeView, int i) {
		RSBitBuffer buffer = ((ServerConnection) client.aClass190_8340).inputBuffer;
		while (buffer.method17046(1912225577 * client.aClass190_8340.incommingPacketSize, -1903153099) >= 15) {
		    int npcIndex = buffer.readBits(15, 1219893410);
		    if (npcIndex == 32767) {
		    	break;
		    }
		    boolean bool_11_ = false;
		    ObjectNode class241_sub26 = ((ObjectNode) client.aClass407_8457.get((long) npcIndex));
		    if (class241_sub26 == null) {
				NPC npc1 = new NPC(client.aClass238_8477.method4751(-993118793));
				npc1.entityIndex = 1641239953 * npcIndex;
				class241_sub26 = new ObjectNode(npc1);
				client.aClass407_8457.put(class241_sub26, (long) npcIndex);
				client.aClass241_Sub26Array8276[(client.anInt8434 += 1674259443) * 743597371 - 1] = class241_sub26;
				bool_11_ = true;
		    }
		    NPC npc = (NPC) class241_sub26.objectValue;
		    client.localNpcIndicies[(client.localNpcCount += 1541490607) * -1837469873 - 1] = npcIndex;
		    npc.anInt11410 = client.anInt8455 * 949142241;
		    if (npc.definition != null
		    		&& npc.definition.method7152(270786302)) {
		    	Class638.method13558(npc, -825668477);
		    }
		    int i_12_ = buffer.readBits(1, -232936856);
		    int xOffset;
		    if (largeView) {
		    	xOffset = buffer.readBits(8, 78716701);
				if (xOffset > 127) {
					xOffset -= 256;
				}
		    } else {
		    	xOffset = buffer.readBits(5, 66436906);
				if (xOffset > 15) {
					xOffset -= 32;
				}
		    }
		    int needsMaskUpdate = buffer.readBits(1, 1338307823);
		    if (1 == needsMaskUpdate) {
		    	client.npcMaskUpdates[(client.anInt8334 += 480969173) * 2038574973 - 1] = npcIndex;
		    }
		    int plane = buffer.readBits(2, 652636911);
		    npc.setDefinition(
		    		MasterIndex.npcDefLoader.getNpcDefinition(buffer.readBits(15, 463883639), -792522419),
		    		-55573287);
		    int direction = (buffer.readBits(3, 2056340731) + 4 << 11 & 0x3fff);
		    int yOffset;
		    if (largeView) {
		    	yOffset = buffer.readBits(8, 1649286648);
				if (yOffset > 127) {
					yOffset -= 256;
				}
		    } else {
		    	yOffset = buffer.readBits(5, 1033686807);
				if (yOffset > 15) {
					yOffset -= 32;
				}
		    }
		    npc.method17781((npc.definition.size * 19489015), (byte) 8);
		    npc.anInt11400 = -687691613 * ((npc.definition.headsIcon) * 607575013 << 3);
		    if (bool_11_) {
		    	npc.setDirection(direction, true, (byte) 107);
		    }
		    npc.method17994(plane,
		    		Class21.myPlayer.scenePositionXQueue[0] + xOffset,
		    		Class21.myPlayer.scenePositionYQueue[0] + yOffset,
		    		i_12_ == 1, npc.method17782(-318447009), -16777216);
		    if (npc.definition.method7152(-289403484)) {
		    	Class612.method13238(npc.nodePlane,
		    			npc.scenePositionXQueue[0],
		    			npc.scenePositionYQueue[0],
		    			0, null, npc, null, (byte) 87);
		    }
		    if (bool_11_) {
		    	npc.method18002(-291751521);
		    }
		}
		buffer.finishBitAccess((byte) 14);
    }
    
    static int[] method4309(Class241_Sub39_Sub11 class241_sub39_sub11, int i) {
		int[] is = null;
		if (Class107.method2687((((Class241_Sub39_Sub11) class241_sub39_sub11)
					 .anInt10879) * -142243581,
					424967175))
		    is = (JS5.itemDefLoader.list
			  ((int) (-218357506993850339L
				  * (((Class241_Sub39_Sub11) class241_sub39_sub11)
				     .aLong10877)),
			   (short) -15283)
			  .anIntArray7949);
		else if (-1
			 != (((Class241_Sub39_Sub11) class241_sub39_sub11).slot2
			     * 1542395267))
		    is = (JS5.itemDefLoader.list
			  (1542395267 * (((Class241_Sub39_Sub11) class241_sub39_sub11)
					 .slot2),
			   (short) 1737)
			  .anIntArray7949);
		else if (Class321.method5931((((Class241_Sub39_Sub11)
					       class241_sub39_sub11).anInt10879
					      * -142243581),
					     (byte) 2)) {
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   (client.aClass407_8457.get
			    ((long) (int) (-218357506993850339L
					   * ((Class241_Sub39_Sub11)
					      class241_sub39_sub11).aLong10877))));
		    if (null != class241_sub26) {
			NPC class475_sub1_sub1_sub3_sub2
			    = ((NPC)
			       class241_sub26.objectValue);
			NPCDefinition class401
			    = class475_sub1_sub1_sub3_sub2.definition;
			if (class401.transformTo != null)
			    class401
				= class401.method7176(Class1.aClass19_11,
						      Class1.aClass19_11, (byte) 28);
			if (class401 != null)
			    is = class401.anIntArray5862;
		    }
		} else if (AnimationConfig.method11961(-142243581 * (((Class241_Sub39_Sub11)
							       class241_sub39_sub11)
							      .anInt10879),
						-1319745970)) {
		    ObjectDefinition class526 = (client.aClass238_8477.getObjectLoader(-2053798488).getObjectDefinition
			   ((int) ((-218357506993850339L
				    * (((Class241_Sub39_Sub11) class241_sub39_sub11)
				       .aLong10877)) >>> 32
				   & 0x7fffffffL),
			    577892407));
		    if (null != class526.toObjectIDs) {
		    	class526 = class526.method11768(Class1.aClass19_11, Class1.aClass19_11, -1504477445);
		    }
		    if (class526 != null) {
		    	is = class526.anIntArray6833;
		    }
		}
		return is;
    }
    
    static void method4310(String string, String string_18_, String string_19_,
			   boolean bool, boolean bool_20_, int i) {
	ServerConnection class190 = ClanChannelDelta.method6943(-1063449358);
	if (class190.getIO(-1436282030) != null) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4074,
					     class190.packetCipher,
					     16711935);
	    class241_sub27.data.writeShort
		((Class421.getEncodedStringLength(string, -1741643954)
		  + Class421.getEncodedStringLength(string_18_, -1689121850)
		  + Class421.getEncodedStringLength(string_19_, -1679251813) + 1),
		 -484048531);
	    class241_sub27.data.writeString(string,
								1458464159);
	    class241_sub27.data.writeString(string_18_,
								100191426);
	    class241_sub27.data.writeString(string_19_,
								-836290898);
	    int i_21_ = 0;
	    if (bool)
		i_21_ |= 0x1;
	    if (bool_20_)
		i_21_ |= 0x2;
	    class241_sub27.data.writeByte(i_21_,
								-1485253715);
	    class190.sendPacket(class241_sub27, -1701094418);
	}
    }
}
