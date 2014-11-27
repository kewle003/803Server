/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RSGraphics
{
    public int graphicsID = 1386773949;//anInt3934
    public Class409 aClass409_3935;
    public int height;//anInt3936
    public int anInt3937;
    public int anInt3938;
    static int prevComponentHash;//anInt3939
    
    RSGraphics(Entity entity) {
    	aClass409_3935 = new Class409_Sub3(entity, false);
    }
    
    static final void method4914(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = null != Class520.varClanDomain ? 1 : 0;
    }
    
    static final void getPlayerName/*method4915*/(ClientScriptData scriptData, byte i) {
		String name;
		if (Class21.myPlayer != null && null != Class21.myPlayer.nameFiltered) {
			name = Class21.myPlayer.getName(false, -122333825);
		} else {
			name = "";
		}
		scriptData.objectStack[(scriptData.objectStackPointer += -1650705371) * -290357331 - 1]
		    = name;
    }
    
    public static void method4916(byte i) {
	if (CcDeltaNode.aClass70_9022 != null)
	    CcDeltaNode.aClass70_9022.method1703((byte) -36);
	if (null != Class384.aThread5701) {
	    for (;;) {
		try {
		    Class384.aThread5701.join();
		    break;
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
    }
}
