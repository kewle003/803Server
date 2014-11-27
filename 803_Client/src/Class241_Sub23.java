/* Class241_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class241_Sub23 extends Node
{
    String aString9012;
    int anInt9013;
    
    Class241_Sub23() {
	/* empty */
    }
    
    static void setCursor/*method15062*/(int cursorID, int i_0_) {
		if (Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub1_8874
			.method14054(-500777828) == 0) {
			cursorID = -1;
		}
		if (312234261 * client.currentCursor != cursorID) {
		    if (-1 != cursorID) {
				CursorType class631 = GameShell3.cursorTypeList.list(cursorID, -1412092610);
				Class108 class108 = class631.getCursor(-73806059);
				if (class108 != null) {
				    Class256.mouseImp.setcustomcursor(
				    		Class344.canvas, class108.method2707(true),
				    		class108.getHeight(), class108.getWidth(),
				    		new Point(1959341529 * class631.hotspotx, 1203705775 * class631.hotspoty));
				    client.currentCursor = 69039677 * cursorID;
				} else {
					cursorID = -1;
				}
		    }
		    if (-1 == cursorID && -1 != client.currentCursor * 312234261) {
		    	Class256.mouseImp.setcustomcursor(Class344.canvas,
		    			null, -1, -1, new Point());
		    	client.currentCursor = -69039677;
		    }
		}
    }
    
    static final void method15063(ClientScriptData class454, byte i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -87);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
	ClientScriptMap.setMouseOutEvent(class58, class35, class454, 48151204);
    }
}
