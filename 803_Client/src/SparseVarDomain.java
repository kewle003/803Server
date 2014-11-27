/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config.vartype;
public class SparseVarDomain implements VarDomain {
    public Interface46 varValues;//anInterface46_1618
    static int anInt1619;
    
    public void dummyMethod90(VarType class179, Object object) {
	varValues.method335(class179.id * 414229387, object,
				     (byte) -35);
    }
    
    SparseVarDomain(VarTypeList class199_sub2, Class416 class416) {
    	varValues = class416;
    }
    
    public int getVarValueInt(VarType class179, int i) {
    	return varValues.method343(class179.id * 414229387, 1322180213);
    }
    
    public Object dummyMethod73(VarType class179) {
    	return varValues.method344(class179.id * 414229387, 1980057332);
    }
    
    public long getVarValueLong(VarType class179, byte i) {
    	return varValues.method331(414229387 * class179.id, -2128355894);
    }
    
    public void setVarValueLong(VarType class179, long l) {
    	varValues.method346(class179.id * 414229387, l);
    }
    
    public int dummyMethod72(VarBitType class316) {
    	return class316.getVarbitValue(getVarValueInt(class316.baseVar, -1176718409),
				   1610067707);
    }
    
    public void setVarValue(VarType class179, Object object, byte i) {
    	varValues.method335(class179.id * 414229387, object, (byte) 1);
    }
    
    public int dummyMethod71(VarBitType class316) {
    	return class316.getVarbitValue(getVarValueInt(class316.baseVar, -592347051),
				   944612037);
    }
    
    public void setVarBitValue(VarBitType class316, int i, int i_0_) throws VarBitOverflowException {
    	setVarValueInt(class316.baseVar, 
    			class316.setVarbitValue(getVarValueInt(class316.baseVar, -131469353), i, (byte) 40),
    			-832212667);
    }
    
    public int dummyMethod67(VarType class179) {
    	return varValues.method343(class179.id * 414229387, 1322180213);
    }
    
    public void setVarValueInt(VarType class179, int i, int i_1_) {
    	varValues.method330(414229387 * class179.id, i, -172798398);
    }
    
    public int dummyMethod65(VarType class179) {
    	return varValues.method343(class179.id * 414229387, 1322180213);
    }
    
    public int dummyMethod70(VarType class179) {
    	return varValues.method343(class179.id * 414229387, 1322180213);
    }
    
    public int getVarBitValue(VarBitType class316, short i) {
    	return class316.getVarbitValue(getVarValueInt(class316.baseVar, -566141866), 1642795902);
    }
    
    public void dummyMethod76(VarBitType class316, int i) throws VarBitOverflowException {
    	setVarValueInt(class316.baseVar,
    			class316.setVarbitValue(getVarValueInt(class316.baseVar,
					      -1885619846),
				     i, (byte) 7),
				-1310727628);
    }
    
    public void dummyMethod83(VarType class179, int i) {
    	varValues.method330(414229387 * class179.id, i, -574303775);
    }
    
    public void dummyMethod82(VarType class179, int i) {
    	varValues.method330(414229387 * class179.id, i, -1279848710);
    }
    
    public void dummyMethod84(VarType class179, int i) {
    	varValues.method330(414229387 * class179.id, i, -2093385878);
    }
    
    public long method85(VarType class179) {
    	return varValues.method331(414229387 * class179.id, -2119939123);
    }
    
    public long method86(VarType class179) {
    	return varValues.method331(414229387 * class179.id, -2119129152);
    }
    
    public long method87(VarType class179) {
    	return varValues.method331(414229387 * class179.id, -2125138849);
    }
    
    public void method74(VarType class179, long l) {
    	varValues.method346(class179.id * 414229387, l);
    }
    
    public void method88(VarType class179, long l) {
    	varValues.method346(class179.id * 414229387, l);
    }
    
    public void method89(VarType class179, long l) {
    	varValues.method346(class179.id * 414229387, l);
    }
    
    public int dummyMethod66(VarType class179) {
    	return varValues.method343(class179.id * 414229387,
					    1322180213);
    }
    
    public Object getVarValue(VarType class179, int i) {
    	return varValues.method344(class179.id * 414229387, 1807928283);
    }
    
    public void method91(VarBitType class316, int i) throws VarBitOverflowException {
    	setVarValueInt(class316.baseVar,
		 class316.setVarbitValue(getVarValueInt(class316.baseVar,
					      -2001570557),
				     i, (byte) 106),
		 415196257);
    }
    
    public SparseVarDomain(VarTypeList class199_sub2) {
    	this(class199_sub2, new Class416(class199_sub2));
    }
    
    static void method3105(byte i) {
	if (null == Class474.anIntArray6382)
	    Class474.anIntArray6382 = new int[65536];
	else
	    return;
	double d = 0.7 + (Math.random() * 0.03 - 0.015);
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < 512; i_3_++) {
	    float f = (0.0078125F + (float) (i_3_ >> 3) / 64.0F) * 360.0F;
	    float f_4_ = 0.0625F + (float) (i_3_ & 0x7) / 8.0F;
	    for (int i_5_ = 0; i_5_ < 128; i_5_++) {
		float f_6_ = (float) i_5_ / 128.0F;
		float f_7_ = 0.0F;
		float f_8_ = 0.0F;
		float f_9_ = 0.0F;
		float f_10_ = f / 60.0F;
		int i_11_ = (int) f_10_;
		int i_12_ = i_11_ % 6;
		float f_13_ = f_10_ - (float) i_11_;
		float f_14_ = f_6_ * (1.0F - f_4_);
		float f_15_ = (1.0F - f_4_ * f_13_) * f_6_;
		float f_16_ = (1.0F - (1.0F - f_13_) * f_4_) * f_6_;
		if (0 == i_12_) {
		    f_7_ = f_6_;
		    f_8_ = f_16_;
		    f_9_ = f_14_;
		} else if (i_12_ == 1) {
		    f_7_ = f_15_;
		    f_8_ = f_6_;
		    f_9_ = f_14_;
		} else if (2 == i_12_) {
		    f_7_ = f_14_;
		    f_8_ = f_6_;
		    f_9_ = f_16_;
		} else if (3 == i_12_) {
		    f_7_ = f_14_;
		    f_8_ = f_15_;
		    f_9_ = f_6_;
		} else if (4 == i_12_) {
		    f_7_ = f_16_;
		    f_8_ = f_14_;
		    f_9_ = f_6_;
		} else if (5 == i_12_) {
		    f_7_ = f_6_;
		    f_8_ = f_14_;
		    f_9_ = f_15_;
		}
		f_7_ = (float) Math.pow((double) f_7_, d);
		f_8_ = (float) Math.pow((double) f_8_, d);
		f_9_ = (float) Math.pow((double) f_9_, d);
		int i_17_ = (int) (f_7_ * 256.0F);
		int i_18_ = (int) (256.0F * f_8_);
		int i_19_ = (int) (f_9_ * 256.0F);
		int i_20_ = (i_18_ << 8) + ((i_17_ << 16) + -16777216) + i_19_;
		Class474.anIntArray6382[i_2_++] = i_20_;
	    }
	}
    }
    
    static final void method3106(ClientScriptData class454, int i) {
	((ClientScriptData) class454).objectStackPointer -= -657148817;
	Class213.method4310
	    ((String) (((ClientScriptData) class454).objectStack
		       [-290357331 * ((ClientScriptData) class454).objectStackPointer]),
	     (String) (((ClientScriptData) class454).objectStack
		       [((ClientScriptData) class454).objectStackPointer * -290357331 + 1]),
	     (String) (((ClientScriptData) class454).objectStack
		       [2 + -290357331 * ((ClientScriptData) class454).objectStackPointer]),
	     ((((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719])
	      == 1),
	     true, 1272315807);
    }
    
    static final void method3107(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub12_8863
		  .method14211(870359461);
    }
    
    static void method3108(InterfaceComponent component, int i, int i_21_, boolean bool, byte i_22_) {
		int i_23_ = 439139681 * component.anInt850;
		int i_24_ = component.scrollMinY * 1463495207;
		if (component.resizeModeX == 0) {
			component.anInt850 = component.fixedWidth * -717707035;
		} else if (component.resizeModeX == 1) {
			component.anInt850 = 1360045729 * (i - component.fixedWidth * -393932859);
		} else if (2 == component.resizeModeX) {
			component.anInt850 = 1360045729 * (i * (component.fixedWidth * -393932859) >> 14);
		}
		if (0 == component.resizeModeY) {
			component.scrollMinY = 595831963 * component.fixedHeight;
		} else if (component.resizeModeY == 1) {
			component.scrollMinY = (i_21_ - 2014951837 * component.fixedHeight) * -2030459497;
		} else if (component.resizeModeY == 2) {
			component.scrollMinY = (component.fixedHeight * 2014951837 * i_21_ >> 14) * -2030459497;
		}
		if (component.resizeModeX == 4) {
			component.anInt850 = (component.anInt986 * -961359793
					* (1463495207 * component.scrollMinY)
					/ (756288693 * component.anInt902) * 1360045729);
		}
		if (component.resizeModeY == 4) {
			component.scrollMinY = -2030459497 * (756288693 * component.anInt902
					 * (component.anInt850 * 439139681)
					 / (-961359793 * component.anInt986));
		}
		if (client.aBool8403 && (client.method13624(component).anInt9007 * -438085493 != 0
				|| 0 == component.componentType * -1579470857)) {
		    if (1463495207 * component.scrollMinY < 5
		    		&& 439139681 * component.anInt850 < 5) {
		    	component.scrollMinY = -1562362893;
		    	component.anInt850 = -1789705947;
		    } else {
				if (1463495207 * component.scrollMinY <= 0) {
					component.scrollMinY = -1562362893;
				}
				if (439139681 * component.anInt850 <= 0) {
					component.anInt850 = -1789705947;
				}
		    }
		}
		if (component.anInt1002 * 1551710807 == InterfaceComponent.anInt814 * -736017553) {
		    client.aClass58_8474 = component;
		}
		if (bool && component.anObjectArray983 != null
				&& (i_23_ != 439139681 * component.anInt850
				|| component.scrollMinY * 1463495207 != i_24_)) {
		    ClientScriptCaller class241_sub14 = new ClientScriptCaller();
		    class241_sub14.component = component;
		    class241_sub14.paramaters = component.anObjectArray983;
		    client.aClass429_8541.addNode(class241_sub14, (short) -8067);
		}
    }
    
    static final void method3109(InterfaceComponent class58, InterfaceDefinition class35,
				 ClientScriptData class454, int i) {
	class58.method1515(230290045);
    }
    
    static boolean method3110(byte i) {
	return AnimationDefinitionLoader.method12315(ClanChannelUser.aClass499_5588.aClass533_6558,
				    (byte) 33);
    }
}
