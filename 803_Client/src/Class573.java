/* Class573 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Class573
{
    static int[] anIntArray7367;
    static int anInt7368;
    static short[] aShortArray7369;
    protected static Class524 aClass524_7370;
    static RSByteBuffer aClass241_Sub3_7371;
    protected static Interface11 anInterface11_7372;
    protected static Interface13 anInterface13_7373;
    public static ErrorDefaults aClass497_7374;
    static final int anInt7375 = 64;
    protected static JS5 aClass210_7376;
    static HashTable aClass407_7377 = new HashTable(16);
    static byte[] aByteArray7378;
    static int anInt7379;
    protected static byte[][][] aByteArrayArrayArray7380;
    protected static int anInt7381;
    static int[] anIntArray7382;
    static byte[] aByteArray7383;
    protected static int anInt7384 = (int) (Math.random() * 11.0) - 5;
    static Class394 aClass394_7385;
    protected static Class564 aClass564_7386;
    protected static NodeCollection aClass429_7387;
    public static int anInt7388;
    public static int anInt7389;
    protected static int anInt7390;
    protected static int anInt7391;
    static int[] anIntArray7392;
    static byte[] aByteArray7393;
    static int[][] anIntArrayArray7394;
    protected static int anInt7395;
    static byte[] aByteArray7396;
    static byte[] aByteArray7397;
    static Object[] anObjectArray7398;
    static byte[] aByteArray7399;
    static int anInt7400;
    static int[] anIntArray7401;
    public static float aFloat7402;
    static int anInt7403;
    static int anInt7404;
    public static Class241_Sub39_Sub12 aClass241_Sub39_Sub12_7405;
    static int anInt7406;
    static int anInt7407;
    public static float aFloat7408;
    static int anInt7409;
    static int anInt7410;
    static HashMap[][][] aHashMapArrayArrayArray7411;
    protected static Class129 aClass129_7412;
    protected static Class129 aClass129_7413;
    protected static Class129 aClass129_7414;
    static int anInt7415;
    static ArrayList anArrayList7416;
    static RSByteBuffer aClass241_Sub3_7417;
    static int[] anIntArray7418;
    protected static int anInt7419;
    static int anInt7420;
    protected static ObjectDefinitionLoader aClass532_7421;
    static boolean[] aBoolArray7422;
    protected static boolean aBool7423;
    static Class476 aClass476_7424;
    protected static int anInt7425;
    protected static int anInt7426;
    protected static int anInt7427;
    protected static int anInt7428;
    protected static int anInt7429;
    protected static int anInt7430;
    protected static int anInt7431;
    protected static boolean aBool7432;
    protected static int anInt7433 = (int) (Math.random() * 17.0) - 8;
    static int anInt7434;
    static boolean[][] aBoolArrayArray7435;
    protected static Class598 aClass598_7436;
    
    static void method12553(int[] is, int i, int i_0_, int i_1_, int i_2_,
			    int i_3_) {
	int i_4_ = i + (i_2_ - i_0_ - 1) * i_2_;
	for (int i_5_ = 0; i_5_ < i_1_; i_5_++)
	    is[i_4_ + i_5_ * i_2_] = i_3_;
    }
    
    public static void method12554(JS5 worldMapData, Class476 class476, Class394 class394,
	 ObjectDefinitionLoader class532, Class524 class524, Class598 class598,
	 Interface13 interface13, Interface11 interface11) {
		aClass210_7376 = worldMapData;
		aClass476_7424 = class476;
		aClass394_7385 = class394;
		aClass532_7421 = class532;
		aClass524_7370 = class524;
		aClass598_7436 = class598;
		anInterface13_7373 = interface13;
		anInterface11_7372 = interface11;
		aClass407_7377.method7293(-397831409);
		int i = aClass210_7376.identifierToIndex("details", -187631888);
		int[] is = aClass210_7376.getChildIndicies(i, (byte) 82);
		if (is != null) {
		    for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
			Class241_Sub39_Sub12 class241_sub39_sub12
			    = Class611.method13230(aClass210_7376, i, is[i_6_],
						   1641999569);
			aClass407_7377.put(class241_sub39_sub12,
						  (long) ((class241_sub39_sub12
							   .anInt10925)
							  * 1100684019));
		    }
		}
		Class81.method1812(true, false, 953486904);
    }
    
    static void method12555() {
	aByteArray7393 = new byte[anInt7390 * anInt7391];
	aByteArray7396 = new byte[anInt7390 * anInt7391];
	aByteArray7397 = new byte[anInt7390 * anInt7391];
	anObjectArray7398 = new Object[anInt7390 * anInt7391];
	aByteArray7399 = new byte[anInt7390 * anInt7391];
	aHashMapArrayArrayArray7411
	    = new HashMap[3][anInt7390 >> 6][anInt7391 >> 6];
	anIntArray7392 = new int[aClass476_7424.anInt6398 * 661753477 + 1];
	aBoolArrayArray7435 = new boolean[anInt7390 / 8][anInt7391 / 8];
    }
    
    static void method12556(int[] is, int i, int i_7_, int i_8_, int i_9_,
			    int i_10_) {
	int i_11_ = i + (i_9_ - i_7_ - 1) * i_9_;
	for (int i_12_ = 0; i_12_ < i_8_; i_12_++)
	    is[i_11_ + i_12_ * i_9_] = i_10_;
    }
    
    static void method12557(int i) {
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = (Class241_Sub39_Sub12) aClass407_7377.get((long) i);
	if (class241_sub39_sub12 != null
	    && class241_sub39_sub12 != aClass241_Sub39_Sub12_7405) {
	    aClass241_Sub39_Sub12_7405 = class241_sub39_sub12;
	    aBool7432 = (aClass241_Sub39_Sub12_7405.anInt10925 * 1100684019
			 == aClass497_7374.anInt6533 * -1604459277);
	}
    }
    
    static boolean method12558(Class241_Sub39_Sub12 class241_sub39_sub12) {
	if (class241_sub39_sub12 != null
	    && class241_sub39_sub12 != aClass241_Sub39_Sub12_7405) {
	    aClass241_Sub39_Sub12_7405 = class241_sub39_sub12;
	    aBool7432 = (aClass241_Sub39_Sub12_7405.anInt10925 * 1100684019
			 == aClass497_7374.anInt6533 * -1604459277);
	    return true;
	}
	return false;
    }
    
    static int method12559(long l) {
	Class168 class168 = (Class168) aClass129_7414.get(l);
	if (class168 != null)
	    return class168.method3631();
	return -1;
    }
    
    public static Class241_Sub39_Sub12 method12560(int i) {
	return (Class241_Sub39_Sub12) aClass407_7377.get((long) i);
    }
    
    static void method12561() {
	aByteArray7393 = null;
	aByteArray7378 = null;
	aShortArray7369 = null;
	aByteArray7396 = null;
	aByteArray7397 = null;
	anObjectArray7398 = null;
	aByteArray7399 = null;
	aHashMapArrayArrayArray7411 = null;
	anIntArray7392 = null;
	aBoolArrayArray7435 = null;
    }
    
    static void method12562(int[] is, int i, int i_13_, int i_14_, int i_15_,
			    int i_16_) {
	int i_17_ = aClass497_7374.anInt6541 * -1585524463 >> 24 & 0xff;
	int i_18_ = 255 - i_17_;
	for (int i_19_ = i; i_19_ <= i_13_; i_19_++) {
	    for (int i_20_ = i_14_; i_20_ <= i_15_; i_20_++) {
		int i_21_ = is[(i_16_ - i_20_ - 1) * i_16_ + i_19_];
		if (i_21_ != anInt7434) {
		    anInt7434 = i_21_;
		    anInt7400
			= (~0xffffff
			   | ((((aClass497_7374.anInt6541 * -1585524463
				 & 0xff00ff) * i_17_
				+ (i_21_ & 0xff00ff) * i_18_)
			       & ~0xff00ff)
			      + ((aClass497_7374.anInt6541 * -1585524463
				  & 0xff00) * i_17_ + (i_21_ & 0xff00) * i_18_
				 & 0xff0000)) >> 8);
		}
		is[(i_16_ - i_20_ - 1) * i_16_ + i_19_] = anInt7400;
	    }
	}
    }
    
    static int method12563(Class107 class107, int i, int i_22_, int i_23_) {
	Class467 class467 = aClass476_7424.method10906(i, -1370236314);
	if (class467 == null)
	    return 0;
	int i_24_ = class467.anInt6321 * -701216129;
	if (i_24_ >= 0 && class107.method2680(i_24_, -2074401387).aBool1434)
	    i_24_ = -1;
	int i_25_;
	if (class467.anInt6323 * -1240842283 >= 0) {
	    int i_26_ = class467.anInt6323 * -1240842283;
	    int i_27_ = (i_26_ & 0x7f) + i_23_;
	    if (i_27_ < 0)
		i_27_ = 0;
	    else if (i_27_ > 127)
		i_27_ = 127;
	    int i_28_ = (i_26_ + i_22_ & 0xfc00) + (i_26_ & 0x380) + i_27_;
	    i_25_ = ~0xffffff | (Class474.anIntArray6382
				 [(Class241_Sub42.method16451
				   (Class445_Sub30.method14388(i_28_, 96,
							       -24686040),
				    -7055722)) & 0xffff]);
	} else if (i_24_ >= 0)
	    i_25_ = (~0xffffff
		     | (Class474.anIntArray6382
			[(Class241_Sub42.method16451
			  (Class445_Sub30.method14388((class107.method2680
						       (i_24_, -1103938048)
						       .aShort1436),
						      96, 306674398),
			   467979658)) & 0xffff]));
	else if (class467.anInt6320 * -1439860245 == -1)
	    i_25_ = 0;
	else {
	    int i_29_ = class467.anInt6320 * -1439860245;
	    int i_30_ = (i_29_ & 0x7f) + i_23_;
	    if (i_30_ < 0)
		i_30_ = 0;
	    else if (i_30_ > 127)
		i_30_ = 127;
	    int i_31_ = (i_29_ + i_22_ & 0xfc00) + (i_29_ & 0x380) + i_30_;
	    i_25_ = ~0xffffff | (Class474.anIntArray6382
				 [(Class241_Sub42.method16451
				   (Class445_Sub30.method14388(i_31_, 96,
							       -261813962),
				    150158912)) & 0xffff]);
	}
	return i_25_;
    }
    
    static boolean method12564(Class103 class103, int i, int i_32_,
			       boolean bool) {
	long l = Class50.method1249((byte) 1);
	if (anInt7419 == 0) {
	    if (aClass241_Sub39_Sub12_7405.anInt10925 * 1100684019
		== aClass497_7374.anInt6529 * -431953051) {
		if (aClass241_Sub3_7417 == null)
		    aClass241_Sub3_7417
			= new RSByteBuffer(aClass210_7376.readContainerByIndentifiers
					    ((aClass241_Sub39_Sub12_7405
					      .aString10922),
					     "area", 937282926));
		aClass241_Sub3_7371 = aClass241_Sub3_7417;
		aClass241_Sub3_7371.pointer = 0;
	    } else
		aClass241_Sub3_7371
		    = (new RSByteBuffer
		       (aClass210_7376.readContainerByIndentifiers((aClass241_Sub39_Sub12_7405
						   .aString10922),
						  "area", 704267512)));
	    int i_33_ = aClass241_Sub3_7371.readUnsignedByte((byte) 18);
	    anIntArray7401 = new int[i_33_];
	    for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
		anIntArray7401[i_34_]
		    = aClass241_Sub3_7371.readSmart((short) -4443);
	    int i_35_ = aClass241_Sub3_7371.readUnsignedByte((byte) 25);
	    anIntArray7367 = new int[i_35_];
	    for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
		anIntArray7367[i_36_]
		    = aClass241_Sub3_7371.readSmart((short) -12626);
	}
	while (aClass241_Sub3_7371 != null
	       && (aClass241_Sub3_7371.pointer * 421967667
		   < aClass241_Sub3_7371.payload.length)
	       && (!bool
		   || Class50.method1249((byte) 1) < l + (long) anInt7420)) {
	    if (aClass241_Sub3_7371.readUnsignedByte((byte) 95) == 0) {
		int i_37_ = aClass241_Sub3_7371.readUnsignedByte((byte) 6);
		int i_38_ = aClass241_Sub3_7371.readUnsignedByte((byte) -47);
		for (int i_39_ = 0; i_39_ < 8; i_39_++) {
		    int i_40_ = aClass241_Sub3_7371.readUnsignedByte((byte) 6);
		    int i_41_ = i_37_ * 8 + i_39_ - anInt7388 / 8;
		    for (int i_42_ = 0; i_42_ < 8; i_42_++) {
			int i_43_ = i_38_ * 8 + i_42_ - anInt7389 / 8;
			aBoolArrayArray7435[i_41_][i_43_]
			    = (i_40_ & 1 << i_42_) != 0;
		    }
		}
		for (int i_44_ = 0; i_44_ < 64; i_44_++) {
		    for (int i_45_ = 0; i_45_ < 64; i_45_++) {
			int i_46_ = i_37_ * 64 + i_44_ - anInt7388;
			int i_47_ = i_38_ * 64 + i_45_ - anInt7389;
			method12586(class103, aClass241_Sub3_7371, i_37_,
				    i_38_, i_46_, i_47_, anIntArray7401,
				    anIntArray7367);
		    }
		}
	    } else {
		int i_48_ = aClass241_Sub3_7371.readUnsignedByte((byte) 49);
		int i_49_ = aClass241_Sub3_7371.readUnsignedByte((byte) -2);
		int i_50_ = aClass241_Sub3_7371.readUnsignedByte((byte) 67);
		int i_51_ = aClass241_Sub3_7371.readUnsignedByte((byte) -74);
		aBoolArrayArray7435[i_48_ * 8 + i_50_ - anInt7388 / 8]
		    [i_49_ * 8 + i_51_ - anInt7389 / 8]
		    = aClass241_Sub3_7371.readUnsignedByte((byte) 18) != 0;
		for (int i_52_ = 0; i_52_ < 8; i_52_++) {
		    for (int i_53_ = 0; i_53_ < 8; i_53_++) {
			int i_54_ = i_48_ * 64 + i_50_ * 8 + i_52_ - anInt7388;
			int i_55_ = i_49_ * 64 + i_51_ * 8 + i_53_ - anInt7389;
			method12586(class103, aClass241_Sub3_7371, i_48_,
				    i_49_, i_54_, i_55_, anIntArray7401,
				    anIntArray7367);
		    }
		}
	    }
	}
	if (aClass241_Sub3_7371 != null) {
	    anInt7419 = aClass241_Sub3_7371.pointer * 421967667;
	    if (aClass241_Sub3_7371.pointer * 421967667
		< aClass241_Sub3_7371.payload.length)
		return false;
	}
	aClass241_Sub3_7371 = null;
	anIntArray7367 = null;
	anIntArray7401 = null;
	if (aByteArray7393 != null) {
	    aByteArray7378 = new byte[anInt7390 * anInt7391];
	    aShortArray7369 = new short[anInt7390 * anInt7391];
	    for (int i_56_ = 0; i_56_ < 3; i_56_++) {
		byte[] is = new byte[anInt7390 * anInt7391];
		for (int i_57_ = 0;
		     i_57_ < aHashMapArrayArrayArray7411[i_56_].length;
		     i_57_++) {
		    for (int i_58_ = 0;
			 i_58_ < aHashMapArrayArrayArray7411[i_56_][0].length;
			 i_58_++) {
			HashMap hashmap
			    = aHashMapArrayArrayArray7411[i_56_][i_57_][i_58_];
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class575 class575 = (Class575) iterator.next();
				is[(i_57_ * 64
				    + ((Class575) class575).aByte7443
				    + ((i_58_ * 64
					+ ((Class575) class575).aByte7438)
				       * anInt7390))]
				    = (byte) ((Class575) class575).anInt7441;
			    }
			}
		    }
		}
		method12617(is, aByteArray7378, aShortArray7369, i, i_32_);
		for (int i_59_ = 0;
		     i_59_ < aHashMapArrayArrayArray7411[i_56_].length;
		     i_59_++) {
		    for (int i_60_ = 0;
			 i_60_ < aHashMapArrayArrayArray7411[i_56_][0].length;
			 i_60_++) {
			HashMap hashmap
			    = aHashMapArrayArrayArray7411[i_56_][i_59_][i_60_];
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class575 class575 = (Class575) iterator.next();
				int i_61_
				    = (i_59_ * 64
				       + ((Class575) class575).aByte7443
				       + ((i_60_ * 64
					   + ((Class575) class575).aByte7438)
					  * anInt7390));
				((Class575) class575).anInt7441
				    = ((aByteArray7378[i_61_] & 0xff) << 16
				       | aShortArray7369[i_61_] & 0xffff);
				if (((Class575) class575).anInt7441 != 0)
				    ((Class575) class575).anInt7441
					|= ~0xffffff;
			    }
			}
		    }
		}
	    }
	    method12617(aByteArray7393, aByteArray7378, aShortArray7369, i,
			i_32_);
	    aByteArray7393 = null;
	}
	if (!bool || Class50.method1249((byte) 1) < l + (long) anInt7420) {
	    method12566();
	    return true;
	}
	return false;
    }
    
    public static Class410 method12565(int i, int i_62_) {
	Class410 class410 = new Class410();
	for (Class241_Sub39_Sub12 class241_sub39_sub12
		 = ((Class241_Sub39_Sub12)
		    aClass407_7377.method7294(2090894173));
	     class241_sub39_sub12 != null;
	     class241_sub39_sub12 = ((Class241_Sub39_Sub12)
				     aClass407_7377.method7295(2099833173))) {
	    if (((Class241_Sub39_Sub12) class241_sub39_sub12).aBool10921
		&& class241_sub39_sub12.method17271(i, i_62_, -332743935))
		class410.method7431(class241_sub39_sub12, (byte) -40);
	}
	return class410;
    }
    
    static void method12566() {
	for (int i = 0; i < anInt7390; i++) {
	    for (int i_63_ = 0; i_63_ < anInt7391; i_63_++) {
		Object object = anObjectArray7398[i + i_63_ * anInt7390];
		if (object != null) {
		    if (object instanceof Class241_Sub19) {
			Class241_Sub19 class241_sub19
			    = (Class241_Sub19) object;
			if (class241_sub19 != null) {
			    for (int i_64_ = 0;
				 i_64_ < (((Class241_Sub19) class241_sub19)
					  .anIntArray8997).length;
				 i_64_++) {
				ObjectDefinition class526
				    = (aClass532_7421.getObjectDefinition
				       ((((Class241_Sub19) class241_sub19)
					 .anIntArray8997[i_64_]),
					577892407));
				int i_65_ = class526.mapSpriteID * 8166631;
				if (class526.toObjectIDs != null) {
				    class526
					= (class526.method11768
					   (anInterface13_7373,
					    anInterface11_7372, -1142149786));
				    if (class526 != null)
					i_65_ = class526.mapSpriteID * 8166631;
				}
				if (i_65_ != -1) {
				    Class241_Sub41 class241_sub41
					= new Class241_Sub41(i_65_);
				    class241_sub41.anInt10154 = i * 415135197;
				    class241_sub41.anInt10152
					= i_63_ * -271238053;
				    aClass429_7387.addNode(class241_sub41,
							      (short) -17318);
				}
			    }
			}
		    } else {
			Integer integer = (Integer) object;
			ObjectDefinition class526
			    = aClass532_7421.getObjectDefinition(integer.intValue(),
							 577892407);
			int i_66_ = class526.mapSpriteID * 8166631;
			if (class526.toObjectIDs != null) {
			    class526 = class526.method11768(anInterface13_7373,
							    anInterface11_7372,
							    -1421679999);
			    if (class526 != null)
				i_66_ = class526.mapSpriteID * 8166631;
			}
			if (i_66_ != -1) {
			    Class241_Sub41 class241_sub41
				= new Class241_Sub41(i_66_);
			    class241_sub41.anInt10154 = i * 415135197;
			    class241_sub41.anInt10152 = i_63_ * -271238053;
			    aClass429_7387.addNode(class241_sub41,
						      (short) -27281);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 3; i++) {
	    for (int i_67_ = 0; i_67_ < aHashMapArrayArrayArray7411[0].length;
		 i_67_++) {
		for (int i_68_ = 0;
		     i_68_ < aHashMapArrayArrayArray7411[0][0].length;
		     i_68_++) {
		    HashMap hashmap
			= aHashMapArrayArrayArray7411[i][i_67_][i_68_];
		    if (hashmap != null) {
			Iterator iterator = hashmap.values().iterator();
			while (iterator.hasNext()) {
			    Class575 class575 = (Class575) iterator.next();
			    if (((Class575) class575).anIntArray7442 != null) {
				for (int i_69_ = 0;
				     i_69_ < (((Class575) class575)
					      .anIntArray7442).length;
				     i_69_++) {
				    ObjectDefinition class526
					= (aClass532_7421.getObjectDefinition
					   ((((Class575) class575)
					     .anIntArray7442[i_69_]),
					    577892407));
				    int i_70_ = class526.mapSpriteID * 8166631;
				    if (class526.toObjectIDs != null) {
					class526 = (class526.method11768
						    (anInterface13_7373,
						     anInterface11_7372,
						     -903298702));
					if (class526 != null)
					    i_70_
						= class526.mapSpriteID * 8166631;
				    }
				    if (i_70_ != -1) {
					Class241_Sub41 class241_sub41
					    = new Class241_Sub41(i_70_);
					class241_sub41.anInt10154
					    = ((i_67_ + (anInt7388 >> 6)) * 64
					       + (((Class575) class575)
						  .aByte7443)
					       - anInt7388) * 415135197;
					class241_sub41.anInt10152
					    = ((i_68_ + (anInt7389 >> 6)) * 64
					       + (((Class575) class575)
						  .aByte7438)
					       - anInt7389) * -271238053;
					aClass429_7387.addNode
					    (class241_sub41, (short) -29820);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method12567(int[] is, int i, int i_71_, int i_72_, int i_73_,
			    int i_74_, int i_75_) {
	for (int i_76_ = 0; i_76_ < aClass497_7374.anInt6528 * -1657349523;
	     i_76_++) {
	    int i_77_ = i_76_;
	    if (i_75_ == anInt7404 || i_75_ == anInt7406)
		i_77_ = aClass497_7374.anInt6528 * -1657349523 - i_76_ - 1;
	    for (int i_78_ = 0; i_78_ < aClass497_7374.anInt6528 * -1657349523;
		 i_78_++) {
		int i_79_ = i_78_;
		if (i_75_ == anInt7406 || i_75_ == anInt7368)
		    i_79_ = aClass497_7374.anInt6528 * -1657349523 - i_78_ - 1;
		int i_80_ = anIntArrayArray7394[i_77_][i_79_];
		if (i_80_ != 0) {
		    if (i_80_ == 1) {
			int i_81_ = is[((i_72_ - i_71_ - i_78_ - 1) * i_72_ + i
					+ i_76_)];
			if (i_81_ != anInt7434) {
			    anInt7434 = i_81_;
			    anInt7400
				= (~0xffffff
				   | ((((aClass497_7374.anInt6541 * -1585524463
					 & 0xff00ff) * i_73_
					+ (i_81_ & 0xff00ff) * i_74_)
				       & ~0xff00ff)
				      + ((((aClass497_7374.anInt6541
					    * -1585524463)
					   & 0xff00) * i_73_
					  + (i_81_ & 0xff00) * i_74_)
					 & 0xff0000)) >> 8);
			}
			is[(i_72_ - i_71_ - i_78_ - 1) * i_72_ + i + i_76_]
			    = anInt7400;
		    } else if (i_80_ == 2)
			is[(i_72_ - i_71_ - i_78_ - 1) * i_72_ + i + i_76_]
			    = aClass497_7374.anInt6546 * 1174920463;
		}
	    }
	}
    }
    
    static int method12568(Class107 class107, int i, int i_82_, int i_83_) {
	Class467 class467 = aClass476_7424.method10906(i, -620752436);
	if (class467 == null)
	    return 0;
	int i_84_ = class467.anInt6321 * -701216129;
	if (i_84_ >= 0 && class107.method2680(i_84_, 331068963).aBool1434)
	    i_84_ = -1;
	int i_85_;
	if (class467.anInt6323 * -1240842283 >= 0) {
	    int i_86_ = class467.anInt6323 * -1240842283;
	    int i_87_ = (i_86_ & 0x7f) + i_83_;
	    if (i_87_ < 0)
		i_87_ = 0;
	    else if (i_87_ > 127)
		i_87_ = 127;
	    int i_88_ = (i_86_ + i_82_ & 0xfc00) + (i_86_ & 0x380) + i_87_;
	    i_85_ = ~0xffffff | (Class474.anIntArray6382
				 [(Class241_Sub42.method16451
				   (Class445_Sub30.method14388(i_88_, 96,
							       1796907003),
				    -1965213251)) & 0xffff]);
	} else if (i_84_ >= 0)
	    i_85_ = (~0xffffff
		     | (Class474.anIntArray6382
			[(Class241_Sub42.method16451
			  (Class445_Sub30.method14388((class107.method2680
						       (i_84_, -1665637919)
						       .aShort1436),
						      96, 93714778),
			   1536434766)) & 0xffff]));
	else if (class467.anInt6320 * -1439860245 == -1)
	    i_85_ = 0;
	else {
	    int i_89_ = class467.anInt6320 * -1439860245;
	    int i_90_ = (i_89_ & 0x7f) + i_83_;
	    if (i_90_ < 0)
		i_90_ = 0;
	    else if (i_90_ > 127)
		i_90_ = 127;
	    int i_91_ = (i_89_ + i_82_ & 0xfc00) + (i_89_ & 0x380) + i_90_;
	    i_85_ = ~0xffffff | (Class474.anIntArray6382
				 [(Class241_Sub42.method16451
				   (Class445_Sub30.method14388(i_91_, 96,
							       -1805272513),
				    417773360)) & 0xffff]);
	}
	return i_85_;
    }
    
    static void method12569(int i, int i_92_, int i_93_, int i_94_, int i_95_,
			    int i_96_, int i_97_, int i_98_) {
	anInt7426 = i - anInt7388;
	anInt7427 = i_92_ - anInt7389;
	anInt7428 = i_93_ - anInt7388;
	anInt7429 = i_94_ - anInt7389;
	anInt7430 = i_95_;
	anInt7431 = i_96_;
	anInt7395 = i_97_;
	anInt7425 = i_98_;
    }
    
    static void method12570(Class103 class103, boolean bool, boolean bool_99_,
			    boolean bool_100_, boolean bool_101_) {
	int i = anInt7428 - anInt7426;
	int i_102_ = anInt7427 - anInt7429;
	int i_103_ = (anInt7395 - anInt7430 << 16) / i;
	int i_104_ = (anInt7425 - anInt7431 << 16) / i_102_;
	method12571(class103, bool, bool_99_, i_103_, i_104_, 0, 0, bool_100_,
		    bool_101_);
    }
    
    static void method12571(Class103 class103, boolean bool, boolean bool_105_,
			    int i, int i_106_, int i_107_, int i_108_,
			    boolean bool_109_, boolean bool_110_) {
	int i_111_ = anInt7428 - anInt7426;
	int i_112_ = anInt7427 - anInt7429;
	if (anInt7428 < anInt7390)
	    i_111_++;
	if (anInt7427 < anInt7391)
	    i_112_++;
	int i_113_ = anInt7426 / 64;
	int i_114_ = anInt7429 / 64;
	int i_115_ = (anInt7426 + i_111_) / 64;
	int i_116_ = (anInt7429 + i_112_) / 64;
	int i_117_;
	int i_118_;
	if (bool_110_) {
	    i_117_ = (anInt7395 - anInt7430) / ((anInt7428 - anInt7426) / 64);
	    i_118_ = i_117_;
	} else {
	    i_117_ = method12621();
	    i_118_ = (int) Math.ceil((double) (64.0F * aFloat7408 / 2.0F));
	}
	anArrayList7416.clear();
	int i_119_ = 0;
	int i_120_ = i_117_ * i_117_;
	for (int i_121_ = i_113_; i_121_ <= i_115_; i_121_++) {
	    for (int i_122_ = i_114_; i_122_ <= i_116_; i_122_++) {
		int i_123_ = (i_121_ << 16) + i_122_;
		int i_124_ = method12588((long) i_123_);
		if (i_124_ != i_117_) {
		    if (i_121_ < 0 || i_121_ * 64 >= anInt7390 || i_122_ < 0
			|| i_122_ * 64 >= anInt7391)
			method12634(class103, i_121_, i_122_, i_117_, i_123_);
		    else if (i_124_ == -1) {
			method12573(i_121_, i_122_, i_117_, i_123_, bool,
				    bool_105_, bool_109_, class103);
			i_119_ += i_120_;
		    } else
			anArrayList7416.add(Integer.valueOf(i_123_));
		}
	    }
	}
	if (!anArrayList7416.isEmpty() && i_119_ < anInt7415) {
	    for (Iterator iterator = anArrayList7416.iterator();
		 i_119_ < anInt7415 && iterator.hasNext(); i_119_ += i_120_) {
		int i_125_ = ((Integer) iterator.next()).intValue();
		int i_126_ = i_125_ >> 16 & 0xffff;
		int i_127_ = i_125_ & 0xffff;
		method12573(i_126_, i_127_, i_117_, i_125_, bool, bool_105_,
			    bool_109_, class103);
	    }
	}
	for (int i_128_ = i_113_; i_128_ <= i_115_; i_128_++) {
	    int i_129_ = i_128_ * 64;
	    int i_130_ = i_129_ - anInt7426;
	    int i_131_ = i_118_;
	    int i_132_ = (i_107_ + i * i_130_ >> 16) + anInt7430;
	    int i_133_ = (i_107_ + i * (i_130_ + 64) >> 16) + anInt7430;
	    if (i_132_ + i_131_ != i_133_)
		i_131_ = i_133_ - i_132_;
	    for (int i_134_ = i_114_; i_134_ <= i_116_; i_134_++) {
		int i_135_ = i_134_ * 64;
		int i_136_ = i_135_ - anInt7429;
		int i_137_ = (i_128_ << 16) + i_134_;
		int i_138_ = i_118_;
		int i_139_ = anInt7425 - (i_108_ + i_106_ * i_136_ >> 16);
		int i_140_
		    = anInt7425 - (i_108_ + i_106_ * (i_136_ + 64) >> 16);
		if (i_139_ - i_138_ != i_140_)
		    i_138_ = i_139_ - i_140_;
		i_139_ -= i_138_;
		Class168 class168
		    = (Class168) aClass129_7414.get((long) i_137_);
		if (class168 == null)
		    throw new RuntimeException();
		if (class168.method3631() == i_131_
		    && class168.method3606() == i_138_)
		    class168.method3646(i_132_, i_139_);
		else
		    class168.method3614(i_132_, i_139_, i_131_, i_138_);
	    }
	}
    }
    
    static void method12572(int[] is, int i, int i_141_, int i_142_,
			    int i_143_, int i_144_) {
	int i_145_ = i + (i_143_ - i_141_ - 1) * i_143_;
	for (int i_146_ = 0; i_146_ < i_142_; i_146_++)
	    is[i_145_ + i_146_ * i_143_] = i_144_;
    }
    
    static void method12573(int i, int i_147_, int i_148_, int i_149_,
			    boolean bool, boolean bool_150_, boolean bool_151_,
			    Class103 class103) {
	int i_152_ = i * 64;
	int i_153_ = i_147_ * 64;
	if (anIntArray7418 == null || anIntArray7418.length != i_148_ * i_148_)
	    anIntArray7418 = new int[i_148_ * i_148_];
	boolean bool_154_ = aBool7432 && !bool_151_;
	for (int i_155_ = 0; i_155_ < 64; i_155_++) {
	    int i_156_ = i_152_ + i_155_;
	    int i_157_ = i_155_ * i_148_ / 64;
	    int i_158_ = (i_155_ + 1) * i_148_ / 64 - 1;
	    if (i_158_ < i_157_)
		i_158_ = i_157_;
	    for (int i_159_ = 0; i_159_ < 64; i_159_++) {
		int i_160_ = i_153_ + i_159_;
		boolean bool_161_ = bool;
		if (bool_154_ && !method12625(i_156_, i_160_))
		    bool_161_ = false;
		int i_162_ = i_156_ + i_160_ * anInt7390;
		boolean bool_163_ = false;
		boolean bool_164_ = false;
		Object object = null;
		int i_165_ = ((aByteArray7378[i_162_] & 0xff) << 16
			      | aShortArray7369[i_162_] & 0xffff);
		if (i_165_ != 0)
		    i_165_ |= ~0xffffff;
		int i_166_ = aByteArray7396[i_162_] & 0xff;
		object = anObjectArray7398[i_162_];
		int i_167_ = i_159_ * i_148_ / 64;
		int i_168_ = (i_159_ + 1) * i_148_ / 64 - 1;
		if (i_168_ < i_167_)
		    i_168_ = i_167_;
		if (object != null) {
		    if (object instanceof Class241_Sub19) {
			Class241_Sub19 class241_sub19
			    = (Class241_Sub19) object;
			if (class241_sub19 != null)
			    method12574(anIntArray7418, i_157_, i_158_, i_167_,
					i_168_, i_148_, bool_161_, i_165_,
					i_166_, aByteArray7397[i_162_],
					(((Class241_Sub19) class241_sub19)
					 .anIntArray8997),
					(((Class241_Sub19) class241_sub19)
					 .aByteArray8998),
					true);
		    } else {
			Integer integer = (Integer) object;
			anIntArray7382[0] = integer.intValue();
			aByteArray7383[0] = aByteArray7399[i_162_];
			method12574(anIntArray7418, i_157_, i_158_, i_167_,
				    i_168_, i_148_, bool_161_, i_165_, i_166_,
				    aByteArray7397[i_162_], anIntArray7382,
				    aByteArray7383, true);
		    }
		} else
		    method12574(anIntArray7418, i_157_, i_158_, i_167_, i_168_,
				i_148_, bool_161_, i_165_, i_166_,
				aByteArray7397[i_162_], null, null, true);
	    }
	}
	if (bool_150_) {
	    for (int i_169_ = 0; i_169_ < 64; i_169_++) {
		int i_170_ = i_152_ + i_169_;
		boolean bool_171_ = i_169_ == 0 && i_170_ != 0;
		for (int i_172_ = 0; i_172_ < 64; i_172_++) {
		    int i_173_ = i_153_ + i_172_;
		    if (!bool_154_ || method12625(i_170_, i_173_)) {
			boolean bool_174_ = i_172_ == 0 && i_173_ != 0;
			int i_175_ = i_170_ + i_173_ * anInt7390;
			if (bool_171_ && bool_174_)
			    method12575(class103, anIntArray7418, i_148_, -1,
					-1, i_170_ - 1, i_173_ - 1,
					i_175_ - 1 - anInt7390);
			if (bool_171_)
			    method12575(class103, anIntArray7418, i_148_, -1,
					i_172_, i_170_ - 1, i_173_,
					i_175_ - 1);
			if (bool_174_)
			    method12575(class103, anIntArray7418, i_148_,
					i_169_, -1, i_170_, i_173_ - 1,
					i_175_ - anInt7390);
			method12575(class103, anIntArray7418, i_148_, i_169_,
				    i_172_, i_170_, i_173_, i_175_);
		    }
		}
	    }
	}
	int i_176_ = i * 64 / 64;
	int i_177_ = i_147_ * 64 / 64;
	for (int i_178_ = 0; i_178_ < 3; i_178_++) {
	    for (int i_179_ = 0; i_179_ < 64; i_179_++) {
		int i_180_ = i_152_ + i_179_;
		int i_181_ = i_180_ & 0x3f;
		int i_182_ = i_179_ * i_148_ / 64;
		int i_183_ = (i_179_ + 1) * i_148_ / 64 - 1;
		if (i_183_ < i_182_)
		    i_183_ = i_182_;
		for (int i_184_ = 0; i_184_ < 64; i_184_++) {
		    int i_185_ = i_153_ + i_184_;
		    boolean bool_186_ = bool;
		    if (bool_154_ && !method12625(i_180_, i_185_))
			bool_186_ = false;
		    int i_187_ = i_185_ & 0x3f;
		    int i_188_ = i_184_ * i_148_ / 64;
		    int i_189_ = (i_184_ + 1) * i_148_ / 64 - 1;
		    if (i_189_ < i_188_)
			i_189_ = i_188_;
		    HashMap hashmap
			= aHashMapArrayArrayArray7411[i_178_][i_176_][i_177_];
		    if (hashmap != null) {
			Class575 class575
			    = ((Class575)
			       hashmap.get(Integer.valueOf((i_181_ << 8)
							   + i_187_)));
			if (class575 != null)
			    method12574(anIntArray7418, i_182_, i_183_, i_188_,
					i_189_, i_148_, bool_186_,
					((Class575) class575).anInt7441,
					((Class575) class575).aByte7440 & 0xff,
					((Class575) class575).aByte7439,
					((Class575) class575).anIntArray7442,
					((Class575) class575).aByteArray7437,
					false);
		    }
		}
	    }
	    for (int i_190_ = 0; i_190_ < 64; i_190_++) {
		int i_191_ = i_152_ + i_190_;
		int i_192_ = i_191_ & 0x3f;
		for (int i_193_ = 0; i_193_ < 64; i_193_++) {
		    int i_194_ = i_153_ + i_193_;
		    if (!bool_154_ || method12625(i_191_, i_194_)) {
			int i_195_ = i_194_ & 0x3f;
			HashMap hashmap = (aHashMapArrayArrayArray7411[i_178_]
					   [i_176_][i_177_]);
			if (hashmap != null) {
			    Class575 class575
				= ((Class575)
				   hashmap.get(Integer.valueOf((i_192_ << 8)
							       + i_195_)));
			    if (class575 != null)
				method12576(class103, anIntArray7418, i_148_,
					    i_190_, i_193_,
					    (((Class575) class575)
					     .anIntArray7442),
					    (((Class575) class575)
					     .aByteArray7437));
			}
		    }
		}
	    }
	}
	if (bool_154_) {
	    int i_196_ = 8;
	    for (int i_197_ = 0; i_197_ < i_196_; i_197_++) {
		int i_198_ = i_152_ + i_197_ * 8;
		int i_199_ = i_197_ * i_148_ / i_196_;
		int i_200_ = (i_197_ + 1) * i_148_ / i_196_ - 1;
		for (int i_201_ = 0; i_201_ < i_196_; i_201_++) {
		    int i_202_ = i_153_ + i_201_ * 8;
		    if (!method12625(i_198_, i_202_)) {
			int i_203_ = i_201_ * i_148_ / i_196_;
			int i_204_ = (i_201_ + 1) * i_148_ / i_196_ - 1;
			if (i_148_ < 64)
			    method12562(anIntArray7418, i_199_, i_200_, i_203_,
					i_204_, i_148_);
			else {
			    aBoolArray7422[anInt7403]
				= method12625(i_198_, i_202_ + 8);
			    aBoolArray7422[anInt7404]
				= method12625(i_198_ + 8, i_202_ + 8);
			    aBoolArray7422[anInt7379]
				= method12625(i_198_ + 8, i_202_);
			    aBoolArray7422[anInt7406]
				= method12625(i_198_ + 8, i_202_ - 8);
			    aBoolArray7422[anInt7407]
				= method12625(i_198_, i_202_ - 8);
			    aBoolArray7422[anInt7368]
				= method12625(i_198_ - 8, i_202_ - 8);
			    aBoolArray7422[anInt7409]
				= method12625(i_198_ - 8, i_202_);
			    aBoolArray7422[anInt7410]
				= method12625(i_198_ - 8, i_202_ + 8);
			    method12585(anIntArray7418, i_199_, i_200_, i_203_,
					i_204_, i_148_);
			}
		    }
		}
	    }
	}
	aClass129_7414.put(class103.method2287(anIntArray7418, 0,
						      i_148_, i_148_, i_148_,
						      true),
				  (long) i_149_);
    }
    
    static void method12574(int[] is, int i, int i_205_, int i_206_,
			    int i_207_, int i_208_, boolean bool, int i_209_,
			    int i_210_, int i_211_, int[] is_212_,
			    byte[] is_213_, boolean bool_214_) {
	if (bool_214_ || i_209_ != 0 || i_210_ > 0) {
	    if (i_210_ == 0)
		method12614(is, i, i_205_, i_206_, i_207_, i_208_,
			    i_209_ | ~0xffffff);
	    else {
		int i_215_ = i_211_ & 0x3f;
		if (i_215_ == 0 || anInt7381 == 0) {
		    int i_216_ = anIntArray7392[i_210_];
		    if (bool_214_ || i_216_ != 0)
			method12614(is, i, i_205_, i_206_, i_207_, i_208_,
				    i_216_ | ~0xffffff);
		} else {
		    int i_217_ = bool_214_ ? 0 : 1;
		    int i_218_ = Class274.method5338(i_211_ >> 6 & 0x3, i_215_,
						     -998979014);
		    i_215_ = Class388.method6959(i_215_, 2114095601);
		    method12589(is, i, i_205_, i_206_, i_207_, i_208_, i_209_,
				anIntArray7392[i_210_],
				aByteArrayArrayArray7380[i_215_ - 1][i_218_],
				anInt7381, i_217_);
		}
	    }
	}
	if (bool && is_212_ != null) {
	    int i_219_ = i_205_ - i + 1;
	    int i_220_ = i_207_ - i_206_ + 1;
	    for (int i_221_ = 0; i_221_ < is_212_.length; i_221_++) {
		int i_222_ = is_213_[i_221_] & 0x3f;
		if (i_222_ == Class527.aClass527_6932.anInt6931 * -2030829961
		    || (i_222_
			== Class527.aClass527_6910.anInt6931 * -2030829961)
		    || (i_222_
			== Class527.aClass527_6916.anInt6931 * -2030829961)
		    || (i_222_
			== Class527.aClass527_6912.anInt6931 * -2030829961)) {
		    ObjectDefinition class526
			= aClass532_7421.getObjectDefinition(is_212_[i_221_],
						     577892407);
		    if (class526.anInt6864 * -1848119147 == -1) {
			int i_223_ = -3355444;
			if (class526.anInt6848 * -1389471035 == 1)
			    i_223_ = -3407872;
			int i_224_ = is_213_[i_221_] >> 6 & 0x3;
			if (i_222_ == (Class527.aClass527_6932.anInt6931
				       * -2030829961)) {
			    if (i_224_ == 0)
				method12591(is, i, i_207_, i_220_, i_208_,
					    i_223_);
			    else if (i_224_ == 1)
				method12590(is, i, i_207_, i_219_, i_208_,
					    i_223_);
			    else if (i_224_ == 2)
				method12591(is, i_205_, i_207_, i_220_, i_208_,
					    i_223_);
			    else
				method12590(is, i, i_206_, i_219_, i_208_,
					    i_223_);
			} else if (i_222_ == (Class527.aClass527_6910.anInt6931
					      * -2030829961)) {
			    if (i_224_ == 0) {
				method12591(is, i, i_207_, i_220_, i_208_, -1);
				method12590(is, i, i_207_, i_219_, i_208_,
					    i_223_);
			    } else if (i_224_ == 1) {
				method12591(is, i_205_, i_207_, i_220_, i_208_,
					    -1);
				method12590(is, i, i_207_, i_219_, i_208_,
					    i_223_);
			    } else if (i_224_ == 2) {
				method12591(is, i_205_, i_207_, i_220_, i_208_,
					    -1);
				method12590(is, i, i_206_, i_219_, i_208_,
					    i_223_);
			    } else {
				method12591(is, i, i_207_, i_220_, i_208_, -1);
				method12590(is, i, i_206_, i_219_, i_208_,
					    i_223_);
			    }
			} else if (i_222_ == (Class527.aClass527_6916.anInt6931
					      * -2030829961)) {
			    if (i_224_ == 0)
				method12590(is, i, i_207_, 1, i_208_, i_223_);
			    else if (i_224_ == 1)
				method12590(is, i_205_, i_207_, 1, i_208_,
					    i_223_);
			    else if (i_224_ == 2)
				method12590(is, i_205_, i_206_, 1, i_208_,
					    i_223_);
			    else
				method12590(is, i, i_206_, 1, i_208_, i_223_);
			} else if (i_222_ == (Class527.aClass527_6912.anInt6931
					      * -2030829961)) {
			    if (i_224_ == 0 || i_224_ == 2) {
				for (int i_225_ = 0; i_225_ < i_220_; i_225_++)
				    method12590(is, i + i_225_,
						i_206_ + i_225_, 1, i_208_,
						i_223_);
			    } else {
				for (int i_226_ = 0; i_226_ < i_220_; i_226_++)
				    method12590(is, i + i_226_,
						i_207_ - i_226_, 1, i_208_,
						i_223_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method12575(Class103 class103, int[] is, int i, int i_227_,
			    int i_228_, int i_229_, int i_230_, int i_231_) {
	Object object = anObjectArray7398[i_231_];
	if (object != null) {
	    if (object instanceof Class241_Sub19) {
		Class241_Sub19 class241_sub19 = (Class241_Sub19) object;
		if (class241_sub19 != null)
		    method12576(class103, is, i, i_227_, i_228_,
				(((Class241_Sub19) class241_sub19)
				 .anIntArray8997),
				(((Class241_Sub19) class241_sub19)
				 .aByteArray8998));
	    } else {
		Integer integer = (Integer) object;
		anIntArray7382[0] = integer.intValue();
		aByteArray7383[0]
		    = aByteArray7399[i_229_ + i_230_ * anInt7390];
		method12576(class103, is, i, i_227_, i_228_, anIntArray7382,
			    aByteArray7383);
	    }
	}
    }
    
    static void method12576(Class103 class103, int[] is, int i, int i_232_,
			    int i_233_, int[] is_234_, byte[] is_235_) {
	if (is_234_ != null) {
	    for (int i_236_ = 0; i_236_ < is_234_.length; i_236_++) {
		ObjectDefinition class526
		    = aClass532_7421.getObjectDefinition(is_234_[i_236_], 577892407);
		int i_237_ = class526.anInt6864 * -1848119147;
		if (i_237_ != -1) {
		    Class601 class601
			= aClass598_7436.method13117(i_237_, -901135658);
		    Class168 class168
			= class601.method13157(class103,
					       (class526.aBool6865
						? is_235_[i_236_] >> 6 & 0x3
						: 0),
					       (class526.aBool6867
						? class526.aBool6868 : false),
					       (byte) -59);
		    int[] is_238_
			= class601.method13155(class103,
					       (class526.aBool6865
						? is_235_[i_236_] >> 6 & 0x3
						: 0),
					       (class526.aBool6867
						? class526.aBool6868 : false),
					       (byte) 0);
		    if (class168 != null) {
			int i_239_ = class168.method64();
			int i_240_ = class168.method3616();
			int i_241_ = i * i_239_ / 64 >> 2;
			int i_242_ = i * i_240_ / 64 >> 2;
			if (class601.aBool7726) {
			    int i_243_ = class526.sizeX * 1351092869;
			    int i_244_ = class526.sizeY * 333584223;
			    if ((is_235_[i_236_] >> 6 & 0x1) == 1) {
				int i_245_ = i_243_;
				i_243_ = i_244_;
				i_244_ = i_245_;
			    }
			    i_241_ = i_243_ * i / 64;
			    i_242_ = i_244_ * i / 64;
			}
			if (i_241_ != 0 && i_242_ != 0) {
			    int i_246_ = i_232_ * i / 64;
			    int i_247_ = (64 - i_233_) * i / 64 - i_242_ + 1;
			    for (int i_248_ = 0; i_248_ < i_241_; i_248_++) {
				int i_249_ = i_248_ + i_246_;
				if (i_249_ >= 0) {
				    if (i_249_ >= i)
					break;
				    for (int i_250_ = 0; i_250_ < i_242_;
					 i_250_++) {
					int i_251_ = i_250_ + i_247_;
					if (i_251_ >= 0) {
					    if (i_251_ >= i)
						break;
					    int i_252_
						= (is_238_
						   [(i_248_ * i_239_ / i_241_
						     + i_239_ * (i_250_
								 * i_240_
								 / i_242_))]);
					    int i_253_ = i_252_ >> 24 & 0xff;
					    if (i_253_ != 0)
						is[i_249_ + i * i_251_]
						    = i_252_;
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
    
    static NodeCollection method12577(Class103 class103) {
	int i = anInt7428 - anInt7426;
	int i_254_ = anInt7427 - anInt7429;
	int i_255_ = (anInt7395 - anInt7430 << 16) / i;
	int i_256_ = (anInt7425 - anInt7431 << 16) / i_254_;
	return method12643(class103, i_255_, i_256_, 0, 0);
    }
    
    static void method12578(int i, int i_257_, int i_258_, int i_259_,
			    int i_260_, int i_261_, int i_262_, int i_263_) {
	anInt7426 = i - anInt7388;
	anInt7427 = i_257_ - anInt7389;
	anInt7428 = i_258_ - anInt7388;
	anInt7429 = i_259_ - anInt7389;
	anInt7430 = i_260_;
	anInt7431 = i_261_;
	anInt7395 = i_262_;
	anInt7425 = i_263_;
    }
    
    static void method12579(Class103 class103, Class241_Sub41 class241_sub41,
			    int i, int i_264_, int i_265_, int i_266_) {
	class241_sub41.anInt10156
	    = (anInt7430 + (i_265_ + i * (class241_sub41.anInt10154 * 669485685
					  - anInt7426)
			    >> 16)) * 1050789009;
	class241_sub41.anInt10157
	    = (anInt7425
	       - (i_266_ + i_264_ * (class241_sub41.anInt10152 * -1535798317
				     - anInt7429)
		  >> 16)) * 1268569743;
    }
    
    static void method12580(Class103 class103, Class241_Sub41 class241_sub41,
			    Class515 class515) {
	if (class515.anIntArray6737 != null) {
	    int[] is = new int[class515.anIntArray6737.length];
	    for (int i = 0; i < is.length / 2; i++) {
		int i_267_ = (class515.anIntArray6737[i * 2]
			      + class241_sub41.anInt10154 * 669485685);
		int i_268_ = (class515.anIntArray6737[i * 2 + 1]
			      + class241_sub41.anInt10152 * -1535798317);
		is[i * 2] = anInt7430 + ((anInt7395 - anInt7430)
					 * (i_267_ - anInt7426)
					 / (anInt7428 - anInt7426));
		is[i * 2 + 1] = anInt7425 - ((anInt7425 - anInt7431)
					     * (i_268_ - anInt7429)
					     / (anInt7427 - anInt7429));
	    }
	    Class99.method2176(class103, is, class515.anInt6761 * 1002290129);
	    if (class515.anInt6762 * 1183606681 > 0) {
		for (int i = 0; i < is.length / 2 - 1; i++) {
		    int i_269_ = is[i * 2];
		    int i_270_ = is[i * 2 + 1];
		    int i_271_ = is[(i + 1) * 2];
		    int i_272_ = is[(i + 1) * 2 + 1];
		    if (i_271_ < i_269_) {
			int i_273_ = i_269_;
			int i_274_ = i_270_;
			i_269_ = i_271_;
			i_270_ = i_272_;
			i_271_ = i_273_;
			i_272_ = i_274_;
		    } else if (i_271_ == i_269_ && i_272_ < i_270_) {
			int i_275_ = i_270_;
			i_270_ = i_272_;
			i_272_ = i_275_;
		    }
		    class103.method2276(i_269_, i_270_, i_271_, i_272_,
					(class515.anIntArray6758
					 [class515.aByteArray6768[i] & 0xff]),
					1, class515.anInt6762 * 1183606681,
					class515.anInt6763 * 2024392745,
					class515.anInt6764 * -1103664939);
		}
		int i = is[is.length - 2];
		int i_276_ = is[is.length - 1];
		int i_277_ = is[0];
		int i_278_ = is[1];
		if (i_277_ < i) {
		    int i_279_ = i;
		    int i_280_ = i_276_;
		    i = i_277_;
		    i_276_ = i_278_;
		    i_277_ = i_279_;
		    i_278_ = i_280_;
		} else if (i_277_ == i && i_278_ < i_276_) {
		    int i_281_ = i_276_;
		    i_276_ = i_278_;
		    i_278_ = i_281_;
		}
		class103.method2276(i, i_276_, i_277_, i_278_,
				    (class515.anIntArray6758
				     [((class515.aByteArray6768
					[class515.aByteArray6768.length - 1])
				       & 0xff)]),
				    1, class515.anInt6762 * 1183606681,
				    class515.anInt6763 * 2024392745,
				    class515.anInt6764 * -1103664939);
	    } else {
		for (int i = 0; i < is.length / 2 - 1; i++)
		    class103.method2517(is[i * 2], is[i * 2 + 1],
					is[(i + 1) * 2], is[(i + 1) * 2 + 1],
					(class515.anIntArray6758
					 [class515.aByteArray6768[i] & 0xff]),
					223909001);
		class103.method2517(is[is.length - 2], is[is.length - 1],
				    is[0], is[1],
				    (class515.anIntArray6758
				     [((class515.aByteArray6768
					[class515.aByteArray6768.length - 1])
				       & 0xff)]),
				    223909001);
	    }
	}
    }
    
    static void method12581() {
	aByteArray7393 = new byte[anInt7390 * anInt7391];
	aByteArray7396 = new byte[anInt7390 * anInt7391];
	aByteArray7397 = new byte[anInt7390 * anInt7391];
	anObjectArray7398 = new Object[anInt7390 * anInt7391];
	aByteArray7399 = new byte[anInt7390 * anInt7391];
	aHashMapArrayArrayArray7411
	    = new HashMap[3][anInt7390 >> 6][anInt7391 >> 6];
	anIntArray7392 = new int[aClass476_7424.anInt6398 * 661753477 + 1];
	aBoolArrayArray7435 = new boolean[anInt7390 / 8][anInt7391 / 8];
    }
    
    static void method12582() {
	aByteArray7393 = null;
	aByteArray7378 = null;
	aShortArray7369 = null;
	aByteArray7396 = null;
	aByteArray7397 = null;
	anObjectArray7398 = null;
	aByteArray7399 = null;
	aHashMapArrayArrayArray7411 = null;
	anIntArray7392 = null;
	aBoolArrayArray7435 = null;
    }
    
    static NodeCollection method12583(Class103 class103) {
	int i = anInt7428 - anInt7426;
	int i_282_ = anInt7427 - anInt7429;
	int i_283_ = (anInt7395 - anInt7430 << 16) / i;
	int i_284_ = (anInt7425 - anInt7431 << 16) / i_282_;
	return method12643(class103, i_283_, i_284_, 0, 0);
    }
    
    static void method12584(Class107 class107, int i, int i_285_) {
	for (int i_286_ = 0; i_286_ < aClass476_7424.anInt6398 * 661753477;
	     i_286_++)
	    anIntArray7392[i_286_ + 1]
		= method12563(class107, i_286_, i, i_285_);
    }
    
    static void method12585(int[] is, int i, int i_287_, int i_288_,
			    int i_289_, int i_290_) {
	int i_291_ = aClass497_7374.anInt6541 * -1585524463 >> 24 & 0xff;
	int i_292_ = 255 - i_291_;
	if ((!aBoolArray7422[anInt7403]
	     || !aBoolArray7422[anInt7379] && !aBoolArray7422[anInt7409])
	    && (!aBoolArray7422[anInt7407]
		|| !aBoolArray7422[anInt7379] && !aBoolArray7422[anInt7409])) {
	    method12649(is, i, i_287_, i_288_, i_289_, i_290_, i_291_, i_292_,
			true, true, true, true);
	    if (aBoolArray7422[anInt7404]) {
		is[(i_290_ - i_289_ - 1) * i_290_ + i_287_]
		    = aClass497_7374.anInt6546 * 1174920463;
		is[(i_290_ - i_289_) * i_290_ + i_287_]
		    = aClass497_7374.anInt6546 * 1174920463;
		is[(i_290_ - i_289_ - 1) * i_290_ + i_287_ - 1]
		    = aClass497_7374.anInt6546 * 1174920463;
	    }
	    if (aBoolArray7422[anInt7406]) {
		is[(i_290_ - i_288_ - 1) * i_290_ + i_287_]
		    = aClass497_7374.anInt6546 * 1174920463;
		is[(i_290_ - i_288_ - 2) * i_290_ + i_287_]
		    = aClass497_7374.anInt6546 * 1174920463;
		is[(i_290_ - i_288_ - 1) * i_290_ + i_287_ - 1]
		    = aClass497_7374.anInt6546 * 1174920463;
	    }
	    if (aBoolArray7422[anInt7368]) {
		is[(i_290_ - i_288_ - 1) * i_290_ + i]
		    = aClass497_7374.anInt6546 * 1174920463;
		is[(i_290_ - i_288_ - 2) * i_290_ + i]
		    = aClass497_7374.anInt6546 * 1174920463;
		is[(i_290_ - i_288_ - 1) * i_290_ + i + 1]
		    = aClass497_7374.anInt6546 * 1174920463;
	    }
	    if (aBoolArray7422[anInt7410]) {
		is[(i_290_ - i_289_ - 1) * i_290_ + i]
		    = aClass497_7374.anInt6546 * 1174920463;
		is[(i_290_ - i_289_) * i_290_ + i]
		    = aClass497_7374.anInt6546 * 1174920463;
		is[(i_290_ - i_289_ - 1) * i_290_ + i + 1]
		    = aClass497_7374.anInt6546 * 1174920463;
	    }
	} else {
	    if (aBoolArray7422[anInt7403] && aBoolArray7422[anInt7379])
		method12622(is,
			    (i_287_ - aClass497_7374.anInt6528 * -1657349523
			     + 1),
			    (i_289_ - aClass497_7374.anInt6528 * -1657349523
			     + 1),
			    i_290_, i_291_, i_292_, anInt7404);
	    else {
		method12649
		    (is, i_287_ - aClass497_7374.anInt6528 * -1657349523 + 1,
		     i_287_,
		     i_289_ - aClass497_7374.anInt6528 * -1657349523 + 1,
		     i_289_, i_290_, i_291_, i_292_, true, true, false, false);
		if (aBoolArray7422[anInt7404]) {
		    is[(i_290_ - i_289_ - 1) * i_290_ + i_287_]
			= aClass497_7374.anInt6546 * 1174920463;
		    is[(i_290_ - i_289_) * i_290_ + i_287_]
			= aClass497_7374.anInt6546 * 1174920463;
		    is[(i_290_ - i_289_ - 1) * i_290_ + i_287_ - 1]
			= aClass497_7374.anInt6546 * 1174920463;
		}
	    }
	    if (aBoolArray7422[anInt7407] && aBoolArray7422[anInt7379])
		method12622(is,
			    (i_287_ - aClass497_7374.anInt6528 * -1657349523
			     + 1),
			    i_288_, i_290_, i_291_, i_292_, anInt7406);
	    else {
		method12649(is,
			    (i_287_ - aClass497_7374.anInt6528 * -1657349523
			     + 1),
			    i_287_, i_288_,
			    (i_288_ + aClass497_7374.anInt6528 * -1657349523
			     - 1),
			    i_290_, i_291_, i_292_, false, true, true, false);
		if (aBoolArray7422[anInt7406]) {
		    is[(i_290_ - i_288_ - 1) * i_290_ + i_287_]
			= aClass497_7374.anInt6546 * 1174920463;
		    is[(i_290_ - i_288_ - 2) * i_290_ + i_287_]
			= aClass497_7374.anInt6546 * 1174920463;
		    is[(i_290_ - i_288_ - 1) * i_290_ + i_287_ - 1]
			= aClass497_7374.anInt6546 * 1174920463;
		}
	    }
	    if (aBoolArray7422[anInt7407] && aBoolArray7422[anInt7409])
		method12622(is, i, i_288_, i_290_, i_291_, i_292_, anInt7368);
	    else {
		method12649(is, i,
			    i + aClass497_7374.anInt6528 * -1657349523 - 1,
			    i_288_,
			    (i_288_ + aClass497_7374.anInt6528 * -1657349523
			     - 1),
			    i_290_, i_291_, i_292_, false, false, true, true);
		if (aBoolArray7422[anInt7368]) {
		    is[(i_290_ - i_288_ - 1) * i_290_ + i]
			= aClass497_7374.anInt6546 * 1174920463;
		    is[(i_290_ - i_288_ - 2) * i_290_ + i]
			= aClass497_7374.anInt6546 * 1174920463;
		    is[(i_290_ - i_288_ - 1) * i_290_ + i + 1]
			= aClass497_7374.anInt6546 * 1174920463;
		}
	    }
	    if (aBoolArray7422[anInt7403] && aBoolArray7422[anInt7409])
		method12622(is, i,
			    (i_289_ - aClass497_7374.anInt6528 * -1657349523
			     + 1),
			    i_290_, i_291_, i_292_, anInt7410);
	    else {
		method12649(is, i,
			    i + aClass497_7374.anInt6528 * -1657349523 - 1,
			    (i_289_ - aClass497_7374.anInt6528 * -1657349523
			     + 1),
			    i_289_, i_290_, i_291_, i_292_, true, false, false,
			    true);
		if (aBoolArray7422[anInt7410]) {
		    is[(i_290_ - i_289_ - 1) * i_290_ + i]
			= aClass497_7374.anInt6546 * 1174920463;
		    is[(i_290_ - i_289_) * i_290_ + i]
			= aClass497_7374.anInt6546 * 1174920463;
		    is[(i_290_ - i_289_ - 1) * i_290_ + i + 1]
			= aClass497_7374.anInt6546 * 1174920463;
		}
	    }
	    if (i + aClass497_7374.anInt6528 * -1657349523
		< i_287_ - aClass497_7374.anInt6528 * -1657349523)
		method12649(is, i + aClass497_7374.anInt6528 * -1657349523,
			    i_287_ - aClass497_7374.anInt6528 * -1657349523,
			    i_288_, i_289_, i_290_, i_291_, i_292_, true,
			    false, true, false);
	    if (i_288_ + aClass497_7374.anInt6528 * -1657349523 + 1
		< i_289_ - aClass497_7374.anInt6528 * -1657349523 - 1) {
		method12649(is, i,
			    i + aClass497_7374.anInt6528 * -1657349523 - 1,
			    i_288_ + aClass497_7374.anInt6528 * -1657349523,
			    i_289_ - aClass497_7374.anInt6528 * -1657349523,
			    i_290_, i_291_, i_292_, false, false, false, true);
		method12649(is,
			    (i_287_ - aClass497_7374.anInt6528 * -1657349523
			     + 1),
			    i_287_,
			    i_288_ + aClass497_7374.anInt6528 * -1657349523,
			    i_289_ - aClass497_7374.anInt6528 * -1657349523,
			    i_290_, i_291_, i_292_, false, true, false, false);
	    }
	}
    }
    
    static void method12586(Class103 class103, RSByteBuffer class241_sub3,
			    int i, int i_293_, int i_294_, int i_295_,
			    int[] is, int[] is_296_) {
	int i_297_ = class241_sub3.readUnsignedByte((byte) -39);
	if ((i_297_ & 0x1) == 0) {
	    boolean bool = (i_297_ & 0x2) == 0;
	    int i_298_ = i_297_ >> 2 & 0x3f;
	    if (i_298_ != 62) {
		if (i_298_ == 63)
		    i_298_ = class241_sub3.readUnsignedByte((byte) 32);
		else if (bool)
		    i_298_ = is[i_298_];
		else
		    i_298_ = is_296_[i_298_];
		if (bool) {
		    aByteArray7393[i_294_ + i_295_ * anInt7390]
			= (byte) i_298_;
		    aByteArray7396[i_294_ + i_295_ * anInt7390] = (byte) 0;
		} else {
		    aByteArray7396[i_294_ + i_295_ * anInt7390]
			= (byte) i_298_;
		    aByteArray7397[i_294_ + i_295_ * anInt7390] = (byte) 0;
		    aByteArray7393[i_294_ + i_295_ * anInt7390]
			= class241_sub3.getByte(-1313501449);
		}
	    }
	} else {
	    int i_299_ = (i_297_ >> 1 & 0x3) + 1;
	    boolean bool = (i_297_ & 0x8) != 0;
	    boolean bool_300_ = (i_297_ & 0x10) != 0;
	    for (int i_301_ = 0; i_301_ < i_299_; i_301_++) {
		int i_302_ = class241_sub3.readUnsignedByte((byte) 13);
		int i_303_ = 0;
		int i_304_ = 0;
		if (bool) {
		    i_303_ = class241_sub3.readUnsignedByte((byte) 53);
		    i_304_ = class241_sub3.readUnsignedByte((byte) 5);
		}
		int i_305_ = 0;
		if (bool_300_)
		    i_305_ = class241_sub3.readUnsignedByte((byte) -21);
		if (i_301_ == 0) {
		    aByteArray7393[i_294_ + i_295_ * anInt7390]
			= (byte) i_302_;
		    aByteArray7396[i_294_ + i_295_ * anInt7390]
			= (byte) i_303_;
		    aByteArray7397[i_294_ + i_295_ * anInt7390]
			= (byte) i_304_;
		    if (i_305_ == 1) {
			anObjectArray7398[i_294_ + i_295_ * anInt7390]
			    = new Integer(class241_sub3
					      .readBigSmart((byte) -14));
			aByteArray7399[i_294_ + i_295_ * anInt7390]
			    = class241_sub3.getByte(-1917601957);
		    } else if (i_305_ > 1) {
			int[] is_306_ = new int[i_305_];
			byte[] is_307_ = new byte[i_305_];
			for (int i_308_ = 0; i_308_ < i_305_; i_308_++) {
			    is_306_[i_308_]
				= class241_sub3.readBigSmart((byte) 38);
			    is_307_[i_308_]
				= class241_sub3.getByte(-2050622272);
			}
			anObjectArray7398[i_294_ + i_295_ * anInt7390]
			    = new Class241_Sub19(is_306_, is_307_);
		    }
		} else {
		    int[] is_309_ = null;
		    byte[] is_310_ = null;
		    if (i_305_ > 0) {
			is_309_ = new int[i_305_];
			is_310_ = new byte[i_305_];
			for (int i_311_ = 0; i_311_ < i_305_; i_311_++) {
			    is_309_[i_311_]
				= class241_sub3.readBigSmart((byte) -78);
			    is_310_[i_311_]
				= class241_sub3.getByte(-1428974076);
			}
		    }
		    if ((aHashMapArrayArrayArray7411[i_301_ - 1]
			 [i - (anInt7388 >> 6)][i_293_ - (anInt7389 >> 6)])
			== null)
			aHashMapArrayArrayArray7411[i_301_ - 1]
			    [i - (anInt7388 >> 6)][i_293_ - (anInt7389 >> 6)]
			    = new HashMap();
		    int i_312_ = ((i_294_ & 0x3f) << 8) + (i_295_ & 0x3f);
		    Class575 class575
			= new Class575(i_294_ & 0x3f, i_295_ & 0x3f, i_302_,
				       i_303_, i_304_, is_309_, is_310_);
		    aHashMapArrayArrayArray7411[i_301_ - 1]
			[i - (anInt7388 >> 6)][i_293_ - (anInt7389 >> 6)]
			.put(Integer.valueOf(i_312_), class575);
		}
	    }
	}
    }
    
    public static Class410 method12587(int i, int i_313_) {
	Class410 class410 = new Class410();
	for (Class241_Sub39_Sub12 class241_sub39_sub12
		 = ((Class241_Sub39_Sub12)
		    aClass407_7377.method7294(2090894173));
	     class241_sub39_sub12 != null;
	     class241_sub39_sub12 = ((Class241_Sub39_Sub12)
				     aClass407_7377.method7295(917510684))) {
	    if (((Class241_Sub39_Sub12) class241_sub39_sub12).aBool10921
		&& class241_sub39_sub12.method17271(i, i_313_, -1602681268))
		class410.method7431(class241_sub39_sub12, (byte) -86);
	}
	return class410;
    }
    
    static int method12588(long l) {
	Class168 class168 = (Class168) aClass129_7414.get(l);
	if (class168 != null)
	    return class168.method3631();
	return -1;
    }
    
    static void method12589(int[] is, int i, int i_314_, int i_315_,
			    int i_316_, int i_317_, int i_318_, int i_319_,
			    byte[] is_320_, int i_321_, int i_322_) {
	int i_323_ = 0;
	int i_324_ = 0;
	int i_325_ = i_314_ - i + 1;
	int i_326_ = i_316_ - i_315_ + 1;
	int i_327_ = (i_321_ << 16) / i_325_;
	int i_328_ = (is_320_.length / i_321_ << 16) / i_326_;
	int i_329_ = i + (i_317_ - i_316_ - 1) * i_317_;
	int i_330_ = i_318_ >> 24;
	int i_331_ = i_319_ >> 24;
	if (i_322_ == 0 || i_322_ == 1 && i_330_ == 255 && i_331_ == 255) {
	    int i_332_ = i_323_;
	    for (int i_333_ = -i_326_; i_333_ < 0; i_333_++) {
		int i_334_ = (i_324_ >> 16) * i_321_;
		for (int i_335_ = -i_325_; i_335_ < 0; i_335_++) {
		    if (is_320_[(i_323_ >> 16) + i_334_] != 0)
			is[i_329_++] = i_319_;
		    else
			is[i_329_++] = i_318_;
		    i_323_ += i_327_;
		}
		i_324_ += i_328_;
		i_323_ = i_332_;
		i_329_ += i_317_ - i_325_;
	    }
	} else if (i_322_ == 1) {
	    int i_336_ = i_323_;
	    for (int i_337_ = -i_326_; i_337_ < 0; i_337_++) {
		int i_338_ = (i_324_ >> 16) * i_321_;
		for (int i_339_ = -i_325_; i_339_ < 0; i_339_++) {
		    int i_340_ = i_318_;
		    if (is_320_[(i_323_ >> 16) + i_338_] != 0)
			i_340_ = i_319_;
		    int i_341_ = i_340_ >>> 24;
		    int i_342_ = 255 - i_341_;
		    int i_343_ = is[i_329_];
		    is[i_329_++]
			= ~0xffffff | ((((i_340_ & 0xff00ff) * i_341_
					 + (i_343_ & 0xff00ff) * i_342_)
					& ~0xff00ff)
				       + (((i_340_ & 0xff00) * i_341_
					   + (i_343_ & 0xff00) * i_342_)
					  & 0xff0000)) >> 8;
		    i_323_ += i_327_;
		}
		i_324_ += i_328_;
		i_323_ = i_336_;
		i_329_ += i_317_ - i_325_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    static void method12590(int[] is, int i, int i_344_, int i_345_,
			    int i_346_, int i_347_) {
	int i_348_ = i + (i_346_ - i_344_ - 1) * i_346_;
	for (int i_349_ = 0; i_349_ < i_345_; i_349_++)
	    is[i_348_ + i_349_] = i_347_;
    }
    
    static void method12591(int[] is, int i, int i_350_, int i_351_,
			    int i_352_, int i_353_) {
	int i_354_ = i + (i_352_ - i_350_ - 1) * i_352_;
	for (int i_355_ = 0; i_355_ < i_351_; i_355_++)
	    is[i_354_ + i_355_ * i_352_] = i_353_;
    }
    
    static boolean method12592(Class103 class103, int i, int i_356_,
			       boolean bool) {
	long l = Class50.method1249((byte) 1);
	if (anInt7419 == 0) {
	    if (aClass241_Sub39_Sub12_7405.anInt10925 * 1100684019
		== aClass497_7374.anInt6529 * -431953051) {
		if (aClass241_Sub3_7417 == null)
		    aClass241_Sub3_7417
			= new RSByteBuffer(aClass210_7376.readContainerByIndentifiers
					    ((aClass241_Sub39_Sub12_7405
					      .aString10922),
					     "area", -276871455));
		aClass241_Sub3_7371 = aClass241_Sub3_7417;
		aClass241_Sub3_7371.pointer = 0;
	    } else
		aClass241_Sub3_7371
		    = (new RSByteBuffer
		       (aClass210_7376.readContainerByIndentifiers((aClass241_Sub39_Sub12_7405
						   .aString10922),
						  "area", -230309591)));
	    int i_357_ = aClass241_Sub3_7371.readUnsignedByte((byte) 89);
	    anIntArray7401 = new int[i_357_];
	    for (int i_358_ = 0; i_358_ < i_357_; i_358_++)
		anIntArray7401[i_358_]
		    = aClass241_Sub3_7371.readSmart((short) -4579);
	    int i_359_ = aClass241_Sub3_7371.readUnsignedByte((byte) 3);
	    anIntArray7367 = new int[i_359_];
	    for (int i_360_ = 0; i_360_ < i_359_; i_360_++)
		anIntArray7367[i_360_]
		    = aClass241_Sub3_7371.readSmart((short) -2659);
	}
	while (aClass241_Sub3_7371 != null
	       && (aClass241_Sub3_7371.pointer * 421967667
		   < aClass241_Sub3_7371.payload.length)
	       && (!bool
		   || Class50.method1249((byte) 1) < l + (long) anInt7420)) {
	    if (aClass241_Sub3_7371.readUnsignedByte((byte) 66) == 0) {
		int i_361_ = aClass241_Sub3_7371.readUnsignedByte((byte) 32);
		int i_362_ = aClass241_Sub3_7371.readUnsignedByte((byte) 112);
		for (int i_363_ = 0; i_363_ < 8; i_363_++) {
		    int i_364_ = aClass241_Sub3_7371.readUnsignedByte((byte) -39);
		    int i_365_ = i_361_ * 8 + i_363_ - anInt7388 / 8;
		    for (int i_366_ = 0; i_366_ < 8; i_366_++) {
			int i_367_ = i_362_ * 8 + i_366_ - anInt7389 / 8;
			aBoolArrayArray7435[i_365_][i_367_]
			    = (i_364_ & 1 << i_366_) != 0;
		    }
		}
		for (int i_368_ = 0; i_368_ < 64; i_368_++) {
		    for (int i_369_ = 0; i_369_ < 64; i_369_++) {
			int i_370_ = i_361_ * 64 + i_368_ - anInt7388;
			int i_371_ = i_362_ * 64 + i_369_ - anInt7389;
			method12586(class103, aClass241_Sub3_7371, i_361_,
				    i_362_, i_370_, i_371_, anIntArray7401,
				    anIntArray7367);
		    }
		}
	    } else {
		int i_372_ = aClass241_Sub3_7371.readUnsignedByte((byte) 94);
		int i_373_ = aClass241_Sub3_7371.readUnsignedByte((byte) -3);
		int i_374_ = aClass241_Sub3_7371.readUnsignedByte((byte) 6);
		int i_375_ = aClass241_Sub3_7371.readUnsignedByte((byte) -72);
		aBoolArrayArray7435[i_372_ * 8 + i_374_ - anInt7388 / 8]
		    [i_373_ * 8 + i_375_ - anInt7389 / 8]
		    = aClass241_Sub3_7371.readUnsignedByte((byte) 5) != 0;
		for (int i_376_ = 0; i_376_ < 8; i_376_++) {
		    for (int i_377_ = 0; i_377_ < 8; i_377_++) {
			int i_378_
			    = i_372_ * 64 + i_374_ * 8 + i_376_ - anInt7388;
			int i_379_
			    = i_373_ * 64 + i_375_ * 8 + i_377_ - anInt7389;
			method12586(class103, aClass241_Sub3_7371, i_372_,
				    i_373_, i_378_, i_379_, anIntArray7401,
				    anIntArray7367);
		    }
		}
	    }
	}
	if (aClass241_Sub3_7371 != null) {
	    anInt7419 = aClass241_Sub3_7371.pointer * 421967667;
	    if (aClass241_Sub3_7371.pointer * 421967667
		< aClass241_Sub3_7371.payload.length)
		return false;
	}
	aClass241_Sub3_7371 = null;
	anIntArray7367 = null;
	anIntArray7401 = null;
	if (aByteArray7393 != null) {
	    aByteArray7378 = new byte[anInt7390 * anInt7391];
	    aShortArray7369 = new short[anInt7390 * anInt7391];
	    for (int i_380_ = 0; i_380_ < 3; i_380_++) {
		byte[] is = new byte[anInt7390 * anInt7391];
		for (int i_381_ = 0;
		     i_381_ < aHashMapArrayArrayArray7411[i_380_].length;
		     i_381_++) {
		    for (int i_382_ = 0;
			 (i_382_
			  < aHashMapArrayArrayArray7411[i_380_][0].length);
			 i_382_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7411[i_380_]
					   [i_381_][i_382_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class575 class575 = (Class575) iterator.next();
				is[(i_381_ * 64
				    + ((Class575) class575).aByte7443
				    + ((i_382_ * 64
					+ ((Class575) class575).aByte7438)
				       * anInt7390))]
				    = (byte) ((Class575) class575).anInt7441;
			    }
			}
		    }
		}
		method12617(is, aByteArray7378, aShortArray7369, i, i_356_);
		for (int i_383_ = 0;
		     i_383_ < aHashMapArrayArrayArray7411[i_380_].length;
		     i_383_++) {
		    for (int i_384_ = 0;
			 (i_384_
			  < aHashMapArrayArrayArray7411[i_380_][0].length);
			 i_384_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7411[i_380_]
					   [i_383_][i_384_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class575 class575 = (Class575) iterator.next();
				int i_385_
				    = (i_383_ * 64
				       + ((Class575) class575).aByte7443
				       + ((i_384_ * 64
					   + ((Class575) class575).aByte7438)
					  * anInt7390));
				((Class575) class575).anInt7441
				    = ((aByteArray7378[i_385_] & 0xff) << 16
				       | aShortArray7369[i_385_] & 0xffff);
				if (((Class575) class575).anInt7441 != 0)
				    ((Class575) class575).anInt7441
					|= ~0xffffff;
			    }
			}
		    }
		}
	    }
	    method12617(aByteArray7393, aByteArray7378, aShortArray7369, i,
			i_356_);
	    aByteArray7393 = null;
	}
	if (!bool || Class50.method1249((byte) 1) < l + (long) anInt7420) {
	    method12566();
	    return true;
	}
	return false;
    }
    
    public static void method12593
	(JS5 class210, Class476 class476, Class394 class394,
	 ObjectDefinitionLoader class532, Class524 class524, Class598 class598,
	 Interface13 interface13, Interface11 interface11) {
	aClass210_7376 = class210;
	aClass476_7424 = class476;
	aClass394_7385 = class394;
	aClass532_7421 = class532;
	aClass524_7370 = class524;
	aClass598_7436 = class598;
	anInterface13_7373 = interface13;
	anInterface11_7372 = interface11;
	aClass407_7377.method7293(-2056388967);
	int i = aClass210_7376.identifierToIndex("details", -187631888);
	int[] is = aClass210_7376.getChildIndicies(i, (byte) 86);
	if (is != null) {
	    for (int i_386_ = 0; i_386_ < is.length; i_386_++) {
		Class241_Sub39_Sub12 class241_sub39_sub12
		    = Class611.method13230(aClass210_7376, i, is[i_386_],
					   1641999569);
		aClass407_7377.put(class241_sub39_sub12,
					  (long) ((class241_sub39_sub12
						   .anInt10925)
						  * 1100684019));
	    }
	}
	Class81.method1812(true, false, 953486904);
    }
    
    static NodeCollection method12594(Class103 class103) {
	int i = anInt7428 - anInt7426;
	int i_387_ = anInt7427 - anInt7429;
	int i_388_ = (anInt7395 - anInt7430 << 16) / i;
	int i_389_ = (anInt7425 - anInt7431 << 16) / i_387_;
	return method12643(class103, i_388_, i_389_, 0, 0);
    }
    
    static void method12595() {
	int[] is = new int[3];
	for (int i = 0; i < aClass564_7386.anInt7308 * 81284827; i++) {
	    boolean bool = (aClass241_Sub39_Sub12_7405.method17257
			    (aClass564_7386.anIntArray7306[i] >> 28 & 0x3,
			     aClass564_7386.anIntArray7306[i] >> 14 & 0x3fff,
			     aClass564_7386.anIntArray7306[i] & 0x3fff, is,
			     -785355003));
	    if (bool) {
		Class241_Sub41 class241_sub41
		    = new Class241_Sub41(aClass564_7386.anIntArray7307[i]);
		class241_sub41.anInt10154 = (is[1] - anInt7388) * 415135197;
		class241_sub41.anInt10152 = (is[2] - anInt7389) * -271238053;
		aClass429_7387.addNode(class241_sub41, (short) -31908);
	    }
	}
    }
    
    static void method12596() {
	aByteArray7393 = null;
	aByteArray7378 = null;
	aShortArray7369 = null;
	aByteArray7396 = null;
	aByteArray7397 = null;
	anObjectArray7398 = null;
	aByteArray7399 = null;
	aHashMapArrayArrayArray7411 = null;
	anIntArray7392 = null;
	aBoolArrayArray7435 = null;
    }
    
    static void method12597(int i) {
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = (Class241_Sub39_Sub12) aClass407_7377.get((long) i);
	if (class241_sub39_sub12 != null
	    && class241_sub39_sub12 != aClass241_Sub39_Sub12_7405) {
	    aClass241_Sub39_Sub12_7405 = class241_sub39_sub12;
	    aBool7432 = (aClass241_Sub39_Sub12_7405.anInt10925 * 1100684019
			 == aClass497_7374.anInt6533 * -1604459277);
	}
    }
    
    static void method12598(int i) {
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = (Class241_Sub39_Sub12) aClass407_7377.get((long) i);
	if (class241_sub39_sub12 != null
	    && class241_sub39_sub12 != aClass241_Sub39_Sub12_7405) {
	    aClass241_Sub39_Sub12_7405 = class241_sub39_sub12;
	    aBool7432 = (aClass241_Sub39_Sub12_7405.anInt10925 * 1100684019
			 == aClass497_7374.anInt6533 * -1604459277);
	}
    }
    
    public static Class241_Sub39_Sub12 method12599(int i, int i_390_) {
	for (Class241_Sub39_Sub12 class241_sub39_sub12
		 = ((Class241_Sub39_Sub12)
		    aClass407_7377.method7294(2090894173));
	     class241_sub39_sub12 != null;
	     class241_sub39_sub12 = ((Class241_Sub39_Sub12)
				     aClass407_7377.method7295(1738499132))) {
	    if (((Class241_Sub39_Sub12) class241_sub39_sub12).aBool10921
		&& class241_sub39_sub12.method17271(i, i_390_, -1516690978))
		return class241_sub39_sub12;
	}
	return null;
    }
    
    public static Class241_Sub39_Sub12 method12600(int i, int i_391_) {
	for (Class241_Sub39_Sub12 class241_sub39_sub12
		 = ((Class241_Sub39_Sub12)
		    aClass407_7377.method7294(2090894173));
	     class241_sub39_sub12 != null;
	     class241_sub39_sub12 = ((Class241_Sub39_Sub12)
				     aClass407_7377.method7295(551271640))) {
	    if (((Class241_Sub39_Sub12) class241_sub39_sub12).aBool10921
		&& class241_sub39_sub12.method17271(i, i_391_, 455335623))
		return class241_sub39_sub12;
	}
	return null;
    }
    
    public static Class241_Sub39_Sub12 method12601(int i, int i_392_) {
	for (Class241_Sub39_Sub12 class241_sub39_sub12
		 = ((Class241_Sub39_Sub12)
		    aClass407_7377.method7294(2090894173));
	     class241_sub39_sub12 != null;
	     class241_sub39_sub12 = ((Class241_Sub39_Sub12)
				     aClass407_7377.method7295(111962857))) {
	    if (((Class241_Sub39_Sub12) class241_sub39_sub12).aBool10921
		&& class241_sub39_sub12.method17271(i, i_392_, -1189311256))
		return class241_sub39_sub12;
	}
	return null;
    }
    
    public static Class241_Sub39_Sub12 method12602(int i) {
	return (Class241_Sub39_Sub12) aClass407_7377.get((long) i);
    }
    
    public static Class241_Sub39_Sub12 method12603(int i) {
	return (Class241_Sub39_Sub12) aClass407_7377.get((long) i);
    }
    
    public static Class241_Sub39_Sub12 method12604(int i) {
	return (Class241_Sub39_Sub12) aClass407_7377.get((long) i);
    }
    
    public static Class241_Sub39_Sub12 method12605(int i) {
	return (Class241_Sub39_Sub12) aClass407_7377.get((long) i);
    }
    
    public static Class241_Sub39_Sub12 method12606(int i) {
	return (Class241_Sub39_Sub12) aClass407_7377.get((long) i);
    }
    
    public static Class410 method12607(int i, int i_393_) {
	Class410 class410 = new Class410();
	for (Class241_Sub39_Sub12 class241_sub39_sub12
		 = ((Class241_Sub39_Sub12)
		    aClass407_7377.method7294(2090894173));
	     class241_sub39_sub12 != null;
	     class241_sub39_sub12 = ((Class241_Sub39_Sub12)
				     aClass407_7377.method7295(686071618))) {
	    if (((Class241_Sub39_Sub12) class241_sub39_sub12).aBool10921
		&& class241_sub39_sub12.method17271(i, i_393_, 455840709))
		class410.method7431(class241_sub39_sub12, (byte) -62);
	}
	return class410;
    }
    
    public static Class410 method12608(int i, int i_394_) {
	Class410 class410 = new Class410();
	for (Class241_Sub39_Sub12 class241_sub39_sub12
		 = ((Class241_Sub39_Sub12)
		    aClass407_7377.method7294(2090894173));
	     class241_sub39_sub12 != null;
	     class241_sub39_sub12 = ((Class241_Sub39_Sub12)
				     aClass407_7377.method7295(1333906635))) {
	    if (((Class241_Sub39_Sub12) class241_sub39_sub12).aBool10921
		&& class241_sub39_sub12.method17271(i, i_394_, -1105042321))
		class410.method7431(class241_sub39_sub12, (byte) -94);
	}
	return class410;
    }
    
    static void method12609(Class107 class107, int i, int i_395_) {
	for (int i_396_ = 0; i_396_ < aClass476_7424.anInt6398 * 661753477;
	     i_396_++)
	    anIntArray7392[i_396_ + 1]
		= method12563(class107, i_396_, i, i_395_);
    }
    
    public static Class410 method12610(int i, int i_397_) {
	Class410 class410 = new Class410();
	for (Class241_Sub39_Sub12 class241_sub39_sub12
		 = ((Class241_Sub39_Sub12)
		    aClass407_7377.method7294(2090894173));
	     class241_sub39_sub12 != null;
	     class241_sub39_sub12 = ((Class241_Sub39_Sub12)
				     aClass407_7377.method7295(1598734452))) {
	    if (((Class241_Sub39_Sub12) class241_sub39_sub12).aBool10921
		&& class241_sub39_sub12.method17271(i, i_397_, -1151043817))
		class410.method7431(class241_sub39_sub12, (byte) -33);
	}
	return class410;
    }
    
    static int method12611(Class107 class107, int i, int i_398_, int i_399_) {
	Class467 class467 = aClass476_7424.method10906(i, -408027403);
	if (class467 == null)
	    return 0;
	int i_400_ = class467.anInt6321 * -701216129;
	if (i_400_ >= 0 && class107.method2680(i_400_, -1567459466).aBool1434)
	    i_400_ = -1;
	int i_401_;
	if (class467.anInt6323 * -1240842283 >= 0) {
	    int i_402_ = class467.anInt6323 * -1240842283;
	    int i_403_ = (i_402_ & 0x7f) + i_399_;
	    if (i_403_ < 0)
		i_403_ = 0;
	    else if (i_403_ > 127)
		i_403_ = 127;
	    int i_404_
		= (i_402_ + i_398_ & 0xfc00) + (i_402_ & 0x380) + i_403_;
	    i_401_ = ~0xffffff | (Class474.anIntArray6382
				  [(Class241_Sub42.method16451
				    (Class445_Sub30.method14388(i_404_, 96,
								1214807674),
				     -1455904404)) & 0xffff]);
	} else if (i_400_ >= 0)
	    i_401_ = (~0xffffff
		      | (Class474.anIntArray6382
			 [(Class241_Sub42.method16451
			   (Class445_Sub30.method14388((class107.method2680
							(i_400_, 868428458)
							.aShort1436),
						       96, -1689027246),
			    1115578824)) & 0xffff]));
	else if (class467.anInt6320 * -1439860245 == -1)
	    i_401_ = 0;
	else {
	    int i_405_ = class467.anInt6320 * -1439860245;
	    int i_406_ = (i_405_ & 0x7f) + i_399_;
	    if (i_406_ < 0)
		i_406_ = 0;
	    else if (i_406_ > 127)
		i_406_ = 127;
	    int i_407_
		= (i_405_ + i_398_ & 0xfc00) + (i_405_ & 0x380) + i_406_;
	    i_401_ = ~0xffffff | (Class474.anIntArray6382
				  [(Class241_Sub42.method16451
				    (Class445_Sub30.method14388(i_407_, 96,
								38402605),
				     24840826)) & 0xffff]);
	}
	return i_401_;
    }
    
    static NodeCollection method12612(Class103 class103, int i, int i_408_,
				int i_409_, int i_410_) {
	for (Class241_Sub41 class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7694(16711935);
	     class241_sub41 != null;
	     class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7692(-531956079))
	    method12579(class103, class241_sub41, i, i_408_, i_409_, i_410_);
	return aClass429_7387;
    }
    
    static void method12613() {
	for (int i = 0; i < anInt7390; i++) {
	    for (int i_411_ = 0; i_411_ < anInt7391; i_411_++) {
		Object object = anObjectArray7398[i + i_411_ * anInt7390];
		if (object != null) {
		    if (object instanceof Class241_Sub19) {
			Class241_Sub19 class241_sub19
			    = (Class241_Sub19) object;
			if (class241_sub19 != null) {
			    for (int i_412_ = 0;
				 i_412_ < (((Class241_Sub19) class241_sub19)
					   .anIntArray8997).length;
				 i_412_++) {
				ObjectDefinition class526
				    = (aClass532_7421.getObjectDefinition
				       ((((Class241_Sub19) class241_sub19)
					 .anIntArray8997[i_412_]),
					577892407));
				int i_413_ = class526.mapSpriteID * 8166631;
				if (class526.toObjectIDs != null) {
				    class526
					= (class526.method11768
					   (anInterface13_7373,
					    anInterface11_7372, -1476155831));
				    if (class526 != null)
					i_413_ = class526.mapSpriteID * 8166631;
				}
				if (i_413_ != -1) {
				    Class241_Sub41 class241_sub41
					= new Class241_Sub41(i_413_);
				    class241_sub41.anInt10154 = i * 415135197;
				    class241_sub41.anInt10152
					= i_411_ * -271238053;
				    aClass429_7387.addNode(class241_sub41,
							      (short) -32574);
				}
			    }
			}
		    } else {
			Integer integer = (Integer) object;
			ObjectDefinition class526
			    = aClass532_7421.getObjectDefinition(integer.intValue(),
							 577892407);
			int i_414_ = class526.mapSpriteID * 8166631;
			if (class526.toObjectIDs != null) {
			    class526 = class526.method11768(anInterface13_7373,
							    anInterface11_7372,
							    -1598333739);
			    if (class526 != null)
				i_414_ = class526.mapSpriteID * 8166631;
			}
			if (i_414_ != -1) {
			    Class241_Sub41 class241_sub41
				= new Class241_Sub41(i_414_);
			    class241_sub41.anInt10154 = i * 415135197;
			    class241_sub41.anInt10152 = i_411_ * -271238053;
			    aClass429_7387.addNode(class241_sub41,
						      (short) -25040);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 3; i++) {
	    for (int i_415_ = 0;
		 i_415_ < aHashMapArrayArrayArray7411[0].length; i_415_++) {
		for (int i_416_ = 0;
		     i_416_ < aHashMapArrayArrayArray7411[0][0].length;
		     i_416_++) {
		    HashMap hashmap
			= aHashMapArrayArrayArray7411[i][i_415_][i_416_];
		    if (hashmap != null) {
			Iterator iterator = hashmap.values().iterator();
			while (iterator.hasNext()) {
			    Class575 class575 = (Class575) iterator.next();
			    if (((Class575) class575).anIntArray7442 != null) {
				for (int i_417_ = 0;
				     i_417_ < (((Class575) class575)
					       .anIntArray7442).length;
				     i_417_++) {
				    ObjectDefinition class526
					= (aClass532_7421.getObjectDefinition
					   ((((Class575) class575)
					     .anIntArray7442[i_417_]),
					    577892407));
				    int i_418_ = class526.mapSpriteID * 8166631;
				    if (class526.toObjectIDs != null) {
					class526 = (class526.method11768
						    (anInterface13_7373,
						     anInterface11_7372,
						     -640983244));
					if (class526 != null)
					    i_418_
						= class526.mapSpriteID * 8166631;
				    }
				    if (i_418_ != -1) {
					Class241_Sub41 class241_sub41
					    = new Class241_Sub41(i_418_);
					class241_sub41.anInt10154
					    = ((i_415_ + (anInt7388 >> 6)) * 64
					       + (((Class575) class575)
						  .aByte7443)
					       - anInt7388) * 415135197;
					class241_sub41.anInt10152
					    = ((i_416_ + (anInt7389 >> 6)) * 64
					       + (((Class575) class575)
						  .aByte7438)
					       - anInt7389) * -271238053;
					aClass429_7387.addNode
					    (class241_sub41, (short) -25031);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method12614(int[] is, int i, int i_419_, int i_420_,
			    int i_421_, int i_422_, int i_423_) {
	for (int i_424_ = i; i_424_ <= i_419_; i_424_++) {
	    for (int i_425_ = i_420_; i_425_ <= i_421_; i_425_++)
		is[(i_422_ - i_425_ - 1) * i_422_ + i_424_] = i_423_;
	}
    }
    
    static void method12615() {
	for (int i = 0; i < anInt7390; i++) {
	    for (int i_426_ = 0; i_426_ < anInt7391; i_426_++) {
		Object object = anObjectArray7398[i + i_426_ * anInt7390];
		if (object != null) {
		    if (object instanceof Class241_Sub19) {
			Class241_Sub19 class241_sub19
			    = (Class241_Sub19) object;
			if (class241_sub19 != null) {
			    for (int i_427_ = 0;
				 i_427_ < (((Class241_Sub19) class241_sub19)
					   .anIntArray8997).length;
				 i_427_++) {
				ObjectDefinition class526
				    = (aClass532_7421.getObjectDefinition
				       ((((Class241_Sub19) class241_sub19)
					 .anIntArray8997[i_427_]),
					577892407));
				int i_428_ = class526.mapSpriteID * 8166631;
				if (class526.toObjectIDs != null) {
				    class526
					= (class526.method11768
					   (anInterface13_7373,
					    anInterface11_7372, -936308186));
				    if (class526 != null)
					i_428_ = class526.mapSpriteID * 8166631;
				}
				if (i_428_ != -1) {
				    Class241_Sub41 class241_sub41
					= new Class241_Sub41(i_428_);
				    class241_sub41.anInt10154 = i * 415135197;
				    class241_sub41.anInt10152
					= i_426_ * -271238053;
				    aClass429_7387.addNode(class241_sub41,
							      (short) -3104);
				}
			    }
			}
		    } else {
			Integer integer = (Integer) object;
			ObjectDefinition class526
			    = aClass532_7421.getObjectDefinition(integer.intValue(),
							 577892407);
			int i_429_ = class526.mapSpriteID * 8166631;
			if (class526.toObjectIDs != null) {
			    class526 = class526.method11768(anInterface13_7373,
							    anInterface11_7372,
							    -1757193465);
			    if (class526 != null)
				i_429_ = class526.mapSpriteID * 8166631;
			}
			if (i_429_ != -1) {
			    Class241_Sub41 class241_sub41
				= new Class241_Sub41(i_429_);
			    class241_sub41.anInt10154 = i * 415135197;
			    class241_sub41.anInt10152 = i_426_ * -271238053;
			    aClass429_7387.addNode(class241_sub41,
						      (short) -23394);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 3; i++) {
	    for (int i_430_ = 0;
		 i_430_ < aHashMapArrayArrayArray7411[0].length; i_430_++) {
		for (int i_431_ = 0;
		     i_431_ < aHashMapArrayArrayArray7411[0][0].length;
		     i_431_++) {
		    HashMap hashmap
			= aHashMapArrayArrayArray7411[i][i_430_][i_431_];
		    if (hashmap != null) {
			Iterator iterator = hashmap.values().iterator();
			while (iterator.hasNext()) {
			    Class575 class575 = (Class575) iterator.next();
			    if (((Class575) class575).anIntArray7442 != null) {
				for (int i_432_ = 0;
				     i_432_ < (((Class575) class575)
					       .anIntArray7442).length;
				     i_432_++) {
				    ObjectDefinition class526
					= (aClass532_7421.getObjectDefinition
					   ((((Class575) class575)
					     .anIntArray7442[i_432_]),
					    577892407));
				    int i_433_ = class526.mapSpriteID * 8166631;
				    if (class526.toObjectIDs != null) {
					class526 = (class526.method11768
						    (anInterface13_7373,
						     anInterface11_7372,
						     -428927595));
					if (class526 != null)
					    i_433_
						= class526.mapSpriteID * 8166631;
				    }
				    if (i_433_ != -1) {
					Class241_Sub41 class241_sub41
					    = new Class241_Sub41(i_433_);
					class241_sub41.anInt10154
					    = ((i_430_ + (anInt7388 >> 6)) * 64
					       + (((Class575) class575)
						  .aByte7443)
					       - anInt7388) * 415135197;
					class241_sub41.anInt10152
					    = ((i_431_ + (anInt7389 >> 6)) * 64
					       + (((Class575) class575)
						  .aByte7438)
					       - anInt7389) * -271238053;
					aClass429_7387.addNode
					    (class241_sub41, (short) -10091);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static boolean method12616(Class103 class103, int i, int i_434_,
			       boolean bool) {
	long l = Class50.method1249((byte) 1);
	if (anInt7419 == 0) {
	    if (aClass241_Sub39_Sub12_7405.anInt10925 * 1100684019
		== aClass497_7374.anInt6529 * -431953051) {
		if (aClass241_Sub3_7417 == null)
		    aClass241_Sub3_7417
			= new RSByteBuffer(aClass210_7376.readContainerByIndentifiers
					    ((aClass241_Sub39_Sub12_7405
					      .aString10922),
					     "area", -214122952));
		aClass241_Sub3_7371 = aClass241_Sub3_7417;
		aClass241_Sub3_7371.pointer = 0;
	    } else
		aClass241_Sub3_7371
		    = (new RSByteBuffer
		       (aClass210_7376.readContainerByIndentifiers((aClass241_Sub39_Sub12_7405
						   .aString10922),
						  "area", 1748771121)));
	    int i_435_ = aClass241_Sub3_7371.readUnsignedByte((byte) 59);
	    anIntArray7401 = new int[i_435_];
	    for (int i_436_ = 0; i_436_ < i_435_; i_436_++)
		anIntArray7401[i_436_]
		    = aClass241_Sub3_7371.readSmart((short) -14464);
	    int i_437_ = aClass241_Sub3_7371.readUnsignedByte((byte) -98);
	    anIntArray7367 = new int[i_437_];
	    for (int i_438_ = 0; i_438_ < i_437_; i_438_++)
		anIntArray7367[i_438_]
		    = aClass241_Sub3_7371.readSmart((short) -8941);
	}
	while (aClass241_Sub3_7371 != null
	       && (aClass241_Sub3_7371.pointer * 421967667
		   < aClass241_Sub3_7371.payload.length)
	       && (!bool
		   || Class50.method1249((byte) 1) < l + (long) anInt7420)) {
	    if (aClass241_Sub3_7371.readUnsignedByte((byte) -90) == 0) {
		int i_439_ = aClass241_Sub3_7371.readUnsignedByte((byte) -81);
		int i_440_ = aClass241_Sub3_7371.readUnsignedByte((byte) -49);
		for (int i_441_ = 0; i_441_ < 8; i_441_++) {
		    int i_442_ = aClass241_Sub3_7371.readUnsignedByte((byte) 43);
		    int i_443_ = i_439_ * 8 + i_441_ - anInt7388 / 8;
		    for (int i_444_ = 0; i_444_ < 8; i_444_++) {
			int i_445_ = i_440_ * 8 + i_444_ - anInt7389 / 8;
			aBoolArrayArray7435[i_443_][i_445_]
			    = (i_442_ & 1 << i_444_) != 0;
		    }
		}
		for (int i_446_ = 0; i_446_ < 64; i_446_++) {
		    for (int i_447_ = 0; i_447_ < 64; i_447_++) {
			int i_448_ = i_439_ * 64 + i_446_ - anInt7388;
			int i_449_ = i_440_ * 64 + i_447_ - anInt7389;
			method12586(class103, aClass241_Sub3_7371, i_439_,
				    i_440_, i_448_, i_449_, anIntArray7401,
				    anIntArray7367);
		    }
		}
	    } else {
		int i_450_ = aClass241_Sub3_7371.readUnsignedByte((byte) 19);
		int i_451_ = aClass241_Sub3_7371.readUnsignedByte((byte) -32);
		int i_452_ = aClass241_Sub3_7371.readUnsignedByte((byte) -78);
		int i_453_ = aClass241_Sub3_7371.readUnsignedByte((byte) -2);
		aBoolArrayArray7435[i_450_ * 8 + i_452_ - anInt7388 / 8]
		    [i_451_ * 8 + i_453_ - anInt7389 / 8]
		    = aClass241_Sub3_7371.readUnsignedByte((byte) -48) != 0;
		for (int i_454_ = 0; i_454_ < 8; i_454_++) {
		    for (int i_455_ = 0; i_455_ < 8; i_455_++) {
			int i_456_
			    = i_450_ * 64 + i_452_ * 8 + i_454_ - anInt7388;
			int i_457_
			    = i_451_ * 64 + i_453_ * 8 + i_455_ - anInt7389;
			method12586(class103, aClass241_Sub3_7371, i_450_,
				    i_451_, i_456_, i_457_, anIntArray7401,
				    anIntArray7367);
		    }
		}
	    }
	}
	if (aClass241_Sub3_7371 != null) {
	    anInt7419 = aClass241_Sub3_7371.pointer * 421967667;
	    if (aClass241_Sub3_7371.pointer * 421967667
		< aClass241_Sub3_7371.payload.length)
		return false;
	}
	aClass241_Sub3_7371 = null;
	anIntArray7367 = null;
	anIntArray7401 = null;
	if (aByteArray7393 != null) {
	    aByteArray7378 = new byte[anInt7390 * anInt7391];
	    aShortArray7369 = new short[anInt7390 * anInt7391];
	    for (int i_458_ = 0; i_458_ < 3; i_458_++) {
		byte[] is = new byte[anInt7390 * anInt7391];
		for (int i_459_ = 0;
		     i_459_ < aHashMapArrayArrayArray7411[i_458_].length;
		     i_459_++) {
		    for (int i_460_ = 0;
			 (i_460_
			  < aHashMapArrayArrayArray7411[i_458_][0].length);
			 i_460_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7411[i_458_]
					   [i_459_][i_460_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class575 class575 = (Class575) iterator.next();
				is[(i_459_ * 64
				    + ((Class575) class575).aByte7443
				    + ((i_460_ * 64
					+ ((Class575) class575).aByte7438)
				       * anInt7390))]
				    = (byte) ((Class575) class575).anInt7441;
			    }
			}
		    }
		}
		method12617(is, aByteArray7378, aShortArray7369, i, i_434_);
		for (int i_461_ = 0;
		     i_461_ < aHashMapArrayArrayArray7411[i_458_].length;
		     i_461_++) {
		    for (int i_462_ = 0;
			 (i_462_
			  < aHashMapArrayArrayArray7411[i_458_][0].length);
			 i_462_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7411[i_458_]
					   [i_461_][i_462_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class575 class575 = (Class575) iterator.next();
				int i_463_
				    = (i_461_ * 64
				       + ((Class575) class575).aByte7443
				       + ((i_462_ * 64
					   + ((Class575) class575).aByte7438)
					  * anInt7390));
				((Class575) class575).anInt7441
				    = ((aByteArray7378[i_463_] & 0xff) << 16
				       | aShortArray7369[i_463_] & 0xffff);
				if (((Class575) class575).anInt7441 != 0)
				    ((Class575) class575).anInt7441
					|= ~0xffffff;
			    }
			}
		    }
		}
	    }
	    method12617(aByteArray7393, aByteArray7378, aShortArray7369, i,
			i_434_);
	    aByteArray7393 = null;
	}
	if (!bool || Class50.method1249((byte) 1) < l + (long) anInt7420) {
	    method12566();
	    return true;
	}
	return false;
    }
    
    static void method12617(byte[] is, byte[] is_464_, short[] is_465_, int i,
			    int i_466_) {
	int[] is_467_ = new int[anInt7391];
	int[] is_468_ = new int[anInt7391];
	int[] is_469_ = new int[anInt7391];
	int[] is_470_ = new int[anInt7391];
	int[] is_471_ = new int[anInt7391];
	for (int i_472_ = -5; i_472_ < anInt7390; i_472_++) {
	    int i_473_ = i_472_ + 5;
	    int i_474_ = i_472_ - 5;
	    for (int i_475_ = 0; i_475_ < anInt7391; i_475_++) {
		if (i_473_ < anInt7390) {
		    int i_476_ = is[i_473_ + i_475_ * anInt7390] & 0xff;
		    if (i_476_ > 0) {
			Class415 class415
			    = aClass394_7385.method7057(i_476_ - 1,
							1005293245);
			is_467_[i_475_] += class415.anInt6001 * -1315419177;
			is_468_[i_475_] += class415.anInt6007 * -2071452791;
			is_469_[i_475_] += class415.anInt6002 * -1150999567;
			is_470_[i_475_] += class415.anInt6008 * 555035583;
			is_471_[i_475_]++;
		    }
		}
		if (i_474_ >= 0) {
		    int i_477_ = is[i_474_ + i_475_ * anInt7390] & 0xff;
		    if (i_477_ > 0) {
			Class415 class415
			    = aClass394_7385.method7057(i_477_ - 1,
							1005293245);
			is_467_[i_475_] -= class415.anInt6001 * -1315419177;
			is_468_[i_475_] -= class415.anInt6007 * -2071452791;
			is_469_[i_475_] -= class415.anInt6002 * -1150999567;
			is_470_[i_475_] -= class415.anInt6008 * 555035583;
			is_471_[i_475_]--;
		    }
		}
	    }
	    if (i_472_ >= 0) {
		int i_478_ = 0;
		int i_479_ = 0;
		int i_480_ = 0;
		int i_481_ = 0;
		int i_482_ = 0;
		for (int i_483_ = -5; i_483_ < anInt7391; i_483_++) {
		    int i_484_ = i_483_ + 5;
		    if (i_484_ < anInt7391) {
			i_478_ += is_467_[i_484_];
			i_479_ += is_468_[i_484_];
			i_480_ += is_469_[i_484_];
			i_481_ += is_470_[i_484_];
			i_482_ += is_471_[i_484_];
		    }
		    int i_485_ = i_483_ - 5;
		    if (i_485_ >= 0) {
			i_478_ -= is_467_[i_485_];
			i_479_ -= is_468_[i_485_];
			i_480_ -= is_469_[i_485_];
			i_481_ -= is_470_[i_485_];
			i_482_ -= is_471_[i_485_];
		    }
		    if (i_483_ >= 0 && i_482_ > 0) {
			if ((is[i_472_ + i_483_ * anInt7390] & 0xff) == 0) {
			    int i_486_ = i_472_ + i_483_ * anInt7390;
			    is_464_[i_486_] = (byte) 0;
			    is_465_[i_486_] = (short) 0;
			} else {
			    int i_487_
				= (i_481_ == 0 ? 0
				   : Class558.method12325((i_478_ * 256
							   / i_481_),
							  i_479_ / i_482_,
							  i_480_ / i_482_,
							  (byte) 1));
			    int i_488_ = (i_487_ & 0x7f) + i_466_;
			    if (i_488_ < 0)
				i_488_ = 0;
			    else if (i_488_ > 127)
				i_488_ = 127;
			    int i_489_ = ((i_487_ + i & 0xfc00)
					  + (i_487_ & 0x380) + i_488_);
			    int i_490_ = i_472_ + i_483_ * anInt7390;
			    int i_491_ = (Class474.anIntArray6382
					  [(Class241_Sub42.method16451
					    (Class426.method7580(i_489_, 96,
								 (byte) 4),
					     -754474500)) & 0xffff]);
			    is_464_[i_490_] = (byte) (i_491_ >> 16 & 0xff);
			    is_465_[i_490_] = (short) (i_491_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    static boolean method12618(Class103 class103, int i, int i_492_,
			       boolean bool) {
	long l = Class50.method1249((byte) 1);
	if (anInt7419 == 0) {
	    if (aClass241_Sub39_Sub12_7405.anInt10925 * 1100684019
		== aClass497_7374.anInt6529 * -431953051) {
		if (aClass241_Sub3_7417 == null)
		    aClass241_Sub3_7417
			= new RSByteBuffer(aClass210_7376.readContainerByIndentifiers
					    ((aClass241_Sub39_Sub12_7405
					      .aString10922),
					     "area", 1703895691));
		aClass241_Sub3_7371 = aClass241_Sub3_7417;
		aClass241_Sub3_7371.pointer = 0;
	    } else
		aClass241_Sub3_7371
		    = (new RSByteBuffer
		       (aClass210_7376.readContainerByIndentifiers((aClass241_Sub39_Sub12_7405
						   .aString10922),
						  "area", 1571936649)));
	    int i_493_ = aClass241_Sub3_7371.readUnsignedByte((byte) 6);
	    anIntArray7401 = new int[i_493_];
	    for (int i_494_ = 0; i_494_ < i_493_; i_494_++)
		anIntArray7401[i_494_]
		    = aClass241_Sub3_7371.readSmart((short) -23824);
	    int i_495_ = aClass241_Sub3_7371.readUnsignedByte((byte) 7);
	    anIntArray7367 = new int[i_495_];
	    for (int i_496_ = 0; i_496_ < i_495_; i_496_++)
		anIntArray7367[i_496_]
		    = aClass241_Sub3_7371.readSmart((short) -32651);
	}
	while (aClass241_Sub3_7371 != null
	       && (aClass241_Sub3_7371.pointer * 421967667
		   < aClass241_Sub3_7371.payload.length)
	       && (!bool
		   || Class50.method1249((byte) 1) < l + (long) anInt7420)) {
	    if (aClass241_Sub3_7371.readUnsignedByte((byte) -12) == 0) {
		int i_497_ = aClass241_Sub3_7371.readUnsignedByte((byte) -110);
		int i_498_ = aClass241_Sub3_7371.readUnsignedByte((byte) -18);
		for (int i_499_ = 0; i_499_ < 8; i_499_++) {
		    int i_500_ = aClass241_Sub3_7371.readUnsignedByte((byte) 93);
		    int i_501_ = i_497_ * 8 + i_499_ - anInt7388 / 8;
		    for (int i_502_ = 0; i_502_ < 8; i_502_++) {
			int i_503_ = i_498_ * 8 + i_502_ - anInt7389 / 8;
			aBoolArrayArray7435[i_501_][i_503_]
			    = (i_500_ & 1 << i_502_) != 0;
		    }
		}
		for (int i_504_ = 0; i_504_ < 64; i_504_++) {
		    for (int i_505_ = 0; i_505_ < 64; i_505_++) {
			int i_506_ = i_497_ * 64 + i_504_ - anInt7388;
			int i_507_ = i_498_ * 64 + i_505_ - anInt7389;
			method12586(class103, aClass241_Sub3_7371, i_497_,
				    i_498_, i_506_, i_507_, anIntArray7401,
				    anIntArray7367);
		    }
		}
	    } else {
		int i_508_ = aClass241_Sub3_7371.readUnsignedByte((byte) -8);
		int i_509_ = aClass241_Sub3_7371.readUnsignedByte((byte) -26);
		int i_510_ = aClass241_Sub3_7371.readUnsignedByte((byte) -2);
		int i_511_ = aClass241_Sub3_7371.readUnsignedByte((byte) 33);
		aBoolArrayArray7435[i_508_ * 8 + i_510_ - anInt7388 / 8]
		    [i_509_ * 8 + i_511_ - anInt7389 / 8]
		    = aClass241_Sub3_7371.readUnsignedByte((byte) -46) != 0;
		for (int i_512_ = 0; i_512_ < 8; i_512_++) {
		    for (int i_513_ = 0; i_513_ < 8; i_513_++) {
			int i_514_
			    = i_508_ * 64 + i_510_ * 8 + i_512_ - anInt7388;
			int i_515_
			    = i_509_ * 64 + i_511_ * 8 + i_513_ - anInt7389;
			method12586(class103, aClass241_Sub3_7371, i_508_,
				    i_509_, i_514_, i_515_, anIntArray7401,
				    anIntArray7367);
		    }
		}
	    }
	}
	if (aClass241_Sub3_7371 != null) {
	    anInt7419 = aClass241_Sub3_7371.pointer * 421967667;
	    if (aClass241_Sub3_7371.pointer * 421967667
		< aClass241_Sub3_7371.payload.length)
		return false;
	}
	aClass241_Sub3_7371 = null;
	anIntArray7367 = null;
	anIntArray7401 = null;
	if (aByteArray7393 != null) {
	    aByteArray7378 = new byte[anInt7390 * anInt7391];
	    aShortArray7369 = new short[anInt7390 * anInt7391];
	    for (int i_516_ = 0; i_516_ < 3; i_516_++) {
		byte[] is = new byte[anInt7390 * anInt7391];
		for (int i_517_ = 0;
		     i_517_ < aHashMapArrayArrayArray7411[i_516_].length;
		     i_517_++) {
		    for (int i_518_ = 0;
			 (i_518_
			  < aHashMapArrayArrayArray7411[i_516_][0].length);
			 i_518_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7411[i_516_]
					   [i_517_][i_518_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class575 class575 = (Class575) iterator.next();
				is[(i_517_ * 64
				    + ((Class575) class575).aByte7443
				    + ((i_518_ * 64
					+ ((Class575) class575).aByte7438)
				       * anInt7390))]
				    = (byte) ((Class575) class575).anInt7441;
			    }
			}
		    }
		}
		method12617(is, aByteArray7378, aShortArray7369, i, i_492_);
		for (int i_519_ = 0;
		     i_519_ < aHashMapArrayArrayArray7411[i_516_].length;
		     i_519_++) {
		    for (int i_520_ = 0;
			 (i_520_
			  < aHashMapArrayArrayArray7411[i_516_][0].length);
			 i_520_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7411[i_516_]
					   [i_519_][i_520_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class575 class575 = (Class575) iterator.next();
				int i_521_
				    = (i_519_ * 64
				       + ((Class575) class575).aByte7443
				       + ((i_520_ * 64
					   + ((Class575) class575).aByte7438)
					  * anInt7390));
				((Class575) class575).anInt7441
				    = ((aByteArray7378[i_521_] & 0xff) << 16
				       | aShortArray7369[i_521_] & 0xffff);
				if (((Class575) class575).anInt7441 != 0)
				    ((Class575) class575).anInt7441
					|= ~0xffffff;
			    }
			}
		    }
		}
	    }
	    method12617(aByteArray7393, aByteArray7378, aShortArray7369, i,
			i_492_);
	    aByteArray7393 = null;
	}
	if (!bool || Class50.method1249((byte) 1) < l + (long) anInt7420) {
	    method12566();
	    return true;
	}
	return false;
    }
    
    static void method12619(Class103 class103, RSByteBuffer class241_sub3,
			    int i, int i_522_, int i_523_, int i_524_,
			    int[] is, int[] is_525_) {
	int i_526_ = class241_sub3.readUnsignedByte((byte) -10);
	if ((i_526_ & 0x1) == 0) {
	    boolean bool = (i_526_ & 0x2) == 0;
	    int i_527_ = i_526_ >> 2 & 0x3f;
	    if (i_527_ != 62) {
		if (i_527_ == 63)
		    i_527_ = class241_sub3.readUnsignedByte((byte) -9);
		else if (bool)
		    i_527_ = is[i_527_];
		else
		    i_527_ = is_525_[i_527_];
		if (bool) {
		    aByteArray7393[i_523_ + i_524_ * anInt7390]
			= (byte) i_527_;
		    aByteArray7396[i_523_ + i_524_ * anInt7390] = (byte) 0;
		} else {
		    aByteArray7396[i_523_ + i_524_ * anInt7390]
			= (byte) i_527_;
		    aByteArray7397[i_523_ + i_524_ * anInt7390] = (byte) 0;
		    aByteArray7393[i_523_ + i_524_ * anInt7390]
			= class241_sub3.getByte(-1972957047);
		}
	    }
	} else {
	    int i_528_ = (i_526_ >> 1 & 0x3) + 1;
	    boolean bool = (i_526_ & 0x8) != 0;
	    boolean bool_529_ = (i_526_ & 0x10) != 0;
	    for (int i_530_ = 0; i_530_ < i_528_; i_530_++) {
		int i_531_ = class241_sub3.readUnsignedByte((byte) 3);
		int i_532_ = 0;
		int i_533_ = 0;
		if (bool) {
		    i_532_ = class241_sub3.readUnsignedByte((byte) -13);
		    i_533_ = class241_sub3.readUnsignedByte((byte) 77);
		}
		int i_534_ = 0;
		if (bool_529_)
		    i_534_ = class241_sub3.readUnsignedByte((byte) -33);
		if (i_530_ == 0) {
		    aByteArray7393[i_523_ + i_524_ * anInt7390]
			= (byte) i_531_;
		    aByteArray7396[i_523_ + i_524_ * anInt7390]
			= (byte) i_532_;
		    aByteArray7397[i_523_ + i_524_ * anInt7390]
			= (byte) i_533_;
		    if (i_534_ == 1) {
			anObjectArray7398[i_523_ + i_524_ * anInt7390]
			    = new Integer(class241_sub3
					      .readBigSmart((byte) 109));
			aByteArray7399[i_523_ + i_524_ * anInt7390]
			    = class241_sub3.getByte(-797953964);
		    } else if (i_534_ > 1) {
			int[] is_535_ = new int[i_534_];
			byte[] is_536_ = new byte[i_534_];
			for (int i_537_ = 0; i_537_ < i_534_; i_537_++) {
			    is_535_[i_537_]
				= class241_sub3.readBigSmart((byte) -27);
			    is_536_[i_537_]
				= class241_sub3.getByte(-1562093903);
			}
			anObjectArray7398[i_523_ + i_524_ * anInt7390]
			    = new Class241_Sub19(is_535_, is_536_);
		    }
		} else {
		    int[] is_538_ = null;
		    byte[] is_539_ = null;
		    if (i_534_ > 0) {
			is_538_ = new int[i_534_];
			is_539_ = new byte[i_534_];
			for (int i_540_ = 0; i_540_ < i_534_; i_540_++) {
			    is_538_[i_540_]
				= class241_sub3.readBigSmart((byte) -10);
			    is_539_[i_540_]
				= class241_sub3.getByte(-731985665);
			}
		    }
		    if ((aHashMapArrayArrayArray7411[i_530_ - 1]
			 [i - (anInt7388 >> 6)][i_522_ - (anInt7389 >> 6)])
			== null)
			aHashMapArrayArrayArray7411[i_530_ - 1]
			    [i - (anInt7388 >> 6)][i_522_ - (anInt7389 >> 6)]
			    = new HashMap();
		    int i_541_ = ((i_523_ & 0x3f) << 8) + (i_524_ & 0x3f);
		    Class575 class575
			= new Class575(i_523_ & 0x3f, i_524_ & 0x3f, i_531_,
				       i_532_, i_533_, is_538_, is_539_);
		    aHashMapArrayArrayArray7411[i_530_ - 1]
			[i - (anInt7388 >> 6)][i_522_ - (anInt7389 >> 6)]
			.put(Integer.valueOf(i_541_), class575);
		}
	    }
	}
    }
    
    static void method12620(Class103 class103, RSByteBuffer class241_sub3,
			    int i, int i_542_, int i_543_, int i_544_,
			    int[] is, int[] is_545_) {
	int i_546_ = class241_sub3.readUnsignedByte((byte) -49);
	if ((i_546_ & 0x1) == 0) {
	    boolean bool = (i_546_ & 0x2) == 0;
	    int i_547_ = i_546_ >> 2 & 0x3f;
	    if (i_547_ != 62) {
		if (i_547_ == 63)
		    i_547_ = class241_sub3.readUnsignedByte((byte) -23);
		else if (bool)
		    i_547_ = is[i_547_];
		else
		    i_547_ = is_545_[i_547_];
		if (bool) {
		    aByteArray7393[i_543_ + i_544_ * anInt7390]
			= (byte) i_547_;
		    aByteArray7396[i_543_ + i_544_ * anInt7390] = (byte) 0;
		} else {
		    aByteArray7396[i_543_ + i_544_ * anInt7390]
			= (byte) i_547_;
		    aByteArray7397[i_543_ + i_544_ * anInt7390] = (byte) 0;
		    aByteArray7393[i_543_ + i_544_ * anInt7390]
			= class241_sub3.getByte(-806405671);
		}
	    }
	} else {
	    int i_548_ = (i_546_ >> 1 & 0x3) + 1;
	    boolean bool = (i_546_ & 0x8) != 0;
	    boolean bool_549_ = (i_546_ & 0x10) != 0;
	    for (int i_550_ = 0; i_550_ < i_548_; i_550_++) {
		int i_551_ = class241_sub3.readUnsignedByte((byte) -33);
		int i_552_ = 0;
		int i_553_ = 0;
		if (bool) {
		    i_552_ = class241_sub3.readUnsignedByte((byte) 17);
		    i_553_ = class241_sub3.readUnsignedByte((byte) -48);
		}
		int i_554_ = 0;
		if (bool_549_)
		    i_554_ = class241_sub3.readUnsignedByte((byte) 7);
		if (i_550_ == 0) {
		    aByteArray7393[i_543_ + i_544_ * anInt7390]
			= (byte) i_551_;
		    aByteArray7396[i_543_ + i_544_ * anInt7390]
			= (byte) i_552_;
		    aByteArray7397[i_543_ + i_544_ * anInt7390]
			= (byte) i_553_;
		    if (i_554_ == 1) {
			anObjectArray7398[i_543_ + i_544_ * anInt7390]
			    = new Integer(class241_sub3
					      .readBigSmart((byte) 117));
			aByteArray7399[i_543_ + i_544_ * anInt7390]
			    = class241_sub3.getByte(-1916479714);
		    } else if (i_554_ > 1) {
			int[] is_555_ = new int[i_554_];
			byte[] is_556_ = new byte[i_554_];
			for (int i_557_ = 0; i_557_ < i_554_; i_557_++) {
			    is_555_[i_557_]
				= class241_sub3.readBigSmart((byte) 53);
			    is_556_[i_557_]
				= class241_sub3.getByte(-680073470);
			}
			anObjectArray7398[i_543_ + i_544_ * anInt7390]
			    = new Class241_Sub19(is_555_, is_556_);
		    }
		} else {
		    int[] is_558_ = null;
		    byte[] is_559_ = null;
		    if (i_554_ > 0) {
			is_558_ = new int[i_554_];
			is_559_ = new byte[i_554_];
			for (int i_560_ = 0; i_560_ < i_554_; i_560_++) {
			    is_558_[i_560_]
				= class241_sub3.readBigSmart((byte) -75);
			    is_559_[i_560_]
				= class241_sub3.getByte(1180974789);
			}
		    }
		    if ((aHashMapArrayArrayArray7411[i_550_ - 1]
			 [i - (anInt7388 >> 6)][i_542_ - (anInt7389 >> 6)])
			== null)
			aHashMapArrayArrayArray7411[i_550_ - 1]
			    [i - (anInt7388 >> 6)][i_542_ - (anInt7389 >> 6)]
			    = new HashMap();
		    int i_561_ = ((i_543_ & 0x3f) << 8) + (i_544_ & 0x3f);
		    Class575 class575
			= new Class575(i_543_ & 0x3f, i_544_ & 0x3f, i_551_,
				       i_552_, i_553_, is_558_, is_559_);
		    aHashMapArrayArrayArray7411[i_550_ - 1]
			[i - (anInt7388 >> 6)][i_542_ - (anInt7389 >> 6)]
			.put(Integer.valueOf(i_561_), class575);
		}
	    }
	}
    }
    
    static int method12621() {
	return (int) (64.0F * aFloat7402 / 2.0F);
    }
    
    static void method12622(int[] is, int i, int i_562_, int i_563_,
			    int i_564_, int i_565_, int i_566_) {
	for (int i_567_ = 0; i_567_ < aClass497_7374.anInt6528 * -1657349523;
	     i_567_++) {
	    int i_568_ = i_567_;
	    if (i_566_ == anInt7404 || i_566_ == anInt7406)
		i_568_ = aClass497_7374.anInt6528 * -1657349523 - i_567_ - 1;
	    for (int i_569_ = 0;
		 i_569_ < aClass497_7374.anInt6528 * -1657349523; i_569_++) {
		int i_570_ = i_569_;
		if (i_566_ == anInt7406 || i_566_ == anInt7368)
		    i_570_
			= aClass497_7374.anInt6528 * -1657349523 - i_569_ - 1;
		int i_571_ = anIntArrayArray7394[i_568_][i_570_];
		if (i_571_ != 0) {
		    if (i_571_ == 1) {
			int i_572_
			    = is[((i_563_ - i_562_ - i_569_ - 1) * i_563_ + i
				  + i_567_)];
			if (i_572_ != anInt7434) {
			    anInt7434 = i_572_;
			    anInt7400
				= (~0xffffff
				   | ((((aClass497_7374.anInt6541 * -1585524463
					 & 0xff00ff) * i_564_
					+ (i_572_ & 0xff00ff) * i_565_)
				       & ~0xff00ff)
				      + ((((aClass497_7374.anInt6541
					    * -1585524463)
					   & 0xff00) * i_564_
					  + (i_572_ & 0xff00) * i_565_)
					 & 0xff0000)) >> 8);
			}
			is[((i_563_ - i_562_ - i_569_ - 1) * i_563_ + i
			    + i_567_)]
			    = anInt7400;
		    } else if (i_571_ == 2)
			is[((i_563_ - i_562_ - i_569_ - 1) * i_563_ + i
			    + i_567_)]
			    = aClass497_7374.anInt6546 * 1174920463;
		}
	    }
	}
    }
    
    static void method12623(byte[] is, byte[] is_573_, short[] is_574_, int i,
			    int i_575_) {
	int[] is_576_ = new int[anInt7391];
	int[] is_577_ = new int[anInt7391];
	int[] is_578_ = new int[anInt7391];
	int[] is_579_ = new int[anInt7391];
	int[] is_580_ = new int[anInt7391];
	for (int i_581_ = -5; i_581_ < anInt7390; i_581_++) {
	    int i_582_ = i_581_ + 5;
	    int i_583_ = i_581_ - 5;
	    for (int i_584_ = 0; i_584_ < anInt7391; i_584_++) {
		if (i_582_ < anInt7390) {
		    int i_585_ = is[i_582_ + i_584_ * anInt7390] & 0xff;
		    if (i_585_ > 0) {
			Class415 class415
			    = aClass394_7385.method7057(i_585_ - 1,
							1005293245);
			is_576_[i_584_] += class415.anInt6001 * -1315419177;
			is_577_[i_584_] += class415.anInt6007 * -2071452791;
			is_578_[i_584_] += class415.anInt6002 * -1150999567;
			is_579_[i_584_] += class415.anInt6008 * 555035583;
			is_580_[i_584_]++;
		    }
		}
		if (i_583_ >= 0) {
		    int i_586_ = is[i_583_ + i_584_ * anInt7390] & 0xff;
		    if (i_586_ > 0) {
			Class415 class415
			    = aClass394_7385.method7057(i_586_ - 1,
							1005293245);
			is_576_[i_584_] -= class415.anInt6001 * -1315419177;
			is_577_[i_584_] -= class415.anInt6007 * -2071452791;
			is_578_[i_584_] -= class415.anInt6002 * -1150999567;
			is_579_[i_584_] -= class415.anInt6008 * 555035583;
			is_580_[i_584_]--;
		    }
		}
	    }
	    if (i_581_ >= 0) {
		int i_587_ = 0;
		int i_588_ = 0;
		int i_589_ = 0;
		int i_590_ = 0;
		int i_591_ = 0;
		for (int i_592_ = -5; i_592_ < anInt7391; i_592_++) {
		    int i_593_ = i_592_ + 5;
		    if (i_593_ < anInt7391) {
			i_587_ += is_576_[i_593_];
			i_588_ += is_577_[i_593_];
			i_589_ += is_578_[i_593_];
			i_590_ += is_579_[i_593_];
			i_591_ += is_580_[i_593_];
		    }
		    int i_594_ = i_592_ - 5;
		    if (i_594_ >= 0) {
			i_587_ -= is_576_[i_594_];
			i_588_ -= is_577_[i_594_];
			i_589_ -= is_578_[i_594_];
			i_590_ -= is_579_[i_594_];
			i_591_ -= is_580_[i_594_];
		    }
		    if (i_592_ >= 0 && i_591_ > 0) {
			if ((is[i_581_ + i_592_ * anInt7390] & 0xff) == 0) {
			    int i_595_ = i_581_ + i_592_ * anInt7390;
			    is_573_[i_595_] = (byte) 0;
			    is_574_[i_595_] = (short) 0;
			} else {
			    int i_596_
				= (i_590_ == 0 ? 0
				   : Class558.method12325((i_587_ * 256
							   / i_590_),
							  i_588_ / i_591_,
							  i_589_ / i_591_,
							  (byte) -27));
			    int i_597_ = (i_596_ & 0x7f) + i_575_;
			    if (i_597_ < 0)
				i_597_ = 0;
			    else if (i_597_ > 127)
				i_597_ = 127;
			    int i_598_ = ((i_596_ + i & 0xfc00)
					  + (i_596_ & 0x380) + i_597_);
			    int i_599_ = i_581_ + i_592_ * anInt7390;
			    int i_600_ = (Class474.anIntArray6382
					  [(Class241_Sub42.method16451
					    (Class426.method7580(i_598_, 96,
								 (byte) 4),
					     550282606)) & 0xffff]);
			    is_573_[i_599_] = (byte) (i_600_ >> 16 & 0xff);
			    is_574_[i_599_] = (short) (i_600_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    static void method12624(byte[] is, byte[] is_601_, short[] is_602_, int i,
			    int i_603_) {
	int[] is_604_ = new int[anInt7391];
	int[] is_605_ = new int[anInt7391];
	int[] is_606_ = new int[anInt7391];
	int[] is_607_ = new int[anInt7391];
	int[] is_608_ = new int[anInt7391];
	for (int i_609_ = -5; i_609_ < anInt7390; i_609_++) {
	    int i_610_ = i_609_ + 5;
	    int i_611_ = i_609_ - 5;
	    for (int i_612_ = 0; i_612_ < anInt7391; i_612_++) {
		if (i_610_ < anInt7390) {
		    int i_613_ = is[i_610_ + i_612_ * anInt7390] & 0xff;
		    if (i_613_ > 0) {
			Class415 class415
			    = aClass394_7385.method7057(i_613_ - 1,
							1005293245);
			is_604_[i_612_] += class415.anInt6001 * -1315419177;
			is_605_[i_612_] += class415.anInt6007 * -2071452791;
			is_606_[i_612_] += class415.anInt6002 * -1150999567;
			is_607_[i_612_] += class415.anInt6008 * 555035583;
			is_608_[i_612_]++;
		    }
		}
		if (i_611_ >= 0) {
		    int i_614_ = is[i_611_ + i_612_ * anInt7390] & 0xff;
		    if (i_614_ > 0) {
			Class415 class415
			    = aClass394_7385.method7057(i_614_ - 1,
							1005293245);
			is_604_[i_612_] -= class415.anInt6001 * -1315419177;
			is_605_[i_612_] -= class415.anInt6007 * -2071452791;
			is_606_[i_612_] -= class415.anInt6002 * -1150999567;
			is_607_[i_612_] -= class415.anInt6008 * 555035583;
			is_608_[i_612_]--;
		    }
		}
	    }
	    if (i_609_ >= 0) {
		int i_615_ = 0;
		int i_616_ = 0;
		int i_617_ = 0;
		int i_618_ = 0;
		int i_619_ = 0;
		for (int i_620_ = -5; i_620_ < anInt7391; i_620_++) {
		    int i_621_ = i_620_ + 5;
		    if (i_621_ < anInt7391) {
			i_615_ += is_604_[i_621_];
			i_616_ += is_605_[i_621_];
			i_617_ += is_606_[i_621_];
			i_618_ += is_607_[i_621_];
			i_619_ += is_608_[i_621_];
		    }
		    int i_622_ = i_620_ - 5;
		    if (i_622_ >= 0) {
			i_615_ -= is_604_[i_622_];
			i_616_ -= is_605_[i_622_];
			i_617_ -= is_606_[i_622_];
			i_618_ -= is_607_[i_622_];
			i_619_ -= is_608_[i_622_];
		    }
		    if (i_620_ >= 0 && i_619_ > 0) {
			if ((is[i_609_ + i_620_ * anInt7390] & 0xff) == 0) {
			    int i_623_ = i_609_ + i_620_ * anInt7390;
			    is_601_[i_623_] = (byte) 0;
			    is_602_[i_623_] = (short) 0;
			} else {
			    int i_624_
				= (i_618_ == 0 ? 0
				   : Class558.method12325((i_615_ * 256
							   / i_618_),
							  i_616_ / i_619_,
							  i_617_ / i_619_,
							  (byte) -11));
			    int i_625_ = (i_624_ & 0x7f) + i_603_;
			    if (i_625_ < 0)
				i_625_ = 0;
			    else if (i_625_ > 127)
				i_625_ = 127;
			    int i_626_ = ((i_624_ + i & 0xfc00)
					  + (i_624_ & 0x380) + i_625_);
			    int i_627_ = i_609_ + i_620_ * anInt7390;
			    int i_628_ = (Class474.anIntArray6382
					  [(Class241_Sub42.method16451
					    (Class426.method7580(i_626_, 96,
								 (byte) 4),
					     -1431369827)) & 0xffff]);
			    is_601_[i_627_] = (byte) (i_628_ >> 16 & 0xff);
			    is_602_[i_627_] = (short) (i_628_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    Class573() throws Throwable {
	throw new Error();
    }
    
    static boolean method12625(int i, int i_629_) {
	int i_630_ = i >> 3;
	int i_631_ = i_629_ >> 3;
	if (i_630_ < 0 || i_631_ < 0 || i_630_ >= aBoolArrayArray7435.length
	    || i_631_ >= aBoolArrayArray7435[i_630_].length)
	    return false;
	return aBoolArrayArray7435[i_630_][i_631_];
    }
    
    static void method12626() {
	int[] is = new int[3];
	for (int i = 0; i < aClass564_7386.anInt7308 * 81284827; i++) {
	    boolean bool = (aClass241_Sub39_Sub12_7405.method17257
			    (aClass564_7386.anIntArray7306[i] >> 28 & 0x3,
			     aClass564_7386.anIntArray7306[i] >> 14 & 0x3fff,
			     aClass564_7386.anIntArray7306[i] & 0x3fff, is,
			     1492408917));
	    if (bool) {
		Class241_Sub41 class241_sub41
		    = new Class241_Sub41(aClass564_7386.anIntArray7307[i]);
		class241_sub41.anInt10154 = (is[1] - anInt7388) * 415135197;
		class241_sub41.anInt10152 = (is[2] - anInt7389) * -271238053;
		aClass429_7387.addNode(class241_sub41, (short) -15536);
	    }
	}
    }
    
    static void method12627(int i, int i_632_, int i_633_, int i_634_,
			    int i_635_, int i_636_, int i_637_, int i_638_) {
	anInt7426 = i - anInt7388;
	anInt7427 = i_632_ - anInt7389;
	anInt7428 = i_633_ - anInt7388;
	anInt7429 = i_634_ - anInt7389;
	anInt7430 = i_635_;
	anInt7431 = i_636_;
	anInt7395 = i_637_;
	anInt7425 = i_638_;
    }
    
    static void method12628(int i, int i_639_, int i_640_, int i_641_,
			    boolean bool, boolean bool_642_, boolean bool_643_,
			    Class103 class103) {
	int i_644_ = i * 64;
	int i_645_ = i_639_ * 64;
	if (anIntArray7418 == null || anIntArray7418.length != i_640_ * i_640_)
	    anIntArray7418 = new int[i_640_ * i_640_];
	boolean bool_646_ = aBool7432 && !bool_643_;
	for (int i_647_ = 0; i_647_ < 64; i_647_++) {
	    int i_648_ = i_644_ + i_647_;
	    int i_649_ = i_647_ * i_640_ / 64;
	    int i_650_ = (i_647_ + 1) * i_640_ / 64 - 1;
	    if (i_650_ < i_649_)
		i_650_ = i_649_;
	    for (int i_651_ = 0; i_651_ < 64; i_651_++) {
		int i_652_ = i_645_ + i_651_;
		boolean bool_653_ = bool;
		if (bool_646_ && !method12625(i_648_, i_652_))
		    bool_653_ = false;
		int i_654_ = i_648_ + i_652_ * anInt7390;
		boolean bool_655_ = false;
		boolean bool_656_ = false;
		Object object = null;
		int i_657_ = ((aByteArray7378[i_654_] & 0xff) << 16
			      | aShortArray7369[i_654_] & 0xffff);
		if (i_657_ != 0)
		    i_657_ |= ~0xffffff;
		int i_658_ = aByteArray7396[i_654_] & 0xff;
		object = anObjectArray7398[i_654_];
		int i_659_ = i_651_ * i_640_ / 64;
		int i_660_ = (i_651_ + 1) * i_640_ / 64 - 1;
		if (i_660_ < i_659_)
		    i_660_ = i_659_;
		if (object != null) {
		    if (object instanceof Class241_Sub19) {
			Class241_Sub19 class241_sub19
			    = (Class241_Sub19) object;
			if (class241_sub19 != null)
			    method12574(anIntArray7418, i_649_, i_650_, i_659_,
					i_660_, i_640_, bool_653_, i_657_,
					i_658_, aByteArray7397[i_654_],
					(((Class241_Sub19) class241_sub19)
					 .anIntArray8997),
					(((Class241_Sub19) class241_sub19)
					 .aByteArray8998),
					true);
		    } else {
			Integer integer = (Integer) object;
			anIntArray7382[0] = integer.intValue();
			aByteArray7383[0] = aByteArray7399[i_654_];
			method12574(anIntArray7418, i_649_, i_650_, i_659_,
				    i_660_, i_640_, bool_653_, i_657_, i_658_,
				    aByteArray7397[i_654_], anIntArray7382,
				    aByteArray7383, true);
		    }
		} else
		    method12574(anIntArray7418, i_649_, i_650_, i_659_, i_660_,
				i_640_, bool_653_, i_657_, i_658_,
				aByteArray7397[i_654_], null, null, true);
	    }
	}
	if (bool_642_) {
	    for (int i_661_ = 0; i_661_ < 64; i_661_++) {
		int i_662_ = i_644_ + i_661_;
		boolean bool_663_ = i_661_ == 0 && i_662_ != 0;
		for (int i_664_ = 0; i_664_ < 64; i_664_++) {
		    int i_665_ = i_645_ + i_664_;
		    if (!bool_646_ || method12625(i_662_, i_665_)) {
			boolean bool_666_ = i_664_ == 0 && i_665_ != 0;
			int i_667_ = i_662_ + i_665_ * anInt7390;
			if (bool_663_ && bool_666_)
			    method12575(class103, anIntArray7418, i_640_, -1,
					-1, i_662_ - 1, i_665_ - 1,
					i_667_ - 1 - anInt7390);
			if (bool_663_)
			    method12575(class103, anIntArray7418, i_640_, -1,
					i_664_, i_662_ - 1, i_665_,
					i_667_ - 1);
			if (bool_666_)
			    method12575(class103, anIntArray7418, i_640_,
					i_661_, -1, i_662_, i_665_ - 1,
					i_667_ - anInt7390);
			method12575(class103, anIntArray7418, i_640_, i_661_,
				    i_664_, i_662_, i_665_, i_667_);
		    }
		}
	    }
	}
	int i_668_ = i * 64 / 64;
	int i_669_ = i_639_ * 64 / 64;
	for (int i_670_ = 0; i_670_ < 3; i_670_++) {
	    for (int i_671_ = 0; i_671_ < 64; i_671_++) {
		int i_672_ = i_644_ + i_671_;
		int i_673_ = i_672_ & 0x3f;
		int i_674_ = i_671_ * i_640_ / 64;
		int i_675_ = (i_671_ + 1) * i_640_ / 64 - 1;
		if (i_675_ < i_674_)
		    i_675_ = i_674_;
		for (int i_676_ = 0; i_676_ < 64; i_676_++) {
		    int i_677_ = i_645_ + i_676_;
		    boolean bool_678_ = bool;
		    if (bool_646_ && !method12625(i_672_, i_677_))
			bool_678_ = false;
		    int i_679_ = i_677_ & 0x3f;
		    int i_680_ = i_676_ * i_640_ / 64;
		    int i_681_ = (i_676_ + 1) * i_640_ / 64 - 1;
		    if (i_681_ < i_680_)
			i_681_ = i_680_;
		    HashMap hashmap
			= aHashMapArrayArrayArray7411[i_670_][i_668_][i_669_];
		    if (hashmap != null) {
			Class575 class575
			    = ((Class575)
			       hashmap.get(Integer.valueOf((i_673_ << 8)
							   + i_679_)));
			if (class575 != null)
			    method12574(anIntArray7418, i_674_, i_675_, i_680_,
					i_681_, i_640_, bool_678_,
					((Class575) class575).anInt7441,
					((Class575) class575).aByte7440 & 0xff,
					((Class575) class575).aByte7439,
					((Class575) class575).anIntArray7442,
					((Class575) class575).aByteArray7437,
					false);
		    }
		}
	    }
	    for (int i_682_ = 0; i_682_ < 64; i_682_++) {
		int i_683_ = i_644_ + i_682_;
		int i_684_ = i_683_ & 0x3f;
		for (int i_685_ = 0; i_685_ < 64; i_685_++) {
		    int i_686_ = i_645_ + i_685_;
		    if (!bool_646_ || method12625(i_683_, i_686_)) {
			int i_687_ = i_686_ & 0x3f;
			HashMap hashmap = (aHashMapArrayArrayArray7411[i_670_]
					   [i_668_][i_669_]);
			if (hashmap != null) {
			    Class575 class575
				= ((Class575)
				   hashmap.get(Integer.valueOf((i_684_ << 8)
							       + i_687_)));
			    if (class575 != null)
				method12576(class103, anIntArray7418, i_640_,
					    i_682_, i_685_,
					    (((Class575) class575)
					     .anIntArray7442),
					    (((Class575) class575)
					     .aByteArray7437));
			}
		    }
		}
	    }
	}
	if (bool_646_) {
	    int i_688_ = 8;
	    for (int i_689_ = 0; i_689_ < i_688_; i_689_++) {
		int i_690_ = i_644_ + i_689_ * 8;
		int i_691_ = i_689_ * i_640_ / i_688_;
		int i_692_ = (i_689_ + 1) * i_640_ / i_688_ - 1;
		for (int i_693_ = 0; i_693_ < i_688_; i_693_++) {
		    int i_694_ = i_645_ + i_693_ * 8;
		    if (!method12625(i_690_, i_694_)) {
			int i_695_ = i_693_ * i_640_ / i_688_;
			int i_696_ = (i_693_ + 1) * i_640_ / i_688_ - 1;
			if (i_640_ < 64)
			    method12562(anIntArray7418, i_691_, i_692_, i_695_,
					i_696_, i_640_);
			else {
			    aBoolArray7422[anInt7403]
				= method12625(i_690_, i_694_ + 8);
			    aBoolArray7422[anInt7404]
				= method12625(i_690_ + 8, i_694_ + 8);
			    aBoolArray7422[anInt7379]
				= method12625(i_690_ + 8, i_694_);
			    aBoolArray7422[anInt7406]
				= method12625(i_690_ + 8, i_694_ - 8);
			    aBoolArray7422[anInt7407]
				= method12625(i_690_, i_694_ - 8);
			    aBoolArray7422[anInt7368]
				= method12625(i_690_ - 8, i_694_ - 8);
			    aBoolArray7422[anInt7409]
				= method12625(i_690_ - 8, i_694_);
			    aBoolArray7422[anInt7410]
				= method12625(i_690_ - 8, i_694_ + 8);
			    method12585(anIntArray7418, i_691_, i_692_, i_695_,
					i_696_, i_640_);
			}
		    }
		}
	    }
	}
	aClass129_7414.put(class103.method2287(anIntArray7418, 0,
						      i_640_, i_640_, i_640_,
						      true),
				  (long) i_641_);
    }
    
    static void method12629(int i, int i_697_, int i_698_, int i_699_,
			    int i_700_, int i_701_, int i_702_, int i_703_) {
	anInt7426 = i - anInt7388;
	anInt7427 = i_697_ - anInt7389;
	anInt7428 = i_698_ - anInt7388;
	anInt7429 = i_699_ - anInt7389;
	anInt7430 = i_700_;
	anInt7431 = i_701_;
	anInt7395 = i_702_;
	anInt7425 = i_703_;
    }
    
    static void method12630(Class103 class103, boolean bool, boolean bool_704_,
			    boolean bool_705_, boolean bool_706_) {
	int i = anInt7428 - anInt7426;
	int i_707_ = anInt7427 - anInt7429;
	int i_708_ = (anInt7395 - anInt7430 << 16) / i;
	int i_709_ = (anInt7425 - anInt7431 << 16) / i_707_;
	method12571(class103, bool, bool_704_, i_708_, i_709_, 0, 0, bool_705_,
		    bool_706_);
    }
    
    static void method12631(Class103 class103, boolean bool, boolean bool_710_,
			    int i, int i_711_, int i_712_, int i_713_,
			    boolean bool_714_, boolean bool_715_) {
	int i_716_ = anInt7428 - anInt7426;
	int i_717_ = anInt7427 - anInt7429;
	if (anInt7428 < anInt7390)
	    i_716_++;
	if (anInt7427 < anInt7391)
	    i_717_++;
	int i_718_ = anInt7426 / 64;
	int i_719_ = anInt7429 / 64;
	int i_720_ = (anInt7426 + i_716_) / 64;
	int i_721_ = (anInt7429 + i_717_) / 64;
	int i_722_;
	int i_723_;
	if (bool_715_) {
	    i_722_ = (anInt7395 - anInt7430) / ((anInt7428 - anInt7426) / 64);
	    i_723_ = i_722_;
	} else {
	    i_722_ = method12621();
	    i_723_ = (int) Math.ceil((double) (64.0F * aFloat7408 / 2.0F));
	}
	anArrayList7416.clear();
	int i_724_ = 0;
	int i_725_ = i_722_ * i_722_;
	for (int i_726_ = i_718_; i_726_ <= i_720_; i_726_++) {
	    for (int i_727_ = i_719_; i_727_ <= i_721_; i_727_++) {
		int i_728_ = (i_726_ << 16) + i_727_;
		int i_729_ = method12588((long) i_728_);
		if (i_729_ != i_722_) {
		    if (i_726_ < 0 || i_726_ * 64 >= anInt7390 || i_727_ < 0
			|| i_727_ * 64 >= anInt7391)
			method12634(class103, i_726_, i_727_, i_722_, i_728_);
		    else if (i_729_ == -1) {
			method12573(i_726_, i_727_, i_722_, i_728_, bool,
				    bool_710_, bool_714_, class103);
			i_724_ += i_725_;
		    } else
			anArrayList7416.add(Integer.valueOf(i_728_));
		}
	    }
	}
	if (!anArrayList7416.isEmpty() && i_724_ < anInt7415) {
	    for (Iterator iterator = anArrayList7416.iterator();
		 i_724_ < anInt7415 && iterator.hasNext(); i_724_ += i_725_) {
		int i_730_ = ((Integer) iterator.next()).intValue();
		int i_731_ = i_730_ >> 16 & 0xffff;
		int i_732_ = i_730_ & 0xffff;
		method12573(i_731_, i_732_, i_722_, i_730_, bool, bool_710_,
			    bool_714_, class103);
	    }
	}
	for (int i_733_ = i_718_; i_733_ <= i_720_; i_733_++) {
	    int i_734_ = i_733_ * 64;
	    int i_735_ = i_734_ - anInt7426;
	    int i_736_ = i_723_;
	    int i_737_ = (i_712_ + i * i_735_ >> 16) + anInt7430;
	    int i_738_ = (i_712_ + i * (i_735_ + 64) >> 16) + anInt7430;
	    if (i_737_ + i_736_ != i_738_)
		i_736_ = i_738_ - i_737_;
	    for (int i_739_ = i_719_; i_739_ <= i_721_; i_739_++) {
		int i_740_ = i_739_ * 64;
		int i_741_ = i_740_ - anInt7429;
		int i_742_ = (i_733_ << 16) + i_739_;
		int i_743_ = i_723_;
		int i_744_ = anInt7425 - (i_713_ + i_711_ * i_741_ >> 16);
		int i_745_
		    = anInt7425 - (i_713_ + i_711_ * (i_741_ + 64) >> 16);
		if (i_744_ - i_743_ != i_745_)
		    i_743_ = i_744_ - i_745_;
		i_744_ -= i_743_;
		Class168 class168
		    = (Class168) aClass129_7414.get((long) i_742_);
		if (class168 == null)
		    throw new RuntimeException();
		if (class168.method3631() == i_736_
		    && class168.method3606() == i_743_)
		    class168.method3646(i_737_, i_744_);
		else
		    class168.method3614(i_737_, i_744_, i_736_, i_743_);
	    }
	}
    }
    
    static void method12632(Class103 class103, boolean bool, boolean bool_746_,
			    int i, int i_747_, int i_748_, int i_749_,
			    boolean bool_750_, boolean bool_751_) {
	int i_752_ = anInt7428 - anInt7426;
	int i_753_ = anInt7427 - anInt7429;
	if (anInt7428 < anInt7390)
	    i_752_++;
	if (anInt7427 < anInt7391)
	    i_753_++;
	int i_754_ = anInt7426 / 64;
	int i_755_ = anInt7429 / 64;
	int i_756_ = (anInt7426 + i_752_) / 64;
	int i_757_ = (anInt7429 + i_753_) / 64;
	int i_758_;
	int i_759_;
	if (bool_751_) {
	    i_758_ = (anInt7395 - anInt7430) / ((anInt7428 - anInt7426) / 64);
	    i_759_ = i_758_;
	} else {
	    i_758_ = method12621();
	    i_759_ = (int) Math.ceil((double) (64.0F * aFloat7408 / 2.0F));
	}
	anArrayList7416.clear();
	int i_760_ = 0;
	int i_761_ = i_758_ * i_758_;
	for (int i_762_ = i_754_; i_762_ <= i_756_; i_762_++) {
	    for (int i_763_ = i_755_; i_763_ <= i_757_; i_763_++) {
		int i_764_ = (i_762_ << 16) + i_763_;
		int i_765_ = method12588((long) i_764_);
		if (i_765_ != i_758_) {
		    if (i_762_ < 0 || i_762_ * 64 >= anInt7390 || i_763_ < 0
			|| i_763_ * 64 >= anInt7391)
			method12634(class103, i_762_, i_763_, i_758_, i_764_);
		    else if (i_765_ == -1) {
			method12573(i_762_, i_763_, i_758_, i_764_, bool,
				    bool_746_, bool_750_, class103);
			i_760_ += i_761_;
		    } else
			anArrayList7416.add(Integer.valueOf(i_764_));
		}
	    }
	}
	if (!anArrayList7416.isEmpty() && i_760_ < anInt7415) {
	    for (Iterator iterator = anArrayList7416.iterator();
		 i_760_ < anInt7415 && iterator.hasNext(); i_760_ += i_761_) {
		int i_766_ = ((Integer) iterator.next()).intValue();
		int i_767_ = i_766_ >> 16 & 0xffff;
		int i_768_ = i_766_ & 0xffff;
		method12573(i_767_, i_768_, i_758_, i_766_, bool, bool_746_,
			    bool_750_, class103);
	    }
	}
	for (int i_769_ = i_754_; i_769_ <= i_756_; i_769_++) {
	    int i_770_ = i_769_ * 64;
	    int i_771_ = i_770_ - anInt7426;
	    int i_772_ = i_759_;
	    int i_773_ = (i_748_ + i * i_771_ >> 16) + anInt7430;
	    int i_774_ = (i_748_ + i * (i_771_ + 64) >> 16) + anInt7430;
	    if (i_773_ + i_772_ != i_774_)
		i_772_ = i_774_ - i_773_;
	    for (int i_775_ = i_755_; i_775_ <= i_757_; i_775_++) {
		int i_776_ = i_775_ * 64;
		int i_777_ = i_776_ - anInt7429;
		int i_778_ = (i_769_ << 16) + i_775_;
		int i_779_ = i_759_;
		int i_780_ = anInt7425 - (i_749_ + i_747_ * i_777_ >> 16);
		int i_781_
		    = anInt7425 - (i_749_ + i_747_ * (i_777_ + 64) >> 16);
		if (i_780_ - i_779_ != i_781_)
		    i_779_ = i_780_ - i_781_;
		i_780_ -= i_779_;
		Class168 class168
		    = (Class168) aClass129_7414.get((long) i_778_);
		if (class168 == null)
		    throw new RuntimeException();
		if (class168.method3631() == i_772_
		    && class168.method3606() == i_779_)
		    class168.method3646(i_773_, i_780_);
		else
		    class168.method3614(i_773_, i_780_, i_772_, i_779_);
	    }
	}
    }
    
    static void method12633(Class103 class103, int i, int i_782_, int i_783_,
			    int i_784_) {
	Class168 class168 = (Class168) aClass129_7414.get(-1L);
	if (class168 == null || class168.method3631() != i_783_) {
	    int i_785_;
	    if ((((Class241_Sub39_Sub12) aClass241_Sub39_Sub12_7405).anInt10926
		 * 1256631897)
		!= -1)
		i_785_ = ~0xffffff | (((Class241_Sub39_Sub12)
				       aClass241_Sub39_Sub12_7405).anInt10926
				      * 1256631897);
	    else
		i_785_ = -16777216;
	    if (anIntArray7418 == null
		|| anIntArray7418.length != i_783_ * i_783_)
		anIntArray7418 = new int[i_783_ * i_783_];
	    Arrays.fill(anIntArray7418, i_785_);
	    class168 = class103.method2287(anIntArray7418, 0, i_783_, i_783_,
					   i_783_, true);
	    aClass129_7414.put(class168, -1L);
	}
	aClass129_7414.put(class168, (long) i_784_);
    }
    
    static void method12634(Class103 class103, int i, int i_786_, int i_787_,
			    int i_788_) {
	Class168 class168 = (Class168) aClass129_7414.get(-1L);
	if (class168 == null || class168.method3631() != i_787_) {
	    int i_789_;
	    if ((((Class241_Sub39_Sub12) aClass241_Sub39_Sub12_7405).anInt10926
		 * 1256631897)
		!= -1)
		i_789_ = ~0xffffff | (((Class241_Sub39_Sub12)
				       aClass241_Sub39_Sub12_7405).anInt10926
				      * 1256631897);
	    else
		i_789_ = -16777216;
	    if (anIntArray7418 == null
		|| anIntArray7418.length != i_787_ * i_787_)
		anIntArray7418 = new int[i_787_ * i_787_];
	    Arrays.fill(anIntArray7418, i_789_);
	    class168 = class103.method2287(anIntArray7418, 0, i_787_, i_787_,
					   i_787_, true);
	    aClass129_7414.put(class168, -1L);
	}
	aClass129_7414.put(class168, (long) i_788_);
    }
    
    static void method12635(int[] is, int i, int i_790_, int i_791_,
			    int i_792_, int i_793_, boolean bool, int i_794_,
			    int i_795_, int i_796_, int[] is_797_,
			    byte[] is_798_, boolean bool_799_) {
	if (bool_799_ || i_794_ != 0 || i_795_ > 0) {
	    if (i_795_ == 0)
		method12614(is, i, i_790_, i_791_, i_792_, i_793_,
			    i_794_ | ~0xffffff);
	    else {
		int i_800_ = i_796_ & 0x3f;
		if (i_800_ == 0 || anInt7381 == 0) {
		    int i_801_ = anIntArray7392[i_795_];
		    if (bool_799_ || i_801_ != 0)
			method12614(is, i, i_790_, i_791_, i_792_, i_793_,
				    i_801_ | ~0xffffff);
		} else {
		    int i_802_ = bool_799_ ? 0 : 1;
		    int i_803_ = Class274.method5338(i_796_ >> 6 & 0x3, i_800_,
						     121442101);
		    i_800_ = Class388.method6959(i_800_, 1129280099);
		    method12589(is, i, i_790_, i_791_, i_792_, i_793_, i_794_,
				anIntArray7392[i_795_],
				aByteArrayArrayArray7380[i_800_ - 1][i_803_],
				anInt7381, i_802_);
		}
	    }
	}
	if (bool && is_797_ != null) {
	    int i_804_ = i_790_ - i + 1;
	    int i_805_ = i_792_ - i_791_ + 1;
	    for (int i_806_ = 0; i_806_ < is_797_.length; i_806_++) {
		int i_807_ = is_798_[i_806_] & 0x3f;
		if (i_807_ == Class527.aClass527_6932.anInt6931 * -2030829961
		    || (i_807_
			== Class527.aClass527_6910.anInt6931 * -2030829961)
		    || (i_807_
			== Class527.aClass527_6916.anInt6931 * -2030829961)
		    || (i_807_
			== Class527.aClass527_6912.anInt6931 * -2030829961)) {
		    ObjectDefinition class526
			= aClass532_7421.getObjectDefinition(is_797_[i_806_],
						     577892407);
		    if (class526.anInt6864 * -1848119147 == -1) {
			int i_808_ = -3355444;
			if (class526.anInt6848 * -1389471035 == 1)
			    i_808_ = -3407872;
			int i_809_ = is_798_[i_806_] >> 6 & 0x3;
			if (i_807_ == (Class527.aClass527_6932.anInt6931
				       * -2030829961)) {
			    if (i_809_ == 0)
				method12591(is, i, i_792_, i_805_, i_793_,
					    i_808_);
			    else if (i_809_ == 1)
				method12590(is, i, i_792_, i_804_, i_793_,
					    i_808_);
			    else if (i_809_ == 2)
				method12591(is, i_790_, i_792_, i_805_, i_793_,
					    i_808_);
			    else
				method12590(is, i, i_791_, i_804_, i_793_,
					    i_808_);
			} else if (i_807_ == (Class527.aClass527_6910.anInt6931
					      * -2030829961)) {
			    if (i_809_ == 0) {
				method12591(is, i, i_792_, i_805_, i_793_, -1);
				method12590(is, i, i_792_, i_804_, i_793_,
					    i_808_);
			    } else if (i_809_ == 1) {
				method12591(is, i_790_, i_792_, i_805_, i_793_,
					    -1);
				method12590(is, i, i_792_, i_804_, i_793_,
					    i_808_);
			    } else if (i_809_ == 2) {
				method12591(is, i_790_, i_792_, i_805_, i_793_,
					    -1);
				method12590(is, i, i_791_, i_804_, i_793_,
					    i_808_);
			    } else {
				method12591(is, i, i_792_, i_805_, i_793_, -1);
				method12590(is, i, i_791_, i_804_, i_793_,
					    i_808_);
			    }
			} else if (i_807_ == (Class527.aClass527_6916.anInt6931
					      * -2030829961)) {
			    if (i_809_ == 0)
				method12590(is, i, i_792_, 1, i_793_, i_808_);
			    else if (i_809_ == 1)
				method12590(is, i_790_, i_792_, 1, i_793_,
					    i_808_);
			    else if (i_809_ == 2)
				method12590(is, i_790_, i_791_, 1, i_793_,
					    i_808_);
			    else
				method12590(is, i, i_791_, 1, i_793_, i_808_);
			} else if (i_807_ == (Class527.aClass527_6912.anInt6931
					      * -2030829961)) {
			    if (i_809_ == 0 || i_809_ == 2) {
				for (int i_810_ = 0; i_810_ < i_805_; i_810_++)
				    method12590(is, i + i_810_,
						i_791_ + i_810_, 1, i_793_,
						i_808_);
			    } else {
				for (int i_811_ = 0; i_811_ < i_805_; i_811_++)
				    method12590(is, i + i_811_,
						i_792_ - i_811_, 1, i_793_,
						i_808_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method12636(Class103 class103, int[] is, int i, int i_812_,
			    int i_813_, int i_814_, int i_815_, int i_816_) {
	Object object = anObjectArray7398[i_816_];
	if (object != null) {
	    if (object instanceof Class241_Sub19) {
		Class241_Sub19 class241_sub19 = (Class241_Sub19) object;
		if (class241_sub19 != null)
		    method12576(class103, is, i, i_812_, i_813_,
				(((Class241_Sub19) class241_sub19)
				 .anIntArray8997),
				(((Class241_Sub19) class241_sub19)
				 .aByteArray8998));
	    } else {
		Integer integer = (Integer) object;
		anIntArray7382[0] = integer.intValue();
		aByteArray7383[0]
		    = aByteArray7399[i_814_ + i_815_ * anInt7390];
		method12576(class103, is, i, i_812_, i_813_, anIntArray7382,
			    aByteArray7383);
	    }
	}
    }
    
    static void method12637(Class103 class103, int[] is, int i, int i_817_,
			    int i_818_, int i_819_, int i_820_, int i_821_) {
	Object object = anObjectArray7398[i_821_];
	if (object != null) {
	    if (object instanceof Class241_Sub19) {
		Class241_Sub19 class241_sub19 = (Class241_Sub19) object;
		if (class241_sub19 != null)
		    method12576(class103, is, i, i_817_, i_818_,
				(((Class241_Sub19) class241_sub19)
				 .anIntArray8997),
				(((Class241_Sub19) class241_sub19)
				 .aByteArray8998));
	    } else {
		Integer integer = (Integer) object;
		anIntArray7382[0] = integer.intValue();
		aByteArray7383[0]
		    = aByteArray7399[i_819_ + i_820_ * anInt7390];
		method12576(class103, is, i, i_817_, i_818_, anIntArray7382,
			    aByteArray7383);
	    }
	}
    }
    
    static void method12638(Class103 class103, int[] is, int i, int i_822_,
			    int i_823_, int[] is_824_, byte[] is_825_) {
	if (is_824_ != null) {
	    for (int i_826_ = 0; i_826_ < is_824_.length; i_826_++) {
		ObjectDefinition class526
		    = aClass532_7421.getObjectDefinition(is_824_[i_826_], 577892407);
		int i_827_ = class526.anInt6864 * -1848119147;
		if (i_827_ != -1) {
		    Class601 class601
			= aClass598_7436.method13117(i_827_, 726813829);
		    Class168 class168
			= class601.method13157(class103,
					       (class526.aBool6865
						? is_825_[i_826_] >> 6 & 0x3
						: 0),
					       (class526.aBool6867
						? class526.aBool6868 : false),
					       (byte) -24);
		    int[] is_828_
			= class601.method13155(class103,
					       (class526.aBool6865
						? is_825_[i_826_] >> 6 & 0x3
						: 0),
					       (class526.aBool6867
						? class526.aBool6868 : false),
					       (byte) 0);
		    if (class168 != null) {
			int i_829_ = class168.method64();
			int i_830_ = class168.method3616();
			int i_831_ = i * i_829_ / 64 >> 2;
			int i_832_ = i * i_830_ / 64 >> 2;
			if (class601.aBool7726) {
			    int i_833_ = class526.sizeX * 1351092869;
			    int i_834_ = class526.sizeY * 333584223;
			    if ((is_825_[i_826_] >> 6 & 0x1) == 1) {
				int i_835_ = i_833_;
				i_833_ = i_834_;
				i_834_ = i_835_;
			    }
			    i_831_ = i_833_ * i / 64;
			    i_832_ = i_834_ * i / 64;
			}
			if (i_831_ != 0 && i_832_ != 0) {
			    int i_836_ = i_822_ * i / 64;
			    int i_837_ = (64 - i_823_) * i / 64 - i_832_ + 1;
			    for (int i_838_ = 0; i_838_ < i_831_; i_838_++) {
				int i_839_ = i_838_ + i_836_;
				if (i_839_ >= 0) {
				    if (i_839_ >= i)
					break;
				    for (int i_840_ = 0; i_840_ < i_832_;
					 i_840_++) {
					int i_841_ = i_840_ + i_837_;
					if (i_841_ >= 0) {
					    if (i_841_ >= i)
						break;
					    int i_842_
						= (is_828_
						   [(i_838_ * i_829_ / i_831_
						     + i_829_ * (i_840_
								 * i_830_
								 / i_832_))]);
					    int i_843_ = i_842_ >> 24 & 0xff;
					    if (i_843_ != 0)
						is[i_839_ + i * i_841_]
						    = i_842_;
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
    
    static void method12639() {
	int[] is = new int[3];
	for (int i = 0; i < aClass564_7386.anInt7308 * 81284827; i++) {
	    boolean bool = (aClass241_Sub39_Sub12_7405.method17257
			    (aClass564_7386.anIntArray7306[i] >> 28 & 0x3,
			     aClass564_7386.anIntArray7306[i] >> 14 & 0x3fff,
			     aClass564_7386.anIntArray7306[i] & 0x3fff, is,
			     -1476569158));
	    if (bool) {
		Class241_Sub41 class241_sub41
		    = new Class241_Sub41(aClass564_7386.anIntArray7307[i]);
		class241_sub41.anInt10154 = (is[1] - anInt7388) * 415135197;
		class241_sub41.anInt10152 = (is[2] - anInt7389) * -271238053;
		aClass429_7387.addNode(class241_sub41, (short) -16010);
	    }
	}
    }
    
    static void method12640() {
	int[] is = new int[3];
	for (int i = 0; i < aClass564_7386.anInt7308 * 81284827; i++) {
	    boolean bool = (aClass241_Sub39_Sub12_7405.method17257
			    (aClass564_7386.anIntArray7306[i] >> 28 & 0x3,
			     aClass564_7386.anIntArray7306[i] >> 14 & 0x3fff,
			     aClass564_7386.anIntArray7306[i] & 0x3fff, is,
			     -1846701804));
	    if (bool) {
		Class241_Sub41 class241_sub41
		    = new Class241_Sub41(aClass564_7386.anIntArray7307[i]);
		class241_sub41.anInt10154 = (is[1] - anInt7388) * 415135197;
		class241_sub41.anInt10152 = (is[2] - anInt7389) * -271238053;
		aClass429_7387.addNode(class241_sub41, (short) -24357);
	    }
	}
    }
    
    static NodeCollection method12641(Class103 class103, int i, int i_844_,
				int i_845_, int i_846_) {
	for (Class241_Sub41 class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7694(16711935);
	     class241_sub41 != null;
	     class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7692(828367742))
	    method12579(class103, class241_sub41, i, i_844_, i_845_, i_846_);
	return aClass429_7387;
    }
    
    static NodeCollection method12642(Class103 class103, int i, int i_847_,
				int i_848_, int i_849_) {
	for (Class241_Sub41 class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7694(16711935);
	     class241_sub41 != null;
	     class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7692(-222519443))
	    method12579(class103, class241_sub41, i, i_847_, i_848_, i_849_);
	return aClass429_7387;
    }
    
    static NodeCollection method12643(Class103 class103, int i, int i_850_,
				int i_851_, int i_852_) {
	for (Class241_Sub41 class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7694(16711935);
	     class241_sub41 != null;
	     class241_sub41
		 = (Class241_Sub41) aClass429_7387.method7692(1570056643))
	    method12579(class103, class241_sub41, i, i_850_, i_851_, i_852_);
	return aClass429_7387;
    }
    
    static void method12644(Class103 class103, Class241_Sub41 class241_sub41,
			    int i, int i_853_, int i_854_, int i_855_) {
	class241_sub41.anInt10156
	    = (anInt7430 + (i_854_ + i * (class241_sub41.anInt10154 * 669485685
					  - anInt7426)
			    >> 16)) * 1050789009;
	class241_sub41.anInt10157
	    = (anInt7425
	       - (i_855_ + i_853_ * (class241_sub41.anInt10152 * -1535798317
				     - anInt7429)
		  >> 16)) * 1268569743;
    }
    
    static void method12645(Class103 class103, Class241_Sub41 class241_sub41,
			    Class515 class515) {
	if (class515.anIntArray6737 != null) {
	    int[] is = new int[class515.anIntArray6737.length];
	    for (int i = 0; i < is.length / 2; i++) {
		int i_856_ = (class515.anIntArray6737[i * 2]
			      + class241_sub41.anInt10154 * 669485685);
		int i_857_ = (class515.anIntArray6737[i * 2 + 1]
			      + class241_sub41.anInt10152 * -1535798317);
		is[i * 2] = anInt7430 + ((anInt7395 - anInt7430)
					 * (i_856_ - anInt7426)
					 / (anInt7428 - anInt7426));
		is[i * 2 + 1] = anInt7425 - ((anInt7425 - anInt7431)
					     * (i_857_ - anInt7429)
					     / (anInt7427 - anInt7429));
	    }
	    Class99.method2176(class103, is, class515.anInt6761 * 1002290129);
	    if (class515.anInt6762 * 1183606681 > 0) {
		for (int i = 0; i < is.length / 2 - 1; i++) {
		    int i_858_ = is[i * 2];
		    int i_859_ = is[i * 2 + 1];
		    int i_860_ = is[(i + 1) * 2];
		    int i_861_ = is[(i + 1) * 2 + 1];
		    if (i_860_ < i_858_) {
			int i_862_ = i_858_;
			int i_863_ = i_859_;
			i_858_ = i_860_;
			i_859_ = i_861_;
			i_860_ = i_862_;
			i_861_ = i_863_;
		    } else if (i_860_ == i_858_ && i_861_ < i_859_) {
			int i_864_ = i_859_;
			i_859_ = i_861_;
			i_861_ = i_864_;
		    }
		    class103.method2276(i_858_, i_859_, i_860_, i_861_,
					(class515.anIntArray6758
					 [class515.aByteArray6768[i] & 0xff]),
					1, class515.anInt6762 * 1183606681,
					class515.anInt6763 * 2024392745,
					class515.anInt6764 * -1103664939);
		}
		int i = is[is.length - 2];
		int i_865_ = is[is.length - 1];
		int i_866_ = is[0];
		int i_867_ = is[1];
		if (i_866_ < i) {
		    int i_868_ = i;
		    int i_869_ = i_865_;
		    i = i_866_;
		    i_865_ = i_867_;
		    i_866_ = i_868_;
		    i_867_ = i_869_;
		} else if (i_866_ == i && i_867_ < i_865_) {
		    int i_870_ = i_865_;
		    i_865_ = i_867_;
		    i_867_ = i_870_;
		}
		class103.method2276(i, i_865_, i_866_, i_867_,
				    (class515.anIntArray6758
				     [((class515.aByteArray6768
					[class515.aByteArray6768.length - 1])
				       & 0xff)]),
				    1, class515.anInt6762 * 1183606681,
				    class515.anInt6763 * 2024392745,
				    class515.anInt6764 * -1103664939);
	    } else {
		for (int i = 0; i < is.length / 2 - 1; i++)
		    class103.method2517(is[i * 2], is[i * 2 + 1],
					is[(i + 1) * 2], is[(i + 1) * 2 + 1],
					(class515.anIntArray6758
					 [class515.aByteArray6768[i] & 0xff]),
					223909001);
		class103.method2517(is[is.length - 2], is[is.length - 1],
				    is[0], is[1],
				    (class515.anIntArray6758
				     [((class515.aByteArray6768
					[class515.aByteArray6768.length - 1])
				       & 0xff)]),
				    223909001);
	    }
	}
    }
    
    static boolean method12646(int i, int i_871_) {
	int i_872_ = i >> 3;
	int i_873_ = i_871_ >> 3;
	if (i_872_ < 0 || i_873_ < 0 || i_872_ >= aBoolArrayArray7435.length
	    || i_873_ >= aBoolArrayArray7435[i_872_].length)
	    return false;
	return aBoolArrayArray7435[i_872_][i_873_];
    }
    
    static int method12647() {
	return (int) (64.0F * aFloat7402 / 2.0F);
    }
    
    static int method12648() {
	return (int) (64.0F * aFloat7402 / 2.0F);
    }
    
    static void method12649(int[] is, int i, int i_874_, int i_875_,
			    int i_876_, int i_877_, int i_878_, int i_879_,
			    boolean bool, boolean bool_880_, boolean bool_881_,
			    boolean bool_882_) {
	for (int i_883_ = i; i_883_ <= i_874_; i_883_++) {
	    boolean bool_884_
		= bool_880_ ? (aBoolArray7422[anInt7379]
			       && i_874_ - i_883_ < (aClass497_7374.anInt6543
						     * 802645057)) : false;
	    boolean bool_885_
		= (bool_882_
		   ? (aBoolArray7422[anInt7409]
		      && i_883_ - i < aClass497_7374.anInt6543 * 802645057)
		   : false);
	    for (int i_886_ = i_875_; i_886_ <= i_876_; i_886_++) {
		if (bool_884_ || bool_885_)
		    is[(i_877_ - i_886_ - 1) * i_877_ + i_883_]
			= aClass497_7374.anInt6546 * 1174920463;
		else {
		    boolean bool_887_
			= (bool
			   ? (aBoolArray7422[anInt7403]
			      && (i_876_ - i_886_
				  < aClass497_7374.anInt6543 * 802645057))
			   : false);
		    boolean bool_888_
			= (bool_881_
			   ? (aBoolArray7422[anInt7407]
			      && (i_886_ - i_875_
				  < aClass497_7374.anInt6543 * 802645057))
			   : false);
		    if (bool_887_ || bool_888_)
			is[(i_877_ - i_886_ - 1) * i_877_ + i_883_]
			    = aClass497_7374.anInt6546 * 1174920463;
		    else {
			int i_889_
			    = is[(i_877_ - i_886_ - 1) * i_877_ + i_883_];
			if (i_889_ != anInt7434) {
			    anInt7434 = i_889_;
			    anInt7400
				= (~0xffffff
				   | ((((aClass497_7374.anInt6541 * -1585524463
					 & 0xff00ff) * i_878_
					+ (i_889_ & 0xff00ff) * i_879_)
				       & ~0xff00ff)
				      + ((((aClass497_7374.anInt6541
					    * -1585524463)
					   & 0xff00) * i_878_
					  + (i_889_ & 0xff00) * i_879_)
					 & 0xff0000)) >> 8);
			}
			is[(i_877_ - i_886_ - 1) * i_877_ + i_883_]
			    = anInt7400;
		    }
		}
	    }
	}
    }
    
    static void method12650(int[] is, int i, int i_890_, int i_891_,
			    int i_892_, int i_893_) {
	int i_894_ = aClass497_7374.anInt6541 * -1585524463 >> 24 & 0xff;
	int i_895_ = 255 - i_894_;
	for (int i_896_ = i; i_896_ <= i_890_; i_896_++) {
	    for (int i_897_ = i_891_; i_897_ <= i_892_; i_897_++) {
		int i_898_ = is[(i_893_ - i_897_ - 1) * i_893_ + i_896_];
		if (i_898_ != anInt7434) {
		    anInt7434 = i_898_;
		    anInt7400 = (~0xffffff
				 | ((((aClass497_7374.anInt6541 * -1585524463
				       & 0xff00ff) * i_894_
				      + (i_898_ & 0xff00ff) * i_895_)
				     & ~0xff00ff)
				    + (((aClass497_7374.anInt6541 * -1585524463
					 & 0xff00) * i_894_
					+ (i_898_ & 0xff00) * i_895_)
				       & 0xff0000)) >> 8);
		}
		is[(i_893_ - i_897_ - 1) * i_893_ + i_896_] = anInt7400;
	    }
	}
    }
    
    public static Class241_Sub39_Sub12 method12651(int i, int i_899_) {
	for (Class241_Sub39_Sub12 class241_sub39_sub12
		 = ((Class241_Sub39_Sub12)
		    aClass407_7377.method7294(2090894173));
	     class241_sub39_sub12 != null;
	     class241_sub39_sub12 = ((Class241_Sub39_Sub12)
				     aClass407_7377.method7295(841034246))) {
	    if (((Class241_Sub39_Sub12) class241_sub39_sub12).aBool10921
		&& class241_sub39_sub12.method17271(i, i_899_, -301035946))
		return class241_sub39_sub12;
	}
	return null;
    }
    
    static void method12652(int[] is, int i, int i_900_, int i_901_,
			    int i_902_, int i_903_, int i_904_, int i_905_,
			    boolean bool, boolean bool_906_, boolean bool_907_,
			    boolean bool_908_) {
	for (int i_909_ = i; i_909_ <= i_900_; i_909_++) {
	    boolean bool_910_
		= bool_906_ ? (aBoolArray7422[anInt7379]
			       && i_900_ - i_909_ < (aClass497_7374.anInt6543
						     * 802645057)) : false;
	    boolean bool_911_
		= (bool_908_
		   ? (aBoolArray7422[anInt7409]
		      && i_909_ - i < aClass497_7374.anInt6543 * 802645057)
		   : false);
	    for (int i_912_ = i_901_; i_912_ <= i_902_; i_912_++) {
		if (bool_910_ || bool_911_)
		    is[(i_903_ - i_912_ - 1) * i_903_ + i_909_]
			= aClass497_7374.anInt6546 * 1174920463;
		else {
		    boolean bool_913_
			= (bool
			   ? (aBoolArray7422[anInt7403]
			      && (i_902_ - i_912_
				  < aClass497_7374.anInt6543 * 802645057))
			   : false);
		    boolean bool_914_
			= (bool_907_
			   ? (aBoolArray7422[anInt7407]
			      && (i_912_ - i_901_
				  < aClass497_7374.anInt6543 * 802645057))
			   : false);
		    if (bool_913_ || bool_914_)
			is[(i_903_ - i_912_ - 1) * i_903_ + i_909_]
			    = aClass497_7374.anInt6546 * 1174920463;
		    else {
			int i_915_
			    = is[(i_903_ - i_912_ - 1) * i_903_ + i_909_];
			if (i_915_ != anInt7434) {
			    anInt7434 = i_915_;
			    anInt7400
				= (~0xffffff
				   | ((((aClass497_7374.anInt6541 * -1585524463
					 & 0xff00ff) * i_904_
					+ (i_915_ & 0xff00ff) * i_905_)
				       & ~0xff00ff)
				      + ((((aClass497_7374.anInt6541
					    * -1585524463)
					   & 0xff00) * i_904_
					  + (i_915_ & 0xff00) * i_905_)
					 & 0xff0000)) >> 8);
			}
			is[(i_903_ - i_912_ - 1) * i_903_ + i_909_]
			    = anInt7400;
		    }
		}
	    }
	}
    }
    
    static int method12653(Class107 class107, int i, int i_916_, int i_917_) {
	Class467 class467 = aClass476_7424.method10906(i, -156704019);
	if (class467 == null)
	    return 0;
	int i_918_ = class467.anInt6321 * -701216129;
	if (i_918_ >= 0 && class107.method2680(i_918_, 2099999875).aBool1434)
	    i_918_ = -1;
	int i_919_;
	if (class467.anInt6323 * -1240842283 >= 0) {
	    int i_920_ = class467.anInt6323 * -1240842283;
	    int i_921_ = (i_920_ & 0x7f) + i_917_;
	    if (i_921_ < 0)
		i_921_ = 0;
	    else if (i_921_ > 127)
		i_921_ = 127;
	    int i_922_
		= (i_920_ + i_916_ & 0xfc00) + (i_920_ & 0x380) + i_921_;
	    i_919_ = ~0xffffff | (Class474.anIntArray6382
				  [(Class241_Sub42.method16451
				    (Class445_Sub30.method14388(i_922_, 96,
								558590365),
				     -1234985079)) & 0xffff]);
	} else if (i_918_ >= 0)
	    i_919_ = (~0xffffff
		      | (Class474.anIntArray6382
			 [(Class241_Sub42.method16451
			   (Class445_Sub30.method14388((class107.method2680
							(i_918_, -1450383651)
							.aShort1436),
						       96, 1374026021),
			    -864515630)) & 0xffff]));
	else if (class467.anInt6320 * -1439860245 == -1)
	    i_919_ = 0;
	else {
	    int i_923_ = class467.anInt6320 * -1439860245;
	    int i_924_ = (i_923_ & 0x7f) + i_917_;
	    if (i_924_ < 0)
		i_924_ = 0;
	    else if (i_924_ > 127)
		i_924_ = 127;
	    int i_925_
		= (i_923_ + i_916_ & 0xfc00) + (i_923_ & 0x380) + i_924_;
	    i_919_ = ~0xffffff | (Class474.anIntArray6382
				  [(Class241_Sub42.method16451
				    (Class445_Sub30.method14388(i_925_, 96,
								1231110201),
				     1989679919)) & 0xffff]);
	}
	return i_919_;
    }
    
    static void method12654(int[] is, int i, int i_926_, int i_927_,
			    int i_928_, int i_929_, int i_930_, int i_931_,
			    byte[] is_932_, int i_933_, int i_934_) {
	int i_935_ = 0;
	int i_936_ = 0;
	int i_937_ = i_926_ - i + 1;
	int i_938_ = i_928_ - i_927_ + 1;
	int i_939_ = (i_933_ << 16) / i_937_;
	int i_940_ = (is_932_.length / i_933_ << 16) / i_938_;
	int i_941_ = i + (i_929_ - i_928_ - 1) * i_929_;
	int i_942_ = i_930_ >> 24;
	int i_943_ = i_931_ >> 24;
	if (i_934_ == 0 || i_934_ == 1 && i_942_ == 255 && i_943_ == 255) {
	    int i_944_ = i_935_;
	    for (int i_945_ = -i_938_; i_945_ < 0; i_945_++) {
		int i_946_ = (i_936_ >> 16) * i_933_;
		for (int i_947_ = -i_937_; i_947_ < 0; i_947_++) {
		    if (is_932_[(i_935_ >> 16) + i_946_] != 0)
			is[i_941_++] = i_931_;
		    else
			is[i_941_++] = i_930_;
		    i_935_ += i_939_;
		}
		i_936_ += i_940_;
		i_935_ = i_944_;
		i_941_ += i_929_ - i_937_;
	    }
	} else if (i_934_ == 1) {
	    int i_948_ = i_935_;
	    for (int i_949_ = -i_938_; i_949_ < 0; i_949_++) {
		int i_950_ = (i_936_ >> 16) * i_933_;
		for (int i_951_ = -i_937_; i_951_ < 0; i_951_++) {
		    int i_952_ = i_930_;
		    if (is_932_[(i_935_ >> 16) + i_950_] != 0)
			i_952_ = i_931_;
		    int i_953_ = i_952_ >>> 24;
		    int i_954_ = 255 - i_953_;
		    int i_955_ = is[i_941_];
		    is[i_941_++]
			= ~0xffffff | ((((i_952_ & 0xff00ff) * i_953_
					 + (i_955_ & 0xff00ff) * i_954_)
					& ~0xff00ff)
				       + (((i_952_ & 0xff00) * i_953_
					   + (i_955_ & 0xff00) * i_954_)
					  & 0xff0000)) >> 8;
		    i_935_ += i_939_;
		}
		i_936_ += i_940_;
		i_935_ = i_948_;
		i_941_ += i_929_ - i_937_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    static void method12655(int[] is, int i, int i_956_, int i_957_,
			    int i_958_, int i_959_) {
	int i_960_ = i + (i_958_ - i_956_ - 1) * i_958_;
	for (int i_961_ = 0; i_961_ < i_957_; i_961_++)
	    is[i_960_ + i_961_ * i_958_] = i_959_;
    }
    
    static {
	anIntArray7382 = new int[1];
	aByteArray7383 = new byte[1];
	aClass429_7387 = new NodeCollection();
	aBool7432 = true;
	anIntArrayArray7394
	    = new int[][] { { 2, 2, 0, 0, 0, 0 }, { 2, 2, 2, 0, 0, 0 },
			    { 1, 2, 2, 2, 0, 0 }, { 1, 1, 1, 2, 2, 0 },
			    { 1, 1, 1, 2, 2, 2 }, { 1, 1, 1, 1, 2, 2 } };
	anInt7403 = Class439.aClass439_6147.getId((byte) 0);
	anInt7404 = Class439.aClass439_6145.getId((byte) 0);
	anInt7379 = Class439.aClass439_6153.getId((byte) 0);
	anInt7406 = Class439.aClass439_6151.getId((byte) 0);
	anInt7407 = Class439.aClass439_6144.getId((byte) 0);
	anInt7368 = Class439.aClass439_6149.getId((byte) 0);
	anInt7409 = Class439.aClass439_6150.getId((byte) 0);
	anInt7410 = Class439.aClass439_6152.getId((byte) 0);
	aClass129_7412 = new Class129(4096, 256);
	aClass129_7413 = new Class129(4096, 1024);
	aClass129_7414 = aClass129_7412;
	anArrayList7416 = new ArrayList();
	anInt7415 = 262144;
	anInt7419 = 0;
	anInt7420 = 5;
	aClass241_Sub3_7371 = null;
	aClass241_Sub3_7417 = null;
	aBool7423 = true;
	new Date();
	anInt7434 = 0;
	anInt7400 = 0;
	aBoolArray7422 = new boolean[8];
    }
    
    static void method12656(int[] is, int i, int i_962_, int i_963_,
			    int i_964_, int i_965_, int i_966_, int i_967_,
			    boolean bool, boolean bool_968_, boolean bool_969_,
			    boolean bool_970_) {
	for (int i_971_ = i; i_971_ <= i_962_; i_971_++) {
	    boolean bool_972_
		= bool_968_ ? (aBoolArray7422[anInt7379]
			       && i_962_ - i_971_ < (aClass497_7374.anInt6543
						     * 802645057)) : false;
	    boolean bool_973_
		= (bool_970_
		   ? (aBoolArray7422[anInt7409]
		      && i_971_ - i < aClass497_7374.anInt6543 * 802645057)
		   : false);
	    for (int i_974_ = i_963_; i_974_ <= i_964_; i_974_++) {
		if (bool_972_ || bool_973_)
		    is[(i_965_ - i_974_ - 1) * i_965_ + i_971_]
			= aClass497_7374.anInt6546 * 1174920463;
		else {
		    boolean bool_975_
			= (bool
			   ? (aBoolArray7422[anInt7403]
			      && (i_964_ - i_974_
				  < aClass497_7374.anInt6543 * 802645057))
			   : false);
		    boolean bool_976_
			= (bool_969_
			   ? (aBoolArray7422[anInt7407]
			      && (i_974_ - i_963_
				  < aClass497_7374.anInt6543 * 802645057))
			   : false);
		    if (bool_975_ || bool_976_)
			is[(i_965_ - i_974_ - 1) * i_965_ + i_971_]
			    = aClass497_7374.anInt6546 * 1174920463;
		    else {
			int i_977_
			    = is[(i_965_ - i_974_ - 1) * i_965_ + i_971_];
			if (i_977_ != anInt7434) {
			    anInt7434 = i_977_;
			    anInt7400
				= (~0xffffff
				   | ((((aClass497_7374.anInt6541 * -1585524463
					 & 0xff00ff) * i_966_
					+ (i_977_ & 0xff00ff) * i_967_)
				       & ~0xff00ff)
				      + ((((aClass497_7374.anInt6541
					    * -1585524463)
					   & 0xff00) * i_966_
					  + (i_977_ & 0xff00) * i_967_)
					 & 0xff0000)) >> 8);
			}
			is[(i_965_ - i_974_ - 1) * i_965_ + i_971_]
			    = anInt7400;
		    }
		}
	    }
	}
    }
    
    static void method12657(int[] is, int i, int i_978_, int i_979_,
			    int i_980_, int i_981_) {
	int i_982_ = i + (i_980_ - i_978_ - 1) * i_980_;
	for (int i_983_ = 0; i_983_ < i_979_; i_983_++)
	    is[i_982_ + i_983_ * i_980_] = i_981_;
    }
    
    public static Class410 method12658(int i, int i_984_) {
	Class410 class410 = new Class410();
	for (Class241_Sub39_Sub12 class241_sub39_sub12
		 = ((Class241_Sub39_Sub12)
		    aClass407_7377.method7294(2090894173));
	     class241_sub39_sub12 != null;
	     class241_sub39_sub12 = ((Class241_Sub39_Sub12)
				     aClass407_7377.method7295(509240514))) {
	    if (((Class241_Sub39_Sub12) class241_sub39_sub12).aBool10921
		&& class241_sub39_sub12.method17271(i, i_984_, -212432837))
		class410.method7431(class241_sub39_sub12, (byte) -112);
	}
	return class410;
    }
}
