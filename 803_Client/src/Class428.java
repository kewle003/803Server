/* Class428 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class428
{
    static byte[][] aByteArrayArray6086;
    static int anInt6087;
    static int anInt6088;
    static byte[][] aByteArrayArray6089;
    static int anInt6090 = 0;
    static byte[][] aByteArrayArray6091;
    
    public static synchronized void method7602(byte[] is) {
	if (is.length == 100 && anInt6090 * 416475007 < 1000)
	    aByteArrayArray6089[(anInt6090 += 1777653887) * 416475007 - 1]
		= is;
	else if (5000 == is.length && anInt6087 * 1548788447 < 250)
	    aByteArrayArray6091[(anInt6087 += 1488689439) * 1548788447 - 1]
		= is;
	else if (is.length == 30000 && anInt6088 * 1296149765 < 50)
	    aByteArrayArray6086[(anInt6088 += -889645107) * 1296149765 - 1]
		= is;
	else if (null != AnimationConfigLoader.aByteArrayArrayArray6995) {
	    for (int i = 0; i < Class124.anIntArray1581.length; i++) {
		if (Class124.anIntArray1581[i] == is.length
		    && (Class110.anIntArray1512[i]
			< AnimationConfigLoader.aByteArrayArrayArray6995[i].length)) {
		    AnimationConfigLoader.aByteArrayArrayArray6995[i]
			[Class110.anIntArray1512[i]++]
			= is;
		    break;
		}
	    }
	}
    }
    
    public static synchronized byte[] method7603(int i, boolean bool,
						 byte i_0_) {
	if ((i == 100 || i < 100 && bool) && anInt6090 * 416475007 > 0) {
	    byte[] is
		= aByteArrayArray6089[(anInt6090 -= 1777653887) * 416475007];
	    aByteArrayArray6089[anInt6090 * 416475007] = null;
	    return is;
	}
	if ((5000 == i || i < 5000 && bool) && 1548788447 * anInt6087 > 0) {
	    byte[] is
		= aByteArrayArray6091[(anInt6087 -= 1488689439) * 1548788447];
	    aByteArrayArray6091[anInt6087 * 1548788447] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && 1296149765 * anInt6088 > 0) {
	    byte[] is
		= aByteArrayArray6086[(anInt6088 -= -889645107) * 1296149765];
	    aByteArrayArray6086[1296149765 * anInt6088] = null;
	    return is;
	}
	if (null != AnimationConfigLoader.aByteArrayArrayArray6995) {
	    for (int i_1_ = 0; i_1_ < Class124.anIntArray1581.length; i_1_++) {
		if ((i == Class124.anIntArray1581[i_1_]
		     || i < Class124.anIntArray1581[i_1_] && bool)
		    && Class110.anIntArray1512[i_1_] > 0) {
		    byte[] is = (AnimationConfigLoader.aByteArrayArrayArray6995[i_1_]
				 [--Class110.anIntArray1512[i_1_]]);
		    AnimationConfigLoader.aByteArrayArrayArray6995[i_1_]
			[Class110.anIntArray1512[i_1_]]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != Class124.anIntArray1581) {
	    for (int i_2_ = 0; i_2_ < Class124.anIntArray1581.length; i_2_++) {
		if (i <= Class124.anIntArray1581[i_2_]
		    && (Class110.anIntArray1512[i_2_]
			< AnimationConfigLoader.aByteArrayArrayArray6995[i_2_].length))
		    return new byte[Class124.anIntArray1581[i_2_]];
	    }
	}
	return new byte[i];
    }
    
    public static void method7604(int[] is, int[] is_3_) {
	if (is == null || null == is_3_) {
	    Class124.anIntArray1581 = null;
	    Class110.anIntArray1512 = null;
	    AnimationConfigLoader.aByteArrayArrayArray6995 = null;
	} else {
	    Class124.anIntArray1581 = is;
	    Class110.anIntArray1512 = new int[is.length];
	    AnimationConfigLoader.aByteArrayArrayArray6995 = new byte[is.length][][];
	    for (int i = 0; i < Class124.anIntArray1581.length; i++)
		AnimationConfigLoader.aByteArrayArrayArray6995[i] = new byte[is_3_[i]][];
	}
    }
    
    static {
	anInt6087 = 0;
	anInt6088 = 0;
	aByteArrayArray6089 = new byte[1000][];
	aByteArrayArray6091 = new byte[250][];
	aByteArrayArray6086 = new byte[50][];
    }
    
    public static synchronized byte[] method7605(int i, boolean bool) {
	if ((i == 100 || i < 100 && bool) && anInt6090 * 416475007 > 0) {
	    byte[] is
		= aByteArrayArray6089[(anInt6090 -= 1777653887) * 416475007];
	    aByteArrayArray6089[anInt6090 * 416475007] = null;
	    return is;
	}
	if ((5000 == i || i < 5000 && bool) && 1548788447 * anInt6087 > 0) {
	    byte[] is
		= aByteArrayArray6091[(anInt6087 -= 1488689439) * 1548788447];
	    aByteArrayArray6091[anInt6087 * 1548788447] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && 1296149765 * anInt6088 > 0) {
	    byte[] is
		= aByteArrayArray6086[(anInt6088 -= -889645107) * 1296149765];
	    aByteArrayArray6086[1296149765 * anInt6088] = null;
	    return is;
	}
	if (null != AnimationConfigLoader.aByteArrayArrayArray6995) {
	    for (int i_4_ = 0; i_4_ < Class124.anIntArray1581.length; i_4_++) {
		if ((i == Class124.anIntArray1581[i_4_]
		     || i < Class124.anIntArray1581[i_4_] && bool)
		    && Class110.anIntArray1512[i_4_] > 0) {
		    byte[] is = (AnimationConfigLoader.aByteArrayArrayArray6995[i_4_]
				 [--Class110.anIntArray1512[i_4_]]);
		    AnimationConfigLoader.aByteArrayArrayArray6995[i_4_]
			[Class110.anIntArray1512[i_4_]]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != Class124.anIntArray1581) {
	    for (int i_5_ = 0; i_5_ < Class124.anIntArray1581.length; i_5_++) {
		if (i <= Class124.anIntArray1581[i_5_]
		    && (Class110.anIntArray1512[i_5_]
			< AnimationConfigLoader.aByteArrayArrayArray6995[i_5_].length))
		    return new byte[Class124.anIntArray1581[i_5_]];
	    }
	}
	return new byte[i];
    }
    
    public static void method7606(int[] is, int[] is_6_) {
	if (is == null || null == is_6_) {
	    Class124.anIntArray1581 = null;
	    Class110.anIntArray1512 = null;
	    AnimationConfigLoader.aByteArrayArrayArray6995 = null;
	} else {
	    Class124.anIntArray1581 = is;
	    Class110.anIntArray1512 = new int[is.length];
	    AnimationConfigLoader.aByteArrayArrayArray6995 = new byte[is.length][][];
	    for (int i = 0; i < Class124.anIntArray1581.length; i++)
		AnimationConfigLoader.aByteArrayArrayArray6995[i] = new byte[is_6_[i]][];
	}
    }
    
    public static void method7607(int[] is, int[] is_7_) {
	if (is == null || null == is_7_) {
	    Class124.anIntArray1581 = null;
	    Class110.anIntArray1512 = null;
	    AnimationConfigLoader.aByteArrayArrayArray6995 = null;
	} else {
	    Class124.anIntArray1581 = is;
	    Class110.anIntArray1512 = new int[is.length];
	    AnimationConfigLoader.aByteArrayArrayArray6995 = new byte[is.length][][];
	    for (int i = 0; i < Class124.anIntArray1581.length; i++)
		AnimationConfigLoader.aByteArrayArrayArray6995[i] = new byte[is_7_[i]][];
	}
    }
    
    public static void method7608(int[] is, int[] is_8_) {
	if (is == null || null == is_8_) {
	    Class124.anIntArray1581 = null;
	    Class110.anIntArray1512 = null;
	    AnimationConfigLoader.aByteArrayArrayArray6995 = null;
	} else {
	    Class124.anIntArray1581 = is;
	    Class110.anIntArray1512 = new int[is.length];
	    AnimationConfigLoader.aByteArrayArrayArray6995 = new byte[is.length][][];
	    for (int i = 0; i < Class124.anIntArray1581.length; i++)
		AnimationConfigLoader.aByteArrayArrayArray6995[i] = new byte[is_8_[i]][];
	}
    }
    
    public static void method7609(int[] is, int[] is_9_) {
	if (is == null || null == is_9_) {
	    Class124.anIntArray1581 = null;
	    Class110.anIntArray1512 = null;
	    AnimationConfigLoader.aByteArrayArrayArray6995 = null;
	} else {
	    Class124.anIntArray1581 = is;
	    Class110.anIntArray1512 = new int[is.length];
	    AnimationConfigLoader.aByteArrayArrayArray6995 = new byte[is.length][][];
	    for (int i = 0; i < Class124.anIntArray1581.length; i++)
		AnimationConfigLoader.aByteArrayArrayArray6995[i] = new byte[is_9_[i]][];
	}
    }
    
    public static synchronized byte[] method7610(int i, boolean bool) {
	if ((i == 100 || i < 100 && bool) && anInt6090 * 416475007 > 0) {
	    byte[] is
		= aByteArrayArray6089[(anInt6090 -= 1777653887) * 416475007];
	    aByteArrayArray6089[anInt6090 * 416475007] = null;
	    return is;
	}
	if ((5000 == i || i < 5000 && bool) && 1548788447 * anInt6087 > 0) {
	    byte[] is
		= aByteArrayArray6091[(anInt6087 -= 1488689439) * 1548788447];
	    aByteArrayArray6091[anInt6087 * 1548788447] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && 1296149765 * anInt6088 > 0) {
	    byte[] is
		= aByteArrayArray6086[(anInt6088 -= -889645107) * 1296149765];
	    aByteArrayArray6086[1296149765 * anInt6088] = null;
	    return is;
	}
	if (null != AnimationConfigLoader.aByteArrayArrayArray6995) {
	    for (int i_10_ = 0; i_10_ < Class124.anIntArray1581.length;
		 i_10_++) {
		if ((i == Class124.anIntArray1581[i_10_]
		     || i < Class124.anIntArray1581[i_10_] && bool)
		    && Class110.anIntArray1512[i_10_] > 0) {
		    byte[] is = (AnimationConfigLoader.aByteArrayArrayArray6995[i_10_]
				 [--Class110.anIntArray1512[i_10_]]);
		    AnimationConfigLoader.aByteArrayArrayArray6995[i_10_]
			[Class110.anIntArray1512[i_10_]]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != Class124.anIntArray1581) {
	    for (int i_11_ = 0; i_11_ < Class124.anIntArray1581.length;
		 i_11_++) {
		if (i <= Class124.anIntArray1581[i_11_]
		    && (Class110.anIntArray1512[i_11_]
			< AnimationConfigLoader.aByteArrayArrayArray6995[i_11_].length))
		    return new byte[Class124.anIntArray1581[i_11_]];
	    }
	}
	return new byte[i];
    }
    
    public static synchronized byte[] method7611(int i, boolean bool) {
	if ((i == 100 || i < 100 && bool) && anInt6090 * 416475007 > 0) {
	    byte[] is
		= aByteArrayArray6089[(anInt6090 -= 1777653887) * 416475007];
	    aByteArrayArray6089[anInt6090 * 416475007] = null;
	    return is;
	}
	if ((5000 == i || i < 5000 && bool) && 1548788447 * anInt6087 > 0) {
	    byte[] is
		= aByteArrayArray6091[(anInt6087 -= 1488689439) * 1548788447];
	    aByteArrayArray6091[anInt6087 * 1548788447] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && 1296149765 * anInt6088 > 0) {
	    byte[] is
		= aByteArrayArray6086[(anInt6088 -= -889645107) * 1296149765];
	    aByteArrayArray6086[1296149765 * anInt6088] = null;
	    return is;
	}
	if (null != AnimationConfigLoader.aByteArrayArrayArray6995) {
	    for (int i_12_ = 0; i_12_ < Class124.anIntArray1581.length;
		 i_12_++) {
		if ((i == Class124.anIntArray1581[i_12_]
		     || i < Class124.anIntArray1581[i_12_] && bool)
		    && Class110.anIntArray1512[i_12_] > 0) {
		    byte[] is = (AnimationConfigLoader.aByteArrayArrayArray6995[i_12_]
				 [--Class110.anIntArray1512[i_12_]]);
		    AnimationConfigLoader.aByteArrayArrayArray6995[i_12_]
			[Class110.anIntArray1512[i_12_]]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != Class124.anIntArray1581) {
	    for (int i_13_ = 0; i_13_ < Class124.anIntArray1581.length;
		 i_13_++) {
		if (i <= Class124.anIntArray1581[i_13_]
		    && (Class110.anIntArray1512[i_13_]
			< AnimationConfigLoader.aByteArrayArrayArray6995[i_13_].length))
		    return new byte[Class124.anIntArray1581[i_13_]];
	    }
	}
	return new byte[i];
    }
    
    public static synchronized byte[] method7612(int i) {
	return method7603(i, false, (byte) 0);
    }
    
    public static synchronized byte[] method7613(int i, int i_14_) {
	return method7603(i, false, (byte) 0);
    }
    
    public static synchronized byte[] method7614(int i) {
	return method7603(i, false, (byte) 0);
    }
    
    Class428() throws Throwable {
	throw new Error();
    }
    
    public static synchronized void method7615(byte[] is, int i) {
	if (is.length == 100 && anInt6090 * 416475007 < 1000)
	    aByteArrayArray6089[(anInt6090 += 1777653887) * 416475007 - 1]
		= is;
	else if (5000 == is.length && anInt6087 * 1548788447 < 250)
	    aByteArrayArray6091[(anInt6087 += 1488689439) * 1548788447 - 1]
		= is;
	else if (is.length == 30000 && anInt6088 * 1296149765 < 50)
	    aByteArrayArray6086[(anInt6088 += -889645107) * 1296149765 - 1]
		= is;
	else if (null != AnimationConfigLoader.aByteArrayArrayArray6995) {
	    for (int i_15_ = 0; i_15_ < Class124.anIntArray1581.length;
		 i_15_++) {
		if (Class124.anIntArray1581[i_15_] == is.length
		    && (Class110.anIntArray1512[i_15_]
			< AnimationConfigLoader.aByteArrayArrayArray6995[i_15_].length)) {
		    AnimationConfigLoader.aByteArrayArrayArray6995[i_15_]
			[Class110.anIntArray1512[i_15_]++]
			= is;
		    break;
		}
	    }
	}
    }
}
