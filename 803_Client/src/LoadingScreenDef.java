/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class LoadingScreenDef
{
    static LoadingScreenDef LOADING_STAGE_3;//aClass359_5475
    ClientMessage aClass635_5476;
    static LoadingScreenDef LOADING_STAGE_2;//aClass359_5477
    public int anInt5478;
    static LoadingScreenDef LOADING_STAGE_4;//aClass359_5479
    static LoadingScreenDef SETUP_VARC_SYSTEM;//aClass359_5480
    static LoadingScreenDef GET_JS5_INDEXES;//aClass359_5481
    static LoadingScreenDef LOADING_STAGE_0 = new LoadingScreenDef(0, ClientMessage.CHECKING_FOR_UPDATES, 2);//aClass359_5482
    static LoadingScreenDef LOADING_STAGE_8;//aClass359_5483
    static LoadingScreenDef OPEN_JS5_ARCHIVES;//aClass359_5484
    static LoadingScreenDef SETUP_CONFIG_DECODERS;//aClass359_5485
    static LoadingScreenDef LOADING_STAGE_11;//aClass359_5486
    static LoadingScreenDef LOADING_STAGE_12;//aClass359_5487
    static LoadingScreenDef LOADING_STAGE_17;//aClass359_5488
    static LoadingScreenDef LOADING_STAGE_14;//aClass359_5489
    static LoadingScreenDef LOADING_STAGE_15;//aClass359_5490
    static LoadingScreenDef LOADING_STAGE_16;//aClass359_5491
    static LoadingScreenDef LOADING_STAGE_1//
		= new LoadingScreenDef(1, ClientMessage.CHECKING_FOR_UPDATES, ClientMessage.CHECKING_FOR_UPDATES, 2, 3);
    static LoadingScreenDef SETUP_SOUND_LIBRARY;//aClass359_5493
    static LoadingScreenDef DOWNLOAD_STUFF;//aClass359_5494
    ClientMessage aClass635_5495;
    int anInt5496;
    int anInt5497;
    boolean aBool5498;
    boolean aBool5499;
    static int anInt5500;
    
    static {
		LOADING_STAGE_2 = new LoadingScreenDef(2, ClientMessage.CHECKING_FOR_UPDATES, 3);
		LOADING_STAGE_3 = new LoadingScreenDef(3, ClientMessage.CHECKING_FOR_UPDATES,
				ClientMessage.CHECKING_FOR_UPDATES, 3, 4);
		LOADING_STAGE_4 = new LoadingScreenDef(4, ClientMessage.CHECKING_FOR_UPDATES, 4);
		OPEN_JS5_ARCHIVES = new LoadingScreenDef(5, ClientMessage.CHECKING_FOR_UPDATES,
				ClientMessage.CHECKING_FOR_UPDATES, 4, 5);
		GET_JS5_INDEXES = new LoadingScreenDef(6, ClientMessage.CHECKING_FOR_UPDATES, 
				ClientMessage.CHECKING_FOR_UPDATES, 5, 98, true, true);
		SETUP_SOUND_LIBRARY = new LoadingScreenDef(7, ClientMessage.CHECKING_FOR_UPDATES, 99);
		LOADING_STAGE_8 = new LoadingScreenDef(8, ClientMessage.CHECKING_FOR_UPDATES, 100);
		DOWNLOAD_STUFF = new LoadingScreenDef(9, ClientMessage.DOWNLOADING_UPDATES, ClientMessage.DOWNLOADING_UPDATES,
				   0, 92, true, true);
		SETUP_CONFIG_DECODERS = new LoadingScreenDef(10, ClientMessage.DOWNLOADING_UPDATES,
					      ClientMessage.DOWNLOADING_UPDATES, 92, 93);
		LOADING_STAGE_11 = new LoadingScreenDef(11, ClientMessage.DOWNLOADING_UPDATES,
					      ClientMessage.DOWNLOADING_UPDATES, 94, 95);
		LOADING_STAGE_12 = new LoadingScreenDef(12, ClientMessage.DOWNLOADING_UPDATES,
					      ClientMessage.DOWNLOADING_UPDATES, 96, 97);
		SETUP_VARC_SYSTEM = new LoadingScreenDef(13, ClientMessage.DOWNLOADING_UPDATES, 97);
		LOADING_STAGE_14 = new LoadingScreenDef(14, ClientMessage.DOWNLOADING_UPDATES, 97);
		LOADING_STAGE_15 = new LoadingScreenDef(15, ClientMessage.DOWNLOADING_UPDATES, 100);
		LOADING_STAGE_16 = new LoadingScreenDef(16, ClientMessage.DOWNLOADING_UPDATES, 100);
		LOADING_STAGE_17 = new LoadingScreenDef(17, ClientMessage.DOWNLOADING_UPDATES, 100);
    }
    
    LoadingScreenDef(int i, ClientMessage class635, int i_0_) {
	this(i, class635, class635, i_0_, i_0_, true, false);
    }
    
    LoadingScreenDef(int i, ClientMessage class635, ClientMessage class635_1_, int i_2_,
	     int i_3_) {
	this(i, class635, class635_1_, i_2_, i_3_, true, false);
    }
    
    static LoadingScreenDef[] method6479(int i) {
	return (new LoadingScreenDef[]
		{ LOADING_STAGE_0, LOADING_STAGE_1, LOADING_STAGE_2,
		  LOADING_STAGE_3, LOADING_STAGE_4, OPEN_JS5_ARCHIVES,
		  GET_JS5_INDEXES, SETUP_SOUND_LIBRARY, LOADING_STAGE_8,
		  DOWNLOAD_STUFF, SETUP_CONFIG_DECODERS, LOADING_STAGE_11,
		  LOADING_STAGE_12, SETUP_VARC_SYSTEM, LOADING_STAGE_14,
		  LOADING_STAGE_15, LOADING_STAGE_16, LOADING_STAGE_17 });
    }
    
    LoadingScreenDef(int i, ClientMessage class635, ClientMessage class635_4_, int i_5_,
	     int i_6_, boolean bool, boolean bool_7_) {
	anInt5478 = i * 1907985721;
	((LoadingScreenDef) this).aClass635_5476 = class635;
	((LoadingScreenDef) this).aClass635_5495 = class635_4_;
	((LoadingScreenDef) this).anInt5496 = -2007385795 * i_5_;
	((LoadingScreenDef) this).anInt5497 = 1806143893 * i_6_;
	((LoadingScreenDef) this).aBool5498 = bool;
	((LoadingScreenDef) this).aBool5499 = bool_7_;
    }
    
    static LoadingScreenDef[] method6480() {
	return (new LoadingScreenDef[]
		{ LOADING_STAGE_0, LOADING_STAGE_1, LOADING_STAGE_2,
		  LOADING_STAGE_3, LOADING_STAGE_4, OPEN_JS5_ARCHIVES,
		  GET_JS5_INDEXES, SETUP_SOUND_LIBRARY, LOADING_STAGE_8,
		  DOWNLOAD_STUFF, SETUP_CONFIG_DECODERS, LOADING_STAGE_11,
		  LOADING_STAGE_12, SETUP_VARC_SYSTEM, LOADING_STAGE_14,
		  LOADING_STAGE_15, LOADING_STAGE_16, LOADING_STAGE_17 });
    }
    
    public static void method6481(Class103 class103, JS5 class210,
				  int i) {
	Class108[] class108s
	    = Class160.method3439(class210, Class496.anInt6524 * 1736353955,
				  0);
	Class191.aClass168Array2284 = new Class168[class108s.length];
	for (int i_8_ = 0; i_8_ < class108s.length; i_8_++)
	    Class191.aClass168Array2284[i_8_]
		= class103.method2289(class108s[i_8_], true);
	class108s
	    = Class160.method3439(class210, Class5.anInt24 * 2016700663, 0);
	Class481.aClass168Array6456 = new Class168[class108s.length];
	for (int i_9_ = 0; i_9_ < class108s.length; i_9_++)
	    Class481.aClass168Array6456[i_9_]
		= class103.method2289(class108s[i_9_], true);
	class108s
	    = Class160.method3439(class210, 2057551107 * Class5.anInt18, 0);
	Class360.aClass168Array5502 = new Class168[class108s.length];
	int i_10_ = 25;
	for (int i_11_ = 0; i_11_ < class108s.length; i_11_++) {
	    class108s[i_11_].method2708
		(-i_10_ + (int) (Math.random() * (double) i_10_ * 2.0),
		 -i_10_ + (int) (Math.random() * (double) i_10_ * 2.0),
		 -i_10_ + (int) (Math.random() * (double) i_10_ * 2.0));
	    Class360.aClass168Array5502[i_11_]
		= class103.method2289(class108s[i_11_], true);
	}
	class108s
	    = Class160.method3439(class210, 1893255153 * Class5.anInt20, 0);
	Class274.aClass168Array4379 = new Class168[class108s.length];
	for (int i_12_ = 0; i_12_ < class108s.length; i_12_++)
	    Class274.aClass168Array4379[i_12_]
		= class103.method2289(class108s[i_12_], true);
	class108s
	    = Class160.method3439(class210, 1936915547 * Class94.anInt1327, 0);
	HitMarkTypeList.aClass168Array7251 = new Class168[class108s.length];
	i_10_ = 12;
	for (int i_13_ = 0; i_13_ < class108s.length; i_13_++) {
	    class108s[i_13_].method2708
		(-i_10_ + (int) (Math.random() * (double) i_10_ * 2.0),
		 -i_10_ + (int) (Math.random() * (double) i_10_ * 2.0),
		 -i_10_ + (int) (Math.random() * (double) i_10_ * 2.0));
	    HitMarkTypeList.aClass168Array7251[i_13_]
		= class103.method2289(class108s[i_13_], true);
	}
	class108s
	    = Class160.method3439(class210, 799214159 * Class5.anInt21, 0);
	Class445_Sub9.aClass168Array8642 = new Class168[class108s.length];
	i_10_ = 12;
	for (int i_14_ = 0; i_14_ < class108s.length; i_14_++) {
	    class108s[i_14_].method2708
		(-i_10_ + (int) (Math.random() * (double) i_10_ * 2.0),
		 -i_10_ + (int) (Math.random() * (double) i_10_ * 2.0),
		 -i_10_ + (int) (Math.random() * (double) i_10_ * 2.0));
	    Class445_Sub9.aClass168Array8642[i_14_]
		= class103.method2289(class108s[i_14_], true);
	}
	Class133.aClass168_1616
	    = class103.method2289(Class160.method3437(class210,
						      (1937038461
						       * (CsDelta_DeleteBan
							  .anInt11056)),
						      0),
				  true);
	Class443.aClass168_6165
	    = class103.method2289(Class160.method3437(class210,
						      (-1249704839
						       * Class5.anInt22),
						      0),
				  true);
	class108s
	    = Class160.method3439(class210, Class5.anInt23 * 2032179797, 0);
	Class5.aClass168Array27 = new Class168[class108s.length];
	for (int i_15_ = 0; i_15_ < class108s.length; i_15_++)
	    Class5.aClass168Array27[i_15_]
		= class103.method2289(class108s[i_15_], true);
    }
    
    static final void method6482(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	if (5 == -1579470857 * class58.componentType)
	    SkillData.method11327(class58, class35, class454, (byte) 3);
    }
    
    static final void method6483(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class582.method12770(class58, class35, class454, (byte) 75);
    }
    
    static final void method6484(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 115241065 * Class296.anInt4513 == 3 ? 1 : 0;
    }
    
    static final void method6485(ClientScriptData class454, int i) {
	Class46.method1128(0, 0, 439139681 * client.aClass58_8474.anInt850,
			   1463495207 * client.aClass58_8474.scrollMinY, false,
			   -314060456);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 1045658563 * client.anInt8561;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.anInt8562 * -343750905;
    }
    
    static final void method6486(ClientScriptData class454, int i) {
	int i_16_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (null == Class187.aClass35Array2203[i_16_])
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= "";
	else {
	    String string = (Class187.aClass35Array2203[i_16_].components
			     [0].aString834);
	    if (string == null)
		((ClientScriptData) class454).objectStack
		    [((((ClientScriptData) class454).objectStackPointer += -1650705371)
		      * -290357331) - 1]
		    = "";
	    else
		((ClientScriptData) class454).objectStack
		    [((((ClientScriptData) class454).objectStackPointer += -1650705371)
		      * -290357331) - 1]
		    = string.substring(0, string.indexOf(':'));
	}
    }
    
    static String method6487(long l, int i, int i_17_) {
	Class447.method7916(l);
	int i_18_ = Class638.aCalendar8252.get(5);
	int i_19_ = Class638.aCalendar8252.get(2) + 1;
	int i_20_ = Class638.aCalendar8252.get(1);
	return new StringBuilder().append(Integer.toString(i_18_ / 10)).append
		   (i_18_ % 10).append
		   ("/").append
		   (i_19_ / 10).append
		   (i_19_ % 10).append
		   ("/").append
		   (i_20_ % 100 / 10).append
		   (i_20_ % 10).toString();
    }
    
    static final void method6488(int i, int i_21_, int i_22_, int i_23_,
				 int i_24_, int i_25_, int i_26_, byte i_27_) {
	if (client.anInt8266 * -831877317 == 3) {
	    int i_28_ = 794073197 * GPI.viewportPlayerCount;
	    int[] is = GPI.viewportPlayerIndicies;
	    for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
		Player class475_sub1_sub1_sub3_sub1
		    = client.localPlayers[is[i_29_]];
		if (class475_sub1_sub1_sub3_sub1 != null)
		    class475_sub1_sub1_sub3_sub1.method17798(i, i_21_, i_22_,
							     i_23_, i_24_,
							     i_25_, i_26_,
							     1633479777);
	    }
	    for (int i_30_ = 0; i_30_ < -1837469873 * client.localNpcCount;
		 i_30_++) {
		int i_31_ = client.localNpcIndicies[i_30_];
		ObjectNode class241_sub26
		    = ((ObjectNode)
		       client.aClass407_8457.get((long) i_31_));
		if (null != class241_sub26)
		    ((Entity) class241_sub26.objectValue)
			.method17798
			(i, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_,
			 1924740476);
	    }
	}
    }
    
    public static final InterfaceComponent method6489(InterfaceDefinition class35, InterfaceComponent class58,
					   int i) {
	if (-1 != class58.parentNode * -152977625)
	    return class35.method997(class58.parentNode * -152977625, -23841326);
	if (!class35.aBool374) {
	    int i_32_ = class58.componentHash * 445907013 >>> 16;
	    Class403 class403 = new Class403(client.aClass407_8467);
	    for (Class241_Sub11 class241_sub11
		     = (Class241_Sub11) class403.method7206(1510072985);
		 class241_sub11 != null;
		 class241_sub11 = (Class241_Sub11) class403.next()) {
		if (class241_sub11.interfaceID * -443552671 == i_32_)
		    return Js5ConfigGroup.getInterfaceComponent((int) (4356572401218184725L
						     * (class241_sub11
							.hashCode)),
					      (byte) -45);
	    }
	}
	return null;
    }
}
