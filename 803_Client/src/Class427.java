/* Class427 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class427 implements Iterator
{
    Class410 aClass410_6083;
    Class241_Sub39 aClass241_Sub39_6084;
    Class241_Sub39 aClass241_Sub39_6085 = null;
    
    void method7582() {
	((Class427) this).aClass241_Sub39_6084
	    = (((Class427) this).aClass410_6083.aClass241_Sub39_5934
	       .aClass241_Sub39_10148);
	((Class427) this).aClass241_Sub39_6085 = null;
    }
    
    void method7583(byte i) {
	((Class427) this).aClass241_Sub39_6084
	    = (((Class427) this).aClass410_6083.aClass241_Sub39_5934
	       .aClass241_Sub39_10148);
	((Class427) this).aClass241_Sub39_6085 = null;
    }
    
    public Class241_Sub39 method7584() {
	method7583((byte) -75);
	return (Class241_Sub39) next();
    }
    
    public Class427(Class410 class410) {
	((Class427) this).aClass410_6083 = class410;
	((Class427) this).aClass241_Sub39_6084
	    = (((Class427) this).aClass410_6083.aClass241_Sub39_5934
	       .aClass241_Sub39_10148);
	((Class427) this).aClass241_Sub39_6085 = null;
    }
    
    public boolean hasNext() {
	return (((Class427) this).aClass410_6083.aClass241_Sub39_5934
		!= ((Class427) this).aClass241_Sub39_6084);
    }
    
    public Class241_Sub39 method7585(int i) {
	method7583((byte) -9);
	return (Class241_Sub39) next();
    }
    
    public boolean method7586() {
	return (((Class427) this).aClass410_6083.aClass241_Sub39_5934
		!= ((Class427) this).aClass241_Sub39_6084);
    }
    
    public boolean method7587() {
	return (((Class427) this).aClass410_6083.aClass241_Sub39_5934
		!= ((Class427) this).aClass241_Sub39_6084);
    }
    
    public boolean method7588() {
	return (((Class427) this).aClass410_6083.aClass241_Sub39_5934
		!= ((Class427) this).aClass241_Sub39_6084);
    }
    
    public boolean method7589() {
	return (((Class427) this).aClass410_6083.aClass241_Sub39_5934
		!= ((Class427) this).aClass241_Sub39_6084);
    }
    
    public Object method7590() {
	Class241_Sub39 class241_sub39 = ((Class427) this).aClass241_Sub39_6084;
	if (((Class427) this).aClass410_6083.aClass241_Sub39_5934
	    == class241_sub39) {
	    class241_sub39 = null;
	    ((Class427) this).aClass241_Sub39_6084 = null;
	} else
	    ((Class427) this).aClass241_Sub39_6084
		= class241_sub39.aClass241_Sub39_10148;
	((Class427) this).aClass241_Sub39_6085 = class241_sub39;
	return class241_sub39;
    }
    
    public Object method7591() {
	Class241_Sub39 class241_sub39 = ((Class427) this).aClass241_Sub39_6084;
	if (((Class427) this).aClass410_6083.aClass241_Sub39_5934
	    == class241_sub39) {
	    class241_sub39 = null;
	    ((Class427) this).aClass241_Sub39_6084 = null;
	} else
	    ((Class427) this).aClass241_Sub39_6084
		= class241_sub39.aClass241_Sub39_10148;
	((Class427) this).aClass241_Sub39_6085 = class241_sub39;
	return class241_sub39;
    }
    
    public void method7592() {
	if (((Class427) this).aClass241_Sub39_6085 == null)
	    throw new IllegalStateException();
	((Class427) this).aClass241_Sub39_6085.method16441((byte) 2);
	((Class427) this).aClass241_Sub39_6085 = null;
    }
    
    public void method7593() {
	if (((Class427) this).aClass241_Sub39_6085 == null)
	    throw new IllegalStateException();
	((Class427) this).aClass241_Sub39_6085.method16441((byte) 2);
	((Class427) this).aClass241_Sub39_6085 = null;
    }
    
    public Class241_Sub39 method7594() {
	method7583((byte) -23);
	return (Class241_Sub39) next();
    }
    
    public void method7595() {
	if (((Class427) this).aClass241_Sub39_6085 == null)
	    throw new IllegalStateException();
	((Class427) this).aClass241_Sub39_6085.method16441((byte) 2);
	((Class427) this).aClass241_Sub39_6085 = null;
    }
    
    void method7596() {
	((Class427) this).aClass241_Sub39_6084
	    = (((Class427) this).aClass410_6083.aClass241_Sub39_5934
	       .aClass241_Sub39_10148);
	((Class427) this).aClass241_Sub39_6085 = null;
    }
    
    public Class241_Sub39 method7597() {
	method7583((byte) -43);
	return (Class241_Sub39) next();
    }
    
    public Class241_Sub39 method7598() {
	method7583((byte) -78);
	return (Class241_Sub39) next();
    }
    
    public void remove() {
	if (((Class427) this).aClass241_Sub39_6085 == null)
	    throw new IllegalStateException();
	((Class427) this).aClass241_Sub39_6085.method16441((byte) 2);
	((Class427) this).aClass241_Sub39_6085 = null;
    }
    
    public Object next() {
	Class241_Sub39 class241_sub39 = ((Class427) this).aClass241_Sub39_6084;
	if (((Class427) this).aClass410_6083.aClass241_Sub39_5934
	    == class241_sub39) {
	    class241_sub39 = null;
	    ((Class427) this).aClass241_Sub39_6084 = null;
	} else
	    ((Class427) this).aClass241_Sub39_6084
		= class241_sub39.aClass241_Sub39_10148;
	((Class427) this).aClass241_Sub39_6085 = class241_sub39;
	return class241_sub39;
    }
    
    static final void method7599(ClientScriptData class454, short i) {
	if (client.anInt8288 * 1766317249 == 2)
	    Class395.aBool5779 = (((ClientScriptData) class454).integerStack
				  [(((ClientScriptData) class454).intStackPointer
				    -= 1736754263) * 1482319719]) == 1;
    }
    
    static final void method7600(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= -821458770;
	int i_0_ = (((ClientScriptData) class454).integerStack
		    [1482319719 * ((ClientScriptData) class454).intStackPointer]);
	boolean bool = ((((ClientScriptData) class454).integerStack
			 [1 + ((ClientScriptData) class454).intStackPointer * 1482319719])
			== 1);
	if (null != Class573_Sub1.aClass407_8788) {
	    Node class241
		= Class573_Sub1.aClass407_8788.get((long) i_0_);
	    if (null != class241 && !bool)
		class241.remove((byte) 36);
	    else if (null == class241 && bool) {
		class241 = new Node();
		Class573_Sub1.aClass407_8788.put(class241, (long) i_0_);
	    }
	}
    }
    
    static final void method7601(ClientScriptData class454, int i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	AnimationDefinition.method12029(class58, class35, class454, 1771941012);
    }
}
