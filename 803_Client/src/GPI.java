/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GPI
{
    static int[] maskUpdates;//anIntArray2362
    static final int anInt2363 = 1;
    static byte[] skippingFlags;//aByteArray2364
    static byte[] playerMovementTypes;//aByteArray2365
    static boolean $assertionsDisabled = !GPI.class.desiredAssertionStatus();
    static RSByteBuffer[] aClass241_Sub3Array2366;
    static final int anInt2367 = 2;
    static int[] viewportPlayerIndicies;//anIntArray2368
    static int outsidePlayerCount;//anInt2369
    static int maskUpdateCount;//anInt2370
    static Class26[] playerRegions;//aClass26Array2371
    public static int viewportPlayerCount;//anInt2372
    static RSByteBuffer[] aClass241_Sub3Array2373;
    static int[] outsidePlayerIndicies;//anIntArray2374
    
    static final void method3999(RSBitBuffer class241_sub3_sub1) {
	for (int i = 0; i < 1511793725 * maskUpdateCount; i++) {
	    class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_0_ = maskUpdates[i];
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[i_0_];
	    int i_1_ = class241_sub3_sub1.readUnsignedByte((byte) 59);
	    if ((i_1_ & 0x8) != 0)
		i_1_ += class241_sub3_sub1.readUnsignedByte((byte) 48) << 8;
	    if (0 != (i_1_ & 0x2000))
		i_1_ += class241_sub3_sub1.readUnsignedByte((byte) -9) << 16;
	    Class480.decodeMasks(class241_sub3_sub1, i_0_,
				 class475_sub1_sub1_sub3_sub1, i_1_,
				 (byte) 85);
	}
    }
    
    static boolean method4000(RSBitBuffer class241_sub3_sub1, int i) {
	int i_2_ = class241_sub3_sub1.readBits(2, 554256842);
	if (i_2_ == 0) {
	    if (class241_sub3_sub1.readBits(1, 1078530369) != 0)
		Class343.decodeRegionHash(class241_sub3_sub1, i, (byte) 1);
	    int i_3_ = class241_sub3_sub1.readBits(6, 490041064);
	    int i_4_ = class241_sub3_sub1.readBits(6, 1147612593);
	    boolean bool = class241_sub3_sub1.readBits(1, 41145242) == 1;
	    if (bool)
		maskUpdates[(maskUpdateCount += 847942421) * 1511793725 - 1] = i;
	    if (client.localPlayers[i] != null)
		throw new RuntimeException();
	    Class26 class26 = playerRegions[i];
	    Player class475_sub1_sub1_sub3_sub1
		= (client.localPlayers[i]
		   = (new Player
		      (client.aClass238_8477.method4751(-615527995))));
	    class475_sub1_sub1_sub3_sub1.entityIndex = i * 1641239953;
	    if (null != aClass241_Sub3Array2373[i])
		class475_sub1_sub1_sub3_sub1
		    .decodeCharacterData(aClass241_Sub3Array2373[i], (byte) 14);
	    if (aClass241_Sub3Array2366[i] != null)
		class475_sub1_sub1_sub3_sub1
		    .method17955(aClass241_Sub3Array2366[i], -1638990633);
	    class475_sub1_sub1_sub3_sub1.setDirection((((Class26) class26)
						      .anInt214) * -775956185,
						     true, (byte) 102);
	    class475_sub1_sub1_sub3_sub1.facingEntity
		= ((Class26) class26).anInt216 * 1475516513;
	    int i_5_ = ((Class26) class26).regionHash * -2069261233;
	    int i_6_ = i_5_ >> 28;
	    int i_7_ = i_5_ >> 14 & 0xff;
	    int i_8_ = i_5_ & 0xff;
	    GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	    int i_9_ = (i_7_ << 6) + i_3_ - class522.baseX * 127679513;
	    int i_10_ = i_4_ + (i_8_ << 6) - class522.baseY * 468558693;
	    class475_sub1_sub1_sub3_sub1.aBool11496
		= ((Class26) class26).aBool217;
	    class475_sub1_sub1_sub3_sub1.aBool11494
		= ((Class26) class26).aBool218;
	    class475_sub1_sub1_sub3_sub1.moveTypeQueue[0]
		= playerMovementTypes[i];
	    class475_sub1_sub1_sub3_sub1.nodePlane
		= class475_sub1_sub1_sub3_sub1.aByte8745 = (byte) i_6_;
	    if (client.aClass238_8477.method4753((byte) -127)
		    .method4331(i_9_, i_10_, -1216029089))
		class475_sub1_sub1_sub3_sub1.aByte8745++;
	    class475_sub1_sub1_sub3_sub1.setPosition(i_9_, i_10_, -272210569);
	    playerRegions[i] = null;
	    return true;
	}
	if (1 == i_2_) {
	    int i_11_ = class241_sub3_sub1.readBits(2, -657935262);
	    int i_12_
		= -2069261233 * ((Class26) playerRegions[i]).regionHash;
	    ((Class26) playerRegions[i]).regionHash
		= (((i_11_ + (i_12_ >> 28) & 0x3) << 28)
		   + (i_12_ & 0xfffffff)) * -1163590993;
	    return false;
	}
	if (2 == i_2_) {
	    int i_13_ = class241_sub3_sub1.readBits(5, 1792881328);
	    int i_14_ = i_13_ >> 3 & 0x3;
	    int i_15_ = i_13_ & 0x7;
	    int i_16_
		= ((Class26) playerRegions[i]).regionHash * -2069261233;
	    if (!$assertionsDisabled
		&& (playerMovementTypes[i] < 0 || playerMovementTypes[i] > 3))
		throw new AssertionError();
	    int i_17_ = (i_16_ >> 28) + i_14_ & 0x3;
	    int i_18_ = i_16_ >> 14 & 0xff;
	    int i_19_ = i_16_ & 0xff;
	    if (i_15_ == 0) {
		i_18_--;
		i_19_--;
	    }
	    if (1 == i_15_)
		i_19_--;
	    if (i_15_ == 2) {
		i_18_++;
		i_19_--;
	    }
	    if (3 == i_15_)
		i_18_--;
	    if (4 == i_15_)
		i_18_++;
	    if (i_15_ == 5) {
		i_18_--;
		i_19_++;
	    }
	    if (6 == i_15_)
		i_19_++;
	    if (7 == i_15_) {
		i_18_++;
		i_19_++;
	    }
	    Class531.method11848(Class84.method1836(-2143532721),
				 playerMovementTypes[i], 481311629);
	    ((Class26) playerRegions[i]).regionHash
		= ((i_18_ << 14) + (i_17_ << 28) + i_19_) * -1163590993;
	    return false;
	}
	int i_20_ = class241_sub3_sub1.readBits(20, 2125152453);
	int i_21_ = i_20_ >> 18 & 0x3;
	int i_22_ = i_20_ >> 16 & 0x3;
	int i_23_ = i_20_ >> 8 & 0xff;
	int i_24_ = i_20_ & 0xff;
	int i_25_ = ((Class26) playerRegions[i]).regionHash * -2069261233;
	playerMovementTypes[i] = (byte) (i_21_ - 1);
	if (!$assertionsDisabled
	    && (playerMovementTypes[i] < 0 || playerMovementTypes[i] > 3))
	    throw new AssertionError();
	int i_26_ = i_22_ + (i_25_ >> 28) & 0x3;
	int i_27_ = i_23_ + (i_25_ >> 14) & 0xff;
	int i_28_ = i_25_ + i_24_ & 0xff;
	Class531.method11848(Class84.method1836(-2131617371), i_21_ - 1,
			     -1914762317);
	((Class26) playerRegions[i]).regionHash
	    = (i_28_ + ((i_27_ << 14) + (i_26_ << 28))) * -1163590993;
	return false;
    }
    
    static final void method4001(RSBitBuffer class241_sub3_sub1) {
	class241_sub3_sub1.initBitAccess(1628510173);
	int i = client.myPlayerIndex * 1124115145;
	Player class475_sub1_sub1_sub3_sub1
	    = (Class21.myPlayer
	       = client.localPlayers[i]
	       = (new Player
		  (client.aClass238_8477.method4751(-904979571))));
	class475_sub1_sub1_sub3_sub1.entityIndex = 1641239953 * i;
	int i_29_ = class241_sub3_sub1.readBits(30, 1960285286);
	byte i_30_ = (byte) (i_29_ >> 28);
	int i_31_ = i_29_ >> 14 & 0x3fff;
	int i_32_ = i_29_ & 0x3fff;
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0]
	    = i_31_ - 127679513 * class522.baseX;
	class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0]
	    = i_32_ - class522.baseY * 468558693;
	class475_sub1_sub1_sub3_sub1.method10880
	    ((float) ((class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0] << 9)
		      + (class475_sub1_sub1_sub3_sub1.method17782(1853776580)
			 << 8)),
	     (class475_sub1_sub1_sub3_sub1.method10873().aClass287_4386
	      .aFloat4474),
	     (float) ((class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0] << 9)
		      + (class475_sub1_sub1_sub3_sub1.method17782(244223053)
			 << 8)));
	Class357_Sub1.anInt10357
	    = (class475_sub1_sub1_sub3_sub1.nodePlane
	       = class475_sub1_sub1_sub3_sub1.aByte8745 = i_30_) * -1355156935;
	if (client.aClass238_8477.method4753((byte) -13).method4331
	    (class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0],
	     class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0], -1314782552))
	    class475_sub1_sub1_sub3_sub1.aByte8745++;
	if (null != aClass241_Sub3Array2373[i])
	    class475_sub1_sub1_sub3_sub1
		.decodeCharacterData(aClass241_Sub3Array2373[i], (byte) 14);
	if (null != aClass241_Sub3Array2366[i])
	    class475_sub1_sub1_sub3_sub1
		.method17955(aClass241_Sub3Array2366[i], -647358544);
	viewportPlayerCount = 0;
	viewportPlayerIndicies[(viewportPlayerCount += -1705037467) * 794073197 - 1] = i;
	skippingFlags[i] = (byte) 0;
	outsidePlayerCount = 0;
	for (int i_33_ = 1; i_33_ < 2048; i_33_++) {
	    if (i != i_33_) {
		int i_34_ = class241_sub3_sub1.readBits(18, 388924712);
		int i_35_ = i_34_ >> 16 & 0x3;
		int i_36_ = i_34_ >> 8 & 0xff;
		int i_37_ = i_34_ & 0xff;
		Class26 class26 = playerRegions[i_33_] = new Class26();
		((Class26) class26).regionHash
		    = -1163590993 * ((i_35_ << 28) + (i_36_ << 14) + i_37_);
		((Class26) class26).anInt214 = 0;
		((Class26) class26).anInt216 = -147063033;
		((Class26) class26).aBool217 = false;
		((Class26) class26).aBool218 = false;
		outsidePlayerIndicies[(outsidePlayerCount += -1083587301) * -626258669 - 1]
		    = i_33_;
		skippingFlags[i_33_] = (byte) 0;
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) -63);
	Class39 class39
	    = Class445_Sub16.aClass351_Sub1_8660.method6332((short) -701);
	if (Class39.aClass39_586 == class39) {
	    Class380_Sub2 class380_sub2
		= ((Class380_Sub2)
		   Class445_Sub16.aClass351_Sub1_8660.method6283(2133948292));
	    class380_sub2.method16693((byte) 46);
	}
	Class61 class61
	    = Class445_Sub16.aClass351_Sub1_8660.method6356(-1934163927);
	if (class61 == Class61.aClass61_1020) {
	    Class434_Sub5 class434_sub5
		= ((Class434_Sub5)
		   Class445_Sub16.aClass351_Sub1_8660.method6284((byte) 1));
	    class434_sub5.method14131((byte) 98);
	}
    }
    
    static final void method4002
	(RSBitBuffer class241_sub3_sub1, int i,
	 Player class475_sub1_sub1_sub3_sub1,
	 int i_38_) {
	if (0 != (i_38_ & 0x1000)) {
	    int i_39_ = class241_sub3_sub1.readUnsignedByteS((byte) 103);
	    int[] is = new int[i_39_];
	    int[] is_40_ = new int[i_39_];
	    int[] is_41_ = new int[i_39_];
	    for (int i_42_ = 0; i_42_ < i_39_; i_42_++) {
		is[i_42_] = class241_sub3_sub1.readBigSmart((byte) -6);
		is_40_[i_42_] = class241_sub3_sub1.readUnsignedByte((byte) 81);
		is_41_[i_42_] = class241_sub3_sub1.readUnsignedLEShortA(1190972614);
	    }
	    Class107.method2685(class475_sub1_sub1_sub3_sub1, is, is_40_,
				is_41_, -200969049);
	}
	if ((i_38_ & 0x10000) != 0) {
	    class475_sub1_sub1_sub3_sub1.aByte11416
		= class241_sub3_sub1.getByteC(537746309);
	    class475_sub1_sub1_sub3_sub1.aByte11395
		= class241_sub3_sub1.getByteC(537746309);
	    class475_sub1_sub1_sub3_sub1.aByte11412
		= class241_sub3_sub1.readByteA(582493488);
	    class475_sub1_sub1_sub3_sub1.aByte11413
		= (byte) class241_sub3_sub1.readUnsignedByteS((byte) 37);
	    class475_sub1_sub1_sub3_sub1.anInt11408
		= (client.anInt8296
		   + class241_sub3_sub1.readUnsignedShort(1162222719)) * -1558068143;
	    class475_sub1_sub1_sub3_sub1.anInt11389
		= (client.anInt8296
		   + class241_sub3_sub1.readUnsignedShortA((byte) 48)) * -960497231;
	}
	if ((i_38_ & 0x400000) != 0) {
	    int i_43_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_44_ = class241_sub3_sub1.readIntV2(1274614902);
	    if (65535 == i_43_)
		i_43_ = -1;
	    int i_45_ = class241_sub3_sub1.getByteA(-1937588063);
	    int i_46_ = i_45_ & 0x7;
	    int i_47_ = i_45_ >> 3 & 0xf;
	    if (15 == i_47_)
		i_47_ = -1;
	    boolean bool = (i_45_ >> 7 & 0x1) == 1;
	    class475_sub1_sub1_sub3_sub1
		.method17788(i_43_, i_44_, i_46_, i_47_, bool, 4, 1360987477);
	}
	if ((i_38_ & 0x100) != 0)
	    class475_sub1_sub1_sub3_sub1.aBool11496
		= class241_sub3_sub1.readByteC((byte) 41) == 1;
	if (0 != (i_38_ & 0x2)) {
	    int i_48_ = class241_sub3_sub1.readUnsignedLEShort((short) 20130);
	    if (i_48_ == 65535)
		i_48_ = -1;
	    class475_sub1_sub1_sub3_sub1.facingEntity = i_48_ * 1027225177;
	}
	if ((i_38_ & 0x8000) != 0) {
	    int i_49_ = class241_sub3_sub1.readUnsignedLEShortA(1000803770);
	    int i_50_ = class241_sub3_sub1.readIntV2(1274614902);
	    if (65535 == i_49_)
		i_49_ = -1;
	    int i_51_ = class241_sub3_sub1.readByteC((byte) 100);
	    int i_52_ = i_51_ & 0x7;
	    int i_53_ = i_51_ >> 3 & 0xf;
	    if (15 == i_53_)
		i_53_ = -1;
	    boolean bool = 1 == (i_51_ >> 7 & 0x1);
	    class475_sub1_sub1_sub3_sub1
		.method17788(i_49_, i_50_, i_52_, i_53_, bool, 1, 854438915);
	}
	if (0 != (i_38_ & 0x20000)) {
	    int i_54_ = class241_sub3_sub1.readByteC((byte) 110);
	    int[] is = new int[i_54_];
	    int[] is_55_ = new int[i_54_];
	    for (int i_56_ = 0; i_56_ < i_54_; i_56_++) {
		int i_57_ = class241_sub3_sub1.readUnsignedLEShort((short) 26328);
		if ((i_57_ & 0xc000) == 49152) {
		    int i_58_ = class241_sub3_sub1.readUnsignedLEShortA(667349776);
		    is[i_56_] = i_57_ << 16 | i_58_;
		} else
		    is[i_56_] = i_57_;
		is_55_[i_56_] = class241_sub3_sub1.readUnsignedLEShortA(1337196430);
	    }
	    class475_sub1_sub1_sub3_sub1.method17773(is, is_55_, -2042715875);
	}
	if (0 != (i_38_ & 0x200000))
	    class475_sub1_sub1_sub3_sub1.aBool11494
		= class241_sub3_sub1.getByteA(-2052853681) == 1;
	if (0 != (i_38_ & 0x400)) {
	    int i_59_ = class241_sub3_sub1.readUnsignedLEShort((short) 4930);
	    int i_60_ = class241_sub3_sub1.readIntV1((short) 25431);
	    if (i_59_ == 65535)
		i_59_ = -1;
	    int i_61_ = class241_sub3_sub1.readUnsignedByteS((byte) 34);
	    int i_62_ = i_61_ & 0x7;
	    int i_63_ = i_61_ >> 3 & 0xf;
	    if (i_63_ == 15)
		i_63_ = -1;
	    boolean bool = (i_61_ >> 7 & 0x1) == 1;
	    class475_sub1_sub1_sub3_sub1
		.method17788(i_59_, i_60_, i_62_, i_63_, bool, 2, -697368412);
	}
	if ((i_38_ & 0x10) != 0) {
	    int[] is = new int[4];
	    for (int i_64_ = 0; i_64_ < 4; i_64_++)
		is[i_64_] = class241_sub3_sub1.readBigSmart((byte) 116);
	    int i_65_ = class241_sub3_sub1.readUnsignedByte((byte) -27);
	    Class638.method13557(class475_sub1_sub1_sub3_sub1, is, i_65_,
				 false, (byte) 102);
	}
	if (0 != (i_38_ & 0x80000)) {
	    class241_sub3_sub1.pointer += -1362085898;
	    int i_66_
		= ((class241_sub3_sub1.payload
		    [((class241_sub3_sub1.pointer += -681042949) * 421967667
		      - 1)])
		   & 0xff);
	    for (int i_67_ = 0; i_67_ < i_66_; i_67_++) {
		int i_68_ = class241_sub3_sub1.readUnsignedByte((byte) 18);
		BaseVarType class217
		    = (BaseVarType) Class494.method11278(BaseVarType.class, i_68_,
						      (byte) -20);
		Class254 class254
		    = (Class177.VAR_PLAYER_LIST.decodeVarValue
		       (class241_sub3_sub1, class217, -1843925137));
		class475_sub1_sub1_sub3_sub1.anInterface46_11409.method335
		    (class254.key * 623518843, class254.value,
		     (byte) 12);
	    }
	}
	if (0 != (i_38_ & 0x1)) {
	    int i_69_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_70_ = class241_sub3_sub1.readIntV1((short) 23845);
	    if (65535 == i_69_)
		i_69_ = -1;
	    int i_71_ = class241_sub3_sub1.readUnsignedByteS((byte) 48);
	    int i_72_ = i_71_ & 0x7;
	    int i_73_ = i_71_ >> 3 & 0xf;
	    if (i_73_ == 15)
		i_73_ = -1;
	    boolean bool = 1 == (i_71_ >> 7 & 0x1);
	    class475_sub1_sub1_sub3_sub1
		.method17788(i_69_, i_70_, i_72_, i_73_, bool, 0, 1308786407);
	}
	if ((i_38_ & 0x40000) != 0) {
	    class475_sub1_sub1_sub3_sub1.anInterface46_11409
		.method195(-1502141412);
	    class241_sub3_sub1.pointer += -1362085898;
	    int i_74_
		= ((class241_sub3_sub1.payload
		    [((class241_sub3_sub1.pointer += -681042949) * 421967667
		      - 1)])
		   & 0xff);
	    for (int i_75_ = 0; i_75_ < i_74_; i_75_++) {
		int i_76_ = class241_sub3_sub1.readByteC((byte) 79);
		BaseVarType class217
		    = (BaseVarType) Class494.method11278(BaseVarType.class, i_76_,
						      (byte) -60);
		Class254 class254
		    = (Class177.VAR_PLAYER_LIST.decodeVarValue
		       (class241_sub3_sub1, class217, -1843925137));
		class475_sub1_sub1_sub3_sub1.anInterface46_11409.method335
		    (class254.key * 623518843, class254.value,
		     (byte) 51);
	    }
	}
	if ((i_38_ & 0x800) != 0) {
	    int i_77_ = class241_sub3_sub1.readByteC((byte) 124);
	    byte[] is = new byte[i_77_];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    class241_sub3_sub1.readReverseA(is, 0, i_77_, 1835466397);
	    aClass241_Sub3Array2366[i] = class241_sub3;
	    class475_sub1_sub1_sub3_sub1.method17955(class241_sub3,
						     -1768279605);
	}
	if ((i_38_ & 0x80) != 0) {
	    int i_78_ = class241_sub3_sub1.readUnsignedByteS((byte) 55);
	    byte[] is = new byte[i_78_];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    class241_sub3_sub1.readReverseA(is, 0, i_78_, 1778531218);
	    aClass241_Sub3Array2373[i] = class241_sub3;
	    class475_sub1_sub1_sub3_sub1.decodeCharacterData(class241_sub3, (byte) 14);
	}
	if ((i_38_ & 0x4) != 0) {
	    int i_79_ = class241_sub3_sub1.readByteC((byte) 47);
	    if (i_79_ > 0) {
		for (int i_80_ = 0; i_80_ < i_79_; i_80_++) {
		    int i_81_ = -1;
		    int i_82_ = -1;
		    int i_83_ = -1;
		    int i_84_ = class241_sub3_sub1.readSmart((short) -23256);
		    if (i_84_ == 32767) {
			i_84_ = class241_sub3_sub1.readSmart((short) -24496);
			i_82_ = class241_sub3_sub1.readSmart((short) -12948);
			i_81_ = class241_sub3_sub1.readSmart((short) -22179);
			i_83_ = class241_sub3_sub1.readSmart((short) -9784);
		    } else if (32766 != i_84_)
			i_82_ = class241_sub3_sub1.readSmart((short) -2870);
		    else {
			i_84_ = -1;
			i_82_ = class241_sub3_sub1.readUnsignedByteS((byte) 59);
		    }
		    int i_85_ = class241_sub3_sub1.readSmart((short) -27744);
		    class475_sub1_sub1_sub3_sub1.setHitMark(i_84_, i_82_,
							     i_81_, i_83_,
							     client.anInt8296,
							     i_85_,
							     -1938981276);
		}
	    }
	    int i_86_ = class241_sub3_sub1.readUnsignedByteS((byte) 113);
	    if (i_86_ > 0) {
		for (int i_87_ = 0; i_87_ < i_86_; i_87_++) {
		    int i_88_ = class241_sub3_sub1.readSmart((short) -7692);
		    int i_89_ = class241_sub3_sub1.readSmart((short) -693);
		    if (i_89_ != 32767) {
			int i_90_
			    = class241_sub3_sub1.readSmart((short) -25107);
			int i_91_ = class241_sub3_sub1.readUnsignedByteS((byte) 121);
			int i_92_
			    = (i_89_ > 0
			       ? class241_sub3_sub1.readUnsignedByteS((byte) 70)
			       : i_91_);
			class475_sub1_sub1_sub3_sub1.method17791(i_88_,
								 (client
								  .anInt8296),
								 i_89_, i_90_,
								 i_91_, i_92_,
								 (byte) 0);
		    } else
			class475_sub1_sub1_sub3_sub1.method17780(i_88_,
								 286511346);
		}
	    }
	}
	if ((i_38_ & 0x100000) != 0) {
	    String string = class241_sub3_sub1.readString(1446281020);
	    int i_93_ = class241_sub3_sub1.getByteA(-2080250606);
	    if ((i_93_ & 0x1) != 0)
		Class318.appendChatboxMessage(2, i_93_,
				    class475_sub1_sub1_sub3_sub1
					.getFormattedName(true, -1427602826),
				    class475_sub1_sub1_sub3_sub1
					.getName(false, -122333825),
				    class475_sub1_sub1_sub3_sub1.nameFiltered,
				    string, -1840087862);
	    class475_sub1_sub1_sub3_sub1.setOverheadMessage(string, 0, 0, (byte) 91);
	}
	if (0 != (i_38_ & 0x20)) {
	    class475_sub1_sub1_sub3_sub1.facingDirection
		= class241_sub3_sub1.readUnsignedLEShort((short) 30251) * 1164488315;
	    if (class475_sub1_sub1_sub3_sub1.queuedStepCount * -316498507 == 0) {
		class475_sub1_sub1_sub3_sub1.method17804
		    (class475_sub1_sub1_sub3_sub1.facingDirection * -989200205,
		     1278742606);
		class475_sub1_sub1_sub3_sub1.facingDirection = -1164488315;
	    }
	}
	if (0 != (i_38_ & 0x800000)) {
	    int i_94_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_95_ = class241_sub3_sub1.readInt((byte) 12);
	    if (65535 == i_94_)
		i_94_ = -1;
	    int i_96_ = class241_sub3_sub1.readUnsignedByteS((byte) 64);
	    int i_97_ = i_96_ & 0x7;
	    int i_98_ = i_96_ >> 3 & 0xf;
	    if (i_98_ == 15)
		i_98_ = -1;
	    boolean bool = 1 == (i_96_ >> 7 & 0x1);
	    class475_sub1_sub1_sub3_sub1
		.method17788(i_94_, i_95_, i_97_, i_98_, bool, 3, 1604335473);
	}
	if (0 != (i_38_ & 0x4000)) {
	    String string = class241_sub3_sub1.readString(-1454709573);
	    if (Class21.myPlayer
		== class475_sub1_sub1_sub3_sub1)
		Class318.appendChatboxMessage(2, 0,
				    class475_sub1_sub1_sub3_sub1
					.getFormattedName(true, 302019284),
				    class475_sub1_sub1_sub3_sub1
					.getName(false, -122333825),
				    class475_sub1_sub1_sub3_sub1.nameFiltered,
				    string, -1659321645);
	    class475_sub1_sub1_sub3_sub1.setOverheadMessage(string, 0, 0, (byte) 39);
	}
	if ((i_38_ & 0x40) != 0) {
	    class475_sub1_sub1_sub3_sub1.anInt11401
		= class241_sub3_sub1.readByteA(582493488) * 2045684417;
	    class475_sub1_sub1_sub3_sub1.anInt11403
		= class241_sub3_sub1.readByteS((byte) 1) * -182768233;
	    class475_sub1_sub1_sub3_sub1.anInt11402
		= class241_sub3_sub1.readByteS((byte) 1) * -9202803;
	    class475_sub1_sub1_sub3_sub1.anInt11428
		= class241_sub3_sub1.getByteC(537746309) * -1841438277;
	    class475_sub1_sub1_sub3_sub1.anInt11386
		= (class241_sub3_sub1.readUnsignedLEShort((short) 12303)
		   + client.anInt8296) * 1486211439;
	    class475_sub1_sub1_sub3_sub1.anInt11422
		= (class241_sub3_sub1.readUnsignedShortA((byte) 5)
		   + client.anInt8296) * -2087589789;
	    class475_sub1_sub1_sub3_sub1.anInt11407
		= class241_sub3_sub1.readUnsignedShortA((byte) 69) * 364183757;
	    class475_sub1_sub1_sub3_sub1.anInt11401
		+= (class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0]
		    * 2045684417);
	    class475_sub1_sub1_sub3_sub1.anInt11403
		+= (-182768233
		    * class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0]);
	    class475_sub1_sub1_sub3_sub1.anInt11402
		+= class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0] * -9202803;
	    class475_sub1_sub1_sub3_sub1.anInt11428
		+= (-1841438277
		    * class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0]);
	    class475_sub1_sub1_sub3_sub1.queuedStepCount = 1631398045;
	    class475_sub1_sub1_sub3_sub1.anInt11430 = 0;
	}
    }
    
    static final void method4003(RSBitBuffer class241_sub3_sub1,
				 int i) {
	maskUpdateCount = 0;
	Class98.decodeLocationUpdates(class241_sub3_sub1, 1779232208);
	Class185.decodePlayerMasks(class241_sub3_sub1, -282308553);
	if (i != class241_sub3_sub1.pointer * 421967667)
	    throw new RuntimeException(new StringBuilder().append
					   (class241_sub3_sub1.pointer
					    * 421967667)
					   .append
					   (" ").append
					   (i).toString());
    }
    
    static final void method4004(RSBitBuffer class241_sub3_sub1,
				 int i) {
	maskUpdateCount = 0;
	Class98.decodeLocationUpdates(class241_sub3_sub1, 244260249);
	Class185.decodePlayerMasks(class241_sub3_sub1, -1748331475);
	if (i != class241_sub3_sub1.pointer * 421967667)
	    throw new RuntimeException(new StringBuilder().append
					   (class241_sub3_sub1.pointer
					    * 421967667)
					   .append
					   (" ").append
					   (i).toString());
    }
    
    static final void method4005(RSBitBuffer class241_sub3_sub1,
				 int i) {
	maskUpdateCount = 0;
	Class98.decodeLocationUpdates(class241_sub3_sub1, 951163421);
	Class185.decodePlayerMasks(class241_sub3_sub1, -1449816973);
	if (i != class241_sub3_sub1.pointer * 421967667)
	    throw new RuntimeException(new StringBuilder().append
					   (class241_sub3_sub1.pointer
					    * 421967667)
					   .append
					   (" ").append
					   (i).toString());
    }
    
    static final void method4006(RSBitBuffer class241_sub3_sub1) {
	int i = 0;
	class241_sub3_sub1.initBitAccess(1628510173);
	for (int i_99_ = 0; i_99_ < 794073197 * viewportPlayerCount; i_99_++) {
	    int i_100_ = viewportPlayerIndicies[i_99_];
	    if (0 == (skippingFlags[i_100_] & 0x1)) {
		if (i > 0) {
		    i--;
		    skippingFlags[i_100_] |= 0x2;
		} else {
		    int i_101_
			= class241_sub3_sub1.readBits(1, -1024101031);
		    if (0 == i_101_) {
			i = Class459.decodeSkip(class241_sub3_sub1,
						 888301017);
			skippingFlags[i_100_] |= 0x2;
		    } else
			Class284.unpackLocationUpdate(class241_sub3_sub1, i_100_,
					    -1027649430);
		}
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) -107);
	if (0 != i)
	    throw new RuntimeException();
	class241_sub3_sub1.initBitAccess(1628510173);
	for (int i_102_ = 0; i_102_ < 794073197 * viewportPlayerCount; i_102_++) {
	    int i_103_ = viewportPlayerIndicies[i_102_];
	    if ((skippingFlags[i_103_] & 0x1) != 0) {
		if (i > 0) {
		    i--;
		    skippingFlags[i_103_] |= 0x2;
		} else {
		    int i_104_ = class241_sub3_sub1.readBits(1, -214775256);
		    if (i_104_ == 0) {
			i = Class459.decodeSkip(class241_sub3_sub1,
						 1305718390);
			skippingFlags[i_103_] |= 0x2;
		    } else
			Class284.unpackLocationUpdate(class241_sub3_sub1, i_103_,
					    -1417874036);
		}
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) -55);
	if (0 != i)
	    throw new RuntimeException();
	class241_sub3_sub1.initBitAccess(1628510173);
	for (int i_105_ = 0; i_105_ < -626258669 * outsidePlayerCount; i_105_++) {
	    int i_106_ = outsidePlayerIndicies[i_105_];
	    if (0 != (skippingFlags[i_106_] & 0x1)) {
		if (i > 0) {
		    i--;
		    skippingFlags[i_106_] |= 0x2;
		} else {
		    int i_107_ = class241_sub3_sub1.readBits(1, -537220663);
		    if (0 == i_107_) {
			i = Class459.decodeSkip(class241_sub3_sub1,
						 -446174031);
			skippingFlags[i_106_] |= 0x2;
		    } else if (Class343.decodeRegionHash(class241_sub3_sub1, i_106_,
						   (byte) 1))
			skippingFlags[i_106_] |= 0x2;
		}
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) 11);
	if (0 != i)
	    throw new RuntimeException();
	class241_sub3_sub1.initBitAccess(1628510173);
	for (int i_108_ = 0; i_108_ < -626258669 * outsidePlayerCount; i_108_++) {
	    int i_109_ = outsidePlayerIndicies[i_108_];
	    if (0 == (skippingFlags[i_109_] & 0x1)) {
		if (i > 0) {
		    i--;
		    skippingFlags[i_109_] |= 0x2;
		} else {
		    int i_110_ = class241_sub3_sub1.readBits(1, -585996629);
		    if (0 == i_110_) {
			i = Class459.decodeSkip(class241_sub3_sub1,
						 246597918);
			skippingFlags[i_109_] |= 0x2;
		    } else if (Class343.decodeRegionHash(class241_sub3_sub1, i_109_,
						   (byte) 1))
			skippingFlags[i_109_] |= 0x2;
		}
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) 11);
	if (i != 0)
	    throw new RuntimeException();
	viewportPlayerCount = 0;
	outsidePlayerCount = 0;
	for (int i_111_ = 1; i_111_ < 2048; i_111_++) {
	    skippingFlags[i_111_] >>= 1;
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[i_111_];
	    if (null != class475_sub1_sub1_sub3_sub1)
		viewportPlayerIndicies[(viewportPlayerCount += -1705037467) * 794073197 - 1]
		    = i_111_;
	    else
		outsidePlayerIndicies[(outsidePlayerCount += -1083587301) * -626258669 - 1]
		    = i_111_;
	}
    }
    
    static final void method4007(RSBitBuffer class241_sub3_sub1) {
	class241_sub3_sub1.initBitAccess(1628510173);
	int i = client.myPlayerIndex * 1124115145;
	Player class475_sub1_sub1_sub3_sub1
	    = (Class21.myPlayer
	       = client.localPlayers[i]
	       = (new Player
		  (client.aClass238_8477.method4751(-2021205462))));
	class475_sub1_sub1_sub3_sub1.entityIndex = 1641239953 * i;
	int i_112_ = class241_sub3_sub1.readBits(30, 1305893405);
	byte i_113_ = (byte) (i_112_ >> 28);
	int i_114_ = i_112_ >> 14 & 0x3fff;
	int i_115_ = i_112_ & 0x3fff;
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0]
	    = i_114_ - 127679513 * class522.baseX;
	class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0]
	    = i_115_ - class522.baseY * 468558693;
	class475_sub1_sub1_sub3_sub1.method10880
	    ((float) ((class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0] << 9)
		      + (class475_sub1_sub1_sub3_sub1.method17782(179689427)
			 << 8)),
	     (class475_sub1_sub1_sub3_sub1.method10873().aClass287_4386
	      .aFloat4474),
	     (float) ((class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0] << 9)
		      + (class475_sub1_sub1_sub3_sub1.method17782(-652659113)
			 << 8)));
	Class357_Sub1.anInt10357 = (class475_sub1_sub1_sub3_sub1.nodePlane
				    = class475_sub1_sub1_sub3_sub1.aByte8745
				    = i_113_) * -1355156935;
	if (client.aClass238_8477.method4753((byte) -5).method4331
	    (class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0],
	     class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0], 1766169137))
	    class475_sub1_sub1_sub3_sub1.aByte8745++;
	if (null != aClass241_Sub3Array2373[i])
	    class475_sub1_sub1_sub3_sub1
		.decodeCharacterData(aClass241_Sub3Array2373[i], (byte) 14);
	if (null != aClass241_Sub3Array2366[i])
	    class475_sub1_sub1_sub3_sub1
		.method17955(aClass241_Sub3Array2366[i], -1878921936);
	viewportPlayerCount = 0;
	viewportPlayerIndicies[(viewportPlayerCount += -1705037467) * 794073197 - 1] = i;
	skippingFlags[i] = (byte) 0;
	outsidePlayerCount = 0;
	for (int i_116_ = 1; i_116_ < 2048; i_116_++) {
	    if (i != i_116_) {
		int i_117_ = class241_sub3_sub1.readBits(18, 658772502);
		int i_118_ = i_117_ >> 16 & 0x3;
		int i_119_ = i_117_ >> 8 & 0xff;
		int i_120_ = i_117_ & 0xff;
		Class26 class26 = playerRegions[i_116_] = new Class26();
		((Class26) class26).regionHash
		    = -1163590993 * ((i_118_ << 28) + (i_119_ << 14) + i_120_);
		((Class26) class26).anInt214 = 0;
		((Class26) class26).anInt216 = -147063033;
		((Class26) class26).aBool217 = false;
		((Class26) class26).aBool218 = false;
		outsidePlayerIndicies[(outsidePlayerCount += -1083587301) * -626258669 - 1]
		    = i_116_;
		skippingFlags[i_116_] = (byte) 0;
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) 78);
	Class39 class39
	    = Class445_Sub16.aClass351_Sub1_8660.method6332((short) -746);
	if (Class39.aClass39_586 == class39) {
	    Class380_Sub2 class380_sub2
		= ((Class380_Sub2)
		   Class445_Sub16.aClass351_Sub1_8660.method6283(1501465430));
	    class380_sub2.method16693((byte) 86);
	}
	Class61 class61
	    = Class445_Sub16.aClass351_Sub1_8660.method6356(-1682977138);
	if (class61 == Class61.aClass61_1020) {
	    Class434_Sub5 class434_sub5
		= ((Class434_Sub5)
		   Class445_Sub16.aClass351_Sub1_8660.method6284((byte) 1));
	    class434_sub5.method14131((byte) 99);
	}
    }
    
    static int method4008(RSBitBuffer class241_sub3_sub1) {
	int i = class241_sub3_sub1.readBits(2, -56212673);
	int i_121_;
	if (i == 0)
	    i_121_ = 0;
	else if (i == 1)
	    i_121_ = class241_sub3_sub1.readBits(5, 291316525);
	else if (2 == i)
	    i_121_ = class241_sub3_sub1.readBits(8, -528284653);
	else
	    i_121_ = class241_sub3_sub1.readBits(11, 3098453);
	return i_121_;
    }
    
    static int method4009(RSBitBuffer class241_sub3_sub1) {
	int i = class241_sub3_sub1.readBits(2, -642427442);
	int i_122_;
	if (i == 0)
	    i_122_ = 0;
	else if (i == 1)
	    i_122_ = class241_sub3_sub1.readBits(5, 1788450685);
	else if (2 == i)
	    i_122_ = class241_sub3_sub1.readBits(8, 650202929);
	else
	    i_122_ = class241_sub3_sub1.readBits(11, 1345085379);
	return i_122_;
    }
    
    static void method4010(RSBitBuffer class241_sub3_sub1, int i) {
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	boolean bool = class241_sub3_sub1.readBits(1, -322750282) == 1;
	if (bool)
	    maskUpdates[(maskUpdateCount += 847942421) * 1511793725 - 1] = i;
	int i_123_ = class241_sub3_sub1.readBits(2, 577721190);
	Player class475_sub1_sub1_sub3_sub1
	    = client.localPlayers[i];
	if (0 == i_123_) {
	    if (!bool) {
		if (1124115145 * client.myPlayerIndex == i)
		    throw new RuntimeException();
		Class26 class26 = playerRegions[i] = new Class26();
		Class84.method1836(-1977359551);
		((Class26) class26).regionHash
		    = ((((class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0]
			  + 468558693 * class522.baseY)
			 >> 6)
			+ (((127679513 * class522.baseX
			     + class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0])
			    >> 6 << 14)
			   + (class475_sub1_sub1_sub3_sub1.nodePlane << 28)))
		       * -1163590993);
		if (class475_sub1_sub1_sub3_sub1.facingDirection * -989200205 != -1)
		    ((Class26) class26).anInt214
			= (-1934976107
			   * class475_sub1_sub1_sub3_sub1.facingDirection);
		else
		    ((Class26) class26).anInt214
			= class475_sub1_sub1_sub3_sub1.aClass8_11406
			      .method514((byte) -30) * -381679977;
		((Class26) class26).anInt216
		    = 1730284449 * class475_sub1_sub1_sub3_sub1.facingEntity;
		((Class26) class26).aBool217
		    = class475_sub1_sub1_sub3_sub1.aBool11496;
		((Class26) class26).aBool218
		    = class475_sub1_sub1_sub3_sub1.aBool11494;
		if (class475_sub1_sub1_sub3_sub1.anInt11513 * 1294463297 > 0)
		    Class361_Sub1.method16755(class475_sub1_sub1_sub3_sub1,
					      1482319719);
		client.localPlayers[i] = null;
		if (class241_sub3_sub1.readBits(1, 1799598668) != 0)
		    Class343.decodeRegionHash(class241_sub3_sub1, i, (byte) 1);
	    }
	} else if (1 == i_123_) {
	    int i_124_ = class241_sub3_sub1.readBits(3, 1279671);
	    int i_125_ = class241_sub3_sub1.readBits(1, 110900696);
	    int i_126_ = class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0];
	    int i_127_ = class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0];
	    if (1 == i_125_) {
		int i_128_ = class241_sub3_sub1.readBits(2, 942176087);
		switch (i_128_) {
		case 1:
		    class475_sub1_sub1_sub3_sub1.moveTo(i_126_ - 1,
							     i_127_,
							     playerMovementTypes[i],
							     -853360280);
		    break;
		case 2:
		    class475_sub1_sub1_sub3_sub1.moveTo(i_126_ + 1,
							     i_127_,
							     playerMovementTypes[i],
							     -1010920374);
		    break;
		case 0:
		    class475_sub1_sub1_sub3_sub1.moveTo(i_126_,
							     1 + i_127_,
							     playerMovementTypes[i],
							     476907282);
		    break;
		case 3:
		    class475_sub1_sub1_sub3_sub1.moveTo(i_126_,
							     i_127_ - 1,
							     playerMovementTypes[i],
							     -243229478);
		    break;
		}
	    }
	    if (0 == i_124_) {
		i_126_--;
		i_127_--;
	    } else if (1 == i_124_)
		i_127_--;
	    else if (2 == i_124_) {
		i_126_++;
		i_127_--;
	    } else if (3 == i_124_)
		i_126_--;
	    else if (i_124_ == 4)
		i_126_++;
	    else if (i_124_ == 5) {
		i_126_--;
		i_127_++;
	    } else if (i_124_ == 6)
		i_127_++;
	    else if (i_124_ == 7) {
		i_126_++;
		i_127_++;
	    }
	    class475_sub1_sub1_sub3_sub1
		.moveTo(i_126_, i_127_, playerMovementTypes[i], -689050607);
	} else if (2 == i_123_) {
	    int i_129_ = class241_sub3_sub1.readBits(4, 913366108);
	    int i_130_ = class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0];
	    int i_131_ = class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0];
	    if (0 == i_129_) {
		i_130_ -= 2;
		i_131_ -= 2;
	    } else if (1 == i_129_) {
		i_130_--;
		i_131_ -= 2;
	    } else if (i_129_ == 2)
		i_131_ -= 2;
	    else if (3 == i_129_) {
		i_130_++;
		i_131_ -= 2;
	    } else if (i_129_ == 4) {
		i_130_ += 2;
		i_131_ -= 2;
	    } else if (5 == i_129_) {
		i_130_ -= 2;
		i_131_--;
	    } else if (6 == i_129_) {
		i_130_ += 2;
		i_131_--;
	    } else if (i_129_ == 7)
		i_130_ -= 2;
	    else if (8 == i_129_)
		i_130_ += 2;
	    else if (9 == i_129_) {
		i_130_ -= 2;
		i_131_++;
	    } else if (10 == i_129_) {
		i_130_ += 2;
		i_131_++;
	    } else if (i_129_ == 11) {
		i_130_ -= 2;
		i_131_ += 2;
	    } else if (12 == i_129_) {
		i_130_--;
		i_131_ += 2;
	    } else if (i_129_ == 13)
		i_131_ += 2;
	    else if (i_129_ == 14) {
		i_130_++;
		i_131_ += 2;
	    } else if (i_129_ == 15) {
		i_130_ += 2;
		i_131_ += 2;
	    }
	    class475_sub1_sub1_sub3_sub1
		.moveTo(i_130_, i_131_, playerMovementTypes[i], -1720009715);
	} else {
	    int i_132_ = class241_sub3_sub1.readBits(1, 1685005734);
	    if (0 == i_132_) {
		int i_133_ = class241_sub3_sub1.readBits(15, -463072127);
		int i_134_ = i_133_ >> 12 & 0x7;
		int i_135_ = (byte) (i_133_ >> 10) & 0x3;
		int i_136_ = i_133_ >> 5 & 0x1f;
		if (i_136_ > 15)
		    i_136_ -= 32;
		int i_137_ = i_133_ & 0x1f;
		if (i_137_ > 15)
		    i_137_ -= 32;
		int i_138_
		    = class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0] + i_136_;
		int i_139_
		    = class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0] + i_137_;
		if (Class448.aClass448_6188.anInt6189 * -21180569 == i_134_)
		    class475_sub1_sub1_sub3_sub1.setPosition(i_138_, i_139_,
							     1004930010);
		else {
		    playerMovementTypes[i] = (byte) (i_134_ - 1);
		    class475_sub1_sub1_sub3_sub1.moveTo(i_138_, i_139_,
							     playerMovementTypes[i],
							     -1725374689);
		}
		class475_sub1_sub1_sub3_sub1.nodePlane
		    = class475_sub1_sub1_sub3_sub1.aByte8745
		    = (byte) (class475_sub1_sub1_sub3_sub1.nodePlane + i_135_
			      & 0x3);
		if (client.aClass238_8477.method4753((byte) -104)
			.method4331(i_138_, i_139_, -1046277182))
		    class475_sub1_sub1_sub3_sub1.aByte8745++;
		if (1124115145 * client.myPlayerIndex == i
		    && (Class357_Sub1.anInt10357 * 993680393
			!= class475_sub1_sub1_sub3_sub1.nodePlane))
		    Class357_Sub1.anInt10357
			= -1355156935 * class475_sub1_sub1_sub3_sub1.nodePlane;
	    } else {
		int i_140_ = class241_sub3_sub1.readBits(3, 1938027792);
		int i_141_ = class241_sub3_sub1.readBits(30, 584004812);
		int i_142_ = i_141_ >> 28 & 0x3;
		int i_143_ = i_141_ >> 14 & 0x3fff;
		int i_144_ = i_141_ & 0x3fff;
		int i_145_ = ((i_143_ + (127679513 * class522.baseX
					 + (class475_sub1_sub1_sub3_sub1
					    .scenePositionXQueue[0]))
			       & 0x3fff)
			      - class522.baseX * 127679513);
		int i_146_ = ((i_144_ + (468558693 * class522.baseY
					 + (class475_sub1_sub1_sub3_sub1
					    .scenePositionYQueue[0]))
			       & 0x3fff)
			      - 468558693 * class522.baseY);
		if (-21180569 * Class448.aClass448_6188.anInt6189 == i_140_)
		    class475_sub1_sub1_sub3_sub1.setPosition(i_145_, i_146_,
							     1979946630);
		else {
		    playerMovementTypes[i] = (byte) (i_140_ - 1);
		    class475_sub1_sub1_sub3_sub1.moveTo(i_145_, i_146_,
							     playerMovementTypes[i],
							     -1510046002);
		}
		class475_sub1_sub1_sub3_sub1.nodePlane
		    = class475_sub1_sub1_sub3_sub1.aByte8745
		    = (byte) (class475_sub1_sub1_sub3_sub1.nodePlane + i_142_
			      & 0x3);
		if (client.aClass238_8477.method4753((byte) -8)
			.method4331(i_145_, i_146_, 1663726333))
		    class475_sub1_sub1_sub3_sub1.aByte8745++;
		if (client.myPlayerIndex * 1124115145 == i)
		    Class357_Sub1.anInt10357
			= -1355156935 * class475_sub1_sub1_sub3_sub1.nodePlane;
	    }
	}
    }
    
    static {
		skippingFlags = new byte[2048];
		playerMovementTypes = new byte[2048];
		aClass241_Sub3Array2373 = new RSByteBuffer[2048];
		aClass241_Sub3Array2366 = new RSByteBuffer[2048];
		viewportPlayerCount = 0;
		viewportPlayerIndicies = new int[2048];
		outsidePlayerCount = 0;
		outsidePlayerIndicies = new int[2048];
		playerRegions = new Class26[2048];
		maskUpdateCount = 0;
		maskUpdates = new int[2048];
    }
    
    static final void method4011(RSBitBuffer class241_sub3_sub1) {
	int i = 0;
	class241_sub3_sub1.initBitAccess(1628510173);
	for (int i_147_ = 0; i_147_ < 794073197 * viewportPlayerCount; i_147_++) {
	    int i_148_ = viewportPlayerIndicies[i_147_];
	    if (0 == (skippingFlags[i_148_] & 0x1)) {
		if (i > 0) {
		    i--;
		    skippingFlags[i_148_] |= 0x2;
		} else {
		    int i_149_ = class241_sub3_sub1.readBits(1, -919240381);
		    if (0 == i_149_) {
			i = Class459.decodeSkip(class241_sub3_sub1,
						 -1835207404);
			skippingFlags[i_148_] |= 0x2;
		    } else
			Class284.unpackLocationUpdate(class241_sub3_sub1, i_148_,
					    -2093092434);
		}
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) 14);
	if (0 != i)
	    throw new RuntimeException();
	class241_sub3_sub1.initBitAccess(1628510173);
	for (int i_150_ = 0; i_150_ < 794073197 * viewportPlayerCount; i_150_++) {
	    int i_151_ = viewportPlayerIndicies[i_150_];
	    if ((skippingFlags[i_151_] & 0x1) != 0) {
		if (i > 0) {
		    i--;
		    skippingFlags[i_151_] |= 0x2;
		} else {
		    int i_152_ = class241_sub3_sub1.readBits(1, 1489891015);
		    if (i_152_ == 0) {
			i = Class459.decodeSkip(class241_sub3_sub1,
						 -1334488900);
			skippingFlags[i_151_] |= 0x2;
		    } else
			Class284.unpackLocationUpdate(class241_sub3_sub1, i_151_,
					    -1306698154);
		}
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) 63);
	if (0 != i)
	    throw new RuntimeException();
	class241_sub3_sub1.initBitAccess(1628510173);
	for (int i_153_ = 0; i_153_ < -626258669 * outsidePlayerCount; i_153_++) {
	    int i_154_ = outsidePlayerIndicies[i_153_];
	    if (0 != (skippingFlags[i_154_] & 0x1)) {
		if (i > 0) {
		    i--;
		    skippingFlags[i_154_] |= 0x2;
		} else {
		    int i_155_ = class241_sub3_sub1.readBits(1, 747872848);
		    if (0 == i_155_) {
			i = Class459.decodeSkip(class241_sub3_sub1,
						 -23712553);
			skippingFlags[i_154_] |= 0x2;
		    } else if (Class343.decodeRegionHash(class241_sub3_sub1, i_154_,
						   (byte) 1))
			skippingFlags[i_154_] |= 0x2;
		}
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) 68);
	if (0 != i)
	    throw new RuntimeException();
	class241_sub3_sub1.initBitAccess(1628510173);
	for (int i_156_ = 0; i_156_ < -626258669 * outsidePlayerCount; i_156_++) {
	    int i_157_ = outsidePlayerIndicies[i_156_];
	    if (0 == (skippingFlags[i_157_] & 0x1)) {
		if (i > 0) {
		    i--;
		    skippingFlags[i_157_] |= 0x2;
		} else {
		    int i_158_ = class241_sub3_sub1.readBits(1, 648279161);
		    if (0 == i_158_) {
			i = Class459.decodeSkip(class241_sub3_sub1,
						 -697372330);
			skippingFlags[i_157_] |= 0x2;
		    } else if (Class343.decodeRegionHash(class241_sub3_sub1, i_157_,
						   (byte) 1))
			skippingFlags[i_157_] |= 0x2;
		}
	    }
	}
	class241_sub3_sub1.finishBitAccess((byte) 70);
	if (i != 0)
	    throw new RuntimeException();
	viewportPlayerCount = 0;
	outsidePlayerCount = 0;
	for (int i_159_ = 1; i_159_ < 2048; i_159_++) {
	    skippingFlags[i_159_] >>= 1;
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[i_159_];
	    if (null != class475_sub1_sub1_sub3_sub1)
		viewportPlayerIndicies[(viewportPlayerCount += -1705037467) * 794073197 - 1]
		    = i_159_;
	    else
		outsidePlayerIndicies[(outsidePlayerCount += -1083587301) * -626258669 - 1]
		    = i_159_;
	}
    }
    
    static final void method4012(RSBitBuffer class241_sub3_sub1) {
	for (int i = 0; i < 1511793725 * maskUpdateCount; i++) {
	    class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_160_ = maskUpdates[i];
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[i_160_];
	    int i_161_ = class241_sub3_sub1.readUnsignedByte((byte) 63);
	    if ((i_161_ & 0x8) != 0)
		i_161_ += class241_sub3_sub1.readUnsignedByte((byte) 76) << 8;
	    if (0 != (i_161_ & 0x2000))
		i_161_ += class241_sub3_sub1.readUnsignedByte((byte) 10) << 16;
	    Class480.decodeMasks(class241_sub3_sub1, i_160_,
				 class475_sub1_sub1_sub3_sub1, i_161_,
				 (byte) 36);
	}
    }
    
    static final void method4013
	(RSBitBuffer class241_sub3_sub1, int i,
	 Player class475_sub1_sub1_sub3_sub1,
	 int i_162_) {
	if (0 != (i_162_ & 0x1000)) {
	    int i_163_ = class241_sub3_sub1.readUnsignedByteS((byte) 12);
	    int[] is = new int[i_163_];
	    int[] is_164_ = new int[i_163_];
	    int[] is_165_ = new int[i_163_];
	    for (int i_166_ = 0; i_166_ < i_163_; i_166_++) {
		is[i_166_] = class241_sub3_sub1.readBigSmart((byte) -14);
		is_164_[i_166_] = class241_sub3_sub1.readUnsignedByte((byte) -26);
		is_165_[i_166_] = class241_sub3_sub1.readUnsignedLEShortA(-1040473523);
	    }
	    Class107.method2685(class475_sub1_sub1_sub3_sub1, is, is_164_,
				is_165_, -1768070699);
	}
	if ((i_162_ & 0x10000) != 0) {
	    class475_sub1_sub1_sub3_sub1.aByte11416
		= class241_sub3_sub1.getByteC(537746309);
	    class475_sub1_sub1_sub3_sub1.aByte11395
		= class241_sub3_sub1.getByteC(537746309);
	    class475_sub1_sub1_sub3_sub1.aByte11412
		= class241_sub3_sub1.readByteA(582493488);
	    class475_sub1_sub1_sub3_sub1.aByte11413
		= (byte) class241_sub3_sub1.readUnsignedByteS((byte) 61);
	    class475_sub1_sub1_sub3_sub1.anInt11408
		= (client.anInt8296
		   + class241_sub3_sub1.readUnsignedShort(1162222719)) * -1558068143;
	    class475_sub1_sub1_sub3_sub1.anInt11389
		= (client.anInt8296
		   + class241_sub3_sub1.readUnsignedShortA((byte) 23)) * -960497231;
	}
	if ((i_162_ & 0x400000) != 0) {
	    int i_167_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_168_ = class241_sub3_sub1.readIntV2(1274614902);
	    if (65535 == i_167_)
		i_167_ = -1;
	    int i_169_ = class241_sub3_sub1.getByteA(-1953079183);
	    int i_170_ = i_169_ & 0x7;
	    int i_171_ = i_169_ >> 3 & 0xf;
	    if (15 == i_171_)
		i_171_ = -1;
	    boolean bool = (i_169_ >> 7 & 0x1) == 1;
	    class475_sub1_sub1_sub3_sub1.method17788(i_167_, i_168_, i_170_,
						     i_171_, bool, 4,
						     1752514616);
	}
	if ((i_162_ & 0x100) != 0)
	    class475_sub1_sub1_sub3_sub1.aBool11496
		= class241_sub3_sub1.readByteC((byte) 79) == 1;
	if (0 != (i_162_ & 0x2)) {
	    int i_172_ = class241_sub3_sub1.readUnsignedLEShort((short) 20113);
	    if (i_172_ == 65535)
		i_172_ = -1;
	    class475_sub1_sub1_sub3_sub1.facingEntity = i_172_ * 1027225177;
	}
	if ((i_162_ & 0x8000) != 0) {
	    int i_173_ = class241_sub3_sub1.readUnsignedLEShortA(2034505706);
	    int i_174_ = class241_sub3_sub1.readIntV2(1274614902);
	    if (65535 == i_173_)
		i_173_ = -1;
	    int i_175_ = class241_sub3_sub1.readByteC((byte) 105);
	    int i_176_ = i_175_ & 0x7;
	    int i_177_ = i_175_ >> 3 & 0xf;
	    if (15 == i_177_)
		i_177_ = -1;
	    boolean bool = 1 == (i_175_ >> 7 & 0x1);
	    class475_sub1_sub1_sub3_sub1.method17788(i_173_, i_174_, i_176_,
						     i_177_, bool, 1,
						     -1670211780);
	}
	if (0 != (i_162_ & 0x20000)) {
	    int i_178_ = class241_sub3_sub1.readByteC((byte) 108);
	    int[] is = new int[i_178_];
	    int[] is_179_ = new int[i_178_];
	    for (int i_180_ = 0; i_180_ < i_178_; i_180_++) {
		int i_181_ = class241_sub3_sub1.readUnsignedLEShort((short) 2933);
		if ((i_181_ & 0xc000) == 49152) {
		    int i_182_ = class241_sub3_sub1.readUnsignedLEShortA(1303943621);
		    is[i_180_] = i_181_ << 16 | i_182_;
		} else
		    is[i_180_] = i_181_;
		is_179_[i_180_] = class241_sub3_sub1.readUnsignedLEShortA(1688608427);
	    }
	    class475_sub1_sub1_sub3_sub1.method17773(is, is_179_, 494953305);
	}
	if (0 != (i_162_ & 0x200000))
	    class475_sub1_sub1_sub3_sub1.aBool11494
		= class241_sub3_sub1.getByteA(-1936567268) == 1;
	if (0 != (i_162_ & 0x400)) {
	    int i_183_ = class241_sub3_sub1.readUnsignedLEShort((short) 22559);
	    int i_184_ = class241_sub3_sub1.readIntV1((short) 31759);
	    if (i_183_ == 65535)
		i_183_ = -1;
	    int i_185_ = class241_sub3_sub1.readUnsignedByteS((byte) 64);
	    int i_186_ = i_185_ & 0x7;
	    int i_187_ = i_185_ >> 3 & 0xf;
	    if (i_187_ == 15)
		i_187_ = -1;
	    boolean bool = (i_185_ >> 7 & 0x1) == 1;
	    class475_sub1_sub1_sub3_sub1.method17788(i_183_, i_184_, i_186_,
						     i_187_, bool, 2,
						     1126258555);
	}
	if ((i_162_ & 0x10) != 0) {
	    int[] is = new int[4];
	    for (int i_188_ = 0; i_188_ < 4; i_188_++)
		is[i_188_] = class241_sub3_sub1.readBigSmart((byte) -23);
	    int i_189_ = class241_sub3_sub1.readUnsignedByte((byte) -10);
	    Class638.method13557(class475_sub1_sub1_sub3_sub1, is, i_189_,
				 false, (byte) 57);
	}
	if (0 != (i_162_ & 0x80000)) {
	    class241_sub3_sub1.pointer += -1362085898;
	    int i_190_
		= ((class241_sub3_sub1.payload
		    [((class241_sub3_sub1.pointer += -681042949) * 421967667
		      - 1)])
		   & 0xff);
	    for (int i_191_ = 0; i_191_ < i_190_; i_191_++) {
		int i_192_ = class241_sub3_sub1.readUnsignedByte((byte) -102);
		BaseVarType class217
		    = (BaseVarType) Class494.method11278(BaseVarType.class, i_192_,
						      (byte) -60);
		Class254 class254
		    = (Class177.VAR_PLAYER_LIST.decodeVarValue
		       (class241_sub3_sub1, class217, -1843925137));
		class475_sub1_sub1_sub3_sub1.anInterface46_11409.method335
		    (class254.key * 623518843, class254.value,
		     (byte) -86);
	    }
	}
	if (0 != (i_162_ & 0x1)) {
	    int i_193_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_194_ = class241_sub3_sub1.readIntV1((short) 15679);
	    if (65535 == i_193_)
		i_193_ = -1;
	    int i_195_ = class241_sub3_sub1.readUnsignedByteS((byte) 14);
	    int i_196_ = i_195_ & 0x7;
	    int i_197_ = i_195_ >> 3 & 0xf;
	    if (i_197_ == 15)
		i_197_ = -1;
	    boolean bool = 1 == (i_195_ >> 7 & 0x1);
	    class475_sub1_sub1_sub3_sub1.method17788(i_193_, i_194_, i_196_,
						     i_197_, bool, 0,
						     419409431);
	}
	if ((i_162_ & 0x40000) != 0) {
	    class475_sub1_sub1_sub3_sub1.anInterface46_11409
		.method195(-1515300354);
	    class241_sub3_sub1.pointer += -1362085898;
	    int i_198_
		= ((class241_sub3_sub1.payload
		    [((class241_sub3_sub1.pointer += -681042949) * 421967667
		      - 1)])
		   & 0xff);
	    for (int i_199_ = 0; i_199_ < i_198_; i_199_++) {
		int i_200_ = class241_sub3_sub1.readByteC((byte) 80);
		BaseVarType class217
		    = (BaseVarType) Class494.method11278(BaseVarType.class, i_200_,
						      (byte) -55);
		Class254 class254
		    = (Class177.VAR_PLAYER_LIST.decodeVarValue
		       (class241_sub3_sub1, class217, -1843925137));
		class475_sub1_sub1_sub3_sub1.anInterface46_11409.method335
		    (class254.key * 623518843, class254.value,
		     (byte) 4);
	    }
	}
	if ((i_162_ & 0x800) != 0) {
	    int i_201_ = class241_sub3_sub1.readByteC((byte) 63);
	    byte[] is = new byte[i_201_];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    class241_sub3_sub1.readReverseA(is, 0, i_201_, 1880951388);
	    aClass241_Sub3Array2366[i] = class241_sub3;
	    class475_sub1_sub1_sub3_sub1.method17955(class241_sub3,
						     1959480169);
	}
	if ((i_162_ & 0x80) != 0) {
	    int i_202_ = class241_sub3_sub1.readUnsignedByteS((byte) 47);
	    byte[] is = new byte[i_202_];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    class241_sub3_sub1.readReverseA(is, 0, i_202_, 1542753586);
	    aClass241_Sub3Array2373[i] = class241_sub3;
	    class475_sub1_sub1_sub3_sub1.decodeCharacterData(class241_sub3, (byte) 14);
	}
	if ((i_162_ & 0x4) != 0) {
	    int i_203_ = class241_sub3_sub1.readByteC((byte) 5);
	    if (i_203_ > 0) {
		for (int i_204_ = 0; i_204_ < i_203_; i_204_++) {
		    int i_205_ = -1;
		    int i_206_ = -1;
		    int i_207_ = -1;
		    int i_208_ = class241_sub3_sub1.readSmart((short) -401);
		    if (i_208_ == 32767) {
			i_208_
			    = class241_sub3_sub1.readSmart((short) -28369);
			i_206_
			    = class241_sub3_sub1.readSmart((short) -13276);
			i_205_
			    = class241_sub3_sub1.readSmart((short) -11869);
			i_207_ = class241_sub3_sub1.readSmart((short) -9638);
		    } else if (32766 != i_208_)
			i_206_ = class241_sub3_sub1.readSmart((short) -4701);
		    else {
			i_208_ = -1;
			i_206_ = class241_sub3_sub1.readUnsignedByteS((byte) 123);
		    }
		    int i_209_
			= class241_sub3_sub1.readSmart((short) -24127);
		    class475_sub1_sub1_sub3_sub1.setHitMark(i_208_, i_206_,
							     i_205_, i_207_,
							     client.anInt8296,
							     i_209_,
							     -1748666182);
		}
	    }
	    int i_210_ = class241_sub3_sub1.readUnsignedByteS((byte) 103);
	    if (i_210_ > 0) {
		for (int i_211_ = 0; i_211_ < i_210_; i_211_++) {
		    int i_212_ = class241_sub3_sub1.readSmart((short) -5760);
		    int i_213_
			= class241_sub3_sub1.readSmart((short) -29146);
		    if (i_213_ != 32767) {
			int i_214_
			    = class241_sub3_sub1.readSmart((short) -14822);
			int i_215_ = class241_sub3_sub1.readUnsignedByteS((byte) 31);
			int i_216_
			    = (i_213_ > 0
			       ? class241_sub3_sub1.readUnsignedByteS((byte) 54)
			       : i_215_);
			class475_sub1_sub1_sub3_sub1.method17791
			    (i_212_, client.anInt8296, i_213_, i_214_, i_215_,
			     i_216_, (byte) 0);
		    } else
			class475_sub1_sub1_sub3_sub1.method17780(i_212_,
								 286511346);
		}
	    }
	}
	if ((i_162_ & 0x100000) != 0) {
	    String string = class241_sub3_sub1.readString(-1480614601);
	    int i_217_ = class241_sub3_sub1.getByteA(-1929242238);
	    if ((i_217_ & 0x1) != 0)
		Class318.appendChatboxMessage(2, i_217_,
				    class475_sub1_sub1_sub3_sub1
					.getFormattedName(true, -103667313),
				    class475_sub1_sub1_sub3_sub1
					.getName(false, -122333825),
				    class475_sub1_sub1_sub3_sub1.nameFiltered,
				    string, -1892267120);
	    class475_sub1_sub1_sub3_sub1.setOverheadMessage(string, 0, 0, (byte) 42);
	}
	if (0 != (i_162_ & 0x20)) {
	    class475_sub1_sub1_sub3_sub1.facingDirection
		= class241_sub3_sub1.readUnsignedLEShort((short) 960) * 1164488315;
	    if (class475_sub1_sub1_sub3_sub1.queuedStepCount * -316498507 == 0) {
		class475_sub1_sub1_sub3_sub1.method17804
		    (class475_sub1_sub1_sub3_sub1.facingDirection * -989200205,
		     1983332995);
		class475_sub1_sub1_sub3_sub1.facingDirection = -1164488315;
	    }
	}
	if (0 != (i_162_ & 0x800000)) {
	    int i_218_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_219_ = class241_sub3_sub1.readInt((byte) 26);
	    if (65535 == i_218_)
		i_218_ = -1;
	    int i_220_ = class241_sub3_sub1.readUnsignedByteS((byte) 83);
	    int i_221_ = i_220_ & 0x7;
	    int i_222_ = i_220_ >> 3 & 0xf;
	    if (i_222_ == 15)
		i_222_ = -1;
	    boolean bool = 1 == (i_220_ >> 7 & 0x1);
	    class475_sub1_sub1_sub3_sub1.method17788(i_218_, i_219_, i_221_,
						     i_222_, bool, 3,
						     -2103233773);
	}
	if (0 != (i_162_ & 0x4000)) {
	    String string = class241_sub3_sub1.readString(1559510462);
	    if (Class21.myPlayer
		== class475_sub1_sub1_sub3_sub1)
		Class318.appendChatboxMessage(2, 0,
				    class475_sub1_sub1_sub3_sub1
					.getFormattedName(true, -443500411),
				    class475_sub1_sub1_sub3_sub1
					.getName(false, -122333825),
				    class475_sub1_sub1_sub3_sub1.nameFiltered,
				    string, -1577795335);
	    class475_sub1_sub1_sub3_sub1.setOverheadMessage(string, 0, 0, (byte) 57);
	}
	if ((i_162_ & 0x40) != 0) {
	    class475_sub1_sub1_sub3_sub1.anInt11401
		= class241_sub3_sub1.readByteA(582493488) * 2045684417;
	    class475_sub1_sub1_sub3_sub1.anInt11403
		= class241_sub3_sub1.readByteS((byte) 1) * -182768233;
	    class475_sub1_sub1_sub3_sub1.anInt11402
		= class241_sub3_sub1.readByteS((byte) 1) * -9202803;
	    class475_sub1_sub1_sub3_sub1.anInt11428
		= class241_sub3_sub1.getByteC(537746309) * -1841438277;
	    class475_sub1_sub1_sub3_sub1.anInt11386
		= (class241_sub3_sub1.readUnsignedLEShort((short) 24418)
		   + client.anInt8296) * 1486211439;
	    class475_sub1_sub1_sub3_sub1.anInt11422
		= (class241_sub3_sub1.readUnsignedShortA((byte) 73)
		   + client.anInt8296) * -2087589789;
	    class475_sub1_sub1_sub3_sub1.anInt11407
		= class241_sub3_sub1.readUnsignedShortA((byte) 52) * 364183757;
	    class475_sub1_sub1_sub3_sub1.anInt11401
		+= (class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0]
		    * 2045684417);
	    class475_sub1_sub1_sub3_sub1.anInt11403
		+= (-182768233
		    * class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0]);
	    class475_sub1_sub1_sub3_sub1.anInt11402
		+= class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0] * -9202803;
	    class475_sub1_sub1_sub3_sub1.anInt11428
		+= (-1841438277
		    * class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0]);
	    class475_sub1_sub1_sub3_sub1.queuedStepCount = 1631398045;
	    class475_sub1_sub1_sub3_sub1.anInt11430 = 0;
	}
    }
    
    static final void method4014(RSBitBuffer class241_sub3_sub1) {
	for (int i = 0; i < 1511793725 * maskUpdateCount; i++) {
	    class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_223_ = maskUpdates[i];
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[i_223_];
	    int i_224_ = class241_sub3_sub1.readUnsignedByte((byte) 96);
	    if ((i_224_ & 0x8) != 0)
		i_224_ += class241_sub3_sub1.readUnsignedByte((byte) -41) << 8;
	    if (0 != (i_224_ & 0x2000))
		i_224_ += class241_sub3_sub1.readUnsignedByte((byte) -71) << 16;
	    Class480.decodeMasks(class241_sub3_sub1, i_223_,
				 class475_sub1_sub1_sub3_sub1, i_224_,
				 (byte) 41);
	}
    }
    
    static void method4015(RSBitBuffer class241_sub3_sub1, int i) {
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	boolean bool = class241_sub3_sub1.readBits(1, -401877944) == 1;
	if (bool)
	    maskUpdates[(maskUpdateCount += 847942421) * 1511793725 - 1] = i;
	int i_225_ = class241_sub3_sub1.readBits(2, 918727902);
	Player class475_sub1_sub1_sub3_sub1
	    = client.localPlayers[i];
	if (0 == i_225_) {
	    if (!bool) {
		if (1124115145 * client.myPlayerIndex == i)
		    throw new RuntimeException();
		Class26 class26 = playerRegions[i] = new Class26();
		Class84.method1836(-2105628993);
		((Class26) class26).regionHash
		    = ((((class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0]
			  + 468558693 * class522.baseY)
			 >> 6)
			+ (((127679513 * class522.baseX
			     + class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0])
			    >> 6 << 14)
			   + (class475_sub1_sub1_sub3_sub1.nodePlane << 28)))
		       * -1163590993);
		if (class475_sub1_sub1_sub3_sub1.facingDirection * -989200205 != -1)
		    ((Class26) class26).anInt214
			= (-1934976107
			   * class475_sub1_sub1_sub3_sub1.facingDirection);
		else
		    ((Class26) class26).anInt214
			= class475_sub1_sub1_sub3_sub1.aClass8_11406
			      .method514((byte) -19) * -381679977;
		((Class26) class26).anInt216
		    = 1730284449 * class475_sub1_sub1_sub3_sub1.facingEntity;
		((Class26) class26).aBool217
		    = class475_sub1_sub1_sub3_sub1.aBool11496;
		((Class26) class26).aBool218
		    = class475_sub1_sub1_sub3_sub1.aBool11494;
		if (class475_sub1_sub1_sub3_sub1.anInt11513 * 1294463297 > 0)
		    Class361_Sub1.method16755(class475_sub1_sub1_sub3_sub1,
					      1482319719);
		client.localPlayers[i] = null;
		if (class241_sub3_sub1.readBits(1, 924940197) != 0)
		    Class343.decodeRegionHash(class241_sub3_sub1, i, (byte) 1);
	    }
	} else if (1 == i_225_) {
	    int i_226_ = class241_sub3_sub1.readBits(3, 1622792506);
	    int i_227_ = class241_sub3_sub1.readBits(1, 2096025347);
	    int i_228_ = class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0];
	    int i_229_ = class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0];
	    if (1 == i_227_) {
		int i_230_ = class241_sub3_sub1.readBits(2, 945523753);
		switch (i_230_) {
		case 1:
		    class475_sub1_sub1_sub3_sub1.moveTo(i_228_ - 1,
							     i_229_,
							     playerMovementTypes[i],
							     426449114);
		    break;
		case 2:
		    class475_sub1_sub1_sub3_sub1.moveTo(i_228_ + 1,
							     i_229_,
							     playerMovementTypes[i],
							     40139928);
		    break;
		case 0:
		    class475_sub1_sub1_sub3_sub1.moveTo(i_228_,
							     1 + i_229_,
							     playerMovementTypes[i],
							     -1453215395);
		    break;
		case 3:
		    class475_sub1_sub1_sub3_sub1.moveTo(i_228_,
							     i_229_ - 1,
							     playerMovementTypes[i],
							     -193822841);
		    break;
		}
	    }
	    if (0 == i_226_) {
		i_228_--;
		i_229_--;
	    } else if (1 == i_226_)
		i_229_--;
	    else if (2 == i_226_) {
		i_228_++;
		i_229_--;
	    } else if (3 == i_226_)
		i_228_--;
	    else if (i_226_ == 4)
		i_228_++;
	    else if (i_226_ == 5) {
		i_228_--;
		i_229_++;
	    } else if (i_226_ == 6)
		i_229_++;
	    else if (i_226_ == 7) {
		i_228_++;
		i_229_++;
	    }
	    class475_sub1_sub1_sub3_sub1
		.moveTo(i_228_, i_229_, playerMovementTypes[i], 668040906);
	} else if (2 == i_225_) {
	    int i_231_ = class241_sub3_sub1.readBits(4, 2111821503);
	    int i_232_ = class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0];
	    int i_233_ = class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0];
	    if (0 == i_231_) {
		i_232_ -= 2;
		i_233_ -= 2;
	    } else if (1 == i_231_) {
		i_232_--;
		i_233_ -= 2;
	    } else if (i_231_ == 2)
		i_233_ -= 2;
	    else if (3 == i_231_) {
		i_232_++;
		i_233_ -= 2;
	    } else if (i_231_ == 4) {
		i_232_ += 2;
		i_233_ -= 2;
	    } else if (5 == i_231_) {
		i_232_ -= 2;
		i_233_--;
	    } else if (6 == i_231_) {
		i_232_ += 2;
		i_233_--;
	    } else if (i_231_ == 7)
		i_232_ -= 2;
	    else if (8 == i_231_)
		i_232_ += 2;
	    else if (9 == i_231_) {
		i_232_ -= 2;
		i_233_++;
	    } else if (10 == i_231_) {
		i_232_ += 2;
		i_233_++;
	    } else if (i_231_ == 11) {
		i_232_ -= 2;
		i_233_ += 2;
	    } else if (12 == i_231_) {
		i_232_--;
		i_233_ += 2;
	    } else if (i_231_ == 13)
		i_233_ += 2;
	    else if (i_231_ == 14) {
		i_232_++;
		i_233_ += 2;
	    } else if (i_231_ == 15) {
		i_232_ += 2;
		i_233_ += 2;
	    }
	    class475_sub1_sub1_sub3_sub1
		.moveTo(i_232_, i_233_, playerMovementTypes[i], 628604264);
	} else {
	    int i_234_ = class241_sub3_sub1.readBits(1, -188124158);
	    if (0 == i_234_) {
		int i_235_ = class241_sub3_sub1.readBits(15, 1924562930);
		int i_236_ = i_235_ >> 12 & 0x7;
		int i_237_ = (byte) (i_235_ >> 10) & 0x3;
		int i_238_ = i_235_ >> 5 & 0x1f;
		if (i_238_ > 15)
		    i_238_ -= 32;
		int i_239_ = i_235_ & 0x1f;
		if (i_239_ > 15)
		    i_239_ -= 32;
		int i_240_
		    = class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0] + i_238_;
		int i_241_
		    = class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0] + i_239_;
		if (Class448.aClass448_6188.anInt6189 * -21180569 == i_236_)
		    class475_sub1_sub1_sub3_sub1.setPosition(i_240_, i_241_,
							     1098778408);
		else {
		    playerMovementTypes[i] = (byte) (i_236_ - 1);
		    class475_sub1_sub1_sub3_sub1.moveTo(i_240_, i_241_,
							     playerMovementTypes[i],
							     2049199326);
		}
		class475_sub1_sub1_sub3_sub1.nodePlane
		    = class475_sub1_sub1_sub3_sub1.aByte8745
		    = (byte) (class475_sub1_sub1_sub3_sub1.nodePlane + i_237_
			      & 0x3);
		if (client.aClass238_8477.method4753((byte) -90)
			.method4331(i_240_, i_241_, -1215687127))
		    class475_sub1_sub1_sub3_sub1.aByte8745++;
		if (1124115145 * client.myPlayerIndex == i
		    && (Class357_Sub1.anInt10357 * 993680393
			!= class475_sub1_sub1_sub3_sub1.nodePlane))
		    Class357_Sub1.anInt10357
			= -1355156935 * class475_sub1_sub1_sub3_sub1.nodePlane;
	    } else {
		int i_242_ = class241_sub3_sub1.readBits(3, 543324296);
		int i_243_ = class241_sub3_sub1.readBits(30, -151338412);
		int i_244_ = i_243_ >> 28 & 0x3;
		int i_245_ = i_243_ >> 14 & 0x3fff;
		int i_246_ = i_243_ & 0x3fff;
		int i_247_ = ((i_245_ + (127679513 * class522.baseX
					 + (class475_sub1_sub1_sub3_sub1
					    .scenePositionXQueue[0]))
			       & 0x3fff)
			      - class522.baseX * 127679513);
		int i_248_ = ((i_246_ + (468558693 * class522.baseY
					 + (class475_sub1_sub1_sub3_sub1
					    .scenePositionYQueue[0]))
			       & 0x3fff)
			      - 468558693 * class522.baseY);
		if (-21180569 * Class448.aClass448_6188.anInt6189 == i_242_)
		    class475_sub1_sub1_sub3_sub1.setPosition(i_247_, i_248_,
							     651233711);
		else {
		    playerMovementTypes[i] = (byte) (i_242_ - 1);
		    class475_sub1_sub1_sub3_sub1.moveTo(i_247_, i_248_,
							     playerMovementTypes[i],
							     392436168);
		}
		class475_sub1_sub1_sub3_sub1.nodePlane
		    = class475_sub1_sub1_sub3_sub1.aByte8745
		    = (byte) (class475_sub1_sub1_sub3_sub1.nodePlane + i_244_
			      & 0x3);
		if (client.aClass238_8477.method4753((byte) -81)
			.method4331(i_247_, i_248_, -327046044))
		    class475_sub1_sub1_sub3_sub1.aByte8745++;
		if (client.myPlayerIndex * 1124115145 == i)
		    Class357_Sub1.anInt10357
			= -1355156935 * class475_sub1_sub1_sub3_sub1.nodePlane;
	    }
	}
    }
    
    GPI() throws Throwable {
	throw new Error();
    }
    
    static final void method4016
	(RSBitBuffer class241_sub3_sub1, int i,
	 Player class475_sub1_sub1_sub3_sub1,
	 int i_249_) {
	if (0 != (i_249_ & 0x1000)) {
	    int i_250_ = class241_sub3_sub1.readUnsignedByteS((byte) 78);
	    int[] is = new int[i_250_];
	    int[] is_251_ = new int[i_250_];
	    int[] is_252_ = new int[i_250_];
	    for (int i_253_ = 0; i_253_ < i_250_; i_253_++) {
		is[i_253_] = class241_sub3_sub1.readBigSmart((byte) 61);
		is_251_[i_253_] = class241_sub3_sub1.readUnsignedByte((byte) 9);
		is_252_[i_253_] = class241_sub3_sub1.readUnsignedLEShortA(-745630841);
	    }
	    Class107.method2685(class475_sub1_sub1_sub3_sub1, is, is_251_,
				is_252_, -1080608931);
	}
	if ((i_249_ & 0x10000) != 0) {
	    class475_sub1_sub1_sub3_sub1.aByte11416
		= class241_sub3_sub1.getByteC(537746309);
	    class475_sub1_sub1_sub3_sub1.aByte11395
		= class241_sub3_sub1.getByteC(537746309);
	    class475_sub1_sub1_sub3_sub1.aByte11412
		= class241_sub3_sub1.readByteA(582493488);
	    class475_sub1_sub1_sub3_sub1.aByte11413
		= (byte) class241_sub3_sub1.readUnsignedByteS((byte) 67);
	    class475_sub1_sub1_sub3_sub1.anInt11408
		= (client.anInt8296
		   + class241_sub3_sub1.readUnsignedShort(1162222719)) * -1558068143;
	    class475_sub1_sub1_sub3_sub1.anInt11389
		= (client.anInt8296
		   + class241_sub3_sub1.readUnsignedShortA((byte) 66)) * -960497231;
	}
	if ((i_249_ & 0x400000) != 0) {
	    int i_254_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_255_ = class241_sub3_sub1.readIntV2(1274614902);
	    if (65535 == i_254_)
		i_254_ = -1;
	    int i_256_ = class241_sub3_sub1.getByteA(-1977191024);
	    int i_257_ = i_256_ & 0x7;
	    int i_258_ = i_256_ >> 3 & 0xf;
	    if (15 == i_258_)
		i_258_ = -1;
	    boolean bool = (i_256_ >> 7 & 0x1) == 1;
	    class475_sub1_sub1_sub3_sub1.method17788(i_254_, i_255_, i_257_,
						     i_258_, bool, 4,
						     -725615484);
	}
	if ((i_249_ & 0x100) != 0)
	    class475_sub1_sub1_sub3_sub1.aBool11496
		= class241_sub3_sub1.readByteC((byte) 38) == 1;
	if (0 != (i_249_ & 0x2)) {
	    int i_259_ = class241_sub3_sub1.readUnsignedLEShort((short) 15191);
	    if (i_259_ == 65535)
		i_259_ = -1;
	    class475_sub1_sub1_sub3_sub1.facingEntity = i_259_ * 1027225177;
	}
	if ((i_249_ & 0x8000) != 0) {
	    int i_260_ = class241_sub3_sub1.readUnsignedLEShortA(293019065);
	    int i_261_ = class241_sub3_sub1.readIntV2(1274614902);
	    if (65535 == i_260_)
		i_260_ = -1;
	    int i_262_ = class241_sub3_sub1.readByteC((byte) 83);
	    int i_263_ = i_262_ & 0x7;
	    int i_264_ = i_262_ >> 3 & 0xf;
	    if (15 == i_264_)
		i_264_ = -1;
	    boolean bool = 1 == (i_262_ >> 7 & 0x1);
	    class475_sub1_sub1_sub3_sub1.method17788(i_260_, i_261_, i_263_,
						     i_264_, bool, 1,
						     1996050427);
	}
	if (0 != (i_249_ & 0x20000)) {
	    int i_265_ = class241_sub3_sub1.readByteC((byte) 50);
	    int[] is = new int[i_265_];
	    int[] is_266_ = new int[i_265_];
	    for (int i_267_ = 0; i_267_ < i_265_; i_267_++) {
		int i_268_ = class241_sub3_sub1.readUnsignedLEShort((short) 18527);
		if ((i_268_ & 0xc000) == 49152) {
		    int i_269_ = class241_sub3_sub1.readUnsignedLEShortA(-722904654);
		    is[i_267_] = i_268_ << 16 | i_269_;
		} else
		    is[i_267_] = i_268_;
		is_266_[i_267_] = class241_sub3_sub1.readUnsignedLEShortA(-254546585);
	    }
	    class475_sub1_sub1_sub3_sub1.method17773(is, is_266_, 327239094);
	}
	if (0 != (i_249_ & 0x200000))
	    class475_sub1_sub1_sub3_sub1.aBool11494
		= class241_sub3_sub1.getByteA(-2034165384) == 1;
	if (0 != (i_249_ & 0x400)) {
	    int i_270_ = class241_sub3_sub1.readUnsignedLEShort((short) 2438);
	    int i_271_ = class241_sub3_sub1.readIntV1((short) 11316);
	    if (i_270_ == 65535)
		i_270_ = -1;
	    int i_272_ = class241_sub3_sub1.readUnsignedByteS((byte) 17);
	    int i_273_ = i_272_ & 0x7;
	    int i_274_ = i_272_ >> 3 & 0xf;
	    if (i_274_ == 15)
		i_274_ = -1;
	    boolean bool = (i_272_ >> 7 & 0x1) == 1;
	    class475_sub1_sub1_sub3_sub1.method17788(i_270_, i_271_, i_273_,
						     i_274_, bool, 2,
						     -276507818);
	}
	if ((i_249_ & 0x10) != 0) {
	    int[] is = new int[4];
	    for (int i_275_ = 0; i_275_ < 4; i_275_++)
		is[i_275_] = class241_sub3_sub1.readBigSmart((byte) 5);
	    int i_276_ = class241_sub3_sub1.readUnsignedByte((byte) 20);
	    Class638.method13557(class475_sub1_sub1_sub3_sub1, is, i_276_,
				 false, (byte) 39);
	}
	if (0 != (i_249_ & 0x80000)) {
	    class241_sub3_sub1.pointer += -1362085898;
	    int i_277_
		= ((class241_sub3_sub1.payload
		    [((class241_sub3_sub1.pointer += -681042949) * 421967667
		      - 1)])
		   & 0xff);
	    for (int i_278_ = 0; i_278_ < i_277_; i_278_++) {
		int i_279_ = class241_sub3_sub1.readUnsignedByte((byte) -25);
		BaseVarType class217
		    = (BaseVarType) Class494.method11278(BaseVarType.class, i_279_,
						      (byte) -18);
		Class254 class254
		    = (Class177.VAR_PLAYER_LIST.decodeVarValue
		       (class241_sub3_sub1, class217, -1843925137));
		class475_sub1_sub1_sub3_sub1.anInterface46_11409.method335
		    (class254.key * 623518843, class254.value,
		     (byte) 14);
	    }
	}
	if (0 != (i_249_ & 0x1)) {
	    int i_280_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_281_ = class241_sub3_sub1.readIntV1((short) 19010);
	    if (65535 == i_280_)
		i_280_ = -1;
	    int i_282_ = class241_sub3_sub1.readUnsignedByteS((byte) 34);
	    int i_283_ = i_282_ & 0x7;
	    int i_284_ = i_282_ >> 3 & 0xf;
	    if (i_284_ == 15)
		i_284_ = -1;
	    boolean bool = 1 == (i_282_ >> 7 & 0x1);
	    class475_sub1_sub1_sub3_sub1.method17788(i_280_, i_281_, i_283_,
						     i_284_, bool, 0,
						     371424097);
	}
	if ((i_249_ & 0x40000) != 0) {
	    class475_sub1_sub1_sub3_sub1.anInterface46_11409
		.method195(-2087267175);
	    class241_sub3_sub1.pointer += -1362085898;
	    int i_285_
		= ((class241_sub3_sub1.payload
		    [((class241_sub3_sub1.pointer += -681042949) * 421967667
		      - 1)])
		   & 0xff);
	    for (int i_286_ = 0; i_286_ < i_285_; i_286_++) {
		int i_287_ = class241_sub3_sub1.readByteC((byte) 17);
		BaseVarType class217
		    = (BaseVarType) Class494.method11278(BaseVarType.class, i_287_,
						      (byte) -10);
		Class254 class254
		    = (Class177.VAR_PLAYER_LIST.decodeVarValue
		       (class241_sub3_sub1, class217, -1843925137));
		class475_sub1_sub1_sub3_sub1.anInterface46_11409.method335
		    (class254.key * 623518843, class254.value,
		     (byte) 64);
	    }
	}
	if ((i_249_ & 0x800) != 0) {
	    int i_288_ = class241_sub3_sub1.readByteC((byte) 6);
	    byte[] is = new byte[i_288_];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    class241_sub3_sub1.readReverseA(is, 0, i_288_, 1990207908);
	    aClass241_Sub3Array2366[i] = class241_sub3;
	    class475_sub1_sub1_sub3_sub1.method17955(class241_sub3,
						     -1757293295);
	}
	if ((i_249_ & 0x80) != 0) {
	    int i_289_ = class241_sub3_sub1.readUnsignedByteS((byte) 43);
	    byte[] is = new byte[i_289_];
	    RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	    class241_sub3_sub1.readReverseA(is, 0, i_289_, 1572617371);
	    aClass241_Sub3Array2373[i] = class241_sub3;
	    class475_sub1_sub1_sub3_sub1.decodeCharacterData(class241_sub3, (byte) 14);
	}
	if ((i_249_ & 0x4) != 0) {
	    int i_290_ = class241_sub3_sub1.readByteC((byte) 74);
	    if (i_290_ > 0) {
		for (int i_291_ = 0; i_291_ < i_290_; i_291_++) {
		    int i_292_ = -1;
		    int i_293_ = -1;
		    int i_294_ = -1;
		    int i_295_
			= class241_sub3_sub1.readSmart((short) -23982);
		    if (i_295_ == 32767) {
			i_295_ = class241_sub3_sub1.readSmart((short) -2074);
			i_293_
			    = class241_sub3_sub1.readSmart((short) -19080);
			i_292_ = class241_sub3_sub1.readSmart((short) -4080);
			i_294_
			    = class241_sub3_sub1.readSmart((short) -14864);
		    } else if (32766 != i_295_)
			i_293_
			    = class241_sub3_sub1.readSmart((short) -28358);
		    else {
			i_295_ = -1;
			i_293_ = class241_sub3_sub1.readUnsignedByteS((byte) 60);
		    }
		    int i_296_ = class241_sub3_sub1.readSmart((short) -7346);
		    class475_sub1_sub1_sub3_sub1.setHitMark(i_295_, i_293_,
							     i_292_, i_294_,
							     client.anInt8296,
							     i_296_,
							     -1949548823);
		}
	    }
	    int i_297_ = class241_sub3_sub1.readUnsignedByteS((byte) 117);
	    if (i_297_ > 0) {
		for (int i_298_ = 0; i_298_ < i_297_; i_298_++) {
		    int i_299_
			= class241_sub3_sub1.readSmart((short) -29943);
		    int i_300_ = class241_sub3_sub1.readSmart((short) -5110);
		    if (i_300_ != 32767) {
			int i_301_
			    = class241_sub3_sub1.readSmart((short) -8625);
			int i_302_ = class241_sub3_sub1.readUnsignedByteS((byte) 25);
			int i_303_
			    = (i_300_ > 0
			       ? class241_sub3_sub1.readUnsignedByteS((byte) 43)
			       : i_302_);
			class475_sub1_sub1_sub3_sub1.method17791
			    (i_299_, client.anInt8296, i_300_, i_301_, i_302_,
			     i_303_, (byte) 0);
		    } else
			class475_sub1_sub1_sub3_sub1.method17780(i_299_,
								 286511346);
		}
	    }
	}
	if ((i_249_ & 0x100000) != 0) {
	    String string = class241_sub3_sub1.readString(-1424072438);
	    int i_304_ = class241_sub3_sub1.getByteA(-1957856307);
	    if ((i_304_ & 0x1) != 0)
		Class318.appendChatboxMessage(2, i_304_,
				    class475_sub1_sub1_sub3_sub1
					.getFormattedName(true, -994491866),
				    class475_sub1_sub1_sub3_sub1
					.getName(false, -122333825),
				    class475_sub1_sub1_sub3_sub1.nameFiltered,
				    string, -1609373606);
	    class475_sub1_sub1_sub3_sub1.setOverheadMessage(string, 0, 0, (byte) 102);
	}
	if (0 != (i_249_ & 0x20)) {
	    class475_sub1_sub1_sub3_sub1.facingDirection
		= class241_sub3_sub1.readUnsignedLEShort((short) 13543) * 1164488315;
	    if (class475_sub1_sub1_sub3_sub1.queuedStepCount * -316498507 == 0) {
		class475_sub1_sub1_sub3_sub1.method17804
		    (class475_sub1_sub1_sub3_sub1.facingDirection * -989200205,
		     1981741671);
		class475_sub1_sub1_sub3_sub1.facingDirection = -1164488315;
	    }
	}
	if (0 != (i_249_ & 0x800000)) {
	    int i_305_ = class241_sub3_sub1.readUnsignedShort(1162222719);
	    int i_306_ = class241_sub3_sub1.readInt((byte) 11);
	    if (65535 == i_305_)
		i_305_ = -1;
	    int i_307_ = class241_sub3_sub1.readUnsignedByteS((byte) 72);
	    int i_308_ = i_307_ & 0x7;
	    int i_309_ = i_307_ >> 3 & 0xf;
	    if (i_309_ == 15)
		i_309_ = -1;
	    boolean bool = 1 == (i_307_ >> 7 & 0x1);
	    class475_sub1_sub1_sub3_sub1.method17788(i_305_, i_306_, i_308_,
						     i_309_, bool, 3,
						     -1746441691);
	}
	if (0 != (i_249_ & 0x4000)) {
	    String string = class241_sub3_sub1.readString(707478826);
	    if (Class21.myPlayer
		== class475_sub1_sub1_sub3_sub1)
		Class318.appendChatboxMessage(2, 0,
				    class475_sub1_sub1_sub3_sub1
					.getFormattedName(true, -120559161),
				    class475_sub1_sub1_sub3_sub1
					.getName(false, -122333825),
				    class475_sub1_sub1_sub3_sub1.nameFiltered,
				    string, -2097146430);
	    class475_sub1_sub1_sub3_sub1.setOverheadMessage(string, 0, 0, (byte) 108);
	}
	if ((i_249_ & 0x40) != 0) {
	    class475_sub1_sub1_sub3_sub1.anInt11401
		= class241_sub3_sub1.readByteA(582493488) * 2045684417;
	    class475_sub1_sub1_sub3_sub1.anInt11403
		= class241_sub3_sub1.readByteS((byte) 1) * -182768233;
	    class475_sub1_sub1_sub3_sub1.anInt11402
		= class241_sub3_sub1.readByteS((byte) 1) * -9202803;
	    class475_sub1_sub1_sub3_sub1.anInt11428
		= class241_sub3_sub1.getByteC(537746309) * -1841438277;
	    class475_sub1_sub1_sub3_sub1.anInt11386
		= (class241_sub3_sub1.readUnsignedLEShort((short) 23896)
		   + client.anInt8296) * 1486211439;
	    class475_sub1_sub1_sub3_sub1.anInt11422
		= (class241_sub3_sub1.readUnsignedShortA((byte) 21)
		   + client.anInt8296) * -2087589789;
	    class475_sub1_sub1_sub3_sub1.anInt11407
		= class241_sub3_sub1.readUnsignedShortA((byte) 15) * 364183757;
	    class475_sub1_sub1_sub3_sub1.anInt11401
		+= (class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0]
		    * 2045684417);
	    class475_sub1_sub1_sub3_sub1.anInt11403
		+= (-182768233
		    * class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0]);
	    class475_sub1_sub1_sub3_sub1.anInt11402
		+= class475_sub1_sub1_sub3_sub1.scenePositionXQueue[0] * -9202803;
	    class475_sub1_sub1_sub3_sub1.anInt11428
		+= (-1841438277
		    * class475_sub1_sub1_sub3_sub1.scenePositionYQueue[0]);
	    class475_sub1_sub1_sub3_sub1.queuedStepCount = 1631398045;
	    class475_sub1_sub1_sub3_sub1.anInt11430 = 0;
	}
    }
    
    static void method4017() {
	viewportPlayerCount = 0;
	for (int i = 0; i < 2048; i++) {
	    aClass241_Sub3Array2373[i] = null;
	    aClass241_Sub3Array2366[i] = null;
	    playerMovementTypes[i] = Class448.aClass448_6186.aByte6187;
	    playerRegions[i] = null;
	}
    }
    
    static final void method4018(ClientScriptData class454, int i) {
	int i_310_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_310_, (byte) -49);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.anInt885 * 645192277;
    }
    
    public static boolean method4019(char c, byte i) {
	return c >= '0' && c <= '9';
    }
    
    public static void method4020(RSBitBuffer class241_sub3_sub1,
				  int i) {
	Class241_Sub1 class241_sub1
	    = (Class241_Sub1) Class622.aClass429_7878.method7694(16711935);
	if (null != class241_sub1) {
	    int i_311_ = class241_sub3_sub1.pointer * 421967667;
	    class241_sub3_sub1.writeInt((((Class241_Sub1) class241_sub1)
					    .anInt8680) * -1545577693,
					   -1993980847);
	    for (int i_312_ = 0;
		 (i_312_
		  < 1809919105 * ((Class241_Sub1) class241_sub1).anInt8681);
		 i_312_++) {
		if (0
		    != ((Class241_Sub1) class241_sub1).anIntArray8683[i_312_])
		    class241_sub3_sub1.writeByte((((Class241_Sub1)
						     class241_sub1)
						    .anIntArray8683[i_312_]),
						   1763201020);
		else {
		    try {
			int i_313_ = (((Class241_Sub1) class241_sub1)
				      .anIntArray8682[i_312_]);
			if (0 == i_313_) {
			    Field field = (((Class241_Sub1) class241_sub1)
					   .aFieldArray8684[i_312_]);
			    int i_314_ = field.getInt(null);
			    class241_sub3_sub1.writeByte(0, -259581843);
			    class241_sub3_sub1.writeInt(i_314_, 1239119543);
			} else if (i_313_ == 1) {
			    Field field = (((Class241_Sub1) class241_sub1)
					   .aFieldArray8684[i_312_]);
			    field.setInt(null, (((Class241_Sub1) class241_sub1)
						.anIntArray8685[i_312_]));
			    class241_sub3_sub1.writeByte(0, 338257138);
			} else if (2 == i_313_) {
			    Field field = (((Class241_Sub1) class241_sub1)
					   .aFieldArray8684[i_312_]);
			    int i_315_ = field.getModifiers();
			    class241_sub3_sub1.writeByte(0, -2012404560);
			    class241_sub3_sub1.writeInt(i_315_, -874813907);
			}
			if (i_313_ == 3) {
			    Method method = (((Class241_Sub1) class241_sub1)
					     .aMethodArray8686[i_312_]);
			    byte[][] is = (((Class241_Sub1) class241_sub1)
					   .aByteArrayArrayArray8687[i_312_]);
			    Object[] objects = new Object[is.length];
			    for (int i_316_ = 0; i_316_ < is.length;
				 i_316_++) {
				ObjectInputStream objectinputstream
				    = (new ObjectInputStream
				       (new ByteArrayInputStream(is[i_316_])));
				objects[i_316_]
				    = objectinputstream.readObject();
			    }
			    Object object = method.invoke(null, objects);
			    if (null == object)
				class241_sub3_sub1.writeByte(0, -1914524380);
			    else if (object instanceof Number) {
				class241_sub3_sub1.writeByte(1, -597265956);
				class241_sub3_sub1.method14627
				    (((Number) object).longValue());
			    } else if (object instanceof String) {
				class241_sub3_sub1.writeByte(2, -1613285722);
				class241_sub3_sub1.writeString((String) object,
							       -212732517);
			    } else
				class241_sub3_sub1.writeByte(4, -543667367);
			} else if (4 == i_313_) {
			    Method method = (((Class241_Sub1) class241_sub1)
					     .aMethodArray8686[i_312_]);
			    int i_317_ = method.getModifiers();
			    class241_sub3_sub1.writeByte(0, -1630876292);
			    class241_sub3_sub1.writeInt(i_317_,
							   -1262583434);
			}
		    } catch (ClassNotFoundException classnotfoundexception) {
			class241_sub3_sub1.writeByte(-10, 1639929660);
		    } catch (InvalidClassException invalidclassexception) {
			class241_sub3_sub1.writeByte(-11, -1454974377);
		    } catch (StreamCorruptedException streamcorruptedexception) {
			class241_sub3_sub1.writeByte(-12, -1105944247);
		    } catch (OptionalDataException optionaldataexception) {
			class241_sub3_sub1.writeByte(-13, -100617099);
		    } catch (IllegalAccessException illegalaccessexception) {
			class241_sub3_sub1.writeByte(-14, -1969207048);
		    } catch (IllegalArgumentException illegalargumentexception) {
			class241_sub3_sub1.writeByte(-15, 1047366847);
		    } catch (InvocationTargetException invocationtargetexception) {
			class241_sub3_sub1.writeByte(-16, -1047826193);
		    } catch (SecurityException securityexception) {
			class241_sub3_sub1.writeByte(-17, -1154655520);
		    } catch (IOException ioexception) {
			class241_sub3_sub1.writeByte(-18, 224242832);
		    } catch (NullPointerException nullpointerexception) {
			class241_sub3_sub1.writeByte(-19, 1390119508);
		    } catch (Exception exception) {
			class241_sub3_sub1.writeByte(-20, 1424162960);
		    } catch (Throwable throwable) {
			class241_sub3_sub1.writeByte(-21, -1413555976);
		    }
		}
	    }
	    class241_sub3_sub1.method14668(i_311_, (byte) -90);
	    class241_sub1.remove((byte) 36);
	}
    }
    
    public static int[] method4021(byte i) {
	return (new int[]
		{ 1448573739 * Class5.anInt17, 626564023 * Class456.anInt6250,
		  2094908627 * IllegalArgumentException_Sub1.anInt11493 });
    }
    
    static final byte[] method4022(byte[] is, int i) {
	RSByteBuffer class241_sub3 = new RSByteBuffer(is);
	int i_318_ = class241_sub3.readUnsignedByte((byte) 28);
	int i_319_ = class241_sub3.readInt((byte) 123);
	if (i_319_ < 0 || (JS5.anInt2492 * -1077414777 != 0
			   && i_319_ > JS5.anInt2492 * -1077414777))
	    throw new RuntimeException();
	if (0 == i_318_) {
	    byte[] is_320_ = new byte[i_319_];
	    class241_sub3.readBytes(is_320_, 0, i_319_, (byte) 86);
	    return is_320_;
	}
	int i_321_ = class241_sub3.readInt((byte) 29);
	if (i_321_ < 0 || (-1077414777 * JS5.anInt2492 != 0
			   && i_321_ > JS5.anInt2492 * -1077414777))
	    throw new RuntimeException();
	byte[] is_322_ = new byte[i_321_];
	if (1 == i_318_)
	    Class435.method7784(is_322_, i_321_, is, i_319_, 9);
	else {
	    synchronized (JS5.aClass606_2488) {
		JS5.aClass606_2488.method13214(class241_sub3, is_322_,
						    2005567732);
	    }
	}
	return is_322_;
    }
}
