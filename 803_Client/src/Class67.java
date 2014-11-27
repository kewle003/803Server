/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67
{
    public static Class67 aClass67_1052;
    int anInt1053;
    public static Class67 aClass67_1054 = new Class67(0);
    public static int canvasHei;//anInt1055
    
    static {
	aClass67_1052 = new Class67(1);
    }
    
    Class67(int i) {
	((Class67) this).anInt1053 = i * -1552109863;
    }
    
    public static Class67 method1643(int i) {
	if (((Class67) aClass67_1054).anInt1053 * -1240272535 == i)
	    return aClass67_1054;
	if (((Class67) aClass67_1052).anInt1053 * -1240272535 == i)
	    return aClass67_1052;
	return null;
    }
    
    static final void method1644(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= 187673446;
	class58.aBool904 = true;
	class58.anInt910
	    = Math.max(Math.min((((ClientScriptData) class454).integerStack
				 [(1482319719
				   * ((ClientScriptData) class454).intStackPointer)]),
				2816),
		       0) * 1779262597;
	class58.anInt942
	    = Math.max(Math.min((((ClientScriptData) class454).integerStack
				 [(((ClientScriptData) class454).intStackPointer * 1482319719
				   + 1)]),
				2816),
		       0) * 1769918667;
	class58.anInt896
	    = Math.max(Math.min((((ClientScriptData) class454).integerStack
				 [(1482319719 * ((ClientScriptData) class454).intStackPointer
				   + 2)]),
				2816),
		       0) * -596866303;
	int i_0_ = Math.max(Math.min((((ClientScriptData) class454).integerStack
				      [3 + 1482319719 * (((ClientScriptData) class454)
							 .intStackPointer)]),
				     255),
			    0);
	int i_1_ = Math.max(Math.min((((ClientScriptData) class454).integerStack
				      [4 + 1482319719 * (((ClientScriptData) class454)
							 .intStackPointer)]),
				     255),
			    0);
	int i_2_ = Math.max(Math.min((((ClientScriptData) class454).integerStack
				      [5 + (((ClientScriptData) class454).intStackPointer
					    * 1482319719)]),
				     255),
			    0);
	class58.anInt867 = -1474804573 * (i_0_ << 16 | i_1_ << 8 | i_2_);
	class58.anInt905
	    = (-1206578615
	       * (((ClientScriptData) class454).integerStack
		  [((ClientScriptData) class454).intStackPointer * 1482319719 + 6]));
	class58.anInt1006
	    = 655051359 * (((ClientScriptData) class454).integerStack
			   [7 + 1482319719 * ((ClientScriptData) class454).intStackPointer]);
	class58.anInt907
	    = (((ClientScriptData) class454).integerStack
	       [1482319719 * ((ClientScriptData) class454).intStackPointer + 8]) * 872985947;
	class58.anInt954
	    = ((((ClientScriptData) class454).integerStack
		[1482319719 * ((ClientScriptData) class454).intStackPointer + 9])
	       * -1303485493);
	WorldType.refreshComponent(class58, 1976231513);
    }
    
    static final void method1645(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = GameScene.getContainerFreeSpace(i_3_, false, -424797620);
    }
    
    static final void method1646(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_4_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_5_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719 + 1]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class176.method3756(i_4_, i_5_, false, 933259301);
    }
    
    static final void method1647(int i, int i_6_, int i_7_, int i_8_, int i_9_,
				 int i_10_, int i_11_, int i_12_, byte i_13_) {
	if (!Class54.method1301(i, null, (byte) -38)) {
	    if (i_12_ != -1)
		client.aBoolArray8523[i_12_] = true;
	    else {
		for (int i_14_ = 0; i_14_ < 108; i_14_++)
		    client.aBoolArray8523[i_14_] = true;
	    }
	} else
	    Class64.method1632(Class187.aClass35Array2203[i]
				   .method995(1327070400),
			       -1, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_,
			       i_12_ < 0, -1998027340);
    }
    
    static void method1648(Class542 class542, int i) {
	class542.aClass475_Sub1_7011 = null;
	synchronized (Class542.aStack7010) {
	    if (Class542.aStack7010.size() < 200)
		Class542.aStack7010.push(class542);
	}
    }
}
