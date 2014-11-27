/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class3
{
    public static int method460() {
	Canvas canvas = new Canvas();
	canvas.setSize(100, 100);
	Class103 class103
	    = Class40.method1044(0, canvas, null, null, null, 0, (byte) 64);
	long l = Class50.method1249((byte) 1);
	for (int i = 0; i < 10000; i++)
	    class103.method2270(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F,
				-65536, -65536, -65536, 1);
	int i = (int) (Class50.method1249((byte) 1) - l);
	class103.method2263(0, 0, 100, 100, -16777216, (byte) -127);
	class103.method2220((byte) 0);
	return i;
    }
    
    public static int method461() {
	Canvas canvas = new Canvas();
	canvas.setSize(100, 100);
	Class103 class103
	    = Class40.method1044(0, canvas, null, null, null, 0, (byte) -62);
	long l = Class50.method1249((byte) 1);
	for (int i = 0; i < 10000; i++)
	    class103.method2270(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F,
				-65536, -65536, -65536, 1);
	int i = (int) (Class50.method1249((byte) 1) - l);
	class103.method2263(0, 0, 100, 100, -16777216, (byte) -41);
	class103.method2220((byte) 0);
	return i;
    }
    
    public static int method462() {
	Canvas canvas = new Canvas();
	canvas.setSize(100, 100);
	Class103 class103
	    = Class40.method1044(0, canvas, null, null, null, 0, (byte) 32);
	long l = Class50.method1249((byte) 1);
	for (int i = 0; i < 10000; i++)
	    class103.method2270(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F,
				-65536, -65536, -65536, 1);
	int i = (int) (Class50.method1249((byte) 1) - l);
	class103.method2263(0, 0, 100, 100, -16777216, (byte) -30);
	class103.method2220((byte) 0);
	return i;
    }
    
    Class3() throws Throwable {
	throw new Error();
    }
    
    public static OnlineStatus method463(int i, int i_0_) {
	OnlineStatus[] class420s = Class423.method7559(263186872);
	for (int i_1_ = 0; i_1_ < class420s.length; i_1_++) {
	    OnlineStatus class420 = class420s[i_1_];
	    if (i == class420.opcode * 1473893111)
		return class420;
	}
	return null;
    }
    
    static int method464(int i) {
		if (client.aClass58_8365 == null) {
		    if (!Class16.aBool141) {
				if (ClanChannelUser.aClass499_5588.aBool6562) {
				    if (null != Class478.aClass241_Sub39_Sub11_6402)
					return (300310447
						* (((Class241_Sub39_Sub11)
						    Class478.aClass241_Sub39_Sub11_6402).cursorID));
				} else if (Class125.aClass241_Sub39_Sub11_1582 != null) {
				    return (((Class241_Sub39_Sub11)
					     Class125.aClass241_Sub39_Sub11_1582).cursorID * 300310447);
				}
		    } else {
				Class639 class639 = OnlineStatus.method7519(1916672959);
				int i_2_ = Class106.aClass580_1503.method12718(1614860963);
				int i_3_ = Class106.aClass580_1503.method12740((byte) -59);
				if (!Class16.aBool171) {
				    if (i_2_ > 1011088115 * Class16.anInt156
					&& i_2_ < (Class593.anInt7631 * 1139603851
						   + 1011088115 * Class16.anInt156)) {
					int i_4_ = -1;
					for (int i_5_ = 0;
					     i_5_ < Class16.anInt148 * 1327183635; i_5_++) {
					    if (Class16.aBool168) {
						int i_6_
						    = (Class380.anInt5660 * 904064679 + 20
						       + class639.anInt8258 * -351886683 + 1
						       + ((1327183635 * Class16.anInt148 - 1
							   - i_5_)
							  * (Class16.anInt164 * 1149989507)));
						if (i_3_ > (i_6_
							    - class639.anInt8258 * -351886683
							    - 1)
						    && i_3_ < (326424439 * class639.anInt8260
							       + i_6_))
						    i_4_ = i_5_;
					    } else {
						int i_7_ = (((Class16.anInt148 * 1327183635 - 1
							      - i_5_)
							     * (Class16.anInt164 * 1149989507))
							    + (904064679 * Class380.anInt5660
							       + 31));
						if (i_3_ > (i_7_
							    - class639.anInt8258 * -351886683
							    - 1)
						    && i_3_ < (class639.anInt8260 * 326424439
							       + i_7_))
						    i_4_ = i_5_;
					    }
					}
					if (i_4_ != -1) {
					    int i_8_ = 0;
					    Class443 class443
						= new Class443(Class16.aClass429_150);
					    for (Class241_Sub39_Sub11 class241_sub39_sub11
						     = ((Class241_Sub39_Sub11)
							class443.method7865(2071903507));
						 null != class241_sub39_sub11;
						 class241_sub39_sub11 = ((Class241_Sub39_Sub11)
									 class443.next())) {
						if (i_8_++ == i_4_)
						    return (((Class241_Sub39_Sub11)
							     class241_sub39_sub11).cursorID
							    * 300310447);
					    }
					}
				    }
				} else if (i_2_ > Class16.anInt156 * 1011088115
					   && i_2_ < (1139603851 * Class593.anInt7631
						      + 1011088115 * Class16.anInt156)) {
				    int i_9_ = -1;
				    for (int i_10_ = 0; i_10_ < -1887420811 * Class16.anInt149;
					 i_10_++) {
					if (Class16.aBool168) {
					    int i_11_
						= (-351886683 * class639.anInt8258
						   + (904064679 * Class380.anInt5660 + 20) + 1
						   + i_10_ * (Class16.anInt164 * 1149989507));
					    if ((i_3_
						 > i_11_ - class639.anInt8258 * -351886683 - 1)
						&& (i_3_
						    < class639.anInt8260 * 326424439 + i_11_))
						i_9_ = i_10_;
					} else {
					    int i_12_
						= (904064679 * Class380.anInt5660 + 31
						   + i_10_ * (1149989507 * Class16.anInt164));
					    if ((i_3_
						 > i_12_ - class639.anInt8258 * -351886683 - 1)
						&& (i_3_
						    < i_12_ + class639.anInt8260 * 326424439))
						i_9_ = i_10_;
					}
				    }
				    if (i_9_ != -1) {
					int i_13_ = 0;
					Class427 class427
					    = new Class427(Class16.aClass410_152);
					for (Class241_Sub39_Sub10 class241_sub39_sub10
						 = ((Class241_Sub39_Sub10)
						    class427.method7585(-178802435));
					     class241_sub39_sub10 != null;
					     class241_sub39_sub10
						 = (Class241_Sub39_Sub10) class427.next()) {
					    if (i_13_++ == i_9_)
						return (((Class241_Sub39_Sub11)
							 (Class241_Sub39_Sub11)
							 (((Class241_Sub39_Sub10)
							   class241_sub39_sub10)
							  .aClass410_10866.aClass241_Sub39_5934
							  .aClass241_Sub39_10148)).cursorID
							* 300310447);
					}
				    }
				} else if (null != Class16.aClass241_Sub39_Sub10_143
					   && i_2_ > 1955430821 * Class193.anInt2298
					   && i_2_ < (Class193.anInt2298 * 1955430821
						      + -885853667 * Class16.anInt147)) {
				    int i_14_ = -1;
				    for (int i_15_ = 0;
					 i_15_ < (((Class241_Sub39_Sub10)
						   Class16.aClass241_Sub39_Sub10_143)
						  .anInt10867) * 1633676605;
					 i_15_++) {
					if (Class16.aBool168) {
					    int i_16_
						= (1149989507 * Class16.anInt164 * i_15_
						   + (1 + (-351886683 * class639.anInt8258
							   + (20
							      + 282057643 * Class4.anInt16))));
					    if ((i_3_
						 > i_16_ - class639.anInt8258 * -351886683 - 1)
						&& (i_3_
						    < i_16_ + 326424439 * class639.anInt8260))
						i_14_ = i_15_;
					} else {
					    int i_17_ = (1149989507 * Class16.anInt164 * i_15_
							 + (Class4.anInt16 * 282057643 + 31));
					    if ((i_3_
						 > i_17_ - class639.anInt8258 * -351886683 - 1)
						&& (i_3_
						    < i_17_ + 326424439 * class639.anInt8260))
						i_14_ = i_15_;
					}
				    }
				    if (-1 != i_14_) {
					int i_18_ = 0;
					Class427 class427
					    = new Class427(((Class241_Sub39_Sub10)
							    Class16.aClass241_Sub39_Sub10_143)
							   .aClass410_10866);
					for (Class241_Sub39_Sub11 class241_sub39_sub11
						 = ((Class241_Sub39_Sub11)
						    class427.method7585(642444933));
					     null != class241_sub39_sub11;
					     class241_sub39_sub11
						 = (Class241_Sub39_Sub11) class427.next()) {
					    if (i_18_++ == i_14_)
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
    
    static final void method465(ClientScriptData class454, byte i) {
	int i_19_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_19_, (byte) -37);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_19_ >> 16];
	Class175.method3738(class58, class35, class454, (byte) 45);
    }
    
    static final void method466(ClientScriptData class454, byte i) {
	int i_20_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	ItemDefinition class623
	    = JS5.itemDefLoader.list(i_20_, (short) -11776);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class623.anInt7887 * 33836131;
    }
}
