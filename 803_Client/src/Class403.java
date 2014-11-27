/* Class403 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class403 implements Iterator<Object>
{
    int anInt5874;
    HashTable aClass407_5875;
    Node aClass241_5876;
    Node aClass241_5877 = null;
    
    public boolean method7196() {
	if ((((HashTable) ((Class403) this).aClass407_5875).aClass241Array5907
	     [1861022683 * ((Class403) this).anInt5874 - 1])
	    != ((Class403) this).aClass241_5876)
	    return true;
	while (1861022683 * ((Class403) this).anInt5874
	       < (130185305
		  * ((HashTable) ((Class403) this).aClass407_5875).anInt5910)) {
	    if ((((HashTable) ((Class403) this).aClass407_5875)
		 .aClass241Array5907
		 [(((Class403) this).anInt5874 += 1821495379) * 1861022683 - 1]
		 .previousNode)
		!= (((HashTable) ((Class403) this).aClass407_5875)
		    .aClass241Array5907
		    [1861022683 * ((Class403) this).anInt5874 - 1])) {
		((Class403) this).aClass241_5876
		    = (((HashTable) ((Class403) this).aClass407_5875)
		       .aClass241Array5907
		       [((Class403) this).anInt5874 * 1861022683 - 1]
		       .previousNode);
		return true;
	    }
	    ((Class403) this).aClass241_5876
		= (((HashTable) ((Class403) this).aClass407_5875)
		   .aClass241Array5907
		   [1861022683 * ((Class403) this).anInt5874 - 1]);
	}
	return false;
    }
    
    void method7197(byte i) {
	((Class403) this).aClass241_5876
	    = (((HashTable) ((Class403) this).aClass407_5875).aClass241Array5907
	       [0].previousNode);
	((Class403) this).anInt5874 = 1821495379;
	((Class403) this).aClass241_5877 = null;
    }
    
    public Class403(HashTable class407) {
		((Class403) this).aClass407_5875 = class407;
		method7197((byte) -100);
    }
    
    public Object next() {
	if ((((HashTable) ((Class403) this).aClass407_5875).aClass241Array5907
	     [1861022683 * ((Class403) this).anInt5874 - 1])
	    != ((Class403) this).aClass241_5876) {
	    Node class241 = ((Class403) this).aClass241_5876;
	    ((Class403) this).aClass241_5876 = class241.previousNode;
	    ((Class403) this).aClass241_5877 = class241;
	    return class241;
	}
	while (((Class403) this).anInt5874 * 1861022683
	       < (((HashTable) ((Class403) this).aClass407_5875).anInt5910
		  * 130185305)) {
	    Node class241
		= (((HashTable) ((Class403) this).aClass407_5875)
		   .aClass241Array5907
		   [((((Class403) this).anInt5874 += 1821495379) * 1861022683
		     - 1)]
		   .previousNode);
	    if (class241 != (((HashTable) ((Class403) this).aClass407_5875)
			     .aClass241Array5907
			     [((Class403) this).anInt5874 * 1861022683 - 1])) {
		((Class403) this).aClass241_5876 = class241.previousNode;
		((Class403) this).aClass241_5877 = class241;
		return class241;
	    }
	}
	return null;
    }
    
    public boolean hasNext() {
	if ((((HashTable) ((Class403) this).aClass407_5875).aClass241Array5907
	     [1861022683 * ((Class403) this).anInt5874 - 1])
	    != ((Class403) this).aClass241_5876)
	    return true;
	while (1861022683 * ((Class403) this).anInt5874
	       < (130185305
		  * ((HashTable) ((Class403) this).aClass407_5875).anInt5910)) {
	    if ((((HashTable) ((Class403) this).aClass407_5875)
		 .aClass241Array5907
		 [(((Class403) this).anInt5874 += 1821495379) * 1861022683 - 1]
		 .previousNode)
		!= (((HashTable) ((Class403) this).aClass407_5875)
		    .aClass241Array5907
		    [1861022683 * ((Class403) this).anInt5874 - 1])) {
		((Class403) this).aClass241_5876
		    = (((HashTable) ((Class403) this).aClass407_5875)
		       .aClass241Array5907
		       [((Class403) this).anInt5874 * 1861022683 - 1]
		       .previousNode);
		return true;
	    }
	    ((Class403) this).aClass241_5876
		= (((HashTable) ((Class403) this).aClass407_5875)
		   .aClass241Array5907
		   [1861022683 * ((Class403) this).anInt5874 - 1]);
	}
	return false;
    }
    
    public void remove() {
	if (null == ((Class403) this).aClass241_5877)
	    throw new IllegalStateException();
	((Class403) this).aClass241_5877.remove((byte) 36);
	((Class403) this).aClass241_5877 = null;
    }
    
    public void method7198() {
	if (null == ((Class403) this).aClass241_5877)
	    throw new IllegalStateException();
	((Class403) this).aClass241_5877.remove((byte) 36);
	((Class403) this).aClass241_5877 = null;
    }
    
    public Object method7199() {
	if ((((HashTable) ((Class403) this).aClass407_5875).aClass241Array5907
	     [1861022683 * ((Class403) this).anInt5874 - 1])
	    != ((Class403) this).aClass241_5876) {
	    Node class241 = ((Class403) this).aClass241_5876;
	    ((Class403) this).aClass241_5876 = class241.previousNode;
	    ((Class403) this).aClass241_5877 = class241;
	    return class241;
	}
	while (((Class403) this).anInt5874 * 1861022683
	       < (((HashTable) ((Class403) this).aClass407_5875).anInt5910
		  * 130185305)) {
	    Node class241
		= (((HashTable) ((Class403) this).aClass407_5875)
		   .aClass241Array5907
		   [((((Class403) this).anInt5874 += 1821495379) * 1861022683
		     - 1)]
		   .previousNode);
	    if (class241 != (((HashTable) ((Class403) this).aClass407_5875)
			     .aClass241Array5907
			     [((Class403) this).anInt5874 * 1861022683 - 1])) {
		((Class403) this).aClass241_5876 = class241.previousNode;
		((Class403) this).aClass241_5877 = class241;
		return class241;
	    }
	}
	return null;
    }
    
    public boolean method7200() {
	if ((((HashTable) ((Class403) this).aClass407_5875).aClass241Array5907
	     [1861022683 * ((Class403) this).anInt5874 - 1])
	    != ((Class403) this).aClass241_5876)
	    return true;
	while (1861022683 * ((Class403) this).anInt5874
	       < (130185305
		  * ((HashTable) ((Class403) this).aClass407_5875).anInt5910)) {
	    if ((((HashTable) ((Class403) this).aClass407_5875)
		 .aClass241Array5907
		 [(((Class403) this).anInt5874 += 1821495379) * 1861022683 - 1]
		 .previousNode)
		!= (((HashTable) ((Class403) this).aClass407_5875)
		    .aClass241Array5907
		    [1861022683 * ((Class403) this).anInt5874 - 1])) {
		((Class403) this).aClass241_5876
		    = (((HashTable) ((Class403) this).aClass407_5875)
		       .aClass241Array5907
		       [((Class403) this).anInt5874 * 1861022683 - 1]
		       .previousNode);
		return true;
	    }
	    ((Class403) this).aClass241_5876
		= (((HashTable) ((Class403) this).aClass407_5875)
		   .aClass241Array5907
		   [1861022683 * ((Class403) this).anInt5874 - 1]);
	}
	return false;
    }
    
    public boolean method7201() {
	if ((((HashTable) ((Class403) this).aClass407_5875).aClass241Array5907
	     [1861022683 * ((Class403) this).anInt5874 - 1])
	    != ((Class403) this).aClass241_5876)
	    return true;
	while (1861022683 * ((Class403) this).anInt5874
	       < (130185305
		  * ((HashTable) ((Class403) this).aClass407_5875).anInt5910)) {
	    if ((((HashTable) ((Class403) this).aClass407_5875)
		 .aClass241Array5907
		 [(((Class403) this).anInt5874 += 1821495379) * 1861022683 - 1]
		 .previousNode)
		!= (((HashTable) ((Class403) this).aClass407_5875)
		    .aClass241Array5907
		    [1861022683 * ((Class403) this).anInt5874 - 1])) {
		((Class403) this).aClass241_5876
		    = (((HashTable) ((Class403) this).aClass407_5875)
		       .aClass241Array5907
		       [((Class403) this).anInt5874 * 1861022683 - 1]
		       .previousNode);
		return true;
	    }
	    ((Class403) this).aClass241_5876
		= (((HashTable) ((Class403) this).aClass407_5875)
		   .aClass241Array5907
		   [1861022683 * ((Class403) this).anInt5874 - 1]);
	}
	return false;
    }
    
    public boolean method7202() {
	if ((((HashTable) ((Class403) this).aClass407_5875).aClass241Array5907
	     [1861022683 * ((Class403) this).anInt5874 - 1])
	    != ((Class403) this).aClass241_5876)
	    return true;
	while (1861022683 * ((Class403) this).anInt5874
	       < (130185305
		  * ((HashTable) ((Class403) this).aClass407_5875).anInt5910)) {
	    if ((((HashTable) ((Class403) this).aClass407_5875)
		 .aClass241Array5907
		 [(((Class403) this).anInt5874 += 1821495379) * 1861022683 - 1]
		 .previousNode)
		!= (((HashTable) ((Class403) this).aClass407_5875)
		    .aClass241Array5907
		    [1861022683 * ((Class403) this).anInt5874 - 1])) {
		((Class403) this).aClass241_5876
		    = (((HashTable) ((Class403) this).aClass407_5875)
		       .aClass241Array5907
		       [((Class403) this).anInt5874 * 1861022683 - 1]
		       .previousNode);
		return true;
	    }
	    ((Class403) this).aClass241_5876
		= (((HashTable) ((Class403) this).aClass407_5875)
		   .aClass241Array5907
		   [1861022683 * ((Class403) this).anInt5874 - 1]);
	}
	return false;
    }
    
    public Object method7203() {
	if ((((HashTable) ((Class403) this).aClass407_5875).aClass241Array5907
	     [1861022683 * ((Class403) this).anInt5874 - 1])
	    != ((Class403) this).aClass241_5876) {
	    Node class241 = ((Class403) this).aClass241_5876;
	    ((Class403) this).aClass241_5876 = class241.previousNode;
	    ((Class403) this).aClass241_5877 = class241;
	    return class241;
	}
	while (((Class403) this).anInt5874 * 1861022683
	       < (((HashTable) ((Class403) this).aClass407_5875).anInt5910
		  * 130185305)) {
	    Node class241
		= (((HashTable) ((Class403) this).aClass407_5875)
		   .aClass241Array5907
		   [((((Class403) this).anInt5874 += 1821495379) * 1861022683
		     - 1)]
		   .previousNode);
	    if (class241 != (((HashTable) ((Class403) this).aClass407_5875)
			     .aClass241Array5907
			     [((Class403) this).anInt5874 * 1861022683 - 1])) {
		((Class403) this).aClass241_5876 = class241.previousNode;
		((Class403) this).aClass241_5877 = class241;
		return class241;
	    }
	}
	return null;
    }
    
    public void method7204() {
	if (null == ((Class403) this).aClass241_5877)
	    throw new IllegalStateException();
	((Class403) this).aClass241_5877.remove((byte) 36);
	((Class403) this).aClass241_5877 = null;
    }
    
    public void method7205() {
	if (null == ((Class403) this).aClass241_5877)
	    throw new IllegalStateException();
	((Class403) this).aClass241_5877.remove((byte) 36);
	((Class403) this).aClass241_5877 = null;
    }
    
    public Node method7206(int i) {
	method7197((byte) -34);
	return (Node) next();
    }
    
    void method7207() {
	((Class403) this).aClass241_5876
	    = (((HashTable) ((Class403) this).aClass407_5875).aClass241Array5907
	       [0].previousNode);
	((Class403) this).anInt5874 = 1821495379;
	((Class403) this).aClass241_5877 = null;
    }
    
    public Node method7208() {
	method7197((byte) -40);
	return (Node) next();
    }
    
    public static void method7209(byte i) {
	if (Class68.aClass359Array1065 == null) {
	    Class68.aClass359Array1065 = LoadingScreenDef.method6479(1100232322);
	    Class86.currentLoadingStage = Class68.aClass359Array1065[0];
	    Class445_Sub3.aLong8621
		= Class50.method1249((byte) 1) * -4219732048522441833L;
	}
	if (null == CcDeltaNode.aClass70_9022)
	    Class524.method11748(231320637);
	LoadingScreenDef class359 = Class86.currentLoadingStage;
	int i_0_ = Class118.runClientLoading((byte) 18);
	if (Class86.currentLoadingStage == class359) {
	    Class116.aString1545
		= ((LoadingScreenDef) Class86.currentLoadingStage).aClass635_5476
		      .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 18396);
	    Class115.aString1536 = Class116.aString1545;
	    if (((LoadingScreenDef) Class86.currentLoadingStage).aBool5499)
		Class474.anInt6386
		    = (-1148753783
		       * ((i_0_
			   * ((633090493
			       * ((LoadingScreenDef) Class86.currentLoadingStage).anInt5497)
			      - (-1299978731
				 * (((LoadingScreenDef) Class86.currentLoadingStage)
				    .anInt5496)))
			   / 100)
			  + -1299978731 * (((LoadingScreenDef) Class86.currentLoadingStage)
					   .anInt5496)));
	    if (((LoadingScreenDef) Class86.currentLoadingStage).aBool5498)
		Class115.aString1536
		    = new StringBuilder().append(Class115.aString1536).append
			  (" - ").append
			  (159550905 * Class474.anInt6386).append
			  ("%").toString();
	} else if (Class86.currentLoadingStage == LoadingScreenDef.LOADING_STAGE_17) {
	    CcDeltaNode.aClass70_9022 = null;
	    Class496.setClientStage(17, (byte) -100);
	    if (Class68.aBool1064) {
		Class68.aBool1064 = false;
		Class241_Sub11.method14943(Class349.aString5383,
					   Class445_Sub11.aString8646,
					   -1521847758);
	    }
	} else {
	    Class116.aString1545
		= ((LoadingScreenDef) class359).aClass635_5495
		      .getLocalisedMessage(VarPlayerDomain.currentLocale, (short) 29900);
	    Class115.aString1536 = Class116.aString1545;
	    if (((LoadingScreenDef) Class86.currentLoadingStage).aBool5498)
		Class115.aString1536
		    = new StringBuilder().append(Class115.aString1536).append
			  (((LoadingScreenDef) class359).anInt5497 * 633090493).append
			  ("%").toString();
	    Class474.anInt6386 = ((LoadingScreenDef) class359).anInt5497 * -275356123;
	    if (((LoadingScreenDef) Class86.currentLoadingStage).aBool5499
		|| ((LoadingScreenDef) class359).aBool5499)
		Class445_Sub3.aLong8621
		    = Class50.method1249((byte) 1) * -4219732048522441833L;
	}
	if (CcDeltaNode.aClass70_9022 != null) {
	    CcDeltaNode.aClass70_9022.method1696
		(520848576188654631L * Class445_Sub3.aLong8621,
		 Class116.aString1545, Class115.aString1536,
		 Class474.anInt6386 * 159550905, Class86.currentLoadingStage,
		 -1538270426);
	    if (Class68.anInterface37Array1056 != null) {
		for (int i_1_ = 1698263199 * Class68.anInt1059 + 1;
		     i_1_ < Class68.anInterface37Array1056.length; i_1_++) {
		    if (Class68.anInterface37Array1056[i_1_]
			    .method199(-617642702) >= 100
			&& Class68.anInt1059 * 1698263199 == i_1_ - 1
			&& 1766317249 * client.anInt8288 != 0
			&& CcDeltaNode.aClass70_9022
			       .method1694(1242050872)) {
			try {
			    Class68.anInterface37Array1056[i_1_]
				.method195(-1477543924);
			} catch (Exception exception) {
			    Class68.anInterface37Array1056 = null;
			    break;
			}
			CcDeltaNode.aClass70_9022.method1695
			    (Class68.anInterface37Array1056[i_1_],
			     -1588970183);
			Class68.anInt1059 += -1586779297;
			if ((1698263199 * Class68.anInt1059
			     >= Class68.anInterface37Array1056.length - 1)
			    && Class68.anInterface37Array1056.length > 1)
			    Class68.anInt1059 = (Class68.aClass615_1060
						     .method13252(1916895623)
						 ? 0 : -1) * -1586779297;
		    }
		}
	    }
	}
    }
    
    static int method7210(CharSequence charsequence, int i, boolean bool,
			  byte i_2_) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_3_ = false;
	boolean bool_4_ = false;
	int i_5_ = 0;
	int i_6_ = charsequence.length();
	for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
	    int i_8_ = charsequence.charAt(i_7_);
	    if (0 == i_7_) {
		if (45 == i_8_) {
		    bool_3_ = true;
		    continue;
		}
		if (i_8_ == 43 && bool)
		    continue;
	    }
	    if (i_8_ >= 48 && i_8_ <= 57)
		i_8_ -= 48;
	    else if (i_8_ >= 65 && i_8_ <= 90)
		i_8_ -= 55;
	    else if (i_8_ >= 97 && i_8_ <= 122)
		i_8_ -= 87;
	    else
		throw new NumberFormatException();
	    if (i_8_ >= i)
		throw new NumberFormatException();
	    if (bool_3_)
		i_8_ = -i_8_;
	    int i_9_ = i * i_5_ + i_8_;
	    if (i_5_ != i_9_ / i)
		throw new NumberFormatException();
	    i_5_ = i_9_;
	    bool_4_ = true;
	}
	if (!bool_4_)
	    throw new NumberFormatException();
	return i_5_;
    }
    
    static void method7211(Class268 class268, boolean bool, float f,
			   float f_10_, float f_11_, float f_12_, int i,
			   int i_13_, int i_14_) {
	int i_15_ = client.aClass238_8477.method4750(305690433);
	int i_16_ = client.aClass238_8477.method4749((byte) 73);
	class268.method5268(f, f_10_, f_11_, f_12_, (float) i_16_,
			    (float) i_15_, (float) i, (float) i_13_);
    }
    
    public static void method7212(int i, int i_17_, int i_18_, int i_19_,
				  int i_20_, int i_21_, String string,
				  int i_22_) {
	Class247_Sub6 class247_sub6 = new Class247_Sub6();
	((Class247_Sub6) class247_sub6).anInt10278 = 269129049 * i;
	((Class247_Sub6) class247_sub6).anInt10277 = i_17_ * -224913819;
	((Class247_Sub6) class247_sub6).anInt10279 = i_18_ * -1759910539;
	((Class247_Sub6) class247_sub6).anInt10282
	    = -1081923851 * (i_20_ + client.anInt8296);
	((Class247_Sub6) class247_sub6).anInt10280 = i_19_ * 388744985;
	((Class247_Sub6) class247_sub6).aString10283 = string;
	((Class247_Sub6) class247_sub6).anInt10281 = i_21_ * 1041217817;
	client.aClass421_8376.method7522(class247_sub6, -1665299415);
    }
    
    static final void method7213(ClientScriptData class454, int i) {
	int i_23_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_23_, (byte) -111);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_23_ >> 16];
	Class281.method5488(class58, class35, false, 2, class454, 1519440331);
    }
    
    static final void method7214(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_24_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_25_ = (((ClientScriptData) class454).integerStack
		     [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	if (i_24_ > 700 || i_25_ > 700)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 256;
	double d = ((Math.random() * (double) (i_24_ + i_25_) - (double) i_24_
		     + 800.0)
		    / 100.0);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) (Math.pow(2.0, d) + 0.5);
    }
}
