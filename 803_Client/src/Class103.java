/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class103
{
    public static final int anInt1449 = 2;
    public static final int anInt1450 = 1;
    protected static final int anInt1451 = 8;
    protected Class105_Sub1 aClass105_Sub1_1452;
    public static final int anInt1453 = 5;
    static final int anInt1454 = 8;
    static final int anInt1455 = 4;
    public int anInt1456;
    public Interface6 anInterface6_1457;
    public Class107 aClass107_1458;
    public static final int anInt1459 = 0;
    public static final int anInt1460 = 1;
    public static final int anInt1461 = 2;
    protected static final int anInt1462 = 1;
    public static final int anInt1463 = 3;
    protected static final int anInt1464 = 4;
    public static final int anInt1465 = 0;
    protected static final int anInt1466 = 16;
    protected static final int anInt1467 = 32;
    protected static final int anInt1468 = 2;
    int anInt1469 = 1986435935;
    protected Class105 aClass105_1470;
    static boolean[] aBoolArray1471 = new boolean[8];
    protected Hashtable aHashtable1472 = new Hashtable();
    Class105_Sub2[] aClass105_Sub2Array1473 = new Class105_Sub2[4];
    
    public abstract boolean method2215();
    
    Class103(Class107 class107, Interface6 interface6) {
	aClass107_1458 = class107;
	anInterface6_1457 = interface6;
	int i = -1;
	for (int i_0_ = 0; i_0_ < 8; i_0_++) {
	    if (!aBoolArray1471[i_0_]) {
		aBoolArray1471[i_0_] = true;
		i = i_0_;
		break;
	    }
	}
	if (-1 == i)
	    throw new IllegalStateException("");
	anInt1456 = -1640076147 * i;
    }
    
    public void method2216() {
	/* empty */
    }
    
    public final void method2217(byte i) throws Exception_Sub2 {
	method2218(0, 0);
    }
    
    abstract void method2218(int i, int i_1_) throws Exception_Sub2;
    
    public void method2219() {
	aBoolArray1471[1931687493 * anInt1456] = false;
	Enumeration enumeration = aHashtable1472.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    Class105_Sub1 class105_sub1
		= (Class105_Sub1) aHashtable1472.get(canvas);
	    class105_sub1.method28();
	}
	method2221();
    }
    
    public void method2220(byte i) {
	aBoolArray1471[1931687493 * anInt1456] = false;
	Enumeration enumeration = aHashtable1472.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    Class105_Sub1 class105_sub1
		= (Class105_Sub1) aHashtable1472.get(canvas);
	    class105_sub1.method28();
	}
	method2221();
    }
    
    abstract void method2221();
    
    public abstract void method2222(int i);
    
    public abstract void method2223(int i, int i_2_, int i_3_);
    
    public abstract boolean method2224();
    
    public abstract boolean method2225();
    
    public abstract Class268 method2226();
    
    public abstract void method2227(int i, float f, float f_4_, float f_5_,
				    float f_6_, float f_7_);
    
    public abstract void method2228(Class241_Sub47 class241_sub47);
    
    public abstract void method2229(int i, int i_8_, int i_9_, int i_10_,
				    int i_11_, int i_12_, Class135 class135,
				    int i_13_, int i_14_);
    
    public abstract Class266 method2230();
    
    public abstract void method2231(int i, int i_15_, int i_16_, int i_17_,
				    int i_18_, int i_19_, Class135 class135,
				    int i_20_, int i_21_);
    
    public abstract boolean method2232();
    
    public abstract Class266 method2233();
    
    public abstract boolean method2234();
    
    public abstract void method2235();
    
    public void method2236(int[] is) {
	if (null != aClass105_Sub1_1452) {
	    is[0] = aClass105_Sub1_1452.method2655();
	    is[1] = aClass105_Sub1_1452.method2654();
	} else {
	    int[] is_22_ = is;
	    is[1] = 0;
	    is_22_[0] = 0;
	}
    }
    
    public final Class105 method2237(byte i) {
	return aClass105_1470;
    }
    
    public void method2238() {
	aBoolArray1471[1931687493 * anInt1456] = false;
	Enumeration enumeration = aHashtable1472.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    Class105_Sub1 class105_sub1
		= (Class105_Sub1) aHashtable1472.get(canvas);
	    class105_sub1.method28();
	}
	method2221();
    }
    
    public final void method2239(Canvas canvas, int i, int i_23_, int i_24_) {
	if (!aHashtable1472.containsKey(canvas)) {
	    Class540.method11932(canvas, -1944253770);
	    method2240(canvas, method2246(canvas, i, i_23_), 1455428848);
	}
    }
    
    final void method2240(Canvas canvas, Class105_Sub1 class105_sub1, int i) {
	if (class105_sub1 == null)
	    throw new RuntimeException("");
	aHashtable1472.put(canvas, class105_sub1);
    }
    
    public final void method2241(int i, int i_25_, int i_26_, int i_27_,
				 int i_28_) {
	method2273(i, i_25_, i_26_, i_27_, 1);
    }
    
    public final void method2242(Canvas canvas, int i) {
	Class105_Sub1 class105_sub1
	    = (Class105_Sub1) aHashtable1472.get(canvas);
	if (class105_sub1 == null)
	    throw new RuntimeException();
	if (-891977887 * ((Class103) this).anInt1469 > 0
	    || aClass105_1470 != aClass105_Sub1_1452)
	    throw new RuntimeException();
	if (null != aClass105_1470)
	    aClass105_1470.method2659();
	if (-891977887 * ((Class103) this).anInt1469 < 0)
	    aClass105_1470 = class105_sub1;
	aClass105_Sub1_1452 = class105_sub1;
	class105_sub1.method162();
    }
    
    public final Class105 method2243() {
	return aClass105_1470;
    }
    
    public final void method2244(Class105_Sub2 class105_sub2, int i) {
	if (((Class103) this).anInt1469 * -891977887 >= 3)
	    throw new RuntimeException();
	if (((Class103) this).anInt1469 * -891977887 >= 0)
	    ((Class103) this).aClass105_Sub2Array1473
		[((Class103) this).anInt1469 * -891977887].method2659();
	else
	    aClass105_Sub1_1452.method2659();
	aClass105_1470
	    = ((Class103) this).aClass105_Sub2Array1473
		  [(((Class103) this).anInt1469 += -1986435935) * -891977887]
	    = class105_sub2;
	class105_sub2.method162();
    }
    
    public final void method2245(Class105_Sub2 class105_sub2, int i) {
	if (((Class103) this).anInt1469 * -891977887 < 0
	    || (((Class103) this).aClass105_Sub2Array1473
		[-891977887 * ((Class103) this).anInt1469]) != class105_sub2)
	    throw new RuntimeException();
	((Class103) this).aClass105_Sub2Array1473
	    [(((Class103) this).anInt1469 -= -1986435935) * -891977887 + 1]
	    = null;
	class105_sub2.method2659();
	if (-891977887 * ((Class103) this).anInt1469 >= 0) {
	    aClass105_1470 = (((Class103) this).aClass105_Sub2Array1473
			      [((Class103) this).anInt1469 * -891977887]);
	    ((Class103) this).aClass105_Sub2Array1473
		[-891977887 * ((Class103) this).anInt1469].method162();
	} else {
	    aClass105_1470 = aClass105_Sub1_1452;
	    aClass105_Sub1_1452.method162();
	}
    }
    
    abstract Class105_Sub1 method2246(Canvas canvas, int i, int i_29_);
    
    public final void method2247(int i, int i_30_, int i_31_, int i_32_) {
	method2543(i, i_30_, i_31_, i_32_, 1);
    }
    
    public abstract Class105_Sub2 method2248();
    
    public abstract Interface5 method2249(int i, int i_33_);
    
    public abstract Class135 method2250(int i, int i_34_, int[] is,
					int[] is_35_);
    
    public abstract int[] method2251(int i, int i_36_, int i_37_, int i_38_);
    
    public abstract void method2252();
    
    public abstract boolean method2253();
    
    public abstract void method2254(int i, int i_39_, int i_40_, int i_41_);
    
    public abstract void method2255(float f, float f_42_);
    
    public abstract boolean method2256();
    
    public abstract Class166 method2257(int i, int i_43_, int[][] is,
					int[][] is_44_, int i_45_, int i_46_,
					int i_47_);
    
    public abstract void method2258(int i, int i_48_, int i_49_, int i_50_);
    
    public Class168 method2259(int[] is, int i, int i_51_, int i_52_,
			       int i_53_, byte i_54_) {
	return method2287(is, i, i_51_, i_52_, i_53_, true);
    }
    
    public abstract void method2260(int[] is);
    
    public abstract void method2261();
    
    public final void method2262(int i, int i_55_, int i_56_, int i_57_,
				 int i_58_, int i_59_) {
	method2268(i, i_55_, i_56_, i_57_, i_58_, 1);
    }
    
    public final void method2263(int i, int i_60_, int i_61_, int i_62_,
				 int i_63_, byte i_64_) {
	method2396(i, i_60_, i_61_, i_62_, i_63_, 1);
    }
    
    public final void method2264(int i, int i_65_, int i_66_, int i_67_,
				 byte i_68_) {
	method2543(i, i_65_, i_66_, i_67_, 1);
    }
    
    public final void method2265(int i, int i_69_, int i_70_, int i_71_,
				 int i_72_) {
	method2272(i, i_69_, i_70_, i_71_, 1);
    }
    
    public static boolean method2266(int i) {
	return i == 0 || i == 2;
    }
    
    abstract void method2267(int i, int i_73_, int i_74_, int i_75_,
			     int i_76_);
    
    public abstract void method2268(int i, int i_77_, int i_78_, int i_79_,
				    int i_80_, int i_81_);
    
    public void method2269() {
	/* empty */
    }
    
    public abstract void method2270(int i, int i_82_, float f, int i_83_,
				    int i_84_, float f_85_, int i_86_,
				    int i_87_, float f_88_, int i_89_,
				    int i_90_, int i_91_, int i_92_);
    
    public abstract boolean method2271();
    
    abstract void method2272(int i, int i_93_, int i_94_, int i_95_,
			     int i_96_);
    
    abstract void method2273(int i, int i_97_, int i_98_, int i_99_,
			     int i_100_);
    
    public abstract void method2274(int i, int i_101_, int i_102_, int i_103_,
				    int i_104_, int i_105_);
    
    public abstract Class168 method2275(int i, int i_106_, boolean bool,
					boolean bool_107_);
    
    public abstract void method2276(int i, int i_108_, int i_109_, int i_110_,
				    int i_111_, int i_112_, int i_113_,
				    int i_114_, int i_115_);
    
    abstract Class105_Sub1 method2277(Canvas canvas, int i, int i_116_);
    
    public abstract void method2278(int i, int i_117_, int i_118_, int i_119_,
				    int i_120_, int i_121_, int i_122_);
    
    public void method2279(boolean bool) {
	/* empty */
    }
    
    public boolean method2280(int i, int i_123_, Class266 class266,
			      Class272 class272, byte i_124_) {
	return method2434(i, i_123_, 0, 0, class266, class272);
    }
    
    public final void method2281(Canvas canvas) {
	if (aHashtable1472.containsKey(canvas)) {
	    Class105_Sub1 class105_sub1
		= (Class105_Sub1) aHashtable1472.get(canvas);
	    class105_sub1.method28();
	    aHashtable1472.remove(canvas);
	}
    }
    
    public abstract void method2282(Class266 class266, Class97 class97,
				    Class272 class272);
    
    public abstract Class241_Sub47 method2283(int i);
    
    public abstract String method2284();
    
    public Class168 method2285(int i, int i_125_, boolean bool, int i_126_) {
	return method2590(i, i_125_, bool, false);
    }
    
    public abstract boolean method2286();
    
    public abstract Class168 method2287(int[] is, int i, int i_127_,
					int i_128_, int i_129_, boolean bool);
    
    public abstract boolean method2288();
    
    public abstract Class168 method2289(Class108 class108, boolean bool);
    
    public abstract Class168 method2290(int i, int i_130_, int i_131_,
					int i_132_, boolean bool);
    
    public void method2291() {
	/* empty */
    }
    
    public void method2292() {
	/* empty */
    }
    
    public void method2293() {
	/* empty */
    }
    
    public abstract Class168 method2294(int i, int i_133_, int i_134_,
					int i_135_, boolean bool);
    
    public abstract void method2295();
    
    public abstract Class96 method2296(Class639 class639, Class108[] class108s,
				       boolean bool);
    
    public abstract void method2297(int i, int i_136_, int i_137_, int i_138_,
				    int i_139_, int i_140_, Class135 class135,
				    int i_141_, int i_142_, int i_143_,
				    int i_144_, int i_145_);
    
    public abstract void method2298(int i, int i_146_, float f, int i_147_,
				    int i_148_, float f_149_, int i_150_,
				    int i_151_, float f_152_, int i_153_,
				    int i_154_, int i_155_, int i_156_);
    
    public abstract void method2299(int i);
    
    public final void method2300(int i, int i_157_, int i_158_, int i_159_) {
	method2273(i, i_157_, i_158_, i_159_, 1);
    }
    
    public abstract int method2301(int i, int i_160_);
    
    public abstract int method2302(int i, int i_161_);
    
    public abstract Class166 method2303(int i, int i_162_, int[][] is,
					int[][] is_163_, int i_164_,
					int i_165_, int i_166_);
    
    public boolean method2304(int i) {
	return true;
    }
    
    public abstract void method2305(Class98 class98);
    
    public abstract int method2306();
    
    public abstract Class266 method2307();
    
    public abstract void method2308(boolean bool);
    
    public abstract void method2309(Class268 class268);
    
    public abstract Class268 method2310();
    
    public abstract void method2311(float f);
    
    abstract void method2312(float f, float f_167_, float f_168_, float f_169_,
			     float f_170_, float f_171_);
    
    public abstract void method2313(int i);
    
    public abstract void method2314(int i, int i_172_, int i_173_);
    
    public abstract int method2315();
    
    public Class241_Sub43 method2316(int i, int i_174_, int i_175_, int i_176_,
				     int i_177_, float f) {
	return new Class241_Sub43(i, i_174_, i_175_, i_176_, i_177_, f);
    }
    
    public abstract void method2317(int i, Class241_Sub43[] class241_sub43s);
    
    public abstract Class266 method2318();
    
    public abstract Class88 method2319(Class88 class88, Class88 class88_178_,
				       float f, Class88 class88_179_);
    
    public abstract void method2320(float f, float f_180_, float f_181_,
				    float[] fs);
    
    public abstract void method2321(int i, int i_182_, int i_183_, int i_184_);
    
    public abstract void method2322();
    
    public abstract boolean method2323();
    
    public abstract void method2324(int i, int i_185_, int i_186_, int i_187_);
    
    public abstract void method2325(float f, float f_188_, float f_189_,
				    float f_190_, float f_191_);
    
    public abstract Class180 method2326(int[] is);
    
    public abstract Class180 method2327(int[] is);
    
    public abstract void method2328(Class180 class180, float f,
				    Class180 class180_192_, float f_193_,
				    Class180 class180_194_, float f_195_);
    
    public abstract boolean method2329();
    
    public abstract boolean method2330();
    
    public abstract boolean method2331();
    
    public void method2332(float f, float f_196_, float f_197_, byte i) {
	method2333(f, f_196_, f_197_, 0.0F, 1.0F, 1.0F);
    }
    
    abstract void method2333(float f, float f_198_, float f_199_, float f_200_,
			     float f_201_, float f_202_);
    
    public abstract void method2334(int i, Class86 class86);
    
    public abstract void method2335(int i, Class86 class86);
    
    public abstract void method2336();
    
    public abstract void method2337(float f, float f_203_, float f_204_,
				    float[] fs);
    
    public abstract void method2338(float f, float f_205_, float f_206_,
				    float[] fs);
    
    public int[] method2339(int i, int i_207_, int i_208_, int i_209_,
			    int[] is, int i_210_, int i_211_, short i_212_) {
	int[] is_213_ = new int[i_208_ * i_209_];
	if (0 == i_211_)
	    i_211_ = i;
	for (int i_214_ = 0; i_214_ < i_209_; i_214_++) {
	    if (i_214_ < i_207_) {
		int i_215_ = i_214_ * i_211_ + i_210_;
		for (int i_216_ = 0; i_216_ < i; i_216_++)
		    is_213_[i_216_ + i_208_ * i_214_] = is[i_215_ + i_216_];
		int i_217_ = is[i_215_ + (i - 1)];
		for (int i_218_ = i; i_218_ < i_208_; i_218_++)
		    is_213_[i_208_ * i_214_ + i_218_] = i_217_;
	    } else {
		int i_219_ = i_208_ * (i_207_ - 1);
		for (int i_220_ = 0; i_220_ < i_208_; i_220_++)
		    is_213_[i_220_ + i_208_ * i_214_]
			= is_213_[i_219_ + i_220_];
	    }
	}
	return is_213_;
    }
    
    public float[] method2340(int i, int i_221_, int i_222_, int i_223_,
			      float[] fs, int i_224_, int i_225_, int i_226_,
			      int i_227_) {
	float[] fs_228_ = new float[i_226_ * (i_222_ * i_223_)];
	if (0 == i_225_)
	    i_225_ = i_226_ * i;
	for (int i_229_ = 0; i_229_ < i_223_; i_229_++) {
	    if (i_229_ < i_221_) {
		int i_230_ = i_224_ + i_229_ * i_225_;
		for (int i_231_ = 0; i_231_ < i; i_231_++) {
		    for (int i_232_ = 0; i_232_ < i_226_; i_232_++)
			fs_228_[i_232_ + (i_226_ * i_231_
					  + i_222_ * i_229_ * i_226_)]
			    = fs[i_226_ * i_231_ + i_230_ + i_232_];
		}
		float[] fs_233_ = new float[i_226_];
		for (int i_234_ = 0; i_234_ < i_226_; i_234_++)
		    fs_233_[i_234_] = fs[i_230_ + (i - 1) * i_226_ + i_234_];
		for (int i_235_ = i; i_235_ < i_222_; i_235_++) {
		    for (int i_236_ = 0; i_236_ < i_226_; i_236_++)
			fs_228_[i_236_ + (i_226_ * (i_222_ * i_229_)
					  + i_235_ * i_226_)]
			    = fs_233_[i_236_];
		}
	    } else {
		int i_237_ = i_226_ * ((i_221_ - 1) * i_222_);
		for (int i_238_ = 0; i_238_ < i_222_; i_238_++) {
		    for (int i_239_ = 0; i_239_ < i_226_; i_239_++)
			fs_228_[i_239_ + (i_238_ * i_226_
					  + i_222_ * i_229_ * i_226_)]
			    = fs_228_[i_239_ + (i_237_ + i_238_ * i_226_)];
		}
	    }
	}
	return fs_228_;
    }
    
    public byte[] method2341(int i, int i_240_, int i_241_, int i_242_,
			     byte[] is, int i_243_, int i_244_, int i_245_,
			     byte i_246_) {
	byte[] is_247_ = new byte[i_245_ * (i_242_ * i_241_)];
	if (0 == i_244_)
	    i_244_ = i * i_245_;
	for (int i_248_ = 0; i_248_ < i_242_; i_248_++) {
	    if (i_248_ < i_240_) {
		int i_249_ = i_243_ + i_244_ * i_248_;
		for (int i_250_ = 0; i_250_ < i; i_250_++) {
		    for (int i_251_ = 0; i_251_ < i_245_; i_251_++)
			is_247_[i_251_ + (i_245_ * i_250_
					  + i_241_ * i_248_ * i_245_)]
			    = is[i_249_ + i_245_ * i_250_ + i_251_];
		}
		byte[] is_252_ = new byte[i_245_];
		for (int i_253_ = 0; i_253_ < i_245_; i_253_++)
		    is_252_[i_253_] = is[i_253_ + ((i - 1) * i_245_ + i_249_)];
		for (int i_254_ = i; i_254_ < i_241_; i_254_++) {
		    for (int i_255_ = 0; i_255_ < i_245_; i_255_++)
			is_247_[(i_245_ * (i_241_ * i_248_) + i_254_ * i_245_
				 + i_255_)]
			    = is_252_[i_255_];
		}
	    } else {
		int i_256_ = (i_240_ - 1) * i_241_ * i_245_;
		for (int i_257_ = 0; i_257_ < i_241_; i_257_++) {
		    for (int i_258_ = 0; i_258_ < i_245_; i_258_++)
			is_247_[(i_245_ * (i_241_ * i_248_) + i_245_ * i_257_
				 + i_258_)]
			    = is_247_[i_258_ + (i_245_ * i_257_ + i_256_)];
		}
	    }
	}
	return is_247_;
    }
    
    public abstract int method2342();
    
    public abstract Class174 method2343();
    
    public abstract void method2344(int i, int i_259_, int i_260_, int i_261_,
				    int i_262_, int i_263_, int i_264_);
    
    public abstract void method2345();
    
    abstract void method2346();
    
    public abstract int method2347();
    
    void method2348() {
	method2220((byte) 0);
    }
    
    public final void method2349(Canvas canvas, int i) {
	if (aHashtable1472.containsKey(canvas)) {
	    Class105_Sub1 class105_sub1
		= (Class105_Sub1) aHashtable1472.get(canvas);
	    class105_sub1.method28();
	    aHashtable1472.remove(canvas);
	}
    }
    
    public abstract int method2350(int i, int i_265_, int i_266_, int i_267_,
				   int i_268_, int i_269_);
    
    public abstract boolean method2351();
    
    public abstract boolean method2352();
    
    public abstract boolean method2353();
    
    public abstract Interface5 method2354(int i, int i_270_);
    
    public abstract boolean method2355();
    
    public abstract Class89 method2356(Class161 class161, int i, int i_271_,
				       int i_272_, int i_273_);
    
    public final void method2357(int i, int i_274_, int i_275_, int i_276_,
				 int i_277_) {
	method2274(i, i_274_, i_275_, i_276_, i_277_, 1);
    }
    
    public abstract boolean method2358();
    
    public abstract void method2359(float f, float f_278_, float f_279_,
				    float f_280_, float f_281_);
    
    public abstract boolean method2360();
    
    public abstract boolean method2361();
    
    public abstract boolean method2362();
    
    public abstract boolean method2363();
    
    public abstract boolean method2364();
    
    public abstract boolean method2365();
    
    public abstract boolean method2366();
    
    public abstract void method2367(float f, float f_282_, float f_283_,
				    float f_284_, float f_285_);
    
    public abstract boolean method2368();
    
    public void finalize() {
	method2220((byte) 0);
    }
    
    public abstract String method2369();
    
    public abstract int method2370(int i, int i_286_, int i_287_, int i_288_,
				   int i_289_, int i_290_);
    
    public abstract void method2371(boolean bool);
    
    abstract Class105_Sub1 method2372(Canvas canvas, int i, int i_291_);
    
    public abstract void method2373(int i, int i_292_, int i_293_, int i_294_,
				    int i_295_, int i_296_);
    
    abstract Class105_Sub1 method2374(Canvas canvas, int i, int i_297_);
    
    public abstract void method2375(boolean bool);
    
    public void method2376() {
	/* empty */
    }
    
    public abstract int[] method2377(int i, int i_298_, int i_299_,
				     int i_300_);
    
    public abstract int[] method2378(int i, int i_301_, int i_302_,
				     int i_303_);
    
    public abstract int method2379(int i, int i_304_);
    
    public abstract void method2380(int i, int i_305_, int i_306_, int i_307_,
				    int i_308_, int i_309_, Class135 class135,
				    int i_310_, int i_311_);
    
    public abstract void method2381();
    
    public abstract boolean method2382();
    
    public void method2383(int[] is) {
	if (null != aClass105_Sub1_1452) {
	    is[0] = aClass105_Sub1_1452.method2655();
	    is[1] = aClass105_Sub1_1452.method2654();
	} else {
	    int[] is_312_ = is;
	    is[1] = 0;
	    is_312_[0] = 0;
	}
    }
    
    public void method2384(int[] is) {
	if (null != aClass105_Sub1_1452) {
	    is[0] = aClass105_Sub1_1452.method2655();
	    is[1] = aClass105_Sub1_1452.method2654();
	} else {
	    int[] is_313_ = is;
	    is[1] = 0;
	    is_313_[0] = 0;
	}
    }
    
    static synchronized Class103 method2385
	(int i, Canvas canvas, Class107 class107, Interface6 interface6,
	 JS5 class210, int i_314_, int i_315_, int i_316_, byte i_317_) {
	if (i == 0)
	    return Class271.method5315(canvas, class107, interface6, i_315_,
				       i_316_, (byte) 84);
	if (1 == i)
	    return Class165.method3539(canvas, class107, interface6, i_314_);
	if (i == 5)
	    return Class233.method4688(canvas, class107, interface6, class210,
				       i_314_);
	if (3 == i)
	    return Class346.method6179(canvas, class107, interface6, class210,
				       i_314_);
	throw new IllegalArgumentException("");
    }
    
    public abstract void method2386(float f);
    
    public abstract void method2387(boolean bool);
    
    public abstract void method2388(boolean bool);
    
    public abstract void method2389();
    
    public abstract void method2390();
    
    public abstract Class241_Sub47 method2391(int i);
    
    public abstract void method2392();
    
    public abstract void method2393(int i, int i_318_, int i_319_, int i_320_);
    
    public abstract void method2394(int i, int i_321_, int i_322_, int i_323_);
    
    public final void method2395(int i, int i_324_, int i_325_, int i_326_) {
	method2273(i, i_324_, i_325_, i_326_, 1);
    }
    
    public abstract void method2396(int i, int i_327_, int i_328_, int i_329_,
				    int i_330_, int i_331_);
    
    public abstract void method2397(float f, float f_332_);
    
    public abstract void method2398();
    
    public abstract void method2399(int i, int i_333_, int i_334_, int i_335_);
    
    public abstract void method2400(int i, int i_336_, int i_337_, int i_338_);
    
    public abstract void method2401(int i, int i_339_, int i_340_, int i_341_);
    
    public abstract void method2402(int i, int i_342_, int i_343_, int i_344_);
    
    public abstract void method2403(int[] is);
    
    public abstract void method2404(int[] is);
    
    public abstract void method2405(int[] is);
    
    public abstract void method2406(int i, int i_345_);
    
    public abstract void method2407(int i, int i_346_, int i_347_, int i_348_,
				    int i_349_, int i_350_);
    
    public abstract int method2408();
    
    public abstract void method2409(int i, int i_351_, int i_352_, int i_353_,
				    int i_354_, int i_355_);
    
    public abstract void method2410(int i, int i_356_, int i_357_, int i_358_,
				    int i_359_, int i_360_);
    
    public abstract void method2411(int i, int i_361_, int i_362_, int i_363_,
				    int i_364_, int i_365_);
    
    public abstract int method2412(int i, int i_366_, int i_367_, int i_368_,
				   int i_369_, int i_370_);
    
    public abstract void method2413(Class180 class180, float f,
				    Class180 class180_371_, float f_372_,
				    Class180 class180_373_, float f_374_);
    
    public abstract Class96 method2414(Class639 class639, Class108[] class108s,
				       boolean bool);
    
    abstract void method2415(int i, int i_375_, int i_376_, int i_377_,
			     int i_378_);
    
    abstract void method2416(int i, int i_379_, int i_380_, int i_381_,
			     int i_382_);
    
    abstract void method2417(int i, int i_383_, int i_384_, int i_385_,
			     int i_386_);
    
    public abstract int[] method2418(int i, int i_387_, int i_388_,
				     int i_389_);
    
    public abstract void method2419(int i, int i_390_, int i_391_, int i_392_,
				    int i_393_, int i_394_, int i_395_,
				    int i_396_, int i_397_);
    
    public abstract void method2420(int i, int i_398_, int i_399_, int i_400_,
				    int i_401_, int i_402_, Class135 class135,
				    int i_403_, int i_404_);
    
    abstract void method2421(int i, int i_405_) throws Exception_Sub2;
    
    public Class168 method2422(int i, int i_406_, boolean bool) {
	return method2590(i, i_406_, bool, false);
    }
    
    public abstract void method2423(int i, int i_407_, int i_408_, int i_409_,
				    int i_410_, int i_411_, int i_412_);
    
    public final void method2424(Canvas canvas, int i, int i_413_,
				 int i_414_) {
	Class105_Sub1 class105_sub1
	    = (Class105_Sub1) aHashtable1472.get(canvas);
	if (class105_sub1 == null)
	    throw new RuntimeException("");
	class105_sub1.method15436(i, i_413_);
    }
    
    public abstract void method2425(int i, int i_415_, int i_416_, int i_417_,
				    int i_418_, int i_419_, int i_420_);
    
    public abstract void method2426(int i, Class86 class86);
    
    public abstract int method2427(int i, int i_421_, int i_422_, int i_423_,
				   int i_424_, int i_425_);
    
    public final void method2428(int i, int i_426_, int i_427_, int i_428_) {
	method2273(i, i_426_, i_427_, i_428_, 1);
    }
    
    public abstract void method2429(int i, Class86 class86);
    
    public abstract int method2430(int i, int i_429_, int i_430_, int i_431_,
				   int i_432_, int i_433_);
    
    public float[] method2431(int i, int i_434_, int i_435_, int i_436_,
			      float[] fs, int i_437_, int i_438_, int i_439_) {
	float[] fs_440_ = new float[i_439_ * (i_435_ * i_436_)];
	if (0 == i_438_)
	    i_438_ = i_439_ * i;
	for (int i_441_ = 0; i_441_ < i_436_; i_441_++) {
	    if (i_441_ < i_434_) {
		int i_442_ = i_437_ + i_441_ * i_438_;
		for (int i_443_ = 0; i_443_ < i; i_443_++) {
		    for (int i_444_ = 0; i_444_ < i_439_; i_444_++)
			fs_440_[i_444_ + (i_439_ * i_443_
					  + i_435_ * i_441_ * i_439_)]
			    = fs[i_439_ * i_443_ + i_442_ + i_444_];
		}
		float[] fs_445_ = new float[i_439_];
		for (int i_446_ = 0; i_446_ < i_439_; i_446_++)
		    fs_445_[i_446_] = fs[i_442_ + (i - 1) * i_439_ + i_446_];
		for (int i_447_ = i; i_447_ < i_435_; i_447_++) {
		    for (int i_448_ = 0; i_448_ < i_439_; i_448_++)
			fs_440_[i_448_ + (i_439_ * (i_435_ * i_441_)
					  + i_447_ * i_439_)]
			    = fs_445_[i_448_];
		}
	    } else {
		int i_449_ = i_439_ * ((i_434_ - 1) * i_435_);
		for (int i_450_ = 0; i_450_ < i_435_; i_450_++) {
		    for (int i_451_ = 0; i_451_ < i_439_; i_451_++)
			fs_440_[i_451_ + (i_450_ * i_439_
					  + i_435_ * i_441_ * i_439_)]
			    = fs_440_[i_451_ + (i_449_ + i_450_ * i_439_)];
		}
	    }
	}
	return fs_440_;
    }
    
    public abstract void method2432(Class266 class266, Class97 class97,
				    Class272 class272);
    
    public abstract void method2433(Class266 class266, Class97 class97,
				    Class272 class272);
    
    abstract boolean method2434(int i, int i_452_, int i_453_, int i_454_,
				Class266 class266, Class272 class272);
    
    public abstract Class168 method2435(int i, int i_455_, boolean bool,
					boolean bool_456_);
    
    public abstract void method2436();
    
    public abstract Class168 method2437(int i, int i_457_, boolean bool,
					boolean bool_458_);
    
    public abstract Class168 method2438(int i, int i_459_, boolean bool,
					boolean bool_460_);
    
    public abstract Class168 method2439(int[] is, int i, int i_461_,
					int i_462_, int i_463_, boolean bool);
    
    public abstract int method2440();
    
    public abstract boolean method2441();
    
    public abstract void method2442(boolean bool);
    
    public abstract Class168 method2443(int i, int i_464_, int i_465_,
					int i_466_, boolean bool);
    
    public abstract Class135 method2444(int i, int i_467_, int[] is,
					int[] is_468_);
    
    public abstract void method2445(int i, int i_469_, int i_470_, int i_471_);
    
    public abstract Class135 method2446(int i, int i_472_, int[] is,
					int[] is_473_);
    
    public abstract Interface5 method2447(int i, int i_474_);
    
    public abstract void method2448(int i, Class135 class135, int i_475_,
				    int i_476_);
    
    public abstract void method2449(int i, Class135 class135, int i_477_,
				    int i_478_);
    
    public abstract void method2450(int i, int i_479_);
    
    public abstract void method2451(int i);
    
    public abstract Class89 method2452(Class161 class161, int i, int i_480_,
				       int i_481_, int i_482_);
    
    public abstract boolean method2453();
    
    public abstract Class89 method2454(Class161 class161, int i, int i_483_,
				       int i_484_, int i_485_);
    
    public static Class103 method2455(int i, Canvas canvas, Class107 class107,
				      Interface6 interface6, JS5 class210,
				      int i_486_) {
	int i_487_ = 0;
	int i_488_ = 0;
	if (canvas != null) {
	    Dimension dimension = canvas.getSize();
	    i_487_ = dimension.width;
	    i_488_ = dimension.height;
	}
	return method2385(i, canvas, class107, interface6, class210, i_486_,
			  i_487_, i_488_, (byte) -123);
    }
    
    public abstract void method2456(Class88 class88);
    
    public abstract Class268 method2457();
    
    public abstract Class266 method2458();
    
    public final void method2459(int i, int i_489_, int i_490_, int i_491_,
				 int i_492_) {
	method2268(i, i_489_, i_490_, i_491_, i_492_, 1);
    }
    
    public final void method2460() throws Exception_Sub2 {
	method2218(0, 0);
    }
    
    public abstract Interface4 method2461(int i, int i_493_, Class175 class175,
					  Class102 class102, int i_494_);
    
    public abstract void method2462(int i, int i_495_, int i_496_, int i_497_,
				    int i_498_, int i_499_);
    
    public abstract int method2463();
    
    public abstract int method2464();
    
    public Class241_Sub43 method2465(int i, int i_500_, int i_501_, int i_502_,
				     int i_503_, float f) {
	return new Class241_Sub43(i, i_500_, i_501_, i_502_, i_503_, f);
    }
    
    public abstract void method2466();
    
    public abstract Class135 method2467(int i, int i_504_, int[] is,
					int[] is_505_);
    
    public Class241_Sub43 method2468(int i, int i_506_, int i_507_, int i_508_,
				     int i_509_, float f) {
	return new Class241_Sub43(i, i_506_, i_507_, i_508_, i_509_, f);
    }
    
    public abstract void method2469(int i, Class241_Sub43[] class241_sub43s);
    
    public abstract int method2470();
    
    public abstract void method2471(int i, int i_510_, int i_511_, int i_512_);
    
    public abstract void method2472(Class98 class98);
    
    public abstract void method2473(int i);
    
    public abstract void method2474(Class268 class268);
    
    public abstract void method2475(Class268 class268);
    
    public abstract void method2476(float f);
    
    public abstract void method2477(int i, int i_513_, int i_514_);
    
    public abstract void method2478(int i, float f, float f_515_, float f_516_,
				    float f_517_, float f_518_);
    
    public abstract void method2479(int i, float f, float f_519_, float f_520_,
				    float f_521_, float f_522_);
    
    public abstract void method2480();
    
    public abstract boolean method2481();
    
    public abstract void method2482(int i);
    
    public abstract void method2483(int i, int i_523_, int i_524_);
    
    final void method2484(Canvas canvas, Class105_Sub1 class105_sub1) {
	if (class105_sub1 == null)
	    throw new RuntimeException("");
	aHashtable1472.put(canvas, class105_sub1);
    }
    
    public abstract Class88 method2485(int i);
    
    public abstract Interface4 method2486(int i, int i_525_, Class175 class175,
					  Class102 class102, int i_526_);
    
    public abstract Class88 method2487(Class88 class88, Class88 class88_527_,
				       float f, Class88 class88_528_);
    
    public static boolean method2488(int i) {
	return i == 0 || i == 2;
    }
    
    public abstract Class88 method2489(Class88 class88, Class88 class88_529_,
				       float f, Class88 class88_530_);
    
    public abstract void method2490(Class88 class88);
    
    public abstract void method2491(float f, float f_531_, float f_532_,
				    float[] fs);
    
    public abstract void method2492(int i, int i_533_, int i_534_, int i_535_);
    
    public abstract void method2493(int i, int i_536_, int i_537_, int i_538_);
    
    public Class241_Sub43 method2494(int i, int i_539_, int i_540_, int i_541_,
				     int i_542_, float f) {
	return new Class241_Sub43(i, i_539_, i_540_, i_541_, i_542_, f);
    }
    
    public abstract void method2495(int i, Class135 class135, int i_543_,
				    int i_544_);
    
    public abstract Class168 method2496(Class108 class108, boolean bool);
    
    public abstract boolean method2497();
    
    public abstract boolean method2498();
    
    public abstract void method2499(int i);
    
    public abstract void method2500(Class180 class180, float f,
				    Class180 class180_545_, float f_546_,
				    Class180 class180_547_, float f_548_);
    
    public abstract void method2501(Class180 class180, float f,
				    Class180 class180_549_, float f_550_,
				    Class180 class180_551_, float f_552_);
    
    public abstract boolean method2502();
    
    public abstract Class89 method2503(Class161 class161, int i, int i_553_,
				       int i_554_, int i_555_);
    
    public abstract boolean method2504();
    
    public abstract void method2505();
    
    public abstract void method2506(Class98 class98);
    
    abstract void method2507(float f, float f_556_, float f_557_, float f_558_,
			     float f_559_, float f_560_);
    
    abstract void method2508(float f, float f_561_, float f_562_, float f_563_,
			     float f_564_, float f_565_);
    
    abstract void method2509(float f, float f_566_, float f_567_, float f_568_,
			     float f_569_, float f_570_);
    
    abstract void method2510(float f, float f_571_, float f_572_, float f_573_,
			     float f_574_, float f_575_);
    
    abstract Class105_Sub1 method2511(Canvas canvas, int i, int i_576_);
    
    public abstract void method2512(Class266 class266);
    
    public abstract void method2513(int i, Class86 class86);
    
    public abstract void method2514(int i, Class86 class86);
    
    public abstract void method2515(int i, Class86 class86);
    
    public final void method2516(Canvas canvas, int i, int i_577_) {
	Class105_Sub1 class105_sub1
	    = (Class105_Sub1) aHashtable1472.get(canvas);
	if (class105_sub1 == null)
	    throw new RuntimeException("");
	class105_sub1.method15436(i, i_577_);
    }
    
    public final void method2517(int i, int i_578_, int i_579_, int i_580_,
				 int i_581_, int i_582_) {
	method2274(i, i_578_, i_579_, i_580_, i_581_, 1);
    }
    
    public abstract void method2518(Class266 class266);
    
    public abstract void method2519();
    
    public abstract void method2520(int i, int i_583_, float f, int i_584_,
				    int i_585_, float f_586_, int i_587_,
				    int i_588_, float f_589_, int i_590_,
				    int i_591_, int i_592_, int i_593_);
    
    public abstract Class135 method2521(int i, int i_594_, int[] is,
					int[] is_595_);
    
    public abstract void method2522(int i, int i_596_, float f, int i_597_,
				    int i_598_, float f_599_, int i_600_,
				    int i_601_, float f_602_, int i_603_,
				    int i_604_, int i_605_, int i_606_);
    
    public abstract void method2523(int i, int i_607_, float f, int i_608_,
				    int i_609_, float f_610_, int i_611_,
				    int i_612_, float f_613_, int i_614_,
				    int i_615_, int i_616_, int i_617_);
    
    public abstract boolean method2524();
    
    public abstract void method2525(int i, int i_618_, float f, int i_619_,
				    int i_620_, float f_621_, int i_622_,
				    int i_623_, float f_624_, int i_625_,
				    int i_626_, int i_627_, int i_628_);
    
    public abstract void method2526();
    
    public abstract boolean method2527();
    
    public abstract void method2528(float f, float f_629_, float f_630_,
				    float[] fs);
    
    public abstract Class105_Sub2 method2529();
    
    public abstract void method2530();
    
    public abstract Interface4 method2531(int i, int i_631_, Class175 class175,
					  Class102 class102, int i_632_);
    
    public abstract void method2532(int i, Class241_Sub43[] class241_sub43s);
    
    public abstract Interface4 method2533(int i, int i_633_, Class175 class175,
					  Class102 class102, int i_634_);
    
    public abstract Interface5 method2534(int i, int i_635_);
    
    public abstract void method2535(boolean bool);
    
    public abstract int method2536(int i, int i_636_, int i_637_, int i_638_,
				   int i_639_, int i_640_);
    
    public final void method2537(int i, int i_641_, int i_642_, int i_643_,
				 int i_644_) {
	method2396(i, i_641_, i_642_, i_643_, i_644_, 1);
    }
    
    public abstract Interface5 method2538(int i, int i_645_, int i_646_);
    
    void method2539() {
	method2220((byte) 0);
    }
    
    public abstract Class168 method2540(int[] is, int i, int i_647_,
					int i_648_, int i_649_, boolean bool);
    
    void method2541() {
	method2220((byte) 0);
    }
    
    void method2542() {
	method2220((byte) 0);
    }
    
    abstract void method2543(int i, int i_650_, int i_651_, int i_652_,
			     int i_653_);
    
    public abstract void method2544(int i, int i_654_, int i_655_, int i_656_,
				    int i_657_, int i_658_, Class135 class135,
				    int i_659_, int i_660_, int i_661_,
				    int i_662_, int i_663_);
    
    public abstract void method2545(int i, int i_664_, int i_665_, int i_666_,
				    int i_667_, int i_668_, Class135 class135,
				    int i_669_, int i_670_, int i_671_,
				    int i_672_, int i_673_);
    
    abstract boolean method2546(int i, int i_674_, int i_675_, int i_676_,
				Class266 class266, Class272 class272);
    
    abstract boolean method2547(int i, int i_677_, int i_678_, int i_679_,
				Class266 class266, Class272 class272);
    
    public abstract void method2548(Class241_Sub47 class241_sub47);
    
    public abstract boolean method2549();
    
    public abstract Interface5 method2550(int i, int i_680_, int i_681_);
    
    public abstract Class96 method2551(Class639 class639, Class108[] class108s,
				       boolean bool);
    
    public abstract Class96 method2552(Class639 class639, Class108[] class108s,
				       boolean bool);
    
    public abstract Class96 method2553(Class639 class639, Class108[] class108s,
				       boolean bool);
    
    public abstract int method2554(int i, int i_682_);
    
    public abstract Class266 method2555();
    
    public abstract Class266 method2556();
    
    public abstract Class268 method2557();
    
    public abstract void method2558(float f, float f_683_, float f_684_,
				    float f_685_, float f_686_);
    
    abstract void method2559(int i, int i_687_, int i_688_, int i_689_,
			     int i_690_);
    
    public abstract void method2560();
    
    public abstract void method2561(int i);
    
    public abstract String method2562();
    
    public static Class103 method2563(int i, Canvas canvas, Class107 class107,
				      Interface6 interface6, JS5 class210,
				      int i_691_) {
	int i_692_ = 0;
	int i_693_ = 0;
	if (canvas != null) {
	    Dimension dimension = canvas.getSize();
	    i_692_ = dimension.width;
	    i_693_ = dimension.height;
	}
	return method2385(i, canvas, class107, interface6, class210, i_691_,
			  i_692_, i_693_, (byte) -14);
    }
    
    public static boolean method2564(int i) {
	return 1 == i || 3 == i || 5 == i;
    }
    
    public abstract int[] method2565(int i, int i_694_, int i_695_,
				     int i_696_);
    
    public abstract Class88 method2566(int i);
    
    public static boolean method2567(int i) {
	return i == 0 || i == 2;
    }
    
    public abstract Interface4 method2568(int i, int i_697_, Class175 class175,
					  Class102 class102, int i_698_);
    
    public final void method2569() throws Exception_Sub2 {
	method2218(0, 0);
    }
    
    public final void method2570() throws Exception_Sub2 {
	method2218(0, 0);
    }
    
    public final Class105_Sub1 method2571(int i) {
	return aClass105_Sub1_1452;
    }
    
    public abstract void method2572();
    
    public abstract boolean method2573();
    
    public void method2574() {
	aBoolArray1471[1931687493 * anInt1456] = false;
	Enumeration enumeration = aHashtable1472.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    Class105_Sub1 class105_sub1
		= (Class105_Sub1) aHashtable1472.get(canvas);
	    class105_sub1.method28();
	}
	method2221();
    }
    
    public void method2575() {
	aBoolArray1471[1931687493 * anInt1456] = false;
	Enumeration enumeration = aHashtable1472.keys();
	while (enumeration.hasMoreElements()) {
	    Canvas canvas = (Canvas) enumeration.nextElement();
	    Class105_Sub1 class105_sub1
		= (Class105_Sub1) aHashtable1472.get(canvas);
	    class105_sub1.method28();
	}
	method2221();
    }
    
    public Class241_Sub43 method2576(int i, int i_699_, int i_700_, int i_701_,
				     int i_702_, float f) {
	return new Class241_Sub43(i, i_699_, i_700_, i_701_, i_702_, f);
    }
    
    public final Class105_Sub1 method2577() {
	return aClass105_Sub1_1452;
    }
    
    public final Class105_Sub1 method2578() {
	return aClass105_Sub1_1452;
    }
    
    public final Class105_Sub1 method2579() {
	return aClass105_Sub1_1452;
    }
    
    public final void method2580(Canvas canvas, int i, int i_703_) {
	if (!aHashtable1472.containsKey(canvas)) {
	    Class540.method11932(canvas, -1944253770);
	    method2240(canvas, method2246(canvas, i, i_703_), 1455428848);
	}
    }
    
    public final void method2581(Canvas canvas, int i, int i_704_) {
	if (!aHashtable1472.containsKey(canvas)) {
	    Class540.method11932(canvas, -1944253770);
	    method2240(canvas, method2246(canvas, i, i_704_), 1455428848);
	}
    }
    
    public abstract void method2582(int i, int i_705_, int i_706_, int i_707_,
				    int i_708_, int i_709_);
    
    final void method2583(Canvas canvas, Class105_Sub1 class105_sub1) {
	if (class105_sub1 == null)
	    throw new RuntimeException("");
	aHashtable1472.put(canvas, class105_sub1);
    }
    
    public abstract boolean method2584();
    
    public final void method2585(Canvas canvas) {
	if (aHashtable1472.containsKey(canvas)) {
	    Class105_Sub1 class105_sub1
		= (Class105_Sub1) aHashtable1472.get(canvas);
	    class105_sub1.method28();
	    aHashtable1472.remove(canvas);
	}
    }
    
    public final void method2586(Canvas canvas) {
	Class105_Sub1 class105_sub1
	    = (Class105_Sub1) aHashtable1472.get(canvas);
	if (class105_sub1 == null)
	    throw new RuntimeException();
	if (-891977887 * ((Class103) this).anInt1469 > 0
	    || aClass105_1470 != aClass105_Sub1_1452)
	    throw new RuntimeException();
	if (null != aClass105_1470)
	    aClass105_1470.method2659();
	if (-891977887 * ((Class103) this).anInt1469 < 0)
	    aClass105_1470 = class105_sub1;
	aClass105_Sub1_1452 = class105_sub1;
	class105_sub1.method162();
    }
    
    public final void method2587(Canvas canvas, int i, int i_710_) {
	Class105_Sub1 class105_sub1
	    = (Class105_Sub1) aHashtable1472.get(canvas);
	if (class105_sub1 == null)
	    throw new RuntimeException("");
	class105_sub1.method15436(i, i_710_);
    }
    
    public final void method2588(Canvas canvas, int i, int i_711_) {
	Class105_Sub1 class105_sub1
	    = (Class105_Sub1) aHashtable1472.get(canvas);
	if (class105_sub1 == null)
	    throw new RuntimeException("");
	class105_sub1.method15436(i, i_711_);
    }
    
    public final void method2589(Canvas canvas, int i, int i_712_) {
	Class105_Sub1 class105_sub1
	    = (Class105_Sub1) aHashtable1472.get(canvas);
	if (class105_sub1 == null)
	    throw new RuntimeException("");
	class105_sub1.method15436(i, i_712_);
    }
    
    public abstract Class168 method2590(int i, int i_713_, boolean bool,
					boolean bool_714_);
    
    public final void method2591(Class105_Sub2 class105_sub2) {
	if (((Class103) this).anInt1469 * -891977887 >= 3)
	    throw new RuntimeException();
	if (((Class103) this).anInt1469 * -891977887 >= 0)
	    ((Class103) this).aClass105_Sub2Array1473
		[((Class103) this).anInt1469 * -891977887].method2659();
	else
	    aClass105_Sub1_1452.method2659();
	aClass105_1470
	    = ((Class103) this).aClass105_Sub2Array1473
		  [(((Class103) this).anInt1469 += -1986435935) * -891977887]
	    = class105_sub2;
	class105_sub2.method162();
    }
    
    public final void method2592(Class105_Sub2 class105_sub2) {
	if (((Class103) this).anInt1469 * -891977887 >= 3)
	    throw new RuntimeException();
	if (((Class103) this).anInt1469 * -891977887 >= 0)
	    ((Class103) this).aClass105_Sub2Array1473
		[((Class103) this).anInt1469 * -891977887].method2659();
	else
	    aClass105_Sub1_1452.method2659();
	aClass105_1470
	    = ((Class103) this).aClass105_Sub2Array1473
		  [(((Class103) this).anInt1469 += -1986435935) * -891977887]
	    = class105_sub2;
	class105_sub2.method162();
    }
    
    public abstract void method2593(Class88 class88);
    
    public void method2594(boolean bool) {
	/* empty */
    }
    
    public abstract Class266 method2595();
    
    public final void method2596(int i, int i_715_, int i_716_, int i_717_,
				 int i_718_) {
	method2396(i, i_715_, i_716_, i_717_, i_718_, 1);
    }
    
    public final void method2597(int i, int i_719_, int i_720_, int i_721_,
				 int i_722_) {
	method2396(i, i_719_, i_720_, i_721_, i_722_, 1);
    }
    
    public abstract boolean method2598();
    
    public final void method2599(int i, int i_723_, int i_724_, int i_725_,
				 int i_726_) {
	method2396(i, i_723_, i_724_, i_725_, i_726_, 1);
    }
    
    public final void method2600(int i, int i_727_, int i_728_, int i_729_) {
	method2543(i, i_727_, i_728_, i_729_, 1);
    }
    
    public final void method2601(int i, int i_730_, int i_731_, int i_732_) {
	method2543(i, i_730_, i_731_, i_732_, 1);
    }
    
    public boolean method2602(int i, int i_733_, Class266 class266,
			      Class272 class272) {
	return method2434(i, i_733_, 0, 0, class266, class272);
    }
    
    public final void method2603(int i, int i_734_, int i_735_, int i_736_) {
	method2272(i, i_734_, i_735_, i_736_, 1);
    }
    
    public final void method2604(int i, int i_737_, int i_738_, int i_739_) {
	method2272(i, i_737_, i_738_, i_739_, 1);
    }
    
    public final Class105 method2605() {
	return aClass105_1470;
    }
    
    public abstract boolean method2606();
    
    public abstract void method2607();
    
    public abstract void method2608();
    
    public final void method2609(int i, int i_740_, int i_741_, int i_742_,
				 int i_743_) {
	method2274(i, i_740_, i_741_, i_742_, i_743_, 1);
    }
    
    public abstract Class88 method2610(Class88 class88, Class88 class88_744_,
				       float f, Class88 class88_745_);
    
    public abstract Class88 method2611(int i);
    
    public Class168 method2612(int i, int i_746_, boolean bool) {
	return method2590(i, i_746_, bool, false);
    }
    
    public Class168 method2613(int i, int i_747_, boolean bool) {
	return method2590(i, i_747_, bool, false);
    }
    
    public Class168 method2614(int[] is, int i, int i_748_, int i_749_,
			       int i_750_) {
	return method2287(is, i, i_748_, i_749_, i_750_, true);
    }
    
    public Class168 method2615(int[] is, int i, int i_751_, int i_752_,
			       int i_753_) {
	return method2287(is, i, i_751_, i_752_, i_753_, true);
    }
    
    public Class168 method2616(int[] is, int i, int i_754_, int i_755_,
			       int i_756_) {
	return method2287(is, i, i_754_, i_755_, i_756_, true);
    }
    
    public void method2617() {
	/* empty */
    }
    
    public abstract void method2618(Class266 class266, Class97 class97,
				    Class272 class272);
    
    public void method2619() {
	/* empty */
    }
    
    public void method2620() {
	/* empty */
    }
    
    public abstract Interface5 method2621(int i, int i_757_);
    
    public void method2622() {
	/* empty */
    }
    
    public abstract Class174 method2623();
    
    public boolean method2624() {
	return true;
    }
    
    public boolean method2625() {
	return true;
    }
    
    public boolean method2626() {
	return true;
    }
    
    public int[] method2627(int i, int i_758_, int i_759_, int i_760_,
			    int[] is, int i_761_, int i_762_) {
	int[] is_763_ = new int[i_759_ * i_760_];
	if (0 == i_762_)
	    i_762_ = i;
	for (int i_764_ = 0; i_764_ < i_760_; i_764_++) {
	    if (i_764_ < i_758_) {
		int i_765_ = i_764_ * i_762_ + i_761_;
		for (int i_766_ = 0; i_766_ < i; i_766_++)
		    is_763_[i_766_ + i_759_ * i_764_] = is[i_765_ + i_766_];
		int i_767_ = is[i_765_ + (i - 1)];
		for (int i_768_ = i; i_768_ < i_759_; i_768_++)
		    is_763_[i_759_ * i_764_ + i_768_] = i_767_;
	    } else {
		int i_769_ = i_759_ * (i_758_ - 1);
		for (int i_770_ = 0; i_770_ < i_759_; i_770_++)
		    is_763_[i_770_ + i_759_ * i_764_]
			= is_763_[i_769_ + i_770_];
	    }
	}
	return is_763_;
    }
    
    public void method2628(boolean bool) {
	/* empty */
    }
    
    public byte[] method2629(int i, int i_771_, int i_772_, int i_773_,
			     byte[] is, int i_774_, int i_775_, int i_776_) {
	byte[] is_777_ = new byte[i_776_ * (i_773_ * i_772_)];
	if (0 == i_775_)
	    i_775_ = i * i_776_;
	for (int i_778_ = 0; i_778_ < i_773_; i_778_++) {
	    if (i_778_ < i_771_) {
		int i_779_ = i_774_ + i_775_ * i_778_;
		for (int i_780_ = 0; i_780_ < i; i_780_++) {
		    for (int i_781_ = 0; i_781_ < i_776_; i_781_++)
			is_777_[i_781_ + (i_776_ * i_780_
					  + i_772_ * i_778_ * i_776_)]
			    = is[i_779_ + i_776_ * i_780_ + i_781_];
		}
		byte[] is_782_ = new byte[i_776_];
		for (int i_783_ = 0; i_783_ < i_776_; i_783_++)
		    is_782_[i_783_] = is[i_783_ + ((i - 1) * i_776_ + i_779_)];
		for (int i_784_ = i; i_784_ < i_772_; i_784_++) {
		    for (int i_785_ = 0; i_785_ < i_776_; i_785_++)
			is_777_[(i_776_ * (i_772_ * i_778_) + i_784_ * i_776_
				 + i_785_)]
			    = is_782_[i_785_];
		}
	    } else {
		int i_786_ = (i_771_ - 1) * i_772_ * i_776_;
		for (int i_787_ = 0; i_787_ < i_772_; i_787_++) {
		    for (int i_788_ = 0; i_788_ < i_776_; i_788_++)
			is_777_[(i_776_ * (i_772_ * i_778_) + i_776_ * i_787_
				 + i_788_)]
			    = is_777_[i_788_ + (i_776_ * i_787_ + i_786_)];
		}
	    }
	}
	return is_777_;
    }
    
    abstract void method2630(int i, int i_789_) throws Exception_Sub2;
    
    public abstract void method2631(Class241_Sub47 class241_sub47);
    
    static int method2632(int i, int i_790_) {
	if (i == 16711935)
	    return -1;
	return VarPlayerDomain.method11651(i, (byte) -16);
    }
    
    static final void ifNotMatchSkip/*method2633*/(ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= -821458770;
		if (scriptData.integerStack[1482319719 * scriptData.intStackPointer]
				!= scriptData.integerStack[1482319719 * scriptData.intStackPointer + 1]) {
			scriptData.step += (1924545709 * scriptData.integerConstants[scriptData.step * 1938982693]);
		}
    }
    
    static final void method2634(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.anInt886 * -383857477;
    }
    
    public static void method2635(InterfaceDefinition class35, InterfaceComponent class58, int i) {
	InterfaceComponent class58_791_
	    = LoadingScreenDef.method6489(class35, class58, -740197058);
	int i_792_;
	int i_793_;
	if (class58_791_ == null) {
	    i_792_ = -1080559003 * Class494.canvasWid;
	    i_793_ = Class67.canvasHei * 963058943;
	} else {
	    i_792_ = 439139681 * class58_791_.anInt850;
	    i_793_ = class58_791_.scrollMinY * 1463495207;
	}
	SparseVarDomain.method3108(class58, i_792_, i_793_, false, (byte) 0);
	Class257.method5060(class58, i_792_, i_793_, 461436189);
    }
    
    public static long method2636(int i) {
	long l;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class589.method12904("services", false,
							-1852374183))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setRequestProperty("connection", "close");
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write("data1=req");
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    RSByteBuffer class241_sub3 = new RSByteBuffer(new byte[1000]);
	    for (;;) {
		int i_794_
		    = inputstream.read(class241_sub3.payload,
				       421967667 * class241_sub3.pointer,
				       1000 - (421967667
					       * class241_sub3.pointer));
		if (-1 == i_794_)
		    break;
		class241_sub3.pointer += -681042949 * i_794_;
		if (class241_sub3.pointer * 421967667 >= 1000)
		    return 0L;
	    }
	    class241_sub3.pointer = 0;
	    long l_795_ = class241_sub3.readLong((short) 14786);
	    l = l_795_;
	} catch (Exception exception) {
	    return 0L;
	}
	return l;
    }
}
