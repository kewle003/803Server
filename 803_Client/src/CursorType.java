

/* Class631 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//package com.jagex.game.runetek6.config.cursortype;
public class CursorType {
    public int hotspotx;//anInt8048
    public int hotspoty;//anInt8049
    int graphic;//anInt8050
    CursorTypeList myList;//aClass605_8051
    
    void method13492(RSByteBuffer class241_sub3, int i) {
	if (1 == i)
	    graphic
		= class241_sub3.readBigSmart((byte) 27) * 166524517;
	else if (i == 2) {
	    hotspotx = class241_sub3.readUnsignedByte((byte) 43) * -313228695;
	    hotspoty = class241_sub3.readUnsignedByte((byte) -34) * -1689346225;
	}
    }
    
    public synchronized Class108 getCursor/*method13493*/(int i) {
		Class108 class108 = ((Class108) myList.cursorCache.get((long) (-2017080467 * graphic)));
		if (null != class108) {
		    return class108;
		}
		class108 = Class160.method3437(myList.sprites, graphic * -2017080467, 0);
		if (class108 != null) {
		    ((CursorTypeList) myList).cursorCache.put(class108, (long) (-2017080467 * graphic));
		}
		return class108;
    }
    
    void decode/*method13494*/(RSByteBuffer buffer, int opcode, byte i_0_) {
		if (1 == opcode) {
		    graphic = buffer.readBigSmart((byte) 120) * 166524517;
		} else if (opcode == 2) {
		    hotspotx = buffer.readUnsignedByte((byte) -12) * -313228695;
		    hotspoty = buffer.readUnsignedByte((byte) 5) * -1689346225;
		}
    }
    
    CursorType() {
	/* empty */
    }
    
    void method13495(RSByteBuffer class241_sub3) {
	for (;;) {
	    int i = class241_sub3.readUnsignedByte((byte) -38);
	    if (0 == i)
		break;
	    decode(class241_sub3, i, (byte) -116);
	}
    }
    
    public synchronized Class108 method13496() {
	Class108 class108
	    = ((Class108)
	       (((CursorTypeList) myList)
		    .cursorCache.get
		((long) (-2017080467 * graphic))));
	if (null != class108)
	    return class108;
	class108
	    = Class160.method3437((((CursorTypeList)
				    myList)
				   .sprites),
				  graphic * -2017080467,
				  0);
	if (class108 != null)
	    ((CursorTypeList) myList).cursorCache
		.put
		(class108, (long) (-2017080467 * graphic));
	return class108;
    }
    
    void decode/*method13497*/(RSByteBuffer buffer, int i) {
		for (;;) {
		    int opcode = buffer.readUnsignedByte((byte) -26);
		    if (0 == opcode) {
		    	break;
		    }
		    decode(buffer, opcode, (byte) -55);
		}
    }
    
    public synchronized Class108 method13498() {
	Class108 class108
	    = ((Class108)
	       (((CursorTypeList) myList)
		    .cursorCache.get
		((long) (-2017080467 * graphic))));
	if (null != class108)
	    return class108;
	class108
	    = Class160.method3437((((CursorTypeList)
				    myList)
				   .sprites),
				  graphic * -2017080467,
				  0);
	if (class108 != null)
	    ((CursorTypeList) myList).cursorCache
		.put
		(class108, (long) (-2017080467 * graphic));
	return class108;
    }
    
    static final void divideValues/*method13499*/(ClientScriptData scriptData, int i) {
    	scriptData.intStackPointer -= -821458770;
		int val1 = scriptData.integerStack[1482319719 * scriptData.intStackPointer];
		int val2 = scriptData.integerStack[1 + scriptData.intStackPointer * 1482319719];
		scriptData.integerStack[(scriptData.intStackPointer += 1736754263) * 1482319719 - 1]
		    = val1 / val2;
    }
    
    public static int method13500(int i, int i_4_, boolean bool, int i_5_) {
	int i_6_ = 0;
	Class241_Sub34 class241_sub34
	    = Class584.method12835(i, bool, 938708339);
	if (null == class241_sub34)
	    return 0;
	for (int i_7_ = 0;
	     i_7_ < ((Class241_Sub34) class241_sub34).anIntArray10085.length;
	     i_7_++) {
	    if (((Class241_Sub34) class241_sub34).anIntArray10085[i_7_] >= 0
		&& (JS5.itemDefLoader.list
		    (((Class241_Sub34) class241_sub34).anIntArray10085[i_7_],
		     (short) -8676)
		    .anInt7887) * 33836131 == i_4_)
		i_6_ += Class568.method12477(i, i_7_, bool, -2057603986);
	}
	return i_6_;
    }
}
