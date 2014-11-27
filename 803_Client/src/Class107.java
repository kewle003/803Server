/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class107
{
    int anInt1504;
    Class101[] aClass101Array1505;
    static Class241_Sub39_Sub11 aClass241_Sub39_Sub11_1506;
    
    public Class101 method2679(int i) {
	return ((Class107) this).aClass101Array1505[i];
    }
    
    public Class101 method2680(int i, int i_0_) {
	return ((Class107) this).aClass101Array1505[i];
    }
    
    public Class101 method2681(int i) {
	return ((Class107) this).aClass101Array1505[i];
    }
    
    public Class101 method2682(int i) {
	return ((Class107) this).aClass101Array1505[i];
    }
    
    public Class107(JS5 class210) {
	((Class107) this).anInt1504
	    = class210.getContainerCount(0, (byte) -14) * 198387499;
	((Class107) this).aClass101Array1505
	    = new Class101[((Class107) this).anInt1504 * -784441469];
	for (int i = 0; i < ((Class107) this).anInt1504 * -784441469; i++) {
	    RSByteBuffer class241_sub3
		= new RSByteBuffer(class210.getfile(0, i, 1181696106));
	    if (null == class241_sub3.payload)
		((Class107) this).aClass101Array1505[i] = null;
	    else {
		try {
		    Class101 class101 = new Class101();
		    int i_1_ = class241_sub3.readUnsignedByte((byte) -116);
		    if (0 == i_1_)
			class101.anInt1406 = -1674424640;
		    else if (i_1_ == 1)
			class101.anInt1406 = 946118016;
		    else if (2 == i_1_)
			class101.anInt1406 = 1892236032;
		    else if (i_1_ == 3)
			class101.anInt1406 = -510495232;
		    else if (i_1_ == 4)
			class101.anInt1406 = -1020990464;
		    int i_2_ = class241_sub3.readInt((byte) 71);
		    if (0 != (i_2_ & 0x1)) {
			class101.anInt1403
			    = (class241_sub3.readUnsignedShort(1162222719)
			       * -420379233);
			class241_sub3.readUnsignedByte((byte) 99);
		    }
		    if (0 != (i_2_ & 0x1000)) {
			class101.anIntArray1384 = new int[6];
			((Class101) class101).aByteArray1405 = new byte[6];
			for (int i_3_ = 0; i_3_ < 6; i_3_++) {
			    class101.anIntArray1384[i_3_]
				= class241_sub3.readUnsignedShort(1162222719);
			    ((Class101) class101).aByteArray1405[i_3_]
				= (byte) class241_sub3.readUnsignedByte((byte) 7);
			}
		    }
		    if (0 != (i_2_ & 0x2)) {
			class241_sub3.readUnsignedShort(1162222719);
			class241_sub3.readUnsignedByte((byte) 17);
		    }
		    if (0 != (i_2_ & 0x4)) {
			class241_sub3.readUnsignedShort(1162222719);
			class241_sub3.readUnsignedByte((byte) -44);
		    }
		    if ((i_2_ & 0x8) != 0)
			class241_sub3.readUnsignedShort(1162222719);
		    if ((i_2_ & 0x10) != 0) {
			class241_sub3.readUnsignedShort(1162222719);
			class241_sub3.readUnsignedByte((byte) 88);
		    }
		    if (0 != (i_2_ & 0x20)) {
			class241_sub3.readUnsignedShort(1162222719);
			class241_sub3.readUnsignedByte((byte) 97);
		    }
		    if (0 != (i_2_ & 0x40)) {
			class241_sub3.readUnsignedShort(1162222719);
			class241_sub3.readUnsignedByte((byte) 6);
		    }
		    if (0 != (i_2_ & 0x80)) {
			class241_sub3.readUnsignedShort(1162222719);
			class241_sub3.readUnsignedByte((byte) -32);
		    }
		    if (0 != (i_2_ & 0x100)) {
			class241_sub3.readUnsignedShort(1162222719);
			class241_sub3.readUnsignedByte((byte) -36);
		    }
		    if (0 != (i_2_ & 0x200)) {
			class241_sub3.readUnsignedShort(1162222719);
			class241_sub3.readUnsignedByte((byte) -65);
		    }
		    if (0 != (i_2_ & 0x400)) {
			class241_sub3.readUnsignedShort(1162222719);
			class241_sub3.readUnsignedByte((byte) 82);
		    }
		    if (0 != (i_2_ & 0x800)) {
			class241_sub3.readUnsignedShort(1162222719);
			class241_sub3.readUnsignedByte((byte) -3);
		    }
		    int i_4_ = class241_sub3.readUnsignedByte((byte) -52);
		    class101.aByte1395 = (byte) (i_4_ & 0xf);
		    class101.aByte1370 = (byte) (i_4_ >> 4 & 0xf);
		    int i_5_ = class241_sub3.readInt((byte) 120);
		    if ((i_5_ & 0x10) != 0) {
			class241_sub3.method14650(-449501596);
			class241_sub3.method14650(-1332749650);
		    }
		    if ((i_5_ & 0x20) != 0)
			class241_sub3.readInt((byte) 26);
		    if (0 != (i_5_ & 0x40))
			class241_sub3.readInt((byte) 38);
		    if ((i_5_ & 0x80) != 0)
			class241_sub3.readInt((byte) 14);
		    if (0 != (i_5_ & 0x100))
			class241_sub3.readInt((byte) 25);
		    if (0 != (i_5_ & 0x200))
			class241_sub3.readInt((byte) 76);
		    class101.aBool1409
			= class241_sub3.readUnsignedByte((byte) -24) == 1;
		    Class531.method11848(Class338.method6109(1742925574),
					 class241_sub3.readUnsignedByte((byte) -3),
					 -1486113303);
		    Class531.method11848(Class632.method13502(1727692588),
					 class241_sub3.readUnsignedByte((byte) -44),
					 -583002238);
		    class101.aClass529_1391
			= ((Class529)
			   Class531.method11848(Class558
						    .method12321((byte) 19),
						class241_sub3
						    .readUnsignedByte((byte) 29),
						249384308));
		    if (Class529.aClass529_6943 == class101.aClass529_1391)
			class101.aByte1372
			    = (byte) class241_sub3.readUnsignedByte((byte) 54);
		    int i_6_ = class241_sub3.readUnsignedByte((byte) 47);
		    if ((i_6_ & 0x1) != 0)
			class101.aByte1376
			    = (byte) class241_sub3.readUnsignedByte((byte) 43);
		    if ((i_6_ & 0x2) != 0)
			class101.aByte1396
			    = (byte) class241_sub3.readUnsignedByte((byte) -8);
		    if (0 != (i_6_ & 0x4))
			class241_sub3.readUnsignedByte((byte) 8);
		    if (0 != (i_6_ & 0x8))
			class241_sub3.readUnsignedByte((byte) -46);
		    if (class241_sub3.readUnsignedByte((byte) -5) == 1) {
			class101.aByte1427
			    = (byte) class241_sub3.readUnsignedByte((byte) 38);
			class101.aByte1428
			    = (byte) class241_sub3.readUnsignedByte((byte) 46);
			class101.anInt1429
			    = (class241_sub3.readInt((byte) 78)
			       * -1086072457);
			class101.aByte1435
			    = (byte) class241_sub3.readUnsignedByte((byte) 71);
			class241_sub3.readUnsignedByte((byte) -67);
			class101.aByte1369
			    = (byte) class241_sub3.readUnsignedByte((byte) 24);
			class101.aBool1408
			    = class241_sub3.readUnsignedByte((byte) -16) == 1;
			class101.aBool1434
			    = class241_sub3.readUnsignedByte((byte) -2) == 1;
			class101.aByte1433
			    = (byte) class241_sub3.readUnsignedByte((byte) 43);
			class101.aByte1430
			    = (byte) class241_sub3.readUnsignedByte((byte) -24);
			class101.aShort1436
			    = (short) class241_sub3.readUnsignedShort(1162222719);
		    }
		    ((Class107) this).aClass101Array1505[i] = class101;
		} catch (Exception exception) {
		    ((Class107) this).aClass101Array1505[i] = null;
		}
	    }
	}
    }
    
    static final void method2683(ClientScriptData class454, short i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class58.scrollMaxY * 1204737107;
    }
    
    public static float method2684(float f, float f_7_, byte i) {
	double d = Math.atan2((double) f, (double) f_7_);
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (float) d;
    }
    
    public static void method2685
	(Entity class475_sub1_sub1_sub3, int[] is,
	 int[] is_8_, int[] is_9_, int i) {
	for (int i_10_ = 0; i_10_ < is.length; i_10_++) {
	    int i_11_ = is[i_10_];
	    int i_12_ = is_9_[i_10_];
	    int i_13_ = is_8_[i_10_];
	    for (int i_14_ = 0;
		 0 != i_12_ && i_14_ < (class475_sub1_sub1_sub3
					.aClass409_Sub3_Sub1Array11417).length;
		 i_12_ >>>= 1) {
		if ((i_12_ & 0x1) != 0) {
		    if (i_11_ == -1)
			class475_sub1_sub1_sub3
			    .aClass409_Sub3_Sub1Array11417[i_14_]
			    = null;
		    else {
			AnimationDefinition class549
			    = Class394.animationDefLoader.getAnimationDefinition(i_11_,
								  (byte) -24);
			int i_15_ = 1834456867 * class549.anInt7078;
			Class409_Sub3_Sub1 class409_sub3_sub1
			    = (class475_sub1_sub1_sub3
			       .aClass409_Sub3_Sub1Array11417[i_14_]);
			if (null != class409_sub3_sub1
			    && class409_sub3_sub1.method7364(1845204470)) {
			    if (i_11_
				== class409_sub3_sub1.method7346(-247034932)) {
				if (0 == i_15_) {
				    class475_sub1_sub1_sub3
					.aClass409_Sub3_Sub1Array11417[i_14_]
					= null;
				    class409_sub3_sub1 = null;
				} else if (i_15_ == 1) {
				    class409_sub3_sub1.method7379(194973917);
				    class409_sub3_sub1.anInt10737
					= i_13_ * 394233637;
				} else if (i_15_ == 2)
				    class409_sub3_sub1.method7361((byte) 27);
			    } else if (class549.anInt7076 * -397642129
				       >= ((class409_sub3_sub1.method7345
					    ((byte) 49).anInt7076)
					   * -397642129)) {
				class475_sub1_sub1_sub3
				    .aClass409_Sub3_Sub1Array11417[i_14_]
				    = null;
				class409_sub3_sub1 = null;
			    }
			}
			if (class409_sub3_sub1 == null
			    || !class409_sub3_sub1.method7364(1364059666)) {
			    class409_sub3_sub1
				= class475_sub1_sub1_sub3
				      .aClass409_Sub3_Sub1Array11417[i_14_]
				= (new Class409_Sub3_Sub1
				   (class475_sub1_sub1_sub3));
			    class409_sub3_sub1.method7347(i_11_, 2099484577);
			    class409_sub3_sub1.anInt10737 = i_13_ * 394233637;
			}
		    }
		}
		i_14_++;
	    }
	}
    }
    
    public static void method2686(int i, int[] is, int i_16_) {
		if (i != -1 && Class54.method1301(i, is, (byte) -18)) {
		    InterfaceComponent[] components = Class187.aClass35Array2203[i].components;
		    Class64.method1626(components, 503125623);
		}
    }
    
    static boolean method2687(int i, int i_17_) {
	if (18 == i || i == 19 || 20 == i || 21 == i || 22 == i || 1004 == i)
	    return true;
	if (17 == i)
	    return true;
	return false;
    }
    
    static Class518[] method2688(byte i) {
	return (new Class518[]
		{ Class518.aClass518_6787, Class518.aClass518_6788,
		  Class518.aClass518_6786 });
    }
    
    public static void method2689(InterfaceComponent component, int i, int i_18_, byte i_19_) {
		if (null != component) {
		    if (null != component.anObjectArray912) {
				ClientScriptCaller caller = new ClientScriptCaller();
				caller.component = component;
				caller.paramaters = component.anObjectArray912;
				Class42.method1067(caller, 201998681);
		    }
		    client.aBool8544 = true;
		    RSGraphics.prevComponentHash = -447450119 * component.componentHash;
		    client.prevComponentSlot1 = 1959255639 * component.slot1;
		    Class613.anInt7804 = i * 122657455;
		    NPCDefinitionLoader.anInt5897 = i_18_ * 74448607;
		    client.prevComponentSlot2 = component.slot2 * 966152201;
		    Class213.anInt2512 = 1792103541 * component.anInt821;
		    client.anInt8458 = component.anInt857 * 17634149;
		    WorldType.refreshComponent(component, 2057158223);
		}
    }
}
