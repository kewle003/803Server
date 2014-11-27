/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

class Class126 implements Interface7
{
    SoundManager this$0;
    
    void method3005(Interface52 interface52) {
	Iterator iterator
	    = ((Class126) this).this$0.method1217((byte) 98).iterator();
	while (iterator.hasNext()) {
	    Class221 class221 = (Class221) iterator.next();
	    if (class221.method4418((byte) 54) == interface52) {
		class221.method4390(-616007109);
		iterator.remove();
	    }
	}
    }
    
    void method3006(Interface52 interface52, int i) {
	Iterator iterator
	    = ((Class126) this).this$0.method1217((byte) 24).iterator();
	while (iterator.hasNext()) {
	    Class221 class221 = (Class221) iterator.next();
	    if (class221.method4418((byte) 77) == interface52) {
		class221.method4390(-145034433);
		iterator.remove();
	    }
	}
    }
    
    public void method47(Object object) {
	method3006((Interface52) object, 34105131);
    }
    
    public void method46(Object object) {
	method3006((Interface52) object, -1031057179);
    }
    
    public void method45(Object object, int i) {
	method3006((Interface52) object, 261742808);
    }
    
    Class126(SoundManager class49) {
	((Class126) this).this$0 = class49;
    }
    
    void method3007(Interface52 interface52) {
	Iterator iterator
	    = ((Class126) this).this$0.method1217((byte) 53).iterator();
	while (iterator.hasNext()) {
	    Class221 class221 = (Class221) iterator.next();
	    if (class221.method4418((byte) 89) == interface52) {
		class221.method4390(1468489281);
		iterator.remove();
	    }
	}
    }
    
    public static int method3008(CharSequence charsequence, int i) {
	int i_0_ = charsequence.length();
	int i_1_ = 0;
	for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
	    char c = charsequence.charAt(i_2_);
	    if (c <= '\u007f')
		i_1_++;
	    else if (c <= '\u07ff')
		i_1_ += 2;
	    else
		i_1_ += 3;
	}
	return i_1_;
    }
    
    static final void setMainChannel/*method3009*/(ClientScriptData scriptData, int i) {
		if (null != Class324.mainClanChannel) {
			scriptData.integerStack[((scriptData.intStackPointer += 1736754263) * 1482319719 - 1)]
					= 1;
			scriptData.currentChannel = Class324.mainClanChannel;
		} else {
			scriptData.integerStack[((scriptData.intStackPointer += 1736754263) * 1482319719 - 1)]
					= 0;
		}
    }
    
    static final void method3010(ClientScriptData class454, int i) {
	int i_3_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = (JS5.itemDefLoader.list(i_3_, (short) -8883)
	       .multistacksize) * -441412009;
    }
    
    static final void method3011(ClientScriptData class454, int i) {
	int i_4_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub4_8850
		  .method7880(i_4_, 996762312);
    }
}
