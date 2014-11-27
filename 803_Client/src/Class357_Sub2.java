/* Class357_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class357_Sub2 extends Class357
{
    Class168 aClass168_10381;
    Class168 aClass168_10382;
    Class168 aClass168_10383;
    Class168 aClass168_10384;
    Class168 aClass168_10385;
    Class168 aClass168_10386;
    
    void method16680(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
	((Class357_Sub2) this).aClass168_10382.method3603(i, i_0_, i_1_, i_2_);
    }
    
    public void method191(int i) {
	super.method191(-1742682691);
	Class326_Sub1 class326_sub1
	    = (Class326_Sub1) ((Class357_Sub2) this).aClass326_5463;
	((Class357_Sub2) this).aClass168_10382
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   class326_sub1.anInt10202 * 860023435,
				   (short) 19638);
	((Class357_Sub2) this).aClass168_10381
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   1154655587 * class326_sub1.anInt10201,
				   (short) 29610);
	((Class357_Sub2) this).aClass168_10383
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   class326_sub1.anInt10200 * -393748375,
				   (short) 9297);
	((Class357_Sub2) this).aClass168_10384
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   -1457812133 * class326_sub1.anInt10198,
				   (short) 25843);
	((Class357_Sub2) this).aClass168_10385
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   750680363 * class326_sub1.anInt10203,
				   (short) 5831);
	((Class357_Sub2) this).aClass168_10386
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   -644451775 * class326_sub1.anInt10199,
				   (short) 29332);
    }
    
    void method6453(boolean bool, int i, int i_4_, int i_5_) {
	if (bool) {
	    int[] is = new int[4];
	    Class236.aClass103_2713.method2260(is);
	    Class236.aClass103_2713.method2445
		(i, i_4_,
		 (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457
		  + i),
		 i_4_ + (((Class357_Sub2) this).aClass326_5463.anInt5011
			 * 524993587));
	    int i_6_ = ((Class357_Sub2) this).aClass168_10383.method64();
	    int i_7_ = ((Class357_Sub2) this).aClass168_10383.method3616();
	    int i_8_ = ((Class357_Sub2) this).aClass168_10384.method64();
	    int i_9_ = ((Class357_Sub2) this).aClass168_10384.method3616();
	    ((Class357_Sub2) this).aClass168_10383.method3646
		(i,
		 (((Class357_Sub2) this).aClass326_5463.anInt5011 * 524993587
		  - i_7_) / 2 + i_4_);
	    ((Class357_Sub2) this).aClass168_10384.method3646
		(i + (((Class357_Sub2) this).aClass326_5463.anInt5006
		      * -664032457) - i_8_,
		 i_4_ + ((((Class357_Sub2) this).aClass326_5463.anInt5011
			  * 524993587)
			 - i_9_) / 2);
	    Class236.aClass103_2713.method2445
		(i, i_4_,
		 (-664032457 * ((Class357_Sub2) this).aClass326_5463.anInt5006
		  + i),
		 i_4_ + ((Class357_Sub2) this).aClass168_10385.method3616());
	    ((Class357_Sub2) this).aClass168_10385.method3603
		(i + i_6_, i_4_,
		 (-664032457 * ((Class357_Sub2) this).aClass326_5463.anInt5006
		  - i_6_ - i_8_),
		 ((Class357_Sub2) this).aClass326_5463.anInt5011 * 524993587);
	    int i_10_ = ((Class357_Sub2) this).aClass168_10386.method3616();
	    Class236.aClass103_2713.method2445
		(i,
		 (i_4_
		  + 524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011
		  - i_10_),
		 (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457
		  + i),
		 (((Class357_Sub2) this).aClass326_5463.anInt5011 * 524993587
		  + i_4_));
	    ((Class357_Sub2) this).aClass168_10386.method3603
		(i_6_ + i,
		 (524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011
		  + i_4_ - i_10_),
		 (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457
		  - i_6_ - i_8_),
		 524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011);
	    Class236.aClass103_2713.method2445(is[0], is[1], is[2], is[3]);
	}
    }
    
    void method6456(boolean bool, int i, int i_11_) {
	int i_12_ = i + ((Class357_Sub2) this).aClass168_10383.method64();
	int i_13_
	    = (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457 + i
	       - ((Class357_Sub2) this).aClass168_10384.method64());
	int i_14_
	    = i_11_ + ((Class357_Sub2) this).aClass168_10385.method3616();
	int i_15_
	    = (524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011
	       + i_11_ - ((Class357_Sub2) this).aClass168_10386.method3616());
	int i_16_ = i_13_ - i_12_;
	int i_17_ = i_15_ - i_14_;
	int i_18_ = method6455((byte) -63) * i_16_ / 10000;
	int[] is = new int[4];
	Class236.aClass103_2713.method2260(is);
	Class236.aClass103_2713.method2445(i_12_, i_14_, i_18_ + i_12_, i_15_);
	method16680(i_12_, i_14_, i_16_, i_17_, (byte) -37);
	Class236.aClass103_2713.method2445(i_12_ + i_18_, i_14_, i_13_, i_15_);
	((Class357_Sub2) this).aClass168_10381.method3603(i_12_, i_14_, i_16_,
							  i_17_);
	Class236.aClass103_2713.method2445(is[0], is[1], is[2], is[3]);
    }
    
    Class357_Sub2(JS5 class210, JS5 class210_19_,
		  Class326_Sub1 class326_sub1) {
	super(class210, class210_19_, (Class326) class326_sub1);
    }
    
    public boolean method107(int i) {
	if (!super.method107(1798668947))
	    return false;
	Class326_Sub1 class326_sub1
	    = (Class326_Sub1) ((Class357_Sub2) this).aClass326_5463;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(860023435 * class326_sub1.anInt10202, -543418769))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250(((class326_sub1
								.anInt10201)
							       * 1154655587),
							      -100270966))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(-393748375 * class326_sub1.anInt10200, 170773272))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250
	     (-1457812133 * class326_sub1.anInt10198, 1056037931))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(class326_sub1.anInt10203 * 750680363, 2126169464))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250(((class326_sub1
								.anInt10199)
							       * -644451775),
							      2016331825))
	    return false;
	return true;
    }
    
    void method16681(int i, int i_20_, int i_21_, int i_22_) {
	((Class357_Sub2) this).aClass168_10382.method3603(i, i_20_, i_21_,
							  i_22_);
    }
    
    void method6458(boolean bool, int i, int i_23_) {
	int i_24_ = i + ((Class357_Sub2) this).aClass168_10383.method64();
	int i_25_
	    = (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457 + i
	       - ((Class357_Sub2) this).aClass168_10384.method64());
	int i_26_
	    = i_23_ + ((Class357_Sub2) this).aClass168_10385.method3616();
	int i_27_
	    = (524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011
	       + i_23_ - ((Class357_Sub2) this).aClass168_10386.method3616());
	int i_28_ = i_25_ - i_24_;
	int i_29_ = i_27_ - i_26_;
	int i_30_ = method6455((byte) -102) * i_28_ / 10000;
	int[] is = new int[4];
	Class236.aClass103_2713.method2260(is);
	Class236.aClass103_2713.method2445(i_24_, i_26_, i_30_ + i_24_, i_27_);
	method16680(i_24_, i_26_, i_28_, i_29_, (byte) 14);
	Class236.aClass103_2713.method2445(i_24_ + i_30_, i_26_, i_25_, i_27_);
	((Class357_Sub2) this).aClass168_10381.method3603(i_24_, i_26_, i_28_,
							  i_29_);
	Class236.aClass103_2713.method2445(is[0], is[1], is[2], is[3]);
    }
    
    public boolean method114() {
	if (!super.method107(597415456))
	    return false;
	Class326_Sub1 class326_sub1
	    = (Class326_Sub1) ((Class357_Sub2) this).aClass326_5463;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(860023435 * class326_sub1.anInt10202, -641251753))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250(((class326_sub1
								.anInt10201)
							       * 1154655587),
							      -571573187))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(-393748375 * class326_sub1.anInt10200, 328920759))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250
	     (-1457812133 * class326_sub1.anInt10198, 1357519427))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(class326_sub1.anInt10203 * 750680363, -312819126))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(class326_sub1.anInt10199 * -644451775, 911271941))
	    return false;
	return true;
    }
    
    public boolean method117() {
	if (!super.method107(631142584))
	    return false;
	Class326_Sub1 class326_sub1
	    = (Class326_Sub1) ((Class357_Sub2) this).aClass326_5463;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(860023435 * class326_sub1.anInt10202, -75884983))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(class326_sub1.anInt10201 * 1154655587, 190011075))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(-393748375 * class326_sub1.anInt10200, -47050627))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250
	     (-1457812133 * class326_sub1.anInt10198, 572976005))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(class326_sub1.anInt10203 * 750680363, 215650478))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250(((class326_sub1
								.anInt10199)
							       * -644451775),
							      -366278920))
	    return false;
	return true;
    }
    
    public boolean method217() {
	if (!super.method107(-281055848))
	    return false;
	Class326_Sub1 class326_sub1
	    = (Class326_Sub1) ((Class357_Sub2) this).aClass326_5463;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(860023435 * class326_sub1.anInt10202, 1419188304))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250(((class326_sub1
								.anInt10201)
							       * 1154655587),
							      -657448661))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250
	     (-393748375 * class326_sub1.anInt10200, 1460867356))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250
	     (-1457812133 * class326_sub1.anInt10198, 1543714813))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(class326_sub1.anInt10203 * 750680363, 1209968709))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250(((class326_sub1
								.anInt10199)
							       * -644451775),
							      -416555284))
	    return false;
	return true;
    }
    
    public boolean method218() {
	if (!super.method107(1735648849))
	    return false;
	Class326_Sub1 class326_sub1
	    = (Class326_Sub1) ((Class357_Sub2) this).aClass326_5463;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(860023435 * class326_sub1.anInt10202, 2046903109))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(class326_sub1.anInt10201 * 1154655587, 827629876))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250
	     (-393748375 * class326_sub1.anInt10200, 1751790081))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250
	     (-1457812133 * class326_sub1.anInt10198, 681642329))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465
		 .method4250(class326_sub1.anInt10203 * 750680363, 1784230391))
	    return false;
	if (!((Class357_Sub2) this).aClass210_5465.method4250(((class326_sub1
								.anInt10199)
							       * -644451775),
							      -628739434))
	    return false;
	return true;
    }
    
    void method6454(boolean bool, int i, int i_31_, int i_32_) {
	int i_33_ = i + ((Class357_Sub2) this).aClass168_10383.method64();
	int i_34_
	    = (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457 + i
	       - ((Class357_Sub2) this).aClass168_10384.method64());
	int i_35_
	    = i_31_ + ((Class357_Sub2) this).aClass168_10385.method3616();
	int i_36_
	    = (524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011
	       + i_31_ - ((Class357_Sub2) this).aClass168_10386.method3616());
	int i_37_ = i_34_ - i_33_;
	int i_38_ = i_36_ - i_35_;
	int i_39_ = method6455((byte) -93) * i_37_ / 10000;
	int[] is = new int[4];
	Class236.aClass103_2713.method2260(is);
	Class236.aClass103_2713.method2445(i_33_, i_35_, i_39_ + i_33_, i_36_);
	method16680(i_33_, i_35_, i_37_, i_38_, (byte) 23);
	Class236.aClass103_2713.method2445(i_33_ + i_39_, i_35_, i_34_, i_36_);
	((Class357_Sub2) this).aClass168_10381.method3603(i_33_, i_35_, i_37_,
							  i_38_);
	Class236.aClass103_2713.method2445(is[0], is[1], is[2], is[3]);
    }
    
    public void method27() {
	super.method191(-1742682691);
	Class326_Sub1 class326_sub1
	    = (Class326_Sub1) ((Class357_Sub2) this).aClass326_5463;
	((Class357_Sub2) this).aClass168_10382
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   class326_sub1.anInt10202 * 860023435,
				   (short) 16519);
	((Class357_Sub2) this).aClass168_10381
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   1154655587 * class326_sub1.anInt10201,
				   (short) 1085);
	((Class357_Sub2) this).aClass168_10383
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   class326_sub1.anInt10200 * -393748375,
				   (short) 22517);
	((Class357_Sub2) this).aClass168_10384
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   -1457812133 * class326_sub1.anInt10198,
				   (short) 23488);
	((Class357_Sub2) this).aClass168_10385
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   750680363 * class326_sub1.anInt10203,
				   (short) 8606);
	((Class357_Sub2) this).aClass168_10386
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   -644451775 * class326_sub1.anInt10199,
				   (short) 842);
    }
    
    void method6459(boolean bool, int i, int i_40_) {
	int i_41_ = i + ((Class357_Sub2) this).aClass168_10383.method64();
	int i_42_
	    = (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457 + i
	       - ((Class357_Sub2) this).aClass168_10384.method64());
	int i_43_
	    = i_40_ + ((Class357_Sub2) this).aClass168_10385.method3616();
	int i_44_
	    = (524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011
	       + i_40_ - ((Class357_Sub2) this).aClass168_10386.method3616());
	int i_45_ = i_42_ - i_41_;
	int i_46_ = i_44_ - i_43_;
	int i_47_ = method6455((byte) -6) * i_45_ / 10000;
	int[] is = new int[4];
	Class236.aClass103_2713.method2260(is);
	Class236.aClass103_2713.method2445(i_41_, i_43_, i_47_ + i_41_, i_44_);
	method16680(i_41_, i_43_, i_45_, i_46_, (byte) -4);
	Class236.aClass103_2713.method2445(i_41_ + i_47_, i_43_, i_42_, i_44_);
	((Class357_Sub2) this).aClass168_10381.method3603(i_41_, i_43_, i_45_,
							  i_46_);
	Class236.aClass103_2713.method2445(is[0], is[1], is[2], is[3]);
    }
    
    void method6460(boolean bool, int i, int i_48_) {
	if (bool) {
	    int[] is = new int[4];
	    Class236.aClass103_2713.method2260(is);
	    Class236.aClass103_2713.method2445
		(i, i_48_,
		 (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457
		  + i),
		 i_48_ + (((Class357_Sub2) this).aClass326_5463.anInt5011
			  * 524993587));
	    int i_49_ = ((Class357_Sub2) this).aClass168_10383.method64();
	    int i_50_ = ((Class357_Sub2) this).aClass168_10383.method3616();
	    int i_51_ = ((Class357_Sub2) this).aClass168_10384.method64();
	    int i_52_ = ((Class357_Sub2) this).aClass168_10384.method3616();
	    ((Class357_Sub2) this).aClass168_10383.method3646
		(i,
		 (((Class357_Sub2) this).aClass326_5463.anInt5011 * 524993587
		  - i_50_) / 2 + i_48_);
	    ((Class357_Sub2) this).aClass168_10384.method3646
		(i + (((Class357_Sub2) this).aClass326_5463.anInt5006
		      * -664032457) - i_51_,
		 i_48_ + ((((Class357_Sub2) this).aClass326_5463.anInt5011
			   * 524993587)
			  - i_52_) / 2);
	    Class236.aClass103_2713.method2445
		(i, i_48_,
		 (-664032457 * ((Class357_Sub2) this).aClass326_5463.anInt5006
		  + i),
		 i_48_ + ((Class357_Sub2) this).aClass168_10385.method3616());
	    ((Class357_Sub2) this).aClass168_10385.method3603
		(i + i_49_, i_48_,
		 (-664032457 * ((Class357_Sub2) this).aClass326_5463.anInt5006
		  - i_49_ - i_51_),
		 ((Class357_Sub2) this).aClass326_5463.anInt5011 * 524993587);
	    int i_53_ = ((Class357_Sub2) this).aClass168_10386.method3616();
	    Class236.aClass103_2713.method2445
		(i,
		 (i_48_
		  + 524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011
		  - i_53_),
		 (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457
		  + i),
		 (((Class357_Sub2) this).aClass326_5463.anInt5011 * 524993587
		  + i_48_));
	    ((Class357_Sub2) this).aClass168_10386.method3603
		(i_49_ + i,
		 (524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011
		  + i_48_ - i_53_),
		 (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457
		  - i_49_ - i_51_),
		 524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011);
	    Class236.aClass103_2713.method2445(is[0], is[1], is[2], is[3]);
	}
    }
    
    void method6461(boolean bool, int i, int i_54_) {
	if (bool) {
	    int[] is = new int[4];
	    Class236.aClass103_2713.method2260(is);
	    Class236.aClass103_2713.method2445
		(i, i_54_,
		 (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457
		  + i),
		 i_54_ + (((Class357_Sub2) this).aClass326_5463.anInt5011
			  * 524993587));
	    int i_55_ = ((Class357_Sub2) this).aClass168_10383.method64();
	    int i_56_ = ((Class357_Sub2) this).aClass168_10383.method3616();
	    int i_57_ = ((Class357_Sub2) this).aClass168_10384.method64();
	    int i_58_ = ((Class357_Sub2) this).aClass168_10384.method3616();
	    ((Class357_Sub2) this).aClass168_10383.method3646
		(i,
		 (((Class357_Sub2) this).aClass326_5463.anInt5011 * 524993587
		  - i_56_) / 2 + i_54_);
	    ((Class357_Sub2) this).aClass168_10384.method3646
		(i + (((Class357_Sub2) this).aClass326_5463.anInt5006
		      * -664032457) - i_57_,
		 i_54_ + ((((Class357_Sub2) this).aClass326_5463.anInt5011
			   * 524993587)
			  - i_58_) / 2);
	    Class236.aClass103_2713.method2445
		(i, i_54_,
		 (-664032457 * ((Class357_Sub2) this).aClass326_5463.anInt5006
		  + i),
		 i_54_ + ((Class357_Sub2) this).aClass168_10385.method3616());
	    ((Class357_Sub2) this).aClass168_10385.method3603
		(i + i_55_, i_54_,
		 (-664032457 * ((Class357_Sub2) this).aClass326_5463.anInt5006
		  - i_55_ - i_57_),
		 ((Class357_Sub2) this).aClass326_5463.anInt5011 * 524993587);
	    int i_59_ = ((Class357_Sub2) this).aClass168_10386.method3616();
	    Class236.aClass103_2713.method2445
		(i,
		 (i_54_
		  + 524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011
		  - i_59_),
		 (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457
		  + i),
		 (((Class357_Sub2) this).aClass326_5463.anInt5011 * 524993587
		  + i_54_));
	    ((Class357_Sub2) this).aClass168_10386.method3603
		(i_55_ + i,
		 (524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011
		  + i_54_ - i_59_),
		 (((Class357_Sub2) this).aClass326_5463.anInt5006 * -664032457
		  - i_55_ - i_57_),
		 524993587 * ((Class357_Sub2) this).aClass326_5463.anInt5011);
	    Class236.aClass103_2713.method2445(is[0], is[1], is[2], is[3]);
	}
    }
    
    public void method29() {
	super.method191(-1742682691);
	Class326_Sub1 class326_sub1
	    = (Class326_Sub1) ((Class357_Sub2) this).aClass326_5463;
	((Class357_Sub2) this).aClass168_10382
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   class326_sub1.anInt10202 * 860023435,
				   (short) 2890);
	((Class357_Sub2) this).aClass168_10381
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   1154655587 * class326_sub1.anInt10201,
				   (short) 6661);
	((Class357_Sub2) this).aClass168_10383
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   class326_sub1.anInt10200 * -393748375,
				   (short) 829);
	((Class357_Sub2) this).aClass168_10384
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   -1457812133 * class326_sub1.anInt10198,
				   (short) 7245);
	((Class357_Sub2) this).aClass168_10385
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   750680363 * class326_sub1.anInt10203,
				   (short) 12485);
	((Class357_Sub2) this).aClass168_10386
	    = Class570.method12518(((Class357_Sub2) this).aClass210_5465,
				   -644451775 * class326_sub1.anInt10199,
				   (short) 16377);
    }
}
