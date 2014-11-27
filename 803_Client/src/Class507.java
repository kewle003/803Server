/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class507
{
    static final int anInt6663 = 2;
    public int anInt6664;
    static final int anInt6665 = 4;
    static final int anInt6666 = 8;
    static final int anInt6667 = 1;
    int anInt6668;
    public int anInt6669;
    static int anInt6670;
    public static JS5 aClass210_6671;
    
    public boolean method11490() {
	return (2058706651 * anInt6664 & 0x8) != 0;
    }
    
    public boolean method11491() {
	return 0 != (anInt6664 * 2058706651 & 0x1);
    }
    
    public boolean method11492(int i) {
	return (2058706651 * anInt6664 & 0x2) != 0;
    }
    
    public boolean method11493(short i) {
	return (2058706651 * anInt6664 & 0x4) != 0;
    }
    
    public boolean method11494(int i) {
	return (2058706651 * anInt6664 & 0x8) != 0;
    }
    
    public boolean method11495(int i) {
	return 0 != (anInt6664 * 2058706651 & 0x1);
    }
    
    public boolean method11496() {
	return (2058706651 * anInt6664 & 0x2) != 0;
    }
    
    public boolean method11497() {
	return (2058706651 * anInt6664 & 0x2) != 0;
    }
    
    public boolean method11498() {
	return (2058706651 * anInt6664 & 0x2) != 0;
    }
    
    public boolean method11499() {
	return (2058706651 * anInt6664 & 0x2) != 0;
    }
    
    public boolean method11500() {
	return (2058706651 * anInt6664 & 0x2) != 0;
    }
    
    public boolean method11501() {
	return (2058706651 * anInt6664 & 0x2) != 0;
    }
    
    public boolean method11502() {
	return (2058706651 * anInt6664 & 0x8) != 0;
    }
    
    Class507() {
	/* empty */
    }
    
    public boolean method11503() {
	return (2058706651 * anInt6664 & 0x8) != 0;
    }
    
    static final void method11504(ClientScriptData class454, int i) {
	((ClientScriptData) class454).anInt6231 -= 1421070234;
	if ((((ClientScriptData) class454).longStack
	     [((ClientScriptData) class454).anInt6231 * -735224571])
	    != (((ClientScriptData) class454).longStack
		[-735224571 * ((ClientScriptData) class454).anInt6231 + 1]))
	    ((ClientScriptData) class454).step
		+= (1924545709
		    * (((ClientScriptData) class454).integerConstants
		       [1938982693 * ((ClientScriptData) class454).step]));
    }
    
    static final void method11505(ClientScriptData class454, byte i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	int i_1_ = Class577.method12686(i_0_, 2117404662);
	if (i_1_ < 0)
	    throw new RuntimeException();
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = i_1_;
    }
    
    static final void method11506(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 2]);
	InterfaceComponent class58
	    = Class218_Sub3.method16576(i_2_ << 16 | i_3_, i_4_, (byte) -13);
	Class520.method11688(-1686440187);
	Class241_Sub20 class241_sub20 = client.method13624(class58);
	Class107.method2689(class58, class241_sub20.method15040((short) -9280),
			    class241_sub20.anInt9008 * -1892353525, (byte) 96);
    }
    
    static final void method11507(int i) {
	WorldType.method10548(Class236.aClass103_2713, (long) client.anInt8296);
	if (client.anInt8466 * 1629309841 != -1)
	    Class106.method2676(client.anInt8466 * 1629309841, -1257036363);
	for (int i_5_ = 0; i_5_ < client.anInt8396 * -787147009; i_5_++) {
	    client.aBoolArray8572[i_5_] = client.aBoolArray8523[i_5_];
	    client.aBoolArray8523[i_5_] = false;
	}
	client.anInt8522 = client.anInt8296 * 1867079287;
	if (1629309841 * client.anInt8466 != -1) {
	    client.anInt8396 = 0;
	    Class308.method5874(-1794016008);
	}
	Class236.aClass103_2713.method2572();
	Class523.method11732(Class236.aClass103_2713, -2131087635);
	int i_6_ = Class3.method464(2139060966);
	if (i_6_ == -1)
	    i_6_ = 12960807 * client.anInt8458;
	if (i_6_ == -1)
	    i_6_ = -1459654511 * client.anInt8383;
	Class241_Sub23.setCursor(i_6_, 821079114);
	client.anInt8515 = 0;
    }
    
    public static void method11508(int plane, int posX, int posY, int i_9_,
				   int objectID, int type, int rotation, int i_13_) {
		WorldObject object = null;
		for (WorldObject class241_sub30_14_ = ((WorldObject) WorldObject.aClass429_10039.method7694(16711935));
				class241_sub30_14_ != null;
				class241_sub30_14_ = ((WorldObject) WorldObject.aClass429_10039.method7692(1274785988))) {
			//System.out.println("Object: "+(289493935 *class241_sub30_14_.id));
		    if ((-603972145 * ((WorldObject) class241_sub30_14_).plane == plane)
		    		&& posX == 1204421839 * class241_sub30_14_.posX
		    		&& posY == -320018831 * class241_sub30_14_.posY
		    		&& (((WorldObject) class241_sub30_14_).anInt10040 * -759362859) == i_9_) {
		    	object = class241_sub30_14_;
				break;
		    }
		}
		if (object == null) {
			object = new WorldObject();
			object.plane = plane * -1040332497;
			object.anInt10040 = i_9_ * 1838800509;
			object.posX = posX * -620199377;
			object.posY = -1643505007 * posY;
		    if (posX >= 0 && posY >= 0 
		    		&& posX < client.aClass238_8477.method4744(-1481920884)
		    		&& posY < client.aClass238_8477.method4745(1111139927)) {
		    	Class583.method12830(object, 2095998673);
		    }
		    WorldObject.aClass429_10039.addNode(object, (short) -7534);
		}
		object.id = objectID * -1404181681;
		object.type = 385240221 * type;
		object.rotation = rotation * 875612695;
		object.aBool10051 = true;
		object.aBool10046 = false;
    }
    
    static final void method11509(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class298.method5732(class58, class35, class454, (byte) -95);
    }
}
