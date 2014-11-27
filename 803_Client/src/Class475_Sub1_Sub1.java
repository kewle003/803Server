/* Class475_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class475_Sub1_Sub1 extends Class475_Sub1
{
    public short aShort10716;
    public short aShort10717;
    public short aShort10718;
    public short aShort10719;
    public boolean aBool10720;
    byte aByte10721;
    int anInt10722 = 0;
    Class241_Sub43[] aClass241_Sub43Array10723 = new Class241_Sub43[4];
    
    boolean method14460(int i) {
	for (int i_0_ = aShort10717; i_0_ <= aShort10716; i_0_++) {
	    for (int i_1_ = aShort10718; i_1_ <= aShort10719; i_1_++) {
		int i_2_
		    = (i_0_
		       - ((Class552) aClass552_8744).anInt7128 * -985319149
		       + 1222806433 * ((Class552) aClass552_8744).anInt7165);
		if (i_2_ >= 0 && i_2_ < (((Class552) aClass552_8744)
					 .aBoolArrayArray7134).length) {
		    int i_3_ = (i_1_
				- (((Class552) aClass552_8744).anInt7160
				   * -1234452287)
				+ (((Class552) aClass552_8744).anInt7165
				   * 1222806433));
		    if (i_3_ >= 0
			&& i_3_ < (((Class552) aClass552_8744)
				   .aBoolArrayArray7134).length
			&& (((Class552) aClass552_8744).aBoolArrayArray7134
			    [i_2_][i_3_]))
			return true;
		}
	    }
	}
	return false;
    }
    
    Class475_Sub1_Sub1(Class552 class552, int i, int i_4_, int i_5_, int i_6_,
		       int i_7_, int i_8_, int i_9_, int i_10_, int i_11_,
		       boolean bool, byte i_12_) {
	super(class552);
	nodePlane = (byte) i;
	aByte8745 = (byte) i_4_;
	method10898(new Class287((float) i_5_, (float) i_6_, (float) i_7_));
	aShort10717 = (short) i_8_;
	aShort10716 = (short) i_9_;
	aShort10718 = (short) i_10_;
	aShort10719 = (short) i_11_;
	aBool10720 = bool;
	((Class475_Sub1_Sub1) this).aByte10721 = i_12_;
	for (int i_13_ = 0; i_13_ < 4; i_13_++)
	    ((Class475_Sub1_Sub1) this).aClass241_Sub43Array10723[i_13_]
		= null;
    }
    
    int method14458(Class241_Sub43[] class241_sub43s, int i) {
	if (aBool6394) {
	    ((Class475_Sub1_Sub1) this).anInt10722 = 0;
	    int i_14_ = Math.max(0, aShort10717);
	    int i_15_
		= Math.min((((Class552) aClass552_8744)
			    .aLongArrayArrayArray7177[nodePlane]).length - 1,
			   aShort10716);
	    int i_16_ = Math.max(0, aShort10718);
	    int i_17_ = Math.min((((Class552) aClass552_8744)
				  .aLongArrayArrayArray7177[nodePlane]
				  [i_14_]).length - 1,
				 aShort10719);
	while_43_:
	    for (/**/; i_14_ <= i_15_; i_14_++) {
		for (/**/; i_16_ <= i_17_; i_16_++) {
		    long l
			= (((Class552) aClass552_8744).aLongArrayArrayArray7177
			   [nodePlane][i_14_][i_16_]);
		    long l_18_ = 0L;
		while_42_:
		    while (l_18_ <= 48L) {
			int i_19_ = (int) (l >>> (int) l_18_ & 0xffffL);
			if (i_19_ <= 0)
			    break;
			Class544 class544 = (((Class552) aClass552_8744)
					     .aClass544Array7178[i_19_ - 1]);
			for (int i_20_ = 0;
			     i_20_ < -646891711 * (((Class475_Sub1_Sub1) this)
						   .anInt10722);
			     i_20_++) {
			    if ((((Class475_Sub1_Sub1) this)
				 .aClass241_Sub43Array10723[i_20_])
				== class544.aClass241_Sub43_7038) {
				l_18_ += 16L;
				continue while_42_;
			    }
			}
			((Class475_Sub1_Sub1) this)
			    .aClass241_Sub43Array10723
			    [(((Class475_Sub1_Sub1) this).anInt10722
			      += -1947772735) * -646891711 - 1]
			    = class544.aClass241_Sub43_7038;
			if (4 == (-646891711
				  * ((Class475_Sub1_Sub1) this).anInt10722))
			    break while_43_;
			l_18_ += 16L;
		    }
		}
	    }
	    for (int i_21_
		     = -646891711 * ((Class475_Sub1_Sub1) this).anInt10722;
		 i_21_ < 4; i_21_++)
		((Class475_Sub1_Sub1) this).aClass241_Sub43Array10723[i_21_]
		    = null;
	    if (0 != ((Class475_Sub1_Sub1) this).aByte10721) {
		int i_22_
		    = (aShort10717
		       - -985319149 * ((Class552) aClass552_8744).anInt7128);
		int i_23_
		    = (aShort10718
		       - -1234452287 * ((Class552) aClass552_8744).anInt7160);
		short i_24_;
		int i_25_;
		int i_26_;
		short i_27_;
		if (1 == ((Class475_Sub1_Sub1) this).aByte10721) {
		    if (i_23_ > i_22_) {
			i_24_ = aShort10717;
			i_25_ = aShort10718 - 1;
			i_26_ = 1 + aShort10717;
			i_27_ = aShort10718;
		    } else {
			i_24_ = aShort10717;
			i_25_ = aShort10718 + 1;
			i_26_ = aShort10717 - 1;
			i_27_ = aShort10718;
		    }
		} else if (i_23_ > -i_22_) {
		    i_24_ = aShort10717;
		    i_25_ = aShort10718 - 1;
		    i_26_ = aShort10717 - 1;
		    i_27_ = aShort10718;
		} else {
		    i_24_ = aShort10717;
		    i_25_ = aShort10718 + 1;
		    i_26_ = 1 + aShort10717;
		    i_27_ = aShort10718;
		}
		int i_28_ = 0;
	    while_45_:
		for (/**/;
		     (i_28_
		      < ((Class475_Sub1_Sub1) this).anInt10722 * -646891711);
		     i_28_++) {
		    long l
			= (((Class552) aClass552_8744).aLongArrayArrayArray7177
			   [nodePlane][i_24_][i_25_]);
		    while (l != 0L) {
			Class544 class544
			    = (((Class552) aClass552_8744).aClass544Array7178
			       [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if ((((Class475_Sub1_Sub1) this)
			     .aClass241_Sub43Array10723[i_28_])
			    == class544.aClass241_Sub43_7038)
			    continue while_45_;
		    }
		    l = (((Class552) aClass552_8744).aLongArrayArrayArray7177
			 [nodePlane][i_26_][i_27_]);
		    while (l != 0L) {
			Class544 class544
			    = (((Class552) aClass552_8744).aClass544Array7178
			       [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (class544.aClass241_Sub43_7038
			    == (((Class475_Sub1_Sub1) this)
				.aClass241_Sub43Array10723[i_28_]))
			    continue while_45_;
		    }
		    for (int i_29_ = i_28_;
			 i_29_ < (((Class475_Sub1_Sub1) this).anInt10722
				  * -646891711) - 1;
			 i_29_++)
			((Class475_Sub1_Sub1) this)
			    .aClass241_Sub43Array10723[i_29_]
			    = (((Class475_Sub1_Sub1) this)
			       .aClass241_Sub43Array10723[i_29_ + 1]);
		    ((Class475_Sub1_Sub1) this).anInt10722 -= -1947772735;
		}
	    }
	    aBool6394 = false;
	}
	for (int i_30_ = 0;
	     i_30_ < -646891711 * ((Class475_Sub1_Sub1) this).anInt10722;
	     i_30_++)
	    class241_sub43s[i_30_]
		= ((Class475_Sub1_Sub1) this).aClass241_Sub43Array10723[i_30_];
	return -646891711 * ((Class475_Sub1_Sub1) this).anInt10722;
    }
    
    boolean method14496(Class103 class103, byte i) {
	return (aClass552_8744.aClass550_7131.method12046
		(aByte8745, aShort10717, aShort10716, aShort10718, aShort10719,
		 method14457(class103, 1550401833)));
    }
    
    void method16999(int i) {
	/* empty */
    }
    
    void method17000() {
	/* empty */
    }
    
    void method17001() {
	/* empty */
    }
    
    void method17002() {
	/* empty */
    }
    
    void method17003() {
	/* empty */
    }
    
    boolean method14462(Class103 class103) {
	return (aClass552_8744.aClass550_7131.method12046
		(aByte8745, aShort10717, aShort10716, aShort10718, aShort10719,
		 method14457(class103, 1616216518)));
    }
    
    boolean method14490(Class103 class103) {
	return (aClass552_8744.aClass550_7131.method12046
		(aByte8745, aShort10717, aShort10716, aShort10718, aShort10719,
		 method14457(class103, 1894726893)));
    }
    
    int method14489(Class241_Sub43[] class241_sub43s) {
	if (aBool6394) {
	    ((Class475_Sub1_Sub1) this).anInt10722 = 0;
	    int i = Math.max(0, aShort10717);
	    int i_31_
		= Math.min((((Class552) aClass552_8744)
			    .aLongArrayArrayArray7177[nodePlane]).length - 1,
			   aShort10716);
	    int i_32_ = Math.max(0, aShort10718);
	    int i_33_ = Math.min((((Class552) aClass552_8744)
				  .aLongArrayArrayArray7177[nodePlane]
				  [i]).length - 1,
				 aShort10719);
	while_47_:
	    for (/**/; i <= i_31_; i++) {
		for (/**/; i_32_ <= i_33_; i_32_++) {
		    long l = (((Class552) aClass552_8744)
			      .aLongArrayArrayArray7177[nodePlane][i][i_32_]);
		    long l_34_ = 0L;
		while_46_:
		    while (l_34_ <= 48L) {
			int i_35_ = (int) (l >>> (int) l_34_ & 0xffffL);
			if (i_35_ <= 0)
			    break;
			Class544 class544 = (((Class552) aClass552_8744)
					     .aClass544Array7178[i_35_ - 1]);
			for (int i_36_ = 0;
			     i_36_ < -646891711 * (((Class475_Sub1_Sub1) this)
						   .anInt10722);
			     i_36_++) {
			    if ((((Class475_Sub1_Sub1) this)
				 .aClass241_Sub43Array10723[i_36_])
				== class544.aClass241_Sub43_7038) {
				l_34_ += 16L;
				continue while_46_;
			    }
			}
			((Class475_Sub1_Sub1) this)
			    .aClass241_Sub43Array10723
			    [(((Class475_Sub1_Sub1) this).anInt10722
			      += -1947772735) * -646891711 - 1]
			    = class544.aClass241_Sub43_7038;
			if (4 == (-646891711
				  * ((Class475_Sub1_Sub1) this).anInt10722))
			    break while_47_;
			l_34_ += 16L;
		    }
		}
	    }
	    for (int i_37_
		     = -646891711 * ((Class475_Sub1_Sub1) this).anInt10722;
		 i_37_ < 4; i_37_++)
		((Class475_Sub1_Sub1) this).aClass241_Sub43Array10723[i_37_]
		    = null;
	    if (0 != ((Class475_Sub1_Sub1) this).aByte10721) {
		int i_38_
		    = (aShort10717
		       - -985319149 * ((Class552) aClass552_8744).anInt7128);
		int i_39_
		    = (aShort10718
		       - -1234452287 * ((Class552) aClass552_8744).anInt7160);
		short i_40_;
		int i_41_;
		int i_42_;
		short i_43_;
		if (1 == ((Class475_Sub1_Sub1) this).aByte10721) {
		    if (i_39_ > i_38_) {
			i_40_ = aShort10717;
			i_41_ = aShort10718 - 1;
			i_42_ = 1 + aShort10717;
			i_43_ = aShort10718;
		    } else {
			i_40_ = aShort10717;
			i_41_ = aShort10718 + 1;
			i_42_ = aShort10717 - 1;
			i_43_ = aShort10718;
		    }
		} else if (i_39_ > -i_38_) {
		    i_40_ = aShort10717;
		    i_41_ = aShort10718 - 1;
		    i_42_ = aShort10717 - 1;
		    i_43_ = aShort10718;
		} else {
		    i_40_ = aShort10717;
		    i_41_ = aShort10718 + 1;
		    i_42_ = 1 + aShort10717;
		    i_43_ = aShort10718;
		}
		int i_44_ = 0;
	    while_49_:
		for (/**/;
		     (i_44_
		      < ((Class475_Sub1_Sub1) this).anInt10722 * -646891711);
		     i_44_++) {
		    long l
			= (((Class552) aClass552_8744).aLongArrayArrayArray7177
			   [nodePlane][i_40_][i_41_]);
		    while (l != 0L) {
			Class544 class544
			    = (((Class552) aClass552_8744).aClass544Array7178
			       [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if ((((Class475_Sub1_Sub1) this)
			     .aClass241_Sub43Array10723[i_44_])
			    == class544.aClass241_Sub43_7038)
			    continue while_49_;
		    }
		    l = (((Class552) aClass552_8744).aLongArrayArrayArray7177
			 [nodePlane][i_42_][i_43_]);
		    while (l != 0L) {
			Class544 class544
			    = (((Class552) aClass552_8744).aClass544Array7178
			       [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (class544.aClass241_Sub43_7038
			    == (((Class475_Sub1_Sub1) this)
				.aClass241_Sub43Array10723[i_44_]))
			    continue while_49_;
		    }
		    for (int i_45_ = i_44_;
			 i_45_ < (((Class475_Sub1_Sub1) this).anInt10722
				  * -646891711) - 1;
			 i_45_++)
			((Class475_Sub1_Sub1) this)
			    .aClass241_Sub43Array10723[i_45_]
			    = (((Class475_Sub1_Sub1) this)
			       .aClass241_Sub43Array10723[i_45_ + 1]);
		    ((Class475_Sub1_Sub1) this).anInt10722 -= -1947772735;
		}
	    }
	    aBool6394 = false;
	}
	for (int i = 0;
	     i < -646891711 * ((Class475_Sub1_Sub1) this).anInt10722; i++)
	    class241_sub43s[i]
		= ((Class475_Sub1_Sub1) this).aClass241_Sub43Array10723[i];
	return -646891711 * ((Class475_Sub1_Sub1) this).anInt10722;
    }
    
    boolean method14486() {
	for (int i = aShort10717; i <= aShort10716; i++) {
	    for (int i_46_ = aShort10718; i_46_ <= aShort10719; i_46_++) {
		int i_47_
		    = (i - ((Class552) aClass552_8744).anInt7128 * -985319149
		       + 1222806433 * ((Class552) aClass552_8744).anInt7165);
		if (i_47_ >= 0 && i_47_ < (((Class552) aClass552_8744)
					   .aBoolArrayArray7134).length) {
		    int i_48_ = (i_46_
				 - (((Class552) aClass552_8744).anInt7160
				    * -1234452287)
				 + (((Class552) aClass552_8744).anInt7165
				    * 1222806433));
		    if (i_48_ >= 0
			&& i_48_ < (((Class552) aClass552_8744)
				    .aBoolArrayArray7134).length
			&& (((Class552) aClass552_8744).aBoolArrayArray7134
			    [i_47_][i_48_]))
			return true;
		}
	    }
	}
	return false;
    }
}
