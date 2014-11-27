/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public abstract class Class354
{
    int anInt5445;
    Class356 this$0;
    int anInt5446;
    
    abstract void method6432(Graphics graphics);
    
    abstract void method6433(Graphics graphics, byte i);
    
    Class354(Class356 class356, int i, int i_0_) {
	((Class354) this).this$0 = class356;
	((Class354) this).anInt5446 = -288976277 * i;
	((Class354) this).anInt5445 = -870547527 * i_0_;
    }
    
    static final void method6434(ClientScriptData class454, int i) {
	((ClientScriptData) class454).intStackPointer -= 915295493;
	int i_1_ = (((ClientScriptData) class454).integerStack
		    [((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_2_ = (((ClientScriptData) class454).integerStack
		    [1 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	int i_3_ = (((ClientScriptData) class454).integerStack
		    [2 + ((ClientScriptData) class454).intStackPointer * 1482319719]);
	Class81 class81 = Class518.method11658(i_1_, 2064021171);
	float f = (float) i_2_;
	if (Class81.aClass81_1148 == class81
	    || Class81.aClass81_1146 == class81
	    || Class81.aClass81_1147 == class81)
	    f = Class282.method5490(i_2_);
	Class241_Sub39_Sub6_Sub1 class241_sub39_sub6_sub1
	    = new Class241_Sub39_Sub6_Sub1(Class445_Sub16
					       .aClass351_Sub1_8660
					       .method16835(-1560570406),
					   class81, f, (float) i_3_ / 1000.0F);
	Class445_Sub16.aClass351_Sub1_8660.method6276(class241_sub39_sub6_sub1,
						      1050335243);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = class241_sub39_sub6_sub1.anInt10841 * 2083383801;
    }
    
    static String method6435(int i, Language class437, GraphicsDefaults class513,
			     int i_4_) {
	if (i < 100000)
	    return new StringBuilder().append
		       (ScriptVarType.method5845(-905822813 * class513.anInt6724,
					    1651212355))
		       .append
		       (i).append
		       (ItemDefinition.aString7956).toString();
	if (i < 10000000)
	    return new StringBuilder().append
		       (ScriptVarType.method5845(class513.anInt6728 * -859918135,
					    1550783765))
		       .append
		       (i / 1000).append
		       (ClientMessage.THOUSAND_SHORT.getLocalisedMessage(class437,
							    (short) 31155))
		       .append
		       (ItemDefinition.aString7956).toString();
	return new StringBuilder().append
		   (ScriptVarType.method5845(377039413 * class513.anInt6729,
					132147781))
		   .append
		   (i / 1000000).append
		   (ClientMessage.MILLION_SHORT.getLocalisedMessage(class437,
							(short) 32758))
		   .append
		   (ItemDefinition.aString7956).toString();
    }
}
