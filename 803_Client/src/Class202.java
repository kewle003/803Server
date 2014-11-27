/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class202
{
    static boolean aBool2412 = false;
    static short aShort2413;
    
    static void method4075(Class548[][][] class548s) {
	for (int i = 0; i < class548s.length; i++) {
	    Class548[][] class548s_0_ = class548s[i];
	    for (int i_1_ = 0; i_1_ < class548s_0_.length; i_1_++) {
		for (int i_2_ = 0; i_2_ < class548s_0_[i_1_].length; i_2_++) {
		    Class548 class548 = class548s_0_[i_1_][i_2_];
		    if (class548 != null) {
			if (class548.aClass475_Sub1_Sub4_7058
			    instanceof Interface24)
			    ((Interface24) class548.aClass475_Sub1_Sub4_7058)
				.method143(1463093478);
			if (class548.aClass475_Sub1_Sub5_7061
			    instanceof Interface24)
			    ((Interface24) class548.aClass475_Sub1_Sub5_7061)
				.method143(2136827543);
			if (class548.aClass475_Sub1_Sub5_7059
			    instanceof Interface24)
			    ((Interface24) class548.aClass475_Sub1_Sub5_7059)
				.method143(1349163884);
			if (class548.aClass475_Sub1_Sub3_7055
			    instanceof Interface24)
			    ((Interface24) class548.aClass475_Sub1_Sub3_7055)
				.method143(1230247925);
			if (class548.aClass475_Sub1_Sub3_7056
			    instanceof Interface24)
			    ((Interface24) class548.aClass475_Sub1_Sub3_7056)
				.method143(1139429269);
			for (Class541 class541 = class548.aClass541_7053;
			     null != class541;
			     class541 = class541.aClass541_7005) {
			    Class475_Sub1_Sub1 class475_sub1_sub1
				= class541.aClass475_Sub1_Sub1_7004;
			    if (class475_sub1_sub1 instanceof Interface24)
				((Interface24) class475_sub1_sub1)
				    .method143(2033339325);
			}
		    }
		}
	    }
	}
    }
    
    public static void method4076() {
	if (!aBool2412) {
	    Class583.method12829((client.aClass238_8477.method4751(-676923776)
				  .aClass548ArrayArrayArray7148),
				 (byte) 86);
	    if ((client.aClass238_8477.method4751(-1861041434)
		 .aClass548ArrayArrayArray7135)
		!= null)
		Class583.method12829((client.aClass238_8477.method4751
				      (-1036946278)
				      .aClass548ArrayArrayArray7135),
				     (byte) 104);
	    aBool2412 = true;
	}
    }
    
    Class202() throws Throwable {
	throw new Error();
    }
    
    public static void method4077(int[] is, int[] is_3_, int i) {
	if (is == null || null == is_3_) {
	    Class124.anIntArray1581 = null;
	    Class110.anIntArray1512 = null;
	    AnimationConfigLoader.aByteArrayArrayArray6995 = null;
	} else {
	    Class124.anIntArray1581 = is;
	    Class110.anIntArray1512 = new int[is.length];
	    AnimationConfigLoader.aByteArrayArrayArray6995 = new byte[is.length][][];
	    for (int i_4_ = 0; i_4_ < Class124.anIntArray1581.length; i_4_++)
		AnimationConfigLoader.aByteArrayArrayArray6995[i_4_]
		    = new byte[is_3_[i_4_]][];
	}
    }
}
