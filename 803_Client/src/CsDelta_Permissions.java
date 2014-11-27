/* Class241_Sub5_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CsDelta_Permissions extends CsDeltaNode
{
    byte rankKick;//aByte11071
    byte rankTalk;//aByte11072
    boolean allowNonMembers;//aBool11073
    byte rankLootShare;//aByte11074
    byte aByte11075;
    ClanSettingsDelta this$0;
    
    void method14865(RSByteBuffer class241_sub3) {
	allowNonMembers
	    = class241_sub3.readUnsignedByte((byte) -85) == 1;
	rankTalk
	    = class241_sub3.getByte(1638988559);
	rankKick
	    = class241_sub3.getByte(-1626122373);
	rankLootShare
	    = class241_sub3.getByte(161356586);
	aByte11075
	    = class241_sub3.getByte(194292960);
    }
    
    CsDelta_Permissions(ClanSettingsDelta delta) {
		this$0 = delta;
    }
    
    void applyToClanSettings(ClanSettings settings, byte i) {
		settings.allowNonMembers = allowNonMembers;
		settings.rankTalk = rankTalk;
		settings.rankKick = rankKick;
		settings.rankLootShare = rankLootShare;
		settings.aByte5600 = aByte11075;
    }
    
    void method14869(RSByteBuffer class241_sub3) {
	allowNonMembers
	    = class241_sub3.readUnsignedByte((byte) 61) == 1;
	rankTalk
	    = class241_sub3.getByte(-1800650695);
	rankKick
	    = class241_sub3.getByte(-1939903411);
	rankLootShare
	    = class241_sub3.getByte(-1025980344);
	aByte11075
	    = class241_sub3.getByte(-138768145);
    }
    
    void decode(RSByteBuffer buffer, byte i) {
		allowNonMembers = buffer.readUnsignedByte((byte) 37) == 1;
		rankTalk = buffer.getByte(1161429936);
		rankKick = buffer.getByte(1374865641);
		rankLootShare = buffer.getByte(1035069843);
		aByte11075 = buffer.getByte(86959131);
    }
    
    void method14868(ClanSettings class374) {
	class374.allowNonMembers = allowNonMembers;
	class374.rankTalk = rankTalk;
	class374.rankKick = rankKick;
	class374.rankLootShare = rankLootShare;
	class374.aByte5600 = aByte11075;
    }
    
    void method14870(ClanSettings class374) {
	class374.allowNonMembers = allowNonMembers;
	class374.rankTalk = rankTalk;
	class374.rankKick = rankKick;
	class374.rankLootShare = rankLootShare;
	class374.aByte5600 = aByte11075;
    }
}
