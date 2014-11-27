/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class123
{
    int[] anIntArray1572;
    int[] anIntArray1573;
    int[] anIntArray1574;
    int[] anIntArray1575;
    int[] anIntArray1576;
    int[] anIntArray1577;
    int[] anIntArray1578;
    public static Class292 aClass292_1579;
    
    void method2987(int i, int i_0_) {
	int[][] is = new int[((Class123) this).anIntArray1575.length << 1][4];
	for (int i_1_ = 0; i_1_ < ((Class123) this).anIntArray1575.length;
	     i_1_++) {
	    is[2 * i_1_][0] = ((Class123) this).anIntArray1575[i_1_];
	    is[i_1_ * 2][1] = ((Class123) this).anIntArray1577[i_1_];
	    is[2 * i_1_][2] = ((Class123) this).anIntArray1574[i_1_];
	    is[2 * i_1_][3] = ((Class123) this).anIntArray1572[i_1_];
	    is[2 * i_1_ + 1][0] = ((Class123) this).anIntArray1576[i_1_];
	    is[i_1_ * 2 + 1][1] = ((Class123) this).anIntArray1573[i_1_];
	    is[i_1_ * 2 + 1][2] = ((Class123) this).anIntArray1578[i_1_];
	    is[2 * i_1_ + 1][3] = ((Class123) this).anIntArray1572[i_1_];
	}
	client.anIntArrayArrayArray8405[i] = is;
    }
    
    Class123(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readSmart((short) -4592);
	((Class123) this).anIntArray1575 = new int[i];
	((Class123) this).anIntArray1577 = new int[i];
	((Class123) this).anIntArray1574 = new int[i];
	((Class123) this).anIntArray1572 = new int[i];
	((Class123) this).anIntArray1576 = new int[i];
	((Class123) this).anIntArray1573 = new int[i];
	((Class123) this).anIntArray1578 = new int[i];
	for (int i_2_ = 0; i_2_ < i; i_2_++) {
	    ((Class123) this).anIntArray1575[i_2_]
		= class241_sub3.readUnsignedShort(1162222719) - 5120;
	    ((Class123) this).anIntArray1574[i_2_]
		= class241_sub3.readUnsignedShort(1162222719) - 5120;
	    ((Class123) this).anIntArray1577[i_2_]
		= class241_sub3.readShort((byte) 55);
	    ((Class123) this).anIntArray1576[i_2_]
		= class241_sub3.readUnsignedShort(1162222719) - 5120;
	    ((Class123) this).anIntArray1578[i_2_]
		= class241_sub3.readUnsignedShort(1162222719) - 5120;
	    ((Class123) this).anIntArray1573[i_2_]
		= class241_sub3.readShort((byte) 120);
	    ((Class123) this).anIntArray1572[i_2_]
		= class241_sub3.readShort((byte) 124);
	}
    }
    
    void method2988(int i) {
	int[][] is = new int[((Class123) this).anIntArray1575.length << 1][4];
	for (int i_3_ = 0; i_3_ < ((Class123) this).anIntArray1575.length;
	     i_3_++) {
	    is[2 * i_3_][0] = ((Class123) this).anIntArray1575[i_3_];
	    is[i_3_ * 2][1] = ((Class123) this).anIntArray1577[i_3_];
	    is[2 * i_3_][2] = ((Class123) this).anIntArray1574[i_3_];
	    is[2 * i_3_][3] = ((Class123) this).anIntArray1572[i_3_];
	    is[2 * i_3_ + 1][0] = ((Class123) this).anIntArray1576[i_3_];
	    is[i_3_ * 2 + 1][1] = ((Class123) this).anIntArray1573[i_3_];
	    is[i_3_ * 2 + 1][2] = ((Class123) this).anIntArray1578[i_3_];
	    is[2 * i_3_ + 1][3] = ((Class123) this).anIntArray1572[i_3_];
	}
	client.anIntArrayArrayArray8405[i] = is;
    }
    
    static final void setVarcompMouseOverEvent/*method2989*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class451.setMouseOverEvent(component, iFace, scriptData, (byte) -69);
    }
    
    static final void method2990(ClientScriptData class454, byte i) {
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	((ClientScriptData) class454).aClass14_6225 = new Class14(string, true);
    }
    
    static final void method2991(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	ParamType class603
	    = Class621.paramTypeList.list(i_5_, 235523223);
	if (class603.method13186(311330058))
	    ((ClientScriptData) class454).objectStack
		[((((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331
		  - 1)]
		= Class441.aClass524_6158.method11745(i_4_, -1479037698)
		      .method11586(i_5_, class603.defaultstr, 2140720366);
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= (Class441.aClass524_6158.method11745(i_4_, 601821958)
		       .method11585
		   (i_5_, class603.defaultint * 2015998927, 1255412184));
    }
    
    static final void method2992(int i, int i_6_, int i_7_, int i_8_, int i_9_,
				 boolean bool, boolean bool_10_, int i_11_) {
	if (!bool && (i_6_ < 512 || i_7_ < 512
		      || i_6_ > (client.aClass238_8477.method4744(-1584418634)
				 - 2) * 512
		      || i_7_ > (client.aClass238_8477.method4745(-1219375218)
				 - 2) * 512)) {
	    float[] fs = client.aFloatArray8336;
	    client.aFloatArray8336[1] = -1.0F;
	    fs[0] = -1.0F;
	} else {
	    int i_12_
		= Class96_Sub5.method16046(i_6_, i_7_, i, -746721603) - i_9_;
	    client.aClass266_8290
		.method5175(Class236.aClass103_2713.method2307());
	    client.aClass266_8290.method5133((float) i_8_, 0.0F, 0.0F);
	    Class236.aClass103_2713.method2512(client.aClass266_8290);
	    if (bool)
		Class236.aClass103_2713.method2338((float) i_6_, (float) i_12_,
						   (float) i_7_,
						   client.aFloatArray8336);
	    else
		Class236.aClass103_2713.method2337((float) i_6_, (float) i_12_,
						   (float) i_7_,
						   client.aFloatArray8336);
	    client.aClass266_8290.method5133((float) -i_8_, 0.0F, 0.0F);
	    Class236.aClass103_2713.method2512(client.aClass266_8290);
	    if (!bool_10_) {
		client.aFloatArray8336[0]
		    -= (float) (-1253702721 * client.anInt8559);
		client.aFloatArray8336[1]
		    -= (float) (-11341805 * client.anInt8560);
	    }
	}
    }
    
    static final void method2993(int i) {
	int[] is = GPI.viewportPlayerIndicies;
	for (int i_13_ = 0; i_13_ < GPI.viewportPlayerCount * 794073197; i_13_++) {
	    Player class475_sub1_sub1_sub3_sub1
		= client.localPlayers[is[i_13_]];
	    if (null != class475_sub1_sub1_sub3_sub1)
		class475_sub1_sub1_sub3_sub1.method17783((byte) -112);
	}
	for (int i_14_ = 0; i_14_ < client.localNpcCount * -1837469873; i_14_++) {
	    long l = (long) client.localNpcIndicies[i_14_];
	    ObjectNode class241_sub26
		= (ObjectNode) client.aClass407_8457.get(l);
	    if (class241_sub26 != null)
		((Entity) class241_sub26.objectValue)
		    .method17783((byte) -75);
	}
	if (4 == client.anInt8266 * -831877317) {
	    for (int i_15_ = 0; i_15_ < Class25.aClass93Array213.length;
		 i_15_++) {
		Class93 class93 = Class25.aClass93Array213[i_15_];
		if (class93.aBool1323)
		    class93.method2083(-992192124).method17783((byte) -9);
	    }
	}
    }
}
