/* Class465 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class465
{
    static Class465 aClass465_6295;
    public static Class465 aClass465_6296 = new Class465(0, 2, 2, 1);
    static Class465 aClass465_6297;
    public int anInt6298;
    public static Class465 aClass465_6299 = new Class465(1, 2, 2, 0);
    public static Class465 aClass465_6300;
    static Class465 aClass465_6301;
    static Class465 aClass465_6302;
    public static Class465 aClass465_6303;
    public static Class465 aClass465_6304;
    public int anInt6305;
    public static Class465 aClass465_6306;
    static Class465 aClass465_6307;
    static Class465 aClass465_6308;
    static Class465 aClass465_6309 = new Class465(2, 4, 4, 0);
    static Class465 aClass465_6310;
    public int anInt6311;
    public int anInt6312;
    
    static {
	aClass465_6297 = new Class465(4, 1, 1, 1);
	aClass465_6306 = new Class465(6, 0, 4, 2);
	aClass465_6300 = new Class465(7, 0, 1, 1);
	aClass465_6301 = new Class465(8, 0, 4, 1);
	aClass465_6310 = new Class465(9, 0, 4, 1);
	aClass465_6303 = new Class465(10, 2, 2, 0);
	aClass465_6304 = new Class465(11, 0, 1, 2);
	aClass465_6295 = new Class465(12, 0, 1, 0);
	aClass465_6302 = new Class465(13, 0, 1, 0);
	aClass465_6307 = new Class465(14, 0, 4, 1);
	aClass465_6308 = new Class465(15, 0, 1, 0);
    }
    
    public static Class465 method10709(int i) {
	Class465[] class465s = Class75.method1767(-1580433511);
	for (int i_0_ = 0; i_0_ < class465s.length; i_0_++) {
	    if (i == 2119010589 * class465s[i_0_].anInt6298)
		return class465s[i_0_];
	}
	return null;
    }
    
    static Class465[] method10710() {
	return new Class465[] { aClass465_6310, aClass465_6307, aClass465_6309,
				aClass465_6296, aClass465_6299, aClass465_6306,
				aClass465_6302, aClass465_6297, aClass465_6300,
				aClass465_6303, aClass465_6308, aClass465_6304,
				aClass465_6301, aClass465_6295 };
    }
    
    public static Class465 method10711(int i) {
	Class465[] class465s = Class75.method1767(-88614247);
	for (int i_1_ = 0; i_1_ < class465s.length; i_1_++) {
	    if (i == 2119010589 * class465s[i_1_].anInt6298)
		return class465s[i_1_];
	}
	return null;
    }
    
    Class465(int i, int i_2_, int i_3_, int i_4_) {
	anInt6298 = -1151893195 * i;
	anInt6305 = -1659656999 * i_2_;
	anInt6311 = -744094297 * i_3_;
	anInt6312 = -687486397 * i_4_;
    }
    
    static final void method10712(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= 1736754263;
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	Class241_Sub11 class241_sub11
	    = (Class241_Sub11) client.aClass407_8467.get((long) i_5_);
	if (null != class241_sub11
	    && 3 == 1233847279 * class241_sub11.clipped)
	    Class40.method1047(class241_sub11, true, true, -2144044337);
    }
    
    static final void method10713(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	Class402.soundManager.method1169((((ClientScriptData) class454).integerStack
					   [(((ClientScriptData) class454).intStackPointer
					     * 1482319719)]),
					  (((ClientScriptData) class454).integerStack
					   [1 + (((ClientScriptData) class454)
						 .intStackPointer) * 1482319719]),
					  -1031236684);
    }
    
    static final void method10714(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub16_8858
		  .method14248((byte) -103);
    }
    
    static int method10715(String string, byte[] is, int i, int i_6_) {
	int i_7_ = i;
	int i_8_ = string.length();
	for (int i_9_ = 0; i_9_ < i_8_; i_9_ += 4) {
	    int i_10_ = Class576.method12669(string.charAt(i_9_), 1812765172);
	    int i_11_
		= (1 + i_9_ < i_8_
		   ? Class576.method12669(string.charAt(i_9_ + 1), 769986254)
		   : -1);
	    int i_12_
		= (2 + i_9_ < i_8_
		   ? Class576.method12669(string.charAt(i_9_ + 2), -1576823235)
		   : -1);
	    int i_13_
		= (i_9_ + 3 < i_8_
		   ? Class576.method12669(string.charAt(3 + i_9_), 1727588772)
		   : -1);
	    is[i++] = (byte) (i_10_ << 2 | i_11_ >>> 4);
	    if (-1 == i_12_)
		break;
	    is[i++] = (byte) ((i_11_ & 0xf) << 4 | i_12_ >>> 2);
	    if (i_13_ == -1)
		break;
	    is[i++] = (byte) ((i_12_ & 0x3) << 6 | i_13_);
	}
	return i - i_7_;
    }
    
    static void method10716
	(NPC class475_sub1_sub1_sub3_sub2,
	 boolean bool, byte i) {
	if (1327183635 * Class16.anInt148 < 410) {
	    NPCDefinition class401 = class475_sub1_sub1_sub3_sub2.definition;
	    String string = class475_sub1_sub1_sub3_sub2.npcName;
	    if (class401.transformTo != null) {
		class401 = class401.method7176(Class1.aClass19_11,
					       Class1.aClass19_11, (byte) 11);
		if (class401 == null)
		    return;
		string = class401.name;
	    }
	    if (class401.aBool5839) {
		if (0
		    != class475_sub1_sub1_sub3_sub2.combatLevel * 1239473347) {
		    String string_14_
			= (GameDefinition.STELLARDAWN == client.currentGame
			   ? (ClientMessage.RATING.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 18405))
			   : (ClientMessage.LEVEL.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 28103)));
		    string = new StringBuilder().append(string).append
				 (Class410.method7458
				  ((1239473347
				    * class475_sub1_sub1_sub3_sub2.combatLevel),
				   (Class21.myPlayer
				    .anInt11502) * -1617461639,
				   (byte) 108))
				 .append
				 (Class6.aString29).append
				 (string_14_).append
				 (1239473347
				  * class475_sub1_sub1_sub3_sub2.combatLevel)
				 .append
				 (Class6.aString32).toString();
		}
		if (client.aBool8544 && !bool) {
		    ParamType class603
			= (-1 != 820722975 * NPCDefinitionLoader.anInt5897
			   ? Class621.paramTypeList.list(((NPCDefinitionLoader
								   .anInt5897)
								  * 820722975),
								 2001697132)
			   : null);
		    if ((-1622803377 * Class613.anInt7804 & 0x2) != 0
			&& (null == class603
			    || (class401.method7148((NPCDefinitionLoader.anInt5897
						     * 820722975),
						    (class603.defaultint
						     * 2015998927),
						    (byte) -62)
				!= 2015998927 * class603.defaultint)))
			Class534.method11882
			    (client.aString8464,
			     new StringBuilder().append(client.aString8465)
				 .append
				 (" ").append
				 (Class6.aString33).append
				 (" ").append
				 (Class338.method6112(16776960, 485965094))
				 .append
				 (string).toString(),
			     Class213.anInt2512 * 1184895817, 8, -1,
			     (long) (-546698383 * (class475_sub1_sub1_sub3_sub2
						   .entityIndex)),
			     0, 0, true, false,
			     (long) (class475_sub1_sub1_sub3_sub2.entityIndex
				     * -546698383),
			     false, -1236921043);
		}
		if (!bool) {
		    String[] strings = class401.options;
		    if (client.aBool8473)
			strings = Class591.method12918(strings, -587413742);
		    if (null != strings) {
			for (int i_15_ = strings.length - 1; i_15_ >= 0;
			     i_15_--) {
			    if (strings[i_15_] != null
				&& (class401.aByte5863 == 0
				    || (!(strings[i_15_].equalsIgnoreCase
					  (ClientMessage.ATTACK.getLocalisedMessage
					   (VarPlayerDomain.currentLocale,
					    (short) 32701)))
					&& !(strings[i_15_].equalsIgnoreCase
					     (ClientMessage.EXAMINE
						  .getLocalisedMessage
					      (VarPlayerDomain.currentLocale,
					       (short) 29878)))))) {
				int i_16_ = 0;
				int i_17_ = client.anInt8387 * 886936997;
				if (0 == i_15_)
				    i_16_ = 9;
				if (i_15_ == 1)
				    i_16_ = 10;
				if (2 == i_15_)
				    i_16_ = 11;
				if (i_15_ == 3)
				    i_16_ = 12;
				if (i_15_ == 4)
				    i_16_ = 13;
				if (i_15_ == 5)
				    i_16_ = 1003;
				int i_18_
				    = class401.method7153(i_15_, (byte) -79);
				if (-1 != i_18_)
				    i_17_ = i_18_;
				Class534.method11882
				    (strings[i_15_],
				     new StringBuilder().append
					 (Class338.method6112(16776960,
							      914132700))
					 .append
					 (string).toString(),
				     ((strings[i_15_].equalsIgnoreCase
				       (ClientMessage.ATTACK.getLocalisedMessage
					(VarPlayerDomain.currentLocale,
					 (short) 23731)))
				      ? class401.anInt5822 * 789838663
				      : i_17_),
				     i_16_, -1,
				     (long) (-546698383
					     * (class475_sub1_sub1_sub3_sub2
						.entityIndex)),
				     0, 0, true, false,
				     (long) (-546698383
					     * (class475_sub1_sub1_sub3_sub2
						.entityIndex)),
				     false, -1236921043);
			    }
			}
			if (class401.aByte5863 == 1) {
			    for (int i_19_ = 0; i_19_ < strings.length;
				 i_19_++) {
				if (null != strings[i_19_]
				    && ((strings[i_19_].equalsIgnoreCase
					 (ClientMessage.ATTACK.getLocalisedMessage
					  (VarPlayerDomain.currentLocale,
					   (short) 23310)))
					|| (strings[i_19_].equalsIgnoreCase
					    (ClientMessage.EXAMINE
						 .getLocalisedMessage
					     (VarPlayerDomain.currentLocale,
					      (short) 23357))))) {
				    short i_20_ = 0;
				    if ((1239473347
					 * (class475_sub1_sub1_sub3_sub2
					    .combatLevel))
					> (Class21
					   .myPlayer
					   .anInt11502) * -1617461639)
					i_20_ = (short) 2000;
				    short i_21_ = 0;
				    int i_22_ = client.anInt8387 * 886936997;
				    if (i_19_ == 0)
					i_21_ = (short) 9;
				    if (1 == i_19_)
					i_21_ = (short) 10;
				    if (i_19_ == 2)
					i_21_ = (short) 11;
				    if (3 == i_19_)
					i_21_ = (short) 12;
				    if (4 == i_19_)
					i_21_ = (short) 13;
				    if (i_19_ == 5)
					i_21_ = (short) 1003;
				    if (i_21_ != 0)
					i_21_ += i_20_;
				    int i_23_
					= class401.method7153(i_19_,
							      (byte) -124);
				    if (-1 != i_23_)
					i_22_ = i_23_;
				    Class534.method11882
					(strings[i_19_],
					 new StringBuilder().append
					     (Class338.method6112(16776960,
								  1364967323))
					     .append
					     (string).toString(),
					 ((strings[i_19_].equalsIgnoreCase
					   (ClientMessage.ATTACK.getLocalisedMessage
					    (VarPlayerDomain.currentLocale,
					     (short) 28383)))
					  ? 789838663 * class401.anInt5822
					  : i_22_),
					 i_21_, -1,
					 (long) (-546698383
						 * (class475_sub1_sub1_sub3_sub2
						    .entityIndex)),
					 0, 0, true, false,
					 (long) ((class475_sub1_sub1_sub3_sub2
						  .entityIndex)
						 * -546698383),
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
