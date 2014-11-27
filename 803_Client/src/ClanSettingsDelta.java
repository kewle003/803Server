/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ClanSettingsDelta
{
    static final int SET_VAR_STR = 10;//anInt5636
    int updateNum = -1226400003;//anInt5637
    NodeCollection aClass429_5638 = new NodeCollection();
    static final int ADD_MEMBER = 1;//anInt5639
    static final int SET_RANK = 2;//anInt5640
    static final int ADD_BAN = 3;//anInt5641
    static final int anInt5642 = 4;//anInt5642
    static final int anInt5643 = 5;
    static final int anInt5644 = 6;
    static final int SET_MEMBER_VAR_BIT = 7;//anInt5645
    long owner;//aLong5646
    static final int SET_VAR_LONG = 9;//anInt5647
    static final int SET_VAR_INT = 8;//anInt5648
    static final int SET_VAR_BIT = 11;//anInt5649
    static final int SET_NAME = 12;//anInt5650
    static final int anInt5651 = 14;
    static final int anInt5652 = 13;
    
    public void applyToClanSettings/*method6836*/(ClanSettings settings, byte i) {
		if ((-5861328296782815241L * settings.owner != -29815921719988779L * owner)
				|| (updateNum * -2037837397 != 1615242247 * settings.updateNum)) {
			throw new RuntimeException("");
		}
		for (CsDeltaNode delta = ((CsDeltaNode) aClass429_5638.method7694(16711935));
				delta != null;
				delta = (CsDeltaNode) aClass429_5638.method7692(-180872629)) {
			delta.applyToClanSettings(settings, (byte) 4);
		}
		settings.updateNum += 1849657783;
    }
    
    public ClanSettingsDelta(RSByteBuffer buffer) {
		decode(buffer, (byte) 112);
    }
    
    void decode/*method6837*/(RSByteBuffer buffer, byte i) {
		owner = buffer.readLong((short) 3909) * -4837940451233160323L;
		updateNum = buffer.readInt((byte) 55) * 1226400003;
		for (int type = buffer.readUnsignedByte((byte) -59); 
				0 != type;
				type = buffer.readUnsignedByte((byte) 4)) {
			CsDeltaNode delta;
			if (type == ADD_MEMBER) {
				delta = new CsDelta_Add(this);//Add member
			} else if (type == SET_RANK) {
				delta = new CsDelta_UpdateRank(this);//Update member rank
			} else if (type == ADD_BAN) {
				delta = new CsDelta_AddBan(this);//Add ban
			} else if (type == 4) {
				delta = new CsDelta_Permissions(this);//Updates permissions
			} else if (5 == type) {
				delta = new CsDelta_Delete(this);//Delete member
			} else if (6 == type) {
				delta = new CsDelta_DeleteBan(this);//Delete ban
			} else if (type == SET_MEMBER_VAR_BIT) {
				delta = new CsDelta_SetMemberVarBit(this);//Update member VarBit
			} else if (type == SET_VAR_INT) {
				delta = new CsDelta_SetVarInt(this);//Set VarClanSettings int
			} else if (type == SET_VAR_LONG) {
				delta = new CsDelta_SetVarLong(this);//Set VarClanSettings long
			} else if (type == SET_VAR_STR) {
				delta = new CsDelta_SetVarString(this);//Update VarClanSettings string
			} else if (type == SET_VAR_BIT) {
				delta = new CsDelta_SetVarBit(this);//Update VarClanSettings bit
			} else if (type == SET_NAME) {
				delta = new CsDelta_SetName(this);//Update clan name
			} else if (13 == type) {
				delta = new CsDelta_Add_2(this);//Add member (extended)
			} else if (14 == type) {
				delta = new Class241_Sub5_Sub9(this);//Update member boolean (What is this?)
			} else {
				throw new RuntimeException("");
			}
			delta.decode(buffer, (byte) 29);
			aClass429_5638.addNode(delta, (short) -11996);
		}
    }
    
    void method6838(RSByteBuffer class241_sub3) {
	owner
	    = class241_sub3.readLong((short) 772) * -4837940451233160323L;
	updateNum
	    = class241_sub3.readInt((byte) 46) * 1226400003;
	for (int i = class241_sub3.readUnsignedByte((byte) 29); 0 != i;
	     i = class241_sub3.readUnsignedByte((byte) -87)) {
	    CsDeltaNode class241_sub5;
	    if (3 == i)
		class241_sub5 = new CsDelta_AddBan(this);
	    else if (i == 1)
		class241_sub5 = new CsDelta_Add(this);
	    else if (13 == i)
		class241_sub5 = new CsDelta_Add_2(this);
	    else if (i == 4)
		class241_sub5 = new CsDelta_Permissions(this);
	    else if (6 == i)
		class241_sub5 = new CsDelta_DeleteBan(this);
	    else if (5 == i)
		class241_sub5 = new CsDelta_Delete(this);
	    else if (2 == i)
		class241_sub5 = new CsDelta_UpdateRank(this);
	    else if (i == 7)
		class241_sub5 = new CsDelta_SetMemberVarBit(this);
	    else if (14 == i)
		class241_sub5 = new Class241_Sub5_Sub9(this);
	    else if (8 == i)
		class241_sub5 = new CsDelta_SetVarInt(this);
	    else if (9 == i)
		class241_sub5 = new CsDelta_SetVarLong(this);
	    else if (i == 10)
		class241_sub5 = new CsDelta_SetVarString(this);
	    else if (11 == i)
		class241_sub5 = new CsDelta_SetVarBit(this);
	    else if (i == 12)
		class241_sub5 = new CsDelta_SetName(this);
	    else
		throw new RuntimeException("");
	    class241_sub5.decode(class241_sub3, (byte) -7);
	    aClass429_5638.addNode(class241_sub5,
							(short) -4401);
	}
    }
    
    void method6839(RSByteBuffer class241_sub3) {
	owner
	    = class241_sub3.readLong((short) 11821) * -4837940451233160323L;
	updateNum
	    = class241_sub3.readInt((byte) 110) * 1226400003;
	for (int i = class241_sub3.readUnsignedByte((byte) 34); 0 != i;
	     i = class241_sub3.readUnsignedByte((byte) -59)) {
	    CsDeltaNode class241_sub5;
	    if (3 == i)
		class241_sub5 = new CsDelta_AddBan(this);
	    else if (i == 1)
		class241_sub5 = new CsDelta_Add(this);
	    else if (13 == i)
		class241_sub5 = new CsDelta_Add_2(this);
	    else if (i == 4)
		class241_sub5 = new CsDelta_Permissions(this);
	    else if (6 == i)
		class241_sub5 = new CsDelta_DeleteBan(this);
	    else if (5 == i)
		class241_sub5 = new CsDelta_Delete(this);
	    else if (2 == i)
		class241_sub5 = new CsDelta_UpdateRank(this);
	    else if (i == 7)
		class241_sub5 = new CsDelta_SetMemberVarBit(this);
	    else if (14 == i)
		class241_sub5 = new Class241_Sub5_Sub9(this);
	    else if (8 == i)
		class241_sub5 = new CsDelta_SetVarInt(this);
	    else if (9 == i)
		class241_sub5 = new CsDelta_SetVarLong(this);
	    else if (i == 10)
		class241_sub5 = new CsDelta_SetVarString(this);
	    else if (11 == i)
		class241_sub5 = new CsDelta_SetVarBit(this);
	    else if (i == 12)
		class241_sub5 = new CsDelta_SetName(this);
	    else
		throw new RuntimeException("");
	    class241_sub5.decode(class241_sub3, (byte) -46);
	    aClass429_5638.addNode(class241_sub5,
							(short) -1255);
	}
    }
    
    void method6840(RSByteBuffer class241_sub3) {
	owner
	    = class241_sub3.readLong((short) 28952) * -4837940451233160323L;
	updateNum
	    = class241_sub3.readInt((byte) 4) * 1226400003;
	for (int i = class241_sub3.readUnsignedByte((byte) -100); 0 != i;
	     i = class241_sub3.readUnsignedByte((byte) 59)) {
	    CsDeltaNode class241_sub5;
	    if (3 == i)
		class241_sub5 = new CsDelta_AddBan(this);
	    else if (i == 1)
		class241_sub5 = new CsDelta_Add(this);
	    else if (13 == i)
		class241_sub5 = new CsDelta_Add_2(this);
	    else if (i == 4)
		class241_sub5 = new CsDelta_Permissions(this);
	    else if (6 == i)
		class241_sub5 = new CsDelta_DeleteBan(this);
	    else if (5 == i)
		class241_sub5 = new CsDelta_Delete(this);
	    else if (2 == i)
		class241_sub5 = new CsDelta_UpdateRank(this);
	    else if (i == 7)
		class241_sub5 = new CsDelta_SetMemberVarBit(this);
	    else if (14 == i)
		class241_sub5 = new Class241_Sub5_Sub9(this);
	    else if (8 == i)
		class241_sub5 = new CsDelta_SetVarInt(this);
	    else if (9 == i)
		class241_sub5 = new CsDelta_SetVarLong(this);
	    else if (i == 10)
		class241_sub5 = new CsDelta_SetVarString(this);
	    else if (11 == i)
		class241_sub5 = new CsDelta_SetVarBit(this);
	    else if (i == 12)
		class241_sub5 = new CsDelta_SetName(this);
	    else
		throw new RuntimeException("");
	    class241_sub5.decode(class241_sub3, (byte) -36);
	    aClass429_5638.addNode(class241_sub5,
							(short) -31864);
	}
    }
    
    public void method6841(ClanSettings class374) {
	if ((-5861328296782815241L * ((ClanSettings) class374).owner
	     != -29815921719988779L * owner)
	    || (updateNum * -2037837397
		!= 1615242247 * ((ClanSettings) class374).updateNum))
	    throw new RuntimeException("");
	for (CsDeltaNode class241_sub5
		 = ((CsDeltaNode)
		    aClass429_5638.method7694(16711935));
	     class241_sub5 != null;
	     class241_sub5 = (CsDeltaNode) ((ClanSettingsDelta) this)
						 .aClass429_5638
						 .method7692(1289106675))
	    class241_sub5.applyToClanSettings(class374, (byte) 4);
	((ClanSettings) class374).updateNum += 1849657783;
    }
    
    static final void method6842(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8879
		  .method14209(2136420469) ? 1 : 0;
    }
}
