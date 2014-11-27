/* Class445_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class445_Sub29 extends Class445
{
    public static final int anInt8706 = 1;
    public static final int anInt8707 = 0;
    
    void method7889(int i) {
	anInt6176 = i * -679946765;
    }
    
    public Class445_Sub29(int i, Class241_Sub9 class241_sub9) {
	super(i, class241_sub9);
    }
    
    public boolean method14377(int i) {
	if (aClass241_Sub9_6175.method14933(1311121663)
	    == GameDefinition.RUNESCAPE)
	    return true;
	return false;
    }
    
    int method7881(int i) {
	return 1;
    }
    
    public int method7886(int i) {
	if (aClass241_Sub9_6175.method14933(907667162)
	    == GameDefinition.RUNESCAPE) {
	    if (0 == i) {
		if (aClass241_Sub9_6175.aClass445_Sub31_8860
			.method14441(319644006)
		    == 1)
		    return 2;
		if (aClass241_Sub9_6175.aClass445_Sub33_8890
			.method14529(-485668821)
		    == 1)
		    return 2;
		if (aClass241_Sub9_6175.aClass445_Sub27_8867
			.method14362((byte) 26)
		    > 0)
		    return 2;
	    }
	    return 1;
	}
	return 3;
    }
    
    public int method7880(int i, int i_0_) {
	if (aClass241_Sub9_6175.method14933(1727137443)
	    == GameDefinition.RUNESCAPE) {
	    if (0 == i) {
		if (aClass241_Sub9_6175.aClass445_Sub31_8860
			.method14441(675736562)
		    == 1)
		    return 2;
		if (aClass241_Sub9_6175.aClass445_Sub33_8890
			.method14529(-485668821)
		    == 1)
		    return 2;
		if (aClass241_Sub9_6175.aClass445_Sub27_8867
			.method14362((byte) 74)
		    > 0)
		    return 2;
	    }
	    return 1;
	}
	return 3;
    }
    
    void method7882(int i, int i_1_) {
	anInt6176 = i * -679946765;
    }
    
    public int method14378(int i) {
	return anInt6176 * 2034617147;
    }
    
    int method7883() {
	return 1;
    }
    
    public boolean method14379() {
	if (aClass241_Sub9_6175.method14933(753354677)
	    == GameDefinition.RUNESCAPE)
	    return true;
	return false;
    }
    
    int method7885() {
	return 1;
    }
    
    public int method14380() {
	return anInt6176 * 2034617147;
    }
    
    public int method7887(int i) {
	if (aClass241_Sub9_6175.method14933(834597758)
	    == GameDefinition.RUNESCAPE) {
	    if (0 == i) {
		if (aClass241_Sub9_6175.aClass445_Sub31_8860
			.method14441(-1649664508)
		    == 1)
		    return 2;
		if (aClass241_Sub9_6175.aClass445_Sub33_8890
			.method14529(-485668821)
		    == 1)
		    return 2;
		if (aClass241_Sub9_6175.aClass445_Sub27_8867
			.method14362((byte) 31)
		    > 0)
		    return 2;
	    }
	    return 1;
	}
	return 3;
    }
    
    public int method7879(int i) {
	if (aClass241_Sub9_6175.method14933(1087775549)
	    == GameDefinition.RUNESCAPE) {
	    if (0 == i) {
		if (aClass241_Sub9_6175.aClass445_Sub31_8860
			.method14441(-2027813180)
		    == 1)
		    return 2;
		if (aClass241_Sub9_6175.aClass445_Sub33_8890
			.method14529(-485668821)
		    == 1)
		    return 2;
		if (aClass241_Sub9_6175.aClass445_Sub27_8867
			.method14362((byte) -60)
		    > 0)
		    return 2;
	    }
	    return 1;
	}
	return 3;
    }
    
    void method7888(int i) {
	anInt6176 = i * -679946765;
    }
    
    int method7884() {
	return 1;
    }
    
    public void method14381(int i) {
	if (aClass241_Sub9_6175.method14933(1069309396)
	    != GameDefinition.RUNESCAPE)
	    anInt6176 = -679946765;
	if (0 != 2034617147 * anInt6176 && 1 != 2034617147 * anInt6176)
	    anInt6176 = method7881(-462070197) * -679946765;
    }
    
    public int method14382() {
	return anInt6176 * 2034617147;
    }
    
    public Class445_Sub29(Class241_Sub9 class241_sub9) {
	super(class241_sub9);
    }
    
    static final void setComponentLocation/*method14383*/(InterfaceComponent component, InterfaceDefinition iFace,
				  ClientScriptData scriptData, byte i) {
    	scriptData.intStackPointer -= -1642917540;
    	component.drawOffsetX = -1313766667 * scriptData.integerStack[scriptData.intStackPointer * 1482319719];
    	component.drawOffsetY = -1994711389 * scriptData.integerStack[scriptData.intStackPointer * 1482319719 + 1];
		int locXMode = scriptData.integerStack[1482319719 * scriptData.intStackPointer + 2];
		if (locXMode < 0) {
			locXMode = 0;
		} else if (locXMode > 5) {
			locXMode = 5;
		}
		int locYMode = scriptData.integerStack[3 + scriptData.intStackPointer * 1482319719];
		if (locYMode < 0) {
			locYMode = 0;
		} else if (locYMode > 5) {
			locYMode = 5;
		}
		component.locationXMode = (byte) locXMode;
		component.locationYMode = (byte) locYMode;
		WorldType.refreshComponent(component, 350210983);
		Class103.method2635(iFace, component, -1942676441);
		if (0 == -1579470857 * component.componentType) {
		    Class380.method6882(iFace, component, false, -1063266403);
		}
		if (-1 == component.slot1 * -389932081 && !iFace.aBool374) {
		    Class600.method13154(445907013 * component.componentHash, 1125755543);
		}
    }
    
    static final void method14384(ClientScriptData class454, int i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class72.aClass625_1100.list(i_4_, -1507810134)
		  .method17193(-282462754);
    }
}
