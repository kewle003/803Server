/*
 * This file is part of RS3Emulator.
 *
 * RS3Emulator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RS3Emulator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RS3Emulator.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.virtue.game.config;

/**
 * RS3Emulator
 * IncomingOpcode.java
 * 4/04/2014
 * @author Sundays211
 */
public class IncommingOpcodes {
	public final static int SCREEN_PACKET = 70;//803
	public final static int PACKET_RECEIVE_COUNT = 87;//803
	public final static int PING_PACKET = 92;//803
	public final static int WORLD_LIST_UPDATE = 56;//803
	public final static int COMMANDS_PACKET = 73;//803
	
	//Client information (mostly useless, apart from auto-logout)
	public final static int EVENT_MOUSE_MOVE = 93;//803
	public final static int EVENT_KEYBOARD = 1;//803
	public final static int EVENT_CAMERA_POSITION = 7;//803
	public final static int EVENT_APPLET_FOCUS = 105;//803
	public final static int EVENT_MOUSE_CLICK = 34;//803
	public final static int ANOTHER_MOUSE_PACKET = 11;//803
	public final static int ANOTHER_CLICK_PACKET = 3;//803
	public final static int CLIENT_SPECS_PACKET = 83;//803	
	
	//Movement-related
	public final static int WALKING_PACKET = 95;//803
	public final static int MINI_WALKING_PACKET = 66;//803
	public final static int REGION_LOADING_COMPLETED_PACKET = 21;//803
	
	//Action buttons
	public final static int ACTION_BUTTON_1_PACKET = 112;//803
	public final static int ACTION_BUTTON_2_PACKET = 15;//803
	public final static int ACTION_BUTTON_3_PACKET = 16;//803
	public final static int ACTION_BUTTON_4_PACKET = 107;//803
	public final static int ACTION_BUTTON_5_PACKET = 78;//803
	public final static int ACTION_BUTTON_6_PACKET = 33;//803
	public final static int ACTION_BUTTON_7_PACKET = 118;//803
	public final static int ACTION_BUTTON_8_PACKET = 67;//803
	public final static int ACTION_BUTTON_9_PACKET = 6;//803
	public final static int ACTION_BUTTON_10_PACKET = 59;//803
	
	//Player options
	public final static int PLAYER_OPTION_1_PACKET = 88;//803
	public final static int PLAYER_OPTION_2_PACKET = 86;//803
	public final static int PLAYER_OPTION_3_PACKET = 90;//803
	public final static int PLAYER_OPTION_4_PACKET = 25;//803
	public final static int PLAYER_OPTION_5_PACKET = 79;//803
	public final static int PLAYER_OPTION_6_PACKET = 101;//803
	public final static int PLAYER_OPTION_7_PACKET = 94;//803
	public final static int PLAYER_OPTION_8_PACKET = 71;//803
	public final static int PLAYER_OPTION_9_PACKET = 12;//803
	public final static int PLAYER_OPTION_10_PACKET = 75;//803
	
	//NPC options
	public final static int NPC_OPTION_1_PACKET = 61;//803
	public final static int NPC_OPTION_2_PACKET = 32;//803
	public final static int NPC_OPTION_3_PACKET = 100;//803
	public final static int NPC_OPTION_4_PACKET = 31;//803
	public final static int NPC_OPTION_5_PACKET = 24;//803
	public final static int NPC_EXAMINE_PACKET = 36;//803
	
	//Object options
	public final static int OBJECT_OPTION_1_PACKET = 113;//803
	public final static int OBJECT_OPTION_2_PACKET = 45;//803
	public final static int OBJECT_OPTION_3_PACKET = 115;//803
	public final static int OBJECT_OPTION_4_PACKET = 117;//803
	public final static int OBJECT_OPTION_5_PACKET = 102;//803
	public final static int OBJECT_EXAMINE_PACKET = 50;//803
	
	//Ground item options
	public final static int GROUND_ITEM_OPTION_1_PACKET = 35;//803
	public final static int GROUND_ITEM_OPTION_2_PACKET = 18;//803
	public final static int GROUND_ITEM_OPTION_3_PACKET = 5;//803
	public final static int GROUND_ITEM_OPTION_4_PACKET = 110;//803
	public final static int GROUND_ITEM_OPTION_5_PACKET = 55;//803
	public final static int GROUND_ITEM_EXAMINE_PACKET = 91;//803
	
	//Friends/Ignores management
	public final static int JOIN_FRIEND_CHAT_PACKET = 19;//803
	public final static int FRIENDS_CHAT_KICK_PACKET = 8;//803
	public final static int CLAN_KICK_PACKET = 62;//803
	public final static int ONLINE_STATUS_PACKET = 22;//803
	public final static int ADD_FRIEND_PACKET = 97;//803
	public final static int REMOVE_FRIEND_PACKET = 58;//803
	public final static int ADD_IGNORE_PACKET = 81;//803
	public final static int REMOVE_IGNORE_PACKET = 76;//803
	public final static int FRIEND_OPTION_PACKET = 2;//803
	public final static int FRIEND_NOTE_PACKET = 108;//803
	public final static int IGNORE_NOTE_PACKET = 77;//803
	public final static int CHANGE_FRIEND_RANK_PACKET = 74;//803
	
	//Inputs
	public final static int TEXT_INPUT_PACKET = 49;//803
	public final static int INT_INPUT_PACKET = 85;//803
	public final static int COLOUR_INPUT_PACKET = 14;//803
	
	//Message
	public final static int CHAT_TYPE_PACKET = 13;//803
	public final static int MESSAGE_PACKET = 99;//803
	public final static int PRIVATE_MESSAGE_PACKET = 44;//803
	
	//Interface management
	public final static int INTERFACE_CHANGE_PACKET = 10;//803
	public final static int INTERFACE_LAYOUT_PACKET = 20;//803
	public final static int ITEM_ON_ITEM_PACKET = 82;//803
	public final static int ITEM_ON_OBJECT_PACKET = 51;//803
	public final static int INTERFACE_ON_PLAYER_PACKET = 43;//803
	public final static int CLOSE_INTERFACE_PACKET = 26;//803
	
	private static final int[] SIZES_803 = new int[120];
	static {
		SIZES_803[0] = -1;
		SIZES_803[1] = -2;
		SIZES_803[2] = -1;
		SIZES_803[3] = 7;
		SIZES_803[4] = -1;
		SIZES_803[5] = 7;
		SIZES_803[6] = 8;
		SIZES_803[7] = 4;
		SIZES_803[8] = -1;
		SIZES_803[9] = -1;
		SIZES_803[10] = 16;
		SIZES_803[11] = -1;
		SIZES_803[12] = 3;
		SIZES_803[13] = 1;
		SIZES_803[14] = 2;
		SIZES_803[15] = 8;
		SIZES_803[16] = 8;
		SIZES_803[17] = 2;
		SIZES_803[18] = 7;
		SIZES_803[19] = -1;
		SIZES_803[20] = -2;
		SIZES_803[21] = 0;
		SIZES_803[22] = 3;
		SIZES_803[23] = 4;
		SIZES_803[24] = 3;
		SIZES_803[25] = 3;
		SIZES_803[26] = 0;
		SIZES_803[27] = 4;
		SIZES_803[28] = 1;
		SIZES_803[29] = -1;
		SIZES_803[30] = 9;
		SIZES_803[31] = 3;
		SIZES_803[32] = 3;
		SIZES_803[33] = 8;
		SIZES_803[34] = 6;
		SIZES_803[35] = 7;
		SIZES_803[36] = 3;
		SIZES_803[37] = 11;
		SIZES_803[38] = -2;
		SIZES_803[39] = 12;
		SIZES_803[40] = 1;
		SIZES_803[41] = -2;
		SIZES_803[42] = 4;
		SIZES_803[43] = 11;
		SIZES_803[44] = -2;
		SIZES_803[45] = 9;
		SIZES_803[46] = 15;
		SIZES_803[47] = -1;
		SIZES_803[48] = 15;
		SIZES_803[49] = -1;
		SIZES_803[50] = 9;
		SIZES_803[51] = 17;
		SIZES_803[52] = 4;
		SIZES_803[53] = -1;
		SIZES_803[54] = 0;
		SIZES_803[55] = 7;
		SIZES_803[56] = 4;
		SIZES_803[57] = 2;
		SIZES_803[58] = -1;
		SIZES_803[59] = 8;
		SIZES_803[60] = -1;
		SIZES_803[61] = 3;
		SIZES_803[62] = -1;
		SIZES_803[63] = 4;
		SIZES_803[64] = 0;
		SIZES_803[65] = -2;
		SIZES_803[66] = 18;
		SIZES_803[67] = 8;
		SIZES_803[68] = 6;
		SIZES_803[69] = -1;
		SIZES_803[70] = 6;
		SIZES_803[71] = 3;
		SIZES_803[72] = -1;
		SIZES_803[73] = -1;
		SIZES_803[74] = -1;
		SIZES_803[75] = 3;
		SIZES_803[76] = -1;
		SIZES_803[77] = -1;
		SIZES_803[78] = 8;
		SIZES_803[79] = 3;
		SIZES_803[80] = 1;
		SIZES_803[81] = -1;
		SIZES_803[82] = 16;
		SIZES_803[83] = 4;
		SIZES_803[84] = -1;
		SIZES_803[85] = 4;
		SIZES_803[86] = 3;
		SIZES_803[87] = 4;
		SIZES_803[88] = 3;
		SIZES_803[89] = 9;
		SIZES_803[90] = 3;
		SIZES_803[91] = 7;
		SIZES_803[92] = 0;
		SIZES_803[93] = -1;
		SIZES_803[94] = 3;
		SIZES_803[95] = 5;
		SIZES_803[96] = -1;
		SIZES_803[97] = -1;
		SIZES_803[98] = -2;
		SIZES_803[99] = -1;
		SIZES_803[100] = 3;
		SIZES_803[101] = 3;
		SIZES_803[102] = 9;
		SIZES_803[103] = -2;
		SIZES_803[104] = 1;
		SIZES_803[105] = 1;
		SIZES_803[106] = 2;
		SIZES_803[107] = 8;
		SIZES_803[108] = -1;
		SIZES_803[109] = -1;
		SIZES_803[110] = 7;
		SIZES_803[111] = 18;
		SIZES_803[112] = 8;
		SIZES_803[113] = 9;
		SIZES_803[114] = -2;
		SIZES_803[115] = 9;
		SIZES_803[116] = 0;
		SIZES_803[117] = 9;
		SIZES_803[118] = 8;
		SIZES_803[119] = -2;
	}
	
	public static int[] getPacketSizes () {
		return SIZES_803;
	}
}
