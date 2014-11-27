/* Class454 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public class ClientScriptData
{
    int anInt6216;
    Object[] objectValues;//anObjectArray6217
    int anInt6218;
    int[] anIntArray6219 = new int[5];
    int[][] anIntArrayArray6220 = new int[5][5000];
    int[] integerStack = new int[1000];//anIntArray6221
    long[] aLongArray6222;
    Class475_Sub1_Sub2_Sub1 aClass475_Sub1_Sub2_Sub1_6223;
    int objectStackPointer;//anInt6224
    Class14 aClass14_6225;
    long[] longStack;//aLongArray6226
    int anInt6227;
    Class466[] aClass466Array6228;
    Class455 aClass455_6229;
    Class455 aClass455_6230;
    int anInt6231;
    ClanSettings clanSettings;//aClass374_6232
    ClanChannel currentChannel;//aClass241_Sub6_6233
    Entity varEntity;//aClass475_Sub1_Sub1_Sub3_6234
    int[] integerConstants;//anIntArray6235
    int intStackPointer = 0;//anInt6236
    Interface24 anInterface24_6237;
    Map<VarDomainType, VarDomain> aMap6238;
    Object[] objectStack = new Object[1000];//anObjectArray6239
    int[] integerVariables;//anIntArray6240
    Map<VarDomainType, VarDomain> aMap6241;
    Class333 aClass333_6242;
    Cs2Action[] actions;//aClass243Array6243
    int step;//anInt6244
    ClientScript script;//aClass241_Sub39_Sub1_6245
    boolean aBool6246;
    
    ClientScriptData() {
		objectStackPointer = 0;
		longStack = new long[1000];
		anInt6231 = 0;
		anInt6227 = 0;
		aClass466Array6228 = new Class466[50];
		aClass455_6229 = new Class455();
		aClass455_6230 = new Class455();
		aMap6241 = new HashMap<VarDomainType, VarDomain>();
		aMap6238 = new HashMap<VarDomainType, VarDomain>();
		anInt6216 = 0;
		step = -1924545709;
    }
    
    static final void method10552(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -30);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	Class20.setClanSettingsUpdateEvent(class58, class35, class454, 1751928064);
    }
    
    static final void method10553(InterfaceComponent class58, InterfaceDefinition class35,
				  ClientScriptData class454, int i) {
	class58.anInt921
	    = ((((ClientScriptData) class454).integerStack
		[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	       * 1741529569);
    }
    
    static final void method10554(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStack
	    [(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1]
	    = ((Player)
	       ((ClientScriptData) class454).varEntity)
		  .getFormattedName(true, -924330662);
    }
}
