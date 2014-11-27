/* Class120_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120_Sub21 extends Class120
{
    int anInt10619;
    String aString10620;
    int anInt10621;
    int anInt10622;
    static short aShort10623;
    
    Class120_Sub21(RSByteBuffer class241_sub3) {
	super(class241_sub3);
	((Class120_Sub21) this).anInt10619
	    = class241_sub3.readUnsignedShort(1162222719) * 896908977;
	((Class120_Sub21) this).aString10620
	    = class241_sub3.readString(610614921);
	((Class120_Sub21) this).anInt10622
	    = class241_sub3.readInt((byte) 18) * 813924145;
	((Class120_Sub21) this).anInt10621
	    = class241_sub3.readUnsignedShort(1162222719) * -1792616935;
    }
    
    public void method2958(int i) {
	Class25.aClass93Array213
	    [((Class120_Sub21) this).anInt10619 * 1501022801].method2083
	    (-537942915).method17769
	    (((Class120_Sub21) this).aString10620,
	     ((Class120_Sub21) this).anInt10622 * 171407825, 0,
	     ((Class120_Sub21) this).anInt10621 * 1090528809, 586010052);
    }
    
    public void method2961() {
	Class25.aClass93Array213
	    [((Class120_Sub21) this).anInt10619 * 1501022801].method2083
	    (-1858762346).method17769
	    (((Class120_Sub21) this).aString10620,
	     ((Class120_Sub21) this).anInt10622 * 171407825, 0,
	     ((Class120_Sub21) this).anInt10621 * 1090528809, -1105136020);
    }
    
    static final void method16849(InterfaceComponent class58, int i, byte[] is,
				  byte[] is_0_, ClientScriptData class454, int i_1_) {
	if (class58.aByteArrayArray869 == null) {
	    if (is != null) {
		class58.aByteArrayArray869 = new byte[11][];
		class58.aByteArrayArray925 = new byte[11][];
		class58.anIntArray926 = new int[11];
		class58.anIntArray831 = new int[11];
		class58.anIntArray861 = new int[11];
	    } else
		return;
	}
	class58.aByteArrayArray869[i] = is;
	if (is != null)
	    class58.aBool923 = true;
	else {
	    class58.aBool923 = false;
	    for (int i_2_ = 0; i_2_ < class58.aByteArrayArray869.length;
		 i_2_++) {
		if (class58.aByteArrayArray869[i_2_] != null
		    || class58.anIntArray861[i_2_] > 0) {
		    class58.aBool923 = true;
		    break;
		}
	    }
	}
	class58.aByteArrayArray925[i] = is_0_;
    }
    
    static void method16850(InterfaceComponent class58, Class118 class118, int i,
			    int i_3_, int i_4_, int i_5_, int i_6_, long l) {
	int i_7_ = i_4_ * i_4_ + i_5_ * i_5_;
	if ((long) i_7_ <= l) {
	    int i_8_;
	    if (4 == Class296.anInt4513 * 115241065)
		i_8_ = ((int) ((double) Class445_Sub16.aClass351_Sub1_8660
					    .method6292((byte) 65)
			       * 2607.5945876176133)
			+ client.anInt8513 * 390680985) & 0x3fff;
	    else if (115241065 * Class296.anInt4513 == 5)
		i_8_ = (int) client.aFloat8581 & 0x3fff;
	    else
		i_8_ = ((int) client.aFloat8581 + 390680985 * client.anInt8513
			& 0x3fff);
	    int i_9_ = Class282.anIntArray4430[i_8_];
	    int i_10_ = Class282.anIntArray4441[i_8_];
	    if (Class296.anInt4513 * 115241065 != 5) {
		i_9_ = 256 * i_9_ / (1747300637 * client.anInt8377 + 256);
		i_10_ = 256 * i_10_ / (1747300637 * client.anInt8377 + 256);
	    }
	    int i_11_ = i_9_ * i_5_ + i_4_ * i_10_ >> 14;
	    int i_12_ = i_10_ * i_5_ - i_4_ * i_9_ >> 14;
	    Class168 class168 = Class481.aClass168Array6456[i_6_];
	    int i_13_ = class168.method3631();
	    int i_14_ = class168.method3606();
	    int i_15_ = class58.anInt850 * 439139681 / 2 + i_11_ - i_13_ / 2;
	    int i_16_ = i_15_ + i_13_;
	    int i_17_ = 1463495207 * class58.scrollMinY / 2 + -i_12_ - i_14_;
	    int i_18_ = i_17_ + i_14_;
	    boolean bool;
	    if (null != class118)
		bool = (!class118.method2933(i_15_, i_17_, (byte) 25)
			|| !class118.method2933(i_16_, i_17_, (byte) -52)
			|| !class118.method2933(i_15_, i_18_, (byte) 67)
			|| !class118.method2933(i_16_, i_18_, (byte) 71));
	    else {
		int i_19_ = i_14_;
		int i_20_ = i_13_ / 2;
		bool = (i_17_ <= -i_19_
			|| i_18_ >= 1463495207 * class58.scrollMinY
			|| i_15_ <= -i_20_
			|| i_16_ >= class58.anInt850 * 439139681 + i_20_);
	    }
	    if (bool) {
		double d = Math.atan2((double) i_11_, (double) i_12_);
		double d_21_ = Math.atan2((double) Math.abs(i_11_),
					  (double) Math.abs(i_12_));
		double d_22_
		    = Math.atan2((double) (439139681 * class58.anInt850 / 2),
				 (double) (1463495207 * class58.scrollMinY / 2));
		boolean bool_23_ = false;
		double d_24_ = 0.0;
		int i_25_;
		if (d_21_ < d_22_) {
		    d_24_ = 1.5707963267948966 - d;
		    i_25_ = 1463495207 * class58.scrollMinY / 2;
		} else {
		    d_24_ = d;
		    i_25_ = class58.anInt850 * 439139681 / 2;
		}
		int i_26_ = Math.abs((int) -((double) i_25_
					     * Math.sin(1.5707963267948966)
					     / Math.sin(d_24_)));
		Class5.aClass168Array27[i_6_].method3619
		    (((float) (439139681 * class58.anInt850) / 2.0F + (float) i
		      + 0.0F),
		     ((float) i_3_
		      + (float) (1463495207 * class58.scrollMinY) / 2.0F - 0.0F),
		     (float) Class5.aClass168Array27[i_6_].method64() / 2.0F,
		     (float) i_26_, 4096,
		     (int) (-d / 6.283185307179586 * 65535.0));
	    } else if (class118 != null)
		class168.method3679(i_15_ + i, i_17_ + i_3_,
				    class118.aClass135_1559, i, i_3_);
	    else
		class168.method3646(i + i_15_, i_17_ + i_3_);
	}
    }
    
    static short[][] method16851(float[][] fs, short[][] is, byte i) {
	for (int i_27_ = 0; i_27_ < fs.length; i_27_++) {
	    for (int i_28_ = 0; i_28_ < is[i_27_].length; i_28_++)
		is[i_27_][i_28_] = (short) (int) (16383.0F * fs[i_27_][i_28_]);
	}
	return is;
    }
}
