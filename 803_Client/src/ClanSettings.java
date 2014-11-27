/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class ClanSettings
{
    public byte rankTalk;//aByte5589
    boolean useUserHashes;//aBool5590
    boolean useDisplayNames;//aBool5591
    long owner;//aLong5592
    public int banCount;//anInt5593
    public String clanName;//aString5594
    int anInt5595;
    public boolean allowNonMembers;//aBool5596
    public String[] clanMemberNames;//aStringArray5597
    public int ownerSlot;//anInt5598
    public byte rankLootShare;//aByte5599
    public byte aByte5600;
    int[] clanMemberSettings;//anIntArray5601
    long[] clanMemberHashes;//aLongArray5602
    static final int GENERAL_RANK = 6;//anInt5603
    int[] anIntArray5604;
    static final byte JMOD_RANK = 127;//aByte5605
    public int[] clanMemberJoinDays;//anIntArray5606
    public boolean[] aBoolArray5607;
    int updateNum = 0;//anInt5608
    public int replacementOwnerSlot;//anInt5609
    public int memberCount;//anInt5610
    long[] clanBanHashes;//aLongArray5611
    public byte rankKick;//aByte5612
    public byte[] clanMemberRanks;//aByteArray5613
    HashTable varClanSettings;//aClass407_5614
    static final byte RECRUIT_RANK = 0;//aByte5615
    static final byte OWNER_RANK = 126;//aByte5616
    static final byte DEPUTY_OWNER_RANK = 125;//aByte5617
    public String[] clanBanNames;//aStringArray5618
    public static final byte GUEST_RANK = -1;//aByte5619
    
    int setVarMemberBit/*method6663*/(int memberIndex, int value, int startBit, int endBit, int i_3_) {
		int i_4_ = (1 << startBit) - 1;
		int i_5_ = endBit == 31 ? -1 : (1 << 1 + endBit) - 1;
		int mask = i_5_ ^ i_4_;
		value <<= startBit;
		value &= mask;
		int prevValue = clanMemberSettings[memberIndex];
		if (value == (prevValue & mask)) {
			return -1;
		}
		prevValue &= mask ^ 0xffffffff;
		clanMemberSettings[memberIndex] = prevValue | value;
		return memberIndex;
    }
    
    void method6664(int i, byte i_8_) {
	if (useUserHashes) {
	    if (null != clanMemberHashes)
		System.arraycopy(clanMemberHashes, 0,
				 (clanMemberHashes
				  = new long[i]),
				 0, 1142036357 * memberCount);
	    else
		clanMemberHashes = new long[i];
	}
	if (useDisplayNames) {
	    if (clanMemberNames != null)
		System.arraycopy(clanMemberNames, 0,
				 clanMemberNames = new String[i], 0,
				 memberCount * 1142036357);
	    else
		clanMemberNames = new String[i];
	}
	if (null != clanMemberRanks)
	    System.arraycopy(clanMemberRanks, 0, clanMemberRanks = new byte[i],
			     0, memberCount * 1142036357);
	else
	    clanMemberRanks = new byte[i];
	if (null != clanMemberSettings)
	    System.arraycopy(clanMemberSettings, 0,
			     clanMemberSettings = new int[i], 0,
			     1142036357 * memberCount);
	else
	    clanMemberSettings = new int[i];
	if (null != clanMemberJoinDays)
	    System.arraycopy(clanMemberJoinDays, 0, clanMemberJoinDays = new int[i], 0,
			     memberCount * 1142036357);
	else
	    clanMemberJoinDays = new int[i];
	if (null != aBoolArray5607)
	    System.arraycopy(aBoolArray5607, 0,
			     aBoolArray5607 = new boolean[i], 0,
			     memberCount * 1142036357);
	else
	    aBoolArray5607 = new boolean[i];
    }
    
    boolean method6665(int i, long l) {
		if (varClanSettings != null) {
			Node class241 = varClanSettings.get((long) i);
			if (null != class241) {
				if (class241 instanceof LongNode) {
					LongNode class241_sub28 = (LongNode) class241;
					if (l == class241_sub28.longValue * -1969238413959512229L) {
						return false;
					}
					class241_sub28.longValue = -6855925735381116717L * l;
					return true;
				}
				class241.remove((byte) 36);
			}
		} else {
			varClanSettings = new HashTable(4);
		}
		varClanSettings.put(new LongNode(l), (long) i);
		return true;
    }
    
    public int getClanMemberIndex/*method6666*/(String string, int i) {
		if (string == null || string.length() == 0)
		    return -1;
		for (int index = 0; index < 1142036357 * memberCount; index++) {
		    if (clanMemberNames[index].equals(string)) {
				return index;
			}
		}
		return -1;
    }
    
    public int getVarMemberBit/*method6667*/(int memberIndex, int startBit, int endBit, int i_12_) {
		int mask = (endBit == 31) ? -1 : (1 << 1 + endBit) - 1;
		return (clanMemberSettings[memberIndex] & mask) >>> startBit;
    }
    
    public Integer getVarValueInt/*method6668*/(int id, int i_14_) {
		if (varClanSettings == null) {
		    return null;
		}
		Node class241 = varClanSettings.get((long) id);
		if (class241 == null || !(class241 instanceof IntegerNode)) {
		    return null;
		}
		return new Integer(((IntegerNode) class241).intValue * -1859754807);
    }
    
    void resizeBans/*method6669*/(int size, byte i_15_) {
		if (useUserHashes) {
			if (null != clanBanHashes) {
				System.arraycopy(clanBanHashes, 0, (clanBanHashes = new long[size]), 0, banCount * -1789847393);
			} else {
				clanBanHashes = new long[size];
			}
		}
		if (useDisplayNames) {
			if (null != clanBanNames) {
				System.arraycopy(clanBanNames, 0,  clanBanNames = new String[size], 0, banCount * -1789847393);
			} else {
				clanBanNames = new String[size];
			}
		}
    }
    
    public String method6670(int i, int i_16_) {
		if (null == varClanSettings) {
		    return null;
		}
		Node class241 = varClanSettings.get((long) i);
		if (class241 == null || !(class241 instanceof ObjectNode)) {
		    return null;
		}
		return (String) ((ObjectNode) class241).objectValue;
    }
    
    boolean setVarBitValue/*method6671*/(int key, int value, int startBit, int endBit, int i_20_) {
		int i_21_ = (1 << startBit) - 1;
		int i_22_ = 31 == endBit ? -1 : (1 << 1 + endBit) - 1;
		int mask = i_22_ ^ i_21_;
		value <<= startBit;
		value &= mask;
		if (varClanSettings != null) {
			Node node = varClanSettings.get((long) key);
			if (null != node) {
				if (node instanceof IntegerNode) {
					IntegerNode intNode = (IntegerNode) node;
					if (value == (intNode.intValue * -1859754807 & mask)) {
						return false;
					}
					IntegerNode class241_sub22_24_;
					(class241_sub22_24_ = intNode).intValue = (1144452473 * (class241_sub22_24_.intValue * -1859754807 & (mask ^ 0xffffffff)));
					IntegerNode class241_sub22_25_;
					(class241_sub22_25_ = intNode).intValue = ((-1859754807 * class241_sub22_25_.intValue | value) * 1144452473);
					return true;
				}
				node.remove((byte) 36);
			}
		} else {
			varClanSettings = new HashTable(4);
		}
		varClanSettings.put(new IntegerNode(value), (long) key);
		return true;
    }
    
    void doAddMember/*method6672*/(long userHash, String displayName, int joinDay, int i_26_) {
		if (null != displayName && displayName.length() == 0) {
			displayName = null;
		}
		if (useUserHashes != userHash > 0L) {
			throw new RuntimeException("");
		}
		if ((displayName != null) != useDisplayNames) {
			throw new RuntimeException("");
		}
		if (userHash > 0L && (clanMemberHashes == null
				|| (1142036357 * memberCount >= clanMemberHashes.length))
				|| (displayName != null && (null == clanMemberNames || memberCount * 1142036357 >= clanMemberNames.length)))
			method6664(memberCount * 1142036357 + 5, (byte) -37);
		if (clanMemberHashes != null) {
			clanMemberHashes[1142036357 * memberCount] = userHash;
		}
		if (clanMemberNames != null) {
			clanMemberNames[memberCount * 1142036357] = displayName;
		}
		if (-1 == ownerSlot * -749252521) {
			ownerSlot = 355663235 * memberCount;
			clanMemberRanks[1142036357 * memberCount] = OWNER_RANK;//(byte) 126;
		} else {
			clanMemberRanks[memberCount * 1142036357] = RECRUIT_RANK;//(byte) 0;
		}
		clanMemberSettings[memberCount * 1142036357] = 0;
		clanMemberJoinDays[memberCount * 1142036357] = joinDay;
		aBoolArray5607[memberCount * 1142036357] = false;
		memberCount += 1687308621;
		anIntArray5604 = null;
    }
    
    void method6673(long l, String string, int i) {
	if (null != string && string.length() == 0)
	    string = null;
	if (useUserHashes != l > 0L)
	    throw new RuntimeException("");
	if ((string != null) != useDisplayNames)
	    throw new RuntimeException("");
	if (l > 0L && (clanMemberHashes == null
		       || (1142036357 * memberCount
			   >= clanMemberHashes.length))
	    || (null != string
		&& (null == clanMemberNames
		    || memberCount * 1142036357 >= clanMemberNames.length)))
	    method6664(memberCount * 1142036357 + 5, (byte) -118);
	if (clanMemberHashes != null)
	    clanMemberHashes[1142036357 * memberCount] = l;
	if (clanMemberNames != null)
	    clanMemberNames[memberCount * 1142036357] = string;
	if (-1 == ownerSlot * -749252521) {
	    ownerSlot = 355663235 * memberCount;
	    clanMemberRanks[1142036357 * memberCount] = (byte) 126;
	} else
	    clanMemberRanks[memberCount * 1142036357] = (byte) 0;
	clanMemberSettings[memberCount * 1142036357] = 0;
	clanMemberJoinDays[memberCount * 1142036357] = i;
	aBoolArray5607[memberCount * 1142036357] = false;
	memberCount += 1687308621;
	anIntArray5604 = null;
    }
    
    void findClanOwner(int i) {//Used
		if (0 == memberCount * 1142036357) {
			ownerSlot = 1420387481;//-1
			replacementOwnerSlot = -39210433;
		} else {
			ownerSlot = 1420387481;
			replacementOwnerSlot = -39210433;
			int highestRankSlot = 0;
			byte highestRank = clanMemberRanks[0];
			for (int index = 1; index < memberCount * 1142036357; index++) {
				if (clanMemberRanks[index] > highestRank) {
					if (highestRank == DEPUTY_OWNER_RANK) {//125
						replacementOwnerSlot = 39210433 * highestRankSlot;
					}
					highestRankSlot = index;
					highestRank = clanMemberRanks[index];
				} else if (-1 == 531284545 * replacementOwnerSlot && clanMemberRanks[index] == DEPUTY_OWNER_RANK) {//125
					replacementOwnerSlot = index * 39210433;
				}
			}
			ownerSlot = highestRankSlot * -1420387481;
			if (ownerSlot * -749252521 != -1) {
				clanMemberRanks[ownerSlot * -749252521] = OWNER_RANK;//(byte) 126;
			}
		}
    }
    
    void doAddBan/*method6675*/(long hash, String name, int i) {
		if (null != name && name.length() == 0) {
			name = null;
		}
		if (useUserHashes != hash > 0L) {
			throw new RuntimeException("");
		}
		if (useDisplayNames != (name != null)) {
			throw new RuntimeException("");
		}
		if (hash > 0L && (clanBanHashes == null || (-1789847393 * banCount >= clanBanHashes.length))
			|| (null != name && (null == clanBanNames || -1789847393 * banCount >= clanBanNames.length))) {
			resizeBans(banCount * -1789847393 + 5, (byte) 108);
		}
		if (clanBanHashes != null) {
			clanBanHashes[-1789847393 * banCount] = hash;
		}
		if (null != clanBanNames) {
			clanBanNames[-1789847393 * banCount] = name;
		}
		banCount += -1851653281;
    }
    
    void doDeleteBan/*method6676*/(int index, int i_30_) {
		banCount -= -1851653281;
		if (banCount * -1789847393 == 0) {
			clanBanHashes = null;
			clanBanNames = null;
		} else {
			if (clanBanHashes != null) {
				System.arraycopy(clanBanHashes, index + 1,
					 clanBanHashes, index, banCount * -1789847393 - index);
			}
			if (clanBanNames != null) {
				System.arraycopy(clanBanNames, 1 + index, clanBanNames, index,
					 banCount * -1789847393 - index);
			}
		}
    }
    
    int doUpdateRank/*method6677*/(int memberIndex, byte rank, byte i_32_) {//Set member rank
		if (126 == rank || rank == 127)
			return -1;
		if (memberIndex == ownerSlot * -749252521
				&& (-1 == replacementOwnerSlot * 531284545 || clanMemberRanks[replacementOwnerSlot * 531284545] < 125))
			return -1;
		if (rank == clanMemberRanks[memberIndex]) {
			return -1;
		}
		clanMemberRanks[memberIndex] = rank;
		findClanOwner(-726787645);
		return memberIndex;
    }
    
    int method6678(int i, boolean bool, int i_33_) {
		if (bool == aBoolArray5607[i])
			return -1;
		aBoolArray5607[i] = bool;
		return i;
    }
    
    public int method6679(int i, int i_34_, int i_35_) {
	int i_36_ = i_35_ == 31 ? -1 : (1 << 1 + i_35_) - 1;
	return (clanMemberSettings[i] & i_36_) >>> i_34_;
    }
    
    boolean setVarValueInt/*method6680*/(int key, int value, int i_38_) {
		if (null != varClanSettings) {
			Node node = varClanSettings.get((long) key);
			if (node != null) {
				if (node instanceof IntegerNode) {
					IntegerNode intNode = (IntegerNode) node;
					if (-1859754807 * intNode.intValue == value) {
						return false;
					}
					intNode.intValue = 1144452473 * value;
					return true;
				}
				node.remove((byte) 36);
			}
		} else {
			varClanSettings = new HashTable(4);
		}
		varClanSettings.put(new IntegerNode(value), (long) key);
		return true;
    }
    
    void doDeleteMember/*method6681*/(int memberIndex, byte i_39_) {
		if (memberIndex < 0 || memberIndex >= 1142036357 * memberCount) {
			throw new RuntimeException("");
		}
		memberCount -= 1687308621;
		anIntArray5604 = null;
		if (memberCount * 1142036357 == 0) {
			clanMemberHashes = null;
			clanMemberNames = null;
			clanMemberRanks = null;
			clanMemberSettings = null;
			clanMemberJoinDays = null;
			aBoolArray5607 = null;
			ownerSlot = 1420387481;
			replacementOwnerSlot = -39210433;
		} else {
			System.arraycopy(clanMemberRanks, 1 + memberIndex, clanMemberRanks, memberIndex,
					 memberCount * 1142036357 - memberIndex);
			System.arraycopy(clanMemberSettings, 1 + memberIndex,
					 clanMemberSettings, memberIndex,
					 memberCount * 1142036357 - memberIndex);
			System.arraycopy(clanMemberJoinDays, 1 + memberIndex, clanMemberJoinDays, memberIndex,
					 memberCount * 1142036357 - memberIndex);
			System.arraycopy(aBoolArray5607, 1 + memberIndex, aBoolArray5607, memberIndex,
					 memberCount * 1142036357 - memberIndex);
			if (clanMemberHashes != null) {
				System.arraycopy(clanMemberHashes, memberIndex + 1,
					 clanMemberHashes, memberIndex,
					 memberCount * 1142036357 - memberIndex);
			}
			if (clanMemberNames != null) {
				System.arraycopy(clanMemberNames, memberIndex + 1, clanMemberNames, memberIndex,
					 1142036357 * memberCount - memberIndex);
			}
			findClanOwner(-262681025);
		}
    }
    
    void method6682(int i) {
	banCount -= -1851653281;
	if (banCount * -1789847393 == 0) {
	    clanBanHashes = null;
	    clanBanNames = null;
	} else {
	    if (clanBanHashes != null)
		System.arraycopy(clanBanHashes, i + 1,
				 clanBanHashes, i,
				 banCount * -1789847393 - i);
	    if (clanBanNames != null)
		System.arraycopy(clanBanNames, 1 + i, clanBanNames, i,
				 banCount * -1789847393 - i);
	}
    }
    
    void method6683(int i) {
	if (useUserHashes) {
	    if (null != clanMemberHashes)
		System.arraycopy(clanMemberHashes, 0,
				 (clanMemberHashes
				  = new long[i]),
				 0, 1142036357 * memberCount);
	    else
		clanMemberHashes = new long[i];
	}
	if (useDisplayNames) {
	    if (clanMemberNames != null)
		System.arraycopy(clanMemberNames, 0,
				 clanMemberNames = new String[i], 0,
				 memberCount * 1142036357);
	    else
		clanMemberNames = new String[i];
	}
	if (null != clanMemberRanks)
	    System.arraycopy(clanMemberRanks, 0, clanMemberRanks = new byte[i],
			     0, memberCount * 1142036357);
	else
	    clanMemberRanks = new byte[i];
	if (null != clanMemberSettings)
	    System.arraycopy(clanMemberSettings, 0,
			     clanMemberSettings = new int[i], 0,
			     1142036357 * memberCount);
	else
	    clanMemberSettings = new int[i];
	if (null != clanMemberJoinDays)
	    System.arraycopy(clanMemberJoinDays, 0, clanMemberJoinDays = new int[i], 0,
			     memberCount * 1142036357);
	else
	    clanMemberJoinDays = new int[i];
	if (null != aBoolArray5607)
	    System.arraycopy(aBoolArray5607, 0,
			     aBoolArray5607 = new boolean[i], 0,
			     memberCount * 1142036357);
	else
	    aBoolArray5607 = new boolean[i];
    }
    
    void decode/*method6684*/(RSByteBuffer buffer, int i) {
		int version = buffer.readUnsignedByte((byte) -92);
		if (version < 1 || version > 6) {
			throw new RuntimeException(new StringBuilder().append("").append(version).toString());
		}
		int flags = buffer.readUnsignedByte((byte) -33);
		if (0 != (flags & 0x1)) {
			useUserHashes = true;
		}
		if ((flags & 0x2) != 0) {
			useDisplayNames = true;
		}
		if (!useUserHashes) {
			clanMemberHashes = null;
			clanBanHashes = null;
		}
		if (!useDisplayNames) {
			clanMemberNames = null;
			clanBanNames = null;
		}
		updateNum = buffer.readInt((byte) 44) * 1849657783;
		anInt5595 = buffer.readInt((byte) 14) * 1287581383;
		if (version <= 3 && 0 != 1341485815 * anInt5595) {
			anInt5595 += 1237218144;
		}
		memberCount = buffer.readUnsignedShort(1162222719) * 1687308621;
		banCount = buffer.readUnsignedByte((byte) -46) * -1851653281;
		clanName = buffer.readString(1434477222);//Clan name?
		if (version >= 4) {
			buffer.readInt((byte) 19);
		}
		allowNonMembers = buffer.readUnsignedByte((byte) 32) == 1;
		rankTalk = buffer.getByte(-668202420);
		rankKick = buffer.getByte(-1899693039);
		rankLootShare = buffer.getByte(1391007746);
		aByte5600 = buffer.getByte(-626883361);
		if (1142036357 * memberCount > 0) {
			if (useUserHashes && (null == clanMemberHashes || (clanMemberHashes.length < memberCount * 1142036357))) {
				clanMemberHashes = new long[1142036357 * memberCount];
			}
			if (useDisplayNames && (clanMemberNames == null || clanMemberNames.length < 1142036357 * memberCount)) {
				clanMemberNames = new String[memberCount * 1142036357];
			}
			if (clanMemberRanks == null || clanMemberRanks.length < memberCount * 1142036357) {
				clanMemberRanks = new byte[memberCount * 1142036357];
			}
			if (clanMemberSettings == null || (clanMemberSettings.length < 1142036357 * memberCount)) {
				clanMemberSettings = new int[memberCount * 1142036357];
			}
			if (null == clanMemberJoinDays || clanMemberJoinDays.length < 1142036357 * memberCount) {
				clanMemberJoinDays = new int[1142036357 * memberCount];
			}
			if (aBoolArray5607 == null || aBoolArray5607.length < memberCount * 1142036357) {
				aBoolArray5607 = new boolean[1142036357 * memberCount];
			}
			for (int index = 0; index < memberCount * 1142036357; index++) {
				if (useUserHashes) {
					clanMemberHashes[index] = buffer.readLong((short) 22119);
				} 
				if (useDisplayNames) {
					clanMemberNames[index] = buffer.readNullString(71257681);
				}
				clanMemberRanks[index] = buffer.getByte(1161545339);
				if (version >= 2) {
					clanMemberSettings[index] = buffer.readInt((byte) 3);
				}
				if (version >= 5) {
					clanMemberJoinDays[index] = buffer.readUnsignedShort(1162222719);
				} else {
					clanMemberJoinDays[index] = 0;
				}
				if (version >= 6) {
					aBoolArray5607[index] = buffer.readUnsignedByte((byte) 17) == 1;
				} else {
					aBoolArray5607[index] = false;
				}
			}
			findClanOwner(-580325757);
		}
		if (banCount * -1789847393 > 0) {
			if (useUserHashes && (null == clanBanHashes || (clanBanHashes.length < -1789847393 * banCount))) {
				clanBanHashes = new long[-1789847393 * banCount];
			}
			if (useDisplayNames && (null == clanBanNames || clanBanNames.length < -1789847393 * banCount)) {
				clanBanNames = new String[banCount * -1789847393];
			}
			for (int index = 0; index < -1789847393 * banCount; index++) {
				if (useUserHashes) {
					clanBanHashes[index] = buffer.readLong((short) 11483);
				}
				if (useDisplayNames) {
					clanBanNames[index] = buffer.readNullString(1643956248);
				}
			}
		}
		if (version >= 3) {
			int count = buffer.readUnsignedShort(1162222719);
			if (count > 0) {
				varClanSettings = new HashTable(count < 16 ? Class480.method11001(count, (byte) -102) : 16);
				while (count-- > 0) {
					int hash = buffer.readInt((byte) 67);
					int key = hash & 0x3fffffff;
					int type = hash >>> 30;
					if (0 == type) {
						int value = buffer.readInt((byte) 94);
						varClanSettings.put(new IntegerNode(value), (long) key);
					} else if (1 == type) {
						long value = buffer.readLong((short) 598);
						varClanSettings.put(new LongNode(value), (long) key);
					} else if (2 == type) {
						String value = buffer.readString(8091305);
						varClanSettings.put(new ObjectNode(value), (long) key);
					}
				}
			}
		}
    }
    
    void method6685(int i) {
	if (useUserHashes) {
	    if (null != clanMemberHashes)
		System.arraycopy(clanMemberHashes, 0,
				 (clanMemberHashes
				  = new long[i]),
				 0, 1142036357 * memberCount);
	    else
		clanMemberHashes = new long[i];
	}
	if (useDisplayNames) {
	    if (clanMemberNames != null)
		System.arraycopy(clanMemberNames, 0,
				 clanMemberNames = new String[i], 0,
				 memberCount * 1142036357);
	    else
		clanMemberNames = new String[i];
	}
	if (null != clanMemberRanks)
	    System.arraycopy(clanMemberRanks, 0, clanMemberRanks = new byte[i],
			     0, memberCount * 1142036357);
	else
	    clanMemberRanks = new byte[i];
	if (null != clanMemberSettings)
	    System.arraycopy(clanMemberSettings, 0,
			     clanMemberSettings = new int[i], 0,
			     1142036357 * memberCount);
	else
	    clanMemberSettings = new int[i];
	if (null != clanMemberJoinDays)
	    System.arraycopy(clanMemberJoinDays, 0, clanMemberJoinDays = new int[i], 0,
			     memberCount * 1142036357);
	else
	    clanMemberJoinDays = new int[i];
	if (null != aBoolArray5607)
	    System.arraycopy(aBoolArray5607, 0,
			     aBoolArray5607 = new boolean[i], 0,
			     memberCount * 1142036357);
	else
	    aBoolArray5607 = new boolean[i];
    }
    
    void method6686(int i) {
	if (useUserHashes) {
	    if (null != clanMemberHashes)
		System.arraycopy(clanMemberHashes, 0,
				 (clanMemberHashes
				  = new long[i]),
				 0, 1142036357 * memberCount);
	    else
		clanMemberHashes = new long[i];
	}
	if (useDisplayNames) {
	    if (clanMemberNames != null)
		System.arraycopy(clanMemberNames, 0,
				 clanMemberNames = new String[i], 0,
				 memberCount * 1142036357);
	    else
		clanMemberNames = new String[i];
	}
	if (null != clanMemberRanks)
	    System.arraycopy(clanMemberRanks, 0, clanMemberRanks = new byte[i],
			     0, memberCount * 1142036357);
	else
	    clanMemberRanks = new byte[i];
	if (null != clanMemberSettings)
	    System.arraycopy(clanMemberSettings, 0,
			     clanMemberSettings = new int[i], 0,
			     1142036357 * memberCount);
	else
	    clanMemberSettings = new int[i];
	if (null != clanMemberJoinDays)
	    System.arraycopy(clanMemberJoinDays, 0, clanMemberJoinDays = new int[i], 0,
			     memberCount * 1142036357);
	else
	    clanMemberJoinDays = new int[i];
	if (null != aBoolArray5607)
	    System.arraycopy(aBoolArray5607, 0,
			     aBoolArray5607 = new boolean[i], 0,
			     memberCount * 1142036357);
	else
	    aBoolArray5607 = new boolean[i];
    }
    
    boolean method6687(int i, long l) {
	if (varClanSettings != null) {
	    Node class241
		= varClanSettings.get((long) i);
	    if (null != class241) {
		if (class241 instanceof LongNode) {
		    LongNode class241_sub28 = (LongNode) class241;
		    if (l == class241_sub28.longValue * -1969238413959512229L)
			return false;
		    class241_sub28.longValue = -6855925735381116717L * l;
		    return true;
		}
		class241.remove((byte) 36);
	    }
	} else
	    varClanSettings = new HashTable(4);
	varClanSettings.put(new LongNode(l),
						    (long) i);
	return true;
    }
    
    void method6688(int i) {
	if (useUserHashes) {
	    if (null != clanBanHashes)
		System.arraycopy(clanBanHashes, 0,
				 (clanBanHashes
				  = new long[i]),
				 0, banCount * -1789847393);
	    else
		clanBanHashes = new long[i];
	}
	if (useDisplayNames) {
	    if (null != clanBanNames)
		System.arraycopy(clanBanNames, 0,
				 clanBanNames = new String[i], 0,
				 banCount * -1789847393);
	    else
		clanBanNames = new String[i];
	}
    }
    
    void method6689(int i) {
	if (useUserHashes) {
	    if (null != clanBanHashes)
		System.arraycopy(clanBanHashes, 0,
				 (clanBanHashes
				  = new long[i]),
				 0, banCount * -1789847393);
	    else
		clanBanHashes = new long[i];
	}
	if (useDisplayNames) {
	    if (null != clanBanNames)
		System.arraycopy(clanBanNames, 0,
				 clanBanNames = new String[i], 0,
				 banCount * -1789847393);
	    else
		clanBanNames = new String[i];
	}
    }
    
    public int method6690(String string) {
	if (string == null || string.length() == 0)
	    return -1;
	for (int i = 0; i < 1142036357 * memberCount; i++) {
	    if (clanMemberNames[i].equals(string))
		return i;
	}
	return -1;
    }
    
    int method6691(int i, int i_49_, int i_50_, int i_51_) {
	int i_52_ = (1 << i_50_) - 1;
	int i_53_ = i_51_ == 31 ? -1 : (1 << 1 + i_51_) - 1;
	int i_54_ = i_53_ ^ i_52_;
	i_49_ <<= i_50_;
	i_49_ &= i_54_;
	int i_55_ = clanMemberSettings[i];
	if (i_49_ == (i_55_ & i_54_))
	    return -1;
	i_55_ &= i_54_ ^ 0xffffffff;
	clanMemberSettings[i] = i_55_ | i_49_;
	return i;
    }
    
    public Integer method6692(int i) {
	if (varClanSettings == null)
	    return null;
	Node class241
	    = varClanSettings.get((long) i);
	if (class241 == null || !(class241 instanceof IntegerNode))
	    return null;
	return new Integer(((IntegerNode) class241).intValue
			   * -1859754807);
    }
    
    public Integer method6693(int i) {
	if (varClanSettings == null)
	    return null;
	Node class241
	    = varClanSettings.get((long) i);
	if (class241 == null || !(class241 instanceof IntegerNode))
	    return null;
	return new Integer(((IntegerNode) class241).intValue
			   * -1859754807);
    }
    
    void method6694(long l, String string, int i) {
	if (null != string && string.length() == 0)
	    string = null;
	if (useUserHashes != l > 0L)
	    throw new RuntimeException("");
	if ((string != null) != useDisplayNames)
	    throw new RuntimeException("");
	if (l > 0L && (clanMemberHashes == null
		       || (1142036357 * memberCount
			   >= clanMemberHashes.length))
	    || (null != string
		&& (null == clanMemberNames
		    || memberCount * 1142036357 >= clanMemberNames.length)))
	    method6664(memberCount * 1142036357 + 5, (byte) -11);
	if (clanMemberHashes != null)
	    clanMemberHashes[1142036357 * memberCount] = l;
	if (clanMemberNames != null)
	    clanMemberNames[memberCount * 1142036357] = string;
	if (-1 == ownerSlot * -749252521) {
	    ownerSlot = 355663235 * memberCount;
	    clanMemberRanks[1142036357 * memberCount] = (byte) 126;
	} else
	    clanMemberRanks[memberCount * 1142036357] = (byte) 0;
	clanMemberSettings[memberCount * 1142036357] = 0;
	clanMemberJoinDays[memberCount * 1142036357] = i;
	aBoolArray5607[memberCount * 1142036357] = false;
	memberCount += 1687308621;
	anIntArray5604 = null;
    }
    
    public int[] method6695(int i) {
	if (null == anIntArray5604) {
	    String[] strings = new String[1142036357 * memberCount];
	    anIntArray5604 = new int[memberCount * 1142036357];
	    for (int i_56_ = 0; i_56_ < memberCount * 1142036357; i_56_++) {
		strings[i_56_] = clanMemberNames[i_56_];
		if (null != strings[i_56_])
		    strings[i_56_] = strings[i_56_].toLowerCase();
		anIntArray5604[i_56_] = i_56_;
	    }
	    Class464.method10707(strings, anIntArray5604,
				 575195529);
	}
	return anIntArray5604;
    }
    
    public Long method6696(int i) {
	if (null == varClanSettings)
	    return null;
	Node class241
	    = varClanSettings.get((long) i);
	if (null == class241 || !(class241 instanceof LongNode))
	    return null;
	return new Long(-1969238413959512229L
			* ((LongNode) class241).longValue);
    }
    
    public int[] method6697() {
	if (null == anIntArray5604) {
	    String[] strings = new String[1142036357 * memberCount];
	    anIntArray5604 = new int[memberCount * 1142036357];
	    for (int i = 0; i < memberCount * 1142036357; i++) {
		strings[i] = clanMemberNames[i];
		if (null != strings[i])
		    strings[i] = strings[i].toLowerCase();
		anIntArray5604[i] = i;
	    }
	    Class464.method10707(strings, anIntArray5604,
				 575195529);
	}
	return anIntArray5604;
    }
    
    void dummyMethod6698(long l, String string, int i) {
	if (null != string && string.length() == 0)
	    string = null;
	if (useUserHashes != l > 0L)
	    throw new RuntimeException("");
	if ((string != null) != useDisplayNames)
	    throw new RuntimeException("");
	if (l > 0L && (clanMemberHashes == null
		       || (1142036357 * memberCount
			   >= clanMemberHashes.length))
	    || (null != string
		&& (null == clanMemberNames
		    || memberCount * 1142036357 >= clanMemberNames.length)))
	    method6664(memberCount * 1142036357 + 5, (byte) -97);
	if (clanMemberHashes != null)
	    clanMemberHashes[1142036357 * memberCount] = l;
	if (clanMemberNames != null)
	    clanMemberNames[memberCount * 1142036357] = string;
	if (-1 == ownerSlot * -749252521) {
	    ownerSlot = 355663235 * memberCount;
	    clanMemberRanks[1142036357 * memberCount] = (byte) 126;
	} else
	    clanMemberRanks[memberCount * 1142036357] = (byte) 0;
	clanMemberSettings[memberCount * 1142036357] = 0;
	clanMemberJoinDays[memberCount * 1142036357] = i;
	aBoolArray5607[memberCount * 1142036357] = false;
	memberCount += 1687308621;
	anIntArray5604 = null;
    }
    
    public ClanSettings(RSByteBuffer buffer) {
		clanName = null;
		anInt5595 = 0;
		ownerSlot = 1420387481;
		replacementOwnerSlot = -39210433;
		decode(buffer, 1482319719);
    }
    
    boolean setVarValueString/*method6699*/(int key, String value, int i_57_) {
		if (value == null) {
			value = "";
		} else if (value.length() > 80) {
			value = value.substring(0, 80);
		}
		if (varClanSettings != null) {
			Node node = varClanSettings.get((long) key);
			if (null != node) {
				if (node instanceof ObjectNode) {
					ObjectNode objNode = (ObjectNode) node;
					if (objNode.objectValue instanceof String) {
						if (value.equals(objNode.objectValue)) {
							return false;
						}
						objNode.remove((byte) 36);
						varClanSettings.put(new ObjectNode(value), 4356572401218184725L * objNode.hashCode);
						return true;
					}
				}
				node.remove((byte) 36);
			}
		} else {
			varClanSettings = new HashTable(4);
		}
		varClanSettings.put(new ObjectNode(value), (long) key);
		return true;
    }
    
    void method6700(int i) {
	if (i < 0 || i >= 1142036357 * memberCount)
	    throw new RuntimeException("");
	memberCount -= 1687308621;
	anIntArray5604 = null;
	if (memberCount * 1142036357 == 0) {
	    clanMemberHashes = null;
	    clanMemberNames = null;
	    clanMemberRanks = null;
	    clanMemberSettings = null;
	    clanMemberJoinDays = null;
	    aBoolArray5607 = null;
	    ownerSlot = 1420387481;
	    replacementOwnerSlot = -39210433;
	} else {
	    System.arraycopy(clanMemberRanks, 1 + i, clanMemberRanks, i,
			     memberCount * 1142036357 - i);
	    System.arraycopy(clanMemberSettings, 1 + i,
			     clanMemberSettings, i,
			     memberCount * 1142036357 - i);
	    System.arraycopy(clanMemberJoinDays, 1 + i, clanMemberJoinDays, i,
			     memberCount * 1142036357 - i);
	    System.arraycopy(aBoolArray5607, 1 + i, aBoolArray5607, i,
			     memberCount * 1142036357 - i);
	    if (clanMemberHashes != null)
		System.arraycopy(clanMemberHashes, i + 1,
				 clanMemberHashes, i,
				 memberCount * 1142036357 - i);
	    if (clanMemberNames != null)
		System.arraycopy(clanMemberNames, i + 1, clanMemberNames, i,
				 1142036357 * memberCount - i);
	    findClanOwner(-2024219165);
	}
    }
    
    void method6701(int i) {
	if (i < 0 || i >= 1142036357 * memberCount)
	    throw new RuntimeException("");
	memberCount -= 1687308621;
	anIntArray5604 = null;
	if (memberCount * 1142036357 == 0) {
	    clanMemberHashes = null;
	    clanMemberNames = null;
	    clanMemberRanks = null;
	    clanMemberSettings = null;
	    clanMemberJoinDays = null;
	    aBoolArray5607 = null;
	    ownerSlot = 1420387481;
	    replacementOwnerSlot = -39210433;
	} else {
	    System.arraycopy(clanMemberRanks, 1 + i, clanMemberRanks, i,
			     memberCount * 1142036357 - i);
	    System.arraycopy(clanMemberSettings, 1 + i,
			     clanMemberSettings, i,
			     memberCount * 1142036357 - i);
	    System.arraycopy(clanMemberJoinDays, 1 + i, clanMemberJoinDays, i,
			     memberCount * 1142036357 - i);
	    System.arraycopy(aBoolArray5607, 1 + i, aBoolArray5607, i,
			     memberCount * 1142036357 - i);
	    if (clanMemberHashes != null)
		System.arraycopy(clanMemberHashes, i + 1,
				 clanMemberHashes, i,
				 memberCount * 1142036357 - i);
	    if (clanMemberNames != null)
		System.arraycopy(clanMemberNames, i + 1, clanMemberNames, i,
				 1142036357 * memberCount - i);
	    findClanOwner(-1694768615);
	}
    }
    
    void method6702(long l, String string) {
	if (null != string && string.length() == 0)
	    string = null;
	if (useUserHashes != l > 0L)
	    throw new RuntimeException("");
	if (useDisplayNames != (string != null))
	    throw new RuntimeException("");
	if (l > 0L && (clanBanHashes == null
		       || (-1789847393 * banCount
			   >= clanBanHashes.length))
	    || (null != string
		&& (null == clanBanNames
		    || -1789847393 * banCount >= clanBanNames.length)))
	    resizeBans(banCount * -1789847393 + 5, (byte) 65);
	if (clanBanHashes != null)
	    clanBanHashes[-1789847393 * banCount] = l;
	if (null != clanBanNames)
	    clanBanNames[-1789847393 * banCount] = string;
	banCount += -1851653281;
    }
    
    void method6703(long l, String string) {
	if (null != string && string.length() == 0)
	    string = null;
	if (useUserHashes != l > 0L)
	    throw new RuntimeException("");
	if (useDisplayNames != (string != null))
	    throw new RuntimeException("");
	if (l > 0L && (clanBanHashes == null
		       || (-1789847393 * banCount
			   >= clanBanHashes.length))
	    || (null != string
		&& (null == clanBanNames
		    || -1789847393 * banCount >= clanBanNames.length)))
	    resizeBans(banCount * -1789847393 + 5, (byte) 64);
	if (clanBanHashes != null)
	    clanBanHashes[-1789847393 * banCount] = l;
	if (null != clanBanNames)
	    clanBanNames[-1789847393 * banCount] = string;
	banCount += -1851653281;
    }
    
    void method6704(int i) {
	banCount -= -1851653281;
	if (banCount * -1789847393 == 0) {
	    clanBanHashes = null;
	    clanBanNames = null;
	} else {
	    if (clanBanHashes != null)
			System.arraycopy(clanBanHashes, i + 1, clanBanHashes, i, banCount * -1789847393 - i);
	    if (clanBanNames != null)
			System.arraycopy(clanBanNames, 1 + i, clanBanNames, i, banCount * -1789847393 - i);
	}
    }
    
    public Long method6705(int i, byte i_58_) {
	if (null == varClanSettings)
	    return null;
	Node class241
	    = varClanSettings.get((long) i);
	if (null == class241 || !(class241 instanceof LongNode))
	    return null;
	return new Long(-1969238413959512229L
			* ((LongNode) class241).longValue);
    }
    
    void method6706(int i) {
	banCount -= -1851653281;
	if (banCount * -1789847393 == 0) {
	    clanBanHashes = null;
	    clanBanNames = null;
	} else {
	    if (clanBanHashes != null)
		System.arraycopy(clanBanHashes, i + 1,
				 clanBanHashes, i,
				 banCount * -1789847393 - i);
	    if (clanBanNames != null)
		System.arraycopy(clanBanNames, 1 + i, clanBanNames, i,
				 banCount * -1789847393 - i);
	}
    }
    
    int method6707(int i, boolean bool) {
	if (bool == aBoolArray5607[i])
	    return -1;
	aBoolArray5607[i] = bool;
	return i;
    }
    
    int method6708(int i, boolean bool) {
	if (bool == aBoolArray5607[i])
	    return -1;
	aBoolArray5607[i] = bool;
	return i;
    }
    
    int method6709(int i, boolean bool) {
	if (bool == aBoolArray5607[i])
	    return -1;
	aBoolArray5607[i] = bool;
	return i;
    }
    
    public int method6710(int i, int i_59_, int i_60_) {
	int i_61_ = i_60_ == 31 ? -1 : (1 << 1 + i_60_) - 1;
	return (clanMemberSettings[i] & i_61_) >>> i_59_;
    }
    
    boolean method6711(int i, int i_62_, int i_63_, int i_64_) {
	int i_65_ = (1 << i_63_) - 1;
	int i_66_ = 31 == i_64_ ? -1 : (1 << 1 + i_64_) - 1;
	int i_67_ = i_66_ ^ i_65_;
	i_62_ <<= i_63_;
	i_62_ &= i_67_;
	if (varClanSettings != null) {
	    Node class241
		= varClanSettings.get((long) i);
	    if (null != class241) {
		if (class241 instanceof IntegerNode) {
		    IntegerNode class241_sub22 = (IntegerNode) class241;
		    if (i_62_
			== (class241_sub22.intValue * -1859754807 & i_67_))
			return false;
		    IntegerNode class241_sub22_68_;
		    (class241_sub22_68_ = class241_sub22).intValue
			= (1144452473
			   * (class241_sub22_68_.intValue * -1859754807
			      & (i_67_ ^ 0xffffffff)));
		    IntegerNode class241_sub22_69_;
		    (class241_sub22_69_ = class241_sub22).intValue
			= ((-1859754807 * class241_sub22_69_.intValue | i_62_)
			   * 1144452473);
		    return true;
		}
		class241.remove((byte) 36);
	    }
	} else
	    varClanSettings = new HashTable(4);
	varClanSettings.put(new IntegerNode(i_62_),
						    (long) i);
	return true;
    }
    
    boolean setVarValueLong/*method6712*/(int key, long value) {
		if (varClanSettings != null) {
			Node node = varClanSettings.get((long) key);
			if (null != node) {
				if (node instanceof LongNode) {
					LongNode longNode = (LongNode) node;
					if (value == longNode.longValue * -1969238413959512229L) {
						return false;
					}
					longNode.longValue = -6855925735381116717L * value;
					return true;
				}
				node.remove((byte) 36);
			}
		} else {
			varClanSettings = new HashTable(4);
		}
		varClanSettings.put(new LongNode(value), (long) key);
		return true;
    }
    
    public int method6713(String string) {
	if (string == null || string.length() == 0)
	    return -1;
	for (int i = 0; i < 1142036357 * memberCount; i++) {
	    if (clanMemberNames[i].equals(string))
		return i;
	}
	return -1;
    }
    
    boolean method6714(int i, long l) {
	if (varClanSettings != null) {
	    Node class241
		= varClanSettings.get((long) i);
	    if (null != class241) {
		if (class241 instanceof LongNode) {
		    LongNode class241_sub28 = (LongNode) class241;
		    if (l == class241_sub28.longValue * -1969238413959512229L)
				return false;
		    class241_sub28.longValue = -6855925735381116717L * l;
		    return true;
		}
		class241.remove((byte) 36);
	    }
	} else
	    varClanSettings = new HashTable(4);
	varClanSettings.put(new LongNode(l),
						    (long) i);
	return true;
    }
    
    void dummyMethod6715(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) 8);
	if (i < 1 || i > 6)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i).toString());
	int i_70_ = class241_sub3.readUnsignedByte((byte) -21);
	if (0 != (i_70_ & 0x1))
	    useUserHashes = true;
	if ((i_70_ & 0x2) != 0)
	    useDisplayNames = true;
	if (!useUserHashes) {
	    clanMemberHashes = null;
	    clanBanHashes = null;
	}
	if (!useDisplayNames) {
	    clanMemberNames = null;
	    clanBanNames = null;
	}
	updateNum
	    = class241_sub3.readInt((byte) 99) * 1849657783;
	anInt5595
	    = class241_sub3.readInt((byte) 115) * 1287581383;
	if (i <= 3 && 0 != 1341485815 * anInt5595)
	    anInt5595 += 1237218144;
	memberCount = class241_sub3.readUnsignedShort(1162222719) * 1687308621;
	banCount = class241_sub3.readUnsignedByte((byte) 53) * -1851653281;
	clanName = class241_sub3.readString(1841234217);
	if (i >= 4)
	    class241_sub3.readInt((byte) 118);
	allowNonMembers = class241_sub3.readUnsignedByte((byte) 53) == 1;
	rankTalk = class241_sub3.getByte(-698494986);
	rankKick = class241_sub3.getByte(378880290);
	rankLootShare = class241_sub3.getByte(585519260);
	aByte5600 = class241_sub3.getByte(-1263826817);
	if (1142036357 * memberCount > 0) {
	    if (useUserHashes
		&& (null == clanMemberHashes
		    || (clanMemberHashes.length
			< memberCount * 1142036357)))
			clanMemberHashes = new long[1142036357 * memberCount];
	    if (useDisplayNames && (clanMemberNames == null || clanMemberNames.length < 1142036357 * memberCount))
			clanMemberNames = new String[memberCount * 1142036357];
	    if (clanMemberRanks == null || clanMemberRanks.length < memberCount * 1142036357)
			clanMemberRanks = new byte[memberCount * 1142036357];
	    if (clanMemberSettings == null
		|| (clanMemberSettings.length
		    < 1142036357 * memberCount))
			clanMemberSettings = new int[memberCount * 1142036357];
	    if (null == clanMemberJoinDays || clanMemberJoinDays.length < 1142036357 * memberCount)
			clanMemberJoinDays = new int[1142036357 * memberCount];
	    if (aBoolArray5607 == null || aBoolArray5607.length < memberCount * 1142036357)
			aBoolArray5607 = new boolean[1142036357 * memberCount];
	    for (int i_71_ = 0; i_71_ < memberCount * 1142036357; i_71_++) {
			if (useUserHashes)
				clanMemberHashes[i_71_] = class241_sub3.readLong((short) 27096);
			if (useDisplayNames) 
				clanMemberNames[i_71_] = class241_sub3.readNullString(609181800);
		clanMemberRanks[i_71_] = class241_sub3.getByte(-642724425);
		if (i >= 2)
		    clanMemberSettings[i_71_]
			= class241_sub3.readInt((byte) 36);
		if (i >= 5)
		    clanMemberJoinDays[i_71_]
			= class241_sub3.readUnsignedShort(1162222719);
		else
		    clanMemberJoinDays[i_71_] = 0;
		if (i >= 6)
		    aBoolArray5607[i_71_]
			= class241_sub3.readUnsignedByte((byte) 67) == 1;
		else
		    aBoolArray5607[i_71_] = false;
	    }
	    findClanOwner(-1973115866);
	}
	if (banCount * -1789847393 > 0) {
	    if (useUserHashes
		&& (null == clanBanHashes
		    || (clanBanHashes.length
			< -1789847393 * banCount)))
		clanBanHashes
		    = new long[-1789847393 * banCount];
	    if (useDisplayNames
		&& (null == clanBanNames
		    || clanBanNames.length < -1789847393 * banCount))
		clanBanNames = new String[banCount * -1789847393];
	    for (int i_72_ = 0; i_72_ < -1789847393 * banCount; i_72_++) {
		if (useUserHashes)
		    clanBanHashes[i_72_]
			= class241_sub3.readLong((short) 6214);
		if (useDisplayNames)
		    clanBanNames[i_72_]
			= class241_sub3.readNullString(906740430);
	    }
	}
	if (i >= 3) {
	    int i_73_ = class241_sub3.readUnsignedShort(1162222719);
	    if (i_73_ > 0) {
		varClanSettings
		    = new HashTable(i_73_ < 16
				   ? Class480.method11001(i_73_, (byte) -55)
				   : 16);
		while (i_73_-- > 0) {
		    int i_74_ = class241_sub3.readInt((byte) 19);
		    int i_75_ = i_74_ & 0x3fffffff;
		    int i_76_ = i_74_ >>> 30;
		    if (0 == i_76_) {
			int i_77_ = class241_sub3.readInt((byte) 4);
			varClanSettings.put
			    (new IntegerNode(i_77_), (long) i_75_);
		    } else if (1 == i_76_) {
			long l = class241_sub3.readLong((short) 9561);
			varClanSettings
			    .put(new LongNode(l), (long) i_75_);
		    } else if (2 == i_76_) {
			String string = class241_sub3.readString(2109867181);
			varClanSettings.put
			    (new ObjectNode(string), (long) i_75_);
		    }
		}
	    }
	}
    }
    
    public static final void method6716(int i, String string, Color color,
					Color color_78_, Color color_79_,
					int i_80_) {
	try {
	    Graphics graphics = Class344.canvas.getGraphics();
	    if (ClanChannelDelta.aFont5696 == null) {
			ClanChannelDelta.aFont5696 = new Font("Helvetica", 1, 13);
		}
	    if (color == null) {
			color = new Color(140, 17, 17);
		}
	    if (null == color_78_)
			color_78_ = new Color(140, 17, 17);
	    if (null == color_79_)
			color_79_ = new Color(255, 255, 255);
	    try {
		if (Class357.anImage5467 == null)
		    Class357.anImage5467
			= Class344.canvas.createImage((-1080559003
							    * (Class494
							       .canvasWid)),
							   (Class67.canvasHei
							    * 963058943));
		Graphics graphics_81_ = Class357.anImage5467.getGraphics();
		graphics_81_.setColor(Color.black);
		graphics_81_.fillRect(0, 0, -1080559003 * Class494.canvasWid,
				      Class67.canvasHei * 963058943);
		int i_82_ = Class494.canvasWid * -1080559003 / 2 - 152;
		int i_83_ = Class67.canvasHei * 963058943 / 2 - 18;
		graphics_81_.setColor(color_78_);
		graphics_81_.drawRect(i_82_, i_83_, 303, 33);
		graphics_81_.setColor(color);
		graphics_81_.fillRect(i_82_ + 2, 2 + i_83_, 3 * i, 30);
		graphics_81_.setColor(Color.black);
		graphics_81_.drawRect(1 + i_82_, 1 + i_83_, 301, 31);
		graphics_81_.fillRect(3 * i + (i_82_ + 2), 2 + i_83_,
				      300 - 3 * i, 30);
		graphics_81_.setFont(ClanChannelDelta.aFont5696);
		graphics_81_.setColor(color_79_);
		graphics_81_.drawString(string,
					(i_82_
					 + (304 - string.length() * 6) / 2),
					i_83_ + 22);
		if (null != GameShell3.aString7642) {
		    graphics_81_.setFont(ClanChannelDelta.aFont5696);
		    graphics_81_.setColor(color_79_);
		    graphics_81_.drawString
			(GameShell3.aString7642,
			 (Class494.canvasWid * -1080559003 / 2
			  - GameShell3.aString7642.length() * 6 / 2),
			 963058943 * Class67.canvasHei / 2 - 26);
		}
		graphics.drawImage(Class357.anImage5467, 0, 0, null);
	    } catch (Exception exception) {
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, Class494.canvasWid * -1080559003,
				  963058943 * Class67.canvasHei);
		int i_84_ = Class494.canvasWid * -1080559003 / 2 - 152;
		int i_85_ = Class67.canvasHei * 963058943 / 2 - 18;
		graphics.setColor(color_78_);
		graphics.drawRect(i_84_, i_85_, 303, 33);
		graphics.setColor(color);
		graphics.fillRect(i_84_ + 2, 2 + i_85_, i * 3, 30);
		graphics.setColor(Color.black);
		graphics.drawRect(i_84_ + 1, 1 + i_85_, 301, 31);
		graphics.fillRect(i_84_ + 2 + i * 3, i_85_ + 2, 300 - 3 * i,
				  30);
		graphics.setFont(ClanChannelDelta.aFont5696);
		graphics.setColor(color_79_);
		if (null != GameShell3.aString7642) {
		    graphics.setFont(ClanChannelDelta.aFont5696);
		    graphics.setColor(color_79_);
		    graphics.drawString(GameShell3.aString7642,
					(-1080559003 * Class494.canvasWid / 2
					 - (GameShell3.aString7642.length() * 6
					    / 2)),
					(963058943 * Class67.canvasHei / 2
					 - 26));
		}
		graphics.drawString(string,
				    i_84_ + (304 - string.length() * 6) / 2,
				    i_85_ + 22);
	    }
	} catch (Exception exception) {
	    Class344.canvas.repaint();
	}
    }
    
    static final void method6717(ClientScriptData class454, int i) {
	int i_86_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_86_, (byte) -37);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_86_ >> 16];
	Class92.method2070(class58, class35, class454, (byte) 1);
    }
    
    public static boolean method6718(int i, String string, byte i_87_) {
	Class193.aClass397_2297 = new Server();
	Class193.aClass397_2297.nodeID = 1167304829 * i;
	Class193.aClass397_2297.aString5786 = string;
	if (Class470.aClass470_6345 != Class416.aClass470_6012) {
	    Class193.aClass397_2297.anInt5790
		= 1350095168 + 170709369 * Class193.aClass397_2297.nodeID;
	    Class193.aClass397_2297.anInt5788
		= -147867408 + Class193.aClass397_2297.nodeID * 170297199;
	}
	return true;
    }
    
    static void method6719(int i, int i_88_) {
	Class192.anInt2296 = -428892149 * i;
	Class192.aClass129_2295.reset(-996955946);
    }
}
