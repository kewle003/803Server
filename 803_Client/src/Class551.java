/* Class551 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class551
{
    static LinkedList aLinkedList7121 = new LinkedList();
    
    public static void method12080(Class628_Sub1 class628_sub1) {
	Class223.method4490(class628_sub1, -1980987247);
    }
    
    public static void method12081(int i, int i_0_, int i_1_) {
	Class223.method4490
	    (new Class413_Sub1(i, i_0_, i_1_, client.anInt8322 * -414507387,
			       -1805229461 * Class117.aClass209_1552.anInt2472,
			       191175519 * Class117.aClass209_1552.anInt2473,
			       Class117.aClass209_1552.method4141(532120020),
			       Class117.aClass209_1552.method4149(16777215),
			       Class506.aClass291_6661.method5670((byte) -2)),
	     -1912906237);
    }
    
    public static void method12082(int i, int i_2_, int i_3_) {
	Class223.method4490
	    (new Class413_Sub1(i, i_2_, i_3_, client.anInt8322 * -414507387,
			       -1805229461 * Class117.aClass209_1552.anInt2472,
			       191175519 * Class117.aClass209_1552.anInt2473,
			       Class117.aClass209_1552.method4141(1404970133),
			       Class117.aClass209_1552.method4149(16777215),
			       Class506.aClass291_6661.method5670((byte) -56)),
	     -1909441584);
    }
    
    public static void method12083(Class628_Sub1 class628_sub1) {
	Class223.method4490(class628_sub1, -856663426);
    }
    
    Class551() throws Throwable {
	throw new Error();
    }
    
    public static void method12084(Class628_Sub1 class628_sub1) {
	Class223.method4490(class628_sub1, -1996311534);
    }
    
    public static void method12085(Class629 class629) {
	Class223.method4490(new Class546(class629), -879276298);
    }
    
    public static void method12086(Class629 class629) {
	Class223.method4490(new Class546(class629), 250658290);
    }
    
    public static void method12087(Class640 class640, String string, int i,
				   Throwable throwable) {
	Class223.method4490(new Class558(class640, string, i, throwable),
			    -2114717773);
    }
    
    public static void method12088() {
	if ((1766317249 * client.anInt8288 == 19
	     || 9 == client.anInt8288 * 1766317249)
	    && client.aClass190_8340 != null) {
	    for (;;) {
		Interface56 interface56 = (Interface56) aLinkedList7121.poll();
		if (null == interface56)
		    break;
		interface56.method191(-1040957006);
	    }
	}
    }
    
    static void method12089(Interface56 interface56) {
	while (aLinkedList7121.size() > 10)
	    aLinkedList7121.remove();
	aLinkedList7121.add(interface56);
    }
    
    static void method12090(Interface56 interface56) {
	while (aLinkedList7121.size() > 10)
	    aLinkedList7121.remove();
	aLinkedList7121.add(interface56);
    }
    
    static void method12091(Interface56 interface56) {
	while (aLinkedList7121.size() > 10)
	    aLinkedList7121.remove();
	aLinkedList7121.add(interface56);
    }
    
    static void method12092(Interface56 interface56) {
	while (aLinkedList7121.size() > 10)
	    aLinkedList7121.remove();
	aLinkedList7121.add(interface56);
    }
    
    public static void method12093(Class628_Sub1 class628_sub1) {
	Class223.method4490(class628_sub1, -1885783355);
    }
    
    public static InterfaceDefinition method12094(int interfaceID, int[] data, InterfaceDefinition iFace,
				      boolean bool, byte i_4_) {
		if (!Class398.aClass210_5791.containerExists(interfaceID, 1560508050))
		    return null;
		int childCount = Class398.aClass210_5791.getContainerCount(interfaceID, (byte) -15);
		InterfaceComponent[] children;
		if (childCount == 0) {
			children = new InterfaceComponent[0];
		} else if (iFace == null) {
			children = new InterfaceComponent[childCount];
		} else {
			children = iFace.components;
		}
		if (null == iFace) {
			iFace = new InterfaceDefinition(bool, children);
		} else {
			iFace.components = children;
			iFace.aBool374 = bool;
		}
		for (int childID = 0; childID < childCount; childID++) {
		    if (iFace.components[childID] == null) {
				byte[] childData = Class398.aClass210_5791.method4187(interfaceID, childID, data, 2064402718);
				if (childData != null) {
				    InterfaceComponent component = iFace.components[childID] = new InterfaceComponent();
				    component.componentHash = (childID + (interfaceID << 16)) * 59445901;
				    component.decode(new RSByteBuffer(childData), -2071549772);
				}
		    }
		}
		return iFace;
    }
    
    static final void method12095(ClientScriptData class454, int i) {
	int i_8_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	String string = (String) (((ClientScriptData) class454).objectStack
				  [(((ClientScriptData) class454).objectStackPointer
				    -= -1650705371) * -290357331]);
	Class614.method13246(i_8_, string, (byte) 9);
    }
    
    public static boolean method12096(CharSequence charsequence, int i) {
	return Class248.method4987(charsequence, 10, true, 844232346);
    }
    
    static final void method12097(byte i) {
	for (WorldObject class241_sub30
		 = ((WorldObject)
		    WorldObject.aClass429_10039.method7694(16711935));
	     class241_sub30 != null;
	     class241_sub30 = (WorldObject) WorldObject
						   .aClass429_10039
						   .method7692(522537507))
	    Class65.method1640(class241_sub30, false, (byte) -44);
	for (WorldObject class241_sub30
		 = ((WorldObject)
		    WorldObject.aClass429_10053.method7694(16711935));
	     null != class241_sub30;
	     class241_sub30 = (WorldObject) WorldObject
						   .aClass429_10053
						   .method7692(1209842895))
	    Class65.method1640(class241_sub30, true, (byte) 39);
    }
    
    static final void method12098(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (((ClientScriptData) class454).integerConstants
	       [((ClientScriptData) class454).step * 1938982693]);
    }
}
