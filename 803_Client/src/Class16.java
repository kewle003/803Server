/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Desktop;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

public class Class16
{
    static int anInt135;
    static final int anInt136 = 410;
    static float[] aFloatArray137;
    static int anInt138;
    static final int anInt139 = 31;
    static final int anInt140 = 31;
    public static boolean aBool141;
    static final int anInt142 = 0;
    static Class241_Sub39_Sub10 aClass241_Sub39_Sub10_143;
    static int anInt144;
    static final int anInt145 = 1;
    static final int anInt146 = 2;
    static int anInt147;
    public static int anInt148;
    public static int anInt149;
    static NodeCollection aClass429_150;
    static final int anInt151 = 506;
    static Class410 aClass410_152;
    static NodeCollection aClass429_153;
    static NodeCollection aClass429_154;
    static Class129 aClass129_155;
    static int anInt156;
    public static final int anInt157 = 7;
    static InterfaceComponent aClass58_158;
    static int anInt159;
    static int anInt160;
    static final int anInt161 = 8;
    public static int anInt162;
    static int anInt163;
    static int anInt164 = -1742814544;
    static Class268 aClass268_165;
    static Class268 aClass268_166;
    static Class266 aClass266_167;
    public static boolean aBool168;
    static final int anInt169 = 2;
    static Class241_Sub39_Sub11 aClass241_Sub39_Sub11_170;
    static boolean aBool171;
    static Class129 aClass129_172;
    static final int anInt173 = 0;
    static final int anInt174 = 1;
    public static final int anInt175 = 4;
    static final int anInt176 = 3;
    static int anInt177;
    static final int anInt178 = 5;
    static final int anInt179 = 6;
    static HashTable aClass407_180;
    static int anInt181;
    
    public static String method709(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (aBool141 || class241_sub39_sub11 == null)
	    return "";
	return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10871;
    }
    
    public static String method710(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (aBool141 || class241_sub39_sub11 == null)
	    return "";
	return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10871;
    }
    
    static boolean method711() {
	return AnimationDefinitionLoader.method12315(ClanChannelUser.aClass499_5588.aClass533_6559,
				    (byte) -119);
    }
    
    static boolean method712() {
	return AnimationDefinitionLoader.method12315(ClanChannelUser.aClass499_5588.aClass533_6558,
				    (byte) -24);
    }
    
    static long method713(Interface24 interface24, int i, int i_0_) {
	long l = 4194304L;
	long l_1_ = -9223372036854775808L;
	ObjectDefinition class526
	    = client.aClass238_8477.getObjectLoader(-1879257724)
		  .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	long l_2_
	    = (long) (i | i_0_ << 7 | interface24.method139(591463713) << 14
		      | interface24.method140(-935759288) << 20 | 0x40000000);
	if (class526.anInt6848 * -1389471035 == 0)
	    l_2_ |= l_1_;
	if (class526.anInt6881 * -309513503 == 1)
	    l_2_ |= l;
	l_2_ |= (long) interface24.method146((byte) 0) << 32;
	return l_2_;
    }
    
    static boolean method714() {
	return AnimationDefinitionLoader.method12315(ClanChannelUser.aClass499_5588.aClass533_6558,
				    (byte) -23);
    }
    
    static boolean method715() {
	return AnimationDefinitionLoader.method12315(ClanChannelUser.aClass499_5588.aClass533_6557,
				    (byte) -72);
    }
    
    static boolean method716() {
	return AnimationDefinitionLoader.method12315(ClanChannelUser.aClass499_5588.aClass533_6557,
				    (byte) -4);
    }
    
    static boolean method717() {
	return AnimationDefinitionLoader.method12315(ClanChannelUser.aClass499_5588.aClass533_6557,
				    (byte) 85);
    }
    
    static boolean method718(Class533 class533) {
	return Class482.method11024(class533, null, 1908001291);
    }
    
    static void method719(Class268 class268) {
	aClass268_166.method5199(class268);
    }
    
    static void method720() {
	aClass241_Sub39_Sub11_170
	    = (new Class241_Sub39_Sub11
	       (ClientMessage.CANCEL.getLocalisedMessage(VarPlayerDomain.currentLocale,
						    (short) 24541),
		"", 12960807 * client.anInt8458, 1006, -1, 0L, 0, 0, true,
		false, 0L, true));
    }
    
    static void method721() {
	if (client.anInt8352 * 2040707973 < 0) {
	    Class639 class639 = OnlineStatus.method7519(1986299325);
	    if (!aBool141)
		aBool171 = ((anInt162 * -267152011 != -1
			     && 1327183635 * anInt148 >= anInt162 * -267152011)
			    || (1327183635 * anInt148 * (anInt164 * 1149989507)
				+ (aBool168 ? 26
				   : 22)) > 963058943 * Class67.canvasHei);
	    aClass429_153.method7652((byte) 95);
	    aClass429_154.method7652((byte) 19);
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7694(16711935));
		 class241_sub39_sub11 != null;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7692(-395685432))) {
		int i
		    = (((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10879
		       * -142243581);
		if (i < 1000) {
		    class241_sub39_sub11.remove((byte) 36);
		    if (59 == i || 2 == i || 8 == i || i == 17 || i == 15
			|| i == 16 || 58 == i)
			aClass429_154.addNode(class241_sub39_sub11,
						 (short) -398);
		    else
			aClass429_153.addNode(class241_sub39_sub11,
						 (short) -4443);
		}
	    }
	    aClass429_153.method7633(aClass429_150, -1212442142);
	    aClass429_154.method7633(aClass429_150, -1212442142);
	    if (anInt148 * 1327183635 > 1) {
		if (SparseVarDomain.method3110((byte) -85)
		    && 1327183635 * anInt148 > 2)
		    Class125.aClass241_Sub39_Sub11_1582
			= (Class241_Sub39_Sub11) (aClass429_150.aClass241_6093
						  .nextNode
						  .nextNode);
		else
		    Class125.aClass241_Sub39_Sub11_1582
			= ((Class241_Sub39_Sub11)
			   aClass429_150.aClass241_6093.nextNode);
		Class540.aClass241_Sub39_Sub11_7002
		    = ((Class241_Sub39_Sub11)
		       aClass429_150.aClass241_6093.nextNode);
		if (1327183635 * anInt148 > 2)
		    Class478.aClass241_Sub39_Sub11_6402
			= ((Class241_Sub39_Sub11)
			   Class540.aClass241_Sub39_Sub11_7002.nextNode);
		else
		    Class478.aClass241_Sub39_Sub11_6402 = null;
	    } else {
		Class125.aClass241_Sub39_Sub11_1582 = null;
		Class540.aClass241_Sub39_Sub11_7002 = null;
		Class478.aClass241_Sub39_Sub11_6402 = null;
	    }
	    Class241_Sub24 class241_sub24
		= (Class241_Sub24) client.aClass429_8311.method7694(16711935);
	    int i;
	    int i_3_;
	    if (null != class241_sub24) {
		i = class241_sub24.getX((byte) 48);
		i_3_ = class241_sub24.getY((byte) 127);
	    } else {
		i = Class106.aClass580_1503.method12718(538197956);
		i_3_ = Class106.aClass580_1503.method12740((byte) -81);
	    }
	    if (aBool141) {
		if (Class482.method11024((ClanChannelUser.aClass499_5588
					  .anInterface54_6554),
					 class241_sub24, 1908001291)) {
		    if (null != aClass241_Sub39_Sub10_143
			&& i >= Class193.anInt2298 * 1955430821
			&& i <= (Class193.anInt2298 * 1955430821
				 + -885853667 * anInt147)
			&& i_3_ >= 282057643 * Class4.anInt16
			&& i_3_ <= (282057643 * Class4.anInt16
				    + -950722911 * Class395.anInt5784)) {
			int i_4_ = -1;
			for (int i_5_ = 0;
			     i_5_ < 1633676605 * (((Class241_Sub39_Sub10)
						   aClass241_Sub39_Sub10_143)
						  .anInt10867);
			     i_5_++) {
			    if (aBool168) {
				int i_6_
				    = (-351886683 * class639.anInt8258
				       + (282057643 * Class4.anInt16 + 20) + 1
				       + i_5_ * (anInt164 * 1149989507));
				if (i_3_ > (i_6_
					    - -351886683 * class639.anInt8258
					    - 1)
				    && i_3_ < i_6_ + (class639.anInt8260
						      * 326424439))
				    i_4_ = i_5_;
			    } else {
				int i_7_
				    = (i_5_ * (1149989507 * anInt164)
				       + (31 + 282057643 * Class4.anInt16));
				if (i_3_ > i_7_ - 13 && i_3_ < 3 + i_7_)
				    i_4_ = i_5_;
			    }
			}
			if (-1 != i_4_) {
			    int i_8_ = 0;
			    Class427 class427
				= new Class427(((Class241_Sub39_Sub10)
						aClass241_Sub39_Sub10_143)
					       .aClass410_10866);
			    for (Class241_Sub39_Sub11 class241_sub39_sub11
				     = ((Class241_Sub39_Sub11)
					class427.method7585(679383733));
				 class241_sub39_sub11 != null;
				 class241_sub39_sub11 = ((Class241_Sub39_Sub11)
							 class427.next())) {
				if (i_8_ == i_4_) {
				    Class47.method1135(class241_sub39_sub11, i,
						       i_3_, 258194196);
				    break;
				}
				i_8_++;
			    }
			}
			Class198.method4036((byte) 4);
		    } else if (i >= anInt156 * 1011088115
			       && i <= (anInt156 * 1011088115
					+ Class593.anInt7631 * 1139603851)
			       && i_3_ >= 904064679 * Class380.anInt5660
			       && i_3_ <= (630071575 * LoadingScreenDef.anInt5500
					   + 904064679 * Class380.anInt5660)) {
			if (!aBool171) {
			    int i_9_ = -1;
			    for (int i_10_ = 0; i_10_ < 1327183635 * anInt148;
				 i_10_++) {
				if (aBool168) {
				    int i_11_
					= ((1149989507 * anInt164
					    * (1327183635 * anInt148 - 1
					       - i_10_))
					   + (1 + (20
						   + (904064679
						      * Class380.anInt5660)
						   + (class639.anInt8258
						      * -351886683))));
				    if ((i_3_
					 > (i_11_
					    - -351886683 * class639.anInt8258
					    - 1))
					&& (i_3_
					    < i_11_ + (326424439
						       * class639.anInt8260)))
					i_9_ = i_10_;
				} else {
				    int i_12_
					= (31 + 904064679 * Class380.anInt5660
					   + (anInt164 * 1149989507
					      * (anInt148 * 1327183635 - 1
						 - i_10_)));
				    if (i_3_ > i_12_ - 13 && i_3_ < 3 + i_12_)
					i_9_ = i_10_;
				}
			    }
			    if (-1 != i_9_) {
				int i_13_ = 0;
				Class443 class443
				    = new Class443(aClass429_150);
				for (Class241_Sub39_Sub11 class241_sub39_sub11
					 = ((Class241_Sub39_Sub11)
					    class443.method7865(-1110894786));
				     class241_sub39_sub11 != null;
				     class241_sub39_sub11
					 = ((Class241_Sub39_Sub11)
					    class443.next())) {
				    if (i_13_ == i_9_) {
					Class47.method1135
					    (class241_sub39_sub11, i, i_3_,
					     -360997004);
					break;
				    }
				    i_13_++;
				}
			    }
			    Class198.method4036((byte) 4);
			} else {
			    int i_14_ = -1;
			    for (int i_15_ = 0; i_15_ < anInt149 * -1887420811;
				 i_15_++) {
				if (aBool168) {
				    int i_16_ = (anInt164 * 1149989507 * i_15_
						 + (1 + ((-351886683
							  * class639.anInt8258)
							 + ((Class380.anInt5660
							     * 904064679)
							    + 20))));
				    if ((i_3_
					 > (i_16_
					    - -351886683 * class639.anInt8258
					    - 1))
					&& i_3_ < (class639.anInt8260
						   * 326424439) + i_16_) {
					i_14_ = i_15_;
					break;
				    }
				} else {
				    int i_17_
					= (i_15_ * (anInt164 * 1149989507)
					   + (31 + (904064679
						    * Class380.anInt5660)));
				    if (i_3_ > i_17_ - 13
					&& i_3_ < i_17_ + 3) {
					i_14_ = i_15_;
					break;
				    }
				}
			    }
			    if (-1 != i_14_) {
				int i_18_ = 0;
				Class427 class427
				    = new Class427(aClass410_152);
				for (Class241_Sub39_Sub10 class241_sub39_sub10
					 = ((Class241_Sub39_Sub10)
					    class427.method7585(867528513));
				     null != class241_sub39_sub10;
				     class241_sub39_sub10
					 = ((Class241_Sub39_Sub10)
					    class427.next())) {
				    if (i_18_ == i_14_) {
					Class47.method1135
					    (((Class241_Sub39_Sub11)
					      (((Class241_Sub39_Sub10)
						class241_sub39_sub10)
					       .aClass410_10866
					       .aClass241_Sub39_5934
					       .aClass241_Sub39_10148)),
					     i, i_3_, -521428361);
					Class198.method4036((byte) 4);
					break;
				    }
				    i_18_++;
				}
			    }
			}
		    }
		} else {
		    boolean bool = false;
		    if (aClass241_Sub39_Sub10_143 != null) {
			if (i < 1955430821 * Class193.anInt2298 - 10
			    || i > (Class193.anInt2298 * 1955430821
				    + -885853667 * anInt147 + 10)
			    || i_3_ < 282057643 * Class4.anInt16 - 10
			    || i_3_ > (-950722911 * Class395.anInt5784
				       + Class4.anInt16 * 282057643 + 10))
			    Class211.method4281((byte) -65);
			else
			    bool = true;
		    }
		    if (!bool) {
			if (i < 1011088115 * anInt156 - 10
			    || i > 10 + (anInt156 * 1011088115
					 + Class593.anInt7631 * 1139603851)
			    || i_3_ < 904064679 * Class380.anInt5660 - 10
			    || i_3_ > (630071575 * LoadingScreenDef.anInt5500
				       + 904064679 * Class380.anInt5660 + 10))
			    Class198.method4036((byte) 4);
			else if (aBool171) {
			    int i_19_ = -1;
			    int i_20_ = -1;
			    for (int i_21_ = 0; i_21_ < -1887420811 * anInt149;
				 i_21_++) {
				if (aBool168) {
				    int i_22_
					= (1
					   + (20
					      + Class380.anInt5660 * 904064679
					      + (-351886683
						 * class639.anInt8258))
					   + i_21_ * (1149989507 * anInt164));
				    if (i_3_ > i_22_ - (class639.anInt8258
							* -351886683) - 1
					&& i_3_ < i_22_ + (class639.anInt8260
							   * 326424439)) {
					i_19_ = i_21_;
					i_20_ = (i_22_
						 - (-351886683
						    * class639.anInt8258)
						 - 1);
					break;
				    }
				} else {
				    int i_23_
					= (904064679 * Class380.anInt5660 + 31
					   + anInt164 * 1149989507 * i_21_);
				    if (i_3_ > i_23_ - 13
					&& i_3_ < 3 + i_23_) {
					i_19_ = i_21_;
					i_20_ = i_23_ - 13;
					break;
				    }
				}
			    }
			    if (i_19_ != -1) {
				int i_24_ = 0;
				Class427 class427
				    = new Class427(aClass410_152);
				for (Class241_Sub39_Sub10 class241_sub39_sub10
					 = ((Class241_Sub39_Sub10)
					    class427.method7585(-195706910));
				     null != class241_sub39_sub10;
				     class241_sub39_sub10
					 = ((Class241_Sub39_Sub10)
					    class427.next())) {
				    if (i_24_ == i_19_) {
					if ((1633676605
					     * (((Class241_Sub39_Sub10)
						 class241_sub39_sub10)
						.anInt10867))
					    > 1)
					    Class545.method11991
						(class241_sub39_sub10, i_20_,
						 (byte) 6);
					break;
				    }
				    i_24_++;
				}
			    }
			}
		    }
		}
	    } else {
		boolean bool
		    = Class482.method11024((ClanChannelUser.aClass499_5588
					    .anInterface54_6563),
					   class241_sub24, 1908001291);
		boolean bool_25_
		    = Class482.method11024((ClanChannelUser.aClass499_5588
					    .anInterface54_6555),
					   class241_sub24, 1908001291);
		boolean bool_26_
		    = Class482.method11024((ClanChannelUser.aClass499_5588
					    .anInterface54_6556),
					   class241_sub24, 1908001291);
		if ((bool || bool_25_)
		    && ((-1306008071 * client.anInt8456 == 1
			 && anInt148 * 1327183635 > 2)
			|| ClientScriptCaller.method14988(-97109458)))
		    bool_26_ = true;
		if (bool_26_ && anInt148 * 1327183635 > 0) {
		    if (null == client.aClass58_8365
			&& 0 == 789980605 * client.anInt8439)
			Class630.method13488(i, i_3_, (byte) 26);
		    else
			anInt138 = -309280838;
		} else if (bool_25_) {
		    if (Class478.aClass241_Sub39_Sub11_6402 != null)
			Class47.method1135(Class478.aClass241_Sub39_Sub11_6402,
					   i, i_3_, 643272318);
		} else if (bool) {
		    if (Class125.aClass241_Sub39_Sub11_1582 != null) {
			boolean bool_27_
			    = (client.aClass58_8365 != null
			       || 789980605 * client.anInt8439 > 0);
			if (bool_27_) {
			    anInt138 = -154640419;
			    Class107.aClass241_Sub39_Sub11_1506
				= Class125.aClass241_Sub39_Sub11_1582;
			} else
			    Class47.method1135((Class125
						.aClass241_Sub39_Sub11_1582),
					       i, i_3_, 1938422561);
		    } else if (client.aBool8544)
			Class520.method11688(-2020378527);
		}
		if (null == client.aClass58_8365
		    && 789980605 * client.anInt8439 == 0) {
		    anInt138 = 0;
		    Class107.aClass241_Sub39_Sub11_1506 = null;
		}
	    }
	}
    }
    
    static void method722() {
	if (client.anInt8352 * 2040707973 < 0) {
	    Class639 class639 = OnlineStatus.method7519(1925594627);
	    if (!aBool141)
		aBool171 = ((anInt162 * -267152011 != -1
			     && 1327183635 * anInt148 >= anInt162 * -267152011)
			    || (1327183635 * anInt148 * (anInt164 * 1149989507)
				+ (aBool168 ? 26
				   : 22)) > 963058943 * Class67.canvasHei);
	    aClass429_153.method7652((byte) 104);
	    aClass429_154.method7652((byte) 49);
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7694(16711935));
		 class241_sub39_sub11 != null;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7692(1359303879))) {
		int i
		    = (((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10879
		       * -142243581);
		if (i < 1000) {
		    class241_sub39_sub11.remove((byte) 36);
		    if (59 == i || 2 == i || 8 == i || i == 17 || i == 15
			|| i == 16 || 58 == i)
			aClass429_154.addNode(class241_sub39_sub11,
						 (short) -26019);
		    else
			aClass429_153.addNode(class241_sub39_sub11,
						 (short) -20495);
		}
	    }
	    aClass429_153.method7633(aClass429_150, -1212442142);
	    aClass429_154.method7633(aClass429_150, -1212442142);
	    if (anInt148 * 1327183635 > 1) {
		if (SparseVarDomain.method3110((byte) -38)
		    && 1327183635 * anInt148 > 2)
		    Class125.aClass241_Sub39_Sub11_1582
			= (Class241_Sub39_Sub11) (aClass429_150.aClass241_6093
						  .nextNode
						  .nextNode);
		else
		    Class125.aClass241_Sub39_Sub11_1582
			= ((Class241_Sub39_Sub11)
			   aClass429_150.aClass241_6093.nextNode);
		Class540.aClass241_Sub39_Sub11_7002
		    = ((Class241_Sub39_Sub11)
		       aClass429_150.aClass241_6093.nextNode);
		if (1327183635 * anInt148 > 2)
		    Class478.aClass241_Sub39_Sub11_6402
			= ((Class241_Sub39_Sub11)
			   Class540.aClass241_Sub39_Sub11_7002.nextNode);
		else
		    Class478.aClass241_Sub39_Sub11_6402 = null;
	    } else {
		Class125.aClass241_Sub39_Sub11_1582 = null;
		Class540.aClass241_Sub39_Sub11_7002 = null;
		Class478.aClass241_Sub39_Sub11_6402 = null;
	    }
	    Class241_Sub24 class241_sub24
		= (Class241_Sub24) client.aClass429_8311.method7694(16711935);
	    int i;
	    int i_28_;
	    if (null != class241_sub24) {
		i = class241_sub24.getX((byte) 43);
		i_28_ = class241_sub24.getY((byte) 4);
	    } else {
		i = Class106.aClass580_1503.method12718(1457388599);
		i_28_ = Class106.aClass580_1503.method12740((byte) -26);
	    }
	    if (aBool141) {
		if (Class482.method11024((ClanChannelUser.aClass499_5588
					  .anInterface54_6554),
					 class241_sub24, 1908001291)) {
		    if (null != aClass241_Sub39_Sub10_143
			&& i >= Class193.anInt2298 * 1955430821
			&& i <= (Class193.anInt2298 * 1955430821
				 + -885853667 * anInt147)
			&& i_28_ >= 282057643 * Class4.anInt16
			&& i_28_ <= (282057643 * Class4.anInt16
				     + -950722911 * Class395.anInt5784)) {
			int i_29_ = -1;
			for (int i_30_ = 0;
			     i_30_ < 1633676605 * (((Class241_Sub39_Sub10)
						    aClass241_Sub39_Sub10_143)
						   .anInt10867);
			     i_30_++) {
			    if (aBool168) {
				int i_31_
				    = (-351886683 * class639.anInt8258
				       + (282057643 * Class4.anInt16 + 20) + 1
				       + i_30_ * (anInt164 * 1149989507));
				if (i_28_ > (i_31_
					     - -351886683 * class639.anInt8258
					     - 1)
				    && i_28_ < i_31_ + (class639.anInt8260
							* 326424439))
				    i_29_ = i_30_;
			    } else {
				int i_32_
				    = (i_30_ * (1149989507 * anInt164)
				       + (31 + 282057643 * Class4.anInt16));
				if (i_28_ > i_32_ - 13 && i_28_ < 3 + i_32_)
				    i_29_ = i_30_;
			    }
			}
			if (-1 != i_29_) {
			    int i_33_ = 0;
			    Class427 class427
				= new Class427(((Class241_Sub39_Sub10)
						aClass241_Sub39_Sub10_143)
					       .aClass410_10866);
			    for (Class241_Sub39_Sub11 class241_sub39_sub11
				     = ((Class241_Sub39_Sub11)
					class427.method7585(392872326));
				 class241_sub39_sub11 != null;
				 class241_sub39_sub11 = ((Class241_Sub39_Sub11)
							 class427.next())) {
				if (i_33_ == i_29_) {
				    Class47.method1135(class241_sub39_sub11, i,
						       i_28_, -1691772034);
				    break;
				}
				i_33_++;
			    }
			}
			Class198.method4036((byte) 4);
		    } else if (i >= anInt156 * 1011088115
			       && i <= (anInt156 * 1011088115
					+ Class593.anInt7631 * 1139603851)
			       && i_28_ >= 904064679 * Class380.anInt5660
			       && (i_28_
				   <= (630071575 * LoadingScreenDef.anInt5500
				       + 904064679 * Class380.anInt5660))) {
			if (!aBool171) {
			    int i_34_ = -1;
			    for (int i_35_ = 0; i_35_ < 1327183635 * anInt148;
				 i_35_++) {
				if (aBool168) {
				    int i_36_
					= ((1149989507 * anInt164
					    * (1327183635 * anInt148 - 1
					       - i_35_))
					   + (1 + (20
						   + (904064679
						      * Class380.anInt5660)
						   + (class639.anInt8258
						      * -351886683))));
				    if ((i_28_
					 > (i_36_
					    - -351886683 * class639.anInt8258
					    - 1))
					&& (i_28_
					    < i_36_ + (326424439
						       * class639.anInt8260)))
					i_34_ = i_35_;
				} else {
				    int i_37_
					= (31 + 904064679 * Class380.anInt5660
					   + (anInt164 * 1149989507
					      * (anInt148 * 1327183635 - 1
						 - i_35_)));
				    if (i_28_ > i_37_ - 13
					&& i_28_ < 3 + i_37_)
					i_34_ = i_35_;
				}
			    }
			    if (-1 != i_34_) {
				int i_38_ = 0;
				Class443 class443
				    = new Class443(aClass429_150);
				for (Class241_Sub39_Sub11 class241_sub39_sub11
					 = ((Class241_Sub39_Sub11)
					    class443.method7865(-1726837975));
				     class241_sub39_sub11 != null;
				     class241_sub39_sub11
					 = ((Class241_Sub39_Sub11)
					    class443.next())) {
				    if (i_38_ == i_34_) {
					Class47.method1135
					    (class241_sub39_sub11, i, i_28_,
					     165019447);
					break;
				    }
				    i_38_++;
				}
			    }
			    Class198.method4036((byte) 4);
			} else {
			    int i_39_ = -1;
			    for (int i_40_ = 0; i_40_ < anInt149 * -1887420811;
				 i_40_++) {
				if (aBool168) {
				    int i_41_ = (anInt164 * 1149989507 * i_40_
						 + (1 + ((-351886683
							  * class639.anInt8258)
							 + ((Class380.anInt5660
							     * 904064679)
							    + 20))));
				    if ((i_28_
					 > (i_41_
					    - -351886683 * class639.anInt8258
					    - 1))
					&& i_28_ < (class639.anInt8260
						    * 326424439) + i_41_) {
					i_39_ = i_40_;
					break;
				    }
				} else {
				    int i_42_
					= (i_40_ * (anInt164 * 1149989507)
					   + (31 + (904064679
						    * Class380.anInt5660)));
				    if (i_28_ > i_42_ - 13
					&& i_28_ < i_42_ + 3) {
					i_39_ = i_40_;
					break;
				    }
				}
			    }
			    if (-1 != i_39_) {
				int i_43_ = 0;
				Class427 class427
				    = new Class427(aClass410_152);
				for (Class241_Sub39_Sub10 class241_sub39_sub10
					 = ((Class241_Sub39_Sub10)
					    class427.method7585(867231359));
				     null != class241_sub39_sub10;
				     class241_sub39_sub10
					 = ((Class241_Sub39_Sub10)
					    class427.next())) {
				    if (i_43_ == i_39_) {
					Class47.method1135
					    (((Class241_Sub39_Sub11)
					      (((Class241_Sub39_Sub10)
						class241_sub39_sub10)
					       .aClass410_10866
					       .aClass241_Sub39_5934
					       .aClass241_Sub39_10148)),
					     i, i_28_, -441705966);
					Class198.method4036((byte) 4);
					break;
				    }
				    i_43_++;
				}
			    }
			}
		    }
		} else {
		    boolean bool = false;
		    if (aClass241_Sub39_Sub10_143 != null) {
			if (i < 1955430821 * Class193.anInt2298 - 10
			    || i > (Class193.anInt2298 * 1955430821
				    + -885853667 * anInt147 + 10)
			    || i_28_ < 282057643 * Class4.anInt16 - 10
			    || i_28_ > (-950722911 * Class395.anInt5784
					+ Class4.anInt16 * 282057643 + 10))
			    Class211.method4281((byte) -109);
			else
			    bool = true;
		    }
		    if (!bool) {
			if (i < 1011088115 * anInt156 - 10
			    || i > 10 + (anInt156 * 1011088115
					 + Class593.anInt7631 * 1139603851)
			    || i_28_ < 904064679 * Class380.anInt5660 - 10
			    || i_28_ > (630071575 * LoadingScreenDef.anInt5500
					+ 904064679 * Class380.anInt5660 + 10))
			    Class198.method4036((byte) 4);
			else if (aBool171) {
			    int i_44_ = -1;
			    int i_45_ = -1;
			    for (int i_46_ = 0; i_46_ < -1887420811 * anInt149;
				 i_46_++) {
				if (aBool168) {
				    int i_47_
					= (1
					   + (20
					      + Class380.anInt5660 * 904064679
					      + (-351886683
						 * class639.anInt8258))
					   + i_46_ * (1149989507 * anInt164));
				    if (i_28_ > i_47_ - (class639.anInt8258
							 * -351886683) - 1
					&& i_28_ < i_47_ + (class639.anInt8260
							    * 326424439)) {
					i_44_ = i_46_;
					i_45_ = (i_47_
						 - (-351886683
						    * class639.anInt8258)
						 - 1);
					break;
				    }
				} else {
				    int i_48_
					= (904064679 * Class380.anInt5660 + 31
					   + anInt164 * 1149989507 * i_46_);
				    if (i_28_ > i_48_ - 13
					&& i_28_ < 3 + i_48_) {
					i_44_ = i_46_;
					i_45_ = i_48_ - 13;
					break;
				    }
				}
			    }
			    if (i_44_ != -1) {
				int i_49_ = 0;
				Class427 class427
				    = new Class427(aClass410_152);
				for (Class241_Sub39_Sub10 class241_sub39_sub10
					 = ((Class241_Sub39_Sub10)
					    class427.method7585(1996545400));
				     null != class241_sub39_sub10;
				     class241_sub39_sub10
					 = ((Class241_Sub39_Sub10)
					    class427.next())) {
				    if (i_49_ == i_44_) {
					if ((1633676605
					     * (((Class241_Sub39_Sub10)
						 class241_sub39_sub10)
						.anInt10867))
					    > 1)
					    Class545.method11991
						(class241_sub39_sub10, i_45_,
						 (byte) 6);
					break;
				    }
				    i_49_++;
				}
			    }
			}
		    }
		}
	    } else {
		boolean bool
		    = Class482.method11024((ClanChannelUser.aClass499_5588
					    .anInterface54_6563),
					   class241_sub24, 1908001291);
		boolean bool_50_
		    = Class482.method11024((ClanChannelUser.aClass499_5588
					    .anInterface54_6555),
					   class241_sub24, 1908001291);
		boolean bool_51_
		    = Class482.method11024((ClanChannelUser.aClass499_5588
					    .anInterface54_6556),
					   class241_sub24, 1908001291);
		if ((bool || bool_50_)
		    && ((-1306008071 * client.anInt8456 == 1
			 && anInt148 * 1327183635 > 2)
			|| ClientScriptCaller.method14988(1129684383)))
		    bool_51_ = true;
		if (bool_51_ && anInt148 * 1327183635 > 0) {
		    if (null == client.aClass58_8365
			&& 0 == 789980605 * client.anInt8439)
			Class630.method13488(i, i_28_, (byte) 35);
		    else
			anInt138 = -309280838;
		} else if (bool_50_) {
		    if (Class478.aClass241_Sub39_Sub11_6402 != null)
			Class47.method1135(Class478.aClass241_Sub39_Sub11_6402,
					   i, i_28_, -1331801235);
		} else if (bool) {
		    if (Class125.aClass241_Sub39_Sub11_1582 != null) {
			boolean bool_52_
			    = (client.aClass58_8365 != null
			       || 789980605 * client.anInt8439 > 0);
			if (bool_52_) {
			    anInt138 = -154640419;
			    Class107.aClass241_Sub39_Sub11_1506
				= Class125.aClass241_Sub39_Sub11_1582;
			} else
			    Class47.method1135((Class125
						.aClass241_Sub39_Sub11_1582),
					       i, i_28_, -698510412);
		    } else if (client.aBool8544)
			Class520.method11688(-1866966700);
		}
		if (null == client.aClass58_8365
		    && 789980605 * client.anInt8439 == 0) {
		    anInt138 = 0;
		    Class107.aClass241_Sub39_Sub11_1506 = null;
		}
	    }
	}
    }
    
    static boolean method723() {
	if (Class540.aClass241_Sub39_Sub11_7002 == null)
	    return false;
	if ((((Class241_Sub39_Sub11) Class540.aClass241_Sub39_Sub11_7002)
	     .anInt10879) * -142243581
	    >= 2000)
	    ((Class241_Sub39_Sub11) Class540.aClass241_Sub39_Sub11_7002)
		.anInt10879
		-= 1938130928;
	if ((((Class241_Sub39_Sub11) Class540.aClass241_Sub39_Sub11_7002)
	     .anInt10879) * -142243581
	    == 1007)
	    return true;
	return false;
    }
    
    static void method724(int i, int i_53_) {
	if (Class128.aClass513_1589.aBool6714
	    || (1327183635 * anInt148 != 1
		&& (!Class120_Sub18.aBool10606 || 2 != anInt148 * 1327183635
		    || !(((Class241_Sub39_Sub11)
			  Class540.aClass241_Sub39_Sub11_7002)
			     .aString10871.equals
			 (ClientMessage.FACEHERE.getLocalisedMessage
			  (VarPlayerDomain.currentLocale, (short) 20466)))))) {
	    Class639 class639 = OnlineStatus.method7519(1817223268);
	    int i_54_
		= (class639.method13562
		   (ClientMessage.CHOOSEOPTION
			.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 25842),
		    (byte) 71));
	    int i_55_;
	    if (!aBool171) {
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    aClass429_150.method7694(16711935));
		     class241_sub39_sub11 != null;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    aClass429_150.method7692(665456539))) {
		    int i_56_ = Class277.method5374(class241_sub39_sub11,
						    class639, (byte) 83);
		    if (i_56_ > i_54_)
			i_54_ = i_56_;
		}
		i_54_ += 8;
		i_55_ = 21 + anInt148 * 1327183635 * (1149989507 * anInt164);
		LoadingScreenDef.anInt5500
		    = -1996937561 * ((aBool168 ? 26 : 22)
				     + anInt148 * 1327183635 * (anInt164
								* 1149989507));
	    } else {
		for (Class241_Sub39_Sub10 class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7440(-1397088259));
		     null != class241_sub39_sub10;
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7435((byte) -1))) {
		    int i_57_;
		    if (1 == 1633676605 * ((Class241_Sub39_Sub10)
					   class241_sub39_sub10).anInt10867)
			i_57_ = Class277.method5374(((Class241_Sub39_Sub11)
						     (((Class241_Sub39_Sub10)
						       class241_sub39_sub10)
						      .aClass410_10866
						      .aClass241_Sub39_5934
						      .aClass241_Sub39_10148)),
						    class639, (byte) -54);
		    else
			i_57_ = Class106.method2677(class241_sub39_sub10,
						    class639, 48019651);
		    if (i_57_ > i_54_)
			i_54_ = i_57_;
		}
		i_54_ += 8;
		i_55_ = 1149989507 * anInt164 * (-1887420811 * anInt149) + 21;
		LoadingScreenDef.anInt5500
		    = (anInt149 * -1887420811 * (1149989507 * anInt164)
		       + (aBool168 ? 26 : 22)) * -1996937561;
	    }
	    i_54_ += 10;
	    int i_58_ = i - i_54_ / 2;
	    if (i_58_ + i_54_ > -1080559003 * Class494.canvasWid)
		i_58_ = Class494.canvasWid * -1080559003 - i_54_;
	    if (i_58_ < 0)
		i_58_ = 0;
	    int i_59_ = i_53_;
	    if (i_59_ + i_55_ > Class67.canvasHei * 963058943)
		i_59_ = 963058943 * Class67.canvasHei - i_55_;
	    if (i_59_ < 0)
		i_59_ = 0;
	    anInt156 = i_58_ * -1574130117;
	    Class380.anInt5660 = i_59_ * 71817495;
	    Class593.anInt7631 = -1038752221 * i_54_;
	    anInt144 = (int) (Math.random() * 24.0) * -276059845;
	    aBool141 = true;
	}
    }
    
    static void method725() {
	if (null != aClass241_Sub39_Sub10_143) {
	    aClass241_Sub39_Sub10_143 = null;
	    Class579.method12709(Class193.anInt2298 * 1955430821,
				 282057643 * Class4.anInt16,
				 anInt147 * -885853667,
				 Class395.anInt5784 * -950722911, (byte) -49);
	}
    }
    
    static Class241_Sub27 method726(int i, int i_60_, int i_61_) {
	Class241_Sub27 class241_sub27 = null;
	if (0 == i_61_)
	    class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.WALKING_PACKET,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	if (1 == i_61_)
	    class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.MINI_WALKING_PACKET,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	class241_sub27.data
	    .writeShortA(class522.baseX * 127679513 + i, -1663017108);
	class241_sub27.data
	    .writeLEShortA(class522.baseY * 468558693 + i_60_, (byte) -15);
	class241_sub27.data.writeByteA
	    (InvType.isForceRun(1319366149) ? 1 : 0, 2116383542);
	Class194.minimapFlagX = -980260023 * i;
	Class194.minimapFlagY = i_60_ * -1262506991;
	Class194.aBool2302 = false;
	Class41.method1064(-756111412);
	return class241_sub27;
    }
    
    static void method727(Class103 class103) {
	if (null != aClass268_165) {
	    class103.method2309(aClass268_165);
	    class103.method2512(aClass266_167);
	    class103.method2445(anInt135 * 470717791, anInt177 * 1133839679,
				anInt135 * 470717791 + -1801164387 * anInt163,
				1914791371 * anInt181 + anInt177 * 1133839679);
	    class103.method2254(470717791 * anInt135, 1133839679 * anInt177,
				anInt163 * -1801164387, anInt181 * 1914791371);
	}
    }
    
    static void method728(int i, int i_62_) {
	if (Class128.aClass513_1589.aBool6714
	    || (1327183635 * anInt148 != 1
		&& (!Class120_Sub18.aBool10606 || 2 != anInt148 * 1327183635
		    || !(((Class241_Sub39_Sub11)
			  Class540.aClass241_Sub39_Sub11_7002)
			     .aString10871.equals
			 (ClientMessage.FACEHERE.getLocalisedMessage
			  (VarPlayerDomain.currentLocale, (short) 30328)))))) {
	    Class639 class639 = OnlineStatus.method7519(1948174440);
	    int i_63_
		= (class639.method13562
		   (ClientMessage.CHOOSEOPTION
			.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 18376),
		    (byte) 24));
	    int i_64_;
	    if (!aBool171) {
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    aClass429_150.method7694(16711935));
		     class241_sub39_sub11 != null;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    aClass429_150.method7692(1533596783))) {
		    int i_65_ = Class277.method5374(class241_sub39_sub11,
						    class639, (byte) -87);
		    if (i_65_ > i_63_)
			i_63_ = i_65_;
		}
		i_63_ += 8;
		i_64_ = 21 + anInt148 * 1327183635 * (1149989507 * anInt164);
		LoadingScreenDef.anInt5500
		    = -1996937561 * ((aBool168 ? 26 : 22)
				     + anInt148 * 1327183635 * (anInt164
								* 1149989507));
	    } else {
		for (Class241_Sub39_Sub10 class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7440(-1397088259));
		     null != class241_sub39_sub10;
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7435((byte) -1))) {
		    int i_66_;
		    if (1 == 1633676605 * ((Class241_Sub39_Sub10)
					   class241_sub39_sub10).anInt10867)
			i_66_ = Class277.method5374(((Class241_Sub39_Sub11)
						     (((Class241_Sub39_Sub10)
						       class241_sub39_sub10)
						      .aClass410_10866
						      .aClass241_Sub39_5934
						      .aClass241_Sub39_10148)),
						    class639, (byte) -78);
		    else
			i_66_ = Class106.method2677(class241_sub39_sub10,
						    class639, -1459898928);
		    if (i_66_ > i_63_)
			i_63_ = i_66_;
		}
		i_63_ += 8;
		i_64_ = 1149989507 * anInt164 * (-1887420811 * anInt149) + 21;
		LoadingScreenDef.anInt5500
		    = (anInt149 * -1887420811 * (1149989507 * anInt164)
		       + (aBool168 ? 26 : 22)) * -1996937561;
	    }
	    i_63_ += 10;
	    int i_67_ = i - i_63_ / 2;
	    if (i_67_ + i_63_ > -1080559003 * Class494.canvasWid)
		i_67_ = Class494.canvasWid * -1080559003 - i_63_;
	    if (i_67_ < 0)
		i_67_ = 0;
	    int i_68_ = i_62_;
	    if (i_68_ + i_64_ > Class67.canvasHei * 963058943)
		i_68_ = 963058943 * Class67.canvasHei - i_64_;
	    if (i_68_ < 0)
		i_68_ = 0;
	    anInt156 = i_67_ * -1574130117;
	    Class380.anInt5660 = i_68_ * 71817495;
	    Class593.anInt7631 = -1038752221 * i_63_;
	    anInt144 = (int) (Math.random() * 24.0) * -276059845;
	    aBool141 = true;
	}
    }
    
    static Class639 method729() {
	Class639 class639;
	if (aBool168) {
	    if (Class445_Sub12.aClass96_8651 != null
		&& Class175.aClass639_2122 != null)
		class639 = Class175.aClass639_2122;
	    else
		class639 = Class5.aClass639_19;
	} else
	    class639 = Class5.aClass639_19;
	anInt164 = (class639.anInt8258 * -1171100233
		    + class639.anInt8260 * -583473923);
	return class639;
    }
    
    static Class639 method730() {
	Class639 class639;
	if (aBool168) {
	    if (Class445_Sub12.aClass96_8651 != null
		&& Class175.aClass639_2122 != null)
		class639 = Class175.aClass639_2122;
	    else
		class639 = Class5.aClass639_19;
	} else
	    class639 = Class5.aClass639_19;
	anInt164 = (class639.anInt8258 * -1171100233
		    + class639.anInt8260 * -583473923);
	return class639;
    }
    
    public static void method731() {
	Class211.method4281((byte) -79);
	aBool141 = false;
	Class579.method12709(1011088115 * anInt156,
			     Class380.anInt5660 * 904064679,
			     Class593.anInt7631 * 1139603851,
			     LoadingScreenDef.anInt5500 * 630071575, (byte) -44);
	Class125.aClass241_Sub39_Sub11_1582 = null;
	Class478.aClass241_Sub39_Sub11_6402 = null;
    }
    
    static void method732
	(Player class475_sub1_sub1_sub3_sub1,
	 boolean bool) {
	if (1327183635 * anInt148 < 410) {
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
			     (Class338.method6112(16777215, 645617324)).append
			     (ClientMessage.SELF.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 30761))
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
		    boolean bool_69_ = true;
		    if (-1 != (Class21.myPlayer
			       .anInt11504) * -870747707
			&& -1 != (class475_sub1_sub1_sub3_sub1.anInt11504
				  * -870747707)) {
			int i
			    = (((Class21.myPlayer
				 .anInt11504) * -870747707
				< (class475_sub1_sub1_sub3_sub1.anInt11504
				   * -870747707))
			       ? (-870747707
				  * (Class21.myPlayer
				     .anInt11504))
			       : (-870747707
				  * class475_sub1_sub1_sub3_sub1.anInt11504));
			int i_70_
			    = ((-1617461639
				* (Class21.myPlayer
				   .anInt11502))
			       - (-1617461639
				  * class475_sub1_sub1_sub3_sub1.anInt11502));
			if (i_70_ < 0)
			    i_70_ = -i_70_;
			if (i_70_ > i)
			    bool_69_ = false;
		    }
		    String string_71_
			= (GameDefinition.STELLARDAWN == client.currentGame
			   ? (ClientMessage.RATING.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 31005))
			   : (ClientMessage.LEVEL.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 23056)));
		    if (-1617461639 * class475_sub1_sub1_sub3_sub1.anInt11502
			>= (-1238039071
			    * class475_sub1_sub1_sub3_sub1.anInt11503))
			string
			    = new StringBuilder().append
				  (class475_sub1_sub1_sub3_sub1
				       .getFormattedName(true, 669836231))
				  .append
				  (bool_69_
				   ? (Class410.method7458
				      ((-1617461639
					* (class475_sub1_sub1_sub3_sub1
					   .anInt11502)),
				       (-1617461639
					* (Class21
					   .myPlayer
					   .anInt11502)),
				       (byte) 36))
				   : Class338.method6112(16777215,
							 -1021492816))
				  .append
				  (Class6.aString29).append
				  (string_71_).append
				  (-1617461639
				   * class475_sub1_sub1_sub3_sub1.anInt11502)
				  .append
				  (Class6.aString32).toString();
		    else
			string
			    = new StringBuilder().append
				  (class475_sub1_sub1_sub3_sub1
				       .getFormattedName(true, -1016724813))
				  .append
				  (bool_69_
				   ? (Class410.method7458
				      ((class475_sub1_sub1_sub3_sub1.anInt11502
					* -1617461639),
				       (Class21
					.myPlayer
					.anInt11502) * -1617461639,
				       (byte) 31))
				   : Class338.method6112(16777215, 1305835828))
				  .append
				  (Class6.aString29).append
				  (string_71_).append
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
		    string = class475_sub1_sub1_sub3_sub1
				 .getFormattedName(true, -1674803365);
		else
		    string = new StringBuilder().append
				 (class475_sub1_sub1_sub3_sub1
				      .getFormattedName(true, -1925717897))
				 .append
				 (Class6.aString29).append
				 (ClientMessage.SKILL.getLocalisedMessage
				  (VarPlayerDomain.currentLocale, (short) 24259))
				 .append
				 (1682998611
				  * class475_sub1_sub1_sub3_sub1.anInt11516)
				 .append
				 (Class6.aString32).toString();
		boolean bool_72_ = false;
		if (-1 != -614581637 * (class475_sub1_sub1_sub3_sub1
					.aClass490_11499.anInt6508)) {
		    NPCDefinition class401
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   ((class475_sub1_sub1_sub3_sub1.aClass490_11499
			     .anInt6508) * -614581637,
			    -621049052));
		    if (class401.aBool5871) {
			bool_72_ = true;
			string = (MasterIndex.npcDefLoader.getNpcDefinition
				  (-614581637 * (class475_sub1_sub1_sub3_sub1
						 .aClass490_11499.anInt6508),
				   -682234229)
				  .name);
			if (0 != class401.combatLevel * 8317645) {
			    String string_73_
				= ((client.currentGame
				    == GameDefinition.STELLARDAWN)
				   ? (ClientMessage.RATING.getLocalisedMessage
				      (VarPlayerDomain.currentLocale, (short) 17084))
				   : (ClientMessage.LEVEL.getLocalisedMessage
				      (VarPlayerDomain.currentLocale,
				       (short) 24193)));
			    string
				= new StringBuilder().append(string).append
				      (Class410.method7458
				       (class401.combatLevel * 8317645,
					(-1617461639
					 * (Class21
					    .myPlayer
					    .anInt11502)),
					(byte) 70))
				      .append
				      (Class6.aString29).append
				      (string_73_).append
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
			     (Class338.method6112(16777215, -1831324458))
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
		    for (int i = 7; i >= 0; i--) {
			if (null != client.playerOptionMessages[i]) {
			    short i_74_ = 0;
			    if ((GameDefinition.RUNESCAPE
				 == client.currentGame)
				&& (client.playerOptionMessages[i].equalsIgnoreCase
				    (ClientMessage.ATTACK.getLocalisedMessage
				     (VarPlayerDomain.currentLocale,
				      (short) 16610)))) {
				if (client.aBool8444
				    && ((class475_sub1_sub1_sub3_sub1
					 .anInt11502) * -1617461639
					> (-1617461639
					   * (Class21
					      .myPlayer
					      .anInt11502))))
				    i_74_ = (short) 2000;
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
					i_74_ = (short) 2000;
				    else
					i_74_ = (short) 0;
				} else if (class475_sub1_sub1_sub3_sub1
					   .aBool11494)
				    i_74_ = (short) 2000;
			    } else if (client.aBoolArray8450[i])
				i_74_ = (short) 2000;
			    short i_75_
				= (short) (i_74_ + client.aShortArray8447[i]);
			    int i_76_ = (-1 != client.playerOptionCursors[i]
					 ? client.playerOptionCursors[i]
					 : 886936997 * client.anInt8387);
			    int i_77_ = bool_72_ ? 16776960 : 16777215;
			    Class534.method11882
				(client.playerOptionMessages[i],
				 new StringBuilder().append
				     (Class338.method6112(i_77_, -1149639297))
				     .append
				     (string).toString(),
				 i_76_, i_75_, -1,
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
		} else if (!bool_72_)
		    Class534.method11882(new StringBuilder().append
					     (Class338.method6112(13421772,
								  851721200))
					     .append
					     (string).toString(),
					 "", -1, -1, 0, 0L, 0, 0, false, true,
					 (long) ((class475_sub1_sub1_sub3_sub1
						  .entityIndex)
						 * -546698383),
					 false, -1236921043);
		if (!bool && !bool_72_) {
		    for (Class241_Sub39_Sub11 class241_sub39_sub11
			     = ((Class241_Sub39_Sub11)
				aClass429_150.method7694(16711935));
			 null != class241_sub39_sub11;
			 class241_sub39_sub11
			     = ((Class241_Sub39_Sub11)
				aClass429_150.method7692(323963441))) {
			if (23
			    == (((Class241_Sub39_Sub11) class241_sub39_sub11)
				.anInt10879) * -142243581) {
			    ((Class241_Sub39_Sub11) class241_sub39_sub11)
				.aString10880
				= new StringBuilder().append
				      (Class338.method6112(16777215,
							   1125425410))
				      .append
				      (string).toString();
			    break;
			}
		    }
		}
	    }
	}
    }
    
    static void method733() {
	if (null != aClass241_Sub39_Sub10_143) {
	    aClass241_Sub39_Sub10_143 = null;
	    Class579.method12709(Class193.anInt2298 * 1955430821,
				 282057643 * Class4.anInt16,
				 anInt147 * -885853667,
				 Class395.anInt5784 * -950722911, (byte) 16);
	}
    }
    
    static void method734() {
	if (null != aClass241_Sub39_Sub10_143) {
	    aClass241_Sub39_Sub10_143 = null;
	    Class579.method12709(Class193.anInt2298 * 1955430821,
				 282057643 * Class4.anInt16,
				 anInt147 * -885853667,
				 Class395.anInt5784 * -950722911, (byte) -70);
	}
    }
    
    static void method735() {
	if (null != aClass241_Sub39_Sub10_143) {
	    aClass241_Sub39_Sub10_143 = null;
	    Class579.method12709(Class193.anInt2298 * 1955430821,
				 282057643 * Class4.anInt16,
				 anInt147 * -885853667,
				 Class395.anInt5784 * -950722911, (byte) -8);
	}
    }
    
    static boolean method736(int i) {
	return (44 == i || 45 == i || i == 46 || 47 == i || i == 48 || 49 == i
		|| 50 == i || i == 51 || 52 == i || 53 == i || 15 == i);
    }
    
    static int method737() {
	if (client.aClass58_8365 == null) {
	    if (!aBool141) {
		if (ClanChannelUser.aClass499_5588.aBool6562) {
		    if (null != Class478.aClass241_Sub39_Sub11_6402)
			return (300310447
				* (((Class241_Sub39_Sub11)
				    Class478.aClass241_Sub39_Sub11_6402)
				   .cursorID));
		} else if (Class125.aClass241_Sub39_Sub11_1582 != null)
		    return (((Class241_Sub39_Sub11)
			     Class125.aClass241_Sub39_Sub11_1582).cursorID
			    * 300310447);
	    } else {
		Class639 class639 = OnlineStatus.method7519(1947047244);
		int i = Class106.aClass580_1503.method12718(253606850);
		int i_78_ = Class106.aClass580_1503.method12740((byte) -115);
		if (!aBool171) {
		    if (i > 1011088115 * anInt156
			&& i < (Class593.anInt7631 * 1139603851
				+ 1011088115 * anInt156)) {
			int i_79_ = -1;
			for (int i_80_ = 0; i_80_ < anInt148 * 1327183635;
			     i_80_++) {
			    if (aBool168) {
				int i_81_
				    = (Class380.anInt5660 * 904064679 + 20
				       + class639.anInt8258 * -351886683 + 1
				       + ((1327183635 * anInt148 - 1 - i_80_)
					  * (anInt164 * 1149989507)));
				if (i_78_ > (i_81_
					     - class639.anInt8258 * -351886683
					     - 1)
				    && i_78_ < (326424439 * class639.anInt8260
						+ i_81_))
				    i_79_ = i_80_;
			    } else {
				int i_82_
				    = (((anInt148 * 1327183635 - 1 - i_80_)
					* (anInt164 * 1149989507))
				       + (904064679 * Class380.anInt5660
					  + 31));
				if (i_78_ > (i_82_
					     - class639.anInt8258 * -351886683
					     - 1)
				    && i_78_ < (class639.anInt8260 * 326424439
						+ i_82_))
				    i_79_ = i_80_;
			    }
			}
			if (i_79_ != -1) {
			    int i_83_ = 0;
			    Class443 class443 = new Class443(aClass429_150);
			    for (Class241_Sub39_Sub11 class241_sub39_sub11
				     = ((Class241_Sub39_Sub11)
					class443.method7865(1334590687));
				 null != class241_sub39_sub11;
				 class241_sub39_sub11 = ((Class241_Sub39_Sub11)
							 class443.next())) {
				if (i_83_++ == i_79_)
				    return (((Class241_Sub39_Sub11)
					     class241_sub39_sub11).cursorID
					    * 300310447);
			    }
			}
		    }
		} else if (i > anInt156 * 1011088115
			   && i < (1139603851 * Class593.anInt7631
				   + 1011088115 * anInt156)) {
		    int i_84_ = -1;
		    for (int i_85_ = 0; i_85_ < -1887420811 * anInt149;
			 i_85_++) {
			if (aBool168) {
			    int i_86_
				= (-351886683 * class639.anInt8258
				   + (904064679 * Class380.anInt5660 + 20) + 1
				   + i_85_ * (anInt164 * 1149989507));
			    if ((i_78_
				 > i_86_ - class639.anInt8258 * -351886683 - 1)
				&& (i_78_
				    < class639.anInt8260 * 326424439 + i_86_))
				i_84_ = i_85_;
			} else {
			    int i_87_ = (904064679 * Class380.anInt5660 + 31
					 + i_85_ * (1149989507 * anInt164));
			    if ((i_78_
				 > i_87_ - class639.anInt8258 * -351886683 - 1)
				&& (i_78_
				    < i_87_ + class639.anInt8260 * 326424439))
				i_84_ = i_85_;
			}
		    }
		    if (i_84_ != -1) {
			int i_88_ = 0;
			Class427 class427 = new Class427(aClass410_152);
			for (Class241_Sub39_Sub10 class241_sub39_sub10
				 = ((Class241_Sub39_Sub10)
				    class427.method7585(842912024));
			     class241_sub39_sub10 != null;
			     class241_sub39_sub10
				 = (Class241_Sub39_Sub10) class427.next()) {
			    if (i_88_++ == i_84_)
				return (((Class241_Sub39_Sub11)
					 (Class241_Sub39_Sub11)
					 (((Class241_Sub39_Sub10)
					   class241_sub39_sub10)
					  .aClass410_10866.aClass241_Sub39_5934
					  .aClass241_Sub39_10148)).cursorID
					* 300310447);
			}
		    }
		} else if (null != aClass241_Sub39_Sub10_143
			   && i > 1955430821 * Class193.anInt2298
			   && i < (Class193.anInt2298 * 1955430821
				   + -885853667 * anInt147)) {
		    int i_89_ = -1;
		    for (int i_90_ = 0;
			 (i_90_
			  < (((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
			     .anInt10867) * 1633676605);
			 i_90_++) {
			if (aBool168) {
			    int i_91_
				= (1149989507 * anInt164 * i_90_
				   + (1 + (-351886683 * class639.anInt8258
					   + (20
					      + 282057643 * Class4.anInt16))));
			    if ((i_78_
				 > i_91_ - class639.anInt8258 * -351886683 - 1)
				&& (i_78_
				    < i_91_ + 326424439 * class639.anInt8260))
				i_89_ = i_90_;
			} else {
			    int i_92_ = (1149989507 * anInt164 * i_90_
					 + (Class4.anInt16 * 282057643 + 31));
			    if ((i_78_
				 > i_92_ - class639.anInt8258 * -351886683 - 1)
				&& (i_78_
				    < i_92_ + 326424439 * class639.anInt8260))
				i_89_ = i_90_;
			}
		    }
		    if (-1 != i_89_) {
			int i_93_ = 0;
			Class427 class427
			    = new Class427(((Class241_Sub39_Sub10)
					    aClass241_Sub39_Sub10_143)
					   .aClass410_10866);
			for (Class241_Sub39_Sub11 class241_sub39_sub11
				 = ((Class241_Sub39_Sub11)
				    class427.method7585(215063772));
			     null != class241_sub39_sub11;
			     class241_sub39_sub11
				 = (Class241_Sub39_Sub11) class427.next()) {
			    if (i_93_++ == i_89_)
				return (((Class241_Sub39_Sub11)
					 class241_sub39_sub11).cursorID
					* 300310447);
			}
		    }
		}
	    }
	}
	return -1;
    }
    
    static void method738(String string, String string_94_, int i, int i_95_,
			  int i_96_, long l, int i_97_, int i_98_,
			  boolean bool, boolean bool_99_, long l_100_,
			  boolean bool_101_) {
	if (!aBool141 && anInt148 * 1327183635 < 506) {
	    i = i != -1 ? i : client.anInt8458 * 12960807;
	    Class241_Sub39_Sub11 class241_sub39_sub11
		= new Class241_Sub39_Sub11(string, string_94_, i, i_95_, i_96_,
					   l, i_97_, i_98_, bool, bool_99_,
					   l_100_, bool_101_);
	    Class355.method6437(class241_sub39_sub11, 698780639);
	}
    }
    
    static int method739(Class241_Sub39_Sub10 class241_sub39_sub10,
			 Class639 class639) {
	String string = Class334.method6068(class241_sub39_sub10, -2015950554);
	return class639.method13579(string, Class133.aClass168Array1613,
				    1190536090);
    }
    
    static void method740(String string, String string_102_, int i, int i_103_,
			  int i_104_, long l, int i_105_, int i_106_,
			  boolean bool, boolean bool_107_, long l_108_,
			  boolean bool_109_) {
	if (!aBool141 && anInt148 * 1327183635 < 506) {
	    i = i != -1 ? i : client.anInt8458 * 12960807;
	    Class241_Sub39_Sub11 class241_sub39_sub11
		= new Class241_Sub39_Sub11(string, string_102_, i, i_103_,
					   i_104_, l, i_105_, i_106_, bool,
					   bool_107_, l_108_, bool_109_);
	    Class355.method6437(class241_sub39_sub11, 832283639);
	}
    }
    
    static void method741(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (class241_sub39_sub11 != null) {
	    aClass429_150.addNode(class241_sub39_sub11, (short) -18935);
	    anInt148 += 431696667;
	    Object object = null;
	    Class241_Sub39_Sub10 class241_sub39_sub10;
	    if (!((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10878
		&& !"".equals(((Class241_Sub39_Sub11) class241_sub39_sub11)
			      .aString10869)) {
		long l = (544876251290631095L
			  * (((Class241_Sub39_Sub11) class241_sub39_sub11)
			     .aLong10872));
		for (class241_sub39_sub10
			 = (Class241_Sub39_Sub10) aClass407_180.get(l);
		     (class241_sub39_sub10 != null
		      && !(((Class241_Sub39_Sub10) class241_sub39_sub10)
			       .aString10865.equals
			   (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aString10869)));
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass407_180.method7289((byte) -81))) {
		    /* empty */
		}
		if (null == class241_sub39_sub10) {
		    class241_sub39_sub10
			= (Class241_Sub39_Sub10) aClass129_155.get(l);
		    if (null != class241_sub39_sub10
			&& !(((Class241_Sub39_Sub10) class241_sub39_sub10)
				 .aString10865.equals
			     (((Class241_Sub39_Sub11) class241_sub39_sub11)
			      .aString10869)))
			class241_sub39_sub10 = null;
		    if (class241_sub39_sub10 == null)
			class241_sub39_sub10
			    = new Class241_Sub39_Sub10(((Class241_Sub39_Sub11)
							class241_sub39_sub11)
						       .aString10869);
		    aClass407_180.put(class241_sub39_sub10, l);
		    anInt149 += -1884741155;
		}
	    } else {
		class241_sub39_sub10
		    = new Class241_Sub39_Sub10(((Class241_Sub39_Sub11)
						class241_sub39_sub11)
					       .aString10869);
		anInt149 += -1884741155;
	    }
	    if (class241_sub39_sub10.method17197(class241_sub39_sub11,
						 1289462832))
		Class88.method1854(class241_sub39_sub10, (byte) -61);
	}
    }
    
    static boolean method742(int i, int i_110_) {
	if (i_110_ >= 1000 && i < 1000)
	    return true;
	if (i_110_ < 1000 && i < 1000) {
	    if (Class13.method665(i, -2101903094))
		return true;
	    if (Class13.method665(i_110_, -936453042))
		return false;
	    return true;
	}
	if (i_110_ >= 1000 && i >= 1000)
	    return true;
	return false;
    }
    
    static void method743(Class241_Sub39_Sub10 class241_sub39_sub10) {
	boolean bool = false;
	class241_sub39_sub10.method16441((byte) 2);
	for (Class241_Sub39_Sub10 class241_sub39_sub10_111_
		 = ((Class241_Sub39_Sub10)
		    aClass410_152.method7440(-1397088259));
	     null != class241_sub39_sub10_111_;
	     class241_sub39_sub10_111_
		 = ((Class241_Sub39_Sub10)
		    aClass410_152.method7435((byte) -1))) {
	    if (Class400.method7138(class241_sub39_sub10
					.method17198(-1871657564),
				    class241_sub39_sub10_111_
					.method17198(-370160760),
				    932512486)) {
		Class506.method11487(class241_sub39_sub10,
				     class241_sub39_sub10_111_, 1612161464);
		bool = true;
		break;
	    }
	}
	if (!bool)
	    aClass410_152.method7431(class241_sub39_sub10, (byte) -55);
    }
    
    static void method744(Class241_Sub39_Sub10 class241_sub39_sub10) {
	boolean bool = false;
	class241_sub39_sub10.method16441((byte) 2);
	for (Class241_Sub39_Sub10 class241_sub39_sub10_112_
		 = ((Class241_Sub39_Sub10)
		    aClass410_152.method7440(-1397088259));
	     null != class241_sub39_sub10_112_;
	     class241_sub39_sub10_112_
		 = ((Class241_Sub39_Sub10)
		    aClass410_152.method7435((byte) -1))) {
	    if (Class400.method7138(class241_sub39_sub10
					.method17198(-887465747),
				    class241_sub39_sub10_112_
					.method17198(-1892437610),
				    956578887)) {
		Class506.method11487(class241_sub39_sub10,
				     class241_sub39_sub10_112_, 1612161464);
		bool = true;
		break;
	    }
	}
	if (!bool)
	    aClass410_152.method7431(class241_sub39_sub10, (byte) -2);
    }
    
    static void method745(InterfaceComponent class58, int i, int i_113_) {
	if (client.aBool8544) {
	    ParamType class603
		= (NPCDefinitionLoader.anInt5897 * 820722975 != -1
		   ? Class621.paramTypeList.list((820722975
							  * (NPCDefinitionLoader
							     .anInt5897)),
							 2084920551)
		   : null);
	    if (client.method13624(class58).method15043((byte) 126)
		&& 0 != (-1622803377 * Class613.anInt7804 & 0x20)
		&& (null == class603
		    || (class58.method1519(NPCDefinitionLoader.anInt5897 * 820722975,
					   class603.defaultint * 2015998927,
					   623518843)
			!= class603.defaultint * 2015998927)))
		Class534.method11882(client.aString8464,
				     new StringBuilder().append
					 (client.aString8465).append
					 (" ").append
					 (Class6.aString33).append
					 (" ").append
					 (class58.aString933).toString(),
				     1184895817 * Class213.anInt2512, 58,
				     class58.slot2 * 877329925, 0L,
				     -389932081 * class58.slot1,
				     class58.componentHash * 445907013, true, false,
				     (long) ((-389932081 * class58.slot1
					      << 32)
					     | 445907013 * class58.componentHash),
				     false, -1236921043);
	}
	for (int i_114_ = 9; i_114_ >= 5; i_114_--) {
	    String string = Class409.getContextMenuOption(class58, i_114_, (byte) 66);
	    if (string != null)
		Class534.method11882(string, class58.aString933,
				     Class198.method4034(class58, i_114_,
							 1819355975),
				     1007, 877329925 * class58.slot2,
				     (long) (i_114_ + 1),
				     -389932081 * class58.slot1,
				     445907013 * class58.componentHash, true, false,
				     (long) ((class58.slot1 * -389932081
					      << 32)
					     | 445907013 * class58.componentHash),
				     false, -1236921043);
	}
	String string = Class518.method11662(class58, (byte) -4);
	if (string != null)
	    Class534.method11882(string, class58.aString933,
				 class58.anInt937 * -828598245, 25,
				 class58.slot2 * 877329925, 0L,
				 -389932081 * class58.slot1,
				 445907013 * class58.componentHash, true, false,
				 (long) (class58.slot1 * -389932081 << 32
					 | class58.componentHash * 445907013),
				 false, -1236921043);
	for (int i_115_ = 4; i_115_ >= 0; i_115_--) {
	    String string_116_
		= Class409.getContextMenuOption(class58, i_115_, (byte) 48);
	    if (null != string_116_)
		Class534.method11882(string_116_, class58.aString933,
				     Class198.method4034(class58, i_115_,
							 1819355975),
				     57, 877329925 * class58.slot2,
				     (long) (i_115_ + 1),
				     class58.slot1 * -389932081,
				     class58.componentHash * 445907013, true, false,
				     (long) ((-389932081 * class58.slot1
					      << 32)
					     | class58.componentHash * 445907013),
				     false, -1236921043);
	}
	if (client.method13624(class58).method15051(-150636035)) {
	    if (class58.aString935 != null)
		Class534.method11882(class58.aString935, "", -1, 30,
				     class58.slot2 * 877329925, 0L,
				     class58.slot1 * -389932081,
				     445907013 * class58.componentHash, true, false,
				     (long) ((class58.slot1 * -389932081
					      << 32)
					     | class58.componentHash * 445907013),
				     false, -1236921043);
	    else
		Class534.method11882
		    (ClientMessage.CONTINU
			 .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 16472),
		     "", -1, 30, class58.slot2 * 877329925, 0L,
		     class58.slot1 * -389932081,
		     class58.componentHash * 445907013, true, false,
		     (long) (-389932081 * class58.slot1 << 32
			     | class58.componentHash * 445907013),
		     false, -1236921043);
	}
    }
    
    static void method746(InterfaceComponent class58, int i, int i_117_) {
	if (client.aBool8544) {
	    ParamType class603
		= (NPCDefinitionLoader.anInt5897 * 820722975 != -1
		   ? Class621.paramTypeList.list((820722975
							  * (NPCDefinitionLoader
							     .anInt5897)),
							 -37863783)
		   : null);
	    if (client.method13624(class58).method15043((byte) 71)
		&& 0 != (-1622803377 * Class613.anInt7804 & 0x20)
		&& (null == class603
		    || (class58.method1519(NPCDefinitionLoader.anInt5897 * 820722975,
					   class603.defaultint * 2015998927,
					   623518843)
			!= class603.defaultint * 2015998927)))
		Class534.method11882(client.aString8464,
				     new StringBuilder().append
					 (client.aString8465).append
					 (" ").append
					 (Class6.aString33).append
					 (" ").append
					 (class58.aString933).toString(),
				     1184895817 * Class213.anInt2512, 58,
				     class58.slot2 * 877329925, 0L,
				     -389932081 * class58.slot1,
				     class58.componentHash * 445907013, true, false,
				     (long) ((-389932081 * class58.slot1
					      << 32)
					     | 445907013 * class58.componentHash),
				     false, -1236921043);
	}
	for (int i_118_ = 9; i_118_ >= 5; i_118_--) {
	    String string = Class409.getContextMenuOption(class58, i_118_, (byte) 57);
	    if (string != null)
		Class534.method11882(string, class58.aString933,
				     Class198.method4034(class58, i_118_,
							 1819355975),
				     1007, 877329925 * class58.slot2,
				     (long) (i_118_ + 1),
				     -389932081 * class58.slot1,
				     445907013 * class58.componentHash, true, false,
				     (long) ((class58.slot1 * -389932081
					      << 32)
					     | 445907013 * class58.componentHash),
				     false, -1236921043);
	}
	String string = Class518.method11662(class58, (byte) -120);
	if (string != null)
	    Class534.method11882(string, class58.aString933,
				 class58.anInt937 * -828598245, 25,
				 class58.slot2 * 877329925, 0L,
				 -389932081 * class58.slot1,
				 445907013 * class58.componentHash, true, false,
				 (long) (class58.slot1 * -389932081 << 32
					 | class58.componentHash * 445907013),
				 false, -1236921043);
	for (int i_119_ = 4; i_119_ >= 0; i_119_--) {
	    String string_120_
		= Class409.getContextMenuOption(class58, i_119_, (byte) 78);
	    if (null != string_120_)
		Class534.method11882(string_120_, class58.aString933,
				     Class198.method4034(class58, i_119_,
							 1819355975),
				     57, 877329925 * class58.slot2,
				     (long) (i_119_ + 1),
				     class58.slot1 * -389932081,
				     class58.componentHash * 445907013, true, false,
				     (long) ((-389932081 * class58.slot1
					      << 32)
					     | class58.componentHash * 445907013),
				     false, -1236921043);
	}
	if (client.method13624(class58).method15051(-587129522)) {
	    if (class58.aString935 != null)
		Class534.method11882(class58.aString935, "", -1, 30,
				     class58.slot2 * 877329925, 0L,
				     class58.slot1 * -389932081,
				     445907013 * class58.componentHash, true, false,
				     (long) ((class58.slot1 * -389932081
					      << 32)
					     | class58.componentHash * 445907013),
				     false, -1236921043);
	    else
		Class534.method11882
		    (ClientMessage.CONTINU
			 .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 32592),
		     "", -1, 30, class58.slot2 * 877329925, 0L,
		     class58.slot1 * -389932081,
		     class58.componentHash * 445907013, true, false,
		     (long) (-389932081 * class58.slot1 << 32
			     | class58.componentHash * 445907013),
		     false, -1236921043);
	}
    }
    
    static void method747(InterfaceComponent class58, int i, int i_121_) {
	if (client.aBool8544) {
	    ParamType class603
		= (NPCDefinitionLoader.anInt5897 * 820722975 != -1
		   ? Class621.paramTypeList.list((820722975
							  * (NPCDefinitionLoader
							     .anInt5897)),
							 1356434525)
		   : null);
	    if (client.method13624(class58).method15043((byte) 89)
		&& 0 != (-1622803377 * Class613.anInt7804 & 0x20)
		&& (null == class603
		    || (class58.method1519(NPCDefinitionLoader.anInt5897 * 820722975,
					   class603.defaultint * 2015998927,
					   623518843)
			!= class603.defaultint * 2015998927)))
		Class534.method11882(client.aString8464,
				     new StringBuilder().append
					 (client.aString8465).append
					 (" ").append
					 (Class6.aString33).append
					 (" ").append
					 (class58.aString933).toString(),
				     1184895817 * Class213.anInt2512, 58,
				     class58.slot2 * 877329925, 0L,
				     -389932081 * class58.slot1,
				     class58.componentHash * 445907013, true, false,
				     (long) ((-389932081 * class58.slot1
					      << 32)
					     | 445907013 * class58.componentHash),
				     false, -1236921043);
	}
	for (int i_122_ = 9; i_122_ >= 5; i_122_--) {
	    String string = Class409.getContextMenuOption(class58, i_122_, (byte) 48);
	    if (string != null)
		Class534.method11882(string, class58.aString933,
				     Class198.method4034(class58, i_122_,
							 1819355975),
				     1007, 877329925 * class58.slot2,
				     (long) (i_122_ + 1),
				     -389932081 * class58.slot1,
				     445907013 * class58.componentHash, true, false,
				     (long) ((class58.slot1 * -389932081
					      << 32)
					     | 445907013 * class58.componentHash),
				     false, -1236921043);
	}
	String string = Class518.method11662(class58, (byte) -75);
	if (string != null)
	    Class534.method11882(string, class58.aString933,
				 class58.anInt937 * -828598245, 25,
				 class58.slot2 * 877329925, 0L,
				 -389932081 * class58.slot1,
				 445907013 * class58.componentHash, true, false,
				 (long) (class58.slot1 * -389932081 << 32
					 | class58.componentHash * 445907013),
				 false, -1236921043);
	for (int i_123_ = 4; i_123_ >= 0; i_123_--) {
	    String string_124_
		= Class409.getContextMenuOption(class58, i_123_, (byte) 114);
	    if (null != string_124_)
		Class534.method11882(string_124_, class58.aString933,
				     Class198.method4034(class58, i_123_,
							 1819355975),
				     57, 877329925 * class58.slot2,
				     (long) (i_123_ + 1),
				     class58.slot1 * -389932081,
				     class58.componentHash * 445907013, true, false,
				     (long) ((-389932081 * class58.slot1
					      << 32)
					     | class58.componentHash * 445907013),
				     false, -1236921043);
	}
	if (client.method13624(class58).method15051(-1901062593)) {
	    if (class58.aString935 != null)
		Class534.method11882(class58.aString935, "", -1, 30,
				     class58.slot2 * 877329925, 0L,
				     class58.slot1 * -389932081,
				     445907013 * class58.componentHash, true, false,
				     (long) ((class58.slot1 * -389932081
					      << 32)
					     | class58.componentHash * 445907013),
				     false, -1236921043);
	    else
		Class534.method11882
		    (ClientMessage.CONTINU
			 .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 28056),
		     "", -1, 30, class58.slot2 * 877329925, 0L,
		     class58.slot1 * -389932081,
		     class58.componentHash * 445907013, true, false,
		     (long) (-389932081 * class58.slot1 << 32
			     | class58.componentHash * 445907013),
		     false, -1236921043);
	}
    }
    
    static void method748(Entity class475_sub1_sub1_sub3) {
	if (class475_sub1_sub1_sub3 instanceof NPC) {
	    NPC class475_sub1_sub1_sub3_sub2
		= (NPC) class475_sub1_sub1_sub3;
	    if (null != class475_sub1_sub1_sub3_sub2.definition)
		Class465.method10716(class475_sub1_sub1_sub3_sub2,
				     (class475_sub1_sub1_sub3_sub2.nodePlane
				      != (Class21
					  .myPlayer
					  .nodePlane)),
				     (byte) -73);
	} else if (class475_sub1_sub1_sub3
		   instanceof Player) {
	    Player class475_sub1_sub1_sub3_sub1
		= (Player) class475_sub1_sub1_sub3;
	    Class42.method1066(class475_sub1_sub1_sub3_sub1,
			       (class475_sub1_sub1_sub3_sub1.nodePlane
				!= (Class21.myPlayer
				    .nodePlane)),
			       -153065082);
	}
    }
    
    static boolean method749() {
	return AnimationDefinitionLoader.method12315(ClanChannelUser.aClass499_5588.aClass533_6558,
				    (byte) -26);
    }
    
    static void method750(Class103 class103, int i, int i_125_) {
	if (i >= 0 && i_125_ >= 0 && null != aClass268_165) {
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    Class268 class268 = class103.method2226();
	    Class203.method4087(class103, (byte) -24);
	    class268.method5203(aClass266_167);
	    class268.method5202(aClass268_165);
	    class268.method5205();
	    int i_126_ = i - anInt135 * 470717791;
	    int i_127_ = i_125_ - 1133839679 * anInt177;
	    if (client.aClass238_8477.method4751(-1685315691) != null) {
		if (!client.aBool8544
		    || (-1622803377 * Class613.anInt7804 & 0x40) != 0) {
		    int i_128_ = -1;
		    int i_129_ = -1;
		    float f = (2.0F * (float) i_126_ / (float) (anInt163
								* -1801164387)
			       - 1.0F);
		    float f_130_
			= (2.0F * (float) i_127_ / (float) (1914791371
							    * anInt181)
			   - 1.0F);
		    class268.method5208(f, f_130_, -1.0F, aFloatArray137);
		    float f_131_ = aFloatArray137[0] / aFloatArray137[3];
		    float f_132_ = aFloatArray137[1] / aFloatArray137[3];
		    float f_133_ = aFloatArray137[2] / aFloatArray137[3];
		    class268.method5208(f, f_130_, 1.0F, aFloatArray137);
		    float f_134_ = aFloatArray137[0] / aFloatArray137[3];
		    float f_135_ = aFloatArray137[1] / aFloatArray137[3];
		    float f_136_ = aFloatArray137[2] / aFloatArray137[3];
		    float f_137_
			= Class260.method5090(f_131_, f_132_, f_133_, f_134_,
					      f_135_, f_136_, 4, (byte) -100);
		    if (f_137_ > 0.0F) {
			float f_138_ = f_134_ - f_131_;
			float f_139_ = f_136_ - f_133_;
			int i_140_ = (int) (f_137_ * f_138_ + f_131_);
			int i_141_ = (int) (f_133_ + f_139_ * f_137_);
			i_128_
			    = i_140_ + (Class21
					    .myPlayer
					    .method17782(-831233863) - 1
					<< 8) >> 9;
			i_129_
			    = i_141_ + (Class21
					    .myPlayer
					    .method17782(138572479) - 1
					<< 8) >> 9;
			int i_142_ = (Class21.myPlayer
				      .nodePlane);
			if (i_142_ < 3
			    && ((client.aClass238_8477.method4753((byte) -54)
				 .heightmapData[1][i_140_ >> 9]
				 [i_141_ >> 9])
				& 0x2) != 0)
			    i_142_++;
		    }
		    if (i_128_ != -1 && -1 != i_129_) {
			if (client.aBool8544
			    && 0 != (Class613.anInt7804 * -1622803377
				     & 0x40)) {
			    InterfaceComponent class58
				= (Class218_Sub3.method16576
				   (-1349195347 * RSGraphics.prevComponentHash,
				    1196348233 * client.prevComponentSlot1,
				    (byte) -22));
			    if (class58 != null)
				Class534.method11882
				    (client.aString8464,
				     new StringBuilder().append(" ").append
					 (Class6.aString33).append
					 (" ").toString(),
				     Class213.anInt2512 * 1184895817, 59, -1,
				     0L, i_128_, i_129_, true, false,
				     (long) (i_128_ << 32 | i_129_), true,
				     -1236921043);
			    else
				Class520.method11688(-1997909577);
			} else {
			    if (Class120_Sub18.aBool10606)
				Class534.method11882((ClientMessage
							  .FACEHERE
							  .getLocalisedMessage
						      (VarPlayerDomain.currentLocale,
						       (short) 31945)),
						     "", -1, 60, -1, 0L,
						     i_128_, i_129_, true,
						     false,
						     (long) (i_128_ << 32
							     | i_129_),
						     true, -1236921043);
			    Class534.method11882(Class353.aString5444, "",
						 -485396401 * client.anInt8451,
						 23, -1, 0L, i_128_, i_129_,
						 true, false,
						 (long) (i_128_ << 32
							 | i_129_),
						 true, -1236921043);
			}
		    }
		}
		Class576 class576 = (client.aClass238_8477.method4751
				     (-814569154).aClass576_7180);
		int i_143_ = i;
		int i_144_ = i_125_;
		List list = class576.aList7447;
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
		    Class542 class542 = (Class542) iterator.next();
		    if ((client.aBool8347
			 || (class542.aClass475_Sub1_7011.nodePlane
			     == (Class21.myPlayer
				 .nodePlane)))
			&& class542.method11946(class103, i_143_, i_144_,
						(byte) -73)) {
			boolean bool = false;
			boolean bool_145_ = false;
			int i_146_;
			int i_147_;
			if (class542.aClass475_Sub1_7011
			    instanceof Class475_Sub1_Sub1) {
			    i_146_
				= ((Class475_Sub1_Sub1)
				   class542.aClass475_Sub1_7011).aShort10717;
			    i_147_
				= ((Class475_Sub1_Sub1)
				   class542.aClass475_Sub1_7011).aShort10718;
			} else {
			    Class287 class287
				= (class542.aClass475_Sub1_7011.method10874()
				   .aClass287_4386);
			    i_146_ = (int) class287.aFloat4477 >> 9;
			    i_147_ = (int) class287.aFloat4479 >> 9;
			}
			if (class542.aClass475_Sub1_7011
			    instanceof Player) {
			    Player class475_sub1_sub1_sub3_sub1
				= ((Player)
				   class542.aClass475_Sub1_7011);
			    int i_148_ = class475_sub1_sub1_sub3_sub1
					     .method17782(-655827109);
			    Class287 class287
				= (class475_sub1_sub1_sub3_sub1.method10874()
				   .aClass287_4386);
			    if (((i_148_ & 0x1) == 0
				 && ((int) class287.aFloat4477 & 0x1ff) == 0
				 && ((int) class287.aFloat4479 & 0x1ff) == 0)
				|| (1 == (i_148_ & 0x1)
				    && 256 == ((int) class287.aFloat4477
					       & 0x1ff)
				    && 256 == ((int) class287.aFloat4479
					       & 0x1ff))) {
				int i_149_
				    = ((int) class287.aFloat4477
				       - (class475_sub1_sub1_sub3_sub1
					      .method17782(174783870) - 1
					  << 8));
				int i_150_
				    = ((int) class287.aFloat4479
				       - (class475_sub1_sub1_sub3_sub1
					      .method17782(-1050507946) - 1
					  << 8));
				for (int i_151_ = 0;
				     i_151_ < client.localNpcCount * -1837469873;
				     i_151_++) {
				    ObjectNode class241_sub26
					= ((ObjectNode)
					   (client.aClass407_8457.get
					    ((long) client.localNpcIndicies
						    [i_151_])));
				    if (class241_sub26 != null) {
					NPC class475_sub1_sub1_sub3_sub2
					    = ((NPC)
					       class241_sub26.objectValue);
					if ((client.anInt8296
					     != (class475_sub1_sub1_sub3_sub2
						 .anInt11381) * 477572011)
					    && (class475_sub1_sub1_sub3_sub2
						.aBool11379)) {
					    Class287 class287_152_
						= (class475_sub1_sub1_sub3_sub2
						       .method10874
						   ().aClass287_4386);
					    int i_153_
						= ((int) (class287_152_
							  .aFloat4477)
						   - ((19489015
						       * (class475_sub1_sub1_sub3_sub2
							  .definition
							  .size)) - 1
						      << 8));
					    int i_154_
						= ((int) (class287_152_
							  .aFloat4479)
						   - (((class475_sub1_sub1_sub3_sub2
							.definition
							.size) * 19489015
						       - 1)
						      << 8));
					    if (i_153_ >= i_149_
						&& ((class475_sub1_sub1_sub3_sub2
						     .definition
						     .size) * 19489015
						    <= ((class475_sub1_sub1_sub3_sub1
							     .method17782
							 (1082846275))
							- (i_153_ - i_149_
							   >> 9)))
						&& i_154_ >= i_150_
						&& ((class475_sub1_sub1_sub3_sub2
						     .definition
						     .size) * 19489015
						    <= ((class475_sub1_sub1_sub3_sub1
							     .method17782
							 (166842718))
							- (i_154_ - i_150_
							   >> 9)))) {
						Class465.method10716
						    (class475_sub1_sub1_sub3_sub2,
						     ((class542
						       .aClass475_Sub1_7011
						       .nodePlane)
						      != (Class21
							  .myPlayer
							  .nodePlane)),
						     (byte) -120);
						class475_sub1_sub1_sub3_sub2
						    .anInt11381
						    = (300578563
						       * client.anInt8296);
					    }
					}
				    }
				}
				int i_155_ = 794073197 * GPI.viewportPlayerCount;
				int[] is = GPI.viewportPlayerIndicies;
				for (int i_156_ = 0; i_156_ < i_155_;
				     i_156_++) {
				    Player class475_sub1_sub1_sub3_sub1_157_
					= (client
					   .localPlayers
					   [is[i_156_]]);
				    if ((null
					 != class475_sub1_sub1_sub3_sub1_157_)
					&& (477572011
					    * (class475_sub1_sub1_sub3_sub1_157_
					       .anInt11381)) != client.anInt8296
					&& (class475_sub1_sub1_sub3_sub1
					    != class475_sub1_sub1_sub3_sub1_157_)
					&& (class475_sub1_sub1_sub3_sub1_157_
					    .aBool11379)) {
					Class287 class287_158_
					    = (class475_sub1_sub1_sub3_sub1_157_
						   .method10874
					       ().aClass287_4386);
					int i_159_
					    = ((int) class287_158_.aFloat4477
					       - ((class475_sub1_sub1_sub3_sub1_157_
						       .method17782(-345695492)
						   - 1)
						  << 8));
					int i_160_
					    = ((int) class287_158_.aFloat4479
					       - ((class475_sub1_sub1_sub3_sub1_157_
						       .method17782(1815543801)
						   - 1)
						  << 8));
					if (i_159_ >= i_149_
					    && (class475_sub1_sub1_sub3_sub1_157_
						    .method17782(-304968652)
						<= (class475_sub1_sub1_sub3_sub1
							.method17782(249157830)
						    - (i_159_ - i_149_ >> 9)))
					    && i_160_ >= i_150_
					    && (class475_sub1_sub1_sub3_sub1_157_
						    .method17782(546865454)
						<= (class475_sub1_sub1_sub3_sub1
							.method17782(103468737)
						    - (i_160_ - i_150_
						       >> 9)))) {
					    Class42.method1066
						(class475_sub1_sub1_sub3_sub1_157_,
						 ((class542.aClass475_Sub1_7011
						   .nodePlane)
						  != (Class21
						      .myPlayer
						      .nodePlane)),
						 1305810763);
					    class475_sub1_sub1_sub3_sub1_157_
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
				 -775339103);
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
				    int i_161_
					= ((int) class287.aFloat4477
					   - (((19489015
						* (class475_sub1_sub1_sub3_sub2
						   .definition.size))
					       - 1)
					      << 8));
				    int i_162_
					= ((int) class287.aFloat4479
					   - (((class475_sub1_sub1_sub3_sub2
						.definition.size)
					       * 19489015) - 1
					      << 8));
				    for (int i_163_ = 0;
					 (i_163_
					  < -1837469873 * client.localNpcCount);
					 i_163_++) {
					ObjectNode class241_sub26
					    = ((ObjectNode)
					       (client.aClass407_8457
						    .get
						((long) client.localNpcIndicies
							[i_163_])));
					if (class241_sub26 != null) {
					    NPC class475_sub1_sub1_sub3_sub2_164_
						= ((NPC)
						   (class241_sub26
						    .objectValue));
					    if ((client.anInt8296
						 != (class475_sub1_sub1_sub3_sub2_164_
						     .anInt11381) * 477572011)
						&& (class475_sub1_sub1_sub3_sub2_164_
						    != class475_sub1_sub1_sub3_sub2)
						&& (class475_sub1_sub1_sub3_sub2_164_
						    .aBool11379)) {
						Class287 class287_165_
						    = (class475_sub1_sub1_sub3_sub2_164_
							   .method10874
						       ().aClass287_4386);
						int i_166_
						    = ((int) (class287_165_
							      .aFloat4477)
						       - (((class475_sub1_sub1_sub3_sub2_164_
							    .definition
							    .size)
							   * 19489015) - 1
							  << 8));
						int i_167_
						    = ((int) (class287_165_
							      .aFloat4479)
						       - (((class475_sub1_sub1_sub3_sub2_164_
							    .definition
							    .size)
							   * 19489015) - 1
							  << 8));
						if (i_166_ >= i_161_
						    && ((class475_sub1_sub1_sub3_sub2_164_
							 .definition
							 .size) * 19489015
							<= (((class475_sub1_sub1_sub3_sub2
							      .definition
							      .size)
							     * 19489015)
							    - (i_166_ - i_161_
							       >> 9)))
						    && i_167_ >= i_162_
						    && ((class475_sub1_sub1_sub3_sub2_164_
							 .definition
							 .size) * 19489015
							<= ((19489015
							     * (class475_sub1_sub1_sub3_sub2
								.definition
								.size))
							    - (i_167_ - i_162_
							       >> 9)))) {
						    Class465.method10716
							(class475_sub1_sub1_sub3_sub2_164_,
							 ((Class21
							   .myPlayer
							   .nodePlane)
							  != (class542
							      .aClass475_Sub1_7011
							      .nodePlane)),
							 (byte) -10);
						    class475_sub1_sub1_sub3_sub2_164_
							.anInt11381
							= (client.anInt8296
							   * 300578563);
						}
					    }
					}
				    }
				    int i_168_
					= GPI.viewportPlayerCount * 794073197;
				    int[] is = GPI.viewportPlayerIndicies;
				    for (int i_169_ = 0; i_169_ < i_168_;
					 i_169_++) {
					Player class475_sub1_sub1_sub3_sub1
					    = (client
					       .localPlayers
					       [is[i_169_]]);
					if ((class475_sub1_sub1_sub3_sub1
					     != null)
					    && ((477572011
						 * (class475_sub1_sub1_sub3_sub1
						    .anInt11381))
						!= client.anInt8296)
					    && (class475_sub1_sub1_sub3_sub1
						.aBool11379)) {
					    Class287 class287_170_
						= (class475_sub1_sub1_sub3_sub1
						       .method10874
						   ().aClass287_4386);
					    int i_171_
						= ((int) (class287_170_
							  .aFloat4477)
						   - ((class475_sub1_sub1_sub3_sub1
							   .method17782
						       (207838641)) - 1
						      << 8));
					    int i_172_
						= ((int) (class287_170_
							  .aFloat4479)
						   - ((class475_sub1_sub1_sub3_sub1
							   .method17782
						       (-707543970)) - 1
						      << 8));
					    if (i_171_ >= i_161_
						&& (class475_sub1_sub1_sub3_sub1
							.method17782(407070733)
						    <= ((19489015
							 * (class475_sub1_sub1_sub3_sub2
							    .definition
							    .size))
							- (i_171_ - i_161_
							   >> 9)))
						&& i_172_ >= i_162_
						&& (class475_sub1_sub1_sub3_sub1
							.method17782(-873541614)
						    <= ((class475_sub1_sub1_sub3_sub2
							 .definition
							 .size) * 19489015
							- (i_172_ - i_162_
							   >> 9)))) {
						Class42.method1066
						    (class475_sub1_sub1_sub3_sub1,
						     ((class542
						       .aClass475_Sub1_7011
						       .nodePlane)
						      != (Class21
							  .myPlayer
							  .nodePlane)),
						     -512026074);
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
				     (byte) 1);
				class475_sub1_sub1_sub3_sub2.anInt11381
				    = client.anInt8296 * 300578563;
			    }
			}
			if (class542.aClass475_Sub1_7011
			    instanceof Class475_Sub1_Sub2_Sub1) {
			    int i_173_
				= 127679513 * class522.baseX + i_146_;
			    int i_174_
				= class522.baseY * 468558693 + i_147_;
			    WorldTile class241_sub44
				= ((WorldTile)
				   (client.aClass407_8452.get
				    ((long) ((class542.aClass475_Sub1_7011
					      .nodePlane) << 28
					     | i_174_ << 14 | i_173_))));
			    if (class241_sub44 != null) {
				int i_175_ = 0;
				GroundItem class241_sub31
				    = ((GroundItem)
				       class241_sub44.aClass429_10181
					   .method7619((byte) -1));
				while (class241_sub31 != null) {
				    ItemDefinition class623
					= (JS5.itemDefLoader.list
					   ((2088213913
					     * class241_sub31.itemID),
					    (short) -12405));
				    int i_176_;
				    if (class623.aBool7953)
					i_176_
					    = 1075803965 * class623.anInt7910;
				    else if (class623.membersOnly)
					i_176_ = (ClanChannelUser.aClass499_5588
						  .anInt6561) * -1445883597;
				    else
					i_176_ = (ClanChannelUser.aClass499_5588
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
						   1605880005))
					       : null);
					if ((-1622803377 * Class613.anInt7804
					     & 0x1) != 0
					    && (null == class603
						|| ((class623.getParam
						     ((NPCDefinitionLoader.anInt5897
						       * 820722975),
						      (2015998927
						       * class603.defaultint),
						      987203388))
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
						      (i_176_, -1366736463))
						     .append
						     (class623.name)
						     .toString(),
						 (1184895817
						  * Class213.anInt2512),
						 17, -1,
						 (long) (2088213913
							 * (class241_sub31
							    .itemID)),
						 i_146_, i_147_, true, false,
						 (long) i_175_, false,
						 -1236921043);
				    }
				    if ((Class21
					 .myPlayer
					 .nodePlane)
					== (class542.aClass475_Sub1_7011
					    .nodePlane)) {
					String[] strings
					    = class623.groundOptions;
					for (int i_177_ = strings.length - 1;
					     i_177_ >= 0; i_177_--) {
					    if (null != strings[i_177_]) {
						int i_178_ = 0;
						int i_179_
						    = (886936997
						       * client.anInt8387);
						if (i_177_ == 0)
						    i_178_ = 18;
						if (i_177_ == 1)
						    i_178_ = 19;
						if (2 == i_177_)
						    i_178_ = 20;
						if (i_177_ == 3)
						    i_178_ = 21;
						if (4 == i_177_)
						    i_178_ = 22;
						if (i_177_ == 5)
						    i_178_ = 1004;
						int i_180_
						    = (class623.method13380
						       (i_177_,
							(short) 20653));
						if (-1 != i_180_)
						    i_179_ = i_180_;
						Class534.method11882
						    (strings[i_177_],
						     new StringBuilder().append
							 (Class338.method6112
							  (i_176_,
							   -1154538121))
							 .append
							 (class623.name)
							 .toString(),
						     i_179_, i_178_, -1,
						     (long) ((class241_sub31
							      .itemID)
							     * 2088213913),
						     i_146_, i_147_, true,
						     false, (long) i_175_,
						     false, -1236921043);
					    }
					}
				    }
				    class241_sub31
					= ((GroundItem)
					   class241_sub44.aClass429_10181
					       .method7625((byte) -1));
				    i_175_++;
				}
			    }
			}
			if (class542.aClass475_Sub1_7011
			    instanceof Interface24) {
			    Interface24 interface24
				= (Interface24) class542.aClass475_Sub1_7011;
			    ObjectDefinition class526
				= (client.aClass238_8477.getObjectLoader
				       (-1889678556).getObjectDefinition
				   (interface24.method146((byte) 0),
				    577892407));
			    if (class526.toObjectIDs != null)
				class526
				    = class526.method11768(Class1.aClass19_11,
							   Class1.aClass19_11,
							   -1228115719);
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
					       322497795))
					   : null);
				    if ((Class613.anInt7804 * -1622803377
					 & 0x4) != 0
					&& (class603 == null
					    || ((class526.method11769
						 ((820722975
						   * NPCDefinitionLoader.anInt5897),
						  (2015998927
						   * class603.defaultint),
						  -1615251191))
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
						  (65535, -1071806613))
						 .append
						 (class526.name)
						 .toString(),
					     Class213.anInt2512 * 1184895817,
					     2, -1,
					     Class237.method4737(interface24,
								 i_146_,
								 i_147_,
								 -1595907044),
					     i_146_, i_147_, true, false,
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
					for (int i_181_ = strings.length - 1;
					     i_181_ >= 0; i_181_--) {
					    if (null != strings[i_181_]) {
						int i_182_ = 0;
						int i_183_ = (client.anInt8387
							      * 886936997);
						if (0 == i_181_)
						    i_182_ = 3;
						if (i_181_ == 1)
						    i_182_ = 4;
						if (i_181_ == 2)
						    i_182_ = 5;
						if (3 == i_181_)
						    i_182_ = 6;
						if (i_181_ == 4)
						    i_182_ = 1001;
						if (5 == i_181_)
						    i_182_ = 1002;
						int i_184_
						    = (class526.method11777
						       (i_181_, -203064958));
						if (-1 != i_184_)
						    i_183_ = i_184_;
						Class534.method11882
						    (strings[i_181_],
						     new StringBuilder().append
							 (Class338.method6112
							  (65535, -1561142159))
							 .append
							 (class526.name)
							 .toString(),
						     i_183_, i_182_, -1,
						     (Class237.method4737
						      (interface24, i_146_,
						       i_147_, -1595907044)),
						     i_146_, i_147_, true,
						     false,
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
    
    static void method751(Class103 class103, int i, int i_185_, int i_186_,
			  int i_187_, int i_188_, int i_189_) {
	class103.method2263(i, i_185_, i_186_, i_187_, i_188_, (byte) -93);
	class103.method2263(1 + i, 1 + i_185_, i_186_ - 2, 16, i_189_,
			    (byte) -110);
	class103.method2262(1 + i, i_185_ + 18, i_186_ - 2, i_187_ - 19,
			    i_189_, 1190469312);
    }
    
    public static void method752() {
	Class445_Sub30.aClass168_8711 = null;
	Class23.aClass168_208 = null;
	Class363.aClass168_5533 = null;
	Class570.aClass168_7359 = null;
	Class363.aClass168_5534 = null;
	Exception_Sub5.aClass168_10705 = null;
	Class102.aClass168_1448 = null;
	Class479.aClass168_6416 = null;
	Class445_Sub12.aClass96_8651 = null;
	Class175.aClass639_2122 = null;
    }
    
    static long method753(Interface24 interface24, int i, int i_190_) {
	long l = 4194304L;
	long l_191_ = -9223372036854775808L;
	ObjectDefinition class526
	    = client.aClass238_8477.getObjectLoader(-2052485419)
		  .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	long l_192_
	    = (long) (i | i_190_ << 7 | interface24.method139(591463713) << 14
		      | interface24.method140(-365409855) << 20 | 0x40000000);
	if (class526.anInt6848 * -1389471035 == 0)
	    l_192_ |= l_191_;
	if (class526.anInt6881 * -309513503 == 1)
	    l_192_ |= l;
	l_192_ |= (long) interface24.method146((byte) 0) << 32;
	return l_192_;
    }
    
    static int method754() {
	if (client.aClass58_8365 == null) {
	    if (!aBool141) {
		if (ClanChannelUser.aClass499_5588.aBool6562) {
		    if (null != Class478.aClass241_Sub39_Sub11_6402)
			return (300310447
				* (((Class241_Sub39_Sub11)
				    Class478.aClass241_Sub39_Sub11_6402)
				   .cursorID));
		} else if (Class125.aClass241_Sub39_Sub11_1582 != null)
		    return (((Class241_Sub39_Sub11)
			     Class125.aClass241_Sub39_Sub11_1582).cursorID
			    * 300310447);
	    } else {
		Class639 class639 = OnlineStatus.method7519(2112311469);
		int i = Class106.aClass580_1503.method12718(1476404418);
		int i_193_ = Class106.aClass580_1503.method12740((byte) -28);
		if (!aBool171) {
		    if (i > 1011088115 * anInt156
			&& i < (Class593.anInt7631 * 1139603851
				+ 1011088115 * anInt156)) {
			int i_194_ = -1;
			for (int i_195_ = 0; i_195_ < anInt148 * 1327183635;
			     i_195_++) {
			    if (aBool168) {
				int i_196_
				    = (Class380.anInt5660 * 904064679 + 20
				       + class639.anInt8258 * -351886683 + 1
				       + ((1327183635 * anInt148 - 1 - i_195_)
					  * (anInt164 * 1149989507)));
				if (i_193_ > (i_196_
					      - class639.anInt8258 * -351886683
					      - 1)
				    && i_193_ < (326424439 * class639.anInt8260
						 + i_196_))
				    i_194_ = i_195_;
			    } else {
				int i_197_
				    = (((anInt148 * 1327183635 - 1 - i_195_)
					* (anInt164 * 1149989507))
				       + (904064679 * Class380.anInt5660
					  + 31));
				if (i_193_ > (i_197_
					      - class639.anInt8258 * -351886683
					      - 1)
				    && i_193_ < (class639.anInt8260 * 326424439
						 + i_197_))
				    i_194_ = i_195_;
			    }
			}
			if (i_194_ != -1) {
			    int i_198_ = 0;
			    Class443 class443 = new Class443(aClass429_150);
			    for (Class241_Sub39_Sub11 class241_sub39_sub11
				     = ((Class241_Sub39_Sub11)
					class443.method7865(-397068173));
				 null != class241_sub39_sub11;
				 class241_sub39_sub11 = ((Class241_Sub39_Sub11)
							 class443.next())) {
				if (i_198_++ == i_194_)
				    return (((Class241_Sub39_Sub11)
					     class241_sub39_sub11).cursorID
					    * 300310447);
			    }
			}
		    }
		} else if (i > anInt156 * 1011088115
			   && i < (1139603851 * Class593.anInt7631
				   + 1011088115 * anInt156)) {
		    int i_199_ = -1;
		    for (int i_200_ = 0; i_200_ < -1887420811 * anInt149;
			 i_200_++) {
			if (aBool168) {
			    int i_201_
				= (-351886683 * class639.anInt8258
				   + (904064679 * Class380.anInt5660 + 20) + 1
				   + i_200_ * (anInt164 * 1149989507));
			    if (i_193_ > (i_201_
					  - class639.anInt8258 * -351886683
					  - 1)
				&& (i_193_
				    < class639.anInt8260 * 326424439 + i_201_))
				i_199_ = i_200_;
			} else {
			    int i_202_ = (904064679 * Class380.anInt5660 + 31
					  + i_200_ * (1149989507 * anInt164));
			    if (i_193_ > (i_202_
					  - class639.anInt8258 * -351886683
					  - 1)
				&& (i_193_
				    < i_202_ + class639.anInt8260 * 326424439))
				i_199_ = i_200_;
			}
		    }
		    if (i_199_ != -1) {
			int i_203_ = 0;
			Class427 class427 = new Class427(aClass410_152);
			for (Class241_Sub39_Sub10 class241_sub39_sub10
				 = ((Class241_Sub39_Sub10)
				    class427.method7585(1304034252));
			     class241_sub39_sub10 != null;
			     class241_sub39_sub10
				 = (Class241_Sub39_Sub10) class427.next()) {
			    if (i_203_++ == i_199_)
				return (((Class241_Sub39_Sub11)
					 (Class241_Sub39_Sub11)
					 (((Class241_Sub39_Sub10)
					   class241_sub39_sub10)
					  .aClass410_10866.aClass241_Sub39_5934
					  .aClass241_Sub39_10148)).cursorID
					* 300310447);
			}
		    }
		} else if (null != aClass241_Sub39_Sub10_143
			   && i > 1955430821 * Class193.anInt2298
			   && i < (Class193.anInt2298 * 1955430821
				   + -885853667 * anInt147)) {
		    int i_204_ = -1;
		    for (int i_205_ = 0;
			 (i_205_
			  < (((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
			     .anInt10867) * 1633676605);
			 i_205_++) {
			if (aBool168) {
			    int i_206_
				= (1149989507 * anInt164 * i_205_
				   + (1 + (-351886683 * class639.anInt8258
					   + (20
					      + 282057643 * Class4.anInt16))));
			    if (i_193_ > (i_206_
					  - class639.anInt8258 * -351886683
					  - 1)
				&& (i_193_
				    < i_206_ + 326424439 * class639.anInt8260))
				i_204_ = i_205_;
			} else {
			    int i_207_ = (1149989507 * anInt164 * i_205_
					  + (Class4.anInt16 * 282057643 + 31));
			    if (i_193_ > (i_207_
					  - class639.anInt8258 * -351886683
					  - 1)
				&& (i_193_
				    < i_207_ + 326424439 * class639.anInt8260))
				i_204_ = i_205_;
			}
		    }
		    if (-1 != i_204_) {
			int i_208_ = 0;
			Class427 class427
			    = new Class427(((Class241_Sub39_Sub10)
					    aClass241_Sub39_Sub10_143)
					   .aClass410_10866);
			for (Class241_Sub39_Sub11 class241_sub39_sub11
				 = ((Class241_Sub39_Sub11)
				    class427.method7585(2085839955));
			     null != class241_sub39_sub11;
			     class241_sub39_sub11
				 = (Class241_Sub39_Sub11) class427.next()) {
			    if (i_208_++ == i_204_)
				return (((Class241_Sub39_Sub11)
					 class241_sub39_sub11).cursorID
					* 300310447);
			}
		    }
		}
	    }
	}
	return -1;
    }
    
    static void method755(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (!aBool141) {
	    class241_sub39_sub11.remove((byte) 36);
	    anInt148 -= 431696667;
	    if (!((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10878) {
		long l = (544876251290631095L
			  * (((Class241_Sub39_Sub11) class241_sub39_sub11)
			     .aLong10872));
		Class241_Sub39_Sub10 class241_sub39_sub10;
		for (class241_sub39_sub10
			 = (Class241_Sub39_Sub10) aClass407_180.get(l);
		     (null != class241_sub39_sub10
		      && !(((Class241_Sub39_Sub10) class241_sub39_sub10)
			       .aString10865.equals
			   (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aString10869)));
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass407_180.method7289((byte) 15))) {
		    /* empty */
		}
		if (null != class241_sub39_sub10
		    && class241_sub39_sub10.method17205(class241_sub39_sub11,
							1824533572))
		    Class88.method1854(class241_sub39_sub10, (byte) -25);
	    } else {
		for (Class241_Sub39_Sub10 class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7440(-1397088259));
		     class241_sub39_sub10 != null;
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7435((byte) -1))) {
		    if (((Class241_Sub39_Sub10) class241_sub39_sub10)
			    .aString10865.equals
			(((Class241_Sub39_Sub11) class241_sub39_sub11)
			 .aString10869)) {
			boolean bool = false;
			for (Class241_Sub39_Sub11 class241_sub39_sub11_209_
				 = ((Class241_Sub39_Sub11)
				    ((Class241_Sub39_Sub10)
				     class241_sub39_sub10)
					.aClass410_10866
					.method7440(-1397088259));
			     null != class241_sub39_sub11_209_;
			     class241_sub39_sub11_209_
				 = ((Class241_Sub39_Sub11)
				    ((Class241_Sub39_Sub10)
				     class241_sub39_sub10)
					.aClass410_10866
					.method7435((byte) -1))) {
			    if (class241_sub39_sub11_209_
				== class241_sub39_sub11) {
				if (class241_sub39_sub10.method17205
				    (class241_sub39_sub11, 1164798810))
				    Class88.method1854(class241_sub39_sub10,
						       (byte) -82);
				bool = true;
				break;
			    }
			}
			if (bool)
			    break;
		    }
		}
	    }
	}
    }
    
    static void method756() {
	for (Class241_Sub39_Sub11 class241_sub39_sub11
		 = (Class241_Sub39_Sub11) aClass429_150.method7694(16711935);
	     null != class241_sub39_sub11;
	     class241_sub39_sub11 = ((Class241_Sub39_Sub11)
				     aClass429_150.method7692(1578289319))) {
	    if (Class62.method1618((((Class241_Sub39_Sub11)
				     class241_sub39_sub11).anInt10879
				    * -142243581),
				   -1803374654))
		Class11.method596(class241_sub39_sub11, -1422310258);
	}
    }
    
    static boolean method757(int i, int i_210_) {
	if (i_210_ >= 1000 && i < 1000)
	    return true;
	if (i_210_ < 1000 && i < 1000) {
	    if (Class13.method665(i, -876464312))
		return true;
	    if (Class13.method665(i_210_, 1969320471))
		return false;
	    return true;
	}
	if (i_210_ >= 1000 && i >= 1000)
	    return true;
	return false;
    }
    
    public static boolean method758(int i) {
	for (Class241_Sub39_Sub11 class241_sub39_sub11
		 = (Class241_Sub39_Sub11) aClass429_150.method7694(16711935);
	     null != class241_sub39_sub11;
	     class241_sub39_sub11 = ((Class241_Sub39_Sub11)
				     aClass429_150.method7692(-209124856))) {
	    if (Class321.method5931((((Class241_Sub39_Sub11)
				      class241_sub39_sub11).anInt10879
				     * -142243581),
				    (byte) 2)
		&& (long) i == -218357506993850339L * (((Class241_Sub39_Sub11)
							class241_sub39_sub11)
						       .aLong10877))
		return true;
	}
	return false;
    }
    
    static boolean method759(int i) {
	if (i == 3 || i == 4 || 5 == i || i == 6 || i == 1001 || i == 1002)
	    return true;
	if (2 == i)
	    return true;
	return false;
    }
    
    static boolean method760() {
	return anInt148 * 1327183635 > 0;
    }
    
    static long method761(Interface24 interface24, int i, int i_211_) {
	long l = 4194304L;
	long l_212_ = -9223372036854775808L;
	ObjectDefinition class526
	    = client.aClass238_8477.getObjectLoader(-1949259701)
		  .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	long l_213_
	    = (long) (i | i_211_ << 7 | interface24.method139(591463713) << 14
		      | interface24.method140(-1414228403) << 20 | 0x40000000);
	if (class526.anInt6848 * -1389471035 == 0)
	    l_213_ |= l_212_;
	if (class526.anInt6881 * -309513503 == 1)
	    l_213_ |= l;
	l_213_ |= (long) interface24.method146((byte) 0) << 32;
	return l_213_;
    }
    
    static void method762(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (class241_sub39_sub11 != null) {
	    aClass429_150.addNode(class241_sub39_sub11, (short) -24549);
	    anInt148 += 431696667;
	    Object object = null;
	    Class241_Sub39_Sub10 class241_sub39_sub10;
	    if (!((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10878
		&& !"".equals(((Class241_Sub39_Sub11) class241_sub39_sub11)
			      .aString10869)) {
		long l = (544876251290631095L
			  * (((Class241_Sub39_Sub11) class241_sub39_sub11)
			     .aLong10872));
		for (class241_sub39_sub10
			 = (Class241_Sub39_Sub10) aClass407_180.get(l);
		     (class241_sub39_sub10 != null
		      && !(((Class241_Sub39_Sub10) class241_sub39_sub10)
			       .aString10865.equals
			   (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aString10869)));
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass407_180.method7289((byte) -34))) {
		    /* empty */
		}
		if (null == class241_sub39_sub10) {
		    class241_sub39_sub10
			= (Class241_Sub39_Sub10) aClass129_155.get(l);
		    if (null != class241_sub39_sub10
			&& !(((Class241_Sub39_Sub10) class241_sub39_sub10)
				 .aString10865.equals
			     (((Class241_Sub39_Sub11) class241_sub39_sub11)
			      .aString10869)))
			class241_sub39_sub10 = null;
		    if (class241_sub39_sub10 == null)
			class241_sub39_sub10
			    = new Class241_Sub39_Sub10(((Class241_Sub39_Sub11)
							class241_sub39_sub11)
						       .aString10869);
		    aClass407_180.put(class241_sub39_sub10, l);
		    anInt149 += -1884741155;
		}
	    } else {
		class241_sub39_sub10
		    = new Class241_Sub39_Sub10(((Class241_Sub39_Sub11)
						class241_sub39_sub11)
					       .aString10869);
		anInt149 += -1884741155;
	    }
	    if (class241_sub39_sub10.method17197(class241_sub39_sub11,
						 940960322))
		Class88.method1854(class241_sub39_sub10, (byte) 70);
	}
    }
    
    static void method763(Class103 class103) {
	if (aBool141)
	    Class546.method11992(class103, 182840159);
	else
	    Class455.method10568(class103, -1559938312);
    }
    
    static void method764(Class103 class103) {
	if (aBool141)
	    Class546.method11992(class103, 586099586);
	else
	    Class455.method10568(class103, -54468220);
    }
    
    static void method765(int i, int i_214_) {
	if (Class128.aClass513_1589.aBool6714
	    || (1327183635 * anInt148 != 1
		&& (!Class120_Sub18.aBool10606 || 2 != anInt148 * 1327183635
		    || !(((Class241_Sub39_Sub11)
			  Class540.aClass241_Sub39_Sub11_7002)
			     .aString10871.equals
			 (ClientMessage.FACEHERE.getLocalisedMessage
			  (VarPlayerDomain.currentLocale, (short) 20446)))))) {
	    Class639 class639 = OnlineStatus.method7519(2117409850);
	    int i_215_
		= (class639.method13562
		   (ClientMessage.CHOOSEOPTION
			.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 31152),
		    (byte) 39));
	    int i_216_;
	    if (!aBool171) {
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    aClass429_150.method7694(16711935));
		     class241_sub39_sub11 != null;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    aClass429_150.method7692(87171316))) {
		    int i_217_ = Class277.method5374(class241_sub39_sub11,
						     class639, (byte) -87);
		    if (i_217_ > i_215_)
			i_215_ = i_217_;
		}
		i_215_ += 8;
		i_216_ = 21 + anInt148 * 1327183635 * (1149989507 * anInt164);
		LoadingScreenDef.anInt5500
		    = -1996937561 * ((aBool168 ? 26 : 22)
				     + anInt148 * 1327183635 * (anInt164
								* 1149989507));
	    } else {
		for (Class241_Sub39_Sub10 class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7440(-1397088259));
		     null != class241_sub39_sub10;
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7435((byte) -1))) {
		    int i_218_;
		    if (1 == 1633676605 * ((Class241_Sub39_Sub10)
					   class241_sub39_sub10).anInt10867)
			i_218_
			    = Class277.method5374(((Class241_Sub39_Sub11)
						   (((Class241_Sub39_Sub10)
						     class241_sub39_sub10)
						    .aClass410_10866
						    .aClass241_Sub39_5934
						    .aClass241_Sub39_10148)),
						  class639, (byte) 9);
		    else
			i_218_ = Class106.method2677(class241_sub39_sub10,
						     class639, -1195953806);
		    if (i_218_ > i_215_)
			i_215_ = i_218_;
		}
		i_215_ += 8;
		i_216_ = 1149989507 * anInt164 * (-1887420811 * anInt149) + 21;
		LoadingScreenDef.anInt5500
		    = (anInt149 * -1887420811 * (1149989507 * anInt164)
		       + (aBool168 ? 26 : 22)) * -1996937561;
	    }
	    i_215_ += 10;
	    int i_219_ = i - i_215_ / 2;
	    if (i_219_ + i_215_ > -1080559003 * Class494.canvasWid)
		i_219_ = Class494.canvasWid * -1080559003 - i_215_;
	    if (i_219_ < 0)
		i_219_ = 0;
	    int i_220_ = i_214_;
	    if (i_220_ + i_216_ > Class67.canvasHei * 963058943)
		i_220_ = 963058943 * Class67.canvasHei - i_216_;
	    if (i_220_ < 0)
		i_220_ = 0;
	    anInt156 = i_219_ * -1574130117;
	    Class380.anInt5660 = i_220_ * 71817495;
	    Class593.anInt7631 = -1038752221 * i_215_;
	    anInt144 = (int) (Math.random() * 24.0) * -276059845;
	    aBool141 = true;
	}
    }
    
    static void method766(Class103 class103) {
	int i = anInt156 * 1011088115;
	int i_221_ = 904064679 * Class380.anInt5660;
	int i_222_ = 1139603851 * Class593.anInt7631;
	int i_223_ = LoadingScreenDef.anInt5500 * 630071575 - 3;
	int i_224_ = 20;
	if (null == Class445_Sub12.aClass96_8651
	    || null == Class175.aClass639_2122) {
	    Class445_Sub12.aClass96_8651
		= ((Class96)
		   Class425.aClass344_6080.method6161((client
						       .anInterface26_8552),
						      (193407783
						       * Class200.anInt2398),
						      true, true,
						      -2132531444));
	    Class175.aClass639_2122
		= Class425.aClass344_6080.method6141(client.anInterface26_8552,
						     (193407783
						      * Class200.anInt2398),
						     (byte) 6);
	    if (Class445_Sub12.aClass96_8651 != null
		&& null != Class175.aClass639_2122) {
		Class198.method4036((byte) 4);
		int i_225_ = i + i_222_ / 2;
		if (i_225_ + i_222_ > Class494.canvasWid * -1080559003)
		    i_225_ = Class494.canvasWid * -1080559003 - i_222_;
		if (i_225_ < 0)
		    i_225_ = 0;
		Class630.method13488(i_225_, 904064679 * Class380.anInt5660,
				     (byte) 30);
		return;
	    }
	}
	Class96 class96;
	if (Class445_Sub12.aClass96_8651 == null
	    || Class175.aClass639_2122 == null)
	    class96 = Class81.aClass96_1149;
	else
	    class96 = Class445_Sub12.aClass96_8651;
	Class639 class639 = OnlineStatus.method7519(1980410278);
	Class445_Sub27.method14369
	    (class103, anInt156 * 1011088115, Class380.anInt5660 * 904064679,
	     1139603851 * Class593.anInt7631, LoadingScreenDef.anInt5500 * 630071575,
	     i_224_, class96, class639,
	     ClientMessage.CHOOSEOPTION.getLocalisedMessage(VarPlayerDomain.currentLocale,
						 (short) 16463),
	     (byte) 0);
	int i_226_
	    = 255 - -254997353 * Class25.anInt212 - anInt144 * 932005875;
	if (i_226_ < 0)
	    i_226_ = 0;
	int i_227_ = Class106.aClass580_1503.method12718(745505161);
	int i_228_ = Class106.aClass580_1503.method12740((byte) -3);
	if (!aBool171) {
	    int i_229_ = 0;
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7692(1599861131))) {
		int i_230_ = (1149989507 * anInt164 * (anInt148 * 1327183635
						       - 1 - i_229_)
			      + (1 + (i_221_ + i_224_
				      + class639.anInt8258 * -351886683)));
		if (i_227_ > anInt156 * 1011088115
		    && i_227_ < (1011088115 * anInt156
				 + Class593.anInt7631 * 1139603851)
		    && i_228_ > i_230_ - -351886683 * class639.anInt8258 - 1
		    && i_228_ < 326424439 * class639.anInt8260 + i_230_
		    && (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aBool10876))
		    class103.method2396(1011088115 * anInt156,
					(i_230_
					 - -351886683 * class639.anInt8258),
					Class593.anInt7631 * 1139603851,
					anInt164 * 1149989507,
					(i_226_ << 24
					 | 382464113 * Class509.anInt6682),
					1);
		i_229_++;
	    }
	} else {
	    int i_231_ = 0;
	    for (Class241_Sub39_Sub10 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7440(-1397088259));
		 class241_sub39_sub10 != null;
		 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7435((byte) -1))) {
		int i_232_ = (1149989507 * anInt164 * i_231_
			      + (1 + (i_224_ + i_221_
				      + -351886683 * class639.anInt8258)));
		if (i_227_ > 1011088115 * anInt156
		    && i_227_ < (Class593.anInt7631 * 1139603851
				 + 1011088115 * anInt156)
		    && i_228_ > i_232_ - -351886683 * class639.anInt8258 - 1
		    && i_228_ < i_232_ + 326424439 * class639.anInt8260
		    && ((((Class241_Sub39_Sub10) class241_sub39_sub10)
			 .anInt10867) * 1633676605 > 1
			|| ((Class241_Sub39_Sub11) (Class241_Sub39_Sub11)
			    (((Class241_Sub39_Sub10) class241_sub39_sub10)
			     .aClass410_10866.aClass241_Sub39_5934
			     .aClass241_Sub39_10148)).aBool10876))
		    class103.method2396(1011088115 * anInt156,
					(i_232_
					 - class639.anInt8258 * -351886683),
					Class593.anInt7631 * 1139603851,
					1149989507 * anInt164,
					(i_226_ << 24
					 | Class509.anInt6682 * 382464113),
					1);
		i_231_++;
	    }
	    if (null != aClass241_Sub39_Sub10_143) {
		Class445_Sub27.method14369(class103,
					   1955430821 * Class193.anInt2298,
					   Class4.anInt16 * 282057643,
					   anInt147 * -885853667,
					   Class395.anInt5784 * -950722911,
					   i_224_, class96, class639,
					   (((Class241_Sub39_Sub10)
					     aClass241_Sub39_Sub10_143)
					    .aString10865),
					   (byte) 0);
		i_231_ = 0;
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7440(-1397088259));
		     null != class241_sub39_sub11;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7435((byte) -1))) {
		    int i_233_ = (1149989507 * anInt164 * i_231_
				  + (1 + (Class4.anInt16 * 282057643 + i_224_
					  + -351886683 * class639.anInt8258)));
		    if (i_227_ > Class193.anInt2298 * 1955430821
			&& i_227_ < (1955430821 * Class193.anInt2298
				     + anInt147 * -885853667)
			&& (i_228_
			    > i_233_ - -351886683 * class639.anInt8258 - 1)
			&& i_228_ < i_233_ + class639.anInt8260 * 326424439
			&& (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aBool10876))
			class103.method2396
			    (1955430821 * Class193.anInt2298,
			     i_233_ - -351886683 * class639.anInt8258,
			     anInt147 * -885853667, 1149989507 * anInt164,
			     i_226_ << 24 | Class509.anInt6682 * 382464113, 1);
		    i_231_++;
		}
		Class158.method3403(class103, 1955430821 * Class193.anInt2298,
				    282057643 * Class4.anInt16,
				    -885853667 * anInt147,
				    Class395.anInt5784 * -950722911, i_224_,
				    -1179087116);
	    }
	}
	Class158.method3403(class103, 1011088115 * anInt156,
			    904064679 * Class380.anInt5660,
			    1139603851 * Class593.anInt7631,
			    630071575 * LoadingScreenDef.anInt5500, i_224_, -97289656);
	if (!aBool171) {
	    int i_234_ = 0;
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7692(-108840762))) {
		int i_235_
		    = ((anInt148 * 1327183635 - 1 - i_234_) * (anInt164
							       * 1149989507)
		       + (class639.anInt8258 * -351886683 + (i_224_ + i_221_)
			  + 1));
		Class338.method6113(i_227_, i_228_, i, i_221_, i_222_, i_223_,
				    i_235_, class241_sub39_sub11, class96,
				    class639,
				    (BaseVarType.anInt2541 * -304788339
				     | ~0xffffff),
				    433761765 * Class8.anInt45 | ~0xffffff,
				    611620268);
		i_234_++;
	    }
	} else {
	    int i_236_ = 0;
	    for (Class241_Sub39_Sub10 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7440(-1397088259));
		 class241_sub39_sub10 != null;
		 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7435((byte) -1))) {
		int i_237_ = (i_236_ * (1149989507 * anInt164)
			      + (Class380.anInt5660 * 904064679 + i_224_
				 + -351886683 * class639.anInt8258 + 1));
		if (1 == (((Class241_Sub39_Sub10) class241_sub39_sub10)
			  .anInt10867) * 1633676605)
		    Class338.method6113(i_227_, i_228_, anInt156 * 1011088115,
					904064679 * Class380.anInt5660,
					1139603851 * Class593.anInt7631,
					LoadingScreenDef.anInt5500 * 630071575, i_237_,
					((Class241_Sub39_Sub11)
					 (((Class241_Sub39_Sub10)
					   class241_sub39_sub10)
					  .aClass410_10866.aClass241_Sub39_5934
					  .aClass241_Sub39_10148)),
					class96, class639,
					(BaseVarType.anInt2541 * -304788339
					 | ~0xffffff),
					Class8.anInt45 * 433761765 | ~0xffffff,
					1094286939);
		else
		    Class544.method11985
			(i_227_, i_228_, 1011088115 * anInt156,
			 904064679 * Class380.anInt5660,
			 Class593.anInt7631 * 1139603851,
			 LoadingScreenDef.anInt5500 * 630071575, i_237_,
			 class241_sub39_sub10, class96, class639,
			 -304788339 * BaseVarType.anInt2541 | ~0xffffff,
			 Class8.anInt45 * 433761765 | ~0xffffff, -1172937453);
		i_236_++;
	    }
	    if (null != aClass241_Sub39_Sub10_143) {
		i_236_ = 0;
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7440(-1397088259));
		     null != class241_sub39_sub11;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7435((byte) -1))) {
		    int i_238_ = (class639.anInt8258 * -351886683
				  + (i_224_ + 282057643 * Class4.anInt16) + 1
				  + i_236_ * (anInt164 * 1149989507));
		    Class338.method6113
			(i_227_, i_228_, Class193.anInt2298 * 1955430821,
			 282057643 * Class4.anInt16, -885853667 * anInt147,
			 Class395.anInt5784 * -950722911, i_238_,
			 class241_sub39_sub11, class96, class639,
			 BaseVarType.anInt2541 * -304788339 | ~0xffffff,
			 Class8.anInt45 * 433761765 | ~0xffffff, 1335848305);
		    i_236_++;
		}
	    }
	}
    }
    
    public static void method767() {
	Class445_Sub30.aClass168_8711 = null;
	Class23.aClass168_208 = null;
	Class363.aClass168_5533 = null;
	Class570.aClass168_7359 = null;
	Class363.aClass168_5534 = null;
	Exception_Sub5.aClass168_10705 = null;
	Class102.aClass168_1448 = null;
	Class479.aClass168_6416 = null;
	Class445_Sub12.aClass96_8651 = null;
	Class175.aClass639_2122 = null;
    }
    
    public static void method768() {
	Class445_Sub30.aClass168_8711 = null;
	Class23.aClass168_208 = null;
	Class363.aClass168_5533 = null;
	Class570.aClass168_7359 = null;
	Class363.aClass168_5534 = null;
	Exception_Sub5.aClass168_10705 = null;
	Class102.aClass168_1448 = null;
	Class479.aClass168_6416 = null;
	Class445_Sub12.aClass96_8651 = null;
	Class175.aClass639_2122 = null;
    }
    
    public static void method769() {
	Class571.method12544(1378622690);
	Class133.aClass168Array1613 = null;
    }
    
    public static void method770(Class168[] class168s) {
	Class214.anInt2514 = class168s.length * 864018427;
	Class133.aClass168Array1613
	    = new Class168[10 + -1959242957 * Class214.anInt2514];
	Class242.anIntArray2783
	    = new int[10 + -1959242957 * Class214.anInt2514];
	System.arraycopy(class168s, 0, Class133.aClass168Array1613, 0,
			 -1959242957 * Class214.anInt2514);
	for (int i = 0; i < Class214.anInt2514 * -1959242957; i++)
	    Class242.anIntArray2783[i]
		= Class133.aClass168Array1613[i].method3616();
	for (int i = -1959242957 * Class214.anInt2514;
	     i < Class133.aClass168Array1613.length; i++)
	    Class242.anIntArray2783[i] = 12;
    }
    
    public static void method771() {
	Class445_Sub30.aClass168_8711 = null;
	Class23.aClass168_208 = null;
	Class363.aClass168_5533 = null;
	Class570.aClass168_7359 = null;
	Class363.aClass168_5534 = null;
	Exception_Sub5.aClass168_10705 = null;
	Class102.aClass168_1448 = null;
	Class479.aClass168_6416 = null;
	Class445_Sub12.aClass96_8651 = null;
	Class175.aClass639_2122 = null;
    }
    
    static void method772(Class103 class103) {
	if (aBool141)
	    Class546.method11992(class103, 349913297);
	else
	    Class455.method10568(class103, -1133865428);
    }
    
    public static void method773(Class168[] class168s) {
	Class214.anInt2514 = class168s.length * 864018427;
	Class133.aClass168Array1613
	    = new Class168[10 + -1959242957 * Class214.anInt2514];
	Class242.anIntArray2783
	    = new int[10 + -1959242957 * Class214.anInt2514];
	System.arraycopy(class168s, 0, Class133.aClass168Array1613, 0,
			 -1959242957 * Class214.anInt2514);
	for (int i = 0; i < Class214.anInt2514 * -1959242957; i++)
	    Class242.anIntArray2783[i]
		= Class133.aClass168Array1613[i].method3616();
	for (int i = -1959242957 * Class214.anInt2514;
	     i < Class133.aClass168Array1613.length; i++)
	    Class242.anIntArray2783[i] = 12;
    }
    
    public static void method774(Class168[] class168s) {
	Class214.anInt2514 = class168s.length * 864018427;
	Class133.aClass168Array1613
	    = new Class168[10 + -1959242957 * Class214.anInt2514];
	Class242.anIntArray2783
	    = new int[10 + -1959242957 * Class214.anInt2514];
	System.arraycopy(class168s, 0, Class133.aClass168Array1613, 0,
			 -1959242957 * Class214.anInt2514);
	for (int i = 0; i < Class214.anInt2514 * -1959242957; i++)
	    Class242.anIntArray2783[i]
		= Class133.aClass168Array1613[i].method3616();
	for (int i = -1959242957 * Class214.anInt2514;
	     i < Class133.aClass168Array1613.length; i++)
	    Class242.anIntArray2783[i] = 12;
    }
    
    static void method775(int i, int i_239_) {
	anInt135 = -1859189089 * i;
	anInt177 = 773548735 * i_239_;
    }
    
    static void method776(int i, int i_240_) {
	if (Class128.aClass513_1589.aBool6714
	    || (1327183635 * anInt148 != 1
		&& (!Class120_Sub18.aBool10606 || 2 != anInt148 * 1327183635
		    || !(((Class241_Sub39_Sub11)
			  Class540.aClass241_Sub39_Sub11_7002)
			     .aString10871.equals
			 (ClientMessage.FACEHERE.getLocalisedMessage
			  (VarPlayerDomain.currentLocale, (short) 27911)))))) {
	    Class639 class639 = OnlineStatus.method7519(2116719674);
	    int i_241_
		= (class639.method13562
		   (ClientMessage.CHOOSEOPTION
			.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 19957),
		    (byte) 52));
	    int i_242_;
	    if (!aBool171) {
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    aClass429_150.method7694(16711935));
		     class241_sub39_sub11 != null;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    aClass429_150.method7692(1506432515))) {
		    int i_243_ = Class277.method5374(class241_sub39_sub11,
						     class639, (byte) -21);
		    if (i_243_ > i_241_)
			i_241_ = i_243_;
		}
		i_241_ += 8;
		i_242_ = 21 + anInt148 * 1327183635 * (1149989507 * anInt164);
		LoadingScreenDef.anInt5500
		    = -1996937561 * ((aBool168 ? 26 : 22)
				     + anInt148 * 1327183635 * (anInt164
								* 1149989507));
	    } else {
		for (Class241_Sub39_Sub10 class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7440(-1397088259));
		     null != class241_sub39_sub10;
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7435((byte) -1))) {
		    int i_244_;
		    if (1 == 1633676605 * ((Class241_Sub39_Sub10)
					   class241_sub39_sub10).anInt10867)
			i_244_
			    = Class277.method5374(((Class241_Sub39_Sub11)
						   (((Class241_Sub39_Sub10)
						     class241_sub39_sub10)
						    .aClass410_10866
						    .aClass241_Sub39_5934
						    .aClass241_Sub39_10148)),
						  class639, (byte) -29);
		    else
			i_244_ = Class106.method2677(class241_sub39_sub10,
						     class639, 93841981);
		    if (i_244_ > i_241_)
			i_241_ = i_244_;
		}
		i_241_ += 8;
		i_242_ = 1149989507 * anInt164 * (-1887420811 * anInt149) + 21;
		LoadingScreenDef.anInt5500
		    = (anInt149 * -1887420811 * (1149989507 * anInt164)
		       + (aBool168 ? 26 : 22)) * -1996937561;
	    }
	    i_241_ += 10;
	    int i_245_ = i - i_241_ / 2;
	    if (i_245_ + i_241_ > -1080559003 * Class494.canvasWid)
		i_245_ = Class494.canvasWid * -1080559003 - i_241_;
	    if (i_245_ < 0)
		i_245_ = 0;
	    int i_246_ = i_240_;
	    if (i_246_ + i_242_ > Class67.canvasHei * 963058943)
		i_246_ = 963058943 * Class67.canvasHei - i_242_;
	    if (i_246_ < 0)
		i_246_ = 0;
	    anInt156 = i_245_ * -1574130117;
	    Class380.anInt5660 = i_246_ * 71817495;
	    Class593.anInt7631 = -1038752221 * i_241_;
	    anInt144 = (int) (Math.random() * 24.0) * -276059845;
	    aBool141 = true;
	}
    }
    
    static void method777(int i, int i_247_) {
	anInt135 = -1859189089 * i;
	anInt177 = 773548735 * i_247_;
    }
    
    static void method778(int i, int i_248_) {
	anInt135 = -1859189089 * i;
	anInt177 = 773548735 * i_248_;
    }
    
    static void method779(String string, String string_249_, int i, int i_250_,
			  int i_251_, long l, int i_252_, int i_253_,
			  boolean bool, boolean bool_254_, long l_255_,
			  boolean bool_256_) {
	if (!aBool141 && anInt148 * 1327183635 < 506) {
	    i = i != -1 ? i : client.anInt8458 * 12960807;
	    Class241_Sub39_Sub11 class241_sub39_sub11
		= new Class241_Sub39_Sub11(string, string_249_, i, i_250_,
					   i_251_, l, i_252_, i_253_, bool,
					   bool_254_, l_255_, bool_256_);
	    Class355.method6437(class241_sub39_sub11, 608299751);
	}
    }
    
    static void method780(InterfaceComponent class58, int i, int i_257_) {
	aClass58_158 = class58;
	anInt159 = i * 254062753;
	anInt160 = i_257_ * -1518173867;
    }
    
    public static void method781(Class168[] class168s) {
	Class214.anInt2514 = class168s.length * 864018427;
	Class133.aClass168Array1613
	    = new Class168[10 + -1959242957 * Class214.anInt2514];
	Class242.anIntArray2783
	    = new int[10 + -1959242957 * Class214.anInt2514];
	System.arraycopy(class168s, 0, Class133.aClass168Array1613, 0,
			 -1959242957 * Class214.anInt2514);
	for (int i = 0; i < Class214.anInt2514 * -1959242957; i++)
	    Class242.anIntArray2783[i]
		= Class133.aClass168Array1613[i].method3616();
	for (int i = -1959242957 * Class214.anInt2514;
	     i < Class133.aClass168Array1613.length; i++)
	    Class242.anIntArray2783[i] = 12;
    }
    
    static void method782(InterfaceComponent class58, int i, int i_258_) {
	aClass58_158 = class58;
	anInt159 = i * 254062753;
	anInt160 = i_258_ * -1518173867;
    }
    
    static void method783(int i, int i_259_) {
	anInt135 = -1859189089 * i;
	anInt177 = 773548735 * i_259_;
    }
    
    public static Class241_Sub39_Sub11 method784() {
	return Class125.aClass241_Sub39_Sub11_1582;
    }
    
    public static Class241_Sub39_Sub11 method785() {
	return Class478.aClass241_Sub39_Sub11_6402;
    }
    
    public static Class241_Sub39_Sub11 method786() {
	return Class478.aClass241_Sub39_Sub11_6402;
    }
    
    static int[] method787(Class241_Sub39_Sub11 class241_sub39_sub11) {
	int[] is = null;
	if (Class107.method2687((((Class241_Sub39_Sub11) class241_sub39_sub11)
				 .anInt10879) * -142243581,
				1858825487))
	    is = (JS5.itemDefLoader.list
		  ((int) (-218357506993850339L
			  * (((Class241_Sub39_Sub11) class241_sub39_sub11)
			     .aLong10877)),
		   (short) 5935)
		  .anIntArray7949);
	else if (-1
		 != (((Class241_Sub39_Sub11) class241_sub39_sub11).slot2
		     * 1542395267))
	    is = (JS5.itemDefLoader.list
		  (1542395267 * (((Class241_Sub39_Sub11) class241_sub39_sub11)
				 .slot2),
		   (short) -15773)
		  .anIntArray7949);
	else if (Class321.method5931((((Class241_Sub39_Sub11)
				       class241_sub39_sub11).anInt10879
				      * -142243581),
				     (byte) 2)) {
	    ObjectNode class241_sub26
		= ((ObjectNode)
		   (client.aClass407_8457.get
		    ((long) (int) (-218357506993850339L
				   * ((Class241_Sub39_Sub11)
				      class241_sub39_sub11).aLong10877))));
	    if (null != class241_sub26) {
		NPC class475_sub1_sub1_sub3_sub2
		    = ((NPC)
		       class241_sub26.objectValue);
		NPCDefinition class401
		    = class475_sub1_sub1_sub3_sub2.definition;
		if (class401.transformTo != null)
		    class401
			= class401.method7176(Class1.aClass19_11,
					      Class1.aClass19_11, (byte) 37);
		if (class401 != null)
		    is = class401.anIntArray5862;
	    }
	} else if (AnimationConfig.method11961(-142243581 * (((Class241_Sub39_Sub11)
						       class241_sub39_sub11)
						      .anInt10879),
					-1131267264)) {
	    ObjectDefinition class526
		= (client.aClass238_8477.getObjectLoader(-2100172718).getObjectDefinition
		   ((int) ((-218357506993850339L
			    * (((Class241_Sub39_Sub11) class241_sub39_sub11)
			       .aLong10877)) >>> 32
			   & 0x7fffffffL),
		    577892407));
	    if (null != class526.toObjectIDs)
		class526
		    = class526.method11768(Class1.aClass19_11,
					   Class1.aClass19_11, -2045368887);
	    if (class526 != null)
		is = class526.anIntArray6833;
	}
	return is;
    }
    
    public static Class241_Sub39_Sub11 method788() {
	return Class478.aClass241_Sub39_Sub11_6402;
    }
    
    static String method789(InterfaceComponent class58, int i) {
	if (!client.method13624(class58).method15039(i, 65280)
	    && class58.onContextMenuSelect == null)
	    return null;
	if (class58.contextMenuOptions == null
	    || class58.contextMenuOptions.length <= i
	    || null == class58.contextMenuOptions[i]
	    || class58.contextMenuOptions[i].trim().length() == 0) {
	    if (client.aBool8403)
		return new StringBuilder().append("Hidden-").append(i)
			   .toString();
	    return null;
	}
	return class58.contextMenuOptions[i];
    }
    
    static void method790() {
	for (Class241_Sub39_Sub11 class241_sub39_sub11
		 = (Class241_Sub39_Sub11) aClass429_150.method7694(16711935);
	     null != class241_sub39_sub11;
	     class241_sub39_sub11 = ((Class241_Sub39_Sub11)
				     aClass429_150.method7692(-443716564))) {
	    if (Class62.method1618((((Class241_Sub39_Sub11)
				     class241_sub39_sub11).anInt10879
				    * -142243581),
				   274333224))
		Class11.method596(class241_sub39_sub11, -1887978286);
	}
    }
    
    public static String method791(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (aBool141 || class241_sub39_sub11 == null)
	    return "";
	return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10871;
    }
    
    public static String method792(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (aBool141 || null == class241_sub39_sub11)
	    return "";
	if ((((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869 == null
	     || ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869
		    .length() == 0)
	    && (((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
		!= null)
	    && ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
		   .length() > 0)
	    return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880;
	return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869;
    }
    
    public static boolean method793(int i, int i_260_) {
	if (!aBool141)
	    return false;
	int i_261_ = i >> 16;
	int i_262_ = i & 0xffff;
	if (Class187.aClass35Array2203[i_261_] == null
	    || (Class187.aClass35Array2203[i_261_].components[i_262_]
		== null))
	    return false;
	InterfaceComponent class58
	    = Class187.aClass35Array2203[i_261_].components[i_262_];
	if (i_260_ != -1 || 0 != class58.componentType * -1579470857) {
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7692(1273916746))) {
		if (i_260_ == (((Class241_Sub39_Sub11) class241_sub39_sub11)
			       .anInt10873) * -510105715
		    && ((((Class241_Sub39_Sub11) class241_sub39_sub11)
			 .anInt10874) * 1841217923
			== class58.componentHash * 445907013)
		    && (58 == (((Class241_Sub39_Sub11) class241_sub39_sub11)
			       .anInt10879) * -142243581
			|| (1007
			    == (((Class241_Sub39_Sub11) class241_sub39_sub11)
				.anInt10879) * -142243581)
			|| (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .anInt10879) * -142243581 == 25
			|| (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .anInt10879) * -142243581 == 57
			|| 30 == (((Class241_Sub39_Sub11) class241_sub39_sub11)
				  .anInt10879) * -142243581))
		    return true;
	    }
	} else {
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7692(1014046337))) {
		if ((((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10879
		     * -142243581) == 58
		    || 1007 == (((Class241_Sub39_Sub11) class241_sub39_sub11)
				.anInt10879) * -142243581
		    || -142243581 * ((Class241_Sub39_Sub11)
				     class241_sub39_sub11).anInt10879 == 25
		    || 57 == (((Class241_Sub39_Sub11) class241_sub39_sub11)
			      .anInt10879) * -142243581
		    || 30 == -142243581 * ((Class241_Sub39_Sub11)
					   class241_sub39_sub11).anInt10879) {
		    for (InterfaceComponent class58_263_
			     = Js5ConfigGroup.getInterfaceComponent((((Class241_Sub39_Sub11)
						    class241_sub39_sub11)
						   .anInt10874) * 1841217923,
						  (byte) -65);
			 class58_263_ != null;
			 class58_263_
			     = LoadingScreenDef.method6489((Class187.aClass35Array2203
						    [(class58_263_.componentHash
						      * 445907013) >> 16]),
						   class58_263_, 2104447097)) {
			if (445907013 * class58.componentHash
			    == class58_263_.componentHash * 445907013)
			    return true;
		    }
		}
	    }
	}
	return false;
    }
    
    public static int method794(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (aBool141)
	    return 6;
	if (class241_sub39_sub11 == null)
	    return 0;
	int i = (-142243581
		 * ((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10879);
	if (Class62.method1618(i, -209406985))
	    return 1;
	if (Class107.method2687(i, 1576236323))
	    return 2;
	if (AnimationConfig.method11961(i, -1904384333))
	    return 3;
	if (Class321.method5931(i, (byte) 2))
	    return 4;
	if (ObjectDefinition.method11809(i, 803768286))
	    return 7;
	if (i == 16)
	    return 8;
	return 5;
    }
    
    static void method795(Class103 class103) {
	int i = -10660793;
	Class410.method7456(class103, 1011088115 * anInt156,
			    Class380.anInt5660 * 904064679,
			    Class593.anInt7631 * 1139603851,
			    630071575 * LoadingScreenDef.anInt5500, i, -16777216,
			    (byte) 38);
	Class81.aClass96_1149.method2128
	    (ClientMessage.CHOOSEOPTION.getLocalisedMessage(VarPlayerDomain.currentLocale,
						 (short) 19975),
	     1011088115 * anInt156 + 3, 14 + Class380.anInt5660 * 904064679, i,
	     -1, 1841717961);
	int i_264_ = Class106.aClass580_1503.method12718(96905652);
	int i_265_ = Class106.aClass580_1503.method12740((byte) -34);
	if (!aBool171) {
	    int i_266_ = 0;
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7692(2132229058))) {
		int i_267_ = (31 + 904064679 * Class380.anInt5660
			      + ((anInt148 * 1327183635 - 1 - i_266_)
				 * (anInt164 * 1149989507)));
		Class338.method6113(i_264_, i_265_, anInt156 * 1011088115,
				    904064679 * Class380.anInt5660,
				    1139603851 * Class593.anInt7631,
				    630071575 * LoadingScreenDef.anInt5500, i_267_,
				    class241_sub39_sub11,
				    Class81.aClass96_1149, Class5.aClass639_19,
				    -1, -256, 438594294);
		i_266_++;
	    }
	} else {
	    int i_268_ = 0;
	    for (Class241_Sub39_Sub10 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7440(-1397088259));
		 class241_sub39_sub10 != null;
		 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7435((byte) -1))) {
		int i_269_ = (Class380.anInt5660 * 904064679 + 31
			      + i_268_ * (anInt164 * 1149989507));
		if (1633676605 * (((Class241_Sub39_Sub10) class241_sub39_sub10)
				  .anInt10867)
		    == 1)
		    Class338.method6113(i_264_, i_265_, 1011088115 * anInt156,
					Class380.anInt5660 * 904064679,
					Class593.anInt7631 * 1139603851,
					630071575 * LoadingScreenDef.anInt5500, i_269_,
					((Class241_Sub39_Sub11)
					 (((Class241_Sub39_Sub10)
					   class241_sub39_sub10)
					  .aClass410_10866.aClass241_Sub39_5934
					  .aClass241_Sub39_10148)),
					Class81.aClass96_1149,
					Class5.aClass639_19, -1, -256,
					835198966);
		else
		    Class544.method11985(i_264_, i_265_, anInt156 * 1011088115,
					 Class380.anInt5660 * 904064679,
					 Class593.anInt7631 * 1139603851,
					 630071575 * LoadingScreenDef.anInt5500,
					 i_269_, class241_sub39_sub10,
					 Class81.aClass96_1149,
					 Class5.aClass639_19, -1, -256,
					 2965443);
		i_268_++;
	    }
	    if (null != aClass241_Sub39_Sub10_143) {
		Class410.method7456(class103, Class193.anInt2298 * 1955430821,
				    282057643 * Class4.anInt16,
				    -885853667 * anInt147,
				    -950722911 * Class395.anInt5784, i,
				    -16777216, (byte) 32);
		Class81.aClass96_1149.method2128
		    ((((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
		      .aString10865),
		     3 + 1955430821 * Class193.anInt2298,
		     14 + Class4.anInt16 * 282057643, i, -1, 1841717961);
		i_268_ = 0;
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7440(-1397088259));
		     null != class241_sub39_sub11;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7435((byte) -1))) {
		    int i_270_ = (31 + 282057643 * Class4.anInt16
				  + 1149989507 * anInt164 * i_268_);
		    Class338.method6113(i_264_, i_265_,
					Class193.anInt2298 * 1955430821,
					282057643 * Class4.anInt16,
					anInt147 * -885853667,
					-950722911 * Class395.anInt5784,
					i_270_, class241_sub39_sub11,
					Class81.aClass96_1149,
					Class5.aClass639_19, -1, -256,
					441532107);
		    i_268_++;
		}
	    }
	}
    }
    
    static void method796
	(int i, int i_271_, int i_272_, int i_273_, int i_274_, int i_275_,
	 int i_276_, Class241_Sub39_Sub10 class241_sub39_sub10,
	 Class96 class96, Class639 class639, int i_277_, int i_278_) {
	if (i > i_272_ && i < i_272_ + i_274_
	    && i_271_ > i_276_ - class639.anInt8258 * -351886683 - 1
	    && i_271_ < 326424439 * class639.anInt8260 + i_276_)
	    i_277_ = i_278_;
	String string = Class334.method6068(class241_sub39_sub10, 685768355);
	class96.method2119(string, i_272_ + 3, i_276_, i_277_, 0,
			   client.aRandom8380, Class5.anInt28,
			   Class133.aClass168Array1613,
			   Class242.anIntArray2783, -993954547);
    }
    
    static void method797(Class266 class266, Class268 class268, int i,
			  int i_279_) {
	if (null == aClass268_165)
	    aClass268_165 = new Class268(class268);
	else
	    aClass268_165.method5199(class268);
	aClass266_167.method5175(class266);
	anInt163 = 1619027125 * i;
	anInt181 = 1627953123 * i_279_;
    }
    
    static void method798(Class266 class266, Class268 class268, int i,
			  int i_280_) {
	if (null == aClass268_165)
	    aClass268_165 = new Class268(class268);
	else
	    aClass268_165.method5199(class268);
	aClass266_167.method5175(class266);
	anInt163 = 1619027125 * i;
	anInt181 = 1627953123 * i_280_;
    }
    
    static void method799(Class266 class266, Class268 class268, int i,
			  int i_281_) {
	if (null == aClass268_165)
	    aClass268_165 = new Class268(class268);
	else
	    aClass268_165.method5199(class268);
	aClass266_167.method5175(class266);
	anInt163 = 1619027125 * i;
	anInt181 = 1627953123 * i_281_;
    }
    
    static void method800(Class266 class266, Class268 class268, int i,
			  int i_282_) {
	if (null == aClass268_165)
	    aClass268_165 = new Class268(class268);
	else
	    aClass268_165.method5199(class268);
	aClass266_167.method5175(class266);
	anInt163 = 1619027125 * i;
	anInt181 = 1627953123 * i_282_;
    }
    
    static void method801
	(NPC class475_sub1_sub1_sub3_sub2,
	 boolean bool) {
	if (1327183635 * anInt148 < 410) {
	    NPCDefinition class401 = class475_sub1_sub1_sub3_sub2.definition;
	    String string = class475_sub1_sub1_sub3_sub2.npcName;
	    if (class401.transformTo != null) {
		class401 = class401.method7176(Class1.aClass19_11,
					       Class1.aClass19_11, (byte) 36);
		if (class401 == null)
		    return;
		string = class401.name;
	    }
	    if (class401.aBool5839) {
		if (0
		    != class475_sub1_sub1_sub3_sub2.combatLevel * 1239473347) {
		    String string_283_
			= (GameDefinition.STELLARDAWN == client.currentGame
			   ? (ClientMessage.RATING.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 22616))
			   : (ClientMessage.LEVEL.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 20052)));
		    string = new StringBuilder().append(string).append
				 (Class410.method7458
				  ((1239473347
				    * class475_sub1_sub1_sub3_sub2.combatLevel),
				   (Class21.myPlayer
				    .anInt11502) * -1617461639,
				   (byte) 36))
				 .append
				 (Class6.aString29).append
				 (string_283_).append
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
								 476141900)
			   : null);
		    if ((-1622803377 * Class613.anInt7804 & 0x2) != 0
			&& (null == class603
			    || (class401.method7148((NPCDefinitionLoader.anInt5897
						     * 820722975),
						    (class603.defaultint
						     * 2015998927),
						    (byte) -128)
				!= 2015998927 * class603.defaultint)))
			Class534.method11882
			    (client.aString8464,
			     new StringBuilder().append(client.aString8465)
				 .append
				 (" ").append
				 (Class6.aString33).append
				 (" ").append
				 (Class338.method6112(16776960, -1910654473))
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
			strings = Class591.method12918(strings, 19676332);
		    if (null != strings) {
			for (int i = strings.length - 1; i >= 0; i--) {
			    if (strings[i] != null
				&& (class401.aByte5863 == 0
				    || (!(strings[i].equalsIgnoreCase
					  (ClientMessage.ATTACK.getLocalisedMessage
					   (VarPlayerDomain.currentLocale,
					    (short) 17575)))
					&& !(strings[i].equalsIgnoreCase
					     (ClientMessage.EXAMINE
						  .getLocalisedMessage
					      (VarPlayerDomain.currentLocale,
					       (short) 17811)))))) {
				int i_284_ = 0;
				int i_285_ = client.anInt8387 * 886936997;
				if (0 == i)
				    i_284_ = 9;
				if (i == 1)
				    i_284_ = 10;
				if (2 == i)
				    i_284_ = 11;
				if (i == 3)
				    i_284_ = 12;
				if (i == 4)
				    i_284_ = 13;
				if (i == 5)
				    i_284_ = 1003;
				int i_286_ = class401.method7153(i, (byte) -9);
				if (-1 != i_286_)
				    i_285_ = i_286_;
				Class534.method11882
				    (strings[i],
				     new StringBuilder().append
					 (Class338.method6112(16776960,
							      -1153216654))
					 .append
					 (string).toString(),
				     ((strings[i].equalsIgnoreCase
				       (ClientMessage.ATTACK.getLocalisedMessage
					(VarPlayerDomain.currentLocale,
					 (short) 19316)))
				      ? class401.anInt5822 * 789838663
				      : i_285_),
				     i_284_, -1,
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
			    for (int i = 0; i < strings.length; i++) {
				if (null != strings[i]
				    && ((strings[i].equalsIgnoreCase
					 (ClientMessage.ATTACK.getLocalisedMessage
					  (VarPlayerDomain.currentLocale,
					   (short) 31119)))
					|| (strings[i].equalsIgnoreCase
					    (ClientMessage.EXAMINE
						 .getLocalisedMessage
					     (VarPlayerDomain.currentLocale,
					      (short) 25148))))) {
				    short i_287_ = 0;
				    if ((1239473347
					 * (class475_sub1_sub1_sub3_sub2
					    .combatLevel))
					> (Class21
					   .myPlayer
					   .anInt11502) * -1617461639)
					i_287_ = (short) 2000;
				    short i_288_ = 0;
				    int i_289_ = client.anInt8387 * 886936997;
				    if (i == 0)
					i_288_ = (short) 9;
				    if (1 == i)
					i_288_ = (short) 10;
				    if (i == 2)
					i_288_ = (short) 11;
				    if (3 == i)
					i_288_ = (short) 12;
				    if (4 == i)
					i_288_ = (short) 13;
				    if (i == 5)
					i_288_ = (short) 1003;
				    if (i_288_ != 0)
					i_288_ += i_287_;
				    int i_290_
					= class401.method7153(i, (byte) -74);
				    if (-1 != i_290_)
					i_289_ = i_290_;
				    Class534.method11882
					(strings[i],
					 new StringBuilder().append
					     (Class338.method6112(16776960,
								  -1335824495))
					     .append
					     (string).toString(),
					 ((strings[i].equalsIgnoreCase
					   (ClientMessage.ATTACK.getLocalisedMessage
					    (VarPlayerDomain.currentLocale,
					     (short) 22716)))
					  ? 789838663 * class401.anInt5822
					  : i_289_),
					 i_288_, -1,
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
    
    static void method802(Class103 class103) {
	if (!aBool168)
	    Class241_Sub2.method14416(class103, -1509657179);
	else
	    Class236.method4728(class103, (byte) 7);
    }
    
    static void method803(Class103 class103) {
	if ((1327183635 * anInt148 >= 2 || client.aBool8544)
	    && null == client.aClass58_8365) {
	    String string;
	    if (client.aBool8544 && 1327183635 * anInt148 < 2)
		string = new StringBuilder().append(client.aString8464).append
			     (ClientMessage.MINISEPERATOR.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 28891))
			     .append
			     (client.aString8465).append
			     (" ").append
			     (Class6.aString33).toString();
	    else if (SparseVarDomain.method3110((byte) -41)
		     && 1327183635 * anInt148 > 2)
		string
		    = SkillTypeIterator.method11257(Class125.aClass241_Sub39_Sub11_1582,
					   (byte) 84);
	    else {
		Class241_Sub39_Sub11 class241_sub39_sub11
		    = Class125.aClass241_Sub39_Sub11_1582;
		if (null == class241_sub39_sub11)
		    return;
		string = SkillTypeIterator.method11257(class241_sub39_sub11, (byte) 32);
		int[] is
		    = Class213.method4309(class241_sub39_sub11, 1904340377);
		if (null != is)
		    string
			= new StringBuilder().append(string).append
			      (Class221.method4476(is, (byte) -1)).toString();
	    }
	    if (1327183635 * anInt148 > 2)
		string = new StringBuilder().append(string).append
			     (Class338.method6112(16777215, -979503645)).append
			     (" / ").append
			     (1327183635 * anInt148 - 2).append
			     (ClientMessage.MOREOPTIONS.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 29039))
			     .toString();
	    if (null != aClass58_158) {
		Class96 class96
		    = aClass58_158.method1589(Class425.aClass344_6080,
					      client.anInterface26_8552,
					      -172363671);
		if (null == class96)
		    class96 = Class81.aClass96_1149;
		class96.method2120(string, anInt159 * -699845791,
				   anInt160 * -96898051,
				   aClass58_158.anInt850 * 439139681,
				   aClass58_158.scrollMinY * 1463495207,
				   -1687836431 * aClass58_158.colour,
				   1143403757 * aClass58_158.anInt881,
				   aClass58_158.horizontalTextAlign * 1543601685,
				   1285591903 * aClass58_158.verticalTextAlign,
				   client.aRandom8380, Class5.anInt28,
				   client.anIntArray8527,
				   Class133.aClass168Array1613,
				   Class242.anIntArray2783, (byte) -107);
		Class579.method12709(client.anIntArray8527[0],
				     client.anIntArray8527[1],
				     client.anIntArray8527[2],
				     client.anIntArray8527[3], (byte) 41);
	    }
	}
    }
    
    static void method804(Class103 class103) {
	if ((1327183635 * anInt148 >= 2 || client.aBool8544)
	    && null == client.aClass58_8365) {
	    String string;
	    if (client.aBool8544 && 1327183635 * anInt148 < 2)
		string = new StringBuilder().append(client.aString8464).append
			     (ClientMessage.MINISEPERATOR.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 18158))
			     .append
			     (client.aString8465).append
			     (" ").append
			     (Class6.aString33).toString();
	    else if (SparseVarDomain.method3110((byte) -3)
		     && 1327183635 * anInt148 > 2)
		string
		    = SkillTypeIterator.method11257(Class125.aClass241_Sub39_Sub11_1582,
					   (byte) 32);
	    else {
		Class241_Sub39_Sub11 class241_sub39_sub11
		    = Class125.aClass241_Sub39_Sub11_1582;
		if (null == class241_sub39_sub11)
		    return;
		string = SkillTypeIterator.method11257(class241_sub39_sub11, (byte) 29);
		int[] is
		    = Class213.method4309(class241_sub39_sub11, -343199965);
		if (null != is)
		    string
			= new StringBuilder().append(string).append
			      (Class221.method4476(is, (byte) -42)).toString();
	    }
	    if (1327183635 * anInt148 > 2)
		string
		    = new StringBuilder().append(string).append
			  (Class338.method6112(16777215, -1469123991)).append
			  (" / ").append
			  (1327183635 * anInt148 - 2).append
			  (ClientMessage.MOREOPTIONS.getLocalisedMessage
			   (VarPlayerDomain.currentLocale, (short) 23223))
			  .toString();
	    if (null != aClass58_158) {
		Class96 class96
		    = aClass58_158.method1589(Class425.aClass344_6080,
					      client.anInterface26_8552,
					      693395244);
		if (null == class96)
		    class96 = Class81.aClass96_1149;
		class96.method2120(string, anInt159 * -699845791,
				   anInt160 * -96898051,
				   aClass58_158.anInt850 * 439139681,
				   aClass58_158.scrollMinY * 1463495207,
				   -1687836431 * aClass58_158.colour,
				   1143403757 * aClass58_158.anInt881,
				   aClass58_158.horizontalTextAlign * 1543601685,
				   1285591903 * aClass58_158.verticalTextAlign,
				   client.aRandom8380, Class5.anInt28,
				   client.anIntArray8527,
				   Class133.aClass168Array1613,
				   Class242.anIntArray2783, (byte) -121);
		Class579.method12709(client.anIntArray8527[0],
				     client.anIntArray8527[1],
				     client.anIntArray8527[2],
				     client.anIntArray8527[3], (byte) -43);
	    }
	}
    }
    
    static boolean method805() {
	return anInt148 * 1327183635 > 0;
    }
    
    static void method806(Class103 class103, int i, int i_291_, int i_292_,
			  int i_293_, int i_294_, int i_295_) {
	class103.method2263(i, i_291_, i_292_, i_293_, i_294_, (byte) -15);
	class103.method2263(1 + i, 1 + i_291_, i_292_ - 2, 16, i_295_,
			    (byte) -67);
	class103.method2262(1 + i, i_291_ + 18, i_292_ - 2, i_293_ - 19,
			    i_295_, -1534972436);
    }
    
    static int[] method807(Class241_Sub39_Sub11 class241_sub39_sub11) {
	int[] is = null;
	if (Class107.method2687((((Class241_Sub39_Sub11) class241_sub39_sub11)
				 .anInt10879) * -142243581,
				64989149))
	    is = (JS5.itemDefLoader.list
		  ((int) (-218357506993850339L
			  * (((Class241_Sub39_Sub11) class241_sub39_sub11)
			     .aLong10877)),
		   (short) 17866)
		  .anIntArray7949);
	else if (-1
		 != (((Class241_Sub39_Sub11) class241_sub39_sub11).slot2
		     * 1542395267))
	    is = (JS5.itemDefLoader.list
		  (1542395267 * (((Class241_Sub39_Sub11) class241_sub39_sub11)
				 .slot2),
		   (short) 7636)
		  .anIntArray7949);
	else if (Class321.method5931((((Class241_Sub39_Sub11)
				       class241_sub39_sub11).anInt10879
				      * -142243581),
				     (byte) 2)) {
	    ObjectNode class241_sub26
		= ((ObjectNode)
		   (client.aClass407_8457.get
		    ((long) (int) (-218357506993850339L
				   * ((Class241_Sub39_Sub11)
				      class241_sub39_sub11).aLong10877))));
	    if (null != class241_sub26) {
		NPC class475_sub1_sub1_sub3_sub2
		    = ((NPC)
		       class241_sub26.objectValue);
		NPCDefinition class401
		    = class475_sub1_sub1_sub3_sub2.definition;
		if (class401.transformTo != null)
		    class401
			= class401.method7176(Class1.aClass19_11,
					      Class1.aClass19_11, (byte) 18);
		if (class401 != null)
		    is = class401.anIntArray5862;
	    }
	} else if (AnimationConfig.method11961(-142243581 * (((Class241_Sub39_Sub11)
						       class241_sub39_sub11)
						      .anInt10879),
					-1710811653)) {
	    ObjectDefinition class526
		= (client.aClass238_8477.getObjectLoader(-2026172608).getObjectDefinition
		   ((int) ((-218357506993850339L
			    * (((Class241_Sub39_Sub11) class241_sub39_sub11)
			       .aLong10877)) >>> 32
			   & 0x7fffffffL),
		    577892407));
	    if (null != class526.toObjectIDs)
		class526
		    = class526.method11768(Class1.aClass19_11,
					   Class1.aClass19_11, -1824024673);
	    if (class526 != null)
		is = class526.anIntArray6833;
	}
	return is;
    }
    
    public static int method808(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (aBool141)
	    return 6;
	if (class241_sub39_sub11 == null)
	    return 0;
	int i = (-142243581
		 * ((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10879);
	if (Class62.method1618(i, 272042185))
	    return 1;
	if (Class107.method2687(i, 2027896064))
	    return 2;
	if (AnimationConfig.method11961(i, -2131598188))
	    return 3;
	if (Class321.method5931(i, (byte) 2))
	    return 4;
	if (ObjectDefinition.method11809(i, 134694621))
	    return 7;
	if (i == 16)
	    return 8;
	return 5;
    }
    
    static {
	aBool141 = false;
	aBool171 = false;
	aClass241_Sub39_Sub10_143 = null;
	anInt138 = 0;
	anInt148 = 0;
	anInt149 = 0;
	aClass429_150 = new NodeCollection();
	aClass407_180 = new HashTable(16);
	aClass410_152 = new Class410();
	aClass429_153 = new NodeCollection();
	aClass429_154 = new NodeCollection();
	aClass129_155 = new Class129(30);
	aClass58_158 = null;
	anInt159 = -254062753;
	anInt160 = 1518173867;
	anInt135 = 1859189089;
	anInt177 = -773548735;
	anInt163 = 0;
	anInt181 = 0;
	aClass268_165 = null;
	aClass268_166 = new Class268();
	aClass266_167 = new Class266();
	aBool168 = false;
	anInt144 = 0;
	anInt162 = 20524323;
	aClass129_172 = new Class129(8);
	aFloatArray137 = new float[4];
    }
    
    static void method809
	(int i, int i_296_, int i_297_, int i_298_, int i_299_, int i_300_,
	 int i_301_, Class241_Sub39_Sub11 class241_sub39_sub11,
	 Class96 class96, Class639 class639, int i_302_, int i_303_) {
	if (i > i_297_ && i < i_299_ + i_297_
	    && i_296_ > i_301_ - -351886683 * class639.anInt8258 - 1
	    && i_296_ < i_301_ + 326424439 * class639.anInt8260
	    && ((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10876)
	    i_302_ = i_303_;
	int[] is = Class213.method4309(class241_sub39_sub11, 1039891498);
	String string = SkillTypeIterator.method11257(class241_sub39_sub11, (byte) 101);
	if (is != null)
	    string = new StringBuilder().append(string).append
			 (Class221.method4476(is, (byte) 23)).toString();
	class96.method2119(string, i_297_ + 3, i_301_, i_302_, 0,
			   client.aRandom8380, Class5.anInt28,
			   Class133.aClass168Array1613,
			   Class242.anIntArray2783, 1624378117);
	if (((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10868)
	    Class443.aClass168_6165.method3646
		(5 + i_297_ + class639.method13562(string, (byte) 67),
		 i_301_ - class639.anInt8258 * -351886683);
    }
    
    static void method810
	(int i, int i_304_, int i_305_, int i_306_, int i_307_, int i_308_,
	 int i_309_, Class241_Sub39_Sub11 class241_sub39_sub11,
	 Class96 class96, Class639 class639, int i_310_, int i_311_) {
	if (i > i_305_ && i < i_307_ + i_305_
	    && i_304_ > i_309_ - -351886683 * class639.anInt8258 - 1
	    && i_304_ < i_309_ + 326424439 * class639.anInt8260
	    && ((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10876)
	    i_310_ = i_311_;
	int[] is = Class213.method4309(class241_sub39_sub11, 334705169);
	String string = SkillTypeIterator.method11257(class241_sub39_sub11, (byte) 76);
	if (is != null)
	    string = new StringBuilder().append(string).append
			 (Class221.method4476(is, (byte) 110)).toString();
	class96.method2119(string, i_305_ + 3, i_309_, i_310_, 0,
			   client.aRandom8380, Class5.anInt28,
			   Class133.aClass168Array1613,
			   Class242.anIntArray2783, 251134202);
	if (((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10868)
	    Class443.aClass168_6165.method3646
		(5 + i_305_ + class639.method13562(string, (byte) 11),
		 i_309_ - class639.anInt8258 * -351886683);
    }
    
    public static String method811(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (aBool141 || null == class241_sub39_sub11)
	    return "";
	if ((((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869 == null
	     || ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869
		    .length() == 0)
	    && (((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
		!= null)
	    && ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
		   .length() > 0)
	    return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880;
	return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869;
    }
    
    static void method812
	(int i, int i_312_, int i_313_, int i_314_, int i_315_, int i_316_,
	 int i_317_, Class241_Sub39_Sub10 class241_sub39_sub10,
	 Class96 class96, Class639 class639, int i_318_, int i_319_) {
	if (i > i_313_ && i < i_313_ + i_315_
	    && i_312_ > i_317_ - class639.anInt8258 * -351886683 - 1
	    && i_312_ < 326424439 * class639.anInt8260 + i_317_)
	    i_318_ = i_319_;
	String string = Class334.method6068(class241_sub39_sub10, -2117887760);
	class96.method2119(string, i_313_ + 3, i_317_, i_318_, 0,
			   client.aRandom8380, Class5.anInt28,
			   Class133.aClass168Array1613,
			   Class242.anIntArray2783, -870361237);
    }
    
    static void method813
	(int i, int i_320_, int i_321_, int i_322_, int i_323_, int i_324_,
	 int i_325_, Class241_Sub39_Sub10 class241_sub39_sub10,
	 Class96 class96, Class639 class639, int i_326_, int i_327_) {
	if (i > i_321_ && i < i_321_ + i_323_
	    && i_320_ > i_325_ - class639.anInt8258 * -351886683 - 1
	    && i_320_ < 326424439 * class639.anInt8260 + i_325_)
	    i_326_ = i_327_;
	String string = Class334.method6068(class241_sub39_sub10, -1966135769);
	class96.method2119(string, i_321_ + 3, i_325_, i_326_, 0,
			   client.aRandom8380, Class5.anInt28,
			   Class133.aClass168Array1613,
			   Class242.anIntArray2783, -729887150);
    }
    
    static void method814(Class103 class103, int i, int i_328_, int i_329_,
			  int i_330_, int i_331_) {
	if ((Exception_Sub5.aClass168_10705 == null
	     || Class570.aClass168_7359 == null
	     || Class102.aClass168_1448 == null)
	    && Class284.SPRITES_ARCHIVE
		   .method4250(Class540.anInt7003 * -1741231297, -318430052)
	    && Class284.SPRITES_ARCHIVE.method4250((Exception_Sub3.anInt10695
						   * 726901365),
						  324797950)
	    && Class284.SPRITES_ARCHIVE
		   .method4250(428909623 * Class199.anInt2385, 533768064)) {
	    Class108 class108
		= Class160.method3437(Class284.SPRITES_ARCHIVE,
				      Exception_Sub3.anInt10695 * 726901365,
				      0);
	    Class570.aClass168_7359 = class103.method2289(class108, true);
	    class108.method2705();
	    Class363.aClass168_5534 = class103.method2289(class108, true);
	    Exception_Sub5.aClass168_10705
		= class103.method2289(Class160.method3437((Class284
							   .SPRITES_ARCHIVE),
							  (Class540.anInt7003
							   * -1741231297),
							  0),
				      true);
	    Class108 class108_332_
		= Class160.method3437(Class284.SPRITES_ARCHIVE,
				      428909623 * Class199.anInt2385, 0);
	    Class102.aClass168_1448 = class103.method2289(class108_332_, true);
	    class108_332_.method2705();
	    Class479.aClass168_6416 = class103.method2289(class108_332_, true);
	}
	if (Exception_Sub5.aClass168_10705 != null
	    && null != Class570.aClass168_7359
	    && null != Class102.aClass168_1448) {
	    int i_333_ = ((i_329_ - Class102.aClass168_1448.method3631() * 2)
			  / Exception_Sub5.aClass168_10705.method3631());
	    for (int i_334_ = 0; i_334_ < i_333_; i_334_++)
		Exception_Sub5.aClass168_10705.method3646
		    ((i + Class102.aClass168_1448.method3631()
		      + i_334_ * Exception_Sub5.aClass168_10705.method3631()),
		     (i_328_ + i_330_
		      - Exception_Sub5.aClass168_10705.method3606()));
	    int i_335_
		= ((i_330_ - i_331_ - Class102.aClass168_1448.method3606())
		   / Class570.aClass168_7359.method3606());
	    for (int i_336_ = 0; i_336_ < i_335_; i_336_++) {
		Class570.aClass168_7359.method3646
		    (i, (i_331_ + i_328_
			 + i_336_ * Class570.aClass168_7359.method3606()));
		Class363.aClass168_5534.method3646
		    (i_329_ + i - Class363.aClass168_5534.method3631(),
		     (i_331_ + i_328_
		      + i_336_ * Class570.aClass168_7359.method3606()));
	    }
	    Class102.aClass168_1448.method3646(i, (i_328_ + i_330_
						   - Class102
							 .aClass168_1448
							 .method3606()));
	    Class479.aClass168_6416.method3646
		(i + i_329_ - Class102.aClass168_1448.method3631(),
		 i_330_ + i_328_ - Class102.aClass168_1448.method3606());
	}
    }
    
    public static Class241_Sub39_Sub11 method815() {
	return Class478.aClass241_Sub39_Sub11_6402;
    }
    
    static void method816() {
	aClass241_Sub39_Sub11_170
	    = (new Class241_Sub39_Sub11
	       (ClientMessage.CANCEL.getLocalisedMessage(VarPlayerDomain.currentLocale,
						    (short) 31304),
		"", 12960807 * client.anInt8458, 1006, -1, 0L, 0, 0, true,
		false, 0L, true));
    }
    
    static int[] method817(Class241_Sub39_Sub11 class241_sub39_sub11) {
	int[] is = null;
	if (Class107.method2687((((Class241_Sub39_Sub11) class241_sub39_sub11)
				 .anInt10879) * -142243581,
				-101877616))
	    is = (JS5.itemDefLoader.list
		  ((int) (-218357506993850339L
			  * (((Class241_Sub39_Sub11) class241_sub39_sub11)
			     .aLong10877)),
		   (short) 30171)
		  .anIntArray7949);
	else if (-1
		 != (((Class241_Sub39_Sub11) class241_sub39_sub11).slot2
		     * 1542395267))
	    is = (JS5.itemDefLoader.list
		  (1542395267 * (((Class241_Sub39_Sub11) class241_sub39_sub11)
				 .slot2),
		   (short) 856)
		  .anIntArray7949);
	else if (Class321.method5931((((Class241_Sub39_Sub11)
				       class241_sub39_sub11).anInt10879
				      * -142243581),
				     (byte) 2)) {
	    ObjectNode class241_sub26
		= ((ObjectNode)
		   (client.aClass407_8457.get
		    ((long) (int) (-218357506993850339L
				   * ((Class241_Sub39_Sub11)
				      class241_sub39_sub11).aLong10877))));
	    if (null != class241_sub26) {
		NPC class475_sub1_sub1_sub3_sub2
		    = ((NPC)
		       class241_sub26.objectValue);
		NPCDefinition class401
		    = class475_sub1_sub1_sub3_sub2.definition;
		if (class401.transformTo != null)
		    class401
			= class401.method7176(Class1.aClass19_11,
					      Class1.aClass19_11, (byte) 122);
		if (class401 != null)
		    is = class401.anIntArray5862;
	    }
	} else if (AnimationConfig.method11961(-142243581 * (((Class241_Sub39_Sub11)
						       class241_sub39_sub11)
						      .anInt10879),
					-1998178356)) {
	    ObjectDefinition class526
		= (client.aClass238_8477.getObjectLoader(-1913445875).getObjectDefinition
		   ((int) ((-218357506993850339L
			    * (((Class241_Sub39_Sub11) class241_sub39_sub11)
			       .aLong10877)) >>> 32
			   & 0x7fffffffL),
		    577892407));
	    if (null != class526.toObjectIDs)
		class526
		    = class526.method11768(Class1.aClass19_11,
					   Class1.aClass19_11, -461845720);
	    if (class526 != null)
		is = class526.anIntArray6833;
	}
	return is;
    }
    
    static int method818(Class241_Sub39_Sub11 class241_sub39_sub11,
			 Class639 class639) {
	String string = SkillTypeIterator.method11257(class241_sub39_sub11, (byte) 91);
	int[] is = Class213.method4309(class241_sub39_sub11, -291091001);
	if (is != null)
	    string = new StringBuilder().append(string).append
			 (Class221.method4476(is, (byte) 10)).toString();
	int i = class639.method13579(string, Class133.aClass168Array1613,
				     1190536090);
	if (((Class241_Sub39_Sub11) class241_sub39_sub11).aBool10868)
	    i += Class443.aClass168_6165.method3631() + 4;
	return i;
    }
    
    Class16() throws Throwable {
	throw new Error();
    }
    
    static void method819(Class103 class103) {
	int i = anInt156 * 1011088115;
	int i_337_ = 904064679 * Class380.anInt5660;
	int i_338_ = 1139603851 * Class593.anInt7631;
	int i_339_ = LoadingScreenDef.anInt5500 * 630071575 - 3;
	int i_340_ = 20;
	if (null == Class445_Sub12.aClass96_8651
	    || null == Class175.aClass639_2122) {
	    Class445_Sub12.aClass96_8651
		= ((Class96)
		   Class425.aClass344_6080.method6161((client
						       .anInterface26_8552),
						      (193407783
						       * Class200.anInt2398),
						      true, true,
						      -2084978261));
	    Class175.aClass639_2122
		= Class425.aClass344_6080.method6141(client.anInterface26_8552,
						     (193407783
						      * Class200.anInt2398),
						     (byte) 53);
	    if (Class445_Sub12.aClass96_8651 != null
		&& null != Class175.aClass639_2122) {
		Class198.method4036((byte) 4);
		int i_341_ = i + i_338_ / 2;
		if (i_341_ + i_338_ > Class494.canvasWid * -1080559003)
		    i_341_ = Class494.canvasWid * -1080559003 - i_338_;
		if (i_341_ < 0)
		    i_341_ = 0;
		Class630.method13488(i_341_, 904064679 * Class380.anInt5660,
				     (byte) -86);
		return;
	    }
	}
	Class96 class96;
	if (Class445_Sub12.aClass96_8651 == null
	    || Class175.aClass639_2122 == null)
	    class96 = Class81.aClass96_1149;
	else
	    class96 = Class445_Sub12.aClass96_8651;
	Class639 class639 = OnlineStatus.method7519(1981578227);
	Class445_Sub27.method14369
	    (class103, anInt156 * 1011088115, Class380.anInt5660 * 904064679,
	     1139603851 * Class593.anInt7631, LoadingScreenDef.anInt5500 * 630071575,
	     i_340_, class96, class639,
	     ClientMessage.CHOOSEOPTION.getLocalisedMessage(VarPlayerDomain.currentLocale,
						 (short) 32697),
	     (byte) 0);
	int i_342_
	    = 255 - -254997353 * Class25.anInt212 - anInt144 * 932005875;
	if (i_342_ < 0)
	    i_342_ = 0;
	int i_343_ = Class106.aClass580_1503.method12718(1726821397);
	int i_344_ = Class106.aClass580_1503.method12740((byte) -94);
	if (!aBool171) {
	    int i_345_ = 0;
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7692(298234799))) {
		int i_346_ = (1149989507 * anInt164 * (anInt148 * 1327183635
						       - 1 - i_345_)
			      + (1 + (i_337_ + i_340_
				      + class639.anInt8258 * -351886683)));
		if (i_343_ > anInt156 * 1011088115
		    && i_343_ < (1011088115 * anInt156
				 + Class593.anInt7631 * 1139603851)
		    && i_344_ > i_346_ - -351886683 * class639.anInt8258 - 1
		    && i_344_ < 326424439 * class639.anInt8260 + i_346_
		    && (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aBool10876))
		    class103.method2396(1011088115 * anInt156,
					(i_346_
					 - -351886683 * class639.anInt8258),
					Class593.anInt7631 * 1139603851,
					anInt164 * 1149989507,
					(i_342_ << 24
					 | 382464113 * Class509.anInt6682),
					1);
		i_345_++;
	    }
	} else {
	    int i_347_ = 0;
	    for (Class241_Sub39_Sub10 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7440(-1397088259));
		 class241_sub39_sub10 != null;
		 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7435((byte) -1))) {
		int i_348_ = (1149989507 * anInt164 * i_347_
			      + (1 + (i_340_ + i_337_
				      + -351886683 * class639.anInt8258)));
		if (i_343_ > 1011088115 * anInt156
		    && i_343_ < (Class593.anInt7631 * 1139603851
				 + 1011088115 * anInt156)
		    && i_344_ > i_348_ - -351886683 * class639.anInt8258 - 1
		    && i_344_ < i_348_ + 326424439 * class639.anInt8260
		    && ((((Class241_Sub39_Sub10) class241_sub39_sub10)
			 .anInt10867) * 1633676605 > 1
			|| ((Class241_Sub39_Sub11) (Class241_Sub39_Sub11)
			    (((Class241_Sub39_Sub10) class241_sub39_sub10)
			     .aClass410_10866.aClass241_Sub39_5934
			     .aClass241_Sub39_10148)).aBool10876))
		    class103.method2396(1011088115 * anInt156,
					(i_348_
					 - class639.anInt8258 * -351886683),
					Class593.anInt7631 * 1139603851,
					1149989507 * anInt164,
					(i_342_ << 24
					 | Class509.anInt6682 * 382464113),
					1);
		i_347_++;
	    }
	    if (null != aClass241_Sub39_Sub10_143) {
		Class445_Sub27.method14369(class103,
					   1955430821 * Class193.anInt2298,
					   Class4.anInt16 * 282057643,
					   anInt147 * -885853667,
					   Class395.anInt5784 * -950722911,
					   i_340_, class96, class639,
					   (((Class241_Sub39_Sub10)
					     aClass241_Sub39_Sub10_143)
					    .aString10865),
					   (byte) 0);
		i_347_ = 0;
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7440(-1397088259));
		     null != class241_sub39_sub11;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7435((byte) -1))) {
		    int i_349_ = (1149989507 * anInt164 * i_347_
				  + (1 + (Class4.anInt16 * 282057643 + i_340_
					  + -351886683 * class639.anInt8258)));
		    if (i_343_ > Class193.anInt2298 * 1955430821
			&& i_343_ < (1955430821 * Class193.anInt2298
				     + anInt147 * -885853667)
			&& (i_344_
			    > i_349_ - -351886683 * class639.anInt8258 - 1)
			&& i_344_ < i_349_ + class639.anInt8260 * 326424439
			&& (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aBool10876))
			class103.method2396
			    (1955430821 * Class193.anInt2298,
			     i_349_ - -351886683 * class639.anInt8258,
			     anInt147 * -885853667, 1149989507 * anInt164,
			     i_342_ << 24 | Class509.anInt6682 * 382464113, 1);
		    i_347_++;
		}
		Class158.method3403(class103, 1955430821 * Class193.anInt2298,
				    282057643 * Class4.anInt16,
				    -885853667 * anInt147,
				    Class395.anInt5784 * -950722911, i_340_,
				    -1513755272);
	    }
	}
	Class158.method3403(class103, 1011088115 * anInt156,
			    904064679 * Class380.anInt5660,
			    1139603851 * Class593.anInt7631,
			    630071575 * LoadingScreenDef.anInt5500, i_340_,
			    1213912143);
	if (!aBool171) {
	    int i_350_ = 0;
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7692(-172340697))) {
		int i_351_
		    = ((anInt148 * 1327183635 - 1 - i_350_) * (anInt164
							       * 1149989507)
		       + (class639.anInt8258 * -351886683 + (i_340_ + i_337_)
			  + 1));
		Class338.method6113(i_343_, i_344_, i, i_337_, i_338_, i_339_,
				    i_351_, class241_sub39_sub11, class96,
				    class639,
				    (BaseVarType.anInt2541 * -304788339
				     | ~0xffffff),
				    433761765 * Class8.anInt45 | ~0xffffff,
				    1113506331);
		i_350_++;
	    }
	} else {
	    int i_352_ = 0;
	    for (Class241_Sub39_Sub10 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7440(-1397088259));
		 class241_sub39_sub10 != null;
		 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7435((byte) -1))) {
		int i_353_ = (i_352_ * (1149989507 * anInt164)
			      + (Class380.anInt5660 * 904064679 + i_340_
				 + -351886683 * class639.anInt8258 + 1));
		if (1 == (((Class241_Sub39_Sub10) class241_sub39_sub10)
			  .anInt10867) * 1633676605)
		    Class338.method6113(i_343_, i_344_, anInt156 * 1011088115,
					904064679 * Class380.anInt5660,
					1139603851 * Class593.anInt7631,
					LoadingScreenDef.anInt5500 * 630071575, i_353_,
					((Class241_Sub39_Sub11)
					 (((Class241_Sub39_Sub10)
					   class241_sub39_sub10)
					  .aClass410_10866.aClass241_Sub39_5934
					  .aClass241_Sub39_10148)),
					class96, class639,
					(BaseVarType.anInt2541 * -304788339
					 | ~0xffffff),
					Class8.anInt45 * 433761765 | ~0xffffff,
					1389290342);
		else
		    Class544.method11985
			(i_343_, i_344_, 1011088115 * anInt156,
			 904064679 * Class380.anInt5660,
			 Class593.anInt7631 * 1139603851,
			 LoadingScreenDef.anInt5500 * 630071575, i_353_,
			 class241_sub39_sub10, class96, class639,
			 -304788339 * BaseVarType.anInt2541 | ~0xffffff,
			 Class8.anInt45 * 433761765 | ~0xffffff, -173551302);
		i_352_++;
	    }
	    if (null != aClass241_Sub39_Sub10_143) {
		i_352_ = 0;
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7440(-1397088259));
		     null != class241_sub39_sub11;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7435((byte) -1))) {
		    int i_354_ = (class639.anInt8258 * -351886683
				  + (i_340_ + 282057643 * Class4.anInt16) + 1
				  + i_352_ * (anInt164 * 1149989507));
		    Class338.method6113
			(i_343_, i_344_, Class193.anInt2298 * 1955430821,
			 282057643 * Class4.anInt16, -885853667 * anInt147,
			 Class395.anInt5784 * -950722911, i_354_,
			 class241_sub39_sub11, class96, class639,
			 BaseVarType.anInt2541 * -304788339 | ~0xffffff,
			 Class8.anInt45 * 433761765 | ~0xffffff, 1918874386);
		    i_352_++;
		}
	    }
	}
    }
    
    static String method820(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (null == ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
	    || ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
		   .length() == 0) {
	    if ((null
		 != ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869)
		&& ((Class241_Sub39_Sub11) class241_sub39_sub11)
		       .aString10869.length() > 0)
		return new StringBuilder().append
			   (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aString10871)
			   .append
			   (ClientMessage.MINISEPERATOR.getLocalisedMessage
			    (VarPlayerDomain.currentLocale, (short) 32745))
			   .append
			   (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aString10869)
			   .toString();
	    return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10871;
	}
	if (null != ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869
	    && ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869
		   .length() > 0)
	    return new StringBuilder().append
		       (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aString10871)
		       .append
		       (ClientMessage.MINISEPERATOR.getLocalisedMessage((VarPlayerDomain
							     .currentLocale),
							    (short) 20849))
		       .append
		       (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aString10869)
		       .append
		       (ClientMessage.MINISEPERATOR.getLocalisedMessage((VarPlayerDomain
							     .currentLocale),
							    (short) 16974))
		       .append
		       (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aString10880)
		       .toString();
	return new StringBuilder().append
		   (((Class241_Sub39_Sub11) class241_sub39_sub11).aString10871)
		   .append
		   (ClientMessage.MINISEPERATOR
			.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 24222))
		   .append
		   (((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880)
		   .toString();
    }
    
    static String method821(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (null == ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
	    || ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880
		   .length() == 0) {
	    if ((null
		 != ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869)
		&& ((Class241_Sub39_Sub11) class241_sub39_sub11)
		       .aString10869.length() > 0)
		return new StringBuilder().append
			   (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aString10871)
			   .append
			   (ClientMessage.MINISEPERATOR.getLocalisedMessage
			    (VarPlayerDomain.currentLocale, (short) 32017))
			   .append
			   (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aString10869)
			   .toString();
	    return ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10871;
	}
	if (null != ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869
	    && ((Class241_Sub39_Sub11) class241_sub39_sub11).aString10869
		   .length() > 0)
	    return new StringBuilder().append
		       (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aString10871)
		       .append
		       (ClientMessage.MINISEPERATOR.getLocalisedMessage((VarPlayerDomain
							     .currentLocale),
							    (short) 19399))
		       .append
		       (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aString10869)
		       .append
		       (ClientMessage.MINISEPERATOR.getLocalisedMessage((VarPlayerDomain
							     .currentLocale),
							    (short) 18397))
		       .append
		       (((Class241_Sub39_Sub11) class241_sub39_sub11)
			.aString10880)
		       .toString();
	return new StringBuilder().append
		   (((Class241_Sub39_Sub11) class241_sub39_sub11).aString10871)
		   .append
		   (ClientMessage.MINISEPERATOR
			.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 27631))
		   .append
		   (((Class241_Sub39_Sub11) class241_sub39_sub11).aString10880)
		   .toString();
    }
    
    static void method822(Class103 class103) {
	int i = -10660793;
	Class410.method7456(class103, 1011088115 * anInt156,
			    Class380.anInt5660 * 904064679,
			    Class593.anInt7631 * 1139603851,
			    630071575 * LoadingScreenDef.anInt5500, i, -16777216,
			    (byte) 9);
	Class81.aClass96_1149.method2128
	    (ClientMessage.CHOOSEOPTION.getLocalisedMessage(VarPlayerDomain.currentLocale,
						 (short) 22183),
	     1011088115 * anInt156 + 3, 14 + Class380.anInt5660 * 904064679, i,
	     -1, 1841717961);
	int i_355_ = Class106.aClass580_1503.method12718(528381931);
	int i_356_ = Class106.aClass580_1503.method12740((byte) -7);
	if (!aBool171) {
	    int i_357_ = 0;
	    for (Class241_Sub39_Sub11 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7694(16711935));
		 null != class241_sub39_sub11;
		 class241_sub39_sub11
		     = ((Class241_Sub39_Sub11)
			aClass429_150.method7692(-351128359))) {
		int i_358_ = (31 + 904064679 * Class380.anInt5660
			      + ((anInt148 * 1327183635 - 1 - i_357_)
				 * (anInt164 * 1149989507)));
		Class338.method6113(i_355_, i_356_, anInt156 * 1011088115,
				    904064679 * Class380.anInt5660,
				    1139603851 * Class593.anInt7631,
				    630071575 * LoadingScreenDef.anInt5500, i_358_,
				    class241_sub39_sub11,
				    Class81.aClass96_1149, Class5.aClass639_19,
				    -1, -256, 42171426);
		i_357_++;
	    }
	} else {
	    int i_359_ = 0;
	    for (Class241_Sub39_Sub10 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7440(-1397088259));
		 class241_sub39_sub10 != null;
		 class241_sub39_sub10
		     = ((Class241_Sub39_Sub10)
			aClass410_152.method7435((byte) -1))) {
		int i_360_ = (Class380.anInt5660 * 904064679 + 31
			      + i_359_ * (anInt164 * 1149989507));
		if (1633676605 * (((Class241_Sub39_Sub10) class241_sub39_sub10)
				  .anInt10867)
		    == 1)
		    Class338.method6113(i_355_, i_356_, 1011088115 * anInt156,
					Class380.anInt5660 * 904064679,
					Class593.anInt7631 * 1139603851,
					630071575 * LoadingScreenDef.anInt5500, i_360_,
					((Class241_Sub39_Sub11)
					 (((Class241_Sub39_Sub10)
					   class241_sub39_sub10)
					  .aClass410_10866.aClass241_Sub39_5934
					  .aClass241_Sub39_10148)),
					Class81.aClass96_1149,
					Class5.aClass639_19, -1, -256,
					282091187);
		else
		    Class544.method11985(i_355_, i_356_, anInt156 * 1011088115,
					 Class380.anInt5660 * 904064679,
					 Class593.anInt7631 * 1139603851,
					 630071575 * LoadingScreenDef.anInt5500,
					 i_360_, class241_sub39_sub10,
					 Class81.aClass96_1149,
					 Class5.aClass639_19, -1, -256,
					 -303267218);
		i_359_++;
	    }
	    if (null != aClass241_Sub39_Sub10_143) {
		Class410.method7456(class103, Class193.anInt2298 * 1955430821,
				    282057643 * Class4.anInt16,
				    -885853667 * anInt147,
				    -950722911 * Class395.anInt5784, i,
				    -16777216, (byte) -63);
		Class81.aClass96_1149.method2128
		    ((((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
		      .aString10865),
		     3 + 1955430821 * Class193.anInt2298,
		     14 + Class4.anInt16 * 282057643, i, -1, 1841717961);
		i_359_ = 0;
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7440(-1397088259));
		     null != class241_sub39_sub11;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    ((Class241_Sub39_Sub10) aClass241_Sub39_Sub10_143)
				.aClass410_10866.method7435((byte) -1))) {
		    int i_361_ = (31 + 282057643 * Class4.anInt16
				  + 1149989507 * anInt164 * i_359_);
		    Class338.method6113(i_355_, i_356_,
					Class193.anInt2298 * 1955430821,
					282057643 * Class4.anInt16,
					anInt147 * -885853667,
					-950722911 * Class395.anInt5784,
					i_361_, class241_sub39_sub11,
					Class81.aClass96_1149,
					Class5.aClass639_19, -1, -256,
					2088503258);
		    i_359_++;
		}
	    }
	}
    }
    
    static String method823(Class241_Sub39_Sub10 class241_sub39_sub10) {
	return new StringBuilder().append
		   (((Class241_Sub39_Sub10) class241_sub39_sub10).aString10865)
		   .append
		   (Class338.method6112(16777215, 196385687)).append
		   (" >").toString();
    }
    
    public static void method824(Class168[] class168s) {
	Class214.anInt2514 = class168s.length * 864018427;
	Class133.aClass168Array1613
	    = new Class168[10 + -1959242957 * Class214.anInt2514];
	Class242.anIntArray2783
	    = new int[10 + -1959242957 * Class214.anInt2514];
	System.arraycopy(class168s, 0, Class133.aClass168Array1613, 0,
			 -1959242957 * Class214.anInt2514);
	for (int i = 0; i < Class214.anInt2514 * -1959242957; i++)
	    Class242.anIntArray2783[i]
		= Class133.aClass168Array1613[i].method3616();
	for (int i = -1959242957 * Class214.anInt2514;
	     i < Class133.aClass168Array1613.length; i++)
	    Class242.anIntArray2783[i] = 12;
    }
    
    static void method825() {
	if (null != aClass241_Sub39_Sub10_143) {
	    aClass241_Sub39_Sub10_143 = null;
	    Class579.method12709(Class193.anInt2298 * 1955430821,
				 282057643 * Class4.anInt16,
				 anInt147 * -885853667,
				 Class395.anInt5784 * -950722911, (byte) -4);
	}
    }
    
    static int method826(Class241_Sub39_Sub10 class241_sub39_sub10,
			 Class639 class639) {
	String string = Class334.method6068(class241_sub39_sub10, 1787047360);
	return class639.method13579(string, Class133.aClass168Array1613,
				    1190536090);
    }
    
    static int method827(Class241_Sub39_Sub10 class241_sub39_sub10,
			 Class639 class639) {
	String string = Class334.method6068(class241_sub39_sub10, -1298157649);
	return class639.method13579(string, Class133.aClass168Array1613,
				    1190536090);
    }
    
    static String method828(InterfaceComponent class58, int i) {
	if (!client.method13624(class58).method15039(i, 65280)
	    && class58.onContextMenuSelect == null)
	    return null;
	if (class58.contextMenuOptions == null
	    || class58.contextMenuOptions.length <= i
	    || null == class58.contextMenuOptions[i]
	    || class58.contextMenuOptions[i].trim().length() == 0) {
	    if (client.aBool8403)
		return new StringBuilder().append("Hidden-").append(i)
			   .toString();
	    return null;
	}
	return class58.contextMenuOptions[i];
    }
    
    static boolean method829(int i) {
	return 57 == i || i == 58 || i == 1007 || 25 == i || i == 30;
    }
    
    static boolean method830(int i) {
	if (18 == i || i == 19 || 20 == i || 21 == i || 22 == i || 1004 == i)
	    return true;
	if (17 == i)
	    return true;
	return false;
    }
    
    static boolean method831(int i) {
	if (9 == i || 10 == i || i == 11 || 12 == i || 13 == i || 1003 == i)
	    return true;
	if (i == 8)
	    return true;
	return false;
    }
    
    static boolean method832(int i) {
	return (44 == i || 45 == i || i == 46 || 47 == i || i == 48 || 49 == i
		|| 50 == i || i == 51 || 52 == i || 53 == i || 15 == i);
    }
    
    static boolean method833(int i) {
	return (44 == i || 45 == i || i == 46 || 47 == i || i == 48 || 49 == i
		|| 50 == i || i == 51 || 52 == i || 53 == i || 15 == i);
    }
    
    static long method834(Interface24 interface24, int i, int i_362_) {
	long l = 4194304L;
	long l_363_ = -9223372036854775808L;
	ObjectDefinition class526
	    = client.aClass238_8477.getObjectLoader(-1902766746)
		  .getObjectDefinition(interface24.method146((byte) 0), 577892407);
	long l_364_
	    = (long) (i | i_362_ << 7 | interface24.method139(591463713) << 14
		      | interface24.method140(-2117203034) << 20 | 0x40000000);
	if (class526.anInt6848 * -1389471035 == 0)
	    l_364_ |= l_363_;
	if (class526.anInt6881 * -309513503 == 1)
	    l_364_ |= l;
	l_364_ |= (long) interface24.method146((byte) 0) << 32;
	return l_364_;
    }
    
    static void method835
	(NPC class475_sub1_sub1_sub3_sub2,
	 boolean bool) {
	if (1327183635 * anInt148 < 410) {
	    NPCDefinition class401 = class475_sub1_sub1_sub3_sub2.definition;
	    String string = class475_sub1_sub1_sub3_sub2.npcName;
	    if (class401.transformTo != null) {
		class401 = class401.method7176(Class1.aClass19_11,
					       Class1.aClass19_11, (byte) 94);
		if (class401 == null)
		    return;
		string = class401.name;
	    }
	    if (class401.aBool5839) {
		if (0
		    != class475_sub1_sub1_sub3_sub2.combatLevel * 1239473347) {
		    String string_365_
			= (GameDefinition.STELLARDAWN == client.currentGame
			   ? (ClientMessage.RATING.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 27661))
			   : (ClientMessage.LEVEL.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 22320)));
		    string = new StringBuilder().append(string).append
				 (Class410.method7458
				  ((1239473347
				    * class475_sub1_sub1_sub3_sub2.combatLevel),
				   (Class21.myPlayer
				    .anInt11502) * -1617461639,
				   (byte) 75))
				 .append
				 (Class6.aString29).append
				 (string_365_).append
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
								 1543572897)
			   : null);
		    if ((-1622803377 * Class613.anInt7804 & 0x2) != 0
			&& (null == class603
			    || (class401.method7148((NPCDefinitionLoader.anInt5897
						     * 820722975),
						    (class603.defaultint
						     * 2015998927),
						    (byte) -31)
				!= 2015998927 * class603.defaultint)))
			Class534.method11882
			    (client.aString8464,
			     new StringBuilder().append(client.aString8465)
				 .append
				 (" ").append
				 (Class6.aString33).append
				 (" ").append
				 (Class338.method6112(16776960, 580651547))
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
			strings = Class591.method12918(strings, 196666930);
		    if (null != strings) {
			for (int i = strings.length - 1; i >= 0; i--) {
			    if (strings[i] != null
				&& (class401.aByte5863 == 0
				    || (!(strings[i].equalsIgnoreCase
					  (ClientMessage.ATTACK.getLocalisedMessage
					   (VarPlayerDomain.currentLocale,
					    (short) 28063)))
					&& !(strings[i].equalsIgnoreCase
					     (ClientMessage.EXAMINE
						  .getLocalisedMessage
					      (VarPlayerDomain.currentLocale,
					       (short) 19971)))))) {
				int i_366_ = 0;
				int i_367_ = client.anInt8387 * 886936997;
				if (0 == i)
				    i_366_ = 9;
				if (i == 1)
				    i_366_ = 10;
				if (2 == i)
				    i_366_ = 11;
				if (i == 3)
				    i_366_ = 12;
				if (i == 4)
				    i_366_ = 13;
				if (i == 5)
				    i_366_ = 1003;
				int i_368_
				    = class401.method7153(i, (byte) -111);
				if (-1 != i_368_)
				    i_367_ = i_368_;
				Class534.method11882
				    (strings[i],
				     new StringBuilder().append
					 (Class338.method6112(16776960,
							      740649601))
					 .append
					 (string).toString(),
				     ((strings[i].equalsIgnoreCase
				       (ClientMessage.ATTACK.getLocalisedMessage
					(VarPlayerDomain.currentLocale,
					 (short) 21042)))
				      ? class401.anInt5822 * 789838663
				      : i_367_),
				     i_366_, -1,
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
			    for (int i = 0; i < strings.length; i++) {
				if (null != strings[i]
				    && ((strings[i].equalsIgnoreCase
					 (ClientMessage.ATTACK.getLocalisedMessage
					  (VarPlayerDomain.currentLocale,
					   (short) 24824)))
					|| (strings[i].equalsIgnoreCase
					    (ClientMessage.EXAMINE
						 .getLocalisedMessage
					     (VarPlayerDomain.currentLocale,
					      (short) 29299))))) {
				    short i_369_ = 0;
				    if ((1239473347
					 * (class475_sub1_sub1_sub3_sub2
					    .combatLevel))
					> (Class21
					   .myPlayer
					   .anInt11502) * -1617461639)
					i_369_ = (short) 2000;
				    short i_370_ = 0;
				    int i_371_ = client.anInt8387 * 886936997;
				    if (i == 0)
					i_370_ = (short) 9;
				    if (1 == i)
					i_370_ = (short) 10;
				    if (i == 2)
					i_370_ = (short) 11;
				    if (3 == i)
					i_370_ = (short) 12;
				    if (4 == i)
					i_370_ = (short) 13;
				    if (i == 5)
					i_370_ = (short) 1003;
				    if (i_370_ != 0)
					i_370_ += i_369_;
				    int i_372_
					= class401.method7153(i, (byte) -7);
				    if (-1 != i_372_)
					i_371_ = i_372_;
				    Class534.method11882
					(strings[i],
					 new StringBuilder().append
					     (Class338.method6112(16776960,
								  323244840))
					     .append
					     (string).toString(),
					 ((strings[i].equalsIgnoreCase
					   (ClientMessage.ATTACK.getLocalisedMessage
					    (VarPlayerDomain.currentLocale,
					     (short) 31109)))
					  ? 789838663 * class401.anInt5822
					  : i_371_),
					 i_370_, -1,
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
    
    static boolean method836(int i) {
	if (i == 3 || i == 4 || 5 == i || i == 6 || i == 1001 || i == 1002)
	    return true;
	if (2 == i)
	    return true;
	return false;
    }
    
    static String method837(Class241_Sub39_Sub10 class241_sub39_sub10) {
	return new StringBuilder().append
		   (((Class241_Sub39_Sub10) class241_sub39_sub10).aString10865)
		   .append
		   (Class338.method6112(16777215, -1396563220)).append
		   (" >").toString();
    }
    
    static void method838(Class103 class103, int i, int i_373_, int i_374_,
			  int i_375_, int i_376_, Class96 class96,
			  Class639 class639, String string) {
	int i_377_
	    = 255 - 18175593 * Class270.anInt4359 - anInt144 * 932005875;
	if (i_377_ < 0)
	    i_377_ = 0;
	if (Class363.aClass168_5533 == null
	    || null == Class445_Sub30.aClass168_8711) {
	    if (Class284.SPRITES_ARCHIVE
		    .method4250(-1141209597 * Class77.anInt1130, -730837467)
		&& Class284.SPRITES_ARCHIVE.method4250((1190535919
						       * Class163.anInt2050),
						      692435284)) {
		Class363.aClass168_5533
		    = (class103.method2289
		       (Class160.method3437(Class284.SPRITES_ARCHIVE,
					    -1141209597 * Class77.anInt1130,
					    0),
			true));
		Class108 class108
		    = Class160.method3437(Class284.SPRITES_ARCHIVE,
					  Class163.anInt2050 * 1190535919, 0);
		Class445_Sub30.aClass168_8711
		    = class103.method2289(class108, true);
		class108.method2705();
		Class23.aClass168_208 = class103.method2289(class108, true);
	    } else
		class103.method2396(i, i_373_, i_374_, i_376_,
				    (i_377_ << 24
				     | -360598457 * Class262.anInt4317),
				    1);
	}
	if (Class363.aClass168_5533 != null
	    && Class445_Sub30.aClass168_8711 != null) {
	    int i_378_
		= ((i_374_ - Class445_Sub30.aClass168_8711.method3631() * 2)
		   / Class363.aClass168_5533.method3631());
	    for (int i_379_ = 0; i_379_ < i_378_; i_379_++)
		Class363.aClass168_5533.method3646
		    ((i + Class445_Sub30.aClass168_8711.method3631()
		      + i_379_ * Class363.aClass168_5533.method3631()),
		     i_373_);
	    Class445_Sub30.aClass168_8711.method3646(i, i_373_);
	    Class23.aClass168_208.method3646(i + i_374_ - Class23
							      .aClass168_208
							      .method3631(),
					     i_373_);
	}
	class96.method2128(string, 3 + i,
			   (class639.anInt8258 * -351886683 + i_373_
			    + (20 - -351886683 * class639.anInt8258) / 2),
			   BaseVarType.anInt2541 * -304788339 | ~0xffffff, -1,
			   1841717961);
	class103.method2396(i, i_373_ + i_376_, i_374_, i_375_ - i_376_,
			    i_377_ << 24 | -360598457 * Class262.anInt4317, 1);
    }
    
    static void method839
	(Player class475_sub1_sub1_sub3_sub1,
	 boolean bool) {
	if (1327183635 * anInt148 < 410) {
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
			     (Class338.method6112(16777215, -132389818)).append
			     (ClientMessage.SELF.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 18533))
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
		    boolean bool_380_ = true;
		    if (-1 != (Class21.myPlayer
			       .anInt11504) * -870747707
			&& -1 != (class475_sub1_sub1_sub3_sub1.anInt11504
				  * -870747707)) {
			int i
			    = (((Class21.myPlayer
				 .anInt11504) * -870747707
				< (class475_sub1_sub1_sub3_sub1.anInt11504
				   * -870747707))
			       ? (-870747707
				  * (Class21.myPlayer
				     .anInt11504))
			       : (-870747707
				  * class475_sub1_sub1_sub3_sub1.anInt11504));
			int i_381_
			    = ((-1617461639
				* (Class21.myPlayer
				   .anInt11502))
			       - (-1617461639
				  * class475_sub1_sub1_sub3_sub1.anInt11502));
			if (i_381_ < 0)
			    i_381_ = -i_381_;
			if (i_381_ > i)
			    bool_380_ = false;
		    }
		    String string_382_
			= (GameDefinition.STELLARDAWN == client.currentGame
			   ? (ClientMessage.RATING.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 23520))
			   : (ClientMessage.LEVEL.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 18053)));
		    if (-1617461639 * class475_sub1_sub1_sub3_sub1.anInt11502
			>= (-1238039071
			    * class475_sub1_sub1_sub3_sub1.anInt11503))
			string
			    = new StringBuilder().append
				  (class475_sub1_sub1_sub3_sub1
				       .getFormattedName(true, -1020701556))
				  .append
				  (bool_380_
				   ? (Class410.method7458
				      ((-1617461639
					* (class475_sub1_sub1_sub3_sub1
					   .anInt11502)),
				       (-1617461639
					* (Class21
					   .myPlayer
					   .anInt11502)),
				       (byte) 27))
				   : Class338.method6112(16777215, 954621025))
				  .append
				  (Class6.aString29).append
				  (string_382_).append
				  (-1617461639
				   * class475_sub1_sub1_sub3_sub1.anInt11502)
				  .append
				  (Class6.aString32).toString();
		    else
			string
			    = new StringBuilder().append
				  (class475_sub1_sub1_sub3_sub1
				       .getFormattedName(true, -1009936720))
				  .append
				  (bool_380_
				   ? (Class410.method7458
				      ((class475_sub1_sub1_sub3_sub1.anInt11502
					* -1617461639),
				       (Class21
					.myPlayer
					.anInt11502) * -1617461639,
				       (byte) 42))
				   : Class338.method6112(16777215, -498124664))
				  .append
				  (Class6.aString29).append
				  (string_382_).append
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
								   -158479326);
		else
		    string = new StringBuilder().append
				 (class475_sub1_sub1_sub3_sub1
				      .getFormattedName(true, -1558144596))
				 .append
				 (Class6.aString29).append
				 (ClientMessage.SKILL.getLocalisedMessage
				  (VarPlayerDomain.currentLocale, (short) 29954))
				 .append
				 (1682998611
				  * class475_sub1_sub1_sub3_sub1.anInt11516)
				 .append
				 (Class6.aString32).toString();
		boolean bool_383_ = false;
		if (-1 != -614581637 * (class475_sub1_sub1_sub3_sub1
					.aClass490_11499.anInt6508)) {
		    NPCDefinition class401
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   ((class475_sub1_sub1_sub3_sub1.aClass490_11499
			     .anInt6508) * -614581637,
			    -1159816063));
		    if (class401.aBool5871) {
			bool_383_ = true;
			string = (MasterIndex.npcDefLoader.getNpcDefinition
				  (-614581637 * (class475_sub1_sub1_sub3_sub1
						 .aClass490_11499.anInt6508),
				   -953469994)
				  .name);
			if (0 != class401.combatLevel * 8317645) {
			    String string_384_
				= ((client.currentGame
				    == GameDefinition.STELLARDAWN)
				   ? (ClientMessage.RATING.getLocalisedMessage
				      (VarPlayerDomain.currentLocale, (short) 25515))
				   : (ClientMessage.LEVEL.getLocalisedMessage
				      (VarPlayerDomain.currentLocale,
				       (short) 18532)));
			    string
				= new StringBuilder().append(string).append
				      (Class410.method7458
				       (class401.combatLevel * 8317645,
					(-1617461639
					 * (Class21
					    .myPlayer
					    .anInt11502)),
					(byte) 12))
				      .append
				      (Class6.aString29).append
				      (string_384_).append
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
			     (Class338.method6112(16777215, 930373956)).append
			     (string).toString(),
			 Class213.anInt2512 * 1184895817, 15, -1,
			 (long) (class475_sub1_sub1_sub3_sub1.entityIndex
				 * -546698383),
			 0, 0, true, false,
			 (long) (class475_sub1_sub1_sub3_sub1.entityIndex
				 * -546698383),
			 false, -1236921043);
		if (!bool) {
		    for (int i = 7; i >= 0; i--) {
			if (null != client.playerOptionMessages[i]) {
			    short i_385_ = 0;
			    if ((GameDefinition.RUNESCAPE
				 == client.currentGame)
				&& (client.playerOptionMessages[i].equalsIgnoreCase
				    (ClientMessage.ATTACK.getLocalisedMessage
				     (VarPlayerDomain.currentLocale,
				      (short) 28671)))) {
				if (client.aBool8444
				    && ((class475_sub1_sub1_sub3_sub1
					 .anInt11502) * -1617461639
					> (-1617461639
					   * (Class21
					      .myPlayer
					      .anInt11502))))
				    i_385_ = (short) 2000;
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
					i_385_ = (short) 2000;
				    else
					i_385_ = (short) 0;
				} else if (class475_sub1_sub1_sub3_sub1
					   .aBool11494)
				    i_385_ = (short) 2000;
			    } else if (client.aBoolArray8450[i])
				i_385_ = (short) 2000;
			    short i_386_
				= (short) (i_385_ + client.aShortArray8447[i]);
			    int i_387_ = (-1 != client.playerOptionCursors[i]
					  ? client.playerOptionCursors[i]
					  : 886936997 * client.anInt8387);
			    int i_388_ = bool_383_ ? 16776960 : 16777215;
			    Class534.method11882
				(client.playerOptionMessages[i],
				 new StringBuilder().append
				     (Class338.method6112(i_388_, -418977263))
				     .append
				     (string).toString(),
				 i_387_, i_386_, -1,
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
		} else if (!bool_383_)
		    Class534.method11882(new StringBuilder().append
					     (Class338.method6112(13421772,
								  784966048))
					     .append
					     (string).toString(),
					 "", -1, -1, 0, 0L, 0, 0, false, true,
					 (long) ((class475_sub1_sub1_sub3_sub1
						  .entityIndex)
						 * -546698383),
					 false, -1236921043);
		if (!bool && !bool_383_) {
		    for (Class241_Sub39_Sub11 class241_sub39_sub11
			     = ((Class241_Sub39_Sub11)
				aClass429_150.method7694(16711935));
			 null != class241_sub39_sub11;
			 class241_sub39_sub11
			     = ((Class241_Sub39_Sub11)
				aClass429_150.method7692(1536008686))) {
			if (23
			    == (((Class241_Sub39_Sub11) class241_sub39_sub11)
				.anInt10879) * -142243581) {
			    ((Class241_Sub39_Sub11) class241_sub39_sub11)
				.aString10880
				= new StringBuilder().append
				      (Class338.method6112(16777215, -5856247))
				      .append
				      (string).toString();
			    break;
			}
		    }
		}
	    }
	}
    }
    
    static void method840
	(Player class475_sub1_sub1_sub3_sub1,
	 boolean bool) {
	if (1327183635 * anInt148 < 410) {
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
			     (Class338.method6112(16777215, -1234419883))
			     .append
			     (ClientMessage.SELF.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 25604))
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
		    boolean bool_389_ = true;
		    if (-1 != (Class21.myPlayer
			       .anInt11504) * -870747707
			&& -1 != (class475_sub1_sub1_sub3_sub1.anInt11504
				  * -870747707)) {
			int i
			    = (((Class21.myPlayer
				 .anInt11504) * -870747707
				< (class475_sub1_sub1_sub3_sub1.anInt11504
				   * -870747707))
			       ? (-870747707
				  * (Class21.myPlayer
				     .anInt11504))
			       : (-870747707
				  * class475_sub1_sub1_sub3_sub1.anInt11504));
			int i_390_
			    = ((-1617461639
				* (Class21.myPlayer
				   .anInt11502))
			       - (-1617461639
				  * class475_sub1_sub1_sub3_sub1.anInt11502));
			if (i_390_ < 0)
			    i_390_ = -i_390_;
			if (i_390_ > i)
			    bool_389_ = false;
		    }
		    String string_391_
			= (GameDefinition.STELLARDAWN == client.currentGame
			   ? (ClientMessage.RATING.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 29272))
			   : (ClientMessage.LEVEL.getLocalisedMessage
			      (VarPlayerDomain.currentLocale, (short) 21429)));
		    if (-1617461639 * class475_sub1_sub1_sub3_sub1.anInt11502
			>= (-1238039071
			    * class475_sub1_sub1_sub3_sub1.anInt11503))
			string
			    = new StringBuilder().append
				  (class475_sub1_sub1_sub3_sub1
				       .getFormattedName(true, 525794308))
				  .append
				  (bool_389_
				   ? (Class410.method7458
				      ((-1617461639
					* (class475_sub1_sub1_sub3_sub1
					   .anInt11502)),
				       (-1617461639
					* (Class21
					   .myPlayer
					   .anInt11502)),
				       (byte) 112))
				   : Class338.method6112(16777215, 670008431))
				  .append
				  (Class6.aString29).append
				  (string_391_).append
				  (-1617461639
				   * class475_sub1_sub1_sub3_sub1.anInt11502)
				  .append
				  (Class6.aString32).toString();
		    else
			string
			    = new StringBuilder().append
				  (class475_sub1_sub1_sub3_sub1
				       .getFormattedName(true, -471295552))
				  .append
				  (bool_389_
				   ? (Class410.method7458
				      ((class475_sub1_sub1_sub3_sub1.anInt11502
					* -1617461639),
				       (Class21
					.myPlayer
					.anInt11502) * -1617461639,
				       (byte) 74))
				   : Class338.method6112(16777215, -64725265))
				  .append
				  (Class6.aString29).append
				  (string_391_).append
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
		    string = class475_sub1_sub1_sub3_sub1
				 .getFormattedName(true, -1182121505);
		else
		    string = new StringBuilder().append
				 (class475_sub1_sub1_sub3_sub1
				      .getFormattedName(true, -2040463972))
				 .append
				 (Class6.aString29).append
				 (ClientMessage.SKILL.getLocalisedMessage
				  (VarPlayerDomain.currentLocale, (short) 23081))
				 .append
				 (1682998611
				  * class475_sub1_sub1_sub3_sub1.anInt11516)
				 .append
				 (Class6.aString32).toString();
		boolean bool_392_ = false;
		if (-1 != -614581637 * (class475_sub1_sub1_sub3_sub1
					.aClass490_11499.anInt6508)) {
		    NPCDefinition class401
			= (MasterIndex.npcDefLoader.getNpcDefinition
			   ((class475_sub1_sub1_sub3_sub1.aClass490_11499
			     .anInt6508) * -614581637,
			    -1055428698));
		    if (class401.aBool5871) {
			bool_392_ = true;
			string = (MasterIndex.npcDefLoader.getNpcDefinition
				  (-614581637 * (class475_sub1_sub1_sub3_sub1
						 .aClass490_11499.anInt6508),
				   -309862444)
				  .name);
			if (0 != class401.combatLevel * 8317645) {
			    String string_393_
				= ((client.currentGame
				    == GameDefinition.STELLARDAWN)
				   ? (ClientMessage.RATING.getLocalisedMessage
				      (VarPlayerDomain.currentLocale, (short) 28175))
				   : (ClientMessage.LEVEL.getLocalisedMessage
				      (VarPlayerDomain.currentLocale,
				       (short) 17173)));
			    string
				= new StringBuilder().append(string).append
				      (Class410.method7458
				       (class401.combatLevel * 8317645,
					(-1617461639
					 * (Class21
					    .myPlayer
					    .anInt11502)),
					(byte) 70))
				      .append
				      (Class6.aString29).append
				      (string_393_).append
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
			     (Class338.method6112(16777215, -1814897702))
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
		    for (int i = 7; i >= 0; i--) {
			if (null != client.playerOptionMessages[i]) {
			    short i_394_ = 0;
			    if ((GameDefinition.RUNESCAPE
				 == client.currentGame)
				&& (client.playerOptionMessages[i].equalsIgnoreCase
				    (ClientMessage.ATTACK.getLocalisedMessage
				     (VarPlayerDomain.currentLocale,
				      (short) 29371)))) {
				if (client.aBool8444
				    && ((class475_sub1_sub1_sub3_sub1
					 .anInt11502) * -1617461639
					> (-1617461639
					   * (Class21
					      .myPlayer
					      .anInt11502))))
				    i_394_ = (short) 2000;
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
					i_394_ = (short) 2000;
				    else
					i_394_ = (short) 0;
				} else if (class475_sub1_sub1_sub3_sub1
					   .aBool11494)
				    i_394_ = (short) 2000;
			    } else if (client.aBoolArray8450[i])
				i_394_ = (short) 2000;
			    short i_395_
				= (short) (i_394_ + client.aShortArray8447[i]);
			    int i_396_ = (-1 != client.playerOptionCursors[i]
					  ? client.playerOptionCursors[i]
					  : 886936997 * client.anInt8387);
			    int i_397_ = bool_392_ ? 16776960 : 16777215;
			    Class534.method11882
				(client.playerOptionMessages[i],
				 new StringBuilder().append
				     (Class338.method6112(i_397_, 1372121873))
				     .append
				     (string).toString(),
				 i_396_, i_395_, -1,
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
		} else if (!bool_392_)
		    Class534.method11882(new StringBuilder().append
					     (Class338.method6112(13421772,
								  -2088158287))
					     .append
					     (string).toString(),
					 "", -1, -1, 0, 0L, 0, 0, false, true,
					 (long) ((class475_sub1_sub1_sub3_sub1
						  .entityIndex)
						 * -546698383),
					 false, -1236921043);
		if (!bool && !bool_392_) {
		    for (Class241_Sub39_Sub11 class241_sub39_sub11
			     = ((Class241_Sub39_Sub11)
				aClass429_150.method7694(16711935));
			 null != class241_sub39_sub11;
			 class241_sub39_sub11
			     = ((Class241_Sub39_Sub11)
				aClass429_150.method7692(827201789))) {
			if (23
			    == (((Class241_Sub39_Sub11) class241_sub39_sub11)
				.anInt10879) * -142243581) {
			    ((Class241_Sub39_Sub11) class241_sub39_sub11)
				.aString10880
				= new StringBuilder().append
				      (Class338.method6112(16777215,
							   -1059685605))
				      .append
				      (string).toString();
			    break;
			}
		    }
		}
	    }
	}
    }
    
    public static String method841(Class241_Sub39_Sub11 class241_sub39_sub11) {
	if (aBool141 || null == class241_sub39_sub11)
	    return "";
	int[] is = Class213.method4309(class241_sub39_sub11, -1772043099);
	if (null == is)
	    return "";
	return Class221.method4476(is, (byte) 101);
    }
    
    static int method842(Class241_Sub39_Sub10 class241_sub39_sub10,
			 Class639 class639) {
	String string = Class334.method6068(class241_sub39_sub10, 1595216901);
	return class639.method13579(string, Class133.aClass168Array1613,
				    1190536090);
    }
    
    static void method843(Class103 class103, int i, int i_398_, int i_399_,
			  int i_400_, int i_401_) {
	if ((Exception_Sub5.aClass168_10705 == null
	     || Class570.aClass168_7359 == null
	     || Class102.aClass168_1448 == null)
	    && Class284.SPRITES_ARCHIVE
		   .method4250(Class540.anInt7003 * -1741231297, 18105161)
	    && Class284.SPRITES_ARCHIVE.method4250((Exception_Sub3.anInt10695
						   * 726901365),
						  1085500415)
	    && Class284.SPRITES_ARCHIVE
		   .method4250(428909623 * Class199.anInt2385, 949644038)) {
	    Class108 class108
		= Class160.method3437(Class284.SPRITES_ARCHIVE,
				      Exception_Sub3.anInt10695 * 726901365,
				      0);
	    Class570.aClass168_7359 = class103.method2289(class108, true);
	    class108.method2705();
	    Class363.aClass168_5534 = class103.method2289(class108, true);
	    Exception_Sub5.aClass168_10705
		= class103.method2289(Class160.method3437((Class284
							   .SPRITES_ARCHIVE),
							  (Class540.anInt7003
							   * -1741231297),
							  0),
				      true);
	    Class108 class108_402_
		= Class160.method3437(Class284.SPRITES_ARCHIVE,
				      428909623 * Class199.anInt2385, 0);
	    Class102.aClass168_1448 = class103.method2289(class108_402_, true);
	    class108_402_.method2705();
	    Class479.aClass168_6416 = class103.method2289(class108_402_, true);
	}
	if (Exception_Sub5.aClass168_10705 != null
	    && null != Class570.aClass168_7359
	    && null != Class102.aClass168_1448) {
	    int i_403_ = ((i_399_ - Class102.aClass168_1448.method3631() * 2)
			  / Exception_Sub5.aClass168_10705.method3631());
	    for (int i_404_ = 0; i_404_ < i_403_; i_404_++)
		Exception_Sub5.aClass168_10705.method3646
		    ((i + Class102.aClass168_1448.method3631()
		      + i_404_ * Exception_Sub5.aClass168_10705.method3631()),
		     (i_398_ + i_400_
		      - Exception_Sub5.aClass168_10705.method3606()));
	    int i_405_
		= ((i_400_ - i_401_ - Class102.aClass168_1448.method3606())
		   / Class570.aClass168_7359.method3606());
	    for (int i_406_ = 0; i_406_ < i_405_; i_406_++) {
		Class570.aClass168_7359.method3646
		    (i, (i_401_ + i_398_
			 + i_406_ * Class570.aClass168_7359.method3606()));
		Class363.aClass168_5534.method3646
		    (i_399_ + i - Class363.aClass168_5534.method3631(),
		     (i_401_ + i_398_
		      + i_406_ * Class570.aClass168_7359.method3606()));
	    }
	    Class102.aClass168_1448.method3646(i, (i_398_ + i_400_
						   - Class102
							 .aClass168_1448
							 .method3606()));
	    Class479.aClass168_6416.method3646
		(i + i_399_ - Class102.aClass168_1448.method3631(),
		 i_400_ + i_398_ - Class102.aClass168_1448.method3606());
	}
    }
    
    static String method844(int i, int i_407_) {
	int i_408_ = i_407_ - i;
	if (i_408_ < -9)
	    return Class338.method6112(16711680, 971630404);
	if (i_408_ < -6)
	    return Class338.method6112(16723968, 1071834352);
	if (i_408_ < -3)
	    return Class338.method6112(16740352, -1945693802);
	if (i_408_ < 0)
	    return Class338.method6112(16756736, -502523485);
	if (i_408_ > 9)
	    return Class338.method6112(65280, -496325167);
	if (i_408_ > 6)
	    return Class338.method6112(4259584, 58500155);
	if (i_408_ > 3)
	    return Class338.method6112(8453888, -426464434);
	if (i_408_ > 0)
	    return Class338.method6112(12648192, -2024391825);
	return Class338.method6112(16776960, 205324938);
    }
    
    static String method845(int i, int i_409_) {
	int i_410_ = i_409_ - i;
	if (i_410_ < -9)
	    return Class338.method6112(16711680, -1835146917);
	if (i_410_ < -6)
	    return Class338.method6112(16723968, -1195658937);
	if (i_410_ < -3)
	    return Class338.method6112(16740352, -1788008170);
	if (i_410_ < 0)
	    return Class338.method6112(16756736, 1343637345);
	if (i_410_ > 9)
	    return Class338.method6112(65280, -1961584402);
	if (i_410_ > 6)
	    return Class338.method6112(4259584, -305015388);
	if (i_410_ > 3)
	    return Class338.method6112(8453888, -1126016117);
	if (i_410_ > 0)
	    return Class338.method6112(12648192, -1891191033);
	return Class338.method6112(16776960, 1165715985);
    }
    
    static String method846(int i, int i_411_) {
	int i_412_ = i_411_ - i;
	if (i_412_ < -9)
	    return Class338.method6112(16711680, -1812825315);
	if (i_412_ < -6)
	    return Class338.method6112(16723968, -1740008832);
	if (i_412_ < -3)
	    return Class338.method6112(16740352, -1081664066);
	if (i_412_ < 0)
	    return Class338.method6112(16756736, 816007308);
	if (i_412_ > 9)
	    return Class338.method6112(65280, 776475473);
	if (i_412_ > 6)
	    return Class338.method6112(4259584, -238259405);
	if (i_412_ > 3)
	    return Class338.method6112(8453888, -404058460);
	if (i_412_ > 0)
	    return Class338.method6112(12648192, -1356209138);
	return Class338.method6112(16776960, -1104895531);
    }
    
    static void method847(Class241_Sub39_Sub11 class241_sub39_sub11, int i,
			  int i_413_) {
	if (class241_sub39_sub11 != null
	    && class241_sub39_sub11 != aClass429_150.aClass241_6093) {
	    int i_414_
		= (((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10873
		   * -510105715);
	    int i_415_
		= (((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10874
		   * 1841217923);
	    int i_416_
		= (((Class241_Sub39_Sub11) class241_sub39_sub11).anInt10879
		   * -142243581);
	    int i_417_
		= (int) (-218357506993850339L
			 * (((Class241_Sub39_Sub11) class241_sub39_sub11)
			    .aLong10877));
	    long l = (((Class241_Sub39_Sub11) class241_sub39_sub11).aLong10877
		      * -218357506993850339L);
	    if (i_416_ >= 2000)
		i_416_ -= 2000;
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    OutgoingOpcode class253 = null;
	    if (18 == i_416_)
		class253 = OutgoingOpcode.GROUND_ITEM_OPTION_1_PACKET;
	    else if (19 == i_416_)
		class253 = OutgoingOpcode.GROUND_ITEM_OPTION_2_PACKET;
	    else if (20 == i_416_)
		class253 = OutgoingOpcode.GROUND_ITEM_OPTION_3_PACKET;
	    else if (21 == i_416_)
		class253 = OutgoingOpcode.GROUND_ITEM_OPTION_4_PACKET;
	    else if (22 == i_416_)
		class253 = OutgoingOpcode.GROUND_ITEM_OPTION_5_PACKET;
	    else if (i_416_ == 1004)
		class253 = OutgoingOpcode.GROUND_ITEM_EXAMINE_PACKET;
	    if (class253 != null) {
		client.anInt8391 = -430880975 * i;
		client.anInt8415 = i_413_ * 1990951441;
		client.anInt8417 = 1664655090;
		client.anInt8416 = 0;
		Class241_Sub27 class241_sub27
		    = Class445_Sub26.makePacket(class253,
						 (client.aClass190_8340
						  .packetCipher),
						 16711935);
		class241_sub27.data.writeShort
		    (i_415_ + 468558693 * class522.baseY, -484048531);
		class241_sub27.data.writeByte
		    (InvType.isForceRun(1319366149) ? 1 : 0,
		     -1309006478);
		class241_sub27.data
		    .writeShort(i_417_, -484048531);
		class241_sub27.data.writeLEShortA
		    (i_414_ + 127679513 * class522.baseX, (byte) 13);
		client.aClass190_8340.sendPacket(class241_sub27, -1501689376);
		Class475_Sub1_Sub3_Sub2.setMinimapFlag(i_414_, i_415_, 903088642);
	    }
	    if (15 == i_416_) {
		Player class475_sub1_sub1_sub3_sub1
		    = client.localPlayers[i_417_];
		if (null != class475_sub1_sub1_sub3_sub1) {
		    client.anInt8391 = i * -430880975;
		    client.anInt8415 = 1990951441 * i_413_;
		    client.anInt8417 = 1664655090;
		    client.anInt8416 = 0;
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(OutgoingOpcode.INTERFACE_ON_PLAYER_PACKET,
						     (client.aClass190_8340
						      .packetCipher),
						     16711935);
		    class241_sub27.data
			.writeLEShortA(1196348233 * client.prevComponentSlot1, (byte) 47);
		    class241_sub27.data
			.writeLEShortA(i_417_, (byte) 8);
		    class241_sub27.data.writeByteC
			(InvType.isForceRun(1319366149) ? 1 : 0,
			 868520951);
		    class241_sub27.data.writeLEShortA
			(2122695965 * client.prevComponentSlot2, (byte) -46);
		    class241_sub27.data.writeIntV1
			(-1349195347 * RSGraphics.prevComponentHash, (byte) 0);
		    client.aClass190_8340.sendPacket(class241_sub27,
						     -2075153131);
		    Class475_Sub1_Sub3_Sub2.setMinimapFlag
			(class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0],
			 class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0],
			 903088642);
		}
	    }
	    if (30 == i_416_ && null == client.aClass58_8384) {
		Class440.method7831(i_415_, i_414_, 1482319719);
		client.aClass58_8384
		    = Class218_Sub3.method16576(i_415_, i_414_, (byte) -125);
		if (client.aClass58_8384 != null)
		    WorldType.refreshComponent(client.aClass58_8384, 1934618432);
	    }
	    if (60 == i_416_) {
		if (482866503 * client.playerRights > 0
		    && Js5ConfigGroup.method1024(66917884))
		    Class22.method903((Class21
				       .myPlayer
				       .nodePlane),
				      i_414_ + class522.baseX * 127679513,
				      i_415_ + class522.baseY * 468558693,
				      (byte) -8);
		else {
		    client.anInt8391 = i * -430880975;
		    client.anInt8415 = 1990951441 * i_413_;
		    client.anInt8417 = -1315156103;
		    client.anInt8416 = 0;
		    Class241_Sub27 class241_sub27 = Class445_Sub26.makePacket(
					OutgoingOpcode.aClass253_4036,
					client.aClass190_8340.packetCipher, 16711935);
		    class241_sub27.data.writeShort(468558693 * class522.baseY + i_415_, -484048531);
		    class241_sub27.data.writeShort(127679513 * class522.baseX + i_414_, -484048531);
		    client.aClass190_8340.sendPacket(class241_sub27, -1983908839);
		}
	    }
	    if (2 == i_416_) {
		client.anInt8391 = -430880975 * i;
		client.anInt8415 = i_413_ * 1990951441;
		client.anInt8417 = 1664655090;
		client.anInt8416 = 0;
		Class241_Sub27 class241_sub27
		    = Class445_Sub26.makePacket(OutgoingOpcode.INTERFACE_ON_OBJECT_PACKET,
						 (client.aClass190_8340
						  .packetCipher),
						 16711935);
		class241_sub27.data
		    .writeShortA(2122695965 * client.prevComponentSlot2, -1665142042);
		class241_sub27.data
		    .writeLEShortA(client.prevComponentSlot1 * 1196348233, (byte) -99);
		class241_sub27.data.writeByteA
		    (InvType.isForceRun(1319366149) ? 1 : 0,
		     1943361896);
		class241_sub27.data
		    .writeIntV2((int) (l >>> 32) & 0x7fffffff, -183974820);
		class241_sub27.data.writeShort
		    (i_414_ + class522.baseX * 127679513, -484048531);
		class241_sub27.data.writeLEShort
		    (468558693 * class522.baseY + i_415_, 146637192);
		class241_sub27.data
		    .writeInt(-1349195347 * RSGraphics.prevComponentHash, -457566968);
		client.aClass190_8340.sendPacket(class241_sub27, -2048042899);
		Class475_Sub1_Sub3_Sub2.setMinimapFlag(i_414_, i_415_, 903088642);
	    }
	    OutgoingOpcode class253_418_ = null;
	    if (i_416_ == 3)
		class253_418_ = OutgoingOpcode.OBJECT_OPTION_1_PACKET;
	    else if (4 == i_416_)
		class253_418_ = OutgoingOpcode.OBJECT_OPTION_2_PACKET;
	    else if (i_416_ == 5)
		class253_418_ = OutgoingOpcode.OBJECT_OPTION_3_PACKET;
	    else if (i_416_ == 6)
		class253_418_ = OutgoingOpcode.OBJECT_OPTION_4_PACKET;
	    else if (1001 == i_416_)
		class253_418_ = OutgoingOpcode.OBJECT_OPTION_5_PACKET;
	    else if (1002 == i_416_)
		class253_418_ = OutgoingOpcode.OBJECT_EXAMINE_PACKET;
	    if (null != class253_418_) {
		client.anInt8391 = -430880975 * i;
		client.anInt8415 = 1990951441 * i_413_;
		client.anInt8417 = 1664655090;
		client.anInt8416 = 0;
		Class241_Sub27 class241_sub27
		    = Class445_Sub26.makePacket(class253_418_,
						 (client.aClass190_8340
						  .packetCipher),
						 16711935);
		class241_sub27.data
		    .writeLEInt((int) (l >>> 32) & 0x7fffffff, 2116126519);
		class241_sub27.data.writeLEShortA
		    (468558693 * class522.baseY + i_415_, (byte) 72);
		class241_sub27.data.writeByteA
		    (InvType.isForceRun(1319366149) ? 1 : 0,
		     2063028503);
		class241_sub27.data.writeLEShortA
		    (i_414_ + class522.baseX * 127679513, (byte) -3);
		client.aClass190_8340.sendPacket(class241_sub27, -2141513239);
		Class475_Sub1_Sub3_Sub2.setMinimapFlag(i_414_, i_415_, 903088642);
	    }
	    OutgoingOpcode class253_419_ = null;
	    if (i_416_ == 9)
		class253_419_ = OutgoingOpcode.NPC_OPTION_1_PACKET;
	    else if (i_416_ == 10)
		class253_419_ = OutgoingOpcode.NPC_OPTION_2_PACKET;
	    else if (11 == i_416_)
		class253_419_ = OutgoingOpcode.NPC_OPTION_3_PACKET;
	    else if (12 == i_416_)
		class253_419_ = OutgoingOpcode.NPC_OPTION_4_PACKET;
	    else if (i_416_ == 13)
		class253_419_ = OutgoingOpcode.NPC_OPTION_5_PACKET;
	    else if (1003 == i_416_)
		class253_419_ = OutgoingOpcode.NPC_EXAMINE_PACKET;
	    if (class253_419_ != null) {
		ObjectNode class241_sub26
		    = ((ObjectNode)
		       client.aClass407_8457.get((long) i_417_));
		if (null != class241_sub26) {
		    NPC class475_sub1_sub1_sub3_sub2
			= ((NPC)
			   class241_sub26.objectValue);
		    client.anInt8391 = -430880975 * i;
		    client.anInt8415 = 1990951441 * i_413_;
		    client.anInt8417 = 1664655090;
		    client.anInt8416 = 0;
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(class253_419_,
						     (client.aClass190_8340
						      .packetCipher),
						     16711935);
		    class241_sub27.data.writeByteS
			(InvType.isForceRun(1319366149) ? 1 : 0,
			 2045121343);
		    class241_sub27.data
			.writeShortA(i_417_, -1168714858);
		    client.aClass190_8340.sendPacket(class241_sub27,
						     -2006667217);
		    Class475_Sub1_Sub3_Sub2.setMinimapFlag
			(class475_sub1_sub1_sub3_sub2.scenePositionXQueue[0],
			 class475_sub1_sub1_sub3_sub2.scenePositionYQueue[0],
			 903088642);
		}
	    }
	    if (23 == i_416_) {
		if (482866503 * client.playerRights > 0
		    && Js5ConfigGroup.method1024(-681786503))
		    Class22.method903((Class21
				       .myPlayer
				       .nodePlane),
				      i_414_ + class522.baseX * 127679513,
				      class522.baseY * 468558693 + i_415_,
				      (byte) -104);
		else {
		    Class241_Sub27 class241_sub27
			= Class461.createWalkPacket(i_414_, i_415_, i_417_,
					       121160667);
		    if (1 == i_417_) {
			class241_sub27.data
			    .writeByte(-1, 443887752);
			class241_sub27.data
			    .writeByte(-1, -1543725977);
			class241_sub27.data
			    .writeShort((int) client.aFloat8581, -484048531);
			class241_sub27.data
			    .writeByte(57, 78890592);
			class241_sub27.data.writeByte
			    (390680985 * client.anInt8513, 857684481);
			class241_sub27.data.writeByte
			    (1747300637 * client.anInt8377, -1421944067);
			class241_sub27.data
			    .writeByte(89, -660416942);
			Class287 class287
			    = (Class21.myPlayer
				   .method10874
			       ().aClass287_4386);
			class241_sub27.data.writeShort
			    ((int) class287.aFloat4477, -484048531);
			class241_sub27.data.writeShort
			    ((int) class287.aFloat4479, -484048531);
			class241_sub27.data
			    .writeByte(63, 1484683399);
		    } else {
			client.anInt8391 = -430880975 * i;
			client.anInt8415 = i_413_ * 1990951441;
			client.anInt8417 = -1315156103;
			client.anInt8416 = 0;
		    }
		    client.aClass190_8340.sendPacket(class241_sub27,
						     -1592600012);
		    Class475_Sub1_Sub3_Sub2.setMinimapFlag(i_414_, i_415_,
							903088642);
		}
	    }
	    if (i_416_ == 58) {
		InterfaceComponent class58
		    = Class218_Sub3.method16576(i_415_, i_414_, (byte) -38);
		if (class58 != null)
		    Class462.processItemOnItem(class58, (byte) -1);
	    }
	    if (i_416_ == 16) {
		client.anInt8391 = i * -430880975;
		client.anInt8415 = i_413_ * 1990951441;
		client.anInt8417 = 1664655090;
		client.anInt8416 = 0;
		Class241_Sub27 class241_sub27
		    = Class445_Sub26.makePacket(OutgoingOpcode.INTERFACE_ON_PLAYER_PACKET,
						 (client.aClass190_8340
						  .packetCipher),
						 16711935);
		class241_sub27.data
		    .writeLEShortA(1196348233 * client.prevComponentSlot1, (byte) -24);
		class241_sub27.data.writeLEShortA
		    ((Class21.myPlayer.entityIndex
		      * -546698383),
		     (byte) -17);
		class241_sub27.data.writeByteC
		    (InvType.isForceRun(1319366149) ? 1 : 0,
		     868520951);
		class241_sub27.data
		    .writeLEShortA(client.prevComponentSlot2 * 2122695965, (byte) -59);
		class241_sub27.data
		    .writeIntV1(RSGraphics.prevComponentHash * -1349195347, (byte) 0);
		client.aClass190_8340.sendPacket(class241_sub27, -1668724782);
	    }
	    if (17 == i_416_) {
		client.anInt8391 = -430880975 * i;
		client.anInt8415 = i_413_ * 1990951441;
		client.anInt8417 = 1664655090;
		client.anInt8416 = 0;
		Class241_Sub27 class241_sub27
		    = Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4070,
						 (client.aClass190_8340
						  .packetCipher),
						 16711935);
		class241_sub27.data.writeByte
		    (InvType.isForceRun(1319366149) ? 1 : 0,
		     883312388);
		class241_sub27.data
		    .writeLEShort(2122695965 * client.prevComponentSlot2, 2012617026);
		class241_sub27.data
		    .writeIntV2(RSGraphics.prevComponentHash * -1349195347, 993157557);
		class241_sub27.data.writeShortA
		    (127679513 * class522.baseX + i_414_, -1208481528);
		class241_sub27.data.writeLEShortA(i_417_,
								    (byte) 5);
		class241_sub27.data.writeLEShortA
		    (i_415_ + 468558693 * class522.baseY, (byte) 82);
		class241_sub27.data
		    .writeShort(1196348233 * client.prevComponentSlot1, -484048531);
		client.aClass190_8340.sendPacket(class241_sub27, -2103360023);
		Class475_Sub1_Sub3_Sub2.setMinimapFlag(i_414_, i_415_, 903088642);
	    }
	    OutgoingOpcode class253_420_ = null;
	    if (44 == i_416_)
		class253_420_ = OutgoingOpcode.PLAYER_OPTION_1_PACKET;
	    else if (i_416_ == 45)
		class253_420_ = OutgoingOpcode.PLAYER_OPTION_2_PACKET;
	    else if (i_416_ == 46)
		class253_420_ = OutgoingOpcode.PLAYER_OPTION_3_PACKET;
	    else if (i_416_ == 47)
		class253_420_ = OutgoingOpcode.PLAYER_OPTION_4_PACKET;
	    else if (i_416_ == 48)
		class253_420_ = OutgoingOpcode.PLAYER_OPTION_5_PACKET;
	    else if (49 == i_416_)
		class253_420_ = OutgoingOpcode.PLAYER_OPTION_6_PACKET;
	    else if (i_416_ == 50)
		class253_420_ = OutgoingOpcode.PLAYER_OPTION_7_PACKET;
	    else if (51 == i_416_)
		class253_420_ = OutgoingOpcode.PLAYER_OPTION_8_PACKET;
	    else if (52 == i_416_)
		class253_420_ = OutgoingOpcode.PLAYER_OPTION_9_PACKET;
	    else if (i_416_ == 53)
		class253_420_ = OutgoingOpcode.PLAYER_OPTION_10_PACKET;
	    if (null != class253_420_) {
		Player class475_sub1_sub1_sub3_sub1
		    = client.localPlayers[i_417_];
		if (null != class475_sub1_sub1_sub3_sub1) {
		    client.anInt8391 = -430880975 * i;
		    client.anInt8415 = i_413_ * 1990951441;
		    client.anInt8417 = 1664655090;
		    client.anInt8416 = 0;
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(class253_420_,
						     (client.aClass190_8340
						      .packetCipher),
						     16711935);
		    class241_sub27.data
			.writeShortA(i_417_, -420974315);
		    class241_sub27.data.writeByte
			(InvType.isForceRun(1319366149) ? 1 : 0,
			 -1623470318);
		    client.aClass190_8340.sendPacket(class241_sub27,
						     -2049101378);
		    Class475_Sub1_Sub3_Sub2.setMinimapFlag
			(class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0],
			 class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0],
			 903088642);
		}
	    }
	    if (25 == i_416_) {
		InterfaceComponent class58
		    = Class218_Sub3.method16576(i_415_, i_414_, (byte) -45);
		if (class58 != null) {
		    Class520.method11688(-2016707763);
		    Class241_Sub20 class241_sub20
			= client.method13624(class58);
		    Class107.method2689(class58,
					class241_sub20
					    .method15040((short) -13807),
					class241_sub20.anInt9008 * -1892353525,
					(byte) 70);
		    client.aString8464
			= Class518.method11662(class58, (byte) -84);
		    if (client.aString8464 == null)
			client.aString8464 = "Null";
		    client.aString8465
			= new StringBuilder().append(class58.aString933).append
			      (Class338.method6112(16777215, -1552804340))
			      .toString();
		}
	    } else {
		if (57 == i_416_ || i_416_ == 1007)
		    Class581.processActionButton(i_417_, i_415_, i_414_,
					 ((Class241_Sub39_Sub11)
					  class241_sub39_sub11).aString10869,
					 -632635679);
		if (i_416_ == 59) {
		    client.anInt8391 = i * -430880975;
		    client.anInt8415 = 1990951441 * i_413_;
		    client.anInt8417 = -1315156103;
		    client.anInt8416 = 0;
		    Class241_Sub27 class241_sub27
			= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4033,
						     (client.aClass190_8340
						      .packetCipher),
						     16711935);
		    class241_sub27.data.writeShort
			(class522.baseY * 468558693 + i_415_, -484048531);
		    class241_sub27.data.writeInt
			(-1349195347 * RSGraphics.prevComponentHash, 807626375);
		    class241_sub27.data.writeLEShortA
			(class522.baseX * 127679513 + i_414_, (byte) 5);
		    class241_sub27.data.writeLEShort
			(1196348233 * client.prevComponentSlot1, -127293259);
		    class241_sub27.data
			.writeLEShortA(client.prevComponentSlot2 * 2122695965, (byte) 81);
		    client.aClass190_8340.sendPacket(class241_sub27,
						     -1880647245);
		    Class475_Sub1_Sub3_Sub2.setMinimapFlag(i_414_, i_415_,
							903088642);
		}
		if (i_416_ == 8) {
		    ObjectNode class241_sub26
			= ((ObjectNode)
			   client.aClass407_8457.get((long) i_417_));
		    if (null != class241_sub26) {
			NPC class475_sub1_sub1_sub3_sub2
			    = ((NPC)
			       class241_sub26.objectValue);
			client.anInt8391 = -430880975 * i;
			client.anInt8415 = 1990951441 * i_413_;
			client.anInt8417 = 1664655090;
			client.anInt8416 = 0;
			Class241_Sub27 class241_sub27
			    = Class445_Sub26.makePacket((OutgoingOpcode
							  .aClass253_4046),
							 (client.aClass190_8340
							  .packetCipher),
							 16711935);
			class241_sub27.data
			    .writeShortA(i_417_, -850816908);
			class241_sub27.data.writeShort
			    (2122695965 * client.prevComponentSlot2, -484048531);
			class241_sub27.data.writeLEShortA
			    (client.prevComponentSlot1 * 1196348233, (byte) -19);
			class241_sub27.data.writeByte
			    ((InvType.isForceRun(1319366149) ? 1
			      : 0),
			     142774426);
			class241_sub27.data.writeIntV1
			    (-1349195347 * RSGraphics.prevComponentHash, (byte) 0);
			client.aClass190_8340.sendPacket(class241_sub27,
							 -2075171807);
			Class475_Sub1_Sub3_Sub2.setMinimapFlag
			    (class475_sub1_sub1_sub3_sub2.scenePositionXQueue[0],
			     class475_sub1_sub1_sub3_sub2.scenePositionYQueue[0],
			     903088642);
		    }
		}
		if (i_416_ == 1008 || 1009 == i_416_ || 1010 == i_416_
		    || i_416_ == 1011 || i_416_ == 1012)
		    Class271.method5314(i_416_, i_417_, i_414_, 421967667);
		if (client.aBool8544)
		    Class520.method11688(-1793651227);
		if (null != Class566.aClass58_7322
		    && 0 == 1187065937 * client.anInt8274)
		    WorldType.refreshComponent(Class566.aClass58_7322, -1641939551);
	    }
	}
    }
    
    static Class241_Sub27 method848(int i, int i_421_, int i_422_) {
	Class241_Sub27 class241_sub27 = null;
	if (0 == i_422_)
	    class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.WALKING_PACKET,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	if (1 == i_422_)
	    class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.MINI_WALKING_PACKET,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	class241_sub27.data
	    .writeShortA(class522.baseX * 127679513 + i, -872286335);
	class241_sub27.data
	    .writeLEShortA(class522.baseY * 468558693 + i_421_, (byte) 0);
	class241_sub27.data.writeByteA
	    (InvType.isForceRun(1319366149) ? 1 : 0, 1972770299);
	Class194.minimapFlagX = -980260023 * i;
	Class194.minimapFlagY = i_421_ * -1262506991;
	Class194.aBool2302 = false;
	Class41.method1064(-1169590571);
	return class241_sub27;
    }
    
    public static boolean method849(int i) {
	for (Class241_Sub39_Sub11 class241_sub39_sub11
		 = (Class241_Sub39_Sub11) aClass429_150.method7694(16711935);
	     null != class241_sub39_sub11;
	     class241_sub39_sub11 = ((Class241_Sub39_Sub11)
				     aClass429_150.method7692(544039112))) {
	    if (Class321.method5931((((Class241_Sub39_Sub11)
				      class241_sub39_sub11).anInt10879
				     * -142243581),
				    (byte) 2)
		&& (long) i == -218357506993850339L * (((Class241_Sub39_Sub11)
							class241_sub39_sub11)
						       .aLong10877))
		return true;
	}
	return false;
    }
    
    static Class241_Sub27 method850(int i, int i_423_, int i_424_) {
	Class241_Sub27 class241_sub27 = null;
	if (0 == i_424_)
	    class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.WALKING_PACKET,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	if (1 == i_424_)
	    class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.MINI_WALKING_PACKET,
					     (client.aClass190_8340
					      .packetCipher),
					     16711935);
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	class241_sub27.data
	    .writeShortA(class522.baseX * 127679513 + i, -1434626180);
	class241_sub27.data
	    .writeLEShortA(class522.baseY * 468558693 + i_423_, (byte) -36);
	class241_sub27.data.writeByteA
	    (InvType.isForceRun(1319366149) ? 1 : 0, 1982029805);
	Class194.minimapFlagX = -980260023 * i;
	Class194.minimapFlagY = i_423_ * -1262506991;
	Class194.aBool2302 = false;
	Class41.method1064(-56087952);
	return class241_sub27;
    }
    
    static void method851(int i, int i_425_) {
	if (Class128.aClass513_1589.aBool6714
	    || (1327183635 * anInt148 != 1
		&& (!Class120_Sub18.aBool10606 || 2 != anInt148 * 1327183635
		    || !(((Class241_Sub39_Sub11)
			  Class540.aClass241_Sub39_Sub11_7002)
			     .aString10871.equals
			 (ClientMessage.FACEHERE.getLocalisedMessage
			  (VarPlayerDomain.currentLocale, (short) 32359)))))) {
	    Class639 class639 = OnlineStatus.method7519(2062692748);
	    int i_426_
		= (class639.method13562
		   (ClientMessage.CHOOSEOPTION
			.getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 27712),
		    (byte) 121));
	    int i_427_;
	    if (!aBool171) {
		for (Class241_Sub39_Sub11 class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    aClass429_150.method7694(16711935));
		     class241_sub39_sub11 != null;
		     class241_sub39_sub11
			 = ((Class241_Sub39_Sub11)
			    aClass429_150.method7692(27357806))) {
		    int i_428_ = Class277.method5374(class241_sub39_sub11,
						     class639, (byte) -40);
		    if (i_428_ > i_426_)
			i_426_ = i_428_;
		}
		i_426_ += 8;
		i_427_ = 21 + anInt148 * 1327183635 * (1149989507 * anInt164);
		LoadingScreenDef.anInt5500
		    = -1996937561 * ((aBool168 ? 26 : 22)
				     + anInt148 * 1327183635 * (anInt164
								* 1149989507));
	    } else {
		for (Class241_Sub39_Sub10 class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7440(-1397088259));
		     null != class241_sub39_sub10;
		     class241_sub39_sub10
			 = ((Class241_Sub39_Sub10)
			    aClass410_152.method7435((byte) -1))) {
		    int i_429_;
		    if (1 == 1633676605 * ((Class241_Sub39_Sub10)
					   class241_sub39_sub10).anInt10867)
			i_429_
			    = Class277.method5374(((Class241_Sub39_Sub11)
						   (((Class241_Sub39_Sub10)
						     class241_sub39_sub10)
						    .aClass410_10866
						    .aClass241_Sub39_5934
						    .aClass241_Sub39_10148)),
						  class639, (byte) -49);
		    else
			i_429_ = Class106.method2677(class241_sub39_sub10,
						     class639, 1356120778);
		    if (i_429_ > i_426_)
			i_426_ = i_429_;
		}
		i_426_ += 8;
		i_427_ = 1149989507 * anInt164 * (-1887420811 * anInt149) + 21;
		LoadingScreenDef.anInt5500
		    = (anInt149 * -1887420811 * (1149989507 * anInt164)
		       + (aBool168 ? 26 : 22)) * -1996937561;
	    }
	    i_426_ += 10;
	    int i_430_ = i - i_426_ / 2;
	    if (i_430_ + i_426_ > -1080559003 * Class494.canvasWid)
		i_430_ = Class494.canvasWid * -1080559003 - i_426_;
	    if (i_430_ < 0)
		i_430_ = 0;
	    int i_431_ = i_425_;
	    if (i_431_ + i_427_ > Class67.canvasHei * 963058943)
		i_431_ = 963058943 * Class67.canvasHei - i_427_;
	    if (i_431_ < 0)
		i_431_ = 0;
	    anInt156 = i_430_ * -1574130117;
	    Class380.anInt5660 = i_431_ * 71817495;
	    Class593.anInt7631 = -1038752221 * i_426_;
	    anInt144 = (int) (Math.random() * 24.0) * -276059845;
	    aBool141 = true;
	}
    }
    
    static void method852() {
	if (null != aClass241_Sub39_Sub10_143) {
	    aClass241_Sub39_Sub10_143 = null;
	    Class579.method12709(Class193.anInt2298 * 1955430821,
				 282057643 * Class4.anInt16,
				 anInt147 * -885853667,
				 Class395.anInt5784 * -950722911, (byte) -99);
	}
    }
    
    public static void method853(String string, boolean bool,
				 String string_432_, boolean bool_433_,
				 int i) {
	if (bool) {
	    do {
		if (!bool_433_ && Desktop.isDesktopSupported()
		    && Desktop.getDesktop()
			   .isSupported(Desktop.Action.BROWSE)) {
		    try {
			Desktop.getDesktop().browse(new URI(string));
		    } catch (Exception exception) {
			break;
		    }
		    return;
		}
	    } while (false);
	    if (Class242.aString2780.startsWith("win") && !bool_433_)
		Class330.method6035(string, 0, 1467128901);
	    else if (Class242.aString2780.startsWith("mac"))
		Class68.method1676(string, 1, string_432_, -1768583303);
	    else
		Class330.method6035(string, 2, 1467128901);
	} else
	    Class330.method6035(string, 3, 1467128901);
    }
    
    static final void setVarcompContextSelectEvent/*method854*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class481.setContextMenuSelectEvent(component, iFace, scriptData, -759362859);
    }
    
    static String method855(long l) {
	if (l <= 0L || l >= 6582952005840035281L)
	    return null;
	if (l % 37L == 0L)
	    return null;
	int i = 0;
	for (long l_434_ = l; l_434_ != 0L; l_434_ /= 37L)
	    i++;
	StringBuilder stringbuilder = new StringBuilder(i);
	while (0L != l) {
	    long l_435_ = l;
	    l /= 37L;
	    char c = Class452.aCharArray6210[(int) (l_435_ - 37L * l)];
	    if ('_' == c) {
		int i_436_ = stringbuilder.length() - 1;
		stringbuilder.setCharAt
		    (i_436_,
		     Character.toUpperCase(stringbuilder.charAt(i_436_)));
		c = '\u00a0';
	    }
	    stringbuilder.append(c);
	}
	stringbuilder.reverse();
	stringbuilder
	    .setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
	return stringbuilder.toString();
    }
    
    static final void method856(int i) {
	for (Class247_Sub2 class247_sub2
		 = ((Class247_Sub2)
		    client.aClass421_8411.method7527(2034617147));
	     class247_sub2 != null;
	     class247_sub2 = ((Class247_Sub2)
			      client.aClass421_8411.method7527(2034617147)))
	    Class548.method12002(class247_sub2, (byte) 110);
	int i_437_ = 0;
	int i_438_ = 3;
	if (client.anInt8266 * -831877317 == 4) {
	    for (int i_439_ = i_437_; i_439_ <= i_438_; i_439_++)
		client.method13620(i_439_);
	    client.method13622();
	} else {
	    client.method13617();
	    for (int i_440_ = i_437_; i_440_ <= i_438_; i_440_++) {
		client.method13618();
		client.method13619(i_440_);
		client.method13620(i_440_);
	    }
	    client.method13658();
	    client.method13622();
	}
    }
}
