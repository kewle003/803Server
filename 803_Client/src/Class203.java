/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class203
{
    int anInt2414;
    float aFloat2415 = 1.0F;
    float aFloat2416 = 1.0F;
    int anInt2417;
    int anInt2418;
    float aFloat2419;
    int anInt2420;
    int anInt2421;
    int anInt2422;
    int anInt2423;
    int anInt2424;
    public static int anInt2425;
    
    Class203 method4078() {
	return new Class203(((Class203) this).anInt2417 * -1473589757,
			    ((Class203) this).aFloat2415,
			    ((Class203) this).aFloat2416,
			    653825893 * ((Class203) this).anInt2423,
			    -825717933 * ((Class203) this).anInt2418,
			    360392329 * ((Class203) this).anInt2424);
    }
    
    Class203(int i, float f, float f_0_, int i_1_, int i_2_, int i_3_) {
	((Class203) this).anInt2417 = 376097963 * i;
	((Class203) this).aFloat2415 = f;
	((Class203) this).aFloat2416 = f_0_;
	((Class203) this).anInt2423 = -378944915 * i_1_;
	((Class203) this).anInt2418 = i_2_ * 830599387;
	((Class203) this).anInt2424 = 318648249 * i_3_;
    }
    
    Class203 method4079() {
	return new Class203(((Class203) this).anInt2417 * -1473589757,
			    ((Class203) this).aFloat2415,
			    ((Class203) this).aFloat2416,
			    653825893 * ((Class203) this).anInt2423,
			    -825717933 * ((Class203) this).anInt2418,
			    360392329 * ((Class203) this).anInt2424);
    }
    
    void method4080(Class203 class203_4_) {
	((Class203) this).aFloat2415 = ((Class203) class203_4_).aFloat2415;
	((Class203) this).aFloat2416 = ((Class203) class203_4_).aFloat2416;
	((Class203) this).anInt2423 = 1 * ((Class203) class203_4_).anInt2423;
	((Class203) this).anInt2418 = 1 * ((Class203) class203_4_).anInt2418;
	((Class203) this).anInt2417 = ((Class203) class203_4_).anInt2417 * 1;
	((Class203) this).anInt2424 = 1 * ((Class203) class203_4_).anInt2424;
    }
    
    Class203(int i) {
	((Class203) this).anInt2417 = 376097963 * i;
    }
    
    Class203 method4081(int i) {
	return new Class203(((Class203) this).anInt2417 * -1473589757,
			    ((Class203) this).aFloat2415,
			    ((Class203) this).aFloat2416,
			    653825893 * ((Class203) this).anInt2423,
			    -825717933 * ((Class203) this).anInt2418,
			    360392329 * ((Class203) this).anInt2424);
    }
    
    void method4082(Class203 class203_5_, int i) {
	((Class203) this).aFloat2415 = ((Class203) class203_5_).aFloat2415;
	((Class203) this).aFloat2416 = ((Class203) class203_5_).aFloat2416;
	((Class203) this).anInt2423 = 1 * ((Class203) class203_5_).anInt2423;
	((Class203) this).anInt2418 = 1 * ((Class203) class203_5_).anInt2418;
	((Class203) this).anInt2417 = ((Class203) class203_5_).anInt2417 * 1;
	((Class203) this).anInt2424 = 1 * ((Class203) class203_5_).anInt2424;
    }
    
    void method4083(Class203 class203_6_) {
	((Class203) this).aFloat2415 = ((Class203) class203_6_).aFloat2415;
	((Class203) this).aFloat2416 = ((Class203) class203_6_).aFloat2416;
	((Class203) this).anInt2423 = 1 * ((Class203) class203_6_).anInt2423;
	((Class203) this).anInt2418 = 1 * ((Class203) class203_6_).anInt2418;
	((Class203) this).anInt2417 = ((Class203) class203_6_).anInt2417 * 1;
	((Class203) this).anInt2424 = 1 * ((Class203) class203_6_).anInt2424;
    }
    
    void method4084(Class203 class203_7_) {
	((Class203) this).aFloat2415 = ((Class203) class203_7_).aFloat2415;
	((Class203) this).aFloat2416 = ((Class203) class203_7_).aFloat2416;
	((Class203) this).anInt2423 = 1 * ((Class203) class203_7_).anInt2423;
	((Class203) this).anInt2418 = 1 * ((Class203) class203_7_).anInt2418;
	((Class203) this).anInt2417 = ((Class203) class203_7_).anInt2417 * 1;
	((Class203) this).anInt2424 = 1 * ((Class203) class203_7_).anInt2424;
    }
    
    void method4085(Class203 class203_8_) {
	((Class203) this).aFloat2415 = ((Class203) class203_8_).aFloat2415;
	((Class203) this).aFloat2416 = ((Class203) class203_8_).aFloat2416;
	((Class203) this).anInt2423 = 1 * ((Class203) class203_8_).anInt2423;
	((Class203) this).anInt2418 = 1 * ((Class203) class203_8_).anInt2418;
	((Class203) this).anInt2417 = ((Class203) class203_8_).anInt2417 * 1;
	((Class203) this).anInt2424 = 1 * ((Class203) class203_8_).anInt2424;
    }
    
    static final int method4086(int i, int i_9_, int i_10_, int i_11_) {
	if (i == i_9_)
	    return i;
	int i_12_ = 128 - i_10_;
	int i_13_ = (i & 0x7f) * i_12_ + i_10_ * (i_9_ & 0x7f) >> 7;
	int i_14_ = (i_9_ & 0x380) * i_10_ + (i & 0x380) * i_12_ >> 7;
	int i_15_ = (i & 0xfc00) * i_12_ + i_10_ * (i_9_ & 0xfc00) >> 7;
	return i_15_ & 0xfc00 | i_14_ & 0x380 | i_13_ & 0x7f;
    }
    
    static void method4087(Class103 class103, byte i) {
	if (null != Class16.aClass268_165) {
	    class103.method2309(Class16.aClass268_165);
	    class103.method2512(Class16.aClass266_167);
	    class103.method2445(Class16.anInt135 * 470717791,
				Class16.anInt177 * 1133839679,
				(Class16.anInt135 * 470717791
				 + -1801164387 * Class16.anInt163),
				(1914791371 * Class16.anInt181
				 + Class16.anInt177 * 1133839679));
	    class103.method2254(470717791 * Class16.anInt135,
				1133839679 * Class16.anInt177,
				Class16.anInt163 * -1801164387,
				Class16.anInt181 * 1914791371);
	}
    }
}
