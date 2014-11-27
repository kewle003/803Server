/* Class452 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class452
{
    static long[] aLongArray6209;
    static char[] aCharArray6210
	= { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
	    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
	    'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    static Class108 aClass108_6211;
    public static JS5 GRAPHICS_ARCHIVE;//aClass210_6212
    
    static long method10538(CharSequence charsequence) {
	long l = 0L;
	int i = charsequence.length();
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_0_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) (c + '\001' - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) (c + '\001' - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) ('\033' + c - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; 0L == l % 37L && 0L != l; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    static {
	aLongArray6209 = new long[12];
	for (int i = 0; i < aLongArray6209.length; i++)
	    aLongArray6209[i] = (long) Math.pow(37.0, (double) i);
    }
    
    static long method10539(CharSequence charsequence) {
	long l = 0L;
	int i = charsequence.length();
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_1_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) (c + '\001' - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) (c + '\001' - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) ('\033' + c - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; 0L == l % 37L && 0L != l; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    static long method10540(CharSequence charsequence) {
	long l = 0L;
	int i = charsequence.length();
	for (int i_2_ = 0; i_2_ < i; i_2_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_2_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) (c + '\001' - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) (c + '\001' - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) ('\033' + c - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; 0L == l % 37L && 0L != l; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    static long method10541(CharSequence charsequence) {
	long l = 0L;
	int i = charsequence.length();
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_3_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) (c + '\001' - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) (c + '\001' - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) ('\033' + c - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; 0L == l % 37L && 0L != l; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    public static String method10542(CharSequence charsequence) {
	String string
	    = Class16.method855(ObjectDefinitionLoader.method11870(charsequence, 161672197));
	if (null == string)
	    string = "";
	return string;
    }
    
    Class452() throws Throwable {
	throw new Error();
    }
    
    public static String method10543(CharSequence charsequence) {
	String string
	    = Class16.method855(ObjectDefinitionLoader.method11870(charsequence, 161672197));
	if (null == string)
	    string = "";
	return string;
    }
    
    public static String method10544(CharSequence charsequence) {
	String string
	    = Class16.method855(ObjectDefinitionLoader.method11870(charsequence, 161672197));
	if (null == string)
	    string = "";
	return string;
    }
    
    static String method10545(long l) {
	if (l <= 0L || l >= 6582952005840035281L)
	    return null;
	if (l % 37L == 0L)
	    return null;
	int i = 0;
	for (long l_4_ = l; l_4_ != 0L; l_4_ /= 37L)
	    i++;
	StringBuilder stringbuilder = new StringBuilder(i);
	while (0L != l) {
	    long l_5_ = l;
	    l /= 37L;
	    char c = aCharArray6210[(int) (l_5_ - 37L * l)];
	    if ('_' == c) {
		int i_6_ = stringbuilder.length() - 1;
		stringbuilder.setCharAt
		    (i_6_, Character.toUpperCase(stringbuilder.charAt(i_6_)));
		c = '\u00a0';
	    }
	    stringbuilder.append(c);
	}
	stringbuilder.reverse();
	stringbuilder
	    .setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
	return stringbuilder.toString();
    }
    
    public static IncommingOpcode[] method10546(byte i) {
	return (new IncommingOpcode[]
		{ IncommingOpcode.CLIENT_SETVARCSTR_LARGE, IncommingOpcode.CLIENT_SETVARCBIT_SMALL,
		  IncommingOpcode.aClass340_5244, IncommingOpcode.PLAYER_OPTION_PACKET,
		  IncommingOpcode.SKILLS_PACKET, IncommingOpcode.UPDATE_ITEMS_PACKET,
		  IncommingOpcode.CLIENT_SETVARC_LARGE, IncommingOpcode.VARPBIT_SMALL,
		  IncommingOpcode.FRIENDS_CHANNEL_PACKET, IncommingOpcode.IF_SETHIDE,
		  IncommingOpcode.aClass340_5129, IncommingOpcode.VARCLAN_ENABLE,
		  IncommingOpcode.aClass340_5280, IncommingOpcode.CLANCHANNEL_DELTA,
		  IncommingOpcode.aClass340_5133, IncommingOpcode.IF_CLOSESUB,
		  IncommingOpcode.aClass340_5135, IncommingOpcode.aClass340_5155,
		  IncommingOpcode.UNLOCK_FRIEND_LIST_PACKET, IncommingOpcode.OBJECT_ANIMATION_PACKET,
		  IncommingOpcode.SET_CAMERA_POS_PACKET, IncommingOpcode.aClass340_5140,
		  IncommingOpcode.MESSAGE_CLANCHANNEL, IncommingOpcode.aClass340_5142,
		  IncommingOpcode.aClass340_5143, IncommingOpcode.aClass340_5144,
		  IncommingOpcode.aClass340_5145, IncommingOpcode.NPC_UPDATE_PACKET,
		  IncommingOpcode.aClass340_5128, IncommingOpcode.aClass340_5148,
		  IncommingOpcode.IF_SETTEXT, IncommingOpcode.DYNAMIC_MAP_REGION_PACKET,
		  IncommingOpcode.aClass340_5266, IncommingOpcode.CLANSETTINGS_DELTA,
		  IncommingOpcode.IF_SETOBJECT, IncommingOpcode.RESET_INTERFACE_INFORMATION,
		  IncommingOpcode.aClass340_5168, IncommingOpcode.aClass340_5156,
		  IncommingOpcode.MESSAGE_PRIVATE_ECHO, IncommingOpcode.IF_SETCOLOUR,
		  IncommingOpcode.URL_OPEN, IncommingOpcode.CLIENT_SETVARCSTR_SMALL,
		  IncommingOpcode.aClass340_5161, IncommingOpcode.ONLINE_STATUS_PACKET,
		  IncommingOpcode.PLAYER_UPDATE_PACKET, IncommingOpcode.TILE_MESSAGE_PACKET,
		  IncommingOpcode.aClass340_5165, IncommingOpcode.RUN_COMMAND_PACKET,
		  IncommingOpcode.aClass340_5194, IncommingOpcode.IF_OPENSUB,
		  IncommingOpcode.aClass340_5169, IncommingOpcode.IF_SETSCROLLPOS,
		  IncommingOpcode.aClass340_5171, IncommingOpcode.aClass340_5172,
		  IncommingOpcode.aClass340_5120, IncommingOpcode.aClass340_5174,
		  IncommingOpcode.FRIENDS_PACKET, IncommingOpcode.aClass340_5176,
		  IncommingOpcode.aClass340_5177, IncommingOpcode.aClass340_5126,
		  IncommingOpcode.aClass340_5258, IncommingOpcode.aClass340_5291,
		  IncommingOpcode.FULL_LOGOUT_PACKET, IncommingOpcode.aClass340_5182,
		  IncommingOpcode.aClass340_5183, IncommingOpcode.aClass340_5184,
		  IncommingOpcode.aClass340_5185, IncommingOpcode.aClass340_5186,
		  IncommingOpcode.IGNORES_PACKET, IncommingOpcode.LOBBY_LOGOUT_PACKET,
		  IncommingOpcode.aClass340_5189, IncommingOpcode.IF_SETPOSITION,
		  IncommingOpcode.VARCLAN, IncommingOpcode.aClass340_5192,
		  IncommingOpcode.aClass340_5193, IncommingOpcode.aClass340_5254,
		  IncommingOpcode.IF_OPENTOP, IncommingOpcode.STATIC_MAP_REGION_PACKET,
		  IncommingOpcode.aClass340_5197, IncommingOpcode.aClass340_5198,
		  IncommingOpcode.aClass340_5199, IncommingOpcode.aClass340_5200,
		  IncommingOpcode.IF_OPENSUB_ACTIVE_PLAYER, IncommingOpcode.aClass340_5202,
		  IncommingOpcode.aClass340_5203, IncommingOpcode.MESSAGE_FRIENDCHANNEL,
		  IncommingOpcode.aClass340_5205, IncommingOpcode.aClass340_5206,
		  IncommingOpcode.aClass340_5207, IncommingOpcode.SYSTEM_UPDATE_PACKET,
		  IncommingOpcode.PROJECTILE_PACKET, IncommingOpcode.aClass340_5167,
		  IncommingOpcode.CLANCHANNEL_FULL, IncommingOpcode.aClass340_5293,
		  IncommingOpcode.UPDATE_RUNENERGY, IncommingOpcode.aClass340_5214,
		  IncommingOpcode.VARP_SMALL, IncommingOpcode.aClass340_5216,
		  IncommingOpcode.WORLD_LIST_PACKET, IncommingOpcode.aClass340_5218,
		  IncommingOpcode.aClass340_5219, IncommingOpcode.aClass340_5220,
		  IncommingOpcode.VARCLAN_DISABLE, IncommingOpcode.aClass340_5173,
		  IncommingOpcode.IF_SETANIM, IncommingOpcode.IF_SETNPCHEAD,
		  IncommingOpcode.aClass340_5238, IncommingOpcode.UPDATE_WORLD_TILE_PACKET,
		  IncommingOpcode.aClass340_5227, IncommingOpcode.IF_OPENSUB_ACTIVE_OBJ,
		  IncommingOpcode.REMOVE_GROUND_ITEM_PACKET, IncommingOpcode.SPAWN_OBJECT_PACKET,
		  IncommingOpcode.aClass340_5209, IncommingOpcode.aClass340_5232,
		  IncommingOpcode.DESTROY_OBJECT_PACKET, IncommingOpcode.aClass340_5275,
		  IncommingOpcode.MESSAGE_PRIVATE, IncommingOpcode.CLIENT_SETVARCBIT_LARGE,
		  IncommingOpcode.aClass340_5163, IncommingOpcode.FRIENDS_CHANNEL_UPDATE_PACKET,
		  IncommingOpcode.aClass340_5239, IncommingOpcode.aClass340_5240,
		  IncommingOpcode.WORLD_TILE_PACKET, IncommingOpcode.aClass340_5242,
		  IncommingOpcode.aClass340_5243, IncommingOpcode.GRAPHICS_PACKET,
		  IncommingOpcode.aClass340_5180, IncommingOpcode.aClass340_5294,
		  IncommingOpcode.CHAT_FILTER_SETTINGS, IncommingOpcode.RESET_CLIENT_VARCACHE,
		  IncommingOpcode.ITEMS_PACKET, IncommingOpcode.IF_SETPLAYERHEAD,
		  IncommingOpcode.CLIENT_SETVARC_SMALL, IncommingOpcode.aClass340_5221,
		  IncommingOpcode.INTERFACE_SETTINGS_PACKET, IncommingOpcode.aClass340_5187,
		  IncommingOpcode.aClass340_5226, IncommingOpcode.MESSAGE_PACKET,
		  IncommingOpcode.MINIMAP_FLAG_PACKET, IncommingOpcode.aClass340_5230,
		  IncommingOpcode.IF_SETGRAPHIC, IncommingOpcode.aClass340_5260,
		  IncommingOpcode.aClass340_5261, IncommingOpcode.aClass340_5147,
		  IncommingOpcode.IF_SETTEXTFONT, IncommingOpcode.aClass340_5264,
		  IncommingOpcode.aClass340_5265, IncommingOpcode.aClass340_5212,
		  IncommingOpcode.aClass340_5267, IncommingOpcode.ADD_GROUND_ITEM_PACKET,
		  IncommingOpcode.LARGE_NPC_UPDATE_PACKET, IncommingOpcode.aClass340_5270,
		  IncommingOpcode.aClass340_5271, IncommingOpcode.VARP_LARGE,
		  IncommingOpcode.VARPBIT_LARGE, IncommingOpcode.KEEP_ALIVE_PACKET,
		  IncommingOpcode.aClass340_5196, IncommingOpcode.CLANSETTINGS_FULL,
		  IncommingOpcode.MESSAGE_PUBLIC, IncommingOpcode.aClass340_5278,
		  IncommingOpcode.HINT_ICON_PACKET, IncommingOpcode.aClass340_5257,
		  IncommingOpcode.aClass340_5281, IncommingOpcode.UPDATE_RUNWEIGHT,
		  IncommingOpcode.aClass340_5149, IncommingOpcode.aClass340_5284,
		  IncommingOpcode.aClass340_5285, IncommingOpcode.RUNCLIENTSCRIPT,
		  IncommingOpcode.aClass340_5287, IncommingOpcode.aClass340_5288,
		  IncommingOpcode.aClass340_5289, IncommingOpcode.aClass340_5290,
		  IncommingOpcode.aClass340_5141, IncommingOpcode.UPDATE_SITESETTINGS,
		  IncommingOpcode.aClass340_5217, IncommingOpcode.aClass340_5119,
		  IncommingOpcode.aClass340_5245 });
    }
}
