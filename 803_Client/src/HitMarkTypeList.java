/* Class555 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class HitMarkTypeList
{
    Class129 hitmarkCache = new Class129(20);//aClass129_7247
    JS5 sprites;//aClass210_7248
    JS5 configClient;//aClass210_7249
    Class129 recentUse = new Class129(64);//aClass129_7250
    static Class168[] aClass168Array7251;
    
    public HitMarkTypeList(GameDefinition game, Language lang, JS5 config, JS5 sprites) {
		this.sprites = sprites;
		this.configClient = config;
		this.configClient.getContainerCount((-1379677837 * (Js5ConfigGroup.HITMARKTYPE.id)), (byte) -33);
    }
    
    public HitMarkType list/*method12278*/(int id, int i_1_) {
		HitMarkType class560;
		synchronized (recentUse) {
		    class560 = ((HitMarkType)
				recentUse.get((long) id));
		}
		if (class560 != null) {
		    return class560;
		}
		byte[] data;
		synchronized (configClient) {
		    data = configClient.getfile(
		    		(Js5ConfigGroup.HITMARKTYPE.id * -1379677837), id, 1238809517);
		}
		class560 = new HitMarkType();
		((HitMarkType) class560).myList = this;
		if (null != data) {
		    class560.decode(new RSByteBuffer(data), 1698218891);
		}
		synchronized (recentUse) {
		    recentUse.put(class560, (long) id);
		}
		return class560;
    }
    
    public void method12279() {
	synchronized (recentUse) {
	    recentUse.removeSoftReferences((byte) -63);
	}
	synchronized (hitmarkCache) {
	    hitmarkCache.removeSoftReferences((byte) -91);
	}
    }
    
    public void cacheClean/*method12280*/(int i, byte i_2_) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2042487374);
		}
		synchronized (hitmarkCache) {
		    hitmarkCache.clean(i, -2035866044);
		}
    }
    
    public void cacheRemoveSoftReferences/*method12281*/(byte i) {
		synchronized (recentUse) {
		    recentUse.removeSoftReferences((byte) 73);
		}
		synchronized (hitmarkCache) {
		    hitmarkCache.removeSoftReferences((byte) -94);
		}
    }
    
    public HitMarkType method12282(int i) {
	HitMarkType class560;
	synchronized (recentUse) {
	    class560 = ((HitMarkType)
			recentUse.get((long) i));
	}
	if (class560 != null)
	    return class560;
	byte[] is;
	synchronized (configClient) {
	    is = configClient.getfile(((Js5ConfigGroup
							       .HITMARKTYPE
							       .id)
							      * -1379677837),
							     i, 1719882202);
	}
	class560 = new HitMarkType();
	((HitMarkType) class560).myList = this;
	if (null != is)
	    class560.decode(new RSByteBuffer(is), 1698218891);
	synchronized (recentUse) {
	    recentUse.put(class560, (long) i);
	}
	return class560;
    }
    
    public void method12283() {
		synchronized (recentUse) {
		    recentUse.reset(178655185);
		}
		synchronized (hitmarkCache) {
		    hitmarkCache.reset(-2139943173);
		}
    }
    
    public void method12284() {
		synchronized (recentUse) {
		    recentUse.reset(-842041525);
		}
		synchronized (hitmarkCache) {
		    hitmarkCache.reset(-1864395881);
		}
    }
    
    public void method12285() {
		synchronized (recentUse) {
		    recentUse.reset(59990775);
		}
		synchronized (hitmarkCache) {
		    hitmarkCache.reset(-836492030);
		}
    }
    
    public void dummyMethod12286(int i) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2124189331);
		}
		synchronized (hitmarkCache) {
		    hitmarkCache.clean(i, -2103105762);
		}
    }
    
    public void cacheReset/*method12287*/(byte i) {
		synchronized (recentUse) {
		    recentUse.reset(-987482915);
		}
		synchronized (hitmarkCache) {
		    hitmarkCache.reset(-1827625854);
		}
    }
    
    public void method12288(int i) {
		synchronized (recentUse) {
		    recentUse.clean(i, -2087759710);
		}
		synchronized (hitmarkCache) {
		    hitmarkCache.clean(i, -2134289544);
		}
    }
    
    static void method12289(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [1482319719 * ((ClientScriptData) class454).intStackPointer - 2]
	    = (Class326_Sub3.aClass482_10288.method11010
	       ((((ClientScriptData) class454).integerStack
		 [1482319719 * ((ClientScriptData) class454).intStackPointer - 2]),
		(short) -11945)
	       .anIntArrayArray6417
	       [(((ClientScriptData) class454).integerStack
		 [1482319719 * ((ClientScriptData) class454).intStackPointer - 1])]
	       [1]);
	((ClientScriptData) class454).intStackPointer -= 1736754263;
    }
    
    static final void method12290(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	class58.anInt857
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * -206800565);
	class58.anInt821
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * -457822219);
    }
    
    static final void method12291(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 741399509 * client.tradeStatus;
    }
    
    public static void method12292(int i, String string, boolean bool,
				   int i_3_) {
	if (i == 0) {
	    Class236.aClass103_2713
		= Class40.method1044(0, Class344.canvas,
				     Class234.aClass107_2699,
				     Class120_Sub5.anInterface6_10485,
				     Class200.SHADERS_ARCHIVE,
				     Class241_Sub5_Sub9
					 .aClass241_Sub9_11043
					 .aClass445_Sub10_8852
					 .method14189((byte) 4) * 2,
				     (byte) -42);
	    if (string != null) {
		Class236.aClass103_2713.method2450(1, 0);
		Class639 class639
		    = Class518.method11660(Class120_Sub7.FONTS_ARCHIVE,
					   626564023 * Class456.anInt6250, 0,
					   (byte) -49);
		Class96 class96
		    = (Class236.aClass103_2713.method2296
		       (class639,
			Class160.method3439(Class284.SPRITES_ARCHIVE,
					    Class456.anInt6250 * 626564023, 0),
			true));
		Class109.method2765((byte) -116);
		Class434_Sub5.method14141(string, true,
					  Class236.aClass103_2713, class96,
					  class639, 1065533958);
	    }
	} else {
	    Class103 class103 = null;
	    if (null != string) {
		class103
		    = Class40.method1044(0, Class344.canvas,
					 Class234.aClass107_2699,
					 Class120_Sub5.anInterface6_10485,
					 Class200.SHADERS_ARCHIVE, 0, (byte) 7);
		class103.method2450(1, 0);
		Class639 class639
		    = Class518.method11660(Class120_Sub7.FONTS_ARCHIVE,
					   Class456.anInt6250 * 626564023, 0,
					   (byte) -1);
		Class96 class96
		    = (class103.method2296
		       (class639,
			Class160.method3439(Class284.SPRITES_ARCHIVE,
					    626564023 * Class456.anInt6250, 0),
			true));
		Class109.method2765((byte) -116);
		Class434_Sub5.method14141(string, true, class103, class96,
					  class639, 183250697);
		try {
		    class103.method2220((byte) 0);
		    class103 = null;
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    try {
		try {
		    Class579.method12712((byte) 43);
		    System.gc();
		    Class236.aClass103_2713
			= Class40.method1044(i, Class344.canvas,
					     Class234.aClass107_2699,
					     Class120_Sub5.anInterface6_10485,
					     Class200.SHADERS_ARCHIVE,
					     Class241_Sub5_Sub9
						 .aClass241_Sub9_11043
						 .aClass445_Sub10_8852
						 .method14189((byte) 89) * 2,
					     (byte) -14);
		    if (Class236.aClass103_2713.method2225()) {
			boolean bool_4_ = true;
			try {
			    bool_4_ = (Class6.aClass241_Sub12_38.anInt8940
				       * -2096187941) > 256;
			} catch (Throwable throwable) {
			    /* empty */
			}
			Class241_Sub47 class241_sub47;
			if (bool_4_)
			    class241_sub47 = Class236.aClass103_2713
						 .method2283(146800640);
			else
			    class241_sub47 = Class236.aClass103_2713
						 .method2283(104857600);
			Class236.aClass103_2713.method2228(class241_sub47);
		    }
		} catch (Throwable throwable) {
		    switch (i) {
		    case 1:
			Friend.method865(Class629.aClass629_8008,
					  -2110807565);
			break;
		    case 3:
			Friend.method865(Class629.aClass629_8007,
					  -1444034415);
			break;
		    }
		    if (throwable instanceof RuntimeException_Sub2) {
			Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub10_8881.method7882(0, 622532142);
			Class241_Sub5_Sub9.aClass241_Sub9_11043
			    .aClass445_Sub10_8852.method7882(0, 622532142);
		    }
		    int i_5_
			= Class241_Sub5_Sub9.aClass241_Sub9_11043
			      .aClass445_Sub11_8893.method14197((byte) 76);
		    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
			((Class241_Sub5_Sub9.aClass241_Sub9_11043
			  .aClass445_Sub11_8893),
			 0, (byte) 2);
		    if (null != class103) {
			try {
			    class103.method2220((byte) 0);
			    class103 = null;
			} catch (Throwable throwable_6_) {
			    /* empty */
			}
		    }
		    Class579.method12712((byte) 109);
		    System.gc();
		    method12292(i_5_, string, bool, -194954487);
		    if (class103 != null) {
			try {
			    class103.method2220((byte) 0);
			} catch (Throwable throwable_7_) {
			    /* empty */
			}
		    }
		    return;
		}
		if (class103 != null) {
		    try {
			class103.method2220((byte) 0);
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable object) {
		if (class103 != null) {
		    try {
			class103.method2220((byte) 0);
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
		throw object;
	    }
	}
	if (bool)
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14912
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893,
		 !bool, 2006069530);
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893, i,
	     (byte) 2);
	if (!bool)
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14912
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8893,
		 !bool, 1588530233);
	Js5Archive.method1391((byte) -92);
	Class236.aClass103_2713.method2299(20000);
	Class236.aClass103_2713.method2313(32);
	client.aClass238_8477.method4766(-1904919397);
	if (Class236.aClass103_2713.method2361())
	    Class247_Sub2.method16339(Class241_Sub5_Sub9
					  .aClass241_Sub9_11043
					  .aClass445_Sub20_8854
					  .method14281(134798426) == 1,
				      764280291);
	client.aClass238_8477.method4741(-1280355408);
	client.aClass238_8477.method4833(1512210712).method11400(-2027776153);
	LongNode.method15108((short) 29173);
	client.aBool8297 = false;
	client.aBool8307 = true;
	ItemDefinitionLoader.aClass446Array7850 = null;
	Class236.aClass103_2713.method2255(0.0F, 1.0F);
    }
    
    static final void method12293(int i) {
	Class120_Sub14.method16786(Class236.aClass103_2713, 1283062868);
	if (Class357_Sub1.anInt10357 * 993680393
	    != 1544168405 * client.anInt8300)
	    Class514.method11576((byte) -100);
    }
    
    public static final void method12294(int i) {
	for (int i_8_ = 0; i_8_ < 5; i_8_++)
	    client.aBoolArray8517[i_8_] = false;
	client.anInt8418 = 2047280193;
	client.anInt8480 = -759340061;
	Class180.anInt2136 = 0;
	Class62.anInt1029 = 0;
	Class296.anInt4513 = -1463009358;
	if (Class520.method11690(-373096466) == 4) {
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    int i_9_ = 127679513 * class522.baseX << 9;
	    int i_10_ = class522.baseY * 468558693 << 9;
	    int i_11_ = 1000 / Class70.method1725(-25104032);
	    Class445_Sub16.aClass351_Sub1_8660.method6255
		((float) i_11_ / 1000.0F,
		 (client.aClass238_8477.method4759(-35878102)
		  .anIntArrayArrayArray4562),
		 client.aClass238_8477.method4753((byte) -72), i_9_, i_10_,
		 -1742751015);
	}
	Class254.anInt4134 = -162819257;
	Class245.anInt3961 = -1540801703;
	client.anInt8543 = client.anInt8296 * 531805425;
	Class195.anInt2361 = -1369413581 * Class462.anInt6284;
	Class200.anInt2400 = -1993996497 * Class175.anInt2123;
	Class120_Sub7.anInt10496 = 1031592323 * Class636.anInt8248;
	Class507.anInt6670 = Class496.anInt6527 * -1754498319;
	Class450.anInt6207 = Class322.anInt4909 * 1174528103;
	Class254.anInt4133 = -681733993 * client.anInt8398;
    }
}
