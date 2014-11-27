/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class219
{
    public static final int anInt2554 = 1;
    public static final int anInt2555 = 0;
    public static final int anInt2556 = 6;
    public static final int anInt2557 = 2;
    public static final int anInt2558 = 5;
    public static int anInt2559;
    public static AnimationConfigLoader animationConfigLoader;//aClass538_2560
    
    Class219() throws Throwable {
	throw new Error();
    }
    
    static final void setComponentHidden/*method4374*/(InterfaceComponent component, InterfaceDefinition iFace,
				 ClientScriptData scriptData, byte i) {
		boolean hidden = (scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719] == 1);
		if (component.hidden != hidden) {
			component.hidden = hidden;
		    WorldType.refreshComponent(component, -171000345);
		}
		if (component.slot1 * -389932081 == -1 && !iFace.aBool374) {
		    Class357.method6465(component.componentHash * 445907013, 1356754207);
		}
    }
    
    static final void setComponentColour/*method4375*/(InterfaceComponent component, InterfaceDefinition iFace,
				 ClientScriptData scriptData, int i) {
    	component.colour = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719] * 1652312081;
		WorldType.refreshComponent(component, -276694572);
		if (component.slot1 * -389932081 == -1 && !iFace.aBool374) {
		    Class445_Sub35.method14952(445907013 * component.componentHash, 1106433006);
		}
    }
    
    static final void method4376(ClientScriptData class454, byte i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 0;
    }
    
    public static void method4377(boolean bool, int i) {
	Class573_Sub1.aBool8771 = bool;
    }
    
    public static void method4378(int i, int i_0_, int i_1_) {
	Class241_Sub39_Sub13 class241_sub39_sub13
	    = NPC
		  .method18030(17, (long) i_0_ << 32 | (long) i);
	class241_sub39_sub13.method17278((byte) -89);
    }
}
