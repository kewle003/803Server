/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class247
{
    public Class247 aClass247_3971;
    public Class247 aClass247_3972;
    
    public void method4943() {
	if (aClass247_3971 != null) {
	    aClass247_3971.aClass247_3972 = aClass247_3972;
	    aClass247_3972.aClass247_3971 = aClass247_3971;
	    aClass247_3972 = null;
	    aClass247_3971 = null;
	}
    }
    
    public void method4944(byte i) {
	if (aClass247_3971 != null) {
	    aClass247_3971.aClass247_3972 = aClass247_3972;
	    aClass247_3972.aClass247_3971 = aClass247_3971;
	    aClass247_3972 = null;
	    aClass247_3971 = null;
	}
    }
    
    static final long method4945(byte i) {
	return (((long) ((Class450.anInt6206 += -1373652189) * 1423789195 - 1)
		 << 32)
		| 0xffffffffL);
    }
    
    static final void method4946(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = SoundManager.method1246(i_0_, i_1_, true, 796537677);
    }
    
    static final void method4947(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (-1617461639
	       * Class21.myPlayer.anInt11502);
    }
    
    static final void method4948(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = client.anInt8275 * -359762931;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -2013609075 * client.anInt8431;
    }
    
    static void method4949(int i, int i_2_, boolean bool, byte i_3_) {
	Class458.aBoolArrayArray6260[i][i_2_] = bool;
    }
    
    public static final void method4950(int i, int i_4_, int i_5_, int i_6_,
					int i_7_, byte i_8_) {
		Class421.anInt6040 = i * 1596135215;
		Class380_Sub2.anInt10409 = i_4_ * 1825904949;
		Class327.anInt5020 = 1659058105 * i_5_;
		Class180.anInt2136 = -363536155 * i_6_;
		Class62.anInt1029 = i_7_ * 458918151;
		if (115241065 * Class296.anInt4513 == 4)
		    Class509.method11526(-921995345);
		if (Class62.anInt1029 * -1737452361 >= 100) {
		    int i_9_ = Class421.anInt6040 * -954229248 + 256;
		    int i_10_ = Class380_Sub2.anInt10409 * 174209536 + 256;
		    int i_11_ = (Class96_Sub5.method16046(i_9_, i_10_,
							  (993680393
							   * Class357_Sub1.anInt10357),
							  342997902)
				 - Class327.anInt5020 * 1939578505);
		    int i_12_ = i_9_ - 133333741 * Class462.anInt6284;
		    int i_13_ = i_11_ - -781800491 * Class175.anInt2123;
		    int i_14_ = i_10_ - -271636831 * Class636.anInt8248;
		    int i_15_
			= (int) Math.sqrt((double) (i_12_ * i_12_ + i_14_ * i_14_));
		    Class496.anInt6527
			= ((int) (Math.atan2((double) i_13_, (double) i_15_)
				  * 2607.5945876176133)
			   & 0x3fff) * 709117373;
		    Class322.anInt4909
			= ((int) (Math.atan2((double) i_12_, (double) i_14_)
				  * -2607.5945876176133)
			   & 0x3fff) * 2118136689;
		    Class120_Sub18.anInt10605 = 0;
		    if (Class496.anInt6527 * -1323229803 < 1024)
			Class496.anInt6527 = 286716928;
		    if (-1323229803 * Class496.anInt6527 > 3072)
			Class496.anInt6527 = 860150784;
		}
		Class296.anInt4513 = 1415978969;
		Class254.anInt4134 = -162819257;
		Class245.anInt3961 = -1540801703;
    }
    
    static final void method4951(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_16_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_17_ = (((ClientScriptData) class454).integerStack
		     [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	int i_18_ = (((ClientScriptData) class454).integerStack
		     [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_18_, (byte) -120);
	Class109.method2766(class58, i_16_, i_17_, 16711935);
    }
    
    public static String method4952(long l, int i, boolean bool,
				    Language class437, int i_19_) {
	char c = ',';
	char c_20_ = '.';
	if (class437 == Language.LOCALE_EN) {
	    c = '.';
	    c_20_ = ',';
	}
	if (Language.aClass437_6130 == class437)
	    c_20_ = '\u00a0';
	boolean bool_21_ = false;
	if (l < 0L) {
	    bool_21_ = true;
	    l = -l;
	}
	StringBuilder stringbuilder = new StringBuilder(26);
	if (i > 0) {
	    for (int i_22_ = 0; i_22_ < i; i_22_++) {
		int i_23_ = (int) l;
		l /= 10L;
		stringbuilder.append((char) (i_23_ + 48 - (int) l * 10));
	    }
	    stringbuilder.append(c);
	}
	int i_24_ = 0;
	for (;;) {
	    int i_25_ = (int) l;
	    l /= 10L;
	    stringbuilder.append((char) (48 + i_25_ - (int) l * 10));
	    if (0L == l)
		break;
	    if (bool && ++i_24_ % 3 == 0)
		stringbuilder.append(c_20_);
	}
	if (bool_21_)
	    stringbuilder.append('-');
	return stringbuilder.reverse().toString();
    }
}
