/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class118
{
    public int[] anIntArray1555;
    public int anInt1556;
    public int[] anIntArray1557;
    int anInt1558;
    public Class135 aClass135_1559;
    public int anInt1560;
    
    public boolean method2932(int i, int i_0_) {
	if (i_0_ >= 0 && i_0_ < anIntArray1555.length) {
	    int i_1_ = anIntArray1555[i_0_];
	    if (i >= i_1_ && i <= i_1_ + anIntArray1557[i_0_])
		return true;
	}
	return false;
    }
    
    public boolean method2933(int i, int i_2_, byte i_3_) {
	if (i_2_ >= 0 && i_2_ < anIntArray1555.length) {
	    int i_4_ = anIntArray1555[i_2_];
	    if (i >= i_4_ && i <= i_4_ + anIntArray1557[i_2_])
		return true;
	}
	return false;
    }
    
    public boolean method2934(int i, int i_5_) {
	if (i_5_ >= 0 && i_5_ < anIntArray1555.length) {
	    int i_6_ = anIntArray1555[i_5_];
	    if (i >= i_6_ && i <= i_6_ + anIntArray1557[i_5_])
		return true;
	}
	return false;
    }
    
    public boolean method2935(int i, int i_7_) {
	if (i_7_ >= 0 && i_7_ < anIntArray1555.length) {
	    int i_8_ = anIntArray1555[i_7_];
	    if (i >= i_8_ && i <= i_8_ + anIntArray1557[i_7_])
		return true;
	}
	return false;
    }
    
    public boolean method2936(int i, int i_9_) {
	if (i_9_ >= 0 && i_9_ < anIntArray1555.length) {
	    int i_10_ = anIntArray1555[i_9_];
	    if (i >= i_10_ && i <= i_10_ + anIntArray1557[i_9_])
		return true;
	}
	return false;
    }
    
    Class118(int i, int i_11_, int[] is, int[] is_12_, Class135 class135,
	     int i_13_) {
	anInt1560 = i * 551815091;
	anInt1556 = -1801123039 * i_11_;
	anIntArray1557 = is;
	anIntArray1555 = is_12_;
	aClass135_1559 = class135;
	((Class118) this).anInt1558 = 462065397 * i_13_;
    }
    
    public boolean method2937(int i, int i_14_) {
	if (i_14_ >= 0 && i_14_ < anIntArray1555.length) {
	    int i_15_ = anIntArray1555[i_14_];
	    if (i >= i_15_ && i <= i_15_ + anIntArray1557[i_14_])
		return true;
	}
	return false;
    }
    
    //rs2.client.loading.Load
    static int runClientLoading/*method2938*/(byte i) {
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub25_8884
			.method14348((byte) -3)
		    == 0) {
		    for (int i_16_ = 0; i_16_ < client.anInt8314 * 705771489;
			 i_16_++) {
			if (client.anInterface58Array8315[i_16_]
				.getKeyChar((short) 1085) == 's'
			    || client.anInterface58Array8315[i_16_]
				   .getKeyChar((short) 1085) == 'S') {
			    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
				((Class241_Sub5_Sub9.aClass241_Sub9_11043
				  .aClass445_Sub25_8884),
				 1, (byte) 2);
			    client.aBool8422 = true;
			    Friend.method865(Class629.aClass629_8011, -895238901);
			    break;
			}
		    }
		}
		if (Class86.currentLoadingStage == LoadingScreenDef.LOADING_STAGE_0) {
		    if (null == Class281.aClass280_4428)
			Class281.aClass280_4428
			    = new Class280(Class117.aClass209_1552,
					   Class120_Sub15.aClass207_10542,
					   Class506.aClass291_6661,
					   RSAKeys.aBigInteger185,
					   RSAKeys.aBigInteger182);
		    if (!Class281.aClass280_4428.method5473((byte) 35))
			return 0;
		    HitMarkTypeList.method12292(0, null, true, 960267557);
		    Class68.aBool1058 = !Class120_Sub2.method15462(1392008204);
		    Class241_Sub34.aClass210_10087
			= IcmpService_Sub1.createArchive((Class68.aBool1058
							? Js5Archive.SPRITES_JAGEX_INDEX
							: Js5Archive.SPRITES_JPG_INDEX),
						       false, 1, true, true,
						       1831836332);
		    Class68.aClass210_1061 = IcmpService_Sub1.createArchive(
		    		Js5Archive.LOADING_SCREEN_INDEX, false, 1, true, true, 1831836332);
		    Class120_Sub7.FONTS_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.FONTMETRICS, false, 1, true, true, 1831836332);
		}
		if (Class86.currentLoadingStage == LoadingScreenDef.LOADING_STAGE_1) {
		    boolean bool = Class68.aClass210_1061.method4191((byte) 6);
		    int i_17_ = Class579.cacheFiles
				    [Js5Archive.LOADING_SCREEN_INDEX.getArchiveId((byte) -17)]
				    .method16600(1700133059);
		    i_17_ = (i_17_
			     + Class579.cacheFiles
				   [(Class68.aBool1058
				     ? Js5Archive.SPRITES_JAGEX_INDEX.getArchiveId((byte) -88)
				     : Js5Archive.SPRITES_JPG_INDEX.getArchiveId((byte) -127))]
				   .method16600(340270919));
		    i_17_ += Class579.cacheFiles
				 [Js5Archive.FONTMETRICS.getArchiveId((byte) -15)]
				 .method16600(1120740489);
		    i_17_ = i_17_ + (bool ? 100 : Class68.aClass210_1061.method4193(523985346));
		    if (i_17_ != 400)
			return i_17_ / 4;
		    Class421.anInt6039
			= (Class241_Sub34.aClass210_10087.method4195((byte) 42)
			   * 1182642419);
		    Class68.anInt1062
			= Class68.aClass210_1061.method4195((byte) 106) * -1996353575;
		    NPC.method18028(Class241_Sub34.aClass210_10087, 2056819023);
		    int i_18_ = Class241_Sub5_Sub9.aClass241_Sub9_11043
				    .aClass445_Sub9_8883.method14178(1965423754);
		    Class68.aClass615_1060
			= new Class615(client.currentGame, VarPlayerDomain.currentLocale,
				       Class68.aClass210_1061);
		    Class611[] class611s
			= Class68.aClass615_1060.method13256(i_18_, (byte) -57);
		    if (class611s.length == 0)
			class611s = Class68.aClass615_1060.method13256(0, (byte) -100);
		    Class371 class371 = new Class371(Class241_Sub34.aClass210_10087,
						     Class120_Sub7.FONTS_ARCHIVE);
		    if (class611s.length > 0) {
			Class68.anInterface37Array1056
			    = new Interface37[class611s.length];
			for (int i_19_ = 0;
			     i_19_ < Class68.anInterface37Array1056.length; i_19_++)
			    Class68.anInterface37Array1056[i_19_]
				= new Class353((Class68.aClass615_1060.method13250
						((-1242261547
						  * class611s[i_19_].anInt7765),
						 -1792685553)),
					       1932911825 * class611s[i_19_].anInt7764,
					       365567319 * class611s[i_19_].anInt7763,
					       class371);
		    }
		}
		if (Class86.currentLoadingStage == LoadingScreenDef.LOADING_STAGE_2)
		    Class425.aClass344_6080 = new Class344(Class241_Sub34.aClass210_10087,
				       Class120_Sub7.FONTS_ARCHIVE,
				       GPI.method4021((byte) 1));
		if (LoadingScreenDef.LOADING_STAGE_3 == Class86.currentLoadingStage) {
		    int i_20_ = Class425.aClass344_6080.method6156(1415710631);
		    int i_21_ = Class425.aClass344_6080.method6139((byte) 96);
		    if (i_20_ < i_21_)
			return i_20_ * 100 / i_21_;
		}
		if (Class86.currentLoadingStage == LoadingScreenDef.LOADING_STAGE_4) {
		    if (Class68.anInterface37Array1056 != null
			&& Class68.anInterface37Array1056.length > 0) {
			if (Class68.anInterface37Array1056[0].method199(995392036) < 100)
			    return 0;
			if (Class68.anInterface37Array1056.length > 1
			    && Class68.aClass615_1060.method13252(1916895623)
			    && (Class68.anInterface37Array1056[1].method199(47146161) < 100))
			    return 0;
		    }
		    Class425.aClass344_6080.method6135(client.anInterface26_8552, 1975378097);
		    Class446.method7897(Class236.aClass103_2713, 1870884058);
		    Class496.setClientStage(18, (byte) -48);
		}
		if (LoadingScreenDef.OPEN_JS5_ARCHIVES == Class86.currentLoadingStage) {
		    Class284.SPRITES_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.SPRITES_INDEX, false, 1, false, true, 1831836332);
		    Class187.aClass210_2204 = IcmpService_Sub1.createArchive(
		    		Js5Archive.SKELETON_INDEX, false, 1, false, true, 1831836332);
		    Class577.aClass210_7450 = IcmpService_Sub1.createArchive(
		    		Js5Archive.SKINS_INDEX, false, 1, false, true, 1831836332);
		    Class120_Sub2.CONFIG_ARCHIVE = IcmpService_Sub1.createArchive(
					Js5Archive.CONFIG, false, 1, true, true, 1831836332);
		    Class218_Sub5.INTERFACES_ARCHIVE = IcmpService_Sub1.createArchive(
					Js5Archive.INTERFACES_INDEX, false, 1, true, true, 1831836332);
		    Class120_Sub22.LANDSCAPES_ARCHIVE = IcmpService_Sub1.createArchive(
					Js5Archive.LANDSCAPES_INDEX, true, 1, false, true, 1831836332);
		    Class508.MODELS_ARCHIVE = IcmpService_Sub1.createArchive(
					Js5Archive.MODELS_INDEX, false, 1, false, true, 1831836332);
		    Class177.TEXTURES_ARCHIVE = IcmpService_Sub1.createArchive(
					Js5Archive.TEXTURES_INDEX, true, 1, false, true, 1831836332);
		    Class223.GRAPHIC_CONFIG_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.GFX_CONFIG, true, 1, false, true, 1831836332);
		    Class209.HUFFMAN_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.BINARY, false, 1, false, true, 1831836332);
		    Class547.CS2_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.CS2_INDEX, false, 1, true, true, 1831836332);
		    if (!Class84.aBool1159) {
		    	AnimationConfigLoader.aClass210_6996 = IcmpService_Sub1.createArchive(
		    			Js5Archive.VORBIS, true, 1, false, false, 1831836332);
		    	Class507.aClass210_6671 = IcmpService_Sub1.createArchive(
		    			Js5Archive.AUDIO_INDEX, true, 1, false, false, 1831836332);
		    }
		    Class496.OBJECTS_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.OBJECTS_INDEX, false, 1, true, true, 1831836332);
		    Class132.CS2_MAPS_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.CS2_MAPS_INDEX, false, 1, true, true, 1831836332);
		    Js5Archive.NPCS_ARCHIVE = IcmpService_Sub1.createArchive(
					Js5Archive.NPCS_INDEX, false, 1, true, true, 1831836332);
		    Class640.ITEMS_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.ITEMS_INDEX, false, 1, true, true, 1831836332);
		    Class601.ANIMATIONS_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.ANIMATIONS_INDEX, false, 1, true, true, 1831836332);
		    Class452.GRAPHICS_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.GRAPHICS_INDEX, false, 1, true, true, 1831836332);
		    Class117.GENERAL_MAPS_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.GENERAL_MAPS_INDEX, false, 1, true, true, 1831836332);
		    Class608.WORLD_MAP_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.WORLD_MAP_INDEX, true, 1, false, true, 1831836332);
		    Class630.QC_MESSAGE_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.QUICK_CHAT_MESSAGES_INDEX, false, 1, true, true, 1831836332);
		    Class445_Sub23.QC_MENU_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.QUICK_CHAT_MENUS_INDEX, false, 1, true, true, 1831836332);
		    Class565.aClass210_7321 = IcmpService_Sub1.createArchive(
		    		Js5Archive.aClass56_727, true, 1, true, true, 1831836332);
		    Player.aClass210_11519 = IcmpService_Sub1.createArchive(
		    		Js5Archive.MAP_EFFECT_INDEX, false, 1, true, true, 1831836332);
		    Class349.DEFAULTS_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.DEFAULTS, true, 1, true, true, 1831836332);
		    Class394.aClass210_5769 = IcmpService_Sub1.createArchive(
		    		Js5Archive.aClass56_723, false, 1, true, true, 1831836332);
		    Class112.aClass210_1527 = IcmpService_Sub1.createArchive(
		    		Js5Archive.aClass56_729, true, 1, false, true, 1831836332);
		    Class505.DLLS_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.DLLS, true, 1, false, true, 1831836332);
		    Class200.SHADERS_ARCHIVE = IcmpService_Sub1.createArchive(
		    		Js5Archive.SHADERS, true, 1, true, true, 1831836332);
		    SoundManager.aClass210_672 = IcmpService_Sub1.createArchive(
		    		Js5Archive.aClass56_731, true, 2, false, true, 1831836332);
		}
		if (LoadingScreenDef.GET_JS5_INDEXES == Class86.currentLoadingStage) {
		    int i_22_ = 0;
		    for (int i_23_ = 0; i_23_ < Class579.cacheFiles.length; i_23_++) {
		    	if (null != Class579.cacheFiles[i_23_]) {
		    		i_22_ += (Class579.cacheFiles[i_23_].method16600(712627263)
		    				* Class68.anIntArray1057[i_23_] / 100);
		    	}
		    }
		    if (100 != i_22_) {
				if (-1522821071 * Class68.anInt1066 < 0) {
				    Class68.anInt1066 = i_22_ * 309641425;
					return (100 * (i_22_ - Class68.anInt1066 * -1522821071)
							/ (100 - Class68.anInt1066 * -1522821071));
				}
		    }
		    Class537.method11902(Class284.SPRITES_ARCHIVE, 821993219);
		    Class425.aClass344_6080 = new Class344(Class284.SPRITES_ARCHIVE,
				       Class120_Sub7.FONTS_ARCHIVE,
				       GPI.method4021((byte) 1));
		}
		if (Class86.currentLoadingStage == LoadingScreenDef.SETUP_SOUND_LIBRARY) {
		    byte[] data = Class349.DEFAULTS_ARCHIVE.method4194((692631693
								    * (DefaultsGroup.AUDIO.js5GroupId)), -227431623);
		    if (data == null) {
		    	return 0;
		    }
		    Class402.soundManager = new SoundManager();
		    if (!Class84.aBool1159) {
		    	Class402.soundManager.init(50, 7340032, -1684746143);
		    }
		    Class478.method10957(data, 705870220);
		    Class496.setClientStage(15, (byte) -60);
		}
		if (LoadingScreenDef.LOADING_STAGE_8 == Class86.currentLoadingStage
				&& Class120_Sub18.aClass585_10604 == null) {
		    Class120_Sub18.aClass585_10604 = new Class585(Class505.DLLS_ARCHIVE);
		    Class25.method942(Class120_Sub18.aClass585_10604, -1959711826);
		}
		if (LoadingScreenDef.DOWNLOAD_STUFF == Class86.currentLoadingStage) {
		    int i_24_ = Class331.method6041((short) -19000);
		    if (i_24_ < 100) {
		    	return i_24_;
		    }
		    Class50.method1252(Class349.DEFAULTS_ARCHIVE.method4194(
		    		DefaultsGroup.MAP.js5GroupId * 692631693, 1085406034),
		    		744412524);
		    Class128.aClass513_1589 = new GraphicsDefaults(Class349.DEFAULTS_ARCHIVE);
		    Class558.aShortArrayArray7261 = Class128.aClass513_1589.aShortArrayArray6718;
		    Class561.aShortArrayArrayArray7298 = Class128.aClass513_1589.aShortArrayArrayArray6715;
		    if (-2039269609 * Class128.aClass513_1589.anInt6725 != -1
		    		&& -1 != 647191093 * Class128.aClass513_1589.anInt6707) {
				client.anInt8432 = -1593550931 * Class128.aClass513_1589.anInt6725;
				client.anInt8433 = 1364787971 * Class128.aClass513_1589.anInt6707;
		    }
		    Class506.aClass504_6662 = new Class504(Class349.DEFAULTS_ARCHIVE);
		    Class227.skillTypeList = new SkillDefaults(Class349.DEFAULTS_ARCHIVE);
		    ClanChannelUser.aClass499_5588 = new Class499(Class349.DEFAULTS_ARCHIVE);
		    Class218_Sub3.aClass491_10256 = new Class491(Class349.DEFAULTS_ARCHIVE);
		    Class573.aClass497_7374 = new ErrorDefaults(Class349.DEFAULTS_ARCHIVE);
		}
		if (LoadingScreenDef.SETUP_CONFIG_DECODERS == Class86.currentLoadingStage) {
		    if (-1 != Class128.aClass513_1589.anInt6711 * 313906813
			&& !Class508.MODELS_ARCHIVE.method4188(((Class128
								 .aClass513_1589
								 .anInt6711)
								* 313906813),
							       0, -589744809)) {
		    	return 99;
		    }
		    Class234.aClass107_2699 = new Class107(Class565.aClass210_7321);
		    Class120_Sub5.anInterface6_10485 = new Class162(Class177.TEXTURES_ARCHIVE, Class223.GRAPHIC_CONFIG_ARCHIVE);
		    Class621.paramTypeList = new ParamTypeList(client.currentGame, VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class79.aClass539_1138 = new Class539(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		Class120_Sub2.CONFIG_ARCHIVE, Class506.aClass504_6662);
		    GameShell3.cursorTypeList = new CursorTypeList(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		Class120_Sub2.CONFIG_ARCHIVE, Class284.SPRITES_ARCHIVE);
		    Class105_Sub1.cs2MapsList = new CS2MapList(
		    		client.currentGame, VarPlayerDomain.currentLocale, Class132.CS2_MAPS_ARCHIVE);
		    Class371.aClass476_5573 = new Class476(
		    		client.currentGame, VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class120_Sub12.aClass394_10530 = new Class394(
		    		client.currentGame, VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class633.hitMarkTypeList = new HitMarkTypeList(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		Class120_Sub2.CONFIG_ARCHIVE, Class284.SPRITES_ARCHIVE);
		    IncommingOpcode.aClass581_5298 = new Class581(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		Class120_Sub2.CONFIG_ARCHIVE, Class284.SPRITES_ARCHIVE);
		    CS2MapList.aClass350_6031 = new Class350(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		Class120_Sub2.CONFIG_ARCHIVE, Class508.MODELS_ARCHIVE);
		    Class409.aClass617_5932 = new InvTypeList(
		    		client.currentGame, VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class120_Sub8.aClass619_10502 = new Class619(
		    		client.currentGame, VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class43.objectDefLoader = new ObjectDefinitionLoader(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		true, Class496.OBJECTS_ARCHIVE, Class508.MODELS_ARCHIVE);
		    client.aClass238_8477.method4760(Class43.objectDefLoader, 1756482407);
		    Class277.aClass236_4389.method4703(
		    		new ObjectDefinitionLoader(
		    				client.currentGame, VarPlayerDomain.currentLocale,
		    				true, Class496.OBJECTS_ARCHIVE,
		    				Class508.MODELS_ARCHIVE),
		    		948040873);
		    Class441.aClass524_6158 = new Class524(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		Class120_Sub2.CONFIG_ARCHIVE,
		    		Class284.SPRITES_ARCHIVE);
		    Class8.aClass598_46 = new Class598(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		Class120_Sub2.CONFIG_ARCHIVE,
		    		Class284.SPRITES_ARCHIVE);
		    MasterIndex.npcDefLoader = new NPCDefinitionLoader(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		true, Js5Archive.NPCS_ARCHIVE,
		    		Class508.MODELS_ARCHIVE);
		    JS5.itemDefLoader = new ItemDefinitionLoader(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		true, Class621.paramTypeList,
		    		Class640.ITEMS_ARCHIVE,
		    		Class508.MODELS_ARCHIVE);
		    Class326_Sub3.aClass482_10288 = new Class482(client.currentGame, VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE, true);
		    Class219.animationConfigLoader = new AnimationConfigLoader(client.currentGame, VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class394.animationDefLoader = new AnimationDefinitionLoader(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		Class601.ANIMATIONS_ARCHIVE,
		    		Class187.aClass210_2204,
		    		Class577.aClass210_7450,
		    		Class219.animationConfigLoader);
		    Class380.aClass577_5657 = new Class577(client.currentGame, VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class326.aClass74_5015 = new Class74(client.currentGame, VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class240.graphicsDefLoader = new GraphicsDefinitionLoader(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		Class452.GRAPHICS_ARCHIVE,
		    		Class508.MODELS_ARCHIVE);
		    Class610.generalMapList = new GeneralMapList(client.currentGame, VarPlayerDomain.currentLocale,  Class117.GENERAL_MAPS_ARCHIVE, true);
		    Class463.VAR_CLIENT_LIST = new VarBasicTypeListClient(
		    		client.currentGame, VarDomainType.CLIENT,
		    		VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class177.VAR_PLAYER_LIST = new VarPlayerTypeListClient(
		    		client.currentGame, VarDomainType.PLAYER,
		    		VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class333.VAR_NPC_LIST = new VarBasicTypeListClient(
		    		client.currentGame, VarDomainType.NPC,
		    		VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class443.VAR_CLAN_LIST = new VarBasicTypeListClient(
		    		client.currentGame, VarDomainType.CLAN,
		    		VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    VarBitType.VAR_CLAN_SETTINGS_LIST = new VarBasicTypeListClient(
		    		client.currentGame, VarDomainType.CLAN_SETTING,
		    		VarPlayerDomain.currentLocale, Class120_Sub2.CONFIG_ARCHIVE);
		    Class611.varTypes = Class395.method7099(new VarTypeList[]
					       { Class463.VAR_CLIENT_LIST,
						 Class177.VAR_PLAYER_LIST,
						 Class333.VAR_NPC_LIST,
						 Class443.VAR_CLAN_LIST,
						 VarBitType.VAR_CLAN_SETTINGS_LIST },
					      (byte) -80);
		    Class541.aClass199_Sub1_7008 = new VarBitTypeListClient(
		    		client.currentGame, VarPlayerDomain.currentLocale,
		    		Class120_Sub2.CONFIG_ARCHIVE, Class611.varTypes);
		    Class215.anInterface13_2523 = new Class349();
		    Class222.method4489(Class218_Sub5.INTERFACES_ARCHIVE,
					Class508.MODELS_ARCHIVE,
					Class284.SPRITES_ARCHIVE,
					Class120_Sub7.FONTS_ARCHIVE, 1765768971);
		    Class10.method578(Class394.aClass210_5769, 1062612809);
		    Class123.aClass292_1579 = new Class292(
		    		VarPlayerDomain.currentLocale, Class630.QC_MESSAGE_ARCHIVE, 
		    		Class445_Sub23.QC_MENU_ARCHIVE);
		    Class72.aClass625_1100 = new Class625(
		    		VarPlayerDomain.currentLocale, Class630.QC_MESSAGE_ARCHIVE,
		    		Class445_Sub23.QC_MENU_ARCHIVE, new Class336());
		    Class1.aClass19_11 = new Class19(Class177.VAR_PLAYER_LIST,
				      Class541.aClass199_Sub1_7008,
				      Class227.skillTypeList.method11448(1279219151));
		    Class561.method12369(262144);
		    IntegerNode.setAnimationLoader(Class394.animationDefLoader, -530902987);
		    Class380_Sub3_Sub3.method17455(Player.aClass210_11519, -27844279);
		    JS5.method4279(Class508.MODELS_ARCHIVE,
					Class234.aClass107_2699,
					Class120_Sub5.anInterface6_10485, 1453107869);
		    Huffman huffman = new Huffman(
		    		Class209.HUFFMAN_ARCHIVE.readContainerByIndentifiers("huffman", "", 955117413));
		    WorldTile.setHuffman(huffman, 1298835130);
		    Class124.aClass593_1580 = Class4.method472((byte) 4);
		    Class6.aClass241_Sub12_38 = new Class241_Sub12(true);
		}
		if (LoadingScreenDef.LOADING_STAGE_11 == Class86.currentLoadingStage) {
		    int i_25_ = (Class384.method6948(Class284.SPRITES_ARCHIVE, 1230328916)
			   + Class425.aClass344_6080.method6165(true, -1276005822));
		    int i_26_ = (Class222.method4488(-337959729)
				 + Class425.aClass344_6080.method6139((byte) 87));
		    if (i_25_ < i_26_) {
		    	return i_25_ * 100 / i_26_;
		    }
		}
		if (LoadingScreenDef.LOADING_STAGE_12 == Class86.currentLoadingStage)
		    Class573.method12554(Class608.WORLD_MAP_ARCHIVE,
					 Class371.aClass476_5573,
					 Class120_Sub12.aClass394_10530,
					 client.aClass238_8477.getObjectLoader(-1986970131),
					 Class441.aClass524_6158, Class8.aClass598_46,
					 Class1.aClass19_11, Class1.aClass19_11);
		if (Class86.currentLoadingStage == LoadingScreenDef.SETUP_VARC_SYSTEM) {
		    Class473.varClientDomain = new VarClientDomain(Class463.VAR_CLIENT_LIST);
		    Class470.method10770(803895169);
		    Class120_Sub22.LANDSCAPES_ARCHIVE.method4217(false, true, 1591782305);
		    Class284.SPRITES_ARCHIVE.method4217(true, true, 1591782305);
		    Class120_Sub7.FONTS_ARCHIVE.method4217(true, true, 1591782305);
		    Class209.HUFFMAN_ARCHIVE.method4217(true, true, 1591782305);
		    client.aBool8303 = true;
		}
		if (LoadingScreenDef.LOADING_STAGE_14 == Class86.currentLoadingStage
		    && Class128.aClass513_1589.login_interface * 1972130549 != -1) {
		    if (!Class54.method1301((1972130549 * Class128.aClass513_1589.login_interface),
					    null, (byte) -18)) {
		    	return 0;
		    }
		    boolean bool = true;
		    for (int i_27_ = 0;
		    		i_27_ < Class187.aClass35Array2203[1972130549 * Class128.aClass513_1589.login_interface].components.length;
		    		i_27_++) {
				InterfaceComponent class58
				    = (Class187.aClass35Array2203
				       [1972130549 * Class128.aClass513_1589.login_interface]
				       .components[i_27_]);
				if (5 == class58.componentType * -1579470857
				    && -1 != class58.spriteID * 1032303763
				    && !Class284.SPRITES_ARCHIVE.method4188((class58.spriteID * 1032303763),
									   0, -1193480362))
				    bool = false;
		    }
		    if (!bool) {
		    	return 0;
		    }
		}
		if (Class86.currentLoadingStage == LoadingScreenDef.LOADING_STAGE_15) {
		    Class291.method5685(true, -1019877058);
		}
		if (Class86.currentLoadingStage == LoadingScreenDef.LOADING_STAGE_16) {
		    CcDeltaNode.aClass70_9022.method1703((byte) -63);
		    try {
		    	Class384.aThread5701.join();
		    } catch (InterruptedException interruptedexception) {
		    	return 0;
		    }
		    CcDeltaNode.aClass70_9022 = null;
		    Class384.aThread5701 = null;
		    Class241_Sub34.aClass210_10087 = null;
		    Class68.aClass210_1061 = null;
		    Class68.aClass615_1060 = null;
		    Class68.anInterface37Array1056 = null;
		    Class134.method3093((byte) 29);
		    client.aBool8331
			= Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub25_8884.method14348((byte) -15) == 1;
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub25_8884,
			 1, (byte) 2);
		    if (client.aBool8331)
			Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub11_8879),
			     0, (byte) 2);
		    else if ((Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub11_8879.aBool8645)
			     && Class6.aClass241_Sub12_38.anInt8940 * -2096187941 < 512
			     && -2096187941 * Class6.aClass241_Sub12_38.anInt8940 != 0)
			Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			    ((Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub11_8879),
			     0, (byte) 2);
		    Class167.method3600((short) 20530);
		    if (client.aBool8331) {
			GraphicsDefaults.method11570(0, false, 1945822518);
			if (!client.aBool8422)
			    Friend.method865(Class629.aClass629_8012, -2096411059);
		    } else {
				GraphicsDefaults.method11570(Class241_Sub5_Sub9
							 .aClass241_Sub9_11043
							 .aClass445_Sub11_8879
							 .method14197((byte) -62),
						     false, 1945822518);
				if (Class241_Sub5_Sub9.aClass241_Sub9_11043
					.aClass445_Sub11_8879.method14197((byte) 22) == 0) {
				    Friend.method865(Class629.aClass629_8013, -1511297083);
				}
		    }
		    Class537.method11899(Class241_Sub5_Sub9.aClass241_Sub9_11043
					     .aClass445_Sub30_8878
					     .method14386(-801965113),
					 -1, -1, false, 1482319719);
		    Class425.aClass344_6080.method6135(client.anInterface26_8552,
						       1919515518);
		    Class446.method7897(Class236.aClass103_2713, 1213727921);
		    LoadingScreenDef.method6481(Class236.aClass103_2713,
					Class284.SPRITES_ARCHIVE, 2147483647);
		    Class384.method6947(Class445_Sub9.aClass168Array8642, 1543190687);
		}
		return Class105.method2663(262144);
    }
    
    static final void method2939(ClientScriptData class454, byte i) {
	int i_28_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_28_, (byte) -110);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_28_ >> 16];
	Class422.method7557(class58, class35, class454, (byte) 52);
    }
    
    static final void method2940(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_29_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_30_ = (((ClientScriptData) class454).integerStack
		     [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_31_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 2]);
	if (i_30_ == -1)
	    throw new RuntimeException();
	ClientScriptMap class406
	    = Class105_Sub1.cs2MapsList.list(i_30_, (byte) -85);
	if (i_29_ != class406.aChar5898)
	    throw new RuntimeException();
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class406.method7254(Integer.valueOf(i_31_), 1006214885) ? 1 : 0;
    }
    
    static final void method2941(ClientScriptData class454, int i) {
	throw new RuntimeException("");
    }
}
