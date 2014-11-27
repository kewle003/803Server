/* Class513 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config.defaults;
public class GraphicsDefaults {
    static final int DEFAULT_MAXHITMARKS = 4;//anInt6701
    public int maxhitmarks = -1880891020;//anInt6702
    public int[] hitmarkpos_x = null;//anIntArray6703
    public int[] hitmarkpos_y = null;//anIntArray6704
    static final int anInt6705 = 4;
    public int lobby_interface;//anInt6706
    public int anInt6707;
    public int anInt6708;
    static final int anInt6709 = 7;
    public int anInt6710;
    public int anInt6711;
    public int login_interface;//anInt6712
    public byte aByte6713;
    public boolean aBool6714;
    public short[][][] aShortArrayArrayArray6715;
    static final int anInt6716 = 4;
    public int anInt6717;
    public short[][] aShortArrayArray6718;
    public short aShort6719;
    public boolean npcShouldDisplayChat;//aBool6720
    public int npcChatTimeout;//anInt6721
    public boolean playerShouldDisplayChat;//aBool6722
    public int playerChatTimeout;//anInt6723
    public int anInt6724;
    public int anInt6725;
    public boolean aBool6726;
    public int anInt6727 = -681377460;
    public int anInt6728;
    public int anInt6729;
    
    void method11562(RSByteBuffer class241_sub3) {
	boolean bool = false;
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 17);
	    if (0 == i)
		break;
	    if (i == 1) {
		if (hitmarkpos_x == null) {
		    maxhitmarks = -1880891020;
		    hitmarkpos_x = new int[4];
		    hitmarkpos_y = new int[4];
		}
		for (int i_0_ = 0; i_0_ < hitmarkpos_x.length; i_0_++) {
		    hitmarkpos_x[i_0_]
			= class241_sub3.readShort((byte) 43);
		    hitmarkpos_y[i_0_]
			= class241_sub3.readShort((byte) 116);
		}
		bool = true;
	    } else if (i == 2) {
	    	anInt6711 = class241_sub3.readBigSmart((byte) -68) * 1500173013;
	    } else if (i == 3) {
			maxhitmarks = class241_sub3.readUnsignedByte((byte) 54) * -1543964579;
			hitmarkpos_x = new int[maxhitmarks * 941792245];
			hitmarkpos_y = new int[maxhitmarks * 941792245];
	    } else if (i == 4)
	    	aBool6714 = false;
	    else if (5 == i)
	    	login_interface = class241_sub3.readTriByte(1771646547) * 405162333;
	    else if (6 == i)
	    	lobby_interface = class241_sub3.readTriByte(1771646547) * 1664920469;
	    else if (7 == i) {
		aShortArrayArray6718 = new short[10][4];
		aShortArrayArrayArray6715 = new short[10][4][];
		for (int i_1_ = 0; i_1_ < 10; i_1_++) {
		    for (int i_2_ = 0; i_2_ < 4; i_2_++) {
			int i_3_ = class241_sub3.readUnsignedShort(1162222719);
			if (i_3_ == 65535)
			    i_3_ = -1;
			aShortArrayArray6718[i_1_][i_2_] = (short) i_3_;
			int i_4_ = class241_sub3.readUnsignedShort(1162222719);
			aShortArrayArrayArray6715[i_1_][i_2_]
			    = new short[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
			    int i_6_ = class241_sub3.readUnsignedShort(1162222719);
			    if (i_6_ == 65535)
				i_6_ = -1;
			    aShortArrayArrayArray6715[i_1_][i_2_][i_5_]
				= (short) i_6_;
			}
		    }
		}
	    } else if (8 == i)
		npcShouldDisplayChat = false;
	    else if (i == 9)
		npcChatTimeout = class241_sub3.readUnsignedByte((byte) -36) * 1058193119;
	    else if (i == 10)
		playerShouldDisplayChat = false;
	    else if (i == 11)
		playerChatTimeout = class241_sub3.readUnsignedByte((byte) 39) * 1598752551;
	    else if (12 == i) {
		anInt6725
		    = class241_sub3.readUnsignedShort(1162222719) * -1723109209;
		anInt6707 = class241_sub3.readUnsignedShort(1162222719) * 1496098845;
	    } else if (i == 13)
		anInt6708 = class241_sub3.readUnsignedByte((byte) -93) * 150172513;
	    else if (i == 14)
		anInt6727 = class241_sub3.readUnsignedByte((byte) 8) * -1244086189;
	    else if (i == 15)
		anInt6710 = class241_sub3.readUnsignedByte((byte) -12) * 1537012761;
	    else if (i == 16)
		aBool6726 = true;
	    else if (17 == i)
		anInt6724 = class241_sub3.readInt((byte) 93) * -1124278773;
	    else if (18 == i)
		anInt6728 = class241_sub3.readInt((byte) 18) * 1383885177;
	    else if (19 == i)
		anInt6729
		    = class241_sub3.readInt((byte) 115) * -1355524067;
	    else if (i == 20) {
		aShort6719 = (short) class241_sub3.readUnsignedShort(1162222719);
		aByte6713 = (byte) class241_sub3.readUnsignedByte((byte) -60);
	    } else if (i == 21)
		anInt6717 = class241_sub3.readUnsignedByte((byte) 25) * 654367103;
	}
	if (!bool) {
	    if (hitmarkpos_x == null) {
		maxhitmarks = -1880891020;
		hitmarkpos_x = new int[4];
		hitmarkpos_y = new int[4];
	    }
	    for (int i = 0; i < hitmarkpos_x.length; i++) {
		hitmarkpos_x[i] = 0;
		hitmarkpos_y[i] = 20 * i;
	    }
	}
    }
    
    void decode/*method11563*/(RSByteBuffer buffer, int i) {
		boolean bool = false;
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) 44);
		    if (0 == opcode) {
		    	break;
		    }
		    if (opcode == 1) {
				if (hitmarkpos_x == null) {
				    maxhitmarks = -1880891020;
				    hitmarkpos_x = new int[4];
				    hitmarkpos_y = new int[4];
				}
				for (int index = 0; index < hitmarkpos_x.length; index++) {
				    hitmarkpos_x[index] = buffer.readShort((byte) 82);
				    hitmarkpos_y[index] = buffer.readShort((byte) 118);
				}
				bool = true;
		    } else if (opcode == 2) {
		    	anInt6711 = buffer.readBigSmart((byte) 7) * 1500173013;
		    } else if (opcode == 3) {
				maxhitmarks = buffer.readUnsignedByte((byte) -53) * -1543964579;
				hitmarkpos_x = new int[maxhitmarks * 941792245];
				hitmarkpos_y = new int[maxhitmarks * 941792245];
		    } else if (opcode == 4) {
		    	aBool6714 = false;
		    } else if (5 == opcode) {
		    	login_interface = buffer.readTriByte(1771646547) * 405162333;
		    } else if (6 == opcode) {
		    	lobby_interface = buffer.readTriByte(1771646547) * 1664920469;
		    } else if (7 == opcode) {
				aShortArrayArray6718 = new short[10][4];
				aShortArrayArrayArray6715 = new short[10][4][];
				for (int i_9_ = 0; i_9_ < 10; i_9_++) {
				    for (int i_10_ = 0; i_10_ < 4; i_10_++) {
						int i_11_ = buffer.readUnsignedShort(1162222719);
						if (i_11_ == 65535) {
						    i_11_ = -1;
						}
						aShortArrayArray6718[i_9_][i_10_] = (short) i_11_;
						int i_12_ = buffer.readUnsignedShort(1162222719);
						aShortArrayArrayArray6715[i_9_][i_10_] = new short[i_12_];
						for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
						    int i_14_ = buffer.readUnsignedShort(1162222719);
						    if (i_14_ == 65535) {
						    	i_14_ = -1;
						    }
						    aShortArrayArrayArray6715[i_9_][i_10_][i_13_] = (short) i_14_;
						}
				    }
				}
		    } else if (8 == opcode) {
		    	npcShouldDisplayChat = false;
		    } else if (opcode == 9) {
		    	npcChatTimeout = buffer.readUnsignedByte((byte) -36) * 1058193119;
		    } else if (opcode == 10) {
		    	playerShouldDisplayChat = false;
		    } else if (opcode == 11) {
		    	playerChatTimeout = buffer.readUnsignedByte((byte) -12) * 1598752551;
		    } else if (12 == opcode) {
				anInt6725 = buffer.readUnsignedShort(1162222719) * -1723109209;
				anInt6707 = buffer.readUnsignedShort(1162222719) * 1496098845;
		    } else if (opcode == 13) {
		    	anInt6708 = buffer.readUnsignedByte((byte) 46) * 150172513;
		    } else if (opcode == 14) {
		    	anInt6727 = buffer.readUnsignedByte((byte) -38) * -1244086189;
		    } else if (opcode == 15) {
		    	anInt6710 = buffer.readUnsignedByte((byte) 34) * 1537012761;
		    } else if (opcode == 16) {
		    	aBool6726 = true;
		    } else if (17 == opcode) {
		    	anInt6724 = buffer.readInt((byte) 36) * -1124278773;
		    } else if (18 == opcode) {
		    	anInt6728 = buffer.readInt((byte) 107) * 1383885177;
		    } else if (19 == opcode) {
		    	anInt6729 = buffer.readInt((byte) 120) * -1355524067;
		    } else if (opcode == 20) {
				aShort6719 = (short) buffer.readUnsignedShort(1162222719);
				aByte6713 = (byte) buffer.readUnsignedByte((byte) -37);
		    } else if (opcode == 21) {
		    	anInt6717 = buffer.readUnsignedByte((byte) 56) * 654367103;
		    }
		}
		if (!bool) {
		    if (hitmarkpos_x == null) {
				maxhitmarks = -1880891020;
				hitmarkpos_x = new int[4];
				hitmarkpos_y = new int[4];
		    }
		    for (int i_15_ = 0; i_15_ < hitmarkpos_x.length; i_15_++) {
				hitmarkpos_x[i_15_] = 0;
				hitmarkpos_y[i_15_] = 20 * i_15_;
		    }
		}
    }
    
    void method11564(RSByteBuffer class241_sub3) {
	boolean bool = false;
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -18);
	    if (0 == i)
		break;
	    if (i == 1) {
		if (hitmarkpos_x == null) {
		    maxhitmarks = -1880891020;
		    hitmarkpos_x = new int[4];
		    hitmarkpos_y = new int[4];
		}
		for (int i_16_ = 0; i_16_ < hitmarkpos_x.length; i_16_++) {
		    hitmarkpos_x[i_16_]
			= class241_sub3.readShort((byte) 48);
		    hitmarkpos_y[i_16_]
			= class241_sub3.readShort((byte) 77);
		}
		bool = true;
	    } else if (i == 2)
		anInt6711 = class241_sub3.readBigSmart((byte) 15) * 1500173013;
	    else if (i == 3) {
		maxhitmarks = class241_sub3.readUnsignedByte((byte) 52) * -1543964579;
		hitmarkpos_x = new int[maxhitmarks * 941792245];
		hitmarkpos_y = new int[maxhitmarks * 941792245];
	    } else if (i == 4)
		aBool6714 = false;
	    else if (5 == i)
		login_interface = class241_sub3.readTriByte(1771646547) * 405162333;
	    else if (6 == i)
		lobby_interface = class241_sub3.readTriByte(1771646547) * 1664920469;
	    else if (7 == i) {
		aShortArrayArray6718 = new short[10][4];
		aShortArrayArrayArray6715 = new short[10][4][];
		for (int i_17_ = 0; i_17_ < 10; i_17_++) {
		    for (int i_18_ = 0; i_18_ < 4; i_18_++) {
			int i_19_ = class241_sub3.readUnsignedShort(1162222719);
			if (i_19_ == 65535)
			    i_19_ = -1;
			aShortArrayArray6718[i_17_][i_18_] = (short) i_19_;
			int i_20_ = class241_sub3.readUnsignedShort(1162222719);
			aShortArrayArrayArray6715[i_17_][i_18_]
			    = new short[i_20_];
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
			    int i_22_ = class241_sub3.readUnsignedShort(1162222719);
			    if (i_22_ == 65535)
				i_22_ = -1;
			    aShortArrayArrayArray6715[i_17_][i_18_][i_21_]
				= (short) i_22_;
			}
		    }
		}
	    } else if (8 == i)
		npcShouldDisplayChat = false;
	    else if (i == 9)
		npcChatTimeout = class241_sub3.readUnsignedByte((byte) 32) * 1058193119;
	    else if (i == 10)
		playerShouldDisplayChat = false;
	    else if (i == 11)
		playerChatTimeout = class241_sub3.readUnsignedByte((byte) 76) * 1598752551;
	    else if (12 == i) {
		anInt6725
		    = class241_sub3.readUnsignedShort(1162222719) * -1723109209;
		anInt6707 = class241_sub3.readUnsignedShort(1162222719) * 1496098845;
	    } else if (i == 13)
		anInt6708 = class241_sub3.readUnsignedByte((byte) 24) * 150172513;
	    else if (i == 14)
		anInt6727
		    = class241_sub3.readUnsignedByte((byte) -41) * -1244086189;
	    else if (i == 15)
		anInt6710 = class241_sub3.readUnsignedByte((byte) -18) * 1537012761;
	    else if (i == 16)
		aBool6726 = true;
	    else if (17 == i)
		anInt6724 = class241_sub3.readInt((byte) 43) * -1124278773;
	    else if (18 == i)
		anInt6728 = class241_sub3.readInt((byte) 58) * 1383885177;
	    else if (19 == i)
		anInt6729 = class241_sub3.readInt((byte) 51) * -1355524067;
	    else if (i == 20) {
		aShort6719 = (short) class241_sub3.readUnsignedShort(1162222719);
		aByte6713 = (byte) class241_sub3.readUnsignedByte((byte) -3);
	    } else if (i == 21)
		anInt6717 = class241_sub3.readUnsignedByte((byte) 74) * 654367103;
	}
	if (!bool) {
	    if (hitmarkpos_x == null) {
		maxhitmarks = -1880891020;
		hitmarkpos_x = new int[4];
		hitmarkpos_y = new int[4];
	    }
	    for (int i = 0; i < hitmarkpos_x.length; i++) {
		hitmarkpos_x[i] = 0;
		hitmarkpos_y[i] = 20 * i;
	    }
	}
    }
    
    void method11565(RSByteBuffer class241_sub3) {
	boolean bool = false;
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -93);
	    if (0 == i)
		break;
	    if (i == 1) {
		if (hitmarkpos_x == null) {
		    maxhitmarks = -1880891020;
		    hitmarkpos_x = new int[4];
		    hitmarkpos_y = new int[4];
		}
		for (int i_23_ = 0; i_23_ < hitmarkpos_x.length; i_23_++) {
		    hitmarkpos_x[i_23_]
			= class241_sub3.readShort((byte) 115);
		    hitmarkpos_y[i_23_]
			= class241_sub3.readShort((byte) 49);
		}
		bool = true;
	    } else if (i == 2)
		anInt6711 = class241_sub3.readBigSmart((byte) -20) * 1500173013;
	    else if (i == 3) {
		maxhitmarks = class241_sub3.readUnsignedByte((byte) 96) * -1543964579;
		hitmarkpos_x = new int[maxhitmarks * 941792245];
		hitmarkpos_y = new int[maxhitmarks * 941792245];
	    } else if (i == 4)
		aBool6714 = false;
	    else if (5 == i)
		login_interface = class241_sub3.readTriByte(1771646547) * 405162333;
	    else if (6 == i)
		lobby_interface = class241_sub3.readTriByte(1771646547) * 1664920469;
	    else if (7 == i) {
		aShortArrayArray6718 = new short[10][4];
		aShortArrayArrayArray6715 = new short[10][4][];
		for (int i_24_ = 0; i_24_ < 10; i_24_++) {
		    for (int i_25_ = 0; i_25_ < 4; i_25_++) {
			int i_26_ = class241_sub3.readUnsignedShort(1162222719);
			if (i_26_ == 65535)
			    i_26_ = -1;
			aShortArrayArray6718[i_24_][i_25_] = (short) i_26_;
			int i_27_ = class241_sub3.readUnsignedShort(1162222719);
			aShortArrayArrayArray6715[i_24_][i_25_]
			    = new short[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
			    int i_29_ = class241_sub3.readUnsignedShort(1162222719);
			    if (i_29_ == 65535)
				i_29_ = -1;
			    aShortArrayArrayArray6715[i_24_][i_25_][i_28_]
				= (short) i_29_;
			}
		    }
		}
	    } else if (8 == i)
		npcShouldDisplayChat = false;
	    else if (i == 9)
		npcChatTimeout = class241_sub3.readUnsignedByte((byte) 18) * 1058193119;
	    else if (i == 10)
		playerShouldDisplayChat = false;
	    else if (i == 11)
		playerChatTimeout = class241_sub3.readUnsignedByte((byte) 48) * 1598752551;
	    else if (12 == i) {
		anInt6725
		    = class241_sub3.readUnsignedShort(1162222719) * -1723109209;
		anInt6707 = class241_sub3.readUnsignedShort(1162222719) * 1496098845;
	    } else if (i == 13)
		anInt6708 = class241_sub3.readUnsignedByte((byte) -44) * 150172513;
	    else if (i == 14)
		anInt6727
		    = class241_sub3.readUnsignedByte((byte) -81) * -1244086189;
	    else if (i == 15)
		anInt6710 = class241_sub3.readUnsignedByte((byte) 10) * 1537012761;
	    else if (i == 16)
		aBool6726 = true;
	    else if (17 == i)
		anInt6724 = class241_sub3.readInt((byte) 70) * -1124278773;
	    else if (18 == i)
		anInt6728 = class241_sub3.readInt((byte) 23) * 1383885177;
	    else if (19 == i)
		anInt6729 = class241_sub3.readInt((byte) 44) * -1355524067;
	    else if (i == 20) {
		aShort6719 = (short) class241_sub3.readUnsignedShort(1162222719);
		aByte6713 = (byte) class241_sub3.readUnsignedByte((byte) -18);
	    } else if (i == 21)
		anInt6717 = class241_sub3.readUnsignedByte((byte) -103) * 654367103;
	}
	if (!bool) {
	    if (hitmarkpos_x == null) {
		maxhitmarks = -1880891020;
		hitmarkpos_x = new int[4];
		hitmarkpos_y = new int[4];
	    }
	    for (int i = 0; i < hitmarkpos_x.length; i++) {
		hitmarkpos_x[i] = 0;
		hitmarkpos_y[i] = 20 * i;
	    }
	}
    }
    
    public GraphicsDefaults(JS5 defaults) {
		anInt6708 = 600690052;
		anInt6710 = -2125812561;
		anInt6711 = -1500173013;
		login_interface = -405162333;
		lobby_interface = -1664920469;
		aBool6714 = true;
		aShort6719 = (short) -1;
		aByte6713 = (byte) 0;
		anInt6717 = 1012200860;
		npcShouldDisplayChat = true;
		npcChatTimeout = 2116386238;
		playerShouldDisplayChat = true;
		playerChatTimeout = 501290357;
		anInt6725 = 1723109209;
		anInt6707 = -1496098845;
		anInt6724 = 237106432;
		anInt6728 = 646157959;
		anInt6729 = -1108283008;
		byte[] data = defaults.method4194(
				DefaultsGroup.GRAPHICS.js5GroupId * 692631693,
				-458533434);
		decode(new RSByteBuffer(data), 1352741721);
    }
    
    void method11566(RSByteBuffer class241_sub3) {
	boolean bool = false;
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -72);
	    if (0 == i)
		break;
	    if (i == 1) {
		if (hitmarkpos_x == null) {
		    maxhitmarks = -1880891020;
		    hitmarkpos_x = new int[4];
		    hitmarkpos_y = new int[4];
		}
		for (int i_30_ = 0; i_30_ < hitmarkpos_x.length; i_30_++) {
		    hitmarkpos_x[i_30_]
			= class241_sub3.readShort((byte) 108);
		    hitmarkpos_y[i_30_]
			= class241_sub3.readShort((byte) 43);
		}
		bool = true;
	    } else if (i == 2)
		anInt6711 = class241_sub3.readBigSmart((byte) -16) * 1500173013;
	    else if (i == 3) {
		maxhitmarks = class241_sub3.readUnsignedByte((byte) 31) * -1543964579;
		hitmarkpos_x = new int[maxhitmarks * 941792245];
		hitmarkpos_y = new int[maxhitmarks * 941792245];
	    } else if (i == 4)
		aBool6714 = false;
	    else if (5 == i)
		login_interface = class241_sub3.readTriByte(1771646547) * 405162333;
	    else if (6 == i)
		lobby_interface = class241_sub3.readTriByte(1771646547) * 1664920469;
	    else if (7 == i) {
		aShortArrayArray6718 = new short[10][4];
		aShortArrayArrayArray6715 = new short[10][4][];
		for (int i_31_ = 0; i_31_ < 10; i_31_++) {
		    for (int i_32_ = 0; i_32_ < 4; i_32_++) {
			int i_33_ = class241_sub3.readUnsignedShort(1162222719);
			if (i_33_ == 65535)
			    i_33_ = -1;
			aShortArrayArray6718[i_31_][i_32_] = (short) i_33_;
			int i_34_ = class241_sub3.readUnsignedShort(1162222719);
			aShortArrayArrayArray6715[i_31_][i_32_]
			    = new short[i_34_];
			for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
			    int i_36_ = class241_sub3.readUnsignedShort(1162222719);
			    if (i_36_ == 65535)
				i_36_ = -1;
			    aShortArrayArrayArray6715[i_31_][i_32_][i_35_]
				= (short) i_36_;
			}
		    }
		}
	    } else if (8 == i)
		npcShouldDisplayChat = false;
	    else if (i == 9)
		npcChatTimeout = class241_sub3.readUnsignedByte((byte) -37) * 1058193119;
	    else if (i == 10)
		playerShouldDisplayChat = false;
	    else if (i == 11)
		playerChatTimeout
		    = class241_sub3.readUnsignedByte((byte) -119) * 1598752551;
	    else if (12 == i) {
		anInt6725
		    = class241_sub3.readUnsignedShort(1162222719) * -1723109209;
		anInt6707 = class241_sub3.readUnsignedShort(1162222719) * 1496098845;
	    } else if (i == 13)
		anInt6708 = class241_sub3.readUnsignedByte((byte) 14) * 150172513;
	    else if (i == 14)
		anInt6727 = class241_sub3.readUnsignedByte((byte) 38) * -1244086189;
	    else if (i == 15)
		anInt6710 = class241_sub3.readUnsignedByte((byte) -1) * 1537012761;
	    else if (i == 16)
		aBool6726 = true;
	    else if (17 == i)
		anInt6724 = class241_sub3.readInt((byte) 85) * -1124278773;
	    else if (18 == i)
		anInt6728 = class241_sub3.readInt((byte) 48) * 1383885177;
	    else if (19 == i)
		anInt6729 = class241_sub3.readInt((byte) 89) * -1355524067;
	    else if (i == 20) {
		aShort6719 = (short) class241_sub3.readUnsignedShort(1162222719);
		aByte6713 = (byte) class241_sub3.readUnsignedByte((byte) -15);
	    } else if (i == 21)
		anInt6717 = class241_sub3.readUnsignedByte((byte) -47) * 654367103;
	}
	if (!bool) {
	    if (hitmarkpos_x == null) {
		maxhitmarks = -1880891020;
		hitmarkpos_x = new int[4];
		hitmarkpos_y = new int[4];
	    }
	    for (int i = 0; i < hitmarkpos_x.length; i++) {
		hitmarkpos_x[i] = 0;
		hitmarkpos_y[i] = 20 * i;
	    }
	}
    }
    
    void method11567(RSByteBuffer class241_sub3) {
	boolean bool = false;
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -9);
	    if (0 == i)
		break;
	    if (i == 1) {
		if (hitmarkpos_x == null) {
		    maxhitmarks = -1880891020;
		    hitmarkpos_x = new int[4];
		    hitmarkpos_y = new int[4];
		}
		for (int i_37_ = 0; i_37_ < hitmarkpos_x.length; i_37_++) {
		    hitmarkpos_x[i_37_]
			= class241_sub3.readShort((byte) 89);
		    hitmarkpos_y[i_37_]
			= class241_sub3.readShort((byte) 110);
		}
		bool = true;
	    } else if (i == 2)
		anInt6711 = class241_sub3.readBigSmart((byte) 24) * 1500173013;
	    else if (i == 3) {
		maxhitmarks = class241_sub3.readUnsignedByte((byte) 23) * -1543964579;
		hitmarkpos_x = new int[maxhitmarks * 941792245];
		hitmarkpos_y = new int[maxhitmarks * 941792245];
	    } else if (i == 4)
		aBool6714 = false;
	    else if (5 == i)
		login_interface = class241_sub3.readTriByte(1771646547) * 405162333;
	    else if (6 == i)
		lobby_interface = class241_sub3.readTriByte(1771646547) * 1664920469;
	    else if (7 == i) {
		aShortArrayArray6718 = new short[10][4];
		aShortArrayArrayArray6715 = new short[10][4][];
		for (int i_38_ = 0; i_38_ < 10; i_38_++) {
		    for (int i_39_ = 0; i_39_ < 4; i_39_++) {
			int i_40_ = class241_sub3.readUnsignedShort(1162222719);
			if (i_40_ == 65535)
			    i_40_ = -1;
			aShortArrayArray6718[i_38_][i_39_] = (short) i_40_;
			int i_41_ = class241_sub3.readUnsignedShort(1162222719);
			aShortArrayArrayArray6715[i_38_][i_39_]
			    = new short[i_41_];
			for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
			    int i_43_ = class241_sub3.readUnsignedShort(1162222719);
			    if (i_43_ == 65535)
				i_43_ = -1;
			    aShortArrayArrayArray6715[i_38_][i_39_][i_42_]
				= (short) i_43_;
			}
		    }
		}
	    } else if (8 == i)
		npcShouldDisplayChat = false;
	    else if (i == 9)
		npcChatTimeout = class241_sub3.readUnsignedByte((byte) -12) * 1058193119;
	    else if (i == 10)
		playerShouldDisplayChat = false;
	    else if (i == 11)
		playerChatTimeout
		    = class241_sub3.readUnsignedByte((byte) -101) * 1598752551;
	    else if (12 == i) {
		anInt6725
		    = class241_sub3.readUnsignedShort(1162222719) * -1723109209;
		anInt6707 = class241_sub3.readUnsignedShort(1162222719) * 1496098845;
	    } else if (i == 13)
		anInt6708 = class241_sub3.readUnsignedByte((byte) 13) * 150172513;
	    else if (i == 14)
		anInt6727 = class241_sub3.readUnsignedByte((byte) 78) * -1244086189;
	    else if (i == 15)
		anInt6710 = class241_sub3.readUnsignedByte((byte) 12) * 1537012761;
	    else if (i == 16)
		aBool6726 = true;
	    else if (17 == i)
		anInt6724 = class241_sub3.readInt((byte) 35) * -1124278773;
	    else if (18 == i)
		anInt6728 = class241_sub3.readInt((byte) 85) * 1383885177;
	    else if (19 == i)
		anInt6729 = class241_sub3.readInt((byte) 99) * -1355524067;
	    else if (i == 20) {
		aShort6719 = (short) class241_sub3.readUnsignedShort(1162222719);
		aByte6713 = (byte) class241_sub3.readUnsignedByte((byte) -62);
	    } else if (i == 21)
		anInt6717 = class241_sub3.readUnsignedByte((byte) -27) * 654367103;
	}
	if (!bool) {
	    if (hitmarkpos_x == null) {
		maxhitmarks = -1880891020;
		hitmarkpos_x = new int[4];
		hitmarkpos_y = new int[4];
	    }
	    for (int i = 0; i < hitmarkpos_x.length; i++) {
		hitmarkpos_x[i] = 0;
		hitmarkpos_y[i] = 20 * i;
	    }
	}
    }
    
    static final void method11568(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_44_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_45_ = (((ClientScriptData) class454).integerStack
		     [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	if (null == Class187.aClass35Array2203[i_44_])
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	else {
	    String string = (Class187.aClass35Array2203[i_44_].components
			     [i_45_].aString834);
	    if (null == string)
		((ClientScriptData) class454).objectStack
		    [((((ClientScriptData) class454).objectStackPointer += -1650705371)
		      * -290357331) - 1]
		    = "";
	    else
		((ClientScriptData) class454).objectStack
		    [((((ClientScriptData) class454).objectStackPointer += -1650705371)
		      * -290357331) - 1]
		    = string;
	}
    }
    
    public static Class432 method11569(int i) {
	if (Class455.aClass432_6247 == null)
	    return Class432.aClass432_6101;
	return Class455.aClass432_6247;
    }
    
    public static void method11570(int i, boolean bool, int i_46_) {
	Class96.method2168
	    (i,
	     ClientMessage.LOADING.getLocalisedMessage(VarPlayerDomain.currentLocale,
						 (short) 27044),
	     bool, 849925884);
    }
    
    static final void method11571(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863,
	     (((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     (byte) 2);
	Class167.method3600((short) 2201);
    }
}
