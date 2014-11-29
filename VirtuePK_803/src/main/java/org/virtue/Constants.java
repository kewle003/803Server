package org.virtue;

import java.math.BigInteger;

import org.virtue.game.logic.region.Tile;

/**
 * @author Belthazar
 * @since Jan 22, 2014
 */
public class Constants {

	/**
	 * Represents the name of the server.
	 */
	public static final String SERVER_NAME = "FuckScape";
	
	/**
	 * Represents if the login server is enabled.
	 */
	public static final boolean LOGIN_SERVER = false;
	
	/**
	 * Represents if Developer mode is enabled.
	 */

	public static boolean DEVELOPER_MODE = true;
	
	/**
	 * Represents the world ID.
	 */
	public static final int WORLD_ID = 1;
	
	/**
	 * Default Player Location.
	 */
	public static final Tile DEFAULT_LOCATION = new Tile(3200, 3200, 0);

	/**
	 * Represents the global xp modifier. Note that this affects the base xp rate, and will not be shown as bonus xp. 1.0 represents the normal RuneScape xp rates
	 */
	public static final double GLOBAL_XP_MODIFIER = 1.0;

	/**
	 * Represents the packet size capacity.
	 */
	public static final int PACKET_SIZE_LIMIT = 7500;

	public static final BigInteger JS5ModulusKey = new BigInteger("92952295964155672087801015402111750591919500795257231765611346743023141259087751200849540075517787992536588533840502270599726488785462782810450546358220539026800123618215080154270389875550255531705255494326594317637443265761822792347000385003452391742987636722632882107837694393096626546031683632300323372031");

	public static final BigInteger JS5PrivateKey = new BigInteger("48844029607909929282080219851655163753063517835529068275083137145982131295000747300835504541261906753238247645275176117230165873030406752131258615980047884895054026459192588976183254088467205779659961501829292823408290106695592149680053016585516891071746766448461496845037459094045320573736639805712121612241");

	public static final long MS_PER_DAY = 24 * 60 * 60 * 1000;
	
	public static final long RUNE_DAY_0 = -1;
	
	/**
	 * The server token.
	 */
	public static final String SERVER_TOKEN = "BgTFo+lHy/lilpFjXLk4n6pf9X/x/B6L";	
        
	public static final int MAX_WALK_STEPS = 25;
	
	public static final int[] NIS_CONFIG = new int[5000];


	
	static {
		NIS_CONFIG[2989] = -2147344282;
		NIS_CONFIG[2988] = 3144;
		NIS_CONFIG[2991] = -2145025348;
		NIS_CONFIG[2985] = 253042913;
		NIS_CONFIG[2984] = 3072;
		NIS_CONFIG[2987] = -2147176268;
		NIS_CONFIG[2986] = 296005631;
		NIS_CONFIG[2981] = -2146303776;
		NIS_CONFIG[2980] = 4192253;
		NIS_CONFIG[2983] = -2147348360;
		NIS_CONFIG[2982] = 8388607;
		NIS_CONFIG[2977] = -2146115221;
		NIS_CONFIG[2976] = 5603327;
		NIS_CONFIG[2979] = -2146664148;
		NIS_CONFIG[2978] = 2047;
		NIS_CONFIG[2992] = 8386557;
		NIS_CONFIG[2993] = -2146848419;
		NIS_CONFIG[2994] = 4179967;
		NIS_CONFIG[2995] = 16777215;
		NIS_CONFIG[2959] = 51716321;
		NIS_CONFIG[2958] = 16773120;
		NIS_CONFIG[2957] = 403665472;
		NIS_CONFIG[2956] = 16777215;
		NIS_CONFIG[2955] = 1102022;
		NIS_CONFIG[2953] = 1638625;
		NIS_CONFIG[2952] = 16777215;
		NIS_CONFIG[2951] = 1638625;
		NIS_CONFIG[2950] = 16777215;
		NIS_CONFIG[2949] = 1638625;
		NIS_CONFIG[2948] = 16777215;
		NIS_CONFIG[2947] = 1638625;
		NIS_CONFIG[2946] = 16777215;
		NIS_CONFIG[2945] = 1638625;
		NIS_CONFIG[2974] = 10175616;
		NIS_CONFIG[2975] = -2147348352;
		NIS_CONFIG[2972] = 10809343;
		NIS_CONFIG[2973] = -2147221254;
		NIS_CONFIG[2970] = 279216127;
		NIS_CONFIG[2971] = 269820129;
		NIS_CONFIG[2968] = 16777215;
		NIS_CONFIG[2969] = 18161889;
		NIS_CONFIG[4120] = 620756991;
		NIS_CONFIG[2966] = 16777215;
		NIS_CONFIG[2967] = 1638625;
		NIS_CONFIG[2964] = 419426304;
		NIS_CONFIG[2965] = 1638625;
		NIS_CONFIG[2962] = 16777215;
		NIS_CONFIG[2963] = 370111039;
		NIS_CONFIG[2960] = 262451199;
		NIS_CONFIG[2961] = 1638625;
		NIS_CONFIG[3465] = 124;
		NIS_CONFIG[3770] = 184545280;
		NIS_CONFIG[3769] = 386888255;
		NIS_CONFIG[3721] = 100992003;
		NIS_CONFIG[3723] = 4198400;
		NIS_CONFIG[3722] = -13304057;
		NIS_CONFIG[2852] = 319951120;
		NIS_CONFIG[2853] = 387323156;
		NIS_CONFIG[2854] = 454695192;
		NIS_CONFIG[2855] = 572539200;
		NIS_CONFIG[2860] = 1023;
		NIS_CONFIG[2862] = -1;
		NIS_CONFIG[2863] = 691470335;
		NIS_CONFIG[2856] = 319951120;
		NIS_CONFIG[2857] = -236;
		NIS_CONFIG[2858] = 23039;
		NIS_CONFIG[2859] = -268435456;
		NIS_CONFIG[2869] = 33646952;
		NIS_CONFIG[2868] = 842019105;
		NIS_CONFIG[2865] = -13162457;
		NIS_CONFIG[2864] = 642008373;
		NIS_CONFIG[2867] = 589579832;
		NIS_CONFIG[2866] = -1;
		NIS_CONFIG[2912] = 32;
		NIS_CONFIG[2913] = -2130706433;
		NIS_CONFIG[2915] = -2130509472;
		NIS_CONFIG[2916] = 33554431;
		NIS_CONFIG[2917] = -2146565919;
		NIS_CONFIG[2918] = 4095;
		NIS_CONFIG[2919] = -2113691330;
		NIS_CONFIG[2920] = 33552646;
		NIS_CONFIG[2921] = -2146471362;
		NIS_CONFIG[2922] = 352317440;
		NIS_CONFIG[2923] = -2146098975;
		NIS_CONFIG[2924] = 27570175;
		NIS_CONFIG[2925] = -2130709952;
		NIS_CONFIG[2927] = 319779392;
		NIS_CONFIG[2929] = 336556606;
		NIS_CONFIG[2928] = 369094656;
		NIS_CONFIG[2931] = 353333823;
		NIS_CONFIG[2930] = 385871872;
		NIS_CONFIG[2933] = 1638625;
		NIS_CONFIG[2932] = 402649088;
		NIS_CONFIG[2935] = -2146885110;
		NIS_CONFIG[2934] = 16777215;
		NIS_CONFIG[2937] = -2146041344;
		NIS_CONFIG[2936] = 16773120;
		NIS_CONFIG[2939] = 1638625;
		NIS_CONFIG[2938] = 5953489;
		NIS_CONFIG[2941] = 1638625;
		NIS_CONFIG[2940] = 16777215;
		NIS_CONFIG[2942] = 16777215;
	}
}
