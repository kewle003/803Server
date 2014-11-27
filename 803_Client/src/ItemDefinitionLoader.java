/* Class618 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config.objtype;
public class ItemDefinitionLoader implements Interface17 {
    public int num;//anInt7836
    Language currentLocale;//aClass437_7837
    boolean allowMembers;//aBool7838
    JS5 configClient;//aClass210_7839
    JS5 meshes;//aClass210_7840
    Class129 recentUse = new Class129(64);//aClass129_7841
    int anInt7842;
    Class129 aClass129_7843 = new Class129(50);
    public Class516 aClass516_7844 = new Class516(250);
    GameDefinition currentGame;//aClass471_7845
    ParamTypeList paramTL;//aClass616_7846
    Class633 aClass633_7847 = new Class633();
    String[] defaultGroundOptions;//aStringArray7848
    String[] defaultInventoryOptions;//aStringArray7849
    static Class446[] aClass446Array7850;
    
    public void method13280() {
	synchronized (recentUse) {
	    recentUse.reset(-359589385);
	}
	synchronized (aClass129_7843) {
	    aClass129_7843.reset(-243725770);
	}
	synchronized (aClass516_7844) {
	    aClass516_7844.method11612();
	}
    }
    
    public ItemDefinition list/*method13281*/(int itemID, short i_0_) {
		ItemDefinition item;
		synchronized (recentUse) {
			item = ((ItemDefinition) recentUse.get((long) itemID));
		}
		if (null != item) {
		    return item;
		}
		byte[] data;
		synchronized (configClient) {
			data = configClient.getfile(
		    		Js5ConfigGroup.ITEM_DEFINITIONS.getClientGroupId(itemID, (byte) -110),
		    		Js5ConfigGroup.ITEM_DEFINITIONS.getClientFileId(itemID, 605121072), -932596251);
		}
		item = new ItemDefinition();
		item.loader = this;
		item.itemID = itemID * 564604913;
		item.groundOptions = (String[]) defaultGroundOptions.clone();
		item.inventoryOptions = (String[]) defaultInventoryOptions.clone();
		if (data != null) {
			item.decode(new RSByteBuffer(data), (byte) 75);
		}
		item.postDecode(-1904562833);
		if (-1 != item.noteTemplateID * -1365591143) {
			item.toNote(
					list(-1365591143 * item.noteTemplateID, (short) 18717),
					list(-2142812803 * item.noteID, (short) 9798),
					-1388124720);
		}
		if (579904981 * item.anInt7923 != -1) {
			item.method13368(
					list(579904981 * item.anInt7923, (short) 7558),
					list(-1060868593 * item.anInt7904, (short) -10249),
					(byte) 105);
		}
		if (item.lendTemplateID * 1106873195 != -1) {
			item.toLend(
					list(item.lendTemplateID * 1106873195, (short) 8795),
					list(item.lendID * 1873329203, (short) 3905),
					-1600394914);
		}
		if (-1 != 911570241 * item.boughttemplate) {
			item.genBought(
					list(911570241 * item.boughttemplate, (short) -17837),
					list(115132331 * item.boughtlink, (short) 18186),
					315470030);
		}
		if (!allowMembers && item.membersOnly) {
			item.teamID = 0;
			item.groundOptions = defaultGroundOptions;
			item.inventoryOptions = defaultInventoryOptions;
			item.stockmarket = false;
			item.anIntArray7949 = null;
		    if (item.params != null) {
				boolean bool = false;
				for (Node class241 = item.params.method7294(2090894173);
						null != class241;
						class241 = item.params.method7295(1115743418)) {
					ParamType class603 = paramTL.list
					   ((int) (4356572401218184725L * class241.hashCode),
					    1616679988);
				    if (class603.autodisable) {
				    	class241.remove((byte) 36);
				    } else {
				    	bool = true;
				    }
				}
				if (!bool) {
					item.params = null;
				}
		    }
		}
		synchronized (recentUse) {
		    recentUse.put(item, (long) itemID);
		}
		return item;
    }
    
    public void method13282(int i, int i_1_) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2054357235);
		}
		synchronized (aClass129_7843) {
		    aClass129_7843.clean(i, -2114838792);
		}
		synchronized (aClass516_7844) {
		    aClass516_7844.method11620(i);
		}
    }
    
    public Class168 method13283
	(Class103 class103, Class103 class103_2_, int i, int i_3_, int i_4_,
	 int i_5_, boolean bool, boolean bool_6_, int i_7_, Class96 class96,
	 Class490 class490, GraphicsDefaults class513, int i_8_) {
	if (!bool_6_) {
	    Class168 class168 = method13296(class103_2_, i, i_3_, i_4_, i_5_,
					    i_7_, class490, (byte) 0);
	    if (null != class168)
		return class168;
	}
	ItemDefinition class623 = list(i, (short) -7765);
	if (i_3_ > 1 && ((ItemDefinition) class623).stackIds != null) {
	    int i_9_ = -1;
	    for (int i_10_ = 0; i_10_ < 10; i_10_++) {
		if (i_3_ >= ((ItemDefinition) class623).stackAmounts[i_10_]
		    && 0 != ((ItemDefinition) class623).stackAmounts[i_10_])
		    i_9_ = ((ItemDefinition) class623).stackIds[i_10_];
	    }
	    if (-1 != i_9_)
		class623 = list(i_9_, (short) -17014);
	}
	int[] is = class623.method13371(class103, class103_2_, i_3_, i_4_,
					i_5_, bool, i_7_, class96, class490,
					class513, 927526867);
	if (is == null)
	    return null;
	Class168 class168;
	if (bool_6_)
	    class168 = class103.method2259(is, 0, 36, 36, 32, (byte) -6);
	else
	    class168 = class103_2_.method2259(is, 0, 36, 36, 32, (byte) -27);
	if (!bool_6_) {
	    Class633 class633 = new Class633();
	    ((Class633) class633).anInt8061
		= 1058367763 * class103_2_.anInt1456;
	    ((Class633) class633).anInt8057 = i * 1162990405;
	    ((Class633) class633).anInt8058 = i_3_ * 2087323103;
	    ((Class633) class633).anInt8059 = i_4_ * -484703641;
	    ((Class633) class633).anInt8060 = i_5_ * -187395503;
	    ((Class633) class633).anInt8056 = -1454490979 * i_7_;
	    ((Class633) class633).aBool8062 = class490 != null;
	    aClass516_7844.method11609(class168, class633);
	}
	return class168;
    }
    
    public void setAllowMembers/*method13284*/(boolean bool, byte i) {
		if (allowMembers != bool) {
		    allowMembers = bool;
		    cacheReset((byte) 14);
		}
    }
    
    public void method13285(int i, int i_11_) {
		anInt7842 = i * 1044723855;
		synchronized (aClass129_7843) {
		    aClass129_7843.reset(337556386);
		}
    }
    
    public void method13286(int i) {
	synchronized (recentUse) {
	    recentUse.clean(i, -2012245054);
	}
	synchronized (aClass129_7843) {
	    aClass129_7843.clean(i, -2006318319);
	}
	synchronized (aClass516_7844) {
	    aClass516_7844.method11620(i);
	}
    }
    
    public void method13287() {
	synchronized (recentUse) {
	    recentUse.reset(-535947928);
	}
	synchronized (aClass129_7843) {
	    aClass129_7843.reset(-1679626264);
	}
	synchronized (aClass516_7844) {
	    aClass516_7844.method11612();
	}
    }
    
    public void method13288(int i) {
	synchronized (aClass129_7843) {
	    aClass129_7843.reset(-2136526850);
	}
    }
    
    public void method13289() {
	synchronized (aClass516_7844) {
	    aClass516_7844.method11612();
	}
    }
    
    public void method13290(int i) {
	synchronized (recentUse) {
	    recentUse.removeSoftReferences((byte) -17);
	}
	synchronized (aClass129_7843) {
	    aClass129_7843.removeSoftReferences((byte) -23);
	}
	synchronized (aClass516_7844) {
	    aClass516_7844.method11622();
	}
    }
    
    public Class168 method13291
	(Class103 class103, Class103 class103_12_, int i, int i_13_, int i_14_,
	 int i_15_, boolean bool, boolean bool_16_, int i_17_, Class96 class96,
	 Class490 class490, GraphicsDefaults class513) {
	if (!bool_16_) {
	    Class168 class168 = method13296(class103_12_, i, i_13_, i_14_,
					    i_15_, i_17_, class490, (byte) 0);
	    if (null != class168)
		return class168;
	}
	ItemDefinition class623 = list(i, (short) 403);
	if (i_13_ > 1 && ((ItemDefinition) class623).stackIds != null) {
	    int i_18_ = -1;
	    for (int i_19_ = 0; i_19_ < 10; i_19_++) {
		if (i_13_ >= ((ItemDefinition) class623).stackAmounts[i_19_]
		    && 0 != ((ItemDefinition) class623).stackAmounts[i_19_])
		    i_18_ = ((ItemDefinition) class623).stackIds[i_19_];
	    }
	    if (-1 != i_18_)
		class623 = list(i_18_, (short) 4510);
	}
	int[] is = class623.method13371(class103, class103_12_, i_13_, i_14_,
					i_15_, bool, i_17_, class96, class490,
					class513, -481953508);
	if (is == null)
	    return null;
	Class168 class168;
	if (bool_16_)
	    class168 = class103.method2259(is, 0, 36, 36, 32, (byte) 79);
	else
	    class168 = class103_12_.method2259(is, 0, 36, 36, 32, (byte) -127);
	if (!bool_16_) {
	    Class633 class633 = new Class633();
	    ((Class633) class633).anInt8061
		= 1058367763 * class103_12_.anInt1456;
	    ((Class633) class633).anInt8057 = i * 1162990405;
	    ((Class633) class633).anInt8058 = i_13_ * 2087323103;
	    ((Class633) class633).anInt8059 = i_14_ * -484703641;
	    ((Class633) class633).anInt8060 = i_15_ * -187395503;
	    ((Class633) class633).anInt8056 = -1454490979 * i_17_;
	    ((Class633) class633).aBool8062 = class490 != null;
	    aClass516_7844.method11609(class168, class633);
	}
	return class168;
    }
    
    public Class168 method13292(Class103 class103, int i, int i_20_, int i_21_,
				int i_22_, int i_23_, Class490 class490) {
	((Class633) aClass633_7847).anInt8061
	    = 1058367763 * class103.anInt1456;
	((Class633) aClass633_7847).anInt8057
	    = 1162990405 * i;
	((Class633) aClass633_7847).anInt8058
	    = 2087323103 * i_20_;
	((Class633) aClass633_7847).anInt8059
	    = -484703641 * i_21_;
	((Class633) aClass633_7847).anInt8060
	    = i_22_ * -187395503;
	((Class633) aClass633_7847).anInt8056
	    = i_23_ * -1454490979;
	((Class633) aClass633_7847).aBool8062
	    = null != class490;
	return ((Class168)
		aClass516_7844.method11606(aClass633_7847));
    }
    
    public Class168 method13293(Class103 class103, int i, int i_24_, int i_25_,
				int i_26_, int i_27_, Class490 class490) {
	((Class633) aClass633_7847).anInt8061
	    = 1058367763 * class103.anInt1456;
	((Class633) aClass633_7847).anInt8057
	    = 1162990405 * i;
	((Class633) aClass633_7847).anInt8058
	    = 2087323103 * i_24_;
	((Class633) aClass633_7847).anInt8059
	    = -484703641 * i_25_;
	((Class633) aClass633_7847).anInt8060
	    = i_26_ * -187395503;
	((Class633) aClass633_7847).anInt8056
	    = i_27_ * -1454490979;
	((Class633) aClass633_7847).aBool8062
	    = null != class490;
	return ((Class168)
		aClass516_7844.method11606(aClass633_7847));
    }
    
    public ItemDefinitionLoader(GameDefinition game, Language locale, boolean allowMembers,
		    ParamTypeList paramTL, JS5 itemsArchive, JS5 modelsArchive) {
		this.currentGame = game;
		this.currentLocale = locale;
		this.allowMembers = allowMembers;
		this.paramTL = paramTL;
		this.configClient = itemsArchive;
		this.meshes = modelsArchive;
		if (null != configClient) {
		    int i = configClient.getFileCount((byte) 58) - 1;
		    num = (i * Js5ConfigGroup.ITEM_DEFINITIONS.getGroupSize(-879660228)
				 + configClient.getContainerCount(i, (byte) -50)) * -1191402655;
		} else {
		    num = 0;
		}
		if (currentGame == GameDefinition.RUNESCAPE) {
		    defaultGroundOptions = new String[] { 
		    		null, null,
		    		ClientMessage.TAKE.getLocalisedMessage(currentLocale, (short) 19192),
		    		null, null,
		    		ClientMessage.EXAMINE.getLocalisedMessage((currentLocale), (short) 22621) };
		} else {
		    defaultGroundOptions = new String[] { 
		    		null, null,
		    		ClientMessage.TAKE.getLocalisedMessage(currentLocale, (short) 26088),
		    		null, null, null };
		}
		defaultInventoryOptions = new String[] { 
				null, null, null, null,
				ClientMessage.DROP.getLocalisedMessage(currentLocale, (short) 17827) };
    }
    
    public void method13294(boolean bool) {
	if (allowMembers != bool) {
	    allowMembers = bool;
	    cacheReset((byte) 93);
	}
    }
    
    public void method13295() {
	synchronized (aClass129_7843) {
	    aClass129_7843.reset(-1920484524);
	}
    }
    
    public Class168 method13296(Class103 class103, int i, int i_29_, int i_30_,
				int i_31_, int i_32_, Class490 class490,
				byte i_33_) {
	((Class633) aClass633_7847).anInt8061
	    = 1058367763 * class103.anInt1456;
	((Class633) aClass633_7847).anInt8057
	    = 1162990405 * i;
	((Class633) aClass633_7847).anInt8058
	    = 2087323103 * i_29_;
	((Class633) aClass633_7847).anInt8059
	    = -484703641 * i_30_;
	((Class633) aClass633_7847).anInt8060
	    = i_31_ * -187395503;
	((Class633) aClass633_7847).anInt8056
	    = i_32_ * -1454490979;
	((Class633) aClass633_7847).aBool8062
	    = null != class490;
	return ((Class168)
		aClass516_7844.method11606(aClass633_7847));
    }
    
    public void cacheReset/*method13297*/(byte i) {
		synchronized (recentUse) {
		    recentUse.reset(-1899593001);
		}
		synchronized (aClass129_7843) {
		    aClass129_7843.reset(-1693530539);
		}
		synchronized (aClass516_7844) {
		    aClass516_7844.method11612();
		}
    }
    
    public void method13298() {
	synchronized (aClass516_7844) {
	    aClass516_7844.method11612();
	}
    }
    
    public void method13299() {
	synchronized (aClass516_7844) {
	    aClass516_7844.method11612();
	}
    }
    
    public void method13300() {
	synchronized (aClass516_7844) {
	    aClass516_7844.method11612();
	}
    }
    
    public void method13301() {
	synchronized (aClass516_7844) {
	    aClass516_7844.method11612();
	}
    }
    
    public void method13302() {
	synchronized (aClass516_7844) {
	    aClass516_7844.method11612();
	}
    }
    
    public void method13303() {
	synchronized (aClass129_7843) {
	    aClass129_7843.reset(-1499938666);
	}
    }
    
    public void method13304(int i) {
	synchronized (recentUse) {
	    recentUse.clean(i, -2060310282);
	}
	synchronized (aClass129_7843) {
	    aClass129_7843.clean(i, -2041324026);
	}
	synchronized (aClass516_7844) {
	    aClass516_7844.method11620(i);
	}
    }
    
    public void method13305(int i) {
	anInt7842 = i * 1044723855;
	synchronized (aClass129_7843) {
	    aClass129_7843.reset(-904719985);
	}
    }
    
    public void method13306() {
	synchronized (aClass129_7843) {
	    aClass129_7843.reset(-995014919);
	}
    }
    
    public void method13307(int i) {
	synchronized (aClass516_7844) {
	    aClass516_7844.method11612();
	}
    }
    
    public ItemDefinition method13308(int itemID) {
		ItemDefinition item;
		synchronized (recentUse) {
			item = ((ItemDefinition) recentUse.get((long) itemID));
		}
		if (null != item) {
		    return item; 
		}
		byte[] is;
		synchronized (configClient) {
		    is = (configClient.getfile
			  (Js5ConfigGroup.ITEM_DEFINITIONS.getClientGroupId(itemID, (byte) -105),
			   Js5ConfigGroup.ITEM_DEFINITIONS.getClientFileId(itemID, -1083967456),
			   -135291286));
		}
		item = new ItemDefinition();
		item.loader = this;
		item.itemID = itemID * 564604913;
		item.groundOptions = (String[]) defaultGroundOptions.clone();
		item.inventoryOptions = (String[]) defaultInventoryOptions.clone();
		if (is != null) {
			item.decode(new RSByteBuffer(is), (byte) 97);
		}
		item.postDecode(-2090513504);
		if (-1 != item.noteTemplateID * -1365591143) {
			item.toNote(
					list(-1365591143 * item.noteTemplateID, (short) -2164),
					list(-2142812803 * item.noteID, (short) 12693),
					-807037888);
		}
		if (579904981 * item.anInt7923 != -1) {
			item.method13368(
					list(579904981 * item.anInt7923, (short) -9850),
					list(-1060868593 * item.anInt7904, (short) 2217),
					(byte) 67);
		}
		if (item.lendTemplateID * 1106873195 != -1) {
			item.toLend(
					list(item.lendTemplateID * 1106873195, (short) 2691),
					list(item.lendID * 1873329203, (short) -15976),
					-1597466233);
		}
		if (-1 != 911570241 * item.boughttemplate) {
			item.genBought(
					list(911570241 * item.boughttemplate, (short) 2965),
					list(115132331 * item.boughtlink, (short) 10665),
					322731046);
		}
		if (!allowMembers && item.membersOnly) {
			item.teamID = 0;
			item.groundOptions = defaultGroundOptions;
			item.inventoryOptions = defaultInventoryOptions;
			item.stockmarket = false;
			item.anIntArray7949 = null;
		    if (item.params != null) {
				boolean bool = false;
				for (Node class241 = item.params.method7294(2090894173);
				     null != class241;
				     class241 = item.params.method7295(1700855165)) {
				    ParamType class603 = paramTL.list(
				    		(int) (4356572401218184725L * class241.hashCode),
				    		46255549);
				    if (class603.autodisable) {
				    	class241.remove((byte) 36);
				    } else {
				    	bool = true;
				    }
				}
				if (!bool) {
					item.params = null;
				}
		    }
		}
		synchronized (recentUse) {
		    recentUse.put(item, (long) itemID);
		}
		return item;
    }
}
