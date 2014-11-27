/* Class521 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class521 implements Interface54
{
    int anInt6804;
    int anInt6805;
    
    public boolean method422(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578) {
	for (int i_0_ = 0; i_0_ < i && i_0_ < interface58s.length; i_0_++) {
	    Interface58 interface58 = interface58s[i_0_];
	    if (null != interface58
		&& (interface58.getKeyCode(-883962889)
		    == ((Class521) this).anInt6804 * 1629193619)
		&& (interface58.method433(2042773557)
		    == ((Class521) this).anInt6805 * -85549939))
		return true;
	}
	return false;
    }
    
    public boolean method423(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578, int i_1_) {
	for (int i_2_ = 0; i_2_ < i && i_2_ < interface58s.length; i_2_++) {
	    Interface58 interface58 = interface58s[i_2_];
	    if (null != interface58
		&& (interface58.getKeyCode(-883962889)
		    == ((Class521) this).anInt6804 * 1629193619)
		&& (interface58.method433(2042773557)
		    == ((Class521) this).anInt6805 * -85549939))
		return true;
	}
	return false;
    }
    
    public boolean method421(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578) {
	for (int i_3_ = 0; i_3_ < i && i_3_ < interface58s.length; i_3_++) {
	    Interface58 interface58 = interface58s[i_3_];
	    if (null != interface58
		&& (interface58.getKeyCode(-883962889)
		    == ((Class521) this).anInt6804 * 1629193619)
		&& (interface58.method433(2042773557)
		    == ((Class521) this).anInt6805 * -85549939))
		return true;
	}
	return false;
    }
    
    public boolean method420(Class241_Sub24 class241_sub24,
			     Interface58[] interface58s, int i,
			     Class578 class578) {
	for (int i_4_ = 0; i_4_ < i && i_4_ < interface58s.length; i_4_++) {
	    Interface58 interface58 = interface58s[i_4_];
	    if (null != interface58
		&& (interface58.getKeyCode(-883962889)
		    == ((Class521) this).anInt6804 * 1629193619)
		&& (interface58.method433(2042773557)
		    == ((Class521) this).anInt6805 * -85549939))
		return true;
	}
	return false;
    }
    
    Class521(int i, int i_5_) {
	((Class521) this).anInt6804 = i * -1675272037;
	((Class521) this).anInt6805 = i_5_ * 788432453;
    }
    
    static Class521 method11696(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) -59);
	int i_6_ = class241_sub3.readUnsignedByte((byte) -85);
	return new Class521(i, i_6_);
    }
    
    static Class521 method11697(RSByteBuffer class241_sub3) {
	int i = class241_sub3.readUnsignedByte((byte) -15);
	int i_7_ = class241_sub3.readUnsignedByte((byte) -71);
	return new Class521(i, i_7_);
    }
    
    static final void method11698(ClientScriptData class454, short i) {
	Class455 class455 = (((ClientScriptData) class454).aBool6246
			     ? ((ClientScriptData) class454).aClass455_6230
			     : ((ClientScriptData) class454).aClass455_6229);
	InterfaceComponent class58 = ((Class455) class455).aClass58_6248;
	InterfaceDefinition class35 = ((Class455) class455).aClass35_6249;
	Class571.method12543(class58, class35, class454, (byte) -50);
    }
    
    static final void method11699(ClientScriptData class454, int i) {
	((ClientScriptData) class454).integerStack
	    [(((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719 - 1]
	    = Class241_Sub5_Sub9.aClass241_Sub9_11043.aClass445_Sub34_8873
		  .method14853(568388014) ? 1 : 0;
    }
    
    static final void method11700(ClientScriptData class454, byte i) {
	int i_8_
	    = (((ClientScriptData) class454).integerStack
	       [(((ClientScriptData) class454).intStackPointer -= 1736754263) * 1482319719]);
	Class241_Sub39_Sub12 class241_sub39_sub12 = Class573.method12560(i_8_);
	if (class241_sub39_sub12 == null) {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= 0;
	} else {
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= (class241_sub39_sub12.anInt10929 * -1741001739
		   - class241_sub39_sub12.anInt10931 * 219733397);
	    ((ClientScriptData) class454).integerStack
		[((((ClientScriptData) class454).intStackPointer += 1736754263) * 1482319719
		  - 1)]
		= (1587526511 * class241_sub39_sub12.anInt10924
		   - -1017960145 * class241_sub39_sub12.anInt10930);
	}
    }
}
