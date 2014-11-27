/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.List;

//package com.jagex.game.runetek6.config.vartype.constants;
public class BaseVarType implements Interface47 {
    public static BaseVarType LONG;//aClass217_2534
    public static BaseVarType STRING;//aClass217_2535
    public Class<?> javaClass;//aClass2536
    public static BaseVarType INTEGER;//aClass217_2537
    public int anInt2538;
    int id;//anInt2539
    static BaseVarType VECTOR3;//aClass217_2540
    public static int anInt2541;
    
    public static BaseVarType[] method4351(int i) {
    	return new BaseVarType[] { INTEGER, LONG, STRING, VECTOR3 };
    }
    
    BaseVarType(int i, int i_0_, Class<?> var_class) {
		anInt2538 = 1487162703 * i;
		id = i_0_ * 2060971503;
		javaClass = var_class;
    }
    
    public int getId(byte i) {
    	return 1214701839 * id;
    }
    
    static {
    	INTEGER = new BaseVarType(2, 0, java.lang.Integer.class);
		LONG = new BaseVarType(1, 1, java.lang.Long.class);
		STRING = new BaseVarType(0, 2, java.lang.String.class);
		VECTOR3 = new BaseVarType(3, 3, Class241_Sub16.class);
    }
    
    public int method147() {
	return 1214701839 * id;
    }
    
    public int method9() {
	return 1214701839 * id;
    }
    
    public int method11() {
	return 1214701839 * id;
    }
    
    public static BaseVarType[] method4352() {
	return new BaseVarType[] { INTEGER, LONG, STRING,
				VECTOR3 };
    }
    
    public int method10() {
	return 1214701839 * id;
    }
    
    public static BaseVarType[] method4353() {
	return new BaseVarType[] { INTEGER, LONG, STRING,
				VECTOR3 };
    }
    
    static void method4354(Class103 class103, int i, int i_1_, int i_2_) {
	if (i >= 0 && i_1_ >= 0 && null != Class16.aClass268_165) {
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    Class268 class268 = class103.method2226();
	    Class203.method4087(class103, (byte) -79);
	    class268.method5203(Class16.aClass266_167);
	    class268.method5202(Class16.aClass268_165);
	    class268.method5205();
	    int i_3_ = i - Class16.anInt135 * 470717791;
	    int i_4_ = i_1_ - 1133839679 * Class16.anInt177;
	    if (client.aClass238_8477.method4751(-1140753591) != null) {
		if (!client.aBool8544
		    || (-1622803377 * Class613.anInt7804 & 0x40) != 0) {
		    int i_5_ = -1;
		    int i_6_ = -1;
		    float f = (2.0F * (float) i_3_ / (float) (Class16.anInt163
							      * -1801164387)
			       - 1.0F);
		    float f_7_
			= (2.0F * (float) i_4_ / (float) (1914791371
							  * Class16.anInt181)
			   - 1.0F);
		    class268.method5208(f, f_7_, -1.0F,
					Class16.aFloatArray137);
		    float f_8_ = (Class16.aFloatArray137[0]
				  / Class16.aFloatArray137[3]);
		    float f_9_ = (Class16.aFloatArray137[1]
				  / Class16.aFloatArray137[3]);
		    float f_10_ = (Class16.aFloatArray137[2]
				   / Class16.aFloatArray137[3]);
		    class268.method5208(f, f_7_, 1.0F, Class16.aFloatArray137);
		    float f_11_ = (Class16.aFloatArray137[0]
				   / Class16.aFloatArray137[3]);
		    float f_12_ = (Class16.aFloatArray137[1]
				   / Class16.aFloatArray137[3]);
		    float f_13_ = (Class16.aFloatArray137[2]
				   / Class16.aFloatArray137[3]);
		    float f_14_
			= Class260.method5090(f_8_, f_9_, f_10_, f_11_, f_12_,
					      f_13_, 4, (byte) -47);
		    if (f_14_ > 0.0F) {
			float f_15_ = f_11_ - f_8_;
			float f_16_ = f_13_ - f_10_;
			int i_17_ = (int) (f_14_ * f_15_ + f_8_);
			int i_18_ = (int) (f_10_ + f_16_ * f_14_);
			i_5_ = i_17_ + (Class21
					    .myPlayer
					    .method17782(-939023696) - 1
					<< 8) >> 9;
			i_6_ = i_18_ + (Class21
					    .myPlayer
					    .method17782(598502178) - 1
					<< 8) >> 9;
			int i_19_ = (Class21.myPlayer
				     .nodePlane);
			if (i_19_ < 3
			    && ((client.aClass238_8477.method4753((byte) -111)
				 .heightmapData[1][i_17_ >> 9]
				 [i_18_ >> 9])
				& 0x2) != 0)
			    i_19_++;
		    }
		    if (i_5_ != -1 && -1 != i_6_) {
			if (client.aBool8544
			    && 0 != (Class613.anInt7804 * -1622803377
				     & 0x40)) {
			    InterfaceComponent class58
				= (Class218_Sub3.method16576
				   (-1349195347 * RSGraphics.prevComponentHash,
				    1196348233 * client.prevComponentSlot1,
				    (byte) -77));
			    if (class58 != null)
				Class534.method11882
				    (client.aString8464,
				     new StringBuilder().append(" ").append
					 (Class6.aString33).append
					 (" ").toString(),
				     Class213.anInt2512 * 1184895817, 59, -1,
				     0L, i_5_, i_6_, true, false,
				     (long) (i_5_ << 32 | i_6_), true,
				     -1236921043);
			    else
				Class520.method11688(-1784176075);
			} else {
			    if (Class120_Sub18.aBool10606)
				Class534.method11882((ClientMessage
							  .FACEHERE
							  .getLocalisedMessage
						      (VarPlayerDomain.currentLocale,
						       (short) 19123)),
						     "", -1, 60, -1, 0L, i_5_,
						     i_6_, true, false,
						     (long) (i_5_ << 32
							     | i_6_),
						     true, -1236921043);
			    Class534.method11882(Class353.aString5444, "",
						 -485396401 * client.anInt8451,
						 23, -1, 0L, i_5_, i_6_, true,
						 false,
						 (long) (i_5_ << 32 | i_6_),
						 true, -1236921043);
			}
		    }
		}
		Class576 class576 = (client.aClass238_8477.method4751
				     (-1241206102).aClass576_7180);
		int i_20_ = i;
		int i_21_ = i_1_;
		List<?> list = class576.aList7447;
		Iterator<?> iterator = list.iterator();
		while (iterator.hasNext()) {
		    Class542 class542 = (Class542) iterator.next();
		    if ((client.aBool8347
			 || (class542.aClass475_Sub1_7011.nodePlane
			     == (Class21.myPlayer
				 .nodePlane)))
			&& class542.method11946(class103, i_20_, i_21_,
						(byte) -89)) {
			boolean bool = false;
			boolean bool_22_ = false;
			int i_23_;
			int i_24_;
			if (class542.aClass475_Sub1_7011
			    instanceof Class475_Sub1_Sub1) {
			    i_23_ = ((Class475_Sub1_Sub1)
				     class542.aClass475_Sub1_7011).aShort10717;
			    i_24_ = ((Class475_Sub1_Sub1)
				     class542.aClass475_Sub1_7011).aShort10718;
			} else {
			    Class287 class287
				= (class542.aClass475_Sub1_7011.method10874()
				   .aClass287_4386);
			    i_23_ = (int) class287.aFloat4477 >> 9;
			    i_24_ = (int) class287.aFloat4479 >> 9;
			}
			if (class542.aClass475_Sub1_7011
			    instanceof Player) {
			    Player class475_sub1_sub1_sub3_sub1
				= ((Player)
				   class542.aClass475_Sub1_7011);
			    int i_25_ = class475_sub1_sub1_sub3_sub1
					    .method17782(-66700447);
			    Class287 class287
				= (class475_sub1_sub1_sub3_sub1.method10874()
				   .aClass287_4386);
			    if (((i_25_ & 0x1) == 0
				 && ((int) class287.aFloat4477 & 0x1ff) == 0
				 && ((int) class287.aFloat4479 & 0x1ff) == 0)
				|| (1 == (i_25_ & 0x1)
				    && 256 == ((int) class287.aFloat4477
					       & 0x1ff)
				    && 256 == ((int) class287.aFloat4479
					       & 0x1ff))) {
				int i_26_ = ((int) class287.aFloat4477
					     - (class475_sub1_sub1_sub3_sub1
						    .method17782(348420806) - 1
						<< 8));
				int i_27_ = ((int) class287.aFloat4479
					     - (class475_sub1_sub1_sub3_sub1
						    .method17782(582567768) - 1
						<< 8));
				for (int i_28_ = 0;
				     i_28_ < client.localNpcCount * -1837469873;
				     i_28_++) {
				    ObjectNode class241_sub26
					= ((ObjectNode)
					   (client.aClass407_8457.get
					    ((long) client.localNpcIndicies
						    [i_28_])));
				    if (class241_sub26 != null) {
					NPC class475_sub1_sub1_sub3_sub2
					    = ((NPC)
					       class241_sub26.objectValue);
					if ((client.anInt8296
					     != (class475_sub1_sub1_sub3_sub2
						 .anInt11381) * 477572011)
					    && (class475_sub1_sub1_sub3_sub2
						.aBool11379)) {
					    Class287 class287_29_
						= (class475_sub1_sub1_sub3_sub2
						       .method10874
						   ().aClass287_4386);
					    int i_30_
						= ((int) (class287_29_
							  .aFloat4477)
						   - ((19489015
						       * (class475_sub1_sub1_sub3_sub2
							  .definition
							  .size)) - 1
						      << 8));
					    int i_31_
						= ((int) (class287_29_
							  .aFloat4479)
						   - (((class475_sub1_sub1_sub3_sub2
							.definition
							.size) * 19489015
						       - 1)
						      << 8));
					    if (i_30_ >= i_26_
						&& ((class475_sub1_sub1_sub3_sub2
						     .definition
						     .size) * 19489015
						    <= ((class475_sub1_sub1_sub3_sub1
							     .method17782
							 (184433576))
							- (i_30_ - i_26_
							   >> 9)))
						&& i_31_ >= i_27_
						&& ((class475_sub1_sub1_sub3_sub2
						     .definition
						     .size) * 19489015
						    <= ((class475_sub1_sub1_sub3_sub1
							     .method17782
							 (320107349))
							- (i_31_ - i_27_
							   >> 9)))) {
						Class465.method10716
						    (class475_sub1_sub1_sub3_sub2,
						     ((class542
						       .aClass475_Sub1_7011
						       .nodePlane)
						      != (Class21
							  .myPlayer
							  .nodePlane)),
						     (byte) -40);
						class475_sub1_sub1_sub3_sub2
						    .anInt11381
						    = (300578563
						       * client.anInt8296);
					    }
					}
				    }
				}
				int i_32_ = 794073197 * GPI.viewportPlayerCount;
				int[] is = GPI.viewportPlayerIndicies;
				for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
				    Player class475_sub1_sub1_sub3_sub1_34_
					= (client
					   .localPlayers
					   [is[i_33_]]);
				    if ((null
					 != class475_sub1_sub1_sub3_sub1_34_)
					&& (477572011
					    * (class475_sub1_sub1_sub3_sub1_34_
					       .anInt11381)) != client.anInt8296
					&& (class475_sub1_sub1_sub3_sub1
					    != class475_sub1_sub1_sub3_sub1_34_)
					&& (class475_sub1_sub1_sub3_sub1_34_
					    .aBool11379)) {
					Class287 class287_35_
					    = (class475_sub1_sub1_sub3_sub1_34_
						   .method10874
					       ().aClass287_4386);
					int i_36_
					    = ((int) class287_35_.aFloat4477
					       - ((class475_sub1_sub1_sub3_sub1_34_
						       .method17782(1451687877)
						   - 1)
						  << 8));
					int i_37_
					    = ((int) class287_35_.aFloat4479
					       - ((class475_sub1_sub1_sub3_sub1_34_
						       .method17782(1825721962)
						   - 1)
						  << 8));
					if (i_36_ >= i_26_
					    && (class475_sub1_sub1_sub3_sub1_34_
						    .method17782(1382172953)
						<= (class475_sub1_sub1_sub3_sub1
							.method17782(506567183)
						    - (i_36_ - i_26_ >> 9)))
					    && i_37_ >= i_27_
					    && (class475_sub1_sub1_sub3_sub1_34_
						    .method17782(691172302)
						<= (class475_sub1_sub1_sub3_sub1
							.method17782(-381747514)
						    - (i_37_ - i_27_ >> 9)))) {
					    Class42.method1066
						(class475_sub1_sub1_sub3_sub1_34_,
						 ((class542.aClass475_Sub1_7011
						   .nodePlane)
						  != (Class21
						      .myPlayer
						      .nodePlane)),
						 1456583108);
					    class475_sub1_sub1_sub3_sub1_34_
						.anInt11381
						= client.anInt8296 * 300578563;
					}
				    }
				}
			    }
			    if (client.anInt8296
				== (class475_sub1_sub1_sub3_sub1.anInt11381
				    * 477572011))
				continue;
			    Class42.method1066
				(class475_sub1_sub1_sub3_sub1,
				 ((Class21.myPlayer
				   .nodePlane)
				  != class542.aClass475_Sub1_7011.nodePlane),
				 -1512067640);
			    class475_sub1_sub1_sub3_sub1.anInt11381
				= 300578563 * client.anInt8296;
			}
			if (class542.aClass475_Sub1_7011
			    instanceof NPC) {
			    NPC class475_sub1_sub1_sub3_sub2
				= ((NPC)
				   class542.aClass475_Sub1_7011);
			    if (null != (class475_sub1_sub1_sub3_sub2
					 .definition)) {
				Class287 class287
				    = (class475_sub1_sub1_sub3_sub2.method10874
				       ().aClass287_4386);
				if (((19489015 * (class475_sub1_sub1_sub3_sub2
						  .definition.size)
				      & 0x1) == 0
				     && (((int) class287.aFloat4477 & 0x1ff)
					 == 0)
				     && 0 == ((int) class287.aFloat4479
					      & 0x1ff))
				    || (((19489015
					  * (class475_sub1_sub1_sub3_sub2
					     .definition.size))
					 & 0x1) == 1
					&& (((int) class287.aFloat4477 & 0x1ff)
					    == 256)
					&& 256 == ((int) class287.aFloat4479
						   & 0x1ff))) {
				    int i_38_
					= ((int) class287.aFloat4477
					   - (((19489015
						* (class475_sub1_sub1_sub3_sub2
						   .definition.size))
					       - 1)
					      << 8));
				    int i_39_
					= ((int) class287.aFloat4479
					   - (((class475_sub1_sub1_sub3_sub2
						.definition.size)
					       * 19489015) - 1
					      << 8));
				    for (int i_40_ = 0;
					 (i_40_
					  < -1837469873 * client.localNpcCount);
					 i_40_++) {
					ObjectNode class241_sub26
					    = ((ObjectNode)
					       (client.aClass407_8457
						    .get
						((long) client.localNpcIndicies
							[i_40_])));
					if (class241_sub26 != null) {
					    NPC class475_sub1_sub1_sub3_sub2_41_
						= ((NPC)
						   (class241_sub26
						    .objectValue));
					    if ((client.anInt8296
						 != (class475_sub1_sub1_sub3_sub2_41_
						     .anInt11381) * 477572011)
						&& (class475_sub1_sub1_sub3_sub2_41_
						    != class475_sub1_sub1_sub3_sub2)
						&& (class475_sub1_sub1_sub3_sub2_41_
						    .aBool11379)) {
						Class287 class287_42_
						    = (class475_sub1_sub1_sub3_sub2_41_
							   .method10874
						       ().aClass287_4386);
						int i_43_
						    = ((int) (class287_42_
							      .aFloat4477)
						       - (((class475_sub1_sub1_sub3_sub2_41_
							    .definition
							    .size)
							   * 19489015) - 1
							  << 8));
						int i_44_
						    = ((int) (class287_42_
							      .aFloat4479)
						       - (((class475_sub1_sub1_sub3_sub2_41_
							    .definition
							    .size)
							   * 19489015) - 1
							  << 8));
						if (i_43_ >= i_38_
						    && ((class475_sub1_sub1_sub3_sub2_41_
							 .definition
							 .size) * 19489015
							<= (((class475_sub1_sub1_sub3_sub2
							      .definition
							      .size)
							     * 19489015)
							    - (i_43_ - i_38_
							       >> 9)))
						    && i_44_ >= i_39_
						    && ((class475_sub1_sub1_sub3_sub2_41_
							 .definition
							 .size) * 19489015
							<= ((19489015
							     * (class475_sub1_sub1_sub3_sub2
								.definition
								.size))
							    - (i_44_ - i_39_
							       >> 9)))) {
						    Class465.method10716
							(class475_sub1_sub1_sub3_sub2_41_,
							 ((Class21
							   .myPlayer
							   .nodePlane)
							  != (class542
							      .aClass475_Sub1_7011
							      .nodePlane)),
							 (byte) -44);
						    class475_sub1_sub1_sub3_sub2_41_
							.anInt11381
							= (client.anInt8296
							   * 300578563);
						}
					    }
					}
				    }
				    int i_45_ = GPI.viewportPlayerCount * 794073197;
				    int[] is = GPI.viewportPlayerIndicies;
				    for (int i_46_ = 0; i_46_ < i_45_;
					 i_46_++) {
					Player class475_sub1_sub1_sub3_sub1
					    = (client
					       .localPlayers
					       [is[i_46_]]);
					if ((class475_sub1_sub1_sub3_sub1
					     != null)
					    && ((477572011
						 * (class475_sub1_sub1_sub3_sub1
						    .anInt11381))
						!= client.anInt8296)
					    && (class475_sub1_sub1_sub3_sub1
						.aBool11379)) {
					    Class287 class287_47_
						= (class475_sub1_sub1_sub3_sub1
						       .method10874
						   ().aClass287_4386);
					    int i_48_
						= ((int) (class287_47_
							  .aFloat4477)
						   - ((class475_sub1_sub1_sub3_sub1
							   .method17782
						       (-437097410)) - 1
						      << 8));
					    int i_49_
						= ((int) (class287_47_
							  .aFloat4479)
						   - ((class475_sub1_sub1_sub3_sub1
							   .method17782
						       (1075740386)) - 1
						      << 8));
					    if (i_48_ >= i_38_
						&& (class475_sub1_sub1_sub3_sub1
							.method17782(-492274602)
						    <= ((19489015
							 * (class475_sub1_sub1_sub3_sub2
							    .definition
							    .size))
							- (i_48_ - i_38_
							   >> 9)))
						&& i_49_ >= i_39_
						&& (class475_sub1_sub1_sub3_sub1
							.method17782(729958218)
						    <= ((class475_sub1_sub1_sub3_sub2
							 .definition
							 .size) * 19489015
							- (i_49_ - i_39_
							   >> 9)))) {
						Class42.method1066
						    (class475_sub1_sub1_sub3_sub1,
						     ((class542
						       .aClass475_Sub1_7011
						       .nodePlane)
						      != (Class21
							  .myPlayer
							  .nodePlane)),
						     -1694589321);
						class475_sub1_sub1_sub3_sub1
						    .anInt11381
						    = (300578563
						       * client.anInt8296);
					    }
					}
				    }
				}
				if (client.anInt8296
				    == (class475_sub1_sub1_sub3_sub2.anInt11381
					* 477572011))
				    continue;
				Class465.method10716
				    (class475_sub1_sub1_sub3_sub2,
				     (class542.aClass475_Sub1_7011.nodePlane
				      != (Class21
					  .myPlayer
					  .nodePlane)),
				     (byte) -41);
				class475_sub1_sub1_sub3_sub2.anInt11381
				    = client.anInt8296 * 300578563;
			    }
			}
			if (class542.aClass475_Sub1_7011
			    instanceof Class475_Sub1_Sub2_Sub1) {
			    int i_50_ = 127679513 * class522.baseX + i_23_;
			    int i_51_ = class522.baseY * 468558693 + i_24_;
			    WorldTile class241_sub44
				= ((WorldTile)
				   (client.aClass407_8452.get
				    ((long) ((class542.aClass475_Sub1_7011
					      .nodePlane) << 28
					     | i_51_ << 14 | i_50_))));
			    if (class241_sub44 != null) {
				int i_52_ = 0;
				GroundItem class241_sub31
				    = ((GroundItem)
				       class241_sub44.aClass429_10181
					   .method7619((byte) -1));
				while (class241_sub31 != null) {
				    ItemDefinition class623
					= (JS5.itemDefLoader.list
					   ((2088213913
					     * class241_sub31.itemID),
					    (short) 4887));
				    int i_53_;
				    if (class623.aBool7953)
					i_53_
					    = 1075803965 * class623.anInt7910;
				    else if (class623.membersOnly)
					i_53_ = (ClanChannelUser.aClass499_5588
						 .anInt6561) * -1445883597;
				    else
					i_53_ = (ClanChannelUser.aClass499_5588
						 .anInt6560) * -1492711707;
				    if (client.aBool8544
					&& ((class542.aClass475_Sub1_7011
					     .nodePlane)
					    == (Class21
						.myPlayer
						.nodePlane))) {
					ParamType class603
					    = ((820722975 * NPCDefinitionLoader.anInt5897
						!= -1)
					       ? (Class621.paramTypeList
						      .list
						  ((820722975
						    * NPCDefinitionLoader.anInt5897),
						   1768049729))
					       : null);
					if ((-1622803377 * Class613.anInt7804
					     & 0x1) != 0
					    && (null == class603
						|| ((class623.getParam
						     ((NPCDefinitionLoader.anInt5897
						       * 820722975),
						      (2015998927
						       * class603.defaultint),
						      1380156023))
						    != (class603.defaultint
							* 2015998927))))
					    Class534.method11882
						(client.aString8464,
						 new StringBuilder().append
						     (client.aString8465)
						     .append
						     (" ").append
						     (Class6.aString33).append
						     (" ").append
						     (Class338.method6112
						      (i_53_, -238533861))
						     .append
						     (class623.name)
						     .toString(),
						 (1184895817
						  * Class213.anInt2512),
						 17, -1,
						 (long) (2088213913
							 * (class241_sub31
							    .itemID)),
						 i_23_, i_24_, true, false,
						 (long) i_52_, false,
						 -1236921043);
				    }
				    if ((Class21
					 .myPlayer
					 .nodePlane)
					== (class542.aClass475_Sub1_7011
					    .nodePlane)) {
					String[] strings
					    = class623.groundOptions;
					for (int i_54_ = strings.length - 1;
					     i_54_ >= 0; i_54_--) {
					    if (null != strings[i_54_]) {
						int i_55_ = 0;
						int i_56_
						    = (886936997
						       * client.anInt8387);
						if (i_54_ == 0)
						    i_55_ = 18;
						if (i_54_ == 1)
						    i_55_ = 19;
						if (2 == i_54_)
						    i_55_ = 20;
						if (i_54_ == 3)
						    i_55_ = 21;
						if (4 == i_54_)
						    i_55_ = 22;
						if (i_54_ == 5)
						    i_55_ = 1004;
						int i_57_
						    = (class623.method13380
						       (i_54_, (short) 31276));
						if (-1 != i_57_)
						    i_56_ = i_57_;
						Class534.method11882
						    (strings[i_54_],
						     new StringBuilder().append
							 (Class338.method6112
							  (i_53_, 915436570))
							 .append
							 (class623.name)
							 .toString(),
						     i_56_, i_55_, -1,
						     (long) ((class241_sub31
							      .itemID)
							     * 2088213913),
						     i_23_, i_24_, true, false,
						     (long) i_52_, false,
						     -1236921043);
					    }
					}
				    }
				    class241_sub31
					= ((GroundItem)
					   class241_sub44.aClass429_10181
					       .method7625((byte) 3));
				    i_52_++;
				}
			    }
			}
			if (class542.aClass475_Sub1_7011
			    instanceof Interface24) {
			    Interface24 interface24
				= (Interface24) class542.aClass475_Sub1_7011;
			    ObjectDefinition class526
				= (client.aClass238_8477.getObjectLoader
				       (-1892863125).getObjectDefinition
				   (interface24.method146((byte) 0),
				    577892407));
			    if (class526.toObjectIDs != null)
			    	class526 = class526.method11768(Class1.aClass19_11, Class1.aClass19_11, -1181845408);
			    if (null != class526) {
				if (client.aBool8544
				    && ((Class21
					 .myPlayer
					 .nodePlane)
					== (class542.aClass475_Sub1_7011
					    .nodePlane))) {
				    ParamType class603
					= (-1 != 820722975 * NPCDefinitionLoader.anInt5897
					   ? (Class621.paramTypeList
						  .list
					      (820722975 * NPCDefinitionLoader.anInt5897,
					       751312696))
					   : null);
				    if ((Class613.anInt7804 * -1622803377
					 & 0x4) != 0
					&& (class603 == null
					    || ((class526.method11769
						 ((820722975
						   * NPCDefinitionLoader.anInt5897),
						  (2015998927
						   * class603.defaultint),
						  -1160689494))
						!= (2015998927
						    * class603.defaultint))))
					Class534.method11882
					    (client.aString8464,
					     new StringBuilder().append
						 (client.aString8465).append
						 (" ").append
						 (Class6.aString33).append
						 (" ").append
						 (Class338.method6112
						  (65535, -474670092))
						 .append
						 (class526.name)
						 .toString(),
					     Class213.anInt2512 * 1184895817,
					     2, -1,
					     Class237.method4737(interface24,
								 i_23_, i_24_,
								 -1595907044),
					     i_23_, i_24_, true, false,
					     (long) interface24.hashCode(),
					     false, -1236921043);
				}
				if ((Class21.myPlayer
				     .nodePlane)
				    == (class542.aClass475_Sub1_7011
					.nodePlane)) {
				    String[] strings
					= class526.options;
				    if (null != strings) {
					for (int i_58_ = strings.length - 1;
					     i_58_ >= 0; i_58_--) {
					    if (null != strings[i_58_]) {
						int i_59_ = 0;
						int i_60_ = (client.anInt8387
							     * 886936997);
						if (0 == i_58_)
						    i_59_ = 3;
						if (i_58_ == 1)
						    i_59_ = 4;
						if (i_58_ == 2)
						    i_59_ = 5;
						if (3 == i_58_)
						    i_59_ = 6;
						if (i_58_ == 4)
						    i_59_ = 1001;
						if (5 == i_58_)
						    i_59_ = 1002;
						int i_61_
						    = (class526.method11777
						       (i_58_, -203064958));
						if (-1 != i_61_)
						    i_60_ = i_61_;
						Class534.method11882
						    (strings[i_58_],
						     new StringBuilder().append
							 (Class338.method6112
							  (65535, 332069237))
							 .append
							 (class526.name)
							 .toString(),
						     i_60_, i_59_, -1,
						     (Class237.method4737
						      (interface24, i_23_,
						       i_24_, -1595907044)),
						     i_23_, i_24_, true, false,
						     (long) interface24
								.hashCode(),
						     false, -1236921043);
					    }
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static final void method4355(ClientScriptData class454, int i) {
	((ClientScriptData) class454).anInt6231 -= 710535117;
    }
    
    static final void method4356(ClientScriptData scriptData, int i) {
    	int index = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
    			= (scriptData.clanSettings.aBoolArray5607[index] ? 1 : 0);
    }
    
    static final void method4357(ClientScriptData class454, int i) {
	if (Class119.aClass578_1564.isKeyPressed(86, -1016346882))
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
    }
    
    static final void method4358(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class573.anInt7388 + WorldTile.anInt10182 * 257473507;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class573.anInt7389 + 291545115 * WorldTile.anInt10183;
    }
    
    static final void method4359(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	int i_63_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class445_Sub16.aClass351_Sub1_8660.method6267
	    (Class281.method5489(i_63_, (short) -22183), true, -1296347115);
	client.aBool8392 = true;
    }
    
    static final void method4360(ClientScriptData class454, int i) {
	String string;
	if (Class21.myPlayer != null
	    && Class21.myPlayer.nameFiltered != null)
	    string = Class21.myPlayer
			 .getFormattedName(true, -1188565778);
	else
	    string = "";
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = string;
    }
}
