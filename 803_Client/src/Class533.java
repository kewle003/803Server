/* Class533 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class533 implements Interface54
{
    int[] anIntArray6967;
    
    public boolean method421(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578) {
	int[] is = ((Class533) this).anIntArray6967;
	for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
	    int i_1_ = is[i_0_];
	    if (!class578.isKeyPressed(i_1_, -1016346882))
		return false;
	}
	return true;
    }
    
    public boolean method423(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578, int i_2_) {
	int[] is = ((Class533) this).anIntArray6967;
	for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
	    int i_4_ = is[i_3_];
	    if (!class578.isKeyPressed(i_4_, -1016346882))
		return false;
	}
	return true;
    }
    
    public static Class533 method11874(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) 33);
	int[] is = new int[i];
	for (int i_5_ = 0; i_5_ < i; i_5_++)
	    is[i_5_] = class241_sub3.readUnsignedByte((byte) -51);
	return new Class533(is);
    }
    
    public boolean method422(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578) {
	int[] is = ((Class533) this).anIntArray6967;
	for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
	    int i_7_ = is[i_6_];
	    if (!class578.isKeyPressed(i_7_, -1016346882))
		return false;
	}
	return true;
    }
    
    public boolean method420(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578) {
	int[] is = ((Class533) this).anIntArray6967;
	for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
	    int i_9_ = is[i_8_];
	    if (!class578.isKeyPressed(i_9_, -1016346882))
		return false;
	}
	return true;
    }
    
    Class533(int[] is) {
	((Class533) this).anIntArray6967 = is;
    }
    
    public static Class533 method11875(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) 7);
	int[] is = new int[i];
	for (int i_10_ = 0; i_10_ < i; i_10_++)
	    is[i_10_] = class241_sub3.readUnsignedByte((byte) 2);
	return new Class533(is);
    }
    
    static void method11876(int i) {
	synchronized (Class24.aClass129_210) {
	    Class24.aClass129_210.removeSoftReferences((byte) 2);
	}
    }
}
