/* Class531 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class531 implements Interface54
{
    int anInt6950;
    int anInt6951;
    int[] anIntArray6952;
    
    public boolean method420(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578) {
	if (null == class241_sub24) {
	    if (-1 != ((Class531) this).anInt6950 * -1153642397)
		return false;
	} else {
	    if (-1153642397 * ((Class531) this).anInt6950
		!= class241_sub24.method15064(885407507))
		return false;
	    if (2085440245 * ((Class531) this).anInt6951
		> class241_sub24.method15068((byte) 30))
		return false;
	    int[] is = ((Class531) this).anIntArray6952;
	    for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
		int i_1_ = is[i_0_];
		if (!class578.isKeyPressed(i_1_, -1016346882))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method422(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578) {
	if (null == class241_sub24) {
	    if (-1 != ((Class531) this).anInt6950 * -1153642397)
		return false;
	} else {
	    if (-1153642397 * ((Class531) this).anInt6950
		!= class241_sub24.method15064(984208880))
		return false;
	    if (2085440245 * ((Class531) this).anInt6951
		> class241_sub24.method15068((byte) -43))
		return false;
	    int[] is = ((Class531) this).anIntArray6952;
	    for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
		int i_3_ = is[i_2_];
		if (!class578.isKeyPressed(i_3_, -1016346882))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method421(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578) {
	if (null == class241_sub24) {
	    if (-1 != ((Class531) this).anInt6950 * -1153642397)
		return false;
	} else {
	    if (-1153642397 * ((Class531) this).anInt6950
		!= class241_sub24.method15064(802677367))
		return false;
	    if (2085440245 * ((Class531) this).anInt6951
		> class241_sub24.method15068((byte) 63))
		return false;
	    int[] is = ((Class531) this).anIntArray6952;
	    for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
		int i_5_ = is[i_4_];
		if (!class578.isKeyPressed(i_5_, -1016346882))
		    return false;
	    }
	}
	return true;
    }
    
    public boolean method423(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578, int i_6_) {
	if (null == class241_sub24) {
	    if (-1 != ((Class531) this).anInt6950 * -1153642397)
		return false;
	} else {
	    if (-1153642397 * ((Class531) this).anInt6950
		!= class241_sub24.method15064(1244740768))
		return false;
	    if (2085440245 * ((Class531) this).anInt6951
		> class241_sub24.method15068((byte) -38))
		return false;
	    int[] is = ((Class531) this).anIntArray6952;
	    for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
		int i_8_ = is[i_7_];
		if (!class578.isKeyPressed(i_8_, -1016346882))
		    return false;
	    }
	}
	return true;
    }
    
    Class531(int i, int i_9_, int[] is) {
	((Class531) this).anInt6950 = 1833185611 * i;
	((Class531) this).anInt6951 = 1648071005 * i_9_;
	((Class531) this).anIntArray6952 = is;
    }
    
    static Class531 method11846(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) 39);
	int i_10_ = class241_sub3.readUnsignedByte((byte) -3);
	int i_11_ = class241_sub3.readUnsignedByte((byte) -3);
	int[] is = new int[i_11_];
	for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
	    is[i_12_] = class241_sub3.readUnsignedByte((byte) 31);
	return new Class531(i, i_10_, is);
    }
    
    static final void method11847(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_13_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_14_ = (((ClientScriptData) class454).integerStack
		     [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	Class445_Sub16.aClass351_Sub1_8660.method6259
	    ((float) (2.0 * ((double) i_13_ * 3.141592653589793) / 16384.0),
	     (float) (3.141592653589793 * (double) i_14_ * 2.0 / 16384.0),
	     (byte) -9);
    }
    
    public static Interface47 method11848(Interface47[] interface47s, int id, int i_15_) {
		Interface47[] interface47s_16_ = interface47s;
		for (int index = 0; index < interface47s_16_.length; index++) {
		    Interface47 interface47 = interface47s_16_[index];
		    if (id == interface47.getId((byte) 0)) {
		    	return interface47;
		    }
		}
		return null;
    }
}
