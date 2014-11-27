/* Class105_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class105_Sub2 extends Class105
{
    protected static final int anInt9476 = 4;
    
    public abstract void method15583(int i, Interface4 interface4);
    
    public abstract void method15584(Interface5 interface5);
    
    public abstract void method15585(int i, Interface4 interface4);
    
    public abstract boolean method15586();
    
    public abstract void method15587(int i, int i_0_, int i_1_, int i_2_,
				     int i_3_, int i_4_, boolean bool,
				     boolean bool_5_);
    
    public abstract void method15588(int i, Interface4 interface4);
    
    public abstract void method15589(int i, Interface4 interface4);
    
    Class105_Sub2() {
	/* empty */
    }
    
    public abstract void method15590(Interface5 interface5);
    
    public abstract void method15591(Interface5 interface5);
    
    public abstract void method15592(Interface5 interface5);
    
    public abstract void method15593(Interface5 interface5);
    
    public abstract void method15594(Interface5 interface5);
    
    public abstract void method15595(int i, int i_6_, int i_7_, int i_8_,
				     int i_9_, int i_10_, boolean bool,
				     boolean bool_11_);
    
    public abstract boolean method15596();
    
    public abstract void method15597(int i, int i_12_, int i_13_, int i_14_,
				     int i_15_, int i_16_, boolean bool,
				     boolean bool_17_);
    
    public abstract void method15598(int i, Interface4 interface4);
    
    public abstract void method15599(int i, int i_18_, int i_19_, int i_20_,
				     int i_21_, int i_22_, boolean bool,
				     boolean bool_23_);
    
    public abstract void method15600(int i, int i_24_, int i_25_, int i_26_,
				     int i_27_, int i_28_, boolean bool,
				     boolean bool_29_);
    
    static Class525[] method15601(int i) {
	return (new Class525[]
		{ Class525.aClass525_6826, Class525.aClass525_6824,
		  Class525.aClass525_6825 });
    }
    
    public static int method15602(byte[] is, int i, CharSequence charsequence,
				  int i_30_) {
	int i_31_ = charsequence.length();
	int i_32_ = i;
	for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
	    int i_34_ = charsequence.charAt(i_33_);
	    if (i_34_ <= 127)
		is[i_32_++] = (byte) i_34_;
	    else if (i_34_ <= 2047) {
		is[i_32_++] = (byte) (0xc0 | i_34_ >> 6);
		is[i_32_++] = (byte) (0x80 | i_34_ & 0x3f);
	    } else {
		is[i_32_++] = (byte) (0xe0 | i_34_ >> 12);
		is[i_32_++] = (byte) (0x80 | i_34_ >> 6 & 0x3f);
		is[i_32_++] = (byte) (0x80 | i_34_ & 0x3f);
	    }
	}
	return i_32_ - i;
    }
    
    static final void method15603(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = 100;
    }
}
