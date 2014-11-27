/* Class620 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class620
{
    static Class295 aClass295_7853 = new Class295(16, Class294.aClass294_4496);
    static int anInt7854;
    public static int[] anIntArray7855;
    static final int anInt7856 = 12;
    public static int[] anIntArray7857;
    public static int anInt7858;
    
    public static byte[] method13331(int i) {
	byte[] is = (byte[]) aClass295_7853.method5704(Integer.valueOf(i),
						       -1586416365);
	if (is == null) {
	    is = new byte[512];
	    Random random = new Random((long) i);
	    for (int i_0_ = 0; i_0_ < 255; i_0_++)
		is[i_0_] = (byte) i_0_;
	    for (int i_1_ = 0; i_1_ < 255; i_1_++) {
		int i_2_ = 255 - i_1_;
		int i_3_ = Class194.method3997(random, i_2_, (byte) -95);
		byte i_4_ = is[i_3_];
		is[i_3_] = is[i_2_];
		is[i_2_] = is[511 - i_1_] = i_4_;
	    }
	    aClass295_7853.method5705(Integer.valueOf(i), is, -797767292);
	}
	return is;
    }
    
    public static void method13332(int i, int i_5_, int i_6_) {
	if (anInt7858 * 1303509079 != i) {
	    anIntArray7855 = new int[i];
	    for (int i_7_ = 0; i_7_ < i; i_7_++)
		anIntArray7855[i_7_] = (i_7_ << 12) / i;
	    anInt7858 = i * -1105562777;
	}
	if (i_5_ != -1767907973 * anInt7854) {
	    if (i_5_ != anInt7858 * 1303509079) {
		anIntArray7857 = new int[i_5_];
		for (int i_8_ = 0; i_8_ < i_5_; i_8_++)
		    anIntArray7857[i_8_] = (i_8_ << 12) / i_5_;
	    } else
		anIntArray7857 = anIntArray7855;
	    anInt7854 = 449542579 * i_5_;
	}
    }
    
    public static byte[] method13333(int i, byte i_9_) {
	byte[] is = ((byte[])
		     aClass295_7853.method5704(Integer.valueOf(i), 112268543));
	if (is == null) {
	    is = new byte[512];
	    Random random = new Random((long) i);
	    for (int i_10_ = 0; i_10_ < 255; i_10_++)
		is[i_10_] = (byte) i_10_;
	    for (int i_11_ = 0; i_11_ < 255; i_11_++) {
		int i_12_ = 255 - i_11_;
		int i_13_ = Class194.method3997(random, i_12_, (byte) -19);
		byte i_14_ = is[i_13_];
		is[i_13_] = is[i_12_];
		is[i_12_] = is[511 - i_11_] = i_14_;
	    }
	    aClass295_7853.method5705(Integer.valueOf(i), is, -1604302097);
	}
	return is;
    }
    
    public static byte[] method13334(int i) {
	byte[] is = (byte[]) aClass295_7853.method5704(Integer.valueOf(i),
						       -1506124282);
	if (is == null) {
	    is = new byte[512];
	    Random random = new Random((long) i);
	    for (int i_15_ = 0; i_15_ < 255; i_15_++)
		is[i_15_] = (byte) i_15_;
	    for (int i_16_ = 0; i_16_ < 255; i_16_++) {
		int i_17_ = 255 - i_16_;
		int i_18_ = Class194.method3997(random, i_17_, (byte) -51);
		byte i_19_ = is[i_18_];
		is[i_18_] = is[i_17_];
		is[i_17_] = is[511 - i_16_] = i_19_;
	    }
	    aClass295_7853.method5705(Integer.valueOf(i), is, 1603009171);
	}
	return is;
    }
    
    public static void method13335(int i, int i_20_) {
	if (anInt7858 * 1303509079 != i) {
	    anIntArray7855 = new int[i];
	    for (int i_21_ = 0; i_21_ < i; i_21_++)
		anIntArray7855[i_21_] = (i_21_ << 12) / i;
	    anInt7858 = i * -1105562777;
	}
	if (i_20_ != -1767907973 * anInt7854) {
	    if (i_20_ != anInt7858 * 1303509079) {
		anIntArray7857 = new int[i_20_];
		for (int i_22_ = 0; i_22_ < i_20_; i_22_++)
		    anIntArray7857[i_22_] = (i_22_ << 12) / i_20_;
	    } else
		anIntArray7857 = anIntArray7855;
	    anInt7854 = 449542579 * i_20_;
	}
    }
    
    Class620() throws Throwable {
	throw new Error();
    }
    
    public static byte[] method13336(int i) {
	byte[] is = (byte[]) aClass295_7853.method5704(Integer.valueOf(i),
						       -817548503);
	if (is == null) {
	    is = new byte[512];
	    Random random = new Random((long) i);
	    for (int i_23_ = 0; i_23_ < 255; i_23_++)
		is[i_23_] = (byte) i_23_;
	    for (int i_24_ = 0; i_24_ < 255; i_24_++) {
		int i_25_ = 255 - i_24_;
		int i_26_ = Class194.method3997(random, i_25_, (byte) -1);
		byte i_27_ = is[i_26_];
		is[i_26_] = is[i_25_];
		is[i_25_] = is[511 - i_24_] = i_27_;
	    }
	    aClass295_7853.method5705(Integer.valueOf(i), is, -937246347);
	}
	return is;
    }
    
    static final void method13337(ClientScriptData class454, byte i) {
	int i_28_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_28_, (byte) -42);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_28_ >> 16];
	Class80.method1806(class58, class35, class454, -1172745154);
    }
    
    static final void method13338(ClientScriptData class454, int i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	int i_29_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = new StringBuilder().append(string).append
		  (HashTable.method7322(i_29_, true, 1663117747)).toString();
    }
    
    static final void method13339(byte i, int i_30_) {
	byte[][][] is = client.aClass238_8477.method4785(-1218485036);
	if (null == is) {
	    is = (new byte[4][client.aClass238_8477.method4744(-2067026709)]
		  [client.aClass238_8477.method4745(-544286340)]);
	    client.aClass238_8477.method4812(is, (byte) -2);
	}
	for (int i_31_ = 0; i_31_ < 4; i_31_++) {
	    for (int i_32_ = 0;
		 i_32_ < client.aClass238_8477.method4744(-1408468287);
		 i_32_++) {
		for (int i_33_ = 0;
		     i_33_ < client.aClass238_8477.method4745(-563353543);
		     i_33_++)
		    is[i_31_][i_32_][i_33_] = i;
	    }
	}
    }
    
    public static void method13340(int i, int i_34_) {
	if (Class393.method7054(-1676741262)) {
	    if (i != Class13.anInt81 * 1391949991)
		Class13.aLong82 = 7226492194362182485L;
	    Class13.anInt81 = i * 1017556759;
	    client.aClass190_8339.closeConnection(1826534912);
	    Class496.setClientStage(11, (byte) -18);
	}
    }
    
    public static int method13341(int i) {
	return 275753719 * Class487.anInt6480;
    }
}
