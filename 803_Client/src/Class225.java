/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class225
{
    int anInt2605;
    boolean aBool2606;
    int anInt2607;
    int anInt2608;
    float[] aFloatArray2609;
    int anInt2610;
    int anInt2611;
    Class393 aClass393_2612;
    int anInt2613;
    long aLong2614;
    float aFloat2615;
    int anInt2616;
    int anInt2617;
    Class222[] aClass222Array2618;
    int anInt2619;
    Object anObject2620;
    int anInt2621;
    int anInt2622;
    float aFloat2623;
    int anInt2624;
    int anInt2625;
    int[] anIntArray2626;
    Interface19 anInterface19_2627;
    int[] anIntArray2628;
    int anInt2629;
    boolean aBool2630;
    Class239 aClass239_2631;
    Interface44 anInterface44_2632;
    int anInt2633;
    int anInt2634;
    float aFloat2635;
    Object anObject2636;
    int anInt2637 = 0;
    int anInt2638 = 0;
    int anInt2639 = 0;
    boolean aBool2640;
    float aFloat2641;
    int[] anIntArray2642;
    boolean aBool2643;
    boolean aBool2644;
    boolean aBool2645;
    boolean aBool2646;
    float aFloat2647;
    Interface20 anInterface20_2648;
    long aLong2649;
    float aFloat2650;
    int anInt2651;
    boolean aBool2652;
    byte[] aByteArray2653;
    int anInt2654;
    boolean aBool2655;
    
    boolean method4502() {
	synchronized (this) {
	    if (((Class225) this).anObject2636 != null
		&& ((Class225) this).anObject2636 instanceof Class221) {
		Class221 class221 = (Class221) ((Class225) this).anObject2636;
		Interface52 interface52 = class221.method4418((byte) 21);
		if (null != interface52) {
		    boolean bool = interface52.method385((byte) -52);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    RSByteBuffer method4503(int i) {
	return ((Class225) this).anInterface44_2632.method289(i);
    }
    
    void method4504(Class239 class239, int i) {
	((Class225) this).aClass239_2631 = class239;
    }
    
    boolean method4505(byte i) {
	return Class239.aClass239_2763 == ((Class225) this).aClass239_2631;
    }
    
    boolean method4506(int i, short i_0_) {
	if (null != ((Class225) this).anObject2636
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 115);
	    return interface52.method382(i, -351886683);
	}
	return false;
    }
    
    public void method4507(int i) {
	if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
	    >= -1626286599 * ((Class239) Class239.aClass239_2758).anInt2767)
	    throw new RuntimeException("");
	method4504(Class239.aClass239_2758, 146860141);
    }
    
    public void method4508(byte i) {
	if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
	    < -1626286599 * ((Class239) Class239.aClass239_2758).anInt2767)
	    throw new RuntimeException("");
	((Class225) this).anObject2636 = null;
	method4504(Class239.aClass239_2766, 234828258);
    }
    
    boolean method4509() {
	return Class239.aClass239_2763 == ((Class225) this).aClass239_2631;
    }
    
    float method4510(byte i) {
	return ((Class225) this).aFloat2623;
    }
    
    boolean method4511(byte[] is, Interface19 interface19, int i, float f,
		       boolean bool, boolean bool_1_, int i_2_, float f_3_,
		       Object object, int i_4_) {
	synchronized (this) {
	    if (interface19 != null) {
		((Class225) this).aByteArray2653 = null;
		((Class225) this).anInterface19_2627 = interface19;
	    } else
		((Class225) this).aByteArray2653 = is;
	    ((Class225) this).anObject2636 = object;
	    ((Class225) this).anInt2610 = -1122963859 * i;
	    ((Class225) this).aFloat2623 = f;
	    ((Class225) this).aBool2644 = bool_1_;
	    ((Class225) this).anInt2611 = i_2_ * -807983855;
	    ((Class225) this).aFloat2641 = f_3_;
	    byte[] is_5_ = null;
	    if (null != ((Class225) this).aByteArray2653)
		is_5_ = ((Class225) this).aByteArray2653;
	    else if (null != ((Class225) this).anInterface19_2627) {
		((Class225) this).anInt2608 = 0;
		is_5_
		    = (((Class225) this).anInterface19_2627.method121
		       (1124524057 * ((Class225) this).anInt2608, (byte) 81));
	    }
	    if (null != is_5_) {
		RSByteBuffer class241_sub3 = new RSByteBuffer(is_5_);
		if (class241_sub3.readUnsignedByte((byte) -16) != 74
		    || class241_sub3.readUnsignedByte((byte) -17) != 65
		    || class241_sub3.readUnsignedByte((byte) 35) != 71
		    || class241_sub3.readUnsignedByte((byte) -55) != 65)
		    throw new RuntimeException("");
		((Class225) this).anInt2621
		    = class241_sub3.readInt((byte) 50) * 1557840843;
		((Class225) this).anInt2622
		    = class241_sub3.readInt((byte) 121) * -1936663153;
		((Class225) this).anInt2624
		    = class241_sub3.readInt((byte) 92) * -101280915;
		((Class225) this).anInt2605
		    = class241_sub3.readInt((byte) 52) * 299149953;
		((Class225) this).anInt2625
		    = class241_sub3.readInt((byte) 62) * -1141168747;
		if (((Class225) this).anObject2620 == null) {
		    ((Class225) this).anObject2620
			= (((Class225) this).aClass393_2612.method7026
			   (-1776708223 * ((Class225) this).anInt2605,
			    ((Class225) this).anInt2624 * 1568370277,
			    ((Class225) this).anInterface44_2632.method319(),
			    ((Class225) this).anInterface44_2632.method295(),
			    ((Class225) this).anInt2617 * 487924981,
			    ((Class225) this).aFloat2641, (byte) -30));
		    if (((Class225) this).anObject2620 == null) {
			method4504(Class239.aClass239_2765, 1687211490);
			boolean bool_6_ = false;
			return bool_6_;
		    }
		}
		((Class225) this).anIntArray2626
		    = new int[((Class225) this).anInt2625 * 929955261];
		((Class225) this).anIntArray2642
		    = new int[929955261 * ((Class225) this).anInt2625];
		((Class225) this).anIntArray2628
		    = new int[929955261 * ((Class225) this).anInt2625];
		int i_7_ = (class241_sub3.pointer * 421967667
			    + -1150292504 * ((Class225) this).anInt2625);
		for (int i_8_ = 0;
		     i_8_ < 929955261 * ((Class225) this).anInt2625; i_8_++) {
		    ((Class225) this).anIntArray2626[i_8_] = i_7_;
		    ((Class225) this).anIntArray2642[i_8_]
			= class241_sub3.readInt((byte) 117);
		    ((Class225) this).anIntArray2628[i_8_]
			= class241_sub3.readInt((byte) 83);
		    i_7_ += ((Class225) this).anIntArray2642[i_8_];
		}
		((Class225) this).anInt2629
		    = -1165118681 * class241_sub3.pointer;
		((Class225) this).aClass222Array2618
		    = new Class222[((Class225) this).anInt2607 * 1240271169];
		((Class225) this).aFloatArray2609 = new float[2];
		for (int i_9_ = 0;
		     i_9_ < ((Class225) this).aFloatArray2609.length; i_9_++)
		    ((Class225) this).aFloatArray2609[i_9_] = 1.0F;
		if (((Class225) this).anObject2636 instanceof Class221) {
		    Interface52 interface52
			= ((Class221) ((Class225) this).anObject2636)
			      .method4418((byte) 117);
		    ((Class225) this).aBool2652
			= interface52.method381(-2069486947);
		    ((Class225) this).aBool2640 = !((Class225) this).aBool2652;
		}
		((Class225) this).anInterface44_2632.method283
		    (((Class225) this).aBool2640,
		     (((Class225) this).aBool2644
		      ? 1786276849 * ((Class225) this).anInt2611 : 0),
		     ((Class225) this).anInt2621 * 1302252003,
		     1444389231 * ((Class225) this).anInt2622);
		if (null != ((Class225) this).anInterface19_2627) {
		    int i_10_ = (class241_sub3.payload.length
				 - ((Class225) this).anInt2629 * 425718549);
		    byte[] is_11_ = Class428.method7603(i_10_, true, (byte) 0);
		    System.arraycopy(class241_sub3.payload,
				     ((Class225) this).anInt2629 * 425718549,
				     is_11_, 0, i_10_);
		    class241_sub3.payload = is_11_;
		    class241_sub3.pointer = -681042949 * i_10_;
		    ((Class225) this).anInterface44_2632
			.method306(class241_sub3);
		    ((Class225) this).anInt2608 += -311788503;
		} else
		    ((Class225) this).aBool2606 = true;
		boolean bool_12_ = true;
		return bool_12_;
	    }
	    boolean bool_13_ = null != is_5_;
	    return bool_13_;
	}
    }
    
    void method4512(int i) {
	synchronized (this) {
	    method4605(-1992523793);
	}
    }
    
    public void method4513(short i) {
	synchronized (this) {
	    if (method4597(2144422350) == Class239.aClass239_2763
		|| (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		    < (((Class239) Class239.aClass239_2758).anInt2767
		       * -1626286599))) {
		/* empty */
	    } else
		method4504(Class239.aClass239_2763, 1872781605);
	}
    }
    
    boolean method4514(int i) {
	if (((Class225) this).aFloatArray2609 == null)
	    return false;
	float f = 0.0F;
	float f_14_ = 0.0F;
	for (int i_15_ = 0; i_15_ < ((Class225) this).aFloatArray2609.length;
	     i_15_++) {
	    float f_16_ = ((Class225) this).aFloatArray2609[i_15_];
	    if (f_16_ * ((Class225) this).aFloat2623 > f)
		f = f_16_;
	    if (f_16_ > f_14_)
		f_14_ = f_16_;
	}
	if (f < 1.0E-5F) {
	    if (f_14_ >= 1.0E-5F && ((Class225) this).aFloat2647 >= 1.0E-5F)
		return true;
	    return false;
	}
	return true;
    }
    
    RSByteBuffer method4515(int i) {
	if (((Class225) this).anObject2636 != null
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 34);
	    RSByteBuffer class241_sub3
		= interface52.method380(i, (short) -12829);
	    RSByteBuffer class241_sub3_17_
		= new RSByteBuffer(class241_sub3.pointer * 421967667, true);
	    class241_sub3_17_.method14633(class241_sub3, 752174194);
	    return class241_sub3_17_;
	}
	return null;
    }
    
    void method4516(int i) {
	Class322 class322
	    = (((Class225) this).aClass393_2612.method7032(-326907886)
		   .method5858
	       (((Class225) this).anInt2610 * 1364740965, (byte) 0));
	((Class225) this).aFloat2615
	    = null != class322 ? class322.method5934(-319664976) : 1.0F;
	float f = null != class322 ? class322.method5935(-857245911) : 0.1F;
	f *= ((Class225) this).aFloat2623;
	float f_18_
	    = ((Class225) this).aFloatArray2609.length > 0 ? 0.0F : 1.0F;
	for (int i_19_ = 0; i_19_ < ((Class225) this).aFloatArray2609.length;
	     i_19_++) {
	    if (((Class225) this).aFloatArray2609[i_19_] > f_18_)
		f_18_ = ((Class225) this).aFloatArray2609[i_19_];
	}
	f *= f_18_;
	if (!method4514(2039915756))
	    f = -1.0F;
	if (method4517(2114450130) != f) {
	    method4518(f, 439139681);
	    ((Class225) this).aBool2646 = true;
	}
    }
    
    public float method4517(int i) {
	return ((Class225) this).aFloat2635;
    }
    
    void method4518(float f, int i) {
	synchronized (this) {
	    ((Class225) this).aFloat2635 = f;
	}
    }
    
    public boolean method4519(int i) {
	return ((Class225) this).aBool2646;
    }
    
    public void method4520(int i) {
	synchronized (this) {
	    method4608((byte) -19);
	}
    }
    
    Object method4521(int i) {
	return ((Class225) this).anObject2636;
    }
    
    float method4522() {
	return ((Class225) this).aFloat2623;
    }
    
    void method4523(byte i) {
	synchronized (this) {
	    if (((Class225) this).anInterface44_2632.method317()
		== Class303.aClass303_4790) {
		if (((Class225) this).anObject2620 != null) {
		    int i_20_ = (((Class225) this).aClass393_2612.method7031
				 (((Class225) this).anObject2620, 615557156));
		    if (i_20_ >= 487924981 * ((Class225) this).anInt2617) {
			((Class225) this).aClass393_2612.method7027
			    (((Class225) this).anObject2620, 16711935);
			((Class225) this).anObject2620 = null;
			method4504(Class239.aClass239_2762, 1711575781);
		    }
		} else
		    method4504(Class239.aClass239_2762, 213155391);
	    }
	}
	method4573(-2097218084);
    }
    
    void method4524(byte[] is, int i, int i_21_) {
	int i_22_ = i;
	int i_23_ = 0;
	int i_24_ = (((Class225) this).anInterface44_2632.method319().anInt4875
		     * -32980023);
	while (i_22_ < is.length && i_22_ < i_21_) {
	    float f = (((Class225) this).aFloatArray2609[i_23_]
		       * (((Class225) this).aFloat2615
			  * ((Class225) this).aFloat2623));
	    if (i_24_ == 16) {
		int i_25_ = (is[1 + i_22_] << 8) + (is[i_22_] & 0xff);
		i_25_ *= f * f;
		is[i_22_++] = (byte) i_25_;
		is[i_22_++] = (byte) (i_25_ >> 8);
	    } else if (8 == i_24_) {
		byte i_26_ = is[i_22_];
		i_26_ *= f;
		is[i_22_++] = i_26_;
	    } else
		throw new RuntimeException("");
	    i_23_ = ++i_23_ % ((Class225) this).aFloatArray2609.length;
	}
    }
    
    void method4525(byte i) {
	if (true == ((Class225) this).aBool2630
	    && (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		>= (-1626286599
		    * ((Class239) Class239.aClass239_2761).anInt2767))
	    && (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		< -1626286599 * ((Class239) Class239.aClass239_2765).anInt2767)
	    && ((Class225) this).anInterface20_2648 != null
	    && ((Class225) this).aFloat2647 == ((Class225) this).aFloat2623)
	    ((Class225) this).anInterface20_2648.method123((((Class225) this)
							    .anObject2636),
							   (((Class225) this)
							    .aFloatArray2609),
							   null, -1760217813);
    }
    
    void method4526(int i) {
	((Class225) this).aBool2655 = true;
    }
    
    void method4527(int i) {
	((Class225) this).aBool2655 = false;
    }
    
    public void method4528(byte i) {
	if ((((Class239) method4597(2144422350)).anInt2767 * -1626286599
	     >= ((Class239) Class239.aClass239_2761).anInt2767 * -1626286599)
	    && (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		< -1626286599 * ((Class239) Class239.aClass239_2763).anInt2767)
	    && method4514(1790797370)) {
	    synchronized (this) {
		((Class225) this).anInterface44_2632.method282();
		method4595(1555047500);
	    }
	    Thread.yield();
	}
    }
    
    void method4529() {
	if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
	    >= -1626286599 * ((Class239) Class239.aClass239_2761).anInt2767) {
	    if (method4597(2144422350) == Class239.aClass239_2766)
		method4523((byte) 82);
	    else {
		method4614(-1619785696);
		if (((Class225) this).aFloat2647
		    != ((Class225) this).aFloat2623) {
		    long l = Class50.method1249((byte) 1);
		    if (l
			> -8873193387529044663L * ((Class225) this).aLong2614)
			((Class225) this).aFloat2623
			    = ((Class225) this).aFloat2647;
		    else {
			float f = (((Class225) this).aFloat2647
				   - ((Class225) this).aFloat2650);
			long l_27_ = ((-8873193387529044663L
				       * ((Class225) this).aLong2614)
				      - (6263173297058700257L
					 * ((Class225) this).aLong2649));
			float f_28_ = f / (float) l_27_;
			((Class225) this).aFloat2623
			    = (f_28_ * (float) (l
						- (((Class225) this).aLong2649
						   * 6263173297058700257L))
			       + ((Class225) this).aFloat2650);
			((Class225) this).aFloat2623
			    = Math.max(0.0F,
				       Math.min(1.0F,
						((Class225) this).aFloat2623));
		    }
		}
		method4516(608955725);
		if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		    < (((Class239) Class239.aClass239_2763).anInt2767
		       * -1626286599))
		    method4525((byte) 3);
	    }
	}
    }
    
    void method4530(boolean bool, int i) {
	((Class225) this).aBool2606 = bool;
    }
    
    public void method4531(byte i) {
	synchronized (this) {
	    if (((Class225) this).aBool2655) {
		/* empty */
	    } else if (null == ((Class225) this).anObject2620) {
		/* empty */
	    } else {
		int i_29_ = (((Class225) this).aClass393_2612.method7031
			     (((Class225) this).anObject2620, 1864175957));
		if (i_29_ <= 0) {
		    /* empty */
		} else if (((Class225) this).aClass222Array2618 != null
			   && ((((Class225) this).aClass222Array2618
				[-1917109229 * ((Class225) this).anInt2619])
			       != null)
			   && ((Class225) this).aBool2643) {
		    int i_30_
			= ((i_29_ + ((Class225) this).anInt2637 * 467556125
			    > (421967667
			       * (((Class222) (((Class225) this)
					       .aClass222Array2618
					       [(((Class225) this).anInt2619
						 * -1917109229)]))
				  .aClass241_Sub3_2586.pointer)))
			   ? ((((Class222)
				(((Class225) this).aClass222Array2618
				 [-1917109229 * ((Class225) this).anInt2619]))
			       .aClass241_Sub3_2586.pointer) * 421967667
			      - 467556125 * ((Class225) this).anInt2637)
			   : i_29_);
		    if ((((Class225) this).anInt2637 * 467556125
			 < (-1792227759
			    * (((Class222)
				(((Class225) this).aClass222Array2618
				 [-1917109229 * ((Class225) this).anInt2619]))
			       .anInt2588)))
			&& (i_30_ + 467556125 * ((Class225) this).anInt2637
			    > (-1792227759
			       * ((Class222) (((Class225) this)
					      .aClass222Array2618
					      [(((Class225) this).anInt2619
						* -1917109229)])).anInt2588))
			&& (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2588) * -1792227759 >= 0) {
			((Class225) this).anInt2637
			    += ((((Class222) (((Class225) this)
					      .aClass222Array2618
					      [(((Class225) this).anInt2619
						* -1917109229)])).anInt2588
				 * -454221371)
				- 1 * ((Class225) this).anInt2637);
			i_30_
			    = ((i_29_ + ((Class225) this).anInt2637 * 467556125
				> (((Class222) (((Class225) this)
						.aClass222Array2618
						[(((Class225) this).anInt2619
						  * -1917109229)]))
				   .aClass241_Sub3_2586.pointer) * 421967667)
			       ? ((421967667
				   * (((Class222)
				       (((Class225) this).aClass222Array2618
					[(-1917109229
					  * ((Class225) this).anInt2619)]))
				      .aClass241_Sub3_2586.pointer))
				  - 467556125 * ((Class225) this).anInt2637)
			       : i_29_);
		    }
		    if ((467556125 * ((Class225) this).anInt2637 + i_30_
			 > (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2589) * 297491739)
			&& (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2589) * 297491739 >= 0)
			i_30_ = ((297491739
				  * ((Class222) (((Class225) this)
						 .aClass222Array2618
						 [(((Class225) this).anInt2619
						   * -1917109229)])).anInt2589)
				 - ((Class225) this).anInt2637 * 467556125);
		    method4590((((Class222)
				 (((Class225) this).aClass222Array2618
				  [((Class225) this).anInt2619 * -1917109229]))
				.aClass241_Sub3_2586.payload),
			       ((Class225) this).anInt2637 * 467556125,
			       467556125 * ((Class225) this).anInt2637 + i_30_,
			       (byte) -99);
		    ((Class225) this).aClass393_2612.method7028
			(((Class225) this).anObject2620,
			 (((Class222)
			   (((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]))
			  .aClass241_Sub3_2586.payload),
			 ((Class225) this).anInt2637 * 467556125, i_30_,
			 (byte) -41);
		    ((Class225) this).anInt2637 += i_30_ * 689644341;
		    i_29_ -= i_30_;
		    if ((467556125 * ((Class225) this).anInt2637
			 >= (421967667
			     * (((Class222)
				 (((Class225) this).aClass222Array2618
				  [-1917109229 * ((Class225) this).anInt2619]))
				.aClass241_Sub3_2586.pointer)))
			|| ((((Class225) this).anInt2637 * 467556125
			     >= (297491739
				 * ((Class222) (((Class225) this)
						.aClass222Array2618
						[(((Class225) this).anInt2619
						  * -1917109229)])).anInt2589))
			    && (((Class222)
				 (((Class225) this).aClass222Array2618
				  [-1917109229 * ((Class225) this).anInt2619]))
				.anInt2589) * 297491739 >= 0)) {
			((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]
			    .method4482(-1193901121);
			((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]
			    = null;
			((Class225) this).anInt2619 += 1172172315;
			((Class225) this).anInt2619
			    = (-1917109229 * ((Class225) this).anInt2619
			       % ((Class225) this).aClass222Array2618.length
			       * 1172172315);
			((Class225) this).anInt2637 = 0;
		    }
		}
	    }
	}
    }
    
    void method4532(RSByteBuffer class241_sub3) {
	if (null != ((Class225) this).anObject2636
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 30);
	    byte[] is = new byte[421967667 * class241_sub3.pointer];
	    System.arraycopy(class241_sub3.payload, 0, is, 0,
			     class241_sub3.pointer * 421967667);
	    RSByteBuffer class241_sub3_31_ = new RSByteBuffer(is);
	    class241_sub3_31_.pointer = 1 * class241_sub3.pointer;
	    interface52.method404(class241_sub3_31_, -1929826700);
	}
    }
    
    RSByteBuffer method4533(int i, byte i_32_) {
	return ((Class225) this).anInterface44_2632.method289(i);
    }
    
    void method4534(RSByteBuffer class241_sub3, int i) {
	if (null != ((Class225) this).anObject2636
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 41);
	    byte[] is = new byte[421967667 * class241_sub3.pointer];
	    System.arraycopy(class241_sub3.payload, 0, is, 0,
			     class241_sub3.pointer * 421967667);
	    RSByteBuffer class241_sub3_33_ = new RSByteBuffer(is);
	    class241_sub3_33_.pointer = 1 * class241_sub3.pointer;
	    interface52.method404(class241_sub3_33_, -1961883131);
	}
    }
    
    RSByteBuffer method4535(int i, byte i_34_) {
	if (((Class225) this).anObject2636 != null
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 29);
	    RSByteBuffer class241_sub3
		= interface52.method380(i, (short) -11791);
	    RSByteBuffer class241_sub3_35_
		= new RSByteBuffer(class241_sub3.pointer * 421967667, true);
	    class241_sub3_35_.method14633(class241_sub3, -731833923);
	    return class241_sub3_35_;
	}
	return null;
    }
    
    boolean method4536() {
	return Class239.aClass239_2765 == ((Class225) this).aClass239_2631;
    }
    
    float method4537() {
	return ((Class225) this).aFloat2623;
    }
    
    boolean method4538(byte i) {
	synchronized (this) {
	    if (((Class225) this).anObject2636 != null
		&& ((Class225) this).anObject2636 instanceof Class221) {
		Class221 class221 = (Class221) ((Class225) this).anObject2636;
		Interface52 interface52 = class221.method4418((byte) 120);
		if (null != interface52) {
		    boolean bool = interface52.method385((byte) -70);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    void method4539(byte i) {
	synchronized (this) {
	    if (null != ((Class225) this).anObject2636
		&& ((Class225) this).anObject2636 instanceof Class221) {
		Class221 class221 = (Class221) ((Class225) this).anObject2636;
		Interface52 interface52 = class221.method4418((byte) 64);
		if (interface52 != null)
		    interface52.method384(true, (byte) 36);
	    }
	}
    }
    
    public void method4540() {
	synchronized (this) {
	    if (((Class225) this).aBool2655) {
		/* empty */
	    } else if (null == ((Class225) this).anObject2620) {
		/* empty */
	    } else {
		int i = (((Class225) this).aClass393_2612.method7031
			 (((Class225) this).anObject2620, 1015342370));
		if (i <= 0) {
		    /* empty */
		} else if (((Class225) this).aClass222Array2618 != null
			   && ((((Class225) this).aClass222Array2618
				[-1917109229 * ((Class225) this).anInt2619])
			       != null)
			   && ((Class225) this).aBool2643) {
		    int i_36_
			= ((i + ((Class225) this).anInt2637 * 467556125
			    > (421967667
			       * (((Class222) (((Class225) this)
					       .aClass222Array2618
					       [(((Class225) this).anInt2619
						 * -1917109229)]))
				  .aClass241_Sub3_2586.pointer)))
			   ? ((((Class222)
				(((Class225) this).aClass222Array2618
				 [-1917109229 * ((Class225) this).anInt2619]))
			       .aClass241_Sub3_2586.pointer) * 421967667
			      - 467556125 * ((Class225) this).anInt2637)
			   : i);
		    if ((((Class225) this).anInt2637 * 467556125
			 < (-1792227759
			    * (((Class222)
				(((Class225) this).aClass222Array2618
				 [-1917109229 * ((Class225) this).anInt2619]))
			       .anInt2588)))
			&& (i_36_ + 467556125 * ((Class225) this).anInt2637
			    > (-1792227759
			       * ((Class222) (((Class225) this)
					      .aClass222Array2618
					      [(((Class225) this).anInt2619
						* -1917109229)])).anInt2588))
			&& (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2588) * -1792227759 >= 0) {
			((Class225) this).anInt2637
			    += ((((Class222) (((Class225) this)
					      .aClass222Array2618
					      [(((Class225) this).anInt2619
						* -1917109229)])).anInt2588
				 * -454221371)
				- 1 * ((Class225) this).anInt2637);
			i_36_
			    = ((i + ((Class225) this).anInt2637 * 467556125
				> (((Class222) (((Class225) this)
						.aClass222Array2618
						[(((Class225) this).anInt2619
						  * -1917109229)]))
				   .aClass241_Sub3_2586.pointer) * 421967667)
			       ? ((421967667
				   * (((Class222)
				       (((Class225) this).aClass222Array2618
					[(-1917109229
					  * ((Class225) this).anInt2619)]))
				      .aClass241_Sub3_2586.pointer))
				  - 467556125 * ((Class225) this).anInt2637)
			       : i);
		    }
		    if ((467556125 * ((Class225) this).anInt2637 + i_36_
			 > (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2589) * 297491739)
			&& (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2589) * 297491739 >= 0)
			i_36_ = ((297491739
				  * ((Class222) (((Class225) this)
						 .aClass222Array2618
						 [(((Class225) this).anInt2619
						   * -1917109229)])).anInt2589)
				 - ((Class225) this).anInt2637 * 467556125);
		    method4590((((Class222)
				 (((Class225) this).aClass222Array2618
				  [((Class225) this).anInt2619 * -1917109229]))
				.aClass241_Sub3_2586.payload),
			       ((Class225) this).anInt2637 * 467556125,
			       467556125 * ((Class225) this).anInt2637 + i_36_,
			       (byte) -25);
		    ((Class225) this).aClass393_2612.method7028
			(((Class225) this).anObject2620,
			 (((Class222)
			   (((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]))
			  .aClass241_Sub3_2586.payload),
			 ((Class225) this).anInt2637 * 467556125, i_36_,
			 (byte) -34);
		    ((Class225) this).anInt2637 += i_36_ * 689644341;
		    i -= i_36_;
		    if ((467556125 * ((Class225) this).anInt2637
			 >= (421967667
			     * (((Class222)
				 (((Class225) this).aClass222Array2618
				  [-1917109229 * ((Class225) this).anInt2619]))
				.aClass241_Sub3_2586.pointer)))
			|| ((((Class225) this).anInt2637 * 467556125
			     >= (297491739
				 * ((Class222) (((Class225) this)
						.aClass222Array2618
						[(((Class225) this).anInt2619
						  * -1917109229)])).anInt2589))
			    && (((Class222)
				 (((Class225) this).aClass222Array2618
				  [-1917109229 * ((Class225) this).anInt2619]))
				.anInt2589) * 297491739 >= 0)) {
			((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]
			    .method4482(1279769734);
			((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]
			    = null;
			((Class225) this).anInt2619 += 1172172315;
			((Class225) this).anInt2619
			    = (-1917109229 * ((Class225) this).anInt2619
			       % ((Class225) this).aClass222Array2618.length
			       * 1172172315);
			((Class225) this).anInt2637 = 0;
		    }
		}
	    }
	}
    }
    
    int method4541(byte i) {
	if (null != ((Class225) this).anObject2636
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 67);
	    return interface52.method383((byte) 101);
	}
	return 0;
    }
    
    public Class239 method4542() {
	return ((Class225) this).aClass239_2631;
    }
    
    public Class239 method4543() {
	return ((Class225) this).aClass239_2631;
    }
    
    boolean method4544() {
	return Class239.aClass239_2763 == ((Class225) this).aClass239_2631;
    }
    
    public void method4545() {
	if ((((Class239) method4597(2144422350)).anInt2767 * -1626286599
	     >= ((Class239) Class239.aClass239_2761).anInt2767 * -1626286599)
	    && (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		< -1626286599 * ((Class239) Class239.aClass239_2763).anInt2767)
	    && method4514(2100971216)) {
	    synchronized (this) {
		((Class225) this).anInterface44_2632.method282();
		method4595(1830327069);
	    }
	    Thread.yield();
	}
    }
    
    void method4546() {
	synchronized (this) {
	    method4605(-1992523793);
	}
    }
    
    boolean method4547() {
	return Class239.aClass239_2765 == ((Class225) this).aClass239_2631;
    }
    
    public void method4548() {
	if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
	    >= -1626286599 * ((Class239) Class239.aClass239_2758).anInt2767)
	    throw new RuntimeException("");
	method4504(Class239.aClass239_2758, 2074044226);
    }
    
    void method4549() {
	synchronized (this) {
	    if (null != ((Class225) this).anObject2636
		&& ((Class225) this).anObject2636 instanceof Class221) {
		Class221 class221 = (Class221) ((Class225) this).anObject2636;
		Interface52 interface52 = class221.method4418((byte) 66);
		if (interface52 != null)
		    interface52.method384(true, (byte) 82);
	    }
	}
    }
    
    public void method4550() {
	if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
	    < -1626286599 * ((Class239) Class239.aClass239_2758).anInt2767)
	    throw new RuntimeException("");
	((Class225) this).anObject2636 = null;
	method4504(Class239.aClass239_2766, 1294616434);
    }
    
    void method4551(float f, int i) {
	if (i <= 0) {
	    ((Class225) this).aFloat2623 = f;
	    ((Class225) this).aFloat2647 = ((Class225) this).aFloat2623;
	    ((Class225) this).aLong2649 = 0L;
	    ((Class225) this).aLong2614 = 0L;
	} else {
	    ((Class225) this).aFloat2650 = ((Class225) this).aFloat2623;
	    ((Class225) this).aFloat2647 = f;
	    ((Class225) this).aLong2649
		= Class50.method1249((byte) 1) * 8622777873475053601L;
	    ((Class225) this).aLong2614
		= (((long) i
		    + 6263173297058700257L * ((Class225) this).aLong2649)
		   * 6982268814755693817L);
	}
    }
    
    void method4552(float f, int i) {
	if (i <= 0) {
	    ((Class225) this).aFloat2623 = f;
	    ((Class225) this).aFloat2647 = ((Class225) this).aFloat2623;
	    ((Class225) this).aLong2649 = 0L;
	    ((Class225) this).aLong2614 = 0L;
	} else {
	    ((Class225) this).aFloat2650 = ((Class225) this).aFloat2623;
	    ((Class225) this).aFloat2647 = f;
	    ((Class225) this).aLong2649
		= Class50.method1249((byte) 1) * 8622777873475053601L;
	    ((Class225) this).aLong2614
		= (((long) i
		    + 6263173297058700257L * ((Class225) this).aLong2649)
		   * 6982268814755693817L);
	}
    }
    
    float method4553() {
	return ((Class225) this).aFloat2623;
    }
    
    public boolean method4554() {
	return ((Class225) this).aBool2646;
    }
    
    void method4555() {
	if (method4597(2144422350) != Class239.aClass239_2763
	    && (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		< (-1626286599
		   * ((Class239) Class239.aClass239_2761).anInt2767))) {
	    method4504(Class239.aClass239_2761, 339284635);
	    ((Class225) this).aBool2630 = true;
	    method4525((byte) 3);
	    method4516(1904375405);
	}
    }
    
    void method4556() {
	Class322 class322
	    = (((Class225) this).aClass393_2612.method7032(-942244763)
		   .method5858
	       (((Class225) this).anInt2610 * 1364740965, (byte) 0));
	((Class225) this).aFloat2615
	    = null != class322 ? class322.method5934(-1639623882) : 1.0F;
	float f = null != class322 ? class322.method5935(-857245911) : 0.1F;
	f *= ((Class225) this).aFloat2623;
	float f_37_
	    = ((Class225) this).aFloatArray2609.length > 0 ? 0.0F : 1.0F;
	for (int i = 0; i < ((Class225) this).aFloatArray2609.length; i++) {
	    if (((Class225) this).aFloatArray2609[i] > f_37_)
		f_37_ = ((Class225) this).aFloatArray2609[i];
	}
	f *= f_37_;
	if (!method4514(1785193969))
	    f = -1.0F;
	if (method4517(-322838988) != f) {
	    method4518(f, 439139681);
	    ((Class225) this).aBool2646 = true;
	}
    }
    
    boolean method4557(byte[] is, Interface19 interface19, int i, float f,
		       boolean bool, boolean bool_38_, int i_39_, float f_40_,
		       Object object) {
	synchronized (this) {
	    if (interface19 != null) {
		((Class225) this).aByteArray2653 = null;
		((Class225) this).anInterface19_2627 = interface19;
	    } else
		((Class225) this).aByteArray2653 = is;
	    ((Class225) this).anObject2636 = object;
	    ((Class225) this).anInt2610 = -1122963859 * i;
	    ((Class225) this).aFloat2623 = f;
	    ((Class225) this).aBool2644 = bool_38_;
	    ((Class225) this).anInt2611 = i_39_ * -807983855;
	    ((Class225) this).aFloat2641 = f_40_;
	    byte[] is_41_ = null;
	    if (null != ((Class225) this).aByteArray2653)
		is_41_ = ((Class225) this).aByteArray2653;
	    else if (null != ((Class225) this).anInterface19_2627) {
		((Class225) this).anInt2608 = 0;
		is_41_
		    = (((Class225) this).anInterface19_2627.method121
		       (1124524057 * ((Class225) this).anInt2608, (byte) 76));
	    }
	    if (null != is_41_) {
		RSByteBuffer class241_sub3 = new RSByteBuffer(is_41_);
		if (class241_sub3.readUnsignedByte((byte) -39) != 74
		    || class241_sub3.readUnsignedByte((byte) -108) != 65
		    || class241_sub3.readUnsignedByte((byte) -17) != 71
		    || class241_sub3.readUnsignedByte((byte) 2) != 65)
		    throw new RuntimeException("");
		((Class225) this).anInt2621
		    = class241_sub3.readInt((byte) 42) * 1557840843;
		((Class225) this).anInt2622
		    = class241_sub3.readInt((byte) 53) * -1936663153;
		((Class225) this).anInt2624
		    = class241_sub3.readInt((byte) 93) * -101280915;
		((Class225) this).anInt2605
		    = class241_sub3.readInt((byte) 57) * 299149953;
		((Class225) this).anInt2625
		    = class241_sub3.readInt((byte) 95) * -1141168747;
		if (((Class225) this).anObject2620 == null) {
		    ((Class225) this).anObject2620
			= (((Class225) this).aClass393_2612.method7026
			   (-1776708223 * ((Class225) this).anInt2605,
			    ((Class225) this).anInt2624 * 1568370277,
			    ((Class225) this).anInterface44_2632.method319(),
			    ((Class225) this).anInterface44_2632.method295(),
			    ((Class225) this).anInt2617 * 487924981,
			    ((Class225) this).aFloat2641, (byte) 43));
		    if (((Class225) this).anObject2620 == null) {
			method4504(Class239.aClass239_2765, 1696551150);
			boolean bool_42_ = false;
			return bool_42_;
		    }
		}
		((Class225) this).anIntArray2626
		    = new int[((Class225) this).anInt2625 * 929955261];
		((Class225) this).anIntArray2642
		    = new int[929955261 * ((Class225) this).anInt2625];
		((Class225) this).anIntArray2628
		    = new int[929955261 * ((Class225) this).anInt2625];
		int i_43_ = (class241_sub3.pointer * 421967667
			     + -1150292504 * ((Class225) this).anInt2625);
		for (int i_44_ = 0;
		     i_44_ < 929955261 * ((Class225) this).anInt2625;
		     i_44_++) {
		    ((Class225) this).anIntArray2626[i_44_] = i_43_;
		    ((Class225) this).anIntArray2642[i_44_]
			= class241_sub3.readInt((byte) 49);
		    ((Class225) this).anIntArray2628[i_44_]
			= class241_sub3.readInt((byte) 47);
		    i_43_ += ((Class225) this).anIntArray2642[i_44_];
		}
		((Class225) this).anInt2629
		    = -1165118681 * class241_sub3.pointer;
		((Class225) this).aClass222Array2618
		    = new Class222[((Class225) this).anInt2607 * 1240271169];
		((Class225) this).aFloatArray2609 = new float[2];
		for (int i_45_ = 0;
		     i_45_ < ((Class225) this).aFloatArray2609.length; i_45_++)
		    ((Class225) this).aFloatArray2609[i_45_] = 1.0F;
		if (((Class225) this).anObject2636 instanceof Class221) {
		    Interface52 interface52
			= ((Class221) ((Class225) this).anObject2636)
			      .method4418((byte) 48);
		    ((Class225) this).aBool2652
			= interface52.method381(-430963924);
		    ((Class225) this).aBool2640 = !((Class225) this).aBool2652;
		}
		((Class225) this).anInterface44_2632.method283
		    (((Class225) this).aBool2640,
		     (((Class225) this).aBool2644
		      ? 1786276849 * ((Class225) this).anInt2611 : 0),
		     ((Class225) this).anInt2621 * 1302252003,
		     1444389231 * ((Class225) this).anInt2622);
		if (null != ((Class225) this).anInterface19_2627) {
		    int i_46_ = (class241_sub3.payload.length
				 - ((Class225) this).anInt2629 * 425718549);
		    byte[] is_47_ = Class428.method7603(i_46_, true, (byte) 0);
		    System.arraycopy(class241_sub3.payload,
				     ((Class225) this).anInt2629 * 425718549,
				     is_47_, 0, i_46_);
		    class241_sub3.payload = is_47_;
		    class241_sub3.pointer = -681042949 * i_46_;
		    ((Class225) this).anInterface44_2632
			.method306(class241_sub3);
		    ((Class225) this).anInt2608 += -311788503;
		} else
		    ((Class225) this).aBool2606 = true;
		boolean bool_48_ = true;
		return bool_48_;
	    }
	    boolean bool_49_ = null != is_41_;
	    return bool_49_;
	}
    }
    
    boolean method4558(byte[] is, Interface19 interface19, int i, float f,
		       boolean bool, boolean bool_50_, int i_51_, float f_52_,
		       Object object) {
	synchronized (this) {
	    if (interface19 != null) {
		((Class225) this).aByteArray2653 = null;
		((Class225) this).anInterface19_2627 = interface19;
	    } else
		((Class225) this).aByteArray2653 = is;
	    ((Class225) this).anObject2636 = object;
	    ((Class225) this).anInt2610 = -1122963859 * i;
	    ((Class225) this).aFloat2623 = f;
	    ((Class225) this).aBool2644 = bool_50_;
	    ((Class225) this).anInt2611 = i_51_ * -807983855;
	    ((Class225) this).aFloat2641 = f_52_;
	    byte[] is_53_ = null;
	    if (null != ((Class225) this).aByteArray2653)
		is_53_ = ((Class225) this).aByteArray2653;
	    else if (null != ((Class225) this).anInterface19_2627) {
		((Class225) this).anInt2608 = 0;
		is_53_
		    = (((Class225) this).anInterface19_2627.method121
		       (1124524057 * ((Class225) this).anInt2608, (byte) 93));
	    }
	    if (null != is_53_) {
		RSByteBuffer class241_sub3 = new RSByteBuffer(is_53_);
		if (class241_sub3.readUnsignedByte((byte) -45) != 74
		    || class241_sub3.readUnsignedByte((byte) 77) != 65
		    || class241_sub3.readUnsignedByte((byte) -46) != 71
		    || class241_sub3.readUnsignedByte((byte) -35) != 65)
		    throw new RuntimeException("");
		((Class225) this).anInt2621
		    = class241_sub3.readInt((byte) 38) * 1557840843;
		((Class225) this).anInt2622
		    = class241_sub3.readInt((byte) 22) * -1936663153;
		((Class225) this).anInt2624
		    = class241_sub3.readInt((byte) 54) * -101280915;
		((Class225) this).anInt2605
		    = class241_sub3.readInt((byte) 29) * 299149953;
		((Class225) this).anInt2625
		    = class241_sub3.readInt((byte) 72) * -1141168747;
		if (((Class225) this).anObject2620 == null) {
		    ((Class225) this).anObject2620
			= (((Class225) this).aClass393_2612.method7026
			   (-1776708223 * ((Class225) this).anInt2605,
			    ((Class225) this).anInt2624 * 1568370277,
			    ((Class225) this).anInterface44_2632.method319(),
			    ((Class225) this).anInterface44_2632.method295(),
			    ((Class225) this).anInt2617 * 487924981,
			    ((Class225) this).aFloat2641, (byte) 63));
		    if (((Class225) this).anObject2620 == null) {
			method4504(Class239.aClass239_2765, 1405486238);
			boolean bool_54_ = false;
			return bool_54_;
		    }
		}
		((Class225) this).anIntArray2626
		    = new int[((Class225) this).anInt2625 * 929955261];
		((Class225) this).anIntArray2642
		    = new int[929955261 * ((Class225) this).anInt2625];
		((Class225) this).anIntArray2628
		    = new int[929955261 * ((Class225) this).anInt2625];
		int i_55_ = (class241_sub3.pointer * 421967667
			     + -1150292504 * ((Class225) this).anInt2625);
		for (int i_56_ = 0;
		     i_56_ < 929955261 * ((Class225) this).anInt2625;
		     i_56_++) {
		    ((Class225) this).anIntArray2626[i_56_] = i_55_;
		    ((Class225) this).anIntArray2642[i_56_]
			= class241_sub3.readInt((byte) 34);
		    ((Class225) this).anIntArray2628[i_56_]
			= class241_sub3.readInt((byte) 59);
		    i_55_ += ((Class225) this).anIntArray2642[i_56_];
		}
		((Class225) this).anInt2629
		    = -1165118681 * class241_sub3.pointer;
		((Class225) this).aClass222Array2618
		    = new Class222[((Class225) this).anInt2607 * 1240271169];
		((Class225) this).aFloatArray2609 = new float[2];
		for (int i_57_ = 0;
		     i_57_ < ((Class225) this).aFloatArray2609.length; i_57_++)
		    ((Class225) this).aFloatArray2609[i_57_] = 1.0F;
		if (((Class225) this).anObject2636 instanceof Class221) {
		    Interface52 interface52
			= ((Class221) ((Class225) this).anObject2636)
			      .method4418((byte) 107);
		    ((Class225) this).aBool2652
			= interface52.method381(-781657955);
		    ((Class225) this).aBool2640 = !((Class225) this).aBool2652;
		}
		((Class225) this).anInterface44_2632.method283
		    (((Class225) this).aBool2640,
		     (((Class225) this).aBool2644
		      ? 1786276849 * ((Class225) this).anInt2611 : 0),
		     ((Class225) this).anInt2621 * 1302252003,
		     1444389231 * ((Class225) this).anInt2622);
		if (null != ((Class225) this).anInterface19_2627) {
		    int i_58_ = (class241_sub3.payload.length
				 - ((Class225) this).anInt2629 * 425718549);
		    byte[] is_59_ = Class428.method7603(i_58_, true, (byte) 0);
		    System.arraycopy(class241_sub3.payload,
				     ((Class225) this).anInt2629 * 425718549,
				     is_59_, 0, i_58_);
		    class241_sub3.payload = is_59_;
		    class241_sub3.pointer = -681042949 * i_58_;
		    ((Class225) this).anInterface44_2632
			.method306(class241_sub3);
		    ((Class225) this).anInt2608 += -311788503;
		} else
		    ((Class225) this).aBool2606 = true;
		boolean bool_60_ = true;
		return bool_60_;
	    }
	    boolean bool_61_ = null != is_53_;
	    return bool_61_;
	}
    }
    
    void method4559() {
	if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
	    >= -1626286599 * ((Class239) Class239.aClass239_2761).anInt2767) {
	    if (method4597(2144422350) == Class239.aClass239_2766)
		method4523((byte) -81);
	    else {
		method4614(1461796110);
		if (((Class225) this).aFloat2647
		    != ((Class225) this).aFloat2623) {
		    long l = Class50.method1249((byte) 1);
		    if (l
			> -8873193387529044663L * ((Class225) this).aLong2614)
			((Class225) this).aFloat2623
			    = ((Class225) this).aFloat2647;
		    else {
			float f = (((Class225) this).aFloat2647
				   - ((Class225) this).aFloat2650);
			long l_62_ = ((-8873193387529044663L
				       * ((Class225) this).aLong2614)
				      - (6263173297058700257L
					 * ((Class225) this).aLong2649));
			float f_63_ = f / (float) l_62_;
			((Class225) this).aFloat2623
			    = (f_63_ * (float) (l
						- (((Class225) this).aLong2649
						   * 6263173297058700257L))
			       + ((Class225) this).aFloat2650);
			((Class225) this).aFloat2623
			    = Math.max(0.0F,
				       Math.min(1.0F,
						((Class225) this).aFloat2623));
		    }
		}
		method4516(1630190057);
		if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		    < (((Class239) Class239.aClass239_2763).anInt2767
		       * -1626286599))
		    method4525((byte) 3);
	    }
	}
    }
    
    public void method4560() {
	synchronized (this) {
	    if (method4597(2144422350) == Class239.aClass239_2763
		|| (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		    < (((Class239) Class239.aClass239_2758).anInt2767
		       * -1626286599))) {
		/* empty */
	    } else
		method4504(Class239.aClass239_2763, 671534448);
	}
    }
    
    public void method4561() {
	synchronized (this) {
	    if (method4597(2144422350) == Class239.aClass239_2763
		|| (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		    < (((Class239) Class239.aClass239_2758).anInt2767
		       * -1626286599))) {
		/* empty */
	    } else
		method4504(Class239.aClass239_2763, -296342017);
	}
    }
    
    void method4562(Interface20 interface20) {
	((Class225) this).anInterface20_2648 = interface20;
	if (((Class225) this).anInterface20_2648 != null)
	    ((Class225) this).anInterface20_2648.method123((((Class225) this)
							    .anObject2636),
							   (((Class225) this)
							    .aFloatArray2609),
							   null, -1760217813);
    }
    
    boolean method4563() {
	if (((Class225) this).aFloatArray2609 == null)
	    return false;
	float f = 0.0F;
	float f_64_ = 0.0F;
	for (int i = 0; i < ((Class225) this).aFloatArray2609.length; i++) {
	    float f_65_ = ((Class225) this).aFloatArray2609[i];
	    if (f_65_ * ((Class225) this).aFloat2623 > f)
		f = f_65_;
	    if (f_65_ > f_64_)
		f_64_ = f_65_;
	}
	if (f < 1.0E-5F) {
	    if (f_64_ >= 1.0E-5F && ((Class225) this).aFloat2647 >= 1.0E-5F)
		return true;
	    return false;
	}
	return true;
    }
    
    void method4564() {
	if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
	    >= -1626286599 * ((Class239) Class239.aClass239_2761).anInt2767) {
	    if (method4597(2144422350) == Class239.aClass239_2766)
		method4523((byte) -37);
	    else {
		method4614(1980624672);
		if (((Class225) this).aFloat2647
		    != ((Class225) this).aFloat2623) {
		    long l = Class50.method1249((byte) 1);
		    if (l
			> -8873193387529044663L * ((Class225) this).aLong2614)
			((Class225) this).aFloat2623
			    = ((Class225) this).aFloat2647;
		    else {
			float f = (((Class225) this).aFloat2647
				   - ((Class225) this).aFloat2650);
			long l_66_ = ((-8873193387529044663L
				       * ((Class225) this).aLong2614)
				      - (6263173297058700257L
					 * ((Class225) this).aLong2649));
			float f_67_ = f / (float) l_66_;
			((Class225) this).aFloat2623
			    = (f_67_ * (float) (l
						- (((Class225) this).aLong2649
						   * 6263173297058700257L))
			       + ((Class225) this).aFloat2650);
			((Class225) this).aFloat2623
			    = Math.max(0.0F,
				       Math.min(1.0F,
						((Class225) this).aFloat2623));
		    }
		}
		method4516(702482027);
		if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		    < (((Class239) Class239.aClass239_2763).anInt2767
		       * -1626286599))
		    method4525((byte) 3);
	    }
	}
    }
    
    void method4565(float f, int i, int i_68_) {
	if (i <= 0) {
	    ((Class225) this).aFloat2623 = f;
	    ((Class225) this).aFloat2647 = ((Class225) this).aFloat2623;
	    ((Class225) this).aLong2649 = 0L;
	    ((Class225) this).aLong2614 = 0L;
	} else {
	    ((Class225) this).aFloat2650 = ((Class225) this).aFloat2623;
	    ((Class225) this).aFloat2647 = f;
	    ((Class225) this).aLong2649
		= Class50.method1249((byte) 1) * 8622777873475053601L;
	    ((Class225) this).aLong2614
		= (((long) i
		    + 6263173297058700257L * ((Class225) this).aLong2649)
		   * 6982268814755693817L);
	}
    }
    
    void method4566() {
	Class322 class322
	    = (((Class225) this).aClass393_2612.method7032(2050413907)
		   .method5858
	       (((Class225) this).anInt2610 * 1364740965, (byte) 0));
	((Class225) this).aFloat2615
	    = null != class322 ? class322.method5934(-1756013103) : 1.0F;
	float f = null != class322 ? class322.method5935(-857245911) : 0.1F;
	f *= ((Class225) this).aFloat2623;
	float f_69_
	    = ((Class225) this).aFloatArray2609.length > 0 ? 0.0F : 1.0F;
	for (int i = 0; i < ((Class225) this).aFloatArray2609.length; i++) {
	    if (((Class225) this).aFloatArray2609[i] > f_69_)
		f_69_ = ((Class225) this).aFloatArray2609[i];
	}
	f *= f_69_;
	if (!method4514(2037213489))
	    f = -1.0F;
	if (method4517(-702479389) != f) {
	    method4518(f, 439139681);
	    ((Class225) this).aBool2646 = true;
	}
    }
    
    public float method4567() {
	return ((Class225) this).aFloat2635;
    }
    
    public void method4568() {
	synchronized (this) {
	    if (((Class225) this).aBool2655) {
		/* empty */
	    } else if (null == ((Class225) this).anObject2620) {
		/* empty */
	    } else {
		int i = (((Class225) this).aClass393_2612.method7031
			 (((Class225) this).anObject2620, 289343541));
		if (i <= 0) {
		    /* empty */
		} else if (((Class225) this).aClass222Array2618 != null
			   && ((((Class225) this).aClass222Array2618
				[-1917109229 * ((Class225) this).anInt2619])
			       != null)
			   && ((Class225) this).aBool2643) {
		    int i_70_
			= ((i + ((Class225) this).anInt2637 * 467556125
			    > (421967667
			       * (((Class222) (((Class225) this)
					       .aClass222Array2618
					       [(((Class225) this).anInt2619
						 * -1917109229)]))
				  .aClass241_Sub3_2586.pointer)))
			   ? ((((Class222)
				(((Class225) this).aClass222Array2618
				 [-1917109229 * ((Class225) this).anInt2619]))
			       .aClass241_Sub3_2586.pointer) * 421967667
			      - 467556125 * ((Class225) this).anInt2637)
			   : i);
		    if ((((Class225) this).anInt2637 * 467556125
			 < (-1792227759
			    * (((Class222)
				(((Class225) this).aClass222Array2618
				 [-1917109229 * ((Class225) this).anInt2619]))
			       .anInt2588)))
			&& (i_70_ + 467556125 * ((Class225) this).anInt2637
			    > (-1792227759
			       * ((Class222) (((Class225) this)
					      .aClass222Array2618
					      [(((Class225) this).anInt2619
						* -1917109229)])).anInt2588))
			&& (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2588) * -1792227759 >= 0) {
			((Class225) this).anInt2637
			    += ((((Class222) (((Class225) this)
					      .aClass222Array2618
					      [(((Class225) this).anInt2619
						* -1917109229)])).anInt2588
				 * -454221371)
				- 1 * ((Class225) this).anInt2637);
			i_70_
			    = ((i + ((Class225) this).anInt2637 * 467556125
				> (((Class222) (((Class225) this)
						.aClass222Array2618
						[(((Class225) this).anInt2619
						  * -1917109229)]))
				   .aClass241_Sub3_2586.pointer) * 421967667)
			       ? ((421967667
				   * (((Class222)
				       (((Class225) this).aClass222Array2618
					[(-1917109229
					  * ((Class225) this).anInt2619)]))
				      .aClass241_Sub3_2586.pointer))
				  - 467556125 * ((Class225) this).anInt2637)
			       : i);
		    }
		    if ((467556125 * ((Class225) this).anInt2637 + i_70_
			 > (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2589) * 297491739)
			&& (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2589) * 297491739 >= 0)
			i_70_ = ((297491739
				  * ((Class222) (((Class225) this)
						 .aClass222Array2618
						 [(((Class225) this).anInt2619
						   * -1917109229)])).anInt2589)
				 - ((Class225) this).anInt2637 * 467556125);
		    method4590((((Class222)
				 (((Class225) this).aClass222Array2618
				  [((Class225) this).anInt2619 * -1917109229]))
				.aClass241_Sub3_2586.payload),
			       ((Class225) this).anInt2637 * 467556125,
			       467556125 * ((Class225) this).anInt2637 + i_70_,
			       (byte) -3);
		    ((Class225) this).aClass393_2612.method7028
			(((Class225) this).anObject2620,
			 (((Class222)
			   (((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]))
			  .aClass241_Sub3_2586.payload),
			 ((Class225) this).anInt2637 * 467556125, i_70_,
			 (byte) -21);
		    ((Class225) this).anInt2637 += i_70_ * 689644341;
		    i -= i_70_;
		    if ((467556125 * ((Class225) this).anInt2637
			 >= (421967667
			     * (((Class222)
				 (((Class225) this).aClass222Array2618
				  [-1917109229 * ((Class225) this).anInt2619]))
				.aClass241_Sub3_2586.pointer)))
			|| ((((Class225) this).anInt2637 * 467556125
			     >= (297491739
				 * ((Class222) (((Class225) this)
						.aClass222Array2618
						[(((Class225) this).anInt2619
						  * -1917109229)])).anInt2589))
			    && (((Class222)
				 (((Class225) this).aClass222Array2618
				  [-1917109229 * ((Class225) this).anInt2619]))
				.anInt2589) * 297491739 >= 0)) {
			((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]
			    .method4482(1081213362);
			((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]
			    = null;
			((Class225) this).anInt2619 += 1172172315;
			((Class225) this).anInt2619
			    = (-1917109229 * ((Class225) this).anInt2619
			       % ((Class225) this).aClass222Array2618.length
			       * 1172172315);
			((Class225) this).anInt2637 = 0;
		    }
		}
	    }
	}
    }
    
    public float method4569() {
	return ((Class225) this).aFloat2635;
    }
    
    void method4570(float f) {
	synchronized (this) {
	    ((Class225) this).aFloat2635 = f;
	}
    }
    
    void method4571(Interface20 interface20, int i) {
	((Class225) this).anInterface20_2648 = interface20;
	if (((Class225) this).anInterface20_2648 != null)
	    ((Class225) this).anInterface20_2648.method123((((Class225) this)
							    .anObject2636),
							   (((Class225) this)
							    .aFloatArray2609),
							   null, -1760217813);
    }
    
    void method4572(float f) {
	synchronized (this) {
	    ((Class225) this).aFloat2635 = f;
	}
    }
    
    void method4573(int i) {
	synchronized (this) {
	    ((Class225) this).aByteArray2653 = null;
	    ((Class225) this).anInt2610 = 0;
	    ((Class225) this).aFloat2623 = 0.0F;
	    ((Class225) this).aFloat2615 = 0.0F;
	    ((Class225) this).aBool2644 = false;
	    ((Class225) this).anInt2611 = 0;
	    ((Class225) this).aFloat2641 = 1.0F;
	    ((Class225) this).anInterface19_2627 = null;
	    ((Class225) this).anInt2608 = 0;
	    ((Class225) this).anInt2616 = 0;
	    if (null != ((Class225) this).aClass222Array2618) {
		for (int i_71_ = 0;
		     i_71_ < ((Class225) this).aClass222Array2618.length;
		     i_71_++) {
		    if (((Class225) this).aClass222Array2618[i_71_] != null)
			((Class225) this).aClass222Array2618[i_71_]
			    .method4482(431997931);
		}
	    }
	    ((Class225) this).aClass222Array2618 = null;
	    ((Class225) this).aBool2652 = false;
	    ((Class225) this).anInt2619 = 0;
	    ((Class225) this).anInt2621 = 0;
	    ((Class225) this).anInt2622 = 0;
	    ((Class225) this).anInt2605 = 0;
	    ((Class225) this).anInt2624 = 0;
	    ((Class225) this).anInt2625 = 0;
	    ((Class225) this).anIntArray2626 = null;
	    ((Class225) this).anIntArray2642 = null;
	    ((Class225) this).anIntArray2628 = null;
	    ((Class225) this).anInt2629 = 0;
	    ((Class225) this).aBool2630 = false;
	    ((Class225) this).anInterface44_2632.method190();
	    ((Class225) this).aBool2606 = false;
	    ((Class225) this).anInterface20_2648 = null;
	    ((Class225) this).anObject2636 = null;
	    ((Class225) this).anInt2637 = 0;
	    ((Class225) this).anInt2638 = 0;
	    ((Class225) this).anInt2639 = 0;
	    ((Class225) this).aBool2645 = false;
	    ((Class225) this).anInt2613 = 0;
	    ((Class225) this).anInt2633 = 0;
	    ((Class225) this).aBool2643 = false;
	    ((Class225) this).anInt2634 = 0;
	    method4518(-1.0F, 439139681);
	    ((Class225) this).aBool2646 = false;
	    ((Class225) this).aFloat2647 = 0.0F;
	    ((Class225) this).aLong2614 = 0L;
	    ((Class225) this).aLong2649 = 0L;
	    ((Class225) this).aFloat2650 = 0.0F;
	    ((Class225) this).anInt2651 = 0;
	    ((Class225) this).anInt2654 = 0;
	}
    }
    
    public boolean method4574() {
	return ((Class225) this).aBool2646;
    }
    
    public boolean method4575() {
	return ((Class225) this).aBool2646;
    }
    
    float method4576() {
	return ((Class225) this).aFloat2623;
    }
    
    int method4577() {
	if (null != ((Class225) this).anObject2636
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 80);
	    return interface52.method383((byte) -49);
	}
	return 0;
    }
    
    void method4578() {
	if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
	    >= -1626286599 * ((Class239) Class239.aClass239_2761).anInt2767) {
	    if (method4597(2144422350) == Class239.aClass239_2766)
		method4523((byte) 21);
	    else {
		method4614(1381873366);
		if (((Class225) this).aFloat2647
		    != ((Class225) this).aFloat2623) {
		    long l = Class50.method1249((byte) 1);
		    if (l
			> -8873193387529044663L * ((Class225) this).aLong2614)
			((Class225) this).aFloat2623
			    = ((Class225) this).aFloat2647;
		    else {
			float f = (((Class225) this).aFloat2647
				   - ((Class225) this).aFloat2650);
			long l_72_ = ((-8873193387529044663L
				       * ((Class225) this).aLong2614)
				      - (6263173297058700257L
					 * ((Class225) this).aLong2649));
			float f_73_ = f / (float) l_72_;
			((Class225) this).aFloat2623
			    = (f_73_ * (float) (l
						- (((Class225) this).aLong2649
						   * 6263173297058700257L))
			       + ((Class225) this).aFloat2650);
			((Class225) this).aFloat2623
			    = Math.max(0.0F,
				       Math.min(1.0F,
						((Class225) this).aFloat2623));
		    }
		}
		method4516(2138863152);
		if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		    < (((Class239) Class239.aClass239_2763).anInt2767
		       * -1626286599))
		    method4525((byte) 3);
	    }
	}
    }
    
    void method4579(float f) {
	synchronized (this) {
	    ((Class225) this).aFloat2635 = f;
	}
    }
    
    public float method4580() {
	return ((Class225) this).aFloat2635;
    }
    
    void method4581() {
	if (true == ((Class225) this).aBool2630
	    && (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		>= (-1626286599
		    * ((Class239) Class239.aClass239_2761).anInt2767))
	    && (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		< -1626286599 * ((Class239) Class239.aClass239_2765).anInt2767)
	    && ((Class225) this).anInterface20_2648 != null
	    && ((Class225) this).aFloat2647 == ((Class225) this).aFloat2623)
	    ((Class225) this).anInterface20_2648.method123((((Class225) this)
							    .anObject2636),
							   (((Class225) this)
							    .aFloatArray2609),
							   null, -1760217813);
    }
    
    void method4582() {
	Class322 class322
	    = (((Class225) this).aClass393_2612.method7032(984643957)
		   .method5858
	       (((Class225) this).anInt2610 * 1364740965, (byte) 0));
	((Class225) this).aFloat2615
	    = null != class322 ? class322.method5934(-734155557) : 1.0F;
	float f = null != class322 ? class322.method5935(-857245911) : 0.1F;
	f *= ((Class225) this).aFloat2623;
	float f_74_
	    = ((Class225) this).aFloatArray2609.length > 0 ? 0.0F : 1.0F;
	for (int i = 0; i < ((Class225) this).aFloatArray2609.length; i++) {
	    if (((Class225) this).aFloatArray2609[i] > f_74_)
		f_74_ = ((Class225) this).aFloatArray2609[i];
	}
	f *= f_74_;
	if (!method4514(2136552247))
	    f = -1.0F;
	if (method4517(2056763685) != f) {
	    method4518(f, 439139681);
	    ((Class225) this).aBool2646 = true;
	}
    }
    
    void method4583() {
	if (true == ((Class225) this).aBool2630
	    && (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		>= (-1626286599
		    * ((Class239) Class239.aClass239_2761).anInt2767))
	    && (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		< -1626286599 * ((Class239) Class239.aClass239_2765).anInt2767)
	    && ((Class225) this).anInterface20_2648 != null
	    && ((Class225) this).aFloat2647 == ((Class225) this).aFloat2623)
	    ((Class225) this).anInterface20_2648.method123((((Class225) this)
							    .anObject2636),
							   (((Class225) this)
							    .aFloatArray2609),
							   null, -1760217813);
    }
    
    void method4584() {
	((Class225) this).aBool2655 = true;
    }
    
    void method4585() {
	((Class225) this).aBool2655 = true;
    }
    
    void method4586() {
	((Class225) this).aBool2655 = true;
    }
    
    void method4587() {
	((Class225) this).aBool2655 = false;
    }
    
    boolean method4588(byte i) {
	return Class239.aClass239_2765 == ((Class225) this).aClass239_2631;
    }
    
    void method4589() {
	((Class225) this).aBool2655 = false;
    }
    
    void method4590(byte[] is, int i, int i_75_, byte i_76_) {
	int i_77_ = i;
	int i_78_ = 0;
	int i_79_ = (((Class225) this).anInterface44_2632.method319().anInt4875
		     * -32980023);
	while (i_77_ < is.length && i_77_ < i_75_) {
	    float f = (((Class225) this).aFloatArray2609[i_78_]
		       * (((Class225) this).aFloat2615
			  * ((Class225) this).aFloat2623));
	    if (i_79_ == 16) {
		int i_80_ = (is[1 + i_77_] << 8) + (is[i_77_] & 0xff);
		i_80_ *= f * f;
		is[i_77_++] = (byte) i_80_;
		is[i_77_++] = (byte) (i_80_ >> 8);
	    } else if (8 == i_79_) {
		byte i_81_ = is[i_77_];
		i_81_ *= f;
		is[i_77_++] = i_81_;
	    } else
		throw new RuntimeException("");
	    i_78_ = ++i_78_ % ((Class225) this).aFloatArray2609.length;
	}
    }
    
    void method4591() {
	if (((Class225) this).aClass222Array2618 != null) {
	    boolean bool = true;
	    Class303 class303
		= ((Class225) this).anInterface44_2632.method317();
	    if (((Class225) this).anInterface44_2632.method154()) {
		if (((Class225) this).aBool2652
		    && method4506(((Class225) this).anInt2651 * 186065047,
				  (short) 3553)) {
		    if ((((Class225) this).aClass222Array2618
			 [-855757145 * ((Class225) this).anInt2633])
			== null) {
			RSByteBuffer class241_sub3
			    = method4535((186065047
					  * ((Class225) this).anInt2651),
					 (byte) -28);
			if (null != class241_sub3) {
			    ((Class225) this).aClass222Array2618
				[-855757145 * ((Class225) this).anInt2633]
				= new Class222(this, class241_sub3, false);
			    int i = ((Class225) this).anInterface44_2632
					.method223();
			    int i_82_
				= (((Class225) this).anInterface44_2632
				       .method200
				   (421967667
				    * (((Class222)
					(((Class225) this).aClass222Array2618
					 [(((Class225) this).anInt2633
					   * -855757145)]))
				       .aClass241_Sub3_2586.pointer)
				    / i));
			    ((Class225) this).anInt2638 += 501300449 * i_82_;
			    if (!((Class225) this).aBool2640
				&& ((Class225) this).aBool2644
				&& (((Class225) this).anInt2654 * 1721371295
				    > 0)) {
				if (-1041430751 * ((Class225) this).anInt2638
				    < 1302252003 * ((Class225) this).anInt2621)
				    ((Class225) this).aClass222Array2618
					[(((Class225) this).anInt2633
					  * -855757145)]
					= null;
				else if (((-1041430751
					   * ((Class225) this).anInt2638)
					  >= (1302252003
					      * ((Class225) this).anInt2621))
					 && (-1041430751 * (((Class225) this)
							    .anInt2638) - i_82_
					     < 1302252003 * (((Class225) this)
							     .anInt2621)))
				    ((Class222) (((Class225) this)
						 .aClass222Array2618
						 [(((Class225) this).anInt2633
						   * -855757145)])).anInt2588
					= ((((Class225) this)
						.anInterface44_2632.method287
					    (i
					     * ((-1041430751
						 * ((Class225) this).anInt2638)
						- (((Class225) this).anInt2621
						   * 1302252003))))
					   * 1170883249);
			    }
			    ((Class225) this).anInt2651 += -1024565465;
			    if (false == ((Class225) this).aBool2640
				&& ((Class225) this).aBool2644
				&& (-1041430751 * ((Class225) this).anInt2638
				    >= (((Class225) this).anInt2622
					* 1444389231))
				&& ((((Class225) this).anInt2654 * 1721371295
				     < (1786276849
					* ((Class225) this).anInt2611))
				    || (1786276849
					* ((Class225) this).anInt2611) < 0)) {
				int i_83_ = ((((Class225) this).anInt2638
					      * -1041430751)
					     - 1444389231 * (((Class225) this)
							     .anInt2622));
				int i_84_ = i_82_ - i_83_;
				((Class222) (((Class225) this)
					     .aClass222Array2618
					     [(((Class225) this).anInt2633
					       * -855757145)])).anInt2589
				    = ((Class225) this).anInterface44_2632
					  .method287(i * i_84_) * 453817619;
				((Class225) this).anInt2651 = 0;
				((Class225) this).anInt2638 = 0;
				((Class225) this).anInt2654 += 334401887;
			    }
			    if (null != (((Class225) this).aClass222Array2618
					 [(-855757145
					   * ((Class225) this).anInt2633)])) {
				((Class225) this).anInt2633 += 1803065623;
				((Class225) this).anInt2633
				    = (1803065623
				       * (-855757145
					  * ((Class225) this).anInt2633
					  % (((Class225) this)
					     .aClass222Array2618).length));
			    }
			}
		    }
		} else if (!method4538((byte) 95)
			   || !((Class225) this).aBool2652) {
		    int i = ((Class225) this).anInterface44_2632.method9();
		    int i_85_ = (((Class225) this).anInterface44_2632.method200
				 (((Class225) this).anInt2617 * 487924981));
		    if (false == ((Class225) this).aBool2645
			&& (null
			    == (((Class225) this).aClass222Array2618
				[((Class225) this).anInt2633 * -855757145]))) {
			if (Class303.aClass303_4793 != class303 && i > 0) {
			    RSByteBuffer class241_sub3
				= method4533(i_85_, (byte) 121);
			    ((Class225) this).aClass222Array2618
				[((Class225) this).anInt2633 * -855757145]
				= (class241_sub3 != null
				   ? new Class222(this, class241_sub3, false)
				   : null);
			    int i_86_
				= (null != (((Class225) this)
					    .aClass222Array2618
					    [(-855757145
					      * ((Class225) this).anInt2633)])
				   ? ((((Class222)
					(((Class225) this).aClass222Array2618
					 [(-855757145
					   * ((Class225) this).anInt2633)]))
				       .aClass241_Sub3_2586.pointer)
				      * 421967667)
				   : 0);
			    int i_87_ = ((Class225) this)
					    .anInterface44_2632.method223();
			    int i_88_ = ((Class225) this)
					    .anInterface44_2632
					    .method200(i_86_ / i_87_);
			    ((Class225) this).anInt2639 += i_88_ * 147521595;
			    if (-1064838925 * ((Class225) this).anInt2639
				> ((Class225) this).anInt2638 * -1041430751) {
				((Class225) this).anInt2638
				    += 501300449 * i_88_;
				i -= i_88_;
				if (false == ((Class225) this).aBool2640
				    && ((Class225) this).aBool2644
				    && (1721371295
					* ((Class225) this).anInt2654) > 0) {
				    if ((-1041430751
					 * ((Class225) this).anInt2638)
					< (1302252003
					   * ((Class225) this).anInt2621))
					((Class225) this)
					    .aClass222Array2618
					    [(-855757145
					      * ((Class225) this).anInt2633)]
					    = null;
				    else if (((-1041430751
					       * ((Class225) this).anInt2638)
					      >= (((Class225) this).anInt2621
						  * 1302252003))
					     && ((((Class225) this).anInt2638
						  * -1041430751) - i_88_
						 < (1302252003
						    * (((Class225) this)
						       .anInt2621))))
					((Class222)
					 (((Class225) this).aClass222Array2618
					  [(((Class225) this).anInt2633
					    * -855757145)])).anInt2588
					    = (((Class225) this)
						   .anInterface44_2632
						   .method287
					       ((-1041430751 * ((Class225)
								this).anInt2638
						 - (((Class225) this).anInt2621
						    * 1302252003))
						* i_87_)) * 1170883249;
				}
				if ((((Class225) this).aClass222Array2618
				     [(-855757145
				       * ((Class225) this).anInt2633)])
				    != null) {
				    if (((Class225) this).aBool2652
					&& !method4506(((((Class225) this)
							 .anInt2651)
							* 186065047),
						       (short) 3553))
					method4534((((Class222)
						     (((Class225) this)
						      .aClass222Array2618
						      [((((Class225) this)
							 .anInt2633)
							* -855757145)]))
						    .aClass241_Sub3_2586),
						   -821458770);
				    if (!((Class225) this).aBool2640
					&& ((Class225) this).aBool2644
					&& ((((Class225) this).anInt2638
					     * -1041430751)
					    >= (1444389231
						* ((Class225) this).anInt2622))
					&& (((((Class225) this).anInt2654
					      * 1721371295)
					     <= (((Class225) this).anInt2611
						 * 1786276849))
					    || (((Class225) this).anInt2611
						* 1786276849) < 0)) {
					int i_89_
					    = ((((Class225) this).anInt2638
						* -1041430751)
					       - (1444389231
						  * (((Class225) this)
						     .anInt2622)));
					int i_90_ = i_88_ - i_89_;
					((Class222)
					 (((Class225) this).aClass222Array2618
					  [(-855757145
					    * ((Class225) this).anInt2633)]))
					    .anInt2589
					    = (((Class225) this)
						   .anInterface44_2632
						   .method287(i_90_ * i_87_)
					       * 453817619);
					((Class225) this).anInt2651 = 0;
					((Class225) this).anInt2654
					    += 334401887;
					((Class225) this).anInt2638 = 0;
				    } else
					((Class225) this).anInt2651
					    += -1024565465;
				    ((Class225) this).anInt2633 += 1803065623;
				    ((Class225) this).anInt2633
					= (1803065623
					   * (((Class225) this).anInt2633
					      * -855757145
					      % (((Class225) this)
						 .aClass222Array2618).length));
				}
			    } else
				((Class225) this).aClass222Array2618
				    [-855757145 * ((Class225) this).anInt2633]
				    = null;
			} else if (Class303.aClass303_4793 == class303
				   && ((Class225) this).aBool2644
				   && false == ((Class225) this).aBool2640
				   && (((1721371295
					 * ((Class225) this).anInt2654)
					< (1786276849
					   * ((Class225) this).anInt2611))
				       || (1786276849
					   * ((Class225) this).anInt2611) < 0))
			    ((Class225) this).anInterface44_2632
				.method288(true);
		    }
		}
	    }
	    int i = 0;
	    for (int i_91_ = 0;
		 i_91_ < ((Class225) this).aClass222Array2618.length;
		 i_91_++) {
		if (null != ((Class225) this).aClass222Array2618[i_91_]) {
		    i++;
		    bool = false;
		}
	    }
	    if (!((Class225) this).aBool2643 && method4517(-1581110174) >= 0.0F
		&& (i >= 1240271169 * ((Class225) this).anInt2607
		    || class303 == Class303.aClass303_4793
		    || class303 == Class303.aClass303_4788)) {
		((Class225) this).aBool2643 = true;
		method4504(Class239.aClass239_2759, 1416131723);
	    }
	    if (((Class225) this).anInterface44_2632.method154() && bool
		&& (method4538((byte) 60) || ((Class225) this).aBool2645
		    || class303 == Class303.aClass303_4793)
		&& (false == ((Class225) this).aBool2644
		    || (false == ((Class225) this).aBool2640
			&& (((Class225) this).anInt2654 * 1721371295
			    >= ((Class225) this).anInt2611 * 1786276849)
			&& 1786276849 * ((Class225) this).anInt2611 >= 0))) {
		method4504(Class239.aClass239_2765, 199538463);
		((Class225) this).aBool2630 = false;
		if (((Class225) this).aBool2652)
		    method4539((byte) 41);
	    }
	}
    }
    
    void method4592() {
	if (((Class225) this).aClass222Array2618 != null) {
	    boolean bool = true;
	    Class303 class303
		= ((Class225) this).anInterface44_2632.method317();
	    if (((Class225) this).anInterface44_2632.method154()) {
		if (((Class225) this).aBool2652
		    && method4506(((Class225) this).anInt2651 * 186065047,
				  (short) 3553)) {
		    if ((((Class225) this).aClass222Array2618
			 [-855757145 * ((Class225) this).anInt2633])
			== null) {
			RSByteBuffer class241_sub3
			    = method4535((186065047
					  * ((Class225) this).anInt2651),
					 (byte) 103);
			if (null != class241_sub3) {
			    ((Class225) this).aClass222Array2618
				[-855757145 * ((Class225) this).anInt2633]
				= new Class222(this, class241_sub3, false);
			    int i = ((Class225) this).anInterface44_2632
					.method223();
			    int i_92_
				= (((Class225) this).anInterface44_2632
				       .method200
				   (421967667
				    * (((Class222)
					(((Class225) this).aClass222Array2618
					 [(((Class225) this).anInt2633
					   * -855757145)]))
				       .aClass241_Sub3_2586.pointer)
				    / i));
			    ((Class225) this).anInt2638 += 501300449 * i_92_;
			    if (!((Class225) this).aBool2640
				&& ((Class225) this).aBool2644
				&& (((Class225) this).anInt2654 * 1721371295
				    > 0)) {
				if (-1041430751 * ((Class225) this).anInt2638
				    < 1302252003 * ((Class225) this).anInt2621)
				    ((Class225) this).aClass222Array2618
					[(((Class225) this).anInt2633
					  * -855757145)]
					= null;
				else if (((-1041430751
					   * ((Class225) this).anInt2638)
					  >= (1302252003
					      * ((Class225) this).anInt2621))
					 && (-1041430751 * (((Class225) this)
							    .anInt2638) - i_92_
					     < 1302252003 * (((Class225) this)
							     .anInt2621)))
				    ((Class222) (((Class225) this)
						 .aClass222Array2618
						 [(((Class225) this).anInt2633
						   * -855757145)])).anInt2588
					= ((((Class225) this)
						.anInterface44_2632.method287
					    (i
					     * ((-1041430751
						 * ((Class225) this).anInt2638)
						- (((Class225) this).anInt2621
						   * 1302252003))))
					   * 1170883249);
			    }
			    ((Class225) this).anInt2651 += -1024565465;
			    if (false == ((Class225) this).aBool2640
				&& ((Class225) this).aBool2644
				&& (-1041430751 * ((Class225) this).anInt2638
				    >= (((Class225) this).anInt2622
					* 1444389231))
				&& ((((Class225) this).anInt2654 * 1721371295
				     < (1786276849
					* ((Class225) this).anInt2611))
				    || (1786276849
					* ((Class225) this).anInt2611) < 0)) {
				int i_93_ = ((((Class225) this).anInt2638
					      * -1041430751)
					     - 1444389231 * (((Class225) this)
							     .anInt2622));
				int i_94_ = i_92_ - i_93_;
				((Class222) (((Class225) this)
					     .aClass222Array2618
					     [(((Class225) this).anInt2633
					       * -855757145)])).anInt2589
				    = ((Class225) this).anInterface44_2632
					  .method287(i * i_94_) * 453817619;
				((Class225) this).anInt2651 = 0;
				((Class225) this).anInt2638 = 0;
				((Class225) this).anInt2654 += 334401887;
			    }
			    if (null != (((Class225) this).aClass222Array2618
					 [(-855757145
					   * ((Class225) this).anInt2633)])) {
				((Class225) this).anInt2633 += 1803065623;
				((Class225) this).anInt2633
				    = (1803065623
				       * (-855757145
					  * ((Class225) this).anInt2633
					  % (((Class225) this)
					     .aClass222Array2618).length));
			    }
			}
		    }
		} else if (!method4538((byte) 118)
			   || !((Class225) this).aBool2652) {
		    int i = ((Class225) this).anInterface44_2632.method9();
		    int i_95_ = (((Class225) this).anInterface44_2632.method200
				 (((Class225) this).anInt2617 * 487924981));
		    if (false == ((Class225) this).aBool2645
			&& (null
			    == (((Class225) this).aClass222Array2618
				[((Class225) this).anInt2633 * -855757145]))) {
			if (Class303.aClass303_4793 != class303 && i > 0) {
			    RSByteBuffer class241_sub3
				= method4533(i_95_, (byte) 24);
			    ((Class225) this).aClass222Array2618
				[((Class225) this).anInt2633 * -855757145]
				= (class241_sub3 != null
				   ? new Class222(this, class241_sub3, false)
				   : null);
			    int i_96_
				= (null != (((Class225) this)
					    .aClass222Array2618
					    [(-855757145
					      * ((Class225) this).anInt2633)])
				   ? ((((Class222)
					(((Class225) this).aClass222Array2618
					 [(-855757145
					   * ((Class225) this).anInt2633)]))
				       .aClass241_Sub3_2586.pointer)
				      * 421967667)
				   : 0);
			    int i_97_ = ((Class225) this)
					    .anInterface44_2632.method223();
			    int i_98_ = ((Class225) this)
					    .anInterface44_2632
					    .method200(i_96_ / i_97_);
			    ((Class225) this).anInt2639 += i_98_ * 147521595;
			    if (-1064838925 * ((Class225) this).anInt2639
				> ((Class225) this).anInt2638 * -1041430751) {
				((Class225) this).anInt2638
				    += 501300449 * i_98_;
				i -= i_98_;
				if (false == ((Class225) this).aBool2640
				    && ((Class225) this).aBool2644
				    && (1721371295
					* ((Class225) this).anInt2654) > 0) {
				    if ((-1041430751
					 * ((Class225) this).anInt2638)
					< (1302252003
					   * ((Class225) this).anInt2621))
					((Class225) this)
					    .aClass222Array2618
					    [(-855757145
					      * ((Class225) this).anInt2633)]
					    = null;
				    else if (((-1041430751
					       * ((Class225) this).anInt2638)
					      >= (((Class225) this).anInt2621
						  * 1302252003))
					     && ((((Class225) this).anInt2638
						  * -1041430751) - i_98_
						 < (1302252003
						    * (((Class225) this)
						       .anInt2621))))
					((Class222)
					 (((Class225) this).aClass222Array2618
					  [(((Class225) this).anInt2633
					    * -855757145)])).anInt2588
					    = (((Class225) this)
						   .anInterface44_2632
						   .method287
					       ((-1041430751 * ((Class225)
								this).anInt2638
						 - (((Class225) this).anInt2621
						    * 1302252003))
						* i_97_)) * 1170883249;
				}
				if ((((Class225) this).aClass222Array2618
				     [(-855757145
				       * ((Class225) this).anInt2633)])
				    != null) {
				    if (((Class225) this).aBool2652
					&& !method4506(((((Class225) this)
							 .anInt2651)
							* 186065047),
						       (short) 3553))
					method4534((((Class222)
						     (((Class225) this)
						      .aClass222Array2618
						      [((((Class225) this)
							 .anInt2633)
							* -855757145)]))
						    .aClass241_Sub3_2586),
						   -821458770);
				    if (!((Class225) this).aBool2640
					&& ((Class225) this).aBool2644
					&& ((((Class225) this).anInt2638
					     * -1041430751)
					    >= (1444389231
						* ((Class225) this).anInt2622))
					&& (((((Class225) this).anInt2654
					      * 1721371295)
					     <= (((Class225) this).anInt2611
						 * 1786276849))
					    || (((Class225) this).anInt2611
						* 1786276849) < 0)) {
					int i_99_
					    = ((((Class225) this).anInt2638
						* -1041430751)
					       - (1444389231
						  * (((Class225) this)
						     .anInt2622)));
					int i_100_ = i_98_ - i_99_;
					((Class222)
					 (((Class225) this).aClass222Array2618
					  [(-855757145
					    * ((Class225) this).anInt2633)]))
					    .anInt2589
					    = (((Class225) this)
						   .anInterface44_2632
						   .method287(i_100_ * i_97_)
					       * 453817619);
					((Class225) this).anInt2651 = 0;
					((Class225) this).anInt2654
					    += 334401887;
					((Class225) this).anInt2638 = 0;
				    } else
					((Class225) this).anInt2651
					    += -1024565465;
				    ((Class225) this).anInt2633 += 1803065623;
				    ((Class225) this).anInt2633
					= (1803065623
					   * (((Class225) this).anInt2633
					      * -855757145
					      % (((Class225) this)
						 .aClass222Array2618).length));
				}
			    } else
				((Class225) this).aClass222Array2618
				    [-855757145 * ((Class225) this).anInt2633]
				    = null;
			} else if (Class303.aClass303_4793 == class303
				   && ((Class225) this).aBool2644
				   && false == ((Class225) this).aBool2640
				   && (((1721371295
					 * ((Class225) this).anInt2654)
					< (1786276849
					   * ((Class225) this).anInt2611))
				       || (1786276849
					   * ((Class225) this).anInt2611) < 0))
			    ((Class225) this).anInterface44_2632
				.method288(true);
		    }
		}
	    }
	    int i = 0;
	    for (int i_101_ = 0;
		 i_101_ < ((Class225) this).aClass222Array2618.length;
		 i_101_++) {
		if (null != ((Class225) this).aClass222Array2618[i_101_]) {
		    i++;
		    bool = false;
		}
	    }
	    if (!((Class225) this).aBool2643 && method4517(-737375569) >= 0.0F
		&& (i >= 1240271169 * ((Class225) this).anInt2607
		    || class303 == Class303.aClass303_4793
		    || class303 == Class303.aClass303_4788)) {
		((Class225) this).aBool2643 = true;
		method4504(Class239.aClass239_2759, 1198322933);
	    }
	    if (((Class225) this).anInterface44_2632.method154() && bool
		&& (method4538((byte) 49) || ((Class225) this).aBool2645
		    || class303 == Class303.aClass303_4793)
		&& (false == ((Class225) this).aBool2644
		    || (false == ((Class225) this).aBool2640
			&& (((Class225) this).anInt2654 * 1721371295
			    >= ((Class225) this).anInt2611 * 1786276849)
			&& 1786276849 * ((Class225) this).anInt2611 >= 0))) {
		method4504(Class239.aClass239_2765, 1276949085);
		((Class225) this).aBool2630 = false;
		if (((Class225) this).aBool2652)
		    method4539((byte) 39);
	    }
	}
    }
    
    void method4593() {
	if (((Class225) this).aClass222Array2618 != null) {
	    boolean bool = true;
	    Class303 class303
		= ((Class225) this).anInterface44_2632.method317();
	    if (((Class225) this).anInterface44_2632.method154()) {
		if (((Class225) this).aBool2652
		    && method4506(((Class225) this).anInt2651 * 186065047,
				  (short) 3553)) {
		    if ((((Class225) this).aClass222Array2618
			 [-855757145 * ((Class225) this).anInt2633])
			== null) {
			RSByteBuffer class241_sub3
			    = method4535((186065047
					  * ((Class225) this).anInt2651),
					 (byte) -30);
			if (null != class241_sub3) {
			    ((Class225) this).aClass222Array2618
				[-855757145 * ((Class225) this).anInt2633]
				= new Class222(this, class241_sub3, false);
			    int i = ((Class225) this).anInterface44_2632
					.method223();
			    int i_102_
				= (((Class225) this).anInterface44_2632
				       .method200
				   (421967667
				    * (((Class222)
					(((Class225) this).aClass222Array2618
					 [(((Class225) this).anInt2633
					   * -855757145)]))
				       .aClass241_Sub3_2586.pointer)
				    / i));
			    ((Class225) this).anInt2638 += 501300449 * i_102_;
			    if (!((Class225) this).aBool2640
				&& ((Class225) this).aBool2644
				&& (((Class225) this).anInt2654 * 1721371295
				    > 0)) {
				if (-1041430751 * ((Class225) this).anInt2638
				    < 1302252003 * ((Class225) this).anInt2621)
				    ((Class225) this).aClass222Array2618
					[(((Class225) this).anInt2633
					  * -855757145)]
					= null;
				else if (((-1041430751
					   * ((Class225) this).anInt2638)
					  >= (1302252003
					      * ((Class225) this).anInt2621))
					 && (((-1041430751
					       * ((Class225) this).anInt2638)
					      - i_102_)
					     < 1302252003 * (((Class225) this)
							     .anInt2621)))
				    ((Class222) (((Class225) this)
						 .aClass222Array2618
						 [(((Class225) this).anInt2633
						   * -855757145)])).anInt2588
					= ((((Class225) this)
						.anInterface44_2632.method287
					    (i
					     * ((-1041430751
						 * ((Class225) this).anInt2638)
						- (((Class225) this).anInt2621
						   * 1302252003))))
					   * 1170883249);
			    }
			    ((Class225) this).anInt2651 += -1024565465;
			    if (false == ((Class225) this).aBool2640
				&& ((Class225) this).aBool2644
				&& (-1041430751 * ((Class225) this).anInt2638
				    >= (((Class225) this).anInt2622
					* 1444389231))
				&& ((((Class225) this).anInt2654 * 1721371295
				     < (1786276849
					* ((Class225) this).anInt2611))
				    || (1786276849
					* ((Class225) this).anInt2611) < 0)) {
				int i_103_ = ((((Class225) this).anInt2638
					       * -1041430751)
					      - 1444389231 * (((Class225) this)
							      .anInt2622));
				int i_104_ = i_102_ - i_103_;
				((Class222) (((Class225) this)
					     .aClass222Array2618
					     [(((Class225) this).anInt2633
					       * -855757145)])).anInt2589
				    = ((Class225) this).anInterface44_2632
					  .method287(i * i_104_) * 453817619;
				((Class225) this).anInt2651 = 0;
				((Class225) this).anInt2638 = 0;
				((Class225) this).anInt2654 += 334401887;
			    }
			    if (null != (((Class225) this).aClass222Array2618
					 [(-855757145
					   * ((Class225) this).anInt2633)])) {
				((Class225) this).anInt2633 += 1803065623;
				((Class225) this).anInt2633
				    = (1803065623
				       * (-855757145
					  * ((Class225) this).anInt2633
					  % (((Class225) this)
					     .aClass222Array2618).length));
			    }
			}
		    }
		} else if (!method4538((byte) 54)
			   || !((Class225) this).aBool2652) {
		    int i = ((Class225) this).anInterface44_2632.method9();
		    int i_105_
			= (((Class225) this).anInterface44_2632.method200
			   (((Class225) this).anInt2617 * 487924981));
		    if (false == ((Class225) this).aBool2645
			&& (null
			    == (((Class225) this).aClass222Array2618
				[((Class225) this).anInt2633 * -855757145]))) {
			if (Class303.aClass303_4793 != class303 && i > 0) {
			    RSByteBuffer class241_sub3
				= method4533(i_105_, (byte) 67);
			    ((Class225) this).aClass222Array2618
				[((Class225) this).anInt2633 * -855757145]
				= (class241_sub3 != null
				   ? new Class222(this, class241_sub3, false)
				   : null);
			    int i_106_
				= (null != (((Class225) this)
					    .aClass222Array2618
					    [(-855757145
					      * ((Class225) this).anInt2633)])
				   ? ((((Class222)
					(((Class225) this).aClass222Array2618
					 [(-855757145
					   * ((Class225) this).anInt2633)]))
				       .aClass241_Sub3_2586.pointer)
				      * 421967667)
				   : 0);
			    int i_107_ = ((Class225) this)
					     .anInterface44_2632.method223();
			    int i_108_ = ((Class225) this)
					     .anInterface44_2632
					     .method200(i_106_ / i_107_);
			    ((Class225) this).anInt2639 += i_108_ * 147521595;
			    if (-1064838925 * ((Class225) this).anInt2639
				> ((Class225) this).anInt2638 * -1041430751) {
				((Class225) this).anInt2638
				    += 501300449 * i_108_;
				i -= i_108_;
				if (false == ((Class225) this).aBool2640
				    && ((Class225) this).aBool2644
				    && (1721371295
					* ((Class225) this).anInt2654) > 0) {
				    if ((-1041430751
					 * ((Class225) this).anInt2638)
					< (1302252003
					   * ((Class225) this).anInt2621))
					((Class225) this)
					    .aClass222Array2618
					    [(-855757145
					      * ((Class225) this).anInt2633)]
					    = null;
				    else if (((-1041430751
					       * ((Class225) this).anInt2638)
					      >= (((Class225) this).anInt2621
						  * 1302252003))
					     && ((((Class225) this).anInt2638
						  * -1041430751) - i_108_
						 < (1302252003
						    * (((Class225) this)
						       .anInt2621))))
					((Class222)
					 (((Class225) this).aClass222Array2618
					  [(((Class225) this).anInt2633
					    * -855757145)])).anInt2588
					    = (((Class225) this)
						   .anInterface44_2632
						   .method287
					       ((-1041430751 * ((Class225)
								this).anInt2638
						 - (((Class225) this).anInt2621
						    * 1302252003))
						* i_107_)) * 1170883249;
				}
				if ((((Class225) this).aClass222Array2618
				     [(-855757145
				       * ((Class225) this).anInt2633)])
				    != null) {
				    if (((Class225) this).aBool2652
					&& !method4506(((((Class225) this)
							 .anInt2651)
							* 186065047),
						       (short) 3553))
					method4534((((Class222)
						     (((Class225) this)
						      .aClass222Array2618
						      [((((Class225) this)
							 .anInt2633)
							* -855757145)]))
						    .aClass241_Sub3_2586),
						   -821458770);
				    if (!((Class225) this).aBool2640
					&& ((Class225) this).aBool2644
					&& ((((Class225) this).anInt2638
					     * -1041430751)
					    >= (1444389231
						* ((Class225) this).anInt2622))
					&& (((((Class225) this).anInt2654
					      * 1721371295)
					     <= (((Class225) this).anInt2611
						 * 1786276849))
					    || (((Class225) this).anInt2611
						* 1786276849) < 0)) {
					int i_109_
					    = ((((Class225) this).anInt2638
						* -1041430751)
					       - (1444389231
						  * (((Class225) this)
						     .anInt2622)));
					int i_110_ = i_108_ - i_109_;
					((Class222)
					 (((Class225) this).aClass222Array2618
					  [(-855757145
					    * ((Class225) this).anInt2633)]))
					    .anInt2589
					    = (((Class225) this)
						   .anInterface44_2632
						   .method287(i_110_ * i_107_)
					       * 453817619);
					((Class225) this).anInt2651 = 0;
					((Class225) this).anInt2654
					    += 334401887;
					((Class225) this).anInt2638 = 0;
				    } else
					((Class225) this).anInt2651
					    += -1024565465;
				    ((Class225) this).anInt2633 += 1803065623;
				    ((Class225) this).anInt2633
					= (1803065623
					   * (((Class225) this).anInt2633
					      * -855757145
					      % (((Class225) this)
						 .aClass222Array2618).length));
				}
			    } else
				((Class225) this).aClass222Array2618
				    [-855757145 * ((Class225) this).anInt2633]
				    = null;
			} else if (Class303.aClass303_4793 == class303
				   && ((Class225) this).aBool2644
				   && false == ((Class225) this).aBool2640
				   && (((1721371295
					 * ((Class225) this).anInt2654)
					< (1786276849
					   * ((Class225) this).anInt2611))
				       || (1786276849
					   * ((Class225) this).anInt2611) < 0))
			    ((Class225) this).anInterface44_2632
				.method288(true);
		    }
		}
	    }
	    int i = 0;
	    for (int i_111_ = 0;
		 i_111_ < ((Class225) this).aClass222Array2618.length;
		 i_111_++) {
		if (null != ((Class225) this).aClass222Array2618[i_111_]) {
		    i++;
		    bool = false;
		}
	    }
	    if (!((Class225) this).aBool2643 && method4517(-1693418099) >= 0.0F
		&& (i >= 1240271169 * ((Class225) this).anInt2607
		    || class303 == Class303.aClass303_4793
		    || class303 == Class303.aClass303_4788)) {
		((Class225) this).aBool2643 = true;
		method4504(Class239.aClass239_2759, 1296736723);
	    }
	    if (((Class225) this).anInterface44_2632.method154() && bool
		&& (method4538((byte) 53) || ((Class225) this).aBool2645
		    || class303 == Class303.aClass303_4793)
		&& (false == ((Class225) this).aBool2644
		    || (false == ((Class225) this).aBool2640
			&& (((Class225) this).anInt2654 * 1721371295
			    >= ((Class225) this).anInt2611 * 1786276849)
			&& 1786276849 * ((Class225) this).anInt2611 >= 0))) {
		method4504(Class239.aClass239_2765, 151135456);
		((Class225) this).aBool2630 = false;
		if (((Class225) this).aBool2652)
		    method4539((byte) 19);
	    }
	}
    }
    
    void method4594() {
	if (((Class225) this).aClass222Array2618 != null) {
	    boolean bool = true;
	    Class303 class303
		= ((Class225) this).anInterface44_2632.method317();
	    if (((Class225) this).anInterface44_2632.method154()) {
		if (((Class225) this).aBool2652
		    && method4506(((Class225) this).anInt2651 * 186065047,
				  (short) 3553)) {
		    if ((((Class225) this).aClass222Array2618
			 [-855757145 * ((Class225) this).anInt2633])
			== null) {
			RSByteBuffer class241_sub3
			    = method4535((186065047
					  * ((Class225) this).anInt2651),
					 (byte) -35);
			if (null != class241_sub3) {
			    ((Class225) this).aClass222Array2618
				[-855757145 * ((Class225) this).anInt2633]
				= new Class222(this, class241_sub3, false);
			    int i = ((Class225) this).anInterface44_2632
					.method223();
			    int i_112_
				= (((Class225) this).anInterface44_2632
				       .method200
				   (421967667
				    * (((Class222)
					(((Class225) this).aClass222Array2618
					 [(((Class225) this).anInt2633
					   * -855757145)]))
				       .aClass241_Sub3_2586.pointer)
				    / i));
			    ((Class225) this).anInt2638 += 501300449 * i_112_;
			    if (!((Class225) this).aBool2640
				&& ((Class225) this).aBool2644
				&& (((Class225) this).anInt2654 * 1721371295
				    > 0)) {
				if (-1041430751 * ((Class225) this).anInt2638
				    < 1302252003 * ((Class225) this).anInt2621)
				    ((Class225) this).aClass222Array2618
					[(((Class225) this).anInt2633
					  * -855757145)]
					= null;
				else if (((-1041430751
					   * ((Class225) this).anInt2638)
					  >= (1302252003
					      * ((Class225) this).anInt2621))
					 && (((-1041430751
					       * ((Class225) this).anInt2638)
					      - i_112_)
					     < 1302252003 * (((Class225) this)
							     .anInt2621)))
				    ((Class222) (((Class225) this)
						 .aClass222Array2618
						 [(((Class225) this).anInt2633
						   * -855757145)])).anInt2588
					= ((((Class225) this)
						.anInterface44_2632.method287
					    (i
					     * ((-1041430751
						 * ((Class225) this).anInt2638)
						- (((Class225) this).anInt2621
						   * 1302252003))))
					   * 1170883249);
			    }
			    ((Class225) this).anInt2651 += -1024565465;
			    if (false == ((Class225) this).aBool2640
				&& ((Class225) this).aBool2644
				&& (-1041430751 * ((Class225) this).anInt2638
				    >= (((Class225) this).anInt2622
					* 1444389231))
				&& ((((Class225) this).anInt2654 * 1721371295
				     < (1786276849
					* ((Class225) this).anInt2611))
				    || (1786276849
					* ((Class225) this).anInt2611) < 0)) {
				int i_113_ = ((((Class225) this).anInt2638
					       * -1041430751)
					      - 1444389231 * (((Class225) this)
							      .anInt2622));
				int i_114_ = i_112_ - i_113_;
				((Class222) (((Class225) this)
					     .aClass222Array2618
					     [(((Class225) this).anInt2633
					       * -855757145)])).anInt2589
				    = ((Class225) this).anInterface44_2632
					  .method287(i * i_114_) * 453817619;
				((Class225) this).anInt2651 = 0;
				((Class225) this).anInt2638 = 0;
				((Class225) this).anInt2654 += 334401887;
			    }
			    if (null != (((Class225) this).aClass222Array2618
					 [(-855757145
					   * ((Class225) this).anInt2633)])) {
				((Class225) this).anInt2633 += 1803065623;
				((Class225) this).anInt2633
				    = (1803065623
				       * (-855757145
					  * ((Class225) this).anInt2633
					  % (((Class225) this)
					     .aClass222Array2618).length));
			    }
			}
		    }
		} else if (!method4538((byte) 47)
			   || !((Class225) this).aBool2652) {
		    int i = ((Class225) this).anInterface44_2632.method9();
		    int i_115_
			= (((Class225) this).anInterface44_2632.method200
			   (((Class225) this).anInt2617 * 487924981));
		    if (false == ((Class225) this).aBool2645
			&& (null
			    == (((Class225) this).aClass222Array2618
				[((Class225) this).anInt2633 * -855757145]))) {
			if (Class303.aClass303_4793 != class303 && i > 0) {
			    RSByteBuffer class241_sub3
				= method4533(i_115_, (byte) 117);
			    ((Class225) this).aClass222Array2618
				[((Class225) this).anInt2633 * -855757145]
				= (class241_sub3 != null
				   ? new Class222(this, class241_sub3, false)
				   : null);
			    int i_116_
				= (null != (((Class225) this)
					    .aClass222Array2618
					    [(-855757145
					      * ((Class225) this).anInt2633)])
				   ? ((((Class222)
					(((Class225) this).aClass222Array2618
					 [(-855757145
					   * ((Class225) this).anInt2633)]))
				       .aClass241_Sub3_2586.pointer)
				      * 421967667)
				   : 0);
			    int i_117_ = ((Class225) this)
					     .anInterface44_2632.method223();
			    int i_118_ = ((Class225) this)
					     .anInterface44_2632
					     .method200(i_116_ / i_117_);
			    ((Class225) this).anInt2639 += i_118_ * 147521595;
			    if (-1064838925 * ((Class225) this).anInt2639
				> ((Class225) this).anInt2638 * -1041430751) {
				((Class225) this).anInt2638
				    += 501300449 * i_118_;
				i -= i_118_;
				if (false == ((Class225) this).aBool2640
				    && ((Class225) this).aBool2644
				    && (1721371295
					* ((Class225) this).anInt2654) > 0) {
				    if ((-1041430751
					 * ((Class225) this).anInt2638)
					< (1302252003
					   * ((Class225) this).anInt2621))
					((Class225) this)
					    .aClass222Array2618
					    [(-855757145
					      * ((Class225) this).anInt2633)]
					    = null;
				    else if (((-1041430751
					       * ((Class225) this).anInt2638)
					      >= (((Class225) this).anInt2621
						  * 1302252003))
					     && ((((Class225) this).anInt2638
						  * -1041430751) - i_118_
						 < (1302252003
						    * (((Class225) this)
						       .anInt2621))))
					((Class222)
					 (((Class225) this).aClass222Array2618
					  [(((Class225) this).anInt2633
					    * -855757145)])).anInt2588
					    = (((Class225) this)
						   .anInterface44_2632
						   .method287
					       ((-1041430751 * ((Class225)
								this).anInt2638
						 - (((Class225) this).anInt2621
						    * 1302252003))
						* i_117_)) * 1170883249;
				}
				if ((((Class225) this).aClass222Array2618
				     [(-855757145
				       * ((Class225) this).anInt2633)])
				    != null) {
				    if (((Class225) this).aBool2652
					&& !method4506(((((Class225) this)
							 .anInt2651)
							* 186065047),
						       (short) 3553))
					method4534((((Class222)
						     (((Class225) this)
						      .aClass222Array2618
						      [((((Class225) this)
							 .anInt2633)
							* -855757145)]))
						    .aClass241_Sub3_2586),
						   -821458770);
				    if (!((Class225) this).aBool2640
					&& ((Class225) this).aBool2644
					&& ((((Class225) this).anInt2638
					     * -1041430751)
					    >= (1444389231
						* ((Class225) this).anInt2622))
					&& (((((Class225) this).anInt2654
					      * 1721371295)
					     <= (((Class225) this).anInt2611
						 * 1786276849))
					    || (((Class225) this).anInt2611
						* 1786276849) < 0)) {
					int i_119_
					    = ((((Class225) this).anInt2638
						* -1041430751)
					       - (1444389231
						  * (((Class225) this)
						     .anInt2622)));
					int i_120_ = i_118_ - i_119_;
					((Class222)
					 (((Class225) this).aClass222Array2618
					  [(-855757145
					    * ((Class225) this).anInt2633)]))
					    .anInt2589
					    = (((Class225) this)
						   .anInterface44_2632
						   .method287(i_120_ * i_117_)
					       * 453817619);
					((Class225) this).anInt2651 = 0;
					((Class225) this).anInt2654
					    += 334401887;
					((Class225) this).anInt2638 = 0;
				    } else
					((Class225) this).anInt2651
					    += -1024565465;
				    ((Class225) this).anInt2633 += 1803065623;
				    ((Class225) this).anInt2633
					= (1803065623
					   * (((Class225) this).anInt2633
					      * -855757145
					      % (((Class225) this)
						 .aClass222Array2618).length));
				}
			    } else
				((Class225) this).aClass222Array2618
				    [-855757145 * ((Class225) this).anInt2633]
				    = null;
			} else if (Class303.aClass303_4793 == class303
				   && ((Class225) this).aBool2644
				   && false == ((Class225) this).aBool2640
				   && (((1721371295
					 * ((Class225) this).anInt2654)
					< (1786276849
					   * ((Class225) this).anInt2611))
				       || (1786276849
					   * ((Class225) this).anInt2611) < 0))
			    ((Class225) this).anInterface44_2632
				.method288(true);
		    }
		}
	    }
	    int i = 0;
	    for (int i_121_ = 0;
		 i_121_ < ((Class225) this).aClass222Array2618.length;
		 i_121_++) {
		if (null != ((Class225) this).aClass222Array2618[i_121_]) {
		    i++;
		    bool = false;
		}
	    }
	    if (!((Class225) this).aBool2643 && method4517(-1831255129) >= 0.0F
		&& (i >= 1240271169 * ((Class225) this).anInt2607
		    || class303 == Class303.aClass303_4793
		    || class303 == Class303.aClass303_4788)) {
		((Class225) this).aBool2643 = true;
		method4504(Class239.aClass239_2759, 1911143569);
	    }
	    if (((Class225) this).anInterface44_2632.method154() && bool
		&& (method4538((byte) 95) || ((Class225) this).aBool2645
		    || class303 == Class303.aClass303_4793)
		&& (false == ((Class225) this).aBool2644
		    || (false == ((Class225) this).aBool2640
			&& (((Class225) this).anInt2654 * 1721371295
			    >= ((Class225) this).anInt2611 * 1786276849)
			&& 1786276849 * ((Class225) this).anInt2611 >= 0))) {
		method4504(Class239.aClass239_2765, 240777927);
		((Class225) this).aBool2630 = false;
		if (((Class225) this).aBool2652)
		    method4539((byte) 9);
	    }
	}
    }
    
    void method4595(int i) {
	if (((Class225) this).aClass222Array2618 != null) {
	    boolean bool = true;
	    Class303 class303
		= ((Class225) this).anInterface44_2632.method317();
	    if (((Class225) this).anInterface44_2632.method154()) {
		if (((Class225) this).aBool2652
		    && method4506(((Class225) this).anInt2651 * 186065047,
				  (short) 3553)) {
		    if ((((Class225) this).aClass222Array2618
			 [-855757145 * ((Class225) this).anInt2633])
			== null) {
			RSByteBuffer class241_sub3
			    = method4535((186065047
					  * ((Class225) this).anInt2651),
					 (byte) -108);
			if (null != class241_sub3) {
			    ((Class225) this).aClass222Array2618
				[-855757145 * ((Class225) this).anInt2633]
				= new Class222(this, class241_sub3, false);
			    int i_122_ = ((Class225) this)
					     .anInterface44_2632.method223();
			    int i_123_
				= (((Class225) this).anInterface44_2632
				       .method200
				   (421967667
				    * (((Class222)
					(((Class225) this).aClass222Array2618
					 [(((Class225) this).anInt2633
					   * -855757145)]))
				       .aClass241_Sub3_2586.pointer)
				    / i_122_));
			    ((Class225) this).anInt2638 += 501300449 * i_123_;
			    if (!((Class225) this).aBool2640
				&& ((Class225) this).aBool2644
				&& (((Class225) this).anInt2654 * 1721371295
				    > 0)) {
				if (-1041430751 * ((Class225) this).anInt2638
				    < 1302252003 * ((Class225) this).anInt2621)
				    ((Class225) this).aClass222Array2618
					[(((Class225) this).anInt2633
					  * -855757145)]
					= null;
				else if (((-1041430751
					   * ((Class225) this).anInt2638)
					  >= (1302252003
					      * ((Class225) this).anInt2621))
					 && (((-1041430751
					       * ((Class225) this).anInt2638)
					      - i_123_)
					     < 1302252003 * (((Class225) this)
							     .anInt2621)))
				    ((Class222) (((Class225) this)
						 .aClass222Array2618
						 [(((Class225) this).anInt2633
						   * -855757145)])).anInt2588
					= ((((Class225) this)
						.anInterface44_2632.method287
					    (i_122_
					     * ((-1041430751
						 * ((Class225) this).anInt2638)
						- (((Class225) this).anInt2621
						   * 1302252003))))
					   * 1170883249);
			    }
			    ((Class225) this).anInt2651 += -1024565465;
			    if (false == ((Class225) this).aBool2640
				&& ((Class225) this).aBool2644
				&& (-1041430751 * ((Class225) this).anInt2638
				    >= (((Class225) this).anInt2622
					* 1444389231))
				&& ((((Class225) this).anInt2654 * 1721371295
				     < (1786276849
					* ((Class225) this).anInt2611))
				    || (1786276849
					* ((Class225) this).anInt2611) < 0)) {
				int i_124_ = ((((Class225) this).anInt2638
					       * -1041430751)
					      - 1444389231 * (((Class225) this)
							      .anInt2622));
				int i_125_ = i_123_ - i_124_;
				((Class222) (((Class225) this)
					     .aClass222Array2618
					     [(((Class225) this).anInt2633
					       * -855757145)])).anInt2589
				    = (((Class225) this).anInterface44_2632
					   .method287(i_122_ * i_125_)
				       * 453817619);
				((Class225) this).anInt2651 = 0;
				((Class225) this).anInt2638 = 0;
				((Class225) this).anInt2654 += 334401887;
			    }
			    if (null != (((Class225) this).aClass222Array2618
					 [(-855757145
					   * ((Class225) this).anInt2633)])) {
				((Class225) this).anInt2633 += 1803065623;
				((Class225) this).anInt2633
				    = (1803065623
				       * (-855757145
					  * ((Class225) this).anInt2633
					  % (((Class225) this)
					     .aClass222Array2618).length));
			    }
			}
		    }
		} else if (!method4538((byte) 119)
			   || !((Class225) this).aBool2652) {
		    int i_126_
			= ((Class225) this).anInterface44_2632.method9();
		    int i_127_
			= (((Class225) this).anInterface44_2632.method200
			   (((Class225) this).anInt2617 * 487924981));
		    if (false == ((Class225) this).aBool2645
			&& (null
			    == (((Class225) this).aClass222Array2618
				[((Class225) this).anInt2633 * -855757145]))) {
			if (Class303.aClass303_4793 != class303
			    && i_126_ > 0) {
			    RSByteBuffer class241_sub3
				= method4533(i_127_, (byte) 107);
			    ((Class225) this).aClass222Array2618
				[((Class225) this).anInt2633 * -855757145]
				= (class241_sub3 != null
				   ? new Class222(this, class241_sub3, false)
				   : null);
			    int i_128_
				= (null != (((Class225) this)
					    .aClass222Array2618
					    [(-855757145
					      * ((Class225) this).anInt2633)])
				   ? ((((Class222)
					(((Class225) this).aClass222Array2618
					 [(-855757145
					   * ((Class225) this).anInt2633)]))
				       .aClass241_Sub3_2586.pointer)
				      * 421967667)
				   : 0);
			    int i_129_ = ((Class225) this)
					     .anInterface44_2632.method223();
			    int i_130_ = ((Class225) this)
					     .anInterface44_2632
					     .method200(i_128_ / i_129_);
			    ((Class225) this).anInt2639 += i_130_ * 147521595;
			    if (-1064838925 * ((Class225) this).anInt2639
				> ((Class225) this).anInt2638 * -1041430751) {
				((Class225) this).anInt2638
				    += 501300449 * i_130_;
				i_126_ -= i_130_;
				if (false == ((Class225) this).aBool2640
				    && ((Class225) this).aBool2644
				    && (1721371295
					* ((Class225) this).anInt2654) > 0) {
				    if ((-1041430751
					 * ((Class225) this).anInt2638)
					< (1302252003
					   * ((Class225) this).anInt2621))
					((Class225) this)
					    .aClass222Array2618
					    [(-855757145
					      * ((Class225) this).anInt2633)]
					    = null;
				    else if (((-1041430751
					       * ((Class225) this).anInt2638)
					      >= (((Class225) this).anInt2621
						  * 1302252003))
					     && ((((Class225) this).anInt2638
						  * -1041430751) - i_130_
						 < (1302252003
						    * (((Class225) this)
						       .anInt2621))))
					((Class222)
					 (((Class225) this).aClass222Array2618
					  [(((Class225) this).anInt2633
					    * -855757145)])).anInt2588
					    = (((Class225) this)
						   .anInterface44_2632
						   .method287
					       ((-1041430751 * ((Class225)
								this).anInt2638
						 - (((Class225) this).anInt2621
						    * 1302252003))
						* i_129_)) * 1170883249;
				}
				if ((((Class225) this).aClass222Array2618
				     [(-855757145
				       * ((Class225) this).anInt2633)])
				    != null) {
				    if (((Class225) this).aBool2652
					&& !method4506(((((Class225) this)
							 .anInt2651)
							* 186065047),
						       (short) 3553))
					method4534((((Class222)
						     (((Class225) this)
						      .aClass222Array2618
						      [((((Class225) this)
							 .anInt2633)
							* -855757145)]))
						    .aClass241_Sub3_2586),
						   -821458770);
				    if (!((Class225) this).aBool2640
					&& ((Class225) this).aBool2644
					&& ((((Class225) this).anInt2638
					     * -1041430751)
					    >= (1444389231
						* ((Class225) this).anInt2622))
					&& (((((Class225) this).anInt2654
					      * 1721371295)
					     <= (((Class225) this).anInt2611
						 * 1786276849))
					    || (((Class225) this).anInt2611
						* 1786276849) < 0)) {
					int i_131_
					    = ((((Class225) this).anInt2638
						* -1041430751)
					       - (1444389231
						  * (((Class225) this)
						     .anInt2622)));
					int i_132_ = i_130_ - i_131_;
					((Class222)
					 (((Class225) this).aClass222Array2618
					  [(-855757145
					    * ((Class225) this).anInt2633)]))
					    .anInt2589
					    = (((Class225) this)
						   .anInterface44_2632
						   .method287(i_132_ * i_129_)
					       * 453817619);
					((Class225) this).anInt2651 = 0;
					((Class225) this).anInt2654
					    += 334401887;
					((Class225) this).anInt2638 = 0;
				    } else
					((Class225) this).anInt2651
					    += -1024565465;
				    ((Class225) this).anInt2633 += 1803065623;
				    ((Class225) this).anInt2633
					= (1803065623
					   * (((Class225) this).anInt2633
					      * -855757145
					      % (((Class225) this)
						 .aClass222Array2618).length));
				}
			    } else
				((Class225) this).aClass222Array2618
				    [-855757145 * ((Class225) this).anInt2633]
				    = null;
			} else if (Class303.aClass303_4793 == class303
				   && ((Class225) this).aBool2644
				   && false == ((Class225) this).aBool2640
				   && (((1721371295
					 * ((Class225) this).anInt2654)
					< (1786276849
					   * ((Class225) this).anInt2611))
				       || (1786276849
					   * ((Class225) this).anInt2611) < 0))
			    ((Class225) this).anInterface44_2632
				.method288(true);
		    }
		}
	    }
	    int i_133_ = 0;
	    for (int i_134_ = 0;
		 i_134_ < ((Class225) this).aClass222Array2618.length;
		 i_134_++) {
		if (null != ((Class225) this).aClass222Array2618[i_134_]) {
		    i_133_++;
		    bool = false;
		}
	    }
	    if (!((Class225) this).aBool2643 && method4517(-1649405936) >= 0.0F
		&& (i_133_ >= 1240271169 * ((Class225) this).anInt2607
		    || class303 == Class303.aClass303_4793
		    || class303 == Class303.aClass303_4788)) {
		((Class225) this).aBool2643 = true;
		method4504(Class239.aClass239_2759, 804982869);
	    }
	    if (((Class225) this).anInterface44_2632.method154() && bool
		&& (method4538((byte) 31) || ((Class225) this).aBool2645
		    || class303 == Class303.aClass303_4793)
		&& (false == ((Class225) this).aBool2644
		    || (false == ((Class225) this).aBool2640
			&& (((Class225) this).anInt2654 * 1721371295
			    >= ((Class225) this).anInt2611 * 1786276849)
			&& 1786276849 * ((Class225) this).anInt2611 >= 0))) {
		method4504(Class239.aClass239_2765, 2047436361);
		((Class225) this).aBool2630 = false;
		if (((Class225) this).aBool2652)
		    method4539((byte) 101);
	    }
	}
    }
    
    void method4596() {
	if (method4597(2144422350) != Class239.aClass239_2763
	    && (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		< (-1626286599
		   * ((Class239) Class239.aClass239_2761).anInt2767))) {
	    method4504(Class239.aClass239_2761, -538940144);
	    ((Class225) this).aBool2630 = true;
	    method4525((byte) 3);
	    method4516(52434507);
	}
    }
    
    public Class239 method4597(int i) {
	return ((Class225) this).aClass239_2631;
    }
    
    boolean method4598(int i) {
	if (null != ((Class225) this).anObject2636
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 76);
	    return interface52.method382(i, -351886683);
	}
	return false;
    }
    
    public Class225(Class301 class301, int i, int i_135_,
		    Interface44 interface44, Class393 class393) {
	((Class225) this).anInt2613 = 0;
	((Class225) this).anInt2633 = 0;
	((Class225) this).anInt2634 = 0;
	((Class225) this).aFloat2647 = 0.0F;
	((Class225) this).aLong2614 = 0L;
	((Class225) this).aLong2649 = 0L;
	((Class225) this).aFloat2650 = 0.0F;
	((Class225) this).anInt2651 = 0;
	((Class225) this).anInt2654 = 0;
	((Class225) this).aClass393_2612 = class393;
	method4504(Class239.aClass239_2762, -82266214);
	((Class225) this).anInt2617 = i * -2016975011;
	((Class225) this).anInt2607 = i_135_ * 7636673;
	((Class225) this).anInterface44_2632 = interface44;
	((Class225) this).anInt2619 = 0;
	((Class225) this).aBool2606 = false;
	((Class225) this).anInterface44_2632.method311(new Class224(this));
	method4573(-2050328130);
    }
    
    void method4599(byte[] is, int i, int i_136_) {
	int i_137_ = i;
	int i_138_ = 0;
	int i_139_
	    = (((Class225) this).anInterface44_2632.method319().anInt4875
	       * -32980023);
	while (i_137_ < is.length && i_137_ < i_136_) {
	    float f = (((Class225) this).aFloatArray2609[i_138_]
		       * (((Class225) this).aFloat2615
			  * ((Class225) this).aFloat2623));
	    if (i_139_ == 16) {
		int i_140_ = (is[1 + i_137_] << 8) + (is[i_137_] & 0xff);
		i_140_ *= f * f;
		is[i_137_++] = (byte) i_140_;
		is[i_137_++] = (byte) (i_140_ >> 8);
	    } else if (8 == i_139_) {
		byte i_141_ = is[i_137_];
		i_141_ *= f;
		is[i_137_++] = i_141_;
	    } else
		throw new RuntimeException("");
	    i_138_ = ++i_138_ % ((Class225) this).aFloatArray2609.length;
	}
    }
    
    void method4600(byte[] is, int i, int i_142_) {
	int i_143_ = i;
	int i_144_ = 0;
	int i_145_
	    = (((Class225) this).anInterface44_2632.method319().anInt4875
	       * -32980023);
	while (i_143_ < is.length && i_143_ < i_142_) {
	    float f = (((Class225) this).aFloatArray2609[i_144_]
		       * (((Class225) this).aFloat2615
			  * ((Class225) this).aFloat2623));
	    if (i_145_ == 16) {
		int i_146_ = (is[1 + i_143_] << 8) + (is[i_143_] & 0xff);
		i_146_ *= f * f;
		is[i_143_++] = (byte) i_146_;
		is[i_143_++] = (byte) (i_146_ >> 8);
	    } else if (8 == i_145_) {
		byte i_147_ = is[i_143_];
		i_147_ *= f;
		is[i_143_++] = i_147_;
	    } else
		throw new RuntimeException("");
	    i_144_ = ++i_144_ % ((Class225) this).aFloatArray2609.length;
	}
    }
    
    public void method4601() {
	if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
	    < -1626286599 * ((Class239) Class239.aClass239_2758).anInt2767)
	    throw new RuntimeException("");
	((Class225) this).anObject2636 = null;
	method4504(Class239.aClass239_2766, 2011904954);
    }
    
    boolean method4602() {
	synchronized (this) {
	    if (((Class225) this).anObject2636 != null
		&& ((Class225) this).anObject2636 instanceof Class221) {
		Class221 class221 = (Class221) ((Class225) this).anObject2636;
		Interface52 interface52 = class221.method4418((byte) 97);
		if (null != interface52) {
		    boolean bool = interface52.method385((byte) -2);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    void method4603(RSByteBuffer class241_sub3) {
	if (null != ((Class225) this).anObject2636
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 68);
	    byte[] is = new byte[421967667 * class241_sub3.pointer];
	    System.arraycopy(class241_sub3.payload, 0, is, 0,
			     class241_sub3.pointer * 421967667);
	    RSByteBuffer class241_sub3_148_ = new RSByteBuffer(is);
	    class241_sub3_148_.pointer = 1 * class241_sub3.pointer;
	    interface52.method404(class241_sub3_148_, -1624732870);
	}
    }
    
    RSByteBuffer method4604(int i) {
	if (((Class225) this).anObject2636 != null
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 59);
	    RSByteBuffer class241_sub3
		= interface52.method380(i, (short) -8081);
	    RSByteBuffer class241_sub3_149_
		= new RSByteBuffer(class241_sub3.pointer * 421967667, true);
	    class241_sub3_149_.method14633(class241_sub3, 2071410107);
	    return class241_sub3_149_;
	}
	return null;
    }
    
    void method4605(int i) {
	if (method4597(2144422350) != Class239.aClass239_2763
	    && (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		< (-1626286599
		   * ((Class239) Class239.aClass239_2761).anInt2767))) {
	    method4504(Class239.aClass239_2761, 323175416);
	    ((Class225) this).aBool2630 = true;
	    method4525((byte) 3);
	    method4516(292320245);
	}
    }
    
    RSByteBuffer method4606(int i) {
	if (((Class225) this).anObject2636 != null
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 36);
	    RSByteBuffer class241_sub3
		= interface52.method380(i, (short) -4928);
	    RSByteBuffer class241_sub3_150_
		= new RSByteBuffer(class241_sub3.pointer * 421967667, true);
	    class241_sub3_150_.method14633(class241_sub3, 155489546);
	    return class241_sub3_150_;
	}
	return null;
    }
    
    boolean method4607(int i) {
	if (null != ((Class225) this).anObject2636
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 27);
	    return interface52.method382(i, -351886683);
	}
	return false;
    }
    
    void method4608(byte i) {
	if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
	    >= -1626286599 * ((Class239) Class239.aClass239_2761).anInt2767) {
	    if (method4597(2144422350) == Class239.aClass239_2766)
		method4523((byte) -8);
	    else {
		method4614(-854967295);
		if (((Class225) this).aFloat2647
		    != ((Class225) this).aFloat2623) {
		    long l = Class50.method1249((byte) 1);
		    if (l
			> -8873193387529044663L * ((Class225) this).aLong2614)
			((Class225) this).aFloat2623
			    = ((Class225) this).aFloat2647;
		    else {
			float f = (((Class225) this).aFloat2647
				   - ((Class225) this).aFloat2650);
			long l_151_ = ((-8873193387529044663L
					* ((Class225) this).aLong2614)
				       - (6263173297058700257L
					  * ((Class225) this).aLong2649));
			float f_152_ = f / (float) l_151_;
			((Class225) this).aFloat2623
			    = (f_152_ * (float) (l
						 - (((Class225) this).aLong2649
						    * 6263173297058700257L))
			       + ((Class225) this).aFloat2650);
			((Class225) this).aFloat2623
			    = Math.max(0.0F,
				       Math.min(1.0F,
						((Class225) this).aFloat2623));
		    }
		}
		method4516(380969593);
		if (((Class239) method4597(2144422350)).anInt2767 * -1626286599
		    < (((Class239) Class239.aClass239_2763).anInt2767
		       * -1626286599))
		    method4525((byte) 3);
	    }
	}
    }
    
    int method4609() {
	if (null != ((Class225) this).anObject2636
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 85);
	    return interface52.method383((byte) -23);
	}
	return 0;
    }
    
    void method4610(boolean bool) {
	((Class225) this).aBool2606 = bool;
    }
    
    int method4611() {
	if (null != ((Class225) this).anObject2636
	    && ((Class225) this).anObject2636 instanceof Class221) {
	    Class221 class221 = (Class221) ((Class225) this).anObject2636;
	    Interface52 interface52 = class221.method4418((byte) 47);
	    return interface52.method383((byte) -37);
	}
	return 0;
    }
    
    void method4612() {
	((Class225) this).aBool2655 = false;
    }
    
    boolean method4613() {
	synchronized (this) {
	    if (((Class225) this).anObject2636 != null
		&& ((Class225) this).anObject2636 instanceof Class221) {
		Class221 class221 = (Class221) ((Class225) this).anObject2636;
		Interface52 interface52 = class221.method4418((byte) 44);
		if (null != interface52) {
		    boolean bool = interface52.method385((byte) -86);
		    return bool;
		}
	    }
	    boolean bool = false;
	    return bool;
	}
    }
    
    void method4614(int i) {
	synchronized (this) {
	    int i_153_ = method4541((byte) 2);
	    if (((Class225) this).aBool2652
		&& i_153_ > 186065047 * ((Class225) this).anInt2651
		&& ((Class225) this).anInterface44_2632.method154()) {
		/* empty */
	    } else {
		Class303 class303
		    = ((Class225) this).anInterface44_2632.method317();
		if (((Class225) this).aBool2606
		    && class303 != Class303.aClass303_4788) {
		    if (null != ((Class225) this).aByteArray2653) {
			if (((Class225) this).anInt2613 * -18159511
			    >= 929955261 * ((Class225) this).anInt2625) {
			    ((Class225) this).anInterface44_2632
				.method306(null);
			    ((Class225) this).anInt2613 = 0;
			} else {
			    if (1089893459 * ((Class225) this).anInt2616
				< ((Class225) this).anInt2629 * 425718549)
				((Class225) this).anInt2616
				    = (((Class225) this).anInt2629
				       * -1410560521);
			    ((Class225) this).anInt2616
				= 1829498843 * ((((Class225) this)
						 .anIntArray2626
						 [(((Class225) this).anInt2613
						   * -18159511)])
						+ (((Class225) this).anInt2634
						   * -822518293));
			    int i_154_
				= (((Class225) this).anIntArray2642
				   [((Class225) this).anInt2613 * -18159511]);
			    int i_155_ = i_154_;
			    int i_156_
				= (i_155_ + -822518293 * (((Class225) this)
							  .anInt2634) > i_154_
				   ? (((Class225) this).anIntArray2626
				      [(((Class225) this).anInt2613
					* -18159511)]) + i_154_
				   : (1089893459 * ((Class225) this).anInt2616
				      + i_155_));
			    Class225 class225_157_ = this;
			    ((Class225) class225_157_).anInt2634
				= (((Class225) class225_157_).anInt2634
				   + ((i_155_ + (1089893459
						 * ((Class225) this).anInt2616)
				       > (((Class225) this)
					  .aByteArray2653).length)
				      ? ((((Class225) this)
					  .aByteArray2653).length
					 - (((Class225) this).anInt2616
					    * 1089893459))
				      : i_155_) * -1133714749);
			    RSByteBuffer class241_sub3
				= new RSByteBuffer((i_156_
						     - (1089893459
							* (((Class225) this)
							   .anInt2616))),
						    true);
			    if (((Class225) this).aByteArray2653 == null)
				throw new RuntimeException("");
			    if (class241_sub3.payload == null)
				throw new RuntimeException("");
			    class241_sub3.writeBytes
				(((Class225) this).aByteArray2653,
				 1089893459 * ((Class225) this).anInt2616,
				 (i_156_
				  - ((Class225) this).anInt2616 * 1089893459),
				 752061035);
			    ((Class225) this).anInterface44_2632
				.method306(class241_sub3);
			    method4530(false, -614452316);
			    if (-822518293 * ((Class225) this).anInt2634
				>= i_154_) {
				((Class225) this).anInt2613 += -829347879;
				((Class225) this).anInt2634 = 0;
			    }
			}
		    } else if (((Class225) this).anInterface19_2627 != null) {
			if (((Class225) this).anInt2608 * 1124524057
			    >= 929955261 * ((Class225) this).anInt2625) {
			    ((Class225) this).anInt2608 = 0;
			    ((Class225) this).anInterface44_2632
				.method306(null);
			} else {
			    byte[] is = (((Class225) this)
					     .anInterface19_2627.method121
					 ((((Class225) this).anIntArray2628
					   [(((Class225) this).anInt2608
					     * 1124524057)]),
					  (byte) 110));
			    if (null != is) {
				RSByteBuffer class241_sub3
				    = new RSByteBuffer(is);
				class241_sub3.pointer
				    = -681042949 * is.length;
				((Class225) this).anInterface44_2632
				    .method306(class241_sub3);
				method4530(false, -1091698792);
				((Class225) this).anInt2608 += -311788503;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method4615() {
	synchronized (this) {
	    if (((Class225) this).aBool2655) {
		/* empty */
	    } else if (null == ((Class225) this).anObject2620) {
		/* empty */
	    } else {
		int i = (((Class225) this).aClass393_2612.method7031
			 (((Class225) this).anObject2620, 1268674668));
		if (i <= 0) {
		    /* empty */
		} else if (((Class225) this).aClass222Array2618 != null
			   && ((((Class225) this).aClass222Array2618
				[-1917109229 * ((Class225) this).anInt2619])
			       != null)
			   && ((Class225) this).aBool2643) {
		    int i_158_
			= ((i + ((Class225) this).anInt2637 * 467556125
			    > (421967667
			       * (((Class222) (((Class225) this)
					       .aClass222Array2618
					       [(((Class225) this).anInt2619
						 * -1917109229)]))
				  .aClass241_Sub3_2586.pointer)))
			   ? ((((Class222)
				(((Class225) this).aClass222Array2618
				 [-1917109229 * ((Class225) this).anInt2619]))
			       .aClass241_Sub3_2586.pointer) * 421967667
			      - 467556125 * ((Class225) this).anInt2637)
			   : i);
		    if ((((Class225) this).anInt2637 * 467556125
			 < (-1792227759
			    * (((Class222)
				(((Class225) this).aClass222Array2618
				 [-1917109229 * ((Class225) this).anInt2619]))
			       .anInt2588)))
			&& (i_158_ + 467556125 * ((Class225) this).anInt2637
			    > (-1792227759
			       * ((Class222) (((Class225) this)
					      .aClass222Array2618
					      [(((Class225) this).anInt2619
						* -1917109229)])).anInt2588))
			&& (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2588) * -1792227759 >= 0) {
			((Class225) this).anInt2637
			    += ((((Class222) (((Class225) this)
					      .aClass222Array2618
					      [(((Class225) this).anInt2619
						* -1917109229)])).anInt2588
				 * -454221371)
				- 1 * ((Class225) this).anInt2637);
			i_158_
			    = ((i + ((Class225) this).anInt2637 * 467556125
				> (((Class222) (((Class225) this)
						.aClass222Array2618
						[(((Class225) this).anInt2619
						  * -1917109229)]))
				   .aClass241_Sub3_2586.pointer) * 421967667)
			       ? ((421967667
				   * (((Class222)
				       (((Class225) this).aClass222Array2618
					[(-1917109229
					  * ((Class225) this).anInt2619)]))
				      .aClass241_Sub3_2586.pointer))
				  - 467556125 * ((Class225) this).anInt2637)
			       : i);
		    }
		    if ((467556125 * ((Class225) this).anInt2637 + i_158_
			 > (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2589) * 297491739)
			&& (((Class222)
			     (((Class225) this).aClass222Array2618
			      [-1917109229 * ((Class225) this).anInt2619]))
			    .anInt2589) * 297491739 >= 0)
			i_158_ = (297491739 * ((Class222)
					       (((Class225) this)
						.aClass222Array2618
						[(((Class225) this).anInt2619
						  * -1917109229)])).anInt2589
				  - ((Class225) this).anInt2637 * 467556125);
		    method4590((((Class222)
				 (((Class225) this).aClass222Array2618
				  [((Class225) this).anInt2619 * -1917109229]))
				.aClass241_Sub3_2586.payload),
			       ((Class225) this).anInt2637 * 467556125,
			       (467556125 * ((Class225) this).anInt2637
				+ i_158_),
			       (byte) -17);
		    ((Class225) this).aClass393_2612.method7028
			(((Class225) this).anObject2620,
			 (((Class222)
			   (((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]))
			  .aClass241_Sub3_2586.payload),
			 ((Class225) this).anInt2637 * 467556125, i_158_,
			 (byte) -7);
		    ((Class225) this).anInt2637 += i_158_ * 689644341;
		    i -= i_158_;
		    if ((467556125 * ((Class225) this).anInt2637
			 >= (421967667
			     * (((Class222)
				 (((Class225) this).aClass222Array2618
				  [-1917109229 * ((Class225) this).anInt2619]))
				.aClass241_Sub3_2586.pointer)))
			|| ((((Class225) this).anInt2637 * 467556125
			     >= (297491739
				 * ((Class222) (((Class225) this)
						.aClass222Array2618
						[(((Class225) this).anInt2619
						  * -1917109229)])).anInt2589))
			    && (((Class222)
				 (((Class225) this).aClass222Array2618
				  [-1917109229 * ((Class225) this).anInt2619]))
				.anInt2589) * 297491739 >= 0)) {
			((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]
			    .method4482(764233877);
			((Class225) this).aClass222Array2618
			    [-1917109229 * ((Class225) this).anInt2619]
			    = null;
			((Class225) this).anInt2619 += 1172172315;
			((Class225) this).anInt2619
			    = (-1917109229 * ((Class225) this).anInt2619
			       % ((Class225) this).aClass222Array2618.length
			       * 1172172315);
			((Class225) this).anInt2637 = 0;
		    }
		}
	    }
	}
    }
    
    void method4616() {
	synchronized (this) {
	    if (null != ((Class225) this).anObject2636
		&& ((Class225) this).anObject2636 instanceof Class221) {
		Class221 class221 = (Class221) ((Class225) this).anObject2636;
		Interface52 interface52 = class221.method4418((byte) 59);
		if (interface52 != null)
		    interface52.method384(true, (byte) 33);
	    }
	}
    }
    
    void method4617() {
	synchronized (this) {
	    if (null != ((Class225) this).anObject2636
		&& ((Class225) this).anObject2636 instanceof Class221) {
		Class221 class221 = (Class221) ((Class225) this).anObject2636;
		Interface52 interface52 = class221.method4418((byte) 79);
		if (interface52 != null)
		    interface52.method384(true, (byte) 102);
	    }
	}
    }
    
    Object method4618() {
	return ((Class225) this).anObject2636;
    }
    
    Object method4619() {
	return ((Class225) this).anObject2636;
    }
    
    Object method4620() {
	return ((Class225) this).anObject2636;
    }
    
    void method4621() {
	synchronized (this) {
	    ((Class225) this).aByteArray2653 = null;
	    ((Class225) this).anInt2610 = 0;
	    ((Class225) this).aFloat2623 = 0.0F;
	    ((Class225) this).aFloat2615 = 0.0F;
	    ((Class225) this).aBool2644 = false;
	    ((Class225) this).anInt2611 = 0;
	    ((Class225) this).aFloat2641 = 1.0F;
	    ((Class225) this).anInterface19_2627 = null;
	    ((Class225) this).anInt2608 = 0;
	    ((Class225) this).anInt2616 = 0;
	    if (null != ((Class225) this).aClass222Array2618) {
		for (int i = 0;
		     i < ((Class225) this).aClass222Array2618.length; i++) {
		    if (((Class225) this).aClass222Array2618[i] != null)
			((Class225) this).aClass222Array2618[i]
			    .method4482(1429986476);
		}
	    }
	    ((Class225) this).aClass222Array2618 = null;
	    ((Class225) this).aBool2652 = false;
	    ((Class225) this).anInt2619 = 0;
	    ((Class225) this).anInt2621 = 0;
	    ((Class225) this).anInt2622 = 0;
	    ((Class225) this).anInt2605 = 0;
	    ((Class225) this).anInt2624 = 0;
	    ((Class225) this).anInt2625 = 0;
	    ((Class225) this).anIntArray2626 = null;
	    ((Class225) this).anIntArray2642 = null;
	    ((Class225) this).anIntArray2628 = null;
	    ((Class225) this).anInt2629 = 0;
	    ((Class225) this).aBool2630 = false;
	    ((Class225) this).anInterface44_2632.method190();
	    ((Class225) this).aBool2606 = false;
	    ((Class225) this).anInterface20_2648 = null;
	    ((Class225) this).anObject2636 = null;
	    ((Class225) this).anInt2637 = 0;
	    ((Class225) this).anInt2638 = 0;
	    ((Class225) this).anInt2639 = 0;
	    ((Class225) this).aBool2645 = false;
	    ((Class225) this).anInt2613 = 0;
	    ((Class225) this).anInt2633 = 0;
	    ((Class225) this).aBool2643 = false;
	    ((Class225) this).anInt2634 = 0;
	    method4518(-1.0F, 439139681);
	    ((Class225) this).aBool2646 = false;
	    ((Class225) this).aFloat2647 = 0.0F;
	    ((Class225) this).aLong2614 = 0L;
	    ((Class225) this).aLong2649 = 0L;
	    ((Class225) this).aFloat2650 = 0.0F;
	    ((Class225) this).anInt2651 = 0;
	    ((Class225) this).anInt2654 = 0;
	}
    }
    
    void method4622() {
	synchronized (this) {
	    ((Class225) this).aByteArray2653 = null;
	    ((Class225) this).anInt2610 = 0;
	    ((Class225) this).aFloat2623 = 0.0F;
	    ((Class225) this).aFloat2615 = 0.0F;
	    ((Class225) this).aBool2644 = false;
	    ((Class225) this).anInt2611 = 0;
	    ((Class225) this).aFloat2641 = 1.0F;
	    ((Class225) this).anInterface19_2627 = null;
	    ((Class225) this).anInt2608 = 0;
	    ((Class225) this).anInt2616 = 0;
	    if (null != ((Class225) this).aClass222Array2618) {
		for (int i = 0;
		     i < ((Class225) this).aClass222Array2618.length; i++) {
		    if (((Class225) this).aClass222Array2618[i] != null)
			((Class225) this).aClass222Array2618[i]
			    .method4482(-40591169);
		}
	    }
	    ((Class225) this).aClass222Array2618 = null;
	    ((Class225) this).aBool2652 = false;
	    ((Class225) this).anInt2619 = 0;
	    ((Class225) this).anInt2621 = 0;
	    ((Class225) this).anInt2622 = 0;
	    ((Class225) this).anInt2605 = 0;
	    ((Class225) this).anInt2624 = 0;
	    ((Class225) this).anInt2625 = 0;
	    ((Class225) this).anIntArray2626 = null;
	    ((Class225) this).anIntArray2642 = null;
	    ((Class225) this).anIntArray2628 = null;
	    ((Class225) this).anInt2629 = 0;
	    ((Class225) this).aBool2630 = false;
	    ((Class225) this).anInterface44_2632.method190();
	    ((Class225) this).aBool2606 = false;
	    ((Class225) this).anInterface20_2648 = null;
	    ((Class225) this).anObject2636 = null;
	    ((Class225) this).anInt2637 = 0;
	    ((Class225) this).anInt2638 = 0;
	    ((Class225) this).anInt2639 = 0;
	    ((Class225) this).aBool2645 = false;
	    ((Class225) this).anInt2613 = 0;
	    ((Class225) this).anInt2633 = 0;
	    ((Class225) this).aBool2643 = false;
	    ((Class225) this).anInt2634 = 0;
	    method4518(-1.0F, 439139681);
	    ((Class225) this).aBool2646 = false;
	    ((Class225) this).aFloat2647 = 0.0F;
	    ((Class225) this).aLong2614 = 0L;
	    ((Class225) this).aLong2649 = 0L;
	    ((Class225) this).aFloat2650 = 0.0F;
	    ((Class225) this).anInt2651 = 0;
	    ((Class225) this).anInt2654 = 0;
	}
    }
    
    void method4623() {
	synchronized (this) {
	    ((Class225) this).aByteArray2653 = null;
	    ((Class225) this).anInt2610 = 0;
	    ((Class225) this).aFloat2623 = 0.0F;
	    ((Class225) this).aFloat2615 = 0.0F;
	    ((Class225) this).aBool2644 = false;
	    ((Class225) this).anInt2611 = 0;
	    ((Class225) this).aFloat2641 = 1.0F;
	    ((Class225) this).anInterface19_2627 = null;
	    ((Class225) this).anInt2608 = 0;
	    ((Class225) this).anInt2616 = 0;
	    if (null != ((Class225) this).aClass222Array2618) {
		for (int i = 0;
		     i < ((Class225) this).aClass222Array2618.length; i++) {
		    if (((Class225) this).aClass222Array2618[i] != null)
			((Class225) this).aClass222Array2618[i]
			    .method4482(-1186663263);
		}
	    }
	    ((Class225) this).aClass222Array2618 = null;
	    ((Class225) this).aBool2652 = false;
	    ((Class225) this).anInt2619 = 0;
	    ((Class225) this).anInt2621 = 0;
	    ((Class225) this).anInt2622 = 0;
	    ((Class225) this).anInt2605 = 0;
	    ((Class225) this).anInt2624 = 0;
	    ((Class225) this).anInt2625 = 0;
	    ((Class225) this).anIntArray2626 = null;
	    ((Class225) this).anIntArray2642 = null;
	    ((Class225) this).anIntArray2628 = null;
	    ((Class225) this).anInt2629 = 0;
	    ((Class225) this).aBool2630 = false;
	    ((Class225) this).anInterface44_2632.method190();
	    ((Class225) this).aBool2606 = false;
	    ((Class225) this).anInterface20_2648 = null;
	    ((Class225) this).anObject2636 = null;
	    ((Class225) this).anInt2637 = 0;
	    ((Class225) this).anInt2638 = 0;
	    ((Class225) this).anInt2639 = 0;
	    ((Class225) this).aBool2645 = false;
	    ((Class225) this).anInt2613 = 0;
	    ((Class225) this).anInt2633 = 0;
	    ((Class225) this).aBool2643 = false;
	    ((Class225) this).anInt2634 = 0;
	    method4518(-1.0F, 439139681);
	    ((Class225) this).aBool2646 = false;
	    ((Class225) this).aFloat2647 = 0.0F;
	    ((Class225) this).aLong2614 = 0L;
	    ((Class225) this).aLong2649 = 0L;
	    ((Class225) this).aFloat2650 = 0.0F;
	    ((Class225) this).anInt2651 = 0;
	    ((Class225) this).anInt2654 = 0;
	}
    }
    
    static final void method4624(ClientScriptData class454, byte i) {
	int i_159_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Character.toUpperCase((char) i_159_);
    }
    
    public static String[] method4625(String string, char c, int i) {
		int i_160_ = ServerConnection.method3909(string, c, (short) 8111);
		String[] strings = new String[i_160_ + 1];
		int i_161_ = 0;
		int i_162_ = 0;
		for (int i_163_ = 0; i_163_ < i_160_; i_163_++) {
		    int i_164_;
		    for (i_164_ = i_162_; string.charAt(i_164_) != c; i_164_++) {
			/* empty */
		    }
		    strings[i_161_++] = string.substring(i_162_, i_164_);
		    i_162_ = i_164_ + 1;
		}
		strings[i_160_] = string.substring(i_162_);
		return strings;
    }
    
    public static byte[] method4626(File file, int i) {
    	return Class54.method1307(file, (int) file.length(), (byte) 2);
    }
    
    static final void storeChannelMinTalk/*method4627*/(ClientScriptData scriptData, byte i) {
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
    			= scriptData.currentChannel.minTalkReq;
    }
    
    static void method4628(int[] is, float[] fs, float[] fs_165_, int i,
			   int i_166_, int i_167_) {
	if (i < i_166_) {
	    int i_168_ = (i + i_166_) / 2;
	    int i_169_ = i;
	    int i_170_ = is[i_168_];
	    is[i_168_] = is[i_166_];
	    is[i_166_] = i_170_;
	    float f = fs[i_168_];
	    fs[i_168_] = fs[i_166_];
	    fs[i_166_] = f;
	    float f_171_ = fs_165_[i_168_];
	    fs_165_[i_168_] = fs_165_[i_166_];
	    fs_165_[i_166_] = f_171_;
	    int i_172_ = 9223372036854775807L == (long) i_170_ ? 0 : 1;
	    for (int i_173_ = i; i_173_ < i_166_; i_173_++) {
		if (is[i_173_] < i_170_ + (i_173_ & i_172_)) {
		    int i_174_ = is[i_173_];
		    is[i_173_] = is[i_169_];
		    is[i_169_] = i_174_;
		    float f_175_ = fs[i_173_];
		    fs[i_173_] = fs[i_169_];
		    fs[i_169_] = f_175_;
		    float f_176_ = fs_165_[i_173_];
		    fs_165_[i_173_] = fs_165_[i_169_];
		    fs_165_[i_169_] = f_176_;
		    i_169_++;
		}
	    }
	    is[i_166_] = is[i_169_];
	    is[i_169_] = i_170_;
	    fs[i_166_] = fs[i_169_];
	    fs[i_169_] = f;
	    fs_165_[i_166_] = fs_165_[i_169_];
	    fs_165_[i_169_] = f_171_;
	    method4628(is, fs, fs_165_, i, i_169_ - 1, 1679576864);
	    method4628(is, fs, fs_165_, 1 + i_169_, i_166_, 1337282486);
	}
    }
}
