/* Class473 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class473
{
    int anInt6358;
    float aFloat6359;
    float aFloat6360;
    float aFloat6361;
    int anInt6362;
    int anInt6363;
    Class287 aClass287_6364;
    float aFloat6365;
    int anInt6366;
    float aFloat6367;
    int anInt6368;
    int anInt6369;
    float aFloat6370;
    int anInt6371;
    int[] anIntArray6372 = new int[3];
    int anInt6373;
    int anInt6374;
    float[] aFloatArray6375 = new float[3];
    int anInt6376;
    public static VarClientDomain varClientDomain;//aClass136_Sub1_6377
    static boolean[] aBoolArray6378;
    public static int anInt6379;
    
    public int method10783() {
	return -316670853 * ((Class473) this).anInt6371;
    }
    
    void method10784(int i) {
	((Class473) this).anInt6368 = -2142663249;
	((Class473) this).aFloat6359 = -1.0F;
	((Class473) this).aFloat6360 = -1.0F;
	((Class473) this).aFloat6361 = -1.0F;
	((Class473) this).aClass287_6364 = null;
	((Class473) this).anInt6363 = -471826881;
	((Class473) this).anInt6362 = 480759613;
	((Class473) this).aFloat6365 = -1.0F;
	((Class473) this).aFloat6370 = -1.0F;
	((Class473) this).aFloat6367 = -1.0F;
	((Class473) this).anInt6358 = 1032374875;
	((Class473) this).anInt6369 = -1162330641;
	((Class473) this).anInt6366 = 470627299;
	((Class473) this).anInt6371 = 1081834829;
	((Class473) this).anInt6374 = 388933937;
	((Class473) this).anInt6373 = -1136583973;
	for (int i_0_ = 0; i_0_ < ((Class473) this).anIntArray6372.length;
	     i_0_++) {
	    ((Class473) this).anIntArray6372[i_0_] = -1;
	    ((Class473) this).aFloatArray6375[i_0_] = 0.0F;
	}
	((Class473) this).anInt6376 = 2012814712;
    }
    
    public boolean method10785(RSByteBuffer class241_sub3, short i) {
	int i_1_ = class241_sub3.readUnsignedShort(1162222719);
	if (i_1_ == 0) {
	    ((Class473) this).anInt6376
		= class241_sub3.readUnsignedShort(1162222719) * 346576927;
	    return false;
	}
	if (0 != (i_1_ & Class481.aClass481_6454.anInt6452 * -983461933))
	    ((Class473) this).anInt6368
		= class241_sub3.readInt((byte) 24) * 2142663249;
	if (0 != (i_1_ & -983461933 * Class481.aClass481_6455.anInt6452))
	    ((Class473) this).aFloat6359
		= class241_sub3.method14650(-2043905321);
	if (0 != (i_1_ & -983461933 * Class481.aClass481_6442.anInt6452))
	    ((Class473) this).aFloat6360
		= class241_sub3.method14650(-1233593915);
	if (0 != (i_1_ & Class481.aClass481_6444.anInt6452 * -983461933))
	    ((Class473) this).aFloat6361
		= class241_sub3.method14650(-663097371);
	if ((i_1_ & Class481.aClass481_6441.anInt6452 * -983461933) != 0)
	    ((Class473) this).aClass287_6364
		= Class287.method5563(class241_sub3);
	if ((i_1_ & -983461933 * Class481.aClass481_6445.anInt6452) != 0)
	    ((Class473) this).anInt6363
		= class241_sub3.readInt((byte) 71) * 471826881;
	if ((i_1_ & -983461933 * Class481.aClass481_6446.anInt6452) != 0)
	    ((Class473) this).anInt6362
		= class241_sub3.readUnsignedShort(1162222719) * -480759613;
	if (0 != (i_1_ & Class481.aClass481_6447.anInt6452 * -983461933))
	    ((Class473) this).anInt6358
		= class241_sub3.readUnsignedShort(1162222719) * -1032374875;
	if (0 != (i_1_ & Class481.aClass481_6448.anInt6452 * -983461933))
	    ((Class473) this).aFloat6365
		= class241_sub3.method14650(-1489203907);
	if (0 != (i_1_ & -983461933 * Class481.aClass481_6449.anInt6452))
	    ((Class473) this).aFloat6370
		= class241_sub3.method14650(-1458511975);
	if (0 != (i_1_ & -983461933 * Class481.aClass481_6450.anInt6452))
	    ((Class473) this).aFloat6367
		= class241_sub3.method14650(-957043891);
	if ((i_1_ & -983461933 * Class481.aClass481_6443.anInt6452) != 0) {
	    ((Class473) this).anInt6369
		= class241_sub3.readUnsignedShort(1162222719) * 1162330641;
	    ((Class473) this).anInt6366
		= class241_sub3.readShort((byte) 88) * -470627299;
	    ((Class473) this).anInt6371
		= class241_sub3.readShort((byte) 121) * -1081834829;
	    ((Class473) this).anInt6374
		= class241_sub3.readShort((byte) 92) * -388933937;
	    ((Class473) this).anInt6373
		= class241_sub3.readUnsignedShort(1162222719) * 1136583973;
	}
	if (0 != (i_1_ & -983461933 * Class481.aClass481_6440.anInt6452)) {
	    ((Class473) this).anIntArray6372[0]
		= class241_sub3.readUnsignedShort(1162222719);
	    ((Class473) this).aFloatArray6375[0]
		= class241_sub3.method14650(-488894573);
	}
	if ((i_1_ & -983461933 * Class481.aClass481_6453.anInt6452) != 0) {
	    ((Class473) this).anIntArray6372[1]
		= class241_sub3.readUnsignedShort(1162222719);
	    ((Class473) this).aFloatArray6375[1]
		= class241_sub3.method14650(-906854487);
	}
	if ((i_1_ & -983461933 * Class481.aClass481_6451.anInt6452) != 0) {
	    ((Class473) this).anIntArray6372[2]
		= class241_sub3.readUnsignedShort(1162222719);
	    ((Class473) this).aFloatArray6375[2]
		= class241_sub3.method14650(-1559008130);
	}
	((Class473) this).anInt6376
	    = class241_sub3.readUnsignedShort(1162222719) * 346576927;
	return true;
    }
    
    public float method10786() {
	return ((Class473) this).aFloat6361;
    }
    
    public int method10787(int i) {
	return ((Class473) this).anIntArray6372[i];
    }
    
    public float method10788(int i) {
	return ((Class473) this).aFloat6360;
    }
    
    public float method10789() {
	return ((Class473) this).aFloat6361;
    }
    
    public float method10790(int i) {
	return ((Class473) this).aFloat6370;
    }
    
    public int method10791(int i) {
	return -976777663 * ((Class473) this).anInt6363;
    }
    
    public int method10792(int i) {
	return ((Class473) this).anInt6362 * 1561591787;
    }
    
    public int method10793() {
	return 1377791729 * ((Class473) this).anInt6369;
    }
    
    public int method10794(byte i) {
	return 413265967 * ((Class473) this).anInt6374;
    }
    
    public float method10795(int i) {
	return ((Class473) this).aFloat6367;
    }
    
    public float method10796(int i) {
	return ((Class473) this).aFloat6365;
    }
    
    public int method10797(int i) {
	return 1377791729 * ((Class473) this).anInt6369;
    }
    
    public int method10798(int i) {
	return ((Class473) this).anInt6366 * -88975819;
    }
    
    public int method10799(int i) {
	return -316670853 * ((Class473) this).anInt6371;
    }
    
    public int method10800() {
	return ((Class473) this).anInt6368 * 713561777;
    }
    
    public float method10801() {
	return ((Class473) this).aFloat6370;
    }
    
    public int method10802(int i, int i_2_) {
	return ((Class473) this).anIntArray6372[i];
    }
    
    public float method10803(int i, int i_3_) {
	return ((Class473) this).aFloatArray6375[i];
    }
    
    public int method10804(int i) {
	return ((Class473) this).anInt6368 * 713561777;
    }
    
    void method10805() {
	((Class473) this).anInt6368 = -2142663249;
	((Class473) this).aFloat6359 = -1.0F;
	((Class473) this).aFloat6360 = -1.0F;
	((Class473) this).aFloat6361 = -1.0F;
	((Class473) this).aClass287_6364 = null;
	((Class473) this).anInt6363 = -471826881;
	((Class473) this).anInt6362 = 480759613;
	((Class473) this).aFloat6365 = -1.0F;
	((Class473) this).aFloat6370 = -1.0F;
	((Class473) this).aFloat6367 = -1.0F;
	((Class473) this).anInt6358 = 1032374875;
	((Class473) this).anInt6369 = -1162330641;
	((Class473) this).anInt6366 = 470627299;
	((Class473) this).anInt6371 = 1081834829;
	((Class473) this).anInt6374 = 388933937;
	((Class473) this).anInt6373 = -1136583973;
	for (int i = 0; i < ((Class473) this).anIntArray6372.length; i++) {
	    ((Class473) this).anIntArray6372[i] = -1;
	    ((Class473) this).aFloatArray6375[i] = 0.0F;
	}
	((Class473) this).anInt6376 = 2012814712;
    }
    
    public Class287 method10806() {
	return ((Class473) this).aClass287_6364;
    }
    
    public int method10807() {
	return ((Class473) this).anInt6368 * 713561777;
    }
    
    public int method10808() {
	return -976777663 * ((Class473) this).anInt6363;
    }
    
    public Class473() {
	method10784(-1667936562);
    }
    
    public float method10809() {
	return ((Class473) this).aFloat6359;
    }
    
    public float method10810() {
	return ((Class473) this).aFloat6359;
    }
    
    public float method10811() {
	return ((Class473) this).aFloat6360;
    }
    
    public float method10812() {
	return ((Class473) this).aFloat6365;
    }
    
    public float method10813(short i) {
	return ((Class473) this).aFloat6361;
    }
    
    public Class287 method10814(int i) {
	return ((Class473) this).aClass287_6364;
    }
    
    public Class287 method10815() {
	return ((Class473) this).aClass287_6364;
    }
    
    public float method10816() {
	return ((Class473) this).aFloat6359;
    }
    
    public int method10817() {
	return -976777663 * ((Class473) this).anInt6363;
    }
    
    public Class287 method10818() {
	return ((Class473) this).aClass287_6364;
    }
    
    public int method10819() {
	return ((Class473) this).anInt6368 * 713561777;
    }
    
    public float method10820() {
	return ((Class473) this).aFloat6365;
    }
    
    public float method10821() {
	return ((Class473) this).aFloat6370;
    }
    
    public int method10822(short i) {
	return ((Class473) this).anInt6358 * 637315629;
    }
    
    public float method10823() {
	return ((Class473) this).aFloat6367;
    }
    
    public float method10824() {
	return ((Class473) this).aFloat6367;
    }
    
    public int method10825(int i) {
	return ((Class473) this).anInt6373 * -1019171155;
    }
    
    public int method10826() {
	return ((Class473) this).anInt6358 * 637315629;
    }
    
    public int method10827() {
	return ((Class473) this).anInt6358 * 637315629;
    }
    
    public int method10828(int i) {
	return 1959863263 * ((Class473) this).anInt6376;
    }
    
    public int method10829() {
	return 1377791729 * ((Class473) this).anInt6369;
    }
    
    public int method10830() {
	return ((Class473) this).anInt6366 * -88975819;
    }
    
    public int method10831() {
	return ((Class473) this).anInt6366 * -88975819;
    }
    
    public float method10832(byte i) {
	return ((Class473) this).aFloat6359;
    }
    
    public int method10833() {
	return -316670853 * ((Class473) this).anInt6371;
    }
    
    public int method10834() {
	return ((Class473) this).anInt6373 * -1019171155;
    }
    
    public float method10835() {
	return ((Class473) this).aFloat6367;
    }
    
    public int method10836(int i) {
	return ((Class473) this).anIntArray6372[i];
    }
    
    public float method10837(int i) {
	return ((Class473) this).aFloatArray6375[i];
    }
    
    static final void method10838(ClientScriptData class454, int i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_4_, (byte) -95);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_4_ >> 16];
	Class582.method12775(class58, class35, class454, (byte) -56);
    }
    
    static final void method10839(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, byte i) {
	class58.aBool1007
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       == 1);
	WorldType.refreshComponent(class58, 1942056553);
	if (class58.slot1 * -389932081 == -1 && !class35.aBool374)
	    Class256.method5054(class58.componentHash * 445907013, 1114517159);
    }
}
