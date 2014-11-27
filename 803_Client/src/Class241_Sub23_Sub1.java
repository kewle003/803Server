/* Class241_Sub23_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class241_Sub23_Sub1 extends Class241_Sub23
{
    String aString10976;
    String aString10977;
    int anInt10978;
    Class38 aClass38_10979;
    Class38 aClass38_10980;
    
    String method17402(int i) {
	return ((Class241_Sub23_Sub1) this).aString10977;
    }
    
    public abstract boolean method17403(int i);
    
    public String toString() {
	String string
	    = new StringBuilder().append
		  (((Class241_Sub23_Sub1) this).aClass38_10979.toString())
		  .append
		  (" ").append
		  (((Class241_Sub23_Sub1) this).aString10977).toString();
	if (((Class241_Sub23_Sub1) this).aString10976 != null
	    && !"".equals(((Class241_Sub23_Sub1) this).aString10976))
	    string
		= new StringBuilder().append(string).append(" : ").append
		      (((Class241_Sub23_Sub1) this).aString10976).toString();
	return string;
    }
    
    public abstract int method17404(int i);
    
    public Class38 method17405(int i) {
	return ((Class241_Sub23_Sub1) this).aClass38_10979;
    }
    
    public String method17406() {
	String string
	    = new StringBuilder().append
		  (((Class241_Sub23_Sub1) this).aClass38_10979.toString())
		  .append
		  (" ").append
		  (((Class241_Sub23_Sub1) this).aString10977).toString();
	if (((Class241_Sub23_Sub1) this).aString10976 != null
	    && !"".equals(((Class241_Sub23_Sub1) this).aString10976))
	    string
		= new StringBuilder().append(string).append(" : ").append
		      (((Class241_Sub23_Sub1) this).aString10976).toString();
	return string;
    }
    
    public int method17407(int i) {
	if (Class38.aClass38_460
	    != ((Class241_Sub23_Sub1) this).aClass38_10979)
	    throw new IllegalArgumentException_Sub1(this,
						    ((Class241_Sub23_Sub1)
						     this)
							.aClass38_10979
							.toString
							().toLowerCase());
	return ((Class241_Sub23_Sub1) this).anInt10978 * 1706586947;
    }
    
    public abstract int method17408(int i);
    
    public abstract boolean method17409(int i);
    
    public int method17410() {
	if (Class38.aClass38_460
	    != ((Class241_Sub23_Sub1) this).aClass38_10979)
	    throw new IllegalArgumentException_Sub1(this,
						    ((Class241_Sub23_Sub1)
						     this)
							.aClass38_10979
							.toString
							().toLowerCase());
	return ((Class241_Sub23_Sub1) this).anInt10978 * 1706586947;
    }
    
    public Class38 method17411(int i) {
	return ((Class241_Sub23_Sub1) this).aClass38_10980;
    }
    
    Class241_Sub23_Sub1(Class115 class115) {
	((Class241_Sub23_Sub1) this).aClass38_10979
	    = ((Class115) class115).aClass38_1533;
	((Class241_Sub23_Sub1) this).aString10977
	    = ((Class115) class115).aString1529;
	((Class241_Sub23_Sub1) this).aString10976
	    = ((Class115) class115).aString1531;
	((Class241_Sub23_Sub1) this).anInt10978
	    = -2054628425 * ((Class115) class115).anInt1532;
	((Class241_Sub23_Sub1) this).aClass38_10980
	    = ((Class115) class115).aClass38_1530;
    }
    
    String method17412() {
	return ((Class241_Sub23_Sub1) this).aString10977;
    }
    
    String method17413() {
	return ((Class241_Sub23_Sub1) this).aString10977;
    }
    
    public Class38 method17414() {
	return ((Class241_Sub23_Sub1) this).aClass38_10979;
    }
    
    public String method17415() {
	String string
	    = new StringBuilder().append
		  (((Class241_Sub23_Sub1) this).aClass38_10979.toString())
		  .append
		  (" ").append
		  (((Class241_Sub23_Sub1) this).aString10977).toString();
	if (((Class241_Sub23_Sub1) this).aString10976 != null
	    && !"".equals(((Class241_Sub23_Sub1) this).aString10976))
	    string
		= new StringBuilder().append(string).append(" : ").append
		      (((Class241_Sub23_Sub1) this).aString10976).toString();
	return string;
    }
    
    public String method17416() {
	String string
	    = new StringBuilder().append
		  (((Class241_Sub23_Sub1) this).aClass38_10979.toString())
		  .append
		  (" ").append
		  (((Class241_Sub23_Sub1) this).aString10977).toString();
	if (((Class241_Sub23_Sub1) this).aString10976 != null
	    && !"".equals(((Class241_Sub23_Sub1) this).aString10976))
	    string
		= new StringBuilder().append(string).append(" : ").append
		      (((Class241_Sub23_Sub1) this).aString10976).toString();
	return string;
    }
    
    public Class38 method17417() {
	return ((Class241_Sub23_Sub1) this).aClass38_10980;
    }
    
    public int method17418() {
	if (Class38.aClass38_460
	    != ((Class241_Sub23_Sub1) this).aClass38_10979)
	    throw new IllegalArgumentException_Sub1(this,
						    ((Class241_Sub23_Sub1)
						     this)
							.aClass38_10979
							.toString
							().toLowerCase());
	return ((Class241_Sub23_Sub1) this).anInt10978 * 1706586947;
    }
    
    public Class38 method17419() {
	return ((Class241_Sub23_Sub1) this).aClass38_10979;
    }
    
    public abstract int method17420(int i);
    
    static final void getIgnoreDisplayNames/*method17421*/(ClientScriptData scriptData, int i) {
		int slotID = scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719];
		if (client.friendListStage * -2020075851 != 0 && slotID < client.ignoreListSize * -750736473) {
		    Ignore ignore = client.ignoreList[slotID];
		    scriptData.objectStack[((scriptData.objectStackPointer += -1650705371) * -290357331- 1)]
		    		= ignore.currentName;
		    if (ignore.previousName != null) {
		    	scriptData.objectStack[((scriptData.objectStackPointer += -1650705371) * -290357331) - 1]
		    			= ignore.previousName;
		    } else {
		    	scriptData.objectStack[((scriptData.objectStackPointer += -1650705371) * -290357331) - 1]
		    			= "";
		    }
		} else {
			scriptData.objectStack[((scriptData.objectStackPointer += -1650705371) * -290357331 - 1)]
					= "";
			scriptData.objectStack[((scriptData.objectStackPointer += -1650705371) * -290357331 - 1)]
					= "";
		}
    }
    
    static final void method17422(ClientScriptData class454, byte i) {
	int i_1_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_1_, (byte) -91);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_1_ >> 16];
	Class280.method5486(class58, class35, class454, -110335943);
    }
}
