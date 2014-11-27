/* Class405 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPCDefinitionLoader
{
    int anInt5887;
    Class129 aClass129_5888;
    Language currentLocale;//aClass437_5889
    JS5 npcDefContainer;//aClass210_5890
    JS5 modelDefContainer;//aClass210_5891
    Class129 npcDefCache = new Class129(64);//aClass129_5892
    Class129 aClass129_5893 = new Class129(50);
    GameDefinition currentGame;//aClass471_5894
    boolean onMembersServer;//aBool5895
    String[] defaultOptions;//aStringArray5896
    static int anInt5897;
    
    public void method7225() {
	synchronized (npcDefCache) {
	    npcDefCache.reset(172752262);
	}
	synchronized (aClass129_5893) {
	    aClass129_5893.reset(-751412868);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.reset(-569084886);
	}
    }
    
    public NPCDefinition getNpcDefinition/*method7226*/(int npcID, int i_0_) {
		NPCDefinition npc;
		synchronized (npcDefCache) {
			npc = ((NPCDefinition) npcDefCache.get((long) npcID));
		}
		if (null != npc) {
		    return npc;
		}
		byte[] data;
		synchronized (npcDefContainer) {
			data = (npcDefContainer.getfile
			  (Js5ConfigGroup.NPC_DEFINITIONS.getClientGroupId(npcID, (byte) 0),
			   Js5ConfigGroup.NPC_DEFINITIONS.getClientFileId(npcID, 1624663012), 620516475));
		}
		npc = new NPCDefinition();
		npc.npcID = npcID * -1152009019;
		npc.loader = this;
		npc.options = (String[]) defaultOptions.clone();
		if (null != data) {
			npc.read(new RSByteBuffer(data), (byte) -79);
		}
		npc.method7161(16711935);
		synchronized (npcDefCache) {
		    npcDefCache.put(npc, (long) npcID);
		}
		return npc;
    }
    
    public void method7227(boolean bool, short i) {
	if (bool != onMembersServer) {
	    onMembersServer = bool;
	    method7229(-1493609425);
	}
    }
    
    public void method7228(int i, int i_1_) {
	anInt5887 = i * -1176005419;
	synchronized (aClass129_5893) {
	    aClass129_5893.reset(-2101412869);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.reset(-67911490);
	}
    }
    
    public void method7229(int i) {
	synchronized (npcDefCache) {
	    npcDefCache.reset(-115456827);
	}
	synchronized (aClass129_5893) {
	    aClass129_5893.reset(-1027988769);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.reset(-1242651612);
	}
    }
    
    public void method7230(short i) {
	synchronized (aClass129_5893) {
	    aClass129_5893.reset(-717843589);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.reset(-357321802);
	}
    }
    
    public void method7231(int i, int i_2_) {
	synchronized (npcDefCache) {
	    npcDefCache.clean(i, -2118436288);
	}
	synchronized (aClass129_5893) {
	    aClass129_5893.clean(i, -2109895509);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.clean(i, -2141475283);
	}
    }
    
    public void method7232(int i) {
	synchronized (npcDefCache) {
	    npcDefCache.removeSoftReferences((byte) 60);
	}
	synchronized (aClass129_5893) {
	    aClass129_5893.removeSoftReferences((byte) -39);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.removeSoftReferences((byte) -21);
	}
    }
    
    public NPCDefinition dummyMethod7233(int i) {
	NPCDefinition class401;
	synchronized (npcDefCache) {
	    class401 = ((NPCDefinition)
			npcDefCache.get((long) i));
	}
	if (null != class401)
	    return class401;
	byte[] is;
	synchronized (npcDefContainer) {
	    is = (npcDefContainer.getfile
		  (Js5ConfigGroup.NPC_DEFINITIONS.getClientGroupId(i, (byte) -20),
		   Js5ConfigGroup.NPC_DEFINITIONS.getClientFileId(i, 934617593), 265969781));
	}
	class401 = new NPCDefinition();
	class401.npcID = i * -1152009019;
	((NPCDefinition) class401).loader = this;
	class401.options
	    = (String[]) defaultOptions.clone();
	if (null != is)
	    class401.read(new RSByteBuffer(is), (byte) -53);
	class401.method7161(16711935);
	synchronized (npcDefCache) {
	    npcDefCache.put(class401, (long) i);
	}
	return class401;
    }
    
    public void method7234() {
	synchronized (aClass129_5893) {
	    aClass129_5893.reset(-1784521730);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.reset(-1692575443);
	}
    }
    
    public void method7235() {
	synchronized (npcDefCache) {
	    npcDefCache.removeSoftReferences((byte) 21);
	}
	synchronized (aClass129_5893) {
	    aClass129_5893.removeSoftReferences((byte) -25);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.removeSoftReferences((byte) -6);
	}
    }
    
    public void method7236(int i) {
	anInt5887 = i * -1176005419;
	synchronized (aClass129_5893) {
	    aClass129_5893.reset(-559774431);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.reset(131462994);
	}
    }
    
    public void method7237(int i) {
	anInt5887 = i * -1176005419;
	synchronized (aClass129_5893) {
	    aClass129_5893.reset(-1276111771);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.reset(-1402276182);
	}
    }
    
    public void method7238() {
	synchronized (aClass129_5893) {
	    aClass129_5893.reset(-1439365954);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.reset(-1407627730);
	}
    }
    
    public void method7239(int i) {
	synchronized (npcDefCache) {
	    npcDefCache.clean(i, -2068237986);
	}
	synchronized (aClass129_5893) {
	    aClass129_5893.clean(i, -2007922982);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.clean(i, -2119096658);
	}
    }
    
    public NPCDefinition method7240(int i) {
	NPCDefinition class401;
	synchronized (npcDefCache) {
	    class401 = ((NPCDefinition)
			npcDefCache.get((long) i));
	}
	if (null != class401)
	    return class401;
	byte[] is;
	synchronized (npcDefContainer) {
	    is = (npcDefContainer.getfile
		  (Js5ConfigGroup.NPC_DEFINITIONS.getClientGroupId(i, (byte) -113),
		   Js5ConfigGroup.NPC_DEFINITIONS.getClientFileId(i, -878049613),
		   1149535666));
	}
	class401 = new NPCDefinition();
	class401.npcID = i * -1152009019;
	((NPCDefinition) class401).loader = this;
	class401.options
	    = (String[]) defaultOptions.clone();
	if (null != is)
	    class401.read(new RSByteBuffer(is), (byte) -116);
	class401.method7161(16711935);
	synchronized (npcDefCache) {
	    npcDefCache.put(class401, (long) i);
	}
	return class401;
    }
    
    public void method7241(int i) {
	anInt5887 = i * -1176005419;
	synchronized (aClass129_5893) {
	    aClass129_5893.reset(-1372727086);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.reset(34030023);
	}
    }
    
    public void method7242(int i) {
	anInt5887 = i * -1176005419;
	synchronized (aClass129_5893) {
	    aClass129_5893.reset(-2077899891);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.reset(-143854698);
	}
    }
    
    public NPCDefinitionLoader(GameDefinition game, Language locale, boolean p2p,
		    JS5 npcs, JS5 models) {
		aClass129_5888 = new Class129(5);
		currentGame = game;
		currentLocale = locale;
		onMembersServer = p2p;
		npcDefContainer = npcs;
		modelDefContainer = models;
		if (npcDefContainer != null) {
		    int i = npcDefContainer.getFileCount((byte) 100) - 1;
		    Js5ConfigGroup.NPC_DEFINITIONS.getGroupSize(-438528621);
		    npcDefContainer.getContainerCount(i, (byte) -125);
		}
		if (GameDefinition.RUNESCAPE == currentGame) {
		    defaultOptions = new String[] { 
		    		null, null, null, null, null,
		    		ClientMessage.EXAMINE.getLocalisedMessage(currentLocale, (short) 18776) };
		} else {
		    defaultOptions = new String[] { null, null, null, null, null, null };
		}
    }
    
    public void method7243(int i) {
	synchronized (npcDefCache) {
	    npcDefCache.clean(i, -2002260462);
	}
	synchronized (aClass129_5893) {
	    aClass129_5893.clean(i, -1994969336);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.clean(i, -1997265071);
	}
    }
    
    public void method7244(int i) {
	synchronized (npcDefCache) {
	    npcDefCache.clean(i, -2098863232);
	}
	synchronized (aClass129_5893) {
	    aClass129_5893.clean(i, -2065619293);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.clean(i, -2013670714);
	}
    }
    
    public void method7245() {
	synchronized (npcDefCache) {
	    npcDefCache.reset(-385241166);
	}
	synchronized (aClass129_5893) {
	    aClass129_5893.reset(-1964428848);
	}
	synchronized (aClass129_5888) {
	    aClass129_5888.reset(-651408847);
	}
    }
    
    static void method7246(Class103 class103, Class241_Sub41 class241_sub41,
			   Class515 class515, int i, int i_4_, int i_5_,
			   int i_6_, byte i_7_) {
	int i_8_ = i - 5;
	int i_9_ = i_4_ + 2;
	if (0 != 153554575 * class515.anInt6741)
	    class103.method2263(i_8_, i_9_, i_6_ + 10, i_4_ + i_5_ - i_9_ + 1,
				153554575 * class515.anInt6741, (byte) -56);
	if (0 != class515.anInt6767 * 1284846821)
	    class103.method2262(i_8_, i_9_, i_6_ + 10,
				1 + (i_5_ + i_4_ - i_9_),
				1284846821 * class515.anInt6767, 2140758106);
	int i_10_ = class515.anInt6750 * 2101573455;
	if (class241_sub41.aBool10155
	    && class515.anInt6736 * -2126282339 != -1)
	    i_10_ = class515.anInt6736 * -2126282339;
	Class355.aClass96_5452.method2114(class515.aString6756, i, i_4_, i_6_,
					  i_5_, ~0xffffff | i_10_,
					  (Class573_Sub1.aClass497_7374
					   .anInt6545) * -105193781,
					  1, 0, 0, null, null, null, 0, 0,
					  907934042);
    }
    
    public static void method7247
	(Class614 class614, int i, int i_11_, Class440 class440,
	 Class475_Sub1_Sub2_Sub1 class475_sub1_sub2_sub1, int i_12_) {
	ClientScriptData class454 = Class61.method1608(297780651);
	((ClientScriptData) class454).aClass475_Sub1_Sub2_Sub1_6223
	    = class475_sub1_sub2_sub1;
	Class519.method11667(class614, i, i_11_, class454, -1387611694);
	((ClientScriptData) class454).aClass475_Sub1_Sub2_Sub1_6223 = null;
    }
}
