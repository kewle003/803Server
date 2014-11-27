/* Class637 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class637
{
    static Random aRandom8249;
    static Object anObject8250 = new Object();
    public static int anInt8251;
    
    public static int method13515(int i, int i_0_) {
	if (i_0_ > i) {
	    int i_1_ = i;
	    i = i_0_;
	    i_0_ = i_1_;
	}
	int i_2_;
	for (/**/; 0 != i_0_; i_0_ = i_2_) {
	    i_2_ = i % i_0_;
	    i = i_0_;
	}
	return i;
    }
    
    public static int method13516(int i, int i_3_) {
	if (i_3_ > i) {
	    int i_4_ = i;
	    i = i_3_;
	    i_3_ = i_4_;
	}
	int i_5_;
	for (/**/; 0 != i_3_; i_3_ = i_5_) {
	    i_5_ = i % i_3_;
	    i = i_3_;
	}
	return i;
    }
    
    public static int method13517(int i) {
	int i_6_ = 0;
	if (i < 0 || i >= 65536) {
	    i >>>= 16;
	    i_6_ += 16;
	}
	if (i >= 256) {
	    i >>>= 8;
	    i_6_ += 8;
	}
	if (i >= 16) {
	    i >>>= 4;
	    i_6_ += 4;
	}
	if (i >= 4) {
	    i >>>= 2;
	    i_6_ += 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_6_++;
	}
	return i_6_ + i;
    }
    
    public static int method13518(int i) {
	i = --i | i >>> 1;
	i |= i >>> 2;
	i |= i >>> 4;
	i |= i >>> 8;
	i |= i >>> 16;
	return 1 + i;
    }
    
    public static int method13519(int i) {
	int i_7_ = i >>> 1;
	i_7_ |= i_7_ >>> 1;
	i_7_ |= i_7_ >>> 2;
	i_7_ |= i_7_ >>> 4;
	i_7_ |= i_7_ >>> 8;
	i_7_ |= i_7_ >>> 16;
	return i & (i_7_ ^ 0xffffffff);
    }
    
    public static int method13520(int i) {
	int i_8_ = i >>> 1;
	i_8_ |= i_8_ >>> 1;
	i_8_ |= i_8_ >>> 2;
	i_8_ |= i_8_ >>> 4;
	i_8_ |= i_8_ >>> 8;
	i_8_ |= i_8_ >>> 16;
	return i & (i_8_ ^ 0xffffffff);
    }
    
    public static boolean method13521(int i) {
	return i == (i & -i);
    }
    
    static int method13522(int i, int i_9_) {
	int i_10_ = i >> 31 & i_9_ - 1;
	return i_10_ + (i + (i >>> 31)) % i_9_;
    }
    
    public static int method13523(int i) {
	int i_11_ = 0;
	if (i < 0 || i >= 65536) {
	    i >>>= 16;
	    i_11_ += 16;
	}
	if (i >= 256) {
	    i >>>= 8;
	    i_11_ += 8;
	}
	if (i >= 16) {
	    i >>>= 4;
	    i_11_ += 4;
	}
	if (i >= 4) {
	    i >>>= 2;
	    i_11_ += 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_11_++;
	}
	return i_11_ + i;
    }
    
    static int method13524(int i, int i_12_) {
	int i_13_ = i >> 31 & i_12_ - 1;
	return i_13_ + (i + (i >>> 31)) % i_12_;
    }
    
    static int method13525(int i, int i_14_) {
	int i_15_ = i >> 31 & i_14_ - 1;
	return i_15_ + (i + (i >>> 31)) % i_14_;
    }
    
    Class637() throws Throwable {
	throw new Error();
    }
    
    static int method13526(int i, int i_16_) {
	int i_17_ = i >> 31 & i_16_ - 1;
	return i_17_ + (i + (i >>> 31)) % i_16_;
    }
    
    static int method13527(int i, int i_18_) {
	int i_19_ = i >> 31 & i_18_ - 1;
	return i_19_ + (i + (i >>> 31)) % i_18_;
    }
    
    static int method13528(int i, int i_20_) {
	int i_21_ = i >> 31 & i_20_ - 1;
	return i_21_ + (i + (i >>> 31)) % i_20_;
    }
    
    public static int method13529(Random random, int i) {
	if (random == null) {
	    random = aRandom8249;
	    if (null == random) {
		synchronized (anObject8250) {
		    if (aRandom8249 == null)
			aRandom8249 = new Random();
		    random = aRandom8249;
		}
	    }
	}
	if (i <= 0)
	    throw new IllegalArgumentException();
	if (Class76.method1772(i, (byte) 63))
	    return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i
			  >> 32);
	int i_22_ = -2147483648 - (int) (4294967296L % (long) i);
	int i_23_;
	do
	    i_23_ = random.nextInt();
	while (i_23_ >= i_22_);
	return GameDefinition.method10781(i_23_, i, 1024395918);
    }
    
    public static int method13530(Random random, int i) {
	if (random == null) {
	    random = aRandom8249;
	    if (null == random) {
		synchronized (anObject8250) {
		    if (aRandom8249 == null)
			aRandom8249 = new Random();
		    random = aRandom8249;
		}
	    }
	}
	if (i <= 0)
	    throw new IllegalArgumentException();
	if (Class76.method1772(i, (byte) 47))
	    return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i
			  >> 32);
	int i_24_ = -2147483648 - (int) (4294967296L % (long) i);
	int i_25_;
	do
	    i_25_ = random.nextInt();
	while (i_25_ >= i_24_);
	return GameDefinition.method10781(i_25_, i, 756598422);
    }
    
    public static int method13531(Random random, int i) {
	if (random == null) {
	    random = aRandom8249;
	    if (null == random) {
		synchronized (anObject8250) {
		    if (aRandom8249 == null)
			aRandom8249 = new Random();
		    random = aRandom8249;
		}
	    }
	}
	if (i <= 0)
	    throw new IllegalArgumentException();
	if (Class76.method1772(i, (byte) 91))
	    return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i
			  >> 32);
	int i_26_ = -2147483648 - (int) (4294967296L % (long) i);
	int i_27_;
	do
	    i_27_ = random.nextInt();
	while (i_27_ >= i_26_);
	return GameDefinition.method10781(i_27_, i, -310848514);
    }
    
    static void method13532(InterfaceComponent class58, int i, int i_28_, byte i_29_) {
	Class16.aClass58_158 = class58;
	Class16.anInt159 = i * 254062753;
	Class16.anInt160 = i_28_ * -1518173867;
    }
    
    static final void ifGtSkip/*method13533*/(ClientScriptData scriptData, byte i) {
    	scriptData.intStackPointer -= -821458770;
		if (scriptData.integerStack[1482319719 * scriptData.intStackPointer]
				> scriptData.integerStack[1 + scriptData.intStackPointer * 1482319719]) {
			scriptData.step += (1924545709 * scriptData.integerConstants[1938982693 * scriptData.step]);
		}
    }
}
