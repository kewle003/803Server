/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class134 implements Interface11
{
    public int getVarValueInt(VarType class179, int i) {
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       Class104.aClass407_1480.get((long) (class179.id
							  * 414229387)));
	if (null == class241_sub22)
	    return Class1.aClass19_11.getVarValueInt(class179, -1983862598);
	return -1859754807 * class241_sub22.intValue;
    }
    
    public int getVarBitValue(VarBitType class316, short i) {
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       Class104.aClass407_1480.get(0x100000000L
						  | (long) (-647104443
							    * (class316
							       .id))));
	if (class241_sub22 == null)
	    return Class1.aClass19_11.getVarBitValue(class316, (short) 20327);
	return -1859754807 * class241_sub22.intValue;
    }
    
    public int dummyMethod67(VarType class179) {
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       Class104.aClass407_1480.get((long) (class179.id
							  * 414229387)));
	if (null == class241_sub22)
	    return Class1.aClass19_11.getVarValueInt(class179, -903520449);
	return -1859754807 * class241_sub22.intValue;
    }
    
    public int dummyMethod66(VarType class179) {
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       Class104.aClass407_1480.get((long) (class179.id
							  * 414229387)));
	if (null == class241_sub22)
	    return Class1.aClass19_11.getVarValueInt(class179, -1269655043);
	return -1859754807 * class241_sub22.intValue;
    }
    
    public int dummyMethod65(VarType class179) {
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       Class104.aClass407_1480.get((long) (class179.id
							  * 414229387)));
	if (null == class241_sub22)
	    return Class1.aClass19_11.getVarValueInt(class179, -1156973230);
	return -1859754807 * class241_sub22.intValue;
    }
    
    public int dummyMethod70(VarType class179) {
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       Class104.aClass407_1480.get((long) (class179.id
							  * 414229387)));
	if (null == class241_sub22)
	    return Class1.aClass19_11.getVarValueInt(class179, -2013176000);
	return -1859754807 * class241_sub22.intValue;
    }
    
    public int dummyMethod71(VarBitType class316) {
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       Class104.aClass407_1480.get(0x100000000L
						  | (long) (-647104443
							    * (class316
							       .id))));
	if (class241_sub22 == null)
	    return Class1.aClass19_11.getVarBitValue(class316, (short) 7535);
	return -1859754807 * class241_sub22.intValue;
    }
    
    public int dummyMethod72(VarBitType class316) {
	IntegerNode class241_sub22
	    = ((IntegerNode)
	       Class104.aClass407_1480.get(0x100000000L
						  | (long) (-647104443
							    * (class316
							       .id))));
	if (class241_sub22 == null)
	    return Class1.aClass19_11.getVarBitValue(class316, (short) 17723);
	return -1859754807 * class241_sub22.intValue;
    }
    
    static final int method3092(Class103 class103, Class467 class467, int i) {
	if (-1 != class467.anInt6323 * -1240842283)
	    return -1240842283 * class467.anInt6323;
	if (-701216129 * class467.anInt6321 != -1) {
	    Class101 class101
		= class103.aClass107_1458.method2680((-701216129
						      * class467.anInt6321),
						     -1367060498);
	    if (!class101.aBool1434)
		return class101.aShort1436;
	}
	return -1439860245 * class467.anInt6320;
    }
    
    static void method3093(byte i) {
	Class353.aClass129_5437.reset(-453431490);
    }
    
    static final void setComponentShadow/*method3094*/(InterfaceComponent component, InterfaceDefinition iFace,
				 ClientScriptData scriptData, int i) {
    	component.textHasShadow
		    = (scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719] == 1);
		WorldType.refreshComponent(component, -203013114);
    }
    
    static final void method3095(ClientScriptData class454, int i) {
	int i_0_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_0_, (byte) -45);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_0_ >> 16];
	Class473.method10839(class58, class35, class454, (byte) 95);
    }
    
    static final void method3096(ClientScriptData class454, byte i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -70);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
	CsDeltaNode.method14872(class58, class35, class454, 53376822);
    }
    
    static final void method3097(ClientScriptData class454, int i) {
	int i_2_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (int) (Class436.method7799(i_2_, (byte) 32) / 60000L);
    }
    
    static final void method3098(ClientScriptData class454, byte i) {
	if (Class6.aClass241_Sub12_38.anInt8932 * -877281241 < 6)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	else if (6 == Class6.aClass241_Sub12_38.anInt8932 * -877281241
		 && -1844155017 * Class6.aClass241_Sub12_38.anInt8934 < 10)
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 1;
    }
    
    static void createComponent/*method3099*/(InterfaceDefinition iFace, int parentID, int type, int i_4_,
			   boolean bool, ClientScriptData scriptData, byte i_5_) {
		if (type == 0) {
		    throw new RuntimeException();
		}
		InterfaceComponent parent = iFace.components[parentID];
		if (null == parent.aClass58Array836) {
			parent.aClass58Array836 = new InterfaceComponent[1 + i_4_];
			parent.aClass58Array1000 = parent.aClass58Array836;
		}
		if (parent.aClass58Array836.length <= i_4_) {
		    if (parent.aClass58Array1000 == parent.aClass58Array836) {
				InterfaceComponent[] class58s = new InterfaceComponent[i_4_ + 1];
				for (int index = 0; index < parent.aClass58Array836.length; index++) {
				    class58s[index] = parent.aClass58Array836[index];
				}
				parent.aClass58Array836 = parent.aClass58Array1000 = class58s;
		    } else {
				InterfaceComponent[] class58s = new InterfaceComponent[1 + i_4_];
				InterfaceComponent[] class58s_7_ = new InterfaceComponent[1 + i_4_];
				for (int index = 0; index < parent.aClass58Array836.length; index++) {
				    class58s[index] = parent.aClass58Array836[index];
				    class58s_7_[index] = parent.aClass58Array1000[index];
				}
				parent.aClass58Array836 = class58s;
				parent.aClass58Array1000 = class58s_7_;
		    }
		}
		if (i_4_ > 0 && parent.aClass58Array836[i_4_ - 1] == null) {
		    throw new RuntimeException(new StringBuilder().append("").append(i_4_ - 1).toString());
		}
		InterfaceComponent class58_9_ = new InterfaceComponent();
		class58_9_.componentType = -1206894137 * type;
		class58_9_.parentNode = (class58_9_.componentHash = parent.componentHash * 1) * 1585506483;
		class58_9_.slot1 = i_4_ * 1675954991;
		parent.aClass58Array836[i_4_] = class58_9_;
		if (parent.aClass58Array836 != parent.aClass58Array1000) {
			parent.aClass58Array1000[i_4_] = class58_9_;
		}
		Class455 class455;
		if (bool) {
		    class455 = scriptData.aClass455_6230;
		} else {
		    class455 = scriptData.aClass455_6229;
		}
		((Class455) class455).aClass35_6249 = iFace;
		((Class455) class455).aClass58_6248 = class58_9_;
		WorldType.refreshComponent(parent, 358178941);
    }
}
