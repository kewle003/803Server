/* Class595 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class595 {

	static final void setVarcompClanChannelUpdateEvent/*method13076*/(ClientScriptData scriptData, int i) {
		Class455 class455 = scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229;
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class192.setClanChannelUpdateEvent(component, iFace, scriptData, (byte) 40);
	}

	public static final Class241_Sub11 method13079(int parentHash, Class241_Sub11 iFace, int[] xteas, boolean bool, byte i_0_) {
		Class241_Sub11 parentComp = (Class241_Sub11) client.aClass407_8467.get((long) parentHash);
		if (parentComp != null) {
			Class40.method1047(parentComp, -443552671 * iFace.interfaceID != -443552671 * parentComp.interfaceID, bool, 907829277);
		}
		client.aClass407_8467.put(iFace, (long) parentHash);
		Class474.method10869(iFace.interfaceID * -443552671, xteas, (byte) 0);
		InterfaceComponent parent = Js5ConfigGroup.getInterfaceComponent(parentHash, (byte) -123);
		if (null != parent) {
			WorldType.refreshComponent(parent, 142245208);
		}
		if (client.aClass58_8384 != null) {
			WorldType.refreshComponent(client.aClass58_8384, 1848062431);
			client.aClass58_8384 = null;
		}
		Class120_Sub8.method16775(-743514329);
		if (null != parent) {
			Class380.method6882(Class187.aClass35Array2203[445907013 * parent.componentHash >>> 16], parent, !bool, -438317032);
		}
		if (!bool) {
			Class107.method2686(iFace.interfaceID * -443552671, xteas, -578799681);
		}
		if (!bool && 1629309841 * client.anInt8466 != -1) {
			Class298.method5735(client.anInt8466 * 1629309841, 1, (byte) -114);
		}
		return iFace;
	}

	static final void method13078(InterfaceComponent class58, InterfaceDefinition class35, ClientScriptData class454, int i) {
		class58.anInt881 = ((((ClientScriptData) class454).integerStack[(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]) * -1559394075);
		WorldType.refreshComponent(class58, 304015185);
	}

	static final void method13077(ClientScriptData class454, int i) {
		((ClientScriptData) class454).integerStack[(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1] = client.aBool8544 ? 1 : 0;
		((ClientScriptData) class454).objectStack[(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1] = client.aString8465 == null ? "" : client.aString8465;
		((ClientScriptData) class454).objectStack[(((ClientScriptData) class454).objectStackPointer += -1650705371) * -290357331 - 1] = client.aString8464 == null ? "" : client.aString8464;
	}
	
}
