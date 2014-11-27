/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class42
{
    static Class42 aClass42_599 = new Class42(0);
    static Class42 aClass42_600 = new Class42(1);
    int anInt601;
    static Class489[] aClass489Array602;
    
    public static Class42 method1065(int i) {
	if (((Class42) aClass42_599).anInt601 * 1420573529 == i)
	    return aClass42_599;
	if (1420573529 * ((Class42) aClass42_600).anInt601 == i)
	    return aClass42_600;
	return null;
    }
    
    Class42(int i) {
	((Class42) this).anInt601 = i * 502947049;
    }
    
    static void method1066
	(Player class475_sub1_sub1_sub3_sub1,
	 boolean bool, int i) {
	if (1327183635 * Class16.anInt148 < 410) {
	    if (Class21.myPlayer
		== class475_sub1_sub1_sub3_sub1) {
		if (client.aBool8544
		    && (-1622803377 * Class613.anInt7804 & 0x10) != 0)
		    Class534.method11882
			(client.aString8464,
			 new StringBuilder().append(client.aString8465).append
			     (" ").append
			     (Class6.aString33).append
			     (" ").append
			     (Class338.method6112(16777215, 1365761730)).append
			     (ClientMessage.SELF.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 28572))
			     .toString(),
			 1184895817 * Class213.anInt2512, 16, -1, 0L, 0, 0,
			 true, false,
			 (long) (-546698383
				 * class475_sub1_sub1_sub3_sub1.entityIndex),
			 false, -1236921043);
	    } else {
		String string;
		if (class475_sub1_sub1_sub3_sub1.anInt11516 * 1682998611
		    == 0) {
		    boolean bool_0_ = true;
		    if (-1 != (Class21.myPlayer
			       .anInt11504) * -870747707
			&& -1 != (class475_sub1_sub1_sub3_sub1.anInt11504
				  * -870747707)) {
			int i_1_
			    = (((Class21.myPlayer
				 .anInt11504) * -870747707
				< (class475_sub1_sub1_sub3_sub1.anInt11504
				   * -870747707))
			       ? (-870747707
				  * (Class21.myPlayer
				     .anInt11504))
			       : (-870747707
				  * class475_sub1_sub1_sub3_sub1.anInt11504));
			int i_2_
			    = ((-1617461639
				* (Class21.myPlayer
				   .anInt11502))
			       - (-1617461639
				  * class475_sub1_sub1_sub3_sub1.anInt11502));
			if (i_2_ < 0)
			    i_2_ = -i_2_;
			if (i_2_ > i_1_)
			    bool_0_ = false;
		    }
		    String string_3_
			= (GameDefinition.STELLARDAWN == client.currentGame
			   ? (ClientMessage.RATING.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 24120))
			   : (ClientMessage.LEVEL.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 16477)));
		    if (-1617461639 * class475_sub1_sub1_sub3_sub1.anInt11502
			>= (-1238039071
			    * class475_sub1_sub1_sub3_sub1.anInt11503))
			string
			    = new StringBuilder().append
				  (class475_sub1_sub1_sub3_sub1
				       .getFormattedName(true, -1017457491))
				  .append
				  (bool_0_
				   ? (Class410.method7458
				      ((-1617461639
					* (class475_sub1_sub1_sub3_sub1
					   .anInt11502)),
				       (-1617461639
					* (Class21
					   .myPlayer
					   .anInt11502)),
				       (byte) 120))
				   : Class338.method6112(16777215, -408894255))
				  .append
				  (Class6.aString29).append
				  (string_3_).append
				  (-1617461639
				   * class475_sub1_sub1_sub3_sub1.anInt11502)
				  .append
				  (Class6.aString32).toString();
		    else
			string
			    = new StringBuilder().append
				  (class475_sub1_sub1_sub3_sub1
				       .getFormattedName(true, -175032235))
				  .append
				  (bool_0_
				   ? (Class410.method7458
				      ((class475_sub1_sub1_sub3_sub1.anInt11502
					* -1617461639),
				       (Class21
					.myPlayer
					.anInt11502) * -1617461639,
				       (byte) 13))
				   : Class338.method6112(16777215, -980463192))
				  .append
				  (Class6.aString29).append
				  (string_3_).append
				  (-1617461639
				   * class475_sub1_sub1_sub3_sub1.anInt11502)
				  .append
				  ("+").append
				  ((class475_sub1_sub1_sub3_sub1.anInt11503
				    * -1238039071)
				   - (class475_sub1_sub1_sub3_sub1.anInt11502
				      * -1617461639))
				  .append
				  (Class6.aString32).toString();
		} else if (1682998611 * class475_sub1_sub1_sub3_sub1.anInt11516
			   == -1)
		    string
			= class475_sub1_sub1_sub3_sub1.getFormattedName(true,
								   -101613572);
		else
		    string = new StringBuilder().append
				 (class475_sub1_sub1_sub3_sub1
				      .getFormattedName(true, -1249373369))
				 .append
				 (Class6.aString29).append
				 (ClientMessage.SKILL.getLocalisedMessage
				  (VarPlayerDomain.currentLocale, (short) 22960))
				 .append
				 (1682998611
				  * class475_sub1_sub1_sub3_sub1.anInt11516)
				 .append
				 (Class6.aString32).toString();
		boolean bool_4_ = false;
		if (-1 != -614581637 * (class475_sub1_sub1_sub3_sub1
					.aClass490_11499.anInt6508)) {
		    NPCDefinition class401
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   ((class475_sub1_sub1_sub3_sub1.aClass490_11499
			     .anInt6508) * -614581637,
			    -1431519871));
		    if (class401.aBool5871) {
			bool_4_ = true;
			string = (MasterIndex.npcDefLoader.getNpcDefinition
				  (-614581637 * (class475_sub1_sub1_sub3_sub1
						 .aClass490_11499.anInt6508),
				   -1564774753)
				  .name);
			if (0 != class401.combatLevel * 8317645) {
			    String string_5_
				= ((client.currentGame
				    == GameDefinition.STELLARDAWN)
				   ? (ClientMessage.RATING.getLocalisedMessage
				      (VarPlayerDomain.currentLocale, (short) 27424))
				   : (ClientMessage.LEVEL.getLocalisedMessage
				      (VarPlayerDomain.currentLocale,
				       (short) 26330)));
			    string
				= new StringBuilder().append(string).append
				      (Class410.method7458
				       (class401.combatLevel * 8317645,
					(-1617461639
					 * (Class21
					    .myPlayer
					    .anInt11502)),
					(byte) 56))
				      .append
				      (Class6.aString29).append
				      (string_5_).append
				      (class401.combatLevel * 8317645).append
				      (Class6.aString32).toString();
			}
		    }
		}
		if (client.aBool8544 && !bool
		    && (-1622803377 * Class613.anInt7804 & 0x8) != 0)
		    Class534.method11882
			(client.aString8464,
			 new StringBuilder().append(client.aString8465).append
			     (" ").append
			     (Class6.aString33).append
			     (" ").append
			     (Class338.method6112(16777215, -1276886095))
			     .append
			     (string).toString(),
			 Class213.anInt2512 * 1184895817, 15, -1,
			 (long) (class475_sub1_sub1_sub3_sub1.entityIndex
				 * -546698383),
			 0, 0, true, false,
			 (long) (class475_sub1_sub1_sub3_sub1.entityIndex
				 * -546698383),
			 false, -1236921043);
		if (!bool) {
		    for (int i_6_ = 7; i_6_ >= 0; i_6_--) {
			if (null != client.playerOptionMessages[i_6_]) {
			    short i_7_ = 0;
			    if ((GameDefinition.RUNESCAPE
				 == client.currentGame)
				&& (client.playerOptionMessages[i_6_]
					.equalsIgnoreCase
				    (ClientMessage.ATTACK.getLocalisedMessage
				     (VarPlayerDomain.currentLocale,
				      (short) 19542)))) {
				if (client.aBool8444
				    && ((class475_sub1_sub1_sub3_sub1
					 .anInt11502) * -1617461639
					> (-1617461639
					   * (Class21
					      .myPlayer
					      .anInt11502))))
				    i_7_ = (short) 2000;
				if ((Class21.myPlayer
				     .anInt11495) * -786517937 != 0
				    && (class475_sub1_sub1_sub3_sub1.anInt11495
					* -786517937) != 0) {
				    if ((-786517937
					 * (class475_sub1_sub1_sub3_sub1
					    .anInt11495))
					== (Class21
					    .myPlayer
					    .anInt11495) * -786517937)
					i_7_ = (short) 2000;
				    else
					i_7_ = (short) 0;
				} else if (class475_sub1_sub1_sub3_sub1
					   .aBool11494)
				    i_7_ = (short) 2000;
			    } else if (client.aBoolArray8450[i_6_])
				i_7_ = (short) 2000;
			    short i_8_
				= (short) (i_7_
					   + client.aShortArray8447[i_6_]);
			    int i_9_ = (-1 != client.playerOptionCursors[i_6_]
					? client.playerOptionCursors[i_6_]
					: 886936997 * client.anInt8387);
			    int i_10_ = bool_4_ ? 16776960 : 16777215;
			    Class534.method11882
				(client.playerOptionMessages[i_6_],
				 new StringBuilder().append
				     (Class338.method6112(i_10_, -115640374))
				     .append
				     (string).toString(),
				 i_9_, i_8_, -1,
				 (long) (-546698383
					 * (class475_sub1_sub1_sub3_sub1
					    .entityIndex)),
				 0, 0, true, false,
				 (long) ((class475_sub1_sub1_sub3_sub1
					  .entityIndex)
					 * -546698383),
				 false, -1236921043);
			}
		    }
		} else if (!bool_4_)
		    Class534.method11882(new StringBuilder().append
					     (Class338.method6112(13421772,
								  -686571389))
					     .append
					     (string).toString(),
					 "", -1, -1, 0, 0L, 0, 0, false, true,
					 (long) ((class475_sub1_sub1_sub3_sub1
						  .entityIndex)
						 * -546698383),
					 false, -1236921043);
		if (!bool && !bool_4_) {
		    for (Class241_Sub39_Sub11 class241_sub39_sub11
			     = ((Class241_Sub39_Sub11)
				Class16.aClass429_150.method7694(16711935));
			 null != class241_sub39_sub11;
			 class241_sub39_sub11
			     = ((Class241_Sub39_Sub11)
				Class16.aClass429_150
				    .method7692(1276186374))) {
			if (23
			    == (((Class241_Sub39_Sub11) class241_sub39_sub11)
				.anInt10879) * -142243581) {
			    ((Class241_Sub39_Sub11) class241_sub39_sub11)
				.aString10880
				= new StringBuilder().append
				      (Class338.method6112(16777215,
							   515955746))
				      .append
				      (string).toString();
			    break;
			}
		    }
		}
	    }
	}
    }
    
    public static void method1067(ClientScriptCaller class241_sub14, int i) {
    	Class371.method6625(class241_sub14, 200000, 1660019395);
    }
    
    public static Class613 method1068(int i, int i_11_) {
	Class613[] class613s = Class117.method2929(-1026517463);
	Class613[] class613s_12_ = class613s;
	for (int i_13_ = 0; i_13_ < class613s_12_.length; i_13_++) {
	    Class613 class613 = class613s_12_[i_13_];
	    if (i == ((Class613) class613).anInt7803 * -893648815)
		return class613;
	}
	return null;
    }
    
    static final void method1069(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	RS3File.method7341(class58, class35, class454, 637643344);
    }
    
    public static Class319 method1070(RSByteBuffer class241_sub3, int i) {
	Class319 class319 = Class380.method6880(class241_sub3, 83979853);
	int i_14_ = class241_sub3.method14643((byte) -50);
	return new Class319_Sub1(-459715851 * class319.anInt4869,
				 class319.aClass330_4870,
				 class319.aClass324_4871,
				 -2122202469 * class319.anInt4868,
				 class319.anInt4872 * -710253951, i_14_);
    }
    
    static final void method1071(ClientScriptData class454, byte i)
	throws Exception_Sub5 {
	int i_15_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class445_Sub16.aClass351_Sub1_8660.method6258
	    (Class580_Sub1.method14520(i_15_, 25086103), true, 807592021);
	client.aBool8392 = true;
    }
    
    public static final boolean namesAreEqual/*method1072*/(String name1, String protocol1,
					   String name2, String protocol2, int i) {
		if (null == name1 || name2 == null) {
		    return false;
		}
		if (name1.startsWith("#") || name2.startsWith("#")) {
		    return name1.equals(name2);
		}
		return protocol1.equals(protocol2);
    }
    
    static final void method1073(ClientScriptData class454, short i) {
	int i_19_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_19_, (byte) -42);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_19_ >> 16];
	Class331.method6042(class58, class35, class454, 1214979898);
    }
}
