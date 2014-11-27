/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.management.GarbageCollectorMXBean;
import java.net.MalformedURLException;
import java.net.URL;

public class Class40
{
    public static final int anInt592 = 125000;
    public static final int anInt593 = 1700;
    static Class639 aClass639_594;
    static GarbageCollectorMXBean aGarbageCollectorMXBean595;
    
    Class40() throws Throwable {
	throw new Error();
    }
    
    static void method1042(int i) {
	if (GameShell3.cpucount * -1006958513 > 1)
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub19_8882,
		 4, (byte) 2);
	else
	    Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
		(Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub19_8882,
		 2, (byte) 2);
    }
    
    static final void storeCompScrollMaxY/*method1043*/(ClientScriptData scriptData, int i) {
		int i_0_
		    = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		InterfaceComponent component = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -39);
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = component.scrollMaxY * 1204737107;
    }
    
    public static Class103 method1044(int i, Canvas canvas, Class107 class107,
				      Interface6 interface6, JS5 class210,
				      int i_1_, byte i_2_) {
	int i_3_ = 0;
	int i_4_ = 0;
	if (canvas != null) {
	    Dimension dimension = canvas.getSize();
	    i_3_ = dimension.width;
	    i_4_ = dimension.height;
	}
	return Class103.method2385(i, canvas, class107, interface6, class210,
				   i_1_, i_3_, i_4_, (byte) -50);
    }
    
    static int method1045(byte[][] is, byte[][] is_5_, int[] is_6_,
			  byte[] is_7_, int[] is_8_, int i, int i_9_,
			  int i_10_) {
	int i_11_ = is_6_[i];
	int i_12_ = is_8_[i] + i_11_;
	int i_13_ = is_6_[i_9_];
	int i_14_ = i_13_ + is_8_[i_9_];
	int i_15_ = i_11_;
	if (i_13_ > i_11_)
	    i_15_ = i_13_;
	int i_16_ = i_12_;
	if (i_14_ < i_12_)
	    i_16_ = i_14_;
	int i_17_ = is_7_[i] & 0xff;
	if ((is_7_[i_9_] & 0xff) < i_17_)
	    i_17_ = is_7_[i_9_] & 0xff;
	byte[] is_18_ = is_5_[i];
	byte[] is_19_ = is[i_9_];
	int i_20_ = i_15_ - i_11_;
	int i_21_ = i_15_ - i_13_;
	for (int i_22_ = i_15_; i_22_ < i_16_; i_22_++) {
	    int i_23_ = is_18_[i_20_++] + is_19_[i_21_++];
	    if (i_23_ < i_17_)
		i_17_ = i_23_;
	}
	return -i_17_;
    }
    
    public static int method1046(int i, int i_24_, int i_25_, short i_26_) {
	i_25_ &= 0x3;
	if (i_25_ == 0)
	    return i_24_;
	if (i_25_ == 1)
	    return 4095 - i;
	if (2 == i_25_)
	    return 4095 - i_24_;
	return i;
    }
    
    public static final void method1047(Class241_Sub11 class241_sub11,
					boolean bool, boolean bool_27_, int i) {
		int i_28_ = -443552671 * class241_sub11.interfaceID;
		int i_29_ = (int) (class241_sub11.hashCode * 4356572401218184725L);
		class241_sub11.remove((byte) 36);
		if (bool) {
		    Class451.method10535(i_28_, (byte) 24);
		}
		Class357.method6464(i_28_, -1242972839);
		InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_29_, (byte) -108);
		if (null != class58)
		    WorldType.refreshComponent(class58, 975713091);
		Class120_Sub8.method16775(-743514329);
		if (!bool_27_ && -1 != client.anInt8466 * 1629309841)
		    Class298.method5735(client.anInt8466 * 1629309841, 1, (byte) -12);
		Class403 class403 = new Class403(client.aClass407_8467);
		for (Class241_Sub11 class241_sub11_30_
			 = (Class241_Sub11) class403.method7206(1510072985);
		     null != class241_sub11_30_;
		     class241_sub11_30_ = (Class241_Sub11) class403.next()) {
		    if (!class241_sub11_30_.hasNext((byte) 100)) {
			class241_sub11_30_
			    = (Class241_Sub11) class403.method7206(1510072985);
			if (class241_sub11_30_ == null)
			    break;
		    }
		    if (1233847279 * class241_sub11_30_.clipped == 3) {
			int i_31_ = (int) (4356572401218184725L
					   * class241_sub11_30_.hashCode);
			if (i_31_ >>> 16 == i_28_)
			    method1047(class241_sub11_30_, true, bool_27_,
				       -1677381575);
		    }
		}
    }
    
    public static Class241_Sub41 method1048(int i) {
	if (Class573_Sub1.aClass429_7387 == null
	    || Class573_Sub1.aClass443_8789 == null)
	    return null;
	Class573_Sub1.aClass443_8789.method7863(Class573_Sub1.aClass429_7387,
						(byte) 53);
	Class241_Sub41 class241_sub41
	    = ((Class241_Sub41)
	       Class573_Sub1.aClass443_8789.method7865(-793848721));
	if (null == class241_sub41)
	    return null;
	Class515 class515
	    = Class573_Sub1.aClass524_7370.method11745(((class241_sub41
							 .anInt10158)
							* -1454932011),
						       110009421);
	if (null == class515 || !class515.aBool6769
	    || !class515.method11587(Class573_Sub1.anInterface13_7373,
				     Class573_Sub1.anInterface11_7372,
				     -1173725011))
	    return Class604.method13198((byte) -41);
	return class241_sub41;
    }
    
    static boolean method1049(String string, int i) {
	if (string == null)
	    return false;
	try {
	    new URL(string);
	} catch (MalformedURLException malformedurlexception) {
	    return false;
	}
	return true;
    }
    
    static Class38[] method1050(int i) {
	return new Class38[] { Class38.aClass38_555, Class38.aClass38_577,
			       Class38.aClass38_460, Class38.aClass38_497,
			       Class38.aClass38_462, Class38.aClass38_463,
			       Class38.aClass38_538, Class38.aClass38_562,
			       Class38.aClass38_466, Class38.aClass38_467,
			       Class38.aClass38_468, Class38.aClass38_469,
			       Class38.aClass38_470, Class38.aClass38_471,
			       Class38.aClass38_472, Class38.aClass38_473,
			       Class38.aClass38_474, Class38.aClass38_583,
			       Class38.aClass38_476, Class38.aClass38_564,
			       Class38.aClass38_478, Class38.aClass38_477,
			       Class38.aClass38_480, Class38.aClass38_481,
			       Class38.aClass38_482, Class38.aClass38_483,
			       Class38.aClass38_575, Class38.aClass38_485,
			       Class38.aClass38_519, Class38.aClass38_508,
			       Class38.aClass38_458, Class38.aClass38_489,
			       Class38.aClass38_490, Class38.aClass38_491,
			       Class38.aClass38_492, Class38.aClass38_493,
			       Class38.aClass38_503, Class38.aClass38_495,
			       Class38.aClass38_496, Class38.aClass38_524,
			       Class38.aClass38_546, Class38.aClass38_499,
			       Class38.aClass38_500, Class38.aClass38_501,
			       Class38.aClass38_502, Class38.aClass38_484,
			       Class38.aClass38_504, Class38.aClass38_506,
			       Class38.aClass38_464, Class38.aClass38_507,
			       Class38.aClass38_513, Class38.aClass38_511,
			       Class38.aClass38_566, Class38.aClass38_498,
			       Class38.aClass38_512, Class38.aClass38_570,
			       Class38.aClass38_523, Class38.aClass38_515,
			       Class38.aClass38_516, Class38.aClass38_544,
			       Class38.aClass38_518, Class38.aClass38_525,
			       Class38.aClass38_520, Class38.aClass38_521,
			       Class38.aClass38_522, Class38.aClass38_526,
			       Class38.aClass38_465, Class38.aClass38_553,
			       Class38.aClass38_486, Class38.aClass38_527,
			       Class38.aClass38_528, Class38.aClass38_529,
			       Class38.aClass38_530, Class38.aClass38_531,
			       Class38.aClass38_532, Class38.aClass38_510,
			       Class38.aClass38_509, Class38.aClass38_552,
			       Class38.aClass38_536, Class38.aClass38_494,
			       Class38.aClass38_475, Class38.aClass38_539,
			       Class38.aClass38_540, Class38.aClass38_541,
			       Class38.aClass38_542, Class38.aClass38_535,
			       Class38.aClass38_517, Class38.aClass38_545,
			       Class38.aClass38_578, Class38.aClass38_547,
			       Class38.aClass38_548, Class38.aClass38_534,
			       Class38.aClass38_550, Class38.aClass38_551,
			       Class38.aClass38_557, Class38.aClass38_543,
			       Class38.aClass38_554, Class38.aClass38_459,
			       Class38.aClass38_556, Class38.aClass38_488,
			       Class38.aClass38_558, Class38.aClass38_559,
			       Class38.aClass38_560, Class38.aClass38_561,
			       Class38.aClass38_549, Class38.aClass38_563,
			       Class38.aClass38_487, Class38.aClass38_565,
			       Class38.aClass38_505, Class38.aClass38_567,
			       Class38.aClass38_568, Class38.aClass38_569,
			       Class38.aClass38_579, Class38.aClass38_571,
			       Class38.aClass38_572, Class38.aClass38_573,
			       Class38.aClass38_574, Class38.aClass38_537,
			       Class38.aClass38_576, Class38.aClass38_514,
			       Class38.aClass38_461, Class38.aClass38_533,
			       Class38.aClass38_580, Class38.aClass38_581,
			       Class38.aClass38_582 };
    }
}
