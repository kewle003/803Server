/* Class468 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class468
{
    volatile String aString6334;
    public volatile int anInt6335 = 878280651;
    
    Class468(String string) {
	((Class468) this).aString6334 = string;
    }
    
    static final void setComponentSize/*method10742*/(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= -1642917540;
		class58.fixedWidth = scriptData.integerStack[scriptData.intStackPointer * 1482319719] * 1463654157;
		class58.fixedHeight = 490050741 * scriptData.integerStack[1482319719 * scriptData.intStackPointer + 1];
		class58.anInt891 = 0;
		class58.anInt892 = 0;
		int i_0_ = scriptData.integerStack[2 + scriptData.intStackPointer * 1482319719];
		if (i_0_ < 0) {
		    i_0_ = 0;
		} else if (i_0_ > 4) {
		    i_0_ = 4;
		}
		int i_1_ = scriptData.integerStack[1482319719 * scriptData.intStackPointer + 3];
		if (i_1_ < 0) {
		    i_1_ = 0;
		} else if (i_1_ > 4) {
		    i_1_ = 4;
		}
		class58.resizeModeX = (byte) i_0_;
		class58.resizeModeY = (byte) i_1_;
		WorldType.refreshComponent(class58, -1964073195);
		Class103.method2635(class35, class58, 331255080);
		if (0 == -1579470857 * class58.componentType) {
		    Class380.method6882(class35, class58, false, 1469197472);
		}
    }
    
    static final void method10743(ClientScriptData class454, int i) {
	Class370.method6618(class454,
			    Class21.myPlayer,
			    (byte) -7);
    }
    
    static final void method10744(ClientScriptData class454, byte i)
	throws Exception_Sub5 {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer + 1]);
	Class287 class287
	    = Class287.method5561((float) i_2_, (float) i_2_, (float) i_2_);
	if (class287.aFloat4477 == -1.0F)
	    class287.aFloat4477 = Float.POSITIVE_INFINITY;
	if (class287.aFloat4474 == -1.0F)
	    class287.aFloat4474 = Float.POSITIVE_INFINITY;
	if (class287.aFloat4479 == -1.0F)
	    class287.aFloat4479 = Float.POSITIVE_INFINITY;
	Class445_Sub16.aClass351_Sub1_8660.method6263(class287, (byte) -54);
	Class445_Sub16.aClass351_Sub1_8660.method6260((float) i_3_ / 1000.0F,
						      1789825217);
	class287.method5564();
    }
    
    static final void method10745(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (721052173
	       * (((NPC)
		   ((ClientScriptData) class454).varEntity)
		  .definition.npcID));
    }
    
    public static boolean method10746(int i) {
	do {
	    boolean bool;
	    try {
		if (IcmpService_Sub1.available())
		    break;
		bool = false;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	} while (false);
	if (IcmpService_Sub1.anIcmpService_Sub1_8806 != null)
	    throw new IllegalStateException("");
	IcmpService_Sub1.anIcmpService_Sub1_8806 = new IcmpService_Sub1();
	Thread thread = new Thread(new Class496());
	thread.setDaemon(true);
	thread.start();
	return true;
    }
}
