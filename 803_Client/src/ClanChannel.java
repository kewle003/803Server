/* Class241_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.BitSet;

public class ClanChannel extends Node
{
    boolean useDisplayNames = true;//aBool8817
    public byte minTalkReq;//aByte8818
    public ClanChannelUser[] channelUsers;//aClass373Array8819
    public int memberCount = 0;//anInt8820
    int[] sortedMemberList;//anIntArray8821
    long updateNumber;//aLong8822
    public String channelName = null;//aString8823
    public byte minKickReq;//aByte8824
    boolean useUserHashes;//aBool8825
    
    public int method14874(String string) {
	for (int i = 0; i < memberCount * 81956567; i++) {
	    if (channelUsers[i].displayName.equalsIgnoreCase(string))
		return i;
	}
	return -1;
    }
    
    public int[] dummyMethod14875() {
	if (sortedMemberList == null) {
	    String[] strings = new String[81956567 * memberCount];
	    sortedMemberList
		= new int[memberCount * 81956567];
	    for (int i = 0; i < memberCount * 81956567; i++) {
		strings[i] = channelUsers[i].displayName;
		sortedMemberList[i] = i;
	    }
	    Class464.method10707(strings,
				 sortedMemberList,
				 575195529);
	}
	return sortedMemberList;
    }
    
    public int[] generateSortedList/*method14876*/(int i) {
		if (sortedMemberList == null) {
			String[] names = new String[81956567 * memberCount];
			sortedMemberList = new int[memberCount * 81956567];
			for (int index = 0; index < memberCount * 81956567; index++) {
				names[index] = channelUsers[index].displayName;
				sortedMemberList[index] = index;
			}
			Class464.method10707(names, sortedMemberList, 575195529);
		}
		return sortedMemberList;
    }
    
    void doAddMember/*method14877*/(ClanChannelUser user, short i) {
		if (channelUsers == null || memberCount * 81956567 >= channelUsers.length) {
			doExtendCapacity(81956567 * memberCount + 5, (byte) -45);
		}
		channelUsers[(memberCount += -815774489) * 81956567 - 1] = user;
		sortedMemberList = null;
    }
    
    void doDeleteMember/*method14878*/(int index, int i_1_) {
		memberCount -= -815774489;
		if (81956567 * memberCount == 0) {
			channelUsers = null;
		} else {
			System.arraycopy(channelUsers, 1 + index, channelUsers, index,
					 memberCount * 81956567 - index);
		}
		sortedMemberList = null;
    }
    
    public int getMemberIndex/*method14879*/(String name, byte i) {
		for (int index = 0; index < memberCount * 81956567; index++) {
			if (channelUsers[index].displayName.equalsIgnoreCase(name)) {
				return index;
			}
		}
		return -1;
    }
    
    void decode/*method14880*/(RSByteBuffer buffer, int i) {
		int flags = buffer.readUnsignedByte((byte) 19);
		if ((flags & 0x1) != 0) {
		    useUserHashes = true;
		}
		if (0 != (flags & 0x2)) {
		    useDisplayNames = true;
		}
		int version = 2;
		if ((flags & 0x4) != 0) {
		    version = buffer.readUnsignedByte((byte) 42);
		}
		hashCode = buffer.readLong((short) 10841) * -84545867636262595L;
		updateNumber = buffer.readLong((short) 8839) * 429383768188849947L;
		channelName = buffer.readString(-650744130);
		buffer.readUnsignedByte((byte) -16);
		minKickReq = buffer.getByte(-811444773);
		minTalkReq = buffer.getByte(-2088918626);
		memberCount = buffer.readUnsignedShort(1162222719) * -815774489;
		//System.out.println("Hash="+hashCode+", name="+channelName+", memberCount="+memberCount);
		if (81956567 * memberCount > 0) {
		    channelUsers = new ClanChannelUser[81956567 * memberCount];
		    for (int index = 0; index < 81956567 * memberCount; index++) {
				ClanChannelUser user = new ClanChannelUser();
				if (useUserHashes) {
					buffer.readLong((short) 13400);
				}
				if (useDisplayNames) {
					user.displayName = buffer.readString(825171603);
				}
				user.rank = buffer.getByte(-82443333);
				user.nodeID = buffer.readUnsignedShort(1162222719) * -1203859031;
				if (version >= 3) {
					buffer.readUnsignedByte((byte) 22);
				}
				channelUsers[index] = user;
		    }
		}
    }
    
    static {
    	new BitSet(65536);
    }
    
    void method14881(int i) {
		if (null != channelUsers)
			System.arraycopy(channelUsers, 0,
					 channelUsers = new ClanChannelUser[i], 0,
					 memberCount * 81956567);
		else
			channelUsers = new ClanChannelUser[i];
    }
    
    void method14882(int i) {
		if (null != channelUsers)
			System.arraycopy(channelUsers, 0,
					 channelUsers = new ClanChannelUser[i], 0,
					 memberCount * 81956567);
		else
			channelUsers = new ClanChannelUser[i];
    }
    
    void dummyMethod14883(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) 26);
	if ((i & 0x1) != 0)
	    useUserHashes = true;
	if (0 != (i & 0x2))
	    useDisplayNames = true;
	int i_6_ = 2;
	if ((i & 0x4) != 0)
	    i_6_ = class241_sub3.readUnsignedByte((byte) 8);
	hashCode
	    = class241_sub3.readLong((short) 21110) * -84545867636262595L;
	updateNumber
	    = class241_sub3.readLong((short) 32243) * 429383768188849947L;
	channelName = class241_sub3.readString(1652436906);
	class241_sub3.readUnsignedByte((byte) -17);
	minKickReq = class241_sub3.getByte(-839833511);
	minTalkReq = class241_sub3.getByte(-2081318260);
	memberCount = class241_sub3.readUnsignedShort(1162222719) * -815774489;
	if (81956567 * memberCount > 0) {
	    channelUsers = new ClanChannelUser[81956567 * memberCount];
	    for (int i_7_ = 0; i_7_ < 81956567 * memberCount; i_7_++) {
		ClanChannelUser class373 = new ClanChannelUser();
		if (useUserHashes)
		    class241_sub3.readLong((short) 24870);
		if (useDisplayNames)
		    class373.displayName
			= class241_sub3.readString(-735581082);
		class373.rank = class241_sub3.getByte(963330669);
		class373.nodeID
		    = class241_sub3.readUnsignedShort(1162222719) * -1203859031;
		if (i_6_ >= 3)
		    class241_sub3.readUnsignedByte((byte) -36);
		channelUsers[i_7_] = class373;
	    }
	}
    }
    
    public int[] method14884() {
	if (sortedMemberList == null) {
	    String[] strings = new String[81956567 * memberCount];
	    sortedMemberList
		= new int[memberCount * 81956567];
	    for (int i = 0; i < memberCount * 81956567; i++) {
		strings[i] = channelUsers[i].displayName;
		sortedMemberList[i] = i;
	    }
	    Class464.method10707(strings,
				 sortedMemberList,
				 575195529);
	}
	return sortedMemberList;
    }
    
    public ClanChannel(RSByteBuffer buffer) {
    	decode(buffer, -1988026934);
    }
    
    void dummyMethod14885(ClanChannelUser class373) {
	if (channelUsers == null
	    || memberCount * 81956567 >= channelUsers.length)
	    doExtendCapacity(81956567 * memberCount + 5, (byte) -124);
	channelUsers[(memberCount += -815774489) * 81956567 - 1]
	    = class373;
	sortedMemberList = null;
    }
    
    void dummyMethod14886(ClanChannelUser class373) {
	if (channelUsers == null
	    || memberCount * 81956567 >= channelUsers.length)
	    doExtendCapacity(81956567 * memberCount + 5, (byte) -38);
	channelUsers[(memberCount += -815774489) * 81956567 - 1]
	    = class373;
	sortedMemberList = null;
    }
    
    public int dummyMethod14887(String string) {
	for (int i = 0; i < memberCount * 81956567; i++) {
	    if (channelUsers[i].displayName.equalsIgnoreCase(string))
		return i;
	}
	return -1;
    }
    
    void dummyMethod14888(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) -62);
	if ((i & 0x1) != 0)
	    useUserHashes = true;
	if (0 != (i & 0x2))
	    useDisplayNames = true;
	int i_8_ = 2;
	if ((i & 0x4) != 0)
	    i_8_ = class241_sub3.readUnsignedByte((byte) 116);
	hashCode
	    = class241_sub3.readLong((short) 14412) * -84545867636262595L;
	updateNumber
	    = class241_sub3.readLong((short) 17320) * 429383768188849947L;
	channelName = class241_sub3.readString(-620860893);
	class241_sub3.readUnsignedByte((byte) -74);
	minKickReq = class241_sub3.getByte(-1567201923);
	minTalkReq = class241_sub3.getByte(574635487);
	memberCount = class241_sub3.readUnsignedShort(1162222719) * -815774489;
	if (81956567 * memberCount > 0) {
	    channelUsers = new ClanChannelUser[81956567 * memberCount];
	    for (int i_9_ = 0; i_9_ < 81956567 * memberCount; i_9_++) {
		ClanChannelUser class373 = new ClanChannelUser();
		if (useUserHashes)
		    class241_sub3.readLong((short) 18785);
		if (useDisplayNames)
		    class373.displayName
			= class241_sub3.readString(-1744806822);
		class373.rank = class241_sub3.getByte(694978331);
		class373.nodeID
		    = class241_sub3.readUnsignedShort(1162222719) * -1203859031;
		if (i_8_ >= 3)
		    class241_sub3.readUnsignedByte((byte) -107);
		channelUsers[i_9_] = class373;
	    }
	}
    }
    
    void doExtendCapacity/*method14889*/(int capacity, byte i_10_) {
		if (null != channelUsers) {
			System.arraycopy(channelUsers, 0,
					 channelUsers = new ClanChannelUser[capacity], 0,
					 memberCount * 81956567);
		} else {
			channelUsers = new ClanChannelUser[capacity];
		}
    }
    
    void dummyMethod14890(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) -106);
	if ((i & 0x1) != 0)
	    useUserHashes = true;
	if (0 != (i & 0x2))
	    useDisplayNames = true;
	int i_11_ = 2;
	if ((i & 0x4) != 0)
	    i_11_ = class241_sub3.readUnsignedByte((byte) -117);
	hashCode
	    = class241_sub3.readLong((short) 12001) * -84545867636262595L;
	updateNumber
	    = class241_sub3.readLong((short) 22012) * 429383768188849947L;
	channelName = class241_sub3.readString(-1591901406);
	class241_sub3.readUnsignedByte((byte) 42);
	minKickReq = class241_sub3.getByte(-1279083874);
	minTalkReq = class241_sub3.getByte(910880716);
	memberCount = class241_sub3.readUnsignedShort(1162222719) * -815774489;
	if (81956567 * memberCount > 0) {
	    channelUsers = new ClanChannelUser[81956567 * memberCount];
	    for (int i_12_ = 0; i_12_ < 81956567 * memberCount; i_12_++) {
		ClanChannelUser class373 = new ClanChannelUser();
		if (useUserHashes)
		    class241_sub3.readLong((short) 27341);
		if (useDisplayNames)
		    class373.displayName
			= class241_sub3.readString(-375441675);
		class373.rank = class241_sub3.getByte(1374091750);
		class373.nodeID
		    = class241_sub3.readUnsignedShort(1162222719) * -1203859031;
		if (i_11_ >= 3)
		    class241_sub3.readUnsignedByte((byte) 25);
		channelUsers[i_12_] = class373;
	    }
	}
    }
    
    void dummyMethod14891(int i) {
	if (null != channelUsers)
	    System.arraycopy(channelUsers, 0,
			     channelUsers = new ClanChannelUser[i], 0,
			     memberCount * 81956567);
	else
	    channelUsers = new ClanChannelUser[i];
    }
    
    void dummyMethod14892(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) -34);
	if ((i & 0x1) != 0)
	    useUserHashes = true;
	if (0 != (i & 0x2))
	    useDisplayNames = true;
	int i_13_ = 2;
	if ((i & 0x4) != 0)
	    i_13_ = class241_sub3.readUnsignedByte((byte) 54);
	hashCode
	    = class241_sub3.readLong((short) 29911) * -84545867636262595L;
	updateNumber
	    = class241_sub3.readLong((short) 21764) * 429383768188849947L;
	channelName = class241_sub3.readString(1335506672);
	class241_sub3.readUnsignedByte((byte) 47);
	minKickReq = class241_sub3.getByte(-1606434906);
	minTalkReq = class241_sub3.getByte(-626139119);
	memberCount = class241_sub3.readUnsignedShort(1162222719) * -815774489;
	if (81956567 * memberCount > 0) {
	    channelUsers = new ClanChannelUser[81956567 * memberCount];
	    for (int i_14_ = 0; i_14_ < 81956567 * memberCount; i_14_++) {
		ClanChannelUser class373 = new ClanChannelUser();
		if (useUserHashes)
		    class241_sub3.readLong((short) 18225);
		if (useDisplayNames)
		    class373.displayName
			= class241_sub3.readString(-465681679);
		class373.rank = class241_sub3.getByte(1641687425);
		class373.nodeID
		    = class241_sub3.readUnsignedShort(1162222719) * -1203859031;
		if (i_13_ >= 3)
		    class241_sub3.readUnsignedByte((byte) 22);
		channelUsers[i_14_] = class373;
	    }
	}
    }
    
    public int dummyMethod14893(String string) {
	for (int i = 0; i < memberCount * 81956567; i++) {
	    if (channelUsers[i].displayName.equalsIgnoreCase(string))
		return i;
	}
	return -1;
    }
}
