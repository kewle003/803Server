/* Class199_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

//package com.jagex.game.runetek6.config.vartype;
public abstract class VarTypeList extends Class199 implements Interface27
{
    protected VarDomainType variableDomain;//aClass218_10642
    
    public static Map method16882(VarTypeList[] class199_sub2s) {
		if (null == class199_sub2s || 0 == class199_sub2s.length)
		    return null;
		HashMap hashmap = new HashMap();
		VarTypeList[] class199_sub2s_0_ = class199_sub2s;
		for (int i = 0; i < class199_sub2s_0_.length; i++) {
		    VarTypeList class199_sub2 = class199_sub2s_0_[i];
		    hashmap.put(class199_sub2.variableDomain, class199_sub2);
		}
		return hashmap;
    }
    
    VarTypeList(GameDefinition game, VarDomainType class218, Language lang, int i) {
		super(game, lang, i);
		variableDomain = class218;
    }
    
    public int length/*method16883*/(int i) {
    	return 1149547019 * length;
    }
    
    public Object getDefaultValue(int i, byte i_1_) {
		VarType type = list(i, -1575900567);
		if (type == null || !type.isValidDefinition(2132790493)) {
		    return null;
		}
		return type.getDefaultValue(2092118276);
    }
    
    public int getValueEncodingLength/*method16884*/(Class254 class254, int i) {
		int i_2_ = 2;
		if (class254.value instanceof Integer) {
		    i_2_ += 4;
		} else if (class254.value instanceof Long) {
		    i_2_ += 8;
		} else if (class254.value instanceof String) {
		    i_2_ += Class467.method10740((String) class254.value, -18130900);
		} else if (class254.value instanceof Interface61) {
		    i_2_ += ((Interface61) class254.value).method436(1635732476);
		} else {
		    throw new IllegalStateException();
		}
		return i_2_;
    }
    
    public void encodeVarValue/*method16885*/(RSByteBuffer buffer, Class254 class254, int i) {
    	buffer.writeShort(class254.key * 623518843, -484048531);
		if (class254.value instanceof Integer) {
			buffer.writeInt(((Integer) class254.value).intValue(), 2101955646);
		} else if (class254.value instanceof Long) {
			buffer.method14627(((Long) class254.value).longValue());
		} else if (class254.value instanceof String) {
			buffer.method14630((String) class254.value, -1976935206);
		} else if (class254.value instanceof Interface61) {
		    ((Interface61) class254.value).method439(buffer, 218520079);
		} else {
		    throw new IllegalStateException();
		}
    }
    
    public abstract VarType method16886(int i);//method16886
    
    public Class254 decodeVarValue/*method16887*/(RSByteBuffer buffer, BaseVarType class217, int i) {
		int type = buffer.readUnsignedShort(1162222719);
		Class254 class254 = new Class254(type);
		Class<?> var_class = class217.javaClass;
		if (var_class == java.lang.Integer.class) {
		    class254.value = Integer.valueOf(buffer.readInt((byte) 44));
		} else if (var_class == java.lang.Long.class) {
		    class254.value = Long.valueOf(buffer.readLong((short) 6133));
		} else if (java.lang.String.class == var_class) {
		    class254.value = buffer.readJagString(88116760);
		} else if (Interface61.class.isAssignableFrom(var_class)) {
		    try {
				Interface61 interface61 = (Interface61) var_class.newInstance();
				interface61.method440(buffer, (byte) 120);
				class254.value = interface61;
		    } catch (InstantiationException instantiationexception) {
		    	/* empty */
		    } catch (IllegalAccessException illegalaccessexception) {
		    	/* empty */
		    }
		} else {
		    throw new IllegalStateException();
		}
		VarType class179 = list(type, -2063430386);
		if (!class179.isValidDefinition(102903333)
		    || class179.dataType.getVarBaseType(-553932184) != class217) {
		    return null;
		}
		return class254;
    }
    
    public abstract VarType method16888(int i);
    
    public int method16889() {
	return 1149547019 * length;
    }
    
    public abstract VarType method16890(int i);
    
    public Class254 decodeVarValue/*method16891*/(RSByteBuffer buffer, byte i) {
		int type = buffer.readUnsignedShort(1162222719);
		VarType class179 = this.list(type, -1466022496);
		if (!class179.isValidDefinition(939517587)) {
		    throw new IllegalStateException("");
		}
		Class254 class254 = new Class254(type);
		Class<?> var_class = class179.dataType.getVarBaseType(-1132516584).javaClass;
		if (java.lang.Integer.class == var_class) {
		    class254.value = Integer.valueOf(buffer.readInt((byte) 26));
		} else if (java.lang.Long.class == var_class) {
		    class254.value = Long.valueOf(buffer.readLong((short) 30358));
		} else if (java.lang.String.class == var_class) {
		    class254.value = buffer.readJagString(217503800);
		} else if (Interface61.class.isAssignableFrom(var_class)) {
		    try {
				Interface61 interface61 = (Interface61) var_class.newInstance();
				interface61.method440(buffer, (byte) 61);
				class254.value = interface61;
		    } catch (InstantiationException instantiationexception) {
		    	/* empty */
		    } catch (IllegalAccessException illegalaccessexception) {
		    	/* empty */
		    }
		} else {
		    throw new IllegalStateException();
		}
		return class254;
    }
    
    public abstract VarType list(int i, int i_5_);
    
    public static Map method16893(VarTypeList[] class199_sub2s) {
	if (null == class199_sub2s || 0 == class199_sub2s.length)
	    return null;
	HashMap hashmap = new HashMap();
	VarTypeList[] class199_sub2s_6_ = class199_sub2s;
	for (int i = 0; i < class199_sub2s_6_.length; i++) {
	    VarTypeList class199_sub2 = class199_sub2s_6_[i];
	    hashmap.put(class199_sub2.variableDomain, class199_sub2);
	}
	return hashmap;
    }
    
    public Object method170(int i) {
	VarType class179 = list(i, -1966216954);
	if (class179 == null || !class179.isValidDefinition(580547205))
	    return null;
	return class179.getDefaultValue(1905279022);
    }
    
    public Object method172(int i) {
	VarType class179 = list(i, -1531720105);
	if (class179 == null || !class179.isValidDefinition(-398734512))
	    return null;
	return class179.getDefaultValue(1772936395);
    }
    
    public Object method169(int i) {
	VarType class179 = list(i, -1489736175);
	if (class179 == null || !class179.isValidDefinition(-474295772))
	    return null;
	return class179.getDefaultValue(1736857566);
    }
    
    public Class254 method16894(RSByteBuffer class241_sub3, BaseVarType class217) {
	int i = class241_sub3.readUnsignedShort(1162222719);
	Class254 class254 = new Class254(i);
	Class var_class = class217.javaClass;
	if (var_class == java.lang.Integer.class)
	    class254.value
		= Integer.valueOf(class241_sub3.readInt((byte) 118));
	else if (var_class == java.lang.Long.class)
	    class254.value
		= Long.valueOf(class241_sub3.readLong((short) 11278));
	else if (java.lang.String.class == var_class)
	    class254.value = class241_sub3.readJagString(-396502038);
	else if (Interface61.class.isAssignableFrom(var_class)) {
	    try {
		Interface61 interface61
		    = (Interface61) var_class.newInstance();
		interface61.method440(class241_sub3, (byte) 80);
		class254.value = interface61;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	VarType class179 = list(i, -1742140379);
	if (!class179.isValidDefinition(1471662329)
	    || class179.dataType.getVarBaseType(-27519598) != class217)
	    return null;
	return class254;
    }
    
    public Class254 method16895(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedShort(1162222719);
	VarType class179 = list(i, -2059329775);
	if (!class179.isValidDefinition(1809248626))
	    throw new IllegalStateException("");
	Class254 class254 = new Class254(i);
	Class var_class
	    = class179.dataType.getVarBaseType(-550357847).javaClass;
	if (java.lang.Integer.class == var_class)
	    class254.value
		= Integer.valueOf(class241_sub3.readInt((byte) 25));
	else if (java.lang.Long.class == var_class)
	    class254.value
		= Long.valueOf(class241_sub3.readLong((short) 808));
	else if (java.lang.String.class == var_class)
	    class254.value = class241_sub3.readJagString(-1716470906);
	else if (Interface61.class.isAssignableFrom(var_class)) {
	    try {
		Interface61 interface61
		    = (Interface61) var_class.newInstance();
		interface61.method440(class241_sub3, (byte) 27);
		class254.value = interface61;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	return class254;
    }
    
    public Class254 method16896(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedShort(1162222719);
	VarType class179 = list(i, -1844578872);
	if (!class179.isValidDefinition(1222925935))
	    throw new IllegalStateException("");
	Class254 class254 = new Class254(i);
	Class var_class
	    = class179.dataType.getVarBaseType(-95726048).javaClass;
	if (java.lang.Integer.class == var_class)
	    class254.value
		= Integer.valueOf(class241_sub3.readInt((byte) 58));
	else if (java.lang.Long.class == var_class)
	    class254.value
		= Long.valueOf(class241_sub3.readLong((short) 27997));
	else if (java.lang.String.class == var_class)
	    class254.value = class241_sub3.readJagString(1595523104);
	else if (Interface61.class.isAssignableFrom(var_class)) {
	    try {
		Interface61 interface61
		    = (Interface61) var_class.newInstance();
		interface61.method440(class241_sub3, (byte) 66);
		class254.value = interface61;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	return class254;
    }
    
    static final void method16897(ClientScriptData class454, int i) {
	int i_7_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	if (!Class236.aClass103_2713.method2361())
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 3;
	else
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= Class241_Sub5_Sub9.aClass241_Sub9_11043
		      .aClass445_Sub20_8854.method7880(i_7_, 996762312);
    }
    
    static final void method16898(ClientScriptData class454, int i) {
	int i_8_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_8_, (byte) -33);
	InterfaceDefinition class35 = Class187.aClass35Array2203[i_8_ >> 16];
	Class95.setItemSwapEvent(class58, class35, class454, (byte) 1);
    }
    
    static final void setComponentFont/*method16899*/(InterfaceComponent component, InterfaceDefinition iFace,
				  ClientScriptData scriptData, int i) {
    	component.fontID
		    = (scriptData.integerStack[(scriptData.intStackPointer -= 1736754263) * 1482319719] * 18698933);
		WorldType.refreshComponent(component, 987077327);
		if (-1 == -389932081 * component.slot1 && !iFace.aBool374) {
		    Class416.method7491(component.componentHash * 445907013, 1601509716);
		}
    }
}
