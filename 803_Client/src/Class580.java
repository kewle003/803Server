/* Class580 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public abstract class Class580
{
    public abstract boolean method12713(byte i);
    
    public abstract boolean isMouseButtonPressed(byte i);//method12714
    
    Class580() {
	/* empty */
    }
    
    public abstract boolean method12715(int i);
    
    public abstract Class241_Sub24 method12716();
    
    public boolean method12717(int i) {
	return (isMouseButtonPressed((byte) -68) || method12715(737908415)
		|| method12713((byte) -21));
    }
    
    public abstract int method12718(int i);
    
    public abstract int method12719();
    
    public abstract Class241_Sub24 method12720(byte i);
    
    public abstract void method12721(int i);
    
    public static Class580 method12722(Component component, boolean bool) {
	return new Class580_Sub1(component, bool);
    }
    
    public static Class580 method12723(Component component, boolean bool) {
	return new Class580_Sub1(component, bool);
    }
    
    public static void method12724(int i) {
	CcDelta_Delete.method17439(i, -290912047);
    }
    
    public static void method12725(int i) {
	CcDelta_Delete.method17439(i, -1708938134);
    }
    
    public abstract void method12726();
    
    public boolean method12727() {
	return (isMouseButtonPressed((byte) -77) || method12715(599432513)
		|| method12713((byte) -19));
    }
    
    public abstract boolean method12728();
    
    public abstract boolean method12729();
    
    public abstract boolean method12730();
    
    public boolean method12731() {
	return (isMouseButtonPressed((byte) -8) || method12715(1150790780)
		|| method12713((byte) 46));
    }
    
    public abstract void method12732(int i);
    
    public boolean method12733() {
	return (isMouseButtonPressed((byte) -110) || method12715(659076667)
		|| method12713((byte) -47));
    }
    
    public boolean method12734() {
	return (isMouseButtonPressed((byte) -71) || method12715(478654431)
		|| method12713((byte) 14));
    }
    
    public boolean method12735() {
	return (isMouseButtonPressed((byte) -14) || method12715(1824353363)
		|| method12713((byte) -78));
    }
    
    public abstract int method12736();
    
    public abstract int method12737();
    
    public abstract int method12738();
    
    public abstract int method12739();
    
    public abstract int method12740(byte i);
    
    public abstract int method12741();
    
    public abstract boolean method12742();
    
    public abstract Class241_Sub24 method12743();
    
    public abstract void method12744();
    
    static final void method12745(int i, int i_0_, int i_1_, int i_2_,
				  int i_3_) {
	Class203.method4087(Class236.aClass103_2713, (byte) -111);
	Class93.method2096(i, i_0_, i_1_, i_2_, 256, 256, 57566146);
	Class113.method2792(i, i_0_, i_1_, i_2_, 256, 256, 370638140);
	GameShell3.method13075(i, i_0_, i_1_, i_2_, 256, 256, 2135841640);
	OutgoingOpcode.method5030(i, i_0_, i_1_, i_2_, (byte) -67);
    }
    
    static final void method12746(ClientScriptData class454, int i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_4_, (byte) -120);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_4_ >> 16];
	Class270.method5304(class58, class35, class454, (byte) -9);
    }
}
