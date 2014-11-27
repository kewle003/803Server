/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class78
{
    int[] anIntArray1132;
    static Class351_Sub1 aClass351_Sub1_1133;
    static Class563 aClass563_1134;
    
    public int method1777(int i) {
	int i_0_ = (anIntArray1132.length >> 1) - 1;
	int i_1_ = i & i_0_;
	for (;;) {
	    int i_2_ = anIntArray1132[i_1_ + i_1_ + 1];
	    if (i_2_ == -1)
		return -1;
	    if (i == anIntArray1132[i_1_ + i_1_])
		return i_2_;
	    i_1_ = i_1_ + 1 & i_0_;
	}
    }
    
    public int getIndex/*method1778*/(int identifier, byte i_3_) {
		int i_4_ = (anIntArray1132.length >> 1) - 1;
		int i_5_ = identifier & i_4_;
		for (;;) {
		    int index = anIntArray1132[i_5_ + i_5_ + 1];
		    if (index == -1) {
				return -1;
			}
		    if (identifier == anIntArray1132[i_5_ + i_5_]) {
				return index;
			}
		    i_5_ = i_5_ + 1 & i_4_;
		}
    }
    
    public Class78(int[] is) {
		int i;
		for (i = 1; i <= is.length + (is.length >> 1); i <<= 1) {
		    /* empty */
		}
		anIntArray1132 = new int[i + i];
		for (int i_7_ = 0; i_7_ < i + i; i_7_++)
		    anIntArray1132[i_7_] = -1;
		for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
		    int i_9_;
		    for (i_9_ = is[i_8_] & i - 1;
		    		-1 != anIntArray1132[1 + (i_9_ + i_9_)];
		    		i_9_ = i_9_ + 1 & i - 1) {
		    	/* empty */
		    }
		    anIntArray1132[i_9_ + i_9_] = is[i_8_];
		    anIntArray1132[i_9_ + i_9_ + 1] = i_8_;
		}
    }
    
    static final int method1779(int i, int i_10_, byte i_11_) {
	int i_12_
	    = (Class334.method6067(i + 45365, 91923 + i_10_, 4, -1918497136)
	       - 128
	       + ((Class334.method6067(i + 10294, 37821 + i_10_, 2, 991084744)
		   - 128)
		  >> 1)
	       + (Class334.method6067(i, i_10_, 1, 60376423) - 128 >> 2));
	i_12_ = 35 + (int) ((double) i_12_ * 0.3);
	if (i_12_ < 10)
	    i_12_ = 10;
	else if (i_12_ > 60)
	    i_12_ = 60;
	return i_12_;
    }
    
    static void method1780(int i) {
	if (Class185.anInt2190 * -736653731 > 0) {
	    int i_13_ = 0;
	    for (int i_14_ = 0;
		 i_14_ < Exception_Sub3.aStringArray10694.length; i_14_++) {
		if ((Exception_Sub3.aStringArray10694[i_14_].indexOf("--> ")
		     != -1)
		    && ++i_13_ == Class185.anInt2190 * -736653731) {
		    Class185.aString2181
			= (Exception_Sub3.aStringArray10694[i_14_].substring
			   (Exception_Sub3.aStringArray10694[i_14_]
				.indexOf('>') + 2));
		    break;
		}
	    }
	} else
	    Class185.aString2181 = "";
    }
    
    static void method1781(File file, int i) {
	Class592.aFile7628 = file;
	if (!Class592.aFile7628.exists())
	    throw new RuntimeException("");
	Class592.aBool7629 = true;
    }
    
    static final void setVarcompFilled/*method1782*/(ClientScriptData scriptData, int i) {
		Class455 class455 = (scriptData.aBool6246 ? scriptData.aClass455_6230 : scriptData.aClass455_6229);
		InterfaceComponent component = ((Class455) class455).aClass58_6248;
		InterfaceDefinition iFace = ((Class455) class455).aClass35_6249;
		Class249.setComponentFilled(component, iFace, scriptData, (byte) 19);
    }
    
    static final void method1783(ClientScriptData class454, int i) {
		Class455 class455 = (((ClientScriptData) class454).aBool6246
				     ? ((ClientScriptData) class454).aClass455_6230
				     : ((ClientScriptData) class454).aClass455_6229);
		InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
		InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
		Class581.method12761(class58, class35, class454, 355524037);
    }
    
    static final void method1784(ClientScriptData class454, int i) {
	int i_15_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	InterfaceComponent class58 = Js5ConfigGroup.getInterfaceComponent(i_15_, (byte) -65);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 908888989 * class58.fontID;
    }
    
    static final void method1785(ClientScriptData class454, int i) {
	JSFunction.aClass348_5372.method6212((byte) 0);
    }
}
