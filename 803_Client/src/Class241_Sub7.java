/* Class241_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241_Sub7 extends Node
{
    public short aShort8826;
    
    public Class241_Sub7(short i) {
	aShort8826 = i;
    }
    
    static void method14894(int i) {
	if (Class474.anIntArray6383 == null) {
	    Class474.anIntArray6383 = new int[65536];
	    Class474.anIntArray6380 = new int[65536];
	    double d = 0.7 + (Math.random() * 0.03 - 0.015);
	    for (int i_0_ = 0; i_0_ < 65536; i_0_++) {
		double d_1_ = 0.0078125 + (double) (i_0_ >> 10 & 0x3f) / 64.0;
		double d_2_ = 0.0625 + (double) (i_0_ >> 7 & 0x7) / 8.0;
		double d_3_ = (double) (i_0_ & 0x7f) / 128.0;
		double d_4_ = d_3_;
		double d_5_ = d_3_;
		double d_6_ = d_3_;
		if (d_2_ != 0.0) {
		    double d_7_;
		    if (d_3_ < 0.5)
			d_7_ = d_3_ * (d_2_ + 1.0);
		    else
			d_7_ = d_3_ + d_2_ - d_2_ * d_3_;
		    double d_8_ = d_3_ * 2.0 - d_7_;
		    double d_9_ = d_1_ + 0.3333333333333333;
		    if (d_9_ > 1.0)
			d_9_--;
		    double d_10_ = d_1_;
		    double d_11_ = d_1_ - 0.3333333333333333;
		    if (d_11_ < 0.0)
			d_11_++;
		    if (d_9_ * 6.0 < 1.0)
			d_4_ = d_9_ * (6.0 * (d_7_ - d_8_)) + d_8_;
		    else if (d_9_ * 2.0 < 1.0)
			d_4_ = d_7_;
		    else if (3.0 * d_9_ < 2.0)
			d_4_ = ((d_7_ - d_8_) * (0.6666666666666666 - d_9_)
				* 6.0) + d_8_;
		    else
			d_4_ = d_8_;
		    if (d_10_ * 6.0 < 1.0)
			d_5_ = d_10_ * ((d_7_ - d_8_) * 6.0) + d_8_;
		    else if (d_10_ * 2.0 < 1.0)
			d_5_ = d_7_;
		    else if (d_10_ * 3.0 < 2.0)
			d_5_ = d_8_ + 6.0 * ((d_7_ - d_8_)
					     * (0.6666666666666666 - d_10_));
		    else
			d_5_ = d_8_;
		    if (6.0 * d_11_ < 1.0)
			d_6_ = d_8_ + d_11_ * (6.0 * (d_7_ - d_8_));
		    else if (2.0 * d_11_ < 1.0)
			d_6_ = d_7_;
		    else if (d_11_ * 3.0 < 2.0)
			d_6_ = d_8_ + ((0.6666666666666666 - d_11_)
				       * (d_7_ - d_8_) * 6.0);
		    else
			d_6_ = d_8_;
		}
		d_4_ = Math.pow(d_4_, d);
		d_5_ = Math.pow(d_5_, d);
		d_6_ = Math.pow(d_6_, d);
		int i_12_ = (int) (d_4_ * 256.0);
		int i_13_ = (int) (d_5_ * 256.0);
		int i_14_ = (int) (d_6_ * 256.0);
		int i_15_ = i_14_ + ((i_12_ << 16) + (i_13_ << 8));
		Class474.anIntArray6383[i_0_] = i_15_ & 0xffffff;
		int i_16_ = (i_13_ << 8) + (i_14_ << 16) + i_12_;
		Class474.anIntArray6380[i_0_] = i_16_;
	    }
	}
    }
}
