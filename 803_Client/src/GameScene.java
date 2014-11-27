/* Class522 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GameScene
{
    public int baseX;//anInt6806
    public int anInt6807;
    public int baseY;//anInt6808
    
    public void method11701(Class241_Sub16 class241_sub16) {
		anInt6807 = class241_sub16.anInt8979 * -913495057;
		baseX = 1259954217 * (class241_sub16.anInt8982 * 576500115 >> 9);
		baseY = (-989675525 * class241_sub16.anInt8984 >> 9) * 1008719469;
    }
    
    public GameScene(int plane, int x, int y) {
		anInt6807 = plane * 1377599241;
		baseX = x * 1259954217;
		baseY = y * 1008719469;
    }
    
    public GameScene(int i) {
	if (-1 == i)
	    anInt6807 = -1377599241;
	else {
	    anInt6807 = 1377599241 * (i >> 28 & 0x3);
	    baseX = 1259954217 * (i >> 14 & 0x3fff);
	    baseY = (i & 0x3fff) * 1008719469;
	}
    }
    
    public GameScene() {
	anInt6807 = -1377599241;
    }
    
    public int method11702(byte i) {
	return (635486009 * anInt6807 << 28 | 127679513 * baseX << 14
		| 468558693 * baseY);
    }
    
    public boolean equals(Object object) {
	if (object == this)
	    return true;
	if (!(object instanceof GameScene))
	    return false;
	return method11706((GameScene) object, -2126209686);
    }
    
    public boolean method11703(Object object) {
	if (object == this)
	    return true;
	if (!(object instanceof GameScene))
	    return false;
	return method11706((GameScene) object, -1909813327);
    }
    
    public int hashCode() {
	return method11702((byte) -90);
    }
    
    public String toString() {
	return new StringBuilder().append(635486009 * anInt6807).append
		   (",").append
		   (baseX * 127679513 >> 6).append
		   (",").append
		   (baseY * 468558693 >> 6).append
		   (",").append
		   (127679513 * baseX & 0x3f).append
		   (",").append
		   (baseY * 468558693 & 0x3f).toString();
    }
    
    public boolean method11704(Object object) {
	if (object == this)
	    return true;
	if (!(object instanceof GameScene))
	    return false;
	return method11706((GameScene) object, -1943804035);
    }
    
    public int method11705() {
	return (635486009 * anInt6807 << 28 | 127679513 * baseX << 14
		| 468558693 * baseY);
    }
    
    boolean method11706(GameScene class522_2_, int i) {
	if (635486009 * anInt6807 != class522_2_.anInt6807 * 635486009)
	    return false;
	if (127679513 * baseX != 127679513 * class522_2_.baseX)
	    return false;
	if (468558693 * baseY != 468558693 * class522_2_.baseY)
	    return false;
	return true;
    }
    
    public String method11707() {
	return new StringBuilder().append(635486009 * anInt6807).append
		   (",").append
		   (baseX * 127679513 >> 6).append
		   (",").append
		   (baseY * 468558693 >> 6).append
		   (",").append
		   (127679513 * baseX & 0x3f).append
		   (",").append
		   (baseY * 468558693 & 0x3f).toString();
    }
    
    public String method11708() {
	return new StringBuilder().append(635486009 * anInt6807).append
		   (",").append
		   (baseX * 127679513 >> 6).append
		   (",").append
		   (baseY * 468558693 >> 6).append
		   (",").append
		   (127679513 * baseX & 0x3f).append
		   (",").append
		   (baseY * 468558693 & 0x3f).toString();
    }
    
    public int method11709() {
	return (635486009 * anInt6807 << 28 | 127679513 * baseX << 14
		| 468558693 * baseY);
    }
    
    public int method11710() {
	return method11702((byte) 14);
    }
    
    public String method11711() {
	return new StringBuilder().append(635486009 * anInt6807).append
		   (",").append
		   (baseX * 127679513 >> 6).append
		   (",").append
		   (baseY * 468558693 >> 6).append
		   (",").append
		   (127679513 * baseX & 0x3f).append
		   (",").append
		   (baseY * 468558693 & 0x3f).toString();
    }
    
    public void method11712(Class241_Sub16 class241_sub16, byte i) {
	anInt6807 = class241_sub16.anInt8979 * -913495057;
	baseX = 1259954217 * (class241_sub16.anInt8982 * 576500115 >> 9);
	baseY = (-989675525 * class241_sub16.anInt8984 >> 9) * 1008719469;
    }
    
    public int method11713() {
	return method11702((byte) -62);
    }
    
    public void method11714(Class241_Sub16 class241_sub16) {
	anInt6807 = class241_sub16.anInt8979 * -913495057;
	baseX = 1259954217 * (class241_sub16.anInt8982 * 576500115 >> 9);
	baseY = (-989675525 * class241_sub16.anInt8984 >> 9) * 1008719469;
    }
    
    public boolean method11715(Object object) {
	if (object == this)
	    return true;
	if (!(object instanceof GameScene))
	    return false;
	return method11706((GameScene) object, -1534190354);
    }
    
    public void method11716(Class241_Sub16 class241_sub16) {
	anInt6807 = class241_sub16.anInt8979 * -913495057;
	baseX = 1259954217 * (class241_sub16.anInt8982 * 576500115 >> 9);
	baseY = (-989675525 * class241_sub16.anInt8984 >> 9) * 1008719469;
    }
    
    boolean method11717(GameScene class522_3_) {
	if (635486009 * anInt6807 != class522_3_.anInt6807 * 635486009)
	    return false;
	if (127679513 * baseX != 127679513 * class522_3_.baseX)
	    return false;
	if (468558693 * baseY != 468558693 * class522_3_.baseY)
	    return false;
	return true;
    }
    
    boolean method11718(GameScene class522_4_) {
	if (635486009 * anInt6807 != class522_4_.anInt6807 * 635486009)
	    return false;
	if (127679513 * baseX != 127679513 * class522_4_.baseX)
	    return false;
	if (468558693 * baseY != 468558693 * class522_4_.baseY)
	    return false;
	return true;
    }
    
    public static int method11719(int i) {
	synchronized (Class490.aClass129_6512) {
	    int i_5_ = Class490.aClass129_6512.method3031(931730511);
	    return i_5_;
	}
    }
    
    static final void method11720(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	int i_6_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (i_6_ != -812116149 * class58.anInt818) {
	    if (-1 != i_6_) {
		if (null == class58.aClass409_998)
		    class58.aClass409_998 = new Class409_Sub2();
		class58.aClass409_998.method7347(i_6_, 416740293);
	    } else
		class58.aClass409_998 = null;
	    class58.anInt818 = i_6_ * 1874344547;
	    WorldType.refreshComponent(class58, -1395727300);
	}
	if (-389932081 * class58.slot1 == -1 && !class35.aBool374)
	    Class380_Sub3_Sub1.method16912(445907013 * class58.componentHash,
					   -109005902);
    }
    
    static final void method11721(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub11_8879
		  .method14197((byte) 17);
    }
    
    static final void method11722(long l) {
	Class287 class287
	    = (Class21.myPlayer.method10874()
	       .aClass287_4386);
	int i = client.anInt8491 * 1643420029 + (int) class287.aFloat4477;
	int i_7_ = (int) class287.aFloat4479 + -1397076359 * client.anInt8370;
	if (97141979 * Class291.anInt4488 - i < -2000
	    || 97141979 * Class291.anInt4488 - i > 2000
	    || 970310639 * Class354_Sub2.anInt10492 - i_7_ < -2000
	    || Class354_Sub2.anInt10492 * 970310639 - i_7_ > 2000) {
	    Class291.anInt4488 = i * 1081349971;
	    Class354_Sub2.anInt10492 = i_7_ * -258618609;
	}
	if (i != 97141979 * Class291.anInt4488) {
	    int i_8_ = i - 97141979 * Class291.anInt4488;
	    int i_9_ = (int) (l * (long) i_8_ / 320L);
	    if (i_8_ > 0) {
		if (0 == i_9_)
		    i_9_ = 1;
		else if (i_9_ > i_8_)
		    i_9_ = i_8_;
	    } else if (i_9_ == 0)
		i_9_ = -1;
	    else if (i_9_ < i_8_)
		i_9_ = i_8_;
	    Class291.anInt4488 += i_9_ * 1081349971;
	}
	if (970310639 * Class354_Sub2.anInt10492 != i_7_) {
	    int i_10_ = i_7_ - Class354_Sub2.anInt10492 * 970310639;
	    int i_11_ = (int) (l * (long) i_10_ / 320L);
	    if (i_10_ > 0) {
		if (i_11_ == 0)
		    i_11_ = 1;
		else if (i_11_ > i_10_)
		    i_11_ = i_10_;
	    } else if (i_11_ == 0)
		i_11_ = -1;
	    else if (i_11_ < i_10_)
		i_11_ = i_10_;
	    Class354_Sub2.anInt10492 += i_11_ * -258618609;
	}
	client.aFloat8581 += client.aFloat8394 * (float) l / 6.0F;
	client.aFloat8406 += client.aFloat8356 * (float) l / 6.0F;
	VarPlayerDomain.method11656(-2119322777);
    }
    
    public static int getContainerFreeSpace/*method11723*/(int id, boolean bool, int i_12_) {
		if (bool) {
		    return 0;
		}
		Class241_Sub34 class241_sub34 = Class584.method12835(id, bool, 576176484);
		if (class241_sub34 == null) {
		    return ((Class409.aClass617_5932.list(id, (byte) 47).size) * 295370337);
		}
		int freeSlots = 0;
		for (int i_14_ = 0; i_14_ < ((Class241_Sub34) class241_sub34).anIntArray10085.length; i_14_++) {
		    if (-1 == ((Class241_Sub34) class241_sub34).anIntArray10085[i_14_]) {
		    	freeSlots++;
		    }
		}
		freeSlots += ((Class409.aClass617_5932.list(id, (byte) 116).size * 295370337)
				- ((Class241_Sub34) class241_sub34).anIntArray10085.length);
		return freeSlots;
    }
}
