/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Js5ConfigGroup
{
    public static Js5ConfigGroup CURSORTYPE;//aClass37_384
    public static Js5ConfigGroup aClass37_385;
    public static Js5ConfigGroup aClass37_386;
    static Js5ConfigGroup aClass37_387;
    static Js5ConfigGroup aClass37_388;
    static Js5ConfigGroup aClass37_389;
    public static Js5ConfigGroup VAR_OBJECT;//aClass37_390
    public static Js5ConfigGroup aClass37_391;//aClass37_391
    public static Js5ConfigGroup NPC_DEFINITIONS;//aClass37_392
    public static Js5ConfigGroup OBJECT_DEFINITIONS;//aClass37_393
    public static Js5ConfigGroup VAR_PLAYER;//aClass37_394
    public static Js5ConfigGroup ANIMATION_DEFINITIONS;//aClass37_395
    public static Js5ConfigGroup GRAPHICS_DEFINITIONS;//aClass37_396
    public static Js5ConfigGroup INVTYPE;//aClass37_397
    static Js5ConfigGroup aClass37_398;
    static Js5ConfigGroup aClass37_399;
    static Js5ConfigGroup aClass37_400;
    static Js5ConfigGroup aClass37_401;
    static Js5ConfigGroup aClass37_402;
    public static Js5ConfigGroup aClass37_403;
    static Js5ConfigGroup aClass37_404;
    static Js5ConfigGroup aClass37_405;
    static Js5ConfigGroup aClass37_406;
    static Js5ConfigGroup aClass37_407;
    static Js5ConfigGroup aClass37_408;
    public static Js5ConfigGroup GENERAL_MAPS;//aClass37_409
    static Js5ConfigGroup CHATPHRASETYPE;//aClass37_410
    static Js5ConfigGroup aClass37_411;
    public static Js5ConfigGroup aClass37_412;//aClass37_412
    public static Js5ConfigGroup aClass37_413;
    static Js5ConfigGroup aClass37_414;
    public static Js5ConfigGroup aClass37_415;
    static Js5ConfigGroup CHATCATTYPE;//aClass37_416
    public static Js5ConfigGroup ITEM_DEFINITIONS;//aClass37_417
    public static Js5ConfigGroup aClass37_418;
    public static Js5ConfigGroup aClass37_419;
    static Js5ConfigGroup aClass37_420;
    public static Js5ConfigGroup aClass37_421;
    static Js5ConfigGroup aClass37_422;
    static Js5ConfigGroup aClass37_423;
    public static Js5ConfigGroup VAR_CLAN;//aClass37_424
    static Js5ConfigGroup aClass37_425;
    static Js5ConfigGroup aClass37_426;
    static Js5ConfigGroup aClass37_427;
    static Js5ConfigGroup aClass37_428;
    public static Js5ConfigGroup HITMARKTYPE;//aClass37_429
    static Js5ConfigGroup aClass37_430;
    static Js5ConfigGroup ITEMCODETYPE;//aClass37_431
    static Js5ConfigGroup CATEGORYTYPE;//aClass37_432
    static Js5ConfigGroup aClass37_433;
    static Js5ConfigGroup aClass37_434;
    static Js5ConfigGroup aClass37_435;
    static Js5ConfigGroup aClass37_436;
    static Js5ConfigGroup aClass37_437;
    public static Js5ConfigGroup VAR_NPC;//aClass37_438
    public static Js5ConfigGroup VAR_CLIENT;//aClass37_439
    public static Js5ConfigGroup VAR_WORLD;//aClass37_440
    public static Js5ConfigGroup VAR_REGION;//aClass37_441
    static Js5ConfigGroup AREATYPE;//aClass37_442
    public static Js5ConfigGroup PARAMTYPE;//aClass37_443
    public static Js5ConfigGroup VAR_CLAN_SETTING;//aClass37_444
    public static Js5ConfigGroup aClass37_445;
    public static Js5ConfigGroup VAR_BIT;//aClass37_446
    static Js5ConfigGroup GAMELOGEVENT;//aClass37_447
    public static Js5ConfigGroup aClass37_448 = new Js5ConfigGroup(1);
    public int id;//anInt449
    static Js5ConfigGroup aClass37_450;
    public static Js5ConfigGroup aClass37_451;
    static Js5ConfigGroup aClass37_452;
    public static Js5ConfigGroup ANIMATION_CONFIG;//aClass37_453
    static Js5ConfigGroup aClass37_454;
    static Js5ConfigGroup aClass37_455;
    public static Js5ConfigGroup aClass37_456;
    int groupSizeInBits;//anInt457
    
    public int getClientFileId/*method1011*/(int i, int i_0_) {
    	return i & (1 << -1961974377 * groupSizeInBits) - 1;
    }
    
    Js5ConfigGroup(int i, int i_1_) {
		id = -1258126405 * i;
		groupSizeInBits = 1517693479 * i_1_;
    }
    
    public int getGroupSize/*method1012*/(int i) {
    	return 1 << groupSizeInBits * -1961974377;
    }
    
    public int getClientGroupId/*method1013*/(int i, byte i_2_) {
    	return i >>> groupSizeInBits * -1961974377;
    }
    
    static {
		aClass37_389 = new Js5ConfigGroup(2);
		aClass37_386 = new Js5ConfigGroup(3);
		aClass37_385 = new Js5ConfigGroup(4);
		INVTYPE = new Js5ConfigGroup(5);
		OBJECT_DEFINITIONS = new Js5ConfigGroup(6, 8);
		aClass37_428 = new Js5ConfigGroup(7);
		aClass37_391 = new Js5ConfigGroup(8, 8);
		NPC_DEFINITIONS = new Js5ConfigGroup(9, 7);
		ITEM_DEFINITIONS = new Js5ConfigGroup(10, 8);
		PARAMTYPE = new Js5ConfigGroup(11);
		ANIMATION_DEFINITIONS = new Js5ConfigGroup(12, 7);
		GRAPHICS_DEFINITIONS = new Js5ConfigGroup(13, 8);
		aClass37_437 = new Js5ConfigGroup(14, 10);
		aClass37_398 = new Js5ConfigGroup(15);
		aClass37_399 = new Js5ConfigGroup(16);
		aClass37_400 = new Js5ConfigGroup(17);
		AREATYPE = new Js5ConfigGroup(18);//.area
		aClass37_401 = new Js5ConfigGroup(19);
		aClass37_402 = new Js5ConfigGroup(20);
		aClass37_404 = new Js5ConfigGroup(21);
		aClass37_405 = new Js5ConfigGroup(22);
		aClass37_406 = new Js5ConfigGroup(23);
		aClass37_407 = new Js5ConfigGroup(24);
		aClass37_408 = new Js5ConfigGroup(25);
		GENERAL_MAPS = new Js5ConfigGroup(26, 5);
		CHATPHRASETYPE = new Js5ConfigGroup(27);//.chatphrase
		CHATCATTYPE = new Js5ConfigGroup(28);//.chatcat
		aClass37_412 = new Js5ConfigGroup(29);
		aClass37_413 = new Js5ConfigGroup(30);
		aClass37_403 = new Js5ConfigGroup(31);
		aClass37_415 = new Js5ConfigGroup(32);
		CURSORTYPE = new Js5ConfigGroup(33);//.cursor
		aClass37_456 = new Js5ConfigGroup(34);
		aClass37_418 = new Js5ConfigGroup(35);
		aClass37_419 = new Js5ConfigGroup(36);
		aClass37_420 = new Js5ConfigGroup(37);
		aClass37_388 = new Js5ConfigGroup(38);
		aClass37_422 = new Js5ConfigGroup(39);
		aClass37_423 = new Js5ConfigGroup(40);
		aClass37_411 = new Js5ConfigGroup(41);
		aClass37_425 = new Js5ConfigGroup(42);
		aClass37_426 = new Js5ConfigGroup(43);
		aClass37_427 = new Js5ConfigGroup(44);
		aClass37_387 = new Js5ConfigGroup(45);
		HITMARKTYPE = new Js5ConfigGroup(46);//.hitmark
		aClass37_430 = new Js5ConfigGroup(47);
		ITEMCODETYPE = new Js5ConfigGroup(48);//.itemcode
		CATEGORYTYPE = new Js5ConfigGroup(49);//.category
		aClass37_433 = new Js5ConfigGroup(50);
		aClass37_434 = new Js5ConfigGroup(51);
		aClass37_414 = new Js5ConfigGroup(53);
		aClass37_436 = new Js5ConfigGroup(54);
		VAR_PLAYER = new Js5ConfigGroup(60);//.var_player
		VAR_NPC = new Js5ConfigGroup(61);//.var_npc
		VAR_CLIENT = new Js5ConfigGroup(62);//.var_client
		VAR_WORLD = new Js5ConfigGroup(63);//.var_world
		VAR_REGION = new Js5ConfigGroup(64);//.var_region
		VAR_OBJECT = new Js5ConfigGroup(65);//.var_object
		VAR_CLAN = new Js5ConfigGroup(66);//.var_clan
		VAR_CLAN_SETTING = new Js5ConfigGroup(67);//.var_clan_setting
		aClass37_445 = new Js5ConfigGroup(68);
		VAR_BIT = new Js5ConfigGroup(69);//.var_bit
		GAMELOGEVENT = new Js5ConfigGroup(70);//.gamelogevent
		aClass37_421 = new Js5ConfigGroup(72);
		aClass37_435 = new Js5ConfigGroup(73);
		aClass37_450 = new Js5ConfigGroup(74);
		aClass37_451 = new Js5ConfigGroup(75);
		aClass37_452 = new Js5ConfigGroup(76);
		ANIMATION_CONFIG = new Js5ConfigGroup(77);
		aClass37_454 = new Js5ConfigGroup(78);
		aClass37_455 = new Js5ConfigGroup(79);
    }
    
    public int method1014(int i) {
	return i & (1 << -1961974377 * groupSizeInBits) - 1;
    }
    
    public int method1015(int i) {
	return i & (1 << -1961974377 * groupSizeInBits) - 1;
    }
    
    public int method1016() {
	return 1 << groupSizeInBits * -1961974377;
    }
    
    public int method1017() {
	return 1 << groupSizeInBits * -1961974377;
    }
    
    public int method1018(int i) {
	return i >>> groupSizeInBits * -1961974377;
    }
    
    public int method1019(int i) {
	return i >>> groupSizeInBits * -1961974377;
    }
    
    Js5ConfigGroup(int i) {
	this(i, 0);
    }
    
    public int method1020(int i) {
	return i & (1 << -1961974377 * groupSizeInBits) - 1;
    }
    
    public int method1021(int i) {
	return i & (1 << -1961974377 * groupSizeInBits) - 1;
    }
    
    public int method1022(int i) {
	return i & (1 << -1961974377 * groupSizeInBits) - 1;
    }
    
    public int method1023(int i) {
	return i >>> groupSizeInBits * -1961974377;
    }
    
    static boolean method1024(int i) {
    	return AnimationDefinitionLoader.method12315(ClanChannelUser.aClass499_5588.aClass533_6557, (byte) -38);
    }
    
    static final void method1025(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStackPointer -= 993556554;
	Class213.method4310
	    ((String) (((ClientScriptData) class454).objectStack
		       [-290357331 * ((ClientScriptData) class454).objectStackPointer]),
	     (String) (((ClientScriptData) class454).objectStack
		       [-290357331 * ((ClientScriptData) class454).objectStackPointer + 1]),
	     "",
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      == 1),
	     false, 1109641437);
    }
    
    public static InterfaceComponent getInterfaceComponent/*iFaceHash*/(int iFaceHash, byte i_3_) {
		int interfaceID = iFaceHash >> 16;
		try {
			if (null == Class187.aClass35Array2203[interfaceID]
			    || (Class187.aClass35Array2203[interfaceID].method997(iFaceHash, -1237655159) == null)) {
			    boolean bool = Class54.method1301(interfaceID, null, (byte) 36);
			    if (!bool) {
			    	return null;
			    }
			}
		} catch (RuntimeException ex) {
			System.err.println("InterfaceID: "+interfaceID+", childID: "+(iFaceHash & 0xffff));
			throw ex;
		}
		return Class187.aClass35Array2203[interfaceID].method997(iFaceHash, -1331804011);
    }
    
    static final void method1027(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.parentNode * -152977625;
    }
}
