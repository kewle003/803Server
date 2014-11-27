/* Class532 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ObjectDefinitionLoader
{
    JS5 objectDefContainer;//aClass210_6953
    GameDefinition currentGame;//aClass471_6954
    boolean onMembersServer;//aBool6955
    Class129 aClass129_6956;
    JS5 modelDefContainer;//aClass210_6957
    public static final int anInt6958 = 256;
    Class129 objectDefCache = new Class129(256);//aClass129_6959
    Class129 aClass129_6960 = new Class129(500);
    Class129 aClass129_6961;
    Language currentLocale;//aClass437_6962
    int anInt6963;
    String[] defaultOptions;//aStringArray6964
    Class161[] aClass161Array6965;
    Class399 aClass399_6966;
    
    public void method11849(short i) {
	synchronized (objectDefCache) {
	    objectDefCache.reset(-700812856);
	}
	synchronized (aClass129_6960) {
	    aClass129_6960.reset(-1904238202);
	}
	synchronized (aClass129_6956) {
	    aClass129_6956.reset(-587968127);
	}
	synchronized (aClass129_6961) {
	    aClass129_6961.reset(-2066169145);
	}
	aClass161Array6965 = new Class161[4];
	aClass399_6966 = new Class399(null, null);
    }
    
    public ObjectDefinition getObjectDefinition/*method11850*/(int objectID, int i_0_) {
		ObjectDefinition object;
		synchronized (objectDefCache) {
			object = ((ObjectDefinition)
				objectDefCache.get((long) objectID));
		}
		if (null != object) {
		    return object;
		}
		byte[] data;
		synchronized (objectDefContainer) {
			data = objectDefContainer.getfile(
		    		Js5ConfigGroup.OBJECT_DEFINITIONS.getClientGroupId(objectID, (byte) -49),
		    		Js5ConfigGroup.OBJECT_DEFINITIONS.getClientFileId(objectID, 708959536), 2001394804);
		}
		object = new ObjectDefinition();
		object.objectID = objectID * 361475065;
		object.loader = this;
		object.options = (String[]) defaultOptions.clone();
		if (null != data) {
			object.decode(new RSByteBuffer(data), -625411542);
		}
		object.postDecodeEvent((byte) 2);
		if (object.clippingFlag) {
			object.clipType = 0;
		}
		if (!onMembersServer && object.membersObject) {
			object.options = null;
			object.anIntArray6833 = null;
		}
		synchronized (objectDefCache) {
		    objectDefCache.put(object, (long) objectID);
		}
		return object;
    }
    
    public void method11851(boolean bool, int i) {
	if (onMembersServer != bool) {
	    onMembersServer = bool;
	    method11849((short) -1269);
	}
    }
    
    public void method11852(int i, int i_1_) {
	anInt6963 = i * -469617735;
	synchronized (aClass129_6960) {
	    aClass129_6960.reset(-55516398);
	}
	synchronized (aClass129_6956) {
	    aClass129_6956.reset(277136276);
	}
	synchronized (aClass129_6961) {
	    aClass129_6961.reset(-357298525);
	}
    }
    
    public void method11853(int i, int i_2_) {
	objectDefCache = new Class129(i);
    }
    
    public ObjectDefinition method11854(int i) {
	ObjectDefinition class526;
	synchronized (objectDefCache) {
	    class526 = ((ObjectDefinition)
			objectDefCache.get((long) i));
	}
	if (null != class526)
	    return class526;
	byte[] is;
	synchronized (objectDefContainer) {
	    is = (objectDefContainer.getfile
		  (Js5ConfigGroup.OBJECT_DEFINITIONS.getClientGroupId(i, (byte) -4),
		   Js5ConfigGroup.OBJECT_DEFINITIONS.getClientFileId(i, -962097787),
		   2061403416));
	}
	class526 = new ObjectDefinition();
	class526.objectID = i * 361475065;
	((ObjectDefinition) class526).loader = this;
	class526.options
	    = (String[]) defaultOptions.clone();
	if (null != is)
	    class526.decode(new RSByteBuffer(is), 1168864208);
	class526.postDecodeEvent((byte) 2);
	if (((ObjectDefinition) class526).clippingFlag)
	    class526.clipType = 0;
	if (!onMembersServer && class526.membersObject) {
	    class526.options = null;
	    class526.anIntArray6833 = null;
	}
	synchronized (objectDefCache) {
	    objectDefCache.put(class526, (long) i);
	}
	return class526;
    }
    
    public void method11855(int i, byte i_3_) {
	synchronized (objectDefCache) {
	    objectDefCache.clean(i, -2032905439);
	}
	synchronized (aClass129_6960) {
	    aClass129_6960.clean(i, -2137837779);
	}
	synchronized (aClass129_6956) {
	    aClass129_6956.clean(i, -2041655205);
	}
	synchronized (aClass129_6961) {
	    aClass129_6961.clean(i, -2049172318);
	}
    }
    
    public void method11856(byte i) {
	synchronized (objectDefCache) {
	    objectDefCache.removeSoftReferences((byte) 9);
	}
	synchronized (aClass129_6960) {
	    aClass129_6960.removeSoftReferences((byte) 26);
	}
	synchronized (aClass129_6956) {
	    aClass129_6956.removeSoftReferences((byte) -60);
	}
	synchronized (aClass129_6961) {
	    aClass129_6961.removeSoftReferences((byte) -13);
	}
    }
    
    public ObjectDefinitionLoader(GameDefinition game, Language locale, boolean bool,
		    JS5 objects, JS5 models) {
		aClass129_6956 = new Class129(30);
		aClass129_6961 = new Class129(50);
		aClass161Array6965 = new Class161[4];
		aClass399_6966 = new Class399(null, null);
		currentGame = game;
		currentLocale = locale;
		onMembersServer = bool;
		objectDefContainer = objects;
		modelDefContainer = models;
		if (null != objectDefContainer) {
		    int i = objectDefContainer.getFileCount((byte) 12) - 1;
		    Js5ConfigGroup.OBJECT_DEFINITIONS.getGroupSize(-1730636790);
		    objectDefContainer.getContainerCount(i, (byte) -82);
		}
		if (currentGame == GameDefinition.RUNESCAPE) {
		    defaultOptions = new String[] { 
				null, null, null, null, null,
				ClientMessage.EXAMINE.getLocalisedMessage(currentLocale, (short) 26280) };
		} else {
		    defaultOptions = new String[] { null, null, null, null, null, null };
		}
    }
    
    public void method11857(int i) {
	anInt6963 = i * -469617735;
	synchronized (aClass129_6960) {
	    aClass129_6960.reset(-2131816423);
	}
	synchronized (aClass129_6956) {
	    aClass129_6956.reset(-1281747478);
	}
	synchronized (aClass129_6961) {
	    aClass129_6961.reset(296698185);
	}
    }
    
    public ObjectDefinition method11858(int i) {
		ObjectDefinition class526;
		synchronized (objectDefCache) {
		    class526 = ((ObjectDefinition)
				objectDefCache.get((long) i));
		}
		if (null != class526)
		    return class526;
		byte[] is;
		synchronized (objectDefContainer) {
		    is = (objectDefContainer.getfile
			  (Js5ConfigGroup.OBJECT_DEFINITIONS.getClientGroupId(i, (byte) -21),
			   Js5ConfigGroup.OBJECT_DEFINITIONS.getClientFileId(i, 1048664011),
			   -563903011));
		}
		class526 = new ObjectDefinition();
		class526.objectID = i * 361475065;
		((ObjectDefinition) class526).loader = this;
		class526.options = (String[]) defaultOptions.clone();
		if (null != is)
		    class526.decode(new RSByteBuffer(is), -1329112984);
		class526.postDecodeEvent((byte) 2);
		if (((ObjectDefinition) class526).clippingFlag)
		    class526.clipType = 0;
		if (!onMembersServer && class526.membersObject) {
		    class526.options = null;
		    class526.anIntArray6833 = null;
		}
		synchronized (objectDefCache) {
		    objectDefCache.put(class526, (long) i);
		}
		return class526;
    }
    
    public void method11859(boolean bool) {
	if (onMembersServer != bool) {
	    onMembersServer = bool;
	    method11849((short) -13267);
	}
    }
    
    public void method11860(int i) {
	anInt6963 = i * -469617735;
	synchronized (aClass129_6960) {
	    aClass129_6960.reset(-398898894);
	}
	synchronized (aClass129_6956) {
	    aClass129_6956.reset(161100584);
	}
	synchronized (aClass129_6961) {
	    aClass129_6961.reset(140057597);
	}
    }
    
    public void method11861(int i) {
	objectDefCache = new Class129(i);
    }
    
    public void method11862(int i) {
	objectDefCache = new Class129(i);
    }
    
    public ObjectDefinition method11863(int i) {
	ObjectDefinition class526;
	synchronized (objectDefCache) {
	    class526 = ((ObjectDefinition)
			objectDefCache.get((long) i));
	}
	if (null != class526)
	    return class526;
	byte[] is;
	synchronized (objectDefContainer) {
	    is = (objectDefContainer.getfile
		  (Js5ConfigGroup.OBJECT_DEFINITIONS.getClientGroupId(i, (byte) -39),
		   Js5ConfigGroup.OBJECT_DEFINITIONS.getClientFileId(i, -1587668717),
		   1127865305));
	}
	class526 = new ObjectDefinition();
	class526.objectID = i * 361475065;
	((ObjectDefinition) class526).loader = this;
	class526.options
	    = (String[]) defaultOptions.clone();
	if (null != is)
	    class526.decode(new RSByteBuffer(is), -448317473);
	class526.postDecodeEvent((byte) 2);
	if (((ObjectDefinition) class526).clippingFlag)
	    class526.clipType = 0;
	if (!onMembersServer && class526.membersObject) {
	    class526.options = null;
	    class526.anIntArray6833 = null;
	}
	synchronized (objectDefCache) {
	    objectDefCache.put(class526, (long) i);
	}
	return class526;
    }
    
    public void method11864() {
	synchronized (objectDefCache) {
	    objectDefCache.reset(-37499715);
	}
	synchronized (aClass129_6960) {
	    aClass129_6960.reset(-1422249001);
	}
	synchronized (aClass129_6956) {
	    aClass129_6956.reset(-40512380);
	}
	synchronized (aClass129_6961) {
	    aClass129_6961.reset(37070476);
	}
	aClass161Array6965 = new Class161[4];
	aClass399_6966 = new Class399(null, null);
    }
    
    public void method11865(int i) {
	synchronized (objectDefCache) {
	    objectDefCache.clean(i, -2145756449);
	}
	synchronized (aClass129_6960) {
	    aClass129_6960.clean(i, -2125914588);
	}
	synchronized (aClass129_6956) {
	    aClass129_6956.clean(i, -2027595184);
	}
	synchronized (aClass129_6961) {
	    aClass129_6961.clean(i, -2109319072);
	}
    }
    
    public void method11866(int i) {
	synchronized (objectDefCache) {
	    objectDefCache.clean(i, -2082234944);
	}
	synchronized (aClass129_6960) {
	    aClass129_6960.clean(i, -2143535235);
	}
	synchronized (aClass129_6956) {
	    aClass129_6956.clean(i, -2075005044);
	}
	synchronized (aClass129_6961) {
	    aClass129_6961.clean(i, -2085504481);
	}
    }
    
    public void method11867() {
	synchronized (objectDefCache) {
	    objectDefCache.removeSoftReferences((byte) -47);
	}
	synchronized (aClass129_6960) {
	    aClass129_6960.removeSoftReferences((byte) 8);
	}
	synchronized (aClass129_6956) {
	    aClass129_6956.removeSoftReferences((byte) -100);
	}
	synchronized (aClass129_6961) {
	    aClass129_6961.removeSoftReferences((byte) 67);
	}
    }
    
    public void method11868() {
	synchronized (objectDefCache) {
	    objectDefCache.removeSoftReferences((byte) -24);
	}
	synchronized (aClass129_6960) {
	    aClass129_6960.removeSoftReferences((byte) 23);
	}
	synchronized (aClass129_6956) {
	    aClass129_6956.removeSoftReferences((byte) -32);
	}
	synchronized (aClass129_6961) {
	    aClass129_6961.removeSoftReferences((byte) 84);
	}
    }
    
    static final void method11869(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class332.method6058(class58, class35, class454, -484970608);
    }
    
    static long method11870(CharSequence charsequence, int i) {
	long l = 0L;
	int i_5_ = charsequence.length();
	for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_6_);
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
    
    static void method11871(byte i) {
	client.aClass190_8339.closeConnection(1980319961);
	if (1279563131 * Class9.anInt52 < 2) {
	    Class609.aClass397_7759.method7114(1451781846);
	    Class9.anInt47 = 0;
	    Class9.anInt52 += -847117901;
	    Class9.aClass22_51 = Class22.aClass22_204;
	} else {
	    Class9.aClass22_51 = null;
	    Class9.aClass433_49 = Class433.aClass433_6112;
	    Class496.setClientStage(17, (byte) -29);
	}
    }
    
    static final void method11872(ClientScriptData class454, int i) {
	int i_7_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_7_, (byte) -112);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_7_ >> 16];
	Class134.setComponentShadow(class58, class35, class454, -1889150330);
    }
    
    static final void method11873(ClientScriptData class454, int i) {
	Class65.method1637(Class585.method12849(847693002), class454,
			   558179480);
    }
}
