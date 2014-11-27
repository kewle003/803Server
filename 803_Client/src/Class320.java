/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320
{
    public static Class320 aClass320_4873;
    public static Class320 aClass320_4874;
    public int anInt4875;
    public static Class320 aClass320_4876 = new Class320(8);
    static Class320 aClass320_4877;
    public static Class320 aClass320_4878;
    public static String osArchRaw;//aString4879
    
    Class320(int i) {
	anInt4875 = i * 1040107129;
    }
    
    static {
	aClass320_4874 = new Class320(16);
	aClass320_4873 = new Class320(8);
	aClass320_4878 = new Class320(16);
	aClass320_4877 = new Class320(32);
    }
    
    public static Class530[] method5924(short i) {
	return (new Class530[]
		{ Class530.aClass530_6946, Class530.aClass530_6948,
		  Class530.aClass530_6947 });
    }
    
    static final void method5925(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -89);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	Class119.setComponentTextFormat(class58, class35, class454, -1856761181);
    }
    
    static final void method5926(ClientScriptData class454, int i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_2_ = client.aClass220Array8426[i_1_].method4383((byte) 0);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_2_ == 5 ? 1 : 0;
    }
    
    static final void method5927
	(Class241_Sub11 class241_sub11, int i, int i_3_, int i_4_, int i_5_,
	 int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, short i_11_) {
	if (Class54.method1301(i, null, (byte) -78)) {
	    if (class241_sub11 != null
		&& !class241_sub11.method14939((byte) 4))
		Class40.method1047(class241_sub11, true, false, -1965799105);
	    else {
		InterfaceDefinition class35 = Class187.aClass35Array2203[i];
		client.method13623(class35, class35.method995(-273381241), -1,
				   i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_,
				   i_10_);
	    }
	}
    }
    
    static void method5928(InterfaceComponent class58, int i, int i_12_, short i_13_) {
	Class118 class118
	    = class58.method1518(Class236.aClass103_2713, -1057219818);
	if (null != class118) {
	    Class236.aClass103_2713.method2445(i, i_12_,
					       i + (439139681
						    * class58.anInt850),
					       (class58.scrollMinY * 1463495207
						+ i_12_));
	    if (630280401 * Class194.anInt2311 < 3) {
		int i_14_;
		if (4 == 115241065 * Class296.anInt4513)
		    i_14_ = (int) -((double) Class445_Sub16
						 .aClass351_Sub1_8660
						 .method6292((byte) 25)
				    * 2607.5945876176133);
		else
		    i_14_ = (int) -client.aFloat8581;
		i_14_ = 781361970 * client.anInt8513 + i_14_ & 0x3fff;
		i_14_ <<= 2;
		Class133.aClass168_1616.method3663
		    ((float) i + (float) (439139681 * class58.anInt850) / 2.0F,
		     ((float) i_12_
		      + (float) (1463495207 * class58.scrollMinY) / 2.0F),
		     4426, i_14_, class118.aClass135_1559, i, i_12_);
	    } else
		Class236.aClass103_2713
		    .method2495(-16777216, class118.aClass135_1559, i, i_12_);
	}
    }
    
    static final void method5929(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class415.method7488(-2005994539).getId((byte) 0);
    }
    
    public static void method5930(int i, int i_15_, int i_16_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC
		  .method18030(20, (long) i_15_ << 32 | (long) i);
	class241_sub39_sub13.method17278((byte) -79);
    }
}
