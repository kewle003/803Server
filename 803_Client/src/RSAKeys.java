/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class RSAKeys
{
    public static BigInteger aBigInteger182;
    static BigInteger LOGIN_MODULUS;//aBigInteger183
    static BigInteger LOGIN_PUBLIC_KEY = RS3Applet.RSA_PUBLIC_KEY;//new BigInteger("10001", 16);//aBigInteger184
    public static BigInteger aBigInteger185;
    
    static {
	LOGIN_MODULUS = RS3Applet.RSA_MODULUS;
	    /*= (new BigInteger
	       ("ade1e7f17db779f218f6cfb9ed630a75e32129bddb776a4094dad2be6911f6ed920dd81a0211a9fa6d769f2dca688087c5e82fd03b5a967d06d367720424da0cb5ec232d95241a7d98468acc445766b8cbe1c1261a1db9d491947fcf94bac33826b95d9b4027012be3cf0753cfc873e83798efa038078f4b966f465c19ee5675",
		16));*/
	aBigInteger185 = RS3Applet.RSA_PUBLIC_KEY;//new BigInteger("10001", 16);
	aBigInteger182 = RS3Applet.RSA_MODULUS;
	    /*= (new BigInteger
	       ("dce03007ab54d0efeaa016fe09a44c4a18ea4ee1c98b4e1ea55d4295a7fa350a2f6bac463b1fe80758c0bc9696adb59e108c2700add6fd3d0032f9dbe8d0603a8700e52d3f50f42ba09abe17be6224fe8c88a81d83e412c53bee120d4c2fc5d19e4d8463327f0a0ebdb237be3eaf4d67d6d56a02dd2ee28f66ae32b1981cdba25a46577830c5c70a6864dd6129496f2de6ba3d0888f355001af86b0e9e8d48c626bcd1afb0cd03e2a29da508d7ef4b14f3e2d39a7c24732659f08d43d7116d9b589777225e1cfd58f809b392c10a57936a1061716e34c6ed14e0567dba2ec5b70a86dd7a38c1cbb84718eb24520a12a95be44d6991676b2c086b1905f2c23ff8f869e4ff133cd0bf09d5e9f2a229b89600372ff113519b32c6e530a6ea7435718516ae36ff1a3fdb845ba009ab7a2d3494502523b098e3a131d34aac443a86240c50b4cff0adbecdd2776901ef38c24c7e1973e8024c89f0f09a85b5bf126fd78ab31c2258ae489967dfd01284c50b871ea4f96f4e23797f9a0394b9eb9ac5a4e401956e5718ee0d1cdad1c76a7d1d1b448178e5be905a49e37bb57edd7c5c9125d0eb62c6cca2ca900023230a5693ebeb17c2cbb5d367faa508c8fed0b6965a55c00700847929a5716e3cab5a9ff0eaf360638d415b32a14f1ec5fa77d57b9ca906712768a142cb2ad8fde952b3f4136e94c7406355ff2907506e9d68a5f081",
		16));*/
	new BigInteger("10001", 16);
	new BigInteger
	    ("c7ce9fb58e23f66f02f4236fd2f352690e34bf8165a579f3392fe42631594479ed45ae280c44594fa462d35f2294dbd053f993fd0e84016e1171e3b5ec0acc4b",
	     16);
    }
    
    RSAKeys() throws Throwable {
	throw new Error();
    }
    
    static final void method857(ClientScriptData class454, byte i) {
	Class241_Sub5_Sub9.aClass241_Sub9_11043.method14907
	    (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub14_8876,
	     (((ClientScriptData) class454).integerStack
	      [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]),
	     (byte) 2);
	client.aClass238_8477.method4768((byte) 5);
	Class167.method3600((short) 27813);
	client.aBool8297 = false;
    }
    
    static Class541 method858(Class475_Sub1_Sub1 class475_sub1_sub1, byte i) {
	Class541 class541;
	if (Class541.aClass541_7007 == null)
	    class541 = new Class541();
	else {
	    class541 = Class541.aClass541_7007;
	    Class541.aClass541_7007 = Class541.aClass541_7007.aClass541_7005;
	    class541.aClass541_7005 = null;
	    Class541.anInt7006 -= -1739665511;
	}
	class541.aClass475_Sub1_Sub1_7004 = class475_sub1_sub1;
	return class541;
    }
    
    static final void method859(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class67.method1644(class58, class35, class454, (byte) 1);
    }
    
    public static int method860(int i, int i_0_) {
	int i_1_ = i >>> 1;
	i_1_ |= i_1_ >>> 1;
	i_1_ |= i_1_ >>> 2;
	i_1_ |= i_1_ >>> 4;
	i_1_ |= i_1_ >>> 8;
	i_1_ |= i_1_ >>> 16;
	return i & (i_1_ ^ 0xffffffff);
    }
    
    static void method861(boolean bool, byte i) {
	GameScene class522 = Class21.myPlayer
				.method17801(2140204390);
	Class241_Sub39_Sub12 class241_sub39_sub12
	    = Class573_Sub1.method12651(127679513 * class522.baseX,
					class522.baseY * 468558693);
	if (null == class241_sub39_sub12)
	    class241_sub39_sub12
		= Class573_Sub1.method12560((Class573_Sub1.aClass497_7374
					     .anInt6529) * -431953051);
	if (Class423.aClass241_Sub39_Sub12_6067 != class241_sub39_sub12
	    || bool) {
	    Class423.aClass241_Sub39_Sub12_6067 = class241_sub39_sub12;
	    boolean bool_2_ = Class573_Sub1.method12558(class241_sub39_sub12);
	    if (bool_2_) {
		Class573_Sub1.aBool7423 = true;
		Class493.method11268(-299727358);
	    }
	}
    }
    
    static final void method862(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_3_, (byte) -88);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = -152977625 * class58.parentNode;
    }
}
