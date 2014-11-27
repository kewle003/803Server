/* Class565 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class565
{
    byte[] aByteArray7309;
    List aList7310;
    boolean aBool7311;
    byte[] aByteArray7312;
    int anInt7313;
    int anInt7314;
    int anInt7315;
    float aFloat7316;
    int anInt7317;
    int anInt7318;
    SourceDataLine aSourceDataLine7319;
    Class393_Sub2 this$0;
    protected static Class414[] cacheIndex;//aClass414Array7320
    public static JS5 aClass210_7321;
    
    void method12420(Class569 class569) {
	((Class565) this).aList7310.remove(class569);
    }
    
    void method12421() {
	if (((Class565) this).aBool7311) {
	    if (((Class565) this).aSourceDataLine7319 != null)
		((Class565) this).anInt7313
		    = (((Class565) this).aSourceDataLine7319.available()
		       * 2105194091);
	}
    }
    
    void method12422(int i) {
	((Class565) this).anInt7315 = 0;
	method12423(1753802283);
	int i_0_;
	for (/**/; ((Class565) this).anInt7315 * -536311365 > 0;
	     ((Class565) this).anInt7315 -= 522179443 * i_0_) {
	    i_0_ = ((Class565) this).anInt7315 * -536311365;
	    if (i_0_ + -1720458483 * ((Class565) this).anInt7314
		>= ((Class565) this).aByteArray7309.length)
		i_0_ = (((Class565) this).aByteArray7309.length
			- -1720458483 * ((Class565) this).anInt7314);
	    ((Class565) this).aSourceDataLine7319.write
		(((Class565) this).aByteArray7309,
		 -1720458483 * ((Class565) this).anInt7314, i_0_);
	    for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
		((Class565) this).aByteArray7309
		    [i_1_ + -1720458483 * ((Class565) this).anInt7314]
		    = (byte) 0;
	    ((Class565) this).anInt7314 += 889562053 * i_0_;
	    ((Class565) this).anInt7314
		= (((Class565) this).anInt7314 * -1720458483
		   % ((Class565) this).aByteArray7309.length * 889562053);
	}
    }
    
    void method12423(int i) {
	synchronized (this) {
	    int i_2_ = 2147483647;
	    double d
		= (double) (-1687761615 * ((Class565) this).anInt7318
			    * (((Class565) this).anInt7317 * 2022956485 / 8));
	    boolean bool = false;
	    Iterator iterator = ((Class565) this).aList7310.iterator();
	    while (iterator.hasNext()) {
		Class569 class569 = (Class569) iterator.next();
		int i_3_ = (((Class569) class569).aByteArray7337.length
			    - 1899016581 * ((Class569) class569).anInt7341);
		if (((Class565) this).aFloat7316
		    != ((Class569) class569).aFloat7343) {
		    i_3_ *= (((Class565) this).aFloat7316
			     / ((Class569) class569).aFloat7343);
		    i_3_ = (int) (d * Math.ceil((double) i_3_ / d));
		}
		((Class569) class569).anInt7342 = 1716530607 * i_3_;
		if (i_3_ > 0 && i_3_ < i_2_) {
		    bool = true;
		    i_2_ = i_3_;
		}
	    }
	    if (i_2_ > -683456957 * ((Class565) this).anInt7313)
		i_2_ = ((Class565) this).anInt7313 * -683456957;
	    if (0 == i_2_ || !bool) {
		/* empty */
	    } else {
		int i_4_ = ((Class565) this).anInt7317 * 2022956485 / 8;
		Iterator iterator_5_ = ((Class565) this).aList7310.iterator();
		while (iterator_5_.hasNext()) {
		    Class569 class569 = (Class569) iterator_5_.next();
		    if (1429555535 * ((Class569) class569).anInt7342 >= i_2_) {
			int i_6_ = ((Class565) this).anInt7314 * -1720458483;
			int i_7_ = 0;
			int i_8_
			    = ((Class569) class569).anInt7344 * 1094671849 / 8;
			double d_9_ = 0.0;
			int i_10_ = 0;
			double d_11_ = (double) ((Class565) this).aFloat7316;
			double d_12_
			    = (double) ((Class569) class569).aFloat7343;
			int i_13_
			    = ((Class569) class569).anInt7345 * 1286666637;
			for (/**/;
			     (((Class569) class569).anInt7342 * 1429555535 > 0
			      && i_7_ < i_2_);
			     i_7_ += i_8_) {
			    short i_14_ = 0;
			    short i_15_ = 0;
			    byte[] is = ((Class565) this).aByteArray7312;
			    for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
				is[i_16_] = (((Class565) this).aByteArray7309
					     [i_16_ + i_6_]);
				i_14_ |= (is[i_16_] & 0xff) << 8 * i_16_;
			    }
			    if (((Class565) this).aFloat7316
				!= ((Class569) class569).aFloat7343) {
				byte[] is_17_
				    = ((Class569) class569).aByteArray7338;
				float f = (float) (d_12_ * (d_9_ / d_11_));
				float f_18_ = (float) Math.floor((double) f);
				short i_19_ = 0;
				short i_20_ = 0;
				int i_21_ = (int) Math.floor((double) f);
				int i_22_ = (int) Math.ceil((double) f);
				i_21_ = ((i_21_
					  * (is_17_.length
					     * (((Class569) class569).anInt7346
						* -2143252363)))
					 + i_10_ * is_17_.length);
				i_22_ = (i_22_ * (is_17_.length
						  * (-2143252363
						     * (((Class569) class569)
							.anInt7346)))
					 + is_17_.length * i_10_);
				i_21_ += i_13_;
				i_22_ += i_13_;
				i_21_ %= (((Class569) class569)
					  .aByteArray7337).length;
				i_22_ %= (((Class569) class569)
					  .aByteArray7337).length;
				for (int i_23_ = 0; i_23_ < is_17_.length;
				     i_23_++) {
				    is_17_[i_23_]
					= (((Class569) class569).aByteArray7337
					   [i_23_ + i_21_]);
				    i_19_
					|= (is_17_[i_23_] & 0xff) << i_23_ * 8;
				}
				for (int i_24_ = 0; i_24_ < is_17_.length;
				     i_24_++) {
				    is_17_[i_24_]
					= (((Class569) class569).aByteArray7337
					   [i_24_ + i_22_]);
				    i_20_
					|= (is_17_[i_24_] & 0xff) << 8 * i_24_;
				}
				float f_25_ = f - f_18_;
				if (f_25_ < 0.0F || f_25_ > 1.0F)
				    throw new RuntimeException("");
				float f_26_ = (float) (i_20_ - i_19_);
				i_15_ = (short) (int) (f_25_ * f_26_
						       + (float) i_19_);
				i_10_ = ++i_10_ % (-2143252363
						   * (((Class569) class569)
						      .anInt7346));
				if (i_10_ == 0)
				    d_9_++;
			    } else {
				byte[] is_27_
				    = ((Class569) class569).aByteArray7338;
				for (int i_28_ = 0; i_28_ < is_27_.length;
				     i_28_++) {
				    is_27_[i_28_]
					= (((Class569) class569).aByteArray7337
					   [(((Class569) class569).anInt7345
					     * 1286666637) + i_28_]);
				    i_15_
					|= (is_27_[i_28_] & 0xff) << i_28_ * 8;
				}
				((Class569) class569).anInt7345
				    += i_8_ * 1704718661;
				Class569 class569_29_;
				((Class569) (class569_29_
					     = class569)).anInt7345
				    = (1704718661
				       * (((Class569) class569_29_).anInt7345
					  * 1286666637
					  % (((Class569) class569)
					     .aByteArray7337).length));
				((Class569) class569).anInt7341
				    += 1283825485 * i_8_;
			    }
			    i_15_ += i_14_;
			    if (i_15_ > 32767)
				i_15_ = (short) 32767;
			    if (i_15_ < -32768)
				i_15_ = (short) -32768;
			    ((Class565) this).aByteArray7309[i_6_]
				= (byte) i_15_;
			    ((Class565) this).aByteArray7309[1 + i_6_]
				= (byte) (i_15_ >> 8);
			    i_6_ += i_4_;
			    i_6_ %= ((Class565) this).aByteArray7309.length;
			}
			if (((Class565) this).aFloat7316
			    != ((Class569) class569).aFloat7343) {
			    double d_30_ = d_12_ / d_11_ * (double) i_2_;
			    int i_31_ = (int) (d * Math.ceil(d_30_ / d));
			    ((Class569) class569).anInt7345
				+= 1704718661 * i_31_;
			    Class569 class569_32_;
			    ((Class569) (class569_32_ = class569)).anInt7345
				= (1704718661
				   * (((Class569) class569_32_).anInt7345
				      * 1286666637
				      % (((Class569) class569)
					 .aByteArray7337).length));
			    ((Class569) class569).anInt7341
				+= i_31_ * 1283825485;
			}
		    }
		}
		((Class565) this).anInt7315 = i_2_ * 522179443;
	    }
	}
    }
    
    void method12424(Class569 class569, int i) {
	((Class565) this).aList7310.add(class569);
    }
    
    void method12425(Class569 class569, int i) {
	((Class565) this).aList7310.remove(class569);
    }
    
    void method12426(Class569 class569) {
	((Class565) this).aList7310.remove(class569);
    }
    
    void method12427(int i) {
	if (((Class565) this).aBool7311) {
	    if (((Class565) this).aSourceDataLine7319 != null)
		((Class565) this).anInt7313
		    = (((Class565) this).aSourceDataLine7319.available()
		       * 2105194091);
	}
    }
    
    void method12428() {
	synchronized (this) {
	    int i = 2147483647;
	    double d
		= (double) (-1687761615 * ((Class565) this).anInt7318
			    * (((Class565) this).anInt7317 * 2022956485 / 8));
	    boolean bool = false;
	    Iterator iterator = ((Class565) this).aList7310.iterator();
	    while (iterator.hasNext()) {
		Class569 class569 = (Class569) iterator.next();
		int i_33_ = (((Class569) class569).aByteArray7337.length
			     - 1899016581 * ((Class569) class569).anInt7341);
		if (((Class565) this).aFloat7316
		    != ((Class569) class569).aFloat7343) {
		    i_33_ *= (((Class565) this).aFloat7316
			      / ((Class569) class569).aFloat7343);
		    i_33_ = (int) (d * Math.ceil((double) i_33_ / d));
		}
		((Class569) class569).anInt7342 = 1716530607 * i_33_;
		if (i_33_ > 0 && i_33_ < i) {
		    bool = true;
		    i = i_33_;
		}
	    }
	    if (i > -683456957 * ((Class565) this).anInt7313)
		i = ((Class565) this).anInt7313 * -683456957;
	    if (0 == i || !bool) {
		/* empty */
	    } else {
		int i_34_ = ((Class565) this).anInt7317 * 2022956485 / 8;
		Iterator iterator_35_ = ((Class565) this).aList7310.iterator();
		while (iterator_35_.hasNext()) {
		    Class569 class569 = (Class569) iterator_35_.next();
		    if (1429555535 * ((Class569) class569).anInt7342 >= i) {
			int i_36_ = ((Class565) this).anInt7314 * -1720458483;
			int i_37_ = 0;
			int i_38_
			    = ((Class569) class569).anInt7344 * 1094671849 / 8;
			double d_39_ = 0.0;
			int i_40_ = 0;
			double d_41_ = (double) ((Class565) this).aFloat7316;
			double d_42_
			    = (double) ((Class569) class569).aFloat7343;
			int i_43_
			    = ((Class569) class569).anInt7345 * 1286666637;
			for (/**/;
			     (((Class569) class569).anInt7342 * 1429555535 > 0
			      && i_37_ < i);
			     i_37_ += i_38_) {
			    short i_44_ = 0;
			    short i_45_ = 0;
			    byte[] is = ((Class565) this).aByteArray7312;
			    for (int i_46_ = 0; i_46_ < is.length; i_46_++) {
				is[i_46_] = (((Class565) this).aByteArray7309
					     [i_46_ + i_36_]);
				i_44_ |= (is[i_46_] & 0xff) << 8 * i_46_;
			    }
			    if (((Class565) this).aFloat7316
				!= ((Class569) class569).aFloat7343) {
				byte[] is_47_
				    = ((Class569) class569).aByteArray7338;
				float f = (float) (d_42_ * (d_39_ / d_41_));
				float f_48_ = (float) Math.floor((double) f);
				short i_49_ = 0;
				short i_50_ = 0;
				int i_51_ = (int) Math.floor((double) f);
				int i_52_ = (int) Math.ceil((double) f);
				i_51_ = ((i_51_
					  * (is_47_.length
					     * (((Class569) class569).anInt7346
						* -2143252363)))
					 + i_40_ * is_47_.length);
				i_52_ = (i_52_ * (is_47_.length
						  * (-2143252363
						     * (((Class569) class569)
							.anInt7346)))
					 + is_47_.length * i_40_);
				i_51_ += i_43_;
				i_52_ += i_43_;
				i_51_ %= (((Class569) class569)
					  .aByteArray7337).length;
				i_52_ %= (((Class569) class569)
					  .aByteArray7337).length;
				for (int i_53_ = 0; i_53_ < is_47_.length;
				     i_53_++) {
				    is_47_[i_53_]
					= (((Class569) class569).aByteArray7337
					   [i_53_ + i_51_]);
				    i_49_
					|= (is_47_[i_53_] & 0xff) << i_53_ * 8;
				}
				for (int i_54_ = 0; i_54_ < is_47_.length;
				     i_54_++) {
				    is_47_[i_54_]
					= (((Class569) class569).aByteArray7337
					   [i_54_ + i_52_]);
				    i_50_
					|= (is_47_[i_54_] & 0xff) << 8 * i_54_;
				}
				float f_55_ = f - f_48_;
				if (f_55_ < 0.0F || f_55_ > 1.0F)
				    throw new RuntimeException("");
				float f_56_ = (float) (i_50_ - i_49_);
				i_45_ = (short) (int) (f_55_ * f_56_
						       + (float) i_49_);
				i_40_ = ++i_40_ % (-2143252363
						   * (((Class569) class569)
						      .anInt7346));
				if (i_40_ == 0)
				    d_39_++;
			    } else {
				byte[] is_57_
				    = ((Class569) class569).aByteArray7338;
				for (int i_58_ = 0; i_58_ < is_57_.length;
				     i_58_++) {
				    is_57_[i_58_]
					= (((Class569) class569).aByteArray7337
					   [(((Class569) class569).anInt7345
					     * 1286666637) + i_58_]);
				    i_45_
					|= (is_57_[i_58_] & 0xff) << i_58_ * 8;
				}
				((Class569) class569).anInt7345
				    += i_38_ * 1704718661;
				Class569 class569_59_;
				((Class569) (class569_59_
					     = class569)).anInt7345
				    = (1704718661
				       * (((Class569) class569_59_).anInt7345
					  * 1286666637
					  % (((Class569) class569)
					     .aByteArray7337).length));
				((Class569) class569).anInt7341
				    += 1283825485 * i_38_;
			    }
			    i_45_ += i_44_;
			    if (i_45_ > 32767)
				i_45_ = (short) 32767;
			    if (i_45_ < -32768)
				i_45_ = (short) -32768;
			    ((Class565) this).aByteArray7309[i_36_]
				= (byte) i_45_;
			    ((Class565) this).aByteArray7309[1 + i_36_]
				= (byte) (i_45_ >> 8);
			    i_36_ += i_34_;
			    i_36_ %= ((Class565) this).aByteArray7309.length;
			}
			if (((Class565) this).aFloat7316
			    != ((Class569) class569).aFloat7343) {
			    double d_60_ = d_42_ / d_41_ * (double) i;
			    int i_61_ = (int) (d * Math.ceil(d_60_ / d));
			    ((Class569) class569).anInt7345
				+= 1704718661 * i_61_;
			    Class569 class569_62_;
			    ((Class569) (class569_62_ = class569)).anInt7345
				= (1704718661
				   * (((Class569) class569_62_).anInt7345
				      * 1286666637
				      % (((Class569) class569)
					 .aByteArray7337).length));
			    ((Class569) class569).anInt7341
				+= i_61_ * 1283825485;
			}
		    }
		}
		((Class565) this).anInt7315 = i * 522179443;
	    }
	}
    }
    
    void method12429() {
	((Class565) this).anInt7315 = 0;
	method12423(1837817285);
	int i;
	for (/**/; ((Class565) this).anInt7315 * -536311365 > 0;
	     ((Class565) this).anInt7315 -= 522179443 * i) {
	    i = ((Class565) this).anInt7315 * -536311365;
	    if (i + -1720458483 * ((Class565) this).anInt7314
		>= ((Class565) this).aByteArray7309.length)
		i = (((Class565) this).aByteArray7309.length
		     - -1720458483 * ((Class565) this).anInt7314);
	    ((Class565) this).aSourceDataLine7319.write
		(((Class565) this).aByteArray7309,
		 -1720458483 * ((Class565) this).anInt7314, i);
	    for (int i_63_ = 0; i_63_ < i; i_63_++)
		((Class565) this).aByteArray7309
		    [i_63_ + -1720458483 * ((Class565) this).anInt7314]
		    = (byte) 0;
	    ((Class565) this).anInt7314 += 889562053 * i;
	    ((Class565) this).anInt7314
		= (((Class565) this).anInt7314 * -1720458483
		   % ((Class565) this).aByteArray7309.length * 889562053);
	}
    }
    
    void method12430() {
	synchronized (this) {
	    int i = 2147483647;
	    double d
		= (double) (-1687761615 * ((Class565) this).anInt7318
			    * (((Class565) this).anInt7317 * 2022956485 / 8));
	    boolean bool = false;
	    Iterator iterator = ((Class565) this).aList7310.iterator();
	    while (iterator.hasNext()) {
		Class569 class569 = (Class569) iterator.next();
		int i_64_ = (((Class569) class569).aByteArray7337.length
			     - 1899016581 * ((Class569) class569).anInt7341);
		if (((Class565) this).aFloat7316
		    != ((Class569) class569).aFloat7343) {
		    i_64_ *= (((Class565) this).aFloat7316
			      / ((Class569) class569).aFloat7343);
		    i_64_ = (int) (d * Math.ceil((double) i_64_ / d));
		}
		((Class569) class569).anInt7342 = 1716530607 * i_64_;
		if (i_64_ > 0 && i_64_ < i) {
		    bool = true;
		    i = i_64_;
		}
	    }
	    if (i > -683456957 * ((Class565) this).anInt7313)
		i = ((Class565) this).anInt7313 * -683456957;
	    if (0 == i || !bool) {
		/* empty */
	    } else {
		int i_65_ = ((Class565) this).anInt7317 * 2022956485 / 8;
		Iterator iterator_66_ = ((Class565) this).aList7310.iterator();
		while (iterator_66_.hasNext()) {
		    Class569 class569 = (Class569) iterator_66_.next();
		    if (1429555535 * ((Class569) class569).anInt7342 >= i) {
			int i_67_ = ((Class565) this).anInt7314 * -1720458483;
			int i_68_ = 0;
			int i_69_
			    = ((Class569) class569).anInt7344 * 1094671849 / 8;
			double d_70_ = 0.0;
			int i_71_ = 0;
			double d_72_ = (double) ((Class565) this).aFloat7316;
			double d_73_
			    = (double) ((Class569) class569).aFloat7343;
			int i_74_
			    = ((Class569) class569).anInt7345 * 1286666637;
			for (/**/;
			     (((Class569) class569).anInt7342 * 1429555535 > 0
			      && i_68_ < i);
			     i_68_ += i_69_) {
			    short i_75_ = 0;
			    short i_76_ = 0;
			    byte[] is = ((Class565) this).aByteArray7312;
			    for (int i_77_ = 0; i_77_ < is.length; i_77_++) {
				is[i_77_] = (((Class565) this).aByteArray7309
					     [i_77_ + i_67_]);
				i_75_ |= (is[i_77_] & 0xff) << 8 * i_77_;
			    }
			    if (((Class565) this).aFloat7316
				!= ((Class569) class569).aFloat7343) {
				byte[] is_78_
				    = ((Class569) class569).aByteArray7338;
				float f = (float) (d_73_ * (d_70_ / d_72_));
				float f_79_ = (float) Math.floor((double) f);
				short i_80_ = 0;
				short i_81_ = 0;
				int i_82_ = (int) Math.floor((double) f);
				int i_83_ = (int) Math.ceil((double) f);
				i_82_ = ((i_82_
					  * (is_78_.length
					     * (((Class569) class569).anInt7346
						* -2143252363)))
					 + i_71_ * is_78_.length);
				i_83_ = (i_83_ * (is_78_.length
						  * (-2143252363
						     * (((Class569) class569)
							.anInt7346)))
					 + is_78_.length * i_71_);
				i_82_ += i_74_;
				i_83_ += i_74_;
				i_82_ %= (((Class569) class569)
					  .aByteArray7337).length;
				i_83_ %= (((Class569) class569)
					  .aByteArray7337).length;
				for (int i_84_ = 0; i_84_ < is_78_.length;
				     i_84_++) {
				    is_78_[i_84_]
					= (((Class569) class569).aByteArray7337
					   [i_84_ + i_82_]);
				    i_80_
					|= (is_78_[i_84_] & 0xff) << i_84_ * 8;
				}
				for (int i_85_ = 0; i_85_ < is_78_.length;
				     i_85_++) {
				    is_78_[i_85_]
					= (((Class569) class569).aByteArray7337
					   [i_85_ + i_83_]);
				    i_81_
					|= (is_78_[i_85_] & 0xff) << 8 * i_85_;
				}
				float f_86_ = f - f_79_;
				if (f_86_ < 0.0F || f_86_ > 1.0F)
				    throw new RuntimeException("");
				float f_87_ = (float) (i_81_ - i_80_);
				i_76_ = (short) (int) (f_86_ * f_87_
						       + (float) i_80_);
				i_71_ = ++i_71_ % (-2143252363
						   * (((Class569) class569)
						      .anInt7346));
				if (i_71_ == 0)
				    d_70_++;
			    } else {
				byte[] is_88_
				    = ((Class569) class569).aByteArray7338;
				for (int i_89_ = 0; i_89_ < is_88_.length;
				     i_89_++) {
				    is_88_[i_89_]
					= (((Class569) class569).aByteArray7337
					   [(((Class569) class569).anInt7345
					     * 1286666637) + i_89_]);
				    i_76_
					|= (is_88_[i_89_] & 0xff) << i_89_ * 8;
				}
				((Class569) class569).anInt7345
				    += i_69_ * 1704718661;
				Class569 class569_90_;
				((Class569) (class569_90_
					     = class569)).anInt7345
				    = (1704718661
				       * (((Class569) class569_90_).anInt7345
					  * 1286666637
					  % (((Class569) class569)
					     .aByteArray7337).length));
				((Class569) class569).anInt7341
				    += 1283825485 * i_69_;
			    }
			    i_76_ += i_75_;
			    if (i_76_ > 32767)
				i_76_ = (short) 32767;
			    if (i_76_ < -32768)
				i_76_ = (short) -32768;
			    ((Class565) this).aByteArray7309[i_67_]
				= (byte) i_76_;
			    ((Class565) this).aByteArray7309[1 + i_67_]
				= (byte) (i_76_ >> 8);
			    i_67_ += i_65_;
			    i_67_ %= ((Class565) this).aByteArray7309.length;
			}
			if (((Class565) this).aFloat7316
			    != ((Class569) class569).aFloat7343) {
			    double d_91_ = d_73_ / d_72_ * (double) i;
			    int i_92_ = (int) (d * Math.ceil(d_91_ / d));
			    ((Class569) class569).anInt7345
				+= 1704718661 * i_92_;
			    Class569 class569_93_;
			    ((Class569) (class569_93_ = class569)).anInt7345
				= (1704718661
				   * (((Class569) class569_93_).anInt7345
				      * 1286666637
				      % (((Class569) class569)
					 .aByteArray7337).length));
			    ((Class569) class569).anInt7341
				+= i_92_ * 1283825485;
			}
		    }
		}
		((Class565) this).anInt7315 = i * 522179443;
	    }
	}
    }
    
    Class565(Class393_Sub2 class393_sub2, float f, int i) {
	((Class565) this).this$0 = class393_sub2;
	((Class565) this).anInt7317 = 1970901200;
	((Class565) this).anInt7318 = 2097076130;
	((Class565) this).aList7310 = new ArrayList();
	if (!((Class565) this).aBool7311) {
	    ((Class565) this).aFloat7316 = f;
	    if (2022956485 * ((Class565) this).anInt7317 > 16)
		throw new RuntimeException("");
	    try {
		AudioFormat audioformat
		    = new AudioFormat(((Class565) this).aFloat7316,
				      2022956485 * ((Class565) this).anInt7317,
				      (((Class565) this).anInt7318
				       * -1687761615),
				      true, false);
		try {
		    DataLine.Info info
			= (new DataLine.Info
			   (javax.sound.sampled.SourceDataLine.class,
			    audioformat, i));
		    ((Class565) this).aSourceDataLine7319
			= (SourceDataLine) AudioSystem.getLine(info);
		} catch (IllegalArgumentException illegalargumentexception) {
		    return;
		}
		((Class565) this).aSourceDataLine7319.open(audioformat, i);
		((Class565) this).aSourceDataLine7319.start();
	    } catch (LineUnavailableException lineunavailableexception) {
		return;
	    }
	    ((Class565) this).aByteArray7309 = new byte[i];
	    ((Class565) this).aByteArray7312
		= new byte[((Class565) this).anInt7317 * 2022956485 / 8];
	    ((Class565) this).anInt7314 = 0;
	    ((Class565) this).aBool7311 = true;
	}
    }
    
    void method12431(Class569 class569) {
	((Class565) this).aList7310.remove(class569);
    }
    
    void method12432() {
	synchronized (this) {
	    int i = 2147483647;
	    double d
		= (double) (-1687761615 * ((Class565) this).anInt7318
			    * (((Class565) this).anInt7317 * 2022956485 / 8));
	    boolean bool = false;
	    Iterator iterator = ((Class565) this).aList7310.iterator();
	    while (iterator.hasNext()) {
		Class569 class569 = (Class569) iterator.next();
		int i_94_ = (((Class569) class569).aByteArray7337.length
			     - 1899016581 * ((Class569) class569).anInt7341);
		if (((Class565) this).aFloat7316
		    != ((Class569) class569).aFloat7343) {
		    i_94_ *= (((Class565) this).aFloat7316
			      / ((Class569) class569).aFloat7343);
		    i_94_ = (int) (d * Math.ceil((double) i_94_ / d));
		}
		((Class569) class569).anInt7342 = 1716530607 * i_94_;
		if (i_94_ > 0 && i_94_ < i) {
		    bool = true;
		    i = i_94_;
		}
	    }
	    if (i > -683456957 * ((Class565) this).anInt7313)
		i = ((Class565) this).anInt7313 * -683456957;
	    if (0 == i || !bool) {
		/* empty */
	    } else {
		int i_95_ = ((Class565) this).anInt7317 * 2022956485 / 8;
		Iterator iterator_96_ = ((Class565) this).aList7310.iterator();
		while (iterator_96_.hasNext()) {
		    Class569 class569 = (Class569) iterator_96_.next();
		    if (1429555535 * ((Class569) class569).anInt7342 >= i) {
			int i_97_ = ((Class565) this).anInt7314 * -1720458483;
			int i_98_ = 0;
			int i_99_
			    = ((Class569) class569).anInt7344 * 1094671849 / 8;
			double d_100_ = 0.0;
			int i_101_ = 0;
			double d_102_ = (double) ((Class565) this).aFloat7316;
			double d_103_
			    = (double) ((Class569) class569).aFloat7343;
			int i_104_
			    = ((Class569) class569).anInt7345 * 1286666637;
			for (/**/;
			     (((Class569) class569).anInt7342 * 1429555535 > 0
			      && i_98_ < i);
			     i_98_ += i_99_) {
			    short i_105_ = 0;
			    short i_106_ = 0;
			    byte[] is = ((Class565) this).aByteArray7312;
			    for (int i_107_ = 0; i_107_ < is.length;
				 i_107_++) {
				is[i_107_] = (((Class565) this).aByteArray7309
					      [i_107_ + i_97_]);
				i_105_ |= (is[i_107_] & 0xff) << 8 * i_107_;
			    }
			    if (((Class565) this).aFloat7316
				!= ((Class569) class569).aFloat7343) {
				byte[] is_108_
				    = ((Class569) class569).aByteArray7338;
				float f = (float) (d_103_ * (d_100_ / d_102_));
				float f_109_ = (float) Math.floor((double) f);
				short i_110_ = 0;
				short i_111_ = 0;
				int i_112_ = (int) Math.floor((double) f);
				int i_113_ = (int) Math.ceil((double) f);
				i_112_ = (i_112_ * (is_108_.length
						    * ((((Class569) class569)
							.anInt7346)
						       * -2143252363))
					  + i_101_ * is_108_.length);
				i_113_ = (i_113_ * (is_108_.length
						    * (-2143252363
						       * (((Class569) class569)
							  .anInt7346)))
					  + is_108_.length * i_101_);
				i_112_ += i_104_;
				i_113_ += i_104_;
				i_112_ %= (((Class569) class569)
					   .aByteArray7337).length;
				i_113_ %= (((Class569) class569)
					   .aByteArray7337).length;
				for (int i_114_ = 0; i_114_ < is_108_.length;
				     i_114_++) {
				    is_108_[i_114_]
					= (((Class569) class569).aByteArray7337
					   [i_114_ + i_112_]);
				    i_110_ |= ((is_108_[i_114_] & 0xff)
					       << i_114_ * 8);
				}
				for (int i_115_ = 0; i_115_ < is_108_.length;
				     i_115_++) {
				    is_108_[i_115_]
					= (((Class569) class569).aByteArray7337
					   [i_115_ + i_113_]);
				    i_111_ |= ((is_108_[i_115_] & 0xff)
					       << 8 * i_115_);
				}
				float f_116_ = f - f_109_;
				if (f_116_ < 0.0F || f_116_ > 1.0F)
				    throw new RuntimeException("");
				float f_117_ = (float) (i_111_ - i_110_);
				i_106_ = (short) (int) (f_116_ * f_117_
							+ (float) i_110_);
				i_101_ = ++i_101_ % (-2143252363
						     * (((Class569) class569)
							.anInt7346));
				if (i_101_ == 0)
				    d_100_++;
			    } else {
				byte[] is_118_
				    = ((Class569) class569).aByteArray7338;
				for (int i_119_ = 0; i_119_ < is_118_.length;
				     i_119_++) {
				    is_118_[i_119_]
					= (((Class569) class569).aByteArray7337
					   [(((Class569) class569).anInt7345
					     * 1286666637) + i_119_]);
				    i_106_ |= ((is_118_[i_119_] & 0xff)
					       << i_119_ * 8);
				}
				((Class569) class569).anInt7345
				    += i_99_ * 1704718661;
				Class569 class569_120_;
				((Class569) (class569_120_
					     = class569)).anInt7345
				    = (1704718661
				       * (((Class569) class569_120_).anInt7345
					  * 1286666637
					  % (((Class569) class569)
					     .aByteArray7337).length));
				((Class569) class569).anInt7341
				    += 1283825485 * i_99_;
			    }
			    i_106_ += i_105_;
			    if (i_106_ > 32767)
				i_106_ = (short) 32767;
			    if (i_106_ < -32768)
				i_106_ = (short) -32768;
			    ((Class565) this).aByteArray7309[i_97_]
				= (byte) i_106_;
			    ((Class565) this).aByteArray7309[1 + i_97_]
				= (byte) (i_106_ >> 8);
			    i_97_ += i_95_;
			    i_97_ %= ((Class565) this).aByteArray7309.length;
			}
			if (((Class565) this).aFloat7316
			    != ((Class569) class569).aFloat7343) {
			    double d_121_ = d_103_ / d_102_ * (double) i;
			    int i_122_ = (int) (d * Math.ceil(d_121_ / d));
			    ((Class569) class569).anInt7345
				+= 1704718661 * i_122_;
			    Class569 class569_123_;
			    ((Class569) (class569_123_ = class569)).anInt7345
				= (1704718661
				   * (((Class569) class569_123_).anInt7345
				      * 1286666637
				      % (((Class569) class569)
					 .aByteArray7337).length));
			    ((Class569) class569).anInt7341
				+= i_122_ * 1283825485;
			}
		    }
		}
		((Class565) this).anInt7315 = i * 522179443;
	    }
	}
    }
    
    static boolean method12433(String string, String string_124_, int i) {
	Class13.anInt77 = 1651570860;
	Exception_Sub5.aClass190_10704 = client.aClass190_8339;
	return CcDeltaNode.method15095(false, false, string, string_124_,
					  -1L);
    }
    
    static char encodeCharacter/*method12434*/(char c, byte i) {
		switch (c) {
			case '\u00c8':
			case '\u00c9':
			case '\u00ca':
			case '\u00cb':
			case '\u00e8':
			case '\u00e9':
			case '\u00ea':
			case '\u00eb':
			    return 'e';
			case '#':
			case '[':
			case ']':
			    return c;
			case '\u00df':
			    return 'b';
			default:
			    return Character.toLowerCase(c);
			case '\u00ff':
			case '\u0178':
			    return 'y';
			case '\u00c7':
			case '\u00e7':
			    return 'c';
			case '\u00c0':
			case '\u00c1':
			case '\u00c2':
			case '\u00c3':
			case '\u00c4':
			case '\u00e0':
			case '\u00e1':
			case '\u00e2':
			case '\u00e3':
			case '\u00e4':
			    return 'a';
			case '\u00d2':
			case '\u00d3':
			case '\u00d4':
			case '\u00d5':
			case '\u00d6':
			case '\u00f2':
			case '\u00f3':
			case '\u00f4':
			case '\u00f5':
			case '\u00f6':
			    return 'o';
			case '\u00cd':
			case '\u00ce':
			case '\u00cf':
			case '\u00ed':
			case '\u00ee':
			case '\u00ef':
			    return 'i';
			case '\u00d1':
			case '\u00f1':
			    return 'n';
			case '\u00d9':
			case '\u00da':
			case '\u00db':
			case '\u00dc':
			case '\u00f9':
			case '\u00fa':
			case '\u00fb':
			case '\u00fc':
			    return 'u';
			case ' ':
			case '-':
			case '_':
			case '\u00a0':
			    return '_';
		}
    }
}
