/* Class623 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Arrays;

//package com.jagex.game.runetek6.config.objtype;
public class ItemDefinition implements Interface15 {
    int ambient;//anInt7879
    public static final int SHOWCOUNT_ALWAYS = 1;//anInt7880
    public static final int SHOWCOUNT_IFNOT1 = 2;//anInt7881
    static final int MAX_OP_COUNT = 6;//anInt7882
    byte[] aByteArray7883;
    public static short[] clientpalette = new short[256];//aShortArray7884
    ItemDefinitionLoader loader;//aClass618_7885
    int itemID;//anInt7886
    public int anInt7887 = 182938293;
    int[] stackAmounts;//anIntArray7888
    public String name = "null";//aString7889
    short[] originalModelColors;//aShortArray7890
    public int teamID;//anInt7891
    int interfaceModelID;//anInt7892
    public int noteTemplateID;//anInt7893
    short[] modifiedTextureColors;//aShortArray7894
    byte[] aByteArray7895;
    public int yof2d;//anInt7896
    int maleEquip1;//anInt7897
    public int xan2d;//anInt7898
    short[] originalTextureColors;//aShortArray7899
    public int zan2d;//anInt7900
    public int xof2d;//anInt7901
    String aString7902;
    public int stackable;//anInt7903
    public int anInt7904;
    public int value;//anInt7905
    public boolean membersOnly;//aBool7906
    public String[] groundOptions;//aStringArray7907
    public String[] inventoryOptions;//aStringArray7908
    int[] anIntArray7909;
    public int anInt7910;
    public int equipSlotID;//anInt7911
    int resizey;//anInt7912
    public int anInt7913;
    int[] anIntArray7914;
    int maleEquip2;//anInt7915
    int femaleEquip1;//anInt7916
    int femaleEquip2;//anInt7917
    int colourEquip1;//anInt7918
    int colourEquip2;//anInt7919
    public int noteID;//anInt7920
    int womanwearxoff;//anInt7921
    public int zoom2d = -1516207120;//anInt7922
    public int anInt7923;
    int manwearzoff;//anInt7924
    int womanwearzoff;//anInt7925
    int manhead;//anInt7926
    int manhead2;//anInt7927
    byte[] recol_d_palette;//aByteArray7928
    int womanhead2;//anInt7929
    int[] stackIds;//anIntArray7930
    int resizex;//anInt7931
    int womanhead;//anInt7932
    static final int MAX_IOP_COUNT = 5;//anInt7933
    int lendID;//anInt7934
    public int lendTemplateID;//anInt7935
    public int multistacksize;//anInt7936
    int manwearyoff;//anInt7937
    public int yan2d;//anInt7938
    public int anInt7939;
    int manwearxoff;//anInt7940
    short[] modifiedModelColors;//aShortArray7941
    int resizez;//anInt7942
    public static final int SHOWCOUNT_NEVER = 0;//anInt7943
    int contrast;//anInt7944
    public int equipID;//anInt7945
    public boolean stockmarket;//aBool7946
    public int dummyitem;//anInt7947
    HashTable params;//aClass407_7948
    public int[] anIntArray7949;
    public int picksizeshift;//anInt7950
    int boughtlink;//anInt7951
    public int boughttemplate;//anInt7952
    public boolean aBool7953;
    int womanwearyoff;//anInt7954
    public boolean aBool7955;
    static String aString7956 = "</col>";
    
    public final Class161 method13361(boolean bool, Class604 class604) {
	int i;
	int i_0_;
	if (bool) {
	    if (null != class604 && null != class604.anIntArray7743) {
		i = class604.anIntArray7743[0];
		i_0_ = class604.anIntArray7743[1];
	    } else {
		i = womanhead * 1630099121;
		i_0_ = womanhead2 * -1540815033;
	    }
	} else if (null != class604 && class604.anIntArray7747 != null) {
	    i = class604.anIntArray7747[0];
	    i_0_ = class604.anIntArray7747[1];
	} else {
	    i = -823031799 * manhead;
	    i_0_ = manhead2 * -1341819643;
	}
	if (i == -1)
	    return null;
	Class161 class161 = Class161.method3448((((ItemDefinitionLoader) (((ItemDefinition) this)
							      .loader))
						 .meshes),
						i, 0);
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (-1 != i_0_) {
	    Class161 class161_1_
		= Class161.method3448((((ItemDefinitionLoader)
					loader)
				       .meshes),
				      i_0_, 0);
	    if (class161_1_.anInt1789 < 13)
		class161_1_.method3464(2);
	    Class161[] class161s = { class161, class161_1_ };
	    class161 = new Class161(class161s, 2);
	}
	if (null != originalModelColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7749)
		is = class604.aShortArray7749;
	    else
		is = modifiedModelColors;
	    for (int i_2_ = 0; i_2_ < originalModelColors.length;
		 i_2_++)
		class161.method3457(originalModelColors[i_2_],
				    is[i_2_]);
	}
	if (null != originalTextureColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7750)
		is = class604.aShortArray7750;
	    else
		is = modifiedTextureColors;
	    for (int i_3_ = 0; i_3_ < originalTextureColors.length;
		 i_3_++)
		class161.method3458(originalTextureColors[i_3_],
				    is[i_3_]);
	}
	return class161;
    }
    
    ItemDefinition() {
		xan2d = 0;
		yan2d = 0;
		zan2d = 0;
		xof2d = 0;
		yof2d = 0;
		stackable = 0;
		multistacksize = -1217967463;
		value = -901467311;
		membersOnly = false;
		equipSlotID = 1713402773;
		equipID = 643584373;
		anInt7913 = -1286408247;
		maleEquip1 = 491162849;
		maleEquip2 = -691644319;
		femaleEquip1 = 1104952053;
		femaleEquip2 = -1885102341;
		colourEquip1 = 930938835;
		colourEquip2 = 1610423045;
		manwearxoff = 0;
		womanwearxoff = 0;
		manwearyoff = 0;
		womanwearyoff = 0;
		manwearzoff = 0;
		womanwearzoff = 0;
		manhead = -1608812089;
		manhead2 = -1569591245;
		womanhead = -1208824401;
		womanhead2 = -1859154551;
		noteID = -336272341;
		noteTemplateID = -1128556713;
		lendID = 1325883653;
		lendTemplateID = 1685239485;
		anInt7904 = -2060370159;
		anInt7923 = -1314089853;
		aString7902 = "null";
		anInt7939 = 0;
		resizex = -891756160;
		resizey = 13062016;
		resizez = 1731161472;
		ambient = 0;
		contrast = 0;
		teamID = 0;
		stockmarket = false;
		dummyitem = 0;
		picksizeshift = 0;
		boughtlink = -569375491;
		boughttemplate = -1596594881;
		aBool7953 = false;
		aBool7955 = false;
    }
    
    void decode/*method13362*/(RSByteBuffer buffer, byte i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) -40);
		    if (opcode == 0) {
			break;
	            }
		    decode(buffer, opcode, -936345829);
		}
    }
    
    int[] method13363(int[] is, int i, byte i_5_) {
	int[] is_6_ = new int[1152];
	int i_7_ = 0;
	for (int i_8_ = 0; i_8_ < 32; i_8_++) {
	    for (int i_9_ = 0; i_9_ < 36; i_9_++) {
		int i_10_ = is[i_7_];
		if (i_10_ == 0) {
		    if (i_9_ > 0 && is[i_7_ - 1] != 0)
			i_10_ = i;
		    else if (i_8_ > 0 && is[i_7_ - 36] != 0)
			i_10_ = i;
		    else if (i_9_ < 35 && is[1 + i_7_] != 0)
			i_10_ = i;
		    else if (i_8_ < 31 && 0 != is[36 + i_7_])
			i_10_ = i;
		}
		is_6_[i_7_++] = i_10_;
	    }
	}
	return is_6_;
    }
    
    public final boolean method13364(boolean bool, Class604 class604) {
	int i;
	int i_11_;
	int i_12_;
	if (bool) {
	    if (null != class604 && null != class604.anIntArray7746) {
		i = class604.anIntArray7746[0];
		i_11_ = class604.anIntArray7746[1];
		i_12_ = class604.anIntArray7746[2];
	    } else {
		i = femaleEquip1 * 1129242275;
		i_11_ = femaleEquip2 * -541441075;
		i_12_ = colourEquip2 * -471628237;
	    }
	} else if (class604 != null && class604.anIntArray7742 != null) {
	    i = class604.anIntArray7742[0];
	    i_11_ = class604.anIntArray7742[1];
	    i_12_ = class604.anIntArray7742[2];
	} else {
	    i = 1500268767 * maleEquip1;
	    i_11_ = maleEquip2 * -907955105;
	    i_12_ = colourEquip1 * 795824037;
	}
	if (-1 == i)
	    return true;
	boolean bool_13_ = true;
	if (!((ItemDefinitionLoader) loader).meshes
		 .method4188(i, 0, -730359423))
	    bool_13_ = false;
	if (i_11_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_11_, 0, -1738547066))
	    bool_13_ = false;
	if (i_12_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_12_, 0, -714954804))
	    bool_13_ = false;
	return bool_13_;
    }
    
    void method13365(int[] is, int i) {
	for (int i_14_ = 31; i_14_ > 0; i_14_--) {
	    int i_15_ = i_14_ * 36;
	    for (int i_16_ = 35; i_16_ > 0; i_16_--) {
		if (is[i_15_ + i_16_] == 0 && is[i_16_ + i_15_ - 1 - 36] != 0)
		    is[i_16_ + i_15_] = i;
	    }
	}
    }
    
    void method13366() {
	/* empty */
    }
    
    void toNote/*method13367*/(ItemDefinition template, ItemDefinition realItem, int i) {
    	applyTemplate(Class636.aClass636_8243, template, realItem, null, -1493961741);
    }
    
    void method13368(ItemDefinition template, ItemDefinition realItem, byte i) {
    	applyTemplate(Class636.aClass636_8246, template, realItem, ClientMessage.DROP, -1493961741);
    }
    
    public final Class89 method13369(Class103 class103, int i, int i_21_,
				     Class490 class490, Class409 class409,
				     int i_22_, int i_23_, int i_24_,
				     int i_25_, byte i_26_) {
	if (null != stackIds && i_21_ > 1) {
	    int i_27_ = -1;
	    for (int i_28_ = 0; i_28_ < 10; i_28_++) {
		if (i_21_ >= stackAmounts[i_28_]
		    && 0 != stackAmounts[i_28_])
		    i_27_ = stackIds[i_28_];
	    }
	    if (i_27_ != -1)
		return (loader.list
			    (i_27_, (short) 166).method13369
			(class103, i, 1, class490, class409, i_22_, i_23_,
			 i_24_, i_25_, (byte) 1));
	}
	int i_29_ = i;
	if (null != class409)
	    i_29_ |= class409.method7356(483388740);
	Class89 class89;
	synchronized (((ItemDefinitionLoader) loader)
		      .aClass129_7843) {
	    class89 = ((Class89)
		       (((ItemDefinitionLoader) loader)
			    .aClass129_7843.get
			((long) (itemID * 1643372817
				 | class103.anInt1456 * 1931687493 << 29))));
	}
	if (class89 == null
	    || class103.method2301(class89.method1866(), i_29_) != 0) {
	    if (null != class89)
		i_29_ = class103.method2302(i_29_, class89.method1866());
	    int i_30_ = i_29_;
	    if (null != originalTextureColors)
		i_30_ |= 0x8000;
	    if (null != originalModelColors || null != class490)
		i_30_ |= 0x4000;
	    if (128 != 754173675 * resizex)
		i_30_ |= 0x1;
	    if (772935007 * resizey != 128)
		i_30_ |= 0x2;
	    if (128 != resizez * 173829459)
		i_30_ |= 0x4;
	    Class161 class161
		= Class161.method3448((((ItemDefinitionLoader)
					loader)
				       .meshes),
				      (-1813993629
				       * interfaceModelID),
				      0);
	    if (null == class161)
		return null;
	    if (class161.anInt1789 < 13)
		class161.method3464(2);
	    class89
		= (class103.method2356
		   (class161, i_30_,
		    1544873583 * (((ItemDefinitionLoader) loader)
				  .anInt7842),
		    64 + 1018366715 * ambient,
		    contrast * 1864646775 + 850));
	    if (754173675 * resizex != 128
		|| 772935007 * resizey != 128
		|| 173829459 * resizez != 128)
		class89.method1863(754173675 * resizex,
				   772935007 * resizey,
				   resizez * 173829459);
	    if (null != originalModelColors) {
		for (int i_31_ = 0;
		     i_31_ < originalModelColors.length;
		     i_31_++) {
		    if (null != recol_d_palette
			&& i_31_ < recol_d_palette.length)
			class89.method1908((originalModelColors
					    [i_31_]),
					   clientpalette[(((ItemDefinition) this)
							    .recol_d_palette
							    [i_31_]) & 0xff]);
		    else
			class89.method1908((originalModelColors
					    [i_31_]),
					   (modifiedModelColors
					    [i_31_]));
		}
	    }
	    if (originalTextureColors != null) {
		for (int i_32_ = 0;
		     i_32_ < originalTextureColors.length; i_32_++)
		    class89.method1985((originalTextureColors
					[i_32_]),
				       (modifiedTextureColors
					[i_32_]));
	    }
	    if (null != class490) {
		for (int i_33_ = 0; i_33_ < 10; i_33_++) {
		    for (int i_34_ = 0;
			 i_34_ < Class558.aShortArrayArray7261[i_33_].length;
			 i_34_++) {
			if (class490.anIntArray6501[i_33_]
			    < (Class561.aShortArrayArrayArray7298[i_33_]
			       [i_34_]).length)
			    class89.method1908
				(Class558.aShortArrayArray7261[i_33_][i_34_],
				 (Class561.aShortArrayArrayArray7298[i_33_]
				  [i_34_][class490.anIntArray6501[i_33_]]));
		    }
		}
	    }
	    class89.method1928(i_29_);
	    synchronized (((ItemDefinitionLoader) loader)
			  .aClass129_7843) {
		((ItemDefinitionLoader) loader)
		    .aClass129_7843.put
		    (class89,
		     (long) (1643372817 * itemID
			     | class103.anInt1456 * 1931687493 << 29));
	    }
	}
	if (class409 != null || i_25_ != 0) {
	    class89 = class89.method2019((byte) 1, i_29_, true);
	    if (null != class409)
		class409.method7357(class89, 0, (byte) -125);
	    if (i_25_ != 0)
		class89.method1911(i_22_, i_23_, i_24_, i_25_);
	}
	class89.method1928(i);
	return class89;
    }
    
    public ItemDefinition method13370(int i, byte i_35_) {
	if (stackIds != null && i > 1) {
	    int i_36_ = -1;
	    for (int i_37_ = 0; i_37_ < 10; i_37_++) {
		if (i >= stackAmounts[i_37_]
		    && 0 != stackAmounts[i_37_])
		    i_36_ = stackIds[i_37_];
	    }
	    if (-1 != i_36_)
		return loader
			   .list(i_36_, (short) 10751);
	}
	return this;
    }
    
    int[] method13371(Class103 class103, Class103 class103_38_, int i,
		      int i_39_, int i_40_, boolean bool, int i_41_,
		      Class96 class96, Class490 class490, GraphicsDefaults class513,
		      int i_42_) {
	Class161 class161
	    = Class161.method3448((((ItemDefinitionLoader)
				    loader)
				   .meshes),
				  interfaceModelID * -1813993629,
				  0);
	if (null == class161)
	    return null;
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (null != originalModelColors) {
	    for (int i_43_ = 0;
		 i_43_ < originalModelColors.length; i_43_++) {
		if (recol_d_palette != null
		    && i_43_ < recol_d_palette.length)
		    class161.method3457((originalModelColors
					 [i_43_]),
					clientpalette[(((ItemDefinition) this)
							 .recol_d_palette
							 [i_43_]) & 0xff]);
		else
		    class161.method3457((originalModelColors
					 [i_43_]),
					(modifiedModelColors
					 [i_43_]));
	    }
	}
	if (null != originalTextureColors) {
	    for (int i_44_ = 0;
		 i_44_ < originalTextureColors.length; i_44_++)
		class161.method3458(originalTextureColors[i_44_],
				    modifiedTextureColors[i_44_]);
	}
	if (class490 != null) {
	    for (int i_45_ = 0; i_45_ < 10; i_45_++) {
		for (int i_46_ = 0;
		     i_46_ < Class558.aShortArrayArray7261[i_45_].length;
		     i_46_++) {
		    if (class490.anIntArray6501[i_45_]
			< (Class561.aShortArrayArrayArray7298[i_45_]
			   [i_46_]).length)
			class161.method3457((Class558.aShortArrayArray7261
					     [i_45_][i_46_]),
					    (Class561.aShortArrayArrayArray7298
					     [i_45_][i_46_]
					     [(class490.anIntArray6501
					       [i_45_])]));
		}
	    }
	}
	int i_47_ = 2048;
	boolean bool_48_ = false;
	if (resizex * 754173675 != 128
	    || resizey * 772935007 != 128
	    || resizez * 173829459 != 128) {
	    bool_48_ = true;
	    i_47_ |= 0x7;
	}
	Class89 class89
	    = class103.method2356(class161, i_47_, 64,
				  (64
				   + ambient * 1018366715),
				  (contrast * 1864646775
				   + 768));
	if (!class89.method1912())
	    return null;
	if (bool_48_)
	    class89.method1863(754173675 * resizex,
			       resizey * 772935007,
			       173829459 * resizez);
	Class168 class168 = null;
	if (-1 != noteTemplateID * -1365591143) {
	    class168
		= (loader.method13283
		   (class103, class103_38_, -2142812803 * noteID, 10, 1, 0,
		    true, true, 0, class96, class490, class513, 5437078));
	    if (class168 == null)
		return null;
	} else if (-1 != lendTemplateID * 1106873195) {
	    class168
		= (loader.method13283
		   (class103, class103_38_,
		    1873329203 * lendID, i, i_39_, i_40_,
		    false, true, 0, class96, class490, class513, 1793488666));
	    if (class168 == null)
		return null;
	} else if (boughttemplate * 911570241 != -1) {
	    class168
		= (loader.method13283
		   (class103, class103_38_,
		    boughtlink * 115132331, i, i_39_, i_40_,
		    false, true, 0, class96, class490, class513, 54234062));
	    if (null == class168)
		return null;
	} else if (anInt7923 * 579904981 != -1) {
	    class168
		= (loader.method13283
		   (class103, class103_38_, anInt7904 * -1060868593, 10, 1, 0,
		    true, true, 0, class96, class490, class513, 882965879));
	    if (class168 == null)
		return null;
	}
	int i_49_;
	if (bool)
	    i_49_ = (int) ((double) (-1923471293 * zoom2d) * 1.5) << 2;
	else if (2 == i_39_)
	    i_49_ = (int) ((double) (-1923471293 * zoom2d) * 1.04) << 2;
	else
	    i_49_ = -1923471293 * zoom2d << 2;
	Class268 class268 = class103.method2310();
	Class268 class268_50_ = class103.method2226();
	class268_50_.method5268(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				2.14748365E9F,
				(float) class103.method2237((byte) 4)
					    .method2655(),
				(float) class103.method2237((byte) 4)
					    .method2654());
	class103.method2309(class268_50_);
	class103.method2254(0, 0, class103.method2237((byte) 4).method2655(),
			    class103.method2237((byte) 4).method2654());
	Class266 class266 = new Class266();
	class103.method2512(class266);
	class103.method2311(0.95F + (float) (Math.random() / 10.0));
	class103.method2227(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class266 class266_51_ = class103.method2595();
	class266_51_.method5125(0.0F, 0.0F, 1.0F,
				Class282
				    .method5490(-(zan2d * 50884575) << 3));
	class266_51_.method5128(0.0F, 1.0F, 0.0F,
				Class282
				    .method5490(yan2d * -1675080811 << 3));
	class266_51_.method5133((float) (774761921 * xof2d << 2),
				(float) (((i_49_
					   * (Class282.anIntArray4430
					      [1905798151 * xan2d << 3]))
					  >> 14)
					 - class89.method1902() / 2
					 + (1096836429 * yof2d << 2)),
				(float) ((((Class282.anIntArray4441
					    [xan2d * 1905798151 << 3])
					   * i_49_)
					  >> 14)
					 + (1096836429 * yof2d << 2)));
	class266_51_.method5128(1.0F, 0.0F, 0.0F,
				Class282
				    .method5490(xan2d * 1905798151 << 3));
	class103.method2445(0, 0, 36, 32);
	class103.method2450(2, 0);
	class103.method2396(0, 0, 36, 32, 0, 0);
	class103.method2314(0, -1, 0);
	class89.method1890(class266_51_, null, 1);
	class103.method2309(class268);
	int[] is = class103.method2251(0, 0, 36, 32);
	if (i_39_ >= 1) {
	    is = method13363(is, -16777214, (byte) 16);
	    if (i_39_ >= 2)
		is = method13363(is, -1, (byte) 16);
	}
	if (0 != i_40_)
	    method13373(is, i_40_, 1186810875);
	if (-1 != lendTemplateID * 1106873195)
	    class168.method3646(0, 0);
	else if (911570241 * boughttemplate != -1)
	    class168.method3646(0, 0);
	class103.method2259(is, 0, 36, 36, 32, (byte) -31).method3646(0, 0);
	if (-1365591143 * noteTemplateID != -1)
	    class168.method3646(0, 0);
	if (anInt7923 * 579904981 != -1)
	    class168.method3646(0, 0);
	if (1 == i_41_ || i_41_ == 2 && (-942978965 * stackable == 1
					 || i != 1) && -1 != i)
	    class96.method2128(Class354.method6435(i,
						   (((ItemDefinitionLoader)
						     (((ItemDefinition) this)
						      .loader))
						    .currentLocale),
						   class513, -221696379),
			       0, 9, -256, -16777215, 1841717961);
	is = class103.method2251(0, 0, 36, 32);
	for (int i_52_ = 0; i_52_ < is.length; i_52_++) {
	    if ((is[i_52_] & 0xffffff) == 0)
		is[i_52_] = 0;
	    else
		is[i_52_] |= ~0xffffff;
	}
	return is;
    }
    
    void method13372(Class636 class636, ItemDefinition class623_53_,
		     ItemDefinition class623_54_, ClientMessage class635) {
	interfaceModelID = ((ItemDefinition) class623_53_).interfaceModelID * 1;
	zoom2d = class623_53_.zoom2d * 1;
	xan2d = 1 * class623_53_.xan2d;
	yan2d = class623_53_.yan2d * 1;
	zan2d = class623_53_.zan2d * 1;
	xof2d = 1 * class623_53_.xof2d;
	yof2d = 1 * class623_53_.yof2d;
	ItemDefinition class623_55_ = (Class636.aClass636_8243 == class636
				 ? class623_53_ : class623_54_);
	originalModelColors
	    = ((ItemDefinition) class623_55_).originalModelColors;
	modifiedModelColors
	    = ((ItemDefinition) class623_55_).modifiedModelColors;
	recol_d_palette
	    = ((ItemDefinition) class623_55_).recol_d_palette;
	originalTextureColors
	    = ((ItemDefinition) class623_55_).originalTextureColors;
	modifiedTextureColors
	    = ((ItemDefinition) class623_55_).modifiedTextureColors;
	name = class623_54_.name;
	membersOnly = class623_54_.membersOnly;
	if (class636 == Class636.aClass636_8243) {
	    value = 1 * class623_54_.value;
	    stackable = 1511466051;
	} else if (class636 == Class636.aClass636_8246) {
	    name = ((ItemDefinition) class623_54_).aString7902;
	    value
		= (int) Math.floor((double) (483161521 * class623_54_.value
					     / (class623_54_.anInt7939
						* 142216489))) * -901467311;
	    stackable = 1511466051;
	    stockmarket = class623_54_.stockmarket;
	    anInt7887 = class623_53_.anInt7887 * 1;
	    anIntArray7909
		= ((ItemDefinition) class623_53_).anIntArray7909;
	    anIntArray7914
		= ((ItemDefinition) class623_53_).anIntArray7914;
	    inventoryOptions = new String[5];
	    inventoryOptions[0]
		= ClientMessage.aClass635_8232.getLocalisedMessage((((ItemDefinitionLoader)
							(((ItemDefinition) this)
							 .loader))
						       .currentLocale),
						      (short) 26215);
	    inventoryOptions[4]
		= class635.getLocalisedMessage((((ItemDefinitionLoader)
					 loader)
					.currentLocale),
				       (short) 28219);
	} else {
	    value = 0;
	    stackable = 1 * class623_54_.stackable;
	    equipSlotID = class623_54_.equipSlotID * 1;
	    equipID = class623_54_.equipID * 1;
	    anInt7913 = class623_54_.anInt7913 * 1;
	    maleEquip1
		= ((ItemDefinition) class623_54_).maleEquip1 * 1;
	    maleEquip2
		= 1 * ((ItemDefinition) class623_54_).maleEquip2;
	    colourEquip1
		= 1 * ((ItemDefinition) class623_54_).colourEquip1;
	    femaleEquip1
		= ((ItemDefinition) class623_54_).femaleEquip1 * 1;
	    femaleEquip2
		= 1 * ((ItemDefinition) class623_54_).femaleEquip2;
	    colourEquip2
		= 1 * ((ItemDefinition) class623_54_).colourEquip2;
	    manwearxoff
		= 1 * ((ItemDefinition) class623_54_).manwearxoff;
	    womanwearxoff
		= ((ItemDefinition) class623_54_).womanwearxoff * 1;
	    manwearyoff
		= ((ItemDefinition) class623_54_).manwearyoff * 1;
	    womanwearyoff
		= ((ItemDefinition) class623_54_).womanwearyoff * 1;
	    manwearzoff
		= 1 * ((ItemDefinition) class623_54_).manwearzoff;
	    womanwearzoff
		= ((ItemDefinition) class623_54_).womanwearzoff * 1;
	    manhead
		= 1 * ((ItemDefinition) class623_54_).manhead;
	    manhead2
		= ((ItemDefinition) class623_54_).manhead2 * 1;
	    womanhead
		= ((ItemDefinition) class623_54_).womanhead * 1;
	    womanhead2
		= 1 * ((ItemDefinition) class623_54_).womanhead2;
	    anInt7887 = class623_54_.anInt7887 * 1;
	    teamID = class623_54_.teamID * 1;
	    groundOptions = class623_54_.groundOptions;
	    params
		= ((ItemDefinition) class623_54_).params;
	    inventoryOptions = new String[5];
	    if (null != class623_54_.inventoryOptions) {
		for (int i = 0; i < 4; i++)
		    inventoryOptions[i] = class623_54_.inventoryOptions[i];
	    }
	    inventoryOptions[4]
		= class635.getLocalisedMessage((((ItemDefinitionLoader)
					 loader)
					.currentLocale),
				       (short) 28514);
	}
    }
    
    void method13373(int[] is, int i, int i_56_) {
	for (int i_57_ = 31; i_57_ > 0; i_57_--) {
	    int i_58_ = i_57_ * 36;
	    for (int i_59_ = 35; i_59_ > 0; i_59_--) {
		if (is[i_58_ + i_59_] == 0 && is[i_59_ + i_58_ - 1 - 36] != 0)
		    is[i_59_ + i_58_] = i;
	    }
	}
    }
    
    public final boolean method13374(boolean bool, Class604 class604, byte i) {
	int i_60_;
	int i_61_;
	int i_62_;
	if (bool) {
	    if (null != class604 && null != class604.anIntArray7746) {
		i_60_ = class604.anIntArray7746[0];
		i_61_ = class604.anIntArray7746[1];
		i_62_ = class604.anIntArray7746[2];
	    } else {
		i_60_ = femaleEquip1 * 1129242275;
		i_61_ = femaleEquip2 * -541441075;
		i_62_ = colourEquip2 * -471628237;
	    }
	} else if (class604 != null && class604.anIntArray7742 != null) {
	    i_60_ = class604.anIntArray7742[0];
	    i_61_ = class604.anIntArray7742[1];
	    i_62_ = class604.anIntArray7742[2];
	} else {
	    i_60_ = 1500268767 * maleEquip1;
	    i_61_ = maleEquip2 * -907955105;
	    i_62_ = colourEquip1 * 795824037;
	}
	if (-1 == i_60_)
	    return true;
	boolean bool_63_ = true;
	if (!((ItemDefinitionLoader) loader).meshes
		 .method4188(i_60_, 0, -1460280121))
	    bool_63_ = false;
	if (i_61_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_61_, 0, -1145107050))
	    bool_63_ = false;
	if (i_62_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_62_, 0, -775907637))
	    bool_63_ = false;
	return bool_63_;
    }
    
    public final Class161 method13375(boolean bool, Class604 class604, int i) {
	int i_64_;
	int i_65_;
	int i_66_;
	if (bool) {
	    if (null != class604 && class604.anIntArray7746 != null) {
		i_64_ = class604.anIntArray7746[0];
		i_65_ = class604.anIntArray7746[1];
		i_66_ = class604.anIntArray7746[2];
	    } else {
		i_64_ = femaleEquip1 * 1129242275;
		i_65_ = -541441075 * femaleEquip2;
		i_66_ = -471628237 * colourEquip2;
	    }
	} else if (null != class604 && null != class604.anIntArray7742) {
	    i_64_ = class604.anIntArray7742[0];
	    i_65_ = class604.anIntArray7742[1];
	    i_66_ = class604.anIntArray7742[2];
	} else {
	    i_64_ = maleEquip1 * 1500268767;
	    i_65_ = maleEquip2 * -907955105;
	    i_66_ = 795824037 * colourEquip1;
	}
	if (-1 == i_64_)
	    return null;
	Class161 class161 = Class161.method3448((((ItemDefinitionLoader) (((ItemDefinition) this)
							      .loader))
						 .meshes),
						i_64_, 0);
	if (null == class161)
	    return null;
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (i_65_ != -1) {
	    Class161 class161_67_
		= Class161.method3448((((ItemDefinitionLoader)
					loader)
				       .meshes),
				      i_65_, 0);
	    if (class161_67_.anInt1789 < 13)
		class161_67_.method3464(2);
	    if (-1 != i_66_) {
		Class161 class161_68_
		    = Class161.method3448((((ItemDefinitionLoader)
					    loader)
					   .meshes),
					  i_66_, 0);
		if (class161_68_.anInt1789 < 13)
		    class161_68_.method3464(2);
		Class161[] class161s
		    = { class161, class161_67_, class161_68_ };
		class161 = new Class161(class161s, 3);
	    } else {
		Class161[] class161s = { class161, class161_67_ };
		class161 = new Class161(class161s, 2);
	    }
	}
	if (!bool && (0 != manwearxoff * -1097023053
		      || 0 != manwearyoff * 2070162743
		      || manwearzoff * -110000207 != 0))
	    class161.method3459(manwearxoff * -1097023053,
				2070162743 * manwearyoff,
				manwearzoff * -110000207);
	if (bool && (0 != womanwearxoff * 913293263
		     || womanwearyoff * -1194512769 != 0
		     || 0 != -1405999173 * womanwearzoff))
	    class161.method3459(913293263 * womanwearxoff,
				womanwearyoff * -1194512769,
				womanwearzoff * -1405999173);
	if (null != originalModelColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7749)
		is = class604.aShortArray7749;
	    else
		is = modifiedModelColors;
	    for (int i_69_ = 0;
		 i_69_ < originalModelColors.length; i_69_++)
		class161.method3457(originalModelColors[i_69_],
				    is[i_69_]);
	}
	if (null != originalTextureColors) {
	    short[] is;
	    if (null != class604 && null != class604.aShortArray7750)
		is = class604.aShortArray7750;
	    else
		is = modifiedTextureColors;
	    for (int i_70_ = 0;
		 i_70_ < originalTextureColors.length; i_70_++)
		class161.method3458(originalTextureColors[i_70_],
				    is[i_70_]);
	}
	return class161;
    }
    
    public final boolean method13376(boolean bool, Class604 class604, int i) {
	int i_71_;
	int i_72_;
	if (bool) {
	    if (class604 != null && class604.anIntArray7743 != null) {
		i_71_ = class604.anIntArray7743[0];
		i_72_ = class604.anIntArray7743[1];
	    } else {
		i_71_ = womanhead * 1630099121;
		i_72_ = womanhead2 * -1540815033;
	    }
	} else if (class604 != null && class604.anIntArray7747 != null) {
	    i_71_ = class604.anIntArray7747[0];
	    i_72_ = class604.anIntArray7747[1];
	} else {
	    i_71_ = -823031799 * manhead;
	    i_72_ = -1341819643 * manhead2;
	}
	if (-1 == i_71_)
	    return true;
	boolean bool_73_ = true;
	if (!((ItemDefinitionLoader) loader).meshes
		 .method4188(i_71_, 0, -1176574851))
	    bool_73_ = false;
	if (i_72_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_72_, 0, -1836832589))
	    bool_73_ = false;
	return bool_73_;
    }
    
    public final Class161 method13377(boolean bool, Class604 class604, int i) {
	int i_74_;
	int i_75_;
	if (bool) {
	    if (null != class604 && null != class604.anIntArray7743) {
		i_74_ = class604.anIntArray7743[0];
		i_75_ = class604.anIntArray7743[1];
	    } else {
		i_74_ = womanhead * 1630099121;
		i_75_ = womanhead2 * -1540815033;
	    }
	} else if (null != class604 && class604.anIntArray7747 != null) {
	    i_74_ = class604.anIntArray7747[0];
	    i_75_ = class604.anIntArray7747[1];
	} else {
	    i_74_ = -823031799 * manhead;
	    i_75_ = manhead2 * -1341819643;
	}
	if (i_74_ == -1)
	    return null;
	Class161 class161 = Class161.method3448((((ItemDefinitionLoader) (((ItemDefinition) this)
							      .loader))
						 .meshes),
						i_74_, 0);
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (-1 != i_75_) {
	    Class161 class161_76_
		= Class161.method3448((((ItemDefinitionLoader)
					loader)
				       .meshes),
				      i_75_, 0);
	    if (class161_76_.anInt1789 < 13)
		class161_76_.method3464(2);
	    Class161[] class161s = { class161, class161_76_ };
	    class161 = new Class161(class161s, 2);
	}
	if (null != originalModelColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7749)
		is = class604.aShortArray7749;
	    else
		is = modifiedModelColors;
	    for (int i_77_ = 0;
		 i_77_ < originalModelColors.length; i_77_++)
		class161.method3457(originalModelColors[i_77_],
				    is[i_77_]);
	}
	if (null != originalTextureColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7750)
		is = class604.aShortArray7750;
	    else
		is = modifiedTextureColors;
	    for (int i_78_ = 0;
		 i_78_ < originalTextureColors.length; i_78_++)
		class161.method3458(originalTextureColors[i_78_],
				    is[i_78_]);
	}
	return class161;
    }
    
    public int getParam/*method13378*/(int key, int defValue, int i_80_) {
		if (params == null) {
			return defValue;
		}
		IntegerNode intNode = ((IntegerNode) params.get((long) key));
		if (null == intNode) {
			return defValue;
		}
		return intNode.intValue * -1859754807;
    }
    
    void method13379(RSByteBuffer class241_sub3) {
		for (;;) {
			int i = class241_sub3.readUnsignedByte((byte) -76);
			if (i == 0)
			break;
			decode(class241_sub3, i, -1359575707);
		}
    }
    
    public int method13380(int i, short i_81_) {
	if (null == anIntArray7909)
	    return -1;
	return anIntArray7909[i];
    }
    
    public int method13381(int i, int i_82_) {
	if (anIntArray7914 == null)
	    return -1;
	return anIntArray7914[i];
    }
    
    void method13382() {
	/* empty */
    }
    
    void method13383(Class636 class636, ItemDefinition class623_83_,
		     ItemDefinition class623_84_, ClientMessage class635) {
	interfaceModelID = ((ItemDefinition) class623_83_).interfaceModelID * 1;
	zoom2d = class623_83_.zoom2d * 1;
	xan2d = 1 * class623_83_.xan2d;
	yan2d = class623_83_.yan2d * 1;
	zan2d = class623_83_.zan2d * 1;
	xof2d = 1 * class623_83_.xof2d;
	yof2d = 1 * class623_83_.yof2d;
	ItemDefinition class623_85_ = (Class636.aClass636_8243 == class636
				 ? class623_83_ : class623_84_);
	originalModelColors
	    = ((ItemDefinition) class623_85_).originalModelColors;
	modifiedModelColors
	    = ((ItemDefinition) class623_85_).modifiedModelColors;
	recol_d_palette
	    = ((ItemDefinition) class623_85_).recol_d_palette;
	originalTextureColors
	    = ((ItemDefinition) class623_85_).originalTextureColors;
	modifiedTextureColors
	    = ((ItemDefinition) class623_85_).modifiedTextureColors;
	name = class623_84_.name;
	membersOnly = class623_84_.membersOnly;
	if (class636 == Class636.aClass636_8243) {
	    value = 1 * class623_84_.value;
	    stackable = 1511466051;
	} else if (class636 == Class636.aClass636_8246) {
	    name = ((ItemDefinition) class623_84_).aString7902;
	    value
		= (int) Math.floor((double) (483161521 * class623_84_.value
					     / (class623_84_.anInt7939
						* 142216489))) * -901467311;
	    stackable = 1511466051;
	    stockmarket = class623_84_.stockmarket;
	    anInt7887 = class623_83_.anInt7887 * 1;
	    anIntArray7909
		= ((ItemDefinition) class623_83_).anIntArray7909;
	    anIntArray7914
		= ((ItemDefinition) class623_83_).anIntArray7914;
	    inventoryOptions = new String[5];
	    inventoryOptions[0]
		= ClientMessage.aClass635_8232.getLocalisedMessage((((ItemDefinitionLoader)
							(((ItemDefinition) this)
							 .loader))
						       .currentLocale),
						      (short) 31735);
	    inventoryOptions[4]
		= class635.getLocalisedMessage((((ItemDefinitionLoader)
					 loader)
					.currentLocale),
				       (short) 19230);
	} else {
	    value = 0;
	    stackable = 1 * class623_84_.stackable;
	    equipSlotID = class623_84_.equipSlotID * 1;
	    equipID = class623_84_.equipID * 1;
	    anInt7913 = class623_84_.anInt7913 * 1;
	    maleEquip1
		= ((ItemDefinition) class623_84_).maleEquip1 * 1;
	    maleEquip2
		= 1 * ((ItemDefinition) class623_84_).maleEquip2;
	    colourEquip1
		= 1 * ((ItemDefinition) class623_84_).colourEquip1;
	    femaleEquip1
		= ((ItemDefinition) class623_84_).femaleEquip1 * 1;
	    femaleEquip2
		= 1 * ((ItemDefinition) class623_84_).femaleEquip2;
	    colourEquip2
		= 1 * ((ItemDefinition) class623_84_).colourEquip2;
	    manwearxoff
		= 1 * ((ItemDefinition) class623_84_).manwearxoff;
	    womanwearxoff
		= ((ItemDefinition) class623_84_).womanwearxoff * 1;
	    manwearyoff
		= ((ItemDefinition) class623_84_).manwearyoff * 1;
	    womanwearyoff
		= ((ItemDefinition) class623_84_).womanwearyoff * 1;
	    manwearzoff
		= 1 * ((ItemDefinition) class623_84_).manwearzoff;
	    womanwearzoff
		= ((ItemDefinition) class623_84_).womanwearzoff * 1;
	    manhead
		= 1 * ((ItemDefinition) class623_84_).manhead;
	    manhead2
		= ((ItemDefinition) class623_84_).manhead2 * 1;
	    womanhead
		= ((ItemDefinition) class623_84_).womanhead * 1;
	    womanhead2
		= 1 * ((ItemDefinition) class623_84_).womanhead2;
	    anInt7887 = class623_84_.anInt7887 * 1;
	    teamID = class623_84_.teamID * 1;
	    groundOptions = class623_84_.groundOptions;
	    params
		= ((ItemDefinition) class623_84_).params;
	    inventoryOptions = new String[5];
	    if (null != class623_84_.inventoryOptions) {
		for (int i = 0; i < 4; i++)
		    inventoryOptions[i] = class623_84_.inventoryOptions[i];
	    }
	    inventoryOptions[4]
		= class635.getLocalisedMessage((((ItemDefinitionLoader)
					 loader)
					.currentLocale),
				       (short) 26089);
	}
    }
    
    void method13384() {
	/* empty */
    }
    
    public final Class161 method13385(boolean bool, Class604 class604) {
	int i;
	int i_86_;
	if (bool) {
	    if (null != class604 && null != class604.anIntArray7743) {
		i = class604.anIntArray7743[0];
		i_86_ = class604.anIntArray7743[1];
	    } else {
		i = womanhead * 1630099121;
		i_86_ = womanhead2 * -1540815033;
	    }
	} else if (null != class604 && class604.anIntArray7747 != null) {
	    i = class604.anIntArray7747[0];
	    i_86_ = class604.anIntArray7747[1];
	} else {
	    i = -823031799 * manhead;
	    i_86_ = manhead2 * -1341819643;
	}
	if (i == -1)
	    return null;
	Class161 class161 = Class161.method3448((((ItemDefinitionLoader) (((ItemDefinition) this)
							      .loader))
						 .meshes),
						i, 0);
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (-1 != i_86_) {
	    Class161 class161_87_
		= Class161.method3448((((ItemDefinitionLoader)
					loader)
				       .meshes),
				      i_86_, 0);
	    if (class161_87_.anInt1789 < 13)
		class161_87_.method3464(2);
	    Class161[] class161s = { class161, class161_87_ };
	    class161 = new Class161(class161s, 2);
	}
	if (null != originalModelColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7749)
		is = class604.aShortArray7749;
	    else
		is = modifiedModelColors;
	    for (int i_88_ = 0;
		 i_88_ < originalModelColors.length; i_88_++)
		class161.method3457(originalModelColors[i_88_],
				    is[i_88_]);
	}
	if (null != originalTextureColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7750)
		is = class604.aShortArray7750;
	    else
		is = modifiedTextureColors;
	    for (int i_89_ = 0;
		 i_89_ < originalTextureColors.length; i_89_++)
		class161.method3458(originalTextureColors[i_89_],
				    is[i_89_]);
	}
	return class161;
    }
    
    void toLend/*method13386*/(ItemDefinition template, ItemDefinition realItem, int i) {
    	applyTemplate(Class636.aClass636_8244, template, realItem, ClientMessage.LENT_ITEM_RETURN, -1493961741);
    }
    
    public String method13387(int i, String string, int i_92_) {
	if (params == null)
	    return string;
	ObjectNode class241_sub26
	    = ((ObjectNode)
	       params.get((long) i));
	if (null == class241_sub26)
	    return string;
	return (String) class241_sub26.objectValue;
    }
    
    int[] method13388(Class103 class103, Class103 class103_93_, int i,
		      int i_94_, int i_95_, boolean bool, int i_96_,
		      Class96 class96, Class490 class490, GraphicsDefaults class513) {
	Class161 class161
	    = Class161.method3448((((ItemDefinitionLoader)
				    loader)
				   .meshes),
				  interfaceModelID * -1813993629,
				  0);
	if (null == class161)
	    return null;
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (null != originalModelColors) {
	    for (int i_97_ = 0;
		 i_97_ < originalModelColors.length; i_97_++) {
		if (recol_d_palette != null
		    && i_97_ < recol_d_palette.length)
		    class161.method3457((originalModelColors
					 [i_97_]),
					clientpalette[(((ItemDefinition) this)
							 .recol_d_palette
							 [i_97_]) & 0xff]);
		else
		    class161.method3457((originalModelColors
					 [i_97_]),
					(modifiedModelColors
					 [i_97_]));
	    }
	}
	if (null != originalTextureColors) {
	    for (int i_98_ = 0;
		 i_98_ < originalTextureColors.length; i_98_++)
		class161.method3458(originalTextureColors[i_98_],
				    modifiedTextureColors[i_98_]);
	}
	if (class490 != null) {
	    for (int i_99_ = 0; i_99_ < 10; i_99_++) {
		for (int i_100_ = 0;
		     i_100_ < Class558.aShortArrayArray7261[i_99_].length;
		     i_100_++) {
		    if (class490.anIntArray6501[i_99_]
			< (Class561.aShortArrayArrayArray7298[i_99_]
			   [i_100_]).length)
			class161.method3457((Class558.aShortArrayArray7261
					     [i_99_][i_100_]),
					    (Class561.aShortArrayArrayArray7298
					     [i_99_][i_100_]
					     [(class490.anIntArray6501
					       [i_99_])]));
		}
	    }
	}
	int i_101_ = 2048;
	boolean bool_102_ = false;
	if (resizex * 754173675 != 128
	    || resizey * 772935007 != 128
	    || resizez * 173829459 != 128) {
	    bool_102_ = true;
	    i_101_ |= 0x7;
	}
	Class89 class89
	    = class103.method2356(class161, i_101_, 64,
				  (64
				   + ambient * 1018366715),
				  (contrast * 1864646775
				   + 768));
	if (!class89.method1912())
	    return null;
	if (bool_102_)
	    class89.method1863(754173675 * resizex,
			       resizey * 772935007,
			       173829459 * resizez);
	Class168 class168 = null;
	if (-1 != noteTemplateID * -1365591143) {
	    class168
		= (loader.method13283
		   (class103, class103_93_, -2142812803 * noteID, 10, 1, 0,
		    true, true, 0, class96, class490, class513, 533536862));
	    if (class168 == null)
		return null;
	} else if (-1 != lendTemplateID * 1106873195) {
	    class168
		= (loader.method13283
		   (class103, class103_93_,
		    1873329203 * lendID, i, i_94_, i_95_,
		    false, true, 0, class96, class490, class513, 2073245635));
	    if (class168 == null)
		return null;
	} else if (boughttemplate * 911570241 != -1) {
	    class168
		= (loader.method13283
		   (class103, class103_93_,
		    boughtlink * 115132331, i, i_94_, i_95_,
		    false, true, 0, class96, class490, class513, 2089372512));
	    if (null == class168)
		return null;
	} else if (anInt7923 * 579904981 != -1) {
	    class168
		= (loader.method13283
		   (class103, class103_93_, anInt7904 * -1060868593, 10, 1, 0,
		    true, true, 0, class96, class490, class513, 2090829434));
	    if (class168 == null)
		return null;
	}
	int i_103_;
	if (bool)
	    i_103_ = (int) ((double) (-1923471293 * zoom2d) * 1.5) << 2;
	else if (2 == i_94_)
	    i_103_ = (int) ((double) (-1923471293 * zoom2d) * 1.04) << 2;
	else
	    i_103_ = -1923471293 * zoom2d << 2;
	Class268 class268 = class103.method2310();
	Class268 class268_104_ = class103.method2226();
	class268_104_.method5268(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				 2.14748365E9F,
				 (float) class103.method2237((byte) 4)
					     .method2655(),
				 (float) class103.method2237((byte) 4)
					     .method2654());
	class103.method2309(class268_104_);
	class103.method2254(0, 0, class103.method2237((byte) 4).method2655(),
			    class103.method2237((byte) 4).method2654());
	Class266 class266 = new Class266();
	class103.method2512(class266);
	class103.method2311(0.95F + (float) (Math.random() / 10.0));
	class103.method2227(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class266 class266_105_ = class103.method2595();
	class266_105_.method5125(0.0F, 0.0F, 1.0F,
				 Class282.method5490(-(zan2d * 50884575)
						     << 3));
	class266_105_.method5128(0.0F, 1.0F, 0.0F,
				 Class282.method5490(yan2d * -1675080811
						     << 3));
	class266_105_.method5133((float) (774761921 * xof2d << 2),
				 (float) (((i_103_
					    * (Class282.anIntArray4430
					       [1905798151 * xan2d << 3]))
					   >> 14)
					  - class89.method1902() / 2
					  + (1096836429 * yof2d << 2)),
				 (float) ((((Class282.anIntArray4441
					     [xan2d * 1905798151 << 3])
					    * i_103_)
					   >> 14)
					  + (1096836429 * yof2d << 2)));
	class266_105_.method5128(1.0F, 0.0F, 0.0F,
				 Class282
				     .method5490(xan2d * 1905798151 << 3));
	class103.method2445(0, 0, 36, 32);
	class103.method2450(2, 0);
	class103.method2396(0, 0, 36, 32, 0, 0);
	class103.method2314(0, -1, 0);
	class89.method1890(class266_105_, null, 1);
	class103.method2309(class268);
	int[] is = class103.method2251(0, 0, 36, 32);
	if (i_94_ >= 1) {
	    is = method13363(is, -16777214, (byte) 16);
	    if (i_94_ >= 2)
		is = method13363(is, -1, (byte) 16);
	}
	if (0 != i_95_)
	    method13373(is, i_95_, 1186810875);
	if (-1 != lendTemplateID * 1106873195)
	    class168.method3646(0, 0);
	else if (911570241 * boughttemplate != -1)
	    class168.method3646(0, 0);
	class103.method2259(is, 0, 36, 36, 32, (byte) -55).method3646(0, 0);
	if (-1365591143 * noteTemplateID != -1)
	    class168.method3646(0, 0);
	if (anInt7923 * 579904981 != -1)
	    class168.method3646(0, 0);
	if (1 == i_96_ || i_96_ == 2 && (-942978965 * stackable == 1
					 || i != 1) && -1 != i)
	    class96.method2128(Class354.method6435(i,
						   (((ItemDefinitionLoader)
						     (((ItemDefinition) this)
						      .loader))
						    .currentLocale),
						   class513, -221696379),
			       0, 9, -256, -16777215, 1841717961);
	is = class103.method2251(0, 0, 36, 32);
	for (int i_106_ = 0; i_106_ < is.length; i_106_++) {
	    if ((is[i_106_] & 0xffffff) == 0)
		is[i_106_] = 0;
	    else
		is[i_106_] |= ~0xffffff;
	}
	return is;
    }
    
    void method13389(Class636 class636, ItemDefinition class623_107_,
		     ItemDefinition class623_108_, ClientMessage class635) {
	interfaceModelID = ((ItemDefinition) class623_107_).interfaceModelID * 1;
	zoom2d = class623_107_.zoom2d * 1;
	xan2d = 1 * class623_107_.xan2d;
	yan2d = class623_107_.yan2d * 1;
	zan2d = class623_107_.zan2d * 1;
	xof2d = 1 * class623_107_.xof2d;
	yof2d = 1 * class623_107_.yof2d;
	ItemDefinition class623_109_ = (Class636.aClass636_8243 == class636
				  ? class623_107_ : class623_108_);
	originalModelColors
	    = ((ItemDefinition) class623_109_).originalModelColors;
	modifiedModelColors
	    = ((ItemDefinition) class623_109_).modifiedModelColors;
	recol_d_palette
	    = ((ItemDefinition) class623_109_).recol_d_palette;
	originalTextureColors
	    = ((ItemDefinition) class623_109_).originalTextureColors;
	modifiedTextureColors
	    = ((ItemDefinition) class623_109_).modifiedTextureColors;
	name = class623_108_.name;
	membersOnly = class623_108_.membersOnly;
	if (class636 == Class636.aClass636_8243) {
	    value = 1 * class623_108_.value;
	    stackable = 1511466051;
	} else if (class636 == Class636.aClass636_8246) {
	    name = ((ItemDefinition) class623_108_).aString7902;
	    value
		= (int) Math.floor((double) (483161521
					     * class623_108_.value
					     / (class623_108_.anInt7939
						* 142216489))) * -901467311;
	    stackable = 1511466051;
	    stockmarket = class623_108_.stockmarket;
	    anInt7887 = class623_107_.anInt7887 * 1;
	    anIntArray7909
		= ((ItemDefinition) class623_107_).anIntArray7909;
	    anIntArray7914
		= ((ItemDefinition) class623_107_).anIntArray7914;
	    inventoryOptions = new String[5];
	    inventoryOptions[0]
		= ClientMessage.aClass635_8232.getLocalisedMessage((((ItemDefinitionLoader)
							(((ItemDefinition) this)
							 .loader))
						       .currentLocale),
						      (short) 21949);
	    inventoryOptions[4]
		= class635.getLocalisedMessage((((ItemDefinitionLoader)
					 loader)
					.currentLocale),
				       (short) 22034);
	} else {
	    value = 0;
	    stackable = 1 * class623_108_.stackable;
	    equipSlotID = class623_108_.equipSlotID * 1;
	    equipID = class623_108_.equipID * 1;
	    anInt7913 = class623_108_.anInt7913 * 1;
	    maleEquip1
		= ((ItemDefinition) class623_108_).maleEquip1 * 1;
	    maleEquip2
		= 1 * ((ItemDefinition) class623_108_).maleEquip2;
	    colourEquip1
		= 1 * ((ItemDefinition) class623_108_).colourEquip1;
	    femaleEquip1
		= ((ItemDefinition) class623_108_).femaleEquip1 * 1;
	    femaleEquip2
		= 1 * ((ItemDefinition) class623_108_).femaleEquip2;
	    colourEquip2
		= 1 * ((ItemDefinition) class623_108_).colourEquip2;
	    manwearxoff
		= 1 * ((ItemDefinition) class623_108_).manwearxoff;
	    womanwearxoff
		= ((ItemDefinition) class623_108_).womanwearxoff * 1;
	    manwearyoff
		= ((ItemDefinition) class623_108_).manwearyoff * 1;
	    womanwearyoff
		= ((ItemDefinition) class623_108_).womanwearyoff * 1;
	    manwearzoff
		= 1 * ((ItemDefinition) class623_108_).manwearzoff;
	    womanwearzoff
		= ((ItemDefinition) class623_108_).womanwearzoff * 1;
	    manhead
		= 1 * ((ItemDefinition) class623_108_).manhead;
	    manhead2
		= ((ItemDefinition) class623_108_).manhead2 * 1;
	    womanhead
		= ((ItemDefinition) class623_108_).womanhead * 1;
	    womanhead2
		= 1 * ((ItemDefinition) class623_108_).womanhead2;
	    anInt7887 = class623_108_.anInt7887 * 1;
	    teamID = class623_108_.teamID * 1;
	    groundOptions = class623_108_.groundOptions;
	    params
		= ((ItemDefinition) class623_108_).params;
	    inventoryOptions = new String[5];
	    if (null != class623_108_.inventoryOptions) {
		for (int i = 0; i < 4; i++)
		    inventoryOptions[i] = class623_108_.inventoryOptions[i];
	    }
	    inventoryOptions[4]
		= class635.getLocalisedMessage((((ItemDefinitionLoader)
					 loader)
					.currentLocale),
				       (short) 22688);
	}
    }
    
    void method13390(Class636 class636, ItemDefinition class623_110_,
		     ItemDefinition class623_111_, ClientMessage class635) {
	interfaceModelID = ((ItemDefinition) class623_110_).interfaceModelID * 1;
	zoom2d = class623_110_.zoom2d * 1;
	xan2d = 1 * class623_110_.xan2d;
	yan2d = class623_110_.yan2d * 1;
	zan2d = class623_110_.zan2d * 1;
	xof2d = 1 * class623_110_.xof2d;
	yof2d = 1 * class623_110_.yof2d;
	ItemDefinition class623_112_ = (Class636.aClass636_8243 == class636
				  ? class623_110_ : class623_111_);
	originalModelColors
	    = ((ItemDefinition) class623_112_).originalModelColors;
	modifiedModelColors
	    = ((ItemDefinition) class623_112_).modifiedModelColors;
	recol_d_palette
	    = ((ItemDefinition) class623_112_).recol_d_palette;
	originalTextureColors
	    = ((ItemDefinition) class623_112_).originalTextureColors;
	modifiedTextureColors
	    = ((ItemDefinition) class623_112_).modifiedTextureColors;
	name = class623_111_.name;
	membersOnly = class623_111_.membersOnly;
	if (class636 == Class636.aClass636_8243) {
	    value = 1 * class623_111_.value;
	    stackable = 1511466051;
	} else if (class636 == Class636.aClass636_8246) {
	    name = ((ItemDefinition) class623_111_).aString7902;
	    value
		= (int) Math.floor((double) (483161521
					     * class623_111_.value
					     / (class623_111_.anInt7939
						* 142216489))) * -901467311;
	    stackable = 1511466051;
	    stockmarket = class623_111_.stockmarket;
	    anInt7887 = class623_110_.anInt7887 * 1;
	    anIntArray7909
		= ((ItemDefinition) class623_110_).anIntArray7909;
	    anIntArray7914
		= ((ItemDefinition) class623_110_).anIntArray7914;
	    inventoryOptions = new String[5];
	    inventoryOptions[0]
		= ClientMessage.aClass635_8232.getLocalisedMessage((((ItemDefinitionLoader)
							(((ItemDefinition) this)
							 .loader))
						       .currentLocale),
						      (short) 25974);
	    inventoryOptions[4]
		= class635.getLocalisedMessage((((ItemDefinitionLoader)
					 loader)
					.currentLocale),
				       (short) 29324);
	} else {
	    value = 0;
	    stackable = 1 * class623_111_.stackable;
	    equipSlotID = class623_111_.equipSlotID * 1;
	    equipID = class623_111_.equipID * 1;
	    anInt7913 = class623_111_.anInt7913 * 1;
	    maleEquip1
		= ((ItemDefinition) class623_111_).maleEquip1 * 1;
	    maleEquip2
		= 1 * ((ItemDefinition) class623_111_).maleEquip2;
	    colourEquip1
		= 1 * ((ItemDefinition) class623_111_).colourEquip1;
	    femaleEquip1
		= ((ItemDefinition) class623_111_).femaleEquip1 * 1;
	    femaleEquip2
		= 1 * ((ItemDefinition) class623_111_).femaleEquip2;
	    colourEquip2
		= 1 * ((ItemDefinition) class623_111_).colourEquip2;
	    manwearxoff
		= 1 * ((ItemDefinition) class623_111_).manwearxoff;
	    womanwearxoff
		= ((ItemDefinition) class623_111_).womanwearxoff * 1;
	    manwearyoff
		= ((ItemDefinition) class623_111_).manwearyoff * 1;
	    womanwearyoff
		= ((ItemDefinition) class623_111_).womanwearyoff * 1;
	    manwearzoff
		= 1 * ((ItemDefinition) class623_111_).manwearzoff;
	    womanwearzoff
		= ((ItemDefinition) class623_111_).womanwearzoff * 1;
	    manhead
		= 1 * ((ItemDefinition) class623_111_).manhead;
	    manhead2
		= ((ItemDefinition) class623_111_).manhead2 * 1;
	    womanhead
		= ((ItemDefinition) class623_111_).womanhead * 1;
	    womanhead2
		= 1 * ((ItemDefinition) class623_111_).womanhead2;
	    anInt7887 = class623_111_.anInt7887 * 1;
	    teamID = class623_111_.teamID * 1;
	    groundOptions = class623_111_.groundOptions;
	    params
		= ((ItemDefinition) class623_111_).params;
	    inventoryOptions = new String[5];
	    if (null != class623_111_.inventoryOptions) {
		for (int i = 0; i < 4; i++)
		    inventoryOptions[i] = class623_111_.inventoryOptions[i];
	    }
	    inventoryOptions[4]
		= class635.getLocalisedMessage((((ItemDefinitionLoader)
					 loader)
					.currentLocale),
				       (short) 24027);
	}
    }
    
    void method13391(ItemDefinition class623_113_, ItemDefinition class623_114_) {
	applyTemplate(Class636.aClass636_8243, class623_113_, class623_114_,
		    null, -1493961741);
    }
    
    void method13392(ItemDefinition class623_115_, ItemDefinition class623_116_) {
	applyTemplate(Class636.aClass636_8243, class623_115_, class623_116_,
		    null, -1493961741);
    }
    
    void method13393(ItemDefinition class623_117_, ItemDefinition class623_118_) {
	applyTemplate(Class636.aClass636_8243, class623_117_, class623_118_,
		    null, -1493961741);
    }
    
    void method13394(ItemDefinition class623_119_, ItemDefinition class623_120_) {
	applyTemplate(Class636.aClass636_8243, class623_119_, class623_120_,
		    null, -1493961741);
    }
    
    public final Class89 method13395
	(Class103 class103, int i, int i_121_, Class490 class490,
	 Class409 class409, int i_122_, int i_123_, int i_124_, int i_125_) {
	if (null != stackIds && i_121_ > 1) {
	    int i_126_ = -1;
	    for (int i_127_ = 0; i_127_ < 10; i_127_++) {
		if (i_121_ >= stackAmounts[i_127_]
		    && 0 != stackAmounts[i_127_])
		    i_126_ = stackIds[i_127_];
	    }
	    if (i_126_ != -1)
		return (loader.list
			    (i_126_, (short) -1946).method13369
			(class103, i, 1, class490, class409, i_122_, i_123_,
			 i_124_, i_125_, (byte) 1));
	}
	int i_128_ = i;
	if (null != class409)
	    i_128_ |= class409.method7356(2029443111);
	Class89 class89;
	synchronized (((ItemDefinitionLoader) loader)
		      .aClass129_7843) {
	    class89 = ((Class89)
		       (((ItemDefinitionLoader) loader)
			    .aClass129_7843.get
			((long) (itemID * 1643372817
				 | class103.anInt1456 * 1931687493 << 29))));
	}
	if (class89 == null
	    || class103.method2301(class89.method1866(), i_128_) != 0) {
	    if (null != class89)
		i_128_ = class103.method2302(i_128_, class89.method1866());
	    int i_129_ = i_128_;
	    if (null != originalTextureColors)
		i_129_ |= 0x8000;
	    if (null != originalModelColors || null != class490)
		i_129_ |= 0x4000;
	    if (128 != 754173675 * resizex)
		i_129_ |= 0x1;
	    if (772935007 * resizey != 128)
		i_129_ |= 0x2;
	    if (128 != resizez * 173829459)
		i_129_ |= 0x4;
	    Class161 class161
		= Class161.method3448((((ItemDefinitionLoader)
					loader)
				       .meshes),
				      (-1813993629
				       * interfaceModelID),
				      0);
	    if (null == class161)
		return null;
	    if (class161.anInt1789 < 13)
		class161.method3464(2);
	    class89
		= (class103.method2356
		   (class161, i_129_,
		    1544873583 * (((ItemDefinitionLoader) loader)
				  .anInt7842),
		    64 + 1018366715 * ambient,
		    contrast * 1864646775 + 850));
	    if (754173675 * resizex != 128
		|| 772935007 * resizey != 128
		|| 173829459 * resizez != 128)
		class89.method1863(754173675 * resizex,
				   772935007 * resizey,
				   resizez * 173829459);
	    if (null != originalModelColors) {
		for (int i_130_ = 0;
		     i_130_ < originalModelColors.length;
		     i_130_++) {
		    if (null != recol_d_palette
			&& i_130_ < recol_d_palette.length)
			class89.method1908((originalModelColors
					    [i_130_]),
					   clientpalette[(((ItemDefinition) this)
							    .recol_d_palette
							    [i_130_]) & 0xff]);
		    else
			class89.method1908((originalModelColors
					    [i_130_]),
					   (modifiedModelColors
					    [i_130_]));
		}
	    }
	    if (originalTextureColors != null) {
		for (int i_131_ = 0;
		     i_131_ < originalTextureColors.length;
		     i_131_++)
		    class89.method1985((originalTextureColors
					[i_131_]),
				       (modifiedTextureColors
					[i_131_]));
	    }
	    if (null != class490) {
		for (int i_132_ = 0; i_132_ < 10; i_132_++) {
		    for (int i_133_ = 0;
			 i_133_ < Class558.aShortArrayArray7261[i_132_].length;
			 i_133_++) {
			if (class490.anIntArray6501[i_132_]
			    < (Class561.aShortArrayArrayArray7298[i_132_]
			       [i_133_]).length)
			    class89.method1908
				(Class558.aShortArrayArray7261[i_132_][i_133_],
				 (Class561.aShortArrayArrayArray7298[i_132_]
				  [i_133_][class490.anIntArray6501[i_132_]]));
		    }
		}
	    }
	    class89.method1928(i_128_);
	    synchronized (((ItemDefinitionLoader) loader)
			  .aClass129_7843) {
		((ItemDefinitionLoader) loader)
		    .aClass129_7843.put
		    (class89,
		     (long) (1643372817 * itemID
			     | class103.anInt1456 * 1931687493 << 29));
	    }
	}
	if (class409 != null || i_125_ != 0) {
	    class89 = class89.method2019((byte) 1, i_128_, true);
	    if (null != class409)
		class409.method7357(class89, 0, (byte) -27);
	    if (i_125_ != 0)
		class89.method1911(i_122_, i_123_, i_124_, i_125_);
	}
	class89.method1928(i);
	return class89;
    }
    
    public final Class89 method13396
	(Class103 class103, int i, int i_134_, Class490 class490,
	 Class409 class409, int i_135_, int i_136_, int i_137_, int i_138_) {
	if (null != stackIds && i_134_ > 1) {
	    int i_139_ = -1;
	    for (int i_140_ = 0; i_140_ < 10; i_140_++) {
		if (i_134_ >= stackAmounts[i_140_]
		    && 0 != stackAmounts[i_140_])
		    i_139_ = stackIds[i_140_];
	    }
	    if (i_139_ != -1)
		return (loader.list
			    (i_139_, (short) 22628).method13369
			(class103, i, 1, class490, class409, i_135_, i_136_,
			 i_137_, i_138_, (byte) 1));
	}
	int i_141_ = i;
	if (null != class409)
	    i_141_ |= class409.method7356(1008071525);
	Class89 class89;
	synchronized (((ItemDefinitionLoader) loader)
		      .aClass129_7843) {
	    class89 = ((Class89)
		       (((ItemDefinitionLoader) loader)
			    .aClass129_7843.get
			((long) (itemID * 1643372817
				 | class103.anInt1456 * 1931687493 << 29))));
	}
	if (class89 == null
	    || class103.method2301(class89.method1866(), i_141_) != 0) {
	    if (null != class89)
		i_141_ = class103.method2302(i_141_, class89.method1866());
	    int i_142_ = i_141_;
	    if (null != originalTextureColors)
		i_142_ |= 0x8000;
	    if (null != originalModelColors || null != class490)
		i_142_ |= 0x4000;
	    if (128 != 754173675 * resizex)
		i_142_ |= 0x1;
	    if (772935007 * resizey != 128)
		i_142_ |= 0x2;
	    if (128 != resizez * 173829459)
		i_142_ |= 0x4;
	    Class161 class161
		= Class161.method3448((((ItemDefinitionLoader)
					loader)
				       .meshes),
				      (-1813993629
				       * interfaceModelID),
				      0);
	    if (null == class161)
		return null;
	    if (class161.anInt1789 < 13)
		class161.method3464(2);
	    class89
		= (class103.method2356
		   (class161, i_142_,
		    1544873583 * (((ItemDefinitionLoader) loader)
				  .anInt7842),
		    64 + 1018366715 * ambient,
		    contrast * 1864646775 + 850));
	    if (754173675 * resizex != 128
		|| 772935007 * resizey != 128
		|| 173829459 * resizez != 128)
		class89.method1863(754173675 * resizex,
				   772935007 * resizey,
				   resizez * 173829459);
	    if (null != originalModelColors) {
		for (int i_143_ = 0;
		     i_143_ < originalModelColors.length;
		     i_143_++) {
		    if (null != recol_d_palette
			&& i_143_ < recol_d_palette.length)
			class89.method1908((originalModelColors
					    [i_143_]),
					   clientpalette[(((ItemDefinition) this)
							    .recol_d_palette
							    [i_143_]) & 0xff]);
		    else
			class89.method1908((originalModelColors
					    [i_143_]),
					   (modifiedModelColors
					    [i_143_]));
		}
	    }
	    if (originalTextureColors != null) {
		for (int i_144_ = 0;
		     i_144_ < originalTextureColors.length;
		     i_144_++)
		    class89.method1985((originalTextureColors
					[i_144_]),
				       (modifiedTextureColors
					[i_144_]));
	    }
	    if (null != class490) {
		for (int i_145_ = 0; i_145_ < 10; i_145_++) {
		    for (int i_146_ = 0;
			 i_146_ < Class558.aShortArrayArray7261[i_145_].length;
			 i_146_++) {
			if (class490.anIntArray6501[i_145_]
			    < (Class561.aShortArrayArrayArray7298[i_145_]
			       [i_146_]).length)
			    class89.method1908
				(Class558.aShortArrayArray7261[i_145_][i_146_],
				 (Class561.aShortArrayArrayArray7298[i_145_]
				  [i_146_][class490.anIntArray6501[i_145_]]));
		    }
		}
	    }
	    class89.method1928(i_141_);
	    synchronized (((ItemDefinitionLoader) loader)
			  .aClass129_7843) {
		((ItemDefinitionLoader) loader)
		    .aClass129_7843.put
		    (class89,
		     (long) (1643372817 * itemID
			     | class103.anInt1456 * 1931687493 << 29));
	    }
	}
	if (class409 != null || i_138_ != 0) {
	    class89 = class89.method2019((byte) 1, i_141_, true);
	    if (null != class409)
		class409.method7357(class89, 0, (byte) -80);
	    if (i_138_ != 0)
		class89.method1911(i_135_, i_136_, i_137_, i_138_);
	}
	class89.method1928(i);
	return class89;
    }
    
    static String method13397(int i, Language class437, GraphicsDefaults class513) {
	if (i < 100000)
	    return new StringBuilder().append
		       (ScriptVarType.method5845(-905822813 * class513.anInt6724,
					    -339489257))
		       .append
		       (i).append
		       (aString7956).toString();
	if (i < 10000000)
	    return new StringBuilder().append
		       (ScriptVarType.method5845(class513.anInt6728 * -859918135,
					    -1585013327))
		       .append
		       (i / 1000).append
		       (ClientMessage.THOUSAND_SHORT.getLocalisedMessage(class437,
							    (short) 31482))
		       .append
		       (aString7956).toString();
	return new StringBuilder().append
		   (ScriptVarType.method5845(377039413 * class513.anInt6729,
					-747521463))
		   .append
		   (i / 1000000).append
		   (ClientMessage.MILLION_SHORT.getLocalisedMessage(class437,
							(short) 29992))
		   .append
		   (aString7956).toString();
    }
    
    public ItemDefinition method13398(int i) {
	if (stackIds != null && i > 1) {
	    int i_147_ = -1;
	    for (int i_148_ = 0; i_148_ < 10; i_148_++) {
		if (i >= stackAmounts[i_148_]
		    && 0 != stackAmounts[i_148_])
		    i_147_ = stackIds[i_148_];
	    }
	    if (-1 != i_147_)
		return loader
			   .list(i_147_, (short) 12531);
	}
	return this;
    }
    
    int[] method13399(Class103 class103, Class103 class103_149_, int i,
		      int i_150_, int i_151_, boolean bool, int i_152_,
		      Class96 class96, Class490 class490, GraphicsDefaults class513) {
	Class161 class161
	    = Class161.method3448((((ItemDefinitionLoader)
				    loader)
				   .meshes),
				  interfaceModelID * -1813993629,
				  0);
	if (null == class161)
	    return null;
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (null != originalModelColors) {
	    for (int i_153_ = 0;
		 i_153_ < originalModelColors.length; i_153_++) {
		if (recol_d_palette != null
		    && i_153_ < recol_d_palette.length)
		    class161.method3457((originalModelColors
					 [i_153_]),
					clientpalette[(((ItemDefinition) this)
							 .recol_d_palette
							 [i_153_]) & 0xff]);
		else
		    class161.method3457((originalModelColors
					 [i_153_]),
					(modifiedModelColors
					 [i_153_]));
	    }
	}
	if (null != originalTextureColors) {
	    for (int i_154_ = 0;
		 i_154_ < originalTextureColors.length; i_154_++)
		class161.method3458(originalTextureColors[i_154_],
				    modifiedTextureColors[i_154_]);
	}
	if (class490 != null) {
	    for (int i_155_ = 0; i_155_ < 10; i_155_++) {
		for (int i_156_ = 0;
		     i_156_ < Class558.aShortArrayArray7261[i_155_].length;
		     i_156_++) {
		    if (class490.anIntArray6501[i_155_]
			< (Class561.aShortArrayArrayArray7298[i_155_]
			   [i_156_]).length)
			class161.method3457((Class558.aShortArrayArray7261
					     [i_155_][i_156_]),
					    (Class561.aShortArrayArrayArray7298
					     [i_155_][i_156_]
					     [(class490.anIntArray6501
					       [i_155_])]));
		}
	    }
	}
	int i_157_ = 2048;
	boolean bool_158_ = false;
	if (resizex * 754173675 != 128
	    || resizey * 772935007 != 128
	    || resizez * 173829459 != 128) {
	    bool_158_ = true;
	    i_157_ |= 0x7;
	}
	Class89 class89
	    = class103.method2356(class161, i_157_, 64,
				  (64
				   + ambient * 1018366715),
				  (contrast * 1864646775
				   + 768));
	if (!class89.method1912())
	    return null;
	if (bool_158_)
	    class89.method1863(754173675 * resizex,
			       resizey * 772935007,
			       173829459 * resizez);
	Class168 class168 = null;
	if (-1 != noteTemplateID * -1365591143) {
	    class168
		= (loader.method13283
		   (class103, class103_149_, -2142812803 * noteID, 10, 1, 0,
		    true, true, 0, class96, class490, class513, 1490324247));
	    if (class168 == null)
		return null;
	} else if (-1 != lendTemplateID * 1106873195) {
	    class168 = (loader.method13283
			(class103, class103_149_,
			 1873329203 * lendID, i, i_150_,
			 i_151_, false, true, 0, class96, class490, class513,
			 -256555502));
	    if (class168 == null)
		return null;
	} else if (boughttemplate * 911570241 != -1) {
	    class168
		= (loader.method13283
		   (class103, class103_149_,
		    boughtlink * 115132331, i, i_150_, i_151_,
		    false, true, 0, class96, class490, class513, -53430651));
	    if (null == class168)
		return null;
	} else if (anInt7923 * 579904981 != -1) {
	    class168
		= (loader.method13283
		   (class103, class103_149_, anInt7904 * -1060868593, 10, 1, 0,
		    true, true, 0, class96, class490, class513, 536476958));
	    if (class168 == null)
		return null;
	}
	int i_159_;
	if (bool)
	    i_159_ = (int) ((double) (-1923471293 * zoom2d) * 1.5) << 2;
	else if (2 == i_150_)
	    i_159_ = (int) ((double) (-1923471293 * zoom2d) * 1.04) << 2;
	else
	    i_159_ = -1923471293 * zoom2d << 2;
	Class268 class268 = class103.method2310();
	Class268 class268_160_ = class103.method2226();
	class268_160_.method5268(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				 2.14748365E9F,
				 (float) class103.method2237((byte) 4)
					     .method2655(),
				 (float) class103.method2237((byte) 4)
					     .method2654());
	class103.method2309(class268_160_);
	class103.method2254(0, 0, class103.method2237((byte) 4).method2655(),
			    class103.method2237((byte) 4).method2654());
	Class266 class266 = new Class266();
	class103.method2512(class266);
	class103.method2311(0.95F + (float) (Math.random() / 10.0));
	class103.method2227(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class266 class266_161_ = class103.method2595();
	class266_161_.method5125(0.0F, 0.0F, 1.0F,
				 Class282.method5490(-(zan2d * 50884575)
						     << 3));
	class266_161_.method5128(0.0F, 1.0F, 0.0F,
				 Class282.method5490(yan2d * -1675080811
						     << 3));
	class266_161_.method5133((float) (774761921 * xof2d << 2),
				 (float) (((i_159_
					    * (Class282.anIntArray4430
					       [1905798151 * xan2d << 3]))
					   >> 14)
					  - class89.method1902() / 2
					  + (1096836429 * yof2d << 2)),
				 (float) ((((Class282.anIntArray4441
					     [xan2d * 1905798151 << 3])
					    * i_159_)
					   >> 14)
					  + (1096836429 * yof2d << 2)));
	class266_161_.method5128(1.0F, 0.0F, 0.0F,
				 Class282
				     .method5490(xan2d * 1905798151 << 3));
	class103.method2445(0, 0, 36, 32);
	class103.method2450(2, 0);
	class103.method2396(0, 0, 36, 32, 0, 0);
	class103.method2314(0, -1, 0);
	class89.method1890(class266_161_, null, 1);
	class103.method2309(class268);
	int[] is = class103.method2251(0, 0, 36, 32);
	if (i_150_ >= 1) {
	    is = method13363(is, -16777214, (byte) 16);
	    if (i_150_ >= 2)
		is = method13363(is, -1, (byte) 16);
	}
	if (0 != i_151_)
	    method13373(is, i_151_, 1186810875);
	if (-1 != lendTemplateID * 1106873195)
	    class168.method3646(0, 0);
	else if (911570241 * boughttemplate != -1)
	    class168.method3646(0, 0);
	class103.method2259(is, 0, 36, 36, 32, (byte) -113).method3646(0, 0);
	if (-1365591143 * noteTemplateID != -1)
	    class168.method3646(0, 0);
	if (anInt7923 * 579904981 != -1)
	    class168.method3646(0, 0);
	if (1 == i_152_ || i_152_ == 2 && (-942978965 * stackable == 1
					   || i != 1) && -1 != i)
	    class96.method2128(Class354.method6435(i,
						   (((ItemDefinitionLoader)
						     (((ItemDefinition) this)
						      .loader))
						    .currentLocale),
						   class513, -221696379),
			       0, 9, -256, -16777215, 1841717961);
	is = class103.method2251(0, 0, 36, 32);
	for (int i_162_ = 0; i_162_ < is.length; i_162_++) {
	    if ((is[i_162_] & 0xffffff) == 0)
		is[i_162_] = 0;
	    else
		is[i_162_] |= ~0xffffff;
	}
	return is;
    }
    
    int[] method13400(Class103 class103, Class103 class103_163_, int i,
		      int i_164_, int i_165_, boolean bool, int i_166_,
		      Class96 class96, Class490 class490, GraphicsDefaults class513) {
	Class161 class161
	    = Class161.method3448((((ItemDefinitionLoader)
				    loader)
				   .meshes),
				  interfaceModelID * -1813993629,
				  0);
	if (null == class161)
	    return null;
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (null != originalModelColors) {
	    for (int i_167_ = 0;
		 i_167_ < originalModelColors.length; i_167_++) {
		if (recol_d_palette != null
		    && i_167_ < recol_d_palette.length)
		    class161.method3457((originalModelColors
					 [i_167_]),
					clientpalette[(((ItemDefinition) this)
							 .recol_d_palette
							 [i_167_]) & 0xff]);
		else
		    class161.method3457((originalModelColors
					 [i_167_]),
					(modifiedModelColors
					 [i_167_]));
	    }
	}
	if (null != originalTextureColors) {
	    for (int i_168_ = 0;
		 i_168_ < originalTextureColors.length; i_168_++)
		class161.method3458(originalTextureColors[i_168_],
				    modifiedTextureColors[i_168_]);
	}
	if (class490 != null) {
	    for (int i_169_ = 0; i_169_ < 10; i_169_++) {
		for (int i_170_ = 0;
		     i_170_ < Class558.aShortArrayArray7261[i_169_].length;
		     i_170_++) {
		    if (class490.anIntArray6501[i_169_]
			< (Class561.aShortArrayArrayArray7298[i_169_]
			   [i_170_]).length)
			class161.method3457((Class558.aShortArrayArray7261
					     [i_169_][i_170_]),
					    (Class561.aShortArrayArrayArray7298
					     [i_169_][i_170_]
					     [(class490.anIntArray6501
					       [i_169_])]));
		}
	    }
	}
	int i_171_ = 2048;
	boolean bool_172_ = false;
	if (resizex * 754173675 != 128
	    || resizey * 772935007 != 128
	    || resizez * 173829459 != 128) {
	    bool_172_ = true;
	    i_171_ |= 0x7;
	}
	Class89 class89
	    = class103.method2356(class161, i_171_, 64,
				  (64
				   + ambient * 1018366715),
				  (contrast * 1864646775
				   + 768));
	if (!class89.method1912())
	    return null;
	if (bool_172_)
	    class89.method1863(754173675 * resizex,
			       resizey * 772935007,
			       173829459 * resizez);
	Class168 class168 = null;
	if (-1 != noteTemplateID * -1365591143) {
	    class168
		= (loader.method13283
		   (class103, class103_163_, -2142812803 * noteID, 10, 1, 0,
		    true, true, 0, class96, class490, class513, 794498359));
	    if (class168 == null)
		return null;
	} else if (-1 != lendTemplateID * 1106873195) {
	    class168 = (loader.method13283
			(class103, class103_163_,
			 1873329203 * lendID, i, i_164_,
			 i_165_, false, true, 0, class96, class490, class513,
			 1702974775));
	    if (class168 == null)
		return null;
	} else if (boughttemplate * 911570241 != -1) {
	    class168
		= (loader.method13283
		   (class103, class103_163_,
		    boughtlink * 115132331, i, i_164_, i_165_,
		    false, true, 0, class96, class490, class513, 1883467730));
	    if (null == class168)
		return null;
	} else if (anInt7923 * 579904981 != -1) {
	    class168
		= (loader.method13283
		   (class103, class103_163_, anInt7904 * -1060868593, 10, 1, 0,
		    true, true, 0, class96, class490, class513, 541264170));
	    if (class168 == null)
		return null;
	}
	int i_173_;
	if (bool)
	    i_173_ = (int) ((double) (-1923471293 * zoom2d) * 1.5) << 2;
	else if (2 == i_164_)
	    i_173_ = (int) ((double) (-1923471293 * zoom2d) * 1.04) << 2;
	else
	    i_173_ = -1923471293 * zoom2d << 2;
	Class268 class268 = class103.method2310();
	Class268 class268_174_ = class103.method2226();
	class268_174_.method5268(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				 2.14748365E9F,
				 (float) class103.method2237((byte) 4)
					     .method2655(),
				 (float) class103.method2237((byte) 4)
					     .method2654());
	class103.method2309(class268_174_);
	class103.method2254(0, 0, class103.method2237((byte) 4).method2655(),
			    class103.method2237((byte) 4).method2654());
	Class266 class266 = new Class266();
	class103.method2512(class266);
	class103.method2311(0.95F + (float) (Math.random() / 10.0));
	class103.method2227(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class266 class266_175_ = class103.method2595();
	class266_175_.method5125(0.0F, 0.0F, 1.0F,
				 Class282.method5490(-(zan2d * 50884575)
						     << 3));
	class266_175_.method5128(0.0F, 1.0F, 0.0F,
				 Class282.method5490(yan2d * -1675080811
						     << 3));
	class266_175_.method5133((float) (774761921 * xof2d << 2),
				 (float) (((i_173_
					    * (Class282.anIntArray4430
					       [1905798151 * xan2d << 3]))
					   >> 14)
					  - class89.method1902() / 2
					  + (1096836429 * yof2d << 2)),
				 (float) ((((Class282.anIntArray4441
					     [xan2d * 1905798151 << 3])
					    * i_173_)
					   >> 14)
					  + (1096836429 * yof2d << 2)));
	class266_175_.method5128(1.0F, 0.0F, 0.0F,
				 Class282
				     .method5490(xan2d * 1905798151 << 3));
	class103.method2445(0, 0, 36, 32);
	class103.method2450(2, 0);
	class103.method2396(0, 0, 36, 32, 0, 0);
	class103.method2314(0, -1, 0);
	class89.method1890(class266_175_, null, 1);
	class103.method2309(class268);
	int[] is = class103.method2251(0, 0, 36, 32);
	if (i_164_ >= 1) {
	    is = method13363(is, -16777214, (byte) 16);
	    if (i_164_ >= 2)
		is = method13363(is, -1, (byte) 16);
	}
	if (0 != i_165_)
	    method13373(is, i_165_, 1186810875);
	if (-1 != lendTemplateID * 1106873195)
	    class168.method3646(0, 0);
	else if (911570241 * boughttemplate != -1)
	    class168.method3646(0, 0);
	class103.method2259(is, 0, 36, 36, 32, (byte) -47).method3646(0, 0);
	if (-1365591143 * noteTemplateID != -1)
	    class168.method3646(0, 0);
	if (anInt7923 * 579904981 != -1)
	    class168.method3646(0, 0);
	if (1 == i_166_ || i_166_ == 2 && (-942978965 * stackable == 1
					   || i != 1) && -1 != i)
	    class96.method2128(Class354.method6435(i,
						   (((ItemDefinitionLoader)
						     (((ItemDefinition) this)
						      .loader))
						    .currentLocale),
						   class513, -221696379),
			       0, 9, -256, -16777215, 1841717961);
	is = class103.method2251(0, 0, 36, 32);
	for (int i_176_ = 0; i_176_ < is.length; i_176_++) {
	    if ((is[i_176_] & 0xffffff) == 0)
		is[i_176_] = 0;
	    else
		is[i_176_] |= ~0xffffff;
	}
	return is;
    }
    
    int[] method13401(Class103 class103, Class103 class103_177_, int i,
		      int i_178_, int i_179_, boolean bool, int i_180_,
		      Class96 class96, Class490 class490, GraphicsDefaults class513) {
	Class161 class161
	    = Class161.method3448((((ItemDefinitionLoader)
				    loader)
				   .meshes),
				  interfaceModelID * -1813993629,
				  0);
	if (null == class161)
	    return null;
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (null != originalModelColors) {
	    for (int i_181_ = 0;
		 i_181_ < originalModelColors.length; i_181_++) {
		if (recol_d_palette != null
		    && i_181_ < recol_d_palette.length)
		    class161.method3457((originalModelColors
					 [i_181_]),
					clientpalette[(((ItemDefinition) this)
							 .recol_d_palette
							 [i_181_]) & 0xff]);
		else
		    class161.method3457((originalModelColors
					 [i_181_]),
					(modifiedModelColors
					 [i_181_]));
	    }
	}
	if (null != originalTextureColors) {
	    for (int i_182_ = 0;
		 i_182_ < originalTextureColors.length; i_182_++)
		class161.method3458(originalTextureColors[i_182_],
				    modifiedTextureColors[i_182_]);
	}
	if (class490 != null) {
	    for (int i_183_ = 0; i_183_ < 10; i_183_++) {
		for (int i_184_ = 0;
		     i_184_ < Class558.aShortArrayArray7261[i_183_].length;
		     i_184_++) {
		    if (class490.anIntArray6501[i_183_]
			< (Class561.aShortArrayArrayArray7298[i_183_]
			   [i_184_]).length)
			class161.method3457((Class558.aShortArrayArray7261
					     [i_183_][i_184_]),
					    (Class561.aShortArrayArrayArray7298
					     [i_183_][i_184_]
					     [(class490.anIntArray6501
					       [i_183_])]));
		}
	    }
	}
	int i_185_ = 2048;
	boolean bool_186_ = false;
	if (resizex * 754173675 != 128
	    || resizey * 772935007 != 128
	    || resizez * 173829459 != 128) {
	    bool_186_ = true;
	    i_185_ |= 0x7;
	}
	Class89 class89
	    = class103.method2356(class161, i_185_, 64,
				  (64
				   + ambient * 1018366715),
				  (contrast * 1864646775
				   + 768));
	if (!class89.method1912())
	    return null;
	if (bool_186_)
	    class89.method1863(754173675 * resizex,
			       resizey * 772935007,
			       173829459 * resizez);
	Class168 class168 = null;
	if (-1 != noteTemplateID * -1365591143) {
	    class168
		= (loader.method13283
		   (class103, class103_177_, -2142812803 * noteID, 10, 1, 0,
		    true, true, 0, class96, class490, class513, 859838808));
	    if (class168 == null)
		return null;
	} else if (-1 != lendTemplateID * 1106873195) {
	    class168 = (loader.method13283
			(class103, class103_177_,
			 1873329203 * lendID, i, i_178_,
			 i_179_, false, true, 0, class96, class490, class513,
			 -957923148));
	    if (class168 == null)
		return null;
	} else if (boughttemplate * 911570241 != -1) {
	    class168
		= (loader.method13283
		   (class103, class103_177_,
		    boughtlink * 115132331, i, i_178_, i_179_,
		    false, true, 0, class96, class490, class513, -544441643));
	    if (null == class168)
		return null;
	} else if (anInt7923 * 579904981 != -1) {
	    class168
		= (loader.method13283
		   (class103, class103_177_, anInt7904 * -1060868593, 10, 1, 0,
		    true, true, 0, class96, class490, class513, 1587573610));
	    if (class168 == null)
		return null;
	}
	int i_187_;
	if (bool)
	    i_187_ = (int) ((double) (-1923471293 * zoom2d) * 1.5) << 2;
	else if (2 == i_178_)
	    i_187_ = (int) ((double) (-1923471293 * zoom2d) * 1.04) << 2;
	else
	    i_187_ = -1923471293 * zoom2d << 2;
	Class268 class268 = class103.method2310();
	Class268 class268_188_ = class103.method2226();
	class268_188_.method5268(16.0F, 16.0F, 512.0F, 512.0F, 50.0F,
				 2.14748365E9F,
				 (float) class103.method2237((byte) 4)
					     .method2655(),
				 (float) class103.method2237((byte) 4)
					     .method2654());
	class103.method2309(class268_188_);
	class103.method2254(0, 0, class103.method2237((byte) 4).method2655(),
			    class103.method2237((byte) 4).method2654());
	Class266 class266 = new Class266();
	class103.method2512(class266);
	class103.method2311(0.95F + (float) (Math.random() / 10.0));
	class103.method2227(16777215, 0.95F + (float) (Math.random() / 10.0),
			    0.95F + (float) (Math.random() / 10.0), -50.0F,
			    -10.0F, -50.0F);
	Class266 class266_189_ = class103.method2595();
	class266_189_.method5125(0.0F, 0.0F, 1.0F,
				 Class282.method5490(-(zan2d * 50884575)
						     << 3));
	class266_189_.method5128(0.0F, 1.0F, 0.0F,
				 Class282.method5490(yan2d * -1675080811
						     << 3));
	class266_189_.method5133((float) (774761921 * xof2d << 2),
				 (float) (((i_187_
					    * (Class282.anIntArray4430
					       [1905798151 * xan2d << 3]))
					   >> 14)
					  - class89.method1902() / 2
					  + (1096836429 * yof2d << 2)),
				 (float) ((((Class282.anIntArray4441
					     [xan2d * 1905798151 << 3])
					    * i_187_)
					   >> 14)
					  + (1096836429 * yof2d << 2)));
	class266_189_.method5128(1.0F, 0.0F, 0.0F,
				 Class282
				     .method5490(xan2d * 1905798151 << 3));
	class103.method2445(0, 0, 36, 32);
	class103.method2450(2, 0);
	class103.method2396(0, 0, 36, 32, 0, 0);
	class103.method2314(0, -1, 0);
	class89.method1890(class266_189_, null, 1);
	class103.method2309(class268);
	int[] is = class103.method2251(0, 0, 36, 32);
	if (i_178_ >= 1) {
	    is = method13363(is, -16777214, (byte) 16);
	    if (i_178_ >= 2)
		is = method13363(is, -1, (byte) 16);
	}
	if (0 != i_179_)
	    method13373(is, i_179_, 1186810875);
	if (-1 != lendTemplateID * 1106873195)
	    class168.method3646(0, 0);
	else if (911570241 * boughttemplate != -1)
	    class168.method3646(0, 0);
	class103.method2259(is, 0, 36, 36, 32, (byte) 64).method3646(0, 0);
	if (-1365591143 * noteTemplateID != -1)
	    class168.method3646(0, 0);
	if (anInt7923 * 579904981 != -1)
	    class168.method3646(0, 0);
	if (1 == i_180_ || i_180_ == 2 && (-942978965 * stackable == 1
					   || i != 1) && -1 != i)
	    class96.method2128(Class354.method6435(i,
						   (((ItemDefinitionLoader)
						     (((ItemDefinition) this)
						      .loader))
						    .currentLocale),
						   class513, -221696379),
			       0, 9, -256, -16777215, 1841717961);
	is = class103.method2251(0, 0, 36, 32);
	for (int i_190_ = 0; i_190_ < is.length; i_190_++) {
	    if ((is[i_190_] & 0xffffff) == 0)
		is[i_190_] = 0;
	    else
		is[i_190_] |= ~0xffffff;
	}
	return is;
    }
    
    void method13402(int[] is, int i) {
	for (int i_191_ = 31; i_191_ > 0; i_191_--) {
	    int i_192_ = i_191_ * 36;
	    for (int i_193_ = 35; i_193_ > 0; i_193_--) {
		if (is[i_192_ + i_193_] == 0
		    && is[i_193_ + i_192_ - 1 - 36] != 0)
		    is[i_193_ + i_192_] = i;
	    }
	}
    }
    
    static String method13403(int i, Language class437, GraphicsDefaults class513) {
	if (i < 100000)
	    return new StringBuilder().append
		       (ScriptVarType.method5845(-905822813 * class513.anInt6724,
					    -150520979))
		       .append
		       (i).append
		       (aString7956).toString();
	if (i < 10000000)
	    return new StringBuilder().append
		       (ScriptVarType.method5845(class513.anInt6728 * -859918135,
					    1425261500))
		       .append
		       (i / 1000).append
		       (ClientMessage.THOUSAND_SHORT.getLocalisedMessage(class437,
							    (short) 19250))
		       .append
		       (aString7956).toString();
	return new StringBuilder().append
		   (ScriptVarType.method5845(377039413 * class513.anInt6729,
					-279706889))
		   .append
		   (i / 1000000).append
		   (ClientMessage.MILLION_SHORT.getLocalisedMessage(class437,
							(short) 27535))
		   .append
		   (aString7956).toString();
    }
    
    void applyTemplate/*method13404*/(Class636 class636, ItemDefinition templateItem,
		     ItemDefinition realItem, ClientMessage class635, int i) {
		interfaceModelID = templateItem.interfaceModelID * 1;
		zoom2d = templateItem.zoom2d * 1;
		xan2d = 1 * templateItem.xan2d;
		yan2d = templateItem.yan2d * 1;
		zan2d = templateItem.zan2d * 1;
		xof2d = 1 * templateItem.xof2d;
		yof2d = 1 * templateItem.yof2d;
		ItemDefinition class623_196_ = (Class636.aClass636_8243 == class636
					  ? templateItem : realItem);
		originalModelColors = ((ItemDefinition) class623_196_).originalModelColors;
		modifiedModelColors = ((ItemDefinition) class623_196_).modifiedModelColors;
		recol_d_palette = ((ItemDefinition) class623_196_).recol_d_palette;
		originalTextureColors = ((ItemDefinition) class623_196_).originalTextureColors;
		modifiedTextureColors = ((ItemDefinition) class623_196_).modifiedTextureColors;
		name = realItem.name;
		membersOnly = realItem.membersOnly;
		if (class636 == Class636.aClass636_8243) {
		    value = 1 * realItem.value;
		    stackable = 1511466051;
		} else if (class636 == Class636.aClass636_8246) {
		    name = realItem.aString7902;
		    value = (int) Math.floor((double) (483161521 * realItem.value
						     / (realItem.anInt7939 * 142216489))) * -901467311;
		    stackable = 1511466051;
		    stockmarket = realItem.stockmarket;
		    anInt7887 = templateItem.anInt7887 * 1;
		    anIntArray7909 = templateItem.anIntArray7909;
		    anIntArray7914 = templateItem.anIntArray7914;
		    inventoryOptions = new String[5];
		    inventoryOptions[0] = ClientMessage.aClass635_8232.getLocalisedMessage(
		    		loader.currentLocale,
		    		(short) 28884);
		    inventoryOptions[4] = class635.getLocalisedMessage(
		    		loader.currentLocale,
		    		(short) 17340);
		} else {
		    value = 0;
		    stackable = 1 * realItem.stackable;
		    equipSlotID = realItem.equipSlotID * 1;
		    equipID = realItem.equipID * 1;
		    anInt7913 = realItem.anInt7913 * 1;
		    maleEquip1 = realItem.maleEquip1 * 1;
		    maleEquip2 = 1 * realItem.maleEquip2;
		    colourEquip1 = 1 * realItem.colourEquip1;
		    femaleEquip1 = realItem.femaleEquip1 * 1;
		    femaleEquip2 = 1 * realItem.femaleEquip2;
		    colourEquip2 = 1 * realItem.colourEquip2;
		    manwearxoff = 1 * realItem.manwearxoff;
		    womanwearxoff = realItem.womanwearxoff * 1;
		    manwearyoff = realItem.manwearyoff * 1;
		    womanwearyoff = realItem.womanwearyoff * 1;
		    manwearzoff = 1 * realItem.manwearzoff;
		    womanwearzoff = realItem.womanwearzoff * 1;
		    manhead = 1 * realItem.manhead;
		    manhead2 = realItem.manhead2 * 1;
		    womanhead = realItem.womanhead * 1;
		    womanhead2 = 1 * realItem.womanhead2;
		    anInt7887 = realItem.anInt7887 * 1;
		    teamID = realItem.teamID * 1;
		    groundOptions = realItem.groundOptions;
		    params = realItem.params;
		    inventoryOptions = new String[5];
		    if (null != realItem.inventoryOptions) {
		    	for (int i_197_ = 0; i_197_ < 4; i_197_++)
		    		inventoryOptions[i_197_] = realItem.inventoryOptions[i_197_];
		    }
		    inventoryOptions[4] = class635.getLocalisedMessage(
		    		loader.currentLocale,
		    		(short) 19084);
		}
    }
    
    void method13405(int[] is, int i) {
	for (int i_198_ = 31; i_198_ > 0; i_198_--) {
	    int i_199_ = i_198_ * 36;
	    for (int i_200_ = 35; i_200_ > 0; i_200_--) {
		if (is[i_199_ + i_200_] == 0
		    && is[i_200_ + i_199_ - 1 - 36] != 0)
		    is[i_200_ + i_199_] = i;
	    }
	}
    }
    
    void genBought/*method13406*/(ItemDefinition template, ItemDefinition realItem, int i) {
    	applyTemplate(Class636.aClass636_8245, template, realItem, ClientMessage.BOUGHT_ITEM_DISCARD, -1493961741);
    }
    
    public int method13407(int i) {
	if (anIntArray7914 == null)
	    return -1;
	return anIntArray7914[i];
    }
    
    int[] method13408(int[] is, int i) {
	int[] is_203_ = new int[1152];
	int i_204_ = 0;
	for (int i_205_ = 0; i_205_ < 32; i_205_++) {
	    for (int i_206_ = 0; i_206_ < 36; i_206_++) {
		int i_207_ = is[i_204_];
		if (i_207_ == 0) {
		    if (i_206_ > 0 && is[i_204_ - 1] != 0)
			i_207_ = i;
		    else if (i_205_ > 0 && is[i_204_ - 36] != 0)
			i_207_ = i;
		    else if (i_206_ < 35 && is[1 + i_204_] != 0)
			i_207_ = i;
		    else if (i_205_ < 31 && 0 != is[36 + i_204_])
			i_207_ = i;
		}
		is_203_[i_204_++] = i_207_;
	    }
	}
	return is_203_;
    }
    
    public final boolean method13409(boolean bool, Class604 class604) {
	int i;
	int i_208_;
	int i_209_;
	if (bool) {
	    if (null != class604 && null != class604.anIntArray7746) {
		i = class604.anIntArray7746[0];
		i_208_ = class604.anIntArray7746[1];
		i_209_ = class604.anIntArray7746[2];
	    } else {
		i = femaleEquip1 * 1129242275;
		i_208_ = femaleEquip2 * -541441075;
		i_209_ = colourEquip2 * -471628237;
	    }
	} else if (class604 != null && class604.anIntArray7742 != null) {
	    i = class604.anIntArray7742[0];
	    i_208_ = class604.anIntArray7742[1];
	    i_209_ = class604.anIntArray7742[2];
	} else {
	    i = 1500268767 * maleEquip1;
	    i_208_ = maleEquip2 * -907955105;
	    i_209_ = colourEquip1 * 795824037;
	}
	if (-1 == i)
	    return true;
	boolean bool_210_ = true;
	if (!((ItemDefinitionLoader) loader).meshes
		 .method4188(i, 0, -1211507680))
	    bool_210_ = false;
	if (i_208_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_208_, 0, -1015390780))
	    bool_210_ = false;
	if (i_209_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_209_, 0, -1407054346))
	    bool_210_ = false;
	return bool_210_;
    }
    
    public final boolean method13410(boolean bool, Class604 class604) {
	int i;
	int i_211_;
	int i_212_;
	if (bool) {
	    if (null != class604 && null != class604.anIntArray7746) {
		i = class604.anIntArray7746[0];
		i_211_ = class604.anIntArray7746[1];
		i_212_ = class604.anIntArray7746[2];
	    } else {
		i = femaleEquip1 * 1129242275;
		i_211_ = femaleEquip2 * -541441075;
		i_212_ = colourEquip2 * -471628237;
	    }
	} else if (class604 != null && class604.anIntArray7742 != null) {
	    i = class604.anIntArray7742[0];
	    i_211_ = class604.anIntArray7742[1];
	    i_212_ = class604.anIntArray7742[2];
	} else {
	    i = 1500268767 * maleEquip1;
	    i_211_ = maleEquip2 * -907955105;
	    i_212_ = colourEquip1 * 795824037;
	}
	if (-1 == i)
	    return true;
	boolean bool_213_ = true;
	if (!((ItemDefinitionLoader) loader).meshes
		 .method4188(i, 0, -1478052399))
	    bool_213_ = false;
	if (i_211_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_211_, 0, -1344316463))
	    bool_213_ = false;
	if (i_212_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_212_, 0, -653056738))
	    bool_213_ = false;
	return bool_213_;
    }
    
    public final boolean method13411(boolean bool, Class604 class604) {
	int i;
	int i_214_;
	int i_215_;
	if (bool) {
	    if (null != class604 && null != class604.anIntArray7746) {
		i = class604.anIntArray7746[0];
		i_214_ = class604.anIntArray7746[1];
		i_215_ = class604.anIntArray7746[2];
	    } else {
		i = femaleEquip1 * 1129242275;
		i_214_ = femaleEquip2 * -541441075;
		i_215_ = colourEquip2 * -471628237;
	    }
	} else if (class604 != null && class604.anIntArray7742 != null) {
	    i = class604.anIntArray7742[0];
	    i_214_ = class604.anIntArray7742[1];
	    i_215_ = class604.anIntArray7742[2];
	} else {
	    i = 1500268767 * maleEquip1;
	    i_214_ = maleEquip2 * -907955105;
	    i_215_ = colourEquip1 * 795824037;
	}
	if (-1 == i)
	    return true;
	boolean bool_216_ = true;
	if (!((ItemDefinitionLoader) loader).meshes
		 .method4188(i, 0, -1603497190))
	    bool_216_ = false;
	if (i_214_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_214_, 0, -2041978849))
	    bool_216_ = false;
	if (i_215_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_215_, 0, -2115259171))
	    bool_216_ = false;
	return bool_216_;
    }
    
    public final Class161 method13412(boolean bool, Class604 class604) {
	int i;
	int i_217_;
	if (bool) {
	    if (null != class604 && null != class604.anIntArray7743) {
		i = class604.anIntArray7743[0];
		i_217_ = class604.anIntArray7743[1];
	    } else {
		i = womanhead * 1630099121;
		i_217_ = womanhead2 * -1540815033;
	    }
	} else if (null != class604 && class604.anIntArray7747 != null) {
	    i = class604.anIntArray7747[0];
	    i_217_ = class604.anIntArray7747[1];
	} else {
	    i = -823031799 * manhead;
	    i_217_ = manhead2 * -1341819643;
	}
	if (i == -1)
	    return null;
	Class161 class161 = Class161.method3448((((ItemDefinitionLoader) (((ItemDefinition) this)
							      .loader))
						 .meshes),
						i, 0);
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (-1 != i_217_) {
	    Class161 class161_218_
		= Class161.method3448((((ItemDefinitionLoader)
					loader)
				       .meshes),
				      i_217_, 0);
	    if (class161_218_.anInt1789 < 13)
		class161_218_.method3464(2);
	    Class161[] class161s = { class161, class161_218_ };
	    class161 = new Class161(class161s, 2);
	}
	if (null != originalModelColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7749)
		is = class604.aShortArray7749;
	    else
		is = modifiedModelColors;
	    for (int i_219_ = 0;
		 i_219_ < originalModelColors.length; i_219_++)
		class161.method3457(originalModelColors[i_219_],
				    is[i_219_]);
	}
	if (null != originalTextureColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7750)
			is = class604.aShortArray7750;
	    else
			is = modifiedTextureColors;
	    for (int i_220_ = 0; i_220_ < originalTextureColors.length; i_220_++)
		class161.method3458(originalTextureColors[i_220_],
				    is[i_220_]);
	}
	return class161;
    }
    
    public final boolean method13413(boolean bool, Class604 class604) {
	int i;
	int i_221_;
	if (bool) {
	    if (class604 != null && class604.anIntArray7743 != null) {
		i = class604.anIntArray7743[0];
		i_221_ = class604.anIntArray7743[1];
	    } else {
		i = womanhead * 1630099121;
		i_221_ = womanhead2 * -1540815033;
	    }
	} else if (class604 != null && class604.anIntArray7747 != null) {
	    i = class604.anIntArray7747[0];
	    i_221_ = class604.anIntArray7747[1];
	} else {
	    i = -823031799 * manhead;
	    i_221_ = -1341819643 * manhead2;
	}
	if (-1 == i)
	    return true;
	boolean bool_222_ = true;
	if (!((ItemDefinitionLoader) loader).meshes
		 .method4188(i, 0, -634929157))
	    bool_222_ = false;
	if (i_221_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_221_, 0, -2086776075))
	    bool_222_ = false;
	return bool_222_;
    }
    
    public final boolean method13414(boolean bool, Class604 class604) {
	int i;
	int i_223_;
	if (bool) {
	    if (class604 != null && class604.anIntArray7743 != null) {
		i = class604.anIntArray7743[0];
		i_223_ = class604.anIntArray7743[1];
	    } else {
		i = womanhead * 1630099121;
		i_223_ = womanhead2 * -1540815033;
	    }
	} else if (class604 != null && class604.anIntArray7747 != null) {
	    i = class604.anIntArray7747[0];
	    i_223_ = class604.anIntArray7747[1];
	} else {
	    i = -823031799 * manhead;
	    i_223_ = -1341819643 * manhead2;
	}
	if (-1 == i)
	    return true;
	boolean bool_224_ = true;
	if (!((ItemDefinitionLoader) loader).meshes
		 .method4188(i, 0, -1992111255))
	    bool_224_ = false;
	if (i_223_ != -1
	    && !((ItemDefinitionLoader) loader)
		    .meshes.method4188(i_223_, 0, -1196665195))
	    bool_224_ = false;
	return bool_224_;
    }
    
    void postDecode/*method13415*/(int i) {
    	/* empty */
    }
    
    public final Class161 method13416(boolean bool, Class604 class604) {
	int i;
	int i_225_;
	if (bool) {
	    if (null != class604 && null != class604.anIntArray7743) {
		i = class604.anIntArray7743[0];
		i_225_ = class604.anIntArray7743[1];
	    } else {
		i = womanhead * 1630099121;
		i_225_ = womanhead2 * -1540815033;
	    }
	} else if (null != class604 && class604.anIntArray7747 != null) {
	    i = class604.anIntArray7747[0];
	    i_225_ = class604.anIntArray7747[1];
	} else {
	    i = -823031799 * manhead;
	    i_225_ = manhead2 * -1341819643;
	}
	if (i == -1)
	    return null;
	Class161 class161 = Class161.method3448((((ItemDefinitionLoader) (((ItemDefinition) this)
							      .loader))
						 .meshes),
						i, 0);
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (-1 != i_225_) {
	    Class161 class161_226_
		= Class161.method3448((((ItemDefinitionLoader)
					loader)
				       .meshes),
				      i_225_, 0);
	    if (class161_226_.anInt1789 < 13)
		class161_226_.method3464(2);
	    Class161[] class161s = { class161, class161_226_ };
	    class161 = new Class161(class161s, 2);
	}
	if (null != originalModelColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7749)
		is = class604.aShortArray7749;
	    else
		is = modifiedModelColors;
	    for (int i_227_ = 0;
		 i_227_ < originalModelColors.length; i_227_++)
		class161.method3457(originalModelColors[i_227_],
				    is[i_227_]);
	}
	if (null != originalTextureColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7750)
		is = class604.aShortArray7750;
	    else
		is = modifiedTextureColors;
	    for (int i_228_ = 0;
		 i_228_ < originalTextureColors.length; i_228_++)
		class161.method3458(originalTextureColors[i_228_],
				    is[i_228_]);
	}
	return class161;
    }
    
    public int method13417(int i) {
	if (anIntArray7914 == null)
	    return -1;
	return anIntArray7914[i];
    }
    
    public final Class161 method13418(boolean bool, Class604 class604) {
	int i;
	int i_229_;
	if (bool) {
	    if (null != class604 && null != class604.anIntArray7743) {
		i = class604.anIntArray7743[0];
		i_229_ = class604.anIntArray7743[1];
	    } else {
		i = womanhead * 1630099121;
		i_229_ = womanhead2 * -1540815033;
	    }
	} else if (null != class604 && class604.anIntArray7747 != null) {
	    i = class604.anIntArray7747[0];
	    i_229_ = class604.anIntArray7747[1];
	} else {
	    i = -823031799 * manhead;
	    i_229_ = manhead2 * -1341819643;
	}
	if (i == -1)
	    return null;
	Class161 class161 = Class161.method3448((((ItemDefinitionLoader) (((ItemDefinition) this)
							      .loader))
						 .meshes),
						i, 0);
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (-1 != i_229_) {
	    Class161 class161_230_
		= Class161.method3448((((ItemDefinitionLoader)
					loader)
				       .meshes),
				      i_229_, 0);
	    if (class161_230_.anInt1789 < 13)
		class161_230_.method3464(2);
	    Class161[] class161s = { class161, class161_230_ };
	    class161 = new Class161(class161s, 2);
	}
	if (null != originalModelColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7749)
		is = class604.aShortArray7749;
	    else
		is = modifiedModelColors;
	    for (int i_231_ = 0;
		 i_231_ < originalModelColors.length; i_231_++)
		class161.method3457(originalModelColors[i_231_],
				    is[i_231_]);
	}
	if (null != originalTextureColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7750)
		is = class604.aShortArray7750;
	    else
		is = modifiedTextureColors;
	    for (int i_232_ = 0;
		 i_232_ < originalTextureColors.length; i_232_++)
		class161.method3458(originalTextureColors[i_232_],
				    is[i_232_]);
	}
	return class161;
    }
    
    public final Class161 method13419(boolean bool, Class604 class604) {
	int i;
	int i_233_;
	int i_234_;
	if (bool) {
	    if (null != class604 && class604.anIntArray7746 != null) {
		i = class604.anIntArray7746[0];
		i_233_ = class604.anIntArray7746[1];
		i_234_ = class604.anIntArray7746[2];
	    } else {
		i = femaleEquip1 * 1129242275;
		i_233_ = -541441075 * femaleEquip2;
		i_234_ = -471628237 * colourEquip2;
	    }
	} else if (null != class604 && null != class604.anIntArray7742) {
	    i = class604.anIntArray7742[0];
	    i_233_ = class604.anIntArray7742[1];
	    i_234_ = class604.anIntArray7742[2];
	} else {
	    i = maleEquip1 * 1500268767;
	    i_233_ = maleEquip2 * -907955105;
	    i_234_ = 795824037 * colourEquip1;
	}
	if (-1 == i)
	    return null;
	Class161 class161 = Class161.method3448((((ItemDefinitionLoader) (((ItemDefinition) this)
							      .loader))
						 .meshes),
						i, 0);
	if (null == class161)
	    return null;
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	if (i_233_ != -1) {
	    Class161 class161_235_
		= Class161.method3448((((ItemDefinitionLoader)
					loader)
				       .meshes),
				      i_233_, 0);
	    if (class161_235_.anInt1789 < 13)
		class161_235_.method3464(2);
	    if (-1 != i_234_) {
		Class161 class161_236_
		    = Class161.method3448((((ItemDefinitionLoader)
					    loader)
					   .meshes),
					  i_234_, 0);
		if (class161_236_.anInt1789 < 13)
		    class161_236_.method3464(2);
		Class161[] class161s
		    = { class161, class161_235_, class161_236_ };
		class161 = new Class161(class161s, 3);
	    } else {
		Class161[] class161s = { class161, class161_235_ };
		class161 = new Class161(class161s, 2);
	    }
	}
	if (!bool && (0 != manwearxoff * -1097023053
		      || 0 != manwearyoff * 2070162743
		      || manwearzoff * -110000207 != 0))
	    class161.method3459(manwearxoff * -1097023053,
				2070162743 * manwearyoff,
				manwearzoff * -110000207);
	if (bool && (0 != womanwearxoff * 913293263
		     || womanwearyoff * -1194512769 != 0
		     || 0 != -1405999173 * womanwearzoff))
	    class161.method3459(913293263 * womanwearxoff,
				womanwearyoff * -1194512769,
				womanwearzoff * -1405999173);
	if (null != originalModelColors) {
	    short[] is;
	    if (class604 != null && null != class604.aShortArray7749)
		is = class604.aShortArray7749;
	    else
		is = modifiedModelColors;
	    for (int i_237_ = 0;
		 i_237_ < originalModelColors.length; i_237_++)
		class161.method3457(originalModelColors[i_237_],
				    is[i_237_]);
	}
	if (null != originalTextureColors) {
	    short[] is;
	    if (null != class604 && null != class604.aShortArray7750)
		is = class604.aShortArray7750;
	    else
		is = modifiedTextureColors;
	    for (int i_238_ = 0;
		 i_238_ < originalTextureColors.length; i_238_++)
		class161.method3458(originalTextureColors[i_238_],
				    is[i_238_]);
	}
	return class161;
    }
    
    public int method13420(int i, int i_239_) {
	if (params == null)
	    return i_239_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       params.get((long) i));
	if (null == class241_sub22)
	    return i_239_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public int method13421(int i, int i_240_) {
	if (params == null)
	    return i_240_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       params.get((long) i));
	if (null == class241_sub22)
	    return i_240_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public int method13422(int i, int i_241_) {
	if (params == null)
	    return i_241_;
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       params.get((long) i));
	if (null == class241_sub22)
	    return i_241_;
	return class241_sub22.intValue * -1859754807;
    }
    
    public int method13423(int i, int i_242_) {
		if (params == null) {
			return i_242_;
		}
		IntegerNode intNode = ((IntegerNode) params.get((long) i));
		if (null == intNode) {
			return i_242_;
		}
		return intNode.intValue * -1859754807;
    }
    
    public int method13424(int i) {
	if (null == anIntArray7909)
	    return -1;
	return anIntArray7909[i];
    }
    
    void decode/*method13425*/(RSByteBuffer buffer, int opcode, int i_243_) {
		if (opcode == 1) {
		    interfaceModelID = buffer.readBigSmart((byte) 94) * 2114851403;
		} else if (2 == opcode) {
		    name = buffer.readString(969685729);
		} else if (4 == opcode) {
		    zoom2d = buffer.readUnsignedShort(1162222719) * 203252843;
		} else if (5 == opcode) {
		    xan2d = buffer.readUnsignedShort(1162222719) * 24084919;
	    } else if (opcode == 6) {
		    yan2d = buffer.readUnsignedShort(1162222719) * 1286252477;
	    } else if (opcode == 7) {
		    xof2d = buffer.readUnsignedShort(1162222719) * 1132667457;
		    if (xof2d * 774761921 > 32767) {
		    	xof2d -= 574685184;
			}
		} else if (8 == opcode) {
		    yof2d = buffer.readUnsignedShort(1162222719) * 537746309;
		    if (yof2d * 1096836429 > 32767) {
		    	yof2d -= 1535442944;
			}
		} else if (opcode == 11) {
		    stackable = 1511466051;
		} else if (opcode == 12) {
		    value = buffer.readInt((byte) 61) * -901467311;
		} else if (13 == opcode) {
		    equipSlotID = buffer.readUnsignedByte((byte) 24) * -1713402773;
		} else if (opcode == 14) {
		    equipID = buffer.readUnsignedByte((byte) -20) * -643584373;
		} else if (opcode == 16) {
		    membersOnly = true;
		} else if (18 == opcode) {
		    multistacksize = buffer.readUnsignedShort(1162222719) * 1217967463;
		} else if (23 == opcode) {
		    maleEquip1 = buffer.readBigSmart((byte) 11) * -491162849;
		} else if (opcode == 24) {
		    maleEquip2 = buffer.readBigSmart((byte) 2) * 691644319;
		} else if (opcode == 25) {
		    femaleEquip1 = buffer.readBigSmart((byte) 58) * -1104952053;
		} else if (26 == opcode) {
		    femaleEquip2 = buffer.readBigSmart((byte) -36) * 1885102341;
		} else if (27 == opcode) {//Unknown
		    anInt7913 = buffer.readUnsignedByte((byte) -11) * 1286408247;
		} else if (opcode >= 30 && opcode < 35) {
		    groundOptions[opcode - 30] = buffer.readString(2052521011);
		} else if (opcode >= 35 && opcode < 40) {
		    inventoryOptions[opcode - 35] = buffer.readString(1663521539);
		} else if (opcode == 40) {
		    int length = buffer.readUnsignedByte((byte) 74);
		    originalModelColors = new short[length];
		    modifiedModelColors = new short[length];
		    for (int index = 0; index < length; index++) {
		    	originalModelColors[index] = (short) buffer.readUnsignedShort(1162222719);
		    	modifiedModelColors[index] = (short) buffer.readUnsignedShort(1162222719);
		    }
		} else if (opcode == 41) {
		    int length = buffer.readUnsignedByte((byte) 34);
		    originalTextureColors = new short[length];
		    modifiedTextureColors = new short[length];
		    for (int index = 0; index < length; index++) {
				originalTextureColors[index] = (short) buffer.readUnsignedShort(1162222719);
				modifiedTextureColors[index] = (short) buffer.readUnsignedShort(1162222719);
		    }
		} else if (opcode == 42) {
		    int length = buffer.readUnsignedByte((byte) 43);
		    recol_d_palette = new byte[length];
		    for (int index = 0; index < length; index++) {
		    	recol_d_palette[index] = buffer.getByte(-462069777);
		    }
		} else if (opcode == 43) {//Unknown
		    anInt7910 = buffer.readInt((byte) 117) * -1693738987;
		    aBool7953 = true;
		} else if (44 == opcode) {//Unknown
		    int i_250_ = buffer.readUnsignedShort(1162222719);
		    int i_251_ = 0;
		    for (int i_252_ = i_250_; i_252_ > 0; i_252_ >>= 1) {
		    	i_251_++;
		    }
		    aByteArray7895 = new byte[i_251_];
		    byte i_253_ = 0;
		    for (int i_254_ = 0; i_254_ < i_251_; i_254_++) {
				if ((i_250_ & 1 << i_254_) > 0) {
				    aByteArray7895[i_254_] = i_253_;
				    i_253_++;
				} else {
				    aByteArray7895[i_254_] = (byte) -1;
				}
		    }
		} else if (opcode == 45) {//Unknown
		    int i_255_ = buffer.readUnsignedShort(1162222719);
		    int i_256_ = 0;
		    for (int i_257_ = i_255_; i_257_ > 0; i_257_ >>= 1)
			i_256_++;
		    aByteArray7883 = new byte[i_256_];
		    byte i_258_ = 0;
		    for (int i_259_ = 0; i_259_ < i_256_; i_259_++) {
			if ((i_255_ & 1 << i_259_) > 0) {
			    aByteArray7883[i_259_] = i_258_;
			    i_258_++;
			} else
			    aByteArray7883[i_259_] = (byte) -1;
		    }
		} else if (65 == opcode) {
		    stockmarket = true;
		} else if (78 == opcode) {
		    colourEquip1 = buffer.readBigSmart((byte) -79) * -930938835;
		} else if (79 == opcode) {
		    colourEquip2 = buffer.readBigSmart((byte) 92) * -1610423045;
		} else if (opcode == 90) {
		    manhead = buffer.readBigSmart((byte) 17) * 1608812089;
		} else if (91 == opcode) {
		    womanhead = buffer.readBigSmart((byte) -54) * 1208824401;
		} else if (opcode == 92) {
		    manhead2 = buffer.readBigSmart((byte) 19) * 1569591245;
		} else if (opcode == 93) {
		    womanhead2 = buffer.readBigSmart((byte) 3) * 1859154551;
		} else if (opcode == 94) {//Unknown
		    anInt7887 = buffer.readUnsignedShort(1162222719) * -182938293;
		} else if (95 == opcode) {
		    zan2d = buffer.readUnsignedShort(1162222719) * 717491231;
		} else if (opcode == 96) {
		    dummyitem = buffer.readUnsignedByte((byte) 2) * -932298511;
		} else if (97 == opcode) {
		    noteID = buffer.readUnsignedShort(1162222719) * 336272341;
		} else if (98 == opcode) {
		    noteTemplateID = buffer.readUnsignedShort(1162222719) * 1128556713;
		} else if (opcode >= 100 && opcode < 110) {
		    if (stackIds == null) {
				stackIds = new int[10];
				stackAmounts = new int[10];
		    }
		    stackIds[opcode - 100] = buffer.readUnsignedShort(1162222719);
		    stackAmounts[opcode - 100] = buffer.readUnsignedShort(1162222719);
		} else if (110 == opcode) {
		    resizex = buffer.readUnsignedShort(1162222719) * -1919569469;
		} else if (111 == opcode) {
		    resizey = buffer.readUnsignedShort(1162222719) * -301887841;
		} else if (112 == opcode) {
		    resizez = buffer.readUnsignedShort(1162222719) * -1630642469;
		} else if (opcode == 113) {
		    ambient = buffer.getByte(-626904957) * 1944416307;
		} else if (opcode == 114) {
		    contrast = buffer.getByte(1411840173) * -1721500061;
		} else if (115 == opcode) {
		    teamID = buffer.readUnsignedByte((byte) -54) * -1160709115;
		} else if (121 == opcode) {
		    lendID = buffer.readUnsignedShort(1162222719) * -1325883653;
		} else if (122 == opcode) {
		    lendTemplateID = buffer.readUnsignedShort(1162222719) * -1685239485;
		} else if (125 == opcode) {
		    manwearxoff = (buffer.getByte(-1485968973) << 2) * 2011682171;
		    manwearyoff = (buffer.getByte(-1001059078) << 2) * 621353095;
		    manwearzoff = (buffer.getByte(1311127906) << 2) * 231366993;
		} else if (opcode == 126) {
		    womanwearxoff = (buffer.getByte(-1379268365) << 2) * -803674321;
		    womanwearyoff = (buffer.getByte(-1017724474) << 2) * 891326847;
		    womanwearzoff = (buffer.getByte(-1058595301) << 2) * -449018509;
		} else if (127 == opcode || opcode == 128 || 129 == opcode || 130 == opcode) {//Unknown
		    buffer.readUnsignedByte((byte) 47);
		    buffer.readUnsignedShort(1162222719);
		} else if (opcode == 132) {//(Cursor IDs?)
		    int length = buffer.readUnsignedByte((byte) -39);
		    anIntArray7949 = new int[length];
		    for (int index = 0; index < length; index++) {
		    	anIntArray7949[index] = buffer.readUnsignedShort(1162222719);
		    }
		} else if (opcode == 134) {//Unknown
		    picksizeshift = buffer.readUnsignedByte((byte) 96) * 2088143385;
		} else if (139 == opcode) {
		    boughtlink = buffer.readUnsignedShort(1162222719) * 569375491;
		} else if (opcode == 140) {
		    boughttemplate = buffer.readUnsignedShort(1162222719) * 1596594881;
		} else if (opcode >= 142 && opcode < 147) {
		    if (null == anIntArray7909) {
				anIntArray7909 = new int[6];
				Arrays.fill(anIntArray7909, -1);
		    }
		    anIntArray7909[opcode - 142] = buffer.readUnsignedShort(1162222719);
		} else if (opcode >= 150 && opcode < 155) {
		    if (null == anIntArray7914) {
				anIntArray7914 = new int[5];
				Arrays.fill(anIntArray7914, -1);
		    }
		    anIntArray7914[opcode - 150] = buffer.readUnsignedShort(1162222719);
		} else if (opcode != 156) {
		    if (157 == opcode) {
		    	aBool7955 = true;
		    } else if (161 == opcode) {
		    	anInt7904 = buffer.readUnsignedShort(1162222719) * 2060370159;
		    } else if (162 == opcode) {
		    	anInt7923 = buffer.readUnsignedShort(1162222719) * 1314089853;
		    } else if (163 == opcode) {
		    	anInt7939 = buffer.readUnsignedShort(1162222719) * -76620007;
		    } else if (164 == opcode) {
		    	aString7902 = buffer.readString(1874540049);
		    } else if (opcode == 165) {
		    	stackable = -1272035194;
		    } else if (249 == opcode) {
				int length = buffer.readUnsignedByte((byte) 56);
				if (params == null) {
				    int i_263_ = Class480.method11001(length, (byte) -102);
				    params = new HashTable(i_263_);
				}
				for (int index = 0; index < length; index++) {
				    boolean stringInstance = buffer.readUnsignedByte((byte) -56) == 1;
				    int key = buffer.readTriByte(1771646547);
				    Node value;
				    if (stringInstance) {
				    	value = new ObjectNode(buffer.readString(142012055));
				    } else {
				    	value = new IntegerNode(buffer.readInt((byte) 85));
				    }
				    params.put(value, (long) key);
				}
		    }
		}
    }
    
    void method13426(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) 59);
	    if (i == 0)
		break;
	    decode(class241_sub3, i, -1645169124);
	}
    }
    
    static final void setVarcompFont/*method13427*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		VarTypeList.setComponentFont(component, iFace, scriptData, -324732186);
    }
    
    static Class241_Sub9 method13428(byte i) {
	RS3File class408 = null;
	Class241_Sub9 class241_sub9
	    = new Class241_Sub9(client.currentGame, 0);
	try {
	    class408
		= Class477.openPrefs("", client.currentGame.name,
				       false, (byte) -34);
	    byte[] is = new byte[(int) class408.method7326(-542107572)];
	    int i_266_;
	    for (int i_267_ = 0; i_267_ < is.length; i_267_ += i_266_) {
		i_266_ = class408.method7327(is, i_267_, is.length - i_267_,
					     (byte) 48);
		if (-1 == i_266_)
		    throw new IOException();
	    }
	    class241_sub9 = new Class241_Sub9(new RSByteBuffer(is),
					      client.currentGame, 0);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class408 != null)
		class408.close((byte) 100);
	} catch (Exception exception) {
	    /* empty */
	}
	return class241_sub9;
    }
    
    static final void method13429(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub1_8874
		  .method14054(1556380519) == 1 ? 1 : 0;
    }
    
    static final void method13430(ClientScriptData class454, int i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub27_8867,
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      == 1) ? 2 : 0,
	     (byte) 2);
	client.aClass238_8477.method4768((byte) 5);
	Class167.method3600((short) -13757);
	client.aBool8297 = false;
    }
}
