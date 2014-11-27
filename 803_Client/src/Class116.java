/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public abstract class Class116
{
    Class55[] aClass55Array1537;
    String aString1538;
    Class80 aClass80_1539;
    Class80 aClass80_1540;
    int anInt1541;
    int anInt1542;
    protected int anInt1543 = -1106389913;
    static Interface2 anInterface2_1544 = new Class59();
    static String aString1545;
    static File cacheDirectory;//aFile1546
    
    public final Class55 method2804(byte i) {
	return (anInt1543 * -1423050583 >= 0
		? ((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
		: null);
    }
    
    public abstract void method2805();
    
    public final int method2806(int i) {
	return ((Class116) this).aClass55Array1537.length;
    }
    
    public final void method2807(int i, Class268 class268) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1324(i, class268);
    }
    
    public String method2808(int i) {
	return ((Class116) this).aString1538;
    }
    
    public int method2809(int i) {
	return ((Class116) this).anInt1541 * -669299639;
    }
    
    public Class55 method2810(String string, byte i)
	throws Exception_Sub7_Sub1 {
	Class55[] class55s = ((Class116) this).aClass55Array1537;
	for (int i_0_ = 0; i_0_ < class55s.length; i_0_++) {
	    Class55 class55 = class55s[i_0_];
	    String string_1_ = class55.method1314((short) 28607);
	    if (null != string_1_ && string_1_.equals(string)) {
		if (!class55.method1311())
		    throw new Exception_Sub7_Sub1(string);
		return class55;
	    }
	}
	throw new Exception_Sub7_Sub1(string);
    }
    
    public Class55 method2811() {
	Class55[] class55s = ((Class116) this).aClass55Array1537;
	for (int i = 0; i < class55s.length; i++) {
	    Class55 class55 = class55s[i];
	    if (class55.method1311())
		return class55;
	}
	return null;
    }
    
    abstract Class55 method2812(Class103_Sub3 class103_sub3,
				Class117 class117);
    
    public int method2813(Class55 class55, byte i) {
	for (int i_2_ = 0; i_2_ < ((Class116) this).aClass55Array1537.length;
	     i_2_++) {
	    if (((Class116) this).aClass55Array1537[i_2_] == class55)
		return i_2_;
	}
	return -1;
    }
    
    public Class55 method2814(int i) {
	Class55[] class55s = ((Class116) this).aClass55Array1537;
	for (int i_3_ = 0; i_3_ < class55s.length; i_3_++) {
	    Class55 class55 = class55s[i_3_];
	    if (class55.method1311())
		return class55;
	}
	return null;
    }
    
    public Class241_Sub23_Sub1 method2815(String string, byte i)
	throws Exception_Sub7_Sub2 {
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class241_Sub23_Sub1)
	       ((Class116) this).aClass80_1539.method1790(string, (byte) 50));
	if (class241_sub23_sub1 == null)
	    throw new Exception_Sub7_Sub2(string);
	return class241_sub23_sub1;
    }
    
    Class116(Class103_Sub3 class103_sub3, Class47 class47) {
	((Class116) this).aString1538 = ((Class47) class47).aString626;
	((Class116) this).anInt1541
	    = -1584765447 * ((Class47) class47).aClass115Array629.length;
	((Class116) this).aClass80_1539
	    = new Class80(((Class116) this).anInt1541 * -669299639,
			  anInterface2_1544);
	for (int i = 0; i < ((Class116) this).anInt1541 * -669299639; i++)
	    ((Class116) this).aClass80_1539.method1796
		(i,
		 (((Class115) ((Class47) class47).aClass115Array629[i])
		  .aString1529),
		 method2896(((Class47) class47).aClass115Array629[i]),
		 (byte) -29);
	((Class116) this).anInt1542
	    = ((Class47) class47).aClass115Array630.length * -1218611459;
	((Class116) this).aClass80_1540
	    = new Class80(-696199595 * ((Class116) this).anInt1542,
			  anInterface2_1544);
	for (int i = 0; i < -696199595 * ((Class116) this).anInt1542; i++)
	    ((Class116) this).aClass80_1540.method1796
		(i,
		 (((Class115) ((Class47) class47).aClass115Array630[i])
		  .aString1529),
		 method2896(((Class47) class47).aClass115Array630[i]),
		 (byte) -18);
	((Class116) this).aClass55Array1537
	    = new Class55[((Class47) class47).aClass117Array631.length];
	for (int i = 0; i < ((Class47) class47).aClass117Array631.length; i++)
	    ((Class116) this).aClass55Array1537[i]
		= method2812(class103_sub3,
			     ((Class47) class47).aClass117Array631[i]);
    }
    
    public final int method2816(int i) {
	return -1423050583 * anInt1543;
    }
    
    public final void method2817(int i, Class268 class268) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1338(i, class268);
    }
    
    public final void method2818(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f, byte i) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1359(class241_sub23_sub1, f);
    }
    
    public final void method2819(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f, float f_4_, int i) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1340(class241_sub23_sub1, f, f_4_);
    }
    
    public final void method2820(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f, float f_5_, float f_6_, int i) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1325(class241_sub23_sub1, f, f_5_, f_6_);
    }
    
    public final void method2821(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f, float f_7_, float f_8_, float f_9_,
				 short i) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1349(class241_sub23_sub1, f, f_7_, f_8_, f_9_);
    }
    
    public final void method2822(Class241_Sub23_Sub1 class241_sub23_sub1,
				 Class287 class287, int i) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543].method1325
	    (class241_sub23_sub1, class287.aFloat4477, class287.aFloat4474,
	     class287.aFloat4479);
    }
    
    public final void method2823(Class241_Sub23_Sub1 class241_sub23_sub1,
				 Class285 class285, int i) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583].method1349
	    (class241_sub23_sub1, class285.aFloat4454, class285.aFloat4452,
	     class285.aFloat4453, class285.aFloat4451);
    }
    
    public Class55 method2824() {
	Class55[] class55s = ((Class116) this).aClass55Array1537;
	for (int i = 0; i < class55s.length; i++) {
	    Class55 class55 = class55s[i];
	    if (class55.method1311())
		return class55;
	}
	return null;
    }
    
    public final void method2825(Class241_Sub23_Sub1 class241_sub23_sub1,
				 int i, int i_10_) {
	float f = (float) (i >> 16 & 0xff) / 255.0F;
	float f_11_ = (float) (i >> 8 & 0xff) / 255.0F;
	float f_12_ = (float) (i & 0xff) / 255.0F;
	float f_13_ = (float) (i >> 24 & 0xff) / 255.0F;
	method2821(class241_sub23_sub1, f, f_11_, f_12_, f_13_,
		   (short) -32014);
    }
    
    public final void method2826(Class241_Sub23_Sub1 class241_sub23_sub1,
				 Class268 class268, int i) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1330(class241_sub23_sub1, class268);
    }
    
    public final void method2827(Class241_Sub23_Sub1 class241_sub23_sub1,
				 int i) {
	float f = (float) (i >> 16 & 0xff) / 255.0F;
	float f_14_ = (float) (i >> 8 & 0xff) / 255.0F;
	float f_15_ = (float) (i & 0xff) / 255.0F;
	float f_16_ = (float) (i >> 24 & 0xff) / 255.0F;
	method2821(class241_sub23_sub1, f, f_14_, f_15_, f_16_, (short) -3120);
    }
    
    public final void method2828(Class241_Sub23_Sub1 class241_sub23_sub1,
				 int i, Interface31 interface31, int i_17_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1319(class241_sub23_sub1, i, interface31);
    }
    
    public final Class55 method2829(int i) {
	return ((Class116) this).aClass55Array1537[i];
    }
    
    public final void method2830(int i, float f, float f_18_, float f_19_,
				 float f_20_, byte i_21_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1329(i, f, f_18_, f_19_, f_20_);
    }
    
    public final void method2831(int i, Class287 class287, byte i_22_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583].method1326
	    (i, class287.aFloat4477, class287.aFloat4474, class287.aFloat4479);
    }
    
    public final void method2832(int i, float[] fs, int i_23_, int i_24_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1322(i, fs, i_23_);
    }
    
    public final void method2833(int i, Class268 class268, byte i_25_) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1323(i, class268);
    }
    
    public final void method2834(int i, Class268 class268, byte i_26_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1338(i, class268);
    }
    
    public Class241_Sub23_Sub1 method2835(String string)
	throws Exception_Sub7_Sub2 {
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class241_Sub23_Sub1)
	       ((Class116) this).aClass80_1539.method1790(string,
							  (byte) -126));
	if (class241_sub23_sub1 == null)
	    throw new Exception_Sub7_Sub2(string);
	return class241_sub23_sub1;
    }
    
    abstract Class55 method2836(Class103_Sub3 class103_sub3,
				Class117 class117);
    
    public final void method2837(Class241_Sub23_Sub1 class241_sub23_sub1,
				 Class268 class268, byte i) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1344(class241_sub23_sub1, class268);
    }
    
    public String method2838() {
	return ((Class116) this).aString1538;
    }
    
    public Class241_Sub23_Sub1 method2839(int i, int i_27_) {
	return ((Class241_Sub23_Sub1)
		((Class116) this).aClass80_1540.method1794(i, -130395094));
    }
    
    public Class241_Sub23_Sub1 method2840(String string, int i) {
	return ((Class241_Sub23_Sub1)
		((Class116) this).aClass80_1540.method1790(string,
							   (byte) -38));
    }
    
    public final void method2841(int i, Class268 class268) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1323(i, class268);
    }
    
    public Class241_Sub23_Sub1 method2842(int i, int i_28_) {
	return ((Class241_Sub23_Sub1)
		((Class116) this).aClass80_1539.method1794(i, 904318975));
    }
    
    public int method2843() {
	return ((Class116) this).anInt1542 * -696199595;
    }
    
    public abstract void method2844();
    
    public abstract void method2845();
    
    public abstract boolean method2846();
    
    public int method2847(Class55 class55) {
	for (int i = 0; i < ((Class116) this).aClass55Array1537.length; i++) {
	    if (((Class116) this).aClass55Array1537[i] == class55)
		return i;
	}
	return -1;
    }
    
    public String method2848() {
	return ((Class116) this).aString1538;
    }
    
    public Class241_Sub23_Sub1 method2849(String string)
	throws Exception_Sub7_Sub2 {
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class241_Sub23_Sub1)
	       ((Class116) this).aClass80_1539.method1790(string, (byte) -24));
	if (class241_sub23_sub1 == null)
	    throw new Exception_Sub7_Sub2(string);
	return class241_sub23_sub1;
    }
    
    public Class55 method2850(String string) throws Exception_Sub7_Sub1 {
	Class55[] class55s = ((Class116) this).aClass55Array1537;
	for (int i = 0; i < class55s.length; i++) {
	    Class55 class55 = class55s[i];
	    String string_29_ = class55.method1314((short) 8869);
	    if (null != string_29_ && string_29_.equals(string)) {
		if (!class55.method1311())
		    throw new Exception_Sub7_Sub1(string);
		return class55;
	    }
	}
	throw new Exception_Sub7_Sub1(string);
    }
    
    public final int method2851() {
	return ((Class116) this).aClass55Array1537.length;
    }
    
    public final int method2852() {
	return ((Class116) this).aClass55Array1537.length;
    }
    
    public final void method2853(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f, float f_30_, float f_31_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1325(class241_sub23_sub1, f, f_30_, f_31_);
    }
    
    public int method2854(Class55 class55) {
	for (int i = 0; i < ((Class116) this).aClass55Array1537.length; i++) {
	    if (((Class116) this).aClass55Array1537[i] == class55)
		return i;
	}
	return -1;
    }
    
    public abstract boolean method2855(Class55 class55);
    
    void method2856() {
	/* empty */
    }
    
    public int method2857(Class55 class55) {
	for (int i = 0; i < ((Class116) this).aClass55Array1537.length; i++) {
	    if (((Class116) this).aClass55Array1537[i] == class55)
		return i;
	}
	return -1;
    }
    
    public final void method2858(Class241_Sub23_Sub1 class241_sub23_sub1,
				 int i, Interface31 interface31) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1319(class241_sub23_sub1, i, interface31);
    }
    
    public int method2859() {
	return ((Class116) this).anInt1541 * -669299639;
    }
    
    public abstract boolean method2860(Class55 class55);
    
    public final void method2861(int i, int i_32_, Interface31 interface31,
				 int i_33_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1312(i, i_32_, interface31);
    }
    
    public Class241_Sub23_Sub1 method2862(String string)
	throws Exception_Sub7_Sub2 {
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class241_Sub23_Sub1)
	       ((Class116) this).aClass80_1539.method1790(string, (byte) -90));
	if (class241_sub23_sub1 == null)
	    throw new Exception_Sub7_Sub2(string);
	return class241_sub23_sub1;
    }
    
    abstract Class241_Sub23_Sub1 method2863(Class115 class115);
    
    public final void method2864(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1359(class241_sub23_sub1, f);
    }
    
    public final void method2865(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1359(class241_sub23_sub1, f);
    }
    
    public final void method2866(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1359(class241_sub23_sub1, f);
    }
    
    public final void method2867(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f, float f_34_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1340(class241_sub23_sub1, f, f_34_);
    }
    
    public final void method2868(int i, Class268 class268) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1338(i, class268);
    }
    
    public final void method2869(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f, float f_35_, float f_36_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1325(class241_sub23_sub1, f, f_35_, f_36_);
    }
    
    public final void method2870(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f, float f_37_, float f_38_,
				 float f_39_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1349(class241_sub23_sub1, f, f_37_, f_38_, f_39_);
    }
    
    public final void method2871(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f, float f_40_, float f_41_,
				 float f_42_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1349(class241_sub23_sub1, f, f_40_, f_41_, f_42_);
    }
    
    public final void method2872(int i, Class268 class268) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1324(i, class268);
    }
    
    public final void method2873(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f, float f_43_, float f_44_,
				 float f_45_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1349(class241_sub23_sub1, f, f_43_, f_44_, f_45_);
    }
    
    public abstract boolean method2874();
    
    public final void method2875(Class241_Sub23_Sub1 class241_sub23_sub1,
				 Class287 class287) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543].method1325
	    (class241_sub23_sub1, class287.aFloat4477, class287.aFloat4474,
	     class287.aFloat4479);
    }
    
    public final void method2876(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float[] fs) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1316(class241_sub23_sub1, fs, fs.length);
    }
    
    public final void method2877(int i, Class268 class268, int i_46_) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1324(i, class268);
    }
    
    public final void method2878(Class241_Sub23_Sub1 class241_sub23_sub1,
				 Class268 class268) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1330(class241_sub23_sub1, class268);
    }
    
    public final void method2879(Class241_Sub23_Sub1 class241_sub23_sub1,
				 Class268 class268) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1344(class241_sub23_sub1, class268);
    }
    
    public final void method2880(Class241_Sub23_Sub1 class241_sub23_sub1,
				 Class268 class268) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1344(class241_sub23_sub1, class268);
    }
    
    public Class241_Sub23_Sub1 method2881(String string)
	throws Exception_Sub7_Sub2 {
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class241_Sub23_Sub1)
	       ((Class116) this).aClass80_1539.method1790(string, (byte) -95));
	if (class241_sub23_sub1 == null)
	    throw new Exception_Sub7_Sub2(string);
	return class241_sub23_sub1;
    }
    
    public final void method2882(Class241_Sub23_Sub1 class241_sub23_sub1,
				 int i, Interface31 interface31) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1319(class241_sub23_sub1, i, interface31);
    }
    
    public final void method2883(int i, float f, float f_47_, float f_48_) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1326(i, f, f_47_, f_48_);
    }
    
    public final void method2884(int i, float f, float f_49_, float f_50_) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1326(i, f, f_49_, f_50_);
    }
    
    public final void method2885(int i, float f, float f_51_, float f_52_,
				 float f_53_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1329(i, f, f_51_, f_52_, f_53_);
    }
    
    public final void method2886(int i, Class287 class287) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583].method1326
	    (i, class287.aFloat4477, class287.aFloat4474, class287.aFloat4479);
    }
    
    public final void method2887(int i, Class287 class287) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583].method1326
	    (i, class287.aFloat4477, class287.aFloat4474, class287.aFloat4479);
    }
    
    public final void method2888(int i, float[] fs, int i_54_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1322(i, fs, i_54_);
    }
    
    public final void method2889(int i, float[] fs, int i_55_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1322(i, fs, i_55_);
    }
    
    public final void method2890(int i, float f, float f_56_, float f_57_,
				 byte i_58_) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1326(i, f, f_56_, f_57_);
    }
    
    public final void method2891(int i, Class268 class268) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1323(i, class268);
    }
    
    public final void method2892(Class241_Sub23_Sub1 class241_sub23_sub1,
				 Class287 class287) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543].method1325
	    (class241_sub23_sub1, class287.aFloat4477, class287.aFloat4474,
	     class287.aFloat4479);
    }
    
    public int method2893() {
	return ((Class116) this).anInt1541 * -669299639;
    }
    
    public final void method2894(int i, Class268 class268) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1338(i, class268);
    }
    
    public abstract boolean method2895(Class55 class55);
    
    abstract Class241_Sub23_Sub1 method2896(Class115 class115);
    
    public final void method2897(int i, Class268 class268) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1324(i, class268);
    }
    
    public final Class55 method2898(int i, int i_59_) {
	return ((Class116) this).aClass55Array1537[i];
    }
    
    public Class241_Sub23_Sub1 method2899(String string)
	throws Exception_Sub7_Sub2 {
	Class241_Sub23_Sub1 class241_sub23_sub1
	    = ((Class241_Sub23_Sub1)
	       ((Class116) this).aClass80_1539.method1790(string, (byte) -45));
	if (class241_sub23_sub1 == null)
	    throw new Exception_Sub7_Sub2(string);
	return class241_sub23_sub1;
    }
    
    public final void method2900(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float f, float f_60_, float f_61_,
				 float f_62_) {
	((Class116) this).aClass55Array1537[anInt1543 * -1423050583]
	    .method1349(class241_sub23_sub1, f, f_60_, f_61_, f_62_);
    }
    
    public int method2901(Class55 class55) {
	for (int i = 0; i < ((Class116) this).aClass55Array1537.length; i++) {
	    if (((Class116) this).aClass55Array1537[i] == class55)
		return i;
	}
	return -1;
    }
    
    public Class241_Sub23_Sub1 method2902(String string) {
	return ((Class241_Sub23_Sub1)
		((Class116) this).aClass80_1540.method1790(string,
							   (byte) -46));
    }
    
    public final int method2903() {
	return -1423050583 * anInt1543;
    }
    
    public int method2904() {
	return ((Class116) this).anInt1542 * -696199595;
    }
    
    public Class241_Sub23_Sub1 method2905(int i) {
	return ((Class241_Sub23_Sub1)
		((Class116) this).aClass80_1540.method1794(i, 489962688));
    }
    
    public Class241_Sub23_Sub1 method2906(String string) {
	return ((Class241_Sub23_Sub1)
		((Class116) this).aClass80_1540.method1790(string, (byte) 81));
    }
    
    public Class241_Sub23_Sub1 method2907(String string) {
	return ((Class241_Sub23_Sub1)
		((Class116) this).aClass80_1540.method1790(string, (byte) 17));
    }
    
    public Class241_Sub23_Sub1 method2908(String string) {
	return ((Class241_Sub23_Sub1)
		((Class116) this).aClass80_1540.method1790(string,
							   (byte) -22));
    }
    
    public int method2909(int i) {
	return ((Class116) this).anInt1542 * -696199595;
    }
    
    public final void method2910(Class241_Sub23_Sub1 class241_sub23_sub1,
				 float[] fs, byte i) {
	((Class116) this).aClass55Array1537[-1423050583 * anInt1543]
	    .method1316(class241_sub23_sub1, fs, fs.length);
    }
    
    public abstract void method2911();
    
    public int method2912() {
	return ((Class116) this).anInt1541 * -669299639;
    }
    
    public Class241_Sub23_Sub1 method2913(int i) {
	return ((Class241_Sub23_Sub1)
		((Class116) this).aClass80_1539.method1794(i, 1882499618));
    }
    
    void method2914() {
	/* empty */
    }
    
    void method2915() {
	/* empty */
    }
    
    void method2916() {
	/* empty */
    }
    
    public static ChatLine method2917(int i, int i_63_, int i_64_) {
	Class41 class41 = (Class41) Class44.aMap610.get(Integer.valueOf(i));
	return class41.method1053(i_63_, -316605693);
    }
    
    static final void method2918(ClientScriptData class454, byte i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class582.method12775(class58, class35, class454, (byte) 43);
    }
    
    static final void method2919(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class527.method11823(class58, class35, class454, (byte) 77);
    }
    
    static final void method2920(ClientScriptData class454, int i)
	throws Exception_Sub5 {
	Class445_Sub16.aClass351_Sub1_8660.method6261
	    ((float) (((ClientScriptData) class454).integerStack
		      [((((ClientScriptData) class454).intStackPointer -= 1736754263)
			* 1482319719)]) / 1000.0F,
	     -366086455);
    }
    
    public static void method2921(String string, String string_65_, int i,
				  boolean bool, String string_66_,
				  byte i_67_) {
	if (8 == client.anInt8288 * 1766317249) {
	    Class241_Sub27 class241_sub27
		= Class445_Sub26.makePacket(OutgoingOpcode.aClass253_4101,
					     (client.aClass190_8339
					      .packetCipher),
					     16711935);
	    class241_sub27.data.writeShort(0, -484048531);
	    int i_68_ = (421967667
			 * class241_sub27.data.pointer);
	    class241_sub27.data.writeString(string,
								1490784723);
	    class241_sub27.data.writeString(string_65_,
								1698789734);
	    class241_sub27.data.writeByte(i, -634819044);
	    class241_sub27.data.writeByte(bool ? 1 : 0,
								-659403564);
	    class241_sub27.data.writeString(string_66_,
								1395723744);
	    class241_sub27.data.pointer += -472333347;
	    class241_sub27.data.method14665
		(Class9.anIntArray50, i_68_,
		 421967667 * class241_sub27.data.pointer,
		 717806523);
	    class241_sub27.data.endPacketVarShort
		((421967667 * class241_sub27.data.pointer
		  - i_68_),
		 (byte) 118);
	    client.aClass190_8339.sendPacket(class241_sub27, -2039655489);
	    if (i < 13) {
		client.aBool8386 = true;
		Class488.method11148(1079378092);
	    }
	    Class9.aClass423_53 = Class423.aClass423_6063;
	}
    }
    
    static final void method2922(ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	Class240.joinFriendsChat(string, (byte) -15);
    }
    
    static final void method2923(ClientScriptData class454, int i) {
	int i_69_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_69_, (byte) -109);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 439139681 * class58.anInt850;
    }
    
    static final void storeClanMinLootshare/*method2924*/(ClientScriptData scriptData, int i) {
    	scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
    			= scriptData.clanSettings.rankLootShare;
    }
}
