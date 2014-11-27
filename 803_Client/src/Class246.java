/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;

public class Class246
{
    static int anInt3962 = 0;
    int anInt3963;
    LinkedList aLinkedList3964;
    int[] anIntArray3965;
    int[] anIntArray3966;
    public Class89 aClass89_3967;
    int anInt3968;
    boolean aBool3969;
    public static int anInt3970;
    
    public void method4921(Class552 class552) {
	if (class552 != null && -926687299 * anInt3963 > 0) {
	    method4924(class552, 1248076395);
	    Iterator iterator = aLinkedList3964.iterator();
	    while (iterator.hasNext()) {
		Class475_Sub1_Sub1_Sub6 class475_sub1_sub1_sub6
		    = (Class475_Sub1_Sub1_Sub6) iterator.next();
		class552.method12225(class475_sub1_sub1_sub6, false,
				     -1105367175);
	    }
	    aBool3969 = true;
	}
    }
    
    Class89 method4922(Class103 class103, byte i) {
	Class161 class161
	    = Class161.method3448(Class508.MODELS_ARCHIVE,
				  973379109 * anInt3968, 0);
	if (null == class161)
	    return null;
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	return class103.method2356(class161, 2048, -1217417407 * anInt3962, 64,
				   768);
    }
    
    public void method4923(Class552 class552, byte i) {
	if (class552 != null && -926687299 * anInt3963 > 0) {
	    method4924(class552, 1261063268);
	    Iterator iterator = aLinkedList3964.iterator();
	    while (iterator.hasNext()) {
		Class475_Sub1_Sub1_Sub6 class475_sub1_sub1_sub6
		    = (Class475_Sub1_Sub1_Sub6) iterator.next();
		class552.method12225(class475_sub1_sub1_sub6, false,
				     -1494747773);
	    }
	    aBool3969 = true;
	}
    }
    
    public Class246(Class103 class103, RSByteBuffer class241_sub3, int i) {
	anInt3968 = -1970825811 * i;
	anInt3963
	    = class241_sub3.readSmart49152(1953414769) * -1118907499;
	anIntArray3965
	    = new int[anInt3963 * -926687299];
	anIntArray3966
	    = new int[anInt3963 * -926687299];
	int i_0_ = class241_sub3.readUnsignedShort(1162222719);
	int i_1_ = class241_sub3.readUnsignedShort(1162222719);
	for (int i_2_ = 0; i_2_ < -926687299 * anInt3963;
	     i_2_++) {
	    anIntArray3965[i_2_]
		= i_0_ + class241_sub3.getByte(670233447);
	    anIntArray3966[i_2_]
		= i_1_ + class241_sub3.getByte(-319724637);
	}
	aClass89_3967 = method4922(class103, (byte) 51);
    }
    
    void method4924(Class552 class552, int i) {
	aLinkedList3964 = new LinkedList();
	Class215 class215 = client.aClass238_8477.method4753((byte) -77);
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	GameScene class522_3_
	    = new GameScene(993680393 * Class357_Sub1.anInt10357,
			   anIntArray3965[0],
			   anIntArray3966[0]);
	for (int i_4_ = 1; i_4_ < -926687299 * anInt3963;
	     i_4_++) {
	    GameScene class522_5_
		= new GameScene(993680393 * Class357_Sub1.anInt10357,
			       anIntArray3965[i_4_],
			       anIntArray3966[i_4_]);
	    while ((class522_3_.baseX * 127679513
		    != 127679513 * class522_5_.baseX)
		   || (class522_3_.baseY * 468558693
		       != 468558693 * class522_5_.baseY)) {
		if (class522_3_.baseX * 127679513
		    < 127679513 * class522_5_.baseX)
		    class522_3_.baseX += 1259954217;
		else if (127679513 * class522_3_.baseX
			 > 127679513 * class522_5_.baseX)
		    class522_3_.baseX -= 1259954217;
		if (class522_3_.baseY * 468558693
		    < class522_5_.baseY * 468558693)
		    class522_3_.baseY += 1008719469;
		else if (class522_3_.baseY * 468558693
			 > class522_5_.baseY * 468558693)
		    class522_3_.baseY -= 1008719469;
		int i_6_ = Class357_Sub1.anInt10357 * 993680393;
		int i_7_ = (class522_3_.baseX * 127679513
			    - 127679513 * class522.baseX);
		int i_8_ = (468558693 * class522_3_.baseY
			    - 468558693 * class522.baseY);
		if (i_7_ >= 0 && i_7_ < class552.anInt7138 * 120442351
		    && i_8_ >= 0 && i_8_ < -2069974325 * class552.anInt7142) {
		    int i_9_ = 256 + (i_7_ << 9);
		    int i_10_ = 256 + (i_8_ << 9);
		    if (class215.method4331(i_7_, i_8_, 528858768))
			i_6_++;
		    aLinkedList3964.add
			(new Class475_Sub1_Sub1_Sub6
			 (class552, this, Class357_Sub1.anInt10357 * 993680393,
			  i_6_, i_9_,
			  Class96_Sub5.method16046(i_9_, i_10_,
						   (Class357_Sub1.anInt10357
						    * 993680393),
						   -389307577),
			  i_10_));
		}
	    }
	    class522_3_ = class522_5_;
	}
    }
    
    public void method4925(byte i) {
	aBool3969 = false;
	aClass89_3967 = null;
    }
    
    public boolean method4926(int i) {
	return aBool3969;
    }
    
    public boolean method4927(Class103 class103, byte i) {
	aClass89_3967 = method4922(class103, (byte) 18);
	return null != aClass89_3967;
    }
    
    Class89 method4928(Class103 class103) {
	Class161 class161
	    = Class161.method3448(Class508.MODELS_ARCHIVE,
				  973379109 * anInt3968, 0);
	if (null == class161)
	    return null;
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	return class103.method2356(class161, 2048, -1217417407 * anInt3962, 64,
				   768);
    }
    
    public void method4929() {
	aBool3969 = false;
	aClass89_3967 = null;
    }
    
    public void method4930(Class552 class552) {
	if (class552 != null && -926687299 * anInt3963 > 0) {
	    method4924(class552, 259394350);
	    Iterator iterator = aLinkedList3964.iterator();
	    while (iterator.hasNext()) {
		Class475_Sub1_Sub1_Sub6 class475_sub1_sub1_sub6
		    = (Class475_Sub1_Sub1_Sub6) iterator.next();
		class552.method12225(class475_sub1_sub1_sub6, false,
				     -2144844263);
	    }
	    aBool3969 = true;
	}
    }
    
    public static void method4931(int i) {
	anInt3962 = 309649601 * i;
    }
    
    void method4932(Class552 class552) {
	aLinkedList3964 = new LinkedList();
	Class215 class215 = client.aClass238_8477.method4753((byte) -31);
	GameScene class522 = client.aClass238_8477.method4806((byte) 1);
	GameScene class522_11_
	    = new GameScene(993680393 * Class357_Sub1.anInt10357,
			   anIntArray3965[0],
			   anIntArray3966[0]);
	for (int i = 1; i < -926687299 * anInt3963; i++) {
	    GameScene class522_12_
		= new GameScene(993680393 * Class357_Sub1.anInt10357,
			       anIntArray3965[i],
			       anIntArray3966[i]);
	    while ((class522_11_.baseX * 127679513
		    != 127679513 * class522_12_.baseX)
		   || (class522_11_.baseY * 468558693
		       != 468558693 * class522_12_.baseY)) {
		if (class522_11_.baseX * 127679513
		    < 127679513 * class522_12_.baseX)
		    class522_11_.baseX += 1259954217;
		else if (127679513 * class522_11_.baseX
			 > 127679513 * class522_12_.baseX)
		    class522_11_.baseX -= 1259954217;
		if (class522_11_.baseY * 468558693
		    < class522_12_.baseY * 468558693)
		    class522_11_.baseY += 1008719469;
		else if (class522_11_.baseY * 468558693
			 > class522_12_.baseY * 468558693)
		    class522_11_.baseY -= 1008719469;
		int i_13_ = Class357_Sub1.anInt10357 * 993680393;
		int i_14_ = (class522_11_.baseX * 127679513
			     - 127679513 * class522.baseX);
		int i_15_ = (468558693 * class522_11_.baseY
			     - 468558693 * class522.baseY);
		if (i_14_ >= 0 && i_14_ < class552.anInt7138 * 120442351
		    && i_15_ >= 0
		    && i_15_ < -2069974325 * class552.anInt7142) {
		    int i_16_ = 256 + (i_14_ << 9);
		    int i_17_ = 256 + (i_15_ << 9);
		    if (class215.method4331(i_14_, i_15_, 906815529))
			i_13_++;
		    aLinkedList3964.add
			(new Class475_Sub1_Sub1_Sub6
			 (class552, this, Class357_Sub1.anInt10357 * 993680393,
			  i_13_, i_16_,
			  Class96_Sub5.method16046(i_16_, i_17_,
						   (Class357_Sub1.anInt10357
						    * 993680393),
						   1276773536),
			  i_17_));
		}
	    }
	    class522_11_ = class522_12_;
	}
    }
    
    public static void method4933(int i) {
	anInt3962 = 309649601 * i;
    }
    
    public boolean method4934() {
	return aBool3969;
    }
    
    public void method4935(Class552 class552, int i) {
	if (class552 != null && null != aLinkedList3964) {
	    Iterator iterator = aLinkedList3964.iterator();
	    while (iterator.hasNext()) {
		Class475_Sub1_Sub1_Sub6 class475_sub1_sub1_sub6
		    = (Class475_Sub1_Sub1_Sub6) iterator.next();
		class552.method12117(class475_sub1_sub1_sub6.nodePlane,
				     class475_sub1_sub1_sub6.aShort10717,
				     class475_sub1_sub1_sub6.aShort10718,
				     new Class588(class475_sub1_sub1_sub6),
				     (byte) 1);
	    }
	}
    }
    
    public boolean method4936() {
	return aBool3969;
    }
    
    Class89 method4937(Class103 class103) {
	Class161 class161
	    = Class161.method3448(Class508.MODELS_ARCHIVE,
				  973379109 * anInt3968, 0);
	if (null == class161)
	    return null;
	if (class161.anInt1789 < 13)
	    class161.method3464(2);
	return class103.method2356(class161, 2048, -1217417407 * anInt3962, 64,
				   768);
    }
    
    public boolean method4938(Class103 class103) {
	aClass89_3967 = method4922(class103, (byte) 79);
	return null != aClass89_3967;
    }
    
    public boolean method4939(Class103 class103) {
	aClass89_3967 = method4922(class103, (byte) 21);
	return null != aClass89_3967;
    }
    
    static void method4940(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [1482319719 * ((ClientScriptData) class454).intStackPointer - 2]
	    = (Class326_Sub3.aClass482_10288.method11010
	       ((((ClientScriptData) class454).integerStack
		 [1482319719 * ((ClientScriptData) class454).intStackPointer - 2]),
		(short) -19827)
	       .anIntArrayArray6417
	       [(((ClientScriptData) class454).integerStack
		 [((ClientScriptData) class454).intStackPointer * 1482319719 - 1])]
	       [0]);
	((ClientScriptData) class454).intStackPointer -= 1736754263;
    }
    
    static final void method4941(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	if (Class8.extractVarWatchKeys(string, class454, (byte) -17) != null)
	    string = string.substring(0, string.length() - 1);
	class58.anObjectArray929
	    = Class299.extractCs2Params(string, class454, -1213622405);
	class58.hasClientScript = true;
    }
    
    static final void method4942(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (((ClientScriptData) class454).varEntity.anInt11390
	       * 673303253);
    }
}
